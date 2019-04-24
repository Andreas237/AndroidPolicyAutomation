// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.v7.widget.SwitchCompat;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class LogStreamActivity extends BaseFragmentActivity
	implements android.widget.CompoundButton.OnCheckedChangeListener
{
	private class a extends LogStreamUIServiceDataCallback
	{

		public void onLogStreamUIServiceDataChanged(MissionUIServiceData missionuiservicedata)
		{
			if(missionuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       12
			{
				o.e("LogStreamActivity", "null service data");
		//    2    4:ldc1            #23  <String "LogStreamActivity">
		//    3    6:ldc1            #25  <String "null service data">
		//    4    8:invokestatic    #31  <Method void o.e(String, String)>
				return;
		//    5   11:return          
			}
			Object obj = ((Object) (missionuiservicedata.getMissionDataStates()));
		//    6   12:aload_1         
		//    7   13:invokevirtual   #37  <Method ArrayList MissionUIServiceData.getMissionDataStates()>
		//    8   16:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//    9   17:new             #39  <Class StringBuilder>
		//   10   20:dup             
		//   11   21:invokespecial   #40  <Method void StringBuilder()>
		//   12   24:astore          4
			stringbuilder.append("Change list: ");
		//   13   26:aload           4
		//   14   28:ldc1            #42  <String "Change list: ">
		//   15   30:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   16   33:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
		//   17   34:aload           4
		//   18   36:aload_3         
		//   19   37:invokevirtual   #52  <Method String ArrayList.toString()>
		//   20   40:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   21   43:pop             
			o.b("LogStreamActivity", stringbuilder.toString());
		//   22   44:ldc1            #23  <String "LogStreamActivity">
		//   23   46:aload           4
		//   24   48:invokevirtual   #53  <Method String StringBuilder.toString()>
		//   25   51:invokestatic    #56  <Method void o.b(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   26   54:aload_3         
		//   27   55:invokevirtual   #60  <Method Iterator ArrayList.iterator()>
		//   28   58:astore_3        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   29   59:aload_3         
		//   30   60:invokeinterface #66  <Method boolean Iterator.hasNext()>
		//   31   65:ifeq            197
				MissionDataState missiondatastate = (MissionDataState)((Iterator) (obj)).next();
		//   32   68:aload_3         
		//   33   69:invokeinterface #70  <Method Object Iterator.next()>
		//   34   74:checkcast       #72  <Class MissionDataState>
		//   35   77:astore          4
				static class _cls1
				{

					static final int a[];

					static 
					{
						a = new int[MissionDataState.values().length];
					//    0    0:invokestatic    #18  <Method MissionDataState[] MissionDataState.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #20  <Field int[] a>
						try
						{
							a[MissionDataState.LogStreamState.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] a>
					//    5   12:getstatic       #24  <Field MissionDataState MissionDataState.LogStreamState>
					//    6   15:invokevirtual   #28  <Method int MissionDataState.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #20  <Field int[] a>
					//*  10   23:getstatic       #31  <Field MissionDataState MissionDataState.LogStreamData>
					//*  11   26:invokevirtual   #28  <Method int MissionDataState.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   15   32:astore_0        
						try
						{
							a[MissionDataState.LogStreamData.ordinal()] = 2;
						}
					//*  16   33:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   17   36:astore_0        
					//*  18   37:return          
					}
				}

				switch(com.irobot.home._cls1.a[missiondatastate.ordinal()])
		//*  36   79:getstatic       #77  <Field int[] com.irobot.home.LogStreamActivity$1.a>
		//*  37   82:aload           4
		//*  38   84:invokevirtual   #81  <Method int MissionDataState.ordinal()>
		//*  39   87:iaload          
				{
		//*  40   88:tableswitch     1 2: default 112
		//		               1 155
		//		               2 115
		//*  41  112:goto            59
				case 2: // '\002'
					a.a.add(((Object) (missionuiservicedata.getLogStreamData())));
		//   42  115:aload_0         
		//   43  116:getfield        #12  <Field LogStreamActivity a>
		//   44  119:getfield        #84  <Field List com.irobot.home.LogStreamActivity.a>
		//   45  122:aload_1         
		//   46  123:invokevirtual   #87  <Method String MissionUIServiceData.getLogStreamData()>
		//   47  126:invokeinterface #93  <Method boolean List.add(Object)>
		//   48  131:pop             
					a.b.notifyDataSetChanged();
		//   49  132:aload_0         
		//   50  133:getfield        #12  <Field LogStreamActivity a>
		//   51  136:getfield        #96  <Field ArrayAdapter LogStreamActivity.b>
		//   52  139:invokevirtual   #101 <Method void ArrayAdapter.notifyDataSetChanged()>
					a.b.notifyDataSetInvalidated();
		//   53  142:aload_0         
		//   54  143:getfield        #12  <Field LogStreamActivity a>
		//   55  146:getfield        #96  <Field ArrayAdapter LogStreamActivity.b>
		//   56  149:invokevirtual   #104 <Method void ArrayAdapter.notifyDataSetInvalidated()>
					break;

		//*  57  152:goto            59
				case 1: // '\001'
					boolean flag = missionuiservicedata.getIsLogStreamEnabled();
		//   58  155:aload_1         
		//   59  156:invokevirtual   #107 <Method boolean MissionUIServiceData.getIsLogStreamEnabled()>
		//   60  159:istore_2        
					a.a(flag);
		//   61  160:aload_0         
		//   62  161:getfield        #12  <Field LogStreamActivity a>
		//   63  164:iload_2         
		//   64  165:invokevirtual   #110 <Method void com.irobot.home.LogStreamActivity.a(boolean)>
					if(!flag)
		//*  65  168:iload_2         
		//*  66  169:ifne            59
					{
						a.a.clear();
		//   67  172:aload_0         
		//   68  173:getfield        #12  <Field LogStreamActivity a>
		//   69  176:getfield        #84  <Field List com.irobot.home.LogStreamActivity.a>
		//   70  179:invokeinterface #113 <Method void List.clear()>
						a.b.clear();
		//   71  184:aload_0         
		//   72  185:getfield        #12  <Field LogStreamActivity a>
		//   73  188:getfield        #96  <Field ArrayAdapter LogStreamActivity.b>
		//   74  191:invokevirtual   #114 <Method void ArrayAdapter.clear()>
					}
					break;
				}
			} while(true);
		//   75  194:goto            59
		//   76  197:return          
		}

		final LogStreamActivity a;

		private a()
		{
			a = LogStreamActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field LogStreamActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void LogStreamUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public LogStreamActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void BaseFragmentActivity()>
		a = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #36  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void ArrayList()>
	//    6   12:putfield        #39  <Field List a>
		b = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #41  <Field ArrayAdapter b>
		h = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #43  <Field MissionSubsystem h>
		i = new a(((_cls1) (null)));
	//   13   25:aload_0         
	//   14   26:new             #10  <Class LogStreamActivity$a>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:aconst_null     
	//   18   32:invokespecial   #46  <Method void LogStreamActivity$a(LogStreamActivity, LogStreamActivity$1)>
	//   19   35:putfield        #48  <Field LogStreamActivity$a i>
	//   20   38:return          
	}

	protected void a(boolean flag)
	{
		g.setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field SwitchCompat g>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #58  <Method void SwitchCompat.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		g.setChecked(flag);
	//    4    8:aload_0         
	//    5    9:getfield        #52  <Field SwitchCompat g>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #61  <Method void SwitchCompat.setChecked(boolean)>
		g.setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #52  <Field SwitchCompat g>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #58  <Method void SwitchCompat.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
	//   12   24:return          
	}

	void e()
	{
		b(0x7f0f083a);
	//    0    0:aload_0         
	//    1    1:ldc1            #62  <Int 0x7f0f083a>
	//    2    3:invokevirtual   #65  <Method void b(int)>
		g = j.a(d, getString(0x7f0f02a3), ((android.widget.CompoundButton.OnCheckedChangeListener) (this)));
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:getfield        #67  <Field RelativeLayout d>
	//    6   11:aload_0         
	//    7   12:ldc1            #68  <Int 0x7f0f02a3>
	//    8   14:invokevirtual   #72  <Method String getString(int)>
	//    9   17:aload_0         
	//   10   18:invokestatic    #77  <Method SwitchCompat j.a(RelativeLayout, String, android.widget.CompoundButton$OnCheckedChangeListener)>
	//   11   21:putfield        #52  <Field SwitchCompat g>
		a(true);
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #79  <Method void a(boolean)>
		d.setVisibility(0);
	//   15   29:aload_0         
	//   16   30:getfield        #67  <Field RelativeLayout d>
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #84  <Method void RelativeLayout.setVisibility(int)>
		AssetInfo assetinfo = j.a(f).a();
	//   19   37:aload_0         
	//   20   38:getfield        #86  <Field String f>
	//   21   41:invokestatic    #89  <Method a j.a(String)>
	//   22   44:invokevirtual   #94  <Method AssetInfo a.a()>
	//   23   47:astore_1        
		h = Assembler.getInstance().getMissionSubsystem(assetinfo.getAssetId());
	//   24   48:aload_0         
	//   25   49:invokestatic    #100 <Method Assembler Assembler.getInstance()>
	//   26   52:aload_1         
	//   27   53:invokevirtual   #106 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   28   56:invokevirtual   #110 <Method MissionSubsystem Assembler.getMissionSubsystem(com.irobot.core.AssetId)>
	//   29   59:putfield        #43  <Field MissionSubsystem h>
		b = new ArrayAdapter(((android.content.Context) (this)), 0x1090003, a);
	//   30   62:aload_0         
	//   31   63:new             #112 <Class ArrayAdapter>
	//   32   66:dup             
	//   33   67:aload_0         
	//   34   68:ldc1            #113 <Int 0x1090003>
	//   35   70:aload_0         
	//   36   71:getfield        #39  <Field List a>
	//   37   74:invokespecial   #116 <Method void ArrayAdapter(android.content.Context, int, List)>
	//   38   77:putfield        #41  <Field ArrayAdapter b>
		c.setAdapter(((android.widget.ListAdapter) (b)));
	//   39   80:aload_0         
	//   40   81:getfield        #118 <Field ListView c>
	//   41   84:aload_0         
	//   42   85:getfield        #41  <Field ArrayAdapter b>
	//   43   88:invokevirtual   #124 <Method void ListView.setAdapter(android.widget.ListAdapter)>
		b.setNotifyOnChange(false);
	//   44   91:aload_0         
	//   45   92:getfield        #41  <Field ArrayAdapter b>
	//   46   95:iconst_0        
	//   47   96:invokevirtual   #127 <Method void ArrayAdapter.setNotifyOnChange(boolean)>
	//   48   99:return          
	}

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		if(compoundbutton == g)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #52  <Field SwitchCompat g>
	//*   3    5:if_acmpne       34
		{
			MissionSubsystem missionsubsystem = h;
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field MissionSubsystem h>
	//    6   12:astore_3        
			if(flag)
	//*   7   13:iload_2         
	//*   8   14:ifeq            24
				compoundbutton = ((CompoundButton) (MissionUIServiceCommand.EnableLogStream));
	//    9   17:getstatic       #135 <Field MissionUIServiceCommand MissionUIServiceCommand.EnableLogStream>
	//   10   20:astore_1        
			else
	//*  11   21:goto            28
				compoundbutton = ((CompoundButton) (MissionUIServiceCommand.DisableLogStream));
	//   12   24:getstatic       #138 <Field MissionUIServiceCommand MissionUIServiceCommand.DisableLogStream>
	//   13   27:astore_1        
			missionsubsystem.sendServiceCommand(((MissionUIServiceCommand) (compoundbutton)), ((MissionUIServiceData) (null)));
	//   14   28:aload_3         
	//   15   29:aload_1         
	//   16   30:aconst_null     
	//   17   31:invokevirtual   #144 <Method void MissionSubsystem.sendServiceCommand(MissionUIServiceCommand, MissionUIServiceData)>
		}
	//   18   34:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method void BaseFragmentActivity.onStart()>
		h.registerLogStreamSubscriber(((LogStreamUIServiceDataCallback) (i)));
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field MissionSubsystem h>
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field LogStreamActivity$a i>
	//    6   12:invokevirtual   #151 <Method boolean MissionSubsystem.registerLogStreamSubscriber(LogStreamUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void BaseFragmentActivity.onStop()>
		h.unregisterLogStreamSubscriber(((LogStreamUIServiceDataCallback) (i)));
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field MissionSubsystem h>
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field LogStreamActivity$a i>
	//    6   12:invokevirtual   #157 <Method boolean MissionSubsystem.unregisterLogStreamSubscriber(LogStreamUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	List a;
	protected ArrayAdapter b;
	ListView c;
	RelativeLayout d;
	Spinner e;
	String f;
	private SwitchCompat g;
	private MissionSubsystem h;
	private a i;
}
