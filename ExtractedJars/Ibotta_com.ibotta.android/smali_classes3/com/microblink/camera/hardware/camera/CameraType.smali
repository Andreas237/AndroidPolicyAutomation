.class public final enum Lcom/microblink/camera/hardware/camera/CameraType;
.super Ljava/lang/Enum;

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/camera/hardware/camera/CameraType;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/camera/hardware/camera/CameraType;

.field public static final enum CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

.field public static final enum CAMERA_DEFAULT:Lcom/microblink/camera/hardware/camera/CameraType;

.field public static final enum CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/microblink/camera/hardware/camera/CameraType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/microblink/camera/hardware/camera/CameraType;

    const-string v1, "CAMERA_DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/microblink/camera/hardware/camera/CameraType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_DEFAULT:Lcom/microblink/camera/hardware/camera/CameraType;

    new-instance v0, Lcom/microblink/camera/hardware/camera/CameraType;

    const-string v1, "CAMERA_BACKFACE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/microblink/camera/hardware/camera/CameraType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    new-instance v0, Lcom/microblink/camera/hardware/camera/CameraType;

    const-string v1, "CAMERA_FRONTFACE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/microblink/camera/hardware/camera/CameraType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/microblink/camera/hardware/camera/CameraType;

    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_DEFAULT:Lcom/microblink/camera/hardware/camera/CameraType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_BACKFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/microblink/camera/hardware/camera/CameraType;->CAMERA_FRONTFACE:Lcom/microblink/camera/hardware/camera/CameraType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/microblink/camera/hardware/camera/CameraType;->$VALUES:[Lcom/microblink/camera/hardware/camera/CameraType;

    new-instance v0, Lcom/microblink/camera/hardware/camera/CameraType$1;

    invoke-direct {v0}, Lcom/microblink/camera/hardware/camera/CameraType$1;-><init>()V

    sput-object v0, Lcom/microblink/camera/hardware/camera/CameraType;->CREATOR:Landroid/os/Parcelable$Creator;

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

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/camera/hardware/camera/CameraType;
    .locals 1

    const-class v0, Lcom/microblink/camera/hardware/camera/CameraType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/camera/hardware/camera/CameraType;

    return-object p0
.end method

.method public static values()[Lcom/microblink/camera/hardware/camera/CameraType;
    .locals 1

    sget-object v0, Lcom/microblink/camera/hardware/camera/CameraType;->$VALUES:[Lcom/microblink/camera/hardware/camera/CameraType;

    invoke-virtual {v0}, [Lcom/microblink/camera/hardware/camera/CameraType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/camera/hardware/camera/CameraType;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/CameraType;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
