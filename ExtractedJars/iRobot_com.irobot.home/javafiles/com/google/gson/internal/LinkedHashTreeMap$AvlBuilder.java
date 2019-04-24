// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;


// Referenced classes of package com.google.gson.internal:
//			LinkedHashTreeMap

static final class LinkedHashTreeMap$AvlBuilder
{

	void add(LinkedHashTreeMap.Node node)
	{
		int i;
		node.right = null;
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:putfield        #27  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		node.parent = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		node.left = null;
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:putfield        #33  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		node.height = 1;
	//    9   15:aload_1         
	//   10   16:iconst_1        
	//   11   17:putfield        #36  <Field int LinkedHashTreeMap$Node.height>
		if(leavesToSkip > 0 && (size & 1) == 0)
	//*  12   20:aload_0         
	//*  13   21:getfield        #38  <Field int leavesToSkip>
	//*  14   24:ifle            66
	//*  15   27:aload_0         
	//*  16   28:getfield        #40  <Field int size>
	//*  17   31:iconst_1        
	//*  18   32:iand            
	//*  19   33:ifne            66
		{
			size = size + 1;
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:getfield        #40  <Field int size>
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:putfield        #40  <Field int size>
			leavesToSkip = leavesToSkip - 1;
	//   26   46:aload_0         
	//   27   47:aload_0         
	//   28   48:getfield        #38  <Field int leavesToSkip>
	//   29   51:iconst_1        
	//   30   52:isub            
	//   31   53:putfield        #38  <Field int leavesToSkip>
			leavesSkipped = leavesSkipped + 1;
	//   32   56:aload_0         
	//   33   57:aload_0         
	//   34   58:getfield        #42  <Field int leavesSkipped>
	//   35   61:iconst_1        
	//   36   62:iadd            
	//   37   63:putfield        #42  <Field int leavesSkipped>
		}
		node.parent = stack;
	//   38   66:aload_1         
	//   39   67:aload_0         
	//   40   68:getfield        #44  <Field LinkedHashTreeMap$Node stack>
	//   41   71:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		stack = node;
	//   42   74:aload_0         
	//   43   75:aload_1         
	//   44   76:putfield        #44  <Field LinkedHashTreeMap$Node stack>
		size = size + 1;
	//   45   79:aload_0         
	//   46   80:aload_0         
	//   47   81:getfield        #40  <Field int size>
	//   48   84:iconst_1        
	//   49   85:iadd            
	//   50   86:putfield        #40  <Field int size>
		if(leavesToSkip > 0 && (size & 1) == 0)
	//*  51   89:aload_0         
	//*  52   90:getfield        #38  <Field int leavesToSkip>
	//*  53   93:ifle            135
	//*  54   96:aload_0         
	//*  55   97:getfield        #40  <Field int size>
	//*  56  100:iconst_1        
	//*  57  101:iand            
	//*  58  102:ifne            135
		{
			size = size + 1;
	//   59  105:aload_0         
	//   60  106:aload_0         
	//   61  107:getfield        #40  <Field int size>
	//   62  110:iconst_1        
	//   63  111:iadd            
	//   64  112:putfield        #40  <Field int size>
			leavesToSkip = leavesToSkip - 1;
	//   65  115:aload_0         
	//   66  116:aload_0         
	//   67  117:getfield        #38  <Field int leavesToSkip>
	//   68  120:iconst_1        
	//   69  121:isub            
	//   70  122:putfield        #38  <Field int leavesToSkip>
			leavesSkipped = leavesSkipped + 1;
	//   71  125:aload_0         
	//   72  126:aload_0         
	//   73  127:getfield        #42  <Field int leavesSkipped>
	//   74  130:iconst_1        
	//   75  131:iadd            
	//   76  132:putfield        #42  <Field int leavesSkipped>
		}
		i = 4;
	//   77  135:iconst_4        
	//   78  136:istore_2        
_L8:
		int j = size;
	//   79  137:aload_0         
	//   80  138:getfield        #40  <Field int size>
	//   81  141:istore_3        
		int k = i - 1;
	//   82  142:iload_2         
	//   83  143:iconst_1        
	//   84  144:isub            
	//   85  145:istore          4
		if((j & k) != k)
			break; /* Loop/switch isn't completed */
	//   86  147:iload_3         
	//   87  148:iload           4
	//   88  150:iand            
	//   89  151:iload           4
	//   90  153:icmpne          311
		if(leavesSkipped != 0) goto _L2; else goto _L1
	//   91  156:aload_0         
	//   92  157:getfield        #42  <Field int leavesSkipped>
	//   93  160:ifne            237
_L1:
		node = stack;
	//   94  163:aload_0         
	//   95  164:getfield        #44  <Field LinkedHashTreeMap$Node stack>
	//   96  167:astore_1        
		LinkedHashTreeMap.Node node1 = node.parent;
	//   97  168:aload_1         
	//   98  169:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//   99  172:astore          5
		LinkedHashTreeMap.Node node3 = node1.parent;
	//  100  174:aload           5
	//  101  176:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//  102  179:astore          6
		node1.parent = node3.parent;
	//  103  181:aload           5
	//  104  183:aload           6
	//  105  185:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//  106  188:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		stack = node1;
	//  107  191:aload_0         
	//  108  192:aload           5
	//  109  194:putfield        #44  <Field LinkedHashTreeMap$Node stack>
		node1.left = node3;
	//  110  197:aload           5
	//  111  199:aload           6
	//  112  201:putfield        #33  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
		node1.right = node;
	//  113  204:aload           5
	//  114  206:aload_1         
	//  115  207:putfield        #27  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		node1.height = node.height + 1;
	//  116  210:aload           5
	//  117  212:aload_1         
	//  118  213:getfield        #36  <Field int LinkedHashTreeMap$Node.height>
	//  119  216:iconst_1        
	//  120  217:iadd            
	//  121  218:putfield        #36  <Field int LinkedHashTreeMap$Node.height>
		node3.parent = node1;
	//  122  221:aload           6
	//  123  223:aload           5
	//  124  225:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		node.parent = node1;
	//  125  228:aload_1         
	//  126  229:aload           5
	//  127  231:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
		  goto _L3
	//* 128  234:goto            304
_L2:
		if(leavesSkipped != 1) goto _L5; else goto _L4
	//  129  237:aload_0         
	//  130  238:getfield        #42  <Field int leavesSkipped>
	//  131  241:iconst_1        
	//  132  242:icmpne          293
_L4:
		node = stack;
	//  133  245:aload_0         
	//  134  246:getfield        #44  <Field LinkedHashTreeMap$Node stack>
	//  135  249:astore_1        
		LinkedHashTreeMap.Node node2 = node.parent;
	//  136  250:aload_1         
	//  137  251:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//  138  254:astore          5
		stack = node2;
	//  139  256:aload_0         
	//  140  257:aload           5
	//  141  259:putfield        #44  <Field LinkedHashTreeMap$Node stack>
		node2.right = node;
	//  142  262:aload           5
	//  143  264:aload_1         
	//  144  265:putfield        #27  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
		node2.height = node.height + 1;
	//  145  268:aload           5
	//  146  270:aload_1         
	//  147  271:getfield        #36  <Field int LinkedHashTreeMap$Node.height>
	//  148  274:iconst_1        
	//  149  275:iadd            
	//  150  276:putfield        #36  <Field int LinkedHashTreeMap$Node.height>
		node.parent = node2;
	//  151  279:aload_1         
	//  152  280:aload           5
	//  153  282:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
_L6:
		leavesSkipped = 0;
	//  154  285:aload_0         
	//  155  286:iconst_0        
	//  156  287:putfield        #42  <Field int leavesSkipped>
		break; /* Loop/switch isn't completed */
	//  157  290:goto            304
_L5:
		if(leavesSkipped != 2) goto _L3; else goto _L6
	//  158  293:aload_0         
	//  159  294:getfield        #42  <Field int leavesSkipped>
	//  160  297:iconst_2        
	//  161  298:icmpne          304
	//* 162  301:goto            285
_L3:
		i *= 2;
	//  163  304:iload_2         
	//  164  305:iconst_2        
	//  165  306:imul            
	//  166  307:istore_2        
		if(true) goto _L8; else goto _L7
	//  167  308:goto            137
_L7:
	//  168  311:return          
	}

	void reset(int i)
	{
		leavesToSkip = Integer.highestOneBit(i) * 2 - 1 - i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #54  <Method int Integer.highestOneBit(int)>
	//    3    5:iconst_2        
	//    4    6:imul            
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:iload_1         
	//    8   10:isub            
	//    9   11:putfield        #38  <Field int leavesToSkip>
		size = 0;
	//   10   14:aload_0         
	//   11   15:iconst_0        
	//   12   16:putfield        #40  <Field int size>
		leavesSkipped = 0;
	//   13   19:aload_0         
	//   14   20:iconst_0        
	//   15   21:putfield        #42  <Field int leavesSkipped>
		stack = null;
	//   16   24:aload_0         
	//   17   25:aconst_null     
	//   18   26:putfield        #44  <Field LinkedHashTreeMap$Node stack>
	//   19   29:return          
	}

	LinkedHashTreeMap.Node root()
	{
		LinkedHashTreeMap.Node node = stack;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field LinkedHashTreeMap$Node stack>
	//    2    4:astore_1        
		if(node.parent != null)
	//*   3    5:aload_1         
	//*   4    6:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//*   5    9:ifnull          20
			throw new IllegalStateException();
	//    6   12:new             #58  <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:invokespecial   #59  <Method void IllegalStateException()>
	//    9   19:athrow          
		else
			return node;
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	private int leavesSkipped;
	private int leavesToSkip;
	private int size;
	private LinkedHashTreeMap.Node stack;

	LinkedHashTreeMap$AvlBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
