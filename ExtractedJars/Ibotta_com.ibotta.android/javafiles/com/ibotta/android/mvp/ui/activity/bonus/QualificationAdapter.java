// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.bonus;

import android.content.Context;
import android.content.res.Resources;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;
import com.ibotta.api.model.QualificationModel;
import java.util.List;

public class QualificationAdapter extends android.support.v7.widget.RecyclerView.Adapter
{
	class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
	{

		protected ImageView ivCompleted;
		final QualificationAdapter this$0;
		protected TextView tvQualification;

		public ViewHolder(View view)
		{
			this$0 = QualificationAdapter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field QualificationAdapter this$0>
			super(view);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #20  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
			ivCompleted = (ImageView)view.findViewById(0x7f09029f);
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:ldc1            #21  <Int 0x7f09029f>
		//    9   14:invokevirtual   #27  <Method View View.findViewById(int)>
		//   10   17:checkcast       #29  <Class ImageView>
		//   11   20:putfield        #31  <Field ImageView ivCompleted>
			tvQualification = (TextView)view.findViewById(0x7f090560);
		//   12   23:aload_0         
		//   13   24:aload_2         
		//   14   25:ldc1            #32  <Int 0x7f090560>
		//   15   27:invokevirtual   #27  <Method View View.findViewById(int)>
		//   16   30:checkcast       #34  <Class TextView>
		//   17   33:putfield        #36  <Field TextView tvQualification>
		//   18   36:return          
		}
	}


	public QualificationAdapter(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void android.support.v7.widget.RecyclerView$Adapter()>
		qualifications = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field List qualifications>
	//    5    9:return          
	}

	public int getItemCount()
	{
		List list = qualifications;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field List qualifications>
	//    2    4:astore_1        
		if(list == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return list.size();
	//    7   11:aload_1         
	//    8   12:invokeinterface #28  <Method int List.size()>
	//    9   17:ireturn         
	}

	public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		onBindViewHolder((ViewHolder)viewholder, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class QualificationAdapter$ViewHolder>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #33  <Method void onBindViewHolder(QualificationAdapter$ViewHolder, int)>
	//    5    9:return          
	}

	public void onBindViewHolder(ViewHolder viewholder, int i)
	{
		QualificationModel qualificationmodel = (QualificationModel)qualifications.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field List qualifications>
	//    2    4:iload_2         
	//    3    5:invokeinterface #37  <Method Object List.get(int)>
	//    4   10:checkcast       #39  <Class QualificationModel>
	//    5   13:astore          4
		viewholder.tvQualification.setText(((CharSequence) (qualificationmodel.getProgressDescription())));
	//    6   15:aload_1         
	//    7   16:getfield        #43  <Field TextView QualificationAdapter$ViewHolder.tvQualification>
	//    8   19:aload           4
	//    9   21:invokeinterface #47  <Method String QualificationModel.getProgressDescription()>
	//   10   26:invokevirtual   #53  <Method void TextView.setText(CharSequence)>
		android.graphics.drawable.Drawable drawable = viewholder.itemView.getContext().getResources().getDrawable(0x7f08024f);
	//   11   29:aload_1         
	//   12   30:getfield        #57  <Field View QualificationAdapter$ViewHolder.itemView>
	//   13   33:invokevirtual   #63  <Method Context View.getContext()>
	//   14   36:invokevirtual   #69  <Method Resources Context.getResources()>
	//   15   39:ldc1            #70  <Int 0x7f08024f>
	//   16   41:invokevirtual   #76  <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   17   44:astore_3        
		if(!qualificationmodel.getCompleted())
	//*  18   45:aload           4
	//*  19   47:invokeinterface #80  <Method boolean QualificationModel.getCompleted()>
	//*  20   52:ifne            71
			drawable = viewholder.itemView.getContext().getResources().getDrawable(0x7f080251);
	//   21   55:aload_1         
	//   22   56:getfield        #57  <Field View QualificationAdapter$ViewHolder.itemView>
	//   23   59:invokevirtual   #63  <Method Context View.getContext()>
	//   24   62:invokevirtual   #69  <Method Resources Context.getResources()>
	//   25   65:ldc1            #81  <Int 0x7f080251>
	//   26   67:invokevirtual   #76  <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   27   70:astore_3        
		viewholder.ivCompleted.setImageDrawable(drawable);
	//   28   71:aload_1         
	//   29   72:getfield        #85  <Field ImageView QualificationAdapter$ViewHolder.ivCompleted>
	//   30   75:aload_3         
	//   31   76:invokevirtual   #91  <Method void ImageView.setImageDrawable(android.graphics.drawable.Drawable)>
	//   32   79:return          
	}

	public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return ((android.support.v7.widget.RecyclerView.ViewHolder) (onCreateViewHolder(viewgroup, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #96  <Method QualificationAdapter$ViewHolder onCreateViewHolder(ViewGroup, int)>
	//    4    6:areturn         
	}

	public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return new ViewHolder(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0c01a4, ((ViewGroup) (null))));
	//    0    0:new             #7   <Class QualificationAdapter$ViewHolder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #99  <Method Context ViewGroup.getContext()>
	//    5    9:invokestatic    #105 <Method LayoutInflater LayoutInflater.from(Context)>
	//    6   12:ldc1            #106 <Int 0x7f0c01a4>
	//    7   14:aconst_null     
	//    8   15:invokevirtual   #110 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//    9   18:invokespecial   #113 <Method void QualificationAdapter$ViewHolder(QualificationAdapter, View)>
	//   10   21:areturn         
	}

	private final List qualifications;
}
