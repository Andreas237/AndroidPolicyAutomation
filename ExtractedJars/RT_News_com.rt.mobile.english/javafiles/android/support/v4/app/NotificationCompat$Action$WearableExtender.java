// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat

public static final class NotificationCompat$Action$WearableExtender
	implements NotificationCompat.Action.Extender
{

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
	//    5    7:getfield        #47  <Field int mFlags>
	//    6   10:ior             
	//    7   11:putfield        #47  <Field int mFlags>
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
	//   14   20:getfield        #47  <Field int mFlags>
	//   15   23:iand            
	//   16   24:putfield        #47  <Field int mFlags>
			return;
	//   17   27:return          
		}
	}

	public NotificationCompat$Action$WearableExtender clone()
	{
		NotificationCompat$Action$WearableExtender notificationcompat$action$wearableextender = new NotificationCompat$Action$WearableExtender();
	//    0    0:new             #2   <Class NotificationCompat$Action$WearableExtender>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void NotificationCompat$Action$WearableExtender()>
	//    3    7:astore_1        
		notificationcompat$action$wearableextender.mFlags = mFlags;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #47  <Field int mFlags>
	//    7   13:putfield        #47  <Field int mFlags>
		notificationcompat$action$wearableextender.mInProgressLabel = mInProgressLabel;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #69  <Field CharSequence mInProgressLabel>
	//   11   21:putfield        #69  <Field CharSequence mInProgressLabel>
		notificationcompat$action$wearableextender.mConfirmLabel = mConfirmLabel;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #71  <Field CharSequence mConfirmLabel>
	//   15   29:putfield        #71  <Field CharSequence mConfirmLabel>
		notificationcompat$action$wearableextender.mCancelLabel = mCancelLabel;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #73  <Field CharSequence mCancelLabel>
	//   19   37:putfield        #73  <Field CharSequence mCancelLabel>
		return notificationcompat$action$wearableextender;
	//   20   40:aload_1         
	//   21   41:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method NotificationCompat$Action$WearableExtender clone()>
	//    2    4:areturn         
	}

	public NotificationCompat.Action.Builder extend(NotificationCompat.Action.Builder builder)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #55  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void Bundle()>
	//    3    7:astore_2        
		if(mFlags != 1)
	//*   4    8:aload_0         
	//*   5    9:getfield        #47  <Field int mFlags>
	//*   6   12:iconst_1        
	//*   7   13:icmpeq          26
			bundle.putInt("flags", mFlags);
	//    8   16:aload_2         
	//    9   17:ldc1            #33  <String "flags">
	//   10   19:aload_0         
	//   11   20:getfield        #47  <Field int mFlags>
	//   12   23:invokevirtual   #91  <Method void Bundle.putInt(String, int)>
		if(mInProgressLabel != null)
	//*  13   26:aload_0         
	//*  14   27:getfield        #69  <Field CharSequence mInProgressLabel>
	//*  15   30:ifnull          43
			bundle.putCharSequence("inProgressLabel", mInProgressLabel);
	//   16   33:aload_2         
	//   17   34:ldc1            #36  <String "inProgressLabel">
	//   18   36:aload_0         
	//   19   37:getfield        #69  <Field CharSequence mInProgressLabel>
	//   20   40:invokevirtual   #95  <Method void Bundle.putCharSequence(String, CharSequence)>
		if(mConfirmLabel != null)
	//*  21   43:aload_0         
	//*  22   44:getfield        #71  <Field CharSequence mConfirmLabel>
	//*  23   47:ifnull          60
			bundle.putCharSequence("confirmLabel", mConfirmLabel);
	//   24   50:aload_2         
	//   25   51:ldc1            #30  <String "confirmLabel">
	//   26   53:aload_0         
	//   27   54:getfield        #71  <Field CharSequence mConfirmLabel>
	//   28   57:invokevirtual   #95  <Method void Bundle.putCharSequence(String, CharSequence)>
		if(mCancelLabel != null)
	//*  29   60:aload_0         
	//*  30   61:getfield        #73  <Field CharSequence mCancelLabel>
	//*  31   64:ifnull          77
			bundle.putCharSequence("cancelLabel", mCancelLabel);
	//   32   67:aload_2         
	//   33   68:ldc1            #27  <String "cancelLabel">
	//   34   70:aload_0         
	//   35   71:getfield        #73  <Field CharSequence mCancelLabel>
	//   36   74:invokevirtual   #95  <Method void Bundle.putCharSequence(String, CharSequence)>
		builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
	//   37   77:aload_1         
	//   38   78:invokevirtual   #98  <Method Bundle NotificationCompat$Action$Builder.getExtras()>
	//   39   81:ldc1            #19  <String "android.wearable.EXTENSIONS">
	//   40   83:aload_2         
	//   41   84:invokevirtual   #102 <Method void Bundle.putBundle(String, Bundle)>
		return builder;
	//   42   87:aload_1         
	//   43   88:areturn         
	}

	public CharSequence getCancelLabel()
	{
		return mCancelLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field CharSequence mCancelLabel>
	//    2    4:areturn         
	}

	public CharSequence getConfirmLabel()
	{
		return mConfirmLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field CharSequence mConfirmLabel>
	//    2    4:areturn         
	}

	public boolean getHintDisplayActionInline()
	{
		return (mFlags & 4) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mFlags>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean getHintLaunchesActivity()
	{
		return (mFlags & 2) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mFlags>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public CharSequence getInProgressLabel()
	{
		return mInProgressLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field CharSequence mInProgressLabel>
	//    2    4:areturn         
	}

	public boolean isAvailableOffline()
	{
		return (mFlags & 1) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mFlags>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public NotificationCompat$Action$WearableExtender setAvailableOffline(boolean flag)
	{
		setFlag(1, flag);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:invokespecial   #114 <Method void setFlag(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public NotificationCompat$Action$WearableExtender setCancelLabel(CharSequence charsequence)
	{
		mCancelLabel = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field CharSequence mCancelLabel>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Action$WearableExtender setConfirmLabel(CharSequence charsequence)
	{
		mConfirmLabel = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #71  <Field CharSequence mConfirmLabel>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Action$WearableExtender setHintDisplayActionInline(boolean flag)
	{
		setFlag(4, flag);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:iload_1         
	//    3    3:invokespecial   #114 <Method void setFlag(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public NotificationCompat$Action$WearableExtender setHintLaunchesActivity(boolean flag)
	{
		setFlag(2, flag);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iload_1         
	//    3    3:invokespecial   #114 <Method void setFlag(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public NotificationCompat$Action$WearableExtender setInProgressLabel(CharSequence charsequence)
	{
		mInProgressLabel = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field CharSequence mInProgressLabel>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private static final int DEFAULT_FLAGS = 1;
	private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
	private static final int FLAG_AVAILABLE_OFFLINE = 1;
	private static final int FLAG_HINT_DISPLAY_INLINE = 4;
	private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
	private static final String KEY_CANCEL_LABEL = "cancelLabel";
	private static final String KEY_CONFIRM_LABEL = "confirmLabel";
	private static final String KEY_FLAGS = "flags";
	private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
	private CharSequence mCancelLabel;
	private CharSequence mConfirmLabel;
	private int mFlags;
	private CharSequence mInProgressLabel;

	public NotificationCompat$Action$WearableExtender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		mFlags = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #47  <Field int mFlags>
	//    5    9:return          
	}

	public NotificationCompat$Action$WearableExtender(NotificationCompat.Action action)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		mFlags = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #47  <Field int mFlags>
		action = ((NotificationCompat.Action) (action.getExtras().getBundle("android.wearable.EXTENSIONS")));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #53  <Method Bundle NotificationCompat$Action.getExtras()>
	//    7   13:ldc1            #19  <String "android.wearable.EXTENSIONS">
	//    8   15:invokevirtual   #59  <Method Bundle Bundle.getBundle(String)>
	//    9   18:astore_1        
		if(action != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          64
		{
			mFlags = ((Bundle) (action)).getInt("flags", 1);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:ldc1            #33  <String "flags">
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #63  <Method int Bundle.getInt(String, int)>
	//   17   31:putfield        #47  <Field int mFlags>
			mInProgressLabel = ((Bundle) (action)).getCharSequence("inProgressLabel");
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:ldc1            #36  <String "inProgressLabel">
	//   21   38:invokevirtual   #67  <Method CharSequence Bundle.getCharSequence(String)>
	//   22   41:putfield        #69  <Field CharSequence mInProgressLabel>
			mConfirmLabel = ((Bundle) (action)).getCharSequence("confirmLabel");
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:ldc1            #30  <String "confirmLabel">
	//   26   48:invokevirtual   #67  <Method CharSequence Bundle.getCharSequence(String)>
	//   27   51:putfield        #71  <Field CharSequence mConfirmLabel>
			mCancelLabel = ((Bundle) (action)).getCharSequence("cancelLabel");
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:ldc1            #27  <String "cancelLabel">
	//   31   58:invokevirtual   #67  <Method CharSequence Bundle.getCharSequence(String)>
	//   32   61:putfield        #73  <Field CharSequence mCancelLabel>
		}
	//   33   64:return          
	}
}
