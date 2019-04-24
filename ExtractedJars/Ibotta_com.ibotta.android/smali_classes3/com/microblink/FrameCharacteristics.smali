.class public final Lcom/microblink/FrameCharacteristics;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/FrameCharacteristics$Builder;,
        Lcom/microblink/FrameCharacteristics$FrameExtension;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/microblink/FrameCharacteristics;",
            ">;"
        }
    .end annotation
.end field

.field public static final DEFAULT_COMPRESSION_QUALITY:I = 0x64

.field public static final JPEG:Ljava/lang/String; = ".jpg"

.field public static final PNG:Ljava/lang/String; = ".png"

.field public static final WEBP:Ljava/lang/String; = ".webp"


# instance fields
.field private compressFormat:Landroid/graphics/Bitmap$CompressFormat;

.field private compressionQuality:I

.field private storeFrames:Z

.field private useExternalStorage:Z

.field private videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/FrameCharacteristics$1;

    invoke-direct {v0}, Lcom/microblink/FrameCharacteristics$1;-><init>()V

    sput-object v0, Lcom/microblink/FrameCharacteristics;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x64

    iput v0, p0, Lcom/microblink/FrameCharacteristics;->compressionQuality:I

    invoke-static {}, Lcom/microblink/FrameCharacteristics;->defaultCompressFormat()Landroid/graphics/Bitmap$CompressFormat;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/FrameCharacteristics;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/microblink/FrameCharacteristics;->compressionQuality:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/microblink/FrameCharacteristics;->storeFrames:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-boolean v1, p0, Lcom/microblink/FrameCharacteristics;->useExternalStorage:Z

    const-class v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    iput-object v0, p0, Lcom/microblink/FrameCharacteristics;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/Bitmap$CompressFormat;->valueOf(Ljava/lang/String;)Landroid/graphics/Bitmap$CompressFormat;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/FrameCharacteristics;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    return-void
.end method

.method private constructor <init>(Lcom/microblink/FrameCharacteristics$Builder;)V
    .locals 2
    .param p1    # Lcom/microblink/FrameCharacteristics$Builder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x64

    iput v0, p0, Lcom/microblink/FrameCharacteristics;->compressionQuality:I

    invoke-static {}, Lcom/microblink/FrameCharacteristics;->defaultCompressFormat()Landroid/graphics/Bitmap$CompressFormat;

    move-result-object v1

    iput-object v1, p0, Lcom/microblink/FrameCharacteristics;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1}, Lcom/microblink/FrameCharacteristics$Builder;->access$000(Lcom/microblink/FrameCharacteristics$Builder;)I

    move-result v1

    iput v1, p0, Lcom/microblink/FrameCharacteristics;->compressionQuality:I

    invoke-static {p1}, Lcom/microblink/FrameCharacteristics$Builder;->access$100(Lcom/microblink/FrameCharacteristics$Builder;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/microblink/FrameCharacteristics;->storeFrames:Z

    invoke-static {p1}, Lcom/microblink/FrameCharacteristics$Builder;->access$200(Lcom/microblink/FrameCharacteristics$Builder;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/microblink/FrameCharacteristics;->useExternalStorage:Z

    invoke-static {p1}, Lcom/microblink/FrameCharacteristics$Builder;->access$300(Lcom/microblink/FrameCharacteristics$Builder;)Landroid/graphics/Bitmap$CompressFormat;

    move-result-object v1

    iput-object v1, p0, Lcom/microblink/FrameCharacteristics;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1}, Lcom/microblink/FrameCharacteristics$Builder;->access$400(Lcom/microblink/FrameCharacteristics$Builder;)Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/FrameCharacteristics;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    iget-object p1, p0, Lcom/microblink/FrameCharacteristics;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    if-nez p1, :cond_0

    invoke-static {}, Lcom/microblink/FrameCharacteristics;->defaultVideoResolution()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/FrameCharacteristics;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    :cond_0
    iget-object p1, p0, Lcom/microblink/FrameCharacteristics;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/microblink/FrameCharacteristics;->compressionQuality:I

    if-ltz p1, :cond_1

    if-gt p1, v0, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "quality must be 0..100"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "compress format must be provided"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method synthetic constructor <init>(Lcom/microblink/FrameCharacteristics$Builder;Lcom/microblink/FrameCharacteristics$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/microblink/FrameCharacteristics;-><init>(Lcom/microblink/FrameCharacteristics$Builder;)V

    return-void
.end method

.method static synthetic access$500()Landroid/graphics/Bitmap$CompressFormat;
    .locals 1

    invoke-static {}, Lcom/microblink/FrameCharacteristics;->defaultCompressFormat()Landroid/graphics/Bitmap$CompressFormat;

    move-result-object v0

    return-object v0
.end method

.method private static defaultCompressFormat()Landroid/graphics/Bitmap$CompressFormat;
    .locals 1

    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    return-object v0
.end method

.method static defaultVideoResolution()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;
    .locals 1

    sget-object v0, Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;->VIDEO_RESOLUTION_720p:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    return-object v0
.end method

.method public static newBuilder()Lcom/microblink/FrameCharacteristics$Builder;
    .locals 1

    new-instance v0, Lcom/microblink/FrameCharacteristics$Builder;

    invoke-direct {v0}, Lcom/microblink/FrameCharacteristics$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final compressFormat()Landroid/graphics/Bitmap$CompressFormat;
    .locals 1

    iget-object v0, p0, Lcom/microblink/FrameCharacteristics;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    return-object v0
.end method

.method public final compressionQuality()I
    .locals 1

    iget v0, p0, Lcom/microblink/FrameCharacteristics;->compressionQuality:I

    return v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final externalStorage()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/FrameCharacteristics;->useExternalStorage:Z

    return v0
.end method

.method public final storeFrames()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/FrameCharacteristics;->storeFrames:Z

    return v0
.end method

.method public final toExtension()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/microblink/FrameCharacteristics;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/microblink/FrameCharacteristics$2;->$SwitchMap$android$graphics$Bitmap$CompressFormat:[I

    iget-object v1, p0, Lcom/microblink/FrameCharacteristics;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v1}, Landroid/graphics/Bitmap$CompressFormat;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v0, ".webp"

    return-object v0

    :pswitch_1
    const-string v0, ".png"

    return-object v0

    :pswitch_2
    const-string v0, ".jpg"

    return-object v0

    :cond_0
    :goto_0
    const-string v0, ".jpg"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FrameCharacteristics{compressionQuality="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/microblink/FrameCharacteristics;->compressionQuality:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", storeFrames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/FrameCharacteristics;->storeFrames:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", useExternalStorage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/FrameCharacteristics;->useExternalStorage:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", compressFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/FrameCharacteristics;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", videoResolutionPreset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/FrameCharacteristics;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final videoResolutionPreset()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;
    .locals 1

    iget-object v0, p0, Lcom/microblink/FrameCharacteristics;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget v0, p0, Lcom/microblink/FrameCharacteristics;->compressionQuality:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/microblink/FrameCharacteristics;->storeFrames:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean v0, p0, Lcom/microblink/FrameCharacteristics;->useExternalStorage:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-object v0, p0, Lcom/microblink/FrameCharacteristics;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    invoke-static {}, Lcom/microblink/FrameCharacteristics;->defaultCompressFormat()Landroid/graphics/Bitmap$CompressFormat;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/Bitmap$CompressFormat;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/microblink/FrameCharacteristics;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap$CompressFormat;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
