.class Lcom/shopkick/app/tileViewHolderConfigurators/FeaturedContentTileViewHolderConfigurator$VideoClickListener;
.super Ljava/lang/Object;
.source "FeaturedContentTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/FeaturedContentTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "VideoClickListener"
.end annotation


# instance fields
.field private tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private videoController:Lcom/shopkick/app/video/VideoController;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/video/VideoController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 172
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FeaturedContentTileViewHolderConfigurator$VideoClickListener;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 173
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FeaturedContentTileViewHolderConfigurator$VideoClickListener;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 178
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FeaturedContentTileViewHolderConfigurator$VideoClickListener;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->isVideoStopped()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FeaturedContentTileViewHolderConfigurator$VideoClickListener;->videoController:Lcom/shopkick/app/video/VideoController;

    .line 179
    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p1

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FeaturedContentTileViewHolderConfigurator$VideoClickListener;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    if-eq p1, v0, :cond_1

    .line 180
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FeaturedContentTileViewHolderConfigurator$VideoClickListener;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FeaturedContentTileViewHolderConfigurator$VideoClickListener;->tileInfoV2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 182
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/FeaturedContentTileViewHolderConfigurator$VideoClickListener;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->enterFullScreen()V

    return-void
.end method
