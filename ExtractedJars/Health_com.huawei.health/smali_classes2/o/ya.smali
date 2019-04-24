.class public Lo/ya;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ya$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/ya$a;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/xa;>;"
        }
    .end annotation
.end field

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ya;->a:Ljava/util/ArrayList;

    .line 30
    iput-object p1, p0, Lo/ya;->d:Landroid/content/Context;

    .line 32
    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;I)Lo/ya$a;
    .locals 5

    .line 36
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$layout;->like_data_row:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 37
    new-instance v4, Lo/ya$a;

    invoke-direct {v4, p0, v3}, Lo/ya$a;-><init>(Lo/ya;Landroid/view/View;)V

    .line 38
    return-object v4
.end method

.method public e(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/xa;>;)V"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lo/ya;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 43
    iget-object v0, p0, Lo/ya;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 44
    invoke-virtual {p0}, Lo/ya;->notifyDataSetChanged()V

    .line 45
    return-void
.end method

.method public e(Lo/ya$a;I)V
    .locals 10

    .line 52
    iget-object v0, p0, Lo/ya;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x42200000    # 40.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v3, v0

    .line 55
    if-ltz p2, :cond_3

    iget-object v0, p0, Lo/ya;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p2, v0, :cond_3

    .line 56
    iget-object v0, p0, Lo/ya;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/xa;

    .line 57
    const-string v5, ""

    .line 58
    const-string v6, ""

    .line 59
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 60
    invoke-virtual {v4}, Lo/xa;->a()Ljava/lang/String;

    move-result-object v5

    .line 61
    invoke-virtual {v4}, Lo/xa;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 62
    iget-object v0, p0, Lo/ya;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_no_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {v4}, Lo/xa;->d()Ljava/lang/String;

    move-result-object v6

    .line 69
    :cond_1
    :goto_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 70
    iget-object v0, p0, Lo/ya;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    const-string v1, "LOAD"

    .line 71
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->tag(Ljava/lang/Object;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    new-instance v1, Lo/xm;

    invoke-direct {v1}, Lo/xm;-><init>()V

    .line 72
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->transform(Lcom/squareup/picasso/Transformation;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$mipmap;->ic_personal_head:I

    .line 73
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->error(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$mipmap;->ic_personal_head:I

    .line 74
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->placeholder(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lcom/squareup/picasso/RequestCreator;->centerCrop()Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    .line 76
    invoke-virtual {v0, v3, v3}, Lcom/squareup/picasso/RequestCreator;->resize(II)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    .line 77
    invoke-static {p1}, Lo/ya$a;->b(Lo/ya$a;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 79
    :cond_2
    invoke-static {p1}, Lo/ya$a;->c(Lo/ya$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    iget-object v0, p0, Lo/ya;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/xa;

    invoke-virtual {v0}, Lo/xa;->c()Ljava/lang/String;

    move-result-object v7

    .line 83
    invoke-static {v7}, Lo/xp;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 84
    if-eqz v8, :cond_3

    .line 85
    const/16 v0, 0x20

    invoke-virtual {v8, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v8, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 86
    invoke-static {p1}, Lo/ya$a;->e(Lo/ya$a;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v9, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    :cond_3
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 93
    iget-object v0, p0, Lo/ya;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 24
    move-object v0, p1

    check-cast v0, Lo/ya$a;

    invoke-virtual {p0, v0, p2}, Lo/ya;->e(Lo/ya$a;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 24
    invoke-virtual {p0, p1, p2}, Lo/ya;->a(Landroid/view/ViewGroup;I)Lo/ya$a;

    move-result-object v0

    return-object v0
.end method
