// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput

public static class NotificationCompat$Action extends ion
{
	public static final class Builder
	{

		public Builder addExtras(Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          12
				mExtras.putAll(bundle);
		//    2    4:aload_0         
		//    3    5:getfield        #51  <Field Bundle mExtras>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #91  <Method void Bundle.putAll(Bundle)>
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public Builder addRemoteInput(RemoteInput remoteinput)
		{
			if(mRemoteInputs == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field ArrayList mRemoteInputs>
		//*   2    4:ifnonnull       18
				mRemoteInputs = new ArrayList();
		//    3    7:aload_0         
		//    4    8:new             #55  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #94  <Method void ArrayList()>
		//    7   15:putfield        #53  <Field ArrayList mRemoteInputs>
			mRemoteInputs.add(((Object) (remoteinput)));
		//    8   18:aload_0         
		//    9   19:getfield        #53  <Field ArrayList mRemoteInputs>
		//   10   22:aload_1         
		//   11   23:invokevirtual   #98  <Method boolean ArrayList.add(Object)>
		//   12   26:pop             
			return this;
		//   13   27:aload_0         
		//   14   28:areturn         
		}

		public NotificationCompat.Action build()
		{
			RemoteInput aremoteinput[] = ((RemoteInput []) (new ArrayList()));
		//    0    0:new             #55  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #94  <Method void ArrayList()>
		//    3    7:astore_1        
			RemoteInput aremoteinput1[] = ((RemoteInput []) (new ArrayList()));
		//    4    8:new             #55  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #94  <Method void ArrayList()>
		//    7   15:astore_2        
			if(mRemoteInputs != null)
		//*   8   16:aload_0         
		//*   9   17:getfield        #53  <Field ArrayList mRemoteInputs>
		//*  10   20:ifnull          83
			{
				for(Iterator iterator = mRemoteInputs.iterator(); iterator.hasNext();)
		//*  11   23:aload_0         
		//*  12   24:getfield        #53  <Field ArrayList mRemoteInputs>
		//*  13   27:invokevirtual   #104 <Method Iterator ArrayList.iterator()>
		//*  14   30:astore_3        
		//*  15   31:aload_3         
		//*  16   32:invokeinterface #109 <Method boolean Iterator.hasNext()>
		//*  17   37:ifeq            83
				{
					RemoteInput remoteinput = (RemoteInput)iterator.next();
		//   18   40:aload_3         
		//   19   41:invokeinterface #113 <Method Object Iterator.next()>
		//   20   46:checkcast       #115 <Class RemoteInput>
		//   21   49:astore          4
					if(remoteinput.isDataOnly())
		//*  22   51:aload           4
		//*  23   53:invokevirtual   #118 <Method boolean RemoteInput.isDataOnly()>
		//*  24   56:ifeq            71
						((List) (aremoteinput)).add(((Object) (remoteinput)));
		//   25   59:aload_1         
		//   26   60:aload           4
		//   27   62:invokeinterface #121 <Method boolean List.add(Object)>
		//   28   67:pop             
					else
		//*  29   68:goto            31
						((List) (aremoteinput1)).add(((Object) (remoteinput)));
		//   30   71:aload_2         
		//   31   72:aload           4
		//   32   74:invokeinterface #121 <Method boolean List.add(Object)>
		//   33   79:pop             
				}

			}
		//*  34   80:goto            31
			if(((List) (aremoteinput)).isEmpty())
		//*  35   83:aload_1         
		//*  36   84:invokeinterface #124 <Method boolean List.isEmpty()>
		//*  37   89:ifeq            135
				aremoteinput = null;
		//   38   92:aconst_null     
		//   39   93:astore_1        
			else
		//*  40   94:aload_2         
		//*  41   95:invokeinterface #124 <Method boolean List.isEmpty()>
		//*  42  100:ifeq            157
		//*  43  103:aconst_null     
		//*  44  104:astore_2        
		//*  45  105:new             #6   <Class NotificationCompat$Action>
		//*  46  108:dup             
		//*  47  109:aload_0         
		//*  48  110:getfield        #39  <Field int mIcon>
		//*  49  113:aload_0         
		//*  50  114:getfield        #47  <Field CharSequence mTitle>
		//*  51  117:aload_0         
		//*  52  118:getfield        #49  <Field PendingIntent mIntent>
		//*  53  121:aload_0         
		//*  54  122:getfield        #51  <Field Bundle mExtras>
		//*  55  125:aload_2         
		//*  56  126:aload_1         
		//*  57  127:aload_0         
		//*  58  128:getfield        #37  <Field boolean mAllowGeneratedReplies>
		//*  59  131:invokespecial   #127 <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean)>
		//*  60  134:areturn         
				aremoteinput = (RemoteInput[])((List) (aremoteinput)).toArray(((Object []) (new RemoteInput[((List) (aremoteinput)).size()])));
		//   61  135:aload_1         
		//   62  136:aload_1         
		//   63  137:invokeinterface #131 <Method int List.size()>
		//   64  142:anewarray       RemoteInput[]
		//   65  145:invokeinterface #135 <Method Object[] List.toArray(Object[])>
		//   66  150:checkcast       #137 <Class RemoteInput[]>
		//   67  153:astore_1        
			if(((List) (aremoteinput1)).isEmpty())
				aremoteinput1 = null;
			else
		//*  68  154:goto            94
				aremoteinput1 = (RemoteInput[])((List) (aremoteinput1)).toArray(((Object []) (new RemoteInput[((List) (aremoteinput1)).size()])));
		//   69  157:aload_2         
		//   70  158:aload_2         
		//   71  159:invokeinterface #131 <Method int List.size()>
		//   72  164:anewarray       RemoteInput[]
		//   73  167:invokeinterface #135 <Method Object[] List.toArray(Object[])>
		//   74  172:checkcast       #137 <Class RemoteInput[]>
		//   75  175:astore_2        
			return new NotificationCompat.Action(mIcon, mTitle, mIntent, mExtras, aremoteinput1, aremoteinput, mAllowGeneratedReplies);
		//*  76  176:goto            105
		}

		public Builder extend(Extender extender)
		{
			extender.extend(this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokeinterface #144 <Method NotificationCompat$Action$Builder NotificationCompat$Action$Extender.extend(NotificationCompat$Action$Builder)>
		//    3    7:pop             
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Bundle getExtras()
		{
			return mExtras;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field Bundle mExtras>
		//    2    4:areturn         
		}

		public Builder setAllowGeneratedReplies(boolean flag)
		{
			mAllowGeneratedReplies = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #37  <Field boolean mAllowGeneratedReplies>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private boolean mAllowGeneratedReplies;
		private final Bundle mExtras;
		private final int mIcon;
		private final PendingIntent mIntent;
		private ArrayList mRemoteInputs;
		private final CharSequence mTitle;

		public Builder(int i, CharSequence charsequence, PendingIntent pendingintent)
		{
			this(i, charsequence, pendingintent, new Bundle(), ((RemoteInput []) (null)), true);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:new             #27  <Class Bundle>
		//    5    7:dup             
		//    6    8:invokespecial   #30  <Method void Bundle()>
		//    7   11:aconst_null     
		//    8   12:iconst_1        
		//    9   13:invokespecial   #33  <Method void NotificationCompat$Action$Builder(int, CharSequence, PendingIntent, Bundle, RemoteInput[], boolean)>
		//   10   16:return          
		}

		private Builder(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
			mAllowGeneratedReplies = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #37  <Field boolean mAllowGeneratedReplies>
			mIcon = i;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #39  <Field int mIcon>
			mTitle = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:invokestatic    #45  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//   11   19:putfield        #47  <Field CharSequence mTitle>
			mIntent = pendingintent;
		//   12   22:aload_0         
		//   13   23:aload_3         
		//   14   24:putfield        #49  <Field PendingIntent mIntent>
			mExtras = bundle;
		//   15   27:aload_0         
		//   16   28:aload           4
		//   17   30:putfield        #51  <Field Bundle mExtras>
			if(aremoteinput == null)
		//*  18   33:aload           5
		//*  19   35:ifnonnull       52
				charsequence = null;
		//   20   38:aconst_null     
		//   21   39:astore_2        
			else
		//*  22   40:aload_0         
		//*  23   41:aload_2         
		//*  24   42:putfield        #53  <Field ArrayList mRemoteInputs>
		//*  25   45:aload_0         
		//*  26   46:iload           6
		//*  27   48:putfield        #37  <Field boolean mAllowGeneratedReplies>
		//*  28   51:return          
				charsequence = ((CharSequence) (new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (aremoteinput))))))));
		//   29   52:new             #55  <Class ArrayList>
		//   30   55:dup             
		//   31   56:aload           5
		//   32   58:invokestatic    #61  <Method List Arrays.asList(Object[])>
		//   33   61:invokespecial   #64  <Method void ArrayList(java.util.Collection)>
		//   34   64:astore_2        
			mRemoteInputs = ((ArrayList) (charsequence));
			mAllowGeneratedReplies = flag;
		//*  35   65:goto            40
		}

		public Builder(NotificationCompat.Action action)
		{
			this(action.icon, action.title, action.actionIntent, new Bundle(action.mExtras), action.getRemoteInputs(), action.getAllowGeneratedReplies());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #68  <Field int NotificationCompat$Action.icon>
		//    3    5:aload_1         
		//    4    6:getfield        #71  <Field CharSequence NotificationCompat$Action.title>
		//    5    9:aload_1         
		//    6   10:getfield        #74  <Field PendingIntent NotificationCompat$Action.actionIntent>
		//    7   13:new             #27  <Class Bundle>
		//    8   16:dup             
		//    9   17:aload_1         
		//   10   18:getfield        #75  <Field Bundle NotificationCompat$Action.mExtras>
		//   11   21:invokespecial   #78  <Method void Bundle(Bundle)>
		//   12   24:aload_1         
		//   13   25:invokevirtual   #82  <Method RemoteInput[] NotificationCompat$Action.getRemoteInputs()>
		//   14   28:aload_1         
		//   15   29:invokevirtual   #86  <Method boolean NotificationCompat$Action.getAllowGeneratedReplies()>
		//   16   32:invokespecial   #33  <Method void NotificationCompat$Action$Builder(int, CharSequence, PendingIntent, Bundle, RemoteInput[], boolean)>
		//   17   35:return          
		}
	}

	public static interface Extender
	{

		public abstract Builder extend(Builder builder);
	}

	public static final class WearableExtender
		implements Extender
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
		//    4    6:getfield        #47  <Field int mFlags>
		//    5    9:iload_1         
		//    6   10:ior             
		//    7   11:putfield        #47  <Field int mFlags>
				return;
		//    8   14:return          
			} else
			{
				mFlags = mFlags & ~i;
		//    9   15:aload_0         
		//   10   16:aload_0         
		//   11   17:getfield        #47  <Field int mFlags>
		//   12   20:iload_1         
		//   13   21:iconst_m1       
		//   14   22:ixor            
		//   15   23:iand            
		//   16   24:putfield        #47  <Field int mFlags>
				return;
		//   17   27:return          
			}
		}

		public WearableExtender clone()
		{
			WearableExtender wearableextender = new WearableExtender();
		//    0    0:new             #2   <Class NotificationCompat$Action$WearableExtender>
		//    1    3:dup             
		//    2    4:invokespecial   #78  <Method void NotificationCompat$Action$WearableExtender()>
		//    3    7:astore_1        
			wearableextender.mFlags = mFlags;
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #47  <Field int mFlags>
		//    7   13:putfield        #47  <Field int mFlags>
			wearableextender.mInProgressLabel = mInProgressLabel;
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #69  <Field CharSequence mInProgressLabel>
		//   11   21:putfield        #69  <Field CharSequence mInProgressLabel>
			wearableextender.mConfirmLabel = mConfirmLabel;
		//   12   24:aload_1         
		//   13   25:aload_0         
		//   14   26:getfield        #71  <Field CharSequence mConfirmLabel>
		//   15   29:putfield        #71  <Field CharSequence mConfirmLabel>
			wearableextender.mCancelLabel = mCancelLabel;
		//   16   32:aload_1         
		//   17   33:aload_0         
		//   18   34:getfield        #73  <Field CharSequence mCancelLabel>
		//   19   37:putfield        #73  <Field CharSequence mCancelLabel>
			return wearableextender;
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

		public Builder extend(Builder builder)
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

		public WearableExtender setAvailableOffline(boolean flag)
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

		public WearableExtender setCancelLabel(CharSequence charsequence)
		{
			mCancelLabel = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #73  <Field CharSequence mCancelLabel>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public WearableExtender setConfirmLabel(CharSequence charsequence)
		{
			mConfirmLabel = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #71  <Field CharSequence mConfirmLabel>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public WearableExtender setHintDisplayActionInline(boolean flag)
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

		public WearableExtender setHintLaunchesActivity(boolean flag)
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

		public WearableExtender setInProgressLabel(CharSequence charsequence)
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

		public WearableExtender()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #45  <Method void Object()>
			mFlags = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #47  <Field int mFlags>
		//    5    9:return          
		}

		public WearableExtender(NotificationCompat.Action action)
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


	public PendingIntent getActionIntent()
	{
		return actionIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field PendingIntent actionIntent>
	//    2    4:areturn         
	}

	public boolean getAllowGeneratedReplies()
	{
		return mAllowGeneratedReplies;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field boolean mAllowGeneratedReplies>
	//    2    4:ireturn         
	}

	public RemoteInput[] getDataOnlyRemoteInputs()
	{
		return mDataOnlyRemoteInputs;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field RemoteInput[] mDataOnlyRemoteInputs>
	//    2    4:areturn         
	}

	public volatile teInput[] getDataOnlyRemoteInputs()
	{
		return ((teInput []) (getDataOnlyRemoteInputs()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method RemoteInput[] getDataOnlyRemoteInputs()>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public int getIcon()
	{
		return icon;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int icon>
	//    2    4:ireturn         
	}

	public RemoteInput[] getRemoteInputs()
	{
		return mRemoteInputs;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field RemoteInput[] mRemoteInputs>
	//    2    4:areturn         
	}

	public volatile teInput[] getRemoteInputs()
	{
		return ((teInput []) (getRemoteInputs()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method RemoteInput[] getRemoteInputs()>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field CharSequence title>
	//    2    4:areturn         
	}

	public static final ion.Factory FACTORY = new NotificationCompatBase.Action.Factory() {

		public NotificationCompatBase.Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[], RemoteInputCompatBase.RemoteInput aremoteinput1[], boolean flag)
		{
			return ((NotificationCompatBase.Action) (new NotificationCompat.Action(i, charsequence, pendingintent, bundle, (RemoteInput[])(RemoteInput[])aremoteinput, (RemoteInput[])(RemoteInput[])aremoteinput1, flag)));
		//    0    0:new             #8   <Class NotificationCompat$Action>
		//    1    3:dup             
		//    2    4:iload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:aload           5
		//    7   11:checkcast       #20  <Class RemoteInput[]>
		//    8   14:checkcast       #20  <Class RemoteInput[]>
		//    9   17:aload           6
		//   10   19:checkcast       #20  <Class RemoteInput[]>
		//   11   22:checkcast       #20  <Class RemoteInput[]>
		//   12   25:iload           7
		//   13   27:invokespecial   #23  <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean)>
		//   14   30:areturn         
		}

		public NotificationCompat.Action[] newArray(int i)
		{
			return new NotificationCompat.Action[i];
		//    0    0:iload_1         
		//    1    1:anewarray       NotificationCompat.Action[]
		//    2    4:areturn         
		}

		public volatile NotificationCompatBase.Action[] newArray(int i)
		{
			return ((NotificationCompatBase.Action []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method NotificationCompat$Action[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public PendingIntent actionIntent;
	public int icon;
	private boolean mAllowGeneratedReplies;
	private final RemoteInput mDataOnlyRemoteInputs[];
	final Bundle mExtras;
	private final RemoteInput mRemoteInputs[];
	public CharSequence title;

	static 
	{
	//    0    0:new             #9   <Class NotificationCompat$Action$1>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void NotificationCompat$Action$1()>
	//    3    7:putstatic       #44  <Field NotificationCompatBase$Action$Factory FACTORY>
	//*   4   10:return          
	}

	public NotificationCompat$Action(int i, CharSequence charsequence, PendingIntent pendingintent)
	{
		this(i, charsequence, pendingintent, new Bundle(), ((RemoteInput []) (null)), ((RemoteInput []) (null)), true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #48  <Class Bundle>
	//    5    7:dup             
	//    6    8:invokespecial   #49  <Method void Bundle()>
	//    7   11:aconst_null     
	//    8   12:aconst_null     
	//    9   13:iconst_1        
	//   10   14:invokespecial   #52  <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean)>
	//   11   17:return          
	}

	NotificationCompat$Action(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], RemoteInput aremoteinput1[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void NotificationCompatBase$Action()>
		icon = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #55  <Field int icon>
		title = .limitCharSequenceLength(charsequence);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #61  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    8   14:putfield        #63  <Field CharSequence title>
		actionIntent = pendingintent;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #65  <Field PendingIntent actionIntent>
		if(bundle == null)
	//*  12   22:aload           4
	//*  13   24:ifnull          52
	//*  14   27:aload_0         
	//*  15   28:aload           4
	//*  16   30:putfield        #67  <Field Bundle mExtras>
	//*  17   33:aload_0         
	//*  18   34:aload           5
	//*  19   36:putfield        #69  <Field RemoteInput[] mRemoteInputs>
	//*  20   39:aload_0         
	//*  21   40:aload           6
	//*  22   42:putfield        #71  <Field RemoteInput[] mDataOnlyRemoteInputs>
	//*  23   45:aload_0         
	//*  24   46:iload           7
	//*  25   48:putfield        #73  <Field boolean mAllowGeneratedReplies>
	//*  26   51:return          
			bundle = new Bundle();
	//   27   52:new             #48  <Class Bundle>
	//   28   55:dup             
	//   29   56:invokespecial   #49  <Method void Bundle()>
	//   30   59:astore          4
		mExtras = bundle;
		mRemoteInputs = aremoteinput;
		mDataOnlyRemoteInputs = aremoteinput1;
		mAllowGeneratedReplies = flag;
	//*  31   61:goto            27
	}
}
