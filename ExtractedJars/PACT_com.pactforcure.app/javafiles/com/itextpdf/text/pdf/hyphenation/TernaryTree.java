// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.hyphenation;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Stack;

// Referenced classes of package com.itextpdf.text.pdf.hyphenation:
//			CharVector

public class TernaryTree
	implements Cloneable, Serializable
{
	public class Iterator
		implements Enumeration
	{

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
		//		               1 127
		//		               2 231;
		//   48   90:tableswitch     1 2: default 112
		//		               1 127
		//		               2 231
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

		public Iterator()
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

	private class Iterator.Item
		implements Cloneable
	{

		public Iterator.Item clone()
		{
			return new Iterator.Item(parent, child);
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
		final Iterator this$1;

		public Iterator.Item()
		{
			this$1 = Iterator.this;
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

		public Iterator.Item(char c, char c1)
		{
			this$1 = Iterator.this;
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


	TernaryTree()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		init();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #39  <Method void init()>
	//    4    8:return          
	}

	private void compact(CharVector charvector, TernaryTree ternarytree, char c)
	{
		if(c == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            5
			return;
	//    2    4:return          
		if(sc[c] == '\uFFFF')
	//*   3    5:aload_0         
	//*   4    6:getfield        #44  <Field char[] sc>
	//*   5    9:iload_3         
	//*   6   10:caload          
	//*   7   11:ldc1            #45  <Int 65535>
	//*   8   13:icmpne          113
		{
			int j = ternarytree.find(kv.getArray(), ((int) (lo[c])));
	//    9   16:aload_2         
	//   10   17:aload_0         
	//   11   18:getfield        #47  <Field CharVector kv>
	//   12   21:invokevirtual   #53  <Method char[] CharVector.getArray()>
	//   13   24:aload_0         
	//   14   25:getfield        #55  <Field char[] lo>
	//   15   28:iload_3         
	//   16   29:caload          
	//   17   30:invokevirtual   #59  <Method int find(char[], int)>
	//   18   33:istore          5
			int i = j;
	//   19   35:iload           5
	//   20   37:istore          4
			if(j < 0)
	//*  21   39:iload           5
	//*  22   41:ifge            103
			{
				i = charvector.alloc(strlen(kv.getArray(), ((int) (lo[c]))) + 1);
	//   23   44:aload_1         
	//   24   45:aload_0         
	//   25   46:getfield        #47  <Field CharVector kv>
	//   26   49:invokevirtual   #53  <Method char[] CharVector.getArray()>
	//   27   52:aload_0         
	//   28   53:getfield        #55  <Field char[] lo>
	//   29   56:iload_3         
	//   30   57:caload          
	//   31   58:invokestatic    #62  <Method int strlen(char[], int)>
	//   32   61:iconst_1        
	//   33   62:iadd            
	//   34   63:invokevirtual   #66  <Method int CharVector.alloc(int)>
	//   35   66:istore          4
				strcpy(charvector.getArray(), i, kv.getArray(), ((int) (lo[c])));
	//   36   68:aload_1         
	//   37   69:invokevirtual   #53  <Method char[] CharVector.getArray()>
	//   38   72:iload           4
	//   39   74:aload_0         
	//   40   75:getfield        #47  <Field CharVector kv>
	//   41   78:invokevirtual   #53  <Method char[] CharVector.getArray()>
	//   42   81:aload_0         
	//   43   82:getfield        #55  <Field char[] lo>
	//   44   85:iload_3         
	//   45   86:caload          
	//   46   87:invokestatic    #70  <Method void strcpy(char[], int, char[], int)>
				ternarytree.insert(charvector.getArray(), i, (char)i);
	//   47   90:aload_2         
	//   48   91:aload_1         
	//   49   92:invokevirtual   #53  <Method char[] CharVector.getArray()>
	//   50   95:iload           4
	//   51   97:iload           4
	//   52   99:int2char        
	//   53  100:invokevirtual   #74  <Method void insert(char[], int, char)>
			}
			lo[c] = (char)i;
	//   54  103:aload_0         
	//   55  104:getfield        #55  <Field char[] lo>
	//   56  107:iload_3         
	//   57  108:iload           4
	//   58  110:int2char        
	//   59  111:castore         
			return;
	//   60  112:return          
		}
		compact(charvector, ternarytree, lo[c]);
	//   61  113:aload_0         
	//   62  114:aload_1         
	//   63  115:aload_2         
	//   64  116:aload_0         
	//   65  117:getfield        #55  <Field char[] lo>
	//   66  120:iload_3         
	//   67  121:caload          
	//   68  122:invokespecial   #76  <Method void compact(CharVector, TernaryTree, char)>
		if(sc[c] != 0)
	//*  69  125:aload_0         
	//*  70  126:getfield        #44  <Field char[] sc>
	//*  71  129:iload_3         
	//*  72  130:caload          
	//*  73  131:ifeq            146
			compact(charvector, ternarytree, eq[c]);
	//   74  134:aload_0         
	//   75  135:aload_1         
	//   76  136:aload_2         
	//   77  137:aload_0         
	//   78  138:getfield        #78  <Field char[] eq>
	//   79  141:iload_3         
	//   80  142:caload          
	//   81  143:invokespecial   #76  <Method void compact(CharVector, TernaryTree, char)>
		compact(charvector, ternarytree, hi[c]);
	//   82  146:aload_0         
	//   83  147:aload_1         
	//   84  148:aload_2         
	//   85  149:aload_0         
	//   86  150:getfield        #80  <Field char[] hi>
	//   87  153:iload_3         
	//   88  154:caload          
	//   89  155:invokespecial   #76  <Method void compact(CharVector, TernaryTree, char)>
	//   90  158:return          
	}

	private char insert(char c, char ac[], int i, char c1)
	{
label0:
		{
			int j = strlen(ac, i);
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokestatic    #62  <Method int strlen(char[], int)>
	//    3    5:istore          6
			if(c == 0)
	//*   4    7:iload_1         
	//*   5    8:ifne            117
			{
				c = freenode;
	//    6   11:aload_0         
	//    7   12:getfield        #83  <Field char freenode>
	//    8   15:istore_1        
				freenode = (char)(c + 1);
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:iconst_1        
	//   12   19:iadd            
	//   13   20:int2char        
	//   14   21:putfield        #83  <Field char freenode>
				eq[c] = c1;
	//   15   24:aload_0         
	//   16   25:getfield        #78  <Field char[] eq>
	//   17   28:iload_1         
	//   18   29:iload           4
	//   19   31:castore         
				length = length + 1;
	//   20   32:aload_0         
	//   21   33:aload_0         
	//   22   34:getfield        #85  <Field int length>
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:putfield        #85  <Field int length>
				hi[c] = '\0';
	//   26   42:aload_0         
	//   27   43:getfield        #80  <Field char[] hi>
	//   28   46:iload_1         
	//   29   47:iconst_0        
	//   30   48:castore         
				if(j > 0)
	//*  31   49:iload           6
	//*  32   51:ifle            100
				{
					sc[c] = '\uFFFF';
	//   33   54:aload_0         
	//   34   55:getfield        #44  <Field char[] sc>
	//   35   58:iload_1         
	//   36   59:ldc1            #45  <Int 65535>
	//   37   61:castore         
					lo[c] = (char)kv.alloc(j + 1);
	//   38   62:aload_0         
	//   39   63:getfield        #55  <Field char[] lo>
	//   40   66:iload_1         
	//   41   67:aload_0         
	//   42   68:getfield        #47  <Field CharVector kv>
	//   43   71:iload           6
	//   44   73:iconst_1        
	//   45   74:iadd            
	//   46   75:invokevirtual   #66  <Method int CharVector.alloc(int)>
	//   47   78:int2char        
	//   48   79:castore         
					strcpy(kv.getArray(), ((int) (lo[c])), ac, i);
	//   49   80:aload_0         
	//   50   81:getfield        #47  <Field CharVector kv>
	//   51   84:invokevirtual   #53  <Method char[] CharVector.getArray()>
	//   52   87:aload_0         
	//   53   88:getfield        #55  <Field char[] lo>
	//   54   91:iload_1         
	//   55   92:caload          
	//   56   93:aload_2         
	//   57   94:iload_3         
	//   58   95:invokestatic    #70  <Method void strcpy(char[], int, char[], int)>
				} else
	//*  59   98:iload_1         
	//*  60   99:ireturn         
				{
					sc[c] = '\0';
	//   61  100:aload_0         
	//   62  101:getfield        #44  <Field char[] sc>
	//   63  104:iload_1         
	//   64  105:iconst_0        
	//   65  106:castore         
					lo[c] = '\0';
	//   66  107:aload_0         
	//   67  108:getfield        #55  <Field char[] lo>
	//   68  111:iload_1         
	//   69  112:iconst_0        
	//   70  113:castore         
				}
				return c;
			}
	//*  71  114:goto            98
			char c2;
			if(sc[c] == '\uFFFF')
	//*  72  117:aload_0         
	//*  73  118:getfield        #44  <Field char[] sc>
	//*  74  121:iload_1         
	//*  75  122:caload          
	//*  76  123:ldc1            #45  <Int 65535>
	//*  77  125:icmpne          269
			{
				c2 = freenode;
	//   78  128:aload_0         
	//   79  129:getfield        #83  <Field char freenode>
	//   80  132:istore          5
				freenode = (char)(c2 + 1);
	//   81  134:aload_0         
	//   82  135:iload           5
	//   83  137:iconst_1        
	//   84  138:iadd            
	//   85  139:int2char        
	//   86  140:putfield        #83  <Field char freenode>
				lo[c2] = lo[c];
	//   87  143:aload_0         
	//   88  144:getfield        #55  <Field char[] lo>
	//   89  147:iload           5
	//   90  149:aload_0         
	//   91  150:getfield        #55  <Field char[] lo>
	//   92  153:iload_1         
	//   93  154:caload          
	//   94  155:castore         
				eq[c2] = eq[c];
	//   95  156:aload_0         
	//   96  157:getfield        #78  <Field char[] eq>
	//   97  160:iload           5
	//   98  162:aload_0         
	//   99  163:getfield        #78  <Field char[] eq>
	//  100  166:iload_1         
	//  101  167:caload          
	//  102  168:castore         
				lo[c] = '\0';
	//  103  169:aload_0         
	//  104  170:getfield        #55  <Field char[] lo>
	//  105  173:iload_1         
	//  106  174:iconst_0        
	//  107  175:castore         
				if(j <= 0)
					break label0;
	//  108  176:iload           6
	//  109  178:ifle            319
				sc[c] = kv.get(((int) (lo[c2])));
	//  110  181:aload_0         
	//  111  182:getfield        #44  <Field char[] sc>
	//  112  185:iload_1         
	//  113  186:aload_0         
	//  114  187:getfield        #47  <Field CharVector kv>
	//  115  190:aload_0         
	//  116  191:getfield        #55  <Field char[] lo>
	//  117  194:iload           5
	//  118  196:caload          
	//  119  197:invokevirtual   #89  <Method char CharVector.get(int)>
	//  120  200:castore         
				eq[c] = c2;
	//  121  201:aload_0         
	//  122  202:getfield        #78  <Field char[] eq>
	//  123  205:iload_1         
	//  124  206:iload           5
	//  125  208:castore         
				char ac1[] = lo;
	//  126  209:aload_0         
	//  127  210:getfield        #55  <Field char[] lo>
	//  128  213:astore          7
				ac1[c2] = (char)(ac1[c2] + 1);
	//  129  215:aload           7
	//  130  217:iload           5
	//  131  219:aload           7
	//  132  221:iload           5
	//  133  223:caload          
	//  134  224:iconst_1        
	//  135  225:iadd            
	//  136  226:int2char        
	//  137  227:castore         
				if(kv.get(((int) (lo[c2]))) == 0)
	//* 138  228:aload_0         
	//* 139  229:getfield        #47  <Field CharVector kv>
	//* 140  232:aload_0         
	//* 141  233:getfield        #55  <Field char[] lo>
	//* 142  236:iload           5
	//* 143  238:caload          
	//* 144  239:invokevirtual   #89  <Method char CharVector.get(int)>
	//* 145  242:ifne            307
				{
					lo[c2] = '\0';
	//  146  245:aload_0         
	//  147  246:getfield        #55  <Field char[] lo>
	//  148  249:iload           5
	//  149  251:iconst_0        
	//  150  252:castore         
					sc[c2] = '\0';
	//  151  253:aload_0         
	//  152  254:getfield        #44  <Field char[] sc>
	//  153  257:iload           5
	//  154  259:iconst_0        
	//  155  260:castore         
					hi[c2] = '\0';
	//  156  261:aload_0         
	//  157  262:getfield        #80  <Field char[] hi>
	//  158  265:iload           5
	//  159  267:iconst_0        
	//  160  268:castore         
				} else
	//* 161  269:aload_2         
	//* 162  270:iload_3         
	//* 163  271:caload          
	//* 164  272:istore          6
	//* 165  274:iload           6
	//* 166  276:aload_0         
	//* 167  277:getfield        #44  <Field char[] sc>
	//* 168  280:iload_1         
	//* 169  281:caload          
	//* 170  282:icmpge          363
	//* 171  285:aload_0         
	//* 172  286:getfield        #55  <Field char[] lo>
	//* 173  289:iload_1         
	//* 174  290:aload_0         
	//* 175  291:aload_0         
	//* 176  292:getfield        #55  <Field char[] lo>
	//* 177  295:iload_1         
	//* 178  296:caload          
	//* 179  297:aload_2         
	//* 180  298:iload_3         
	//* 181  299:iload           4
	//* 182  301:invokespecial   #91  <Method char insert(char, char[], int, char)>
	//* 183  304:castore         
	//* 184  305:iload_1         
	//* 185  306:ireturn         
				{
					sc[c2] = '\uFFFF';
	//  186  307:aload_0         
	//  187  308:getfield        #44  <Field char[] sc>
	//  188  311:iload           5
	//  189  313:ldc1            #45  <Int 65535>
	//  190  315:castore         
				}
			}
			j = ((int) (ac[i]));
			if(j < sc[c])
				lo[c] = insert(lo[c], ac, i, c1);
			else
	//* 191  316:goto            269
	//* 192  319:aload_0         
	//* 193  320:getfield        #44  <Field char[] sc>
	//* 194  323:iload           5
	//* 195  325:ldc1            #45  <Int 65535>
	//* 196  327:castore         
	//* 197  328:aload_0         
	//* 198  329:getfield        #80  <Field char[] hi>
	//* 199  332:iload_1         
	//* 200  333:iload           5
	//* 201  335:castore         
	//* 202  336:aload_0         
	//* 203  337:getfield        #44  <Field char[] sc>
	//* 204  340:iload_1         
	//* 205  341:iconst_0        
	//* 206  342:castore         
	//* 207  343:aload_0         
	//* 208  344:getfield        #78  <Field char[] eq>
	//* 209  347:iload_1         
	//* 210  348:iload           4
	//* 211  350:castore         
	//* 212  351:aload_0         
	//* 213  352:aload_0         
	//* 214  353:getfield        #85  <Field int length>
	//* 215  356:iconst_1        
	//* 216  357:iadd            
	//* 217  358:putfield        #85  <Field int length>
	//* 218  361:iload_1         
	//* 219  362:ireturn         
			if(j == sc[c])
	//* 220  363:iload           6
	//* 221  365:aload_0         
	//* 222  366:getfield        #44  <Field char[] sc>
	//* 223  369:iload_1         
	//* 224  370:caload          
	//* 225  371:icmpne          415
			{
				if(j != 0)
	//* 226  374:iload           6
	//* 227  376:ifeq            404
					eq[c] = insert(eq[c], ac, i + 1, c1);
	//  228  379:aload_0         
	//  229  380:getfield        #78  <Field char[] eq>
	//  230  383:iload_1         
	//  231  384:aload_0         
	//  232  385:aload_0         
	//  233  386:getfield        #78  <Field char[] eq>
	//  234  389:iload_1         
	//  235  390:caload          
	//  236  391:aload_2         
	//  237  392:iload_3         
	//  238  393:iconst_1        
	//  239  394:iadd            
	//  240  395:iload           4
	//  241  397:invokespecial   #91  <Method char insert(char, char[], int, char)>
	//  242  400:castore         
				else
	//* 243  401:goto            305
					eq[c] = c1;
	//  244  404:aload_0         
	//  245  405:getfield        #78  <Field char[] eq>
	//  246  408:iload_1         
	//  247  409:iload           4
	//  248  411:castore         
			} else
	//* 249  412:goto            305
			{
				hi[c] = insert(hi[c], ac, i, c1);
	//  250  415:aload_0         
	//  251  416:getfield        #80  <Field char[] hi>
	//  252  419:iload_1         
	//  253  420:aload_0         
	//  254  421:aload_0         
	//  255  422:getfield        #80  <Field char[] hi>
	//  256  425:iload_1         
	//  257  426:caload          
	//  258  427:aload_2         
	//  259  428:iload_3         
	//  260  429:iload           4
	//  261  431:invokespecial   #91  <Method char insert(char, char[], int, char)>
	//  262  434:castore         
			}
			return c;
		}
		sc[c2] = '\uFFFF';
		hi[c] = c2;
		sc[c] = '\0';
		eq[c] = c1;
		length = length + 1;
		return c;
	//* 263  435:goto            305
	}

	private void redimNodeArrays(int i)
	{
		int j;
		char ac[];
		if(i < lo.length)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #55  <Field char[] lo>
	//*   3    5:arraylength     
	//*   4    6:icmpge          92
			j = i;
	//    5    9:iload_1         
	//    6   10:istore_2        
		else
	//*   7   11:iload_1         
	//*   8   12:newarray        char[]
	//*   9   14:astore_3        
	//*  10   15:aload_0         
	//*  11   16:getfield        #55  <Field char[] lo>
	//*  12   19:iconst_0        
	//*  13   20:aload_3         
	//*  14   21:iconst_0        
	//*  15   22:iload_2         
	//*  16   23:invokestatic    #99  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  17   26:aload_0         
	//*  18   27:aload_3         
	//*  19   28:putfield        #55  <Field char[] lo>
	//*  20   31:iload_1         
	//*  21   32:newarray        char[]
	//*  22   34:astore_3        
	//*  23   35:aload_0         
	//*  24   36:getfield        #80  <Field char[] hi>
	//*  25   39:iconst_0        
	//*  26   40:aload_3         
	//*  27   41:iconst_0        
	//*  28   42:iload_2         
	//*  29   43:invokestatic    #99  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  30   46:aload_0         
	//*  31   47:aload_3         
	//*  32   48:putfield        #80  <Field char[] hi>
	//*  33   51:iload_1         
	//*  34   52:newarray        char[]
	//*  35   54:astore_3        
	//*  36   55:aload_0         
	//*  37   56:getfield        #78  <Field char[] eq>
	//*  38   59:iconst_0        
	//*  39   60:aload_3         
	//*  40   61:iconst_0        
	//*  41   62:iload_2         
	//*  42   63:invokestatic    #99  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  43   66:aload_0         
	//*  44   67:aload_3         
	//*  45   68:putfield        #78  <Field char[] eq>
	//*  46   71:iload_1         
	//*  47   72:newarray        char[]
	//*  48   74:astore_3        
	//*  49   75:aload_0         
	//*  50   76:getfield        #44  <Field char[] sc>
	//*  51   79:iconst_0        
	//*  52   80:aload_3         
	//*  53   81:iconst_0        
	//*  54   82:iload_2         
	//*  55   83:invokestatic    #99  <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  56   86:aload_0         
	//*  57   87:aload_3         
	//*  58   88:putfield        #44  <Field char[] sc>
	//*  59   91:return          
			j = lo.length;
	//   60   92:aload_0         
	//   61   93:getfield        #55  <Field char[] lo>
	//   62   96:arraylength     
	//   63   97:istore_2        
		ac = new char[i];
		System.arraycopy(((Object) (lo)), 0, ((Object) (ac)), 0, j);
		lo = ac;
		ac = new char[i];
		System.arraycopy(((Object) (hi)), 0, ((Object) (ac)), 0, j);
		hi = ac;
		ac = new char[i];
		System.arraycopy(((Object) (eq)), 0, ((Object) (ac)), 0, j);
		eq = ac;
		ac = new char[i];
		System.arraycopy(((Object) (sc)), 0, ((Object) (ac)), 0, j);
		sc = ac;
	//*  64   98:goto            11
	}

	public static int strcmp(String s, char ac[], int i)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #106 <Method int String.length()>
	//    2    4:istore          4
		int j;
		for(j = 0; j < k; j++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          50
		{
			for(int l = s.charAt(j) - ac[i + j]; l != 0 || ac[i + j] == 0;)
	//*   8   14:aload_0         
	//*   9   15:iload_3         
	//*  10   16:invokevirtual   #109 <Method char String.charAt(int)>
	//*  11   19:aload_1         
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:iadd            
	//*  15   23:caload          
	//*  16   24:isub            
	//*  17   25:istore          5
	//*  18   27:iload           5
	//*  19   29:ifeq            35
				return l;
	//   20   32:iload           5
	//   21   34:ireturn         

	//   22   35:aload_1         
	//   23   36:iload_2         
	//   24   37:iload_3         
	//   25   38:iadd            
	//   26   39:caload          
	//   27   40:ifeq            32
		}

	//   28   43:iload_3         
	//   29   44:iconst_1        
	//   30   45:iadd            
	//   31   46:istore_3        
	//*  32   47:goto            8
		if(ac[i + j] != 0)
	//*  33   50:aload_1         
	//*  34   51:iload_2         
	//*  35   52:iload_3         
	//*  36   53:iadd            
	//*  37   54:caload          
	//*  38   55:ifeq            65
			return -ac[i + j];
	//   39   58:aload_1         
	//   40   59:iload_2         
	//   41   60:iload_3         
	//   42   61:iadd            
	//   43   62:caload          
	//   44   63:ineg            
	//   45   64:ireturn         
		else
			return 0;
	//   46   65:iconst_0        
	//   47   66:ireturn         
	}

	public static int strcmp(char ac[], int i, char ac1[], int j)
	{
		for(; ac[i] == ac1[j]; j++)
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:caload          
	//*   3    3:aload_2         
	//*   4    4:iload_3         
	//*   5    5:caload          
	//*   6    6:icmpne          28
		{
			if(ac[i] == 0)
	//*   7    9:aload_0         
	//*   8   10:iload_1         
	//*   9   11:caload          
	//*  10   12:ifne            17
				return 0;
	//   11   15:iconst_0        
	//   12   16:ireturn         
			i++;
	//   13   17:iload_1         
	//   14   18:iconst_1        
	//   15   19:iadd            
	//   16   20:istore_1        
		}

	//   17   21:iload_3         
	//   18   22:iconst_1        
	//   19   23:iadd            
	//   20   24:istore_3        
	//*  21   25:goto            0
		return ac[i] - ac1[j];
	//   22   28:aload_0         
	//   23   29:iload_1         
	//   24   30:caload          
	//   25   31:aload_2         
	//   26   32:iload_3         
	//   27   33:caload          
	//   28   34:isub            
	//   29   35:ireturn         
	}

	public static void strcpy(char ac[], int i, char ac1[], int j)
	{
		while(ac1[j] != 0) 
	//*   0    0:aload_2         
	//*   1    1:iload_3         
	//*   2    2:caload          
	//*   3    3:ifeq            23
		{
			ac[i] = ac1[j];
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:aload_2         
	//    7    9:iload_3         
	//    8   10:caload          
	//    9   11:castore         
			j++;
	//   10   12:iload_3         
	//   11   13:iconst_1        
	//   12   14:iadd            
	//   13   15:istore_3        
			i++;
	//   14   16:iload_1         
	//   15   17:iconst_1        
	//   16   18:iadd            
	//   17   19:istore_1        
		}
	//*  18   20:goto            0
		ac[i] = '\0';
	//   19   23:aload_0         
	//   20   24:iload_1         
	//   21   25:iconst_0        
	//   22   26:castore         
	//   23   27:return          
	}

	public static int strlen(char ac[])
	{
		return strlen(ac, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #62  <Method int strlen(char[], int)>
	//    3    5:ireturn         
	}

	public static int strlen(char ac[], int i)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(; i < ac.length && ac[i] != 0; i++)
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:arraylength     
	//*   5    5:icmpge          25
	//*   6    8:aload_0         
	//*   7    9:iload_1         
	//*   8   10:caload          
	//*   9   11:ifeq            25
			j++;
	//   10   14:iload_2         
	//   11   15:iconst_1        
	//   12   16:iadd            
	//   13   17:istore_2        

	//   14   18:iload_1         
	//   15   19:iconst_1        
	//   16   20:iadd            
	//   17   21:istore_1        
	//*  18   22:goto            2
		return j;
	//   19   25:iload_2         
	//   20   26:ireturn         
	}

	public void balance()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int j = length;
	//    2    2:aload_0         
	//    3    3:getfield        #85  <Field int length>
	//    4    6:istore_2        
		String as[] = new String[j];
	//    5    7:iload_2         
	//    6    8:anewarray       String[]
	//    7   11:astore_3        
		char ac[] = new char[j];
	//    8   12:iload_2         
	//    9   13:newarray        char[]
	//   10   15:astore          4
		for(Iterator iterator = new Iterator(); iterator.hasMoreElements();)
	//*  11   17:new             #10  <Class TernaryTree$Iterator>
	//*  12   20:dup             
	//*  13   21:aload_0         
	//*  14   22:invokespecial   #115 <Method void TernaryTree$Iterator(TernaryTree)>
	//*  15   25:astore          5
	//*  16   27:aload           5
	//*  17   29:invokevirtual   #119 <Method boolean TernaryTree$Iterator.hasMoreElements()>
	//*  18   32:ifeq            59
		{
			ac[i] = iterator.getValue();
	//   19   35:aload           4
	//   20   37:iload_1         
	//   21   38:aload           5
	//   22   40:invokevirtual   #123 <Method char TernaryTree$Iterator.getValue()>
	//   23   43:castore         
			as[i] = iterator.nextElement();
	//   24   44:aload_3         
	//   25   45:iload_1         
	//   26   46:aload           5
	//   27   48:invokevirtual   #127 <Method String TernaryTree$Iterator.nextElement()>
	//   28   51:aastore         
			i++;
	//   29   52:iload_1         
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:istore_1        
		}

	//*  33   56:goto            27
		init();
	//   34   59:aload_0         
	//   35   60:invokevirtual   #39  <Method void init()>
		insertBalanced(as, ac, 0, j);
	//   36   63:aload_0         
	//   37   64:aload_3         
	//   38   65:aload           4
	//   39   67:iconst_0        
	//   40   68:iload_2         
	//   41   69:invokevirtual   #131 <Method void insertBalanced(String[], char[], int, int)>
	//   42   72:return          
	}

	public Object clone()
	{
		TernaryTree ternarytree = new TernaryTree();
	//    0    0:new             #2   <Class TernaryTree>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void TernaryTree()>
	//    3    7:astore_1        
		ternarytree.lo = (char[])((char []) (lo)).clone();
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #55  <Field char[] lo>
	//    7   13:invokevirtual   #137 <Method Object _5B_C.clone()>
	//    8   16:checkcast       #135 <Class char[]>
	//    9   19:putfield        #55  <Field char[] lo>
		ternarytree.hi = (char[])((char []) (hi)).clone();
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #80  <Field char[] hi>
	//   13   27:invokevirtual   #137 <Method Object _5B_C.clone()>
	//   14   30:checkcast       #135 <Class char[]>
	//   15   33:putfield        #80  <Field char[] hi>
		ternarytree.eq = (char[])((char []) (eq)).clone();
	//   16   36:aload_1         
	//   17   37:aload_0         
	//   18   38:getfield        #78  <Field char[] eq>
	//   19   41:invokevirtual   #137 <Method Object _5B_C.clone()>
	//   20   44:checkcast       #135 <Class char[]>
	//   21   47:putfield        #78  <Field char[] eq>
		ternarytree.sc = (char[])((char []) (sc)).clone();
	//   22   50:aload_1         
	//   23   51:aload_0         
	//   24   52:getfield        #44  <Field char[] sc>
	//   25   55:invokevirtual   #137 <Method Object _5B_C.clone()>
	//   26   58:checkcast       #135 <Class char[]>
	//   27   61:putfield        #44  <Field char[] sc>
		ternarytree.kv = (CharVector)kv.clone();
	//   28   64:aload_1         
	//   29   65:aload_0         
	//   30   66:getfield        #47  <Field CharVector kv>
	//   31   69:invokevirtual   #138 <Method Object CharVector.clone()>
	//   32   72:checkcast       #49  <Class CharVector>
	//   33   75:putfield        #47  <Field CharVector kv>
		ternarytree.root = root;
	//   34   78:aload_1         
	//   35   79:aload_0         
	//   36   80:getfield        #140 <Field char root>
	//   37   83:putfield        #140 <Field char root>
		ternarytree.freenode = freenode;
	//   38   86:aload_1         
	//   39   87:aload_0         
	//   40   88:getfield        #83  <Field char freenode>
	//   41   91:putfield        #83  <Field char freenode>
		ternarytree.length = length;
	//   42   94:aload_1         
	//   43   95:aload_0         
	//   44   96:getfield        #85  <Field int length>
	//   45   99:putfield        #85  <Field int length>
		return ((Object) (ternarytree));
	//   46  102:aload_1         
	//   47  103:areturn         
	}

	public int find(String s)
	{
		int i = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #106 <Method int String.length()>
	//    2    4:istore_2        
		char ac[] = new char[i + 1];
	//    3    5:iload_2         
	//    4    6:iconst_1        
	//    5    7:iadd            
	//    6    8:newarray        char[]
	//    7   10:astore_3        
		s.getChars(0, i, ac, 0);
	//    8   11:aload_1         
	//    9   12:iconst_0        
	//   10   13:iload_2         
	//   11   14:aload_3         
	//   12   15:iconst_0        
	//   13   16:invokevirtual   #145 <Method void String.getChars(int, int, char[], int)>
		ac[i] = '\0';
	//   14   19:aload_3         
	//   15   20:iload_2         
	//   16   21:iconst_0        
	//   17   22:castore         
		return find(ac, 0);
	//   18   23:aload_0         
	//   19   24:aload_3         
	//   20   25:iconst_0        
	//   21   26:invokevirtual   #59  <Method int find(char[], int)>
	//   22   29:ireturn         
	}

	public int find(char ac[], int i)
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          5
		char c = root;
	//    2    3:aload_0         
	//    3    4:getfield        #140 <Field char root>
	//    4    7:istore          4
		int j = i;
	//    5    9:iload_2         
	//    6   10:istore_3        
		i = ((int) (c));
	//    7   11:iload           4
	//    8   13:istore_2        
		do
		{
label0:
			{
				char c1 = ((char) (byte0));
	//    9   14:iload           5
	//   10   16:istore          4
				if(i != 0)
	//*  11   18:iload_2         
	//*  12   19:ifeq            66
				{
					if(sc[i] != '\uFFFF')
						break label0;
	//   13   22:aload_0         
	//   14   23:getfield        #44  <Field char[] sc>
	//   15   26:iload_2         
	//   16   27:caload          
	//   17   28:ldc1            #45  <Int 65535>
	//   18   30:icmpne          69
					c1 = ((char) (byte0));
	//   19   33:iload           5
	//   20   35:istore          4
					if(strcmp(ac, j, kv.getArray(), ((int) (lo[i]))) == 0)
	//*  21   37:aload_1         
	//*  22   38:iload_3         
	//*  23   39:aload_0         
	//*  24   40:getfield        #47  <Field CharVector kv>
	//*  25   43:invokevirtual   #53  <Method char[] CharVector.getArray()>
	//*  26   46:aload_0         
	//*  27   47:getfield        #55  <Field char[] lo>
	//*  28   50:iload_2         
	//*  29   51:caload          
	//*  30   52:invokestatic    #147 <Method int strcmp(char[], int, char[], int)>
	//*  31   55:ifne            66
						c1 = eq[i];
	//   32   58:aload_0         
	//   33   59:getfield        #78  <Field char[] eq>
	//   34   62:iload_2         
	//   35   63:caload          
	//   36   64:istore          4
				}
				return ((int) (c1));
	//   37   66:iload           4
	//   38   68:ireturn         
			}
			char c2 = ac[j];
	//   39   69:aload_1         
	//   40   70:iload_3         
	//   41   71:caload          
	//   42   72:istore          4
			int k = c2 - sc[i];
	//   43   74:iload           4
	//   44   76:aload_0         
	//   45   77:getfield        #44  <Field char[] sc>
	//   46   80:iload_2         
	//   47   81:caload          
	//   48   82:isub            
	//   49   83:istore          6
			if(k == 0)
	//*  50   85:iload           6
	//*  51   87:ifne            116
			{
				if(c2 == 0)
	//*  52   90:iload           4
	//*  53   92:ifne            102
					return ((int) (eq[i]));
	//   54   95:aload_0         
	//   55   96:getfield        #78  <Field char[] eq>
	//   56   99:iload_2         
	//   57  100:caload          
	//   58  101:ireturn         
				j++;
	//   59  102:iload_3         
	//   60  103:iconst_1        
	//   61  104:iadd            
	//   62  105:istore_3        
				i = ((int) (eq[i]));
	//   63  106:aload_0         
	//   64  107:getfield        #78  <Field char[] eq>
	//   65  110:iload_2         
	//   66  111:caload          
	//   67  112:istore_2        
			} else
	//*  68  113:goto            14
			if(k < 0)
	//*  69  116:iload           6
	//*  70  118:ifge            131
				i = ((int) (lo[i]));
	//   71  121:aload_0         
	//   72  122:getfield        #55  <Field char[] lo>
	//   73  125:iload_2         
	//   74  126:caload          
	//   75  127:istore_2        
			else
	//*  76  128:goto            14
				i = ((int) (hi[i]));
	//   77  131:aload_0         
	//   78  132:getfield        #80  <Field char[] hi>
	//   79  135:iload_2         
	//   80  136:caload          
	//   81  137:istore_2        
		} while(true);
	//   82  138:goto            14
	}

	protected void init()
	{
		root = '\0';
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #140 <Field char root>
		freenode = '\001';
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #83  <Field char freenode>
		length = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #85  <Field int length>
		lo = new char[2048];
	//    9   15:aload_0         
	//   10   16:sipush          2048
	//   11   19:newarray        char[]
	//   12   21:putfield        #55  <Field char[] lo>
		hi = new char[2048];
	//   13   24:aload_0         
	//   14   25:sipush          2048
	//   15   28:newarray        char[]
	//   16   30:putfield        #80  <Field char[] hi>
		eq = new char[2048];
	//   17   33:aload_0         
	//   18   34:sipush          2048
	//   19   37:newarray        char[]
	//   20   39:putfield        #78  <Field char[] eq>
		sc = new char[2048];
	//   21   42:aload_0         
	//   22   43:sipush          2048
	//   23   46:newarray        char[]
	//   24   48:putfield        #44  <Field char[] sc>
		kv = new CharVector();
	//   25   51:aload_0         
	//   26   52:new             #49  <Class CharVector>
	//   27   55:dup             
	//   28   56:invokespecial   #148 <Method void CharVector()>
	//   29   59:putfield        #47  <Field CharVector kv>
	//   30   62:return          
	}

	public void insert(String s, char c)
	{
		int i = s.length() + 1;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #106 <Method int String.length()>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore_3        
		if(freenode + i > eq.length)
	//*   5    7:aload_0         
	//*   6    8:getfield        #83  <Field char freenode>
	//*   7   11:iload_3         
	//*   8   12:iadd            
	//*   9   13:aload_0         
	//*  10   14:getfield        #78  <Field char[] eq>
	//*  11   17:arraylength     
	//*  12   18:icmple          34
			redimNodeArrays(eq.length + 2048);
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #78  <Field char[] eq>
	//   16   26:arraylength     
	//   17   27:sipush          2048
	//   18   30:iadd            
	//   19   31:invokespecial   #151 <Method void redimNodeArrays(int)>
		int j = i - 1;
	//   20   34:iload_3         
	//   21   35:iconst_1        
	//   22   36:isub            
	//   23   37:istore          4
		char ac[] = new char[i];
	//   24   39:iload_3         
	//   25   40:newarray        char[]
	//   26   42:astore          5
		s.getChars(0, j, ac, 0);
	//   27   44:aload_1         
	//   28   45:iconst_0        
	//   29   46:iload           4
	//   30   48:aload           5
	//   31   50:iconst_0        
	//   32   51:invokevirtual   #145 <Method void String.getChars(int, int, char[], int)>
		ac[j] = '\0';
	//   33   54:aload           5
	//   34   56:iload           4
	//   35   58:iconst_0        
	//   36   59:castore         
		root = insert(root, ac, 0, c);
	//   37   60:aload_0         
	//   38   61:aload_0         
	//   39   62:aload_0         
	//   40   63:getfield        #140 <Field char root>
	//   41   66:aload           5
	//   42   68:iconst_0        
	//   43   69:iload_2         
	//   44   70:invokespecial   #91  <Method char insert(char, char[], int, char)>
	//   45   73:putfield        #140 <Field char root>
	//   46   76:return          
	}

	public void insert(char ac[], int i, char c)
	{
		int j = strlen(ac);
	//    0    0:aload_1         
	//    1    1:invokestatic    #153 <Method int strlen(char[])>
	//    2    4:istore          4
		if(freenode + (j + 1) > eq.length)
	//*   3    6:aload_0         
	//*   4    7:getfield        #83  <Field char freenode>
	//*   5   10:iload           4
	//*   6   12:iconst_1        
	//*   7   13:iadd            
	//*   8   14:iadd            
	//*   9   15:aload_0         
	//*  10   16:getfield        #78  <Field char[] eq>
	//*  11   19:arraylength     
	//*  12   20:icmple          36
			redimNodeArrays(eq.length + 2048);
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #78  <Field char[] eq>
	//   16   28:arraylength     
	//   17   29:sipush          2048
	//   18   32:iadd            
	//   19   33:invokespecial   #151 <Method void redimNodeArrays(int)>
		root = insert(root, ac, i, c);
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:aload_0         
	//   23   39:getfield        #140 <Field char root>
	//   24   42:aload_1         
	//   25   43:iload_2         
	//   26   44:iload_3         
	//   27   45:invokespecial   #91  <Method char insert(char, char[], int, char)>
	//   28   48:putfield        #140 <Field char root>
	//   29   51:return          
	}

	protected void insertBalanced(String as[], char ac[], int i, int j)
	{
		if(j < 1)
	//*   0    0:iload           4
	//*   1    2:iconst_1        
	//*   2    3:icmpge          7
		{
			return;
	//    3    6:return          
		} else
		{
			int k = j >> 1;
	//    4    7:iload           4
	//    5    9:iconst_1        
	//    6   10:ishr            
	//    7   11:istore          5
			insert(as[k + i], ac[k + i]);
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:iload           5
	//   11   17:iload_3         
	//   12   18:iadd            
	//   13   19:aaload          
	//   14   20:aload_2         
	//   15   21:iload           5
	//   16   23:iload_3         
	//   17   24:iadd            
	//   18   25:caload          
	//   19   26:invokevirtual   #155 <Method void insert(String, char)>
			insertBalanced(as, ac, i, k);
	//   20   29:aload_0         
	//   21   30:aload_1         
	//   22   31:aload_2         
	//   23   32:iload_3         
	//   24   33:iload           5
	//   25   35:invokevirtual   #131 <Method void insertBalanced(String[], char[], int, int)>
			insertBalanced(as, ac, i + k + 1, j - k - 1);
	//   26   38:aload_0         
	//   27   39:aload_1         
	//   28   40:aload_2         
	//   29   41:iload_3         
	//   30   42:iload           5
	//   31   44:iadd            
	//   32   45:iconst_1        
	//   33   46:iadd            
	//   34   47:iload           4
	//   35   49:iload           5
	//   36   51:isub            
	//   37   52:iconst_1        
	//   38   53:isub            
	//   39   54:invokevirtual   #131 <Method void insertBalanced(String[], char[], int, int)>
			return;
	//   40   57:return          
		}
	}

	public Enumeration keys()
	{
		return ((Enumeration) (new Iterator()));
	//    0    0:new             #10  <Class TernaryTree$Iterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #115 <Method void TernaryTree$Iterator(TernaryTree)>
	//    4    8:areturn         
	}

	public boolean knows(String s)
	{
		return find(s) >= 0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #163 <Method int find(String)>
	//    3    5:iflt            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void printStats()
	{
		System.out.println((new StringBuilder()).append("Number of keys = ").append(Integer.toString(length)).toString());
	//    0    0:getstatic       #168 <Field PrintStream System.out>
	//    1    3:new             #170 <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #171 <Method void StringBuilder()>
	//    4   10:ldc1            #173 <String "Number of keys = ">
	//    5   12:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:getfield        #85  <Field int length>
	//    8   19:invokestatic    #183 <Method String Integer.toString(int)>
	//    9   22:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   10   25:invokevirtual   #185 <Method String StringBuilder.toString()>
	//   11   28:invokevirtual   #191 <Method void PrintStream.println(String)>
		System.out.println((new StringBuilder()).append("Node count = ").append(Integer.toString(((int) (freenode)))).toString());
	//   12   31:getstatic       #168 <Field PrintStream System.out>
	//   13   34:new             #170 <Class StringBuilder>
	//   14   37:dup             
	//   15   38:invokespecial   #171 <Method void StringBuilder()>
	//   16   41:ldc1            #193 <String "Node count = ">
	//   17   43:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   18   46:aload_0         
	//   19   47:getfield        #83  <Field char freenode>
	//   20   50:invokestatic    #183 <Method String Integer.toString(int)>
	//   21   53:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   22   56:invokevirtual   #185 <Method String StringBuilder.toString()>
	//   23   59:invokevirtual   #191 <Method void PrintStream.println(String)>
		System.out.println((new StringBuilder()).append("Key Array length = ").append(Integer.toString(kv.length())).toString());
	//   24   62:getstatic       #168 <Field PrintStream System.out>
	//   25   65:new             #170 <Class StringBuilder>
	//   26   68:dup             
	//   27   69:invokespecial   #171 <Method void StringBuilder()>
	//   28   72:ldc1            #195 <String "Key Array length = ">
	//   29   74:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   30   77:aload_0         
	//   31   78:getfield        #47  <Field CharVector kv>
	//   32   81:invokevirtual   #196 <Method int CharVector.length()>
	//   33   84:invokestatic    #183 <Method String Integer.toString(int)>
	//   34   87:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   35   90:invokevirtual   #185 <Method String StringBuilder.toString()>
	//   36   93:invokevirtual   #191 <Method void PrintStream.println(String)>
	//   37   96:return          
	}

	public int size()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int length>
	//    2    4:ireturn         
	}

	public void trimToSize()
	{
		balance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method void balance()>
		redimNodeArrays(((int) (freenode)));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #83  <Field char freenode>
	//    5    9:invokespecial   #151 <Method void redimNodeArrays(int)>
		CharVector charvector = new CharVector();
	//    6   12:new             #49  <Class CharVector>
	//    7   15:dup             
	//    8   16:invokespecial   #148 <Method void CharVector()>
	//    9   19:astore_1        
		charvector.alloc(1);
	//   10   20:aload_1         
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #66  <Method int CharVector.alloc(int)>
	//   13   25:pop             
		compact(charvector, new TernaryTree(), root);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:new             #2   <Class TernaryTree>
	//   17   31:dup             
	//   18   32:invokespecial   #134 <Method void TernaryTree()>
	//   19   35:aload_0         
	//   20   36:getfield        #140 <Field char root>
	//   21   39:invokespecial   #76  <Method void compact(CharVector, TernaryTree, char)>
		kv = charvector;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:putfield        #47  <Field CharVector kv>
		kv.trimToSize();
	//   25   47:aload_0         
	//   26   48:getfield        #47  <Field CharVector kv>
	//   27   51:invokevirtual   #202 <Method void CharVector.trimToSize()>
	//   28   54:return          
	}

	protected static final int BLOCK_SIZE = 2048;
	private static final long serialVersionUID = 0x673c3056L;
	protected char eq[];
	protected char freenode;
	protected char hi[];
	protected CharVector kv;
	protected int length;
	protected char lo[];
	protected char root;
	protected char sc[];
}
