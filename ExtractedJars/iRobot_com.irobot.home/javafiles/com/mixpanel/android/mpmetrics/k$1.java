// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import java.text.NumberFormat;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			k, h, j

class k$1
	implements Runnable
{

	public void run()
	{
		if(k.a(a) && k.b(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field k a>
	//*   2    4:invokestatic    #27  <Method boolean k.a(k)>
	//*   3    7:ifeq            156
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field k a>
	//*   6   14:invokestatic    #30  <Method boolean k.b(k)>
	//*   7   17:ifeq            156
		{
			k.a(a, false);
	//    8   20:aload_0         
	//    9   21:getfield        #17  <Field k a>
	//   10   24:iconst_0        
	//   11   25:invokestatic    #33  <Method boolean k.a(k, boolean)>
	//   12   28:pop             
			try
			{
				double d = (double)System.currentTimeMillis() - k.b().doubleValue();
	//   13   29:invokestatic    #39  <Method long System.currentTimeMillis()>
	//   14   32:l2d             
	//   15   33:invokestatic    #42  <Method Double k.b()>
	//   16   36:invokevirtual   #48  <Method double Double.doubleValue()>
	//   17   39:dsub            
	//   18   40:dstore_1        
				if(d >= (double)k.c(a).s() && d < (double)k.c(a).t())
	//*  19   41:dload_1         
	//*  20   42:aload_0         
	//*  21   43:getfield        #17  <Field k a>
	//*  22   46:invokestatic    #52  <Method h k.c(k)>
	//*  23   49:invokevirtual   #58  <Method int h.s()>
	//*  24   52:i2d             
	//*  25   53:dcmpl           
	//*  26   54:iflt            146
	//*  27   57:dload_1         
	//*  28   58:aload_0         
	//*  29   59:getfield        #17  <Field k a>
	//*  30   62:invokestatic    #52  <Method h k.c(k)>
	//*  31   65:invokevirtual   #61  <Method int h.t()>
	//*  32   68:i2d             
	//*  33   69:dcmpg           
	//*  34   70:ifge            146
				{
					Object obj = ((Object) (NumberFormat.getNumberInstance(Locale.ENGLISH)));
	//   35   73:getstatic       #67  <Field Locale Locale.ENGLISH>
	//   36   76:invokestatic    #73  <Method NumberFormat NumberFormat.getNumberInstance(Locale)>
	//   37   79:astore_3        
					((NumberFormat) (obj)).setMaximumFractionDigits(1);
	//   38   80:aload_3         
	//   39   81:iconst_1        
	//   40   82:invokevirtual   #77  <Method void NumberFormat.setMaximumFractionDigits(int)>
					obj = ((Object) (((NumberFormat) (obj)).format(((double)System.currentTimeMillis() - k.b().doubleValue()) / 1000D)));
	//   41   85:aload_3         
	//   42   86:invokestatic    #39  <Method long System.currentTimeMillis()>
	//   43   89:l2d             
	//   44   90:invokestatic    #42  <Method Double k.b()>
	//   45   93:invokevirtual   #48  <Method double Double.doubleValue()>
	//   46   96:dsub            
	//   47   97:ldc2w           #78  <Double 1000D>
	//   48  100:ddiv            
	//   49  101:invokevirtual   #83  <Method String NumberFormat.format(double)>
	//   50  104:astore_3        
					JSONObject jsonobject = new JSONObject();
	//   51  105:new             #85  <Class JSONObject>
	//   52  108:dup             
	//   53  109:invokespecial   #86  <Method void JSONObject()>
	//   54  112:astore          4
					jsonobject.put("$ae_session_length", obj);
	//   55  114:aload           4
	//   56  116:ldc1            #88  <String "$ae_session_length">
	//   57  118:aload_3         
	//   58  119:invokevirtual   #92  <Method JSONObject JSONObject.put(String, Object)>
	//   59  122:pop             
					k.d(a).a("$ae_session", jsonobject, true);
	//   60  123:aload_0         
	//   61  124:getfield        #17  <Field k a>
	//   62  127:invokestatic    #96  <Method j k.d(k)>
	//   63  130:ldc1            #98  <String "$ae_session">
	//   64  132:aload           4
	//   65  134:iconst_1        
	//   66  135:invokevirtual   #103 <Method void j.a(String, JSONObject, boolean)>
				}
			}
	//*  67  138:goto            146
			catch(JSONException jsonexception)
	//*  68  141:astore_3        
			{
				jsonexception.printStackTrace();
	//   69  142:aload_3         
	//   70  143:invokevirtual   #106 <Method void JSONException.printStackTrace()>
			}
			k.d(a).g();
	//   71  146:aload_0         
	//   72  147:getfield        #17  <Field k a>
	//   73  150:invokestatic    #96  <Method j k.d(k)>
	//   74  153:invokevirtual   #109 <Method void j.g()>
		}
	//   75  156:return          
	}

	final k a;

	k$1(k k1)
	{
		a = k1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field k a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
