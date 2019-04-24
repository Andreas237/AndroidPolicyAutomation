// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.io.IOException;
import java.net.InetAddress;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$20 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method InetAddress read(JsonReader)>
	//    3    5:areturn         
	}

	public InetAddress read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #32  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #35  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		} else
		{
			return InetAddress.getByName(jsonreader.nextString());
	//    8   16:aload_1         
	//    9   17:invokevirtual   #39  <Method String JsonReader.nextString()>
	//   10   20:invokestatic    #45  <Method InetAddress InetAddress.getByName(String)>
	//   11   23:areturn         
		}
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (InetAddress)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #41  <Class InetAddress>
	//    4    6:invokevirtual   #50  <Method void write(JsonWriter, InetAddress)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, InetAddress inetaddress)
		throws IOException
	{
		if(inetaddress == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       13
			inetaddress = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:aload_1         
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #56  <Method JsonWriter JsonWriter.value(String)>
	//*   7   11:pop             
	//*   8   12:return          
			inetaddress = ((InetAddress) (inetaddress.getHostAddress()));
	//    9   13:aload_2         
	//   10   14:invokevirtual   #59  <Method String InetAddress.getHostAddress()>
	//   11   17:astore_2        
		jsonwriter.value(((String) (inetaddress)));
	//*  12   18:goto            6
	}

	TypeAdapters$20()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
