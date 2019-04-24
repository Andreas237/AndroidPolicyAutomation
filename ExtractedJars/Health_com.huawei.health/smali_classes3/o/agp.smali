.class public Lo/agp;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/agp$e;
    }
.end annotation


# instance fields
.field private a:Landroid/view/LayoutInflater;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/agy;>;"
        }
    .end annotation
.end field

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/agp;->b:Ljava/util/List;

    .line 26
    iput-object p1, p0, Lo/agp;->e:Landroid/content/Context;

    .line 27
    iget-object v0, p0, Lo/agp;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/agp;->a:Landroid/view/LayoutInflater;

    .line 28
    return-void
.end method


# virtual methods
.method public a(I)Lo/agy;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/agp;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/agy;

    return-object v0
.end method

.method public c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/agy;>;)V"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lo/agp;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 32
    iget-object v0, p0, Lo/agp;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 33
    invoke-virtual {p0}, Lo/agp;->notifyDataSetChanged()V

    .line 34
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 43
    iget-object v0, p0, Lo/agp;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 20
    invoke-virtual {p0, p1}, Lo/agp;->a(I)Lo/agy;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 53
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 59
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 60
    iget-object v0, p0, Lo/agp;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/plugindevice/R$layout;->honour_device_setting_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 61
    new-instance v3, Lo/agp$e;

    invoke-direct {v3}, Lo/agp$e;-><init>()V

    .line 62
    sget v0, Lcom/huawei/plugindevice/R$id;->weight_clock_text:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lo/agp$e;->c:Landroid/widget/TextView;

    .line 63
    sget v0, Lcom/huawei/plugindevice/R$id;->device_setting_img:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v3, Lo/agp$e;->e:Landroid/widget/ImageView;

    .line 64
    sget v0, Lcom/huawei/plugindevice/R$id;->right_text:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lo/agp$e;->d:Landroid/widget/TextView;

    .line 65
    sget v0, Lcom/huawei/plugindevice/R$id;->settings_switch:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v3, Lo/agp$e;->a:Landroid/widget/ImageView;

    .line 66
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/agp$e;

    .line 71
    :goto_0
    invoke-virtual {p0, p1}, Lo/agp;->a(I)Lo/agy;

    move-result-object v0

    invoke-virtual {v0}, Lo/agy;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    iget-object v0, v3, Lo/agp$e;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 74
    :cond_1
    iget-object v0, v3, Lo/agp$e;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 75
    iget-object v0, v3, Lo/agp$e;->d:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Lo/agp;->a(I)Lo/agy;

    move-result-object v1

    invoke-virtual {v1}, Lo/agy;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    :goto_1
    iget-object v0, v3, Lo/agp$e;->c:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Lo/agp;->a(I)Lo/agy;

    move-result-object v1

    invoke-virtual {v1}, Lo/agy;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    invoke-virtual {p0, p1}, Lo/agp;->a(I)Lo/agy;

    move-result-object v0

    invoke-virtual {v0}, Lo/agy;->c()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 80
    iget-object v0, v3, Lo/agp$e;->e:Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Lo/agp;->a(I)Lo/agy;

    move-result-object v1

    invoke-virtual {v1}, Lo/agy;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 83
    :cond_2
    invoke-virtual {p0, p1}, Lo/agp;->a(I)Lo/agy;

    move-result-object v0

    invoke-virtual {v0}, Lo/agy;->g()Z

    move-result v0

    if-nez v0, :cond_3

    .line 84
    iget-object v0, v3, Lo/agp$e;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agp;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->common_black_30alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    .line 86
    :cond_3
    iget-object v0, v3, Lo/agp$e;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lo/agp;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->text_color_list:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 88
    :goto_2
    iget-object v0, p0, Lo/agp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 89
    iget-object v0, v3, Lo/agp$e;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->sim_direction_left_black_tip_image:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_3

    .line 91
    :cond_4
    iget-object v0, v3, Lo/agp$e;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->btn_list_rightarrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 93
    :goto_3
    return-object p2
.end method
