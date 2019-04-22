// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.*;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonParserDelegate extends JsonParser
{

	public JsonParserDelegate(JsonParser jsonparser)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void JsonParser()>
		_flddelegate = jsonparser;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field JsonParser _flddelegate>
	//    5    9:return          
	}

	public boolean canReadObjectId()
	{
		return _flddelegate.canReadObjectId();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #18  <Method boolean JsonParser.canReadObjectId()>
	//    3    7:ireturn         
	}

	public boolean canReadTypeId()
	{
		return _flddelegate.canReadTypeId();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #21  <Method boolean JsonParser.canReadTypeId()>
	//    3    7:ireturn         
	}

	public void clearCurrentToken()
	{
		_flddelegate.clearCurrentToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #24  <Method void JsonParser.clearCurrentToken()>
	//    3    7:return          
	}

	public void close()
		throws IOException
	{
		_flddelegate.close();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #29  <Method void JsonParser.close()>
	//    3    7:return          
	}

	public JsonToken currentToken()
	{
		return _flddelegate.currentToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #34  <Method JsonToken JsonParser.currentToken()>
	//    3    7:areturn         
	}

	public JsonParser enable(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		_flddelegate.enable(feature);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method JsonParser JsonParser.enable(com.fasterxml.jackson.core.JsonParser$Feature)>
	//    4    8:pop             
		return ((JsonParser) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public BigInteger getBigIntegerValue()
		throws IOException
	{
		return _flddelegate.getBigIntegerValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #42  <Method BigInteger JsonParser.getBigIntegerValue()>
	//    3    7:areturn         
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		return _flddelegate.getBinaryValue(base64variant);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method byte[] JsonParser.getBinaryValue(Base64Variant)>
	//    4    8:areturn         
	}

	public byte getByteValue()
		throws IOException
	{
		return _flddelegate.getByteValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #50  <Method byte JsonParser.getByteValue()>
	//    3    7:ireturn         
	}

	public ObjectCodec getCodec()
	{
		return _flddelegate.getCodec();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #54  <Method ObjectCodec JsonParser.getCodec()>
	//    3    7:areturn         
	}

	public JsonLocation getCurrentLocation()
	{
		return _flddelegate.getCurrentLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #58  <Method JsonLocation JsonParser.getCurrentLocation()>
	//    3    7:areturn         
	}

	public String getCurrentName()
		throws IOException
	{
		return _flddelegate.getCurrentName();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #62  <Method String JsonParser.getCurrentName()>
	//    3    7:areturn         
	}

	public JsonToken getCurrentToken()
	{
		return _flddelegate.getCurrentToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #65  <Method JsonToken JsonParser.getCurrentToken()>
	//    3    7:areturn         
	}

	public int getCurrentTokenId()
	{
		return _flddelegate.getCurrentTokenId();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #69  <Method int JsonParser.getCurrentTokenId()>
	//    3    7:ireturn         
	}

	public BigDecimal getDecimalValue()
		throws IOException
	{
		return _flddelegate.getDecimalValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #73  <Method BigDecimal JsonParser.getDecimalValue()>
	//    3    7:areturn         
	}

	public double getDoubleValue()
		throws IOException
	{
		return _flddelegate.getDoubleValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #77  <Method double JsonParser.getDoubleValue()>
	//    3    7:dreturn         
	}

	public Object getEmbeddedObject()
		throws IOException
	{
		return _flddelegate.getEmbeddedObject();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #81  <Method Object JsonParser.getEmbeddedObject()>
	//    3    7:areturn         
	}

	public float getFloatValue()
		throws IOException
	{
		return _flddelegate.getFloatValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #85  <Method float JsonParser.getFloatValue()>
	//    3    7:freturn         
	}

	public int getIntValue()
		throws IOException
	{
		return _flddelegate.getIntValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #88  <Method int JsonParser.getIntValue()>
	//    3    7:ireturn         
	}

	public long getLongValue()
		throws IOException
	{
		return _flddelegate.getLongValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #92  <Method long JsonParser.getLongValue()>
	//    3    7:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
		throws IOException
	{
		return _flddelegate.getNumberType();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #96  <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//    3    7:areturn         
	}

	public Number getNumberValue()
		throws IOException
	{
		return _flddelegate.getNumberValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #100 <Method Number JsonParser.getNumberValue()>
	//    3    7:areturn         
	}

	public Object getObjectId()
		throws IOException
	{
		return _flddelegate.getObjectId();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #103 <Method Object JsonParser.getObjectId()>
	//    3    7:areturn         
	}

	public JsonStreamContext getParsingContext()
	{
		return _flddelegate.getParsingContext();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #107 <Method JsonStreamContext JsonParser.getParsingContext()>
	//    3    7:areturn         
	}

	public short getShortValue()
		throws IOException
	{
		return _flddelegate.getShortValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #111 <Method short JsonParser.getShortValue()>
	//    3    7:ireturn         
	}

	public String getText()
		throws IOException
	{
		return _flddelegate.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #114 <Method String JsonParser.getText()>
	//    3    7:areturn         
	}

	public char[] getTextCharacters()
		throws IOException
	{
		return _flddelegate.getTextCharacters();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #118 <Method char[] JsonParser.getTextCharacters()>
	//    3    7:areturn         
	}

	public int getTextLength()
		throws IOException
	{
		return _flddelegate.getTextLength();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #121 <Method int JsonParser.getTextLength()>
	//    3    7:ireturn         
	}

	public int getTextOffset()
		throws IOException
	{
		return _flddelegate.getTextOffset();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #124 <Method int JsonParser.getTextOffset()>
	//    3    7:ireturn         
	}

	public JsonLocation getTokenLocation()
	{
		return _flddelegate.getTokenLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #127 <Method JsonLocation JsonParser.getTokenLocation()>
	//    3    7:areturn         
	}

	public Object getTypeId()
		throws IOException
	{
		return _flddelegate.getTypeId();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #130 <Method Object JsonParser.getTypeId()>
	//    3    7:areturn         
	}

	public int getValueAsInt()
		throws IOException
	{
		return _flddelegate.getValueAsInt();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #133 <Method int JsonParser.getValueAsInt()>
	//    3    7:ireturn         
	}

	public int getValueAsInt(int i)
		throws IOException
	{
		return _flddelegate.getValueAsInt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #136 <Method int JsonParser.getValueAsInt(int)>
	//    4    8:ireturn         
	}

	public long getValueAsLong()
		throws IOException
	{
		return _flddelegate.getValueAsLong();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #139 <Method long JsonParser.getValueAsLong()>
	//    3    7:lreturn         
	}

	public long getValueAsLong(long l)
		throws IOException
	{
		return _flddelegate.getValueAsLong(l);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #142 <Method long JsonParser.getValueAsLong(long)>
	//    4    8:lreturn         
	}

	public String getValueAsString()
		throws IOException
	{
		return _flddelegate.getValueAsString();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #145 <Method String JsonParser.getValueAsString()>
	//    3    7:areturn         
	}

	public String getValueAsString(String s)
		throws IOException
	{
		return _flddelegate.getValueAsString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #148 <Method String JsonParser.getValueAsString(String)>
	//    4    8:areturn         
	}

	public boolean hasCurrentToken()
	{
		return _flddelegate.hasCurrentToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #151 <Method boolean JsonParser.hasCurrentToken()>
	//    3    7:ireturn         
	}

	public boolean hasTextCharacters()
	{
		return _flddelegate.hasTextCharacters();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #154 <Method boolean JsonParser.hasTextCharacters()>
	//    3    7:ireturn         
	}

	public boolean hasToken(JsonToken jsontoken)
	{
		return _flddelegate.hasToken(jsontoken);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #158 <Method boolean JsonParser.hasToken(JsonToken)>
	//    4    8:ireturn         
	}

	public boolean hasTokenId(int i)
	{
		return _flddelegate.hasTokenId(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #162 <Method boolean JsonParser.hasTokenId(int)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		return _flddelegate.isEnabled(feature);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #166 <Method boolean JsonParser.isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//    4    8:ireturn         
	}

	public boolean isExpectedStartArrayToken()
	{
		return _flddelegate.isExpectedStartArrayToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #169 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//    3    7:ireturn         
	}

	public boolean isExpectedStartObjectToken()
	{
		return _flddelegate.isExpectedStartObjectToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #172 <Method boolean JsonParser.isExpectedStartObjectToken()>
	//    3    7:ireturn         
	}

	public boolean isNaN()
		throws IOException
	{
		return _flddelegate.isNaN();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #175 <Method boolean JsonParser.isNaN()>
	//    3    7:ireturn         
	}

	public JsonToken nextToken()
		throws IOException
	{
		return _flddelegate.nextToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #178 <Method JsonToken JsonParser.nextToken()>
	//    3    7:areturn         
	}

	public JsonToken nextValue()
		throws IOException
	{
		return _flddelegate.nextValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #181 <Method JsonToken JsonParser.nextValue()>
	//    3    7:areturn         
	}

	public JsonParser overrideFormatFeatures(int i, int j)
	{
		_flddelegate.overrideFormatFeatures(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #185 <Method JsonParser JsonParser.overrideFormatFeatures(int, int)>
	//    5    9:pop             
		return ((JsonParser) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public JsonParser overrideStdFeatures(int i, int j)
	{
		_flddelegate.overrideStdFeatures(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #188 <Method JsonParser JsonParser.overrideStdFeatures(int, int)>
	//    5    9:pop             
		return ((JsonParser) (this));
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException
	{
		return _flddelegate.readBinaryValue(base64variant, outputstream);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #192 <Method int JsonParser.readBinaryValue(Base64Variant, OutputStream)>
	//    5    9:ireturn         
	}

	public boolean requiresCustomCodec()
	{
		return _flddelegate.requiresCustomCodec();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #195 <Method boolean JsonParser.requiresCustomCodec()>
	//    3    7:ireturn         
	}

	public void setCurrentValue(Object obj)
	{
		_flddelegate.setCurrentValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #199 <Method void JsonParser.setCurrentValue(Object)>
	//    4    8:return          
	}

	public JsonParser setFeatureMask(int i)
	{
		_flddelegate.setFeatureMask(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #204 <Method JsonParser JsonParser.setFeatureMask(int)>
	//    4    8:pop             
		return ((JsonParser) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public void setSchema(FormatSchema formatschema)
	{
		_flddelegate.setSchema(formatschema);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #209 <Method void JsonParser.setSchema(FormatSchema)>
	//    4    8:return          
	}

	public JsonParser skipChildren()
		throws IOException
	{
		_flddelegate.skipChildren();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #213 <Method JsonParser JsonParser.skipChildren()>
	//    3    7:pop             
		return ((JsonParser) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Version version()
	{
		return _flddelegate.version();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #217 <Method Version JsonParser.version()>
	//    3    7:areturn         
	}

	protected JsonParser _flddelegate;
}
