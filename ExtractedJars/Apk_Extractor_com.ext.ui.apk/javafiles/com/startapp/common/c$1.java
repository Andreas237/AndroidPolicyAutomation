// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.common;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.startapp.common:
//			c

class c$1 extends PhoneStateListener
{

	public void onSignalStrengthsChanged(SignalStrength signalstrength)
	{
		try
		{
			Method method = ((Class) (android/telephony/SignalStrength)).getMethod("getLevel", ((Class []) (null)));
	//    0    0:ldc1            #31  <Class SignalStrength>
	//    1    2:ldc1            #33  <String "getLevel">
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #39  <Method Method Class.getMethod(String, Class[])>
	//    4    8:astore_2        
			a.a = Integer.toString(((Integer)method.invoke(((Object) (signalstrength)), (Object[])null)).intValue());
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field c a>
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:aconst_null     
	//   10   16:checkcast       #41  <Class Object[]>
	//   11   19:invokevirtual   #47  <Method Object Method.invoke(Object, Object[])>
	//   12   22:checkcast       #49  <Class Integer>
	//   13   25:invokevirtual   #53  <Method int Integer.intValue()>
	//   14   28:invokestatic    #57  <Method String Integer.toString(int)>
	//   15   31:putfield        #60  <Field String c.a>
			return;
	//   16   34:return          
		}
		// Misplaced declaration of an exception variable
		catch(SignalStrength signalstrength)
	//*  17   35:astore_1        
		{
			a.a = "e104";
	//   18   36:aload_0         
	//   19   37:getfield        #15  <Field c a>
	//   20   40:ldc1            #62  <String "e104">
	//   21   42:putfield        #60  <Field String c.a>
			return;
	//   22   45:return          
		}
		// Misplaced declaration of an exception variable
		catch(SignalStrength signalstrength)
	//*  23   46:astore_1        
		{
			a.a = "e105";
	//   24   47:aload_0         
	//   25   48:getfield        #15  <Field c a>
	//   26   51:ldc1            #64  <String "e105">
	//   27   53:putfield        #60  <Field String c.a>
			return;
	//   28   56:return          
		}
		// Misplaced declaration of an exception variable
		catch(SignalStrength signalstrength)
	//*  29   57:astore_1        
		{
			a.a = "e105";
	//   30   58:aload_0         
	//   31   59:getfield        #15  <Field c a>
	//   32   62:ldc1            #64  <String "e105">
	//   33   64:putfield        #60  <Field String c.a>
			return;
	//   34   67:return          
		}
		// Misplaced declaration of an exception variable
		catch(SignalStrength signalstrength)
	//*  35   68:astore_1        
		{
			a.a = "e105";
	//   36   69:aload_0         
	//   37   70:getfield        #15  <Field c a>
	//   38   73:ldc1            #64  <String "e105">
	//   39   75:putfield        #60  <Field String c.a>
		}
	//   40   78:return          
	}

	final c a;

	c$1(c c1)
	{
		a = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field c a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void PhoneStateListener()>
	//    5    9:return          
	}
}
