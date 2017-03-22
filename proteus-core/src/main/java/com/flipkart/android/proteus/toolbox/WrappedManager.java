/*
 * Apache License
 * Version 2.0, January 2004
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTION
 *
 * Copyright (c) 2017 Flipkart Internet Pvt. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.flipkart.android.proteus.toolbox;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.flipkart.android.proteus.DataContext;
import com.flipkart.android.proteus.ProteusContext;
import com.flipkart.android.proteus.ProteusView;
import com.flipkart.android.proteus.value.Layout;
import com.flipkart.android.proteus.value.ObjectValue;

/**
 * WrappedManager
 *
 * @author adityasharat
 */

public class WrappedManager implements ProteusView.Manager {

    private final ProteusView.Manager base;

    public WrappedManager(ProteusView.Manager base) {
        this.base = base;
    }

    @Override
    public void update(@Nullable ObjectValue data) {
        base.update(data);
    }

    @NonNull
    @Override
    public ProteusContext getContext() {
        return base.getContext();
    }

    @NonNull
    @Override
    public Layout getLayout() {
        return base.getLayout();
    }

    @NonNull
    @Override
    public DataContext getDataContext() {
        return base.getDataContext();
    }

    @Nullable
    @Override
    public View findViewById(@NonNull String id) {
        return base.findViewById(id);
    }

    public ProteusView.Manager getBaseManager() {
        return base;
    }
}
