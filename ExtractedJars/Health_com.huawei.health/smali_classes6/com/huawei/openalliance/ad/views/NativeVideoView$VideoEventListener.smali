.class public interface abstract Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/NativeVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "VideoEventListener"
.end annotation


# virtual methods
.method public abstract onControlPanelHide(ZI)V
.end method

.method public abstract onControlPanelShow(ZI)V
.end method

.method public abstract onVideoComplete()V
.end method

.method public abstract onVideoPause()V
.end method

.method public abstract onVideoStart()V
.end method

.method public abstract onVideoStop()V
.end method
