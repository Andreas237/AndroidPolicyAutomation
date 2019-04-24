// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.a;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetInfo;
import com.irobot.core.DayOfTheWeek;
import com.irobot.core.ScheduleLocationType;
import com.irobot.core.ScheduleMapData;
import com.irobot.core.ScheduleMultipleMappingData;
import com.irobot.core.ScheduleMultipleMappingType;
import com.irobot.core.ScheduleUIService;
import com.irobot.core.ScheduleUIServiceCommand;
import com.irobot.core.ScheduleUIServiceData;
import com.irobot.core.ScheduleUIServiceDataCallback;
import com.irobot.core.ScheduleViewState;
import com.irobot.core.ViewId;
import com.irobot.home.fragments.aw;
import com.irobot.home.fragments.ax;
import com.irobot.home.fragments.ay;
import com.irobot.home.fragments.az;
import com.irobot.home.fragments.ba;
import com.irobot.home.fragments.bb;
import com.irobot.home.fragments.r;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseToolbarFragmentActivity

public class PersistentScheduleCreateActivity extends BaseToolbarFragmentActivity
{
	private class a
		implements com.irobot.home.fragments.aw.a, com.irobot.home.fragments.ba.a
	{

		public void a(boolean flag)
		{
			com.irobot.home.PersistentScheduleCreateActivity.a(a, flag);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field PersistentScheduleCreateActivity a>
		//    2    4:iload_1         
		//    3    5:invokestatic    #27  <Method boolean com.irobot.home.PersistentScheduleCreateActivity.a(PersistentScheduleCreateActivity, boolean)>
		//    4    8:pop             
			a.supportInvalidateOptionsMenu();
		//    5    9:aload_0         
		//    6   10:getfield        #16  <Field PersistentScheduleCreateActivity a>
		//    7   13:invokevirtual   #30  <Method void PersistentScheduleCreateActivity.supportInvalidateOptionsMenu()>
		//    8   16:return          
		}

		public void b(boolean flag)
		{
			PersistentScheduleCreateActivity.b(a, flag);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field PersistentScheduleCreateActivity a>
		//    2    4:iload_1         
		//    3    5:invokestatic    #33  <Method boolean PersistentScheduleCreateActivity.b(PersistentScheduleCreateActivity, boolean)>
		//    4    8:pop             
			a.supportInvalidateOptionsMenu();
		//    5    9:aload_0         
		//    6   10:getfield        #16  <Field PersistentScheduleCreateActivity a>
		//    7   13:invokevirtual   #30  <Method void PersistentScheduleCreateActivity.supportInvalidateOptionsMenu()>
		//    8   16:return          
		}

		final PersistentScheduleCreateActivity a;

		private a()
		{
			a = PersistentScheduleCreateActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field PersistentScheduleCreateActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}

	}


	public PersistentScheduleCreateActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void BaseToolbarFragmentActivity()>
	//    2    4:aload_0         
	//    3    5:ldc1            #66  <String "PScheduleCreateActivity">
	//    4    7:putfield        #68  <Field String l>
		a = 0x7f08007f;
	//    5   10:aload_0         
	//    6   11:ldc1            #69  <Int 0x7f08007f>
	//    7   13:putfield        #71  <Field int a>
		b = 0x7f06007a;
	//    8   16:aload_0         
	//    9   17:ldc1            #72  <Int 0x7f06007a>
	//   10   19:putfield        #74  <Field int b>
		f = 0x7f06005d;
	//   11   22:aload_0         
	//   12   23:ldc1            #75  <Int 0x7f06005d>
	//   13   25:putfield        #77  <Field int f>
		g = 0x7f06005a;
	//   14   28:aload_0         
	//   15   29:ldc1            #78  <Int 0x7f06005a>
	//   16   31:putfield        #80  <Field int g>
		i = -1;
	//   17   34:aload_0         
	//   18   35:iconst_m1       
	//   19   36:putfield        #82  <Field int i>
		y = new a();
	//   20   39:aload_0         
	//   21   40:new             #12  <Class PersistentScheduleCreateActivity$a>
	//   22   43:dup             
	//   23   44:aload_0         
	//   24   45:aconst_null     
	//   25   46:invokespecial   #85  <Method void PersistentScheduleCreateActivity$a(PersistentScheduleCreateActivity, PersistentScheduleCreateActivity$1)>
	//   26   49:putfield        #87  <Field PersistentScheduleCreateActivity$a y>
		C = false;
	//   27   52:aload_0         
	//   28   53:iconst_0        
	//   29   54:putfield        #89  <Field boolean C>
		D = false;
	//   30   57:aload_0         
	//   31   58:iconst_0        
	//   32   59:putfield        #91  <Field boolean D>
		E = false;
	//   33   62:aload_0         
	//   34   63:iconst_0        
	//   35   64:putfield        #93  <Field boolean E>
		F = false;
	//   36   67:aload_0         
	//   37   68:iconst_0        
	//   38   69:putfield        #95  <Field boolean F>
		G = false;
	//   39   72:aload_0         
	//   40   73:iconst_0        
	//   41   74:putfield        #97  <Field boolean G>
		H = true;
	//   42   77:aload_0         
	//   43   78:iconst_1        
	//   44   79:putfield        #99  <Field boolean H>
		J = ((ScheduleUIServiceDataCallback) (new ScheduleUIServiceDataCallback() {

			public void onScheduleUIServiceDataChanged(ScheduleUIServiceData scheduleuiservicedata)
			{
				if(!a.isFinishing())
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field PersistentScheduleCreateActivity a>
			//*   2    4:invokevirtual   #22  <Method boolean PersistentScheduleCreateActivity.isFinishing()>
			//*   3    7:ifne            208
				{
					if(a.isDestroyed())
			//*   4   10:aload_0         
			//*   5   11:getfield        #12  <Field PersistentScheduleCreateActivity a>
			//*   6   14:invokevirtual   #25  <Method boolean PersistentScheduleCreateActivity.isDestroyed()>
			//*   7   17:ifeq            21
						return;
			//    8   20:return          
					Iterator iterator = scheduleuiservicedata.getViewStates().iterator();
			//    9   21:aload_1         
			//   10   22:invokevirtual   #31  <Method ArrayList ScheduleUIServiceData.getViewStates()>
			//   11   25:invokevirtual   #37  <Method Iterator ArrayList.iterator()>
			//   12   28:astore_2        
					do
					{
						if(!iterator.hasNext())
							break;
			//   13   29:aload_2         
			//   14   30:invokeinterface #42  <Method boolean Iterator.hasNext()>
			//   15   35:ifeq            208
						ScheduleViewState scheduleviewstate = (ScheduleViewState)iterator.next();
			//   16   38:aload_2         
			//   17   39:invokeinterface #46  <Method Object Iterator.next()>
			//   18   44:checkcast       #48  <Class ScheduleViewState>
			//   19   47:astore_3        
						com.irobot.home.util.o.a("PScheduleCreateActivity", scheduleviewstate.name());
			//   20   48:ldc1            #50  <String "PScheduleCreateActivity">
			//   21   50:aload_3         
			//   22   51:invokevirtual   #54  <Method String ScheduleViewState.name()>
			//   23   54:invokestatic    #59  <Method void o.a(String, String)>
						static class _cls3
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
									a[ScheduleViewState.CreateMappingScheduleDismissAllDialogs.ordinal()] = 1;
							//    4    9:getstatic       #20  <Field int[] a>
							//    5   12:getstatic       #24  <Field ScheduleViewState ScheduleViewState.CreateMappingScheduleDismissAllDialogs>
							//    6   15:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
							//    7   18:iconst_1        
							//    8   19:iastore         
								}
							//*   9   20:getstatic       #20  <Field int[] a>
							//*  10   23:getstatic       #31  <Field ScheduleViewState ScheduleViewState.CreateMappingScheduleShowCannotConnect>
							//*  11   26:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
							//*  12   29:iconst_2        
							//*  13   30:iastore         
							//*  14   31:getstatic       #20  <Field int[] a>
							//*  15   34:getstatic       #34  <Field ScheduleViewState ScheduleViewState.CreateMappingSchedulePopulateSchedulesList>
							//*  16   37:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
							//*  17   40:iconst_3        
							//*  18   41:iastore         
							//*  19   42:getstatic       #20  <Field int[] a>
							//*  20   45:getstatic       #37  <Field ScheduleViewState ScheduleViewState.CreateMappingScheduleShowConnectionErrorDialog>
							//*  21   48:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
							//*  22   51:iconst_4        
							//*  23   52:iastore         
							//*  24   53:getstatic       #20  <Field int[] a>
							//*  25   56:getstatic       #40  <Field ScheduleViewState ScheduleViewState.CreateMappingScheduleCloseView>
							//*  26   59:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
							//*  27   62:iconst_5        
							//*  28   63:iastore         
							//*  29   64:getstatic       #20  <Field int[] a>
							//*  30   67:getstatic       #43  <Field ScheduleViewState ScheduleViewState.CreateMappingScheduleShowTimeoutError>
							//*  31   70:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
							//*  32   73:bipush          6
							//*  33   75:iastore         
							//*  34   76:getstatic       #20  <Field int[] a>
							//*  35   79:getstatic       #46  <Field ScheduleViewState ScheduleViewState.CreateMappingScheduleDismissProgressDialog>
							//*  36   82:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
							//*  37   85:bipush          7
							//*  38   87:iastore         
							//*  39   88:getstatic       #20  <Field int[] a>
							//*  40   91:getstatic       #49  <Field ScheduleViewState ScheduleViewState.CreateMappingScheduleShowProgressDialog>
							//*  41   94:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
							//*  42   97:bipush          8
							//*  43   99:iastore         
							//*  44  100:getstatic       #20  <Field int[] a>
							//*  45  103:getstatic       #52  <Field ScheduleViewState ScheduleViewState.CreateMappingScheduleShowConflictDialog>
							//*  46  106:invokevirtual   #28  <Method int ScheduleViewState.ordinal()>
							//*  47  109:bipush          9
							//*  48  111:iastore         
							//*  49  112:return          
								catch(NoSuchFieldError nosuchfielderror) { }
							//   50  113:astore_0        
								try
								{
									a[ScheduleViewState.CreateMappingScheduleShowCannotConnect.ordinal()] = 2;
								}
							//*  51  114:goto            20
								catch(NoSuchFieldError nosuchfielderror1) { }
							//   52  117:astore_0        
								try
								{
									a[ScheduleViewState.CreateMappingSchedulePopulateSchedulesList.ordinal()] = 3;
								}
							//*  53  118:goto            31
								catch(NoSuchFieldError nosuchfielderror2) { }
							//   54  121:astore_0        
								try
								{
									a[ScheduleViewState.CreateMappingScheduleShowConnectionErrorDialog.ordinal()] = 4;
								}
							//*  55  122:goto            42
								catch(NoSuchFieldError nosuchfielderror3) { }
							//   56  125:astore_0        
								try
								{
									a[ScheduleViewState.CreateMappingScheduleCloseView.ordinal()] = 5;
								}
							//*  57  126:goto            53
								catch(NoSuchFieldError nosuchfielderror4) { }
							//   58  129:astore_0        
								try
								{
									a[ScheduleViewState.CreateMappingScheduleShowTimeoutError.ordinal()] = 6;
								}
							//*  59  130:goto            64
								catch(NoSuchFieldError nosuchfielderror5) { }
							//   60  133:astore_0        
								try
								{
									a[ScheduleViewState.CreateMappingScheduleDismissProgressDialog.ordinal()] = 7;
								}
							//*  61  134:goto            76
								catch(NoSuchFieldError nosuchfielderror6) { }
							//   62  137:astore_0        
								try
								{
									a[ScheduleViewState.CreateMappingScheduleShowProgressDialog.ordinal()] = 8;
								}
							//*  63  138:goto            88
								catch(NoSuchFieldError nosuchfielderror7) { }
							//   64  141:astore_0        
								try
								{
									a[ScheduleViewState.CreateMappingScheduleShowConflictDialog.ordinal()] = 9;
								}
							//*  65  142:goto            100
								catch(NoSuchFieldError nosuchfielderror8) { }
							//   66  145:astore_0        
							//*  67  146:return          
							}
						}

						switch(com.irobot.home._cls3.a[scheduleviewstate.ordinal()])
			//*  24   57:getstatic       #64  <Field int[] com.irobot.home.PersistentScheduleCreateActivity$3.a>
			//*  25   60:aload_3         
			//*  26   61:invokevirtual   #68  <Method int ScheduleViewState.ordinal()>
			//*  27   64:iaload          
						{
			//*  28   65:tableswitch     1 9: default 116
			//			               1 198
			//			               2 188
			//			               3 177
			//			               4 29
			//			               5 167
			//			               6 153
			//			               7 143
			//			               8 133
			//			               9 119
			//*  29  116:goto            29
						case 9: // '\t'
							a.a(scheduleuiservicedata.getScheduleMultipleMappingData());
			//   30  119:aload_0         
			//   31  120:getfield        #12  <Field PersistentScheduleCreateActivity a>
			//   32  123:aload_1         
			//   33  124:invokevirtual   #72  <Method ScheduleMultipleMappingData ScheduleUIServiceData.getScheduleMultipleMappingData()>
			//   34  127:invokevirtual   #75  <Method void com.irobot.home.PersistentScheduleCreateActivity.a(ScheduleMultipleMappingData)>
							break;

			//*  35  130:goto            29
						case 8: // '\b'
							a.n();
			//   36  133:aload_0         
			//   37  134:getfield        #12  <Field PersistentScheduleCreateActivity a>
			//   38  137:invokevirtual   #78  <Method void PersistentScheduleCreateActivity.n()>
							break;

			//*  39  140:goto            29
						case 7: // '\007'
							a.m();
			//   40  143:aload_0         
			//   41  144:getfield        #12  <Field PersistentScheduleCreateActivity a>
			//   42  147:invokevirtual   #81  <Method void PersistentScheduleCreateActivity.m()>
							break;

			//*  43  150:goto            29
						case 6: // '\006'
							a.a(scheduleuiservicedata.getTimeoutTag());
			//   44  153:aload_0         
			//   45  154:getfield        #12  <Field PersistentScheduleCreateActivity a>
			//   46  157:aload_1         
			//   47  158:invokevirtual   #84  <Method String ScheduleUIServiceData.getTimeoutTag()>
			//   48  161:invokevirtual   #87  <Method void com.irobot.home.PersistentScheduleCreateActivity.a(String)>
							break;

			//*  49  164:goto            29
						case 5: // '\005'
							a.k();
			//   50  167:aload_0         
			//   51  168:getfield        #12  <Field PersistentScheduleCreateActivity a>
			//   52  171:invokevirtual   #90  <Method void PersistentScheduleCreateActivity.k()>
							break;

			//*  53  174:goto            29
						case 3: // '\003'
							com.irobot.home.PersistentScheduleCreateActivity.a(a, scheduleuiservicedata);
			//   54  177:aload_0         
			//   55  178:getfield        #12  <Field PersistentScheduleCreateActivity a>
			//   56  181:aload_1         
			//   57  182:invokestatic    #93  <Method void com.irobot.home.PersistentScheduleCreateActivity.a(PersistentScheduleCreateActivity, ScheduleUIServiceData)>
							break;

			//*  58  185:goto            29
						case 2: // '\002'
							a.l();
			//   59  188:aload_0         
			//   60  189:getfield        #12  <Field PersistentScheduleCreateActivity a>
			//   61  192:invokevirtual   #96  <Method void PersistentScheduleCreateActivity.l()>
							break;

			//*  62  195:goto            29
						case 1: // '\001'
							com.irobot.home.PersistentScheduleCreateActivity.a(a);
			//   63  198:aload_0         
			//   64  199:getfield        #12  <Field PersistentScheduleCreateActivity a>
			//   65  202:invokestatic    #98  <Method void com.irobot.home.PersistentScheduleCreateActivity.a(PersistentScheduleCreateActivity)>
							break;
						}
					} while(true);
			//   66  205:goto            29
				}
			//   67  208:return          
			}

			final PersistentScheduleCreateActivity a;

			
			{
				a = PersistentScheduleCreateActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field PersistentScheduleCreateActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void ScheduleUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   45   82:aload_0         
	//   46   83:new             #6   <Class PersistentScheduleCreateActivity$1>
	//   47   86:dup             
	//   48   87:aload_0         
	//   49   88:invokespecial   #102 <Method void PersistentScheduleCreateActivity$1(PersistentScheduleCreateActivity)>
	//   50   91:putfield        #104 <Field ScheduleUIServiceDataCallback J>
	//   51   94:return          
	}

	private void a(ScheduleUIServiceData scheduleuiservicedata)
	{
		C = scheduleuiservicedata.isScheduleMapsCapable();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #112 <Method boolean ScheduleUIServiceData.isScheduleMapsCapable()>
	//    3    5:putfield        #89  <Field boolean C>
		D = scheduleuiservicedata.doesScheduleSupportMissionParameters();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #115 <Method boolean ScheduleUIServiceData.doesScheduleSupportMissionParameters()>
	//    7   13:putfield        #91  <Field boolean D>
		F = scheduleuiservicedata.isScheduleWithMapsEnabled();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #118 <Method boolean ScheduleUIServiceData.isScheduleWithMapsEnabled()>
	//   11   21:putfield        #95  <Field boolean F>
		E = scheduleuiservicedata.doesScheduleSupportMissionPresets();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #121 <Method boolean ScheduleUIServiceData.doesScheduleSupportMissionPresets()>
	//   15   29:putfield        #93  <Field boolean E>
		if(I)
	//*  16   32:aload_0         
	//*  17   33:getfield        #123 <Field boolean I>
	//*  18   36:ifeq            44
		{
			q();
	//   19   39:aload_0         
	//   20   40:invokespecial   #125 <Method void q()>
			return;
	//   21   43:return          
		}
		scheduleuiservicedata = ((ScheduleUIServiceData) ((ScheduleMultipleMappingData)scheduleuiservicedata.getMappingScheduleList().get(i)));
	//   22   44:aload_1         
	//   23   45:invokevirtual   #129 <Method ArrayList ScheduleUIServiceData.getMappingScheduleList()>
	//   24   48:aload_0         
	//   25   49:getfield        #82  <Field int i>
	//   26   52:invokevirtual   #135 <Method Object ArrayList.get(int)>
	//   27   55:checkcast       #137 <Class ScheduleMultipleMappingData>
	//   28   58:astore_1        
		if(!((ScheduleMultipleMappingData) (scheduleuiservicedata)).equals(((Object) (u))))
	//*  29   59:aload_1         
	//*  30   60:aload_0         
	//*  31   61:getfield        #139 <Field ScheduleMultipleMappingData u>
	//*  32   64:invokevirtual   #143 <Method boolean ScheduleMultipleMappingData.equals(Object)>
	//*  33   67:ifne            171
		{
			if(u == null)
	//*  34   70:aload_0         
	//*  35   71:getfield        #139 <Field ScheduleMultipleMappingData u>
	//*  36   74:ifnonnull       117
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   37   77:new             #145 <Class StringBuilder>
	//   38   80:dup             
	//   39   81:invokespecial   #146 <Method void StringBuilder()>
	//   40   84:astore_2        
				stringbuilder.append("Operating on schedule data: ");
	//   41   85:aload_2         
	//   42   86:ldc1            #148 <String "Operating on schedule data: ">
	//   43   88:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   44   91:pop             
				stringbuilder.append(((Object) (scheduleuiservicedata)));
	//   45   92:aload_2         
	//   46   93:aload_1         
	//   47   94:invokevirtual   #155 <Method StringBuilder StringBuilder.append(Object)>
	//   48   97:pop             
				com.irobot.home.util.o.b("PScheduleCreateActivity", stringbuilder.toString());
	//   49   98:ldc1            #66  <String "PScheduleCreateActivity">
	//   50  100:aload_2         
	//   51  101:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   52  104:invokestatic    #164 <Method void o.b(String, String)>
				b(((ScheduleMultipleMappingData) (scheduleuiservicedata)));
	//   53  107:aload_0         
	//   54  108:aload_1         
	//   55  109:invokespecial   #167 <Method void b(ScheduleMultipleMappingData)>
				q();
	//   56  112:aload_0         
	//   57  113:invokespecial   #125 <Method void q()>
				return;
	//   58  116:return          
			}
			StringBuilder stringbuilder1 = new StringBuilder();
	//   59  117:new             #145 <Class StringBuilder>
	//   60  120:dup             
	//   61  121:invokespecial   #146 <Method void StringBuilder()>
	//   62  124:astore_2        
			stringbuilder1.append("Did the list change? Received: ");
	//   63  125:aload_2         
	//   64  126:ldc1            #169 <String "Did the list change? Received: ">
	//   65  128:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   66  131:pop             
			stringbuilder1.append(((Object) (scheduleuiservicedata)));
	//   67  132:aload_2         
	//   68  133:aload_1         
	//   69  134:invokevirtual   #155 <Method StringBuilder StringBuilder.append(Object)>
	//   70  137:pop             
			stringbuilder1.append(" but working on: ");
	//   71  138:aload_2         
	//   72  139:ldc1            #171 <String " but working on: ">
	//   73  141:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   74  144:pop             
			stringbuilder1.append(((Object) (u)));
	//   75  145:aload_2         
	//   76  146:aload_0         
	//   77  147:getfield        #139 <Field ScheduleMultipleMappingData u>
	//   78  150:invokevirtual   #155 <Method StringBuilder StringBuilder.append(Object)>
	//   79  153:pop             
			com.irobot.home.util.o.e("PScheduleCreateActivity", stringbuilder1.toString());
	//   80  154:ldc1            #66  <String "PScheduleCreateActivity">
	//   81  156:aload_2         
	//   82  157:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   83  160:invokestatic    #174 <Method void o.e(String, String)>
			j();
	//   84  163:aload_0         
	//   85  164:invokevirtual   #176 <Method void j()>
			finish();
	//   86  167:aload_0         
	//   87  168:invokevirtual   #179 <Method void finish()>
		}
	//   88  171:return          
	}

	static void a(PersistentScheduleCreateActivity persistentschedulecreateactivity)
	{
		persistentschedulecreateactivity.v();
	//    0    0:aload_0         
	//    1    1:invokespecial   #181 <Method void v()>
	//    2    4:return          
	}

	static void a(PersistentScheduleCreateActivity persistentschedulecreateactivity, ScheduleUIServiceData scheduleuiservicedata)
	{
		persistentschedulecreateactivity.a(scheduleuiservicedata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #184 <Method void a(ScheduleUIServiceData)>
	//    3    5:return          
	}

	static boolean a(PersistentScheduleCreateActivity persistentschedulecreateactivity, boolean flag)
	{
		persistentschedulecreateactivity.G = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #97  <Field boolean G>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static ScheduleUIService b(PersistentScheduleCreateActivity persistentschedulecreateactivity)
	{
		return persistentschedulecreateactivity.t;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field ScheduleUIService t>
	//    2    4:areturn         
	}

	private void b(ScheduleMultipleMappingData schedulemultiplemappingdata)
	{
		u = schedulemultiplemappingdata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #139 <Field ScheduleMultipleMappingData u>
		ArrayList arraylist = new ArrayList(((java.util.Collection) (schedulemultiplemappingdata.getDays())));
	//    3    5:new             #131 <Class ArrayList>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokevirtual   #191 <Method ArrayList ScheduleMultipleMappingData.getDays()>
	//    7   13:invokespecial   #194 <Method void ArrayList(java.util.Collection)>
	//    8   16:astore_2        
		String s1 = new String(schedulemultiplemappingdata.getMapId());
	//    9   17:new             #196 <Class String>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokevirtual   #199 <Method String ScheduleMultipleMappingData.getMapId()>
	//   13   25:invokespecial   #202 <Method void String(String)>
	//   14   28:astore_3        
		String s2 = new String(schedulemultiplemappingdata.getMapVersion());
	//   15   29:new             #196 <Class String>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:invokevirtual   #205 <Method String ScheduleMultipleMappingData.getMapVersion()>
	//   19   37:invokespecial   #202 <Method void String(String)>
	//   20   40:astore          4
		String s3 = new String(schedulemultiplemappingdata.getLastUserEditedMapVersion());
	//   21   42:new             #196 <Class String>
	//   22   45:dup             
	//   23   46:aload_1         
	//   24   47:invokevirtual   #208 <Method String ScheduleMultipleMappingData.getLastUserEditedMapVersion()>
	//   25   50:invokespecial   #202 <Method void String(String)>
	//   26   53:astore          5
		ArrayList arraylist1 = new ArrayList(((java.util.Collection) (schedulemultiplemappingdata.getRegionIds())));
	//   27   55:new             #131 <Class ArrayList>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:invokevirtual   #211 <Method ArrayList ScheduleMultipleMappingData.getRegionIds()>
	//   31   63:invokespecial   #194 <Method void ArrayList(java.util.Collection)>
	//   32   66:astore          6
		ArrayList arraylist2 = new ArrayList(((java.util.Collection) (schedulemultiplemappingdata.getRegionNames())));
	//   33   68:new             #131 <Class ArrayList>
	//   34   71:dup             
	//   35   72:aload_1         
	//   36   73:invokevirtual   #214 <Method ArrayList ScheduleMultipleMappingData.getRegionNames()>
	//   37   76:invokespecial   #194 <Method void ArrayList(java.util.Collection)>
	//   38   79:astore          7
		HashMap hashmap = new HashMap(((java.util.Map) (schedulemultiplemappingdata.getMissionParameters())));
	//   39   81:new             #216 <Class HashMap>
	//   40   84:dup             
	//   41   85:aload_1         
	//   42   86:invokevirtual   #220 <Method HashMap ScheduleMultipleMappingData.getMissionParameters()>
	//   43   89:invokespecial   #223 <Method void HashMap(java.util.Map)>
	//   44   92:astore          8
		v = new ScheduleMultipleMappingData(schedulemultiplemappingdata.getType(), schedulemultiplemappingdata.getEnabled(), arraylist, schedulemultiplemappingdata.getHour(), schedulemultiplemappingdata.getMinute(), schedulemultiplemappingdata.getLocationType(), s1, s2, s3, arraylist1, arraylist2, schedulemultiplemappingdata.getIsOrdered(), hashmap);
	//   45   94:aload_0         
	//   46   95:new             #137 <Class ScheduleMultipleMappingData>
	//   47   98:dup             
	//   48   99:aload_1         
	//   49  100:invokevirtual   #227 <Method ScheduleMultipleMappingType ScheduleMultipleMappingData.getType()>
	//   50  103:aload_1         
	//   51  104:invokevirtual   #230 <Method boolean ScheduleMultipleMappingData.getEnabled()>
	//   52  107:aload_2         
	//   53  108:aload_1         
	//   54  109:invokevirtual   #234 <Method int ScheduleMultipleMappingData.getHour()>
	//   55  112:aload_1         
	//   56  113:invokevirtual   #237 <Method int ScheduleMultipleMappingData.getMinute()>
	//   57  116:aload_1         
	//   58  117:invokevirtual   #241 <Method ScheduleLocationType ScheduleMultipleMappingData.getLocationType()>
	//   59  120:aload_3         
	//   60  121:aload           4
	//   61  123:aload           5
	//   62  125:aload           6
	//   63  127:aload           7
	//   64  129:aload_1         
	//   65  130:invokevirtual   #244 <Method boolean ScheduleMultipleMappingData.getIsOrdered()>
	//   66  133:aload           8
	//   67  135:invokespecial   #247 <Method void ScheduleMultipleMappingData(ScheduleMultipleMappingType, boolean, ArrayList, int, int, ScheduleLocationType, String, String, String, ArrayList, ArrayList, boolean, HashMap)>
	//   68  138:putfield        #249 <Field ScheduleMultipleMappingData v>
	//   69  141:return          
	}

	static boolean b(PersistentScheduleCreateActivity persistentschedulecreateactivity, boolean flag)
	{
		persistentschedulecreateactivity.H = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #99  <Field boolean H>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void o()
	{
		android.support.v7.app.a.a a1;
		a1 = new android.support.v7.app.a.a(((android.content.Context) (this)));
	//    0    0:new             #251 <Class android.support.v7.app.a$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #254 <Method void android.support.v7.app.a$a(android.content.Context)>
	//    4    8:astore_3        
		a1.a(((CharSequence) (getResources().getString(0x7f0f040a))));
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #258 <Method Resources getResources()>
	//    8   14:ldc2            #259 <Int 0x7f0f040a>
	//    9   17:invokevirtual   #265 <Method String Resources.getString(int)>
	//   10   20:invokevirtual   #268 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(CharSequence)>
	//   11   23:pop             
		a1.a(((CharSequence) (getResources().getString(0x7f0f05bb))), ((android.content.DialogInterface.OnClickListener) (null)));
	//   12   24:aload_3         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #258 <Method Resources getResources()>
	//   15   29:ldc2            #269 <Int 0x7f0f05bb>
	//   16   32:invokevirtual   #265 <Method String Resources.getString(int)>
	//   17   35:aconst_null     
	//   18   36:invokevirtual   #272 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   19   39:pop             
		if(G) goto _L2; else goto _L1
	//   20   40:aload_0         
	//   21   41:getfield        #97  <Field boolean G>
	//   22   44:ifne            69
_L1:
		int i1;
		Resources resources;
		resources = getResources();
	//   23   47:aload_0         
	//   24   48:invokevirtual   #258 <Method Resources getResources()>
	//   25   51:astore_2        
		i1 = 0x7f0f07ee;
	//   26   52:ldc2            #273 <Int 0x7f0f07ee>
	//   27   55:istore_1        
_L4:
		a1.b(((CharSequence) (resources.getString(i1))));
	//   28   56:aload_3         
	//   29   57:aload_2         
	//   30   58:iload_1         
	//   31   59:invokevirtual   #265 <Method String Resources.getString(int)>
	//   32   62:invokevirtual   #275 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(CharSequence)>
	//   33   65:pop             
		break; /* Loop/switch isn't completed */
	//   34   66:goto            88
_L2:
		if(H)
			break; /* Loop/switch isn't completed */
	//   35   69:aload_0         
	//   36   70:getfield        #99  <Field boolean H>
	//   37   73:ifne            88
		resources = getResources();
	//   38   76:aload_0         
	//   39   77:invokevirtual   #258 <Method Resources getResources()>
	//   40   80:astore_2        
		i1 = 0x7f0f07ef;
	//   41   81:ldc2            #276 <Int 0x7f0f07ef>
	//   42   84:istore_1        
		if(true) goto _L4; else goto _L3
	//   43   85:goto            56
_L3:
		x = a1.b();
	//   44   88:aload_0         
	//   45   89:aload_3         
	//   46   90:invokevirtual   #279 <Method a android.support.v7.app.a$a.b()>
	//   47   93:putfield        #281 <Field a x>
		x.show();
	//   48   96:aload_0         
	//   49   97:getfield        #281 <Field a x>
	//   50  100:invokevirtual   #286 <Method void a.show()>
		return;
	//   51  103:return          
	}

	private void p()
	{
		z = android.support.v4.content.a.getColor(((android.content.Context) (this)), b);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #74  <Field int b>
	//    4    6:invokestatic    #292 <Method int android.support.v4.content.a.getColor(android.content.Context, int)>
	//    5    9:putfield        #294 <Field int z>
		A = android.support.v4.content.a.getColor(((android.content.Context) (this)), f);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #77  <Field int f>
	//   10   18:invokestatic    #292 <Method int android.support.v4.content.a.getColor(android.content.Context, int)>
	//   11   21:putfield        #296 <Field int A>
		B = android.support.v4.content.a.getColor(((android.content.Context) (this)), g);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #80  <Field int g>
	//   16   30:invokestatic    #292 <Method int android.support.v4.content.a.getColor(android.content.Context, int)>
	//   17   33:putfield        #298 <Field int B>
		supportInvalidateOptionsMenu();
	//   18   36:aload_0         
	//   19   37:invokevirtual   #301 <Method void supportInvalidateOptionsMenu()>
		o = LayoutInflater.from(((android.content.Context) (this))).inflate(0x7f0b00ee, ((android.view.ViewGroup) (null)));
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:invokestatic    #307 <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//   23   45:ldc2            #308 <Int 0x7f0b00ee>
	//   24   48:aconst_null     
	//   25   49:invokevirtual   #312 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   26   52:putfield        #314 <Field View o>
		p = new Toast(((android.content.Context) (this)));
	//   27   55:aload_0         
	//   28   56:new             #316 <Class Toast>
	//   29   59:dup             
	//   30   60:aload_0         
	//   31   61:invokespecial   #317 <Method void Toast(android.content.Context)>
	//   32   64:putfield        #319 <Field Toast p>
		p.setView(o);
	//   33   67:aload_0         
	//   34   68:getfield        #319 <Field Toast p>
	//   35   71:aload_0         
	//   36   72:getfield        #314 <Field View o>
	//   37   75:invokevirtual   #323 <Method void Toast.setView(View)>
		p.setDuration(0);
	//   38   78:aload_0         
	//   39   79:getfield        #319 <Field Toast p>
	//   40   82:iconst_0        
	//   41   83:invokevirtual   #327 <Method void Toast.setDuration(int)>
		p.setGravity(17, 0, 0);
	//   42   86:aload_0         
	//   43   87:getfield        #319 <Field Toast p>
	//   44   90:bipush          17
	//   45   92:iconst_0        
	//   46   93:iconst_0        
	//   47   94:invokevirtual   #331 <Method void Toast.setGravity(int, int, int)>
		View view = LayoutInflater.from(((android.content.Context) (this))).inflate(0x7f0b009f, ((android.view.ViewGroup) (null)));
	//   48   97:aload_0         
	//   49   98:invokestatic    #307 <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//   50  101:ldc2            #332 <Int 0x7f0b009f>
	//   51  104:aconst_null     
	//   52  105:invokevirtual   #312 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   53  108:astore_1        
		((TextView)view.findViewById(0x7f090431)).setText(((CharSequence) (getString(0x7f0f094b, new Object[] {
			w.getName()
		}))));
	//   54  109:aload_1         
	//   55  110:ldc2            #333 <Int 0x7f090431>
	//   56  113:invokevirtual   #339 <Method View View.findViewById(int)>
	//   57  116:checkcast       #341 <Class TextView>
	//   58  119:aload_0         
	//   59  120:ldc2            #342 <Int 0x7f0f094b>
	//   60  123:iconst_1        
	//   61  124:anewarray       Object[]
	//   62  127:dup             
	//   63  128:iconst_0        
	//   64  129:aload_0         
	//   65  130:getfield        #346 <Field AssetInfo w>
	//   66  133:invokevirtual   #351 <Method String AssetInfo.getName()>
	//   67  136:aastore         
	//   68  137:invokevirtual   #354 <Method String getString(int, Object[])>
	//   69  140:invokevirtual   #358 <Method void TextView.setText(CharSequence)>
		m = (new android.support.v7.app.a.a(((android.content.Context) (this)))).b(view).a(false).b();
	//   70  143:aload_0         
	//   71  144:new             #251 <Class android.support.v7.app.a$a>
	//   72  147:dup             
	//   73  148:aload_0         
	//   74  149:invokespecial   #254 <Method void android.support.v7.app.a$a(android.content.Context)>
	//   75  152:aload_1         
	//   76  153:invokevirtual   #361 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(View)>
	//   77  156:iconst_0        
	//   78  157:invokevirtual   #364 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(boolean)>
	//   79  160:invokevirtual   #279 <Method a android.support.v7.app.a$a.b()>
	//   80  163:putfield        #366 <Field a m>
		m.getWindow().setBackgroundDrawable(((android.graphics.drawable.Drawable) (new ColorDrawable(0))));
	//   81  166:aload_0         
	//   82  167:getfield        #366 <Field a m>
	//   83  170:invokevirtual   #370 <Method Window a.getWindow()>
	//   84  173:new             #372 <Class ColorDrawable>
	//   85  176:dup             
	//   86  177:iconst_0        
	//   87  178:invokespecial   #374 <Method void ColorDrawable(int)>
	//   88  181:invokevirtual   #380 <Method void Window.setBackgroundDrawable(android.graphics.drawable.Drawable)>
		m.setCanceledOnTouchOutside(false);
	//   89  184:aload_0         
	//   90  185:getfield        #366 <Field a m>
	//   91  188:iconst_0        
	//   92  189:invokevirtual   #384 <Method void a.setCanceledOnTouchOutside(boolean)>
	//   93  192:return          
	}

	private void q()
	{
		if(q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #386 <Field ba q>
	//*   2    4:ifnull          16
		{
			com.irobot.home.util.o.b("PScheduleCreateActivity", "Fragments are already initialized.");
	//    3    7:ldc1            #66  <String "PScheduleCreateActivity">
	//    4    9:ldc2            #388 <String "Fragments are already initialized.">
	//    5   12:invokestatic    #164 <Method void o.b(String, String)>
			return;
	//    6   15:return          
		}
		FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #392 <Method FragmentManager getSupportFragmentManager()>
	//    9   20:invokevirtual   #398 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   10   23:astore_1        
		fragmenttransaction.replace(0x7f0903a5, r());
	//   11   24:aload_1         
	//   12   25:ldc2            #399 <Int 0x7f0903a5>
	//   13   28:aload_0         
	//   14   29:invokespecial   #402 <Method Fragment r()>
	//   15   32:invokevirtual   #408 <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
	//   16   35:pop             
		Fragment fragment = s();
	//   17   36:aload_0         
	//   18   37:invokespecial   #410 <Method Fragment s()>
	//   19   40:astore_2        
		if(fragment != null)
	//*  20   41:aload_2         
	//*  21   42:ifnull          54
			fragmenttransaction.replace(0x7f0903a3, fragment);
	//   22   45:aload_1         
	//   23   46:ldc2            #411 <Int 0x7f0903a3>
	//   24   49:aload_2         
	//   25   50:invokevirtual   #408 <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
	//   26   53:pop             
		if(D)
	//*  27   54:aload_0         
	//*  28   55:getfield        #91  <Field boolean D>
	//*  29   58:ifeq            81
		{
			com.irobot.home.util.o.b("PScheduleCreateActivity", "Supports additional mission parameters");
	//   30   61:ldc1            #66  <String "PScheduleCreateActivity">
	//   31   63:ldc2            #413 <String "Supports additional mission parameters">
	//   32   66:invokestatic    #164 <Method void o.b(String, String)>
			fragmenttransaction.replace(0x7f0903a4, t());
	//   33   69:aload_1         
	//   34   70:ldc2            #414 <Int 0x7f0903a4>
	//   35   73:aload_0         
	//   36   74:invokespecial   #416 <Method Fragment t()>
	//   37   77:invokevirtual   #408 <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
	//   38   80:pop             
		}
		fragmenttransaction.commitNow();
	//   39   81:aload_1         
	//   40   82:invokevirtual   #419 <Method void FragmentTransaction.commitNow()>
	//   41   85:return          
	}

	private Fragment r()
	{
		com.irobot.home.fragments.bb.a a1 = bb.h().c(z).d(A).e(B).f(a);
	//    0    0:invokestatic    #424 <Method com.irobot.home.fragments.bb$a bb.h()>
	//    1    3:aload_0         
	//    2    4:getfield        #294 <Field int z>
	//    3    7:invokevirtual   #430 <Method com.irobot.home.fragments.bb$a com.irobot.home.fragments.bb$a.c(int)>
	//    4   10:aload_0         
	//    5   11:getfield        #296 <Field int A>
	//    6   14:invokevirtual   #433 <Method com.irobot.home.fragments.bb$a com.irobot.home.fragments.bb$a.d(int)>
	//    7   17:aload_0         
	//    8   18:getfield        #298 <Field int B>
	//    9   21:invokevirtual   #435 <Method com.irobot.home.fragments.bb$a com.irobot.home.fragments.bb$a.e(int)>
	//   10   24:aload_0         
	//   11   25:getfield        #71  <Field int a>
	//   12   28:invokevirtual   #437 <Method com.irobot.home.fragments.bb$a com.irobot.home.fragments.bb$a.f(int)>
	//   13   31:astore_2        
		ArrayList arraylist;
		if(v == null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #249 <Field ScheduleMultipleMappingData v>
	//*  16   36:ifnonnull       98
		{
			arraylist = new ArrayList();
	//   17   39:new             #131 <Class ArrayList>
	//   18   42:dup             
	//   19   43:invokespecial   #438 <Method void ArrayList()>
	//   20   46:astore_1        
			arraylist.add(((Object) (Integer.valueOf(DayOfTheWeek.Monday.ordinal()))));
	//   21   47:aload_1         
	//   22   48:getstatic       #444 <Field DayOfTheWeek DayOfTheWeek.Monday>
	//   23   51:invokevirtual   #447 <Method int DayOfTheWeek.ordinal()>
	//   24   54:invokestatic    #453 <Method Integer Integer.valueOf(int)>
	//   25   57:invokevirtual   #456 <Method boolean ArrayList.add(Object)>
	//   26   60:pop             
			arraylist.add(((Object) (Integer.valueOf(DayOfTheWeek.Wednesday.ordinal()))));
	//   27   61:aload_1         
	//   28   62:getstatic       #459 <Field DayOfTheWeek DayOfTheWeek.Wednesday>
	//   29   65:invokevirtual   #447 <Method int DayOfTheWeek.ordinal()>
	//   30   68:invokestatic    #453 <Method Integer Integer.valueOf(int)>
	//   31   71:invokevirtual   #456 <Method boolean ArrayList.add(Object)>
	//   32   74:pop             
			arraylist.add(((Object) (Integer.valueOf(DayOfTheWeek.Friday.ordinal()))));
	//   33   75:aload_1         
	//   34   76:getstatic       #462 <Field DayOfTheWeek DayOfTheWeek.Friday>
	//   35   79:invokevirtual   #447 <Method int DayOfTheWeek.ordinal()>
	//   36   82:invokestatic    #453 <Method Integer Integer.valueOf(int)>
	//   37   85:invokevirtual   #456 <Method boolean ArrayList.add(Object)>
	//   38   88:pop             
		} else
	//*  39   89:aload_2         
	//*  40   90:aload_1         
	//*  41   91:invokevirtual   #465 <Method com.irobot.home.fragments.bb$a com.irobot.home.fragments.bb$a.a(ArrayList)>
	//*  42   94:pop             
	//*  43   95:goto            145
		{
			a1.a(v.getType());
	//   44   98:aload_2         
	//   45   99:aload_0         
	//   46  100:getfield        #249 <Field ScheduleMultipleMappingData v>
	//   47  103:invokevirtual   #227 <Method ScheduleMultipleMappingType ScheduleMultipleMappingData.getType()>
	//   48  106:invokevirtual   #468 <Method com.irobot.home.fragments.bb$a com.irobot.home.fragments.bb$a.a(ScheduleMultipleMappingType)>
	//   49  109:pop             
			a1.a(v.getHour());
	//   50  110:aload_2         
	//   51  111:aload_0         
	//   52  112:getfield        #249 <Field ScheduleMultipleMappingData v>
	//   53  115:invokevirtual   #234 <Method int ScheduleMultipleMappingData.getHour()>
	//   54  118:invokevirtual   #470 <Method com.irobot.home.fragments.bb$a com.irobot.home.fragments.bb$a.a(int)>
	//   55  121:pop             
			a1.b(v.getMinute());
	//   56  122:aload_2         
	//   57  123:aload_0         
	//   58  124:getfield        #249 <Field ScheduleMultipleMappingData v>
	//   59  127:invokevirtual   #237 <Method int ScheduleMultipleMappingData.getMinute()>
	//   60  130:invokevirtual   #472 <Method com.irobot.home.fragments.bb$a com.irobot.home.fragments.bb$a.b(int)>
	//   61  133:pop             
			arraylist = v.getDays();
	//   62  134:aload_0         
	//   63  135:getfield        #249 <Field ScheduleMultipleMappingData v>
	//   64  138:invokevirtual   #191 <Method ArrayList ScheduleMultipleMappingData.getDays()>
	//   65  141:astore_1        
		}
		a1.a(arraylist);
	//*  66  142:goto            89
		q = a1.a();
	//   67  145:aload_0         
	//   68  146:aload_2         
	//   69  147:invokevirtual   #475 <Method ba com.irobot.home.fragments.bb$a.a()>
	//   70  150:putfield        #386 <Field ba q>
		q.a(((com.irobot.home.fragments.ba.a) (y)));
	//   71  153:aload_0         
	//   72  154:getfield        #386 <Field ba q>
	//   73  157:aload_0         
	//   74  158:getfield        #87  <Field PersistentScheduleCreateActivity$a y>
	//   75  161:invokevirtual   #480 <Method void ba.a(com.irobot.home.fragments.ba$a)>
		return ((Fragment) (q));
	//   76  164:aload_0         
	//   77  165:getfield        #386 <Field ba q>
	//   78  168:areturn         
	}

	private Fragment s()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #145 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Supports pmaps: ");
	//    4    8:aload_1         
	//    5    9:ldc2            #482 <String "Supports pmaps: ">
	//    6   12:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(C);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #89  <Field boolean C>
	//   11   21:invokevirtual   #485 <Method StringBuilder StringBuilder.append(boolean)>
	//   12   24:pop             
		stringbuilder.append(", with maps enabled: ");
	//   13   25:aload_1         
	//   14   26:ldc2            #487 <String ", with maps enabled: ">
	//   15   29:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(F);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #95  <Field boolean F>
	//   20   38:invokevirtual   #485 <Method StringBuilder StringBuilder.append(boolean)>
	//   21   41:pop             
		com.irobot.home.util.o.b("PScheduleCreateActivity", stringbuilder.toString());
	//   22   42:ldc1            #66  <String "PScheduleCreateActivity">
	//   23   44:aload_1         
	//   24   45:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   25   48:invokestatic    #164 <Method void o.b(String, String)>
		if(F && C)
	//*  26   51:aload_0         
	//*  27   52:getfield        #95  <Field boolean F>
	//*  28   55:ifeq            183
	//*  29   58:aload_0         
	//*  30   59:getfield        #89  <Field boolean C>
	//*  31   62:ifeq            183
		{
			H = false;
	//   32   65:aload_0         
	//   33   66:iconst_0        
	//   34   67:putfield        #99  <Field boolean H>
			com.irobot.home.fragments.ax.a a1 = ax.e().a(A).b(B).b(F);
	//   35   70:invokestatic    #492 <Method com.irobot.home.fragments.ax$a ax.e()>
	//   36   73:aload_0         
	//   37   74:getfield        #296 <Field int A>
	//   38   77:invokevirtual   #497 <Method com.irobot.home.fragments.ax$a com.irobot.home.fragments.ax$a.a(int)>
	//   39   80:aload_0         
	//   40   81:getfield        #298 <Field int B>
	//   41   84:invokevirtual   #499 <Method com.irobot.home.fragments.ax$a com.irobot.home.fragments.ax$a.b(int)>
	//   42   87:aload_0         
	//   43   88:getfield        #95  <Field boolean F>
	//   44   91:invokevirtual   #502 <Method com.irobot.home.fragments.ax$a com.irobot.home.fragments.ax$a.b(boolean)>
	//   45   94:astore_1        
			if(v != null)
	//*  46   95:aload_0         
	//*  47   96:getfield        #249 <Field ScheduleMultipleMappingData v>
	//*  48   99:ifnull          159
			{
				a1.a(v.getLocationType());
	//   49  102:aload_1         
	//   50  103:aload_0         
	//   51  104:getfield        #249 <Field ScheduleMultipleMappingData v>
	//   52  107:invokevirtual   #241 <Method ScheduleLocationType ScheduleMultipleMappingData.getLocationType()>
	//   53  110:invokevirtual   #505 <Method com.irobot.home.fragments.ax$a com.irobot.home.fragments.ax$a.a(ScheduleLocationType)>
	//   54  113:pop             
				if(v.getLocationType() == ScheduleLocationType.Room)
	//*  55  114:aload_0         
	//*  56  115:getfield        #249 <Field ScheduleMultipleMappingData v>
	//*  57  118:invokevirtual   #241 <Method ScheduleLocationType ScheduleMultipleMappingData.getLocationType()>
	//*  58  121:getstatic       #511 <Field ScheduleLocationType ScheduleLocationType.Room>
	//*  59  124:if_acmpne       159
					a1.a(v.getRegionIds()).a(v.getMapId()).a(v.getIsOrdered());
	//   60  127:aload_1         
	//   61  128:aload_0         
	//   62  129:getfield        #249 <Field ScheduleMultipleMappingData v>
	//   63  132:invokevirtual   #211 <Method ArrayList ScheduleMultipleMappingData.getRegionIds()>
	//   64  135:invokevirtual   #514 <Method com.irobot.home.fragments.ax$a com.irobot.home.fragments.ax$a.a(ArrayList)>
	//   65  138:aload_0         
	//   66  139:getfield        #249 <Field ScheduleMultipleMappingData v>
	//   67  142:invokevirtual   #199 <Method String ScheduleMultipleMappingData.getMapId()>
	//   68  145:invokevirtual   #517 <Method com.irobot.home.fragments.ax$a com.irobot.home.fragments.ax$a.a(String)>
	//   69  148:aload_0         
	//   70  149:getfield        #249 <Field ScheduleMultipleMappingData v>
	//   71  152:invokevirtual   #244 <Method boolean ScheduleMultipleMappingData.getIsOrdered()>
	//   72  155:invokevirtual   #519 <Method com.irobot.home.fragments.ax$a com.irobot.home.fragments.ax$a.a(boolean)>
	//   73  158:pop             
			}
			r = a1.a();
	//   74  159:aload_0         
	//   75  160:aload_1         
	//   76  161:invokevirtual   #522 <Method aw com.irobot.home.fragments.ax$a.a()>
	//   77  164:putfield        #524 <Field aw r>
			r.a(((com.irobot.home.fragments.aw.a) (y)));
	//   78  167:aload_0         
	//   79  168:getfield        #524 <Field aw r>
	//   80  171:aload_0         
	//   81  172:getfield        #87  <Field PersistentScheduleCreateActivity$a y>
	//   82  175:invokevirtual   #529 <Method void aw.a(com.irobot.home.fragments.aw$a)>
			return ((Fragment) (r));
	//   83  178:aload_0         
	//   84  179:getfield        #524 <Field aw r>
	//   85  182:areturn         
		}
		if(!F && C)
	//*  86  183:aload_0         
	//*  87  184:getfield        #95  <Field boolean F>
	//*  88  187:ifne            204
	//*  89  190:aload_0         
	//*  90  191:getfield        #89  <Field boolean C>
	//*  91  194:ifeq            204
			return ((Fragment) (com.irobot.home.fragments.r.c().a()));
	//   92  197:invokestatic    #534 <Method com.irobot.home.fragments.r$a r.c()>
	//   93  200:invokevirtual   #539 <Method com.irobot.home.fragments.q com.irobot.home.fragments.r$a.a()>
	//   94  203:areturn         
		else
			return null;
	//   95  204:aconst_null     
	//   96  205:areturn         
	}

	private Fragment t()
	{
		com.irobot.home.fragments.az.a a1 = az.c().a(h).a(A).b(B).a(E);
	//    0    0:invokestatic    #544 <Method com.irobot.home.fragments.az$a az.c()>
	//    1    3:aload_0         
	//    2    4:getfield        #546 <Field String h>
	//    3    7:invokevirtual   #551 <Method com.irobot.home.fragments.az$a com.irobot.home.fragments.az$a.a(String)>
	//    4   10:aload_0         
	//    5   11:getfield        #296 <Field int A>
	//    6   14:invokevirtual   #554 <Method com.irobot.home.fragments.az$a com.irobot.home.fragments.az$a.a(int)>
	//    7   17:aload_0         
	//    8   18:getfield        #298 <Field int B>
	//    9   21:invokevirtual   #556 <Method com.irobot.home.fragments.az$a com.irobot.home.fragments.az$a.b(int)>
	//   10   24:aload_0         
	//   11   25:getfield        #93  <Field boolean E>
	//   12   28:invokevirtual   #559 <Method com.irobot.home.fragments.az$a com.irobot.home.fragments.az$a.a(boolean)>
	//   13   31:astore_1        
		if(v != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #249 <Field ScheduleMultipleMappingData v>
	//*  16   36:ifnull          51
			a1.a(v.getMissionParameters());
	//   17   39:aload_1         
	//   18   40:aload_0         
	//   19   41:getfield        #249 <Field ScheduleMultipleMappingData v>
	//   20   44:invokevirtual   #220 <Method HashMap ScheduleMultipleMappingData.getMissionParameters()>
	//   21   47:invokevirtual   #562 <Method com.irobot.home.fragments.az$a com.irobot.home.fragments.az$a.a(HashMap)>
	//   22   50:pop             
		s = a1.a();
	//   23   51:aload_0         
	//   24   52:aload_1         
	//   25   53:invokevirtual   #565 <Method ay com.irobot.home.fragments.az$a.a()>
	//   26   56:putfield        #567 <Field ay s>
		return ((Fragment) (s));
	//   27   59:aload_0         
	//   28   60:getfield        #567 <Field ay s>
	//   29   63:areturn         
	}

	private ScheduleMultipleMappingData u()
	{
		int j1;
		int l1;
		boolean flag;
		ArrayList arraylist;
		Object obj;
		Object obj1;
		String s1;
		String s2;
		ArrayList arraylist2;
		ArrayList arraylist3;
		ScheduleMultipleMappingType schedulemultiplemappingtype;
label0:
		{
			schedulemultiplemappingtype = q.f();
	//    0    0:aload_0         
	//    1    1:getfield        #386 <Field ba q>
	//    2    4:invokevirtual   #570 <Method ScheduleMultipleMappingType ba.f()>
	//    3    7:astore          12
			if(schedulemultiplemappingtype == ScheduleMultipleMappingType.Normal)
	//*   4    9:aload           12
	//*   5   11:getstatic       #576 <Field ScheduleMultipleMappingType ScheduleMultipleMappingType.Normal>
	//*   6   14:if_acmpne       29
				arraylist = q.g();
	//    7   17:aload_0         
	//    8   18:getfield        #386 <Field ba q>
	//    9   21:invokevirtual   #578 <Method ArrayList ba.g()>
	//   10   24:astore          4
			else
	//*  11   26:goto            101
			if(schedulemultiplemappingtype == ScheduleMultipleMappingType.Once)
	//*  12   29:aload           12
	//*  13   31:getstatic       #581 <Field ScheduleMultipleMappingType ScheduleMultipleMappingType.Once>
	//*  14   34:if_acmpne       89
			{
				ArrayList arraylist1 = new ArrayList();
	//   15   37:new             #131 <Class ArrayList>
	//   16   40:dup             
	//   17   41:invokespecial   #438 <Method void ArrayList()>
	//   18   44:astore          5
				DayOfTheWeek adayoftheweek[] = DayOfTheWeek.values();
	//   19   46:invokestatic    #585 <Method DayOfTheWeek[] DayOfTheWeek.values()>
	//   20   49:astore          6
				int k1 = adayoftheweek.length;
	//   21   51:aload           6
	//   22   53:arraylength     
	//   23   54:istore_2        
				int i1 = 0;
	//   24   55:iconst_0        
	//   25   56:istore_1        
				do
				{
					arraylist = arraylist1;
	//   26   57:aload           5
	//   27   59:astore          4
					if(i1 >= k1)
						break;
	//   28   61:iload_1         
	//   29   62:iload_2         
	//   30   63:icmpge          26
					arraylist1.add(((Object) (Integer.valueOf(adayoftheweek[i1].ordinal()))));
	//   31   66:aload           5
	//   32   68:aload           6
	//   33   70:iload_1         
	//   34   71:aaload          
	//   35   72:invokevirtual   #447 <Method int DayOfTheWeek.ordinal()>
	//   36   75:invokestatic    #453 <Method Integer Integer.valueOf(int)>
	//   37   78:invokevirtual   #456 <Method boolean ArrayList.add(Object)>
	//   38   81:pop             
					i1++;
	//   39   82:iload_1         
	//   40   83:iconst_1        
	//   41   84:iadd            
	//   42   85:istore_1        
				} while(true);
	//   43   86:goto            57
			} else
			{
				arraylist = new ArrayList();
	//   44   89:new             #131 <Class ArrayList>
	//   45   92:dup             
	//   46   93:invokespecial   #438 <Method void ArrayList()>
	//   47   96:astore          4
			}
	//*  48   98:goto            26
			j1 = q.d();
	//   49  101:aload_0         
	//   50  102:getfield        #386 <Field ba q>
	//   51  105:invokevirtual   #587 <Method int ba.d()>
	//   52  108:istore_1        
			l1 = q.e();
	//   53  109:aload_0         
	//   54  110:getfield        #386 <Field ba q>
	//   55  113:invokevirtual   #589 <Method int ba.e()>
	//   56  116:istore_2        
			obj = ((Object) (ScheduleLocationType.Everywhere));
	//   57  117:getstatic       #592 <Field ScheduleLocationType ScheduleLocationType.Everywhere>
	//   58  120:astore          5
			arraylist2 = new ArrayList();
	//   59  122:new             #131 <Class ArrayList>
	//   60  125:dup             
	//   61  126:invokespecial   #438 <Method void ArrayList()>
	//   62  129:astore          9
			arraylist3 = new ArrayList();
	//   63  131:new             #131 <Class ArrayList>
	//   64  134:dup             
	//   65  135:invokespecial   #438 <Method void ArrayList()>
	//   66  138:astore          10
			if(r != null)
	//*  67  140:aload_0         
	//*  68  141:getfield        #524 <Field aw r>
	//*  69  144:ifnull          229
			{
				obj1 = ((Object) (r.b()));
	//   70  147:aload_0         
	//   71  148:getfield        #524 <Field aw r>
	//   72  151:invokevirtual   #594 <Method ScheduleLocationType aw.b()>
	//   73  154:astore          6
				obj = obj1;
	//   74  156:aload           6
	//   75  158:astore          5
				if(obj1 == ScheduleLocationType.Room)
	//*  76  160:aload           6
	//*  77  162:getstatic       #511 <Field ScheduleLocationType ScheduleLocationType.Room>
	//*  78  165:if_acmpne       229
				{
					obj = ((Object) (r.c()));
	//   79  168:aload_0         
	//   80  169:getfield        #524 <Field aw r>
	//   81  172:invokevirtual   #597 <Method ScheduleMapData aw.c()>
	//   82  175:astore          5
					arraylist2 = ((ScheduleMapData) (obj)).getRegionIds();
	//   83  177:aload           5
	//   84  179:invokevirtual   #600 <Method ArrayList ScheduleMapData.getRegionIds()>
	//   85  182:astore          9
					arraylist3 = ((ScheduleMapData) (obj)).getRegionNames();
	//   86  184:aload           5
	//   87  186:invokevirtual   #601 <Method ArrayList ScheduleMapData.getRegionNames()>
	//   88  189:astore          10
					String s3 = ((ScheduleMapData) (obj)).getMapId();
	//   89  191:aload           5
	//   90  193:invokevirtual   #602 <Method String ScheduleMapData.getMapId()>
	//   91  196:astore          11
					s1 = ((ScheduleMapData) (obj)).getMapVersion();
	//   92  198:aload           5
	//   93  200:invokevirtual   #603 <Method String ScheduleMapData.getMapVersion()>
	//   94  203:astore          7
					s2 = ((ScheduleMapData) (obj)).getLastUserEditedMapVersion();
	//   95  205:aload           5
	//   96  207:invokevirtual   #604 <Method String ScheduleMapData.getLastUserEditedMapVersion()>
	//   97  210:astore          8
					flag = ((ScheduleMapData) (obj)).getIsOrdered();
	//   98  212:aload           5
	//   99  214:invokevirtual   #605 <Method boolean ScheduleMapData.getIsOrdered()>
	//  100  217:istore_3        
					obj = obj1;
	//  101  218:aload           6
	//  102  220:astore          5
					obj1 = ((Object) (s3));
	//  103  222:aload           11
	//  104  224:astore          6
					break label0;
	//  105  226:goto            246
				}
			}
			flag = false;
	//  106  229:iconst_0        
	//  107  230:istore_3        
			s1 = "";
	//  108  231:ldc2            #607 <String "">
	//  109  234:astore          7
			s2 = "";
	//  110  236:ldc2            #607 <String "">
	//  111  239:astore          8
			obj1 = "";
	//  112  241:ldc2            #607 <String "">
	//  113  244:astore          6
		}
		HashMap hashmap = new HashMap();
	//  114  246:new             #216 <Class HashMap>
	//  115  249:dup             
	//  116  250:invokespecial   #608 <Method void HashMap()>
	//  117  253:astore          11
		if(s != null)
	//* 118  255:aload_0         
	//* 119  256:getfield        #567 <Field ay s>
	//* 120  259:ifnull          271
			hashmap = s.b();
	//  121  262:aload_0         
	//  122  263:getfield        #567 <Field ay s>
	//  123  266:invokevirtual   #612 <Method HashMap ay.b()>
	//  124  269:astore          11
		return new ScheduleMultipleMappingData(schedulemultiplemappingtype, true, arraylist, j1, l1, ((ScheduleLocationType) (obj)), ((String) (obj1)), s1, s2, arraylist2, arraylist3, flag, hashmap);
	//  125  271:new             #137 <Class ScheduleMultipleMappingData>
	//  126  274:dup             
	//  127  275:aload           12
	//  128  277:iconst_1        
	//  129  278:aload           4
	//  130  280:iload_1         
	//  131  281:iload_2         
	//  132  282:aload           5
	//  133  284:aload           6
	//  134  286:aload           7
	//  135  288:aload           8
	//  136  290:aload           9
	//  137  292:aload           10
	//  138  294:iload_3         
	//  139  295:aload           11
	//  140  297:invokespecial   #247 <Method void ScheduleMultipleMappingData(ScheduleMultipleMappingType, boolean, ArrayList, int, int, ScheduleLocationType, String, String, String, ArrayList, ArrayList, boolean, HashMap)>
	//  141  300:areturn         
	}

	private void v()
	{
		if(n != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #614 <Field a n>
	//*   2    4:ifnull          14
			n.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #614 <Field a n>
	//    5   11:invokevirtual   #617 <Method void a.dismiss()>
		m.dismiss();
	//    6   14:aload_0         
	//    7   15:getfield        #366 <Field a m>
	//    8   18:invokevirtual   #617 <Method void a.dismiss()>
	//    9   21:return          
	}

	void a(ScheduleMultipleMappingData schedulemultiplemappingdata)
	{
		if(n == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #614 <Field a n>
	//*   2    4:ifnonnull       74
			n = (new android.support.v7.app.a.a(((android.content.Context) (this)))).a(0x7f0f07c7).b(((CharSequence) (getString(0x7f0f07c5, new Object[] {
				w.getName()
			})))).a(0x7f0f07c6, new android.content.DialogInterface.OnClickListener(schedulemultiplemappingdata) {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					dialoginterface = ((DialogInterface) (ScheduleUIServiceData.create()));
				//    0    0:invokestatic    #32  <Method ScheduleUIServiceData ScheduleUIServiceData.create()>
				//    1    3:astore_1        
					((ScheduleUIServiceData) (dialoginterface)).setScheduleMultipleMappingData(a);
				//    2    4:aload_1         
				//    3    5:aload_0         
				//    4    6:getfield        #20  <Field ScheduleMultipleMappingData a>
				//    5    9:invokevirtual   #35  <Method void ScheduleUIServiceData.setScheduleMultipleMappingData(ScheduleMultipleMappingData)>
					((ScheduleUIServiceData) (dialoginterface)).setScheduleItemIndex(b.i);
				//    6   12:aload_1         
				//    7   13:aload_0         
				//    8   14:getfield        #18  <Field PersistentScheduleCreateActivity b>
				//    9   17:getfield        #39  <Field int PersistentScheduleCreateActivity.i>
				//   10   20:invokevirtual   #43  <Method void ScheduleUIServiceData.setScheduleItemIndex(int)>
					PersistentScheduleCreateActivity.b(b).sendCommand(ScheduleUIServiceCommand.CreateMappingScheduleSendData, ((ScheduleUIServiceData) (dialoginterface)));
				//   11   23:aload_0         
				//   12   24:getfield        #18  <Field PersistentScheduleCreateActivity b>
				//   13   27:invokestatic    #46  <Method ScheduleUIService PersistentScheduleCreateActivity.b(PersistentScheduleCreateActivity)>
				//   14   30:getstatic       #52  <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.CreateMappingScheduleSendData>
				//   15   33:aload_1         
				//   16   34:invokevirtual   #58  <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
				//   17   37:return          
				}

				final ScheduleMultipleMappingData a;
				final PersistentScheduleCreateActivity b;

			
			{
				b = PersistentScheduleCreateActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PersistentScheduleCreateActivity b>
				a = schedulemultiplemappingdata;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field ScheduleMultipleMappingData a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
).b(0x7f0f07c4, ((android.content.DialogInterface.OnClickListener) (null))).b();
	//    3    7:aload_0         
	//    4    8:new             #251 <Class android.support.v7.app.a$a>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #254 <Method void android.support.v7.app.a$a(android.content.Context)>
	//    8   16:ldc2            #618 <Int 0x7f0f07c7>
	//    9   19:invokevirtual   #621 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int)>
	//   10   22:aload_0         
	//   11   23:ldc2            #622 <Int 0x7f0f07c5>
	//   12   26:iconst_1        
	//   13   27:anewarray       Object[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:aload_0         
	//   17   33:getfield        #346 <Field AssetInfo w>
	//   18   36:invokevirtual   #351 <Method String AssetInfo.getName()>
	//   19   39:aastore         
	//   20   40:invokevirtual   #354 <Method String getString(int, Object[])>
	//   21   43:invokevirtual   #275 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(CharSequence)>
	//   22   46:ldc2            #623 <Int 0x7f0f07c6>
	//   23   49:new             #8   <Class PersistentScheduleCreateActivity$2>
	//   24   52:dup             
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:invokespecial   #626 <Method void PersistentScheduleCreateActivity$2(PersistentScheduleCreateActivity, ScheduleMultipleMappingData)>
	//   28   58:invokevirtual   #629 <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
	//   29   61:ldc2            #630 <Int 0x7f0f07c4>
	//   30   64:aconst_null     
	//   31   65:invokevirtual   #632 <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int, android.content.DialogInterface$OnClickListener)>
	//   32   68:invokevirtual   #279 <Method a android.support.v7.app.a$a.b()>
	//   33   71:putfield        #614 <Field a n>
		n.show();
	//   34   74:aload_0         
	//   35   75:getfield        #614 <Field a n>
	//   36   78:invokevirtual   #286 <Method void a.show()>
	//   37   81:return          
	}

	void a(String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #145 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Timed out for reason: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #634 <String "Timed out for reason: ">
	//    6   12:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s1);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		com.irobot.home.util.o.a("PScheduleCreateActivity", stringbuilder.toString());
	//   12   22:ldc1            #66  <String "PScheduleCreateActivity">
	//   13   24:aload_2         
	//   14   25:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #636 <Method void o.a(String, String)>
		AnalyticsSubsystem.getInstance().trackCleanScheduleTwoTimeoutError(w, s1);
	//   16   31:invokestatic    #642 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   17   34:aload_0         
	//   18   35:getfield        #346 <Field AssetInfo w>
	//   19   38:aload_1         
	//   20   39:invokevirtual   #646 <Method void AnalyticsSubsystem.trackCleanScheduleTwoTimeoutError(AssetInfo, String)>
	//   21   42:return          
	}

	protected void e()
	{
		boolean flag;
		if(i == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field int i>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		I = flag;
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:putfield        #123 <Field boolean I>
		int i1;
		if(I)
	//*  12   20:aload_0         
	//*  13   21:getfield        #123 <Field boolean I>
	//*  14   24:ifeq            44
			i1 = 0x7f0f0241;
	//   15   27:ldc2            #647 <Int 0x7f0f0241>
	//   16   30:istore_1        
		else
	//*  17   31:aload_0         
	//*  18   32:iload_1         
	//*  19   33:aconst_null     
	//*  20   34:ldc2            #648 <Int 0x7f10020e>
	//*  21   37:iconst_0        
	//*  22   38:invokevirtual   #651 <Method void a(int, ArrayList, int, int)>
	//*  23   41:goto            51
			i1 = 0x7f0f0299;
	//   24   44:ldc2            #652 <Int 0x7f0f0299>
	//   25   47:istore_1        
		a(i1, ((ArrayList) (null)), 0x7f10020e, 0);
	//*  26   48:goto            31
		a(true, 0x7f080203);
	//   27   51:aload_0         
	//   28   52:iconst_1        
	//   29   53:ldc2            #653 <Int 0x7f080203>
	//   30   56:invokevirtual   #656 <Method void a(boolean, int)>
		e = true;
	//   31   59:aload_0         
	//   32   60:iconst_1        
	//   33   61:putfield        #658 <Field boolean e>
	//   34   64:return          
	}

	protected void f()
	{
		w = com.irobot.home.util.j.a(h).a();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #546 <Field String h>
	//    3    5:invokestatic    #663 <Method com.irobot.home.model.a j.a(String)>
	//    4    8:invokevirtual   #668 <Method AssetInfo com.irobot.home.model.a.a()>
	//    5   11:putfield        #346 <Field AssetInfo w>
		p();
	//    6   14:aload_0         
	//    7   15:invokespecial   #670 <Method void p()>
		t = Assembler.getInstance().getScheduleUIService(w.getAssetId());
	//    8   18:aload_0         
	//    9   19:invokestatic    #675 <Method Assembler Assembler.getInstance()>
	//   10   22:aload_0         
	//   11   23:getfield        #346 <Field AssetInfo w>
	//   12   26:invokevirtual   #679 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   13   29:invokevirtual   #683 <Method ScheduleUIService Assembler.getScheduleUIService(com.irobot.core.AssetId)>
	//   14   32:putfield        #188 <Field ScheduleUIService t>
		AnalyticsSubsystem analyticssubsystem;
		ViewId viewid;
		if(I)
	//*  15   35:aload_0         
	//*  16   36:getfield        #123 <Field boolean I>
	//*  17   39:ifeq            60
		{
			analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   18   42:invokestatic    #642 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   19   45:astore_1        
			viewid = ViewId.CleanScheduleTwoCreate;
	//   20   46:getstatic       #689 <Field ViewId ViewId.CleanScheduleTwoCreate>
	//   21   49:astore_2        
		} else
	//*  22   50:aload_1         
	//*  23   51:aload_2         
	//*  24   52:aload_0         
	//*  25   53:getfield        #346 <Field AssetInfo w>
	//*  26   56:invokevirtual   #693 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
	//*  27   59:return          
		{
			k.setVisibility(0);
	//   28   60:aload_0         
	//   29   61:getfield        #695 <Field CustomButton k>
	//   30   64:iconst_0        
	//   31   65:invokevirtual   #700 <Method void CustomButton.setVisibility(int)>
			analyticssubsystem = AnalyticsSubsystem.getInstance();
	//   32   68:invokestatic    #642 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   33   71:astore_1        
			viewid = ViewId.CleanScheduleTwoExistingSchedule;
	//   34   72:getstatic       #703 <Field ViewId ViewId.CleanScheduleTwoExistingSchedule>
	//   35   75:astore_2        
		}
		analyticssubsystem.trackViewForAsset(viewid, w);
	//*  36   76:goto            50
	}

	protected void g()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #179 <Method void finish()>
	//    2    4:return          
	}

	protected void h()
	{
		if(G && H)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field boolean G>
	//*   2    4:ifeq            75
	//*   3    7:aload_0         
	//*   4    8:getfield        #99  <Field boolean H>
	//*   5   11:ifne            17
	//*   6   14:goto            75
		{
			ScheduleMultipleMappingData schedulemultiplemappingdata = u();
	//    7   17:aload_0         
	//    8   18:invokespecial   #705 <Method ScheduleMultipleMappingData u()>
	//    9   21:astore_1        
			if(schedulemultiplemappingdata.equals(((Object) (u))))
	//*  10   22:aload_1         
	//*  11   23:aload_0         
	//*  12   24:getfield        #139 <Field ScheduleMultipleMappingData u>
	//*  13   27:invokevirtual   #143 <Method boolean ScheduleMultipleMappingData.equals(Object)>
	//*  14   30:ifeq            46
			{
				com.irobot.home.util.o.a("PScheduleCreateActivity", "No edits made, don't update asset.");
	//   15   33:ldc1            #66  <String "PScheduleCreateActivity">
	//   16   35:ldc2            #707 <String "No edits made, don't update asset.">
	//   17   38:invokestatic    #636 <Method void o.a(String, String)>
				finish();
	//   18   41:aload_0         
	//   19   42:invokevirtual   #179 <Method void finish()>
				return;
	//   20   45:return          
			} else
			{
				ScheduleUIServiceData scheduleuiservicedata = ScheduleUIServiceData.create();
	//   21   46:invokestatic    #711 <Method ScheduleUIServiceData ScheduleUIServiceData.create()>
	//   22   49:astore_2        
				scheduleuiservicedata.setScheduleItemIndex(i);
	//   23   50:aload_2         
	//   24   51:aload_0         
	//   25   52:getfield        #82  <Field int i>
	//   26   55:invokevirtual   #714 <Method void ScheduleUIServiceData.setScheduleItemIndex(int)>
				scheduleuiservicedata.setScheduleMultipleMappingData(schedulemultiplemappingdata);
	//   27   58:aload_2         
	//   28   59:aload_1         
	//   29   60:invokevirtual   #717 <Method void ScheduleUIServiceData.setScheduleMultipleMappingData(ScheduleMultipleMappingData)>
				t.sendCommand(ScheduleUIServiceCommand.CreateMappingScheduleSaveEntry, scheduleuiservicedata);
	//   30   63:aload_0         
	//   31   64:getfield        #188 <Field ScheduleUIService t>
	//   32   67:getstatic       #723 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.CreateMappingScheduleSaveEntry>
	//   33   70:aload_2         
	//   34   71:invokevirtual   #729 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
				return;
	//   35   74:return          
			}
		} else
		{
			o();
	//   36   75:aload_0         
	//   37   76:invokespecial   #731 <Method void o()>
			return;
	//   38   79:return          
		}
	}

	protected void i()
	{
		ScheduleUIServiceData scheduleuiservicedata = ScheduleUIServiceData.create();
	//    0    0:invokestatic    #711 <Method ScheduleUIServiceData ScheduleUIServiceData.create()>
	//    1    3:astore_1        
		scheduleuiservicedata.setScheduleItemIndex(i);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #82  <Field int i>
	//    5    9:invokevirtual   #714 <Method void ScheduleUIServiceData.setScheduleItemIndex(int)>
		t.sendCommand(ScheduleUIServiceCommand.CreateMappingScheduleDeleteEntry, scheduleuiservicedata);
	//    6   12:aload_0         
	//    7   13:getfield        #188 <Field ScheduleUIService t>
	//    8   16:getstatic       #734 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.CreateMappingScheduleDeleteEntry>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #729 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
	//   11   23:return          
	}

	protected void j()
	{
		p.show();
	//    0    0:aload_0         
	//    1    1:getfield        #319 <Field Toast p>
	//    2    4:invokevirtual   #735 <Method void Toast.show()>
	//    3    7:return          
	}

	void k()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #179 <Method void finish()>
	//    2    4:return          
	}

	void l()
	{
		j();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #176 <Method void j()>
	//    2    4:return          
	}

	void m()
	{
		m.dismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #366 <Field a m>
	//    2    4:invokevirtual   #617 <Method void a.dismiss()>
	//    3    7:return          
	}

	void n()
	{
		m.show();
	//    0    0:aload_0         
	//    1    1:getfield        #366 <Field a m>
	//    2    4:invokevirtual   #286 <Method void a.show()>
	//    3    7:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #738 <Method void BaseToolbarFragmentActivity.onPause()>
		if(x != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #281 <Field a x>
	//*   4    8:ifnull          18
			x.dismiss();
	//    5   11:aload_0         
	//    6   12:getfield        #281 <Field a x>
	//    7   15:invokevirtual   #617 <Method void a.dismiss()>
		if(m != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #366 <Field a m>
	//*  10   22:ifnull          32
			m.dismiss();
	//   11   25:aload_0         
	//   12   26:getfield        #366 <Field a m>
	//   13   29:invokevirtual   #617 <Method void a.dismiss()>
		if(n != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #614 <Field a n>
	//*  16   36:ifnull          46
			n.dismiss();
	//   17   39:aload_0         
	//   18   40:getfield        #614 <Field a n>
	//   19   43:invokevirtual   #617 <Method void a.dismiss()>
		t.sendCommand(ScheduleUIServiceCommand.CreateMappingScheduleViewClosed, ((ScheduleUIServiceData) (null)));
	//   20   46:aload_0         
	//   21   47:getfield        #188 <Field ScheduleUIService t>
	//   22   50:getstatic       #741 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.CreateMappingScheduleViewClosed>
	//   23   53:aconst_null     
	//   24   54:invokevirtual   #729 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
	//   25   57:return          
	}

	public boolean onPrepareOptionsMenu(Menu menu)
	{
		boolean flag1 = super.onPrepareOptionsMenu(menu);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #745 <Method boolean BaseToolbarFragmentActivity.onPrepareOptionsMenu(Menu)>
	//    3    5:istore_3        
		menu = ((Menu) (menu.findItem(0x7f09039b)));
	//    4    6:aload_1         
	//    5    7:ldc2            #746 <Int 0x7f09039b>
	//    6   10:invokeinterface #752 <Method MenuItem Menu.findItem(int)>
	//    7   15:astore_1        
		if(menu != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          108
		{
			boolean flag;
			if(G && H)
	//*  10   20:aload_0         
	//*  11   21:getfield        #97  <Field boolean G>
	//*  12   24:ifeq            39
	//*  13   27:aload_0         
	//*  14   28:getfield        #99  <Field boolean H>
	//*  15   31:ifeq            39
				flag = true;
	//   16   34:iconst_1        
	//   17   35:istore_2        
			else
	//*  18   36:goto            41
				flag = false;
	//   19   39:iconst_0        
	//   20   40:istore_2        
			CharSequence charsequence = ((MenuItem) (menu)).getTitle();
	//   21   41:aload_1         
	//   22   42:invokeinterface #758 <Method CharSequence MenuItem.getTitle()>
	//   23   47:astore          4
			SpannableString spannablestring = new SpannableString(charsequence);
	//   24   49:new             #760 <Class SpannableString>
	//   25   52:dup             
	//   26   53:aload           4
	//   27   55:invokespecial   #762 <Method void SpannableString(CharSequence)>
	//   28   58:astore          5
			int i1;
			if(flag)
	//*  29   60:iload_2         
	//*  30   61:ifeq            72
				i1 = A;
	//   31   64:aload_0         
	//   32   65:getfield        #296 <Field int A>
	//   33   68:istore_2        
			else
	//*  34   69:goto            77
				i1 = B;
	//   35   72:aload_0         
	//   36   73:getfield        #298 <Field int B>
	//   37   76:istore_2        
			spannablestring.setSpan(((Object) (new ForegroundColorSpan(i1))), 0, charsequence.length(), 0);
	//   38   77:aload           5
	//   39   79:new             #764 <Class ForegroundColorSpan>
	//   40   82:dup             
	//   41   83:iload_2         
	//   42   84:invokespecial   #765 <Method void ForegroundColorSpan(int)>
	//   43   87:iconst_0        
	//   44   88:aload           4
	//   45   90:invokeinterface #770 <Method int CharSequence.length()>
	//   46   95:iconst_0        
	//   47   96:invokevirtual   #774 <Method void SpannableString.setSpan(Object, int, int, int)>
			((MenuItem) (menu)).setTitle(((CharSequence) (spannablestring)));
	//   48   99:aload_1         
	//   49  100:aload           5
	//   50  102:invokeinterface #778 <Method MenuItem MenuItem.setTitle(CharSequence)>
	//   51  107:pop             
		}
		return flag1;
	//   52  108:iload_3         
	//   53  109:ireturn         
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #781 <Method void BaseToolbarFragmentActivity.onResume()>
		t.sendCommand(ScheduleUIServiceCommand.CreateMappingScheduleViewOpened, ((ScheduleUIServiceData) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #188 <Field ScheduleUIService t>
	//    4    8:getstatic       #784 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.CreateMappingScheduleViewOpened>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #729 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
		t.sendCommand(ScheduleUIServiceCommand.CreateMappingScheduleLoadParams, ((ScheduleUIServiceData) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #188 <Field ScheduleUIService t>
	//    9   19:getstatic       #787 <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.CreateMappingScheduleLoadParams>
	//   10   22:aconst_null     
	//   11   23:invokevirtual   #729 <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
	//   12   26:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #790 <Method void BaseToolbarFragmentActivity.onStart()>
		t.registerUISubscriber(J);
	//    2    4:aload_0         
	//    3    5:getfield        #188 <Field ScheduleUIService t>
	//    4    8:aload_0         
	//    5    9:getfield        #104 <Field ScheduleUIServiceDataCallback J>
	//    6   12:invokevirtual   #794 <Method boolean ScheduleUIService.registerUISubscriber(ScheduleUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #797 <Method void BaseToolbarFragmentActivity.onStop()>
		t.unregisterSubscriber(J);
	//    2    4:aload_0         
	//    3    5:getfield        #188 <Field ScheduleUIService t>
	//    4    8:aload_0         
	//    5    9:getfield        #104 <Field ScheduleUIServiceDataCallback J>
	//    6   12:invokevirtual   #800 <Method boolean ScheduleUIService.unregisterSubscriber(ScheduleUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	private int A;
	private int B;
	private boolean C;
	private boolean D;
	private boolean E;
	private boolean F;
	private volatile boolean G;
	private volatile boolean H;
	private boolean I;
	private ScheduleUIServiceDataCallback J;
	protected int a;
	protected int b;
	protected int f;
	protected int g;
	String h;
	int i;
	NestedScrollView j;
	CustomButton k;
	private final String l = "PScheduleCreateActivity";
	private android.support.v7.app.a m;
	private android.support.v7.app.a n;
	private View o;
	private Toast p;
	private ba q;
	private aw r;
	private ay s;
	private ScheduleUIService t;
	private ScheduleMultipleMappingData u;
	private ScheduleMultipleMappingData v;
	private AssetInfo w;
	private android.support.v7.app.a x;
	private a y;
	private int z;
}
