// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.*;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzcb, zzed, zzfu, zzec, 
//			zzcc, zzdi, zzbw, zzbe, 
//			zzfn, zzfm

final class zzeb
	implements zzcb
{

	zzeb(zzcc zzcc1, Context context)
	{
		this(zzcc1, context, "gtm_urls.db", 2000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #51  <String "gtm_urls.db">
	//    4    5:sipush          2000
	//    5    8:invokespecial   #54  <Method void zzeb(zzcc, Context, String, int)>
	//    6   11:return          
	}

	private zzeb(zzcc zzcc1, Context context, String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		zzri = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #62  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #64  <Field Context zzri>
		zzbdu = s;
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:putfield        #66  <Field String zzbdu>
		zzbdt = zzcc1;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #68  <Field zzcc zzbdt>
		zzrz = DefaultClock.getInstance();
	//   12   22:aload_0         
	//   13   23:invokestatic    #74  <Method Clock DefaultClock.getInstance()>
	//   14   26:putfield        #76  <Field Clock zzrz>
		zzbdr = new zzed(this, zzri, zzbdu);
	//   15   29:aload_0         
	//   16   30:new             #78  <Class zzed>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #64  <Field Context zzri>
	//   21   39:aload_0         
	//   22   40:getfield        #66  <Field String zzbdu>
	//   23   43:invokespecial   #81  <Method void zzed(zzeb, Context, String)>
	//   24   46:putfield        #83  <Field zzed zzbdr>
		zzbds = ((zzbe) (new zzfu(zzri, ((zzfw) (new zzec(this))))));
	//   25   49:aload_0         
	//   26   50:new             #85  <Class zzfu>
	//   27   53:dup             
	//   28   54:aload_0         
	//   29   55:getfield        #64  <Field Context zzri>
	//   30   58:new             #87  <Class zzec>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:invokespecial   #90  <Method void zzec(zzeb)>
	//   34   66:invokespecial   #93  <Method void zzfu(Context, zzfw)>
	//   35   69:putfield        #95  <Field zzbe zzbds>
		zzbdv = 0L;
	//   36   72:aload_0         
	//   37   73:lconst_0        
	//   38   74:putfield        #97  <Field long zzbdv>
		zzbdw = 2000;
	//   39   77:aload_0         
	//   40   78:sipush          2000
	//   41   81:putfield        #99  <Field int zzbdw>
	//   42   84:return          
	}

	static Clock zza(zzeb zzeb1)
	{
		return zzeb1.zzrz;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Clock zzrz>
	//    2    4:areturn         
	}

	static void zza(zzeb zzeb1, long l)
	{
		zzeb1.zze(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #107 <Method void zze(long)>
	//    3    5:return          
	}

	static void zza(zzeb zzeb1, long l, long l1)
	{
		zzeb1.zze(l, l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:invokespecial   #111 <Method void zze(long, long)>
	//    4    6:return          
	}

	private final void zza(String as[])
	{
		boolean flag;
		SQLiteDatabase sqlitedatabase;
		String s;
		if(as == null)
			break MISSING_BLOCK_LABEL_88;
	//    0    0:aload_1         
	//    1    1:ifnull          88
		if(as.length == 0)
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifne            10
			return;
	//    5    9:return          
		sqlitedatabase = zzdl("Error opening database for deleteHits.");
	//    6   10:aload_0         
	//    7   11:ldc1            #116 <String "Error opening database for deleteHits.">
	//    8   13:invokespecial   #120 <Method SQLiteDatabase zzdl(String)>
	//    9   16:astore_3        
		if(sqlitedatabase == null)
	//*  10   17:aload_3         
	//*  11   18:ifnonnull       22
			return;
	//   12   21:return          
		flag = true;
	//   13   22:iconst_1        
	//   14   23:istore_2        
		s = String.format("HIT_ID in (%s)", new Object[] {
			TextUtils.join(",", ((Iterable) (Collections.nCopies(as.length, "?"))))
		});
	//   15   24:ldc1            #122 <String "HIT_ID in (%s)">
	//   16   26:iconst_1        
	//   17   27:anewarray       Object[]
	//   18   30:dup             
	//   19   31:iconst_0        
	//   20   32:ldc1            #124 <String ",">
	//   21   34:aload_1         
	//   22   35:arraylength     
	//   23   36:ldc1            #126 <String "?">
	//   24   38:invokestatic    #132 <Method List Collections.nCopies(int, Object)>
	//   25   41:invokestatic    #138 <Method String TextUtils.join(CharSequence, Iterable)>
	//   26   44:aastore         
	//   27   45:invokestatic    #44  <Method String String.format(String, Object[])>
	//   28   48:astore          4
		sqlitedatabase.delete("gtm_hits", s, as);
	//   29   50:aload_3         
	//   30   51:ldc1            #30  <String "gtm_hits">
	//   31   53:aload           4
	//   32   55:aload_1         
	//   33   56:invokevirtual   #144 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   34   59:pop             
		as = ((String []) (zzbdt));
	//   35   60:aload_0         
	//   36   61:getfield        #68  <Field zzcc zzbdt>
	//   37   64:astore_1        
		if(zzpj() != 0)
	//*  38   65:aload_0         
	//*  39   66:invokespecial   #148 <Method int zzpj()>
	//*  40   69:ifne            93
	//*  41   72:goto            75
	//*  42   75:aload_1         
	//*  43   76:iload_2         
	//*  44   77:invokeinterface #154 <Method void zzcc.zzo(boolean)>
	//*  45   82:return          
	//*  46   83:ldc1            #156 <String "Error deleting hits">
	//*  47   85:invokestatic    #162 <Method void zzdi.zzab(String)>
	//*  48   88:return          
	//*  49   89:astore_1        
	//*  50   90:goto            83
			flag = false;
	//   51   93:iconst_0        
	//   52   94:istore_2        
		try
		{
			((zzcc) (as)).zzo(flag);
			return;
		}
		// Misplaced declaration of an exception variable
		catch(String as[])
		{
			zzdi.zzab("Error deleting hits");
		}
	//*  53   95:goto            75
	}

	private final List zzab(int i)
	{
		Object obj;
		Object obj1;
		Object obj2;
		Object obj4;
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #165 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #166 <Method void ArrayList()>
	//    3    7:astore          7
		if(i <= 0)
	//*   4    9:iload_1         
	//*   5   10:ifgt            21
		{
			zzdi.zzab("Invalid maxHits specified. Skipping");
	//    6   13:ldc1            #168 <String "Invalid maxHits specified. Skipping">
	//    7   15:invokestatic    #162 <Method void zzdi.zzab(String)>
			return ((List) (arraylist));
	//    8   18:aload           7
	//    9   20:areturn         
		}
		obj2 = ((Object) (zzdl("Error opening database for peekHitIds.")));
	//   10   21:aload_0         
	//   11   22:ldc1            #170 <String "Error opening database for peekHitIds.">
	//   12   24:invokespecial   #120 <Method SQLiteDatabase zzdl(String)>
	//   13   27:astore          5
		if(obj2 == null)
	//*  14   29:aload           5
	//*  15   31:ifnonnull       37
			return ((List) (arraylist));
	//   16   34:aload           7
	//   17   36:areturn         
		obj4 = null;
	//   18   37:aconst_null     
	//   19   38:astore          6
		obj1 = null;
	//   20   40:aconst_null     
	//   21   41:astore          4
		obj = obj1;
	//   22   43:aload           4
	//   23   45:astore_3        
		String s = String.format("%s ASC", new Object[] {
			"hit_id"
		});
	//   24   46:ldc1            #172 <String "%s ASC">
	//   25   48:iconst_1        
	//   26   49:anewarray       Object[]
	//   27   52:dup             
	//   28   53:iconst_0        
	//   29   54:ldc1            #32  <String "hit_id">
	//   30   56:aastore         
	//   31   57:invokestatic    #44  <Method String String.format(String, Object[])>
	//   32   60:astore          8
		obj = obj1;
	//   33   62:aload           4
	//   34   64:astore_3        
		String s1 = Integer.toString(i);
	//   35   65:iload_1         
	//   36   66:invokestatic    #178 <Method String Integer.toString(int)>
	//   37   69:astore          9
		obj = obj1;
	//   38   71:aload           4
	//   39   73:astore_3        
		obj1 = ((Object) (((SQLiteDatabase) (obj2)).query("gtm_hits", new String[] {
			"hit_id"
		}, ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), s, s1)));
	//   40   74:aload           5
	//   41   76:ldc1            #30  <String "gtm_hits">
	//   42   78:iconst_1        
	//   43   79:anewarray       String[]
	//   44   82:dup             
	//   45   83:iconst_0        
	//   46   84:ldc1            #32  <String "hit_id">
	//   47   86:aastore         
	//   48   87:aconst_null     
	//   49   88:aconst_null     
	//   50   89:aconst_null     
	//   51   90:aconst_null     
	//   52   91:aload           8
	//   53   93:aload           9
	//   54   95:invokevirtual   #182 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
	//   55   98:astore          4
		boolean flag;
		if(((Cursor) (obj1)).moveToFirst())
	//*  56  100:aload           4
	//*  57  102:invokeinterface #188 <Method boolean Cursor.moveToFirst()>
	//*  58  107:ifeq            141
			do
			{
				((List) (arraylist)).add(((Object) (String.valueOf(((Cursor) (obj1)).getLong(0)))));
	//   59  110:aload           7
	//   60  112:aload           4
	//   61  114:iconst_0        
	//   62  115:invokeinterface #192 <Method long Cursor.getLong(int)>
	//   63  120:invokestatic    #196 <Method String String.valueOf(long)>
	//   64  123:invokeinterface #202 <Method boolean List.add(Object)>
	//   65  128:pop             
				flag = ((Cursor) (obj1)).moveToNext();
	//   66  129:aload           4
	//   67  131:invokeinterface #205 <Method boolean Cursor.moveToNext()>
	//   68  136:istore_2        
			} while(flag);
	//   69  137:iload_2         
	//   70  138:ifne            110
		if(obj1 != null)
	//*  71  141:aload           4
	//*  72  143:ifnull          257
		{
			((Cursor) (obj1)).close();
	//   73  146:aload           4
	//   74  148:invokeinterface #208 <Method void Cursor.close()>
			return ((List) (arraylist));
	//   75  153:aload           7
	//   76  155:areturn         
		}
		break MISSING_BLOCK_LABEL_257;
		Object obj3;
		obj3;
	//   77  156:astore          5
		obj = obj1;
	//   78  158:aload           4
	//   79  160:astore_3        
		obj1 = obj3;
	//   80  161:aload           5
	//   81  163:astore          4
		break MISSING_BLOCK_LABEL_260;
	//   82  165:goto            260
		obj3;
	//   83  168:astore          5
		break MISSING_BLOCK_LABEL_184;
	//   84  170:goto            184
		obj1;
	//   85  173:astore          4
		break MISSING_BLOCK_LABEL_260;
	//   86  175:goto            260
		obj3;
	//   87  178:astore          5
		obj1 = ((Object) (obj4));
	//   88  180:aload           6
	//   89  182:astore          4
		obj = obj1;
	//   90  184:aload           4
	//   91  186:astore_3        
		obj3 = ((Object) (String.valueOf(((Object) (((SQLiteException) (obj3)).getMessage())))));
	//   92  187:aload           5
	//   93  189:invokevirtual   #212 <Method String SQLiteException.getMessage()>
	//   94  192:invokestatic    #215 <Method String String.valueOf(Object)>
	//   95  195:astore          5
		obj = obj1;
	//   96  197:aload           4
	//   97  199:astore_3        
		if(((String) (obj3)).length() == 0)
			break MISSING_BLOCK_LABEL_223;
	//   98  200:aload           5
	//   99  202:invokevirtual   #218 <Method int String.length()>
	//  100  205:ifeq            223
		obj = obj1;
	//  101  208:aload           4
	//  102  210:astore_3        
		obj3 = ((Object) ("Error in peekHits fetching hitIds: ".concat(((String) (obj3)))));
	//  103  211:ldc1            #220 <String "Error in peekHits fetching hitIds: ">
	//  104  213:aload           5
	//  105  215:invokevirtual   #224 <Method String String.concat(String)>
	//  106  218:astore          5
		break MISSING_BLOCK_LABEL_237;
	//  107  220:goto            237
		obj = obj1;
	//  108  223:aload           4
	//  109  225:astore_3        
		obj3 = ((Object) (new String("Error in peekHits fetching hitIds: ")));
	//  110  226:new             #40  <Class String>
	//  111  229:dup             
	//  112  230:ldc1            #220 <String "Error in peekHits fetching hitIds: ">
	//  113  232:invokespecial   #226 <Method void String(String)>
	//  114  235:astore          5
		obj = obj1;
	//  115  237:aload           4
	//  116  239:astore_3        
		zzdi.zzab(((String) (obj3)));
	//  117  240:aload           5
	//  118  242:invokestatic    #162 <Method void zzdi.zzab(String)>
		if(obj1 != null)
	//* 119  245:aload           4
	//* 120  247:ifnull          257
			((Cursor) (obj1)).close();
	//  121  250:aload           4
	//  122  252:invokeinterface #208 <Method void Cursor.close()>
		return ((List) (arraylist));
	//  123  257:aload           7
	//  124  259:areturn         
		if(obj != null)
	//* 125  260:aload_3         
	//* 126  261:ifnull          270
			((Cursor) (obj)).close();
	//  127  264:aload_3         
	//  128  265:invokeinterface #208 <Method void Cursor.close()>
		throw obj1;
	//  129  270:aload           4
	//  130  272:athrow          
	}

	private final List zzac(int i)
	{
		int j;
		Object obj4;
		Object obj5;
		obj4 = ((Object) (new ArrayList()));
	//    0    0:new             #165 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #166 <Method void ArrayList()>
	//    3    7:astore          9
		obj5 = ((Object) (zzdl("Error opening database for peekHits")));
	//    4    9:aload_0         
	//    5   10:ldc1            #231 <String "Error opening database for peekHits">
	//    6   12:invokespecial   #120 <Method SQLiteDatabase zzdl(String)>
	//    7   15:astore          10
		if(obj5 == null)
	//*   8   17:aload           10
	//*   9   19:ifnonnull       25
			return ((List) (obj4));
	//   10   22:aload           9
	//   11   24:areturn         
		j = 0;
	//   12   25:iconst_0        
	//   13   26:istore_2        
		Object obj;
		obj = ((Object) (String.format("%s ASC", new Object[] {
			"hit_id"
		})));
	//   14   27:ldc1            #172 <String "%s ASC">
	//   15   29:iconst_1        
	//   16   30:anewarray       Object[]
	//   17   33:dup             
	//   18   34:iconst_0        
	//   19   35:ldc1            #32  <String "hit_id">
	//   20   37:aastore         
	//   21   38:invokestatic    #44  <Method String String.format(String, Object[])>
	//   22   41:astore          6
		String s = Integer.toString(40);
	//   23   43:bipush          40
	//   24   45:invokestatic    #178 <Method String Integer.toString(int)>
	//   25   48:astore          7
		obj = ((Object) (((SQLiteDatabase) (obj5)).query("gtm_hits", new String[] {
			"hit_id", "hit_time", "hit_first_send_time"
		}, ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), ((String) (obj)), s)));
	//   26   50:aload           10
	//   27   52:ldc1            #30  <String "gtm_hits">
	//   28   54:iconst_3        
	//   29   55:anewarray       String[]
	//   30   58:dup             
	//   31   59:iconst_0        
	//   32   60:ldc1            #32  <String "hit_id">
	//   33   62:aastore         
	//   34   63:dup             
	//   35   64:iconst_1        
	//   36   65:ldc1            #34  <String "hit_time">
	//   37   67:aastore         
	//   38   68:dup             
	//   39   69:iconst_2        
	//   40   70:ldc1            #38  <String "hit_first_send_time">
	//   41   72:aastore         
	//   42   73:aconst_null     
	//   43   74:aconst_null     
	//   44   75:aconst_null     
	//   45   76:aconst_null     
	//   46   77:aload           6
	//   47   79:aload           7
	//   48   81:invokevirtual   #182 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
	//   49   84:astore          6
		Object obj1;
		Object obj2;
		Object obj3;
		int k;
		int l;
		boolean flag;
		String s1;
		try
		{
			obj3 = ((Object) (new ArrayList()));
	//   50   86:new             #165 <Class ArrayList>
	//   51   89:dup             
	//   52   90:invokespecial   #166 <Method void ArrayList()>
	//   53   93:astore          8
		}
	//*  54   95:aload           6
	//*  55   97:invokeinterface #188 <Method boolean Cursor.moveToFirst()>
	//*  56  102:istore          5
	//*  57  104:iload           5
	//*  58  106:ifeq            187
	//*  59  109:aload           8
	//*  60  111:new             #233 <Class zzbw>
	//*  61  114:dup             
	//*  62  115:aload           6
	//*  63  117:iconst_0        
	//*  64  118:invokeinterface #192 <Method long Cursor.getLong(int)>
	//*  65  123:aload           6
	//*  66  125:iconst_1        
	//*  67  126:invokeinterface #192 <Method long Cursor.getLong(int)>
	//*  68  131:aload           6
	//*  69  133:iconst_2        
	//*  70  134:invokeinterface #192 <Method long Cursor.getLong(int)>
	//*  71  139:invokespecial   #236 <Method void zzbw(long, long, long)>
	//*  72  142:invokeinterface #202 <Method boolean List.add(Object)>
	//*  73  147:pop             
	//*  74  148:aload           6
	//*  75  150:invokeinterface #205 <Method boolean Cursor.moveToNext()>
	//*  76  155:istore          5
	//*  77  157:iload           5
	//*  78  159:ifne            109
	//*  79  162:goto            187
	//*  80  165:astore          7
	//*  81  167:aload           6
	//*  82  169:astore          8
	//*  83  171:aload           7
	//*  84  173:astore          6
	//*  85  175:aload           8
	//*  86  177:astore          7
	//*  87  179:goto            764
	//*  88  182:astore          7
	//*  89  184:goto            693
	//*  90  187:aload           6
	//*  91  189:ifnull          199
	//*  92  192:aload           6
	//*  93  194:invokeinterface #208 <Method void Cursor.close()>
	//*  94  199:ldc1            #172 <String "%s ASC">
	//*  95  201:iconst_1        
	//*  96  202:anewarray       Object[]
	//*  97  205:dup             
	//*  98  206:iconst_0        
	//*  99  207:ldc1            #32  <String "hit_id">
	//* 100  209:aastore         
	//* 101  210:invokestatic    #44  <Method String String.format(String, Object[])>
	//* 102  213:astore          9
	//* 103  215:bipush          40
	//* 104  217:invokestatic    #178 <Method String Integer.toString(int)>
	//* 105  220:astore          11
	//* 106  222:aload           8
	//* 107  224:astore          7
	//* 108  226:aload           10
	//* 109  228:ldc1            #30  <String "gtm_hits">
	//* 110  230:iconst_2        
	//* 111  231:anewarray       String[]
	//* 112  234:dup             
	//* 113  235:iconst_0        
	//* 114  236:ldc1            #32  <String "hit_id">
	//* 115  238:aastore         
	//* 116  239:dup             
	//* 117  240:iconst_1        
	//* 118  241:ldc1            #36  <String "hit_url">
	//* 119  243:aastore         
	//* 120  244:aconst_null     
	//* 121  245:aconst_null     
	//* 122  246:aconst_null     
	//* 123  247:aconst_null     
	//* 124  248:aload           9
	//* 125  250:aload           11
	//* 126  252:invokevirtual   #182 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
	//* 127  255:astore          9
	//* 128  257:aload           9
	//* 129  259:astore          6
	//* 130  261:aload           9
	//* 131  263:invokeinterface #188 <Method boolean Cursor.moveToFirst()>
	//* 132  268:ifeq            379
	//* 133  271:iconst_0        
	//* 134  272:istore_1        
	//* 135  273:aload           9
	//* 136  275:astore          6
	//* 137  277:aload           9
	//* 138  279:checkcast       #238 <Class SQLiteCursor>
	//* 139  282:invokevirtual   #242 <Method CursorWindow SQLiteCursor.getWindow()>
	//* 140  285:invokevirtual   #247 <Method int CursorWindow.getNumRows()>
	//* 141  288:ifle            320
	//* 142  291:aload           9
	//* 143  293:astore          6
	//* 144  295:aload           7
	//* 145  297:iload_1         
	//* 146  298:invokeinterface #251 <Method Object List.get(int)>
	//* 147  303:checkcast       #233 <Class zzbw>
	//* 148  306:aload           9
	//* 149  308:iconst_1        
	//* 150  309:invokeinterface #254 <Method String Cursor.getString(int)>
	//* 151  314:invokevirtual   #257 <Method void zzbw.zzds(String)>
	//* 152  317:goto            357
	//* 153  320:aload           9
	//* 154  322:astore          6
	//* 155  324:ldc2            #259 <String "HitString for hitId %d too large.  Hit will be deleted.">
	//* 156  327:iconst_1        
	//* 157  328:anewarray       Object[]
	//* 158  331:dup             
	//* 159  332:iconst_0        
	//* 160  333:aload           7
	//* 161  335:iload_1         
	//* 162  336:invokeinterface #251 <Method Object List.get(int)>
	//* 163  341:checkcast       #233 <Class zzbw>
	//* 164  344:invokevirtual   #263 <Method long zzbw.zzov()>
	//* 165  347:invokestatic    #268 <Method Long Long.valueOf(long)>
	//* 166  350:aastore         
	//* 167  351:invokestatic    #44  <Method String String.format(String, Object[])>
	//* 168  354:invokestatic    #162 <Method void zzdi.zzab(String)>
	//* 169  357:iload_1         
	//* 170  358:iconst_1        
	//* 171  359:iadd            
	//* 172  360:istore_1        
	//* 173  361:aload           9
	//* 174  363:astore          6
	//* 175  365:aload           9
	//* 176  367:invokeinterface #205 <Method boolean Cursor.moveToNext()>
	//* 177  372:istore          5
	//* 178  374:iload           5
	//* 179  376:ifne            273
	//* 180  379:aload           9
	//* 181  381:ifnull          391
	//* 182  384:aload           9
	//* 183  386:invokeinterface #208 <Method void Cursor.close()>
	//* 184  391:aload           7
	//* 185  393:areturn         
	//* 186  394:astore          7
	//* 187  396:aload           9
	//* 188  398:astore          6
	//* 189  400:goto            424
	//* 190  403:astore          7
	//* 191  405:goto            634
	//* 192  408:astore          9
	//* 193  410:aload           6
	//* 194  412:astore          7
	//* 195  414:goto            432
	//* 196  417:astore          7
	//* 197  419:goto            634
	//* 198  422:astore          7
	//* 199  424:aload           7
	//* 200  426:astore          9
	//* 201  428:aload           6
	//* 202  430:astore          7
	//* 203  432:aload           7
	//* 204  434:astore          6
	//* 205  436:aload           9
	//* 206  438:invokevirtual   #212 <Method String SQLiteException.getMessage()>
	//* 207  441:invokestatic    #215 <Method String String.valueOf(Object)>
	//* 208  444:astore          9
	//* 209  446:aload           7
	//* 210  448:astore          6
	//* 211  450:aload           9
	//* 212  452:invokevirtual   #218 <Method int String.length()>
	//* 213  455:ifeq            475
	//* 214  458:aload           7
	//* 215  460:astore          6
	//* 216  462:ldc2            #270 <String "Error in peekHits fetching hit url: ">
	//* 217  465:aload           9
	//* 218  467:invokevirtual   #224 <Method String String.concat(String)>
	//* 219  470:astore          9
	//* 220  472:goto            491
	//* 221  475:aload           7
	//* 222  477:astore          6
	//* 223  479:new             #40  <Class String>
	//* 224  482:dup             
	//* 225  483:ldc2            #270 <String "Error in peekHits fetching hit url: ">
	//* 226  486:invokespecial   #226 <Method void String(String)>
	//* 227  489:astore          9
	//* 228  491:aload           7
	//* 229  493:astore          6
	//* 230  495:aload           9
	//* 231  497:invokestatic    #162 <Method void zzdi.zzab(String)>
	//* 232  500:aload           7
	//* 233  502:astore          6
	//* 234  504:new             #165 <Class ArrayList>
	//* 235  507:dup             
	//* 236  508:invokespecial   #166 <Method void ArrayList()>
	//* 237  511:astore          9
	//* 238  513:aload           7
	//* 239  515:astore          6
	//* 240  517:aload           8
	//* 241  519:checkcast       #165 <Class ArrayList>
	//* 242  522:astore          8
	//* 243  524:aload           7
	//* 244  526:astore          6
	//* 245  528:aload           8
	//* 246  530:invokevirtual   #273 <Method int ArrayList.size()>
	//* 247  533:istore          4
	//* 248  535:iconst_0        
	//* 249  536:istore_1        
	//* 250  537:iload_2         
	//* 251  538:iload           4
	//* 252  540:icmpge          614
	//* 253  543:aload           7
	//* 254  545:astore          6
	//* 255  547:aload           8
	//* 256  549:iload_2         
	//* 257  550:invokevirtual   #274 <Method Object ArrayList.get(int)>
	//* 258  553:astore          10
	//* 259  555:iload_2         
	//* 260  556:iconst_1        
	//* 261  557:iadd            
	//* 262  558:istore_3        
	//* 263  559:aload           7
	//* 264  561:astore          6
	//* 265  563:aload           10
	//* 266  565:checkcast       #233 <Class zzbw>
	//* 267  568:astore          10
	//* 268  570:iload_1         
	//* 269  571:istore_2        
	//* 270  572:aload           7
	//* 271  574:astore          6
	//* 272  576:aload           10
	//* 273  578:invokevirtual   #277 <Method String zzbw.zzox()>
	//* 274  581:invokestatic    #281 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 275  584:ifeq            593
	//* 276  587:iload_1         
	//* 277  588:ifne            614
	//* 278  591:iconst_1        
	//* 279  592:istore_2        
	//* 280  593:aload           7
	//* 281  595:astore          6
	//* 282  597:aload           9
	//* 283  599:aload           10
	//* 284  601:invokeinterface #202 <Method boolean List.add(Object)>
	//* 285  606:pop             
	//* 286  607:iload_2         
	//* 287  608:istore_1        
	//* 288  609:iload_3         
	//* 289  610:istore_2        
	//* 290  611:goto            537
	//* 291  614:aload           7
	//* 292  616:ifnull          626
	//* 293  619:aload           7
	//* 294  621:invokeinterface #208 <Method void Cursor.close()>
	//* 295  626:aload           9
	//* 296  628:areturn         
	//* 297  629:astore          7
	//* 298  631:goto            419
	//* 299  634:aload           6
	//* 300  636:ifnull          646
	//* 301  639:aload           6
	//* 302  641:invokeinterface #208 <Method void Cursor.close()>
	//* 303  646:aload           7
	//* 304  648:athrow          
	//* 305  649:astore          7
	//* 306  651:goto            693
	//* 307  654:astore          7
	//* 308  656:aload           6
	//* 309  658:astore          8
	//* 310  660:aload           7
	//* 311  662:astore          6
	//* 312  664:aload           8
	//* 313  666:astore          7
	//* 314  668:goto            764
		// Misplaced declaration of an exception variable
		catch(Object obj2)
	//* 315  671:astore          7
		{
			break MISSING_BLOCK_LABEL_689;
	//  316  673:goto            689
		}
		try
		{
			flag = ((Cursor) (obj)).moveToFirst();
		}
		// Misplaced declaration of an exception variable
		catch(Object obj2)
		{
			break MISSING_BLOCK_LABEL_693;
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_187;
		do
		{
			((List) (obj3)).add(((Object) (new zzbw(((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getLong(1), ((Cursor) (obj)).getLong(2)))));
			flag = ((Cursor) (obj)).moveToNext();
		} while(flag);
		break MISSING_BLOCK_LABEL_187;
		obj1;
		obj3 = obj;
		obj = obj1;
		obj2 = obj3;
		break MISSING_BLOCK_LABEL_764;
		obj2;
		break MISSING_BLOCK_LABEL_693;
		if(obj != null)
			((Cursor) (obj)).close();
		obj4 = ((Object) (String.format("%s ASC", new Object[] {
			"hit_id"
		})));
		s1 = Integer.toString(40);
		obj2 = obj3;
		try
		{
			obj4 = ((Object) (((SQLiteDatabase) (obj5)).query("gtm_hits", new String[] {
				"hit_id", "hit_url"
			}, ((String) (null)), ((String []) (null)), ((String) (null)), ((String) (null)), ((String) (obj4)), s1)));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj4)
		{
			obj2 = obj;
			break MISSING_BLOCK_LABEL_432;
		}
		obj = obj4;
		if(!((Cursor) (obj4)).moveToFirst()) goto _L2; else goto _L1
_L1:
		i = 0;
_L3:
		obj = obj4;
		if(((SQLiteCursor)obj4).getWindow().getNumRows() <= 0)
			break MISSING_BLOCK_LABEL_320;
		obj = obj4;
		try
		{
			((zzbw)((List) (obj2)).get(i)).zzds(((Cursor) (obj4)).getString(1));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj2)
		{
			obj = obj4;
			break MISSING_BLOCK_LABEL_424;
		}
		break MISSING_BLOCK_LABEL_357;
		obj = obj4;
		zzdi.zzab(String.format("HitString for hitId %d too large.  Hit will be deleted.", new Object[] {
			Long.valueOf(((zzbw)((List) (obj2)).get(i)).zzov())
		}));
		i++;
		obj = obj4;
		flag = ((Cursor) (obj4)).moveToNext();
		if(flag) goto _L3; else goto _L2
_L2:
		if(obj4 != null)
			((Cursor) (obj4)).close();
		return ((List) (obj2));
		obj2;
		break MISSING_BLOCK_LABEL_634;
		obj2;
		break MISSING_BLOCK_LABEL_634;
		obj2;
		obj4 = obj2;
		obj2 = obj;
		obj = obj2;
		obj4 = ((Object) (String.valueOf(((Object) (((SQLiteException) (obj4)).getMessage())))));
		obj = obj2;
		if(((String) (obj4)).length() == 0)
			break MISSING_BLOCK_LABEL_475;
		obj = obj2;
		obj4 = ((Object) ("Error in peekHits fetching hit url: ".concat(((String) (obj4)))));
		break MISSING_BLOCK_LABEL_491;
		obj = obj2;
		obj4 = ((Object) (new String("Error in peekHits fetching hit url: ")));
		obj = obj2;
		zzdi.zzab(((String) (obj4)));
		obj = obj2;
		obj4 = ((Object) (new ArrayList()));
		obj = obj2;
		obj3 = ((Object) ((ArrayList)obj3));
		obj = obj2;
		l = ((ArrayList) (obj3)).size();
		i = 0;
_L5:
		if(j >= l)
			break; /* Loop/switch isn't completed */
		obj = obj2;
		obj5 = ((ArrayList) (obj3)).get(j);
		k = j + 1;
		obj = obj2;
		obj5 = ((Object) ((zzbw)obj5));
		j = i;
		obj = obj2;
		if(TextUtils.isEmpty(((CharSequence) (((zzbw) (obj5)).zzox()))))
		{
			if(i != 0)
				break; /* Loop/switch isn't completed */
			j = 1;
		}
		obj = obj2;
		((List) (obj4)).add(obj5);
		i = j;
		j = k;
		if(true) goto _L5; else goto _L4
_L4:
		if(obj2 != null)
			((Cursor) (obj2)).close();
		return ((List) (obj4));
		obj2;
		if(obj != null)
			((Cursor) (obj)).close();
		throw obj2;
		obj2;
		obj3 = obj;
		obj = obj2;
		obj2 = obj3;
		break MISSING_BLOCK_LABEL_764;
		obj;
	//  317  676:astore          6
		obj2 = null;
	//  318  678:aconst_null     
	//  319  679:astore          7
		break MISSING_BLOCK_LABEL_764;
	//  320  681:goto            764
		obj2;
	//  321  684:astore          7
		obj = null;
	//  322  686:aconst_null     
	//  323  687:astore          6
		obj3 = obj4;
	//  324  689:aload           9
	//  325  691:astore          8
		obj2 = ((Object) (String.valueOf(((Object) (((SQLiteException) (obj2)).getMessage())))));
	//  326  693:aload           7
	//  327  695:invokevirtual   #212 <Method String SQLiteException.getMessage()>
	//  328  698:invokestatic    #215 <Method String String.valueOf(Object)>
	//  329  701:astore          7
		if(((String) (obj2)).length() != 0)
	//* 330  703:aload           7
	//* 331  705:invokevirtual   #218 <Method int String.length()>
	//* 332  708:ifeq            723
		{
			obj2 = ((Object) ("Error in peekHits fetching hitIds: ".concat(((String) (obj2)))));
	//  333  711:ldc1            #220 <String "Error in peekHits fetching hitIds: ">
	//  334  713:aload           7
	//  335  715:invokevirtual   #224 <Method String String.concat(String)>
	//  336  718:astore          7
			break MISSING_BLOCK_LABEL_734;
	//  337  720:goto            734
		}
		obj2 = ((Object) (new String("Error in peekHits fetching hitIds: ")));
	//  338  723:new             #40  <Class String>
	//  339  726:dup             
	//  340  727:ldc1            #220 <String "Error in peekHits fetching hitIds: ">
	//  341  729:invokespecial   #226 <Method void String(String)>
	//  342  732:astore          7
		zzdi.zzab(((String) (obj2)));
	//  343  734:aload           7
	//  344  736:invokestatic    #162 <Method void zzdi.zzab(String)>
		if(obj != null)
	//* 345  739:aload           6
	//* 346  741:ifnull          751
			((Cursor) (obj)).close();
	//  347  744:aload           6
	//  348  746:invokeinterface #208 <Method void Cursor.close()>
		return ((List) (obj3));
	//  349  751:aload           8
	//  350  753:areturn         
		Exception exception;
		exception;
	//  351  754:astore          8
		obj2 = obj;
	//  352  756:aload           6
	//  353  758:astore          7
		obj = ((Object) (exception));
	//  354  760:aload           8
	//  355  762:astore          6
		if(obj2 != null)
	//* 356  764:aload           7
	//* 357  766:ifnull          776
			((Cursor) (obj2)).close();
	//  358  769:aload           7
	//  359  771:invokeinterface #208 <Method void Cursor.close()>
		throw obj;
	//  360  776:aload           6
	//  361  778:athrow          
	}

	static String zzb(zzeb zzeb1)
	{
		return zzeb1.zzbdu;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String zzbdu>
	//    2    4:areturn         
	}

	static Context zzc(zzeb zzeb1)
	{
		return zzeb1.zzri;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Context zzri>
	//    2    4:areturn         
	}

	private final SQLiteDatabase zzdl(String s)
	{
		SQLiteException sqliteexception;
		SQLiteDatabase sqlitedatabase;
		try
		{
			sqlitedatabase = zzbdr.getWritableDatabase();
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field zzed zzbdr>
	//    2    4:invokevirtual   #290 <Method SQLiteDatabase zzed.getWritableDatabase()>
	//    3    7:astore_2        
		}
	//*   4    8:aload_2         
	//*   5    9:areturn         
	//*   6   10:aload_1         
	//*   7   11:invokestatic    #162 <Method void zzdi.zzab(String)>
	//*   8   14:aconst_null     
	//*   9   15:areturn         
		// Misplaced declaration of an exception variable
		catch(SQLiteException sqliteexception)
		{
			zzdi.zzab(s);
			return null;
		}
		return sqlitedatabase;
	//*  10   16:astore_2        
	//*  11   17:goto            10
	}

	private final void zze(long l)
	{
		zza(new String[] {
			String.valueOf(l)
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       String[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:lload_1         
	//    6    8:invokestatic    #196 <Method String String.valueOf(long)>
	//    7   11:aastore         
	//    8   12:invokespecial   #292 <Method void zza(String[])>
	//    9   15:return          
	}

	private final void zze(long l, long l1)
	{
		SQLiteException sqliteexception;
		Object obj = ((Object) (zzdl("Error opening database for getNumStoredHits.")));
	//    0    0:aload_0         
	//    1    1:ldc2            #294 <String "Error opening database for getNumStoredHits.">
	//    2    4:invokespecial   #120 <Method SQLiteDatabase zzdl(String)>
	//    3    7:astore          5
		if(obj == null)
	//*   4    9:aload           5
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		ContentValues contentvalues = new ContentValues();
	//    7   15:new             #296 <Class ContentValues>
	//    8   18:dup             
	//    9   19:invokespecial   #297 <Method void ContentValues()>
	//   10   22:astore          6
		contentvalues.put("hit_first_send_time", Long.valueOf(l1));
	//   11   24:aload           6
	//   12   26:ldc1            #38  <String "hit_first_send_time">
	//   13   28:lload_3         
	//   14   29:invokestatic    #268 <Method Long Long.valueOf(long)>
	//   15   32:invokevirtual   #301 <Method void ContentValues.put(String, Long)>
		try
		{
			((SQLiteDatabase) (obj)).update("gtm_hits", contentvalues, "hit_id=?", new String[] {
				String.valueOf(l)
			});
	//   16   35:aload           5
	//   17   37:ldc1            #30  <String "gtm_hits">
	//   18   39:aload           6
	//   19   41:ldc2            #303 <String "hit_id=?">
	//   20   44:iconst_1        
	//   21   45:anewarray       String[]
	//   22   48:dup             
	//   23   49:iconst_0        
	//   24   50:lload_1         
	//   25   51:invokestatic    #196 <Method String String.valueOf(long)>
	//   26   54:aastore         
	//   27   55:invokevirtual   #307 <Method int SQLiteDatabase.update(String, ContentValues, String, String[])>
	//   28   58:pop             
			return;
	//   29   59:return          
		}
	//*  30   60:new             #309 <Class StringBuilder>
	//*  31   63:dup             
	//*  32   64:bipush          69
	//*  33   66:invokespecial   #312 <Method void StringBuilder(int)>
	//*  34   69:astore          5
	//*  35   71:aload           5
	//*  36   73:ldc2            #314 <String "Error setting HIT_FIRST_DISPATCH_TIME for hitId: ">
	//*  37   76:invokevirtual   #318 <Method StringBuilder StringBuilder.append(String)>
	//*  38   79:pop             
	//*  39   80:aload           5
	//*  40   82:lload_1         
	//*  41   83:invokevirtual   #321 <Method StringBuilder StringBuilder.append(long)>
	//*  42   86:pop             
	//*  43   87:aload           5
	//*  44   89:invokevirtual   #323 <Method String StringBuilder.toString()>
	//*  45   92:invokestatic    #162 <Method void zzdi.zzab(String)>
	//*  46   95:aload_0         
	//*  47   96:lload_1         
	//*  48   97:invokespecial   #107 <Method void zze(long)>
	//*  49  100:return          
		// Misplaced declaration of an exception variable
		catch(SQLiteException sqliteexception)
		{
			obj = ((Object) (new StringBuilder(69)));
		}
		((StringBuilder) (obj)).append("Error setting HIT_FIRST_DISPATCH_TIME for hitId: ");
		((StringBuilder) (obj)).append(l);
		zzdi.zzab(((StringBuilder) (obj)).toString());
		zze(l);
	//*  50  101:astore          5
	//*  51  103:goto            60
	}

	private final int zzpj()
	{
		int i;
		boolean flag;
		Object obj;
		Object obj1;
		Exception exception;
		obj1 = ((Object) (zzdl("Error opening database for getNumStoredHits.")));
	//    0    0:aload_0         
	//    1    1:ldc2            #294 <String "Error opening database for getNumStoredHits.">
	//    2    4:invokespecial   #120 <Method SQLiteDatabase zzdl(String)>
	//    3    7:astore          7
		flag = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_1        
		if(obj1 == null)
	//*   8   13:aload           7
	//*   9   15:ifnonnull       20
			return 0;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		exception = null;
	//   12   20:aconst_null     
	//   13   21:astore          8
		obj = null;
	//   14   23:aconst_null     
	//   15   24:astore          6
		int j;
		long l;
		try
		{
			obj1 = ((Object) (((SQLiteDatabase) (obj1)).rawQuery("SELECT COUNT(*) from gtm_hits", ((String []) (null)))));
	//   16   26:aload           7
	//   17   28:ldc2            #325 <String "SELECT COUNT(*) from gtm_hits">
	//   18   31:aconst_null     
	//   19   32:invokevirtual   #329 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
	//   20   35:astore          7
		}
	//*  21   37:aload           7
	//*  22   39:invokeinterface #188 <Method boolean Cursor.moveToFirst()>
	//*  23   44:ifeq            61
	//*  24   47:aload           7
	//*  25   49:iconst_0        
	//*  26   50:invokeinterface #192 <Method long Cursor.getLong(int)>
	//*  27   55:lstore          4
	//*  28   57:lload           4
	//*  29   59:l2i             
	//*  30   60:istore_1        
	//*  31   61:iload_1         
	//*  32   62:istore_2        
	//*  33   63:aload           7
	//*  34   65:ifnull          124
	//*  35   68:aload           7
	//*  36   70:invokeinterface #208 <Method void Cursor.close()>
	//*  37   75:iload_1         
	//*  38   76:ireturn         
	//*  39   77:astore          8
	//*  40   79:aload           7
	//*  41   81:astore          6
	//*  42   83:aload           8
	//*  43   85:astore          7
	//*  44   87:goto            126
	//*  45   90:goto            98
	//*  46   93:astore          7
	//*  47   95:goto            126
	//*  48   98:aload           7
	//*  49  100:astore          6
	//*  50  102:ldc2            #331 <String "Error getting numStoredHits">
	//*  51  105:invokestatic    #162 <Method void zzdi.zzab(String)>
	//*  52  108:iload_3         
	//*  53  109:istore_2        
	//*  54  110:aload           7
	//*  55  112:ifnull          124
	//*  56  115:aload           7
	//*  57  117:invokeinterface #208 <Method void Cursor.close()>
	//*  58  122:iload_3         
	//*  59  123:istore_2        
	//*  60  124:iload_2         
	//*  61  125:ireturn         
	//*  62  126:aload           6
	//*  63  128:ifnull          138
	//*  64  131:aload           6
	//*  65  133:invokeinterface #208 <Method void Cursor.close()>
	//*  66  138:aload           7
	//*  67  140:athrow          
		catch(SQLiteException sqliteexception)
	//*  68  141:astore          6
		{
			obj1 = ((Object) (exception));
	//   69  143:aload           8
	//   70  145:astore          7
			continue; /* Loop/switch isn't completed */
	//   71  147:goto            98
		}
		if(!((Cursor) (obj1)).moveToFirst())
			break MISSING_BLOCK_LABEL_61;
		l = ((Cursor) (obj1)).getLong(0);
		i = (int)l;
		j = i;
		if(obj1 != null)
		{
			((Cursor) (obj1)).close();
			return i;
		}
		  goto _L1
		exception;
		obj = obj1;
		obj1 = ((Object) (exception));
		  goto _L2
		obj1;
		  goto _L2
_L4:
		obj = obj1;
		zzdi.zzab("Error getting numStoredHits");
		j = ((int) (flag));
		if(obj1 != null)
		{
			((Cursor) (obj1)).close();
			j = ((int) (flag));
		}
_L1:
		return j;
_L2:
		if(obj != null)
			((Cursor) (obj)).close();
		throw obj1;
		SQLiteException sqliteexception1;
		sqliteexception1;
	//   72  150:astore          6
		if(true) goto _L4; else goto _L3
	//   73  152:goto            90
_L3:
	}

	private final int zzpk()
	{
		Object obj;
		Object obj1;
		Exception exception;
		obj1 = ((Object) (zzdl("Error opening database for getNumStoredHits.")));
	//    0    0:aload_0         
	//    1    1:ldc2            #294 <String "Error opening database for getNumStoredHits.">
	//    2    4:invokespecial   #120 <Method SQLiteDatabase zzdl(String)>
	//    3    7:astore_3        
		if(obj1 == null)
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       14
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		exception = null;
	//    8   14:aconst_null     
	//    9   15:astore          4
		obj = null;
	//   10   17:aconst_null     
	//   11   18:astore_2        
		int i;
		try
		{
			obj1 = ((Object) (((SQLiteDatabase) (obj1)).query("gtm_hits", new String[] {
				"hit_id", "hit_first_send_time"
			}, "hit_first_send_time=0", ((String []) (null)), ((String) (null)), ((String) (null)), ((String) (null)))));
	//   12   19:aload_3         
	//   13   20:ldc1            #30  <String "gtm_hits">
	//   14   22:iconst_2        
	//   15   23:anewarray       String[]
	//   16   26:dup             
	//   17   27:iconst_0        
	//   18   28:ldc1            #32  <String "hit_id">
	//   19   30:aastore         
	//   20   31:dup             
	//   21   32:iconst_1        
	//   22   33:ldc1            #38  <String "hit_first_send_time">
	//   23   35:aastore         
	//   24   36:ldc2            #334 <String "hit_first_send_time=0">
	//   25   39:aconst_null     
	//   26   40:aconst_null     
	//   27   41:aconst_null     
	//   28   42:aconst_null     
	//   29   43:invokevirtual   #337 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
	//   30   46:astore_3        
		}
	//*  31   47:aload_3         
	//*  32   48:invokeinterface #340 <Method int Cursor.getCount()>
	//*  33   53:istore_1        
	//*  34   54:aload_3         
	//*  35   55:ifnull          64
	//*  36   58:aload_3         
	//*  37   59:invokeinterface #208 <Method void Cursor.close()>
	//*  38   64:iload_1         
	//*  39   65:ireturn         
	//*  40   66:astore          4
	//*  41   68:aload_3         
	//*  42   69:astore_2        
	//*  43   70:aload           4
	//*  44   72:astore_3        
	//*  45   73:goto            103
	//*  46   76:goto            83
	//*  47   79:astore_3        
	//*  48   80:goto            103
	//*  49   83:aload_3         
	//*  50   84:astore_2        
	//*  51   85:ldc2            #342 <String "Error getting num untried hits">
	//*  52   88:invokestatic    #162 <Method void zzdi.zzab(String)>
	//*  53   91:aload_3         
	//*  54   92:ifnull          101
	//*  55   95:aload_3         
	//*  56   96:invokeinterface #208 <Method void Cursor.close()>
	//*  57  101:iconst_0        
	//*  58  102:ireturn         
	//*  59  103:aload_2         
	//*  60  104:ifnull          113
	//*  61  107:aload_2         
	//*  62  108:invokeinterface #208 <Method void Cursor.close()>
	//*  63  113:aload_3         
	//*  64  114:athrow          
		catch(SQLiteException sqliteexception)
	//*  65  115:astore_2        
		{
			obj1 = ((Object) (exception));
	//   66  116:aload           4
	//   67  118:astore_3        
			continue; /* Loop/switch isn't completed */
	//   68  119:goto            83
		}
		i = ((Cursor) (obj1)).getCount();
		if(obj1 != null)
			((Cursor) (obj1)).close();
		return i;
		exception;
		obj = obj1;
		obj1 = ((Object) (exception));
		  goto _L1
		obj1;
		  goto _L1
_L3:
		obj = obj1;
		zzdi.zzab("Error getting num untried hits");
		if(obj1 != null)
			((Cursor) (obj1)).close();
		return 0;
_L1:
		if(obj != null)
			((Cursor) (obj)).close();
		throw obj1;
		SQLiteException sqliteexception1;
		sqliteexception1;
	//   69  122:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  70  123:goto            76
	}

	static String zzpl()
	{
		return zzxf;
	//    0    0:getstatic       #46  <Field String zzxf>
	//    1    3:areturn         
	}

	public final void dispatch()
	{
		zzdi.v("GTM Dispatch running...");
	//    0    0:ldc2            #346 <String "GTM Dispatch running...">
	//    1    3:invokestatic    #349 <Method void zzdi.v(String)>
		if(!zzbds.zzom())
	//*   2    6:aload_0         
	//*   3    7:getfield        #95  <Field zzbe zzbds>
	//*   4   10:invokeinterface #354 <Method boolean zzbe.zzom()>
	//*   5   15:ifne            19
			return;
	//    6   18:return          
		List list = zzac(40);
	//    7   19:aload_0         
	//    8   20:bipush          40
	//    9   22:invokespecial   #356 <Method List zzac(int)>
	//   10   25:astore_1        
		if(list.isEmpty())
	//*  11   26:aload_1         
	//*  12   27:invokeinterface #358 <Method boolean List.isEmpty()>
	//*  13   32:ifeq            52
		{
			zzdi.v("...nothing to dispatch");
	//   14   35:ldc2            #360 <String "...nothing to dispatch">
	//   15   38:invokestatic    #349 <Method void zzdi.v(String)>
			zzbdt.zzo(true);
	//   16   41:aload_0         
	//   17   42:getfield        #68  <Field zzcc zzbdt>
	//   18   45:iconst_1        
	//   19   46:invokeinterface #154 <Method void zzcc.zzo(boolean)>
			return;
	//   20   51:return          
		}
		zzbds.zzf(list);
	//   21   52:aload_0         
	//   22   53:getfield        #95  <Field zzbe zzbds>
	//   23   56:aload_1         
	//   24   57:invokeinterface #364 <Method void zzbe.zzf(List)>
		if(zzpk() > 0)
	//*  25   62:aload_0         
	//*  26   63:invokespecial   #366 <Method int zzpk()>
	//*  27   66:ifle            75
			((zzfm) (zzfn.zzqe())).dispatch();
	//   28   69:invokestatic    #372 <Method zzfn zzfn.zzqe()>
	//   29   72:invokevirtual   #376 <Method void zzfm.dispatch()>
	//   30   75:return          
	}

	public final void zzb(long l, String s)
	{
		long l1 = zzrz.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Clock zzrz>
	//    2    4:invokeinterface #382 <Method long Clock.currentTimeMillis()>
	//    3    9:lstore          5
		if(l1 > zzbdv + 0x5265c00L)
	//*   4   11:lload           5
	//*   5   13:aload_0         
	//*   6   14:getfield        #97  <Field long zzbdv>
	//*   7   17:ldc2w           #383 <Long 0x5265c00L>
	//*   8   20:ladd            
	//*   9   21:lcmp            
	//*  10   22:ifle            110
		{
			zzbdv = l1;
	//   11   25:aload_0         
	//   12   26:lload           5
	//   13   28:putfield        #97  <Field long zzbdv>
			Object obj = ((Object) (zzdl("Error opening database for deleteStaleHits.")));
	//   14   31:aload_0         
	//   15   32:ldc2            #386 <String "Error opening database for deleteStaleHits.">
	//   16   35:invokespecial   #120 <Method SQLiteDatabase zzdl(String)>
	//   17   38:astore          8
			if(obj != null)
	//*  18   40:aload           8
	//*  19   42:ifnull          110
			{
				((SQLiteDatabase) (obj)).delete("gtm_hits", "HIT_TIME < ?", new String[] {
					Long.toString(zzrz.currentTimeMillis() - 0x9a7ec800L)
				});
	//   20   45:aload           8
	//   21   47:ldc1            #30  <String "gtm_hits">
	//   22   49:ldc2            #388 <String "HIT_TIME < ?">
	//   23   52:iconst_1        
	//   24   53:anewarray       String[]
	//   25   56:dup             
	//   26   57:iconst_0        
	//   27   58:aload_0         
	//   28   59:getfield        #76  <Field Clock zzrz>
	//   29   62:invokeinterface #382 <Method long Clock.currentTimeMillis()>
	//   30   67:ldc2w           #389 <Long 0x9a7ec800L>
	//   31   70:lsub            
	//   32   71:invokestatic    #392 <Method String Long.toString(long)>
	//   33   74:aastore         
	//   34   75:invokevirtual   #144 <Method int SQLiteDatabase.delete(String, String, String[])>
	//   35   78:pop             
				obj = ((Object) (zzbdt));
	//   36   79:aload_0         
	//   37   80:getfield        #68  <Field zzcc zzbdt>
	//   38   83:astore          8
				boolean flag;
				if(zzpj() == 0)
	//*  39   85:aload_0         
	//*  40   86:invokespecial   #148 <Method int zzpj()>
	//*  41   89:ifne            98
					flag = true;
	//   42   92:iconst_1        
	//   43   93:istore          7
				else
	//*  44   95:goto            101
					flag = false;
	//   45   98:iconst_0        
	//   46   99:istore          7
				((zzcc) (obj)).zzo(flag);
	//   47  101:aload           8
	//   48  103:iload           7
	//   49  105:invokeinterface #154 <Method void zzcc.zzo(boolean)>
			}
		}
		int i = (zzpj() - zzbdw) + 1;
	//   50  110:aload_0         
	//   51  111:invokespecial   #148 <Method int zzpj()>
	//   52  114:aload_0         
	//   53  115:getfield        #99  <Field int zzbdw>
	//   54  118:isub            
	//   55  119:iconst_1        
	//   56  120:iadd            
	//   57  121:istore          4
		if(i > 0)
	//*  58  123:iload           4
	//*  59  125:ifle            208
		{
			List list = zzab(i);
	//   60  128:aload_0         
	//   61  129:iload           4
	//   62  131:invokespecial   #394 <Method List zzab(int)>
	//   63  134:astore          8
			i = list.size();
	//   64  136:aload           8
	//   65  138:invokeinterface #395 <Method int List.size()>
	//   66  143:istore          4
			StringBuilder stringbuilder = new StringBuilder(51);
	//   67  145:new             #309 <Class StringBuilder>
	//   68  148:dup             
	//   69  149:bipush          51
	//   70  151:invokespecial   #312 <Method void StringBuilder(int)>
	//   71  154:astore          9
			stringbuilder.append("Store full, deleting ");
	//   72  156:aload           9
	//   73  158:ldc2            #397 <String "Store full, deleting ">
	//   74  161:invokevirtual   #318 <Method StringBuilder StringBuilder.append(String)>
	//   75  164:pop             
			stringbuilder.append(i);
	//   76  165:aload           9
	//   77  167:iload           4
	//   78  169:invokevirtual   #400 <Method StringBuilder StringBuilder.append(int)>
	//   79  172:pop             
			stringbuilder.append(" hits to make room.");
	//   80  173:aload           9
	//   81  175:ldc2            #402 <String " hits to make room.">
	//   82  178:invokevirtual   #318 <Method StringBuilder StringBuilder.append(String)>
	//   83  181:pop             
			zzdi.v(stringbuilder.toString());
	//   84  182:aload           9
	//   85  184:invokevirtual   #323 <Method String StringBuilder.toString()>
	//   86  187:invokestatic    #349 <Method void zzdi.v(String)>
			zza((String[])list.toArray(((Object []) (new String[0]))));
	//   87  190:aload_0         
	//   88  191:aload           8
	//   89  193:iconst_0        
	//   90  194:anewarray       String[]
	//   91  197:invokeinterface #406 <Method Object[] List.toArray(Object[])>
	//   92  202:checkcast       #408 <Class String[]>
	//   93  205:invokespecial   #292 <Method void zza(String[])>
		}
		SQLiteDatabase sqlitedatabase = zzdl("Error opening database for putHit");
	//   94  208:aload_0         
	//   95  209:ldc2            #410 <String "Error opening database for putHit">
	//   96  212:invokespecial   #120 <Method SQLiteDatabase zzdl(String)>
	//   97  215:astore          8
		if(sqlitedatabase != null)
	//*  98  217:aload           8
	//*  99  219:ifnull          289
		{
			ContentValues contentvalues = new ContentValues();
	//  100  222:new             #296 <Class ContentValues>
	//  101  225:dup             
	//  102  226:invokespecial   #297 <Method void ContentValues()>
	//  103  229:astore          9
			contentvalues.put("hit_time", Long.valueOf(l));
	//  104  231:aload           9
	//  105  233:ldc1            #34  <String "hit_time">
	//  106  235:lload_1         
	//  107  236:invokestatic    #268 <Method Long Long.valueOf(long)>
	//  108  239:invokevirtual   #301 <Method void ContentValues.put(String, Long)>
			contentvalues.put("hit_url", s);
	//  109  242:aload           9
	//  110  244:ldc1            #36  <String "hit_url">
	//  111  246:aload_3         
	//  112  247:invokevirtual   #413 <Method void ContentValues.put(String, String)>
			contentvalues.put("hit_first_send_time", Integer.valueOf(0));
	//  113  250:aload           9
	//  114  252:ldc1            #38  <String "hit_first_send_time">
	//  115  254:iconst_0        
	//  116  255:invokestatic    #416 <Method Integer Integer.valueOf(int)>
	//  117  258:invokevirtual   #419 <Method void ContentValues.put(String, Integer)>
			try
			{
				sqlitedatabase.insert("gtm_hits", ((String) (null)), contentvalues);
	//  118  261:aload           8
	//  119  263:ldc1            #30  <String "gtm_hits">
	//  120  265:aconst_null     
	//  121  266:aload           9
	//  122  268:invokevirtual   #423 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
	//  123  271:pop2            
				zzbdt.zzo(false);
	//  124  272:aload_0         
	//  125  273:getfield        #68  <Field zzcc zzbdt>
	//  126  276:iconst_0        
	//  127  277:invokeinterface #154 <Method void zzcc.zzo(boolean)>
				return;
	//  128  282:return          
			}
	//* 129  283:ldc2            #425 <String "Error storing hit">
	//* 130  286:invokestatic    #162 <Method void zzdi.zzab(String)>
	//* 131  289:return          
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				zzdi.zzab("Error storing hit");
			}
		}
	//* 132  290:astore_3        
	//* 133  291:goto            283
	}

	private static final String zzxf = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", new Object[] {
		"gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time"
	});
	private final zzed zzbdr;
	private volatile zzbe zzbds;
	private final zzcc zzbdt;
	private final String zzbdu;
	private long zzbdv;
	private final int zzbdw;
	private final Context zzri;
	private Clock zzrz;

	static 
	{
	//    0    0:ldc1            #28  <String "CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);">
	//    1    2:iconst_5        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #30  <String "gtm_hits">
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:ldc1            #32  <String "hit_id">
	//   10   15:aastore         
	//   11   16:dup             
	//   12   17:iconst_2        
	//   13   18:ldc1            #34  <String "hit_time">
	//   14   20:aastore         
	//   15   21:dup             
	//   16   22:iconst_3        
	//   17   23:ldc1            #36  <String "hit_url">
	//   18   25:aastore         
	//   19   26:dup             
	//   20   27:iconst_4        
	//   21   28:ldc1            #38  <String "hit_first_send_time">
	//   22   30:aastore         
	//   23   31:invokestatic    #44  <Method String String.format(String, Object[])>
	//   24   34:putstatic       #46  <Field String zzxf>
	//*  25   37:return          
	}
}
