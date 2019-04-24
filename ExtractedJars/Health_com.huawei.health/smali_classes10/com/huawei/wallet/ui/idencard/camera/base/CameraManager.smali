.class public final Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic b:Z

.field private static c:Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

.field private static final l:[B


# instance fields
.field private final a:Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

.field private d:Landroid/hardware/Camera;

.field private final e:Landroid/content/Context;

.field private f:I

.field private g:Z

.field private h:[B

.field private i:Z

.field private final k:Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;

.field private final m:Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;

.field private p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const-class v0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->b:Z

    .line 63
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->l:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->p:Z

    .line 72
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e:Landroid/content/Context;

    .line 73
    new-instance v0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->a:Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    .line 75
    new-instance v0, Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;

    invoke-direct {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->k:Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;

    .line 76
    new-instance v0, Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;

    invoke-direct {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->m:Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;

    .line 77
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 4

    .line 87
    sget-object v2, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->l:[B

    monitor-enter v2

    .line 89
    :try_start_0
    sget-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->c:Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 91
    new-instance v0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    invoke-direct {v0, p0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->c:Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 94
    :goto_0
    return-void
.end method

.method private c(Landroid/view/SurfaceHolder;)Z
    .locals 7

    .line 328
    sget-boolean v0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->b:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 329
    :cond_0
    sget-boolean v0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->b:Z

    if-nez v0, :cond_1

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 330
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "surfaceFrame: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 332
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->p:Z

    if-eqz v0, :cond_2

    .line 337
    :try_start_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 349
    goto :goto_0

    .line 339
    :catch_0
    move-exception v6

    .line 343
    const-string v0, "can\'t set preview display"

    move-object v1, v6

    const-string v2, "CameraManager.makePreviewGo"

    .line 345
    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 343
    const v2, 0x36118615

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V

    .line 348
    const/4 v0, 0x0

    return v0

    .line 351
    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;
    .locals 3

    .line 104
    sget-object v1, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->l:[B

    monitor-enter v1

    .line 105
    :try_start_0
    sget-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->c:Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 106
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private f()Landroid/hardware/Camera;
    .locals 5

    .line 129
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v2

    .line 130
    if-nez v2, :cond_0

    .line 132
    const-string v0, "No cameras!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 133
    const/4 v0, 0x0

    return-object v0

    .line 136
    :cond_0
    const/4 v3, 0x0

    .line 137
    :goto_0
    if-ge v3, v2, :cond_2

    .line 139
    new-instance v4, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v4}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 140
    invoke-static {v3, v4}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 141
    iget v0, v4, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-nez v0, :cond_1

    .line 143
    goto :goto_1

    .line 145
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 146
    goto :goto_0

    .line 149
    :cond_2
    :goto_1
    if-ge v3, v2, :cond_3

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Opening camera #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 152
    invoke-static {v3}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v4

    .line 153
    iput v3, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->f:I

    goto :goto_2

    .line 157
    :cond_3
    const-string v0, "No camera facing back; returning camera #0"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 158
    const/4 v0, 0x0

    invoke-static {v0}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v4

    .line 159
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->f:I

    .line 162
    :goto_2
    return-object v4
.end method

.method private g()Z
    .locals 3

    .line 233
    const-string v0, "prepareScanner()"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 234
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->p:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    if-nez v0, :cond_2

    .line 237
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->i()Landroid/hardware/Camera;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    .line 239
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    .line 241
    const-string v0, "prepare scanner couldn\'t connect to camera!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 242
    const/4 v0, 0x0

    return v0

    .line 246
    :cond_0
    const-string v0, "camera is connected"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 251
    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->i:Z

    if-nez v0, :cond_1

    .line 253
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->i:Z

    .line 254
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->a:Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->b(Landroid/hardware/Camera;)V

    .line 256
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->a:Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->d(Landroid/hardware/Camera;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 265
    goto :goto_0

    .line 258
    :catch_0
    move-exception v2

    .line 261
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    .line 262
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->i:Z

    .line 263
    const-string v0, "mCamera initParameters error"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 264
    const/4 v0, 0x0

    return v0

    .line 267
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->p:Z

    if-nez v0, :cond_3

    .line 269
    const-string v0, "useCamera is false!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 270
    const/4 v0, 0x0

    return v0

    .line 272
    :cond_3
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    if-eqz v0, :cond_4

    .line 274
    const-string v0, "we already have a camera instance."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 276
    :cond_4
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private i()Landroid/hardware/Camera;
    .locals 7

    .line 173
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->p:Z

    if-eqz v0, :cond_0

    .line 177
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->f()Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v6

    .line 178
    return-object v6

    .line 180
    :catch_0
    move-exception v6

    .line 184
    const-string v0, "RuntimeException while open camera."

    move-object v1, v6

    const-string v2, "CameraManager.connectToCamera"

    .line 186
    invoke-virtual {v6}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 184
    const v2, 0x3611862a

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V

    .line 197
    goto :goto_0

    .line 189
    :catch_1
    move-exception v6

    .line 193
    const-string v0, "Unexpected exception. Please report it to support@card.io"

    move-object v1, v6

    const-string v2, "CameraManager.connectToCamera"

    .line 195
    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 193
    const v2, 0x36118614

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V

    .line 199
    :cond_0
    :goto_0
    const-string v0, "camera connect error."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 200
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 361
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->b(Z)Z

    .line 362
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 364
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 365
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->h:[B

    .line 366
    const-string v0, "- released camera"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 367
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    .line 369
    :cond_0
    const-string v0, "scan paused"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 370
    return-void
.end method

.method public a(Landroid/os/Handler;I)V
    .locals 2

    .line 477
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->g:Z

    if-eqz v0, :cond_0

    .line 479
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->k:Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;->e(Landroid/os/Handler;I)V

    .line 480
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->k:Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    .line 482
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 392
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->g:Z

    if-nez v0, :cond_0

    .line 394
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    .line 395
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->g:Z

    .line 397
    :cond_0
    return-void
.end method

.method public b(Landroid/view/SurfaceHolder;Landroid/app/Activity;)Z
    .locals 3

    .line 288
    const-string v0, "resumeScanning"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 289
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    if-nez v0, :cond_0

    .line 291
    const-string v0, "preparing the scanner..."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 292
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->g()Z

    .line 293
    const-string v0, "preparations complete"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 295
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->p:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    if-nez v0, :cond_1

    .line 297
    const-string v0, "null camera. failure"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 298
    const/4 v0, 0x0

    return v0

    .line 301
    :cond_1
    sget-boolean v0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->b:Z

    if-nez v0, :cond_2

    if-nez p1, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 303
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->p:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->h:[B

    if-nez v0, :cond_3

    .line 305
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->a:Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->a(Landroid/hardware/Camera;)I

    move-result v2

    .line 306
    new-array v0, v2, [B

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->h:[B

    .line 307
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->h:[B

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    .line 310
    :cond_3
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->p:Z

    if-eqz v0, :cond_4

    .line 312
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->k:Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    .line 314
    :cond_4
    invoke-virtual {p0, p2}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e(Landroid/app/Activity;)V

    .line 315
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->c(Landroid/view/SurfaceHolder;)Z

    .line 316
    const/4 v0, 0x1

    return v0
.end method

.method public b(Z)Z
    .locals 3

    .line 450
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    .line 452
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setFlashOn: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 455
    :try_start_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    .line 456
    if-eqz p1, :cond_0

    const-string v0, "torch"

    goto :goto_0

    :cond_0
    const-string v0, "off"

    :goto_0
    invoke-virtual {v2, v0}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    invoke-virtual {v0, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 458
    const/4 v0, 0x1

    return v0

    .line 460
    :catch_0
    move-exception v2

    .line 462
    const-string v0, "Could not set flash mode: "

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 465
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public c()Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->a:Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    return-object v0
.end method

.method public d()V
    .locals 1

    .line 379
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    .line 381
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->a()V

    .line 383
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->h:[B

    .line 384
    return-void
.end method

.method public d(Landroid/os/Handler;I)V
    .locals 3

    .line 493
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->g:Z

    if-eqz v0, :cond_0

    .line 495
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->m:Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;->e(Landroid/os/Handler;I)V

    .line 499
    :try_start_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->m:Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 504
    goto :goto_0

    .line 501
    :catch_0
    move-exception v2

    .line 503
    const-string v0, "requestAutoFocus autofocus failed"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 506
    :cond_0
    :goto_0
    return-void
.end method

.method public e(Landroid/app/Activity;)V
    .locals 3

    .line 220
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->a:Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->a:Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->f:I

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    invoke-virtual {v0, p1, v1, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->c(Landroid/app/Activity;ILandroid/hardware/Camera;)V

    .line 224
    :cond_0
    return-void
.end method

.method public h()V
    .locals 3

    .line 405
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->g:Z

    if-eqz v0, :cond_0

    .line 407
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->h:[B

    .line 408
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    .line 409
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 410
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->k:Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;->e(Landroid/os/Handler;I)V

    .line 411
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->m:Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;->e(Landroid/os/Handler;I)V

    .line 412
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->g:Z

    .line 414
    :cond_0
    return-void
.end method

.method public k()Z
    .locals 3

    .line 433
    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->p:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 435
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 437
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    .line 438
    const-string v0, "torch"

    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
