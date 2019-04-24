// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.irobot.core.Assembler;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetNetworkUIService;
import com.irobot.core.AssetNetworkUIServiceData;
import com.irobot.core.AssetNetworkUIServiceDataCallback;
import com.irobot.core.AssetNetworkUIServiceDataState;
import com.irobot.core.ErrorReason;
import com.irobot.core.ErrorSource;
import com.irobot.core.FloorPlanListItem;
import com.irobot.core.FloorPlanListItemMode;
import com.irobot.core.MapsUIService;
import com.irobot.core.MapsUIServiceCommand;
import com.irobot.core.MapsUIServiceData;
import com.irobot.core.MapsUIServiceDataCallback;
import com.irobot.core.MapsViewState;
import com.irobot.core.NetworkState;
import com.irobot.core.PersistenceHandler;
import com.irobot.core.PersistentMapIdentifier;
import com.irobot.core.PersistentMapsDestination;
import com.irobot.home.q.b;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.util.ArrayList;
import java.util.Iterator;
import junit.b.a;

// Referenced classes of package com.irobot.home:
//			BasePushNotificationActivity, IRobotApplication, MapCustomizationIntroductionActivity_, MapCustomizationActivity_, 
//			a, TrainRobotActivity_, SmartMapTipsActivity_, RobotCleanActivity_

public class FloorPlanActivity extends BasePushNotificationActivity
{
	private class a extends MapsUIServiceDataCallback
	{

		public void onMapsUIServiceDataChanged(MapsUIServiceData mapsuiservicedata)
		{
			if(mapsuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				o.e(FloorPlanActivity.g(), "maps service data is null");
		//    2    4:invokestatic    #25  <Method String FloorPlanActivity.g()>
		//    3    7:ldc1            #27  <String "maps service data is null">
		//    4    9:invokestatic    #33  <Method void o.e(String, String)>
				return;
		//    5   12:return          
			}
			if(!a.isFinishing())
		//*   6   13:aload_0         
		//*   7   14:getfield        #12  <Field FloorPlanActivity a>
		//*   8   17:invokevirtual   #37  <Method boolean FloorPlanActivity.isFinishing()>
		//*   9   20:ifne            183
			{
				if(a.isDestroyed())
		//*  10   23:aload_0         
		//*  11   24:getfield        #12  <Field FloorPlanActivity a>
		//*  12   27:invokevirtual   #40  <Method boolean FloorPlanActivity.isDestroyed()>
		//*  13   30:ifeq            34
					return;
		//   14   33:return          
				Object obj = ((Object) (mapsuiservicedata.getMapsViewStates()));
		//   15   34:aload_1         
		//   16   35:invokevirtual   #46  <Method ArrayList MapsUIServiceData.getMapsViewStates()>
		//   17   38:astore_2        
				String s = FloorPlanActivity.g();
		//   18   39:invokestatic    #25  <Method String FloorPlanActivity.g()>
		//   19   42:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
		//   20   43:new             #48  <Class StringBuilder>
		//   21   46:dup             
		//   22   47:invokespecial   #49  <Method void StringBuilder()>
		//   23   50:astore          4
				stringbuilder.append("View states: ");
		//   24   52:aload           4
		//   25   54:ldc1            #51  <String "View states: ">
		//   26   56:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   27   59:pop             
				stringbuilder.append(((ArrayList) (obj)).toString());
		//   28   60:aload           4
		//   29   62:aload_2         
		//   30   63:invokevirtual   #60  <Method String ArrayList.toString()>
		//   31   66:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   32   69:pop             
				o.a(s, stringbuilder.toString());
		//   33   70:aload_3         
		//   34   71:aload           4
		//   35   73:invokevirtual   #61  <Method String StringBuilder.toString()>
		//   36   76:invokestatic    #63  <Method void o.a(String, String)>
				obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   37   79:aload_2         
		//   38   80:invokevirtual   #67  <Method Iterator ArrayList.iterator()>
		//   39   83:astore_2        
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break;
		//   40   84:aload_2         
		//   41   85:invokeinterface #72  <Method boolean Iterator.hasNext()>
		//   42   90:ifeq            183
					MapsViewState mapsviewstate = (MapsViewState)((Iterator) (obj)).next();
		//   43   93:aload_2         
		//   44   94:invokeinterface #76  <Method Object Iterator.next()>
		//   45   99:checkcast       #78  <Class MapsViewState>
		//   46  102:astore_3        
					static class _cls5
					{

						static final int a[];
						static final int b[];
						static final int c[];

						static 
						{
							c = new int[AssetNetworkUIServiceDataState.values().length];
						//    0    0:invokestatic    #20  <Method AssetNetworkUIServiceDataState[] AssetNetworkUIServiceDataState.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #22  <Field int[] c>
							try
							{
								c[AssetNetworkUIServiceDataState.RemoteConnectionState.ordinal()] = 1;
						//    4    9:getstatic       #22  <Field int[] c>
						//    5   12:getstatic       #26  <Field AssetNetworkUIServiceDataState AssetNetworkUIServiceDataState.RemoteConnectionState>
						//    6   15:invokevirtual   #30  <Method int AssetNetworkUIServiceDataState.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:invokestatic    #35  <Method MapsViewState[] MapsViewState.values()>
						//*  10   23:arraylength     
						//*  11   24:newarray        int[]
						//*  12   26:putstatic       #37  <Field int[] b>
						//*  13   29:getstatic       #37  <Field int[] b>
						//*  14   32:getstatic       #41  <Field MapsViewState MapsViewState.FloorPlanNavigation>
						//*  15   35:invokevirtual   #42  <Method int MapsViewState.ordinal()>
						//*  16   38:iconst_1        
						//*  17   39:iastore         
						//*  18   40:getstatic       #37  <Field int[] b>
						//*  19   43:getstatic       #45  <Field MapsViewState MapsViewState.FloorPlanError>
						//*  20   46:invokevirtual   #42  <Method int MapsViewState.ordinal()>
						//*  21   49:iconst_2        
						//*  22   50:iastore         
						//*  23   51:invokestatic    #50  <Method PersistentMapsDestination[] PersistentMapsDestination.values()>
						//*  24   54:arraylength     
						//*  25   55:newarray        int[]
						//*  26   57:putstatic       #52  <Field int[] a>
						//*  27   60:getstatic       #52  <Field int[] a>
						//*  28   63:getstatic       #56  <Field PersistentMapsDestination PersistentMapsDestination.MapCustomizaton>
						//*  29   66:invokevirtual   #57  <Method int PersistentMapsDestination.ordinal()>
						//*  30   69:iconst_1        
						//*  31   70:iastore         
						//*  32   71:getstatic       #52  <Field int[] a>
						//*  33   74:getstatic       #60  <Field PersistentMapsDestination PersistentMapsDestination.FloorPlans>
						//*  34   77:invokevirtual   #57  <Method int PersistentMapsDestination.ordinal()>
						//*  35   80:iconst_2        
						//*  36   81:iastore         
						//*  37   82:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   38   83:astore_0        
							b = new int[MapsViewState.values().length];
							try
							{
								b[MapsViewState.FloorPlanNavigation.ordinal()] = 1;
							}
						//*  39   84:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   40   87:astore_0        
							try
							{
								b[MapsViewState.FloorPlanError.ordinal()] = 2;
							}
						//*  41   88:goto            40
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   42   91:astore_0        
							a = new int[PersistentMapsDestination.values().length];
							try
							{
								a[PersistentMapsDestination.MapCustomizaton.ordinal()] = 1;
							}
						//*  43   92:goto            51
							catch(NoSuchFieldError nosuchfielderror3) { }
						//   44   95:astore_0        
							try
							{
								a[PersistentMapsDestination.FloorPlans.ordinal()] = 2;
							}
						//*  45   96:goto            71
							catch(NoSuchFieldError nosuchfielderror4) { }
						//   46   99:astore_0        
						//*  47  100:return          
						}
					}

					switch(com.irobot.home._cls5.b[mapsviewstate.ordinal()])
		//*  47  103:getstatic       #84  <Field int[] com.irobot.home.FloorPlanActivity$5.b>
		//*  48  106:aload_3         
		//*  49  107:invokevirtual   #88  <Method int MapsViewState.ordinal()>
		//*  50  110:iaload          
					{
		//*  51  111:tableswitch     1 2: default 132
		//		               1 161
		//		               2 135
		//*  52  132:goto            84
					case 2: // '\002'
						com.irobot.home.FloorPlanActivity.a(a, mapsuiservicedata.getErrorReason(), mapsuiservicedata.getErrorSource(), mapsuiservicedata.getLocalizedErrorMessageKey(), mapsuiservicedata.getNonLocalizedErrorMessage());
		//   53  135:aload_0         
		//   54  136:getfield        #12  <Field FloorPlanActivity a>
		//   55  139:aload_1         
		//   56  140:invokevirtual   #92  <Method ErrorReason MapsUIServiceData.getErrorReason()>
		//   57  143:aload_1         
		//   58  144:invokevirtual   #96  <Method ErrorSource MapsUIServiceData.getErrorSource()>
		//   59  147:aload_1         
		//   60  148:invokevirtual   #99  <Method String MapsUIServiceData.getLocalizedErrorMessageKey()>
		//   61  151:aload_1         
		//   62  152:invokevirtual   #102 <Method String MapsUIServiceData.getNonLocalizedErrorMessage()>
		//   63  155:invokestatic    #105 <Method void com.irobot.home.FloorPlanActivity.a(FloorPlanActivity, ErrorReason, ErrorSource, String, String)>
						break;

		//*  64  158:goto            84
					case 1: // '\001'
						com.irobot.home.FloorPlanActivity.a(a, mapsuiservicedata.getFloorPlanMapsDestination(), mapsuiservicedata.getFloorPlanMapsId(), mapsuiservicedata.getFloorPlanItem());
		//   65  161:aload_0         
		//   66  162:getfield        #12  <Field FloorPlanActivity a>
		//   67  165:aload_1         
		//   68  166:invokevirtual   #109 <Method PersistentMapsDestination MapsUIServiceData.getFloorPlanMapsDestination()>
		//   69  169:aload_1         
		//   70  170:invokevirtual   #113 <Method PersistentMapIdentifier MapsUIServiceData.getFloorPlanMapsId()>
		//   71  173:aload_1         
		//   72  174:invokevirtual   #117 <Method FloorPlanListItem MapsUIServiceData.getFloorPlanItem()>
		//   73  177:invokestatic    #120 <Method void com.irobot.home.FloorPlanActivity.a(FloorPlanActivity, PersistentMapsDestination, PersistentMapIdentifier, FloorPlanListItem)>
						break;
					}
				} while(true);
		//   74  180:goto            84
			}
		//   75  183:return          
		}

		final FloorPlanActivity a;

		private a()
		{
			a = FloorPlanActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field FloorPlanActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void MapsUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public FloorPlanActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void BasePushNotificationActivity()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class FloorPlanActivity$4>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #46  <Method void FloorPlanActivity$4(FloorPlanActivity)>
	//    7   13:putfield        #48  <Field AssetNetworkUIServiceDataCallback k>
	//    8   16:return          
	}

	private void a(ErrorReason errorreason, ErrorSource errorsource, String s, String s1)
	{
		boolean flag;
		if(errorsource == ErrorSource.FloorPlanPresenter)
	//*   0    0:aload_2         
	//*   1    1:getstatic       #55  <Field ErrorSource ErrorSource.FloorPlanPresenter>
	//*   2    4:if_acmpne       13
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore          5
		else
	//*   5   10:goto            16
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore          5
		junit.b.a.a("Error source expected to be FloorPlanPresenter", flag);
	//    8   16:ldc1            #57  <String "Error source expected to be FloorPlanPresenter">
	//    9   18:iload           5
	//   10   20:invokestatic    #62  <Method void a.a(String, boolean)>
		if(errorreason == ErrorReason.Timeout)
	//*  11   23:aload_1         
	//*  12   24:getstatic       #68  <Field ErrorReason ErrorReason.Timeout>
	//*  13   27:if_acmpne       73
		{
			o.a(f, "Received timeout error in FloorPlanActivity.");
	//   14   30:getstatic       #70  <Field String f>
	//   15   33:ldc1            #72  <String "Received timeout error in FloorPlanActivity.">
	//   16   35:invokestatic    #77  <Method void o.a(String, String)>
			errorreason = ((ErrorReason) ((new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f0960)));
	//   17   38:new             #79  <Class android.app.AlertDialog$Builder>
	//   18   41:dup             
	//   19   42:aload_0         
	//   20   43:invokespecial   #82  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   21   46:ldc1            #83  <Int 0x7f0f0960>
	//   22   48:invokevirtual   #87  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   23   51:astore_1        
			errorsource = ((ErrorSource) (new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int l)
				{
					((RobotCleanActivity_.a)com.irobot.home.RobotCleanActivity_.a(((android.content.Context) (a))).g(0x4000000)).a();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field FloorPlanActivity a>
				//    2    4:invokestatic    #27  <Method RobotCleanActivity_$a com.irobot.home.RobotCleanActivity_.a(android.content.Context)>
				//    3    7:ldc1            #28  <Int 0x4000000>
				//    4    9:invokevirtual   #34  <Method org.androidannotations.api.a.d RobotCleanActivity_$a.g(int)>
				//    5   12:checkcast       #30  <Class RobotCleanActivity_$a>
				//    6   15:invokevirtual   #37  <Method org.androidannotations.api.a.e com.irobot.home.RobotCleanActivity_$a.a()>
				//    7   18:pop             
				//    8   19:return          
				}

				final FloorPlanActivity a;

			
			{
				a = FloorPlanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field FloorPlanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
));
	//   24   52:new             #8   <Class FloorPlanActivity$2>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:invokespecial   #88  <Method void FloorPlanActivity$2(FloorPlanActivity)>
	//   28   60:astore_2        
		} else
	//*  29   61:aload_1         
	//*  30   62:ldc1            #89  <Int 0x7f0f05bb>
	//*  31   64:aload_2         
	//*  32   65:invokevirtual   #93  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//*  33   68:invokevirtual   #97  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//*  34   71:pop             
	//*  35   72:return          
		if(errorreason == ErrorReason.UnsupportedVersion)
	//*  36   73:aload_1         
	//*  37   74:getstatic       #100 <Field ErrorReason ErrorReason.UnsupportedVersion>
	//*  38   77:if_acmpne       123
		{
			o.a(f, "Received unsupported version error in FloorPlanActivity.");
	//   39   80:getstatic       #70  <Field String f>
	//   40   83:ldc1            #102 <String "Received unsupported version error in FloorPlanActivity.">
	//   41   85:invokestatic    #77  <Method void o.a(String, String)>
			errorreason = ((ErrorReason) ((new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setTitle(0x7f0f04c4).setMessage(0x7f0f04c5).setCancelable(false)));
	//   42   88:new             #79  <Class android.app.AlertDialog$Builder>
	//   43   91:dup             
	//   44   92:aload_0         
	//   45   93:invokespecial   #82  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   46   96:ldc1            #103 <Int 0x7f0f04c4>
	//   47   98:invokevirtual   #106 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   48  101:ldc1            #107 <Int 0x7f0f04c5>
	//   49  103:invokevirtual   #87  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   50  106:iconst_0        
	//   51  107:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
	//   52  110:astore_1        
			errorsource = ((ErrorSource) (new android.content.DialogInterface.OnClickListener() {

				public void onClick(DialogInterface dialoginterface, int l)
				{
					((RobotCleanActivity_.a)com.irobot.home.RobotCleanActivity_.a(((android.content.Context) (a))).g(0x4000000)).a();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field FloorPlanActivity a>
				//    2    4:invokestatic    #27  <Method RobotCleanActivity_$a com.irobot.home.RobotCleanActivity_.a(android.content.Context)>
				//    3    7:ldc1            #28  <Int 0x4000000>
				//    4    9:invokevirtual   #34  <Method org.androidannotations.api.a.d RobotCleanActivity_$a.g(int)>
				//    5   12:checkcast       #30  <Class RobotCleanActivity_$a>
				//    6   15:invokevirtual   #37  <Method org.androidannotations.api.a.e com.irobot.home.RobotCleanActivity_$a.a()>
				//    7   18:pop             
				//    8   19:return          
				}

				final FloorPlanActivity a;

			
			{
				a = FloorPlanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field FloorPlanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
));
	//   53  111:new             #10  <Class FloorPlanActivity$3>
	//   54  114:dup             
	//   55  115:aload_0         
	//   56  116:invokespecial   #112 <Method void FloorPlanActivity$3(FloorPlanActivity)>
	//   57  119:astore_2        
		} else
	//*  58  120:goto            61
		{
			o.d(f, "Encountered unhandled error in FloorPlanActivity.");
	//   59  123:getstatic       #70  <Field String f>
	//   60  126:ldc1            #114 <String "Encountered unhandled error in FloorPlanActivity.">
	//   61  128:invokestatic    #116 <Method void o.d(String, String)>
			return;
	//   62  131:return          
		}
		((android.app.AlertDialog.Builder) (errorreason)).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (errorsource))).show();
	}

	private void a(PersistentMapsDestination persistentmapsdestination, PersistentMapIdentifier persistentmapidentifier, FloorPlanListItem floorplanlistitem)
	{
		switch(com.irobot.home._cls5.a[persistentmapsdestination.ordinal()])
	//*   0    0:getstatic       #120 <Field int[] com.irobot.home.FloorPlanActivity$5.a>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #126 <Method int PersistentMapsDestination.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 2: default 32
	//	               1 46
	//	               2 35
	//*   5   32:goto            253
		case 2: // '\002'
			o.b(f, "Floor plan mode");
	//    6   35:getstatic       #70  <Field String f>
	//    7   38:ldc1            #128 <String "Floor plan mode">
	//    8   40:invokestatic    #130 <Method void o.b(String, String)>
			break;

	//*   9   43:goto            253
		case 1: // '\001'
			a.a(persistentmapidentifier);
	//   10   46:aload_0         
	//   11   47:getfield        #132 <Field IRobotApplication a>
	//   12   50:aload_2         
	//   13   51:invokevirtual   #137 <Method void com.irobot.home.IRobotApplication.a(PersistentMapIdentifier)>
			if(floorplanlistitem == null)
	//*  14   54:aload_3         
	//*  15   55:ifnonnull       67
			{
				o.e(f, "The associated floor item is null!");
	//   16   58:getstatic       #70  <Field String f>
	//   17   61:ldc1            #139 <String "The associated floor item is null!">
	//   18   63:invokestatic    #141 <Method void o.e(String, String)>
				return;
	//   19   66:return          
			}
			int l = floorplanlistitem.getMapNumber();
	//   20   67:aload_3         
	//   21   68:invokevirtual   #146 <Method int FloorPlanListItem.getMapNumber()>
	//   22   71:istore          4
			int i1 = floorplanlistitem.getLearningPercent();
	//   23   73:aload_3         
	//   24   74:invokevirtual   #149 <Method int FloorPlanListItem.getLearningPercent()>
	//   25   77:istore          5
			boolean flag = Assembler.getInstance().getPersistenceHandler().readBool("mapCustomizationStartHintsSeen", false);
	//   26   79:invokestatic    #155 <Method Assembler Assembler.getInstance()>
	//   27   82:invokevirtual   #159 <Method PersistenceHandler Assembler.getPersistenceHandler()>
	//   28   85:ldc1            #161 <String "mapCustomizationStartHintsSeen">
	//   29   87:iconst_0        
	//   30   88:invokevirtual   #167 <Method boolean PersistenceHandler.readBool(String, boolean)>
	//   31   91:istore          6
			if(floorplanlistitem.getMode() == FloorPlanListItemMode.ReadyForSetup && !flag)
	//*  32   93:aload_3         
	//*  33   94:invokevirtual   #171 <Method FloorPlanListItemMode FloorPlanListItem.getMode()>
	//*  34   97:getstatic       #177 <Field FloorPlanListItemMode FloorPlanListItemMode.ReadyForSetup>
	//*  35  100:if_acmpne       211
	//*  36  103:iload           6
	//*  37  105:ifne            211
			{
				persistentmapsdestination = ((PersistentMapsDestination) (new ArrayList()));
	//   38  108:new             #179 <Class ArrayList>
	//   39  111:dup             
	//   40  112:invokespecial   #180 <Method void ArrayList()>
	//   41  115:astore_1        
				((ArrayList) (persistentmapsdestination)).add(((Object) (getString(0x7f0f0938, new Object[] {
					com.irobot.home.util.j.a(b).a().getName()
				}))));
	//   42  116:aload_1         
	//   43  117:aload_0         
	//   44  118:ldc1            #181 <Int 0x7f0f0938>
	//   45  120:iconst_1        
	//   46  121:anewarray       Object[]
	//   47  124:dup             
	//   48  125:iconst_0        
	//   49  126:aload_0         
	//   50  127:getfield        #185 <Field String b>
	//   51  130:invokestatic    #190 <Method com.irobot.home.model.a j.a(String)>
	//   52  133:invokevirtual   #195 <Method AssetInfo com.irobot.home.model.a.a()>
	//   53  136:invokevirtual   #201 <Method String AssetInfo.getName()>
	//   54  139:aastore         
	//   55  140:invokevirtual   #205 <Method String getString(int, Object[])>
	//   56  143:invokevirtual   #209 <Method boolean ArrayList.add(Object)>
	//   57  146:pop             
				com.irobot.home.MapCustomizationIntroductionActivity_.a(((android.content.Context) (this))).a(b).b(0x7f0f061a).c(0x7f0e0215).a(false).b(true).a(((ArrayList) (persistentmapsdestination))).d(0x7f0f0687).c(true).e(l).f(i1).d(j).a();
	//   58  147:aload_0         
	//   59  148:invokestatic    #214 <Method MapCustomizationIntroductionActivity_$a com.irobot.home.MapCustomizationIntroductionActivity_.a(android.content.Context)>
	//   60  151:aload_0         
	//   61  152:getfield        #185 <Field String b>
	//   62  155:invokevirtual   #219 <Method MapCustomizationIntroductionActivity_$a com.irobot.home.MapCustomizationIntroductionActivity_$a.a(String)>
	//   63  158:ldc1            #220 <Int 0x7f0f061a>
	//   64  160:invokevirtual   #223 <Method MapCustomizationIntroductionActivity_$a com.irobot.home.MapCustomizationIntroductionActivity_$a.b(int)>
	//   65  163:ldc1            #224 <Int 0x7f0e0215>
	//   66  165:invokevirtual   #226 <Method MapCustomizationIntroductionActivity_$a MapCustomizationIntroductionActivity_$a.c(int)>
	//   67  168:iconst_0        
	//   68  169:invokevirtual   #229 <Method MapCustomizationIntroductionActivity_$a com.irobot.home.MapCustomizationIntroductionActivity_$a.a(boolean)>
	//   69  172:iconst_1        
	//   70  173:invokevirtual   #231 <Method MapCustomizationIntroductionActivity_$a com.irobot.home.MapCustomizationIntroductionActivity_$a.b(boolean)>
	//   71  176:aload_1         
	//   72  177:invokevirtual   #234 <Method MapCustomizationIntroductionActivity_$a com.irobot.home.MapCustomizationIntroductionActivity_$a.a(ArrayList)>
	//   73  180:ldc1            #235 <Int 0x7f0f0687>
	//   74  182:invokevirtual   #237 <Method MapCustomizationIntroductionActivity_$a MapCustomizationIntroductionActivity_$a.d(int)>
	//   75  185:iconst_1        
	//   76  186:invokevirtual   #239 <Method MapCustomizationIntroductionActivity_$a MapCustomizationIntroductionActivity_$a.c(boolean)>
	//   77  189:iload           4
	//   78  191:invokevirtual   #241 <Method MapCustomizationIntroductionActivity_$a MapCustomizationIntroductionActivity_$a.e(int)>
	//   79  194:iload           5
	//   80  196:invokevirtual   #243 <Method MapCustomizationIntroductionActivity_$a MapCustomizationIntroductionActivity_$a.f(int)>
	//   81  199:aload_0         
	//   82  200:getfield        #245 <Field boolean j>
	//   83  203:invokevirtual   #247 <Method MapCustomizationIntroductionActivity_$a MapCustomizationIntroductionActivity_$a.d(boolean)>
	//   84  206:invokevirtual   #250 <Method org.androidannotations.api.a.e com.irobot.home.MapCustomizationIntroductionActivity_$a.a()>
	//   85  209:pop             
				return;
	//   86  210:return          
			} else
			{
				((MapCustomizationActivity_.a)com.irobot.home.MapCustomizationActivity_.a(((android.content.Context) (this))).a(b).b(l).c(i1).a(j).g(0x10000)).a();
	//   87  211:aload_0         
	//   88  212:invokestatic    #255 <Method MapCustomizationActivity_$a com.irobot.home.MapCustomizationActivity_.a(android.content.Context)>
	//   89  215:aload_0         
	//   90  216:getfield        #185 <Field String b>
	//   91  219:invokevirtual   #260 <Method MapCustomizationActivity_$a com.irobot.home.MapCustomizationActivity_$a.a(String)>
	//   92  222:iload           4
	//   93  224:invokevirtual   #263 <Method MapCustomizationActivity_$a com.irobot.home.MapCustomizationActivity_$a.b(int)>
	//   94  227:iload           5
	//   95  229:invokevirtual   #265 <Method MapCustomizationActivity_$a MapCustomizationActivity_$a.c(int)>
	//   96  232:aload_0         
	//   97  233:getfield        #245 <Field boolean j>
	//   98  236:invokevirtual   #268 <Method MapCustomizationActivity_$a com.irobot.home.MapCustomizationActivity_$a.a(boolean)>
	//   99  239:ldc2            #269 <Int 0x10000>
	//  100  242:invokevirtual   #272 <Method org.androidannotations.api.a.d MapCustomizationActivity_$a.g(int)>
	//  101  245:checkcast       #257 <Class MapCustomizationActivity_$a>
	//  102  248:invokevirtual   #273 <Method org.androidannotations.api.a.e com.irobot.home.MapCustomizationActivity_$a.a()>
	//  103  251:pop             
				return;
	//  104  252:return          
			}
		}
		o.e(f, "Encountered unexpected pmap destination in navigation delegate");
	//  105  253:getstatic       #70  <Field String f>
	//  106  256:ldc2            #275 <String "Encountered unexpected pmap destination in navigation delegate">
	//  107  259:invokestatic    #141 <Method void o.e(String, String)>
	//  108  262:return          
	}

	static void a(FloorPlanActivity floorplanactivity, ErrorReason errorreason, ErrorSource errorsource, String s, String s1)
	{
		floorplanactivity.a(errorreason, errorsource, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #278 <Method void a(ErrorReason, ErrorSource, String, String)>
	//    6    9:return          
	}

	static void a(FloorPlanActivity floorplanactivity, PersistentMapsDestination persistentmapsdestination, PersistentMapIdentifier persistentmapidentifier, FloorPlanListItem floorplanlistitem)
	{
		floorplanactivity.a(persistentmapsdestination, persistentmapidentifier, floorplanlistitem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #281 <Method void a(PersistentMapsDestination, PersistentMapIdentifier, FloorPlanListItem)>
	//    5    7:return          
	}

	static String g()
	{
		return f;
	//    0    0:getstatic       #70  <Field String f>
	//    1    3:areturn         
	}

	public void e()
	{
		if(!com.irobot.home.util.j.j().a().isVirtual() && !com.irobot.home.util.j.a())
	//*   0    0:invokestatic    #284 <Method com.irobot.home.model.a j.j()>
	//*   1    3:invokevirtual   #195 <Method AssetInfo com.irobot.home.model.a.a()>
	//*   2    6:invokevirtual   #288 <Method boolean AssetInfo.isVirtual()>
	//*   3    9:ifne            31
	//*   4   12:invokestatic    #290 <Method boolean j.a()>
	//*   5   15:ifne            31
		{
			com.irobot.home.util.j.b(((android.app.Activity) (this)));
	//    6   18:aload_0         
	//    7   19:invokestatic    #293 <Method void j.b(android.app.Activity)>
			e.setVisibility(4);
	//    8   22:aload_0         
	//    9   23:getfield        #295 <Field ImageView e>
	//   10   26:iconst_4        
	//   11   27:invokevirtual   #301 <Method void ImageView.setVisibility(int)>
			return;
	//   12   30:return          
		}
		h = Assembler.getInstance().getNetworkUIService(AssetId.assetIdForString(b));
	//   13   31:aload_0         
	//   14   32:invokestatic    #155 <Method Assembler Assembler.getInstance()>
	//   15   35:aload_0         
	//   16   36:getfield        #185 <Field String b>
	//   17   39:invokestatic    #307 <Method AssetId AssetId.assetIdForString(String)>
	//   18   42:invokevirtual   #311 <Method AssetNetworkUIService Assembler.getNetworkUIService(AssetId)>
	//   19   45:putfield        #313 <Field AssetNetworkUIService h>
		e.setVisibility(0);
	//   20   48:aload_0         
	//   21   49:getfield        #295 <Field ImageView e>
	//   22   52:iconst_0        
	//   23   53:invokevirtual   #301 <Method void ImageView.setVisibility(int)>
		if(v())
	//*  24   56:aload_0         
	//*  25   57:invokevirtual   #316 <Method boolean v()>
	//*  26   60:ifeq            127
		{
			b(0x7f0f0431);
	//   27   63:aload_0         
	//   28   64:ldc2            #317 <Int 0x7f0f0431>
	//   29   67:invokevirtual   #319 <Method void b(int)>
			junit.b.a.a("pmapId is missing!", com.irobot.home.util.j.i(c));
	//   30   70:ldc2            #321 <String "pmapId is missing!">
	//   31   73:aload_0         
	//   32   74:getfield        #323 <Field String c>
	//   33   77:invokestatic    #326 <Method boolean j.i(String)>
	//   34   80:invokestatic    #62  <Method void a.a(String, boolean)>
			junit.b.a.a("pmapVersionId is missing!", com.irobot.home.util.j.i(d));
	//   35   83:ldc2            #328 <String "pmapVersionId is missing!">
	//   36   86:aload_0         
	//   37   87:getfield        #330 <Field String d>
	//   38   90:invokestatic    #326 <Method boolean j.i(String)>
	//   39   93:invokestatic    #62  <Method void a.a(String, boolean)>
			r.c(b);
	//   40   96:aload_0         
	//   41   97:getfield        #334 <Field b r>
	//   42  100:aload_0         
	//   43  101:getfield        #185 <Field String b>
	//   44  104:invokevirtual   #339 <Method void b.c(String)>
			h.registerUISubscriber(k);
	//   45  107:aload_0         
	//   46  108:getfield        #313 <Field AssetNetworkUIService h>
	//   47  111:aload_0         
	//   48  112:getfield        #48  <Field AssetNetworkUIServiceDataCallback k>
	//   49  115:invokevirtual   #345 <Method boolean AssetNetworkUIService.registerUISubscriber(AssetNetworkUIServiceDataCallback)>
	//   50  118:pop             
			j = true;
	//   51  119:aload_0         
	//   52  120:iconst_1        
	//   53  121:putfield        #245 <Field boolean j>
		} else
	//*  54  124:goto            199
		{
			if(h.getServiceData().getConnectionStateForRemote() != NetworkState.Connected)
	//*  55  127:aload_0         
	//*  56  128:getfield        #313 <Field AssetNetworkUIService h>
	//*  57  131:invokevirtual   #349 <Method AssetNetworkUIServiceData AssetNetworkUIService.getServiceData()>
	//*  58  134:invokevirtual   #355 <Method NetworkState AssetNetworkUIServiceData.getConnectionStateForRemote()>
	//*  59  137:getstatic       #361 <Field NetworkState NetworkState.Connected>
	//*  60  140:if_acmpeq       156
			{
				o.c(f, "Remote not connected, forcing the user back to Clean Activity.");
	//   61  143:getstatic       #70  <Field String f>
	//   62  146:ldc2            #363 <String "Remote not connected, forcing the user back to Clean Activity.">
	//   63  149:invokestatic    #365 <Method void o.c(String, String)>
				com.irobot.home.util.j.a(((android.app.Activity) (this)));
	//   64  152:aload_0         
	//   65  153:invokestatic    #367 <Method void j.a(android.app.Activity)>
			}
			b(0x7f0f084d);
	//   66  156:aload_0         
	//   67  157:ldc2            #368 <Int 0x7f0f084d>
	//   68  160:invokevirtual   #319 <Method void b(int)>
			FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
	//   69  163:aload_0         
	//   70  164:invokevirtual   #372 <Method FragmentManager getSupportFragmentManager()>
	//   71  167:invokevirtual   #378 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   72  170:astore_1        
			fragmenttransaction.add(0x7f090191, ((android.support.v4.app.Fragment) (com.irobot.home.a.a(b))));
	//   73  171:aload_1         
	//   74  172:ldc2            #379 <Int 0x7f090191>
	//   75  175:aload_0         
	//   76  176:getfield        #185 <Field String b>
	//   77  179:invokestatic    #384 <Method com.irobot.home.a com.irobot.home.a.a(String)>
	//   78  182:invokevirtual   #389 <Method FragmentTransaction FragmentTransaction.add(int, android.support.v4.app.Fragment)>
	//   79  185:pop             
			fragmenttransaction.commit();
	//   80  186:aload_1         
	//   81  187:invokevirtual   #392 <Method int FragmentTransaction.commit()>
	//   82  190:pop             
			getSupportFragmentManager().executePendingTransactions();
	//   83  191:aload_0         
	//   84  192:invokevirtual   #372 <Method FragmentManager getSupportFragmentManager()>
	//   85  195:invokevirtual   #395 <Method boolean FragmentManager.executePendingTransactions()>
	//   86  198:pop             
		}
		g = Assembler.getInstance().getMapsUIService(AssetId.assetIdForString(b));
	//   87  199:aload_0         
	//   88  200:invokestatic    #155 <Method Assembler Assembler.getInstance()>
	//   89  203:aload_0         
	//   90  204:getfield        #185 <Field String b>
	//   91  207:invokestatic    #307 <Method AssetId AssetId.assetIdForString(String)>
	//   92  210:invokevirtual   #399 <Method MapsUIService Assembler.getMapsUIService(AssetId)>
	//   93  213:putfield        #401 <Field MapsUIService g>
		i = new a();
	//   94  216:aload_0         
	//   95  217:new             #16  <Class FloorPlanActivity$a>
	//   96  220:dup             
	//   97  221:aload_0         
	//   98  222:aconst_null     
	//   99  223:invokespecial   #404 <Method void FloorPlanActivity$a(FloorPlanActivity, FloorPlanActivity$1)>
	//  100  226:putfield        #406 <Field FloorPlanActivity$a i>
	//  101  229:return          
	}

	public void f()
	{
		PopupMenu popupmenu = new PopupMenu(((android.content.Context) (this)), ((android.view.View) (e)));
	//    0    0:new             #408 <Class PopupMenu>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #295 <Field ImageView e>
	//    5    9:invokespecial   #411 <Method void PopupMenu(android.content.Context, android.view.View)>
	//    6   12:astore_1        
		popupmenu.getMenuInflater().inflate(0x7f0c0002, popupmenu.getMenu());
	//    7   13:aload_1         
	//    8   14:invokevirtual   #415 <Method MenuInflater PopupMenu.getMenuInflater()>
	//    9   17:ldc2            #416 <Int 0x7f0c0002>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #420 <Method android.view.Menu PopupMenu.getMenu()>
	//   12   24:invokevirtual   #426 <Method void MenuInflater.inflate(int, android.view.Menu)>
		popupmenu.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() {

			public boolean onMenuItemClick(MenuItem menuitem)
			{
				int l = menuitem.getItemId();
			//    0    0:aload_1         
			//    1    1:invokeinterface #28  <Method int MenuItem.getItemId()>
			//    2    6:istore_2        
				if(l != 0x7f090255)
			//*   3    7:iload_2         
			//*   4    8:ldc1            #29  <Int 0x7f090255>
			//*   5   10:icmpeq          40
				{
					if(l == 0x7f090259)
			//*   6   13:iload_2         
			//*   7   14:ldc1            #30  <Int 0x7f090259>
			//*   8   16:icmpeq          22
			//*   9   19:goto            51
						com.irobot.home.TrainRobotActivity_.a(((android.content.Context) (a))).a(false).a();
			//   10   22:aload_0         
			//   11   23:getfield        #17  <Field FloorPlanActivity a>
			//   12   26:invokestatic    #35  <Method TrainRobotActivity_$a com.irobot.home.TrainRobotActivity_.a(android.content.Context)>
			//   13   29:iconst_0        
			//   14   30:invokevirtual   #40  <Method TrainRobotActivity_$a com.irobot.home.TrainRobotActivity_$a.a(boolean)>
			//   15   33:invokevirtual   #43  <Method org.androidannotations.api.a.e com.irobot.home.TrainRobotActivity_$a.a()>
			//   16   36:pop             
				} else
			//*  17   37:goto            51
				{
					com.irobot.home.SmartMapTipsActivity_.a(((android.content.Context) (a))).a();
			//   18   40:aload_0         
			//   19   41:getfield        #17  <Field FloorPlanActivity a>
			//   20   44:invokestatic    #48  <Method SmartMapTipsActivity_$a com.irobot.home.SmartMapTipsActivity_.a(android.content.Context)>
			//   21   47:invokevirtual   #51  <Method org.androidannotations.api.a.e com.irobot.home.SmartMapTipsActivity_$a.a()>
			//   22   50:pop             
				}
				return true;
			//   23   51:iconst_1        
			//   24   52:ireturn         
			}

			final FloorPlanActivity a;

			
			{
				a = FloorPlanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FloorPlanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   13   27:aload_1         
	//   14   28:new             #6   <Class FloorPlanActivity$1>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #427 <Method void FloorPlanActivity$1(FloorPlanActivity)>
	//   18   36:invokevirtual   #431 <Method void PopupMenu.setOnMenuItemClickListener(android.widget.PopupMenu$OnMenuItemClickListener)>
		popupmenu.show();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #433 <Method void PopupMenu.show()>
	//   21   43:return          
	}

	protected void onActivityResult(int l, int i1, Intent intent)
	{
		super.onActivityResult(l, i1, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #437 <Method void BasePushNotificationActivity.onActivityResult(int, int, Intent)>
		if(v())
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #316 <Method boolean v()>
	//*   7   11:ifeq            18
			onBackPressed();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #440 <Method void onBackPressed()>
	//   10   18:return          
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #443 <Method void BasePushNotificationActivity.onDestroy()>
	//    2    4:return          
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #446 <Method void BasePushNotificationActivity.onPause()>
		g.unregisterSubscriber(((MapsUIServiceDataCallback) (i)));
	//    2    4:aload_0         
	//    3    5:getfield        #401 <Field MapsUIService g>
	//    4    8:aload_0         
	//    5    9:getfield        #406 <Field FloorPlanActivity$a i>
	//    6   12:invokevirtual   #452 <Method boolean MapsUIService.unregisterSubscriber(MapsUIServiceDataCallback)>
	//    7   15:pop             
		h.unregisterSubscriber(k);
	//    8   16:aload_0         
	//    9   17:getfield        #313 <Field AssetNetworkUIService h>
	//   10   20:aload_0         
	//   11   21:getfield        #48  <Field AssetNetworkUIServiceDataCallback k>
	//   12   24:invokevirtual   #454 <Method boolean AssetNetworkUIService.unregisterSubscriber(AssetNetworkUIServiceDataCallback)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void onRemoteConnectionStateChanged(NetworkState networkstate)
	{
		if(NetworkState.Connected == networkstate)
	//*   0    0:getstatic       #361 <Field NetworkState NetworkState.Connected>
	//*   1    3:aload_1         
	//*   2    4:if_acmpne       50
		{
			h.unregisterSubscriber(k);
	//    3    7:aload_0         
	//    4    8:getfield        #313 <Field AssetNetworkUIService h>
	//    5   11:aload_0         
	//    6   12:getfield        #48  <Field AssetNetworkUIServiceDataCallback k>
	//    7   15:invokevirtual   #454 <Method boolean AssetNetworkUIService.unregisterSubscriber(AssetNetworkUIServiceDataCallback)>
	//    8   18:pop             
			networkstate = ((NetworkState) (MapsUIServiceData.create()));
	//    9   19:invokestatic    #463 <Method MapsUIServiceData MapsUIServiceData.create()>
	//   10   22:astore_1        
			((MapsUIServiceData) (networkstate)).setFloorPlanListMapId(c);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #323 <Field String c>
	//   14   28:invokevirtual   #466 <Method void MapsUIServiceData.setFloorPlanListMapId(String)>
			((MapsUIServiceData) (networkstate)).setFloorPlanListMapVersionId(d);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #330 <Field String d>
	//   18   36:invokevirtual   #469 <Method void MapsUIServiceData.setFloorPlanListMapVersionId(String)>
			g.sendCommand(MapsUIServiceCommand.QueryFloorPlanListItem, ((MapsUIServiceData) (networkstate)));
	//   19   39:aload_0         
	//   20   40:getfield        #401 <Field MapsUIService g>
	//   21   43:getstatic       #475 <Field MapsUIServiceCommand MapsUIServiceCommand.QueryFloorPlanListItem>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #479 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
		}
	//   24   50:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #483 <Method void BasePushNotificationActivity.onResume()>
		g.registerUISubscriber(((MapsUIServiceDataCallback) (i)));
	//    2    4:aload_0         
	//    3    5:getfield        #401 <Field MapsUIService g>
	//    4    8:aload_0         
	//    5    9:getfield        #406 <Field FloorPlanActivity$a i>
	//    6   12:invokevirtual   #485 <Method boolean MapsUIService.registerUISubscriber(MapsUIServiceDataCallback)>
	//    7   15:pop             
		android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentById(0x7f090191);
	//    8   16:aload_0         
	//    9   17:invokevirtual   #372 <Method FragmentManager getSupportFragmentManager()>
	//   10   20:ldc2            #379 <Int 0x7f090191>
	//   11   23:invokevirtual   #489 <Method android.support.v4.app.Fragment FragmentManager.findFragmentById(int)>
	//   12   26:astore_1        
		if(fragment != null)
	//*  13   27:aload_1         
	//*  14   28:ifnull          56
		{
			FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #372 <Method FragmentManager getSupportFragmentManager()>
	//   17   35:invokevirtual   #378 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   18   38:astore_2        
			fragmenttransaction.detach(fragment);
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #493 <Method FragmentTransaction FragmentTransaction.detach(android.support.v4.app.Fragment)>
	//   22   44:pop             
			fragmenttransaction.attach(fragment);
	//   23   45:aload_2         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #496 <Method FragmentTransaction FragmentTransaction.attach(android.support.v4.app.Fragment)>
	//   26   50:pop             
			fragmenttransaction.commit();
	//   27   51:aload_2         
	//   28   52:invokevirtual   #392 <Method int FragmentTransaction.commit()>
	//   29   55:pop             
		}
	//   30   56:return          
	}

	private static final String f = "FloorPlanActivity";
	IRobotApplication a;
	String b;
	String c;
	String d;
	ImageView e;
	private MapsUIService g;
	private AssetNetworkUIService h;
	private a i;
	private boolean j;
	private final AssetNetworkUIServiceDataCallback k = new AssetNetworkUIServiceDataCallback() {

		public void onAssetNetworkUIServiceDataChanged(AssetNetworkUIServiceData assetnetworkuiservicedata)
		{
			if(assetnetworkuiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			Iterator iterator = assetnetworkuiservicedata.getDataStateChangelist().iterator();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #24  <Method ArrayList AssetNetworkUIServiceData.getDataStateChangelist()>
		//    5    9:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
		//    6   12:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
		//    7   13:aload_2         
		//    8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
		//    9   19:ifeq            61
				AssetNetworkUIServiceDataState assetnetworkuiservicedatastate = (AssetNetworkUIServiceDataState)iterator.next();
		//   10   22:aload_2         
		//   11   23:invokeinterface #40  <Method Object Iterator.next()>
		//   12   28:checkcast       #42  <Class AssetNetworkUIServiceDataState>
		//   13   31:astore_3        
				if(_cls5.c[assetnetworkuiservicedatastate.ordinal()] == 1)
		//*  14   32:getstatic       #48  <Field int[] FloorPlanActivity$5.c>
		//*  15   35:aload_3         
		//*  16   36:invokevirtual   #52  <Method int AssetNetworkUIServiceDataState.ordinal()>
		//*  17   39:iaload          
		//*  18   40:iconst_1        
		//*  19   41:icmpeq          47
		//*  20   44:goto            13
					a.onRemoteConnectionStateChanged(assetnetworkuiservicedata.getConnectionStateForRemote());
		//   21   47:aload_0         
		//   22   48:getfield        #12  <Field FloorPlanActivity a>
		//   23   51:aload_1         
		//   24   52:invokevirtual   #56  <Method NetworkState AssetNetworkUIServiceData.getConnectionStateForRemote()>
		//   25   55:invokevirtual   #60  <Method void FloorPlanActivity.onRemoteConnectionStateChanged(NetworkState)>
			} while(true);
		//   26   58:goto            13
		//   27   61:return          
		}

		final FloorPlanActivity a;

			
			{
				a = FloorPlanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field FloorPlanActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AssetNetworkUIServiceDataCallback()>
			//    5    9:return          
			}
	}
;

	static 
	{
	//    0    0:return          
	}
}
