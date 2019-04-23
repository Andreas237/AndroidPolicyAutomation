// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.f;
import com.google.android.gms.common.g;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wt, wx, zz

final class ww extends wt
{

	ww(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void wt()>
		a = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Context a>
	//    5    9:return          
	}

	public final void a()
	{
		boolean flag;
		flag = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(a);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Context a>
	//    2    4:invokestatic    #28  <Method boolean AdvertisingIdClient.getIsAdIdFakeForDebugLogging(Context)>
	//    3    7:istore_1        
		break MISSING_BLOCK_LABEL_32;
	//    4    8:goto            32
		Object obj;
		obj;
	//    5   11:astore_2        
		break MISSING_BLOCK_LABEL_24;
	//    6   12:goto            24
		obj;
	//    7   15:astore_2        
		break MISSING_BLOCK_LABEL_24;
	//    8   16:goto            24
		obj;
	//    9   19:astore_2        
		break MISSING_BLOCK_LABEL_24;
	//   10   20:goto            24
		obj;
	//   11   23:astore_2        
		wx.b("Fail to get isAdIdFakeForDebugLogging", ((Throwable) (obj)));
	//   12   24:ldc1            #30  <String "Fail to get isAdIdFakeForDebugLogging">
	//   13   26:aload_2         
	//   14   27:invokestatic    #36  <Method void wx.b(String, Throwable)>
		flag = false;
	//   15   30:iconst_0        
	//   16   31:istore_1        
		zz.a(flag);
	//   17   32:iload_1         
	//   18   33:invokestatic    #41  <Method void zz.a(boolean)>
		StringBuilder stringbuilder = new StringBuilder(43);
	//   19   36:new             #43  <Class StringBuilder>
	//   20   39:dup             
	//   21   40:bipush          43
	//   22   42:invokespecial   #46  <Method void StringBuilder(int)>
	//   23   45:astore_2        
		stringbuilder.append("Update ad debug logging enablement as ");
	//   24   46:aload_2         
	//   25   47:ldc1            #48  <String "Update ad debug logging enablement as ">
	//   26   49:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		stringbuilder.append(flag);
	//   28   53:aload_2         
	//   29   54:iload_1         
	//   30   55:invokevirtual   #55  <Method StringBuilder StringBuilder.append(boolean)>
	//   31   58:pop             
		wx.e(stringbuilder.toString());
	//   32   59:aload_2         
	//   33   60:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   34   63:invokestatic    #63  <Method void wx.e(String)>
		return;
	//   35   66:return          
	}

	public final void b_()
	{
	//    0    0:return          
	}

	private Context a;
}
