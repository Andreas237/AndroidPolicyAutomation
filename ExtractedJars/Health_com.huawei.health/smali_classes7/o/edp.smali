.class public Lo/edp;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/edp$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/edb;>;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field private c:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/edb;>;Landroid/content/Context;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 28
    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lo/edp;->a:Ljava/util/ArrayList;

    .line 29
    iput-object p2, p0, Lo/edp;->b:Landroid/content/Context;

    .line 30
    iget-object v0, p0, Lo/edp;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/edp;->c:Landroid/view/LayoutInflater;

    .line 31
    return-void
.end method


# virtual methods
.method public b([B)Landroid/graphics/Bitmap;
    .locals 2

    .line 102
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-eqz v0, :cond_0

    .line 103
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 105
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 40
    iget-object v0, p0, Lo/edp;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/edp;->a:Ljava/util/ArrayList;

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

.method public getItemViewType(I)I
    .locals 1

    .line 90
    iget-object v0, p0, Lo/edp;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/edb;

    invoke-virtual {v0}, Lo/edb;->e()I

    move-result v0

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 50
    iget-object v0, p0, Lo/edp;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/edb;

    .line 53
    invoke-virtual {v3}, Lo/edb;->e()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 54
    new-instance v4, Lo/edp$a;

    invoke-direct {v4}, Lo/edp$a;-><init>()V

    .line 55
    iget-object v0, p0, Lo/edp;->c:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/sim/R$layout;->profile_item_normal:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 56
    sget v0, Lcom/huawei/sim/R$id;->profile_title_tips:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lo/edp$a;->a:Landroid/widget/TextView;

    .line 57
    sget v0, Lcom/huawei/sim/R$id;->profile_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lo/edp$a;->e:Landroid/widget/TextView;

    goto :goto_0

    .line 60
    :cond_0
    new-instance v4, Lo/edp$a;

    invoke-direct {v4}, Lo/edp$a;-><init>()V

    .line 61
    iget-object v0, p0, Lo/edp;->c:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/sim/R$layout;->profile_item_image:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 62
    sget v0, Lcom/huawei/sim/R$id;->profile_title_tips:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lo/edp$a;->a:Landroid/widget/TextView;

    .line 63
    sget v0, Lcom/huawei/sim/R$id;->profile_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lo/edp$a;->e:Landroid/widget/TextView;

    .line 64
    sget v0, Lcom/huawei/sim/R$id;->profile_image:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lo/edp$a;->c:Landroid/widget/ImageView;

    .line 68
    :goto_0
    invoke-virtual {v3}, Lo/edb;->e()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 69
    iget-object v0, v4, Lo/edp$a;->a:Landroid/widget/TextView;

    invoke-virtual {v3}, Lo/edb;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    iget-object v0, v4, Lo/edp$a;->e:Landroid/widget/TextView;

    invoke-virtual {v3}, Lo/edb;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 73
    :cond_1
    iget-object v0, v4, Lo/edp$a;->a:Landroid/widget/TextView;

    invoke-virtual {v3}, Lo/edb;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    iget-object v0, v4, Lo/edp$a;->e:Landroid/widget/TextView;

    invoke-virtual {v3}, Lo/edb;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    invoke-virtual {v3}, Lo/edb;->c()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/edp;->b([B)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 76
    iget-object v0, v4, Lo/edp$a;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 80
    :goto_1
    return-object p2
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 85
    const/4 v0, 0x2

    return v0
.end method
