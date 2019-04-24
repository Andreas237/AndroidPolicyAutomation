.class public final enum Lcom/microblink/RecognizerCompatibilityStatus;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/RecognizerCompatibilityStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/RecognizerCompatibilityStatus;

.field public static final enum DEVICE_BLACKLISTED:Lcom/microblink/RecognizerCompatibilityStatus;

.field public static final enum NO_CAMERA:Lcom/microblink/RecognizerCompatibilityStatus;

.field public static final enum PROCESSOR_ARCHITECTURE_NOT_SUPPORTED:Lcom/microblink/RecognizerCompatibilityStatus;

.field public static final enum RECOGNIZER_SUPPORTED:Lcom/microblink/RecognizerCompatibilityStatus;

.field public static final enum UNSUPPORTED_ANDROID_VERSION:Lcom/microblink/RecognizerCompatibilityStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/microblink/RecognizerCompatibilityStatus;

    const-string v1, "PROCESSOR_ARCHITECTURE_NOT_SUPPORTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/microblink/RecognizerCompatibilityStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/RecognizerCompatibilityStatus;->PROCESSOR_ARCHITECTURE_NOT_SUPPORTED:Lcom/microblink/RecognizerCompatibilityStatus;

    new-instance v0, Lcom/microblink/RecognizerCompatibilityStatus;

    const-string v1, "DEVICE_BLACKLISTED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/microblink/RecognizerCompatibilityStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/RecognizerCompatibilityStatus;->DEVICE_BLACKLISTED:Lcom/microblink/RecognizerCompatibilityStatus;

    new-instance v0, Lcom/microblink/RecognizerCompatibilityStatus;

    const-string v1, "UNSUPPORTED_ANDROID_VERSION"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/microblink/RecognizerCompatibilityStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/RecognizerCompatibilityStatus;->UNSUPPORTED_ANDROID_VERSION:Lcom/microblink/RecognizerCompatibilityStatus;

    new-instance v0, Lcom/microblink/RecognizerCompatibilityStatus;

    const-string v1, "RECOGNIZER_SUPPORTED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/microblink/RecognizerCompatibilityStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/RecognizerCompatibilityStatus;->RECOGNIZER_SUPPORTED:Lcom/microblink/RecognizerCompatibilityStatus;

    new-instance v0, Lcom/microblink/RecognizerCompatibilityStatus;

    const-string v1, "NO_CAMERA"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/microblink/RecognizerCompatibilityStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/RecognizerCompatibilityStatus;->NO_CAMERA:Lcom/microblink/RecognizerCompatibilityStatus;

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/microblink/RecognizerCompatibilityStatus;

    sget-object v1, Lcom/microblink/RecognizerCompatibilityStatus;->PROCESSOR_ARCHITECTURE_NOT_SUPPORTED:Lcom/microblink/RecognizerCompatibilityStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/RecognizerCompatibilityStatus;->DEVICE_BLACKLISTED:Lcom/microblink/RecognizerCompatibilityStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/microblink/RecognizerCompatibilityStatus;->UNSUPPORTED_ANDROID_VERSION:Lcom/microblink/RecognizerCompatibilityStatus;

    aput-object v1, v0, v4

    sget-object v1, Lcom/microblink/RecognizerCompatibilityStatus;->RECOGNIZER_SUPPORTED:Lcom/microblink/RecognizerCompatibilityStatus;

    aput-object v1, v0, v5

    sget-object v1, Lcom/microblink/RecognizerCompatibilityStatus;->NO_CAMERA:Lcom/microblink/RecognizerCompatibilityStatus;

    aput-object v1, v0, v6

    sput-object v0, Lcom/microblink/RecognizerCompatibilityStatus;->$VALUES:[Lcom/microblink/RecognizerCompatibilityStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/RecognizerCompatibilityStatus;
    .locals 1

    const-class v0, Lcom/microblink/RecognizerCompatibilityStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/RecognizerCompatibilityStatus;

    return-object p0
.end method

.method public static values()[Lcom/microblink/RecognizerCompatibilityStatus;
    .locals 1

    sget-object v0, Lcom/microblink/RecognizerCompatibilityStatus;->$VALUES:[Lcom/microblink/RecognizerCompatibilityStatus;

    invoke-virtual {v0}, [Lcom/microblink/RecognizerCompatibilityStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/RecognizerCompatibilityStatus;

    return-object v0
.end method
