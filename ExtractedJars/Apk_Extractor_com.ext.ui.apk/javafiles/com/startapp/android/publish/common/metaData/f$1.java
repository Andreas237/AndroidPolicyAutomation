// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.metaData;

import android.content.Context;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.b;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.i.a;
import com.startapp.android.publish.adsCommon.l;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.common.metaData:
//			c, f, MetaData, MetaDataRequest

static final class f$1 extends c
{

	protected void a(Boolean boolean1)
	{
		try
		{
			if(boolean1.booleanValue() && d != null && a != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #39  <Method boolean Boolean.booleanValue()>
	//*   2    4:ifeq            32
	//*   3    7:aload_0         
	//*   4    8:getfield        #29  <Field MetaData d>
	//*   5   11:ifnull          32
	//*   6   14:aload_0         
	//*   7   15:getfield        #20  <Field Context a>
	//*   8   18:ifnull          32
				MetaData.update(a, d);
	//    9   21:aload_0         
	//   10   22:getfield        #20  <Field Context a>
	//   11   25:aload_0         
	//   12   26:getfield        #29  <Field MetaData d>
	//   13   29:invokestatic    #45  <Method void MetaData.update(Context, MetaData)>
			com.startapp.android.publish.adsCommon.Utils.b.c(a);
	//   14   32:aload_0         
	//   15   33:getfield        #20  <Field Context a>
	//   16   36:invokestatic    #50  <Method void b.c(Context)>
			if(c != null)
	//*  17   39:aload_0         
	//*  18   40:getfield        #24  <Field com.startapp.common.b.a.b$b c>
	//*  19   43:ifnull          58
				c.a(com.startapp.common.b.a.b$a.a);
	//   20   46:aload_0         
	//   21   47:getfield        #24  <Field com.startapp.common.b.a.b$b c>
	//   22   50:getstatic       #55  <Field com.startapp.common.b.a.b$a com.startapp.common.b.a.b$a.a>
	//   23   53:invokeinterface #60  <Method void com.startapp.common.b.a.b$b.a(com.startapp.common.b.a.b$a)>
			return;
	//   24   58:return          
		}
		// Misplaced declaration of an exception variable
		catch(Boolean boolean1)
	//*  25   59:astore_1        
		{
			f.a(a, d.b, "PeriodicMetaData.onPostExecute", ((Exception) (boolean1)).getMessage(), "");
	//   26   60:aload_0         
	//   27   61:getfield        #20  <Field Context a>
	//   28   64:getstatic       #65  <Field d d.b>
	//   29   67:ldc1            #67  <String "PeriodicMetaData.onPostExecute">
	//   30   69:aload_1         
	//   31   70:invokevirtual   #71  <Method String Exception.getMessage()>
	//   32   73:ldc1            #73  <String "">
	//   33   75:invokestatic    #78  <Method void f.a(Context, d, String, String, String)>
		}
	//   34   78:return          
	}

	protected Boolean c()
	{
		g.a(3, "Loading MetaData");
	//    0    0:iconst_3        
	//    1    1:ldc1            #81  <String "Loading MetaData">
	//    2    3:invokestatic    #86  <Method void g.a(int, String)>
		try
		{
			l.b(a);
	//    3    6:aload_0         
	//    4    7:getfield        #20  <Field Context a>
	//    5   10:invokestatic    #90  <Method void l.b(Context)>
			MetaDataRequest metadatarequest = new MetaDataRequest(a, DataRequest.a.e);
	//    6   13:new             #92  <Class MetaDataRequest>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:getfield        #20  <Field Context a>
	//   10   21:getstatic       #98  <Field MetaDataRequest$a MetaDataRequest$a.e>
	//   11   24:invokespecial   #101 <Method void MetaDataRequest(Context, MetaDataRequest$a)>
	//   12   27:astore_1        
			metadatarequest.fillApplicationDetails(a, b, false);
	//   13   28:aload_1         
	//   14   29:aload_0         
	//   15   30:getfield        #20  <Field Context a>
	//   16   33:aload_0         
	//   17   34:getfield        #22  <Field AdPreferences b>
	//   18   37:iconst_0        
	//   19   38:invokevirtual   #105 <Method void MetaDataRequest.fillApplicationDetails(Context, AdPreferences, boolean)>
			metadatarequest.fillLocationDetails(b, a);
	//   20   41:aload_1         
	//   21   42:aload_0         
	//   22   43:getfield        #22  <Field AdPreferences b>
	//   23   46:aload_0         
	//   24   47:getfield        #20  <Field Context a>
	//   25   50:invokevirtual   #109 <Method void MetaDataRequest.fillLocationDetails(AdPreferences, Context)>
			d = (MetaData)i.a(com.startapp.android.publish.adsCommon.i.a.a(a, AdsConstants.a(com.startapp.android.publish.adsCommon.onstants.ApiType.METADATA), ((com.startapp.android.publish.adsCommon.BaseRequest) (metadatarequest)), ((java.util.Map) (null))).a(), com/startapp/android/publish/common/metaData/MetaData);
	//   26   53:aload_0         
	//   27   54:aload_0         
	//   28   55:getfield        #20  <Field Context a>
	//   29   58:getstatic       #115 <Field com.startapp.android.publish.adsCommon.AdsConstants$ApiType com.startapp.android.publish.adsCommon.AdsConstants$ApiType.METADATA>
	//   30   61:invokestatic    #120 <Method String AdsConstants.a(com.startapp.android.publish.adsCommon.AdsConstants$ApiType)>
	//   31   64:aload_1         
	//   32   65:aconst_null     
	//   33   66:invokestatic    #125 <Method com.startapp.common.a.h$a a.a(Context, String, com.startapp.android.publish.adsCommon.BaseRequest, java.util.Map)>
	//   34   69:invokevirtual   #129 <Method String com.startapp.common.a.h$a.a()>
	//   35   72:ldc1            #41  <Class MetaData>
	//   36   74:invokestatic    #134 <Method Object i.a(String, Class)>
	//   37   77:checkcast       #41  <Class MetaData>
	//   38   80:putfield        #29  <Field MetaData d>
		}
	//*  39   83:getstatic       #138 <Field Boolean Boolean.TRUE>
	//*  40   86:areturn         
		catch(Exception exception)
	//*  41   87:astore_1        
		{
			g.a(6, "Unable to handle GetMetaData command!!!!", ((Throwable) (exception)));
	//   42   88:bipush          6
	//   43   90:ldc1            #140 <String "Unable to handle GetMetaData command!!!!">
	//   44   92:aload_1         
	//   45   93:invokestatic    #143 <Method void g.a(int, String, Throwable)>
			return Boolean.FALSE;
	//   46   96:getstatic       #146 <Field Boolean Boolean.FALSE>
	//   47   99:areturn         
		}
		return Boolean.TRUE;
	}

	final Context a;
	final AdPreferences b;
	final com.startapp.common.b.a.b$b c;
	private MetaData d;

	f$1(Context context, AdPreferences adpreferences, DataRequest.a a1, Context context1, AdPreferences adpreferences1, com.startapp.common.b.a.b$b b$b1)
	{
		a = context1;
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:putfield        #20  <Field Context a>
		b = adpreferences1;
	//    3    6:aload_0         
	//    4    7:aload           5
	//    5    9:putfield        #22  <Field AdPreferences b>
		c = b$b1;
	//    6   12:aload_0         
	//    7   13:aload           6
	//    8   15:putfield        #24  <Field com.startapp.common.b.a.b$b c>
		super(context, adpreferences, a1);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:invokespecial   #27  <Method void c(Context, AdPreferences, MetaDataRequest$a)>
		d = null;
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:putfield        #29  <Field MetaData d>
	//   17   30:return          
	}
}
