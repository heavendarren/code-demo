package cn.yunxiang.demo.controller;

import cn.yunxiang.demo.business.IUserBusiness;
import cn.yunxiang.demo.common.Result;
import cn.yunxiang.demo.domain.vo.UserVO;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Insert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author wangqx
 * @description 用户的控制器.
 * @date 2022/6/16
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/api/user")
public class UserController {

    /**
     * 业务层 .
     */
    private final IUserBusiness userBusiness;




    /**
     * 新增.
     *
     * @param req
     * @return
     */
    @PostMapping("")
    @ApiOperation("新增")
    public Result add(@ApiParam("参数Key") @RequestBody @Validated({Insert.class}) final UserVO req) {
        return Result.ok(userBusiness.save(req));
    }

    /**
     * 修改.
     *
     * @param req
     * @return
     */
    @PutMapping("")
    @ApiOperation("修改")
    public Result<Boolean> edit(@ApiParam("参数Key") @RequestBody @Valid final UserVO req) {
        return Result.ok(userBusiness.save(req));
    }

    /**
     * 列表.
     *
     * @param req
     * @return
     */
    @GetMapping("")
    @ApiOperation("列表")
    public Result<List<UserVO>> list(@ApiParam("参数Key") @Valid final UserVO req) {
        return Result.ok(userBusiness.list(req));
    }

    /**
     * 详情.
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ApiOperation("详情")
    public Result<UserVO> info(@ApiParam("参数Key") @PathVariable final Long id) {
        return Result.ok(userBusiness.get(id));
    }

    /**
     * 分页.
     *
     * @param req 分页对象.
     * @return
     */
    @GetMapping("/page")
    @ApiOperation("分页列表")
    public Result<Page<UserVO>> page(@ApiParam("请求参数") @Valid final UserVO req) {
        return Result.ok(userBusiness.page(req));
    }


    /**
     * 删除 .
     *
     * @param id 主键
     * @return
     */
    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public Result<Boolean> delete(@ApiParam("参数key") @PathVariable final Long id) {
        return Result.ok(userBusiness.delete(id));
    }


}
