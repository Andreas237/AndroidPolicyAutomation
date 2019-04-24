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
		int i = 4;
	//   77  135:iconst_4        
	//   78  136:istore_2        
		while((size & i - 1) == i - 1) 
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
	//*  91  155:ifne            227
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
			} else
	//* 126  220:iload_2         
	//* 127  221:iconst_2        
	//* 128  222:imul            
	//* 129  223:istore_2        
	//* 130  224:goto            137
			if(leavesSkipped == 1)
	//* 131  227:aload_0         
	//* 132  228:getfield        #42  <Field int leavesSkipped>
	//* 133  231:iconst_1        
	//* 134  232:icmpne          278
			{
				node = stack;
	//  135  235:aload_0         
	//  136  236:getfield        #44  <Field LinkedHashTreeMap$Node stack>
	//  137  239:astore_1        
				LinkedHashTreeMap.Node node2 = node.parent;
	//  138  240:aload_1         
	//  139  241:getfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
	//  140  244:astore_3        
				stack = node2;
	//  141  245:aload_0         
	//  142  246:aload_3         
	//  143  247:putfield        #44  <Field LinkedHashTreeMap$Node stack>
				node2.right = node;
	//  144  250:aload_3         
	//  145  251:aload_1         
	//  146  252:putfield        #27  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.right>
				node2.height = node.height + 1;
	//  147  255:aload_3         
	//  148  256:aload_1         
	//  149  257:getfield        #36  <Field int LinkedHashTreeMap$Node.height>
	//  150  260:iconst_1        
	//  151  261:iadd            
	//  152  262:putfield        #36  <Field int LinkedHashTreeMap$Node.height>
				node.parent = node2;
	//  153  265:aload_1         
	//  154  266:aload_3         
	//  155  267:putfield        #30  <Field LinkedHashTreeMap$Node LinkedHashTreeMap$Node.parent>
				leavesSkipped = 0;
	//  156  270:aload_0         
	//  157  271:iconst_0        
	//  158  272:putfield        #42  <Field int leavesSkipped>
			} else
	//* 159  275:goto            220
			if(leavesSkipped == 2)
	//* 160  278:aload_0         
	//* 161  279:getfield        #42  <Field int leavesSkipped>
	//* 162  282:iconst_2        
	//* 163  283:icmpne          220
				leavesSkipped = 0;
	//  164  286:aload_0         
	//  165  287:iconst_0        
	//  166  288:putfield        #42  <Field int leavesSkipped>
			i *= 2;
		}
	//* 167  291:goto            220
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
