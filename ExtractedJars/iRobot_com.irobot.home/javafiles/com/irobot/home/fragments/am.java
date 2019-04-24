// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.irobot.core.*;
import com.irobot.home.BaseFragmentActivity;
import com.irobot.home.HistoryInfoActivity_;
import com.irobot.home.model.Robot;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.text.SimpleDateFormat;
import java.util.*;

// Referenced classes of package com.irobot.home.fragments:
//			j

public class am extends com.irobot.home.fragments.j
{

	public am()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void com.irobot.home.fragments.j()>
		p = ((HistoryUIServiceDataCallback) (new HistoryUIServiceDataCallback() {

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
			//    6   14:ifeq            73
					HistoryDataState historydatastate = (HistoryDataState)iterator.next();
			//    7   17:aload_2         
			//    8   18:invokeinterface #40  <Method Object Iterator.next()>
			//    9   23:checkcast       #42  <Class HistoryDataState>
			//   10   26:astore_3        
					com.irobot.home.util.o.a(am.c(), historydatastate.name());
			//   11   27:invokestatic    #46  <Method String am.c()>
			//   12   30:aload_3         
			//   13   31:invokevirtual   #49  <Method String HistoryDataState.name()>
			//   14   34:invokestatic    #54  <Method void o.a(String, String)>
					static class _cls2
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
								a[HistoryDataState.MissionDetailedHistory.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field HistoryDataState HistoryDataState.MissionDetailedHistory>
						//    6   15:invokevirtual   #28  <Method int HistoryDataState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
						//    9   20:return          
							}
							catch(NoSuchFieldError nosuchfielderror) { }
						//   10   21:astore_0        
						//*  11   22:return          
						}
					}

					if(com.irobot.home.fragments._cls2.a[historydatastate.ordinal()] == 1)
			//*  15   37:getstatic       #59  <Field int[] com.irobot.home.fragments.am$2.a>
			//*  16   40:aload_3         
			//*  17   41:invokevirtual   #63  <Method int HistoryDataState.ordinal()>
			//*  18   44:iaload          
			//*  19   45:iconst_1        
			//*  20   46:icmpeq          52
			//*  21   49:goto            8
						com.irobot.home.fragments.am.a(a, historyuiservicedata.getMissionHistoryDetails(a.a));
			//   22   52:aload_0         
			//   23   53:getfield        #12  <Field am a>
			//   24   56:aload_1         
			//   25   57:aload_0         
			//   26   58:getfield        #12  <Field am a>
			//   27   61:getfield        #66  <Field int com.irobot.home.fragments.am.a>
			//   28   64:invokevirtual   #70  <Method RobotMissionHistoryItem HistoryUIServiceData.getMissionHistoryDetails(int)>
			//   29   67:invokestatic    #73  <Method void com.irobot.home.fragments.am.a(am, RobotMissionHistoryItem)>
				} while(true);
			//   30   70:goto            8
			//   31   73:return          
			}

			final am a;

			
			{
				a = am.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field am a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void HistoryUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//    2    4:aload_0         
	//    3    5:new             #6   <Class am$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #40  <Method void am$1(am)>
	//    7   13:putfield        #42  <Field HistoryUIServiceDataCallback p>
	//    8   16:return          
	}

	private CustomTextView a(RelativeLayout relativelayout, int i1)
	{
		com.irobot.home.util.j.a(relativelayout, i1);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #48  <Method TextView j.a(RelativeLayout, int)>
	//    3    5:pop             
		relativelayout = ((RelativeLayout) ((CustomTextView)relativelayout.findViewById(0x7f09042d)));
	//    4    6:aload_1         
	//    5    7:ldc1            #49  <Int 0x7f09042d>
	//    6    9:invokevirtual   #55  <Method android.view.View RelativeLayout.findViewById(int)>
	//    7   12:checkcast       #57  <Class CustomTextView>
	//    8   15:astore_1        
		((CustomTextView) (relativelayout)).setTextAppearance(((Context) (getActivity())), 0x7f1001f3);
	//    9   16:aload_1         
	//   10   17:aload_0         
	//   11   18:invokevirtual   #61  <Method android.support.v4.app.FragmentActivity getActivity()>
	//   12   21:ldc1            #62  <Int 0x7f1001f3>
	//   13   23:invokevirtual   #66  <Method void CustomTextView.setTextAppearance(Context, int)>
		return ((CustomTextView) (relativelayout));
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	private void a(RobotMissionHistoryItem robotmissionhistoryitem)
	{
		Object obj = ((Object) (RobotMissionHistoryItemUtil.makeStartDateForItem(robotmissionhistoryitem)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #73  <Method Date RobotMissionHistoryItemUtil.makeStartDateForItem(RobotMissionHistoryItem)>
	//    2    4:astore          6
		c.setText(((CharSequence) ((new SimpleDateFormat("MMMM d, yyyy")).format(((Date) (obj))))));
	//    3    6:aload_0         
	//    4    7:getfield        #75  <Field TextView c>
	//    5   10:new             #77  <Class SimpleDateFormat>
	//    6   13:dup             
	//    7   14:ldc1            #79  <String "MMMM d, yyyy">
	//    8   16:invokespecial   #82  <Method void SimpleDateFormat(String)>
	//    9   19:aload           6
	//   10   21:invokevirtual   #86  <Method String SimpleDateFormat.format(Date)>
	//   11   24:invokevirtual   #92  <Method void TextView.setText(CharSequence)>
		k.setText(((CharSequence) (DateUtils.formatDateTime(((Context) (getActivity())), ((Date) (obj)).getTime(), 1))));
	//   12   27:aload_0         
	//   13   28:getfield        #94  <Field CustomTextView k>
	//   14   31:aload_0         
	//   15   32:invokevirtual   #61  <Method android.support.v4.app.FragmentActivity getActivity()>
	//   16   35:aload           6
	//   17   37:invokevirtual   #100 <Method long Date.getTime()>
	//   18   40:iconst_1        
	//   19   41:invokestatic    #106 <Method String DateUtils.formatDateTime(Context, long, int)>
	//   20   44:invokevirtual   #107 <Method void CustomTextView.setText(CharSequence)>
		l.setText(((CharSequence) (com.irobot.home.util.j.a(((Context) (getActivity())), robotmissionhistoryitem))));
	//   21   47:aload_0         
	//   22   48:getfield        #109 <Field CustomTextView l>
	//   23   51:aload_0         
	//   24   52:invokevirtual   #61  <Method android.support.v4.app.FragmentActivity getActivity()>
	//   25   55:aload_1         
	//   26   56:invokestatic    #112 <Method String j.a(Context, RobotMissionHistoryItem)>
	//   27   59:invokevirtual   #107 <Method void CustomTextView.setText(CharSequence)>
		obj = ((Object) (getResources()));
	//   28   62:aload_0         
	//   29   63:invokevirtual   #116 <Method Resources getResources()>
	//   30   66:astore          6
		int i1 = robotmissionhistoryitem.getMinutesRunning();
	//   31   68:aload_1         
	//   32   69:invokevirtual   #122 <Method int RobotMissionHistoryItem.getMinutesRunning()>
	//   33   72:istore_2        
		int j1 = robotmissionhistoryitem.getMinutesCharging();
	//   34   73:aload_1         
	//   35   74:invokevirtual   #125 <Method int RobotMissionHistoryItem.getMinutesCharging()>
	//   36   77:istore_3        
		int k1 = robotmissionhistoryitem.getMinutesPaused();
	//   37   78:aload_1         
	//   38   79:invokevirtual   #128 <Method int RobotMissionHistoryItem.getMinutesPaused()>
	//   39   82:istore          4
		j.setText(((CharSequence) (com.irobot.home.util.j.a(i1 + j1 + k1, getContext().getResources()))));
	//   40   84:aload_0         
	//   41   85:getfield        #130 <Field CustomTextView j>
	//   42   88:iload_2         
	//   43   89:iload_3         
	//   44   90:iadd            
	//   45   91:iload           4
	//   46   93:iadd            
	//   47   94:aload_0         
	//   48   95:invokevirtual   #134 <Method Context getContext()>
	//   49   98:invokevirtual   #137 <Method Resources Context.getResources()>
	//   50  101:invokestatic    #140 <Method String j.a(int, Resources)>
	//   51  104:invokevirtual   #107 <Method void CustomTextView.setText(CharSequence)>
		i1 = ((int) (robotmissionhistoryitem.getNumberOfDirtDetects()));
	//   52  107:aload_1         
	//   53  108:invokevirtual   #144 <Method short RobotMissionHistoryItem.getNumberOfDirtDetects()>
	//   54  111:istore_2        
		m.setText(((CharSequence) (((Resources) (obj)).getQuantityString(0x7f0d0009, i1, new Object[] {
			Integer.valueOf(i1)
		}))));
	//   55  112:aload_0         
	//   56  113:getfield        #146 <Field CustomTextView m>
	//   57  116:aload           6
	//   58  118:ldc1            #147 <Int 0x7f0d0009>
	//   59  120:iload_2         
	//   60  121:iconst_1        
	//   61  122:anewarray       Object[]
	//   62  125:dup             
	//   63  126:iconst_0        
	//   64  127:iload_2         
	//   65  128:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   66  131:aastore         
	//   67  132:invokevirtual   #161 <Method String Resources.getQuantityString(int, int, Object[])>
	//   68  135:invokevirtual   #107 <Method void CustomTextView.setText(CharSequence)>
		obj = ((Object) (com.irobot.home.util.j.a(b).a()));
	//   69  138:aload_0         
	//   70  139:getfield        #163 <Field String b>
	//   71  142:invokestatic    #166 <Method a j.a(String)>
	//   72  145:invokevirtual   #171 <Method com.irobot.core.AssetInfo a.a()>
	//   73  148:astore          6
		com.irobot.core.RobotMissionHistoryCompletionStatus robotmissionhistorycompletionstatus = robotmissionhistoryitem.getCompletionStatus();
	//   74  150:aload_1         
	//   75  151:invokevirtual   #175 <Method com.irobot.core.RobotMissionHistoryCompletionStatus RobotMissionHistoryItem.getCompletionStatus()>
	//   76  154:astore          7
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMdd");
	//   77  156:new             #77  <Class SimpleDateFormat>
	//   78  159:dup             
	//   79  160:ldc1            #177 <String "yyyyMMdd">
	//   80  162:invokespecial   #82  <Method void SimpleDateFormat(String)>
	//   81  165:astore          8
		String s = simpledateformat.format(new Date());
	//   82  167:aload           8
	//   83  169:new             #96  <Class Date>
	//   84  172:dup             
	//   85  173:invokespecial   #178 <Method void Date()>
	//   86  176:invokevirtual   #86  <Method String SimpleDateFormat.format(Date)>
	//   87  179:astore          9
		boolean flag = simpledateformat.format(new Date((long)robotmissionhistoryitem.getTimestamp() * 1000L)).equals(((Object) (s)));
	//   88  181:aload           8
	//   89  183:new             #96  <Class Date>
	//   90  186:dup             
	//   91  187:aload_1         
	//   92  188:invokevirtual   #181 <Method int RobotMissionHistoryItem.getTimestamp()>
	//   93  191:i2l             
	//   94  192:ldc2w           #182 <Long 1000L>
	//   95  195:lmul            
	//   96  196:invokespecial   #186 <Method void Date(long)>
	//   97  199:invokevirtual   #86  <Method String SimpleDateFormat.format(Date)>
	//   98  202:aload           9
	//   99  204:invokevirtual   #192 <Method boolean String.equals(Object)>
	//  100  207:istore          5
		i1 = robotmissionhistoryitem.getSquareFeetCovered();
	//  101  209:aload_1         
	//  102  210:invokevirtual   #195 <Method int RobotMissionHistoryItem.getSquareFeetCovered()>
	//  103  213:istore_2        
		j1 = ((int) (robotmissionhistoryitem.getNumberOfDirtDetects()));
	//  104  214:aload_1         
	//  105  215:invokevirtual   #144 <Method short RobotMissionHistoryItem.getNumberOfDirtDetects()>
	//  106  218:istore_3        
		AnalyticsSubsystem.getInstance().trackHistoryDetailView(((com.irobot.core.AssetInfo) (obj)), robotmissionhistorycompletionstatus, flag, i1, j1);
	//  107  219:invokestatic    #201 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//  108  222:aload           6
	//  109  224:aload           7
	//  110  226:iload           5
	//  111  228:iload_2         
	//  112  229:iload_3         
	//  113  230:invokevirtual   #205 <Method void AnalyticsSubsystem.trackHistoryDetailView(com.irobot.core.AssetInfo, com.irobot.core.RobotMissionHistoryCompletionStatus, boolean, int, int)>
	//  114  233:return          
	}

	static void a(am am1, RobotMissionHistoryItem robotmissionhistoryitem)
	{
		am1.a(robotmissionhistoryitem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #208 <Method void a(RobotMissionHistoryItem)>
	//    3    5:return          
	}

	static String c()
	{
		return o;
	//    0    0:getstatic       #211 <Field String o>
	//    1    3:areturn         
	}

	void a()
	{
		Robot robot = com.irobot.home.util.j.o(b);
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field String b>
	//    2    4:invokestatic    #214 <Method Robot j.o(String)>
	//    3    7:astore_1        
		if(getActivity() instanceof BaseFragmentActivity)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #61  <Method android.support.v4.app.FragmentActivity getActivity()>
	//*   6   12:instanceof      #216 <Class BaseFragmentActivity>
	//*   7   15:ifeq            30
			((BaseFragmentActivity)getActivity()).b(0x7f0f0359);
	//    8   18:aload_0         
	//    9   19:invokevirtual   #61  <Method android.support.v4.app.FragmentActivity getActivity()>
	//   10   22:checkcast       #216 <Class BaseFragmentActivity>
	//   11   25:ldc1            #217 <Int 0x7f0f0359>
	//   12   27:invokevirtual   #220 <Method void BaseFragmentActivity.b(int)>
		j = a(d, 0x7f0f0292);
	//   13   30:aload_0         
	//   14   31:aload_0         
	//   15   32:aload_0         
	//   16   33:getfield        #222 <Field RelativeLayout d>
	//   17   36:ldc1            #223 <Int 0x7f0f0292>
	//   18   38:invokespecial   #225 <Method CustomTextView a(RelativeLayout, int)>
	//   19   41:putfield        #130 <Field CustomTextView j>
		k = a(e, 0x7f0f086e);
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:getfield        #227 <Field RelativeLayout e>
	//   24   50:ldc1            #228 <Int 0x7f0f086e>
	//   25   52:invokespecial   #225 <Method CustomTextView a(RelativeLayout, int)>
	//   26   55:putfield        #94  <Field CustomTextView k>
		l = a(f, 0x7f0f0884);
	//   27   58:aload_0         
	//   28   59:aload_0         
	//   29   60:aload_0         
	//   30   61:getfield        #230 <Field RelativeLayout f>
	//   31   64:ldc1            #231 <Int 0x7f0f0884>
	//   32   66:invokespecial   #225 <Method CustomTextView a(RelativeLayout, int)>
	//   33   69:putfield        #109 <Field CustomTextView l>
		m = a(i, 0x7f0f026d);
	//   34   72:aload_0         
	//   35   73:aload_0         
	//   36   74:aload_0         
	//   37   75:getfield        #233 <Field RelativeLayout i>
	//   38   78:ldc1            #234 <Int 0x7f0f026d>
	//   39   80:invokespecial   #225 <Method CustomTextView a(RelativeLayout, int)>
	//   40   83:putfield        #146 <Field CustomTextView m>
		n = Assembler.getInstance().getHistoryUIService(robot.s());
	//   41   86:aload_0         
	//   42   87:invokestatic    #239 <Method Assembler Assembler.getInstance()>
	//   43   90:aload_1         
	//   44   91:invokevirtual   #245 <Method com.irobot.core.AssetId Robot.s()>
	//   45   94:invokevirtual   #249 <Method HistoryUIService Assembler.getHistoryUIService(com.irobot.core.AssetId)>
	//   46   97:putfield        #251 <Field HistoryUIService n>
	//   47  100:return          
	}

	void b()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #253 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #254 <Method void ArrayList()>
	//    3    7:astore_1        
		ArrayList arraylist1 = new ArrayList();
	//    4    8:new             #253 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #254 <Method void ArrayList()>
	//    7   15:astore_2        
		arraylist.add(((Object) (Integer.valueOf(0x7f0f0292))));
	//    8   16:aload_1         
	//    9   17:ldc1            #223 <Int 0x7f0f0292>
	//   10   19:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   11   22:invokevirtual   #257 <Method boolean ArrayList.add(Object)>
	//   12   25:pop             
		arraylist1.add(((Object) (Integer.valueOf(0x7f0f0416))));
	//   13   26:aload_2         
	//   14   27:ldc2            #258 <Int 0x7f0f0416>
	//   15   30:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   16   33:invokevirtual   #257 <Method boolean ArrayList.add(Object)>
	//   17   36:pop             
		arraylist.add(((Object) (Integer.valueOf(0x7f0f086e))));
	//   18   37:aload_1         
	//   19   38:ldc1            #228 <Int 0x7f0f086e>
	//   20   40:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   21   43:invokevirtual   #257 <Method boolean ArrayList.add(Object)>
	//   22   46:pop             
		arraylist1.add(((Object) (Integer.valueOf(0x7f0f0417))));
	//   23   47:aload_2         
	//   24   48:ldc2            #259 <Int 0x7f0f0417>
	//   25   51:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   26   54:invokevirtual   #257 <Method boolean ArrayList.add(Object)>
	//   27   57:pop             
		arraylist.add(((Object) (Integer.valueOf(0x7f0f0884))));
	//   28   58:aload_1         
	//   29   59:ldc1            #231 <Int 0x7f0f0884>
	//   30   61:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   31   64:invokevirtual   #257 <Method boolean ArrayList.add(Object)>
	//   32   67:pop             
		arraylist1.add(((Object) (Integer.valueOf(0x7f0f0418))));
	//   33   68:aload_2         
	//   34   69:ldc2            #260 <Int 0x7f0f0418>
	//   35   72:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   36   75:invokevirtual   #257 <Method boolean ArrayList.add(Object)>
	//   37   78:pop             
		arraylist.add(((Object) (Integer.valueOf(0x7f0f026d))));
	//   38   79:aload_1         
	//   39   80:ldc1            #234 <Int 0x7f0f026d>
	//   40   82:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   41   85:invokevirtual   #257 <Method boolean ArrayList.add(Object)>
	//   42   88:pop             
		arraylist1.add(((Object) (Integer.valueOf(0x7f0f0415))));
	//   43   89:aload_2         
	//   44   90:ldc2            #261 <Int 0x7f0f0415>
	//   45   93:invokestatic    #155 <Method Integer Integer.valueOf(int)>
	//   46   96:invokevirtual   #257 <Method boolean ArrayList.add(Object)>
	//   47   99:pop             
		HistoryInfoActivity_.a(((android.support.v4.app.Fragment) (this))).a(false).a(arraylist).b(arraylist1).a();
	//   48  100:aload_0         
	//   49  101:invokestatic    #266 <Method com.irobot.home.HistoryInfoActivity_$a HistoryInfoActivity_.a(android.support.v4.app.Fragment)>
	//   50  104:iconst_0        
	//   51  105:invokevirtual   #271 <Method com.irobot.home.HistoryInfoActivity_$a com.irobot.home.HistoryInfoActivity_$a.a(boolean)>
	//   52  108:aload_1         
	//   53  109:invokevirtual   #274 <Method com.irobot.home.HistoryInfoActivity_$a com.irobot.home.HistoryInfoActivity_$a.a(ArrayList)>
	//   54  112:aload_2         
	//   55  113:invokevirtual   #276 <Method com.irobot.home.HistoryInfoActivity_$a com.irobot.home.HistoryInfoActivity_$a.b(ArrayList)>
	//   56  116:invokevirtual   #279 <Method org.androidannotations.api.a.e com.irobot.home.HistoryInfoActivity_$a.a()>
	//   57  119:pop             
	//   58  120:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #282 <Method void j.onStart()>
		n.registerUISubscriber(p);
	//    2    4:aload_0         
	//    3    5:getfield        #251 <Field HistoryUIService n>
	//    4    8:aload_0         
	//    5    9:getfield        #42  <Field HistoryUIServiceDataCallback p>
	//    6   12:invokevirtual   #288 <Method boolean HistoryUIService.registerUISubscriber(HistoryUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #291 <Method void j.onStop()>
		n.unregisterSubscriber(p);
	//    2    4:aload_0         
	//    3    5:getfield        #251 <Field HistoryUIService n>
	//    4    8:aload_0         
	//    5    9:getfield        #42  <Field HistoryUIServiceDataCallback p>
	//    6   12:invokevirtual   #294 <Method boolean HistoryUIService.unregisterSubscriber(HistoryUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static final String o = "am";
	int a;
	String b;
	TextView c;
	RelativeLayout d;
	RelativeLayout e;
	RelativeLayout f;
	RelativeLayout i;
	private CustomTextView j;
	private CustomTextView k;
	private CustomTextView l;
	private CustomTextView m;
	private HistoryUIService n;
	private HistoryUIServiceDataCallback p;

	static 
	{
	//    0    0:return          
	}
}
