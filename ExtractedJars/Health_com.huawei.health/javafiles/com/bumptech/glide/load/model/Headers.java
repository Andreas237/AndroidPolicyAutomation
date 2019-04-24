// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import java.util.Collections;
import java.util.Map;

public interface Headers
{

	public abstract Map getHeaders();

	public static final Headers DEFAULT = (new LazyHeaders.Builder()).build();
	public static final Headers NONE = new Headers() {

		public Map getHeaders()
		{
			return Collections.emptyMap();
		//    0    0:invokestatic    #18  <Method Map Collections.emptyMap()>
		//    1    3:areturn         
		}

	}
;

	/* static  */
	/* { */
	//    0    0:new             #6   <Class Headers$1>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void Headers$1()>
	//    3    7:putstatic       #17  <Field Headers NONE>
	//    4   10:new             #19  <Class LazyHeaders$Builder>
	//    5   13:dup             
	//    6   14:invokespecial   #20  <Method void LazyHeaders$Builder()>
	//    7   17:invokevirtual   #24  <Method LazyHeaders LazyHeaders$Builder.build()>
	//    8   20:putstatic       #26  <Field Headers DEFAULT>
	//*   9   23:return          
	/* } */
}
