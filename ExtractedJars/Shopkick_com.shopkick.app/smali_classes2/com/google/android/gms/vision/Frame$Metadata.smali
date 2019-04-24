.class public Lcom/google/android/gms/vision/Frame$Metadata;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/Frame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Metadata"
.end annotation


# instance fields
.field private format:I

.field private height:I

.field private id:I

.field private rotation:I

.field private width:I

.field private zzat:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->format:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/vision/Frame$Metadata;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->format:I

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame$Metadata;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->width:I

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame$Metadata;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->height:I

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame$Metadata;->getId()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->id:I

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame$Metadata;->getTimestampMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzat:J

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame$Metadata;->getRotation()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->rotation:I

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/vision/Frame$Metadata;I)I
    .locals 0

    .line 24
    iput p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->width:I

    return p1
.end method

.method static synthetic zza(Lcom/google/android/gms/vision/Frame$Metadata;J)J
    .locals 0

    .line 28
    iput-wide p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzat:J

    return-wide p1
.end method

.method static synthetic zzb(Lcom/google/android/gms/vision/Frame$Metadata;I)I
    .locals 0

    .line 25
    iput p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->height:I

    return p1
.end method

.method static synthetic zzc(Lcom/google/android/gms/vision/Frame$Metadata;I)I
    .locals 0

    .line 26
    iput p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->format:I

    return p1
.end method

.method static synthetic zzd(Lcom/google/android/gms/vision/Frame$Metadata;I)I
    .locals 0

    .line 27
    iput p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->id:I

    return p1
.end method

.method static synthetic zze(Lcom/google/android/gms/vision/Frame$Metadata;I)I
    .locals 0

    .line 29
    iput p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->rotation:I

    return p1
.end method


# virtual methods
.method public getFormat()I
    .locals 1

    .line 17
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->format:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->height:I

    return v0
.end method

.method public getId()I
    .locals 1

    .line 14
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->id:I

    return v0
.end method

.method public getRotation()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->rotation:I

    return v0
.end method

.method public getTimestampMillis()J
    .locals 2

    .line 15
    iget-wide v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzat:J

    return-wide v0
.end method

.method public getWidth()I
    .locals 1

    .line 12
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->width:I

    return v0
.end method

.method public final zzd()V
    .locals 2

    .line 18
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->rotation:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    .line 19
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->width:I

    .line 20
    iget v1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->height:I

    iput v1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->width:I

    .line 21
    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->height:I

    :cond_0
    const/4 v0, 0x0

    .line 22
    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->rotation:I

    return-void
.end method
