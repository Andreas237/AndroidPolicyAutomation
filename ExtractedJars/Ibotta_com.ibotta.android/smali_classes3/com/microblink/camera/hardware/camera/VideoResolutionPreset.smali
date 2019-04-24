.class public final enum Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;
.super Ljava/lang/Enum;

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum VIDEO_RESOLUTION_1080p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

.field public static final enum VIDEO_RESOLUTION_2160p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

.field public static final enum VIDEO_RESOLUTION_480p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

.field public static final enum VIDEO_RESOLUTION_720p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

.field public static final enum VIDEO_RESOLUTION_DEFAULT:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

.field public static final enum VIDEO_RESOLUTION_MAX_AVAILABLE:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;


# instance fields
.field private mHeight:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    const-string v1, "VIDEO_RESOLUTION_DEFAULT"

    const/16 v2, 0x438

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_DEFAULT:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    new-instance v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    const-string v1, "VIDEO_RESOLUTION_480p"

    const/4 v4, 0x1

    const/16 v5, 0x1e0

    invoke-direct {v0, v1, v4, v5}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_480p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    new-instance v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    const-string v1, "VIDEO_RESOLUTION_720p"

    const/4 v5, 0x2

    const/16 v6, 0x2d0

    invoke-direct {v0, v1, v5, v6}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_720p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    new-instance v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    const-string v1, "VIDEO_RESOLUTION_1080p"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_1080p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    new-instance v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    const-string v1, "VIDEO_RESOLUTION_2160p"

    const/4 v2, 0x4

    const/16 v7, 0x870

    invoke-direct {v0, v1, v2, v7}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_2160p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    new-instance v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    const-string v1, "VIDEO_RESOLUTION_MAX_AVAILABLE"

    const/4 v7, 0x5

    const/16 v8, 0x10e0

    invoke-direct {v0, v1, v7, v8}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_MAX_AVAILABLE:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    sget-object v1, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_DEFAULT:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    aput-object v1, v0, v3

    sget-object v1, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_480p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    aput-object v1, v0, v4

    sget-object v1, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_720p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    aput-object v1, v0, v5

    sget-object v1, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_1080p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    aput-object v1, v0, v6

    sget-object v1, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_2160p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_MAX_AVAILABLE:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    aput-object v1, v0, v7

    sput-object v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->$VALUES:[Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    new-instance v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset$1;

    invoke-direct {v0}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset$1;-><init>()V

    sput-object v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->mHeight:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;
    .locals 1

    const-class v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    return-object p0
.end method

.method public static values()[Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;
    .locals 1

    sget-object v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->$VALUES:[Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    invoke-virtual {v0}, [Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getIdealHeight()I
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->mHeight:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
