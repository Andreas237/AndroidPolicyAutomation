.class public final Lcom/microblink/FrameCharacteristics$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/FrameCharacteristics;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private compressFormat:Landroid/graphics/Bitmap$CompressFormat;

.field private compressionQuality:I

.field private storeFrames:Z

.field private useExternalStorage:Z

.field private videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x64

    iput v0, p0, Lcom/microblink/FrameCharacteristics$Builder;->compressionQuality:I

    invoke-static {}, Lcom/microblink/FrameCharacteristics;->access$500()Landroid/graphics/Bitmap$CompressFormat;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/FrameCharacteristics$Builder;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {}, Lcom/microblink/FrameCharacteristics;->defaultVideoResolution()Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/FrameCharacteristics$Builder;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/FrameCharacteristics$Builder;)I
    .locals 0

    iget p0, p0, Lcom/microblink/FrameCharacteristics$Builder;->compressionQuality:I

    return p0
.end method

.method static synthetic access$100(Lcom/microblink/FrameCharacteristics$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/FrameCharacteristics$Builder;->storeFrames:Z

    return p0
.end method

.method static synthetic access$200(Lcom/microblink/FrameCharacteristics$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/FrameCharacteristics$Builder;->useExternalStorage:Z

    return p0
.end method

.method static synthetic access$300(Lcom/microblink/FrameCharacteristics$Builder;)Landroid/graphics/Bitmap$CompressFormat;
    .locals 0

    iget-object p0, p0, Lcom/microblink/FrameCharacteristics$Builder;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    return-object p0
.end method

.method static synthetic access$400(Lcom/microblink/FrameCharacteristics$Builder;)Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;
    .locals 0

    iget-object p0, p0, Lcom/microblink/FrameCharacteristics$Builder;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    return-object p0
.end method


# virtual methods
.method public final build()Lcom/microblink/FrameCharacteristics;
    .locals 2

    new-instance v0, Lcom/microblink/FrameCharacteristics;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/microblink/FrameCharacteristics;-><init>(Lcom/microblink/FrameCharacteristics$Builder;Lcom/microblink/FrameCharacteristics$1;)V

    return-object v0
.end method

.method public final compressFormat(Landroid/graphics/Bitmap$CompressFormat;)Lcom/microblink/FrameCharacteristics$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/FrameCharacteristics$Builder;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    return-object p0
.end method

.method public final compressionQuality(I)Lcom/microblink/FrameCharacteristics$Builder;
    .locals 0

    iput p1, p0, Lcom/microblink/FrameCharacteristics$Builder;->compressionQuality:I

    return-object p0
.end method

.method public final externalStorage(Z)Lcom/microblink/FrameCharacteristics$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/FrameCharacteristics$Builder;->useExternalStorage:Z

    return-object p0
.end method

.method public final storeFrames(Z)Lcom/microblink/FrameCharacteristics$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/FrameCharacteristics$Builder;->storeFrames:Z

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Builder{compressionQuality="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/microblink/FrameCharacteristics$Builder;->compressionQuality:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", storeFrames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/FrameCharacteristics$Builder;->storeFrames:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", useExternalStorage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/FrameCharacteristics$Builder;->useExternalStorage:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", compressFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/FrameCharacteristics$Builder;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", videoResolutionPreset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/FrameCharacteristics$Builder;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final videoResolutionPreset(Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;)Lcom/microblink/FrameCharacteristics$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/FrameCharacteristics$Builder;->videoResolutionPreset:Lcom/microblink/camera/hardware/camera/VideoResolutionPreset;

    return-object p0
.end method
