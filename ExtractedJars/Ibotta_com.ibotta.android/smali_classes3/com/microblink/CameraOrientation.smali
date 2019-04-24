.class public final enum Lcom/microblink/CameraOrientation;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/CameraOrientation;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/CameraOrientation;

.field public static final enum ORIENTATION_LANDSCAPE_LEFT:Lcom/microblink/CameraOrientation;

.field public static final enum ORIENTATION_LANDSCAPE_RIGHT:Lcom/microblink/CameraOrientation;

.field public static final enum ORIENTATION_PORTRAIT:Lcom/microblink/CameraOrientation;

.field public static final enum ORIENTATION_PORTRAIT_UPSIDE_DOWN:Lcom/microblink/CameraOrientation;

.field public static final enum ORIENTATION_UNKNOWN:Lcom/microblink/CameraOrientation;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/microblink/CameraOrientation;

    const-string v1, "ORIENTATION_PORTRAIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/microblink/CameraOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/CameraOrientation;->ORIENTATION_PORTRAIT:Lcom/microblink/CameraOrientation;

    new-instance v0, Lcom/microblink/CameraOrientation;

    const-string v1, "ORIENTATION_LANDSCAPE_RIGHT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/microblink/CameraOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/CameraOrientation;->ORIENTATION_LANDSCAPE_RIGHT:Lcom/microblink/CameraOrientation;

    new-instance v0, Lcom/microblink/CameraOrientation;

    const-string v1, "ORIENTATION_LANDSCAPE_LEFT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/microblink/CameraOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/CameraOrientation;->ORIENTATION_LANDSCAPE_LEFT:Lcom/microblink/CameraOrientation;

    new-instance v0, Lcom/microblink/CameraOrientation;

    const-string v1, "ORIENTATION_PORTRAIT_UPSIDE_DOWN"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/microblink/CameraOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/CameraOrientation;->ORIENTATION_PORTRAIT_UPSIDE_DOWN:Lcom/microblink/CameraOrientation;

    new-instance v0, Lcom/microblink/CameraOrientation;

    const-string v1, "ORIENTATION_UNKNOWN"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/microblink/CameraOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/CameraOrientation;->ORIENTATION_UNKNOWN:Lcom/microblink/CameraOrientation;

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/microblink/CameraOrientation;

    sget-object v1, Lcom/microblink/CameraOrientation;->ORIENTATION_PORTRAIT:Lcom/microblink/CameraOrientation;

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/CameraOrientation;->ORIENTATION_LANDSCAPE_RIGHT:Lcom/microblink/CameraOrientation;

    aput-object v1, v0, v3

    sget-object v1, Lcom/microblink/CameraOrientation;->ORIENTATION_LANDSCAPE_LEFT:Lcom/microblink/CameraOrientation;

    aput-object v1, v0, v4

    sget-object v1, Lcom/microblink/CameraOrientation;->ORIENTATION_PORTRAIT_UPSIDE_DOWN:Lcom/microblink/CameraOrientation;

    aput-object v1, v0, v5

    sget-object v1, Lcom/microblink/CameraOrientation;->ORIENTATION_UNKNOWN:Lcom/microblink/CameraOrientation;

    aput-object v1, v0, v6

    sput-object v0, Lcom/microblink/CameraOrientation;->$VALUES:[Lcom/microblink/CameraOrientation;

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

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/CameraOrientation;
    .locals 1

    const-class v0, Lcom/microblink/CameraOrientation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/CameraOrientation;

    return-object p0
.end method

.method public static values()[Lcom/microblink/CameraOrientation;
    .locals 1

    sget-object v0, Lcom/microblink/CameraOrientation;->$VALUES:[Lcom/microblink/CameraOrientation;

    invoke-virtual {v0}, [Lcom/microblink/CameraOrientation;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/CameraOrientation;

    return-object v0
.end method
