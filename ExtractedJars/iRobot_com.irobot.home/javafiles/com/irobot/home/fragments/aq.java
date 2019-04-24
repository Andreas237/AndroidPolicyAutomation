// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.irobot.core.*;
import com.irobot.home.HistoryInfoActivity_;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.util.*;

// Referenced classes of package com.irobot.home.fragments:
//			j

public class aq extends com.irobot.home.fragments.j
{

	public aq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void com.irobot.home.fragments.j()>
		p = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #56  <Field boolean p>
		q = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #58  <Field boolean q>
		r = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #60  <Field boolean r>
		s = ((HistoryUIServiceDataCallback) (new HistoryUIServiceDataCallback() {

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
					com.irobot.home.util.o.a(aq.b(), historydatastate.name());
			//   11   27:invokestatic    #46  <Method String aq.b()>
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
								a[HistoryDataState.DockEvacuation.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field HistoryDataState HistoryDataState.DockEvacuation>
						//    6   15:invokevirtual   #28  <Method int HistoryDataState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #20  <Field int[] a>
						//*  10   23:getstatic       #31  <Field HistoryDataState HistoryDataState.Accumulated>
						//*  11   26:invokevirtual   #28  <Method int HistoryDataState.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   15   32:astore_0        
							try
							{
								a[HistoryDataState.Accumulated.ordinal()] = 2;
							}
						//*  16   33:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   17   36:astore_0        
						//*  18   37:return          
						}
					}

					switch(com.irobot.home.fragments._cls3.a[historydatastate.ordinal()])
			//*  15   37:getstatic       #59  <Field int[] com.irobot.home.fragments.aq$3.a>
			//*  16   40:aload_3         
			//*  17   41:invokevirtual   #63  <Method int HistoryDataState.ordinal()>
			//*  18   44:iaload          
					{
			//*  19   45:tableswitch     1 2: default 68
			//			               1 82
			//			               2 71
			//*  20   68:goto            8
					case 2: // '\002'
						aq.b(a, historyuiservicedata);
			//   21   71:aload_0         
			//   22   72:getfield        #12  <Field aq a>
			//   23   75:aload_1         
			//   24   76:invokestatic    #66  <Method void aq.b(aq, HistoryUIServiceData)>
						break;

			//*  25   79:goto            8
					case 1: // '\001'
						com.irobot.home.fragments.aq.a(a, historyuiservicedata);
			//   26   82:aload_0         
			//   27   83:getfield        #12  <Field aq a>
			//   28   86:aload_1         
			//   29   87:invokestatic    #68  <Method void com.irobot.home.fragments.aq.a(aq, HistoryUIServiceData)>
						break;
					}
				} while(true);
			//*  30   90:goto            8
			//   31   93:return          
			}

			final aq a;

			
			{
				a = aq.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field aq a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void HistoryUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   11   19:aload_0         
	//   12   20:new             #6   <Class aq$1>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #63  <Method void aq$1(aq)>
	//   16   28:putfield        #65  <Field HistoryUIServiceDataCallback s>
	//   17   31:return          
	}

	private CustomTextView a(int i1, int j1)
	{
		RelativeLayout relativelayout = (RelativeLayout)getView().findViewById(i1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method View getView()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #76  <Method View View.findViewById(int)>
	//    4    8:checkcast       #78  <Class RelativeLayout>
	//    5   11:astore_3        
		com.irobot.home.util.j.a(relativelayout, j1);
	//    6   12:aload_3         
	//    7   13:iload_2         
	//    8   14:invokestatic    #81  <Method android.widget.TextView j.a(RelativeLayout, int)>
	//    9   17:pop             
		return (CustomTextView)relativelayout.findViewById(0x7f09042d);
	//   10   18:aload_3         
	//   11   19:ldc1            #82  <Int 0x7f09042d>
	//   12   21:invokevirtual   #83  <Method View RelativeLayout.findViewById(int)>
	//   13   24:checkcast       #85  <Class CustomTextView>
	//   14   27:areturn         
	}

	private String a(int i1)
	{
		Resources resources = getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method Resources getResources()>
	//    2    4:astore_3        
		if(i1 < 60)
	//*   3    5:iload_1         
	//*   4    6:bipush          60
	//*   5    8:icmpge          30
			return resources.getQuantityString(0x7f0d002a, i1, new Object[] {
				Integer.valueOf(i1)
			});
	//    6   11:aload_3         
	//    7   12:ldc1            #91  <Int 0x7f0d002a>
	//    8   14:iload_1         
	//    9   15:iconst_1        
	//   10   16:anewarray       Object[]
	//   11   19:dup             
	//   12   20:iconst_0        
	//   13   21:iload_1         
	//   14   22:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   15   25:aastore         
	//   16   26:invokevirtual   #105 <Method String Resources.getQuantityString(int, int, Object[])>
	//   17   29:areturn         
		int j1 = i1 % 60;
	//   18   30:iload_1         
	//   19   31:bipush          60
	//   20   33:irem            
	//   21   34:istore_2        
		if(j1 == 0)
	//*  22   35:iload_2         
	//*  23   36:ifne            63
		{
			i1 /= 60;
	//   24   39:iload_1         
	//   25   40:bipush          60
	//   26   42:idiv            
	//   27   43:istore_1        
			return resources.getQuantityString(0x7f0d0029, i1, new Object[] {
				Integer.valueOf(i1)
			});
	//   28   44:aload_3         
	//   29   45:ldc1            #106 <Int 0x7f0d0029>
	//   30   47:iload_1         
	//   31   48:iconst_1        
	//   32   49:anewarray       Object[]
	//   33   52:dup             
	//   34   53:iconst_0        
	//   35   54:iload_1         
	//   36   55:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   37   58:aastore         
	//   38   59:invokevirtual   #105 <Method String Resources.getQuantityString(int, int, Object[])>
	//   39   62:areturn         
		} else
		{
			i1 /= 60;
	//   40   63:iload_1         
	//   41   64:bipush          60
	//   42   66:idiv            
	//   43   67:istore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   44   68:new             #108 <Class StringBuilder>
	//   45   71:dup             
	//   46   72:invokespecial   #109 <Method void StringBuilder()>
	//   47   75:astore          4
			stringbuilder.append(resources.getQuantityString(0x7f0d0029, i1, new Object[] {
				Integer.valueOf(i1)
			}));
	//   48   77:aload           4
	//   49   79:aload_3         
	//   50   80:ldc1            #106 <Int 0x7f0d0029>
	//   51   82:iload_1         
	//   52   83:iconst_1        
	//   53   84:anewarray       Object[]
	//   54   87:dup             
	//   55   88:iconst_0        
	//   56   89:iload_1         
	//   57   90:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   58   93:aastore         
	//   59   94:invokevirtual   #105 <Method String Resources.getQuantityString(int, int, Object[])>
	//   60   97:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   61  100:pop             
			stringbuilder.append(" ");
	//   62  101:aload           4
	//   63  103:ldc1            #115 <String " ">
	//   64  105:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   65  108:pop             
			stringbuilder.append(resources.getQuantityString(0x7f0d002a, j1, new Object[] {
				Integer.valueOf(j1)
			}));
	//   66  109:aload           4
	//   67  111:aload_3         
	//   68  112:ldc1            #91  <Int 0x7f0d002a>
	//   69  114:iload_2         
	//   70  115:iconst_1        
	//   71  116:anewarray       Object[]
	//   72  119:dup             
	//   73  120:iconst_0        
	//   74  121:iload_2         
	//   75  122:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   76  125:aastore         
	//   77  126:invokevirtual   #105 <Method String Resources.getQuantityString(int, int, Object[])>
	//   78  129:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   79  132:pop             
			return stringbuilder.toString();
	//   80  133:aload           4
	//   81  135:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   82  138:areturn         
		}
	}

	private void a(int i1, int j1, int k1)
	{
		Resources resources = getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method Resources getResources()>
	//    2    4:astore          4
		k.setText(((CharSequence) (resources.getQuantityString(0x7f0d001f, i1, new Object[] {
			Integer.valueOf(i1)
		}))));
	//    3    6:aload_0         
	//    4    7:getfield        #121 <Field CustomTextView k>
	//    5   10:aload           4
	//    6   12:ldc1            #122 <Int 0x7f0d001f>
	//    7   14:iload_1         
	//    8   15:iconst_1        
	//    9   16:anewarray       Object[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:iload_1         
	//   13   22:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   14   25:aastore         
	//   15   26:invokevirtual   #105 <Method String Resources.getQuantityString(int, int, Object[])>
	//   16   29:invokevirtual   #126 <Method void CustomTextView.setText(CharSequence)>
		j.setText(((CharSequence) (a(j1))));
	//   17   32:aload_0         
	//   18   33:getfield        #128 <Field CustomTextView j>
	//   19   36:aload_0         
	//   20   37:iload_2         
	//   21   38:invokespecial   #130 <Method String a(int)>
	//   22   41:invokevirtual   #126 <Method void CustomTextView.setText(CharSequence)>
		if(AssetCapabilityUtils.isMoppingRobot(com.irobot.home.util.j.j().a()))
	//*  23   44:invokestatic    #133 <Method a j.j()>
	//*  24   47:invokevirtual   #138 <Method AssetInfo a.a()>
	//*  25   50:invokestatic    #144 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*  26   53:ifeq            65
			e.setVisibility(8);
	//   27   56:aload_0         
	//   28   57:getfield        #146 <Field View e>
	//   29   60:bipush          8
	//   30   62:invokevirtual   #150 <Method void View.setVisibility(int)>
		l.setText(((CharSequence) (resources.getQuantityString(0x7f0d0009, k1, new Object[] {
			Integer.valueOf(k1)
		}))));
	//   31   65:aload_0         
	//   32   66:getfield        #152 <Field CustomTextView l>
	//   33   69:aload           4
	//   34   71:ldc1            #153 <Int 0x7f0d0009>
	//   35   73:iload_3         
	//   36   74:iconst_1        
	//   37   75:anewarray       Object[]
	//   38   78:dup             
	//   39   79:iconst_0        
	//   40   80:iload_3         
	//   41   81:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   42   84:aastore         
	//   43   85:invokevirtual   #105 <Method String Resources.getQuantityString(int, int, Object[])>
	//   44   88:invokevirtual   #126 <Method void CustomTextView.setText(CharSequence)>
	//   45   91:return          
	}

	private void a(HistoryUIServiceData historyuiservicedata)
	{
		a(historyuiservicedata.getAccumulatedNumberOfCleaningJobs(), historyuiservicedata.getAccumulatedTotalJobMinutes(), historyuiservicedata.getAccumulatedDirtDetectCount());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #160 <Method int HistoryUIServiceData.getAccumulatedNumberOfCleaningJobs()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #163 <Method int HistoryUIServiceData.getAccumulatedTotalJobMinutes()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #166 <Method int HistoryUIServiceData.getAccumulatedDirtDetectCount()>
	//    7   13:invokespecial   #168 <Method void a(int, int, int)>
	//    8   16:return          
	}

	static void a(aq aq1)
	{
		aq1.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #170 <Method void c()>
	//    2    4:return          
	}

	static void a(aq aq1, HistoryUIServiceData historyuiservicedata)
	{
		aq1.b(historyuiservicedata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #173 <Method void b(HistoryUIServiceData)>
	//    3    5:return          
	}

	static String b()
	{
		return n;
	//    0    0:getstatic       #50  <Field String n>
	//    1    3:areturn         
	}

	private void b(HistoryUIServiceData historyuiservicedata)
	{
		Resources resources = getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method Resources getResources()>
	//    2    4:astore_3        
		int i1 = (int)historyuiservicedata.getDockEvacuationTotalCount();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #177 <Method long HistoryUIServiceData.getDockEvacuationTotalCount()>
	//    5    9:l2i             
	//    6   10:istore_2        
		if(i1 == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            25
		{
			d.setVisibility(8);
	//    9   15:aload_0         
	//   10   16:getfield        #179 <Field View d>
	//   11   19:bipush          8
	//   12   21:invokevirtual   #150 <Method void View.setVisibility(int)>
			return;
	//   13   24:return          
		} else
		{
			p = true;
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:putfield        #56  <Field boolean p>
			d.setVisibility(0);
	//   17   30:aload_0         
	//   18   31:getfield        #179 <Field View d>
	//   19   34:iconst_0        
	//   20   35:invokevirtual   #150 <Method void View.setVisibility(int)>
			m.setText(((CharSequence) (resources.getQuantityString(0x7f0d0009, i1, new Object[] {
				Integer.valueOf(i1)
			}))));
	//   21   38:aload_0         
	//   22   39:getfield        #181 <Field CustomTextView m>
	//   23   42:aload_3         
	//   24   43:ldc1            #153 <Int 0x7f0d0009>
	//   25   45:iload_2         
	//   26   46:iconst_1        
	//   27   47:anewarray       Object[]
	//   28   50:dup             
	//   29   51:iconst_0        
	//   30   52:iload_2         
	//   31   53:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   32   56:aastore         
	//   33   57:invokevirtual   #105 <Method String Resources.getQuantityString(int, int, Object[])>
	//   34   60:invokevirtual   #126 <Method void CustomTextView.setText(CharSequence)>
			return;
	//   35   63:return          
		}
	}

	static void b(aq aq1, HistoryUIServiceData historyuiservicedata)
	{
		aq1.a(historyuiservicedata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #183 <Method void a(HistoryUIServiceData)>
	//    3    5:return          
	}

	private void c()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #185 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #186 <Method void ArrayList()>
	//    3    7:astore_1        
		ArrayList arraylist1 = new ArrayList();
	//    4    8:new             #185 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #186 <Method void ArrayList()>
	//    7   15:astore_2        
		arraylist.add(((Object) (Integer.valueOf(0x7f0f05b2))));
	//    8   16:aload_1         
	//    9   17:ldc1            #187 <Int 0x7f0f05b2>
	//   10   19:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   11   22:invokevirtual   #191 <Method boolean ArrayList.add(Object)>
	//   12   25:pop             
		arraylist1.add(((Object) (Integer.valueOf(0x7f0f05b3))));
	//   13   26:aload_2         
	//   14   27:ldc1            #192 <Int 0x7f0f05b3>
	//   15   29:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   16   32:invokevirtual   #191 <Method boolean ArrayList.add(Object)>
	//   17   35:pop             
		arraylist.add(((Object) (Integer.valueOf(0x7f0f08dd))));
	//   18   36:aload_1         
	//   19   37:ldc1            #193 <Int 0x7f0f08dd>
	//   20   39:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   21   42:invokevirtual   #191 <Method boolean ArrayList.add(Object)>
	//   22   45:pop             
		arraylist1.add(((Object) (Integer.valueOf(0x7f0f08de))));
	//   23   46:aload_2         
	//   24   47:ldc1            #194 <Int 0x7f0f08de>
	//   25   49:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   26   52:invokevirtual   #191 <Method boolean ArrayList.add(Object)>
	//   27   55:pop             
		if(q)
	//*  28   56:aload_0         
	//*  29   57:getfield        #58  <Field boolean q>
	//*  30   60:ifeq            83
		{
			arraylist.add(((Object) (Integer.valueOf(0x7f0f08da))));
	//   31   63:aload_1         
	//   32   64:ldc1            #195 <Int 0x7f0f08da>
	//   33   66:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   34   69:invokevirtual   #191 <Method boolean ArrayList.add(Object)>
	//   35   72:pop             
			arraylist1.add(((Object) (Integer.valueOf(0x7f0f08db))));
	//   36   73:aload_2         
	//   37   74:ldc1            #196 <Int 0x7f0f08db>
	//   38   76:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   39   79:invokevirtual   #191 <Method boolean ArrayList.add(Object)>
	//   40   82:pop             
		}
		if(r)
	//*  41   83:aload_0         
	//*  42   84:getfield        #60  <Field boolean r>
	//*  43   87:ifeq            110
		{
			arraylist.add(((Object) (Integer.valueOf(0x7f0f026d))));
	//   44   90:aload_1         
	//   45   91:ldc1            #197 <Int 0x7f0f026d>
	//   46   93:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   47   96:invokevirtual   #191 <Method boolean ArrayList.add(Object)>
	//   48   99:pop             
			arraylist1.add(((Object) (Integer.valueOf(0x7f0f026e))));
	//   49  100:aload_2         
	//   50  101:ldc1            #198 <Int 0x7f0f026e>
	//   51  103:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   52  106:invokevirtual   #191 <Method boolean ArrayList.add(Object)>
	//   53  109:pop             
		}
		if(p)
	//*  54  110:aload_0         
	//*  55  111:getfield        #56  <Field boolean p>
	//*  56  114:ifeq            137
		{
			arraylist.add(((Object) (Integer.valueOf(0x7f0f00bf))));
	//   57  117:aload_1         
	//   58  118:ldc1            #199 <Int 0x7f0f00bf>
	//   59  120:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   60  123:invokevirtual   #191 <Method boolean ArrayList.add(Object)>
	//   61  126:pop             
			arraylist1.add(((Object) (Integer.valueOf(0x7f0f00c0))));
	//   62  127:aload_2         
	//   63  128:ldc1            #200 <Int 0x7f0f00c0>
	//   64  130:invokestatic    #99  <Method Integer Integer.valueOf(int)>
	//   65  133:invokevirtual   #191 <Method boolean ArrayList.add(Object)>
	//   66  136:pop             
		}
		HistoryInfoActivity_.a(((android.support.v4.app.Fragment) (this))).a(true).a(arraylist).b(arraylist1).a();
	//   67  137:aload_0         
	//   68  138:invokestatic    #205 <Method com.irobot.home.HistoryInfoActivity_$a HistoryInfoActivity_.a(android.support.v4.app.Fragment)>
	//   69  141:iconst_1        
	//   70  142:invokevirtual   #210 <Method com.irobot.home.HistoryInfoActivity_$a com.irobot.home.HistoryInfoActivity_$a.a(boolean)>
	//   71  145:aload_1         
	//   72  146:invokevirtual   #213 <Method com.irobot.home.HistoryInfoActivity_$a com.irobot.home.HistoryInfoActivity_$a.a(ArrayList)>
	//   73  149:aload_2         
	//   74  150:invokevirtual   #215 <Method com.irobot.home.HistoryInfoActivity_$a com.irobot.home.HistoryInfoActivity_$a.b(ArrayList)>
	//   75  153:invokevirtual   #218 <Method org.androidannotations.api.a.e com.irobot.home.HistoryInfoActivity_$a.a()>
	//   76  156:pop             
	//   77  157:return          
	}

	public void a()
	{
		int i1;
		if(a.booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #220 <Field Boolean a>
	//*   2    4:invokevirtual   #226 <Method boolean Boolean.booleanValue()>
	//*   3    7:ifeq            52
		{
			b.setVisibility(0);
	//    4   10:aload_0         
	//    5   11:getfield        #228 <Field CustomTextView b>
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #229 <Method void CustomTextView.setVisibility(int)>
			f.setVisibility(8);
	//    8   18:aload_0         
	//    9   19:getfield        #231 <Field View f>
	//   10   22:bipush          8
	//   11   24:invokevirtual   #150 <Method void View.setVisibility(int)>
			i.setVisibility(0);
	//   12   27:aload_0         
	//   13   28:getfield        #233 <Field View i>
	//   14   31:iconst_0        
	//   15   32:invokevirtual   #150 <Method void View.setVisibility(int)>
			i1 = 0x7f0902a5;
	//   16   35:ldc1            #234 <Int 0x7f0902a5>
	//   17   37:istore_1        
		} else
	//*  18   38:aload_0         
	//*  19   39:aload_0         
	//*  20   40:iload_1         
	//*  21   41:ldc1            #187 <Int 0x7f0f05b2>
	//*  22   43:invokespecial   #236 <Method CustomTextView a(int, int)>
	//*  23   46:putfield        #121 <Field CustomTextView k>
	//*  24   49:goto            58
		{
			i1 = 0x7f0902a6;
	//   25   52:ldc1            #237 <Int 0x7f0902a6>
	//   26   54:istore_1        
		}
		k = a(i1, 0x7f0f05b2);
	//*  27   55:goto            38
		j = a(0x7f09045b, 0x7f0f08dd);
	//   28   58:aload_0         
	//   29   59:aload_0         
	//   30   60:ldc1            #238 <Int 0x7f09045b>
	//   31   62:ldc1            #193 <Int 0x7f0f08dd>
	//   32   64:invokespecial   #236 <Method CustomTextView a(int, int)>
	//   33   67:putfield        #128 <Field CustomTextView j>
		l = a(0x7f090151, 0x7f0f026d);
	//   34   70:aload_0         
	//   35   71:aload_0         
	//   36   72:ldc1            #239 <Int 0x7f090151>
	//   37   74:ldc1            #197 <Int 0x7f0f026d>
	//   38   76:invokespecial   #236 <Method CustomTextView a(int, int)>
	//   39   79:putfield        #152 <Field CustomTextView l>
		m = a(0x7f09045a, 0x7f0f00bf);
	//   40   82:aload_0         
	//   41   83:aload_0         
	//   42   84:ldc1            #240 <Int 0x7f09045a>
	//   43   86:ldc1            #199 <Int 0x7f0f00bf>
	//   44   88:invokespecial   #236 <Method CustomTextView a(int, int)>
	//   45   91:putfield        #181 <Field CustomTextView m>
		c.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				view = ((View) (com.irobot.home.util.j.j().a()));
			//    0    0:invokestatic    #27  <Method a j.j()>
			//    1    3:invokevirtual   #32  <Method AssetInfo a.a()>
			//    2    6:astore_1        
				AnalyticsSubsystem.getInstance().trackLifetimeHistoryInfoButtonPressed(((AssetInfo) (view)));
			//    3    7:invokestatic    #38  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
			//    4   10:aload_1         
			//    5   11:invokevirtual   #42  <Method void AnalyticsSubsystem.trackLifetimeHistoryInfoButtonPressed(AssetInfo)>
				com.irobot.home.fragments.aq.a(a);
			//    6   14:aload_0         
			//    7   15:getfield        #16  <Field aq a>
			//    8   18:invokestatic    #44  <Method void com.irobot.home.fragments.aq.a(aq)>
			//    9   21:return          
			}

			final aq a;

			
			{
				a = aq.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field aq a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   46   94:aload_0         
	//   47   95:getfield        #242 <Field ImageButton c>
	//   48   98:new             #8   <Class aq$2>
	//   49  101:dup             
	//   50  102:aload_0         
	//   51  103:invokespecial   #243 <Method void aq$2(aq)>
	//   52  106:invokevirtual   #249 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		Object obj = ((Object) (com.irobot.home.util.j.j().a()));
	//   53  109:invokestatic    #133 <Method a j.j()>
	//   54  112:invokevirtual   #138 <Method AssetInfo a.a()>
	//   55  115:astore_2        
		r = AssetCapabilityUtils.isMoppingRobot(((AssetInfo) (obj))) ^ true;
	//   56  116:aload_0         
	//   57  117:aload_2         
	//   58  118:invokestatic    #144 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//   59  121:iconst_1        
	//   60  122:ixor            
	//   61  123:putfield        #60  <Field boolean r>
		obj = ((Object) (((AssetInfo) (obj)).getAssetId()));
	//   62  126:aload_2         
	//   63  127:invokevirtual   #255 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   64  130:astore_2        
		o = Assembler.getInstance().getHistoryUIService(((com.irobot.core.AssetId) (obj)));
	//   65  131:aload_0         
	//   66  132:invokestatic    #261 <Method Assembler Assembler.getInstance()>
	//   67  135:aload_2         
	//   68  136:invokevirtual   #265 <Method HistoryUIService Assembler.getHistoryUIService(com.irobot.core.AssetId)>
	//   69  139:putfield        #267 <Field HistoryUIService o>
		a(0, 0, 0);
	//   70  142:aload_0         
	//   71  143:iconst_0        
	//   72  144:iconst_0        
	//   73  145:iconst_0        
	//   74  146:invokespecial   #168 <Method void a(int, int, int)>
	//   75  149:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #270 <Method void j.onResume()>
		com.irobot.core.AssetId assetid = com.irobot.home.util.j.j().b();
	//    2    4:invokestatic    #133 <Method a j.j()>
	//    3    7:invokevirtual   #272 <Method com.irobot.core.AssetId a.b()>
	//    4   10:astore_1        
		q = Assembler.getInstance().getSettingsSubsystem(assetid).getServiceData().getAvailableSettings().contains(((Object) (SettingType.AreaCleaned)));
	//    5   11:aload_0         
	//    6   12:invokestatic    #261 <Method Assembler Assembler.getInstance()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #276 <Method SettingsSubsystem Assembler.getSettingsSubsystem(com.irobot.core.AssetId)>
	//    9   19:invokevirtual   #282 <Method SettingsUIServiceData SettingsSubsystem.getServiceData()>
	//   10   22:invokevirtual   #288 <Method HashSet SettingsUIServiceData.getAvailableSettings()>
	//   11   25:getstatic       #294 <Field SettingType SettingType.AreaCleaned>
	//   12   28:invokevirtual   #299 <Method boolean HashSet.contains(Object)>
	//   13   31:putfield        #58  <Field boolean q>
	//   14   34:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #302 <Method void j.onStart()>
		o.registerUISubscriber(s);
	//    2    4:aload_0         
	//    3    5:getfield        #267 <Field HistoryUIService o>
	//    4    8:aload_0         
	//    5    9:getfield        #65  <Field HistoryUIServiceDataCallback s>
	//    6   12:invokevirtual   #308 <Method boolean HistoryUIService.registerUISubscriber(HistoryUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #311 <Method void j.onStop()>
		o.unregisterSubscriber(s);
	//    2    4:aload_0         
	//    3    5:getfield        #267 <Field HistoryUIService o>
	//    4    8:aload_0         
	//    5    9:getfield        #65  <Field HistoryUIServiceDataCallback s>
	//    6   12:invokevirtual   #314 <Method boolean HistoryUIService.unregisterSubscriber(HistoryUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String n = com.irobot.home.util.j.r(((Class) (com/irobot/home/fragments/aq)).getSimpleName());
	Boolean a;
	CustomTextView b;
	ImageButton c;
	View d;
	View e;
	View f;
	View i;
	CustomTextView j;
	CustomTextView k;
	CustomTextView l;
	CustomTextView m;
	private HistoryUIService o;
	private boolean p;
	private boolean q;
	private boolean r;
	private HistoryUIServiceDataCallback s;

	static 
	{
	//    0    0:ldc1            #2   <Class aq>
	//    1    2:invokevirtual   #43  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #48  <Method String j.r(String)>
	//    3    8:putstatic       #50  <Field String n>
	//*   4   11:return          
	}
}
