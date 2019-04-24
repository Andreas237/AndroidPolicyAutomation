// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;

import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			GF256, GF256Poly

public final class ReedSolomonEncoder
{

	public ReedSolomonEncoder(GF256 gf256)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		if(!((Object) (GF256.QR_CODE_FIELD)).equals(((Object) (gf256))))
	//*   2    4:getstatic       #19  <Field GF256 GF256.QR_CODE_FIELD>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #23  <Method boolean Object.equals(Object)>
	//*   5   11:ifne            24
		{
			throw new IllegalArgumentException("Only QR Code is supported at this time");
	//    6   14:new             #25  <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:ldc1            #27  <String "Only QR Code is supported at this time">
	//    9   20:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//   10   23:athrow          
		} else
		{
			field = gf256;
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:putfield        #32  <Field GF256 field>
			cachedGenerators = new ArrayList();
	//   14   29:aload_0         
	//   15   30:new             #34  <Class ArrayList>
	//   16   33:dup             
	//   17   34:invokespecial   #35  <Method void ArrayList()>
	//   18   37:putfield        #37  <Field ArrayList cachedGenerators>
			cachedGenerators.add(((Object) (new GF256Poly(gf256, new int[] {
				1
			}))));
	//   19   40:aload_0         
	//   20   41:getfield        #37  <Field ArrayList cachedGenerators>
	//   21   44:new             #39  <Class GF256Poly>
	//   22   47:dup             
	//   23   48:aload_1         
	//   24   49:iconst_1        
	//   25   50:newarray        int[]
	//   26   52:dup             
	//   27   53:iconst_0        
	//   28   54:iconst_1        
	//   29   55:iastore         
	//   30   56:invokespecial   #42  <Method void GF256Poly(GF256, int[])>
	//   31   59:invokevirtual   #45  <Method boolean ArrayList.add(Object)>
	//   32   62:pop             
			return;
	//   33   63:return          
		}
	}

	private GF256Poly buildGenerator(int i)
	{
		if(i >= cachedGenerators.size())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #37  <Field ArrayList cachedGenerators>
	//*   3    5:invokevirtual   #52  <Method int ArrayList.size()>
	//*   4    8:icmplt          96
		{
			GF256Poly gf256poly = (GF256Poly)cachedGenerators.get(cachedGenerators.size() - 1);
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field ArrayList cachedGenerators>
	//    7   15:aload_0         
	//    8   16:getfield        #37  <Field ArrayList cachedGenerators>
	//    9   19:invokevirtual   #52  <Method int ArrayList.size()>
	//   10   22:iconst_1        
	//   11   23:isub            
	//   12   24:invokevirtual   #56  <Method Object ArrayList.get(int)>
	//   13   27:checkcast       #39  <Class GF256Poly>
	//   14   30:astore_3        
			for(int j = cachedGenerators.size(); j <= i; j++)
	//*  15   31:aload_0         
	//*  16   32:getfield        #37  <Field ArrayList cachedGenerators>
	//*  17   35:invokevirtual   #52  <Method int ArrayList.size()>
	//*  18   38:istore_2        
	//*  19   39:iload_2         
	//*  20   40:iload_1         
	//*  21   41:icmpgt          96
			{
				gf256poly = gf256poly.multiply(new GF256Poly(field, new int[] {
					1, field.exp(j - 1)
				}));
	//   22   44:aload_3         
	//   23   45:new             #39  <Class GF256Poly>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:getfield        #32  <Field GF256 field>
	//   27   53:iconst_2        
	//   28   54:newarray        int[]
	//   29   56:dup             
	//   30   57:iconst_0        
	//   31   58:iconst_1        
	//   32   59:iastore         
	//   33   60:dup             
	//   34   61:iconst_1        
	//   35   62:aload_0         
	//   36   63:getfield        #32  <Field GF256 field>
	//   37   66:iload_2         
	//   38   67:iconst_1        
	//   39   68:isub            
	//   40   69:invokevirtual   #60  <Method int GF256.exp(int)>
	//   41   72:iastore         
	//   42   73:invokespecial   #42  <Method void GF256Poly(GF256, int[])>
	//   43   76:invokevirtual   #64  <Method GF256Poly GF256Poly.multiply(GF256Poly)>
	//   44   79:astore_3        
				cachedGenerators.add(((Object) (gf256poly)));
	//   45   80:aload_0         
	//   46   81:getfield        #37  <Field ArrayList cachedGenerators>
	//   47   84:aload_3         
	//   48   85:invokevirtual   #45  <Method boolean ArrayList.add(Object)>
	//   49   88:pop             
			}

	//   50   89:iload_2         
	//   51   90:iconst_1        
	//   52   91:iadd            
	//   53   92:istore_2        
		}
	//*  54   93:goto            39
		return (GF256Poly)cachedGenerators.get(i);
	//   55   96:aload_0         
	//   56   97:getfield        #37  <Field ArrayList cachedGenerators>
	//   57  100:iload_1         
	//   58  101:invokevirtual   #56  <Method Object ArrayList.get(int)>
	//   59  104:checkcast       #39  <Class GF256Poly>
	//   60  107:areturn         
	}

	public void encode(int ai[], int i)
	{
		if(i == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            14
			throw new IllegalArgumentException("No error correction bytes");
	//    2    4:new             #25  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #68  <String "No error correction bytes">
	//    5   10:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		int j = ai.length - i;
	//    7   14:aload_1         
	//    8   15:arraylength     
	//    9   16:iload_2         
	//   10   17:isub            
	//   11   18:istore_3        
		if(j <= 0)
	//*  12   19:iload_3         
	//*  13   20:ifgt            33
			throw new IllegalArgumentException("No data bytes provided");
	//   14   23:new             #25  <Class IllegalArgumentException>
	//   15   26:dup             
	//   16   27:ldc1            #70  <String "No data bytes provided">
	//   17   29:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//   18   32:athrow          
		GF256Poly gf256poly = buildGenerator(i);
	//   19   33:aload_0         
	//   20   34:iload_2         
	//   21   35:invokespecial   #72  <Method GF256Poly buildGenerator(int)>
	//   22   38:astore          5
		int ai2[] = new int[j];
	//   23   40:iload_3         
	//   24   41:newarray        int[]
	//   25   43:astore          6
		System.arraycopy(((Object) (ai)), 0, ((Object) (ai2)), 0, j);
	//   26   45:aload_1         
	//   27   46:iconst_0        
	//   28   47:aload           6
	//   29   49:iconst_0        
	//   30   50:iload_3         
	//   31   51:invokestatic    #78  <Method void System.arraycopy(Object, int, Object, int, int)>
		int ai1[] = (new GF256Poly(field, ai2)).multiplyByMonomial(i, 1).divide(gf256poly)[1].getCoefficients();
	//   32   54:new             #39  <Class GF256Poly>
	//   33   57:dup             
	//   34   58:aload_0         
	//   35   59:getfield        #32  <Field GF256 field>
	//   36   62:aload           6
	//   37   64:invokespecial   #42  <Method void GF256Poly(GF256, int[])>
	//   38   67:iload_2         
	//   39   68:iconst_1        
	//   40   69:invokevirtual   #82  <Method GF256Poly GF256Poly.multiplyByMonomial(int, int)>
	//   41   72:aload           5
	//   42   74:invokevirtual   #86  <Method GF256Poly[] GF256Poly.divide(GF256Poly)>
	//   43   77:iconst_1        
	//   44   78:aaload          
	//   45   79:invokevirtual   #90  <Method int[] GF256Poly.getCoefficients()>
	//   46   82:astore          5
		int k = i - ai1.length;
	//   47   84:iload_2         
	//   48   85:aload           5
	//   49   87:arraylength     
	//   50   88:isub            
	//   51   89:istore          4
		for(i = 0; i < k; i++)
	//*  52   91:iconst_0        
	//*  53   92:istore_2        
	//*  54   93:iload_2         
	//*  55   94:iload           4
	//*  56   96:icmpge          112
			ai[j + i] = 0;
	//   57   99:aload_1         
	//   58  100:iload_3         
	//   59  101:iload_2         
	//   60  102:iadd            
	//   61  103:iconst_0        
	//   62  104:iastore         

	//   63  105:iload_2         
	//   64  106:iconst_1        
	//   65  107:iadd            
	//   66  108:istore_2        
	//*  67  109:goto            93
		System.arraycopy(((Object) (ai1)), 0, ((Object) (ai)), j + k, ai1.length);
	//   68  112:aload           5
	//   69  114:iconst_0        
	//   70  115:aload_1         
	//   71  116:iload_3         
	//   72  117:iload           4
	//   73  119:iadd            
	//   74  120:aload           5
	//   75  122:arraylength     
	//   76  123:invokestatic    #78  <Method void System.arraycopy(Object, int, Object, int, int)>
	//   77  126:return          
	}

	private final ArrayList cachedGenerators;
	private final GF256 field;
}
