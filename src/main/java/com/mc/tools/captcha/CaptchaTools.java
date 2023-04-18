package com.mc.tools.captcha;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import cn.hutool.captcha.LineCaptcha;

/**
 * 图形验证码
 *
 * @author mc
 * @date 2023/4/18
 */
public class CaptchaTools {

    /**
     * 线段干扰的验证码
     *
     * @param width  图片宽
     * @param height 图片高
     * @return
     */
    public static LineCaptcha lineCaptchaGen(int width, int height) {
        //定义图形验证码的长和宽
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(width, height);
        return lineCaptcha;
    }


    /**
     * 创建线干扰的验证码
     *
     * @param width     图片宽
     * @param height    图片高
     * @param codeCount 字符个数
     * @param lineCount 干扰线条数
     * @return {@link LineCaptcha}
     */
    public static CircleCaptcha circleCaptchaGen(int width, int height, int codeCount, int lineCount) {
        return CaptchaUtil.createCircleCaptcha(width, height, codeCount, lineCount);
    }


    public static void main(String[] args) {
        LineCaptcha lineCaptcha = CaptchaTools.lineCaptchaGen(1,2);
        System.out.println(lineCaptcha.getCode());
    }

}
