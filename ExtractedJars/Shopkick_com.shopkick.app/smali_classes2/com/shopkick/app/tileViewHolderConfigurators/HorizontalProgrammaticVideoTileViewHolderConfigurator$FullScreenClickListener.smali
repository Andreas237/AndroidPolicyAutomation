.class public Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator$FullScreenClickListener;
.super Ljava/lang/Object;
.source "HorizontalProgrammaticVideoTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "FullScreenClickListener"
.end annotation


# instance fields
.field private configuratorRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;",
            ">;"
        }
    .end annotation
.end field

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator$FullScreenClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    .line 180
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator$FullScreenClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 184
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator$FullScreenClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;

    if-eqz p1, :cond_1

    .line 186
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator$FullScreenClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    .line 188
    :cond_0
    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator$FullScreenClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 189
    invoke-static {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;->access$000(Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalProgrammaticVideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->enterFullScreen()V

    return-void

    :cond_1
    :goto_0
    return-void
.end method
