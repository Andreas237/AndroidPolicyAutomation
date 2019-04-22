// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;

import com.firebase.client.FirebaseException;
import com.firebase.client.core.Path;
import com.firebase.client.core.ValidationPath;
import com.firebase.client.snapshot.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.firebase.client.utilities:
//			Utilities

public class Validation
{

	public Validation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	private static boolean isValidKey(String s)
	{
		return s.equals(".info") || !INVALID_KEY_REGEX.matcher(((CharSequence) (s))).find();
	//    0    0:aload_0         
	//    1    1:ldc1            #31  <String ".info">
	//    2    3:invokevirtual   #37  <Method boolean String.equals(Object)>
	//    3    6:ifne            27
	//    4    9:getstatic       #23  <Field Pattern INVALID_KEY_REGEX>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #41  <Method Matcher Pattern.matcher(CharSequence)>
	//    7   16:invokevirtual   #47  <Method boolean Matcher.find()>
	//    8   19:ifne            25
	//    9   22:goto            27
	//   10   25:iconst_0        
	//   11   26:ireturn         
	//   12   27:iconst_1        
	//   13   28:ireturn         
	}

	private static boolean isValidPathString(String s)
	{
		return INVALID_PATH_REGEX.matcher(((CharSequence) (s))).find() ^ true;
	//    0    0:getstatic       #19  <Field Pattern INVALID_PATH_REGEX>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #41  <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:invokevirtual   #47  <Method boolean Matcher.find()>
	//    4   10:iconst_1        
	//    5   11:ixor            
	//    6   12:ireturn         
	}

	private static boolean isWritableKey(String s)
	{
		return s != null && s.length() > 0 && (s.equals(".value") || s.equals(".priority") || !s.startsWith(".") && !INVALID_KEY_REGEX.matcher(((CharSequence) (s))).find());
	//    0    0:aload_0         
	//    1    1:ifnull          53
	//    2    4:aload_0         
	//    3    5:invokevirtual   #53  <Method int String.length()>
	//    4    8:ifle            53
	//    5   11:aload_0         
	//    6   12:ldc1            #55  <String ".value">
	//    7   14:invokevirtual   #37  <Method boolean String.equals(Object)>
	//    8   17:ifne            51
	//    9   20:aload_0         
	//   10   21:ldc1            #57  <String ".priority">
	//   11   23:invokevirtual   #37  <Method boolean String.equals(Object)>
	//   12   26:ifne            51
	//   13   29:aload_0         
	//   14   30:ldc1            #59  <String ".">
	//   15   32:invokevirtual   #62  <Method boolean String.startsWith(String)>
	//   16   35:ifne            53
	//   17   38:getstatic       #23  <Field Pattern INVALID_KEY_REGEX>
	//   18   41:aload_0         
	//   19   42:invokevirtual   #41  <Method Matcher Pattern.matcher(CharSequence)>
	//   20   45:invokevirtual   #47  <Method boolean Matcher.find()>
	//   21   48:ifne            53
	//   22   51:iconst_1        
	//   23   52:ireturn         
	//   24   53:iconst_0        
	//   25   54:ireturn         
	}

	private static boolean isWritablePath(Path path)
	{
		path = ((Path) (path.getFront()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method ChildKey Path.getFront()>
	//    2    4:astore_0        
		return path == null || !((ChildKey) (path)).asString().startsWith(".");
	//    3    5:aload_0         
	//    4    6:ifnull          26
	//    5    9:aload_0         
	//    6   10:invokevirtual   #76  <Method String ChildKey.asString()>
	//    7   13:ldc1            #59  <String ".">
	//    8   15:invokevirtual   #62  <Method boolean String.startsWith(String)>
	//    9   18:ifne            24
	//   10   21:goto            26
	//   11   24:iconst_0        
	//   12   25:ireturn         
	//   13   26:iconst_1        
	//   14   27:ireturn         
	}

	public static Map parseAndValidateUpdate(Path path, Map map)
		throws FirebaseException
	{
		Object obj = ((Object) (new TreeMap()));
	//    0    0:new             #82  <Class TreeMap>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void TreeMap()>
	//    3    7:astore_3        
		for(Iterator iterator1 = map.entrySet().iterator(); iterator1.hasNext();)
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #89  <Method Set Map.entrySet()>
	//*   6   14:invokeinterface #95  <Method Iterator Set.iterator()>
	//*   7   19:astore          5
	//*   8   21:aload           5
	//*   9   23:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//*  10   28:ifeq            260
		{
			map = ((Map) ((java.util.Map.Entry)iterator1.next()));
	//   11   31:aload           5
	//   12   33:invokeinterface #104 <Method Object Iterator.next()>
	//   13   38:checkcast       #106 <Class java.util.Map$Entry>
	//   14   41:astore_1        
			Path path1 = new Path((String)((java.util.Map.Entry) (map)).getKey());
	//   15   42:new             #66  <Class Path>
	//   16   45:dup             
	//   17   46:aload_1         
	//   18   47:invokeinterface #109 <Method Object java.util.Map$Entry.getKey()>
	//   19   52:checkcast       #33  <Class String>
	//   20   55:invokespecial   #112 <Method void Path(String)>
	//   21   58:astore          4
			Object obj1 = ((java.util.Map.Entry) (map)).getValue();
	//   22   60:aload_1         
	//   23   61:invokeinterface #115 <Method Object java.util.Map$Entry.getValue()>
	//   24   66:astore          6
			ValidationPath.validateWithObject(path.child(path1), obj1);
	//   25   68:aload_0         
	//   26   69:aload           4
	//   27   71:invokevirtual   #119 <Method Path Path.child(Path)>
	//   28   74:aload           6
	//   29   76:invokestatic    #125 <Method void ValidationPath.validateWithObject(Path, Object)>
			if(!path1.isEmpty())
	//*  30   79:aload           4
	//*  31   81:invokevirtual   #128 <Method boolean Path.isEmpty()>
	//*  32   84:ifne            99
				map = ((Map) (path1.getBack().asString()));
	//   33   87:aload           4
	//   34   89:invokevirtual   #131 <Method ChildKey Path.getBack()>
	//   35   92:invokevirtual   #76  <Method String ChildKey.asString()>
	//   36   95:astore_1        
			else
	//*  37   96:goto            102
				map = "";
	//   38   99:ldc1            #133 <String "">
	//   39  101:astore_1        
			if(!((String) (map)).equals(".sv") && !((String) (map)).equals(".value"))
	//*  40  102:aload_1         
	//*  41  103:ldc1            #135 <String ".sv">
	//*  42  105:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  43  108:ifne            213
	//*  44  111:aload_1         
	//*  45  112:ldc1            #55  <String ".value">
	//*  46  114:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  47  117:ifne            213
			{
				if(((String) (map)).equals(".priority") && !PriorityUtilities.isValidPriority(NodeUtilities.NodeFromJSON(obj1)))
	//*  48  120:aload_1         
	//*  49  121:ldc1            #57  <String ".priority">
	//*  50  123:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  51  126:ifeq            191
	//*  52  129:aload           6
	//*  53  131:invokestatic    #141 <Method com.firebase.client.snapshot.Node NodeUtilities.NodeFromJSON(Object)>
	//*  54  134:invokestatic    #147 <Method boolean PriorityUtilities.isValidPriority(com.firebase.client.snapshot.Node)>
	//*  55  137:ifeq            143
	//*  56  140:goto            191
				{
					path = ((Path) (new StringBuilder()));
	//   57  143:new             #149 <Class StringBuilder>
	//   58  146:dup             
	//   59  147:invokespecial   #150 <Method void StringBuilder()>
	//   60  150:astore_0        
					((StringBuilder) (path)).append("Path '");
	//   61  151:aload_0         
	//   62  152:ldc1            #152 <String "Path '">
	//   63  154:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   64  157:pop             
					((StringBuilder) (path)).append(((Object) (path1)));
	//   65  158:aload_0         
	//   66  159:aload           4
	//   67  161:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
	//   68  164:pop             
					((StringBuilder) (path)).append("' contains invalid priority ");
	//   69  165:aload_0         
	//   70  166:ldc1            #161 <String "' contains invalid priority ">
	//   71  168:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   72  171:pop             
					((StringBuilder) (path)).append("(must be a string, double, ServerValue, or null).");
	//   73  172:aload_0         
	//   74  173:ldc1            #163 <String "(must be a string, double, ServerValue, or null).">
	//   75  175:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   76  178:pop             
					throw new FirebaseException(((StringBuilder) (path)).toString());
	//   77  179:new             #80  <Class FirebaseException>
	//   78  182:dup             
	//   79  183:aload_0         
	//   80  184:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   81  187:invokespecial   #167 <Method void FirebaseException(String)>
	//   82  190:athrow          
				}
				validateWritableObject(obj1);
	//   83  191:aload           6
	//   84  193:invokestatic    #171 <Method void validateWritableObject(Object)>
				((SortedMap) (obj)).put(((Object) (path1)), ((Object) (NodeUtilities.NodeFromJSON(obj1))));
	//   85  196:aload_3         
	//   86  197:aload           4
	//   87  199:aload           6
	//   88  201:invokestatic    #141 <Method com.firebase.client.snapshot.Node NodeUtilities.NodeFromJSON(Object)>
	//   89  204:invokeinterface #177 <Method Object SortedMap.put(Object, Object)>
	//   90  209:pop             
			} else
	//*  91  210:goto            21
			{
				path = ((Path) (new StringBuilder()));
	//   92  213:new             #149 <Class StringBuilder>
	//   93  216:dup             
	//   94  217:invokespecial   #150 <Method void StringBuilder()>
	//   95  220:astore_0        
				((StringBuilder) (path)).append("Path '");
	//   96  221:aload_0         
	//   97  222:ldc1            #152 <String "Path '">
	//   98  224:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   99  227:pop             
				((StringBuilder) (path)).append(((Object) (path1)));
	//  100  228:aload_0         
	//  101  229:aload           4
	//  102  231:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
	//  103  234:pop             
				((StringBuilder) (path)).append("' contains disallowed child name: ");
	//  104  235:aload_0         
	//  105  236:ldc1            #179 <String "' contains disallowed child name: ">
	//  106  238:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//  107  241:pop             
				((StringBuilder) (path)).append(((String) (map)));
	//  108  242:aload_0         
	//  109  243:aload_1         
	//  110  244:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//  111  247:pop             
				throw new FirebaseException(((StringBuilder) (path)).toString());
	//  112  248:new             #80  <Class FirebaseException>
	//  113  251:dup             
	//  114  252:aload_0         
	//  115  253:invokevirtual   #166 <Method String StringBuilder.toString()>
	//  116  256:invokespecial   #167 <Method void FirebaseException(String)>
	//  117  259:athrow          
			}
		}

		path = null;
	//  118  260:aconst_null     
	//  119  261:astore_0        
		for(Iterator iterator = ((SortedMap) (obj)).keySet().iterator(); iterator.hasNext();)
	//* 120  262:aload_3         
	//* 121  263:invokeinterface #182 <Method Set SortedMap.keySet()>
	//* 122  268:invokeinterface #95  <Method Iterator Set.iterator()>
	//* 123  273:astore          4
	//* 124  275:aload           4
	//* 125  277:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//* 126  282:ifeq            395
		{
			map = ((Map) ((Path)iterator.next()));
	//  127  285:aload           4
	//  128  287:invokeinterface #104 <Method Object Iterator.next()>
	//  129  292:checkcast       #66  <Class Path>
	//  130  295:astore_1        
			boolean flag;
			if(path != null && path.compareTo(((Path) (map))) >= 0)
	//* 131  296:aload_0         
	//* 132  297:ifnull          316
	//* 133  300:aload_0         
	//* 134  301:aload_1         
	//* 135  302:invokevirtual   #186 <Method int Path.compareTo(Path)>
	//* 136  305:ifge            311
	//* 137  308:goto            316
				flag = false;
	//  138  311:iconst_0        
	//  139  312:istore_2        
			else
	//* 140  313:goto            318
				flag = true;
	//  141  316:iconst_1        
	//  142  317:istore_2        
			Utilities.hardAssert(flag);
	//  143  318:iload_2         
	//  144  319:invokestatic    #192 <Method void Utilities.hardAssert(boolean)>
			if(path != null && path.contains(((Path) (map))))
	//* 145  322:aload_0         
	//* 146  323:ifnull          390
	//* 147  326:aload_0         
	//* 148  327:aload_1         
	//* 149  328:invokevirtual   #195 <Method boolean Path.contains(Path)>
	//* 150  331:ifne            337
	//* 151  334:goto            390
			{
				obj = ((Object) (new StringBuilder()));
	//  152  337:new             #149 <Class StringBuilder>
	//  153  340:dup             
	//  154  341:invokespecial   #150 <Method void StringBuilder()>
	//  155  344:astore_3        
				((StringBuilder) (obj)).append("Path '");
	//  156  345:aload_3         
	//  157  346:ldc1            #152 <String "Path '">
	//  158  348:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//  159  351:pop             
				((StringBuilder) (obj)).append(((Object) (path)));
	//  160  352:aload_3         
	//  161  353:aload_0         
	//  162  354:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
	//  163  357:pop             
				((StringBuilder) (obj)).append("' is an ancestor of '");
	//  164  358:aload_3         
	//  165  359:ldc1            #197 <String "' is an ancestor of '">
	//  166  361:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//  167  364:pop             
				((StringBuilder) (obj)).append(((Object) (map)));
	//  168  365:aload_3         
	//  169  366:aload_1         
	//  170  367:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
	//  171  370:pop             
				((StringBuilder) (obj)).append("' in an update.");
	//  172  371:aload_3         
	//  173  372:ldc1            #199 <String "' in an update.">
	//  174  374:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//  175  377:pop             
				throw new FirebaseException(((StringBuilder) (obj)).toString());
	//  176  378:new             #80  <Class FirebaseException>
	//  177  381:dup             
	//  178  382:aload_3         
	//  179  383:invokevirtual   #166 <Method String StringBuilder.toString()>
	//  180  386:invokespecial   #167 <Method void FirebaseException(String)>
	//  181  389:athrow          
			}
			path = ((Path) (map));
	//  182  390:aload_1         
	//  183  391:astore_0        
		}

	//* 184  392:goto            275
		return ((Map) (obj));
	//  185  395:aload_3         
	//  186  396:areturn         
	}

	public static void validateNullableKey(String s)
		throws FirebaseException
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          52
		{
			if(isValidKey(s))
	//*   2    4:aload_0         
	//*   3    5:invokestatic    #205 <Method boolean isValidKey(String)>
	//*   4    8:ifeq            12
			{
				return;
	//    5   11:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #149 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #150 <Method void StringBuilder()>
	//    9   19:astore_1        
				stringbuilder.append("Invalid key: ");
	//   10   20:aload_1         
	//   11   21:ldc1            #207 <String "Invalid key: ">
	//   12   23:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
				stringbuilder.append(s);
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
				stringbuilder.append(". Keys must not contain '/', '.', '#', '$', '[', or ']'");
	//   18   33:aload_1         
	//   19   34:ldc1            #209 <String ". Keys must not contain '/', '.', '#', '$', '[', or ']'">
	//   20   36:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
				throw new FirebaseException(stringbuilder.toString());
	//   22   40:new             #80  <Class FirebaseException>
	//   23   43:dup             
	//   24   44:aload_1         
	//   25   45:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   26   48:invokespecial   #167 <Method void FirebaseException(String)>
	//   27   51:athrow          
			}
		} else
		{
			return;
	//   28   52:return          
		}
	}

	public static void validatePathString(String s)
		throws FirebaseException
	{
		if(isValidPathString(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #212 <Method boolean isValidPathString(String)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #149 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #150 <Method void StringBuilder()>
	//    7   15:astore_1        
			stringbuilder.append("Invalid Firebase path: ");
	//    8   16:aload_1         
	//    9   17:ldc1            #214 <String "Invalid Firebase path: ">
	//   10   19:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			stringbuilder.append(s);
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			stringbuilder.append(". Firebase paths must not contain '.', '#', '$', '[', or ']'");
	//   16   29:aload_1         
	//   17   30:ldc1            #216 <String ". Firebase paths must not contain '.', '#', '$', '[', or ']'">
	//   18   32:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			throw new FirebaseException(stringbuilder.toString());
	//   20   36:new             #80  <Class FirebaseException>
	//   21   39:dup             
	//   22   40:aload_1         
	//   23   41:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   24   44:invokespecial   #167 <Method void FirebaseException(String)>
	//   25   47:athrow          
		}
	}

	public static void validateRootPathString(String s)
		throws FirebaseException
	{
		if(s.startsWith(".info"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #31  <String ".info">
	//*   2    3:invokevirtual   #62  <Method boolean String.startsWith(String)>
	//*   3    6:ifeq            18
		{
			validatePathString(s.substring(5));
	//    4    9:aload_0         
	//    5   10:iconst_5        
	//    6   11:invokevirtual   #221 <Method String String.substring(int)>
	//    7   14:invokestatic    #223 <Method void validatePathString(String)>
			return;
	//    8   17:return          
		}
		if(s.startsWith("/.info"))
	//*   9   18:aload_0         
	//*  10   19:ldc1            #225 <String "/.info">
	//*  11   21:invokevirtual   #62  <Method boolean String.startsWith(String)>
	//*  12   24:ifeq            37
		{
			validatePathString(s.substring(6));
	//   13   27:aload_0         
	//   14   28:bipush          6
	//   15   30:invokevirtual   #221 <Method String String.substring(int)>
	//   16   33:invokestatic    #223 <Method void validatePathString(String)>
			return;
	//   17   36:return          
		} else
		{
			validatePathString(s);
	//   18   37:aload_0         
	//   19   38:invokestatic    #223 <Method void validatePathString(String)>
			return;
	//   20   41:return          
		}
	}

	public static void validateWritableKey(String s)
		throws FirebaseException
	{
		if(isWritableKey(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #228 <Method boolean isWritableKey(String)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #149 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #150 <Method void StringBuilder()>
	//    7   15:astore_1        
			stringbuilder.append("Invalid key: ");
	//    8   16:aload_1         
	//    9   17:ldc1            #207 <String "Invalid key: ">
	//   10   19:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			stringbuilder.append(s);
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			stringbuilder.append(". Keys must not contain '/', '.', '#', '$', '[', or ']'");
	//   16   29:aload_1         
	//   17   30:ldc1            #209 <String ". Keys must not contain '/', '.', '#', '$', '[', or ']'">
	//   18   32:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
			throw new FirebaseException(stringbuilder.toString());
	//   20   36:new             #80  <Class FirebaseException>
	//   21   39:dup             
	//   22   40:aload_1         
	//   23   41:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   24   44:invokespecial   #167 <Method void FirebaseException(String)>
	//   25   47:athrow          
		}
	}

	public static void validateWritableObject(Object obj)
	{
		if(obj instanceof Map)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #85  <Class Map>
	//*   2    4:ifeq            79
		{
			obj = ((Object) ((Map)obj));
	//    3    7:aload_0         
	//    4    8:checkcast       #85  <Class Map>
	//    5   11:astore_0        
			if(((Map) (obj)).containsKey(".sv"))
	//*   6   12:aload_0         
	//*   7   13:ldc1            #135 <String ".sv">
	//*   8   15:invokeinterface #231 <Method boolean Map.containsKey(Object)>
	//*   9   20:ifeq            24
				return;
	//   10   23:return          
			java.util.Map.Entry entry;
			for(obj = ((Object) (((Map) (obj)).entrySet().iterator())); ((Iterator) (obj)).hasNext(); validateWritableObject(entry.getValue()))
	//*  11   24:aload_0         
	//*  12   25:invokeinterface #89  <Method Set Map.entrySet()>
	//*  13   30:invokeinterface #95  <Method Iterator Set.iterator()>
	//*  14   35:astore_0        
	//*  15   36:aload_0         
	//*  16   37:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//*  17   42:ifeq            117
			{
				entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   18   45:aload_0         
	//   19   46:invokeinterface #104 <Method Object Iterator.next()>
	//   20   51:checkcast       #106 <Class java.util.Map$Entry>
	//   21   54:astore_1        
				validateWritableKey((String)entry.getKey());
	//   22   55:aload_1         
	//   23   56:invokeinterface #109 <Method Object java.util.Map$Entry.getKey()>
	//   24   61:checkcast       #33  <Class String>
	//   25   64:invokestatic    #233 <Method void validateWritableKey(String)>
			}

	//   26   67:aload_1         
	//   27   68:invokeinterface #115 <Method Object java.util.Map$Entry.getValue()>
	//   28   73:invokestatic    #171 <Method void validateWritableObject(Object)>
		} else
	//*  29   76:goto            36
		if(obj instanceof List)
	//*  30   79:aload_0         
	//*  31   80:instanceof      #235 <Class List>
	//*  32   83:ifeq            117
			for(obj = ((Object) (((List)obj).iterator())); ((Iterator) (obj)).hasNext(); validateWritableObject(((Iterator) (obj)).next()));
	//   33   86:aload_0         
	//   34   87:checkcast       #235 <Class List>
	//   35   90:invokeinterface #236 <Method Iterator List.iterator()>
	//   36   95:astore_0        
	//   37   96:aload_0         
	//   38   97:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//   39  102:ifeq            117
	//   40  105:aload_0         
	//   41  106:invokeinterface #104 <Method Object Iterator.next()>
	//   42  111:invokestatic    #171 <Method void validateWritableObject(Object)>
	//*  43  114:goto            96
	//   44  117:return          
	}

	public static void validateWritablePath(Path path)
		throws FirebaseException
	{
		if(isWritablePath(path))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #240 <Method boolean isWritablePath(Path)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #149 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #150 <Method void StringBuilder()>
	//    7   15:astore_1        
			stringbuilder.append("Invalid write location: ");
	//    8   16:aload_1         
	//    9   17:ldc1            #242 <String "Invalid write location: ">
	//   10   19:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			stringbuilder.append(path.toString());
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:invokevirtual   #243 <Method String Path.toString()>
	//   15   28:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			throw new FirebaseException(stringbuilder.toString());
	//   17   32:new             #80  <Class FirebaseException>
	//   18   35:dup             
	//   19   36:aload_1         
	//   20   37:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   21   40:invokespecial   #167 <Method void FirebaseException(String)>
	//   22   43:athrow          
		}
	}

	private static final Pattern INVALID_KEY_REGEX = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");
	private static final Pattern INVALID_PATH_REGEX = Pattern.compile("[\\[\\]\\.#$]");

	static 
	{
	//    0    0:ldc1            #11  <String "[\\[\\]\\.#$]">
	//    1    2:invokestatic    #17  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #19  <Field Pattern INVALID_PATH_REGEX>
	//    3    8:ldc1            #21  <String "[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]">
	//    4   10:invokestatic    #17  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #23  <Field Pattern INVALID_KEY_REGEX>
	//*   6   16:return          
	}
}
