.class public interface abstract Lcom/huawei/openalliance/ad/views/interfaces/IAppDownloadButton;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/i/b;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation


# virtual methods
.method public abstract cancel()V
.end method

.method public abstract refreshStatus()Lcom/huawei/openalliance/ad/download/app/AppStatus;
.end method

.method public abstract setAdLandingPageData(Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;)V
.end method

.method public abstract setAppDownloadButtonStyle(Lcom/huawei/openalliance/ad/views/AppDownloadButtonStyle;)V
.end method

.method public abstract setNativeAd(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)Z
.end method

.method public abstract setPpsNativeView(Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;)V
.end method

.method public abstract updateContent(Ljava/lang/String;)V
.end method
