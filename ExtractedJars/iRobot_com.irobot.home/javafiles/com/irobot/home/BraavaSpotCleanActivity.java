// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetId;
import com.irobot.core.CommandType;
import com.irobot.core.CurrentConnectionState;
import com.irobot.core.CurrentConnectionStateEvent;
import com.irobot.core.EventType;
import com.irobot.core.MissionSubsystem;
import com.irobot.core.ResolvedMissionStatus;
import com.irobot.core.ResolvedMissionStatusEvent;
import com.irobot.core.ViewId;
import com.irobot.home.i.a;
import com.irobot.home.util.i;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomVideoView;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class BraavaSpotCleanActivity extends BaseFragmentActivity
{

	public BraavaSpotCleanActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void BaseFragmentActivity()>
		e = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean e>
	//    5    9:return          
	}

	void e()
	{
		Object obj = ((Object) (AssetId.assetIdForString(a)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String a>
	//    2    4:invokestatic    #31  <Method AssetId AssetId.assetIdForString(String)>
	//    3    7:astore_2        
		b(0x7f0f0156);
	//    4    8:aload_0         
	//    5    9:ldc1            #32  <Int 0x7f0f0156>
	//    6   11:invokevirtual   #35  <Method void b(int)>
		int k;
		if(i.f)
	//*   7   14:getstatic       #40  <Field boolean i.f>
	//*   8   17:ifeq            26
			k = 0x7f0e000d;
	//    9   20:ldc1            #41  <Int 0x7f0e000d>
	//   10   22:istore_1        
		else
	//*  11   23:goto            29
			k = 0x7f0e000c;
	//   12   26:ldc1            #42  <Int 0x7f0e000c>
	//   13   28:istore_1        
		Object obj1 = ((Object) (j.a(((android.content.Context) (this)), k)));
	//   14   29:aload_0         
	//   15   30:iload_1         
	//   16   31:invokestatic    #47  <Method Uri j.a(android.content.Context, int)>
	//   17   34:astore_3        
		b.setSource(((Uri) (obj1)));
	//   18   35:aload_0         
	//   19   36:getfield        #49  <Field CustomVideoView b>
	//   20   39:aload_3         
	//   21   40:invokevirtual   #55  <Method void CustomVideoView.setSource(Uri)>
		b.setLooping(false);
	//   22   43:aload_0         
	//   23   44:getfield        #49  <Field CustomVideoView b>
	//   24   47:iconst_0        
	//   25   48:invokevirtual   #59  <Method void CustomVideoView.setLooping(boolean)>
		b.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener(((Uri) (obj1))) {

			public void onGlobalLayout()
			{
				Object obj2 = ((Object) (new MediaMetadataRetriever()));
			//    0    0:new             #27  <Class MediaMetadataRetriever>
			//    1    3:dup             
			//    2    4:invokespecial   #28  <Method void MediaMetadataRetriever()>
			//    3    7:astore_3        
				((MediaMetadataRetriever) (obj2)).setDataSource(((android.content.Context) (b)), a);
			//    4    8:aload_3         
			//    5    9:aload_0         
			//    6   10:getfield        #19  <Field BraavaSpotCleanActivity b>
			//    7   13:aload_0         
			//    8   14:getfield        #21  <Field Uri a>
			//    9   17:invokevirtual   #32  <Method void MediaMetadataRetriever.setDataSource(android.content.Context, Uri)>
				obj2 = ((Object) (((MediaMetadataRetriever) (obj2)).getFrameAtTime()));
			//   10   20:aload_3         
			//   11   21:invokevirtual   #36  <Method Bitmap MediaMetadataRetriever.getFrameAtTime()>
			//   12   24:astore_3        
				double d1;
				if(obj2 != null)
			//*  13   25:aload_3         
			//*  14   26:ifnull          44
					d1 = (double)((Bitmap) (obj2)).getHeight() / (double)((Bitmap) (obj2)).getWidth();
			//   15   29:aload_3         
			//   16   30:invokevirtual   #42  <Method int Bitmap.getHeight()>
			//   17   33:i2d             
			//   18   34:aload_3         
			//   19   35:invokevirtual   #45  <Method int Bitmap.getWidth()>
			//   20   38:i2d             
			//   21   39:ddiv            
			//   22   40:dstore_1        
				else
			//*  23   41:goto            48
					d1 = 0.75D;
			//   24   44:ldc2w           #46  <Double 0.75D>
			//   25   47:dstore_1        
				obj2 = ((Object) (b.b.getLayoutParams()));
			//   26   48:aload_0         
			//   27   49:getfield        #19  <Field BraavaSpotCleanActivity b>
			//   28   52:getfield        #50  <Field CustomVideoView BraavaSpotCleanActivity.b>
			//   29   55:invokevirtual   #56  <Method android.view.ViewGroup$LayoutParams CustomVideoView.getLayoutParams()>
			//   30   58:astore_3        
				b.b.measure(0, 0);
			//   31   59:aload_0         
			//   32   60:getfield        #19  <Field BraavaSpotCleanActivity b>
			//   33   63:getfield        #50  <Field CustomVideoView BraavaSpotCleanActivity.b>
			//   34   66:iconst_0        
			//   35   67:iconst_0        
			//   36   68:invokevirtual   #60  <Method void CustomVideoView.measure(int, int)>
				obj2.height = (int)((double)b.b.getWidth() * d1);
			//   37   71:aload_3         
			//   38   72:aload_0         
			//   39   73:getfield        #19  <Field BraavaSpotCleanActivity b>
			//   40   76:getfield        #50  <Field CustomVideoView BraavaSpotCleanActivity.b>
			//   41   79:invokevirtual   #61  <Method int CustomVideoView.getWidth()>
			//   42   82:i2d             
			//   43   83:dload_1         
			//   44   84:dmul            
			//   45   85:d2i             
			//   46   86:putfield        #67  <Field int android.view.ViewGroup$LayoutParams.height>
				b.b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
			//   47   89:aload_0         
			//   48   90:getfield        #19  <Field BraavaSpotCleanActivity b>
			//   49   93:getfield        #50  <Field CustomVideoView BraavaSpotCleanActivity.b>
			//   50   96:aload_3         
			//   51   97:invokevirtual   #71  <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			//   52  100:return          
			}

			final Uri a;
			final BraavaSpotCleanActivity b;

			
			{
				b = BraavaSpotCleanActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaSpotCleanActivity b>
				a = uri;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Uri a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   26   51:aload_0         
	//   27   52:getfield        #49  <Field CustomVideoView b>
	//   28   55:invokevirtual   #63  <Method ViewTreeObserver CustomVideoView.getViewTreeObserver()>
	//   29   58:new             #6   <Class BraavaSpotCleanActivity$1>
	//   30   61:dup             
	//   31   62:aload_0         
	//   32   63:aload_3         
	//   33   64:invokespecial   #66  <Method void BraavaSpotCleanActivity$1(BraavaSpotCleanActivity, Uri)>
	//   34   67:invokevirtual   #72  <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		obj1 = ((Object) (c));
	//   35   70:aload_0         
	//   36   71:getfield        #74  <Field TextView c>
	//   37   74:astore_3        
		if(i.f)
	//*  38   75:getstatic       #40  <Field boolean i.f>
	//*  39   78:ifeq            87
			k = 0x7f0f0155;
	//   40   81:ldc1            #75  <Int 0x7f0f0155>
	//   41   83:istore_1        
		else
	//*  42   84:goto            90
			k = 0x7f0f0154;
	//   43   87:ldc1            #76  <Int 0x7f0f0154>
	//   44   89:istore_1        
		((TextView) (obj1)).setText(k);
	//   45   90:aload_3         
	//   46   91:iload_1         
	//   47   92:invokevirtual   #81  <Method void TextView.setText(int)>
		obj1 = ((Object) ((a)Assembler.getInstance().getDomainEventBus()));
	//   48   95:invokestatic    #87  <Method Assembler Assembler.getInstance()>
	//   49   98:invokevirtual   #91  <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   50  101:checkcast       #93  <Class a>
	//   51  104:astore_3        
		((a) (obj1)).a(((Object) (this)), EventType.ResolvedMissionStatusEvent);
	//   52  105:aload_3         
	//   53  106:aload_0         
	//   54  107:getstatic       #99  <Field EventType EventType.ResolvedMissionStatusEvent>
	//   55  110:invokevirtual   #102 <Method void a.a(Object, EventType)>
		((a) (obj1)).a(((Object) (this)), EventType.CurrentConnectionStateEvent);
	//   56  113:aload_3         
	//   57  114:aload_0         
	//   58  115:getstatic       #105 <Field EventType EventType.CurrentConnectionStateEvent>
	//   59  118:invokevirtual   #102 <Method void a.a(Object, EventType)>
		Assembler.getInstance().getMissionSubsystem(((AssetId) (obj))).queryResolvedMissionStatus();
	//   60  121:invokestatic    #87  <Method Assembler Assembler.getInstance()>
	//   61  124:aload_2         
	//   62  125:invokevirtual   #109 <Method MissionSubsystem Assembler.getMissionSubsystem(AssetId)>
	//   63  128:invokevirtual   #114 <Method void MissionSubsystem.queryResolvedMissionStatus()>
		obj = ((Object) (j.a(a).a()));
	//   64  131:aload_0         
	//   65  132:getfield        #25  <Field String a>
	//   66  135:invokestatic    #117 <Method com.irobot.home.model.a j.a(String)>
	//   67  138:invokevirtual   #122 <Method com.irobot.core.AssetInfo com.irobot.home.model.a.a()>
	//   68  141:astore_2        
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.BraavaSpotClean, ((com.irobot.core.AssetInfo) (obj)));
	//   69  142:invokestatic    #127 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   70  145:getstatic       #133 <Field ViewId ViewId.BraavaSpotClean>
	//   71  148:aload_2         
	//   72  149:invokevirtual   #137 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
	//   73  152:return          
	}

	void f()
	{
		Object obj = ((Object) (AssetId.assetIdForString(a)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String a>
	//    2    4:invokestatic    #31  <Method AssetId AssetId.assetIdForString(String)>
	//    3    7:astore_1        
		obj = ((Object) (Assembler.getInstance().getMissionSubsystem(((AssetId) (obj)))));
	//    4    8:invokestatic    #87  <Method Assembler Assembler.getInstance()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #109 <Method MissionSubsystem Assembler.getMissionSubsystem(AssetId)>
	//    7   15:astore_1        
		if(obj != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          58
		{
			e = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #22  <Field boolean e>
			((MissionSubsystem) (obj)).sendCommand(CommandType.SPOT);
	//   13   25:aload_1         
	//   14   26:getstatic       #143 <Field CommandType CommandType.SPOT>
	//   15   29:invokevirtual   #147 <Method void MissionSubsystem.sendCommand(CommandType)>
			d.setEnabled(false);
	//   16   32:aload_0         
	//   17   33:getfield        #149 <Field Button d>
	//   18   36:iconst_0        
	//   19   37:invokevirtual   #154 <Method void Button.setEnabled(boolean)>
			obj = ((Object) (j.a(a).a()));
	//   20   40:aload_0         
	//   21   41:getfield        #25  <Field String a>
	//   22   44:invokestatic    #117 <Method com.irobot.home.model.a j.a(String)>
	//   23   47:invokevirtual   #122 <Method com.irobot.core.AssetInfo com.irobot.home.model.a.a()>
	//   24   50:astore_1        
			AnalyticsSubsystem.getInstance().trackBraavaSpotCleanPressed(((com.irobot.core.AssetInfo) (obj)));
	//   25   51:invokestatic    #127 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   26   54:aload_1         
	//   27   55:invokevirtual   #158 <Method void AnalyticsSubsystem.trackBraavaSpotCleanPressed(com.irobot.core.AssetInfo)>
		}
	//   28   58:return          
	}

	public void finish()
	{
		a a1 = (a)Assembler.getInstance().getDomainEventBus();
	//    0    0:invokestatic    #87  <Method Assembler Assembler.getInstance()>
	//    1    3:invokevirtual   #91  <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//    2    6:checkcast       #93  <Class a>
	//    3    9:astore_1        
		a1.b(((Object) (this)), EventType.ResolvedMissionStatusEvent);
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:getstatic       #99  <Field EventType EventType.ResolvedMissionStatusEvent>
	//    7   15:invokevirtual   #161 <Method void a.b(Object, EventType)>
		a1.b(((Object) (this)), EventType.CurrentConnectionStateEvent);
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getstatic       #105 <Field EventType EventType.CurrentConnectionStateEvent>
	//   11   23:invokevirtual   #161 <Method void a.b(Object, EventType)>
		super.finish();
	//   12   26:aload_0         
	//   13   27:invokespecial   #163 <Method void BaseFragmentActivity.finish()>
	//   14   30:return          
	}

	public void onCurrentConnectionStateEvent(CurrentConnectionStateEvent currentconnectionstateevent)
	{
		currentconnectionstateevent = ((CurrentConnectionStateEvent) (currentconnectionstateevent.currentConnection()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #172 <Method CurrentConnectionState CurrentConnectionStateEvent.currentConnection()>
	//    2    4:astore_1        
		if(currentconnectionstateevent == CurrentConnectionState.Disconnected || currentconnectionstateevent == CurrentConnectionState.Error)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #178 <Field CurrentConnectionState CurrentConnectionState.Disconnected>
	//*   5    9:if_acmpeq       19
	//*   6   12:aload_1         
	//*   7   13:getstatic       #181 <Field CurrentConnectionState CurrentConnectionState.Error>
	//*   8   16:if_acmpne       39
		{
			if(e)
	//*   9   19:aload_0         
	//*  10   20:getfield        #22  <Field boolean e>
	//*  11   23:ifeq            31
			{
				finish();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #182 <Method void finish()>
				return;
	//   14   30:return          
			}
			d.setEnabled(false);
	//   15   31:aload_0         
	//   16   32:getfield        #149 <Field Button d>
	//   17   35:iconst_0        
	//   18   36:invokevirtual   #154 <Method void Button.setEnabled(boolean)>
		}
	//   19   39:return          
	}

	public void onResolvedMissionStatusEvent(ResolvedMissionStatusEvent resolvedmissionstatusevent)
	{
		if(e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean e>
	//*   2    4:ifeq            12
		{
			finish();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #182 <Method void finish()>
			return;
	//    5   11:return          
		}
		Button button = d;
	//    6   12:aload_0         
	//    7   13:getfield        #149 <Field Button d>
	//    8   16:astore_3        
		boolean flag;
		if(resolvedmissionstatusevent.status() != ResolvedMissionStatus.InMission)
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #191 <Method ResolvedMissionStatus ResolvedMissionStatusEvent.status()>
	//*  11   21:getstatic       #197 <Field ResolvedMissionStatus ResolvedMissionStatus.InMission>
	//*  12   24:if_acmpeq       32
			flag = true;
	//   13   27:iconst_1        
	//   14   28:istore_2        
		else
	//*  15   29:goto            34
			flag = false;
	//   16   32:iconst_0        
	//   17   33:istore_2        
		button.setEnabled(flag);
	//   18   34:aload_3         
	//   19   35:iload_2         
	//   20   36:invokevirtual   #154 <Method void Button.setEnabled(boolean)>
	//   21   39:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #200 <Method void BaseFragmentActivity.onResume()>
		b.a();
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field CustomVideoView b>
	//    4    8:invokevirtual   #202 <Method void CustomVideoView.a()>
	//    5   11:return          
	}

	String a;
	CustomVideoView b;
	TextView c;
	Button d;
	boolean e;
}
