.class public Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator$FullScreenClickListener;
.super Ljava/lang/Object;
.source "HorizontalSponsoredLookbookTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;
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
            "Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;",
            ">;"
        }
    .end annotation
.end field

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 261
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator$FullScreenClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    .line 262
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator$FullScreenClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 266
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator$FullScreenClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;

    if-eqz p1, :cond_1

    .line 268
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator$FullScreenClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    .line 271
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator$FullScreenClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoController;->loadVideo(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 272
    iget-object p1, p1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSponsoredLookbookTileViewHolderConfigurator;->videoController:Lcom/shopkick/app/video/VideoController;

    invoke-virtual {p1}, Lcom/shopkick/app/video/VideoController;->enterFullScreen()V

    return-void

    :cond_1
    :goto_0
    return-void
.end method
