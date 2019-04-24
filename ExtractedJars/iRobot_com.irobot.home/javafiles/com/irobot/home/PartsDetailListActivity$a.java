// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.*;
import com.irobot.home.b.x;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			PartsDetailListActivity

private final class PartsDetailListActivity$a extends MaintenanceUIServiceDataCallback
{

	public void onMaintenanceUIServiceDataChanged(MaintenanceUIServiceData maintenanceuiservicedata)
	{
		if(maintenanceuiservicedata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			o.e("PartsDetailListActivity", "MaintenanceUIServiceData was null.");
	//    2    4:ldc1            #23  <String "PartsDetailListActivity">
	//    3    6:ldc1            #25  <String "MaintenanceUIServiceData was null.">
	//    4    8:invokestatic    #31  <Method void o.e(String, String)>
			return;
	//    5   11:return          
		}
		ArrayList arraylist = maintenanceuiservicedata.getViewStateChangelist();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #37  <Method ArrayList MaintenanceUIServiceData.getViewStateChangelist()>
	//    8   16:astore_3        
		Object obj1 = ((Object) (new StringBuilder()));
	//    9   17:new             #39  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #40  <Method void StringBuilder()>
	//   12   24:astore          4
		((StringBuilder) (obj1)).append("View states: ");
	//   13   26:aload           4
	//   14   28:ldc1            #42  <String "View states: ">
	//   15   30:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		((StringBuilder) (obj1)).append(((Object) (arraylist)));
	//   17   34:aload           4
	//   18   36:aload_3         
	//   19   37:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
	//   20   40:pop             
		o.a("PartsDetailListActivity", ((StringBuilder) (obj1)).toString());
	//   21   41:ldc1            #23  <String "PartsDetailListActivity">
	//   22   43:aload           4
	//   23   45:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   24   48:invokestatic    #55  <Method void o.a(String, String)>
		obj1 = ((Object) (arraylist.iterator()));
	//   25   51:aload_3         
	//   26   52:invokevirtual   #61  <Method Iterator ArrayList.iterator()>
	//   27   55:astore          4
label0:
		do
		{
label1:
			{
label2:
				{
					if(!((Iterator) (obj1)).hasNext())
						break label0;
	//   28   57:aload           4
	//   29   59:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   30   64:ifeq            313
					Object obj = ((Object) ((MaintenanceViewState)((Iterator) (obj1)).next()));
	//   31   67:aload           4
	//   32   69:invokeinterface #71  <Method Object Iterator.next()>
	//   33   74:checkcast       #73  <Class MaintenanceViewState>
	//   34   77:astore_3        
					boolean flag;
					switch(PartsDetailListActivity$3.a[((MaintenanceViewState) (obj)).ordinal()])
	//*  35   78:getstatic       #78  <Field int[] PartsDetailListActivity$3.a>
	//*  36   81:aload_3         
	//*  37   82:invokevirtual   #82  <Method int MaintenanceViewState.ordinal()>
	//*  38   85:iaload          
					{
	//*  39   86:tableswitch     1 8: default 132
	//	               1 303
	//	               2 281
	//	               3 266
	//	               4 256
	//	               5 203
	//	               6 189
	//	               7 179
	//	               8 169
					default:
						StringBuilder stringbuilder = new StringBuilder();
	//   40  132:new             #39  <Class StringBuilder>
	//   41  135:dup             
	//   42  136:invokespecial   #40  <Method void StringBuilder()>
	//   43  139:astore          5
						stringbuilder.append("Failed to process view state: ");
	//   44  141:aload           5
	//   45  143:ldc1            #84  <String "Failed to process view state: ">
	//   46  145:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   47  148:pop             
						stringbuilder.append(obj);
	//   48  149:aload           5
	//   49  151:aload_3         
	//   50  152:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
	//   51  155:pop             
						o.a("PartsDetailListActivity", stringbuilder.toString());
	//   52  156:ldc1            #23  <String "PartsDetailListActivity">
	//   53  158:aload           5
	//   54  160:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   55  163:invokestatic    #55  <Method void o.a(String, String)>
						continue;
	//   56  166:goto            57

					case 1: // '\001'
						break label1;

					case 2: // '\002'
						break label2;

					case 8: // '\b'
						a.g();
	//   57  169:aload_0         
	//   58  170:getfield        #12  <Field PartsDetailListActivity a>
	//   59  173:invokevirtual   #87  <Method void PartsDetailListActivity.g()>
						continue;
	//   60  176:goto            57

					case 7: // '\007'
						a.j();
	//   61  179:aload_0         
	//   62  180:getfield        #12  <Field PartsDetailListActivity a>
	//   63  183:invokevirtual   #90  <Method void PartsDetailListActivity.j()>
						continue;
	//   64  186:goto            57

					case 6: // '\006'
						a.a(maintenanceuiservicedata.getCategoriesListTitle());
	//   65  189:aload_0         
	//   66  190:getfield        #12  <Field PartsDetailListActivity a>
	//   67  193:aload_1         
	//   68  194:invokevirtual   #93  <Method String MaintenanceUIServiceData.getCategoriesListTitle()>
	//   69  197:invokevirtual   #96  <Method void PartsDetailListActivity.a(String)>
						continue;
	//   70  200:goto            57

					case 5: // '\005'
						obj = ((Object) (maintenanceuiservicedata.getMaintenanceCategories()));
	//   71  203:aload_1         
	//   72  204:invokevirtual   #99  <Method ArrayList MaintenanceUIServiceData.getMaintenanceCategories()>
	//   73  207:astore_3        
						StringBuilder stringbuilder1 = new StringBuilder();
	//   74  208:new             #39  <Class StringBuilder>
	//   75  211:dup             
	//   76  212:invokespecial   #40  <Method void StringBuilder()>
	//   77  215:astore          5
						stringbuilder1.append("Categories: ");
	//   78  217:aload           5
	//   79  219:ldc1            #101 <String "Categories: ">
	//   80  221:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   81  224:pop             
						stringbuilder1.append(obj);
	//   82  225:aload           5
	//   83  227:aload_3         
	//   84  228:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
	//   85  231:pop             
						o.a("PartsDetailListActivity", stringbuilder1.toString());
	//   86  232:ldc1            #23  <String "PartsDetailListActivity">
	//   87  234:aload           5
	//   88  236:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   89  239:invokestatic    #55  <Method void o.a(String, String)>
						a.g.a(((ArrayList) (obj)));
	//   90  242:aload_0         
	//   91  243:getfield        #12  <Field PartsDetailListActivity a>
	//   92  246:getfield        #104 <Field x PartsDetailListActivity.g>
	//   93  249:aload_3         
	//   94  250:invokevirtual   #109 <Method void x.a(ArrayList)>
						continue;
	//   95  253:goto            57

					case 4: // '\004'
						obj = ((Object) (a));
	//   96  256:aload_0         
	//   97  257:getfield        #12  <Field PartsDetailListActivity a>
	//   98  260:astore_3        
						flag = false;
	//   99  261:iconst_0        
	//  100  262:istore_2        
						break;
	//  101  263:goto            273

					case 3: // '\003'
						obj = ((Object) (a));
	//  102  266:aload_0         
	//  103  267:getfield        #12  <Field PartsDetailListActivity a>
	//  104  270:astore_3        
						flag = true;
	//  105  271:iconst_1        
	//  106  272:istore_2        
						break;
					}
					((PartsDetailListActivity) (obj)).a(flag);
	//  107  273:aload_3         
	//  108  274:iload_2         
	//  109  275:invokevirtual   #112 <Method void PartsDetailListActivity.a(boolean)>
					continue;
	//  110  278:goto            57
				}
				PartsDetailListActivity.a(a, maintenanceuiservicedata.getBuyPartsWebAddress());
	//  111  281:aload_0         
	//  112  282:getfield        #12  <Field PartsDetailListActivity a>
	//  113  285:aload_1         
	//  114  286:invokevirtual   #115 <Method String MaintenanceUIServiceData.getBuyPartsWebAddress()>
	//  115  289:invokestatic    #118 <Method String PartsDetailListActivity.a(PartsDetailListActivity, String)>
	//  116  292:pop             
				a.i();
	//  117  293:aload_0         
	//  118  294:getfield        #12  <Field PartsDetailListActivity a>
	//  119  297:invokevirtual   #121 <Method void PartsDetailListActivity.i()>
				continue;
	//  120  300:goto            57
			}
			a.h();
	//  121  303:aload_0         
	//  122  304:getfield        #12  <Field PartsDetailListActivity a>
	//  123  307:invokevirtual   #124 <Method void PartsDetailListActivity.h()>
		} while(true);
	//  124  310:goto            57
	//  125  313:return          
	}

	final PartsDetailListActivity a;

	private PartsDetailListActivity$a(PartsDetailListActivity partsdetaillistactivity)
	{
		a = partsdetaillistactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field PartsDetailListActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void MaintenanceUIServiceDataCallback()>
	//    5    9:return          
	}

	PartsDetailListActivity$a(PartsDetailListActivity partsdetaillistactivity, PartsDetailListActivity$1 partsdetaillistactivity$1)
	{
		this(partsdetaillistactivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void PartsDetailListActivity$a(PartsDetailListActivity)>
	//    3    5:return          
	}
}
