// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.*;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//			MediaRouter, MediaRouteProvider, MediaRouteSelector, MediaRouteDescriptor

public static class MediaRouter$RouteInfo
{
	private static interface ConnectionState
		extends Annotation
	{
	}

	private static interface DeviceType
		extends Annotation
	{
	}

	private static interface PlaybackType
		extends Annotation
	{
	}

	private static interface PlaybackVolume
		extends Annotation
	{
	}


	private static boolean isSystemMediaRouteProvider(MediaRouter$RouteInfo mediarouter$routeinfo)
	{
		return TextUtils.equals(((CharSequence) (mediarouter$routeinfo.getProviderInstance().getMetadata().getPackageName())), "android");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method MediaRouteProvider getProviderInstance()>
	//    2    4:invokevirtual   #117 <Method MediaRouteProvider$ProviderMetadata MediaRouteProvider.getMetadata()>
	//    3    7:invokevirtual   #123 <Method String MediaRouteProvider$ProviderMetadata.getPackageName()>
	//    4   10:ldc1            #49  <String "android">
	//    5   12:invokestatic    #129 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//    6   15:ireturn         
	}

	public boolean canDisconnect()
	{
		return mCanDisconnect;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field boolean mCanDisconnect>
	//    2    4:ireturn         
	}

	public int getConnectionState()
	{
		return mConnectionState;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field int mConnectionState>
	//    2    4:ireturn         
	}

	public List getControlFilters()
	{
		return ((List) (mControlFilters));
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field ArrayList mControlFilters>
	//    2    4:areturn         
	}

	public String getDescription()
	{
		return mDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field String mDescription>
	//    2    4:areturn         
	}

	String getDescriptorId()
	{
		return mDescriptorId;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String mDescriptorId>
	//    2    4:areturn         
	}

	public int getDeviceType()
	{
		return mDeviceType;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field int mDeviceType>
	//    2    4:ireturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public Uri getIconUri()
	{
		return mIconUri;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field Uri mIconUri>
	//    2    4:areturn         
	}

	public String getId()
	{
		return mUniqueId;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String mUniqueId>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field String mName>
	//    2    4:areturn         
	}

	public int getPlaybackStream()
	{
		return mPlaybackStream;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field int mPlaybackStream>
	//    2    4:ireturn         
	}

	public int getPlaybackType()
	{
		return mPlaybackType;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field int mPlaybackType>
	//    2    4:ireturn         
	}

	public Display getPresentationDisplay()
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
		if(mPresentationDisplayId >= 0 && mPresentationDisplay == null)
	//*   1    3:aload_0         
	//*   2    4:getfield        #92  <Field int mPresentationDisplayId>
	//*   3    7:iflt            31
	//*   4   10:aload_0         
	//*   5   11:getfield        #176 <Field Display mPresentationDisplay>
	//*   6   14:ifnonnull       31
			mPresentationDisplay = MediaRouter.sGlobal.getDisplay(mPresentationDisplayId);
	//    7   17:aload_0         
	//    8   18:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    9   21:aload_0         
	//   10   22:getfield        #92  <Field int mPresentationDisplayId>
	//   11   25:invokevirtual   #186 <Method Display MediaRouter$GlobalMediaRouter.getDisplay(int)>
	//   12   28:putfield        #176 <Field Display mPresentationDisplay>
		return mPresentationDisplay;
	//   13   31:aload_0         
	//   14   32:getfield        #176 <Field Display mPresentationDisplay>
	//   15   35:areturn         
	}

	public int getPresentationDisplayId()
	{
		return mPresentationDisplayId;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field int mPresentationDisplayId>
	//    2    4:ireturn         
	}

	public fo getProvider()
	{
		return mProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field MediaRouter$ProviderInfo mProvider>
	//    2    4:areturn         
	}

	public MediaRouteProvider getProviderInstance()
	{
		return mProvider.getProviderInstance();
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field MediaRouter$ProviderInfo mProvider>
	//    2    4:invokevirtual   #192 <Method MediaRouteProvider MediaRouter$ProviderInfo.getProviderInstance()>
	//    3    7:areturn         
	}

	public IntentSender getSettingsIntent()
	{
		return mSettingsIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field IntentSender mSettingsIntent>
	//    2    4:areturn         
	}

	public int getVolume()
	{
		return mVolume;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field int mVolume>
	//    2    4:ireturn         
	}

	public int getVolumeHandling()
	{
		return mVolumeHandling;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field int mVolumeHandling>
	//    2    4:ireturn         
	}

	public int getVolumeMax()
	{
		return mVolumeMax;
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field int mVolumeMax>
	//    2    4:ireturn         
	}

	public boolean isBluetooth()
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
		return MediaRouter.sGlobal.getBluetoothRoute() == this;
	//    1    3:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    2    6:invokevirtual   #210 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getBluetoothRoute()>
	//    3    9:aload_0         
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean isConnecting()
	{
		return mConnecting;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field boolean mConnecting>
	//    2    4:ireturn         
	}

	public boolean isDefault()
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
		return MediaRouter.sGlobal.getDefaultRoute() == this;
	//    1    3:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    2    6:invokevirtual   #217 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getDefaultRoute()>
	//    3    9:aload_0         
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean isDefaultOrBluetooth()
	{
		if(!isDefault())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #220 <Method boolean isDefault()>
	//*   2    4:ifne            46
		{
			if(mDeviceType == 3)
	//*   3    7:aload_0         
	//*   4    8:getfield        #150 <Field int mDeviceType>
	//*   5   11:iconst_3        
	//*   6   12:icmpne          17
				return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
			return isSystemMediaRouteProvider(this) && supportsControlCategory("android.media.intent.category.LIVE_AUDIO") && !supportsControlCategory("android.media.intent.category.LIVE_VIDEO");
	//    9   17:aload_0         
	//   10   18:invokestatic    #222 <Method boolean isSystemMediaRouteProvider(MediaRouter$RouteInfo)>
	//   11   21:ifeq            44
	//   12   24:aload_0         
	//   13   25:ldc1            #224 <String "android.media.intent.category.LIVE_AUDIO">
	//   14   27:invokevirtual   #228 <Method boolean supportsControlCategory(String)>
	//   15   30:ifeq            44
	//   16   33:aload_0         
	//   17   34:ldc1            #230 <String "android.media.intent.category.LIVE_VIDEO">
	//   18   36:invokevirtual   #228 <Method boolean supportsControlCategory(String)>
	//   19   39:ifne            44
	//   20   42:iconst_1        
	//   21   43:ireturn         
	//   22   44:iconst_0        
	//   23   45:ireturn         
		} else
		{
			return true;
	//   24   46:iconst_1        
	//   25   47:ireturn         
		}
	}

	public boolean isDeviceSpeaker()
	{
		int i = Resources.getSystem().getIdentifier("default_audio_route_name", "string", "android");
	//    0    0:invokestatic    #237 <Method Resources Resources.getSystem()>
	//    1    3:ldc1            #239 <String "default_audio_route_name">
	//    2    5:ldc1            #241 <String "string">
	//    3    7:ldc1            #49  <String "android">
	//    4    9:invokevirtual   #245 <Method int Resources.getIdentifier(String, String, String)>
	//    5   12:istore_1        
		return isDefault() && ((Object) (Resources.getSystem().getText(i))).equals(((Object) (mName)));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #220 <Method boolean isDefault()>
	//    8   17:ifeq            39
	//    9   20:invokestatic    #237 <Method Resources Resources.getSystem()>
	//   10   23:iload_1         
	//   11   24:invokevirtual   #249 <Method CharSequence Resources.getText(int)>
	//   12   27:aload_0         
	//   13   28:getfield        #163 <Field String mName>
	//   14   31:invokevirtual   #252 <Method boolean Object.equals(Object)>
	//   15   34:ifeq            39
	//   16   37:iconst_1        
	//   17   38:ireturn         
	//   18   39:iconst_0        
	//   19   40:ireturn         
	}

	public boolean isEnabled()
	{
		return mEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field boolean mEnabled>
	//    2    4:ireturn         
	}

	boolean isSelectable()
	{
		return mDescriptor != null && mEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field MediaRouteDescriptor mDescriptor>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field boolean mEnabled>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean isSelected()
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
		return MediaRouter.sGlobal.getSelectedRoute() == this;
	//    1    3:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    2    6:invokevirtual   #260 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getSelectedRoute()>
	//    3    9:aload_0         
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean matchesSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("selector must not be null");
	//    2    4:new             #264 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #266 <String "selector must not be null">
	//    5   11:invokespecial   #269 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			MediaRouter.checkCallingThread();
	//    7   15:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
			return mediarouteselector.matchesControlFilters(((List) (mControlFilters)));
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #90  <Field ArrayList mControlFilters>
	//   11   23:invokevirtual   #275 <Method boolean MediaRouteSelector.matchesControlFilters(List)>
	//   12   26:ireturn         
		}
	}

	int maybeUpdateDescriptor(MediaRouteDescriptor mediaroutedescriptor)
	{
		if(mDescriptor != mediaroutedescriptor)
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field MediaRouteDescriptor mDescriptor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       14
			return updateDescriptor(mediaroutedescriptor);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #281 <Method int updateDescriptor(MediaRouteDescriptor)>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public void requestSetVolume(int i)
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
		MediaRouter.sGlobal.requestSetVolume(this, Math.min(mVolumeMax, Math.max(0, i)));
	//    1    3:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    2    6:aload_0         
	//    3    7:aload_0         
	//    4    8:getfield        #205 <Field int mVolumeMax>
	//    5   11:iconst_0        
	//    6   12:iload_1         
	//    7   13:invokestatic    #289 <Method int Math.max(int, int)>
	//    8   16:invokestatic    #292 <Method int Math.min(int, int)>
	//    9   19:invokevirtual   #295 <Method void MediaRouter$GlobalMediaRouter.requestSetVolume(MediaRouter$RouteInfo, int)>
	//   10   22:return          
	}

	public void requestUpdateVolume(int i)
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
		if(i != 0)
	//*   1    3:iload_1         
	//*   2    4:ifeq            15
			MediaRouter.sGlobal.requestUpdateVolume(this, i);
	//    3    7:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    4   10:aload_0         
	//    5   11:iload_1         
	//    6   12:invokevirtual   #298 <Method void MediaRouter$GlobalMediaRouter.requestUpdateVolume(MediaRouter$RouteInfo, int)>
	//    7   15:return          
	}

	public void select()
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
		MediaRouter.sGlobal.selectRoute(this);
	//    1    3:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #303 <Method void MediaRouter$GlobalMediaRouter.selectRoute(MediaRouter$RouteInfo)>
	//    4   10:return          
	}

	public void sendControlRequest(Intent intent, uestCallback uestcallback)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("intent must not be null");
	//    2    4:new             #264 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #307 <String "intent must not be null">
	//    5   11:invokespecial   #269 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			MediaRouter.checkCallingThread();
	//    7   15:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
			MediaRouter.sGlobal.sendControlRequest(this, intent, uestcallback);
	//    8   18:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #310 <Method void MediaRouter$GlobalMediaRouter.sendControlRequest(MediaRouter$RouteInfo, Intent, MediaRouter$ControlRequestCallback)>
			return;
	//   13   27:return          
		}
	}

	public boolean supportsControlAction(String s, String s1)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("category must not be null");
	//    2    4:new             #264 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #314 <String "category must not be null">
	//    5   11:invokespecial   #269 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(s1 == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       30
			throw new IllegalArgumentException("action must not be null");
	//    9   19:new             #264 <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc2            #316 <String "action must not be null">
	//   12   26:invokespecial   #269 <Method void IllegalArgumentException(String)>
	//   13   29:athrow          
		MediaRouter.checkCallingThread();
	//   14   30:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
		int j = mControlFilters.size();
	//   15   33:aload_0         
	//   16   34:getfield        #90  <Field ArrayList mControlFilters>
	//   17   37:invokevirtual   #319 <Method int ArrayList.size()>
	//   18   40:istore          4
		for(int i = 0; i < j; i++)
	//*  19   42:iconst_0        
	//*  20   43:istore_3        
	//*  21   44:iload_3         
	//*  22   45:iload           4
	//*  23   47:icmpge          90
		{
			IntentFilter intentfilter = (IntentFilter)mControlFilters.get(i);
	//   24   50:aload_0         
	//   25   51:getfield        #90  <Field ArrayList mControlFilters>
	//   26   54:iload_3         
	//   27   55:invokevirtual   #323 <Method Object ArrayList.get(int)>
	//   28   58:checkcast       #325 <Class IntentFilter>
	//   29   61:astore          5
			if(intentfilter.hasCategory(s) && intentfilter.hasAction(s1))
	//*  30   63:aload           5
	//*  31   65:aload_1         
	//*  32   66:invokevirtual   #328 <Method boolean IntentFilter.hasCategory(String)>
	//*  33   69:ifeq            83
	//*  34   72:aload           5
	//*  35   74:aload_2         
	//*  36   75:invokevirtual   #331 <Method boolean IntentFilter.hasAction(String)>
	//*  37   78:ifeq            83
				return true;
	//   38   81:iconst_1        
	//   39   82:ireturn         
		}

	//   40   83:iload_3         
	//   41   84:iconst_1        
	//   42   85:iadd            
	//   43   86:istore_3        
	//*  44   87:goto            44
		return false;
	//   45   90:iconst_0        
	//   46   91:ireturn         
	}

	public boolean supportsControlCategory(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("category must not be null");
	//    2    4:new             #264 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #314 <String "category must not be null">
	//    5   11:invokespecial   #269 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		MediaRouter.checkCallingThread();
	//    7   15:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
		int j = mControlFilters.size();
	//    8   18:aload_0         
	//    9   19:getfield        #90  <Field ArrayList mControlFilters>
	//   10   22:invokevirtual   #319 <Method int ArrayList.size()>
	//   11   25:istore_3        
		for(int i = 0; i < j; i++)
	//*  12   26:iconst_0        
	//*  13   27:istore_2        
	//*  14   28:iload_2         
	//*  15   29:iload_3         
	//*  16   30:icmpge          60
			if(((IntentFilter)mControlFilters.get(i)).hasCategory(s))
	//*  17   33:aload_0         
	//*  18   34:getfield        #90  <Field ArrayList mControlFilters>
	//*  19   37:iload_2         
	//*  20   38:invokevirtual   #323 <Method Object ArrayList.get(int)>
	//*  21   41:checkcast       #325 <Class IntentFilter>
	//*  22   44:aload_1         
	//*  23   45:invokevirtual   #328 <Method boolean IntentFilter.hasCategory(String)>
	//*  24   48:ifeq            53
				return true;
	//   25   51:iconst_1        
	//   26   52:ireturn         

	//   27   53:iload_2         
	//   28   54:iconst_1        
	//   29   55:iadd            
	//   30   56:istore_2        
	//*  31   57:goto            28
		return false;
	//   32   60:iconst_0        
	//   33   61:ireturn         
	}

	public boolean supportsControlRequest(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("intent must not be null");
	//    2    4:new             #264 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #307 <String "intent must not be null">
	//    5   11:invokespecial   #269 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		MediaRouter.checkCallingThread();
	//    7   15:invokestatic    #174 <Method void MediaRouter.checkCallingThread()>
		android.content.ContentResolver contentresolver = MediaRouter.sGlobal.getContentResolver();
	//    8   18:getstatic       #180 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    9   21:invokevirtual   #337 <Method android.content.ContentResolver MediaRouter$GlobalMediaRouter.getContentResolver()>
	//   10   24:astore          4
		int j = mControlFilters.size();
	//   11   26:aload_0         
	//   12   27:getfield        #90  <Field ArrayList mControlFilters>
	//   13   30:invokevirtual   #319 <Method int ArrayList.size()>
	//   14   33:istore_3        
		for(int i = 0; i < j; i++)
	//*  15   34:iconst_0        
	//*  16   35:istore_2        
	//*  17   36:iload_2         
	//*  18   37:iload_3         
	//*  19   38:icmpge          74
			if(((IntentFilter)mControlFilters.get(i)).match(contentresolver, intent, true, "MediaRouter") >= 0)
	//*  20   41:aload_0         
	//*  21   42:getfield        #90  <Field ArrayList mControlFilters>
	//*  22   45:iload_2         
	//*  23   46:invokevirtual   #323 <Method Object ArrayList.get(int)>
	//*  24   49:checkcast       #325 <Class IntentFilter>
	//*  25   52:aload           4
	//*  26   54:aload_1         
	//*  27   55:iconst_1        
	//*  28   56:ldc2            #339 <String "MediaRouter">
	//*  29   59:invokevirtual   #343 <Method int IntentFilter.match(android.content.ContentResolver, Intent, boolean, String)>
	//*  30   62:iflt            67
				return true;
	//   31   65:iconst_1        
	//   32   66:ireturn         

	//   33   67:iload_2         
	//   34   68:iconst_1        
	//   35   69:iadd            
	//   36   70:istore_2        
	//*  37   71:goto            36
		return false;
	//   38   74:iconst_0        
	//   39   75:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #346 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #347 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MediaRouter.RouteInfo{ uniqueId=");
	//    4    8:aload_1         
	//    5    9:ldc2            #349 <String "MediaRouter.RouteInfo{ uniqueId=">
	//    6   12:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(mUniqueId);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #98  <Field String mUniqueId>
	//   11   21:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(", name=");
	//   13   25:aload_1         
	//   14   26:ldc2            #355 <String ", name=">
	//   15   29:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(mName);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #163 <Field String mName>
	//   20   38:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		stringbuilder.append(", description=");
	//   22   42:aload_1         
	//   23   43:ldc2            #357 <String ", description=">
	//   24   46:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		stringbuilder.append(mDescription);
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #145 <Field String mDescription>
	//   29   55:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
		stringbuilder.append(", iconUri=");
	//   31   59:aload_1         
	//   32   60:ldc2            #359 <String ", iconUri=">
	//   33   63:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
		stringbuilder.append(((Object) (mIconUri)));
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:getfield        #158 <Field Uri mIconUri>
	//   38   72:invokevirtual   #362 <Method StringBuilder StringBuilder.append(Object)>
	//   39   75:pop             
		stringbuilder.append(", enabled=");
	//   40   76:aload_1         
	//   41   77:ldc2            #364 <String ", enabled=">
	//   42   80:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
		stringbuilder.append(mEnabled);
	//   44   84:aload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #106 <Field boolean mEnabled>
	//   47   89:invokevirtual   #367 <Method StringBuilder StringBuilder.append(boolean)>
	//   48   92:pop             
		stringbuilder.append(", connecting=");
	//   49   93:aload_1         
	//   50   94:ldc2            #369 <String ", connecting=">
	//   51   97:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   52  100:pop             
		stringbuilder.append(mConnecting);
	//   53  101:aload_1         
	//   54  102:aload_0         
	//   55  103:getfield        #213 <Field boolean mConnecting>
	//   56  106:invokevirtual   #367 <Method StringBuilder StringBuilder.append(boolean)>
	//   57  109:pop             
		stringbuilder.append(", connectionState=");
	//   58  110:aload_1         
	//   59  111:ldc2            #371 <String ", connectionState=">
	//   60  114:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   61  117:pop             
		stringbuilder.append(mConnectionState);
	//   62  118:aload_1         
	//   63  119:aload_0         
	//   64  120:getfield        #137 <Field int mConnectionState>
	//   65  123:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
	//   66  126:pop             
		stringbuilder.append(", canDisconnect=");
	//   67  127:aload_1         
	//   68  128:ldc2            #376 <String ", canDisconnect=">
	//   69  131:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   70  134:pop             
		stringbuilder.append(mCanDisconnect);
	//   71  135:aload_1         
	//   72  136:aload_0         
	//   73  137:getfield        #133 <Field boolean mCanDisconnect>
	//   74  140:invokevirtual   #367 <Method StringBuilder StringBuilder.append(boolean)>
	//   75  143:pop             
		stringbuilder.append(", playbackType=");
	//   76  144:aload_1         
	//   77  145:ldc2            #378 <String ", playbackType=">
	//   78  148:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   79  151:pop             
		stringbuilder.append(mPlaybackType);
	//   80  152:aload_1         
	//   81  153:aload_0         
	//   82  154:getfield        #169 <Field int mPlaybackType>
	//   83  157:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
	//   84  160:pop             
		stringbuilder.append(", playbackStream=");
	//   85  161:aload_1         
	//   86  162:ldc2            #380 <String ", playbackStream=">
	//   87  165:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   88  168:pop             
		stringbuilder.append(mPlaybackStream);
	//   89  169:aload_1         
	//   90  170:aload_0         
	//   91  171:getfield        #166 <Field int mPlaybackStream>
	//   92  174:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
	//   93  177:pop             
		stringbuilder.append(", deviceType=");
	//   94  178:aload_1         
	//   95  179:ldc2            #382 <String ", deviceType=">
	//   96  182:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   97  185:pop             
		stringbuilder.append(mDeviceType);
	//   98  186:aload_1         
	//   99  187:aload_0         
	//  100  188:getfield        #150 <Field int mDeviceType>
	//  101  191:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
	//  102  194:pop             
		stringbuilder.append(", volumeHandling=");
	//  103  195:aload_1         
	//  104  196:ldc2            #384 <String ", volumeHandling=">
	//  105  199:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  106  202:pop             
		stringbuilder.append(mVolumeHandling);
	//  107  203:aload_1         
	//  108  204:aload_0         
	//  109  205:getfield        #202 <Field int mVolumeHandling>
	//  110  208:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
	//  111  211:pop             
		stringbuilder.append(", volume=");
	//  112  212:aload_1         
	//  113  213:ldc2            #386 <String ", volume=">
	//  114  216:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  115  219:pop             
		stringbuilder.append(mVolume);
	//  116  220:aload_1         
	//  117  221:aload_0         
	//  118  222:getfield        #199 <Field int mVolume>
	//  119  225:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
	//  120  228:pop             
		stringbuilder.append(", volumeMax=");
	//  121  229:aload_1         
	//  122  230:ldc2            #388 <String ", volumeMax=">
	//  123  233:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  124  236:pop             
		stringbuilder.append(mVolumeMax);
	//  125  237:aload_1         
	//  126  238:aload_0         
	//  127  239:getfield        #205 <Field int mVolumeMax>
	//  128  242:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
	//  129  245:pop             
		stringbuilder.append(", presentationDisplayId=");
	//  130  246:aload_1         
	//  131  247:ldc2            #390 <String ", presentationDisplayId=">
	//  132  250:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  133  253:pop             
		stringbuilder.append(mPresentationDisplayId);
	//  134  254:aload_1         
	//  135  255:aload_0         
	//  136  256:getfield        #92  <Field int mPresentationDisplayId>
	//  137  259:invokevirtual   #374 <Method StringBuilder StringBuilder.append(int)>
	//  138  262:pop             
		stringbuilder.append(", extras=");
	//  139  263:aload_1         
	//  140  264:ldc2            #392 <String ", extras=">
	//  141  267:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  142  270:pop             
		stringbuilder.append(((Object) (mExtras)));
	//  143  271:aload_1         
	//  144  272:aload_0         
	//  145  273:getfield        #154 <Field Bundle mExtras>
	//  146  276:invokevirtual   #362 <Method StringBuilder StringBuilder.append(Object)>
	//  147  279:pop             
		stringbuilder.append(", settingsIntent=");
	//  148  280:aload_1         
	//  149  281:ldc2            #394 <String ", settingsIntent=">
	//  150  284:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  151  287:pop             
		stringbuilder.append(((Object) (mSettingsIntent)));
	//  152  288:aload_1         
	//  153  289:aload_0         
	//  154  290:getfield        #196 <Field IntentSender mSettingsIntent>
	//  155  293:invokevirtual   #362 <Method StringBuilder StringBuilder.append(Object)>
	//  156  296:pop             
		stringbuilder.append(", providerPackageName=");
	//  157  297:aload_1         
	//  158  298:ldc2            #396 <String ", providerPackageName=">
	//  159  301:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  160  304:pop             
		stringbuilder.append(mProvider.getPackageName());
	//  161  305:aload_1         
	//  162  306:aload_0         
	//  163  307:getfield        #94  <Field MediaRouter$ProviderInfo mProvider>
	//  164  310:invokevirtual   #397 <Method String MediaRouter$ProviderInfo.getPackageName()>
	//  165  313:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  166  316:pop             
		stringbuilder.append(" }");
	//  167  317:aload_1         
	//  168  318:ldc2            #399 <String " }">
	//  169  321:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//  170  324:pop             
		return stringbuilder.toString();
	//  171  325:aload_1         
	//  172  326:invokevirtual   #401 <Method String StringBuilder.toString()>
	//  173  329:areturn         
	}

	int updateDescriptor(MediaRouteDescriptor mediaroutedescriptor)
	{
		mDescriptor = mediaroutedescriptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #256 <Field MediaRouteDescriptor mDescriptor>
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		int i = 0;
	//    5    7:iconst_0        
	//    6    8:istore_2        
		if(mediaroutedescriptor != null)
	//*   7    9:aload_1         
	//*   8   10:ifnull          470
		{
			j = i;
	//    9   13:iload_2         
	//   10   14:istore_3        
			if(!MediaRouter.equal(((Object) (mName)), ((Object) (mediaroutedescriptor.getName()))))
	//*  11   15:aload_0         
	//*  12   16:getfield        #163 <Field String mName>
	//*  13   19:aload_1         
	//*  14   20:invokevirtual   #405 <Method String MediaRouteDescriptor.getName()>
	//*  15   23:invokestatic    #409 <Method boolean MediaRouter.equal(Object, Object)>
	//*  16   26:ifne            39
			{
				mName = mediaroutedescriptor.getName();
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:invokevirtual   #405 <Method String MediaRouteDescriptor.getName()>
	//   20   34:putfield        #163 <Field String mName>
				j = 1;
	//   21   37:iconst_1        
	//   22   38:istore_3        
			}
			i = j;
	//   23   39:iload_3         
	//   24   40:istore_2        
			if(!MediaRouter.equal(((Object) (mDescription)), ((Object) (mediaroutedescriptor.getDescription()))))
	//*  25   41:aload_0         
	//*  26   42:getfield        #145 <Field String mDescription>
	//*  27   45:aload_1         
	//*  28   46:invokevirtual   #411 <Method String MediaRouteDescriptor.getDescription()>
	//*  29   49:invokestatic    #409 <Method boolean MediaRouter.equal(Object, Object)>
	//*  30   52:ifne            67
			{
				mDescription = mediaroutedescriptor.getDescription();
	//   31   55:aload_0         
	//   32   56:aload_1         
	//   33   57:invokevirtual   #411 <Method String MediaRouteDescriptor.getDescription()>
	//   34   60:putfield        #145 <Field String mDescription>
				i = j | 1;
	//   35   63:iload_3         
	//   36   64:iconst_1        
	//   37   65:ior             
	//   38   66:istore_2        
			}
			j = i;
	//   39   67:iload_2         
	//   40   68:istore_3        
			if(!MediaRouter.equal(((Object) (mIconUri)), ((Object) (mediaroutedescriptor.getIconUri()))))
	//*  41   69:aload_0         
	//*  42   70:getfield        #158 <Field Uri mIconUri>
	//*  43   73:aload_1         
	//*  44   74:invokevirtual   #413 <Method Uri MediaRouteDescriptor.getIconUri()>
	//*  45   77:invokestatic    #409 <Method boolean MediaRouter.equal(Object, Object)>
	//*  46   80:ifne            95
			{
				mIconUri = mediaroutedescriptor.getIconUri();
	//   47   83:aload_0         
	//   48   84:aload_1         
	//   49   85:invokevirtual   #413 <Method Uri MediaRouteDescriptor.getIconUri()>
	//   50   88:putfield        #158 <Field Uri mIconUri>
				j = i | 1;
	//   51   91:iload_2         
	//   52   92:iconst_1        
	//   53   93:ior             
	//   54   94:istore_3        
			}
			i = j;
	//   55   95:iload_3         
	//   56   96:istore_2        
			if(mEnabled != mediaroutedescriptor.isEnabled())
	//*  57   97:aload_0         
	//*  58   98:getfield        #106 <Field boolean mEnabled>
	//*  59  101:aload_1         
	//*  60  102:invokevirtual   #415 <Method boolean MediaRouteDescriptor.isEnabled()>
	//*  61  105:icmpeq          120
			{
				mEnabled = mediaroutedescriptor.isEnabled();
	//   62  108:aload_0         
	//   63  109:aload_1         
	//   64  110:invokevirtual   #415 <Method boolean MediaRouteDescriptor.isEnabled()>
	//   65  113:putfield        #106 <Field boolean mEnabled>
				i = j | 1;
	//   66  116:iload_3         
	//   67  117:iconst_1        
	//   68  118:ior             
	//   69  119:istore_2        
			}
			j = i;
	//   70  120:iload_2         
	//   71  121:istore_3        
			if(mConnecting != mediaroutedescriptor.isConnecting())
	//*  72  122:aload_0         
	//*  73  123:getfield        #213 <Field boolean mConnecting>
	//*  74  126:aload_1         
	//*  75  127:invokevirtual   #417 <Method boolean MediaRouteDescriptor.isConnecting()>
	//*  76  130:icmpeq          145
			{
				mConnecting = mediaroutedescriptor.isConnecting();
	//   77  133:aload_0         
	//   78  134:aload_1         
	//   79  135:invokevirtual   #417 <Method boolean MediaRouteDescriptor.isConnecting()>
	//   80  138:putfield        #213 <Field boolean mConnecting>
				j = i | 1;
	//   81  141:iload_2         
	//   82  142:iconst_1        
	//   83  143:ior             
	//   84  144:istore_3        
			}
			i = j;
	//   85  145:iload_3         
	//   86  146:istore_2        
			if(mConnectionState != mediaroutedescriptor.getConnectionState())
	//*  87  147:aload_0         
	//*  88  148:getfield        #137 <Field int mConnectionState>
	//*  89  151:aload_1         
	//*  90  152:invokevirtual   #419 <Method int MediaRouteDescriptor.getConnectionState()>
	//*  91  155:icmpeq          170
			{
				mConnectionState = mediaroutedescriptor.getConnectionState();
	//   92  158:aload_0         
	//   93  159:aload_1         
	//   94  160:invokevirtual   #419 <Method int MediaRouteDescriptor.getConnectionState()>
	//   95  163:putfield        #137 <Field int mConnectionState>
				i = j | 1;
	//   96  166:iload_3         
	//   97  167:iconst_1        
	//   98  168:ior             
	//   99  169:istore_2        
			}
			j = i;
	//  100  170:iload_2         
	//  101  171:istore_3        
			if(!mControlFilters.equals(((Object) (mediaroutedescriptor.getControlFilters()))))
	//* 102  172:aload_0         
	//* 103  173:getfield        #90  <Field ArrayList mControlFilters>
	//* 104  176:aload_1         
	//* 105  177:invokevirtual   #421 <Method List MediaRouteDescriptor.getControlFilters()>
	//* 106  180:invokevirtual   #422 <Method boolean ArrayList.equals(Object)>
	//* 107  183:ifne            209
			{
				mControlFilters.clear();
	//  108  186:aload_0         
	//  109  187:getfield        #90  <Field ArrayList mControlFilters>
	//  110  190:invokevirtual   #425 <Method void ArrayList.clear()>
				mControlFilters.addAll(((java.util.Collection) (mediaroutedescriptor.getControlFilters())));
	//  111  193:aload_0         
	//  112  194:getfield        #90  <Field ArrayList mControlFilters>
	//  113  197:aload_1         
	//  114  198:invokevirtual   #421 <Method List MediaRouteDescriptor.getControlFilters()>
	//  115  201:invokevirtual   #429 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  116  204:pop             
				j = i | 1;
	//  117  205:iload_2         
	//  118  206:iconst_1        
	//  119  207:ior             
	//  120  208:istore_3        
			}
			i = j;
	//  121  209:iload_3         
	//  122  210:istore_2        
			if(mPlaybackType != mediaroutedescriptor.getPlaybackType())
	//* 123  211:aload_0         
	//* 124  212:getfield        #169 <Field int mPlaybackType>
	//* 125  215:aload_1         
	//* 126  216:invokevirtual   #431 <Method int MediaRouteDescriptor.getPlaybackType()>
	//* 127  219:icmpeq          234
			{
				mPlaybackType = mediaroutedescriptor.getPlaybackType();
	//  128  222:aload_0         
	//  129  223:aload_1         
	//  130  224:invokevirtual   #431 <Method int MediaRouteDescriptor.getPlaybackType()>
	//  131  227:putfield        #169 <Field int mPlaybackType>
				i = j | 1;
	//  132  230:iload_3         
	//  133  231:iconst_1        
	//  134  232:ior             
	//  135  233:istore_2        
			}
			j = i;
	//  136  234:iload_2         
	//  137  235:istore_3        
			if(mPlaybackStream != mediaroutedescriptor.getPlaybackStream())
	//* 138  236:aload_0         
	//* 139  237:getfield        #166 <Field int mPlaybackStream>
	//* 140  240:aload_1         
	//* 141  241:invokevirtual   #433 <Method int MediaRouteDescriptor.getPlaybackStream()>
	//* 142  244:icmpeq          259
			{
				mPlaybackStream = mediaroutedescriptor.getPlaybackStream();
	//  143  247:aload_0         
	//  144  248:aload_1         
	//  145  249:invokevirtual   #433 <Method int MediaRouteDescriptor.getPlaybackStream()>
	//  146  252:putfield        #166 <Field int mPlaybackStream>
				j = i | 1;
	//  147  255:iload_2         
	//  148  256:iconst_1        
	//  149  257:ior             
	//  150  258:istore_3        
			}
			i = j;
	//  151  259:iload_3         
	//  152  260:istore_2        
			if(mDeviceType != mediaroutedescriptor.getDeviceType())
	//* 153  261:aload_0         
	//* 154  262:getfield        #150 <Field int mDeviceType>
	//* 155  265:aload_1         
	//* 156  266:invokevirtual   #435 <Method int MediaRouteDescriptor.getDeviceType()>
	//* 157  269:icmpeq          284
			{
				mDeviceType = mediaroutedescriptor.getDeviceType();
	//  158  272:aload_0         
	//  159  273:aload_1         
	//  160  274:invokevirtual   #435 <Method int MediaRouteDescriptor.getDeviceType()>
	//  161  277:putfield        #150 <Field int mDeviceType>
				i = j | 1;
	//  162  280:iload_3         
	//  163  281:iconst_1        
	//  164  282:ior             
	//  165  283:istore_2        
			}
			j = i;
	//  166  284:iload_2         
	//  167  285:istore_3        
			if(mVolumeHandling != mediaroutedescriptor.getVolumeHandling())
	//* 168  286:aload_0         
	//* 169  287:getfield        #202 <Field int mVolumeHandling>
	//* 170  290:aload_1         
	//* 171  291:invokevirtual   #437 <Method int MediaRouteDescriptor.getVolumeHandling()>
	//* 172  294:icmpeq          309
			{
				mVolumeHandling = mediaroutedescriptor.getVolumeHandling();
	//  173  297:aload_0         
	//  174  298:aload_1         
	//  175  299:invokevirtual   #437 <Method int MediaRouteDescriptor.getVolumeHandling()>
	//  176  302:putfield        #202 <Field int mVolumeHandling>
				j = i | 3;
	//  177  305:iload_2         
	//  178  306:iconst_3        
	//  179  307:ior             
	//  180  308:istore_3        
			}
			i = j;
	//  181  309:iload_3         
	//  182  310:istore_2        
			if(mVolume != mediaroutedescriptor.getVolume())
	//* 183  311:aload_0         
	//* 184  312:getfield        #199 <Field int mVolume>
	//* 185  315:aload_1         
	//* 186  316:invokevirtual   #439 <Method int MediaRouteDescriptor.getVolume()>
	//* 187  319:icmpeq          334
			{
				mVolume = mediaroutedescriptor.getVolume();
	//  188  322:aload_0         
	//  189  323:aload_1         
	//  190  324:invokevirtual   #439 <Method int MediaRouteDescriptor.getVolume()>
	//  191  327:putfield        #199 <Field int mVolume>
				i = j | 3;
	//  192  330:iload_3         
	//  193  331:iconst_3        
	//  194  332:ior             
	//  195  333:istore_2        
			}
			j = i;
	//  196  334:iload_2         
	//  197  335:istore_3        
			if(mVolumeMax != mediaroutedescriptor.getVolumeMax())
	//* 198  336:aload_0         
	//* 199  337:getfield        #205 <Field int mVolumeMax>
	//* 200  340:aload_1         
	//* 201  341:invokevirtual   #441 <Method int MediaRouteDescriptor.getVolumeMax()>
	//* 202  344:icmpeq          359
			{
				mVolumeMax = mediaroutedescriptor.getVolumeMax();
	//  203  347:aload_0         
	//  204  348:aload_1         
	//  205  349:invokevirtual   #441 <Method int MediaRouteDescriptor.getVolumeMax()>
	//  206  352:putfield        #205 <Field int mVolumeMax>
				j = i | 3;
	//  207  355:iload_2         
	//  208  356:iconst_3        
	//  209  357:ior             
	//  210  358:istore_3        
			}
			i = j;
	//  211  359:iload_3         
	//  212  360:istore_2        
			if(mPresentationDisplayId != mediaroutedescriptor.getPresentationDisplayId())
	//* 213  361:aload_0         
	//* 214  362:getfield        #92  <Field int mPresentationDisplayId>
	//* 215  365:aload_1         
	//* 216  366:invokevirtual   #443 <Method int MediaRouteDescriptor.getPresentationDisplayId()>
	//* 217  369:icmpeq          389
			{
				mPresentationDisplayId = mediaroutedescriptor.getPresentationDisplayId();
	//  218  372:aload_0         
	//  219  373:aload_1         
	//  220  374:invokevirtual   #443 <Method int MediaRouteDescriptor.getPresentationDisplayId()>
	//  221  377:putfield        #92  <Field int mPresentationDisplayId>
				mPresentationDisplay = null;
	//  222  380:aload_0         
	//  223  381:aconst_null     
	//  224  382:putfield        #176 <Field Display mPresentationDisplay>
				i = j | 5;
	//  225  385:iload_3         
	//  226  386:iconst_5        
	//  227  387:ior             
	//  228  388:istore_2        
			}
			j = i;
	//  229  389:iload_2         
	//  230  390:istore_3        
			if(!MediaRouter.equal(((Object) (mExtras)), ((Object) (mediaroutedescriptor.getExtras()))))
	//* 231  391:aload_0         
	//* 232  392:getfield        #154 <Field Bundle mExtras>
	//* 233  395:aload_1         
	//* 234  396:invokevirtual   #445 <Method Bundle MediaRouteDescriptor.getExtras()>
	//* 235  399:invokestatic    #409 <Method boolean MediaRouter.equal(Object, Object)>
	//* 236  402:ifne            417
			{
				mExtras = mediaroutedescriptor.getExtras();
	//  237  405:aload_0         
	//  238  406:aload_1         
	//  239  407:invokevirtual   #445 <Method Bundle MediaRouteDescriptor.getExtras()>
	//  240  410:putfield        #154 <Field Bundle mExtras>
				j = i | 1;
	//  241  413:iload_2         
	//  242  414:iconst_1        
	//  243  415:ior             
	//  244  416:istore_3        
			}
			i = j;
	//  245  417:iload_3         
	//  246  418:istore_2        
			if(!MediaRouter.equal(((Object) (mSettingsIntent)), ((Object) (mediaroutedescriptor.getSettingsActivity()))))
	//* 247  419:aload_0         
	//* 248  420:getfield        #196 <Field IntentSender mSettingsIntent>
	//* 249  423:aload_1         
	//* 250  424:invokevirtual   #448 <Method IntentSender MediaRouteDescriptor.getSettingsActivity()>
	//* 251  427:invokestatic    #409 <Method boolean MediaRouter.equal(Object, Object)>
	//* 252  430:ifne            445
			{
				mSettingsIntent = mediaroutedescriptor.getSettingsActivity();
	//  253  433:aload_0         
	//  254  434:aload_1         
	//  255  435:invokevirtual   #448 <Method IntentSender MediaRouteDescriptor.getSettingsActivity()>
	//  256  438:putfield        #196 <Field IntentSender mSettingsIntent>
				i = j | 1;
	//  257  441:iload_3         
	//  258  442:iconst_1        
	//  259  443:ior             
	//  260  444:istore_2        
			}
			j = i;
	//  261  445:iload_2         
	//  262  446:istore_3        
			if(mCanDisconnect != mediaroutedescriptor.canDisconnectAndKeepPlaying())
	//* 263  447:aload_0         
	//* 264  448:getfield        #133 <Field boolean mCanDisconnect>
	//* 265  451:aload_1         
	//* 266  452:invokevirtual   #451 <Method boolean MediaRouteDescriptor.canDisconnectAndKeepPlaying()>
	//* 267  455:icmpeq          470
			{
				mCanDisconnect = mediaroutedescriptor.canDisconnectAndKeepPlaying();
	//  268  458:aload_0         
	//  269  459:aload_1         
	//  270  460:invokevirtual   #451 <Method boolean MediaRouteDescriptor.canDisconnectAndKeepPlaying()>
	//  271  463:putfield        #133 <Field boolean mCanDisconnect>
				j = i | 5;
	//  272  466:iload_2         
	//  273  467:iconst_5        
	//  274  468:ior             
	//  275  469:istore_3        
			}
		}
		return j;
	//  276  470:iload_3         
	//  277  471:ireturn         
	}

	static final int CHANGE_GENERAL = 1;
	static final int CHANGE_PRESENTATION_DISPLAY = 4;
	static final int CHANGE_VOLUME = 2;
	public static final int CONNECTION_STATE_CONNECTED = 2;
	public static final int CONNECTION_STATE_CONNECTING = 1;
	public static final int CONNECTION_STATE_DISCONNECTED = 0;
	public static final int DEVICE_TYPE_BLUETOOTH = 3;
	public static final int DEVICE_TYPE_SPEAKER = 2;
	public static final int DEVICE_TYPE_TV = 1;
	public static final int DEVICE_TYPE_UNKNOWN = 0;
	public static final int PLAYBACK_TYPE_LOCAL = 0;
	public static final int PLAYBACK_TYPE_REMOTE = 1;
	public static final int PLAYBACK_VOLUME_FIXED = 0;
	public static final int PLAYBACK_VOLUME_VARIABLE = 1;
	public static final int PRESENTATION_DISPLAY_ID_NONE = -1;
	static final String SYSTEM_MEDIA_ROUTE_PROVIDER_PACKAGE_NAME = "android";
	private boolean mCanDisconnect;
	private boolean mConnecting;
	private int mConnectionState;
	private final ArrayList mControlFilters = new ArrayList();
	private String mDescription;
	MediaRouteDescriptor mDescriptor;
	private final String mDescriptorId;
	private int mDeviceType;
	private boolean mEnabled;
	private Bundle mExtras;
	private Uri mIconUri;
	private String mName;
	private int mPlaybackStream;
	private int mPlaybackType;
	private Display mPresentationDisplay;
	private int mPresentationDisplayId;
	private final fo mProvider;
	private IntentSender mSettingsIntent;
	private final String mUniqueId;
	private int mVolume;
	private int mVolumeHandling;
	private int mVolumeMax;


/*
	static String access$100(MediaRouter$RouteInfo mediarouter$routeinfo)
	{
		return mediarouter$routeinfo.mDescriptorId;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String mDescriptorId>
	//    2    4:areturn         
	}

*/


/*
	static String access$300(MediaRouter$RouteInfo mediarouter$routeinfo)
	{
		return mediarouter$routeinfo.mUniqueId;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String mUniqueId>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$400(MediaRouter$RouteInfo mediarouter$routeinfo)
	{
		return mediarouter$routeinfo.mEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field boolean mEnabled>
	//    2    4:ireturn         
	}

*/

	MediaRouter$RouteInfo(fo fo, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #87  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #88  <Method void ArrayList()>
	//    6   12:putfield        #90  <Field ArrayList mControlFilters>
		mPresentationDisplayId = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #92  <Field int mPresentationDisplayId>
		mProvider = fo;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #94  <Field MediaRouter$ProviderInfo mProvider>
		mDescriptorId = s;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #96  <Field String mDescriptorId>
		mUniqueId = s1;
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:putfield        #98  <Field String mUniqueId>
	//   19   35:return          
	}
}
