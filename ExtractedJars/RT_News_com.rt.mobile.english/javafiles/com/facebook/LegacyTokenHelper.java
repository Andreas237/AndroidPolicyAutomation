// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.*;
import org.json.*;

// Referenced classes of package com.facebook:
//			AccessTokenSource, LoggingBehavior

final class LegacyTokenHelper
{

	public LegacyTokenHelper(Context context)
	{
		this(context, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #116 <Method void LegacyTokenHelper(Context, String)>
	//    4    6:return          
	}

	public LegacyTokenHelper(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #118 <Method void Object()>
		Validate.notNull(((Object) (context)), "context");
	//    2    4:aload_1         
	//    3    5:ldc1            #120 <String "context">
	//    4    7:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		String s1 = s;
	//    5   10:aload_2         
	//    6   11:astore_3        
		if(Utility.isNullOrEmpty(s))
	//*   7   12:aload_2         
	//*   8   13:invokestatic    #132 <Method boolean Utility.isNullOrEmpty(String)>
	//*   9   16:ifeq            22
			s1 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
	//   10   19:ldc1            #14  <String "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY">
	//   11   21:astore_3        
		cacheKey = s1;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:putfield        #134 <Field String cacheKey>
		s = ((String) (context.getApplicationContext()));
	//   15   27:aload_1         
	//   16   28:invokevirtual   #140 <Method Context Context.getApplicationContext()>
	//   17   31:astore_2        
		if(s != null)
	//*  18   32:aload_2         
	//*  19   33:ifnull          38
			context = ((Context) (s));
	//   20   36:aload_2         
	//   21   37:astore_1        
		cache = context.getSharedPreferences(cacheKey, 0);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:aload_0         
	//   25   41:getfield        #134 <Field String cacheKey>
	//   26   44:iconst_0        
	//   27   45:invokevirtual   #144 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   28   48:putfield        #146 <Field SharedPreferences cache>
	//   29   51:return          
	}

	private void deserializeKey(String s, Bundle bundle)
		throws JSONException
	{
		Object obj;
		obj = ((Object) (new JSONObject(cache.getString(s, "{}"))));
	//    0    0:new             #156 <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #146 <Field SharedPreferences cache>
	//    4    8:aload_1         
	//    5    9:ldc1            #158 <String "{}">
	//    6   11:invokeinterface #164 <Method String SharedPreferences.getString(String, String)>
	//    7   16:invokespecial   #167 <Method void JSONObject(String)>
	//    8   19:astore          12
		Object obj1 = ((Object) (((JSONObject) (obj)).getString("valueType")));
	//    9   21:aload           12
	//   10   23:ldc1            #33  <String "valueType">
	//   11   25:invokevirtual   #170 <Method String JSONObject.getString(String)>
	//   12   28:astore          13
		if(((String) (obj1)).equals("bool"))
	//*  13   30:aload           13
	//*  14   32:ldc1            #51  <String "bool">
	//*  15   34:invokevirtual   #176 <Method boolean String.equals(Object)>
	//*  16   37:ifeq            53
		{
			bundle.putBoolean(s, ((JSONObject) (obj)).getBoolean("value"));
	//   17   40:aload_2         
	//   18   41:aload_1         
	//   19   42:aload           12
	//   20   44:ldc1            #27  <String "value">
	//   21   46:invokevirtual   #179 <Method boolean JSONObject.getBoolean(String)>
	//   22   49:invokevirtual   #185 <Method void Bundle.putBoolean(String, boolean)>
			return;
	//   23   52:return          
		}
		boolean flag7 = ((String) (obj1)).equals("bool[]");
	//   24   53:aload           13
	//   25   55:ldc1            #54  <String "bool[]">
	//   26   57:invokevirtual   #176 <Method boolean String.equals(Object)>
	//   27   60:istore          11
		boolean flag1 = false;
	//   28   62:iconst_0        
	//   29   63:istore          5
		boolean flag2 = false;
	//   30   65:iconst_0        
	//   31   66:istore          6
		boolean flag3 = false;
	//   32   68:iconst_0        
	//   33   69:istore          7
		boolean flag4 = false;
	//   34   71:iconst_0        
	//   35   72:istore          8
		boolean flag5 = false;
	//   36   74:iconst_0        
	//   37   75:istore          9
		boolean flag6 = false;
	//   38   77:iconst_0        
	//   39   78:istore          10
		int i = 0;
	//   40   80:iconst_0        
	//   41   81:istore_3        
		boolean flag = false;
	//   42   82:iconst_0        
	//   43   83:istore          4
		if(flag7)
	//*  44   85:iload           11
	//*  45   87:ifeq            143
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//   46   90:aload           12
	//   47   92:ldc1            #27  <String "value">
	//   48   94:invokevirtual   #189 <Method JSONArray JSONObject.getJSONArray(String)>
	//   49   97:astore          12
			obj1 = ((Object) (new boolean[((JSONArray) (obj)).length()]));
	//   50   99:aload           12
	//   51  101:invokevirtual   #195 <Method int JSONArray.length()>
	//   52  104:newarray        boolean[]
	//   53  106:astore          13
			for(i = ((int) (flag)); i < obj1.length; i++)
	//*  54  108:iload           4
	//*  55  110:istore_3        
	//*  56  111:iload_3         
	//*  57  112:aload           13
	//*  58  114:arraylength     
	//*  59  115:icmpge          135
				obj1[i] = ((byte) (((JSONArray) (obj)).getBoolean(i)));
	//   60  118:aload           13
	//   61  120:iload_3         
	//   62  121:aload           12
	//   63  123:iload_3         
	//   64  124:invokevirtual   #198 <Method boolean JSONArray.getBoolean(int)>
	//   65  127:bastore         

	//   66  128:iload_3         
	//   67  129:iconst_1        
	//   68  130:iadd            
	//   69  131:istore_3        
	//*  70  132:goto            111
			bundle.putBooleanArray(s, ((boolean []) (obj1)));
	//   71  135:aload_2         
	//   72  136:aload_1         
	//   73  137:aload           13
	//   74  139:invokevirtual   #202 <Method void Bundle.putBooleanArray(String, boolean[])>
			return;
	//   75  142:return          
		}
		if(((String) (obj1)).equals("byte"))
	//*  76  143:aload           13
	//*  77  145:ldc1            #57  <String "byte">
	//*  78  147:invokevirtual   #176 <Method boolean String.equals(Object)>
	//*  79  150:ifeq            167
		{
			bundle.putByte(s, (byte)((JSONObject) (obj)).getInt("value"));
	//   80  153:aload_2         
	//   81  154:aload_1         
	//   82  155:aload           12
	//   83  157:ldc1            #27  <String "value">
	//   84  159:invokevirtual   #206 <Method int JSONObject.getInt(String)>
	//   85  162:int2byte        
	//   86  163:invokevirtual   #210 <Method void Bundle.putByte(String, byte)>
			return;
	//   87  166:return          
		}
		if(((String) (obj1)).equals("byte[]"))
	//*  88  167:aload           13
	//*  89  169:ldc1            #60  <String "byte[]">
	//*  90  171:invokevirtual   #176 <Method boolean String.equals(Object)>
	//*  91  174:ifeq            231
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//   92  177:aload           12
	//   93  179:ldc1            #27  <String "value">
	//   94  181:invokevirtual   #189 <Method JSONArray JSONObject.getJSONArray(String)>
	//   95  184:astore          12
			obj1 = ((Object) (new byte[((JSONArray) (obj)).length()]));
	//   96  186:aload           12
	//   97  188:invokevirtual   #195 <Method int JSONArray.length()>
	//   98  191:newarray        byte[]
	//   99  193:astore          13
			for(i = ((int) (flag1)); i < obj1.length; i++)
	//* 100  195:iload           5
	//* 101  197:istore_3        
	//* 102  198:iload_3         
	//* 103  199:aload           13
	//* 104  201:arraylength     
	//* 105  202:icmpge          223
				obj1[i] = (byte)((JSONArray) (obj)).getInt(i);
	//  106  205:aload           13
	//  107  207:iload_3         
	//  108  208:aload           12
	//  109  210:iload_3         
	//  110  211:invokevirtual   #213 <Method int JSONArray.getInt(int)>
	//  111  214:int2byte        
	//  112  215:bastore         

	//  113  216:iload_3         
	//  114  217:iconst_1        
	//  115  218:iadd            
	//  116  219:istore_3        
	//* 117  220:goto            198
			bundle.putByteArray(s, ((byte []) (obj1)));
	//  118  223:aload_2         
	//  119  224:aload_1         
	//  120  225:aload           13
	//  121  227:invokevirtual   #217 <Method void Bundle.putByteArray(String, byte[])>
			return;
	//  122  230:return          
		}
		if(((String) (obj1)).equals("short"))
	//* 123  231:aload           13
	//* 124  233:ldc1            #96  <String "short">
	//* 125  235:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 126  238:ifeq            255
		{
			bundle.putShort(s, (short)((JSONObject) (obj)).getInt("value"));
	//  127  241:aload_2         
	//  128  242:aload_1         
	//  129  243:aload           12
	//  130  245:ldc1            #27  <String "value">
	//  131  247:invokevirtual   #206 <Method int JSONObject.getInt(String)>
	//  132  250:int2short       
	//  133  251:invokevirtual   #221 <Method void Bundle.putShort(String, short)>
			return;
	//  134  254:return          
		}
		if(((String) (obj1)).equals("short[]"))
	//* 135  255:aload           13
	//* 136  257:ldc1            #99  <String "short[]">
	//* 137  259:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 138  262:ifeq            319
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  139  265:aload           12
	//  140  267:ldc1            #27  <String "value">
	//  141  269:invokevirtual   #189 <Method JSONArray JSONObject.getJSONArray(String)>
	//  142  272:astore          12
			obj1 = ((Object) (new short[((JSONArray) (obj)).length()]));
	//  143  274:aload           12
	//  144  276:invokevirtual   #195 <Method int JSONArray.length()>
	//  145  279:newarray        short[]
	//  146  281:astore          13
			for(i = ((int) (flag2)); i < obj1.length; i++)
	//* 147  283:iload           6
	//* 148  285:istore_3        
	//* 149  286:iload_3         
	//* 150  287:aload           13
	//* 151  289:arraylength     
	//* 152  290:icmpge          311
				obj1[i] = (short)((JSONArray) (obj)).getInt(i);
	//  153  293:aload           13
	//  154  295:iload_3         
	//  155  296:aload           12
	//  156  298:iload_3         
	//  157  299:invokevirtual   #213 <Method int JSONArray.getInt(int)>
	//  158  302:int2short       
	//  159  303:sastore         

	//  160  304:iload_3         
	//  161  305:iconst_1        
	//  162  306:iadd            
	//  163  307:istore_3        
	//* 164  308:goto            286
			bundle.putShortArray(s, ((short []) (obj1)));
	//  165  311:aload_2         
	//  166  312:aload_1         
	//  167  313:aload           13
	//  168  315:invokevirtual   #225 <Method void Bundle.putShortArray(String, short[])>
			return;
	//  169  318:return          
		}
		if(((String) (obj1)).equals("int"))
	//* 170  319:aload           13
	//* 171  321:ldc1            #84  <String "int">
	//* 172  323:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 173  326:ifeq            342
		{
			bundle.putInt(s, ((JSONObject) (obj)).getInt("value"));
	//  174  329:aload_2         
	//  175  330:aload_1         
	//  176  331:aload           12
	//  177  333:ldc1            #27  <String "value">
	//  178  335:invokevirtual   #206 <Method int JSONObject.getInt(String)>
	//  179  338:invokevirtual   #229 <Method void Bundle.putInt(String, int)>
			return;
	//  180  341:return          
		}
		if(((String) (obj1)).equals("int[]"))
	//* 181  342:aload           13
	//* 182  344:ldc1            #87  <String "int[]">
	//* 183  346:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 184  349:ifeq            405
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  185  352:aload           12
	//  186  354:ldc1            #27  <String "value">
	//  187  356:invokevirtual   #189 <Method JSONArray JSONObject.getJSONArray(String)>
	//  188  359:astore          12
			obj1 = ((Object) (new int[((JSONArray) (obj)).length()]));
	//  189  361:aload           12
	//  190  363:invokevirtual   #195 <Method int JSONArray.length()>
	//  191  366:newarray        int[]
	//  192  368:astore          13
			for(i = ((int) (flag3)); i < obj1.length; i++)
	//* 193  370:iload           7
	//* 194  372:istore_3        
	//* 195  373:iload_3         
	//* 196  374:aload           13
	//* 197  376:arraylength     
	//* 198  377:icmpge          397
				obj1[i] = ((JSONArray) (obj)).getInt(i);
	//  199  380:aload           13
	//  200  382:iload_3         
	//  201  383:aload           12
	//  202  385:iload_3         
	//  203  386:invokevirtual   #213 <Method int JSONArray.getInt(int)>
	//  204  389:iastore         

	//  205  390:iload_3         
	//  206  391:iconst_1        
	//  207  392:iadd            
	//  208  393:istore_3        
	//* 209  394:goto            373
			bundle.putIntArray(s, ((int []) (obj1)));
	//  210  397:aload_2         
	//  211  398:aload_1         
	//  212  399:aload           13
	//  213  401:invokevirtual   #233 <Method void Bundle.putIntArray(String, int[])>
			return;
	//  214  404:return          
		}
		if(((String) (obj1)).equals("long"))
	//* 215  405:aload           13
	//* 216  407:ldc1            #90  <String "long">
	//* 217  409:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 218  412:ifeq            428
		{
			bundle.putLong(s, ((JSONObject) (obj)).getLong("value"));
	//  219  415:aload_2         
	//  220  416:aload_1         
	//  221  417:aload           12
	//  222  419:ldc1            #27  <String "value">
	//  223  421:invokevirtual   #237 <Method long JSONObject.getLong(String)>
	//  224  424:invokevirtual   #241 <Method void Bundle.putLong(String, long)>
			return;
	//  225  427:return          
		}
		if(((String) (obj1)).equals("long[]"))
	//* 226  428:aload           13
	//* 227  430:ldc1            #93  <String "long[]">
	//* 228  432:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 229  435:ifeq            491
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  230  438:aload           12
	//  231  440:ldc1            #27  <String "value">
	//  232  442:invokevirtual   #189 <Method JSONArray JSONObject.getJSONArray(String)>
	//  233  445:astore          12
			obj1 = ((Object) (new long[((JSONArray) (obj)).length()]));
	//  234  447:aload           12
	//  235  449:invokevirtual   #195 <Method int JSONArray.length()>
	//  236  452:newarray        long[]
	//  237  454:astore          13
			for(i = ((int) (flag4)); i < obj1.length; i++)
	//* 238  456:iload           8
	//* 239  458:istore_3        
	//* 240  459:iload_3         
	//* 241  460:aload           13
	//* 242  462:arraylength     
	//* 243  463:icmpge          483
				obj1[i] = ((JSONArray) (obj)).getLong(i);
	//  244  466:aload           13
	//  245  468:iload_3         
	//  246  469:aload           12
	//  247  471:iload_3         
	//  248  472:invokevirtual   #244 <Method long JSONArray.getLong(int)>
	//  249  475:lastore         

	//  250  476:iload_3         
	//  251  477:iconst_1        
	//  252  478:iadd            
	//  253  479:istore_3        
	//* 254  480:goto            459
			bundle.putLongArray(s, ((long []) (obj1)));
	//  255  483:aload_2         
	//  256  484:aload_1         
	//  257  485:aload           13
	//  258  487:invokevirtual   #248 <Method void Bundle.putLongArray(String, long[])>
			return;
	//  259  490:return          
		}
		if(((String) (obj1)).equals("float"))
	//* 260  491:aload           13
	//* 261  493:ldc1            #78  <String "float">
	//* 262  495:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 263  498:ifeq            515
		{
			bundle.putFloat(s, (float)((JSONObject) (obj)).getDouble("value"));
	//  264  501:aload_2         
	//  265  502:aload_1         
	//  266  503:aload           12
	//  267  505:ldc1            #27  <String "value">
	//  268  507:invokevirtual   #252 <Method double JSONObject.getDouble(String)>
	//  269  510:d2f             
	//  270  511:invokevirtual   #256 <Method void Bundle.putFloat(String, float)>
			return;
	//  271  514:return          
		}
		if(((String) (obj1)).equals("float[]"))
	//* 272  515:aload           13
	//* 273  517:ldc1            #81  <String "float[]">
	//* 274  519:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 275  522:ifeq            579
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  276  525:aload           12
	//  277  527:ldc1            #27  <String "value">
	//  278  529:invokevirtual   #189 <Method JSONArray JSONObject.getJSONArray(String)>
	//  279  532:astore          12
			obj1 = ((Object) (new float[((JSONArray) (obj)).length()]));
	//  280  534:aload           12
	//  281  536:invokevirtual   #195 <Method int JSONArray.length()>
	//  282  539:newarray        float[]
	//  283  541:astore          13
			for(i = ((int) (flag5)); i < obj1.length; i++)
	//* 284  543:iload           9
	//* 285  545:istore_3        
	//* 286  546:iload_3         
	//* 287  547:aload           13
	//* 288  549:arraylength     
	//* 289  550:icmpge          571
				obj1[i] = (float)((JSONArray) (obj)).getDouble(i);
	//  290  553:aload           13
	//  291  555:iload_3         
	//  292  556:aload           12
	//  293  558:iload_3         
	//  294  559:invokevirtual   #259 <Method double JSONArray.getDouble(int)>
	//  295  562:d2f             
	//  296  563:fastore         

	//  297  564:iload_3         
	//  298  565:iconst_1        
	//  299  566:iadd            
	//  300  567:istore_3        
	//* 301  568:goto            546
			bundle.putFloatArray(s, ((float []) (obj1)));
	//  302  571:aload_2         
	//  303  572:aload_1         
	//  304  573:aload           13
	//  305  575:invokevirtual   #263 <Method void Bundle.putFloatArray(String, float[])>
			return;
	//  306  578:return          
		}
		if(((String) (obj1)).equals("double"))
	//* 307  579:aload           13
	//* 308  581:ldc1            #69  <String "double">
	//* 309  583:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 310  586:ifeq            602
		{
			bundle.putDouble(s, ((JSONObject) (obj)).getDouble("value"));
	//  311  589:aload_2         
	//  312  590:aload_1         
	//  313  591:aload           12
	//  314  593:ldc1            #27  <String "value">
	//  315  595:invokevirtual   #252 <Method double JSONObject.getDouble(String)>
	//  316  598:invokevirtual   #267 <Method void Bundle.putDouble(String, double)>
			return;
	//  317  601:return          
		}
		if(((String) (obj1)).equals("double[]"))
	//* 318  602:aload           13
	//* 319  604:ldc1            #72  <String "double[]">
	//* 320  606:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 321  609:ifeq            665
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  322  612:aload           12
	//  323  614:ldc1            #27  <String "value">
	//  324  616:invokevirtual   #189 <Method JSONArray JSONObject.getJSONArray(String)>
	//  325  619:astore          12
			obj1 = ((Object) (new double[((JSONArray) (obj)).length()]));
	//  326  621:aload           12
	//  327  623:invokevirtual   #195 <Method int JSONArray.length()>
	//  328  626:newarray        double[]
	//  329  628:astore          13
			for(i = ((int) (flag6)); i < obj1.length; i++)
	//* 330  630:iload           10
	//* 331  632:istore_3        
	//* 332  633:iload_3         
	//* 333  634:aload           13
	//* 334  636:arraylength     
	//* 335  637:icmpge          657
				obj1[i] = ((JSONArray) (obj)).getDouble(i);
	//  336  640:aload           13
	//  337  642:iload_3         
	//  338  643:aload           12
	//  339  645:iload_3         
	//  340  646:invokevirtual   #259 <Method double JSONArray.getDouble(int)>
	//  341  649:dastore         

	//  342  650:iload_3         
	//  343  651:iconst_1        
	//  344  652:iadd            
	//  345  653:istore_3        
	//* 346  654:goto            633
			bundle.putDoubleArray(s, ((double []) (obj1)));
	//  347  657:aload_2         
	//  348  658:aload_1         
	//  349  659:aload           13
	//  350  661:invokevirtual   #271 <Method void Bundle.putDoubleArray(String, double[])>
			return;
	//  351  664:return          
		}
		if(((String) (obj1)).equals("char"))
	//* 352  665:aload           13
	//* 353  667:ldc1            #63  <String "char">
	//* 354  669:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 355  672:ifeq            710
		{
			obj = ((Object) (((JSONObject) (obj)).getString("value")));
	//  356  675:aload           12
	//  357  677:ldc1            #27  <String "value">
	//  358  679:invokevirtual   #170 <Method String JSONObject.getString(String)>
	//  359  682:astore          12
			if(obj != null && ((String) (obj)).length() == 1)
	//* 360  684:aload           12
	//* 361  686:ifnull          947
	//* 362  689:aload           12
	//* 363  691:invokevirtual   #272 <Method int String.length()>
	//* 364  694:iconst_1        
	//* 365  695:icmpne          947
			{
				bundle.putChar(s, ((String) (obj)).charAt(0));
	//  366  698:aload_2         
	//  367  699:aload_1         
	//  368  700:aload           12
	//  369  702:iconst_0        
	//  370  703:invokevirtual   #276 <Method char String.charAt(int)>
	//  371  706:invokevirtual   #280 <Method void Bundle.putChar(String, char)>
				return;
	//  372  709:return          
			}
			break MISSING_BLOCK_LABEL_947;
		}
		if(((String) (obj1)).equals("char[]"))
	//* 373  710:aload           13
	//* 374  712:ldc1            #66  <String "char[]">
	//* 375  714:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 376  717:ifeq            794
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  377  720:aload           12
	//  378  722:ldc1            #27  <String "value">
	//  379  724:invokevirtual   #189 <Method JSONArray JSONObject.getJSONArray(String)>
	//  380  727:astore          12
			obj1 = ((Object) (new char[((JSONArray) (obj)).length()]));
	//  381  729:aload           12
	//  382  731:invokevirtual   #195 <Method int JSONArray.length()>
	//  383  734:newarray        char[]
	//  384  736:astore          13
			for(i = 0; i < obj1.length; i++)
	//* 385  738:iconst_0        
	//* 386  739:istore_3        
	//* 387  740:iload_3         
	//* 388  741:aload           13
	//* 389  743:arraylength     
	//* 390  744:icmpge          786
			{
				String s1 = ((JSONArray) (obj)).getString(i);
	//  391  747:aload           12
	//  392  749:iload_3         
	//  393  750:invokevirtual   #283 <Method String JSONArray.getString(int)>
	//  394  753:astore          14
				if(s1 != null && s1.length() == 1)
	//* 395  755:aload           14
	//* 396  757:ifnull          779
	//* 397  760:aload           14
	//* 398  762:invokevirtual   #272 <Method int String.length()>
	//* 399  765:iconst_1        
	//* 400  766:icmpne          779
					obj1[i] = ((double) (s1.charAt(0)));
	//  401  769:aload           13
	//  402  771:iload_3         
	//  403  772:aload           14
	//  404  774:iconst_0        
	//  405  775:invokevirtual   #276 <Method char String.charAt(int)>
	//  406  778:castore         
			}

	//  407  779:iload_3         
	//  408  780:iconst_1        
	//  409  781:iadd            
	//  410  782:istore_3        
	//* 411  783:goto            740
			bundle.putCharArray(s, ((char []) (obj1)));
	//  412  786:aload_2         
	//  413  787:aload_1         
	//  414  788:aload           13
	//  415  790:invokevirtual   #287 <Method void Bundle.putCharArray(String, char[])>
			return;
	//  416  793:return          
		}
		if(((String) (obj1)).equals("string"))
	//* 417  794:aload           13
	//* 418  796:ldc1            #102 <String "string">
	//* 419  798:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 420  801:ifeq            817
		{
			bundle.putString(s, ((JSONObject) (obj)).getString("value"));
	//  421  804:aload_2         
	//  422  805:aload_1         
	//  423  806:aload           12
	//  424  808:ldc1            #27  <String "value">
	//  425  810:invokevirtual   #170 <Method String JSONObject.getString(String)>
	//  426  813:invokevirtual   #291 <Method void Bundle.putString(String, String)>
			return;
	//  427  816:return          
		}
		if(((String) (obj1)).equals("stringList"))
	//* 428  817:aload           13
	//* 429  819:ldc1            #105 <String "stringList">
	//* 430  821:invokevirtual   #176 <Method boolean String.equals(Object)>
	//* 431  824:ifeq            912
		{
			obj1 = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  432  827:aload           12
	//  433  829:ldc1            #27  <String "value">
	//  434  831:invokevirtual   #189 <Method JSONArray JSONObject.getJSONArray(String)>
	//  435  834:astore          13
			int j = ((JSONArray) (obj1)).length();
	//  436  836:aload           13
	//  437  838:invokevirtual   #195 <Method int JSONArray.length()>
	//  438  841:istore          4
			ArrayList arraylist = new ArrayList(j);
	//  439  843:new             #293 <Class ArrayList>
	//  440  846:dup             
	//  441  847:iload           4
	//  442  849:invokespecial   #296 <Method void ArrayList(int)>
	//  443  852:astore          14
			for(; i < j; i++)
	//* 444  854:iload_3         
	//* 445  855:iload           4
	//* 446  857:icmpge          904
			{
				obj = ((JSONArray) (obj1)).get(i);
	//  447  860:aload           13
	//  448  862:iload_3         
	//  449  863:invokevirtual   #300 <Method Object JSONArray.get(int)>
	//  450  866:astore          12
				if(obj == JSONObject.NULL)
	//* 451  868:aload           12
	//* 452  870:getstatic       #304 <Field Object JSONObject.NULL>
	//* 453  873:if_acmpne       882
					obj = null;
	//  454  876:aconst_null     
	//  455  877:astore          12
				else
	//* 456  879:goto            889
					obj = ((Object) ((String)obj));
	//  457  882:aload           12
	//  458  884:checkcast       #172 <Class String>
	//  459  887:astore          12
				arraylist.add(i, obj);
	//  460  889:aload           14
	//  461  891:iload_3         
	//  462  892:aload           12
	//  463  894:invokevirtual   #308 <Method void ArrayList.add(int, Object)>
			}

	//  464  897:iload_3         
	//  465  898:iconst_1        
	//  466  899:iadd            
	//  467  900:istore_3        
	//* 468  901:goto            854
			bundle.putStringArrayList(s, arraylist);
	//  469  904:aload_2         
	//  470  905:aload_1         
	//  471  906:aload           14
	//  472  908:invokevirtual   #312 <Method void Bundle.putStringArrayList(String, ArrayList)>
			return;
	//  473  911:return          
		}
		if(!((String) (obj1)).equals("enum"))
			break MISSING_BLOCK_LABEL_947;
	//  474  912:aload           13
	//  475  914:ldc1            #75  <String "enum">
	//  476  916:invokevirtual   #176 <Method boolean String.equals(Object)>
	//  477  919:ifeq            947
		bundle.putSerializable(s, ((java.io.Serializable) (Enum.valueOf(Class.forName(((JSONObject) (obj)).getString("enumType")), ((JSONObject) (obj)).getString("value")))));
	//  478  922:aload_2         
	//  479  923:aload_1         
	//  480  924:aload           12
	//  481  926:ldc1            #30  <String "enumType">
	//  482  928:invokevirtual   #170 <Method String JSONObject.getString(String)>
	//  483  931:invokestatic    #318 <Method Class Class.forName(String)>
	//  484  934:aload           12
	//  485  936:ldc1            #27  <String "value">
	//  486  938:invokevirtual   #170 <Method String JSONObject.getString(String)>
	//  487  941:invokestatic    #324 <Method Enum Enum.valueOf(Class, String)>
	//  488  944:invokevirtual   #328 <Method void Bundle.putSerializable(String, java.io.Serializable)>
		return;
	//  489  947:return          
		s;
	//  490  948:astore_1        
	//  491  949:return          
	}

	public static String getApplicationId(Bundle bundle)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
	//    3    7:aload_0         
	//    4    8:ldc1            #8   <String "com.facebook.TokenCachingStrategy.ApplicationId">
	//    5   10:invokevirtual   #334 <Method String Bundle.getString(String)>
	//    6   13:areturn         
	}

	static Date getDate(Bundle bundle, String s)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		long l = bundle.getLong(s, 0x0L);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:ldc2w           #20  <Long 0x0L>
	//    7   11:invokevirtual   #339 <Method long Bundle.getLong(String, long)>
	//    8   14:lstore_2        
		if(l == 0x0L)
	//*   9   15:lload_2         
	//*  10   16:ldc2w           #20  <Long 0x0L>
	//*  11   19:lcmp            
	//*  12   20:ifne            25
			return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
		else
			return new Date(l);
	//   15   25:new             #341 <Class Date>
	//   16   28:dup             
	//   17   29:lload_2         
	//   18   30:invokespecial   #344 <Method void Date(long)>
	//   19   33:areturn         
	}

	public static Date getExpirationDate(Bundle bundle)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		return getDate(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
	//    3    7:aload_0         
	//    4    8:ldc1            #17  <String "com.facebook.TokenCachingStrategy.ExpirationDate">
	//    5   10:invokestatic    #348 <Method Date getDate(Bundle, String)>
	//    6   13:areturn         
	}

	public static long getExpirationMilliseconds(Bundle bundle)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		return bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate");
	//    3    7:aload_0         
	//    4    8:ldc1            #17  <String "com.facebook.TokenCachingStrategy.ExpirationDate">
	//    5   10:invokevirtual   #351 <Method long Bundle.getLong(String)>
	//    6   13:lreturn         
	}

	public static Date getLastRefreshDate(Bundle bundle)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		return getDate(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
	//    3    7:aload_0         
	//    4    8:ldc1            #36  <String "com.facebook.TokenCachingStrategy.LastRefreshDate">
	//    5   10:invokestatic    #348 <Method Date getDate(Bundle, String)>
	//    6   13:areturn         
	}

	public static long getLastRefreshMilliseconds(Bundle bundle)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		return bundle.getLong("com.facebook.TokenCachingStrategy.LastRefreshDate");
	//    3    7:aload_0         
	//    4    8:ldc1            #36  <String "com.facebook.TokenCachingStrategy.LastRefreshDate">
	//    5   10:invokevirtual   #351 <Method long Bundle.getLong(String)>
	//    6   13:lreturn         
	}

	public static Set getPermissions(Bundle bundle)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		bundle = ((Bundle) (bundle.getStringArrayList("com.facebook.TokenCachingStrategy.Permissions")));
	//    3    7:aload_0         
	//    4    8:ldc1            #39  <String "com.facebook.TokenCachingStrategy.Permissions">
	//    5   10:invokevirtual   #359 <Method ArrayList Bundle.getStringArrayList(String)>
	//    6   13:astore_0        
		if(bundle == null)
	//*   7   14:aload_0         
	//*   8   15:ifnonnull       20
			return null;
	//    9   18:aconst_null     
	//   10   19:areturn         
		else
			return ((Set) (new HashSet(((Collection) (bundle)))));
	//   11   20:new             #361 <Class HashSet>
	//   12   23:dup             
	//   13   24:aload_0         
	//   14   25:invokespecial   #364 <Method void HashSet(Collection)>
	//   15   28:areturn         
	}

	public static AccessTokenSource getSource(Bundle bundle)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		if(bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource"))
	//*   3    7:aload_0         
	//*   4    8:ldc1            #48  <String "com.facebook.TokenCachingStrategy.AccessTokenSource">
	//*   5   10:invokevirtual   #371 <Method boolean Bundle.containsKey(String)>
	//*   6   13:ifeq            26
			return (AccessTokenSource)bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
	//    7   16:aload_0         
	//    8   17:ldc1            #48  <String "com.facebook.TokenCachingStrategy.AccessTokenSource">
	//    9   19:invokevirtual   #375 <Method java.io.Serializable Bundle.getSerializable(String)>
	//   10   22:checkcast       #377 <Class AccessTokenSource>
	//   11   25:areturn         
		if(bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO"))
	//*  12   26:aload_0         
	//*  13   27:ldc1            #24  <String "com.facebook.TokenCachingStrategy.IsSSO">
	//*  14   29:invokevirtual   #378 <Method boolean Bundle.getBoolean(String)>
	//*  15   32:ifeq            39
			return AccessTokenSource.FACEBOOK_APPLICATION_WEB;
	//   16   35:getstatic       #382 <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_WEB>
	//   17   38:areturn         
		else
			return AccessTokenSource.WEB_VIEW;
	//   18   39:getstatic       #385 <Field AccessTokenSource AccessTokenSource.WEB_VIEW>
	//   19   42:areturn         
	}

	public static String getToken(Bundle bundle)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		return bundle.getString("com.facebook.TokenCachingStrategy.Token");
	//    3    7:aload_0         
	//    4    8:ldc1            #45  <String "com.facebook.TokenCachingStrategy.Token">
	//    5   10:invokevirtual   #334 <Method String Bundle.getString(String)>
	//    6   13:areturn         
	}

	public static boolean hasTokenInformation(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		String s = bundle.getString("com.facebook.TokenCachingStrategy.Token");
	//    4    6:aload_0         
	//    5    7:ldc1            #45  <String "com.facebook.TokenCachingStrategy.Token">
	//    6    9:invokevirtual   #334 <Method String Bundle.getString(String)>
	//    7   12:astore_1        
		if(s != null)
	//*   8   13:aload_1         
	//*   9   14:ifnull          42
		{
			if(s.length() == 0)
	//*  10   17:aload_1         
	//*  11   18:invokevirtual   #272 <Method int String.length()>
	//*  12   21:ifne            26
				return false;
	//   13   24:iconst_0        
	//   14   25:ireturn         
			return bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) != 0L;
	//   15   26:aload_0         
	//   16   27:ldc1            #17  <String "com.facebook.TokenCachingStrategy.ExpirationDate">
	//   17   29:lconst_0        
	//   18   30:invokevirtual   #339 <Method long Bundle.getLong(String, long)>
	//   19   33:lconst_0        
	//   20   34:lcmp            
	//   21   35:ifne            40
	//   22   38:iconst_0        
	//   23   39:ireturn         
	//   24   40:iconst_1        
	//   25   41:ireturn         
		} else
		{
			return false;
	//   26   42:iconst_0        
	//   27   43:ireturn         
		}
	}

	public static void putApplicationId(Bundle bundle, String s)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		bundle.putString("com.facebook.TokenCachingStrategy.ApplicationId", s);
	//    3    7:aload_0         
	//    4    8:ldc1            #8   <String "com.facebook.TokenCachingStrategy.ApplicationId">
	//    5   10:aload_1         
	//    6   11:invokevirtual   #291 <Method void Bundle.putString(String, String)>
	//    7   14:return          
	}

	static void putDate(Bundle bundle, String s, Date date)
	{
		bundle.putLong(s, date.getTime());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #396 <Method long Date.getTime()>
	//    4    6:invokevirtual   #241 <Method void Bundle.putLong(String, long)>
	//    5    9:return          
	}

	public static void putDeclinedPermissions(Bundle bundle, Collection collection)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (collection)), "value");
	//    3    7:aload_1         
	//    4    8:ldc1            #27  <String "value">
	//    5   10:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		bundle.putStringArrayList("com.facebook.TokenCachingStrategy.DeclinedPermissions", new ArrayList(collection));
	//    6   13:aload_0         
	//    7   14:ldc1            #11  <String "com.facebook.TokenCachingStrategy.DeclinedPermissions">
	//    8   16:new             #293 <Class ArrayList>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #399 <Method void ArrayList(Collection)>
	//   12   24:invokevirtual   #312 <Method void Bundle.putStringArrayList(String, ArrayList)>
	//   13   27:return          
	}

	public static void putExpirationDate(Bundle bundle, Date date)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (date)), "value");
	//    3    7:aload_1         
	//    4    8:ldc1            #27  <String "value">
	//    5   10:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		putDate(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate", date);
	//    6   13:aload_0         
	//    7   14:ldc1            #17  <String "com.facebook.TokenCachingStrategy.ExpirationDate">
	//    8   16:aload_1         
	//    9   17:invokestatic    #404 <Method void putDate(Bundle, String, Date)>
	//   10   20:return          
	}

	public static void putExpirationMilliseconds(Bundle bundle, long l)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		bundle.putLong("com.facebook.TokenCachingStrategy.ExpirationDate", l);
	//    3    7:aload_0         
	//    4    8:ldc1            #17  <String "com.facebook.TokenCachingStrategy.ExpirationDate">
	//    5   10:lload_1         
	//    6   11:invokevirtual   #241 <Method void Bundle.putLong(String, long)>
	//    7   14:return          
	}

	public static void putLastRefreshDate(Bundle bundle, Date date)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (date)), "value");
	//    3    7:aload_1         
	//    4    8:ldc1            #27  <String "value">
	//    5   10:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		putDate(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate", date);
	//    6   13:aload_0         
	//    7   14:ldc1            #36  <String "com.facebook.TokenCachingStrategy.LastRefreshDate">
	//    8   16:aload_1         
	//    9   17:invokestatic    #404 <Method void putDate(Bundle, String, Date)>
	//   10   20:return          
	}

	public static void putLastRefreshMilliseconds(Bundle bundle, long l)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		bundle.putLong("com.facebook.TokenCachingStrategy.LastRefreshDate", l);
	//    3    7:aload_0         
	//    4    8:ldc1            #36  <String "com.facebook.TokenCachingStrategy.LastRefreshDate">
	//    5   10:lload_1         
	//    6   11:invokevirtual   #241 <Method void Bundle.putLong(String, long)>
	//    7   14:return          
	}

	public static void putPermissions(Bundle bundle, Collection collection)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (collection)), "value");
	//    3    7:aload_1         
	//    4    8:ldc1            #27  <String "value">
	//    5   10:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		bundle.putStringArrayList("com.facebook.TokenCachingStrategy.Permissions", new ArrayList(collection));
	//    6   13:aload_0         
	//    7   14:ldc1            #39  <String "com.facebook.TokenCachingStrategy.Permissions">
	//    8   16:new             #293 <Class ArrayList>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #399 <Method void ArrayList(Collection)>
	//   12   24:invokevirtual   #312 <Method void Bundle.putStringArrayList(String, ArrayList)>
	//   13   27:return          
	}

	public static void putSource(Bundle bundle, AccessTokenSource accesstokensource)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		bundle.putSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource", ((java.io.Serializable) (accesstokensource)));
	//    3    7:aload_0         
	//    4    8:ldc1            #48  <String "com.facebook.TokenCachingStrategy.AccessTokenSource">
	//    5   10:aload_1         
	//    6   11:invokevirtual   #328 <Method void Bundle.putSerializable(String, java.io.Serializable)>
	//    7   14:return          
	}

	public static void putToken(Bundle bundle, String s)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (s)), "value");
	//    3    7:aload_1         
	//    4    8:ldc1            #27  <String "value">
	//    5   10:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		bundle.putString("com.facebook.TokenCachingStrategy.Token", s);
	//    6   13:aload_0         
	//    7   14:ldc1            #45  <String "com.facebook.TokenCachingStrategy.Token">
	//    8   16:aload_1         
	//    9   17:invokevirtual   #291 <Method void Bundle.putString(String, String)>
	//   10   20:return          
	}

	private void serializeKey(String s, Bundle bundle, android.content.SharedPreferences.Editor editor)
		throws JSONException
	{
		Object obj1 = bundle.get(s);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #417 <Method Object Bundle.get(String)>
	//    3    5:astore          15
		if(obj1 == null)
	//*   4    7:aload           15
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		JSONObject jsonobject = new JSONObject();
	//    7   13:new             #156 <Class JSONObject>
	//    8   16:dup             
	//    9   17:invokespecial   #418 <Method void JSONObject()>
	//   10   20:astore          16
		boolean flag5 = obj1 instanceof Byte;
	//   11   22:aload           15
	//   12   24:instanceof      #420 <Class Byte>
	//   13   27:istore          12
		String s1 = null;
	//   14   29:aconst_null     
	//   15   30:astore          14
		Object obj;
		if(flag5)
	//*  16   32:iload           12
	//*  17   34:ifeq            63
		{
			bundle = "byte";
	//   18   37:ldc1            #57  <String "byte">
	//   19   39:astore_2        
			jsonobject.put("value", ((Byte)obj1).intValue());
	//   20   40:aload           16
	//   21   42:ldc1            #27  <String "value">
	//   22   44:aload           15
	//   23   46:checkcast       #420 <Class Byte>
	//   24   49:invokevirtual   #423 <Method int Byte.intValue()>
	//   25   52:invokevirtual   #427 <Method JSONObject JSONObject.put(String, int)>
	//   26   55:pop             
			obj = ((Object) (s1));
	//   27   56:aload           14
	//   28   58:astore          13
		} else
	//*  29   60:goto            957
		if(obj1 instanceof Short)
	//*  30   63:aload           15
	//*  31   65:instanceof      #429 <Class Short>
	//*  32   68:ifeq            97
		{
			bundle = "short";
	//   33   71:ldc1            #96  <String "short">
	//   34   73:astore_2        
			jsonobject.put("value", ((Short)obj1).intValue());
	//   35   74:aload           16
	//   36   76:ldc1            #27  <String "value">
	//   37   78:aload           15
	//   38   80:checkcast       #429 <Class Short>
	//   39   83:invokevirtual   #430 <Method int Short.intValue()>
	//   40   86:invokevirtual   #427 <Method JSONObject JSONObject.put(String, int)>
	//   41   89:pop             
			obj = ((Object) (s1));
	//   42   90:aload           14
	//   43   92:astore          13
		} else
	//*  44   94:goto            957
		if(obj1 instanceof Integer)
	//*  45   97:aload           15
	//*  46   99:instanceof      #432 <Class Integer>
	//*  47  102:ifeq            131
		{
			bundle = "int";
	//   48  105:ldc1            #84  <String "int">
	//   49  107:astore_2        
			jsonobject.put("value", ((Integer)obj1).intValue());
	//   50  108:aload           16
	//   51  110:ldc1            #27  <String "value">
	//   52  112:aload           15
	//   53  114:checkcast       #432 <Class Integer>
	//   54  117:invokevirtual   #433 <Method int Integer.intValue()>
	//   55  120:invokevirtual   #427 <Method JSONObject JSONObject.put(String, int)>
	//   56  123:pop             
			obj = ((Object) (s1));
	//   57  124:aload           14
	//   58  126:astore          13
		} else
	//*  59  128:goto            957
		if(obj1 instanceof Long)
	//*  60  131:aload           15
	//*  61  133:instanceof      #435 <Class Long>
	//*  62  136:ifeq            165
		{
			bundle = "long";
	//   63  139:ldc1            #90  <String "long">
	//   64  141:astore_2        
			jsonobject.put("value", ((Long)obj1).longValue());
	//   65  142:aload           16
	//   66  144:ldc1            #27  <String "value">
	//   67  146:aload           15
	//   68  148:checkcast       #435 <Class Long>
	//   69  151:invokevirtual   #438 <Method long Long.longValue()>
	//   70  154:invokevirtual   #441 <Method JSONObject JSONObject.put(String, long)>
	//   71  157:pop             
			obj = ((Object) (s1));
	//   72  158:aload           14
	//   73  160:astore          13
		} else
	//*  74  162:goto            957
		if(obj1 instanceof Float)
	//*  75  165:aload           15
	//*  76  167:instanceof      #443 <Class Float>
	//*  77  170:ifeq            199
		{
			bundle = "float";
	//   78  173:ldc1            #78  <String "float">
	//   79  175:astore_2        
			jsonobject.put("value", ((Float)obj1).doubleValue());
	//   80  176:aload           16
	//   81  178:ldc1            #27  <String "value">
	//   82  180:aload           15
	//   83  182:checkcast       #443 <Class Float>
	//   84  185:invokevirtual   #447 <Method double Float.doubleValue()>
	//   85  188:invokevirtual   #450 <Method JSONObject JSONObject.put(String, double)>
	//   86  191:pop             
			obj = ((Object) (s1));
	//   87  192:aload           14
	//   88  194:astore          13
		} else
	//*  89  196:goto            957
		if(obj1 instanceof Double)
	//*  90  199:aload           15
	//*  91  201:instanceof      #452 <Class Double>
	//*  92  204:ifeq            233
		{
			bundle = "double";
	//   93  207:ldc1            #69  <String "double">
	//   94  209:astore_2        
			jsonobject.put("value", ((Double)obj1).doubleValue());
	//   95  210:aload           16
	//   96  212:ldc1            #27  <String "value">
	//   97  214:aload           15
	//   98  216:checkcast       #452 <Class Double>
	//   99  219:invokevirtual   #453 <Method double Double.doubleValue()>
	//  100  222:invokevirtual   #450 <Method JSONObject JSONObject.put(String, double)>
	//  101  225:pop             
			obj = ((Object) (s1));
	//  102  226:aload           14
	//  103  228:astore          13
		} else
	//* 104  230:goto            957
		if(obj1 instanceof Boolean)
	//* 105  233:aload           15
	//* 106  235:instanceof      #455 <Class Boolean>
	//* 107  238:ifeq            267
		{
			bundle = "bool";
	//  108  241:ldc1            #51  <String "bool">
	//  109  243:astore_2        
			jsonobject.put("value", ((Boolean)obj1).booleanValue());
	//  110  244:aload           16
	//  111  246:ldc1            #27  <String "value">
	//  112  248:aload           15
	//  113  250:checkcast       #455 <Class Boolean>
	//  114  253:invokevirtual   #459 <Method boolean Boolean.booleanValue()>
	//  115  256:invokevirtual   #462 <Method JSONObject JSONObject.put(String, boolean)>
	//  116  259:pop             
			obj = ((Object) (s1));
	//  117  260:aload           14
	//  118  262:astore          13
		} else
	//* 119  264:goto            957
		if(obj1 instanceof Character)
	//* 120  267:aload           15
	//* 121  269:instanceof      #464 <Class Character>
	//* 122  272:ifeq            298
		{
			bundle = "char";
	//  123  275:ldc1            #63  <String "char">
	//  124  277:astore_2        
			jsonobject.put("value", ((Object) (obj1.toString())));
	//  125  278:aload           16
	//  126  280:ldc1            #27  <String "value">
	//  127  282:aload           15
	//  128  284:invokevirtual   #468 <Method String Object.toString()>
	//  129  287:invokevirtual   #471 <Method JSONObject JSONObject.put(String, Object)>
	//  130  290:pop             
			obj = ((Object) (s1));
	//  131  291:aload           14
	//  132  293:astore          13
		} else
	//* 133  295:goto            957
		if(obj1 instanceof String)
	//* 134  298:aload           15
	//* 135  300:instanceof      #172 <Class String>
	//* 136  303:ifeq            329
		{
			bundle = "string";
	//  137  306:ldc1            #102 <String "string">
	//  138  308:astore_2        
			jsonobject.put("value", ((Object) ((String)obj1)));
	//  139  309:aload           16
	//  140  311:ldc1            #27  <String "value">
	//  141  313:aload           15
	//  142  315:checkcast       #172 <Class String>
	//  143  318:invokevirtual   #471 <Method JSONObject JSONObject.put(String, Object)>
	//  144  321:pop             
			obj = ((Object) (s1));
	//  145  322:aload           14
	//  146  324:astore          13
		} else
	//* 147  326:goto            957
		if(obj1 instanceof Enum)
	//* 148  329:aload           15
	//* 149  331:instanceof      #320 <Class Enum>
	//* 150  334:ifeq            376
		{
			bundle = "enum";
	//  151  337:ldc1            #75  <String "enum">
	//  152  339:astore_2        
			jsonobject.put("value", ((Object) (obj1.toString())));
	//  153  340:aload           16
	//  154  342:ldc1            #27  <String "value">
	//  155  344:aload           15
	//  156  346:invokevirtual   #468 <Method String Object.toString()>
	//  157  349:invokevirtual   #471 <Method JSONObject JSONObject.put(String, Object)>
	//  158  352:pop             
			jsonobject.put("enumType", ((Object) (obj1.getClass().getName())));
	//  159  353:aload           16
	//  160  355:ldc1            #30  <String "enumType">
	//  161  357:aload           15
	//  162  359:invokevirtual   #475 <Method Class Object.getClass()>
	//  163  362:invokevirtual   #478 <Method String Class.getName()>
	//  164  365:invokevirtual   #471 <Method JSONObject JSONObject.put(String, Object)>
	//  165  368:pop             
			obj = ((Object) (s1));
	//  166  369:aload           14
	//  167  371:astore          13
		} else
	//* 168  373:goto            957
		{
			obj = ((Object) (new JSONArray()));
	//  169  376:new             #191 <Class JSONArray>
	//  170  379:dup             
	//  171  380:invokespecial   #479 <Method void JSONArray()>
	//  172  383:astore          13
			boolean flag6 = obj1 instanceof byte[];
	//  173  385:aload           15
	//  174  387:instanceof      #481 <Class byte[]>
	//  175  390:istore          12
			int i2 = 0;
	//  176  392:iconst_0        
	//  177  393:istore          5
			int l3 = 0;
	//  178  395:iconst_0        
	//  179  396:istore          6
			boolean flag = false;
	//  180  398:iconst_0        
	//  181  399:istore          7
			boolean flag1 = false;
	//  182  401:iconst_0        
	//  183  402:istore          8
			boolean flag2 = false;
	//  184  404:iconst_0        
	//  185  405:istore          9
			boolean flag3 = false;
	//  186  407:iconst_0        
	//  187  408:istore          10
			boolean flag4 = false;
	//  188  410:iconst_0        
	//  189  411:istore          11
			int i = 0;
	//  190  413:iconst_0        
	//  191  414:istore          4
			if(flag6)
	//* 192  416:iload           12
	//* 193  418:ifeq            470
			{
				s1 = "byte[]";
	//  194  421:ldc1            #60  <String "byte[]">
	//  195  423:astore          14
				obj1 = ((Object) ((byte[])obj1));
	//  196  425:aload           15
	//  197  427:checkcast       #481 <Class byte[]>
	//  198  430:astore          15
				i2 = obj1.length;
	//  199  432:aload           15
	//  200  434:arraylength     
	//  201  435:istore          5
				do
				{
					bundle = ((Bundle) (s1));
	//  202  437:aload           14
	//  203  439:astore_2        
					if(i >= i2)
						break;
	//  204  440:iload           4
	//  205  442:iload           5
	//  206  444:icmpge          467
					((JSONArray) (obj)).put(((int) (obj1[i])));
	//  207  447:aload           13
	//  208  449:aload           15
	//  209  451:iload           4
	//  210  453:baload          
	//  211  454:invokevirtual   #484 <Method JSONArray JSONArray.put(int)>
	//  212  457:pop             
					i++;
	//  213  458:iload           4
	//  214  460:iconst_1        
	//  215  461:iadd            
	//  216  462:istore          4
				} while(true);
	//  217  464:goto            437
			} else
	//* 218  467:goto            957
			if(obj1 instanceof short[])
	//* 219  470:aload           15
	//* 220  472:instanceof      #486 <Class short[]>
	//* 221  475:ifeq            528
			{
				s1 = "short[]";
	//  222  478:ldc1            #99  <String "short[]">
	//  223  480:astore          14
				obj1 = ((Object) ((short[])obj1));
	//  224  482:aload           15
	//  225  484:checkcast       #486 <Class short[]>
	//  226  487:astore          15
				l3 = obj1.length;
	//  227  489:aload           15
	//  228  491:arraylength     
	//  229  492:istore          6
				int j = i2;
	//  230  494:iload           5
	//  231  496:istore          4
				do
				{
					bundle = ((Bundle) (s1));
	//  232  498:aload           14
	//  233  500:astore_2        
					if(j >= l3)
						break;
	//  234  501:iload           4
	//  235  503:iload           6
	//  236  505:icmpge          467
					((JSONArray) (obj)).put(((int) (obj1[j])));
	//  237  508:aload           13
	//  238  510:aload           15
	//  239  512:iload           4
	//  240  514:saload          
	//  241  515:invokevirtual   #484 <Method JSONArray JSONArray.put(int)>
	//  242  518:pop             
					j++;
	//  243  519:iload           4
	//  244  521:iconst_1        
	//  245  522:iadd            
	//  246  523:istore          4
				} while(true);
	//  247  525:goto            498
			} else
			if(obj1 instanceof int[])
	//* 248  528:aload           15
	//* 249  530:instanceof      #488 <Class int[]>
	//* 250  533:ifeq            586
			{
				s1 = "int[]";
	//  251  536:ldc1            #87  <String "int[]">
	//  252  538:astore          14
				obj1 = ((Object) ((int[])obj1));
	//  253  540:aload           15
	//  254  542:checkcast       #488 <Class int[]>
	//  255  545:astore          15
				int j2 = obj1.length;
	//  256  547:aload           15
	//  257  549:arraylength     
	//  258  550:istore          5
				int k = l3;
	//  259  552:iload           6
	//  260  554:istore          4
				do
				{
					bundle = ((Bundle) (s1));
	//  261  556:aload           14
	//  262  558:astore_2        
					if(k >= j2)
						break;
	//  263  559:iload           4
	//  264  561:iload           5
	//  265  563:icmpge          467
					((JSONArray) (obj)).put(obj1[k]);
	//  266  566:aload           13
	//  267  568:aload           15
	//  268  570:iload           4
	//  269  572:iaload          
	//  270  573:invokevirtual   #484 <Method JSONArray JSONArray.put(int)>
	//  271  576:pop             
					k++;
	//  272  577:iload           4
	//  273  579:iconst_1        
	//  274  580:iadd            
	//  275  581:istore          4
				} while(true);
	//  276  583:goto            556
			} else
			if(obj1 instanceof long[])
	//* 277  586:aload           15
	//* 278  588:instanceof      #490 <Class long[]>
	//* 279  591:ifeq            644
			{
				s1 = "long[]";
	//  280  594:ldc1            #93  <String "long[]">
	//  281  596:astore          14
				obj1 = ((Object) ((long[])obj1));
	//  282  598:aload           15
	//  283  600:checkcast       #490 <Class long[]>
	//  284  603:astore          15
				int k2 = obj1.length;
	//  285  605:aload           15
	//  286  607:arraylength     
	//  287  608:istore          5
				int l = ((int) (flag));
	//  288  610:iload           7
	//  289  612:istore          4
				do
				{
					bundle = ((Bundle) (s1));
	//  290  614:aload           14
	//  291  616:astore_2        
					if(l >= k2)
						break;
	//  292  617:iload           4
	//  293  619:iload           5
	//  294  621:icmpge          467
					((JSONArray) (obj)).put(obj1[l]);
	//  295  624:aload           13
	//  296  626:aload           15
	//  297  628:iload           4
	//  298  630:laload          
	//  299  631:invokevirtual   #493 <Method JSONArray JSONArray.put(long)>
	//  300  634:pop             
					l++;
	//  301  635:iload           4
	//  302  637:iconst_1        
	//  303  638:iadd            
	//  304  639:istore          4
				} while(true);
	//  305  641:goto            614
			} else
			if(obj1 instanceof float[])
	//* 306  644:aload           15
	//* 307  646:instanceof      #495 <Class float[]>
	//* 308  649:ifeq            703
			{
				s1 = "float[]";
	//  309  652:ldc1            #81  <String "float[]">
	//  310  654:astore          14
				obj1 = ((Object) ((float[])obj1));
	//  311  656:aload           15
	//  312  658:checkcast       #495 <Class float[]>
	//  313  661:astore          15
				int l2 = obj1.length;
	//  314  663:aload           15
	//  315  665:arraylength     
	//  316  666:istore          5
				int i1 = ((int) (flag1));
	//  317  668:iload           8
	//  318  670:istore          4
				do
				{
					bundle = ((Bundle) (s1));
	//  319  672:aload           14
	//  320  674:astore_2        
					if(i1 >= l2)
						break;
	//  321  675:iload           4
	//  322  677:iload           5
	//  323  679:icmpge          467
					((JSONArray) (obj)).put(obj1[i1]);
	//  324  682:aload           13
	//  325  684:aload           15
	//  326  686:iload           4
	//  327  688:faload          
	//  328  689:f2d             
	//  329  690:invokevirtual   #498 <Method JSONArray JSONArray.put(double)>
	//  330  693:pop             
					i1++;
	//  331  694:iload           4
	//  332  696:iconst_1        
	//  333  697:iadd            
	//  334  698:istore          4
				} while(true);
	//  335  700:goto            672
			} else
			if(obj1 instanceof double[])
	//* 336  703:aload           15
	//* 337  705:instanceof      #500 <Class double[]>
	//* 338  708:ifeq            761
			{
				s1 = "double[]";
	//  339  711:ldc1            #72  <String "double[]">
	//  340  713:astore          14
				obj1 = ((Object) ((double[])obj1));
	//  341  715:aload           15
	//  342  717:checkcast       #500 <Class double[]>
	//  343  720:astore          15
				int i3 = obj1.length;
	//  344  722:aload           15
	//  345  724:arraylength     
	//  346  725:istore          5
				int j1 = ((int) (flag2));
	//  347  727:iload           9
	//  348  729:istore          4
				do
				{
					bundle = ((Bundle) (s1));
	//  349  731:aload           14
	//  350  733:astore_2        
					if(j1 >= i3)
						break;
	//  351  734:iload           4
	//  352  736:iload           5
	//  353  738:icmpge          467
					((JSONArray) (obj)).put(obj1[j1]);
	//  354  741:aload           13
	//  355  743:aload           15
	//  356  745:iload           4
	//  357  747:daload          
	//  358  748:invokevirtual   #498 <Method JSONArray JSONArray.put(double)>
	//  359  751:pop             
					j1++;
	//  360  752:iload           4
	//  361  754:iconst_1        
	//  362  755:iadd            
	//  363  756:istore          4
				} while(true);
	//  364  758:goto            731
			} else
			if(obj1 instanceof boolean[])
	//* 365  761:aload           15
	//* 366  763:instanceof      #502 <Class boolean[]>
	//* 367  766:ifeq            819
			{
				s1 = "bool[]";
	//  368  769:ldc1            #54  <String "bool[]">
	//  369  771:astore          14
				obj1 = ((Object) ((boolean[])obj1));
	//  370  773:aload           15
	//  371  775:checkcast       #502 <Class boolean[]>
	//  372  778:astore          15
				int j3 = obj1.length;
	//  373  780:aload           15
	//  374  782:arraylength     
	//  375  783:istore          5
				int k1 = ((int) (flag3));
	//  376  785:iload           10
	//  377  787:istore          4
				do
				{
					bundle = ((Bundle) (s1));
	//  378  789:aload           14
	//  379  791:astore_2        
					if(k1 >= j3)
						break;
	//  380  792:iload           4
	//  381  794:iload           5
	//  382  796:icmpge          467
					((JSONArray) (obj)).put(((boolean) (obj1[k1])));
	//  383  799:aload           13
	//  384  801:aload           15
	//  385  803:iload           4
	//  386  805:baload          
	//  387  806:invokevirtual   #505 <Method JSONArray JSONArray.put(boolean)>
	//  388  809:pop             
					k1++;
	//  389  810:iload           4
	//  390  812:iconst_1        
	//  391  813:iadd            
	//  392  814:istore          4
				} while(true);
	//  393  816:goto            789
			} else
			if(obj1 instanceof char[])
	//* 394  819:aload           15
	//* 395  821:instanceof      #507 <Class char[]>
	//* 396  824:ifeq            880
			{
				s1 = "char[]";
	//  397  827:ldc1            #66  <String "char[]">
	//  398  829:astore          14
				obj1 = ((Object) ((char[])obj1));
	//  399  831:aload           15
	//  400  833:checkcast       #507 <Class char[]>
	//  401  836:astore          15
				int k3 = obj1.length;
	//  402  838:aload           15
	//  403  840:arraylength     
	//  404  841:istore          5
				int l1 = ((int) (flag4));
	//  405  843:iload           11
	//  406  845:istore          4
				do
				{
					bundle = ((Bundle) (s1));
	//  407  847:aload           14
	//  408  849:astore_2        
					if(l1 >= k3)
						break;
	//  409  850:iload           4
	//  410  852:iload           5
	//  411  854:icmpge          467
					((JSONArray) (obj)).put(((Object) (String.valueOf(obj1[l1]))));
	//  412  857:aload           13
	//  413  859:aload           15
	//  414  861:iload           4
	//  415  863:caload          
	//  416  864:invokestatic    #510 <Method String String.valueOf(char)>
	//  417  867:invokevirtual   #513 <Method JSONArray JSONArray.put(Object)>
	//  418  870:pop             
					l1++;
	//  419  871:iload           4
	//  420  873:iconst_1        
	//  421  874:iadd            
	//  422  875:istore          4
				} while(true);
	//  423  877:goto            847
			} else
			if(obj1 instanceof List)
	//* 424  880:aload           15
	//* 425  882:instanceof      #515 <Class List>
	//* 426  885:ifeq            951
			{
				s1 = "stringList";
	//  427  888:ldc1            #105 <String "stringList">
	//  428  890:astore          14
				Iterator iterator = ((List)obj1).iterator();
	//  429  892:aload           15
	//  430  894:checkcast       #515 <Class List>
	//  431  897:invokeinterface #519 <Method Iterator List.iterator()>
	//  432  902:astore          17
				do
				{
					bundle = ((Bundle) (s1));
	//  433  904:aload           14
	//  434  906:astore_2        
					if(!iterator.hasNext())
						break;
	//  435  907:aload           17
	//  436  909:invokeinterface #524 <Method boolean Iterator.hasNext()>
	//  437  914:ifeq            467
					String s2 = (String)iterator.next();
	//  438  917:aload           17
	//  439  919:invokeinterface #528 <Method Object Iterator.next()>
	//  440  924:checkcast       #172 <Class String>
	//  441  927:astore          15
					bundle = ((Bundle) (s2));
	//  442  929:aload           15
	//  443  931:astore_2        
					if(s2 == null)
	//* 444  932:aload           15
	//* 445  934:ifnonnull       941
						bundle = ((Bundle) (JSONObject.NULL));
	//  446  937:getstatic       #304 <Field Object JSONObject.NULL>
	//  447  940:astore_2        
					((JSONArray) (obj)).put(((Object) (bundle)));
	//  448  941:aload           13
	//  449  943:aload_2         
	//  450  944:invokevirtual   #513 <Method JSONArray JSONArray.put(Object)>
	//  451  947:pop             
				} while(true);
	//  452  948:goto            904
			} else
			{
				bundle = null;
	//  453  951:aconst_null     
	//  454  952:astore_2        
				obj = ((Object) (s1));
	//  455  953:aload           14
	//  456  955:astore          13
			}
		}
		if(bundle != null)
	//* 457  957:aload_2         
	//* 458  958:ifnull          998
		{
			jsonobject.put("valueType", ((Object) (bundle)));
	//  459  961:aload           16
	//  460  963:ldc1            #33  <String "valueType">
	//  461  965:aload_2         
	//  462  966:invokevirtual   #471 <Method JSONObject JSONObject.put(String, Object)>
	//  463  969:pop             
			if(obj != null)
	//* 464  970:aload           13
	//* 465  972:ifnull          985
				jsonobject.putOpt("value", obj);
	//  466  975:aload           16
	//  467  977:ldc1            #27  <String "value">
	//  468  979:aload           13
	//  469  981:invokevirtual   #531 <Method JSONObject JSONObject.putOpt(String, Object)>
	//  470  984:pop             
			editor.putString(s, jsonobject.toString());
	//  471  985:aload_3         
	//  472  986:aload_1         
	//  473  987:aload           16
	//  474  989:invokevirtual   #532 <Method String JSONObject.toString()>
	//  475  992:invokeinterface #537 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//  476  997:pop             
		}
	//  477  998:return          
	}

	public void clear()
	{
		cache.edit().clear().apply();
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field SharedPreferences cache>
	//    2    4:invokeinterface #542 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:invokeinterface #544 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//    4   14:invokeinterface #547 <Method void android.content.SharedPreferences$Editor.apply()>
	//    5   19:return          
	}

	public Bundle load()
	{
		Object obj = ((Object) (new Bundle()));
	//    0    0:new             #181 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #550 <Method void Bundle()>
	//    3    7:astore_2        
		Iterator iterator = cache.getAll().keySet().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #146 <Field SharedPreferences cache>
	//    6   12:invokeinterface #554 <Method Map SharedPreferences.getAll()>
	//    7   17:invokeinterface #560 <Method Set Map.keySet()>
	//    8   22:invokeinterface #563 <Method Iterator Set.iterator()>
	//    9   27:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   28:aload_3         
	//   11   29:invokeinterface #524 <Method boolean Iterator.hasNext()>
	//   12   34:ifeq            121
			String s = (String)iterator.next();
	//   13   37:aload_3         
	//   14   38:invokeinterface #528 <Method Object Iterator.next()>
	//   15   43:checkcast       #172 <Class String>
	//   16   46:astore_1        
			try
			{
				deserializeKey(s, ((Bundle) (obj)));
	//   17   47:aload_0         
	//   18   48:aload_1         
	//   19   49:aload_2         
	//   20   50:invokespecial   #565 <Method void deserializeKey(String, Bundle)>
			}
	//*  21   53:goto            28
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  22   56:astore_2        
			{
				LoggingBehavior loggingbehavior = LoggingBehavior.CACHE;
	//   23   57:getstatic       #571 <Field LoggingBehavior LoggingBehavior.CACHE>
	//   24   60:astore_3        
				String s1 = TAG;
	//   25   61:getstatic       #573 <Field String TAG>
	//   26   64:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   27   66:new             #575 <Class StringBuilder>
	//   28   69:dup             
	//   29   70:invokespecial   #576 <Method void StringBuilder()>
	//   30   73:astore          5
				stringbuilder.append("Error reading cached value for key: '");
	//   31   75:aload           5
	//   32   77:ldc2            #578 <String "Error reading cached value for key: '">
	//   33   80:invokevirtual   #582 <Method StringBuilder StringBuilder.append(String)>
	//   34   83:pop             
				stringbuilder.append(s);
	//   35   84:aload           5
	//   36   86:aload_1         
	//   37   87:invokevirtual   #582 <Method StringBuilder StringBuilder.append(String)>
	//   38   90:pop             
				stringbuilder.append("' -- ");
	//   39   91:aload           5
	//   40   93:ldc2            #584 <String "' -- ">
	//   41   96:invokevirtual   #582 <Method StringBuilder StringBuilder.append(String)>
	//   42   99:pop             
				stringbuilder.append(obj);
	//   43  100:aload           5
	//   44  102:aload_2         
	//   45  103:invokevirtual   #587 <Method StringBuilder StringBuilder.append(Object)>
	//   46  106:pop             
				Logger.log(loggingbehavior, 5, s1, stringbuilder.toString());
	//   47  107:aload_3         
	//   48  108:iconst_5        
	//   49  109:aload           4
	//   50  111:aload           5
	//   51  113:invokevirtual   #588 <Method String StringBuilder.toString()>
	//   52  116:invokestatic    #594 <Method void Logger.log(LoggingBehavior, int, String, String)>
				return null;
	//   53  119:aconst_null     
	//   54  120:areturn         
			}
		} while(true);
		return ((Bundle) (obj));
	//   55  121:aload_2         
	//   56  122:areturn         
	}

	public void save(Bundle bundle)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_1         
	//    1    1:ldc2            #333 <String "bundle">
	//    2    4:invokestatic    #126 <Method void Validate.notNull(Object, String)>
		Object obj = ((Object) (cache.edit()));
	//    3    7:aload_0         
	//    4    8:getfield        #146 <Field SharedPreferences cache>
	//    5   11:invokeinterface #542 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   16:astore_3        
		Iterator iterator = bundle.keySet().iterator();
	//    7   17:aload_1         
	//    8   18:invokevirtual   #597 <Method Set Bundle.keySet()>
	//    9   21:invokeinterface #563 <Method Iterator Set.iterator()>
	//   10   26:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   11   28:aload           4
	//   12   30:invokeinterface #524 <Method boolean Iterator.hasNext()>
	//   13   35:ifeq            123
			String s = (String)iterator.next();
	//   14   38:aload           4
	//   15   40:invokeinterface #528 <Method Object Iterator.next()>
	//   16   45:checkcast       #172 <Class String>
	//   17   48:astore_2        
			try
			{
				serializeKey(s, bundle, ((android.content.SharedPreferences.Editor) (obj)));
	//   18   49:aload_0         
	//   19   50:aload_2         
	//   20   51:aload_1         
	//   21   52:aload_3         
	//   22   53:invokespecial   #599 <Method void serializeKey(String, Bundle, android.content.SharedPreferences$Editor)>
			}
	//*  23   56:goto            28
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
	//*  24   59:astore_1        
			{
				obj = ((Object) (LoggingBehavior.CACHE));
	//   25   60:getstatic       #571 <Field LoggingBehavior LoggingBehavior.CACHE>
	//   26   63:astore_3        
				String s1 = TAG;
	//   27   64:getstatic       #573 <Field String TAG>
	//   28   67:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   29   69:new             #575 <Class StringBuilder>
	//   30   72:dup             
	//   31   73:invokespecial   #576 <Method void StringBuilder()>
	//   32   76:astore          5
				stringbuilder.append("Error processing value for key: '");
	//   33   78:aload           5
	//   34   80:ldc2            #601 <String "Error processing value for key: '">
	//   35   83:invokevirtual   #582 <Method StringBuilder StringBuilder.append(String)>
	//   36   86:pop             
				stringbuilder.append(s);
	//   37   87:aload           5
	//   38   89:aload_2         
	//   39   90:invokevirtual   #582 <Method StringBuilder StringBuilder.append(String)>
	//   40   93:pop             
				stringbuilder.append("' -- ");
	//   41   94:aload           5
	//   42   96:ldc2            #584 <String "' -- ">
	//   43   99:invokevirtual   #582 <Method StringBuilder StringBuilder.append(String)>
	//   44  102:pop             
				stringbuilder.append(((Object) (bundle)));
	//   45  103:aload           5
	//   46  105:aload_1         
	//   47  106:invokevirtual   #587 <Method StringBuilder StringBuilder.append(Object)>
	//   48  109:pop             
				Logger.log(((LoggingBehavior) (obj)), 5, s1, stringbuilder.toString());
	//   49  110:aload_3         
	//   50  111:iconst_5        
	//   51  112:aload           4
	//   52  114:aload           5
	//   53  116:invokevirtual   #588 <Method String StringBuilder.toString()>
	//   54  119:invokestatic    #594 <Method void Logger.log(LoggingBehavior, int, String, String)>
				return;
	//   55  122:return          
			}
		} while(true);
		((android.content.SharedPreferences.Editor) (obj)).apply();
	//   56  123:aload_3         
	//   57  124:invokeinterface #547 <Method void android.content.SharedPreferences$Editor.apply()>
	//   58  129:return          
	}

	public static final String APPLICATION_ID_KEY = "com.facebook.TokenCachingStrategy.ApplicationId";
	public static final String DECLINED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.DeclinedPermissions";
	public static final String DEFAULT_CACHE_KEY = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
	public static final String EXPIRATION_DATE_KEY = "com.facebook.TokenCachingStrategy.ExpirationDate";
	private static final long INVALID_BUNDLE_MILLISECONDS = 0x0L;
	private static final String IS_SSO_KEY = "com.facebook.TokenCachingStrategy.IsSSO";
	private static final String JSON_VALUE = "value";
	private static final String JSON_VALUE_ENUM_TYPE = "enumType";
	private static final String JSON_VALUE_TYPE = "valueType";
	public static final String LAST_REFRESH_DATE_KEY = "com.facebook.TokenCachingStrategy.LastRefreshDate";
	public static final String PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.Permissions";
	private static final String TAG = "LegacyTokenHelper";
	public static final String TOKEN_KEY = "com.facebook.TokenCachingStrategy.Token";
	public static final String TOKEN_SOURCE_KEY = "com.facebook.TokenCachingStrategy.AccessTokenSource";
	private static final String TYPE_BOOLEAN = "bool";
	private static final String TYPE_BOOLEAN_ARRAY = "bool[]";
	private static final String TYPE_BYTE = "byte";
	private static final String TYPE_BYTE_ARRAY = "byte[]";
	private static final String TYPE_CHAR = "char";
	private static final String TYPE_CHAR_ARRAY = "char[]";
	private static final String TYPE_DOUBLE = "double";
	private static final String TYPE_DOUBLE_ARRAY = "double[]";
	private static final String TYPE_ENUM = "enum";
	private static final String TYPE_FLOAT = "float";
	private static final String TYPE_FLOAT_ARRAY = "float[]";
	private static final String TYPE_INTEGER = "int";
	private static final String TYPE_INTEGER_ARRAY = "int[]";
	private static final String TYPE_LONG = "long";
	private static final String TYPE_LONG_ARRAY = "long[]";
	private static final String TYPE_SHORT = "short";
	private static final String TYPE_SHORT_ARRAY = "short[]";
	private static final String TYPE_STRING = "string";
	private static final String TYPE_STRING_LIST = "stringList";
	private SharedPreferences cache;
	private String cacheKey;

	static 
	{
	//    0    0:return          
	}
}
