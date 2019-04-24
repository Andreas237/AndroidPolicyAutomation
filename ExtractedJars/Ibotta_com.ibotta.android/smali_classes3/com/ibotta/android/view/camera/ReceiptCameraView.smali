.class public Lcom/ibotta/android/view/camera/ReceiptCameraView;
.super Lcom/ibotta/android/view/camera/CameraView;
.source "ReceiptCameraView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/camera/ReceiptCameraView$ReceiptCameraListener;
    }
.end annotation


# instance fields
.field private activity:Landroid/app/Activity;

.field protected appConfig:Lcom/ibotta/android/state/app/config/AppConfig;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected hardware:Lcom/ibotta/android/hardware/Hardware;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/camera/CameraView;-><init>(Landroid/content/Context;)V

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->injectThis()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/view/camera/CameraView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->injectThis()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/view/camera/CameraView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->injectThis()V

    return-void
.end method

.method private debugConfiguration(Landroid/hardware/Camera$Parameters;)V
    .locals 10

    .line 97
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v0

    iget v0, v0, Landroid/hardware/Camera$Size;->width:I

    .line 98
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v1

    iget v1, v1, Landroid/hardware/Camera$Size;->height:I

    int-to-double v2, v0

    int-to-double v4, v1

    div-double/2addr v2, v4

    .line 100
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getPictureSize()Landroid/hardware/Camera$Size;

    move-result-object v4

    iget v4, v4, Landroid/hardware/Camera$Size;->width:I

    .line 101
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getPictureSize()Landroid/hardware/Camera$Size;

    move-result-object p1

    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    int-to-double v5, v4

    int-to-double v7, p1

    div-double/2addr v5, v7

    const-string v7, "Preview AR: %1$f, w=%2$d, h=%3$d"

    const/4 v8, 0x3

    .line 103
    new-array v9, v8, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v9, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, v9, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    invoke-static {v7, v9}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Camera AR: %1$f, w=%2$d, h=%3$d"

    .line 104
    new-array v7, v8, [Ljava/lang/Object;

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    aput-object v5, v7, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v7, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v7, v1

    invoke-static {v0, v7}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    iget-object p1, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {p1}, Lcom/ibotta/android/hardware/Hardware;->getScreenSize()Landroid/graphics/Point;

    move-result-object p1

    const-string v0, "Screen width: %1$d"

    .line 107
    new-array v1, v2, [Ljava/lang/Object;

    iget v4, p1, Landroid/graphics/Point;->x:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Screen height: %1$d"

    .line 108
    new-array v1, v2, [Ljava/lang/Object;

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private getBestPictureSize(Landroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Size;
    .locals 12
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->getScreenSize()Landroid/graphics/Point;

    move-result-object v0

    .line 171
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 172
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 173
    iget-object v2, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v2}, Lcom/ibotta/android/state/app/config/AppConfig;->getPictureSizeBlacklist()Ljava/util/List;

    move-result-object v2

    .line 174
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object p1

    const/4 v3, 0x0

    if-eqz p1, :cond_4

    .line 178
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/Camera$Size;

    const-string v5, "Analyzing size: w=%1$d, h=%2$d"

    const/4 v6, 0x2

    .line 179
    new-array v7, v6, [Ljava/lang/Object;

    iget v8, v4, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    iget v8, v4, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v10, 0x1

    aput-object v8, v7, v10

    invoke-static {v5, v7}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    new-instance v5, Landroid/util/Pair;

    iget v7, v4, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget v8, v4, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-direct {v5, v7, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v2, :cond_0

    .line 182
    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "Size is blacklisted: w=%1$d, h=%2$d"

    .line 183
    new-array v6, v6, [Ljava/lang/Object;

    iget v7, v4, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v9

    iget v4, v4, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v6, v10

    invoke-static {v5, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 187
    :cond_0
    iget v5, v4, Landroid/hardware/Camera$Size;->width:I

    iget v7, v4, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 188
    iget v7, v4, Landroid/hardware/Camera$Size;->width:I

    iget v8, v4, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    if-lt v5, v1, :cond_1

    if-lt v7, v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-nez v3, :cond_2

    goto :goto_2

    .line 195
    :cond_2
    iget v7, v3, Landroid/hardware/Camera$Size;->width:I

    iget v8, v3, Landroid/hardware/Camera$Size;->height:I

    mul-int v7, v7, v8

    iget v8, v4, Landroid/hardware/Camera$Size;->width:I

    iget v11, v4, Landroid/hardware/Camera$Size;->height:I

    mul-int v8, v8, v11

    if-ge v7, v8, :cond_3

    if-eqz v5, :cond_3

    :goto_2
    move-object v3, v4

    :cond_3
    const-string v4, "Best size so far: w=%1$d, h=%2$d"

    .line 199
    new-array v5, v6, [Ljava/lang/Object;

    iget v6, v3, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v9

    iget v6, v3, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v10

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_4
    return-object v3
.end method

.method private initFlash(Landroid/hardware/Camera$Parameters;)V
    .locals 7

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->camera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    .line 222
    :cond_0
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 224
    iget-object v1, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v1}, Lcom/ibotta/android/profile/BuildProfile;->isDebugCamera()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    .line 225
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "Available flash mode: %1$s"

    .line 226
    new-array v6, v3, [Ljava/lang/Object;

    aput-object v4, v6, v2

    invoke-static {v5, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string v1, "off"

    .line 234
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "off"

    .line 235
    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-string v1, "auto"

    .line 236
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "auto"

    .line 237
    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    :cond_3
    :goto_1
    const-string v0, "Flash mode set to: %1$s"

    .line 240
    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

.method private initFocus(Landroid/hardware/Camera$Parameters;)V
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getReceiptFocusBlacklist()Ljava/util/List;

    move-result-object v0

    invoke-super {p0, p1, v0}, Lcom/ibotta/android/view/camera/CameraView;->initFocus(Landroid/hardware/Camera$Parameters;Ljava/util/List;)V

    .line 209
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object p1

    const-string v0, "continuous-picture"

    .line 210
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    .line 211
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    if-eqz v0, :cond_0

    .line 212
    new-instance v0, Lcom/ibotta/android/view/camera/-$$Lambda$ReceiptCameraView$2pqvA5ZPvHv3iMg1ZEVvN9jMbqo;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/view/camera/-$$Lambda$ReceiptCameraView$2pqvA5ZPvHv3iMg1ZEVvN9jMbqo;-><init>(Lcom/ibotta/android/view/camera/ReceiptCameraView;Z)V

    .line 213
    iget-object p1, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->handler:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private initPictureSize(Landroid/hardware/Camera$Parameters;)V
    .locals 5

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->camera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    .line 163
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->getBestPictureSize(Landroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Size;

    move-result-object v0

    const-string v1, "Best size is: w=%1$d, h=%2$d"

    const/4 v2, 0x2

    .line 164
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, v0, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget v4, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget v1, v0, Landroid/hardware/Camera$Size;->width:I

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {p1, v1, v0}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    return-void
.end method

.method private initPreviewSizeBestAR(Landroid/hardware/Camera$Parameters;)V
    .locals 13

    const-string v0, "initPreviewSizeBestAR"

    const/4 v1, 0x0

    .line 112
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->camera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    .line 117
    :cond_0
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v0

    .line 118
    iget-object v2, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-interface {v2, v3, v4}, Lcom/ibotta/android/util/AppHelper;->calcAspectRatio(FF)F

    move-result v2

    const/4 v3, 0x0

    const-string v4, "ReceiptCameraView size: w=%1$d, h=%2$d, ar=%3$f"

    const/4 v5, 0x3

    .line 121
    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->getWidth()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->getHeight()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x1

    aput-object v6, v5, v7

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const/4 v8, 0x2

    aput-object v6, v5, v8

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v0, :cond_5

    .line 124
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/Camera$Size;

    const-string v5, "Testing size: w=%1$d, h=%2$d"

    .line 125
    new-array v6, v8, [Ljava/lang/Object;

    iget v9, v4, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v6, v1

    iget v9, v4, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v6, v7

    invoke-static {v5, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v3, :cond_1

    move-object v3, v4

    goto :goto_0

    .line 131
    :cond_1
    iget-object v5, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget v6, v4, Landroid/hardware/Camera$Size;->width:I

    int-to-float v6, v6

    iget v9, v4, Landroid/hardware/Camera$Size;->height:I

    int-to-float v9, v9

    invoke-interface {v5, v6, v9}, Lcom/ibotta/android/util/AppHelper;->calcAspectRatio(FF)F

    move-result v5

    .line 132
    iget-object v6, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget v9, v3, Landroid/hardware/Camera$Size;->width:I

    int-to-float v9, v9

    iget v10, v3, Landroid/hardware/Camera$Size;->height:I

    int-to-float v10, v10

    invoke-interface {v6, v9, v10}, Lcom/ibotta/android/util/AppHelper;->calcAspectRatio(FF)F

    move-result v6

    sub-float v9, v5, v2

    .line 133
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v9

    sub-float v10, v6, v2

    .line 134
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    sub-float/2addr v6, v5

    .line 135
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v9, v9, v10

    if-gez v9, :cond_2

    const-string v3, "Size is best option so far: ar=%1$f"

    .line 138
    new-array v6, v7, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v6, v1

    invoke-static {v3, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    float-to-double v9, v6

    const-wide v11, 0x3fb999999999999aL    # 0.1

    cmpg-double v6, v9, v11

    if-gtz v6, :cond_4

    .line 140
    iget v6, v4, Landroid/hardware/Camera$Size;->width:I

    iget v9, v3, Landroid/hardware/Camera$Size;->width:I

    if-gt v6, v9, :cond_3

    iget v6, v4, Landroid/hardware/Camera$Size;->height:I

    iget v9, v3, Landroid/hardware/Camera$Size;->height:I

    if-le v6, v9, :cond_4

    :cond_3
    const-string v3, "Larger size with similar ar chosen: ar=%1$f"

    .line 142
    new-array v6, v7, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v6, v1

    invoke-static {v3, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    move-object v3, v4

    :cond_4
    const-string v4, "Best size so far: w=%1$d, h=%2$d"

    .line 146
    new-array v5, v8, [Ljava/lang/Object;

    iget v6, v3, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    iget v6, v3, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_5
    if-eqz v3, :cond_6

    const-string v0, "Best preview size is: w=%1$d, h=%2$d"

    .line 151
    new-array v2, v8, [Ljava/lang/Object;

    iget v4, v3, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v1

    iget v1, v3, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v2, v7

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    iget v0, v3, Landroid/hardware/Camera$Size;->width:I

    iget v1, v3, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {p1, v0, v1}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    goto :goto_2

    :cond_6
    const-string p1, "Using default preview size."

    .line 154
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method private initWhiteBalance(Landroid/hardware/Camera$Parameters;)V
    .locals 7

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->camera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    .line 249
    :cond_0
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedWhiteBalance()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 251
    iget-object v1, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v1}, Lcom/ibotta/android/profile/BuildProfile;->isDebugCamera()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    .line 252
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "Available w/b mode: %1$s"

    .line 253
    new-array v6, v3, [Ljava/lang/Object;

    aput-object v4, v6, v2

    invoke-static {v5, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string v1, "auto"

    .line 257
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "auto"

    .line 258
    invoke-virtual {p1, v0}, Landroid/hardware/Camera$Parameters;->setWhiteBalance(Ljava/lang/String;)V

    :cond_2
    const-string v0, "White balance mode set to: %1$s"

    .line 261
    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getWhiteBalance()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method private injectThis()V
    .locals 1

    .line 52
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/view/camera/ReceiptCameraView;)V

    return-void
.end method

.method public static synthetic lambda$initCamera$0(Lcom/ibotta/android/view/camera/ReceiptCameraView;I)V
    .locals 1

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/camera/ReceiptCameraView$ReceiptCameraListener;

    invoke-interface {v0, p1}, Lcom/ibotta/android/view/camera/ReceiptCameraView$ReceiptCameraListener;->onOrientationDetermined(I)V

    return-void
.end method

.method public static synthetic lambda$initFocus$1(Lcom/ibotta/android/view/camera/ReceiptCameraView;Z)V
    .locals 1

    .line 212
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/camera/ReceiptCameraView$ReceiptCameraListener;

    invoke-interface {v0, p1}, Lcom/ibotta/android/view/camera/ReceiptCameraView$ReceiptCameraListener;->onFocusDetermined(Z)V

    return-void
.end method


# virtual methods
.method public getCameraParameters()Landroid/hardware/Camera$Parameters;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->camera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected initCamera()V
    .locals 5

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->camera:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    return-void

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->activity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->camera:Landroid/hardware/Camera;

    invoke-static {v0, v1}, Lcom/ibotta/android/view/camera/OrientationHelper;->setCameraDisplayOrientation(Landroid/app/Activity;Landroid/hardware/Camera;)I

    move-result v0

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->getContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Lcom/ibotta/android/view/camera/CameraView$CameraListener;

    if-eqz v1, :cond_1

    .line 76
    new-instance v1, Lcom/ibotta/android/view/camera/-$$Lambda$ReceiptCameraView$m7n0-ZyqUIuRdBHRq-wMLMS2x3Q;

    invoke-direct {v1, p0, v0}, Lcom/ibotta/android/view/camera/-$$Lambda$ReceiptCameraView$m7n0-ZyqUIuRdBHRq-wMLMS2x3Q;-><init>(Lcom/ibotta/android/view/camera/ReceiptCameraView;I)V

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->handler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 80
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    .line 81
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->initPreviewSizeBestAR(Landroid/hardware/Camera$Parameters;)V

    .line 82
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->initPictureSize(Landroid/hardware/Camera$Parameters;)V

    .line 83
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->initFocus(Landroid/hardware/Camera$Parameters;)V

    .line 84
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->initFlash(Landroid/hardware/Camera$Parameters;)V

    .line 85
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->initWhiteBalance(Landroid/hardware/Camera$Parameters;)V

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->camera:Landroid/hardware/Camera;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    const-string v1, "Focus set to: %1$s"

    const/4 v2, 0x1

    .line 87
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->camera:Landroid/hardware/Camera;

    invoke-virtual {v4}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v4

    invoke-virtual {v4}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->getContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Lcom/ibotta/android/view/camera/ReceiptCameraView$ReceiptCameraListener;

    if-eqz v1, :cond_2

    .line 90
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/view/camera/ReceiptCameraView$ReceiptCameraListener;

    invoke-interface {v1, v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView$ReceiptCameraListener;->onCameraConfigured(Landroid/hardware/Camera$Parameters;)V

    .line 93
    :cond_2
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->debugConfiguration(Landroid/hardware/Camera$Parameters;)V

    return-void
.end method

.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 0

    .line 267
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/view/camera/CameraView;->onAutoFocus(ZLandroid/hardware/Camera;)V

    if-nez p1, :cond_0

    const-string p1, "receipt capture"

    .line 270
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/camera/ReceiptCameraView;->trackFocusFail(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setActivity(Landroid/app/Activity;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/view/camera/ReceiptCameraView;->activity:Landroid/app/Activity;

    return-void
.end method
