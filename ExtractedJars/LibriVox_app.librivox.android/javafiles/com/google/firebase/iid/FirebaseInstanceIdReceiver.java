// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.iid;

import android.content.*;
import android.content.pm.ApplicationInfo;
import android.support.v4.a.u;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.o;

// Referenced classes of package com.google.firebase.iid:
//			z, al

public final class FirebaseInstanceIdReceiver extends u
{

	public FirebaseInstanceIdReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void u()>
	//    2    4:return          
	}

	public static int a(BroadcastReceiver broadcastreceiver, Context context, String s, Intent intent)
	{
		boolean flag1 = o.k();
	//    0    0:invokestatic    #28  <Method boolean o.k()>
	//    1    3:istore          6
		boolean flag = true;
	//    2    5:iconst_1        
	//    3    6:istore          5
		int i;
		if(flag1 && context.getApplicationInfo().targetSdkVersion >= 26)
	//*   4    8:iload           6
	//*   5   10:ifeq            31
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #34  <Method ApplicationInfo Context.getApplicationInfo()>
	//*   8   17:getfield        #40  <Field int ApplicationInfo.targetSdkVersion>
	//*   9   20:bipush          26
	//*  10   22:icmplt          31
			i = 1;
	//   11   25:iconst_1        
	//   12   26:istore          4
		else
	//*  13   28:goto            34
			i = 0;
	//   14   31:iconst_0        
	//   15   32:istore          4
		if((intent.getFlags() & 0x10000000) == 0)
	//*  16   34:aload_3         
	//*  17   35:invokevirtual   #46  <Method int Intent.getFlags()>
	//*  18   38:ldc1            #47  <Int 0x10000000>
	//*  19   40:iand            
	//*  20   41:ifeq            47
	//*  21   44:goto            50
			flag = false;
	//   22   47:iconst_0        
	//   23   48:istore          5
		if(i && !flag)
	//*  24   50:iload           4
	//*  25   52:ifeq            68
	//*  26   55:iload           5
	//*  27   57:ifne            68
			return b(broadcastreceiver, context, s, intent);
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:aload_2         
	//   31   63:aload_3         
	//   32   64:invokestatic    #49  <Method int b(BroadcastReceiver, Context, String, Intent)>
	//   33   67:ireturn         
		i = z.a().a(context, s, intent);
	//   34   68:invokestatic    #54  <Method z z.a()>
	//   35   71:aload_1         
	//   36   72:aload_2         
	//   37   73:aload_3         
	//   38   74:invokevirtual   #57  <Method int z.a(Context, String, Intent)>
	//   39   77:istore          4
		if(o.k() && i == 402)
	//*  40   79:invokestatic    #28  <Method boolean o.k()>
	//*  41   82:ifeq            105
	//*  42   85:iload           4
	//*  43   87:sipush          402
	//*  44   90:icmpne          105
		{
			b(broadcastreceiver, context, s, intent);
	//   45   93:aload_0         
	//   46   94:aload_1         
	//   47   95:aload_2         
	//   48   96:aload_3         
	//   49   97:invokestatic    #49  <Method int b(BroadcastReceiver, Context, String, Intent)>
	//   50  100:pop             
			return 403;
	//   51  101:sipush          403
	//   52  104:ireturn         
		} else
		{
			return i;
	//   53  105:iload           4
	//   54  107:ireturn         
		}
	}

	private static al a(Context context, String s)
	{
		com/google/firebase/iid/FirebaseInstanceIdReceiver;
	//    0    0:ldc1            #2   <Class FirebaseInstanceIdReceiver>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(!"com.google.firebase.MESSAGING_EVENT".equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_39;
	//    2    3:ldc1            #61  <String "com.google.firebase.MESSAGING_EVENT">
	//    3    5:aload_1         
	//    4    6:invokevirtual   #67  <Method boolean String.equals(Object)>
	//    5    9:ifeq            39
		if(c == null)
	//*   6   12:getstatic       #69  <Field al c>
	//*   7   15:ifnonnull       30
			c = new al(context, s);
	//    8   18:new             #71  <Class al>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #74  <Method void al(Context, String)>
	//   13   27:putstatic       #69  <Field al c>
		context = ((Context) (c));
	//   14   30:getstatic       #69  <Field al c>
	//   15   33:astore_0        
		com/google/firebase/iid/FirebaseInstanceIdReceiver;
	//   16   34:ldc1            #2   <Class FirebaseInstanceIdReceiver>
		JVM INSTR monitorexit ;
	//   17   36:monitorexit     
		return ((al) (context));
	//   18   37:aload_0         
	//   19   38:areturn         
		if(b == null)
	//*  20   39:getstatic       #76  <Field al b>
	//*  21   42:ifnonnull       57
			b = new al(context, s);
	//   22   45:new             #71  <Class al>
	//   23   48:dup             
	//   24   49:aload_0         
	//   25   50:aload_1         
	//   26   51:invokespecial   #74  <Method void al(Context, String)>
	//   27   54:putstatic       #76  <Field al b>
		context = ((Context) (b));
	//   28   57:getstatic       #76  <Field al b>
	//   29   60:astore_0        
		com/google/firebase/iid/FirebaseInstanceIdReceiver;
	//   30   61:ldc1            #2   <Class FirebaseInstanceIdReceiver>
		JVM INSTR monitorexit ;
	//   31   63:monitorexit     
		return ((al) (context));
	//   32   64:aload_0         
	//   33   65:areturn         
		context;
	//   34   66:astore_0        
	//*  35   67:ldc1            #2   <Class FirebaseInstanceIdReceiver>
		throw context;
	//   36   69:monitorexit     
	//   37   70:aload_0         
	//   38   71:athrow          
	}

	private final void a(Context context, Intent intent, String s)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		intent.setComponent(((android.content.ComponentName) (null)));
	//    2    3:aload_2         
	//    3    4:aconst_null     
	//    4    5:invokevirtual   #81  <Method Intent Intent.setComponent(android.content.ComponentName)>
	//    5    8:pop             
		intent.setPackage(context.getPackageName());
	//    6    9:aload_2         
	//    7   10:aload_1         
	//    8   11:invokevirtual   #85  <Method String Context.getPackageName()>
	//    9   14:invokevirtual   #89  <Method Intent Intent.setPackage(String)>
	//   10   17:pop             
		if(android.os.Build.VERSION.SDK_INT <= 18)
	//*  11   18:getstatic       #94  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   21:bipush          18
	//*  13   23:icmpgt          34
			intent.removeCategory(context.getPackageName());
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #85  <Method String Context.getPackageName()>
	//   17   31:invokevirtual   #98  <Method void Intent.removeCategory(String)>
		String s1 = intent.getStringExtra("gcm.rawData64");
	//   18   34:aload_2         
	//   19   35:ldc1            #100 <String "gcm.rawData64">
	//   20   37:invokevirtual   #104 <Method String Intent.getStringExtra(String)>
	//   21   40:astore          6
		if(s1 != null)
	//*  22   42:aload           6
	//*  23   44:ifnull          66
		{
			intent.putExtra("rawData", Base64.decode(s1, 0));
	//   24   47:aload_2         
	//   25   48:ldc1            #106 <String "rawData">
	//   26   50:aload           6
	//   27   52:iconst_0        
	//   28   53:invokestatic    #112 <Method byte[] Base64.decode(String, int)>
	//   29   56:invokevirtual   #116 <Method Intent Intent.putExtra(String, byte[])>
	//   30   59:pop             
			intent.removeExtra("gcm.rawData64");
	//   31   60:aload_2         
	//   32   61:ldc1            #100 <String "gcm.rawData64">
	//   33   63:invokevirtual   #119 <Method void Intent.removeExtra(String)>
		}
		if(!"google.com/iid".equals(((Object) (intent.getStringExtra("from")))) && !"com.google.firebase.INSTANCE_ID_EVENT".equals(((Object) (s))))
	//*  34   66:ldc1            #121 <String "google.com/iid">
	//*  35   68:aload_2         
	//*  36   69:ldc1            #123 <String "from">
	//*  37   71:invokevirtual   #104 <Method String Intent.getStringExtra(String)>
	//*  38   74:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  39   77:ifne            133
	//*  40   80:ldc1            #125 <String "com.google.firebase.INSTANCE_ID_EVENT">
	//*  41   82:aload_3         
	//*  42   83:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  43   86:ifeq            92
	//*  44   89:goto            133
		{
			if(!"com.google.android.c2dm.intent.RECEIVE".equals(((Object) (s))) && !"com.google.firebase.MESSAGING_EVENT".equals(((Object) (s))))
	//*  45   92:ldc1            #127 <String "com.google.android.c2dm.intent.RECEIVE">
	//*  46   94:aload_3         
	//*  47   95:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  48   98:ifne            127
	//*  49  101:ldc1            #61  <String "com.google.firebase.MESSAGING_EVENT">
	//*  50  103:aload_3         
	//*  51  104:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  52  107:ifeq            113
	//*  53  110:goto            127
			{
				Log.d("FirebaseInstanceId", "Unexpected intent");
	//   54  113:ldc1            #129 <String "FirebaseInstanceId">
	//   55  115:ldc1            #131 <String "Unexpected intent">
	//   56  117:invokestatic    #137 <Method int Log.d(String, String)>
	//   57  120:pop             
				s = ((String) (obj));
	//   58  121:aload           5
	//   59  123:astore_3        
			} else
	//*  60  124:goto            136
			{
				s = "com.google.firebase.MESSAGING_EVENT";
	//   61  127:ldc1            #61  <String "com.google.firebase.MESSAGING_EVENT">
	//   62  129:astore_3        
			}
		} else
	//*  63  130:goto            136
		{
			s = "com.google.firebase.INSTANCE_ID_EVENT";
	//   64  133:ldc1            #125 <String "com.google.firebase.INSTANCE_ID_EVENT">
	//   65  135:astore_3        
		}
		int i = -1;
	//   66  136:iconst_m1       
	//   67  137:istore          4
		if(s != null)
	//*  68  139:aload_3         
	//*  69  140:ifnull          152
			i = a(((BroadcastReceiver) (this)), context, s, intent);
	//   70  143:aload_0         
	//   71  144:aload_1         
	//   72  145:aload_3         
	//   73  146:aload_2         
	//   74  147:invokestatic    #139 <Method int a(BroadcastReceiver, Context, String, Intent)>
	//   75  150:istore          4
		if(isOrderedBroadcast())
	//*  76  152:aload_0         
	//*  77  153:invokevirtual   #142 <Method boolean isOrderedBroadcast()>
	//*  78  156:ifeq            165
			setResultCode(i);
	//   79  159:aload_0         
	//   80  160:iload           4
	//   81  162:invokevirtual   #146 <Method void setResultCode(int)>
	//   82  165:return          
	}

	private static int b(BroadcastReceiver broadcastreceiver, Context context, String s, Intent intent)
	{
		if(Log.isLoggable("FirebaseInstanceId", 3))
	//*   0    0:ldc1            #129 <String "FirebaseInstanceId">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #150 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            54
		{
			String s1 = String.valueOf(((Object) (s)));
	//    4    9:aload_2         
	//    5   10:invokestatic    #154 <Method String String.valueOf(Object)>
	//    6   13:astore          4
			if(s1.length() != 0)
	//*   7   15:aload           4
	//*   8   17:invokevirtual   #157 <Method int String.length()>
	//*   9   20:ifeq            35
				s1 = "Binding to service: ".concat(s1);
	//   10   23:ldc1            #159 <String "Binding to service: ">
	//   11   25:aload           4
	//   12   27:invokevirtual   #162 <Method String String.concat(String)>
	//   13   30:astore          4
			else
	//*  14   32:goto            46
				s1 = new String("Binding to service: ");
	//   15   35:new             #63  <Class String>
	//   16   38:dup             
	//   17   39:ldc1            #159 <String "Binding to service: ">
	//   18   41:invokespecial   #164 <Method void String(String)>
	//   19   44:astore          4
			Log.d("FirebaseInstanceId", s1);
	//   20   46:ldc1            #129 <String "FirebaseInstanceId">
	//   21   48:aload           4
	//   22   50:invokestatic    #137 <Method int Log.d(String, String)>
	//   23   53:pop             
		}
		if(broadcastreceiver.isOrderedBroadcast())
	//*  24   54:aload_0         
	//*  25   55:invokevirtual   #167 <Method boolean BroadcastReceiver.isOrderedBroadcast()>
	//*  26   58:ifeq            66
			broadcastreceiver.setResultCode(-1);
	//   27   61:aload_0         
	//   28   62:iconst_m1       
	//   29   63:invokevirtual   #168 <Method void BroadcastReceiver.setResultCode(int)>
		a(context, s).a(intent, broadcastreceiver.goAsync());
	//   30   66:aload_1         
	//   31   67:aload_2         
	//   32   68:invokestatic    #170 <Method al a(Context, String)>
	//   33   71:aload_3         
	//   34   72:aload_0         
	//   35   73:invokevirtual   #174 <Method android.content.BroadcastReceiver$PendingResult BroadcastReceiver.goAsync()>
	//   36   76:invokevirtual   #177 <Method void al.a(Intent, android.content.BroadcastReceiver$PendingResult)>
		return -1;
	//   37   79:iconst_m1       
	//   38   80:ireturn         
	}

	public final void onReceive(Context context, Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Object obj = ((Object) (intent.getParcelableExtra("wrapped_intent")));
	//    3    5:aload_2         
	//    4    6:ldc1            #181 <String "wrapped_intent">
	//    5    8:invokevirtual   #185 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//    6   11:astore_3        
		if(obj instanceof Intent)
	//*   7   12:aload_3         
	//*   8   13:instanceof      #42  <Class Intent>
	//*   9   16:ifeq            27
			obj = ((Object) ((Intent)obj));
	//   10   19:aload_3         
	//   11   20:checkcast       #42  <Class Intent>
	//   12   23:astore_3        
		else
	//*  13   24:goto            29
			obj = null;
	//   14   27:aconst_null     
	//   15   28:astore_3        
		if(obj != null)
	//*  16   29:aload_3         
	//*  17   30:ifnull          44
		{
			a(context, ((Intent) (obj)), intent.getAction());
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:aload_3         
	//   21   36:aload_2         
	//   22   37:invokevirtual   #188 <Method String Intent.getAction()>
	//   23   40:invokespecial   #190 <Method void a(Context, Intent, String)>
			return;
	//   24   43:return          
		} else
		{
			a(context, intent, intent.getAction());
	//   25   44:aload_0         
	//   26   45:aload_1         
	//   27   46:aload_2         
	//   28   47:aload_2         
	//   29   48:invokevirtual   #188 <Method String Intent.getAction()>
	//   30   51:invokespecial   #190 <Method void a(Context, Intent, String)>
			return;
	//   31   54:return          
		}
	}

	private static boolean a = false;
	private static al b;
	private static al c;

	static 
	{
	//    0    0:return          
	}
}
