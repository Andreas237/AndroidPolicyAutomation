// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.provider;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

public final class ImageHeaderParserRegistry
{

	public ImageHeaderParserRegistry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void ArrayList()>
	//    6   12:putfield        #16  <Field List parsers>
	//    7   15:return          
	}

	public void add(ImageHeaderParser imageheaderparser)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		parsers.add(((Object) (imageheaderparser)));
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field List parsers>
	//    4    6:aload_1         
	//    5    7:invokeinterface #25  <Method boolean List.add(Object)>
	//    6   12:pop             
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
		imageheaderparser;
	//   10   16:astore_1        
	//*  11   17:aload_0         
		throw imageheaderparser;
	//   12   18:monitorexit     
	//   13   19:aload_1         
	//   14   20:athrow          
	}

	public List getParsers()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		List list = parsers;
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field List parsers>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return list;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	private final List parsers = new ArrayList();
}
