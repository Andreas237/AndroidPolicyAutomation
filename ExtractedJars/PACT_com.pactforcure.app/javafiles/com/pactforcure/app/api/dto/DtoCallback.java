// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.dto;


// Referenced classes of package com.pactforcure.app.api.dto:
//			CodeDescriptionError

public interface DtoCallback
{

	public abstract void onError(CodeDescriptionError codedescriptionerror);

	public abstract void onSuccess(Object obj);
}
