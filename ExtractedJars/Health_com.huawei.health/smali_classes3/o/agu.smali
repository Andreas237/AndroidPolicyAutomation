.class public Lo/agu;
.super Lo/agv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/agu$d;
    }
.end annotation


# instance fields
.field private c:Landroid/content/Context;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afa;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lo/afj;>;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Lo/agv;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    .line 27
    iput-object p1, p0, Lo/agu;->c:Landroid/content/Context;

    .line 28
    invoke-static {p2}, Lo/aex;->d(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    .line 29
    iget-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    invoke-super {p0, v0}, Lo/agv;->getProductList(Ljava/util/ArrayList;)V

    .line 30
    return-void
.end method

.method private a(Landroid/widget/TextView;Lo/afj;)V
    .locals 2

    .line 136
    iget-object v0, p2, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    return-void
.end method

.method private a(Lo/afj;)Z
    .locals 6

    .line 69
    const/4 v2, 0x0

    .line 71
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 72
    iget-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/afa;

    .line 73
    invoke-virtual {v4}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 74
    invoke-virtual {v4}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/afj;

    .line 75
    iget-object v0, v5, Lo/afj;->b:Ljava/lang/String;

    iget-object v1, p1, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    const/4 v2, 0x1

    .line 77
    return v2

    .line 71
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 81
    :cond_1
    return v2
.end method

.method private d(Lo/afj;)V
    .locals 3

    .line 48
    invoke-direct {p0, p1}, Lo/agu;->e(Lo/afj;)I

    move-result v2

    .line 49
    const/4 v0, -0x1

    if-eq v0, v2, :cond_0

    .line 50
    iget-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    invoke-static {p1}, Lo/aex;->e(Lo/afj;)Lo/afa;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 51
    iget-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lo/agu;->getProductList(Ljava/util/ArrayList;)V

    .line 53
    :cond_0
    return-void
.end method

.method private e(Lo/afj;)I
    .locals 5

    .line 56
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 57
    iget-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/afa;

    .line 59
    invoke-virtual {v3}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 60
    invoke-virtual {v3}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/afj;

    .line 61
    iget-object v0, v4, Lo/afj;->b:Ljava/lang/String;

    iget-object v1, p1, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    return v2

    .line 56
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 66
    :cond_1
    const/4 v0, -0x1

    return v0
.end method


# virtual methods
.method public b(Lo/afj;)V
    .locals 2

    .line 38
    invoke-direct {p0, p1}, Lo/agu;->a(Lo/afj;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    iget-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    invoke-static {p1}, Lo/aex;->e(Lo/afj;)Lo/afa;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    iget-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lo/agu;->getProductList(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 42
    :cond_0
    invoke-direct {p0, p1}, Lo/agu;->d(Lo/afj;)V

    .line 45
    :goto_0
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 34
    iget-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getProductList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afa;>;)V"
        }
    .end annotation

    .line 86
    invoke-super {p0, p1}, Lo/agv;->getProductList(Ljava/util/ArrayList;)V

    .line 87
    return-void
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .line 91
    const/4 v4, 0x0

    .line 92
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 93
    new-instance v4, Lo/agu$d;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/agu$d;-><init>(Lo/agu$5;)V

    .line 94
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$layout;->my_device_bind_list_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 95
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_device_content:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lo/agu$d;->a:Landroid/widget/TextView;

    .line 96
    sget v0, Lcom/huawei/plugindevice/R$id;->arrow_right_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lo/agu$d;->c:Landroid/widget/ImageView;

    .line 97
    sget v0, Lcom/huawei/plugindevice/R$id;->iv_device_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lo/agu$d;->e:Landroid/widget/ImageView;

    .line 98
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_device_summary:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lo/agu$d;->b:Landroid/widget/TextView;

    .line 99
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_show_main_layout_sport_bottom_image_interval:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lo/agu$d;->d:Landroid/widget/ImageView;

    .line 100
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 102
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/agu$d;

    .line 104
    :goto_0
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 105
    iget-object v0, v4, Lo/agu$d;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/agu;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 107
    :cond_1
    iget-object v0, v4, Lo/agu$d;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/agu;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$mipmap;->btn_list_rightarrow:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 109
    :goto_1
    iget-object v0, v4, Lo/agu$d;->d:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 110
    sget v0, Lcom/huawei/plugindevice/R$id;->device_detail_layout:I

    const/16 v1, 0x12

    invoke-virtual {v5, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 111
    iget-object v0, v4, Lo/agu$d;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 112
    iget-object v0, v4, Lo/agu$d;->e:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RelativeLayout$LayoutParams;

    .line 113
    iget-object v0, p0, Lo/agu;->c:Landroid/content/Context;

    const/high16 v1, 0x42880000    # 68.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v7

    .line 114
    iput v7, v6, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 115
    iput v7, v6, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 116
    iget-object v0, v4, Lo/agu$d;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    iget-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/afa;

    .line 118
    invoke-virtual {v8}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 119
    invoke-virtual {v8}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/afj;

    .line 120
    iget-object v0, v4, Lo/agu$d;->a:Landroid/widget/TextView;

    invoke-direct {p0, v0, v9}, Lo/agu;->a(Landroid/widget/TextView;Lo/afj;)V

    .line 121
    iget-object v0, v4, Lo/agu$d;->e:Landroid/widget/ImageView;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v1

    iget-object v2, v9, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {v9}, Lo/afj;->n()Lo/afj$a;

    move-result-object v3

    iget-object v3, v3, Lo/afj$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 122
    iget-object v0, v4, Lo/agu$d;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 123
    iget-object v0, v4, Lo/agu$d;->b:Landroid/widget/TextView;

    iget-object v1, v9, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {v9}, Lo/afj;->n()Lo/afj$a;

    move-result-object v2

    iget-object v2, v2, Lo/afj$a;->e:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    :cond_2
    iget-object v0, p0, Lo/agu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_3

    .line 127
    iget-object v0, v4, Lo/agu$d;->d:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 129
    :cond_3
    iget-object v0, v4, Lo/agu$d;->d:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 132
    :goto_2
    return-object p2
.end method
