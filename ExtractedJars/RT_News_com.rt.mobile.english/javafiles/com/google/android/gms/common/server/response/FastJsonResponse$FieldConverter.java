// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;


// Referenced classes of package com.google.android.gms.common.server.response:
//			FastJsonResponse

public static interface FastJsonResponse$FieldConverter
{

	public abstract Object convert(Object obj);

	public abstract Object convertBack(Object obj);

	public abstract int getTypeIn();

	public abstract int getTypeOut();
}
