/*
 * Copyright 2019. techflowing
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nequer.android;

import android.content.Context;

import com.neuqer.android.BuildConfig;
import com.neuqer.android.annotation.api.ModuleApplicationInject;
import com.neuqer.android.runtime.AppRuntimeInit;

/**
 * Application类
 *
 * @author techflowing
 * @since 2019/4/22 10:09 PM
 */
public class Application extends android.app.Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        AppRuntimeInit.onApplicationAttachBaseContext(this, BuildConfig.DEBUG);
        ModuleApplicationInject.onApplicationAttachBaseContext(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ModuleApplicationInject.onApplicationCreate(this);
    }
}
