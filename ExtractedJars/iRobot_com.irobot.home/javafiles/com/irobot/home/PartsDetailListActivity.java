// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetImageLocation;
import com.irobot.core.AssetInfo;
import com.irobot.core.MaintenancePartCategory;
import com.irobot.core.MaintenanceUIService;
import com.irobot.core.MaintenanceUIServiceCommand;
import com.irobot.core.MaintenanceUIServiceData;
import com.irobot.core.MaintenanceUIServiceDataCallback;
import com.irobot.core.MaintenanceViewState;
import com.irobot.core.ViewId;
import com.irobot.home.b.x;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, MaintenanceCategoryActivity_

public class PartsDetailListActivity extends BaseFragmentActivity
{
	private final class a extends MaintenanceUIServiceDataCallback
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
						static class _cls3
						{

							static final int a[];

							static 
							{
								a = new int[MaintenanceViewState.values().length];
							//    0    0:invokestatic    #18  <Method MaintenanceViewState[] MaintenanceViewState.values()>
							//    1    3:arraylength     
							//    2    4:newarray        int[]
							//    3    6:putstatic       #20  <Field int[] a>
								try
								{
									a[MaintenanceViewState.ShowCareDescription.ordinal()] = 1;
							//    4    9:getstatic       #20  <Field int[] a>
							//    5   12:getstatic       #24  <Field MaintenanceViewState MaintenanceViewState.ShowCareDescription>
							//    6   15:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
							//    7   18:iconst_1        
							//    8   19:iastore         
								}
							//*   9   20:getstatic       #20  <Field int[] a>
							//*  10   23:getstatic       #31  <Field MaintenanceViewState MaintenanceViewState.ShowBuyParts>
							//*  11   26:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
							//*  12   29:iconst_2        
							//*  13   30:iastore         
							//*  14   31:getstatic       #20  <Field int[] a>
							//*  15   34:getstatic       #34  <Field MaintenanceViewState MaintenanceViewState.ShowCategoryListInProgress>
							//*  16   37:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
							//*  17   40:iconst_3        
							//*  18   41:iastore         
							//*  19   42:getstatic       #20  <Field int[] a>
							//*  20   45:getstatic       #37  <Field MaintenanceViewState MaintenanceViewState.HideCategoryListInProgress>
							//*  21   48:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
							//*  22   51:iconst_4        
							//*  23   52:iastore         
							//*  24   53:getstatic       #20  <Field int[] a>
							//*  25   56:getstatic       #40  <Field MaintenanceViewState MaintenanceViewState.UpdatePartCategoriesList>
							//*  26   59:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
							//*  27   62:iconst_5        
							//*  28   63:iastore         
							//*  29   64:getstatic       #20  <Field int[] a>
							//*  30   67:getstatic       #43  <Field MaintenanceViewState MaintenanceViewState.ShowCategoriesListTitle>
							//*  31   70:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
							//*  32   73:bipush          6
							//*  33   75:iastore         
							//*  34   76:getstatic       #20  <Field int[] a>
							//*  35   79:getstatic       #46  <Field MaintenanceViewState MaintenanceViewState.ShowConnectionWarning>
							//*  36   82:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
							//*  37   85:bipush          7
							//*  38   87:iastore         
							//*  39   88:getstatic       #20  <Field int[] a>
							//*  40   91:getstatic       #49  <Field MaintenanceViewState MaintenanceViewState.ShowUnableToLoadCategories>
							//*  41   94:invokevirtual   #28  <Method int MaintenanceViewState.ordinal()>
							//*  42   97:bipush          8
							//*  43   99:iastore         
							//*  44  100:return          
								catch(NoSuchFieldError nosuchfielderror) { }
							//   45  101:astore_0        
								try
								{
									a[MaintenanceViewState.ShowBuyParts.ordinal()] = 2;
								}
							//*  46  102:goto            20
								catch(NoSuchFieldError nosuchfielderror1) { }
							//   47  105:astore_0        
								try
								{
									a[MaintenanceViewState.ShowCategoryListInProgress.ordinal()] = 3;
								}
							//*  48  106:goto            31
								catch(NoSuchFieldError nosuchfielderror2) { }
							//   49  109:astore_0        
								try
								{
									a[MaintenanceViewState.HideCategoryListInProgress.ordinal()] = 4;
								}
							//*  50  110:goto            42
								catch(NoSuchFieldError nosuchfielderror3) { }
							//   51  113:astore_0        
								try
								{
									a[MaintenanceViewState.UpdatePartCategoriesList.ordinal()] = 5;
								}
							//*  52  114:goto            53
								catch(NoSuchFieldError nosuchfielderror4) { }
							//   53  117:astore_0        
								try
								{
									a[MaintenanceViewState.ShowCategoriesListTitle.ordinal()] = 6;
								}
							//*  54  118:goto            64
								catch(NoSuchFieldError nosuchfielderror5) { }
							//   55  121:astore_0        
								try
								{
									a[MaintenanceViewState.ShowConnectionWarning.ordinal()] = 7;
								}
							//*  56  122:goto            76
								catch(NoSuchFieldError nosuchfielderror6) { }
							//   57  125:astore_0        
								try
								{
									a[MaintenanceViewState.ShowUnableToLoadCategories.ordinal()] = 8;
								}
							//*  58  126:goto            88
								catch(NoSuchFieldError nosuchfielderror7) { }
							//   59  129:astore_0        
							//*  60  130:return          
							}
						}

						boolean flag;
						switch(com.irobot.home._cls3.a[((MaintenanceViewState) (obj)).ordinal()])
		//*  35   78:getstatic       #78  <Field int[] com.irobot.home.PartsDetailListActivity$3.a>
		//*  36   81:aload_3         
		//*  37   82:invokevirtual   #82  <Method int MaintenanceViewState.ordinal()>
		//*  38   85:iaload          
						{
		//*  39   86:tableswitch     1 8: default 132
		//		               1 303
		//		               2 281
		//		               3 266
		//		               4 256
		//		               5 203
		//		               6 189
		//		               7 179
		//		               8 169
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
		//   63  183:invokevirtual   #90  <Method void com.irobot.home.PartsDetailListActivity.j()>
							continue;
		//   64  186:goto            57

						case 6: // '\006'
							a.a(maintenanceuiservicedata.getCategoriesListTitle());
		//   65  189:aload_0         
		//   66  190:getfield        #12  <Field PartsDetailListActivity a>
		//   67  193:aload_1         
		//   68  194:invokevirtual   #93  <Method String MaintenanceUIServiceData.getCategoriesListTitle()>
		//   69  197:invokevirtual   #96  <Method void com.irobot.home.PartsDetailListActivity.a(String)>
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
		//  109  275:invokevirtual   #112 <Method void com.irobot.home.PartsDetailListActivity.a(boolean)>
						continue;
		//  110  278:goto            57
					}
					com.irobot.home.PartsDetailListActivity.a(a, maintenanceuiservicedata.getBuyPartsWebAddress());
		//  111  281:aload_0         
		//  112  282:getfield        #12  <Field PartsDetailListActivity a>
		//  113  285:aload_1         
		//  114  286:invokevirtual   #115 <Method String MaintenanceUIServiceData.getBuyPartsWebAddress()>
		//  115  289:invokestatic    #118 <Method String com.irobot.home.PartsDetailListActivity.a(PartsDetailListActivity, String)>
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

		private a()
		{
			a = PartsDetailListActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field PartsDetailListActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void MaintenanceUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public PartsDetailListActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void BaseFragmentActivity()>
		h = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #41  <Field int h>
		l = ((MaintenanceUIServiceDataCallback) (new a()));
	//    5    9:aload_0         
	//    6   10:new             #12  <Class PartsDetailListActivity$a>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:invokespecial   #44  <Method void PartsDetailListActivity$a(PartsDetailListActivity, PartsDetailListActivity$1)>
	//   11   19:putfield        #46  <Field MaintenanceUIServiceDataCallback l>
	//   12   22:return          
	}

	static String a(PartsDetailListActivity partsdetaillistactivity, String s)
	{
		partsdetaillistactivity.m = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field String m>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void a(PartsDetailListActivity partsdetaillistactivity)
	{
		partsdetaillistactivity.k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void k()>
	//    2    4:return          
	}

	private void k()
	{
		if(h < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field int h>
	//*   2    4:ifge            28
			h = c.getWidth() - getResources().getDimensionPixelSize(0x7f070068);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field ListView c>
	//    6   12:invokevirtual   #61  <Method int ListView.getWidth()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #65  <Method Resources getResources()>
	//    9   19:ldc1            #66  <Int 0x7f070068>
	//   10   21:invokevirtual   #72  <Method int Resources.getDimensionPixelSize(int)>
	//   11   24:isub            
	//   12   25:putfield        #41  <Field int h>
		String s = com.irobot.home.util.j.a(b).a().getSku();
	//   13   28:aload_0         
	//   14   29:getfield        #74  <Field String b>
	//   15   32:invokestatic    #79  <Method a j.a(String)>
	//   16   35:invokevirtual   #84  <Method AssetInfo a.a()>
	//   17   38:invokevirtual   #90  <Method String AssetInfo.getSku()>
	//   18   41:astore_3        
		g = new x(((android.content.Context) (this)), s, h);
	//   19   42:aload_0         
	//   20   43:new             #92  <Class x>
	//   21   46:dup             
	//   22   47:aload_0         
	//   23   48:aload_3         
	//   24   49:aload_0         
	//   25   50:getfield        #41  <Field int h>
	//   26   53:invokespecial   #95  <Method void x(android.content.Context, String, int)>
	//   27   56:putfield        #97  <Field x g>
		c.setAdapter(((android.widget.ListAdapter) (g)));
	//   28   59:aload_0         
	//   29   60:getfield        #55  <Field ListView c>
	//   30   63:aload_0         
	//   31   64:getfield        #97  <Field x g>
	//   32   67:invokevirtual   #101 <Method void ListView.setAdapter(android.widget.ListAdapter)>
		View view = LayoutInflater.from(((android.content.Context) (this))).inflate(0x7f0b012d, ((android.view.ViewGroup) (c)), false);
	//   33   70:aload_0         
	//   34   71:invokestatic    #107 <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//   35   74:ldc1            #108 <Int 0x7f0b012d>
	//   36   76:aload_0         
	//   37   77:getfield        #55  <Field ListView c>
	//   38   80:iconst_0        
	//   39   81:invokevirtual   #112 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   40   84:astore_2        
		int i1 = com.irobot.home.util.x.a(AssetImageLocation.CareMain, s);
	//   41   85:getstatic       #118 <Field AssetImageLocation AssetImageLocation.CareMain>
	//   42   88:aload_3         
	//   43   89:invokestatic    #123 <Method int com.irobot.home.util.x.a(AssetImageLocation, String)>
	//   44   92:istore_1        
		if(i1 != -1)
	//*  45   93:iload_1         
	//*  46   94:iconst_m1       
	//*  47   95:icmpeq          118
		{
			ImageView imageview = (ImageView)view.findViewById(0x7f090373);
	//   48   98:aload_2         
	//   49   99:ldc1            #124 <Int 0x7f090373>
	//   50  101:invokevirtual   #130 <Method View View.findViewById(int)>
	//   51  104:checkcast       #132 <Class ImageView>
	//   52  107:astore_3        
			imageview.setImageResource(i1);
	//   53  108:aload_3         
	//   54  109:iload_1         
	//   55  110:invokevirtual   #136 <Method void ImageView.setImageResource(int)>
			imageview.setImportantForAccessibility(2);
	//   56  113:aload_3         
	//   57  114:iconst_2        
	//   58  115:invokevirtual   #139 <Method void ImageView.setImportantForAccessibility(int)>
		}
		c.addHeaderView(view, ((Object) (null)), false);
	//   59  118:aload_0         
	//   60  119:getfield        #55  <Field ListView c>
	//   61  122:aload_2         
	//   62  123:aconst_null     
	//   63  124:iconst_0        
	//   64  125:invokevirtual   #143 <Method void ListView.addHeaderView(View, Object, boolean)>
	//   65  128:return          
	}

	protected void a(String s)
	{
		b(com.irobot.home.util.j.a(((android.content.Context) (this)), s, ((ArrayList) (null))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #147 <Method String j.a(android.content.Context, String, ArrayList)>
	//    5    7:invokevirtual   #149 <Method void b(String)>
	//    6   10:return          
	}

	protected void a(boolean flag)
	{
		ProgressBar progressbar = f;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field ProgressBar f>
	//    2    4:astore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			byte0 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            17
			byte0 = 8;
	//    8   14:bipush          8
	//    9   16:istore_2        
		progressbar.setVisibility(((int) (byte0)));
	//   10   17:aload_3         
	//   11   18:iload_2         
	//   12   19:invokevirtual   #157 <Method void ProgressBar.setVisibility(int)>
	//   13   22:return          
	}

	protected void b(String s)
	{
		e(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #159 <Method void e(String)>
	//    3    5:return          
	}

	void e()
	{
		k = Assembler.getInstance().getMaintenanceUIService(b);
	//    0    0:aload_0         
	//    1    1:invokestatic    #165 <Method Assembler Assembler.getInstance()>
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field String b>
	//    4    8:invokevirtual   #169 <Method MaintenanceUIService Assembler.getMaintenanceUIService(String)>
	//    5   11:putfield        #171 <Field MaintenanceUIService k>
		((CustomTextView)a.findViewById(0x7f09019d)).setText(0x7f0f017b);
	//    6   14:aload_0         
	//    7   15:getfield        #173 <Field View a>
	//    8   18:ldc1            #174 <Int 0x7f09019d>
	//    9   20:invokevirtual   #130 <Method View View.findViewById(int)>
	//   10   23:checkcast       #176 <Class CustomTextView>
	//   11   26:ldc1            #177 <Int 0x7f0f017b>
	//   12   28:invokevirtual   #180 <Method void CustomTextView.setText(int)>
		AssetInfo assetinfo = com.irobot.home.util.j.a(b).a();
	//   13   31:aload_0         
	//   14   32:getfield        #74  <Field String b>
	//   15   35:invokestatic    #79  <Method a j.a(String)>
	//   16   38:invokevirtual   #84  <Method AssetInfo a.a()>
	//   17   41:astore_1        
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.Care, assetinfo);
	//   18   42:invokestatic    #185 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   19   45:getstatic       #191 <Field ViewId ViewId.Care>
	//   20   48:aload_1         
	//   21   49:invokevirtual   #195 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
		c.post(new Runnable() {

			public void run()
			{
				com.irobot.home.PartsDetailListActivity.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PartsDetailListActivity a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.PartsDetailListActivity.a(PartsDetailListActivity)>
			//    3    7:return          
			}

			final PartsDetailListActivity a;

			
			{
				a = PartsDetailListActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PartsDetailListActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   22   52:aload_0         
	//   23   53:getfield        #55  <Field ListView c>
	//   24   56:new             #6   <Class PartsDetailListActivity$1>
	//   25   59:dup             
	//   26   60:aload_0         
	//   27   61:invokespecial   #197 <Method void PartsDetailListActivity$1(PartsDetailListActivity)>
	//   28   64:invokevirtual   #201 <Method boolean ListView.post(Runnable)>
	//   29   67:pop             
	//   30   68:return          
	}

	public void f()
	{
		com.irobot.home.util.j.a(((android.app.Activity) (this)), m);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #50  <Field String m>
	//    3    5:invokestatic    #204 <Method void j.a(android.app.Activity, String)>
		AnalyticsSubsystem.getInstance().trackStoreView();
	//    4    8:invokestatic    #185 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    5   11:invokevirtual   #207 <Method void AnalyticsSubsystem.trackStoreView()>
	//    6   14:return          
	}

	public void f(int i1)
	{
		MaintenancePartCategory maintenancepartcategory = g.a(i1 - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field x g>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:invokevirtual   #210 <Method MaintenancePartCategory x.a(int)>
	//    6   10:astore_2        
		if(maintenancepartcategory != null)
	//*   7   11:aload_2         
	//*   8   12:ifnull          37
			com.irobot.home.MaintenanceCategoryActivity_.a(((android.content.Context) (this))).a(b).b(maintenancepartcategory.getId()).a();
	//    9   15:aload_0         
	//   10   16:invokestatic    #215 <Method MaintenanceCategoryActivity_$a com.irobot.home.MaintenanceCategoryActivity_.a(android.content.Context)>
	//   11   19:aload_0         
	//   12   20:getfield        #74  <Field String b>
	//   13   23:invokevirtual   #220 <Method MaintenanceCategoryActivity_$a com.irobot.home.MaintenanceCategoryActivity_$a.a(String)>
	//   14   26:aload_2         
	//   15   27:invokevirtual   #225 <Method String MaintenancePartCategory.getId()>
	//   16   30:invokevirtual   #227 <Method MaintenanceCategoryActivity_$a MaintenanceCategoryActivity_$a.b(String)>
	//   17   33:invokevirtual   #230 <Method org.androidannotations.api.a.e com.irobot.home.MaintenanceCategoryActivity_$a.a()>
	//   18   36:pop             
	//   19   37:return          
	}

	public void g()
	{
		if(com.irobot.home.util.j.a(((android.support.v7.app.AppCompatActivity) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #233 <Method boolean j.a(android.support.v7.app.AppCompatActivity)>
	//*   2    4:ifeq            48
		{
			if(j == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #235 <Field AlertDialog j>
	//*   5   11:ifnonnull       41
			{
				j = (new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f0928).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    6   14:aload_0         
	//    7   15:new             #237 <Class android.app.AlertDialog$Builder>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #240 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   11   23:ldc1            #241 <Int 0x7f0f0928>
	//   12   25:invokevirtual   #245 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   13   28:ldc1            #246 <Int 0x7f0f05bb>
	//   14   30:aconst_null     
	//   15   31:invokevirtual   #250 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   16   34:invokevirtual   #254 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   17   37:putfield        #235 <Field AlertDialog j>
				return;
	//   18   40:return          
			}
			j.show();
	//   19   41:aload_0         
	//   20   42:getfield        #235 <Field AlertDialog j>
	//   21   45:invokevirtual   #258 <Method void AlertDialog.show()>
		}
	//   22   48:return          
	}

	protected void h()
	{
		e.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field LinearLayout e>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #263 <Method void LinearLayout.setVisibility(int)>
	//    4    8:return          
	}

	protected void i()
	{
		a.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field View a>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #264 <Method void View.setVisibility(int)>
	//    4    8:return          
	}

	protected void j()
	{
		if(i == null && com.irobot.home.util.j.a(((android.support.v7.app.AppCompatActivity) (this))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #266 <Field AlertDialog i>
	//*   2    4:ifnonnull       49
	//*   3    7:aload_0         
	//*   4    8:invokestatic    #233 <Method boolean j.a(android.support.v7.app.AppCompatActivity)>
	//*   5   11:ifeq            49
		{
			i = (new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f04db).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					a.finish();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field PartsDetailListActivity a>
				//    2    4:invokevirtual   #25  <Method void PartsDetailListActivity.finish()>
				//    3    7:return          
				}

				final PartsDetailListActivity a;

			
			{
				a = PartsDetailListActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PartsDetailListActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
).show();
	//    6   14:aload_0         
	//    7   15:new             #237 <Class android.app.AlertDialog$Builder>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #240 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   11   23:ldc2            #267 <Int 0x7f0f04db>
	//   12   26:invokevirtual   #245 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   13   29:ldc1            #246 <Int 0x7f0f05bb>
	//   14   31:new             #8   <Class PartsDetailListActivity$2>
	//   15   34:dup             
	//   16   35:aload_0         
	//   17   36:invokespecial   #268 <Method void PartsDetailListActivity$2(PartsDetailListActivity)>
	//   18   39:invokevirtual   #250 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   19   42:invokevirtual   #254 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   20   45:putfield        #266 <Field AlertDialog i>
			return;
	//   21   48:return          
		} else
		{
			i.show();
	//   22   49:aload_0         
	//   23   50:getfield        #266 <Field AlertDialog i>
	//   24   53:invokevirtual   #258 <Method void AlertDialog.show()>
			return;
	//   25   56:return          
		}
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #271 <Method void BaseFragmentActivity.onPause()>
		if(i != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #266 <Field AlertDialog i>
	//*   4    8:ifnull          18
			i.dismiss();
	//    5   11:aload_0         
	//    6   12:getfield        #266 <Field AlertDialog i>
	//    7   15:invokevirtual   #274 <Method void AlertDialog.dismiss()>
		if(j != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #235 <Field AlertDialog j>
	//*  10   22:ifnull          32
			j.dismiss();
	//   11   25:aload_0         
	//   12   26:getfield        #235 <Field AlertDialog j>
	//   13   29:invokevirtual   #274 <Method void AlertDialog.dismiss()>
	//   14   32:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #277 <Method void BaseFragmentActivity.onResume()>
		k.sendCommand(MaintenanceUIServiceCommand.RetrieveCategories, ((MaintenanceUIServiceData) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #171 <Field MaintenanceUIService k>
	//    4    8:getstatic       #283 <Field MaintenanceUIServiceCommand MaintenanceUIServiceCommand.RetrieveCategories>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #289 <Method void MaintenanceUIService.sendCommand(MaintenanceUIServiceCommand, MaintenanceUIServiceData)>
	//    7   15:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #292 <Method void BaseFragmentActivity.onStart()>
		k.registerUISubscriber(l);
	//    2    4:aload_0         
	//    3    5:getfield        #171 <Field MaintenanceUIService k>
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field MaintenanceUIServiceDataCallback l>
	//    6   12:invokevirtual   #296 <Method boolean MaintenanceUIService.registerUISubscriber(MaintenanceUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #299 <Method void BaseFragmentActivity.onStop()>
		k.unregisterSubscriber(l);
	//    2    4:aload_0         
	//    3    5:getfield        #171 <Field MaintenanceUIService k>
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field MaintenanceUIServiceDataCallback l>
	//    6   12:invokevirtual   #302 <Method boolean MaintenanceUIService.unregisterSubscriber(MaintenanceUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	View a;
	String b;
	ListView c;
	View d;
	LinearLayout e;
	ProgressBar f;
	x g;
	private int h;
	private AlertDialog i;
	private AlertDialog j;
	private MaintenanceUIService k;
	private MaintenanceUIServiceDataCallback l;
	private String m;
}
