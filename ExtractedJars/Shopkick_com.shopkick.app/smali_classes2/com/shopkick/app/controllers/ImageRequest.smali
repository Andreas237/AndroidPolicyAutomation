.class public Lcom/shopkick/app/controllers/ImageRequest;
.super Ljava/lang/Object;
.source "ImageRequest.java"


# instance fields
.field public id:Lcom/shopkick/app/adapter/ViewId;

.field public position:I

.field public viewHolder:Landroid/support/v7/widget/RecyclerView$ViewHolder;


# direct methods
.method public constructor <init>(ILcom/shopkick/app/adapter/ViewId;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p1, p0, Lcom/shopkick/app/controllers/ImageRequest;->position:I

    .line 17
    iput-object p2, p0, Lcom/shopkick/app/controllers/ImageRequest;->id:Lcom/shopkick/app/adapter/ViewId;

    return-void
.end method

.method public constructor <init>(Landroid/support/v7/widget/RecyclerView$ViewHolder;Lcom/shopkick/app/adapter/ViewId;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/shopkick/app/controllers/ImageRequest;->viewHolder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    .line 22
    iput-object p2, p0, Lcom/shopkick/app/controllers/ImageRequest;->id:Lcom/shopkick/app/adapter/ViewId;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 31
    :cond_0
    instance-of v1, p1, Lcom/shopkick/app/controllers/ImageRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 35
    :cond_1
    check-cast p1, Lcom/shopkick/app/controllers/ImageRequest;

    .line 36
    iget v1, p0, Lcom/shopkick/app/controllers/ImageRequest;->position:I

    iget v3, p1, Lcom/shopkick/app/controllers/ImageRequest;->position:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/controllers/ImageRequest;->id:Lcom/shopkick/app/adapter/ViewId;

    iget-object v3, p1, Lcom/shopkick/app/controllers/ImageRequest;->id:Lcom/shopkick/app/adapter/ViewId;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/adapter/ViewId;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/controllers/ImageRequest;->viewHolder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    iget-object p1, p1, Lcom/shopkick/app/controllers/ImageRequest;->viewHolder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 42
    iget v0, p0, Lcom/shopkick/app/controllers/ImageRequest;->position:I

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 43
    iget-object v0, p0, Lcom/shopkick/app/controllers/ImageRequest;->id:Lcom/shopkick/app/adapter/ViewId;

    invoke-virtual {v0}, Lcom/shopkick/app/adapter/ViewId;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 44
    iget-object v0, p0, Lcom/shopkick/app/controllers/ImageRequest;->viewHolder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method
