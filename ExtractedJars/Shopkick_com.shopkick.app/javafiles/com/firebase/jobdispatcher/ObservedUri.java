// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.net.Uri;
import java.lang.annotation.Annotation;

public final class ObservedUri
{
	public static interface Flags
		extends Annotation
	{

		public static final int FLAG_NOTIFY_FOR_DESCENDANTS = 1;
	}


	public ObservedUri(Uri uri1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		if(uri1 != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          19
		{
			uri = uri1;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #19  <Field Uri uri>
			flags = i;
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:putfield        #21  <Field int flags>
			return;
	//   10   18:return          
		} else
		{
			throw new IllegalArgumentException("URI must not be null.");
	//   11   19:new             #23  <Class IllegalArgumentException>
	//   12   22:dup             
	//   13   23:ldc1            #25  <String "URI must not be null.">
	//   14   25:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   15   28:athrow          
		}
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof ObservedUri))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ObservedUri>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((ObservedUri)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ObservedUri>
	//   12   20:astore_1        
		return flags == ((ObservedUri) (obj)).flags && uri.equals(((Object) (((ObservedUri) (obj)).uri)));
	//   13   21:aload_0         
	//   14   22:getfield        #21  <Field int flags>
	//   15   25:aload_1         
	//   16   26:getfield        #21  <Field int flags>
	//   17   29:icmpne          48
	//   18   32:aload_0         
	//   19   33:getfield        #19  <Field Uri uri>
	//   20   36:aload_1         
	//   21   37:getfield        #19  <Field Uri uri>
	//   22   40:invokevirtual   #36  <Method boolean Uri.equals(Object)>
	//   23   43:ifeq            48
	//   24   46:iconst_1        
	//   25   47:ireturn         
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	public int getFlags()
	{
		return flags;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int flags>
	//    2    4:ireturn         
	}

	public Uri getUri()
	{
		return uri;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Uri uri>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return uri.hashCode() ^ flags;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Uri uri>
	//    2    4:invokevirtual   #43  <Method int Uri.hashCode()>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field int flags>
	//    5   11:ixor            
	//    6   12:ireturn         
	}

	private final int flags;
	private final Uri uri;
}
