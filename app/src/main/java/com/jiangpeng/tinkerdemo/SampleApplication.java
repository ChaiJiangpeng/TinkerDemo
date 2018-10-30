package com.jiangpeng.tinkerdemo;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by ChaiJiangPeng on 2018/10/26.
 */
public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.jiangpeng.tinkerdemo.SampleApplicationLike", "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
