// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.common.api:
//			GoogleApi

public static class GoogleApi$Settings$Builder
{

	public GoogleApi.Settings build()
	{
		if(zabl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field StatusExceptionMapper zabl>
	//*   2    4:ifnonnull       18
			zabl = ((StatusExceptionMapper) (new ApiExceptionMapper()));
	//    3    7:aload_0         
	//    4    8:new             #27  <Class ApiExceptionMapper>
	//    5   11:dup             
	//    6   12:invokespecial   #28  <Method void ApiExceptionMapper()>
	//    7   15:putfield        #25  <Field StatusExceptionMapper zabl>
		if(zabj == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #30  <Field Looper zabj>
	//*  10   22:ifnonnull       32
			zabj = Looper.getMainLooper();
	//   11   25:aload_0         
	//   12   26:invokestatic    #36  <Method Looper Looper.getMainLooper()>
	//   13   29:putfield        #30  <Field Looper zabj>
		return new GoogleApi.Settings(zabl, ((android.accounts.Account) (null)), zabj, ((zab) (null)));
	//   14   32:new             #6   <Class GoogleApi$Settings>
	//   15   35:dup             
	//   16   36:aload_0         
	//   17   37:getfield        #25  <Field StatusExceptionMapper zabl>
	//   18   40:aconst_null     
	//   19   41:aload_0         
	//   20   42:getfield        #30  <Field Looper zabj>
	//   21   45:aconst_null     
	//   22   46:invokespecial   #39  <Method void GoogleApi$Settings(StatusExceptionMapper, android.accounts.Account, Looper, zab)>
	//   23   49:areturn         
	}

	public GoogleApi$Settings$Builder setLooper(Looper looper)
	{
		Preconditions.checkNotNull(((Object) (looper)), "Looper must not be null.");
	//    0    0:aload_1         
	//    1    1:ldc1            #43  <String "Looper must not be null.">
	//    2    3:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		zabj = looper;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:putfield        #30  <Field Looper zabj>
		return this;
	//    7   12:aload_0         
	//    8   13:areturn         
	}

	public GoogleApi$Settings$Builder setMapper(StatusExceptionMapper statusexceptionmapper)
	{
		Preconditions.checkNotNull(((Object) (statusexceptionmapper)), "StatusExceptionMapper must not be null.");
	//    0    0:aload_1         
	//    1    1:ldc1            #53  <String "StatusExceptionMapper must not be null.">
	//    2    3:invokestatic    #49  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		zabl = statusexceptionmapper;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:putfield        #25  <Field StatusExceptionMapper zabl>
		return this;
	//    7   12:aload_0         
	//    8   13:areturn         
	}

	private Looper zabj;
	private StatusExceptionMapper zabl;

	public GoogleApi$Settings$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
