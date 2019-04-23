// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.*;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.g.p;
import android.text.TextUtils;
import android.view.Display;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//			MediaRouteProvider, MediaRouter, MediaRouteSelector, MediaRouteDescriptor

public class MediaRouter$RouteInfo
{

	private static boolean isSystemMediaRouteProvider(MediaRouter$RouteInfo mediarouter$routeinfo)
	{
		return TextUtils.equals(((CharSequence) (mediarouter$routeinfo.getProviderInstance().getMetadata().getPackageName())), "android");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method MediaRouteProvider getProviderInstance()>
	//    2    4:invokevirtual   #91  <Method MediaRouteProvider$ProviderMetadata MediaRouteProvider.getMetadata()>
	//    3    7:invokevirtual   #97  <Method String MediaRouteProvider$ProviderMetadata.getPackageName()>
	//    4   10:ldc1            #30  <String "android">
	//    5   12:invokestatic    #103 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//    6   15:ireturn         
	}

	public boolean canDisconnect()
	{
		return mCanDisconnect;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean mCanDisconnect>
	//    2    4:ireturn         
	}

	public int getConnectionState()
	{
		return mConnectionState;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field int mConnectionState>
	//    2    4:ireturn         
	}

	public List getControlFilters()
	{
		return ((List) (mControlFilters));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ArrayList mControlFilters>
	//    2    4:areturn         
	}

	public String getDescription()
	{
		return mDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field String mDescription>
	//    2    4:areturn         
	}

	String getDescriptorId()
	{
		return mDescriptorId;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String mDescriptorId>
	//    2    4:areturn         
	}

	public int getDeviceType()
	{
		return mDeviceType;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field int mDeviceType>
	//    2    4:ireturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public Uri getIconUri()
	{
		return mIconUri;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field Uri mIconUri>
	//    2    4:areturn         
	}

	public String getId()
	{
		return mUniqueId;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String mUniqueId>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field String mName>
	//    2    4:areturn         
	}

	public int getPlaybackStream()
	{
		return mPlaybackStream;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field int mPlaybackStream>
	//    2    4:ireturn         
	}

	public int getPlaybackType()
	{
		return mPlaybackType;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field int mPlaybackType>
	//    2    4:ireturn         
	}

	public Display getPresentationDisplay()
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #145 <Method void MediaRouter.checkCallingThread()>
		if(mPresentationDisplayId >= 0 && mPresentationDisplay == null)
	//*   1    3:aload_0         
	//*   2    4:getfield        #72  <Field int mPresentationDisplayId>
	//*   3    7:iflt            31
	//*   4   10:aload_0         
	//*   5   11:getfield        #147 <Field Display mPresentationDisplay>
	//*   6   14:ifnonnull       31
			mPresentationDisplay = MediaRouter.sGlobal.getDisplay(mPresentationDisplayId);
	//    7   17:aload_0         
	//    8   18:getstatic       #151 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    9   21:aload_0         
	//   10   22:getfield        #72  <Field int mPresentationDisplayId>
	//   11   25:invokevirtual   #157 <Method Display MediaRouter$GlobalMediaRouter.getDisplay(int)>
	//   12   28:putfield        #147 <Field Display mPresentationDisplay>
		return mPresentationDisplay;
	//   13   31:aload_0         
	//   14   32:getfield        #147 <Field Display mPresentationDisplay>
	//   15   35:areturn         
	}

	public int getPresentationDisplayId()
	{
		return mPresentationDisplayId;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int mPresentationDisplayId>
	//    2    4:ireturn         
	}

	public fo getProvider()
	{
		return mProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field MediaRouter$ProviderInfo mProvider>
	//    2    4:areturn         
	}

	public MediaRouteProvider getProviderInstance()
	{
		return mProvider.getProviderInstance();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field MediaRouter$ProviderInfo mProvider>
	//    2    4:invokevirtual   #163 <Method MediaRouteProvider MediaRouter$ProviderInfo.getProviderInstance()>
	//    3    7:areturn         
	}

	public IntentSender getSettingsIntent()
	{
		return mSettingsIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field IntentSender mSettingsIntent>
	//    2    4:areturn         
	}

	public int getVolume()
	{
		return mVolume;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field int mVolume>
	//    2    4:ireturn         
	}

	public int getVolumeHandling()
	{
		return mVolumeHandling;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field int mVolumeHandling>
	//    2    4:ireturn         
	}

	public int getVolumeMax()
	{
		return mVolumeMax;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field int mVolumeMax>
	//    2    4:ireturn         
	}

	public boolean isBluetooth()
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #145 <Method void MediaRouter.checkCallingThread()>
		return MediaRouter.sGlobal.getBluetoothRoute() == this;
	//    1    3:getstatic       #151 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    2    6:invokevirtual   #181 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getBluetoothRoute()>
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
	//    1    1:getfield        #184 <Field boolean mConnecting>
	//    2    4:ireturn         
	}

	public boolean isDefault()
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #145 <Method void MediaRouter.checkCallingThread()>
		return MediaRouter.sGlobal.getDefaultRoute() == this;
	//    1    3:getstatic       #151 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    2    6:invokevirtual   #188 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getDefaultRoute()>
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
	//*   1    1:invokevirtual   #191 <Method boolean isDefault()>
	//*   2    4:ifne            46
		{
			if(mDeviceType == 3)
	//*   3    7:aload_0         
	//*   4    8:getfield        #120 <Field int mDeviceType>
	//*   5   11:iconst_3        
	//*   6   12:icmpne          17
				return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
			return isSystemMediaRouteProvider(this) && supportsControlCategory("android.media.intent.category.LIVE_AUDIO") && !supportsControlCategory("android.media.intent.category.LIVE_VIDEO");
	//    9   17:aload_0         
	//   10   18:invokestatic    #193 <Method boolean isSystemMediaRouteProvider(MediaRouter$RouteInfo)>
	//   11   21:ifeq            44
	//   12   24:aload_0         
	//   13   25:ldc1            #195 <String "android.media.intent.category.LIVE_AUDIO">
	//   14   27:invokevirtual   #199 <Method boolean supportsControlCategory(String)>
	//   15   30:ifeq            44
	//   16   33:aload_0         
	//   17   34:ldc1            #201 <String "android.media.intent.category.LIVE_VIDEO">
	//   18   36:invokevirtual   #199 <Method boolean supportsControlCategory(String)>
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
	//    0    0:invokestatic    #208 <Method Resources Resources.getSystem()>
	//    1    3:ldc1            #210 <String "default_audio_route_name">
	//    2    5:ldc1            #212 <String "string">
	//    3    7:ldc1            #30  <String "android">
	//    4    9:invokevirtual   #216 <Method int Resources.getIdentifier(String, String, String)>
	//    5   12:istore_1        
		return isDefault() && ((Object) (Resources.getSystem().getText(i))).equals(((Object) (mName)));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #191 <Method boolean isDefault()>
	//    8   17:ifeq            39
	//    9   20:invokestatic    #208 <Method Resources Resources.getSystem()>
	//   10   23:iload_1         
	//   11   24:invokevirtual   #220 <Method CharSequence Resources.getText(int)>
	//   12   27:aload_0         
	//   13   28:getfield        #132 <Field String mName>
	//   14   31:invokevirtual   #223 <Method boolean Object.equals(Object)>
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
	//    1    1:getfield        #226 <Field boolean mEnabled>
	//    2    4:ireturn         
	}

	boolean isSelectable()
	{
		return mDescriptor != null && mEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field MediaRouteDescriptor mDescriptor>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:getfield        #226 <Field boolean mEnabled>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean isSelected()
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #145 <Method void MediaRouter.checkCallingThread()>
		return MediaRouter.sGlobal.getSelectedRoute() == this;
	//    1    3:getstatic       #151 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    2    6:invokevirtual   #233 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getSelectedRoute()>
	//    3    9:aload_0         
	//    4   10:if_acmpne       15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean matchesSelector(MediaRouteSelector mediarouteselector)
	{
		if(mediarouteselector != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
		{
			MediaRouter.checkCallingThread();
	//    2    4:invokestatic    #145 <Method void MediaRouter.checkCallingThread()>
			return mediarouteselector.matchesControlFilters(((List) (mControlFilters)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #70  <Field ArrayList mControlFilters>
	//    6   12:invokevirtual   #241 <Method boolean MediaRouteSelector.matchesControlFilters(List)>
	//    7   15:ireturn         
		} else
		{
			throw new IllegalArgumentException("selector must not be null");
	//    8   16:new             #243 <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:ldc1            #245 <String "selector must not be null">
	//   11   22:invokespecial   #248 <Method void IllegalArgumentException(String)>
	//   12   25:athrow          
		}
	}

	int maybeUpdateDescriptor(MediaRouteDescriptor mediaroutedescriptor)
	{
		if(mDescriptor != mediaroutedescriptor)
	//*   0    0:aload_0         
	//*   1    1:getfield        #229 <Field MediaRouteDescriptor mDescriptor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       14
			return updateDescriptor(mediaroutedescriptor);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #253 <Method int updateDescriptor(MediaRouteDescriptor)>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public void requestSetVolume(int i)
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #145 <Method void MediaRouter.checkCallingThread()>
		MediaRouter.sGlobal.requestSetVolume(this, Math.min(mVolumeMax, Math.max(0, i)));
	//    1    3:getstatic       #151 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    2    6:aload_0         
	//    3    7:aload_0         
	//    4    8:getfield        #176 <Field int mVolumeMax>
	//    5   11:iconst_0        
	//    6   12:iload_1         
	//    7   13:invokestatic    #261 <Method int Math.max(int, int)>
	//    8   16:invokestatic    #264 <Method int Math.min(int, int)>
	//    9   19:invokevirtual   #267 <Method void MediaRouter$GlobalMediaRouter.requestSetVolume(MediaRouter$RouteInfo, int)>
	//   10   22:return          
	}

	public void requestUpdateVolume(int i)
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #145 <Method void MediaRouter.checkCallingThread()>
		if(i != 0)
	//*   1    3:iload_1         
	//*   2    4:ifeq            15
			MediaRouter.sGlobal.requestUpdateVolume(this, i);
	//    3    7:getstatic       #151 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    4   10:aload_0         
	//    5   11:iload_1         
	//    6   12:invokevirtual   #270 <Method void MediaRouter$GlobalMediaRouter.requestUpdateVolume(MediaRouter$RouteInfo, int)>
	//    7   15:return          
	}

	public void select()
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #145 <Method void MediaRouter.checkCallingThread()>
		MediaRouter.sGlobal.selectRoute(this);
	//    1    3:getstatic       #151 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #275 <Method void MediaRouter$GlobalMediaRouter.selectRoute(MediaRouter$RouteInfo)>
	//    4   10:return          
	}

	public void sendControlRequest(Intent intent, uestCallback uestcallback)
	{
		if(intent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
		{
			MediaRouter.checkCallingThread();
	//    2    4:invokestatic    #145 <Method void MediaRouter.checkCallingThread()>
			MediaRouter.sGlobal.sendControlRequest(this, intent, uestcallback);
	//    3    7:getstatic       #151 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #280 <Method void MediaRouter$GlobalMediaRouter.sendControlRequest(MediaRouter$RouteInfo, Intent, MediaRouter$ControlRequestCallback)>
			return;
	//    8   16:return          
		} else
		{
			throw new IllegalArgumentException("intent must not be null");
	//    9   17:new             #243 <Class IllegalArgumentException>
	//   10   20:dup             
	//   11   21:ldc2            #282 <String "intent must not be null">
	//   12   24:invokespecial   #248 <Method void IllegalArgumentException(String)>
	//   13   27:athrow          
		}
	}

	public boolean supportsControlAction(String s, String s1)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          81
		{
			if(s1 != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          70
			{
				MediaRouter.checkCallingThread();
	//    4    8:invokestatic    #145 <Method void MediaRouter.checkCallingThread()>
				int j = mControlFilters.size();
	//    5   11:aload_0         
	//    6   12:getfield        #70  <Field ArrayList mControlFilters>
	//    7   15:invokevirtual   #287 <Method int ArrayList.size()>
	//    8   18:istore          4
				for(int i = 0; i < j; i++)
	//*   9   20:iconst_0        
	//*  10   21:istore_3        
	//*  11   22:iload_3         
	//*  12   23:iload           4
	//*  13   25:icmpge          68
				{
					IntentFilter intentfilter = (IntentFilter)mControlFilters.get(i);
	//   14   28:aload_0         
	//   15   29:getfield        #70  <Field ArrayList mControlFilters>
	//   16   32:iload_3         
	//   17   33:invokevirtual   #291 <Method Object ArrayList.get(int)>
	//   18   36:checkcast       #293 <Class IntentFilter>
	//   19   39:astore          5
					if(intentfilter.hasCategory(s) && intentfilter.hasAction(s1))
	//*  20   41:aload           5
	//*  21   43:aload_1         
	//*  22   44:invokevirtual   #296 <Method boolean IntentFilter.hasCategory(String)>
	//*  23   47:ifeq            61
	//*  24   50:aload           5
	//*  25   52:aload_2         
	//*  26   53:invokevirtual   #299 <Method boolean IntentFilter.hasAction(String)>
	//*  27   56:ifeq            61
						return true;
	//   28   59:iconst_1        
	//   29   60:ireturn         
				}

	//   30   61:iload_3         
	//   31   62:iconst_1        
	//   32   63:iadd            
	//   33   64:istore_3        
	//*  34   65:goto            22
				return false;
	//   35   68:iconst_0        
	//   36   69:ireturn         
			} else
			{
				throw new IllegalArgumentException("action must not be null");
	//   37   70:new             #243 <Class IllegalArgumentException>
	//   38   73:dup             
	//   39   74:ldc2            #301 <String "action must not be null">
	//   40   77:invokespecial   #248 <Method void IllegalArgumentException(String)>
	//   41   80:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("category must not be null");
	//   42   81:new             #243 <Class IllegalArgumentException>
	//   43   84:dup             
	//   44   85:ldc2            #303 <String "category must not be null">
	//   45   88:invokespecial   #248 <Method void IllegalArgumentException(String)>
	//   46   91:athrow          
		}
	}

	public boolean supportsControlCategory(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          51
		{
			MediaRouter.checkCallingThread();
	//    2    4:invokestatic    #145 <Method void MediaRouter.checkCallingThread()>
			int j = mControlFilters.size();
	//    3    7:aload_0         
	//    4    8:getfield        #70  <Field ArrayList mControlFilters>
	//    5   11:invokevirtual   #287 <Method int ArrayList.size()>
	//    6   14:istore_3        
			for(int i = 0; i < j; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_2        
	//*   9   17:iload_2         
	//*  10   18:iload_3         
	//*  11   19:icmpge          49
				if(((IntentFilter)mControlFilters.get(i)).hasCategory(s))
	//*  12   22:aload_0         
	//*  13   23:getfield        #70  <Field ArrayList mControlFilters>
	//*  14   26:iload_2         
	//*  15   27:invokevirtual   #291 <Method Object ArrayList.get(int)>
	//*  16   30:checkcast       #293 <Class IntentFilter>
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #296 <Method boolean IntentFilter.hasCategory(String)>
	//*  19   37:ifeq            42
					return true;
	//   20   40:iconst_1        
	//   21   41:ireturn         

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
	//*  26   46:goto            17
			return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
		} else
		{
			throw new IllegalArgumentException("category must not be null");
	//   29   51:new             #243 <Class IllegalArgumentException>
	//   30   54:dup             
	//   31   55:ldc2            #303 <String "category must not be null">
	//   32   58:invokespecial   #248 <Method void IllegalArgumentException(String)>
	//   33   61:athrow          
		}
	}

	public boolean supportsControlRequest(Intent intent)
	{
		if(intent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
		{
			MediaRouter.checkCallingThread();
	//    2    4:invokestatic    #145 <Method void MediaRouter.checkCallingThread()>
			android.content.ContentResolver contentresolver = MediaRouter.sGlobal.getContentResolver();
	//    3    7:getstatic       #151 <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//    4   10:invokevirtual   #309 <Method android.content.ContentResolver MediaRouter$GlobalMediaRouter.getContentResolver()>
	//    5   13:astore          4
			int j = mControlFilters.size();
	//    6   15:aload_0         
	//    7   16:getfield        #70  <Field ArrayList mControlFilters>
	//    8   19:invokevirtual   #287 <Method int ArrayList.size()>
	//    9   22:istore_3        
			for(int i = 0; i < j; i++)
	//*  10   23:iconst_0        
	//*  11   24:istore_2        
	//*  12   25:iload_2         
	//*  13   26:iload_3         
	//*  14   27:icmpge          63
				if(((IntentFilter)mControlFilters.get(i)).match(contentresolver, intent, true, "MediaRouter") >= 0)
	//*  15   30:aload_0         
	//*  16   31:getfield        #70  <Field ArrayList mControlFilters>
	//*  17   34:iload_2         
	//*  18   35:invokevirtual   #291 <Method Object ArrayList.get(int)>
	//*  19   38:checkcast       #293 <Class IntentFilter>
	//*  20   41:aload           4
	//*  21   43:aload_1         
	//*  22   44:iconst_1        
	//*  23   45:ldc2            #311 <String "MediaRouter">
	//*  24   48:invokevirtual   #315 <Method int IntentFilter.match(android.content.ContentResolver, Intent, boolean, String)>
	//*  25   51:iflt            56
					return true;
	//   26   54:iconst_1        
	//   27   55:ireturn         

	//   28   56:iload_2         
	//   29   57:iconst_1        
	//   30   58:iadd            
	//   31   59:istore_2        
	//*  32   60:goto            25
			return false;
	//   33   63:iconst_0        
	//   34   64:ireturn         
		} else
		{
			throw new IllegalArgumentException("intent must not be null");
	//   35   65:new             #243 <Class IllegalArgumentException>
	//   36   68:dup             
	//   37   69:ldc2            #282 <String "intent must not be null">
	//   38   72:invokespecial   #248 <Method void IllegalArgumentException(String)>
	//   39   75:athrow          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #318 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #319 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MediaRouter.RouteInfo{ uniqueId=");
	//    4    8:aload_1         
	//    5    9:ldc2            #321 <String "MediaRouter.RouteInfo{ uniqueId=">
	//    6   12:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(mUniqueId);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #78  <Field String mUniqueId>
	//   11   21:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(", name=");
	//   13   25:aload_1         
	//   14   26:ldc2            #327 <String ", name=">
	//   15   29:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(mName);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #132 <Field String mName>
	//   20   38:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		stringbuilder.append(", description=");
	//   22   42:aload_1         
	//   23   43:ldc2            #329 <String ", description=">
	//   24   46:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		stringbuilder.append(mDescription);
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #116 <Field String mDescription>
	//   29   55:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
		stringbuilder.append(", iconUri=");
	//   31   59:aload_1         
	//   32   60:ldc2            #331 <String ", iconUri=">
	//   33   63:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
		stringbuilder.append(((Object) (mIconUri)));
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:getfield        #128 <Field Uri mIconUri>
	//   38   72:invokevirtual   #334 <Method StringBuilder StringBuilder.append(Object)>
	//   39   75:pop             
		stringbuilder.append(", enabled=");
	//   40   76:aload_1         
	//   41   77:ldc2            #336 <String ", enabled=">
	//   42   80:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
		stringbuilder.append(mEnabled);
	//   44   84:aload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #226 <Field boolean mEnabled>
	//   47   89:invokevirtual   #339 <Method StringBuilder StringBuilder.append(boolean)>
	//   48   92:pop             
		stringbuilder.append(", connecting=");
	//   49   93:aload_1         
	//   50   94:ldc2            #341 <String ", connecting=">
	//   51   97:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//   52  100:pop             
		stringbuilder.append(mConnecting);
	//   53  101:aload_1         
	//   54  102:aload_0         
	//   55  103:getfield        #184 <Field boolean mConnecting>
	//   56  106:invokevirtual   #339 <Method StringBuilder StringBuilder.append(boolean)>
	//   57  109:pop             
		stringbuilder.append(", connectionState=");
	//   58  110:aload_1         
	//   59  111:ldc2            #343 <String ", connectionState=">
	//   60  114:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//   61  117:pop             
		stringbuilder.append(mConnectionState);
	//   62  118:aload_1         
	//   63  119:aload_0         
	//   64  120:getfield        #111 <Field int mConnectionState>
	//   65  123:invokevirtual   #346 <Method StringBuilder StringBuilder.append(int)>
	//   66  126:pop             
		stringbuilder.append(", canDisconnect=");
	//   67  127:aload_1         
	//   68  128:ldc2            #348 <String ", canDisconnect=">
	//   69  131:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//   70  134:pop             
		stringbuilder.append(mCanDisconnect);
	//   71  135:aload_1         
	//   72  136:aload_0         
	//   73  137:getfield        #107 <Field boolean mCanDisconnect>
	//   74  140:invokevirtual   #339 <Method StringBuilder StringBuilder.append(boolean)>
	//   75  143:pop             
		stringbuilder.append(", playbackType=");
	//   76  144:aload_1         
	//   77  145:ldc2            #350 <String ", playbackType=">
	//   78  148:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//   79  151:pop             
		stringbuilder.append(mPlaybackType);
	//   80  152:aload_1         
	//   81  153:aload_0         
	//   82  154:getfield        #138 <Field int mPlaybackType>
	//   83  157:invokevirtual   #346 <Method StringBuilder StringBuilder.append(int)>
	//   84  160:pop             
		stringbuilder.append(", playbackStream=");
	//   85  161:aload_1         
	//   86  162:ldc2            #352 <String ", playbackStream=">
	//   87  165:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//   88  168:pop             
		stringbuilder.append(mPlaybackStream);
	//   89  169:aload_1         
	//   90  170:aload_0         
	//   91  171:getfield        #135 <Field int mPlaybackStream>
	//   92  174:invokevirtual   #346 <Method StringBuilder StringBuilder.append(int)>
	//   93  177:pop             
		stringbuilder.append(", deviceType=");
	//   94  178:aload_1         
	//   95  179:ldc2            #354 <String ", deviceType=">
	//   96  182:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//   97  185:pop             
		stringbuilder.append(mDeviceType);
	//   98  186:aload_1         
	//   99  187:aload_0         
	//  100  188:getfield        #120 <Field int mDeviceType>
	//  101  191:invokevirtual   #346 <Method StringBuilder StringBuilder.append(int)>
	//  102  194:pop             
		stringbuilder.append(", volumeHandling=");
	//  103  195:aload_1         
	//  104  196:ldc2            #356 <String ", volumeHandling=">
	//  105  199:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//  106  202:pop             
		stringbuilder.append(mVolumeHandling);
	//  107  203:aload_1         
	//  108  204:aload_0         
	//  109  205:getfield        #173 <Field int mVolumeHandling>
	//  110  208:invokevirtual   #346 <Method StringBuilder StringBuilder.append(int)>
	//  111  211:pop             
		stringbuilder.append(", volume=");
	//  112  212:aload_1         
	//  113  213:ldc2            #358 <String ", volume=">
	//  114  216:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//  115  219:pop             
		stringbuilder.append(mVolume);
	//  116  220:aload_1         
	//  117  221:aload_0         
	//  118  222:getfield        #170 <Field int mVolume>
	//  119  225:invokevirtual   #346 <Method StringBuilder StringBuilder.append(int)>
	//  120  228:pop             
		stringbuilder.append(", volumeMax=");
	//  121  229:aload_1         
	//  122  230:ldc2            #360 <String ", volumeMax=">
	//  123  233:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//  124  236:pop             
		stringbuilder.append(mVolumeMax);
	//  125  237:aload_1         
	//  126  238:aload_0         
	//  127  239:getfield        #176 <Field int mVolumeMax>
	//  128  242:invokevirtual   #346 <Method StringBuilder StringBuilder.append(int)>
	//  129  245:pop             
		stringbuilder.append(", presentationDisplayId=");
	//  130  246:aload_1         
	//  131  247:ldc2            #362 <String ", presentationDisplayId=">
	//  132  250:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//  133  253:pop             
		stringbuilder.append(mPresentationDisplayId);
	//  134  254:aload_1         
	//  135  255:aload_0         
	//  136  256:getfield        #72  <Field int mPresentationDisplayId>
	//  137  259:invokevirtual   #346 <Method StringBuilder StringBuilder.append(int)>
	//  138  262:pop             
		stringbuilder.append(", extras=");
	//  139  263:aload_1         
	//  140  264:ldc2            #364 <String ", extras=">
	//  141  267:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//  142  270:pop             
		stringbuilder.append(((Object) (mExtras)));
	//  143  271:aload_1         
	//  144  272:aload_0         
	//  145  273:getfield        #124 <Field Bundle mExtras>
	//  146  276:invokevirtual   #334 <Method StringBuilder StringBuilder.append(Object)>
	//  147  279:pop             
		stringbuilder.append(", settingsIntent=");
	//  148  280:aload_1         
	//  149  281:ldc2            #366 <String ", settingsIntent=">
	//  150  284:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//  151  287:pop             
		stringbuilder.append(((Object) (mSettingsIntent)));
	//  152  288:aload_1         
	//  153  289:aload_0         
	//  154  290:getfield        #167 <Field IntentSender mSettingsIntent>
	//  155  293:invokevirtual   #334 <Method StringBuilder StringBuilder.append(Object)>
	//  156  296:pop             
		stringbuilder.append(", providerPackageName=");
	//  157  297:aload_1         
	//  158  298:ldc2            #368 <String ", providerPackageName=">
	//  159  301:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//  160  304:pop             
		stringbuilder.append(mProvider.getPackageName());
	//  161  305:aload_1         
	//  162  306:aload_0         
	//  163  307:getfield        #74  <Field MediaRouter$ProviderInfo mProvider>
	//  164  310:invokevirtual   #369 <Method String MediaRouter$ProviderInfo.getPackageName()>
	//  165  313:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//  166  316:pop             
		stringbuilder.append(" }");
	//  167  317:aload_1         
	//  168  318:ldc2            #371 <String " }">
	//  169  321:invokevirtual   #325 <Method StringBuilder StringBuilder.append(String)>
	//  170  324:pop             
		return stringbuilder.toString();
	//  171  325:aload_1         
	//  172  326:invokevirtual   #373 <Method String StringBuilder.toString()>
	//  173  329:areturn         
	}

	int updateDescriptor(MediaRouteDescriptor mediaroutedescriptor)
	{
		mDescriptor = mediaroutedescriptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #229 <Field MediaRouteDescriptor mDescriptor>
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
			if(!p.a(((Object) (mName)), ((Object) (mediaroutedescriptor.getName()))))
	//*  11   15:aload_0         
	//*  12   16:getfield        #132 <Field String mName>
	//*  13   19:aload_1         
	//*  14   20:invokevirtual   #377 <Method String MediaRouteDescriptor.getName()>
	//*  15   23:invokestatic    #383 <Method boolean p.a(Object, Object)>
	//*  16   26:ifne            39
			{
				mName = mediaroutedescriptor.getName();
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:invokevirtual   #377 <Method String MediaRouteDescriptor.getName()>
	//   20   34:putfield        #132 <Field String mName>
				j = 1;
	//   21   37:iconst_1        
	//   22   38:istore_3        
			}
			i = j;
	//   23   39:iload_3         
	//   24   40:istore_2        
			if(!p.a(((Object) (mDescription)), ((Object) (mediaroutedescriptor.getDescription()))))
	//*  25   41:aload_0         
	//*  26   42:getfield        #116 <Field String mDescription>
	//*  27   45:aload_1         
	//*  28   46:invokevirtual   #385 <Method String MediaRouteDescriptor.getDescription()>
	//*  29   49:invokestatic    #383 <Method boolean p.a(Object, Object)>
	//*  30   52:ifne            67
			{
				mDescription = mediaroutedescriptor.getDescription();
	//   31   55:aload_0         
	//   32   56:aload_1         
	//   33   57:invokevirtual   #385 <Method String MediaRouteDescriptor.getDescription()>
	//   34   60:putfield        #116 <Field String mDescription>
				i = j | 1;
	//   35   63:iload_3         
	//   36   64:iconst_1        
	//   37   65:ior             
	//   38   66:istore_2        
			}
			j = i;
	//   39   67:iload_2         
	//   40   68:istore_3        
			if(!p.a(((Object) (mIconUri)), ((Object) (mediaroutedescriptor.getIconUri()))))
	//*  41   69:aload_0         
	//*  42   70:getfield        #128 <Field Uri mIconUri>
	//*  43   73:aload_1         
	//*  44   74:invokevirtual   #387 <Method Uri MediaRouteDescriptor.getIconUri()>
	//*  45   77:invokestatic    #383 <Method boolean p.a(Object, Object)>
	//*  46   80:ifne            95
			{
				mIconUri = mediaroutedescriptor.getIconUri();
	//   47   83:aload_0         
	//   48   84:aload_1         
	//   49   85:invokevirtual   #387 <Method Uri MediaRouteDescriptor.getIconUri()>
	//   50   88:putfield        #128 <Field Uri mIconUri>
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
	//*  58   98:getfield        #226 <Field boolean mEnabled>
	//*  59  101:aload_1         
	//*  60  102:invokevirtual   #389 <Method boolean MediaRouteDescriptor.isEnabled()>
	//*  61  105:icmpeq          120
			{
				mEnabled = mediaroutedescriptor.isEnabled();
	//   62  108:aload_0         
	//   63  109:aload_1         
	//   64  110:invokevirtual   #389 <Method boolean MediaRouteDescriptor.isEnabled()>
	//   65  113:putfield        #226 <Field boolean mEnabled>
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
	//*  73  123:getfield        #184 <Field boolean mConnecting>
	//*  74  126:aload_1         
	//*  75  127:invokevirtual   #391 <Method boolean MediaRouteDescriptor.isConnecting()>
	//*  76  130:icmpeq          145
			{
				mConnecting = mediaroutedescriptor.isConnecting();
	//   77  133:aload_0         
	//   78  134:aload_1         
	//   79  135:invokevirtual   #391 <Method boolean MediaRouteDescriptor.isConnecting()>
	//   80  138:putfield        #184 <Field boolean mConnecting>
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
	//*  88  148:getfield        #111 <Field int mConnectionState>
	//*  89  151:aload_1         
	//*  90  152:invokevirtual   #393 <Method int MediaRouteDescriptor.getConnectionState()>
	//*  91  155:icmpeq          170
			{
				mConnectionState = mediaroutedescriptor.getConnectionState();
	//   92  158:aload_0         
	//   93  159:aload_1         
	//   94  160:invokevirtual   #393 <Method int MediaRouteDescriptor.getConnectionState()>
	//   95  163:putfield        #111 <Field int mConnectionState>
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
	//* 103  173:getfield        #70  <Field ArrayList mControlFilters>
	//* 104  176:aload_1         
	//* 105  177:invokevirtual   #395 <Method List MediaRouteDescriptor.getControlFilters()>
	//* 106  180:invokevirtual   #396 <Method boolean ArrayList.equals(Object)>
	//* 107  183:ifne            209
			{
				mControlFilters.clear();
	//  108  186:aload_0         
	//  109  187:getfield        #70  <Field ArrayList mControlFilters>
	//  110  190:invokevirtual   #399 <Method void ArrayList.clear()>
				mControlFilters.addAll(((java.util.Collection) (mediaroutedescriptor.getControlFilters())));
	//  111  193:aload_0         
	//  112  194:getfield        #70  <Field ArrayList mControlFilters>
	//  113  197:aload_1         
	//  114  198:invokevirtual   #395 <Method List MediaRouteDescriptor.getControlFilters()>
	//  115  201:invokevirtual   #403 <Method boolean ArrayList.addAll(java.util.Collection)>
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
	//* 124  212:getfield        #138 <Field int mPlaybackType>
	//* 125  215:aload_1         
	//* 126  216:invokevirtual   #405 <Method int MediaRouteDescriptor.getPlaybackType()>
	//* 127  219:icmpeq          234
			{
				mPlaybackType = mediaroutedescriptor.getPlaybackType();
	//  128  222:aload_0         
	//  129  223:aload_1         
	//  130  224:invokevirtual   #405 <Method int MediaRouteDescriptor.getPlaybackType()>
	//  131  227:putfield        #138 <Field int mPlaybackType>
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
	//* 139  237:getfield        #135 <Field int mPlaybackStream>
	//* 140  240:aload_1         
	//* 141  241:invokevirtual   #407 <Method int MediaRouteDescriptor.getPlaybackStream()>
	//* 142  244:icmpeq          259
			{
				mPlaybackStream = mediaroutedescriptor.getPlaybackStream();
	//  143  247:aload_0         
	//  144  248:aload_1         
	//  145  249:invokevirtual   #407 <Method int MediaRouteDescriptor.getPlaybackStream()>
	//  146  252:putfield        #135 <Field int mPlaybackStream>
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
	//* 154  262:getfield        #120 <Field int mDeviceType>
	//* 155  265:aload_1         
	//* 156  266:invokevirtual   #409 <Method int MediaRouteDescriptor.getDeviceType()>
	//* 157  269:icmpeq          284
			{
				mDeviceType = mediaroutedescriptor.getDeviceType();
	//  158  272:aload_0         
	//  159  273:aload_1         
	//  160  274:invokevirtual   #409 <Method int MediaRouteDescriptor.getDeviceType()>
	//  161  277:putfield        #120 <Field int mDeviceType>
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
	//* 169  287:getfield        #173 <Field int mVolumeHandling>
	//* 170  290:aload_1         
	//* 171  291:invokevirtual   #411 <Method int MediaRouteDescriptor.getVolumeHandling()>
	//* 172  294:icmpeq          309
			{
				mVolumeHandling = mediaroutedescriptor.getVolumeHandling();
	//  173  297:aload_0         
	//  174  298:aload_1         
	//  175  299:invokevirtual   #411 <Method int MediaRouteDescriptor.getVolumeHandling()>
	//  176  302:putfield        #173 <Field int mVolumeHandling>
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
	//* 184  312:getfield        #170 <Field int mVolume>
	//* 185  315:aload_1         
	//* 186  316:invokevirtual   #413 <Method int MediaRouteDescriptor.getVolume()>
	//* 187  319:icmpeq          334
			{
				mVolume = mediaroutedescriptor.getVolume();
	//  188  322:aload_0         
	//  189  323:aload_1         
	//  190  324:invokevirtual   #413 <Method int MediaRouteDescriptor.getVolume()>
	//  191  327:putfield        #170 <Field int mVolume>
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
	//* 199  337:getfield        #176 <Field int mVolumeMax>
	//* 200  340:aload_1         
	//* 201  341:invokevirtual   #415 <Method int MediaRouteDescriptor.getVolumeMax()>
	//* 202  344:icmpeq          359
			{
				mVolumeMax = mediaroutedescriptor.getVolumeMax();
	//  203  347:aload_0         
	//  204  348:aload_1         
	//  205  349:invokevirtual   #415 <Method int MediaRouteDescriptor.getVolumeMax()>
	//  206  352:putfield        #176 <Field int mVolumeMax>
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
	//* 214  362:getfield        #72  <Field int mPresentationDisplayId>
	//* 215  365:aload_1         
	//* 216  366:invokevirtual   #417 <Method int MediaRouteDescriptor.getPresentationDisplayId()>
	//* 217  369:icmpeq          389
			{
				mPresentationDisplayId = mediaroutedescriptor.getPresentationDisplayId();
	//  218  372:aload_0         
	//  219  373:aload_1         
	//  220  374:invokevirtual   #417 <Method int MediaRouteDescriptor.getPresentationDisplayId()>
	//  221  377:putfield        #72  <Field int mPresentationDisplayId>
				mPresentationDisplay = null;
	//  222  380:aload_0         
	//  223  381:aconst_null     
	//  224  382:putfield        #147 <Field Display mPresentationDisplay>
				i = j | 5;
	//  225  385:iload_3         
	//  226  386:iconst_5        
	//  227  387:ior             
	//  228  388:istore_2        
			}
			j = i;
	//  229  389:iload_2         
	//  230  390:istore_3        
			if(!p.a(((Object) (mExtras)), ((Object) (mediaroutedescriptor.getExtras()))))
	//* 231  391:aload_0         
	//* 232  392:getfield        #124 <Field Bundle mExtras>
	//* 233  395:aload_1         
	//* 234  396:invokevirtual   #419 <Method Bundle MediaRouteDescriptor.getExtras()>
	//* 235  399:invokestatic    #383 <Method boolean p.a(Object, Object)>
	//* 236  402:ifne            417
			{
				mExtras = mediaroutedescriptor.getExtras();
	//  237  405:aload_0         
	//  238  406:aload_1         
	//  239  407:invokevirtual   #419 <Method Bundle MediaRouteDescriptor.getExtras()>
	//  240  410:putfield        #124 <Field Bundle mExtras>
				j = i | 1;
	//  241  413:iload_2         
	//  242  414:iconst_1        
	//  243  415:ior             
	//  244  416:istore_3        
			}
			i = j;
	//  245  417:iload_3         
	//  246  418:istore_2        
			if(!p.a(((Object) (mSettingsIntent)), ((Object) (mediaroutedescriptor.getSettingsActivity()))))
	//* 247  419:aload_0         
	//* 248  420:getfield        #167 <Field IntentSender mSettingsIntent>
	//* 249  423:aload_1         
	//* 250  424:invokevirtual   #422 <Method IntentSender MediaRouteDescriptor.getSettingsActivity()>
	//* 251  427:invokestatic    #383 <Method boolean p.a(Object, Object)>
	//* 252  430:ifne            445
			{
				mSettingsIntent = mediaroutedescriptor.getSettingsActivity();
	//  253  433:aload_0         
	//  254  434:aload_1         
	//  255  435:invokevirtual   #422 <Method IntentSender MediaRouteDescriptor.getSettingsActivity()>
	//  256  438:putfield        #167 <Field IntentSender mSettingsIntent>
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
	//* 264  448:getfield        #107 <Field boolean mCanDisconnect>
	//* 265  451:aload_1         
	//* 266  452:invokevirtual   #425 <Method boolean MediaRouteDescriptor.canDisconnectAndKeepPlaying()>
	//* 267  455:icmpeq          470
			{
				mCanDisconnect = mediaroutedescriptor.canDisconnectAndKeepPlaying();
	//  268  458:aload_0         
	//  269  459:aload_1         
	//  270  460:invokevirtual   #425 <Method boolean MediaRouteDescriptor.canDisconnectAndKeepPlaying()>
	//  271  463:putfield        #107 <Field boolean mCanDisconnect>
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
	final String mDescriptorId;
	private int mDeviceType;
	boolean mEnabled;
	private Bundle mExtras;
	private Uri mIconUri;
	private String mName;
	private int mPlaybackStream;
	private int mPlaybackType;
	private Display mPresentationDisplay;
	private int mPresentationDisplayId;
	private final fo mProvider;
	private IntentSender mSettingsIntent;
	final String mUniqueId;
	private int mVolume;
	private int mVolumeHandling;
	private int mVolumeMax;

	MediaRouter$RouteInfo(fo fo, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #67  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #68  <Method void ArrayList()>
	//    6   12:putfield        #70  <Field ArrayList mControlFilters>
		mPresentationDisplayId = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #72  <Field int mPresentationDisplayId>
		mProvider = fo;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #74  <Field MediaRouter$ProviderInfo mProvider>
		mDescriptorId = s;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #76  <Field String mDescriptorId>
		mUniqueId = s1;
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:putfield        #78  <Field String mUniqueId>
	//   19   35:return          
	}
}
