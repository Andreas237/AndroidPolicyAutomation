.class public final Lcom/microblink/RecognizerCompatibility;
.super Ljava/lang/Object;


# static fields
.field private static supportStatus:Lcom/microblink/RecognizerCompatibilityStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/InstantiationError;

    const-string v1, "RecognizerCompatibility constructor can\'t be called!"

    invoke-direct {v0, v1}, Ljava/lang/InstantiationError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static calculateCompatibility(Landroid/content/Context;)V
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->ensureNativeLibraryLoaded()V

    new-instance v1, Lcom/microblink/camera/hardware/DeviceManager;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/microblink/camera/hardware/DeviceManager;-><init>(Landroid/content/Context;Z)V

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->isProcessorCompatible()Z

    move-result p0

    if-nez p0, :cond_0

    const-class p0, Lcom/microblink/RecognizerCompatibility;

    const-string v1, "Device has ARMv7 processor without NEON support. These processors are not supported!"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p0, Lcom/microblink/RecognizerCompatibilityStatus;->PROCESSOR_ARCHITECTURE_NOT_SUPPORTED:Lcom/microblink/RecognizerCompatibilityStatus;

    sput-object p0, Lcom/microblink/RecognizerCompatibility;->supportStatus:Lcom/microblink/RecognizerCompatibilityStatus;

    return-void

    :cond_0
    invoke-virtual {v1}, Lcom/microblink/camera/hardware/DeviceManager;->isDeviceOnBlackList()Z

    move-result p0

    if-eqz p0, :cond_1

    const-class p0, Lcom/microblink/RecognizerCompatibility;

    const-string v1, "Device is blacklisted, so it is not supported!"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p0, Lcom/microblink/RecognizerCompatibilityStatus;->DEVICE_BLACKLISTED:Lcom/microblink/RecognizerCompatibilityStatus;

    sput-object p0, Lcom/microblink/RecognizerCompatibility;->supportStatus:Lcom/microblink/RecognizerCompatibilityStatus;

    return-void

    :cond_1
    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getSdkVersion()I

    move-result p0

    const/16 v2, 0x10

    if-ge p0, v2, :cond_2

    const-class p0, Lcom/microblink/RecognizerCompatibility;

    const-string v1, "Device is running an unsupported Android version!"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p0, Lcom/microblink/RecognizerCompatibilityStatus;->UNSUPPORTED_ANDROID_VERSION:Lcom/microblink/RecognizerCompatibilityStatus;

    sput-object p0, Lcom/microblink/RecognizerCompatibility;->supportStatus:Lcom/microblink/RecognizerCompatibilityStatus;

    return-void

    :cond_2
    invoke-virtual {v1}, Lcom/microblink/camera/hardware/DeviceManager;->deviceHasCamera()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lcom/microblink/RecognizerCompatibilityStatus;->RECOGNIZER_SUPPORTED:Lcom/microblink/RecognizerCompatibilityStatus;

    sput-object p0, Lcom/microblink/RecognizerCompatibility;->supportStatus:Lcom/microblink/RecognizerCompatibilityStatus;

    return-void

    :cond_3
    const-class p0, Lcom/microblink/RecognizerCompatibility;

    const-string v1, "Device does not have a camera"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p0, Lcom/microblink/RecognizerCompatibilityStatus;->NO_CAMERA:Lcom/microblink/RecognizerCompatibilityStatus;

    sput-object p0, Lcom/microblink/RecognizerCompatibility;->supportStatus:Lcom/microblink/RecognizerCompatibilityStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-class v1, Lcom/microblink/RecognizerCompatibility;

    const-string v2, "Unable to load native library. Native recognizer will not be supported!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p0, v2, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p0, Lcom/microblink/RecognizerCompatibilityStatus;->PROCESSOR_ARCHITECTURE_NOT_SUPPORTED:Lcom/microblink/RecognizerCompatibilityStatus;

    sput-object p0, Lcom/microblink/RecognizerCompatibility;->supportStatus:Lcom/microblink/RecognizerCompatibilityStatus;

    return-void
.end method

.method public static defaultRegionOfInterest()Landroid/graphics/RectF;
    .locals 5

    new-instance v0, Landroid/graphics/RectF;

    const v1, 0x3d4ccccd    # 0.05f

    const v2, 0x3dcccccd    # 0.1f

    const v3, 0x3f733333    # 0.95f

    const v4, 0x3f666666    # 0.9f

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v0
.end method

.method static recognizerCompatibilityStatus(Landroid/content/Context;)Lcom/microblink/RecognizerCompatibilityStatus;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/microblink/RecognizerCompatibility;->supportStatus:Lcom/microblink/RecognizerCompatibilityStatus;

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/microblink/RecognizerCompatibility;->calculateCompatibility(Landroid/content/Context;)V

    :cond_0
    sget-object p0, Lcom/microblink/RecognizerCompatibility;->supportStatus:Lcom/microblink/RecognizerCompatibilityStatus;

    return-object p0
.end method
