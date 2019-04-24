// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput

public static class NotificationCompat$Action
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
		//*   1    1:getfield        #64  <Field ArrayList mRemoteInputs>
		//*   2    4:ifnonnull       18
				mRemoteInputs = new ArrayList();
		//    3    7:aload_0         
		//    4    8:new             #53  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #94  <Method void ArrayList()>
		//    7   15:putfield        #64  <Field ArrayList mRemoteInputs>
			mRemoteInputs.add(((Object) (remoteinput)));
		//    8   18:aload_0         
		//    9   19:getfield        #64  <Field ArrayList mRemoteInputs>
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
		//    0    0:new             #53  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #94  <Method void ArrayList()>
		//    3    7:astore_2        
			ArrayList arraylist = new ArrayList();
		//    4    8:new             #53  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #94  <Method void ArrayList()>
		//    7   15:astore          4
			if(mRemoteInputs != null)
		//*   8   17:aload_0         
		//*   9   18:getfield        #64  <Field ArrayList mRemoteInputs>
		//*  10   21:ifnull          85
			{
				for(Iterator iterator = mRemoteInputs.iterator(); iterator.hasNext();)
		//*  11   24:aload_0         
		//*  12   25:getfield        #64  <Field ArrayList mRemoteInputs>
		//*  13   28:invokevirtual   #104 <Method Iterator ArrayList.iterator()>
		//*  14   31:astore_3        
		//*  15   32:aload_3         
		//*  16   33:invokeinterface #109 <Method boolean Iterator.hasNext()>
		//*  17   38:ifeq            85
				{
					RemoteInput remoteinput = (RemoteInput)iterator.next();
		//   18   41:aload_3         
		//   19   42:invokeinterface #113 <Method Object Iterator.next()>
		//   20   47:checkcast       #115 <Class RemoteInput>
		//   21   50:astore          5
					if(remoteinput.isDataOnly())
		//*  22   52:aload           5
		//*  23   54:invokevirtual   #118 <Method boolean RemoteInput.isDataOnly()>
		//*  24   57:ifeq            72
						((List) (aremoteinput)).add(((Object) (remoteinput)));
		//   25   60:aload_2         
		//   26   61:aload           5
		//   27   63:invokeinterface #121 <Method boolean List.add(Object)>
		//   28   68:pop             
					else
		//*  29   69:goto            32
						((List) (arraylist)).add(((Object) (remoteinput)));
		//   30   72:aload           4
		//   31   74:aload           5
		//   32   76:invokeinterface #121 <Method boolean List.add(Object)>
		//   33   81:pop             
				}

			}
		//*  34   82:goto            32
			boolean flag = ((List) (aremoteinput)).isEmpty();
		//   35   85:aload_2         
		//   36   86:invokeinterface #124 <Method boolean List.isEmpty()>
		//   37   91:istore_1        
			RemoteInput aremoteinput1[] = null;
		//   38   92:aconst_null     
		//   39   93:astore_3        
			if(flag)
		//*  40   94:iload_1         
		//*  41   95:ifeq            103
				aremoteinput = null;
		//   42   98:aconst_null     
		//   43   99:astore_2        
			else
		//*  44  100:goto            122
				aremoteinput = (RemoteInput[])((List) (aremoteinput)).toArray(((Object []) (new RemoteInput[((List) (aremoteinput)).size()])));
		//   45  103:aload_2         
		//   46  104:aload_2         
		//   47  105:invokeinterface #128 <Method int List.size()>
		//   48  110:anewarray       RemoteInput[]
		//   49  113:invokeinterface #132 <Method Object[] List.toArray(Object[])>
		//   50  118:checkcast       #134 <Class RemoteInput[]>
		//   51  121:astore_2        
			if(!((List) (arraylist)).isEmpty())
		//*  52  122:aload           4
		//*  53  124:invokeinterface #124 <Method boolean List.isEmpty()>
		//*  54  129:ifeq            135
		//*  55  132:goto            159
				aremoteinput1 = (RemoteInput[])((List) (arraylist)).toArray(((Object []) (new RemoteInput[((List) (arraylist)).size()])));
		//   56  135:aload           4
		//   57  137:aload           4
		//   58  139:invokeinterface #128 <Method int List.size()>
		//   59  144:anewarray       RemoteInput[]
		//   60  147:invokeinterface #132 <Method Object[] List.toArray(Object[])>
		//   61  152:checkcast       #134 <Class RemoteInput[]>
		//   62  155:astore_3        
		//*  63  156:goto            132
			return new NotificationCompat.Action(mIcon, mTitle, mIntent, mExtras, aremoteinput1, aremoteinput, mAllowGeneratedReplies);
		//   64  159:new             #6   <Class NotificationCompat$Action>
		//   65  162:dup             
		//   66  163:aload_0         
		//   67  164:getfield        #39  <Field int mIcon>
		//   68  167:aload_0         
		//   69  168:getfield        #47  <Field CharSequence mTitle>
		//   70  171:aload_0         
		//   71  172:getfield        #49  <Field PendingIntent mIntent>
		//   72  175:aload_0         
		//   73  176:getfield        #51  <Field Bundle mExtras>
		//   74  179:aload_3         
		//   75  180:aload_2         
		//   76  181:aload_0         
		//   77  182:getfield        #37  <Field boolean mAllowGeneratedReplies>
		//   78  185:invokespecial   #137 <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean)>
		//   79  188:areturn         
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
		//*  19   35:ifnonnull       43
				charsequence = null;
		//   20   38:aconst_null     
		//   21   39:astore_2        
			else
		//*  22   40:goto            56
				charsequence = ((CharSequence) (new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (aremoteinput))))))));
		//   23   43:new             #53  <Class ArrayList>
		//   24   46:dup             
		//   25   47:aload           5
		//   26   49:invokestatic    #59  <Method List Arrays.asList(Object[])>
		//   27   52:invokespecial   #62  <Method void ArrayList(java.util.Collection)>
		//   28   55:astore_2        
			mRemoteInputs = ((ArrayList) (charsequence));
		//   29   56:aload_0         
		//   30   57:aload_2         
		//   31   58:putfield        #64  <Field ArrayList mRemoteInputs>
			mAllowGeneratedReplies = flag;
		//   32   61:aload_0         
		//   33   62:iload           6
		//   34   64:putfield        #37  <Field boolean mAllowGeneratedReplies>
		//   35   67:return          
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
	//    1    1:getfield        #53  <Field PendingIntent actionIntent>
	//    2    4:areturn         
	}

	public boolean getAllowGeneratedReplies()
	{
		return mAllowGeneratedReplies;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean mAllowGeneratedReplies>
	//    2    4:ireturn         
	}

	public RemoteInput[] getDataOnlyRemoteInputs()
	{
		return mDataOnlyRemoteInputs;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field RemoteInput[] mDataOnlyRemoteInputs>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public int getIcon()
	{
		return icon;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int icon>
	//    2    4:ireturn         
	}

	public RemoteInput[] getRemoteInputs()
	{
		return mRemoteInputs;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field RemoteInput[] mRemoteInputs>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field CharSequence title>
	//    2    4:areturn         
	}

	public PendingIntent actionIntent;
	public int icon;
	private boolean mAllowGeneratedReplies;
	private final RemoteInput mDataOnlyRemoteInputs[];
	final Bundle mExtras;
	private final RemoteInput mRemoteInputs[];
	public CharSequence title;

	public NotificationCompat$Action(int i, CharSequence charsequence, PendingIntent pendingintent)
	{
		this(i, charsequence, pendingintent, new Bundle(), ((RemoteInput []) (null)), ((RemoteInput []) (null)), true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #33  <Class Bundle>
	//    5    7:dup             
	//    6    8:invokespecial   #36  <Method void Bundle()>
	//    7   11:aconst_null     
	//    8   12:aconst_null     
	//    9   13:iconst_1        
	//   10   14:invokespecial   #39  <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean)>
	//   11   17:return          
	}

	NotificationCompat$Action(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], RemoteInput aremoteinput1[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		icon = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #43  <Field int icon>
		title = .limitCharSequenceLength(charsequence);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #49  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//    8   14:putfield        #51  <Field CharSequence title>
		actionIntent = pendingintent;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #53  <Field PendingIntent actionIntent>
		if(bundle == null)
	//*  12   22:aload           4
	//*  13   24:ifnull          30
	//*  14   27:goto            39
			bundle = new Bundle();
	//   15   30:new             #33  <Class Bundle>
	//   16   33:dup             
	//   17   34:invokespecial   #36  <Method void Bundle()>
	//   18   37:astore          4
		mExtras = bundle;
	//   19   39:aload_0         
	//   20   40:aload           4
	//   21   42:putfield        #55  <Field Bundle mExtras>
		mRemoteInputs = aremoteinput;
	//   22   45:aload_0         
	//   23   46:aload           5
	//   24   48:putfield        #57  <Field RemoteInput[] mRemoteInputs>
		mDataOnlyRemoteInputs = aremoteinput1;
	//   25   51:aload_0         
	//   26   52:aload           6
	//   27   54:putfield        #59  <Field RemoteInput[] mDataOnlyRemoteInputs>
		mAllowGeneratedReplies = flag;
	//   28   57:aload_0         
	//   29   58:iload           7
	//   30   60:putfield        #61  <Field boolean mAllowGeneratedReplies>
	//   31   63:return          
	}
}
