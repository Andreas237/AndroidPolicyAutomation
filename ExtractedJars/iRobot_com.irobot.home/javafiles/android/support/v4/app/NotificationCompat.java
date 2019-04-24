// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.*;
import android.support.v4.e.a;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import java.lang.annotation.Annotation;
import java.text.NumberFormat;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			NotificationBuilderWithActions, NotificationCompatJellybean, RemoteInput, NotificationBuilderWithBuilderAccessor, 
//			NotificationCompatApi24, NotificationCompatKitKat, NotificationCompatApi20, NotificationCompatApi21

public class NotificationCompat
{
	public static class Action extends NotificationCompatBase.Action
	{

		public PendingIntent getActionIntent()
		{
			return actionIntent;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field PendingIntent actionIntent>
		//    2    4:areturn         
		}

		public boolean getAllowGeneratedReplies()
		{
			return mAllowGeneratedReplies;
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field boolean mAllowGeneratedReplies>
		//    2    4:ireturn         
		}

		public RemoteInput[] getDataOnlyRemoteInputs()
		{
			return mDataOnlyRemoteInputs;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field RemoteInput[] mDataOnlyRemoteInputs>
		//    2    4:areturn         
		}

		public volatile RemoteInputCompatBase.RemoteInput[] getDataOnlyRemoteInputs()
		{
			return ((RemoteInputCompatBase.RemoteInput []) (getDataOnlyRemoteInputs()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #78  <Method RemoteInput[] getDataOnlyRemoteInputs()>
		//    2    4:areturn         
		}

		public Bundle getExtras()
		{
			return mExtras;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field Bundle mExtras>
		//    2    4:areturn         
		}

		public int getIcon()
		{
			return icon;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field int icon>
		//    2    4:ireturn         
		}

		public RemoteInput[] getRemoteInputs()
		{
			return mRemoteInputs;
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field RemoteInput[] mRemoteInputs>
		//    2    4:areturn         
		}

		public volatile RemoteInputCompatBase.RemoteInput[] getRemoteInputs()
		{
			return ((RemoteInputCompatBase.RemoteInput []) (getRemoteInputs()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #85  <Method RemoteInput[] getRemoteInputs()>
		//    2    4:areturn         
		}

		public CharSequence getTitle()
		{
			return title;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field CharSequence title>
		//    2    4:areturn         
		}

		public static final NotificationCompatBase.Action.Factory FACTORY = new NotificationCompatBase.Action.Factory() {

			public NotificationCompatBase.Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[], RemoteInputCompatBase.RemoteInput aremoteinput1[], boolean flag)
			{
				return ((NotificationCompatBase.Action) (new Action(i, charsequence, pendingintent, bundle, (RemoteInput[])aremoteinput, (RemoteInput[])aremoteinput1, flag)));
			//    0    0:new             #8   <Class NotificationCompat$Action>
			//    1    3:dup             
			//    2    4:iload_1         
			//    3    5:aload_2         
			//    4    6:aload_3         
			//    5    7:aload           4
			//    6    9:aload           5
			//    7   11:checkcast       #20  <Class RemoteInput[]>
			//    8   14:aload           6
			//    9   16:checkcast       #20  <Class RemoteInput[]>
			//   10   19:iload           7
			//   11   21:invokespecial   #23  <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean)>
			//   12   24:areturn         
			}

			public Action[] newArray(int i)
			{
				return new Action[i];
			//    0    0:iload_1         
			//    1    1:anewarray       Action[]
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
		//    2    4:invokespecial   #38  <Method void NotificationCompat$Action$1()>
		//    3    7:putstatic       #40  <Field NotificationCompatBase$Action$Factory FACTORY>
		//*   4   10:return          
		}

		public Action(int i, CharSequence charsequence, PendingIntent pendingintent)
		{
			this(i, charsequence, pendingintent, new Bundle(), ((RemoteInput []) (null)), ((RemoteInput []) (null)), true);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:new             #44  <Class Bundle>
		//    5    7:dup             
		//    6    8:invokespecial   #45  <Method void Bundle()>
		//    7   11:aconst_null     
		//    8   12:aconst_null     
		//    9   13:iconst_1        
		//   10   14:invokespecial   #48  <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean)>
		//   11   17:return          
		}

		Action(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], RemoteInput aremoteinput1[], boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #49  <Method void NotificationCompatBase$Action()>
			icon = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #51  <Field int icon>
			title = Builder.limitCharSequenceLength(charsequence);
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:invokestatic    #57  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    8   14:putfield        #59  <Field CharSequence title>
			actionIntent = pendingintent;
		//    9   17:aload_0         
		//   10   18:aload_3         
		//   11   19:putfield        #61  <Field PendingIntent actionIntent>
			if(bundle == null)
		//*  12   22:aload           4
		//*  13   24:ifnull          30
		//*  14   27:goto            39
				bundle = new Bundle();
		//   15   30:new             #44  <Class Bundle>
		//   16   33:dup             
		//   17   34:invokespecial   #45  <Method void Bundle()>
		//   18   37:astore          4
			mExtras = bundle;
		//   19   39:aload_0         
		//   20   40:aload           4
		//   21   42:putfield        #63  <Field Bundle mExtras>
			mRemoteInputs = aremoteinput;
		//   22   45:aload_0         
		//   23   46:aload           5
		//   24   48:putfield        #65  <Field RemoteInput[] mRemoteInputs>
			mDataOnlyRemoteInputs = aremoteinput1;
		//   25   51:aload_0         
		//   26   52:aload           6
		//   27   54:putfield        #67  <Field RemoteInput[] mDataOnlyRemoteInputs>
			mAllowGeneratedReplies = flag;
		//   28   57:aload_0         
		//   29   58:iload           7
		//   30   60:putfield        #69  <Field boolean mAllowGeneratedReplies>
		//   31   63:return          
		}
	}

	public static final class Action.Builder
	{

		public Action.Builder addExtras(Bundle bundle)
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

		public Action.Builder addRemoteInput(RemoteInput remoteinput)
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

		public Action build()
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
			return new Action(mIcon, mTitle, mIntent, mExtras, aremoteinput1, aremoteinput, mAllowGeneratedReplies);
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

		public Action.Builder extend(Action.Extender extender)
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

		public Action.Builder setAllowGeneratedReplies(boolean flag)
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

		public Action.Builder(int i, CharSequence charsequence, PendingIntent pendingintent)
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

		private Action.Builder(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], boolean flag)
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
			mTitle = Builder.limitCharSequenceLength(charsequence);
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

		public Action.Builder(Action action)
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

	public static interface Action.Extender
	{

		public abstract Action.Builder extend(Action.Builder builder);
	}

	public static final class Action.WearableExtender
		implements Action.Extender
	{

		private void setFlag(int i, boolean flag)
		{
			if(flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            17
				i |= mFlags;
		//    2    4:iload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #47  <Field int mFlags>
		//    5    9:ior             
		//    6   10:istore_1        
			else
		//*   7   11:aload_0         
		//*   8   12:iload_1         
		//*   9   13:putfield        #47  <Field int mFlags>
		//*  10   16:return          
				i &= mFlags;
		//   11   17:iload_1         
		//   12   18:aload_0         
		//   13   19:getfield        #47  <Field int mFlags>
		//   14   22:iand            
		//   15   23:istore_1        
			mFlags = i;
		//*  16   24:goto            11
		}

		public Action.WearableExtender clone()
		{
			Action.WearableExtender wearableextender = new Action.WearableExtender();
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
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #81  <Method NotificationCompat$Action$WearableExtender clone()>
		//    2    4:areturn         
		}

		public Action.Builder extend(Action.Builder builder)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #55  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #84  <Method void Bundle()>
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
		//   12   23:invokevirtual   #88  <Method void Bundle.putInt(String, int)>
			if(mInProgressLabel != null)
		//*  13   26:aload_0         
		//*  14   27:getfield        #69  <Field CharSequence mInProgressLabel>
		//*  15   30:ifnull          43
				bundle.putCharSequence("inProgressLabel", mInProgressLabel);
		//   16   33:aload_2         
		//   17   34:ldc1            #36  <String "inProgressLabel">
		//   18   36:aload_0         
		//   19   37:getfield        #69  <Field CharSequence mInProgressLabel>
		//   20   40:invokevirtual   #92  <Method void Bundle.putCharSequence(String, CharSequence)>
			if(mConfirmLabel != null)
		//*  21   43:aload_0         
		//*  22   44:getfield        #71  <Field CharSequence mConfirmLabel>
		//*  23   47:ifnull          60
				bundle.putCharSequence("confirmLabel", mConfirmLabel);
		//   24   50:aload_2         
		//   25   51:ldc1            #30  <String "confirmLabel">
		//   26   53:aload_0         
		//   27   54:getfield        #71  <Field CharSequence mConfirmLabel>
		//   28   57:invokevirtual   #92  <Method void Bundle.putCharSequence(String, CharSequence)>
			if(mCancelLabel != null)
		//*  29   60:aload_0         
		//*  30   61:getfield        #73  <Field CharSequence mCancelLabel>
		//*  31   64:ifnull          77
				bundle.putCharSequence("cancelLabel", mCancelLabel);
		//   32   67:aload_2         
		//   33   68:ldc1            #27  <String "cancelLabel">
		//   34   70:aload_0         
		//   35   71:getfield        #73  <Field CharSequence mCancelLabel>
		//   36   74:invokevirtual   #92  <Method void Bundle.putCharSequence(String, CharSequence)>
			builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
		//   37   77:aload_1         
		//   38   78:invokevirtual   #95  <Method Bundle NotificationCompat$Action$Builder.getExtras()>
		//   39   81:ldc1            #19  <String "android.wearable.EXTENSIONS">
		//   40   83:aload_2         
		//   41   84:invokevirtual   #99  <Method void Bundle.putBundle(String, Bundle)>
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

		public Action.WearableExtender setAvailableOffline(boolean flag)
		{
			setFlag(1, flag);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iload_1         
		//    3    3:invokespecial   #111 <Method void setFlag(int, boolean)>
			return this;
		//    4    6:aload_0         
		//    5    7:areturn         
		}

		public Action.WearableExtender setCancelLabel(CharSequence charsequence)
		{
			mCancelLabel = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #73  <Field CharSequence mCancelLabel>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Action.WearableExtender setConfirmLabel(CharSequence charsequence)
		{
			mConfirmLabel = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #71  <Field CharSequence mConfirmLabel>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Action.WearableExtender setHintDisplayActionInline(boolean flag)
		{
			setFlag(4, flag);
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:iload_1         
		//    3    3:invokespecial   #111 <Method void setFlag(int, boolean)>
			return this;
		//    4    6:aload_0         
		//    5    7:areturn         
		}

		public Action.WearableExtender setHintLaunchesActivity(boolean flag)
		{
			setFlag(2, flag);
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:iload_1         
		//    3    3:invokespecial   #111 <Method void setFlag(int, boolean)>
			return this;
		//    4    6:aload_0         
		//    5    7:areturn         
		}

		public Action.WearableExtender setInProgressLabel(CharSequence charsequence)
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

		public Action.WearableExtender()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #45  <Method void Object()>
			mFlags = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #47  <Field int mFlags>
		//    5    9:return          
		}

		public Action.WearableExtender(Action action)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #45  <Method void Object()>
			mFlags = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #47  <Field int mFlags>
			action = ((Action) (action.getExtras().getBundle("android.wearable.EXTENSIONS")));
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

	public static interface BadgeIconType
		extends Annotation
	{
	}

	public static class BigPictureStyle extends Style
	{

		public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			if(android.os.Build.VERSION.SDK_INT >= 16)
		//*   0    0:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          16
		//*   2    5:icmplt          36
				NotificationCompatJellybean.addBigPictureStyle(notificationbuilderwithbuilderaccessor, mBigContentTitle, mSummaryTextSet, mSummaryText, mPicture, mBigLargeIcon, mBigLargeIconSet);
		//    3    8:aload_1         
		//    4    9:aload_0         
		//    5   10:getfield        #33  <Field CharSequence mBigContentTitle>
		//    6   13:aload_0         
		//    7   14:getfield        #36  <Field boolean mSummaryTextSet>
		//    8   17:aload_0         
		//    9   18:getfield        #39  <Field CharSequence mSummaryText>
		//   10   21:aload_0         
		//   11   22:getfield        #41  <Field Bitmap mPicture>
		//   12   25:aload_0         
		//   13   26:getfield        #43  <Field Bitmap mBigLargeIcon>
		//   14   29:aload_0         
		//   15   30:getfield        #45  <Field boolean mBigLargeIconSet>
		//   16   33:invokestatic    #51  <Method void NotificationCompatJellybean.addBigPictureStyle(NotificationBuilderWithBuilderAccessor, CharSequence, boolean, CharSequence, Bitmap, Bitmap, boolean)>
		//   17   36:return          
		}

		public BigPictureStyle bigLargeIcon(Bitmap bitmap)
		{
			mBigLargeIcon = bitmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #43  <Field Bitmap mBigLargeIcon>
			mBigLargeIconSet = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #45  <Field boolean mBigLargeIconSet>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		public BigPictureStyle bigPicture(Bitmap bitmap)
		{
			mPicture = bitmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field Bitmap mPicture>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public BigPictureStyle setBigContentTitle(CharSequence charsequence)
		{
			mBigContentTitle = Builder.limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #62  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #33  <Field CharSequence mBigContentTitle>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public BigPictureStyle setSummaryText(CharSequence charsequence)
		{
			mSummaryText = Builder.limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #62  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #39  <Field CharSequence mSummaryText>
			mSummaryTextSet = true;
		//    4    8:aload_0         
		//    5    9:iconst_1        
		//    6   10:putfield        #36  <Field boolean mSummaryTextSet>
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		private Bitmap mBigLargeIcon;
		private boolean mBigLargeIconSet;
		private Bitmap mPicture;

		public BigPictureStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void NotificationCompat$Style()>
		//    2    4:return          
		}

		public BigPictureStyle(Builder builder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void NotificationCompat$Style()>
			setBuilder(builder);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #21  <Method void setBuilder(NotificationCompat$Builder)>
		//    5    9:return          
		}
	}

	public static class BigTextStyle extends Style
	{

		public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			if(android.os.Build.VERSION.SDK_INT >= 16)
		//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          16
		//*   2    5:icmplt          28
				NotificationCompatJellybean.addBigTextStyle(notificationbuilderwithbuilderaccessor, mBigContentTitle, mSummaryTextSet, mSummaryText, mBigText);
		//    3    8:aload_1         
		//    4    9:aload_0         
		//    5   10:getfield        #29  <Field CharSequence mBigContentTitle>
		//    6   13:aload_0         
		//    7   14:getfield        #33  <Field boolean mSummaryTextSet>
		//    8   17:aload_0         
		//    9   18:getfield        #36  <Field CharSequence mSummaryText>
		//   10   21:aload_0         
		//   11   22:getfield        #38  <Field CharSequence mBigText>
		//   12   25:invokestatic    #44  <Method void NotificationCompatJellybean.addBigTextStyle(NotificationBuilderWithBuilderAccessor, CharSequence, boolean, CharSequence, CharSequence)>
		//   13   28:return          
		}

		public BigTextStyle bigText(CharSequence charsequence)
		{
			mBigText = Builder.limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #52  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #38  <Field CharSequence mBigText>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public BigTextStyle setBigContentTitle(CharSequence charsequence)
		{
			mBigContentTitle = Builder.limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #52  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #29  <Field CharSequence mBigContentTitle>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public BigTextStyle setSummaryText(CharSequence charsequence)
		{
			mSummaryText = Builder.limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #52  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #36  <Field CharSequence mSummaryText>
			mSummaryTextSet = true;
		//    4    8:aload_0         
		//    5    9:iconst_1        
		//    6   10:putfield        #33  <Field boolean mSummaryTextSet>
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		private CharSequence mBigText;

		public BigTextStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void NotificationCompat$Style()>
		//    2    4:return          
		}

		public BigTextStyle(Builder builder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void NotificationCompat$Style()>
			setBuilder(builder);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #18  <Method void setBuilder(NotificationCompat$Builder)>
		//    5    9:return          
		}
	}

	public static class Builder
	{

		protected static CharSequence limitCharSequenceLength(CharSequence charsequence)
		{
			if(charsequence == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return charsequence;
		//    2    4:aload_0         
		//    3    5:areturn         
			CharSequence charsequence1 = charsequence;
		//    4    6:aload_0         
		//    5    7:astore_1        
			if(charsequence.length() > 5120)
		//*   6    8:aload_0         
		//*   7    9:invokeinterface #128 <Method int CharSequence.length()>
		//*   8   14:sipush          5120
		//*   9   17:icmple          31
				charsequence1 = charsequence.subSequence(0, 5120);
		//   10   20:aload_0         
		//   11   21:iconst_0        
		//   12   22:sipush          5120
		//   13   25:invokeinterface #132 <Method CharSequence CharSequence.subSequence(int, int)>
		//   14   30:astore_1        
			return charsequence1;
		//   15   31:aload_1         
		//   16   32:areturn         
		}

		private void setFlag(int i, boolean flag)
		{
			Notification notification;
			if(flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            22
			{
				notification = mNotification;
		//    2    4:aload_0         
		//    3    5:getfield        #98  <Field Notification mNotification>
		//    4    8:astore_3        
				i |= notification.flags;
		//    5    9:iload_1         
		//    6   10:aload_3         
		//    7   11:getfield        #137 <Field int Notification.flags>
		//    8   14:ior             
		//    9   15:istore_1        
			} else
		//*  10   16:aload_3         
		//*  11   17:iload_1         
		//*  12   18:putfield        #137 <Field int Notification.flags>
		//*  13   21:return          
			{
				notification = mNotification;
		//   14   22:aload_0         
		//   15   23:getfield        #98  <Field Notification mNotification>
		//   16   26:astore_3        
				i &= notification.flags;
		//   17   27:iload_1         
		//   18   28:aload_3         
		//   19   29:getfield        #137 <Field int Notification.flags>
		//   20   32:iand            
		//   21   33:istore_1        
			}
			notification.flags = i;
		//*  22   34:goto            16
		}

		public Builder addAction(int i, CharSequence charsequence, PendingIntent pendingintent)
		{
			mActions.add(((Object) (new Action(i, charsequence, pendingintent))));
		//    0    0:aload_0         
		//    1    1:getfield        #83  <Field ArrayList mActions>
		//    2    4:new             #141 <Class NotificationCompat$Action>
		//    3    7:dup             
		//    4    8:iload_1         
		//    5    9:aload_2         
		//    6   10:aload_3         
		//    7   11:invokespecial   #144 <Method void NotificationCompat$Action(int, CharSequence, PendingIntent)>
		//    8   14:invokevirtual   #148 <Method boolean ArrayList.add(Object)>
		//    9   17:pop             
			return this;
		//   10   18:aload_0         
		//   11   19:areturn         
		}

		public Builder addAction(Action action)
		{
			mActions.add(((Object) (action)));
		//    0    0:aload_0         
		//    1    1:getfield        #83  <Field ArrayList mActions>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #148 <Method boolean ArrayList.add(Object)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder addExtras(Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          33
			{
				if(mExtras == null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #153 <Field Bundle mExtras>
		//*   4    8:ifnonnull       25
				{
					mExtras = new Bundle(bundle);
		//    5   11:aload_0         
		//    6   12:new             #155 <Class Bundle>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokespecial   #158 <Method void Bundle(Bundle)>
		//   10   20:putfield        #153 <Field Bundle mExtras>
					return this;
		//   11   23:aload_0         
		//   12   24:areturn         
				}
				mExtras.putAll(bundle);
		//   13   25:aload_0         
		//   14   26:getfield        #153 <Field Bundle mExtras>
		//   15   29:aload_1         
		//   16   30:invokevirtual   #161 <Method void Bundle.putAll(Bundle)>
			}
			return this;
		//   17   33:aload_0         
		//   18   34:areturn         
		}

		public Builder addPerson(String s)
		{
			mPeople.add(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #118 <Field ArrayList mPeople>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #148 <Method boolean ArrayList.add(Object)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Notification build()
		{
			return NotificationCompat.IMPL.build(this, getExtender());
		//    0    0:getstatic       #169 <Field NotificationCompat$NotificationCompatImpl NotificationCompat.IMPL>
		//    1    3:aload_0         
		//    2    4:aload_0         
		//    3    5:invokevirtual   #173 <Method NotificationCompat$BuilderExtender getExtender()>
		//    4    8:invokeinterface #178 <Method Notification NotificationCompat$NotificationCompatImpl.build(NotificationCompat$Builder, NotificationCompat$BuilderExtender)>
		//    5   13:areturn         
		}

		public Builder extend(Extender extender)
		{
			extender.extend(this);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:invokeinterface #185 <Method NotificationCompat$Builder NotificationCompat$Extender.extend(NotificationCompat$Builder)>
		//    3    7:pop             
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public RemoteViews getBigContentView()
		{
			return mBigContentView;
		//    0    0:aload_0         
		//    1    1:getfield        #189 <Field RemoteViews mBigContentView>
		//    2    4:areturn         
		}

		public int getColor()
		{
			return mColor;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int mColor>
		//    2    4:ireturn         
		}

		public RemoteViews getContentView()
		{
			return mContentView;
		//    0    0:aload_0         
		//    1    1:getfield        #193 <Field RemoteViews mContentView>
		//    2    4:areturn         
		}

		protected BuilderExtender getExtender()
		{
			return new BuilderExtender();
		//    0    0:new             #195 <Class NotificationCompat$BuilderExtender>
		//    1    3:dup             
		//    2    4:invokespecial   #196 <Method void NotificationCompat$BuilderExtender()>
		//    3    7:areturn         
		}

		public Bundle getExtras()
		{
			if(mExtras == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #153 <Field Bundle mExtras>
		//*   2    4:ifnonnull       18
				mExtras = new Bundle();
		//    3    7:aload_0         
		//    4    8:new             #155 <Class Bundle>
		//    5   11:dup             
		//    6   12:invokespecial   #199 <Method void Bundle()>
		//    7   15:putfield        #153 <Field Bundle mExtras>
			return mExtras;
		//    8   18:aload_0         
		//    9   19:getfield        #153 <Field Bundle mExtras>
		//   10   22:areturn         
		}

		public RemoteViews getHeadsUpContentView()
		{
			return mHeadsUpContentView;
		//    0    0:aload_0         
		//    1    1:getfield        #202 <Field RemoteViews mHeadsUpContentView>
		//    2    4:areturn         
		}

		public Notification getNotification()
		{
			return build();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #205 <Method Notification build()>
		//    2    4:areturn         
		}

		public int getPriority()
		{
			return mPriority;
		//    0    0:aload_0         
		//    1    1:getfield        #116 <Field int mPriority>
		//    2    4:ireturn         
		}

		public long getWhenIfShowing()
		{
			if(mShowWhen)
		//*   0    0:aload_0         
		//*   1    1:getfield        #78  <Field boolean mShowWhen>
		//*   2    4:ifeq            15
				return mNotification.when;
		//    3    7:aload_0         
		//    4    8:getfield        #98  <Field Notification mNotification>
		//    5   11:getfield        #111 <Field long Notification.when>
		//    6   14:lreturn         
			else
				return 0L;
		//    7   15:lconst_0        
		//    8   16:lreturn         
		}

		public Builder setAutoCancel(boolean flag)
		{
			setFlag(16, flag);
		//    0    0:aload_0         
		//    1    1:bipush          16
		//    2    3:iload_1         
		//    3    4:invokespecial   #211 <Method void setFlag(int, boolean)>
			return this;
		//    4    7:aload_0         
		//    5    8:areturn         
		}

		public Builder setBadgeIconType(int i)
		{
			mBadgeIcon = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #91  <Field int mBadgeIcon>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setCategory(String s)
		{
			mCategory = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #216 <Field String mCategory>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setChannelId(String s)
		{
			mChannelId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #102 <Field String mChannelId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setColor(int i)
		{
			mColor = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #87  <Field int mColor>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setColorized(boolean flag)
		{
			mColorized = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #221 <Field boolean mColorized>
			mColorizedSet = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #223 <Field boolean mColorizedSet>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		public Builder setContent(RemoteViews remoteviews)
		{
			mNotification.contentView = remoteviews;
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field Notification mNotification>
		//    2    4:aload_1         
		//    3    5:putfield        #228 <Field RemoteViews Notification.contentView>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setContentInfo(CharSequence charsequence)
		{
			mContentInfo = limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #232 <Method CharSequence limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #234 <Field CharSequence mContentInfo>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setContentIntent(PendingIntent pendingintent)
		{
			mContentIntent = pendingintent;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #238 <Field PendingIntent mContentIntent>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setContentText(CharSequence charsequence)
		{
			mContentText = limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #232 <Method CharSequence limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #241 <Field CharSequence mContentText>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setContentTitle(CharSequence charsequence)
		{
			mContentTitle = limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #232 <Method CharSequence limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #244 <Field CharSequence mContentTitle>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setCustomBigContentView(RemoteViews remoteviews)
		{
			mBigContentView = remoteviews;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #189 <Field RemoteViews mBigContentView>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setCustomContentView(RemoteViews remoteviews)
		{
			mContentView = remoteviews;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #193 <Field RemoteViews mContentView>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setCustomHeadsUpContentView(RemoteViews remoteviews)
		{
			mHeadsUpContentView = remoteviews;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #202 <Field RemoteViews mHeadsUpContentView>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setDefaults(int i)
		{
			mNotification.defaults = i;
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field Notification mNotification>
		//    2    4:iload_1         
		//    3    5:putfield        #251 <Field int Notification.defaults>
			if((i & 4) != 0)
		//*   4    8:iload_1         
		//*   5    9:iconst_4        
		//*   6   10:iand            
		//*   7   11:ifeq            29
			{
				Notification notification = mNotification;
		//    8   14:aload_0         
		//    9   15:getfield        #98  <Field Notification mNotification>
		//   10   18:astore_2        
				notification.flags = notification.flags | 1;
		//   11   19:aload_2         
		//   12   20:aload_2         
		//   13   21:getfield        #137 <Field int Notification.flags>
		//   14   24:iconst_1        
		//   15   25:ior             
		//   16   26:putfield        #137 <Field int Notification.flags>
			}
			return this;
		//   17   29:aload_0         
		//   18   30:areturn         
		}

		public Builder setDeleteIntent(PendingIntent pendingintent)
		{
			mNotification.deleteIntent = pendingintent;
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field Notification mNotification>
		//    2    4:aload_1         
		//    3    5:putfield        #255 <Field PendingIntent Notification.deleteIntent>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setExtras(Bundle bundle)
		{
			mExtras = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #153 <Field Bundle mExtras>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setFullScreenIntent(PendingIntent pendingintent, boolean flag)
		{
			mFullScreenIntent = pendingintent;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #260 <Field PendingIntent mFullScreenIntent>
			setFlag(128, flag);
		//    3    5:aload_0         
		//    4    6:sipush          128
		//    5    9:iload_2         
		//    6   10:invokespecial   #211 <Method void setFlag(int, boolean)>
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		public Builder setGroup(String s)
		{
			mGroupKey = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #263 <Field String mGroupKey>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setGroupAlertBehavior(int i)
		{
			mGroupAlertBehavior = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #93  <Field int mGroupAlertBehavior>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setGroupSummary(boolean flag)
		{
			mGroupSummary = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #267 <Field boolean mGroupSummary>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLargeIcon(Bitmap bitmap)
		{
			mLargeIcon = bitmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #271 <Field Bitmap mLargeIcon>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLights(int i, int j, int k)
		{
			mNotification.ledARGB = i;
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field Notification mNotification>
		//    2    4:iload_1         
		//    3    5:putfield        #276 <Field int Notification.ledARGB>
			mNotification.ledOnMS = j;
		//    4    8:aload_0         
		//    5    9:getfield        #98  <Field Notification mNotification>
		//    6   12:iload_2         
		//    7   13:putfield        #279 <Field int Notification.ledOnMS>
			mNotification.ledOffMS = k;
		//    8   16:aload_0         
		//    9   17:getfield        #98  <Field Notification mNotification>
		//   10   20:iload_3         
		//   11   21:putfield        #282 <Field int Notification.ledOffMS>
			if(mNotification.ledOnMS != 0 && mNotification.ledOffMS != 0)
		//*  12   24:aload_0         
		//*  13   25:getfield        #98  <Field Notification mNotification>
		//*  14   28:getfield        #279 <Field int Notification.ledOnMS>
		//*  15   31:ifeq            49
		//*  16   34:aload_0         
		//*  17   35:getfield        #98  <Field Notification mNotification>
		//*  18   38:getfield        #282 <Field int Notification.ledOffMS>
		//*  19   41:ifeq            49
				i = 1;
		//   20   44:iconst_1        
		//   21   45:istore_1        
			else
		//*  22   46:goto            51
				i = 0;
		//   23   49:iconst_0        
		//   24   50:istore_1        
			mNotification.flags = i | mNotification.flags & -2;
		//   25   51:aload_0         
		//   26   52:getfield        #98  <Field Notification mNotification>
		//   27   55:iload_1         
		//   28   56:aload_0         
		//   29   57:getfield        #98  <Field Notification mNotification>
		//   30   60:getfield        #137 <Field int Notification.flags>
		//   31   63:bipush          -2
		//   32   65:iand            
		//   33   66:ior             
		//   34   67:putfield        #137 <Field int Notification.flags>
			return this;
		//   35   70:aload_0         
		//   36   71:areturn         
		}

		public Builder setLocalOnly(boolean flag)
		{
			mLocalOnly = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #85  <Field boolean mLocalOnly>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setNumber(int i)
		{
			mNumber = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #286 <Field int mNumber>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setOngoing(boolean flag)
		{
			setFlag(2, flag);
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:iload_1         
		//    3    3:invokespecial   #211 <Method void setFlag(int, boolean)>
			return this;
		//    4    6:aload_0         
		//    5    7:areturn         
		}

		public Builder setOnlyAlertOnce(boolean flag)
		{
			setFlag(8, flag);
		//    0    0:aload_0         
		//    1    1:bipush          8
		//    2    3:iload_1         
		//    3    4:invokespecial   #211 <Method void setFlag(int, boolean)>
			return this;
		//    4    7:aload_0         
		//    5    8:areturn         
		}

		public Builder setPriority(int i)
		{
			mPriority = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #116 <Field int mPriority>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setProgress(int i, int j, boolean flag)
		{
			mProgressMax = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #293 <Field int mProgressMax>
			mProgress = j;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #295 <Field int mProgress>
			mProgressIndeterminate = flag;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #297 <Field boolean mProgressIndeterminate>
			return this;
		//    9   15:aload_0         
		//   10   16:areturn         
		}

		public Builder setPublicVersion(Notification notification)
		{
			mPublicVersion = notification;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #301 <Field Notification mPublicVersion>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setRemoteInputHistory(CharSequence acharsequence[])
		{
			mRemoteInputHistory = acharsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #305 <Field CharSequence[] mRemoteInputHistory>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setShortcutId(String s)
		{
			mShortcutId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #308 <Field String mShortcutId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setShowWhen(boolean flag)
		{
			mShowWhen = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #78  <Field boolean mShowWhen>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setSmallIcon(int i)
		{
			mNotification.icon = i;
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field Notification mNotification>
		//    2    4:iload_1         
		//    3    5:putfield        #313 <Field int Notification.icon>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setSmallIcon(int i, int j)
		{
			mNotification.icon = i;
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field Notification mNotification>
		//    2    4:iload_1         
		//    3    5:putfield        #313 <Field int Notification.icon>
			mNotification.iconLevel = j;
		//    4    8:aload_0         
		//    5    9:getfield        #98  <Field Notification mNotification>
		//    6   12:iload_2         
		//    7   13:putfield        #317 <Field int Notification.iconLevel>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder setSortKey(String s)
		{
			mSortKey = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #320 <Field String mSortKey>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setSound(Uri uri)
		{
			mNotification.sound = uri;
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field Notification mNotification>
		//    2    4:aload_1         
		//    3    5:putfield        #326 <Field Uri Notification.sound>
			mNotification.audioStreamType = -1;
		//    4    8:aload_0         
		//    5    9:getfield        #98  <Field Notification mNotification>
		//    6   12:iconst_m1       
		//    7   13:putfield        #114 <Field int Notification.audioStreamType>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder setSound(Uri uri, int i)
		{
			mNotification.sound = uri;
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field Notification mNotification>
		//    2    4:aload_1         
		//    3    5:putfield        #326 <Field Uri Notification.sound>
			mNotification.audioStreamType = i;
		//    4    8:aload_0         
		//    5    9:getfield        #98  <Field Notification mNotification>
		//    6   12:iload_2         
		//    7   13:putfield        #114 <Field int Notification.audioStreamType>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder setStyle(Style style)
		{
			if(mStyle != style)
		//*   0    0:aload_0         
		//*   1    1:getfield        #331 <Field NotificationCompat$Style mStyle>
		//*   2    4:aload_1         
		//*   3    5:if_acmpeq       28
			{
				mStyle = style;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #331 <Field NotificationCompat$Style mStyle>
				if(mStyle != null)
		//*   7   13:aload_0         
		//*   8   14:getfield        #331 <Field NotificationCompat$Style mStyle>
		//*   9   17:ifnull          28
					mStyle.setBuilder(this);
		//   10   20:aload_0         
		//   11   21:getfield        #331 <Field NotificationCompat$Style mStyle>
		//   12   24:aload_0         
		//   13   25:invokevirtual   #337 <Method void NotificationCompat$Style.setBuilder(NotificationCompat$Builder)>
			}
			return this;
		//   14   28:aload_0         
		//   15   29:areturn         
		}

		public Builder setSubText(CharSequence charsequence)
		{
			mSubText = limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #232 <Method CharSequence limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #340 <Field CharSequence mSubText>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setTicker(CharSequence charsequence)
		{
			mNotification.tickerText = limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field Notification mNotification>
		//    2    4:aload_1         
		//    3    5:invokestatic    #232 <Method CharSequence limitCharSequenceLength(CharSequence)>
		//    4    8:putfield        #344 <Field CharSequence Notification.tickerText>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public Builder setTicker(CharSequence charsequence, RemoteViews remoteviews)
		{
			mNotification.tickerText = limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field Notification mNotification>
		//    2    4:aload_1         
		//    3    5:invokestatic    #232 <Method CharSequence limitCharSequenceLength(CharSequence)>
		//    4    8:putfield        #344 <Field CharSequence Notification.tickerText>
			mTickerView = remoteviews;
		//    5   11:aload_0         
		//    6   12:aload_2         
		//    7   13:putfield        #347 <Field RemoteViews mTickerView>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder setTimeoutAfter(long l)
		{
			mTimeout = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #351 <Field long mTimeout>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setUsesChronometer(boolean flag)
		{
			mUseChronometer = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #354 <Field boolean mUseChronometer>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setVibrate(long al[])
		{
			mNotification.vibrate = al;
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field Notification mNotification>
		//    2    4:aload_1         
		//    3    5:putfield        #360 <Field long[] Notification.vibrate>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public Builder setVisibility(int i)
		{
			mVisibility = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #89  <Field int mVisibility>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setWhen(long l)
		{
			mNotification.when = l;
		//    0    0:aload_0         
		//    1    1:getfield        #98  <Field Notification mNotification>
		//    2    4:lload_1         
		//    3    5:putfield        #111 <Field long Notification.when>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
		public ArrayList mActions;
		int mBadgeIcon;
		RemoteViews mBigContentView;
		String mCategory;
		String mChannelId;
		int mColor;
		boolean mColorized;
		boolean mColorizedSet;
		public CharSequence mContentInfo;
		PendingIntent mContentIntent;
		public CharSequence mContentText;
		public CharSequence mContentTitle;
		RemoteViews mContentView;
		public Context mContext;
		Bundle mExtras;
		PendingIntent mFullScreenIntent;
		private int mGroupAlertBehavior;
		String mGroupKey;
		boolean mGroupSummary;
		RemoteViews mHeadsUpContentView;
		public Bitmap mLargeIcon;
		boolean mLocalOnly;
		public Notification mNotification;
		public int mNumber;
		public ArrayList mPeople;
		int mPriority;
		int mProgress;
		boolean mProgressIndeterminate;
		int mProgressMax;
		Notification mPublicVersion;
		public CharSequence mRemoteInputHistory[];
		String mShortcutId;
		boolean mShowWhen;
		String mSortKey;
		public Style mStyle;
		public CharSequence mSubText;
		RemoteViews mTickerView;
		long mTimeout;
		public boolean mUseChronometer;
		int mVisibility;


/*
		static int access$000(Builder builder)
		{
			return builder.mGroupAlertBehavior;
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field int mGroupAlertBehavior>
		//    2    4:ireturn         
		}

*/

		public Builder(Context context)
		{
			this(context, ((String) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #71  <Method void NotificationCompat$Builder(Context, String)>
		//    4    6:return          
		}

		public Builder(Context context, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #76  <Method void Object()>
			mShowWhen = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #78  <Field boolean mShowWhen>
			mActions = new ArrayList();
		//    5    9:aload_0         
		//    6   10:new             #80  <Class ArrayList>
		//    7   13:dup             
		//    8   14:invokespecial   #81  <Method void ArrayList()>
		//    9   17:putfield        #83  <Field ArrayList mActions>
			mLocalOnly = false;
		//   10   20:aload_0         
		//   11   21:iconst_0        
		//   12   22:putfield        #85  <Field boolean mLocalOnly>
			mColor = 0;
		//   13   25:aload_0         
		//   14   26:iconst_0        
		//   15   27:putfield        #87  <Field int mColor>
			mVisibility = 0;
		//   16   30:aload_0         
		//   17   31:iconst_0        
		//   18   32:putfield        #89  <Field int mVisibility>
			mBadgeIcon = 0;
		//   19   35:aload_0         
		//   20   36:iconst_0        
		//   21   37:putfield        #91  <Field int mBadgeIcon>
			mGroupAlertBehavior = 0;
		//   22   40:aload_0         
		//   23   41:iconst_0        
		//   24   42:putfield        #93  <Field int mGroupAlertBehavior>
			mNotification = new Notification();
		//   25   45:aload_0         
		//   26   46:new             #95  <Class Notification>
		//   27   49:dup             
		//   28   50:invokespecial   #96  <Method void Notification()>
		//   29   53:putfield        #98  <Field Notification mNotification>
			mContext = context;
		//   30   56:aload_0         
		//   31   57:aload_1         
		//   32   58:putfield        #100 <Field Context mContext>
			mChannelId = s;
		//   33   61:aload_0         
		//   34   62:aload_2         
		//   35   63:putfield        #102 <Field String mChannelId>
			mNotification.when = System.currentTimeMillis();
		//   36   66:aload_0         
		//   37   67:getfield        #98  <Field Notification mNotification>
		//   38   70:invokestatic    #108 <Method long System.currentTimeMillis()>
		//   39   73:putfield        #111 <Field long Notification.when>
			mNotification.audioStreamType = -1;
		//   40   76:aload_0         
		//   41   77:getfield        #98  <Field Notification mNotification>
		//   42   80:iconst_m1       
		//   43   81:putfield        #114 <Field int Notification.audioStreamType>
			mPriority = 0;
		//   44   84:aload_0         
		//   45   85:iconst_0        
		//   46   86:putfield        #116 <Field int mPriority>
			mPeople = new ArrayList();
		//   47   89:aload_0         
		//   48   90:new             #80  <Class ArrayList>
		//   49   93:dup             
		//   50   94:invokespecial   #81  <Method void ArrayList()>
		//   51   97:putfield        #118 <Field ArrayList mPeople>
		//   52  100:return          
		}
	}

	protected static class BuilderExtender
	{

		public Notification build(Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			RemoteViews remoteviews;
			Notification notification;
			if(builder.mStyle != null)
		//*   0    0:aload_1         
		//*   1    1:getfield        #20  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*   2    4:ifnull          19
				remoteviews = builder.mStyle.makeContentView(notificationbuilderwithbuilderaccessor);
		//    3    7:aload_1         
		//    4    8:getfield        #20  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//    5   11:aload_2         
		//    6   12:invokevirtual   #26  <Method RemoteViews NotificationCompat$Style.makeContentView(NotificationBuilderWithBuilderAccessor)>
		//    7   15:astore_3        
			else
		//*   8   16:goto            21
				remoteviews = null;
		//    9   19:aconst_null     
		//   10   20:astore_3        
			notification = notificationbuilderwithbuilderaccessor.build();
		//   11   21:aload_2         
		//   12   22:invokeinterface #31  <Method Notification NotificationBuilderWithBuilderAccessor.build()>
		//   13   27:astore          4
			if(remoteviews == null) goto _L2; else goto _L1
		//   14   29:aload_3         
		//   15   30:ifnull          42
_L1:
			notification.contentView = remoteviews;
		//   16   33:aload           4
		//   17   35:aload_3         
		//   18   36:putfield        #37  <Field RemoteViews Notification.contentView>
			break; /* Loop/switch isn't completed */
		//   19   39:goto            57
_L2:
			if(builder.mContentView == null)
				break; /* Loop/switch isn't completed */
		//   20   42:aload_1         
		//   21   43:getfield        #40  <Field RemoteViews NotificationCompat$Builder.mContentView>
		//   22   46:ifnull          57
			remoteviews = builder.mContentView;
		//   23   49:aload_1         
		//   24   50:getfield        #40  <Field RemoteViews NotificationCompat$Builder.mContentView>
		//   25   53:astore_3        
			if(true) goto _L1; else goto _L3
		//   26   54:goto            33
_L3:
			if(android.os.Build.VERSION.SDK_INT >= 16 && builder.mStyle != null)
		//*  27   57:getstatic       #46  <Field int android.os.Build$VERSION.SDK_INT>
		//*  28   60:bipush          16
		//*  29   62:icmplt          91
		//*  30   65:aload_1         
		//*  31   66:getfield        #20  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*  32   69:ifnull          91
			{
				RemoteViews remoteviews1 = builder.mStyle.makeBigContentView(notificationbuilderwithbuilderaccessor);
		//   33   72:aload_1         
		//   34   73:getfield        #20  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//   35   76:aload_2         
		//   36   77:invokevirtual   #49  <Method RemoteViews NotificationCompat$Style.makeBigContentView(NotificationBuilderWithBuilderAccessor)>
		//   37   80:astore_3        
				if(remoteviews1 != null)
		//*  38   81:aload_3         
		//*  39   82:ifnull          91
					notification.bigContentView = remoteviews1;
		//   40   85:aload           4
		//   41   87:aload_3         
		//   42   88:putfield        #52  <Field RemoteViews Notification.bigContentView>
			}
			if(android.os.Build.VERSION.SDK_INT >= 21 && builder.mStyle != null)
		//*  43   91:getstatic       #46  <Field int android.os.Build$VERSION.SDK_INT>
		//*  44   94:bipush          21
		//*  45   96:icmplt          125
		//*  46   99:aload_1         
		//*  47  100:getfield        #20  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*  48  103:ifnull          125
			{
				builder = ((Builder) (builder.mStyle.makeHeadsUpContentView(notificationbuilderwithbuilderaccessor)));
		//   49  106:aload_1         
		//   50  107:getfield        #20  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//   51  110:aload_2         
		//   52  111:invokevirtual   #55  <Method RemoteViews NotificationCompat$Style.makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor)>
		//   53  114:astore_1        
				if(builder != null)
		//*  54  115:aload_1         
		//*  55  116:ifnull          125
					notification.headsUpContentView = ((RemoteViews) (builder));
		//   56  119:aload           4
		//   57  121:aload_1         
		//   58  122:putfield        #58  <Field RemoteViews Notification.headsUpContentView>
			}
			return notification;
		//   59  125:aload           4
		//   60  127:areturn         
		}

		protected BuilderExtender()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class CarExtender
		implements Extender
	{

		public Builder extend(Builder builder)
		{
			if(android.os.Build.VERSION.SDK_INT < 21)
		//*   0    0:getstatic       #51  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmpge          10
				return builder;
		//    3    8:aload_1         
		//    4    9:areturn         
			Bundle bundle = new Bundle();
		//    5   10:new             #57  <Class Bundle>
		//    6   13:dup             
		//    7   14:invokespecial   #97  <Method void Bundle()>
		//    8   17:astore_2        
			if(mLargeIcon != null)
		//*   9   18:aload_0         
		//*  10   19:getfield        #69  <Field Bitmap mLargeIcon>
		//*  11   22:ifnull          35
				bundle.putParcelable("large_icon", ((Parcelable) (mLargeIcon)));
		//   12   25:aload_2         
		//   13   26:ldc1            #30  <String "large_icon">
		//   14   28:aload_0         
		//   15   29:getfield        #69  <Field Bitmap mLargeIcon>
		//   16   32:invokevirtual   #101 <Method void Bundle.putParcelable(String, Parcelable)>
			if(mColor != 0)
		//*  17   35:aload_0         
		//*  18   36:getfield        #44  <Field int mColor>
		//*  19   39:ifeq            52
				bundle.putInt("app_color", mColor);
		//   20   42:aload_2         
		//   21   43:ldc1            #24  <String "app_color">
		//   22   45:aload_0         
		//   23   46:getfield        #44  <Field int mColor>
		//   24   49:invokevirtual   #105 <Method void Bundle.putInt(String, int)>
			if(mUnreadConversation != null)
		//*  25   52:aload_0         
		//*  26   53:getfield        #94  <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
		//*  27   56:ifnull          77
				bundle.putBundle("car_conversation", NotificationCompat.IMPL.getBundleForUnreadConversation(((NotificationCompatBase.UnreadConversation) (mUnreadConversation))));
		//   28   59:aload_2         
		//   29   60:ldc1            #27  <String "car_conversation">
		//   30   62:getstatic       #77  <Field NotificationCompat$NotificationCompatImpl NotificationCompat.IMPL>
		//   31   65:aload_0         
		//   32   66:getfield        #94  <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
		//   33   69:invokeinterface #109 <Method Bundle NotificationCompat$NotificationCompatImpl.getBundleForUnreadConversation(NotificationCompatBase$UnreadConversation)>
		//   34   74:invokevirtual   #113 <Method void Bundle.putBundle(String, Bundle)>
			builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
		//   35   77:aload_1         
		//   36   78:invokevirtual   #118 <Method Bundle NotificationCompat$Builder.getExtras()>
		//   37   81:ldc1            #21  <String "android.car.EXTENSIONS">
		//   38   83:aload_2         
		//   39   84:invokevirtual   #113 <Method void Bundle.putBundle(String, Bundle)>
			return builder;
		//   40   87:aload_1         
		//   41   88:areturn         
		}

		public int getColor()
		{
			return mColor;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field int mColor>
		//    2    4:ireturn         
		}

		public Bitmap getLargeIcon()
		{
			return mLargeIcon;
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field Bitmap mLargeIcon>
		//    2    4:areturn         
		}

		public UnreadConversation getUnreadConversation()
		{
			return mUnreadConversation;
		//    0    0:aload_0         
		//    1    1:getfield        #94  <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
		//    2    4:areturn         
		}

		public CarExtender setColor(int i)
		{
			mColor = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #44  <Field int mColor>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public CarExtender setLargeIcon(Bitmap bitmap)
		{
			mLargeIcon = bitmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #69  <Field Bitmap mLargeIcon>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public CarExtender setUnreadConversation(UnreadConversation unreadconversation)
		{
			mUnreadConversation = unreadconversation;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #94  <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
		private static final String EXTRA_COLOR = "app_color";
		private static final String EXTRA_CONVERSATION = "car_conversation";
		private static final String EXTRA_LARGE_ICON = "large_icon";
		private static final String TAG = "CarExtender";
		private int mColor;
		private Bitmap mLargeIcon;
		private UnreadConversation mUnreadConversation;

		public CarExtender()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void Object()>
			mColor = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #44  <Field int mColor>
		//    5    9:return          
		}

		public CarExtender(Notification notification)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void Object()>
			mColor = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #44  <Field int mColor>
			if(android.os.Build.VERSION.SDK_INT < 21)
		//*   5    9:getstatic       #51  <Field int android.os.Build$VERSION.SDK_INT>
		//*   6   12:bipush          21
		//*   7   14:icmpge          18
				return;
		//    8   17:return          
			if(NotificationCompat.getExtras(notification) == null)
		//*   9   18:aload_1         
		//*  10   19:invokestatic    #55  <Method Bundle NotificationCompat.getExtras(Notification)>
		//*  11   22:ifnonnull       30
				notification = null;
		//   12   25:aconst_null     
		//   13   26:astore_1        
			else
		//*  14   27:goto            40
				notification = ((Notification) (NotificationCompat.getExtras(notification).getBundle("android.car.EXTENSIONS")));
		//   15   30:aload_1         
		//   16   31:invokestatic    #55  <Method Bundle NotificationCompat.getExtras(Notification)>
		//   17   34:ldc1            #21  <String "android.car.EXTENSIONS">
		//   18   36:invokevirtual   #61  <Method Bundle Bundle.getBundle(String)>
		//   19   39:astore_1        
			if(notification != null)
		//*  20   40:aload_1         
		//*  21   41:ifnull          97
			{
				mLargeIcon = (Bitmap)((Bundle) (notification)).getParcelable("large_icon");
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:ldc1            #30  <String "large_icon">
		//   25   48:invokevirtual   #65  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   26   51:checkcast       #67  <Class Bitmap>
		//   27   54:putfield        #69  <Field Bitmap mLargeIcon>
				mColor = ((Bundle) (notification)).getInt("app_color", 0);
		//   28   57:aload_0         
		//   29   58:aload_1         
		//   30   59:ldc1            #24  <String "app_color">
		//   31   61:iconst_0        
		//   32   62:invokevirtual   #73  <Method int Bundle.getInt(String, int)>
		//   33   65:putfield        #44  <Field int mColor>
				notification = ((Notification) (((Bundle) (notification)).getBundle("car_conversation")));
		//   34   68:aload_1         
		//   35   69:ldc1            #27  <String "car_conversation">
		//   36   71:invokevirtual   #61  <Method Bundle Bundle.getBundle(String)>
		//   37   74:astore_1        
				mUnreadConversation = (UnreadConversation)NotificationCompat.IMPL.getUnreadConversationFromBundle(((Bundle) (notification)), UnreadConversation.FACTORY, RemoteInput.FACTORY);
		//   38   75:aload_0         
		//   39   76:getstatic       #77  <Field NotificationCompat$NotificationCompatImpl NotificationCompat.IMPL>
		//   40   79:aload_1         
		//   41   80:getstatic       #81  <Field NotificationCompatBase$UnreadConversation$Factory NotificationCompat$CarExtender$UnreadConversation.FACTORY>
		//   42   83:getstatic       #86  <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
		//   43   86:invokeinterface #92  <Method NotificationCompatBase$UnreadConversation NotificationCompat$NotificationCompatImpl.getUnreadConversationFromBundle(Bundle, NotificationCompatBase$UnreadConversation$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
		//   44   91:checkcast       #11  <Class NotificationCompat$CarExtender$UnreadConversation>
		//   45   94:putfield        #94  <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
			}
		//   46   97:return          
		}
	}

	public static class CarExtender.UnreadConversation extends NotificationCompatBase.UnreadConversation
	{

		public long getLatestTimestamp()
		{
			return mLatestTimestamp;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field long mLatestTimestamp>
		//    2    4:lreturn         
		}

		public String[] getMessages()
		{
			return mMessages;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field String[] mMessages>
		//    2    4:areturn         
		}

		public String getParticipant()
		{
			if(mParticipants.length > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #47  <Field String[] mParticipants>
		//*   2    4:arraylength     
		//*   3    5:ifle            15
				return mParticipants[0];
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field String[] mParticipants>
		//    6   12:iconst_0        
		//    7   13:aaload          
		//    8   14:areturn         
			else
				return null;
		//    9   15:aconst_null     
		//   10   16:areturn         
		}

		public String[] getParticipants()
		{
			return mParticipants;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field String[] mParticipants>
		//    2    4:areturn         
		}

		public PendingIntent getReadPendingIntent()
		{
			return mReadPendingIntent;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field PendingIntent mReadPendingIntent>
		//    2    4:areturn         
		}

		public RemoteInput getRemoteInput()
		{
			return mRemoteInput;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field RemoteInput mRemoteInput>
		//    2    4:areturn         
		}

		public volatile RemoteInputCompatBase.RemoteInput getRemoteInput()
		{
			return ((RemoteInputCompatBase.RemoteInput) (getRemoteInput()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #63  <Method RemoteInput getRemoteInput()>
		//    2    4:areturn         
		}

		public PendingIntent getReplyPendingIntent()
		{
			return mReplyPendingIntent;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field PendingIntent mReplyPendingIntent>
		//    2    4:areturn         
		}

		static final NotificationCompatBase.UnreadConversation.Factory FACTORY = new NotificationCompatBase.UnreadConversation.Factory() {

			public CarExtender.UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
			{
				return new CarExtender.UnreadConversation(as, (RemoteInput)remoteinput, pendingintent, pendingintent1, as1, l);
			//    0    0:new             #8   <Class NotificationCompat$CarExtender$UnreadConversation>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:checkcast       #23  <Class RemoteInput>
			//    5    9:aload_3         
			//    6   10:aload           4
			//    7   12:aload           5
			//    8   14:lload           6
			//    9   16:invokespecial   #26  <Method void NotificationCompat$CarExtender$UnreadConversation(String[], RemoteInput, PendingIntent, PendingIntent, String[], long)>
			//   10   19:areturn         
			}

			public volatile NotificationCompatBase.UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
			{
				return ((NotificationCompatBase.UnreadConversation) (build(as, remoteinput, pendingintent, pendingintent1, as1, l)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:aload           4
			//    5    6:aload           5
			//    6    8:lload           6
			//    7   10:invokevirtual   #29  <Method NotificationCompat$CarExtender$UnreadConversation build(String[], RemoteInputCompatBase$RemoteInput, PendingIntent, PendingIntent, String[], long)>
			//    8   13:areturn         
			}

		}
;
		private final long mLatestTimestamp;
		private final String mMessages[];
		private final String mParticipants[];
		private final PendingIntent mReadPendingIntent;
		private final RemoteInput mRemoteInput;
		private final PendingIntent mReplyPendingIntent;

		static 
		{
		//    0    0:new             #12  <Class NotificationCompat$CarExtender$UnreadConversation$1>
		//    1    3:dup             
		//    2    4:invokespecial   #32  <Method void NotificationCompat$CarExtender$UnreadConversation$1()>
		//    3    7:putstatic       #34  <Field NotificationCompatBase$UnreadConversation$Factory FACTORY>
		//*   4   10:return          
		}

		CarExtender.UnreadConversation(String as[], RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #37  <Method void NotificationCompatBase$UnreadConversation()>
			mMessages = as;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #39  <Field String[] mMessages>
			mRemoteInput = remoteinput;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #41  <Field RemoteInput mRemoteInput>
			mReadPendingIntent = pendingintent1;
		//    8   14:aload_0         
		//    9   15:aload           4
		//   10   17:putfield        #43  <Field PendingIntent mReadPendingIntent>
			mReplyPendingIntent = pendingintent;
		//   11   20:aload_0         
		//   12   21:aload_3         
		//   13   22:putfield        #45  <Field PendingIntent mReplyPendingIntent>
			mParticipants = as1;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #47  <Field String[] mParticipants>
			mLatestTimestamp = l;
		//   17   31:aload_0         
		//   18   32:lload           6
		//   19   34:putfield        #49  <Field long mLatestTimestamp>
		//   20   37:return          
		}
	}

	public static class CarExtender.UnreadConversation.Builder
	{

		public CarExtender.UnreadConversation.Builder addMessage(String s)
		{
			mMessages.add(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field List mMessages>
		//    2    4:aload_1         
		//    3    5:invokeinterface #46  <Method boolean List.add(Object)>
		//    4   10:pop             
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public CarExtender.UnreadConversation build()
		{
			String as[] = (String[])mMessages.toArray(((Object []) (new String[mMessages.size()])));
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field List mMessages>
		//    2    4:aload_0         
		//    3    5:getfield        #35  <Field List mMessages>
		//    4    8:invokeinterface #52  <Method int List.size()>
		//    5   13:anewarray       String[]
		//    6   16:invokeinterface #58  <Method Object[] List.toArray(Object[])>
		//    7   21:checkcast       #60  <Class String[]>
		//    8   24:astore_3        
			String s = mParticipant;
		//    9   25:aload_0         
		//   10   26:getfield        #37  <Field String mParticipant>
		//   11   29:astore          4
			RemoteInput remoteinput = mRemoteInput;
		//   12   31:aload_0         
		//   13   32:getfield        #62  <Field RemoteInput mRemoteInput>
		//   14   35:astore          5
			PendingIntent pendingintent = mReplyPendingIntent;
		//   15   37:aload_0         
		//   16   38:getfield        #64  <Field PendingIntent mReplyPendingIntent>
		//   17   41:astore          6
			PendingIntent pendingintent1 = mReadPendingIntent;
		//   18   43:aload_0         
		//   19   44:getfield        #66  <Field PendingIntent mReadPendingIntent>
		//   20   47:astore          7
			long l = mLatestTimestamp;
		//   21   49:aload_0         
		//   22   50:getfield        #68  <Field long mLatestTimestamp>
		//   23   53:lstore_1        
			return new CarExtender.UnreadConversation(as, remoteinput, pendingintent, pendingintent1, new String[] {
				s
			}, l);
		//   24   54:new             #11  <Class NotificationCompat$CarExtender$UnreadConversation>
		//   25   57:dup             
		//   26   58:aload_3         
		//   27   59:aload           5
		//   28   61:aload           6
		//   29   63:aload           7
		//   30   65:iconst_1        
		//   31   66:anewarray       String[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:aload           4
		//   35   73:aastore         
		//   36   74:lload_1         
		//   37   75:invokespecial   #71  <Method void NotificationCompat$CarExtender$UnreadConversation(String[], RemoteInput, PendingIntent, PendingIntent, String[], long)>
		//   38   78:areturn         
		}

		public CarExtender.UnreadConversation.Builder setLatestTimestamp(long l)
		{
			mLatestTimestamp = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #68  <Field long mLatestTimestamp>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public CarExtender.UnreadConversation.Builder setReadPendingIntent(PendingIntent pendingintent)
		{
			mReadPendingIntent = pendingintent;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #66  <Field PendingIntent mReadPendingIntent>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public CarExtender.UnreadConversation.Builder setReplyAction(PendingIntent pendingintent, RemoteInput remoteinput)
		{
			mRemoteInput = remoteinput;
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:putfield        #62  <Field RemoteInput mRemoteInput>
			mReplyPendingIntent = pendingintent;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #64  <Field PendingIntent mReplyPendingIntent>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		private long mLatestTimestamp;
		private final List mMessages = new ArrayList();
		private final String mParticipant;
		private PendingIntent mReadPendingIntent;
		private RemoteInput mRemoteInput;
		private PendingIntent mReplyPendingIntent;

		public CarExtender.UnreadConversation.Builder(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #32  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #33  <Method void ArrayList()>
		//    6   12:putfield        #35  <Field List mMessages>
			mParticipant = s;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #37  <Field String mParticipant>
		//   10   20:return          
		}
	}

	public static class DecoratedCustomViewStyle extends Style
	{

		private RemoteViews createRemoteViews(RemoteViews remoteviews, boolean flag)
		{
			boolean flag1;
			boolean flag2;
			RemoteViews remoteviews1;
label0:
			{
				int i = android.support.a.a.f.notification_template_custom_big;
		//    0    0:getstatic       #22  <Field int android.support.a.a$f.notification_template_custom_big>
		//    1    3:istore_3        
				boolean flag3 = true;
		//    2    4:iconst_1        
		//    3    5:istore          6
				flag2 = false;
		//    4    7:iconst_0        
		//    5    8:istore          5
				remoteviews1 = applyStandardTemplate(true, i, false);
		//    6   10:aload_0         
		//    7   11:iconst_1        
		//    8   12:iload_3         
		//    9   13:iconst_0        
		//   10   14:invokevirtual   #26  <Method RemoteViews applyStandardTemplate(boolean, int, boolean)>
		//   11   17:astore          8
				remoteviews1.removeAllViews(android.support.a.a.d.actions);
		//   12   19:aload           8
		//   13   21:getstatic       #31  <Field int android.support.a.a$d.actions>
		//   14   24:invokevirtual   #37  <Method void RemoteViews.removeAllViews(int)>
				if(flag && mBuilder.mActions != null)
		//*  15   27:iload_2         
		//*  16   28:ifeq            111
		//*  17   31:aload_0         
		//*  18   32:getfield        #41  <Field NotificationCompat$Builder mBuilder>
		//*  19   35:getfield        #47  <Field ArrayList NotificationCompat$Builder.mActions>
		//*  20   38:ifnull          111
				{
					int k = Math.min(mBuilder.mActions.size(), 3);
		//   21   41:aload_0         
		//   22   42:getfield        #41  <Field NotificationCompat$Builder mBuilder>
		//   23   45:getfield        #47  <Field ArrayList NotificationCompat$Builder.mActions>
		//   24   48:invokevirtual   #53  <Method int ArrayList.size()>
		//   25   51:iconst_3        
		//   26   52:invokestatic    #59  <Method int Math.min(int, int)>
		//   27   55:istore          7
					if(k > 0)
		//*  28   57:iload           7
		//*  29   59:ifle            111
					{
						int j = 0;
		//   30   62:iconst_0        
		//   31   63:istore_3        
						do
						{
							flag1 = flag3;
		//   32   64:iload           6
		//   33   66:istore          4
							if(j >= k)
								break;
		//   34   68:iload_3         
		//   35   69:iload           7
		//   36   71:icmpge          114
							RemoteViews remoteviews2 = generateActionButton((Action)mBuilder.mActions.get(j));
		//   37   74:aload_0         
		//   38   75:aload_0         
		//   39   76:getfield        #41  <Field NotificationCompat$Builder mBuilder>
		//   40   79:getfield        #47  <Field ArrayList NotificationCompat$Builder.mActions>
		//   41   82:iload_3         
		//   42   83:invokevirtual   #63  <Method Object ArrayList.get(int)>
		//   43   86:checkcast       #65  <Class NotificationCompat$Action>
		//   44   89:invokespecial   #69  <Method RemoteViews generateActionButton(NotificationCompat$Action)>
		//   45   92:astore          9
							remoteviews1.addView(android.support.a.a.d.actions, remoteviews2);
		//   46   94:aload           8
		//   47   96:getstatic       #31  <Field int android.support.a.a$d.actions>
		//   48   99:aload           9
		//   49  101:invokevirtual   #73  <Method void RemoteViews.addView(int, RemoteViews)>
							j++;
		//   50  104:iload_3         
		//   51  105:iconst_1        
		//   52  106:iadd            
		//   53  107:istore_3        
						} while(true);
		//   54  108:goto            64
						break label0;
					}
				}
				flag1 = false;
		//   55  111:iconst_0        
		//   56  112:istore          4
			}
			byte byte0;
			if(flag1)
		//*  57  114:iload           4
		//*  58  116:ifeq            125
				byte0 = ((byte) (flag2));
		//   59  119:iload           5
		//   60  121:istore_3        
			else
		//*  61  122:goto            128
				byte0 = 8;
		//   62  125:bipush          8
		//   63  127:istore_3        
			remoteviews1.setViewVisibility(android.support.a.a.d.actions, ((int) (byte0)));
		//   64  128:aload           8
		//   65  130:getstatic       #31  <Field int android.support.a.a$d.actions>
		//   66  133:iload_3         
		//   67  134:invokevirtual   #77  <Method void RemoteViews.setViewVisibility(int, int)>
			remoteviews1.setViewVisibility(android.support.a.a.d.action_divider, ((int) (byte0)));
		//   68  137:aload           8
		//   69  139:getstatic       #80  <Field int android.support.a.a$d.action_divider>
		//   70  142:iload_3         
		//   71  143:invokevirtual   #77  <Method void RemoteViews.setViewVisibility(int, int)>
			buildIntoRemoteViews(remoteviews1, remoteviews);
		//   72  146:aload_0         
		//   73  147:aload           8
		//   74  149:aload_1         
		//   75  150:invokevirtual   #84  <Method void buildIntoRemoteViews(RemoteViews, RemoteViews)>
			return remoteviews1;
		//   76  153:aload           8
		//   77  155:areturn         
		}

		private RemoteViews generateActionButton(Action action)
		{
			boolean flag;
			if(action.actionIntent == null)
		//*   0    0:aload_1         
		//*   1    1:getfield        #88  <Field PendingIntent NotificationCompat$Action.actionIntent>
		//*   2    4:ifnonnull       12
				flag = true;
		//    3    7:iconst_1        
		//    4    8:istore_2        
			else
		//*   5    9:goto            14
				flag = false;
		//    6   12:iconst_0        
		//    7   13:istore_2        
			Object obj = ((Object) (mBuilder.mContext.getPackageName()));
		//    8   14:aload_0         
		//    9   15:getfield        #41  <Field NotificationCompat$Builder mBuilder>
		//   10   18:getfield        #92  <Field Context NotificationCompat$Builder.mContext>
		//   11   21:invokevirtual   #98  <Method String Context.getPackageName()>
		//   12   24:astore          4
			int i;
			if(flag)
		//*  13   26:iload_2         
		//*  14   27:ifeq            37
				i = android.support.a.a.f.notification_action_tombstone;
		//   15   30:getstatic       #101 <Field int android.support.a.a$f.notification_action_tombstone>
		//   16   33:istore_3        
			else
		//*  17   34:goto            41
				i = android.support.a.a.f.notification_action;
		//   18   37:getstatic       #104 <Field int android.support.a.a$f.notification_action>
		//   19   40:istore_3        
			obj = ((Object) (new RemoteViews(((String) (obj)), i)));
		//   20   41:new             #33  <Class RemoteViews>
		//   21   44:dup             
		//   22   45:aload           4
		//   23   47:iload_3         
		//   24   48:invokespecial   #107 <Method void RemoteViews(String, int)>
		//   25   51:astore          4
			((RemoteViews) (obj)).setImageViewBitmap(android.support.a.a.d.action_image, createColoredBitmap(action.getIcon(), mBuilder.mContext.getResources().getColor(android.support.a.a.a.notification_action_color_filter)));
		//   26   53:aload           4
		//   27   55:getstatic       #110 <Field int android.support.a.a$d.action_image>
		//   28   58:aload_0         
		//   29   59:aload_1         
		//   30   60:invokevirtual   #113 <Method int NotificationCompat$Action.getIcon()>
		//   31   63:aload_0         
		//   32   64:getfield        #41  <Field NotificationCompat$Builder mBuilder>
		//   33   67:getfield        #92  <Field Context NotificationCompat$Builder.mContext>
		//   34   70:invokevirtual   #117 <Method Resources Context.getResources()>
		//   35   73:getstatic       #122 <Field int android.support.a.a$a.notification_action_color_filter>
		//   36   76:invokevirtual   #128 <Method int Resources.getColor(int)>
		//   37   79:invokevirtual   #132 <Method Bitmap createColoredBitmap(int, int)>
		//   38   82:invokevirtual   #136 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			((RemoteViews) (obj)).setTextViewText(android.support.a.a.d.action_text, action.title);
		//   39   85:aload           4
		//   40   87:getstatic       #139 <Field int android.support.a.a$d.action_text>
		//   41   90:aload_1         
		//   42   91:getfield        #143 <Field CharSequence NotificationCompat$Action.title>
		//   43   94:invokevirtual   #147 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			if(!flag)
		//*  44   97:iload_2         
		//*  45   98:ifne            113
				((RemoteViews) (obj)).setOnClickPendingIntent(android.support.a.a.d.action_container, action.actionIntent);
		//   46  101:aload           4
		//   47  103:getstatic       #150 <Field int android.support.a.a$d.action_container>
		//   48  106:aload_1         
		//   49  107:getfield        #88  <Field PendingIntent NotificationCompat$Action.actionIntent>
		//   50  110:invokevirtual   #154 <Method void RemoteViews.setOnClickPendingIntent(int, PendingIntent)>
			if(android.os.Build.VERSION.SDK_INT >= 15)
		//*  51  113:getstatic       #159 <Field int android.os.Build$VERSION.SDK_INT>
		//*  52  116:bipush          15
		//*  53  118:icmplt          133
				((RemoteViews) (obj)).setContentDescription(android.support.a.a.d.action_container, action.title);
		//   54  121:aload           4
		//   55  123:getstatic       #150 <Field int android.support.a.a$d.action_container>
		//   56  126:aload_1         
		//   57  127:getfield        #143 <Field CharSequence NotificationCompat$Action.title>
		//   58  130:invokevirtual   #162 <Method void RemoteViews.setContentDescription(int, CharSequence)>
			return ((RemoteViews) (obj));
		//   59  133:aload           4
		//   60  135:areturn         
		}

		public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			if(android.os.Build.VERSION.SDK_INT >= 24)
		//*   0    0:getstatic       #159 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          24
		//*   2    5:icmplt          25
				notificationbuilderwithbuilderaccessor.getBuilder().setStyle(((android.app.Notification.Style) (new android.app.Notification.DecoratedCustomViewStyle())));
		//    3    8:aload_1         
		//    4    9:invokeinterface #170 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
		//    5   14:new             #172 <Class android.app.Notification$DecoratedCustomViewStyle>
		//    6   17:dup             
		//    7   18:invokespecial   #173 <Method void android.app.Notification$DecoratedCustomViewStyle()>
		//    8   21:invokevirtual   #179 <Method android.app.Notification$Builder android.app.Notification$Builder.setStyle(android.app.Notification$Style)>
		//    9   24:pop             
		//   10   25:return          
		}

		public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			if(android.os.Build.VERSION.SDK_INT >= 24)
		//*   0    0:getstatic       #159 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          24
		//*   2    5:icmplt          10
				return null;
		//    3    8:aconst_null     
		//    4    9:areturn         
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getBigContentView()));
		//    5   10:aload_0         
		//    6   11:getfield        #41  <Field NotificationCompat$Builder mBuilder>
		//    7   14:invokevirtual   #185 <Method RemoteViews NotificationCompat$Builder.getBigContentView()>
		//    8   17:astore_1        
			if(notificationbuilderwithbuilderaccessor == null)
		//*   9   18:aload_1         
		//*  10   19:ifnull          25
		//*  11   22:goto            33
				notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getContentView()));
		//   12   25:aload_0         
		//   13   26:getfield        #41  <Field NotificationCompat$Builder mBuilder>
		//   14   29:invokevirtual   #188 <Method RemoteViews NotificationCompat$Builder.getContentView()>
		//   15   32:astore_1        
			if(notificationbuilderwithbuilderaccessor == null)
		//*  16   33:aload_1         
		//*  17   34:ifnonnull       39
				return null;
		//   18   37:aconst_null     
		//   19   38:areturn         
			else
				return createRemoteViews(((RemoteViews) (notificationbuilderwithbuilderaccessor)), true);
		//   20   39:aload_0         
		//   21   40:aload_1         
		//   22   41:iconst_1        
		//   23   42:invokespecial   #190 <Method RemoteViews createRemoteViews(RemoteViews, boolean)>
		//   24   45:areturn         
		}

		public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			if(android.os.Build.VERSION.SDK_INT >= 24)
		//*   0    0:getstatic       #159 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          24
		//*   2    5:icmplt          10
				return null;
		//    3    8:aconst_null     
		//    4    9:areturn         
			if(mBuilder.getContentView() == null)
		//*   5   10:aload_0         
		//*   6   11:getfield        #41  <Field NotificationCompat$Builder mBuilder>
		//*   7   14:invokevirtual   #188 <Method RemoteViews NotificationCompat$Builder.getContentView()>
		//*   8   17:ifnonnull       22
				return null;
		//    9   20:aconst_null     
		//   10   21:areturn         
			else
				return createRemoteViews(mBuilder.getContentView(), false);
		//   11   22:aload_0         
		//   12   23:aload_0         
		//   13   24:getfield        #41  <Field NotificationCompat$Builder mBuilder>
		//   14   27:invokevirtual   #188 <Method RemoteViews NotificationCompat$Builder.getContentView()>
		//   15   30:iconst_0        
		//   16   31:invokespecial   #190 <Method RemoteViews createRemoteViews(RemoteViews, boolean)>
		//   17   34:areturn         
		}

		public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			if(android.os.Build.VERSION.SDK_INT >= 24)
		//*   0    0:getstatic       #159 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          24
		//*   2    5:icmplt          10
				return null;
		//    3    8:aconst_null     
		//    4    9:areturn         
			RemoteViews remoteviews = mBuilder.getHeadsUpContentView();
		//    5   10:aload_0         
		//    6   11:getfield        #41  <Field NotificationCompat$Builder mBuilder>
		//    7   14:invokevirtual   #195 <Method RemoteViews NotificationCompat$Builder.getHeadsUpContentView()>
		//    8   17:astore_2        
			if(remoteviews != null)
		//*   9   18:aload_2         
		//*  10   19:ifnull          27
				notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (remoteviews));
		//   11   22:aload_2         
		//   12   23:astore_1        
			else
		//*  13   24:goto            35
				notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getContentView()));
		//   14   27:aload_0         
		//   15   28:getfield        #41  <Field NotificationCompat$Builder mBuilder>
		//   16   31:invokevirtual   #188 <Method RemoteViews NotificationCompat$Builder.getContentView()>
		//   17   34:astore_1        
			if(remoteviews == null)
		//*  18   35:aload_2         
		//*  19   36:ifnonnull       41
				return null;
		//   20   39:aconst_null     
		//   21   40:areturn         
			else
				return createRemoteViews(((RemoteViews) (notificationbuilderwithbuilderaccessor)), true);
		//   22   41:aload_0         
		//   23   42:aload_1         
		//   24   43:iconst_1        
		//   25   44:invokespecial   #190 <Method RemoteViews createRemoteViews(RemoteViews, boolean)>
		//   26   47:areturn         
		}

		private static final int MAX_ACTION_BUTTONS = 3;

		public DecoratedCustomViewStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void NotificationCompat$Style()>
		//    2    4:return          
		}
	}

	public static interface Extender
	{

		public abstract Builder extend(Builder builder);
	}

	public static class InboxStyle extends Style
	{

		public InboxStyle addLine(CharSequence charsequence)
		{
			mTexts.add(((Object) (Builder.limitCharSequenceLength(charsequence))));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field ArrayList mTexts>
		//    2    4:aload_1         
		//    3    5:invokestatic    #32  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    4    8:invokevirtual   #36  <Method boolean ArrayList.add(Object)>
		//    5   11:pop             
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			if(android.os.Build.VERSION.SDK_INT >= 16)
		//*   0    0:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          16
		//*   2    5:icmplt          28
				NotificationCompatJellybean.addInboxStyle(notificationbuilderwithbuilderaccessor, mBigContentTitle, mSummaryTextSet, mSummaryText, mTexts);
		//    3    8:aload_1         
		//    4    9:aload_0         
		//    5   10:getfield        #48  <Field CharSequence mBigContentTitle>
		//    6   13:aload_0         
		//    7   14:getfield        #52  <Field boolean mSummaryTextSet>
		//    8   17:aload_0         
		//    9   18:getfield        #55  <Field CharSequence mSummaryText>
		//   10   21:aload_0         
		//   11   22:getfield        #19  <Field ArrayList mTexts>
		//   12   25:invokestatic    #61  <Method void NotificationCompatJellybean.addInboxStyle(NotificationBuilderWithBuilderAccessor, CharSequence, boolean, CharSequence, ArrayList)>
		//   13   28:return          
		}

		public InboxStyle setBigContentTitle(CharSequence charsequence)
		{
			mBigContentTitle = Builder.limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #32  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #48  <Field CharSequence mBigContentTitle>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public InboxStyle setSummaryText(CharSequence charsequence)
		{
			mSummaryText = Builder.limitCharSequenceLength(charsequence);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #32  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
		//    3    5:putfield        #55  <Field CharSequence mSummaryText>
			mSummaryTextSet = true;
		//    4    8:aload_0         
		//    5    9:iconst_1        
		//    6   10:putfield        #52  <Field boolean mSummaryTextSet>
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		private ArrayList mTexts;

		public InboxStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void NotificationCompat$Style()>
			mTexts = new ArrayList();
		//    2    4:aload_0         
		//    3    5:new             #16  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #17  <Method void ArrayList()>
		//    6   12:putfield        #19  <Field ArrayList mTexts>
		//    7   15:return          
		}

		public InboxStyle(Builder builder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void NotificationCompat$Style()>
			mTexts = new ArrayList();
		//    2    4:aload_0         
		//    3    5:new             #16  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #17  <Method void ArrayList()>
		//    6   12:putfield        #19  <Field ArrayList mTexts>
			setBuilder(builder);
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokevirtual   #24  <Method void setBuilder(NotificationCompat$Builder)>
		//   10   20:return          
		}
	}

	public static class MessagingStyle extends Style
	{

		public static MessagingStyle extractMessagingStyleFromNotification(Notification notification)
		{
			notification = ((Notification) (NotificationCompat.getExtras(notification)));
		//    0    0:aload_0         
		//    1    1:invokestatic    #40  <Method Bundle NotificationCompat.getExtras(Notification)>
		//    2    4:astore_0        
			if(notification != null && !((Bundle) (notification)).containsKey("android.selfDisplayName"))
		//*   3    5:aload_0         
		//*   4    6:ifnull          20
		//*   5    9:aload_0         
		//*   6   10:ldc1            #42  <String "android.selfDisplayName">
		//*   7   12:invokevirtual   #48  <Method boolean Bundle.containsKey(String)>
		//*   8   15:ifne            20
				return null;
		//    9   18:aconst_null     
		//   10   19:areturn         
			MessagingStyle messagingstyle;
			try
			{
				messagingstyle = new MessagingStyle();
		//   11   20:new             #2   <Class NotificationCompat$MessagingStyle>
		//   12   23:dup             
		//   13   24:invokespecial   #49  <Method void NotificationCompat$MessagingStyle()>
		//   14   27:astore_1        
				messagingstyle.restoreFromCompatExtras(((Bundle) (notification)));
		//   15   28:aload_1         
		//   16   29:aload_0         
		//   17   30:invokevirtual   #53  <Method void restoreFromCompatExtras(Bundle)>
			}
		//*  18   33:aload_1         
		//*  19   34:areturn         
			// Misplaced declaration of an exception variable
			catch(Notification notification)
		//*  20   35:astore_0        
			{
				return null;
		//   21   36:aconst_null     
		//   22   37:areturn         
			}
			return messagingstyle;
		}

		private Message findLatestIncomingMessage()
		{
			for(int i = mMessages.size() - 1; i >= 0; i--)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field List mMessages>
		//*   2    4:invokeinterface #61  <Method int List.size()>
		//*   3    9:iconst_1        
		//*   4   10:isub            
		//*   5   11:istore_1        
		//*   6   12:iload_1         
		//*   7   13:iflt            49
			{
				Message message = (Message)mMessages.get(i);
		//    8   16:aload_0         
		//    9   17:getfield        #28  <Field List mMessages>
		//   10   20:iload_1         
		//   11   21:invokeinterface #65  <Method Object List.get(int)>
		//   12   26:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
		//   13   29:astore_2        
				if(!TextUtils.isEmpty(message.getSender()))
		//*  14   30:aload_2         
		//*  15   31:invokevirtual   #69  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
		//*  16   34:invokestatic    #75  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  17   37:ifne            42
					return message;
		//   18   40:aload_2         
		//   19   41:areturn         
			}

		//   20   42:iload_1         
		//   21   43:iconst_1        
		//   22   44:isub            
		//   23   45:istore_1        
		//*  24   46:goto            12
			if(!mMessages.isEmpty())
		//*  25   49:aload_0         
		//*  26   50:getfield        #28  <Field List mMessages>
		//*  27   53:invokeinterface #78  <Method boolean List.isEmpty()>
		//*  28   58:ifne            85
				return (Message)mMessages.get(mMessages.size() - 1);
		//   29   61:aload_0         
		//   30   62:getfield        #28  <Field List mMessages>
		//   31   65:aload_0         
		//   32   66:getfield        #28  <Field List mMessages>
		//   33   69:invokeinterface #61  <Method int List.size()>
		//   34   74:iconst_1        
		//   35   75:isub            
		//   36   76:invokeinterface #65  <Method Object List.get(int)>
		//   37   81:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
		//   38   84:areturn         
			else
				return null;
		//   39   85:aconst_null     
		//   40   86:areturn         
		}

		private boolean hasMessagesWithoutSender()
		{
			for(int i = mMessages.size() - 1; i >= 0; i--)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field List mMessages>
		//*   2    4:invokeinterface #61  <Method int List.size()>
		//*   3    9:iconst_1        
		//*   4   10:isub            
		//*   5   11:istore_1        
		//*   6   12:iload_1         
		//*   7   13:iflt            44
				if(((Message)mMessages.get(i)).getSender() == null)
		//*   8   16:aload_0         
		//*   9   17:getfield        #28  <Field List mMessages>
		//*  10   20:iload_1         
		//*  11   21:invokeinterface #65  <Method Object List.get(int)>
		//*  12   26:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
		//*  13   29:invokevirtual   #69  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
		//*  14   32:ifnonnull       37
					return true;
		//   15   35:iconst_1        
		//   16   36:ireturn         

		//   17   37:iload_1         
		//   18   38:iconst_1        
		//   19   39:isub            
		//   20   40:istore_1        
		//*  21   41:goto            12
			return false;
		//   22   44:iconst_0        
		//   23   45:ireturn         
		}

		private TextAppearanceSpan makeFontColorSpan(int i)
		{
			return new TextAppearanceSpan(((String) (null)), 0, 0, ColorStateList.valueOf(i), ((ColorStateList) (null)));
		//    0    0:new             #83  <Class TextAppearanceSpan>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:iconst_0        
		//    4    6:iconst_0        
		//    5    7:iload_1         
		//    6    8:invokestatic    #89  <Method ColorStateList ColorStateList.valueOf(int)>
		//    7   11:aconst_null     
		//    8   12:invokespecial   #92  <Method void TextAppearanceSpan(String, int, int, ColorStateList, ColorStateList)>
		//    9   15:areturn         
		}

		private CharSequence makeMessageLine(Message message)
		{
			a a1 = a.a();
		//    0    0:invokestatic    #100 <Method a a.a()>
		//    1    3:astore          7
			SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
		//    2    5:new             #102 <Class SpannableStringBuilder>
		//    3    8:dup             
		//    4    9:invokespecial   #103 <Method void SpannableStringBuilder()>
		//    5   12:astore          8
			boolean flag;
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   6   14:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
		//*   7   17:bipush          21
		//*   8   19:icmplt          27
				flag = true;
		//    9   22:iconst_1        
		//   10   23:istore_3        
			else
		//*  11   24:goto            29
				flag = false;
		//   12   27:iconst_0        
		//   13   28:istore_3        
			int i;
			if(flag)
		//*  14   29:iload_3         
		//*  15   30:ifeq            39
				i = 0xff000000;
		//   16   33:ldc1            #109 <Int 0xff000000>
		//   17   35:istore_2        
			else
		//*  18   36:goto            41
				i = -1;
		//   19   39:iconst_m1       
		//   20   40:istore_2        
			Object obj1 = ((Object) (message.getSender()));
		//   21   41:aload_1         
		//   22   42:invokevirtual   #69  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
		//   23   45:astore          6
			int j = i;
		//   24   47:iload_2         
		//   25   48:istore          4
			if(TextUtils.isEmpty(message.getSender()))
		//*  26   50:aload_1         
		//*  27   51:invokevirtual   #69  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
		//*  28   54:invokestatic    #75  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  29   57:ifeq            121
			{
				Object obj;
				if(mUserDisplayName == null)
		//*  30   60:aload_0         
		//*  31   61:getfield        #32  <Field CharSequence mUserDisplayName>
		//*  32   64:ifnonnull       74
					obj = "";
		//   33   67:ldc1            #111 <String "">
		//   34   69:astore          5
				else
		//*  35   71:goto            80
					obj = ((Object) (mUserDisplayName));
		//   36   74:aload_0         
		//   37   75:getfield        #32  <Field CharSequence mUserDisplayName>
		//   38   78:astore          5
				j = i;
		//   39   80:iload_2         
		//   40   81:istore          4
				obj1 = obj;
		//   41   83:aload           5
		//   42   85:astore          6
				if(flag)
		//*  43   87:iload_3         
		//*  44   88:ifeq            121
				{
					j = i;
		//   45   91:iload_2         
		//   46   92:istore          4
					obj1 = obj;
		//   47   94:aload           5
		//   48   96:astore          6
					if(mBuilder.getColor() != 0)
		//*  49   98:aload_0         
		//*  50   99:getfield        #115 <Field NotificationCompat$Builder mBuilder>
		//*  51  102:invokevirtual   #120 <Method int NotificationCompat$Builder.getColor()>
		//*  52  105:ifeq            121
					{
						j = mBuilder.getColor();
		//   53  108:aload_0         
		//   54  109:getfield        #115 <Field NotificationCompat$Builder mBuilder>
		//   55  112:invokevirtual   #120 <Method int NotificationCompat$Builder.getColor()>
		//   56  115:istore          4
						obj1 = obj;
		//   57  117:aload           5
		//   58  119:astore          6
					}
				}
			}
			CharSequence charsequence = a1.a(((CharSequence) (obj1)));
		//   59  121:aload           7
		//   60  123:aload           6
		//   61  125:invokevirtual   #123 <Method CharSequence a.a(CharSequence)>
		//   62  128:astore          5
			spannablestringbuilder.append(charsequence);
		//   63  130:aload           8
		//   64  132:aload           5
		//   65  134:invokevirtual   #127 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
		//   66  137:pop             
			spannablestringbuilder.setSpan(((Object) (makeFontColorSpan(j))), spannablestringbuilder.length() - charsequence.length(), spannablestringbuilder.length(), 33);
		//   67  138:aload           8
		//   68  140:aload_0         
		//   69  141:iload           4
		//   70  143:invokespecial   #129 <Method TextAppearanceSpan makeFontColorSpan(int)>
		//   71  146:aload           8
		//   72  148:invokevirtual   #132 <Method int SpannableStringBuilder.length()>
		//   73  151:aload           5
		//   74  153:invokeinterface #135 <Method int CharSequence.length()>
		//   75  158:isub            
		//   76  159:aload           8
		//   77  161:invokevirtual   #132 <Method int SpannableStringBuilder.length()>
		//   78  164:bipush          33
		//   79  166:invokevirtual   #139 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			if(message.getText() == null)
		//*  80  169:aload_1         
		//*  81  170:invokevirtual   #142 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
		//*  82  173:ifnonnull       182
				message = "";
		//   83  176:ldc1            #111 <String "">
		//   84  178:astore_1        
			else
		//*  85  179:goto            187
				message = ((Message) (message.getText()));
		//   86  182:aload_1         
		//   87  183:invokevirtual   #142 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
		//   88  186:astore_1        
			spannablestringbuilder.append("  ").append(a1.a(((CharSequence) (message))));
		//   89  187:aload           8
		//   90  189:ldc1            #144 <String "  ">
		//   91  191:invokevirtual   #127 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
		//   92  194:aload           7
		//   93  196:aload_1         
		//   94  197:invokevirtual   #123 <Method CharSequence a.a(CharSequence)>
		//   95  200:invokevirtual   #127 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
		//   96  203:pop             
			return ((CharSequence) (spannablestringbuilder));
		//   97  204:aload           8
		//   98  206:areturn         
		}

		public void addCompatExtras(Bundle bundle)
		{
			super.addCompatExtras(bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #147 <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
			if(mUserDisplayName != null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #32  <Field CharSequence mUserDisplayName>
		//*   5    9:ifnull          22
				bundle.putCharSequence("android.selfDisplayName", mUserDisplayName);
		//    6   12:aload_1         
		//    7   13:ldc1            #42  <String "android.selfDisplayName">
		//    8   15:aload_0         
		//    9   16:getfield        #32  <Field CharSequence mUserDisplayName>
		//   10   19:invokevirtual   #151 <Method void Bundle.putCharSequence(String, CharSequence)>
			if(mConversationTitle != null)
		//*  11   22:aload_0         
		//*  12   23:getfield        #153 <Field CharSequence mConversationTitle>
		//*  13   26:ifnull          39
				bundle.putCharSequence("android.conversationTitle", mConversationTitle);
		//   14   29:aload_1         
		//   15   30:ldc1            #155 <String "android.conversationTitle">
		//   16   32:aload_0         
		//   17   33:getfield        #153 <Field CharSequence mConversationTitle>
		//   18   36:invokevirtual   #151 <Method void Bundle.putCharSequence(String, CharSequence)>
			if(!mMessages.isEmpty())
		//*  19   39:aload_0         
		//*  20   40:getfield        #28  <Field List mMessages>
		//*  21   43:invokeinterface #78  <Method boolean List.isEmpty()>
		//*  22   48:ifne            64
				bundle.putParcelableArray("android.messages", ((Parcelable []) (Message.getBundleArrayForMessages(mMessages))));
		//   23   51:aload_1         
		//   24   52:ldc1            #157 <String "android.messages">
		//   25   54:aload_0         
		//   26   55:getfield        #28  <Field List mMessages>
		//   27   58:invokestatic    #161 <Method Bundle[] NotificationCompat$MessagingStyle$Message.getBundleArrayForMessages(List)>
		//   28   61:invokevirtual   #165 <Method void Bundle.putParcelableArray(String, Parcelable[])>
		//   29   64:return          
		}

		public MessagingStyle addMessage(Message message)
		{
			mMessages.add(((Object) (message)));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List mMessages>
		//    2    4:aload_1         
		//    3    5:invokeinterface #171 <Method boolean List.add(Object)>
		//    4   10:pop             
			if(mMessages.size() > 25)
		//*   5   11:aload_0         
		//*   6   12:getfield        #28  <Field List mMessages>
		//*   7   15:invokeinterface #61  <Method int List.size()>
		//*   8   20:bipush          25
		//*   9   22:icmple          36
				mMessages.remove(0);
		//   10   25:aload_0         
		//   11   26:getfield        #28  <Field List mMessages>
		//   12   29:iconst_0        
		//   13   30:invokeinterface #174 <Method Object List.remove(int)>
		//   14   35:pop             
			return this;
		//   15   36:aload_0         
		//   16   37:areturn         
		}

		public MessagingStyle addMessage(CharSequence charsequence, long l, CharSequence charsequence1)
		{
			mMessages.add(((Object) (new Message(charsequence, l, charsequence1))));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List mMessages>
		//    2    4:new             #9   <Class NotificationCompat$MessagingStyle$Message>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:lload_2         
		//    6   10:aload           4
		//    7   12:invokespecial   #178 <Method void NotificationCompat$MessagingStyle$Message(CharSequence, long, CharSequence)>
		//    8   15:invokeinterface #171 <Method boolean List.add(Object)>
		//    9   20:pop             
			if(mMessages.size() > 25)
		//*  10   21:aload_0         
		//*  11   22:getfield        #28  <Field List mMessages>
		//*  12   25:invokeinterface #61  <Method int List.size()>
		//*  13   30:bipush          25
		//*  14   32:icmple          46
				mMessages.remove(0);
		//   15   35:aload_0         
		//   16   36:getfield        #28  <Field List mMessages>
		//   17   39:iconst_0        
		//   18   40:invokeinterface #174 <Method Object List.remove(int)>
		//   19   45:pop             
			return this;
		//   20   46:aload_0         
		//   21   47:areturn         
		}

		public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			Message message;
			if(android.os.Build.VERSION.SDK_INT >= 24)
		//*   0    0:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          24
		//*   2    5:icmplt          180
			{
				ArrayList arraylist = new ArrayList();
		//    3    8:new             #25  <Class ArrayList>
		//    4   11:dup             
		//    5   12:invokespecial   #26  <Method void ArrayList()>
		//    6   15:astore          4
				ArrayList arraylist1 = new ArrayList();
		//    7   17:new             #25  <Class ArrayList>
		//    8   20:dup             
		//    9   21:invokespecial   #26  <Method void ArrayList()>
		//   10   24:astore          5
				ArrayList arraylist2 = new ArrayList();
		//   11   26:new             #25  <Class ArrayList>
		//   12   29:dup             
		//   13   30:invokespecial   #26  <Method void ArrayList()>
		//   14   33:astore          6
				ArrayList arraylist3 = new ArrayList();
		//   15   35:new             #25  <Class ArrayList>
		//   16   38:dup             
		//   17   39:invokespecial   #26  <Method void ArrayList()>
		//   18   42:astore          7
				ArrayList arraylist4 = new ArrayList();
		//   19   44:new             #25  <Class ArrayList>
		//   20   47:dup             
		//   21   48:invokespecial   #26  <Method void ArrayList()>
		//   22   51:astore          8
				Message message1;
				for(Iterator iterator = mMessages.iterator(); iterator.hasNext(); ((List) (arraylist4)).add(((Object) (message1.getDataUri()))))
		//*  23   53:aload_0         
		//*  24   54:getfield        #28  <Field List mMessages>
		//*  25   57:invokeinterface #184 <Method Iterator List.iterator()>
		//*  26   62:astore          9
		//*  27   64:aload           9
		//*  28   66:invokeinterface #189 <Method boolean Iterator.hasNext()>
		//*  29   71:ifeq            157
				{
					message1 = (Message)iterator.next();
		//   30   74:aload           9
		//   31   76:invokeinterface #193 <Method Object Iterator.next()>
		//   32   81:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
		//   33   84:astore          10
					((List) (arraylist)).add(((Object) (message1.getText())));
		//   34   86:aload           4
		//   35   88:aload           10
		//   36   90:invokevirtual   #142 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
		//   37   93:invokeinterface #171 <Method boolean List.add(Object)>
		//   38   98:pop             
					((List) (arraylist1)).add(((Object) (Long.valueOf(message1.getTimestamp()))));
		//   39   99:aload           5
		//   40  101:aload           10
		//   41  103:invokevirtual   #197 <Method long NotificationCompat$MessagingStyle$Message.getTimestamp()>
		//   42  106:invokestatic    #202 <Method Long Long.valueOf(long)>
		//   43  109:invokeinterface #171 <Method boolean List.add(Object)>
		//   44  114:pop             
					((List) (arraylist2)).add(((Object) (message1.getSender())));
		//   45  115:aload           6
		//   46  117:aload           10
		//   47  119:invokevirtual   #69  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
		//   48  122:invokeinterface #171 <Method boolean List.add(Object)>
		//   49  127:pop             
					((List) (arraylist3)).add(((Object) (message1.getDataMimeType())));
		//   50  128:aload           7
		//   51  130:aload           10
		//   52  132:invokevirtual   #206 <Method String NotificationCompat$MessagingStyle$Message.getDataMimeType()>
		//   53  135:invokeinterface #171 <Method boolean List.add(Object)>
		//   54  140:pop             
				}

		//   55  141:aload           8
		//   56  143:aload           10
		//   57  145:invokevirtual   #210 <Method Uri NotificationCompat$MessagingStyle$Message.getDataUri()>
		//   58  148:invokeinterface #171 <Method boolean List.add(Object)>
		//   59  153:pop             
		//*  60  154:goto            64
				NotificationCompatApi24.addMessagingStyle(notificationbuilderwithbuilderaccessor, mUserDisplayName, mConversationTitle, ((List) (arraylist)), ((List) (arraylist1)), ((List) (arraylist2)), ((List) (arraylist3)), ((List) (arraylist4)));
		//   61  157:aload_1         
		//   62  158:aload_0         
		//   63  159:getfield        #32  <Field CharSequence mUserDisplayName>
		//   64  162:aload_0         
		//   65  163:getfield        #153 <Field CharSequence mConversationTitle>
		//   66  166:aload           4
		//   67  168:aload           5
		//   68  170:aload           6
		//   69  172:aload           7
		//   70  174:aload           8
		//   71  176:invokestatic    #216 <Method void NotificationCompatApi24.addMessagingStyle(NotificationBuilderWithBuilderAccessor, CharSequence, CharSequence, List, List, List, List, List)>
				return;
		//   72  179:return          
			}
			message = findLatestIncomingMessage();
		//   73  180:aload_0         
		//   74  181:invokespecial   #218 <Method NotificationCompat$MessagingStyle$Message findLatestIncomingMessage()>
		//   75  184:astore          6
			if(mConversationTitle == null) goto _L2; else goto _L1
		//   76  186:aload_0         
		//   77  187:getfield        #153 <Field CharSequence mConversationTitle>
		//   78  190:ifnull          218
_L1:
			android.app.Notification.Builder builder;
			CharSequence charsequence1;
			builder = notificationbuilderwithbuilderaccessor.getBuilder();
		//   79  193:aload_1         
		//   80  194:invokeinterface #224 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
		//   81  199:astore          4
			charsequence1 = mConversationTitle;
		//   82  201:aload_0         
		//   83  202:getfield        #153 <Field CharSequence mConversationTitle>
		//   84  205:astore          5
_L4:
			builder.setContentTitle(charsequence1);
		//   85  207:aload           4
		//   86  209:aload           5
		//   87  211:invokevirtual   #230 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//   88  214:pop             
			break; /* Loop/switch isn't completed */
		//   89  215:goto            241
_L2:
			if(message == null)
				break; /* Loop/switch isn't completed */
		//   90  218:aload           6
		//   91  220:ifnull          241
			builder = notificationbuilderwithbuilderaccessor.getBuilder();
		//   92  223:aload_1         
		//   93  224:invokeinterface #224 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
		//   94  229:astore          4
			charsequence1 = message.getSender();
		//   95  231:aload           6
		//   96  233:invokevirtual   #69  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
		//   97  236:astore          5
			if(true) goto _L4; else goto _L3
		//   98  238:goto            207
_L3:
			if(message != null)
		//*  99  241:aload           6
		//* 100  243:ifnull          287
			{
				android.app.Notification.Builder builder1 = notificationbuilderwithbuilderaccessor.getBuilder();
		//  101  246:aload_1         
		//  102  247:invokeinterface #224 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
		//  103  252:astore          5
				CharSequence charsequence;
				if(mConversationTitle != null)
		//* 104  254:aload_0         
		//* 105  255:getfield        #153 <Field CharSequence mConversationTitle>
		//* 106  258:ifnull          272
					charsequence = makeMessageLine(message);
		//  107  261:aload_0         
		//  108  262:aload           6
		//  109  264:invokespecial   #232 <Method CharSequence makeMessageLine(NotificationCompat$MessagingStyle$Message)>
		//  110  267:astore          4
				else
		//* 111  269:goto            279
					charsequence = message.getText();
		//  112  272:aload           6
		//  113  274:invokevirtual   #142 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
		//  114  277:astore          4
				builder1.setContentText(charsequence);
		//  115  279:aload           5
		//  116  281:aload           4
		//  117  283:invokevirtual   #235 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//  118  286:pop             
			}
			if(android.os.Build.VERSION.SDK_INT >= 16)
		//* 119  287:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
		//* 120  290:bipush          16
		//* 121  292:icmplt          430
			{
				SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
		//  122  295:new             #102 <Class SpannableStringBuilder>
		//  123  298:dup             
		//  124  299:invokespecial   #103 <Method void SpannableStringBuilder()>
		//  125  302:astore          5
				boolean flag;
				if(mConversationTitle == null && !hasMessagesWithoutSender())
		//* 126  304:aload_0         
		//* 127  305:getfield        #153 <Field CharSequence mConversationTitle>
		//* 128  308:ifnonnull       326
		//* 129  311:aload_0         
		//* 130  312:invokespecial   #237 <Method boolean hasMessagesWithoutSender()>
		//* 131  315:ifeq            321
		//* 132  318:goto            326
					flag = false;
		//  133  321:iconst_0        
		//  134  322:istore_2        
				else
		//* 135  323:goto            328
					flag = true;
		//  136  326:iconst_1        
		//  137  327:istore_2        
				for(int i = mMessages.size() - 1; i >= 0; i--)
		//* 138  328:aload_0         
		//* 139  329:getfield        #28  <Field List mMessages>
		//* 140  332:invokeinterface #61  <Method int List.size()>
		//* 141  337:iconst_1        
		//* 142  338:isub            
		//* 143  339:istore_3        
		//* 144  340:iload_3         
		//* 145  341:iflt            421
				{
					Object obj = ((Object) ((Message)mMessages.get(i)));
		//  146  344:aload_0         
		//  147  345:getfield        #28  <Field List mMessages>
		//  148  348:iload_3         
		//  149  349:invokeinterface #65  <Method Object List.get(int)>
		//  150  354:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
		//  151  357:astore          4
					if(flag)
		//* 152  359:iload_2         
		//* 153  360:ifeq            374
						obj = ((Object) (makeMessageLine(((Message) (obj)))));
		//  154  363:aload_0         
		//  155  364:aload           4
		//  156  366:invokespecial   #232 <Method CharSequence makeMessageLine(NotificationCompat$MessagingStyle$Message)>
		//  157  369:astore          4
					else
		//* 158  371:goto            381
						obj = ((Object) (((Message) (obj)).getText()));
		//  159  374:aload           4
		//  160  376:invokevirtual   #142 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
		//  161  379:astore          4
					if(i != mMessages.size() - 1)
		//* 162  381:iload_3         
		//* 163  382:aload_0         
		//* 164  383:getfield        #28  <Field List mMessages>
		//* 165  386:invokeinterface #61  <Method int List.size()>
		//* 166  391:iconst_1        
		//* 167  392:isub            
		//* 168  393:icmpeq          405
						spannablestringbuilder.insert(0, "\n");
		//  169  396:aload           5
		//  170  398:iconst_0        
		//  171  399:ldc1            #239 <String "\n">
		//  172  401:invokevirtual   #243 <Method SpannableStringBuilder SpannableStringBuilder.insert(int, CharSequence)>
		//  173  404:pop             
					spannablestringbuilder.insert(0, ((CharSequence) (obj)));
		//  174  405:aload           5
		//  175  407:iconst_0        
		//  176  408:aload           4
		//  177  410:invokevirtual   #243 <Method SpannableStringBuilder SpannableStringBuilder.insert(int, CharSequence)>
		//  178  413:pop             
				}

		//  179  414:iload_3         
		//  180  415:iconst_1        
		//  181  416:isub            
		//  182  417:istore_3        
		//* 183  418:goto            340
				NotificationCompatJellybean.addBigTextStyle(notificationbuilderwithbuilderaccessor, ((CharSequence) (null)), false, ((CharSequence) (null)), ((CharSequence) (spannablestringbuilder)));
		//  184  421:aload_1         
		//  185  422:aconst_null     
		//  186  423:iconst_0        
		//  187  424:aconst_null     
		//  188  425:aload           5
		//  189  427:invokestatic    #249 <Method void NotificationCompatJellybean.addBigTextStyle(NotificationBuilderWithBuilderAccessor, CharSequence, boolean, CharSequence, CharSequence)>
			}
			return;
		//  190  430:return          
		}

		public CharSequence getConversationTitle()
		{
			return mConversationTitle;
		//    0    0:aload_0         
		//    1    1:getfield        #153 <Field CharSequence mConversationTitle>
		//    2    4:areturn         
		}

		public List getMessages()
		{
			return mMessages;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List mMessages>
		//    2    4:areturn         
		}

		public CharSequence getUserDisplayName()
		{
			return mUserDisplayName;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field CharSequence mUserDisplayName>
		//    2    4:areturn         
		}

		protected void restoreFromCompatExtras(Bundle bundle)
		{
			mMessages.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List mMessages>
		//    2    4:invokeinterface #258 <Method void List.clear()>
			mUserDisplayName = ((CharSequence) (bundle.getString("android.selfDisplayName")));
		//    3    9:aload_0         
		//    4   10:aload_1         
		//    5   11:ldc1            #42  <String "android.selfDisplayName">
		//    6   13:invokevirtual   #262 <Method String Bundle.getString(String)>
		//    7   16:putfield        #32  <Field CharSequence mUserDisplayName>
			mConversationTitle = ((CharSequence) (bundle.getString("android.conversationTitle")));
		//    8   19:aload_0         
		//    9   20:aload_1         
		//   10   21:ldc1            #155 <String "android.conversationTitle">
		//   11   23:invokevirtual   #262 <Method String Bundle.getString(String)>
		//   12   26:putfield        #153 <Field CharSequence mConversationTitle>
			bundle = ((Bundle) (bundle.getParcelableArray("android.messages")));
		//   13   29:aload_1         
		//   14   30:ldc1            #157 <String "android.messages">
		//   15   32:invokevirtual   #266 <Method Parcelable[] Bundle.getParcelableArray(String)>
		//   16   35:astore_1        
			if(bundle != null)
		//*  17   36:aload_1         
		//*  18   37:ifnull          48
				mMessages = Message.getMessagesFromBundleArray(((Parcelable []) (bundle)));
		//   19   40:aload_0         
		//   20   41:aload_1         
		//   21   42:invokestatic    #270 <Method List NotificationCompat$MessagingStyle$Message.getMessagesFromBundleArray(Parcelable[])>
		//   22   45:putfield        #28  <Field List mMessages>
		//   23   48:return          
		}

		public MessagingStyle setConversationTitle(CharSequence charsequence)
		{
			mConversationTitle = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #153 <Field CharSequence mConversationTitle>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public static final int MAXIMUM_RETAINED_MESSAGES = 25;
		CharSequence mConversationTitle;
		List mMessages;
		CharSequence mUserDisplayName;

		MessagingStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void NotificationCompat$Style()>
			mMessages = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #25  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #26  <Method void ArrayList()>
		//    6   12:putfield        #28  <Field List mMessages>
		//    7   15:return          
		}

		public MessagingStyle(CharSequence charsequence)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void NotificationCompat$Style()>
			mMessages = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #25  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #26  <Method void ArrayList()>
		//    6   12:putfield        #28  <Field List mMessages>
			mUserDisplayName = charsequence;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #32  <Field CharSequence mUserDisplayName>
		//   10   20:return          
		}
	}

	public static final class MessagingStyle.Message
	{

		static Bundle[] getBundleArrayForMessages(List list)
		{
			Bundle abundle[] = new Bundle[list.size()];
		//    0    0:aload_0         
		//    1    1:invokeinterface #64  <Method int List.size()>
		//    2    6:anewarray       Bundle[]
		//    3    9:astore_3        
			int j = list.size();
		//    4   10:aload_0         
		//    5   11:invokeinterface #64  <Method int List.size()>
		//    6   16:istore_2        
			for(int i = 0; i < j; i++)
		//*   7   17:iconst_0        
		//*   8   18:istore_1        
		//*   9   19:iload_1         
		//*  10   20:iload_2         
		//*  11   21:icmpge          47
				abundle[i] = ((MessagingStyle.Message)list.get(i)).toBundle();
		//   12   24:aload_3         
		//   13   25:iload_1         
		//   14   26:aload_0         
		//   15   27:iload_1         
		//   16   28:invokeinterface #68  <Method Object List.get(int)>
		//   17   33:checkcast       #2   <Class NotificationCompat$MessagingStyle$Message>
		//   18   36:invokespecial   #72  <Method Bundle toBundle()>
		//   19   39:aastore         

		//   20   40:iload_1         
		//   21   41:iconst_1        
		//   22   42:iadd            
		//   23   43:istore_1        
		//*  24   44:goto            19
			return abundle;
		//   25   47:aload_3         
		//   26   48:areturn         
		}

		static MessagingStyle.Message getMessageFromBundle(Bundle bundle)
		{
			if(bundle.containsKey("text"))
		//*   0    0:aload_0         
		//*   1    1:ldc1            #26  <String "text">
		//*   2    3:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*   3    6:ifeq            108
			{
				if(!bundle.containsKey("time"))
		//*   4    9:aload_0         
		//*   5   10:ldc1            #29  <String "time">
		//*   6   12:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*   7   15:ifne            20
					return null;
		//    8   18:aconst_null     
		//    9   19:areturn         
				MessagingStyle.Message message;
				try
				{
					message = new MessagingStyle.Message(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.getCharSequence("sender"));
		//   10   20:new             #2   <Class NotificationCompat$MessagingStyle$Message>
		//   11   23:dup             
		//   12   24:aload_0         
		//   13   25:ldc1            #26  <String "text">
		//   14   27:invokevirtual   #86  <Method CharSequence Bundle.getCharSequence(String)>
		//   15   30:aload_0         
		//   16   31:ldc1            #29  <String "time">
		//   17   33:invokevirtual   #90  <Method long Bundle.getLong(String)>
		//   18   36:aload_0         
		//   19   37:ldc1            #23  <String "sender">
		//   20   39:invokevirtual   #86  <Method CharSequence Bundle.getCharSequence(String)>
		//   21   42:invokespecial   #92  <Method void NotificationCompat$MessagingStyle$Message(CharSequence, long, CharSequence)>
		//   22   45:astore_1        
					if(bundle.containsKey("type") && bundle.containsKey("uri"))
		//*  23   46:aload_0         
		//*  24   47:ldc1            #14  <String "type">
		//*  25   49:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*  26   52:ifeq            84
		//*  27   55:aload_0         
		//*  28   56:ldc1            #17  <String "uri">
		//*  29   58:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*  30   61:ifeq            84
						message.setData(bundle.getString("type"), (Uri)bundle.getParcelable("uri"));
		//   31   64:aload_1         
		//   32   65:aload_0         
		//   33   66:ldc1            #14  <String "type">
		//   34   68:invokevirtual   #96  <Method String Bundle.getString(String)>
		//   35   71:aload_0         
		//   36   72:ldc1            #17  <String "uri">
		//   37   74:invokevirtual   #100 <Method Parcelable Bundle.getParcelable(String)>
		//   38   77:checkcast       #102 <Class Uri>
		//   39   80:invokevirtual   #106 <Method NotificationCompat$MessagingStyle$Message setData(String, Uri)>
		//   40   83:pop             
					if(bundle.containsKey("extras"))
		//*  41   84:aload_0         
		//*  42   85:ldc1            #20  <String "extras">
		//*  43   87:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*  44   90:ifeq            106
						message.getExtras().putAll(bundle.getBundle("extras"));
		//   45   93:aload_1         
		//   46   94:invokevirtual   #109 <Method Bundle getExtras()>
		//   47   97:aload_0         
		//   48   98:ldc1            #20  <String "extras">
		//   49  100:invokevirtual   #113 <Method Bundle Bundle.getBundle(String)>
		//   50  103:invokevirtual   #117 <Method void Bundle.putAll(Bundle)>
				}
		//*  51  106:aload_1         
		//*  52  107:areturn         
		//*  53  108:aconst_null     
		//*  54  109:areturn         
				// Misplaced declaration of an exception variable
				catch(Bundle bundle)
		//*  55  110:astore_0        
				{
					return null;
		//   56  111:aconst_null     
		//   57  112:areturn         
				}
				return message;
			} else
			{
				return null;
			}
		}

		static List getMessagesFromBundleArray(Parcelable aparcelable[])
		{
			ArrayList arraylist = new ArrayList(aparcelable.length);
		//    0    0:new             #121 <Class ArrayList>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:arraylength     
		//    4    6:invokespecial   #124 <Method void ArrayList(int)>
		//    5    9:astore_2        
			for(int i = 0; i < aparcelable.length; i++)
		//*   6   10:iconst_0        
		//*   7   11:istore_1        
		//*   8   12:iload_1         
		//*   9   13:aload_0         
		//*  10   14:arraylength     
		//*  11   15:icmpge          56
			{
				if(!(aparcelable[i] instanceof Bundle))
					continue;
		//   12   18:aload_0         
		//   13   19:iload_1         
		//   14   20:aaload          
		//   15   21:instanceof      #46  <Class Bundle>
		//   16   24:ifeq            49
				MessagingStyle.Message message = getMessageFromBundle((Bundle)aparcelable[i]);
		//   17   27:aload_0         
		//   18   28:iload_1         
		//   19   29:aaload          
		//   20   30:checkcast       #46  <Class Bundle>
		//   21   33:invokestatic    #126 <Method NotificationCompat$MessagingStyle$Message getMessageFromBundle(Bundle)>
		//   22   36:astore_3        
				if(message != null)
		//*  23   37:aload_3         
		//*  24   38:ifnull          49
					((List) (arraylist)).add(((Object) (message)));
		//   25   41:aload_2         
		//   26   42:aload_3         
		//   27   43:invokeinterface #130 <Method boolean List.add(Object)>
		//   28   48:pop             
			}

		//   29   49:iload_1         
		//   30   50:iconst_1        
		//   31   51:iadd            
		//   32   52:istore_1        
		//*  33   53:goto            12
			return ((List) (arraylist));
		//   34   56:aload_2         
		//   35   57:areturn         
		}

		private Bundle toBundle()
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #46  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #47  <Method void Bundle()>
		//    3    7:astore_1        
			if(mText != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #51  <Field CharSequence mText>
		//*   6   12:ifnull          25
				bundle.putCharSequence("text", mText);
		//    7   15:aload_1         
		//    8   16:ldc1            #26  <String "text">
		//    9   18:aload_0         
		//   10   19:getfield        #51  <Field CharSequence mText>
		//   11   22:invokevirtual   #135 <Method void Bundle.putCharSequence(String, CharSequence)>
			bundle.putLong("time", mTimestamp);
		//   12   25:aload_1         
		//   13   26:ldc1            #29  <String "time">
		//   14   28:aload_0         
		//   15   29:getfield        #53  <Field long mTimestamp>
		//   16   32:invokevirtual   #139 <Method void Bundle.putLong(String, long)>
			if(mSender != null)
		//*  17   35:aload_0         
		//*  18   36:getfield        #55  <Field CharSequence mSender>
		//*  19   39:ifnull          52
				bundle.putCharSequence("sender", mSender);
		//   20   42:aload_1         
		//   21   43:ldc1            #23  <String "sender">
		//   22   45:aload_0         
		//   23   46:getfield        #55  <Field CharSequence mSender>
		//   24   49:invokevirtual   #135 <Method void Bundle.putCharSequence(String, CharSequence)>
			if(mDataMimeType != null)
		//*  25   52:aload_0         
		//*  26   53:getfield        #141 <Field String mDataMimeType>
		//*  27   56:ifnull          69
				bundle.putString("type", mDataMimeType);
		//   28   59:aload_1         
		//   29   60:ldc1            #14  <String "type">
		//   30   62:aload_0         
		//   31   63:getfield        #141 <Field String mDataMimeType>
		//   32   66:invokevirtual   #145 <Method void Bundle.putString(String, String)>
			if(mDataUri != null)
		//*  33   69:aload_0         
		//*  34   70:getfield        #147 <Field Uri mDataUri>
		//*  35   73:ifnull          86
				bundle.putParcelable("uri", ((Parcelable) (mDataUri)));
		//   36   76:aload_1         
		//   37   77:ldc1            #17  <String "uri">
		//   38   79:aload_0         
		//   39   80:getfield        #147 <Field Uri mDataUri>
		//   40   83:invokevirtual   #151 <Method void Bundle.putParcelable(String, Parcelable)>
			if(mExtras != null)
		//*  41   86:aload_0         
		//*  42   87:getfield        #49  <Field Bundle mExtras>
		//*  43   90:ifnull          103
				bundle.putBundle("extras", mExtras);
		//   44   93:aload_1         
		//   45   94:ldc1            #20  <String "extras">
		//   46   96:aload_0         
		//   47   97:getfield        #49  <Field Bundle mExtras>
		//   48  100:invokevirtual   #155 <Method void Bundle.putBundle(String, Bundle)>
			return bundle;
		//   49  103:aload_1         
		//   50  104:areturn         
		}

		public String getDataMimeType()
		{
			return mDataMimeType;
		//    0    0:aload_0         
		//    1    1:getfield        #141 <Field String mDataMimeType>
		//    2    4:areturn         
		}

		public Uri getDataUri()
		{
			return mDataUri;
		//    0    0:aload_0         
		//    1    1:getfield        #147 <Field Uri mDataUri>
		//    2    4:areturn         
		}

		public Bundle getExtras()
		{
			return mExtras;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Bundle mExtras>
		//    2    4:areturn         
		}

		public CharSequence getSender()
		{
			return mSender;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field CharSequence mSender>
		//    2    4:areturn         
		}

		public CharSequence getText()
		{
			return mText;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field CharSequence mText>
		//    2    4:areturn         
		}

		public long getTimestamp()
		{
			return mTimestamp;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field long mTimestamp>
		//    2    4:lreturn         
		}

		public MessagingStyle.Message setData(String s, Uri uri)
		{
			mDataMimeType = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #141 <Field String mDataMimeType>
			mDataUri = uri;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #147 <Field Uri mDataUri>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		static final String KEY_DATA_MIME_TYPE = "type";
		static final String KEY_DATA_URI = "uri";
		static final String KEY_EXTRAS_BUNDLE = "extras";
		static final String KEY_SENDER = "sender";
		static final String KEY_TEXT = "text";
		static final String KEY_TIMESTAMP = "time";
		private String mDataMimeType;
		private Uri mDataUri;
		private Bundle mExtras;
		private final CharSequence mSender;
		private final CharSequence mText;
		private final long mTimestamp;

		public MessagingStyle.Message(CharSequence charsequence, long l, CharSequence charsequence1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #44  <Method void Object()>
			mExtras = new Bundle();
		//    2    4:aload_0         
		//    3    5:new             #46  <Class Bundle>
		//    4    8:dup             
		//    5    9:invokespecial   #47  <Method void Bundle()>
		//    6   12:putfield        #49  <Field Bundle mExtras>
			mText = charsequence;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #51  <Field CharSequence mText>
			mTimestamp = l;
		//   10   20:aload_0         
		//   11   21:lload_2         
		//   12   22:putfield        #53  <Field long mTimestamp>
			mSender = charsequence1;
		//   13   25:aload_0         
		//   14   26:aload           4
		//   15   28:putfield        #55  <Field CharSequence mSender>
		//   16   31:return          
		}
	}

	static class NotificationCompatApi16Impl extends NotificationCompatBaseImpl
	{

		public Notification build(Builder builder, BuilderExtender builderextender)
		{
			NotificationCompatJellybean.Builder builder1 = new NotificationCompatJellybean.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mContentView, builder.mBigContentView);
		//    0    0:new             #16  <Class NotificationCompatJellybean$Builder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:getfield        #22  <Field Context NotificationCompat$Builder.mContext>
		//    4    8:aload_1         
		//    5    9:getfield        #26  <Field Notification NotificationCompat$Builder.mNotification>
		//    6   12:aload_1         
		//    7   13:getfield        #30  <Field CharSequence NotificationCompat$Builder.mContentTitle>
		//    8   16:aload_1         
		//    9   17:getfield        #33  <Field CharSequence NotificationCompat$Builder.mContentText>
		//   10   20:aload_1         
		//   11   21:getfield        #36  <Field CharSequence NotificationCompat$Builder.mContentInfo>
		//   12   24:aload_1         
		//   13   25:getfield        #40  <Field RemoteViews NotificationCompat$Builder.mTickerView>
		//   14   28:aload_1         
		//   15   29:getfield        #44  <Field int NotificationCompat$Builder.mNumber>
		//   16   32:aload_1         
		//   17   33:getfield        #48  <Field PendingIntent NotificationCompat$Builder.mContentIntent>
		//   18   36:aload_1         
		//   19   37:getfield        #51  <Field PendingIntent NotificationCompat$Builder.mFullScreenIntent>
		//   20   40:aload_1         
		//   21   41:getfield        #55  <Field Bitmap NotificationCompat$Builder.mLargeIcon>
		//   22   44:aload_1         
		//   23   45:getfield        #58  <Field int NotificationCompat$Builder.mProgressMax>
		//   24   48:aload_1         
		//   25   49:getfield        #61  <Field int NotificationCompat$Builder.mProgress>
		//   26   52:aload_1         
		//   27   53:getfield        #65  <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
		//   28   56:aload_1         
		//   29   57:getfield        #68  <Field boolean NotificationCompat$Builder.mUseChronometer>
		//   30   60:aload_1         
		//   31   61:getfield        #71  <Field int NotificationCompat$Builder.mPriority>
		//   32   64:aload_1         
		//   33   65:getfield        #74  <Field CharSequence NotificationCompat$Builder.mSubText>
		//   34   68:aload_1         
		//   35   69:getfield        #77  <Field boolean NotificationCompat$Builder.mLocalOnly>
		//   36   72:aload_1         
		//   37   73:getfield        #81  <Field Bundle NotificationCompat$Builder.mExtras>
		//   38   76:aload_1         
		//   39   77:getfield        #85  <Field String NotificationCompat$Builder.mGroupKey>
		//   40   80:aload_1         
		//   41   81:getfield        #88  <Field boolean NotificationCompat$Builder.mGroupSummary>
		//   42   84:aload_1         
		//   43   85:getfield        #91  <Field String NotificationCompat$Builder.mSortKey>
		//   44   88:aload_1         
		//   45   89:getfield        #94  <Field RemoteViews NotificationCompat$Builder.mContentView>
		//   46   92:aload_1         
		//   47   93:getfield        #97  <Field RemoteViews NotificationCompat$Builder.mBigContentView>
		//   48   96:invokespecial   #100 <Method void NotificationCompatJellybean$Builder(Context, Notification, CharSequence, CharSequence, CharSequence, RemoteViews, int, PendingIntent, PendingIntent, Bitmap, int, int, boolean, boolean, int, CharSequence, boolean, Bundle, String, boolean, String, RemoteViews, RemoteViews)>
		//   49   99:astore_3        
			NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
		//   50  100:aload_3         
		//   51  101:aload_1         
		//   52  102:getfield        #104 <Field ArrayList NotificationCompat$Builder.mActions>
		//   53  105:invokestatic    #108 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, ArrayList)>
			if(builder.mStyle != null)
		//*  54  108:aload_1         
		//*  55  109:getfield        #112 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*  56  112:ifnull          123
				builder.mStyle.apply(((NotificationBuilderWithBuilderAccessor) (builder1)));
		//   57  115:aload_1         
		//   58  116:getfield        #112 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//   59  119:aload_3         
		//   60  120:invokevirtual   #118 <Method void NotificationCompat$Style.apply(NotificationBuilderWithBuilderAccessor)>
			builderextender = ((BuilderExtender) (builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)))));
		//   61  123:aload_2         
		//   62  124:aload_1         
		//   63  125:aload_3         
		//   64  126:invokevirtual   #123 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
		//   65  129:astore_2        
			if(builder.mStyle != null)
		//*  66  130:aload_1         
		//*  67  131:getfield        #112 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*  68  134:ifnull          154
			{
				Bundle bundle = NotificationCompat.getExtras(((Notification) (builderextender)));
		//   69  137:aload_2         
		//   70  138:invokestatic    #127 <Method Bundle NotificationCompat.getExtras(Notification)>
		//   71  141:astore_3        
				if(bundle != null)
		//*  72  142:aload_3         
		//*  73  143:ifnull          154
					builder.mStyle.addCompatExtras(bundle);
		//   74  146:aload_1         
		//   75  147:getfield        #112 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//   76  150:aload_3         
		//   77  151:invokevirtual   #131 <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
			}
			return ((Notification) (builderextender));
		//   78  154:aload_2         
		//   79  155:areturn         
		}

		public Action getAction(Notification notification, int i)
		{
			return (Action)NotificationCompatJellybean.getAction(notification, i, Action.FACTORY, RemoteInput.FACTORY);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:getstatic       #139 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
		//    3    5:getstatic       #144 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
		//    4    8:invokestatic    #149 <Method NotificationCompatBase$Action NotificationCompatJellybean.getAction(Notification, int, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
		//    5   11:checkcast       #135 <Class NotificationCompat$Action>
		//    6   14:areturn         
		}

		public Action[] getActionsFromParcelableArrayList(ArrayList arraylist)
		{
			return (Action[])NotificationCompatJellybean.getActionsFromParcelableArrayList(arraylist, Action.FACTORY, RemoteInput.FACTORY);
		//    0    0:aload_1         
		//    1    1:getstatic       #139 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
		//    2    4:getstatic       #144 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
		//    3    7:invokestatic    #154 <Method NotificationCompatBase$Action[] NotificationCompatJellybean.getActionsFromParcelableArrayList(ArrayList, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
		//    4   10:checkcast       #156 <Class NotificationCompat$Action[]>
		//    5   13:areturn         
		}

		public ArrayList getParcelableArrayListForActions(Action aaction[])
		{
			return NotificationCompatJellybean.getParcelableArrayListForActions(((NotificationCompatBase.Action []) (aaction)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #163 <Method ArrayList NotificationCompatJellybean.getParcelableArrayListForActions(NotificationCompatBase$Action[])>
		//    2    4:areturn         
		}

		NotificationCompatApi16Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void NotificationCompat$NotificationCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class NotificationCompatApi19Impl extends NotificationCompatApi16Impl
	{

		public Notification build(Builder builder, BuilderExtender builderextender)
		{
			NotificationCompatKitKat.Builder builder1 = new NotificationCompatKitKat.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mContentView, builder.mBigContentView);
		//    0    0:new             #16  <Class NotificationCompatKitKat$Builder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:getfield        #22  <Field Context NotificationCompat$Builder.mContext>
		//    4    8:aload_1         
		//    5    9:getfield        #26  <Field Notification NotificationCompat$Builder.mNotification>
		//    6   12:aload_1         
		//    7   13:getfield        #30  <Field CharSequence NotificationCompat$Builder.mContentTitle>
		//    8   16:aload_1         
		//    9   17:getfield        #33  <Field CharSequence NotificationCompat$Builder.mContentText>
		//   10   20:aload_1         
		//   11   21:getfield        #36  <Field CharSequence NotificationCompat$Builder.mContentInfo>
		//   12   24:aload_1         
		//   13   25:getfield        #40  <Field RemoteViews NotificationCompat$Builder.mTickerView>
		//   14   28:aload_1         
		//   15   29:getfield        #44  <Field int NotificationCompat$Builder.mNumber>
		//   16   32:aload_1         
		//   17   33:getfield        #48  <Field PendingIntent NotificationCompat$Builder.mContentIntent>
		//   18   36:aload_1         
		//   19   37:getfield        #51  <Field PendingIntent NotificationCompat$Builder.mFullScreenIntent>
		//   20   40:aload_1         
		//   21   41:getfield        #55  <Field Bitmap NotificationCompat$Builder.mLargeIcon>
		//   22   44:aload_1         
		//   23   45:getfield        #58  <Field int NotificationCompat$Builder.mProgressMax>
		//   24   48:aload_1         
		//   25   49:getfield        #61  <Field int NotificationCompat$Builder.mProgress>
		//   26   52:aload_1         
		//   27   53:getfield        #65  <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
		//   28   56:aload_1         
		//   29   57:getfield        #68  <Field boolean NotificationCompat$Builder.mShowWhen>
		//   30   60:aload_1         
		//   31   61:getfield        #71  <Field boolean NotificationCompat$Builder.mUseChronometer>
		//   32   64:aload_1         
		//   33   65:getfield        #74  <Field int NotificationCompat$Builder.mPriority>
		//   34   68:aload_1         
		//   35   69:getfield        #77  <Field CharSequence NotificationCompat$Builder.mSubText>
		//   36   72:aload_1         
		//   37   73:getfield        #80  <Field boolean NotificationCompat$Builder.mLocalOnly>
		//   38   76:aload_1         
		//   39   77:getfield        #84  <Field ArrayList NotificationCompat$Builder.mPeople>
		//   40   80:aload_1         
		//   41   81:getfield        #88  <Field Bundle NotificationCompat$Builder.mExtras>
		//   42   84:aload_1         
		//   43   85:getfield        #92  <Field String NotificationCompat$Builder.mGroupKey>
		//   44   88:aload_1         
		//   45   89:getfield        #95  <Field boolean NotificationCompat$Builder.mGroupSummary>
		//   46   92:aload_1         
		//   47   93:getfield        #98  <Field String NotificationCompat$Builder.mSortKey>
		//   48   96:aload_1         
		//   49   97:getfield        #101 <Field RemoteViews NotificationCompat$Builder.mContentView>
		//   50  100:aload_1         
		//   51  101:getfield        #104 <Field RemoteViews NotificationCompat$Builder.mBigContentView>
		//   52  104:invokespecial   #107 <Method void NotificationCompatKitKat$Builder(Context, Notification, CharSequence, CharSequence, CharSequence, RemoteViews, int, PendingIntent, PendingIntent, Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, ArrayList, Bundle, String, boolean, String, RemoteViews, RemoteViews)>
		//   53  107:astore_3        
			NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
		//   54  108:aload_3         
		//   55  109:aload_1         
		//   56  110:getfield        #110 <Field ArrayList NotificationCompat$Builder.mActions>
		//   57  113:invokestatic    #114 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, ArrayList)>
			if(builder.mStyle != null)
		//*  58  116:aload_1         
		//*  59  117:getfield        #118 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*  60  120:ifnull          131
				builder.mStyle.apply(((NotificationBuilderWithBuilderAccessor) (builder1)));
		//   61  123:aload_1         
		//   62  124:getfield        #118 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//   63  127:aload_3         
		//   64  128:invokevirtual   #124 <Method void NotificationCompat$Style.apply(NotificationBuilderWithBuilderAccessor)>
			return builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)));
		//   65  131:aload_2         
		//   66  132:aload_1         
		//   67  133:aload_3         
		//   68  134:invokevirtual   #129 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
		//   69  137:areturn         
		}

		public Action getAction(Notification notification, int i)
		{
			return (Action)NotificationCompatKitKat.getAction(notification, i, Action.FACTORY, RemoteInput.FACTORY);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:getstatic       #137 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
		//    3    5:getstatic       #142 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
		//    4    8:invokestatic    #147 <Method NotificationCompatBase$Action NotificationCompatKitKat.getAction(Notification, int, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
		//    5   11:checkcast       #133 <Class NotificationCompat$Action>
		//    6   14:areturn         
		}

		NotificationCompatApi19Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void NotificationCompat$NotificationCompatApi16Impl()>
		//    2    4:return          
		}
	}

	static class NotificationCompatApi20Impl extends NotificationCompatApi19Impl
	{

		public Notification build(Builder builder, BuilderExtender builderextender)
		{
			NotificationCompatApi20.Builder builder1 = new NotificationCompatApi20.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mContentView, builder.mBigContentView, builder.mGroupAlertBehavior);
		//    0    0:new             #16  <Class NotificationCompatApi20$Builder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:getfield        #22  <Field Context NotificationCompat$Builder.mContext>
		//    4    8:aload_1         
		//    5    9:getfield        #26  <Field Notification NotificationCompat$Builder.mNotification>
		//    6   12:aload_1         
		//    7   13:getfield        #30  <Field CharSequence NotificationCompat$Builder.mContentTitle>
		//    8   16:aload_1         
		//    9   17:getfield        #33  <Field CharSequence NotificationCompat$Builder.mContentText>
		//   10   20:aload_1         
		//   11   21:getfield        #36  <Field CharSequence NotificationCompat$Builder.mContentInfo>
		//   12   24:aload_1         
		//   13   25:getfield        #40  <Field RemoteViews NotificationCompat$Builder.mTickerView>
		//   14   28:aload_1         
		//   15   29:getfield        #44  <Field int NotificationCompat$Builder.mNumber>
		//   16   32:aload_1         
		//   17   33:getfield        #48  <Field PendingIntent NotificationCompat$Builder.mContentIntent>
		//   18   36:aload_1         
		//   19   37:getfield        #51  <Field PendingIntent NotificationCompat$Builder.mFullScreenIntent>
		//   20   40:aload_1         
		//   21   41:getfield        #55  <Field Bitmap NotificationCompat$Builder.mLargeIcon>
		//   22   44:aload_1         
		//   23   45:getfield        #58  <Field int NotificationCompat$Builder.mProgressMax>
		//   24   48:aload_1         
		//   25   49:getfield        #61  <Field int NotificationCompat$Builder.mProgress>
		//   26   52:aload_1         
		//   27   53:getfield        #65  <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
		//   28   56:aload_1         
		//   29   57:getfield        #68  <Field boolean NotificationCompat$Builder.mShowWhen>
		//   30   60:aload_1         
		//   31   61:getfield        #71  <Field boolean NotificationCompat$Builder.mUseChronometer>
		//   32   64:aload_1         
		//   33   65:getfield        #74  <Field int NotificationCompat$Builder.mPriority>
		//   34   68:aload_1         
		//   35   69:getfield        #77  <Field CharSequence NotificationCompat$Builder.mSubText>
		//   36   72:aload_1         
		//   37   73:getfield        #80  <Field boolean NotificationCompat$Builder.mLocalOnly>
		//   38   76:aload_1         
		//   39   77:getfield        #84  <Field ArrayList NotificationCompat$Builder.mPeople>
		//   40   80:aload_1         
		//   41   81:getfield        #88  <Field Bundle NotificationCompat$Builder.mExtras>
		//   42   84:aload_1         
		//   43   85:getfield        #92  <Field String NotificationCompat$Builder.mGroupKey>
		//   44   88:aload_1         
		//   45   89:getfield        #95  <Field boolean NotificationCompat$Builder.mGroupSummary>
		//   46   92:aload_1         
		//   47   93:getfield        #98  <Field String NotificationCompat$Builder.mSortKey>
		//   48   96:aload_1         
		//   49   97:getfield        #101 <Field RemoteViews NotificationCompat$Builder.mContentView>
		//   50  100:aload_1         
		//   51  101:getfield        #104 <Field RemoteViews NotificationCompat$Builder.mBigContentView>
		//   52  104:aload_1         
		//   53  105:invokestatic    #108 <Method int NotificationCompat$Builder.access$000(NotificationCompat$Builder)>
		//   54  108:invokespecial   #111 <Method void NotificationCompatApi20$Builder(Context, Notification, CharSequence, CharSequence, CharSequence, RemoteViews, int, PendingIntent, PendingIntent, Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, ArrayList, Bundle, String, boolean, String, RemoteViews, RemoteViews, int)>
		//   55  111:astore_3        
			NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
		//   56  112:aload_3         
		//   57  113:aload_1         
		//   58  114:getfield        #114 <Field ArrayList NotificationCompat$Builder.mActions>
		//   59  117:invokestatic    #118 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, ArrayList)>
			if(builder.mStyle != null)
		//*  60  120:aload_1         
		//*  61  121:getfield        #122 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*  62  124:ifnull          135
				builder.mStyle.apply(((NotificationBuilderWithBuilderAccessor) (builder1)));
		//   63  127:aload_1         
		//   64  128:getfield        #122 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//   65  131:aload_3         
		//   66  132:invokevirtual   #128 <Method void NotificationCompat$Style.apply(NotificationBuilderWithBuilderAccessor)>
			builderextender = ((BuilderExtender) (builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)))));
		//   67  135:aload_2         
		//   68  136:aload_1         
		//   69  137:aload_3         
		//   70  138:invokevirtual   #133 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
		//   71  141:astore_2        
			if(builder.mStyle != null)
		//*  72  142:aload_1         
		//*  73  143:getfield        #122 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*  74  146:ifnull          160
				builder.mStyle.addCompatExtras(NotificationCompat.getExtras(((Notification) (builderextender))));
		//   75  149:aload_1         
		//   76  150:getfield        #122 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//   77  153:aload_2         
		//   78  154:invokestatic    #137 <Method Bundle NotificationCompat.getExtras(Notification)>
		//   79  157:invokevirtual   #141 <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
			return ((Notification) (builderextender));
		//   80  160:aload_2         
		//   81  161:areturn         
		}

		public Action getAction(Notification notification, int i)
		{
			return (Action)NotificationCompatApi20.getAction(notification, i, Action.FACTORY, RemoteInput.FACTORY);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:getstatic       #149 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
		//    3    5:getstatic       #154 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
		//    4    8:invokestatic    #159 <Method NotificationCompatBase$Action NotificationCompatApi20.getAction(Notification, int, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
		//    5   11:checkcast       #145 <Class NotificationCompat$Action>
		//    6   14:areturn         
		}

		public Action[] getActionsFromParcelableArrayList(ArrayList arraylist)
		{
			return (Action[])NotificationCompatApi20.getActionsFromParcelableArrayList(arraylist, Action.FACTORY, RemoteInput.FACTORY);
		//    0    0:aload_1         
		//    1    1:getstatic       #149 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
		//    2    4:getstatic       #154 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
		//    3    7:invokestatic    #164 <Method NotificationCompatBase$Action[] NotificationCompatApi20.getActionsFromParcelableArrayList(ArrayList, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
		//    4   10:checkcast       #166 <Class NotificationCompat$Action[]>
		//    5   13:areturn         
		}

		public ArrayList getParcelableArrayListForActions(Action aaction[])
		{
			return NotificationCompatApi20.getParcelableArrayListForActions(((NotificationCompatBase.Action []) (aaction)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #173 <Method ArrayList NotificationCompatApi20.getParcelableArrayListForActions(NotificationCompatBase$Action[])>
		//    2    4:areturn         
		}

		NotificationCompatApi20Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void NotificationCompat$NotificationCompatApi19Impl()>
		//    2    4:return          
		}
	}

	static class NotificationCompatApi21Impl extends NotificationCompatApi20Impl
	{

		public Notification build(Builder builder, BuilderExtender builderextender)
		{
			NotificationCompatApi21.Builder builder1 = new NotificationCompatApi21.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mCategory, builder.mPeople, builder.mExtras, builder.mColor, builder.mVisibility, builder.mPublicVersion, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mContentView, builder.mBigContentView, builder.mHeadsUpContentView, builder.mGroupAlertBehavior);
		//    0    0:new             #16  <Class NotificationCompatApi21$Builder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:getfield        #22  <Field Context NotificationCompat$Builder.mContext>
		//    4    8:aload_1         
		//    5    9:getfield        #26  <Field Notification NotificationCompat$Builder.mNotification>
		//    6   12:aload_1         
		//    7   13:getfield        #30  <Field CharSequence NotificationCompat$Builder.mContentTitle>
		//    8   16:aload_1         
		//    9   17:getfield        #33  <Field CharSequence NotificationCompat$Builder.mContentText>
		//   10   20:aload_1         
		//   11   21:getfield        #36  <Field CharSequence NotificationCompat$Builder.mContentInfo>
		//   12   24:aload_1         
		//   13   25:getfield        #40  <Field RemoteViews NotificationCompat$Builder.mTickerView>
		//   14   28:aload_1         
		//   15   29:getfield        #44  <Field int NotificationCompat$Builder.mNumber>
		//   16   32:aload_1         
		//   17   33:getfield        #48  <Field PendingIntent NotificationCompat$Builder.mContentIntent>
		//   18   36:aload_1         
		//   19   37:getfield        #51  <Field PendingIntent NotificationCompat$Builder.mFullScreenIntent>
		//   20   40:aload_1         
		//   21   41:getfield        #55  <Field Bitmap NotificationCompat$Builder.mLargeIcon>
		//   22   44:aload_1         
		//   23   45:getfield        #58  <Field int NotificationCompat$Builder.mProgressMax>
		//   24   48:aload_1         
		//   25   49:getfield        #61  <Field int NotificationCompat$Builder.mProgress>
		//   26   52:aload_1         
		//   27   53:getfield        #65  <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
		//   28   56:aload_1         
		//   29   57:getfield        #68  <Field boolean NotificationCompat$Builder.mShowWhen>
		//   30   60:aload_1         
		//   31   61:getfield        #71  <Field boolean NotificationCompat$Builder.mUseChronometer>
		//   32   64:aload_1         
		//   33   65:getfield        #74  <Field int NotificationCompat$Builder.mPriority>
		//   34   68:aload_1         
		//   35   69:getfield        #77  <Field CharSequence NotificationCompat$Builder.mSubText>
		//   36   72:aload_1         
		//   37   73:getfield        #80  <Field boolean NotificationCompat$Builder.mLocalOnly>
		//   38   76:aload_1         
		//   39   77:getfield        #84  <Field String NotificationCompat$Builder.mCategory>
		//   40   80:aload_1         
		//   41   81:getfield        #88  <Field ArrayList NotificationCompat$Builder.mPeople>
		//   42   84:aload_1         
		//   43   85:getfield        #92  <Field Bundle NotificationCompat$Builder.mExtras>
		//   44   88:aload_1         
		//   45   89:getfield        #95  <Field int NotificationCompat$Builder.mColor>
		//   46   92:aload_1         
		//   47   93:getfield        #98  <Field int NotificationCompat$Builder.mVisibility>
		//   48   96:aload_1         
		//   49   97:getfield        #101 <Field Notification NotificationCompat$Builder.mPublicVersion>
		//   50  100:aload_1         
		//   51  101:getfield        #104 <Field String NotificationCompat$Builder.mGroupKey>
		//   52  104:aload_1         
		//   53  105:getfield        #107 <Field boolean NotificationCompat$Builder.mGroupSummary>
		//   54  108:aload_1         
		//   55  109:getfield        #110 <Field String NotificationCompat$Builder.mSortKey>
		//   56  112:aload_1         
		//   57  113:getfield        #113 <Field RemoteViews NotificationCompat$Builder.mContentView>
		//   58  116:aload_1         
		//   59  117:getfield        #116 <Field RemoteViews NotificationCompat$Builder.mBigContentView>
		//   60  120:aload_1         
		//   61  121:getfield        #119 <Field RemoteViews NotificationCompat$Builder.mHeadsUpContentView>
		//   62  124:aload_1         
		//   63  125:invokestatic    #123 <Method int NotificationCompat$Builder.access$000(NotificationCompat$Builder)>
		//   64  128:invokespecial   #126 <Method void NotificationCompatApi21$Builder(Context, Notification, CharSequence, CharSequence, CharSequence, RemoteViews, int, PendingIntent, PendingIntent, Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, String, ArrayList, Bundle, int, int, Notification, String, boolean, String, RemoteViews, RemoteViews, RemoteViews, int)>
		//   65  131:astore_3        
			NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
		//   66  132:aload_3         
		//   67  133:aload_1         
		//   68  134:getfield        #129 <Field ArrayList NotificationCompat$Builder.mActions>
		//   69  137:invokestatic    #133 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, ArrayList)>
			if(builder.mStyle != null)
		//*  70  140:aload_1         
		//*  71  141:getfield        #137 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*  72  144:ifnull          155
				builder.mStyle.apply(((NotificationBuilderWithBuilderAccessor) (builder1)));
		//   73  147:aload_1         
		//   74  148:getfield        #137 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//   75  151:aload_3         
		//   76  152:invokevirtual   #143 <Method void NotificationCompat$Style.apply(NotificationBuilderWithBuilderAccessor)>
			builderextender = ((BuilderExtender) (builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)))));
		//   77  155:aload_2         
		//   78  156:aload_1         
		//   79  157:aload_3         
		//   80  158:invokevirtual   #148 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
		//   81  161:astore_2        
			if(builder.mStyle != null)
		//*  82  162:aload_1         
		//*  83  163:getfield        #137 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*  84  166:ifnull          180
				builder.mStyle.addCompatExtras(NotificationCompat.getExtras(((Notification) (builderextender))));
		//   85  169:aload_1         
		//   86  170:getfield        #137 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//   87  173:aload_2         
		//   88  174:invokestatic    #152 <Method Bundle NotificationCompat.getExtras(Notification)>
		//   89  177:invokevirtual   #156 <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
			return ((Notification) (builderextender));
		//   90  180:aload_2         
		//   91  181:areturn         
		}

		public Bundle getBundleForUnreadConversation(NotificationCompatBase.UnreadConversation unreadconversation)
		{
			return NotificationCompatApi21.getBundleForUnreadConversation(unreadconversation);
		//    0    0:aload_1         
		//    1    1:invokestatic    #162 <Method Bundle NotificationCompatApi21.getBundleForUnreadConversation(NotificationCompatBase$UnreadConversation)>
		//    2    4:areturn         
		}

		public NotificationCompatBase.UnreadConversation getUnreadConversationFromBundle(Bundle bundle, NotificationCompatBase.UnreadConversation.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
		{
			return NotificationCompatApi21.getUnreadConversationFromBundle(bundle, factory, factory1);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokestatic    #166 <Method NotificationCompatBase$UnreadConversation NotificationCompatApi21.getUnreadConversationFromBundle(Bundle, NotificationCompatBase$UnreadConversation$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
		//    4    6:areturn         
		}

		NotificationCompatApi21Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void NotificationCompat$NotificationCompatApi20Impl()>
		//    2    4:return          
		}
	}

	static class NotificationCompatApi24Impl extends NotificationCompatApi21Impl
	{

		public Notification build(Builder builder, BuilderExtender builderextender)
		{
			NotificationCompatApi24.Builder builder1 = new NotificationCompatApi24.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mCategory, builder.mPeople, builder.mExtras, builder.mColor, builder.mVisibility, builder.mPublicVersion, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mRemoteInputHistory, builder.mContentView, builder.mBigContentView, builder.mHeadsUpContentView, builder.mGroupAlertBehavior);
		//    0    0:new             #16  <Class NotificationCompatApi24$Builder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:getfield        #22  <Field Context NotificationCompat$Builder.mContext>
		//    4    8:aload_1         
		//    5    9:getfield        #26  <Field Notification NotificationCompat$Builder.mNotification>
		//    6   12:aload_1         
		//    7   13:getfield        #30  <Field CharSequence NotificationCompat$Builder.mContentTitle>
		//    8   16:aload_1         
		//    9   17:getfield        #33  <Field CharSequence NotificationCompat$Builder.mContentText>
		//   10   20:aload_1         
		//   11   21:getfield        #36  <Field CharSequence NotificationCompat$Builder.mContentInfo>
		//   12   24:aload_1         
		//   13   25:getfield        #40  <Field RemoteViews NotificationCompat$Builder.mTickerView>
		//   14   28:aload_1         
		//   15   29:getfield        #44  <Field int NotificationCompat$Builder.mNumber>
		//   16   32:aload_1         
		//   17   33:getfield        #48  <Field PendingIntent NotificationCompat$Builder.mContentIntent>
		//   18   36:aload_1         
		//   19   37:getfield        #51  <Field PendingIntent NotificationCompat$Builder.mFullScreenIntent>
		//   20   40:aload_1         
		//   21   41:getfield        #55  <Field Bitmap NotificationCompat$Builder.mLargeIcon>
		//   22   44:aload_1         
		//   23   45:getfield        #58  <Field int NotificationCompat$Builder.mProgressMax>
		//   24   48:aload_1         
		//   25   49:getfield        #61  <Field int NotificationCompat$Builder.mProgress>
		//   26   52:aload_1         
		//   27   53:getfield        #65  <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
		//   28   56:aload_1         
		//   29   57:getfield        #68  <Field boolean NotificationCompat$Builder.mShowWhen>
		//   30   60:aload_1         
		//   31   61:getfield        #71  <Field boolean NotificationCompat$Builder.mUseChronometer>
		//   32   64:aload_1         
		//   33   65:getfield        #74  <Field int NotificationCompat$Builder.mPriority>
		//   34   68:aload_1         
		//   35   69:getfield        #77  <Field CharSequence NotificationCompat$Builder.mSubText>
		//   36   72:aload_1         
		//   37   73:getfield        #80  <Field boolean NotificationCompat$Builder.mLocalOnly>
		//   38   76:aload_1         
		//   39   77:getfield        #84  <Field String NotificationCompat$Builder.mCategory>
		//   40   80:aload_1         
		//   41   81:getfield        #88  <Field ArrayList NotificationCompat$Builder.mPeople>
		//   42   84:aload_1         
		//   43   85:getfield        #92  <Field Bundle NotificationCompat$Builder.mExtras>
		//   44   88:aload_1         
		//   45   89:getfield        #95  <Field int NotificationCompat$Builder.mColor>
		//   46   92:aload_1         
		//   47   93:getfield        #98  <Field int NotificationCompat$Builder.mVisibility>
		//   48   96:aload_1         
		//   49   97:getfield        #101 <Field Notification NotificationCompat$Builder.mPublicVersion>
		//   50  100:aload_1         
		//   51  101:getfield        #104 <Field String NotificationCompat$Builder.mGroupKey>
		//   52  104:aload_1         
		//   53  105:getfield        #107 <Field boolean NotificationCompat$Builder.mGroupSummary>
		//   54  108:aload_1         
		//   55  109:getfield        #110 <Field String NotificationCompat$Builder.mSortKey>
		//   56  112:aload_1         
		//   57  113:getfield        #114 <Field CharSequence[] NotificationCompat$Builder.mRemoteInputHistory>
		//   58  116:aload_1         
		//   59  117:getfield        #117 <Field RemoteViews NotificationCompat$Builder.mContentView>
		//   60  120:aload_1         
		//   61  121:getfield        #120 <Field RemoteViews NotificationCompat$Builder.mBigContentView>
		//   62  124:aload_1         
		//   63  125:getfield        #123 <Field RemoteViews NotificationCompat$Builder.mHeadsUpContentView>
		//   64  128:aload_1         
		//   65  129:invokestatic    #127 <Method int NotificationCompat$Builder.access$000(NotificationCompat$Builder)>
		//   66  132:invokespecial   #130 <Method void NotificationCompatApi24$Builder(Context, Notification, CharSequence, CharSequence, CharSequence, RemoteViews, int, PendingIntent, PendingIntent, Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, String, ArrayList, Bundle, int, int, Notification, String, boolean, String, CharSequence[], RemoteViews, RemoteViews, RemoteViews, int)>
		//   67  135:astore_3        
			NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
		//   68  136:aload_3         
		//   69  137:aload_1         
		//   70  138:getfield        #133 <Field ArrayList NotificationCompat$Builder.mActions>
		//   71  141:invokestatic    #137 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, ArrayList)>
			if(builder.mStyle != null)
		//*  72  144:aload_1         
		//*  73  145:getfield        #141 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*  74  148:ifnull          159
				builder.mStyle.apply(((NotificationBuilderWithBuilderAccessor) (builder1)));
		//   75  151:aload_1         
		//   76  152:getfield        #141 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//   77  155:aload_3         
		//   78  156:invokevirtual   #147 <Method void NotificationCompat$Style.apply(NotificationBuilderWithBuilderAccessor)>
			builderextender = ((BuilderExtender) (builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)))));
		//   79  159:aload_2         
		//   80  160:aload_1         
		//   81  161:aload_3         
		//   82  162:invokevirtual   #152 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
		//   83  165:astore_2        
			if(builder.mStyle != null)
		//*  84  166:aload_1         
		//*  85  167:getfield        #141 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*  86  170:ifnull          184
				builder.mStyle.addCompatExtras(NotificationCompat.getExtras(((Notification) (builderextender))));
		//   87  173:aload_1         
		//   88  174:getfield        #141 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//   89  177:aload_2         
		//   90  178:invokestatic    #156 <Method Bundle NotificationCompat.getExtras(Notification)>
		//   91  181:invokevirtual   #160 <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
			return ((Notification) (builderextender));
		//   92  184:aload_2         
		//   93  185:areturn         
		}

		public Action getAction(Notification notification, int i)
		{
			return (Action)NotificationCompatApi24.getAction(notification, i, Action.FACTORY, RemoteInput.FACTORY);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:getstatic       #168 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
		//    3    5:getstatic       #173 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
		//    4    8:invokestatic    #178 <Method NotificationCompatBase$Action NotificationCompatApi24.getAction(Notification, int, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
		//    5   11:checkcast       #164 <Class NotificationCompat$Action>
		//    6   14:areturn         
		}

		public Action[] getActionsFromParcelableArrayList(ArrayList arraylist)
		{
			return (Action[])NotificationCompatApi24.getActionsFromParcelableArrayList(arraylist, Action.FACTORY, RemoteInput.FACTORY);
		//    0    0:aload_1         
		//    1    1:getstatic       #168 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
		//    2    4:getstatic       #173 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
		//    3    7:invokestatic    #183 <Method NotificationCompatBase$Action[] NotificationCompatApi24.getActionsFromParcelableArrayList(ArrayList, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
		//    4   10:checkcast       #185 <Class NotificationCompat$Action[]>
		//    5   13:areturn         
		}

		public ArrayList getParcelableArrayListForActions(Action aaction[])
		{
			return NotificationCompatApi24.getParcelableArrayListForActions(((NotificationCompatBase.Action []) (aaction)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #192 <Method ArrayList NotificationCompatApi24.getParcelableArrayListForActions(NotificationCompatBase$Action[])>
		//    2    4:areturn         
		}

		NotificationCompatApi24Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void NotificationCompat$NotificationCompatApi21Impl()>
		//    2    4:return          
		}
	}

	static class NotificationCompatApi26Impl extends NotificationCompatApi24Impl
	{

		public Notification build(Builder builder, BuilderExtender builderextender)
		{
			NotificationCompatApi26.Builder builder1 = new NotificationCompatApi26.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mCategory, builder.mPeople, builder.mExtras, builder.mColor, builder.mVisibility, builder.mPublicVersion, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mRemoteInputHistory, builder.mContentView, builder.mBigContentView, builder.mHeadsUpContentView, builder.mChannelId, builder.mBadgeIcon, builder.mShortcutId, builder.mTimeout, builder.mColorized, builder.mColorizedSet, builder.mGroupAlertBehavior);
		//    0    0:new             #16  <Class NotificationCompatApi26$Builder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:getfield        #22  <Field Context NotificationCompat$Builder.mContext>
		//    4    8:aload_1         
		//    5    9:getfield        #26  <Field Notification NotificationCompat$Builder.mNotification>
		//    6   12:aload_1         
		//    7   13:getfield        #30  <Field CharSequence NotificationCompat$Builder.mContentTitle>
		//    8   16:aload_1         
		//    9   17:getfield        #33  <Field CharSequence NotificationCompat$Builder.mContentText>
		//   10   20:aload_1         
		//   11   21:getfield        #36  <Field CharSequence NotificationCompat$Builder.mContentInfo>
		//   12   24:aload_1         
		//   13   25:getfield        #40  <Field RemoteViews NotificationCompat$Builder.mTickerView>
		//   14   28:aload_1         
		//   15   29:getfield        #44  <Field int NotificationCompat$Builder.mNumber>
		//   16   32:aload_1         
		//   17   33:getfield        #48  <Field PendingIntent NotificationCompat$Builder.mContentIntent>
		//   18   36:aload_1         
		//   19   37:getfield        #51  <Field PendingIntent NotificationCompat$Builder.mFullScreenIntent>
		//   20   40:aload_1         
		//   21   41:getfield        #55  <Field Bitmap NotificationCompat$Builder.mLargeIcon>
		//   22   44:aload_1         
		//   23   45:getfield        #58  <Field int NotificationCompat$Builder.mProgressMax>
		//   24   48:aload_1         
		//   25   49:getfield        #61  <Field int NotificationCompat$Builder.mProgress>
		//   26   52:aload_1         
		//   27   53:getfield        #65  <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
		//   28   56:aload_1         
		//   29   57:getfield        #68  <Field boolean NotificationCompat$Builder.mShowWhen>
		//   30   60:aload_1         
		//   31   61:getfield        #71  <Field boolean NotificationCompat$Builder.mUseChronometer>
		//   32   64:aload_1         
		//   33   65:getfield        #74  <Field int NotificationCompat$Builder.mPriority>
		//   34   68:aload_1         
		//   35   69:getfield        #77  <Field CharSequence NotificationCompat$Builder.mSubText>
		//   36   72:aload_1         
		//   37   73:getfield        #80  <Field boolean NotificationCompat$Builder.mLocalOnly>
		//   38   76:aload_1         
		//   39   77:getfield        #84  <Field String NotificationCompat$Builder.mCategory>
		//   40   80:aload_1         
		//   41   81:getfield        #88  <Field ArrayList NotificationCompat$Builder.mPeople>
		//   42   84:aload_1         
		//   43   85:getfield        #92  <Field Bundle NotificationCompat$Builder.mExtras>
		//   44   88:aload_1         
		//   45   89:getfield        #95  <Field int NotificationCompat$Builder.mColor>
		//   46   92:aload_1         
		//   47   93:getfield        #98  <Field int NotificationCompat$Builder.mVisibility>
		//   48   96:aload_1         
		//   49   97:getfield        #101 <Field Notification NotificationCompat$Builder.mPublicVersion>
		//   50  100:aload_1         
		//   51  101:getfield        #104 <Field String NotificationCompat$Builder.mGroupKey>
		//   52  104:aload_1         
		//   53  105:getfield        #107 <Field boolean NotificationCompat$Builder.mGroupSummary>
		//   54  108:aload_1         
		//   55  109:getfield        #110 <Field String NotificationCompat$Builder.mSortKey>
		//   56  112:aload_1         
		//   57  113:getfield        #114 <Field CharSequence[] NotificationCompat$Builder.mRemoteInputHistory>
		//   58  116:aload_1         
		//   59  117:getfield        #117 <Field RemoteViews NotificationCompat$Builder.mContentView>
		//   60  120:aload_1         
		//   61  121:getfield        #120 <Field RemoteViews NotificationCompat$Builder.mBigContentView>
		//   62  124:aload_1         
		//   63  125:getfield        #123 <Field RemoteViews NotificationCompat$Builder.mHeadsUpContentView>
		//   64  128:aload_1         
		//   65  129:getfield        #126 <Field String NotificationCompat$Builder.mChannelId>
		//   66  132:aload_1         
		//   67  133:getfield        #129 <Field int NotificationCompat$Builder.mBadgeIcon>
		//   68  136:aload_1         
		//   69  137:getfield        #132 <Field String NotificationCompat$Builder.mShortcutId>
		//   70  140:aload_1         
		//   71  141:getfield        #136 <Field long NotificationCompat$Builder.mTimeout>
		//   72  144:aload_1         
		//   73  145:getfield        #139 <Field boolean NotificationCompat$Builder.mColorized>
		//   74  148:aload_1         
		//   75  149:getfield        #142 <Field boolean NotificationCompat$Builder.mColorizedSet>
		//   76  152:aload_1         
		//   77  153:invokestatic    #146 <Method int NotificationCompat$Builder.access$000(NotificationCompat$Builder)>
		//   78  156:invokespecial   #149 <Method void NotificationCompatApi26$Builder(Context, Notification, CharSequence, CharSequence, CharSequence, RemoteViews, int, PendingIntent, PendingIntent, Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, String, ArrayList, Bundle, int, int, Notification, String, boolean, String, CharSequence[], RemoteViews, RemoteViews, RemoteViews, String, int, String, long, boolean, boolean, int)>
		//   79  159:astore_3        
			NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
		//   80  160:aload_3         
		//   81  161:aload_1         
		//   82  162:getfield        #152 <Field ArrayList NotificationCompat$Builder.mActions>
		//   83  165:invokestatic    #156 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, ArrayList)>
			if(builder.mStyle != null)
		//*  84  168:aload_1         
		//*  85  169:getfield        #160 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*  86  172:ifnull          183
				builder.mStyle.apply(((NotificationBuilderWithBuilderAccessor) (builder1)));
		//   87  175:aload_1         
		//   88  176:getfield        #160 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//   89  179:aload_3         
		//   90  180:invokevirtual   #166 <Method void NotificationCompat$Style.apply(NotificationBuilderWithBuilderAccessor)>
			builderextender = ((BuilderExtender) (builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)))));
		//   91  183:aload_2         
		//   92  184:aload_1         
		//   93  185:aload_3         
		//   94  186:invokevirtual   #171 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
		//   95  189:astore_2        
			if(builder.mStyle != null)
		//*  96  190:aload_1         
		//*  97  191:getfield        #160 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//*  98  194:ifnull          208
				builder.mStyle.addCompatExtras(NotificationCompat.getExtras(((Notification) (builderextender))));
		//   99  197:aload_1         
		//  100  198:getfield        #160 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
		//  101  201:aload_2         
		//  102  202:invokestatic    #175 <Method Bundle NotificationCompat.getExtras(Notification)>
		//  103  205:invokevirtual   #179 <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
			return ((Notification) (builderextender));
		//  104  208:aload_2         
		//  105  209:areturn         
		}

		NotificationCompatApi26Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void NotificationCompat$NotificationCompatApi24Impl()>
		//    2    4:return          
		}
	}

	static class NotificationCompatBaseImpl
		implements NotificationCompatImpl
	{

		public Notification build(Builder builder, BuilderExtender builderextender)
		{
			return builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (new BuilderBase(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate))));
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:new             #11  <Class NotificationCompat$NotificationCompatBaseImpl$BuilderBase>
		//    3    5:dup             
		//    4    6:aload_1         
		//    5    7:getfield        #25  <Field Context NotificationCompat$Builder.mContext>
		//    6   10:aload_1         
		//    7   11:getfield        #29  <Field Notification NotificationCompat$Builder.mNotification>
		//    8   14:aload_1         
		//    9   15:getfield        #33  <Field CharSequence NotificationCompat$Builder.mContentTitle>
		//   10   18:aload_1         
		//   11   19:getfield        #36  <Field CharSequence NotificationCompat$Builder.mContentText>
		//   12   22:aload_1         
		//   13   23:getfield        #39  <Field CharSequence NotificationCompat$Builder.mContentInfo>
		//   14   26:aload_1         
		//   15   27:getfield        #43  <Field RemoteViews NotificationCompat$Builder.mTickerView>
		//   16   30:aload_1         
		//   17   31:getfield        #47  <Field int NotificationCompat$Builder.mNumber>
		//   18   34:aload_1         
		//   19   35:getfield        #51  <Field PendingIntent NotificationCompat$Builder.mContentIntent>
		//   20   38:aload_1         
		//   21   39:getfield        #54  <Field PendingIntent NotificationCompat$Builder.mFullScreenIntent>
		//   22   42:aload_1         
		//   23   43:getfield        #58  <Field Bitmap NotificationCompat$Builder.mLargeIcon>
		//   24   46:aload_1         
		//   25   47:getfield        #61  <Field int NotificationCompat$Builder.mProgressMax>
		//   26   50:aload_1         
		//   27   51:getfield        #64  <Field int NotificationCompat$Builder.mProgress>
		//   28   54:aload_1         
		//   29   55:getfield        #68  <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
		//   30   58:invokespecial   #71  <Method void NotificationCompat$NotificationCompatBaseImpl$BuilderBase(Context, Notification, CharSequence, CharSequence, CharSequence, RemoteViews, int, PendingIntent, PendingIntent, Bitmap, int, int, boolean)>
		//   31   61:invokevirtual   #76  <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
		//   32   64:areturn         
		}

		public Action getAction(Notification notification, int i)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Action[] getActionsFromParcelableArrayList(ArrayList arraylist)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Bundle getBundleForUnreadConversation(NotificationCompatBase.UnreadConversation unreadconversation)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public ArrayList getParcelableArrayListForActions(Action aaction[])
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public NotificationCompatBase.UnreadConversation getUnreadConversationFromBundle(Bundle bundle, NotificationCompatBase.UnreadConversation.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		NotificationCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class NotificationCompatBaseImpl.BuilderBase
		implements NotificationBuilderWithBuilderAccessor
	{

		public Notification build()
		{
			return mBuilder.getNotification();
		//    0    0:aload_0         
		//    1    1:getfield        #151 <Field android.app.Notification$Builder mBuilder>
		//    2    4:invokevirtual   #157 <Method Notification android.app.Notification$Builder.getNotification()>
		//    3    7:areturn         
		}

		public android.app.Notification.Builder getBuilder()
		{
			return mBuilder;
		//    0    0:aload_0         
		//    1    1:getfield        #151 <Field android.app.Notification$Builder mBuilder>
		//    2    4:areturn         
		}

		private android.app.Notification.Builder mBuilder;

		NotificationCompatBaseImpl.BuilderBase(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
				PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
		//    2    4:new             #21  <Class android.app.Notification$Builder>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #24  <Method void android.app.Notification$Builder(Context)>
		//    6   12:aload_2         
		//    7   13:getfield        #30  <Field long Notification.when>
		//    8   16:invokevirtual   #34  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
		//    9   19:aload_2         
		//   10   20:getfield        #38  <Field int Notification.icon>
		//   11   23:aload_2         
		//   12   24:getfield        #41  <Field int Notification.iconLevel>
		//   13   27:invokevirtual   #45  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
		//   14   30:aload_2         
		//   15   31:getfield        #49  <Field RemoteViews Notification.contentView>
		//   16   34:invokevirtual   #53  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
		//   17   37:aload_2         
		//   18   38:getfield        #57  <Field CharSequence Notification.tickerText>
		//   19   41:aload           6
		//   20   43:invokevirtual   #61  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
		//   21   46:aload_2         
		//   22   47:getfield        #65  <Field Uri Notification.sound>
		//   23   50:aload_2         
		//   24   51:getfield        #68  <Field int Notification.audioStreamType>
		//   25   54:invokevirtual   #72  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(Uri, int)>
		//   26   57:aload_2         
		//   27   58:getfield        #76  <Field long[] Notification.vibrate>
		//   28   61:invokevirtual   #80  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
		//   29   64:aload_2         
		//   30   65:getfield        #83  <Field int Notification.ledARGB>
		//   31   68:aload_2         
		//   32   69:getfield        #86  <Field int Notification.ledOnMS>
		//   33   72:aload_2         
		//   34   73:getfield        #89  <Field int Notification.ledOffMS>
		//   35   76:invokevirtual   #93  <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
		//   36   79:astore_1        
			int l = notification.flags;
		//   37   80:aload_2         
		//   38   81:getfield        #96  <Field int Notification.flags>
		//   39   84:istore          14
			boolean flag2 = false;
		//   40   86:iconst_0        
		//   41   87:istore          16
			boolean flag1;
			if((l & 2) != 0)
		//*  42   89:iload           14
		//*  43   91:iconst_2        
		//*  44   92:iand            
		//*  45   93:ifeq            102
				flag1 = true;
		//   46   96:iconst_1        
		//   47   97:istore          15
			else
		//*  48   99:goto            105
				flag1 = false;
		//   49  102:iconst_0        
		//   50  103:istore          15
			context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
		//   51  105:aload_1         
		//   52  106:iload           15
		//   53  108:invokevirtual   #100 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//   54  111:astore_1        
			if((notification.flags & 8) != 0)
		//*  55  112:aload_2         
		//*  56  113:getfield        #96  <Field int Notification.flags>
		//*  57  116:bipush          8
		//*  58  118:iand            
		//*  59  119:ifeq            128
				flag1 = true;
		//   60  122:iconst_1        
		//   61  123:istore          15
			else
		//*  62  125:goto            131
				flag1 = false;
		//   63  128:iconst_0        
		//   64  129:istore          15
			context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
		//   65  131:aload_1         
		//   66  132:iload           15
		//   67  134:invokevirtual   #103 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//   68  137:astore_1        
			if((notification.flags & 0x10) != 0)
		//*  69  138:aload_2         
		//*  70  139:getfield        #96  <Field int Notification.flags>
		//*  71  142:bipush          16
		//*  72  144:iand            
		//*  73  145:ifeq            154
				flag1 = true;
		//   74  148:iconst_1        
		//   75  149:istore          15
			else
		//*  76  151:goto            157
				flag1 = false;
		//   77  154:iconst_0        
		//   78  155:istore          15
			context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
		//   79  157:aload_1         
		//   80  158:iload           15
		//   81  160:invokevirtual   #106 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//   82  163:aload_2         
		//   83  164:getfield        #109 <Field int Notification.defaults>
		//   84  167:invokevirtual   #113 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//   85  170:aload_3         
		//   86  171:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//   87  174:aload           4
		//   88  176:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//   89  179:aload           5
		//   90  181:invokevirtual   #123 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//   91  184:aload           8
		//   92  186:invokevirtual   #127 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//   93  189:aload_2         
		//   94  190:getfield        #131 <Field PendingIntent Notification.deleteIntent>
		//   95  193:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//   96  196:astore_1        
			if((notification.flags & 0x80) != 0)
		//*  97  197:aload_2         
		//*  98  198:getfield        #96  <Field int Notification.flags>
		//*  99  201:sipush          128
		//* 100  204:iand            
		//* 101  205:ifeq            214
				flag1 = true;
		//  102  208:iconst_1        
		//  103  209:istore          15
			else
		//* 104  211:goto            218
				flag1 = flag2;
		//  105  214:iload           16
		//  106  216:istore          15
			mBuilder = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setProgress(j, k, flag);
		//  107  218:aload_0         
		//  108  219:aload_1         
		//  109  220:aload           9
		//  110  222:iload           15
		//  111  224:invokevirtual   #138 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//  112  227:aload           10
		//  113  229:invokevirtual   #142 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//  114  232:iload           7
		//  115  234:invokevirtual   #145 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//  116  237:iload           11
		//  117  239:iload           12
		//  118  241:iload           13
		//  119  243:invokevirtual   #149 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//  120  246:putfield        #151 <Field android.app.Notification$Builder mBuilder>
		//  121  249:return          
		}
	}

	static interface NotificationCompatImpl
	{

		public abstract Notification build(Builder builder, BuilderExtender builderextender);

		public abstract Action getAction(Notification notification, int i);

		public abstract Action[] getActionsFromParcelableArrayList(ArrayList arraylist);

		public abstract Bundle getBundleForUnreadConversation(NotificationCompatBase.UnreadConversation unreadconversation);

		public abstract ArrayList getParcelableArrayListForActions(Action aaction[]);

		public abstract NotificationCompatBase.UnreadConversation getUnreadConversationFromBundle(Bundle bundle, NotificationCompatBase.UnreadConversation.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1);
	}

	public static interface NotificationVisibility
		extends Annotation
	{
	}

	public static abstract class Style
	{

		private int calculateTopPadding()
		{
			Resources resources = mBuilder.mContext.getResources();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//    2    4:getfield        #31  <Field Context NotificationCompat$Builder.mContext>
		//    3    7:invokevirtual   #37  <Method Resources Context.getResources()>
		//    4   10:astore          4
			int i = resources.getDimensionPixelSize(android.support.a.a.b.notification_top_pad);
		//    5   12:aload           4
		//    6   14:getstatic       #43  <Field int android.support.a.a$b.notification_top_pad>
		//    7   17:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
		//    8   20:istore_2        
			int j = resources.getDimensionPixelSize(android.support.a.a.b.notification_top_pad_large_text);
		//    9   21:aload           4
		//   10   23:getstatic       #52  <Field int android.support.a.a$b.notification_top_pad_large_text>
		//   11   26:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
		//   12   29:istore_3        
			float f = (constrain(resources.getConfiguration().fontScale, 1.0F, 1.3F) - 1.0F) / 0.3F;
		//   13   30:aload           4
		//   14   32:invokevirtual   #56  <Method Configuration Resources.getConfiguration()>
		//   15   35:getfield        #62  <Field float Configuration.fontScale>
		//   16   38:fconst_1        
		//   17   39:ldc1            #63  <Float 1.3F>
		//   18   41:invokestatic    #67  <Method float constrain(float, float, float)>
		//   19   44:fconst_1        
		//   20   45:fsub            
		//   21   46:ldc1            #68  <Float 0.3F>
		//   22   48:fdiv            
		//   23   49:fstore_1        
			return Math.round((1.0F - f) * (float)i + f * (float)j);
		//   24   50:fconst_1        
		//   25   51:fload_1         
		//   26   52:fsub            
		//   27   53:iload_2         
		//   28   54:i2f             
		//   29   55:fmul            
		//   30   56:fload_1         
		//   31   57:iload_3         
		//   32   58:i2f             
		//   33   59:fmul            
		//   34   60:fadd            
		//   35   61:invokestatic    #74  <Method int Math.round(float)>
		//   36   64:ireturn         
		}

		private static float constrain(float f, float f1, float f2)
		{
			if(f < f1)
		//*   0    0:fload_0         
		//*   1    1:fload_1         
		//*   2    2:fcmpg           
		//*   3    3:ifge            8
				return f1;
		//    4    6:fload_1         
		//    5    7:freturn         
			f1 = f;
		//    6    8:fload_0         
		//    7    9:fstore_1        
			if(f > f2)
		//*   8   10:fload_0         
		//*   9   11:fload_2         
		//*  10   12:fcmpl           
		//*  11   13:ifle            18
				f1 = f2;
		//   12   16:fload_2         
		//   13   17:fstore_1        
			return f1;
		//   14   18:fload_1         
		//   15   19:freturn         
		}

		private Bitmap createColoredBitmap(int i, int j, int k)
		{
			Drawable drawable = mBuilder.mContext.getResources().getDrawable(i);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//    2    4:getfield        #31  <Field Context NotificationCompat$Builder.mContext>
		//    3    7:invokevirtual   #37  <Method Resources Context.getResources()>
		//    4   10:iload_1         
		//    5   11:invokevirtual   #80  <Method Drawable Resources.getDrawable(int)>
		//    6   14:astore          5
			if(k == 0)
		//*   7   16:iload_3         
		//*   8   17:ifne            29
				i = drawable.getIntrinsicWidth();
		//    9   20:aload           5
		//   10   22:invokevirtual   #85  <Method int Drawable.getIntrinsicWidth()>
		//   11   25:istore_1        
			else
		//*  12   26:goto            31
				i = k;
		//   13   29:iload_3         
		//   14   30:istore_1        
			int l = k;
		//   15   31:iload_3         
		//   16   32:istore          4
			if(k == 0)
		//*  17   34:iload_3         
		//*  18   35:ifne            45
				l = drawable.getIntrinsicHeight();
		//   19   38:aload           5
		//   20   40:invokevirtual   #88  <Method int Drawable.getIntrinsicHeight()>
		//   21   43:istore          4
			Bitmap bitmap = Bitmap.createBitmap(i, l, android.graphics.Bitmap.Config.ARGB_8888);
		//   22   45:iload_1         
		//   23   46:iload           4
		//   24   48:getstatic       #94  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
		//   25   51:invokestatic    #100 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
		//   26   54:astore          6
			drawable.setBounds(0, 0, i, l);
		//   27   56:aload           5
		//   28   58:iconst_0        
		//   29   59:iconst_0        
		//   30   60:iload_1         
		//   31   61:iload           4
		//   32   63:invokevirtual   #104 <Method void Drawable.setBounds(int, int, int, int)>
			if(j != 0)
		//*  33   66:iload_2         
		//*  34   67:ifeq            89
				drawable.mutate().setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(j, android.graphics.PorterDuff.Mode.SRC_IN))));
		//   35   70:aload           5
		//   36   72:invokevirtual   #108 <Method Drawable Drawable.mutate()>
		//   37   75:new             #110 <Class PorterDuffColorFilter>
		//   38   78:dup             
		//   39   79:iload_2         
		//   40   80:getstatic       #116 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
		//   41   83:invokespecial   #119 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
		//   42   86:invokevirtual   #123 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
			drawable.draw(new Canvas(bitmap));
		//   43   89:aload           5
		//   44   91:new             #125 <Class Canvas>
		//   45   94:dup             
		//   46   95:aload           6
		//   47   97:invokespecial   #128 <Method void Canvas(Bitmap)>
		//   48  100:invokevirtual   #132 <Method void Drawable.draw(Canvas)>
			return bitmap;
		//   49  103:aload           6
		//   50  105:areturn         
		}

		private Bitmap createIconWithBackground(int i, int j, int k, int l)
		{
			int j1 = android.support.a.a.c.notification_icon_background;
		//    0    0:getstatic       #139 <Field int android.support.a.a$c.notification_icon_background>
		//    1    3:istore          6
			int i1 = l;
		//    2    5:iload           4
		//    3    7:istore          5
			if(l == 0)
		//*   4    9:iload           4
		//*   5   11:ifne            17
				i1 = 0;
		//    6   14:iconst_0        
		//    7   15:istore          5
			Bitmap bitmap = createColoredBitmap(j1, i1, j);
		//    8   17:aload_0         
		//    9   18:iload           6
		//   10   20:iload           5
		//   11   22:iload_2         
		//   12   23:invokespecial   #141 <Method Bitmap createColoredBitmap(int, int, int)>
		//   13   26:astore          7
			Canvas canvas = new Canvas(bitmap);
		//   14   28:new             #125 <Class Canvas>
		//   15   31:dup             
		//   16   32:aload           7
		//   17   34:invokespecial   #128 <Method void Canvas(Bitmap)>
		//   18   37:astore          8
			Drawable drawable = mBuilder.mContext.getResources().getDrawable(i).mutate();
		//   19   39:aload_0         
		//   20   40:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//   21   43:getfield        #31  <Field Context NotificationCompat$Builder.mContext>
		//   22   46:invokevirtual   #37  <Method Resources Context.getResources()>
		//   23   49:iload_1         
		//   24   50:invokevirtual   #80  <Method Drawable Resources.getDrawable(int)>
		//   25   53:invokevirtual   #108 <Method Drawable Drawable.mutate()>
		//   26   56:astore          9
			drawable.setFilterBitmap(true);
		//   27   58:aload           9
		//   28   60:iconst_1        
		//   29   61:invokevirtual   #145 <Method void Drawable.setFilterBitmap(boolean)>
			i = (j - k) / 2;
		//   30   64:iload_2         
		//   31   65:iload_3         
		//   32   66:isub            
		//   33   67:iconst_2        
		//   34   68:idiv            
		//   35   69:istore_1        
			j = k + i;
		//   36   70:iload_3         
		//   37   71:iload_1         
		//   38   72:iadd            
		//   39   73:istore_2        
			drawable.setBounds(i, i, j, j);
		//   40   74:aload           9
		//   41   76:iload_1         
		//   42   77:iload_1         
		//   43   78:iload_2         
		//   44   79:iload_2         
		//   45   80:invokevirtual   #104 <Method void Drawable.setBounds(int, int, int, int)>
			drawable.setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP))));
		//   46   83:aload           9
		//   47   85:new             #110 <Class PorterDuffColorFilter>
		//   48   88:dup             
		//   49   89:iconst_m1       
		//   50   90:getstatic       #148 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_ATOP>
		//   51   93:invokespecial   #119 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
		//   52   96:invokevirtual   #123 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
			drawable.draw(canvas);
		//   53   99:aload           9
		//   54  101:aload           8
		//   55  103:invokevirtual   #132 <Method void Drawable.draw(Canvas)>
			return bitmap;
		//   56  106:aload           7
		//   57  108:areturn         
		}

		private void hideNormalContent(RemoteViews remoteviews)
		{
			remoteviews.setViewVisibility(android.support.a.a.d.title, 8);
		//    0    0:aload_1         
		//    1    1:getstatic       #155 <Field int android.support.a.a$d.title>
		//    2    4:bipush          8
		//    3    6:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
			remoteviews.setViewVisibility(android.support.a.a.d.text2, 8);
		//    4    9:aload_1         
		//    5   10:getstatic       #164 <Field int android.support.a.a$d.text2>
		//    6   13:bipush          8
		//    7   15:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
			remoteviews.setViewVisibility(android.support.a.a.d.text, 8);
		//    8   18:aload_1         
		//    9   19:getstatic       #167 <Field int android.support.a.a$d.text>
		//   10   22:bipush          8
		//   11   24:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
		//   12   27:return          
		}

		public void addCompatExtras(Bundle bundle)
		{
		//    0    0:return          
		}

		public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
		//    0    0:return          
		}

		public RemoteViews applyStandardTemplate(boolean flag, int i, boolean flag1)
		{
			boolean flag2;
			byte byte0;
			Resources resources;
			RemoteViews remoteviews;
			resources = mBuilder.mContext.getResources();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//    2    4:getfield        #31  <Field Context NotificationCompat$Builder.mContext>
		//    3    7:invokevirtual   #37  <Method Resources Context.getResources()>
		//    4   10:astore          9
			remoteviews = new RemoteViews(mBuilder.mContext.getPackageName(), i);
		//    5   12:new             #157 <Class RemoteViews>
		//    6   15:dup             
		//    7   16:aload_0         
		//    8   17:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//    9   20:getfield        #31  <Field Context NotificationCompat$Builder.mContext>
		//   10   23:invokevirtual   #177 <Method String Context.getPackageName()>
		//   11   26:iload_2         
		//   12   27:invokespecial   #180 <Method void RemoteViews(String, int)>
		//   13   30:astore          10
			if(mBuilder.getPriority() < -1)
		//*  14   32:aload_0         
		//*  15   33:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//*  16   36:invokevirtual   #183 <Method int NotificationCompat$Builder.getPriority()>
		//*  17   39:iconst_m1       
		//*  18   40:icmpge          48
				i = 1;
		//   19   43:iconst_1        
		//   20   44:istore_2        
			else
		//*  21   45:goto            50
				i = 0;
		//   22   48:iconst_0        
		//   23   49:istore_2        
			if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT < 21)
		//*  24   50:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
		//*  25   53:bipush          16
		//*  26   55:icmplt          130
		//*  27   58:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
		//*  28   61:bipush          21
		//*  29   63:icmpge          130
			{
				int j;
				if(i != 0)
		//*  30   66:iload_2         
		//*  31   67:ifeq            105
				{
					remoteviews.setInt(android.support.a.a.d.notification_background, "setBackgroundResource", android.support.a.a.c.notification_bg_low);
		//   32   70:aload           10
		//   33   72:getstatic       #191 <Field int android.support.a.a$d.notification_background>
		//   34   75:ldc1            #193 <String "setBackgroundResource">
		//   35   77:getstatic       #196 <Field int android.support.a.a$c.notification_bg_low>
		//   36   80:invokevirtual   #200 <Method void RemoteViews.setInt(int, String, int)>
					j = android.support.a.a.d.icon;
		//   37   83:getstatic       #203 <Field int android.support.a.a$d.icon>
		//   38   86:istore          5
					i = android.support.a.a.c.notification_template_icon_low_bg;
		//   39   88:getstatic       #206 <Field int android.support.a.a$c.notification_template_icon_low_bg>
		//   40   91:istore_2        
				} else
		//*  41   92:aload           10
		//*  42   94:iload           5
		//*  43   96:ldc1            #193 <String "setBackgroundResource">
		//*  44   98:iload_2         
		//*  45   99:invokevirtual   #200 <Method void RemoteViews.setInt(int, String, int)>
		//*  46  102:goto            130
				{
					remoteviews.setInt(android.support.a.a.d.notification_background, "setBackgroundResource", android.support.a.a.c.notification_bg);
		//   47  105:aload           10
		//   48  107:getstatic       #191 <Field int android.support.a.a$d.notification_background>
		//   49  110:ldc1            #193 <String "setBackgroundResource">
		//   50  112:getstatic       #209 <Field int android.support.a.a$c.notification_bg>
		//   51  115:invokevirtual   #200 <Method void RemoteViews.setInt(int, String, int)>
					j = android.support.a.a.d.icon;
		//   52  118:getstatic       #203 <Field int android.support.a.a$d.icon>
		//   53  121:istore          5
					i = android.support.a.a.c.notification_template_icon_bg;
		//   54  123:getstatic       #212 <Field int android.support.a.a$c.notification_template_icon_bg>
		//   55  126:istore_2        
				}
				remoteviews.setInt(j, "setBackgroundResource", i);
			}
		//*  56  127:goto            92
			Bitmap bitmap = mBuilder.mLargeIcon;
		//   57  130:aload_0         
		//   58  131:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//   59  134:getfield        #216 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
		//   60  137:astore          8
			byte0 = 8;
		//   61  139:bipush          8
		//   62  141:istore          7
			if(bitmap != null)
		//*  63  143:aload           8
		//*  64  145:ifnull          315
			{
				if(android.os.Build.VERSION.SDK_INT >= 16)
		//*  65  148:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
		//*  66  151:bipush          16
		//*  67  153:icmplt          183
				{
					remoteviews.setViewVisibility(android.support.a.a.d.icon, 0);
		//   68  156:aload           10
		//   69  158:getstatic       #203 <Field int android.support.a.a$d.icon>
		//   70  161:iconst_0        
		//   71  162:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
					remoteviews.setImageViewBitmap(android.support.a.a.d.icon, mBuilder.mLargeIcon);
		//   72  165:aload           10
		//   73  167:getstatic       #203 <Field int android.support.a.a$d.icon>
		//   74  170:aload_0         
		//   75  171:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//   76  174:getfield        #216 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
		//   77  177:invokevirtual   #220 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				} else
		//*  78  180:goto            193
				{
					remoteviews.setViewVisibility(android.support.a.a.d.icon, 8);
		//   79  183:aload           10
		//   80  185:getstatic       #203 <Field int android.support.a.a$d.icon>
		//   81  188:bipush          8
		//   82  190:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
				}
				if(flag && mBuilder.mNotification.icon != 0)
		//*  83  193:iload_1         
		//*  84  194:ifeq            443
		//*  85  197:aload_0         
		//*  86  198:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//*  87  201:getfield        #224 <Field Notification NotificationCompat$Builder.mNotification>
		//*  88  204:getfield        #227 <Field int Notification.icon>
		//*  89  207:ifeq            443
				{
					i = resources.getDimensionPixelSize(android.support.a.a.b.notification_right_icon_size);
		//   90  210:aload           9
		//   91  212:getstatic       #230 <Field int android.support.a.a$b.notification_right_icon_size>
		//   92  215:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
		//   93  218:istore_2        
					int k = resources.getDimensionPixelSize(android.support.a.a.b.notification_small_icon_background_padding);
		//   94  219:aload           9
		//   95  221:getstatic       #233 <Field int android.support.a.a$b.notification_small_icon_background_padding>
		//   96  224:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
		//   97  227:istore          5
					if(android.os.Build.VERSION.SDK_INT >= 21)
		//*  98  229:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
		//*  99  232:bipush          21
		//* 100  234:icmplt          280
					{
						Bitmap bitmap1 = createIconWithBackground(mBuilder.mNotification.icon, i, i - k * 2, mBuilder.getColor());
		//  101  237:aload_0         
		//  102  238:aload_0         
		//  103  239:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  104  242:getfield        #224 <Field Notification NotificationCompat$Builder.mNotification>
		//  105  245:getfield        #227 <Field int Notification.icon>
		//  106  248:iload_2         
		//  107  249:iload_2         
		//  108  250:iload           5
		//  109  252:iconst_2        
		//  110  253:imul            
		//  111  254:isub            
		//  112  255:aload_0         
		//  113  256:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  114  259:invokevirtual   #236 <Method int NotificationCompat$Builder.getColor()>
		//  115  262:invokespecial   #238 <Method Bitmap createIconWithBackground(int, int, int, int)>
		//  116  265:astore          8
						remoteviews.setImageViewBitmap(android.support.a.a.d.right_icon, bitmap1);
		//  117  267:aload           10
		//  118  269:getstatic       #241 <Field int android.support.a.a$d.right_icon>
		//  119  272:aload           8
		//  120  274:invokevirtual   #220 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
					} else
		//* 121  277:goto            303
					{
						remoteviews.setImageViewBitmap(android.support.a.a.d.right_icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
		//  122  280:aload           10
		//  123  282:getstatic       #241 <Field int android.support.a.a$d.right_icon>
		//  124  285:aload_0         
		//  125  286:aload_0         
		//  126  287:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  127  290:getfield        #224 <Field Notification NotificationCompat$Builder.mNotification>
		//  128  293:getfield        #227 <Field int Notification.icon>
		//  129  296:iconst_m1       
		//  130  297:invokevirtual   #244 <Method Bitmap createColoredBitmap(int, int)>
		//  131  300:invokevirtual   #220 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
					}
					remoteviews.setViewVisibility(android.support.a.a.d.right_icon, 0);
		//  132  303:aload           10
		//  133  305:getstatic       #241 <Field int android.support.a.a$d.right_icon>
		//  134  308:iconst_0        
		//  135  309:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
				}
			} else
		//* 136  312:goto            443
			if(flag && mBuilder.mNotification.icon != 0)
		//* 137  315:iload_1         
		//* 138  316:ifeq            443
		//* 139  319:aload_0         
		//* 140  320:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//* 141  323:getfield        #224 <Field Notification NotificationCompat$Builder.mNotification>
		//* 142  326:getfield        #227 <Field int Notification.icon>
		//* 143  329:ifeq            443
			{
				remoteviews.setViewVisibility(android.support.a.a.d.icon, 0);
		//  144  332:aload           10
		//  145  334:getstatic       #203 <Field int android.support.a.a$d.icon>
		//  146  337:iconst_0        
		//  147  338:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
				if(android.os.Build.VERSION.SDK_INT >= 21)
		//* 148  341:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
		//* 149  344:bipush          21
		//* 150  346:icmplt          420
				{
					i = resources.getDimensionPixelSize(android.support.a.a.b.notification_large_icon_width);
		//  151  349:aload           9
		//  152  351:getstatic       #247 <Field int android.support.a.a$b.notification_large_icon_width>
		//  153  354:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
		//  154  357:istore_2        
					int l = resources.getDimensionPixelSize(android.support.a.a.b.notification_big_circle_margin);
		//  155  358:aload           9
		//  156  360:getstatic       #250 <Field int android.support.a.a$b.notification_big_circle_margin>
		//  157  363:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
		//  158  366:istore          5
					int i1 = resources.getDimensionPixelSize(android.support.a.a.b.notification_small_icon_size_as_large);
		//  159  368:aload           9
		//  160  370:getstatic       #253 <Field int android.support.a.a$b.notification_small_icon_size_as_large>
		//  161  373:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
		//  162  376:istore          6
					Bitmap bitmap2 = createIconWithBackground(mBuilder.mNotification.icon, i - l, i1, mBuilder.getColor());
		//  163  378:aload_0         
		//  164  379:aload_0         
		//  165  380:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  166  383:getfield        #224 <Field Notification NotificationCompat$Builder.mNotification>
		//  167  386:getfield        #227 <Field int Notification.icon>
		//  168  389:iload_2         
		//  169  390:iload           5
		//  170  392:isub            
		//  171  393:iload           6
		//  172  395:aload_0         
		//  173  396:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  174  399:invokevirtual   #236 <Method int NotificationCompat$Builder.getColor()>
		//  175  402:invokespecial   #238 <Method Bitmap createIconWithBackground(int, int, int, int)>
		//  176  405:astore          8
					remoteviews.setImageViewBitmap(android.support.a.a.d.icon, bitmap2);
		//  177  407:aload           10
		//  178  409:getstatic       #203 <Field int android.support.a.a$d.icon>
		//  179  412:aload           8
		//  180  414:invokevirtual   #220 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				} else
		//* 181  417:goto            443
				{
					remoteviews.setImageViewBitmap(android.support.a.a.d.icon, createColoredBitmap(mBuilder.mNotification.icon, -1));
		//  182  420:aload           10
		//  183  422:getstatic       #203 <Field int android.support.a.a$d.icon>
		//  184  425:aload_0         
		//  185  426:aload_0         
		//  186  427:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  187  430:getfield        #224 <Field Notification NotificationCompat$Builder.mNotification>
		//  188  433:getfield        #227 <Field int Notification.icon>
		//  189  436:iconst_m1       
		//  190  437:invokevirtual   #244 <Method Bitmap createColoredBitmap(int, int)>
		//  191  440:invokevirtual   #220 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
				}
			}
			if(mBuilder.mContentTitle != null)
		//* 192  443:aload_0         
		//* 193  444:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//* 194  447:getfield        #256 <Field CharSequence NotificationCompat$Builder.mContentTitle>
		//* 195  450:ifnull          468
				remoteviews.setTextViewText(android.support.a.a.d.title, mBuilder.mContentTitle);
		//  196  453:aload           10
		//  197  455:getstatic       #155 <Field int android.support.a.a$d.title>
		//  198  458:aload_0         
		//  199  459:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  200  462:getfield        #256 <Field CharSequence NotificationCompat$Builder.mContentTitle>
		//  201  465:invokevirtual   #260 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			if(mBuilder.mContentText != null)
		//* 202  468:aload_0         
		//* 203  469:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//* 204  472:getfield        #263 <Field CharSequence NotificationCompat$Builder.mContentText>
		//* 205  475:ifnull          499
			{
				remoteviews.setTextViewText(android.support.a.a.d.text, mBuilder.mContentText);
		//  206  478:aload           10
		//  207  480:getstatic       #167 <Field int android.support.a.a$d.text>
		//  208  483:aload_0         
		//  209  484:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  210  487:getfield        #263 <Field CharSequence NotificationCompat$Builder.mContentText>
		//  211  490:invokevirtual   #260 <Method void RemoteViews.setTextViewText(int, CharSequence)>
				flag2 = true;
		//  212  493:iconst_1        
		//  213  494:istore          5
			} else
		//* 214  496:goto            502
			{
				flag2 = false;
		//  215  499:iconst_0        
		//  216  500:istore          5
			}
			if(android.os.Build.VERSION.SDK_INT < 21 && mBuilder.mLargeIcon != null)
		//* 217  502:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
		//* 218  505:bipush          21
		//* 219  507:icmpge          525
		//* 220  510:aload_0         
		//* 221  511:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//* 222  514:getfield        #216 <Field Bitmap NotificationCompat$Builder.mLargeIcon>
		//* 223  517:ifnull          525
				i = 1;
		//  224  520:iconst_1        
		//  225  521:istore_2        
			else
		//* 226  522:goto            527
				i = 0;
		//  227  525:iconst_0        
		//  228  526:istore_2        
			if(mBuilder.mContentInfo == null) goto _L2; else goto _L1
		//  229  527:aload_0         
		//  230  528:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  231  531:getfield        #266 <Field CharSequence NotificationCompat$Builder.mContentInfo>
		//  232  534:ifnull          575
_L1:
			Object obj;
			i = android.support.a.a.d.info;
		//  233  537:getstatic       #269 <Field int android.support.a.a$d.info>
		//  234  540:istore_2        
			obj = ((Object) (mBuilder.mContentInfo));
		//  235  541:aload_0         
		//  236  542:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  237  545:getfield        #266 <Field CharSequence NotificationCompat$Builder.mContentInfo>
		//  238  548:astore          8
_L7:
			remoteviews.setTextViewText(i, ((CharSequence) (obj)));
		//  239  550:aload           10
		//  240  552:iload_2         
		//  241  553:aload           8
		//  242  555:invokevirtual   #260 <Method void RemoteViews.setTextViewText(int, CharSequence)>
_L5:
			remoteviews.setViewVisibility(android.support.a.a.d.info, 0);
		//  243  558:aload           10
		//  244  560:getstatic       #269 <Field int android.support.a.a$d.info>
		//  245  563:iconst_0        
		//  246  564:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
			flag2 = true;
		//  247  567:iconst_1        
		//  248  568:istore          5
			i = 1;
		//  249  570:iconst_1        
		//  250  571:istore_2        
			  goto _L3
		//* 251  572:goto            661
_L2:
			if(mBuilder.mNumber <= 0)
				break; /* Loop/switch isn't completed */
		//  252  575:aload_0         
		//  253  576:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  254  579:getfield        #272 <Field int NotificationCompat$Builder.mNumber>
		//  255  582:ifle            651
			i = resources.getInteger(android.support.a.a.e.status_bar_notification_info_maxnum);
		//  256  585:aload           9
		//  257  587:getstatic       #277 <Field int android.support.a.a$e.status_bar_notification_info_maxnum>
		//  258  590:invokevirtual   #280 <Method int Resources.getInteger(int)>
		//  259  593:istore_2        
			if(mBuilder.mNumber > i)
		//* 260  594:aload_0         
		//* 261  595:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//* 262  598:getfield        #272 <Field int NotificationCompat$Builder.mNumber>
		//* 263  601:iload_2         
		//* 264  602:icmple          622
			{
				i = android.support.a.a.d.info;
		//  265  605:getstatic       #269 <Field int android.support.a.a$d.info>
		//  266  608:istore_2        
				obj = ((Object) (resources.getString(android.support.a.a.g.status_bar_notification_info_overflow)));
		//  267  609:aload           9
		//  268  611:getstatic       #285 <Field int android.support.a.a$g.status_bar_notification_info_overflow>
		//  269  614:invokevirtual   #289 <Method String Resources.getString(int)>
		//  270  617:astore          8
				continue; /* Loop/switch isn't completed */
		//  271  619:goto            550
			}
			obj = ((Object) (NumberFormat.getIntegerInstance()));
		//  272  622:invokestatic    #295 <Method NumberFormat NumberFormat.getIntegerInstance()>
		//  273  625:astore          8
			remoteviews.setTextViewText(android.support.a.a.d.info, ((CharSequence) (((NumberFormat) (obj)).format(mBuilder.mNumber))));
		//  274  627:aload           10
		//  275  629:getstatic       #269 <Field int android.support.a.a$d.info>
		//  276  632:aload           8
		//  277  634:aload_0         
		//  278  635:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  279  638:getfield        #272 <Field int NotificationCompat$Builder.mNumber>
		//  280  641:i2l             
		//  281  642:invokevirtual   #299 <Method String NumberFormat.format(long)>
		//  282  645:invokevirtual   #260 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			if(true) goto _L5; else goto _L4
		//  283  648:goto            558
_L4:
			remoteviews.setViewVisibility(android.support.a.a.d.info, 8);
		//  284  651:aload           10
		//  285  653:getstatic       #269 <Field int android.support.a.a$d.info>
		//  286  656:bipush          8
		//  287  658:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
_L3:
			int j1;
label0:
			{
				if(mBuilder.mSubText != null && android.os.Build.VERSION.SDK_INT >= 16)
		//* 288  661:aload_0         
		//* 289  662:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//* 290  665:getfield        #302 <Field CharSequence NotificationCompat$Builder.mSubText>
		//* 291  668:ifnull          744
		//* 292  671:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
		//* 293  674:bipush          16
		//* 294  676:icmplt          744
				{
					remoteviews.setTextViewText(android.support.a.a.d.text, mBuilder.mSubText);
		//  295  679:aload           10
		//  296  681:getstatic       #167 <Field int android.support.a.a$d.text>
		//  297  684:aload_0         
		//  298  685:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  299  688:getfield        #302 <Field CharSequence NotificationCompat$Builder.mSubText>
		//  300  691:invokevirtual   #260 <Method void RemoteViews.setTextViewText(int, CharSequence)>
					if(mBuilder.mContentText != null)
		//* 301  694:aload_0         
		//* 302  695:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//* 303  698:getfield        #263 <Field CharSequence NotificationCompat$Builder.mContentText>
		//* 304  701:ifnull          734
					{
						remoteviews.setTextViewText(android.support.a.a.d.text2, mBuilder.mContentText);
		//  305  704:aload           10
		//  306  706:getstatic       #164 <Field int android.support.a.a$d.text2>
		//  307  709:aload_0         
		//  308  710:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  309  713:getfield        #263 <Field CharSequence NotificationCompat$Builder.mContentText>
		//  310  716:invokevirtual   #260 <Method void RemoteViews.setTextViewText(int, CharSequence)>
						remoteviews.setViewVisibility(android.support.a.a.d.text2, 0);
		//  311  719:aload           10
		//  312  721:getstatic       #164 <Field int android.support.a.a$d.text2>
		//  313  724:iconst_0        
		//  314  725:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
						j1 = 1;
		//  315  728:iconst_1        
		//  316  729:istore          6
						break label0;
		//  317  731:goto            747
					}
					remoteviews.setViewVisibility(android.support.a.a.d.text2, 8);
		//  318  734:aload           10
		//  319  736:getstatic       #164 <Field int android.support.a.a$d.text2>
		//  320  739:bipush          8
		//  321  741:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
				}
				j1 = 0;
		//  322  744:iconst_0        
		//  323  745:istore          6
			}
			if(j1 && android.os.Build.VERSION.SDK_INT >= 16)
		//* 324  747:iload           6
		//* 325  749:ifeq            798
		//* 326  752:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
		//* 327  755:bipush          16
		//* 328  757:icmplt          798
			{
				if(flag1)
		//* 329  760:iload_3         
		//* 330  761:ifeq            786
				{
					float f = resources.getDimensionPixelSize(android.support.a.a.b.notification_subtext_size);
		//  331  764:aload           9
		//  332  766:getstatic       #305 <Field int android.support.a.a$b.notification_subtext_size>
		//  333  769:invokevirtual   #49  <Method int Resources.getDimensionPixelSize(int)>
		//  334  772:i2f             
		//  335  773:fstore          4
					remoteviews.setTextViewTextSize(android.support.a.a.d.text, 0, f);
		//  336  775:aload           10
		//  337  777:getstatic       #167 <Field int android.support.a.a$d.text>
		//  338  780:iconst_0        
		//  339  781:fload           4
		//  340  783:invokevirtual   #309 <Method void RemoteViews.setTextViewTextSize(int, int, float)>
				}
				remoteviews.setViewPadding(android.support.a.a.d.line1, 0, 0, 0, 0);
		//  341  786:aload           10
		//  342  788:getstatic       #312 <Field int android.support.a.a$d.line1>
		//  343  791:iconst_0        
		//  344  792:iconst_0        
		//  345  793:iconst_0        
		//  346  794:iconst_0        
		//  347  795:invokevirtual   #316 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
			}
			if(mBuilder.getWhenIfShowing() != 0L)
		//* 348  798:aload_0         
		//* 349  799:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//* 350  802:invokevirtual   #320 <Method long NotificationCompat$Builder.getWhenIfShowing()>
		//* 351  805:lconst_0        
		//* 352  806:lcmp            
		//* 353  807:ifeq            907
			{
				if(mBuilder.mUseChronometer && android.os.Build.VERSION.SDK_INT >= 16)
		//* 354  810:aload_0         
		//* 355  811:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//* 356  814:getfield        #323 <Field boolean NotificationCompat$Builder.mUseChronometer>
		//* 357  817:ifeq            878
		//* 358  820:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
		//* 359  823:bipush          16
		//* 360  825:icmplt          878
				{
					remoteviews.setViewVisibility(android.support.a.a.d.chronometer, 0);
		//  361  828:aload           10
		//  362  830:getstatic       #326 <Field int android.support.a.a$d.chronometer>
		//  363  833:iconst_0        
		//  364  834:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
					remoteviews.setLong(android.support.a.a.d.chronometer, "setBase", mBuilder.getWhenIfShowing() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
		//  365  837:aload           10
		//  366  839:getstatic       #326 <Field int android.support.a.a$d.chronometer>
		//  367  842:ldc2            #328 <String "setBase">
		//  368  845:aload_0         
		//  369  846:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  370  849:invokevirtual   #320 <Method long NotificationCompat$Builder.getWhenIfShowing()>
		//  371  852:invokestatic    #333 <Method long SystemClock.elapsedRealtime()>
		//  372  855:invokestatic    #338 <Method long System.currentTimeMillis()>
		//  373  858:lsub            
		//  374  859:ladd            
		//  375  860:invokevirtual   #342 <Method void RemoteViews.setLong(int, String, long)>
					remoteviews.setBoolean(android.support.a.a.d.chronometer, "setStarted", true);
		//  376  863:aload           10
		//  377  865:getstatic       #326 <Field int android.support.a.a$d.chronometer>
		//  378  868:ldc2            #344 <String "setStarted">
		//  379  871:iconst_1        
		//  380  872:invokevirtual   #348 <Method void RemoteViews.setBoolean(int, String, boolean)>
				} else
		//* 381  875:goto            905
				{
					remoteviews.setViewVisibility(android.support.a.a.d.time, 0);
		//  382  878:aload           10
		//  383  880:getstatic       #351 <Field int android.support.a.a$d.time>
		//  384  883:iconst_0        
		//  385  884:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
					remoteviews.setLong(android.support.a.a.d.time, "setTime", mBuilder.getWhenIfShowing());
		//  386  887:aload           10
		//  387  889:getstatic       #351 <Field int android.support.a.a$d.time>
		//  388  892:ldc2            #353 <String "setTime">
		//  389  895:aload_0         
		//  390  896:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//  391  899:invokevirtual   #320 <Method long NotificationCompat$Builder.getWhenIfShowing()>
		//  392  902:invokevirtual   #342 <Method void RemoteViews.setLong(int, String, long)>
				}
				i = 1;
		//  393  905:iconst_1        
		//  394  906:istore_2        
			}
			j1 = android.support.a.a.d.right_side;
		//  395  907:getstatic       #356 <Field int android.support.a.a$d.right_side>
		//  396  910:istore          6
			if(i != 0)
		//* 397  912:iload_2         
		//* 398  913:ifeq            921
				i = 0;
		//  399  916:iconst_0        
		//  400  917:istore_2        
			else
		//* 401  918:goto            924
				i = 8;
		//  402  921:bipush          8
		//  403  923:istore_2        
			remoteviews.setViewVisibility(j1, i);
		//  404  924:aload           10
		//  405  926:iload           6
		//  406  928:iload_2         
		//  407  929:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
			j1 = android.support.a.a.d.line3;
		//  408  932:getstatic       #359 <Field int android.support.a.a$d.line3>
		//  409  935:istore          6
			i = ((int) (byte0));
		//  410  937:iload           7
		//  411  939:istore_2        
			if(flag2)
		//* 412  940:iload           5
		//* 413  942:ifeq            947
				i = 0;
		//  414  945:iconst_0        
		//  415  946:istore_2        
			remoteviews.setViewVisibility(j1, i);
		//  416  947:aload           10
		//  417  949:iload           6
		//  418  951:iload_2         
		//  419  952:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
			return remoteviews;
		//  420  955:aload           10
		//  421  957:areturn         
			if(true) goto _L7; else goto _L6
_L6:
		}

		public Notification build()
		{
			if(mBuilder != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//*   2    4:ifnull          15
				return mBuilder.build();
		//    3    7:aload_0         
		//    4    8:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//    5   11:invokevirtual   #363 <Method Notification NotificationCompat$Builder.build()>
		//    6   14:areturn         
			else
				return null;
		//    7   15:aconst_null     
		//    8   16:areturn         
		}

		public void buildIntoRemoteViews(RemoteViews remoteviews, RemoteViews remoteviews1)
		{
			hideNormalContent(remoteviews);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #367 <Method void hideNormalContent(RemoteViews)>
			remoteviews.removeAllViews(android.support.a.a.d.notification_main_column);
		//    3    5:aload_1         
		//    4    6:getstatic       #370 <Field int android.support.a.a$d.notification_main_column>
		//    5    9:invokevirtual   #374 <Method void RemoteViews.removeAllViews(int)>
			remoteviews.addView(android.support.a.a.d.notification_main_column, remoteviews1.clone());
		//    6   12:aload_1         
		//    7   13:getstatic       #370 <Field int android.support.a.a$d.notification_main_column>
		//    8   16:aload_2         
		//    9   17:invokevirtual   #378 <Method RemoteViews RemoteViews.clone()>
		//   10   20:invokevirtual   #382 <Method void RemoteViews.addView(int, RemoteViews)>
			remoteviews.setViewVisibility(android.support.a.a.d.notification_main_column, 0);
		//   11   23:aload_1         
		//   12   24:getstatic       #370 <Field int android.support.a.a$d.notification_main_column>
		//   13   27:iconst_0        
		//   14   28:invokevirtual   #161 <Method void RemoteViews.setViewVisibility(int, int)>
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*  15   31:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
		//*  16   34:bipush          21
		//*  17   36:icmplt          53
				remoteviews.setViewPadding(android.support.a.a.d.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
		//   18   39:aload_1         
		//   19   40:getstatic       #385 <Field int android.support.a.a$d.notification_main_column_container>
		//   20   43:iconst_0        
		//   21   44:aload_0         
		//   22   45:invokespecial   #387 <Method int calculateTopPadding()>
		//   23   48:iconst_0        
		//   24   49:iconst_0        
		//   25   50:invokevirtual   #316 <Method void RemoteViews.setViewPadding(int, int, int, int, int)>
		//   26   53:return          
		}

		public Bitmap createColoredBitmap(int i, int j)
		{
			return createColoredBitmap(i, j, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iconst_0        
		//    4    4:invokespecial   #141 <Method Bitmap createColoredBitmap(int, int, int)>
		//    5    7:areturn         
		}

		public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		protected void restoreFromCompatExtras(Bundle bundle)
		{
		//    0    0:return          
		}

		public void setBuilder(Builder builder)
		{
			if(mBuilder != builder)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//*   2    4:aload_1         
		//*   3    5:if_acmpeq       29
			{
				mBuilder = builder;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #25  <Field NotificationCompat$Builder mBuilder>
				if(mBuilder != null)
		//*   7   13:aload_0         
		//*   8   14:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//*   9   17:ifnull          29
					mBuilder.setStyle(this);
		//   10   20:aload_0         
		//   11   21:getfield        #25  <Field NotificationCompat$Builder mBuilder>
		//   12   24:aload_0         
		//   13   25:invokevirtual   #398 <Method NotificationCompat$Builder NotificationCompat$Builder.setStyle(NotificationCompat$Style)>
		//   14   28:pop             
			}
		//   15   29:return          
		}

		CharSequence mBigContentTitle;
		protected Builder mBuilder;
		CharSequence mSummaryText;
		boolean mSummaryTextSet;

		public Style()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mSummaryTextSet = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #20  <Field boolean mSummaryTextSet>
		//    5    9:return          
		}
	}

	public static final class WearableExtender
		implements Extender
	{

		private void setFlag(int i, boolean flag)
		{
			if(flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            17
				i |= mFlags;
		//    2    4:iload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #118 <Field int mFlags>
		//    5    9:ior             
		//    6   10:istore_1        
			else
		//*   7   11:aload_0         
		//*   8   12:iload_1         
		//*   9   13:putfield        #118 <Field int mFlags>
		//*  10   16:return          
				i &= mFlags;
		//   11   17:iload_1         
		//   12   18:aload_0         
		//   13   19:getfield        #118 <Field int mFlags>
		//   14   22:iand            
		//   15   23:istore_1        
			mFlags = i;
		//*  16   24:goto            11
		}

		public WearableExtender addAction(Action action)
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

		public WearableExtender addActions(List list)
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

		public WearableExtender addPage(Notification notification)
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

		public WearableExtender addPages(List list)
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

		public WearableExtender clearActions()
		{
			mActions.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #116 <Field ArrayList mActions>
		//    2    4:invokevirtual   #221 <Method void ArrayList.clear()>
			return this;
		//    3    7:aload_0         
		//    4    8:areturn         
		}

		public WearableExtender clearPages()
		{
			mPages.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #120 <Field ArrayList mPages>
		//    2    4:invokevirtual   #221 <Method void ArrayList.clear()>
			return this;
		//    3    7:aload_0         
		//    4    8:areturn         
		}

		public WearableExtender clone()
		{
			WearableExtender wearableextender = new WearableExtender();
		//    0    0:new             #2   <Class NotificationCompat$WearableExtender>
		//    1    3:dup             
		//    2    4:invokespecial   #224 <Method void NotificationCompat$WearableExtender()>
		//    3    7:astore_1        
			wearableextender.mActions = new ArrayList(((java.util.Collection) (mActions)));
		//    4    8:aload_1         
		//    5    9:new             #113 <Class ArrayList>
		//    6   12:dup             
		//    7   13:aload_0         
		//    8   14:getfield        #116 <Field ArrayList mActions>
		//    9   17:invokespecial   #227 <Method void ArrayList(java.util.Collection)>
		//   10   20:putfield        #116 <Field ArrayList mActions>
			wearableextender.mFlags = mFlags;
		//   11   23:aload_1         
		//   12   24:aload_0         
		//   13   25:getfield        #118 <Field int mFlags>
		//   14   28:putfield        #118 <Field int mFlags>
			wearableextender.mDisplayIntent = mDisplayIntent;
		//   15   31:aload_1         
		//   16   32:aload_0         
		//   17   33:getfield        #172 <Field PendingIntent mDisplayIntent>
		//   18   36:putfield        #172 <Field PendingIntent mDisplayIntent>
			wearableextender.mPages = new ArrayList(((java.util.Collection) (mPages)));
		//   19   39:aload_1         
		//   20   40:new             #113 <Class ArrayList>
		//   21   43:dup             
		//   22   44:aload_0         
		//   23   45:getfield        #120 <Field ArrayList mPages>
		//   24   48:invokespecial   #227 <Method void ArrayList(java.util.Collection)>
		//   25   51:putfield        #120 <Field ArrayList mPages>
			wearableextender.mBackground = mBackground;
		//   26   54:aload_1         
		//   27   55:aload_0         
		//   28   56:getfield        #180 <Field Bitmap mBackground>
		//   29   59:putfield        #180 <Field Bitmap mBackground>
			wearableextender.mContentIcon = mContentIcon;
		//   30   62:aload_1         
		//   31   63:aload_0         
		//   32   64:getfield        #185 <Field int mContentIcon>
		//   33   67:putfield        #185 <Field int mContentIcon>
			wearableextender.mContentIconGravity = mContentIconGravity;
		//   34   70:aload_1         
		//   35   71:aload_0         
		//   36   72:getfield        #122 <Field int mContentIconGravity>
		//   37   75:putfield        #122 <Field int mContentIconGravity>
			wearableextender.mContentActionIndex = mContentActionIndex;
		//   38   78:aload_1         
		//   39   79:aload_0         
		//   40   80:getfield        #124 <Field int mContentActionIndex>
		//   41   83:putfield        #124 <Field int mContentActionIndex>
			wearableextender.mCustomSizePreset = mCustomSizePreset;
		//   42   86:aload_1         
		//   43   87:aload_0         
		//   44   88:getfield        #126 <Field int mCustomSizePreset>
		//   45   91:putfield        #126 <Field int mCustomSizePreset>
			wearableextender.mCustomContentHeight = mCustomContentHeight;
		//   46   94:aload_1         
		//   47   95:aload_0         
		//   48   96:getfield        #187 <Field int mCustomContentHeight>
		//   49   99:putfield        #187 <Field int mCustomContentHeight>
			wearableextender.mGravity = mGravity;
		//   50  102:aload_1         
		//   51  103:aload_0         
		//   52  104:getfield        #128 <Field int mGravity>
		//   53  107:putfield        #128 <Field int mGravity>
			wearableextender.mHintScreenTimeout = mHintScreenTimeout;
		//   54  110:aload_1         
		//   55  111:aload_0         
		//   56  112:getfield        #189 <Field int mHintScreenTimeout>
		//   57  115:putfield        #189 <Field int mHintScreenTimeout>
			wearableextender.mDismissalId = mDismissalId;
		//   58  118:aload_1         
		//   59  119:aload_0         
		//   60  120:getfield        #195 <Field String mDismissalId>
		//   61  123:putfield        #195 <Field String mDismissalId>
			wearableextender.mBridgeTag = mBridgeTag;
		//   62  126:aload_1         
		//   63  127:aload_0         
		//   64  128:getfield        #197 <Field String mBridgeTag>
		//   65  131:putfield        #197 <Field String mBridgeTag>
			return wearableextender;
		//   66  134:aload_1         
		//   67  135:areturn         
		}

		public volatile Object clone()
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #230 <Method NotificationCompat$WearableExtender clone()>
		//    2    4:areturn         
		}

		public Builder extend(Builder builder)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #136 <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #233 <Method void Bundle()>
		//    3    7:astore_2        
			if(!mActions.isEmpty())
		//*   4    8:aload_0         
		//*   5    9:getfield        #116 <Field ArrayList mActions>
		//*   6   12:invokevirtual   #237 <Method boolean ArrayList.isEmpty()>
		//*   7   15:ifne            52
				bundle.putParcelableArrayList("actions", NotificationCompat.IMPL.getParcelableArrayListForActions((Action[])mActions.toArray(((Object []) (new Action[mActions.size()])))));
		//    8   18:aload_2         
		//    9   19:ldc1            #36  <String "actions">
		//   10   21:getstatic       #144 <Field NotificationCompat$NotificationCompatImpl NotificationCompat.IMPL>
		//   11   24:aload_0         
		//   12   25:getfield        #116 <Field ArrayList mActions>
		//   13   28:aload_0         
		//   14   29:getfield        #116 <Field ArrayList mActions>
		//   15   32:invokevirtual   #241 <Method int ArrayList.size()>
		//   16   35:anewarray       Action[]
		//   17   38:invokevirtual   #247 <Method Object[] ArrayList.toArray(Object[])>
		//   18   41:checkcast       #249 <Class NotificationCompat$Action[]>
		//   19   44:invokeinterface #253 <Method ArrayList NotificationCompat$NotificationCompatImpl.getParcelableArrayListForActions(NotificationCompat$Action[])>
		//   20   49:invokevirtual   #257 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
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
		//   29   67:invokevirtual   #261 <Method void Bundle.putInt(String, int)>
			if(mDisplayIntent != null)
		//*  30   70:aload_0         
		//*  31   71:getfield        #172 <Field PendingIntent mDisplayIntent>
		//*  32   74:ifnull          87
				bundle.putParcelable("displayIntent", ((Parcelable) (mDisplayIntent)));
		//   33   77:aload_2         
		//   34   78:ldc1            #63  <String "displayIntent">
		//   35   80:aload_0         
		//   36   81:getfield        #172 <Field PendingIntent mDisplayIntent>
		//   37   84:invokevirtual   #265 <Method void Bundle.putParcelable(String, Parcelable)>
			if(!mPages.isEmpty())
		//*  38   87:aload_0         
		//*  39   88:getfield        #120 <Field ArrayList mPages>
		//*  40   91:invokevirtual   #237 <Method boolean ArrayList.isEmpty()>
		//*  41   94:ifne            123
				bundle.putParcelableArray("pages", (Parcelable[])mPages.toArray(((Object []) (new Notification[mPages.size()]))));
		//   42   97:aload_2         
		//   43   98:ldc1            #75  <String "pages">
		//   44  100:aload_0         
		//   45  101:getfield        #120 <Field ArrayList mPages>
		//   46  104:aload_0         
		//   47  105:getfield        #120 <Field ArrayList mPages>
		//   48  108:invokevirtual   #241 <Method int ArrayList.size()>
		//   49  111:anewarray       Notification[]
		//   50  114:invokevirtual   #247 <Method Object[] ArrayList.toArray(Object[])>
		//   51  117:checkcast       #269 <Class Parcelable[]>
		//   52  120:invokevirtual   #273 <Method void Bundle.putParcelableArray(String, Parcelable[])>
			if(mBackground != null)
		//*  53  123:aload_0         
		//*  54  124:getfield        #180 <Field Bitmap mBackground>
		//*  55  127:ifnull          140
				bundle.putParcelable("background", ((Parcelable) (mBackground)));
		//   56  130:aload_2         
		//   57  131:ldc1            #39  <String "background">
		//   58  133:aload_0         
		//   59  134:getfield        #180 <Field Bitmap mBackground>
		//   60  137:invokevirtual   #265 <Method void Bundle.putParcelable(String, Parcelable)>
			if(mContentIcon != 0)
		//*  61  140:aload_0         
		//*  62  141:getfield        #185 <Field int mContentIcon>
		//*  63  144:ifeq            157
				bundle.putInt("contentIcon", mContentIcon);
		//   64  147:aload_2         
		//   65  148:ldc1            #48  <String "contentIcon">
		//   66  150:aload_0         
		//   67  151:getfield        #185 <Field int mContentIcon>
		//   68  154:invokevirtual   #261 <Method void Bundle.putInt(String, int)>
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
		//   77  173:invokevirtual   #261 <Method void Bundle.putInt(String, int)>
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
		//   86  191:invokevirtual   #261 <Method void Bundle.putInt(String, int)>
			if(mCustomSizePreset != 0)
		//*  87  194:aload_0         
		//*  88  195:getfield        #126 <Field int mCustomSizePreset>
		//*  89  198:ifeq            211
				bundle.putInt("customSizePreset", mCustomSizePreset);
		//   90  201:aload_2         
		//   91  202:ldc1            #57  <String "customSizePreset">
		//   92  204:aload_0         
		//   93  205:getfield        #126 <Field int mCustomSizePreset>
		//   94  208:invokevirtual   #261 <Method void Bundle.putInt(String, int)>
			if(mCustomContentHeight != 0)
		//*  95  211:aload_0         
		//*  96  212:getfield        #187 <Field int mCustomContentHeight>
		//*  97  215:ifeq            228
				bundle.putInt("customContentHeight", mCustomContentHeight);
		//   98  218:aload_2         
		//   99  219:ldc1            #54  <String "customContentHeight">
		//  100  221:aload_0         
		//  101  222:getfield        #187 <Field int mCustomContentHeight>
		//  102  225:invokevirtual   #261 <Method void Bundle.putInt(String, int)>
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
		//  111  244:invokevirtual   #261 <Method void Bundle.putInt(String, int)>
			if(mHintScreenTimeout != 0)
		//* 112  247:aload_0         
		//* 113  248:getfield        #189 <Field int mHintScreenTimeout>
		//* 114  251:ifeq            264
				bundle.putInt("hintScreenTimeout", mHintScreenTimeout);
		//  115  254:aload_2         
		//  116  255:ldc1            #72  <String "hintScreenTimeout">
		//  117  257:aload_0         
		//  118  258:getfield        #189 <Field int mHintScreenTimeout>
		//  119  261:invokevirtual   #261 <Method void Bundle.putInt(String, int)>
			if(mDismissalId != null)
		//* 120  264:aload_0         
		//* 121  265:getfield        #195 <Field String mDismissalId>
		//* 122  268:ifnull          281
				bundle.putString("dismissalId", mDismissalId);
		//  123  271:aload_2         
		//  124  272:ldc1            #60  <String "dismissalId">
		//  125  274:aload_0         
		//  126  275:getfield        #195 <Field String mDismissalId>
		//  127  278:invokevirtual   #277 <Method void Bundle.putString(String, String)>
			if(mBridgeTag != null)
		//* 128  281:aload_0         
		//* 129  282:getfield        #197 <Field String mBridgeTag>
		//* 130  285:ifnull          298
				bundle.putString("bridgeTag", mBridgeTag);
		//  131  288:aload_2         
		//  132  289:ldc1            #42  <String "bridgeTag">
		//  133  291:aload_0         
		//  134  292:getfield        #197 <Field String mBridgeTag>
		//  135  295:invokevirtual   #277 <Method void Bundle.putString(String, String)>
			builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
		//  136  298:aload_1         
		//  137  299:invokevirtual   #282 <Method Bundle NotificationCompat$Builder.getExtras()>
		//  138  302:ldc1            #20  <String "android.wearable.EXTENSIONS">
		//  139  304:aload_2         
		//  140  305:invokevirtual   #286 <Method void Bundle.putBundle(String, Bundle)>
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

		public WearableExtender setBackground(Bitmap bitmap)
		{
			mBackground = bitmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #180 <Field Bitmap mBackground>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public WearableExtender setBridgeTag(String s)
		{
			mBridgeTag = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #197 <Field String mBridgeTag>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public WearableExtender setContentAction(int i)
		{
			mContentActionIndex = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #124 <Field int mContentActionIndex>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public WearableExtender setContentIcon(int i)
		{
			mContentIcon = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #185 <Field int mContentIcon>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public WearableExtender setContentIconGravity(int i)
		{
			mContentIconGravity = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #122 <Field int mContentIconGravity>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public WearableExtender setContentIntentAvailableOffline(boolean flag)
		{
			setFlag(1, flag);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iload_1         
		//    3    3:invokespecial   #324 <Method void setFlag(int, boolean)>
			return this;
		//    4    6:aload_0         
		//    5    7:areturn         
		}

		public WearableExtender setCustomContentHeight(int i)
		{
			mCustomContentHeight = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #187 <Field int mCustomContentHeight>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public WearableExtender setCustomSizePreset(int i)
		{
			mCustomSizePreset = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #126 <Field int mCustomSizePreset>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public WearableExtender setDismissalId(String s)
		{
			mDismissalId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #195 <Field String mDismissalId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public WearableExtender setDisplayIntent(PendingIntent pendingintent)
		{
			mDisplayIntent = pendingintent;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #172 <Field PendingIntent mDisplayIntent>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public WearableExtender setGravity(int i)
		{
			mGravity = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #128 <Field int mGravity>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public WearableExtender setHintAmbientBigPicture(boolean flag)
		{
			setFlag(32, flag);
		//    0    0:aload_0         
		//    1    1:bipush          32
		//    2    3:iload_1         
		//    3    4:invokespecial   #324 <Method void setFlag(int, boolean)>
			return this;
		//    4    7:aload_0         
		//    5    8:areturn         
		}

		public WearableExtender setHintAvoidBackgroundClipping(boolean flag)
		{
			setFlag(16, flag);
		//    0    0:aload_0         
		//    1    1:bipush          16
		//    2    3:iload_1         
		//    3    4:invokespecial   #324 <Method void setFlag(int, boolean)>
			return this;
		//    4    7:aload_0         
		//    5    8:areturn         
		}

		public WearableExtender setHintContentIntentLaunchesActivity(boolean flag)
		{
			setFlag(64, flag);
		//    0    0:aload_0         
		//    1    1:bipush          64
		//    2    3:iload_1         
		//    3    4:invokespecial   #324 <Method void setFlag(int, boolean)>
			return this;
		//    4    7:aload_0         
		//    5    8:areturn         
		}

		public WearableExtender setHintHideIcon(boolean flag)
		{
			setFlag(2, flag);
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:iload_1         
		//    3    3:invokespecial   #324 <Method void setFlag(int, boolean)>
			return this;
		//    4    6:aload_0         
		//    5    7:areturn         
		}

		public WearableExtender setHintScreenTimeout(int i)
		{
			mHintScreenTimeout = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #189 <Field int mHintScreenTimeout>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public WearableExtender setHintShowBackgroundOnly(boolean flag)
		{
			setFlag(4, flag);
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:iload_1         
		//    3    3:invokespecial   #324 <Method void setFlag(int, boolean)>
			return this;
		//    4    6:aload_0         
		//    5    7:areturn         
		}

		public WearableExtender setStartScrollBottom(boolean flag)
		{
			setFlag(8, flag);
		//    0    0:aload_0         
		//    1    1:bipush          8
		//    2    3:iload_1         
		//    3    4:invokespecial   #324 <Method void setFlag(int, boolean)>
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

		public WearableExtender()
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

		public WearableExtender(Notification notification)
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
		//   63  121:invokevirtual   #168 <Method Parcelable Bundle.getParcelable(String)>
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
		//   80  154:invokevirtual   #168 <Method Parcelable Bundle.getParcelable(String)>
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


	public NotificationCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #285 <Method void Object()>
	//    2    4:return          
	}

	static void addActionsToBuilder(NotificationBuilderWithActions notificationbuilderwithactions, ArrayList arraylist)
	{
		for(arraylist = ((ArrayList) (arraylist.iterator())); ((Iterator) (arraylist)).hasNext(); notificationbuilderwithactions.addAction(((NotificationCompatBase.Action) ((Action)((Iterator) (arraylist)).next()))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #293 <Method Iterator ArrayList.iterator()>
	//    2    4:astore_1        
	//    3    5:aload_1         
	//    4    6:invokeinterface #299 <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            32
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokeinterface #303 <Method Object Iterator.next()>
	//    9   21:checkcast       #6   <Class NotificationCompat$Action>
	//   10   24:invokeinterface #309 <Method void NotificationBuilderWithActions.addAction(NotificationCompatBase$Action)>
	//*  11   29:goto            5
	//   12   32:return          
	}

	public static Action getAction(Notification notification, int i)
	{
		return IMPL.getAction(notification, i);
	//    0    0:getstatic       #277 <Field NotificationCompat$NotificationCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokeinterface #315 <Method NotificationCompat$Action NotificationCompat$NotificationCompatImpl.getAction(Notification, int)>
	//    4   10:areturn         
	}

	public static int getActionCount(Notification notification)
	{
		int j = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		int i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_1        
		if(j >= 19)
	//*   4    6:iload_2         
	//*   5    7:bipush          19
	//*   6    9:icmplt          27
		{
			if(notification.actions != null)
	//*   7   12:aload_0         
	//*   8   13:getfield        #323 <Field android.app.Notification$Action[] Notification.actions>
	//*   9   16:ifnull          25
				i = notification.actions.length;
	//   10   19:aload_0         
	//   11   20:getfield        #323 <Field android.app.Notification$Action[] Notification.actions>
	//   12   23:arraylength     
	//   13   24:istore_1        
			return i;
	//   14   25:iload_1         
	//   15   26:ireturn         
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  16   27:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   30:bipush          16
	//*  18   32:icmplt          40
			return NotificationCompatJellybean.getActionCount(notification);
	//   19   35:aload_0         
	//   20   36:invokestatic    #327 <Method int NotificationCompatJellybean.getActionCount(Notification)>
	//   21   39:ireturn         
		else
			return 0;
	//   22   40:iconst_0        
	//   23   41:ireturn         
	}

	public static int getBadgeIconType(Notification notification)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return notification.getBadgeIconType();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #331 <Method int Notification.getBadgeIconType()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static String getCategory(Notification notification)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return notification.category;
	//    3    8:aload_0         
	//    4    9:getfield        #336 <Field String Notification.category>
	//    5   12:areturn         
		else
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
	}

	public static String getChannelId(Notification notification)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return notification.getChannelId();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #340 <Method String Notification.getChannelId()>
	//    5   12:areturn         
		else
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
	}

	public static Bundle getExtras(Notification notification)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return notification.extras;
	//    3    8:aload_0         
	//    4    9:getfield        #346 <Field Bundle Notification.extras>
	//    5   12:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   6   13:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          16
	//*   8   18:icmplt          26
			return NotificationCompatJellybean.getExtras(notification);
	//    9   21:aload_0         
	//   10   22:invokestatic    #348 <Method Bundle NotificationCompatJellybean.getExtras(Notification)>
	//   11   25:areturn         
		else
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
	}

	public static String getGroup(Notification notification)
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          13
			return notification.getGroup();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #351 <Method String Notification.getGroup()>
	//    5   12:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   6   13:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          19
	//*   8   18:icmplt          34
			notification = ((Notification) (notification.extras));
	//    9   21:aload_0         
	//   10   22:getfield        #346 <Field Bundle Notification.extras>
	//   11   25:astore_0        
		else
	//*  12   26:aload_0         
	//*  13   27:ldc2            #353 <String "android.support.groupKey">
	//*  14   30:invokevirtual   #359 <Method String Bundle.getString(String)>
	//*  15   33:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  16   34:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   37:bipush          16
	//*  18   39:icmplt          50
			notification = ((Notification) (NotificationCompatJellybean.getExtras(notification)));
	//   19   42:aload_0         
	//   20   43:invokestatic    #348 <Method Bundle NotificationCompatJellybean.getExtras(Notification)>
	//   21   46:astore_0        
		else
	//*  22   47:goto            26
			return null;
	//   23   50:aconst_null     
	//   24   51:areturn         
		return ((Bundle) (notification)).getString("android.support.groupKey");
	}

	public static int getGroupAlertBehavior(Notification notification)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return notification.getGroupAlertBehavior();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #362 <Method int Notification.getGroupAlertBehavior()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static boolean getLocalOnly(Notification notification)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		boolean flag = false;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		if(i >= 20)
	//*   4    6:iload_1         
	//*   5    7:bipush          20
	//*   6    9:icmplt          27
		{
			if((notification.flags & 0x100) != 0)
	//*   7   12:aload_0         
	//*   8   13:getfield        #367 <Field int Notification.flags>
	//*   9   16:sipush          256
	//*  10   19:iand            
	//*  11   20:ifeq            25
				flag = true;
	//   12   23:iconst_1        
	//   13   24:istore_2        
			return flag;
	//   14   25:iload_2         
	//   15   26:ireturn         
		}
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  16   27:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   30:bipush          19
	//*  18   32:icmplt          48
			notification = ((Notification) (notification.extras));
	//   19   35:aload_0         
	//   20   36:getfield        #346 <Field Bundle Notification.extras>
	//   21   39:astore_0        
		else
	//*  22   40:aload_0         
	//*  23   41:ldc2            #369 <String "android.support.localOnly">
	//*  24   44:invokevirtual   #373 <Method boolean Bundle.getBoolean(String)>
	//*  25   47:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  26   48:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   51:bipush          16
	//*  28   53:icmplt          64
			notification = ((Notification) (NotificationCompatJellybean.getExtras(notification)));
	//   29   56:aload_0         
	//   30   57:invokestatic    #348 <Method Bundle NotificationCompatJellybean.getExtras(Notification)>
	//   31   60:astore_0        
		else
	//*  32   61:goto            40
			return false;
	//   33   64:iconst_0        
	//   34   65:ireturn         
		return ((Bundle) (notification)).getBoolean("android.support.localOnly");
	}

	static Notification[] getNotificationArrayFromBundle(Bundle bundle, String s)
	{
		Parcelable aparcelable[] = bundle.getParcelableArray(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #379 <Method Parcelable[] Bundle.getParcelableArray(String)>
	//    3    5:astore_3        
		if(!(aparcelable instanceof Notification[]) && aparcelable != null)
	//*   4    6:aload_3         
	//*   5    7:instanceof      #381 <Class Notification[]>
	//*   6   10:ifne            62
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       20
	//*   9   17:goto            62
		{
			Notification anotification[] = new Notification[aparcelable.length];
	//   10   20:aload_3         
	//   11   21:arraylength     
	//   12   22:anewarray       Notification[]
	//   13   25:astore          4
			for(int i = 0; i < aparcelable.length; i++)
	//*  14   27:iconst_0        
	//*  15   28:istore_2        
	//*  16   29:iload_2         
	//*  17   30:aload_3         
	//*  18   31:arraylength     
	//*  19   32:icmpge          52
				anotification[i] = (Notification)aparcelable[i];
	//   20   35:aload           4
	//   21   37:iload_2         
	//   22   38:aload_3         
	//   23   39:iload_2         
	//   24   40:aaload          
	//   25   41:checkcast       #319 <Class Notification>
	//   26   44:aastore         

	//   27   45:iload_2         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_2        
	//*  31   49:goto            29
			bundle.putParcelableArray(s, ((Parcelable []) (anotification)));
	//   32   52:aload_0         
	//   33   53:aload_1         
	//   34   54:aload           4
	//   35   56:invokevirtual   #385 <Method void Bundle.putParcelableArray(String, Parcelable[])>
			return anotification;
	//   36   59:aload           4
	//   37   61:areturn         
		} else
		{
			return (Notification[])aparcelable;
	//   38   62:aload_3         
	//   39   63:checkcast       #381 <Class Notification[]>
	//   40   66:areturn         
		}
	}

	public static String getShortcutId(Notification notification)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return notification.getShortcutId();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #388 <Method String Notification.getShortcutId()>
	//    5   12:areturn         
		else
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
	}

	public static String getSortKey(Notification notification)
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          13
			return notification.getSortKey();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #391 <Method String Notification.getSortKey()>
	//    5   12:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   6   13:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          19
	//*   8   18:icmplt          34
			notification = ((Notification) (notification.extras));
	//    9   21:aload_0         
	//   10   22:getfield        #346 <Field Bundle Notification.extras>
	//   11   25:astore_0        
		else
	//*  12   26:aload_0         
	//*  13   27:ldc2            #393 <String "android.support.sortKey">
	//*  14   30:invokevirtual   #359 <Method String Bundle.getString(String)>
	//*  15   33:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  16   34:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   37:bipush          16
	//*  18   39:icmplt          50
			notification = ((Notification) (NotificationCompatJellybean.getExtras(notification)));
	//   19   42:aload_0         
	//   20   43:invokestatic    #348 <Method Bundle NotificationCompatJellybean.getExtras(Notification)>
	//   21   46:astore_0        
		else
	//*  22   47:goto            26
			return null;
	//   23   50:aconst_null     
	//   24   51:areturn         
		return ((Bundle) (notification)).getString("android.support.sortKey");
	}

	public static long getTimeoutAfter(Notification notification)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return notification.getTimeoutAfter();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #398 <Method long Notification.getTimeoutAfter()>
	//    5   12:lreturn         
		else
			return 0L;
	//    6   13:lconst_0        
	//    7   14:lreturn         
	}

	public static boolean isGroupSummary(Notification notification)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		boolean flag = false;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		if(i >= 20)
	//*   4    6:iload_1         
	//*   5    7:bipush          20
	//*   6    9:icmplt          27
		{
			if((notification.flags & 0x200) != 0)
	//*   7   12:aload_0         
	//*   8   13:getfield        #367 <Field int Notification.flags>
	//*   9   16:sipush          512
	//*  10   19:iand            
	//*  11   20:ifeq            25
				flag = true;
	//   12   23:iconst_1        
	//   13   24:istore_2        
			return flag;
	//   14   25:iload_2         
	//   15   26:ireturn         
		}
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  16   27:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   30:bipush          19
	//*  18   32:icmplt          48
			notification = ((Notification) (notification.extras));
	//   19   35:aload_0         
	//   20   36:getfield        #346 <Field Bundle Notification.extras>
	//   21   39:astore_0        
		else
	//*  22   40:aload_0         
	//*  23   41:ldc2            #401 <String "android.support.isGroupSummary">
	//*  24   44:invokevirtual   #373 <Method boolean Bundle.getBoolean(String)>
	//*  25   47:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  26   48:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   51:bipush          16
	//*  28   53:icmplt          64
			notification = ((Notification) (NotificationCompatJellybean.getExtras(notification)));
	//   29   56:aload_0         
	//   30   57:invokestatic    #348 <Method Bundle NotificationCompatJellybean.getExtras(Notification)>
	//   31   60:astore_0        
		else
	//*  32   61:goto            40
			return false;
	//   33   64:iconst_0        
	//   34   65:ireturn         
		return ((Bundle) (notification)).getBoolean("android.support.isGroupSummary");
	}

	public static final int BADGE_ICON_LARGE = 2;
	public static final int BADGE_ICON_NONE = 0;
	public static final int BADGE_ICON_SMALL = 1;
	public static final String CATEGORY_ALARM = "alarm";
	public static final String CATEGORY_CALL = "call";
	public static final String CATEGORY_EMAIL = "email";
	public static final String CATEGORY_ERROR = "err";
	public static final String CATEGORY_EVENT = "event";
	public static final String CATEGORY_MESSAGE = "msg";
	public static final String CATEGORY_PROGRESS = "progress";
	public static final String CATEGORY_PROMO = "promo";
	public static final String CATEGORY_RECOMMENDATION = "recommendation";
	public static final String CATEGORY_REMINDER = "reminder";
	public static final String CATEGORY_SERVICE = "service";
	public static final String CATEGORY_SOCIAL = "social";
	public static final String CATEGORY_STATUS = "status";
	public static final String CATEGORY_SYSTEM = "sys";
	public static final String CATEGORY_TRANSPORT = "transport";
	public static final int COLOR_DEFAULT = 0;
	public static final int DEFAULT_ALL = -1;
	public static final int DEFAULT_LIGHTS = 4;
	public static final int DEFAULT_SOUND = 1;
	public static final int DEFAULT_VIBRATE = 2;
	public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
	public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
	public static final String EXTRA_BIG_TEXT = "android.bigText";
	public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
	public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
	public static final String EXTRA_INFO_TEXT = "android.infoText";
	public static final String EXTRA_LARGE_ICON = "android.largeIcon";
	public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
	public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
	public static final String EXTRA_MESSAGES = "android.messages";
	public static final String EXTRA_PEOPLE = "android.people";
	public static final String EXTRA_PICTURE = "android.picture";
	public static final String EXTRA_PROGRESS = "android.progress";
	public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
	public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
	public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
	public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
	public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
	public static final String EXTRA_SHOW_WHEN = "android.showWhen";
	public static final String EXTRA_SMALL_ICON = "android.icon";
	public static final String EXTRA_SUB_TEXT = "android.subText";
	public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
	public static final String EXTRA_TEMPLATE = "android.template";
	public static final String EXTRA_TEXT = "android.text";
	public static final String EXTRA_TEXT_LINES = "android.textLines";
	public static final String EXTRA_TITLE = "android.title";
	public static final String EXTRA_TITLE_BIG = "android.title.big";
	public static final int FLAG_AUTO_CANCEL = 16;
	public static final int FLAG_FOREGROUND_SERVICE = 64;
	public static final int FLAG_GROUP_SUMMARY = 512;
	public static final int FLAG_HIGH_PRIORITY = 128;
	public static final int FLAG_INSISTENT = 4;
	public static final int FLAG_LOCAL_ONLY = 256;
	public static final int FLAG_NO_CLEAR = 32;
	public static final int FLAG_ONGOING_EVENT = 2;
	public static final int FLAG_ONLY_ALERT_ONCE = 8;
	public static final int FLAG_SHOW_LIGHTS = 1;
	public static final int GROUP_ALERT_ALL = 0;
	public static final int GROUP_ALERT_CHILDREN = 2;
	public static final int GROUP_ALERT_SUMMARY = 1;
	static final NotificationCompatImpl IMPL;
	public static final int PRIORITY_DEFAULT = 0;
	public static final int PRIORITY_HIGH = 1;
	public static final int PRIORITY_LOW = -1;
	public static final int PRIORITY_MAX = 2;
	public static final int PRIORITY_MIN = -2;
	public static final int STREAM_DEFAULT = -1;
	public static final int VISIBILITY_PRIVATE = 0;
	public static final int VISIBILITY_PUBLIC = 1;
	public static final int VISIBILITY_SECRET = -1;

	static 
	{
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          21
			obj = ((Object) (new NotificationCompatApi26Impl()));
	//    3    8:new             #73  <Class NotificationCompat$NotificationCompatApi26Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #275 <Method void NotificationCompat$NotificationCompatApi26Impl()>
	//    6   15:astore_0        
		else
	//*   7   16:aload_0         
	//*   8   17:putstatic       #277 <Field NotificationCompat$NotificationCompatImpl IMPL>
	//*   9   20:return          
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  10   21:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   24:bipush          24
	//*  12   26:icmplt          40
			obj = ((Object) (new NotificationCompatApi24Impl()));
	//   13   29:new             #70  <Class NotificationCompat$NotificationCompatApi24Impl>
	//   14   32:dup             
	//   15   33:invokespecial   #278 <Method void NotificationCompat$NotificationCompatApi24Impl()>
	//   16   36:astore_0        
		else
	//*  17   37:goto            16
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  18   40:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*  19   43:bipush          21
	//*  20   45:icmplt          59
			obj = ((Object) (new NotificationCompatApi21Impl()));
	//   21   48:new             #67  <Class NotificationCompat$NotificationCompatApi21Impl>
	//   22   51:dup             
	//   23   52:invokespecial   #279 <Method void NotificationCompat$NotificationCompatApi21Impl()>
	//   24   55:astore_0        
		else
	//*  25   56:goto            16
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*  26   59:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   62:bipush          20
	//*  28   64:icmplt          78
			obj = ((Object) (new NotificationCompatApi20Impl()));
	//   29   67:new             #64  <Class NotificationCompat$NotificationCompatApi20Impl>
	//   30   70:dup             
	//   31   71:invokespecial   #280 <Method void NotificationCompat$NotificationCompatApi20Impl()>
	//   32   74:astore_0        
		else
	//*  33   75:goto            16
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  34   78:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*  35   81:bipush          19
	//*  36   83:icmplt          97
			obj = ((Object) (new NotificationCompatApi19Impl()));
	//   37   86:new             #61  <Class NotificationCompat$NotificationCompatApi19Impl>
	//   38   89:dup             
	//   39   90:invokespecial   #281 <Method void NotificationCompat$NotificationCompatApi19Impl()>
	//   40   93:astore_0        
		else
	//*  41   94:goto            16
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  42   97:getstatic       #272 <Field int android.os.Build$VERSION.SDK_INT>
	//*  43  100:bipush          16
	//*  44  102:icmplt          116
			obj = ((Object) (new NotificationCompatApi16Impl()));
	//   45  105:new             #58  <Class NotificationCompat$NotificationCompatApi16Impl>
	//   46  108:dup             
	//   47  109:invokespecial   #282 <Method void NotificationCompat$NotificationCompatApi16Impl()>
	//   48  112:astore_0        
		else
	//*  49  113:goto            16
			obj = ((Object) (new NotificationCompatBaseImpl()));
	//   50  116:new             #76  <Class NotificationCompat$NotificationCompatBaseImpl>
	//   51  119:dup             
	//   52  120:invokespecial   #283 <Method void NotificationCompat$NotificationCompatBaseImpl()>
	//   53  123:astore_0        
		IMPL = ((NotificationCompatImpl) (obj));
	//*  54  124:goto            16
	}
}
