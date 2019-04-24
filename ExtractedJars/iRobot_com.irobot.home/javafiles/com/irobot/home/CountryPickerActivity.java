// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.b.k;
import com.irobot.home.model.aa;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home:
//			BaseListActivity, IRobotApplication

public class CountryPickerActivity extends BaseListActivity
{

	public CountryPickerActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void BaseListActivity()>
		k = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #42  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void ArrayList()>
	//    6   12:putfield        #45  <Field List k>
		l = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #47  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #48  <Method void HashMap()>
	//   11   23:putfield        #50  <Field Map l>
		m = new android.widget.AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
			{
				adapterview = ((AdapterView) ((String)CountryPickerActivity.b(a).get(CountryPickerActivity.a(a).getItem(i1))));
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field CountryPickerActivity a>
			//    2    4:invokestatic    #24  <Method Map CountryPickerActivity.b(CountryPickerActivity)>
			//    3    7:aload_0         
			//    4    8:getfield        #14  <Field CountryPickerActivity a>
			//    5   11:invokestatic    #27  <Method k CountryPickerActivity.a(CountryPickerActivity)>
			//    6   14:iload_3         
			//    7   15:invokevirtual   #33  <Method Object k.getItem(int)>
			//    8   18:invokeinterface #39  <Method Object Map.get(Object)>
			//    9   23:checkcast       #41  <Class String>
			//   10   26:astore_1        
				CountryPickerActivity.a(a).a(((String) (adapterview)));
			//   11   27:aload_0         
			//   12   28:getfield        #14  <Field CountryPickerActivity a>
			//   13   31:invokestatic    #27  <Method k CountryPickerActivity.a(CountryPickerActivity)>
			//   14   34:aload_1         
			//   15   35:invokevirtual   #44  <Method void k.a(String)>
				a.a(((String) (adapterview)));
			//   16   38:aload_0         
			//   17   39:getfield        #14  <Field CountryPickerActivity a>
			//   18   42:aload_1         
			//   19   43:invokevirtual   #45  <Method void CountryPickerActivity.a(String)>
			//   20   46:return          
			}

			final CountryPickerActivity a;

			
			{
				a = CountryPickerActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field CountryPickerActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   12   26:aload_0         
	//   13   27:new             #6   <Class CountryPickerActivity$1>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #53  <Method void CountryPickerActivity$1(CountryPickerActivity)>
	//   17   35:putfield        #55  <Field android.widget.AdapterView$OnItemClickListener m>
	//   18   38:return          
	}

	static k a(CountryPickerActivity countrypickeractivity)
	{
		return countrypickeractivity.i;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field k i>
	//    2    4:areturn         
	}

	static Map b(CountryPickerActivity countrypickeractivity)
	{
		return countrypickeractivity.l;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Map l>
	//    2    4:areturn         
	}

	void a()
	{
		b(0x7f0f07f0);
	//    0    0:aload_0         
	//    1    1:ldc1            #62  <Int 0x7f0f07f0>
	//    2    3:invokevirtual   #65  <Method void b(int)>
		f = com.irobot.home.util.j.i(((android.content.Context) (this)));
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:invokestatic    #70  <Method CustomerCareRestClient j.i(android.content.Context)>
	//    6   11:putfield        #72  <Field CustomerCareRestClient f>
		b();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #74  <Method void b()>
		AnalyticsSubsystem.getInstance().trackView(ViewId.CountryPicker);
	//    9   18:invokestatic    #80  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   10   21:getstatic       #86  <Field ViewId ViewId.CountryPicker>
	//   11   24:invokevirtual   #90  <Method void AnalyticsSubsystem.trackView(ViewId)>
	//   12   27:return          
	}

	protected void a(String s)
	{
		c.f(s);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field IRobotApplication c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #97  <Method void IRobotApplication.f(String)>
		Intent intent = new Intent();
	//    4    8:new             #99  <Class Intent>
	//    5   11:dup             
	//    6   12:invokespecial   #100 <Method void Intent()>
	//    7   15:astore_2        
		intent.setData(Uri.parse(s));
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokestatic    #106 <Method Uri Uri.parse(String)>
	//   11   21:invokevirtual   #110 <Method Intent Intent.setData(Uri)>
	//   12   24:pop             
		setResult(-1, intent);
	//   13   25:aload_0         
	//   14   26:iconst_m1       
	//   15   27:aload_2         
	//   16   28:invokevirtual   #114 <Method void setResult(int, Intent)>
		finish();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #117 <Method void finish()>
	//   19   35:return          
	}

	public void b()
	{
		if(!Locale.getDefault().getCountry().equals(((Object) (Locale.CHINA.getCountry())))) goto _L2; else goto _L1
	//    0    0:invokestatic    #125 <Method Locale Locale.getDefault()>
	//    1    3:invokevirtual   #129 <Method String Locale.getCountry()>
	//    2    6:getstatic       #133 <Field Locale Locale.CHINA>
	//    3    9:invokevirtual   #129 <Method String Locale.getCountry()>
	//    4   12:invokevirtual   #139 <Method boolean String.equals(Object)>
	//    5   15:ifeq            37
_L1:
		Object obj = ((Object) (new aa(((List) (SupportedCountries.getList())))));
	//    6   18:new             #141 <Class aa>
	//    7   21:dup             
	//    8   22:invokestatic    #147 <Method ArrayList SupportedCountries.getList()>
	//    9   25:invokespecial   #150 <Method void aa(List)>
	//   10   28:astore_2        
_L6:
		j = ((aa) (obj));
	//   11   29:aload_0         
	//   12   30:aload_2         
	//   13   31:putfield        #152 <Field aa j>
		break; /* Loop/switch isn't completed */
	//   14   34:goto            187
_L2:
		ArrayList arraylist;
		obj = ((Object) ((new JSONObject(f.getSupportedCountriesString())).getJSONArray("countries")));
	//   15   37:new             #154 <Class JSONObject>
	//   16   40:dup             
	//   17   41:aload_0         
	//   18   42:getfield        #72  <Field CustomerCareRestClient f>
	//   19   45:invokeinterface #159 <Method String CustomerCareRestClient.getSupportedCountriesString()>
	//   20   50:invokespecial   #161 <Method void JSONObject(String)>
	//   21   53:ldc1            #163 <String "countries">
	//   22   55:invokevirtual   #167 <Method JSONArray JSONObject.getJSONArray(String)>
	//   23   58:astore_2        
		arraylist = new ArrayList();
	//   24   59:new             #42  <Class ArrayList>
	//   25   62:dup             
	//   26   63:invokespecial   #43  <Method void ArrayList()>
	//   27   66:astore_3        
		int i1 = 0;
	//   28   67:iconst_0        
	//   29   68:istore_1        
_L4:
		if(i1 >= ((JSONArray) (obj)).length())
			break; /* Loop/switch isn't completed */
	//   30   69:iload_1         
	//   31   70:aload_2         
	//   32   71:invokevirtual   #173 <Method int JSONArray.length()>
	//   33   74:icmpge          96
		((List) (arraylist)).add(((Object) (((JSONArray) (obj)).getString(i1))));
	//   34   77:aload_3         
	//   35   78:aload_2         
	//   36   79:iload_1         
	//   37   80:invokevirtual   #177 <Method String JSONArray.getString(int)>
	//   38   83:invokeinterface #182 <Method boolean List.add(Object)>
	//   39   88:pop             
		i1++;
	//   40   89:iload_1         
	//   41   90:iconst_1        
	//   42   91:iadd            
	//   43   92:istore_1        
		if(true) goto _L4; else goto _L3
	//   44   93:goto            69
_L3:
		try
		{
			j = new aa(((List) (arraylist)));
	//   45   96:aload_0         
	//   46   97:new             #141 <Class aa>
	//   47  100:dup             
	//   48  101:aload_3         
	//   49  102:invokespecial   #150 <Method void aa(List)>
	//   50  105:putfield        #152 <Field aa j>
		}
	//*  51  108:goto            140
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  52  111:astore_2        
		{
			o.e(h, ((Exception) (obj)).getMessage());
	//   53  112:getstatic       #184 <Field String h>
	//   54  115:aload_2         
	//   55  116:invokevirtual   #187 <Method String Exception.getMessage()>
	//   56  119:invokestatic    #192 <Method void o.e(String, String)>
			j = new aa(((List) (new ArrayList())));
	//   57  122:aload_0         
	//   58  123:new             #141 <Class aa>
	//   59  126:dup             
	//   60  127:new             #42  <Class ArrayList>
	//   61  130:dup             
	//   62  131:invokespecial   #43  <Method void ArrayList()>
	//   63  134:invokespecial   #150 <Method void aa(List)>
	//   64  137:putfield        #152 <Field aa j>
		}
		if(j.a != null && !j.a.isEmpty())
			break; /* Loop/switch isn't completed */
	//   65  140:aload_0         
	//   66  141:getfield        #152 <Field aa j>
	//   67  144:getfield        #194 <Field List aa.a>
	//   68  147:ifnull          165
	//   69  150:aload_0         
	//   70  151:getfield        #152 <Field aa j>
	//   71  154:getfield        #194 <Field List aa.a>
	//   72  157:invokeinterface #198 <Method boolean List.isEmpty()>
	//   73  162:ifeq            187
		o.d(h, "Sitecore call failed! Using hardcoded country list instead.");
	//   74  165:getstatic       #184 <Field String h>
	//   75  168:ldc1            #200 <String "Sitecore call failed! Using hardcoded country list instead.">
	//   76  170:invokestatic    #202 <Method void o.d(String, String)>
		obj = ((Object) (new aa(((List) (SupportedCountries.getList())))));
	//   77  173:new             #141 <Class aa>
	//   78  176:dup             
	//   79  177:invokestatic    #147 <Method ArrayList SupportedCountries.getList()>
	//   80  180:invokespecial   #150 <Method void aa(List)>
	//   81  183:astore_2        
		if(true) goto _L6; else goto _L5
	//   82  184:goto            29
_L5:
		Iterator iterator = j.a.iterator();
	//   83  187:aload_0         
	//   84  188:getfield        #152 <Field aa j>
	//   85  191:getfield        #194 <Field List aa.a>
	//   86  194:invokeinterface #206 <Method Iterator List.iterator()>
	//   87  199:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   88  200:aload_2         
	//   89  201:invokeinterface #211 <Method boolean Iterator.hasNext()>
	//   90  206:ifeq            295
			String s = (String)iterator.next();
	//   91  209:aload_2         
	//   92  210:invokeinterface #215 <Method Object Iterator.next()>
	//   93  215:checkcast       #135 <Class String>
	//   94  218:astore_3        
			Locale locale = new Locale(Locale.getDefault().getLanguage(), s);
	//   95  219:new             #121 <Class Locale>
	//   96  222:dup             
	//   97  223:invokestatic    #125 <Method Locale Locale.getDefault()>
	//   98  226:invokevirtual   #218 <Method String Locale.getLanguage()>
	//   99  229:aload_3         
	//  100  230:invokespecial   #220 <Method void Locale(String, String)>
	//  101  233:astore          4
			if(!locale.getDisplayCountry().equalsIgnoreCase(s) && locale.getDisplayCountry().length() != 0)
	//* 102  235:aload           4
	//* 103  237:invokevirtual   #223 <Method String Locale.getDisplayCountry()>
	//* 104  240:aload_3         
	//* 105  241:invokevirtual   #227 <Method boolean String.equalsIgnoreCase(String)>
	//* 106  244:ifne            200
	//* 107  247:aload           4
	//* 108  249:invokevirtual   #223 <Method String Locale.getDisplayCountry()>
	//* 109  252:invokevirtual   #228 <Method int String.length()>
	//* 110  255:ifne            261
	//* 111  258:goto            200
			{
				l.put(((Object) (locale.getDisplayCountry())), ((Object) (s)));
	//  112  261:aload_0         
	//  113  262:getfield        #50  <Field Map l>
	//  114  265:aload           4
	//  115  267:invokevirtual   #223 <Method String Locale.getDisplayCountry()>
	//  116  270:aload_3         
	//  117  271:invokeinterface #234 <Method Object Map.put(Object, Object)>
	//  118  276:pop             
				k.add(((Object) (locale.getDisplayCountry())));
	//  119  277:aload_0         
	//  120  278:getfield        #45  <Field List k>
	//  121  281:aload           4
	//  122  283:invokevirtual   #223 <Method String Locale.getDisplayCountry()>
	//  123  286:invokeinterface #182 <Method boolean List.add(Object)>
	//  124  291:pop             
			}
		} while(true);
	//  125  292:goto            200
		c();
	//  126  295:aload_0         
	//  127  296:invokevirtual   #236 <Method void c()>
		return;
	//  128  299:return          
	}

	public void c()
	{
		int i1;
label0:
		{
			String s = com.irobot.home.util.j.h(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #239 <Method String j.h(android.content.Context)>
	//    2    4:astore_2        
			i = new k(((android.content.Context) (this)), k);
	//    3    5:aload_0         
	//    4    6:new             #241 <Class k>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #45  <Field List k>
	//    9   15:invokespecial   #244 <Method void k(android.content.Context, List)>
	//   10   18:putfield        #59  <Field k i>
			e.setAdapter(((android.widget.ListAdapter) (i)));
	//   11   21:aload_0         
	//   12   22:getfield        #246 <Field ListView e>
	//   13   25:aload_0         
	//   14   26:getfield        #59  <Field k i>
	//   15   29:invokevirtual   #252 <Method void ListView.setAdapter(android.widget.ListAdapter)>
			e.setOnItemClickListener(m);
	//   16   32:aload_0         
	//   17   33:getfield        #246 <Field ListView e>
	//   18   36:aload_0         
	//   19   37:getfield        #55  <Field android.widget.AdapterView$OnItemClickListener m>
	//   20   40:invokevirtual   #256 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			s = (new Locale(Locale.getDefault().getLanguage(), s)).getDisplayCountry();
	//   21   43:new             #121 <Class Locale>
	//   22   46:dup             
	//   23   47:invokestatic    #125 <Method Locale Locale.getDefault()>
	//   24   50:invokevirtual   #218 <Method String Locale.getLanguage()>
	//   25   53:aload_2         
	//   26   54:invokespecial   #220 <Method void Locale(String, String)>
	//   27   57:invokevirtual   #223 <Method String Locale.getDisplayCountry()>
	//   28   60:astore_2        
			for(i1 = 0; i1 < k.size(); i1++)
	//*  29   61:iconst_0        
	//*  30   62:istore_1        
	//*  31   63:iload_1         
	//*  32   64:aload_0         
	//*  33   65:getfield        #45  <Field List k>
	//*  34   68:invokeinterface #259 <Method int List.size()>
	//*  35   73:icmpge          106
				if(((String)k.get(i1)).equals(((Object) (s))))
	//*  36   76:aload_0         
	//*  37   77:getfield        #45  <Field List k>
	//*  38   80:iload_1         
	//*  39   81:invokeinterface #263 <Method Object List.get(int)>
	//*  40   86:checkcast       #135 <Class String>
	//*  41   89:aload_2         
	//*  42   90:invokevirtual   #139 <Method boolean String.equals(Object)>
	//*  43   93:ifeq            99
					break label0;
	//   44   96:goto            108

	//   45   99:iload_1         
	//   46  100:iconst_1        
	//   47  101:iadd            
	//   48  102:istore_1        
	//*  49  103:goto            63
			i1 = 0;
	//   50  106:iconst_0        
	//   51  107:istore_1        
		}
		e.setSelectionFromTop(i1, 0);
	//   52  108:aload_0         
	//   53  109:getfield        #246 <Field ListView e>
	//   54  112:iload_1         
	//   55  113:iconst_0        
	//   56  114:invokevirtual   #267 <Method void ListView.setSelectionFromTop(int, int)>
		d.addTextChangedListener(new TextWatcher() {

			public void afterTextChanged(Editable editable)
			{
				CountryPickerActivity.a(a).getFilter().filter(((CharSequence) (editable)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CountryPickerActivity a>
			//    2    4:invokestatic    #25  <Method k CountryPickerActivity.a(CountryPickerActivity)>
			//    3    7:invokevirtual   #31  <Method Filter k.getFilter()>
			//    4   10:aload_1         
			//    5   11:invokevirtual   #37  <Method void Filter.filter(CharSequence)>
			//    6   14:return          
			}

			public void beforeTextChanged(CharSequence charsequence, int j1, int k1, int l1)
			{
			//    0    0:return          
			}

			public void onTextChanged(CharSequence charsequence, int j1, int k1, int l1)
			{
			//    0    0:return          
			}

			final CountryPickerActivity a;

			
			{
				a = CountryPickerActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CountryPickerActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   57  117:aload_0         
	//   58  118:getfield        #269 <Field EditText d>
	//   59  121:new             #8   <Class CountryPickerActivity$2>
	//   60  124:dup             
	//   61  125:aload_0         
	//   62  126:invokespecial   #270 <Method void CountryPickerActivity$2(CountryPickerActivity)>
	//   63  129:invokevirtual   #276 <Method void EditText.addTextChangedListener(TextWatcher)>
	//   64  132:return          
	}

	public void onBackPressed()
	{
		if(!g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #279 <Field boolean g>
	//*   2    4:ifne            11
			super.onBackPressed();
	//    3    7:aload_0         
	//    4    8:invokespecial   #281 <Method void BaseListActivity.onBackPressed()>
	//    5   11:return          
	}

	private static final String h = "CountryPickerActivity";
	IRobotApplication c;
	EditText d;
	ListView e;
	CustomerCareRestClient f;
	boolean g;
	private k i;
	private aa j;
	private List k;
	private Map l;
	private android.widget.AdapterView.OnItemClickListener m;

	static 
	{
	//    0    0:return          
	}
}
