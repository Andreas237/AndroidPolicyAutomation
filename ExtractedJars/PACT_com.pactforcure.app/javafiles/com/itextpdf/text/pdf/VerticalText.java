// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfChunk, PdfLine, PdfContentByte, PdfFont

public class VerticalText
{

	public VerticalText(PdfContentByte pdfcontentbyte)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		chunks = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #35  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void ArrayList()>
	//    6   12:putfield        #38  <Field ArrayList chunks>
		alignment = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #40  <Field int alignment>
		currentChunkMarker = -1;
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:putfield        #42  <Field int currentChunkMarker>
		curCharSpace = Float.valueOf(0.0F);
	//   13   25:aload_0         
	//   14   26:fconst_0        
	//   15   27:invokestatic    #48  <Method Float Float.valueOf(float)>
	//   16   30:putfield        #50  <Field Float curCharSpace>
		text = pdfcontentbyte;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:putfield        #52  <Field PdfContentByte text>
	//   20   38:return          
	}

	public void addText(Chunk chunk)
	{
		chunks.add(((Object) (new PdfChunk(chunk, ((PdfAction) (null))))));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ArrayList chunks>
	//    2    4:new             #57  <Class PdfChunk>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #60  <Method void PdfChunk(Chunk, PdfAction)>
	//    7   13:invokevirtual   #64  <Method boolean ArrayList.add(Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void addText(Phrase phrase)
	{
		Chunk chunk;
		for(phrase = ((Phrase) (phrase.getChunks().iterator())); ((Iterator) (phrase)).hasNext(); chunks.add(((Object) (new PdfChunk(chunk, ((PdfAction) (null)))))))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #71  <Method List Phrase.getChunks()>
	//*   2    4:invokeinterface #77  <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            49
			chunk = (Chunk)((Iterator) (phrase)).next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #87  <Method Object Iterator.next()>
	//    9   25:checkcast       #89  <Class Chunk>
	//   10   28:astore_2        

	//   11   29:aload_0         
	//   12   30:getfield        #38  <Field ArrayList chunks>
	//   13   33:new             #57  <Class PdfChunk>
	//   14   36:dup             
	//   15   37:aload_2         
	//   16   38:aconst_null     
	//   17   39:invokespecial   #60  <Method void PdfChunk(Chunk, PdfAction)>
	//   18   42:invokevirtual   #64  <Method boolean ArrayList.add(Object)>
	//   19   45:pop             
	//*  20   46:goto            10
	//   21   49:return          
	}

	protected PdfLine createLine(float f)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(!chunks.isEmpty()) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #38  <Field ArrayList chunks>
	//    4    6:invokevirtual   #94  <Method boolean ArrayList.isEmpty()>
	//    5    9:ifeq            14
_L1:
		return ((PdfLine) (obj));
	//    6   12:aload_2         
	//    7   13:areturn         
_L2:
		splittedChunkText = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #96  <Field String splittedChunkText>
		currentStandbyChunk = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #98  <Field PdfChunk currentStandbyChunk>
		PdfLine pdfline = new PdfLine(0.0F, f, alignment, 0.0F);
	//   14   24:new             #100 <Class PdfLine>
	//   15   27:dup             
	//   16   28:fconst_0        
	//   17   29:fload_1         
	//   18   30:aload_0         
	//   19   31:getfield        #40  <Field int alignment>
	//   20   34:fconst_0        
	//   21   35:invokespecial   #103 <Method void PdfLine(float, float, int, float)>
	//   22   38:astore_3        
		currentChunkMarker = 0;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #42  <Field int currentChunkMarker>
		do
		{
			obj = ((Object) (pdfline));
	//   26   44:aload_3         
	//   27   45:astore_2        
			if(currentChunkMarker >= chunks.size())
				continue;
	//   28   46:aload_0         
	//   29   47:getfield        #42  <Field int currentChunkMarker>
	//   30   50:aload_0         
	//   31   51:getfield        #38  <Field ArrayList chunks>
	//   32   54:invokevirtual   #107 <Method int ArrayList.size()>
	//   33   57:icmpge          12
			obj = ((Object) ((PdfChunk)chunks.get(currentChunkMarker)));
	//   34   60:aload_0         
	//   35   61:getfield        #38  <Field ArrayList chunks>
	//   36   64:aload_0         
	//   37   65:getfield        #42  <Field int currentChunkMarker>
	//   38   68:invokevirtual   #111 <Method Object ArrayList.get(int)>
	//   39   71:checkcast       #57  <Class PdfChunk>
	//   40   74:astore_2        
			String s = ((PdfChunk) (obj)).toString();
	//   41   75:aload_2         
	//   42   76:invokevirtual   #115 <Method String PdfChunk.toString()>
	//   43   79:astore          4
			currentStandbyChunk = pdfline.add(((PdfChunk) (obj)));
	//   44   81:aload_0         
	//   45   82:aload_3         
	//   46   83:aload_2         
	//   47   84:invokevirtual   #118 <Method PdfChunk PdfLine.add(PdfChunk)>
	//   48   87:putfield        #98  <Field PdfChunk currentStandbyChunk>
			if(currentStandbyChunk != null)
	//*  49   90:aload_0         
	//*  50   91:getfield        #98  <Field PdfChunk currentStandbyChunk>
	//*  51   94:ifnull          113
			{
				splittedChunkText = ((PdfChunk) (obj)).toString();
	//   52   97:aload_0         
	//   53   98:aload_2         
	//   54   99:invokevirtual   #115 <Method String PdfChunk.toString()>
	//   55  102:putfield        #96  <Field String splittedChunkText>
				((PdfChunk) (obj)).setValue(s);
	//   56  105:aload_2         
	//   57  106:aload           4
	//   58  108:invokevirtual   #122 <Method void PdfChunk.setValue(String)>
				return pdfline;
	//   59  111:aload_3         
	//   60  112:areturn         
			}
			currentChunkMarker = currentChunkMarker + 1;
	//   61  113:aload_0         
	//   62  114:aload_0         
	//   63  115:getfield        #42  <Field int currentChunkMarker>
	//   64  118:iconst_1        
	//   65  119:iadd            
	//   66  120:putfield        #42  <Field int currentChunkMarker>
		} while(true);
	//   67  123:goto            44
		if(true) goto _L1; else goto _L3
_L3:
	}

	public int getAlignment()
	{
		return alignment;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int alignment>
	//    2    4:ireturn         
	}

	public float getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field float height>
	//    2    4:freturn         
	}

	public float getLeading()
	{
		return leading;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field float leading>
	//    2    4:freturn         
	}

	public int getMaxLines()
	{
		return maxLines;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field int maxLines>
	//    2    4:ireturn         
	}

	public float getOriginX()
	{
		return startX;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field float startX>
	//    2    4:freturn         
	}

	public float getOriginY()
	{
		return startY;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field float startY>
	//    2    4:freturn         
	}

	public int go()
	{
		return go(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #143 <Method int go(boolean)>
	//    3    5:ireturn         
	}

	public int go(boolean flag)
	{
		boolean flag2;
		PdfContentByte pdfcontentbyte;
		flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		pdfcontentbyte = null;
	//    2    2:aconst_null     
	//    3    3:astore          4
		if(text == null) goto _L2; else goto _L1
	//    4    5:aload_0         
	//    5    6:getfield        #52  <Field PdfContentByte text>
	//    6    9:ifnull          66
_L1:
		pdfcontentbyte = text.getDuplicate();
	//    7   12:aload_0         
	//    8   13:getfield        #52  <Field PdfContentByte text>
	//    9   16:invokevirtual   #149 <Method PdfContentByte PdfContentByte.getDuplicate()>
	//   10   19:astore          4
_L8:
		if(maxLines > 0) goto _L4; else goto _L3
	//   11   21:aload_0         
	//   12   22:getfield        #133 <Field int maxLines>
	//   13   25:ifgt            87
_L3:
		int i;
		i = 2;
	//   14   28:iconst_2        
	//   15   29:istore_2        
		if(chunks.isEmpty())
	//*  16   30:aload_0         
	//*  17   31:getfield        #38  <Field ArrayList chunks>
	//*  18   34:invokevirtual   #94  <Method boolean ArrayList.isEmpty()>
	//*  19   37:ifeq            44
			i = 2 | 1;
	//   20   40:iconst_2        
	//   21   41:iconst_1        
	//   22   42:ior             
	//   23   43:istore_2        
_L6:
		if(flag2)
	//*  24   44:iload_3         
	//*  25   45:ifeq            64
		{
			text.endText();
	//   26   48:aload_0         
	//   27   49:getfield        #52  <Field PdfContentByte text>
	//   28   52:invokevirtual   #152 <Method void PdfContentByte.endText()>
			text.add(pdfcontentbyte);
	//   29   55:aload_0         
	//   30   56:getfield        #52  <Field PdfContentByte text>
	//   31   59:aload           4
	//   32   61:invokevirtual   #154 <Method void PdfContentByte.add(PdfContentByte)>
		}
		return i;
	//   33   64:iload_2         
	//   34   65:ireturn         
_L2:
		if(!flag)
	//*  35   66:iload_1         
	//*  36   67:ifne            21
			throw new NullPointerException(MessageLocalization.getComposedMessage("verticaltext.go.with.simulate.eq.eq.false.and.text.eq.eq.null", new Object[0]));
	//   37   70:new             #156 <Class NullPointerException>
	//   38   73:dup             
	//   39   74:ldc1            #158 <String "verticaltext.go.with.simulate.eq.eq.false.and.text.eq.eq.null">
	//   40   76:iconst_0        
	//   41   77:anewarray       Object[]
	//   42   80:invokestatic    #164 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   43   83:invokespecial   #166 <Method void NullPointerException(String)>
	//   44   86:athrow          
		continue; /* Loop/switch isn't completed */
_L4:
		if(!chunks.isEmpty())
			break; /* Loop/switch isn't completed */
	//   45   87:aload_0         
	//   46   88:getfield        #38  <Field ArrayList chunks>
	//   47   91:invokevirtual   #94  <Method boolean ArrayList.isEmpty()>
	//   48   94:ifeq            102
		i = 1;
	//   49   97:iconst_1        
	//   50   98:istore_2        
		if(true) goto _L6; else goto _L5
	//   51   99:goto            44
_L5:
		PdfLine pdfline = createLine(height);
	//   52  102:aload_0         
	//   53  103:aload_0         
	//   54  104:getfield        #127 <Field float height>
	//   55  107:invokevirtual   #168 <Method PdfLine createLine(float)>
	//   56  110:astore          5
		boolean flag1 = flag2;
	//   57  112:iload_3         
	//   58  113:istore_2        
		if(!flag)
	//*  59  114:iload_1         
	//*  60  115:ifne            133
		{
			flag1 = flag2;
	//   61  118:iload_3         
	//   62  119:istore_2        
			if(!flag2)
	//*  63  120:iload_3         
	//*  64  121:ifne            133
			{
				text.beginText();
	//   65  124:aload_0         
	//   66  125:getfield        #52  <Field PdfContentByte text>
	//   67  128:invokevirtual   #171 <Method void PdfContentByte.beginText()>
				flag1 = true;
	//   68  131:iconst_1        
	//   69  132:istore_2        
			}
		}
		shortenChunkArray();
	//   70  133:aload_0         
	//   71  134:invokevirtual   #174 <Method void shortenChunkArray()>
		if(!flag)
	//*  72  137:iload_1         
	//*  73  138:ifne            174
		{
			text.setTextMatrix(startX, startY - pdfline.indentLeft());
	//   74  141:aload_0         
	//   75  142:getfield        #52  <Field PdfContentByte text>
	//   76  145:aload_0         
	//   77  146:getfield        #136 <Field float startX>
	//   78  149:aload_0         
	//   79  150:getfield        #139 <Field float startY>
	//   80  153:aload           5
	//   81  155:invokevirtual   #177 <Method float PdfLine.indentLeft()>
	//   82  158:fsub            
	//   83  159:invokevirtual   #181 <Method void PdfContentByte.setTextMatrix(float, float)>
			writeLine(pdfline, text, pdfcontentbyte);
	//   84  162:aload_0         
	//   85  163:aload           5
	//   86  165:aload_0         
	//   87  166:getfield        #52  <Field PdfContentByte text>
	//   88  169:aload           4
	//   89  171:invokevirtual   #185 <Method void writeLine(PdfLine, PdfContentByte, PdfContentByte)>
		}
		maxLines = maxLines - 1;
	//   90  174:aload_0         
	//   91  175:aload_0         
	//   92  176:getfield        #133 <Field int maxLines>
	//   93  179:iconst_1        
	//   94  180:isub            
	//   95  181:putfield        #133 <Field int maxLines>
		startX = startX - leading;
	//   96  184:aload_0         
	//   97  185:aload_0         
	//   98  186:getfield        #136 <Field float startX>
	//   99  189:aload_0         
	//  100  190:getfield        #130 <Field float leading>
	//  101  193:fsub            
	//  102  194:putfield        #136 <Field float startX>
		flag2 = flag1;
	//  103  197:iload_2         
	//  104  198:istore_3        
		if(true) goto _L8; else goto _L7
	//  105  199:goto            21
_L7:
	}

	public void setAlignment(int i)
	{
		alignment = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field int alignment>
	//    3    5:return          
	}

	public void setHeight(float f)
	{
		height = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #127 <Field float height>
	//    3    5:return          
	}

	public void setLeading(float f)
	{
		leading = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #130 <Field float leading>
	//    3    5:return          
	}

	public void setMaxLines(int i)
	{
		maxLines = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #133 <Field int maxLines>
	//    3    5:return          
	}

	public void setOrigin(float f, float f1)
	{
		startX = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #136 <Field float startX>
		startY = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #139 <Field float startY>
	//    6   10:return          
	}

	public void setVerticalLayout(float f, float f1, float f2, int i, float f3)
	{
		startX = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #136 <Field float startX>
		startY = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #139 <Field float startY>
		height = f2;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #127 <Field float height>
		maxLines = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #133 <Field int maxLines>
		setLeading(f3);
	//   12   21:aload_0         
	//   13   22:fload           5
	//   14   24:invokevirtual   #196 <Method void setLeading(float)>
	//   15   27:return          
	}

	protected void shortenChunkArray()
	{
		if(currentChunkMarker >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field int currentChunkMarker>
	//*   2    4:ifge            8
	//*   3    7:return          
		{
			if(currentChunkMarker >= chunks.size())
	//*   4    8:aload_0         
	//*   5    9:getfield        #42  <Field int currentChunkMarker>
	//*   6   12:aload_0         
	//*   7   13:getfield        #38  <Field ArrayList chunks>
	//*   8   16:invokevirtual   #107 <Method int ArrayList.size()>
	//*   9   19:icmplt          30
			{
				chunks.clear();
	//   10   22:aload_0         
	//   11   23:getfield        #38  <Field ArrayList chunks>
	//   12   26:invokevirtual   #199 <Method void ArrayList.clear()>
				return;
	//   13   29:return          
			}
			((PdfChunk)chunks.get(currentChunkMarker)).setValue(splittedChunkText);
	//   14   30:aload_0         
	//   15   31:getfield        #38  <Field ArrayList chunks>
	//   16   34:aload_0         
	//   17   35:getfield        #42  <Field int currentChunkMarker>
	//   18   38:invokevirtual   #111 <Method Object ArrayList.get(int)>
	//   19   41:checkcast       #57  <Class PdfChunk>
	//   20   44:aload_0         
	//   21   45:getfield        #96  <Field String splittedChunkText>
	//   22   48:invokevirtual   #122 <Method void PdfChunk.setValue(String)>
			chunks.set(currentChunkMarker, ((Object) (currentStandbyChunk)));
	//   23   51:aload_0         
	//   24   52:getfield        #38  <Field ArrayList chunks>
	//   25   55:aload_0         
	//   26   56:getfield        #42  <Field int currentChunkMarker>
	//   27   59:aload_0         
	//   28   60:getfield        #98  <Field PdfChunk currentStandbyChunk>
	//   29   63:invokevirtual   #203 <Method Object ArrayList.set(int, Object)>
	//   30   66:pop             
			int i = currentChunkMarker - 1;
	//   31   67:aload_0         
	//   32   68:getfield        #42  <Field int currentChunkMarker>
	//   33   71:iconst_1        
	//   34   72:isub            
	//   35   73:istore_1        
			while(i >= 0) 
	//*  36   74:iload_1         
	//*  37   75:iflt            7
			{
				chunks.remove(i);
	//   38   78:aload_0         
	//   39   79:getfield        #38  <Field ArrayList chunks>
	//   40   82:iload_1         
	//   41   83:invokevirtual   #206 <Method Object ArrayList.remove(int)>
	//   42   86:pop             
				i--;
	//   43   87:iload_1         
	//   44   88:iconst_1        
	//   45   89:isub            
	//   46   90:istore_1        
			}
		}
	//*  47   91:goto            74
	}

	void writeLine(PdfLine pdfline, PdfContentByte pdfcontentbyte, PdfContentByte pdfcontentbyte1)
	{
		pdfcontentbyte1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		Iterator iterator = pdfline.iterator();
	//    2    2:aload_1         
	//    3    3:invokevirtual   #207 <Method Iterator PdfLine.iterator()>
	//    4    6:astore          10
		pdfline = ((PdfLine) (pdfcontentbyte1));
	//    5    8:aload_3         
	//    6    9:astore_1        
label0:
		do
		{
			float f;
			int i;
			Object obj;
			BaseColor basecolor;
			PdfChunk pdfchunk;
label1:
			{
				if(!iterator.hasNext())
					break label0;
	//    7   10:aload           10
	//    8   12:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//    9   17:ifeq            356
				pdfchunk = (PdfChunk)iterator.next();
	//   10   20:aload           10
	//   11   22:invokeinterface #87  <Method Object Iterator.next()>
	//   12   27:checkcast       #57  <Class PdfChunk>
	//   13   30:astore          11
				pdfcontentbyte1 = ((PdfContentByte) (pdfline));
	//   14   32:aload_1         
	//   15   33:astore_3        
				if(!pdfchunk.isImage())
	//*  16   34:aload           11
	//*  17   36:invokevirtual   #210 <Method boolean PdfChunk.isImage()>
	//*  18   39:ifne            74
				{
					pdfcontentbyte1 = ((PdfContentByte) (pdfline));
	//   19   42:aload_1         
	//   20   43:astore_3        
					if(pdfchunk.font().compareTo(((PdfFont) (pdfline))) != 0)
	//*  21   44:aload           11
	//*  22   46:invokevirtual   #214 <Method PdfFont PdfChunk.font()>
	//*  23   49:aload_1         
	//*  24   50:invokevirtual   #220 <Method int PdfFont.compareTo(PdfFont)>
	//*  25   53:ifeq            74
					{
						pdfcontentbyte1 = ((PdfContentByte) (pdfchunk.font()));
	//   26   56:aload           11
	//   27   58:invokevirtual   #214 <Method PdfFont PdfChunk.font()>
	//   28   61:astore_3        
						pdfcontentbyte.setFontAndSize(((PdfFont) (pdfcontentbyte1)).getFont(), ((PdfFont) (pdfcontentbyte1)).size());
	//   29   62:aload_2         
	//   30   63:aload_3         
	//   31   64:invokevirtual   #224 <Method BaseFont PdfFont.getFont()>
	//   32   67:aload_3         
	//   33   68:invokevirtual   #226 <Method float PdfFont.size()>
	//   34   71:invokevirtual   #230 <Method void PdfContentByte.setFontAndSize(BaseFont, float)>
					}
				}
				Object aobj[] = (Object[])(Object[])pdfchunk.getAttribute("TEXTRENDERMODE");
	//   35   74:aload           11
	//   36   76:ldc1            #232 <String "TEXTRENDERMODE">
	//   37   78:invokevirtual   #236 <Method Object PdfChunk.getAttribute(String)>
	//   38   81:checkcast       #238 <Class Object[]>
	//   39   84:checkcast       #238 <Class Object[]>
	//   40   87:astore          12
				i = 0;
	//   41   89:iconst_0        
	//   42   90:istore          6
				float f1 = 1.0F;
	//   43   92:fconst_1        
	//   44   93:fstore          5
				basecolor = pdfchunk.color();
	//   45   95:aload           11
	//   46   97:invokevirtual   #242 <Method BaseColor PdfChunk.color()>
	//   47  100:astore          9
				pdfline = null;
	//   48  102:aconst_null     
	//   49  103:astore_1        
				obj = ((Object) (pdfline));
	//   50  104:aload_1         
	//   51  105:astore          8
				f = f1;
	//   52  107:fload           5
	//   53  109:fstore          4
				if(aobj == null)
					break label1;
	//   54  111:aload           12
	//   55  113:ifnull          240
				int j = ((Integer)aobj[0]).intValue() & 3;
	//   56  116:aload           12
	//   57  118:iconst_0        
	//   58  119:aaload          
	//   59  120:checkcast       #244 <Class Integer>
	//   60  123:invokevirtual   #247 <Method int Integer.intValue()>
	//   61  126:iconst_3        
	//   62  127:iand            
	//   63  128:istore          7
				if(j != 0)
	//*  64  130:iload           7
	//*  65  132:ifeq            141
					pdfcontentbyte.setTextRenderingMode(j);
	//   66  135:aload_2         
	//   67  136:iload           7
	//   68  138:invokevirtual   #250 <Method void PdfContentByte.setTextRenderingMode(int)>
				if(j != 1)
	//*  69  141:iload           7
	//*  70  143:iconst_1        
	//*  71  144:icmpeq          164
				{
					obj = ((Object) (pdfline));
	//   72  147:aload_1         
	//   73  148:astore          8
					f = f1;
	//   74  150:fload           5
	//   75  152:fstore          4
					i = j;
	//   76  154:iload           7
	//   77  156:istore          6
					if(j != 2)
						break label1;
	//   78  158:iload           7
	//   79  160:iconst_2        
	//   80  161:icmpne          240
				}
				f1 = ((Float)aobj[1]).floatValue();
	//   81  164:aload           12
	//   82  166:iconst_1        
	//   83  167:aaload          
	//   84  168:checkcast       #44  <Class Float>
	//   85  171:invokevirtual   #253 <Method float Float.floatValue()>
	//   86  174:fstore          5
				if(f1 != 1.0F)
	//*  87  176:fload           5
	//*  88  178:fconst_1        
	//*  89  179:fcmpl           
	//*  90  180:ifeq            189
					pdfcontentbyte.setLineWidth(f1);
	//   91  183:aload_2         
	//   92  184:fload           5
	//   93  186:invokevirtual   #256 <Method void PdfContentByte.setLineWidth(float)>
				obj = ((Object) ((BaseColor)aobj[2]));
	//   94  189:aload           12
	//   95  191:iconst_2        
	//   96  192:aaload          
	//   97  193:checkcast       #258 <Class BaseColor>
	//   98  196:astore          8
				pdfline = ((PdfLine) (obj));
	//   99  198:aload           8
	//  100  200:astore_1        
				if(obj == null)
	//* 101  201:aload           8
	//* 102  203:ifnonnull       209
					pdfline = ((PdfLine) (basecolor));
	//  103  206:aload           9
	//  104  208:astore_1        
				obj = ((Object) (pdfline));
	//  105  209:aload_1         
	//  106  210:astore          8
				f = f1;
	//  107  212:fload           5
	//  108  214:fstore          4
				i = j;
	//  109  216:iload           7
	//  110  218:istore          6
				if(pdfline != null)
	//* 111  220:aload_1         
	//* 112  221:ifnull          240
				{
					pdfcontentbyte.setColorStroke(((BaseColor) (pdfline)));
	//  113  224:aload_2         
	//  114  225:aload_1         
	//  115  226:invokevirtual   #262 <Method void PdfContentByte.setColorStroke(BaseColor)>
					i = j;
	//  116  229:iload           7
	//  117  231:istore          6
					f = f1;
	//  118  233:fload           5
	//  119  235:fstore          4
					obj = ((Object) (pdfline));
	//  120  237:aload_1         
	//  121  238:astore          8
				}
			}
			pdfline = ((PdfLine) ((Float)pdfchunk.getAttribute("CHAR_SPACING")));
	//  122  240:aload           11
	//  123  242:ldc2            #264 <String "CHAR_SPACING">
	//  124  245:invokevirtual   #236 <Method Object PdfChunk.getAttribute(String)>
	//  125  248:checkcast       #44  <Class Float>
	//  126  251:astore_1        
			if(pdfline != null && !curCharSpace.equals(((Object) (pdfline))))
	//* 127  252:aload_1         
	//* 128  253:ifnull          289
	//* 129  256:aload_0         
	//* 130  257:getfield        #50  <Field Float curCharSpace>
	//* 131  260:aload_1         
	//* 132  261:invokevirtual   #267 <Method boolean Float.equals(Object)>
	//* 133  264:ifne            289
			{
				curCharSpace = Float.valueOf(((Float) (pdfline)).floatValue());
	//  134  267:aload_0         
	//  135  268:aload_1         
	//  136  269:invokevirtual   #253 <Method float Float.floatValue()>
	//  137  272:invokestatic    #48  <Method Float Float.valueOf(float)>
	//  138  275:putfield        #50  <Field Float curCharSpace>
				pdfcontentbyte.setCharacterSpacing(curCharSpace.floatValue());
	//  139  278:aload_2         
	//  140  279:aload_0         
	//  141  280:getfield        #50  <Field Float curCharSpace>
	//  142  283:invokevirtual   #253 <Method float Float.floatValue()>
	//  143  286:invokevirtual   #270 <Method void PdfContentByte.setCharacterSpacing(float)>
			}
			if(basecolor != null)
	//* 144  289:aload           9
	//* 145  291:ifnull          300
				pdfcontentbyte.setColorFill(basecolor);
	//  146  294:aload_2         
	//  147  295:aload           9
	//  148  297:invokevirtual   #273 <Method void PdfContentByte.setColorFill(BaseColor)>
			pdfcontentbyte.showText(pdfchunk.toString());
	//  149  300:aload_2         
	//  150  301:aload           11
	//  151  303:invokevirtual   #115 <Method String PdfChunk.toString()>
	//  152  306:invokevirtual   #276 <Method void PdfContentByte.showText(String)>
			if(basecolor != null)
	//* 153  309:aload           9
	//* 154  311:ifnull          318
				pdfcontentbyte.resetRGBColorFill();
	//  155  314:aload_2         
	//  156  315:invokevirtual   #279 <Method void PdfContentByte.resetRGBColorFill()>
			if(i != 0)
	//* 157  318:iload           6
	//* 158  320:ifeq            328
				pdfcontentbyte.setTextRenderingMode(0);
	//  159  323:aload_2         
	//  160  324:iconst_0        
	//  161  325:invokevirtual   #250 <Method void PdfContentByte.setTextRenderingMode(int)>
			if(obj != null)
	//* 162  328:aload           8
	//* 163  330:ifnull          337
				pdfcontentbyte.resetRGBColorStroke();
	//  164  333:aload_2         
	//  165  334:invokevirtual   #282 <Method void PdfContentByte.resetRGBColorStroke()>
			pdfline = ((PdfLine) (pdfcontentbyte1));
	//  166  337:aload_3         
	//  167  338:astore_1        
			if(f != 1.0F)
	//* 168  339:fload           4
	//* 169  341:fconst_1        
	//* 170  342:fcmpl           
	//* 171  343:ifeq            10
			{
				pdfcontentbyte.setLineWidth(1.0F);
	//  172  346:aload_2         
	//  173  347:fconst_1        
	//  174  348:invokevirtual   #256 <Method void PdfContentByte.setLineWidth(float)>
				pdfline = ((PdfLine) (pdfcontentbyte1));
	//  175  351:aload_3         
	//  176  352:astore_1        
			}
		} while(true);
	//  177  353:goto            10
	//  178  356:return          
	}

	public static final int NO_MORE_COLUMN = 2;
	public static final int NO_MORE_TEXT = 1;
	protected int alignment;
	protected ArrayList chunks;
	private Float curCharSpace;
	protected int currentChunkMarker;
	protected PdfChunk currentStandbyChunk;
	protected float height;
	protected float leading;
	protected int maxLines;
	protected String splittedChunkText;
	protected float startX;
	protected float startY;
	protected PdfContentByte text;
}
