// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.irobot.core.AssetIdNetworkSessionAttribute;
import com.irobot.core.NetworkAddressNetworkSessionAttribute;
import com.irobot.core.NetworkSessionAttributeKey;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home:
//			j, k, h, o

public final class k extends j
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public j a()
		{
			k k1 = new k();
		//    0    0:new             #7   <Class k>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void k()>
		//    3    7:astore_1        
			k1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void k.setArguments(Bundle)>
			return ((j) (k1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void org.androidannotations.api.a.c()>
		//    2    4:return          
		}
	}


	public k()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void j()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void c()>
	//    6   12:putfield        #29  <Field c i>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #34  <Method void c.a(b)>
	//    2    4:return          
	}

	public static a e()
	{
		return new a();
	//    0    0:new             #14  <Class k$a>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void k$a()>
	//    3    7:areturn         
	}

	public View a(int l)
	{
		if(j == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field View j>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return j.findViewById(l);
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field View j>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #45  <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		a = (CustomTextView)a1.a(0x7f0901e6);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #49  <Int 0x7f0901e6>
	//    3    4:invokeinterface #51  <Method View a.a(int)>
	//    4    9:checkcast       #53  <Class CustomTextView>
	//    5   12:putfield        #56  <Field CustomTextView a>
		b = (LinearLayout)a1.a(0x7f0900b7);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #57  <Int 0x7f0900b7>
	//    9   19:invokeinterface #51  <Method View a.a(int)>
	//   10   24:checkcast       #59  <Class LinearLayout>
	//   11   27:putfield        #63  <Field LinearLayout b>
		c = (LinearLayout)a1.a(0x7f0900b8);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #64  <Int 0x7f0900b8>
	//   15   34:invokeinterface #51  <Method View a.a(int)>
	//   16   39:checkcast       #59  <Class LinearLayout>
	//   17   42:putfield        #67  <Field LinearLayout c>
		d = (LinearLayout)a1.a(0x7f0900b9);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #68  <Int 0x7f0900b9>
	//   21   49:invokeinterface #51  <Method View a.a(int)>
	//   22   54:checkcast       #59  <Class LinearLayout>
	//   23   57:putfield        #71  <Field LinearLayout d>
		e = (CustomButton)a1.a(0x7f090405);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #72  <Int 0x7f090405>
	//   27   64:invokeinterface #51  <Method View a.a(int)>
	//   28   69:checkcast       #74  <Class CustomButton>
	//   29   72:putfield        #77  <Field CustomButton e>
		f = (CustomTextView)a1.a(0x7f0903e2);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #78  <Int 0x7f0903e2>
	//   33   79:invokeinterface #51  <Method View a.a(int)>
	//   34   84:checkcast       #53  <Class CustomTextView>
	//   35   87:putfield        #81  <Field CustomTextView f>
		if(e != null)
	//*  36   90:aload_0         
	//*  37   91:getfield        #77  <Field CustomButton e>
	//*  38   94:ifnull          112
			e.setOnClickListener(((android.view.View.OnClickListener) (new Runnable(this) {

				public void run()
				{
					if(com.mixpanel.android.mpmetrics.k.a(a) && com.mixpanel.android.mpmetrics.k.b(a))
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field k a>
				//*   2    4:invokestatic    #27  <Method boolean com.mixpanel.android.mpmetrics.k.a(k)>
				//*   3    7:ifeq            156
				//*   4   10:aload_0         
				//*   5   11:getfield        #17  <Field k a>
				//*   6   14:invokestatic    #30  <Method boolean com.mixpanel.android.mpmetrics.k.b(k)>
				//*   7   17:ifeq            156
					{
						com.mixpanel.android.mpmetrics.k.a(a, false);
				//    8   20:aload_0         
				//    9   21:getfield        #17  <Field k a>
				//   10   24:iconst_0        
				//   11   25:invokestatic    #33  <Method boolean com.mixpanel.android.mpmetrics.k.a(k, boolean)>
				//   12   28:pop             
						try
						{
							double d = (double)System.currentTimeMillis() - com.mixpanel.android.mpmetrics.k.b().doubleValue();
				//   13   29:invokestatic    #39  <Method long System.currentTimeMillis()>
				//   14   32:l2d             
				//   15   33:invokestatic    #42  <Method Double com.mixpanel.android.mpmetrics.k.b()>
				//   16   36:invokevirtual   #48  <Method double Double.doubleValue()>
				//   17   39:dsub            
				//   18   40:dstore_1        
							if(d >= (double)com.mixpanel.android.mpmetrics.k.c(a).s() && d < (double)com.mixpanel.android.mpmetrics.k.c(a).t())
				//*  19   41:dload_1         
				//*  20   42:aload_0         
				//*  21   43:getfield        #17  <Field k a>
				//*  22   46:invokestatic    #52  <Method h com.mixpanel.android.mpmetrics.k.c(k)>
				//*  23   49:invokevirtual   #58  <Method int h.s()>
				//*  24   52:i2d             
				//*  25   53:dcmpl           
				//*  26   54:iflt            146
				//*  27   57:dload_1         
				//*  28   58:aload_0         
				//*  29   59:getfield        #17  <Field k a>
				//*  30   62:invokestatic    #52  <Method h com.mixpanel.android.mpmetrics.k.c(k)>
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
								obj = ((Object) (((NumberFormat) (obj)).format(((double)System.currentTimeMillis() - com.mixpanel.android.mpmetrics.k.b().doubleValue()) / 1000D)));
				//   41   85:aload_3         
				//   42   86:invokestatic    #39  <Method long System.currentTimeMillis()>
				//   43   89:l2d             
				//   44   90:invokestatic    #42  <Method Double com.mixpanel.android.mpmetrics.k.b()>
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
								com.mixpanel.android.mpmetrics.k.d(a).a("$ae_session", jsonobject, true);
				//   60  123:aload_0         
				//   61  124:getfield        #17  <Field k a>
				//   62  127:invokestatic    #96  <Method j k.d(k)>
				//   63  130:ldc1            #98  <String "$ae_session">
				//   64  132:aload           4
				//   65  134:iconst_1        
				//   66  135:invokevirtual   #103 <Method void com.mixpanel.android.mpmetrics.j.a(String, JSONObject, boolean)>
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
						com.mixpanel.android.mpmetrics.k.d(a).g();
				//   71  146:aload_0         
				//   72  147:getfield        #17  <Field k a>
				//   73  150:invokestatic    #96  <Method j k.d(k)>
				//   74  153:invokevirtual   #109 <Method void j.g()>
					}
				//   75  156:return          
				}

				final k a;

			
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
)));
	//   39   97:aload_0         
	//   40   98:getfield        #77  <Field CustomButton e>
	//   41  101:new             #10  <Class k$1>
	//   42  104:dup             
	//   43  105:aload_0         
	//   44  106:invokespecial   #84  <Method void k$1(k)>
	//   45  109:invokevirtual   #88  <Method void CustomButton.setOnClickListener(android.view.View$OnClickListener)>
		if(f != null)
	//*  46  112:aload_0         
	//*  47  113:getfield        #81  <Field CustomTextView f>
	//*  48  116:ifnull          134
			f.setOnClickListener(((android.view.View.OnClickListener) (new Runnable(this) {

				public void run()
				{
					o.b("LSSNSessionHandler", "executing LSS end session");
				//    0    0:ldc1            #28  <String "LSSNSessionHandler">
				//    1    2:ldc1            #30  <String "executing LSS end session">
				//    2    4:invokestatic    #35  <Method void o.b(String, String)>
					String s = com.irobot.home.o.c.k.a(((AssetIdNetworkSessionAttribute)a.get(((Object) (NetworkSessionAttributeKey.AssetId)))).assetId(), ((NetworkAddressNetworkSessionAttribute)a.get(((Object) (NetworkSessionAttributeKey.NetworkAddress)))).address());
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field HashMap a>
				//    5   11:getstatic       #41  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.AssetId>
				//    6   14:invokevirtual   #47  <Method Object HashMap.get(Object)>
				//    7   17:checkcast       #49  <Class AssetIdNetworkSessionAttribute>
				//    8   20:invokevirtual   #53  <Method com.irobot.core.AssetId AssetIdNetworkSessionAttribute.assetId()>
				//    9   23:aload_0         
				//   10   24:getfield        #21  <Field HashMap a>
				//   11   27:getstatic       #56  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.NetworkAddress>
				//   12   30:invokevirtual   #47  <Method Object HashMap.get(Object)>
				//   13   33:checkcast       #58  <Class NetworkAddressNetworkSessionAttribute>
				//   14   36:invokevirtual   #62  <Method com.irobot.core.NetworkAddress NetworkAddressNetworkSessionAttribute.address()>
				//   15   39:invokestatic    #65  <Method String com.irobot.home.o.c.k.a(com.irobot.core.AssetId, com.irobot.core.NetworkAddress)>
				//   16   42:astore_1        
					com.irobot.home.o.c.o o1 = (com.irobot.home.o.c.o)com.irobot.home.o.c.k.c(b).get(((Object) (s)));
				//   17   43:aload_0         
				//   18   44:getfield        #19  <Field k b>
				//   19   47:invokestatic    #69  <Method HashMap com.irobot.home.o.c.k.c(k)>
				//   20   50:aload_1         
				//   21   51:invokevirtual   #47  <Method Object HashMap.get(Object)>
				//   22   54:checkcast       #71  <Class com.irobot.home.o.c.o>
				//   23   57:astore_2        
					if(!(o1 instanceof j))
				//*  24   58:aload_2         
				//*  25   59:instanceof      #73  <Class j>
				//*  26   62:ifne            73
					{
						o.e("LSSNSessionHandler", "Session is null in end session.");
				//   27   65:ldc1            #28  <String "LSSNSessionHandler">
				//   28   67:ldc1            #75  <String "Session is null in end session.">
				//   29   69:invokestatic    #78  <Method void o.e(String, String)>
						return;
				//   30   72:return          
					} else
					{
						((j)o1).g();
				//   31   73:aload_2         
				//   32   74:checkcast       #73  <Class j>
				//   33   77:invokevirtual   #81  <Method void j.g()>
						com.irobot.home.o.c.k.c(b).remove(((Object) (s)));
				//   34   80:aload_0         
				//   35   81:getfield        #19  <Field k b>
				//   36   84:invokestatic    #69  <Method HashMap com.irobot.home.o.c.k.c(k)>
				//   37   87:aload_1         
				//   38   88:invokevirtual   #84  <Method Object HashMap.remove(Object)>
				//   39   91:pop             
						return;
				//   40   92:return          
					}
				}

				final HashMap a;
				final k b;

			
			{
				b = k1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field k b>
				a = hashmap;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field HashMap a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
)));
	//   49  119:aload_0         
	//   50  120:getfield        #81  <Field CustomTextView f>
	//   51  123:new             #12  <Class k$2>
	//   52  126:dup             
	//   53  127:aload_0         
	//   54  128:invokespecial   #89  <Method void k$2(k)>
	//   55  131:invokevirtual   #90  <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		b();
	//   56  134:aload_0         
	//   57  135:invokevirtual   #92  <Method void b()>
	//   58  138:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field c i>
	//    2    4:invokestatic    #96  <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #98  <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #100 <Method void j.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #96  <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		j = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #104 <Method View j.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #40  <Field View j>
		if(j == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #40  <Field View j>
	//*   9   15:ifnonnull       30
			j = layoutinflater.inflate(0x7f0b00e1, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #105 <Int 0x7f0b00e1>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #111 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #40  <Field View j>
		return j;
	//   17   30:aload_0         
	//   18   31:getfield        #40  <Field View j>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void j.onDestroyView()>
		j = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #40  <Field View j>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #56  <Field CustomTextView a>
		b = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #63  <Field LinearLayout b>
		c = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #67  <Field LinearLayout c>
		d = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #71  <Field LinearLayout d>
		e = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #77  <Field CustomButton e>
		f = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #81  <Field CustomTextView f>
	//   23   39:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #118 <Method void j.onViewCreated(View, Bundle)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field c i>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #120 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c i = new c();
	private View j;
}
