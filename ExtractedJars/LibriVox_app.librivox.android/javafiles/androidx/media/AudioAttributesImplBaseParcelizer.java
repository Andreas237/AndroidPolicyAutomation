// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.media;

import android.support.v4.media.c;
import androidx.versionedparcelable.b;

public final class AudioAttributesImplBaseParcelizer
{

	public AudioAttributesImplBaseParcelizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static c read(b b1)
	{
		c c1 = new c();
	//    0    0:new             #13  <Class c>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void c()>
	//    3    7:astore_1        
		c1.mUsage = b1.b(c1.mUsage, 1);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #18  <Field int c.mUsage>
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #24  <Method int b.b(int, int)>
	//   10   18:putfield        #18  <Field int c.mUsage>
		c1.mContentType = b1.b(c1.mContentType, 2);
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #27  <Field int c.mContentType>
	//   15   27:iconst_2        
	//   16   28:invokevirtual   #24  <Method int b.b(int, int)>
	//   17   31:putfield        #27  <Field int c.mContentType>
		c1.mFlags = b1.b(c1.mFlags, 3);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:getfield        #30  <Field int c.mFlags>
	//   22   40:iconst_3        
	//   23   41:invokevirtual   #24  <Method int b.b(int, int)>
	//   24   44:putfield        #30  <Field int c.mFlags>
		c1.mLegacyStream = b1.b(c1.mLegacyStream, 4);
	//   25   47:aload_1         
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:getfield        #33  <Field int c.mLegacyStream>
	//   29   53:iconst_4        
	//   30   54:invokevirtual   #24  <Method int b.b(int, int)>
	//   31   57:putfield        #33  <Field int c.mLegacyStream>
		return c1;
	//   32   60:aload_1         
	//   33   61:areturn         
	}

	public static void write(c c1, b b1)
	{
		b1.a(false, false);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #39  <Method void b.a(boolean, boolean)>
		b1.a(c1.mUsage, 1);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #18  <Field int c.mUsage>
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #42  <Method void b.a(int, int)>
		b1.a(c1.mContentType, 2);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #27  <Field int c.mContentType>
	//   12   20:iconst_2        
	//   13   21:invokevirtual   #42  <Method void b.a(int, int)>
		b1.a(c1.mFlags, 3);
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:getfield        #30  <Field int c.mFlags>
	//   17   29:iconst_3        
	//   18   30:invokevirtual   #42  <Method void b.a(int, int)>
		b1.a(c1.mLegacyStream, 4);
	//   19   33:aload_1         
	//   20   34:aload_0         
	//   21   35:getfield        #33  <Field int c.mLegacyStream>
	//   22   38:iconst_4        
	//   23   39:invokevirtual   #42  <Method void b.a(int, int)>
	//   24   42:return          
	}
}
