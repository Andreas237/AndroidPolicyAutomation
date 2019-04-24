// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			GF256

final class GF256Poly
{

	GF256Poly(GF256 gf256, int ai[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		if(ai == null || ai.length == 0)
	//*   2    4:aload_2         
	//*   3    5:ifnull          13
	//*   4    8:aload_2         
	//*   5    9:arraylength     
	//*   6   10:ifne            21
			throw new IllegalArgumentException();
	//    7   13:new             #15  <Class IllegalArgumentException>
	//    8   16:dup             
	//    9   17:invokespecial   #16  <Method void IllegalArgumentException()>
	//   10   20:athrow          
		field = gf256;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #18  <Field GF256 field>
		int j = ai.length;
	//   14   26:aload_2         
	//   15   27:arraylength     
	//   16   28:istore          4
		if(j > 1 && ai[0] == 0)
	//*  17   30:iload           4
	//*  18   32:iconst_1        
	//*  19   33:icmple          107
	//*  20   36:aload_2         
	//*  21   37:iconst_0        
	//*  22   38:iaload          
	//*  23   39:ifne            107
		{
			int i;
			for(i = 1; i < j && ai[i] == 0; i++);
	//   24   42:iconst_1        
	//   25   43:istore_3        
	//   26   44:iload_3         
	//   27   45:iload           4
	//   28   47:icmpge          63
	//   29   50:aload_2         
	//   30   51:iload_3         
	//   31   52:iaload          
	//   32   53:ifne            63
	//   33   56:iload_3         
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore_3        
	//*  37   60:goto            44
			if(i == j)
	//*  38   63:iload_3         
	//*  39   64:iload           4
	//*  40   66:icmpne          81
			{
				coefficients = gf256.getZero().coefficients;
	//   41   69:aload_0         
	//   42   70:aload_1         
	//   43   71:invokevirtual   #24  <Method GF256Poly GF256.getZero()>
	//   44   74:getfield        #26  <Field int[] coefficients>
	//   45   77:putfield        #26  <Field int[] coefficients>
				return;
	//   46   80:return          
			} else
			{
				coefficients = new int[j - i];
	//   47   81:aload_0         
	//   48   82:iload           4
	//   49   84:iload_3         
	//   50   85:isub            
	//   51   86:newarray        int[]
	//   52   88:putfield        #26  <Field int[] coefficients>
				System.arraycopy(((Object) (ai)), i, ((Object) (coefficients)), 0, coefficients.length);
	//   53   91:aload_2         
	//   54   92:iload_3         
	//   55   93:aload_0         
	//   56   94:getfield        #26  <Field int[] coefficients>
	//   57   97:iconst_0        
	//   58   98:aload_0         
	//   59   99:getfield        #26  <Field int[] coefficients>
	//   60  102:arraylength     
	//   61  103:invokestatic    #32  <Method void System.arraycopy(Object, int, Object, int, int)>
				return;
	//   62  106:return          
			}
		} else
		{
			coefficients = ai;
	//   63  107:aload_0         
	//   64  108:aload_2         
	//   65  109:putfield        #26  <Field int[] coefficients>
			return;
	//   66  112:return          
		}
	}

	GF256Poly addOrSubtract(GF256Poly gf256poly)
	{
		if(!((Object) (field)).equals(((Object) (gf256poly.field))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field GF256 field>
	//*   2    4:aload_1         
	//*   3    5:getfield        #18  <Field GF256 field>
	//*   4    8:invokevirtual   #39  <Method boolean Object.equals(Object)>
	//*   5   11:ifne            24
			throw new IllegalArgumentException("GF256Polys do not have same GF256 field");
	//    6   14:new             #15  <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:ldc1            #41  <String "GF256Polys do not have same GF256 field">
	//    9   20:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   10   23:athrow          
		if(isZero())
	//*  11   24:aload_0         
	//*  12   25:invokevirtual   #48  <Method boolean isZero()>
	//*  13   28:ifeq            33
			return gf256poly;
	//   14   31:aload_1         
	//   15   32:areturn         
		if(gf256poly.isZero())
	//*  16   33:aload_1         
	//*  17   34:invokevirtual   #48  <Method boolean isZero()>
	//*  18   37:ifeq            42
			return this;
	//   19   40:aload_0         
	//   20   41:areturn         
		int ai[] = coefficients;
	//   21   42:aload_0         
	//   22   43:getfield        #26  <Field int[] coefficients>
	//   23   46:astore          4
		int ai2[] = gf256poly.coefficients;
	//   24   48:aload_1         
	//   25   49:getfield        #26  <Field int[] coefficients>
	//   26   52:astore          6
		int ai1[] = ai2;
	//   27   54:aload           6
	//   28   56:astore          5
		gf256poly = ((GF256Poly) (ai));
	//   29   58:aload           4
	//   30   60:astore_1        
		if(ai.length > ai2.length)
	//*  31   61:aload           4
	//*  32   63:arraylength     
	//*  33   64:aload           6
	//*  34   66:arraylength     
	//*  35   67:icmple          77
		{
			gf256poly = ((GF256Poly) (ai2));
	//   36   70:aload           6
	//   37   72:astore_1        
			ai1 = ai;
	//   38   73:aload           4
	//   39   75:astore          5
		}
		ai = new int[ai1.length];
	//   40   77:aload           5
	//   41   79:arraylength     
	//   42   80:newarray        int[]
	//   43   82:astore          4
		int j = ai1.length - gf256poly.length;
	//   44   84:aload           5
	//   45   86:arraylength     
	//   46   87:aload_1         
	//   47   88:arraylength     
	//   48   89:isub            
	//   49   90:istore_3        
		System.arraycopy(((Object) (ai1)), 0, ((Object) (ai)), 0, j);
	//   50   91:aload           5
	//   51   93:iconst_0        
	//   52   94:aload           4
	//   53   96:iconst_0        
	//   54   97:iload_3         
	//   55   98:invokestatic    #32  <Method void System.arraycopy(Object, int, Object, int, int)>
		for(int i = j; i < ai1.length; i++)
	//*  56  101:iload_3         
	//*  57  102:istore_2        
	//*  58  103:iload_2         
	//*  59  104:aload           5
	//*  60  106:arraylength     
	//*  61  107:icmpge          133
			ai[i] = GF256.addOrSubtract(gf256poly[i - j], ai1[i]);
	//   62  110:aload           4
	//   63  112:iload_2         
	//   64  113:aload_1         
	//   65  114:iload_2         
	//   66  115:iload_3         
	//   67  116:isub            
	//   68  117:iaload          
	//   69  118:aload           5
	//   70  120:iload_2         
	//   71  121:iaload          
	//   72  122:invokestatic    #51  <Method int GF256.addOrSubtract(int, int)>
	//   73  125:iastore         

	//   74  126:iload_2         
	//   75  127:iconst_1        
	//   76  128:iadd            
	//   77  129:istore_2        
	//*  78  130:goto            103
		return new GF256Poly(field, ai);
	//   79  133:new             #2   <Class GF256Poly>
	//   80  136:dup             
	//   81  137:aload_0         
	//   82  138:getfield        #18  <Field GF256 field>
	//   83  141:aload           4
	//   84  143:invokespecial   #53  <Method void GF256Poly(GF256, int[])>
	//   85  146:areturn         
	}

	GF256Poly[] divide(GF256Poly gf256poly)
	{
		if(!((Object) (field)).equals(((Object) (gf256poly.field))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field GF256 field>
	//*   2    4:aload_1         
	//*   3    5:getfield        #18  <Field GF256 field>
	//*   4    8:invokevirtual   #39  <Method boolean Object.equals(Object)>
	//*   5   11:ifne            24
			throw new IllegalArgumentException("GF256Polys do not have same GF256 field");
	//    6   14:new             #15  <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:ldc1            #41  <String "GF256Polys do not have same GF256 field">
	//    9   20:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   10   23:athrow          
		if(gf256poly.isZero())
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #48  <Method boolean isZero()>
	//*  13   28:ifeq            41
			throw new IllegalArgumentException("Divide by 0");
	//   14   31:new             #15  <Class IllegalArgumentException>
	//   15   34:dup             
	//   16   35:ldc1            #57  <String "Divide by 0">
	//   17   37:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   18   40:athrow          
		GF256Poly gf256poly2 = field.getZero();
	//   19   41:aload_0         
	//   20   42:getfield        #18  <Field GF256 field>
	//   21   45:invokevirtual   #24  <Method GF256Poly GF256.getZero()>
	//   22   48:astore          6
		GF256Poly gf256poly1 = this;
	//   23   50:aload_0         
	//   24   51:astore          5
		int i = gf256poly.getCoefficient(gf256poly.getDegree());
	//   25   53:aload_1         
	//   26   54:aload_1         
	//   27   55:invokevirtual   #61  <Method int getDegree()>
	//   28   58:invokevirtual   #65  <Method int getCoefficient(int)>
	//   29   61:istore_2        
		i = field.inverse(i);
	//   30   62:aload_0         
	//   31   63:getfield        #18  <Field GF256 field>
	//   32   66:iload_2         
	//   33   67:invokevirtual   #68  <Method int GF256.inverse(int)>
	//   34   70:istore_2        
		GF256Poly gf256poly3;
		for(; gf256poly1.getDegree() >= gf256poly.getDegree() && !gf256poly1.isZero(); gf256poly1 = gf256poly1.addOrSubtract(gf256poly3))
	//*  35   71:aload           5
	//*  36   73:invokevirtual   #61  <Method int getDegree()>
	//*  37   76:aload_1         
	//*  38   77:invokevirtual   #61  <Method int getDegree()>
	//*  39   80:icmplt          160
	//*  40   83:aload           5
	//*  41   85:invokevirtual   #48  <Method boolean isZero()>
	//*  42   88:ifne            160
		{
			int j = gf256poly1.getDegree() - gf256poly.getDegree();
	//   43   91:aload           5
	//   44   93:invokevirtual   #61  <Method int getDegree()>
	//   45   96:aload_1         
	//   46   97:invokevirtual   #61  <Method int getDegree()>
	//   47  100:isub            
	//   48  101:istore_3        
			int k = field.multiply(gf256poly1.getCoefficient(gf256poly1.getDegree()), i);
	//   49  102:aload_0         
	//   50  103:getfield        #18  <Field GF256 field>
	//   51  106:aload           5
	//   52  108:aload           5
	//   53  110:invokevirtual   #61  <Method int getDegree()>
	//   54  113:invokevirtual   #65  <Method int getCoefficient(int)>
	//   55  116:iload_2         
	//   56  117:invokevirtual   #71  <Method int GF256.multiply(int, int)>
	//   57  120:istore          4
			gf256poly3 = gf256poly.multiplyByMonomial(j, k);
	//   58  122:aload_1         
	//   59  123:iload_3         
	//   60  124:iload           4
	//   61  126:invokevirtual   #75  <Method GF256Poly multiplyByMonomial(int, int)>
	//   62  129:astore          7
			gf256poly2 = gf256poly2.addOrSubtract(field.buildMonomial(j, k));
	//   63  131:aload           6
	//   64  133:aload_0         
	//   65  134:getfield        #18  <Field GF256 field>
	//   66  137:iload_3         
	//   67  138:iload           4
	//   68  140:invokevirtual   #78  <Method GF256Poly GF256.buildMonomial(int, int)>
	//   69  143:invokevirtual   #80  <Method GF256Poly addOrSubtract(GF256Poly)>
	//   70  146:astore          6
		}

	//   71  148:aload           5
	//   72  150:aload           7
	//   73  152:invokevirtual   #80  <Method GF256Poly addOrSubtract(GF256Poly)>
	//   74  155:astore          5
	//*  75  157:goto            71
		return (new GF256Poly[] {
			gf256poly2, gf256poly1
		});
	//   76  160:iconst_2        
	//   77  161:anewarray       GF256Poly[]
	//   78  164:dup             
	//   79  165:iconst_0        
	//   80  166:aload           6
	//   81  168:aastore         
	//   82  169:dup             
	//   83  170:iconst_1        
	//   84  171:aload           5
	//   85  173:aastore         
	//   86  174:areturn         
	}

	int evaluateAt(int i)
	{
		if(i != 0) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:ifne            12
_L1:
		int j = getCoefficient(0);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #65  <Method int getCoefficient(int)>
	//    5    9:istore_2        
_L4:
		return j;
	//    6   10:iload_2         
	//    7   11:ireturn         
_L2:
		int j1 = coefficients.length;
	//    8   12:aload_0         
	//    9   13:getfield        #26  <Field int[] coefficients>
	//   10   16:arraylength     
	//   11   17:istore          5
		if(i == 1)
	//*  12   19:iload_1         
	//*  13   20:iconst_1        
	//*  14   21:icmpne          54
		{
			i = 0;
	//   15   24:iconst_0        
	//   16   25:istore_1        
			int k = 0;
	//   17   26:iconst_0        
	//   18   27:istore_3        
			do
			{
				j = i;
	//   19   28:iload_1         
	//   20   29:istore_2        
				if(k >= j1)
					continue;
	//   21   30:iload_3         
	//   22   31:iload           5
	//   23   33:icmpge          10
				i = GF256.addOrSubtract(i, coefficients[k]);
	//   24   36:iload_1         
	//   25   37:aload_0         
	//   26   38:getfield        #26  <Field int[] coefficients>
	//   27   41:iload_3         
	//   28   42:iaload          
	//   29   43:invokestatic    #51  <Method int GF256.addOrSubtract(int, int)>
	//   30   46:istore_1        
				k++;
	//   31   47:iload_3         
	//   32   48:iconst_1        
	//   33   49:iadd            
	//   34   50:istore_3        
			} while(true);
	//   35   51:goto            28
		}
		int l = coefficients[0];
	//   36   54:aload_0         
	//   37   55:getfield        #26  <Field int[] coefficients>
	//   38   58:iconst_0        
	//   39   59:iaload          
	//   40   60:istore_3        
		int i1 = 1;
	//   41   61:iconst_1        
	//   42   62:istore          4
		do
		{
			j = l;
	//   43   64:iload_3         
	//   44   65:istore_2        
			if(i1 >= j1)
				continue;
	//   45   66:iload           4
	//   46   68:iload           5
	//   47   70:icmpge          10
			l = GF256.addOrSubtract(field.multiply(i, l), coefficients[i1]);
	//   48   73:aload_0         
	//   49   74:getfield        #18  <Field GF256 field>
	//   50   77:iload_1         
	//   51   78:iload_3         
	//   52   79:invokevirtual   #71  <Method int GF256.multiply(int, int)>
	//   53   82:aload_0         
	//   54   83:getfield        #26  <Field int[] coefficients>
	//   55   86:iload           4
	//   56   88:iaload          
	//   57   89:invokestatic    #51  <Method int GF256.addOrSubtract(int, int)>
	//   58   92:istore_3        
			i1++;
	//   59   93:iload           4
	//   60   95:iconst_1        
	//   61   96:iadd            
	//   62   97:istore          4
		} while(true);
	//   63   99:goto            64
		if(true) goto _L4; else goto _L3
_L3:
	}

	int getCoefficient(int i)
	{
		return coefficients[coefficients.length - 1 - i];
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int[] coefficients>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field int[] coefficients>
	//    4    8:arraylength     
	//    5    9:iconst_1        
	//    6   10:isub            
	//    7   11:iload_1         
	//    8   12:isub            
	//    9   13:iaload          
	//   10   14:ireturn         
	}

	int[] getCoefficients()
	{
		return coefficients;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int[] coefficients>
	//    2    4:areturn         
	}

	int getDegree()
	{
		return coefficients.length - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int[] coefficients>
	//    2    4:arraylength     
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:ireturn         
	}

	boolean isZero()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(coefficients[0] == 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #26  <Field int[] coefficients>
	//*   4    6:iconst_0        
	//*   5    7:iaload          
	//*   6    8:ifne            13
			flag = true;
	//    7   11:iconst_1        
	//    8   12:istore_1        
		return flag;
	//    9   13:iload_1         
	//   10   14:ireturn         
	}

	GF256Poly multiply(int i)
	{
		GF256Poly gf256poly;
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            16
		{
			gf256poly = field.getZero();
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field GF256 field>
	//    4    8:invokevirtual   #24  <Method GF256Poly GF256.getZero()>
	//    5   11:astore          4
		} else
	//*   6   13:aload           4
	//*   7   15:areturn         
		{
			gf256poly = this;
	//    8   16:aload_0         
	//    9   17:astore          4
			if(i != 1)
	//*  10   19:iload_1         
	//*  11   20:iconst_1        
	//*  12   21:icmpeq          13
			{
				int k = coefficients.length;
	//   13   24:aload_0         
	//   14   25:getfield        #26  <Field int[] coefficients>
	//   15   28:arraylength     
	//   16   29:istore_3        
				int ai[] = new int[k];
	//   17   30:iload_3         
	//   18   31:newarray        int[]
	//   19   33:astore          4
				for(int j = 0; j < k; j++)
	//*  20   35:iconst_0        
	//*  21   36:istore_2        
	//*  22   37:iload_2         
	//*  23   38:iload_3         
	//*  24   39:icmpge          67
					ai[j] = field.multiply(coefficients[j], i);
	//   25   42:aload           4
	//   26   44:iload_2         
	//   27   45:aload_0         
	//   28   46:getfield        #18  <Field GF256 field>
	//   29   49:aload_0         
	//   30   50:getfield        #26  <Field int[] coefficients>
	//   31   53:iload_2         
	//   32   54:iaload          
	//   33   55:iload_1         
	//   34   56:invokevirtual   #71  <Method int GF256.multiply(int, int)>
	//   35   59:iastore         

	//   36   60:iload_2         
	//   37   61:iconst_1        
	//   38   62:iadd            
	//   39   63:istore_2        
	//*  40   64:goto            37
				return new GF256Poly(field, ai);
	//   41   67:new             #2   <Class GF256Poly>
	//   42   70:dup             
	//   43   71:aload_0         
	//   44   72:getfield        #18  <Field GF256 field>
	//   45   75:aload           4
	//   46   77:invokespecial   #53  <Method void GF256Poly(GF256, int[])>
	//   47   80:areturn         
			}
		}
		return gf256poly;
	}

	GF256Poly multiply(GF256Poly gf256poly)
	{
		if(!((Object) (field)).equals(((Object) (gf256poly.field))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field GF256 field>
	//*   2    4:aload_1         
	//*   3    5:getfield        #18  <Field GF256 field>
	//*   4    8:invokevirtual   #39  <Method boolean Object.equals(Object)>
	//*   5   11:ifne            24
			throw new IllegalArgumentException("GF256Polys do not have same GF256 field");
	//    6   14:new             #15  <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:ldc1            #41  <String "GF256Polys do not have same GF256 field">
	//    9   20:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   10   23:athrow          
		if(isZero() || gf256poly.isZero())
	//*  11   24:aload_0         
	//*  12   25:invokevirtual   #48  <Method boolean isZero()>
	//*  13   28:ifne            38
	//*  14   31:aload_1         
	//*  15   32:invokevirtual   #48  <Method boolean isZero()>
	//*  16   35:ifeq            46
			return field.getZero();
	//   17   38:aload_0         
	//   18   39:getfield        #18  <Field GF256 field>
	//   19   42:invokevirtual   #24  <Method GF256Poly GF256.getZero()>
	//   20   45:areturn         
		int ai[] = coefficients;
	//   21   46:aload_0         
	//   22   47:getfield        #26  <Field int[] coefficients>
	//   23   50:astore          7
		int k = ai.length;
	//   24   52:aload           7
	//   25   54:arraylength     
	//   26   55:istore          4
		gf256poly = ((GF256Poly) (gf256poly.coefficients));
	//   27   57:aload_1         
	//   28   58:getfield        #26  <Field int[] coefficients>
	//   29   61:astore_1        
		int l = gf256poly.length;
	//   30   62:aload_1         
	//   31   63:arraylength     
	//   32   64:istore          5
		int ai1[] = new int[(k + l) - 1];
	//   33   66:iload           4
	//   34   68:iload           5
	//   35   70:iadd            
	//   36   71:iconst_1        
	//   37   72:isub            
	//   38   73:newarray        int[]
	//   39   75:astore          8
		for(int i = 0; i < k; i++)
	//*  40   77:iconst_0        
	//*  41   78:istore_2        
	//*  42   79:iload_2         
	//*  43   80:iload           4
	//*  44   82:icmpge          140
		{
			int i1 = ai[i];
	//   45   85:aload           7
	//   46   87:iload_2         
	//   47   88:iaload          
	//   48   89:istore          6
			for(int j = 0; j < l; j++)
	//*  49   91:iconst_0        
	//*  50   92:istore_3        
	//*  51   93:iload_3         
	//*  52   94:iload           5
	//*  53   96:icmpge          133
				ai1[i + j] = GF256.addOrSubtract(ai1[i + j], field.multiply(i1, gf256poly[j]));
	//   54   99:aload           8
	//   55  101:iload_2         
	//   56  102:iload_3         
	//   57  103:iadd            
	//   58  104:aload           8
	//   59  106:iload_2         
	//   60  107:iload_3         
	//   61  108:iadd            
	//   62  109:iaload          
	//   63  110:aload_0         
	//   64  111:getfield        #18  <Field GF256 field>
	//   65  114:iload           6
	//   66  116:aload_1         
	//   67  117:iload_3         
	//   68  118:iaload          
	//   69  119:invokevirtual   #71  <Method int GF256.multiply(int, int)>
	//   70  122:invokestatic    #51  <Method int GF256.addOrSubtract(int, int)>
	//   71  125:iastore         

	//   72  126:iload_3         
	//   73  127:iconst_1        
	//   74  128:iadd            
	//   75  129:istore_3        
		}

	//   76  130:goto            93
	//   77  133:iload_2         
	//   78  134:iconst_1        
	//   79  135:iadd            
	//   80  136:istore_2        
	//*  81  137:goto            79
		return new GF256Poly(field, ai1);
	//   82  140:new             #2   <Class GF256Poly>
	//   83  143:dup             
	//   84  144:aload_0         
	//   85  145:getfield        #18  <Field GF256 field>
	//   86  148:aload           8
	//   87  150:invokespecial   #53  <Method void GF256Poly(GF256, int[])>
	//   88  153:areturn         
	}

	GF256Poly multiplyByMonomial(int i, int j)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            12
			throw new IllegalArgumentException();
	//    2    4:new             #15  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:invokespecial   #16  <Method void IllegalArgumentException()>
	//    5   11:athrow          
		if(j == 0)
	//*   6   12:iload_2         
	//*   7   13:ifne            24
			return field.getZero();
	//    8   16:aload_0         
	//    9   17:getfield        #18  <Field GF256 field>
	//   10   20:invokevirtual   #24  <Method GF256Poly GF256.getZero()>
	//   11   23:areturn         
		int k = coefficients.length;
	//   12   24:aload_0         
	//   13   25:getfield        #26  <Field int[] coefficients>
	//   14   28:arraylength     
	//   15   29:istore_3        
		int ai[] = new int[k + i];
	//   16   30:iload_3         
	//   17   31:iload_1         
	//   18   32:iadd            
	//   19   33:newarray        int[]
	//   20   35:astore          4
		for(i = 0; i < k; i++)
	//*  21   37:iconst_0        
	//*  22   38:istore_1        
	//*  23   39:iload_1         
	//*  24   40:iload_3         
	//*  25   41:icmpge          69
			ai[i] = field.multiply(coefficients[i], j);
	//   26   44:aload           4
	//   27   46:iload_1         
	//   28   47:aload_0         
	//   29   48:getfield        #18  <Field GF256 field>
	//   30   51:aload_0         
	//   31   52:getfield        #26  <Field int[] coefficients>
	//   32   55:iload_1         
	//   33   56:iaload          
	//   34   57:iload_2         
	//   35   58:invokevirtual   #71  <Method int GF256.multiply(int, int)>
	//   36   61:iastore         

	//   37   62:iload_1         
	//   38   63:iconst_1        
	//   39   64:iadd            
	//   40   65:istore_1        
	//*  41   66:goto            39
		return new GF256Poly(field, ai);
	//   42   69:new             #2   <Class GF256Poly>
	//   43   72:dup             
	//   44   73:aload_0         
	//   45   74:getfield        #18  <Field GF256 field>
	//   46   77:aload           4
	//   47   79:invokespecial   #53  <Method void GF256Poly(GF256, int[])>
	//   48   82:areturn         
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer(getDegree() * 8);
	//    0    0:new             #88  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #61  <Method int getDegree()>
	//    4    8:bipush          8
	//    5   10:imul            
	//    6   11:invokespecial   #91  <Method void StringBuffer(int)>
	//    7   14:astore          4
		int i = getDegree();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #61  <Method int getDegree()>
	//   10   20:istore_1        
		do
		{
			if(i >= 0)
	//*  11   21:iload_1         
	//*  12   22:iflt            179
			{
				int k = getCoefficient(i);
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:invokevirtual   #65  <Method int getCoefficient(int)>
	//   16   30:istore_3        
				if(k != 0)
	//*  17   31:iload_3         
	//*  18   32:ifeq            97
				{
					int j;
					if(k < 0)
	//*  19   35:iload_3         
	//*  20   36:ifge            104
					{
						stringbuffer.append(" - ");
	//   21   39:aload           4
	//   22   41:ldc1            #93  <String " - ">
	//   23   43:invokevirtual   #97  <Method StringBuffer StringBuffer.append(String)>
	//   24   46:pop             
						j = -k;
	//   25   47:iload_3         
	//   26   48:ineg            
	//   27   49:istore_2        
					} else
	//*  28   50:iload_1         
	//*  29   51:ifeq            59
	//*  30   54:iload_2         
	//*  31   55:iconst_1        
	//*  32   56:icmpeq          80
	//*  33   59:aload_0         
	//*  34   60:getfield        #18  <Field GF256 field>
	//*  35   63:iload_2         
	//*  36   64:invokevirtual   #100 <Method int GF256.log(int)>
	//*  37   67:istore_2        
	//*  38   68:iload_2         
	//*  39   69:ifne            127
	//*  40   72:aload           4
	//*  41   74:bipush          49
	//*  42   76:invokevirtual   #103 <Method StringBuffer StringBuffer.append(char)>
	//*  43   79:pop             
	//*  44   80:iload_1         
	//*  45   81:ifeq            97
	//*  46   84:iload_1         
	//*  47   85:iconst_1        
	//*  48   86:icmpne          161
	//*  49   89:aload           4
	//*  50   91:bipush          120
	//*  51   93:invokevirtual   #103 <Method StringBuffer StringBuffer.append(char)>
	//*  52   96:pop             
	//*  53   97:iload_1         
	//*  54   98:iconst_1        
	//*  55   99:isub            
	//*  56  100:istore_1        
	//*  57  101:goto            21
					{
						j = k;
	//   58  104:iload_3         
	//   59  105:istore_2        
						if(stringbuffer.length() > 0)
	//*  60  106:aload           4
	//*  61  108:invokevirtual   #106 <Method int StringBuffer.length()>
	//*  62  111:ifle            50
						{
							stringbuffer.append(" + ");
	//   63  114:aload           4
	//   64  116:ldc1            #108 <String " + ">
	//   65  118:invokevirtual   #97  <Method StringBuffer StringBuffer.append(String)>
	//   66  121:pop             
							j = k;
	//   67  122:iload_3         
	//   68  123:istore_2        
						}
					}
					if(i == 0 || j != 1)
					{
						j = field.log(j);
						if(j == 0)
							stringbuffer.append('1');
						else
	//*  69  124:goto            50
						if(j == 1)
	//*  70  127:iload_2         
	//*  71  128:iconst_1        
	//*  72  129:icmpne          143
						{
							stringbuffer.append('a');
	//   73  132:aload           4
	//   74  134:bipush          97
	//   75  136:invokevirtual   #103 <Method StringBuffer StringBuffer.append(char)>
	//   76  139:pop             
						} else
	//*  77  140:goto            80
						{
							stringbuffer.append("a^");
	//   78  143:aload           4
	//   79  145:ldc1            #110 <String "a^">
	//   80  147:invokevirtual   #97  <Method StringBuffer StringBuffer.append(String)>
	//   81  150:pop             
							stringbuffer.append(j);
	//   82  151:aload           4
	//   83  153:iload_2         
	//   84  154:invokevirtual   #113 <Method StringBuffer StringBuffer.append(int)>
	//   85  157:pop             
						}
					}
					if(i != 0)
						if(i == 1)
						{
							stringbuffer.append('x');
						} else
	//*  86  158:goto            80
						{
							stringbuffer.append("x^");
	//   87  161:aload           4
	//   88  163:ldc1            #115 <String "x^">
	//   89  165:invokevirtual   #97  <Method StringBuffer StringBuffer.append(String)>
	//   90  168:pop             
							stringbuffer.append(i);
	//   91  169:aload           4
	//   92  171:iload_1         
	//   93  172:invokevirtual   #113 <Method StringBuffer StringBuffer.append(int)>
	//   94  175:pop             
						}
				}
				i--;
				continue;
			}
	//*  95  176:goto            97
			return stringbuffer.toString();
	//   96  179:aload           4
	//   97  181:invokevirtual   #117 <Method String StringBuffer.toString()>
	//   98  184:areturn         
		} while(true);
	}

	private final int coefficients[];
	private final GF256 field;
}
