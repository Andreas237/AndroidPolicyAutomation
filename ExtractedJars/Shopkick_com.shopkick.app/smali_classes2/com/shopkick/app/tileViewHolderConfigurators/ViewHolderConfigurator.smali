.class public abstract Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.super Ljava/lang/Object;
.source "ViewHolderConfigurator.java"


# instance fields
.field protected allowChainLogoResize:Z

.field protected chainLogoMaxWidth:Ljava/lang/Integer;

.field protected eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field protected userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

.field protected userEventCoordinators:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/logging/IUserEventCoordinator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected adjustChainLogoWidth(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 97
    iget-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->allowChainLogoResize:Z

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->chainLogoMaxWidth:Ljava/lang/Integer;

    invoke-static {p1, p2, v0}, Lcom/shopkick/app/util/TileUtils;->adjustChainLogoWidth(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method protected cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V
    .locals 0

    .line 59
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 61
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->clear(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 0

    return-void
.end method

.method public fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    .line 47
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    if-eqz v0, :cond_0

    .line 48
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 49
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    const/4 v0, 0x1

    .line 50
    invoke-virtual {p1, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->setFullSpan(Z)V

    :cond_0
    return-void
.end method

.method protected getChainLogoRequestListener(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/RequestListener;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            ")",
            "Lcom/bumptech/glide/request/RequestListener<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 66
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator$1;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;Landroid/widget/ImageView;)V

    return-object v0
.end method

.method protected getHideViewRequestListener(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)Lcom/bumptech/glide/request/RequestListener;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;",
            "I)",
            "Lcom/bumptech/glide/request/RequestListener<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 78
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator$2;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-object v0
.end method

.method public abstract getLayout()I
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 0

    return-void
.end method

.method public abstract onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;)Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;
    .locals 3

    .line 38
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    .line 39
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 40
    invoke-virtual {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->getLayout()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 41
    new-instance v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    invoke-direct {v0, p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->userEventCoordinators:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    iput-object v0, p1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    goto :goto_0

    .line 114
    :cond_0
    iput-object v0, p1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinators:Ljava/util/ArrayList;

    :goto_0
    return-void
.end method

.method public setUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    return-void
.end method

.method public setUserEventCoordinators(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/logging/IUserEventCoordinator;",
            ">;)V"
        }
    .end annotation

    .line 119
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->userEventCoordinators:Ljava/util/ArrayList;

    return-void
.end method

.method public setUserEventLogger(Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-void
.end method
