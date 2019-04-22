// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotationMap

public abstract class AnnotationCollector
{
	static class EmptyCollector extends AnnotationCollector
	{

		public AnnotationCollector addOrOverride(Annotation annotation)
		{
			return ((AnnotationCollector) (new OneCollector(_data, annotation.annotationType(), annotation)));
		//    0    0:new             #21  <Class AnnotationCollector$OneCollector>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field Object _data>
		//    4    8:aload_1         
		//    5    9:invokeinterface #31  <Method Class Annotation.annotationType()>
		//    6   14:aload_1         
		//    7   15:invokespecial   #34  <Method void AnnotationCollector$OneCollector(Object, Class, Annotation)>
		//    8   18:areturn         
		}

		public AnnotationMap asAnnotationMap()
		{
			return new AnnotationMap();
		//    0    0:new             #38  <Class AnnotationMap>
		//    1    3:dup             
		//    2    4:invokespecial   #40  <Method void AnnotationMap()>
		//    3    7:areturn         
		}

		public Annotations asAnnotations()
		{
			return NO_ANNOTATIONS;
		//    0    0:getstatic       #46  <Field Annotations NO_ANNOTATIONS>
		//    1    3:areturn         
		}

		public boolean isPresent(Annotation annotation)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public static final EmptyCollector instance = new EmptyCollector(((Object) (null)));

		static 
		{
		//    0    0:new             #2   <Class AnnotationCollector$EmptyCollector>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #13  <Method void AnnotationCollector$EmptyCollector(Object)>
		//    4    8:putstatic       #15  <Field AnnotationCollector$EmptyCollector instance>
		//*   5   11:return          
		}

		EmptyCollector(Object obj)
		{
			super(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #17  <Method void AnnotationCollector(Object)>
		//    3    5:return          
		}
	}

	static class NCollector extends AnnotationCollector
	{

		public AnnotationCollector addOrOverride(Annotation annotation)
		{
			_annotations.put(((Object) (annotation.annotationType())), ((Object) (annotation)));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field HashMap _annotations>
		//    2    4:aload_1         
		//    3    5:invokeinterface #35  <Method Class Annotation.annotationType()>
		//    4   10:aload_1         
		//    5   11:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
		//    6   14:pop             
			return ((AnnotationCollector) (this));
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public AnnotationMap asAnnotationMap()
		{
			AnnotationMap annotationmap = new AnnotationMap();
		//    0    0:new             #39  <Class AnnotationMap>
		//    1    3:dup             
		//    2    4:invokespecial   #40  <Method void AnnotationMap()>
		//    3    7:astore_1        
			for(Iterator iterator = _annotations.values().iterator(); iterator.hasNext(); annotationmap.add((Annotation)iterator.next()));
		//    4    8:aload_0         
		//    5    9:getfield        #20  <Field HashMap _annotations>
		//    6   12:invokevirtual   #44  <Method Collection HashMap.values()>
		//    7   15:invokeinterface #50  <Method Iterator Collection.iterator()>
		//    8   20:astore_2        
		//    9   21:aload_2         
		//   10   22:invokeinterface #56  <Method boolean Iterator.hasNext()>
		//   11   27:ifeq            47
		//   12   30:aload_1         
		//   13   31:aload_2         
		//   14   32:invokeinterface #60  <Method Object Iterator.next()>
		//   15   37:checkcast       #31  <Class Annotation>
		//   16   40:invokevirtual   #64  <Method boolean AnnotationMap.add(Annotation)>
		//   17   43:pop             
		//*  18   44:goto            21
			return annotationmap;
		//   19   47:aload_1         
		//   20   48:areturn         
		}

		public Annotations asAnnotations()
		{
			if(_annotations.size() == 2)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field HashMap _annotations>
		//*   2    4:invokevirtual   #70  <Method int HashMap.size()>
		//*   3    7:iconst_2        
		//*   4    8:icmpne          88
			{
				Object obj = ((Object) (_annotations.entrySet().iterator()));
		//    5   11:aload_0         
		//    6   12:getfield        #20  <Field HashMap _annotations>
		//    7   15:invokevirtual   #74  <Method Set HashMap.entrySet()>
		//    8   18:invokeinterface #77  <Method Iterator Set.iterator()>
		//    9   23:astore_2        
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
		//   10   24:aload_2         
		//   11   25:invokeinterface #60  <Method Object Iterator.next()>
		//   12   30:checkcast       #79  <Class java.util.Map$Entry>
		//   13   33:astore_1        
				obj = ((Object) ((java.util.Map.Entry)((Iterator) (obj)).next()));
		//   14   34:aload_2         
		//   15   35:invokeinterface #60  <Method Object Iterator.next()>
		//   16   40:checkcast       #79  <Class java.util.Map$Entry>
		//   17   43:astore_2        
				return ((Annotations) (new TwoAnnotations((Class)entry.getKey(), (Annotation)entry.getValue(), (Class)((java.util.Map.Entry) (obj)).getKey(), (Annotation)((java.util.Map.Entry) (obj)).getValue())));
		//   18   44:new             #81  <Class AnnotationCollector$TwoAnnotations>
		//   19   47:dup             
		//   20   48:aload_1         
		//   21   49:invokeinterface #84  <Method Object java.util.Map$Entry.getKey()>
		//   22   54:checkcast       #86  <Class Class>
		//   23   57:aload_1         
		//   24   58:invokeinterface #89  <Method Object java.util.Map$Entry.getValue()>
		//   25   63:checkcast       #31  <Class Annotation>
		//   26   66:aload_2         
		//   27   67:invokeinterface #84  <Method Object java.util.Map$Entry.getKey()>
		//   28   72:checkcast       #86  <Class Class>
		//   29   75:aload_2         
		//   30   76:invokeinterface #89  <Method Object java.util.Map$Entry.getValue()>
		//   31   81:checkcast       #31  <Class Annotation>
		//   32   84:invokespecial   #92  <Method void AnnotationCollector$TwoAnnotations(Class, Annotation, Class, Annotation)>
		//   33   87:areturn         
			} else
			{
				return ((Annotations) (new AnnotationMap(_annotations)));
		//   34   88:new             #39  <Class AnnotationMap>
		//   35   91:dup             
		//   36   92:aload_0         
		//   37   93:getfield        #20  <Field HashMap _annotations>
		//   38   96:invokespecial   #95  <Method void AnnotationMap(HashMap)>
		//   39   99:areturn         
			}
		}

		public boolean isPresent(Annotation annotation)
		{
			return _annotations.containsKey(((Object) (annotation.annotationType())));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field HashMap _annotations>
		//    2    4:aload_1         
		//    3    5:invokeinterface #35  <Method Class Annotation.annotationType()>
		//    4   10:invokevirtual   #100 <Method boolean HashMap.containsKey(Object)>
		//    5   13:ireturn         
		}

		protected final HashMap _annotations = new HashMap();

		public NCollector(Object obj, Class class1, Annotation annotation, Class class2, Annotation annotation1)
		{
			super(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void AnnotationCollector(Object)>
		//    3    5:aload_0         
		//    4    6:new             #15  <Class HashMap>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void HashMap()>
		//    7   13:putfield        #20  <Field HashMap _annotations>
			_annotations.put(((Object) (class1)), ((Object) (annotation)));
		//    8   16:aload_0         
		//    9   17:getfield        #20  <Field HashMap _annotations>
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
		//   13   25:pop             
			_annotations.put(((Object) (class2)), ((Object) (annotation1)));
		//   14   26:aload_0         
		//   15   27:getfield        #20  <Field HashMap _annotations>
		//   16   30:aload           4
		//   17   32:aload           5
		//   18   34:invokevirtual   #24  <Method Object HashMap.put(Object, Object)>
		//   19   37:pop             
		//   20   38:return          
		}
	}

	public static class NoAnnotations
		implements Annotations, Serializable
	{

		public Annotation get(Class class1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public boolean has(Class class1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean hasOneOf(Class aclass[])
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int size()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		private static final long serialVersionUID = 1L;

		NoAnnotations()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class OneAnnotation
		implements Annotations, Serializable
	{

		public Annotation get(Class class1)
		{
			if(_type == class1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Class _type>
		//*   2    4:aload_1         
		//*   3    5:if_acmpne       13
				return _value;
		//    4    8:aload_0         
		//    5    9:getfield        #29  <Field Annotation _value>
		//    6   12:areturn         
			else
				return null;
		//    7   13:aconst_null     
		//    8   14:areturn         
		}

		public boolean has(Class class1)
		{
			return _type == class1;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Class _type>
		//    2    4:aload_1         
		//    3    5:if_acmpne       10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		public boolean hasOneOf(Class aclass[])
		{
			int j = aclass.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore_3        
			for(int i = 0; i < j; i++)
		//*   3    3:iconst_0        
		//*   4    4:istore_2        
		//*   5    5:iload_2         
		//*   6    6:iload_3         
		//*   7    7:icmpge          29
				if(aclass[i] == _type)
		//*   8   10:aload_1         
		//*   9   11:iload_2         
		//*  10   12:aaload          
		//*  11   13:aload_0         
		//*  12   14:getfield        #27  <Field Class _type>
		//*  13   17:if_acmpne       22
					return true;
		//   14   20:iconst_1        
		//   15   21:ireturn         

		//   16   22:iload_2         
		//   17   23:iconst_1        
		//   18   24:iadd            
		//   19   25:istore_2        
		//*  20   26:goto            5
			return false;
		//   21   29:iconst_0        
		//   22   30:ireturn         
		}

		public int size()
		{
			return 1;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		private static final long serialVersionUID = 1L;
		private final Class _type;
		private final Annotation _value;

		public OneAnnotation(Class class1, Annotation annotation)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			_type = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #27  <Field Class _type>
			_value = annotation;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #29  <Field Annotation _value>
		//    8   14:return          
		}
	}

	static class OneCollector extends AnnotationCollector
	{

		public AnnotationCollector addOrOverride(Annotation annotation)
		{
			Class class1 = annotation.annotationType();
		//    0    0:aload_1         
		//    1    1:invokeinterface #30  <Method Class Annotation.annotationType()>
		//    2    6:astore_2        
			if(_type == class1)
		//*   3    7:aload_0         
		//*   4    8:getfield        #17  <Field Class _type>
		//*   5   11:aload_2         
		//*   6   12:if_acmpne       22
			{
				_value = annotation;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #19  <Field Annotation _value>
				return ((AnnotationCollector) (this));
		//   10   20:aload_0         
		//   11   21:areturn         
			} else
			{
				return ((AnnotationCollector) (new NCollector(_data, _type, _value, class1, annotation)));
		//   12   22:new             #32  <Class AnnotationCollector$NCollector>
		//   13   25:dup             
		//   14   26:aload_0         
		//   15   27:getfield        #36  <Field Object _data>
		//   16   30:aload_0         
		//   17   31:getfield        #17  <Field Class _type>
		//   18   34:aload_0         
		//   19   35:getfield        #19  <Field Annotation _value>
		//   20   38:aload_2         
		//   21   39:aload_1         
		//   22   40:invokespecial   #39  <Method void AnnotationCollector$NCollector(Object, Class, Annotation, Class, Annotation)>
		//   23   43:areturn         
			}
		}

		public AnnotationMap asAnnotationMap()
		{
			return AnnotationMap.of(_type, _value);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field Class _type>
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Annotation _value>
		//    4    8:invokestatic    #47  <Method AnnotationMap AnnotationMap.of(Class, Annotation)>
		//    5   11:areturn         
		}

		public Annotations asAnnotations()
		{
			return ((Annotations) (new OneAnnotation(_type, _value)));
		//    0    0:new             #51  <Class AnnotationCollector$OneAnnotation>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #17  <Field Class _type>
		//    4    8:aload_0         
		//    5    9:getfield        #19  <Field Annotation _value>
		//    6   12:invokespecial   #54  <Method void AnnotationCollector$OneAnnotation(Class, Annotation)>
		//    7   15:areturn         
		}

		public boolean isPresent(Annotation annotation)
		{
			return annotation.annotationType() == _type;
		//    0    0:aload_1         
		//    1    1:invokeinterface #30  <Method Class Annotation.annotationType()>
		//    2    6:aload_0         
		//    3    7:getfield        #17  <Field Class _type>
		//    4   10:if_acmpne       15
		//    5   13:iconst_1        
		//    6   14:ireturn         
		//    7   15:iconst_0        
		//    8   16:ireturn         
		}

		private Class _type;
		private Annotation _value;

		public OneCollector(Object obj, Class class1, Annotation annotation)
		{
			super(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #15  <Method void AnnotationCollector(Object)>
			_type = class1;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #17  <Field Class _type>
			_value = annotation;
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:putfield        #19  <Field Annotation _value>
		//    9   15:return          
		}
	}

	public static class TwoAnnotations
		implements Annotations, Serializable
	{

		public Annotation get(Class class1)
		{
			if(_type1 == class1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field Class _type1>
		//*   2    4:aload_1         
		//*   3    5:if_acmpne       13
				return _value1;
		//    4    8:aload_0         
		//    5    9:getfield        #31  <Field Annotation _value1>
		//    6   12:areturn         
			if(_type2 == class1)
		//*   7   13:aload_0         
		//*   8   14:getfield        #33  <Field Class _type2>
		//*   9   17:aload_1         
		//*  10   18:if_acmpne       26
				return _value2;
		//   11   21:aload_0         
		//   12   22:getfield        #35  <Field Annotation _value2>
		//   13   25:areturn         
			else
				return null;
		//   14   26:aconst_null     
		//   15   27:areturn         
		}

		public boolean has(Class class1)
		{
			return _type1 == class1 || _type2 == class1;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field Class _type1>
		//    2    4:aload_1         
		//    3    5:if_acmpeq       21
		//    4    8:aload_0         
		//    5    9:getfield        #33  <Field Class _type2>
		//    6   12:aload_1         
		//    7   13:if_acmpne       19
		//    8   16:goto            21
		//    9   19:iconst_0        
		//   10   20:ireturn         
		//   11   21:iconst_1        
		//   12   22:ireturn         
		}

		public boolean hasOneOf(Class aclass[])
		{
			int j = aclass.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore_3        
			for(int i = 0; i < j;)
		//*   3    3:iconst_0        
		//*   4    4:istore_2        
		//*   5    5:iload_2         
		//*   6    6:iload_3         
		//*   7    7:icmpge          45
			{
				Class class1 = aclass[i];
		//    8   10:aload_1         
		//    9   11:iload_2         
		//   10   12:aaload          
		//   11   13:astore          4
				if(class1 != _type1 && class1 != _type2)
		//*  12   15:aload           4
		//*  13   17:aload_0         
		//*  14   18:getfield        #29  <Field Class _type1>
		//*  15   21:if_acmpeq       43
		//*  16   24:aload           4
		//*  17   26:aload_0         
		//*  18   27:getfield        #33  <Field Class _type2>
		//*  19   30:if_acmpne       36
		//*  20   33:goto            43
					i++;
		//   21   36:iload_2         
		//   22   37:iconst_1        
		//   23   38:iadd            
		//   24   39:istore_2        
				else
		//*  25   40:goto            5
					return true;
		//   26   43:iconst_1        
		//   27   44:ireturn         
			}

			return false;
		//   28   45:iconst_0        
		//   29   46:ireturn         
		}

		public int size()
		{
			return 2;
		//    0    0:iconst_2        
		//    1    1:ireturn         
		}

		private static final long serialVersionUID = 1L;
		private final Class _type1;
		private final Class _type2;
		private final Annotation _value1;
		private final Annotation _value2;

		public TwoAnnotations(Class class1, Annotation annotation, Class class2, Annotation annotation1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
			_type1 = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #29  <Field Class _type1>
			_value1 = annotation;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #31  <Field Annotation _value1>
			_type2 = class2;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #33  <Field Class _type2>
			_value2 = annotation1;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #35  <Field Annotation _value2>
		//   14   25:return          
		}
	}


	protected AnnotationCollector(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		_data = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field Object _data>
	//    5    9:return          
	}

	public static Annotations emptyAnnotations()
	{
		return NO_ANNOTATIONS;
	//    0    0:getstatic       #33  <Field Annotations NO_ANNOTATIONS>
	//    1    3:areturn         
	}

	public static AnnotationCollector emptyCollector()
	{
		return ((AnnotationCollector) (EmptyCollector.instance));
	//    0    0:getstatic       #46  <Field AnnotationCollector$EmptyCollector AnnotationCollector$EmptyCollector.instance>
	//    1    3:areturn         
	}

	public abstract AnnotationCollector addOrOverride(Annotation annotation);

	public abstract AnnotationMap asAnnotationMap();

	public abstract Annotations asAnnotations();

	public abstract boolean isPresent(Annotation annotation);

	protected static final Annotations NO_ANNOTATIONS = new NoAnnotations();
	protected final Object _data;

	static 
	{
	//    0    0:new             #12  <Class AnnotationCollector$NoAnnotations>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void AnnotationCollector$NoAnnotations()>
	//    3    7:putstatic       #33  <Field Annotations NO_ANNOTATIONS>
	//*   4   10:return          
	}
}
