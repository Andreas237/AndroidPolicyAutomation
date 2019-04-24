.class Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;
.super Ljava/lang/Object;
.source "OwnTheTripVideoTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "VideoPromoTileOnClickListener"
.end annotation


# instance fields
.field private playIcon:Landroid/view/View;

.field private promoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private videoController:Lcom/shopkick/app/video/VideoController;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/video/VideoController;Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 304
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 305
    iput-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 306
    iput-object p3, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;->promoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 307
    iput-object p2, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;->playIcon:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 312
    iget-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->isVideoStopped()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;->promoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    if-eq p1, v0, :cond_1

    .line 313
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;->promoTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 315
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;->playIcon:Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 316
    iget-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$VideoPromoTileOnClickListener;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->enterFullScreen()V

    return-void
.end method
