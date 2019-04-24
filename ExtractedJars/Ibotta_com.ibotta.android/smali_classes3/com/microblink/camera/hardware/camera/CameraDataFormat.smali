.class public final enum Lcom/microblink/camera/hardware/camera/CameraDataFormat;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/camera/hardware/camera/CameraDataFormat;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/camera/hardware/camera/CameraDataFormat;

.field public static final enum ALPHA_8:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

.field public static final enum ARGB:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

.field public static final enum BGRA:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

.field public static final enum JPEG:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

.field public static final enum MULTI_PLANAR_YUV_420_888:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

.field public static final enum YUV_NV21:Lcom/microblink/camera/hardware/camera/CameraDataFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    const-string v1, "YUV_NV21"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/microblink/camera/hardware/camera/CameraDataFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->YUV_NV21:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    new-instance v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    const-string v1, "JPEG"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/microblink/camera/hardware/camera/CameraDataFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->JPEG:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    new-instance v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    const-string v1, "MULTI_PLANAR_YUV_420_888"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/microblink/camera/hardware/camera/CameraDataFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->MULTI_PLANAR_YUV_420_888:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    new-instance v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    const-string v1, "ARGB"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/microblink/camera/hardware/camera/CameraDataFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->ARGB:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    new-instance v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    const-string v1, "ALPHA_8"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/microblink/camera/hardware/camera/CameraDataFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->ALPHA_8:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    new-instance v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    const-string v1, "BGRA"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/microblink/camera/hardware/camera/CameraDataFormat;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->BGRA:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->YUV_NV21:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->JPEG:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    aput-object v1, v0, v3

    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->MULTI_PLANAR_YUV_420_888:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    aput-object v1, v0, v4

    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->ARGB:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    aput-object v1, v0, v5

    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->ALPHA_8:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    aput-object v1, v0, v6

    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->BGRA:Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    aput-object v1, v0, v7

    sput-object v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->$VALUES:[Lcom/microblink/camera/hardware/camera/CameraDataFormat;

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

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/camera/hardware/camera/CameraDataFormat;
    .locals 1

    const-class v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    return-object p0
.end method

.method public static values()[Lcom/microblink/camera/hardware/camera/CameraDataFormat;
    .locals 1

    sget-object v0, Lcom/microblink/camera/hardware/camera/CameraDataFormat;->$VALUES:[Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    invoke-virtual {v0}, [Lcom/microblink/camera/hardware/camera/CameraDataFormat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/camera/hardware/camera/CameraDataFormat;

    return-object v0
.end method
