// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.tubesock;


// Referenced classes of package com.firebase.tubesock:
//			MessageBuilderFactory, WebSocketMessage

static interface MessageBuilderFactory$Builder
{

	public abstract boolean appendBytes(byte abyte0[]);

	public abstract WebSocketMessage toMessage();
}
