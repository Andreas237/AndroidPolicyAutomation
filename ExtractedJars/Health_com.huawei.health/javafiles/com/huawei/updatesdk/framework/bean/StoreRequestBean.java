// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.updatesdk.framework.bean;

import android.content.Context;
import com.huawei.updatesdk.sdk.a.c.f;
import com.huawei.updatesdk.sdk.service.a.a;
import com.huawei.updatesdk.sdk.service.storekit.bean.RequestBean;
import com.huawei.updatesdk.service.a.b;
import com.huawei.updatesdk.support.f.e;

public class StoreRequestBean extends RequestBean
{

	public StoreRequestBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void RequestBean()>
	/* block-local class not found */
	class a {}

		target = com.huawei.updatesdk.framework.bean.a.a;
	//    2    4:aload_0         
	//    3    5:getstatic       #56  <Field StoreRequestBean$a com.huawei.updatesdk.framework.bean.StoreRequestBean$a.a>
	//    4    8:putfield        #58  <Field StoreRequestBean$a target>
		sign_ = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #60  <Field String sign_>
		source_ = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #62  <Field String source_>
		serviceType_ = 0;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #64  <Field int serviceType_>
		clientPackage_ = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #66  <Field String clientPackage_>
		userId_ = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #68  <Field String userId_>
		net_ = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #70  <Field String net_>
		cno_ = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #72  <Field String cno_>
		ts_ = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #74  <Field String ts_>
		code_ = null;
	//   29   51:aload_0         
	//   30   52:aconst_null     
	//   31   53:putfield        #76  <Field String code_>
		nsp_key = null;
	//   32   56:aload_0         
	//   33   57:aconst_null     
	//   34   58:putfield        #78  <Field String nsp_key>
		hcrId_ = null;
	//   35   61:aload_0         
	//   36   62:aconst_null     
	//   37   63:putfield        #80  <Field String hcrId_>
		thirdId_ = null;
	//   38   66:aload_0         
	//   39   67:aconst_null     
	//   40   68:putfield        #82  <Field String thirdId_>
		needSign = true;
	//   41   71:aload_0         
	//   42   72:iconst_1        
	//   43   73:putfield        #84  <Field boolean needSign>
		isBackgroundRequest = false;
	//   44   76:aload_0         
	//   45   77:iconst_0        
	//   46   78:putfield        #86  <Field boolean isBackgroundRequest>
		salt_ = null;
	//   47   81:aload_0         
	//   48   82:aconst_null     
	//   49   83:putfield        #88  <Field String salt_>
		iv_ = null;
	//   50   86:aload_0         
	//   51   87:aconst_null     
	//   52   88:putfield        #90  <Field String iv_>
		isSerial = false;
	//   53   91:aload_0         
	//   54   92:iconst_0        
	//   55   93:putfield        #92  <Field boolean isSerial>
		locale_ = null;
	//   56   96:aload_0         
	//   57   97:aconst_null     
	//   58   98:putfield        #94  <Field String locale_>
		setUrl(com.huawei.updatesdk.service.a.a.a.b());
	//   59  101:aload_0         
	//   60  102:invokestatic    #100 <Method String com.huawei.updatesdk.service.a.a$a.b()>
	//   61  105:invokevirtual   #104 <Method void setUrl(String)>
		setStoreApi("storeApi2");
	//   62  108:aload_0         
	//   63  109:ldc1            #22  <String "storeApi2">
	//   64  111:invokevirtual   #107 <Method void setStoreApi(String)>
		setSign_(b.a().c());
	//   65  114:aload_0         
	//   66  115:invokestatic    #112 <Method b b.a()>
	//   67  118:invokevirtual   #115 <Method String b.c()>
	//   68  121:invokevirtual   #118 <Method void setSign_(String)>
		setHcrId_(b.a().d());
	//   69  124:aload_0         
	//   70  125:invokestatic    #112 <Method b b.a()>
	//   71  128:invokevirtual   #121 <Method String b.d()>
	//   72  131:invokevirtual   #124 <Method void setHcrId_(String)>
		setClientPackage_(com.huawei.updatesdk.sdk.service.a.a.a().b().getPackageName());
	//   73  134:aload_0         
	//   74  135:invokestatic    #129 <Method a a.a()>
	//   75  138:invokevirtual   #132 <Method Context a.b()>
	//   76  141:invokevirtual   #137 <Method String Context.getPackageName()>
	//   77  144:invokevirtual   #140 <Method void setClientPackage_(String)>
		setSalt_(e.b());
	//   78  147:aload_0         
	//   79  148:invokestatic    #143 <Method String e.b()>
	//   80  151:invokevirtual   #146 <Method void setSalt_(String)>
		setIv_(com.huawei.updatesdk.sdk.a.c.a.a(e.d()));
	//   81  154:aload_0         
	//   82  155:invokestatic    #149 <Method byte[] e.d()>
	//   83  158:invokestatic    #154 <Method String com.huawei.updatesdk.sdk.a.c.a.a(byte[])>
	//   84  161:invokevirtual   #157 <Method void setIv_(String)>
	//   85  164:return          
	}

	private String getAppKey(String s)
	{
		if("storeApi3".equals(((Object) (getStoreApi()))))
	//*   0    0:ldc1            #25  <String "storeApi3">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #163 <Method String getStoreApi()>
	//*   3    6:invokevirtual   #169 <Method boolean String.equals(Object)>
	//*   4    9:ifeq            42
			return com.huawei.updatesdk.sdk.a.c.a.a.a((new StringBuilder()).append(getUserId_()).append(s).append("&").toString());
	//    5   12:new             #171 <Class StringBuilder>
	//    6   15:dup             
	//    7   16:invokespecial   #172 <Method void StringBuilder()>
	//    8   19:aload_0         
	//    9   20:invokevirtual   #175 <Method String getUserId_()>
	//   10   23:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:aload_1         
	//   12   27:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:ldc1            #181 <String "&">
	//   14   32:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #184 <Method String StringBuilder.toString()>
	//   16   38:invokestatic    #188 <Method String com.huawei.updatesdk.sdk.a.c.a.a.a(String)>
	//   17   41:areturn         
		else
			return b.a().g();
	//   18   42:invokestatic    #112 <Method b b.a()>
	//   19   45:invokevirtual   #191 <Method String b.g()>
	//   20   48:areturn         
	}

	private String getNspKey(String s, String s1)
	{
		s = getAppKey(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #195 <Method String getAppKey(String)>
	//    3    5:astore_1        
		if(s == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		s1 = com.huawei.updatesdk.support.b.a.a(s1, s);
	//    8   12:aload_2         
	//    9   13:aload_1         
	//   10   14:invokestatic    #199 <Method String com.huawei.updatesdk.support.b.a.a(String, String)>
	//   11   17:astore_2        
		s = s1;
	//   12   18:aload_2         
	//   13   19:astore_1        
		if(s1 != null)
	//*  14   20:aload_2         
	//*  15   21:ifnull          32
			s = f.c(s1.trim());
	//   16   24:aload_2         
	//   17   25:invokevirtual   #202 <Method String String.trim()>
	//   18   28:invokestatic    #206 <Method String f.c(String)>
	//   19   31:astore_1        
		return s;
	//   20   32:aload_1         
	//   21   33:areturn         
	}

	public String genBody(boolean flag)
		throws IllegalAccessException, IllegalArgumentException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #171 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #172 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(super.genBody(flag));
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokespecial   #214 <Method String RequestBean.genBody(boolean)>
	//    8   14:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//    9   17:pop             
		setNsp_key(getNspKey(getTs_(), stringbuilder.toString()));
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:invokevirtual   #217 <Method String getTs_()>
	//   14   24:aload_2         
	//   15   25:invokevirtual   #184 <Method String StringBuilder.toString()>
	//   16   28:invokespecial   #219 <Method String getNspKey(String, String)>
	//   17   31:invokevirtual   #222 <Method void setNsp_key(String)>
		stringbuilder.append((new StringBuilder()).append("&nsp_key=").append(getNsp_key()).toString());
	//   18   34:aload_2         
	//   19   35:new             #171 <Class StringBuilder>
	//   20   38:dup             
	//   21   39:invokespecial   #172 <Method void StringBuilder()>
	//   22   42:ldc1            #224 <String "&nsp_key=">
	//   23   44:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   24   47:aload_0         
	//   25   48:invokevirtual   #227 <Method String getNsp_key()>
	//   26   51:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   27   54:invokevirtual   #184 <Method String StringBuilder.toString()>
	//   28   57:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
		return stringbuilder.toString();
	//   30   61:aload_2         
	//   31   62:invokevirtual   #184 <Method String StringBuilder.toString()>
	//   32   65:areturn         
	}

	public String getClientPackage_()
	{
		return clientPackage_;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String clientPackage_>
	//    2    4:areturn         
	}

	public String getCno_()
	{
		return cno_;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field String cno_>
	//    2    4:areturn         
	}

	public String getCode_()
	{
		return code_;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String code_>
	//    2    4:areturn         
	}

	public String getHcrId()
	{
		return getHcrId_();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #235 <Method String getHcrId_()>
	//    2    4:areturn         
	}

	public String getHcrId_()
	{
		return hcrId_;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field String hcrId_>
	//    2    4:areturn         
	}

	public byte[] getIV()
	{
		if(getIv_() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #239 <Method String getIv_()>
	//*   2    4:ifnull          15
			return com.huawei.updatesdk.sdk.a.c.a.a(getIv_());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #239 <Method String getIv_()>
	//    5   11:invokestatic    #242 <Method byte[] com.huawei.updatesdk.sdk.a.c.a.a(String)>
	//    6   14:areturn         
		else
			return new byte[0];
	//    7   15:iconst_0        
	//    8   16:newarray        byte[]
	//    9   18:areturn         
	}

	public String getIv_()
	{
		return iv_;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field String iv_>
	//    2    4:areturn         
	}

	public String getLocale_()
	{
		return locale_;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field String locale_>
	//    2    4:areturn         
	}

	public String getNet_()
	{
		return net_;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field String net_>
	//    2    4:areturn         
	}

	public String getNsp_key()
	{
		return nsp_key;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String nsp_key>
	//    2    4:areturn         
	}

	public String getSalt_()
	{
		return salt_;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String salt_>
	//    2    4:areturn         
	}

	public int getServiceType_()
	{
		return serviceType_;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int serviceType_>
	//    2    4:ireturn         
	}

	public String getSign()
	{
		return getSign_();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #251 <Method String getSign_()>
	//    2    4:areturn         
	}

	public String getSign_()
	{
		return sign_;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String sign_>
	//    2    4:areturn         
	}

	public String getSource_()
	{
		return source_;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String source_>
	//    2    4:areturn         
	}

	public a getTarget()
	{
		return target;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field StoreRequestBean$a target>
	//    2    4:areturn         
	}

	public String getThirdId_()
	{
		return thirdId_;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field String thirdId_>
	//    2    4:areturn         
	}

	public String getTs_()
	{
		return ts_;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field String ts_>
	//    2    4:areturn         
	}

	public String getUserId_()
	{
		return userId_;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String userId_>
	//    2    4:areturn         
	}

	public boolean isNeedSign()
	{
		return needSign;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field boolean needSign>
	//    2    4:ireturn         
	}

	public boolean isSerial()
	{
		return isSerial;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field boolean isSerial>
	//    2    4:ireturn         
	}

	public void onSetValue()
	{
		setTs_(String.valueOf(System.currentTimeMillis()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #266 <Method long System.currentTimeMillis()>
	//    2    4:invokestatic    #270 <Method String String.valueOf(long)>
	//    3    7:invokevirtual   #273 <Method void setTs_(String)>
		setNet_(String.valueOf(com.huawei.updatesdk.sdk.a.c.c.b.c(com.huawei.updatesdk.sdk.service.a.a.a().b())));
	//    4   10:aload_0         
	//    5   11:invokestatic    #129 <Method a a.a()>
	//    6   14:invokevirtual   #132 <Method Context a.b()>
	//    7   17:invokestatic    #278 <Method int com.huawei.updatesdk.sdk.a.c.c.b.c(Context)>
	//    8   20:invokestatic    #281 <Method String String.valueOf(int)>
	//    9   23:invokevirtual   #284 <Method void setNet_(String)>
		setThirdId_(b.a().f());
	//   10   26:aload_0         
	//   11   27:invokestatic    #112 <Method b b.a()>
	//   12   30:invokevirtual   #287 <Method String b.f()>
	//   13   33:invokevirtual   #290 <Method void setThirdId_(String)>
		try
		{
			String s = b.a().h();
	//   14   36:invokestatic    #112 <Method b b.a()>
	//   15   39:invokevirtual   #293 <Method String b.h()>
	//   16   42:astore_1        
			setUserId_(com.huawei.updatesdk.sdk.a.c.a.a.a(com.huawei.updatesdk.sdk.a.c.b.a.a(), s, getIV()));
	//   17   43:aload_0         
	//   18   44:invokestatic    #297 <Method String com.huawei.updatesdk.sdk.a.c.b.a.a()>
	//   19   47:aload_1         
	//   20   48:aload_0         
	//   21   49:invokevirtual   #299 <Method byte[] getIV()>
	//   22   52:invokestatic    #302 <Method String com.huawei.updatesdk.sdk.a.c.a.a.a(String, String, byte[])>
	//   23   55:invokevirtual   #305 <Method void setUserId_(String)>
		}
	//*  24   58:goto            72
		catch(Exception exception)
	//*  25   61:astore_1        
		{
			com.huawei.updatesdk.sdk.a.b.a.a.a.a("StoreRequestBean", "setValue", ((Throwable) (exception)));
	//   26   62:ldc2            #307 <String "StoreRequestBean">
	//   27   65:ldc2            #309 <String "setValue">
	//   28   68:aload_1         
	//   29   69:invokestatic    #314 <Method void com.huawei.updatesdk.sdk.a.b.a.a.a.a(String, String, Throwable)>
		}
		setCno_("4010002");
	//   30   72:aload_0         
	//   31   73:ldc2            #316 <String "4010002">
	//   32   76:invokevirtual   #319 <Method void setCno_(String)>
		setCode_("0500");
	//   33   79:aload_0         
	//   34   80:ldc2            #321 <String "0500">
	//   35   83:invokevirtual   #324 <Method void setCode_(String)>
	//   36   86:return          
	}

	public void setClientPackage_(String s)
	{
		clientPackage_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field String clientPackage_>
	//    3    5:return          
	}

	public void setCno_(String s)
	{
		cno_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field String cno_>
	//    3    5:return          
	}

	public void setCode_(String s)
	{
		code_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field String code_>
	//    3    5:return          
	}

	public void setHcrId(String s)
	{
		setHcrId_(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #124 <Method void setHcrId_(String)>
	//    3    5:return          
	}

	public void setHcrId_(String s)
	{
		hcrId_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field String hcrId_>
	//    3    5:return          
	}

	public void setIv_(String s)
	{
		iv_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field String iv_>
	//    3    5:return          
	}

	public void setLocale_(String s)
	{
		locale_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field String locale_>
	//    3    5:return          
	}

	public void setNeedSign(boolean flag)
	{
		needSign = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field boolean needSign>
	//    3    5:return          
	}

	public void setNet_(String s)
	{
		net_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field String net_>
	//    3    5:return          
	}

	public void setNsp_key(String s)
	{
		nsp_key = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field String nsp_key>
	//    3    5:return          
	}

	public void setSalt_(String s)
	{
		salt_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field String salt_>
	//    3    5:return          
	}

	public void setSerial(boolean flag)
	{
		isSerial = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #92  <Field boolean isSerial>
	//    3    5:return          
	}

	public void setServiceType_(int i)
	{
		serviceType_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field int serviceType_>
	//    3    5:return          
	}

	public void setSign(String s)
	{
		setSign_(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #118 <Method void setSign_(String)>
	//    3    5:return          
	}

	public void setSign_(String s)
	{
		sign_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field String sign_>
	//    3    5:return          
	}

	public void setSource_(String s)
	{
		source_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field String source_>
	//    3    5:return          
	}

	public void setTarget(a a1)
	{
		target = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field StoreRequestBean$a target>
	//    3    5:return          
	}

	public void setThirdId_(String s)
	{
		thirdId_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field String thirdId_>
	//    3    5:return          
	}

	public void setTs_(String s)
	{
		ts_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field String ts_>
	//    3    5:return          
	}

	public void setUserId_(String s)
	{
		userId_ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field String userId_>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append(" {\n\tmethod_: ").append(getMethod_()).append("\n\tnet_: ").append(getNet_()).append("\n\trequestType: ").append(((Object) (getRequestType()))).append("\n}").toString();
	//    0    0:new             #171 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #172 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #341 <Method Class Object.getClass()>
	//    5   11:invokevirtual   #346 <Method String Class.getName()>
	//    6   14:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc2            #348 <String " {\n\tmethod_: ">
	//    8   20:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:aload_0         
	//   10   24:invokevirtual   #351 <Method String getMethod_()>
	//   11   27:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   12   30:ldc2            #353 <String "\n\tnet_: ">
	//   13   33:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   14   36:aload_0         
	//   15   37:invokevirtual   #355 <Method String getNet_()>
	//   16   40:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   17   43:ldc2            #357 <String "\n\trequestType: ">
	//   18   46:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   19   49:aload_0         
	//   20   50:invokevirtual   #361 <Method com.huawei.updatesdk.sdk.service.storekit.bean.RequestBean$b getRequestType()>
	//   21   53:invokevirtual   #364 <Method StringBuilder StringBuilder.append(Object)>
	//   22   56:ldc2            #366 <String "\n}">
	//   23   59:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
	//   24   62:invokevirtual   #184 <Method String StringBuilder.toString()>
	//   25   65:areturn         
	}

	public static final String ENCRYPT_API1 = "encryptApi1";
	public static final String ENCRYPT_API2 = "encryptApi2";
	public static final String NSP_KEY = "nsp_key";
	public static final String STORE_API = "storeApi";
	public static final String STORE_API2 = "storeApi2";
	public static final String STORE_API3 = "storeApi3";
	private String clientPackage_;
	private String cno_;
	private String code_;
	private String hcrId_;
	private boolean isBackgroundRequest;
	private boolean isSerial;
	private String iv_;
	private String locale_;
	private boolean needSign;
	private String net_;
	private String nsp_key;
	private String salt_;
	private int serviceType_;
	private String sign_;
	private String source_;
	private a target;
	private String thirdId_;
	private String ts_;
	private String userId_;
}
