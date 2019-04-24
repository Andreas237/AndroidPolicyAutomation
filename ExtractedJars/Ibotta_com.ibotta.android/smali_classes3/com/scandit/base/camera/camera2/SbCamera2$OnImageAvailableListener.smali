.class final Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;
.super Ljava/lang/Object;
.source "SbCamera2.java"

# interfaces
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/camera2/SbCamera2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "OnImageAvailableListener"
.end annotation


# instance fields
.field errorCount:I

.field private mSynchronizer:Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;

.field final synthetic this$0:Lcom/scandit/base/camera/camera2/SbCamera2;


# direct methods
.method private constructor <init>(Lcom/scandit/base/camera/camera2/SbCamera2;)V
    .locals 0

    .line 299
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 301
    iput p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;->errorCount:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/camera2/SbCamera2$1;)V
    .locals 0

    .line 299
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;-><init>(Lcom/scandit/base/camera/camera2/SbCamera2;)V

    return-void
.end method


# virtual methods
.method public onImageAvailable(Landroid/media/ImageReader;)V
    .locals 1

    .line 316
    :try_start_0
    invoke-virtual {p1}, Landroid/media/ImageReader;->acquireLatestImage()Landroid/media/Image;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    return-void

    .line 329
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;->mSynchronizer:Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;->pushImage(Landroid/media/Image;)V

    return-void

    .line 318
    :catch_0
    iget p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;->errorCount:I

    if-nez p1, :cond_1

    const-string p1, "ScanditSDK"

    const-string v0, "No buffer available for next image."

    .line 319
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 322
    :cond_1
    iget p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;->errorCount:I

    add-int/lit8 p1, p1, 0x1

    rem-int/lit8 p1, p1, 0x1e

    iput p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;->errorCount:I

    return-void
.end method

.method public setCapturedImagesQueue(Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;)V
    .locals 0

    .line 304
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;->mSynchronizer:Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;

    return-void
.end method
