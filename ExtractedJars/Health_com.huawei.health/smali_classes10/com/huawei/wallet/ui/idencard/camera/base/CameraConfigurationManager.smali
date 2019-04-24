.class public Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Point;

.field private b:Landroid/graphics/Point;

.field private final c:Landroid/content/Context;

.field private d:I

.field e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/hardware/Camera$Size;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->c:Landroid/content/Context;

    .line 63
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->b:Landroid/graphics/Point;

    .line 64
    return-void
.end method

.method private a(Ljava/util/List;II)Landroid/graphics/Point;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/hardware/Camera$Size;>;II)Landroid/graphics/Point;"
        }
    .end annotation

    .line 191
    const-string v0, "CameraConfigurationManager"

    const-string v1, "enter get_Optimal_Preview_Size"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    const-wide v4, 0x3fb999999999999aL    # 0.1

    .line 193
    move/from16 v0, p2

    int-to-double v0, v0

    move/from16 v2, p3

    int-to-double v2, v2

    div-double v6, v0, v2

    .line 194
    if-nez p1, :cond_0

    .line 195
    const/4 v0, 0x0

    return-object v0

    .line 197
    :cond_0
    const/4 v8, 0x0

    .line 198
    const-wide v9, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 199
    move/from16 v11, p3

    .line 201
    const-string v0, "CameraConfigurationManager"

    const-string v1, "next again Loop,szie listSizes"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/hardware/Camera$Size;

    .line 204
    iget v0, v13, Landroid/hardware/Camera$Size;->width:I

    int-to-double v0, v0

    iget v2, v13, Landroid/hardware/Camera$Size;->height:I

    int-to-double v2, v2

    div-double v14, v0, v2

    .line 205
    sub-double v0, v14, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3fb999999999999aL    # 0.1

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 206
    goto :goto_0

    .line 207
    :cond_1
    iget v0, v13, Landroid/hardware/Camera$Size;->height:I

    sub-int/2addr v0, v11

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-double v0, v0

    cmpl-double v0, v9, v0

    if-lez v0, :cond_2

    .line 209
    move-object v8, v13

    .line 210
    iget v0, v13, Landroid/hardware/Camera$Size;->height:I

    sub-int/2addr v0, v11

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-double v9, v0

    .line 212
    :cond_2
    goto :goto_0

    .line 214
    :cond_3
    if-nez v8, :cond_5

    .line 216
    const-string v0, "CameraConfigurationManager"

    const-string v1, "judge optimalSize is null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    const-wide v9, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 218
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/hardware/Camera$Size;

    .line 220
    iget v0, v13, Landroid/hardware/Camera$Size;->height:I

    sub-int/2addr v0, v11

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-double v0, v0

    cmpl-double v0, v9, v0

    if-lez v0, :cond_4

    .line 222
    move-object v8, v13

    .line 223
    iget v0, v13, Landroid/hardware/Camera$Size;->height:I

    sub-int/2addr v0, v11

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-double v9, v0

    .line 225
    :cond_4
    goto :goto_1

    .line 228
    :cond_5
    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    .line 230
    const-string v0, "CameraConfigurationManager"

    const-string v1, "judge optimalSize is not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 231
    const-string v0, "CameraConfigurationManager"

    const-string v1, "exit getOptionmalPreviewSzie"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 232
    new-instance v0, Landroid/graphics/Point;

    iget v1, v8, Landroid/hardware/Camera$Size;->width:I

    iget v2, v8, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    return-object v0

    .line 236
    :cond_6
    const-string v0, "CameraConfigurationManager"

    const-string v1, "exit getOptionmalPreviewSzie"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 237
    const/4 v0, 0x0

    return-object v0
.end method

.method private d()Landroid/graphics/Point;
    .locals 13

    .line 115
    const/4 v7, 0x0

    .line 116
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->c:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/view/WindowManager;

    .line 121
    invoke-interface {v8}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v9

    .line 122
    new-instance v10, Landroid/util/DisplayMetrics;

    invoke-direct {v10}, Landroid/util/DisplayMetrics;-><init>()V

    .line 123
    invoke-virtual {v9, v10}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 125
    iget v5, v10, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 126
    iget v6, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 128
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-ge v0, v1, :cond_0

    .line 132
    :try_start_0
    const-class v0, Landroid/view/Display;

    const-string v1, "getRawHeight"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v9, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v5, v0

    .line 133
    const-class v0, Landroid/view/Display;

    const-string v1, "getRawWidth"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v9, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3

    move-result v0

    move v6, v0

    .line 150
    goto/16 :goto_0

    .line 135
    :catch_0
    move-exception v11

    .line 137
    const-string v0, "getRealScreenSize exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 150
    goto/16 :goto_0

    .line 139
    :catch_1
    move-exception v11

    .line 141
    const-string v0, "getRealScreenSize exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 150
    goto/16 :goto_0

    .line 143
    :catch_2
    move-exception v11

    .line 145
    const-string v0, "getRealScreenSize exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 150
    goto :goto_0

    .line 147
    :catch_3
    move-exception v11

    .line 149
    const-string v0, "getRealScreenSize exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 150
    goto :goto_0

    .line 153
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    .line 155
    new-instance v11, Landroid/graphics/Point;

    invoke-direct {v11}, Landroid/graphics/Point;-><init>()V

    .line 158
    :try_start_1
    const-class v0, Landroid/view/Display;

    const-string v1, "getRealSize"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Landroid/graphics/Point;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v11, v1, v2

    invoke-virtual {v0, v9, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    iget v0, v11, Landroid/graphics/Point;->y:I

    move v5, v0

    .line 160
    iget v0, v11, Landroid/graphics/Point;->x:I
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_7

    move v6, v0

    .line 177
    goto :goto_0

    .line 162
    :catch_4
    move-exception v12

    .line 164
    const-string v0, "getRealScreenSize exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 177
    goto :goto_0

    .line 166
    :catch_5
    move-exception v12

    .line 168
    const-string v0, "getRealScreenSize exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 177
    goto :goto_0

    .line 170
    :catch_6
    move-exception v12

    .line 172
    const-string v0, "getRealScreenSize exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 177
    goto :goto_0

    .line 174
    :catch_7
    move-exception v12

    .line 176
    const-string v0, "getRealScreenSize exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 180
    :cond_1
    :goto_0
    new-instance v7, Landroid/graphics/Point;

    invoke-direct {v7, v6, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 181
    return-object v7
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 78
    iget v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->d:I

    return v0
.end method

.method public a(Landroid/hardware/Camera;)I
    .locals 6

    .line 262
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    .line 263
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I

    move-result v3

    .line 264
    invoke-static {v3}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v0

    div-int/lit8 v4, v0, 0x8

    .line 265
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->b:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->b:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    mul-int/2addr v0, v1

    mul-int/2addr v0, v4

    mul-int/lit8 v5, v0, 0x3

    .line 266
    return v5
.end method

.method public b(Landroid/hardware/Camera;)V
    .locals 4

    .line 90
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v3

    .line 91
    invoke-virtual {v3}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I

    move-result v0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->d:I

    .line 93
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->d()Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->a:Landroid/graphics/Point;

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Screen resolution: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->a:Landroid/graphics/Point;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 96
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->e:Ljava/util/List;

    .line 97
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->a:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->a:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    if-le v0, v1, :cond_0

    .line 99
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->a:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    mul-int/lit8 v1, v1, 0x4

    div-int/lit8 v1, v1, 0x3

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->a:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->x:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->a(Ljava/util/List;II)Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->b:Landroid/graphics/Point;

    goto :goto_0

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->a:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    mul-int/lit8 v1, v1, 0x4

    div-int/lit8 v1, v1, 0x3

    iget-object v2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->a:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->a(Ljava/util/List;II)Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->b:Landroid/graphics/Point;

    .line 105
    :goto_0
    return-void
.end method

.method public c()Landroid/graphics/Point;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->b:Landroid/graphics/Point;

    return-object v0
.end method

.method public c(Landroid/app/Activity;ILandroid/hardware/Camera;)V
    .locals 6

    .line 279
    const-string v0, "CameraConfigurationManager"

    const-string v1, "enter setCameraDisplayOrientation"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 280
    new-instance v2, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v2}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 281
    invoke-static {p2, v2}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 282
    const-string v0, "CameraConfigurationManager"

    const-string v1, "enter"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 283
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v3

    .line 284
    const/4 v4, 0x0

    .line 285
    const-string v0, "CameraConfigurationManager"

    const-string v1, "next again switch"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 286
    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 289
    :pswitch_0
    const-string v0, "CameraConfigurationManager"

    const-string v1, "Surface.ROTATION_0"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 290
    const/4 v4, 0x0

    .line 291
    goto :goto_1

    .line 293
    :pswitch_1
    const-string v0, "CameraConfigurationManager"

    const-string v1, "Surface.ROTATION_90"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 294
    const/16 v4, 0x5a

    .line 295
    goto :goto_1

    .line 297
    :pswitch_2
    const-string v0, "CameraConfigurationManager"

    const-string v1, "Surface.ROTATION_180"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 298
    const/16 v4, 0xb4

    .line 299
    goto :goto_1

    .line 301
    :pswitch_3
    const-string v0, "CameraConfigurationManager"

    const-string v1, "Surface.ROTATION_270"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 302
    const/16 v4, 0x10e

    .line 303
    goto :goto_1

    .line 305
    :goto_0
    const-string v0, "CameraConfigurationManager"

    const-string v1, "default"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 306
    const/4 v4, 0x0

    .line 309
    :goto_1
    const-string v0, "CameraConfigurationManager"

    const-string v1, "next int"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 311
    iget v0, v2, Landroid/hardware/Camera$CameraInfo;->facing:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 313
    const-string v0, "CameraConfigurationManager"

    const-string v1, "judgeCAMERA_FACING_FRONT "

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 314
    iget v0, v2, Landroid/hardware/Camera$CameraInfo;->orientation:I

    add-int/2addr v0, v4

    rem-int/lit16 v5, v0, 0x168

    .line 315
    rsub-int v0, v5, 0x168

    rem-int/lit16 v5, v0, 0x168

    .line 316
    const-string v0, "CameraConfigurationManager"

    const-string v1, "finish judge"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 320
    :cond_0
    const-string v0, "CameraConfigurationManager"

    const-string v1, "enter else"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 322
    iget v0, v2, Landroid/hardware/Camera$CameraInfo;->orientation:I

    sub-int/2addr v0, v4

    add-int/lit16 v0, v0, 0x168

    rem-int/lit16 v5, v0, 0x168

    .line 324
    :goto_2
    const-string v0, "CameraConfigurationManager"

    const-string v1, "exit"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 325
    invoke-virtual {p3, v5}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    .line 326
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public d(Landroid/hardware/Camera;)V
    .locals 3

    .line 248
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Setting preview size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->b:Landroid/graphics/Point;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 250
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->b:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/CameraConfigurationManager;->b:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-virtual {v2, v0, v1}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 251
    invoke-virtual {p1, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 252
    return-void
.end method
