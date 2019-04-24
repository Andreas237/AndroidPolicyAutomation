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
		for(int i = 4; (size & i - 1) == i - 1; i *= 2)
	//*  77  135:iconst_4        
	//*  78  136:istore_2        
	//*  79  137:aload_0         
	//*  80  138:getfield        #40  <Field int size>
	//*  81  141:iload_2         
	//*  82  142:iconst_1        
	//*  83  143:isub            
	//*  84  144:iand            
	//*  85  145:iload_2         
	//*  86  146:iconst_1        
	//*  87  147:isub            
	//*  88  148:icmpne          294
		{
			if(leavesSkipped == 0)
	//*  89  151:aload_0         
	//*  90  152:getfield        #42  <Field int leavesSkipped>
	//*  91  155:ifne            223
			{
				node = stack;
	//   92  158:aload_0         
	//   93  159:getfield        #44  <Field LinkedHashTreeMap$Node stack>
	//   94  162:astore_1        
				LinkedHashTreeMap.Node node1 = node.parent;
	//   95  163:aload_1         
	//   96  164:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//   97  167:astore_3        
				LinkedHashTreeMap.Node node3 = node1.parent;
	//   98  168:aload_3         
	//   99  169:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//  100  172:astore          4
				node1.parent = node3.parent;
	//  101  174:aload_3         
	//  102  175:aload           4
	//  103  177:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//  104  180:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
				stack = node1;
	//  105  183:aload_0         
	//  106  184:aload_3         
	//  107  185:putfield        #44  <Field LinkedHashTreeMap$Node stack>
				node1.left = node3;
	//  108  188:aload_3         
	//  109  189:aload           4
	//  110  191:putfield        #33  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.left>
				node1.right = node;
	//  111  194:aload_3         
	//  112  195:aload_1         
	//  113  196:putfield        #27  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
				node1.height = node.height + 1;
	//  114  199:aload_3         
	//  115  200:aload_1         
	//  116  201:getfield        #36  <Field int LinkedHashTreeMap$Node.height>
	//  117  204:iconst_1        
	//  118  205:iadd            
	//  119  206:putfield        #36  <Field int LinkedHashTreeMap$Node.height>
				node3.parent = node1;
	//  120  209:aload           4
	//  121  211:aload_3         
	//  122  212:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
				node.parent = node1;
	//  123  215:aload_1         
	//  124  216:aload_3         
	//  125  217:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
				continue;
	//  126  220:goto            287
			}
			if(leavesSkipped == 1)
	//* 127  223:aload_0         
	//* 128  224:getfield        #42  <Field int leavesSkipped>
	//* 129  227:iconst_1        
	//* 130  228:icmpne          274
			{
				node = stack;
	//  131  231:aload_0         
	//  132  232:getfield        #44  <Field LinkedHashTreeMap$Node stack>
	//  133  235:astore_1        
				LinkedHashTreeMap.Node node2 = node.parent;
	//  134  236:aload_1         
	//  135  237:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//  136  240:astore_3        
				stack = node2;
	//  137  241:aload_0         
	//  138  242:aload_3         
	//  139  243:putfield        #44  <Field LinkedHashTreeMap$Node stack>
				node2.right = node;
	//  140  246:aload_3         
	//  141  247:aload_1         
	//  142  248:putfield        #27  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
				node2.height = node.height + 1;
	//  143  251:aload_3         
	//  144  252:aload_1         
	//  145  253:getfield        #36  <Field int LinkedHashTreeMap$Node.height>
	//  146  256:iconst_1        
	//  147  257:iadd            
	//  148  258:putfield        #36  <Field int LinkedHashTreeMap$Node.height>
				node.parent = node2;
	//  149  261:aload_1         
	//  150  262:aload_3         
	//  151  263:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
				leavesSkipped = 0;
	//  152  266:aload_0         
	//  153  267:iconst_0        
	//  154  268:putfield        #42  <Field int leavesSkipped>
				continue;
	//  155  271:goto            287
			}
			if(leavesSkipped == 2)
	//* 156  274:aload_0         
	//* 157  275:getfield        #42  <Field int leavesSkipped>
	//* 158  278:iconst_2        
	//* 159  279:icmpne          287
				leavesSkipped = 0;
	//  160  282:aload_0         
	//  161  283:iconst_0        
	//  162  284:putfield        #42  <Field int leavesSkipped>
		}

	//  163  287:iload_2         
	//  164  288:iconst_2        
	//  165  289:imul            
	//  166  290:istore_2        
	//* 167  291:goto            137
	//  168  294:return          
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
