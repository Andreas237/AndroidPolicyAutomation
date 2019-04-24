// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ValueNode, JsonNodeType

public class BinaryNode extends ValueNode
{

	public BinaryNode(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ValueNode()>
		_data = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field byte[] _data>
	//    5    9:return          
	}

	public BinaryNode(byte abyte0[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ValueNode()>
		if(i == 0 && j == abyte0.length)
	//*   2    4:iload_2         
	//*   3    5:ifne            20
	//*   4    8:iload_3         
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:icmpne          20
		{
			_data = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #21  <Field byte[] _data>
			return;
	//   11   19:return          
		} else
		{
			_data = new byte[j];
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:newarray        byte[]
	//   15   24:putfield        #21  <Field byte[] _data>
			System.arraycopy(((Object) (abyte0)), i, ((Object) (_data)), 0, j);
	//   16   27:aload_1         
	//   17   28:iload_2         
	//   18   29:aload_0         
	//   19   30:getfield        #21  <Field byte[] _data>
	//   20   33:iconst_0        
	//   21   34:iload_3         
	//   22   35:invokestatic    #28  <Method void System.arraycopy(Object, int, Object, int, int)>
			return;
	//   23   38:return          
		}
	}

	public static BinaryNode valueOf(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(abyte0.length == 0)
	//*   4    6:aload_0         
	//*   5    7:arraylength     
	//*   6    8:ifne            15
			return EMPTY_BINARY_NODE;
	//    7   11:getstatic       #16  <Field BinaryNode EMPTY_BINARY_NODE>
	//    8   14:areturn         
		else
			return new BinaryNode(abyte0);
	//    9   15:new             #2   <Class BinaryNode>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:invokespecial   #14  <Method void BinaryNode(byte[])>
	//   13   23:areturn         
	}

	public static BinaryNode valueOf(byte abyte0[], int i, int j)
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(j == 0)
	//*   4    6:iload_2         
	//*   5    7:ifne            14
			return EMPTY_BINARY_NODE;
	//    6   10:getstatic       #16  <Field BinaryNode EMPTY_BINARY_NODE>
	//    7   13:areturn         
		else
			return new BinaryNode(abyte0, i, j);
	//    8   14:new             #2   <Class BinaryNode>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iload_2         
	//   13   21:invokespecial   #33  <Method void BinaryNode(byte[], int, int)>
	//   14   24:areturn         
	}

	public String asText()
	{
		return Base64Variants.getDefaultVariant().encode(_data, false);
	//    0    0:invokestatic    #41  <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    1    3:aload_0         
	//    2    4:getfield        #21  <Field byte[] _data>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #47  <Method String Base64Variant.encode(byte[], boolean)>
	//    5   11:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.VALUE_EMBEDDED_OBJECT;
	//    0    0:getstatic       #55  <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//    1    3:areturn         
	}

	public byte[] binaryValue()
	{
		return _data;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field byte[] _data>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(obj == this)
	//*   2    2:aload_1         
	//*   3    3:aload_0         
	//*   4    4:if_acmpne       11
		{
			flag = true;
	//    5    7:iconst_1        
	//    6    8:istore_2        
		} else
	//*   7    9:iload_2         
	//*   8   10:ireturn         
		{
			flag = flag1;
	//    9   11:iload_3         
	//   10   12:istore_2        
			if(obj != null)
	//*  11   13:aload_1         
	//*  12   14:ifnull          9
			{
				flag = flag1;
	//   13   17:iload_3         
	//   14   18:istore_2        
				if(obj instanceof BinaryNode)
	//*  15   19:aload_1         
	//*  16   20:instanceof      #2   <Class BinaryNode>
	//*  17   23:ifeq            9
					return Arrays.equals(((BinaryNode)obj)._data, _data);
	//   18   26:aload_1         
	//   19   27:checkcast       #2   <Class BinaryNode>
	//   20   30:getfield        #21  <Field byte[] _data>
	//   21   33:aload_0         
	//   22   34:getfield        #21  <Field byte[] _data>
	//   23   37:invokestatic    #64  <Method boolean Arrays.equals(byte[], byte[])>
	//   24   40:ireturn         
			}
		}
		return flag;
	}

	public JsonNodeType getNodeType()
	{
		return JsonNodeType.BINARY;
	//    0    0:getstatic       #72  <Field JsonNodeType JsonNodeType.BINARY>
	//    1    3:areturn         
	}

	public int hashCode()
	{
		if(_data == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field byte[] _data>
	//*   2    4:ifnonnull       9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		else
			return _data.length;
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field byte[] _data>
	//    7   13:arraylength     
	//    8   14:ireturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		jsongenerator.writeBinary(serializerprovider.getConfig().getBase64Variant(), _data, 0, _data.length);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #86  <Method SerializationConfig SerializerProvider.getConfig()>
	//    3    5:invokevirtual   #91  <Method Base64Variant SerializationConfig.getBase64Variant()>
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field byte[] _data>
	//    6   12:iconst_0        
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field byte[] _data>
	//    9   17:arraylength     
	//   10   18:invokevirtual   #97  <Method void JsonGenerator.writeBinary(Base64Variant, byte[], int, int)>
	//   11   21:return          
	}

	public String toString()
	{
		return Base64Variants.getDefaultVariant().encode(_data, true);
	//    0    0:invokestatic    #41  <Method Base64Variant Base64Variants.getDefaultVariant()>
	//    1    3:aload_0         
	//    2    4:getfield        #21  <Field byte[] _data>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #47  <Method String Base64Variant.encode(byte[], boolean)>
	//    5   11:areturn         
	}

	static final BinaryNode EMPTY_BINARY_NODE = new BinaryNode(new byte[0]);
	protected final byte _data[];

	static 
	{
	//    0    0:new             #2   <Class BinaryNode>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:newarray        byte[]
	//    4    7:invokespecial   #14  <Method void BinaryNode(byte[])>
	//    5   10:putstatic       #16  <Field BinaryNode EMPTY_BINARY_NODE>
	//*   6   13:return          
	}
}
