.class public final Lcom/microblink/EdgeDetectionConfiguration;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/microblink/EdgeDetectionConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private static final DEFAULT_EDGE_CONTENT_THRESHOLD:I = 0x50

.field private static final DEFAULT_FRAMES_ABOVE_MIN_CONTENT_THRESHOLD_LIMIT:I = 0x2

.field private static final DEFAULT_FRAMES_WITH_NO_EDGE_LIMIT:I = 0xa

.field private static final DEFAULT_FRAME_FREQUENCY:I = 0x6

.field private static final MINIMUM_BLUR_SCORE:I = 0x28


# instance fields
.field private final edgeContentThreshold:F

.field private final frameFrequency:I

.field private final framesAboveThresholdLimit:I

.field private final framesWithNoEdgesThreshold:I

.field private final minimumBlurScore:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/EdgeDetectionConfiguration$1;

    invoke-direct {v0}, Lcom/microblink/EdgeDetectionConfiguration$1;-><init>()V

    sput-object v0, Lcom/microblink/EdgeDetectionConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x6

    const/high16 v2, 0x42a00000    # 80.0f

    const/16 v3, 0xa

    const/4 v4, 0x2

    const/16 v5, 0x28

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/microblink/EdgeDetectionConfiguration;-><init>(IFIII)V

    return-void
.end method

.method public constructor <init>(IFIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/microblink/EdgeDetectionConfiguration;->frameFrequency:I

    iput p2, p0, Lcom/microblink/EdgeDetectionConfiguration;->edgeContentThreshold:F

    iput p3, p0, Lcom/microblink/EdgeDetectionConfiguration;->framesWithNoEdgesThreshold:I

    iput p4, p0, Lcom/microblink/EdgeDetectionConfiguration;->framesAboveThresholdLimit:I

    iput p5, p0, Lcom/microblink/EdgeDetectionConfiguration;->minimumBlurScore:I

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/microblink/EdgeDetectionConfiguration;->frameFrequency:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/microblink/EdgeDetectionConfiguration;->edgeContentThreshold:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/microblink/EdgeDetectionConfiguration;->framesWithNoEdgesThreshold:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/microblink/EdgeDetectionConfiguration;->framesAboveThresholdLimit:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/microblink/EdgeDetectionConfiguration;->minimumBlurScore:I

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final edgeContentThreshold()F
    .locals 1

    iget v0, p0, Lcom/microblink/EdgeDetectionConfiguration;->edgeContentThreshold:F

    return v0
.end method

.method public final frameFrequency()I
    .locals 1

    iget v0, p0, Lcom/microblink/EdgeDetectionConfiguration;->frameFrequency:I

    return v0
.end method

.method public final framesAboveThresholdLimit()I
    .locals 1

    iget v0, p0, Lcom/microblink/EdgeDetectionConfiguration;->framesAboveThresholdLimit:I

    return v0
.end method

.method public final framesWithNoEdgesLimit()I
    .locals 1

    iget v0, p0, Lcom/microblink/EdgeDetectionConfiguration;->framesWithNoEdgesThreshold:I

    return v0
.end method

.method public final minimumBlurScore()I
    .locals 1

    iget v0, p0, Lcom/microblink/EdgeDetectionConfiguration;->minimumBlurScore:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EdgeDetectionConfiguration{frameFrequency="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/microblink/EdgeDetectionConfiguration;->frameFrequency:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", edgeContentThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/EdgeDetectionConfiguration;->edgeContentThreshold:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", framesWithNoEdgesThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/EdgeDetectionConfiguration;->framesWithNoEdgesThreshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", framesAboveThresholdLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/EdgeDetectionConfiguration;->framesAboveThresholdLimit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minimumBlurScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/EdgeDetectionConfiguration;->minimumBlurScore:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lcom/microblink/EdgeDetectionConfiguration;->frameFrequency:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/microblink/EdgeDetectionConfiguration;->edgeContentThreshold:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget p2, p0, Lcom/microblink/EdgeDetectionConfiguration;->framesWithNoEdgesThreshold:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/microblink/EdgeDetectionConfiguration;->framesAboveThresholdLimit:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/microblink/EdgeDetectionConfiguration;->minimumBlurScore:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
