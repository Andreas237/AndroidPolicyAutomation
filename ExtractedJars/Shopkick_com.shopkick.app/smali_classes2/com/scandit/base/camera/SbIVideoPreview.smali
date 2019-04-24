.class public interface abstract Lcom/scandit/base/camera/SbIVideoPreview;
.super Ljava/lang/Object;
.source "SbIVideoPreview.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/base/camera/SbIVideoPreview$Callback;
    }
.end annotation


# virtual methods
.method public abstract getView()Landroid/view/View;
.end method

.method public abstract useForPreview(Landroid/hardware/Camera;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
