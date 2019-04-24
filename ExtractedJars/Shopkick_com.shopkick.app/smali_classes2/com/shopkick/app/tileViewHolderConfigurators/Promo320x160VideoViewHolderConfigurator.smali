.class public Lcom/shopkick/app/tileViewHolderConfigurators/Promo320x160VideoViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;
.source "Promo320x160VideoViewHolderConfigurator.java"


# static fields
.field public static final VIDEO_PADDING:I


# direct methods
.method public constructor <init>(Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/account/AgeVerificationController;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;-><init>(Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/account/AgeVerificationController;)V

    return-void
.end method


# virtual methods
.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 21
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    const p2, 0x7f09080d

    .line 22
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p2, p2}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method
