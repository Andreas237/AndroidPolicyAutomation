// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;

// Referenced classes of package bo.app:
//			ef

static final class ef$1
	implements OnFailureListener
{

	public void onFailure(Exception exception)
	{
		if(exception instanceof ApiException)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #21  <Class ApiException>
	//*   2    4:ifeq            198
		{
			int i = ((ApiException)exception).getStatusCode();
	//    3    7:aload_1         
	//    4    8:checkcast       #21  <Class ApiException>
	//    5   11:invokevirtual   #25  <Method int ApiException.getStatusCode()>
	//    6   14:istore_2        
			if(i != 0)
	//*   7   15:iload_2         
	//*   8   16:ifeq            188
			{
				switch(i)
	//*   9   19:iload_2         
				{
	//*  10   20:tableswitch     1000 1002: default 48
	//	               1000 153
	//	               1001 118
	//	               1002 83
				default:
					exception = ((Exception) (ef.a()));
	//   11   48:invokestatic    #29  <Method String ef.a()>
	//   12   51:astore_1        
					StringBuilder stringbuilder = new StringBuilder();
	//   13   52:new             #31  <Class StringBuilder>
	//   14   55:dup             
	//   15   56:invokespecial   #32  <Method void StringBuilder()>
	//   16   59:astore_3        
					stringbuilder.append("Geofence pending result returned unknown status code: ");
	//   17   60:aload_3         
	//   18   61:ldc1            #34  <String "Geofence pending result returned unknown status code: ">
	//   19   63:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   20   66:pop             
					stringbuilder.append(i);
	//   21   67:aload_3         
	//   22   68:iload_2         
	//   23   69:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   24   72:pop             
					AppboyLogger.w(((String) (exception)), stringbuilder.toString());
	//   25   73:aload_1         
	//   26   74:aload_3         
	//   27   75:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   28   78:invokestatic    #50  <Method int AppboyLogger.w(String, String)>
	//   29   81:pop             
					return;
	//   30   82:return          

				case 1002: 
					exception = ((Exception) (ef.a()));
	//   31   83:invokestatic    #29  <Method String ef.a()>
	//   32   86:astore_1        
					StringBuilder stringbuilder1 = new StringBuilder();
	//   33   87:new             #31  <Class StringBuilder>
	//   34   90:dup             
	//   35   91:invokespecial   #32  <Method void StringBuilder()>
	//   36   94:astore_3        
					stringbuilder1.append("Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ");
	//   37   95:aload_3         
	//   38   96:ldc1            #52  <String "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ">
	//   39   98:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   40  101:pop             
					stringbuilder1.append(i);
	//   41  102:aload_3         
	//   42  103:iload_2         
	//   43  104:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   44  107:pop             
					AppboyLogger.w(((String) (exception)), stringbuilder1.toString());
	//   45  108:aload_1         
	//   46  109:aload_3         
	//   47  110:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   48  113:invokestatic    #50  <Method int AppboyLogger.w(String, String)>
	//   49  116:pop             
					return;
	//   50  117:return          

				case 1001: 
					exception = ((Exception) (ef.a()));
	//   51  118:invokestatic    #29  <Method String ef.a()>
	//   52  121:astore_1        
					StringBuilder stringbuilder2 = new StringBuilder();
	//   53  122:new             #31  <Class StringBuilder>
	//   54  125:dup             
	//   55  126:invokespecial   #32  <Method void StringBuilder()>
	//   56  129:astore_3        
					stringbuilder2.append("Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ");
	//   57  130:aload_3         
	//   58  131:ldc1            #54  <String "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ">
	//   59  133:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   60  136:pop             
					stringbuilder2.append(i);
	//   61  137:aload_3         
	//   62  138:iload_2         
	//   63  139:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   64  142:pop             
					AppboyLogger.w(((String) (exception)), stringbuilder2.toString());
	//   65  143:aload_1         
	//   66  144:aload_3         
	//   67  145:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   68  148:invokestatic    #50  <Method int AppboyLogger.w(String, String)>
	//   69  151:pop             
					return;
	//   70  152:return          

				case 1000: 
					exception = ((Exception) (ef.a()));
	//   71  153:invokestatic    #29  <Method String ef.a()>
	//   72  156:astore_1        
					StringBuilder stringbuilder3 = new StringBuilder();
	//   73  157:new             #31  <Class StringBuilder>
	//   74  160:dup             
	//   75  161:invokespecial   #32  <Method void StringBuilder()>
	//   76  164:astore_3        
					stringbuilder3.append("Geofences not registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ");
	//   77  165:aload_3         
	//   78  166:ldc1            #56  <String "Geofences not registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ">
	//   79  168:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   80  171:pop             
					stringbuilder3.append(i);
	//   81  172:aload_3         
	//   82  173:iload_2         
	//   83  174:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   84  177:pop             
					AppboyLogger.w(((String) (exception)), stringbuilder3.toString());
	//   85  178:aload_1         
	//   86  179:aload_3         
	//   87  180:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   88  183:invokestatic    #50  <Method int AppboyLogger.w(String, String)>
	//   89  186:pop             
					return;
	//   90  187:return          
				}
			} else
			{
				AppboyLogger.d(ef.a(), "Received Geofence registration success code in failure block with Google Play Services.");
	//   91  188:invokestatic    #29  <Method String ef.a()>
	//   92  191:ldc1            #58  <String "Received Geofence registration success code in failure block with Google Play Services.">
	//   93  193:invokestatic    #61  <Method int AppboyLogger.d(String, String)>
	//   94  196:pop             
				return;
	//   95  197:return          
			}
		} else
		{
			AppboyLogger.e(ef.a(), "Geofence exception encountered while adding geofences.", ((Throwable) (exception)));
	//   96  198:invokestatic    #29  <Method String ef.a()>
	//   97  201:ldc1            #63  <String "Geofence exception encountered while adding geofences.">
	//   98  203:aload_1         
	//   99  204:invokestatic    #67  <Method int AppboyLogger.e(String, String, Throwable)>
	//  100  207:pop             
			return;
	//  101  208:return          
		}
	}

	ef$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
