// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			PathContent, MergePaths, ContentGroup, Content

class MergePathsContent
	implements PathContent
{

	MergePathsContent(MergePaths mergepaths)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class Path>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void Path()>
	//    6   12:putfield        #32  <Field Path firstPath>
	//    7   15:aload_0         
	//    8   16:new             #29  <Class Path>
	//    9   19:dup             
	//   10   20:invokespecial   #30  <Method void Path()>
	//   11   23:putfield        #34  <Field Path remainderPath>
	//   12   26:aload_0         
	//   13   27:new             #29  <Class Path>
	//   14   30:dup             
	//   15   31:invokespecial   #30  <Method void Path()>
	//   16   34:putfield        #36  <Field Path path>
	//   17   37:aload_0         
	//   18   38:new             #38  <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #39  <Method void ArrayList()>
	//   21   45:putfield        #41  <Field List pathContents>
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  22   48:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  23   51:bipush          19
	//*  24   53:icmplt          70
		{
			name = mergepaths.getName();
	//   25   56:aload_0         
	//   26   57:aload_1         
	//   27   58:invokevirtual   #53  <Method String MergePaths.getName()>
	//   28   61:putfield        #55  <Field String name>
			mergePaths = mergepaths;
	//   29   64:aload_0         
	//   30   65:aload_1         
	//   31   66:putfield        #57  <Field MergePaths mergePaths>
			return;
	//   32   69:return          
		} else
		{
			throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
	//   33   70:new             #59  <Class IllegalStateException>
	//   34   73:dup             
	//   35   74:ldc1            #61  <String "Merge paths are not supported pre-KitKat.">
	//   36   76:invokespecial   #64  <Method void IllegalStateException(String)>
	//   37   79:athrow          
		}
	}

	private void addPaths()
	{
		for(int i = 0; i < pathContents.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #41  <Field List pathContents>
	//*   5    7:invokeinterface #72  <Method int List.size()>
	//*   6   12:icmpge          47
			path.addPath(((PathContent)pathContents.get(i)).getPath());
	//    7   15:aload_0         
	//    8   16:getfield        #36  <Field Path path>
	//    9   19:aload_0         
	//   10   20:getfield        #41  <Field List pathContents>
	//   11   23:iload_1         
	//   12   24:invokeinterface #76  <Method Object List.get(int)>
	//   13   29:checkcast       #6   <Class PathContent>
	//   14   32:invokeinterface #80  <Method Path PathContent.getPath()>
	//   15   37:invokevirtual   #84  <Method void Path.addPath(Path)>

	//   16   40:iload_1         
	//   17   41:iconst_1        
	//   18   42:iadd            
	//   19   43:istore_1        
	//*  20   44:goto            2
	//   21   47:return          
	}

	private void opFirstPathWithRest(android.graphics.Path.Op op)
	{
		remainderPath.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Path remainderPath>
	//    2    4:invokevirtual   #89  <Method void Path.reset()>
		firstPath.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field Path firstPath>
	//    5   11:invokevirtual   #89  <Method void Path.reset()>
		for(int i = pathContents.size() - 1; i >= 1; i--)
	//*   6   14:aload_0         
	//*   7   15:getfield        #41  <Field List pathContents>
	//*   8   18:invokeinterface #72  <Method int List.size()>
	//*   9   23:iconst_1        
	//*  10   24:isub            
	//*  11   25:istore_2        
	//*  12   26:iload_2         
	//*  13   27:iconst_1        
	//*  14   28:icmplt          147
		{
			Object obj = ((Object) ((PathContent)pathContents.get(i)));
	//   15   31:aload_0         
	//   16   32:getfield        #41  <Field List pathContents>
	//   17   35:iload_2         
	//   18   36:invokeinterface #76  <Method Object List.get(int)>
	//   19   41:checkcast       #6   <Class PathContent>
	//   20   44:astore          4
			if(obj instanceof ContentGroup)
	//*  21   46:aload           4
	//*  22   48:instanceof      #91  <Class ContentGroup>
	//*  23   51:ifeq            126
			{
				obj = ((Object) ((ContentGroup)obj));
	//   24   54:aload           4
	//   25   56:checkcast       #91  <Class ContentGroup>
	//   26   59:astore          4
				List list = ((ContentGroup) (obj)).getPathList();
	//   27   61:aload           4
	//   28   63:invokevirtual   #95  <Method List ContentGroup.getPathList()>
	//   29   66:astore          5
				for(int k = list.size() - 1; k >= 0; k--)
	//*  30   68:aload           5
	//*  31   70:invokeinterface #72  <Method int List.size()>
	//*  32   75:iconst_1        
	//*  33   76:isub            
	//*  34   77:istore_3        
	//*  35   78:iload_3         
	//*  36   79:iflt            140
				{
					Path path1 = ((PathContent)list.get(k)).getPath();
	//   37   82:aload           5
	//   38   84:iload_3         
	//   39   85:invokeinterface #76  <Method Object List.get(int)>
	//   40   90:checkcast       #6   <Class PathContent>
	//   41   93:invokeinterface #80  <Method Path PathContent.getPath()>
	//   42   98:astore          6
					path1.transform(((ContentGroup) (obj)).getTransformationMatrix());
	//   43  100:aload           6
	//   44  102:aload           4
	//   45  104:invokevirtual   #99  <Method android.graphics.Matrix ContentGroup.getTransformationMatrix()>
	//   46  107:invokevirtual   #103 <Method void Path.transform(android.graphics.Matrix)>
					remainderPath.addPath(path1);
	//   47  110:aload_0         
	//   48  111:getfield        #34  <Field Path remainderPath>
	//   49  114:aload           6
	//   50  116:invokevirtual   #84  <Method void Path.addPath(Path)>
				}

	//   51  119:iload_3         
	//   52  120:iconst_1        
	//   53  121:isub            
	//   54  122:istore_3        
			} else
	//*  55  123:goto            78
			{
				remainderPath.addPath(((PathContent) (obj)).getPath());
	//   56  126:aload_0         
	//   57  127:getfield        #34  <Field Path remainderPath>
	//   58  130:aload           4
	//   59  132:invokeinterface #80  <Method Path PathContent.getPath()>
	//   60  137:invokevirtual   #84  <Method void Path.addPath(Path)>
			}
		}

	//   61  140:iload_2         
	//   62  141:iconst_1        
	//   63  142:isub            
	//   64  143:istore_2        
	//*  65  144:goto            26
		Object obj1 = ((Object) (pathContents));
	//   66  147:aload_0         
	//   67  148:getfield        #41  <Field List pathContents>
	//   68  151:astore          4
		int j = 0;
	//   69  153:iconst_0        
	//   70  154:istore_2        
		obj1 = ((Object) ((PathContent)((List) (obj1)).get(0)));
	//   71  155:aload           4
	//   72  157:iconst_0        
	//   73  158:invokeinterface #76  <Method Object List.get(int)>
	//   74  163:checkcast       #6   <Class PathContent>
	//   75  166:astore          4
		if(obj1 instanceof ContentGroup)
	//*  76  168:aload           4
	//*  77  170:instanceof      #91  <Class ContentGroup>
	//*  78  173:ifeq            245
		{
			obj1 = ((Object) ((ContentGroup)obj1));
	//   79  176:aload           4
	//   80  178:checkcast       #91  <Class ContentGroup>
	//   81  181:astore          4
			for(List list1 = ((ContentGroup) (obj1)).getPathList(); j < list1.size(); j++)
	//*  82  183:aload           4
	//*  83  185:invokevirtual   #95  <Method List ContentGroup.getPathList()>
	//*  84  188:astore          5
	//*  85  190:iload_2         
	//*  86  191:aload           5
	//*  87  193:invokeinterface #72  <Method int List.size()>
	//*  88  198:icmpge          259
			{
				Path path2 = ((PathContent)list1.get(j)).getPath();
	//   89  201:aload           5
	//   90  203:iload_2         
	//   91  204:invokeinterface #76  <Method Object List.get(int)>
	//   92  209:checkcast       #6   <Class PathContent>
	//   93  212:invokeinterface #80  <Method Path PathContent.getPath()>
	//   94  217:astore          6
				path2.transform(((ContentGroup) (obj1)).getTransformationMatrix());
	//   95  219:aload           6
	//   96  221:aload           4
	//   97  223:invokevirtual   #99  <Method android.graphics.Matrix ContentGroup.getTransformationMatrix()>
	//   98  226:invokevirtual   #103 <Method void Path.transform(android.graphics.Matrix)>
				firstPath.addPath(path2);
	//   99  229:aload_0         
	//  100  230:getfield        #32  <Field Path firstPath>
	//  101  233:aload           6
	//  102  235:invokevirtual   #84  <Method void Path.addPath(Path)>
			}

	//  103  238:iload_2         
	//  104  239:iconst_1        
	//  105  240:iadd            
	//  106  241:istore_2        
		} else
	//* 107  242:goto            190
		{
			firstPath.set(((PathContent) (obj1)).getPath());
	//  108  245:aload_0         
	//  109  246:getfield        #32  <Field Path firstPath>
	//  110  249:aload           4
	//  111  251:invokeinterface #80  <Method Path PathContent.getPath()>
	//  112  256:invokevirtual   #106 <Method void Path.set(Path)>
		}
		path.op(firstPath, remainderPath, op);
	//  113  259:aload_0         
	//  114  260:getfield        #36  <Field Path path>
	//  115  263:aload_0         
	//  116  264:getfield        #32  <Field Path firstPath>
	//  117  267:aload_0         
	//  118  268:getfield        #34  <Field Path remainderPath>
	//  119  271:aload_1         
	//  120  272:invokevirtual   #110 <Method boolean Path.op(Path, Path, android.graphics.Path$Op)>
	//  121  275:pop             
	//  122  276:return          
	}

	void addContentIfNeeded(Content content)
	{
		if(content instanceof PathContent)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #6   <Class PathContent>
	//*   2    4:ifeq            21
			pathContents.add(((Object) ((PathContent)content)));
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field List pathContents>
	//    5   11:aload_1         
	//    6   12:checkcast       #6   <Class PathContent>
	//    7   15:invokeinterface #117 <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String name>
	//    2    4:areturn         
	}

	public Path getPath()
	{
		path.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Path path>
	//    2    4:invokevirtual   #89  <Method void Path.reset()>
		static class _cls1
		{

			static final int $SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode[];

			static 
			{
				$SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode = new int[MergePaths.MergePathsMode.values().length];
			//    0    0:invokestatic    #18  <Method MergePaths$MergePathsMode[] MergePaths$MergePathsMode.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode>
				try
				{
					$SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode[MergePaths.MergePathsMode.Merge.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode>
			//    5   12:getstatic       #24  <Field MergePaths$MergePathsMode MergePaths$MergePathsMode.Merge>
			//    6   15:invokevirtual   #28  <Method int MergePaths$MergePathsMode.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode>
			//*  10   23:getstatic       #31  <Field MergePaths$MergePathsMode MergePaths$MergePathsMode.Add>
			//*  11   26:invokevirtual   #28  <Method int MergePaths$MergePathsMode.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode>
			//*  15   34:getstatic       #34  <Field MergePaths$MergePathsMode MergePaths$MergePathsMode.Subtract>
			//*  16   37:invokevirtual   #28  <Method int MergePaths$MergePathsMode.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode>
			//*  20   45:getstatic       #37  <Field MergePaths$MergePathsMode MergePaths$MergePathsMode.Intersect>
			//*  21   48:invokevirtual   #28  <Method int MergePaths$MergePathsMode.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode>
			//*  25   56:getstatic       #40  <Field MergePaths$MergePathsMode MergePaths$MergePathsMode.ExcludeIntersections>
			//*  26   59:invokevirtual   #28  <Method int MergePaths$MergePathsMode.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					$SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode[MergePaths.MergePathsMode.Add.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					$SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode[MergePaths.MergePathsMode.Subtract.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					$SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode[MergePaths.MergePathsMode.Intersect.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					$SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode[MergePaths.MergePathsMode.ExcludeIntersections.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		switch(_cls1..SwitchMap.com.airbnb.lottie.MergePaths.MergePathsMode[mergePaths.getMode().ordinal()])
	//*   3    7:getstatic       #121 <Field int[] MergePathsContent$1.$SwitchMap$com$airbnb$lottie$MergePaths$MergePathsMode>
	//*   4   10:aload_0         
	//*   5   11:getfield        #57  <Field MergePaths mergePaths>
	//*   6   14:invokevirtual   #125 <Method MergePaths$MergePathsMode MergePaths.getMode()>
	//*   7   17:invokevirtual   #130 <Method int MergePaths$MergePathsMode.ordinal()>
	//*   8   20:iaload          
		{
	//*   9   21:tableswitch     1 5: default 56
	//	               1 99
	//	               2 89
	//	               3 79
	//	               4 69
	//	               5 59
	//*  10   56:goto            103
		case 5: // '\005'
			opFirstPathWithRest(android.graphics.Path.Op.XOR);
	//   11   59:aload_0         
	//   12   60:getstatic       #136 <Field android.graphics.Path$Op android.graphics.Path$Op.XOR>
	//   13   63:invokespecial   #138 <Method void opFirstPathWithRest(android.graphics.Path$Op)>
			break;

	//*  14   66:goto            103
		case 4: // '\004'
			opFirstPathWithRest(android.graphics.Path.Op.INTERSECT);
	//   15   69:aload_0         
	//   16   70:getstatic       #141 <Field android.graphics.Path$Op android.graphics.Path$Op.INTERSECT>
	//   17   73:invokespecial   #138 <Method void opFirstPathWithRest(android.graphics.Path$Op)>
			break;

	//*  18   76:goto            103
		case 3: // '\003'
			opFirstPathWithRest(android.graphics.Path.Op.REVERSE_DIFFERENCE);
	//   19   79:aload_0         
	//   20   80:getstatic       #144 <Field android.graphics.Path$Op android.graphics.Path$Op.REVERSE_DIFFERENCE>
	//   21   83:invokespecial   #138 <Method void opFirstPathWithRest(android.graphics.Path$Op)>
			break;

	//*  22   86:goto            103
		case 2: // '\002'
			opFirstPathWithRest(android.graphics.Path.Op.UNION);
	//   23   89:aload_0         
	//   24   90:getstatic       #147 <Field android.graphics.Path$Op android.graphics.Path$Op.UNION>
	//   25   93:invokespecial   #138 <Method void opFirstPathWithRest(android.graphics.Path$Op)>
			break;

	//*  26   96:goto            103
		case 1: // '\001'
			addPaths();
	//   27   99:aload_0         
	//   28  100:invokespecial   #149 <Method void addPaths()>
			break;
		}
		return path;
	//   29  103:aload_0         
	//   30  104:getfield        #36  <Field Path path>
	//   31  107:areturn         
	}

	public void setContents(List list, List list1)
	{
		for(int i = 0; i < pathContents.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #41  <Field List pathContents>
	//*   5    7:invokeinterface #72  <Method int List.size()>
	//*   6   12:icmpge          42
			((PathContent)pathContents.get(i)).setContents(list, list1);
	//    7   15:aload_0         
	//    8   16:getfield        #41  <Field List pathContents>
	//    9   19:iload_3         
	//   10   20:invokeinterface #76  <Method Object List.get(int)>
	//   11   25:checkcast       #6   <Class PathContent>
	//   12   28:aload_1         
	//   13   29:aload_2         
	//   14   30:invokeinterface #153 <Method void PathContent.setContents(List, List)>

	//   15   35:iload_3         
	//   16   36:iconst_1        
	//   17   37:iadd            
	//   18   38:istore_3        
	//*  19   39:goto            2
	//   20   42:return          
	}

	private final Path firstPath = new Path();
	private final MergePaths mergePaths;
	private final String name;
	private final Path path = new Path();
	private final List pathContents = new ArrayList();
	private final Path remainderPath = new Path();
}
