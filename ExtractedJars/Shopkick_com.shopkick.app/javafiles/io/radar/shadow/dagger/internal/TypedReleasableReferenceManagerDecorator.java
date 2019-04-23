// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.dagger.releasablereferences.ReleasableReferenceManager;
import io.radar.shadow.dagger.releasablereferences.TypedReleasableReferenceManager;
import java.lang.annotation.Annotation;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			Preconditions

public final class TypedReleasableReferenceManagerDecorator
	implements TypedReleasableReferenceManager
{

	public TypedReleasableReferenceManagerDecorator(ReleasableReferenceManager releasablereferencemanager, Annotation annotation)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		_flddelegate = (ReleasableReferenceManager)Preconditions.checkNotNull(((Object) (releasablereferencemanager)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #24  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #26  <Class ReleasableReferenceManager>
	//    6   12:putfield        #28  <Field ReleasableReferenceManager _flddelegate>
		metadata = (Annotation)Preconditions.checkNotNull(((Object) (annotation)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #24  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #30  <Class Annotation>
	//   11   23:putfield        #32  <Field Annotation metadata>
	//   12   26:return          
	}

	public Annotation metadata()
	{
		return metadata;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Annotation metadata>
	//    2    4:areturn         
	}

	public void releaseStrongReferences()
	{
		_flddelegate.releaseStrongReferences();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ReleasableReferenceManager _flddelegate>
	//    2    4:invokeinterface #40  <Method void ReleasableReferenceManager.releaseStrongReferences()>
	//    3    9:return          
	}

	public void restoreStrongReferences()
	{
		_flddelegate.restoreStrongReferences();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ReleasableReferenceManager _flddelegate>
	//    2    4:invokeinterface #43  <Method void ReleasableReferenceManager.restoreStrongReferences()>
	//    3    9:return          
	}

	public Class scope()
	{
		return _flddelegate.scope();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ReleasableReferenceManager _flddelegate>
	//    2    4:invokeinterface #47  <Method Class ReleasableReferenceManager.scope()>
	//    3    9:areturn         
	}

	private final ReleasableReferenceManager _flddelegate;
	private final Annotation metadata;
}
