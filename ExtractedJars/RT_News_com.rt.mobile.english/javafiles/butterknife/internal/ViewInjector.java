// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife.internal;

import java.lang.reflect.Field;
import java.util.*;

// Referenced classes of package butterknife.internal:
//			CollectionBinding, Binding, ViewInjection, ListenerClass, 
//			ListenerMethod, ListenerBinding, Parameter, ViewBinding

final class ViewInjector
{

	ViewInjector(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void LinkedHashMap()>
	//    6   12:putfield        #26  <Field Map viewIdMap>
	//    7   15:aload_0         
	//    8   16:new             #23  <Class LinkedHashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #24  <Method void LinkedHashMap()>
	//   11   23:putfield        #28  <Field Map collectionBindings>
		classPackage = s;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #30  <Field String classPackage>
		className = s1;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #32  <Field String className>
		targetClass = s2;
	//   18   36:aload_0         
	//   19   37:aload_3         
	//   20   38:putfield        #34  <Field String targetClass>
	//   21   41:return          
	}

	static void emitCastIfNeeded(StringBuilder stringbuilder, String s)
	{
		emitCastIfNeeded(stringbuilder, "android.view.View", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #39  <String "android.view.View">
	//    2    3:aload_1         
	//    3    4:invokestatic    #42  <Method void emitCastIfNeeded(StringBuilder, String, String)>
	//    4    7:return          
	}

	static void emitCastIfNeeded(StringBuilder stringbuilder, String s, String s1)
	{
		if(!s.equals(((Object) (s1))))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*   3    5:ifne            28
		{
			stringbuilder.append('(');
	//    4    8:aload_0         
	//    5    9:bipush          40
	//    6   11:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//    7   14:pop             
			stringbuilder.append(s1);
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
			stringbuilder.append(") ");
	//   12   21:aload_0         
	//   13   22:ldc1            #59  <String ") ">
	//   14   24:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		}
	//   16   28:return          
	}

	private void emitCollectionBinding(StringBuilder stringbuilder, CollectionBinding collectionbinding, int ai[])
	{
		stringbuilder.append("    target.");
	//    0    0:aload_1         
	//    1    1:ldc1            #63  <String "    target.">
	//    2    3:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
		stringbuilder.append(collectionbinding.getName());
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:invokevirtual   #69  <Method String CollectionBinding.getName()>
	//    7   12:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    8   15:pop             
		stringbuilder.append(" = ");
	//    9   16:aload_1         
	//   10   17:ldc1            #71  <String " = ">
	//   11   19:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
		static class _cls1
		{

			static final int $SwitchMap$butterknife$internal$CollectionBinding$Kind[];

			static 
			{
				$SwitchMap$butterknife$internal$CollectionBinding$Kind = new int[CollectionBinding.Kind.values().length];
			//    0    0:invokestatic    #18  <Method CollectionBinding$Kind[] CollectionBinding$Kind.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$butterknife$internal$CollectionBinding$Kind>
				try
				{
					$SwitchMap$butterknife$internal$CollectionBinding$Kind[CollectionBinding.Kind.ARRAY.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$butterknife$internal$CollectionBinding$Kind>
			//    5   12:getstatic       #24  <Field CollectionBinding$Kind CollectionBinding$Kind.ARRAY>
			//    6   15:invokevirtual   #28  <Method int CollectionBinding$Kind.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$butterknife$internal$CollectionBinding$Kind>
			//*  10   23:getstatic       #31  <Field CollectionBinding$Kind CollectionBinding$Kind.LIST>
			//*  11   26:invokevirtual   #28  <Method int CollectionBinding$Kind.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					$SwitchMap$butterknife$internal$CollectionBinding$Kind[CollectionBinding.Kind.LIST.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		switch(_cls1..SwitchMap.butterknife.internal.CollectionBinding.Kind[collectionbinding.getKind().ordinal()])
	//*  13   23:getstatic       #75  <Field int[] ViewInjector$1.$SwitchMap$butterknife$internal$CollectionBinding$Kind>
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #79  <Method CollectionBinding$Kind CollectionBinding.getKind()>
	//*  16   30:invokevirtual   #85  <Method int CollectionBinding$Kind.ordinal()>
	//*  17   33:iaload          
		{
	//*  18   34:tableswitch     1 2: default 56
	//	               1 102
	//	               2 92
		default:
			stringbuilder = new StringBuilder();
	//   19   56:new             #50  <Class StringBuilder>
	//   20   59:dup             
	//   21   60:invokespecial   #86  <Method void StringBuilder()>
	//   22   63:astore_1        
			stringbuilder.append("Unknown kind: ");
	//   23   64:aload_1         
	//   24   65:ldc1            #88  <String "Unknown kind: ">
	//   25   67:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   26   70:pop             
			stringbuilder.append(((Object) (collectionbinding.getKind())));
	//   27   71:aload_1         
	//   28   72:aload_2         
	//   29   73:invokevirtual   #79  <Method CollectionBinding$Kind CollectionBinding.getKind()>
	//   30   76:invokevirtual   #91  <Method StringBuilder StringBuilder.append(Object)>
	//   31   79:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   32   80:new             #93  <Class IllegalStateException>
	//   33   83:dup             
	//   34   84:aload_1         
	//   35   85:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   36   88:invokespecial   #99  <Method void IllegalStateException(String)>
	//   37   91:athrow          

		case 2: // '\002'
			stringbuilder.append("Finder.listOf(");
	//   38   92:aload_1         
	//   39   93:ldc1            #101 <String "Finder.listOf(">
	//   40   95:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   41   98:pop             
			break;

	//*  42   99:goto            109
		case 1: // '\001'
			stringbuilder.append("Finder.arrayOf(");
	//   43  102:aload_1         
	//   44  103:ldc1            #103 <String "Finder.arrayOf(">
	//   45  105:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   46  108:pop             
			break;
		}
		for(int i = 0; i < ai.length; i++)
	//*  47  109:iconst_0        
	//*  48  110:istore          4
	//*  49  112:iload           4
	//*  50  114:aload_3         
	//*  51  115:arraylength     
	//*  52  116:icmpge          227
		{
			if(i > 0)
	//*  53  119:iload           4
	//*  54  121:ifle            131
				stringbuilder.append(',');
	//   55  124:aload_1         
	//   56  125:bipush          44
	//   57  127:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//   58  130:pop             
			stringbuilder.append("\n        ");
	//   59  131:aload_1         
	//   60  132:ldc1            #105 <String "\n        ">
	//   61  134:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   62  137:pop             
			emitCastIfNeeded(stringbuilder, collectionbinding.getType());
	//   63  138:aload_1         
	//   64  139:aload_2         
	//   65  140:invokevirtual   #108 <Method String CollectionBinding.getType()>
	//   66  143:invokestatic    #110 <Method void emitCastIfNeeded(StringBuilder, String)>
			if(collectionbinding.isRequired())
	//*  67  146:aload_2         
	//*  68  147:invokevirtual   #114 <Method boolean CollectionBinding.isRequired()>
	//*  69  150:ifeq            195
			{
				stringbuilder.append("finder.findRequiredView(source, ");
	//   70  153:aload_1         
	//   71  154:ldc1            #116 <String "finder.findRequiredView(source, ">
	//   72  156:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   73  159:pop             
				stringbuilder.append(ai[i]);
	//   74  160:aload_1         
	//   75  161:aload_3         
	//   76  162:iload           4
	//   77  164:iaload          
	//   78  165:invokevirtual   #119 <Method StringBuilder StringBuilder.append(int)>
	//   79  168:pop             
				stringbuilder.append(", \"");
	//   80  169:aload_1         
	//   81  170:ldc1            #121 <String ", \"">
	//   82  172:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   83  175:pop             
				stringbuilder.append(collectionbinding.getName());
	//   84  176:aload_1         
	//   85  177:aload_2         
	//   86  178:invokevirtual   #69  <Method String CollectionBinding.getName()>
	//   87  181:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   88  184:pop             
				stringbuilder.append("\")");
	//   89  185:aload_1         
	//   90  186:ldc1            #123 <String "\")">
	//   91  188:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   92  191:pop             
			} else
	//*  93  192:goto            218
			{
				stringbuilder.append("finder.findOptionalView(source, ");
	//   94  195:aload_1         
	//   95  196:ldc1            #125 <String "finder.findOptionalView(source, ">
	//   96  198:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   97  201:pop             
				stringbuilder.append(ai[i]);
	//   98  202:aload_1         
	//   99  203:aload_3         
	//  100  204:iload           4
	//  101  206:iaload          
	//  102  207:invokevirtual   #119 <Method StringBuilder StringBuilder.append(int)>
	//  103  210:pop             
				stringbuilder.append(")");
	//  104  211:aload_1         
	//  105  212:ldc1            #127 <String ")">
	//  106  214:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  107  217:pop             
			}
		}

	//  108  218:iload           4
	//  109  220:iconst_1        
	//  110  221:iadd            
	//  111  222:istore          4
	//* 112  224:goto            112
		stringbuilder.append("\n    );");
	//  113  227:aload_1         
	//  114  228:ldc1            #129 <String "\n    );">
	//  115  230:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  116  233:pop             
	//  117  234:return          
	}

	static void emitHumanDescription(StringBuilder stringbuilder, List list)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #136 <Method int List.size()>
	//    2    6:istore_3        
		int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		switch(j)
	//*   5    9:iload_3         
		{
	//*   6   10:tableswitch     1 2: default 32
	//	               1 90
	//	               2 42
		default:
			j = list.size();
	//    7   32:aload_1         
	//    8   33:invokeinterface #136 <Method int List.size()>
	//    9   38:istore_3        
			break;

	//*  10   39:goto            111
		case 2: // '\002'
			stringbuilder.append(((Binding)list.get(0)).getDescription());
	//   11   42:aload_0         
	//   12   43:aload_1         
	//   13   44:iconst_0        
	//   14   45:invokeinterface #140 <Method Object List.get(int)>
	//   15   50:checkcast       #142 <Class Binding>
	//   16   53:invokeinterface #145 <Method String Binding.getDescription()>
	//   17   58:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   18   61:pop             
			stringbuilder.append(" and ");
	//   19   62:aload_0         
	//   20   63:ldc1            #147 <String " and ">
	//   21   65:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   22   68:pop             
			stringbuilder.append(((Binding)list.get(1)).getDescription());
	//   23   69:aload_0         
	//   24   70:aload_1         
	//   25   71:iconst_1        
	//   26   72:invokeinterface #140 <Method Object List.get(int)>
	//   27   77:checkcast       #142 <Class Binding>
	//   28   80:invokeinterface #145 <Method String Binding.getDescription()>
	//   29   85:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   30   88:pop             
			return;
	//   31   89:return          

		case 1: // '\001'
			stringbuilder.append(((Binding)list.get(0)).getDescription());
	//   32   90:aload_0         
	//   33   91:aload_1         
	//   34   92:iconst_0        
	//   35   93:invokeinterface #140 <Method Object List.get(int)>
	//   36   98:checkcast       #142 <Class Binding>
	//   37  101:invokeinterface #145 <Method String Binding.getDescription()>
	//   38  106:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   39  109:pop             
			return;
	//   40  110:return          
		}
		for(; i < j; i++)
	//*  41  111:iload_2         
	//*  42  112:iload_3         
	//*  43  113:icmpge          172
		{
			Binding binding = (Binding)list.get(i);
	//   44  116:aload_1         
	//   45  117:iload_2         
	//   46  118:invokeinterface #140 <Method Object List.get(int)>
	//   47  123:checkcast       #142 <Class Binding>
	//   48  126:astore          4
			if(i != 0)
	//*  49  128:iload_2         
	//*  50  129:ifeq            139
				stringbuilder.append(", ");
	//   51  132:aload_0         
	//   52  133:ldc1            #149 <String ", ">
	//   53  135:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   54  138:pop             
			if(i == j - 1)
	//*  55  139:iload_2         
	//*  56  140:iload_3         
	//*  57  141:iconst_1        
	//*  58  142:isub            
	//*  59  143:icmpne          153
				stringbuilder.append("and ");
	//   60  146:aload_0         
	//   61  147:ldc1            #151 <String "and ">
	//   62  149:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   63  152:pop             
			stringbuilder.append(binding.getDescription());
	//   64  153:aload_0         
	//   65  154:aload           4
	//   66  156:invokeinterface #145 <Method String Binding.getDescription()>
	//   67  161:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   68  164:pop             
		}

	//   69  165:iload_2         
	//   70  166:iconst_1        
	//   71  167:iadd            
	//   72  168:istore_2        
	//*  73  169:goto            111
	//   74  172:return          
	}

	private void emitInject(StringBuilder stringbuilder)
	{
		stringbuilder.append("  public static void inject(Finder finder, final ");
	//    0    0:aload_1         
	//    1    1:ldc1            #157 <String "  public static void inject(Finder finder, final ">
	//    2    3:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
		stringbuilder.append(targetClass);
	//    4    7:aload_1         
	//    5    8:aload_0         
	//    6    9:getfield        #34  <Field String targetClass>
	//    7   12:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    8   15:pop             
		stringbuilder.append(" target, Object source) {\n");
	//    9   16:aload_1         
	//   10   17:ldc1            #159 <String " target, Object source) {\n">
	//   11   19:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
		if(parentInjector != null)
	//*  13   23:aload_0         
	//*  14   24:getfield        #161 <Field String parentInjector>
	//*  15   27:ifnull          53
		{
			stringbuilder.append("    ");
	//   16   30:aload_1         
	//   17   31:ldc1            #163 <String "    ">
	//   18   33:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
			stringbuilder.append(parentInjector);
	//   20   37:aload_1         
	//   21   38:aload_0         
	//   22   39:getfield        #161 <Field String parentInjector>
	//   23   42:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
			stringbuilder.append(".inject(finder, target, source);\n\n");
	//   25   46:aload_1         
	//   26   47:ldc1            #165 <String ".inject(finder, target, source);\n\n">
	//   27   49:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
		}
		stringbuilder.append("    View view;\n");
	//   29   53:aload_1         
	//   30   54:ldc1            #167 <String "    View view;\n">
	//   31   56:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
		for(Iterator iterator = viewIdMap.values().iterator(); iterator.hasNext(); emitViewInjection(stringbuilder, (ViewInjection)iterator.next()));
	//   33   60:aload_0         
	//   34   61:getfield        #26  <Field Map viewIdMap>
	//   35   64:invokeinterface #173 <Method Collection Map.values()>
	//   36   69:invokeinterface #179 <Method Iterator Collection.iterator()>
	//   37   74:astore_2        
	//   38   75:aload_2         
	//   39   76:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//   40   81:ifeq            101
	//   41   84:aload_0         
	//   42   85:aload_1         
	//   43   86:aload_2         
	//   44   87:invokeinterface #188 <Method Object Iterator.next()>
	//   45   92:checkcast       #190 <Class ViewInjection>
	//   46   95:invokespecial   #194 <Method void emitViewInjection(StringBuilder, ViewInjection)>
	//*  47   98:goto            75
		java.util.Map.Entry entry;
		for(Iterator iterator1 = collectionBindings.entrySet().iterator(); iterator1.hasNext(); emitCollectionBinding(stringbuilder, (CollectionBinding)entry.getKey(), (int[])entry.getValue()))
	//*  48  101:aload_0         
	//*  49  102:getfield        #28  <Field Map collectionBindings>
	//*  50  105:invokeinterface #198 <Method Set Map.entrySet()>
	//*  51  110:invokeinterface #201 <Method Iterator Set.iterator()>
	//*  52  115:astore_2        
	//*  53  116:aload_2         
	//*  54  117:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//*  55  122:ifeq            161
			entry = (java.util.Map.Entry)iterator1.next();
	//   56  125:aload_2         
	//   57  126:invokeinterface #188 <Method Object Iterator.next()>
	//   58  131:checkcast       #203 <Class java.util.Map$Entry>
	//   59  134:astore_3        

	//   60  135:aload_0         
	//   61  136:aload_1         
	//   62  137:aload_3         
	//   63  138:invokeinterface #206 <Method Object java.util.Map$Entry.getKey()>
	//   64  143:checkcast       #65  <Class CollectionBinding>
	//   65  146:aload_3         
	//   66  147:invokeinterface #209 <Method Object java.util.Map$Entry.getValue()>
	//   67  152:checkcast       #210 <Class int[]>
	//   68  155:invokespecial   #212 <Method void emitCollectionBinding(StringBuilder, CollectionBinding, int[])>
	//*  69  158:goto            116
		stringbuilder.append("  }\n");
	//   70  161:aload_1         
	//   71  162:ldc1            #214 <String "  }\n">
	//   72  164:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   73  167:pop             
	//   74  168:return          
	}

	private void emitListenerBindings(StringBuilder stringbuilder, ViewInjection viewinjection)
	{
		Map map = viewinjection.getListenerBindings();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #219 <Method Map ViewInjection.getListenerBindings()>
	//    2    4:astore          8
		if(map.isEmpty())
	//*   3    6:aload           8
	//*   4    8:invokeinterface #222 <Method boolean Map.isEmpty()>
	//*   5   13:ifeq            17
			return;
	//    6   16:return          
		String s = "";
	//    7   17:ldc1            #224 <String "">
	//    8   19:astore          7
		boolean flag1 = viewinjection.getRequiredBindings().isEmpty();
	//    9   21:aload_2         
	//   10   22:invokevirtual   #228 <Method List ViewInjection.getRequiredBindings()>
	//   11   25:invokeinterface #229 <Method boolean List.isEmpty()>
	//   12   30:istore          6
		viewinjection = ((ViewInjection) (s));
	//   13   32:aload           7
	//   14   34:astore_2        
		if(flag1)
	//*  15   35:iload           6
	//*  16   37:ifeq            50
		{
			stringbuilder.append("    if (view != null) {\n");
	//   17   40:aload_1         
	//   18   41:ldc1            #231 <String "    if (view != null) {\n">
	//   19   43:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   20   46:pop             
			viewinjection = "  ";
	//   21   47:ldc1            #233 <String "  ">
	//   22   49:astore_2        
		}
		for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); stringbuilder.append("      });\n"))
	//*  23   50:aload           8
	//*  24   52:invokeinterface #198 <Method Set Map.entrySet()>
	//*  25   57:invokeinterface #201 <Method Iterator Set.iterator()>
	//*  26   62:astore          7
	//*  27   64:aload           7
	//*  28   66:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//*  29   71:ifeq            822
		{
			Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   30   74:aload           7
	//   31   76:invokeinterface #188 <Method Object Iterator.next()>
	//   32   81:checkcast       #203 <Class java.util.Map$Entry>
	//   33   84:astore          8
			Object obj1 = ((Object) ((ListenerClass)((java.util.Map.Entry) (obj)).getKey()));
	//   34   86:aload           8
	//   35   88:invokeinterface #206 <Method Object java.util.Map$Entry.getKey()>
	//   36   93:checkcast       #235 <Class ListenerClass>
	//   37   96:astore          9
			obj = ((Object) ((Map)((java.util.Map.Entry) (obj)).getValue()));
	//   38   98:aload           8
	//   39  100:invokeinterface #209 <Method Object java.util.Map$Entry.getValue()>
	//   40  105:checkcast       #169 <Class Map>
	//   41  108:astore          8
			boolean flag = "android.view.View".equals(((Object) (((ListenerClass) (obj1)).targetType()))) ^ true;
	//   42  110:ldc1            #39  <String "android.view.View">
	//   43  112:aload           9
	//   44  114:invokeinterface #238 <Method String ListenerClass.targetType()>
	//   45  119:invokevirtual   #48  <Method boolean String.equals(Object)>
	//   46  122:iconst_1        
	//   47  123:ixor            
	//   48  124:istore          4
			stringbuilder.append(((String) (viewinjection)));
	//   49  126:aload_1         
	//   50  127:aload_2         
	//   51  128:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   52  131:pop             
			stringbuilder.append("    ");
	//   53  132:aload_1         
	//   54  133:ldc1            #163 <String "    ">
	//   55  135:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   56  138:pop             
			if(flag)
	//*  57  139:iload           4
	//*  58  141:ifeq            232
			{
				stringbuilder.append("((");
	//   59  144:aload_1         
	//   60  145:ldc1            #240 <String "((">
	//   61  147:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   62  150:pop             
				stringbuilder.append(((ListenerClass) (obj1)).targetType());
	//   63  151:aload_1         
	//   64  152:aload           9
	//   65  154:invokeinterface #238 <Method String ListenerClass.targetType()>
	//   66  159:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   67  162:pop             
				if(((ListenerClass) (obj1)).genericArguments() > 0)
	//*  68  163:aload           9
	//*  69  165:invokeinterface #243 <Method int ListenerClass.genericArguments()>
	//*  70  170:ifle            225
				{
					stringbuilder.append('<');
	//   71  173:aload_1         
	//   72  174:bipush          60
	//   73  176:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//   74  179:pop             
					for(int i = 0; i < ((ListenerClass) (obj1)).genericArguments(); i++)
	//*  75  180:iconst_0        
	//*  76  181:istore_3        
	//*  77  182:iload_3         
	//*  78  183:aload           9
	//*  79  185:invokeinterface #243 <Method int ListenerClass.genericArguments()>
	//*  80  190:icmpge          218
					{
						if(i > 0)
	//*  81  193:iload_3         
	//*  82  194:ifle            204
							stringbuilder.append(", ");
	//   83  197:aload_1         
	//   84  198:ldc1            #149 <String ", ">
	//   85  200:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   86  203:pop             
						stringbuilder.append('?');
	//   87  204:aload_1         
	//   88  205:bipush          63
	//   89  207:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//   90  210:pop             
					}

	//   91  211:iload_3         
	//   92  212:iconst_1        
	//   93  213:iadd            
	//   94  214:istore_3        
	//*  95  215:goto            182
					stringbuilder.append('>');
	//   96  218:aload_1         
	//   97  219:bipush          62
	//   98  221:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//   99  224:pop             
				}
				stringbuilder.append(") ");
	//  100  225:aload_1         
	//  101  226:ldc1            #59  <String ") ">
	//  102  228:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  103  231:pop             
			}
			stringbuilder.append("view");
	//  104  232:aload_1         
	//  105  233:ldc1            #245 <String "view">
	//  106  235:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  107  238:pop             
			if(flag)
	//* 108  239:iload           4
	//* 109  241:ifeq            251
				stringbuilder.append(')');
	//  110  244:aload_1         
	//  111  245:bipush          41
	//  112  247:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//  113  250:pop             
			stringbuilder.append('.');
	//  114  251:aload_1         
	//  115  252:bipush          46
	//  116  254:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//  117  257:pop             
			stringbuilder.append(((ListenerClass) (obj1)).setter());
	//  118  258:aload_1         
	//  119  259:aload           9
	//  120  261:invokeinterface #248 <Method String ListenerClass.setter()>
	//  121  266:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  122  269:pop             
			stringbuilder.append("(\n");
	//  123  270:aload_1         
	//  124  271:ldc1            #250 <String "(\n">
	//  125  273:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  126  276:pop             
			stringbuilder.append(((String) (viewinjection)));
	//  127  277:aload_1         
	//  128  278:aload_2         
	//  129  279:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  130  282:pop             
			stringbuilder.append("      new ");
	//  131  283:aload_1         
	//  132  284:ldc1            #252 <String "      new ">
	//  133  286:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  134  289:pop             
			stringbuilder.append(((ListenerClass) (obj1)).type());
	//  135  290:aload_1         
	//  136  291:aload           9
	//  137  293:invokeinterface #255 <Method String ListenerClass.type()>
	//  138  298:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  139  301:pop             
			stringbuilder.append("() {\n");
	//  140  302:aload_1         
	//  141  303:ldc2            #257 <String "() {\n">
	//  142  306:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  143  309:pop             
			for(obj1 = ((Object) (getListenerMethods(((ListenerClass) (obj1))).iterator())); ((Iterator) (obj1)).hasNext(); stringbuilder.append("        }\n"))
	//* 144  310:aload           9
	//* 145  312:invokestatic    #261 <Method List getListenerMethods(ListenerClass)>
	//* 146  315:invokeinterface #262 <Method Iterator List.iterator()>
	//* 147  320:astore          9
	//* 148  322:aload           9
	//* 149  324:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//* 150  329:ifeq            805
			{
				ListenerMethod listenermethod = (ListenerMethod)((Iterator) (obj1)).next();
	//  151  332:aload           9
	//  152  334:invokeinterface #188 <Method Object Iterator.next()>
	//  153  339:checkcast       #264 <Class ListenerMethod>
	//  154  342:astore          10
				stringbuilder.append(((String) (viewinjection)));
	//  155  344:aload_1         
	//  156  345:aload_2         
	//  157  346:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  158  349:pop             
				stringbuilder.append("        @Override public ");
	//  159  350:aload_1         
	//  160  351:ldc2            #266 <String "        @Override public ">
	//  161  354:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  162  357:pop             
				stringbuilder.append(listenermethod.returnType());
	//  163  358:aload_1         
	//  164  359:aload           10
	//  165  361:invokeinterface #269 <Method String ListenerMethod.returnType()>
	//  166  366:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  167  369:pop             
				stringbuilder.append(' ');
	//  168  370:aload_1         
	//  169  371:bipush          32
	//  170  373:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//  171  376:pop             
				stringbuilder.append(listenermethod.name());
	//  172  377:aload_1         
	//  173  378:aload           10
	//  174  380:invokeinterface #272 <Method String ListenerMethod.name()>
	//  175  385:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  176  388:pop             
				stringbuilder.append("(\n");
	//  177  389:aload_1         
	//  178  390:ldc1            #250 <String "(\n">
	//  179  392:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  180  395:pop             
				String as[] = listenermethod.parameters();
	//  181  396:aload           10
	//  182  398:invokeinterface #276 <Method String[] ListenerMethod.parameters()>
	//  183  403:astore          11
				int l = as.length;
	//  184  405:aload           11
	//  185  407:arraylength     
	//  186  408:istore          4
				for(int j = 0; j < l; j++)
	//* 187  410:iconst_0        
	//* 188  411:istore_3        
	//* 189  412:iload_3         
	//* 190  413:iload           4
	//* 191  415:icmpge          484
				{
					stringbuilder.append(((String) (viewinjection)));
	//  192  418:aload_1         
	//  193  419:aload_2         
	//  194  420:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  195  423:pop             
					stringbuilder.append("          ");
	//  196  424:aload_1         
	//  197  425:ldc2            #278 <String "          ">
	//  198  428:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  199  431:pop             
					stringbuilder.append(as[j]);
	//  200  432:aload_1         
	//  201  433:aload           11
	//  202  435:iload_3         
	//  203  436:aaload          
	//  204  437:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  205  440:pop             
					stringbuilder.append(" p");
	//  206  441:aload_1         
	//  207  442:ldc2            #280 <String " p">
	//  208  445:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  209  448:pop             
					stringbuilder.append(j);
	//  210  449:aload_1         
	//  211  450:iload_3         
	//  212  451:invokevirtual   #119 <Method StringBuilder StringBuilder.append(int)>
	//  213  454:pop             
					if(j < l - 1)
	//* 214  455:iload_3         
	//* 215  456:iload           4
	//* 216  458:iconst_1        
	//* 217  459:isub            
	//* 218  460:icmpge          470
						stringbuilder.append(',');
	//  219  463:aload_1         
	//  220  464:bipush          44
	//  221  466:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//  222  469:pop             
					stringbuilder.append('\n');
	//  223  470:aload_1         
	//  224  471:bipush          10
	//  225  473:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//  226  476:pop             
				}

	//  227  477:iload_3         
	//  228  478:iconst_1        
	//  229  479:iadd            
	//  230  480:istore_3        
	//* 231  481:goto            412
				stringbuilder.append(((String) (viewinjection)));
	//  232  484:aload_1         
	//  233  485:aload_2         
	//  234  486:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  235  489:pop             
				stringbuilder.append("        ) {\n");
	//  236  490:aload_1         
	//  237  491:ldc2            #282 <String "        ) {\n">
	//  238  494:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  239  497:pop             
				stringbuilder.append(((String) (viewinjection)));
	//  240  498:aload_1         
	//  241  499:aload_2         
	//  242  500:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  243  503:pop             
				stringbuilder.append("          ");
	//  244  504:aload_1         
	//  245  505:ldc2            #278 <String "          ">
	//  246  508:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  247  511:pop             
				int k = ((int) ("void".equals(((Object) (listenermethod.returnType()))) ^ true));
	//  248  512:ldc2            #284 <String "void">
	//  249  515:aload           10
	//  250  517:invokeinterface #269 <Method String ListenerMethod.returnType()>
	//  251  522:invokevirtual   #48  <Method boolean String.equals(Object)>
	//  252  525:iconst_1        
	//  253  526:ixor            
	//  254  527:istore_3        
				if(k != 0)
	//* 255  528:iload_3         
	//* 256  529:ifeq            540
					stringbuilder.append("return ");
	//  257  532:aload_1         
	//  258  533:ldc2            #286 <String "return ">
	//  259  536:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  260  539:pop             
				if(((Map) (obj)).containsKey(((Object) (listenermethod))))
	//* 261  540:aload           8
	//* 262  542:aload           10
	//* 263  544:invokeinterface #289 <Method boolean Map.containsKey(Object)>
	//* 264  549:ifeq            758
				{
					Iterator iterator1 = ((Set)((Map) (obj)).get(((Object) (listenermethod)))).iterator();
	//  265  552:aload           8
	//  266  554:aload           10
	//  267  556:invokeinterface #292 <Method Object Map.get(Object)>
	//  268  561:checkcast       #200 <Class Set>
	//  269  564:invokeinterface #201 <Method Iterator Set.iterator()>
	//  270  569:astore          11
					do
					{
						if(!iterator1.hasNext())
							break;
	//  271  571:aload           11
	//  272  573:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//  273  578:ifeq            781
						Object obj2 = ((Object) ((ListenerBinding)iterator1.next()));
	//  274  581:aload           11
	//  275  583:invokeinterface #188 <Method Object Iterator.next()>
	//  276  588:checkcast       #294 <Class ListenerBinding>
	//  277  591:astore          12
						stringbuilder.append("target.");
	//  278  593:aload_1         
	//  279  594:ldc2            #296 <String "target.">
	//  280  597:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  281  600:pop             
						stringbuilder.append(((ListenerBinding) (obj2)).getName());
	//  282  601:aload_1         
	//  283  602:aload           12
	//  284  604:invokevirtual   #297 <Method String ListenerBinding.getName()>
	//  285  607:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  286  610:pop             
						stringbuilder.append('(');
	//  287  611:aload_1         
	//  288  612:bipush          40
	//  289  614:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//  290  617:pop             
						obj2 = ((Object) (((ListenerBinding) (obj2)).getParameters()));
	//  291  618:aload           12
	//  292  620:invokevirtual   #300 <Method List ListenerBinding.getParameters()>
	//  293  623:astore          12
						String as1[] = listenermethod.parameters();
	//  294  625:aload           10
	//  295  627:invokeinterface #276 <Method String[] ListenerMethod.parameters()>
	//  296  632:astore          13
						int i1 = ((List) (obj2)).size();
	//  297  634:aload           12
	//  298  636:invokeinterface #136 <Method int List.size()>
	//  299  641:istore          4
						for(k = 0; k < i1; k++)
	//* 300  643:iconst_0        
	//* 301  644:istore_3        
	//* 302  645:iload_3         
	//* 303  646:iload           4
	//* 304  648:icmpge          721
						{
							Parameter parameter = (Parameter)((List) (obj2)).get(k);
	//  305  651:aload           12
	//  306  653:iload_3         
	//  307  654:invokeinterface #140 <Method Object List.get(int)>
	//  308  659:checkcast       #302 <Class Parameter>
	//  309  662:astore          14
							int j1 = parameter.getListenerPosition();
	//  310  664:aload           14
	//  311  666:invokevirtual   #305 <Method int Parameter.getListenerPosition()>
	//  312  669:istore          5
							emitCastIfNeeded(stringbuilder, as1[j1], parameter.getType());
	//  313  671:aload_1         
	//  314  672:aload           13
	//  315  674:iload           5
	//  316  676:aaload          
	//  317  677:aload           14
	//  318  679:invokevirtual   #306 <Method String Parameter.getType()>
	//  319  682:invokestatic    #42  <Method void emitCastIfNeeded(StringBuilder, String, String)>
							stringbuilder.append('p');
	//  320  685:aload_1         
	//  321  686:bipush          112
	//  322  688:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//  323  691:pop             
							stringbuilder.append(j1);
	//  324  692:aload_1         
	//  325  693:iload           5
	//  326  695:invokevirtual   #119 <Method StringBuilder StringBuilder.append(int)>
	//  327  698:pop             
							if(k < i1 - 1)
	//* 328  699:iload_3         
	//* 329  700:iload           4
	//* 330  702:iconst_1        
	//* 331  703:isub            
	//* 332  704:icmpge          714
								stringbuilder.append(", ");
	//  333  707:aload_1         
	//  334  708:ldc1            #149 <String ", ">
	//  335  710:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  336  713:pop             
						}

	//  337  714:iload_3         
	//  338  715:iconst_1        
	//  339  716:iadd            
	//  340  717:istore_3        
	//* 341  718:goto            645
						stringbuilder.append(");");
	//  342  721:aload_1         
	//  343  722:ldc2            #308 <String ");">
	//  344  725:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  345  728:pop             
						if(iterator1.hasNext())
	//* 346  729:aload           11
	//* 347  731:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//* 348  736:ifeq            571
						{
							stringbuilder.append("\n");
	//  349  739:aload_1         
	//  350  740:ldc2            #310 <String "\n">
	//  351  743:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  352  746:pop             
							stringbuilder.append("          ");
	//  353  747:aload_1         
	//  354  748:ldc2            #278 <String "          ">
	//  355  751:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  356  754:pop             
						}
					} while(true);
	//  357  755:goto            571
				} else
				if(k != 0)
	//* 358  758:iload_3         
	//* 359  759:ifeq            781
				{
					stringbuilder.append(listenermethod.defaultReturn());
	//  360  762:aload_1         
	//  361  763:aload           10
	//  362  765:invokeinterface #313 <Method String ListenerMethod.defaultReturn()>
	//  363  770:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  364  773:pop             
					stringbuilder.append(';');
	//  365  774:aload_1         
	//  366  775:bipush          59
	//  367  777:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//  368  780:pop             
				}
				stringbuilder.append('\n');
	//  369  781:aload_1         
	//  370  782:bipush          10
	//  371  784:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//  372  787:pop             
				stringbuilder.append(((String) (viewinjection)));
	//  373  788:aload_1         
	//  374  789:aload_2         
	//  375  790:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  376  793:pop             
			}

	//  377  794:aload_1         
	//  378  795:ldc2            #315 <String "        }\n">
	//  379  798:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  380  801:pop             
	//* 381  802:goto            322
			stringbuilder.append(((String) (viewinjection)));
	//  382  805:aload_1         
	//  383  806:aload_2         
	//  384  807:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  385  810:pop             
		}

	//  386  811:aload_1         
	//  387  812:ldc2            #317 <String "      });\n">
	//  388  815:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  389  818:pop             
	//* 390  819:goto            64
		if(flag1)
	//* 391  822:iload           6
	//* 392  824:ifeq            835
			stringbuilder.append("    }\n");
	//  393  827:aload_1         
	//  394  828:ldc2            #319 <String "    }\n">
	//  395  831:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//  396  834:pop             
	//  397  835:return          
	}

	private void emitReset(StringBuilder stringbuilder)
	{
		stringbuilder.append("  public static void reset(");
	//    0    0:aload_1         
	//    1    1:ldc2            #322 <String "  public static void reset(">
	//    2    4:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    3    7:pop             
		stringbuilder.append(targetClass);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field String targetClass>
	//    7   13:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(" target) {\n");
	//    9   17:aload_1         
	//   10   18:ldc2            #324 <String " target) {\n">
	//   11   21:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		if(parentInjector != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #161 <Field String parentInjector>
	//*  15   29:ifnull          56
		{
			stringbuilder.append("    ");
	//   16   32:aload_1         
	//   17   33:ldc1            #163 <String "    ">
	//   18   35:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			stringbuilder.append(parentInjector);
	//   20   39:aload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #161 <Field String parentInjector>
	//   23   44:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			stringbuilder.append(".reset(target);\n\n");
	//   25   48:aload_1         
	//   26   49:ldc2            #326 <String ".reset(target);\n\n">
	//   27   52:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
		}
		for(Iterator iterator = viewIdMap.values().iterator(); iterator.hasNext();)
	//*  29   56:aload_0         
	//*  30   57:getfield        #26  <Field Map viewIdMap>
	//*  31   60:invokeinterface #173 <Method Collection Map.values()>
	//*  32   65:invokeinterface #179 <Method Iterator Collection.iterator()>
	//*  33   70:astore_2        
	//*  34   71:aload_2         
	//*  35   72:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//*  36   77:ifeq            146
		{
			Iterator iterator2 = ((ViewInjection)iterator.next()).getViewBindings().iterator();
	//   37   80:aload_2         
	//   38   81:invokeinterface #188 <Method Object Iterator.next()>
	//   39   86:checkcast       #190 <Class ViewInjection>
	//   40   89:invokevirtual   #329 <Method Collection ViewInjection.getViewBindings()>
	//   41   92:invokeinterface #179 <Method Iterator Collection.iterator()>
	//   42   97:astore_3        
			while(iterator2.hasNext()) 
	//*  43   98:aload_3         
	//*  44   99:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//*  45  104:ifeq            71
			{
				ViewBinding viewbinding = (ViewBinding)iterator2.next();
	//   46  107:aload_3         
	//   47  108:invokeinterface #188 <Method Object Iterator.next()>
	//   48  113:checkcast       #331 <Class ViewBinding>
	//   49  116:astore          4
				stringbuilder.append("    target.");
	//   50  118:aload_1         
	//   51  119:ldc1            #63  <String "    target.">
	//   52  121:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   53  124:pop             
				stringbuilder.append(viewbinding.getName());
	//   54  125:aload_1         
	//   55  126:aload           4
	//   56  128:invokevirtual   #332 <Method String ViewBinding.getName()>
	//   57  131:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   58  134:pop             
				stringbuilder.append(" = null;\n");
	//   59  135:aload_1         
	//   60  136:ldc2            #334 <String " = null;\n">
	//   61  139:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   62  142:pop             
			}
		}

	//*  63  143:goto            98
		for(Iterator iterator1 = collectionBindings.keySet().iterator(); iterator1.hasNext(); stringbuilder.append(" = null;\n"))
	//*  64  146:aload_0         
	//*  65  147:getfield        #28  <Field Map collectionBindings>
	//*  66  150:invokeinterface #337 <Method Set Map.keySet()>
	//*  67  155:invokeinterface #201 <Method Iterator Set.iterator()>
	//*  68  160:astore_2        
	//*  69  161:aload_2         
	//*  70  162:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//*  71  167:ifeq            207
		{
			CollectionBinding collectionbinding = (CollectionBinding)iterator1.next();
	//   72  170:aload_2         
	//   73  171:invokeinterface #188 <Method Object Iterator.next()>
	//   74  176:checkcast       #65  <Class CollectionBinding>
	//   75  179:astore_3        
			stringbuilder.append("    target.");
	//   76  180:aload_1         
	//   77  181:ldc1            #63  <String "    target.">
	//   78  183:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   79  186:pop             
			stringbuilder.append(collectionbinding.getName());
	//   80  187:aload_1         
	//   81  188:aload_3         
	//   82  189:invokevirtual   #69  <Method String CollectionBinding.getName()>
	//   83  192:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   84  195:pop             
		}

	//   85  196:aload_1         
	//   86  197:ldc2            #334 <String " = null;\n">
	//   87  200:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   88  203:pop             
	//*  89  204:goto            161
		stringbuilder.append("  }\n");
	//   90  207:aload_1         
	//   91  208:ldc1            #214 <String "  }\n">
	//   92  210:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   93  213:pop             
	//   94  214:return          
	}

	private void emitViewBindings(StringBuilder stringbuilder, ViewInjection viewinjection)
	{
		viewinjection = ((ViewInjection) (viewinjection.getViewBindings()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #329 <Method Collection ViewInjection.getViewBindings()>
	//    2    4:astore_2        
		if(((Collection) (viewinjection)).isEmpty())
	//*   3    5:aload_2         
	//*   4    6:invokeinterface #339 <Method boolean Collection.isEmpty()>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		for(viewinjection = ((ViewInjection) (((Collection) (viewinjection)).iterator())); ((Iterator) (viewinjection)).hasNext(); stringbuilder.append("view;\n"))
	//*   7   15:aload_2         
	//*   8   16:invokeinterface #179 <Method Iterator Collection.iterator()>
	//*   9   21:astore_2        
	//*  10   22:aload_2         
	//*  11   23:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//*  12   28:ifeq            83
		{
			ViewBinding viewbinding = (ViewBinding)((Iterator) (viewinjection)).next();
	//   13   31:aload_2         
	//   14   32:invokeinterface #188 <Method Object Iterator.next()>
	//   15   37:checkcast       #331 <Class ViewBinding>
	//   16   40:astore_3        
			stringbuilder.append("    target.");
	//   17   41:aload_1         
	//   18   42:ldc1            #63  <String "    target.">
	//   19   44:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   20   47:pop             
			stringbuilder.append(viewbinding.getName());
	//   21   48:aload_1         
	//   22   49:aload_3         
	//   23   50:invokevirtual   #332 <Method String ViewBinding.getName()>
	//   24   53:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   25   56:pop             
			stringbuilder.append(" = ");
	//   26   57:aload_1         
	//   27   58:ldc1            #71  <String " = ">
	//   28   60:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
			emitCastIfNeeded(stringbuilder, viewbinding.getType());
	//   30   64:aload_1         
	//   31   65:aload_3         
	//   32   66:invokevirtual   #340 <Method String ViewBinding.getType()>
	//   33   69:invokestatic    #110 <Method void emitCastIfNeeded(StringBuilder, String)>
		}

	//   34   72:aload_1         
	//   35   73:ldc2            #342 <String "view;\n">
	//   36   76:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   37   79:pop             
	//*  38   80:goto            22
	//   39   83:return          
	}

	private void emitViewInjection(StringBuilder stringbuilder, ViewInjection viewinjection)
	{
		stringbuilder.append("    view = ");
	//    0    0:aload_1         
	//    1    1:ldc2            #344 <String "    view = ">
	//    2    4:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    3    7:pop             
		List list = viewinjection.getRequiredBindings();
	//    4    8:aload_2         
	//    5    9:invokevirtual   #228 <Method List ViewInjection.getRequiredBindings()>
	//    6   12:astore_3        
		if(list.isEmpty())
	//*   7   13:aload_3         
	//*   8   14:invokeinterface #229 <Method boolean List.isEmpty()>
	//*   9   19:ifeq            49
		{
			stringbuilder.append("finder.findOptionalView(source, ");
	//   10   22:aload_1         
	//   11   23:ldc1            #125 <String "finder.findOptionalView(source, ">
	//   12   25:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
			stringbuilder.append(viewinjection.getId());
	//   14   29:aload_1         
	//   15   30:aload_2         
	//   16   31:invokevirtual   #347 <Method int ViewInjection.getId()>
	//   17   34:invokevirtual   #119 <Method StringBuilder StringBuilder.append(int)>
	//   18   37:pop             
			stringbuilder.append(");\n");
	//   19   38:aload_1         
	//   20   39:ldc2            #349 <String ");\n">
	//   21   42:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
		} else
	//*  23   46:goto            104
		if(viewinjection.getId() == -1)
	//*  24   49:aload_2         
	//*  25   50:invokevirtual   #347 <Method int ViewInjection.getId()>
	//*  26   53:iconst_m1       
	//*  27   54:icmpne          68
		{
			stringbuilder.append("target;\n");
	//   28   57:aload_1         
	//   29   58:ldc2            #351 <String "target;\n">
	//   30   61:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
		} else
	//*  32   65:goto            104
		{
			stringbuilder.append("finder.findRequiredView(source, ");
	//   33   68:aload_1         
	//   34   69:ldc1            #116 <String "finder.findRequiredView(source, ">
	//   35   71:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
			stringbuilder.append(viewinjection.getId());
	//   37   75:aload_1         
	//   38   76:aload_2         
	//   39   77:invokevirtual   #347 <Method int ViewInjection.getId()>
	//   40   80:invokevirtual   #119 <Method StringBuilder StringBuilder.append(int)>
	//   41   83:pop             
			stringbuilder.append(", \"");
	//   42   84:aload_1         
	//   43   85:ldc1            #121 <String ", \"">
	//   44   87:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   45   90:pop             
			emitHumanDescription(stringbuilder, list);
	//   46   91:aload_1         
	//   47   92:aload_3         
	//   48   93:invokestatic    #353 <Method void emitHumanDescription(StringBuilder, List)>
			stringbuilder.append("\");\n");
	//   49   96:aload_1         
	//   50   97:ldc2            #355 <String "\");\n">
	//   51  100:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   52  103:pop             
		}
		emitViewBindings(stringbuilder, viewinjection);
	//   53  104:aload_0         
	//   54  105:aload_1         
	//   55  106:aload_2         
	//   56  107:invokespecial   #357 <Method void emitViewBindings(StringBuilder, ViewInjection)>
		emitListenerBindings(stringbuilder, viewinjection);
	//   57  110:aload_0         
	//   58  111:aload_1         
	//   59  112:aload_2         
	//   60  113:invokespecial   #359 <Method void emitListenerBindings(StringBuilder, ViewInjection)>
	//   61  116:return          
	}

	static List getListenerMethods(ListenerClass listenerclass)
	{
		if(listenerclass.method().length == 1)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #365 <Method ListenerMethod[] ListenerClass.method()>
	//*   2    6:arraylength     
	//*   3    7:iconst_1        
	//*   4    8:icmpne          21
			return Arrays.asList(((Object []) (listenerclass.method())));
	//    5   11:aload_0         
	//    6   12:invokeinterface #365 <Method ListenerMethod[] ListenerClass.method()>
	//    7   17:invokestatic    #371 <Method List Arrays.asList(Object[])>
	//    8   20:areturn         
		int i;
		int j;
		ArrayList arraylist;
		Enum aenum[];
		Enum enum;
		ListenerMethod listenermethod;
		try
		{
			arraylist = new ArrayList();
	//    9   21:new             #373 <Class ArrayList>
	//   10   24:dup             
	//   11   25:invokespecial   #374 <Method void ArrayList()>
	//   12   28:astore_3        
			listenerclass = ((ListenerClass) (listenerclass.callbacks()));
	//   13   29:aload_0         
	//   14   30:invokeinterface #378 <Method Class ListenerClass.callbacks()>
	//   15   35:astore_0        
			aenum = (Enum[])((Class) (listenerclass)).getEnumConstants();
	//   16   36:aload_0         
	//   17   37:invokevirtual   #384 <Method Object[] Class.getEnumConstants()>
	//   18   40:checkcast       #386 <Class Enum[]>
	//   19   43:astore          4
			j = aenum.length;
	//   20   45:aload           4
	//   21   47:arraylength     
	//   22   48:istore_2        
		}
	//*  23   49:iconst_0        
	//*  24   50:istore_1        
	//*  25   51:iload_1         
	//*  26   52:iload_2         
	//*  27   53:icmpge          155
	//*  28   56:aload           4
	//*  29   58:iload_1         
	//*  30   59:aaload          
	//*  31   60:astore          5
	//*  32   62:aload_0         
	//*  33   63:aload           5
	//*  34   65:invokevirtual   #389 <Method String Enum.name()>
	//*  35   68:invokevirtual   #393 <Method Field Class.getField(String)>
	//*  36   71:ldc2            #264 <Class ListenerMethod>
	//*  37   74:invokevirtual   #399 <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//*  38   77:checkcast       #264 <Class ListenerMethod>
	//*  39   80:astore          6
	//*  40   82:aload           6
	//*  41   84:ifnonnull       139
	//*  42   87:new             #93  <Class IllegalStateException>
	//*  43   90:dup             
	//*  44   91:ldc2            #401 <String "@%s's %s.%s missing @%s annotation.">
	//*  45   94:iconst_4        
	//*  46   95:anewarray       Object[]
	//*  47   98:dup             
	//*  48   99:iconst_0        
	//*  49  100:aload_0         
	//*  50  101:invokevirtual   #404 <Method Class Class.getEnclosingClass()>
	//*  51  104:invokevirtual   #407 <Method String Class.getSimpleName()>
	//*  52  107:aastore         
	//*  53  108:dup             
	//*  54  109:iconst_1        
	//*  55  110:aload_0         
	//*  56  111:invokevirtual   #407 <Method String Class.getSimpleName()>
	//*  57  114:aastore         
	//*  58  115:dup             
	//*  59  116:iconst_2        
	//*  60  117:aload           5
	//*  61  119:invokevirtual   #389 <Method String Enum.name()>
	//*  62  122:aastore         
	//*  63  123:dup             
	//*  64  124:iconst_3        
	//*  65  125:ldc2            #264 <Class ListenerMethod>
	//*  66  128:invokevirtual   #407 <Method String Class.getSimpleName()>
	//*  67  131:aastore         
	//*  68  132:invokestatic    #411 <Method String String.format(String, Object[])>
	//*  69  135:invokespecial   #99  <Method void IllegalStateException(String)>
	//*  70  138:athrow          
	//*  71  139:aload_3         
	//*  72  140:aload           6
	//*  73  142:invokeinterface #414 <Method boolean List.add(Object)>
	//*  74  147:pop             
	//*  75  148:iload_1         
	//*  76  149:iconst_1        
	//*  77  150:iadd            
	//*  78  151:istore_1        
	//*  79  152:goto            51
	//*  80  155:aload_3         
	//*  81  156:areturn         
		// Misplaced declaration of an exception variable
		catch(ListenerClass listenerclass)
	//*  82  157:astore_0        
		{
			throw new AssertionError(((Object) (listenerclass)));
	//   83  158:new             #416 <Class AssertionError>
	//   84  161:dup             
	//   85  162:aload_0         
	//   86  163:invokespecial   #419 <Method void AssertionError(Object)>
	//   87  166:athrow          
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		enum = aenum[i];
		listenermethod = (ListenerMethod)((Class) (listenerclass)).getField(enum.name()).getAnnotation(butterknife/internal/ListenerMethod);
		if(listenermethod != null)
			break MISSING_BLOCK_LABEL_139;
		throw new IllegalStateException(String.format("@%s's %s.%s missing @%s annotation.", new Object[] {
			((Class) (listenerclass)).getEnclosingClass().getSimpleName(), ((Class) (listenerclass)).getSimpleName(), enum.name(), ((Class) (butterknife/internal/ListenerMethod)).getSimpleName()
		}));
		((List) (arraylist)).add(((Object) (listenermethod)));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_51;
_L1:
		return ((List) (arraylist));
	}

	private ViewInjection getOrCreateViewInjection(int i)
	{
		ViewInjection viewinjection1 = (ViewInjection)viewIdMap.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map viewIdMap>
	//    2    4:iload_1         
	//    3    5:invokestatic    #428 <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #292 <Method Object Map.get(Object)>
	//    5   13:checkcast       #190 <Class ViewInjection>
	//    6   16:astore_3        
		ViewInjection viewinjection = viewinjection1;
	//    7   17:aload_3         
	//    8   18:astore_2        
		if(viewinjection1 == null)
	//*   9   19:aload_3         
	//*  10   20:ifnonnull       47
		{
			viewinjection = new ViewInjection(i);
	//   11   23:new             #190 <Class ViewInjection>
	//   12   26:dup             
	//   13   27:iload_1         
	//   14   28:invokespecial   #431 <Method void ViewInjection(int)>
	//   15   31:astore_2        
			viewIdMap.put(((Object) (Integer.valueOf(i))), ((Object) (viewinjection)));
	//   16   32:aload_0         
	//   17   33:getfield        #26  <Field Map viewIdMap>
	//   18   36:iload_1         
	//   19   37:invokestatic    #428 <Method Integer Integer.valueOf(int)>
	//   20   40:aload_2         
	//   21   41:invokeinterface #435 <Method Object Map.put(Object, Object)>
	//   22   46:pop             
		}
		return viewinjection;
	//   23   47:aload_2         
	//   24   48:areturn         
	}

	void addCollection(int ai[], CollectionBinding collectionbinding)
	{
		collectionBindings.put(((Object) (collectionbinding)), ((Object) (ai)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Map collectionBindings>
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokeinterface #435 <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	boolean addListener(int i, ListenerClass listenerclass, ListenerMethod listenermethod, ListenerBinding listenerbinding)
	{
		ViewInjection viewinjection = getOrCreateViewInjection(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #441 <Method ViewInjection getOrCreateViewInjection(int)>
	//    3    5:astore          5
		if(viewinjection.hasListenerBinding(listenerclass, listenermethod) && !"void".equals(((Object) (listenermethod.returnType()))))
	//*   4    7:aload           5
	//*   5    9:aload_2         
	//*   6   10:aload_3         
	//*   7   11:invokevirtual   #445 <Method boolean ViewInjection.hasListenerBinding(ListenerClass, ListenerMethod)>
	//*   8   14:ifeq            34
	//*   9   17:ldc2            #284 <String "void">
	//*  10   20:aload_3         
	//*  11   21:invokeinterface #269 <Method String ListenerMethod.returnType()>
	//*  12   26:invokevirtual   #48  <Method boolean String.equals(Object)>
	//*  13   29:ifne            34
		{
			return false;
	//   14   32:iconst_0        
	//   15   33:ireturn         
		} else
		{
			viewinjection.addListenerBinding(listenerclass, listenermethod, listenerbinding);
	//   16   34:aload           5
	//   17   36:aload_2         
	//   18   37:aload_3         
	//   19   38:aload           4
	//   20   40:invokevirtual   #449 <Method void ViewInjection.addListenerBinding(ListenerClass, ListenerMethod, ListenerBinding)>
			return true;
	//   21   43:iconst_1        
	//   22   44:ireturn         
		}
	}

	void addView(int i, ViewBinding viewbinding)
	{
		getOrCreateViewInjection(i).addViewBinding(viewbinding);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #441 <Method ViewInjection getOrCreateViewInjection(int)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #455 <Method void ViewInjection.addViewBinding(ViewBinding)>
	//    5    9:return          
	}

	String brewJava()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #86  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("// Generated code from Butter Knife. Do not modify!\n");
	//    4    8:aload_1         
	//    5    9:ldc2            #458 <String "// Generated code from Butter Knife. Do not modify!\n">
	//    6   12:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append("package ");
	//    8   16:aload_1         
	//    9   17:ldc2            #460 <String "package ">
	//   10   20:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(classPackage);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #30  <Field String classPackage>
	//   15   29:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(";\n\n");
	//   17   33:aload_1         
	//   18   34:ldc2            #462 <String ";\n\n">
	//   19   37:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
		stringbuilder.append("import android.view.View;\n");
	//   21   41:aload_1         
	//   22   42:ldc2            #464 <String "import android.view.View;\n">
	//   23   45:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
		stringbuilder.append("import butterknife.ButterKnife.Finder;\n\n");
	//   25   49:aload_1         
	//   26   50:ldc2            #466 <String "import butterknife.ButterKnife.Finder;\n\n">
	//   27   53:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		stringbuilder.append("public class ");
	//   29   57:aload_1         
	//   30   58:ldc2            #468 <String "public class ">
	//   31   61:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
		stringbuilder.append(className);
	//   33   65:aload_1         
	//   34   66:aload_0         
	//   35   67:getfield        #32  <Field String className>
	//   36   70:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
		stringbuilder.append(" {\n");
	//   38   74:aload_1         
	//   39   75:ldc2            #470 <String " {\n">
	//   40   78:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   41   81:pop             
		emitInject(stringbuilder);
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:invokespecial   #472 <Method void emitInject(StringBuilder)>
		stringbuilder.append('\n');
	//   45   87:aload_1         
	//   46   88:bipush          10
	//   47   90:invokevirtual   #54  <Method StringBuilder StringBuilder.append(char)>
	//   48   93:pop             
		emitReset(stringbuilder);
	//   49   94:aload_0         
	//   50   95:aload_1         
	//   51   96:invokespecial   #474 <Method void emitReset(StringBuilder)>
		stringbuilder.append("}\n");
	//   52   99:aload_1         
	//   53  100:ldc2            #476 <String "}\n">
	//   54  103:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   55  106:pop             
		return stringbuilder.toString();
	//   56  107:aload_1         
	//   57  108:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   58  111:areturn         
	}

	String getFqcn()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #86  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(classPackage);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field String classPackage>
	//    7   13:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(".");
	//    9   17:aload_1         
	//   10   18:ldc2            #479 <String ".">
	//   11   21:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(className);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #32  <Field String className>
	//   16   30:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return stringbuilder.toString();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   20   38:areturn         
	}

	ViewInjection getViewInjection(int i)
	{
		return (ViewInjection)viewIdMap.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map viewIdMap>
	//    2    4:iload_1         
	//    3    5:invokestatic    #428 <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #292 <Method Object Map.get(Object)>
	//    5   13:checkcast       #190 <Class ViewInjection>
	//    6   16:areturn         
	}

	void setParentInjector(String s)
	{
		parentInjector = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #161 <Field String parentInjector>
	//    3    5:return          
	}

	private final String className;
	private final String classPackage;
	private final Map collectionBindings = new LinkedHashMap();
	private String parentInjector;
	private final String targetClass;
	private final Map viewIdMap = new LinkedHashMap();
}
