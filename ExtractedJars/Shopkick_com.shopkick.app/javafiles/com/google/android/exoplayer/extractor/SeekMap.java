// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;


public interface SeekMap
{

	public abstract long getPosition(long l);

	public abstract boolean isSeekable();

	public static final SeekMap UNSEEKABLE = new SeekMap() {

		public long getPosition(long l)
		{
			return 0L;
		//    0    0:lconst_0        
		//    1    1:lreturn         
		}

		public boolean isSeekable()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

	}
;

	/* static  */
	/* { */
	//    0    0:new             #6   <Class SeekMap$1>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void SeekMap$1()>
	//    3    7:putstatic       #15  <Field SeekMap UNSEEKABLE>
	//*   4   10:return          
	/* } */
}
