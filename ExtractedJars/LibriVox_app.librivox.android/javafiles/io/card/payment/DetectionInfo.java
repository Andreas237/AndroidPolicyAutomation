// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.card.payment;


// Referenced classes of package io.card.payment:
//			CreditCard

class DetectionInfo
{

	public DetectionInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		complete = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #25  <Field boolean complete>
		prediction = new int[16];
	//    5    9:aload_0         
	//    6   10:bipush          16
	//    7   12:newarray        int[]
	//    8   14:putfield        #27  <Field int[] prediction>
		int ai[] = prediction;
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field int[] prediction>
	//   11   21:astore_1        
		ai[0] = -1;
	//   12   22:aload_1         
	//   13   23:iconst_0        
	//   14   24:iconst_m1       
	//   15   25:iastore         
		ai[15] = -1;
	//   16   26:aload_1         
	//   17   27:bipush          15
	//   18   29:iconst_m1       
	//   19   30:iastore         
		detectedCard = new CreditCard();
	//   20   31:aload_0         
	//   21   32:new             #29  <Class CreditCard>
	//   22   35:dup             
	//   23   36:invokespecial   #30  <Method void CreditCard()>
	//   24   39:putfield        #32  <Field CreditCard detectedCard>
	//   25   42:return          
	}

	boolean a()
	{
		return topEdge && bottomEdge && rightEdge && leftEdge;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean topEdge>
	//    2    4:ifeq            30
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field boolean bottomEdge>
	//    5   11:ifeq            30
	//    6   14:aload_0         
	//    7   15:getfield        #41  <Field boolean rightEdge>
	//    8   18:ifeq            30
	//    9   21:aload_0         
	//   10   22:getfield        #43  <Field boolean leftEdge>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	boolean a(DetectionInfo detectioninfo)
	{
		return detectioninfo.topEdge == topEdge && detectioninfo.bottomEdge == bottomEdge && detectioninfo.leftEdge == leftEdge && detectioninfo.rightEdge == rightEdge;
	//    0    0:aload_1         
	//    1    1:getfield        #37  <Field boolean topEdge>
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field boolean topEdge>
	//    4    8:icmpne          46
	//    5   11:aload_1         
	//    6   12:getfield        #39  <Field boolean bottomEdge>
	//    7   15:aload_0         
	//    8   16:getfield        #39  <Field boolean bottomEdge>
	//    9   19:icmpne          46
	//   10   22:aload_1         
	//   11   23:getfield        #43  <Field boolean leftEdge>
	//   12   26:aload_0         
	//   13   27:getfield        #43  <Field boolean leftEdge>
	//   14   30:icmpne          46
	//   15   33:aload_1         
	//   16   34:getfield        #41  <Field boolean rightEdge>
	//   17   37:aload_0         
	//   18   38:getfield        #41  <Field boolean rightEdge>
	//   19   41:icmpne          46
	//   20   44:iconst_1        
	//   21   45:ireturn         
	//   22   46:iconst_0        
	//   23   47:ireturn         
	}

	boolean b()
	{
		return complete;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean complete>
	//    2    4:ireturn         
	}

	CreditCard c()
	{
		String s = new String();
	//    0    0:new             #49  <Class String>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void String()>
	//    3    7:astore_2        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		do
		{
			if(i >= 16)
				break;
	//    6   10:iload_1         
	//    7   11:bipush          16
	//    8   13:icmpge          75
			int ai[] = prediction;
	//    9   16:aload_0         
	//   10   17:getfield        #27  <Field int[] prediction>
	//   11   20:astore_3        
			if(ai[i] < 0 || ai[i] >= 10)
				break;
	//   12   21:aload_3         
	//   13   22:iload_1         
	//   14   23:iaload          
	//   15   24:iflt            75
	//   16   27:aload_3         
	//   17   28:iload_1         
	//   18   29:iaload          
	//   19   30:bipush          10
	//   20   32:icmpge          75
			StringBuilder stringbuilder = new StringBuilder();
	//   21   35:new             #52  <Class StringBuilder>
	//   22   38:dup             
	//   23   39:invokespecial   #53  <Method void StringBuilder()>
	//   24   42:astore_3        
			stringbuilder.append(s);
	//   25   43:aload_3         
	//   26   44:aload_2         
	//   27   45:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   28   48:pop             
			stringbuilder.append(String.valueOf(prediction[i]));
	//   29   49:aload_3         
	//   30   50:aload_0         
	//   31   51:getfield        #27  <Field int[] prediction>
	//   32   54:iload_1         
	//   33   55:iaload          
	//   34   56:invokestatic    #61  <Method String String.valueOf(int)>
	//   35   59:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   36   62:pop             
			s = stringbuilder.toString();
	//   37   63:aload_3         
	//   38   64:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   39   67:astore_2        
			i++;
	//   40   68:iload_1         
	//   41   69:iconst_1        
	//   42   70:iadd            
	//   43   71:istore_1        
		} while(true);
	//   44   72:goto            10
		CreditCard creditcard = detectedCard;
	//   45   75:aload_0         
	//   46   76:getfield        #32  <Field CreditCard detectedCard>
	//   47   79:astore_3        
		creditcard.cardNumber = s;
	//   48   80:aload_3         
	//   49   81:aload_2         
	//   50   82:putfield        #69  <Field String CreditCard.cardNumber>
		creditcard.expiryMonth = expiry_month;
	//   51   85:aload_3         
	//   52   86:aload_0         
	//   53   87:getfield        #71  <Field int expiry_month>
	//   54   90:putfield        #74  <Field int CreditCard.expiryMonth>
		creditcard.expiryYear = expiry_year;
	//   55   93:aload_3         
	//   56   94:aload_0         
	//   57   95:getfield        #76  <Field int expiry_year>
	//   58   98:putfield        #79  <Field int CreditCard.expiryYear>
		return creditcard;
	//   59  101:aload_3         
	//   60  102:areturn         
	}

	int d()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #83  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #85  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #90  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public boolean bottomEdge;
	public boolean complete;
	public CreditCard detectedCard;
	public int expiry_month;
	public int expiry_year;
	public float focusScore;
	public boolean leftEdge;
	public int prediction[];
	public boolean rightEdge;
	public boolean topEdge;
}
