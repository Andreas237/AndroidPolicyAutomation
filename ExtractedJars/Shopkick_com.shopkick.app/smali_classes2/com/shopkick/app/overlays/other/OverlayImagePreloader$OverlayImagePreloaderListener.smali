.class public interface abstract Lcom/shopkick/app/overlays/other/OverlayImagePreloader$OverlayImagePreloaderListener;
.super Ljava/lang/Object;
.source "OverlayImagePreloader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/other/OverlayImagePreloader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OverlayImagePreloaderListener"
.end annotation


# virtual methods
.method public abstract onPreloadError(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
.end method

.method public abstract onPreloadSuccess()V
.end method
