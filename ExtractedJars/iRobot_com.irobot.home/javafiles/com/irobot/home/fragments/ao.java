// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.text.Html;
import android.webkit.*;
import android.widget.TextView;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.*;
import com.irobot.home.view.WebViewLanguageCompat;
import java.util.*;

// Referenced classes of package com.irobot.home.fragments:
//			j

public class ao extends com.irobot.home.fragments.j
{
	private class a extends SettingsUIServiceDataCallback
	{

		public void onSettingsUIServiceDataChanged(SettingsUIServiceData settingsuiservicedata)
		{
			if(settingsuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				o.d(ao.b(), "Service data is null.");
		//    2    4:invokestatic    #25  <Method String ao.b()>
		//    3    7:ldc1            #27  <String "Service data is null.">
		//    4    9:invokestatic    #33  <Method void o.d(String, String)>
				return;
		//    5   12:return          
			} else
			{
				settingsuiservicedata = ((SettingsUIServiceData) (settingsuiservicedata.getAvailableSettings()));
		//    6   13:aload_1         
		//    7   14:invokevirtual   #39  <Method HashSet SettingsUIServiceData.getAvailableSettings()>
		//    8   17:astore_1        
				com.irobot.home.fragments.ao.a(a, ((HashSet) (settingsuiservicedata)).contains(((Object) (SettingType.AreaCleaned))));
		//    9   18:aload_0         
		//   10   19:getfield        #12  <Field ao a>
		//   11   22:aload_1         
		//   12   23:getstatic       #45  <Field SettingType SettingType.AreaCleaned>
		//   13   26:invokevirtual   #51  <Method boolean HashSet.contains(Object)>
		//   14   29:invokestatic    #54  <Method boolean com.irobot.home.fragments.ao.a(ao, boolean)>
		//   15   32:pop             
				com.irobot.home.fragments.ao.a(a);
		//   16   33:aload_0         
		//   17   34:getfield        #12  <Field ao a>
		//   18   37:invokestatic    #56  <Method void com.irobot.home.fragments.ao.a(ao)>
				return;
		//   19   40:return          
			}
		}

		final ao a;

		private a()
		{
			a = ao.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ao a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void SettingsUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public ao()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void com.irobot.home.fragments.j()>
		j = ((SettingsUIServiceDataCallback) (new a()));
	//    2    4:aload_0         
	//    3    5:new             #12  <Class ao$a>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #54  <Method void ao$a(ao, ao$1)>
	//    8   14:putfield        #56  <Field SettingsUIServiceDataCallback j>
		k = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #58  <Field int k>
		l = ((HistoryUIServiceDataCallback) (new HistoryUIServiceDataCallback() {

			public void onHistoryUIServiceDataChanged(HistoryUIServiceData historyuiservicedata)
			{
				Iterator iterator = historyuiservicedata.getDataStates().iterator();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #24  <Method ArrayList HistoryUIServiceData.getDataStates()>
			//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
			//    3    7:astore_2        
				do
				{
					if(!iterator.hasNext())
						break;
			//    4    8:aload_2         
			//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
			//    6   14:ifeq            93
					HistoryDataState historydatastate = (HistoryDataState)iterator.next();
			//    7   17:aload_2         
			//    8   18:invokeinterface #40  <Method Object Iterator.next()>
			//    9   23:checkcast       #42  <Class HistoryDataState>
			//   10   26:astore_3        
					o.a(ao.b(), historydatastate.name());
			//   11   27:invokestatic    #46  <Method String ao.b()>
			//   12   30:aload_3         
			//   13   31:invokevirtual   #49  <Method String HistoryDataState.name()>
			//   14   34:invokestatic    #54  <Method void o.a(String, String)>
					static class _cls3
					{

						static final int a[];

						static 
						{
							a = new int[HistoryDataState.values().length];
						//    0    0:invokestatic    #18  <Method HistoryDataState[] HistoryDataState.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #20  <Field int[] a>
							try
							{
								a[HistoryDataState.Accumulated.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field HistoryDataState HistoryDataState.Accumulated>
						//    6   15:invokevirtual   #28  <Method int HistoryDataState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #20  <Field int[] a>
						//*  10   23:getstatic       #31  <Field HistoryDataState HistoryDataState.MissionsAreaCleanedChart>
						//*  11   26:invokevirtual   #28  <Method int HistoryDataState.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   15   32:astore_0        
							try
							{
								a[HistoryDataState.MissionsAreaCleanedChart.ordinal()] = 2;
							}
						//*  16   33:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   17   36:astore_0        
						//*  18   37:return          
						}
					}

					switch(com.irobot.home.fragments._cls3.a[historydatastate.ordinal()])
			//*  15   37:getstatic       #59  <Field int[] com.irobot.home.fragments.ao$3.a>
			//*  16   40:aload_3         
			//*  17   41:invokevirtual   #63  <Method int HistoryDataState.ordinal()>
			//*  18   44:iaload          
					{
			//*  19   45:tableswitch     1 2: default 68
			//			               1 82
			//			               2 71
			//*  20   68:goto            8
					case 2: // '\002'
						ao.b(a, historyuiservicedata);
			//   21   71:aload_0         
			//   22   72:getfield        #12  <Field ao a>
			//   23   75:aload_1         
			//   24   76:invokestatic    #66  <Method void ao.b(ao, HistoryUIServiceData)>
						break;

			//*  25   79:goto            8
					case 1: // '\001'
						com.irobot.home.fragments.ao.a(a, historyuiservicedata);
			//   26   82:aload_0         
			//   27   83:getfield        #12  <Field ao a>
			//   28   86:aload_1         
			//   29   87:invokestatic    #68  <Method void com.irobot.home.fragments.ao.a(ao, HistoryUIServiceData)>
						break;
					}
				} while(true);
			//*  30   90:goto            8
			//   31   93:return          
			}

			final ao a;

			
			{
				a = ao.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field ao a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void HistoryUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   12   22:aload_0         
	//   13   23:new             #6   <Class ao$1>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:invokespecial   #61  <Method void ao$1(ao)>
	//   17   31:putfield        #63  <Field HistoryUIServiceDataCallback l>
	//   18   34:return          
	}

	private void a(HistoryUIServiceData historyuiservicedata)
	{
		k = historyuiservicedata.getAccumulatedTotalSquareFeetCleaned();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #70  <Method int HistoryUIServiceData.getAccumulatedTotalSquareFeetCleaned()>
	//    3    5:putfield        #58  <Field int k>
		c();
	//    4    8:aload_0         
	//    5    9:invokespecial   #72  <Method void c()>
	//    6   12:return          
	}

	static void a(ao ao1)
	{
		ao1.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void c()>
	//    2    4:return          
	}

	static void a(ao ao1, HistoryUIServiceData historyuiservicedata)
	{
		ao1.a(historyuiservicedata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #75  <Method void a(HistoryUIServiceData)>
	//    3    5:return          
	}

	static boolean a(ao ao1, boolean flag)
	{
		ao1.f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field boolean f>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static String b()
	{
		return d;
	//    0    0:getstatic       #47  <Field String d>
	//    1    3:areturn         
	}

	private void b(HistoryUIServiceData historyuiservicedata)
	{
		a(historyuiservicedata.getMissionsAreaCleanedChartData());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #81  <Method String HistoryUIServiceData.getMissionsAreaCleanedChartData()>
	//    3    5:invokevirtual   #84  <Method void a(String)>
	//    4    8:return          
	}

	static void b(ao ao1, HistoryUIServiceData historyuiservicedata)
	{
		ao1.b(historyuiservicedata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #86  <Method void b(HistoryUIServiceData)>
	//    3    5:return          
	}

	private void c()
	{
		if(isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #90  <Method boolean isAdded()>
	//*   2    4:ifeq            102
		{
			if(!f)
	//*   3    7:aload_0         
	//*   4    8:getfield        #78  <Field boolean f>
	//*   5   11:ifne            15
				return;
	//    6   14:return          
			c.setVisibility(0);
	//    7   15:aload_0         
	//    8   16:getfield        #92  <Field TextView c>
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #98  <Method void TextView.setVisibility(int)>
			b.setVisibility(0);
	//   11   23:aload_0         
	//   12   24:getfield        #100 <Field TextView b>
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #98  <Method void TextView.setVisibility(int)>
			if(i.f)
	//*  15   31:getstatic       #103 <Field boolean i.f>
	//*  16   34:ifeq            75
			{
				int i1 = (int)((float)k * 0.0929F);
	//   17   37:aload_0         
	//   18   38:getfield        #58  <Field int k>
	//   19   41:i2f             
	//   20   42:ldc1            #104 <Float 0.0929F>
	//   21   44:fmul            
	//   22   45:f2i             
	//   23   46:istore_1        
				c.setText(((CharSequence) (Html.fromHtml(getString(0x7f0f009d, new Object[] {
					Integer.valueOf(i1)
				})))));
	//   24   47:aload_0         
	//   25   48:getfield        #92  <Field TextView c>
	//   26   51:aload_0         
	//   27   52:ldc1            #105 <Int 0x7f0f009d>
	//   28   54:iconst_1        
	//   29   55:anewarray       Object[]
	//   30   58:dup             
	//   31   59:iconst_0        
	//   32   60:iload_1         
	//   33   61:invokestatic    #113 <Method Integer Integer.valueOf(int)>
	//   34   64:aastore         
	//   35   65:invokevirtual   #117 <Method String getString(int, Object[])>
	//   36   68:invokestatic    #123 <Method android.text.Spanned Html.fromHtml(String)>
	//   37   71:invokevirtual   #127 <Method void TextView.setText(CharSequence)>
				return;
	//   38   74:return          
			}
			c.setText(((CharSequence) (getString(0x7f0f009c, new Object[] {
				Integer.valueOf(k)
			}))));
	//   39   75:aload_0         
	//   40   76:getfield        #92  <Field TextView c>
	//   41   79:aload_0         
	//   42   80:ldc1            #128 <Int 0x7f0f009c>
	//   43   82:iconst_1        
	//   44   83:anewarray       Object[]
	//   45   86:dup             
	//   46   87:iconst_0        
	//   47   88:aload_0         
	//   48   89:getfield        #58  <Field int k>
	//   49   92:invokestatic    #113 <Method Integer Integer.valueOf(int)>
	//   50   95:aastore         
	//   51   96:invokevirtual   #117 <Method String getString(int, Object[])>
	//   52   99:invokevirtual   #127 <Method void TextView.setText(CharSequence)>
		}
	//   53  102:return          
	}

	public void a()
	{
		com.irobot.core.AssetId assetid = com.irobot.home.util.j.j().b();
	//    0    0:invokestatic    #131 <Method a j.j()>
	//    1    3:invokevirtual   #136 <Method com.irobot.core.AssetId a.b()>
	//    2    6:astore_1        
		a.getSettings().setJavaScriptEnabled(true);
	//    3    7:aload_0         
	//    4    8:getfield        #138 <Field WebViewLanguageCompat a>
	//    5   11:invokevirtual   #144 <Method WebSettings WebViewLanguageCompat.getSettings()>
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #150 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		a.canScrollVertically(0);
	//    8   18:aload_0         
	//    9   19:getfield        #138 <Field WebViewLanguageCompat a>
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #154 <Method boolean WebViewLanguageCompat.canScrollVertically(int)>
	//   12   26:pop             
		a.setVerticalScrollBarEnabled(false);
	//   13   27:aload_0         
	//   14   28:getfield        #138 <Field WebViewLanguageCompat a>
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #157 <Method void WebViewLanguageCompat.setVerticalScrollBarEnabled(boolean)>
		a.loadUrl("file:///android_asset/www/charts/chart_container.html");
	//   17   35:aload_0         
	//   18   36:getfield        #138 <Field WebViewLanguageCompat a>
	//   19   39:ldc1            #159 <String "file:///android_asset/www/charts/chart_container.html">
	//   20   41:invokevirtual   #162 <Method void WebViewLanguageCompat.loadUrl(String)>
		i = Assembler.getInstance().getSettingsSubsystem(assetid);
	//   21   44:aload_0         
	//   22   45:invokestatic    #168 <Method Assembler Assembler.getInstance()>
	//   23   48:aload_1         
	//   24   49:invokevirtual   #172 <Method SettingsSubsystem Assembler.getSettingsSubsystem(com.irobot.core.AssetId)>
	//   25   52:putfield        #174 <Field SettingsSubsystem i>
		e = Assembler.getInstance().getHistoryUIService(assetid);
	//   26   55:aload_0         
	//   27   56:invokestatic    #168 <Method Assembler Assembler.getInstance()>
	//   28   59:aload_1         
	//   29   60:invokevirtual   #178 <Method HistoryUIService Assembler.getHistoryUIService(com.irobot.core.AssetId)>
	//   30   63:putfield        #180 <Field HistoryUIService e>
	//   31   66:return          
	}

	public void a(String s)
	{
		a.setWebViewClient(((WebViewClient) (new WebViewClient(s) {

			public void onPageFinished(WebView webview, String s1)
			{
				webview = ((WebView) (b.a));
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field ao b>
			//    2    4:getfield        #27  <Field WebViewLanguageCompat com.irobot.home.fragments.ao.a>
			//    3    7:astore_1        
				s1 = ((String) (new StringBuilder()));
			//    4    8:new             #29  <Class StringBuilder>
			//    5   11:dup             
			//    6   12:invokespecial   #30  <Method void StringBuilder()>
			//    7   15:astore_2        
				((StringBuilder) (s1)).append("javascript:loadChart(");
			//    8   16:aload_2         
			//    9   17:ldc1            #32  <String "javascript:loadChart(">
			//   10   19:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
			//   11   22:pop             
				((StringBuilder) (s1)).append(a);
			//   12   23:aload_2         
			//   13   24:aload_0         
			//   14   25:getfield        #18  <Field String a>
			//   15   28:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
			//   16   31:pop             
				((StringBuilder) (s1)).append(")");
			//   17   32:aload_2         
			//   18   33:ldc1            #38  <String ")">
			//   19   35:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
			//   20   38:pop             
				((WebViewLanguageCompat) (webview)).loadUrl(((StringBuilder) (s1)).toString());
			//   21   39:aload_1         
			//   22   40:aload_2         
			//   23   41:invokevirtual   #42  <Method String StringBuilder.toString()>
			//   24   44:invokevirtual   #47  <Method void WebViewLanguageCompat.loadUrl(String)>
			//   25   47:return          
			}

			final String a;
			final ao b;

			
			{
				b = ao.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ao b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void WebViewClient()>
			//    8   14:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field WebViewLanguageCompat a>
	//    2    4:new             #8   <Class ao$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #183 <Method void ao$2(ao, String)>
	//    7   13:invokevirtual   #187 <Method void WebViewLanguageCompat.setWebViewClient(WebViewClient)>
	//    8   16:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #190 <Method void j.onStart()>
		i.registerUISubscriber(j);
	//    2    4:aload_0         
	//    3    5:getfield        #174 <Field SettingsSubsystem i>
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field SettingsUIServiceDataCallback j>
	//    6   12:invokevirtual   #196 <Method boolean SettingsSubsystem.registerUISubscriber(SettingsUIServiceDataCallback)>
	//    7   15:pop             
		e.registerUISubscriber(l);
	//    8   16:aload_0         
	//    9   17:getfield        #180 <Field HistoryUIService e>
	//   10   20:aload_0         
	//   11   21:getfield        #63  <Field HistoryUIServiceDataCallback l>
	//   12   24:invokevirtual   #201 <Method boolean HistoryUIService.registerUISubscriber(HistoryUIServiceDataCallback)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #204 <Method void j.onStop()>
		i.unregisterSubscriber(j);
	//    2    4:aload_0         
	//    3    5:getfield        #174 <Field SettingsSubsystem i>
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field SettingsUIServiceDataCallback j>
	//    6   12:invokevirtual   #207 <Method boolean SettingsSubsystem.unregisterSubscriber(SettingsUIServiceDataCallback)>
	//    7   15:pop             
		e.unregisterSubscriber(l);
	//    8   16:aload_0         
	//    9   17:getfield        #180 <Field HistoryUIService e>
	//   10   20:aload_0         
	//   11   21:getfield        #63  <Field HistoryUIServiceDataCallback l>
	//   12   24:invokevirtual   #209 <Method boolean HistoryUIService.unregisterSubscriber(HistoryUIServiceDataCallback)>
	//   13   27:pop             
	//   14   28:return          
	}

	private static final String d = com.irobot.home.util.j.r(((Class) (com/irobot/home/fragments/ao)).getSimpleName());
	WebViewLanguageCompat a;
	TextView b;
	TextView c;
	private HistoryUIService e;
	private volatile boolean f;
	private SettingsSubsystem i;
	private SettingsUIServiceDataCallback j;
	private int k;
	private HistoryUIServiceDataCallback l;

	static 
	{
	//    0    0:ldc1            #2   <Class ao>
	//    1    2:invokevirtual   #39  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #45  <Method String j.r(String)>
	//    3    8:putstatic       #47  <Field String d>
	//*   4   11:return          
	}
}
