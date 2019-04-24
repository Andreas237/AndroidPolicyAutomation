.class Lcom/scandit/base/camera/camera2/SbCamera2$3;
.super Ljava/lang/Object;
.source "SbCamera2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/SbCamera2;->setViewAsync(Landroid/view/TextureView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

.field final synthetic val$view:Landroid/view/TextureView;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/SbCamera2;Landroid/view/TextureView;)V
    .locals 0

    .line 410
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$3;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    iput-object p2, p0, Lcom/scandit/base/camera/camera2/SbCamera2$3;->val$view:Landroid/view/TextureView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 413
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2$3;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$3;->val$view:Landroid/view/TextureView;

    invoke-static {v0, v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$1302(Lcom/scandit/base/camera/camera2/SbCamera2;Landroid/view/TextureView;)Landroid/view/TextureView;

    .line 414
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2$3;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$900(Lcom/scandit/base/camera/camera2/SbCamera2;)V

    return-void
.end method
