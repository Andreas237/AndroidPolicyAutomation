.class public Lo/agt;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation
.end field

.field private d:Landroid/content/Context;

.field private e:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lo/afj;>;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 32
    iput-object p1, p0, Lo/agt;->d:Landroid/content/Context;

    .line 33
    iput-object p2, p0, Lo/agt;->c:Ljava/util/ArrayList;

    .line 34
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/agt;->e:Landroid/view/LayoutInflater;

    .line 35
    return-void
.end method

.method private b(Landroid/view/View;Lo/afj;I)V
    .locals 12

    .line 97
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_device_content:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 98
    sget v0, Lcom/huawei/plugindevice/R$id;->arrow_right_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 99
    sget v0, Lcom/huawei/plugindevice/R$id;->iv_device_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 100
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_device_summary:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 101
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_show_main_layout_sport_bottom_image_interval:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 102
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lo/agt;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 105
    :cond_0
    iget-object v0, p0, Lo/agt;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->btn_list_rightarrow:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 107
    :goto_0
    invoke-virtual {v7}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/RelativeLayout$LayoutParams;

    .line 108
    sget v0, Lcom/huawei/plugindevice/R$id;->device_detail_layout:I

    const/16 v1, 0x12

    invoke-virtual {v8, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 109
    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 110
    invoke-virtual {v5}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/RelativeLayout$LayoutParams;

    .line 111
    iget-object v0, p0, Lo/agt;->d:Landroid/content/Context;

    const/high16 v1, 0x42880000    # 68.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v10

    .line 112
    iput v10, v9, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 113
    iput v10, v9, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 114
    invoke-virtual {v5, v9}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 115
    iget-object v0, p0, Lo/agt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/afj;

    .line 116
    invoke-direct {p0, v3, v11}, Lo/agt;->d(Landroid/widget/TextView;Lo/afj;)V

    .line 117
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p2, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lo/afj;->n()Lo/afj$a;

    move-result-object v2

    iget-object v2, v2, Lo/afj$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 118
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 119
    iget-object v0, p2, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    iget-object v0, p0, Lo/agt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p3, v0, :cond_1

    .line 122
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 124
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 127
    :goto_1
    invoke-virtual {p2}, Lo/afj;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 128
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 130
    :cond_2
    return-void
.end method

.method private c(Landroid/view/View;Lo/afj;)V
    .locals 3

    .line 86
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_header_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/TextView;

    .line 87
    sget v0, Lcom/huawei/plugindevice/R$id;->view_header_line:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 88
    invoke-virtual {p2}, Lo/afj;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    invoke-virtual {p2}, Lo/afj;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 92
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 94
    :goto_0
    return-void
.end method

.method private d(Landroid/widget/TextView;Lo/afj;)V
    .locals 2

    .line 133
    const-string v0, "9323f6b7-b459-44f4-a698-988d1769832a"

    iget-object v1, p2, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 134
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->l(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 135
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 136
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 137
    :cond_0
    iget-object v0, p2, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 140
    :cond_1
    const-string v0, "HUAWEI FIT"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 143
    :cond_2
    iget-object v0, p2, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    :goto_0
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 39
    iget-object v0, p0, Lo/agt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/agt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 49
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 82
    iget-object v0, p0, Lo/agt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afj;

    invoke-virtual {v0}, Lo/afj;->e()I

    move-result v0

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 56
    :try_start_0
    iget-object v0, p0, Lo/agt;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/afj;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    goto :goto_0

    .line 57
    :catch_0
    move-exception v4

    .line 58
    const/4 v0, 0x0

    return-object v0

    .line 60
    :goto_0
    invoke-virtual {p0, p1}, Lo/agt;->getItemViewType(I)I

    move-result v4

    .line 61
    const/4 v0, 0x1

    if-ne v0, v4, :cond_1

    .line 62
    if-nez p2, :cond_0

    .line 63
    iget-object v0, p0, Lo/agt;->e:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/plugindevice/R$layout;->my_device_bind_list_header:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 65
    :cond_0
    invoke-direct {p0, p2, v3}, Lo/agt;->c(Landroid/view/View;Lo/afj;)V

    goto :goto_1

    .line 67
    :cond_1
    if-nez p2, :cond_2

    .line 68
    iget-object v0, p0, Lo/agt;->e:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/plugindevice/R$layout;->my_device_bind_list_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 70
    :cond_2
    invoke-direct {p0, p2, v3, p1}, Lo/agt;->b(Landroid/view/View;Lo/afj;I)V

    .line 72
    :goto_1
    return-object p2
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 77
    const/4 v0, 0x2

    return v0
.end method
