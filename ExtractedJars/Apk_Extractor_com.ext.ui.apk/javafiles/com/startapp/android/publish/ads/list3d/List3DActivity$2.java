// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.list3d;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.adsCommon.d.b;
import java.util.List;

// Referenced classes of package com.startapp.android.publish.ads.list3d:
//			List3DActivity, ListItem, f, e

class List3DActivity$2
	implements android.widget.mClickListener
{

	private void a(String s, String s1, String s2, String s3)
	{
		c.a(s, s1, s2, ((android.content.Context) (a)), new b(a.b));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #19  <Field List3DActivity a>
	//    5    7:new             #26  <Class b>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #19  <Field List3DActivity a>
	//    9   15:getfield        #30  <Field String com.startapp.android.publish.ads.list3d.List3DActivity.b>
	//   10   18:invokespecial   #33  <Method void b(String)>
	//   11   21:invokestatic    #38  <Method void c.a(String, String, String, android.content.Context, b)>
		a.finish();
	//   12   24:aload_0         
	//   13   25:getfield        #19  <Field List3DActivity a>
	//   14   28:invokevirtual   #41  <Method void List3DActivity.finish()>
	//   15   31:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		adapterview = ((AdapterView) (((ListItem)a.c.get(i)).b()));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List3DActivity a>
	//    2    4:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
	//    3    7:iload_3         
	//    4    8:invokeinterface #53  <Method Object List.get(int)>
	//    5   13:checkcast       #55  <Class ListItem>
	//    6   16:invokevirtual   #58  <Method String com.startapp.android.publish.ads.list3d.ListItem.b()>
	//    7   19:astore_1        
		view = ((View) (((ListItem)a.c.get(i)).e()));
	//    8   20:aload_0         
	//    9   21:getfield        #19  <Field List3DActivity a>
	//   10   24:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
	//   11   27:iload_3         
	//   12   28:invokeinterface #53  <Method Object List.get(int)>
	//   13   33:checkcast       #55  <Class ListItem>
	//   14   36:invokevirtual   #61  <Method String ListItem.e()>
	//   15   39:astore_2        
		Object obj = ((Object) (((ListItem)a.c.get(i)).f()));
	//   16   40:aload_0         
	//   17   41:getfield        #19  <Field List3DActivity a>
	//   18   44:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
	//   19   47:iload_3         
	//   20   48:invokeinterface #53  <Method Object List.get(int)>
	//   21   53:checkcast       #55  <Class ListItem>
	//   22   56:invokevirtual   #64  <Method String ListItem.f()>
	//   23   59:astore          9
		boolean flag = ((ListItem)a.c.get(i)).l();
	//   24   61:aload_0         
	//   25   62:getfield        #19  <Field List3DActivity a>
	//   26   65:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
	//   27   68:iload_3         
	//   28   69:invokeinterface #53  <Method Object List.get(int)>
	//   29   74:checkcast       #55  <Class ListItem>
	//   30   77:invokevirtual   #68  <Method boolean ListItem.l()>
	//   31   80:istore          6
		boolean flag2 = ((ListItem)a.c.get(i)).m();
	//   32   82:aload_0         
	//   33   83:getfield        #19  <Field List3DActivity a>
	//   34   86:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
	//   35   89:iload_3         
	//   36   90:invokeinterface #53  <Method Object List.get(int)>
	//   37   95:checkcast       #55  <Class ListItem>
	//   38   98:invokevirtual   #71  <Method boolean ListItem.m()>
	//   39  101:istore          7
		String s = ((ListItem)a.c.get(i)).p();
	//   40  103:aload_0         
	//   41  104:getfield        #19  <Field List3DActivity a>
	//   42  107:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
	//   43  110:iload_3         
	//   44  111:invokeinterface #53  <Method Object List.get(int)>
	//   45  116:checkcast       #55  <Class ListItem>
	//   46  119:invokevirtual   #74  <Method String ListItem.p()>
	//   47  122:astore          10
		String s1 = ((ListItem)a.c.get(i)).o();
	//   48  124:aload_0         
	//   49  125:getfield        #19  <Field List3DActivity a>
	//   50  128:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
	//   51  131:iload_3         
	//   52  132:invokeinterface #53  <Method Object List.get(int)>
	//   53  137:checkcast       #55  <Class ListItem>
	//   54  140:invokevirtual   #77  <Method String ListItem.o()>
	//   55  143:astore          11
		Boolean boolean1 = ((ListItem)a.c.get(i)).s();
	//   56  145:aload_0         
	//   57  146:getfield        #19  <Field List3DActivity a>
	//   58  149:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
	//   59  152:iload_3         
	//   60  153:invokeinterface #53  <Method Object List.get(int)>
	//   61  158:checkcast       #55  <Class ListItem>
	//   62  161:invokevirtual   #81  <Method Boolean ListItem.s()>
	//   63  164:astore          12
		f.a().a(a.a).a(((ListItem)a.c.get(i)).c());
	//   64  166:invokestatic    #86  <Method f f.a()>
	//   65  169:aload_0         
	//   66  170:getfield        #19  <Field List3DActivity a>
	//   67  173:getfield        #88  <Field String List3DActivity.a>
	//   68  176:invokevirtual   #91  <Method e f.a(String)>
	//   69  179:aload_0         
	//   70  180:getfield        #19  <Field List3DActivity a>
	//   71  183:getfield        #47  <Field List com.startapp.android.publish.ads.list3d.List3DActivity.c>
	//   72  186:iload_3         
	//   73  187:invokeinterface #53  <Method Object List.get(int)>
	//   74  192:checkcast       #55  <Class ListItem>
	//   75  195:invokevirtual   #93  <Method String com.startapp.android.publish.ads.list3d.ListItem.c()>
	//   76  198:invokevirtual   #97  <Method void e.a(String)>
		if(s != null && !TextUtils.isEmpty(((CharSequence) (s))))
	//*  77  201:aload           10
	//*  78  203:ifnull          225
	//*  79  206:aload           10
	//*  80  208:invokestatic    #103 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  81  211:ifne            225
			a(s, s1, ((String) (adapterview)), ((String) (view)));
	//   82  214:aload_0         
	//   83  215:aload           10
	//   84  217:aload           11
	//   85  219:aload_1         
	//   86  220:aload_2         
	//   87  221:invokespecial   #105 <Method void a(String, String, String, String)>
		else
	//*  88  224:return          
		if(!TextUtils.isEmpty(((CharSequence) (adapterview))))
	//*  89  225:aload_1         
	//*  90  226:invokestatic    #103 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  91  229:ifne            224
		{
			boolean flag3 = c.a(a.getApplicationContext(), com.startapp.android.publish.common.model.cement.INAPP_OFFER_WALL);
	//   92  232:aload_0         
	//   93  233:getfield        #19  <Field List3DActivity a>
	//   94  236:invokevirtual   #109 <Method android.content.Context List3DActivity.getApplicationContext()>
	//   95  239:getstatic       #115 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_OFFER_WALL>
	//   96  242:invokestatic    #118 <Method boolean c.a(android.content.Context, com.startapp.android.publish.common.model.AdPreferences$Placement)>
	//   97  245:istore          8
			if(!flag || flag3)
	//*  98  247:iload           6
	//*  99  249:ifeq            257
	//* 100  252:iload           8
	//* 101  254:ifeq            311
			{
				obj = ((Object) (a));
	//  102  257:aload_0         
	//  103  258:getfield        #19  <Field List3DActivity a>
	//  104  261:astore          9
				b b1 = a.a();
	//  105  263:aload_0         
	//  106  264:getfield        #19  <Field List3DActivity a>
	//  107  267:invokevirtual   #121 <Method b List3DActivity.a()>
	//  108  270:astore          10
				boolean flag1;
				if(flag2 && !flag3)
	//* 109  272:iload           7
	//* 110  274:ifeq            305
	//* 111  277:iload           8
	//* 112  279:ifne            305
					flag1 = true;
	//  113  282:iconst_1        
	//  114  283:istore          6
				else
	//* 115  285:aload           9
	//* 116  287:aload_1         
	//* 117  288:aload_2         
	//* 118  289:aload           10
	//* 119  291:iload           6
	//* 120  293:iconst_0        
	//* 121  294:invokestatic    #124 <Method void c.a(android.content.Context, String, String, b, boolean, boolean)>
	//* 122  297:aload_0         
	//* 123  298:getfield        #19  <Field List3DActivity a>
	//* 124  301:invokevirtual   #41  <Method void List3DActivity.finish()>
	//* 125  304:return          
					flag1 = false;
	//  126  305:iconst_0        
	//  127  306:istore          6
				c.a(((android.content.Context) (obj)), ((String) (adapterview)), ((String) (view)), b1, flag1, false);
				a.finish();
				return;
			} else
	//* 128  308:goto            285
			{
				c.a(((android.content.Context) (a)), ((String) (adapterview)), ((String) (view)), ((String) (obj)), a.a(), com.startapp.android.publish.adsCommon.b.a().A(), flag2, boolean1, false, new Runnable() {

					public void run()
					{
						a.a.finish();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field List3DActivity$2 a>
					//    2    4:getfield        #25  <Field List3DActivity List3DActivity$2.a>
					//    3    7:invokevirtual   #30  <Method void List3DActivity.finish()>
					//    4   10:return          
					}

					final List3DActivity._cls2 a;

			
			{
				a = List3DActivity._cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field List3DActivity$2 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//  129  311:aload_0         
	//  130  312:getfield        #19  <Field List3DActivity a>
	//  131  315:aload_1         
	//  132  316:aload_2         
	//  133  317:aload           9
	//  134  319:aload_0         
	//  135  320:getfield        #19  <Field List3DActivity a>
	//  136  323:invokevirtual   #121 <Method b List3DActivity.a()>
	//  137  326:invokestatic    #129 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//  138  329:invokevirtual   #133 <Method long com.startapp.android.publish.adsCommon.b.A()>
	//  139  332:iload           7
	//  140  334:aload           12
	//  141  336:iconst_0        
	//  142  337:new             #13  <Class List3DActivity$2$1>
	//  143  340:dup             
	//  144  341:aload_0         
	//  145  342:invokespecial   #136 <Method void List3DActivity$2$1(List3DActivity$2)>
	//  146  345:invokestatic    #139 <Method void c.a(android.content.Context, String, String, String, b, long, boolean, Boolean, boolean, Runnable)>
				return;
	//  147  348:return          
			}
		}
	}

	final List3DActivity a;

	List3DActivity$2(List3DActivity list3dactivity)
	{
		a = list3dactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field List3DActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
