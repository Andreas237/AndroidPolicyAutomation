.class public final Lcom/google/android/gms/vision/barcode/BarcodeDetector;
.super Lcom/google/android/gms/vision/Detector;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/barcode/BarcodeDetector$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/vision/Detector<",
        "Lcom/google/android/gms/vision/barcode/Barcode;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzbl:Lcom/google/android/gms/internal/vision/zzg;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/vision/Detector;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Default constructor called"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/vision/zzg;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/vision/Detector;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/google/android/gms/vision/barcode/BarcodeDetector;->zzbl:Lcom/google/android/gms/internal/vision/zzg;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/vision/zzg;Lcom/google/android/gms/vision/barcode/zzc;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/google/android/gms/vision/barcode/BarcodeDetector;-><init>(Lcom/google/android/gms/internal/vision/zzg;)V

    return-void
.end method


# virtual methods
.method public final detect(Lcom/google/android/gms/vision/Frame;)Landroid/util/SparseArray;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/Frame;",
            ")",
            "Landroid/util/SparseArray<",
            "Lcom/google/android/gms/vision/barcode/Barcode;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 11
    invoke-static {p1}, Lcom/google/android/gms/internal/vision/zzn;->zzc(Lcom/google/android/gms/vision/Frame;)Lcom/google/android/gms/internal/vision/zzn;

    move-result-object v0

    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 13
    iget-object v1, p0, Lcom/google/android/gms/vision/barcode/BarcodeDetector;->zzbl:Lcom/google/android/gms/internal/vision/zzg;

    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/vision/zzg;->zza(Landroid/graphics/Bitmap;Lcom/google/android/gms/internal/vision/zzn;)[Lcom/google/android/gms/vision/barcode/Barcode;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Internal barcode detector error; check logcat output."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getGrayscaleImageData()Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 17
    iget-object v1, p0, Lcom/google/android/gms/vision/barcode/BarcodeDetector;->zzbl:Lcom/google/android/gms/internal/vision/zzg;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/vision/zzg;->zza(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/vision/zzn;)[Lcom/google/android/gms/vision/barcode/Barcode;

    move-result-object p1

    .line 18
    :goto_0
    new-instance v0, Landroid/util/SparseArray;

    array-length v1, p1

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    .line 19
    array-length v1, p1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    .line 20
    iget-object v4, v3, Lcom/google/android/gms/vision/barcode/Barcode;->rawValue:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    invoke-virtual {v0, v4, v3}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-object v0

    .line 10
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No frame supplied."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final isOperational()Z
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/BarcodeDetector;->zzbl:Lcom/google/android/gms/internal/vision/zzg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/vision/zzm;->isOperational()Z

    move-result v0

    return v0
.end method

.method public final release()V
    .locals 1

    .line 6
    invoke-super {p0}, Lcom/google/android/gms/vision/Detector;->release()V

    .line 7
    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/BarcodeDetector;->zzbl:Lcom/google/android/gms/internal/vision/zzg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/vision/zzm;->zzp()V

    return-void
.end method
