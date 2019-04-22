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
		//    5    9:invokevirtual   #76  <Method void Bundle.putAll(Bundle)>
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public NotificationCompat.Action build()
		{
			RemoteInput aremoteinput[] = ((RemoteInput []) (new ArrayList()));
		//    0    0:new             #57  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #79  <Method void ArrayList()>
		//    3    7:astore_1        
			RemoteInput aremoteinput1[] = ((RemoteInput []) (new ArrayList()));
		//    4    8:new             #57  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #79  <Method void ArrayList()>
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
		//*  14   26:invokevirtual   #83  <Method Iterator ArrayList.iterator()>
		//*  15   29:astore_3        
		//*  16   30:aload_3         
		//*  17   31:invokeinterface #89  <Method boolean Iterator.hasNext()>
		//*  18   36:ifeq            82
				{
					RemoteInput remoteinput = (RemoteInput)((Iterator) (obj)).next();
		//   19   39:aload_3         
		//   20   40:invokeinterface #93  <Method Object Iterator.next()>
		//   21   45:checkcast       #95  <Class RemoteInput>
		//   22   48:astore          4
					if(remoteinput.isDataOnly())
		//*  23   50:aload           4
		//*  24   52:invokevirtual   #98  <Method boolean RemoteInput.isDataOnly()>
		//*  25   55:ifeq            70
						((List) (aremoteinput)).add(((Object) (remoteinput)));
		//   26   58:aload_1         
		//   27   59:aload           4
		//   28   61:invokeinterface #104 <Method boolean List.add(Object)>
		//   29   66:pop             
					else
		//*  30   67:goto            30
						((List) (aremoteinput1)).add(((Object) (remoteinput)));
		//   31   70:aload_2         
		//   32   71:aload           4
		//   33   73:invokeinterface #104 <Method boolean List.add(Object)>
		//   34   78:pop             
				}

		//*  35   79:goto            30
			if(((List) (aremoteinput)).isEmpty())
		//*  36   82:aload_1         
		//*  37   83:invokeinterface #107 <Method boolean List.isEmpty()>
		//*  38   88:ifeq            96
				aremoteinput = null;
		//   39   91:aconst_null     
		//   40   92:astore_1        
			else
		//*  41   93:goto            115
				aremoteinput = (RemoteInput[])((List) (aremoteinput)).toArray(((Object []) (new RemoteInput[((List) (aremoteinput)).size()])));
		//   42   96:aload_1         
		//   43   97:aload_1         
		//   44   98:invokeinterface #111 <Method int List.size()>
		//   45  103:anewarray       RemoteInput[]
		//   46  106:invokeinterface #115 <Method Object[] List.toArray(Object[])>
		//   47  111:checkcast       #117 <Class RemoteInput[]>
		//   48  114:astore_1        
			if(((List) (aremoteinput1)).isEmpty())
		//*  49  115:aload_2         
		//*  50  116:invokeinterface #107 <Method boolean List.isEmpty()>
		//*  51  121:ifeq            129
				aremoteinput1 = null;
		//   52  124:aconst_null     
		//   53  125:astore_2        
			else
		//*  54  126:goto            148
				aremoteinput1 = (RemoteInput[])((List) (aremoteinput1)).toArray(((Object []) (new RemoteInput[((List) (aremoteinput1)).size()])));
		//   55  129:aload_2         
		//   56  130:aload_2         
		//   57  131:invokeinterface #111 <Method int List.size()>
		//   58  136:anewarray       RemoteInput[]
		//   59  139:invokeinterface #115 <Method Object[] List.toArray(Object[])>
		//   60  144:checkcast       #117 <Class RemoteInput[]>
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
		//   80  182:invokespecial   #120 <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean, int, boolean)>
		//   81  185:areturn         
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
	}

	public static interface Extender
	{

		public abstract Builder extend(Builder builder);
	}

	public static interface SemanticAction
		extends Annotation
	{
	}


	public PendingIntent getActionIntent()
	{
		return actionIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field PendingIntent actionIntent>
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
	//    1    1:getfield        #40  <Field int icon>
	//    2    4:ireturn         
	}

	public RemoteInput[] getRemoteInputs()
	{
		return mRemoteInputs;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field RemoteInput[] mRemoteInputs>
	//    2    4:areturn         
	}

	public int getSemanticAction()
	{
		return mSemanticAction;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int mSemanticAction>
	//    2    4:ireturn         
	}

	public boolean getShowsUserInterface()
	{
		return mShowsUserInterface;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean mShowsUserInterface>
	//    2    4:ireturn         
	}

	public CharSequence getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field CharSequence title>
	//    2    4:areturn         
	}

	public PendingIntent actionIntent;
	public int icon;
	private boolean mAllowGeneratedReplies;
	private final RemoteInput mDataOnlyRemoteInputs[];
	final Bundle mExtras;
	private final RemoteInput mRemoteInputs[];
	private final int mSemanticAction;
	boolean mShowsUserInterface;
	public CharSequence title;

	NotificationCompat$Action(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], RemoteInput aremoteinput1[], boolean flag, 
			int j, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		mShowsUserInterface = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #38  <Field boolean mShowsUserInterface>
		icon = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #40  <Field int icon>
		title = .limitCharSequenceLength(charsequence);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokestatic    #46  <Method CharSequence NotificationCompat$Builder.limitCharSequenceLength(CharSequence)>
	//   11   19:putfield        #48  <Field CharSequence title>
		actionIntent = pendingintent;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:putfield        #50  <Field PendingIntent actionIntent>
		if(bundle == null)
	//*  15   27:aload           4
	//*  16   29:ifnull          35
	//*  17   32:goto            44
			bundle = new Bundle();
	//   18   35:new             #52  <Class Bundle>
	//   19   38:dup             
	//   20   39:invokespecial   #53  <Method void Bundle()>
	//   21   42:astore          4
		mExtras = bundle;
	//   22   44:aload_0         
	//   23   45:aload           4
	//   24   47:putfield        #55  <Field Bundle mExtras>
		mRemoteInputs = aremoteinput;
	//   25   50:aload_0         
	//   26   51:aload           5
	//   27   53:putfield        #57  <Field RemoteInput[] mRemoteInputs>
		mDataOnlyRemoteInputs = aremoteinput1;
	//   28   56:aload_0         
	//   29   57:aload           6
	//   30   59:putfield        #59  <Field RemoteInput[] mDataOnlyRemoteInputs>
		mAllowGeneratedReplies = flag;
	//   31   62:aload_0         
	//   32   63:iload           7
	//   33   65:putfield        #61  <Field boolean mAllowGeneratedReplies>
		mSemanticAction = j;
	//   34   68:aload_0         
	//   35   69:iload           8
	//   36   71:putfield        #63  <Field int mSemanticAction>
		mShowsUserInterface = flag1;
	//   37   74:aload_0         
	//   38   75:iload           9
	//   39   77:putfield        #38  <Field boolean mShowsUserInterface>
	//   40   80:return          
	}
}
