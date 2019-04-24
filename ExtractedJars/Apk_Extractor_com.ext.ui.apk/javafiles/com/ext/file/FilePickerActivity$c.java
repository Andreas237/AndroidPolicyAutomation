// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.file;

import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.List;

// Referenced classes of package com.ext.file:
//			FilePickerActivity

private class FilePickerActivity$c extends android.support.v7.widget.RecyclerView$Adapter
{
	public class a extends android.support.v7.widget.RecyclerView.ViewHolder
	{

		static TextView a(a a1)
		{
			return a1.c;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field TextView c>
		//    2    4:areturn         
		}

		static ImageView b(a a1)
		{
			return a1.b;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field ImageView b>
		//    2    4:areturn         
		}

		final FilePickerActivity.c a;
		private ImageView b;
		private TextView c;

		public a(View view)
		{
			a = FilePickerActivity.c.this;
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


	static android.support.v7.bv.b a(FilePickerActivity$c filepickeractivity$c)
	{
		return filepickeractivity$c.c;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field android.support.v7.bv$b c>
	//    2    4:areturn         
	}

	public a a(ViewGroup viewgroup, int i)
	{
		viewgroup = ((ViewGroup) (((LayoutInflater)a.getSystemService("layout_inflater")).inflate(0x7f0b002b, viewgroup, false)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field FilePickerActivity a>
	//    2    4:ldc1            #36  <String "layout_inflater">
	//    3    6:invokevirtual   #40  <Method Object FilePickerActivity.getSystemService(String)>
	//    4    9:checkcast       #42  <Class LayoutInflater>
	//    5   12:ldc1            #43  <Int 0x7f0b002b>
	//    6   14:aload_1         
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #47  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    9   19:astore_1        
		a a1 = new a(((View) (viewgroup)));
	//   10   20:new             #12  <Class FilePickerActivity$c$a>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokespecial   #50  <Method void FilePickerActivity$c$a(FilePickerActivity$c, View)>
	//   15   29:astore_3        
		((View) (viewgroup)).setOnClickListener(new android.view.View.OnClickListener(((View) (viewgroup))) {

			public void onClick(View view)
			{
				FilePickerActivity.c.a(b).onAdapterViewClick(a);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field FilePickerActivity$c b>
			//    2    4:invokestatic    #32  <Method android.support.v7.bv$b FilePickerActivity$c.a(FilePickerActivity$c)>
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field View a>
			//    5   11:invokeinterface #37  <Method void android.support.v7.bv$b.onAdapterViewClick(View)>
			//    6   16:return          
			}

			final View a;
			final FilePickerActivity.c b;

			
			{
				b = FilePickerActivity.c.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field FilePickerActivity$c b>
				a = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field View a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   16   30:aload_1         
	//   17   31:new             #10  <Class FilePickerActivity$c$1>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokespecial   #51  <Method void FilePickerActivity$c$1(FilePickerActivity$c, View)>
	//   22   40:invokevirtual   #57  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		return a1;
	//   23   43:aload_3         
	//   24   44:areturn         
	}

	public void a(a a1, int i)
	{
		c = ((android.support.v7.bv.b) (a));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field FilePickerActivity a>
	//    3    5:putfield        #33  <Field android.support.v7.bv$b c>
		File file = (File)b.get(i);
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field List b>
	//    6   12:iload_2         
	//    7   13:invokeinterface #64  <Method Object List.get(int)>
	//    8   18:checkcast       #66  <Class File>
	//    9   21:astore_3        
		a.a(a1).setText(((CharSequence) (file.getName())));
	//   10   22:aload_1         
	//   11   23:invokestatic    #69  <Method TextView FilePickerActivity$c$a.a(FilePickerActivity$c$a)>
	//   12   26:aload_3         
	//   13   27:invokevirtual   #73  <Method String File.getName()>
	//   14   30:invokevirtual   #79  <Method void TextView.setText(CharSequence)>
		if(file.isFile())
	//*  15   33:aload_3         
	//*  16   34:invokevirtual   #83  <Method boolean File.isFile()>
	//*  17   37:ifeq            50
		{
			a.b(a1).setImageResource(0x7f080061);
	//   18   40:aload_1         
	//   19   41:invokestatic    #86  <Method ImageView FilePickerActivity$c$a.b(FilePickerActivity$c$a)>
	//   20   44:ldc1            #87  <Int 0x7f080061>
	//   21   46:invokevirtual   #93  <Method void ImageView.setImageResource(int)>
			return;
	//   22   49:return          
		} else
		{
			a.b(a1).setImageResource(0x7f080062);
	//   23   50:aload_1         
	//   24   51:invokestatic    #86  <Method ImageView FilePickerActivity$c$a.b(FilePickerActivity$c$a)>
	//   25   54:ldc1            #94  <Int 0x7f080062>
	//   26   56:invokevirtual   #93  <Method void ImageView.setImageResource(int)>
			return;
	//   27   59:return          
		}
	}

	public int getItemCount()
	{
		return b.size();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List b>
	//    2    4:invokeinterface #99  <Method int List.size()>
	//    3    9:ireturn         
	}

	public void onBindViewHolder(android.support.v7.widget.er er, int i)
	{
		a((a)er, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #12  <Class FilePickerActivity$c$a>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #103 <Method void a(FilePickerActivity$c$a, int)>
	//    5    9:return          
	}

	public android.support.v7.widget.er onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return ((android.support.v7.widget.er) (a(viewgroup, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #107 <Method FilePickerActivity$c$a a(ViewGroup, int)>
	//    4    6:areturn         
	}

	final FilePickerActivity a;
	private List b;
	private android.support.v7.bv.b c;

	public FilePickerActivity$c(FilePickerActivity filepickeractivity, List list)
	{
		a = filepickeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field FilePickerActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void android.support.v7.widget.RecyclerView$Adapter()>
		b = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field List b>
	//    8   14:return          
	}
}
