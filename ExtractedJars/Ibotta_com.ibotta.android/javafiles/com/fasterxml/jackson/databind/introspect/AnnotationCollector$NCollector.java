// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotationCollector, AnnotationMap

static class AnnotationCollector$NCollector extends AnnotationCollector
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
			return ((Annotations) (new ons((Class)entry.getKey(), (Annotation)entry.getValue(), (Class)((java.util.Map.Entry) (obj)).getKey(), (Annotation)((java.util.Map.Entry) (obj)).getValue())));
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

	public AnnotationCollector$NCollector(Object obj, Class class1, Annotation annotation, Class class2, Annotation annotation1)
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
