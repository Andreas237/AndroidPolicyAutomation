.class Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$CameraListener$1;
.super Ljava/lang/Object;
.source "BarcodePickerInternal.java"

# interfaces
.implements Lcom/scandit/base/camera/SbCameraListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$CameraListener;-><init>(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;Lcom/scandit/base/camera/SbCameraListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$CameraListener;

.field final synthetic val$this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;


# direct methods
.method constructor <init>(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$CameraListener;Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$CameraListener$1;->this$1:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$CameraListener;

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$CameraListener$1;->val$this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public didCloseCamera(Lcom/scandit/base/camera/SbICamera;)V
    .locals 0

    return-void
.end method

.method public didFail(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public didInitializeCamera(Lcom/scandit/base/camera/SbICamera;Lcom/scandit/base/camera/SbICamera$CameraFacing;II)V
    .locals 0

    return-void
.end method
