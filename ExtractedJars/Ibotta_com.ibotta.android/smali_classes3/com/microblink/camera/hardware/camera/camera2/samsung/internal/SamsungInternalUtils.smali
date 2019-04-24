.class public Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;
.super Ljava/lang/Object;


# static fields
.field private static final KEY_MAKER_NAME:Ljava/lang/String; = "com.samsung.android.sdk.camera.impl.internal.KeyMaker"

.field private static VERSION_CODE:I = 0x1

.field private static mClassLoader:Ljava/lang/ClassLoader;

.field private static mKeyMakerMethod:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    invoke-static {}, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungUtils;->isSamsungDevice()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ldalvik/system/PathClassLoader;

    const-string v1, "/system/framework/scamera_sdk_util.jar"

    const-class v2, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ldalvik/system/PathClassLoader;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->mClassLoader:Ljava/lang/ClassLoader;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "com.samsung.android.sdk.camera.impl.internal.KeyMaker"

    sget-object v3, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->mClassLoader:Ljava/lang/ClassLoader;

    const/4 v4, 0x1

    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "createKey"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Class;

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v5, v1

    const-class v6, [Ljava/lang/Object;

    aput-object v6, v5, v4

    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->mKeyMakerMethod:Ljava/lang/reflect/Method;

    const-class v2, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;

    const-string v3, "Key Maker createKey Impl. from preloaded jar."

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-class v2, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;

    const-string v3, "No Key Maker createKey Impl. Fallback to embedded one."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v3, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->mKeyMakerMethod:Ljava/lang/reflect/Method;

    goto :goto_0

    :catch_1
    const-class v2, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;

    const-string v3, "No Key Maker createKey Impl. Fallback to embedded one."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v3, v1}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->mKeyMakerMethod:Ljava/lang/reflect/Method;

    :cond_0
    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createCameraCharacteristicsKey(Ljava/lang/String;Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;)Landroid/hardware/camera2/CameraCharacteristics$Key;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK<",
            "TT;>;)",
            "Landroid/hardware/camera2/CameraCharacteristics$Key<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungUtils;->isSamsungDevice()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->mKeyMakerMethod:Ljava/lang/reflect/Method;

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-nez v0, :cond_1

    :try_start_0
    sget v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->VERSION_CODE:I

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v5

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;->getType()Ljava/lang/reflect/Type;

    move-result-object p0

    aput-object p0, v2, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v4

    invoke-static {v0, v2}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->createKey(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/hardware/camera2/CameraCharacteristics$Key;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    :goto_0
    const-class p1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;

    const-string v0, "Fail to create Camera Key."

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {p1, p0, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_1
    :try_start_1
    new-array v6, v4, [Ljava/lang/Object;

    sget v7, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->VERSION_CODE:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v5

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v5

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;->getType()Ljava/lang/reflect/Type;

    move-result-object p0

    aput-object p0, v2, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v4

    aput-object v2, v6, v3

    invoke-virtual {v0, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/hardware/camera2/CameraCharacteristics$Key;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    goto :goto_0

    :catch_3
    move-exception p0

    goto :goto_0
.end method

.method public static createCameraCharacteristicsKey(Ljava/lang/String;Ljava/lang/Class;)Landroid/hardware/camera2/CameraCharacteristics$Key;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Landroid/hardware/camera2/CameraCharacteristics$Key<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;->createSpecializedTypeReference(Ljava/lang/Class;)Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->createCameraCharacteristicsKey(Ljava/lang/String;Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;)Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object p0

    return-object p0
.end method

.method public static createCaptureRequestKey(Ljava/lang/String;Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;)Landroid/hardware/camera2/CaptureRequest$Key;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK<",
            "TT;>;)",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungUtils;->isSamsungDevice()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->mKeyMakerMethod:Ljava/lang/reflect/Method;

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v0, :cond_1

    :try_start_0
    sget v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->VERSION_CODE:I

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v5

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;->getType()Ljava/lang/reflect/Type;

    move-result-object p0

    aput-object p0, v2, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v3

    invoke-static {v0, v2}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->createKey(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/hardware/camera2/CaptureRequest$Key;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-class p1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;

    const-string v0, "Failed to create Camera Key"

    :goto_0
    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {p1, p0, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_1
    :try_start_1
    new-array v6, v3, [Ljava/lang/Object;

    sget v7, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->VERSION_CODE:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v5

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v5

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;->getType()Ljava/lang/reflect/Type;

    move-result-object p0

    aput-object p0, v2, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v3

    aput-object v2, v6, v4

    invoke-virtual {v0, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/hardware/camera2/CaptureRequest$Key;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    goto :goto_1

    :catch_3
    move-exception p0

    :goto_1
    const-class p1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;

    const-string v0, "Fail to create Camera Key."

    goto :goto_0
.end method

.method public static createCaptureRequestKey(Ljava/lang/String;Ljava/lang/Class;)Landroid/hardware/camera2/CaptureRequest$Key;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;->createSpecializedTypeReference(Ljava/lang/Class;)Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->createCaptureRequestKey(Ljava/lang/String;Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;)Landroid/hardware/camera2/CaptureRequest$Key;

    move-result-object p0

    return-object p0
.end method

.method public static createCaptureResultKey(Ljava/lang/String;Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;)Landroid/hardware/camera2/CaptureResult$Key;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK<",
            "TT;>;)",
            "Landroid/hardware/camera2/CaptureResult$Key<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Lcom/microblink/camera/hardware/camera/camera2/samsung/SamsungUtils;->isSamsungDevice()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->mKeyMakerMethod:Ljava/lang/reflect/Method;

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-nez v0, :cond_1

    :try_start_0
    sget v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->VERSION_CODE:I

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v4

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;->getType()Ljava/lang/reflect/Type;

    move-result-object p0

    aput-object p0, v2, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v5

    invoke-static {v0, v2}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->createKey(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/hardware/camera2/CaptureResult$Key;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string p1, "ContentValues"

    const-string v0, "Fail to create Camera Key."

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {p1, p0, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_1
    :try_start_1
    new-array v6, v5, [Ljava/lang/Object;

    sget v7, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->VERSION_CODE:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v4

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v4

    invoke-virtual {p1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;->getType()Ljava/lang/reflect/Type;

    move-result-object p0

    aput-object p0, v2, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v2, v5

    aput-object v2, v6, v3

    invoke-virtual {v0, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/hardware/camera2/CaptureResult$Key;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    goto :goto_0

    :catch_3
    move-exception p0

    :goto_0
    const-string p1, "ContentValues"

    const-string v0, "Fail to create Camera Key."

    new-array v2, v3, [Ljava/lang/Object;

    aput-object p0, v2, v4

    invoke-static {p1, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1
.end method

.method public static createCaptureResultKey(Ljava/lang/String;Ljava/lang/Class;)Landroid/hardware/camera2/CaptureResult$Key;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Landroid/hardware/camera2/CaptureResult$Key<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;->createSpecializedTypeReference(Ljava/lang/Class;)Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/SamsungInternalUtils;->createCaptureResultKey(Ljava/lang/String;Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/TypeReferenceForSDK;)Landroid/hardware/camera2/CaptureResult$Key;

    move-result-object p0

    return-object p0
.end method
