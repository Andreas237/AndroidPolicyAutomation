// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.file;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.ext.file:
//			FilePickerActivity

public class FilePickerActivity$c$a extends android.support.v7.widget.
{

	static TextView a(FilePickerActivity$c$a filepickeractivity$c$a)
	{
		return filepickeractivity$c$a.c;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field TextView c>
	//    2    4:areturn         
	}

	static ImageView b(FilePickerActivity$c$a filepickeractivity$c$a)
	{
		return filepickeractivity$c$a.b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ImageView b>
	//    2    4:areturn         
	}

	final FilePickerActivity.c a;
	private ImageView b;
	private TextView c;

	public FilePickerActivity$c$a(FilePickerActivity.c c1, View view)
	{
		a = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field FilePickerActivity$c a>
		super(view);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #21  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
		b = (ImageView)view.findViewById(0x7f090054);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:ldc1            #22  <Int 0x7f090054>
	//    9   14:invokevirtual   #28  <Method View View.findViewById(int)>
	//   10   17:checkcast       #30  <Class ImageView>
	//   11   20:putfield        #32  <Field ImageView b>
		c = (TextView)view.findViewById(0x7f090055);
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:ldc1            #33  <Int 0x7f090055>
	//   15   27:invokevirtual   #28  <Method View View.findViewById(int)>
	//   16   30:checkcast       #35  <Class TextView>
	//   17   33:putfield        #37  <Field TextView c>
	//   18   36:return          
	}
}
