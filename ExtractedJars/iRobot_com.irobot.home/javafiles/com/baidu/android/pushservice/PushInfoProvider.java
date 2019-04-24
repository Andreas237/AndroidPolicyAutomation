// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.content.*;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.h.q;
import com.baidu.android.pushservice.h.u;

public class PushInfoProvider extends ContentProvider
{

	public PushInfoProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void ContentProvider()>
	//    2    4:return          
	}

	public int delete(Uri uri, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getType(Uri uri)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean onCreate()
	{
		c = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method Context getContext()>
	//    2    4:putstatic       #44  <Field Context c>
		Object obj;
		if(u.I(c))
	//*   3    7:getstatic       #44  <Field Context c>
	//*   4   10:invokestatic    #50  <Method boolean u.I(Context)>
	//*   5   13:ifeq            22
			obj = "pushinfo_v3";
	//    6   16:ldc1            #52  <String "pushinfo_v3">
	//    7   18:astore_1        
		else
	//*   8   19:goto            25
			obj = "pushinfo";
	//    9   22:ldc1            #54  <String "pushinfo">
	//   10   24:astore_1        
		Object obj1 = ((Object) (d));
	//   11   25:getstatic       #28  <Field UriMatcher d>
	//   12   28:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   13   29:new             #56  <Class StringBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #57  <Method void StringBuilder()>
	//   16   36:astore_3        
		stringbuilder.append(c.getPackageName());
	//   17   37:aload_3         
	//   18   38:getstatic       #44  <Field Context c>
	//   19   41:invokevirtual   #63  <Method String Context.getPackageName()>
	//   20   44:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   21   47:pop             
		stringbuilder.append(".bdpush");
	//   22   48:aload_3         
	//   23   49:ldc1            #69  <String ".bdpush">
	//   24   51:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:pop             
		((UriMatcher) (obj1)).addURI(stringbuilder.toString(), ((String) (obj)), 1);
	//   26   55:aload_2         
	//   27   56:aload_3         
	//   28   57:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   29   60:aload_1         
	//   30   61:iconst_1        
	//   31   62:invokevirtual   #76  <Method void UriMatcher.addURI(String, String, int)>
		obj = ((Object) (d));
	//   32   65:getstatic       #28  <Field UriMatcher d>
	//   33   68:astore_1        
		obj1 = ((Object) (new StringBuilder()));
	//   34   69:new             #56  <Class StringBuilder>
	//   35   72:dup             
	//   36   73:invokespecial   #57  <Method void StringBuilder()>
	//   37   76:astore_2        
		((StringBuilder) (obj1)).append(c.getPackageName());
	//   38   77:aload_2         
	//   39   78:getstatic       #44  <Field Context c>
	//   40   81:invokevirtual   #63  <Method String Context.getPackageName()>
	//   41   84:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   42   87:pop             
		((StringBuilder) (obj1)).append(".bdpush");
	//   43   88:aload_2         
	//   44   89:ldc1            #69  <String ".bdpush">
	//   45   91:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   46   94:pop             
		((UriMatcher) (obj)).addURI(((StringBuilder) (obj1)).toString(), "verif", 2);
	//   47   95:aload_1         
	//   48   96:aload_2         
	//   49   97:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   50  100:ldc1            #78  <String "verif">
	//   51  102:iconst_2        
	//   52  103:invokevirtual   #76  <Method void UriMatcher.addURI(String, String, int)>
		return true;
	//   53  106:iconst_1        
	//   54  107:ireturn         
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		Object obj = b;
	//    0    0:getstatic       #21  <Field Object b>
	//    1    3:astore          6
		obj;
	//    2    5:aload           6
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		d.match(uri);
	//    4    8:getstatic       #28  <Field UriMatcher d>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #86  <Method int UriMatcher.match(Uri)>
		JVM INSTR tableswitch 1 2: default 239
	//	               1 124
	//	               2 36;
	//    7   15:tableswitch     1 2: default 239
	//	               1 124
	//	               2 36
		   goto _L1 _L2 _L3
_L3:
		a = q.a(c);
	//    8   36:aload_0         
	//    9   37:getstatic       #44  <Field Context c>
	//   10   40:invokestatic    #91  <Method SQLiteDatabase q.a(Context)>
	//   11   43:putfield        #93  <Field SQLiteDatabase a>
		if(a == null) goto _L5; else goto _L4
	//   12   46:aload_0         
	//   13   47:getfield        #93  <Field SQLiteDatabase a>
	//   14   50:ifnull          211
_L4:
		as = ((String []) (a.query("PushVerifInfo", as, s, as1, ((String) (null)), ((String) (null)), s1)));
	//   15   53:aload_0         
	//   16   54:getfield        #93  <Field SQLiteDatabase a>
	//   17   57:ldc1            #95  <String "PushVerifInfo">
	//   18   59:aload_2         
	//   19   60:aload_3         
	//   20   61:aload           4
	//   21   63:aconst_null     
	//   22   64:aconst_null     
	//   23   65:aload           5
	//   24   67:invokevirtual   #100 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   25   70:astore_2        
		uri = ((Uri) (as));
	//   26   71:aload_2         
	//   27   72:astore_1        
		if(as == null) goto _L7; else goto _L6
	//   28   73:aload_2         
	//   29   74:ifnull          229
_L6:
		uri = ((Uri) (as));
	//   30   77:aload_2         
	//   31   78:astore_1        
		s = ((String) (new StringBuilder()));
	//   32   79:new             #56  <Class StringBuilder>
	//   33   82:dup             
	//   34   83:invokespecial   #57  <Method void StringBuilder()>
	//   35   86:astore_3        
		uri = ((Uri) (as));
	//   36   87:aload_2         
	//   37   88:astore_1        
		((StringBuilder) (s)).append("return PushVerifInfoEnum provider Cursor : ");
	//   38   89:aload_3         
	//   39   90:ldc1            #102 <String "return PushVerifInfoEnum provider Cursor : ">
	//   40   92:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   41   95:pop             
		uri = ((Uri) (as));
	//   42   96:aload_2         
	//   43   97:astore_1        
		((StringBuilder) (s)).append(((Object) (as)));
	//   44   98:aload_3         
	//   45   99:aload_2         
	//   46  100:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//   47  103:pop             
		uri = ((Uri) (as));
	//   48  104:aload_2         
	//   49  105:astore_1        
		s = ((StringBuilder) (s)).toString();
	//   50  106:aload_3         
	//   51  107:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   52  110:astore_3        
_L10:
		uri = ((Uri) (as));
	//   53  111:aload_2         
	//   54  112:astore_1        
		com.baidu.android.pushservice.e.a.c("PushInfoProvider", s);
	//   55  113:ldc1            #107 <String "PushInfoProvider">
	//   56  115:aload_3         
	//   57  116:invokestatic    #112 <Method void a.c(String, String)>
		uri = ((Uri) (as));
	//   58  119:aload_2         
	//   59  120:astore_1        
		  goto _L7
	//*  60  121:goto            229
_L2:
		a = q.a(c);
	//   61  124:aload_0         
	//   62  125:getstatic       #44  <Field Context c>
	//   63  128:invokestatic    #91  <Method SQLiteDatabase q.a(Context)>
	//   64  131:putfield        #93  <Field SQLiteDatabase a>
		if(a == null) goto _L5; else goto _L8
	//   65  134:aload_0         
	//   66  135:getfield        #93  <Field SQLiteDatabase a>
	//   67  138:ifnull          211
_L8:
		as = ((String []) (a.query("PushShareInfo", ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), ((String) (null)))));
	//   68  141:aload_0         
	//   69  142:getfield        #93  <Field SQLiteDatabase a>
	//   70  145:ldc1            #114 <String "PushShareInfo">
	//   71  147:aconst_null     
	//   72  148:aconst_null     
	//   73  149:aconst_null     
	//   74  150:aconst_null     
	//   75  151:aconst_null     
	//   76  152:aconst_null     
	//   77  153:invokevirtual   #100 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   78  156:astore_2        
		uri = ((Uri) (as));
	//   79  157:aload_2         
	//   80  158:astore_1        
		if(as == null) goto _L7; else goto _L9
	//   81  159:aload_2         
	//   82  160:ifnull          229
_L9:
		uri = ((Uri) (as));
	//   83  163:aload_2         
	//   84  164:astore_1        
		s = ((String) (new StringBuilder()));
	//   85  165:new             #56  <Class StringBuilder>
	//   86  168:dup             
	//   87  169:invokespecial   #57  <Method void StringBuilder()>
	//   88  172:astore_3        
		uri = ((Uri) (as));
	//   89  173:aload_2         
	//   90  174:astore_1        
		((StringBuilder) (s)).append("return contentprovider Cursor : ");
	//   91  175:aload_3         
	//   92  176:ldc1            #116 <String "return contentprovider Cursor : ">
	//   93  178:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   94  181:pop             
		uri = ((Uri) (as));
	//   95  182:aload_2         
	//   96  183:astore_1        
		((StringBuilder) (s)).append(((Object) (as)));
	//   97  184:aload_3         
	//   98  185:aload_2         
	//   99  186:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//  100  189:pop             
		uri = ((Uri) (as));
	//  101  190:aload_2         
	//  102  191:astore_1        
		s = ((StringBuilder) (s)).toString();
	//  103  192:aload_3         
	//  104  193:invokevirtual   #72  <Method String StringBuilder.toString()>
	//  105  196:astore_3        
		  goto _L10
	//* 106  197:goto            111
		as;
	//  107  200:astore_2        
		  goto _L11
	//* 108  201:goto            223
_L1:
		com.baidu.android.pushservice.e.a.c("PushInfoProvider", "unknow provider uri request!");
	//  109  204:ldc1            #107 <String "PushInfoProvider">
	//  110  206:ldc1            #118 <String "unknow provider uri request!">
	//  111  208:invokestatic    #112 <Method void a.c(String, String)>
_L5:
		uri = null;
	//  112  211:aconst_null     
	//  113  212:astore_1        
		  goto _L7
	//* 114  213:goto            229
		uri;
	//  115  216:astore_1        
		  goto _L12
	//* 116  217:goto            234
		as;
	//  117  220:astore_2        
		uri = null;
	//  118  221:aconst_null     
	//  119  222:astore_1        
_L11:
		com.baidu.android.pushservice.e.a.a("PushInfoProvider", ((Throwable) (as)));
	//  120  223:ldc1            #107 <String "PushInfoProvider">
	//  121  225:aload_2         
	//  122  226:invokestatic    #121 <Method void a.a(String, Throwable)>
_L7:
		obj;
	//  123  229:aload           6
		JVM INSTR monitorexit ;
	//  124  231:monitorexit     
		return ((Cursor) (uri));
	//  125  232:aload_1         
	//  126  233:areturn         
_L12:
		obj;
	//  127  234:aload           6
		JVM INSTR monitorexit ;
	//  128  236:monitorexit     
		throw uri;
	//  129  237:aload_1         
	//  130  238:athrow          
	//* 131  239:goto            204
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		Object obj2 = b;
	//    0    0:getstatic       #21  <Field Object b>
	//    1    3:astore          12
		obj2;
	//    2    5:aload           12
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		long l1;
		Object obj;
		Uri uri1;
		Object obj1;
		obj1 = null;
	//    4    8:aconst_null     
	//    5    9:astore          11
		uri1 = null;
	//    6   11:aconst_null     
	//    7   12:astore          10
		obj = null;
	//    8   14:aconst_null     
	//    9   15:astore          9
		l1 = -1L;
	//   10   17:ldc2w           #124 <Long -1L>
	//   11   20:lstore          7
		if(d.match(uri) == 1) goto _L2; else goto _L1
	//   12   22:getstatic       #28  <Field UriMatcher d>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #86  <Method int UriMatcher.match(Uri)>
	//   15   29:iconst_1        
	//   16   30:icmpeq          48
_L1:
		long l;
		contentvalues = null;
	//   17   33:aconst_null     
	//   18   34:astore_2        
		uri = ((Uri) (obj));
	//   19   35:aload           9
	//   20   37:astore_1        
		l = l1;
	//   21   38:lload           7
	//   22   40:lstore          5
		obj = ((Object) (contentvalues));
	//   23   42:aload_2         
	//   24   43:astore          9
		  goto _L3
	//*  25   45:goto            292
_L2:
		as = ((String []) (q.a(c)));
	//   26   48:getstatic       #44  <Field Context c>
	//   27   51:invokestatic    #91  <Method SQLiteDatabase q.a(Context)>
	//   28   54:astore          4
		uri = ((Uri) (obj));
	//   29   56:aload           9
	//   30   58:astore_1        
		l = l1;
	//   31   59:lload           7
	//   32   61:lstore          5
		obj = ((Object) (as));
	//   33   63:aload           4
	//   34   65:astore          9
		if(as == null) goto _L3; else goto _L4
	//   35   67:aload           4
	//   36   69:ifnull          292
_L4:
		obj = ((Object) (as));
	//   37   72:aload           4
	//   38   74:astore          9
		uri = ((Uri) (((SQLiteDatabase) (as)).query("PushShareInfo", ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), ((String) (null)))));
	//   39   76:aload           4
	//   40   78:ldc1            #114 <String "PushShareInfo">
	//   41   80:aconst_null     
	//   42   81:aconst_null     
	//   43   82:aconst_null     
	//   44   83:aconst_null     
	//   45   84:aconst_null     
	//   46   85:aconst_null     
	//   47   86:invokevirtual   #100 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   48   89:astore_1        
		if(uri == null) goto _L6; else goto _L5
	//   49   90:aload_1         
	//   50   91:ifnull          203
_L5:
		l = l1;
	//   51   94:lload           7
	//   52   96:lstore          5
		if(((Cursor) (uri)).getCount() == 0) goto _L6; else goto _L7
	//   53   98:aload_1         
	//   54   99:invokeinterface #131 <Method int Cursor.getCount()>
	//   55  104:ifeq            203
_L7:
		l = l1;
	//   56  107:lload           7
	//   57  109:lstore          5
		l1 = ((SQLiteDatabase) (as)).update("PushShareInfo", contentvalues, s, ((String []) (null)));
	//   58  111:aload           4
	//   59  113:ldc1            #114 <String "PushShareInfo">
	//   60  115:aload_2         
	//   61  116:aload_3         
	//   62  117:aconst_null     
	//   63  118:invokevirtual   #134 <Method int SQLiteDatabase.update(String, ContentValues, String, String[])>
	//   64  121:i2l             
	//   65  122:lstore          7
		l = l1;
	//   66  124:lload           7
	//   67  126:lstore          5
		contentvalues = ((ContentValues) (new StringBuilder()));
	//   68  128:new             #56  <Class StringBuilder>
	//   69  131:dup             
	//   70  132:invokespecial   #57  <Method void StringBuilder()>
	//   71  135:astore_2        
		l = l1;
	//   72  136:lload           7
	//   73  138:lstore          5
		((StringBuilder) (contentvalues)).append("update  selection = ");
	//   74  140:aload_2         
	//   75  141:ldc1            #136 <String "update  selection = ">
	//   76  143:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   77  146:pop             
		l = l1;
	//   78  147:lload           7
	//   79  149:lstore          5
		((StringBuilder) (contentvalues)).append(s);
	//   80  151:aload_2         
	//   81  152:aload_3         
	//   82  153:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   83  156:pop             
		l = l1;
	//   84  157:lload           7
	//   85  159:lstore          5
		((StringBuilder) (contentvalues)).append("  ret = ");
	//   86  161:aload_2         
	//   87  162:ldc1            #138 <String "  ret = ">
	//   88  164:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   89  167:pop             
		l = l1;
	//   90  168:lload           7
	//   91  170:lstore          5
		((StringBuilder) (contentvalues)).append(l1);
	//   92  172:aload_2         
	//   93  173:lload           7
	//   94  175:invokevirtual   #141 <Method StringBuilder StringBuilder.append(long)>
	//   95  178:pop             
		l = l1;
	//   96  179:lload           7
	//   97  181:lstore          5
		com.baidu.android.pushservice.e.a.c("PushInfoProvider", ((StringBuilder) (contentvalues)).toString());
	//   98  183:ldc1            #107 <String "PushInfoProvider">
	//   99  185:aload_2         
	//  100  186:invokevirtual   #72  <Method String StringBuilder.toString()>
	//  101  189:invokestatic    #112 <Method void a.c(String, String)>
		l = l1;
	//  102  192:lload           7
	//  103  194:lstore          5
		obj = ((Object) (as));
	//  104  196:aload           4
	//  105  198:astore          9
		  goto _L3
	//* 106  200:goto            292
_L6:
		l = l1;
	//  107  203:lload           7
	//  108  205:lstore          5
		l1 = ((SQLiteDatabase) (as)).insert("PushShareInfo", ((String) (null)), contentvalues);
	//  109  207:aload           4
	//  110  209:ldc1            #114 <String "PushShareInfo">
	//  111  211:aconst_null     
	//  112  212:aload_2         
	//  113  213:invokevirtual   #144 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
	//  114  216:lstore          7
		contentvalues = ((ContentValues) (new StringBuilder()));
	//  115  218:new             #56  <Class StringBuilder>
	//  116  221:dup             
	//  117  222:invokespecial   #57  <Method void StringBuilder()>
	//  118  225:astore_2        
		((StringBuilder) (contentvalues)).append("insert  selection = ");
	//  119  226:aload_2         
	//  120  227:ldc1            #146 <String "insert  selection = ">
	//  121  229:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  122  232:pop             
		((StringBuilder) (contentvalues)).append(s);
	//  123  233:aload_2         
	//  124  234:aload_3         
	//  125  235:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  126  238:pop             
		((StringBuilder) (contentvalues)).append("  ret = ");
	//  127  239:aload_2         
	//  128  240:ldc1            #138 <String "  ret = ">
	//  129  242:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  130  245:pop             
		((StringBuilder) (contentvalues)).append(l1);
	//  131  246:aload_2         
	//  132  247:lload           7
	//  133  249:invokevirtual   #141 <Method StringBuilder StringBuilder.append(long)>
	//  134  252:pop             
		com.baidu.android.pushservice.e.a.c("PushInfoProvider", ((StringBuilder) (contentvalues)).toString());
	//  135  253:ldc1            #107 <String "PushInfoProvider">
	//  136  255:aload_2         
	//  137  256:invokevirtual   #72  <Method String StringBuilder.toString()>
	//  138  259:invokestatic    #112 <Method void a.c(String, String)>
		l = l1;
	//  139  262:lload           7
	//  140  264:lstore          5
		obj = ((Object) (as));
	//  141  266:aload           4
	//  142  268:astore          9
		  goto _L3
	//* 143  270:goto            292
		contentvalues;
	//  144  273:astore_2        
		l = l1;
	//  145  274:lload           7
	//  146  276:lstore          5
		  goto _L8
	//* 147  278:goto            338
		contentvalues;
	//  148  281:astore_2        
		uri = ((Uri) (obj1));
	//  149  282:aload           11
	//  150  284:astore_1        
		l = l1;
	//  151  285:lload           7
	//  152  287:lstore          5
		  goto _L8
	//* 153  289:goto            338
_L3:
		if(uri == null) goto _L10; else goto _L9
	//  154  292:aload_1         
	//  155  293:ifnull          409
_L9:
		((Cursor) (uri)).close();
	//  156  296:aload_1         
	//  157  297:invokeinterface #149 <Method void Cursor.close()>
		  goto _L10
	//* 158  302:goto            409
_L16:
		((SQLiteDatabase) (as)).close();
	//  159  305:aload           4
	//  160  307:invokevirtual   #150 <Method void SQLiteDatabase.close()>
		l1 = l;
	//  161  310:lload           5
	//  162  312:lstore          7
		  goto _L11
	//* 163  314:goto            364
		contentvalues;
	//  164  317:astore_2        
		as = null;
	//  165  318:aconst_null     
	//  166  319:astore          4
		uri = ((Uri) (as));
	//  167  321:aload           4
	//  168  323:astore_1        
		  goto _L12
	//* 169  324:goto            371
		contentvalues;
	//  170  327:astore_2        
		as = null;
	//  171  328:aconst_null     
	//  172  329:astore          4
		l = l1;
	//  173  331:lload           7
	//  174  333:lstore          5
		uri = ((Uri) (obj1));
	//  175  335:aload           11
	//  176  337:astore_1        
_L8:
		uri1 = uri;
	//  177  338:aload_1         
	//  178  339:astore          10
		obj = ((Object) (as));
	//  179  341:aload           4
	//  180  343:astore          9
		com.baidu.android.pushservice.e.a.a("PushInfoProvider", ((Throwable) (contentvalues)));
	//  181  345:ldc1            #107 <String "PushInfoProvider">
	//  182  347:aload_2         
	//  183  348:invokestatic    #121 <Method void a.a(String, Throwable)>
		if(uri == null) goto _L14; else goto _L13
	//  184  351:aload_1         
	//  185  352:ifnull          425
_L13:
		((Cursor) (uri)).close();
	//  186  355:aload_1         
	//  187  356:invokeinterface #149 <Method void Cursor.close()>
		  goto _L14
	//* 188  361:goto            425
_L11:
		obj2;
	//  189  364:aload           12
		JVM INSTR monitorexit ;
	//  190  366:monitorexit     
		return (int)l1;
	//  191  367:lload           7
	//  192  369:l2i             
	//  193  370:ireturn         
_L12:
		if(uri == null)
			break MISSING_BLOCK_LABEL_384;
	//  194  371:aload_1         
	//  195  372:ifnull          384
		((Cursor) (uri)).close();
	//  196  375:aload_1         
	//  197  376:invokeinterface #149 <Method void Cursor.close()>
	//* 198  381:goto            384
		if(as == null)
			break MISSING_BLOCK_LABEL_394;
	//  199  384:aload           4
	//  200  386:ifnull          394
		((SQLiteDatabase) (as)).close();
	//  201  389:aload           4
	//  202  391:invokevirtual   #150 <Method void SQLiteDatabase.close()>
		throw contentvalues;
	//  203  394:aload_2         
	//  204  395:athrow          
	//* 205  396:aload           12
_L17:
		throw uri;
	//  206  398:monitorexit     
	//  207  399:aload_1         
	//  208  400:athrow          
		contentvalues;
	//  209  401:astore_2        
		  goto _L12
	//* 210  402:goto            371
		contentvalues;
	//  211  405:astore_2        
		  goto _L8
	//* 212  406:goto            338
_L10:
		l1 = l;
	//  213  409:lload           5
	//  214  411:lstore          7
		if(obj == null) goto _L11; else goto _L15
	//  215  413:aload           9
	//  216  415:ifnull          364
_L15:
		as = ((String []) (obj));
	//  217  418:aload           9
	//  218  420:astore          4
		break; /* Loop/switch isn't completed */
	//  219  422:goto            305
_L14:
		l1 = l;
	//  220  425:lload           5
	//  221  427:lstore          7
		if(as == null) goto _L11; else goto _L16
	//  222  429:aload           4
	//  223  431:ifnull          364
	//* 224  434:goto            305
		contentvalues;
	//  225  437:astore_2        
		uri = uri1;
	//  226  438:aload           10
	//  227  440:astore_1        
		as = ((String []) (obj));
	//  228  441:aload           9
	//  229  443:astore          4
		  goto _L12
	//* 230  445:goto            371
		uri;
	//  231  448:astore_1        
		  goto _L17
	//* 232  449:goto            396
	}

	private static Object b = new Object();
	private static Context c;
	private static final UriMatcher d = new UriMatcher(-1);
	SQLiteDatabase a;

	static 
	{
	//    0    0:new             #16  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void Object()>
	//    3    7:putstatic       #21  <Field Object b>
	//    4   10:new             #23  <Class UriMatcher>
	//    5   13:dup             
	//    6   14:iconst_m1       
	//    7   15:invokespecial   #26  <Method void UriMatcher(int)>
	//    8   18:putstatic       #28  <Field UriMatcher d>
	//*   9   21:return          
	}
}
