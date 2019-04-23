// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput

public static final class NotificationCompat$CarExtender
	implements NotificationCompat.Extender
{
	public static class UnreadConversation
	{

		public long getLatestTimestamp()
		{
			return mLatestTimestamp;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field long mLatestTimestamp>
		//    2    4:lreturn         
		}

		public String[] getMessages()
		{
			return mMessages;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field String[] mMessages>
		//    2    4:areturn         
		}

		public String getParticipant()
		{
			String as[] = mParticipants;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field String[] mParticipants>
		//    2    4:astore_1        
			if(as.length > 0)
		//*   3    5:aload_1         
		//*   4    6:arraylength     
		//*   5    7:ifle            14
				return as[0];
		//    6   10:aload_1         
		//    7   11:iconst_0        
		//    8   12:aaload          
		//    9   13:areturn         
			else
				return null;
		//   10   14:aconst_null     
		//   11   15:areturn         
		}

		public String[] getParticipants()
		{
			return mParticipants;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field String[] mParticipants>
		//    2    4:areturn         
		}

		public PendingIntent getReadPendingIntent()
		{
			return mReadPendingIntent;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field PendingIntent mReadPendingIntent>
		//    2    4:areturn         
		}

		public android.support.v4.app.RemoteInput getRemoteInput()
		{
			return mRemoteInput;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field android.support.v4.app.RemoteInput mRemoteInput>
		//    2    4:areturn         
		}

		public PendingIntent getReplyPendingIntent()
		{
			return mReplyPendingIntent;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field PendingIntent mReplyPendingIntent>
		//    2    4:areturn         
		}

		private final long mLatestTimestamp;
		private final String mMessages[];
		private final String mParticipants[];
		private final PendingIntent mReadPendingIntent;
		private final android.support.v4.app.RemoteInput mRemoteInput;
		private final PendingIntent mReplyPendingIntent;

		UnreadConversation(String as[], android.support.v4.app.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			mMessages = as;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #30  <Field String[] mMessages>
			mRemoteInput = remoteinput;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #32  <Field android.support.v4.app.RemoteInput mRemoteInput>
			mReadPendingIntent = pendingintent1;
		//    8   14:aload_0         
		//    9   15:aload           4
		//   10   17:putfield        #34  <Field PendingIntent mReadPendingIntent>
			mReplyPendingIntent = pendingintent;
		//   11   20:aload_0         
		//   12   21:aload_3         
		//   13   22:putfield        #36  <Field PendingIntent mReplyPendingIntent>
			mParticipants = as1;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #38  <Field String[] mParticipants>
			mLatestTimestamp = l;
		//   17   31:aload_0         
		//   18   32:lload           6
		//   19   34:putfield        #40  <Field long mLatestTimestamp>
		//   20   37:return          
		}
	}

	public static class UnreadConversation.Builder
	{

		public UnreadConversation.Builder addMessage(String s)
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

		public UnreadConversation build()
		{
			List list = mMessages;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field List mMessages>
		//    2    4:astore_3        
			String as[] = (String[])list.toArray(((Object []) (new String[list.size()])));
		//    3    5:aload_3         
		//    4    6:aload_3         
		//    5    7:invokeinterface #52  <Method int List.size()>
		//    6   12:anewarray       String[]
		//    7   15:invokeinterface #58  <Method Object[] List.toArray(Object[])>
		//    8   20:checkcast       #60  <Class String[]>
		//    9   23:astore_3        
			String s = mParticipant;
		//   10   24:aload_0         
		//   11   25:getfield        #37  <Field String mParticipant>
		//   12   28:astore          4
			android.support.v4.app.RemoteInput remoteinput = mRemoteInput;
		//   13   30:aload_0         
		//   14   31:getfield        #62  <Field android.support.v4.app.RemoteInput mRemoteInput>
		//   15   34:astore          5
			PendingIntent pendingintent = mReplyPendingIntent;
		//   16   36:aload_0         
		//   17   37:getfield        #64  <Field PendingIntent mReplyPendingIntent>
		//   18   40:astore          6
			PendingIntent pendingintent1 = mReadPendingIntent;
		//   19   42:aload_0         
		//   20   43:getfield        #66  <Field PendingIntent mReadPendingIntent>
		//   21   46:astore          7
			long l = mLatestTimestamp;
		//   22   48:aload_0         
		//   23   49:getfield        #68  <Field long mLatestTimestamp>
		//   24   52:lstore_1        
			return new UnreadConversation(as, remoteinput, pendingintent, pendingintent1, new String[] {
				s
			}, l);
		//   25   53:new             #11  <Class NotificationCompat$CarExtender$UnreadConversation>
		//   26   56:dup             
		//   27   57:aload_3         
		//   28   58:aload           5
		//   29   60:aload           6
		//   30   62:aload           7
		//   31   64:iconst_1        
		//   32   65:anewarray       String[]
		//   33   68:dup             
		//   34   69:iconst_0        
		//   35   70:aload           4
		//   36   72:aastore         
		//   37   73:lload_1         
		//   38   74:invokespecial   #71  <Method void NotificationCompat$CarExtender$UnreadConversation(String[], android.support.v4.app.RemoteInput, PendingIntent, PendingIntent, String[], long)>
		//   39   77:areturn         
		}

		public UnreadConversation.Builder setLatestTimestamp(long l)
		{
			mLatestTimestamp = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #68  <Field long mLatestTimestamp>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public UnreadConversation.Builder setReadPendingIntent(PendingIntent pendingintent)
		{
			mReadPendingIntent = pendingintent;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #66  <Field PendingIntent mReadPendingIntent>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public UnreadConversation.Builder setReplyAction(PendingIntent pendingintent, android.support.v4.app.RemoteInput remoteinput)
		{
			mRemoteInput = remoteinput;
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:putfield        #62  <Field android.support.v4.app.RemoteInput mRemoteInput>
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
		private android.support.v4.app.RemoteInput mRemoteInput;
		private PendingIntent mReplyPendingIntent;

		public UnreadConversation.Builder(String s)
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


	private static Bundle getBundleForUnreadConversation(UnreadConversation unreadconversation)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #84  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #112 <Method void Bundle()>
	//    3    7:astore_3        
		String as[] = unreadconversation.getParticipants();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #116 <Method String[] NotificationCompat$CarExtender$UnreadConversation.getParticipants()>
	//    6   12:astore_2        
		int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		Object obj;
		if(as != null && unreadconversation.getParticipants().length > 1)
	//*   9   15:aload_2         
	//*  10   16:ifnull          38
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #116 <Method String[] NotificationCompat$CarExtender$UnreadConversation.getParticipants()>
	//*  13   23:arraylength     
	//*  14   24:iconst_1        
	//*  15   25:icmple          38
			obj = ((Object) (unreadconversation.getParticipants()[0]));
	//   16   28:aload_0         
	//   17   29:invokevirtual   #116 <Method String[] NotificationCompat$CarExtender$UnreadConversation.getParticipants()>
	//   18   32:iconst_0        
	//   19   33:aaload          
	//   20   34:astore_2        
		else
	//*  21   35:goto            40
			obj = null;
	//   22   38:aconst_null     
	//   23   39:astore_2        
		Parcelable aparcelable[];
		for(aparcelable = new Parcelable[unreadconversation.getMessages().length]; i < aparcelable.length; i++)
	//*  24   40:aload_0         
	//*  25   41:invokevirtual   #119 <Method String[] NotificationCompat$CarExtender$UnreadConversation.getMessages()>
	//*  26   44:arraylength     
	//*  27   45:anewarray       Parcelable[]
	//*  28   48:astore          4
	//*  29   50:iload_1         
	//*  30   51:aload           4
	//*  31   53:arraylength     
	//*  32   54:icmpge          100
		{
			Bundle bundle1 = new Bundle();
	//   33   57:new             #84  <Class Bundle>
	//   34   60:dup             
	//   35   61:invokespecial   #112 <Method void Bundle()>
	//   36   64:astore          5
			bundle1.putString("text", unreadconversation.getMessages()[i]);
	//   37   66:aload           5
	//   38   68:ldc1            #56  <String "text">
	//   39   70:aload_0         
	//   40   71:invokevirtual   #119 <Method String[] NotificationCompat$CarExtender$UnreadConversation.getMessages()>
	//   41   74:iload_1         
	//   42   75:aaload          
	//   43   76:invokevirtual   #125 <Method void Bundle.putString(String, String)>
			bundle1.putString("author", ((String) (obj)));
	//   44   79:aload           5
	//   45   81:ldc1            #38  <String "author">
	//   46   83:aload_2         
	//   47   84:invokevirtual   #125 <Method void Bundle.putString(String, String)>
			aparcelable[i] = ((Parcelable) (bundle1));
	//   48   87:aload           4
	//   49   89:iload_1         
	//   50   90:aload           5
	//   51   92:aastore         
		}

	//   52   93:iload_1         
	//   53   94:iconst_1        
	//   54   95:iadd            
	//   55   96:istore_1        
	//*  56   97:goto            50
		bundle.putParcelableArray("messages", aparcelable);
	//   57  100:aload_3         
	//   58  101:ldc1            #41  <String "messages">
	//   59  103:aload           4
	//   60  105:invokevirtual   #129 <Method void Bundle.putParcelableArray(String, Parcelable[])>
		obj = ((Object) (unreadconversation.getRemoteInput()));
	//   61  108:aload_0         
	//   62  109:invokevirtual   #133 <Method android.support.v4.app.RemoteInput NotificationCompat$CarExtender$UnreadConversation.getRemoteInput()>
	//   63  112:astore_2        
		if(obj != null)
	//*  64  113:aload_2         
	//*  65  114:ifnull          165
			bundle.putParcelable("remote_input", ((Parcelable) ((new android.app.RemoteInput.Builder(((android.support.v4.app.RemoteInput) (obj)).getResultKey())).setLabel(((android.support.v4.app.RemoteInput) (obj)).getLabel()).setChoices(((android.support.v4.app.RemoteInput) (obj)).getChoices()).setAllowFreeFormInput(((android.support.v4.app.RemoteInput) (obj)).getAllowFreeFormInput()).addExtras(((android.support.v4.app.RemoteInput) (obj)).getExtras()).build())));
	//   66  117:aload_3         
	//   67  118:ldc1            #53  <String "remote_input">
	//   68  120:new             #135 <Class android.app.RemoteInput$Builder>
	//   69  123:dup             
	//   70  124:aload_2         
	//   71  125:invokevirtual   #141 <Method String RemoteInput.getResultKey()>
	//   72  128:invokespecial   #144 <Method void android.app.RemoteInput$Builder(String)>
	//   73  131:aload_2         
	//   74  132:invokevirtual   #148 <Method CharSequence RemoteInput.getLabel()>
	//   75  135:invokevirtual   #152 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setLabel(CharSequence)>
	//   76  138:aload_2         
	//   77  139:invokevirtual   #156 <Method CharSequence[] RemoteInput.getChoices()>
	//   78  142:invokevirtual   #160 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setChoices(CharSequence[])>
	//   79  145:aload_2         
	//   80  146:invokevirtual   #164 <Method boolean RemoteInput.getAllowFreeFormInput()>
	//   81  149:invokevirtual   #168 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setAllowFreeFormInput(boolean)>
	//   82  152:aload_2         
	//   83  153:invokevirtual   #171 <Method Bundle RemoteInput.getExtras()>
	//   84  156:invokevirtual   #175 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.addExtras(Bundle)>
	//   85  159:invokevirtual   #179 <Method RemoteInput android.app.RemoteInput$Builder.build()>
	//   86  162:invokevirtual   #183 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putParcelable("on_reply", ((Parcelable) (unreadconversation.getReplyPendingIntent())));
	//   87  165:aload_3         
	//   88  166:ldc1            #47  <String "on_reply">
	//   89  168:aload_0         
	//   90  169:invokevirtual   #187 <Method PendingIntent NotificationCompat$CarExtender$UnreadConversation.getReplyPendingIntent()>
	//   91  172:invokevirtual   #183 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putParcelable("on_read", ((Parcelable) (unreadconversation.getReadPendingIntent())));
	//   92  175:aload_3         
	//   93  176:ldc1            #44  <String "on_read">
	//   94  178:aload_0         
	//   95  179:invokevirtual   #190 <Method PendingIntent NotificationCompat$CarExtender$UnreadConversation.getReadPendingIntent()>
	//   96  182:invokevirtual   #183 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putStringArray("participants", unreadconversation.getParticipants());
	//   97  185:aload_3         
	//   98  186:ldc1            #50  <String "participants">
	//   99  188:aload_0         
	//  100  189:invokevirtual   #116 <Method String[] NotificationCompat$CarExtender$UnreadConversation.getParticipants()>
	//  101  192:invokevirtual   #194 <Method void Bundle.putStringArray(String, String[])>
		bundle.putLong("timestamp", unreadconversation.getLatestTimestamp());
	//  102  195:aload_3         
	//  103  196:ldc1            #59  <String "timestamp">
	//  104  198:aload_0         
	//  105  199:invokevirtual   #198 <Method long NotificationCompat$CarExtender$UnreadConversation.getLatestTimestamp()>
	//  106  202:invokevirtual   #202 <Method void Bundle.putLong(String, long)>
		return bundle;
	//  107  205:aload_3         
	//  108  206:areturn         
	}

	private static UnreadConversation getUnreadConversationFromBundle(Bundle bundle)
	{
		String as[];
		android.support.v4.app.RemoteInput remoteinput;
label0:
		{
label1:
			{
				int i;
label2:
				{
					remoteinput = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
					if(bundle == null)
	//*   2    3:aload_0         
	//*   3    4:ifnonnull       9
						return null;
	//    4    7:aconst_null     
	//    5    8:areturn         
					Parcelable aparcelable[] = bundle.getParcelableArray("messages");
	//    6    9:aload_0         
	//    7   10:ldc1            #41  <String "messages">
	//    8   12:invokevirtual   #209 <Method Parcelable[] Bundle.getParcelableArray(String)>
	//    9   15:astore          5
					if(aparcelable == null)
						break label1;
	//   10   17:aload           5
	//   11   19:ifnull          98
					as = new String[aparcelable.length];
	//   12   22:aload           5
	//   13   24:arraylength     
	//   14   25:anewarray       String[]
	//   15   28:astore_3        
					boolean flag = false;
	//   16   29:iconst_0        
	//   17   30:istore_2        
					i = 0;
	//   18   31:iconst_0        
	//   19   32:istore_1        
					do
					{
						if(i >= as.length)
							break;
	//   20   33:iload_1         
	//   21   34:aload_3         
	//   22   35:arraylength     
	//   23   36:icmpge          87
						if(!(aparcelable[i] instanceof Bundle))
	//*  24   39:aload           5
	//*  25   41:iload_1         
	//*  26   42:aaload          
	//*  27   43:instanceof      #84  <Class Bundle>
	//*  28   46:ifne            54
						{
							i = ((int) (flag));
	//   29   49:iload_2         
	//   30   50:istore_1        
							break label2;
	//   31   51:goto            89
						}
						as[i] = ((Bundle)aparcelable[i]).getString("text");
	//   32   54:aload_3         
	//   33   55:iload_1         
	//   34   56:aload           5
	//   35   58:iload_1         
	//   36   59:aaload          
	//   37   60:checkcast       #84  <Class Bundle>
	//   38   63:ldc1            #56  <String "text">
	//   39   65:invokevirtual   #215 <Method String Bundle.getString(String)>
	//   40   68:aastore         
						if(as[i] == null)
	//*  41   69:aload_3         
	//*  42   70:iload_1         
	//*  43   71:aaload          
	//*  44   72:ifnonnull       80
						{
							i = ((int) (flag));
	//   45   75:iload_2         
	//   46   76:istore_1        
							break label2;
	//   47   77:goto            89
						}
						i++;
	//   48   80:iload_1         
	//   49   81:iconst_1        
	//   50   82:iadd            
	//   51   83:istore_1        
					} while(true);
	//   52   84:goto            33
					i = 1;
	//   53   87:iconst_1        
	//   54   88:istore_1        
				}
				if(i == 0)
	//*  55   89:iload_1         
	//*  56   90:ifeq            96
	//*  57   93:goto            100
					return null;
	//   58   96:aconst_null     
	//   59   97:areturn         
				break label0;
			}
			as = null;
	//   60   98:aconst_null     
	//   61   99:astore_3        
		}
		PendingIntent pendingintent = (PendingIntent)bundle.getParcelable("on_read");
	//   62  100:aload_0         
	//   63  101:ldc1            #44  <String "on_read">
	//   64  103:invokevirtual   #92  <Method Parcelable Bundle.getParcelable(String)>
	//   65  106:checkcast       #217 <Class PendingIntent>
	//   66  109:astore          5
		PendingIntent pendingintent1 = (PendingIntent)bundle.getParcelable("on_reply");
	//   67  111:aload_0         
	//   68  112:ldc1            #47  <String "on_reply">
	//   69  114:invokevirtual   #92  <Method Parcelable Bundle.getParcelable(String)>
	//   70  117:checkcast       #217 <Class PendingIntent>
	//   71  120:astore          6
		RemoteInput remoteinput1 = (RemoteInput)bundle.getParcelable("remote_input");
	//   72  122:aload_0         
	//   73  123:ldc1            #53  <String "remote_input">
	//   74  125:invokevirtual   #92  <Method Parcelable Bundle.getParcelable(String)>
	//   75  128:checkcast       #219 <Class RemoteInput>
	//   76  131:astore          8
		String as1[] = bundle.getStringArray("participants");
	//   77  133:aload_0         
	//   78  134:ldc1            #50  <String "participants">
	//   79  136:invokevirtual   #223 <Method String[] Bundle.getStringArray(String)>
	//   80  139:astore          7
		if(as1 != null)
	//*  81  141:aload           7
	//*  82  143:ifnull          218
		{
			if(as1.length != 1)
	//*  83  146:aload           7
	//*  84  148:arraylength     
	//*  85  149:iconst_1        
	//*  86  150:icmpeq          155
				return null;
	//   87  153:aconst_null     
	//   88  154:areturn         
			if(remoteinput1 != null)
	//*  89  155:aload           8
	//*  90  157:ifnull          195
				remoteinput = new android.support.v4.app.RemoteInput(remoteinput1.getResultKey(), remoteinput1.getLabel(), remoteinput1.getChoices(), remoteinput1.getAllowFreeFormInput(), remoteinput1.getExtras(), ((java.util.Set) (null)));
	//   91  160:new             #137 <Class android.support.v4.app.RemoteInput>
	//   92  163:dup             
	//   93  164:aload           8
	//   94  166:invokevirtual   #224 <Method String RemoteInput.getResultKey()>
	//   95  169:aload           8
	//   96  171:invokevirtual   #225 <Method CharSequence RemoteInput.getLabel()>
	//   97  174:aload           8
	//   98  176:invokevirtual   #226 <Method CharSequence[] RemoteInput.getChoices()>
	//   99  179:aload           8
	//  100  181:invokevirtual   #227 <Method boolean RemoteInput.getAllowFreeFormInput()>
	//  101  184:aload           8
	//  102  186:invokevirtual   #228 <Method Bundle RemoteInput.getExtras()>
	//  103  189:aconst_null     
	//  104  190:invokespecial   #231 <Method void android.support.v4.app.RemoteInput(String, CharSequence, CharSequence[], boolean, Bundle, java.util.Set)>
	//  105  193:astore          4
			return new UnreadConversation(as, remoteinput, pendingintent1, pendingintent, as1, bundle.getLong("timestamp"));
	//  106  195:new             #11  <Class NotificationCompat$CarExtender$UnreadConversation>
	//  107  198:dup             
	//  108  199:aload_3         
	//  109  200:aload           4
	//  110  202:aload           6
	//  111  204:aload           5
	//  112  206:aload           7
	//  113  208:aload_0         
	//  114  209:ldc1            #59  <String "timestamp">
	//  115  211:invokevirtual   #235 <Method long Bundle.getLong(String)>
	//  116  214:invokespecial   #238 <Method void NotificationCompat$CarExtender$UnreadConversation(String[], android.support.v4.app.RemoteInput, PendingIntent, PendingIntent, String[], long)>
	//  117  217:areturn         
		} else
		{
			return null;
	//  118  218:aconst_null     
	//  119  219:areturn         
		}
	}

	public NotificationCompat.Builder extend(NotificationCompat.Builder builder)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #78  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          10
			return builder;
	//    3    8:aload_1         
	//    4    9:areturn         
		Bundle bundle = new Bundle();
	//    5   10:new             #84  <Class Bundle>
	//    6   13:dup             
	//    7   14:invokespecial   #112 <Method void Bundle()>
	//    8   17:astore_3        
		Object obj = ((Object) (mLargeIcon));
	//    9   18:aload_0         
	//   10   19:getfield        #96  <Field Bitmap mLargeIcon>
	//   11   22:astore          4
		if(obj != null)
	//*  12   24:aload           4
	//*  13   26:ifnull          37
			bundle.putParcelable("large_icon", ((Parcelable) (obj)));
	//   14   29:aload_3         
	//   15   30:ldc1            #35  <String "large_icon">
	//   16   32:aload           4
	//   17   34:invokevirtual   #183 <Method void Bundle.putParcelable(String, Parcelable)>
		int i = mColor;
	//   18   37:aload_0         
	//   19   38:getfield        #71  <Field int mColor>
	//   20   41:istore_2        
		if(i != 0)
	//*  21   42:iload_2         
	//*  22   43:ifeq            53
			bundle.putInt("app_color", i);
	//   23   46:aload_3         
	//   24   47:ldc1            #26  <String "app_color">
	//   25   49:iload_2         
	//   26   50:invokevirtual   #244 <Method void Bundle.putInt(String, int)>
		obj = ((Object) (mUnreadConversation));
	//   27   53:aload_0         
	//   28   54:getfield        #106 <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
	//   29   57:astore          4
		if(obj != null)
	//*  30   59:aload           4
	//*  31   61:ifnull          75
			bundle.putBundle("car_conversation", getBundleForUnreadConversation(((UnreadConversation) (obj))));
	//   32   64:aload_3         
	//   33   65:ldc1            #29  <String "car_conversation">
	//   34   67:aload           4
	//   35   69:invokestatic    #246 <Method Bundle getBundleForUnreadConversation(NotificationCompat$CarExtender$UnreadConversation)>
	//   36   72:invokevirtual   #250 <Method void Bundle.putBundle(String, Bundle)>
		builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
	//   37   75:aload_1         
	//   38   76:invokevirtual   #253 <Method Bundle NotificationCompat$Builder.getExtras()>
	//   39   79:ldc1            #19  <String "android.car.EXTENSIONS">
	//   40   81:aload_3         
	//   41   82:invokevirtual   #250 <Method void Bundle.putBundle(String, Bundle)>
		return builder;
	//   42   85:aload_1         
	//   43   86:areturn         
	}

	public int getColor()
	{
		return mColor;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int mColor>
	//    2    4:ireturn         
	}

	public Bitmap getLargeIcon()
	{
		return mLargeIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field Bitmap mLargeIcon>
	//    2    4:areturn         
	}

	public UnreadConversation getUnreadConversation()
	{
		return mUnreadConversation;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
	//    2    4:areturn         
	}

	public NotificationCompat$CarExtender setColor(int i)
	{
		mColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field int mColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$CarExtender setLargeIcon(Bitmap bitmap)
	{
		mLargeIcon = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field Bitmap mLargeIcon>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$CarExtender setUnreadConversation(UnreadConversation unreadconversation)
	{
		mUnreadConversation = unreadconversation;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
	private static final String EXTRA_COLOR = "app_color";
	private static final String EXTRA_CONVERSATION = "car_conversation";
	static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
	private static final String EXTRA_LARGE_ICON = "large_icon";
	private static final String KEY_AUTHOR = "author";
	private static final String KEY_MESSAGES = "messages";
	private static final String KEY_ON_READ = "on_read";
	private static final String KEY_ON_REPLY = "on_reply";
	private static final String KEY_PARTICIPANTS = "participants";
	private static final String KEY_REMOTE_INPUT = "remote_input";
	private static final String KEY_TEXT = "text";
	private static final String KEY_TIMESTAMP = "timestamp";
	private int mColor;
	private Bitmap mLargeIcon;
	private UnreadConversation mUnreadConversation;

	public NotificationCompat$CarExtender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void Object()>
		mColor = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #71  <Field int mColor>
	//    5    9:return          
	}

	public NotificationCompat$CarExtender(Notification notification)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void Object()>
		mColor = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #71  <Field int mColor>
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   5    9:getstatic       #78  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          21
	//*   7   14:icmpge          18
			return;
	//    8   17:return          
		if(NotificationCompat.getExtras(notification) == null)
	//*   9   18:aload_1         
	//*  10   19:invokestatic    #82  <Method Bundle NotificationCompat.getExtras(Notification)>
	//*  11   22:ifnonnull       30
			notification = null;
	//   12   25:aconst_null     
	//   13   26:astore_1        
		else
	//*  14   27:goto            40
			notification = ((Notification) (NotificationCompat.getExtras(notification).getBundle("android.car.EXTENSIONS")));
	//   15   30:aload_1         
	//   16   31:invokestatic    #82  <Method Bundle NotificationCompat.getExtras(Notification)>
	//   17   34:ldc1            #19  <String "android.car.EXTENSIONS">
	//   18   36:invokevirtual   #88  <Method Bundle Bundle.getBundle(String)>
	//   19   39:astore_1        
		if(notification != null)
	//*  20   40:aload_1         
	//*  21   41:ifnull          81
		{
			mLargeIcon = (Bitmap)((Bundle) (notification)).getParcelable("large_icon");
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:ldc1            #35  <String "large_icon">
	//   25   48:invokevirtual   #92  <Method Parcelable Bundle.getParcelable(String)>
	//   26   51:checkcast       #94  <Class Bitmap>
	//   27   54:putfield        #96  <Field Bitmap mLargeIcon>
			mColor = ((Bundle) (notification)).getInt("app_color", 0);
	//   28   57:aload_0         
	//   29   58:aload_1         
	//   30   59:ldc1            #26  <String "app_color">
	//   31   61:iconst_0        
	//   32   62:invokevirtual   #100 <Method int Bundle.getInt(String, int)>
	//   33   65:putfield        #71  <Field int mColor>
			mUnreadConversation = getUnreadConversationFromBundle(((Bundle) (notification)).getBundle("car_conversation"));
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:ldc1            #29  <String "car_conversation">
	//   37   72:invokevirtual   #88  <Method Bundle Bundle.getBundle(String)>
	//   38   75:invokestatic    #104 <Method NotificationCompat$CarExtender$UnreadConversation getUnreadConversationFromBundle(Bundle)>
	//   39   78:putfield        #106 <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
		}
	//   40   81:return          
	}
}
