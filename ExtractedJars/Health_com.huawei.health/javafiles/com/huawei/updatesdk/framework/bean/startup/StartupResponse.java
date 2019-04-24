// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.updatesdk.framework.bean.startup;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.updatesdk.framework.bean.StoreResponseBean;
import com.huawei.updatesdk.sdk.service.download.a;
import com.huawei.updatesdk.service.a.b;
import java.util.Iterator;
import java.util.List;

public class StartupResponse extends StoreResponseBean
{

	public StartupResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void StoreResponseBean()>
		setRtnCode_(1);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #28  <Method void setRtnCode_(int)>
	//    5    9:return          
	}

	public List getBackips_()
	{
		return backips_;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List backips_>
	//    2    4:areturn         
	}

	public String getHcrId_()
	{
		return hcrId_;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String hcrId_>
	//    2    4:areturn         
	}

	public String getSign_()
	{
		return sign_;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String sign_>
	//    2    4:areturn         
	}

	public int getSiteID_()
	{
		return siteID_;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int siteID_>
	//    2    4:ireturn         
	}

	public void saveBackupUrl()
	{
	/* block-local class not found */
	class IPInfo {}

		IPInfo ipinfo;
		for(Iterator iterator = getBackips_().iterator(); iterator.hasNext(); b.a().a(ipinfo.getUse_(), ipinfo.getUri_()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #49  <Method List getBackips_()>
	//*   2    4:invokeinterface #55  <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            46
			ipinfo = (IPInfo)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #65  <Method Object Iterator.next()>
	//    9   25:checkcast       #6   <Class StartupResponse$IPInfo>
	//   10   28:astore_2        

	//   11   29:invokestatic    #70  <Method b b.a()>
	//   12   32:aload_2         
	//   13   33:invokevirtual   #73  <Method int StartupResponse$IPInfo.getUse_()>
	//   14   36:aload_2         
	//   15   37:invokevirtual   #76  <Method String StartupResponse$IPInfo.getUri_()>
	//   16   40:invokevirtual   #79  <Method void b.a(int, String)>
	//*  17   43:goto            10
	//   18   46:return          
	}

	public void saveIpInfo(Context context)
	{
		if(getBackips_() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #49  <Method List getBackips_()>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		a a1 = a.a();
	//    4    8:invokestatic    #86  <Method a a.a()>
	//    5   11:astore_2        
		a1.b();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #89  <Method void a.b()>
		IPInfo ipinfo;
		for(Iterator iterator = getBackips_().iterator(); iterator.hasNext(); a1.a(ipinfo.getUse_(), ipinfo.getUri_()))
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #49  <Method List getBackips_()>
	//*  10   20:invokeinterface #55  <Method Iterator List.iterator()>
	//*  11   25:astore_3        
	//*  12   26:aload_3         
	//*  13   27:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//*  14   32:ifeq            63
			ipinfo = (IPInfo)iterator.next();
	//   15   35:aload_3         
	//   16   36:invokeinterface #65  <Method Object Iterator.next()>
	//   17   41:checkcast       #6   <Class StartupResponse$IPInfo>
	//   18   44:astore          4

	//   19   46:aload_2         
	//   20   47:aload           4
	//   21   49:invokevirtual   #73  <Method int StartupResponse$IPInfo.getUse_()>
	//   22   52:aload           4
	//   23   54:invokevirtual   #76  <Method String StartupResponse$IPInfo.getUri_()>
	//   24   57:invokevirtual   #90  <Method void a.a(int, String)>
	//*  25   60:goto            26
		a1.a(context);
	//   26   63:aload_2         
	//   27   64:aload_1         
	//   28   65:invokevirtual   #92  <Method void a.a(Context)>
		saveBackupUrl();
	//   29   68:aload_0         
	//   30   69:invokevirtual   #94  <Method void saveBackupUrl()>
	//   31   72:return          
	}

	public void saveParams()
	{
		if(!TextUtils.isEmpty(((CharSequence) (getSign_()))) && !TextUtils.isEmpty(((CharSequence) (getHcrId_()))))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #97  <Method String getSign_()>
	//*   2    4:invokestatic    #103 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifne            97
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #105 <Method String getHcrId_()>
	//*   6   14:invokestatic    #103 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   17:ifne            97
		{
			b b1 = b.a();
	//    8   20:invokestatic    #70  <Method b b.a()>
	//    9   23:astore_1        
			String s = b1.c();
	//   10   24:aload_1         
	//   11   25:invokevirtual   #108 <Method String b.c()>
	//   12   28:astore_2        
			String s1 = b1.d();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #111 <Method String b.d()>
	//   15   33:astore_3        
			if(s == null || !s.equals(((Object) (getSign_()))) || s1 == null || !s1.equals(((Object) (getHcrId_()))))
	//*  16   34:aload_2         
	//*  17   35:ifnull          64
	//*  18   38:aload_2         
	//*  19   39:aload_0         
	//*  20   40:invokevirtual   #97  <Method String getSign_()>
	//*  21   43:invokevirtual   #117 <Method boolean String.equals(Object)>
	//*  22   46:ifeq            64
	//*  23   49:aload_3         
	//*  24   50:ifnull          64
	//*  25   53:aload_3         
	//*  26   54:aload_0         
	//*  27   55:invokevirtual   #105 <Method String getHcrId_()>
	//*  28   58:invokevirtual   #117 <Method boolean String.equals(Object)>
	//*  29   61:ifne            97
			{
				b1.a(getSign_());
	//   30   64:aload_1         
	//   31   65:aload_0         
	//   32   66:invokevirtual   #97  <Method String getSign_()>
	//   33   69:invokevirtual   #120 <Method void b.a(String)>
				b1.b(getHcrId_());
	//   34   72:aload_1         
	//   35   73:aload_0         
	//   36   74:invokevirtual   #105 <Method String getHcrId_()>
	//   37   77:invokevirtual   #122 <Method void b.b(String)>
				com.huawei.updatesdk.service.a.a.a.a(getSiteID_());
	//   38   80:aload_0         
	//   39   81:invokevirtual   #124 <Method int getSiteID_()>
	//   40   84:invokestatic    #128 <Method void com.huawei.updatesdk.service.a.a$a.a(int)>
				saveIpInfo(com.huawei.updatesdk.sdk.service.a.a.a().b());
	//   41   87:aload_0         
	//   42   88:invokestatic    #133 <Method com.huawei.updatesdk.sdk.service.a.a com.huawei.updatesdk.sdk.service.a.a.a()>
	//   43   91:invokevirtual   #136 <Method Context com.huawei.updatesdk.sdk.service.a.a.b()>
	//   44   94:invokevirtual   #138 <Method void saveIpInfo(Context)>
			}
		}
	//   45   97:return          
	}

	public void setBackips_(List list)
	{
		backips_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field List backips_>
	//    3    5:return          
	}

	public void setHcrId_(String s)
	{
		hcrId_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String hcrId_>
	//    3    5:return          
	}

	public void setSign_(String s)
	{
		sign_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String sign_>
	//    3    5:return          
	}

	public void setSiteID_(int i)
	{
		siteID_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field int siteID_>
	//    3    5:return          
	}

	public static final int SUCCESS = 0;
	private List backips_;
	private String hcrId_;
	private String sign_;
	private int siteID_;
}
