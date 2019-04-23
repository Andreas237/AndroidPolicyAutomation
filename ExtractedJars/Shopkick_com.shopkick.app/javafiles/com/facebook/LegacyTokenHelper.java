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
	//    3    5:astore          14
		if(obj1 == null)
	//*   4    7:aload           14
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		JSONObject jsonobject = new JSONObject();
	//    7   13:new             #156 <Class JSONObject>
	//    8   16:dup             
	//    9   17:invokespecial   #418 <Method void JSONObject()>
	//   10   20:astore          15
		boolean flag5 = obj1 instanceof Byte;
	//   11   22:aload           14
	//   12   24:instanceof      #420 <Class Byte>
	//   13   27:istore          12
		Object obj = null;
	//   14   29:aconst_null     
	//   15   30:astore          13
		if(flag5)
	//*  16   32:iload           12
	//*  17   34:ifeq            59
		{
			bundle = "byte";
	//   18   37:ldc1            #57  <String "byte">
	//   19   39:astore_2        
			jsonobject.put("value", ((Byte)obj1).intValue());
	//   20   40:aload           15
	//   21   42:ldc1            #27  <String "value">
	//   22   44:aload           14
	//   23   46:checkcast       #420 <Class Byte>
	//   24   49:invokevirtual   #423 <Method int Byte.intValue()>
	//   25   52:invokevirtual   #427 <Method JSONObject JSONObject.put(String, int)>
	//   26   55:pop             
		} else
	//*  27   56:goto            921
		if(obj1 instanceof Short)
	//*  28   59:aload           14
	//*  29   61:instanceof      #429 <Class Short>
	//*  30   64:ifeq            89
		{
			bundle = "short";
	//   31   67:ldc1            #96  <String "short">
	//   32   69:astore_2        
			jsonobject.put("value", ((Short)obj1).intValue());
	//   33   70:aload           15
	//   34   72:ldc1            #27  <String "value">
	//   35   74:aload           14
	//   36   76:checkcast       #429 <Class Short>
	//   37   79:invokevirtual   #430 <Method int Short.intValue()>
	//   38   82:invokevirtual   #427 <Method JSONObject JSONObject.put(String, int)>
	//   39   85:pop             
		} else
	//*  40   86:goto            921
		if(obj1 instanceof Integer)
	//*  41   89:aload           14
	//*  42   91:instanceof      #432 <Class Integer>
	//*  43   94:ifeq            119
		{
			bundle = "int";
	//   44   97:ldc1            #84  <String "int">
	//   45   99:astore_2        
			jsonobject.put("value", ((Integer)obj1).intValue());
	//   46  100:aload           15
	//   47  102:ldc1            #27  <String "value">
	//   48  104:aload           14
	//   49  106:checkcast       #432 <Class Integer>
	//   50  109:invokevirtual   #433 <Method int Integer.intValue()>
	//   51  112:invokevirtual   #427 <Method JSONObject JSONObject.put(String, int)>
	//   52  115:pop             
		} else
	//*  53  116:goto            921
		if(obj1 instanceof Long)
	//*  54  119:aload           14
	//*  55  121:instanceof      #435 <Class Long>
	//*  56  124:ifeq            149
		{
			bundle = "long";
	//   57  127:ldc1            #90  <String "long">
	//   58  129:astore_2        
			jsonobject.put("value", ((Long)obj1).longValue());
	//   59  130:aload           15
	//   60  132:ldc1            #27  <String "value">
	//   61  134:aload           14
	//   62  136:checkcast       #435 <Class Long>
	//   63  139:invokevirtual   #438 <Method long Long.longValue()>
	//   64  142:invokevirtual   #441 <Method JSONObject JSONObject.put(String, long)>
	//   65  145:pop             
		} else
	//*  66  146:goto            921
		if(obj1 instanceof Float)
	//*  67  149:aload           14
	//*  68  151:instanceof      #443 <Class Float>
	//*  69  154:ifeq            179
		{
			bundle = "float";
	//   70  157:ldc1            #78  <String "float">
	//   71  159:astore_2        
			jsonobject.put("value", ((Float)obj1).doubleValue());
	//   72  160:aload           15
	//   73  162:ldc1            #27  <String "value">
	//   74  164:aload           14
	//   75  166:checkcast       #443 <Class Float>
	//   76  169:invokevirtual   #447 <Method double Float.doubleValue()>
	//   77  172:invokevirtual   #450 <Method JSONObject JSONObject.put(String, double)>
	//   78  175:pop             
		} else
	//*  79  176:goto            921
		if(obj1 instanceof Double)
	//*  80  179:aload           14
	//*  81  181:instanceof      #452 <Class Double>
	//*  82  184:ifeq            209
		{
			bundle = "double";
	//   83  187:ldc1            #69  <String "double">
	//   84  189:astore_2        
			jsonobject.put("value", ((Double)obj1).doubleValue());
	//   85  190:aload           15
	//   86  192:ldc1            #27  <String "value">
	//   87  194:aload           14
	//   88  196:checkcast       #452 <Class Double>
	//   89  199:invokevirtual   #453 <Method double Double.doubleValue()>
	//   90  202:invokevirtual   #450 <Method JSONObject JSONObject.put(String, double)>
	//   91  205:pop             
		} else
	//*  92  206:goto            921
		if(obj1 instanceof Boolean)
	//*  93  209:aload           14
	//*  94  211:instanceof      #455 <Class Boolean>
	//*  95  214:ifeq            239
		{
			bundle = "bool";
	//   96  217:ldc1            #51  <String "bool">
	//   97  219:astore_2        
			jsonobject.put("value", ((Boolean)obj1).booleanValue());
	//   98  220:aload           15
	//   99  222:ldc1            #27  <String "value">
	//  100  224:aload           14
	//  101  226:checkcast       #455 <Class Boolean>
	//  102  229:invokevirtual   #459 <Method boolean Boolean.booleanValue()>
	//  103  232:invokevirtual   #462 <Method JSONObject JSONObject.put(String, boolean)>
	//  104  235:pop             
		} else
	//* 105  236:goto            921
		if(obj1 instanceof Character)
	//* 106  239:aload           14
	//* 107  241:instanceof      #464 <Class Character>
	//* 108  244:ifeq            266
		{
			bundle = "char";
	//  109  247:ldc1            #63  <String "char">
	//  110  249:astore_2        
			jsonobject.put("value", ((Object) (obj1.toString())));
	//  111  250:aload           15
	//  112  252:ldc1            #27  <String "value">
	//  113  254:aload           14
	//  114  256:invokevirtual   #468 <Method String Object.toString()>
	//  115  259:invokevirtual   #471 <Method JSONObject JSONObject.put(String, Object)>
	//  116  262:pop             
		} else
	//* 117  263:goto            921
		if(obj1 instanceof String)
	//* 118  266:aload           14
	//* 119  268:instanceof      #172 <Class String>
	//* 120  271:ifeq            293
		{
			bundle = "string";
	//  121  274:ldc1            #102 <String "string">
	//  122  276:astore_2        
			jsonobject.put("value", ((Object) ((String)obj1)));
	//  123  277:aload           15
	//  124  279:ldc1            #27  <String "value">
	//  125  281:aload           14
	//  126  283:checkcast       #172 <Class String>
	//  127  286:invokevirtual   #471 <Method JSONObject JSONObject.put(String, Object)>
	//  128  289:pop             
		} else
	//* 129  290:goto            921
		if(obj1 instanceof Enum)
	//* 130  293:aload           14
	//* 131  295:instanceof      #320 <Class Enum>
	//* 132  298:ifeq            336
		{
			bundle = "enum";
	//  133  301:ldc1            #75  <String "enum">
	//  134  303:astore_2        
			jsonobject.put("value", ((Object) (obj1.toString())));
	//  135  304:aload           15
	//  136  306:ldc1            #27  <String "value">
	//  137  308:aload           14
	//  138  310:invokevirtual   #468 <Method String Object.toString()>
	//  139  313:invokevirtual   #471 <Method JSONObject JSONObject.put(String, Object)>
	//  140  316:pop             
			jsonobject.put("enumType", ((Object) (obj1.getClass().getName())));
	//  141  317:aload           15
	//  142  319:ldc1            #30  <String "enumType">
	//  143  321:aload           14
	//  144  323:invokevirtual   #475 <Method Class Object.getClass()>
	//  145  326:invokevirtual   #478 <Method String Class.getName()>
	//  146  329:invokevirtual   #471 <Method JSONObject JSONObject.put(String, Object)>
	//  147  332:pop             
		} else
	//* 148  333:goto            921
		{
			bundle = ((Bundle) (new JSONArray()));
	//  149  336:new             #191 <Class JSONArray>
	//  150  339:dup             
	//  151  340:invokespecial   #479 <Method void JSONArray()>
	//  152  343:astore_2        
			boolean flag6 = obj1 instanceof byte[];
	//  153  344:aload           14
	//  154  346:instanceof      #481 <Class byte[]>
	//  155  349:istore          12
			int i2 = 0;
	//  156  351:iconst_0        
	//  157  352:istore          5
			int l3 = 0;
	//  158  354:iconst_0        
	//  159  355:istore          6
			boolean flag = false;
	//  160  357:iconst_0        
	//  161  358:istore          7
			boolean flag1 = false;
	//  162  360:iconst_0        
	//  163  361:istore          8
			boolean flag2 = false;
	//  164  363:iconst_0        
	//  165  364:istore          9
			boolean flag3 = false;
	//  166  366:iconst_0        
	//  167  367:istore          10
			boolean flag4 = false;
	//  168  369:iconst_0        
	//  169  370:istore          11
			int i = 0;
	//  170  372:iconst_0        
	//  171  373:istore          4
			if(flag6)
	//* 172  375:iload           12
	//* 173  377:ifeq            427
			{
				obj = ((Object) ((byte[])obj1));
	//  174  380:aload           14
	//  175  382:checkcast       #481 <Class byte[]>
	//  176  385:astore          13
				for(i2 = obj.length; i < i2; i++)
	//* 177  387:aload           13
	//* 178  389:arraylength     
	//* 179  390:istore          5
	//* 180  392:iload           4
	//* 181  394:iload           5
	//* 182  396:icmpge          418
					((JSONArray) (bundle)).put(((int) (obj[i])));
	//  183  399:aload_2         
	//  184  400:aload           13
	//  185  402:iload           4
	//  186  404:baload          
	//  187  405:invokevirtual   #484 <Method JSONArray JSONArray.put(int)>
	//  188  408:pop             

	//  189  409:iload           4
	//  190  411:iconst_1        
	//  191  412:iadd            
	//  192  413:istore          4
	//* 193  415:goto            392
				obj = ((Object) (bundle));
	//  194  418:aload_2         
	//  195  419:astore          13
				bundle = "byte[]";
	//  196  421:ldc1            #60  <String "byte[]">
	//  197  423:astore_2        
			} else
	//* 198  424:goto            921
			if(obj1 instanceof short[])
	//* 199  427:aload           14
	//* 200  429:instanceof      #486 <Class short[]>
	//* 201  432:ifeq            486
			{
				obj = ((Object) ((short[])obj1));
	//  202  435:aload           14
	//  203  437:checkcast       #486 <Class short[]>
	//  204  440:astore          13
				l3 = obj.length;
	//  205  442:aload           13
	//  206  444:arraylength     
	//  207  445:istore          6
				for(int j = i2; j < l3; j++)
	//* 208  447:iload           5
	//* 209  449:istore          4
	//* 210  451:iload           4
	//* 211  453:iload           6
	//* 212  455:icmpge          477
					((JSONArray) (bundle)).put(((int) (obj[j])));
	//  213  458:aload_2         
	//  214  459:aload           13
	//  215  461:iload           4
	//  216  463:saload          
	//  217  464:invokevirtual   #484 <Method JSONArray JSONArray.put(int)>
	//  218  467:pop             

	//  219  468:iload           4
	//  220  470:iconst_1        
	//  221  471:iadd            
	//  222  472:istore          4
	//* 223  474:goto            451
				obj = ((Object) (bundle));
	//  224  477:aload_2         
	//  225  478:astore          13
				bundle = "short[]";
	//  226  480:ldc1            #99  <String "short[]">
	//  227  482:astore_2        
			} else
	//* 228  483:goto            921
			if(obj1 instanceof int[])
	//* 229  486:aload           14
	//* 230  488:instanceof      #488 <Class int[]>
	//* 231  491:ifeq            545
			{
				obj = ((Object) ((int[])obj1));
	//  232  494:aload           14
	//  233  496:checkcast       #488 <Class int[]>
	//  234  499:astore          13
				int j2 = obj.length;
	//  235  501:aload           13
	//  236  503:arraylength     
	//  237  504:istore          5
				for(int k = l3; k < j2; k++)
	//* 238  506:iload           6
	//* 239  508:istore          4
	//* 240  510:iload           4
	//* 241  512:iload           5
	//* 242  514:icmpge          536
					((JSONArray) (bundle)).put(obj[k]);
	//  243  517:aload_2         
	//  244  518:aload           13
	//  245  520:iload           4
	//  246  522:iaload          
	//  247  523:invokevirtual   #484 <Method JSONArray JSONArray.put(int)>
	//  248  526:pop             

	//  249  527:iload           4
	//  250  529:iconst_1        
	//  251  530:iadd            
	//  252  531:istore          4
	//* 253  533:goto            510
				obj = ((Object) (bundle));
	//  254  536:aload_2         
	//  255  537:astore          13
				bundle = "int[]";
	//  256  539:ldc1            #87  <String "int[]">
	//  257  541:astore_2        
			} else
	//* 258  542:goto            921
			if(obj1 instanceof long[])
	//* 259  545:aload           14
	//* 260  547:instanceof      #490 <Class long[]>
	//* 261  550:ifeq            604
			{
				obj = ((Object) ((long[])obj1));
	//  262  553:aload           14
	//  263  555:checkcast       #490 <Class long[]>
	//  264  558:astore          13
				int k2 = obj.length;
	//  265  560:aload           13
	//  266  562:arraylength     
	//  267  563:istore          5
				for(int l = ((int) (flag)); l < k2; l++)
	//* 268  565:iload           7
	//* 269  567:istore          4
	//* 270  569:iload           4
	//* 271  571:iload           5
	//* 272  573:icmpge          595
					((JSONArray) (bundle)).put(obj[l]);
	//  273  576:aload_2         
	//  274  577:aload           13
	//  275  579:iload           4
	//  276  581:laload          
	//  277  582:invokevirtual   #493 <Method JSONArray JSONArray.put(long)>
	//  278  585:pop             

	//  279  586:iload           4
	//  280  588:iconst_1        
	//  281  589:iadd            
	//  282  590:istore          4
	//* 283  592:goto            569
				obj = ((Object) (bundle));
	//  284  595:aload_2         
	//  285  596:astore          13
				bundle = "long[]";
	//  286  598:ldc1            #93  <String "long[]">
	//  287  600:astore_2        
			} else
	//* 288  601:goto            921
			if(obj1 instanceof float[])
	//* 289  604:aload           14
	//* 290  606:instanceof      #495 <Class float[]>
	//* 291  609:ifeq            664
			{
				obj = ((Object) ((float[])obj1));
	//  292  612:aload           14
	//  293  614:checkcast       #495 <Class float[]>
	//  294  617:astore          13
				int l2 = obj.length;
	//  295  619:aload           13
	//  296  621:arraylength     
	//  297  622:istore          5
				for(int i1 = ((int) (flag1)); i1 < l2; i1++)
	//* 298  624:iload           8
	//* 299  626:istore          4
	//* 300  628:iload           4
	//* 301  630:iload           5
	//* 302  632:icmpge          655
					((JSONArray) (bundle)).put(obj[i1]);
	//  303  635:aload_2         
	//  304  636:aload           13
	//  305  638:iload           4
	//  306  640:faload          
	//  307  641:f2d             
	//  308  642:invokevirtual   #498 <Method JSONArray JSONArray.put(double)>
	//  309  645:pop             

	//  310  646:iload           4
	//  311  648:iconst_1        
	//  312  649:iadd            
	//  313  650:istore          4
	//* 314  652:goto            628
				obj = ((Object) (bundle));
	//  315  655:aload_2         
	//  316  656:astore          13
				bundle = "float[]";
	//  317  658:ldc1            #81  <String "float[]">
	//  318  660:astore_2        
			} else
	//* 319  661:goto            921
			if(obj1 instanceof double[])
	//* 320  664:aload           14
	//* 321  666:instanceof      #500 <Class double[]>
	//* 322  669:ifeq            723
			{
				obj = ((Object) ((double[])obj1));
	//  323  672:aload           14
	//  324  674:checkcast       #500 <Class double[]>
	//  325  677:astore          13
				int i3 = obj.length;
	//  326  679:aload           13
	//  327  681:arraylength     
	//  328  682:istore          5
				for(int j1 = ((int) (flag2)); j1 < i3; j1++)
	//* 329  684:iload           9
	//* 330  686:istore          4
	//* 331  688:iload           4
	//* 332  690:iload           5
	//* 333  692:icmpge          714
					((JSONArray) (bundle)).put(obj[j1]);
	//  334  695:aload_2         
	//  335  696:aload           13
	//  336  698:iload           4
	//  337  700:daload          
	//  338  701:invokevirtual   #498 <Method JSONArray JSONArray.put(double)>
	//  339  704:pop             

	//  340  705:iload           4
	//  341  707:iconst_1        
	//  342  708:iadd            
	//  343  709:istore          4
	//* 344  711:goto            688
				obj = ((Object) (bundle));
	//  345  714:aload_2         
	//  346  715:astore          13
				bundle = "double[]";
	//  347  717:ldc1            #72  <String "double[]">
	//  348  719:astore_2        
			} else
	//* 349  720:goto            921
			if(obj1 instanceof boolean[])
	//* 350  723:aload           14
	//* 351  725:instanceof      #502 <Class boolean[]>
	//* 352  728:ifeq            782
			{
				obj = ((Object) ((boolean[])obj1));
	//  353  731:aload           14
	//  354  733:checkcast       #502 <Class boolean[]>
	//  355  736:astore          13
				int j3 = obj.length;
	//  356  738:aload           13
	//  357  740:arraylength     
	//  358  741:istore          5
				for(int k1 = ((int) (flag3)); k1 < j3; k1++)
	//* 359  743:iload           10
	//* 360  745:istore          4
	//* 361  747:iload           4
	//* 362  749:iload           5
	//* 363  751:icmpge          773
					((JSONArray) (bundle)).put(((boolean) (obj[k1])));
	//  364  754:aload_2         
	//  365  755:aload           13
	//  366  757:iload           4
	//  367  759:baload          
	//  368  760:invokevirtual   #505 <Method JSONArray JSONArray.put(boolean)>
	//  369  763:pop             

	//  370  764:iload           4
	//  371  766:iconst_1        
	//  372  767:iadd            
	//  373  768:istore          4
	//* 374  770:goto            747
				obj = ((Object) (bundle));
	//  375  773:aload_2         
	//  376  774:astore          13
				bundle = "bool[]";
	//  377  776:ldc1            #54  <String "bool[]">
	//  378  778:astore_2        
			} else
	//* 379  779:goto            921
			if(obj1 instanceof char[])
	//* 380  782:aload           14
	//* 381  784:instanceof      #507 <Class char[]>
	//* 382  787:ifeq            844
			{
				obj = ((Object) ((char[])obj1));
	//  383  790:aload           14
	//  384  792:checkcast       #507 <Class char[]>
	//  385  795:astore          13
				int k3 = obj.length;
	//  386  797:aload           13
	//  387  799:arraylength     
	//  388  800:istore          5
				for(int l1 = ((int) (flag4)); l1 < k3; l1++)
	//* 389  802:iload           11
	//* 390  804:istore          4
	//* 391  806:iload           4
	//* 392  808:iload           5
	//* 393  810:icmpge          835
					((JSONArray) (bundle)).put(((Object) (String.valueOf(obj[l1]))));
	//  394  813:aload_2         
	//  395  814:aload           13
	//  396  816:iload           4
	//  397  818:caload          
	//  398  819:invokestatic    #510 <Method String String.valueOf(char)>
	//  399  822:invokevirtual   #513 <Method JSONArray JSONArray.put(Object)>
	//  400  825:pop             

	//  401  826:iload           4
	//  402  828:iconst_1        
	//  403  829:iadd            
	//  404  830:istore          4
	//* 405  832:goto            806
				obj = ((Object) (bundle));
	//  406  835:aload_2         
	//  407  836:astore          13
				bundle = "char[]";
	//  408  838:ldc1            #66  <String "char[]">
	//  409  840:astore_2        
			} else
	//* 410  841:goto            921
			if(obj1 instanceof List)
	//* 411  844:aload           14
	//* 412  846:instanceof      #515 <Class List>
	//* 413  849:ifeq            919
			{
				for(Iterator iterator = ((List)obj1).iterator(); iterator.hasNext(); ((JSONArray) (bundle)).put(obj))
	//* 414  852:aload           14
	//* 415  854:checkcast       #515 <Class List>
	//* 416  857:invokeinterface #519 <Method Iterator List.iterator()>
	//* 417  862:astore          16
	//* 418  864:aload           16
	//* 419  866:invokeinterface #524 <Method boolean Iterator.hasNext()>
	//* 420  871:ifeq            910
				{
					String s1 = (String)iterator.next();
	//  421  874:aload           16
	//  422  876:invokeinterface #528 <Method Object Iterator.next()>
	//  423  881:checkcast       #172 <Class String>
	//  424  884:astore          14
					obj = ((Object) (s1));
	//  425  886:aload           14
	//  426  888:astore          13
					if(s1 == null)
	//* 427  890:aload           14
	//* 428  892:ifnonnull       900
						obj = JSONObject.NULL;
	//  429  895:getstatic       #304 <Field Object JSONObject.NULL>
	//  430  898:astore          13
				}

	//  431  900:aload_2         
	//  432  901:aload           13
	//  433  903:invokevirtual   #513 <Method JSONArray JSONArray.put(Object)>
	//  434  906:pop             
	//* 435  907:goto            864
				obj = ((Object) (bundle));
	//  436  910:aload_2         
	//  437  911:astore          13
				bundle = "stringList";
	//  438  913:ldc1            #105 <String "stringList">
	//  439  915:astore_2        
			} else
	//* 440  916:goto            921
			{
				bundle = null;
	//  441  919:aconst_null     
	//  442  920:astore_2        
			}
		}
		if(bundle != null)
	//* 443  921:aload_2         
	//* 444  922:ifnull          962
		{
			jsonobject.put("valueType", ((Object) (bundle)));
	//  445  925:aload           15
	//  446  927:ldc1            #33  <String "valueType">
	//  447  929:aload_2         
	//  448  930:invokevirtual   #471 <Method JSONObject JSONObject.put(String, Object)>
	//  449  933:pop             
			if(obj != null)
	//* 450  934:aload           13
	//* 451  936:ifnull          949
				jsonobject.putOpt("value", obj);
	//  452  939:aload           15
	//  453  941:ldc1            #27  <String "value">
	//  454  943:aload           13
	//  455  945:invokevirtual   #531 <Method JSONObject JSONObject.putOpt(String, Object)>
	//  456  948:pop             
			editor.putString(s, jsonobject.toString());
	//  457  949:aload_3         
	//  458  950:aload_1         
	//  459  951:aload           15
	//  460  953:invokevirtual   #532 <Method String JSONObject.toString()>
	//  461  956:invokeinterface #537 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//  462  961:pop             
		}
	//  463  962:return          
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
