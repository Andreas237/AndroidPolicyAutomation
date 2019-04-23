// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bgj, bgl

final class bgk extends bgj
{

	public bgk(int i, long l)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #14  <Method void bgj(int)>
		aP = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #16  <Field long aP>
	//    6   10:aload_0         
	//    7   11:new             #18  <Class ArrayList>
	//    8   14:dup             
	//    9   15:invokespecial   #21  <Method void ArrayList()>
	//   10   18:putfield        #23  <Field List aQ>
	//   11   21:aload_0         
	//   12   22:new             #18  <Class ArrayList>
	//   13   25:dup             
	//   14   26:invokespecial   #21  <Method void ArrayList()>
	//   15   29:putfield        #25  <Field List aR>
	//   16   32:return          
	}

	public final void a(bgk bgk1)
	{
		aR.add(((Object) (bgk1)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List aR>
	//    2    4:aload_1         
	//    3    5:invokeinterface #34  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final void a(bgl bgl1)
	{
		aQ.add(((Object) (bgl1)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List aQ>
	//    2    4:aload_1         
	//    3    5:invokeinterface #34  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final bgl d(int i)
	{
		int k = aQ.size();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List aQ>
	//    2    4:invokeinterface #41  <Method int List.size()>
	//    3    9:istore_3        
		for(int j = 0; j < k; j++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          51
		{
			bgl bgl1 = (bgl)aQ.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #23  <Field List aQ>
	//   11   21:iload_2         
	//   12   22:invokeinterface #45  <Method Object List.get(int)>
	//   13   27:checkcast       #47  <Class bgl>
	//   14   30:astore          4
			if(bgl1.aO == i)
	//*  15   32:aload           4
	//*  16   34:getfield        #51  <Field int bgl.aO>
	//*  17   37:iload_1         
	//*  18   38:icmpne          44
				return bgl1;
	//   19   41:aload           4
	//   20   43:areturn         
		}

	//   21   44:iload_2         
	//   22   45:iconst_1        
	//   23   46:iadd            
	//   24   47:istore_2        
	//*  25   48:goto            12
		return null;
	//   26   51:aconst_null     
	//   27   52:areturn         
	}

	public final bgk e(int i)
	{
		int k = aR.size();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List aR>
	//    2    4:invokeinterface #41  <Method int List.size()>
	//    3    9:istore_3        
		for(int j = 0; j < k; j++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          51
		{
			bgk bgk1 = (bgk)aR.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #25  <Field List aR>
	//   11   21:iload_2         
	//   12   22:invokeinterface #45  <Method Object List.get(int)>
	//   13   27:checkcast       #2   <Class bgk>
	//   14   30:astore          4
			if(bgk1.aO == i)
	//*  15   32:aload           4
	//*  16   34:getfield        #54  <Field int aO>
	//*  17   37:iload_1         
	//*  18   38:icmpne          44
				return bgk1;
	//   19   41:aload           4
	//   20   43:areturn         
		}

	//   21   44:iload_2         
	//   22   45:iconst_1        
	//   23   46:iadd            
	//   24   47:istore_2        
	//*  25   48:goto            12
		return null;
	//   26   51:aconst_null     
	//   27   52:areturn         
	}

	public final String toString()
	{
		String s = c(aO);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int aO>
	//    2    4:invokestatic    #60  <Method String c(int)>
	//    3    7:astore_1        
		String s1 = Arrays.toString(aQ.toArray());
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field List aQ>
	//    6   12:invokeinterface #64  <Method Object[] List.toArray()>
	//    7   17:invokestatic    #69  <Method String Arrays.toString(Object[])>
	//    8   20:astore_2        
		String s2 = Arrays.toString(aR.toArray());
	//    9   21:aload_0         
	//   10   22:getfield        #25  <Field List aR>
	//   11   25:invokeinterface #64  <Method Object[] List.toArray()>
	//   12   30:invokestatic    #69  <Method String Arrays.toString(Object[])>
	//   13   33:astore_3        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 22 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length());
	//   14   34:new             #71  <Class StringBuilder>
	//   15   37:dup             
	//   16   38:aload_1         
	//   17   39:invokestatic    #77  <Method String String.valueOf(Object)>
	//   18   42:invokevirtual   #80  <Method int String.length()>
	//   19   45:bipush          22
	//   20   47:iadd            
	//   21   48:aload_2         
	//   22   49:invokestatic    #77  <Method String String.valueOf(Object)>
	//   23   52:invokevirtual   #80  <Method int String.length()>
	//   24   55:iadd            
	//   25   56:aload_3         
	//   26   57:invokestatic    #77  <Method String String.valueOf(Object)>
	//   27   60:invokevirtual   #80  <Method int String.length()>
	//   28   63:iadd            
	//   29   64:invokespecial   #81  <Method void StringBuilder(int)>
	//   30   67:astore          4
		stringbuilder.append(s);
	//   31   69:aload           4
	//   32   71:aload_1         
	//   33   72:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   34   75:pop             
		stringbuilder.append(" leaves: ");
	//   35   76:aload           4
	//   36   78:ldc1            #87  <String " leaves: ">
	//   37   80:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   38   83:pop             
		stringbuilder.append(s1);
	//   39   84:aload           4
	//   40   86:aload_2         
	//   41   87:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   42   90:pop             
		stringbuilder.append(" containers: ");
	//   43   91:aload           4
	//   44   93:ldc1            #89  <String " containers: ">
	//   45   95:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   46   98:pop             
		stringbuilder.append(s2);
	//   47   99:aload           4
	//   48  101:aload_3         
	//   49  102:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   50  105:pop             
		return stringbuilder.toString();
	//   51  106:aload           4
	//   52  108:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   53  111:areturn         
	}

	public final long aP;
	public final List aQ = new ArrayList();
	public final List aR = new ArrayList();
}
