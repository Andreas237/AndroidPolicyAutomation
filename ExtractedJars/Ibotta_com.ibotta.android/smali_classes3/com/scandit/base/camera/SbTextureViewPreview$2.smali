.class Lcom/scandit/base/camera/SbTextureViewPreview$2;
.super Ljava/lang/Object;
.source "SbTextureViewPreview.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/SbTextureViewPreview;->applyTransformation(Landroid/graphics/Matrix;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/SbTextureViewPreview;

.field final synthetic val$transformation:Landroid/graphics/Matrix;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/SbTextureViewPreview;Landroid/graphics/Matrix;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/scandit/base/camera/SbTextureViewPreview$2;->this$0:Lcom/scandit/base/camera/SbTextureViewPreview;

    iput-object p2, p0, Lcom/scandit/base/camera/SbTextureViewPreview$2;->val$transformation:Landroid/graphics/Matrix;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/scandit/base/camera/SbTextureViewPreview$2;->this$0:Lcom/scandit/base/camera/SbTextureViewPreview;

    iget-object v0, v0, Lcom/scandit/base/camera/SbTextureViewPreview;->mView:Landroid/view/TextureView;

    iget-object v1, p0, Lcom/scandit/base/camera/SbTextureViewPreview$2;->val$transformation:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    return-void
.end method
