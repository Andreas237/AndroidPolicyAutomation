// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bjv, bfl, bjf, bfw

final class bjr
	implements bjv
{

	public bjr(int ai[], bjf abjf[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = ai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field int[] a>
		b = abjf;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field bjf[] b>
	//    8   14:return          
	}

	public final bfw a(int i, int j)
	{
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		do
		{
			int ai[] = a;
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field int[] a>
	//    4    6:astore_3        
			if(i < ai.length)
	//*   5    7:iload_1         
	//*   6    8:aload_3         
	//*   7    9:arraylength     
	//*   8   10:icmpge          34
			{
				if(j == ai[i])
	//*   9   13:iload_2         
	//*  10   14:aload_3         
	//*  11   15:iload_1         
	//*  12   16:iaload          
	//*  13   17:icmpne          27
					return ((bfw) (b[i]));
	//   14   20:aload_0         
	//   15   21:getfield        #19  <Field bjf[] b>
	//   16   24:iload_1         
	//   17   25:aaload          
	//   18   26:areturn         
				i++;
	//   19   27:iload_1         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:istore_1        
			} else
	//*  23   31:goto            2
			{
				StringBuilder stringbuilder = new StringBuilder(36);
	//   24   34:new             #23  <Class StringBuilder>
	//   25   37:dup             
	//   26   38:bipush          36
	//   27   40:invokespecial   #26  <Method void StringBuilder(int)>
	//   28   43:astore_3        
				stringbuilder.append("Unmatched track of type: ");
	//   29   44:aload_3         
	//   30   45:ldc1            #28  <String "Unmatched track of type: ">
	//   31   47:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   32   50:pop             
				stringbuilder.append(j);
	//   33   51:aload_3         
	//   34   52:iload_2         
	//   35   53:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//   36   56:pop             
				Log.e("BaseMediaChunkOutput", stringbuilder.toString());
	//   37   57:ldc1            #37  <String "BaseMediaChunkOutput">
	//   38   59:aload_3         
	//   39   60:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   40   63:invokestatic    #47  <Method int Log.e(String, String)>
	//   41   66:pop             
				return ((bfw) (new bfl()));
	//   42   67:new             #49  <Class bfl>
	//   43   70:dup             
	//   44   71:invokespecial   #50  <Method void bfl()>
	//   45   74:areturn         
			}
		} while(true);
	}

	public final void a(long l)
	{
		bjf abjf[] = b;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field bjf[] b>
	//    2    4:astore          5
		int j = abjf.length;
	//    3    6:aload           5
	//    4    8:arraylength     
	//    5    9:istore          4
		for(int i = 0; i < j; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_3        
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          43
		{
			bjf bjf1 = abjf[i];
	//   11   19:aload           5
	//   12   21:iload_3         
	//   13   22:aaload          
	//   14   23:astore          6
			if(bjf1 != null)
	//*  15   25:aload           6
	//*  16   27:ifnull          36
				bjf1.a(l);
	//   17   30:aload           6
	//   18   32:lload_1         
	//   19   33:invokevirtual   #55  <Method void bjf.a(long)>
		}

	//   20   36:iload_3         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_3        
	//*  24   40:goto            13
	//   25   43:return          
	}

	public final int[] a()
	{
		int ai[] = new int[b.length];
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field bjf[] b>
	//    2    4:arraylength     
	//    3    5:newarray        int[]
	//    4    7:astore_2        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
		do
		{
			bjf abjf[] = b;
	//    7   10:aload_0         
	//    8   11:getfield        #19  <Field bjf[] b>
	//    9   14:astore_3        
			if(i < abjf.length)
	//*  10   15:iload_1         
	//*  11   16:aload_3         
	//*  12   17:arraylength     
	//*  13   18:icmpge          43
			{
				if(abjf[i] != null)
	//*  14   21:aload_3         
	//*  15   22:iload_1         
	//*  16   23:aaload          
	//*  17   24:ifnull          36
					ai[i] = abjf[i].a();
	//   18   27:aload_2         
	//   19   28:iload_1         
	//   20   29:aload_3         
	//   21   30:iload_1         
	//   22   31:aaload          
	//   23   32:invokevirtual   #59  <Method int bjf.a()>
	//   24   35:iastore         
				i++;
	//   25   36:iload_1         
	//   26   37:iconst_1        
	//   27   38:iadd            
	//   28   39:istore_1        
			} else
	//*  29   40:goto            10
			{
				return ai;
	//   30   43:aload_2         
	//   31   44:areturn         
			}
		} while(true);
	}

	private final int a[];
	private final bjf b[];
}
