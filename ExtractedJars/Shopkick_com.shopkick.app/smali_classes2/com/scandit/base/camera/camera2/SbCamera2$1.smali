.class Lcom/scandit/base/camera/camera2/SbCamera2$1;
.super Ljava/lang/Object;
.source "SbCamera2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/SbCamera2;->startAsync(Lcom/scandit/base/camera/SbICamera$CameraFacing;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$facing:Lcom/scandit/base/camera/SbICamera$CameraFacing;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/SbICamera$CameraFacing;Landroid/content/Context;)V
    .locals 0

    .line 369
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$1;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    iput-object p2, p0, Lcom/scandit/base/camera/camera2/SbCamera2$1;->val$facing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    iput-object p3, p0, Lcom/scandit/base/camera/camera2/SbCamera2$1;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 372
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2$1;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$1;->val$facing:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2$1;->val$context:Landroid/content/Context;

    invoke-static {v0, v1, v2}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$1100(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/SbICamera$CameraFacing;Landroid/content/Context;)V

    return-void
.end method
