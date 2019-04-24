.class public Lo/exa;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/exa$e;,
        Lo/exa$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/exa$c;>;"
    }
.end annotation


# instance fields
.field private b:Lo/exa$e;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;"
        }
    .end annotation
.end field

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 31
    iput-object p1, p0, Lo/exa;->e:Landroid/content/Context;

    .line 32
    iput-object p2, p0, Lo/exa;->c:Ljava/util/List;

    .line 33
    return-void
.end method

.method static synthetic c(Lo/exa;)Lo/exa$e;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/exa;->b:Lo/exa$e;

    return-object v0
.end method

.method private c()Z
    .locals 6

    .line 41
    iget-object v0, p0, Lo/exa;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/exa;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 42
    :cond_1
    iget-object v0, p0, Lo/exa;->c:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/openservice/db/model/ChildService;

    .line 43
    iget-object v0, p0, Lo/exa;->e:Landroid/content/Context;

    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/ChildService;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 45
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 46
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 47
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 48
    const/4 v0, 0x1

    return v0

    .line 51
    :cond_2
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 52
    const/4 v0, 0x0

    return v0

    .line 56
    :cond_3
    const-string v0, "ServiceCardAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "icon is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(Lo/exa$c;I)V
    .locals 4

    .line 64
    iget-object v0, p0, Lo/exa;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/openservice/db/model/ChildService;

    .line 65
    iget-object v0, p1, Lo/exa$c;->c:Landroid/widget/TextView;

    invoke-virtual {v2}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    iget-object v0, p0, Lo/exa;->e:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/huawei/ui/openservice/db/model/ChildService;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 67
    if-eqz v3, :cond_0

    .line 68
    iget-object v0, p1, Lo/exa$c;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 69
    iget-object v0, p1, Lo/exa$c;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 71
    :cond_0
    invoke-direct {p0}, Lo/exa;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    iget-object v0, p1, Lo/exa$c;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 73
    iget-object v0, p1, Lo/exa$c;->b:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 74
    iget-object v0, p1, Lo/exa$c;->a:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 76
    :cond_1
    iget-object v0, p1, Lo/exa$c;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 77
    iget-object v0, p1, Lo/exa$c;->b:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 78
    iget-object v0, p1, Lo/exa$c;->a:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 80
    :goto_0
    iget-object v0, p0, Lo/exa;->b:Lo/exa$e;

    if-eqz v0, :cond_2

    .line 82
    iget-object v0, p1, Lo/exa$c;->itemView:Landroid/view/View;

    new-instance v1, Lo/exa$1;

    invoke-direct {v1, p0, p1}, Lo/exa$1;-><init>(Lo/exa;Lo/exa$c;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    :cond_2
    return-void
.end method

.method public a(Lo/exa$e;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lo/exa;->b:Lo/exa$e;

    .line 38
    return-void
.end method

.method public c(Landroid/view/ViewGroup;I)Lo/exa$c;
    .locals 4

    .line 95
    new-instance v0, Lo/exa$c;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$layout;->step_service_recyclerview_item:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/exa$c;-><init>(Lo/exa;Landroid/view/View;)V

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 100
    iget-object v0, p0, Lo/exa;->c:Ljava/util/List;

    if-nez v0, :cond_0

    .line 101
    const/4 v0, 0x0

    return v0

    .line 103
    :cond_0
    iget-object v0, p0, Lo/exa;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 23
    move-object v0, p1

    check-cast v0, Lo/exa$c;

    invoke-virtual {p0, v0, p2}, Lo/exa;->a(Lo/exa$c;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 23
    invoke-virtual {p0, p1, p2}, Lo/exa;->c(Landroid/view/ViewGroup;I)Lo/exa$c;

    move-result-object v0

    return-object v0
.end method
