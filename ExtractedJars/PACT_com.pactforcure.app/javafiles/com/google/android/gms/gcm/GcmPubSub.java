// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.iid.InstanceID;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GcmPubSub
{

	private GcmPubSub(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		zzbfO = InstanceID.getInstance(context);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #33  <Method InstanceID InstanceID.getInstance(Context)>
	//    5    9:putfield        #35  <Field InstanceID zzbfO>
	//    6   12:return          
	}

	public static GcmPubSub getInstance(Context context)
	{
		com/google/android/gms/gcm/GcmPubSub;
	//    0    0:ldc1            #2   <Class GcmPubSub>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzbfN == null)
	//*   2    3:getstatic       #38  <Field GcmPubSub zzbfN>
	//*   3    6:ifnonnull       20
			zzbfN = new GcmPubSub(context);
	//    4    9:new             #2   <Class GcmPubSub>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokespecial   #40  <Method void GcmPubSub(Context)>
	//    8   17:putstatic       #38  <Field GcmPubSub zzbfN>
		context = ((Context) (zzbfN));
	//    9   20:getstatic       #38  <Field GcmPubSub zzbfN>
	//   10   23:astore_0        
		com/google/android/gms/gcm/GcmPubSub;
	//   11   24:ldc1            #2   <Class GcmPubSub>
		JVM INSTR monitorexit ;
	//   12   26:monitorexit     
		return ((GcmPubSub) (context));
	//   13   27:aload_0         
	//   14   28:areturn         
		context;
	//   15   29:astore_0        
	//*  16   30:ldc1            #2   <Class GcmPubSub>
		throw context;
	//   17   32:monitorexit     
	//   18   33:aload_0         
	//   19   34:athrow          
	}

	public void subscribe(String s, String s1, Bundle bundle)
		throws IOException
	{
		if(s == null || s.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #53  <Method boolean String.isEmpty()>
	//*   4    8:ifeq            52
		{
			s = String.valueOf(((Object) (s)));
	//    5   11:aload_1         
	//    6   12:invokestatic    #57  <Method String String.valueOf(Object)>
	//    7   15:astore_1        
			if(s.length() != 0)
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #61  <Method int String.length()>
	//*  10   20:ifeq            39
				s = "Invalid appInstanceToken: ".concat(s);
	//   11   23:ldc1            #63  <String "Invalid appInstanceToken: ">
	//   12   25:aload_1         
	//   13   26:invokevirtual   #67  <Method String String.concat(String)>
	//   14   29:astore_1        
			else
	//*  15   30:new             #69  <Class IllegalArgumentException>
	//*  16   33:dup             
	//*  17   34:aload_1         
	//*  18   35:invokespecial   #72  <Method void IllegalArgumentException(String)>
	//*  19   38:athrow          
				s = new String("Invalid appInstanceToken: ");
	//   20   39:new             #49  <Class String>
	//   21   42:dup             
	//   22   43:ldc1            #63  <String "Invalid appInstanceToken: ">
	//   23   45:invokespecial   #73  <Method void String(String)>
	//   24   48:astore_1        
			throw new IllegalArgumentException(s);
		}
	//*  25   49:goto            30
		if(s1 == null || !zzbfP.matcher(((CharSequence) (s1))).matches())
	//*  26   52:aload_2         
	//*  27   53:ifnull          69
	//*  28   56:getstatic       #22  <Field Pattern zzbfP>
	//*  29   59:aload_2         
	//*  30   60:invokevirtual   #77  <Method Matcher Pattern.matcher(CharSequence)>
	//*  31   63:invokevirtual   #82  <Method boolean Matcher.matches()>
	//*  32   66:ifne            110
		{
			s = String.valueOf(((Object) (s1)));
	//   33   69:aload_2         
	//   34   70:invokestatic    #57  <Method String String.valueOf(Object)>
	//   35   73:astore_1        
			if(s.length() != 0)
	//*  36   74:aload_1         
	//*  37   75:invokevirtual   #61  <Method int String.length()>
	//*  38   78:ifeq            97
				s = "Invalid topic name: ".concat(s);
	//   39   81:ldc1            #84  <String "Invalid topic name: ">
	//   40   83:aload_1         
	//   41   84:invokevirtual   #67  <Method String String.concat(String)>
	//   42   87:astore_1        
			else
	//*  43   88:new             #69  <Class IllegalArgumentException>
	//*  44   91:dup             
	//*  45   92:aload_1         
	//*  46   93:invokespecial   #72  <Method void IllegalArgumentException(String)>
	//*  47   96:athrow          
				s = new String("Invalid topic name: ");
	//   48   97:new             #49  <Class String>
	//   49  100:dup             
	//   50  101:ldc1            #84  <String "Invalid topic name: ">
	//   51  103:invokespecial   #73  <Method void String(String)>
	//   52  106:astore_1        
			throw new IllegalArgumentException(s);
		}
	//*  53  107:goto            88
		Bundle bundle1 = bundle;
	//   54  110:aload_3         
	//   55  111:astore          4
		if(bundle == null)
	//*  56  113:aload_3         
	//*  57  114:ifnonnull       126
			bundle1 = new Bundle();
	//   58  117:new             #86  <Class Bundle>
	//   59  120:dup             
	//   60  121:invokespecial   #87  <Method void Bundle()>
	//   61  124:astore          4
		bundle1.putString("gcm.topic", s1);
	//   62  126:aload           4
	//   63  128:ldc1            #89  <String "gcm.topic">
	//   64  130:aload_2         
	//   65  131:invokevirtual   #93  <Method void Bundle.putString(String, String)>
		zzbfO.getToken(s, s1, bundle1);
	//   66  134:aload_0         
	//   67  135:getfield        #35  <Field InstanceID zzbfO>
	//   68  138:aload_1         
	//   69  139:aload_2         
	//   70  140:aload           4
	//   71  142:invokevirtual   #97  <Method String InstanceID.getToken(String, String, Bundle)>
	//   72  145:pop             
	//   73  146:return          
	}

	public void unsubscribe(String s, String s1)
		throws IOException
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #86  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void Bundle()>
	//    3    7:astore_3        
		bundle.putString("gcm.topic", s1);
	//    4    8:aload_3         
	//    5    9:ldc1            #89  <String "gcm.topic">
	//    6   11:aload_2         
	//    7   12:invokevirtual   #93  <Method void Bundle.putString(String, String)>
		zzbfO.zzb(s, s1, bundle);
	//    8   15:aload_0         
	//    9   16:getfield        #35  <Field InstanceID zzbfO>
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:invokevirtual   #103 <Method void InstanceID.zzb(String, String, Bundle)>
	//   14   25:return          
	}

	private static GcmPubSub zzbfN;
	private static final Pattern zzbfP = Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");
	private InstanceID zzbfO;

	static 
	{
	//    0    0:ldc1            #14  <String "/topics/[a-zA-Z0-9-_.~%]{1,900}">
	//    1    2:invokestatic    #20  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #22  <Field Pattern zzbfP>
	//*   3    8:return          
	}
}
