// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput

public static final class NotificationCompat$Action$Builder
{

	public NotificationCompat$Action$Builder addExtras(Bundle bundle)
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

	public NotificationCompat$Action$Builder addRemoteInput(RemoteInput remoteinput)
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

	public NotificationCompat$Action$Builder extend( )
	{
		.extend(this);
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

	public NotificationCompat$Action$Builder setAllowGeneratedReplies(boolean flag)
	{
		mAllowGeneratedReplies = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field boolean mAllowGeneratedReplies>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Action$Builder setSemanticAction(int i)
	{
		mSemanticAction = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field int mSemanticAction>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Action$Builder setShowsUserInterface(boolean flag)
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

	public NotificationCompat$Action$Builder(int i, CharSequence charsequence, PendingIntent pendingintent)
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

	private NotificationCompat$Action$Builder(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], boolean flag, int j, 
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

	public NotificationCompat$Action$Builder(NotificationCompat.Action action)
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
