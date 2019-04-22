// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.utilities.Predicate;
import com.firebase.client.core.view.CacheNode;
import com.firebase.client.snapshot.*;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			CompoundWrite, UserWriteRecord, Path, WriteTreeRef

public class WriteTree
{

	public WriteTree()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		visibleWrites = CompoundWrite.emptyWrite();
	//    2    4:aload_0         
	//    3    5:invokestatic    #36  <Method CompoundWrite CompoundWrite.emptyWrite()>
	//    4    8:putfield        #38  <Field CompoundWrite visibleWrites>
		allWrites = ((List) (new ArrayList()));
	//    5   11:aload_0         
	//    6   12:new             #40  <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #41  <Method void ArrayList()>
	//    9   19:putfield        #43  <Field List allWrites>
		lastWriteId = Long.valueOf(-1L);
	//   10   22:aload_0         
	//   11   23:ldc2w           #44  <Long -1L>
	//   12   26:invokestatic    #51  <Method Long Long.valueOf(long)>
	//   13   29:putfield        #53  <Field Long lastWriteId>
	//   14   32:return          
	}

	private static CompoundWrite layerTree(List list, Predicate predicate, Path path)
	{
		CompoundWrite compoundwrite = CompoundWrite.emptyWrite();
	//    0    0:invokestatic    #36  <Method CompoundWrite CompoundWrite.emptyWrite()>
	//    1    3:astore_3        
		Iterator iterator = list.iterator();
	//    2    4:aload_0         
	//    3    5:invokeinterface #61  <Method Iterator List.iterator()>
	//    4   10:astore          4
		list = ((List) (compoundwrite));
	//    5   12:aload_3         
	//    6   13:astore_0        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   14:aload           4
	//    8   16:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            213
			Object obj = ((Object) ((UserWriteRecord)iterator.next()));
	//   10   24:aload           4
	//   11   26:invokeinterface #71  <Method Object Iterator.next()>
	//   12   31:checkcast       #73  <Class UserWriteRecord>
	//   13   34:astore_3        
			if(predicate.evaluate(obj))
	//*  14   35:aload_1         
	//*  15   36:aload_3         
	//*  16   37:invokeinterface #79  <Method boolean Predicate.evaluate(Object)>
	//*  17   42:ifeq            14
			{
				Path path1 = ((UserWriteRecord) (obj)).getPath();
	//   18   45:aload_3         
	//   19   46:invokevirtual   #83  <Method Path UserWriteRecord.getPath()>
	//   20   49:astore          5
				if(((UserWriteRecord) (obj)).isOverwrite())
	//*  21   51:aload_3         
	//*  22   52:invokevirtual   #86  <Method boolean UserWriteRecord.isOverwrite()>
	//*  23   55:ifeq            120
				{
					if(path.contains(path1))
	//*  24   58:aload_2         
	//*  25   59:aload           5
	//*  26   61:invokevirtual   #92  <Method boolean Path.contains(Path)>
	//*  27   64:ifeq            85
						list = ((List) (((CompoundWrite) (list)).addWrite(Path.getRelative(path, path1), ((UserWriteRecord) (obj)).getOverwrite())));
	//   28   67:aload_0         
	//   29   68:aload_2         
	//   30   69:aload           5
	//   31   71:invokestatic    #96  <Method Path Path.getRelative(Path, Path)>
	//   32   74:aload_3         
	//   33   75:invokevirtual   #100 <Method Node UserWriteRecord.getOverwrite()>
	//   34   78:invokevirtual   #104 <Method CompoundWrite CompoundWrite.addWrite(Path, Node)>
	//   35   81:astore_0        
					else
	//*  36   82:goto            14
					if(path1.contains(path))
	//*  37   85:aload           5
	//*  38   87:aload_2         
	//*  39   88:invokevirtual   #92  <Method boolean Path.contains(Path)>
	//*  40   91:ifeq            14
						list = ((List) (((CompoundWrite) (list)).addWrite(Path.getEmptyPath(), ((UserWriteRecord) (obj)).getOverwrite().getChild(Path.getRelative(path1, path)))));
	//   41   94:aload_0         
	//   42   95:invokestatic    #107 <Method Path Path.getEmptyPath()>
	//   43   98:aload_3         
	//   44   99:invokevirtual   #100 <Method Node UserWriteRecord.getOverwrite()>
	//   45  102:aload           5
	//   46  104:aload_2         
	//   47  105:invokestatic    #96  <Method Path Path.getRelative(Path, Path)>
	//   48  108:invokeinterface #113 <Method Node Node.getChild(Path)>
	//   49  113:invokevirtual   #104 <Method CompoundWrite CompoundWrite.addWrite(Path, Node)>
	//   50  116:astore_0        
				} else
	//*  51  117:goto            14
				if(path.contains(path1))
	//*  52  120:aload_2         
	//*  53  121:aload           5
	//*  54  123:invokevirtual   #92  <Method boolean Path.contains(Path)>
	//*  55  126:ifeq            147
					list = ((List) (((CompoundWrite) (list)).addWrites(Path.getRelative(path, path1), ((UserWriteRecord) (obj)).getMerge())));
	//   56  129:aload_0         
	//   57  130:aload_2         
	//   58  131:aload           5
	//   59  133:invokestatic    #96  <Method Path Path.getRelative(Path, Path)>
	//   60  136:aload_3         
	//   61  137:invokevirtual   #116 <Method CompoundWrite UserWriteRecord.getMerge()>
	//   62  140:invokevirtual   #120 <Method CompoundWrite CompoundWrite.addWrites(Path, CompoundWrite)>
	//   63  143:astore_0        
				else
	//*  64  144:goto            14
				if(path1.contains(path))
	//*  65  147:aload           5
	//*  66  149:aload_2         
	//*  67  150:invokevirtual   #92  <Method boolean Path.contains(Path)>
	//*  68  153:ifeq            14
				{
					path1 = Path.getRelative(path1, path);
	//   69  156:aload           5
	//   70  158:aload_2         
	//   71  159:invokestatic    #96  <Method Path Path.getRelative(Path, Path)>
	//   72  162:astore          5
					if(path1.isEmpty())
	//*  73  164:aload           5
	//*  74  166:invokevirtual   #123 <Method boolean Path.isEmpty()>
	//*  75  169:ifeq            187
					{
						list = ((List) (((CompoundWrite) (list)).addWrites(Path.getEmptyPath(), ((UserWriteRecord) (obj)).getMerge())));
	//   76  172:aload_0         
	//   77  173:invokestatic    #107 <Method Path Path.getEmptyPath()>
	//   78  176:aload_3         
	//   79  177:invokevirtual   #116 <Method CompoundWrite UserWriteRecord.getMerge()>
	//   80  180:invokevirtual   #120 <Method CompoundWrite CompoundWrite.addWrites(Path, CompoundWrite)>
	//   81  183:astore_0        
					} else
	//*  82  184:goto            14
					{
						obj = ((Object) (((UserWriteRecord) (obj)).getMerge().getCompleteNode(path1)));
	//   83  187:aload_3         
	//   84  188:invokevirtual   #116 <Method CompoundWrite UserWriteRecord.getMerge()>
	//   85  191:aload           5
	//   86  193:invokevirtual   #126 <Method Node CompoundWrite.getCompleteNode(Path)>
	//   87  196:astore_3        
						if(obj != null)
	//*  88  197:aload_3         
	//*  89  198:ifnull          14
							list = ((List) (((CompoundWrite) (list)).addWrite(Path.getEmptyPath(), ((Node) (obj)))));
	//   90  201:aload_0         
	//   91  202:invokestatic    #107 <Method Path Path.getEmptyPath()>
	//   92  205:aload_3         
	//   93  206:invokevirtual   #104 <Method CompoundWrite CompoundWrite.addWrite(Path, Node)>
	//   94  209:astore_0        
					}
				}
			}
		} while(true);
	//   95  210:goto            14
		return ((CompoundWrite) (list));
	//   96  213:aload_0         
	//   97  214:areturn         
	}

	private boolean recordContainsPath(UserWriteRecord userwriterecord, Path path)
	{
		if(userwriterecord.isOverwrite())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #86  <Method boolean UserWriteRecord.isOverwrite()>
	//*   2    4:ifeq            16
			return userwriterecord.getPath().contains(path);
	//    3    7:aload_1         
	//    4    8:invokevirtual   #83  <Method Path UserWriteRecord.getPath()>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #92  <Method boolean Path.contains(Path)>
	//    7   15:ireturn         
		for(Iterator iterator = userwriterecord.getMerge().iterator(); iterator.hasNext();)
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #116 <Method CompoundWrite UserWriteRecord.getMerge()>
	//*  10   20:invokevirtual   #131 <Method Iterator CompoundWrite.iterator()>
	//*  11   23:astore_3        
	//*  12   24:aload_3         
	//*  13   25:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  14   30:ifeq            70
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   15   33:aload_3         
	//   16   34:invokeinterface #71  <Method Object Iterator.next()>
	//   17   39:checkcast       #133 <Class java.util.Map$Entry>
	//   18   42:astore          4
			if(userwriterecord.getPath().child((Path)entry.getKey()).contains(path))
	//*  19   44:aload_1         
	//*  20   45:invokevirtual   #83  <Method Path UserWriteRecord.getPath()>
	//*  21   48:aload           4
	//*  22   50:invokeinterface #136 <Method Object java.util.Map$Entry.getKey()>
	//*  23   55:checkcast       #88  <Class Path>
	//*  24   58:invokevirtual   #140 <Method Path Path.child(Path)>
	//*  25   61:aload_2         
	//*  26   62:invokevirtual   #92  <Method boolean Path.contains(Path)>
	//*  27   65:ifeq            24
				return true;
	//   28   68:iconst_1        
	//   29   69:ireturn         
		}

		return false;
	//   30   70:iconst_0        
	//   31   71:ireturn         
	}

	private void resetTree()
	{
		visibleWrites = layerTree(allWrites, DEFAULT_FILTER, Path.getEmptyPath());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field List allWrites>
	//    3    5:getstatic       #28  <Field Predicate DEFAULT_FILTER>
	//    4    8:invokestatic    #107 <Method Path Path.getEmptyPath()>
	//    5   11:invokestatic    #143 <Method CompoundWrite layerTree(List, Predicate, Path)>
	//    6   14:putfield        #38  <Field CompoundWrite visibleWrites>
		if(allWrites.size() > 0)
	//*   7   17:aload_0         
	//*   8   18:getfield        #43  <Field List allWrites>
	//*   9   21:invokeinterface #147 <Method int List.size()>
	//*  10   26:ifle            62
		{
			List list = allWrites;
	//   11   29:aload_0         
	//   12   30:getfield        #43  <Field List allWrites>
	//   13   33:astore_1        
			lastWriteId = Long.valueOf(((UserWriteRecord)list.get(list.size() - 1)).getWriteId());
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:aload_1         
	//   17   37:invokeinterface #147 <Method int List.size()>
	//   18   42:iconst_1        
	//   19   43:isub            
	//   20   44:invokeinterface #151 <Method Object List.get(int)>
	//   21   49:checkcast       #73  <Class UserWriteRecord>
	//   22   52:invokevirtual   #155 <Method long UserWriteRecord.getWriteId()>
	//   23   55:invokestatic    #51  <Method Long Long.valueOf(long)>
	//   24   58:putfield        #53  <Field Long lastWriteId>
			return;
	//   25   61:return          
		} else
		{
			lastWriteId = Long.valueOf(-1L);
	//   26   62:aload_0         
	//   27   63:ldc2w           #44  <Long -1L>
	//   28   66:invokestatic    #51  <Method Long Long.valueOf(long)>
	//   29   69:putfield        #53  <Field Long lastWriteId>
			return;
	//   30   72:return          
		}
	}

	public void addMerge(Path path, CompoundWrite compoundwrite, Long long1)
	{
		allWrites.add(((Object) (new UserWriteRecord(long1.longValue(), path, compoundwrite))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List allWrites>
	//    2    4:new             #73  <Class UserWriteRecord>
	//    3    7:dup             
	//    4    8:aload_3         
	//    5    9:invokevirtual   #160 <Method long Long.longValue()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #163 <Method void UserWriteRecord(long, Path, CompoundWrite)>
	//    9   17:invokeinterface #166 <Method boolean List.add(Object)>
	//   10   22:pop             
		visibleWrites = visibleWrites.addWrites(path, compoundwrite);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #38  <Field CompoundWrite visibleWrites>
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokevirtual   #120 <Method CompoundWrite CompoundWrite.addWrites(Path, CompoundWrite)>
	//   17   33:putfield        #38  <Field CompoundWrite visibleWrites>
		lastWriteId = long1;
	//   18   36:aload_0         
	//   19   37:aload_3         
	//   20   38:putfield        #53  <Field Long lastWriteId>
	//   21   41:return          
	}

	public void addOverwrite(Path path, Node node, Long long1, boolean flag)
	{
		allWrites.add(((Object) (new UserWriteRecord(long1.longValue(), path, node, flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List allWrites>
	//    2    4:new             #73  <Class UserWriteRecord>
	//    3    7:dup             
	//    4    8:aload_3         
	//    5    9:invokevirtual   #160 <Method long Long.longValue()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:iload           4
	//    9   16:invokespecial   #171 <Method void UserWriteRecord(long, Path, Node, boolean)>
	//   10   19:invokeinterface #166 <Method boolean List.add(Object)>
	//   11   24:pop             
		if(flag)
	//*  12   25:iload           4
	//*  13   27:ifeq            43
			visibleWrites = visibleWrites.addWrite(path, node);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #38  <Field CompoundWrite visibleWrites>
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #104 <Method CompoundWrite CompoundWrite.addWrite(Path, Node)>
	//   20   40:putfield        #38  <Field CompoundWrite visibleWrites>
		lastWriteId = long1;
	//   21   43:aload_0         
	//   22   44:aload_3         
	//   23   45:putfield        #53  <Field Long lastWriteId>
	//   24   48:return          
	}

	public Node calcCompleteChild(Path path, ChildKey childkey, CacheNode cachenode)
	{
		path = path.child(childkey);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #176 <Method Path Path.child(ChildKey)>
	//    3    5:astore_1        
		Node node = visibleWrites.getCompleteNode(path);
	//    4    6:aload_0         
	//    5    7:getfield        #38  <Field CompoundWrite visibleWrites>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #126 <Method Node CompoundWrite.getCompleteNode(Path)>
	//    8   14:astore          4
		if(node != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          24
			return node;
	//   11   21:aload           4
	//   12   23:areturn         
		if(cachenode.isCompleteForChild(childkey))
	//*  13   24:aload_3         
	//*  14   25:aload_2         
	//*  15   26:invokevirtual   #182 <Method boolean CacheNode.isCompleteForChild(ChildKey)>
	//*  16   29:ifeq            54
			return visibleWrites.childCompoundWrite(path).apply(cachenode.getNode().getImmediateChild(childkey));
	//   17   32:aload_0         
	//   18   33:getfield        #38  <Field CompoundWrite visibleWrites>
	//   19   36:aload_1         
	//   20   37:invokevirtual   #186 <Method CompoundWrite CompoundWrite.childCompoundWrite(Path)>
	//   21   40:aload_3         
	//   22   41:invokevirtual   #189 <Method Node CacheNode.getNode()>
	//   23   44:aload_2         
	//   24   45:invokeinterface #193 <Method Node Node.getImmediateChild(ChildKey)>
	//   25   50:invokevirtual   #197 <Method Node CompoundWrite.apply(Node)>
	//   26   53:areturn         
		else
			return null;
	//   27   54:aconst_null     
	//   28   55:areturn         
	}

	public Node calcCompleteEventCache(Path path, Node node)
	{
		return calcCompleteEventCache(path, node, ((List) (new ArrayList())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #40  <Class ArrayList>
	//    4    6:dup             
	//    5    7:invokespecial   #41  <Method void ArrayList()>
	//    6   10:invokevirtual   #202 <Method Node calcCompleteEventCache(Path, Node, List)>
	//    7   13:areturn         
	}

	public Node calcCompleteEventCache(Path path, Node node, List list)
	{
		return calcCompleteEventCache(path, node, list, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #205 <Method Node calcCompleteEventCache(Path, Node, List, boolean)>
	//    6    8:areturn         
	}

	public Node calcCompleteEventCache(final Path treePath, Node node, final List writeIdsToExclude, final boolean includeHiddenWrites)
	{
		if(writeIdsToExclude.isEmpty() && !includeHiddenWrites)
	//*   0    0:aload_3         
	//*   1    1:invokeinterface #207 <Method boolean List.isEmpty()>
	//*   2    6:ifeq            80
	//*   3    9:iload           4
	//*   4   11:ifne            80
		{
			writeIdsToExclude = ((List) (visibleWrites.getCompleteNode(treePath)));
	//    5   14:aload_0         
	//    6   15:getfield        #38  <Field CompoundWrite visibleWrites>
	//    7   18:aload_1         
	//    8   19:invokevirtual   #126 <Method Node CompoundWrite.getCompleteNode(Path)>
	//    9   22:astore_3        
			if(writeIdsToExclude != null)
	//*  10   23:aload_3         
	//*  11   24:ifnull          29
				return ((Node) (writeIdsToExclude));
	//   12   27:aload_3         
	//   13   28:areturn         
			treePath = ((Path) (visibleWrites.childCompoundWrite(treePath)));
	//   14   29:aload_0         
	//   15   30:getfield        #38  <Field CompoundWrite visibleWrites>
	//   16   33:aload_1         
	//   17   34:invokevirtual   #186 <Method CompoundWrite CompoundWrite.childCompoundWrite(Path)>
	//   18   37:astore_1        
			if(((CompoundWrite) (treePath)).isEmpty())
	//*  19   38:aload_1         
	//*  20   39:invokevirtual   #208 <Method boolean CompoundWrite.isEmpty()>
	//*  21   42:ifeq            47
				return node;
	//   22   45:aload_2         
	//   23   46:areturn         
			if(node == null && !((CompoundWrite) (treePath)).hasCompleteWrite(Path.getEmptyPath()))
	//*  24   47:aload_2         
	//*  25   48:ifnonnull       63
	//*  26   51:aload_1         
	//*  27   52:invokestatic    #107 <Method Path Path.getEmptyPath()>
	//*  28   55:invokevirtual   #211 <Method boolean CompoundWrite.hasCompleteWrite(Path)>
	//*  29   58:ifne            63
				return null;
	//   30   61:aconst_null     
	//   31   62:areturn         
			if(node == null)
	//*  32   63:aload_2         
	//*  33   64:ifnull          70
	//*  34   67:goto            74
				node = ((Node) (EmptyNode.Empty()));
	//   35   70:invokestatic    #217 <Method EmptyNode EmptyNode.Empty()>
	//   36   73:astore_2        
			return ((CompoundWrite) (treePath)).apply(node);
	//   37   74:aload_1         
	//   38   75:aload_2         
	//   39   76:invokevirtual   #197 <Method Node CompoundWrite.apply(Node)>
	//   40   79:areturn         
		}
		CompoundWrite compoundwrite = visibleWrites.childCompoundWrite(treePath);
	//   41   80:aload_0         
	//   42   81:getfield        #38  <Field CompoundWrite visibleWrites>
	//   43   84:aload_1         
	//   44   85:invokevirtual   #186 <Method CompoundWrite CompoundWrite.childCompoundWrite(Path)>
	//   45   88:astore          5
		if(!includeHiddenWrites && compoundwrite.isEmpty())
	//*  46   90:iload           4
	//*  47   92:ifne            105
	//*  48   95:aload           5
	//*  49   97:invokevirtual   #208 <Method boolean CompoundWrite.isEmpty()>
	//*  50  100:ifeq            105
			return node;
	//   51  103:aload_2         
	//   52  104:areturn         
		if(!includeHiddenWrites && node == null && !compoundwrite.hasCompleteWrite(Path.getEmptyPath()))
	//*  53  105:iload           4
	//*  54  107:ifne            127
	//*  55  110:aload_2         
	//*  56  111:ifnonnull       127
	//*  57  114:aload           5
	//*  58  116:invokestatic    #107 <Method Path Path.getEmptyPath()>
	//*  59  119:invokevirtual   #211 <Method boolean CompoundWrite.hasCompleteWrite(Path)>
	//*  60  122:ifne            127
			return null;
	//   61  125:aconst_null     
	//   62  126:areturn         
		writeIdsToExclude = ((List) (new Predicate() {

			public boolean evaluate(UserWriteRecord userwriterecord)
			{
				return (userwriterecord.isVisible() || includeHiddenWrites) && !writeIdsToExclude.contains(((Object) (Long.valueOf(userwriterecord.getWriteId())))) && (userwriterecord.getPath().contains(treePath) || treePath.contains(userwriterecord.getPath()));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #42  <Method boolean UserWriteRecord.isVisible()>
			//    2    4:ifne            14
			//    3    7:aload_0         
			//    4    8:getfield        #26  <Field boolean val$includeHiddenWrites>
			//    5   11:ifeq            63
			//    6   14:aload_0         
			//    7   15:getfield        #28  <Field List val$writeIdsToExclude>
			//    8   18:aload_1         
			//    9   19:invokevirtual   #46  <Method long UserWriteRecord.getWriteId()>
			//   10   22:invokestatic    #52  <Method Long Long.valueOf(long)>
			//   11   25:invokeinterface #58  <Method boolean List.contains(Object)>
			//   12   30:ifne            63
			//   13   33:aload_1         
			//   14   34:invokevirtual   #62  <Method Path UserWriteRecord.getPath()>
			//   15   37:aload_0         
			//   16   38:getfield        #30  <Field Path val$treePath>
			//   17   41:invokevirtual   #67  <Method boolean Path.contains(Path)>
			//   18   44:ifne            61
			//   19   47:aload_0         
			//   20   48:getfield        #30  <Field Path val$treePath>
			//   21   51:aload_1         
			//   22   52:invokevirtual   #62  <Method Path UserWriteRecord.getPath()>
			//   23   55:invokevirtual   #67  <Method boolean Path.contains(Path)>
			//   24   58:ifeq            63
			//   25   61:iconst_1        
			//   26   62:ireturn         
			//   27   63:iconst_0        
			//   28   64:ireturn         
			}

			public volatile boolean evaluate(Object obj)
			{
				return evaluate((UserWriteRecord)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #38  <Class UserWriteRecord>
			//    3    5:invokevirtual   #69  <Method boolean evaluate(UserWriteRecord)>
			//    4    8:ireturn         
			}

			final WriteTree this$0;
			final boolean val$includeHiddenWrites;
			final Path val$treePath;
			final List val$writeIdsToExclude;

			
			{
				this$0 = WriteTree.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field WriteTree this$0>
				includeHiddenWrites = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #26  <Field boolean val$includeHiddenWrites>
				writeIdsToExclude = list;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field List val$writeIdsToExclude>
				treePath = path;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field Path val$treePath>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #33  <Method void Object()>
			//   14   25:return          
			}
		}
));
	//   63  127:new             #6   <Class WriteTree$1>
	//   64  130:dup             
	//   65  131:aload_0         
	//   66  132:iload           4
	//   67  134:aload_3         
	//   68  135:aload_1         
	//   69  136:invokespecial   #220 <Method void WriteTree$1(WriteTree, boolean, List, Path)>
	//   70  139:astore_3        
		treePath = ((Path) (layerTree(allWrites, ((Predicate) (writeIdsToExclude)), treePath)));
	//   71  140:aload_0         
	//   72  141:getfield        #43  <Field List allWrites>
	//   73  144:aload_3         
	//   74  145:aload_1         
	//   75  146:invokestatic    #143 <Method CompoundWrite layerTree(List, Predicate, Path)>
	//   76  149:astore_1        
		if(node == null)
	//*  77  150:aload_2         
	//*  78  151:ifnull          157
	//*  79  154:goto            161
			node = ((Node) (EmptyNode.Empty()));
	//   80  157:invokestatic    #217 <Method EmptyNode EmptyNode.Empty()>
	//   81  160:astore_2        
		return ((CompoundWrite) (treePath)).apply(node);
	//   82  161:aload_1         
	//   83  162:aload_2         
	//   84  163:invokevirtual   #197 <Method Node CompoundWrite.apply(Node)>
	//   85  166:areturn         
	}

	public Node calcCompleteEventChildren(Path path, Node node)
	{
		Object obj = ((Object) (EmptyNode.Empty()));
	//    0    0:invokestatic    #217 <Method EmptyNode EmptyNode.Empty()>
	//    1    3:astore_3        
		Node node1 = visibleWrites.getCompleteNode(path);
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field CompoundWrite visibleWrites>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #126 <Method Node CompoundWrite.getCompleteNode(Path)>
	//    6   12:astore          4
		if(node1 != null)
	//*   7   14:aload           4
	//*   8   16:ifnull          80
		{
			path = ((Path) (obj));
	//    9   19:aload_3         
	//   10   20:astore_1        
			if(!node1.isLeafNode())
	//*  11   21:aload           4
	//*  12   23:invokeinterface #225 <Method boolean Node.isLeafNode()>
	//*  13   28:ifne            78
			{
				node = ((Node) (node1.iterator()));
	//   14   31:aload           4
	//   15   33:invokeinterface #226 <Method Iterator Node.iterator()>
	//   16   38:astore_2        
				do
				{
					path = ((Path) (obj));
	//   17   39:aload_3         
	//   18   40:astore_1        
					if(!((Iterator) (node)).hasNext())
						break;
	//   19   41:aload_2         
	//   20   42:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   21   47:ifeq            78
					path = ((Path) ((NamedNode)((Iterator) (node)).next()));
	//   22   50:aload_2         
	//   23   51:invokeinterface #71  <Method Object Iterator.next()>
	//   24   56:checkcast       #228 <Class NamedNode>
	//   25   59:astore_1        
					obj = ((Object) (((Node) (obj)).updateImmediateChild(((NamedNode) (path)).getName(), ((NamedNode) (path)).getNode())));
	//   26   60:aload_3         
	//   27   61:aload_1         
	//   28   62:invokevirtual   #232 <Method ChildKey NamedNode.getName()>
	//   29   65:aload_1         
	//   30   66:invokevirtual   #233 <Method Node NamedNode.getNode()>
	//   31   69:invokeinterface #237 <Method Node Node.updateImmediateChild(ChildKey, Node)>
	//   32   74:astore_3        
				} while(true);
	//   33   75:goto            39
			}
			return ((Node) (path));
	//   34   78:aload_1         
	//   35   79:areturn         
		}
		path = ((Path) (visibleWrites.childCompoundWrite(path)));
	//   36   80:aload_0         
	//   37   81:getfield        #38  <Field CompoundWrite visibleWrites>
	//   38   84:aload_1         
	//   39   85:invokevirtual   #186 <Method CompoundWrite CompoundWrite.childCompoundWrite(Path)>
	//   40   88:astore_1        
		for(node = ((Node) (node.iterator())); ((Iterator) (node)).hasNext();)
	//*  41   89:aload_2         
	//*  42   90:invokeinterface #226 <Method Iterator Node.iterator()>
	//*  43   95:astore_2        
	//*  44   96:aload_2         
	//*  45   97:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  46  102:ifeq            166
		{
			NamedNode namednode = (NamedNode)((Iterator) (node)).next();
	//   47  105:aload_2         
	//   48  106:invokeinterface #71  <Method Object Iterator.next()>
	//   49  111:checkcast       #228 <Class NamedNode>
	//   50  114:astore          4
			Node node2 = ((CompoundWrite) (path)).childCompoundWrite(new Path(new ChildKey[] {
				namednode.getName()
			})).apply(namednode.getNode());
	//   51  116:aload_1         
	//   52  117:new             #88  <Class Path>
	//   53  120:dup             
	//   54  121:iconst_1        
	//   55  122:anewarray       ChildKey[]
	//   56  125:dup             
	//   57  126:iconst_0        
	//   58  127:aload           4
	//   59  129:invokevirtual   #232 <Method ChildKey NamedNode.getName()>
	//   60  132:aastore         
	//   61  133:invokespecial   #242 <Method void Path(ChildKey[])>
	//   62  136:invokevirtual   #186 <Method CompoundWrite CompoundWrite.childCompoundWrite(Path)>
	//   63  139:aload           4
	//   64  141:invokevirtual   #233 <Method Node NamedNode.getNode()>
	//   65  144:invokevirtual   #197 <Method Node CompoundWrite.apply(Node)>
	//   66  147:astore          5
			obj = ((Object) (((Node) (obj)).updateImmediateChild(namednode.getName(), node2)));
	//   67  149:aload_3         
	//   68  150:aload           4
	//   69  152:invokevirtual   #232 <Method ChildKey NamedNode.getName()>
	//   70  155:aload           5
	//   71  157:invokeinterface #237 <Method Node Node.updateImmediateChild(ChildKey, Node)>
	//   72  162:astore_3        
		}

	//*  73  163:goto            96
		for(path = ((Path) (((CompoundWrite) (path)).getCompleteChildren().iterator())); ((Iterator) (path)).hasNext();)
	//*  74  166:aload_1         
	//*  75  167:invokevirtual   #246 <Method List CompoundWrite.getCompleteChildren()>
	//*  76  170:invokeinterface #61  <Method Iterator List.iterator()>
	//*  77  175:astore_1        
	//*  78  176:aload_1         
	//*  79  177:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  80  182:ifeq            213
		{
			node = ((Node) ((NamedNode)((Iterator) (path)).next()));
	//   81  185:aload_1         
	//   82  186:invokeinterface #71  <Method Object Iterator.next()>
	//   83  191:checkcast       #228 <Class NamedNode>
	//   84  194:astore_2        
			obj = ((Object) (((Node) (obj)).updateImmediateChild(((NamedNode) (node)).getName(), ((NamedNode) (node)).getNode())));
	//   85  195:aload_3         
	//   86  196:aload_2         
	//   87  197:invokevirtual   #232 <Method ChildKey NamedNode.getName()>
	//   88  200:aload_2         
	//   89  201:invokevirtual   #233 <Method Node NamedNode.getNode()>
	//   90  204:invokeinterface #237 <Method Node Node.updateImmediateChild(ChildKey, Node)>
	//   91  209:astore_3        
		}

	//*  92  210:goto            176
		return ((Node) (obj));
	//   93  213:aload_3         
	//   94  214:areturn         
	}

	public Node calcEventCacheAfterServerOverwrite(Path path, Path path1, Node node, Node node1)
	{
		path = path.child(path1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #140 <Method Path Path.child(Path)>
	//    3    5:astore_1        
		if(visibleWrites.hasCompleteWrite(path))
	//*   4    6:aload_0         
	//*   5    7:getfield        #38  <Field CompoundWrite visibleWrites>
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #211 <Method boolean CompoundWrite.hasCompleteWrite(Path)>
	//*   8   14:ifeq            19
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		path = ((Path) (visibleWrites.childCompoundWrite(path)));
	//   11   19:aload_0         
	//   12   20:getfield        #38  <Field CompoundWrite visibleWrites>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #186 <Method CompoundWrite CompoundWrite.childCompoundWrite(Path)>
	//   15   27:astore_1        
		if(((CompoundWrite) (path)).isEmpty())
	//*  16   28:aload_1         
	//*  17   29:invokevirtual   #208 <Method boolean CompoundWrite.isEmpty()>
	//*  18   32:ifeq            44
			return node1.getChild(path1);
	//   19   35:aload           4
	//   20   37:aload_2         
	//   21   38:invokeinterface #113 <Method Node Node.getChild(Path)>
	//   22   43:areturn         
		else
			return ((CompoundWrite) (path)).apply(node1.getChild(path1));
	//   23   44:aload_1         
	//   24   45:aload           4
	//   25   47:aload_2         
	//   26   48:invokeinterface #113 <Method Node Node.getChild(Path)>
	//   27   53:invokevirtual   #197 <Method Node CompoundWrite.apply(Node)>
	//   28   56:areturn         
	}

	public NamedNode calcNextNodeAfterPost(Path path, Node node, NamedNode namednode, boolean flag, Index index)
	{
label0:
		{
			Object obj1 = ((Object) (visibleWrites.childCompoundWrite(path)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field CompoundWrite visibleWrites>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #186 <Method CompoundWrite CompoundWrite.childCompoundWrite(Path)>
	//    4    8:astore          7
			path = ((Path) (((CompoundWrite) (obj1)).getCompleteNode(Path.getEmptyPath())));
	//    5   10:aload           7
	//    6   12:invokestatic    #107 <Method Path Path.getEmptyPath()>
	//    7   15:invokevirtual   #126 <Method Node CompoundWrite.getCompleteNode(Path)>
	//    8   18:astore_1        
			Object obj = null;
	//    9   19:aconst_null     
	//   10   20:astore          6
			if(path == null)
	//*  11   22:aload_1         
	//*  12   23:ifnull          29
	//*  13   26:goto            40
			{
				if(node == null)
					break label0;
	//   14   29:aload_2         
	//   15   30:ifnull          107
				path = ((Path) (((CompoundWrite) (obj1)).apply(node)));
	//   16   33:aload           7
	//   17   35:aload_2         
	//   18   36:invokevirtual   #197 <Method Node CompoundWrite.apply(Node)>
	//   19   39:astore_1        
			}
			obj1 = ((Object) (((Node) (path)).iterator()));
	//   20   40:aload_1         
	//   21   41:invokeinterface #226 <Method Iterator Node.iterator()>
	//   22   46:astore          7
			path = ((Path) (obj));
	//   23   48:aload           6
	//   24   50:astore_1        
			do
			{
				if(!((Iterator) (obj1)).hasNext())
					break;
	//   25   51:aload           7
	//   26   53:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   27   58:ifeq            105
				node = ((Node) ((NamedNode)((Iterator) (obj1)).next()));
	//   28   61:aload           7
	//   29   63:invokeinterface #71  <Method Object Iterator.next()>
	//   30   68:checkcast       #228 <Class NamedNode>
	//   31   71:astore_2        
				if(index.compare(((NamedNode) (node)), namednode, flag) > 0 && (path == null || index.compare(((NamedNode) (node)), ((NamedNode) (path)), flag) < 0))
	//*  32   72:aload           5
	//*  33   74:aload_2         
	//*  34   75:aload_3         
	//*  35   76:iload           4
	//*  36   78:invokevirtual   #256 <Method int Index.compare(NamedNode, NamedNode, boolean)>
	//*  37   81:ifle            51
	//*  38   84:aload_1         
	//*  39   85:ifnull          100
	//*  40   88:aload           5
	//*  41   90:aload_2         
	//*  42   91:aload_1         
	//*  43   92:iload           4
	//*  44   94:invokevirtual   #256 <Method int Index.compare(NamedNode, NamedNode, boolean)>
	//*  45   97:ifge            51
					path = ((Path) (node));
	//   46  100:aload_2         
	//   47  101:astore_1        
			} while(true);
	//   48  102:goto            51
			return ((NamedNode) (path));
	//   49  105:aload_1         
	//   50  106:areturn         
		}
		return null;
	//   51  107:aconst_null     
	//   52  108:areturn         
	}

	public WriteTreeRef childWrites(Path path)
	{
		return new WriteTreeRef(path, this);
	//    0    0:new             #260 <Class WriteTreeRef>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokespecial   #263 <Method void WriteTreeRef(Path, WriteTree)>
	//    5    9:areturn         
	}

	public Node getCompleteWriteData(Path path)
	{
		return visibleWrites.getCompleteNode(path);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field CompoundWrite visibleWrites>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #126 <Method Node CompoundWrite.getCompleteNode(Path)>
	//    4    8:areturn         
	}

	public UserWriteRecord getWrite(long l)
	{
		for(Iterator iterator = allWrites.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field List allWrites>
	//*   2    4:invokeinterface #61  <Method Iterator List.iterator()>
	//*   3    9:astore_3        
	//*   4   10:aload_3         
	//*   5   11:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            43
		{
			UserWriteRecord userwriterecord = (UserWriteRecord)iterator.next();
	//    7   19:aload_3         
	//    8   20:invokeinterface #71  <Method Object Iterator.next()>
	//    9   25:checkcast       #73  <Class UserWriteRecord>
	//   10   28:astore          4
			if(userwriterecord.getWriteId() == l)
	//*  11   30:aload           4
	//*  12   32:invokevirtual   #155 <Method long UserWriteRecord.getWriteId()>
	//*  13   35:lload_1         
	//*  14   36:lcmp            
	//*  15   37:ifne            10
				return userwriterecord;
	//   16   40:aload           4
	//   17   42:areturn         
		}

		return null;
	//   18   43:aconst_null     
	//   19   44:areturn         
	}

	public List purgeAllWrites()
	{
		ArrayList arraylist = new ArrayList(((java.util.Collection) (allWrites)));
	//    0    0:new             #40  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field List allWrites>
	//    4    8:invokespecial   #270 <Method void ArrayList(java.util.Collection)>
	//    5   11:astore_1        
		visibleWrites = CompoundWrite.emptyWrite();
	//    6   12:aload_0         
	//    7   13:invokestatic    #36  <Method CompoundWrite CompoundWrite.emptyWrite()>
	//    8   16:putfield        #38  <Field CompoundWrite visibleWrites>
		allWrites = ((List) (new ArrayList()));
	//    9   19:aload_0         
	//   10   20:new             #40  <Class ArrayList>
	//   11   23:dup             
	//   12   24:invokespecial   #41  <Method void ArrayList()>
	//   13   27:putfield        #43  <Field List allWrites>
		return ((List) (arraylist));
	//   14   30:aload_1         
	//   15   31:areturn         
	}

	public boolean removeWrite(long l)
	{
		int i;
		UserWriteRecord userwriterecord;
label0:
		{
			Iterator iterator = allWrites.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List allWrites>
	//    2    4:invokeinterface #61  <Method Iterator List.iterator()>
	//    3    9:astore          10
			for(i = 0; iterator.hasNext(); i++)
	//*   4   11:iconst_0        
	//*   5   12:istore_3        
	//*   6   13:aload           10
	//*   7   15:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*   8   20:ifeq            55
			{
				userwriterecord = (UserWriteRecord)iterator.next();
	//    9   23:aload           10
	//   10   25:invokeinterface #71  <Method Object Iterator.next()>
	//   11   30:checkcast       #73  <Class UserWriteRecord>
	//   12   33:astore          9
				if(userwriterecord.getWriteId() == l)
	//*  13   35:aload           9
	//*  14   37:invokevirtual   #155 <Method long UserWriteRecord.getWriteId()>
	//*  15   40:lload_1         
	//*  16   41:lcmp            
	//*  17   42:ifne            48
					break label0;
	//   18   45:goto            58
			}

	//   19   48:iload_3         
	//   20   49:iconst_1        
	//   21   50:iadd            
	//   22   51:istore_3        
	//*  23   52:goto            13
			userwriterecord = null;
	//   24   55:aconst_null     
	//   25   56:astore          9
		}
		allWrites.remove(((Object) (userwriterecord)));
	//   26   58:aload_0         
	//   27   59:getfield        #43  <Field List allWrites>
	//   28   62:aload           9
	//   29   64:invokeinterface #276 <Method boolean List.remove(Object)>
	//   30   69:pop             
		boolean flag2 = userwriterecord.isVisible();
	//   31   70:aload           9
	//   32   72:invokevirtual   #279 <Method boolean UserWriteRecord.isVisible()>
	//   33   75:istore          7
		int j = allWrites.size() - 1;
	//   34   77:aload_0         
	//   35   78:getfield        #43  <Field List allWrites>
	//   36   81:invokeinterface #147 <Method int List.size()>
	//   37   86:iconst_1        
	//   38   87:isub            
	//   39   88:istore          4
		boolean flag = false;
	//   40   90:iconst_0        
	//   41   91:istore          5
		boolean flag3;
		for(; flag2 && j >= 0; flag2 = flag3)
	//*  42   93:iload           7
	//*  43   95:ifeq            213
	//*  44   98:iload           4
	//*  45  100:iflt            213
		{
			UserWriteRecord userwriterecord1 = (UserWriteRecord)allWrites.get(j);
	//   46  103:aload_0         
	//   47  104:getfield        #43  <Field List allWrites>
	//   48  107:iload           4
	//   49  109:invokeinterface #151 <Method Object List.get(int)>
	//   50  114:checkcast       #73  <Class UserWriteRecord>
	//   51  117:astore          10
			boolean flag1 = flag;
	//   52  119:iload           5
	//   53  121:istore          6
			flag3 = flag2;
	//   54  123:iload           7
	//   55  125:istore          8
			if(userwriterecord1.isVisible())
	//*  56  127:aload           10
	//*  57  129:invokevirtual   #279 <Method boolean UserWriteRecord.isVisible()>
	//*  58  132:ifeq            196
				if(j >= i && recordContainsPath(userwriterecord1, userwriterecord.getPath()))
	//*  59  135:iload           4
	//*  60  137:iload_3         
	//*  61  138:icmplt          165
	//*  62  141:aload_0         
	//*  63  142:aload           10
	//*  64  144:aload           9
	//*  65  146:invokevirtual   #83  <Method Path UserWriteRecord.getPath()>
	//*  66  149:invokespecial   #281 <Method boolean recordContainsPath(UserWriteRecord, Path)>
	//*  67  152:ifeq            165
				{
					flag3 = false;
	//   68  155:iconst_0        
	//   69  156:istore          8
					flag1 = flag;
	//   70  158:iload           5
	//   71  160:istore          6
				} else
	//*  72  162:goto            196
				{
					flag1 = flag;
	//   73  165:iload           5
	//   74  167:istore          6
					flag3 = flag2;
	//   75  169:iload           7
	//   76  171:istore          8
					if(userwriterecord.getPath().contains(userwriterecord1.getPath()))
	//*  77  173:aload           9
	//*  78  175:invokevirtual   #83  <Method Path UserWriteRecord.getPath()>
	//*  79  178:aload           10
	//*  80  180:invokevirtual   #83  <Method Path UserWriteRecord.getPath()>
	//*  81  183:invokevirtual   #92  <Method boolean Path.contains(Path)>
	//*  82  186:ifeq            196
					{
						flag1 = true;
	//   83  189:iconst_1        
	//   84  190:istore          6
						flag3 = flag2;
	//   85  192:iload           7
	//   86  194:istore          8
					}
				}
			j--;
	//   87  196:iload           4
	//   88  198:iconst_1        
	//   89  199:isub            
	//   90  200:istore          4
			flag = flag1;
	//   91  202:iload           6
	//   92  204:istore          5
		}

	//   93  206:iload           8
	//   94  208:istore          7
	//*  95  210:goto            93
		if(!flag2)
	//*  96  213:iload           7
	//*  97  215:ifne            220
			return false;
	//   98  218:iconst_0        
	//   99  219:ireturn         
		if(flag)
	//* 100  220:iload           5
	//* 101  222:ifeq            231
		{
			resetTree();
	//  102  225:aload_0         
	//  103  226:invokespecial   #283 <Method void resetTree()>
			return true;
	//  104  229:iconst_1        
	//  105  230:ireturn         
		}
		if(userwriterecord.isOverwrite())
	//* 106  231:aload           9
	//* 107  233:invokevirtual   #86  <Method boolean UserWriteRecord.isOverwrite()>
	//* 108  236:ifeq            257
		{
			visibleWrites = visibleWrites.removeWrite(userwriterecord.getPath());
	//  109  239:aload_0         
	//  110  240:aload_0         
	//  111  241:getfield        #38  <Field CompoundWrite visibleWrites>
	//  112  244:aload           9
	//  113  246:invokevirtual   #83  <Method Path UserWriteRecord.getPath()>
	//  114  249:invokevirtual   #285 <Method CompoundWrite CompoundWrite.removeWrite(Path)>
	//  115  252:putfield        #38  <Field CompoundWrite visibleWrites>
			return true;
	//  116  255:iconst_1        
	//  117  256:ireturn         
		}
		for(Iterator iterator1 = userwriterecord.getMerge().iterator(); iterator1.hasNext();)
	//* 118  257:aload           9
	//* 119  259:invokevirtual   #116 <Method CompoundWrite UserWriteRecord.getMerge()>
	//* 120  262:invokevirtual   #131 <Method Iterator CompoundWrite.iterator()>
	//* 121  265:astore          10
	//* 122  267:aload           10
	//* 123  269:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//* 124  274:ifeq            321
		{
			Path path = (Path)((java.util.Map.Entry)iterator1.next()).getKey();
	//  125  277:aload           10
	//  126  279:invokeinterface #71  <Method Object Iterator.next()>
	//  127  284:checkcast       #133 <Class java.util.Map$Entry>
	//  128  287:invokeinterface #136 <Method Object java.util.Map$Entry.getKey()>
	//  129  292:checkcast       #88  <Class Path>
	//  130  295:astore          11
			visibleWrites = visibleWrites.removeWrite(userwriterecord.getPath().child(path));
	//  131  297:aload_0         
	//  132  298:aload_0         
	//  133  299:getfield        #38  <Field CompoundWrite visibleWrites>
	//  134  302:aload           9
	//  135  304:invokevirtual   #83  <Method Path UserWriteRecord.getPath()>
	//  136  307:aload           11
	//  137  309:invokevirtual   #140 <Method Path Path.child(Path)>
	//  138  312:invokevirtual   #285 <Method CompoundWrite CompoundWrite.removeWrite(Path)>
	//  139  315:putfield        #38  <Field CompoundWrite visibleWrites>
		}

	//* 140  318:goto            267
		return true;
	//  141  321:iconst_1        
	//  142  322:ireturn         
	}

	public Node shadowingWrite(Path path)
	{
		return visibleWrites.getCompleteNode(path);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field CompoundWrite visibleWrites>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #126 <Method Node CompoundWrite.getCompleteNode(Path)>
	//    4    8:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private static final Predicate DEFAULT_FILTER = new Predicate() {

		public boolean evaluate(UserWriteRecord userwriterecord)
		{
			return userwriterecord.isVisible();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method boolean UserWriteRecord.isVisible()>
		//    2    4:ireturn         
		}

		public volatile boolean evaluate(Object obj)
		{
			return evaluate((UserWriteRecord)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class UserWriteRecord>
		//    3    5:invokevirtual   #25  <Method boolean evaluate(UserWriteRecord)>
		//    4    8:ireturn         
		}

	}
;
	private List allWrites;
	private Long lastWriteId;
	private CompoundWrite visibleWrites;

	static 
	{
	//    0    0:new             #8   <Class WriteTree$2>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void WriteTree$2()>
	//    3    7:putstatic       #28  <Field Predicate DEFAULT_FILTER>
	//*   4   10:return          
	}
}
