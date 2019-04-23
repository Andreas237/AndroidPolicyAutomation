// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aex, adc, adx, afc, 
//			afb, aez, aey, add, 
//			aeq

public final class aej
	implements aex
{

	public aej()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final aeq a(add add, int i, String s, adc adc1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16 && i > 0 && Arrays.asList(((Object []) (adc1.e.split(",")))).contains("3"))
	//*   0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          88
	//*   3    8:iload_2         
	//*   4    9:ifle            88
	//*   5   12:aload           4
	//*   6   14:getfield        #26  <Field String adc.e>
	//*   7   17:ldc1            #28  <String ",">
	//*   8   19:invokevirtual   #34  <Method String[] String.split(String)>
	//*   9   22:invokestatic    #40  <Method List Arrays.asList(Object[])>
	//*  10   25:ldc1            #42  <String "3">
	//*  11   27:invokeinterface #48  <Method boolean List.contains(Object)>
	//*  12   32:ifeq            88
		{
			i = adx.c();
	//   13   35:invokestatic    #54  <Method int adx.c()>
	//   14   38:istore_2        
			if(i < adc1.h)
	//*  15   39:iload_2         
	//*  16   40:aload           4
	//*  17   42:getfield        #57  <Field int adc.h>
	//*  18   45:icmpge          59
				return ((aeq) (new afc(add, adc1)));
	//   19   48:new             #59  <Class afc>
	//   20   51:dup             
	//   21   52:aload_1         
	//   22   53:aload           4
	//   23   55:invokespecial   #62  <Method void afc(add, adc)>
	//   24   58:areturn         
			if(i < adc1.b)
	//*  25   59:iload_2         
	//*  26   60:aload           4
	//*  27   62:getfield        #65  <Field int adc.b>
	//*  28   65:icmpge          79
				return ((aeq) (new afb(add, adc1)));
	//   29   68:new             #67  <Class afb>
	//   30   71:dup             
	//   31   72:aload_1         
	//   32   73:aload           4
	//   33   75:invokespecial   #68  <Method void afb(add, adc)>
	//   34   78:areturn         
			else
				return ((aeq) (new aez(add)));
	//   35   79:new             #70  <Class aez>
	//   36   82:dup             
	//   37   83:aload_1         
	//   38   84:invokespecial   #73  <Method void aez(add)>
	//   39   87:areturn         
		} else
		{
			return ((aeq) (new aey(add)));
	//   40   88:new             #75  <Class aey>
	//   41   91:dup             
	//   42   92:aload_1         
	//   43   93:invokespecial   #76  <Method void aey(add)>
	//   44   96:areturn         
		}
	}
}
