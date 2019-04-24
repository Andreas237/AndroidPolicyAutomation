// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text:
//			List, Chunk, Font, FontFactory, 
//			ListItem, BaseColor, Element

public class ZapfDingbatsList extends List
{

	public ZapfDingbatsList(int i)
	{
		super(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #11  <Method void List(boolean)>
		zn = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #13  <Field int zn>
		float f = symbol.getFont().getSize();
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field Chunk symbol>
	//    8   14:invokevirtual   #23  <Method Font Chunk.getFont()>
	//    9   17:invokevirtual   #29  <Method float Font.getSize()>
	//   10   20:fstore_2        
		symbol.setFont(FontFactory.getFont("ZapfDingbats", f, 0));
	//   11   21:aload_0         
	//   12   22:getfield        #17  <Field Chunk symbol>
	//   13   25:ldc1            #31  <String "ZapfDingbats">
	//   14   27:fload_2         
	//   15   28:iconst_0        
	//   16   29:invokestatic    #36  <Method Font FontFactory.getFont(String, float, int)>
	//   17   32:invokevirtual   #40  <Method void Chunk.setFont(Font)>
		postSymbol = " ";
	//   18   35:aload_0         
	//   19   36:ldc1            #42  <String " ">
	//   20   38:putfield        #46  <Field String postSymbol>
	//   21   41:return          
	}

	public ZapfDingbatsList(int i, int j)
	{
		super(true, j);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_2         
	//    3    3:i2f             
	//    4    4:invokespecial   #51  <Method void List(boolean, float)>
		zn = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #13  <Field int zn>
		float f = symbol.getFont().getSize();
	//    8   12:aload_0         
	//    9   13:getfield        #17  <Field Chunk symbol>
	//   10   16:invokevirtual   #23  <Method Font Chunk.getFont()>
	//   11   19:invokevirtual   #29  <Method float Font.getSize()>
	//   12   22:fstore_3        
		symbol.setFont(FontFactory.getFont("ZapfDingbats", f, 0));
	//   13   23:aload_0         
	//   14   24:getfield        #17  <Field Chunk symbol>
	//   15   27:ldc1            #31  <String "ZapfDingbats">
	//   16   29:fload_3         
	//   17   30:iconst_0        
	//   18   31:invokestatic    #36  <Method Font FontFactory.getFont(String, float, int)>
	//   19   34:invokevirtual   #40  <Method void Chunk.setFont(Font)>
		postSymbol = " ";
	//   20   37:aload_0         
	//   21   38:ldc1            #42  <String " ">
	//   22   40:putfield        #46  <Field String postSymbol>
	//   23   43:return          
	}

	public ZapfDingbatsList(int i, int j, BaseColor basecolor)
	{
		super(true, j);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_2         
	//    3    3:i2f             
	//    4    4:invokespecial   #51  <Method void List(boolean, float)>
		zn = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #13  <Field int zn>
		float f = symbol.getFont().getSize();
	//    8   12:aload_0         
	//    9   13:getfield        #17  <Field Chunk symbol>
	//   10   16:invokevirtual   #23  <Method Font Chunk.getFont()>
	//   11   19:invokevirtual   #29  <Method float Font.getSize()>
	//   12   22:fstore          4
		symbol.setFont(FontFactory.getFont("ZapfDingbats", f, 0, basecolor));
	//   13   24:aload_0         
	//   14   25:getfield        #17  <Field Chunk symbol>
	//   15   28:ldc1            #31  <String "ZapfDingbats">
	//   16   30:fload           4
	//   17   32:iconst_0        
	//   18   33:aload_3         
	//   19   34:invokestatic    #55  <Method Font FontFactory.getFont(String, float, int, BaseColor)>
	//   20   37:invokevirtual   #40  <Method void Chunk.setFont(Font)>
		postSymbol = " ";
	//   21   40:aload_0         
	//   22   41:ldc1            #42  <String " ">
	//   23   43:putfield        #46  <Field String postSymbol>
	//   24   46:return          
	}

	public boolean add(Element element)
	{
		if(element instanceof ListItem)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #59  <Class ListItem>
	//*   2    4:ifeq            97
		{
			element = ((Element) ((ListItem)element));
	//    3    7:aload_1         
	//    4    8:checkcast       #59  <Class ListItem>
	//    5   11:astore_1        
			Chunk chunk = new Chunk(preSymbol, symbol.getFont());
	//    6   12:new             #19  <Class Chunk>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field String preSymbol>
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field Chunk symbol>
	//   12   24:invokevirtual   #23  <Method Font Chunk.getFont()>
	//   13   27:invokespecial   #65  <Method void Chunk(String, Font)>
	//   14   30:astore_2        
			chunk.setAttributes(symbol.getAttributes());
	//   15   31:aload_2         
	//   16   32:aload_0         
	//   17   33:getfield        #17  <Field Chunk symbol>
	//   18   36:invokevirtual   #69  <Method java.util.HashMap Chunk.getAttributes()>
	//   19   39:invokevirtual   #73  <Method void Chunk.setAttributes(java.util.HashMap)>
			chunk.append(String.valueOf((char)zn));
	//   20   42:aload_2         
	//   21   43:aload_0         
	//   22   44:getfield        #13  <Field int zn>
	//   23   47:int2char        
	//   24   48:invokestatic    #79  <Method String String.valueOf(char)>
	//   25   51:invokevirtual   #83  <Method StringBuffer Chunk.append(String)>
	//   26   54:pop             
			chunk.append(postSymbol);
	//   27   55:aload_2         
	//   28   56:aload_0         
	//   29   57:getfield        #46  <Field String postSymbol>
	//   30   60:invokevirtual   #83  <Method StringBuffer Chunk.append(String)>
	//   31   63:pop             
			((ListItem) (element)).setListSymbol(chunk);
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:invokevirtual   #87  <Method void ListItem.setListSymbol(Chunk)>
			((ListItem) (element)).setIndentationLeft(symbolIndent, autoindent);
	//   35   69:aload_1         
	//   36   70:aload_0         
	//   37   71:getfield        #91  <Field float symbolIndent>
	//   38   74:aload_0         
	//   39   75:getfield        #95  <Field boolean autoindent>
	//   40   78:invokevirtual   #99  <Method void ListItem.setIndentationLeft(float, boolean)>
			((ListItem) (element)).setIndentationRight(0.0F);
	//   41   81:aload_1         
	//   42   82:fconst_0        
	//   43   83:invokevirtual   #103 <Method void ListItem.setIndentationRight(float)>
			list.add(((Object) (element)));
	//   44   86:aload_0         
	//   45   87:getfield        #107 <Field ArrayList list>
	//   46   90:aload_1         
	//   47   91:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//   48   94:pop             
		} else
	//*  49   95:iconst_0        
	//*  50   96:ireturn         
		if(element instanceof List)
	//*  51   97:aload_1         
	//*  52   98:instanceof      #4   <Class List>
	//*  53  101:ifeq            95
		{
			element = ((Element) ((List)element));
	//   54  104:aload_1         
	//   55  105:checkcast       #4   <Class List>
	//   56  108:astore_1        
			((List) (element)).setIndentationLeft(((List) (element)).getIndentationLeft() + symbolIndent);
	//   57  109:aload_1         
	//   58  110:aload_1         
	//   59  111:invokevirtual   #115 <Method float List.getIndentationLeft()>
	//   60  114:aload_0         
	//   61  115:getfield        #91  <Field float symbolIndent>
	//   62  118:fadd            
	//   63  119:invokevirtual   #117 <Method void List.setIndentationLeft(float)>
			first = first - 1;
	//   64  122:aload_0         
	//   65  123:aload_0         
	//   66  124:getfield        #120 <Field int first>
	//   67  127:iconst_1        
	//   68  128:isub            
	//   69  129:putfield        #120 <Field int first>
			return list.add(((Object) (element)));
	//   70  132:aload_0         
	//   71  133:getfield        #107 <Field ArrayList list>
	//   72  136:aload_1         
	//   73  137:invokevirtual   #112 <Method boolean ArrayList.add(Object)>
	//   74  140:ireturn         
		}
		return false;
	}

	public List cloneShallow()
	{
		ZapfDingbatsList zapfdingbatslist = new ZapfDingbatsList(zn);
	//    0    0:new             #2   <Class ZapfDingbatsList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field int zn>
	//    4    8:invokespecial   #124 <Method void ZapfDingbatsList(int)>
	//    5   11:astore_1        
		populateProperties(((List) (zapfdingbatslist)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #128 <Method void populateProperties(List)>
		return ((List) (zapfdingbatslist));
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public int getCharNumber()
	{
		return zn;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int zn>
	//    2    4:ireturn         
	}

	public void setCharNumber(int i)
	{
		zn = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #13  <Field int zn>
	//    3    5:return          
	}

	public void setDingbatColor(BaseColor basecolor)
	{
		float f = symbol.getFont().getSize();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Chunk symbol>
	//    2    4:invokevirtual   #23  <Method Font Chunk.getFont()>
	//    3    7:invokevirtual   #29  <Method float Font.getSize()>
	//    4   10:fstore_2        
		symbol.setFont(FontFactory.getFont("ZapfDingbats", f, 0, basecolor));
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field Chunk symbol>
	//    7   15:ldc1            #31  <String "ZapfDingbats">
	//    8   17:fload_2         
	//    9   18:iconst_0        
	//   10   19:aload_1         
	//   11   20:invokestatic    #55  <Method Font FontFactory.getFont(String, float, int, BaseColor)>
	//   12   23:invokevirtual   #40  <Method void Chunk.setFont(Font)>
	//   13   26:return          
	}

	protected int zn;
}
