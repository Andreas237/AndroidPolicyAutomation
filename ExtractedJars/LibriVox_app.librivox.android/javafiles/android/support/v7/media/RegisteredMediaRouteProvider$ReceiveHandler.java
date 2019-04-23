// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.*;
import android.util.Log;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.media:
//			RegisteredMediaRouteProvider

final class RegisteredMediaRouteProvider$ReceiveHandler extends Handler
{

	private boolean processMessage(RegisteredMediaRouteProvider.Connection connection, int i, int j, int k, Object obj, Bundle bundle)
	{
		switch(i)
	//*   0    0:iload_2         
		{
		default:
			break;

	//*   1    1:tableswitch     0 5: default 40
	//	               0 170
	//	               1 162
	//	               2 136
	//	               3 112
	//	               4 66
	//	               5 43
	//*   2   40:goto            178
		case 5: // '\005'
			if(obj == null || (obj instanceof Bundle))
	//*   3   43:aload           5
	//*   4   45:ifnull          56
	//*   5   48:aload           5
	//*   6   50:instanceof      #23  <Class Bundle>
	//*   7   53:ifeq            178
				return connection.onDescriptorChanged((Bundle)obj);
	//    8   56:aload_1         
	//    9   57:aload           5
	//   10   59:checkcast       #23  <Class Bundle>
	//   11   62:invokevirtual   #29  <Method boolean RegisteredMediaRouteProvider$Connection.onDescriptorChanged(Bundle)>
	//   12   65:ireturn         
			break;

		case 4: // '\004'
			if(obj != null && !(obj instanceof Bundle))
				break;
	//   13   66:aload           5
	//   14   68:ifnull          79
	//   15   71:aload           5
	//   16   73:instanceof      #23  <Class Bundle>
	//   17   76:ifeq            178
			if(bundle == null)
	//*  18   79:aload           6
	//*  19   81:ifnonnull       90
				bundle = null;
	//   20   84:aconst_null     
	//   21   85:astore          6
			else
	//*  22   87:goto            99
				bundle = ((Bundle) (bundle.getString("error")));
	//   23   90:aload           6
	//   24   92:ldc1            #31  <String "error">
	//   25   94:invokevirtual   #35  <Method String Bundle.getString(String)>
	//   26   97:astore          6
			return connection.onControlRequestFailed(j, ((String) (bundle)), (Bundle)obj);
	//   27   99:aload_1         
	//   28  100:iload_3         
	//   29  101:aload           6
	//   30  103:aload           5
	//   31  105:checkcast       #23  <Class Bundle>
	//   32  108:invokevirtual   #39  <Method boolean RegisteredMediaRouteProvider$Connection.onControlRequestFailed(int, String, Bundle)>
	//   33  111:ireturn         

		case 3: // '\003'
			if(obj == null || (obj instanceof Bundle))
	//*  34  112:aload           5
	//*  35  114:ifnull          125
	//*  36  117:aload           5
	//*  37  119:instanceof      #23  <Class Bundle>
	//*  38  122:ifeq            178
				return connection.onControlRequestSucceeded(j, (Bundle)obj);
	//   39  125:aload_1         
	//   40  126:iload_3         
	//   41  127:aload           5
	//   42  129:checkcast       #23  <Class Bundle>
	//   43  132:invokevirtual   #43  <Method boolean RegisteredMediaRouteProvider$Connection.onControlRequestSucceeded(int, Bundle)>
	//   44  135:ireturn         
			break;

		case 2: // '\002'
			if(obj == null || (obj instanceof Bundle))
	//*  45  136:aload           5
	//*  46  138:ifnull          149
	//*  47  141:aload           5
	//*  48  143:instanceof      #23  <Class Bundle>
	//*  49  146:ifeq            178
				return connection.onRegistered(j, k, (Bundle)obj);
	//   50  149:aload_1         
	//   51  150:iload_3         
	//   52  151:iload           4
	//   53  153:aload           5
	//   54  155:checkcast       #23  <Class Bundle>
	//   55  158:invokevirtual   #47  <Method boolean RegisteredMediaRouteProvider$Connection.onRegistered(int, int, Bundle)>
	//   56  161:ireturn         
			break;

		case 1: // '\001'
			connection.onGenericSuccess(j);
	//   57  162:aload_1         
	//   58  163:iload_3         
	//   59  164:invokevirtual   #51  <Method boolean RegisteredMediaRouteProvider$Connection.onGenericSuccess(int)>
	//   60  167:pop             
			return true;
	//   61  168:iconst_1        
	//   62  169:ireturn         

		case 0: // '\0'
			connection.onGenericFailure(j);
	//   63  170:aload_1         
	//   64  171:iload_3         
	//   65  172:invokevirtual   #54  <Method boolean RegisteredMediaRouteProvider$Connection.onGenericFailure(int)>
	//   66  175:pop             
			return true;
	//   67  176:iconst_1        
	//   68  177:ireturn         
		}
		return false;
	//   69  178:iconst_0        
	//   70  179:ireturn         
	}

	public void dispose()
	{
		mConnectionRef.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field WeakReference mConnectionRef>
	//    2    4:invokevirtual   #58  <Method void WeakReference.clear()>
	//    3    7:return          
	}

	public void handleMessage(Message message)
	{
		RegisteredMediaRouteProvider.Connection connection = (RegisteredMediaRouteProvider.Connection)mConnectionRef.get();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field WeakReference mConnectionRef>
	//    2    4:invokevirtual   #64  <Method Object WeakReference.get()>
	//    3    7:checkcast       #25  <Class RegisteredMediaRouteProvider$Connection>
	//    4   10:astore_2        
		if(connection != null && !processMessage(connection, message.what, message.arg1, message.arg2, message.obj, message.peekData()) && RegisteredMediaRouteProvider.DEBUG)
	//*   5   11:aload_2         
	//*   6   12:ifnull          80
	//*   7   15:aload_0         
	//*   8   16:aload_2         
	//*   9   17:aload_1         
	//*  10   18:getfield        #70  <Field int Message.what>
	//*  11   21:aload_1         
	//*  12   22:getfield        #73  <Field int Message.arg1>
	//*  13   25:aload_1         
	//*  14   26:getfield        #76  <Field int Message.arg2>
	//*  15   29:aload_1         
	//*  16   30:getfield        #80  <Field Object Message.obj>
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #84  <Method Bundle Message.peekData()>
	//*  19   37:invokespecial   #86  <Method boolean processMessage(RegisteredMediaRouteProvider$Connection, int, int, int, Object, Bundle)>
	//*  20   40:ifne            80
	//*  21   43:getstatic       #92  <Field boolean RegisteredMediaRouteProvider.DEBUG>
	//*  22   46:ifeq            80
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   23   49:new             #94  <Class StringBuilder>
	//   24   52:dup             
	//   25   53:invokespecial   #95  <Method void StringBuilder()>
	//   26   56:astore_2        
			stringbuilder.append("Unhandled message from server: ");
	//   27   57:aload_2         
	//   28   58:ldc1            #97  <String "Unhandled message from server: ">
	//   29   60:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   30   63:pop             
			stringbuilder.append(((Object) (message)));
	//   31   64:aload_2         
	//   32   65:aload_1         
	//   33   66:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//   34   69:pop             
			Log.d("MediaRouteProviderProxy", stringbuilder.toString());
	//   35   70:ldc1            #106 <String "MediaRouteProviderProxy">
	//   36   72:aload_2         
	//   37   73:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   38   76:invokestatic    #116 <Method int Log.d(String, String)>
	//   39   79:pop             
		}
	//   40   80:return          
	}

	private final WeakReference mConnectionRef;

	public RegisteredMediaRouteProvider$ReceiveHandler(RegisteredMediaRouteProvider.Connection connection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Handler()>
		mConnectionRef = new WeakReference(((Object) (connection)));
	//    2    4:aload_0         
	//    3    5:new             #13  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #16  <Method void WeakReference(Object)>
	//    7   13:putfield        #18  <Field WeakReference mConnectionRef>
	//    8   16:return          
	}
}
