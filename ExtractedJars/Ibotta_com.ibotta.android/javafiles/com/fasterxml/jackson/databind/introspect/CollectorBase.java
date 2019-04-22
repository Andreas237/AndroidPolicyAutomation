// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotationMap, AnnotationCollector

class CollectorBase
{

	protected CollectorBase(AnnotationIntrospector annotationintrospector)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		_intr = annotationintrospector;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field AnnotationIntrospector _intr>
	//    5    9:return          
	}

	static AnnotationMap _emptyAnnotationMap()
	{
		return new AnnotationMap();
	//    0    0:new             #14  <Class AnnotationMap>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void AnnotationMap()>
	//    3    7:areturn         
	}

	static AnnotationMap[] _emptyAnnotationMaps(int i)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            8
			return NO_ANNOTATION_MAPS;
	//    2    4:getstatic       #16  <Field AnnotationMap[] NO_ANNOTATION_MAPS>
	//    3    7:areturn         
		AnnotationMap aannotationmap[] = new AnnotationMap[i];
	//    4    8:iload_0         
	//    5    9:anewarray       AnnotationMap[]
	//    6   12:astore_2        
		for(int j = 0; j < i; j++)
	//*   7   13:iconst_0        
	//*   8   14:istore_1        
	//*   9   15:iload_1         
	//*  10   16:iload_0         
	//*  11   17:icmpge          33
			aannotationmap[j] = _emptyAnnotationMap();
	//   12   20:aload_2         
	//   13   21:iload_1         
	//   14   22:invokestatic    #34  <Method AnnotationMap _emptyAnnotationMap()>
	//   15   25:aastore         

	//   16   26:iload_1         
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:istore_1        
	//*  20   30:goto            15
		return aannotationmap;
	//   21   33:aload_2         
	//   22   34:areturn         
	}

	protected static final boolean _ignorableAnnotation(Annotation annotation)
	{
		return (annotation instanceof Target) || (annotation instanceof Retention);
	//    0    0:aload_0         
	//    1    1:instanceof      #38  <Class Target>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:instanceof      #40  <Class Retention>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	protected final AnnotationCollector collectAnnotations(AnnotationCollector annotationcollector, Annotation aannotation[])
	{
		int j = aannotation.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore          4
		for(int i = 0; i < j; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore_3        
	//*   5    6:iload_3         
	//*   6    7:iload           4
	//*   7    9:icmpge          56
		{
			Annotation annotation = aannotation[i];
	//    8   12:aload_2         
	//    9   13:iload_3         
	//   10   14:aaload          
	//   11   15:astore          6
			AnnotationCollector annotationcollector1 = annotationcollector.addOrOverride(annotation);
	//   12   17:aload_1         
	//   13   18:aload           6
	//   14   20:invokevirtual   #48  <Method AnnotationCollector AnnotationCollector.addOrOverride(Annotation)>
	//   15   23:astore          5
			annotationcollector = annotationcollector1;
	//   16   25:aload           5
	//   17   27:astore_1        
			if(_intr.isAnnotationBundle(annotation))
	//*  18   28:aload_0         
	//*  19   29:getfield        #27  <Field AnnotationIntrospector _intr>
	//*  20   32:aload           6
	//*  21   34:invokevirtual   #53  <Method boolean AnnotationIntrospector.isAnnotationBundle(Annotation)>
	//*  22   37:ifeq            49
				annotationcollector = collectFromBundle(annotationcollector1, annotation);
	//   23   40:aload_0         
	//   24   41:aload           5
	//   25   43:aload           6
	//   26   45:invokevirtual   #57  <Method AnnotationCollector collectFromBundle(AnnotationCollector, Annotation)>
	//   27   48:astore_1        
		}

	//   28   49:iload_3         
	//   29   50:iconst_1        
	//   30   51:iadd            
	//   31   52:istore_3        
	//*  32   53:goto            6
		return annotationcollector;
	//   33   56:aload_1         
	//   34   57:areturn         
	}

	protected final AnnotationCollector collectAnnotations(Annotation aannotation[])
	{
		AnnotationCollector annotationcollector = AnnotationCollector.emptyCollector();
	//    0    0:invokestatic    #62  <Method AnnotationCollector AnnotationCollector.emptyCollector()>
	//    1    3:astore          4
		int j = aannotation.length;
	//    2    5:aload_1         
	//    3    6:arraylength     
	//    4    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   5    8:iconst_0        
	//*   6    9:istore_2        
	//*   7   10:iload_2         
	//*   8   11:iload_3         
	//*   9   12:icmpge          62
		{
			Annotation annotation = aannotation[i];
	//   10   15:aload_1         
	//   11   16:iload_2         
	//   12   17:aaload          
	//   13   18:astore          6
			AnnotationCollector annotationcollector1 = annotationcollector.addOrOverride(annotation);
	//   14   20:aload           4
	//   15   22:aload           6
	//   16   24:invokevirtual   #48  <Method AnnotationCollector AnnotationCollector.addOrOverride(Annotation)>
	//   17   27:astore          5
			annotationcollector = annotationcollector1;
	//   18   29:aload           5
	//   19   31:astore          4
			if(_intr.isAnnotationBundle(annotation))
	//*  20   33:aload_0         
	//*  21   34:getfield        #27  <Field AnnotationIntrospector _intr>
	//*  22   37:aload           6
	//*  23   39:invokevirtual   #53  <Method boolean AnnotationIntrospector.isAnnotationBundle(Annotation)>
	//*  24   42:ifeq            55
				annotationcollector = collectFromBundle(annotationcollector1, annotation);
	//   25   45:aload_0         
	//   26   46:aload           5
	//   27   48:aload           6
	//   28   50:invokevirtual   #57  <Method AnnotationCollector collectFromBundle(AnnotationCollector, Annotation)>
	//   29   53:astore          4
		}

	//   30   55:iload_2         
	//   31   56:iconst_1        
	//   32   57:iadd            
	//   33   58:istore_2        
	//*  34   59:goto            10
		return annotationcollector;
	//   35   62:aload           4
	//   36   64:areturn         
	}

	protected final AnnotationCollector collectDefaultAnnotations(AnnotationCollector annotationcollector, Annotation aannotation[])
	{
		int j = aannotation.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore          4
		int i = 0;
	//    3    4:iconst_0        
	//    4    5:istore_3        
		AnnotationCollector annotationcollector1;
		for(annotationcollector1 = annotationcollector; i < j; annotationcollector1 = annotationcollector)
	//*   5    6:aload_1         
	//*   6    7:astore          5
	//*   7    9:iload_3         
	//*   8   10:iload           4
	//*   9   12:icmpge          76
		{
			Annotation annotation = aannotation[i];
	//   10   15:aload_2         
	//   11   16:iload_3         
	//   12   17:aaload          
	//   13   18:astore          6
			annotationcollector = annotationcollector1;
	//   14   20:aload           5
	//   15   22:astore_1        
			if(!annotationcollector1.isPresent(annotation))
	//*  16   23:aload           5
	//*  17   25:aload           6
	//*  18   27:invokevirtual   #66  <Method boolean AnnotationCollector.isPresent(Annotation)>
	//*  19   30:ifne            66
			{
				annotationcollector1 = annotationcollector1.addOrOverride(annotation);
	//   20   33:aload           5
	//   21   35:aload           6
	//   22   37:invokevirtual   #48  <Method AnnotationCollector AnnotationCollector.addOrOverride(Annotation)>
	//   23   40:astore          5
				annotationcollector = annotationcollector1;
	//   24   42:aload           5
	//   25   44:astore_1        
				if(_intr.isAnnotationBundle(annotation))
	//*  26   45:aload_0         
	//*  27   46:getfield        #27  <Field AnnotationIntrospector _intr>
	//*  28   49:aload           6
	//*  29   51:invokevirtual   #53  <Method boolean AnnotationIntrospector.isAnnotationBundle(Annotation)>
	//*  30   54:ifeq            66
					annotationcollector = collectDefaultFromBundle(annotationcollector1, annotation);
	//   31   57:aload_0         
	//   32   58:aload           5
	//   33   60:aload           6
	//   34   62:invokevirtual   #69  <Method AnnotationCollector collectDefaultFromBundle(AnnotationCollector, Annotation)>
	//   35   65:astore_1        
			}
			i++;
	//   36   66:iload_3         
	//   37   67:iconst_1        
	//   38   68:iadd            
	//   39   69:istore_3        
		}

	//   40   70:aload_1         
	//   41   71:astore          5
	//*  42   73:goto            9
		return annotationcollector1;
	//   43   76:aload           5
	//   44   78:areturn         
	}

	protected final AnnotationCollector collectDefaultFromBundle(AnnotationCollector annotationcollector, Annotation annotation)
	{
		Annotation aannotation[] = ClassUtil.findClassAnnotations(annotation.annotationType());
	//    0    0:aload_2         
	//    1    1:invokeinterface #73  <Method Class Annotation.annotationType()>
	//    2    6:invokestatic    #79  <Method Annotation[] ClassUtil.findClassAnnotations(Class)>
	//    3    9:astore          5
		int j = aannotation.length;
	//    4   11:aload           5
	//    5   13:arraylength     
	//    6   14:istore          4
		int i = 0;
	//    7   16:iconst_0        
	//    8   17:istore_3        
		for(annotation = ((Annotation) (annotationcollector)); i < j; annotation = ((Annotation) (annotationcollector)))
	//*   9   18:aload_1         
	//*  10   19:astore_2        
	//*  11   20:iload_3         
	//*  12   21:iload           4
	//*  13   23:icmpge          94
		{
			Annotation annotation1 = aannotation[i];
	//   14   26:aload           5
	//   15   28:iload_3         
	//   16   29:aaload          
	//   17   30:astore          6
			if(_ignorableAnnotation(annotation1))
	//*  18   32:aload           6
	//*  19   34:invokestatic    #81  <Method boolean _ignorableAnnotation(Annotation)>
	//*  20   37:ifeq            45
			{
				annotationcollector = ((AnnotationCollector) (annotation));
	//   21   40:aload_2         
	//   22   41:astore_1        
			} else
	//*  23   42:goto            85
			{
				annotationcollector = ((AnnotationCollector) (annotation));
	//   24   45:aload_2         
	//   25   46:astore_1        
				if(!((AnnotationCollector) (annotation)).isPresent(annotation1))
	//*  26   47:aload_2         
	//*  27   48:aload           6
	//*  28   50:invokevirtual   #66  <Method boolean AnnotationCollector.isPresent(Annotation)>
	//*  29   53:ifne            85
				{
					annotation = ((Annotation) (((AnnotationCollector) (annotation)).addOrOverride(annotation1)));
	//   30   56:aload_2         
	//   31   57:aload           6
	//   32   59:invokevirtual   #48  <Method AnnotationCollector AnnotationCollector.addOrOverride(Annotation)>
	//   33   62:astore_2        
					annotationcollector = ((AnnotationCollector) (annotation));
	//   34   63:aload_2         
	//   35   64:astore_1        
					if(_intr.isAnnotationBundle(annotation1))
	//*  36   65:aload_0         
	//*  37   66:getfield        #27  <Field AnnotationIntrospector _intr>
	//*  38   69:aload           6
	//*  39   71:invokevirtual   #53  <Method boolean AnnotationIntrospector.isAnnotationBundle(Annotation)>
	//*  40   74:ifeq            85
						annotationcollector = collectFromBundle(((AnnotationCollector) (annotation)), annotation1);
	//   41   77:aload_0         
	//   42   78:aload_2         
	//   43   79:aload           6
	//   44   81:invokevirtual   #57  <Method AnnotationCollector collectFromBundle(AnnotationCollector, Annotation)>
	//   45   84:astore_1        
				}
			}
			i++;
	//   46   85:iload_3         
	//   47   86:iconst_1        
	//   48   87:iadd            
	//   49   88:istore_3        
		}

	//   50   89:aload_1         
	//   51   90:astore_2        
	//*  52   91:goto            20
		return ((AnnotationCollector) (annotation));
	//   53   94:aload_2         
	//   54   95:areturn         
	}

	protected final AnnotationCollector collectFromBundle(AnnotationCollector annotationcollector, Annotation annotation)
	{
		Annotation aannotation[] = ClassUtil.findClassAnnotations(annotation.annotationType());
	//    0    0:aload_2         
	//    1    1:invokeinterface #73  <Method Class Annotation.annotationType()>
	//    2    6:invokestatic    #79  <Method Annotation[] ClassUtil.findClassAnnotations(Class)>
	//    3    9:astore          5
		int j = aannotation.length;
	//    4   11:aload           5
	//    5   13:arraylength     
	//    6   14:istore          4
		int i = 0;
	//    7   16:iconst_0        
	//    8   17:istore_3        
		for(annotation = ((Annotation) (annotationcollector)); i < j; annotation = ((Annotation) (annotationcollector)))
	//*   9   18:aload_1         
	//*  10   19:astore_2        
	//*  11   20:iload_3         
	//*  12   21:iload           4
	//*  13   23:icmpge          100
		{
			Annotation annotation1 = aannotation[i];
	//   14   26:aload           5
	//   15   28:iload_3         
	//   16   29:aaload          
	//   17   30:astore          6
			if(_ignorableAnnotation(annotation1))
	//*  18   32:aload           6
	//*  19   34:invokestatic    #81  <Method boolean _ignorableAnnotation(Annotation)>
	//*  20   37:ifeq            45
				annotationcollector = ((AnnotationCollector) (annotation));
	//   21   40:aload_2         
	//   22   41:astore_1        
			else
	//*  23   42:goto            91
			if(_intr.isAnnotationBundle(annotation1))
	//*  24   45:aload_0         
	//*  25   46:getfield        #27  <Field AnnotationIntrospector _intr>
	//*  26   49:aload           6
	//*  27   51:invokevirtual   #53  <Method boolean AnnotationIntrospector.isAnnotationBundle(Annotation)>
	//*  28   54:ifeq            84
			{
				annotationcollector = ((AnnotationCollector) (annotation));
	//   29   57:aload_2         
	//   30   58:astore_1        
				if(!((AnnotationCollector) (annotation)).isPresent(annotation1))
	//*  31   59:aload_2         
	//*  32   60:aload           6
	//*  33   62:invokevirtual   #66  <Method boolean AnnotationCollector.isPresent(Annotation)>
	//*  34   65:ifne            91
					annotationcollector = collectFromBundle(((AnnotationCollector) (annotation)).addOrOverride(annotation1), annotation1);
	//   35   68:aload_0         
	//   36   69:aload_2         
	//   37   70:aload           6
	//   38   72:invokevirtual   #48  <Method AnnotationCollector AnnotationCollector.addOrOverride(Annotation)>
	//   39   75:aload           6
	//   40   77:invokevirtual   #57  <Method AnnotationCollector collectFromBundle(AnnotationCollector, Annotation)>
	//   41   80:astore_1        
			} else
	//*  42   81:goto            91
			{
				annotationcollector = ((AnnotationCollector) (annotation)).addOrOverride(annotation1);
	//   43   84:aload_2         
	//   44   85:aload           6
	//   45   87:invokevirtual   #48  <Method AnnotationCollector AnnotationCollector.addOrOverride(Annotation)>
	//   46   90:astore_1        
			}
			i++;
	//   47   91:iload_3         
	//   48   92:iconst_1        
	//   49   93:iadd            
	//   50   94:istore_3        
		}

	//   51   95:aload_1         
	//   52   96:astore_2        
	//*  53   97:goto            20
		return ((AnnotationCollector) (annotation));
	//   54  100:aload_2         
	//   55  101:areturn         
	}

	protected static final Annotation NO_ANNOTATIONS[] = new Annotation[0];
	protected static final AnnotationMap NO_ANNOTATION_MAPS[] = new AnnotationMap[0];
	protected final AnnotationIntrospector _intr;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       AnnotationMap[]
	//    2    4:putstatic       #16  <Field AnnotationMap[] NO_ANNOTATION_MAPS>
	//    3    7:iconst_0        
	//    4    8:anewarray       Annotation[]
	//    5   11:putstatic       #20  <Field Annotation[] NO_ANNOTATIONS>
	//*   6   14:return          
	}
}
