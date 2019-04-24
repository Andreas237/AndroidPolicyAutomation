.class public Lo/dxx;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dxx$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/dxx$c;>;"
    }
.end annotation


# instance fields
.field private c:Landroid/content/Context;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dvv;>;"
        }
    .end annotation
.end field

.field e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lo/dvv;>;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dxx;->e:Ljava/util/Map;

    .line 36
    iput-object p1, p0, Lo/dxx;->c:Landroid/content/Context;

    .line 37
    iput-object p2, p0, Lo/dxx;->d:Ljava/util/ArrayList;

    .line 38
    iget-object v0, p0, Lo/dxx;->e:Ljava/util/Map;

    invoke-static {v0}, Lo/dzs;->c(Ljava/util/Map;)V

    .line 39
    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;I)Lo/dxx$c;
    .locals 5

    .line 43
    const/4 v3, 0x0

    .line 44
    iget-object v0, p0, Lo/dxx;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$layout;->share_medal_list_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 45
    new-instance v3, Lo/dxx$c;

    invoke-direct {v3, p0, v4}, Lo/dxx$c;-><init>(Lo/dxx;Landroid/view/View;)V

    .line 46
    return-object v3
.end method

.method public b(Lo/dxx$c;I)V
    .locals 8

    .line 52
    iget-object v0, p0, Lo/dxx;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    .line 53
    if-ltz p2, :cond_0

    iget-object v0, p0, Lo/dxx;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p2, v0, :cond_1

    .line 54
    :cond_0
    const-string v0, "PLGACHIEVE_ShareMedalRecyclerAdapter"

    const-string v1, "IndexOutOfBoundsException"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    return-void

    .line 57
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/dxx$c;->setIsRecyclable(Z)V

    .line 58
    iget-object v0, p0, Lo/dxx;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/dvv;

    .line 59
    invoke-virtual {v2}, Lo/dvv;->e()Ljava/lang/String;

    move-result-object v3

    .line 60
    invoke-virtual {v2}, Lo/dvv;->c()Ljava/lang/String;

    move-result-object v4

    .line 62
    iget-object v0, p1, Lo/dxx$c;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-static {v3, v0, v1}, Lo/dzs;->c(Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 71
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 72
    iget-object v0, p1, Lo/dxx$c;->e:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 73
    iget-object v0, p1, Lo/dxx$c;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1

    .line 75
    :cond_2
    const/4 v6, 0x0

    .line 77
    :try_start_0
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    .line 80
    goto :goto_0

    .line 78
    :catch_0
    move-exception v7

    .line 79
    const-string v0, "PLGACHIEVE_ShareMedalRecyclerAdapter"

    const-string v1, "NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    :goto_0
    if-lez v6, :cond_3

    const/16 v0, 0x13

    if-ge v6, v0, :cond_3

    .line 82
    iget-object v0, p0, Lo/dxx;->e:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 83
    iget-object v0, p1, Lo/dxx$c;->e:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 84
    iget-object v0, p1, Lo/dxx$c;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 85
    goto :goto_1

    .line 86
    :cond_3
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 87
    iget-object v0, p1, Lo/dxx$c;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 88
    iget-object v0, p1, Lo/dxx$c;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 92
    :cond_4
    :goto_1
    return-void
.end method

.method public getItemCount()I
    .locals 2

    .line 96
    const/4 v1, 0x0

    .line 97
    iget-object v0, p0, Lo/dxx;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lo/dxx;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 100
    :cond_0
    return v1
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 29
    move-object v0, p1

    check-cast v0, Lo/dxx$c;

    invoke-virtual {p0, v0, p2}, Lo/dxx;->b(Lo/dxx$c;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 29
    invoke-virtual {p0, p1, p2}, Lo/dxx;->a(Landroid/view/ViewGroup;I)Lo/dxx$c;

    move-result-object v0

    return-object v0
.end method
