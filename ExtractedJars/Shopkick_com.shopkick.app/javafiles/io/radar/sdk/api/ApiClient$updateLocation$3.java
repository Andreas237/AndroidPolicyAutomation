// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.location.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

// Referenced classes of package io.radar.sdk.api:
//			ApiClient, ApiService

static final class ApiClient$updateLocation$3 extends Lambda
	implements Function1
{

	public volatile Object invoke(Object obj)
	{
		invoke((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #62  <Class String>
	//    3    5:invokevirtual   #65  <Method void invoke(String)>
		return ((Object) (Unit.INSTANCE));
	//    4    8:getstatic       #71  <Field Unit Unit.INSTANCE>
	//    5   11:areturn         
	}

	public final void invoke(String s)
	{
		ApiClient.access$getApiService$p(ApiClient.this).userUpsert($publishableKey, $location, $stopped, $foreground, $replayed, s, $callback);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ApiClient this$0>
	//    2    4:invokestatic    #76  <Method ApiService ApiClient.access$getApiService$p(ApiClient)>
	//    3    7:aload_0         
	//    4    8:getfield        #45  <Field String $publishableKey>
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field Location $location>
	//    7   15:aload_0         
	//    8   16:getfield        #49  <Field boolean $stopped>
	//    9   19:aload_0         
	//   10   20:getfield        #51  <Field boolean $foreground>
	//   11   23:aload_0         
	//   12   24:getfield        #53  <Field boolean $replayed>
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #55  <Field Function1 $callback>
	//   16   32:invokevirtual   #82  <Method void ApiService.userUpsert(String, Location, boolean, boolean, boolean, String, Function1)>
	//   17   35:return          
	}

	final Function1 $callback;
	final boolean $foreground;
	final Location $location;
	final String $publishableKey;
	final boolean $replayed;
	final boolean $stopped;
	final ApiClient this$0;

	ApiClient$updateLocation$3(ApiClient apiclient, String s, Location location, boolean flag, boolean flag1, boolean flag2, Function1 function1)
	{
		this$0 = apiclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field ApiClient this$0>
		$publishableKey = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #45  <Field String $publishableKey>
		$location = location;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #47  <Field Location $location>
		$stopped = flag;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #49  <Field boolean $stopped>
		$foreground = flag1;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #51  <Field boolean $foreground>
		$replayed = flag2;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #53  <Field boolean $replayed>
		$callback = function1;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #55  <Field Function1 $callback>
		super(1);
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:invokespecial   #58  <Method void Lambda(int)>
	//   24   44:return          
	}
}
