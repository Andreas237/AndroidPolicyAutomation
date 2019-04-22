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

	AnnotationMap(HashMap hashmap)
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
		if(annotationmap != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          157
		{
			HashMap hashmap = annotationmap._annotations;
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field HashMap _annotations>
	//    4    8:astore_2        
			if(hashmap != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          157
			{
				if(hashmap.isEmpty())
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #27  <Method boolean HashMap.isEmpty()>
	//*   9   17:ifeq            22
					return annotationmap1;
	//   10   20:aload_1         
	//   11   21:areturn         
				if(annotationmap1 != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          155
				{
					HashMap hashmap1 = annotationmap1._annotations;
	//   14   26:aload_1         
	//   15   27:getfield        #17  <Field HashMap _annotations>
	//   16   30:astore_2        
					if(hashmap1 != null)
	//*  17   31:aload_2         
	//*  18   32:ifnull          155
					{
						if(hashmap1.isEmpty())
	//*  19   35:aload_2         
	//*  20   36:invokevirtual   #27  <Method boolean HashMap.isEmpty()>
	//*  21   39:ifeq            44
							return annotationmap;
	//   22   42:aload_0         
	//   23   43:areturn         
						hashmap1 = new HashMap();
	//   24   44:new             #23  <Class HashMap>
	//   25   47:dup             
	//   26   48:invokespecial   #28  <Method void HashMap()>
	//   27   51:astore_2        
						Annotation annotation;
						for(annotationmap1 = ((AnnotationMap) (annotationmap1._annotations.values().iterator())); ((Iterator) (annotationmap1)).hasNext(); hashmap1.put(((Object) (annotation.annotationType())), ((Object) (annotation))))
	//*  28   52:aload_1         
	//*  29   53:getfield        #17  <Field HashMap _annotations>
	//*  30   56:invokevirtual   #32  <Method Collection HashMap.values()>
	//*  31   59:invokeinterface #38  <Method Iterator Collection.iterator()>
	//*  32   64:astore_1        
	//*  33   65:aload_1         
	//*  34   66:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//*  35   71:ifeq            99
							annotation = (Annotation)((Iterator) (annotationmap1)).next();
	//   36   74:aload_1         
	//   37   75:invokeinterface #47  <Method Object Iterator.next()>
	//   38   80:checkcast       #49  <Class Annotation>
	//   39   83:astore_3        

	//   40   84:aload_2         
	//   41   85:aload_3         
	//   42   86:invokeinterface #53  <Method Class Annotation.annotationType()>
	//   43   91:aload_3         
	//   44   92:invokevirtual   #57  <Method Object HashMap.put(Object, Object)>
	//   45   95:pop             
	//*  46   96:goto            65
						for(annotationmap = ((AnnotationMap) (annotationmap._annotations.values().iterator())); ((Iterator) (annotationmap)).hasNext(); hashmap1.put(((Object) (((Annotation) (annotationmap1)).annotationType())), ((Object) (annotationmap1))))
	//*  47   99:aload_0         
	//*  48  100:getfield        #17  <Field HashMap _annotations>
	//*  49  103:invokevirtual   #32  <Method Collection HashMap.values()>
	//*  50  106:invokeinterface #38  <Method Iterator Collection.iterator()>
	//*  51  111:astore_0        
	//*  52  112:aload_0         
	//*  53  113:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//*  54  118:ifeq            146
							annotationmap1 = ((AnnotationMap) ((Annotation)((Iterator) (annotationmap)).next()));
	//   55  121:aload_0         
	//   56  122:invokeinterface #47  <Method Object Iterator.next()>
	//   57  127:checkcast       #49  <Class Annotation>
	//   58  130:astore_1        

	//   59  131:aload_2         
	//   60  132:aload_1         
	//   61  133:invokeinterface #53  <Method Class Annotation.annotationType()>
	//   62  138:aload_1         
	//   63  139:invokevirtual   #57  <Method Object HashMap.put(Object, Object)>
	//   64  142:pop             
	//*  65  143:goto            112
						return new AnnotationMap(hashmap1);
	//   66  146:new             #2   <Class AnnotationMap>
	//   67  149:dup             
	//   68  150:aload_2         
	//   69  151:invokespecial   #59  <Method void AnnotationMap(HashMap)>
	//   70  154:areturn         
					}
				}
				return annotationmap;
	//   71  155:aload_0         
	//   72  156:areturn         
			}
		}
		return annotationmap1;
	//   73  157:aload_1         
	//   74  158:areturn         
	}

	public static AnnotationMap of(Class class1, Annotation annotation)
	{
		HashMap hashmap = new HashMap(4);
	//    0    0:new             #23  <Class HashMap>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:invokespecial   #64  <Method void HashMap(int)>
	//    4    8:astore_2        
		hashmap.put(((Object) (class1)), ((Object) (annotation)));
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #57  <Method Object HashMap.put(Object, Object)>
	//    9   15:pop             
		return new AnnotationMap(hashmap);
	//   10   16:new             #2   <Class AnnotationMap>
	//   11   19:dup             
	//   12   20:aload_2         
	//   13   21:invokespecial   #59  <Method void AnnotationMap(HashMap)>
	//   14   24:areturn         
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
	//   17   37:ifnull          55
	//   18   40:aload_2         
	//   19   41:aload_1         
	//   20   42:invokeinterface #71  <Method boolean Annotation.equals(Object)>
	//   21   47:ifne            53
	//   22   50:goto            55
	//   23   53:iconst_0        
	//   24   54:ireturn         
	//   25   55:iconst_1        
	//   26   56:ireturn         
	}

	public boolean add(Annotation annotation)
	{
		return _add(annotation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #74  <Method boolean _add(Annotation)>
	//    3    5:ireturn         
	}

	public Annotation get(Class class1)
	{
		HashMap hashmap = _annotations;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field HashMap _annotations>
	//    2    4:astore_2        
		if(hashmap == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return (Annotation)hashmap.get(((Object) (class1)));
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #79  <Method Object HashMap.get(Object)>
	//   10   16:checkcast       #49  <Class Annotation>
	//   11   19:areturn         
	}

	public boolean has(Class class1)
	{
		HashMap hashmap = _annotations;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field HashMap _annotations>
	//    2    4:astore_2        
		if(hashmap == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return hashmap.containsKey(((Object) (class1)));
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #85  <Method boolean HashMap.containsKey(Object)>
	//   10   16:ireturn         
	}

	public boolean hasOneOf(Class aclass[])
	{
		if(_annotations != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field HashMap _annotations>
	//*   2    4:ifnull          39
		{
			int j = aclass.length;
	//    3    7:aload_1         
	//    4    8:arraylength     
	//    5    9:istore_3        
			for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          39
				if(_annotations.containsKey(((Object) (aclass[i]))))
	//*  11   17:aload_0         
	//*  12   18:getfield        #17  <Field HashMap _annotations>
	//*  13   21:aload_1         
	//*  14   22:iload_2         
	//*  15   23:aaload          
	//*  16   24:invokevirtual   #85  <Method boolean HashMap.containsKey(Object)>
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
		HashMap hashmap = _annotations;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field HashMap _annotations>
	//    2    4:astore_1        
		if(hashmap == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return hashmap.size();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #93  <Method int HashMap.size()>
	//    9   15:ireturn         
	}

	public String toString()
	{
		HashMap hashmap = _annotations;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field HashMap _annotations>
	//    2    4:astore_1        
		if(hashmap == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       12
			return "[null]";
	//    5    9:ldc1            #97  <String "[null]">
	//    6   11:areturn         
		else
			return hashmap.toString();
	//    7   12:aload_1         
	//    8   13:invokevirtual   #99  <Method String HashMap.toString()>
	//    9   16:areturn         
	}

	protected HashMap _annotations;
}
