.class Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator$FullScreenClickListener;
.super Ljava/lang/Object;
.source "VideoTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "FullScreenClickListener"
.end annotation


# instance fields
.field private configuratorRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;",
            ">;"
        }
    .end annotation
.end field

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 172
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator$FullScreenClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    .line 173
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator$FullScreenClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 177
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator$FullScreenClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;

    if-eqz p1, :cond_3

    .line 178
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator$FullScreenClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    .line 179
    :cond_0
    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->isVideoStopped()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator$FullScreenClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    .line 180
    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/video/VideoController;->getCurrentTileInfo()Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 181
    :cond_1
    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator$FullScreenClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 183
    :cond_2
    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/VideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->enterFullScreen()V

    return-void

    :cond_3
    :goto_0
    return-void
.end method
