.class public Lcom/scandit/base/camera/SbTextureViewPreview;
.super Ljava/lang/Object;
.source "SbTextureViewPreview.java"

# interfaces
.implements Lcom/scandit/base/camera/SbIVideoPreview;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# instance fields
.field mCallback:Lcom/scandit/base/camera/SbIVideoPreview$Callback;

.field mSurfaceTextureListener:Landroid/view/TextureView$SurfaceTextureListener;

.field mView:Landroid/view/TextureView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/scandit/base/camera/SbIVideoPreview$Callback;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Lcom/scandit/base/camera/SbTextureViewPreview$1;

    invoke-direct {v0, p0}, Lcom/scandit/base/camera/SbTextureViewPreview$1;-><init>(Lcom/scandit/base/camera/SbTextureViewPreview;)V

    iput-object v0, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mSurfaceTextureListener:Landroid/view/TextureView$SurfaceTextureListener;

    .line 56
    new-instance v0, Landroid/view/TextureView;

    invoke-direct {v0, p1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mView:Landroid/view/TextureView;

    .line 57
    iget-object p1, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mView:Landroid/view/TextureView;

    iget-object v0, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mSurfaceTextureListener:Landroid/view/TextureView$SurfaceTextureListener;

    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 58
    iput-object p2, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mCallback:Lcom/scandit/base/camera/SbIVideoPreview$Callback;

    return-void
.end method


# virtual methods
.method public getView()Landroid/view/View;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mView:Landroid/view/TextureView;

    return-object v0
.end method

.method public useForPreview(Landroid/hardware/Camera;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mView:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V

    .line 71
    invoke-virtual {p1}, Landroid/hardware/Camera;->startPreview()V

    return-void
.end method
