// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.*;
import java.io.*;
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

	public boolean canUseSchema(FormatSchema formatschema)
	{
		return _flddelegate.canUseSchema(formatschema);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method boolean JsonParser.canUseSchema(FormatSchema)>
	//    4    8:ireturn         
	}

	public void clearCurrentToken()
	{
		_flddelegate.clearCurrentToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #28  <Method void JsonParser.clearCurrentToken()>
	//    3    7:return          
	}

	public void close()
		throws IOException
	{
		_flddelegate.close();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #33  <Method void JsonParser.close()>
	//    3    7:return          
	}

	public JsonToken currentToken()
	{
		return _flddelegate.currentToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #38  <Method JsonToken JsonParser.currentToken()>
	//    3    7:areturn         
	}

	public int currentTokenId()
	{
		return _flddelegate.currentTokenId();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #42  <Method int JsonParser.currentTokenId()>
	//    3    7:ireturn         
	}

	public JsonParser disable(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		_flddelegate.disable(feature);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method JsonParser JsonParser.disable(com.fasterxml.jackson.core.JsonParser$Feature)>
	//    4    8:pop             
		return ((JsonParser) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public JsonParser enable(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		_flddelegate.enable(feature);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method JsonParser JsonParser.enable(com.fasterxml.jackson.core.JsonParser$Feature)>
	//    4    8:pop             
		return ((JsonParser) (this));
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public void finishToken()
		throws IOException
	{
		_flddelegate.finishToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #52  <Method void JsonParser.finishToken()>
	//    3    7:return          
	}

	public BigInteger getBigIntegerValue()
		throws IOException
	{
		return _flddelegate.getBigIntegerValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #56  <Method BigInteger JsonParser.getBigIntegerValue()>
	//    3    7:areturn         
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		return _flddelegate.getBinaryValue(base64variant);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #60  <Method byte[] JsonParser.getBinaryValue(Base64Variant)>
	//    4    8:areturn         
	}

	public boolean getBooleanValue()
		throws IOException
	{
		return _flddelegate.getBooleanValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #63  <Method boolean JsonParser.getBooleanValue()>
	//    3    7:ireturn         
	}

	public byte getByteValue()
		throws IOException
	{
		return _flddelegate.getByteValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #67  <Method byte JsonParser.getByteValue()>
	//    3    7:ireturn         
	}

	public ObjectCodec getCodec()
	{
		return _flddelegate.getCodec();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #71  <Method ObjectCodec JsonParser.getCodec()>
	//    3    7:areturn         
	}

	public JsonLocation getCurrentLocation()
	{
		return _flddelegate.getCurrentLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #75  <Method JsonLocation JsonParser.getCurrentLocation()>
	//    3    7:areturn         
	}

	public String getCurrentName()
		throws IOException
	{
		return _flddelegate.getCurrentName();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #79  <Method String JsonParser.getCurrentName()>
	//    3    7:areturn         
	}

	public JsonToken getCurrentToken()
	{
		return _flddelegate.getCurrentToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #82  <Method JsonToken JsonParser.getCurrentToken()>
	//    3    7:areturn         
	}

	public int getCurrentTokenId()
	{
		return _flddelegate.getCurrentTokenId();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #85  <Method int JsonParser.getCurrentTokenId()>
	//    3    7:ireturn         
	}

	public Object getCurrentValue()
	{
		return _flddelegate.getCurrentValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #89  <Method Object JsonParser.getCurrentValue()>
	//    3    7:areturn         
	}

	public BigDecimal getDecimalValue()
		throws IOException
	{
		return _flddelegate.getDecimalValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #93  <Method BigDecimal JsonParser.getDecimalValue()>
	//    3    7:areturn         
	}

	public double getDoubleValue()
		throws IOException
	{
		return _flddelegate.getDoubleValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #97  <Method double JsonParser.getDoubleValue()>
	//    3    7:dreturn         
	}

	public Object getEmbeddedObject()
		throws IOException
	{
		return _flddelegate.getEmbeddedObject();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #100 <Method Object JsonParser.getEmbeddedObject()>
	//    3    7:areturn         
	}

	public int getFeatureMask()
	{
		return _flddelegate.getFeatureMask();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #103 <Method int JsonParser.getFeatureMask()>
	//    3    7:ireturn         
	}

	public float getFloatValue()
		throws IOException
	{
		return _flddelegate.getFloatValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #107 <Method float JsonParser.getFloatValue()>
	//    3    7:freturn         
	}

	public Object getInputSource()
	{
		return _flddelegate.getInputSource();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #110 <Method Object JsonParser.getInputSource()>
	//    3    7:areturn         
	}

	public int getIntValue()
		throws IOException
	{
		return _flddelegate.getIntValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #113 <Method int JsonParser.getIntValue()>
	//    3    7:ireturn         
	}

	public JsonToken getLastClearedToken()
	{
		return _flddelegate.getLastClearedToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #116 <Method JsonToken JsonParser.getLastClearedToken()>
	//    3    7:areturn         
	}

	public long getLongValue()
		throws IOException
	{
		return _flddelegate.getLongValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #120 <Method long JsonParser.getLongValue()>
	//    3    7:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
		throws IOException
	{
		return _flddelegate.getNumberType();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #124 <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//    3    7:areturn         
	}

	public Number getNumberValue()
		throws IOException
	{
		return _flddelegate.getNumberValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #128 <Method Number JsonParser.getNumberValue()>
	//    3    7:areturn         
	}

	public Object getObjectId()
		throws IOException
	{
		return _flddelegate.getObjectId();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #131 <Method Object JsonParser.getObjectId()>
	//    3    7:areturn         
	}

	public JsonStreamContext getParsingContext()
	{
		return _flddelegate.getParsingContext();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #135 <Method JsonStreamContext JsonParser.getParsingContext()>
	//    3    7:areturn         
	}

	public FormatSchema getSchema()
	{
		return _flddelegate.getSchema();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #139 <Method FormatSchema JsonParser.getSchema()>
	//    3    7:areturn         
	}

	public short getShortValue()
		throws IOException
	{
		return _flddelegate.getShortValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #143 <Method short JsonParser.getShortValue()>
	//    3    7:ireturn         
	}

	public int getText(Writer writer)
		throws IOException, UnsupportedOperationException
	{
		return _flddelegate.getText(writer);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #149 <Method int JsonParser.getText(Writer)>
	//    4    8:ireturn         
	}

	public String getText()
		throws IOException
	{
		return _flddelegate.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #151 <Method String JsonParser.getText()>
	//    3    7:areturn         
	}

	public char[] getTextCharacters()
		throws IOException
	{
		return _flddelegate.getTextCharacters();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #155 <Method char[] JsonParser.getTextCharacters()>
	//    3    7:areturn         
	}

	public int getTextLength()
		throws IOException
	{
		return _flddelegate.getTextLength();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #158 <Method int JsonParser.getTextLength()>
	//    3    7:ireturn         
	}

	public int getTextOffset()
		throws IOException
	{
		return _flddelegate.getTextOffset();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #161 <Method int JsonParser.getTextOffset()>
	//    3    7:ireturn         
	}

	public JsonLocation getTokenLocation()
	{
		return _flddelegate.getTokenLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #164 <Method JsonLocation JsonParser.getTokenLocation()>
	//    3    7:areturn         
	}

	public Object getTypeId()
		throws IOException
	{
		return _flddelegate.getTypeId();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #167 <Method Object JsonParser.getTypeId()>
	//    3    7:areturn         
	}

	public boolean getValueAsBoolean()
		throws IOException
	{
		return _flddelegate.getValueAsBoolean();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #170 <Method boolean JsonParser.getValueAsBoolean()>
	//    3    7:ireturn         
	}

	public boolean getValueAsBoolean(boolean flag)
		throws IOException
	{
		return _flddelegate.getValueAsBoolean(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #173 <Method boolean JsonParser.getValueAsBoolean(boolean)>
	//    4    8:ireturn         
	}

	public double getValueAsDouble()
		throws IOException
	{
		return _flddelegate.getValueAsDouble();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #176 <Method double JsonParser.getValueAsDouble()>
	//    3    7:dreturn         
	}

	public double getValueAsDouble(double d)
		throws IOException
	{
		return _flddelegate.getValueAsDouble(d);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:dload_1         
	//    3    5:invokevirtual   #179 <Method double JsonParser.getValueAsDouble(double)>
	//    4    8:dreturn         
	}

	public int getValueAsInt()
		throws IOException
	{
		return _flddelegate.getValueAsInt();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #182 <Method int JsonParser.getValueAsInt()>
	//    3    7:ireturn         
	}

	public int getValueAsInt(int i)
		throws IOException
	{
		return _flddelegate.getValueAsInt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #185 <Method int JsonParser.getValueAsInt(int)>
	//    4    8:ireturn         
	}

	public long getValueAsLong()
		throws IOException
	{
		return _flddelegate.getValueAsLong();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #188 <Method long JsonParser.getValueAsLong()>
	//    3    7:lreturn         
	}

	public long getValueAsLong(long l)
		throws IOException
	{
		return _flddelegate.getValueAsLong(l);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #191 <Method long JsonParser.getValueAsLong(long)>
	//    4    8:lreturn         
	}

	public String getValueAsString()
		throws IOException
	{
		return _flddelegate.getValueAsString();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #194 <Method String JsonParser.getValueAsString()>
	//    3    7:areturn         
	}

	public String getValueAsString(String s)
		throws IOException
	{
		return _flddelegate.getValueAsString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #197 <Method String JsonParser.getValueAsString(String)>
	//    4    8:areturn         
	}

	public boolean hasCurrentToken()
	{
		return _flddelegate.hasCurrentToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #200 <Method boolean JsonParser.hasCurrentToken()>
	//    3    7:ireturn         
	}

	public boolean hasTextCharacters()
	{
		return _flddelegate.hasTextCharacters();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #203 <Method boolean JsonParser.hasTextCharacters()>
	//    3    7:ireturn         
	}

	public boolean hasToken(JsonToken jsontoken)
	{
		return _flddelegate.hasToken(jsontoken);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #207 <Method boolean JsonParser.hasToken(JsonToken)>
	//    4    8:ireturn         
	}

	public boolean hasTokenId(int i)
	{
		return _flddelegate.hasTokenId(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #211 <Method boolean JsonParser.hasTokenId(int)>
	//    4    8:ireturn         
	}

	public boolean isClosed()
	{
		return _flddelegate.isClosed();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #214 <Method boolean JsonParser.isClosed()>
	//    3    7:ireturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		return _flddelegate.isEnabled(feature);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #218 <Method boolean JsonParser.isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//    4    8:ireturn         
	}

	public boolean isExpectedStartArrayToken()
	{
		return _flddelegate.isExpectedStartArrayToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #221 <Method boolean JsonParser.isExpectedStartArrayToken()>
	//    3    7:ireturn         
	}

	public boolean isExpectedStartObjectToken()
	{
		return _flddelegate.isExpectedStartObjectToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #224 <Method boolean JsonParser.isExpectedStartObjectToken()>
	//    3    7:ireturn         
	}

	public JsonToken nextToken()
		throws IOException
	{
		return _flddelegate.nextToken();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #227 <Method JsonToken JsonParser.nextToken()>
	//    3    7:areturn         
	}

	public JsonToken nextValue()
		throws IOException
	{
		return _flddelegate.nextValue();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #230 <Method JsonToken JsonParser.nextValue()>
	//    3    7:areturn         
	}

	public void overrideCurrentName(String s)
	{
		_flddelegate.overrideCurrentName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #234 <Method void JsonParser.overrideCurrentName(String)>
	//    4    8:return          
	}

	public JsonParser overrideFormatFeatures(int i, int j)
	{
		_flddelegate.overrideFormatFeatures(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #238 <Method JsonParser JsonParser.overrideFormatFeatures(int, int)>
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
	//    4    6:invokevirtual   #241 <Method JsonParser JsonParser.overrideStdFeatures(int, int)>
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
	//    4    6:invokevirtual   #245 <Method int JsonParser.readBinaryValue(Base64Variant, OutputStream)>
	//    5    9:ireturn         
	}

	public boolean requiresCustomCodec()
	{
		return _flddelegate.requiresCustomCodec();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #248 <Method boolean JsonParser.requiresCustomCodec()>
	//    3    7:ireturn         
	}

	public void setCodec(ObjectCodec objectcodec)
	{
		_flddelegate.setCodec(objectcodec);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #252 <Method void JsonParser.setCodec(ObjectCodec)>
	//    4    8:return          
	}

	public void setCurrentValue(Object obj)
	{
		_flddelegate.setCurrentValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #256 <Method void JsonParser.setCurrentValue(Object)>
	//    4    8:return          
	}

	public JsonParser setFeatureMask(int i)
	{
		_flddelegate.setFeatureMask(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #261 <Method JsonParser JsonParser.setFeatureMask(int)>
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
	//    3    5:invokevirtual   #266 <Method void JsonParser.setSchema(FormatSchema)>
	//    4    8:return          
	}

	public JsonParser skipChildren()
		throws IOException
	{
		_flddelegate.skipChildren();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field JsonParser _flddelegate>
	//    2    4:invokevirtual   #270 <Method JsonParser JsonParser.skipChildren()>
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
	//    2    4:invokevirtual   #274 <Method Version JsonParser.version()>
	//    3    7:areturn         
	}

	protected JsonParser _flddelegate;
}
