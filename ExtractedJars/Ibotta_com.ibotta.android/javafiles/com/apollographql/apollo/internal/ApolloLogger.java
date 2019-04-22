// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal;

import com.apollographql.apollo.Logger;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.api.internal.Utils;

public final class ApolloLogger
{

	public ApolloLogger(Optional optional)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		logger = (Optional)Utils.checkNotNull(((Object) (optional)), "logger == null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #15  <String "logger == null">
	//    5    8:invokestatic    #21  <Method Object Utils.checkNotNull(Object, Object)>
	//    6   11:checkcast       #23  <Class Optional>
	//    7   14:putfield        #25  <Field Optional logger>
	//    8   17:return          
	}

	private transient void log(int i, String s, Throwable throwable, Object aobj[])
	{
		if(logger.isPresent())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Optional logger>
	//*   2    4:invokevirtual   #36  <Method boolean Optional.isPresent()>
	//*   3    7:ifeq            33
			((Logger)logger.get()).log(i, s, Optional.fromNullable(((Object) (throwable))), aobj);
	//    4   10:aload_0         
	//    5   11:getfield        #25  <Field Optional logger>
	//    6   14:invokevirtual   #40  <Method Object Optional.get()>
	//    7   17:checkcast       #42  <Class Logger>
	//    8   20:iload_1         
	//    9   21:aload_2         
	//   10   22:aload_3         
	//   11   23:invokestatic    #46  <Method Optional Optional.fromNullable(Object)>
	//   12   26:aload           4
	//   13   28:invokeinterface #49  <Method void Logger.log(int, String, Optional, Object[])>
	//   14   33:return          
	}

	public transient void d(String s, Object aobj[])
	{
		log(3, s, ((Throwable) (null)), aobj);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_1         
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:invokespecial   #53  <Method void log(int, String, Throwable, Object[])>
	//    6    8:return          
	}

	public transient void d(Throwable throwable, String s, Object aobj[])
	{
		log(3, s, throwable, aobj);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:aload_3         
	//    5    5:invokespecial   #53  <Method void log(int, String, Throwable, Object[])>
	//    6    8:return          
	}

	public transient void e(String s, Object aobj[])
	{
		log(6, s, ((Throwable) (null)), aobj);
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_1         
	//    3    4:aconst_null     
	//    4    5:aload_2         
	//    5    6:invokespecial   #53  <Method void log(int, String, Throwable, Object[])>
	//    6    9:return          
	}

	public transient void e(Throwable throwable, String s, Object aobj[])
	{
		log(6, s, throwable, aobj);
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_2         
	//    3    4:aload_1         
	//    4    5:aload_3         
	//    5    6:invokespecial   #53  <Method void log(int, String, Throwable, Object[])>
	//    6    9:return          
	}

	public transient void w(Throwable throwable, String s, Object aobj[])
	{
		log(5, s, throwable, aobj);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:aload_3         
	//    5    5:invokespecial   #53  <Method void log(int, String, Throwable, Object[])>
	//    6    8:return          
	}

	private final Optional logger;
}
