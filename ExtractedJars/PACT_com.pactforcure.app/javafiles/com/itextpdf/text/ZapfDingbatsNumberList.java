// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text:
//			List, Chunk, Font, FontFactory, 
//			ListItem, Element

public class ZapfDingbatsNumberList extends List
{

	public ZapfDingbatsNumberList(int i)
	{
		super(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #11  <Method void List(boolean)>
		type = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #13  <Field int type>
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

	public ZapfDingbatsNumberList(int i, int j)
	{
		super(true, j);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_2         
	//    3    3:i2f             
	//    4    4:invokespecial   #51  <Method void List(boolean, float)>
		type = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #13  <Field int type>
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

	public boolean add(Element element)
	{
		if(!(element instanceof ListItem)) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:instanceof      #55  <Class ListItem>
	//    2    4:ifeq            223
_L1:
		Chunk chunk;
		element = ((Element) ((ListItem)element));
	//    3    7:aload_1         
	//    4    8:checkcast       #55  <Class ListItem>
	//    5   11:astore_1        
		chunk = new Chunk(preSymbol, symbol.getFont());
	//    6   12:new             #19  <Class Chunk>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #58  <Field String preSymbol>
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field Chunk symbol>
	//   12   24:invokevirtual   #23  <Method Font Chunk.getFont()>
	//   13   27:invokespecial   #61  <Method void Chunk(String, Font)>
	//   14   30:astore_2        
		chunk.setAttributes(symbol.getAttributes());
	//   15   31:aload_2         
	//   16   32:aload_0         
	//   17   33:getfield        #17  <Field Chunk symbol>
	//   18   36:invokevirtual   #65  <Method java.util.HashMap Chunk.getAttributes()>
	//   19   39:invokevirtual   #69  <Method void Chunk.setAttributes(java.util.HashMap)>
		type;
	//   20   42:aload_0         
	//   21   43:getfield        #13  <Field int type>
		JVM INSTR tableswitch 0 2: default 72
	//	               0 139
	//	               1 167
	//	               2 195;
	//   22   46:tableswitch     0 2: default 72
	//	               0 139
	//	               1 167
	//	               2 195
		   goto _L3 _L4 _L5 _L6
_L3:
		chunk.append(String.valueOf((char)(first + list.size() + 201)));
	//   23   72:aload_2         
	//   24   73:aload_0         
	//   25   74:getfield        #72  <Field int first>
	//   26   77:aload_0         
	//   27   78:getfield        #76  <Field ArrayList list>
	//   28   81:invokevirtual   #82  <Method int ArrayList.size()>
	//   29   84:iadd            
	//   30   85:sipush          201
	//   31   88:iadd            
	//   32   89:int2char        
	//   33   90:invokestatic    #88  <Method String String.valueOf(char)>
	//   34   93:invokevirtual   #92  <Method StringBuffer Chunk.append(String)>
	//   35   96:pop             
_L10:
		chunk.append(postSymbol);
	//   36   97:aload_2         
	//   37   98:aload_0         
	//   38   99:getfield        #46  <Field String postSymbol>
	//   39  102:invokevirtual   #92  <Method StringBuffer Chunk.append(String)>
	//   40  105:pop             
		((ListItem) (element)).setListSymbol(chunk);
	//   41  106:aload_1         
	//   42  107:aload_2         
	//   43  108:invokevirtual   #96  <Method void ListItem.setListSymbol(Chunk)>
		((ListItem) (element)).setIndentationLeft(symbolIndent, autoindent);
	//   44  111:aload_1         
	//   45  112:aload_0         
	//   46  113:getfield        #100 <Field float symbolIndent>
	//   47  116:aload_0         
	//   48  117:getfield        #104 <Field boolean autoindent>
	//   49  120:invokevirtual   #108 <Method void ListItem.setIndentationLeft(float, boolean)>
		((ListItem) (element)).setIndentationRight(0.0F);
	//   50  123:aload_1         
	//   51  124:fconst_0        
	//   52  125:invokevirtual   #112 <Method void ListItem.setIndentationRight(float)>
		list.add(((Object) (element)));
	//   53  128:aload_0         
	//   54  129:getfield        #76  <Field ArrayList list>
	//   55  132:aload_1         
	//   56  133:invokevirtual   #115 <Method boolean ArrayList.add(Object)>
	//   57  136:pop             
_L8:
		return false;
	//   58  137:iconst_0        
	//   59  138:ireturn         
_L4:
		chunk.append(String.valueOf((char)(first + list.size() + 171)));
	//   60  139:aload_2         
	//   61  140:aload_0         
	//   62  141:getfield        #72  <Field int first>
	//   63  144:aload_0         
	//   64  145:getfield        #76  <Field ArrayList list>
	//   65  148:invokevirtual   #82  <Method int ArrayList.size()>
	//   66  151:iadd            
	//   67  152:sipush          171
	//   68  155:iadd            
	//   69  156:int2char        
	//   70  157:invokestatic    #88  <Method String String.valueOf(char)>
	//   71  160:invokevirtual   #92  <Method StringBuffer Chunk.append(String)>
	//   72  163:pop             
		continue; /* Loop/switch isn't completed */
	//   73  164:goto            97
_L5:
		chunk.append(String.valueOf((char)(first + list.size() + 181)));
	//   74  167:aload_2         
	//   75  168:aload_0         
	//   76  169:getfield        #72  <Field int first>
	//   77  172:aload_0         
	//   78  173:getfield        #76  <Field ArrayList list>
	//   79  176:invokevirtual   #82  <Method int ArrayList.size()>
	//   80  179:iadd            
	//   81  180:sipush          181
	//   82  183:iadd            
	//   83  184:int2char        
	//   84  185:invokestatic    #88  <Method String String.valueOf(char)>
	//   85  188:invokevirtual   #92  <Method StringBuffer Chunk.append(String)>
	//   86  191:pop             
		continue; /* Loop/switch isn't completed */
	//   87  192:goto            97
_L6:
		chunk.append(String.valueOf((char)(first + list.size() + 191)));
	//   88  195:aload_2         
	//   89  196:aload_0         
	//   90  197:getfield        #72  <Field int first>
	//   91  200:aload_0         
	//   92  201:getfield        #76  <Field ArrayList list>
	//   93  204:invokevirtual   #82  <Method int ArrayList.size()>
	//   94  207:iadd            
	//   95  208:sipush          191
	//   96  211:iadd            
	//   97  212:int2char        
	//   98  213:invokestatic    #88  <Method String String.valueOf(char)>
	//   99  216:invokevirtual   #92  <Method StringBuffer Chunk.append(String)>
	//  100  219:pop             
		continue; /* Loop/switch isn't completed */
	//  101  220:goto            97
_L2:
		if(!(element instanceof List)) goto _L8; else goto _L7
	//  102  223:aload_1         
	//  103  224:instanceof      #4   <Class List>
	//  104  227:ifeq            137
_L7:
		element = ((Element) ((List)element));
	//  105  230:aload_1         
	//  106  231:checkcast       #4   <Class List>
	//  107  234:astore_1        
		((List) (element)).setIndentationLeft(((List) (element)).getIndentationLeft() + symbolIndent);
	//  108  235:aload_1         
	//  109  236:aload_1         
	//  110  237:invokevirtual   #118 <Method float List.getIndentationLeft()>
	//  111  240:aload_0         
	//  112  241:getfield        #100 <Field float symbolIndent>
	//  113  244:fadd            
	//  114  245:invokevirtual   #120 <Method void List.setIndentationLeft(float)>
		first = first - 1;
	//  115  248:aload_0         
	//  116  249:aload_0         
	//  117  250:getfield        #72  <Field int first>
	//  118  253:iconst_1        
	//  119  254:isub            
	//  120  255:putfield        #72  <Field int first>
		return list.add(((Object) (element)));
	//  121  258:aload_0         
	//  122  259:getfield        #76  <Field ArrayList list>
	//  123  262:aload_1         
	//  124  263:invokevirtual   #115 <Method boolean ArrayList.add(Object)>
	//  125  266:ireturn         
		if(true) goto _L10; else goto _L9
_L9:
	}

	public List cloneShallow()
	{
		ZapfDingbatsNumberList zapfdingbatsnumberlist = new ZapfDingbatsNumberList(type);
	//    0    0:new             #2   <Class ZapfDingbatsNumberList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field int type>
	//    4    8:invokespecial   #124 <Method void ZapfDingbatsNumberList(int)>
	//    5   11:astore_1        
		populateProperties(((List) (zapfdingbatsnumberlist)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #128 <Method void populateProperties(List)>
		return ((List) (zapfdingbatsnumberlist));
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int type>
	//    2    4:ireturn         
	}

	public void setType(int i)
	{
		type = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #13  <Field int type>
	//    3    5:return          
	}

	protected int type;
}
