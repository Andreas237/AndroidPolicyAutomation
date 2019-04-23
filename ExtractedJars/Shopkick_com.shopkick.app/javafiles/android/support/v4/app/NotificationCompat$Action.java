// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;
import java.lang.annotation.Annotation;
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
		//    3    5:getfield        #55  <Field Bundle mExtras>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #102 <Method void Bundle.putAll(Bundle)>
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public Builder addRemoteInput(RemoteInput remoteinput)
		{
			if(mRemoteInputs == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #68  <Field ArrayList mRemoteInputs>
		//*   2    4:ifnonnull       18
				mRemoteInputs = new ArrayList();
		//    3    7:aload_0         
		//    4    8:new             #57  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #105 <Method void ArrayList()>
		//    7   15:putfield        #68  <Field ArrayList mRemoteInputs>
			mRemoteInputs.add(((Object) (remoteinput)));
		//    8   18:aload_0         
		//    9   19:getfield        #68  <Field ArrayList mRemoteInputs>
		//   10   22:aload_1         
		//   11   23:invokevirtual   #109 <Method boolean ArrayList.add(Object)>
		//   12   26:pop             
			return this;
		//   13   27:aload_0         
		//   14   28:areturn         
		}

		public NotificationCompat.Action build()
		{
			RemoteInput aremoteinput[] = ((RemoteInput []) (new ArrayList()));
		//    0    0:new             #57  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #105 <Method void ArrayList()>
		//    3    7:astore_1        
			RemoteInput aremoteinput1[] = ((RemoteInput []) (new ArrayList()));
		//    4    8:new             #57  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #105 <Method void ArrayList()>
		//    7   15:astore_2        
			Object obj = ((Object) (mRemoteInputs));
		//    8   16:aload_0         
		//    9   17:getfield        #68  <Field ArrayList mRemoteInputs>
		//   10   20:astore_3        
			if(obj != null)
		//*  11   21:aload_3         
		//*  12   22:ifnull          82
				for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
		//*  13   25:aload_3         
		//*  14   26:invokevirtual   #115 <Method Iterator ArrayList.iterator()>
		//*  15   29:astore_3        
		//*  16   30:aload_3         
		//*  17   31:invokeinterface #120 <Method boolean Iterator.hasNext()>
		//*  18   36:ifeq            82
				{
					RemoteInput remoteinput = (RemoteInput)((Iterator) (obj)).next();
		//   19   39:aload_3         
		//   20   40:invokeinterface #124 <Method Object Iterator.next()>
		//   21   45:checkcast       #126 <Class RemoteInput>
		//   22   48:astore          4
					if(remoteinput.isDataOnly())
		//*  23   50:aload           4
		//*  24   52:invokevirtual   #129 <Method boolean RemoteInput.isDataOnly()>
		//*  25   55:ifeq            70
						((List) (aremoteinput)).add(((Object) (remoteinput)));
		//   26   58:aload_1         
		//   27   59:aload           4
		//   28   61:invokeinterface #132 <Method boolean List.add(Object)>
		//   29   66:pop             
					else
		//*  30   67:goto            30
						((List) (aremoteinput1)).add(((Object) (remoteinput)));
		//   31   70:aload_2         
		//   32   71:aload           4
		//   33   73:invokeinterface #132 <Method boolean List.add(Object)>
		//   34   78:pop             
				}

		//*  35   79:goto            30
			if(((List) (aremoteinput)).isEmpty())
		//*  36   82:aload_1         
		//*  37   83:invokeinterface #135 <Method boolean List.isEmpty()>
		//*  38   88:ifeq            96
				aremoteinput = null;
		//   39   91:aconst_null     
		//   40   92:astore_1        
			else
		//*  41   93:goto            115
				aremoteinput = (RemoteInput[])((List) (aremoteinput)).toArray(((Object []) (new RemoteInput[((List) (aremoteinput)).size()])));
		//   42   96:aload_1         
		//   43   97:aload_1         
		//   44   98:invokeinterface #138 <Method int List.size()>
		//   45  103:anewarray       RemoteInput[]
		//   46  106:invokeinterface #142 <Method Object[] List.toArray(Object[])>
		//   47  111:checkcast       #144 <Class RemoteInput[]>
		//   48  114:astore_1        
			if(((List) (aremoteinput1)).isEmpty())
		//*  49  115:aload_2         
		//*  50  116:invokeinterface #135 <Method boolean List.isEmpty()>
		//*  51  121:ifeq            129
				aremoteinput1 = null;
		//   52  124:aconst_null     
		//   53  125:astore_2        
			else
		//*  54  126:goto            148
				aremoteinput1 = (RemoteInput[])((List) (aremoteinput1)).toArray(((Object []) (new RemoteInput[((List) (aremoteinput1)).size()])));
		//   55  129:aload_2         
		//   56  130:aload_2         
		//   57  131:invokeinterface #138 <Method int List.size()>
		//   58  136:anewarray       RemoteInput[]
		//   59  139:invokeinterface #142 <Method Object[] List.toArray(Object[])>
		//   60  144:checkcast       #144 <Class RemoteInput[]>
		//   61  147:astore_2        
			return new NotificationCompat.Action(mIcon, mTitle, mIntent, mExtras, aremoteinput1, aremoteinput, mAllowGeneratedReplies, mSemanticAction, mShowsUserInterface);
		//   62  148:new             #6   <Class NotificationCompat$Action>
		//   63  151:dup             
		//   64  152:aload_0         
		//   65  153:getfield        #43  <Field int mIcon>
		//   66  156:aload_0         
		//   67  157:getfield        #51  <Field CharSequence mTitle>
		//   68  160:aload_0         
		//   69  161:getfield        #53  <Field PendingIntent mIntent>
		//   70  164:aload_0         
		//   71  165:getfield        #55  <Field Bundle mExtras>
		//   72  168:aload_2         
		//   73  169:aload_1         
		//   74  170:aload_0         
		//   75  171:getfield        #39  <Field boolean mAllowGeneratedReplies>
		//   76  174:aload_0         
		//   77  175:getfield        #70  <Field int mSemanticAction>
		//   78  178:aload_0         
		//   79  179:getfield        #41  <Field boolean mShowsUserInterface>
		//   80  182:invokespecial   #147 <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean, int, boolean)>
		//   81  185:areturn         
		}

		public Builder extend(Extender extender)
		{
			extender.extend(this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokeinterface #154 <Method NotificationCompat$Action$Builder NotificationCompat$Action$Extender.extend(NotificationCompat$Action$Builder)>
		//    3    7:pop             
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Bundle getExtras()
		{
			return mExtras;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field Bundle mExtras>
		//    2    4:areturn         
		}

		public Builder setAllowGeneratedReplies(boolean flag)
		{
			mAllowGeneratedReplies = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #39  <Field boolean mAllowGeneratedReplies>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setSemanticAction(int i)
		{
			mSemanticAction = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #70  <Field int mSemanticAction>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setShowsUserInterface(boolean flag)
		{
			mShowsUserInterface = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #41  <Field boolean mShowsUserInterface>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private boolean mAllowGeneratedReplies;
		private final Bundle mExtras;
		private final int mIcon;
		private final PendingIntent mIntent;
		private ArrayList mRemoteInputs;
		private int mSemanticAction;
		private boolean mShowsUserInterface;
		private final CharSequence mTitle;

		public Builder(int i, CharSequence charsequence, PendingIntent pendingintent)
		{
			this(i, charsequence, pendingintent, new Bundle(), ((RemoteInput []) (null)), true, 0, true);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:new             #29  <Class Bundle>
		//    5    7:dup             
		//    6    8:invokespecial   #32  <Method void Bundle()>
		//    7   11:aconst_null     
		//    8   12:iconst_1        
		//    9   13:iconst_0        
		//   10   14:iconst_1        
		//   11   15:invokespecial   #35  <Method void NotificationCompat$Action$Builder(int, CharSequence, PendingIntent, Bundle, RemoteInput[], boolean, int, boolean)>
		//   12   18:return          
		}

		private Builder(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], boolean flag, int j, 
				boolean flag1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #37  <Method void Object()>
			mAllowGeneratedReplies = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #39  <Field boolean mAllowGeneratedReplies>
			mShowsUserInterface = true;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #41  <Field boolean mShowsUserInterface>
			mIcon = i;
		//    8   14:aload_0         
		//    9   15:iload_1         
		//   10   16:putfield        #43  <Field int mIcon>
			mTitle = NotificationCompat.Builder.limitCharSequenceLength(charsequence);
		//   11   19:aload_0         
		//   12   20:aload_2         
		//   13   21:invokestatic    #49  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//   14   24:putfield        #51  <Field CharSequence mTitle>
			mIntent = pendingintent;
		//   15   27:aload_0         
		//   16   28:aload_3         
		//   17   29:putfield        #53  <Field PendingIntent mIntent>
			mExtras = bundle;
		//   18   32:aload_0         
		//   19   33:aload           4
		//   20   35:putfield        #55  <Field Bundle mExtras>
			if(aremoteinput == null)
		//*  21   38:aload           5
		//*  22   40:ifnonnull       48
				charsequence = null;
		//   23   43:aconst_null     
		//   24   44:astore_2        
			else
		//*  25   45:goto            61
				charsequence = ((CharSequence) (new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (aremoteinput))))))));
		//   26   48:new             #57  <Class ArrayList>
		//   27   51:dup             
		//   28   52:aload           5
		//   29   54:invokestatic    #63  <Method List Arrays.asList(Object[])>
		//   30   57:invokespecial   #66  <Method void ArrayList(java.util.Collection)>
		//   31   60:astore_2        
			mRemoteInputs = ((ArrayList) (charsequence));
		//   32   61:aload_0         
		//   33   62:aload_2         
		//   34   63:putfield        #68  <Field ArrayList mRemoteInputs>
			mAllowGeneratedReplies = flag;
		//   35   66:aload_0         
		//   36   67:iload           6
		//   37   69:putfield        #39  <Field boolean mAllowGeneratedReplies>
			mSemanticAction = j;
		//   38   72:aload_0         
		//   39   73:iload           7
		//   40   75:putfield        #70  <Field int mSemanticAction>
			mShowsUserInterface = flag1;
		//   41   78:aload_0         
		//   42   79:iload           8
		//   43   81:putfield        #41  <Field boolean mShowsUserInterface>
		//   44   84:return          
		}

		public Builder(NotificationCompat.Action action)
		{
			this(action.icon, action.title, action.actionIntent, new Bundle(action.mExtras), action.getRemoteInputs(), action.getAllowGeneratedReplies(), action.getSemanticAction(), action.mShowsUserInterface);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #74  <Field int NotificationCompat$Action.icon>
		//    3    5:aload_1         
		//    4    6:getfield        #77  <Field CharSequence NotificationCompat$Action.title>
		//    5    9:aload_1         
		//    6   10:getfield        #80  <Field PendingIntent NotificationCompat$Action.actionIntent>
		//    7   13:new             #29  <Class Bundle>
		//    8   16:dup             
		//    9   17:aload_1         
		//   10   18:getfield        #81  <Field Bundle NotificationCompat$Action.mExtras>
		//   11   21:invokespecial   #84  <Method void Bundle(Bundle)>
		//   12   24:aload_1         
		//   13   25:invokevirtual   #88  <Method RemoteInput[] NotificationCompat$Action.getRemoteInputs()>
		//   14   28:aload_1         
		//   15   29:invokevirtual   #92  <Method boolean NotificationCompat$Action.getAllowGeneratedReplies()>
		//   16   32:aload_1         
		//   17   33:invokevirtual   #96  <Method int NotificationCompat$Action.getSemanticAction()>
		//   18   36:aload_1         
		//   19   37:getfield        #97  <Field boolean NotificationCompat$Action.mShowsUserInterface>
		//   20   40:invokespecial   #35  <Method void NotificationCompat$Action$Builder(int, CharSequence, PendingIntent, Bundle, RemoteInput[], boolean, int, boolean)>
		//   21   43:return          
		}
	}

	public static interface Extender
	{

		public abstract Builder extend(Builder builder);
	}

	public static interface SemanticAction
		extends Annotation
	{
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

		public WearableExtender setAvailableOffline(boolean flag)
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
		//    3    3:invokespecial   #116 <Method void setFlag(int, boolean)>
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
		//    3    3:invokespecial   #116 <Method void setFlag(int, boolean)>
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
	//    1    1:getfield        #89  <Field PendingIntent actionIntent>
	//    2    4:areturn         
	}

	public boolean getAllowGeneratedReplies()
	{
		return mAllowGeneratedReplies;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field boolean mAllowGeneratedReplies>
	//    2    4:ireturn         
	}

	public RemoteInput[] getDataOnlyRemoteInputs()
	{
		return mDataOnlyRemoteInputs;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field RemoteInput[] mDataOnlyRemoteInputs>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	public int getIcon()
	{
		return icon;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int icon>
	//    2    4:ireturn         
	}

	public RemoteInput[] getRemoteInputs()
	{
		return mRemoteInputs;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field RemoteInput[] mRemoteInputs>
	//    2    4:areturn         
	}

	public int getSemanticAction()
	{
		return mSemanticAction;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field int mSemanticAction>
	//    2    4:ireturn         
	}

	public boolean getShowsUserInterface()
	{
		return mShowsUserInterface;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field boolean mShowsUserInterface>
	//    2    4:ireturn         
	}

	public CharSequence getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field CharSequence title>
	//    2    4:areturn         
	}

	static final String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
	static final String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
	public static final int SEMANTIC_ACTION_ARCHIVE = 5;
	public static final int SEMANTIC_ACTION_CALL = 10;
	public static final int SEMANTIC_ACTION_DELETE = 4;
	public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
	public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
	public static final int SEMANTIC_ACTION_MUTE = 6;
	public static final int SEMANTIC_ACTION_NONE = 0;
	public static final int SEMANTIC_ACTION_REPLY = 1;
	public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
	public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
	public static final int SEMANTIC_ACTION_UNMUTE = 7;
	public PendingIntent actionIntent;
	public int icon;
	private boolean mAllowGeneratedReplies;
	private final RemoteInput mDataOnlyRemoteInputs[];
	final Bundle mExtras;
	private final RemoteInput mRemoteInputs[];
	private final int mSemanticAction;
	boolean mShowsUserInterface;
	public CharSequence title;

	public NotificationCompat$Action(int i, CharSequence charsequence, PendingIntent pendingintent)
	{
		this(i, charsequence, pendingintent, new Bundle(), ((RemoteInput []) (null)), ((RemoteInput []) (null)), true, 0, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #67  <Class Bundle>
	//    5    7:dup             
	//    6    8:invokespecial   #70  <Method void Bundle()>
	//    7   11:aconst_null     
	//    8   12:aconst_null     
	//    9   13:iconst_1        
	//   10   14:iconst_0        
	//   11   15:iconst_1        
	//   12   16:invokespecial   #73  <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean, int, boolean)>
	//   13   19:return          
	}

	NotificationCompat$Action(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], RemoteInput aremoteinput1[], boolean flag, 
			int j, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void Object()>
		mShowsUserInterface = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #77  <Field boolean mShowsUserInterface>
		icon = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #79  <Field int icon>
		title = .limitCharSequenceLength(charsequence);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokestatic    #85  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//   11   19:putfield        #87  <Field CharSequence title>
		actionIntent = pendingintent;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:putfield        #89  <Field PendingIntent actionIntent>
		if(bundle == null)
	//*  15   27:aload           4
	//*  16   29:ifnull          35
	//*  17   32:goto            44
			bundle = new Bundle();
	//   18   35:new             #67  <Class Bundle>
	//   19   38:dup             
	//   20   39:invokespecial   #70  <Method void Bundle()>
	//   21   42:astore          4
		mExtras = bundle;
	//   22   44:aload_0         
	//   23   45:aload           4
	//   24   47:putfield        #91  <Field Bundle mExtras>
		mRemoteInputs = aremoteinput;
	//   25   50:aload_0         
	//   26   51:aload           5
	//   27   53:putfield        #93  <Field RemoteInput[] mRemoteInputs>
		mDataOnlyRemoteInputs = aremoteinput1;
	//   28   56:aload_0         
	//   29   57:aload           6
	//   30   59:putfield        #95  <Field RemoteInput[] mDataOnlyRemoteInputs>
		mAllowGeneratedReplies = flag;
	//   31   62:aload_0         
	//   32   63:iload           7
	//   33   65:putfield        #97  <Field boolean mAllowGeneratedReplies>
		mSemanticAction = j;
	//   34   68:aload_0         
	//   35   69:iload           8
	//   36   71:putfield        #99  <Field int mSemanticAction>
		mShowsUserInterface = flag1;
	//   37   74:aload_0         
	//   38   75:iload           9
	//   39   77:putfield        #77  <Field boolean mShowsUserInterface>
	//   40   80:return          
	}
}
