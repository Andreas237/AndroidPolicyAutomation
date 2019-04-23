// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaOverlay;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerOverlayController

public class APSMediaPlayerMidrollOverlayController extends APSMediaPlayerOverlayController
{

	public APSMediaPlayerMidrollOverlayController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void APSMediaPlayerOverlayController()>
	//    2    4:return          
	}

	public void addViewToContainer(ViewGroup viewgroup)
	{
	//    0    0:return          
	}

	public float getAlpha()
	{
		return 1.0F;
	//    0    0:fconst_1        
	//    1    1:freturn         
	}

	public View getView()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void hideOverlay()
	{
	//    0    0:return          
	}

	public void load(Context context)
	{
		if(overlay.parameters.get("units") != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field APSMediaOverlay overlay>
	//*   2    4:getfield        #38  <Field HashMap APSMediaOverlay.parameters>
	//*   3    7:ldc1            #11  <String "units">
	//*   4    9:invokevirtual   #44  <Method Object HashMap.get(Object)>
	//*   5   12:ifnull          41
			_units = new ArrayList(((java.util.Collection) ((ArrayList)overlay.parameters.get("units"))));
	//    6   15:aload_0         
	//    7   16:new             #46  <Class ArrayList>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:getfield        #32  <Field APSMediaOverlay overlay>
	//   11   24:getfield        #38  <Field HashMap APSMediaOverlay.parameters>
	//   12   27:ldc1            #11  <String "units">
	//   13   29:invokevirtual   #44  <Method Object HashMap.get(Object)>
	//   14   32:checkcast       #46  <Class ArrayList>
	//   15   35:invokespecial   #49  <Method void ArrayList(java.util.Collection)>
	//   16   38:putfield        #51  <Field ArrayList _units>
	//   17   41:return          
	}

	public String type()
	{
		return "com.appscend.mp.overlays.midroll";
	//    0    0:ldc1            #8   <String "com.appscend.mp.overlays.midroll">
	//    1    2:areturn         
	}

	public void update(int i, int j)
	{
		if(_units != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field ArrayList _units>
	//*   2    4:ifnull          39
		{
			com.appscend.media.events.APSMediaUnit apsmediaunit = APSMediaPlayer.getInstance().currentUnit();
	//    3    7:invokestatic    #61  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    4   10:invokevirtual   #65  <Method com.appscend.media.events.APSMediaUnit APSMediaPlayer.currentUnit()>
	//    5   13:astore_3        
			_units.add(((Object) (apsmediaunit)));
	//    6   14:aload_0         
	//    7   15:getfield        #51  <Field ArrayList _units>
	//    8   18:aload_3         
	//    9   19:invokevirtual   #69  <Method boolean ArrayList.add(Object)>
	//   10   22:pop             
			APSMediaPlayer.getInstance().insertMediaUnits(_units);
	//   11   23:invokestatic    #61  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   12   26:aload_0         
	//   13   27:getfield        #51  <Field ArrayList _units>
	//   14   30:invokevirtual   #73  <Method void APSMediaPlayer.insertMediaUnits(ArrayList)>
			APSMediaPlayer.getInstance().stop();
	//   15   33:invokestatic    #61  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   16   36:invokevirtual   #76  <Method void APSMediaPlayer.stop()>
		}
	//   17   39:return          
	}

	public static final String APSMidrollOverlay = "com.appscend.mp.overlays.midroll";
	public static final String kAPSMidrollUnits = "units";
	private ArrayList _units;
}
