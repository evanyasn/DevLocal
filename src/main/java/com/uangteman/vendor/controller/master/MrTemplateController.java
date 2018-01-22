package com.uangteman.vendor.controller.master;

import com.uangteman.common.model.constant.StateType;
import com.uangteman.common.utils.rest.RestResponse;
import com.uangteman.common.utils.rest.RestResultCode;
import com.uangteman.vendor.constant.ConstantRestApi;
import com.uangteman.vendor.model.MrTemplate;
import com.uangteman.vendor.service.master.MrTemplateService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = ConstantRestApi.API_MASTER_TEMPLATE)
public class MrTemplateController {
    protected static final Logger logger = LoggerFactory.getLogger(MrTemplate.class);

    @Autowired
    private MrTemplateService service;

    @ApiOperation(value = "Get all data MrTemplate", notes = "Notes goes here...")
    @ApiResponses(value = {
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_DATA_NOT_FOUND, message = ConstantRestApi.RESPONSE_MESSAGE_DATA_NOT_FOUND),
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR)})
    @GetMapping
    public RestResponse findAll(
            @RequestParam(value = "pageable", defaultValue = "true", required = true) boolean pageable,
            @RequestParam(value = "page", defaultValue = "0", required = false) int page,
            @RequestParam(value = "size", defaultValue = "10", required = false) int size,
            @RequestParam(value = "order", defaultValue = "ASC", required = false) Sort.Direction direction,
            @RequestParam(value = "sort", defaultValue = "id", required = false) String sortProperty) {

        List<MrTemplate> list = new ArrayList<>();

        if (pageable) {
            Page<MrTemplate> result = service
                    .findAllAndStateNot(new PageRequest(page, size, new Sort(direction, sortProperty)), StateType.D);
            list.addAll(result.getContent());
        } else {
            List<MrTemplate> result = service.findAllAndStateNot(StateType.D);
            list.addAll(result);
        }

        if (list.size() > 0) {
            return RestResponse.ok(list);
        } else {
            return RestResponse.ok(RestResultCode.DATA_NOT_FOUND);
        }
    }

    @ApiOperation(value = "Get all data MrTemplate by EXAMPLE", notes = "Notes goes here...")
    @ApiResponses(value = {
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_DATA_NOT_FOUND, message = ConstantRestApi.RESPONSE_MESSAGE_DATA_NOT_FOUND),
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR)})
    @PostMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_SEARCH)
    public RestResponse findAllByExample(
            @RequestParam(value = "pageable", defaultValue = "true", required = true) boolean pageable,
            @RequestParam(value = "page", defaultValue = "0", required = false) int page,
            @RequestParam(value = "size", defaultValue = "10", required = false) int size,
            @RequestParam(value = "order", defaultValue = "ASC", required = false) Sort.Direction direction,
            @RequestParam(value = "sort", defaultValue = "id", required = false) String sortProperty,
            @RequestBody MrTemplate mrTemplate) {

        List<MrTemplate> list = new ArrayList<>();

        if (pageable) {
            Page<MrTemplate> result = service
                    .findByExample(new PageRequest(page, size, new Sort(direction, sortProperty)), mrTemplate);
            list.addAll(result.getContent());
        } else {
            List<MrTemplate> result = service.findByExample(mrTemplate);
            list.addAll(result);
        }

        if (list.size() > 0) {
            return RestResponse.ok(list);
        } else {
            return RestResponse.ok(RestResultCode.DATA_NOT_FOUND);
        }

    }

    @ApiOperation(value = "Get by id data MrTemplate", notes = "Notes goes here...")
    @ApiResponses(value = {
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_DATA_NOT_FOUND, message = ConstantRestApi.RESPONSE_MESSAGE_DATA_NOT_FOUND),
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR)})
    @GetMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_SEARCH + "/{id}")
    public RestResponse findById(@PathVariable("id") Integer id) {
        logger.info("index log: " + new Date().toString());

        MrTemplate result = service.findByIdAndStateNot(id, StateType.D);

        if (result != null) {
            return RestResponse.ok(result);
        } else {
            return RestResponse.ok(RestResultCode.DATA_NOT_FOUND);
        }
    }

    @ApiOperation(value = "Save or update data MrTemplate", notes = "Notes goes here...")
    @ApiResponses(value = {
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_DATA_NOT_FOUND, message = ConstantRestApi.RESPONSE_MESSAGE_DATA_NOT_FOUND),
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR)})
    @PostMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_SAVE)
    public RestResponse saveOrUpdate(@RequestBody MrTemplate mrTemplate) {
        logger.info("save log: " + new Date().toString());
        MrTemplate result = service.save(mrTemplate);

        if (result != null) {
            return RestResponse.ok(result);
        } else {
            return RestResponse.ok(RestResultCode.DATA_NOT_FOUND);
        }
    }

    @ApiOperation(value = "Soft delete data MrTemplate", notes = "Notes goes here...")
    @ApiResponses(value = {
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_SUCCESS, message = ConstantRestApi.RESPONSE_MESSAGE_SUCCESS),
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_DATA_NOT_FOUND, message = ConstantRestApi.RESPONSE_MESSAGE_DATA_NOT_FOUND),
            @ApiResponse(code = ConstantRestApi.RESPONSE_CODE_INTERNAL_SERVER_ERROR, message = ConstantRestApi.RESPONSE_MESSAGE_INTERNAL_SERVER_ERROR)})
    @GetMapping(value = ConstantRestApi.ENDPOINT_SUFFIX_DELETE + "/{id}")
    public RestResponse delete(@PathVariable("id") Integer id) {
        logger.info("index log: " + new Date().toString());

        try {
            service.delete(id);
            return RestResponse.ok();
        } catch (Exception exception) {
            return new RestResponse(exception);
        }

    }

}
