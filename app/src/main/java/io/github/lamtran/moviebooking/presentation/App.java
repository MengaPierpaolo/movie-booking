/*
 * MIT License
 *
 * Copyright (c) 2017 Lam Tran (tranngoclam288@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.lamtran.moviebooking.presentation;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import io.github.lamtran.moviebooking.BuildConfig;
import timber.log.Timber;

import static io.github.lamtran.moviebooking.presentation.DaggerAppComponent.builder;

/**
 * Created by lam on 2/3/17.
 */

public class App extends DaggerApplication {

  @Override public void onCreate() {
    super.onCreate();
    if (BuildConfig.DEBUG) Timber.plant(new Timber.DebugTree());
  }

  @Override protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
    return builder().create(this);
  }
}
