// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.hyphenation;

import java.util.Enumeration;
import java.util.Stack;

// Referenced classes of package com.itextpdf.text.pdf.hyphenation:
//			TernaryTree, CharVector

public class TernaryTree$Iterator
	implements Enumeration
{
	private class Item
		implements Cloneable
	{

		public Item clone()
		{
			return new Item(parent, child);
		//    0    0:new             #2   <Class TernaryTree$Iterator$Item>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field TernaryTree$Iterator this$1>
		//    4    8:aload_0         
		//    5    9:getfield        #26  <Field char parent>
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field char child>
		//    8   16:invokespecial   #34  <Method void TernaryTree$Iterator$Item(TernaryTree$Iterator, char, char)>
		//    9   19:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #39  <Method TernaryTree$Iterator$Item clone()>
		//    2    4:areturn         
		}

		char child;
		char parent;
		final TernaryTree.Iterator this$1;

		public Item()
		{
			this$1 = TernaryTree.Iterator.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field TernaryTree$Iterator this$1>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			parent = '\0';
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #26  <Field char parent>
			child = '\0';
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #28  <Field char child>
		//   11   19:return          
		}

		public Item(char c, char c1)
		{
			this$1 = TernaryTree.Iterator.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field TernaryTree$Iterator this$1>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			parent = c;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field char parent>
			child = c1;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #28  <Field char child>
		//   11   19:return          
		}
	}


	private int run()
	{
		int j;
		if(cur == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int cur>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          10
			return -1;
	//    4    8:iconst_m1       
	//    5    9:ireturn         
		j = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
_L7:
		int i = j;
	//    8   12:iload_2         
	//    9   13:istore_1        
		if(cur == 0) goto _L2; else goto _L1
	//   10   14:aload_0         
	//   11   15:getfield        #33  <Field int cur>
	//   12   18:ifeq            40
_L1:
		if(sc[cur] != '\uFFFF') goto _L4; else goto _L3
	//   13   21:aload_0         
	//   14   22:getfield        #28  <Field TernaryTree this$0>
	//   15   25:getfield        #53  <Field char[] TernaryTree.sc>
	//   16   28:aload_0         
	//   17   29:getfield        #33  <Field int cur>
	//   18   32:caload          
	//   19   33:ldc1            #54  <Int 65535>
	//   20   35:icmpne          126
_L3:
		i = 1;
	//   21   38:iconst_1        
	//   22   39:istore_1        
_L2:
		StringBuffer stringbuffer;
		if(i == 0)
			break; /* Loop/switch isn't completed */
	//   23   40:iload_1         
	//   24   41:ifeq            187
		stringbuffer = new StringBuffer(ks.toString());
	//   25   44:new             #40  <Class StringBuffer>
	//   26   47:dup             
	//   27   48:aload_0         
	//   28   49:getfield        #43  <Field StringBuffer ks>
	//   29   52:invokevirtual   #58  <Method String StringBuffer.toString()>
	//   30   55:invokespecial   #61  <Method void StringBuffer(String)>
	//   31   58:astore_3        
		if(sc[cur] == '\uFFFF')
	//*  32   59:aload_0         
	//*  33   60:getfield        #28  <Field TernaryTree this$0>
	//*  34   63:getfield        #53  <Field char[] TernaryTree.sc>
	//*  35   66:aload_0         
	//*  36   67:getfield        #33  <Field int cur>
	//*  37   70:caload          
	//*  38   71:ldc1            #54  <Int 65535>
	//*  39   73:icmpne          207
			for(i = ((int) (lo[cur])); kv.get(i) != 0; i++)
	//*  40   76:aload_0         
	//*  41   77:getfield        #28  <Field TernaryTree this$0>
	//*  42   80:getfield        #64  <Field char[] TernaryTree.lo>
	//*  43   83:aload_0         
	//*  44   84:getfield        #33  <Field int cur>
	//*  45   87:caload          
	//*  46   88:istore_1        
	//*  47   89:aload_0         
	//*  48   90:getfield        #28  <Field TernaryTree this$0>
	//*  49   93:getfield        #68  <Field CharVector TernaryTree.kv>
	//*  50   96:iload_1         
	//*  51   97:invokevirtual   #74  <Method char CharVector.get(int)>
	//*  52  100:ifeq            207
				stringbuffer.append(kv.get(i));
	//   53  103:aload_3         
	//   54  104:aload_0         
	//   55  105:getfield        #28  <Field TernaryTree this$0>
	//   56  108:getfield        #68  <Field CharVector TernaryTree.kv>
	//   57  111:iload_1         
	//   58  112:invokevirtual   #74  <Method char CharVector.get(int)>
	//   59  115:invokevirtual   #78  <Method StringBuffer StringBuffer.append(char)>
	//   60  118:pop             

	//   61  119:iload_1         
	//   62  120:iconst_1        
	//   63  121:iadd            
	//   64  122:istore_1        
		break; /* Loop/switch isn't completed */
	//   65  123:goto            89
_L4:
		ns.push(((Object) (new Item((char)cur, '\0'))));
	//   66  126:aload_0         
	//   67  127:getfield        #38  <Field Stack ns>
	//   68  130:new             #12  <Class TernaryTree$Iterator$Item>
	//   69  133:dup             
	//   70  134:aload_0         
	//   71  135:aload_0         
	//   72  136:getfield        #33  <Field int cur>
	//   73  139:int2char        
	//   74  140:iconst_0        
	//   75  141:invokespecial   #81  <Method void TernaryTree$Iterator$Item(TernaryTree$Iterator, char, char)>
	//   76  144:invokevirtual   #85  <Method Object Stack.push(Object)>
	//   77  147:pop             
		if(sc[cur] != 0)
			break; /* Loop/switch isn't completed */
	//   78  148:aload_0         
	//   79  149:getfield        #28  <Field TernaryTree this$0>
	//   80  152:getfield        #53  <Field char[] TernaryTree.sc>
	//   81  155:aload_0         
	//   82  156:getfield        #33  <Field int cur>
	//   83  159:caload          
	//   84  160:ifne            168
		i = 1;
	//   85  163:iconst_1        
	//   86  164:istore_1        
		if(true) goto _L2; else goto _L5
	//   87  165:goto            40
_L5:
		cur = ((int) (lo[cur]));
	//   88  168:aload_0         
	//   89  169:aload_0         
	//   90  170:getfield        #28  <Field TernaryTree this$0>
	//   91  173:getfield        #64  <Field char[] TernaryTree.lo>
	//   92  176:aload_0         
	//   93  177:getfield        #33  <Field int cur>
	//   94  180:caload          
	//   95  181:putfield        #33  <Field int cur>
		if(true) goto _L7; else goto _L6
	//   96  184:goto            12
_L6:
		cur = up();
	//   97  187:aload_0         
	//   98  188:aload_0         
	//   99  189:invokespecial   #88  <Method int up()>
	//  100  192:putfield        #33  <Field int cur>
		j = i;
	//  101  195:iload_1         
	//  102  196:istore_2        
		if(cur == -1)
	//* 103  197:aload_0         
	//* 104  198:getfield        #33  <Field int cur>
	//* 105  201:iconst_m1       
	//* 106  202:icmpne          12
			return -1;
	//  107  205:iconst_m1       
	//  108  206:ireturn         
		if(true) goto _L7; else goto _L8
_L8:
		curkey = stringbuffer.toString();
	//  109  207:aload_0         
	//  110  208:aload_3         
	//  111  209:invokevirtual   #58  <Method String StringBuffer.toString()>
	//  112  212:putfield        #90  <Field String curkey>
		return 0;
	//  113  215:iconst_0        
	//  114  216:ireturn         
	}

	private int up()
	{
		char c;
		new Item();
	//    0    0:new             #12  <Class TernaryTree$Iterator$Item>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #93  <Method void TernaryTree$Iterator$Item(TernaryTree$Iterator)>
	//    4    8:pop             
		c = '\0';
	//    5    9:iconst_0        
	//    6   10:istore_2        
		if(!ns.empty()) goto _L2; else goto _L1
	//    7   11:aload_0         
	//    8   12:getfield        #38  <Field Stack ns>
	//    9   15:invokevirtual   #97  <Method boolean Stack.empty()>
	//   10   18:ifeq            23
_L1:
		return -1;
	//   11   21:iconst_m1       
	//   12   22:ireturn         
_L2:
		boolean flag;
		if(cur != 0 && sc[cur] == 0)
	//*  13   23:aload_0         
	//*  14   24:getfield        #33  <Field int cur>
	//*  15   27:ifeq            58
	//*  16   30:aload_0         
	//*  17   31:getfield        #28  <Field TernaryTree this$0>
	//*  18   34:getfield        #53  <Field char[] TernaryTree.sc>
	//*  19   37:aload_0         
	//*  20   38:getfield        #33  <Field int cur>
	//*  21   41:caload          
	//*  22   42:ifne            58
			return ((int) (lo[cur]));
	//   23   45:aload_0         
	//   24   46:getfield        #28  <Field TernaryTree this$0>
	//   25   49:getfield        #64  <Field char[] TernaryTree.lo>
	//   26   52:aload_0         
	//   27   53:getfield        #33  <Field int cur>
	//   28   56:caload          
	//   29   57:ireturn         
		flag = true;
	//   30   58:iconst_1        
	//   31   59:istore_1        
_L9:
		if(!flag) goto _L4; else goto _L3
	//   32   60:iload_1         
	//   33   61:ifeq            287
_L3:
		Item item;
		item = (Item)ns.pop();
	//   34   64:aload_0         
	//   35   65:getfield        #38  <Field Stack ns>
	//   36   68:invokevirtual   #101 <Method Object Stack.pop()>
	//   37   71:checkcast       #12  <Class TernaryTree$Iterator$Item>
	//   38   74:astore_3        
		item.child = (char)(item.child + 1);
	//   39   75:aload_3         
	//   40   76:aload_3         
	//   41   77:getfield        #105 <Field char TernaryTree$Iterator$Item.child>
	//   42   80:iconst_1        
	//   43   81:iadd            
	//   44   82:int2char        
	//   45   83:putfield        #105 <Field char TernaryTree$Iterator$Item.child>
		item.child;
	//   46   86:aload_3         
	//   47   87:getfield        #105 <Field char TernaryTree$Iterator$Item.child>
		JVM INSTR tableswitch 1 2: default 112
	//	               1 127
	//	               2 231;
	//   48   90:tableswitch     1 2: default 112
	//	               1 127
	//	               2 231
		   goto _L5 _L6 _L7
_L5:
		if(ns.empty()) goto _L1; else goto _L8
	//   49  112:aload_0         
	//   50  113:getfield        #38  <Field Stack ns>
	//   51  116:invokevirtual   #97  <Method boolean Stack.empty()>
	//   52  119:ifne            21
_L8:
		flag = true;
	//   53  122:iconst_1        
	//   54  123:istore_1        
		  goto _L9
	//*  55  124:goto            60
_L6:
		if(sc[item.parent] != 0)
	//*  56  127:aload_0         
	//*  57  128:getfield        #28  <Field TernaryTree this$0>
	//*  58  131:getfield        #53  <Field char[] TernaryTree.sc>
	//*  59  134:aload_3         
	//*  60  135:getfield        #108 <Field char TernaryTree$Iterator$Item.parent>
	//*  61  138:caload          
	//*  62  139:ifeq            192
		{
			c = eq[item.parent];
	//   63  142:aload_0         
	//   64  143:getfield        #28  <Field TernaryTree this$0>
	//   65  146:getfield        #111 <Field char[] TernaryTree.eq>
	//   66  149:aload_3         
	//   67  150:getfield        #108 <Field char TernaryTree$Iterator$Item.parent>
	//   68  153:caload          
	//   69  154:istore_2        
			ns.push(((Object) (item.clone())));
	//   70  155:aload_0         
	//   71  156:getfield        #38  <Field Stack ns>
	//   72  159:aload_3         
	//   73  160:invokevirtual   #115 <Method TernaryTree$Iterator$Item TernaryTree$Iterator$Item.clone()>
	//   74  163:invokevirtual   #85  <Method Object Stack.push(Object)>
	//   75  166:pop             
			ks.append(sc[item.parent]);
	//   76  167:aload_0         
	//   77  168:getfield        #43  <Field StringBuffer ks>
	//   78  171:aload_0         
	//   79  172:getfield        #28  <Field TernaryTree this$0>
	//   80  175:getfield        #53  <Field char[] TernaryTree.sc>
	//   81  178:aload_3         
	//   82  179:getfield        #108 <Field char TernaryTree$Iterator$Item.parent>
	//   83  182:caload          
	//   84  183:invokevirtual   #78  <Method StringBuffer StringBuffer.append(char)>
	//   85  186:pop             
		} else
	//*  86  187:iconst_0        
	//*  87  188:istore_1        
	//*  88  189:goto            60
		{
			item.child = (char)(item.child + 1);
	//   89  192:aload_3         
	//   90  193:aload_3         
	//   91  194:getfield        #105 <Field char TernaryTree$Iterator$Item.child>
	//   92  197:iconst_1        
	//   93  198:iadd            
	//   94  199:int2char        
	//   95  200:putfield        #105 <Field char TernaryTree$Iterator$Item.child>
			ns.push(((Object) (item.clone())));
	//   96  203:aload_0         
	//   97  204:getfield        #38  <Field Stack ns>
	//   98  207:aload_3         
	//   99  208:invokevirtual   #115 <Method TernaryTree$Iterator$Item TernaryTree$Iterator$Item.clone()>
	//  100  211:invokevirtual   #85  <Method Object Stack.push(Object)>
	//  101  214:pop             
			c = hi[item.parent];
	//  102  215:aload_0         
	//  103  216:getfield        #28  <Field TernaryTree this$0>
	//  104  219:getfield        #118 <Field char[] TernaryTree.hi>
	//  105  222:aload_3         
	//  106  223:getfield        #108 <Field char TernaryTree$Iterator$Item.parent>
	//  107  226:caload          
	//  108  227:istore_2        
		}
		flag = false;
		  goto _L9
	//* 109  228:goto            187
_L7:
		c = hi[item.parent];
	//  110  231:aload_0         
	//  111  232:getfield        #28  <Field TernaryTree this$0>
	//  112  235:getfield        #118 <Field char[] TernaryTree.hi>
	//  113  238:aload_3         
	//  114  239:getfield        #108 <Field char TernaryTree$Iterator$Item.parent>
	//  115  242:caload          
	//  116  243:istore_2        
		ns.push(((Object) (item.clone())));
	//  117  244:aload_0         
	//  118  245:getfield        #38  <Field Stack ns>
	//  119  248:aload_3         
	//  120  249:invokevirtual   #115 <Method TernaryTree$Iterator$Item TernaryTree$Iterator$Item.clone()>
	//  121  252:invokevirtual   #85  <Method Object Stack.push(Object)>
	//  122  255:pop             
		if(ks.length() > 0)
	//* 123  256:aload_0         
	//* 124  257:getfield        #43  <Field StringBuffer ks>
	//* 125  260:invokevirtual   #121 <Method int StringBuffer.length()>
	//* 126  263:ifle            282
			ks.setLength(ks.length() - 1);
	//  127  266:aload_0         
	//  128  267:getfield        #43  <Field StringBuffer ks>
	//  129  270:aload_0         
	//  130  271:getfield        #43  <Field StringBuffer ks>
	//  131  274:invokevirtual   #121 <Method int StringBuffer.length()>
	//  132  277:iconst_1        
	//  133  278:isub            
	//  134  279:invokevirtual   #125 <Method void StringBuffer.setLength(int)>
		flag = false;
	//  135  282:iconst_0        
	//  136  283:istore_1        
		  goto _L9
	//* 137  284:goto            60
_L4:
		return ((int) (c));
	//  138  287:iload_2         
	//  139  288:ireturn         
	}

	public char getValue()
	{
		if(cur >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int cur>
	//*   2    4:iflt            20
			return eq[cur];
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field TernaryTree this$0>
	//    5   11:getfield        #111 <Field char[] TernaryTree.eq>
	//    6   14:aload_0         
	//    7   15:getfield        #33  <Field int cur>
	//    8   18:caload          
	//    9   19:ireturn         
		else
			return '\0';
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public boolean hasMoreElements()
	{
		return cur != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int cur>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public volatile Object nextElement()
	{
		return ((Object) (nextElement()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method String nextElement()>
	//    2    4:areturn         
	}

	public String nextElement()
	{
		String s = curkey;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field String curkey>
	//    2    4:astore_1        
		cur = up();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #88  <Method int up()>
	//    6   10:putfield        #33  <Field int cur>
		run();
	//    7   13:aload_0         
	//    8   14:invokespecial   #133 <Method int run()>
	//    9   17:pop             
		return s;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public void rewind()
	{
		ns.removeAllElements();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Stack ns>
	//    2    4:invokevirtual   #136 <Method void Stack.removeAllElements()>
		ks.setLength(0);
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field StringBuffer ks>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #125 <Method void StringBuffer.setLength(int)>
		cur = ((int) (root));
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #28  <Field TernaryTree this$0>
	//   10   20:getfield        #139 <Field char TernaryTree.root>
	//   11   23:putfield        #33  <Field int cur>
		run();
	//   12   26:aload_0         
	//   13   27:invokespecial   #133 <Method int run()>
	//   14   30:pop             
	//   15   31:return          
	}

	int cur;
	String curkey;
	StringBuffer ks;
	Stack ns;
	final TernaryTree this$0;

	public TernaryTree$Iterator()
	{
		this$0 = TernaryTree.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field TernaryTree this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #31  <Method void Object()>
		cur = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #33  <Field int cur>
		ns = new Stack();
	//    8   14:aload_0         
	//    9   15:new             #35  <Class Stack>
	//   10   18:dup             
	//   11   19:invokespecial   #36  <Method void Stack()>
	//   12   22:putfield        #38  <Field Stack ns>
		ks = new StringBuffer();
	//   13   25:aload_0         
	//   14   26:new             #40  <Class StringBuffer>
	//   15   29:dup             
	//   16   30:invokespecial   #41  <Method void StringBuffer()>
	//   17   33:putfield        #43  <Field StringBuffer ks>
		rewind();
	//   18   36:aload_0         
	//   19   37:invokevirtual   #46  <Method void rewind()>
	//   20   40:return          
	}
}
