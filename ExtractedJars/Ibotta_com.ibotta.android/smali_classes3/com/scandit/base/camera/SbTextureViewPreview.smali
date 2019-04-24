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

.field private mMirrorVertically:Z

.field mSurfaceTextureListener:Landroid/view/TextureView$SurfaceTextureListener;

.field mView:Landroid/view/TextureView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/scandit/barcodepicker/ScanSettings;Lcom/scandit/base/camera/SbIVideoPreview$Callback;)V
    .locals 2

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mMirrorVertically:Z

    .line 33
    new-instance v1, Lcom/scandit/base/camera/SbTextureViewPreview$1;

    invoke-direct {v1, p0}, Lcom/scandit/base/camera/SbTextureViewPreview$1;-><init>(Lcom/scandit/base/camera/SbTextureViewPreview;)V

    iput-object v1, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mSurfaceTextureListener:Landroid/view/TextureView$SurfaceTextureListener;

    .line 61
    new-instance v1, Landroid/view/TextureView;

    invoke-direct {v1, p1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mView:Landroid/view/TextureView;

    .line 62
    iget-object p1, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mView:Landroid/view/TextureView;

    iget-object v1, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mSurfaceTextureListener:Landroid/view/TextureView$SurfaceTextureListener;

    invoke-virtual {p1, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 63
    iput-object p3, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mCallback:Lcom/scandit/base/camera/SbIVideoPreview$Callback;

    const-string p1, "mirror_preview_vertically"

    .line 64
    invoke-virtual {p2, p1}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mMirrorVertically:Z

    return-void
.end method


# virtual methods
.method public applyTransformation(Landroid/graphics/Matrix;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 75
    iget-boolean v0, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mMirrorVertically:Z

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    .line 76
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    const/4 v0, 0x0

    .line 77
    iget-object v1, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mView:Landroid/view/TextureView;

    invoke-virtual {v1}, Landroid/view/TextureView;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mView:Landroid/view/TextureView;

    new-instance v1, Lcom/scandit/base/camera/SbTextureViewPreview$2;

    invoke-direct {v1, p0, p1}, Lcom/scandit/base/camera/SbTextureViewPreview$2;-><init>(Lcom/scandit/base/camera/SbTextureViewPreview;Landroid/graphics/Matrix;)V

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public getView()Landroid/view/TextureView;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mView:Landroid/view/TextureView;

    return-object v0
.end method

.method public bridge synthetic getView()Landroid/view/View;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/scandit/base/camera/SbTextureViewPreview;->getView()Landroid/view/TextureView;

    move-result-object v0

    return-object v0
.end method

.method public useForPreview(Landroid/hardware/Camera;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lcom/scandit/base/camera/SbTextureViewPreview;->mView:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V

    .line 92
    invoke-virtual {p1}, Landroid/hardware/Camera;->startPreview()V

    return-void
.end method
