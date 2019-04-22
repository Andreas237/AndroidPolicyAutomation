// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.*;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.digits.sdk.android:
//			DigitsSessionVerifier, VerifyAccountResponse, DigitsSession, SessionListener

static class DigitsSessionVerifier$VerificationCallback extends Callback
{

	public void failure(TwitterException twitterexception)
	{
	//    0    0:return          
	}

	public void success(Result result)
	{
		if(result.data != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #36  <Field Object Result.data>
	//*   2    4:ifnull          105
		{
			result = ((Result) (DigitsSession.create((VerifyAccountResponse)result.data)));
	//    3    7:aload_1         
	//    4    8:getfield        #36  <Field Object Result.data>
	//    5   11:checkcast       #38  <Class VerifyAccountResponse>
	//    6   14:invokestatic    #44  <Method DigitsSession DigitsSession.create(VerifyAccountResponse)>
	//    7   17:astore_1        
			if(((DigitsSession) (result)).isValidUser() && !((DigitsSession) (result)).equals(((Object) (sessionManager.getSession(((DigitsSession) (result)).getId())))))
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #48  <Method boolean DigitsSession.isValidUser()>
	//*  10   22:ifeq            105
	//*  11   25:aload_1         
	//*  12   26:aload_0         
	//*  13   27:getfield        #23  <Field SessionManager sessionManager>
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #52  <Method long DigitsSession.getId()>
	//*  16   34:invokeinterface #58  <Method com.twitter.sdk.android.core.Session SessionManager.getSession(long)>
	//*  17   39:invokevirtual   #62  <Method boolean DigitsSession.equals(Object)>
	//*  18   42:ifne            105
			{
				sessionManager.setSession(((DigitsSession) (result)).getId(), ((com.twitter.sdk.android.core.Session) (result)));
	//   19   45:aload_0         
	//   20   46:getfield        #23  <Field SessionManager sessionManager>
	//   21   49:aload_1         
	//   22   50:invokevirtual   #52  <Method long DigitsSession.getId()>
	//   23   53:aload_1         
	//   24   54:invokeinterface #66  <Method void SessionManager.setSession(long, com.twitter.sdk.android.core.Session)>
				Iterator iterator = sessionListenerMap.keySet().iterator();
	//   25   59:aload_0         
	//   26   60:getfield        #21  <Field ConcurrentHashMap sessionListenerMap>
	//   27   63:invokevirtual   #72  <Method Set ConcurrentHashMap.keySet()>
	//   28   66:invokeinterface #78  <Method Iterator Set.iterator()>
	//   29   71:astore_2        
				do
				{
					if(!iterator.hasNext())
						break;
	//   30   72:aload_2         
	//   31   73:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//   32   78:ifeq            105
					SessionListener sessionlistener = (SessionListener)iterator.next();
	//   33   81:aload_2         
	//   34   82:invokeinterface #87  <Method Object Iterator.next()>
	//   35   87:checkcast       #89  <Class SessionListener>
	//   36   90:astore_3        
					if(sessionlistener != null)
	//*  37   91:aload_3         
	//*  38   92:ifnull          72
						sessionlistener.changed(((DigitsSession) (result)));
	//   39   95:aload_3         
	//   40   96:aload_1         
	//   41   97:invokeinterface #93  <Method void SessionListener.changed(DigitsSession)>
				} while(true);
	//   42  102:goto            72
			}
		}
	//   43  105:return          
	}

	private final ConcurrentHashMap sessionListenerMap;
	private final SessionManager sessionManager;

	DigitsSessionVerifier$VerificationCallback(ConcurrentHashMap concurrenthashmap, SessionManager sessionmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Callback()>
		sessionListenerMap = concurrenthashmap;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field ConcurrentHashMap sessionListenerMap>
		sessionManager = sessionmanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field SessionManager sessionManager>
	//    8   14:return          
	}
}
