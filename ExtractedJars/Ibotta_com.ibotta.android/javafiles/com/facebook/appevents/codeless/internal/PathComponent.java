// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless.internal;

import org.json.JSONException;
import org.json.JSONObject;

public final class PathComponent
{
	public static final class MatchBitmaskType extends Enum
	{

		public static MatchBitmaskType valueOf(String s)
		{
			return (MatchBitmaskType)Enum.valueOf(com/facebook/appevents/codeless/internal/PathComponent$MatchBitmaskType, s);
		//    0    0:ldc1            #2   <Class PathComponent$MatchBitmaskType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #54  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PathComponent$MatchBitmaskType>
		//    4    9:areturn         
		}

		public static MatchBitmaskType[] values()
		{
			return (MatchBitmaskType[])((MatchBitmaskType []) ($VALUES)).clone();
		//    0    0:getstatic       #41  <Field PathComponent$MatchBitmaskType[] $VALUES>
		//    1    3:invokevirtual   #61  <Method Object _5B_Lcom.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType_3B_.clone()>
		//    2    6:checkcast       #57  <Class PathComponent$MatchBitmaskType[]>
		//    3    9:areturn         
		}

		public int getValue()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field int value>
		//    2    4:ireturn         
		}

		private static final MatchBitmaskType $VALUES[];
		public static final MatchBitmaskType DESCRIPTION;
		public static final MatchBitmaskType HINT;
		public static final MatchBitmaskType ID;
		public static final MatchBitmaskType TAG;
		public static final MatchBitmaskType TEXT;
		private final int value;

		static 
		{
			ID = new MatchBitmaskType("ID", 0, 1);
		//    0    0:new             #2   <Class PathComponent$MatchBitmaskType>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "ID">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #25  <Method void PathComponent$MatchBitmaskType(String, int, int)>
		//    6   11:putstatic       #27  <Field PathComponent$MatchBitmaskType ID>
			TEXT = new MatchBitmaskType("TEXT", 1, 2);
		//    7   14:new             #2   <Class PathComponent$MatchBitmaskType>
		//    8   17:dup             
		//    9   18:ldc1            #28  <String "TEXT">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #25  <Method void PathComponent$MatchBitmaskType(String, int, int)>
		//   13   25:putstatic       #30  <Field PathComponent$MatchBitmaskType TEXT>
			TAG = new MatchBitmaskType("TAG", 2, 4);
		//   14   28:new             #2   <Class PathComponent$MatchBitmaskType>
		//   15   31:dup             
		//   16   32:ldc1            #31  <String "TAG">
		//   17   34:iconst_2        
		//   18   35:iconst_4        
		//   19   36:invokespecial   #25  <Method void PathComponent$MatchBitmaskType(String, int, int)>
		//   20   39:putstatic       #33  <Field PathComponent$MatchBitmaskType TAG>
			DESCRIPTION = new MatchBitmaskType("DESCRIPTION", 3, 8);
		//   21   42:new             #2   <Class PathComponent$MatchBitmaskType>
		//   22   45:dup             
		//   23   46:ldc1            #34  <String "DESCRIPTION">
		//   24   48:iconst_3        
		//   25   49:bipush          8
		//   26   51:invokespecial   #25  <Method void PathComponent$MatchBitmaskType(String, int, int)>
		//   27   54:putstatic       #36  <Field PathComponent$MatchBitmaskType DESCRIPTION>
			HINT = new MatchBitmaskType("HINT", 4, 16);
		//   28   57:new             #2   <Class PathComponent$MatchBitmaskType>
		//   29   60:dup             
		//   30   61:ldc1            #37  <String "HINT">
		//   31   63:iconst_4        
		//   32   64:bipush          16
		//   33   66:invokespecial   #25  <Method void PathComponent$MatchBitmaskType(String, int, int)>
		//   34   69:putstatic       #39  <Field PathComponent$MatchBitmaskType HINT>
			$VALUES = (new MatchBitmaskType[] {
				ID, TEXT, TAG, DESCRIPTION, HINT
			});
		//   35   72:iconst_5        
		//   36   73:anewarray       MatchBitmaskType[]
		//   37   76:dup             
		//   38   77:iconst_0        
		//   39   78:getstatic       #27  <Field PathComponent$MatchBitmaskType ID>
		//   40   81:aastore         
		//   41   82:dup             
		//   42   83:iconst_1        
		//   43   84:getstatic       #30  <Field PathComponent$MatchBitmaskType TEXT>
		//   44   87:aastore         
		//   45   88:dup             
		//   46   89:iconst_2        
		//   47   90:getstatic       #33  <Field PathComponent$MatchBitmaskType TAG>
		//   48   93:aastore         
		//   49   94:dup             
		//   50   95:iconst_3        
		//   51   96:getstatic       #36  <Field PathComponent$MatchBitmaskType DESCRIPTION>
		//   52   99:aastore         
		//   53  100:dup             
		//   54  101:iconst_4        
		//   55  102:getstatic       #39  <Field PathComponent$MatchBitmaskType HINT>
		//   56  105:aastore         
		//   57  106:putstatic       #41  <Field PathComponent$MatchBitmaskType[] $VALUES>
		//*  58  109:return          
		}

		private MatchBitmaskType(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #47  <Field int value>
		//    7   11:return          
		}
	}


	PathComponent(JSONObject jsonobject)
		throws JSONException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		className = jsonobject.getString("class_name");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #26  <String "class_name">
	//    5    8:invokevirtual   #32  <Method String JSONObject.getString(String)>
	//    6   11:putfield        #34  <Field String className>
		index = jsonobject.optInt("index", -1);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc1            #35  <String "index">
	//   10   18:iconst_m1       
	//   11   19:invokevirtual   #39  <Method int JSONObject.optInt(String, int)>
	//   12   22:putfield        #41  <Field int index>
		id = jsonobject.optInt("id");
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:ldc1            #42  <String "id">
	//   16   29:invokevirtual   #45  <Method int JSONObject.optInt(String)>
	//   17   32:putfield        #47  <Field int id>
		text = jsonobject.optString("text");
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:ldc1            #48  <String "text">
	//   21   39:invokevirtual   #51  <Method String JSONObject.optString(String)>
	//   22   42:putfield        #53  <Field String text>
		tag = jsonobject.optString("tag");
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:ldc1            #54  <String "tag">
	//   26   49:invokevirtual   #51  <Method String JSONObject.optString(String)>
	//   27   52:putfield        #56  <Field String tag>
		description = jsonobject.optString("description");
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:ldc1            #57  <String "description">
	//   31   59:invokevirtual   #51  <Method String JSONObject.optString(String)>
	//   32   62:putfield        #59  <Field String description>
		hint = jsonobject.optString("hint");
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:ldc1            #60  <String "hint">
	//   36   69:invokevirtual   #51  <Method String JSONObject.optString(String)>
	//   37   72:putfield        #62  <Field String hint>
		matchBitmask = jsonobject.optInt("match_bitmask");
	//   38   75:aload_0         
	//   39   76:aload_1         
	//   40   77:ldc1            #64  <String "match_bitmask">
	//   41   79:invokevirtual   #45  <Method int JSONObject.optInt(String)>
	//   42   82:putfield        #66  <Field int matchBitmask>
	//   43   85:return          
	}

	public final String className;
	public final String description;
	public final String hint;
	public final int id;
	public final int index;
	public final int matchBitmask;
	public final String tag;
	public final String text;
}
