// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfm, bfo, bnw, bjp, 
//			bfp

final class biv
{

	public biv(bfm abfm[], bfp bfp)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = abfm;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field bfm[] a>
		b = bfp;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field bfp b>
	//    8   14:return          
	}

	public final bfm a(bfo bfo1, Uri uri)
	{
		int i;
		int j;
		bfm abfm[];
		bfm bfm1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field bfm c>
	//    2    4:astore          5
		if(bfm1 != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          14
			return bfm1;
	//    5   11:aload           5
	//    6   13:areturn         
		abfm = a;
	//    7   14:aload_0         
	//    8   15:getfield        #17  <Field bfm[] a>
	//    9   18:astore          5
		j = abfm.length;
	//   10   20:aload           5
	//   11   22:arraylength     
	//   12   23:istore          4
		i = 0;
	//   13   25:iconst_0        
	//   14   26:istore_3        
_L3:
		if(i >= j) goto _L2; else goto _L1
	//   15   27:iload_3         
	//   16   28:iload           4
	//   17   30:icmpge          96
_L1:
		bfm bfm2 = abfm[i];
	//   18   33:aload           5
	//   19   35:iload_3         
	//   20   36:aaload          
	//   21   37:astore          6
		if(!bfm2.a(bfo1))
			break MISSING_BLOCK_LABEL_65;
	//   22   39:aload           6
	//   23   41:aload_1         
	//   24   42:invokeinterface #30  <Method boolean bfm.a(bfo)>
	//   25   47:ifeq            65
		c = bfm2;
	//   26   50:aload_0         
	//   27   51:aload           6
	//   28   53:putfield        #25  <Field bfm c>
		bfo1.a();
	//   29   56:aload_1         
	//   30   57:invokeinterface #34  <Method void bfo.a()>
		break; /* Loop/switch isn't completed */
	//   31   62:goto            96
		bfo1.a();
	//   32   65:aload_1         
	//   33   66:invokeinterface #34  <Method void bfo.a()>
		continue; /* Loop/switch isn't completed */
	//   34   71:goto            89
		uri;
	//   35   74:astore_2        
		bfo1.a();
	//   36   75:aload_1         
	//   37   76:invokeinterface #34  <Method void bfo.a()>
		throw uri;
	//   38   81:aload_2         
	//   39   82:athrow          
_L4:
		bfo1.a();
	//   40   83:aload_1         
	//   41   84:invokeinterface #34  <Method void bfo.a()>
		i++;
	//   42   89:iload_3         
	//   43   90:iconst_1        
	//   44   91:iadd            
	//   45   92:istore_3        
		  goto _L3
	//*  46   93:goto            27
_L2:
		bfo1 = ((bfo) (c));
	//   47   96:aload_0         
	//   48   97:getfield        #25  <Field bfm c>
	//   49  100:astore_1        
		if(bfo1 != null)
	//*  50  101:aload_1         
	//*  51  102:ifnull          120
		{
			((bfm) (bfo1)).a(b);
	//   52  105:aload_1         
	//   53  106:aload_0         
	//   54  107:getfield        #19  <Field bfp b>
	//   55  110:invokeinterface #37  <Method void bfm.a(bfp)>
			return c;
	//   56  115:aload_0         
	//   57  116:getfield        #25  <Field bfm c>
	//   58  119:areturn         
		} else
		{
			bfo1 = ((bfo) (bnw.a(((Object []) (a)))));
	//   59  120:aload_0         
	//   60  121:getfield        #17  <Field bfm[] a>
	//   61  124:invokestatic    #42  <Method String bnw.a(Object[])>
	//   62  127:astore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (bfo1))).length() + 58);
	//   63  128:new             #44  <Class StringBuilder>
	//   64  131:dup             
	//   65  132:aload_1         
	//   66  133:invokestatic    #50  <Method String String.valueOf(Object)>
	//   67  136:invokevirtual   #54  <Method int String.length()>
	//   68  139:bipush          58
	//   69  141:iadd            
	//   70  142:invokespecial   #57  <Method void StringBuilder(int)>
	//   71  145:astore          5
			stringbuilder.append("None of the available extractors (");
	//   72  147:aload           5
	//   73  149:ldc1            #59  <String "None of the available extractors (">
	//   74  151:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   75  154:pop             
			stringbuilder.append(((String) (bfo1)));
	//   76  155:aload           5
	//   77  157:aload_1         
	//   78  158:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   79  161:pop             
			stringbuilder.append(") could read the stream.");
	//   80  162:aload           5
	//   81  164:ldc1            #65  <String ") could read the stream.">
	//   82  166:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   83  169:pop             
			throw new bjp(stringbuilder.toString(), uri);
	//   84  170:new             #67  <Class bjp>
	//   85  173:dup             
	//   86  174:aload           5
	//   87  176:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   88  179:aload_2         
	//   89  180:invokespecial   #74  <Method void bjp(String, Uri)>
	//   90  183:athrow          
		}
		EOFException eofexception;
		eofexception;
	//   91  184:astore          6
		  goto _L4
	//*  92  186:goto            83
	}

	public final void a()
	{
		bfm bfm1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field bfm c>
	//    2    4:astore_1        
		if(bfm1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
		{
			bfm1.c();
	//    5    9:aload_1         
	//    6   10:invokeinterface #76  <Method void bfm.c()>
			c = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #25  <Field bfm c>
		}
	//   10   20:return          
	}

	private final bfm a[];
	private final bfp b;
	private bfm c;
}
