// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core.io:
//			CharTypes

public abstract class CharacterEscapes
	implements Serializable
{

	public CharacterEscapes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static int[] standardAsciiEscapesForJSON()
	{
		int ai[] = CharTypes.get7BitOutputEscapes();
	//    0    0:invokestatic    #25  <Method int[] CharTypes.get7BitOutputEscapes()>
	//    1    3:astore_0        
		return Arrays.copyOf(ai, ai.length);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:invokestatic    #31  <Method int[] Arrays.copyOf(int[], int)>
	//    6   10:areturn         
	}

	public abstract int[] getEscapeCodesForAscii();

	public abstract SerializableString getEscapeSequence(int i);

	public static final int ESCAPE_CUSTOM = -2;
	public static final int ESCAPE_NONE = 0;
	public static final int ESCAPE_STANDARD = -1;
}
