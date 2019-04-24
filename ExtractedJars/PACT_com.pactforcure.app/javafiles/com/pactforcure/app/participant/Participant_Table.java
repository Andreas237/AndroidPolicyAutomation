// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.participant;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.*;
import com.raizlabs.android.dbflow.converter.DateConverter;
import com.raizlabs.android.dbflow.converter.TypeConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.*;
import com.raizlabs.android.dbflow.sql.language.property.*;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.Date;

// Referenced classes of package com.pactforcure.app.participant:
//			Participant

public final class Participant_Table extends ModelAdapter
{

	public Participant_Table(DatabaseHolder databaseholder, DatabaseDefinition databasedefinition)
	{
		super(databasedefinition);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #150 <Method void ModelAdapter(DatabaseDefinition)>
		global_typeConverterDateConverter = (DateConverter)databaseholder.getTypeConverterForClass(java/util/Date);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #152 <Class Date>
	//    6    9:invokevirtual   #158 <Method TypeConverter DatabaseHolder.getTypeConverterForClass(Class)>
	//    7   12:checkcast       #160 <Class DateConverter>
	//    8   15:putfield        #162 <Field DateConverter global_typeConverterDateConverter>
	//    9   18:return          
	}

	public final void bindToContentValues(ContentValues contentvalues, Participant participant)
	{
		contentvalues.put("`id`", Long.valueOf(participant.id));
	//    0    0:aload_1         
	//    1    1:ldc1            #168 <String "`id`">
	//    2    3:aload_2         
	//    3    4:getfield        #171 <Field long Participant.id>
	//    4    7:invokestatic    #177 <Method Long Long.valueOf(long)>
	//    5   10:invokevirtual   #183 <Method void ContentValues.put(String, Long)>
		bindToInsertValues(contentvalues, participant);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #186 <Method void bindToInsertValues(ContentValues, Participant)>
	//   10   19:return          
	}

	public volatile void bindToContentValues(ContentValues contentvalues, Object obj)
	{
		bindToContentValues(contentvalues, (Participant)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #51  <Class Participant>
	//    4    6:invokevirtual   #189 <Method void bindToContentValues(ContentValues, Participant)>
	//    5    9:return          
	}

	public final void bindToInsertStatement(DatabaseStatement databasestatement, Participant participant, int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          9
		long l1 = 1L;
	//    2    3:lconst_1        
	//    3    4:lstore          6
		long l;
		Long long1;
		if(participant.code != null)
	//*   4    6:aload_2         
	//*   5    7:getfield        #194 <Field String Participant.code>
	//*   6   10:ifnull          563
			databasestatement.bindString(i + 1, participant.code);
	//    7   13:aload_1         
	//    8   14:iload_3         
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:aload_2         
	//   12   18:getfield        #194 <Field String Participant.code>
	//   13   21:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
		else
	//*  14   26:aload_2         
	//*  15   27:getfield        #202 <Field String Participant.studyId>
	//*  16   30:ifnull          575
	//*  17   33:aload_1         
	//*  18   34:iload_3         
	//*  19   35:iconst_2        
	//*  20   36:iadd            
	//*  21   37:aload_2         
	//*  22   38:getfield        #202 <Field String Participant.studyId>
	//*  23   41:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
	//*  24   46:aload_2         
	//*  25   47:getfield        #205 <Field boolean Participant.inWatchStudy>
	//*  26   50:ifeq            587
	//*  27   53:lconst_1        
	//*  28   54:lstore          4
	//*  29   56:aload_1         
	//*  30   57:iload_3         
	//*  31   58:iconst_3        
	//*  32   59:iadd            
	//*  33   60:lload           4
	//*  34   62:invokeinterface #209 <Method void DatabaseStatement.bindLong(int, long)>
	//*  35   67:aload_2         
	//*  36   68:getfield        #211 <Field String Participant.firstName>
	//*  37   71:ifnull          593
	//*  38   74:aload_1         
	//*  39   75:iload_3         
	//*  40   76:iconst_4        
	//*  41   77:iadd            
	//*  42   78:aload_2         
	//*  43   79:getfield        #211 <Field String Participant.firstName>
	//*  44   82:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
	//*  45   87:aload_2         
	//*  46   88:getfield        #213 <Field String Participant.lastName>
	//*  47   91:ifnull          605
	//*  48   94:aload_1         
	//*  49   95:iload_3         
	//*  50   96:iconst_5        
	//*  51   97:iadd            
	//*  52   98:aload_2         
	//*  53   99:getfield        #213 <Field String Participant.lastName>
	//*  54  102:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
	//*  55  107:aload_2         
	//*  56  108:getfield        #215 <Field String Participant.email>
	//*  57  111:ifnull          617
	//*  58  114:aload_1         
	//*  59  115:iload_3         
	//*  60  116:bipush          6
	//*  61  118:iadd            
	//*  62  119:aload_2         
	//*  63  120:getfield        #215 <Field String Participant.email>
	//*  64  123:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
	//*  65  128:aload_2         
	//*  66  129:getfield        #217 <Field String Participant.telephone>
	//*  67  132:ifnull          630
	//*  68  135:aload_1         
	//*  69  136:iload_3         
	//*  70  137:bipush          7
	//*  71  139:iadd            
	//*  72  140:aload_2         
	//*  73  141:getfield        #217 <Field String Participant.telephone>
	//*  74  144:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
	//*  75  149:aload_2         
	//*  76  150:getfield        #219 <Field boolean Participant.activeStatus>
	//*  77  153:ifeq            643
	//*  78  156:lconst_1        
	//*  79  157:lstore          4
	//*  80  159:aload_1         
	//*  81  160:iload_3         
	//*  82  161:bipush          8
	//*  83  163:iadd            
	//*  84  164:lload           4
	//*  85  166:invokeinterface #209 <Method void DatabaseStatement.bindLong(int, long)>
	//*  86  171:aload_2         
	//*  87  172:getfield        #221 <Field boolean Participant.optOut>
	//*  88  175:ifeq            649
	//*  89  178:lconst_1        
	//*  90  179:lstore          4
	//*  91  181:aload_1         
	//*  92  182:iload_3         
	//*  93  183:bipush          9
	//*  94  185:iadd            
	//*  95  186:lload           4
	//*  96  188:invokeinterface #209 <Method void DatabaseStatement.bindLong(int, long)>
	//*  97  193:aload_2         
	//*  98  194:getfield        #224 <Field Integer Participant.age>
	//*  99  197:ifnull          655
	//* 100  200:aload_1         
	//* 101  201:iload_3         
	//* 102  202:bipush          10
	//* 103  204:iadd            
	//* 104  205:aload_2         
	//* 105  206:getfield        #224 <Field Integer Participant.age>
	//* 106  209:invokevirtual   #230 <Method int Integer.intValue()>
	//* 107  212:i2l             
	//* 108  213:invokeinterface #209 <Method void DatabaseStatement.bindLong(int, long)>
	//* 109  218:aload_2         
	//* 110  219:getfield        #232 <Field String Participant.race>
	//* 111  222:ifnull          668
	//* 112  225:aload_1         
	//* 113  226:iload_3         
	//* 114  227:bipush          11
	//* 115  229:iadd            
	//* 116  230:aload_2         
	//* 117  231:getfield        #232 <Field String Participant.race>
	//* 118  234:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
	//* 119  239:aload_2         
	//* 120  240:getfield        #234 <Field Integer Participant.numDeliveries>
	//* 121  243:ifnull          681
	//* 122  246:aload_1         
	//* 123  247:iload_3         
	//* 124  248:bipush          12
	//* 125  250:iadd            
	//* 126  251:aload_2         
	//* 127  252:getfield        #234 <Field Integer Participant.numDeliveries>
	//* 128  255:invokevirtual   #230 <Method int Integer.intValue()>
	//* 129  258:i2l             
	//* 130  259:invokeinterface #209 <Method void DatabaseStatement.bindLong(int, long)>
	//* 131  264:aload_2         
	//* 132  265:getfield        #237 <Field Date Participant.signedPDF>
	//* 133  268:ifnull          694
	//* 134  271:aload_0         
	//* 135  272:getfield        #162 <Field DateConverter global_typeConverterDateConverter>
	//* 136  275:aload_2         
	//* 137  276:getfield        #237 <Field Date Participant.signedPDF>
	//* 138  279:invokevirtual   #241 <Method Long DateConverter.getDBValue(Date)>
	//* 139  282:astore          8
	//* 140  284:aload           8
	//* 141  286:ifnull          700
	//* 142  289:aload_1         
	//* 143  290:iload_3         
	//* 144  291:bipush          13
	//* 145  293:iadd            
	//* 146  294:aload           8
	//* 147  296:invokevirtual   #245 <Method long Long.longValue()>
	//* 148  299:invokeinterface #209 <Method void DatabaseStatement.bindLong(int, long)>
	//* 149  304:aload_2         
	//* 150  305:getfield        #247 <Field boolean Participant.registered>
	//* 151  308:ifeq            713
	//* 152  311:lconst_1        
	//* 153  312:lstore          4
	//* 154  314:aload_1         
	//* 155  315:iload_3         
	//* 156  316:bipush          14
	//* 157  318:iadd            
	//* 158  319:lload           4
	//* 159  321:invokeinterface #209 <Method void DatabaseStatement.bindLong(int, long)>
	//* 160  326:aload_2         
	//* 161  327:getfield        #249 <Field boolean Participant.isUploaded>
	//* 162  330:ifeq            719
	//* 163  333:lconst_1        
	//* 164  334:lstore          4
	//* 165  336:aload_1         
	//* 166  337:iload_3         
	//* 167  338:bipush          15
	//* 168  340:iadd            
	//* 169  341:lload           4
	//* 170  343:invokeinterface #209 <Method void DatabaseStatement.bindLong(int, long)>
	//* 171  348:aload_2         
	//* 172  349:getfield        #251 <Field String Participant.address1>
	//* 173  352:ifnull          725
	//* 174  355:aload_1         
	//* 175  356:iload_3         
	//* 176  357:bipush          16
	//* 177  359:iadd            
	//* 178  360:aload_2         
	//* 179  361:getfield        #251 <Field String Participant.address1>
	//* 180  364:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
	//* 181  369:aload_2         
	//* 182  370:getfield        #253 <Field String Participant.address2>
	//* 183  373:ifnull          738
	//* 184  376:aload_1         
	//* 185  377:iload_3         
	//* 186  378:bipush          17
	//* 187  380:iadd            
	//* 188  381:aload_2         
	//* 189  382:getfield        #253 <Field String Participant.address2>
	//* 190  385:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
	//* 191  390:aload_2         
	//* 192  391:getfield        #255 <Field String Participant.city>
	//* 193  394:ifnull          751
	//* 194  397:aload_1         
	//* 195  398:iload_3         
	//* 196  399:bipush          18
	//* 197  401:iadd            
	//* 198  402:aload_2         
	//* 199  403:getfield        #255 <Field String Participant.city>
	//* 200  406:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
	//* 201  411:aload_2         
	//* 202  412:getfield        #257 <Field String Participant.state>
	//* 203  415:ifnull          764
	//* 204  418:aload_1         
	//* 205  419:iload_3         
	//* 206  420:bipush          19
	//* 207  422:iadd            
	//* 208  423:aload_2         
	//* 209  424:getfield        #257 <Field String Participant.state>
	//* 210  427:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
	//* 211  432:aload_2         
	//* 212  433:getfield        #259 <Field String Participant.zip>
	//* 213  436:ifnull          777
	//* 214  439:aload_1         
	//* 215  440:iload_3         
	//* 216  441:bipush          20
	//* 217  443:iadd            
	//* 218  444:aload_2         
	//* 219  445:getfield        #259 <Field String Participant.zip>
	//* 220  448:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
	//* 221  453:aload           9
	//* 222  455:astore          8
	//* 223  457:aload_2         
	//* 224  458:getfield        #261 <Field Date Participant.signedDNAPDF>
	//* 225  461:ifnull          477
	//* 226  464:aload_0         
	//* 227  465:getfield        #162 <Field DateConverter global_typeConverterDateConverter>
	//* 228  468:aload_2         
	//* 229  469:getfield        #261 <Field Date Participant.signedDNAPDF>
	//* 230  472:invokevirtual   #241 <Method Long DateConverter.getDBValue(Date)>
	//* 231  475:astore          8
	//* 232  477:aload           8
	//* 233  479:ifnull          790
	//* 234  482:aload_1         
	//* 235  483:iload_3         
	//* 236  484:bipush          21
	//* 237  486:iadd            
	//* 238  487:aload           8
	//* 239  489:invokevirtual   #245 <Method long Long.longValue()>
	//* 240  492:invokeinterface #209 <Method void DatabaseStatement.bindLong(int, long)>
	//* 241  497:aload_2         
	//* 242  498:getfield        #263 <Field boolean Participant.DNAregistered>
	//* 243  501:ifeq            803
	//* 244  504:lload           6
	//* 245  506:lstore          4
	//* 246  508:aload_1         
	//* 247  509:iload_3         
	//* 248  510:bipush          22
	//* 249  512:iadd            
	//* 250  513:lload           4
	//* 251  515:invokeinterface #209 <Method void DatabaseStatement.bindLong(int, long)>
	//* 252  520:aload_2         
	//* 253  521:getfield        #265 <Field String Participant.base64Signature>
	//* 254  524:ifnull          809
	//* 255  527:aload_1         
	//* 256  528:iload_3         
	//* 257  529:bipush          23
	//* 258  531:iadd            
	//* 259  532:aload_2         
	//* 260  533:getfield        #265 <Field String Participant.base64Signature>
	//* 261  536:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
	//* 262  541:aload_2         
	//* 263  542:getfield        #267 <Field String Participant.dnaBase64Signature>
	//* 264  545:ifnull          822
	//* 265  548:aload_1         
	//* 266  549:iload_3         
	//* 267  550:bipush          24
	//* 268  552:iadd            
	//* 269  553:aload_2         
	//* 270  554:getfield        #267 <Field String Participant.dnaBase64Signature>
	//* 271  557:invokeinterface #200 <Method void DatabaseStatement.bindString(int, String)>
	//* 272  562:return          
			databasestatement.bindNull(i + 1);
	//  273  563:aload_1         
	//  274  564:iload_3         
	//  275  565:iconst_1        
	//  276  566:iadd            
	//  277  567:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.studyId != null)
			databasestatement.bindString(i + 2, participant.studyId);
		else
	//* 278  572:goto            26
			databasestatement.bindNull(i + 2);
	//  279  575:aload_1         
	//  280  576:iload_3         
	//  281  577:iconst_2        
	//  282  578:iadd            
	//  283  579:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.inWatchStudy)
			l = 1L;
		else
	//* 284  584:goto            46
			l = 0L;
	//  285  587:lconst_0        
	//  286  588:lstore          4
		databasestatement.bindLong(i + 3, l);
		if(participant.firstName != null)
			databasestatement.bindString(i + 4, participant.firstName);
		else
	//* 287  590:goto            56
			databasestatement.bindNull(i + 4);
	//  288  593:aload_1         
	//  289  594:iload_3         
	//  290  595:iconst_4        
	//  291  596:iadd            
	//  292  597:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.lastName != null)
			databasestatement.bindString(i + 5, participant.lastName);
		else
	//* 293  602:goto            87
			databasestatement.bindNull(i + 5);
	//  294  605:aload_1         
	//  295  606:iload_3         
	//  296  607:iconst_5        
	//  297  608:iadd            
	//  298  609:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.email != null)
			databasestatement.bindString(i + 6, participant.email);
		else
	//* 299  614:goto            107
			databasestatement.bindNull(i + 6);
	//  300  617:aload_1         
	//  301  618:iload_3         
	//  302  619:bipush          6
	//  303  621:iadd            
	//  304  622:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.telephone != null)
			databasestatement.bindString(i + 7, participant.telephone);
		else
	//* 305  627:goto            128
			databasestatement.bindNull(i + 7);
	//  306  630:aload_1         
	//  307  631:iload_3         
	//  308  632:bipush          7
	//  309  634:iadd            
	//  310  635:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.activeStatus)
			l = 1L;
		else
	//* 311  640:goto            149
			l = 0L;
	//  312  643:lconst_0        
	//  313  644:lstore          4
		databasestatement.bindLong(i + 8, l);
		if(participant.optOut)
			l = 1L;
		else
	//* 314  646:goto            159
			l = 0L;
	//  315  649:lconst_0        
	//  316  650:lstore          4
		databasestatement.bindLong(i + 9, l);
		if(participant.age != null)
			databasestatement.bindLong(i + 10, participant.age.intValue());
		else
	//* 317  652:goto            181
			databasestatement.bindNull(i + 10);
	//  318  655:aload_1         
	//  319  656:iload_3         
	//  320  657:bipush          10
	//  321  659:iadd            
	//  322  660:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.race != null)
			databasestatement.bindString(i + 11, participant.race);
		else
	//* 323  665:goto            218
			databasestatement.bindNull(i + 11);
	//  324  668:aload_1         
	//  325  669:iload_3         
	//  326  670:bipush          11
	//  327  672:iadd            
	//  328  673:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.numDeliveries != null)
			databasestatement.bindLong(i + 12, participant.numDeliveries.intValue());
		else
	//* 329  678:goto            239
			databasestatement.bindNull(i + 12);
	//  330  681:aload_1         
	//  331  682:iload_3         
	//  332  683:bipush          12
	//  333  685:iadd            
	//  334  686:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.signedPDF != null)
			long1 = global_typeConverterDateConverter.getDBValue(participant.signedPDF);
		else
	//* 335  691:goto            264
			long1 = null;
	//  336  694:aconst_null     
	//  337  695:astore          8
		if(long1 != null)
			databasestatement.bindLong(i + 13, long1.longValue());
		else
	//* 338  697:goto            284
			databasestatement.bindNull(i + 13);
	//  339  700:aload_1         
	//  340  701:iload_3         
	//  341  702:bipush          13
	//  342  704:iadd            
	//  343  705:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.registered)
			l = 1L;
		else
	//* 344  710:goto            304
			l = 0L;
	//  345  713:lconst_0        
	//  346  714:lstore          4
		databasestatement.bindLong(i + 14, l);
		if(participant.isUploaded)
			l = 1L;
		else
	//* 347  716:goto            314
			l = 0L;
	//  348  719:lconst_0        
	//  349  720:lstore          4
		databasestatement.bindLong(i + 15, l);
		if(participant.address1 != null)
			databasestatement.bindString(i + 16, participant.address1);
		else
	//* 350  722:goto            336
			databasestatement.bindNull(i + 16);
	//  351  725:aload_1         
	//  352  726:iload_3         
	//  353  727:bipush          16
	//  354  729:iadd            
	//  355  730:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.address2 != null)
			databasestatement.bindString(i + 17, participant.address2);
		else
	//* 356  735:goto            369
			databasestatement.bindNull(i + 17);
	//  357  738:aload_1         
	//  358  739:iload_3         
	//  359  740:bipush          17
	//  360  742:iadd            
	//  361  743:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.city != null)
			databasestatement.bindString(i + 18, participant.city);
		else
	//* 362  748:goto            390
			databasestatement.bindNull(i + 18);
	//  363  751:aload_1         
	//  364  752:iload_3         
	//  365  753:bipush          18
	//  366  755:iadd            
	//  367  756:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.state != null)
			databasestatement.bindString(i + 19, participant.state);
		else
	//* 368  761:goto            411
			databasestatement.bindNull(i + 19);
	//  369  764:aload_1         
	//  370  765:iload_3         
	//  371  766:bipush          19
	//  372  768:iadd            
	//  373  769:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.zip != null)
			databasestatement.bindString(i + 20, participant.zip);
		else
	//* 374  774:goto            432
			databasestatement.bindNull(i + 20);
	//  375  777:aload_1         
	//  376  778:iload_3         
	//  377  779:bipush          20
	//  378  781:iadd            
	//  379  782:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		long1 = ((Long) (obj));
		if(participant.signedDNAPDF != null)
			long1 = global_typeConverterDateConverter.getDBValue(participant.signedDNAPDF);
		if(long1 != null)
			databasestatement.bindLong(i + 21, long1.longValue());
		else
	//* 380  787:goto            453
			databasestatement.bindNull(i + 21);
	//  381  790:aload_1         
	//  382  791:iload_3         
	//  383  792:bipush          21
	//  384  794:iadd            
	//  385  795:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.DNAregistered)
			l = l1;
		else
	//* 386  800:goto            497
			l = 0L;
	//  387  803:lconst_0        
	//  388  804:lstore          4
		databasestatement.bindLong(i + 22, l);
		if(participant.base64Signature != null)
			databasestatement.bindString(i + 23, participant.base64Signature);
		else
	//* 389  806:goto            508
			databasestatement.bindNull(i + 23);
	//  390  809:aload_1         
	//  391  810:iload_3         
	//  392  811:bipush          23
	//  393  813:iadd            
	//  394  814:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
		if(participant.dnaBase64Signature != null)
		{
			databasestatement.bindString(i + 24, participant.dnaBase64Signature);
			return;
		} else
	//* 395  819:goto            541
		{
			databasestatement.bindNull(i + 24);
	//  396  822:aload_1         
	//  397  823:iload_3         
	//  398  824:bipush          24
	//  399  826:iadd            
	//  400  827:invokeinterface #271 <Method void DatabaseStatement.bindNull(int)>
			return;
	//  401  832:return          
		}
	}

	public volatile void bindToInsertStatement(DatabaseStatement databasestatement, Object obj, int i)
	{
		bindToInsertStatement(databasestatement, (Participant)obj, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #51  <Class Participant>
	//    4    6:iload_3         
	//    5    7:invokevirtual   #274 <Method void bindToInsertStatement(DatabaseStatement, Participant, int)>
	//    6   10:return          
	}

	public final void bindToInsertValues(ContentValues contentvalues, Participant participant)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		Object obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          6
		int i;
		Object obj;
		if(participant.code != null)
	//*   4    6:aload_2         
	//*   5    7:getfield        #194 <Field String Participant.code>
	//*   6   10:ifnull          552
			obj = ((Object) (participant.code));
	//    7   13:aload_2         
	//    8   14:getfield        #194 <Field String Participant.code>
	//    9   17:astore          5
		else
	//*  10   19:aload_1         
	//*  11   20:ldc2            #276 <String "`code`">
	//*  12   23:aload           5
	//*  13   25:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//*  14   28:aload_2         
	//*  15   29:getfield        #202 <Field String Participant.studyId>
	//*  16   32:ifnull          558
	//*  17   35:aload_2         
	//*  18   36:getfield        #202 <Field String Participant.studyId>
	//*  19   39:astore          5
	//*  20   41:aload_1         
	//*  21   42:ldc2            #281 <String "`studyId`">
	//*  22   45:aload           5
	//*  23   47:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//*  24   50:aload_2         
	//*  25   51:getfield        #205 <Field boolean Participant.inWatchStudy>
	//*  26   54:ifeq            564
	//*  27   57:iconst_1        
	//*  28   58:istore_3        
	//*  29   59:aload_1         
	//*  30   60:ldc2            #283 <String "`inWatchStudy`">
	//*  31   63:iload_3         
	//*  32   64:invokestatic    #286 <Method Integer Integer.valueOf(int)>
	//*  33   67:invokevirtual   #289 <Method void ContentValues.put(String, Integer)>
	//*  34   70:aload_2         
	//*  35   71:getfield        #211 <Field String Participant.firstName>
	//*  36   74:ifnull          569
	//*  37   77:aload_2         
	//*  38   78:getfield        #211 <Field String Participant.firstName>
	//*  39   81:astore          5
	//*  40   83:aload_1         
	//*  41   84:ldc2            #291 <String "`firstName`">
	//*  42   87:aload           5
	//*  43   89:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//*  44   92:aload_2         
	//*  45   93:getfield        #213 <Field String Participant.lastName>
	//*  46   96:ifnull          575
	//*  47   99:aload_2         
	//*  48  100:getfield        #213 <Field String Participant.lastName>
	//*  49  103:astore          5
	//*  50  105:aload_1         
	//*  51  106:ldc2            #293 <String "`lastName`">
	//*  52  109:aload           5
	//*  53  111:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//*  54  114:aload_2         
	//*  55  115:getfield        #215 <Field String Participant.email>
	//*  56  118:ifnull          581
	//*  57  121:aload_2         
	//*  58  122:getfield        #215 <Field String Participant.email>
	//*  59  125:astore          5
	//*  60  127:aload_1         
	//*  61  128:ldc2            #295 <String "`email`">
	//*  62  131:aload           5
	//*  63  133:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//*  64  136:aload_2         
	//*  65  137:getfield        #217 <Field String Participant.telephone>
	//*  66  140:ifnull          587
	//*  67  143:aload_2         
	//*  68  144:getfield        #217 <Field String Participant.telephone>
	//*  69  147:astore          5
	//*  70  149:aload_1         
	//*  71  150:ldc2            #297 <String "`telephone`">
	//*  72  153:aload           5
	//*  73  155:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//*  74  158:aload_2         
	//*  75  159:getfield        #219 <Field boolean Participant.activeStatus>
	//*  76  162:ifeq            593
	//*  77  165:iconst_1        
	//*  78  166:istore_3        
	//*  79  167:aload_1         
	//*  80  168:ldc2            #299 <String "`activeStatus`">
	//*  81  171:iload_3         
	//*  82  172:invokestatic    #286 <Method Integer Integer.valueOf(int)>
	//*  83  175:invokevirtual   #289 <Method void ContentValues.put(String, Integer)>
	//*  84  178:aload_2         
	//*  85  179:getfield        #221 <Field boolean Participant.optOut>
	//*  86  182:ifeq            598
	//*  87  185:iconst_1        
	//*  88  186:istore_3        
	//*  89  187:aload_1         
	//*  90  188:ldc2            #301 <String "`optOut`">
	//*  91  191:iload_3         
	//*  92  192:invokestatic    #286 <Method Integer Integer.valueOf(int)>
	//*  93  195:invokevirtual   #289 <Method void ContentValues.put(String, Integer)>
	//*  94  198:aload_2         
	//*  95  199:getfield        #224 <Field Integer Participant.age>
	//*  96  202:ifnull          603
	//*  97  205:aload_2         
	//*  98  206:getfield        #224 <Field Integer Participant.age>
	//*  99  209:astore          5
	//* 100  211:aload_1         
	//* 101  212:ldc2            #303 <String "`age`">
	//* 102  215:aload           5
	//* 103  217:invokevirtual   #289 <Method void ContentValues.put(String, Integer)>
	//* 104  220:aload_2         
	//* 105  221:getfield        #232 <Field String Participant.race>
	//* 106  224:ifnull          609
	//* 107  227:aload_2         
	//* 108  228:getfield        #232 <Field String Participant.race>
	//* 109  231:astore          5
	//* 110  233:aload_1         
	//* 111  234:ldc2            #305 <String "`race`">
	//* 112  237:aload           5
	//* 113  239:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//* 114  242:aload_2         
	//* 115  243:getfield        #234 <Field Integer Participant.numDeliveries>
	//* 116  246:ifnull          615
	//* 117  249:aload_2         
	//* 118  250:getfield        #234 <Field Integer Participant.numDeliveries>
	//* 119  253:astore          5
	//* 120  255:aload_1         
	//* 121  256:ldc2            #307 <String "`numDeliveries`">
	//* 122  259:aload           5
	//* 123  261:invokevirtual   #289 <Method void ContentValues.put(String, Integer)>
	//* 124  264:aload_2         
	//* 125  265:getfield        #237 <Field Date Participant.signedPDF>
	//* 126  268:ifnull          621
	//* 127  271:aload_0         
	//* 128  272:getfield        #162 <Field DateConverter global_typeConverterDateConverter>
	//* 129  275:aload_2         
	//* 130  276:getfield        #237 <Field Date Participant.signedPDF>
	//* 131  279:invokevirtual   #241 <Method Long DateConverter.getDBValue(Date)>
	//* 132  282:astore          5
	//* 133  284:aload           5
	//* 134  286:ifnull          627
	//* 135  289:aload_1         
	//* 136  290:ldc2            #309 <String "`signedPDF`">
	//* 137  293:aload           5
	//* 138  295:invokevirtual   #183 <Method void ContentValues.put(String, Long)>
	//* 139  298:aload_2         
	//* 140  299:getfield        #247 <Field boolean Participant.registered>
	//* 141  302:ifeq            633
	//* 142  305:iconst_1        
	//* 143  306:istore_3        
	//* 144  307:aload_1         
	//* 145  308:ldc2            #311 <String "`registered`">
	//* 146  311:iload_3         
	//* 147  312:invokestatic    #286 <Method Integer Integer.valueOf(int)>
	//* 148  315:invokevirtual   #289 <Method void ContentValues.put(String, Integer)>
	//* 149  318:aload_2         
	//* 150  319:getfield        #249 <Field boolean Participant.isUploaded>
	//* 151  322:ifeq            638
	//* 152  325:iconst_1        
	//* 153  326:istore_3        
	//* 154  327:aload_1         
	//* 155  328:ldc2            #313 <String "`isUploaded`">
	//* 156  331:iload_3         
	//* 157  332:invokestatic    #286 <Method Integer Integer.valueOf(int)>
	//* 158  335:invokevirtual   #289 <Method void ContentValues.put(String, Integer)>
	//* 159  338:aload_2         
	//* 160  339:getfield        #251 <Field String Participant.address1>
	//* 161  342:ifnull          643
	//* 162  345:aload_2         
	//* 163  346:getfield        #251 <Field String Participant.address1>
	//* 164  349:astore          5
	//* 165  351:aload_1         
	//* 166  352:ldc2            #315 <String "`address1`">
	//* 167  355:aload           5
	//* 168  357:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//* 169  360:aload_2         
	//* 170  361:getfield        #253 <Field String Participant.address2>
	//* 171  364:ifnull          649
	//* 172  367:aload_2         
	//* 173  368:getfield        #253 <Field String Participant.address2>
	//* 174  371:astore          5
	//* 175  373:aload_1         
	//* 176  374:ldc2            #317 <String "`address2`">
	//* 177  377:aload           5
	//* 178  379:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//* 179  382:aload_2         
	//* 180  383:getfield        #255 <Field String Participant.city>
	//* 181  386:ifnull          655
	//* 182  389:aload_2         
	//* 183  390:getfield        #255 <Field String Participant.city>
	//* 184  393:astore          5
	//* 185  395:aload_1         
	//* 186  396:ldc2            #319 <String "`city`">
	//* 187  399:aload           5
	//* 188  401:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//* 189  404:aload_2         
	//* 190  405:getfield        #257 <Field String Participant.state>
	//* 191  408:ifnull          661
	//* 192  411:aload_2         
	//* 193  412:getfield        #257 <Field String Participant.state>
	//* 194  415:astore          5
	//* 195  417:aload_1         
	//* 196  418:ldc2            #321 <String "`state`">
	//* 197  421:aload           5
	//* 198  423:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//* 199  426:aload_2         
	//* 200  427:getfield        #259 <Field String Participant.zip>
	//* 201  430:ifnull          667
	//* 202  433:aload_2         
	//* 203  434:getfield        #259 <Field String Participant.zip>
	//* 204  437:astore          5
	//* 205  439:aload_1         
	//* 206  440:ldc2            #323 <String "`zip`">
	//* 207  443:aload           5
	//* 208  445:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//* 209  448:aload_2         
	//* 210  449:getfield        #261 <Field Date Participant.signedDNAPDF>
	//* 211  452:ifnull          673
	//* 212  455:aload_0         
	//* 213  456:getfield        #162 <Field DateConverter global_typeConverterDateConverter>
	//* 214  459:aload_2         
	//* 215  460:getfield        #261 <Field Date Participant.signedDNAPDF>
	//* 216  463:invokevirtual   #241 <Method Long DateConverter.getDBValue(Date)>
	//* 217  466:astore          5
	//* 218  468:aload           5
	//* 219  470:ifnull          679
	//* 220  473:aload_1         
	//* 221  474:ldc2            #325 <String "`signedDNAPDF`">
	//* 222  477:aload           5
	//* 223  479:invokevirtual   #183 <Method void ContentValues.put(String, Long)>
	//* 224  482:aload_2         
	//* 225  483:getfield        #263 <Field boolean Participant.DNAregistered>
	//* 226  486:ifeq            685
	//* 227  489:iload           4
	//* 228  491:istore_3        
	//* 229  492:aload_1         
	//* 230  493:ldc2            #327 <String "`DNAregistered`">
	//* 231  496:iload_3         
	//* 232  497:invokestatic    #286 <Method Integer Integer.valueOf(int)>
	//* 233  500:invokevirtual   #289 <Method void ContentValues.put(String, Integer)>
	//* 234  503:aload_2         
	//* 235  504:getfield        #265 <Field String Participant.base64Signature>
	//* 236  507:ifnull          690
	//* 237  510:aload_2         
	//* 238  511:getfield        #265 <Field String Participant.base64Signature>
	//* 239  514:astore          5
	//* 240  516:aload_1         
	//* 241  517:ldc2            #329 <String "`base64Signature`">
	//* 242  520:aload           5
	//* 243  522:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//* 244  525:aload           6
	//* 245  527:astore          5
	//* 246  529:aload_2         
	//* 247  530:getfield        #267 <Field String Participant.dnaBase64Signature>
	//* 248  533:ifnull          542
	//* 249  536:aload_2         
	//* 250  537:getfield        #267 <Field String Participant.dnaBase64Signature>
	//* 251  540:astore          5
	//* 252  542:aload_1         
	//* 253  543:ldc2            #331 <String "`dnaBase64Signature`">
	//* 254  546:aload           5
	//* 255  548:invokevirtual   #279 <Method void ContentValues.put(String, String)>
	//* 256  551:return          
			obj = null;
	//  257  552:aconst_null     
	//  258  553:astore          5
		contentvalues.put("`code`", ((String) (obj)));
		if(participant.studyId != null)
			obj = ((Object) (participant.studyId));
		else
	//* 259  555:goto            19
			obj = null;
	//  260  558:aconst_null     
	//  261  559:astore          5
		contentvalues.put("`studyId`", ((String) (obj)));
		if(participant.inWatchStudy)
			i = 1;
		else
	//* 262  561:goto            41
			i = 0;
	//  263  564:iconst_0        
	//  264  565:istore_3        
		contentvalues.put("`inWatchStudy`", Integer.valueOf(i));
		if(participant.firstName != null)
			obj = ((Object) (participant.firstName));
		else
	//* 265  566:goto            59
			obj = null;
	//  266  569:aconst_null     
	//  267  570:astore          5
		contentvalues.put("`firstName`", ((String) (obj)));
		if(participant.lastName != null)
			obj = ((Object) (participant.lastName));
		else
	//* 268  572:goto            83
			obj = null;
	//  269  575:aconst_null     
	//  270  576:astore          5
		contentvalues.put("`lastName`", ((String) (obj)));
		if(participant.email != null)
			obj = ((Object) (participant.email));
		else
	//* 271  578:goto            105
			obj = null;
	//  272  581:aconst_null     
	//  273  582:astore          5
		contentvalues.put("`email`", ((String) (obj)));
		if(participant.telephone != null)
			obj = ((Object) (participant.telephone));
		else
	//* 274  584:goto            127
			obj = null;
	//  275  587:aconst_null     
	//  276  588:astore          5
		contentvalues.put("`telephone`", ((String) (obj)));
		if(participant.activeStatus)
			i = 1;
		else
	//* 277  590:goto            149
			i = 0;
	//  278  593:iconst_0        
	//  279  594:istore_3        
		contentvalues.put("`activeStatus`", Integer.valueOf(i));
		if(participant.optOut)
			i = 1;
		else
	//* 280  595:goto            167
			i = 0;
	//  281  598:iconst_0        
	//  282  599:istore_3        
		contentvalues.put("`optOut`", Integer.valueOf(i));
		if(participant.age != null)
			obj = ((Object) (participant.age));
		else
	//* 283  600:goto            187
			obj = null;
	//  284  603:aconst_null     
	//  285  604:astore          5
		contentvalues.put("`age`", ((Integer) (obj)));
		if(participant.race != null)
			obj = ((Object) (participant.race));
		else
	//* 286  606:goto            211
			obj = null;
	//  287  609:aconst_null     
	//  288  610:astore          5
		contentvalues.put("`race`", ((String) (obj)));
		if(participant.numDeliveries != null)
			obj = ((Object) (participant.numDeliveries));
		else
	//* 289  612:goto            233
			obj = null;
	//  290  615:aconst_null     
	//  291  616:astore          5
		contentvalues.put("`numDeliveries`", ((Integer) (obj)));
		if(participant.signedPDF != null)
			obj = ((Object) (global_typeConverterDateConverter.getDBValue(participant.signedPDF)));
		else
	//* 292  618:goto            255
			obj = null;
	//  293  621:aconst_null     
	//  294  622:astore          5
		if(obj == null)
	//* 295  624:goto            284
			obj = null;
	//  296  627:aconst_null     
	//  297  628:astore          5
		contentvalues.put("`signedPDF`", ((Long) (obj)));
		if(participant.registered)
			i = 1;
		else
	//* 298  630:goto            289
			i = 0;
	//  299  633:iconst_0        
	//  300  634:istore_3        
		contentvalues.put("`registered`", Integer.valueOf(i));
		if(participant.isUploaded)
			i = 1;
		else
	//* 301  635:goto            307
			i = 0;
	//  302  638:iconst_0        
	//  303  639:istore_3        
		contentvalues.put("`isUploaded`", Integer.valueOf(i));
		if(participant.address1 != null)
			obj = ((Object) (participant.address1));
		else
	//* 304  640:goto            327
			obj = null;
	//  305  643:aconst_null     
	//  306  644:astore          5
		contentvalues.put("`address1`", ((String) (obj)));
		if(participant.address2 != null)
			obj = ((Object) (participant.address2));
		else
	//* 307  646:goto            351
			obj = null;
	//  308  649:aconst_null     
	//  309  650:astore          5
		contentvalues.put("`address2`", ((String) (obj)));
		if(participant.city != null)
			obj = ((Object) (participant.city));
		else
	//* 310  652:goto            373
			obj = null;
	//  311  655:aconst_null     
	//  312  656:astore          5
		contentvalues.put("`city`", ((String) (obj)));
		if(participant.state != null)
			obj = ((Object) (participant.state));
		else
	//* 313  658:goto            395
			obj = null;
	//  314  661:aconst_null     
	//  315  662:astore          5
		contentvalues.put("`state`", ((String) (obj)));
		if(participant.zip != null)
			obj = ((Object) (participant.zip));
		else
	//* 316  664:goto            417
			obj = null;
	//  317  667:aconst_null     
	//  318  668:astore          5
		contentvalues.put("`zip`", ((String) (obj)));
		if(participant.signedDNAPDF != null)
			obj = ((Object) (global_typeConverterDateConverter.getDBValue(participant.signedDNAPDF)));
		else
	//* 319  670:goto            439
			obj = null;
	//  320  673:aconst_null     
	//  321  674:astore          5
		if(obj == null)
	//* 322  676:goto            468
			obj = null;
	//  323  679:aconst_null     
	//  324  680:astore          5
		contentvalues.put("`signedDNAPDF`", ((Long) (obj)));
		if(participant.DNAregistered)
			i = ((int) (flag));
		else
	//* 325  682:goto            473
			i = 0;
	//  326  685:iconst_0        
	//  327  686:istore_3        
		contentvalues.put("`DNAregistered`", Integer.valueOf(i));
		if(participant.base64Signature != null)
			obj = ((Object) (participant.base64Signature));
		else
	//* 328  687:goto            492
			obj = null;
	//  329  690:aconst_null     
	//  330  691:astore          5
		contentvalues.put("`base64Signature`", ((String) (obj)));
		obj = ((Object) (obj1));
		if(participant.dnaBase64Signature != null)
			obj = ((Object) (participant.dnaBase64Signature));
		contentvalues.put("`dnaBase64Signature`", ((String) (obj)));
	//* 331  693:goto            516
	}

	public volatile void bindToInsertValues(ContentValues contentvalues, Object obj)
	{
		bindToInsertValues(contentvalues, (Participant)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #51  <Class Participant>
	//    4    6:invokevirtual   #186 <Method void bindToInsertValues(ContentValues, Participant)>
	//    5    9:return          
	}

	public final void bindToStatement(DatabaseStatement databasestatement, Participant participant)
	{
		databasestatement.bindLong(1, participant.id);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_2         
	//    3    3:getfield        #171 <Field long Participant.id>
	//    4    6:invokeinterface #209 <Method void DatabaseStatement.bindLong(int, long)>
		bindToInsertStatement(databasestatement, participant, 1);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #274 <Method void bindToInsertStatement(DatabaseStatement, Participant, int)>
	//   10   18:return          
	}

	public volatile void bindToStatement(DatabaseStatement databasestatement, Object obj)
	{
		bindToStatement(databasestatement, (Participant)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #51  <Class Participant>
	//    4    6:invokevirtual   #336 <Method void bindToStatement(DatabaseStatement, Participant)>
	//    5    9:return          
	}

	public final boolean exists(Participant participant, DatabaseWrapper databasewrapper)
	{
		return participant.id > 0L && SQLite.selectCountOf(new IProperty[0]).from(com/pactforcure/app/participant/Participant).where(new SQLCondition[] {
			getPrimaryConditionClause(participant)
		}).hasData(databasewrapper);
	//    0    0:aload_1         
	//    1    1:getfield        #171 <Field long Participant.id>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifle            45
	//    5    9:iconst_0        
	//    6   10:anewarray       IProperty[]
	//    7   13:invokestatic    #344 <Method Select SQLite.selectCountOf(IProperty[])>
	//    8   16:ldc1            #51  <Class Participant>
	//    9   18:invokevirtual   #350 <Method From Select.from(Class)>
	//   10   21:iconst_1        
	//   11   22:anewarray       SQLCondition[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #356 <Method ConditionGroup getPrimaryConditionClause(Participant)>
	//   17   32:aastore         
	//   18   33:invokevirtual   #362 <Method Where From.where(SQLCondition[])>
	//   19   36:aload_2         
	//   20   37:invokevirtual   #368 <Method boolean Where.hasData(DatabaseWrapper)>
	//   21   40:ifeq            45
	//   22   43:iconst_1        
	//   23   44:ireturn         
	//   24   45:iconst_0        
	//   25   46:ireturn         
	}

	public volatile boolean exists(Object obj, DatabaseWrapper databasewrapper)
	{
		return exists((Participant)obj, databasewrapper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #51  <Class Participant>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #371 <Method boolean exists(Participant, DatabaseWrapper)>
	//    5    9:ireturn         
	}

	public final IProperty[] getAllColumnProperties()
	{
		return ALL_COLUMN_PROPERTIES;
	//    0    0:getstatic       #145 <Field IProperty[] ALL_COLUMN_PROPERTIES>
	//    1    3:areturn         
	}

	public final String getAutoIncrementingColumnName()
	{
		return "id";
	//    0    0:ldc1            #52  <String "id">
	//    1    2:areturn         
	}

	public final Number getAutoIncrementingId(Participant participant)
	{
		return ((Number) (Long.valueOf(participant.id)));
	//    0    0:aload_1         
	//    1    1:getfield        #171 <Field long Participant.id>
	//    2    4:invokestatic    #177 <Method Long Long.valueOf(long)>
	//    3    7:areturn         
	}

	public volatile Number getAutoIncrementingId(Object obj)
	{
		return getAutoIncrementingId((Participant)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #51  <Class Participant>
	//    3    5:invokevirtual   #380 <Method Number getAutoIncrementingId(Participant)>
	//    4    8:areturn         
	}

	public final String getCompiledStatementQuery()
	{
		return "INSERT INTO `Participant`(`id`,`code`,`studyId`,`inWatchStudy`,`firstName`,`lastName`,`email`,`telephone`,`activeStatus`,`optOut`,`age`,`race`,`numDeliveries`,`signedPDF`,`registered`,`isUploaded`,`address1`,`address2`,`city`,`state`,`zip`,`signedDNAPDF`,`DNAregistered`,`base64Signature`,`dnaBase64Signature`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	//    0    0:ldc2            #383 <String "INSERT INTO `Participant`(`id`,`code`,`studyId`,`inWatchStudy`,`firstName`,`lastName`,`email`,`telephone`,`activeStatus`,`optOut`,`age`,`race`,`numDeliveries`,`signedPDF`,`registered`,`isUploaded`,`address1`,`address2`,`city`,`state`,`zip`,`signedDNAPDF`,`DNAregistered`,`base64Signature`,`dnaBase64Signature`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)">
	//    1    3:areturn         
	}

	public final String getCreationQuery()
	{
		return "CREATE TABLE IF NOT EXISTS `Participant`(`id` INTEGER PRIMARY KEY AUTOINCREMENT,`code` TEXT,`studyId` TEXT,`inWatchStudy` INTEGER,`firstName` TEXT,`lastName` TEXT,`email` TEXT,`telephone` TEXT,`activeStatus` INTEGER,`optOut` INTEGER,`age` INTEGER,`race` TEXT,`numDeliveries` INTEGER,`signedPDF` TEXT,`registered` INTEGER,`isUploaded` INTEGER,`address1` TEXT,`address2` TEXT,`city` TEXT,`state` TEXT,`zip` TEXT,`signedDNAPDF` TEXT,`DNAregistered` INTEGER,`base64Signature` TEXT,`dnaBase64Signature` TEXT);";
	//    0    0:ldc2            #386 <String "CREATE TABLE IF NOT EXISTS `Participant`(`id` INTEGER PRIMARY KEY AUTOINCREMENT,`code` TEXT,`studyId` TEXT,`inWatchStudy` INTEGER,`firstName` TEXT,`lastName` TEXT,`email` TEXT,`telephone` TEXT,`activeStatus` INTEGER,`optOut` INTEGER,`age` INTEGER,`race` TEXT,`numDeliveries` INTEGER,`signedPDF` TEXT,`registered` INTEGER,`isUploaded` INTEGER,`address1` TEXT,`address2` TEXT,`city` TEXT,`state` TEXT,`zip` TEXT,`signedDNAPDF` TEXT,`DNAregistered` INTEGER,`base64Signature` TEXT,`dnaBase64Signature` TEXT);">
	//    1    3:areturn         
	}

	public final String getInsertStatementQuery()
	{
		return "INSERT INTO `Participant`(`code`,`studyId`,`inWatchStudy`,`firstName`,`lastName`,`email`,`telephone`,`activeStatus`,`optOut`,`age`,`race`,`numDeliveries`,`signedPDF`,`registered`,`isUploaded`,`address1`,`address2`,`city`,`state`,`zip`,`signedDNAPDF`,`DNAregistered`,`base64Signature`,`dnaBase64Signature`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	//    0    0:ldc2            #389 <String "INSERT INTO `Participant`(`code`,`studyId`,`inWatchStudy`,`firstName`,`lastName`,`email`,`telephone`,`activeStatus`,`optOut`,`age`,`race`,`numDeliveries`,`signedPDF`,`registered`,`isUploaded`,`address1`,`address2`,`city`,`state`,`zip`,`signedDNAPDF`,`DNAregistered`,`base64Signature`,`dnaBase64Signature`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)">
	//    1    3:areturn         
	}

	public final Class getModelClass()
	{
		return com/pactforcure/app/participant/Participant;
	//    0    0:ldc1            #51  <Class Participant>
	//    1    2:areturn         
	}

	public final ConditionGroup getPrimaryConditionClause(Participant participant)
	{
		ConditionGroup conditiongroup = ConditionGroup.clause();
	//    0    0:invokestatic    #399 <Method ConditionGroup ConditionGroup.clause()>
	//    1    3:astore_2        
		conditiongroup.and(((SQLCondition) (id.eq(participant.id))));
	//    2    4:aload_2         
	//    3    5:getstatic       #58  <Field LongProperty id>
	//    4    8:aload_1         
	//    5    9:getfield        #171 <Field long Participant.id>
	//    6   12:invokevirtual   #403 <Method com.raizlabs.android.dbflow.sql.language.Condition LongProperty.eq(long)>
	//    7   15:invokevirtual   #407 <Method ConditionGroup ConditionGroup.and(SQLCondition)>
	//    8   18:pop             
		return conditiongroup;
	//    9   19:aload_2         
	//   10   20:areturn         
	}

	public volatile ConditionGroup getPrimaryConditionClause(Object obj)
	{
		return getPrimaryConditionClause((Participant)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #51  <Class Participant>
	//    3    5:invokevirtual   #356 <Method ConditionGroup getPrimaryConditionClause(Participant)>
	//    4    8:areturn         
	}

	public final BaseProperty getProperty(String s)
	{
		byte byte0;
		s = QueryBuilder.quoteIfNeeded(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #416 <Method String QueryBuilder.quoteIfNeeded(String)>
	//    2    4:astore_1        
		byte0 = -1;
	//    3    5:iconst_m1       
	//    4    6:istore_2        
		s.hashCode();
	//    5    7:aload_1         
	//    6    8:invokevirtual   #421 <Method int String.hashCode()>
		JVM INSTR lookupswitch 25: default 220
	//	               -2006495159: 676
	//	               -1998757724: 436
	//	               -1688670390: 548
	//	               -1591474609: 644
	//	               -1451896843: 628
	//	               -1451734093: 361
	//	               -1444175931: 484
	//	               -1438299313: 516
	//	               -885699899: 406
	//	               -810884893: 596
	//	               -810884862: 612
	//	               -770633433: 692
	//	               -70578072: 468
	//	               2964037: 347
	//	               91649953: 500
	//	               92396991: 660
	//	               159641724: 376
	//	               311619039: 421
	//	               315686958: 724
	//	               855488520: 532
	//	               1249190327: 708
	//	               1668724158: 564
	//	               1805992609: 391
	//	               1924559766: 580
	//	               2095764796: 452;
	//    7   11:lookupswitch    25: default 220
	//	               -2006495159: 676
	//	               -1998757724: 436
	//	               -1688670390: 548
	//	               -1591474609: 644
	//	               -1451896843: 628
	//	               -1451734093: 361
	//	               -1444175931: 484
	//	               -1438299313: 516
	//	               -885699899: 406
	//	               -810884893: 596
	//	               -810884862: 612
	//	               -770633433: 692
	//	               -70578072: 468
	//	               2964037: 347
	//	               91649953: 500
	//	               92396991: 660
	//	               159641724: 376
	//	               311619039: 421
	//	               315686958: 724
	//	               855488520: 532
	//	               1249190327: 708
	//	               1668724158: 564
	//	               1805992609: 391
	//	               1924559766: 580
	//	               2095764796: 452
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L1:
		break; /* Loop/switch isn't completed */
_L20:
		break MISSING_BLOCK_LABEL_724;
_L27:
		switch(byte0)
	//*   8  220:iload_2         
		{
	//*   9  221:tableswitch     0 24: default 336
	//	               0 740
	//	               1 744
	//	               2 748
	//	               3 752
	//	               4 756
	//	               5 760
	//	               6 764
	//	               7 768
	//	               8 772
	//	               9 776
	//	               10 780
	//	               11 784
	//	               12 788
	//	               13 792
	//	               14 796
	//	               15 800
	//	               16 804
	//	               17 808
	//	               18 812
	//	               19 816
	//	               20 820
	//	               21 824
	//	               22 828
	//	               23 832
	//	               24 836
		default:
			throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
	//   10  336:new             #423 <Class IllegalArgumentException>
	//   11  339:dup             
	//   12  340:ldc2            #425 <String "Invalid column name passed. Ensure you are calling the correct table's column">
	//   13  343:invokespecial   #428 <Method void IllegalArgumentException(String)>
	//   14  346:athrow          

	//*  15  347:aload_1         
	//*  16  348:ldc1            #168 <String "`id`">
	//*  17  350:invokevirtual   #432 <Method boolean String.equals(Object)>
	//*  18  353:ifeq            220
	//*  19  356:iconst_0        
	//*  20  357:istore_2        
	//*  21  358:goto            220
	//*  22  361:aload_1         
	//*  23  362:ldc2            #276 <String "`code`">
	//*  24  365:invokevirtual   #432 <Method boolean String.equals(Object)>
	//*  25  368:ifeq            220
	//*  26  371:iconst_1        
	//*  27  372:istore_2        
	//*  28  373:goto            220
	//*  29  376:aload_1         
	//*  30  377:ldc2            #281 <String "`studyId`">
	//*  31  380:invokevirtual   #432 <Method boolean String.equals(Object)>
	//*  32  383:ifeq            220
	//*  33  386:iconst_2        
	//*  34  387:istore_2        
	//*  35  388:goto            220
	//*  36  391:aload_1         
	//*  37  392:ldc2            #283 <String "`inWatchStudy`">
	//*  38  395:invokevirtual   #432 <Method boolean String.equals(Object)>
	//*  39  398:ifeq            220
	//*  40  401:iconst_3        
	//*  41  402:istore_2        
	//*  42  403:goto            220
	//*  43  406:aload_1         
	//*  44  407:ldc2            #291 <String "`firstName`">
	//*  45  410:invokevirtual   #432 <Method boolean String.equals(Object)>
	//*  46  413:ifeq            220
	//*  47  416:iconst_4        
	//*  48  417:istore_2        
	//*  49  418:goto            220
	//*  50  421:aload_1         
	//*  51  422:ldc2            #293 <String "`lastName`">
	//*  52  425:invokevirtual   #432 <Method boolean String.equals(Object)>
	//*  53  428:ifeq            220
	//*  54  431:iconst_5        
	//*  55  432:istore_2        
	//*  56  433:goto            220
	//*  57  436:aload_1         
	//*  58  437:ldc2            #295 <String "`email`">
	//*  59  440:invokevirtual   #432 <Method boolean String.equals(Object)>
	//*  60  443:ifeq            220
	//*  61  446:bipush          6
	//*  62  448:istore_2        
	//*  63  449:goto            220
	//*  64  452:aload_1         
	//*  65  453:ldc2            #297 <String "`telephone`">
	//*  66  456:invokevirtual   #432 <Method boolean String.equals(Object)>
	//*  67  459:ifeq            220
	//*  68  462:bipush          7
	//*  69  464:istore_2        
	//*  70  465:goto            220
	//*  71  468:aload_1         
	//*  72  469:ldc2            #299 <String "`activeStatus`">
	//*  73  472:invokevirtual   #432 <Method boolean String.equals(Object)>
	//*  74  475:ifeq            220
	//*  75  478:bipush          8
	//*  76  480:istore_2        
	//*  77  481:goto            220
	//*  78  484:aload_1         
	//*  79  485:ldc2            #301 <String "`optOut`">
	//*  80  488:invokevirtual   #432 <Method boolean String.equals(Object)>
	//*  81  491:ifeq            220
	//*  82  494:bipush          9
	//*  83  496:istore_2        
	//*  84  497:goto            220
	//*  85  500:aload_1         
	//*  86  501:ldc2            #303 <String "`age`">
	//*  87  504:invokevirtual   #432 <Method boolean String.equals(Object)>
	//*  88  507:ifeq            220
	//*  89  510:bipush          10
	//*  90  512:istore_2        
	//*  91  513:goto            220
	//*  92  516:aload_1         
	//*  93  517:ldc2            #305 <String "`race`">
	//*  94  520:invokevirtual   #432 <Method boolean String.equals(Object)>
	//*  95  523:ifeq            220
	//*  96  526:bipush          11
	//*  97  528:istore_2        
	//*  98  529:goto            220
	//*  99  532:aload_1         
	//* 100  533:ldc2            #307 <String "`numDeliveries`">
	//* 101  536:invokevirtual   #432 <Method boolean String.equals(Object)>
	//* 102  539:ifeq            220
	//* 103  542:bipush          12
	//* 104  544:istore_2        
	//* 105  545:goto            220
	//* 106  548:aload_1         
	//* 107  549:ldc2            #309 <String "`signedPDF`">
	//* 108  552:invokevirtual   #432 <Method boolean String.equals(Object)>
	//* 109  555:ifeq            220
	//* 110  558:bipush          13
	//* 111  560:istore_2        
	//* 112  561:goto            220
	//* 113  564:aload_1         
	//* 114  565:ldc2            #311 <String "`registered`">
	//* 115  568:invokevirtual   #432 <Method boolean String.equals(Object)>
	//* 116  571:ifeq            220
	//* 117  574:bipush          14
	//* 118  576:istore_2        
	//* 119  577:goto            220
	//* 120  580:aload_1         
	//* 121  581:ldc2            #313 <String "`isUploaded`">
	//* 122  584:invokevirtual   #432 <Method boolean String.equals(Object)>
	//* 123  587:ifeq            220
	//* 124  590:bipush          15
	//* 125  592:istore_2        
	//* 126  593:goto            220
	//* 127  596:aload_1         
	//* 128  597:ldc2            #315 <String "`address1`">
	//* 129  600:invokevirtual   #432 <Method boolean String.equals(Object)>
	//* 130  603:ifeq            220
	//* 131  606:bipush          16
	//* 132  608:istore_2        
	//* 133  609:goto            220
	//* 134  612:aload_1         
	//* 135  613:ldc2            #317 <String "`address2`">
	//* 136  616:invokevirtual   #432 <Method boolean String.equals(Object)>
	//* 137  619:ifeq            220
	//* 138  622:bipush          17
	//* 139  624:istore_2        
	//* 140  625:goto            220
	//* 141  628:aload_1         
	//* 142  629:ldc2            #319 <String "`city`">
	//* 143  632:invokevirtual   #432 <Method boolean String.equals(Object)>
	//* 144  635:ifeq            220
	//* 145  638:bipush          18
	//* 146  640:istore_2        
	//* 147  641:goto            220
	//* 148  644:aload_1         
	//* 149  645:ldc2            #321 <String "`state`">
	//* 150  648:invokevirtual   #432 <Method boolean String.equals(Object)>
	//* 151  651:ifeq            220
	//* 152  654:bipush          19
	//* 153  656:istore_2        
	//* 154  657:goto            220
	//* 155  660:aload_1         
	//* 156  661:ldc2            #323 <String "`zip`">
	//* 157  664:invokevirtual   #432 <Method boolean String.equals(Object)>
	//* 158  667:ifeq            220
	//* 159  670:bipush          20
	//* 160  672:istore_2        
	//* 161  673:goto            220
	//* 162  676:aload_1         
	//* 163  677:ldc2            #325 <String "`signedDNAPDF`">
	//* 164  680:invokevirtual   #432 <Method boolean String.equals(Object)>
	//* 165  683:ifeq            220
	//* 166  686:bipush          21
	//* 167  688:istore_2        
	//* 168  689:goto            220
	//* 169  692:aload_1         
	//* 170  693:ldc2            #327 <String "`DNAregistered`">
	//* 171  696:invokevirtual   #432 <Method boolean String.equals(Object)>
	//* 172  699:ifeq            220
	//* 173  702:bipush          22
	//* 174  704:istore_2        
	//* 175  705:goto            220
	//* 176  708:aload_1         
	//* 177  709:ldc2            #329 <String "`base64Signature`">
	//* 178  712:invokevirtual   #432 <Method boolean String.equals(Object)>
	//* 179  715:ifeq            220
	//* 180  718:bipush          23
	//* 181  720:istore_2        
	//* 182  721:goto            220
	//* 183  724:aload_1         
	//* 184  725:ldc2            #331 <String "`dnaBase64Signature`">
	//* 185  728:invokevirtual   #432 <Method boolean String.equals(Object)>
	//* 186  731:ifeq            220
	//* 187  734:bipush          24
	//* 188  736:istore_2        
	//* 189  737:goto            220
		case 0: // '\0'
			return ((BaseProperty) (id));
	//  190  740:getstatic       #58  <Field LongProperty id>
	//  191  743:areturn         

		case 1: // '\001'
			return ((BaseProperty) (code));
	//  192  744:getstatic       #64  <Field Property code>
	//  193  747:areturn         

		case 2: // '\002'
			return ((BaseProperty) (studyId));
	//  194  748:getstatic       #67  <Field Property studyId>
	//  195  751:areturn         

		case 3: // '\003'
			return ((BaseProperty) (inWatchStudy));
	//  196  752:getstatic       #70  <Field Property inWatchStudy>
	//  197  755:areturn         

		case 4: // '\004'
			return ((BaseProperty) (firstName));
	//  198  756:getstatic       #73  <Field Property firstName>
	//  199  759:areturn         

		case 5: // '\005'
			return ((BaseProperty) (lastName));
	//  200  760:getstatic       #76  <Field Property lastName>
	//  201  763:areturn         

		case 6: // '\006'
			return ((BaseProperty) (email));
	//  202  764:getstatic       #79  <Field Property email>
	//  203  767:areturn         

		case 7: // '\007'
			return ((BaseProperty) (telephone));
	//  204  768:getstatic       #82  <Field Property telephone>
	//  205  771:areturn         

		case 8: // '\b'
			return ((BaseProperty) (activeStatus));
	//  206  772:getstatic       #85  <Field Property activeStatus>
	//  207  775:areturn         

		case 9: // '\t'
			return ((BaseProperty) (optOut));
	//  208  776:getstatic       #88  <Field Property optOut>
	//  209  779:areturn         

		case 10: // '\n'
			return ((BaseProperty) (age));
	//  210  780:getstatic       #91  <Field Property age>
	//  211  783:areturn         

		case 11: // '\013'
			return ((BaseProperty) (race));
	//  212  784:getstatic       #94  <Field Property race>
	//  213  787:areturn         

		case 12: // '\f'
			return ((BaseProperty) (numDeliveries));
	//  214  788:getstatic       #97  <Field Property numDeliveries>
	//  215  791:areturn         

		case 13: // '\r'
			return ((BaseProperty) (signedPDF));
	//  216  792:getstatic       #107 <Field TypeConvertedProperty signedPDF>
	//  217  795:areturn         

		case 14: // '\016'
			return ((BaseProperty) (registered));
	//  218  796:getstatic       #110 <Field Property registered>
	//  219  799:areturn         

		case 15: // '\017'
			return ((BaseProperty) (isUploaded));
	//  220  800:getstatic       #113 <Field Property isUploaded>
	//  221  803:areturn         

		case 16: // '\020'
			return ((BaseProperty) (address1));
	//  222  804:getstatic       #116 <Field Property address1>
	//  223  807:areturn         

		case 17: // '\021'
			return ((BaseProperty) (address2));
	//  224  808:getstatic       #119 <Field Property address2>
	//  225  811:areturn         

		case 18: // '\022'
			return ((BaseProperty) (city));
	//  226  812:getstatic       #122 <Field Property city>
	//  227  815:areturn         

		case 19: // '\023'
			return ((BaseProperty) (state));
	//  228  816:getstatic       #125 <Field Property state>
	//  229  819:areturn         

		case 20: // '\024'
			return ((BaseProperty) (zip));
	//  230  820:getstatic       #128 <Field Property zip>
	//  231  823:areturn         

		case 21: // '\025'
			return ((BaseProperty) (signedDNAPDF));
	//  232  824:getstatic       #132 <Field TypeConvertedProperty signedDNAPDF>
	//  233  827:areturn         

		case 22: // '\026'
			return ((BaseProperty) (DNAregistered));
	//  234  828:getstatic       #135 <Field Property DNAregistered>
	//  235  831:areturn         

		case 23: // '\027'
			return ((BaseProperty) (base64Signature));
	//  236  832:getstatic       #138 <Field Property base64Signature>
	//  237  835:areturn         

		case 24: // '\030'
			return ((BaseProperty) (dnaBase64Signature));
	//  238  836:getstatic       #141 <Field Property dnaBase64Signature>
	//  239  839:areturn         
		}
_L15:
		if(s.equals("`id`"))
			byte0 = 0;
		  goto _L27
_L7:
		if(s.equals("`code`"))
			byte0 = 1;
		  goto _L27
_L18:
		if(s.equals("`studyId`"))
			byte0 = 2;
		  goto _L27
_L24:
		if(s.equals("`inWatchStudy`"))
			byte0 = 3;
		  goto _L27
_L10:
		if(s.equals("`firstName`"))
			byte0 = 4;
		  goto _L27
_L19:
		if(s.equals("`lastName`"))
			byte0 = 5;
		  goto _L27
_L3:
		if(s.equals("`email`"))
			byte0 = 6;
		  goto _L27
_L26:
		if(s.equals("`telephone`"))
			byte0 = 7;
		  goto _L27
_L14:
		if(s.equals("`activeStatus`"))
			byte0 = 8;
		  goto _L27
_L8:
		if(s.equals("`optOut`"))
			byte0 = 9;
		  goto _L27
_L16:
		if(s.equals("`age`"))
			byte0 = 10;
		  goto _L27
_L9:
		if(s.equals("`race`"))
			byte0 = 11;
		  goto _L27
_L21:
		if(s.equals("`numDeliveries`"))
			byte0 = 12;
		  goto _L27
_L4:
		if(s.equals("`signedPDF`"))
			byte0 = 13;
		  goto _L27
_L23:
		if(s.equals("`registered`"))
			byte0 = 14;
		  goto _L27
_L25:
		if(s.equals("`isUploaded`"))
			byte0 = 15;
		  goto _L27
_L11:
		if(s.equals("`address1`"))
			byte0 = 16;
		  goto _L27
_L12:
		if(s.equals("`address2`"))
			byte0 = 17;
		  goto _L27
_L6:
		if(s.equals("`city`"))
			byte0 = 18;
		  goto _L27
_L5:
		if(s.equals("`state`"))
			byte0 = 19;
		  goto _L27
_L17:
		if(s.equals("`zip`"))
			byte0 = 20;
		  goto _L27
_L2:
		if(s.equals("`signedDNAPDF`"))
			byte0 = 21;
		  goto _L27
_L13:
		if(s.equals("`DNAregistered`"))
			byte0 = 22;
		  goto _L27
_L22:
		if(s.equals("`base64Signature`"))
			byte0 = 23;
		  goto _L27
		if(s.equals("`dnaBase64Signature`"))
			byte0 = 24;
		  goto _L27
	}

	public final String getTableName()
	{
		return "`Participant`";
	//    0    0:ldc2            #435 <String "`Participant`">
	//    1    3:areturn         
	}

	public final void loadFromCursor(Cursor cursor, Participant participant)
	{
		int i = cursor.getColumnIndex("id");
	//    0    0:aload_1         
	//    1    1:ldc1            #52  <String "id">
	//    2    3:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//    3    8:istore_3        
		boolean flag;
		if(i != -1 && !cursor.isNull(i))
	//*   4    9:iload_3         
	//*   5   10:iconst_m1       
	//*   6   11:icmpeq          956
	//*   7   14:aload_1         
	//*   8   15:iload_3         
	//*   9   16:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//*  10   21:ifne            956
			participant.id = cursor.getLong(i);
	//   11   24:aload_2         
	//   12   25:aload_1         
	//   13   26:iload_3         
	//   14   27:invokeinterface #451 <Method long Cursor.getLong(int)>
	//   15   32:putfield        #171 <Field long Participant.id>
		else
	//*  16   35:aload_1         
	//*  17   36:ldc1            #61  <String "code">
	//*  18   38:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//*  19   43:istore_3        
	//*  20   44:iload_3         
	//*  21   45:iconst_m1       
	//*  22   46:icmpeq          964
	//*  23   49:aload_1         
	//*  24   50:iload_3         
	//*  25   51:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//*  26   56:ifne            964
	//*  27   59:aload_2         
	//*  28   60:aload_1         
	//*  29   61:iload_3         
	//*  30   62:invokeinterface #455 <Method String Cursor.getString(int)>
	//*  31   67:putfield        #194 <Field String Participant.code>
	//*  32   70:aload_1         
	//*  33   71:ldc1            #65  <String "studyId">
	//*  34   73:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//*  35   78:istore_3        
	//*  36   79:iload_3         
	//*  37   80:iconst_m1       
	//*  38   81:icmpeq          972
	//*  39   84:aload_1         
	//*  40   85:iload_3         
	//*  41   86:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//*  42   91:ifne            972
	//*  43   94:aload_2         
	//*  44   95:aload_1         
	//*  45   96:iload_3         
	//*  46   97:invokeinterface #455 <Method String Cursor.getString(int)>
	//*  47  102:putfield        #202 <Field String Participant.studyId>
	//*  48  105:aload_1         
	//*  49  106:ldc1            #68  <String "inWatchStudy">
	//*  50  108:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//*  51  113:istore_3        
	//*  52  114:iload_3         
	//*  53  115:iconst_m1       
	//*  54  116:icmpeq          986
	//*  55  119:aload_1         
	//*  56  120:iload_3         
	//*  57  121:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//*  58  126:ifne            986
	//*  59  129:aload_1         
	//*  60  130:iload_3         
	//*  61  131:invokeinterface #459 <Method int Cursor.getInt(int)>
	//*  62  136:iconst_1        
	//*  63  137:icmpne          980
	//*  64  140:iconst_1        
	//*  65  141:istore          4
	//*  66  143:aload_2         
	//*  67  144:iload           4
	//*  68  146:putfield        #205 <Field boolean Participant.inWatchStudy>
	//*  69  149:aload_1         
	//*  70  150:ldc1            #71  <String "firstName">
	//*  71  152:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//*  72  157:istore_3        
	//*  73  158:iload_3         
	//*  74  159:iconst_m1       
	//*  75  160:icmpeq          994
	//*  76  163:aload_1         
	//*  77  164:iload_3         
	//*  78  165:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//*  79  170:ifne            994
	//*  80  173:aload_2         
	//*  81  174:aload_1         
	//*  82  175:iload_3         
	//*  83  176:invokeinterface #455 <Method String Cursor.getString(int)>
	//*  84  181:putfield        #211 <Field String Participant.firstName>
	//*  85  184:aload_1         
	//*  86  185:ldc1            #74  <String "lastName">
	//*  87  187:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//*  88  192:istore_3        
	//*  89  193:iload_3         
	//*  90  194:iconst_m1       
	//*  91  195:icmpeq          1002
	//*  92  198:aload_1         
	//*  93  199:iload_3         
	//*  94  200:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//*  95  205:ifne            1002
	//*  96  208:aload_2         
	//*  97  209:aload_1         
	//*  98  210:iload_3         
	//*  99  211:invokeinterface #455 <Method String Cursor.getString(int)>
	//* 100  216:putfield        #213 <Field String Participant.lastName>
	//* 101  219:aload_1         
	//* 102  220:ldc1            #77  <String "email">
	//* 103  222:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 104  227:istore_3        
	//* 105  228:iload_3         
	//* 106  229:iconst_m1       
	//* 107  230:icmpeq          1010
	//* 108  233:aload_1         
	//* 109  234:iload_3         
	//* 110  235:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 111  240:ifne            1010
	//* 112  243:aload_2         
	//* 113  244:aload_1         
	//* 114  245:iload_3         
	//* 115  246:invokeinterface #455 <Method String Cursor.getString(int)>
	//* 116  251:putfield        #215 <Field String Participant.email>
	//* 117  254:aload_1         
	//* 118  255:ldc1            #80  <String "telephone">
	//* 119  257:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 120  262:istore_3        
	//* 121  263:iload_3         
	//* 122  264:iconst_m1       
	//* 123  265:icmpeq          1018
	//* 124  268:aload_1         
	//* 125  269:iload_3         
	//* 126  270:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 127  275:ifne            1018
	//* 128  278:aload_2         
	//* 129  279:aload_1         
	//* 130  280:iload_3         
	//* 131  281:invokeinterface #455 <Method String Cursor.getString(int)>
	//* 132  286:putfield        #217 <Field String Participant.telephone>
	//* 133  289:aload_1         
	//* 134  290:ldc1            #83  <String "activeStatus">
	//* 135  292:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 136  297:istore_3        
	//* 137  298:iload_3         
	//* 138  299:iconst_m1       
	//* 139  300:icmpeq          1032
	//* 140  303:aload_1         
	//* 141  304:iload_3         
	//* 142  305:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 143  310:ifne            1032
	//* 144  313:aload_1         
	//* 145  314:iload_3         
	//* 146  315:invokeinterface #459 <Method int Cursor.getInt(int)>
	//* 147  320:iconst_1        
	//* 148  321:icmpne          1026
	//* 149  324:iconst_1        
	//* 150  325:istore          4
	//* 151  327:aload_2         
	//* 152  328:iload           4
	//* 153  330:putfield        #219 <Field boolean Participant.activeStatus>
	//* 154  333:aload_1         
	//* 155  334:ldc1            #86  <String "optOut">
	//* 156  336:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 157  341:istore_3        
	//* 158  342:iload_3         
	//* 159  343:iconst_m1       
	//* 160  344:icmpeq          1046
	//* 161  347:aload_1         
	//* 162  348:iload_3         
	//* 163  349:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 164  354:ifne            1046
	//* 165  357:aload_1         
	//* 166  358:iload_3         
	//* 167  359:invokeinterface #459 <Method int Cursor.getInt(int)>
	//* 168  364:iconst_1        
	//* 169  365:icmpne          1040
	//* 170  368:iconst_1        
	//* 171  369:istore          4
	//* 172  371:aload_2         
	//* 173  372:iload           4
	//* 174  374:putfield        #221 <Field boolean Participant.optOut>
	//* 175  377:aload_1         
	//* 176  378:ldc1            #89  <String "age">
	//* 177  380:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 178  385:istore_3        
	//* 179  386:iload_3         
	//* 180  387:iconst_m1       
	//* 181  388:icmpeq          1054
	//* 182  391:aload_1         
	//* 183  392:iload_3         
	//* 184  393:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 185  398:ifne            1054
	//* 186  401:aload_2         
	//* 187  402:aload_1         
	//* 188  403:iload_3         
	//* 189  404:invokeinterface #459 <Method int Cursor.getInt(int)>
	//* 190  409:invokestatic    #286 <Method Integer Integer.valueOf(int)>
	//* 191  412:putfield        #224 <Field Integer Participant.age>
	//* 192  415:aload_1         
	//* 193  416:ldc1            #92  <String "race">
	//* 194  418:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 195  423:istore_3        
	//* 196  424:iload_3         
	//* 197  425:iconst_m1       
	//* 198  426:icmpeq          1062
	//* 199  429:aload_1         
	//* 200  430:iload_3         
	//* 201  431:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 202  436:ifne            1062
	//* 203  439:aload_2         
	//* 204  440:aload_1         
	//* 205  441:iload_3         
	//* 206  442:invokeinterface #455 <Method String Cursor.getString(int)>
	//* 207  447:putfield        #232 <Field String Participant.race>
	//* 208  450:aload_1         
	//* 209  451:ldc1            #95  <String "numDeliveries">
	//* 210  453:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 211  458:istore_3        
	//* 212  459:iload_3         
	//* 213  460:iconst_m1       
	//* 214  461:icmpeq          1070
	//* 215  464:aload_1         
	//* 216  465:iload_3         
	//* 217  466:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 218  471:ifne            1070
	//* 219  474:aload_2         
	//* 220  475:aload_1         
	//* 221  476:iload_3         
	//* 222  477:invokeinterface #459 <Method int Cursor.getInt(int)>
	//* 223  482:invokestatic    #286 <Method Integer Integer.valueOf(int)>
	//* 224  485:putfield        #234 <Field Integer Participant.numDeliveries>
	//* 225  488:aload_1         
	//* 226  489:ldc1            #100 <String "signedPDF">
	//* 227  491:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 228  496:istore_3        
	//* 229  497:iload_3         
	//* 230  498:iconst_m1       
	//* 231  499:icmpeq          1078
	//* 232  502:aload_1         
	//* 233  503:iload_3         
	//* 234  504:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 235  509:ifne            1078
	//* 236  512:aload_2         
	//* 237  513:aload_0         
	//* 238  514:getfield        #162 <Field DateConverter global_typeConverterDateConverter>
	//* 239  517:aload_1         
	//* 240  518:iload_3         
	//* 241  519:invokeinterface #451 <Method long Cursor.getLong(int)>
	//* 242  524:invokestatic    #177 <Method Long Long.valueOf(long)>
	//* 243  527:invokevirtual   #463 <Method Date DateConverter.getModelValue(Long)>
	//* 244  530:putfield        #237 <Field Date Participant.signedPDF>
	//* 245  533:aload_1         
	//* 246  534:ldc1            #108 <String "registered">
	//* 247  536:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 248  541:istore_3        
	//* 249  542:iload_3         
	//* 250  543:iconst_m1       
	//* 251  544:icmpeq          1099
	//* 252  547:aload_1         
	//* 253  548:iload_3         
	//* 254  549:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 255  554:ifne            1099
	//* 256  557:aload_1         
	//* 257  558:iload_3         
	//* 258  559:invokeinterface #459 <Method int Cursor.getInt(int)>
	//* 259  564:iconst_1        
	//* 260  565:icmpne          1093
	//* 261  568:iconst_1        
	//* 262  569:istore          4
	//* 263  571:aload_2         
	//* 264  572:iload           4
	//* 265  574:putfield        #247 <Field boolean Participant.registered>
	//* 266  577:aload_1         
	//* 267  578:ldc1            #111 <String "isUploaded">
	//* 268  580:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 269  585:istore_3        
	//* 270  586:iload_3         
	//* 271  587:iconst_m1       
	//* 272  588:icmpeq          1113
	//* 273  591:aload_1         
	//* 274  592:iload_3         
	//* 275  593:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 276  598:ifne            1113
	//* 277  601:aload_1         
	//* 278  602:iload_3         
	//* 279  603:invokeinterface #459 <Method int Cursor.getInt(int)>
	//* 280  608:iconst_1        
	//* 281  609:icmpne          1107
	//* 282  612:iconst_1        
	//* 283  613:istore          4
	//* 284  615:aload_2         
	//* 285  616:iload           4
	//* 286  618:putfield        #249 <Field boolean Participant.isUploaded>
	//* 287  621:aload_1         
	//* 288  622:ldc1            #114 <String "address1">
	//* 289  624:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 290  629:istore_3        
	//* 291  630:iload_3         
	//* 292  631:iconst_m1       
	//* 293  632:icmpeq          1121
	//* 294  635:aload_1         
	//* 295  636:iload_3         
	//* 296  637:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 297  642:ifne            1121
	//* 298  645:aload_2         
	//* 299  646:aload_1         
	//* 300  647:iload_3         
	//* 301  648:invokeinterface #455 <Method String Cursor.getString(int)>
	//* 302  653:putfield        #251 <Field String Participant.address1>
	//* 303  656:aload_1         
	//* 304  657:ldc1            #117 <String "address2">
	//* 305  659:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 306  664:istore_3        
	//* 307  665:iload_3         
	//* 308  666:iconst_m1       
	//* 309  667:icmpeq          1129
	//* 310  670:aload_1         
	//* 311  671:iload_3         
	//* 312  672:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 313  677:ifne            1129
	//* 314  680:aload_2         
	//* 315  681:aload_1         
	//* 316  682:iload_3         
	//* 317  683:invokeinterface #455 <Method String Cursor.getString(int)>
	//* 318  688:putfield        #253 <Field String Participant.address2>
	//* 319  691:aload_1         
	//* 320  692:ldc1            #120 <String "city">
	//* 321  694:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 322  699:istore_3        
	//* 323  700:iload_3         
	//* 324  701:iconst_m1       
	//* 325  702:icmpeq          1137
	//* 326  705:aload_1         
	//* 327  706:iload_3         
	//* 328  707:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 329  712:ifne            1137
	//* 330  715:aload_2         
	//* 331  716:aload_1         
	//* 332  717:iload_3         
	//* 333  718:invokeinterface #455 <Method String Cursor.getString(int)>
	//* 334  723:putfield        #255 <Field String Participant.city>
	//* 335  726:aload_1         
	//* 336  727:ldc1            #123 <String "state">
	//* 337  729:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 338  734:istore_3        
	//* 339  735:iload_3         
	//* 340  736:iconst_m1       
	//* 341  737:icmpeq          1145
	//* 342  740:aload_1         
	//* 343  741:iload_3         
	//* 344  742:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 345  747:ifne            1145
	//* 346  750:aload_2         
	//* 347  751:aload_1         
	//* 348  752:iload_3         
	//* 349  753:invokeinterface #455 <Method String Cursor.getString(int)>
	//* 350  758:putfield        #257 <Field String Participant.state>
	//* 351  761:aload_1         
	//* 352  762:ldc1            #126 <String "zip">
	//* 353  764:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 354  769:istore_3        
	//* 355  770:iload_3         
	//* 356  771:iconst_m1       
	//* 357  772:icmpeq          1153
	//* 358  775:aload_1         
	//* 359  776:iload_3         
	//* 360  777:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 361  782:ifne            1153
	//* 362  785:aload_2         
	//* 363  786:aload_1         
	//* 364  787:iload_3         
	//* 365  788:invokeinterface #455 <Method String Cursor.getString(int)>
	//* 366  793:putfield        #259 <Field String Participant.zip>
	//* 367  796:aload_1         
	//* 368  797:ldc1            #129 <String "signedDNAPDF">
	//* 369  799:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 370  804:istore_3        
	//* 371  805:iload_3         
	//* 372  806:iconst_m1       
	//* 373  807:icmpeq          1161
	//* 374  810:aload_1         
	//* 375  811:iload_3         
	//* 376  812:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 377  817:ifne            1161
	//* 378  820:aload_2         
	//* 379  821:aload_0         
	//* 380  822:getfield        #162 <Field DateConverter global_typeConverterDateConverter>
	//* 381  825:aload_1         
	//* 382  826:iload_3         
	//* 383  827:invokeinterface #451 <Method long Cursor.getLong(int)>
	//* 384  832:invokestatic    #177 <Method Long Long.valueOf(long)>
	//* 385  835:invokevirtual   #463 <Method Date DateConverter.getModelValue(Long)>
	//* 386  838:putfield        #261 <Field Date Participant.signedDNAPDF>
	//* 387  841:aload_1         
	//* 388  842:ldc1            #133 <String "DNAregistered">
	//* 389  844:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 390  849:istore_3        
	//* 391  850:iload_3         
	//* 392  851:iconst_m1       
	//* 393  852:icmpeq          1182
	//* 394  855:aload_1         
	//* 395  856:iload_3         
	//* 396  857:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 397  862:ifne            1182
	//* 398  865:aload_1         
	//* 399  866:iload_3         
	//* 400  867:invokeinterface #459 <Method int Cursor.getInt(int)>
	//* 401  872:iconst_1        
	//* 402  873:icmpne          1176
	//* 403  876:iconst_1        
	//* 404  877:istore          4
	//* 405  879:aload_2         
	//* 406  880:iload           4
	//* 407  882:putfield        #263 <Field boolean Participant.DNAregistered>
	//* 408  885:aload_1         
	//* 409  886:ldc1            #136 <String "base64Signature">
	//* 410  888:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 411  893:istore_3        
	//* 412  894:iload_3         
	//* 413  895:iconst_m1       
	//* 414  896:icmpeq          1190
	//* 415  899:aload_1         
	//* 416  900:iload_3         
	//* 417  901:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 418  906:ifne            1190
	//* 419  909:aload_2         
	//* 420  910:aload_1         
	//* 421  911:iload_3         
	//* 422  912:invokeinterface #455 <Method String Cursor.getString(int)>
	//* 423  917:putfield        #265 <Field String Participant.base64Signature>
	//* 424  920:aload_1         
	//* 425  921:ldc1            #139 <String "dnaBase64Signature">
	//* 426  923:invokeinterface #443 <Method int Cursor.getColumnIndex(String)>
	//* 427  928:istore_3        
	//* 428  929:iload_3         
	//* 429  930:iconst_m1       
	//* 430  931:icmpeq          1198
	//* 431  934:aload_1         
	//* 432  935:iload_3         
	//* 433  936:invokeinterface #447 <Method boolean Cursor.isNull(int)>
	//* 434  941:ifne            1198
	//* 435  944:aload_2         
	//* 436  945:aload_1         
	//* 437  946:iload_3         
	//* 438  947:invokeinterface #455 <Method String Cursor.getString(int)>
	//* 439  952:putfield        #267 <Field String Participant.dnaBase64Signature>
	//* 440  955:return          
			participant.id = 0L;
	//  441  956:aload_2         
	//  442  957:lconst_0        
	//  443  958:putfield        #171 <Field long Participant.id>
		i = cursor.getColumnIndex("code");
		if(i != -1 && !cursor.isNull(i))
			participant.code = cursor.getString(i);
		else
	//* 444  961:goto            35
			participant.code = null;
	//  445  964:aload_2         
	//  446  965:aconst_null     
	//  447  966:putfield        #194 <Field String Participant.code>
		i = cursor.getColumnIndex("studyId");
		if(i != -1 && !cursor.isNull(i))
			participant.studyId = cursor.getString(i);
		else
	//* 448  969:goto            70
			participant.studyId = null;
	//  449  972:aload_2         
	//  450  973:aconst_null     
	//  451  974:putfield        #202 <Field String Participant.studyId>
		i = cursor.getColumnIndex("inWatchStudy");
		if(i != -1 && !cursor.isNull(i))
		{
			if(cursor.getInt(i) == 1)
				flag = true;
			else
	//* 452  977:goto            105
				flag = false;
	//  453  980:iconst_0        
	//  454  981:istore          4
			participant.inWatchStudy = flag;
		} else
	//* 455  983:goto            143
		{
			participant.inWatchStudy = false;
	//  456  986:aload_2         
	//  457  987:iconst_0        
	//  458  988:putfield        #205 <Field boolean Participant.inWatchStudy>
		}
		i = cursor.getColumnIndex("firstName");
		if(i != -1 && !cursor.isNull(i))
			participant.firstName = cursor.getString(i);
		else
	//* 459  991:goto            149
			participant.firstName = null;
	//  460  994:aload_2         
	//  461  995:aconst_null     
	//  462  996:putfield        #211 <Field String Participant.firstName>
		i = cursor.getColumnIndex("lastName");
		if(i != -1 && !cursor.isNull(i))
			participant.lastName = cursor.getString(i);
		else
	//* 463  999:goto            184
			participant.lastName = null;
	//  464 1002:aload_2         
	//  465 1003:aconst_null     
	//  466 1004:putfield        #213 <Field String Participant.lastName>
		i = cursor.getColumnIndex("email");
		if(i != -1 && !cursor.isNull(i))
			participant.email = cursor.getString(i);
		else
	//* 467 1007:goto            219
			participant.email = null;
	//  468 1010:aload_2         
	//  469 1011:aconst_null     
	//  470 1012:putfield        #215 <Field String Participant.email>
		i = cursor.getColumnIndex("telephone");
		if(i != -1 && !cursor.isNull(i))
			participant.telephone = cursor.getString(i);
		else
	//* 471 1015:goto            254
			participant.telephone = null;
	//  472 1018:aload_2         
	//  473 1019:aconst_null     
	//  474 1020:putfield        #217 <Field String Participant.telephone>
		i = cursor.getColumnIndex("activeStatus");
		if(i != -1 && !cursor.isNull(i))
		{
			if(cursor.getInt(i) == 1)
				flag = true;
			else
	//* 475 1023:goto            289
				flag = false;
	//  476 1026:iconst_0        
	//  477 1027:istore          4
			participant.activeStatus = flag;
		} else
	//* 478 1029:goto            327
		{
			participant.activeStatus = false;
	//  479 1032:aload_2         
	//  480 1033:iconst_0        
	//  481 1034:putfield        #219 <Field boolean Participant.activeStatus>
		}
		i = cursor.getColumnIndex("optOut");
		if(i != -1 && !cursor.isNull(i))
		{
			if(cursor.getInt(i) == 1)
				flag = true;
			else
	//* 482 1037:goto            333
				flag = false;
	//  483 1040:iconst_0        
	//  484 1041:istore          4
			participant.optOut = flag;
		} else
	//* 485 1043:goto            371
		{
			participant.optOut = false;
	//  486 1046:aload_2         
	//  487 1047:iconst_0        
	//  488 1048:putfield        #221 <Field boolean Participant.optOut>
		}
		i = cursor.getColumnIndex("age");
		if(i != -1 && !cursor.isNull(i))
			participant.age = Integer.valueOf(cursor.getInt(i));
		else
	//* 489 1051:goto            377
			participant.age = null;
	//  490 1054:aload_2         
	//  491 1055:aconst_null     
	//  492 1056:putfield        #224 <Field Integer Participant.age>
		i = cursor.getColumnIndex("race");
		if(i != -1 && !cursor.isNull(i))
			participant.race = cursor.getString(i);
		else
	//* 493 1059:goto            415
			participant.race = null;
	//  494 1062:aload_2         
	//  495 1063:aconst_null     
	//  496 1064:putfield        #232 <Field String Participant.race>
		i = cursor.getColumnIndex("numDeliveries");
		if(i != -1 && !cursor.isNull(i))
			participant.numDeliveries = Integer.valueOf(cursor.getInt(i));
		else
	//* 497 1067:goto            450
			participant.numDeliveries = null;
	//  498 1070:aload_2         
	//  499 1071:aconst_null     
	//  500 1072:putfield        #234 <Field Integer Participant.numDeliveries>
		i = cursor.getColumnIndex("signedPDF");
		if(i != -1 && !cursor.isNull(i))
			participant.signedPDF = global_typeConverterDateConverter.getModelValue(Long.valueOf(cursor.getLong(i)));
		else
	//* 501 1075:goto            488
			participant.signedPDF = global_typeConverterDateConverter.getModelValue(((Long) (null)));
	//  502 1078:aload_2         
	//  503 1079:aload_0         
	//  504 1080:getfield        #162 <Field DateConverter global_typeConverterDateConverter>
	//  505 1083:aconst_null     
	//  506 1084:invokevirtual   #463 <Method Date DateConverter.getModelValue(Long)>
	//  507 1087:putfield        #237 <Field Date Participant.signedPDF>
		i = cursor.getColumnIndex("registered");
		if(i != -1 && !cursor.isNull(i))
		{
			if(cursor.getInt(i) == 1)
				flag = true;
			else
	//* 508 1090:goto            533
				flag = false;
	//  509 1093:iconst_0        
	//  510 1094:istore          4
			participant.registered = flag;
		} else
	//* 511 1096:goto            571
		{
			participant.registered = false;
	//  512 1099:aload_2         
	//  513 1100:iconst_0        
	//  514 1101:putfield        #247 <Field boolean Participant.registered>
		}
		i = cursor.getColumnIndex("isUploaded");
		if(i != -1 && !cursor.isNull(i))
		{
			if(cursor.getInt(i) == 1)
				flag = true;
			else
	//* 515 1104:goto            577
				flag = false;
	//  516 1107:iconst_0        
	//  517 1108:istore          4
			participant.isUploaded = flag;
		} else
	//* 518 1110:goto            615
		{
			participant.isUploaded = false;
	//  519 1113:aload_2         
	//  520 1114:iconst_0        
	//  521 1115:putfield        #249 <Field boolean Participant.isUploaded>
		}
		i = cursor.getColumnIndex("address1");
		if(i != -1 && !cursor.isNull(i))
			participant.address1 = cursor.getString(i);
		else
	//* 522 1118:goto            621
			participant.address1 = null;
	//  523 1121:aload_2         
	//  524 1122:aconst_null     
	//  525 1123:putfield        #251 <Field String Participant.address1>
		i = cursor.getColumnIndex("address2");
		if(i != -1 && !cursor.isNull(i))
			participant.address2 = cursor.getString(i);
		else
	//* 526 1126:goto            656
			participant.address2 = null;
	//  527 1129:aload_2         
	//  528 1130:aconst_null     
	//  529 1131:putfield        #253 <Field String Participant.address2>
		i = cursor.getColumnIndex("city");
		if(i != -1 && !cursor.isNull(i))
			participant.city = cursor.getString(i);
		else
	//* 530 1134:goto            691
			participant.city = null;
	//  531 1137:aload_2         
	//  532 1138:aconst_null     
	//  533 1139:putfield        #255 <Field String Participant.city>
		i = cursor.getColumnIndex("state");
		if(i != -1 && !cursor.isNull(i))
			participant.state = cursor.getString(i);
		else
	//* 534 1142:goto            726
			participant.state = null;
	//  535 1145:aload_2         
	//  536 1146:aconst_null     
	//  537 1147:putfield        #257 <Field String Participant.state>
		i = cursor.getColumnIndex("zip");
		if(i != -1 && !cursor.isNull(i))
			participant.zip = cursor.getString(i);
		else
	//* 538 1150:goto            761
			participant.zip = null;
	//  539 1153:aload_2         
	//  540 1154:aconst_null     
	//  541 1155:putfield        #259 <Field String Participant.zip>
		i = cursor.getColumnIndex("signedDNAPDF");
		if(i != -1 && !cursor.isNull(i))
			participant.signedDNAPDF = global_typeConverterDateConverter.getModelValue(Long.valueOf(cursor.getLong(i)));
		else
	//* 542 1158:goto            796
			participant.signedDNAPDF = global_typeConverterDateConverter.getModelValue(((Long) (null)));
	//  543 1161:aload_2         
	//  544 1162:aload_0         
	//  545 1163:getfield        #162 <Field DateConverter global_typeConverterDateConverter>
	//  546 1166:aconst_null     
	//  547 1167:invokevirtual   #463 <Method Date DateConverter.getModelValue(Long)>
	//  548 1170:putfield        #261 <Field Date Participant.signedDNAPDF>
		i = cursor.getColumnIndex("DNAregistered");
		if(i != -1 && !cursor.isNull(i))
		{
			if(cursor.getInt(i) == 1)
				flag = true;
			else
	//* 549 1173:goto            841
				flag = false;
	//  550 1176:iconst_0        
	//  551 1177:istore          4
			participant.DNAregistered = flag;
		} else
	//* 552 1179:goto            879
		{
			participant.DNAregistered = false;
	//  553 1182:aload_2         
	//  554 1183:iconst_0        
	//  555 1184:putfield        #263 <Field boolean Participant.DNAregistered>
		}
		i = cursor.getColumnIndex("base64Signature");
		if(i != -1 && !cursor.isNull(i))
			participant.base64Signature = cursor.getString(i);
		else
	//* 556 1187:goto            885
			participant.base64Signature = null;
	//  557 1190:aload_2         
	//  558 1191:aconst_null     
	//  559 1192:putfield        #265 <Field String Participant.base64Signature>
		i = cursor.getColumnIndex("dnaBase64Signature");
		if(i != -1 && !cursor.isNull(i))
		{
			participant.dnaBase64Signature = cursor.getString(i);
			return;
		} else
	//* 560 1195:goto            920
		{
			participant.dnaBase64Signature = null;
	//  561 1198:aload_2         
	//  562 1199:aconst_null     
	//  563 1200:putfield        #267 <Field String Participant.dnaBase64Signature>
			return;
	//  564 1203:return          
		}
	}

	public volatile void loadFromCursor(Cursor cursor, Object obj)
	{
		loadFromCursor(cursor, (Participant)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #51  <Class Participant>
	//    4    6:invokevirtual   #466 <Method void loadFromCursor(Cursor, Participant)>
	//    5    9:return          
	}

	public final Participant newInstance()
	{
		return new Participant();
	//    0    0:new             #51  <Class Participant>
	//    1    3:dup             
	//    2    4:invokespecial   #469 <Method void Participant()>
	//    3    7:areturn         
	}

	public volatile Object newInstance()
	{
		return ((Object) (newInstance()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #472 <Method Participant newInstance()>
	//    2    4:areturn         
	}

	public final void updateAutoIncrement(Participant participant, Number number)
	{
		participant.id = number.longValue();
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #477 <Method long Number.longValue()>
	//    3    5:putfield        #171 <Field long Participant.id>
	//    4    8:return          
	}

	public volatile void updateAutoIncrement(Object obj, Number number)
	{
		updateAutoIncrement((Participant)obj, number);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #51  <Class Participant>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #480 <Method void updateAutoIncrement(Participant, Number)>
	//    5    9:return          
	}

	public static final IProperty ALL_COLUMN_PROPERTIES[];
	public static final Property DNAregistered;
	public static final Property activeStatus;
	public static final Property address1;
	public static final Property address2;
	public static final Property age;
	public static final Property base64Signature;
	public static final Property city;
	public static final Property code;
	public static final Property dnaBase64Signature;
	public static final Property email;
	public static final Property firstName;
	public static final LongProperty id;
	public static final Property inWatchStudy;
	public static final Property isUploaded;
	public static final Property lastName;
	public static final Property numDeliveries;
	public static final Property optOut;
	public static final Property race;
	public static final Property registered;
	public static final TypeConvertedProperty signedDNAPDF;
	public static final TypeConvertedProperty signedPDF;
	public static final Property state;
	public static final Property studyId;
	public static final Property telephone;
	public static final Property zip;
	private final DateConverter global_typeConverterDateConverter;

	static 
	{
		id = new LongProperty(com/pactforcure/app/participant/Participant, "id");
	//    0    0:new             #49  <Class LongProperty>
	//    1    3:dup             
	//    2    4:ldc1            #51  <Class Participant>
	//    3    6:ldc1            #52  <String "id">
	//    4    8:invokespecial   #56  <Method void LongProperty(Class, String)>
	//    5   11:putstatic       #58  <Field LongProperty id>
		code = new Property(com/pactforcure/app/participant/Participant, "code");
	//    6   14:new             #60  <Class Property>
	//    7   17:dup             
	//    8   18:ldc1            #51  <Class Participant>
	//    9   20:ldc1            #61  <String "code">
	//   10   22:invokespecial   #62  <Method void Property(Class, String)>
	//   11   25:putstatic       #64  <Field Property code>
		studyId = new Property(com/pactforcure/app/participant/Participant, "studyId");
	//   12   28:new             #60  <Class Property>
	//   13   31:dup             
	//   14   32:ldc1            #51  <Class Participant>
	//   15   34:ldc1            #65  <String "studyId">
	//   16   36:invokespecial   #62  <Method void Property(Class, String)>
	//   17   39:putstatic       #67  <Field Property studyId>
		inWatchStudy = new Property(com/pactforcure/app/participant/Participant, "inWatchStudy");
	//   18   42:new             #60  <Class Property>
	//   19   45:dup             
	//   20   46:ldc1            #51  <Class Participant>
	//   21   48:ldc1            #68  <String "inWatchStudy">
	//   22   50:invokespecial   #62  <Method void Property(Class, String)>
	//   23   53:putstatic       #70  <Field Property inWatchStudy>
		firstName = new Property(com/pactforcure/app/participant/Participant, "firstName");
	//   24   56:new             #60  <Class Property>
	//   25   59:dup             
	//   26   60:ldc1            #51  <Class Participant>
	//   27   62:ldc1            #71  <String "firstName">
	//   28   64:invokespecial   #62  <Method void Property(Class, String)>
	//   29   67:putstatic       #73  <Field Property firstName>
		lastName = new Property(com/pactforcure/app/participant/Participant, "lastName");
	//   30   70:new             #60  <Class Property>
	//   31   73:dup             
	//   32   74:ldc1            #51  <Class Participant>
	//   33   76:ldc1            #74  <String "lastName">
	//   34   78:invokespecial   #62  <Method void Property(Class, String)>
	//   35   81:putstatic       #76  <Field Property lastName>
		email = new Property(com/pactforcure/app/participant/Participant, "email");
	//   36   84:new             #60  <Class Property>
	//   37   87:dup             
	//   38   88:ldc1            #51  <Class Participant>
	//   39   90:ldc1            #77  <String "email">
	//   40   92:invokespecial   #62  <Method void Property(Class, String)>
	//   41   95:putstatic       #79  <Field Property email>
		telephone = new Property(com/pactforcure/app/participant/Participant, "telephone");
	//   42   98:new             #60  <Class Property>
	//   43  101:dup             
	//   44  102:ldc1            #51  <Class Participant>
	//   45  104:ldc1            #80  <String "telephone">
	//   46  106:invokespecial   #62  <Method void Property(Class, String)>
	//   47  109:putstatic       #82  <Field Property telephone>
		activeStatus = new Property(com/pactforcure/app/participant/Participant, "activeStatus");
	//   48  112:new             #60  <Class Property>
	//   49  115:dup             
	//   50  116:ldc1            #51  <Class Participant>
	//   51  118:ldc1            #83  <String "activeStatus">
	//   52  120:invokespecial   #62  <Method void Property(Class, String)>
	//   53  123:putstatic       #85  <Field Property activeStatus>
		optOut = new Property(com/pactforcure/app/participant/Participant, "optOut");
	//   54  126:new             #60  <Class Property>
	//   55  129:dup             
	//   56  130:ldc1            #51  <Class Participant>
	//   57  132:ldc1            #86  <String "optOut">
	//   58  134:invokespecial   #62  <Method void Property(Class, String)>
	//   59  137:putstatic       #88  <Field Property optOut>
		age = new Property(com/pactforcure/app/participant/Participant, "age");
	//   60  140:new             #60  <Class Property>
	//   61  143:dup             
	//   62  144:ldc1            #51  <Class Participant>
	//   63  146:ldc1            #89  <String "age">
	//   64  148:invokespecial   #62  <Method void Property(Class, String)>
	//   65  151:putstatic       #91  <Field Property age>
		race = new Property(com/pactforcure/app/participant/Participant, "race");
	//   66  154:new             #60  <Class Property>
	//   67  157:dup             
	//   68  158:ldc1            #51  <Class Participant>
	//   69  160:ldc1            #92  <String "race">
	//   70  162:invokespecial   #62  <Method void Property(Class, String)>
	//   71  165:putstatic       #94  <Field Property race>
		numDeliveries = new Property(com/pactforcure/app/participant/Participant, "numDeliveries");
	//   72  168:new             #60  <Class Property>
	//   73  171:dup             
	//   74  172:ldc1            #51  <Class Participant>
	//   75  174:ldc1            #95  <String "numDeliveries">
	//   76  176:invokespecial   #62  <Method void Property(Class, String)>
	//   77  179:putstatic       #97  <Field Property numDeliveries>
		signedPDF = new TypeConvertedProperty(com/pactforcure/app/participant/Participant, "signedPDF", true, new com.raizlabs.android.dbflow.sql.language.property.TypeConvertedProperty.TypeConverterGetter() {

			public TypeConverter getTypeConverter(Class class1)
			{
				return ((TypeConverter) (((Participant_Table)FlowManager.getInstanceAdapter(class1)).global_typeConverterDateConverter));
			//    0    0:aload_1         
			//    1    1:invokestatic    #21  <Method com.raizlabs.android.dbflow.structure.InstanceAdapter FlowManager.getInstanceAdapter(Class)>
			//    2    4:checkcast       #8   <Class Participant_Table>
			//    3    7:invokestatic    #25  <Method DateConverter Participant_Table.access$000(Participant_Table)>
			//    4   10:areturn         
			}

		}
);
	//   78  182:new             #99  <Class TypeConvertedProperty>
	//   79  185:dup             
	//   80  186:ldc1            #51  <Class Participant>
	//   81  188:ldc1            #100 <String "signedPDF">
	//   82  190:iconst_1        
	//   83  191:new             #7   <Class Participant_Table$1>
	//   84  194:dup             
	//   85  195:invokespecial   #102 <Method void Participant_Table$1()>
	//   86  198:invokespecial   #105 <Method void TypeConvertedProperty(Class, String, boolean, com.raizlabs.android.dbflow.sql.language.property.TypeConvertedProperty$TypeConverterGetter)>
	//   87  201:putstatic       #107 <Field TypeConvertedProperty signedPDF>
		registered = new Property(com/pactforcure/app/participant/Participant, "registered");
	//   88  204:new             #60  <Class Property>
	//   89  207:dup             
	//   90  208:ldc1            #51  <Class Participant>
	//   91  210:ldc1            #108 <String "registered">
	//   92  212:invokespecial   #62  <Method void Property(Class, String)>
	//   93  215:putstatic       #110 <Field Property registered>
		isUploaded = new Property(com/pactforcure/app/participant/Participant, "isUploaded");
	//   94  218:new             #60  <Class Property>
	//   95  221:dup             
	//   96  222:ldc1            #51  <Class Participant>
	//   97  224:ldc1            #111 <String "isUploaded">
	//   98  226:invokespecial   #62  <Method void Property(Class, String)>
	//   99  229:putstatic       #113 <Field Property isUploaded>
		address1 = new Property(com/pactforcure/app/participant/Participant, "address1");
	//  100  232:new             #60  <Class Property>
	//  101  235:dup             
	//  102  236:ldc1            #51  <Class Participant>
	//  103  238:ldc1            #114 <String "address1">
	//  104  240:invokespecial   #62  <Method void Property(Class, String)>
	//  105  243:putstatic       #116 <Field Property address1>
		address2 = new Property(com/pactforcure/app/participant/Participant, "address2");
	//  106  246:new             #60  <Class Property>
	//  107  249:dup             
	//  108  250:ldc1            #51  <Class Participant>
	//  109  252:ldc1            #117 <String "address2">
	//  110  254:invokespecial   #62  <Method void Property(Class, String)>
	//  111  257:putstatic       #119 <Field Property address2>
		city = new Property(com/pactforcure/app/participant/Participant, "city");
	//  112  260:new             #60  <Class Property>
	//  113  263:dup             
	//  114  264:ldc1            #51  <Class Participant>
	//  115  266:ldc1            #120 <String "city">
	//  116  268:invokespecial   #62  <Method void Property(Class, String)>
	//  117  271:putstatic       #122 <Field Property city>
		state = new Property(com/pactforcure/app/participant/Participant, "state");
	//  118  274:new             #60  <Class Property>
	//  119  277:dup             
	//  120  278:ldc1            #51  <Class Participant>
	//  121  280:ldc1            #123 <String "state">
	//  122  282:invokespecial   #62  <Method void Property(Class, String)>
	//  123  285:putstatic       #125 <Field Property state>
		zip = new Property(com/pactforcure/app/participant/Participant, "zip");
	//  124  288:new             #60  <Class Property>
	//  125  291:dup             
	//  126  292:ldc1            #51  <Class Participant>
	//  127  294:ldc1            #126 <String "zip">
	//  128  296:invokespecial   #62  <Method void Property(Class, String)>
	//  129  299:putstatic       #128 <Field Property zip>
		signedDNAPDF = new TypeConvertedProperty(com/pactforcure/app/participant/Participant, "signedDNAPDF", true, new com.raizlabs.android.dbflow.sql.language.property.TypeConvertedProperty.TypeConverterGetter() {

			public TypeConverter getTypeConverter(Class class1)
			{
				return ((TypeConverter) (((Participant_Table)FlowManager.getInstanceAdapter(class1)).global_typeConverterDateConverter));
			//    0    0:aload_1         
			//    1    1:invokestatic    #21  <Method com.raizlabs.android.dbflow.structure.InstanceAdapter FlowManager.getInstanceAdapter(Class)>
			//    2    4:checkcast       #8   <Class Participant_Table>
			//    3    7:invokestatic    #25  <Method DateConverter Participant_Table.access$000(Participant_Table)>
			//    4   10:areturn         
			}

		}
);
	//  130  302:new             #99  <Class TypeConvertedProperty>
	//  131  305:dup             
	//  132  306:ldc1            #51  <Class Participant>
	//  133  308:ldc1            #129 <String "signedDNAPDF">
	//  134  310:iconst_1        
	//  135  311:new             #9   <Class Participant_Table$2>
	//  136  314:dup             
	//  137  315:invokespecial   #130 <Method void Participant_Table$2()>
	//  138  318:invokespecial   #105 <Method void TypeConvertedProperty(Class, String, boolean, com.raizlabs.android.dbflow.sql.language.property.TypeConvertedProperty$TypeConverterGetter)>
	//  139  321:putstatic       #132 <Field TypeConvertedProperty signedDNAPDF>
		DNAregistered = new Property(com/pactforcure/app/participant/Participant, "DNAregistered");
	//  140  324:new             #60  <Class Property>
	//  141  327:dup             
	//  142  328:ldc1            #51  <Class Participant>
	//  143  330:ldc1            #133 <String "DNAregistered">
	//  144  332:invokespecial   #62  <Method void Property(Class, String)>
	//  145  335:putstatic       #135 <Field Property DNAregistered>
		base64Signature = new Property(com/pactforcure/app/participant/Participant, "base64Signature");
	//  146  338:new             #60  <Class Property>
	//  147  341:dup             
	//  148  342:ldc1            #51  <Class Participant>
	//  149  344:ldc1            #136 <String "base64Signature">
	//  150  346:invokespecial   #62  <Method void Property(Class, String)>
	//  151  349:putstatic       #138 <Field Property base64Signature>
		dnaBase64Signature = new Property(com/pactforcure/app/participant/Participant, "dnaBase64Signature");
	//  152  352:new             #60  <Class Property>
	//  153  355:dup             
	//  154  356:ldc1            #51  <Class Participant>
	//  155  358:ldc1            #139 <String "dnaBase64Signature">
	//  156  360:invokespecial   #62  <Method void Property(Class, String)>
	//  157  363:putstatic       #141 <Field Property dnaBase64Signature>
		ALL_COLUMN_PROPERTIES = (new IProperty[] {
			id, code, studyId, inWatchStudy, firstName, lastName, email, telephone, activeStatus, optOut, 
			age, race, numDeliveries, signedPDF, registered, isUploaded, address1, address2, city, state, 
			zip, signedDNAPDF, DNAregistered, base64Signature, dnaBase64Signature
		});
	//  158  366:bipush          25
	//  159  368:anewarray       IProperty[]
	//  160  371:dup             
	//  161  372:iconst_0        
	//  162  373:getstatic       #58  <Field LongProperty id>
	//  163  376:aastore         
	//  164  377:dup             
	//  165  378:iconst_1        
	//  166  379:getstatic       #64  <Field Property code>
	//  167  382:aastore         
	//  168  383:dup             
	//  169  384:iconst_2        
	//  170  385:getstatic       #67  <Field Property studyId>
	//  171  388:aastore         
	//  172  389:dup             
	//  173  390:iconst_3        
	//  174  391:getstatic       #70  <Field Property inWatchStudy>
	//  175  394:aastore         
	//  176  395:dup             
	//  177  396:iconst_4        
	//  178  397:getstatic       #73  <Field Property firstName>
	//  179  400:aastore         
	//  180  401:dup             
	//  181  402:iconst_5        
	//  182  403:getstatic       #76  <Field Property lastName>
	//  183  406:aastore         
	//  184  407:dup             
	//  185  408:bipush          6
	//  186  410:getstatic       #79  <Field Property email>
	//  187  413:aastore         
	//  188  414:dup             
	//  189  415:bipush          7
	//  190  417:getstatic       #82  <Field Property telephone>
	//  191  420:aastore         
	//  192  421:dup             
	//  193  422:bipush          8
	//  194  424:getstatic       #85  <Field Property activeStatus>
	//  195  427:aastore         
	//  196  428:dup             
	//  197  429:bipush          9
	//  198  431:getstatic       #88  <Field Property optOut>
	//  199  434:aastore         
	//  200  435:dup             
	//  201  436:bipush          10
	//  202  438:getstatic       #91  <Field Property age>
	//  203  441:aastore         
	//  204  442:dup             
	//  205  443:bipush          11
	//  206  445:getstatic       #94  <Field Property race>
	//  207  448:aastore         
	//  208  449:dup             
	//  209  450:bipush          12
	//  210  452:getstatic       #97  <Field Property numDeliveries>
	//  211  455:aastore         
	//  212  456:dup             
	//  213  457:bipush          13
	//  214  459:getstatic       #107 <Field TypeConvertedProperty signedPDF>
	//  215  462:aastore         
	//  216  463:dup             
	//  217  464:bipush          14
	//  218  466:getstatic       #110 <Field Property registered>
	//  219  469:aastore         
	//  220  470:dup             
	//  221  471:bipush          15
	//  222  473:getstatic       #113 <Field Property isUploaded>
	//  223  476:aastore         
	//  224  477:dup             
	//  225  478:bipush          16
	//  226  480:getstatic       #116 <Field Property address1>
	//  227  483:aastore         
	//  228  484:dup             
	//  229  485:bipush          17
	//  230  487:getstatic       #119 <Field Property address2>
	//  231  490:aastore         
	//  232  491:dup             
	//  233  492:bipush          18
	//  234  494:getstatic       #122 <Field Property city>
	//  235  497:aastore         
	//  236  498:dup             
	//  237  499:bipush          19
	//  238  501:getstatic       #125 <Field Property state>
	//  239  504:aastore         
	//  240  505:dup             
	//  241  506:bipush          20
	//  242  508:getstatic       #128 <Field Property zip>
	//  243  511:aastore         
	//  244  512:dup             
	//  245  513:bipush          21
	//  246  515:getstatic       #132 <Field TypeConvertedProperty signedDNAPDF>
	//  247  518:aastore         
	//  248  519:dup             
	//  249  520:bipush          22
	//  250  522:getstatic       #135 <Field Property DNAregistered>
	//  251  525:aastore         
	//  252  526:dup             
	//  253  527:bipush          23
	//  254  529:getstatic       #138 <Field Property base64Signature>
	//  255  532:aastore         
	//  256  533:dup             
	//  257  534:bipush          24
	//  258  536:getstatic       #141 <Field Property dnaBase64Signature>
	//  259  539:aastore         
	//  260  540:putstatic       #145 <Field IProperty[] ALL_COLUMN_PROPERTIES>
	//* 261  543:return          
	}


/*
	static DateConverter access$000(Participant_Table participant_table)
	{
		return participant_table.global_typeConverterDateConverter;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field DateConverter global_typeConverterDateConverter>
	//    2    4:areturn         
	}

*/
}
