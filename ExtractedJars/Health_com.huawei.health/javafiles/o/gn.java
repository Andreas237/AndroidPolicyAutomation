// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

// Referenced classes of package o:
//			hg, ht, gy, hb, 
//			gm, hj, hu

final class gn
	implements Runnable
{

	gn(gm gm1, Context context)
	{
		b = gm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field gm b>
		c = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field Context c>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		boolean flag;
		gm gm1;
		Object obj;
		try
		{
			hg hg1 = new hg();
	//    0    0:new             #27  <Class hg>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void hg()>
	//    3    7:astore_2        
			obj = ((Object) (c));
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field Context c>
	//    6   12:astore_3        
			obj = ((Object) (((gy) (hg1)).a(((Context) (obj)), "", ht.b(((Context) (obj))), true)));
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:ldc1            #30  <String "">
	//   10   17:aload_3         
	//   11   18:invokestatic    #35  <Method String ht.b(Context)>
	//   12   21:iconst_1        
	//   13   22:invokevirtual   #41  <Method hb gy.a(Context, String, String, boolean)>
	//   14   25:astore_3        
		}
	//*  15   26:aload_3         
	//*  16   27:ifnull          142
	//*  17   30:aload_0         
	//*  18   31:getfield        #14  <Field gm b>
	//*  19   34:astore_2        
	//*  20   35:aload_3         
	//*  21   36:getfield        #46  <Field String hb.b>
	//*  22   39:astore_3        
	//*  23   40:aload_3         
	//*  24   41:invokestatic    #52  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  25   44:istore_1        
	//*  26   45:iload_1         
	//*  27   46:ifne            91
	//*  28   49:new             #54  <Class JSONObject>
	//*  29   52:dup             
	//*  30   53:aload_3         
	//*  31   54:invokespecial   #57  <Method void JSONObject(String)>
	//*  32   57:ldc1            #59  <String "st_sdk_config">
	//*  33   59:invokevirtual   #63  <Method JSONObject JSONObject.optJSONObject(String)>
	//*  34   62:astore_3        
	//*  35   63:aload_2         
	//*  36   64:aload_3         
	//*  37   65:ldc1            #65  <String "timeout">
	//*  38   67:sipush          3500
	//*  39   70:invokevirtual   #69  <Method int JSONObject.optInt(String, int)>
	//*  40   73:putfield        #74  <Field int gm.c>
	//*  41   76:aload_2         
	//*  42   77:aload_3         
	//*  43   78:ldc1            #76  <String "tbreturl">
	//*  44   80:ldc1            #78  <String "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&">
	//*  45   82:invokevirtual   #82  <Method String JSONObject.optString(String, String)>
	//*  46   85:invokevirtual   #88  <Method String String.trim()>
	//*  47   88:putfield        #91  <Field String gm.d>
	//*  48   91:aload_0         
	//*  49   92:getfield        #14  <Field gm b>
	//*  50   95:astore_2        
	//*  51   96:new             #54  <Class JSONObject>
	//*  52   99:dup             
	//*  53  100:invokespecial   #92  <Method void JSONObject()>
	//*  54  103:astore_3        
	//*  55  104:aload_3         
	//*  56  105:ldc1            #65  <String "timeout">
	//*  57  107:aload_2         
	//*  58  108:invokevirtual   #95  <Method int gm.c()>
	//*  59  111:invokevirtual   #99  <Method JSONObject JSONObject.put(String, int)>
	//*  60  114:pop             
	//*  61  115:aload_3         
	//*  62  116:ldc1            #76  <String "tbreturl">
	//*  63  118:aload_2         
	//*  64  119:getfield        #91  <Field String gm.d>
	//*  65  122:invokevirtual   #102 <Method JSONObject JSONObject.put(String, Object)>
	//*  66  125:pop             
	//*  67  126:invokestatic    #107 <Method hj hj.d()>
	//*  68  129:getfield        #108 <Field Context hj.c>
	//*  69  132:ldc1            #110 <String "alipay_cashier_dynamic_config">
	//*  70  134:aload_3         
	//*  71  135:invokevirtual   #113 <Method String JSONObject.toString()>
	//*  72  138:invokestatic    #118 <Method void hu.b(Context, String, String)>
	//*  73  141:return          
	//*  74  142:return          
		catch(Throwable throwable)
	//*  75  143:astore_2        
		{
			return;
	//   76  144:return          
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_142;
		gm1 = b;
		obj = ((Object) (((hb) (obj)).b));
		flag = TextUtils.isEmpty(((CharSequence) (obj)));
		if(!flag)
			try
			{
				obj = ((Object) ((new JSONObject(((String) (obj)))).optJSONObject("st_sdk_config")));
				gm1.c = ((JSONObject) (obj)).optInt("timeout", 3500);
				gm1.d = ((JSONObject) (obj)).optString("tbreturl", "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&").trim();
			}
			catch(Throwable throwable1) { }
	//   77  145:astore_2        
		gm1 = b;
		try
		{
			obj = ((Object) (new JSONObject()));
			((JSONObject) (obj)).put("timeout", gm1.c());
			((JSONObject) (obj)).put("tbreturl", ((Object) (gm1.d)));
			hu.b(hj.d().c, "alipay_cashier_dynamic_config", ((JSONObject) (obj)).toString());
			return;
		}
	//*  78  146:goto            91
		catch(Exception exception)
	//*  79  149:astore_2        
		{
			return;
	//   80  150:return          
		}
	}

	final gm b;
	final Context c;
}
