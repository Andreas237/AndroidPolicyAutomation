.class public Lcom/shopkick/app/view/ScanCameraSurfaceView;
.super Landroid/view/SurfaceView;
.source "ScanCameraSurfaceView.java"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# static fields
.field private static final TAG:Ljava/lang/String; = "CameraSourcePreview"


# instance fields
.field private mCameraSource:Lcom/google/android/gms/vision/CameraSource;

.field private mStartRequested:Z

.field private mSurfaceAvailable:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 27
    iput-boolean p1, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mStartRequested:Z

    .line 28
    iput-boolean p1, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mSurfaceAvailable:Z

    .line 30
    invoke-virtual {p0}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method

.method private adjustPreviewSurfaceSize(IIII)V
    .locals 4

    if-ge p4, p3, :cond_0

    move v3, p4

    move p4, p3

    move p3, v3

    :cond_0
    int-to-float p1, p1

    int-to-float p2, p2

    div-float v0, p1, p2

    int-to-float p3, p3

    int-to-float p4, p4

    div-float v1, p3, p4

    cmpl-float v2, v0, v1

    if-eqz v2, :cond_2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    div-float/2addr p1, p3

    div-float/2addr p2, p4

    .line 82
    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    goto :goto_0

    :cond_1
    div-float/2addr p1, p3

    div-float/2addr p2, p4

    .line 84
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    :goto_0
    mul-float/2addr p3, p1

    float-to-int p2, p3

    mul-float/2addr p4, p1

    float-to-int p1, p4

    .line 90
    new-instance p3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p3, p2, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 p1, 0x30

    .line 91
    iput p1, p3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 92
    invoke-virtual {p0, p3}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    return-void
.end method

.method private startIfReady()V
    .locals 2
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.CAMERA"
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/SecurityException;
        }
    .end annotation

    .line 98
    iget-boolean v0, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mStartRequested:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mSurfaceAvailable:Z

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mCameraSource:Lcom/google/android/gms/vision/CameraSource;

    invoke-virtual {p0}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/vision/CameraSource;->start(Landroid/view/SurfaceHolder;)Lcom/google/android/gms/vision/CameraSource;

    const/4 v0, 0x0

    .line 100
    iput-boolean v0, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mStartRequested:Z

    :cond_0
    return-void
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .locals 0

    .line 107
    :try_start_0
    invoke-direct {p0}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->startIfReady()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "CameraSourcePreview"

    const-string p3, "Could not start camera source."

    .line 111
    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    move-exception p1

    const-string p2, "CameraSourcePreview"

    const-string p3, "Do not have permission to start the camera"

    .line 109
    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public release()V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mCameraSource:Lcom/google/android/gms/vision/CameraSource;

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {v0}, Lcom/google/android/gms/vision/CameraSource;->release()V

    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mCameraSource:Lcom/google/android/gms/vision/CameraSource;

    :cond_0
    return-void
.end method

.method public start(Lcom/google/android/gms/vision/CameraSource;)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.CAMERA"
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/SecurityException;
        }
    .end annotation

    if-nez p1, :cond_0

    .line 36
    invoke-virtual {p0}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->stop()V

    .line 39
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mCameraSource:Lcom/google/android/gms/vision/CameraSource;

    .line 41
    iget-object p1, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mCameraSource:Lcom/google/android/gms/vision/CameraSource;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 42
    iput-boolean p1, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mStartRequested:Z

    .line 43
    invoke-direct {p0}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->startIfReady()V

    :cond_1
    return-void
.end method

.method public stop()V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mCameraSource:Lcom/google/android/gms/vision/CameraSource;

    if-eqz v0, :cond_0

    .line 49
    invoke-virtual {v0}, Lcom/google/android/gms/vision/CameraSource;->stop()V

    :cond_0
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    const/16 p1, 0x500

    const/16 p2, 0x2d0

    .line 134
    invoke-direct {p0, p3, p4, p1, p2}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->adjustPreviewSurfaceSize(IIII)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    const/4 p1, 0x1

    .line 117
    iput-boolean p1, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mSurfaceAvailable:Z

    .line 119
    :try_start_0
    invoke-direct {p0}, Lcom/shopkick/app/view/ScanCameraSurfaceView;->startIfReady()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "CameraSourcePreview"

    const-string v1, "Could not start camera source."

    .line 123
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    move-exception p1

    const-string v0, "CameraSourcePreview"

    const-string v1, "Do not have permission to start the camera"

    .line 121
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 0

    const/4 p1, 0x0

    .line 129
    iput-boolean p1, p0, Lcom/shopkick/app/view/ScanCameraSurfaceView;->mSurfaceAvailable:Z

    return-void
.end method
