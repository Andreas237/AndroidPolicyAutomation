// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.server;

import android.content.Context;
import android.net.Credentials;
import android.net.LocalSocket;
import com.facebook.stetho.common.LogUtil;
import java.io.IOException;

// Referenced classes of package com.facebook.stetho.server:
//			SocketHandler, PeerAuthorizationException

public abstract class SecureSocketHandler
	implements SocketHandler
{

	public SecureSocketHandler(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Context mContext>
	//    5    9:return          
	}

	private static void enforcePermission(Context context, LocalSocket localsocket)
		throws IOException, PeerAuthorizationException
	{
		localsocket = ((LocalSocket) (localsocket.getPeerCredentials()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method Credentials LocalSocket.getPeerCredentials()>
	//    2    4:astore_1        
		int i = ((Credentials) (localsocket)).getUid();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #34  <Method int Credentials.getUid()>
	//    5    9:istore_2        
		int j = ((Credentials) (localsocket)).getPid();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #37  <Method int Credentials.getPid()>
	//    8   14:istore_3        
		if(LogUtil.isLoggable(2))
	//*   9   15:iconst_2        
	//*  10   16:invokestatic    #43  <Method boolean LogUtil.isLoggable(int)>
	//*  11   19:ifeq            45
			LogUtil.v("Got request from uid=%d, pid=%d", new Object[] {
				Integer.valueOf(i), Integer.valueOf(j)
			});
	//   12   22:ldc1            #45  <String "Got request from uid=%d, pid=%d">
	//   13   24:iconst_2        
	//   14   25:anewarray       Object[]
	//   15   28:dup             
	//   16   29:iconst_0        
	//   17   30:iload_2         
	//   18   31:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   19   34:aastore         
	//   20   35:dup             
	//   21   36:iconst_1        
	//   22   37:iload_3         
	//   23   38:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   24   41:aastore         
	//   25   42:invokestatic    #55  <Method void LogUtil.v(String, Object[])>
		if(context.checkPermission("android.permission.DUMP", j, i) == 0)
	//*  26   45:aload_0         
	//*  27   46:ldc1            #57  <String "android.permission.DUMP">
	//*  28   48:iload_3         
	//*  29   49:iload_2         
	//*  30   50:invokevirtual   #63  <Method int Context.checkPermission(String, int, int)>
	//*  31   53:ifne            57
		{
			return;
	//   32   56:return          
		} else
		{
			context = ((Context) (new StringBuilder()));
	//   33   57:new             #65  <Class StringBuilder>
	//   34   60:dup             
	//   35   61:invokespecial   #66  <Method void StringBuilder()>
	//   36   64:astore_0        
			((StringBuilder) (context)).append("Peer pid=");
	//   37   65:aload_0         
	//   38   66:ldc1            #68  <String "Peer pid=">
	//   39   68:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   40   71:pop             
			((StringBuilder) (context)).append(j);
	//   41   72:aload_0         
	//   42   73:iload_3         
	//   43   74:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   44   77:pop             
			((StringBuilder) (context)).append(", uid=");
	//   45   78:aload_0         
	//   46   79:ldc1            #77  <String ", uid=">
	//   47   81:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   48   84:pop             
			((StringBuilder) (context)).append(i);
	//   49   85:aload_0         
	//   50   86:iload_2         
	//   51   87:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   52   90:pop             
			((StringBuilder) (context)).append(" does not have ");
	//   53   91:aload_0         
	//   54   92:ldc1            #79  <String " does not have ">
	//   55   94:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   56   97:pop             
			((StringBuilder) (context)).append("android.permission.DUMP");
	//   57   98:aload_0         
	//   58   99:ldc1            #57  <String "android.permission.DUMP">
	//   59  101:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   60  104:pop             
			throw new PeerAuthorizationException(((StringBuilder) (context)).toString());
	//   61  105:new             #22  <Class PeerAuthorizationException>
	//   62  108:dup             
	//   63  109:aload_0         
	//   64  110:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   65  113:invokespecial   #86  <Method void PeerAuthorizationException(String)>
	//   66  116:athrow          
		}
	}

	public final void onAccepted(LocalSocket localsocket)
		throws IOException
	{
		try
		{
			enforcePermission(mContext, localsocket);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Context mContext>
	//    2    4:aload_1         
	//    3    5:invokestatic    #91  <Method void enforcePermission(Context, LocalSocket)>
			onSecured(localsocket);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #94  <Method void onSecured(LocalSocket)>
			return;
	//    7   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(LocalSocket localsocket)
	//*   8   14:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #65  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #66  <Method void StringBuilder()>
	//   12   22:astore_2        
			stringbuilder.append("Unauthorized request: ");
	//   13   23:aload_2         
	//   14   24:ldc1            #96  <String "Unauthorized request: ">
	//   15   26:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
			stringbuilder.append(((PeerAuthorizationException) (localsocket)).getMessage());
	//   17   30:aload_2         
	//   18   31:aload_1         
	//   19   32:invokevirtual   #99  <Method String PeerAuthorizationException.getMessage()>
	//   20   35:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   21   38:pop             
			LogUtil.e(stringbuilder.toString());
	//   22   39:aload_2         
	//   23   40:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   24   43:invokestatic    #102 <Method void LogUtil.e(String)>
			return;
	//   25   46:return          
		}
	}

	protected abstract void onSecured(LocalSocket localsocket)
		throws IOException;

	private final Context mContext;
}
