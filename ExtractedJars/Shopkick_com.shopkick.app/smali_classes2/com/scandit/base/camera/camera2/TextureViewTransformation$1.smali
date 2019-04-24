.class final Lcom/scandit/base/camera/camera2/TextureViewTransformation$1;
.super Ljava/lang/Object;
.source "TextureViewTransformation.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/TextureViewTransformation;->adjustView(Landroid/view/TextureView;ILandroid/content/Context;Lcom/scandit/base/camera/camera2/SbCamera2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$matrix:Landroid/graphics/Matrix;

.field final synthetic val$textureView:Landroid/view/TextureView;


# direct methods
.method constructor <init>(Landroid/view/TextureView;Landroid/graphics/Matrix;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/TextureViewTransformation$1;->val$textureView:Landroid/view/TextureView;

    iput-object p2, p0, Lcom/scandit/base/camera/camera2/TextureViewTransformation$1;->val$matrix:Landroid/graphics/Matrix;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/TextureViewTransformation$1;->val$textureView:Landroid/view/TextureView;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/TextureViewTransformation$1;->val$matrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    return-void
.end method
