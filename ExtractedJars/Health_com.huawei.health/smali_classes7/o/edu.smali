.class public Lo/edu;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/edu$a;
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/edd;>;"
        }
    .end annotation
.end field

.field private e:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/edd;>;Landroid/content/Context;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lo/edu;->d:Ljava/util/ArrayList;

    .line 26
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/edu;->e:Landroid/view/LayoutInflater;

    .line 27
    iput-object p2, p0, Lo/edu;->b:Landroid/content/Context;

    .line 28
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 32
    iget-object v0, p0, Lo/edu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 37
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/edu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 38
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 40
    :cond_1
    iget-object v0, p0, Lo/edu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 45
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 50
    iget-object v0, p0, Lo/edu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/edd;

    .line 52
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 54
    new-instance v4, Lo/edu$a;

    invoke-direct {v4}, Lo/edu$a;-><init>()V

    .line 55
    iget-object v0, p0, Lo/edu;->e:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/sim/R$layout;->wireless_item_activity:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 56
    sget v0, Lcom/huawei/sim/R$id;->open_esim:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lo/edu$a;->b:Landroid/widget/TextView;

    .line 57
    sget v0, Lcom/huawei/sim/R$id;->open_esim_tips:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lo/edu$a;->a:Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/huawei/sim/R$id;->set_tips_image:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 59
    iget-object v0, p0, Lo/edu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    sget v0, Lcom/huawei/sim/R$drawable;->sim_direction_left_tip_image:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 62
    :cond_0
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 63
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/edu$a;

    .line 68
    :goto_0
    invoke-virtual {v3}, Lo/edd;->b()Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    iget-object v0, v4, Lo/edu$a;->b:Landroid/widget/TextView;

    invoke-virtual {v3}, Lo/edd;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    invoke-virtual {v3}, Lo/edd;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 71
    iget-object v0, v4, Lo/edu$a;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 73
    :cond_2
    iget-object v0, v4, Lo/edu$a;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 74
    iget-object v0, v4, Lo/edu$a;->a:Landroid/widget/TextView;

    invoke-virtual {v3}, Lo/edd;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    :goto_1
    return-object p2
.end method
