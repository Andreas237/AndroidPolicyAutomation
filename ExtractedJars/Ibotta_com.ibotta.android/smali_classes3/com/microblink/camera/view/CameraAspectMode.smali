.class public final enum Lcom/microblink/camera/view/CameraAspectMode;
.super Ljava/lang/Enum;

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/camera/view/CameraAspectMode;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/camera/view/CameraAspectMode;

.field public static final enum ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

.field public static final enum ASPECT_FIT:Lcom/microblink/camera/view/CameraAspectMode;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/microblink/camera/view/CameraAspectMode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/microblink/camera/view/CameraAspectMode;

    const-string v1, "ASPECT_FIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/microblink/camera/view/CameraAspectMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FIT:Lcom/microblink/camera/view/CameraAspectMode;

    new-instance v0, Lcom/microblink/camera/view/CameraAspectMode;

    const-string v1, "ASPECT_FILL"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/microblink/camera/view/CameraAspectMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/microblink/camera/view/CameraAspectMode;

    sget-object v1, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FIT:Lcom/microblink/camera/view/CameraAspectMode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/camera/view/CameraAspectMode;->ASPECT_FILL:Lcom/microblink/camera/view/CameraAspectMode;

    aput-object v1, v0, v3

    sput-object v0, Lcom/microblink/camera/view/CameraAspectMode;->$VALUES:[Lcom/microblink/camera/view/CameraAspectMode;

    new-instance v0, Lcom/microblink/camera/view/CameraAspectMode$1;

    invoke-direct {v0}, Lcom/microblink/camera/view/CameraAspectMode$1;-><init>()V

    sput-object v0, Lcom/microblink/camera/view/CameraAspectMode;->CREATOR:Landroid/os/Parcelable$Creator;

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

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/camera/view/CameraAspectMode;
    .locals 1

    const-class v0, Lcom/microblink/camera/view/CameraAspectMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/camera/view/CameraAspectMode;

    return-object p0
.end method

.method public static values()[Lcom/microblink/camera/view/CameraAspectMode;
    .locals 1

    sget-object v0, Lcom/microblink/camera/view/CameraAspectMode;->$VALUES:[Lcom/microblink/camera/view/CameraAspectMode;

    invoke-virtual {v0}, [Lcom/microblink/camera/view/CameraAspectMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/camera/view/CameraAspectMode;

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

    invoke-virtual {p0}, Lcom/microblink/camera/view/CameraAspectMode;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
