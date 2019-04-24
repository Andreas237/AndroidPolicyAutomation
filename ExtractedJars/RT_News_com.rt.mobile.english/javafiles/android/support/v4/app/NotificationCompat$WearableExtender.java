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
//			NotificationCompat, NotificationCompatJellybean, RemoteInput

public static final class NotificationCompat$WearableExtender
	implements NotificationCompat.Extender
{

	private static android.app.Notification.Action getActionFromActionCompat(NotificationCompat.Action action)
	{
		android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
	//    0    0:new             #223 <Class android.app.Notification$Action$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #226 <Method int NotificationCompat$Action.getIcon()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #230 <Method CharSequence NotificationCompat$Action.getTitle()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #234 <Method PendingIntent NotificationCompat$Action.getActionIntent()>
	//    8   16:invokespecial   #237 <Method void android.app.Notification$Action$Builder(int, CharSequence, PendingIntent)>
	//    9   19:astore          4
		Bundle bundle;
		if(action.getExtras() != null)
	//*  10   21:aload_0         
	//*  11   22:invokevirtual   #240 <Method Bundle NotificationCompat$Action.getExtras()>
	//*  12   25:ifnull          43
			bundle = new Bundle(action.getExtras());
	//   13   28:new             #136 <Class Bundle>
	//   14   31:dup             
	//   15   32:aload_0         
	//   16   33:invokevirtual   #240 <Method Bundle NotificationCompat$Action.getExtras()>
	//   17   36:invokespecial   #243 <Method void Bundle(Bundle)>
	//   18   39:astore_3        
		else
	//*  19   40:goto            51
			bundle = new Bundle();
	//   20   43:new             #136 <Class Bundle>
	//   21   46:dup             
	//   22   47:invokespecial   #244 <Method void Bundle()>
	//   23   50:astore_3        
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   24   51:aload_3         
	//   25   52:ldc1            #246 <String "android.support.allowGeneratedReplies">
	//   26   54:aload_0         
	//   27   55:invokevirtual   #250 <Method boolean NotificationCompat$Action.getAllowGeneratedReplies()>
	//   28   58:invokevirtual   #254 <Method void Bundle.putBoolean(String, boolean)>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  29   61:getstatic       #149 <Field int android.os.Build$VERSION.SDK_INT>
	//*  30   64:bipush          24
	//*  31   66:icmplt          79
			builder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
	//   32   69:aload           4
	//   33   71:aload_0         
	//   34   72:invokevirtual   #250 <Method boolean NotificationCompat$Action.getAllowGeneratedReplies()>
	//   35   75:invokevirtual   #258 <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.setAllowGeneratedReplies(boolean)>
	//   36   78:pop             
		builder.addExtras(bundle);
	//   37   79:aload           4
	//   38   81:aload_3         
	//   39   82:invokevirtual   #262 <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addExtras(Bundle)>
	//   40   85:pop             
		action = ((NotificationCompat.Action) (action.getRemoteInputs()));
	//   41   86:aload_0         
	//   42   87:invokevirtual   #266 <Method RemoteInput[] NotificationCompat$Action.getRemoteInputs()>
	//   43   90:astore_0        
		if(action != null)
	//*  44   91:aload_0         
	//*  45   92:ifnull          126
		{
			action = ((NotificationCompat.Action) (RemoteInput.fromCompat(((RemoteInput []) (action)))));
	//   46   95:aload_0         
	//   47   96:invokestatic    #272 <Method android.app.RemoteInput[] RemoteInput.fromCompat(RemoteInput[])>
	//   48   99:astore_0        
			int j = action.length;
	//   49  100:aload_0         
	//   50  101:arraylength     
	//   51  102:istore_2        
			for(int i = 0; i < j; i++)
	//*  52  103:iconst_0        
	//*  53  104:istore_1        
	//*  54  105:iload_1         
	//*  55  106:iload_2         
	//*  56  107:icmpge          126
				builder.addRemoteInput(((android.app.RemoteInput) (action[i])));
	//   57  110:aload           4
	//   58  112:aload_0         
	//   59  113:iload_1         
	//   60  114:aaload          
	//   61  115:invokevirtual   #276 <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addRemoteInput(android.app.RemoteInput)>
	//   62  118:pop             

	//   63  119:iload_1         
	//   64  120:iconst_1        
	//   65  121:iadd            
	//   66  122:istore_1        
		}
	//*  67  123:goto            105
		return builder.build();
	//   68  126:aload           4
	//   69  128:invokevirtual   #280 <Method android.app.Notification$Action android.app.Notification$Action$Builder.build()>
	//   70  131:areturn         
	}

	private void setFlag(int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            15
		{
			mFlags = i | mFlags;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #118 <Field int mFlags>
	//    6   10:ior             
	//    7   11:putfield        #118 <Field int mFlags>
			return;
	//    8   14:return          
		} else
		{
			mFlags = ~i & mFlags;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:iconst_m1       
	//   12   18:ixor            
	//   13   19:aload_0         
	//   14   20:getfield        #118 <Field int mFlags>
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
	//    3    5:invokevirtual   #289 <Method boolean ArrayList.add(Object)>
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
	//    3    5:invokevirtual   #294 <Method boolean ArrayList.addAll(java.util.Collection)>
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
	//    3    5:invokevirtual   #289 <Method boolean ArrayList.add(Object)>
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
	//    3    5:invokevirtual   #294 <Method boolean ArrayList.addAll(java.util.Collection)>
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
	//    2    4:invokevirtual   #305 <Method void ArrayList.clear()>
		return this;
	//    3    7:aload_0         
	//    4    8:areturn         
	}

	public NotificationCompat$WearableExtender clearPages()
	{
		mPages.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field ArrayList mPages>
	//    2    4:invokevirtual   #305 <Method void ArrayList.clear()>
		return this;
	//    3    7:aload_0         
	//    4    8:areturn         
	}

	public NotificationCompat$WearableExtender clone()
	{
		NotificationCompat$WearableExtender notificationcompat$wearableextender = new NotificationCompat$WearableExtender();
	//    0    0:new             #2   <Class NotificationCompat$WearableExtender>
	//    1    3:dup             
	//    2    4:invokespecial   #308 <Method void NotificationCompat$WearableExtender()>
	//    3    7:astore_1        
		notificationcompat$wearableextender.mActions = new ArrayList(((java.util.Collection) (mActions)));
	//    4    8:aload_1         
	//    5    9:new             #113 <Class ArrayList>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #116 <Field ArrayList mActions>
	//    9   17:invokespecial   #311 <Method void ArrayList(java.util.Collection)>
	//   10   20:putfield        #116 <Field ArrayList mActions>
		notificationcompat$wearableextender.mFlags = mFlags;
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #118 <Field int mFlags>
	//   14   28:putfield        #118 <Field int mFlags>
		notificationcompat$wearableextender.mDisplayIntent = mDisplayIntent;
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #191 <Field PendingIntent mDisplayIntent>
	//   18   36:putfield        #191 <Field PendingIntent mDisplayIntent>
		notificationcompat$wearableextender.mPages = new ArrayList(((java.util.Collection) (mPages)));
	//   19   39:aload_1         
	//   20   40:new             #113 <Class ArrayList>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:getfield        #120 <Field ArrayList mPages>
	//   24   48:invokespecial   #311 <Method void ArrayList(java.util.Collection)>
	//   25   51:putfield        #120 <Field ArrayList mPages>
		notificationcompat$wearableextender.mBackground = mBackground;
	//   26   54:aload_1         
	//   27   55:aload_0         
	//   28   56:getfield        #199 <Field Bitmap mBackground>
	//   29   59:putfield        #199 <Field Bitmap mBackground>
		notificationcompat$wearableextender.mContentIcon = mContentIcon;
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:getfield        #204 <Field int mContentIcon>
	//   33   67:putfield        #204 <Field int mContentIcon>
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
	//   48   96:getfield        #206 <Field int mCustomContentHeight>
	//   49   99:putfield        #206 <Field int mCustomContentHeight>
		notificationcompat$wearableextender.mGravity = mGravity;
	//   50  102:aload_1         
	//   51  103:aload_0         
	//   52  104:getfield        #128 <Field int mGravity>
	//   53  107:putfield        #128 <Field int mGravity>
		notificationcompat$wearableextender.mHintScreenTimeout = mHintScreenTimeout;
	//   54  110:aload_1         
	//   55  111:aload_0         
	//   56  112:getfield        #208 <Field int mHintScreenTimeout>
	//   57  115:putfield        #208 <Field int mHintScreenTimeout>
		notificationcompat$wearableextender.mDismissalId = mDismissalId;
	//   58  118:aload_1         
	//   59  119:aload_0         
	//   60  120:getfield        #214 <Field String mDismissalId>
	//   61  123:putfield        #214 <Field String mDismissalId>
		notificationcompat$wearableextender.mBridgeTag = mBridgeTag;
	//   62  126:aload_1         
	//   63  127:aload_0         
	//   64  128:getfield        #216 <Field String mBridgeTag>
	//   65  131:putfield        #216 <Field String mBridgeTag>
		return notificationcompat$wearableextender;
	//   66  134:aload_1         
	//   67  135:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #316 <Method NotificationCompat$WearableExtender clone()>
	//    2    4:areturn         
	}

	public NotificationCompat.Builder extend(NotificationCompat.Builder builder)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #136 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #244 <Method void Bundle()>
	//    3    7:astore_2        
		if(!mActions.isEmpty())
	//*   4    8:aload_0         
	//*   5    9:getfield        #116 <Field ArrayList mActions>
	//*   6   12:invokevirtual   #322 <Method boolean ArrayList.isEmpty()>
	//*   7   15:ifne            131
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   18:getstatic       #149 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   21:bipush          16
	//*  10   23:icmplt          124
			{
				ArrayList arraylist = new ArrayList(mActions.size());
	//   11   26:new             #113 <Class ArrayList>
	//   12   29:dup             
	//   13   30:aload_0         
	//   14   31:getfield        #116 <Field ArrayList mActions>
	//   15   34:invokevirtual   #153 <Method int ArrayList.size()>
	//   16   37:invokespecial   #325 <Method void ArrayList(int)>
	//   17   40:astore_3        
				Iterator iterator = mActions.iterator();
	//   18   41:aload_0         
	//   19   42:getfield        #116 <Field ArrayList mActions>
	//   20   45:invokevirtual   #329 <Method Iterator ArrayList.iterator()>
	//   21   48:astore          4
				do
				{
					if(!iterator.hasNext())
						break;
	//   22   50:aload           4
	//   23   52:invokeinterface #334 <Method boolean Iterator.hasNext()>
	//   24   57:ifeq            114
					NotificationCompat.Action action = (NotificationCompat.Action)iterator.next();
	//   25   60:aload           4
	//   26   62:invokeinterface #337 <Method Object Iterator.next()>
	//   27   67:checkcast       #155 <Class NotificationCompat$Action>
	//   28   70:astore          5
					if(android.os.Build.VERSION.SDK_INT >= 20)
	//*  29   72:getstatic       #149 <Field int android.os.Build$VERSION.SDK_INT>
	//*  30   75:bipush          20
	//*  31   77:icmplt          93
						arraylist.add(((Object) (getActionFromActionCompat(action))));
	//   32   80:aload_3         
	//   33   81:aload           5
	//   34   83:invokestatic    #339 <Method android.app.Notification$Action getActionFromActionCompat(NotificationCompat$Action)>
	//   35   86:invokevirtual   #289 <Method boolean ArrayList.add(Object)>
	//   36   89:pop             
					else
	//*  37   90:goto            50
					if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  38   93:getstatic       #149 <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   96:bipush          16
	//*  40   98:icmplt          50
						arraylist.add(((Object) (NotificationCompatJellybean.getBundleForAction(action))));
	//   41  101:aload_3         
	//   42  102:aload           5
	//   43  104:invokestatic    #343 <Method Bundle NotificationCompatJellybean.getBundleForAction(NotificationCompat$Action)>
	//   44  107:invokevirtual   #289 <Method boolean ArrayList.add(Object)>
	//   45  110:pop             
				} while(true);
	//   46  111:goto            50
				bundle.putParcelableArrayList("actions", arraylist);
	//   47  114:aload_2         
	//   48  115:ldc1            #36  <String "actions">
	//   49  117:aload_3         
	//   50  118:invokevirtual   #347 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
			} else
	//*  51  121:goto            131
			{
				bundle.putParcelableArrayList("actions", ((ArrayList) (null)));
	//   52  124:aload_2         
	//   53  125:ldc1            #36  <String "actions">
	//   54  127:aconst_null     
	//   55  128:invokevirtual   #347 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
			}
		if(mFlags != 1)
	//*  56  131:aload_0         
	//*  57  132:getfield        #118 <Field int mFlags>
	//*  58  135:iconst_1        
	//*  59  136:icmpeq          149
			bundle.putInt("flags", mFlags);
	//   60  139:aload_2         
	//   61  140:ldc1            #66  <String "flags">
	//   62  142:aload_0         
	//   63  143:getfield        #118 <Field int mFlags>
	//   64  146:invokevirtual   #351 <Method void Bundle.putInt(String, int)>
		if(mDisplayIntent != null)
	//*  65  149:aload_0         
	//*  66  150:getfield        #191 <Field PendingIntent mDisplayIntent>
	//*  67  153:ifnull          166
			bundle.putParcelable("displayIntent", ((android.os.Parcelable) (mDisplayIntent)));
	//   68  156:aload_2         
	//   69  157:ldc1            #63  <String "displayIntent">
	//   70  159:aload_0         
	//   71  160:getfield        #191 <Field PendingIntent mDisplayIntent>
	//   72  163:invokevirtual   #355 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(!mPages.isEmpty())
	//*  73  166:aload_0         
	//*  74  167:getfield        #120 <Field ArrayList mPages>
	//*  75  170:invokevirtual   #322 <Method boolean ArrayList.isEmpty()>
	//*  76  173:ifne            202
			bundle.putParcelableArray("pages", (android.os.Parcelable[])mPages.toArray(((Object []) (new Notification[mPages.size()]))));
	//   77  176:aload_2         
	//   78  177:ldc1            #75  <String "pages">
	//   79  179:aload_0         
	//   80  180:getfield        #120 <Field ArrayList mPages>
	//   81  183:aload_0         
	//   82  184:getfield        #120 <Field ArrayList mPages>
	//   83  187:invokevirtual   #153 <Method int ArrayList.size()>
	//   84  190:anewarray       Notification[]
	//   85  193:invokevirtual   #361 <Method Object[] ArrayList.toArray(Object[])>
	//   86  196:checkcast       #363 <Class android.os.Parcelable[]>
	//   87  199:invokevirtual   #367 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		if(mBackground != null)
	//*  88  202:aload_0         
	//*  89  203:getfield        #199 <Field Bitmap mBackground>
	//*  90  206:ifnull          219
			bundle.putParcelable("background", ((android.os.Parcelable) (mBackground)));
	//   91  209:aload_2         
	//   92  210:ldc1            #39  <String "background">
	//   93  212:aload_0         
	//   94  213:getfield        #199 <Field Bitmap mBackground>
	//   95  216:invokevirtual   #355 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(mContentIcon != 0)
	//*  96  219:aload_0         
	//*  97  220:getfield        #204 <Field int mContentIcon>
	//*  98  223:ifeq            236
			bundle.putInt("contentIcon", mContentIcon);
	//   99  226:aload_2         
	//  100  227:ldc1            #48  <String "contentIcon">
	//  101  229:aload_0         
	//  102  230:getfield        #204 <Field int mContentIcon>
	//  103  233:invokevirtual   #351 <Method void Bundle.putInt(String, int)>
		if(mContentIconGravity != 0x800005)
	//* 104  236:aload_0         
	//* 105  237:getfield        #122 <Field int mContentIconGravity>
	//* 106  240:ldc1            #12  <Int 0x800005>
	//* 107  242:icmpeq          255
			bundle.putInt("contentIconGravity", mContentIconGravity);
	//  108  245:aload_2         
	//  109  246:ldc1            #51  <String "contentIconGravity">
	//  110  248:aload_0         
	//  111  249:getfield        #122 <Field int mContentIconGravity>
	//  112  252:invokevirtual   #351 <Method void Bundle.putInt(String, int)>
		if(mContentActionIndex != -1)
	//* 113  255:aload_0         
	//* 114  256:getfield        #124 <Field int mContentActionIndex>
	//* 115  259:iconst_m1       
	//* 116  260:icmpeq          273
			bundle.putInt("contentActionIndex", mContentActionIndex);
	//  117  263:aload_2         
	//  118  264:ldc1            #45  <String "contentActionIndex">
	//  119  266:aload_0         
	//  120  267:getfield        #124 <Field int mContentActionIndex>
	//  121  270:invokevirtual   #351 <Method void Bundle.putInt(String, int)>
		if(mCustomSizePreset != 0)
	//* 122  273:aload_0         
	//* 123  274:getfield        #126 <Field int mCustomSizePreset>
	//* 124  277:ifeq            290
			bundle.putInt("customSizePreset", mCustomSizePreset);
	//  125  280:aload_2         
	//  126  281:ldc1            #57  <String "customSizePreset">
	//  127  283:aload_0         
	//  128  284:getfield        #126 <Field int mCustomSizePreset>
	//  129  287:invokevirtual   #351 <Method void Bundle.putInt(String, int)>
		if(mCustomContentHeight != 0)
	//* 130  290:aload_0         
	//* 131  291:getfield        #206 <Field int mCustomContentHeight>
	//* 132  294:ifeq            307
			bundle.putInt("customContentHeight", mCustomContentHeight);
	//  133  297:aload_2         
	//  134  298:ldc1            #54  <String "customContentHeight">
	//  135  300:aload_0         
	//  136  301:getfield        #206 <Field int mCustomContentHeight>
	//  137  304:invokevirtual   #351 <Method void Bundle.putInt(String, int)>
		if(mGravity != 80)
	//* 138  307:aload_0         
	//* 139  308:getfield        #128 <Field int mGravity>
	//* 140  311:bipush          80
	//* 141  313:icmpeq          326
			bundle.putInt("gravity", mGravity);
	//  142  316:aload_2         
	//  143  317:ldc1            #69  <String "gravity">
	//  144  319:aload_0         
	//  145  320:getfield        #128 <Field int mGravity>
	//  146  323:invokevirtual   #351 <Method void Bundle.putInt(String, int)>
		if(mHintScreenTimeout != 0)
	//* 147  326:aload_0         
	//* 148  327:getfield        #208 <Field int mHintScreenTimeout>
	//* 149  330:ifeq            343
			bundle.putInt("hintScreenTimeout", mHintScreenTimeout);
	//  150  333:aload_2         
	//  151  334:ldc1            #72  <String "hintScreenTimeout">
	//  152  336:aload_0         
	//  153  337:getfield        #208 <Field int mHintScreenTimeout>
	//  154  340:invokevirtual   #351 <Method void Bundle.putInt(String, int)>
		if(mDismissalId != null)
	//* 155  343:aload_0         
	//* 156  344:getfield        #214 <Field String mDismissalId>
	//* 157  347:ifnull          360
			bundle.putString("dismissalId", mDismissalId);
	//  158  350:aload_2         
	//  159  351:ldc1            #60  <String "dismissalId">
	//  160  353:aload_0         
	//  161  354:getfield        #214 <Field String mDismissalId>
	//  162  357:invokevirtual   #371 <Method void Bundle.putString(String, String)>
		if(mBridgeTag != null)
	//* 163  360:aload_0         
	//* 164  361:getfield        #216 <Field String mBridgeTag>
	//* 165  364:ifnull          377
			bundle.putString("bridgeTag", mBridgeTag);
	//  166  367:aload_2         
	//  167  368:ldc1            #42  <String "bridgeTag">
	//  168  370:aload_0         
	//  169  371:getfield        #216 <Field String mBridgeTag>
	//  170  374:invokevirtual   #371 <Method void Bundle.putString(String, String)>
		builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
	//  171  377:aload_1         
	//  172  378:invokevirtual   #374 <Method Bundle NotificationCompat$Builder.getExtras()>
	//  173  381:ldc1            #20  <String "android.wearable.EXTENSIONS">
	//  174  383:aload_2         
	//  175  384:invokevirtual   #378 <Method void Bundle.putBundle(String, Bundle)>
		return builder;
	//  176  387:aload_1         
	//  177  388:areturn         
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
	//    1    1:getfield        #199 <Field Bitmap mBackground>
	//    2    4:areturn         
	}

	public String getBridgeTag()
	{
		return mBridgeTag;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field String mBridgeTag>
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
	//    1    1:getfield        #204 <Field int mContentIcon>
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
	//    1    1:getfield        #206 <Field int mCustomContentHeight>
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
	//    1    1:getfield        #214 <Field String mDismissalId>
	//    2    4:areturn         
	}

	public PendingIntent getDisplayIntent()
	{
		return mDisplayIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field PendingIntent mDisplayIntent>
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
	//    1    1:getfield        #208 <Field int mHintScreenTimeout>
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
	//    2    2:putfield        #199 <Field Bitmap mBackground>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$WearableExtender setBridgeTag(String s)
	{
		mBridgeTag = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #216 <Field String mBridgeTag>
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
	//    2    2:putfield        #204 <Field int mContentIcon>
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
	//    3    3:invokespecial   #415 <Method void setFlag(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public NotificationCompat$WearableExtender setCustomContentHeight(int i)
	{
		mCustomContentHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #206 <Field int mCustomContentHeight>
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
	//    2    2:putfield        #214 <Field String mDismissalId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$WearableExtender setDisplayIntent(PendingIntent pendingintent)
	{
		mDisplayIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #191 <Field PendingIntent mDisplayIntent>
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
	//    3    4:invokespecial   #415 <Method void setFlag(int, boolean)>
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
	//    3    4:invokespecial   #415 <Method void setFlag(int, boolean)>
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
	//    3    4:invokespecial   #415 <Method void setFlag(int, boolean)>
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
	//    3    3:invokespecial   #415 <Method void setFlag(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public NotificationCompat$WearableExtender setHintScreenTimeout(int i)
	{
		mHintScreenTimeout = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #208 <Field int mHintScreenTimeout>
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
	//    3    3:invokespecial   #415 <Method void setFlag(int, boolean)>
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
	//    3    4:invokespecial   #415 <Method void setFlag(int, boolean)>
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
	//*  40   75:ifnull          337
		{
			ArrayList arraylist = ((Bundle) (notification)).getParcelableArrayList("actions");
	//   41   78:aload_1         
	//   42   79:ldc1            #36  <String "actions">
	//   43   81:invokevirtual   #144 <Method ArrayList Bundle.getParcelableArrayList(String)>
	//   44   84:astore_3        
			if(android.os.Build.VERSION.SDK_INT >= 16 && arraylist != null)
	//*  45   85:getstatic       #149 <Field int android.os.Build$VERSION.SDK_INT>
	//*  46   88:bipush          16
	//*  47   90:icmplt          184
	//*  48   93:aload_3         
	//*  49   94:ifnull          184
			{
				NotificationCompat.Action aaction[] = new NotificationCompat.Action[arraylist.size()];
	//   50   97:aload_3         
	//   51   98:invokevirtual   #153 <Method int ArrayList.size()>
	//   52  101:anewarray       NotificationCompat.Action[]
	//   53  104:astore          4
				for(int i = 0; i < aaction.length; i++)
	//*  54  106:iconst_0        
	//*  55  107:istore_2        
	//*  56  108:iload_2         
	//*  57  109:aload           4
	//*  58  111:arraylength     
	//*  59  112:icmpge          171
				{
					if(android.os.Build.VERSION.SDK_INT >= 20)
	//*  60  115:getstatic       #149 <Field int android.os.Build$VERSION.SDK_INT>
	//*  61  118:bipush          20
	//*  62  120:icmplt          141
					{
						aaction[i] = NotificationCompat.getActionCompatFromAction((android.app.Notification.Action)arraylist.get(i));
	//   63  123:aload           4
	//   64  125:iload_2         
	//   65  126:aload_3         
	//   66  127:iload_2         
	//   67  128:invokevirtual   #159 <Method Object ArrayList.get(int)>
	//   68  131:checkcast       #161 <Class android.app.Notification$Action>
	//   69  134:invokestatic    #165 <Method NotificationCompat$Action NotificationCompat.getActionCompatFromAction(android.app.Notification$Action)>
	//   70  137:aastore         
						continue;
	//   71  138:goto            164
					}
					if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  72  141:getstatic       #149 <Field int android.os.Build$VERSION.SDK_INT>
	//*  73  144:bipush          16
	//*  74  146:icmplt          164
						aaction[i] = NotificationCompatJellybean.getActionFromBundle((Bundle)arraylist.get(i));
	//   75  149:aload           4
	//   76  151:iload_2         
	//   77  152:aload_3         
	//   78  153:iload_2         
	//   79  154:invokevirtual   #159 <Method Object ArrayList.get(int)>
	//   80  157:checkcast       #136 <Class Bundle>
	//   81  160:invokestatic    #171 <Method NotificationCompat$Action NotificationCompatJellybean.getActionFromBundle(Bundle)>
	//   82  163:aastore         
				}

	//   83  164:iload_2         
	//   84  165:iconst_1        
	//   85  166:iadd            
	//   86  167:istore_2        
	//*  87  168:goto            108
				Collections.addAll(((java.util.Collection) (mActions)), ((Object []) ((NotificationCompat.Action[])aaction)));
	//   88  171:aload_0         
	//   89  172:getfield        #116 <Field ArrayList mActions>
	//   90  175:aload           4
	//   91  177:checkcast       #173 <Class NotificationCompat$Action[]>
	//   92  180:invokestatic    #179 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   93  183:pop             
			}
			mFlags = ((Bundle) (notification)).getInt("flags", 1);
	//   94  184:aload_0         
	//   95  185:aload_1         
	//   96  186:ldc1            #66  <String "flags">
	//   97  188:iconst_1        
	//   98  189:invokevirtual   #183 <Method int Bundle.getInt(String, int)>
	//   99  192:putfield        #118 <Field int mFlags>
			mDisplayIntent = (PendingIntent)((Bundle) (notification)).getParcelable("displayIntent");
	//  100  195:aload_0         
	//  101  196:aload_1         
	//  102  197:ldc1            #63  <String "displayIntent">
	//  103  199:invokevirtual   #187 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  104  202:checkcast       #189 <Class PendingIntent>
	//  105  205:putfield        #191 <Field PendingIntent mDisplayIntent>
			Notification anotification[] = NotificationCompat.getNotificationArrayFromBundle(((Bundle) (notification)), "pages");
	//  106  208:aload_1         
	//  107  209:ldc1            #75  <String "pages">
	//  108  211:invokestatic    #195 <Method Notification[] NotificationCompat.getNotificationArrayFromBundle(Bundle, String)>
	//  109  214:astore_3        
			if(anotification != null)
	//* 110  215:aload_3         
	//* 111  216:ifnull          228
				Collections.addAll(((java.util.Collection) (mPages)), ((Object []) (anotification)));
	//  112  219:aload_0         
	//  113  220:getfield        #120 <Field ArrayList mPages>
	//  114  223:aload_3         
	//  115  224:invokestatic    #179 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//  116  227:pop             
			mBackground = (Bitmap)((Bundle) (notification)).getParcelable("background");
	//  117  228:aload_0         
	//  118  229:aload_1         
	//  119  230:ldc1            #39  <String "background">
	//  120  232:invokevirtual   #187 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  121  235:checkcast       #197 <Class Bitmap>
	//  122  238:putfield        #199 <Field Bitmap mBackground>
			mContentIcon = ((Bundle) (notification)).getInt("contentIcon");
	//  123  241:aload_0         
	//  124  242:aload_1         
	//  125  243:ldc1            #48  <String "contentIcon">
	//  126  245:invokevirtual   #202 <Method int Bundle.getInt(String)>
	//  127  248:putfield        #204 <Field int mContentIcon>
			mContentIconGravity = ((Bundle) (notification)).getInt("contentIconGravity", 0x800005);
	//  128  251:aload_0         
	//  129  252:aload_1         
	//  130  253:ldc1            #51  <String "contentIconGravity">
	//  131  255:ldc1            #12  <Int 0x800005>
	//  132  257:invokevirtual   #183 <Method int Bundle.getInt(String, int)>
	//  133  260:putfield        #122 <Field int mContentIconGravity>
			mContentActionIndex = ((Bundle) (notification)).getInt("contentActionIndex", -1);
	//  134  263:aload_0         
	//  135  264:aload_1         
	//  136  265:ldc1            #45  <String "contentActionIndex">
	//  137  267:iconst_m1       
	//  138  268:invokevirtual   #183 <Method int Bundle.getInt(String, int)>
	//  139  271:putfield        #124 <Field int mContentActionIndex>
			mCustomSizePreset = ((Bundle) (notification)).getInt("customSizePreset", 0);
	//  140  274:aload_0         
	//  141  275:aload_1         
	//  142  276:ldc1            #57  <String "customSizePreset">
	//  143  278:iconst_0        
	//  144  279:invokevirtual   #183 <Method int Bundle.getInt(String, int)>
	//  145  282:putfield        #126 <Field int mCustomSizePreset>
			mCustomContentHeight = ((Bundle) (notification)).getInt("customContentHeight");
	//  146  285:aload_0         
	//  147  286:aload_1         
	//  148  287:ldc1            #54  <String "customContentHeight">
	//  149  289:invokevirtual   #202 <Method int Bundle.getInt(String)>
	//  150  292:putfield        #206 <Field int mCustomContentHeight>
			mGravity = ((Bundle) (notification)).getInt("gravity", 80);
	//  151  295:aload_0         
	//  152  296:aload_1         
	//  153  297:ldc1            #69  <String "gravity">
	//  154  299:bipush          80
	//  155  301:invokevirtual   #183 <Method int Bundle.getInt(String, int)>
	//  156  304:putfield        #128 <Field int mGravity>
			mHintScreenTimeout = ((Bundle) (notification)).getInt("hintScreenTimeout");
	//  157  307:aload_0         
	//  158  308:aload_1         
	//  159  309:ldc1            #72  <String "hintScreenTimeout">
	//  160  311:invokevirtual   #202 <Method int Bundle.getInt(String)>
	//  161  314:putfield        #208 <Field int mHintScreenTimeout>
			mDismissalId = ((Bundle) (notification)).getString("dismissalId");
	//  162  317:aload_0         
	//  163  318:aload_1         
	//  164  319:ldc1            #60  <String "dismissalId">
	//  165  321:invokevirtual   #212 <Method String Bundle.getString(String)>
	//  166  324:putfield        #214 <Field String mDismissalId>
			mBridgeTag = ((Bundle) (notification)).getString("bridgeTag");
	//  167  327:aload_0         
	//  168  328:aload_1         
	//  169  329:ldc1            #42  <String "bridgeTag">
	//  170  331:invokevirtual   #212 <Method String Bundle.getString(String)>
	//  171  334:putfield        #216 <Field String mBridgeTag>
		}
	//  172  337:return          
	}
}
