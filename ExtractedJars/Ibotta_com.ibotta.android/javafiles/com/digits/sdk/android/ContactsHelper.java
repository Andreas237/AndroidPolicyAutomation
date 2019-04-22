// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.*;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import com.digits.sdk.vcard.VCardBuilder;
import java.util.*;

class ContactsHelper
{

	ContactsHelper(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field Context context>
	//    5    9:return          
	}

	private List processContactsMap(Map map)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #46  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void ArrayList()>
	//    3    7:astore          5
		HashMap hashmap = new HashMap();
	//    4    9:new             #49  <Class HashMap>
	//    5   12:dup             
	//    6   13:invokespecial   #50  <Method void HashMap()>
	//    7   16:astore          6
		VCardBuilder vcardbuilder = new VCardBuilder(0xc0000001, "UTF-8");
	//    8   18:new             #52  <Class VCardBuilder>
	//    9   21:dup             
	//   10   22:ldc1            #53  <Int 0xc0000001>
	//   11   24:ldc1            #55  <String "UTF-8">
	//   12   26:invokespecial   #58  <Method void VCardBuilder(int, String)>
	//   13   29:astore          7
		Iterator iterator = map.keySet().iterator();
	//   14   31:aload_1         
	//   15   32:invokeinterface #64  <Method Set Map.keySet()>
	//   16   37:invokeinterface #70  <Method Iterator Set.iterator()>
	//   17   42:astore          8
		do
		{
			if(!iterator.hasNext())
				break;
	//   18   44:aload           8
	//   19   46:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//   20   51:ifeq            274
			Object obj = ((Object) ((List)map.get(((Object) ((String)iterator.next())))));
	//   21   54:aload_1         
	//   22   55:aload           8
	//   23   57:invokeinterface #80  <Method Object Iterator.next()>
	//   24   62:checkcast       #13  <Class String>
	//   25   65:invokeinterface #84  <Method Object Map.get(Object)>
	//   26   70:checkcast       #86  <Class List>
	//   27   73:astore_3        
			boolean flag = false;
	//   28   74:iconst_0        
	//   29   75:istore_2        
			((Map) (hashmap)).clear();
	//   30   76:aload           6
	//   31   78:invokeinterface #89  <Method void Map.clear()>
			vcardbuilder.clear();
	//   32   83:aload           7
	//   33   85:invokevirtual   #90  <Method void VCardBuilder.clear()>
			ContentValues contentvalues;
			for(Iterator iterator1 = ((List) (obj)).iterator(); iterator1.hasNext(); ((List) (obj)).add(((Object) (contentvalues))))
	//*  34   88:aload_3         
	//*  35   89:invokeinterface #91  <Method Iterator List.iterator()>
	//*  36   94:astore          9
	//*  37   96:aload           9
	//*  38   98:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//*  39  103:ifeq            202
			{
				contentvalues = (ContentValues)iterator1.next();
	//   40  106:aload           9
	//   41  108:invokeinterface #80  <Method Object Iterator.next()>
	//   42  113:checkcast       #93  <Class ContentValues>
	//   43  116:astore          10
				String s = contentvalues.getAsString("mimetype");
	//   44  118:aload           10
	//   45  120:ldc1            #15  <String "mimetype">
	//   46  122:invokevirtual   #97  <Method String ContentValues.getAsString(String)>
	//   47  125:astore          11
				if("vnd.android.cursor.item/phone_v2".equals(((Object) (s))) || "vnd.android.cursor.item/email_v2".equals(((Object) (s))))
	//*  48  127:ldc1            #29  <String "vnd.android.cursor.item/phone_v2">
	//*  49  129:aload           11
	//*  50  131:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  51  134:ifne            147
	//*  52  137:ldc1            #31  <String "vnd.android.cursor.item/email_v2">
	//*  53  139:aload           11
	//*  54  141:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  55  144:ifeq            149
					flag = true;
	//   56  147:iconst_1        
	//   57  148:istore_2        
				List list = (List)((Map) (hashmap)).get(((Object) (s)));
	//   58  149:aload           6
	//   59  151:aload           11
	//   60  153:invokeinterface #84  <Method Object Map.get(Object)>
	//   61  158:checkcast       #86  <Class List>
	//   62  161:astore          4
				obj = ((Object) (list));
	//   63  163:aload           4
	//   64  165:astore_3        
				if(list == null)
	//*  65  166:aload           4
	//*  66  168:ifnonnull       190
				{
					obj = ((Object) (new ArrayList()));
	//   67  171:new             #46  <Class ArrayList>
	//   68  174:dup             
	//   69  175:invokespecial   #47  <Method void ArrayList()>
	//   70  178:astore_3        
					((Map) (hashmap)).put(((Object) (s)), obj);
	//   71  179:aload           6
	//   72  181:aload           11
	//   73  183:aload_3         
	//   74  184:invokeinterface #105 <Method Object Map.put(Object, Object)>
	//   75  189:pop             
				}
			}

	//   76  190:aload_3         
	//   77  191:aload           10
	//   78  193:invokeinterface #108 <Method boolean List.add(Object)>
	//   79  198:pop             
	//*  80  199:goto            96
			if(flag)
	//*  81  202:iload_2         
	//*  82  203:ifne            209
	//*  83  206:goto            44
			{
				vcardbuilder.appendNameProperties((List)((Map) (hashmap)).get("vnd.android.cursor.item/name")).appendPhones((List)((Map) (hashmap)).get("vnd.android.cursor.item/phone_v2"), ((com.digits.sdk.vcard.VCardPhoneNumberTranslationCallback) (null))).appendEmails((List)((Map) (hashmap)).get("vnd.android.cursor.item/email_v2"));
	//   84  209:aload           7
	//   85  211:aload           6
	//   86  213:ldc1            #33  <String "vnd.android.cursor.item/name">
	//   87  215:invokeinterface #84  <Method Object Map.get(Object)>
	//   88  220:checkcast       #86  <Class List>
	//   89  223:invokevirtual   #112 <Method VCardBuilder VCardBuilder.appendNameProperties(List)>
	//   90  226:aload           6
	//   91  228:ldc1            #29  <String "vnd.android.cursor.item/phone_v2">
	//   92  230:invokeinterface #84  <Method Object Map.get(Object)>
	//   93  235:checkcast       #86  <Class List>
	//   94  238:aconst_null     
	//   95  239:invokevirtual   #116 <Method VCardBuilder VCardBuilder.appendPhones(List, com.digits.sdk.vcard.VCardPhoneNumberTranslationCallback)>
	//   96  242:aload           6
	//   97  244:ldc1            #31  <String "vnd.android.cursor.item/email_v2">
	//   98  246:invokeinterface #84  <Method Object Map.get(Object)>
	//   99  251:checkcast       #86  <Class List>
	//  100  254:invokevirtual   #119 <Method VCardBuilder VCardBuilder.appendEmails(List)>
	//  101  257:pop             
				((List) (arraylist)).add(((Object) (vcardbuilder.toString())));
	//  102  258:aload           5
	//  103  260:aload           7
	//  104  262:invokevirtual   #123 <Method String VCardBuilder.toString()>
	//  105  265:invokeinterface #108 <Method boolean List.add(Object)>
	//  106  270:pop             
			}
		} while(true);
	//  107  271:goto            44
		return ((List) (arraylist));
	//  108  274:aload           5
	//  109  276:areturn         
	}

	public List createContactList(Cursor cursor)
	{
		if(cursor != null && cursor.getCount() != 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          355
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #133 <Method int Cursor.getCount()>
	//*   4   10:ifne            16
	//*   5   13:goto            355
		{
			int i = cursor.getColumnIndex("mimetype");
	//    6   16:aload_1         
	//    7   17:ldc1            #15  <String "mimetype">
	//    8   19:invokeinterface #137 <Method int Cursor.getColumnIndex(String)>
	//    9   24:istore_3        
			int j = cursor.getColumnIndex("lookup");
	//   10   25:aload_1         
	//   11   26:ldc1            #17  <String "lookup">
	//   12   28:invokeinterface #137 <Method int Cursor.getColumnIndex(String)>
	//   13   33:istore          4
			HashMap hashmap = new HashMap();
	//   14   35:new             #49  <Class HashMap>
	//   15   38:dup             
	//   16   39:invokespecial   #50  <Method void HashMap()>
	//   17   42:astore          8
			do
			{
				if(!cursor.moveToNext())
					break;
	//   18   44:aload_1         
	//   19   45:invokeinterface #140 <Method boolean Cursor.moveToNext()>
	//   20   50:ifeq            348
				Object obj = ((Object) (cursor.getString(i)));
	//   21   53:aload_1         
	//   22   54:iload_3         
	//   23   55:invokeinterface #144 <Method String Cursor.getString(int)>
	//   24   60:astore          6
				ContentValues contentvalues = new ContentValues();
	//   25   62:new             #93  <Class ContentValues>
	//   26   65:dup             
	//   27   66:invokespecial   #145 <Method void ContentValues()>
	//   28   69:astore          9
				contentvalues.put("mimetype", ((String) (obj)));
	//   29   71:aload           9
	//   30   73:ldc1            #15  <String "mimetype">
	//   31   75:aload           6
	//   32   77:invokevirtual   #148 <Method void ContentValues.put(String, String)>
				byte byte0 = -1;
	//   33   80:iconst_m1       
	//   34   81:istore_2        
				int k = ((String) (obj)).hashCode();
	//   35   82:aload           6
	//   36   84:invokevirtual   #151 <Method int String.hashCode()>
	//   37   87:istore          5
				if(k != 0xa272c504)
	//*  38   89:iload           5
	//*  39   91:ldc1            #152 <Int 0xa272c504>
	//*  40   93:icmpeq          143
				{
					if(k != 0xbfac5810)
	//*  41   96:iload           5
	//*  42   98:ldc1            #153 <Int 0xbfac5810>
	//*  43  100:icmpeq          128
					{
						if(k == 0x28c7a9f2 && ((String) (obj)).equals("vnd.android.cursor.item/phone_v2"))
	//*  44  103:iload           5
	//*  45  105:ldc1            #154 <Int 0x28c7a9f2>
	//*  46  107:icmpeq          113
	//*  47  110:goto            155
	//*  48  113:aload           6
	//*  49  115:ldc1            #29  <String "vnd.android.cursor.item/phone_v2">
	//*  50  117:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  51  120:ifeq            155
							byte0 = 0;
	//   52  123:iconst_0        
	//   53  124:istore_2        
					} else
	//*  54  125:goto            155
					if(((String) (obj)).equals("vnd.android.cursor.item/name"))
	//*  55  128:aload           6
	//*  56  130:ldc1            #33  <String "vnd.android.cursor.item/name">
	//*  57  132:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  58  135:ifeq            155
						byte0 = 2;
	//   59  138:iconst_2        
	//   60  139:istore_2        
				} else
	//*  61  140:goto            155
				if(((String) (obj)).equals("vnd.android.cursor.item/email_v2"))
	//*  62  143:aload           6
	//*  63  145:ldc1            #31  <String "vnd.android.cursor.item/email_v2">
	//*  64  147:invokevirtual   #101 <Method boolean String.equals(Object)>
	//*  65  150:ifeq            155
					byte0 = 1;
	//   66  153:iconst_1        
	//   67  154:istore_2        
				switch(byte0)
	//*  68  155:iload_2         
				{
	//*  69  156:tableswitch     0 2: default 184
	//	               0 249
	//	               1 214
	//	               2 187
				default:
					continue;
	//   70  184:goto            44

				case 2: // '\002'
					DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentvalues, "data1");
	//   71  187:aload_1         
	//   72  188:aload           9
	//   73  190:ldc1            #25  <String "data1">
	//   74  192:invokestatic    #160 <Method void DatabaseUtils.cursorStringToContentValuesIfPresent(Cursor, ContentValues, String)>
					DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentvalues, "data2");
	//   75  195:aload_1         
	//   76  196:aload           9
	//   77  198:ldc1            #19  <String "data2">
	//   78  200:invokestatic    #160 <Method void DatabaseUtils.cursorStringToContentValuesIfPresent(Cursor, ContentValues, String)>
					DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentvalues, "data3");
	//   79  203:aload_1         
	//   80  204:aload           9
	//   81  206:ldc1            #21  <String "data3">
	//   82  208:invokestatic    #160 <Method void DatabaseUtils.cursorStringToContentValuesIfPresent(Cursor, ContentValues, String)>
					break;
	//   83  211:goto            281

				case 1: // '\001'
					DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentvalues, "data1");
	//   84  214:aload_1         
	//   85  215:aload           9
	//   86  217:ldc1            #25  <String "data1">
	//   87  219:invokestatic    #160 <Method void DatabaseUtils.cursorStringToContentValuesIfPresent(Cursor, ContentValues, String)>
					DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentvalues, "data2");
	//   88  222:aload_1         
	//   89  223:aload           9
	//   90  225:ldc1            #19  <String "data2">
	//   91  227:invokestatic    #163 <Method void DatabaseUtils.cursorIntToContentValuesIfPresent(Cursor, ContentValues, String)>
					DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentvalues, "data3");
	//   92  230:aload_1         
	//   93  231:aload           9
	//   94  233:ldc1            #21  <String "data3">
	//   95  235:invokestatic    #160 <Method void DatabaseUtils.cursorStringToContentValuesIfPresent(Cursor, ContentValues, String)>
					DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentvalues, "is_primary");
	//   96  238:aload_1         
	//   97  239:aload           9
	//   98  241:ldc1            #23  <String "is_primary">
	//   99  243:invokestatic    #163 <Method void DatabaseUtils.cursorIntToContentValuesIfPresent(Cursor, ContentValues, String)>
					break;
	//  100  246:goto            281

				case 0: // '\0'
					DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentvalues, "data2");
	//  101  249:aload_1         
	//  102  250:aload           9
	//  103  252:ldc1            #19  <String "data2">
	//  104  254:invokestatic    #163 <Method void DatabaseUtils.cursorIntToContentValuesIfPresent(Cursor, ContentValues, String)>
					DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentvalues, "data3");
	//  105  257:aload_1         
	//  106  258:aload           9
	//  107  260:ldc1            #21  <String "data3">
	//  108  262:invokestatic    #160 <Method void DatabaseUtils.cursorStringToContentValuesIfPresent(Cursor, ContentValues, String)>
					DatabaseUtils.cursorIntToContentValuesIfPresent(cursor, contentvalues, "is_primary");
	//  109  265:aload_1         
	//  110  266:aload           9
	//  111  268:ldc1            #23  <String "is_primary">
	//  112  270:invokestatic    #163 <Method void DatabaseUtils.cursorIntToContentValuesIfPresent(Cursor, ContentValues, String)>
					DatabaseUtils.cursorStringToContentValuesIfPresent(cursor, contentvalues, "data1");
	//  113  273:aload_1         
	//  114  274:aload           9
	//  115  276:ldc1            #25  <String "data1">
	//  116  278:invokestatic    #160 <Method void DatabaseUtils.cursorStringToContentValuesIfPresent(Cursor, ContentValues, String)>
					break;
				}
				String s = cursor.getString(j);
	//  117  281:aload_1         
	//  118  282:iload           4
	//  119  284:invokeinterface #144 <Method String Cursor.getString(int)>
	//  120  289:astore          10
				List list = (List)((Map) (hashmap)).get(((Object) (s)));
	//  121  291:aload           8
	//  122  293:aload           10
	//  123  295:invokeinterface #84  <Method Object Map.get(Object)>
	//  124  300:checkcast       #86  <Class List>
	//  125  303:astore          7
				obj = ((Object) (list));
	//  126  305:aload           7
	//  127  307:astore          6
				if(list == null)
	//* 128  309:aload           7
	//* 129  311:ifnonnull       335
				{
					obj = ((Object) (new ArrayList()));
	//  130  314:new             #46  <Class ArrayList>
	//  131  317:dup             
	//  132  318:invokespecial   #47  <Method void ArrayList()>
	//  133  321:astore          6
					((Map) (hashmap)).put(((Object) (s)), obj);
	//  134  323:aload           8
	//  135  325:aload           10
	//  136  327:aload           6
	//  137  329:invokeinterface #105 <Method Object Map.put(Object, Object)>
	//  138  334:pop             
				}
				((List) (obj)).add(((Object) (contentvalues)));
	//  139  335:aload           6
	//  140  337:aload           9
	//  141  339:invokeinterface #108 <Method boolean List.add(Object)>
	//  142  344:pop             
			} while(true);
	//  143  345:goto            44
			return processContactsMap(((Map) (hashmap)));
	//  144  348:aload_0         
	//  145  349:aload           8
	//  146  351:invokespecial   #165 <Method List processContactsMap(Map)>
	//  147  354:areturn         
		} else
		{
			return Collections.emptyList();
	//  148  355:invokestatic    #171 <Method List Collections.emptyList()>
	//  149  358:areturn         
		}
	}

	public Cursor getContactsCursor()
	{
		HashSet hashset = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (allProjectionColumns))))));
	//    0    0:new             #176 <Class HashSet>
	//    1    3:dup             
	//    2    4:getstatic       #27  <Field String[] allProjectionColumns>
	//    3    7:invokestatic    #182 <Method List Arrays.asList(Object[])>
	//    4   10:invokespecial   #185 <Method void HashSet(java.util.Collection)>
	//    5   13:astore_1        
		String as[] = (String[])hashset.toArray(((Object []) (new String[hashset.size()])));
	//    6   14:aload_1         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #188 <Method int HashSet.size()>
	//    9   19:anewarray       String[]
	//   10   22:invokevirtual   #192 <Method Object[] HashSet.toArray(Object[])>
	//   11   25:checkcast       #193 <Class String[]>
	//   12   28:astore_1        
		Uri uri = android.provider.ContactsContract.Data.CONTENT_URI.buildUpon().appendQueryParameter("limit", Integer.toString(2500)).build();
	//   13   29:getstatic       #199 <Field Uri android.provider.ContactsContract$Data.CONTENT_URI>
	//   14   32:invokevirtual   #205 <Method android.net.Uri$Builder Uri.buildUpon()>
	//   15   35:ldc1            #207 <String "limit">
	//   16   37:sipush          2500
	//   17   40:invokestatic    #211 <Method String Integer.toString(int)>
	//   18   43:invokevirtual   #217 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   19   46:invokevirtual   #221 <Method Uri android.net.Uri$Builder.build()>
	//   20   49:astore_2        
		return context.getContentResolver().query(uri, as, "mimetype=? OR mimetype=? OR mimetype=?", selectionArgs, ((String) (null)));
	//   21   50:aload_0         
	//   22   51:getfield        #42  <Field Context context>
	//   23   54:invokevirtual   #227 <Method ContentResolver Context.getContentResolver()>
	//   24   57:aload_2         
	//   25   58:aload_1         
	//   26   59:ldc1            #229 <String "mimetype=? OR mimetype=? OR mimetype=?">
	//   27   61:getstatic       #35  <Field String[] selectionArgs>
	//   28   64:aconst_null     
	//   29   65:invokevirtual   #235 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   30   68:areturn         
	}

	private static final String allProjectionColumns[] = {
		"mimetype", "lookup", "data2", "data3", "is_primary", "data1", "data1", "data2", "data3", "is_primary", 
		"data1", "data2", "data3"
	};
	private static final String selectionArgs[] = {
		"vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/name"
	};
	private final Context context;

	static 
	{
	//    0    0:bipush          13
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #15  <String "mimetype">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #17  <String "lookup">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #19  <String "data2">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #21  <String "data3">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #23  <String "is_primary">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #25  <String "data1">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #25  <String "data1">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #19  <String "data2">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #21  <String "data3">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #23  <String "is_primary">
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #25  <String "data1">
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #19  <String "data2">
	//   49   70:aastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #21  <String "data3">
	//   53   76:aastore         
	//   54   77:putstatic       #27  <Field String[] allProjectionColumns>
	//   55   80:iconst_3        
	//   56   81:anewarray       String[]
	//   57   84:dup             
	//   58   85:iconst_0        
	//   59   86:ldc1            #29  <String "vnd.android.cursor.item/phone_v2">
	//   60   88:aastore         
	//   61   89:dup             
	//   62   90:iconst_1        
	//   63   91:ldc1            #31  <String "vnd.android.cursor.item/email_v2">
	//   64   93:aastore         
	//   65   94:dup             
	//   66   95:iconst_2        
	//   67   96:ldc1            #33  <String "vnd.android.cursor.item/name">
	//   68   98:aastore         
	//   69   99:putstatic       #35  <Field String[] selectionArgs>
	//*  70  102:return          
	}
}
