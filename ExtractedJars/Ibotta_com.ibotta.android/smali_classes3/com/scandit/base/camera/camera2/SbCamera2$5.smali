.class Lcom/scandit/base/camera/camera2/SbCamera2$5;
.super Ljava/lang/Object;
.source "SbCamera2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/SbCamera2;->modifyCaptureRequestAsync(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

.field final synthetic val$updater:Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V
    .locals 0

    .line 577
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$5;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    iput-object p2, p0, Lcom/scandit/base/camera/camera2/SbCamera2$5;->val$updater:Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 580
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2$5;->val$updater:Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$5;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$600(Lcom/scandit/base/camera/camera2/SbCamera2;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;->run(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    return-void
.end method
