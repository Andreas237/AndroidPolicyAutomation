.class abstract Lcom/ibotta/android/barcode/BarcodeGenerator$BaseSquareWriter;
.super Ljava/lang/Object;
.source "BarcodeGenerator.java"

# interfaces
.implements Lcom/google/zxing/Writer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/barcode/BarcodeGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "BaseSquareWriter"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/barcode/BarcodeGenerator$1;)V
    .locals 0

    .line 145
    invoke-direct {p0}, Lcom/ibotta/android/barcode/BarcodeGenerator$BaseSquareWriter;-><init>()V

    return-void
.end method

.method protected static renderResult(Lcom/google/zxing/common/BitMatrix;II)Lcom/google/zxing/common/BitMatrix;
    .locals 8

    .line 147
    invoke-virtual {p0}, Lcom/google/zxing/common/BitMatrix;->getWidth()I

    move-result v0

    .line 148
    invoke-virtual {p0}, Lcom/google/zxing/common/BitMatrix;->getHeight()I

    move-result v1

    if-ge p1, v0, :cond_0

    move p1, v0

    :cond_0
    if-ge p2, v1, :cond_1

    move p2, v1

    :cond_1
    if-le p1, v0, :cond_3

    .line 159
    div-int v2, p1, v0

    .line 160
    rem-int/2addr p1, v0

    if-lez p1, :cond_2

    add-int/lit8 v2, v2, 0x1

    :cond_2
    mul-int p1, v0, v2

    goto :goto_0

    :cond_3
    move p1, v0

    :goto_0
    if-le p2, v1, :cond_5

    .line 168
    div-int v2, p2, v1

    .line 169
    rem-int/2addr p2, v1

    if-lez p2, :cond_4

    add-int/lit8 v2, v2, 0x1

    :cond_4
    mul-int p2, v1, v2

    goto :goto_1

    :cond_5
    move p2, v1

    .line 177
    :goto_1
    div-int v2, p1, v0

    div-int v3, p2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 179
    new-instance v3, Lcom/google/zxing/common/BitMatrix;

    invoke-direct {v3, p1, p2}, Lcom/google/zxing/common/BitMatrix;-><init>(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    const/4 v4, 0x0

    :goto_2
    if-ge p2, v1, :cond_8

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_3
    if-ge v5, v0, :cond_7

    .line 184
    invoke-virtual {p0, v5, p2}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 185
    invoke-virtual {v3, v6, v4, v2, v2}, Lcom/google/zxing/common/BitMatrix;->setRegion(IIII)V

    :cond_6
    add-int/lit8 v5, v5, 0x1

    add-int/2addr v6, v2

    goto :goto_3

    :cond_7
    add-int/lit8 p2, p2, 0x1

    add-int/2addr v4, v2

    goto :goto_2

    :cond_8
    return-object v3
.end method
