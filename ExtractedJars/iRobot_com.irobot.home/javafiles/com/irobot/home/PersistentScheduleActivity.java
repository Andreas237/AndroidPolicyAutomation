// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.a;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.x;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetInfo;
import com.irobot.core.ScheduleUIService;
import com.irobot.core.ScheduleUIServiceCommand;
import com.irobot.core.ScheduleUIServiceData;
import com.irobot.core.ScheduleUIServiceDataCallback;
import com.irobot.core.ScheduleViewState;
import com.irobot.core.ViewId;
import com.irobot.home.b.ak;
import com.irobot.home.b.z;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.EmptySupportedRecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import org.b.a.b;

// Referenced classes of package com.irobot.home:
//			BaseToolbarFragmentActivity, PersistentScheduleCreateActivity_, RobotCleanActivity_

public class PersistentScheduleActivity extends BaseToolbarFragmentActivity
{

	public PersistentScheduleActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void BaseToolbarFragmentActivity()>
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class PersistentScheduleActivity>
	//    4    7:invokevirtual   #69  <Method String Class.getSimpleName()>
	//    5   10:invokestatic    #74  <Method String j.r(String)>
	//    6   13:putfield        #76  <Field String k>
	//    7   16:aload_0         
	//    8   17:bipush          9
	//    9   19:putfield        #78  <Field int l>
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:putfield        #80  <Field int m>
		b = false;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #82  <Field boolean b>
		y = new com.irobot.home.b.z.a() {

			public void a(int i1)
			{
				String s1 = com.irobot.home.PersistentScheduleActivity.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field PersistentScheduleActivity a>
			//    2    4:invokestatic    #22  <Method String com.irobot.home.PersistentScheduleActivity.a(PersistentScheduleActivity)>
			//    3    7:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
			//    4    8:new             #24  <Class StringBuilder>
			//    5   11:dup             
			//    6   12:invokespecial   #25  <Method void StringBuilder()>
			//    7   15:astore_3        
				stringbuilder.append("Tapped schedule at index ");
			//    8   16:aload_3         
			//    9   17:ldc1            #27  <String "Tapped schedule at index ">
			//   10   19:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
			//   11   22:pop             
				stringbuilder.append(i1);
			//   12   23:aload_3         
			//   13   24:iload_1         
			//   14   25:invokevirtual   #34  <Method StringBuilder StringBuilder.append(int)>
			//   15   28:pop             
				com.irobot.home.util.o.a(s1, stringbuilder.toString());
			//   16   29:aload_2         
			//   17   30:aload_3         
			//   18   31:invokevirtual   #38  <Method String StringBuilder.toString()>
			//   19   34:invokestatic    #43  <Method void o.a(String, String)>
				a.b(i1);
			//   20   37:aload_0         
			//   21   38:getfield        #14  <Field PersistentScheduleActivity a>
			//   22   41:iload_1         
			//   23   42:invokevirtual   #46  <Method void com.irobot.home.PersistentScheduleActivity.b(int)>
			//   24   45:return          
			}

			public void a(int i1, boolean flag)
			{
				String s1 = com.irobot.home.PersistentScheduleActivity.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field PersistentScheduleActivity a>
			//    2    4:invokestatic    #22  <Method String com.irobot.home.PersistentScheduleActivity.a(PersistentScheduleActivity)>
			//    3    7:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
			//    4    8:new             #24  <Class StringBuilder>
			//    5   11:dup             
			//    6   12:invokespecial   #25  <Method void StringBuilder()>
			//    7   15:astore          4
				stringbuilder.append("Switched schedule at index ");
			//    8   17:aload           4
			//    9   19:ldc1            #49  <String "Switched schedule at index ">
			//   10   21:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
			//   11   24:pop             
				stringbuilder.append(i1);
			//   12   25:aload           4
			//   13   27:iload_1         
			//   14   28:invokevirtual   #34  <Method StringBuilder StringBuilder.append(int)>
			//   15   31:pop             
				stringbuilder.append(" to state ");
			//   16   32:aload           4
			//   17   34:ldc1            #51  <String " to state ">
			//   18   36:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
			//   19   39:pop             
				stringbuilder.append(flag);
			//   20   40:aload           4
			//   21   42:iload_2         
			//   22   43:invokevirtual   #54  <Method StringBuilder StringBuilder.append(boolean)>
			//   23   46:pop             
				com.irobot.home.util.o.a(s1, stringbuilder.toString());
			//   24   47:aload_3         
			//   25   48:aload           4
			//   26   50:invokevirtual   #38  <Method String StringBuilder.toString()>
			//   27   53:invokestatic    #43  <Method void o.a(String, String)>
				if(com.irobot.home.PersistentScheduleActivity.b(a) != null)
			//*  28   56:aload_0         
			//*  29   57:getfield        #14  <Field PersistentScheduleActivity a>
			//*  30   60:invokestatic    #57  <Method ScheduleUIService com.irobot.home.PersistentScheduleActivity.b(PersistentScheduleActivity)>
			//*  31   63:ifnull          94
				{
					ScheduleUIServiceData scheduleuiservicedata = ScheduleUIServiceData.create();
			//   32   66:invokestatic    #63  <Method ScheduleUIServiceData ScheduleUIServiceData.create()>
			//   33   69:astore_3        
					scheduleuiservicedata.setMappingScheduleItemSwitchEnabled(flag);
			//   34   70:aload_3         
			//   35   71:iload_2         
			//   36   72:invokevirtual   #67  <Method void ScheduleUIServiceData.setMappingScheduleItemSwitchEnabled(boolean)>
					scheduleuiservicedata.setScheduleItemIndex(i1);
			//   37   75:aload_3         
			//   38   76:iload_1         
			//   39   77:invokevirtual   #70  <Method void ScheduleUIServiceData.setScheduleItemIndex(int)>
					com.irobot.home.PersistentScheduleActivity.b(a).sendCommand(ScheduleUIServiceCommand.MappingScheduleItemToggled, scheduleuiservicedata);
			//   40   80:aload_0         
			//   41   81:getfield        #14  <Field PersistentScheduleActivity a>
			//   42   84:invokestatic    #57  <Method ScheduleUIService com.irobot.home.PersistentScheduleActivity.b(PersistentScheduleActivity)>
			//   43   87:getstatic       #76  <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.MappingScheduleItemToggled>
			//   44   90:aload_3         
			//   45   91:invokevirtual   #82  <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
				}
			//   46   94:return          
			}

			final PersistentScheduleActivity a;

			
			{
				a = PersistentScheduleActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field PersistentScheduleActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   16   32:aload_0         
	//   17   33:new             #6   <Class PersistentScheduleActivity$1>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:invokespecial   #85  <Method void PersistentScheduleActivity$1(PersistentScheduleActivity)>
	//   21   41:putfield        #87  <Field com.irobot.home.b.z$a y>
		z = ((ScheduleUIServiceDataCallback) (new ScheduleUIServiceDataCallback() {

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
			//    6   14:ifeq            252
					ScheduleViewState scheduleviewstate = (ScheduleViewState)iterator.next();
			//    7   17:aload_2         
			//    8   18:invokeinterface #40  <Method Object Iterator.next()>
			//    9   23:checkcast       #42  <Class ScheduleViewState>
			//   10   26:astore_3        
					com.irobot.home.util.o.a(com.irobot.home.PersistentScheduleActivity.a(a), scheduleviewstate.name());
			//   11   27:aload_0         
			//   12   28:getfield        #12  <Field PersistentScheduleActivity a>
			//   13   31:invokestatic    #45  <Method String com.irobot.home.PersistentScheduleActivity.a(PersistentScheduleActivity)>
			//   14   34:aload_3         
			//   15   35:invokevirtual   #49  <Method String ScheduleViewState.name()>
			//   16   38:invokestatic    #54  <Method void o.a(String, String)>
					static class _cls6
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
								a[ScheduleViewState.MappingScheduleShowConflictDialog.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowConflictDialog>
						//    6   15:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #20  <Field int[] a>
						//*  10   23:getstatic       #31  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowProgressDialog>
						//*  11   26:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:getstatic       #20  <Field int[] a>
						//*  15   34:getstatic       #34  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowTimeoutError>
						//*  16   37:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  17   40:iconst_3        
						//*  18   41:iastore         
						//*  19   42:getstatic       #20  <Field int[] a>
						//*  20   45:getstatic       #37  <Field ScheduleViewState ScheduleViewState.MappingScheduleRemoveScheduleItem>
						//*  21   48:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  22   51:iconst_4        
						//*  23   52:iastore         
						//*  24   53:getstatic       #20  <Field int[] a>
						//*  25   56:getstatic       #40  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowCannotConnect>
						//*  26   59:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  27   62:iconst_5        
						//*  28   63:iastore         
						//*  29   64:getstatic       #20  <Field int[] a>
						//*  30   67:getstatic       #43  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowConnectionErrorDialog>
						//*  31   70:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  32   73:bipush          6
						//*  33   75:iastore         
						//*  34   76:getstatic       #20  <Field int[] a>
						//*  35   79:getstatic       #46  <Field ScheduleViewState ScheduleViewState.MappingScheduleEnableListSelection>
						//*  36   82:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  37   85:bipush          7
						//*  38   87:iastore         
						//*  39   88:getstatic       #20  <Field int[] a>
						//*  40   91:getstatic       #49  <Field ScheduleViewState ScheduleViewState.MappingScheduleDismissAllDialogs>
						//*  41   94:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  42   97:bipush          8
						//*  43   99:iastore         
						//*  44  100:getstatic       #20  <Field int[] a>
						//*  45  103:getstatic       #52  <Field ScheduleViewState ScheduleViewState.MappingScheduleDismissProgressDialog>
						//*  46  106:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  47  109:bipush          9
						//*  48  111:iastore         
						//*  49  112:getstatic       #20  <Field int[] a>
						//*  50  115:getstatic       #55  <Field ScheduleViewState ScheduleViewState.MappingSchedulePopulateSchedulesList>
						//*  51  118:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  52  121:bipush          10
						//*  53  123:iastore         
						//*  54  124:getstatic       #20  <Field int[] a>
						//*  55  127:getstatic       #58  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowMaxCountDialog>
						//*  56  130:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  57  133:bipush          11
						//*  58  135:iastore         
						//*  59  136:getstatic       #20  <Field int[] a>
						//*  60  139:getstatic       #61  <Field ScheduleViewState ScheduleViewState.MappingScheduleShowScheduleCreateScreen>
						//*  61  142:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
						//*  62  145:bipush          12
						//*  63  147:iastore         
						//*  64  148:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   65  149:astore_0        
							try
							{
								a[ScheduleViewState.MappingScheduleShowProgressDialog.ordinal()] = 2;
							}
						//*  66  150:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   67  153:astore_0        
							try
							{
								a[ScheduleViewState.MappingScheduleShowTimeoutError.ordinal()] = 3;
							}
						//*  68  154:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   69  157:astore_0        
							try
							{
								a[ScheduleViewState.MappingScheduleRemoveScheduleItem.ordinal()] = 4;
							}
						//*  70  158:goto            42
							catch(NoSuchFieldError nosuchfielderror3) { }
						//   71  161:astore_0        
							try
							{
								a[ScheduleViewState.MappingScheduleShowCannotConnect.ordinal()] = 5;
							}
						//*  72  162:goto            53
							catch(NoSuchFieldError nosuchfielderror4) { }
						//   73  165:astore_0        
							try
							{
								a[ScheduleViewState.MappingScheduleShowConnectionErrorDialog.ordinal()] = 6;
							}
						//*  74  166:goto            64
							catch(NoSuchFieldError nosuchfielderror5) { }
						//   75  169:astore_0        
							try
							{
								a[ScheduleViewState.MappingScheduleEnableListSelection.ordinal()] = 7;
							}
						//*  76  170:goto            76
							catch(NoSuchFieldError nosuchfielderror6) { }
						//   77  173:astore_0        
							try
							{
								a[ScheduleViewState.MappingScheduleDismissAllDialogs.ordinal()] = 8;
							}
						//*  78  174:goto            88
							catch(NoSuchFieldError nosuchfielderror7) { }
						//   79  177:astore_0        
							try
							{
								a[ScheduleViewState.MappingScheduleDismissProgressDialog.ordinal()] = 9;
							}
						//*  80  178:goto            100
							catch(NoSuchFieldError nosuchfielderror8) { }
						//   81  181:astore_0        
							try
							{
								a[ScheduleViewState.MappingSchedulePopulateSchedulesList.ordinal()] = 10;
							}
						//*  82  182:goto            112
							catch(NoSuchFieldError nosuchfielderror9) { }
						//   83  185:astore_0        
							try
							{
								a[ScheduleViewState.MappingScheduleShowMaxCountDialog.ordinal()] = 11;
							}
						//*  84  186:goto            124
							catch(NoSuchFieldError nosuchfielderror10) { }
						//   85  189:astore_0        
							try
							{
								a[ScheduleViewState.MappingScheduleShowScheduleCreateScreen.ordinal()] = 12;
							}
						//*  86  190:goto            136
							catch(NoSuchFieldError nosuchfielderror11) { }
						//   87  193:astore_0        
						//*  88  194:return          
						}
					}

					switch(com.irobot.home._cls6.a[scheduleviewstate.ordinal()])
			//*  17   41:getstatic       #59  <Field int[] com.irobot.home.PersistentScheduleActivity$6.a>
			//*  18   44:aload_3         
			//*  19   45:invokevirtual   #63  <Method int ScheduleViewState.ordinal()>
			//*  20   48:iaload          
					{
			//*  21   49:tableswitch     1 12: default 112
			//			               1 238
			//			               2 228
			//			               3 214
			//			               4 200
			//			               5 190
			//			               6 180
			//			               7 170
			//			               8 160
			//			               9 139
			//			               10 146
			//			               11 129
			//			               12 115
			//*  22  112:goto            8
					case 12: // '\f'
						PersistentScheduleActivity.c(a, scheduleuiservicedata.getScheduleItemIndex());
			//   23  115:aload_0         
			//   24  116:getfield        #12  <Field PersistentScheduleActivity a>
			//   25  119:aload_1         
			//   26  120:invokevirtual   #66  <Method int ScheduleUIServiceData.getScheduleItemIndex()>
			//   27  123:invokestatic    #70  <Method void PersistentScheduleActivity.c(PersistentScheduleActivity, int)>
						break;

			//*  28  126:goto            8
					case 11: // '\013'
						PersistentScheduleActivity.i(a);
			//   29  129:aload_0         
			//   30  130:getfield        #12  <Field PersistentScheduleActivity a>
			//   31  133:invokestatic    #73  <Method void PersistentScheduleActivity.i(PersistentScheduleActivity)>
						break;

			//*  32  136:goto            8
					case 9: // '\t'
						PersistentScheduleActivity.h(a);
			//   33  139:aload_0         
			//   34  140:getfield        #12  <Field PersistentScheduleActivity a>
			//   35  143:invokestatic    #76  <Method void PersistentScheduleActivity.h(PersistentScheduleActivity)>
						// fall through

					case 10: // '\n'
						com.irobot.home.PersistentScheduleActivity.a(a, scheduleuiservicedata.getMappingScheduleList());
			//   36  146:aload_0         
			//   37  147:getfield        #12  <Field PersistentScheduleActivity a>
			//   38  150:aload_1         
			//   39  151:invokevirtual   #79  <Method ArrayList ScheduleUIServiceData.getMappingScheduleList()>
			//   40  154:invokestatic    #82  <Method void com.irobot.home.PersistentScheduleActivity.a(PersistentScheduleActivity, ArrayList)>
						break;

			//*  41  157:goto            8
					case 8: // '\b'
						PersistentScheduleActivity.g(a);
			//   42  160:aload_0         
			//   43  161:getfield        #12  <Field PersistentScheduleActivity a>
			//   44  164:invokestatic    #85  <Method void PersistentScheduleActivity.g(PersistentScheduleActivity)>
						break;

			//*  45  167:goto            8
					case 7: // '\007'
						PersistentScheduleActivity.f(a);
			//   46  170:aload_0         
			//   47  171:getfield        #12  <Field PersistentScheduleActivity a>
			//   48  174:invokestatic    #88  <Method void PersistentScheduleActivity.f(PersistentScheduleActivity)>
						break;

			//*  49  177:goto            8
					case 6: // '\006'
						PersistentScheduleActivity.e(a);
			//   50  180:aload_0         
			//   51  181:getfield        #12  <Field PersistentScheduleActivity a>
			//   52  184:invokestatic    #91  <Method void PersistentScheduleActivity.e(PersistentScheduleActivity)>
						break;

			//*  53  187:goto            8
					case 5: // '\005'
						PersistentScheduleActivity.d(a);
			//   54  190:aload_0         
			//   55  191:getfield        #12  <Field PersistentScheduleActivity a>
			//   56  194:invokestatic    #94  <Method void PersistentScheduleActivity.d(PersistentScheduleActivity)>
						break;

			//*  57  197:goto            8
					case 4: // '\004'
						com.irobot.home.PersistentScheduleActivity.b(a, scheduleuiservicedata.getScheduleItemIndex());
			//   58  200:aload_0         
			//   59  201:getfield        #12  <Field PersistentScheduleActivity a>
			//   60  204:aload_1         
			//   61  205:invokevirtual   #66  <Method int ScheduleUIServiceData.getScheduleItemIndex()>
			//   62  208:invokestatic    #97  <Method void com.irobot.home.PersistentScheduleActivity.b(PersistentScheduleActivity, int)>
						break;

			//*  63  211:goto            8
					case 3: // '\003'
						com.irobot.home.PersistentScheduleActivity.a(a, scheduleuiservicedata.getTimeoutTag());
			//   64  214:aload_0         
			//   65  215:getfield        #12  <Field PersistentScheduleActivity a>
			//   66  218:aload_1         
			//   67  219:invokevirtual   #100 <Method String ScheduleUIServiceData.getTimeoutTag()>
			//   68  222:invokestatic    #103 <Method void com.irobot.home.PersistentScheduleActivity.a(PersistentScheduleActivity, String)>
						break;

			//*  69  225:goto            8
					case 2: // '\002'
						PersistentScheduleActivity.c(a);
			//   70  228:aload_0         
			//   71  229:getfield        #12  <Field PersistentScheduleActivity a>
			//   72  232:invokestatic    #105 <Method void PersistentScheduleActivity.c(PersistentScheduleActivity)>
						break;

			//*  73  235:goto            8
					case 1: // '\001'
						com.irobot.home.PersistentScheduleActivity.a(a, scheduleuiservicedata.getScheduleItemIndex());
			//   74  238:aload_0         
			//   75  239:getfield        #12  <Field PersistentScheduleActivity a>
			//   76  242:aload_1         
			//   77  243:invokevirtual   #66  <Method int ScheduleUIServiceData.getScheduleItemIndex()>
			//   78  246:invokestatic    #107 <Method void com.irobot.home.PersistentScheduleActivity.a(PersistentScheduleActivity, int)>
						break;
					}
				} while(true);
			//*  79  249:goto            8
			//   80  252:return          
			}

			final PersistentScheduleActivity a;

			
			{
				a = PersistentScheduleActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field PersistentScheduleActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void ScheduleUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   22   44:aload_0         
	//   23   45:new             #8   <Class PersistentScheduleActivity$2>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:invokespecial   #88  <Method void PersistentScheduleActivity$2(PersistentScheduleActivity)>
	//   27   53:putfield        #90  <Field ScheduleUIServiceDataCallback z>
	//   28   56:return          
	}

	static String a(PersistentScheduleActivity persistentscheduleactivity)
	{
		return persistentscheduleactivity.k;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String k>
	//    2    4:areturn         
	}

	private void a(int i1)
	{
		com.irobot.home.PersistentScheduleCreateActivity_.a(((Context) (this))).a(a).b(i1).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #98  <Method PersistentScheduleCreateActivity_$a com.irobot.home.PersistentScheduleCreateActivity_.a(Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #100 <Field String a>
	//    4    8:invokevirtual   #105 <Method PersistentScheduleCreateActivity_$a com.irobot.home.PersistentScheduleCreateActivity_$a.a(String)>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #108 <Method PersistentScheduleCreateActivity_$a com.irobot.home.PersistentScheduleCreateActivity_$a.b(int)>
	//    7   15:invokevirtual   #111 <Method org.androidannotations.api.a.e com.irobot.home.PersistentScheduleCreateActivity_$a.a()>
	//    8   18:pop             
	//    9   19:return          
	}

	static void a(PersistentScheduleActivity persistentscheduleactivity, int i1)
	{
		persistentscheduleactivity.d(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #115 <Method void d(int)>
	//    3    5:return          
	}

	static void a(PersistentScheduleActivity persistentscheduleactivity, String s1)
	{
		persistentscheduleactivity.a(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #119 <Method void a(String)>
	//    3    5:return          
	}

	static void a(PersistentScheduleActivity persistentscheduleactivity, ArrayList arraylist)
	{
		persistentscheduleactivity.a(arraylist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method void a(ArrayList)>
	//    3    5:return          
	}

	private void a(String s1)
	{
		String s2 = k;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String k>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #125 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #126 <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append("Timed out for reason: ");
	//    7   13:aload_3         
	//    8   14:ldc1            #128 <String "Timed out for reason: ">
	//    9   16:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
		stringbuilder.append(s1);
	//   11   20:aload_3         
	//   12   21:aload_1         
	//   13   22:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		com.irobot.home.util.o.a(s2, stringbuilder.toString());
	//   15   26:aload_2         
	//   16   27:aload_3         
	//   17   28:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   18   31:invokestatic    #140 <Method void o.a(String, String)>
		AnalyticsSubsystem.getInstance().trackCleanScheduleTwoTimeoutError(x, s1);
	//   19   34:invokestatic    #146 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   20   37:aload_0         
	//   21   38:getfield        #148 <Field AssetInfo x>
	//   22   41:aload_1         
	//   23   42:invokevirtual   #152 <Method void AnalyticsSubsystem.trackCleanScheduleTwoTimeoutError(AssetInfo, String)>
	//   24   45:return          
	}

	private void a(ArrayList arraylist)
	{
		s = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #154 <Field ArrayList s>
		u.a(((java.util.List) (s)));
	//    3    5:aload_0         
	//    4    6:getfield        #156 <Field z u>
	//    5    9:aload_0         
	//    6   10:getfield        #154 <Field ArrayList s>
	//    7   13:invokevirtual   #161 <Method void z.a(java.util.List)>
	//    8   16:return          
	}

	static ScheduleUIService b(PersistentScheduleActivity persistentscheduleactivity)
	{
		return persistentscheduleactivity.v;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ScheduleUIService v>
	//    2    4:areturn         
	}

	static void b(PersistentScheduleActivity persistentscheduleactivity, int i1)
	{
		persistentscheduleactivity.c(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #169 <Method void c(int)>
	//    3    5:return          
	}

	private void c(int i1)
	{
		s.remove(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field ArrayList s>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #175 <Method Object ArrayList.remove(int)>
	//    4    8:pop             
		u.d(i1);
	//    5    9:aload_0         
	//    6   10:getfield        #156 <Field z u>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #176 <Method void z.d(int)>
	//    9   17:return          
	}

	static void c(PersistentScheduleActivity persistentscheduleactivity)
	{
		persistentscheduleactivity.r();
	//    0    0:aload_0         
	//    1    1:invokespecial   #178 <Method void r()>
	//    2    4:return          
	}

	static void c(PersistentScheduleActivity persistentscheduleactivity, int i1)
	{
		persistentscheduleactivity.a(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #180 <Method void a(int)>
	//    3    5:return          
	}

	private void d(int i1)
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field a q>
	//*   2    4:ifnull          14
			q.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #182 <Field a q>
	//    5   11:invokevirtual   #187 <Method void a.dismiss()>
		q = (new android.support.v7.app.a.a(((Context) (this)))).a(0x7f0f07c7).b(((CharSequence) (getString(0x7f0f07c5, new Object[] {
			x.getName()
		})))).a(0x7f0f0298, new android.content.DialogInterface.OnClickListener(i1) {

			public void onClick(DialogInterface dialoginterface, int j1)
			{
				b.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field PersistentScheduleActivity b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field int a>
			//    4    8:invokevirtual   #29  <Method void com.irobot.home.PersistentScheduleActivity.b(int)>
			//    5   11:return          
			}

			final int a;
			final PersistentScheduleActivity b;

			
			{
				b = PersistentScheduleActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PersistentScheduleActivity b>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
).b(0x7f0f017d, new android.content.DialogInterface.OnClickListener(i1) {

			public void onClick(DialogInterface dialoginterface, int j1)
			{
				com.irobot.home.PersistentScheduleActivity.j(b).c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field PersistentScheduleActivity b>
			//    2    4:invokestatic    #31  <Method z com.irobot.home.PersistentScheduleActivity.j(PersistentScheduleActivity)>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field int a>
			//    5   11:invokevirtual   #36  <Method void z.c(int)>
			//    6   14:return          
			}

			final int a;
			final PersistentScheduleActivity b;

			
			{
				b = PersistentScheduleActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PersistentScheduleActivity b>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
).a(false).c();
	//    6   14:aload_0         
	//    7   15:new             #189 <Class android.support.v7.app.a$a>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #192 <Method void android.support.v7.app.a$a(Context)>
	//   11   23:ldc1            #193 <Int 0x7f0f07c7>
	//   12   25:invokevirtual   #196 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int)>
	//   13   28:aload_0         
	//   14   29:ldc1            #197 <Int 0x7f0f07c5>
	//   15   31:iconst_1        
	//   16   32:anewarray       Object[]
	//   17   35:dup             
	//   18   36:iconst_0        
	//   19   37:aload_0         
	//   20   38:getfield        #148 <Field AssetInfo x>
	//   21   41:invokevirtual   #204 <Method String AssetInfo.getName()>
	//   22   44:aastore         
	//   23   45:invokevirtual   #208 <Method String getString(int, Object[])>
	//   24   48:invokevirtual   #211 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(CharSequence)>
	//   25   51:ldc1            #212 <Int 0x7f0f0298>
	//   26   53:new             #16  <Class PersistentScheduleActivity$5>
	//   27   56:dup             
	//   28   57:aload_0         
	//   29   58:iload_1         
	//   30   59:invokespecial   #214 <Method void PersistentScheduleActivity$5(PersistentScheduleActivity, int)>
	//   31   62:invokevirtual   #217 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
	//   32   65:ldc1            #218 <Int 0x7f0f017d>
	//   33   67:new             #14  <Class PersistentScheduleActivity$4>
	//   34   70:dup             
	//   35   71:aload_0         
	//   36   72:iload_1         
	//   37   73:invokespecial   #219 <Method void PersistentScheduleActivity$4(PersistentScheduleActivity, int)>
	//   38   76:invokevirtual   #221 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int, android.content.DialogInterface$OnClickListener)>
	//   39   79:iconst_0        
	//   40   80:invokevirtual   #224 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(boolean)>
	//   41   83:invokevirtual   #227 <Method a android.support.v7.app.a$a.c()>
	//   42   86:putfield        #182 <Field a q>
	//   43   89:return          
	}

	static void d(PersistentScheduleActivity persistentscheduleactivity)
	{
		persistentscheduleactivity.o();
	//    0    0:aload_0         
	//    1    1:invokespecial   #229 <Method void o()>
	//    2    4:return          
	}

	static void e(PersistentScheduleActivity persistentscheduleactivity)
	{
		persistentscheduleactivity.p();
	//    0    0:aload_0         
	//    1    1:invokespecial   #232 <Method void p()>
	//    2    4:return          
	}

	static void f(PersistentScheduleActivity persistentscheduleactivity)
	{
		persistentscheduleactivity.q();
	//    0    0:aload_0         
	//    1    1:invokespecial   #234 <Method void q()>
	//    2    4:return          
	}

	static void g(PersistentScheduleActivity persistentscheduleactivity)
	{
		persistentscheduleactivity.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #236 <Method void n()>
	//    2    4:return          
	}

	static void h(PersistentScheduleActivity persistentscheduleactivity)
	{
		persistentscheduleactivity.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void m()>
	//    2    4:return          
	}

	static void i(PersistentScheduleActivity persistentscheduleactivity)
	{
		persistentscheduleactivity.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #240 <Method void l()>
	//    2    4:return          
	}

	static z j(PersistentScheduleActivity persistentscheduleactivity)
	{
		return persistentscheduleactivity.u;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field z u>
	//    2    4:areturn         
	}

	private void k()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #125 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #126 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append(getString(0x7f0f0499));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:ldc1            #242 <Int 0x7f0f0499>
	//    7   12:invokevirtual   #245 <Method String getString(int)>
	//    8   15:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		((StringBuilder) (obj)).append(", ");
	//   10   19:aload_1         
	//   11   20:ldc1            #247 <String ", ">
	//   12   22:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		((StringBuilder) (obj)).append(getString(0x7f0f0962));
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:ldc1            #248 <Int 0x7f0f0962>
	//   17   30:invokevirtual   #245 <Method String getString(int)>
	//   18   33:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
		((StringBuilder) (obj)).append(", ");
	//   20   37:aload_1         
	//   21   38:ldc1            #247 <String ", ">
	//   22   40:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		((StringBuilder) (obj)).append(getString(0x7f0f033c));
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:ldc1            #249 <Int 0x7f0f033c>
	//   27   48:invokevirtual   #245 <Method String getString(int)>
	//   28   51:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
		j.setText(((CharSequence) (((StringBuilder) (obj)).toString())));
	//   30   55:aload_0         
	//   31   56:getfield        #251 <Field TextView j>
	//   32   59:aload_1         
	//   33   60:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   34   63:invokevirtual   #257 <Method void TextView.setText(CharSequence)>
		obj = ((Object) (new StringBuilder()));
	//   35   66:new             #125 <Class StringBuilder>
	//   36   69:dup             
	//   37   70:invokespecial   #126 <Method void StringBuilder()>
	//   38   73:astore_1        
		((StringBuilder) (obj)).append(getString(0x7f0f0498));
	//   39   74:aload_1         
	//   40   75:aload_0         
	//   41   76:ldc2            #258 <Int 0x7f0f0498>
	//   42   79:invokevirtual   #245 <Method String getString(int)>
	//   43   82:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   44   85:pop             
		((StringBuilder) (obj)).append(", ");
	//   45   86:aload_1         
	//   46   87:ldc1            #247 <String ", ">
	//   47   89:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   48   92:pop             
		((StringBuilder) (obj)).append(getString(0x7f0f0961));
	//   49   93:aload_1         
	//   50   94:aload_0         
	//   51   95:ldc2            #259 <Int 0x7f0f0961>
	//   52   98:invokevirtual   #245 <Method String getString(int)>
	//   53  101:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   54  104:pop             
		((StringBuilder) (obj)).append(", ");
	//   55  105:aload_1         
	//   56  106:ldc1            #247 <String ", ">
	//   57  108:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   58  111:pop             
		((StringBuilder) (obj)).append(getString(0x7f0f033b));
	//   59  112:aload_1         
	//   60  113:aload_0         
	//   61  114:ldc2            #260 <Int 0x7f0f033b>
	//   62  117:invokevirtual   #245 <Method String getString(int)>
	//   63  120:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
	//   64  123:pop             
		j.setContentDescription(((CharSequence) (obj)));
	//   65  124:aload_0         
	//   66  125:getfield        #251 <Field TextView j>
	//   67  128:aload_1         
	//   68  129:invokevirtual   #263 <Method void TextView.setContentDescription(CharSequence)>
		obj = ((Object) (new SimpleDateFormat("HH:mm")));
	//   69  132:new             #265 <Class SimpleDateFormat>
	//   70  135:dup             
	//   71  136:ldc2            #267 <String "HH:mm">
	//   72  139:invokespecial   #269 <Method void SimpleDateFormat(String)>
	//   73  142:astore_1        
		java.util.Date date = (new b()).a(9).b(0).g();
	//   74  143:new             #271 <Class b>
	//   75  146:dup             
	//   76  147:invokespecial   #272 <Method void b()>
	//   77  150:bipush          9
	//   78  152:invokevirtual   #275 <Method b b.a(int)>
	//   79  155:iconst_0        
	//   80  156:invokevirtual   #277 <Method b b.b(int)>
	//   81  159:invokevirtual   #280 <Method java.util.Date b.g()>
	//   82  162:astore_2        
		i.setText(((CharSequence) (((SimpleDateFormat) (obj)).format(date))));
	//   83  163:aload_0         
	//   84  164:getfield        #282 <Field TextView i>
	//   85  167:aload_1         
	//   86  168:aload_2         
	//   87  169:invokevirtual   #286 <Method String SimpleDateFormat.format(java.util.Date)>
	//   88  172:invokevirtual   #257 <Method void TextView.setText(CharSequence)>
		u = new z(((Context) (this)), y);
	//   89  175:aload_0         
	//   90  176:new             #158 <Class z>
	//   91  179:dup             
	//   92  180:aload_0         
	//   93  181:aload_0         
	//   94  182:getfield        #87  <Field com.irobot.home.b.z$a y>
	//   95  185:invokespecial   #289 <Method void z(Context, com.irobot.home.b.z$a)>
	//   96  188:putfield        #156 <Field z u>
		f.setAdapter(((android.support.v7.widget.RecyclerView.a) (u)));
	//   97  191:aload_0         
	//   98  192:getfield        #291 <Field EmptySupportedRecyclerView f>
	//   99  195:aload_0         
	//  100  196:getfield        #156 <Field z u>
	//  101  199:invokevirtual   #297 <Method void EmptySupportedRecyclerView.setAdapter(android.support.v7.widget.RecyclerView$a)>
		f.m(((View) (g)));
	//  102  202:aload_0         
	//  103  203:getfield        #291 <Field EmptySupportedRecyclerView f>
	//  104  206:aload_0         
	//  105  207:getfield        #299 <Field CustomTextView g>
	//  106  210:invokevirtual   #302 <Method void EmptySupportedRecyclerView.m(View)>
		f.m(h);
	//  107  213:aload_0         
	//  108  214:getfield        #291 <Field EmptySupportedRecyclerView f>
	//  109  217:aload_0         
	//  110  218:getfield        #304 <Field View h>
	//  111  221:invokevirtual   #302 <Method void EmptySupportedRecyclerView.m(View)>
		f.setLayoutManager(((android.support.v7.widget.RecyclerView.h) (new LinearLayoutManager(((Context) (this)), 1, false))));
	//  112  224:aload_0         
	//  113  225:getfield        #291 <Field EmptySupportedRecyclerView f>
	//  114  228:new             #306 <Class LinearLayoutManager>
	//  115  231:dup             
	//  116  232:aload_0         
	//  117  233:iconst_1        
	//  118  234:iconst_0        
	//  119  235:invokespecial   #309 <Method void LinearLayoutManager(Context, int, boolean)>
	//  120  238:invokevirtual   #313 <Method void EmptySupportedRecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$h)>
		f.a(((android.support.v7.widget.RecyclerView.g) (new x(((Context) (this)), 1))));
	//  121  241:aload_0         
	//  122  242:getfield        #291 <Field EmptySupportedRecyclerView f>
	//  123  245:new             #315 <Class x>
	//  124  248:dup             
	//  125  249:aload_0         
	//  126  250:iconst_1        
	//  127  251:invokespecial   #318 <Method void x(Context, int)>
	//  128  254:invokevirtual   #321 <Method void EmptySupportedRecyclerView.a(android.support.v7.widget.RecyclerView$g)>
		w = ((ak) (new ak(((Context) (this)), ((RecyclerView) (f))) {

			public void a(android.support.v7.widget.RecyclerView.u u1, ArrayList arraylist)
			{
				arraylist.add(((Object) ((new com.irobot.home.view.RevealableView.a(((Context) (a)))).a(0x7f0600a1).b(0x7f08012c).a(new com.irobot.home.view.RevealableView.b(this) {

					public void a(int i1)
					{
						String s1 = com.irobot.home.PersistentScheduleActivity.a(a.a);
					//    0    0:aload_0         
					//    1    1:getfield        #16  <Field PersistentScheduleActivity$3 a>
					//    2    4:getfield        #24  <Field PersistentScheduleActivity com.irobot.home.PersistentScheduleActivity$3.a>
					//    3    7:invokestatic    #29  <Method String com.irobot.home.PersistentScheduleActivity.a(PersistentScheduleActivity)>
					//    4   10:astore_2        
						StringBuilder stringbuilder = new StringBuilder();
					//    5   11:new             #31  <Class StringBuilder>
					//    6   14:dup             
					//    7   15:invokespecial   #32  <Method void StringBuilder()>
					//    8   18:astore_3        
						stringbuilder.append("Swiped schedule at index: ");
					//    9   19:aload_3         
					//   10   20:ldc1            #34  <String "Swiped schedule at index: ">
					//   11   22:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
					//   12   25:pop             
						stringbuilder.append(i1);
					//   13   26:aload_3         
					//   14   27:iload_1         
					//   15   28:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
					//   16   31:pop             
						com.irobot.home.util.o.a(s1, stringbuilder.toString());
					//   17   32:aload_2         
					//   18   33:aload_3         
					//   19   34:invokevirtual   #45  <Method String StringBuilder.toString()>
					//   20   37:invokestatic    #50  <Method void o.a(String, String)>
						if(com.irobot.home.PersistentScheduleActivity.b(a.a) != null)
					//*  21   40:aload_0         
					//*  22   41:getfield        #16  <Field PersistentScheduleActivity$3 a>
					//*  23   44:getfield        #24  <Field PersistentScheduleActivity com.irobot.home.PersistentScheduleActivity$3.a>
					//*  24   47:invokestatic    #54  <Method ScheduleUIService com.irobot.home.PersistentScheduleActivity.b(PersistentScheduleActivity)>
					//*  25   50:ifnull          80
						{
							ScheduleUIServiceData scheduleuiservicedata = ScheduleUIServiceData.create();
					//   26   53:invokestatic    #60  <Method ScheduleUIServiceData ScheduleUIServiceData.create()>
					//   27   56:astore_2        
							scheduleuiservicedata.setScheduleItemIndex(i1);
					//   28   57:aload_2         
					//   29   58:iload_1         
					//   30   59:invokevirtual   #63  <Method void ScheduleUIServiceData.setScheduleItemIndex(int)>
							com.irobot.home.PersistentScheduleActivity.b(a.a).sendCommand(ScheduleUIServiceCommand.MappingScheduleItemSwipe, scheduleuiservicedata);
					//   31   62:aload_0         
					//   32   63:getfield        #16  <Field PersistentScheduleActivity$3 a>
					//   33   66:getfield        #24  <Field PersistentScheduleActivity com.irobot.home.PersistentScheduleActivity$3.a>
					//   34   69:invokestatic    #54  <Method ScheduleUIService com.irobot.home.PersistentScheduleActivity.b(PersistentScheduleActivity)>
					//   35   72:getstatic       #69  <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.MappingScheduleItemSwipe>
					//   36   75:aload_2         
					//   37   76:invokevirtual   #75  <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
							return;
					//   38   79:return          
						} else
						{
							com.irobot.home.util.o.e(com.irobot.home.PersistentScheduleActivity.a(a.a), "Schedule subsystem null, cannot delete.");
					//   39   80:aload_0         
					//   40   81:getfield        #16  <Field PersistentScheduleActivity$3 a>
					//   41   84:getfield        #24  <Field PersistentScheduleActivity com.irobot.home.PersistentScheduleActivity$3.a>
					//   42   87:invokestatic    #29  <Method String com.irobot.home.PersistentScheduleActivity.a(PersistentScheduleActivity)>
					//   43   90:ldc1            #77  <String "Schedule subsystem null, cannot delete.">
					//   44   92:invokestatic    #80  <Method void o.e(String, String)>
							com.irobot.home.PersistentScheduleActivity.j(a.a).c(i1);
					//   45   95:aload_0         
					//   46   96:getfield        #16  <Field PersistentScheduleActivity$3 a>
					//   47   99:getfield        #24  <Field PersistentScheduleActivity com.irobot.home.PersistentScheduleActivity$3.a>
					//   48  102:invokestatic    #84  <Method z com.irobot.home.PersistentScheduleActivity.j(PersistentScheduleActivity)>
					//   49  105:iload_1         
					//   50  106:invokevirtual   #89  <Method void z.c(int)>
							a.a.j();
					//   51  109:aload_0         
					//   52  110:getfield        #16  <Field PersistentScheduleActivity$3 a>
					//   53  113:getfield        #24  <Field PersistentScheduleActivity com.irobot.home.PersistentScheduleActivity$3.a>
					//   54  116:invokevirtual   #91  <Method void com.irobot.home.PersistentScheduleActivity.j()>
							return;
					//   55  119:return          
						}
					}

					final _cls3 a;

			
			{
				a = _pcls3;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PersistentScheduleActivity$3 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
).a())));
			//    0    0:aload_2         
			//    1    1:new             #24  <Class com.irobot.home.view.RevealableView$a>
			//    2    4:dup             
			//    3    5:aload_0         
			//    4    6:getfield        #17  <Field PersistentScheduleActivity a>
			//    5    9:invokespecial   #27  <Method void com.irobot.home.view.RevealableView$a(Context)>
			//    6   12:ldc1            #28  <Int 0x7f0600a1>
			//    7   14:invokevirtual   #31  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.a(int)>
			//    8   17:ldc1            #32  <Int 0x7f08012c>
			//    9   19:invokevirtual   #35  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.b(int)>
			//   10   22:new             #11  <Class PersistentScheduleActivity$3$1>
			//   11   25:dup             
			//   12   26:aload_0         
			//   13   27:invokespecial   #38  <Method void PersistentScheduleActivity$3$1(PersistentScheduleActivity$3)>
			//   14   30:invokevirtual   #41  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.a(com.irobot.home.view.RevealableView$b)>
			//   15   33:invokevirtual   #44  <Method com.irobot.home.view.RevealableView com.irobot.home.view.RevealableView$a.a()>
			//   16   36:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
			//   17   39:pop             
			//   18   40:return          
			}

			final PersistentScheduleActivity a;

			
			{
				a = PersistentScheduleActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PersistentScheduleActivity a>
				super(context, recyclerview);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #20  <Method void ak(Context, RecyclerView)>
			//    7   11:return          
			}
		}
));
	//  129  257:aload_0         
	//  130  258:new             #10  <Class PersistentScheduleActivity$3>
	//  131  261:dup             
	//  132  262:aload_0         
	//  133  263:aload_0         
	//  134  264:aload_0         
	//  135  265:getfield        #291 <Field EmptySupportedRecyclerView f>
	//  136  268:invokespecial   #324 <Method void PersistentScheduleActivity$3(PersistentScheduleActivity, Context, RecyclerView)>
	//  137  271:putfield        #326 <Field ak w>
		t = new android.support.v7.widget.a.a(((android.support.v7.widget.a.a.a) (w)));
	//  138  274:aload_0         
	//  139  275:new             #328 <Class android.support.v7.widget.a.a>
	//  140  278:dup             
	//  141  279:aload_0         
	//  142  280:getfield        #326 <Field ak w>
	//  143  283:invokespecial   #331 <Method void android.support.v7.widget.a.a(android.support.v7.widget.a.a$a)>
	//  144  286:putfield        #333 <Field android.support.v7.widget.a.a t>
		t.a(((RecyclerView) (f)));
	//  145  289:aload_0         
	//  146  290:getfield        #333 <Field android.support.v7.widget.a.a t>
	//  147  293:aload_0         
	//  148  294:getfield        #291 <Field EmptySupportedRecyclerView f>
	//  149  297:invokevirtual   #336 <Method void android.support.v7.widget.a.a.a(RecyclerView)>
		n = LayoutInflater.from(((Context) (this))).inflate(0x7f0b00ee, ((android.view.ViewGroup) (null)));
	//  150  300:aload_0         
	//  151  301:aload_0         
	//  152  302:invokestatic    #342 <Method LayoutInflater LayoutInflater.from(Context)>
	//  153  305:ldc2            #343 <Int 0x7f0b00ee>
	//  154  308:aconst_null     
	//  155  309:invokevirtual   #347 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//  156  312:putfield        #349 <Field View n>
		o = new Toast(((Context) (this)));
	//  157  315:aload_0         
	//  158  316:new             #351 <Class Toast>
	//  159  319:dup             
	//  160  320:aload_0         
	//  161  321:invokespecial   #352 <Method void Toast(Context)>
	//  162  324:putfield        #354 <Field Toast o>
		o.setView(n);
	//  163  327:aload_0         
	//  164  328:getfield        #354 <Field Toast o>
	//  165  331:aload_0         
	//  166  332:getfield        #349 <Field View n>
	//  167  335:invokevirtual   #357 <Method void Toast.setView(View)>
		o.setDuration(0);
	//  168  338:aload_0         
	//  169  339:getfield        #354 <Field Toast o>
	//  170  342:iconst_0        
	//  171  343:invokevirtual   #360 <Method void Toast.setDuration(int)>
		o.setGravity(17, 0, 0);
	//  172  346:aload_0         
	//  173  347:getfield        #354 <Field Toast o>
	//  174  350:bipush          17
	//  175  352:iconst_0        
	//  176  353:iconst_0        
	//  177  354:invokevirtual   #364 <Method void Toast.setGravity(int, int, int)>
		obj = ((Object) (LayoutInflater.from(((Context) (this))).inflate(0x7f0b009f, ((android.view.ViewGroup) (null)))));
	//  178  357:aload_0         
	//  179  358:invokestatic    #342 <Method LayoutInflater LayoutInflater.from(Context)>
	//  180  361:ldc2            #365 <Int 0x7f0b009f>
	//  181  364:aconst_null     
	//  182  365:invokevirtual   #347 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//  183  368:astore_1        
		((TextView)((View) (obj)).findViewById(0x7f090431)).setText(((CharSequence) (getString(0x7f0f094b, new Object[] {
			x.getName()
		}))));
	//  184  369:aload_1         
	//  185  370:ldc2            #366 <Int 0x7f090431>
	//  186  373:invokevirtual   #372 <Method View View.findViewById(int)>
	//  187  376:checkcast       #253 <Class TextView>
	//  188  379:aload_0         
	//  189  380:ldc2            #373 <Int 0x7f0f094b>
	//  190  383:iconst_1        
	//  191  384:anewarray       Object[]
	//  192  387:dup             
	//  193  388:iconst_0        
	//  194  389:aload_0         
	//  195  390:getfield        #148 <Field AssetInfo x>
	//  196  393:invokevirtual   #204 <Method String AssetInfo.getName()>
	//  197  396:aastore         
	//  198  397:invokevirtual   #208 <Method String getString(int, Object[])>
	//  199  400:invokevirtual   #257 <Method void TextView.setText(CharSequence)>
		p = (new android.support.v7.app.a.a(((Context) (this)))).b(((View) (obj))).a(false).b();
	//  200  403:aload_0         
	//  201  404:new             #189 <Class android.support.v7.app.a$a>
	//  202  407:dup             
	//  203  408:aload_0         
	//  204  409:invokespecial   #192 <Method void android.support.v7.app.a$a(Context)>
	//  205  412:aload_1         
	//  206  413:invokevirtual   #376 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(View)>
	//  207  416:iconst_0        
	//  208  417:invokevirtual   #224 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(boolean)>
	//  209  420:invokevirtual   #378 <Method a android.support.v7.app.a$a.b()>
	//  210  423:putfield        #380 <Field a p>
		p.getWindow().setBackgroundDrawable(((android.graphics.drawable.Drawable) (new ColorDrawable(0))));
	//  211  426:aload_0         
	//  212  427:getfield        #380 <Field a p>
	//  213  430:invokevirtual   #384 <Method Window a.getWindow()>
	//  214  433:new             #386 <Class ColorDrawable>
	//  215  436:dup             
	//  216  437:iconst_0        
	//  217  438:invokespecial   #388 <Method void ColorDrawable(int)>
	//  218  441:invokevirtual   #394 <Method void Window.setBackgroundDrawable(android.graphics.drawable.Drawable)>
		p.setCanceledOnTouchOutside(false);
	//  219  444:aload_0         
	//  220  445:getfield        #380 <Field a p>
	//  221  448:iconst_0        
	//  222  449:invokevirtual   #398 <Method void a.setCanceledOnTouchOutside(boolean)>
	//  223  452:return          
	}

	private void l()
	{
		if(r == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #400 <Field a r>
	//*   2    4:ifnonnull       59
			r = (new android.support.v7.app.a.a(((Context) (this)))).a(0x7f0f07c9).b(((CharSequence) (getString(0x7f0f07c8, new Object[] {
				x.getName()
			})))).a(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).b();
	//    3    7:aload_0         
	//    4    8:new             #189 <Class android.support.v7.app.a$a>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #192 <Method void android.support.v7.app.a$a(Context)>
	//    8   16:ldc2            #401 <Int 0x7f0f07c9>
	//    9   19:invokevirtual   #196 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int)>
	//   10   22:aload_0         
	//   11   23:ldc2            #402 <Int 0x7f0f07c8>
	//   12   26:iconst_1        
	//   13   27:anewarray       Object[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:aload_0         
	//   17   33:getfield        #148 <Field AssetInfo x>
	//   18   36:invokevirtual   #204 <Method String AssetInfo.getName()>
	//   19   39:aastore         
	//   20   40:invokevirtual   #208 <Method String getString(int, Object[])>
	//   21   43:invokevirtual   #211 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(CharSequence)>
	//   22   46:ldc2            #403 <Int 0x7f0f05bb>
	//   23   49:aconst_null     
	//   24   50:invokevirtual   #217 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
	//   25   53:invokevirtual   #378 <Method a android.support.v7.app.a$a.b()>
	//   26   56:putfield        #400 <Field a r>
		r.show();
	//   27   59:aload_0         
	//   28   60:getfield        #400 <Field a r>
	//   29   63:invokevirtual   #406 <Method void a.show()>
	//   30   66:return          
	}

	private void m()
	{
		p.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #380 <Field a p>
	//    2    4:invokevirtual   #187 <Method void a.dismiss()>
	//    3    7:return          
	}

	private void n()
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field a q>
	//*   2    4:ifnull          14
			q.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #182 <Field a q>
	//    5   11:invokevirtual   #187 <Method void a.dismiss()>
		if(r != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #400 <Field a r>
	//*   8   18:ifnull          28
			r.dismiss();
	//    9   21:aload_0         
	//   10   22:getfield        #400 <Field a r>
	//   11   25:invokevirtual   #187 <Method void a.dismiss()>
		if(p != null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #380 <Field a p>
	//*  14   32:ifnull          42
			p.dismiss();
	//   15   35:aload_0         
	//   16   36:getfield        #380 <Field a p>
	//   17   39:invokevirtual   #187 <Method void a.dismiss()>
	//   18   42:return          
	}

	private void o()
	{
		j();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #408 <Method void j()>
	//    2    4:return          
	}

	private void p()
	{
		com.irobot.home.util.j.b(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #411 <Method void j.b(android.app.Activity)>
	//    2    4:return          
	}

	private void q()
	{
		u.b(true);
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field z u>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #413 <Method void z.b(boolean)>
		u.a(DateFormat.is24HourFormat(getApplicationContext()));
	//    4    8:aload_0         
	//    5    9:getfield        #156 <Field z u>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #417 <Method Context getApplicationContext()>
	//    8   16:invokestatic    #423 <Method boolean DateFormat.is24HourFormat(Context)>
	//    9   19:invokevirtual   #425 <Method void z.a(boolean)>
	//   10   22:return          
	}

	private void r()
	{
		p.show();
	//    0    0:aload_0         
	//    1    1:getfield        #380 <Field a p>
	//    2    4:invokevirtual   #406 <Method void a.show()>
	//    3    7:return          
	}

	protected void b(int i1)
	{
		ScheduleUIServiceData scheduleuiservicedata = ScheduleUIServiceData.create();
	//    0    0:invokestatic    #431 <Method ScheduleUIServiceData ScheduleUIServiceData.create()>
	//    1    3:astore_2        
		scheduleuiservicedata.setScheduleItemIndex(i1);
	//    2    4:aload_2         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #434 <Method void ScheduleUIServiceData.setScheduleItemIndex(int)>
		v.sendCommand(ScheduleUIServiceCommand.MappingScheduleLaunchCreateSchedule, scheduleuiservicedata);
	//    5    9:aload_0         
	//    6   10:getfield        #166 <Field ScheduleUIService v>
	//    7   13:getstatic       #440 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.MappingScheduleLaunchCreateSchedule>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #446 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
	//   10   20:return          
	}

	protected void e()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #171 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #447 <Method void ArrayList()>
	//    3    7:astore_1        
		x = com.irobot.home.util.j.a(a).a();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #100 <Field String a>
	//    7   13:invokestatic    #450 <Method com.irobot.home.model.a j.a(String)>
	//    8   16:invokevirtual   #455 <Method AssetInfo com.irobot.home.model.a.a()>
	//    9   19:putfield        #148 <Field AssetInfo x>
		arraylist.add(((Object) (x.getName())));
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #148 <Field AssetInfo x>
	//   13   27:invokevirtual   #204 <Method String AssetInfo.getName()>
	//   14   30:invokevirtual   #459 <Method boolean ArrayList.add(Object)>
	//   15   33:pop             
		a(0x7f0f08af, ((ArrayList) (null)));
	//   16   34:aload_0         
	//   17   35:ldc2            #460 <Int 0x7f0f08af>
	//   18   38:aconst_null     
	//   19   39:invokevirtual   #463 <Method void a(int, ArrayList)>
		a(true, 0);
	//   20   42:aload_0         
	//   21   43:iconst_1        
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #466 <Method void a(boolean, int)>
		e = true;
	//   24   48:aload_0         
	//   25   49:iconst_1        
	//   26   50:putfield        #468 <Field boolean e>
	//   27   53:return          
	}

	protected void f()
	{
		k();
	//    0    0:aload_0         
	//    1    1:invokespecial   #470 <Method void k()>
		v = Assembler.getInstance().getScheduleUIService(x.getAssetId());
	//    2    4:aload_0         
	//    3    5:invokestatic    #475 <Method Assembler Assembler.getInstance()>
	//    4    8:aload_0         
	//    5    9:getfield        #148 <Field AssetInfo x>
	//    6   12:invokevirtual   #479 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//    7   15:invokevirtual   #483 <Method ScheduleUIService Assembler.getScheduleUIService(com.irobot.core.AssetId)>
	//    8   18:putfield        #166 <Field ScheduleUIService v>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.CleanScheduleTwoWelcome, x);
	//    9   21:invokestatic    #146 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   10   24:getstatic       #489 <Field ViewId ViewId.CleanScheduleTwoWelcome>
	//   11   27:aload_0         
	//   12   28:getfield        #148 <Field AssetInfo x>
	//   13   31:invokevirtual   #493 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//   14   34:return          
	}

	protected void g()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #496 <Method void finish()>
	//    2    4:return          
	}

	protected void h()
	{
		if(com.irobot.home.util.j.j() != null && com.irobot.home.util.j.j().a().isVirtual())
	//*   0    0:invokestatic    #499 <Method com.irobot.home.model.a j.j()>
	//*   1    3:ifnull          29
	//*   2    6:invokestatic    #499 <Method com.irobot.home.model.a j.j()>
	//*   3    9:invokevirtual   #455 <Method AssetInfo com.irobot.home.model.a.a()>
	//*   4   12:invokevirtual   #503 <Method boolean AssetInfo.isVirtual()>
	//*   5   15:ifeq            29
		{
			com.irobot.home.util.o.a(k, "Not allowing create new entry with virtual asset");
	//    6   18:aload_0         
	//    7   19:getfield        #76  <Field String k>
	//    8   22:ldc2            #505 <String "Not allowing create new entry with virtual asset">
	//    9   25:invokestatic    #140 <Method void o.a(String, String)>
			return;
	//   10   28:return          
		} else
		{
			com.irobot.home.util.o.a(k, "User pressed create new schedule");
	//   11   29:aload_0         
	//   12   30:getfield        #76  <Field String k>
	//   13   33:ldc2            #507 <String "User pressed create new schedule">
	//   14   36:invokestatic    #140 <Method void o.a(String, String)>
			AnalyticsSubsystem.getInstance().trackCleanScheduleTwoAddPressed(com.irobot.home.util.j.a(a).a());
	//   15   39:invokestatic    #146 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   16   42:aload_0         
	//   17   43:getfield        #100 <Field String a>
	//   18   46:invokestatic    #450 <Method com.irobot.home.model.a j.a(String)>
	//   19   49:invokevirtual   #455 <Method AssetInfo com.irobot.home.model.a.a()>
	//   20   52:invokevirtual   #511 <Method void AnalyticsSubsystem.trackCleanScheduleTwoAddPressed(AssetInfo)>
			b(-1);
	//   21   55:aload_0         
	//   22   56:iconst_m1       
	//   23   57:invokevirtual   #513 <Method void b(int)>
			return;
	//   24   60:return          
		}
	}

	protected void i()
	{
		if(com.irobot.home.util.j.j() != null && com.irobot.home.util.j.j().a().isVirtual())
	//*   0    0:invokestatic    #499 <Method com.irobot.home.model.a j.j()>
	//*   1    3:ifnull          29
	//*   2    6:invokestatic    #499 <Method com.irobot.home.model.a j.j()>
	//*   3    9:invokevirtual   #455 <Method AssetInfo com.irobot.home.model.a.a()>
	//*   4   12:invokevirtual   #503 <Method boolean AssetInfo.isVirtual()>
	//*   5   15:ifeq            29
		{
			com.irobot.home.util.o.a(k, "Not allowing create new popular schedule with virtual asset");
	//    6   18:aload_0         
	//    7   19:getfield        #76  <Field String k>
	//    8   22:ldc2            #515 <String "Not allowing create new popular schedule with virtual asset">
	//    9   25:invokestatic    #140 <Method void o.a(String, String)>
			return;
	//   10   28:return          
		} else
		{
			com.irobot.home.util.o.a(k, "User pressed create popular schedule");
	//   11   29:aload_0         
	//   12   30:getfield        #76  <Field String k>
	//   13   33:ldc2            #517 <String "User pressed create popular schedule">
	//   14   36:invokestatic    #140 <Method void o.a(String, String)>
			AnalyticsSubsystem.getInstance().trackCleanScheduleTwoPopularPressed(com.irobot.home.util.j.a(a).a());
	//   15   39:invokestatic    #146 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   16   42:aload_0         
	//   17   43:getfield        #100 <Field String a>
	//   18   46:invokestatic    #450 <Method com.irobot.home.model.a j.a(String)>
	//   19   49:invokevirtual   #455 <Method AssetInfo com.irobot.home.model.a.a()>
	//   20   52:invokevirtual   #520 <Method void AnalyticsSubsystem.trackCleanScheduleTwoPopularPressed(AssetInfo)>
			b(-1);
	//   21   55:aload_0         
	//   22   56:iconst_m1       
	//   23   57:invokevirtual   #513 <Method void b(int)>
			return;
	//   24   60:return          
		}
	}

	protected void j()
	{
		o.show();
	//    0    0:aload_0         
	//    1    1:getfield        #354 <Field Toast o>
	//    2    4:invokevirtual   #521 <Method void Toast.show()>
	//    3    7:return          
	}

	public void onBackPressed()
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field boolean b>
	//*   2    4:ifeq            24
			((RobotCleanActivity_.a)com.irobot.home.RobotCleanActivity_.a(((Context) (this))).g(0x4000000)).a();
	//    3    7:aload_0         
	//    4    8:invokestatic    #527 <Method RobotCleanActivity_$a com.irobot.home.RobotCleanActivity_.a(Context)>
	//    5   11:ldc2            #528 <Int 0x4000000>
	//    6   14:invokevirtual   #533 <Method org.androidannotations.api.a.d RobotCleanActivity_$a.g(int)>
	//    7   17:checkcast       #530 <Class RobotCleanActivity_$a>
	//    8   20:invokevirtual   #534 <Method org.androidannotations.api.a.e com.irobot.home.RobotCleanActivity_$a.a()>
	//    9   23:pop             
		super.onBackPressed();
	//   10   24:aload_0         
	//   11   25:invokespecial   #536 <Method void BaseToolbarFragmentActivity.onBackPressed()>
	//   12   28:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #539 <Method void BaseToolbarFragmentActivity.onPause()>
		v.sendCommand(ScheduleUIServiceCommand.MappingScheduleViewClosed, ((ScheduleUIServiceData) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #166 <Field ScheduleUIService v>
	//    4    8:getstatic       #542 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.MappingScheduleViewClosed>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #446 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
	//    7   15:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #545 <Method void BaseToolbarFragmentActivity.onResume()>
		v.sendCommand(ScheduleUIServiceCommand.MappingScheduleViewOpened, ((ScheduleUIServiceData) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #166 <Field ScheduleUIService v>
	//    4    8:getstatic       #548 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.MappingScheduleViewOpened>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #446 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
	//    7   15:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #551 <Method void BaseToolbarFragmentActivity.onStart()>
		v.registerUISubscriber(z);
	//    2    4:aload_0         
	//    3    5:getfield        #166 <Field ScheduleUIService v>
	//    4    8:aload_0         
	//    5    9:getfield        #90  <Field ScheduleUIServiceDataCallback z>
	//    6   12:invokevirtual   #555 <Method boolean ScheduleUIService.registerUISubscriber(ScheduleUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #558 <Method void BaseToolbarFragmentActivity.onStop()>
		v.unregisterSubscriber(z);
	//    2    4:aload_0         
	//    3    5:getfield        #166 <Field ScheduleUIService v>
	//    4    8:aload_0         
	//    5    9:getfield        #90  <Field ScheduleUIServiceDataCallback z>
	//    6   12:invokevirtual   #561 <Method boolean ScheduleUIService.unregisterSubscriber(ScheduleUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	String a;
	boolean b;
	EmptySupportedRecyclerView f;
	CustomTextView g;
	View h;
	TextView i;
	TextView j;
	private final String k = com.irobot.home.util.j.r(((Class) (com/irobot/home/PersistentScheduleActivity)).getSimpleName());
	private final int l = 9;
	private final int m = 0;
	private View n;
	private Toast o;
	private a p;
	private a q;
	private a r;
	private ArrayList s;
	private android.support.v7.widget.a.a t;
	private z u;
	private ScheduleUIService v;
	private ak w;
	private AssetInfo x;
	private com.irobot.home.b.z.a y;
	private ScheduleUIServiceDataCallback z;
}
