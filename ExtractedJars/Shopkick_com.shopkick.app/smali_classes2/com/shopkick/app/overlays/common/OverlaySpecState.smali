.class public Lcom/shopkick/app/overlays/common/OverlaySpecState;
.super Ljava/lang/Object;
.source "OverlaySpecState.java"

# interfaces
.implements Lcom/shopkick/app/overlays/other/OverlayImagePreloader$OverlayImagePreloaderListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/overlays/common/OverlaySpecState$OnPreparedListener;
    }
.end annotation


# instance fields
.field private apiCommonHandlerCallback:Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;

.field private hasWalkinTransitionedToStoreDetails:Z

.field private imagePreloader:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

.field public isHandled:Z

.field private onPreparedListenerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/overlays/common/OverlaySpecState$OnPreparedListener;",
            ">;"
        }
    .end annotation
.end field

.field private overlayListener:Lcom/shopkick/app/overlays/interfaces/IOverlayListener;

.field private overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

.field private requestObject:Lcom/shopkick/app/fetchers/api/IAPIObject;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 39
    iput-object p2, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->overlayListener:Lcom/shopkick/app/overlays/interfaces/IOverlayListener;

    .line 40
    iput-object p3, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->requestObject:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 41
    iput-object p4, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->apiCommonHandlerCallback:Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;

    const/4 p2, 0x0

    .line 43
    iput-boolean p2, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->isHandled:Z

    .line 44
    new-instance p2, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    invoke-direct {p2, p1, p0}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;-><init>(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/other/OverlayImagePreloader$OverlayImagePreloaderListener;)V

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->imagePreloader:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 2

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->imagePreloader:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 61
    invoke-virtual {v0}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->destroy()V

    .line 62
    iput-object v1, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->imagePreloader:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    .line 65
    :cond_0
    iput-object v1, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->requestObject:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 66
    iput-object v1, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->apiCommonHandlerCallback:Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 49
    instance-of v0, p1, Lcom/shopkick/app/overlays/common/OverlaySpecState;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 52
    :cond_0
    check-cast p1, Lcom/shopkick/app/overlays/common/OverlaySpecState;

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Lcom/shopkick/app/overlays/common/OverlaySpecState;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getAPICommonHandlerCallback()Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->apiCommonHandlerCallback:Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;

    return-object v0
.end method

.method public getOverlayListener()Lcom/shopkick/app/overlays/interfaces/IOverlayListener;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->overlayListener:Lcom/shopkick/app/overlays/interfaces/IOverlayListener;

    return-object v0
.end method

.method public getOverlayRequest()Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->requestObject:Lcom/shopkick/app/fetchers/api/IAPIObject;

    return-object v0
.end method

.method public getOverlaySpec()Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->overlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    return-object v0
.end method

.method public hasWalkinTransitionedToStoreDetails()Z
    .locals 1

    .line 125
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->hasWalkinTransitionedToStoreDetails:Z

    return v0
.end method

.method public isReadyToShow()Z
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->imagePreloader:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->doneLoading()Z

    move-result v0

    return v0
.end method

.method public onPreloadError(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 142
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->onPreparedListenerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/overlays/common/OverlaySpecState$OnPreparedListener;

    if-eqz p1, :cond_0

    .line 144
    invoke-interface {p1, p0}, Lcom/shopkick/app/overlays/common/OverlaySpecState$OnPreparedListener;->onPrepareFailed(Lcom/shopkick/app/overlays/common/OverlaySpecState;)V

    :cond_0
    return-void
.end method

.method public onPreloadSuccess()V
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->onPreparedListenerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/overlays/common/OverlaySpecState$OnPreparedListener;

    if-eqz v0, :cond_0

    .line 136
    invoke-interface {v0}, Lcom/shopkick/app/overlays/common/OverlaySpecState$OnPreparedListener;->onPrepared()V

    :cond_0
    return-void
.end method

.method public prepare(Lcom/shopkick/app/overlays/common/OverlaySpecState$OnPreparedListener;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 85
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->onPreparedListenerWeakReference:Ljava/lang/ref/WeakReference;

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->imagePreloader:Lcom/shopkick/app/overlays/other/OverlayImagePreloader;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/other/OverlayImagePreloader;->preload()V

    :cond_0
    return-void
.end method

.method public setHasWalkinTransitionedToStoreDetails(Z)V
    .locals 0

    .line 118
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/common/OverlaySpecState;->hasWalkinTransitionedToStoreDetails:Z

    return-void
.end method
