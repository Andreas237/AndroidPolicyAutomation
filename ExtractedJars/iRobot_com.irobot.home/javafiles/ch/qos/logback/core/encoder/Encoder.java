// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.encoder;

import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import java.io.OutputStream;

public interface Encoder
	extends ContextAware, LifeCycle
{

	public abstract void close();

	public abstract void doEncode(Object obj);

	public abstract void init(OutputStream outputstream);
}
