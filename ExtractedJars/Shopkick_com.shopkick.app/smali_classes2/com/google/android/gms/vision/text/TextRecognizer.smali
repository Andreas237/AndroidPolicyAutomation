.class public final Lcom/google/android/gms/vision/text/TextRecognizer;
.super Lcom/google/android/gms/vision/Detector;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/text/TextRecognizer$Builder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/vision/Detector<",
        "Lcom/google/android/gms/vision/text/TextBlock;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzez:Lcom/google/android/gms/internal/vision/zzak;


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

.method private constructor <init>(Lcom/google/android/gms/internal/vision/zzak;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/vision/Detector;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/google/android/gms/vision/text/TextRecognizer;->zzez:Lcom/google/android/gms/internal/vision/zzak;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/vision/zzak;Lcom/google/android/gms/vision/text/zzb;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/google/android/gms/vision/text/TextRecognizer;-><init>(Lcom/google/android/gms/internal/vision/zzak;)V

    return-void
.end method


# virtual methods
.method public final detect(Lcom/google/android/gms/vision/Frame;)Landroid/util/SparseArray;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/Frame;",
            ")",
            "Landroid/util/SparseArray<",
            "Lcom/google/android/gms/vision/text/TextBlock;",
            ">;"
        }
    .end annotation

    .line 6
    new-instance v0, Lcom/google/android/gms/internal/vision/zzag;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/vision/zzag;-><init>(Landroid/graphics/Rect;)V

    if-eqz p1, :cond_6

    .line 9
    invoke-static {p1}, Lcom/google/android/gms/internal/vision/zzn;->zzc(Lcom/google/android/gms/vision/Frame;)Lcom/google/android/gms/internal/vision/zzn;

    move-result-object v1

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getMetadata()Lcom/google/android/gms/vision/Frame$Metadata;

    move-result-object v2

    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getGrayscaleImageData()Ljava/nio/ByteBuffer;

    move-result-object v4

    .line 15
    invoke-virtual {v2}, Lcom/google/android/gms/vision/Frame$Metadata;->getFormat()I

    move-result v7

    iget v2, v1, Lcom/google/android/gms/internal/vision/zzn;->width:I

    iget v11, v1, Lcom/google/android/gms/internal/vision/zzn;->height:I

    .line 17
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v5

    if-nez v5, :cond_1

    .line 18
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    move-object v6, v4

    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v5

    new-array v5, v5, [B

    .line 20
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    move-object v6, v5

    .line 21
    :goto_0
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 22
    new-instance v12, Landroid/graphics/YuvImage;

    const/4 v10, 0x0

    move-object v5, v12

    move v8, v2

    move v9, v11

    invoke-direct/range {v5 .. v10}, Landroid/graphics/YuvImage;-><init>([BIII[I)V

    .line 23
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5, v3, v3, v2, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    const/16 v2, 0x64

    invoke-virtual {v12, v5, v2, v4}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    .line 24
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    .line 25
    array-length v4, v2

    invoke-static {v2, v3, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 27
    :goto_1
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/vision/zzp;->zzb(Landroid/graphics/Bitmap;Lcom/google/android/gms/internal/vision/zzn;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 28
    iget-object v4, v0, Lcom/google/android/gms/internal/vision/zzag;->zzfl:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    .line 29
    iget-object v4, v0, Lcom/google/android/gms/internal/vision/zzag;->zzfl:Landroid/graphics/Rect;

    .line 30
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getMetadata()Lcom/google/android/gms/vision/Frame$Metadata;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/vision/Frame$Metadata;->getWidth()I

    move-result v5

    .line 31
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getMetadata()Lcom/google/android/gms/vision/Frame$Metadata;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame$Metadata;->getHeight()I

    move-result p1

    .line 33
    iget v6, v1, Lcom/google/android/gms/internal/vision/zzn;->rotation:I

    packed-switch v6, :pswitch_data_0

    move-object p1, v4

    goto :goto_2

    .line 36
    :pswitch_0
    new-instance p1, Landroid/graphics/Rect;

    iget v6, v4, Landroid/graphics/Rect;->top:I

    iget v7, v4, Landroid/graphics/Rect;->right:I

    sub-int v7, v5, v7

    iget v8, v4, Landroid/graphics/Rect;->bottom:I

    iget v4, v4, Landroid/graphics/Rect;->left:I

    sub-int/2addr v5, v4

    invoke-direct {p1, v6, v7, v8, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_2

    .line 35
    :pswitch_1
    new-instance v6, Landroid/graphics/Rect;

    iget v7, v4, Landroid/graphics/Rect;->right:I

    sub-int v7, v5, v7

    iget v8, v4, Landroid/graphics/Rect;->bottom:I

    sub-int v8, p1, v8

    iget v9, v4, Landroid/graphics/Rect;->left:I

    sub-int/2addr v5, v9

    iget v4, v4, Landroid/graphics/Rect;->top:I

    sub-int/2addr p1, v4

    invoke-direct {v6, v7, v8, v5, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object p1, v6

    goto :goto_2

    .line 34
    :pswitch_2
    new-instance v5, Landroid/graphics/Rect;

    iget v6, v4, Landroid/graphics/Rect;->bottom:I

    sub-int v6, p1, v6

    iget v7, v4, Landroid/graphics/Rect;->left:I

    iget v8, v4, Landroid/graphics/Rect;->top:I

    sub-int/2addr p1, v8

    iget v4, v4, Landroid/graphics/Rect;->right:I

    invoke-direct {v5, v6, v7, p1, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object p1, v5

    .line 39
    :goto_2
    iget-object v4, v0, Lcom/google/android/gms/internal/vision/zzag;->zzfl:Landroid/graphics/Rect;

    invoke-virtual {v4, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 40
    :cond_2
    iput v3, v1, Lcom/google/android/gms/internal/vision/zzn;->rotation:I

    .line 41
    iget-object p1, p0, Lcom/google/android/gms/vision/text/TextRecognizer;->zzez:Lcom/google/android/gms/internal/vision/zzak;

    invoke-virtual {p1, v2, v1, v0}, Lcom/google/android/gms/internal/vision/zzak;->zza(Landroid/graphics/Bitmap;Lcom/google/android/gms/internal/vision/zzn;Lcom/google/android/gms/internal/vision/zzag;)[Lcom/google/android/gms/internal/vision/zzae;

    move-result-object p1

    .line 42
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 43
    array-length v1, p1

    move v2, v3

    :goto_3
    if-ge v2, v1, :cond_4

    aget-object v4, p1, v2

    .line 44
    iget v5, v4, Lcom/google/android/gms/internal/vision/zzae;->zzfj:I

    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/util/SparseArray;

    if-nez v5, :cond_3

    .line 46
    new-instance v5, Landroid/util/SparseArray;

    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    .line 47
    iget v6, v4, Lcom/google/android/gms/internal/vision/zzae;->zzfj:I

    invoke-virtual {v0, v6, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 48
    :cond_3
    iget v6, v4, Lcom/google/android/gms/internal/vision/zzae;->zzfk:I

    invoke-virtual {v5, v6, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 50
    :cond_4
    new-instance p1, Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    invoke-direct {p1, v1}, Landroid/util/SparseArray;-><init>(I)V

    .line 51
    :goto_4
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v3, v1, :cond_5

    .line 52
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    new-instance v2, Lcom/google/android/gms/vision/text/TextBlock;

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/SparseArray;

    invoke-direct {v2, v4}, Lcom/google/android/gms/vision/text/TextBlock;-><init>(Landroid/util/SparseArray;)V

    invoke-virtual {p1, v1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_5
    return-object p1

    .line 8
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No frame supplied."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final isOperational()Z
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/google/android/gms/vision/text/TextRecognizer;->zzez:Lcom/google/android/gms/internal/vision/zzak;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/vision/zzm;->isOperational()Z

    move-result v0

    return v0
.end method

.method public final release()V
    .locals 1

    .line 57
    invoke-super {p0}, Lcom/google/android/gms/vision/Detector;->release()V

    .line 58
    iget-object v0, p0, Lcom/google/android/gms/vision/text/TextRecognizer;->zzez:Lcom/google/android/gms/internal/vision/zzak;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/vision/zzm;->zzp()V

    return-void
.end method
