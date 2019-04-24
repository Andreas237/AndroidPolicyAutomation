// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			TextExtractionStrategy, TextRenderInfo, LineSegment, Vector, 
//			ImageRenderInfo

public class SimpleTextExtractionStrategy
	implements TextExtractionStrategy
{

	public SimpleTextExtractionStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class StringBuffer>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void StringBuffer()>
	//    6   12:putfield        #20  <Field StringBuffer result>
	//    7   15:return          
	}

	protected final void appendTextChunk(CharSequence charsequence)
	{
		result.append(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field StringBuffer result>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method StringBuffer StringBuffer.append(CharSequence)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void beginTextBlock()
	{
	//    0    0:return          
	}

	public void endTextBlock()
	{
	//    0    0:return          
	}

	public String getResultantText()
	{
		return result.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field StringBuffer result>
	//    2    4:invokevirtual   #34  <Method String StringBuffer.toString()>
	//    3    7:areturn         
	}

	public void renderImage(ImageRenderInfo imagerenderinfo)
	{
	//    0    0:return          
	}

	public void renderText(TextRenderInfo textrenderinfo)
	{
		boolean flag;
		Vector vector;
		boolean flag1;
		boolean flag2;
		Object obj;
		if(result.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field StringBuffer result>
	//*   2    4:invokevirtual   #42  <Method int StringBuffer.length()>
	//*   3    7:ifne            126
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore_2        
		else
	//*   6   12:iconst_0        
	//*   7   13:istore          4
	//*   8   15:aload_1         
	//*   9   16:invokevirtual   #48  <Method LineSegment TextRenderInfo.getBaseline()>
	//*  10   19:astore          6
	//*  11   21:aload           6
	//*  12   23:invokevirtual   #54  <Method Vector LineSegment.getStartPoint()>
	//*  13   26:astore          5
	//*  14   28:aload           6
	//*  15   30:invokevirtual   #57  <Method Vector LineSegment.getEndPoint()>
	//*  16   33:astore          6
	//*  17   35:iload           4
	//*  18   37:istore_3        
	//*  19   38:iload_2         
	//*  20   39:ifne            95
	//*  21   42:aload_0         
	//*  22   43:getfield        #59  <Field Vector lastStart>
	//*  23   46:astore          7
	//*  24   48:aload_0         
	//*  25   49:getfield        #61  <Field Vector lastEnd>
	//*  26   52:astore          8
	//*  27   54:iload           4
	//*  28   56:istore_3        
	//*  29   57:aload           8
	//*  30   59:aload           7
	//*  31   61:invokevirtual   #67  <Method Vector Vector.subtract(Vector)>
	//*  32   64:aload           7
	//*  33   66:aload           5
	//*  34   68:invokevirtual   #67  <Method Vector Vector.subtract(Vector)>
	//*  35   71:invokevirtual   #70  <Method Vector Vector.cross(Vector)>
	//*  36   74:invokevirtual   #74  <Method float Vector.lengthSquared()>
	//*  37   77:aload           8
	//*  38   79:aload           7
	//*  39   81:invokevirtual   #67  <Method Vector Vector.subtract(Vector)>
	//*  40   84:invokevirtual   #74  <Method float Vector.lengthSquared()>
	//*  41   87:fdiv            
	//*  42   88:fconst_1        
	//*  43   89:fcmpl           
	//*  44   90:ifle            95
	//*  45   93:iconst_1        
	//*  46   94:istore_3        
	//*  47   95:iload_3         
	//*  48   96:ifeq            131
	//*  49   99:aload_0         
	//*  50  100:ldc1            #76  <String "\n">
	//*  51  102:invokevirtual   #78  <Method void appendTextChunk(CharSequence)>
	//*  52  105:aload_0         
	//*  53  106:aload_1         
	//*  54  107:invokevirtual   #81  <Method String TextRenderInfo.getText()>
	//*  55  110:invokevirtual   #78  <Method void appendTextChunk(CharSequence)>
	//*  56  113:aload_0         
	//*  57  114:aload           5
	//*  58  116:putfield        #59  <Field Vector lastStart>
	//*  59  119:aload_0         
	//*  60  120:aload           6
	//*  61  122:putfield        #61  <Field Vector lastEnd>
	//*  62  125:return          
			flag = false;
	//   63  126:iconst_0        
	//   64  127:istore_2        
		flag2 = false;
		obj = ((Object) (textrenderinfo.getBaseline()));
		vector = ((LineSegment) (obj)).getStartPoint();
		obj = ((Object) (((LineSegment) (obj)).getEndPoint()));
		flag1 = flag2;
		if(!flag)
		{
			Vector vector1 = lastStart;
			Vector vector2 = lastEnd;
			flag1 = flag2;
			if(vector2.subtract(vector1).cross(vector1.subtract(vector)).lengthSquared() / vector2.subtract(vector1).lengthSquared() > 1.0F)
				flag1 = true;
		}
		if(!flag1) goto _L2; else goto _L1
_L1:
		appendTextChunk("\n");
_L4:
		appendTextChunk(((CharSequence) (textrenderinfo.getText())));
		lastStart = vector;
		lastEnd = ((Vector) (obj));
		return;
	//*  65  128:goto            12
_L2:
		if(!flag && result.charAt(result.length() - 1) != ' ' && textrenderinfo.getText().length() > 0 && textrenderinfo.getText().charAt(0) != ' ' && lastEnd.subtract(vector).length() > textrenderinfo.getSingleSpaceWidth() / 2.0F)
	//*  66  131:iload_2         
	//*  67  132:ifne            105
	//*  68  135:aload_0         
	//*  69  136:getfield        #20  <Field StringBuffer result>
	//*  70  139:aload_0         
	//*  71  140:getfield        #20  <Field StringBuffer result>
	//*  72  143:invokevirtual   #42  <Method int StringBuffer.length()>
	//*  73  146:iconst_1        
	//*  74  147:isub            
	//*  75  148:invokevirtual   #85  <Method char StringBuffer.charAt(int)>
	//*  76  151:bipush          32
	//*  77  153:icmpeq          105
	//*  78  156:aload_1         
	//*  79  157:invokevirtual   #81  <Method String TextRenderInfo.getText()>
	//*  80  160:invokevirtual   #88  <Method int String.length()>
	//*  81  163:ifle            105
	//*  82  166:aload_1         
	//*  83  167:invokevirtual   #81  <Method String TextRenderInfo.getText()>
	//*  84  170:iconst_0        
	//*  85  171:invokevirtual   #89  <Method char String.charAt(int)>
	//*  86  174:bipush          32
	//*  87  176:icmpeq          105
	//*  88  179:aload_0         
	//*  89  180:getfield        #61  <Field Vector lastEnd>
	//*  90  183:aload           5
	//*  91  185:invokevirtual   #67  <Method Vector Vector.subtract(Vector)>
	//*  92  188:invokevirtual   #91  <Method float Vector.length()>
	//*  93  191:aload_1         
	//*  94  192:invokevirtual   #94  <Method float TextRenderInfo.getSingleSpaceWidth()>
	//*  95  195:fconst_2        
	//*  96  196:fdiv            
	//*  97  197:fcmpl           
	//*  98  198:ifle            105
			appendTextChunk(" ");
	//   99  201:aload_0         
	//  100  202:ldc1            #96  <String " ">
	//  101  204:invokevirtual   #78  <Method void appendTextChunk(CharSequence)>
		if(true) goto _L4; else goto _L3
	//  102  207:goto            105
_L3:
	}

	private Vector lastEnd;
	private Vector lastStart;
	private final StringBuffer result = new StringBuffer();
}
