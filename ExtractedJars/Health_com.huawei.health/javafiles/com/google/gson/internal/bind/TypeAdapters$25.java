// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Currency;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$25 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method Currency read(JsonReader)>
	//    3    5:areturn         
	}

	public Currency read(JsonReader jsonreader)
		throws IOException
	{
		return Currency.getInstance(jsonreader.nextString());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method String JsonReader.nextString()>
	//    2    4:invokestatic    #32  <Method Currency Currency.getInstance(String)>
	//    3    7:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Currency)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #28  <Class Currency>
	//    4    6:invokevirtual   #37  <Method void write(JsonWriter, Currency)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, Currency currency)
		throws IOException
	{
		jsonwriter.value(currency.getCurrencyCode());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #40  <Method String Currency.getCurrencyCode()>
	//    3    5:invokevirtual   #46  <Method JsonWriter JsonWriter.value(String)>
	//    4    8:pop             
	//    5    9:return          
	}

	TypeAdapters$25()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
