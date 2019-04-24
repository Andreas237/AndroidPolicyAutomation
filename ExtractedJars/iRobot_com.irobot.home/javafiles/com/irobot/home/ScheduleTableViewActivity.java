// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.x;
import android.text.format.DateFormat;
import android.widget.ProgressBar;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetInfo;
import com.irobot.core.DayOfTheWeek;
import com.irobot.core.ScheduleCycleType;
import com.irobot.core.ScheduleDay;
import com.irobot.core.ScheduleUIService;
import com.irobot.core.ScheduleUIServiceCommand;
import com.irobot.core.ScheduleUIServiceData;
import com.irobot.core.ScheduleUIServiceDataCallback;
import com.irobot.core.ScheduleViewState;
import com.irobot.core.ViewId;
import com.irobot.home.b.ai;
import com.irobot.home.f.b;
import com.irobot.home.g.h;
import com.irobot.home.g.i;
import com.irobot.home.m.c;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.k;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.androidannotations.api.b.d;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, PersistentScheduleActivity_

public class ScheduleTableViewActivity extends BaseFragmentActivity
	implements com.irobot.home.b.ai.a, com.irobot.home.g.h.a
{

	public ScheduleTableViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void BaseFragmentActivity()>
		g = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #62  <Field boolean g>
		i = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #64  <Field b i>
		k = DayOfTheWeek.values();
	//    8   14:aload_0         
	//    9   15:invokestatic    #70  <Method DayOfTheWeek[] DayOfTheWeek.values()>
	//   10   18:putfield        #72  <Field DayOfTheWeek[] k>
	//   11   21:aload_0         
	//   12   22:bipush          7
	//   13   24:newarray        int[]
	//   14   26:dup             
	//   15   27:iconst_0        
	//   16   28:ldc1            #73  <Int 0x7f0f08a6>
	//   17   30:iastore         
	//   18   31:dup             
	//   19   32:iconst_1        
	//   20   33:ldc1            #74  <Int 0x7f0f0498>
	//   21   35:iastore         
	//   22   36:dup             
	//   23   37:iconst_2        
	//   24   38:ldc1            #75  <Int 0x7f0f090f>
	//   25   40:iastore         
	//   26   41:dup             
	//   27   42:iconst_3        
	//   28   43:ldc1            #76  <Int 0x7f0f0961>
	//   29   45:iastore         
	//   30   46:dup             
	//   31   47:iconst_4        
	//   32   48:ldc1            #77  <Int 0x7f0f08bd>
	//   33   50:iastore         
	//   34   51:dup             
	//   35   52:iconst_5        
	//   36   53:ldc1            #78  <Int 0x7f0f033b>
	//   37   55:iastore         
	//   38   56:dup             
	//   39   57:bipush          6
	//   40   59:ldc1            #79  <Int 0x7f0f07b9>
	//   41   61:iastore         
	//   42   62:putfield        #81  <Field int[] l>
		n = ((ScheduleUIServiceDataCallback) (new ScheduleUIServiceDataCallback() {

			public void onScheduleUIServiceDataChanged(ScheduleUIServiceData scheduleuiservicedata)
			{
				Iterator iterator = scheduleuiservicedata.getViewStates().iterator();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #24  <Method ArrayList ScheduleUIServiceData.getViewStates()>
			//    2    4:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
			//    3    7:astore_2        
				do
				{
					if(!iterator.hasNext())
						break;
			//    4    8:aload_2         
			//    5    9:invokeinterface #36  <Method boolean Iterator.hasNext()>
			//    6   14:ifeq            125
					ScheduleViewState scheduleviewstate = (ScheduleViewState)iterator.next();
			//    7   17:aload_2         
			//    8   18:invokeinterface #40  <Method Object Iterator.next()>
			//    9   23:checkcast       #42  <Class ScheduleViewState>
			//   10   26:astore_3        
					o.a(com.irobot.home.ScheduleTableViewActivity.h(), scheduleviewstate.name());
			//   11   27:invokestatic    #46  <Method String com.irobot.home.ScheduleTableViewActivity.h()>
			//   12   30:aload_3         
			//   13   31:invokevirtual   #49  <Method String ScheduleViewState.name()>
			//   14   34:invokestatic    #54  <Method void o.a(String, String)>
					static class _cls2
					{

						static final int a[];

						static 
						{
							a = new int[ScheduleViewState.values().length];
						//    0    0:invokestatic    #18  <Method ScheduleViewState[] ScheduleViewState.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #20  <Field int[] a>
							try
							{
								a[ScheduleViewState.SimpleSchedulePopulateScheduleMap.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field ScheduleViewState ScheduleViewState.SimpleSchedulePopulateScheduleMap>
						//    6   15:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #20  <Field int[] a>
						//*  10   23:getstatic       #31  <Field ScheduleViewState ScheduleViewState.SimpleScheduleShowMappingScheduleView>
						//*  11   26:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:getstatic       #20  <Field int[] a>
						//*  15   34:getstatic       #34  <Field ScheduleViewState ScheduleViewState.SimpleScheduleUpdatingScheduleMap>
						//*  16   37:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  17   40:iconst_3        
						//*  18   41:iastore         
						//*  19   42:getstatic       #20  <Field int[] a>
						//*  20   45:getstatic       #37  <Field ScheduleViewState ScheduleViewState.SimpleScheduleShowTimePickerDialog>
						//*  21   48:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  22   51:iconst_4        
						//*  23   52:iastore         
						//*  24   53:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   25   54:astore_0        
							try
							{
								a[ScheduleViewState.SimpleScheduleShowMappingScheduleView.ordinal()] = 2;
							}
						//*  26   55:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   27   58:astore_0        
							try
							{
								a[ScheduleViewState.SimpleScheduleUpdatingScheduleMap.ordinal()] = 3;
							}
						//*  28   59:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   29   62:astore_0        
							try
							{
								a[ScheduleViewState.SimpleScheduleShowTimePickerDialog.ordinal()] = 4;
							}
						//*  30   63:goto            42
							catch(NoSuchFieldError nosuchfielderror3) { }
						//   31   66:astore_0        
						//*  32   67:return          
						}
					}

					switch(com.irobot.home._cls2.a[scheduleviewstate.ordinal()])
			//*  15   37:getstatic       #59  <Field int[] com.irobot.home.ScheduleTableViewActivity$2.a>
			//*  16   40:aload_3         
			//*  17   41:invokevirtual   #63  <Method int ScheduleViewState.ordinal()>
			//*  18   44:iaload          
					{
			//*  19   45:tableswitch     1 4: default 76
			//			               1 114
			//			               2 104
			//			               3 93
			//			               4 79
			//*  20   76:goto            8
					case 4: // '\004'
						a.g(scheduleuiservicedata.getScheduleItemIndex());
			//   21   79:aload_0         
			//   22   80:getfield        #12  <Field ScheduleTableViewActivity a>
			//   23   83:aload_1         
			//   24   84:invokevirtual   #66  <Method int ScheduleUIServiceData.getScheduleItemIndex()>
			//   25   87:invokevirtual   #70  <Method void ScheduleTableViewActivity.g(int)>
						break;

			//*  26   90:goto            8
					case 3: // '\003'
						com.irobot.home.ScheduleTableViewActivity.a(a, true);
			//   27   93:aload_0         
			//   28   94:getfield        #12  <Field ScheduleTableViewActivity a>
			//   29   97:iconst_1        
			//   30   98:invokestatic    #73  <Method void com.irobot.home.ScheduleTableViewActivity.a(ScheduleTableViewActivity, boolean)>
						break;

			//*  31  101:goto            8
					case 2: // '\002'
						a.g();
			//   32  104:aload_0         
			//   33  105:getfield        #12  <Field ScheduleTableViewActivity a>
			//   34  108:invokevirtual   #75  <Method void ScheduleTableViewActivity.g()>
						break;

			//*  35  111:goto            8
					case 1: // '\001'
						a.a(scheduleuiservicedata);
			//   36  114:aload_0         
			//   37  115:getfield        #12  <Field ScheduleTableViewActivity a>
			//   38  118:aload_1         
			//   39  119:invokevirtual   #77  <Method void com.irobot.home.ScheduleTableViewActivity.a(ScheduleUIServiceData)>
						break;
					}
				} while(true);
			//*  40  122:goto            8
			//   41  125:return          
			}

			final ScheduleTableViewActivity a;

			
			{
				a = ScheduleTableViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field ScheduleTableViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void ScheduleUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   43   65:aload_0         
	//   44   66:new             #10  <Class ScheduleTableViewActivity$1>
	//   45   69:dup             
	//   46   70:aload_0         
	//   47   71:invokespecial   #84  <Method void ScheduleTableViewActivity$1(ScheduleTableViewActivity)>
	//   48   74:putfield        #86  <Field ScheduleUIServiceDataCallback n>
	//   49   77:return          
	}

	static void a(ScheduleTableViewActivity scheduletableviewactivity, boolean flag)
	{
		scheduletableviewactivity.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #90  <Method void a(boolean)>
	//    3    5:return          
	}

	private void a(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ProgressBar progressbar = b;
	//    2    2:aload_0         
	//    3    3:getfield        #92  <Field ProgressBar b>
	//    4    6:astore_3        
		int i1;
		Exception exception;
		if(flag)
	//*   5    7:iload_1         
	//*   6    8:ifeq            29
			i1 = 0;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		else
	//*   9   13:goto            16
	//*  10   16:aload_3         
	//*  11   17:iload_2         
	//*  12   18:invokevirtual   #98  <Method void ProgressBar.setVisibility(int)>
	//*  13   21:aload_0         
	//*  14   22:monitorexit     
	//*  15   23:return          
	//*  16   24:astore_3        
	//*  17   25:aload_0         
	//*  18   26:monitorexit     
	//*  19   27:aload_3         
	//*  20   28:athrow          
			i1 = 8;
	//   21   29:bipush          8
	//   22   31:istore_2        
		progressbar.setVisibility(i1);
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//*  23   32:goto            16
	}

	static String h()
	{
		return e;
	//    0    0:getstatic       #56  <Field String e>
	//    1    3:areturn         
	}

	private void i()
	{
		LinearLayoutManager linearlayoutmanager = new LinearLayoutManager(((android.content.Context) (this)));
	//    0    0:new             #100 <Class LinearLayoutManager>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #103 <Method void LinearLayoutManager(android.content.Context)>
	//    4    8:astore_1        
		a.setLayoutManager(((android.support.v7.widget.RecyclerView.h) (linearlayoutmanager)));
	//    5    9:aload_0         
	//    6   10:getfield        #105 <Field RecyclerView a>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #111 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$h)>
		a.a(((android.support.v7.widget.RecyclerView.g) (new x(((android.content.Context) (this)), linearlayoutmanager.f()))));
	//    9   17:aload_0         
	//   10   18:getfield        #105 <Field RecyclerView a>
	//   11   21:new             #113 <Class x>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #116 <Method int LinearLayoutManager.f()>
	//   16   30:invokespecial   #119 <Method void x(android.content.Context, int)>
	//   17   33:invokevirtual   #122 <Method void RecyclerView.a(android.support.v7.widget.RecyclerView$g)>
		f = new ai(((android.content.Context) (this)), ((com.irobot.home.b.ai.a) (this)));
	//   18   36:aload_0         
	//   19   37:new             #124 <Class ai>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:invokespecial   #127 <Method void ai(android.content.Context, com.irobot.home.b.ai$a)>
	//   24   46:putfield        #129 <Field ai f>
		a.setAdapter(((android.support.v7.widget.RecyclerView.a) (f)));
	//   25   49:aload_0         
	//   26   50:getfield        #105 <Field RecyclerView a>
	//   27   53:aload_0         
	//   28   54:getfield        #129 <Field ai f>
	//   29   57:invokevirtual   #133 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$a)>
		a.setVisibility(0);
	//   30   60:aload_0         
	//   31   61:getfield        #105 <Field RecyclerView a>
	//   32   64:iconst_0        
	//   33   65:invokevirtual   #134 <Method void RecyclerView.setVisibility(int)>
	//   34   68:return          
	}

	public void a(int i1, int j1)
	{
		ScheduleDay scheduleday = (ScheduleDay)j.get(((Object) (k[m])));
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field HashMap j>
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field DayOfTheWeek[] k>
	//    4    8:aload_0         
	//    5    9:getfield        #139 <Field int m>
	//    6   12:aaload          
	//    7   13:invokevirtual   #145 <Method Object HashMap.get(Object)>
	//    8   16:checkcast       #147 <Class ScheduleDay>
	//    9   19:astore_3        
		if(scheduleday.getHour() != i1 || scheduleday.getMinute() != j1 || scheduleday.getCycle() == ScheduleCycleType.None)
	//*  10   20:aload_3         
	//*  11   21:invokevirtual   #150 <Method int ScheduleDay.getHour()>
	//*  12   24:iload_1         
	//*  13   25:icmpne          46
	//*  14   28:aload_3         
	//*  15   29:invokevirtual   #153 <Method int ScheduleDay.getMinute()>
	//*  16   32:iload_2         
	//*  17   33:icmpne          46
	//*  18   36:aload_3         
	//*  19   37:invokevirtual   #157 <Method ScheduleCycleType ScheduleDay.getCycle()>
	//*  20   40:getstatic       #163 <Field ScheduleCycleType ScheduleCycleType.None>
	//*  21   43:if_acmpne       110
		{
			j.put(((Object) (k[m])), ((Object) (new ScheduleDay(i1, j1, ScheduleCycleType.Start))));
	//   22   46:aload_0         
	//   23   47:getfield        #137 <Field HashMap j>
	//   24   50:aload_0         
	//   25   51:getfield        #72  <Field DayOfTheWeek[] k>
	//   26   54:aload_0         
	//   27   55:getfield        #139 <Field int m>
	//   28   58:aaload          
	//   29   59:new             #147 <Class ScheduleDay>
	//   30   62:dup             
	//   31   63:iload_1         
	//   32   64:iload_2         
	//   33   65:getstatic       #166 <Field ScheduleCycleType ScheduleCycleType.Start>
	//   34   68:invokespecial   #169 <Method void ScheduleDay(int, int, ScheduleCycleType)>
	//   35   71:invokevirtual   #173 <Method Object HashMap.put(Object, Object)>
	//   36   74:pop             
			f.e();
	//   37   75:aload_0         
	//   38   76:getfield        #129 <Field ai f>
	//   39   79:invokevirtual   #175 <Method void ai.e()>
			g = true;
	//   40   82:aload_0         
	//   41   83:iconst_1        
	//   42   84:putfield        #62  <Field boolean g>
			ScheduleUIServiceData scheduleuiservicedata = ScheduleUIServiceData.create();
	//   43   87:invokestatic    #181 <Method ScheduleUIServiceData ScheduleUIServiceData.create()>
	//   44   90:astore_3        
			scheduleuiservicedata.setSimpleScheduleMap(j);
	//   45   91:aload_3         
	//   46   92:aload_0         
	//   47   93:getfield        #137 <Field HashMap j>
	//   48   96:invokevirtual   #185 <Method void ScheduleUIServiceData.setSimpleScheduleMap(HashMap)>
			h.sendCommand(ScheduleUIServiceCommand.SimpleScheduleUpdateMap, scheduleuiservicedata);
	//   49   99:aload_0         
	//   50  100:getfield        #187 <Field ScheduleUIService h>
	//   51  103:getstatic       #193 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.SimpleScheduleUpdateMap>
	//   52  106:aload_3         
	//   53  107:invokevirtual   #199 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
		}
	//   54  110:return          
	}

	public void a(DayOfTheWeek dayoftheweek, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ScheduleDay scheduleday;
		scheduleday = (ScheduleDay)j.get(((Object) (dayoftheweek)));
	//    2    2:aload_0         
	//    3    3:getfield        #137 <Field HashMap j>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #145 <Method Object HashMap.get(Object)>
	//    6   10:checkcast       #147 <Class ScheduleDay>
	//    7   13:astore          4
		if(g && scheduleday.getCycle() == ScheduleCycleType.None)
			break MISSING_BLOCK_LABEL_107;
	//    8   15:aload_0         
	//    9   16:getfield        #62  <Field boolean g>
	//   10   19:ifeq            33
	//   11   22:aload           4
	//   12   24:invokevirtual   #157 <Method ScheduleCycleType ScheduleDay.getCycle()>
	//   13   27:getstatic       #163 <Field ScheduleCycleType ScheduleCycleType.None>
	//   14   30:if_acmpeq       107
		if(!flag)
			break MISSING_BLOCK_LABEL_44;
	//   15   33:iload_2         
	//   16   34:ifeq            44
		Object obj;
		obj = ((Object) (ScheduleCycleType.Start));
	//   17   37:getstatic       #166 <Field ScheduleCycleType ScheduleCycleType.Start>
	//   18   40:astore_3        
		break MISSING_BLOCK_LABEL_48;
	//   19   41:goto            48
		obj = ((Object) (ScheduleCycleType.None));
	//   20   44:getstatic       #163 <Field ScheduleCycleType ScheduleCycleType.None>
	//   21   47:astore_3        
		obj = ((Object) (new ScheduleDay(scheduleday.getHour(), scheduleday.getMinute(), ((ScheduleCycleType) (obj)))));
	//   22   48:new             #147 <Class ScheduleDay>
	//   23   51:dup             
	//   24   52:aload           4
	//   25   54:invokevirtual   #150 <Method int ScheduleDay.getHour()>
	//   26   57:aload           4
	//   27   59:invokevirtual   #153 <Method int ScheduleDay.getMinute()>
	//   28   62:aload_3         
	//   29   63:invokespecial   #169 <Method void ScheduleDay(int, int, ScheduleCycleType)>
	//   30   66:astore_3        
		j.put(((Object) (dayoftheweek)), obj);
	//   31   67:aload_0         
	//   32   68:getfield        #137 <Field HashMap j>
	//   33   71:aload_1         
	//   34   72:aload_3         
	//   35   73:invokevirtual   #173 <Method Object HashMap.put(Object, Object)>
	//   36   76:pop             
		f.e();
	//   37   77:aload_0         
	//   38   78:getfield        #129 <Field ai f>
	//   39   81:invokevirtual   #175 <Method void ai.e()>
		dayoftheweek = ((DayOfTheWeek) (ScheduleUIServiceData.create()));
	//   40   84:invokestatic    #181 <Method ScheduleUIServiceData ScheduleUIServiceData.create()>
	//   41   87:astore_1        
		((ScheduleUIServiceData) (dayoftheweek)).setSimpleScheduleMap(j);
	//   42   88:aload_1         
	//   43   89:aload_0         
	//   44   90:getfield        #137 <Field HashMap j>
	//   45   93:invokevirtual   #185 <Method void ScheduleUIServiceData.setSimpleScheduleMap(HashMap)>
		h.sendCommand(ScheduleUIServiceCommand.SimpleScheduleUpdateMap, ((ScheduleUIServiceData) (dayoftheweek)));
	//   46   96:aload_0         
	//   47   97:getfield        #187 <Field ScheduleUIService h>
	//   48  100:getstatic       #193 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.SimpleScheduleUpdateMap>
	//   49  103:aload_1         
	//   50  104:invokevirtual   #199 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
		g = false;
	//   51  107:aload_0         
	//   52  108:iconst_0        
	//   53  109:putfield        #62  <Field boolean g>
		this;
	//   54  112:aload_0         
		JVM INSTR monitorexit ;
	//   55  113:monitorexit     
		return;
	//   56  114:return          
		dayoftheweek;
	//   57  115:astore_1        
	//*  58  116:aload_0         
		throw dayoftheweek;
	//   59  117:monitorexit     
	//   60  118:aload_1         
	//   61  119:athrow          
	}

	void a(ScheduleUIServiceData scheduleuiservicedata)
	{
		j = scheduleuiservicedata.getSimpleScheduleMap();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #205 <Method HashMap ScheduleUIServiceData.getSimpleScheduleMap()>
	//    3    5:putfield        #137 <Field HashMap j>
		f.a(j);
	//    4    8:aload_0         
	//    5    9:getfield        #129 <Field ai f>
	//    6   12:aload_0         
	//    7   13:getfield        #137 <Field HashMap j>
	//    8   16:invokevirtual   #207 <Method void ai.a(HashMap)>
		a(false);
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:invokespecial   #90  <Method void a(boolean)>
	//   12   24:return          
	}

	void e()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(c).a();
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field String c>
	//    2    4:invokestatic    #212 <Method a j.a(String)>
	//    3    7:invokevirtual   #217 <Method AssetInfo a.a()>
	//    4   10:astore_1        
		h = Assembler.getInstance().getScheduleUIService(assetinfo.getAssetId());
	//    5   11:aload_0         
	//    6   12:invokestatic    #223 <Method Assembler Assembler.getInstance()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #229 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//    9   19:invokevirtual   #233 <Method ScheduleUIService Assembler.getScheduleUIService(com.irobot.core.AssetId)>
	//   10   22:putfield        #187 <Field ScheduleUIService h>
		i = new b(((android.app.Activity) (this)), c);
	//   11   25:aload_0         
	//   12   26:new             #235 <Class b>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #209 <Field String c>
	//   17   35:invokespecial   #238 <Method void b(android.app.Activity, String)>
	//   18   38:putfield        #64  <Field b i>
		b(0x7f0f0964);
	//   19   41:aload_0         
	//   20   42:ldc1            #239 <Int 0x7f0f0964>
	//   21   44:invokevirtual   #241 <Method void b(int)>
		i();
	//   22   47:aload_0         
	//   23   48:invokespecial   #243 <Method void i()>
		f();
	//   24   51:aload_0         
	//   25   52:invokevirtual   #245 <Method void f()>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.Schedule, assetinfo);
	//   26   55:invokestatic    #250 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   27   58:getstatic       #256 <Field ViewId ViewId.Schedule>
	//   28   61:aload_1         
	//   29   62:invokevirtual   #260 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//   30   65:return          
	}

	public void f()
	{
		if(!((Boolean)d.e().a()).booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #262 <Field k d>
	//*   2    4:invokevirtual   #267 <Method d k.e()>
	//*   3    7:invokevirtual   #272 <Method Object d.a()>
	//*   4   10:checkcast       #274 <Class Boolean>
	//*   5   13:invokevirtual   #278 <Method boolean Boolean.booleanValue()>
	//*   6   16:ifne            50
		{
			com.irobot.home.m.c.a(((android.app.Activity) (this)), 0x7f090382, 0x7f0f05f2);
	//    7   19:aload_0         
	//    8   20:ldc2            #279 <Int 0x7f090382>
	//    9   23:ldc2            #280 <Int 0x7f0f05f2>
	//   10   26:invokestatic    #285 <Method android.view.View c.a(android.app.Activity, int, int)>
	//   11   29:pop             
			((com.irobot.home.util.k.a)d.a().e().a(true)).n();
	//   12   30:aload_0         
	//   13   31:getfield        #262 <Field k d>
	//   14   34:invokevirtual   #288 <Method com.irobot.home.util.k$a k.a()>
	//   15   37:invokevirtual   #293 <Method org.androidannotations.api.b.c com.irobot.home.util.k$a.e()>
	//   16   40:iconst_1        
	//   17   41:invokevirtual   #298 <Method org.androidannotations.api.b.e org.androidannotations.api.b.c.a(boolean)>
	//   18   44:checkcast       #290 <Class com.irobot.home.util.k$a>
	//   19   47:invokevirtual   #300 <Method void com.irobot.home.util.k$a.n()>
		}
	//   20   50:return          
	}

	public void f(int i1)
	{
		Object obj = ((Object) (e));
	//    0    0:getstatic       #56  <Field String e>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #302 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #303 <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Clicked on item with position: ");
	//    6   12:aload_3         
	//    7   13:ldc2            #305 <String "Clicked on item with position: ">
	//    8   16:invokevirtual   #309 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(i1);
	//   10   20:aload_3         
	//   11   21:iload_1         
	//   12   22:invokevirtual   #312 <Method StringBuilder StringBuilder.append(int)>
	//   13   25:pop             
		o.b(((String) (obj)), stringbuilder.toString());
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #315 <Method String StringBuilder.toString()>
	//   17   31:invokestatic    #320 <Method void o.b(String, String)>
		m = i1;
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:putfield        #139 <Field int m>
		obj = ((Object) (ScheduleUIServiceData.create()));
	//   21   39:invokestatic    #181 <Method ScheduleUIServiceData ScheduleUIServiceData.create()>
	//   22   42:astore_2        
		((ScheduleUIServiceData) (obj)).setScheduleItemIndex(m);
	//   23   43:aload_2         
	//   24   44:aload_0         
	//   25   45:getfield        #139 <Field int m>
	//   26   48:invokevirtual   #323 <Method void ScheduleUIServiceData.setScheduleItemIndex(int)>
		h.sendCommand(ScheduleUIServiceCommand.SimpleScheduleItemClick, ((ScheduleUIServiceData) (obj)));
	//   27   51:aload_0         
	//   28   52:getfield        #187 <Field ScheduleUIService h>
	//   29   55:getstatic       #326 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.SimpleScheduleItemClick>
	//   30   58:aload_2         
	//   31   59:invokevirtual   #199 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
	//   32   62:return          
	}

	void g()
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #90  <Method void a(boolean)>
		o.b(e, "Detected more advanced schedule type, transitioning to that view.");
	//    3    5:getstatic       #56  <Field String e>
	//    4    8:ldc2            #328 <String "Detected more advanced schedule type, transitioning to that view.">
	//    5   11:invokestatic    #320 <Method void o.b(String, String)>
		com.irobot.home.PersistentScheduleActivity_.a(((android.content.Context) (this))).a(c).a();
	//    6   14:aload_0         
	//    7   15:invokestatic    #333 <Method PersistentScheduleActivity_$a com.irobot.home.PersistentScheduleActivity_.a(android.content.Context)>
	//    8   18:aload_0         
	//    9   19:getfield        #209 <Field String c>
	//   10   22:invokevirtual   #338 <Method PersistentScheduleActivity_$a com.irobot.home.PersistentScheduleActivity_$a.a(String)>
	//   11   25:invokevirtual   #341 <Method org.androidannotations.api.a.e com.irobot.home.PersistentScheduleActivity_$a.a()>
	//   12   28:pop             
		finish();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #344 <Method void finish()>
	//   15   33:return          
	}

	void g(int i1)
	{
		Object obj = ((Object) ((ScheduleDay)j.get(((Object) (k[i1])))));
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field HashMap j>
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field DayOfTheWeek[] k>
	//    4    8:iload_1         
	//    5    9:aaload          
	//    6   10:invokevirtual   #145 <Method Object HashMap.get(Object)>
	//    7   13:checkcast       #147 <Class ScheduleDay>
	//    8   16:astore_2        
		obj = ((Object) (com.irobot.home.g.i.d().a(l[i1]).b(((ScheduleDay) (obj)).getHour()).c(((ScheduleDay) (obj)).getMinute()).d(15).a(DateFormat.is24HourFormat(getApplicationContext())).a()));
	//    9   17:invokestatic    #349 <Method com.irobot.home.g.i$a i.d()>
	//   10   20:aload_0         
	//   11   21:getfield        #81  <Field int[] l>
	//   12   24:iload_1         
	//   13   25:iaload          
	//   14   26:invokevirtual   #354 <Method com.irobot.home.g.i$a com.irobot.home.g.i$a.a(int)>
	//   15   29:aload_2         
	//   16   30:invokevirtual   #150 <Method int ScheduleDay.getHour()>
	//   17   33:invokevirtual   #356 <Method com.irobot.home.g.i$a com.irobot.home.g.i$a.b(int)>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #153 <Method int ScheduleDay.getMinute()>
	//   20   40:invokevirtual   #358 <Method com.irobot.home.g.i$a com.irobot.home.g.i$a.c(int)>
	//   21   43:bipush          15
	//   22   45:invokevirtual   #360 <Method com.irobot.home.g.i$a com.irobot.home.g.i$a.d(int)>
	//   23   48:aload_0         
	//   24   49:invokevirtual   #364 <Method android.content.Context getApplicationContext()>
	//   25   52:invokestatic    #370 <Method boolean DateFormat.is24HourFormat(android.content.Context)>
	//   26   55:invokevirtual   #373 <Method com.irobot.home.g.i$a com.irobot.home.g.i$a.a(boolean)>
	//   27   58:invokevirtual   #376 <Method h com.irobot.home.g.i$a.a()>
	//   28   61:astore_2        
		((h) (obj)).a(((com.irobot.home.g.h.a) (this)));
	//   29   62:aload_2         
	//   30   63:aload_0         
	//   31   64:invokevirtual   #381 <Method void h.a(com.irobot.home.g.h$a)>
		((h) (obj)).show(getFragmentManager(), "timePickerDialog");
	//   32   67:aload_2         
	//   33   68:aload_0         
	//   34   69:invokevirtual   #385 <Method android.app.FragmentManager getFragmentManager()>
	//   35   72:ldc2            #387 <String "timePickerDialog">
	//   36   75:invokevirtual   #391 <Method void h.show(android.app.FragmentManager, String)>
	//   37   78:return          
	}

	public void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #394 <Method void BaseFragmentActivity.onBackPressed()>
		if(i != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #64  <Field b i>
	//*   4    8:ifnull          18
			i.b();
	//    5   11:aload_0         
	//    6   12:getfield        #64  <Field b i>
	//    7   15:invokevirtual   #396 <Method void b.b()>
	//    8   18:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #399 <Method void BaseFragmentActivity.onPause()>
		h.sendCommand(ScheduleUIServiceCommand.SimpleScheduleViewClosed, ((ScheduleUIServiceData) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #187 <Field ScheduleUIService h>
	//    4    8:getstatic       #402 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.SimpleScheduleViewClosed>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #199 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
		if(i != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #64  <Field b i>
	//*   9   19:ifnull          29
			i.d();
	//   10   22:aload_0         
	//   11   23:getfield        #64  <Field b i>
	//   12   26:invokevirtual   #404 <Method void b.d()>
	//   13   29:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #407 <Method void BaseFragmentActivity.onResume()>
		h.sendCommand(ScheduleUIServiceCommand.SimpleScheduleViewOpened, ((ScheduleUIServiceData) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #187 <Field ScheduleUIService h>
	//    4    8:getstatic       #410 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.SimpleScheduleViewOpened>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #199 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
		if(i != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #64  <Field b i>
	//*   9   19:ifnull          29
			i.c();
	//   10   22:aload_0         
	//   11   23:getfield        #64  <Field b i>
	//   12   26:invokevirtual   #412 <Method void b.c()>
	//   13   29:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #415 <Method void BaseFragmentActivity.onStart()>
		h.registerUISubscriber(n);
	//    2    4:aload_0         
	//    3    5:getfield        #187 <Field ScheduleUIService h>
	//    4    8:aload_0         
	//    5    9:getfield        #86  <Field ScheduleUIServiceDataCallback n>
	//    6   12:invokevirtual   #419 <Method boolean ScheduleUIService.registerUISubscriber(ScheduleUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #422 <Method void BaseFragmentActivity.onStop()>
		h.unregisterSubscriber(n);
	//    2    4:aload_0         
	//    3    5:getfield        #187 <Field ScheduleUIService h>
	//    4    8:aload_0         
	//    5    9:getfield        #86  <Field ScheduleUIServiceDataCallback n>
	//    6   12:invokevirtual   #425 <Method boolean ScheduleUIService.unregisterSubscriber(ScheduleUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String e = com.irobot.home.util.j.r(((Class) (com/irobot/home/ScheduleTableViewActivity)).getSimpleName());
	RecyclerView a;
	ProgressBar b;
	String c;
	k d;
	private ai f;
	private boolean g;
	private ScheduleUIService h;
	private b i;
	private HashMap j;
	private DayOfTheWeek k[];
	private final int l[] = {
		0x7f0f08a6, 0x7f0f0498, 0x7f0f090f, 0x7f0f0961, 0x7f0f08bd, 0x7f0f033b, 0x7f0f07b9
	};
	private int m;
	private ScheduleUIServiceDataCallback n;

	static 
	{
	//    0    0:ldc1            #2   <Class ScheduleTableViewActivity>
	//    1    2:invokevirtual   #48  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #54  <Method String j.r(String)>
	//    3    8:putstatic       #56  <Field String e>
	//*   4   11:return          
	}
}
