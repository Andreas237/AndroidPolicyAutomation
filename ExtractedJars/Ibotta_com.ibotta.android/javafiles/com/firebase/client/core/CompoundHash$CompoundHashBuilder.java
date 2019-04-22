// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.snapshot.ChildKey;
import com.firebase.client.snapshot.LeafNode;
import com.firebase.client.utilities.Utilities;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			CompoundHash, Path

static class CompoundHash$CompoundHashBuilder
{

	private void appendKey(StringBuilder stringbuilder, ChildKey childkey)
	{
		stringbuilder.append(Utilities.stringHashV2Representation(childkey.asString()));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #82  <Method String ChildKey.asString()>
	//    3    5:invokestatic    #88  <Method String Utilities.stringHashV2Representation(String)>
	//    4    8:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    5   11:pop             
	//    6   12:return          
	}

	private Path currentPath(int i)
	{
		ChildKey achildkey[] = new ChildKey[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ChildKey[]
	//    2    4:astore_3        
		for(int j = 0; j < i; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_1         
	//*   7    9:icmpge          33
			achildkey[j] = (ChildKey)currentPath.get(j);
	//    8   12:aload_3         
	//    9   13:iload_2         
	//   10   14:aload_0         
	//   11   15:getfield        #36  <Field Stack currentPath>
	//   12   18:iload_2         
	//   13   19:invokevirtual   #99  <Method Object Stack.get(int)>
	//   14   22:checkcast       #78  <Class ChildKey>
	//   15   25:aastore         

	//   16   26:iload_2         
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:istore_2        
	//*  20   30:goto            7
		return new Path(achildkey);
	//   21   33:new             #101 <Class Path>
	//   22   36:dup             
	//   23   37:aload_3         
	//   24   38:invokespecial   #104 <Method void Path(ChildKey[])>
	//   25   41:areturn         
	}

	private void endChild()
	{
		currentPathDepth = currentPathDepth - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #106 <Field int currentPathDepth>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #106 <Field int currentPathDepth>
		if(buildingRange())
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #110 <Method boolean buildingRange()>
	//*   8   14:ifeq            27
			optHashValueBuilder.append(")");
	//    9   17:aload_0         
	//   10   18:getfield        #31  <Field StringBuilder optHashValueBuilder>
	//   11   21:ldc1            #112 <String ")">
	//   12   23:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		needsComma = true;
	//   14   27:aload_0         
	//   15   28:iconst_1        
	//   16   29:putfield        #40  <Field boolean needsComma>
	//   17   32:return          
	}

	private void endRange()
	{
		Utilities.hardAssert(buildingRange(), "Can't end range without starting a range!");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method boolean buildingRange()>
	//    2    4:ldc1            #115 <String "Can't end range without starting a range!">
	//    3    6:invokestatic    #119 <Method void Utilities.hardAssert(boolean, String)>
		for(int i = 0; i < currentPathDepth; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_1        
	//*   6   11:iload_1         
	//*   7   12:aload_0         
	//*   8   13:getfield        #106 <Field int currentPathDepth>
	//*   9   16:icmpge          36
			optHashValueBuilder.append(")");
	//   10   19:aload_0         
	//   11   20:getfield        #31  <Field StringBuilder optHashValueBuilder>
	//   12   23:ldc1            #112 <String ")">
	//   13   25:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            11
		optHashValueBuilder.append(")");
	//   20   36:aload_0         
	//   21   37:getfield        #31  <Field StringBuilder optHashValueBuilder>
	//   22   40:ldc1            #112 <String ")">
	//   23   42:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		Path path = currentPath(lastLeafDepth);
	//   25   46:aload_0         
	//   26   47:aload_0         
	//   27   48:getfield        #38  <Field int lastLeafDepth>
	//   28   51:invokespecial   #121 <Method Path currentPath(int)>
	//   29   54:astore_2        
		String s = Utilities.sha1HexDigest(optHashValueBuilder.toString());
	//   30   55:aload_0         
	//   31   56:getfield        #31  <Field StringBuilder optHashValueBuilder>
	//   32   59:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   33   62:invokestatic    #127 <Method String Utilities.sha1HexDigest(String)>
	//   34   65:astore_3        
		currentHashes.add(((Object) (s)));
	//   35   66:aload_0         
	//   36   67:getfield        #47  <Field List currentHashes>
	//   37   70:aload_3         
	//   38   71:invokeinterface #133 <Method boolean List.add(Object)>
	//   39   76:pop             
		currentPaths.add(((Object) (path)));
	//   40   77:aload_0         
	//   41   78:getfield        #45  <Field List currentPaths>
	//   42   81:aload_2         
	//   43   82:invokeinterface #133 <Method boolean List.add(Object)>
	//   44   87:pop             
		optHashValueBuilder = null;
	//   45   88:aload_0         
	//   46   89:aconst_null     
	//   47   90:putfield        #31  <Field StringBuilder optHashValueBuilder>
	//   48   93:return          
	}

	private void ensureRange()
	{
		if(!buildingRange())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #110 <Method boolean buildingRange()>
	//*   2    4:ifne            86
		{
			optHashValueBuilder = new StringBuilder();
	//    3    7:aload_0         
	//    4    8:new             #90  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #135 <Method void StringBuilder()>
	//    7   15:putfield        #31  <Field StringBuilder optHashValueBuilder>
			optHashValueBuilder.append("(");
	//    8   18:aload_0         
	//    9   19:getfield        #31  <Field StringBuilder optHashValueBuilder>
	//   10   22:ldc1            #137 <String "(">
	//   11   24:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
			for(Iterator iterator = currentPath(currentPathDepth).iterator(); iterator.hasNext(); optHashValueBuilder.append(":("))
	//*  13   28:aload_0         
	//*  14   29:aload_0         
	//*  15   30:getfield        #106 <Field int currentPathDepth>
	//*  16   33:invokespecial   #121 <Method Path currentPath(int)>
	//*  17   36:invokevirtual   #141 <Method Iterator Path.iterator()>
	//*  18   39:astore_1        
	//*  19   40:aload_1         
	//*  20   41:invokeinterface #146 <Method boolean Iterator.hasNext()>
	//*  21   46:ifeq            81
			{
				ChildKey childkey = (ChildKey)iterator.next();
	//   22   49:aload_1         
	//   23   50:invokeinterface #150 <Method Object Iterator.next()>
	//   24   55:checkcast       #78  <Class ChildKey>
	//   25   58:astore_2        
				appendKey(optHashValueBuilder, childkey);
	//   26   59:aload_0         
	//   27   60:aload_0         
	//   28   61:getfield        #31  <Field StringBuilder optHashValueBuilder>
	//   29   64:aload_2         
	//   30   65:invokespecial   #152 <Method void appendKey(StringBuilder, ChildKey)>
			}

	//   31   68:aload_0         
	//   32   69:getfield        #31  <Field StringBuilder optHashValueBuilder>
	//   33   72:ldc1            #154 <String ":(">
	//   34   74:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   35   77:pop             
	//*  36   78:goto            40
			needsComma = false;
	//   37   81:aload_0         
	//   38   82:iconst_0        
	//   39   83:putfield        #40  <Field boolean needsComma>
		}
	//   40   86:return          
	}

	private void finishHashing()
	{
		boolean flag;
		if(currentPathDepth == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field int currentPathDepth>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		Utilities.hardAssert(flag, "Can't finish hashing in the middle processing a child");
	//    8   14:iload_1         
	//    9   15:ldc1            #156 <String "Can't finish hashing in the middle processing a child">
	//   10   17:invokestatic    #119 <Method void Utilities.hardAssert(boolean, String)>
		if(buildingRange())
	//*  11   20:aload_0         
	//*  12   21:invokevirtual   #110 <Method boolean buildingRange()>
	//*  13   24:ifeq            31
			endRange();
	//   14   27:aload_0         
	//   15   28:invokespecial   #158 <Method void endRange()>
		currentHashes.add("");
	//   16   31:aload_0         
	//   17   32:getfield        #47  <Field List currentHashes>
	//   18   35:ldc1            #160 <String "">
	//   19   37:invokeinterface #133 <Method boolean List.add(Object)>
	//   20   42:pop             
	//   21   43:return          
	}

	private void processLeaf(LeafNode leafnode)
	{
		ensureRange();
	//    0    0:aload_0         
	//    1    1:invokespecial   #162 <Method void ensureRange()>
		lastLeafDepth = currentPathDepth;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #106 <Field int currentPathDepth>
	//    5    9:putfield        #38  <Field int lastLeafDepth>
		optHashValueBuilder.append(leafnode.getHashRepresentation(com.firebase.client.snapshot.Node.HashVersion.V2));
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field StringBuilder optHashValueBuilder>
	//    8   16:aload_1         
	//    9   17:getstatic       #168 <Field com.firebase.client.snapshot.Node$HashVersion com.firebase.client.snapshot.Node$HashVersion.V2>
	//   10   20:invokevirtual   #174 <Method String LeafNode.getHashRepresentation(com.firebase.client.snapshot.Node$HashVersion)>
	//   11   23:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		needsComma = true;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #40  <Field boolean needsComma>
		if(splitStrategy.shouldSplit(this))
	//*  16   32:aload_0         
	//*  17   33:getfield        #49  <Field CompoundHash$SplitStrategy splitStrategy>
	//*  18   36:aload_0         
	//*  19   37:invokeinterface #180 <Method boolean CompoundHash$SplitStrategy.shouldSplit(CompoundHash$CompoundHashBuilder)>
	//*  20   42:ifeq            49
			endRange();
	//   21   45:aload_0         
	//   22   46:invokespecial   #158 <Method void endRange()>
	//   23   49:return          
	}

	private void startChild(ChildKey childkey)
	{
		ensureRange();
	//    0    0:aload_0         
	//    1    1:invokespecial   #162 <Method void ensureRange()>
		if(needsComma)
	//*   2    4:aload_0         
	//*   3    5:getfield        #40  <Field boolean needsComma>
	//*   4    8:ifeq            21
			optHashValueBuilder.append(",");
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field StringBuilder optHashValueBuilder>
	//    7   15:ldc1            #184 <String ",">
	//    8   17:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		appendKey(optHashValueBuilder, childkey);
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:getfield        #31  <Field StringBuilder optHashValueBuilder>
	//   13   26:aload_1         
	//   14   27:invokespecial   #152 <Method void appendKey(StringBuilder, ChildKey)>
		optHashValueBuilder.append(":(");
	//   15   30:aload_0         
	//   16   31:getfield        #31  <Field StringBuilder optHashValueBuilder>
	//   17   34:ldc1            #154 <String ":(">
	//   18   36:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		if(currentPathDepth == currentPath.size())
	//*  20   40:aload_0         
	//*  21   41:getfield        #106 <Field int currentPathDepth>
	//*  22   44:aload_0         
	//*  23   45:getfield        #36  <Field Stack currentPath>
	//*  24   48:invokevirtual   #188 <Method int Stack.size()>
	//*  25   51:icmpne          66
			currentPath.add(((Object) (childkey)));
	//   26   54:aload_0         
	//   27   55:getfield        #36  <Field Stack currentPath>
	//   28   58:aload_1         
	//   29   59:invokevirtual   #189 <Method boolean Stack.add(Object)>
	//   30   62:pop             
		else
	//*  31   63:goto            79
			currentPath.set(currentPathDepth, ((Object) (childkey)));
	//   32   66:aload_0         
	//   33   67:getfield        #36  <Field Stack currentPath>
	//   34   70:aload_0         
	//   35   71:getfield        #106 <Field int currentPathDepth>
	//   36   74:aload_1         
	//   37   75:invokevirtual   #193 <Method Object Stack.set(int, Object)>
	//   38   78:pop             
		currentPathDepth = currentPathDepth + 1;
	//   39   79:aload_0         
	//   40   80:aload_0         
	//   41   81:getfield        #106 <Field int currentPathDepth>
	//   42   84:iconst_1        
	//   43   85:iadd            
	//   44   86:putfield        #106 <Field int currentPathDepth>
		needsComma = false;
	//   45   89:aload_0         
	//   46   90:iconst_0        
	//   47   91:putfield        #40  <Field boolean needsComma>
	//   48   94:return          
	}

	public boolean buildingRange()
	{
		return optHashValueBuilder != null;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field StringBuilder optHashValueBuilder>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int currentHashLength()
	{
		return optHashValueBuilder.length();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field StringBuilder optHashValueBuilder>
	//    2    4:invokevirtual   #197 <Method int StringBuilder.length()>
	//    3    7:ireturn         
	}

	public Path currentPath()
	{
		return currentPath(currentPathDepth);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #106 <Field int currentPathDepth>
	//    3    5:invokespecial   #121 <Method Path currentPath(int)>
	//    4    8:areturn         
	}

	private final List currentHashes = new ArrayList();
	private Stack currentPath;
	private int currentPathDepth;
	private final List currentPaths = new ArrayList();
	private int lastLeafDepth;
	private boolean needsComma;
	private StringBuilder optHashValueBuilder;
	private final CompoundHash.SplitStrategy splitStrategy;


/*
	static void access$000(CompoundHash$CompoundHashBuilder compoundhash$compoundhashbuilder)
	{
		compoundhash$compoundhashbuilder.finishHashing();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void finishHashing()>
		return;
	//    2    4:return          
	}

*/


/*
	static List access$100(CompoundHash$CompoundHashBuilder compoundhash$compoundhashbuilder)
	{
		return compoundhash$compoundhashbuilder.currentPaths;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field List currentPaths>
	//    2    4:areturn         
	}

*/


/*
	static List access$200(CompoundHash$CompoundHashBuilder compoundhash$compoundhashbuilder)
	{
		return compoundhash$compoundhashbuilder.currentHashes;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List currentHashes>
	//    2    4:areturn         
	}

*/


/*
	static void access$300(CompoundHash$CompoundHashBuilder compoundhash$compoundhashbuilder, LeafNode leafnode)
	{
		compoundhash$compoundhashbuilder.processLeaf(leafnode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #64  <Method void processLeaf(LeafNode)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$400(CompoundHash$CompoundHashBuilder compoundhash$compoundhashbuilder, ChildKey childkey)
	{
		compoundhash$compoundhashbuilder.startChild(childkey);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void startChild(ChildKey)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$600(CompoundHash$CompoundHashBuilder compoundhash$compoundhashbuilder)
	{
		compoundhash$compoundhashbuilder.endChild();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void endChild()>
		return;
	//    2    4:return          
	}

*/

	public CompoundHash$CompoundHashBuilder(CompoundHash.SplitStrategy splitstrategy)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		optHashValueBuilder = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #31  <Field StringBuilder optHashValueBuilder>
		currentPath = new Stack();
	//    5    9:aload_0         
	//    6   10:new             #33  <Class Stack>
	//    7   13:dup             
	//    8   14:invokespecial   #34  <Method void Stack()>
	//    9   17:putfield        #36  <Field Stack currentPath>
		lastLeafDepth = -1;
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:putfield        #38  <Field int lastLeafDepth>
		needsComma = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #40  <Field boolean needsComma>
	//   16   30:aload_0         
	//   17   31:new             #42  <Class ArrayList>
	//   18   34:dup             
	//   19   35:invokespecial   #43  <Method void ArrayList()>
	//   20   38:putfield        #45  <Field List currentPaths>
	//   21   41:aload_0         
	//   22   42:new             #42  <Class ArrayList>
	//   23   45:dup             
	//   24   46:invokespecial   #43  <Method void ArrayList()>
	//   25   49:putfield        #47  <Field List currentHashes>
		splitStrategy = splitstrategy;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:putfield        #49  <Field CompoundHash$SplitStrategy splitStrategy>
	//   29   57:return          
	}
}
