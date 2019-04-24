// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.support.v4.util.LruCache;
import com.birbit.android.jobqueue.Constraint;
import com.birbit.android.jobqueue.TagConstraint;
import java.util.*;

// Referenced classes of package com.birbit.android.jobqueue.persistentQueue.sqlite:
//			DbOpenHelper, Where, SqlHelper

class WhereQueryCache
{

	public WhereQueryCache(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class WhereQueryCache$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:bipush          15
	//    7   12:invokespecial   #39  <Method void WhereQueryCache$1(WhereQueryCache, int)>
	//    8   15:putfield        #41  <Field LruCache queryCache>
		sessionId = Long.toString(l);
	//    9   18:aload_0         
	//   10   19:lload_1         
	//   11   20:invokestatic    #47  <Method String Long.toString(long)>
	//   12   23:putfield        #49  <Field String sessionId>
	//   13   26:return          
	}

	private long cacheKey(Constraint constraint)
	{
		int k = 1;
	//    0    0:iconst_1        
	//    1    1:istore          4
		int i;
		int j;
		int l;
		int i1;
		int j1;
		if(constraint.getTagConstraint() == null)
	//*   2    3:aload_1         
	//*   3    4:invokevirtual   #58  <Method TagConstraint Constraint.getTagConstraint()>
	//*   4    7:ifnonnull       94
			i = 2;
	//    5   10:iconst_2        
	//    6   11:istore_2        
		else
	//*   7   12:aload_1         
	//*   8   13:invokevirtual   #62  <Method Set Constraint.getTags()>
	//*   9   16:invokeinterface #68  <Method int Set.size()>
	//*  10   21:istore          5
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #72  <Method List Constraint.getExcludeGroups()>
	//*  13   27:invokeinterface #75  <Method int List.size()>
	//*  14   32:istore          6
	//*  15   34:aload_1         
	//*  16   35:invokevirtual   #78  <Method List Constraint.getExcludeJobIds()>
	//*  17   38:invokeinterface #75  <Method int List.size()>
	//*  18   43:istore          7
	//*  19   45:aload_1         
	//*  20   46:invokevirtual   #82  <Method boolean Constraint.excludeRunning()>
	//*  21   49:ifeq            105
	//*  22   52:iconst_1        
	//*  23   53:istore_3        
	//*  24   54:aload_1         
	//*  25   55:invokevirtual   #86  <Method Long Constraint.getTimeLimit()>
	//*  26   58:ifnonnull       110
	//*  27   61:iload_3         
	//*  28   62:bipush          20
	//*  29   64:ishl            
	//*  30   65:iload           7
	//*  31   67:bipush          14
	//*  32   69:ishl            
	//*  33   70:iload_2         
	//*  34   71:iconst_0        
	//*  35   72:ishl            
	//*  36   73:iload           5
	//*  37   75:iconst_2        
	//*  38   76:ishl            
	//*  39   77:ior             
	//*  40   78:iload           6
	//*  41   80:bipush          8
	//*  42   82:ishl            
	//*  43   83:ior             
	//*  44   84:ior             
	//*  45   85:ior             
	//*  46   86:iload           4
	//*  47   88:bipush          21
	//*  48   90:ishl            
	//*  49   91:ior             
	//*  50   92:i2l             
	//*  51   93:lreturn         
			i = constraint.getTagConstraint().ordinal();
	//   52   94:aload_1         
	//   53   95:invokevirtual   #58  <Method TagConstraint Constraint.getTagConstraint()>
	//   54   98:invokevirtual   #91  <Method int TagConstraint.ordinal()>
	//   55  101:istore_2        
		l = constraint.getTags().size();
		i1 = constraint.getExcludeGroups().size();
		j1 = constraint.getExcludeJobIds().size();
		if(constraint.excludeRunning())
			j = 1;
		else
	//*  56  102:goto            12
			j = 0;
	//   57  105:iconst_0        
	//   58  106:istore_3        
		if(constraint.getTimeLimit() != null)
	//*  59  107:goto            54
			k = 0;
	//   60  110:iconst_0        
	//   61  111:istore          4
		return (long)(j << 20 | (j1 << 14 | (i << 0 | l << 2 | i1 << 8)) | k << 21);
	//*  62  113:goto            61
	}

	private Where createWhere(long l, Constraint constraint, StringBuilder stringbuilder)
	{
		int i;
		int j;
		stringbuilder.setLength(0);
	//    0    0:aload           4
	//    1    2:iconst_0        
	//    2    3:invokevirtual   #99  <Method void StringBuilder.setLength(int)>
		stringbuilder.append("( (").append(DbOpenHelper.DEADLINE_COLUMN.columnName).append(" != ").append(Where.FOREVER).append(" AND ").append(DbOpenHelper.DEADLINE_COLUMN.columnName).append(" <= ?) OR ");
	//    3    6:aload           4
	//    4    8:ldc1            #101 <String "( (">
	//    5   10:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    6   13:getstatic       #111 <Field SqlHelper$Property DbOpenHelper.DEADLINE_COLUMN>
	//    7   16:getfield        #116 <Field String SqlHelper$Property.columnName>
	//    8   19:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #118 <String " != ">
	//   10   24:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:getstatic       #123 <Field String Where.FOREVER>
	//   12   30:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   13   33:ldc1            #125 <String " AND ">
	//   14   35:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   15   38:getstatic       #111 <Field SqlHelper$Property DbOpenHelper.DEADLINE_COLUMN>
	//   16   41:getfield        #116 <Field String SqlHelper$Property.columnName>
	//   17   44:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   18   47:ldc1            #127 <String " <= ?) OR ">
	//   19   49:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   20   52:pop             
		stringbuilder.append(DbOpenHelper.REQUIRED_NETWORK_TYPE_COLUMN.columnName).append(" <= ?)");
	//   21   53:aload           4
	//   22   55:getstatic       #130 <Field SqlHelper$Property DbOpenHelper.REQUIRED_NETWORK_TYPE_COLUMN>
	//   23   58:getfield        #116 <Field String SqlHelper$Property.columnName>
	//   24   61:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   25   64:ldc1            #132 <String " <= ?)">
	//   26   66:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   27   69:pop             
		stringbuilder.append(" AND (").append(DbOpenHelper.CANCELLED_COLUMN.columnName).append(" IS NULL OR ").append(DbOpenHelper.CANCELLED_COLUMN.columnName).append(" != 1)");
	//   28   70:aload           4
	//   29   72:ldc1            #134 <String " AND (">
	//   30   74:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   31   77:getstatic       #137 <Field SqlHelper$Property DbOpenHelper.CANCELLED_COLUMN>
	//   32   80:getfield        #116 <Field String SqlHelper$Property.columnName>
	//   33   83:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   34   86:ldc1            #139 <String " IS NULL OR ">
	//   35   88:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   36   91:getstatic       #137 <Field SqlHelper$Property DbOpenHelper.CANCELLED_COLUMN>
	//   37   94:getfield        #116 <Field String SqlHelper$Property.columnName>
	//   38   97:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   39  100:ldc1            #141 <String " != 1)">
	//   40  102:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   41  105:pop             
		j = 0 + 1 + 1;
	//   42  106:iconst_0        
	//   43  107:iconst_1        
	//   44  108:iadd            
	//   45  109:iconst_1        
	//   46  110:iadd            
	//   47  111:istore          6
		i = j;
	//   48  113:iload           6
	//   49  115:istore          5
		if(constraint.getTimeLimit() != null)
	//*  50  117:aload_3         
	//*  51  118:invokevirtual   #86  <Method Long Constraint.getTimeLimit()>
	//*  52  121:ifnull          152
		{
			stringbuilder.append(" AND ").append(DbOpenHelper.DELAY_UNTIL_NS_COLUMN.columnName).append(" <= ?");
	//   53  124:aload           4
	//   54  126:ldc1            #125 <String " AND ">
	//   55  128:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   56  131:getstatic       #144 <Field SqlHelper$Property DbOpenHelper.DELAY_UNTIL_NS_COLUMN>
	//   57  134:getfield        #116 <Field String SqlHelper$Property.columnName>
	//   58  137:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   59  140:ldc1            #146 <String " <= ?">
	//   60  142:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   61  145:pop             
			i = j + 1;
	//   62  146:iload           6
	//   63  148:iconst_1        
	//   64  149:iadd            
	//   65  150:istore          5
		}
		j = i;
	//   66  152:iload           5
	//   67  154:istore          6
		if(constraint.getTagConstraint() == null) goto _L2; else goto _L1
	//   68  156:aload_3         
	//   69  157:invokevirtual   #58  <Method TagConstraint Constraint.getTagConstraint()>
	//   70  160:ifnull          187
_L1:
		if(!constraint.getTags().isEmpty()) goto _L4; else goto _L3
	//   71  163:aload_3         
	//   72  164:invokevirtual   #62  <Method Set Constraint.getTags()>
	//   73  167:invokeinterface #149 <Method boolean Set.isEmpty()>
	//   74  172:ifeq            409
_L3:
		stringbuilder.append(" AND 0 ");
	//   75  175:aload           4
	//   76  177:ldc1            #151 <String " AND 0 ">
	//   77  179:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   78  182:pop             
		j = i;
	//   79  183:iload           5
	//   80  185:istore          6
_L2:
		i = j;
	//   81  187:iload           6
	//   82  189:istore          5
		if(!constraint.getExcludeGroups().isEmpty())
	//*  83  191:aload_3         
	//*  84  192:invokevirtual   #72  <Method List Constraint.getExcludeGroups()>
	//*  85  195:invokeinterface #152 <Method boolean List.isEmpty()>
	//*  86  200:ifne            275
		{
			stringbuilder.append(" AND (").append(DbOpenHelper.GROUP_ID_COLUMN.columnName).append(" IS NULL OR ").append(DbOpenHelper.GROUP_ID_COLUMN.columnName).append(" NOT IN(");
	//   87  203:aload           4
	//   88  205:ldc1            #134 <String " AND (">
	//   89  207:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   90  210:getstatic       #155 <Field SqlHelper$Property DbOpenHelper.GROUP_ID_COLUMN>
	//   91  213:getfield        #116 <Field String SqlHelper$Property.columnName>
	//   92  216:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   93  219:ldc1            #139 <String " IS NULL OR ">
	//   94  221:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   95  224:getstatic       #155 <Field SqlHelper$Property DbOpenHelper.GROUP_ID_COLUMN>
	//   96  227:getfield        #116 <Field String SqlHelper$Property.columnName>
	//   97  230:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   98  233:ldc1            #157 <String " NOT IN(">
	//   99  235:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  100  238:pop             
			SqlHelper.addPlaceholdersInto(stringbuilder, constraint.getExcludeGroups().size());
	//  101  239:aload           4
	//  102  241:aload_3         
	//  103  242:invokevirtual   #72  <Method List Constraint.getExcludeGroups()>
	//  104  245:invokeinterface #75  <Method int List.size()>
	//  105  250:invokestatic    #163 <Method void SqlHelper.addPlaceholdersInto(StringBuilder, int)>
			stringbuilder.append("))");
	//  106  253:aload           4
	//  107  255:ldc1            #165 <String "))">
	//  108  257:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  109  260:pop             
			i = j + constraint.getExcludeGroups().size();
	//  110  261:iload           6
	//  111  263:aload_3         
	//  112  264:invokevirtual   #72  <Method List Constraint.getExcludeGroups()>
	//  113  267:invokeinterface #75  <Method int List.size()>
	//  114  272:iadd            
	//  115  273:istore          5
		}
		j = i;
	//  116  275:iload           5
	//  117  277:istore          6
		if(!constraint.getExcludeJobIds().isEmpty())
	//* 118  279:aload_3         
	//* 119  280:invokevirtual   #78  <Method List Constraint.getExcludeJobIds()>
	//* 120  283:invokeinterface #152 <Method boolean List.isEmpty()>
	//* 121  288:ifne            349
		{
			stringbuilder.append(" AND ").append(DbOpenHelper.ID_COLUMN.columnName).append(" NOT IN(");
	//  122  291:aload           4
	//  123  293:ldc1            #125 <String " AND ">
	//  124  295:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  125  298:getstatic       #168 <Field SqlHelper$Property DbOpenHelper.ID_COLUMN>
	//  126  301:getfield        #116 <Field String SqlHelper$Property.columnName>
	//  127  304:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  128  307:ldc1            #157 <String " NOT IN(">
	//  129  309:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  130  312:pop             
			SqlHelper.addPlaceholdersInto(stringbuilder, constraint.getExcludeJobIds().size());
	//  131  313:aload           4
	//  132  315:aload_3         
	//  133  316:invokevirtual   #78  <Method List Constraint.getExcludeJobIds()>
	//  134  319:invokeinterface #75  <Method int List.size()>
	//  135  324:invokestatic    #163 <Method void SqlHelper.addPlaceholdersInto(StringBuilder, int)>
			stringbuilder.append(")");
	//  136  327:aload           4
	//  137  329:ldc1            #170 <String ")">
	//  138  331:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  139  334:pop             
			j = i + constraint.getExcludeJobIds().size();
	//  140  335:iload           5
	//  141  337:aload_3         
	//  142  338:invokevirtual   #78  <Method List Constraint.getExcludeJobIds()>
	//  143  341:invokeinterface #75  <Method int List.size()>
	//  144  346:iadd            
	//  145  347:istore          6
		}
		i = j;
	//  146  349:iload           6
	//  147  351:istore          5
		if(constraint.excludeRunning())
	//* 148  353:aload_3         
	//* 149  354:invokevirtual   #82  <Method boolean Constraint.excludeRunning()>
	//* 150  357:ifeq            388
		{
			stringbuilder.append(" AND ").append(DbOpenHelper.RUNNING_SESSION_ID_COLUMN.columnName).append(" != ?");
	//  151  360:aload           4
	//  152  362:ldc1            #125 <String " AND ">
	//  153  364:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  154  367:getstatic       #173 <Field SqlHelper$Property DbOpenHelper.RUNNING_SESSION_ID_COLUMN>
	//  155  370:getfield        #116 <Field String SqlHelper$Property.columnName>
	//  156  373:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  157  376:ldc1            #175 <String " != ?">
	//  158  378:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  159  381:pop             
			i = j + 1;
	//  160  382:iload           6
	//  161  384:iconst_1        
	//  162  385:iadd            
	//  163  386:istore          5
		}
		constraint = ((Constraint) (new String[i]));
	//  164  388:iload           5
	//  165  390:anewarray       String[]
	//  166  393:astore_3        
		return new Where(l, stringbuilder.toString(), ((String []) (constraint)));
	//  167  394:new             #120 <Class Where>
	//  168  397:dup             
	//  169  398:lload_1         
	//  170  399:aload           4
	//  171  401:invokevirtual   #180 <Method String StringBuilder.toString()>
	//  172  404:aload_3         
	//  173  405:invokespecial   #183 <Method void Where(long, String, String[])>
	//  174  408:areturn         
_L4:
		stringbuilder.append(" AND ").append(DbOpenHelper.ID_COLUMN.columnName).append(" IN ( SELECT ").append(DbOpenHelper.TAGS_JOB_ID_COLUMN.columnName).append(" FROM ").append("job_holder_tags").append(" WHERE ").append(DbOpenHelper.TAGS_NAME_COLUMN.columnName).append(" IN (");
	//  175  409:aload           4
	//  176  411:ldc1            #125 <String " AND ">
	//  177  413:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  178  416:getstatic       #168 <Field SqlHelper$Property DbOpenHelper.ID_COLUMN>
	//  179  419:getfield        #116 <Field String SqlHelper$Property.columnName>
	//  180  422:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  181  425:ldc1            #185 <String " IN ( SELECT ">
	//  182  427:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  183  430:getstatic       #188 <Field SqlHelper$Property DbOpenHelper.TAGS_JOB_ID_COLUMN>
	//  184  433:getfield        #116 <Field String SqlHelper$Property.columnName>
	//  185  436:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  186  439:ldc1            #190 <String " FROM ">
	//  187  441:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  188  444:ldc1            #192 <String "job_holder_tags">
	//  189  446:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  190  449:ldc1            #194 <String " WHERE ">
	//  191  451:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  192  454:getstatic       #197 <Field SqlHelper$Property DbOpenHelper.TAGS_NAME_COLUMN>
	//  193  457:getfield        #116 <Field String SqlHelper$Property.columnName>
	//  194  460:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  195  463:ldc1            #199 <String " IN (">
	//  196  465:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  197  468:pop             
		SqlHelper.addPlaceholdersInto(stringbuilder, constraint.getTags().size());
	//  198  469:aload           4
	//  199  471:aload_3         
	//  200  472:invokevirtual   #62  <Method Set Constraint.getTags()>
	//  201  475:invokeinterface #68  <Method int Set.size()>
	//  202  480:invokestatic    #163 <Method void SqlHelper.addPlaceholdersInto(StringBuilder, int)>
		stringbuilder.append(")");
	//  203  483:aload           4
	//  204  485:ldc1            #170 <String ")">
	//  205  487:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  206  490:pop             
		if(constraint.getTagConstraint() != TagConstraint.ANY)
			break; /* Loop/switch isn't completed */
	//  207  491:aload_3         
	//  208  492:invokevirtual   #58  <Method TagConstraint Constraint.getTagConstraint()>
	//  209  495:getstatic       #203 <Field TagConstraint TagConstraint.ANY>
	//  210  498:if_acmpne       526
		stringbuilder.append(")");
	//  211  501:aload           4
	//  212  503:ldc1            #170 <String ")">
	//  213  505:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  214  508:pop             
_L6:
		j = i + constraint.getTags().size();
	//  215  509:iload           5
	//  216  511:aload_3         
	//  217  512:invokevirtual   #62  <Method Set Constraint.getTags()>
	//  218  515:invokeinterface #68  <Method int Set.size()>
	//  219  520:iadd            
	//  220  521:istore          6
		if(true) goto _L2; else goto _L5
	//  221  523:goto            187
_L5:
		if(constraint.getTagConstraint() == TagConstraint.ALL)
	//* 222  526:aload_3         
	//* 223  527:invokevirtual   #58  <Method TagConstraint Constraint.getTagConstraint()>
	//* 224  530:getstatic       #206 <Field TagConstraint TagConstraint.ALL>
	//* 225  533:if_acmpne       583
			stringbuilder.append(" GROUP BY (`").append(DbOpenHelper.TAGS_JOB_ID_COLUMN.columnName).append("`)").append(" HAVING count(*) = ").append(constraint.getTags().size()).append(")");
	//  226  536:aload           4
	//  227  538:ldc1            #208 <String " GROUP BY (`">
	//  228  540:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  229  543:getstatic       #188 <Field SqlHelper$Property DbOpenHelper.TAGS_JOB_ID_COLUMN>
	//  230  546:getfield        #116 <Field String SqlHelper$Property.columnName>
	//  231  549:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  232  552:ldc1            #210 <String "`)">
	//  233  554:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  234  557:ldc1            #212 <String " HAVING count(*) = ">
	//  235  559:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  236  562:aload_3         
	//  237  563:invokevirtual   #62  <Method Set Constraint.getTags()>
	//  238  566:invokeinterface #68  <Method int Set.size()>
	//  239  571:invokevirtual   #215 <Method StringBuilder StringBuilder.append(int)>
	//  240  574:ldc1            #170 <String ")">
	//  241  576:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  242  579:pop             
		else
	//* 243  580:goto            509
			throw new IllegalArgumentException((new StringBuilder()).append("unknown constraint ").append(((Object) (constraint))).toString());
	//  244  583:new             #217 <Class IllegalArgumentException>
	//  245  586:dup             
	//  246  587:new             #95  <Class StringBuilder>
	//  247  590:dup             
	//  248  591:invokespecial   #218 <Method void StringBuilder()>
	//  249  594:ldc1            #220 <String "unknown constraint ">
	//  250  596:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  251  599:aload_3         
	//  252  600:invokevirtual   #223 <Method StringBuilder StringBuilder.append(Object)>
	//  253  603:invokevirtual   #180 <Method String StringBuilder.toString()>
	//  254  606:invokespecial   #226 <Method void IllegalArgumentException(String)>
	//  255  609:athrow          
		  goto _L6
		if(true) goto _L2; else goto _L7
_L7:
	}

	private void fillWhere(Constraint constraint, Where where)
	{
		String as[] = where.args;
	//    0    0:aload_2         
	//    1    1:getfield        #232 <Field String[] Where.args>
	//    2    4:astore          5
		int i = 0 + 1;
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:iadd            
	//    6    9:istore_3        
		as[0] = Long.toString(constraint.getNowInNs());
	//    7   10:aload           5
	//    8   12:iconst_0        
	//    9   13:aload_1         
	//   10   14:invokevirtual   #236 <Method long Constraint.getNowInNs()>
	//   11   17:invokestatic    #47  <Method String Long.toString(long)>
	//   12   20:aastore         
		as = where.args;
	//   13   21:aload_2         
	//   14   22:getfield        #232 <Field String[] Where.args>
	//   15   25:astore          5
		int j = i + 1;
	//   16   27:iload_3         
	//   17   28:iconst_1        
	//   18   29:iadd            
	//   19   30:istore          4
		as[i] = Integer.toString(constraint.getMaxNetworkType());
	//   20   32:aload           5
	//   21   34:iload_3         
	//   22   35:aload_1         
	//   23   36:invokevirtual   #239 <Method int Constraint.getMaxNetworkType()>
	//   24   39:invokestatic    #244 <Method String Integer.toString(int)>
	//   25   42:aastore         
		i = j;
	//   26   43:iload           4
	//   27   45:istore_3        
		if(constraint.getTimeLimit() != null)
	//*  28   46:aload_1         
	//*  29   47:invokevirtual   #86  <Method Long Constraint.getTimeLimit()>
	//*  30   50:ifnull          75
		{
			where.args[j] = Long.toString(constraint.getTimeLimit().longValue());
	//   31   53:aload_2         
	//   32   54:getfield        #232 <Field String[] Where.args>
	//   33   57:iload           4
	//   34   59:aload_1         
	//   35   60:invokevirtual   #86  <Method Long Constraint.getTimeLimit()>
	//   36   63:invokevirtual   #247 <Method long Long.longValue()>
	//   37   66:invokestatic    #47  <Method String Long.toString(long)>
	//   38   69:aastore         
			i = j + 1;
	//   39   70:iload           4
	//   40   72:iconst_1        
	//   41   73:iadd            
	//   42   74:istore_3        
		}
		j = i;
	//   43   75:iload_3         
	//   44   76:istore          4
		if(constraint.getTagConstraint() != null)
	//*  45   78:aload_1         
	//*  46   79:invokevirtual   #58  <Method TagConstraint Constraint.getTagConstraint()>
	//*  47   82:ifnull          136
		{
			Iterator iterator = constraint.getTags().iterator();
	//   48   85:aload_1         
	//   49   86:invokevirtual   #62  <Method Set Constraint.getTags()>
	//   50   89:invokeinterface #251 <Method Iterator Set.iterator()>
	//   51   94:astore          5
			do
			{
				j = i;
	//   52   96:iload_3         
	//   53   97:istore          4
				if(!iterator.hasNext())
					break;
	//   54   99:aload           5
	//   55  101:invokeinterface #256 <Method boolean Iterator.hasNext()>
	//   56  106:ifeq            136
				String s = (String)iterator.next();
	//   57  109:aload           5
	//   58  111:invokeinterface #260 <Method Object Iterator.next()>
	//   59  116:checkcast       #177 <Class String>
	//   60  119:astore          6
				where.args[i] = s;
	//   61  121:aload_2         
	//   62  122:getfield        #232 <Field String[] Where.args>
	//   63  125:iload_3         
	//   64  126:aload           6
	//   65  128:aastore         
				i++;
	//   66  129:iload_3         
	//   67  130:iconst_1        
	//   68  131:iadd            
	//   69  132:istore_3        
			} while(true);
	//   70  133:goto            96
		}
		Iterator iterator1 = constraint.getExcludeGroups().iterator();
	//   71  136:aload_1         
	//   72  137:invokevirtual   #72  <Method List Constraint.getExcludeGroups()>
	//   73  140:invokeinterface #261 <Method Iterator List.iterator()>
	//   74  145:astore          5
		for(i = j; iterator1.hasNext(); i++)
	//*  75  147:iload           4
	//*  76  149:istore_3        
	//*  77  150:aload           5
	//*  78  152:invokeinterface #256 <Method boolean Iterator.hasNext()>
	//*  79  157:ifeq            187
		{
			String s1 = (String)iterator1.next();
	//   80  160:aload           5
	//   81  162:invokeinterface #260 <Method Object Iterator.next()>
	//   82  167:checkcast       #177 <Class String>
	//   83  170:astore          6
			where.args[i] = s1;
	//   84  172:aload_2         
	//   85  173:getfield        #232 <Field String[] Where.args>
	//   86  176:iload_3         
	//   87  177:aload           6
	//   88  179:aastore         
		}

	//   89  180:iload_3         
	//   90  181:iconst_1        
	//   91  182:iadd            
	//   92  183:istore_3        
	//*  93  184:goto            150
		for(Iterator iterator2 = constraint.getExcludeJobIds().iterator(); iterator2.hasNext();)
	//*  94  187:aload_1         
	//*  95  188:invokevirtual   #78  <Method List Constraint.getExcludeJobIds()>
	//*  96  191:invokeinterface #261 <Method Iterator List.iterator()>
	//*  97  196:astore          5
	//*  98  198:aload           5
	//*  99  200:invokeinterface #256 <Method boolean Iterator.hasNext()>
	//* 100  205:ifeq            235
		{
			String s2 = (String)iterator2.next();
	//  101  208:aload           5
	//  102  210:invokeinterface #260 <Method Object Iterator.next()>
	//  103  215:checkcast       #177 <Class String>
	//  104  218:astore          6
			where.args[i] = s2;
	//  105  220:aload_2         
	//  106  221:getfield        #232 <Field String[] Where.args>
	//  107  224:iload_3         
	//  108  225:aload           6
	//  109  227:aastore         
			i++;
	//  110  228:iload_3         
	//  111  229:iconst_1        
	//  112  230:iadd            
	//  113  231:istore_3        
		}

	//* 114  232:goto            198
		j = i;
	//  115  235:iload_3         
	//  116  236:istore          4
		if(constraint.excludeRunning())
	//* 117  238:aload_1         
	//* 118  239:invokevirtual   #82  <Method boolean Constraint.excludeRunning()>
	//* 119  242:ifeq            260
		{
			where.args[i] = sessionId;
	//  120  245:aload_2         
	//  121  246:getfield        #232 <Field String[] Where.args>
	//  122  249:iload_3         
	//  123  250:aload_0         
	//  124  251:getfield        #49  <Field String sessionId>
	//  125  254:aastore         
			j = i + 1;
	//  126  255:iload_3         
	//  127  256:iconst_1        
	//  128  257:iadd            
	//  129  258:istore          4
		}
		if(j != where.args.length)
	//* 130  260:iload           4
	//* 131  262:aload_2         
	//* 132  263:getfield        #232 <Field String[] Where.args>
	//* 133  266:arraylength     
	//* 134  267:icmpeq          301
			throw new IllegalStateException((new StringBuilder()).append("something is wrong with where query cache for ").append(where.query).toString());
	//  135  270:new             #263 <Class IllegalStateException>
	//  136  273:dup             
	//  137  274:new             #95  <Class StringBuilder>
	//  138  277:dup             
	//  139  278:invokespecial   #218 <Method void StringBuilder()>
	//  140  281:ldc2            #265 <String "something is wrong with where query cache for ">
	//  141  284:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  142  287:aload_2         
	//  143  288:getfield        #268 <Field String Where.query>
	//  144  291:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  145  294:invokevirtual   #180 <Method String StringBuilder.toString()>
	//  146  297:invokespecial   #269 <Method void IllegalStateException(String)>
	//  147  300:athrow          
		else
			return;
	//  148  301:return          
	}

	private boolean isCacheable(Constraint constraint)
	{
		return constraint.getTags().size() < 64 && constraint.getExcludeGroups().size() < 64 && constraint.getExcludeJobIds().size() < 64;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #62  <Method Set Constraint.getTags()>
	//    2    4:invokeinterface #68  <Method int Set.size()>
	//    3    9:bipush          64
	//    4   11:icmpge          44
	//    5   14:aload_1         
	//    6   15:invokevirtual   #72  <Method List Constraint.getExcludeGroups()>
	//    7   18:invokeinterface #75  <Method int List.size()>
	//    8   23:bipush          64
	//    9   25:icmpge          44
	//   10   28:aload_1         
	//   11   29:invokevirtual   #78  <Method List Constraint.getExcludeJobIds()>
	//   12   32:invokeinterface #75  <Method int List.size()>
	//   13   37:bipush          64
	//   14   39:icmpge          44
	//   15   42:iconst_1        
	//   16   43:ireturn         
	//   17   44:iconst_0        
	//   18   45:ireturn         
	}

	public Where build(Constraint constraint, StringBuilder stringbuilder)
	{
		boolean flag = isCacheable(constraint);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #275 <Method boolean isCacheable(Constraint)>
	//    3    5:istore_3        
		long l = cacheKey(constraint);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #277 <Method long cacheKey(Constraint)>
	//    7   11:lstore          4
		Where where;
		Object obj;
		if(flag)
	//*   8   13:iload_3         
	//*   9   14:ifeq            86
			where = (Where)queryCache.get(((Object) (Long.valueOf(l))));
	//   10   17:aload_0         
	//   11   18:getfield        #41  <Field LruCache queryCache>
	//   12   21:lload           4
	//   13   23:invokestatic    #281 <Method Long Long.valueOf(long)>
	//   14   26:invokevirtual   #287 <Method Object LruCache.get(Object)>
	//   15   29:checkcast       #120 <Class Where>
	//   16   32:astore          6
		else
	//*  17   34:aload           6
	//*  18   36:astore          7
	//*  19   38:aload           6
	//*  20   40:ifnonnull       76
	//*  21   43:aload_0         
	//*  22   44:lload           4
	//*  23   46:aload_1         
	//*  24   47:aload_2         
	//*  25   48:invokespecial   #289 <Method Where createWhere(long, Constraint, StringBuilder)>
	//*  26   51:astore_2        
	//*  27   52:aload_2         
	//*  28   53:astore          7
	//*  29   55:iload_3         
	//*  30   56:ifeq            76
	//*  31   59:aload_0         
	//*  32   60:getfield        #41  <Field LruCache queryCache>
	//*  33   63:lload           4
	//*  34   65:invokestatic    #281 <Method Long Long.valueOf(long)>
	//*  35   68:aload_2         
	//*  36   69:invokevirtual   #293 <Method Object LruCache.put(Object, Object)>
	//*  37   72:pop             
	//*  38   73:aload_2         
	//*  39   74:astore          7
	//*  40   76:aload_0         
	//*  41   77:aload_1         
	//*  42   78:aload           7
	//*  43   80:invokespecial   #295 <Method void fillWhere(Constraint, Where)>
	//*  44   83:aload           7
	//*  45   85:areturn         
			where = null;
	//   46   86:aconst_null     
	//   47   87:astore          6
		obj = ((Object) (where));
		if(where == null)
		{
			stringbuilder = ((StringBuilder) (createWhere(l, constraint, stringbuilder)));
			obj = ((Object) (stringbuilder));
			if(flag)
			{
				queryCache.put(((Object) (Long.valueOf(l))), ((Object) (stringbuilder)));
				obj = ((Object) (stringbuilder));
			}
		}
		fillWhere(constraint, ((Where) (obj)));
		return ((Where) (obj));
	//*  48   89:goto            34
	}

	private static final int BOOL_SIZE = 1;
	static final int DEADLINE_COLUMN_INDEX = 1;
	private static final int EXCLUDE_RUNNING = 20;
	private static final int GROUP_COUNT = 8;
	private static final int INT_LIMIT = 64;
	private static final int INT_SIZE = 6;
	private static final int JOB_COUNT = 14;
	private static final int TAG_COUNT = 2;
	private static final int TAG_TYPE = 0;
	private static final int TIME_LIMIT = 21;
	private final LruCache queryCache = new LruCache(15) {

		protected void entryRemoved(boolean flag, Long long1, Where where, Where where1)
		{
			where.destroy();
		//    0    0:aload_3         
		//    1    1:invokevirtual   #25  <Method void Where.destroy()>
		//    2    4:return          
		}

		protected volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
		{
			entryRemoved(flag, (Long)obj, (Where)obj1, (Where)obj2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #28  <Class Long>
		//    4    6:aload_3         
		//    5    7:checkcast       #21  <Class Where>
		//    6   10:aload           4
		//    7   12:checkcast       #21  <Class Where>
		//    8   15:invokevirtual   #30  <Method void entryRemoved(boolean, Long, Where, Where)>
		//    9   18:return          
		}

		final WhereQueryCache this$0;

			
			{
				this$0 = WhereQueryCache.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #13  <Field WhereQueryCache this$0>
				super(i);
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:invokespecial   #16  <Method void LruCache(int)>
			//    6   10:return          
			}
	}
;
	private final String sessionId;
}
