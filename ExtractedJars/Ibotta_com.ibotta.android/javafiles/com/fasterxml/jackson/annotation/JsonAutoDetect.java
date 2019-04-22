// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			JacksonAnnotationValue, PropertyAccessor

public interface JsonAutoDetect
	extends Annotation
{
	public static class Value
		implements JacksonAnnotationValue, Serializable
	{

		private static boolean _equals(Value value, Value value1)
		{
			return value._fieldVisibility == value1._fieldVisibility && value._getterVisibility == value1._getterVisibility && value._isGetterVisibility == value1._isGetterVisibility && value._setterVisibility == value1._setterVisibility && value._creatorVisibility == value1._creatorVisibility;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
		//    2    4:aload_1         
		//    3    5:getfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
		//    4    8:if_acmpne       57
		//    5   11:aload_0         
		//    6   12:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
		//    7   15:aload_1         
		//    8   16:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
		//    9   19:if_acmpne       57
		//   10   22:aload_0         
		//   11   23:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
		//   12   26:aload_1         
		//   13   27:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
		//   14   30:if_acmpne       57
		//   15   33:aload_0         
		//   16   34:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
		//   17   37:aload_1         
		//   18   38:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
		//   19   41:if_acmpne       57
		//   20   44:aload_0         
		//   21   45:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
		//   22   48:aload_1         
		//   23   49:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
		//   24   52:if_acmpne       57
		//   25   55:iconst_1        
		//   26   56:ireturn         
		//   27   57:iconst_0        
		//   28   58:ireturn         
		}

		private static Value _predefined(Visibility visibility, Visibility visibility1, Visibility visibility2, Visibility visibility3, Visibility visibility4)
		{
			if(visibility == DEFAULT_FIELD_VISIBILITY)
		//*   0    0:aload_0         
		//*   1    1:getstatic       #35  <Field JsonAutoDetect$Visibility DEFAULT_FIELD_VISIBILITY>
		//*   2    4:if_acmpne       46
			{
				visibility = ((Visibility) (DEFAULT));
		//    3    7:getstatic       #44  <Field JsonAutoDetect$Value DEFAULT>
		//    4   10:astore_0        
				if(visibility1 == ((Value) (visibility))._getterVisibility && visibility2 == ((Value) (visibility))._isGetterVisibility && visibility3 == ((Value) (visibility))._setterVisibility && visibility4 == ((Value) (visibility))._creatorVisibility)
		//*   5   11:aload_1         
		//*   6   12:aload_0         
		//*   7   13:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
		//*   8   16:if_acmpne       86
		//*   9   19:aload_2         
		//*  10   20:aload_0         
		//*  11   21:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
		//*  12   24:if_acmpne       86
		//*  13   27:aload_3         
		//*  14   28:aload_0         
		//*  15   29:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
		//*  16   32:if_acmpne       86
		//*  17   35:aload           4
		//*  18   37:aload_0         
		//*  19   38:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
		//*  20   41:if_acmpne       86
					return ((Value) (visibility));
		//   21   44:aload_0         
		//   22   45:areturn         
			} else
			if(visibility == Visibility.DEFAULT && visibility1 == Visibility.DEFAULT && visibility2 == Visibility.DEFAULT && visibility3 == Visibility.DEFAULT && visibility4 == Visibility.DEFAULT)
		//*  23   46:aload_0         
		//*  24   47:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
		//*  25   50:if_acmpne       86
		//*  26   53:aload_1         
		//*  27   54:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
		//*  28   57:if_acmpne       86
		//*  29   60:aload_2         
		//*  30   61:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
		//*  31   64:if_acmpne       86
		//*  32   67:aload_3         
		//*  33   68:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
		//*  34   71:if_acmpne       86
		//*  35   74:aload           4
		//*  36   76:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
		//*  37   79:if_acmpne       86
				return NO_OVERRIDES;
		//   38   82:getstatic       #48  <Field JsonAutoDetect$Value NO_OVERRIDES>
		//   39   85:areturn         
			return null;
		//   40   86:aconst_null     
		//   41   87:areturn         
		}

		public boolean equals(Object obj)
		{
			if(obj == this)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj == null)
		//*   5    7:aload_1         
		//*   6    8:ifnonnull       13
				return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
			return obj.getClass() == ((Object)this).getClass() && _equals(this, (Value)obj);
		//    9   13:aload_1         
		//   10   14:invokevirtual   #71  <Method Class Object.getClass()>
		//   11   17:aload_0         
		//   12   18:invokevirtual   #71  <Method Class Object.getClass()>
		//   13   21:if_acmpne       37
		//   14   24:aload_0         
		//   15   25:aload_1         
		//   16   26:checkcast       #2   <Class JsonAutoDetect$Value>
		//   17   29:invokestatic    #73  <Method boolean _equals(JsonAutoDetect$Value, JsonAutoDetect$Value)>
		//   18   32:ifeq            37
		//   19   35:iconst_1        
		//   20   36:ireturn         
		//   21   37:iconst_0        
		//   22   38:ireturn         
		}

		public Visibility getCreatorVisibility()
		{
			return _creatorVisibility;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
		//    2    4:areturn         
		}

		public Visibility getFieldVisibility()
		{
			return _fieldVisibility;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
		//    2    4:areturn         
		}

		public Visibility getGetterVisibility()
		{
			return _getterVisibility;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
		//    2    4:areturn         
		}

		public Visibility getIsGetterVisibility()
		{
			return _isGetterVisibility;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
		//    2    4:areturn         
		}

		public Visibility getSetterVisibility()
		{
			return _setterVisibility;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			return _fieldVisibility.ordinal() + 1 ^ (_getterVisibility.ordinal() * 3 - _isGetterVisibility.ordinal() * 7) + _setterVisibility.ordinal() * 11 ^ _creatorVisibility.ordinal() * 13;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
		//    2    4:invokevirtual   #84  <Method int JsonAutoDetect$Visibility.ordinal()>
		//    3    7:iconst_1        
		//    4    8:iadd            
		//    5    9:aload_0         
		//    6   10:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
		//    7   13:invokevirtual   #84  <Method int JsonAutoDetect$Visibility.ordinal()>
		//    8   16:iconst_3        
		//    9   17:imul            
		//   10   18:aload_0         
		//   11   19:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
		//   12   22:invokevirtual   #84  <Method int JsonAutoDetect$Visibility.ordinal()>
		//   13   25:bipush          7
		//   14   27:imul            
		//   15   28:isub            
		//   16   29:aload_0         
		//   17   30:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
		//   18   33:invokevirtual   #84  <Method int JsonAutoDetect$Visibility.ordinal()>
		//   19   36:bipush          11
		//   20   38:imul            
		//   21   39:iadd            
		//   22   40:ixor            
		//   23   41:aload_0         
		//   24   42:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
		//   25   45:invokevirtual   #84  <Method int JsonAutoDetect$Visibility.ordinal()>
		//   26   48:bipush          13
		//   27   50:imul            
		//   28   51:ixor            
		//   29   52:ireturn         
		}

		protected Object readResolve()
		{
			Value value1 = _predefined(_fieldVisibility, _getterVisibility, _isGetterVisibility, _setterVisibility, _creatorVisibility);
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
		//    2    4:aload_0         
		//    3    5:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
		//    4    8:aload_0         
		//    5    9:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
		//    6   12:aload_0         
		//    7   13:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
		//    8   16:aload_0         
		//    9   17:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
		//   10   20:invokestatic    #88  <Method JsonAutoDetect$Value _predefined(JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility)>
		//   11   23:astore_2        
			Value value = value1;
		//   12   24:aload_2         
		//   13   25:astore_1        
			if(value1 == null)
		//*  14   26:aload_2         
		//*  15   27:ifnonnull       32
				value = this;
		//   16   30:aload_0         
		//   17   31:astore_1        
			return ((Object) (value));
		//   18   32:aload_1         
		//   19   33:areturn         
		}

		public String toString()
		{
			return String.format("JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)", new Object[] {
				_fieldVisibility, _getterVisibility, _isGetterVisibility, _setterVisibility, _creatorVisibility
			});
		//    0    0:ldc1            #92  <String "JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)">
		//    1    2:iconst_5        
		//    2    3:anewarray       Object[]
		//    3    6:dup             
		//    4    7:iconst_0        
		//    5    8:aload_0         
		//    6    9:getfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
		//    7   12:aastore         
		//    8   13:dup             
		//    9   14:iconst_1        
		//   10   15:aload_0         
		//   11   16:getfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
		//   12   19:aastore         
		//   13   20:dup             
		//   14   21:iconst_2        
		//   15   22:aload_0         
		//   16   23:getfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
		//   17   26:aastore         
		//   18   27:dup             
		//   19   28:iconst_3        
		//   20   29:aload_0         
		//   21   30:getfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
		//   22   33:aastore         
		//   23   34:dup             
		//   24   35:iconst_4        
		//   25   36:aload_0         
		//   26   37:getfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
		//   27   40:aastore         
		//   28   41:invokestatic    #98  <Method String String.format(String, Object[])>
		//   29   44:areturn         
		}

		public Class valueFor()
		{
			return com/fasterxml/jackson/annotation/JsonAutoDetect;
		//    0    0:ldc1            #11  <Class JsonAutoDetect>
		//    1    2:areturn         
		}

		protected static final Value DEFAULT;
		private static final Visibility DEFAULT_FIELD_VISIBILITY;
		protected static final Value NO_OVERRIDES;
		private static final long serialVersionUID = 1L;
		protected final Visibility _creatorVisibility;
		protected final Visibility _fieldVisibility;
		protected final Visibility _getterVisibility;
		protected final Visibility _isGetterVisibility;
		protected final Visibility _setterVisibility;

		static 
		{
			DEFAULT_FIELD_VISIBILITY = Visibility.PUBLIC_ONLY;
		//    0    0:getstatic       #33  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PUBLIC_ONLY>
		//    1    3:putstatic       #35  <Field JsonAutoDetect$Visibility DEFAULT_FIELD_VISIBILITY>
			DEFAULT = new Value(DEFAULT_FIELD_VISIBILITY, Visibility.PUBLIC_ONLY, Visibility.PUBLIC_ONLY, Visibility.ANY, Visibility.PUBLIC_ONLY);
		//    2    6:new             #2   <Class JsonAutoDetect$Value>
		//    3    9:dup             
		//    4   10:getstatic       #35  <Field JsonAutoDetect$Visibility DEFAULT_FIELD_VISIBILITY>
		//    5   13:getstatic       #33  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PUBLIC_ONLY>
		//    6   16:getstatic       #33  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PUBLIC_ONLY>
		//    7   19:getstatic       #38  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.ANY>
		//    8   22:getstatic       #33  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PUBLIC_ONLY>
		//    9   25:invokespecial   #42  <Method void JsonAutoDetect$Value(JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility)>
		//   10   28:putstatic       #44  <Field JsonAutoDetect$Value DEFAULT>
			NO_OVERRIDES = new Value(Visibility.DEFAULT, Visibility.DEFAULT, Visibility.DEFAULT, Visibility.DEFAULT, Visibility.DEFAULT);
		//   11   31:new             #2   <Class JsonAutoDetect$Value>
		//   12   34:dup             
		//   13   35:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
		//   14   38:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
		//   15   41:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
		//   16   44:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
		//   17   47:getstatic       #46  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.DEFAULT>
		//   18   50:invokespecial   #42  <Method void JsonAutoDetect$Value(JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility, JsonAutoDetect$Visibility)>
		//   19   53:putstatic       #48  <Field JsonAutoDetect$Value NO_OVERRIDES>
		//*  20   56:return          
		}

		private Value(Visibility visibility, Visibility visibility1, Visibility visibility2, Visibility visibility3, Visibility visibility4)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #51  <Method void Object()>
			_fieldVisibility = visibility;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #53  <Field JsonAutoDetect$Visibility _fieldVisibility>
			_getterVisibility = visibility1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #55  <Field JsonAutoDetect$Visibility _getterVisibility>
			_isGetterVisibility = visibility2;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #57  <Field JsonAutoDetect$Visibility _isGetterVisibility>
			_setterVisibility = visibility3;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #59  <Field JsonAutoDetect$Visibility _setterVisibility>
			_creatorVisibility = visibility4;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #61  <Field JsonAutoDetect$Visibility _creatorVisibility>
		//   17   31:return          
		}
	}

	public static final class Visibility extends Enum
	{

		public static Visibility valueOf(String s)
		{
			return (Visibility)Enum.valueOf(com/fasterxml/jackson/annotation/JsonAutoDetect$Visibility, s);
		//    0    0:ldc1            #2   <Class JsonAutoDetect$Visibility>
		//    1    2:aload_0         
		//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonAutoDetect$Visibility>
		//    4    9:areturn         
		}

		public static Visibility[] values()
		{
			return (Visibility[])((Visibility []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field JsonAutoDetect$Visibility[] $VALUES>
		//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.fasterxml.jackson.annotation.JsonAutoDetect$Visibility_3B_.clone()>
		//    2    6:checkcast       #54  <Class JsonAutoDetect$Visibility[]>
		//    3    9:areturn         
		}

		public boolean isVisible(Member member)
		{
			static class _cls1
			{

				static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[];
				static final int $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[];

				static 
				{
					$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor = new int[PropertyAccessor.values().length];
				//    0    0:invokestatic    #19  <Method PropertyAccessor[] PropertyAccessor.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.CREATOR.ordinal()] = 1;
				//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
				//    5   12:getstatic       #25  <Field PropertyAccessor PropertyAccessor.CREATOR>
				//    6   15:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
				//*  10   23:getstatic       #32  <Field PropertyAccessor PropertyAccessor.FIELD>
				//*  11   26:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
				//*  15   34:getstatic       #35  <Field PropertyAccessor PropertyAccessor.GETTER>
				//*  16   37:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
				//*  20   45:getstatic       #38  <Field PropertyAccessor PropertyAccessor.IS_GETTER>
				//*  21   48:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
				//*  25   56:getstatic       #41  <Field PropertyAccessor PropertyAccessor.NONE>
				//*  26   59:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
				//*  27   62:iconst_5        
				//*  28   63:iastore         
				//*  29   64:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
				//*  30   67:getstatic       #44  <Field PropertyAccessor PropertyAccessor.SETTER>
				//*  31   70:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
				//*  32   73:bipush          6
				//*  33   75:iastore         
				//*  34   76:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
				//*  35   79:getstatic       #47  <Field PropertyAccessor PropertyAccessor.ALL>
				//*  36   82:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
				//*  37   85:bipush          7
				//*  38   87:iastore         
				//*  39   88:invokestatic    #52  <Method JsonAutoDetect$Visibility[] JsonAutoDetect$Visibility.values()>
				//*  40   91:arraylength     
				//*  41   92:newarray        int[]
				//*  42   94:putstatic       #54  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
				//*  43   97:getstatic       #54  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
				//*  44  100:getstatic       #58  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.ANY>
				//*  45  103:invokevirtual   #59  <Method int JsonAutoDetect$Visibility.ordinal()>
				//*  46  106:iconst_1        
				//*  47  107:iastore         
				//*  48  108:getstatic       #54  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
				//*  49  111:getstatic       #61  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.NONE>
				//*  50  114:invokevirtual   #59  <Method int JsonAutoDetect$Visibility.ordinal()>
				//*  51  117:iconst_2        
				//*  52  118:iastore         
				//*  53  119:getstatic       #54  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
				//*  54  122:getstatic       #64  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.NON_PRIVATE>
				//*  55  125:invokevirtual   #59  <Method int JsonAutoDetect$Visibility.ordinal()>
				//*  56  128:iconst_3        
				//*  57  129:iastore         
				//*  58  130:getstatic       #54  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
				//*  59  133:getstatic       #67  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PROTECTED_AND_PUBLIC>
				//*  60  136:invokevirtual   #59  <Method int JsonAutoDetect$Visibility.ordinal()>
				//*  61  139:iconst_4        
				//*  62  140:iastore         
				//*  63  141:getstatic       #54  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
				//*  64  144:getstatic       #70  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PUBLIC_ONLY>
				//*  65  147:invokevirtual   #59  <Method int JsonAutoDetect$Visibility.ordinal()>
				//*  66  150:iconst_5        
				//*  67  151:iastore         
				//*  68  152:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   69  153:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.FIELD.ordinal()] = 2;
					}
				//*  70  154:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   71  157:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.GETTER.ordinal()] = 3;
					}
				//*  72  158:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   73  161:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.IS_GETTER.ordinal()] = 4;
					}
				//*  74  162:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   75  165:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.NONE.ordinal()] = 5;
					}
				//*  76  166:goto            53
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   77  169:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.SETTER.ordinal()] = 6;
					}
				//*  78  170:goto            64
					catch(NoSuchFieldError nosuchfielderror5) { }
				//   79  173:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.ALL.ordinal()] = 7;
					}
				//*  80  174:goto            76
					catch(NoSuchFieldError nosuchfielderror6) { }
				//   81  177:astore_0        
					$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility = new int[Visibility.values().length];
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.ANY.ordinal()] = 1;
					}
				//*  82  178:goto            88
					catch(NoSuchFieldError nosuchfielderror7) { }
				//   83  181:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.NONE.ordinal()] = 2;
					}
				//*  84  182:goto            108
					catch(NoSuchFieldError nosuchfielderror8) { }
				//   85  185:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.NON_PRIVATE.ordinal()] = 3;
					}
				//*  86  186:goto            119
					catch(NoSuchFieldError nosuchfielderror9) { }
				//   87  189:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.PROTECTED_AND_PUBLIC.ordinal()] = 4;
					}
				//*  88  190:goto            130
					catch(NoSuchFieldError nosuchfielderror10) { }
				//   89  193:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.PUBLIC_ONLY.ordinal()] = 5;
					}
				//*  90  194:goto            141
					catch(NoSuchFieldError nosuchfielderror11) { }
				//   91  197:astore_0        
				//*  92  198:return          
				}
			}

			switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility[ordinal()])
		//*   0    0:getstatic       #66  <Field int[] JsonAutoDetect$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
		//*   1    3:aload_0         
		//*   2    4:invokevirtual   #70  <Method int ordinal()>
		//*   3    7:iaload          
			{
		//*   4    8:tableswitch     1 5: default 44
		//		               1 84
		//		               2 82
		//		               3 70
		//		               4 46
		//		               5 60
			default:
				return false;
		//    5   44:iconst_0        
		//    6   45:ireturn         

			case 4: // '\004'
				if(Modifier.isProtected(member.getModifiers()))
		//*   7   46:aload_1         
		//*   8   47:invokeinterface #75  <Method int Member.getModifiers()>
		//*   9   52:invokestatic    #81  <Method boolean Modifier.isProtected(int)>
		//*  10   55:ifeq            60
					return true;
		//   11   58:iconst_1        
		//   12   59:ireturn         
				// fall through

			case 5: // '\005'
				return Modifier.isPublic(member.getModifiers());
		//   13   60:aload_1         
		//   14   61:invokeinterface #75  <Method int Member.getModifiers()>
		//   15   66:invokestatic    #84  <Method boolean Modifier.isPublic(int)>
		//   16   69:ireturn         

			case 3: // '\003'
				return Modifier.isPrivate(member.getModifiers()) ^ true;
		//   17   70:aload_1         
		//   18   71:invokeinterface #75  <Method int Member.getModifiers()>
		//   19   76:invokestatic    #87  <Method boolean Modifier.isPrivate(int)>
		//   20   79:iconst_1        
		//   21   80:ixor            
		//   22   81:ireturn         

			case 2: // '\002'
				return false;
		//   23   82:iconst_0        
		//   24   83:ireturn         

			case 1: // '\001'
				return true;
		//   25   84:iconst_1        
		//   26   85:ireturn         
			}
		}

		private static final Visibility $VALUES[];
		public static final Visibility ANY;
		public static final Visibility DEFAULT;
		public static final Visibility NONE;
		public static final Visibility NON_PRIVATE;
		public static final Visibility PROTECTED_AND_PUBLIC;
		public static final Visibility PUBLIC_ONLY;

		static 
		{
			ANY = new Visibility("ANY", 0);
		//    0    0:new             #2   <Class JsonAutoDetect$Visibility>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "ANY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
		//    5   10:putstatic       #26  <Field JsonAutoDetect$Visibility ANY>
			NON_PRIVATE = new Visibility("NON_PRIVATE", 1);
		//    6   13:new             #2   <Class JsonAutoDetect$Visibility>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "NON_PRIVATE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
		//   11   23:putstatic       #29  <Field JsonAutoDetect$Visibility NON_PRIVATE>
			PROTECTED_AND_PUBLIC = new Visibility("PROTECTED_AND_PUBLIC", 2);
		//   12   26:new             #2   <Class JsonAutoDetect$Visibility>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "PROTECTED_AND_PUBLIC">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
		//   17   36:putstatic       #32  <Field JsonAutoDetect$Visibility PROTECTED_AND_PUBLIC>
			PUBLIC_ONLY = new Visibility("PUBLIC_ONLY", 3);
		//   18   39:new             #2   <Class JsonAutoDetect$Visibility>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "PUBLIC_ONLY">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
		//   23   49:putstatic       #35  <Field JsonAutoDetect$Visibility PUBLIC_ONLY>
			NONE = new Visibility("NONE", 4);
		//   24   52:new             #2   <Class JsonAutoDetect$Visibility>
		//   25   55:dup             
		//   26   56:ldc1            #36  <String "NONE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
		//   29   62:putstatic       #38  <Field JsonAutoDetect$Visibility NONE>
			DEFAULT = new Visibility("DEFAULT", 5);
		//   30   65:new             #2   <Class JsonAutoDetect$Visibility>
		//   31   68:dup             
		//   32   69:ldc1            #39  <String "DEFAULT">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #24  <Method void JsonAutoDetect$Visibility(String, int)>
		//   35   75:putstatic       #41  <Field JsonAutoDetect$Visibility DEFAULT>
			$VALUES = (new Visibility[] {
				ANY, NON_PRIVATE, PROTECTED_AND_PUBLIC, PUBLIC_ONLY, NONE, DEFAULT
			});
		//   36   78:bipush          6
		//   37   80:anewarray       Visibility[]
		//   38   83:dup             
		//   39   84:iconst_0        
		//   40   85:getstatic       #26  <Field JsonAutoDetect$Visibility ANY>
		//   41   88:aastore         
		//   42   89:dup             
		//   43   90:iconst_1        
		//   44   91:getstatic       #29  <Field JsonAutoDetect$Visibility NON_PRIVATE>
		//   45   94:aastore         
		//   46   95:dup             
		//   47   96:iconst_2        
		//   48   97:getstatic       #32  <Field JsonAutoDetect$Visibility PROTECTED_AND_PUBLIC>
		//   49  100:aastore         
		//   50  101:dup             
		//   51  102:iconst_3        
		//   52  103:getstatic       #35  <Field JsonAutoDetect$Visibility PUBLIC_ONLY>
		//   53  106:aastore         
		//   54  107:dup             
		//   55  108:iconst_4        
		//   56  109:getstatic       #38  <Field JsonAutoDetect$Visibility NONE>
		//   57  112:aastore         
		//   58  113:dup             
		//   59  114:iconst_5        
		//   60  115:getstatic       #41  <Field JsonAutoDetect$Visibility DEFAULT>
		//   61  118:aastore         
		//   62  119:putstatic       #43  <Field JsonAutoDetect$Visibility[] $VALUES>
		//*  63  122:return          
		}

		private Visibility(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract Visibility creatorVisibility();

	public abstract Visibility fieldVisibility();

	public abstract Visibility getterVisibility();

	public abstract Visibility isGetterVisibility();

	public abstract Visibility setterVisibility();
}
