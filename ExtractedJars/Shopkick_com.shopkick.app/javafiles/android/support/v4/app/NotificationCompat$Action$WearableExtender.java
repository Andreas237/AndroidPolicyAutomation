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
			mFlags = i & mFlags;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:aload_0         
	//   12   18:getfield        #47  <Field int mFlags>
	//   13   21:iand            
	//   14   22:putfield        #47  <Field int mFlags>
			return;
	//   15   25:return          
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
	//    3    7:astore_3        
		int i = mFlags;
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field int mFlags>
	//    6   12:istore_2        
		if(i != 1)
	//*   7   13:iload_2         
	//*   8   14:iconst_1        
	//*   9   15:icmpeq          25
			bundle.putInt("flags", i);
	//   10   18:aload_3         
	//   11   19:ldc1            #33  <String "flags">
	//   12   21:iload_2         
	//   13   22:invokevirtual   #91  <Method void Bundle.putInt(String, int)>
		CharSequence charsequence = mInProgressLabel;
	//   14   25:aload_0         
	//   15   26:getfield        #69  <Field CharSequence mInProgressLabel>
	//   16   29:astore          4
		if(charsequence != null)
	//*  17   31:aload           4
	//*  18   33:ifnull          44
			bundle.putCharSequence("inProgressLabel", charsequence);
	//   19   36:aload_3         
	//   20   37:ldc1            #36  <String "inProgressLabel">
	//   21   39:aload           4
	//   22   41:invokevirtual   #95  <Method void Bundle.putCharSequence(String, CharSequence)>
		charsequence = mConfirmLabel;
	//   23   44:aload_0         
	//   24   45:getfield        #71  <Field CharSequence mConfirmLabel>
	//   25   48:astore          4
		if(charsequence != null)
	//*  26   50:aload           4
	//*  27   52:ifnull          63
			bundle.putCharSequence("confirmLabel", charsequence);
	//   28   55:aload_3         
	//   29   56:ldc1            #30  <String "confirmLabel">
	//   30   58:aload           4
	//   31   60:invokevirtual   #95  <Method void Bundle.putCharSequence(String, CharSequence)>
		charsequence = mCancelLabel;
	//   32   63:aload_0         
	//   33   64:getfield        #73  <Field CharSequence mCancelLabel>
	//   34   67:astore          4
		if(charsequence != null)
	//*  35   69:aload           4
	//*  36   71:ifnull          82
			bundle.putCharSequence("cancelLabel", charsequence);
	//   37   74:aload_3         
	//   38   75:ldc1            #27  <String "cancelLabel">
	//   39   77:aload           4
	//   40   79:invokevirtual   #95  <Method void Bundle.putCharSequence(String, CharSequence)>
		builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
	//   41   82:aload_1         
	//   42   83:invokevirtual   #98  <Method Bundle NotificationCompat$Action$Builder.getExtras()>
	//   43   86:ldc1            #19  <String "android.wearable.EXTENSIONS">
	//   44   88:aload_3         
	//   45   89:invokevirtual   #102 <Method void Bundle.putBundle(String, Bundle)>
		return builder;
	//   46   92:aload_1         
	//   47   93:areturn         
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
	//    3    3:invokespecial   #116 <Method void setFlag(int, boolean)>
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
	//    3    3:invokespecial   #116 <Method void setFlag(int, boolean)>
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
	//    3    3:invokespecial   #116 <Method void setFlag(int, boolean)>
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
