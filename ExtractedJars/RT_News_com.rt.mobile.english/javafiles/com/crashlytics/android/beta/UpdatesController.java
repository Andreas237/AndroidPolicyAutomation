// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.beta;

import android.content.Context;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.settings.BetaSettingsData;

// Referenced classes of package com.crashlytics.android.beta:
//			Beta, BuildProperties

interface UpdatesController
{

	public abstract void initialize(Context context, Beta beta, IdManager idmanager, BetaSettingsData betasettingsdata, BuildProperties buildproperties, PreferenceStore preferencestore, CurrentTimeProvider currenttimeprovider, 
			HttpRequestFactory httprequestfactory);

	public abstract boolean isActivityLifecycleTriggered();
}
