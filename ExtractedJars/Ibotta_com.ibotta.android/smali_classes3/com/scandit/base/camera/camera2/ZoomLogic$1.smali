.class Lcom/scandit/base/camera/camera2/ZoomLogic$1;
.super Ljava/lang/Object;
.source "ZoomLogic.java"

# interfaces
.implements Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/ZoomLogic;->run(Lcom/scandit/base/camera/camera2/SbCamera2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/ZoomLogic;

.field final synthetic val$cropArea:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/ZoomLogic;Landroid/graphics/Rect;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/ZoomLogic$1;->this$0:Lcom/scandit/base/camera/camera2/ZoomLogic;

    iput-object p2, p0, Lcom/scandit/base/camera/camera2/ZoomLogic$1;->val$cropArea:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 2

    .line 88
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/ZoomLogic$1;->val$cropArea:Landroid/graphics/Rect;

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void
.end method
