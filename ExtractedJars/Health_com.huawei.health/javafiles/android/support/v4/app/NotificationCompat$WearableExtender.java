// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat

public static final class NotificationCompat$WearableExtender
	implements NotificationCompat.Extender
{

	private void setFlag(int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            15
		{
			mFlags = mFlags | i;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #118 <Field int mFlags>
	//    5    9:iload_1         
	//    6   10:ior             
	//    7   11:putfield        #118 <Field int mFlags>
			return;
	//    8   14:return          
		} else
		{
			mFlags = mFlags & ~i;
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #118 <Field int mFlags>
	//   12   20:iload_1         
	//   13   21:iconst_m1       
	//   14   22:ixor            
	//   15   23:iand            
	//   16   24:putfield        #118 <Field int mFlags>
			return;
	//   17   27:return          
		}
	}

	public NotificationCompat$WearableExtender addAction(NotificationCompat.Action action)
	{
		mActions.add(((Object) (action)));
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field ArrayList mActions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #205 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public NotificationCompat$WearableExtender addActions(List list)
	{
		mActions.addAll(((java.util.Collection) (list)));
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field ArrayList mActions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #210 <Method boolean ArrayList.addAll(java.util.Collection)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public NotificationCompat$WearableExtender addPage(Notification notification)
	{
		mPages.add(((Object) (notification)));
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field ArrayList mPages>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #205 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public NotificationCompat$WearableExtender addPages(List list)
	{
		mPages.addAll(((java.util.Collection) (list)));
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field ArrayList mPages>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #210 <Method boolean ArrayList.addAll(java.util.Collection)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public NotificationCompat$WearableExtender clearActions()
	{
		mActions.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field ArrayList mActions>
	//    2    4:invokevirtual   #221 <Method void ArrayList.clear()>
		return this;
	//    3    7:aload_0         
	//    4    8:areturn         
	}

	public NotificationCompat$WearableExtender clearPages()
	{
		mPages.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field ArrayList mPages>
	//    2    4:invokevirtual   #221 <Method void ArrayList.clear()>
		return this;
	//    3    7:aload_0         
	//    4    8:areturn         
	}

	public NotificationCompat$WearableExtender clone()
	{
		NotificationCompat$WearableExtender notificationcompat$wearableextender = new NotificationCompat$WearableExtender();
	//    0    0:new             #2   <Class NotificationCompat$WearableExtender>
	//    1    3:dup             
	//    2    4:invokespecial   #224 <Method void NotificationCompat$WearableExtender()>
	//    3    7:astore_1        
		notificationcompat$wearableextender.mActions = new ArrayList(((java.util.Collection) (mActions)));
	//    4    8:aload_1         
	//    5    9:new             #113 <Class ArrayList>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #116 <Field ArrayList mActions>
	//    9   17:invokespecial   #227 <Method void ArrayList(java.util.Collection)>
	//   10   20:putfield        #116 <Field ArrayList mActions>
		notificationcompat$wearableextender.mFlags = mFlags;
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #118 <Field int mFlags>
	//   14   28:putfield        #118 <Field int mFlags>
		notificationcompat$wearableextender.mDisplayIntent = mDisplayIntent;
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #172 <Field PendingIntent mDisplayIntent>
	//   18   36:putfield        #172 <Field PendingIntent mDisplayIntent>
		notificationcompat$wearableextender.mPages = new ArrayList(((java.util.Collection) (mPages)));
	//   19   39:aload_1         
	//   20   40:new             #113 <Class ArrayList>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:getfield        #120 <Field ArrayList mPages>
	//   24   48:invokespecial   #227 <Method void ArrayList(java.util.Collection)>
	//   25   51:putfield        #120 <Field ArrayList mPages>
		notificationcompat$wearableextender.mBackground = mBackground;
	//   26   54:aload_1         
	//   27   55:aload_0         
	//   28   56:getfield        #180 <Field Bitmap mBackground>
	//   29   59:putfield        #180 <Field Bitmap mBackground>
		notificationcompat$wearableextender.mContentIcon = mContentIcon;
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:getfield        #185 <Field int mContentIcon>
	//   33   67:putfield        #185 <Field int mContentIcon>
		notificationcompat$wearableextender.mContentIconGravity = mContentIconGravity;
	//   34   70:aload_1         
	//   35   71:aload_0         
	//   36   72:getfield        #122 <Field int mContentIconGravity>
	//   37   75:putfield        #122 <Field int mContentIconGravity>
		notificationcompat$wearableextender.mContentActionIndex = mContentActionIndex;
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:getfield        #124 <Field int mContentActionIndex>
	//   41   83:putfield        #124 <Field int mContentActionIndex>
		notificationcompat$wearableextender.mCustomSizePreset = mCustomSizePreset;
	//   42   86:aload_1         
	//   43   87:aload_0         
	//   44   88:getfield        #126 <Field int mCustomSizePreset>
	//   45   91:putfield        #126 <Field int mCustomSizePreset>
		notificationcompat$wearableextender.mCustomContentHeight = mCustomContentHeight;
	//   46   94:aload_1         
	//   47   95:aload_0         
	//   48   96:getfield        #187 <Field int mCustomContentHeight>
	//   49   99:putfield        #187 <Field int mCustomContentHeight>
		notificationcompat$wearableextender.mGravity = mGravity;
	//   50  102:aload_1         
	//   51  103:aload_0         
	//   52  104:getfield        #128 <Field int mGravity>
	//   53  107:putfield        #128 <Field int mGravity>
		notificationcompat$wearableextender.mHintScreenTimeout = mHintScreenTimeout;
	//   54  110:aload_1         
	//   55  111:aload_0         
	//   56  112:getfield        #189 <Field int mHintScreenTimeout>
	//   57  115:putfield        #189 <Field int mHintScreenTimeout>
		notificationcompat$wearableextender.mDismissalId = mDismissalId;
	//   58  118:aload_1         
	//   59  119:aload_0         
	//   60  120:getfield        #195 <Field String mDismissalId>
	//   61  123:putfield        #195 <Field String mDismissalId>
		notificationcompat$wearableextender.mBridgeTag = mBridgeTag;
	//   62  126:aload_1         
	//   63  127:aload_0         
	//   64  128:getfield        #197 <Field String mBridgeTag>
	//   65  131:putfield        #197 <Field String mBridgeTag>
		return notificationcompat$wearableextender;
	//   66  134:aload_1         
	//   67  135:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #232 <Method NotificationCompat$WearableExtender clone()>
	//    2    4:areturn         
	}

	public NotificationCompat.Builder extend(NotificationCompat.Builder builder)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #136 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #236 <Method void Bundle()>
	//    3    7:astore_2        
		if(!mActions.isEmpty())
	//*   4    8:aload_0         
	//*   5    9:getfield        #116 <Field ArrayList mActions>
	//*   6   12:invokevirtual   #240 <Method boolean ArrayList.isEmpty()>
	//*   7   15:ifne            52
			bundle.putParcelableArrayList("actions", NotificationCompat.IMPL.getParcelableArrayListForActions((NotificationCompat.Action[])mActions.toArray(((Object []) (new NotificationCompat.Action[mActions.size()])))));
	//    8   18:aload_2         
	//    9   19:ldc1            #36  <String "actions">
	//   10   21:getstatic       #144 <Field NotificationCompat$NotificationCompatImpl NotificationCompat.IMPL>
	//   11   24:aload_0         
	//   12   25:getfield        #116 <Field ArrayList mActions>
	//   13   28:aload_0         
	//   14   29:getfield        #116 <Field ArrayList mActions>
	//   15   32:invokevirtual   #244 <Method int ArrayList.size()>
	//   16   35:anewarray       NotificationCompat.Action[]
	//   17   38:invokevirtual   #250 <Method Object[] ArrayList.toArray(Object[])>
	//   18   41:checkcast       #252 <Class NotificationCompat$Action[]>
	//   19   44:invokeinterface #256 <Method ArrayList NotificationCompat$NotificationCompatImpl.getParcelableArrayListForActions(NotificationCompat$Action[])>
	//   20   49:invokevirtual   #260 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		if(mFlags != 1)
	//*  21   52:aload_0         
	//*  22   53:getfield        #118 <Field int mFlags>
	//*  23   56:iconst_1        
	//*  24   57:icmpeq          70
			bundle.putInt("flags", mFlags);
	//   25   60:aload_2         
	//   26   61:ldc1            #66  <String "flags">
	//   27   63:aload_0         
	//   28   64:getfield        #118 <Field int mFlags>
	//   29   67:invokevirtual   #264 <Method void Bundle.putInt(String, int)>
		if(mDisplayIntent != null)
	//*  30   70:aload_0         
	//*  31   71:getfield        #172 <Field PendingIntent mDisplayIntent>
	//*  32   74:ifnull          87
			bundle.putParcelable("displayIntent", ((android.os.Parcelable) (mDisplayIntent)));
	//   33   77:aload_2         
	//   34   78:ldc1            #63  <String "displayIntent">
	//   35   80:aload_0         
	//   36   81:getfield        #172 <Field PendingIntent mDisplayIntent>
	//   37   84:invokevirtual   #268 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(!mPages.isEmpty())
	//*  38   87:aload_0         
	//*  39   88:getfield        #120 <Field ArrayList mPages>
	//*  40   91:invokevirtual   #240 <Method boolean ArrayList.isEmpty()>
	//*  41   94:ifne            123
			bundle.putParcelableArray("pages", (android.os.Parcelable[])mPages.toArray(((Object []) (new Notification[mPages.size()]))));
	//   42   97:aload_2         
	//   43   98:ldc1            #75  <String "pages">
	//   44  100:aload_0         
	//   45  101:getfield        #120 <Field ArrayList mPages>
	//   46  104:aload_0         
	//   47  105:getfield        #120 <Field ArrayList mPages>
	//   48  108:invokevirtual   #244 <Method int ArrayList.size()>
	//   49  111:anewarray       Notification[]
	//   50  114:invokevirtual   #250 <Method Object[] ArrayList.toArray(Object[])>
	//   51  117:checkcast       #272 <Class android.os.Parcelable[]>
	//   52  120:invokevirtual   #276 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		if(mBackground != null)
	//*  53  123:aload_0         
	//*  54  124:getfield        #180 <Field Bitmap mBackground>
	//*  55  127:ifnull          140
			bundle.putParcelable("background", ((android.os.Parcelable) (mBackground)));
	//   56  130:aload_2         
	//   57  131:ldc1            #39  <String "background">
	//   58  133:aload_0         
	//   59  134:getfield        #180 <Field Bitmap mBackground>
	//   60  137:invokevirtual   #268 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(mContentIcon != 0)
	//*  61  140:aload_0         
	//*  62  141:getfield        #185 <Field int mContentIcon>
	//*  63  144:ifeq            157
			bundle.putInt("contentIcon", mContentIcon);
	//   64  147:aload_2         
	//   65  148:ldc1            #48  <String "contentIcon">
	//   66  150:aload_0         
	//   67  151:getfield        #185 <Field int mContentIcon>
	//   68  154:invokevirtual   #264 <Method void Bundle.putInt(String, int)>
		if(mContentIconGravity != 0x800005)
	//*  69  157:aload_0         
	//*  70  158:getfield        #122 <Field int mContentIconGravity>
	//*  71  161:ldc1            #12  <Int 0x800005>
	//*  72  163:icmpeq          176
			bundle.putInt("contentIconGravity", mContentIconGravity);
	//   73  166:aload_2         
	//   74  167:ldc1            #51  <String "contentIconGravity">
	//   75  169:aload_0         
	//   76  170:getfield        #122 <Field int mContentIconGravity>
	//   77  173:invokevirtual   #264 <Method void Bundle.putInt(String, int)>
		if(mContentActionIndex != -1)
	//*  78  176:aload_0         
	//*  79  177:getfield        #124 <Field int mContentActionIndex>
	//*  80  180:iconst_m1       
	//*  81  181:icmpeq          194
			bundle.putInt("contentActionIndex", mContentActionIndex);
	//   82  184:aload_2         
	//   83  185:ldc1            #45  <String "contentActionIndex">
	//   84  187:aload_0         
	//   85  188:getfield        #124 <Field int mContentActionIndex>
	//   86  191:invokevirtual   #264 <Method void Bundle.putInt(String, int)>
		if(mCustomSizePreset != 0)
	//*  87  194:aload_0         
	//*  88  195:getfield        #126 <Field int mCustomSizePreset>
	//*  89  198:ifeq            211
			bundle.putInt("customSizePreset", mCustomSizePreset);
	//   90  201:aload_2         
	//   91  202:ldc1            #57  <String "customSizePreset">
	//   92  204:aload_0         
	//   93  205:getfield        #126 <Field int mCustomSizePreset>
	//   94  208:invokevirtual   #264 <Method void Bundle.putInt(String, int)>
		if(mCustomContentHeight != 0)
	//*  95  211:aload_0         
	//*  96  212:getfield        #187 <Field int mCustomContentHeight>
	//*  97  215:ifeq            228
			bundle.putInt("customContentHeight", mCustomContentHeight);
	//   98  218:aload_2         
	//   99  219:ldc1            #54  <String "customContentHeight">
	//  100  221:aload_0         
	//  101  222:getfield        #187 <Field int mCustomContentHeight>
	//  102  225:invokevirtual   #264 <Method void Bundle.putInt(String, int)>
		if(mGravity != 80)
	//* 103  228:aload_0         
	//* 104  229:getfield        #128 <Field int mGravity>
	//* 105  232:bipush          80
	//* 106  234:icmpeq          247
			bundle.putInt("gravity", mGravity);
	//  107  237:aload_2         
	//  108  238:ldc1            #69  <String "gravity">
	//  109  240:aload_0         
	//  110  241:getfield        #128 <Field int mGravity>
	//  111  244:invokevirtual   #264 <Method void Bundle.putInt(String, int)>
		if(mHintScreenTimeout != 0)
	//* 112  247:aload_0         
	//* 113  248:getfield        #189 <Field int mHintScreenTimeout>
	//* 114  251:ifeq            264
			bundle.putInt("hintScreenTimeout", mHintScreenTimeout);
	//  115  254:aload_2         
	//  116  255:ldc1            #72  <String "hintScreenTimeout">
	//  117  257:aload_0         
	//  118  258:getfield        #189 <Field int mHintScreenTimeout>
	//  119  261:invokevirtual   #264 <Method void Bundle.putInt(String, int)>
		if(mDismissalId != null)
	//* 120  264:aload_0         
	//* 121  265:getfield        #195 <Field String mDismissalId>
	//* 122  268:ifnull          281
			bundle.putString("dismissalId", mDismissalId);
	//  123  271:aload_2         
	//  124  272:ldc1            #60  <String "dismissalId">
	//  125  274:aload_0         
	//  126  275:getfield        #195 <Field String mDismissalId>
	//  127  278:invokevirtual   #280 <Method void Bundle.putString(String, String)>
		if(mBridgeTag != null)
	//* 128  281:aload_0         
	//* 129  282:getfield        #197 <Field String mBridgeTag>
	//* 130  285:ifnull          298
			bundle.putString("bridgeTag", mBridgeTag);
	//  131  288:aload_2         
	//  132  289:ldc1            #42  <String "bridgeTag">
	//  133  291:aload_0         
	//  134  292:getfield        #197 <Field String mBridgeTag>
	//  135  295:invokevirtual   #280 <Method void Bundle.putString(String, String)>
		builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
	//  136  298:aload_1         
	//  137  299:invokevirtual   #285 <Method Bundle NotificationCompat$Builder.getExtras()>
	//  138  302:ldc1            #20  <String "android.wearable.EXTENSIONS">
	//  139  304:aload_2         
	//  140  305:invokevirtual   #289 <Method void Bundle.putBundle(String, Bundle)>
		return builder;
	//  141  308:aload_1         
	//  142  309:areturn         
	}

	public List getActions()
	{
		return ((List) (mActions));
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field ArrayList mActions>
	//    2    4:areturn         
	}

	public Bitmap getBackground()
	{
		return mBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field Bitmap mBackground>
	//    2    4:areturn         
	}

	public String getBridgeTag()
	{
		return mBridgeTag;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field String mBridgeTag>
	//    2    4:areturn         
	}

	public int getContentAction()
	{
		return mContentActionIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field int mContentActionIndex>
	//    2    4:ireturn         
	}

	public int getContentIcon()
	{
		return mContentIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int mContentIcon>
	//    2    4:ireturn         
	}

	public int getContentIconGravity()
	{
		return mContentIconGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field int mContentIconGravity>
	//    2    4:ireturn         
	}

	public boolean getContentIntentAvailableOffline()
	{
		return (mFlags & 1) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int mFlags>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public int getCustomContentHeight()
	{
		return mCustomContentHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field int mCustomContentHeight>
	//    2    4:ireturn         
	}

	public int getCustomSizePreset()
	{
		return mCustomSizePreset;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field int mCustomSizePreset>
	//    2    4:ireturn         
	}

	public String getDismissalId()
	{
		return mDismissalId;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field String mDismissalId>
	//    2    4:areturn         
	}

	public PendingIntent getDisplayIntent()
	{
		return mDisplayIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field PendingIntent mDisplayIntent>
	//    2    4:areturn         
	}

	public int getGravity()
	{
		return mGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int mGravity>
	//    2    4:ireturn         
	}

	public boolean getHintAmbientBigPicture()
	{
		return (mFlags & 0x20) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int mFlags>
	//    2    4:bipush          32
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public boolean getHintAvoidBackgroundClipping()
	{
		return (mFlags & 0x10) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int mFlags>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public boolean getHintContentIntentLaunchesActivity()
	{
		return (mFlags & 0x40) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int mFlags>
	//    2    4:bipush          64
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public boolean getHintHideIcon()
	{
		return (mFlags & 2) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int mFlags>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public int getHintScreenTimeout()
	{
		return mHintScreenTimeout;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field int mHintScreenTimeout>
	//    2    4:ireturn         
	}

	public boolean getHintShowBackgroundOnly()
	{
		return (mFlags & 4) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int mFlags>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public List getPages()
	{
		return ((List) (mPages));
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field ArrayList mPages>
	//    2    4:areturn         
	}

	public boolean getStartScrollBottom()
	{
		return (mFlags & 8) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int mFlags>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public NotificationCompat$WearableExtender setBackground(Bitmap bitmap)
	{
		mBackground = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #180 <Field Bitmap mBackground>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$WearableExtender setBridgeTag(String s)
	{
		mBridgeTag = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #197 <Field String mBridgeTag>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$WearableExtender setContentAction(int i)
	{
		mContentActionIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #124 <Field int mContentActionIndex>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$WearableExtender setContentIcon(int i)
	{
		mContentIcon = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #185 <Field int mContentIcon>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$WearableExtender setContentIconGravity(int i)
	{
		mContentIconGravity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #122 <Field int mContentIconGravity>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$WearableExtender setContentIntentAvailableOffline(boolean flag)
	{
		setFlag(1, flag);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:invokespecial   #327 <Method void setFlag(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public NotificationCompat$WearableExtender setCustomContentHeight(int i)
	{
		mCustomContentHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #187 <Field int mCustomContentHeight>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$WearableExtender setCustomSizePreset(int i)
	{
		mCustomSizePreset = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #126 <Field int mCustomSizePreset>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$WearableExtender setDismissalId(String s)
	{
		mDismissalId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #195 <Field String mDismissalId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$WearableExtender setDisplayIntent(PendingIntent pendingintent)
	{
		mDisplayIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #172 <Field PendingIntent mDisplayIntent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$WearableExtender setGravity(int i)
	{
		mGravity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #128 <Field int mGravity>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$WearableExtender setHintAmbientBigPicture(boolean flag)
	{
		setFlag(32, flag);
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:iload_1         
	//    3    4:invokespecial   #327 <Method void setFlag(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public NotificationCompat$WearableExtender setHintAvoidBackgroundClipping(boolean flag)
	{
		setFlag(16, flag);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:iload_1         
	//    3    4:invokespecial   #327 <Method void setFlag(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public NotificationCompat$WearableExtender setHintContentIntentLaunchesActivity(boolean flag)
	{
		setFlag(64, flag);
	//    0    0:aload_0         
	//    1    1:bipush          64
	//    2    3:iload_1         
	//    3    4:invokespecial   #327 <Method void setFlag(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public NotificationCompat$WearableExtender setHintHideIcon(boolean flag)
	{
		setFlag(2, flag);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iload_1         
	//    3    3:invokespecial   #327 <Method void setFlag(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public NotificationCompat$WearableExtender setHintScreenTimeout(int i)
	{
		mHintScreenTimeout = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #189 <Field int mHintScreenTimeout>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$WearableExtender setHintShowBackgroundOnly(boolean flag)
	{
		setFlag(4, flag);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:iload_1         
	//    3    3:invokespecial   #327 <Method void setFlag(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public NotificationCompat$WearableExtender setStartScrollBottom(boolean flag)
	{
		setFlag(8, flag);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:iload_1         
	//    3    4:invokespecial   #327 <Method void setFlag(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	private static final int DEFAULT_CONTENT_ICON_GRAVITY = 0x800005;
	private static final int DEFAULT_FLAGS = 1;
	private static final int DEFAULT_GRAVITY = 80;
	private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
	private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
	private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
	private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
	private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
	private static final int FLAG_HINT_HIDE_ICON = 2;
	private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
	private static final int FLAG_START_SCROLL_BOTTOM = 8;
	private static final String KEY_ACTIONS = "actions";
	private static final String KEY_BACKGROUND = "background";
	private static final String KEY_BRIDGE_TAG = "bridgeTag";
	private static final String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
	private static final String KEY_CONTENT_ICON = "contentIcon";
	private static final String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
	private static final String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
	private static final String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
	private static final String KEY_DISMISSAL_ID = "dismissalId";
	private static final String KEY_DISPLAY_INTENT = "displayIntent";
	private static final String KEY_FLAGS = "flags";
	private static final String KEY_GRAVITY = "gravity";
	private static final String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
	private static final String KEY_PAGES = "pages";
	public static final int SCREEN_TIMEOUT_LONG = -1;
	public static final int SCREEN_TIMEOUT_SHORT = 0;
	public static final int SIZE_DEFAULT = 0;
	public static final int SIZE_FULL_SCREEN = 5;
	public static final int SIZE_LARGE = 4;
	public static final int SIZE_MEDIUM = 3;
	public static final int SIZE_SMALL = 2;
	public static final int SIZE_XSMALL = 1;
	public static final int UNSET_ACTION_INDEX = -1;
	private ArrayList mActions;
	private Bitmap mBackground;
	private String mBridgeTag;
	private int mContentActionIndex;
	private int mContentIcon;
	private int mContentIconGravity;
	private int mCustomContentHeight;
	private int mCustomSizePreset;
	private String mDismissalId;
	private PendingIntent mDisplayIntent;
	private int mFlags;
	private int mGravity;
	private int mHintScreenTimeout;
	private ArrayList mPages;

	public NotificationCompat$WearableExtender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #111 <Method void Object()>
		mActions = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #113 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #114 <Method void ArrayList()>
	//    6   12:putfield        #116 <Field ArrayList mActions>
		mFlags = 1;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #118 <Field int mFlags>
		mPages = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #113 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #114 <Method void ArrayList()>
	//   14   28:putfield        #120 <Field ArrayList mPages>
		mContentIconGravity = 0x800005;
	//   15   31:aload_0         
	//   16   32:ldc1            #12  <Int 0x800005>
	//   17   34:putfield        #122 <Field int mContentIconGravity>
		mContentActionIndex = -1;
	//   18   37:aload_0         
	//   19   38:iconst_m1       
	//   20   39:putfield        #124 <Field int mContentActionIndex>
		mCustomSizePreset = 0;
	//   21   42:aload_0         
	//   22   43:iconst_0        
	//   23   44:putfield        #126 <Field int mCustomSizePreset>
		mGravity = 80;
	//   24   47:aload_0         
	//   25   48:bipush          80
	//   26   50:putfield        #128 <Field int mGravity>
	//   27   53:return          
	}

	public NotificationCompat$WearableExtender(Notification notification)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #111 <Method void Object()>
		mActions = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #113 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #114 <Method void ArrayList()>
	//    6   12:putfield        #116 <Field ArrayList mActions>
		mFlags = 1;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #118 <Field int mFlags>
		mPages = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #113 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #114 <Method void ArrayList()>
	//   14   28:putfield        #120 <Field ArrayList mPages>
		mContentIconGravity = 0x800005;
	//   15   31:aload_0         
	//   16   32:ldc1            #12  <Int 0x800005>
	//   17   34:putfield        #122 <Field int mContentIconGravity>
		mContentActionIndex = -1;
	//   18   37:aload_0         
	//   19   38:iconst_m1       
	//   20   39:putfield        #124 <Field int mContentActionIndex>
		mCustomSizePreset = 0;
	//   21   42:aload_0         
	//   22   43:iconst_0        
	//   23   44:putfield        #126 <Field int mCustomSizePreset>
		mGravity = 80;
	//   24   47:aload_0         
	//   25   48:bipush          80
	//   26   50:putfield        #128 <Field int mGravity>
		notification = ((Notification) (NotificationCompat.getExtras(notification)));
	//   27   53:aload_1         
	//   28   54:invokestatic    #134 <Method Bundle NotificationCompat.getExtras(Notification)>
	//   29   57:astore_1        
		if(notification != null)
	//*  30   58:aload_1         
	//*  31   59:ifnull          72
			notification = ((Notification) (((Bundle) (notification)).getBundle("android.wearable.EXTENSIONS")));
	//   32   62:aload_1         
	//   33   63:ldc1            #20  <String "android.wearable.EXTENSIONS">
	//   34   65:invokevirtual   #140 <Method Bundle Bundle.getBundle(String)>
	//   35   68:astore_1        
		else
	//*  36   69:goto            74
			notification = null;
	//   37   72:aconst_null     
	//   38   73:astore_1        
		if(notification != null)
	//*  39   74:aload_1         
	//*  40   75:ifnull          259
		{
			Object aobj[] = ((Object []) (NotificationCompat.IMPL.getActionsFromParcelableArrayList(((Bundle) (notification)).getParcelableArrayList("actions"))));
	//   41   78:getstatic       #144 <Field NotificationCompat$NotificationCompatImpl NotificationCompat.IMPL>
	//   42   81:aload_1         
	//   43   82:ldc1            #36  <String "actions">
	//   44   84:invokevirtual   #148 <Method ArrayList Bundle.getParcelableArrayList(String)>
	//   45   87:invokeinterface #154 <Method NotificationCompat$Action[] NotificationCompat$NotificationCompatImpl.getActionsFromParcelableArrayList(ArrayList)>
	//   46   92:astore_2        
			if(aobj != null)
	//*  47   93:aload_2         
	//*  48   94:ifnull          106
				Collections.addAll(((java.util.Collection) (mActions)), aobj);
	//   49   97:aload_0         
	//   50   98:getfield        #116 <Field ArrayList mActions>
	//   51  101:aload_2         
	//   52  102:invokestatic    #160 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   53  105:pop             
			mFlags = ((Bundle) (notification)).getInt("flags", 1);
	//   54  106:aload_0         
	//   55  107:aload_1         
	//   56  108:ldc1            #66  <String "flags">
	//   57  110:iconst_1        
	//   58  111:invokevirtual   #164 <Method int Bundle.getInt(String, int)>
	//   59  114:putfield        #118 <Field int mFlags>
			mDisplayIntent = (PendingIntent)((Bundle) (notification)).getParcelable("displayIntent");
	//   60  117:aload_0         
	//   61  118:aload_1         
	//   62  119:ldc1            #63  <String "displayIntent">
	//   63  121:invokevirtual   #168 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   64  124:checkcast       #170 <Class PendingIntent>
	//   65  127:putfield        #172 <Field PendingIntent mDisplayIntent>
			aobj = ((Object []) (NotificationCompat.getNotificationArrayFromBundle(((Bundle) (notification)), "pages")));
	//   66  130:aload_1         
	//   67  131:ldc1            #75  <String "pages">
	//   68  133:invokestatic    #176 <Method Notification[] NotificationCompat.getNotificationArrayFromBundle(Bundle, String)>
	//   69  136:astore_2        
			if(aobj != null)
	//*  70  137:aload_2         
	//*  71  138:ifnull          150
				Collections.addAll(((java.util.Collection) (mPages)), aobj);
	//   72  141:aload_0         
	//   73  142:getfield        #120 <Field ArrayList mPages>
	//   74  145:aload_2         
	//   75  146:invokestatic    #160 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   76  149:pop             
			mBackground = (Bitmap)((Bundle) (notification)).getParcelable("background");
	//   77  150:aload_0         
	//   78  151:aload_1         
	//   79  152:ldc1            #39  <String "background">
	//   80  154:invokevirtual   #168 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   81  157:checkcast       #178 <Class Bitmap>
	//   82  160:putfield        #180 <Field Bitmap mBackground>
			mContentIcon = ((Bundle) (notification)).getInt("contentIcon");
	//   83  163:aload_0         
	//   84  164:aload_1         
	//   85  165:ldc1            #48  <String "contentIcon">
	//   86  167:invokevirtual   #183 <Method int Bundle.getInt(String)>
	//   87  170:putfield        #185 <Field int mContentIcon>
			mContentIconGravity = ((Bundle) (notification)).getInt("contentIconGravity", 0x800005);
	//   88  173:aload_0         
	//   89  174:aload_1         
	//   90  175:ldc1            #51  <String "contentIconGravity">
	//   91  177:ldc1            #12  <Int 0x800005>
	//   92  179:invokevirtual   #164 <Method int Bundle.getInt(String, int)>
	//   93  182:putfield        #122 <Field int mContentIconGravity>
			mContentActionIndex = ((Bundle) (notification)).getInt("contentActionIndex", -1);
	//   94  185:aload_0         
	//   95  186:aload_1         
	//   96  187:ldc1            #45  <String "contentActionIndex">
	//   97  189:iconst_m1       
	//   98  190:invokevirtual   #164 <Method int Bundle.getInt(String, int)>
	//   99  193:putfield        #124 <Field int mContentActionIndex>
			mCustomSizePreset = ((Bundle) (notification)).getInt("customSizePreset", 0);
	//  100  196:aload_0         
	//  101  197:aload_1         
	//  102  198:ldc1            #57  <String "customSizePreset">
	//  103  200:iconst_0        
	//  104  201:invokevirtual   #164 <Method int Bundle.getInt(String, int)>
	//  105  204:putfield        #126 <Field int mCustomSizePreset>
			mCustomContentHeight = ((Bundle) (notification)).getInt("customContentHeight");
	//  106  207:aload_0         
	//  107  208:aload_1         
	//  108  209:ldc1            #54  <String "customContentHeight">
	//  109  211:invokevirtual   #183 <Method int Bundle.getInt(String)>
	//  110  214:putfield        #187 <Field int mCustomContentHeight>
			mGravity = ((Bundle) (notification)).getInt("gravity", 80);
	//  111  217:aload_0         
	//  112  218:aload_1         
	//  113  219:ldc1            #69  <String "gravity">
	//  114  221:bipush          80
	//  115  223:invokevirtual   #164 <Method int Bundle.getInt(String, int)>
	//  116  226:putfield        #128 <Field int mGravity>
			mHintScreenTimeout = ((Bundle) (notification)).getInt("hintScreenTimeout");
	//  117  229:aload_0         
	//  118  230:aload_1         
	//  119  231:ldc1            #72  <String "hintScreenTimeout">
	//  120  233:invokevirtual   #183 <Method int Bundle.getInt(String)>
	//  121  236:putfield        #189 <Field int mHintScreenTimeout>
			mDismissalId = ((Bundle) (notification)).getString("dismissalId");
	//  122  239:aload_0         
	//  123  240:aload_1         
	//  124  241:ldc1            #60  <String "dismissalId">
	//  125  243:invokevirtual   #193 <Method String Bundle.getString(String)>
	//  126  246:putfield        #195 <Field String mDismissalId>
			mBridgeTag = ((Bundle) (notification)).getString("bridgeTag");
	//  127  249:aload_0         
	//  128  250:aload_1         
	//  129  251:ldc1            #42  <String "bridgeTag">
	//  130  253:invokevirtual   #193 <Method String Bundle.getString(String)>
	//  131  256:putfield        #197 <Field String mBridgeTag>
		}
	//  132  259:return          
	}
}
