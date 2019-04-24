// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.HyphenationEvent;
import com.itextpdf.text.pdf.PdfAction;
import com.itextpdf.text.pdf.PdfAnnotation;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfObject;
import com.itextpdf.text.pdf.PdfString;
import com.itextpdf.text.pdf.draw.DrawInterface;
import com.itextpdf.text.pdf.interfaces.IAccessibleElement;
import java.net.URL;
import java.util.*;

// Referenced classes of package com.itextpdf.text:
//			Element, Font, Image, TabSplitCharacter, 
//			AccessibleElementId, DocumentException, ElementListener, Utilities, 
//			BaseColor, SplitCharacter

public class Chunk
	implements Element, IAccessibleElement
{

	public Chunk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void Object()>
		content = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #127 <Field StringBuffer content>
		font = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #129 <Field Font font>
		attributes = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #131 <Field HashMap attributes>
		role = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #133 <Field PdfName role>
		accessibleAttributes = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #135 <Field HashMap accessibleAttributes>
		id = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #137 <Field AccessibleElementId id>
		contentWithNoTabs = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #139 <Field String contentWithNoTabs>
		content = new StringBuffer();
	//   23   39:aload_0         
	//   24   40:new             #141 <Class StringBuffer>
	//   25   43:dup             
	//   26   44:invokespecial   #142 <Method void StringBuffer()>
	//   27   47:putfield        #127 <Field StringBuffer content>
		font = new Font();
	//   28   50:aload_0         
	//   29   51:new             #144 <Class Font>
	//   30   54:dup             
	//   31   55:invokespecial   #145 <Method void Font()>
	//   32   58:putfield        #129 <Field Font font>
		role = PdfName.SPAN;
	//   33   61:aload_0         
	//   34   62:getstatic       #148 <Field PdfName PdfName.SPAN>
	//   35   65:putfield        #133 <Field PdfName role>
	//   36   68:return          
	}

	public Chunk(char c)
	{
		this(c, new Font());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:new             #144 <Class Font>
	//    3    5:dup             
	//    4    6:invokespecial   #145 <Method void Font()>
	//    5    9:invokespecial   #152 <Method void Chunk(char, Font)>
	//    6   12:return          
	}

	public Chunk(char c, Font font1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void Object()>
		content = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #127 <Field StringBuffer content>
		font = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #129 <Field Font font>
		attributes = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #131 <Field HashMap attributes>
		role = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #133 <Field PdfName role>
		accessibleAttributes = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #135 <Field HashMap accessibleAttributes>
		id = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #137 <Field AccessibleElementId id>
		contentWithNoTabs = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #139 <Field String contentWithNoTabs>
		content = new StringBuffer();
	//   23   39:aload_0         
	//   24   40:new             #141 <Class StringBuffer>
	//   25   43:dup             
	//   26   44:invokespecial   #142 <Method void StringBuffer()>
	//   27   47:putfield        #127 <Field StringBuffer content>
		content.append(c);
	//   28   50:aload_0         
	//   29   51:getfield        #127 <Field StringBuffer content>
	//   30   54:iload_1         
	//   31   55:invokevirtual   #156 <Method StringBuffer StringBuffer.append(char)>
	//   32   58:pop             
		font = font1;
	//   33   59:aload_0         
	//   34   60:aload_2         
	//   35   61:putfield        #129 <Field Font font>
		role = PdfName.SPAN;
	//   36   64:aload_0         
	//   37   65:getstatic       #148 <Field PdfName PdfName.SPAN>
	//   38   68:putfield        #133 <Field PdfName role>
	//   39   71:return          
	}

	public Chunk(Chunk chunk)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void Object()>
		content = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #127 <Field StringBuffer content>
		font = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #129 <Field Font font>
		attributes = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #131 <Field HashMap attributes>
		role = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #133 <Field PdfName role>
		accessibleAttributes = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #135 <Field HashMap accessibleAttributes>
		id = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #137 <Field AccessibleElementId id>
		contentWithNoTabs = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #139 <Field String contentWithNoTabs>
		if(chunk.content != null)
	//*  23   39:aload_1         
	//*  24   40:getfield        #127 <Field StringBuffer content>
	//*  25   43:ifnull          64
			content = new StringBuffer(chunk.content.toString());
	//   26   46:aload_0         
	//   27   47:new             #141 <Class StringBuffer>
	//   28   50:dup             
	//   29   51:aload_1         
	//   30   52:getfield        #127 <Field StringBuffer content>
	//   31   55:invokevirtual   #161 <Method String StringBuffer.toString()>
	//   32   58:invokespecial   #162 <Method void StringBuffer(String)>
	//   33   61:putfield        #127 <Field StringBuffer content>
		if(chunk.font != null)
	//*  34   64:aload_1         
	//*  35   65:getfield        #129 <Field Font font>
	//*  36   68:ifnull          86
			font = new Font(chunk.font);
	//   37   71:aload_0         
	//   38   72:new             #144 <Class Font>
	//   39   75:dup             
	//   40   76:aload_1         
	//   41   77:getfield        #129 <Field Font font>
	//   42   80:invokespecial   #165 <Method void Font(Font)>
	//   43   83:putfield        #129 <Field Font font>
		if(chunk.attributes != null)
	//*  44   86:aload_1         
	//*  45   87:getfield        #131 <Field HashMap attributes>
	//*  46   90:ifnull          108
			attributes = new HashMap(((java.util.Map) (chunk.attributes)));
	//   47   93:aload_0         
	//   48   94:new             #167 <Class HashMap>
	//   49   97:dup             
	//   50   98:aload_1         
	//   51   99:getfield        #131 <Field HashMap attributes>
	//   52  102:invokespecial   #170 <Method void HashMap(java.util.Map)>
	//   53  105:putfield        #131 <Field HashMap attributes>
		role = chunk.role;
	//   54  108:aload_0         
	//   55  109:aload_1         
	//   56  110:getfield        #133 <Field PdfName role>
	//   57  113:putfield        #133 <Field PdfName role>
		if(chunk.accessibleAttributes != null)
	//*  58  116:aload_1         
	//*  59  117:getfield        #135 <Field HashMap accessibleAttributes>
	//*  60  120:ifnull          138
			accessibleAttributes = new HashMap(((java.util.Map) (chunk.accessibleAttributes)));
	//   61  123:aload_0         
	//   62  124:new             #167 <Class HashMap>
	//   63  127:dup             
	//   64  128:aload_1         
	//   65  129:getfield        #135 <Field HashMap accessibleAttributes>
	//   66  132:invokespecial   #170 <Method void HashMap(java.util.Map)>
	//   67  135:putfield        #135 <Field HashMap accessibleAttributes>
		id = chunk.getId();
	//   68  138:aload_0         
	//   69  139:aload_1         
	//   70  140:invokevirtual   #174 <Method AccessibleElementId getId()>
	//   71  143:putfield        #137 <Field AccessibleElementId id>
	//   72  146:return          
	}

	public Chunk(Image image, float f, float f1)
	{
		this("\uFFFC", new Font());
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <String "\uFFFC">
	//    2    3:new             #144 <Class Font>
	//    3    6:dup             
	//    4    7:invokespecial   #145 <Method void Font()>
	//    5   10:invokespecial   #178 <Method void Chunk(String, Font)>
		image = Image.getInstance(image);
	//    6   13:aload_1         
	//    7   14:invokestatic    #184 <Method Image Image.getInstance(Image)>
	//    8   17:astore_1        
		image.setAbsolutePosition((0.0F / 0.0F), (0.0F / 0.0F));
	//    9   18:aload_1         
	//   10   19:ldc1            #109 <Float (0.0F / 0.0F)>
	//   11   21:ldc1            #109 <Float (0.0F / 0.0F)>
	//   12   23:invokevirtual   #188 <Method void Image.setAbsolutePosition(float, float)>
		setAttribute("IMAGE", ((Object) (new Object[] {
			image, new Float(f), new Float(f1), Boolean.FALSE
		})));
	//   13   26:aload_0         
	//   14   27:ldc1            #27  <String "IMAGE">
	//   15   29:iconst_4        
	//   16   30:anewarray       Object[]
	//   17   33:dup             
	//   18   34:iconst_0        
	//   19   35:aload_1         
	//   20   36:aastore         
	//   21   37:dup             
	//   22   38:iconst_1        
	//   23   39:new             #111 <Class Float>
	//   24   42:dup             
	//   25   43:fload_2         
	//   26   44:invokespecial   #191 <Method void Float(float)>
	//   27   47:aastore         
	//   28   48:dup             
	//   29   49:iconst_2        
	//   30   50:new             #111 <Class Float>
	//   31   53:dup             
	//   32   54:fload_3         
	//   33   55:invokespecial   #191 <Method void Float(float)>
	//   34   58:aastore         
	//   35   59:dup             
	//   36   60:iconst_3        
	//   37   61:getstatic       #197 <Field Boolean Boolean.FALSE>
	//   38   64:aastore         
	//   39   65:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   40   68:pop             
		role = null;
	//   41   69:aload_0         
	//   42   70:aconst_null     
	//   43   71:putfield        #133 <Field PdfName role>
	//   44   74:return          
	}

	public Chunk(Image image, float f, float f1, boolean flag)
	{
		this("\uFFFC", new Font());
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <String "\uFFFC">
	//    2    3:new             #144 <Class Font>
	//    3    6:dup             
	//    4    7:invokespecial   #145 <Method void Font()>
	//    5   10:invokespecial   #178 <Method void Chunk(String, Font)>
		setAttribute("IMAGE", ((Object) (new Object[] {
			image, new Float(f), new Float(f1), Boolean.valueOf(flag)
		})));
	//    6   13:aload_0         
	//    7   14:ldc1            #27  <String "IMAGE">
	//    8   16:iconst_4        
	//    9   17:anewarray       Object[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:aload_1         
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_1        
	//   16   26:new             #111 <Class Float>
	//   17   29:dup             
	//   18   30:fload_2         
	//   19   31:invokespecial   #191 <Method void Float(float)>
	//   20   34:aastore         
	//   21   35:dup             
	//   22   36:iconst_2        
	//   23   37:new             #111 <Class Float>
	//   24   40:dup             
	//   25   41:fload_3         
	//   26   42:invokespecial   #191 <Method void Float(float)>
	//   27   45:aastore         
	//   28   46:dup             
	//   29   47:iconst_3        
	//   30   48:iload           4
	//   31   50:invokestatic    #205 <Method Boolean Boolean.valueOf(boolean)>
	//   32   53:aastore         
	//   33   54:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   34   57:pop             
		role = PdfName.ARTIFACT;
	//   35   58:aload_0         
	//   36   59:getstatic       #208 <Field PdfName PdfName.ARTIFACT>
	//   37   62:putfield        #133 <Field PdfName role>
	//   38   65:return          
	}

	public Chunk(DrawInterface drawinterface)
	{
		this(drawinterface, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #212 <Method void Chunk(DrawInterface, boolean)>
	//    4    6:return          
	}

	public Chunk(DrawInterface drawinterface, float f)
	{
		this(drawinterface, f, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #217 <Method void Chunk(DrawInterface, float, boolean)>
	//    5    7:return          
	}

	public Chunk(DrawInterface drawinterface, float f, boolean flag)
	{
		this("\uFFFC", new Font());
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <String "\uFFFC">
	//    2    3:new             #144 <Class Font>
	//    3    6:dup             
	//    4    7:invokespecial   #145 <Method void Font()>
	//    5   10:invokespecial   #178 <Method void Chunk(String, Font)>
		if(f < 0.0F)
	//*   6   13:fload_2         
	//*   7   14:fconst_0        
	//*   8   15:fcmpg           
	//*   9   16:ifge            43
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("a.tab.position.may.not.be.lower.than.0.yours.is.1", new Object[] {
				String.valueOf(f)
			}));
	//   10   19:new             #220 <Class IllegalArgumentException>
	//   11   22:dup             
	//   12   23:ldc1            #222 <String "a.tab.position.may.not.be.lower.than.0.yours.is.1">
	//   13   25:iconst_1        
	//   14   26:anewarray       Object[]
	//   15   29:dup             
	//   16   30:iconst_0        
	//   17   31:fload_2         
	//   18   32:invokestatic    #227 <Method String String.valueOf(float)>
	//   19   35:aastore         
	//   20   36:invokestatic    #233 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   21   39:invokespecial   #234 <Method void IllegalArgumentException(String)>
	//   22   42:athrow          
		} else
		{
			setAttribute("TAB", ((Object) (new Object[] {
				drawinterface, new Float(f), Boolean.valueOf(flag), new Float(0.0F)
			})));
	//   23   43:aload_0         
	//   24   44:ldc1            #56  <String "TAB">
	//   25   46:iconst_4        
	//   26   47:anewarray       Object[]
	//   27   50:dup             
	//   28   51:iconst_0        
	//   29   52:aload_1         
	//   30   53:aastore         
	//   31   54:dup             
	//   32   55:iconst_1        
	//   33   56:new             #111 <Class Float>
	//   34   59:dup             
	//   35   60:fload_2         
	//   36   61:invokespecial   #191 <Method void Float(float)>
	//   37   64:aastore         
	//   38   65:dup             
	//   39   66:iconst_2        
	//   40   67:iload_3         
	//   41   68:invokestatic    #205 <Method Boolean Boolean.valueOf(boolean)>
	//   42   71:aastore         
	//   43   72:dup             
	//   44   73:iconst_3        
	//   45   74:new             #111 <Class Float>
	//   46   77:dup             
	//   47   78:fconst_0        
	//   48   79:invokespecial   #191 <Method void Float(float)>
	//   49   82:aastore         
	//   50   83:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   51   86:pop             
			role = PdfName.ARTIFACT;
	//   52   87:aload_0         
	//   53   88:getstatic       #208 <Field PdfName PdfName.ARTIFACT>
	//   54   91:putfield        #133 <Field PdfName role>
			return;
	//   55   94:return          
		}
	}

	public Chunk(DrawInterface drawinterface, boolean flag)
	{
		this("\uFFFC", new Font());
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <String "\uFFFC">
	//    2    3:new             #144 <Class Font>
	//    3    6:dup             
	//    4    7:invokespecial   #145 <Method void Font()>
	//    5   10:invokespecial   #178 <Method void Chunk(String, Font)>
		setAttribute("SEPARATOR", ((Object) (new Object[] {
			drawinterface, Boolean.valueOf(flag)
		})));
	//    6   13:aload_0         
	//    7   14:ldc1            #47  <String "SEPARATOR">
	//    8   16:iconst_2        
	//    9   17:anewarray       Object[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:aload_1         
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_1        
	//   16   26:iload_2         
	//   17   27:invokestatic    #205 <Method Boolean Boolean.valueOf(boolean)>
	//   18   30:aastore         
	//   19   31:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   20   34:pop             
		role = null;
	//   21   35:aload_0         
	//   22   36:aconst_null     
	//   23   37:putfield        #133 <Field PdfName role>
	//   24   40:return          
	}

	private Chunk(Float float1, boolean flag)
	{
		this("\uFFFC", new Font());
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <String "\uFFFC">
	//    2    3:new             #144 <Class Font>
	//    3    6:dup             
	//    4    7:invokespecial   #145 <Method void Font()>
	//    5   10:invokespecial   #178 <Method void Chunk(String, Font)>
		if(float1.floatValue() < 0.0F)
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #238 <Method float Float.floatValue()>
	//*   8   17:fconst_0        
	//*   9   18:fcmpg           
	//*  10   19:ifge            46
		{
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("a.tab.position.may.not.be.lower.than.0.yours.is.1", new Object[] {
				String.valueOf(((Object) (float1)))
			}));
	//   11   22:new             #220 <Class IllegalArgumentException>
	//   12   25:dup             
	//   13   26:ldc1            #222 <String "a.tab.position.may.not.be.lower.than.0.yours.is.1">
	//   14   28:iconst_1        
	//   15   29:anewarray       Object[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:aload_1         
	//   19   35:invokestatic    #241 <Method String String.valueOf(Object)>
	//   20   38:aastore         
	//   21   39:invokestatic    #233 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   22   42:invokespecial   #234 <Method void IllegalArgumentException(String)>
	//   23   45:athrow          
		} else
		{
			setAttribute("TAB", ((Object) (new Object[] {
				float1, Boolean.valueOf(flag)
			})));
	//   24   46:aload_0         
	//   25   47:ldc1            #56  <String "TAB">
	//   26   49:iconst_2        
	//   27   50:anewarray       Object[]
	//   28   53:dup             
	//   29   54:iconst_0        
	//   30   55:aload_1         
	//   31   56:aastore         
	//   32   57:dup             
	//   33   58:iconst_1        
	//   34   59:iload_2         
	//   35   60:invokestatic    #205 <Method Boolean Boolean.valueOf(boolean)>
	//   36   63:aastore         
	//   37   64:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   38   67:pop             
			setAttribute("SPLITCHARACTER", ((Object) (TabSplitCharacter.TAB)));
	//   39   68:aload_0         
	//   40   69:ldc1            #52  <String "SPLITCHARACTER">
	//   41   71:getstatic       #246 <Field SplitCharacter TabSplitCharacter.TAB>
	//   42   74:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   43   77:pop             
			setAttribute("TABSETTINGS", ((Object) (null)));
	//   44   78:aload_0         
	//   45   79:ldc1            #59  <String "TABSETTINGS">
	//   46   81:aconst_null     
	//   47   82:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   48   85:pop             
			role = PdfName.ARTIFACT;
	//   49   86:aload_0         
	//   50   87:getstatic       #208 <Field PdfName PdfName.ARTIFACT>
	//   51   90:putfield        #133 <Field PdfName role>
			return;
	//   52   93:return          
		}
	}

	public Chunk(String s)
	{
		this(s, new Font());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #144 <Class Font>
	//    3    5:dup             
	//    4    6:invokespecial   #145 <Method void Font()>
	//    5    9:invokespecial   #178 <Method void Chunk(String, Font)>
	//    6   12:return          
	}

	public Chunk(String s, Font font1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void Object()>
		content = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #127 <Field StringBuffer content>
		font = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #129 <Field Font font>
		attributes = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #131 <Field HashMap attributes>
		role = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #133 <Field PdfName role>
		accessibleAttributes = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #135 <Field HashMap accessibleAttributes>
		id = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #137 <Field AccessibleElementId id>
		contentWithNoTabs = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #139 <Field String contentWithNoTabs>
		content = new StringBuffer(s);
	//   23   39:aload_0         
	//   24   40:new             #141 <Class StringBuffer>
	//   25   43:dup             
	//   26   44:aload_1         
	//   27   45:invokespecial   #162 <Method void StringBuffer(String)>
	//   28   48:putfield        #127 <Field StringBuffer content>
		font = font1;
	//   29   51:aload_0         
	//   30   52:aload_2         
	//   31   53:putfield        #129 <Field Font font>
		role = PdfName.SPAN;
	//   32   56:aload_0         
	//   33   57:getstatic       #148 <Field PdfName PdfName.SPAN>
	//   34   60:putfield        #133 <Field PdfName role>
	//   35   63:return          
	}

	public static Chunk createTabspace()
	{
		return createTabspace(60F);
	//    0    0:ldc1            #248 <Float 60F>
	//    1    2:invokestatic    #251 <Method Chunk createTabspace(float)>
	//    2    5:areturn         
	}

	public static Chunk createTabspace(float f)
	{
		return new Chunk(Float.valueOf(f), true);
	//    0    0:new             #2   <Class Chunk>
	//    1    3:dup             
	//    2    4:fload_0         
	//    3    5:invokestatic    #115 <Method Float Float.valueOf(float)>
	//    4    8:iconst_1        
	//    5    9:invokespecial   #118 <Method void Chunk(Float, boolean)>
	//    6   12:areturn         
	}

	public static Chunk createWhitespace(String s)
	{
		return createWhitespace(s, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #256 <Method Chunk createWhitespace(String, boolean)>
	//    3    5:areturn         
	}

	public static Chunk createWhitespace(String s, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            24
		{
			Chunk chunk = new Chunk(' ');
	//    2    4:new             #2   <Class Chunk>
	//    3    7:dup             
	//    4    8:bipush          32
	//    5   10:invokespecial   #258 <Method void Chunk(char)>
	//    6   13:astore_2        
			chunk.setAttribute("WHITESPACE", ((Object) (s)));
	//    7   14:aload_2         
	//    8   15:ldc1            #65  <String "WHITESPACE">
	//    9   17:aload_0         
	//   10   18:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   11   21:pop             
			return chunk;
	//   12   22:aload_2         
	//   13   23:areturn         
		} else
		{
			return new Chunk(s);
	//   14   24:new             #2   <Class Chunk>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:invokespecial   #89  <Method void Chunk(String)>
	//   18   32:areturn         
		}
	}

	private Chunk setAttribute(String s, Object obj)
	{
		if(attributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field HashMap attributes>
	//*   2    4:ifnonnull       18
			attributes = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #167 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #259 <Method void HashMap()>
	//    7   15:putfield        #131 <Field HashMap attributes>
		attributes.put(((Object) (s)), obj);
	//    8   18:aload_0         
	//    9   19:getfield        #131 <Field HashMap attributes>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #263 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
		return this;
	//   14   28:aload_0         
	//   15   29:areturn         
	}

	public StringBuffer append(String s)
	{
		contentWithNoTabs = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #139 <Field String contentWithNoTabs>
		return content.append(s);
	//    3    5:aload_0         
	//    4    6:getfield        #127 <Field StringBuffer content>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #266 <Method StringBuffer StringBuffer.append(String)>
	//    7   13:areturn         
	}

	public PdfObject getAccessibleAttribute(PdfName pdfname)
	{
		if(getImage() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #272 <Method Image getImage()>
	//*   2    4:ifnull          16
			return getImage().getAccessibleAttribute(pdfname);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #272 <Method Image getImage()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #274 <Method PdfObject Image.getAccessibleAttribute(PdfName)>
	//    7   15:areturn         
		if(accessibleAttributes != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #135 <Field HashMap accessibleAttributes>
	//*  10   20:ifnull          35
			return (PdfObject)accessibleAttributes.get(((Object) (pdfname)));
	//   11   23:aload_0         
	//   12   24:getfield        #135 <Field HashMap accessibleAttributes>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//   15   31:checkcast       #280 <Class PdfObject>
	//   16   34:areturn         
		else
			return null;
	//   17   35:aconst_null     
	//   18   36:areturn         
	}

	public HashMap getAccessibleAttributes()
	{
		if(getImage() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #272 <Method Image getImage()>
	//*   2    4:ifnull          15
			return getImage().getAccessibleAttributes();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #272 <Method Image getImage()>
	//    5   11:invokevirtual   #284 <Method HashMap Image.getAccessibleAttributes()>
	//    6   14:areturn         
		else
			return accessibleAttributes;
	//    7   15:aload_0         
	//    8   16:getfield        #135 <Field HashMap accessibleAttributes>
	//    9   19:areturn         
	}

	public HashMap getAttributes()
	{
		return attributes;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field HashMap attributes>
	//    2    4:areturn         
	}

	public float getCharacterSpacing()
	{
		if(attributes != null && attributes.containsKey("CHAR_SPACING"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field HashMap attributes>
	//*   2    4:ifnull          35
	//*   3    7:aload_0         
	//*   4    8:getfield        #131 <Field HashMap attributes>
	//*   5   11:ldc1            #15  <String "CHAR_SPACING">
	//*   6   13:invokevirtual   #293 <Method boolean HashMap.containsKey(Object)>
	//*   7   16:ifeq            35
			return ((Float)attributes.get("CHAR_SPACING")).floatValue();
	//    8   19:aload_0         
	//    9   20:getfield        #131 <Field HashMap attributes>
	//   10   23:ldc1            #15  <String "CHAR_SPACING">
	//   11   25:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//   12   28:checkcast       #111 <Class Float>
	//   13   31:invokevirtual   #238 <Method float Float.floatValue()>
	//   14   34:freturn         
		else
			return 0.0F;
	//   15   35:fconst_0        
	//   16   36:freturn         
	}

	public List getChunks()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #297 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #298 <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).add(((Object) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokeinterface #303 <Method boolean List.add(Object)>
	//    7   15:pop             
		return ((List) (arraylist));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public String getContent()
	{
		if(contentWithNoTabs == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field String contentWithNoTabs>
	//*   2    4:ifnonnull       26
			contentWithNoTabs = content.toString().replaceAll("\t", "");
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #127 <Field StringBuffer content>
	//    6   12:invokevirtual   #161 <Method String StringBuffer.toString()>
	//    7   15:ldc2            #307 <String "\t">
	//    8   18:ldc1            #102 <String "">
	//    9   20:invokevirtual   #311 <Method String String.replaceAll(String, String)>
	//   10   23:putfield        #139 <Field String contentWithNoTabs>
		return contentWithNoTabs;
	//   11   26:aload_0         
	//   12   27:getfield        #139 <Field String contentWithNoTabs>
	//   13   30:areturn         
	}

	public Font getFont()
	{
		return font;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field Font font>
	//    2    4:areturn         
	}

	public float getHorizontalScaling()
	{
		Float float1;
		if(attributes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field HashMap attributes>
	//*   2    4:ifnonnull       9
	//*   3    7:fconst_1        
	//*   4    8:freturn         
	//*   5    9:aload_0         
	//*   6   10:getfield        #131 <Field HashMap attributes>
	//*   7   13:ldc1            #23  <String "HSCALE">
	//*   8   15:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//*   9   18:checkcast       #111 <Class Float>
	//*  10   21:astore_1        
			if((float1 = (Float)attributes.get("HSCALE")) != null)
	//*  11   22:aload_1         
	//*  12   23:ifnull          7
				return float1.floatValue();
	//   13   26:aload_1         
	//   14   27:invokevirtual   #238 <Method float Float.floatValue()>
	//   15   30:freturn         
		return 1.0F;
	}

	public HyphenationEvent getHyphenation()
	{
		if(attributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field HashMap attributes>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (HyphenationEvent)attributes.get("HYPHENATION");
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field HashMap attributes>
	//    7   13:ldc1            #25  <String "HYPHENATION">
	//    8   15:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//    9   18:checkcast       #318 <Class HyphenationEvent>
	//   10   21:areturn         
	}

	public AccessibleElementId getId()
	{
		if(id == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field AccessibleElementId id>
	//*   2    4:ifnonnull       18
			id = new AccessibleElementId();
	//    3    7:aload_0         
	//    4    8:new             #320 <Class AccessibleElementId>
	//    5   11:dup             
	//    6   12:invokespecial   #321 <Method void AccessibleElementId()>
	//    7   15:putfield        #137 <Field AccessibleElementId id>
		return id;
	//    8   18:aload_0         
	//    9   19:getfield        #137 <Field AccessibleElementId id>
	//   10   22:areturn         
	}

	public Image getImage()
	{
		if(attributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field HashMap attributes>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		Object aobj[] = (Object[])(Object[])attributes.get("IMAGE");
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field HashMap attributes>
	//    7   13:ldc1            #27  <String "IMAGE">
	//    8   15:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//    9   18:checkcast       #323 <Class Object[]>
	//   10   21:checkcast       #323 <Class Object[]>
	//   11   24:astore_1        
		if(aobj == null)
	//*  12   25:aload_1         
	//*  13   26:ifnonnull       31
			return null;
	//   14   29:aconst_null     
	//   15   30:areturn         
		else
			return (Image)aobj[0];
	//   16   31:aload_1         
	//   17   32:iconst_0        
	//   18   33:aaload          
	//   19   34:checkcast       #180 <Class Image>
	//   20   37:areturn         
	}

	public PdfName getRole()
	{
		if(getImage() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #272 <Method Image getImage()>
	//*   2    4:ifnull          15
			return getImage().getRole();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #272 <Method Image getImage()>
	//    5   11:invokevirtual   #327 <Method PdfName Image.getRole()>
	//    6   14:areturn         
		else
			return role;
	//    7   15:aload_0         
	//    8   16:getfield        #133 <Field PdfName role>
	//    9   19:areturn         
	}

	public String getTextExpansion()
	{
		PdfObject pdfobject = getAccessibleAttribute(PdfName.E);
	//    0    0:aload_0         
	//    1    1:getstatic       #331 <Field PdfName PdfName.E>
	//    2    4:invokevirtual   #332 <Method PdfObject getAccessibleAttribute(PdfName)>
	//    3    7:astore_1        
		if(pdfobject instanceof PdfString)
	//*   4    8:aload_1         
	//*   5    9:instanceof      #334 <Class PdfString>
	//*   6   12:ifeq            23
			return ((PdfString)pdfobject).toUnicodeString();
	//    7   15:aload_1         
	//    8   16:checkcast       #334 <Class PdfString>
	//    9   19:invokevirtual   #337 <Method String PdfString.toUnicodeString()>
	//   10   22:areturn         
		else
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
	}

	public float getTextRise()
	{
		if(attributes != null && attributes.containsKey("SUBSUPSCRIPT"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field HashMap attributes>
	//*   2    4:ifnull          35
	//*   3    7:aload_0         
	//*   4    8:getfield        #131 <Field HashMap attributes>
	//*   5   11:ldc1            #54  <String "SUBSUPSCRIPT">
	//*   6   13:invokevirtual   #293 <Method boolean HashMap.containsKey(Object)>
	//*   7   16:ifeq            35
			return ((Float)attributes.get("SUBSUPSCRIPT")).floatValue();
	//    8   19:aload_0         
	//    9   20:getfield        #131 <Field HashMap attributes>
	//   10   23:ldc1            #54  <String "SUBSUPSCRIPT">
	//   11   25:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//   12   28:checkcast       #111 <Class Float>
	//   13   31:invokevirtual   #238 <Method float Float.floatValue()>
	//   14   34:freturn         
		else
			return 0.0F;
	//   15   35:fconst_0        
	//   16   36:freturn         
	}

	public float getWidthPoint()
	{
		if(getImage() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #272 <Method Image getImage()>
	//*   2    4:ifnull          15
			return getImage().getScaledWidth();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #272 <Method Image getImage()>
	//    5   11:invokevirtual   #342 <Method float Image.getScaledWidth()>
	//    6   14:freturn         
		else
			return font.getCalculatedBaseFont(true).getWidthPoint(getContent(), font.getCalculatedSize()) * getHorizontalScaling();
	//    7   15:aload_0         
	//    8   16:getfield        #129 <Field Font font>
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #346 <Method BaseFont Font.getCalculatedBaseFont(boolean)>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #348 <Method String getContent()>
	//   13   27:aload_0         
	//   14   28:getfield        #129 <Field Font font>
	//   15   31:invokevirtual   #351 <Method float Font.getCalculatedSize()>
	//   16   34:invokevirtual   #356 <Method float BaseFont.getWidthPoint(String, float)>
	//   17   37:aload_0         
	//   18   38:invokevirtual   #358 <Method float getHorizontalScaling()>
	//   19   41:fmul            
	//   20   42:freturn         
	}

	public float getWordSpacing()
	{
		if(attributes != null && attributes.containsKey("WORD_SPACING"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field HashMap attributes>
	//*   2    4:ifnull          35
	//*   3    7:aload_0         
	//*   4    8:getfield        #131 <Field HashMap attributes>
	//*   5   11:ldc1            #67  <String "WORD_SPACING">
	//*   6   13:invokevirtual   #293 <Method boolean HashMap.containsKey(Object)>
	//*   7   16:ifeq            35
			return ((Float)attributes.get("WORD_SPACING")).floatValue();
	//    8   19:aload_0         
	//    9   20:getfield        #131 <Field HashMap attributes>
	//   10   23:ldc1            #67  <String "WORD_SPACING">
	//   11   25:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//   12   28:checkcast       #111 <Class Float>
	//   13   31:invokevirtual   #238 <Method float Float.floatValue()>
	//   14   34:freturn         
		else
			return 0.0F;
	//   15   35:fconst_0        
	//   16   36:freturn         
	}

	public boolean hasAccessibleAttributes()
	{
		return accessibleAttributes != null && !accessibleAttributes.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field HashMap accessibleAttributes>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #135 <Field HashMap accessibleAttributes>
	//    5   11:invokevirtual   #364 <Method boolean HashMap.isEmpty()>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean hasAttributes()
	{
		return attributes != null && !attributes.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field HashMap attributes>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #131 <Field HashMap attributes>
	//    5   11:invokevirtual   #364 <Method boolean HashMap.isEmpty()>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean isContent()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isEmpty()
	{
		return content.toString().trim().length() == 0 && content.toString().indexOf("\n") == -1 && attributes == null;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field StringBuffer content>
	//    2    4:invokevirtual   #161 <Method String StringBuffer.toString()>
	//    3    7:invokevirtual   #369 <Method String String.trim()>
	//    4   10:invokevirtual   #373 <Method int String.length()>
	//    5   13:ifne            41
	//    6   16:aload_0         
	//    7   17:getfield        #127 <Field StringBuffer content>
	//    8   20:invokevirtual   #161 <Method String StringBuffer.toString()>
	//    9   23:ldc1            #85  <String "\n">
	//   10   25:invokevirtual   #377 <Method int String.indexOf(String)>
	//   11   28:iconst_m1       
	//   12   29:icmpne          41
	//   13   32:aload_0         
	//   14   33:getfield        #131 <Field HashMap attributes>
	//   15   36:ifnonnull       41
	//   16   39:iconst_1        
	//   17   40:ireturn         
	//   18   41:iconst_0        
	//   19   42:ireturn         
	}

	public boolean isInline()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isNestable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isTabspace()
	{
		return attributes != null && attributes.containsKey("TAB");
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field HashMap attributes>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #131 <Field HashMap attributes>
	//    5   11:ldc1            #56  <String "TAB">
	//    6   13:invokevirtual   #293 <Method boolean HashMap.containsKey(Object)>
	//    7   16:ifeq            21
	//    8   19:iconst_1        
	//    9   20:ireturn         
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	public boolean isWhitespace()
	{
		return attributes != null && attributes.containsKey("WHITESPACE");
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field HashMap attributes>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #131 <Field HashMap attributes>
	//    5   11:ldc1            #65  <String "WHITESPACE">
	//    6   13:invokevirtual   #293 <Method boolean HashMap.containsKey(Object)>
	//    7   16:ifeq            21
	//    8   19:iconst_1        
	//    9   20:ireturn         
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	public boolean process(ElementListener elementlistener)
	{
		boolean flag;
		try
		{
			flag = elementlistener.add(((Element) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #390 <Method boolean ElementListener.add(Element)>
	//    3    7:istore_2        
		}
	//*   4    8:iload_2         
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(ElementListener elementlistener)
	//*   6   10:astore_1        
		{
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		}
		return flag;
	}

	public void setAccessibleAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		if(getImage() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #272 <Method Image getImage()>
	//*   2    4:ifnull          17
		{
			getImage().setAccessibleAttribute(pdfname, pdfobject);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #272 <Method Image getImage()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #394 <Method void Image.setAccessibleAttribute(PdfName, PdfObject)>
			return;
	//    8   16:return          
		}
		if(accessibleAttributes == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #135 <Field HashMap accessibleAttributes>
	//*  11   21:ifnonnull       35
			accessibleAttributes = new HashMap();
	//   12   24:aload_0         
	//   13   25:new             #167 <Class HashMap>
	//   14   28:dup             
	//   15   29:invokespecial   #259 <Method void HashMap()>
	//   16   32:putfield        #135 <Field HashMap accessibleAttributes>
		accessibleAttributes.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//   17   35:aload_0         
	//   18   36:getfield        #135 <Field HashMap accessibleAttributes>
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:invokevirtual   #263 <Method Object HashMap.put(Object, Object)>
	//   22   44:pop             
	//   23   45:return          
	}

	public Chunk setAction(PdfAction pdfaction)
	{
		setRole(PdfName.LINK);
	//    0    0:aload_0         
	//    1    1:getstatic       #399 <Field PdfName PdfName.LINK>
	//    2    4:invokevirtual   #100 <Method void setRole(PdfName)>
		return setAttribute("ACTION", ((Object) (pdfaction)));
	//    3    7:aload_0         
	//    4    8:ldc1            #11  <String "ACTION">
	//    5   10:aload_1         
	//    6   11:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//    7   14:areturn         
	}

	public Chunk setAnchor(String s)
	{
		setRole(PdfName.LINK);
	//    0    0:aload_0         
	//    1    1:getstatic       #399 <Field PdfName PdfName.LINK>
	//    2    4:invokevirtual   #100 <Method void setRole(PdfName)>
		setAccessibleAttribute(PdfName.ALT, ((PdfObject) (new PdfString(s))));
	//    3    7:aload_0         
	//    4    8:getstatic       #403 <Field PdfName PdfName.ALT>
	//    5   11:new             #334 <Class PdfString>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:invokespecial   #404 <Method void PdfString(String)>
	//    9   19:invokevirtual   #405 <Method void setAccessibleAttribute(PdfName, PdfObject)>
		return setAttribute("ACTION", ((Object) (new PdfAction(s))));
	//   10   22:aload_0         
	//   11   23:ldc1            #11  <String "ACTION">
	//   12   25:new             #407 <Class PdfAction>
	//   13   28:dup             
	//   14   29:aload_1         
	//   15   30:invokespecial   #408 <Method void PdfAction(String)>
	//   16   33:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   17   36:areturn         
	}

	public Chunk setAnchor(URL url)
	{
		setRole(PdfName.LINK);
	//    0    0:aload_0         
	//    1    1:getstatic       #399 <Field PdfName PdfName.LINK>
	//    2    4:invokevirtual   #100 <Method void setRole(PdfName)>
		url = ((URL) (url.toExternalForm()));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #414 <Method String URL.toExternalForm()>
	//    5   11:astore_1        
		setAccessibleAttribute(PdfName.ALT, ((PdfObject) (new PdfString(((String) (url))))));
	//    6   12:aload_0         
	//    7   13:getstatic       #403 <Field PdfName PdfName.ALT>
	//    8   16:new             #334 <Class PdfString>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #404 <Method void PdfString(String)>
	//   12   24:invokevirtual   #405 <Method void setAccessibleAttribute(PdfName, PdfObject)>
		return setAttribute("ACTION", ((Object) (new PdfAction(((String) (url))))));
	//   13   27:aload_0         
	//   14   28:ldc1            #11  <String "ACTION">
	//   15   30:new             #407 <Class PdfAction>
	//   16   33:dup             
	//   17   34:aload_1         
	//   18   35:invokespecial   #408 <Method void PdfAction(String)>
	//   19   38:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   20   41:areturn         
	}

	public Chunk setAnnotation(PdfAnnotation pdfannotation)
	{
		return setAttribute("PDFANNOTATION", ((Object) (pdfannotation)));
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "PDFANNOTATION">
	//    2    3:aload_1         
	//    3    4:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//    4    7:areturn         
	}

	public void setAttributes(HashMap hashmap)
	{
		attributes = hashmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #131 <Field HashMap attributes>
	//    3    5:return          
	}

	public Chunk setBackground(BaseColor basecolor)
	{
		return setBackground(basecolor, 0.0F, 0.0F, 0.0F, 0.0F);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fconst_0        
	//    3    3:fconst_0        
	//    4    4:fconst_0        
	//    5    5:fconst_0        
	//    6    6:invokevirtual   #424 <Method Chunk setBackground(BaseColor, float, float, float, float)>
	//    7    9:areturn         
	}

	public Chunk setBackground(BaseColor basecolor, float f, float f1, float f2, float f3)
	{
		return setAttribute("BACKGROUND", ((Object) (new Object[] {
			basecolor, new float[] {
				f, f1, f2, f3
			}
		})));
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "BACKGROUND">
	//    2    3:iconst_2        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_1         
	//    7   10:aastore         
	//    8   11:dup             
	//    9   12:iconst_1        
	//   10   13:iconst_4        
	//   11   14:newarray        float[]
	//   12   16:dup             
	//   13   17:iconst_0        
	//   14   18:fload_2         
	//   15   19:fastore         
	//   16   20:dup             
	//   17   21:iconst_1        
	//   18   22:fload_3         
	//   19   23:fastore         
	//   20   24:dup             
	//   21   25:iconst_2        
	//   22   26:fload           4
	//   23   28:fastore         
	//   24   29:dup             
	//   25   30:iconst_3        
	//   26   31:fload           5
	//   27   33:fastore         
	//   28   34:aastore         
	//   29   35:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   30   38:areturn         
	}

	public Chunk setCharacterSpacing(float f)
	{
		return setAttribute("CHAR_SPACING", ((Object) (new Float(f))));
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <String "CHAR_SPACING">
	//    2    3:new             #111 <Class Float>
	//    3    6:dup             
	//    4    7:fload_1         
	//    5    8:invokespecial   #191 <Method void Float(float)>
	//    6   11:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//    7   14:areturn         
	}

	public void setFont(Font font1)
	{
		font = font1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #129 <Field Font font>
	//    3    5:return          
	}

	public Chunk setGenericTag(String s)
	{
		return setAttribute("GENERICTAG", ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <String "GENERICTAG">
	//    2    3:aload_1         
	//    3    4:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//    4    7:areturn         
	}

	public Chunk setHorizontalScaling(float f)
	{
		return setAttribute("HSCALE", ((Object) (new Float(f))));
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <String "HSCALE">
	//    2    3:new             #111 <Class Float>
	//    3    6:dup             
	//    4    7:fload_1         
	//    5    8:invokespecial   #191 <Method void Float(float)>
	//    6   11:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//    7   14:areturn         
	}

	public Chunk setHyphenation(HyphenationEvent hyphenationevent)
	{
		return setAttribute("HYPHENATION", ((Object) (hyphenationevent)));
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <String "HYPHENATION">
	//    2    3:aload_1         
	//    3    4:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//    4    7:areturn         
	}

	public void setId(AccessibleElementId accessibleelementid)
	{
		id = accessibleelementid;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #137 <Field AccessibleElementId id>
	//    3    5:return          
	}

	public Chunk setLineHeight(float f)
	{
		return setAttribute("LINEHEIGHT", ((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <String "LINEHEIGHT">
	//    2    3:fload_1         
	//    3    4:invokestatic    #115 <Method Float Float.valueOf(float)>
	//    4    7:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//    5   10:areturn         
	}

	public Chunk setLocalDestination(String s)
	{
		return setAttribute("LOCALDESTINATION", ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:ldc1            #31  <String "LOCALDESTINATION">
	//    2    3:aload_1         
	//    3    4:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//    4    7:areturn         
	}

	public Chunk setLocalGoto(String s)
	{
		return setAttribute("LOCALGOTO", ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:ldc1            #33  <String "LOCALGOTO">
	//    2    3:aload_1         
	//    3    4:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//    4    7:areturn         
	}

	public Chunk setNewPage()
	{
		return setAttribute("NEWPAGE", ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #37  <String "NEWPAGE">
	//    2    3:aconst_null     
	//    3    4:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//    4    7:areturn         
	}

	public Chunk setRemoteGoto(String s, int i)
	{
		return setAttribute("REMOTEGOTO", ((Object) (new Object[] {
			s, Integer.valueOf(i)
		})));
	//    0    0:aload_0         
	//    1    1:ldc1            #45  <String "REMOTEGOTO">
	//    2    3:iconst_2        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_1         
	//    7   10:aastore         
	//    8   11:dup             
	//    9   12:iconst_1        
	//   10   13:iload_2         
	//   11   14:invokestatic    #442 <Method Integer Integer.valueOf(int)>
	//   12   17:aastore         
	//   13   18:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   14   21:areturn         
	}

	public Chunk setRemoteGoto(String s, String s1)
	{
		return setAttribute("REMOTEGOTO", ((Object) (new Object[] {
			s, s1
		})));
	//    0    0:aload_0         
	//    1    1:ldc1            #45  <String "REMOTEGOTO">
	//    2    3:iconst_2        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_1         
	//    7   10:aastore         
	//    8   11:dup             
	//    9   12:iconst_1        
	//   10   13:aload_2         
	//   11   14:aastore         
	//   12   15:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   13   18:areturn         
	}

	public void setRole(PdfName pdfname)
	{
		if(getImage() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #272 <Method Image getImage()>
	//*   2    4:ifnull          16
		{
			getImage().setRole(pdfname);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #272 <Method Image getImage()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #444 <Method void Image.setRole(PdfName)>
			return;
	//    7   15:return          
		} else
		{
			role = pdfname;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #133 <Field PdfName role>
			return;
	//   11   21:return          
		}
	}

	public Chunk setSkew(float f, float f1)
	{
		return setAttribute("SKEW", ((Object) (new float[] {
			(float)Math.tan(((double)f * 3.1415926535897931D) / 180D), (float)Math.tan(((double)f1 * 3.1415926535897931D) / 180D)
		})));
	//    0    0:aload_0         
	//    1    1:ldc1            #49  <String "SKEW">
	//    2    3:iconst_2        
	//    3    4:newarray        float[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:fload_1         
	//    7    9:f2d             
	//    8   10:ldc2w           #447 <Double 3.1415926535897931D>
	//    9   13:dmul            
	//   10   14:ldc2w           #449 <Double 180D>
	//   11   17:ddiv            
	//   12   18:invokestatic    #456 <Method double Math.tan(double)>
	//   13   21:d2f             
	//   14   22:fastore         
	//   15   23:dup             
	//   16   24:iconst_1        
	//   17   25:fload_2         
	//   18   26:f2d             
	//   19   27:ldc2w           #447 <Double 3.1415926535897931D>
	//   20   30:dmul            
	//   21   31:ldc2w           #449 <Double 180D>
	//   22   34:ddiv            
	//   23   35:invokestatic    #456 <Method double Math.tan(double)>
	//   24   38:d2f             
	//   25   39:fastore         
	//   26   40:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   27   43:areturn         
	}

	public Chunk setSplitCharacter(SplitCharacter splitcharacter)
	{
		return setAttribute("SPLITCHARACTER", ((Object) (splitcharacter)));
	//    0    0:aload_0         
	//    1    1:ldc1            #52  <String "SPLITCHARACTER">
	//    2    3:aload_1         
	//    3    4:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//    4    7:areturn         
	}

	public void setTextExpansion(String s)
	{
		setAccessibleAttribute(PdfName.E, ((PdfObject) (new PdfString(s))));
	//    0    0:aload_0         
	//    1    1:getstatic       #331 <Field PdfName PdfName.E>
	//    2    4:new             #334 <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #404 <Method void PdfString(String)>
	//    6   12:invokevirtual   #405 <Method void setAccessibleAttribute(PdfName, PdfObject)>
	//    7   15:return          
	}

	public Chunk setTextRenderMode(int i, float f, BaseColor basecolor)
	{
		return setAttribute("TEXTRENDERMODE", ((Object) (new Object[] {
			Integer.valueOf(i), new Float(f), basecolor
		})));
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "TEXTRENDERMODE">
	//    2    3:iconst_3        
	//    3    4:anewarray       Object[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:iload_1         
	//    7   10:invokestatic    #442 <Method Integer Integer.valueOf(int)>
	//    8   13:aastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:new             #111 <Class Float>
	//   12   19:dup             
	//   13   20:fload_2         
	//   14   21:invokespecial   #191 <Method void Float(float)>
	//   15   24:aastore         
	//   16   25:dup             
	//   17   26:iconst_2        
	//   18   27:aload_3         
	//   19   28:aastore         
	//   20   29:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   21   32:areturn         
	}

	public Chunk setTextRise(float f)
	{
		return setAttribute("SUBSUPSCRIPT", ((Object) (new Float(f))));
	//    0    0:aload_0         
	//    1    1:ldc1            #54  <String "SUBSUPSCRIPT">
	//    2    3:new             #111 <Class Float>
	//    3    6:dup             
	//    4    7:fload_1         
	//    5    8:invokespecial   #191 <Method void Float(float)>
	//    6   11:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//    7   14:areturn         
	}

	public Chunk setUnderline(float f, float f1)
	{
		return setUnderline(((BaseColor) (null)), f, 0.0F, f1, 0.0F, 0);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:fload_1         
	//    3    3:fconst_0        
	//    4    4:fload_2         
	//    5    5:fconst_0        
	//    6    6:iconst_0        
	//    7    7:invokevirtual   #466 <Method Chunk setUnderline(BaseColor, float, float, float, float, int)>
	//    8   10:areturn         
	}

	public Chunk setUnderline(BaseColor basecolor, float f, float f1, float f2, float f3, int i)
	{
		if(attributes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field HashMap attributes>
	//*   2    4:ifnonnull       18
			attributes = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #167 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #259 <Method void HashMap()>
	//    7   15:putfield        #131 <Field HashMap attributes>
		float af[] = {
			f, f1, f2, f3, (float)i
		};
	//    8   18:iconst_5        
	//    9   19:newarray        float[]
	//   10   21:dup             
	//   11   22:iconst_0        
	//   12   23:fload_2         
	//   13   24:fastore         
	//   14   25:dup             
	//   15   26:iconst_1        
	//   16   27:fload_3         
	//   17   28:fastore         
	//   18   29:dup             
	//   19   30:iconst_2        
	//   20   31:fload           4
	//   21   33:fastore         
	//   22   34:dup             
	//   23   35:iconst_3        
	//   24   36:fload           5
	//   25   38:fastore         
	//   26   39:dup             
	//   27   40:iconst_4        
	//   28   41:iload           6
	//   29   43:i2f             
	//   30   44:fastore         
	//   31   45:astore          7
		return setAttribute("UNDERLINE", ((Object) (Utilities.addToArray((Object[][])(Object[][])attributes.get("UNDERLINE"), new Object[] {
			basecolor, af
		}))));
	//   32   47:aload_0         
	//   33   48:ldc1            #63  <String "UNDERLINE">
	//   34   50:aload_0         
	//   35   51:getfield        #131 <Field HashMap attributes>
	//   36   54:ldc1            #63  <String "UNDERLINE">
	//   37   56:invokevirtual   #278 <Method Object HashMap.get(Object)>
	//   38   59:checkcast       #468 <Class Object[][]>
	//   39   62:checkcast       #468 <Class Object[][]>
	//   40   65:iconst_2        
	//   41   66:anewarray       Object[]
	//   42   69:dup             
	//   43   70:iconst_0        
	//   44   71:aload_1         
	//   45   72:aastore         
	//   46   73:dup             
	//   47   74:iconst_1        
	//   48   75:aload           7
	//   49   77:aastore         
	//   50   78:invokestatic    #474 <Method Object[][] Utilities.addToArray(Object[][], Object[])>
	//   51   81:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//   52   84:areturn         
	}

	public Chunk setWordSpacing(float f)
	{
		return setAttribute("WORD_SPACING", ((Object) (new Float(f))));
	//    0    0:aload_0         
	//    1    1:ldc1            #67  <String "WORD_SPACING">
	//    2    3:new             #111 <Class Float>
	//    3    6:dup             
	//    4    7:fload_1         
	//    5    8:invokespecial   #191 <Method void Float(float)>
	//    6   11:invokespecial   #201 <Method Chunk setAttribute(String, Object)>
	//    7   14:areturn         
	}

	public String toString()
	{
		return getContent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #348 <Method String getContent()>
	//    2    4:areturn         
	}

	public int type()
	{
		return 10;
	//    0    0:bipush          10
	//    1    2:ireturn         
	}

	public static final String ACTION = "ACTION";
	public static final String BACKGROUND = "BACKGROUND";
	public static final String CHAR_SPACING = "CHAR_SPACING";
	public static final String COLOR = "COLOR";
	public static final String ENCODING = "ENCODING";
	public static final String GENERICTAG = "GENERICTAG";
	public static final String HSCALE = "HSCALE";
	public static final String HYPHENATION = "HYPHENATION";
	public static final String IMAGE = "IMAGE";
	public static final String LINEHEIGHT = "LINEHEIGHT";
	public static final String LOCALDESTINATION = "LOCALDESTINATION";
	public static final String LOCALGOTO = "LOCALGOTO";
	public static final Chunk NEWLINE;
	public static final String NEWPAGE = "NEWPAGE";
	public static final Chunk NEXTPAGE;
	public static final String OBJECT_REPLACEMENT_CHARACTER = "\uFFFC";
	public static final String PDFANNOTATION = "PDFANNOTATION";
	public static final String REMOTEGOTO = "REMOTEGOTO";
	public static final String SEPARATOR = "SEPARATOR";
	public static final String SKEW = "SKEW";
	public static final Chunk SPACETABBING = new Chunk(Float.valueOf((0.0F / 0.0F)), true);
	public static final String SPLITCHARACTER = "SPLITCHARACTER";
	public static final String SUBSUPSCRIPT = "SUBSUPSCRIPT";
	public static final String TAB = "TAB";
	public static final Chunk TABBING = new Chunk(Float.valueOf((0.0F / 0.0F)), false);
	public static final String TABSETTINGS = "TABSETTINGS";
	public static final String TEXTRENDERMODE = "TEXTRENDERMODE";
	public static final String UNDERLINE = "UNDERLINE";
	public static final String WHITESPACE = "WHITESPACE";
	public static final String WORD_SPACING = "WORD_SPACING";
	protected HashMap accessibleAttributes;
	protected HashMap attributes;
	protected StringBuffer content;
	private String contentWithNoTabs;
	protected Font font;
	private AccessibleElementId id;
	protected PdfName role;

	static 
	{
		NEWLINE = new Chunk("\n");
	//    0    0:new             #2   <Class Chunk>
	//    1    3:dup             
	//    2    4:ldc1            #85  <String "\n">
	//    3    6:invokespecial   #89  <Method void Chunk(String)>
	//    4    9:putstatic       #91  <Field Chunk NEWLINE>
		NEWLINE.setRole(PdfName.P);
	//    5   12:getstatic       #91  <Field Chunk NEWLINE>
	//    6   15:getstatic       #96  <Field PdfName PdfName.P>
	//    7   18:invokevirtual   #100 <Method void setRole(PdfName)>
		NEXTPAGE = new Chunk("");
	//    8   21:new             #2   <Class Chunk>
	//    9   24:dup             
	//   10   25:ldc1            #102 <String "">
	//   11   27:invokespecial   #89  <Method void Chunk(String)>
	//   12   30:putstatic       #104 <Field Chunk NEXTPAGE>
		NEXTPAGE.setNewPage();
	//   13   33:getstatic       #104 <Field Chunk NEXTPAGE>
	//   14   36:invokevirtual   #108 <Method Chunk setNewPage()>
	//   15   39:pop             
	//   16   40:new             #2   <Class Chunk>
	//   17   43:dup             
	//   18   44:ldc1            #109 <Float (0.0F / 0.0F)>
	//   19   46:invokestatic    #115 <Method Float Float.valueOf(float)>
	//   20   49:iconst_0        
	//   21   50:invokespecial   #118 <Method void Chunk(Float, boolean)>
	//   22   53:putstatic       #120 <Field Chunk TABBING>
	//   23   56:new             #2   <Class Chunk>
	//   24   59:dup             
	//   25   60:ldc1            #109 <Float (0.0F / 0.0F)>
	//   26   62:invokestatic    #115 <Method Float Float.valueOf(float)>
	//   27   65:iconst_1        
	//   28   66:invokespecial   #118 <Method void Chunk(Float, boolean)>
	//   29   69:putstatic       #122 <Field Chunk SPACETABBING>
	//*  30   72:return          
	}
}
