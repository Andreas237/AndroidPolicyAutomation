// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public abstract class DateTimeSerializerBase extends StdScalarSerializer
	implements ContextualSerializer
{

	protected DateTimeSerializerBase(Class class1, Boolean boolean1, DateFormat dateformat)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void StdScalarSerializer(Class)>
		_useTimestamp = boolean1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Boolean _useTimestamp>
		_customFormat = dateformat;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field DateFormat _customFormat>
		if(dateformat == null)
	//*   9   15:aload_3         
	//*  10   16:ifnonnull       24
			class1 = null;
	//   11   19:aconst_null     
	//   12   20:astore_1        
		else
	//*  13   21:goto            32
			class1 = ((Class) (new AtomicReference()));
	//   14   24:new             #25  <Class AtomicReference>
	//   15   27:dup             
	//   16   28:invokespecial   #28  <Method void AtomicReference()>
	//   17   31:astore_1        
		_reusedCustomFormat = ((AtomicReference) (class1));
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:putfield        #30  <Field AtomicReference _reusedCustomFormat>
	//   21   37:return          
	}

	protected void _acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, boolean flag)
		throws JsonMappingException
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            17
		{
			visitIntFormat(jsonformatvisitorwrapper, javatype, com.fasterxml.jackson.core.JsonParser.NumberType.LONG, JsonValueFormat.UTC_MILLISEC);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:getstatic       #43  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//    6   10:getstatic       #49  <Field JsonValueFormat JsonValueFormat.UTC_MILLISEC>
	//    7   13:invokevirtual   #53  <Method void visitIntFormat(JsonFormatVisitorWrapper, JavaType, com.fasterxml.jackson.core.JsonParser$NumberType, JsonValueFormat)>
			return;
	//    8   16:return          
		} else
		{
			visitStringFormat(jsonformatvisitorwrapper, javatype, JsonValueFormat.DATE_TIME);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:getstatic       #56  <Field JsonValueFormat JsonValueFormat.DATE_TIME>
	//   13   23:invokevirtual   #60  <Method void visitStringFormat(JsonFormatVisitorWrapper, JavaType, JsonValueFormat)>
			return;
	//   14   26:return          
		}
	}

	protected boolean _asTimestamp(SerializerProvider serializerprovider)
	{
		Boolean boolean1 = _useTimestamp;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Boolean _useTimestamp>
	//    2    4:astore_2        
		if(boolean1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			return boolean1.booleanValue();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #69  <Method boolean Boolean.booleanValue()>
	//    7   13:ireturn         
		if(_customFormat == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #23  <Field DateFormat _customFormat>
	//*  10   18:ifnonnull       72
		{
			if(serializerprovider != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          33
			{
				return serializerprovider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
	//   13   25:aload_1         
	//   14   26:getstatic       #75  <Field SerializationFeature SerializationFeature.WRITE_DATES_AS_TIMESTAMPS>
	//   15   29:invokevirtual   #81  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//   16   32:ireturn         
			} else
			{
				serializerprovider = ((SerializerProvider) (new StringBuilder()));
	//   17   33:new             #83  <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #84  <Method void StringBuilder()>
	//   20   40:astore_1        
				((StringBuilder) (serializerprovider)).append("Null SerializerProvider passed for ");
	//   21   41:aload_1         
	//   22   42:ldc1            #86  <String "Null SerializerProvider passed for ">
	//   23   44:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
				((StringBuilder) (serializerprovider)).append(handledType().getName());
	//   25   48:aload_1         
	//   26   49:aload_0         
	//   27   50:invokevirtual   #94  <Method Class handledType()>
	//   28   53:invokevirtual   #100 <Method String Class.getName()>
	//   29   56:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
				throw new IllegalArgumentException(((StringBuilder) (serializerprovider)).toString());
	//   31   60:new             #102 <Class IllegalArgumentException>
	//   32   63:dup             
	//   33   64:aload_1         
	//   34   65:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   35   68:invokespecial   #108 <Method void IllegalArgumentException(String)>
	//   36   71:athrow          
			}
		} else
		{
			return false;
	//   37   72:iconst_0        
	//   38   73:ireturn         
		}
	}

	protected void _serializeAsString(Date date, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_customFormat == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field DateFormat _customFormat>
	//*   2    4:ifnonnull       14
		{
			serializerprovider.defaultSerializeDateValue(date, jsongenerator);
	//    3    7:aload_3         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #116 <Method void SerializerProvider.defaultSerializeDateValue(Date, JsonGenerator)>
			return;
	//    7   13:return          
		}
		DateFormat dateformat = (DateFormat)_reusedCustomFormat.getAndSet(((Object) (null)));
	//    8   14:aload_0         
	//    9   15:getfield        #30  <Field AtomicReference _reusedCustomFormat>
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #120 <Method Object AtomicReference.getAndSet(Object)>
	//   12   22:checkcast       #122 <Class DateFormat>
	//   13   25:astore          4
		serializerprovider = ((SerializerProvider) (dateformat));
	//   14   27:aload           4
	//   15   29:astore_3        
		if(dateformat == null)
	//*  16   30:aload           4
	//*  17   32:ifnonnull       46
			serializerprovider = ((SerializerProvider) ((DateFormat)_customFormat.clone()));
	//   18   35:aload_0         
	//   19   36:getfield        #23  <Field DateFormat _customFormat>
	//   20   39:invokevirtual   #126 <Method Object DateFormat.clone()>
	//   21   42:checkcast       #122 <Class DateFormat>
	//   22   45:astore_3        
		jsongenerator.writeString(((DateFormat) (serializerprovider)).format(date));
	//   23   46:aload_2         
	//   24   47:aload_3         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #130 <Method String DateFormat.format(Date)>
	//   27   52:invokevirtual   #135 <Method void JsonGenerator.writeString(String)>
		_reusedCustomFormat.compareAndSet(((Object) (null)), ((Object) (serializerprovider)));
	//   28   55:aload_0         
	//   29   56:getfield        #30  <Field AtomicReference _reusedCustomFormat>
	//   30   59:aconst_null     
	//   31   60:aload_3         
	//   32   61:invokevirtual   #139 <Method boolean AtomicReference.compareAndSet(Object, Object)>
	//   33   64:pop             
	//   34   65:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		_acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype, _asTimestamp(jsonformatvisitorwrapper.getProvider()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:aload_1         
	//    5    5:invokeinterface #147 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//    6   10:invokevirtual   #149 <Method boolean _asTimestamp(SerializerProvider)>
	//    7   13:invokevirtual   #151 <Method void _acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType, boolean)>
	//    8   16:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		if(beanproperty == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return ((JsonSerializer) (this));
	//    2    4:aload_0         
	//    3    5:areturn         
		com.fasterxml.jackson.annotation.JsonFormat.Value value = findFormatOverrides(serializerprovider, beanproperty, handledType());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_0         
	//    8   10:invokevirtual   #94  <Method Class handledType()>
	//    9   13:invokevirtual   #157 <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
	//   10   16:astore          7
		if(value == null)
	//*  11   18:aload           7
	//*  12   20:ifnonnull       25
			return ((JsonSerializer) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
		beanproperty = ((BeanProperty) (value.getShape()));
	//   15   25:aload           7
	//   16   27:invokevirtual   #163 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//   17   30:astore_2        
		if(((com.fasterxml.jackson.annotation.JsonFormat.Shape) (beanproperty)).isNumeric())
	//*  18   31:aload_2         
	//*  19   32:invokevirtual   #168 <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Shape.isNumeric()>
	//*  20   35:ifeq            47
			return ((JsonSerializer) (withFormat(Boolean.TRUE, ((DateFormat) (null)))));
	//   21   38:aload_0         
	//   22   39:getstatic       #171 <Field Boolean Boolean.TRUE>
	//   23   42:aconst_null     
	//   24   43:invokevirtual   #175 <Method DateTimeSerializerBase withFormat(Boolean, DateFormat)>
	//   25   46:areturn         
		if(value.hasPattern())
	//*  26   47:aload           7
	//*  27   49:invokevirtual   #178 <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Value.hasPattern()>
	//*  28   52:ifeq            127
		{
			if(value.hasLocale())
	//*  29   55:aload           7
	//*  30   57:invokevirtual   #181 <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Value.hasLocale()>
	//*  31   60:ifeq            72
				beanproperty = ((BeanProperty) (value.getLocale()));
	//   32   63:aload           7
	//   33   65:invokevirtual   #185 <Method java.util.Locale com.fasterxml.jackson.annotation.JsonFormat$Value.getLocale()>
	//   34   68:astore_2        
			else
	//*  35   69:goto            77
				beanproperty = ((BeanProperty) (serializerprovider.getLocale()));
	//   36   72:aload_1         
	//   37   73:invokevirtual   #186 <Method java.util.Locale SerializerProvider.getLocale()>
	//   38   76:astore_2        
			beanproperty = ((BeanProperty) (new SimpleDateFormat(value.getPattern(), ((java.util.Locale) (beanproperty)))));
	//   39   77:new             #188 <Class SimpleDateFormat>
	//   40   80:dup             
	//   41   81:aload           7
	//   42   83:invokevirtual   #191 <Method String com.fasterxml.jackson.annotation.JsonFormat$Value.getPattern()>
	//   43   86:aload_2         
	//   44   87:invokespecial   #194 <Method void SimpleDateFormat(String, java.util.Locale)>
	//   45   90:astore_2        
			if(value.hasTimeZone())
	//*  46   91:aload           7
	//*  47   93:invokevirtual   #197 <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Value.hasTimeZone()>
	//*  48   96:ifeq            108
				serializerprovider = ((SerializerProvider) (value.getTimeZone()));
	//   49   99:aload           7
	//   50  101:invokevirtual   #201 <Method java.util.TimeZone com.fasterxml.jackson.annotation.JsonFormat$Value.getTimeZone()>
	//   51  104:astore_1        
			else
	//*  52  105:goto            113
				serializerprovider = ((SerializerProvider) (serializerprovider.getTimeZone()));
	//   53  108:aload_1         
	//   54  109:invokevirtual   #202 <Method java.util.TimeZone SerializerProvider.getTimeZone()>
	//   55  112:astore_1        
			((SimpleDateFormat) (beanproperty)).setTimeZone(((java.util.TimeZone) (serializerprovider)));
	//   56  113:aload_2         
	//   57  114:aload_1         
	//   58  115:invokevirtual   #206 <Method void SimpleDateFormat.setTimeZone(java.util.TimeZone)>
			return ((JsonSerializer) (withFormat(Boolean.FALSE, ((DateFormat) (beanproperty)))));
	//   59  118:aload_0         
	//   60  119:getstatic       #209 <Field Boolean Boolean.FALSE>
	//   61  122:aload_2         
	//   62  123:invokevirtual   #175 <Method DateTimeSerializerBase withFormat(Boolean, DateFormat)>
	//   63  126:areturn         
		}
		boolean flag2 = value.hasLocale();
	//   64  127:aload           7
	//   65  129:invokevirtual   #181 <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Value.hasLocale()>
	//   66  132:istore          5
		boolean flag3 = value.hasTimeZone();
	//   67  134:aload           7
	//   68  136:invokevirtual   #197 <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Value.hasTimeZone()>
	//   69  139:istore          6
		com.fasterxml.jackson.annotation.JsonFormat.Shape shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING;
	//   70  141:getstatic       #213 <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.STRING>
	//   71  144:astore          8
		boolean flag1 = true;
	//   72  146:iconst_1        
	//   73  147:istore          4
		boolean flag;
		if(beanproperty == shape)
	//*  74  149:aload_2         
	//*  75  150:aload           8
	//*  76  152:if_acmpne       160
			flag = true;
	//   77  155:iconst_1        
	//   78  156:istore_3        
		else
	//*  79  157:goto            162
			flag = false;
	//   80  160:iconst_0        
	//   81  161:istore_3        
		if(!flag2 && !flag3 && !flag)
	//*  82  162:iload           5
	//*  83  164:ifne            178
	//*  84  167:iload           6
	//*  85  169:ifne            178
	//*  86  172:iload_3         
	//*  87  173:ifne            178
			return ((JsonSerializer) (this));
	//   88  176:aload_0         
	//   89  177:areturn         
		beanproperty = ((BeanProperty) (serializerprovider.getConfig().getDateFormat()));
	//   90  178:aload_1         
	//   91  179:invokevirtual   #217 <Method SerializationConfig SerializerProvider.getConfig()>
	//   92  182:invokevirtual   #223 <Method DateFormat SerializationConfig.getDateFormat()>
	//   93  185:astore_2        
		if(beanproperty instanceof StdDateFormat)
	//*  94  186:aload_2         
	//*  95  187:instanceof      #225 <Class StdDateFormat>
	//*  96  190:ifeq            247
		{
			beanproperty = ((BeanProperty) ((StdDateFormat)beanproperty));
	//   97  193:aload_2         
	//   98  194:checkcast       #225 <Class StdDateFormat>
	//   99  197:astore_2        
			serializerprovider = ((SerializerProvider) (beanproperty));
	//  100  198:aload_2         
	//  101  199:astore_1        
			if(value.hasLocale())
	//* 102  200:aload           7
	//* 103  202:invokevirtual   #181 <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Value.hasLocale()>
	//* 104  205:ifeq            218
				serializerprovider = ((SerializerProvider) (((StdDateFormat) (beanproperty)).withLocale(value.getLocale())));
	//  105  208:aload_2         
	//  106  209:aload           7
	//  107  211:invokevirtual   #185 <Method java.util.Locale com.fasterxml.jackson.annotation.JsonFormat$Value.getLocale()>
	//  108  214:invokevirtual   #229 <Method StdDateFormat StdDateFormat.withLocale(java.util.Locale)>
	//  109  217:astore_1        
			beanproperty = ((BeanProperty) (serializerprovider));
	//  110  218:aload_1         
	//  111  219:astore_2        
			if(value.hasTimeZone())
	//* 112  220:aload           7
	//* 113  222:invokevirtual   #197 <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Value.hasTimeZone()>
	//* 114  225:ifeq            238
				beanproperty = ((BeanProperty) (((StdDateFormat) (serializerprovider)).withTimeZone(value.getTimeZone())));
	//  115  228:aload_1         
	//  116  229:aload           7
	//  117  231:invokevirtual   #201 <Method java.util.TimeZone com.fasterxml.jackson.annotation.JsonFormat$Value.getTimeZone()>
	//  118  234:invokevirtual   #233 <Method StdDateFormat StdDateFormat.withTimeZone(java.util.TimeZone)>
	//  119  237:astore_2        
			return ((JsonSerializer) (withFormat(Boolean.FALSE, ((DateFormat) (beanproperty)))));
	//  120  238:aload_0         
	//  121  239:getstatic       #209 <Field Boolean Boolean.FALSE>
	//  122  242:aload_2         
	//  123  243:invokevirtual   #175 <Method DateTimeSerializerBase withFormat(Boolean, DateFormat)>
	//  124  246:areturn         
		}
		if(!(beanproperty instanceof SimpleDateFormat))
	//* 125  247:aload_2         
	//* 126  248:instanceof      #188 <Class SimpleDateFormat>
	//* 127  251:ifne            282
			serializerprovider.reportBadDefinition(handledType(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", new Object[] {
				((Object) (beanproperty)).getClass().getName()
			}));
	//  128  254:aload_1         
	//  129  255:aload_0         
	//  130  256:invokevirtual   #94  <Method Class handledType()>
	//  131  259:ldc1            #235 <String "Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`">
	//  132  261:iconst_1        
	//  133  262:anewarray       Object[]
	//  134  265:dup             
	//  135  266:iconst_0        
	//  136  267:aload_2         
	//  137  268:invokevirtual   #240 <Method Class Object.getClass()>
	//  138  271:invokevirtual   #100 <Method String Class.getName()>
	//  139  274:aastore         
	//  140  275:invokestatic    #245 <Method String String.format(String, Object[])>
	//  141  278:invokevirtual   #249 <Method Object SerializerProvider.reportBadDefinition(Class, String)>
	//  142  281:pop             
		serializerprovider = ((SerializerProvider) ((SimpleDateFormat)beanproperty));
	//  143  282:aload_2         
	//  144  283:checkcast       #188 <Class SimpleDateFormat>
	//  145  286:astore_1        
		if(flag2)
	//* 146  287:iload           5
	//* 147  289:ifeq            312
			serializerprovider = ((SerializerProvider) (new SimpleDateFormat(((SimpleDateFormat) (serializerprovider)).toPattern(), value.getLocale())));
	//  148  292:new             #188 <Class SimpleDateFormat>
	//  149  295:dup             
	//  150  296:aload_1         
	//  151  297:invokevirtual   #252 <Method String SimpleDateFormat.toPattern()>
	//  152  300:aload           7
	//  153  302:invokevirtual   #185 <Method java.util.Locale com.fasterxml.jackson.annotation.JsonFormat$Value.getLocale()>
	//  154  305:invokespecial   #194 <Method void SimpleDateFormat(String, java.util.Locale)>
	//  155  308:astore_1        
		else
	//* 156  309:goto            320
			serializerprovider = ((SerializerProvider) ((SimpleDateFormat)((SimpleDateFormat) (serializerprovider)).clone()));
	//  157  312:aload_1         
	//  158  313:invokevirtual   #253 <Method Object SimpleDateFormat.clone()>
	//  159  316:checkcast       #188 <Class SimpleDateFormat>
	//  160  319:astore_1        
		beanproperty = ((BeanProperty) (value.getTimeZone()));
	//  161  320:aload           7
	//  162  322:invokevirtual   #201 <Method java.util.TimeZone com.fasterxml.jackson.annotation.JsonFormat$Value.getTimeZone()>
	//  163  325:astore_2        
		if(beanproperty != null && !((Object) (beanproperty)).equals(((Object) (((SimpleDateFormat) (serializerprovider)).getTimeZone()))))
	//* 164  326:aload_2         
	//* 165  327:ifnull          347
	//* 166  330:aload_2         
	//* 167  331:aload_1         
	//* 168  332:invokevirtual   #254 <Method java.util.TimeZone SimpleDateFormat.getTimeZone()>
	//* 169  335:invokevirtual   #258 <Method boolean Object.equals(Object)>
	//* 170  338:ifne            347
			flag = flag1;
	//  171  341:iload           4
	//  172  343:istore_3        
		else
	//* 173  344:goto            349
			flag = false;
	//  174  347:iconst_0        
	//  175  348:istore_3        
		if(flag)
	//* 176  349:iload_3         
	//* 177  350:ifeq            358
			((SimpleDateFormat) (serializerprovider)).setTimeZone(((java.util.TimeZone) (beanproperty)));
	//  178  353:aload_1         
	//  179  354:aload_2         
	//  180  355:invokevirtual   #206 <Method void SimpleDateFormat.setTimeZone(java.util.TimeZone)>
		return ((JsonSerializer) (withFormat(Boolean.FALSE, ((DateFormat) (serializerprovider)))));
	//  181  358:aload_0         
	//  182  359:getstatic       #209 <Field Boolean Boolean.FALSE>
	//  183  362:aload_1         
	//  184  363:invokevirtual   #175 <Method DateTimeSerializerBase withFormat(Boolean, DateFormat)>
	//  185  366:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		if(_asTimestamp(serializerprovider))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #149 <Method boolean _asTimestamp(SerializerProvider)>
	//*   3    5:ifeq            15
			serializerprovider = "number";
	//    4    8:ldc2            #263 <String "number">
	//    5   11:astore_1        
		else
	//*   6   12:goto            19
			serializerprovider = "string";
	//    7   15:ldc2            #265 <String "string">
	//    8   18:astore_1        
		return ((JsonNode) (createSchemaNode(((String) (serializerprovider)), true)));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #269 <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//   13   25:areturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract DateTimeSerializerBase withFormat(Boolean boolean1, DateFormat dateformat);

	protected final DateFormat _customFormat;
	protected final AtomicReference _reusedCustomFormat;
	protected final Boolean _useTimestamp;
}
