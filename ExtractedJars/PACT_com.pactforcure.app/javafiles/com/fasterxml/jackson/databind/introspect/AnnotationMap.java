// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.util.*;

public final class AnnotationMap
	implements Annotations
{

	public AnnotationMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	private AnnotationMap(HashMap hashmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		_annotations = hashmap;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field HashMap _annotations>
	//    5    9:return          
	}

	public static AnnotationMap merge(AnnotationMap annotationmap, AnnotationMap annotationmap1)
	{
		AnnotationMap annotationmap2;
		if(annotationmap == null || annotationmap._annotations == null || annotationmap._annotations.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:ifnull          21
	//*   2    4:aload_0         
	//*   3    5:getfield        #17  <Field HashMap _annotations>
	//*   4    8:ifnull          21
	//*   5   11:aload_0         
	//*   6   12:getfield        #17  <Field HashMap _annotations>
	//*   7   15:invokevirtual   #27  <Method boolean HashMap.isEmpty()>
	//*   8   18:ifeq            25
		{
			annotationmap2 = annotationmap1;
	//    9   21:aload_1         
	//   10   22:astore_2        
		} else
	//*  11   23:aload_2         
	//*  12   24:areturn         
		{
			annotationmap2 = annotationmap;
	//   13   25:aload_0         
	//   14   26:astore_2        
			if(annotationmap1 != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          23
			{
				annotationmap2 = annotationmap;
	//   17   31:aload_0         
	//   18   32:astore_2        
				if(annotationmap1._annotations != null)
	//*  19   33:aload_1         
	//*  20   34:getfield        #17  <Field HashMap _annotations>
	//*  21   37:ifnull          23
				{
					annotationmap2 = annotationmap;
	//   22   40:aload_0         
	//   23   41:astore_2        
					if(!annotationmap1._annotations.isEmpty())
	//*  24   42:aload_1         
	//*  25   43:getfield        #17  <Field HashMap _annotations>
	//*  26   46:invokevirtual   #27  <Method boolean HashMap.isEmpty()>
	//*  27   49:ifne            23
					{
						HashMap hashmap = new HashMap();
	//   28   52:new             #23  <Class HashMap>
	//   29   55:dup             
	//   30   56:invokespecial   #28  <Method void HashMap()>
	//   31   59:astore_2        
						Annotation annotation;
						for(annotationmap1 = ((AnnotationMap) (annotationmap1._annotations.values().iterator())); ((Iterator) (annotationmap1)).hasNext(); hashmap.put(((Object) (annotation.annotationType())), ((Object) (annotation))))
	//*  32   60:aload_1         
	//*  33   61:getfield        #17  <Field HashMap _annotations>
	//*  34   64:invokevirtual   #32  <Method Collection HashMap.values()>
	//*  35   67:invokeinterface #38  <Method Iterator Collection.iterator()>
	//*  36   72:astore_1        
	//*  37   73:aload_1         
	//*  38   74:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//*  39   79:ifeq            107
							annotation = (Annotation)((Iterator) (annotationmap1)).next();
	//   40   82:aload_1         
	//   41   83:invokeinterface #47  <Method Object Iterator.next()>
	//   42   88:checkcast       #49  <Class Annotation>
	//   43   91:astore_3        

	//   44   92:aload_2         
	//   45   93:aload_3         
	//   46   94:invokeinterface #53  <Method Class Annotation.annotationType()>
	//   47   99:aload_3         
	//   48  100:invokevirtual   #57  <Method Object HashMap.put(Object, Object)>
	//   49  103:pop             
	//*  50  104:goto            73
						for(annotationmap = ((AnnotationMap) (annotationmap._annotations.values().iterator())); ((Iterator) (annotationmap)).hasNext(); hashmap.put(((Object) (((Annotation) (annotationmap1)).annotationType())), ((Object) (annotationmap1))))
	//*  51  107:aload_0         
	//*  52  108:getfield        #17  <Field HashMap _annotations>
	//*  53  111:invokevirtual   #32  <Method Collection HashMap.values()>
	//*  54  114:invokeinterface #38  <Method Iterator Collection.iterator()>
	//*  55  119:astore_0        
	//*  56  120:aload_0         
	//*  57  121:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//*  58  126:ifeq            154
							annotationmap1 = ((AnnotationMap) ((Annotation)((Iterator) (annotationmap)).next()));
	//   59  129:aload_0         
	//   60  130:invokeinterface #47  <Method Object Iterator.next()>
	//   61  135:checkcast       #49  <Class Annotation>
	//   62  138:astore_1        

	//   63  139:aload_2         
	//   64  140:aload_1         
	//   65  141:invokeinterface #53  <Method Class Annotation.annotationType()>
	//   66  146:aload_1         
	//   67  147:invokevirtual   #57  <Method Object HashMap.put(Object, Object)>
	//   68  150:pop             
	//*  69  151:goto            120
						return new AnnotationMap(hashmap);
	//   70  154:new             #2   <Class AnnotationMap>
	//   71  157:dup             
	//   72  158:aload_2         
	//   73  159:invokespecial   #59  <Method void AnnotationMap(HashMap)>
	//   74  162:areturn         
					}
				}
			}
		}
		return annotationmap2;
	}

	protected final boolean _add(Annotation annotation)
	{
		if(_annotations == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field HashMap _annotations>
	//*   2    4:ifnonnull       18
			_annotations = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #23  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #28  <Method void HashMap()>
	//    7   15:putfield        #17  <Field HashMap _annotations>
		Annotation annotation1 = (Annotation)_annotations.put(((Object) (annotation.annotationType())), ((Object) (annotation)));
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field HashMap _annotations>
	//   10   22:aload_1         
	//   11   23:invokeinterface #53  <Method Class Annotation.annotationType()>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #57  <Method Object HashMap.put(Object, Object)>
	//   14   32:checkcast       #49  <Class Annotation>
	//   15   35:astore_2        
		return annotation1 == null || !annotation1.equals(((Object) (annotation)));
	//   16   36:aload_2         
	//   17   37:ifnull          50
	//   18   40:aload_2         
	//   19   41:aload_1         
	//   20   42:invokeinterface #65  <Method boolean Annotation.equals(Object)>
	//   21   47:ifne            52
	//   22   50:iconst_1        
	//   23   51:ireturn         
	//   24   52:iconst_0        
	//   25   53:ireturn         
	}

	public boolean add(Annotation annotation)
	{
		return _add(annotation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #68  <Method boolean _add(Annotation)>
	//    3    5:ireturn         
	}

	public boolean addIfNotPresent(Annotation annotation)
	{
		if(_annotations == null || !_annotations.containsKey(((Object) (annotation.annotationType()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field HashMap _annotations>
	//*   2    4:ifnull          23
	//*   3    7:aload_0         
	//*   4    8:getfield        #17  <Field HashMap _annotations>
	//*   5   11:aload_1         
	//*   6   12:invokeinterface #53  <Method Class Annotation.annotationType()>
	//*   7   17:invokevirtual   #72  <Method boolean HashMap.containsKey(Object)>
	//*   8   20:ifne            31
		{
			_add(annotation);
	//    9   23:aload_0         
	//   10   24:aload_1         
	//   11   25:invokevirtual   #68  <Method boolean _add(Annotation)>
	//   12   28:pop             
			return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
		} else
		{
			return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		}
	}

	public Iterable annotations()
	{
		if(_annotations == null || _annotations.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field HashMap _annotations>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #17  <Field HashMap _annotations>
	//*   5   11:invokevirtual   #78  <Method int HashMap.size()>
	//*   6   14:ifne            21
			return ((Iterable) (Collections.emptyList()));
	//    7   17:invokestatic    #84  <Method java.util.List Collections.emptyList()>
	//    8   20:areturn         
		else
			return ((Iterable) (_annotations.values()));
	//    9   21:aload_0         
	//   10   22:getfield        #17  <Field HashMap _annotations>
	//   11   25:invokevirtual   #32  <Method Collection HashMap.values()>
	//   12   28:areturn         
	}

	public Annotation get(Class class1)
	{
		if(_annotations == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field HashMap _annotations>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (Annotation)_annotations.get(((Object) (class1)));
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field HashMap _annotations>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #90  <Method Object HashMap.get(Object)>
	//    9   17:checkcast       #49  <Class Annotation>
	//   10   20:areturn         
	}

	public boolean has(Class class1)
	{
		if(_annotations == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field HashMap _annotations>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return _annotations.containsKey(((Object) (class1)));
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field HashMap _annotations>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #72  <Method boolean HashMap.containsKey(Object)>
	//    9   17:ireturn         
	}

	public boolean hasOneOf(Class aclass[])
	{
		if(_annotations != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field HashMap _annotations>
	//*   2    4:ifnull          39
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
			for(int j = aclass.length; i < j; i++)
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:istore_3        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          39
				if(_annotations.containsKey(((Object) (aclass[i]))))
	//*  11   17:aload_0         
	//*  12   18:getfield        #17  <Field HashMap _annotations>
	//*  13   21:aload_1         
	//*  14   22:iload_2         
	//*  15   23:aaload          
	//*  16   24:invokevirtual   #72  <Method boolean HashMap.containsKey(Object)>
	//*  17   27:ifeq            32
					return true;
	//   18   30:iconst_1        
	//   19   31:ireturn         

	//   20   32:iload_2         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_2        
		}
	//*  24   36:goto            12
		return false;
	//   25   39:iconst_0        
	//   26   40:ireturn         
	}

	public int size()
	{
		if(_annotations == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field HashMap _annotations>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return _annotations.size();
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field HashMap _annotations>
	//    7   13:invokevirtual   #78  <Method int HashMap.size()>
	//    8   16:ireturn         
	}

	public String toString()
	{
		if(_annotations == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field HashMap _annotations>
	//*   2    4:ifnonnull       10
			return "[null]";
	//    3    7:ldc1            #101 <String "[null]">
	//    4    9:areturn         
		else
			return _annotations.toString();
	//    5   10:aload_0         
	//    6   11:getfield        #17  <Field HashMap _annotations>
	//    7   14:invokevirtual   #103 <Method String HashMap.toString()>
	//    8   17:areturn         
	}

	protected HashMap _annotations;
}
