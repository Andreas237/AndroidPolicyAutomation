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
	//    3    5:getfield        #51  <Field Bundle mExtras>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #91  <Method void Bundle.putAll(Bundle)>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public NotificationCompat$Action$Builder addRemoteInput(RemoteInput remoteinput)
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
	//    3    7:astore_1        
		RemoteInput aremoteinput1[] = ((RemoteInput []) (new ArrayList()));
	//    4    8:new             #53  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #94  <Method void ArrayList()>
	//    7   15:astore_2        
		if(mRemoteInputs != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #64  <Field ArrayList mRemoteInputs>
	//*  10   20:ifnull          83
		{
			for(Iterator iterator = mRemoteInputs.iterator(); iterator.hasNext();)
	//*  11   23:aload_0         
	//*  12   24:getfield        #64  <Field ArrayList mRemoteInputs>
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
	//*  29   68:goto            80
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
	//*  37   89:ifeq            97
			aremoteinput = null;
	//   38   92:aconst_null     
	//   39   93:astore_1        
		else
	//*  40   94:goto            116
			aremoteinput = (RemoteInput[])((List) (aremoteinput)).toArray(((Object []) (new RemoteInput[((List) (aremoteinput)).size()])));
	//   41   97:aload_1         
	//   42   98:aload_1         
	//   43   99:invokeinterface #128 <Method int List.size()>
	//   44  104:anewarray       RemoteInput[]
	//   45  107:invokeinterface #132 <Method Object[] List.toArray(Object[])>
	//   46  112:checkcast       #134 <Class RemoteInput[]>
	//   47  115:astore_1        
		if(((List) (aremoteinput1)).isEmpty())
	//*  48  116:aload_2         
	//*  49  117:invokeinterface #124 <Method boolean List.isEmpty()>
	//*  50  122:ifeq            130
			aremoteinput1 = null;
	//   51  125:aconst_null     
	//   52  126:astore_2        
		else
	//*  53  127:goto            149
			aremoteinput1 = (RemoteInput[])((List) (aremoteinput1)).toArray(((Object []) (new RemoteInput[((List) (aremoteinput1)).size()])));
	//   54  130:aload_2         
	//   55  131:aload_2         
	//   56  132:invokeinterface #128 <Method int List.size()>
	//   57  137:anewarray       RemoteInput[]
	//   58  140:invokeinterface #132 <Method Object[] List.toArray(Object[])>
	//   59  145:checkcast       #134 <Class RemoteInput[]>
	//   60  148:astore_2        
		return new NotificationCompat.Action(mIcon, mTitle, mIntent, mExtras, aremoteinput1, aremoteinput, mAllowGeneratedReplies);
	//   61  149:new             #6   <Class NotificationCompat$Action>
	//   62  152:dup             
	//   63  153:aload_0         
	//   64  154:getfield        #39  <Field int mIcon>
	//   65  157:aload_0         
	//   66  158:getfield        #47  <Field CharSequence mTitle>
	//   67  161:aload_0         
	//   68  162:getfield        #49  <Field PendingIntent mIntent>
	//   69  165:aload_0         
	//   70  166:getfield        #51  <Field Bundle mExtras>
	//   71  169:aload_2         
	//   72  170:aload_1         
	//   73  171:aload_0         
	//   74  172:getfield        #37  <Field boolean mAllowGeneratedReplies>
	//   75  175:invokespecial   #137 <Method void NotificationCompat$Action(int, CharSequence, PendingIntent, Bundle, RemoteInput[], RemoteInput[], boolean)>
	//   76  178:areturn         
	}

	public NotificationCompat$Action$Builder extend( )
	{
		.extend(this);
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

	public NotificationCompat$Action$Builder setAllowGeneratedReplies(boolean flag)
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

	public NotificationCompat$Action$Builder(int i, CharSequence charsequence, PendingIntent pendingintent)
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

	private NotificationCompat$Action$Builder(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], boolean flag)
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

	public NotificationCompat$Action$Builder(NotificationCompat.Action action)
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
