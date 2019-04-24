.class public final enum Lcom/microblink/camera/view/NotSupportedReason;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/camera/view/NotSupportedReason;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/camera/view/NotSupportedReason;

.field public static final enum BLACKLISTED_DEVICE:Lcom/microblink/camera/view/NotSupportedReason;

.field public static final enum CUSTOM_UI_FORBIDDEN:Lcom/microblink/camera/view/NotSupportedReason;

.field public static final enum INVALID_LICENSE_KEY:Lcom/microblink/camera/view/NotSupportedReason;

.field public static final enum NO_AUTOFOCUS_CAMERA:Lcom/microblink/camera/view/NotSupportedReason;

.field public static final enum NO_CAMERA:Lcom/microblink/camera/view/NotSupportedReason;

.field public static final enum UNSUPPORTED_ANDROID_VERSION:Lcom/microblink/camera/view/NotSupportedReason;

.field public static final enum UNSUPPORTED_PROCESSOR_ARCHITECTURE:Lcom/microblink/camera/view/NotSupportedReason;


# instance fields
.field private mDescription:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/microblink/camera/view/NotSupportedReason;

    const-string v1, "UNSUPPORTED_ANDROID_VERSION"

    const-string v2, "Current Android version is not supported. SDK requires newer version of Android."

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/microblink/camera/view/NotSupportedReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/microblink/camera/view/NotSupportedReason;->UNSUPPORTED_ANDROID_VERSION:Lcom/microblink/camera/view/NotSupportedReason;

    new-instance v0, Lcom/microblink/camera/view/NotSupportedReason;

    const-string v1, "NO_CAMERA"

    const-string v2, "Device does not have camera."

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/microblink/camera/view/NotSupportedReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/microblink/camera/view/NotSupportedReason;->NO_CAMERA:Lcom/microblink/camera/view/NotSupportedReason;

    new-instance v0, Lcom/microblink/camera/view/NotSupportedReason;

    const-string v1, "NO_AUTOFOCUS_CAMERA"

    const-string v2, "Selected recognizer configuration requires camera with autofocus and selected camera does not support it."

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/microblink/camera/view/NotSupportedReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/microblink/camera/view/NotSupportedReason;->NO_AUTOFOCUS_CAMERA:Lcom/microblink/camera/view/NotSupportedReason;

    new-instance v0, Lcom/microblink/camera/view/NotSupportedReason;

    const-string v1, "BLACKLISTED_DEVICE"

    const-string v2, "Device is blacklisted."

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/microblink/camera/view/NotSupportedReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/microblink/camera/view/NotSupportedReason;->BLACKLISTED_DEVICE:Lcom/microblink/camera/view/NotSupportedReason;

    new-instance v0, Lcom/microblink/camera/view/NotSupportedReason;

    const-string v1, "INVALID_LICENSE_KEY"

    const-string v2, "License key entered is invalid for current recognizer configuration."

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/microblink/camera/view/NotSupportedReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/microblink/camera/view/NotSupportedReason;->INVALID_LICENSE_KEY:Lcom/microblink/camera/view/NotSupportedReason;

    new-instance v0, Lcom/microblink/camera/view/NotSupportedReason;

    const-string v1, "CUSTOM_UI_FORBIDDEN"

    const-string v2, "Entered license key does not allow using SDK outside of default provided activities."

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/microblink/camera/view/NotSupportedReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/microblink/camera/view/NotSupportedReason;->CUSTOM_UI_FORBIDDEN:Lcom/microblink/camera/view/NotSupportedReason;

    new-instance v0, Lcom/microblink/camera/view/NotSupportedReason;

    const-string v1, "UNSUPPORTED_PROCESSOR_ARCHITECTURE"

    const-string v2, "Device CPU has incompatible architecture."

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lcom/microblink/camera/view/NotSupportedReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/microblink/camera/view/NotSupportedReason;->UNSUPPORTED_PROCESSOR_ARCHITECTURE:Lcom/microblink/camera/view/NotSupportedReason;

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/microblink/camera/view/NotSupportedReason;

    sget-object v1, Lcom/microblink/camera/view/NotSupportedReason;->UNSUPPORTED_ANDROID_VERSION:Lcom/microblink/camera/view/NotSupportedReason;

    aput-object v1, v0, v3

    sget-object v1, Lcom/microblink/camera/view/NotSupportedReason;->NO_CAMERA:Lcom/microblink/camera/view/NotSupportedReason;

    aput-object v1, v0, v4

    sget-object v1, Lcom/microblink/camera/view/NotSupportedReason;->NO_AUTOFOCUS_CAMERA:Lcom/microblink/camera/view/NotSupportedReason;

    aput-object v1, v0, v5

    sget-object v1, Lcom/microblink/camera/view/NotSupportedReason;->BLACKLISTED_DEVICE:Lcom/microblink/camera/view/NotSupportedReason;

    aput-object v1, v0, v6

    sget-object v1, Lcom/microblink/camera/view/NotSupportedReason;->INVALID_LICENSE_KEY:Lcom/microblink/camera/view/NotSupportedReason;

    aput-object v1, v0, v7

    sget-object v1, Lcom/microblink/camera/view/NotSupportedReason;->CUSTOM_UI_FORBIDDEN:Lcom/microblink/camera/view/NotSupportedReason;

    aput-object v1, v0, v8

    sget-object v1, Lcom/microblink/camera/view/NotSupportedReason;->UNSUPPORTED_PROCESSOR_ARCHITECTURE:Lcom/microblink/camera/view/NotSupportedReason;

    aput-object v1, v0, v9

    sput-object v0, Lcom/microblink/camera/view/NotSupportedReason;->$VALUES:[Lcom/microblink/camera/view/NotSupportedReason;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/microblink/camera/view/NotSupportedReason;->mDescription:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/camera/view/NotSupportedReason;
    .locals 1

    const-class v0, Lcom/microblink/camera/view/NotSupportedReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/camera/view/NotSupportedReason;

    return-object p0
.end method

.method public static values()[Lcom/microblink/camera/view/NotSupportedReason;
    .locals 1

    sget-object v0, Lcom/microblink/camera/view/NotSupportedReason;->$VALUES:[Lcom/microblink/camera/view/NotSupportedReason;

    invoke-virtual {v0}, [Lcom/microblink/camera/view/NotSupportedReason;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/camera/view/NotSupportedReason;

    return-object v0
.end method


# virtual methods
.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/NotSupportedReason;->mDescription:Ljava/lang/String;

    return-object v0
.end method
