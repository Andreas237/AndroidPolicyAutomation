.class public Lcom/shopkick/app/kicksActivity/KicksActivityBirthdayKicksViewHolderConfigurator;
.super Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;
.source "KicksActivityBirthdayKicksViewHolderConfigurator.java"


# instance fields
.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ProfileInfo;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityBirthdayKicksViewHolderConfigurator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00f6

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 1

    const p2, 0x7f09036b

    .line 48
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p2

    .line 49
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityBirthdayKicksViewHolderConfigurator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->getThumbnailPhotoUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->circleCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityBirthdayKicksViewHolderConfigurator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->getThumbnailPhotoUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    .line 42
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 43
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;->updateKicksCountUi(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method
