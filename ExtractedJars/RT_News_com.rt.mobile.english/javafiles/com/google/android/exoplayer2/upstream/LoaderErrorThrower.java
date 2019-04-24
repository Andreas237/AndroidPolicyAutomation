// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import java.io.IOException;

public interface LoaderErrorThrower
{
	public static final class Dummy
		implements LoaderErrorThrower
	{

		public void maybeThrowError()
			throws IOException
		{
		//    0    0:return          
		}

		public void maybeThrowError(int i)
			throws IOException
		{
		//    0    0:return          
		}

		public Dummy()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public abstract void maybeThrowError()
		throws IOException;

	public abstract void maybeThrowError(int i)
		throws IOException;
}
