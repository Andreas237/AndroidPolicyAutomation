.class public Lo/eon;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eok;>;"
        }
    .end annotation
.end field

.field private d:Landroid/view/LayoutInflater;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/eok;>;)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 29
    iput-object p2, p0, Lo/eon;->a:Ljava/util/List;

    .line 30
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/eon;->d:Landroid/view/LayoutInflater;

    .line 31
    iput-object p1, p0, Lo/eon;->e:Landroid/content/Context;

    .line 32
    return-void
.end method

.method private a(Landroid/view/View;Lo/eok;I)V
    .locals 7

    .line 117
    sget v0, Lcom/huawei/ui/device/R$id;->select_device_content:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 118
    sget v0, Lcom/huawei/ui/device/R$id;->select_device_summary:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 119
    sget v0, Lcom/huawei/ui/device/R$id;->select_device_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 120
    sget v0, Lcom/huawei/ui/device/R$id;->select_device_summary_line:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 122
    sget v0, Lcom/huawei/ui/device/R$id;->rightarrow_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 123
    iget-object v0, p0, Lo/eon;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    sget v0, Lcom/huawei/ui/device/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 126
    :cond_0
    iget-object v0, p0, Lo/eon;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$mipmap;->btn_list_rightarrow:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 129
    :goto_0
    iget-object v0, p0, Lo/eon;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lo/eon;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p3, v0, :cond_1

    .line 130
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 132
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 135
    :goto_1
    invoke-virtual {p2}, Lo/eok;->f()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 136
    invoke-virtual {p2}, Lo/eok;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 139
    :cond_2
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 141
    :goto_2
    invoke-virtual {p2}, Lo/eok;->k()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 142
    invoke-virtual {p2}, Lo/eok;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 145
    :cond_3
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 148
    :goto_3
    invoke-virtual {p2}, Lo/eok;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 149
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 150
    invoke-virtual {p2}, Lo/eok;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 151
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_4

    .line 153
    :cond_4
    invoke-virtual {p2}, Lo/eok;->g()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_5

    .line 154
    invoke-virtual {p2}, Lo/eok;->g()I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 155
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 156
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_4

    .line 158
    :cond_5
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 161
    :goto_4
    invoke-virtual {p2}, Lo/eok;->h()Landroid/view/View$OnClickListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 162
    invoke-virtual {p2}, Lo/eok;->h()Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 164
    :cond_6
    return-void
.end method

.method private b(Landroid/view/View;Lo/eok;I)V
    .locals 3

    .line 93
    sget v0, Lcom/huawei/ui/device/R$id;->tv_manu_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/TextView;

    .line 94
    sget v0, Lcom/huawei/ui/device/R$id;->v_manu_line:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 95
    invoke-virtual {p2}, Lo/eok;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    invoke-virtual {p2}, Lo/eok;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 99
    :cond_0
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 101
    :goto_0
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 36
    iget-object v0, p0, Lo/eon;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/eon;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 46
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 112
    iget-object v0, p0, Lo/eon;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eok;

    invoke-virtual {v0}, Lo/eok;->d()I

    move-result v0

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 53
    :try_start_0
    iget-object v0, p0, Lo/eon;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/eok;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    goto :goto_0

    .line 54
    :catch_0
    move-exception v4

    .line 55
    const/4 v0, 0x0

    return-object v0

    .line 57
    :goto_0
    invoke-virtual {p0, p1}, Lo/eon;->getItemViewType(I)I

    move-result v4

    .line 59
    packed-switch v4, :pswitch_data_0

    goto :goto_1

    .line 62
    :pswitch_0
    if-nez p2, :cond_0

    .line 63
    iget-object v0, p0, Lo/eon;->d:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_select_device_list_item_manu:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 65
    :cond_0
    invoke-direct {p0, p2, v3, p1}, Lo/eon;->b(Landroid/view/View;Lo/eok;I)V

    .line 66
    goto :goto_2

    .line 68
    :pswitch_1
    if-nez p2, :cond_1

    .line 69
    iget-object v0, p0, Lo/eon;->d:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_select_device_list_item_info:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 71
    :cond_1
    invoke-direct {p0, p2, v3, p1}, Lo/eon;->a(Landroid/view/View;Lo/eok;I)V

    .line 72
    goto :goto_2

    .line 74
    :pswitch_2
    if-nez p2, :cond_2

    .line 75
    iget-object v0, p0, Lo/eon;->d:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_select_device_list_item_more:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 77
    :cond_2
    invoke-virtual {v3}, Lo/eok;->h()Landroid/view/View$OnClickListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 78
    invoke-virtual {v3}, Lo/eok;->h()Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    .line 82
    :goto_1
    if-nez p2, :cond_3

    .line 83
    iget-object v0, p0, Lo/eon;->d:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_select_device_list_item_info:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 85
    :cond_3
    invoke-direct {p0, p2, v3, p1}, Lo/eon;->a(Landroid/view/View;Lo/eok;I)V

    .line 89
    :cond_4
    :goto_2
    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 106
    const/4 v0, 0x3

    return v0
.end method
