.class public interface abstract Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/i/b;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation


# virtual methods
.method public abstract onCheckVideoHashResult(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;Z)V
.end method

.method public abstract onPreviewImageLoaded(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;Landroid/graphics/Bitmap;)V
.end method

.method public abstract setNativeAd(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)V
.end method

.method public abstract showFullScreenSwitchButton(Z)V
.end method

.method public abstract updateContent(Ljava/lang/String;)V
.end method
