// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;

// Referenced classes of package com.fasterxml.jackson.core:
//			SerializableString

public class JsonpCharacterEscapes extends CharacterEscapes
{

	public JsonpCharacterEscapes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void CharacterEscapes()>
	//    2    4:return          
	}

	public static JsonpCharacterEscapes instance()
	{
		return sInstance;
	//    0    0:getstatic       #41  <Field JsonpCharacterEscapes sInstance>
	//    1    3:areturn         
	}

	public int[] getEscapeCodesForAscii()
	{
		return asciiEscapes;
	//    0    0:getstatic       #23  <Field int[] asciiEscapes>
	//    1    3:areturn         
	}

	public SerializableString getEscapeSequence(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     8232 8233: default 24
	//	               8232 30
	//	               8233 26
		default:
			return null;
	//    2   24:aconst_null     
	//    3   25:areturn         

		case 8233: 
			return ((SerializableString) (escapeFor2029));
	//    4   26:getstatic       #37  <Field SerializedString escapeFor2029>
	//    5   29:areturn         

		case 8232: 
			return ((SerializableString) (escapeFor2028));
	//    6   30:getstatic       #33  <Field SerializedString escapeFor2028>
	//    7   33:areturn         
		}
	}

	private static final int asciiEscapes[] = CharacterEscapes.standardAsciiEscapesForJSON();
	private static final SerializedString escapeFor2028 = new SerializedString("\\u2028");
	private static final SerializedString escapeFor2029 = new SerializedString("\\u2029");
	private static final JsonpCharacterEscapes sInstance = new JsonpCharacterEscapes();
	private static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:invokestatic    #21  <Method int[] CharacterEscapes.standardAsciiEscapesForJSON()>
	//    1    3:putstatic       #23  <Field int[] asciiEscapes>
	//    2    6:new             #25  <Class SerializedString>
	//    3    9:dup             
	//    4   10:ldc1            #27  <String "\\u2028">
	//    5   12:invokespecial   #31  <Method void SerializedString(String)>
	//    6   15:putstatic       #33  <Field SerializedString escapeFor2028>
	//    7   18:new             #25  <Class SerializedString>
	//    8   21:dup             
	//    9   22:ldc1            #35  <String "\\u2029">
	//   10   24:invokespecial   #31  <Method void SerializedString(String)>
	//   11   27:putstatic       #37  <Field SerializedString escapeFor2029>
	//   12   30:new             #2   <Class JsonpCharacterEscapes>
	//   13   33:dup             
	//   14   34:invokespecial   #39  <Method void JsonpCharacterEscapes()>
	//   15   37:putstatic       #41  <Field JsonpCharacterEscapes sInstance>
	//*  16   40:return          
	}
}
