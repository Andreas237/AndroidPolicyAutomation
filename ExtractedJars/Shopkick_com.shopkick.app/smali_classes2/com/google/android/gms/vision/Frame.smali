.class public Lcom/google/android/gms/vision/Frame;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/Frame$Metadata;,
        Lcom/google/android/gms/vision/Frame$Builder;
    }
.end annotation


# static fields
.field public static final ROTATION_0:I = 0x0

.field public static final ROTATION_180:I = 0x2

.field public static final ROTATION_270:I = 0x3

.field public static final ROTATION_90:I = 0x1


# instance fields
.field private zzap:Lcom/google/android/gms/vision/Frame$Metadata;

.field private zzaq:Ljava/nio/ByteBuffer;

.field private zzar:Landroid/graphics/Bitmap;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Lcom/google/android/gms/vision/Frame$Metadata;

    invoke-direct {v0}, Lcom/google/android/gms/vision/Frame$Metadata;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/Frame;->zzap:Lcom/google/android/gms/vision/Frame$Metadata;

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/google/android/gms/vision/Frame;->zzaq:Ljava/nio/ByteBuffer;

    .line 22
    iput-object v0, p0, Lcom/google/android/gms/vision/Frame;->zzar:Landroid/graphics/Bitmap;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/vision/zzb;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/google/android/gms/vision/Frame;-><init>()V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/vision/Frame;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/google/android/gms/vision/Frame;->zzar:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic zza(Lcom/google/android/gms/vision/Frame;)Ljava/nio/ByteBuffer;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/google/android/gms/vision/Frame;->zzaq:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method static synthetic zza(Lcom/google/android/gms/vision/Frame;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/google/android/gms/vision/Frame;->zzaq:Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method static synthetic zzb(Lcom/google/android/gms/vision/Frame;)Landroid/graphics/Bitmap;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/google/android/gms/vision/Frame;->zzar:Landroid/graphics/Bitmap;

    return-object p0
.end method


# virtual methods
.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/google/android/gms/vision/Frame;->zzar:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getGrayscaleImageData()Ljava/nio/ByteBuffer;
    .locals 10

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/vision/Frame;->zzar:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 5
    iget-object v0, p0, Lcom/google/android/gms/vision/Frame;->zzar:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    mul-int v0, v7, v8

    .line 6
    new-array v9, v0, [I

    .line 7
    iget-object v1, p0, Lcom/google/android/gms/vision/Frame;->zzar:Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v9

    move v4, v7

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 8
    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 9
    :goto_0
    array-length v2, v9

    if-ge v1, v2, :cond_0

    .line 10
    aget v2, v9, v1

    .line 11
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    move-result v2

    int-to-float v2, v2

    const v3, 0x3e991687    # 0.299f

    mul-float/2addr v2, v3

    aget v3, v9, v1

    .line 12
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v3

    int-to-float v3, v3

    const v4, 0x3f1645a2    # 0.587f

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    aget v3, v9, v1

    .line 13
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    int-to-float v3, v3

    const v4, 0x3de978d5    # 0.114f

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    float-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0

    .line 17
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/vision/Frame;->zzaq:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public getMetadata()Lcom/google/android/gms/vision/Frame$Metadata;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/vision/Frame;->zzap:Lcom/google/android/gms/vision/Frame$Metadata;

    return-object v0
.end method
