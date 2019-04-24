.class Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;
.super Ljava/lang/Object;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# static fields
.field static final KEY_CAPTURE_REQUEST:I = 0x1

.field static final KEY_CAPTURE_RESULT:I = 0x2

.field static final KEY_CHARACTERISTIC:I

.field private static mCameraCharacteristicsKeyConstructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field private static mCaptureRequestKeyConstructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field private static mCaptureResultKeyConstructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field private static mCreateSpecializedTypeReference:Ljava/lang/reflect/Method;

.field private static mTypeReferenceClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "android.hardware.camera2.utils.TypeReference"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mTypeReferenceClass:Ljava/lang/Class;

    const-string v2, "createSpecializedTypeReference"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    const-class v5, Ljava/lang/reflect/Type;

    aput-object v5, v4, v0

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mCreateSpecializedTypeReference:Ljava/lang/reflect/Method;

    const-class v1, Landroid/hardware/camera2/CameraCharacteristics$Key;

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/Class;

    const-class v5, Ljava/lang/String;

    aput-object v5, v4, v0

    sget-object v5, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mTypeReferenceClass:Ljava/lang/Class;

    aput-object v5, v4, v3

    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    sput-object v1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mCameraCharacteristicsKeyConstructor:Ljava/lang/reflect/Constructor;

    const-class v1, Landroid/hardware/camera2/CaptureRequest$Key;

    new-array v4, v2, [Ljava/lang/Class;

    const-class v5, Ljava/lang/String;

    aput-object v5, v4, v0

    sget-object v5, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mTypeReferenceClass:Ljava/lang/Class;

    aput-object v5, v4, v3

    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    sput-object v1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mCaptureRequestKeyConstructor:Ljava/lang/reflect/Constructor;

    const-class v1, Landroid/hardware/camera2/CaptureResult$Key;

    new-array v2, v2, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    aput-object v4, v2, v0

    sget-object v4, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mTypeReferenceClass:Ljava/lang/Class;

    aput-object v4, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    sput-object v1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mCaptureResultKeyConstructor:Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    const-class v2, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;

    const-string v3, "Failed to find desired method!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, v3, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v1

    const-class v2, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;

    const-string v3, "Failed to find desired class!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, v3, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static createKey(I[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_4

    array-length p0, p1

    const/4 v0, 0x3

    if-lt p0, v0, :cond_4

    const/4 p0, 0x0

    aget-object v0, p1, p0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v2, p1, v1

    check-cast v2, Ljava/lang/reflect/Type;

    const/4 v3, 0x2

    aget-object p1, p1, v3

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget-object v4, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mCreateSpecializedTypeReference:Ljava/lang/reflect/Method;

    const/4 v5, 0x0

    if-nez v4, :cond_0

    const-class p1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;

    const-string v0, "Unable to invoke method createSpecializedTypeReference"

    new-array p0, p0, [Ljava/lang/Object;

    invoke-static {p1, v0, p0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v5

    :cond_0
    :try_start_0
    new-array v6, v1, [Ljava/lang/Object;

    aput-object v2, v6, p0

    invoke-virtual {v4, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    packed-switch p1, :pswitch_data_0

    return-object v5

    :pswitch_0
    sget-object p1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mCaptureResultKeyConstructor:Ljava/lang/reflect/Constructor;

    if-eqz p1, :cond_1

    sget-object p1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mCaptureResultKeyConstructor:Ljava/lang/reflect/Constructor;

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, p0

    aput-object v2, v3, v1

    invoke-virtual {p1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v5

    :pswitch_1
    sget-object p1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mCaptureRequestKeyConstructor:Ljava/lang/reflect/Constructor;

    if-eqz p1, :cond_2

    sget-object p1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mCaptureRequestKeyConstructor:Ljava/lang/reflect/Constructor;

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, p0

    aput-object v2, v3, v1

    invoke-virtual {p1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v5

    :pswitch_2
    sget-object p1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mCameraCharacteristicsKeyConstructor:Ljava/lang/reflect/Constructor;

    if-eqz p1, :cond_3

    sget-object p1, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;->mCameraCharacteristicsKeyConstructor:Ljava/lang/reflect/Constructor;

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, p0

    aput-object v2, v3, v1

    invoke-virtual {p1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_3
    return-object v5

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    const-class v0, Lcom/microblink/camera/hardware/camera/camera2/samsung/internal/KeyMakerEmbed;

    const-string v1, "Failed to invoke reflection method!"

    new-array p0, p0, [Ljava/lang/Object;

    invoke-static {v0, p1, v1, p0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v5

    :cond_4
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "Illegal arguments to createKey"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
