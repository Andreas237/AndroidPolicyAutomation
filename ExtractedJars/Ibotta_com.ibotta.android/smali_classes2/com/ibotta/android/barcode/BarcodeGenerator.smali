.class public Lcom/ibotta/android/barcode/BarcodeGenerator;
.super Ljava/lang/Object;
.source "BarcodeGenerator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/barcode/BarcodeGenerator$BaseSquareWriter;,
        Lcom/ibotta/android/barcode/BarcodeGenerator$IbottaAztecWriter;
    }
.end annotation


# static fields
.field private static final BLACK:I = -0x1000000

.field private static final WHITE:I = -0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static encodeAsBitmap(Ljava/lang/String;Lcom/google/zxing/BarcodeFormat;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/WriterException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 64
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/barcode/BarcodeGenerator;->guessAppropriateEncoding(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 65
    new-instance v7, Ljava/util/EnumMap;

    const-class v2, Lcom/google/zxing/EncodeHintType;

    invoke-direct {v7, v2}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    if-eqz v1, :cond_1

    .line 67
    sget-object v2, Lcom/google/zxing/EncodeHintType;->CHARACTER_SET:Lcom/google/zxing/EncodeHintType;

    invoke-interface {v7, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :cond_1
    sget-object v1, Lcom/google/zxing/BarcodeFormat;->AZTEC:Lcom/google/zxing/BarcodeFormat;

    if-ne p1, v1, :cond_2

    .line 73
    new-instance v1, Lcom/ibotta/android/barcode/BarcodeGenerator$IbottaAztecWriter;

    invoke-direct {v1}, Lcom/ibotta/android/barcode/BarcodeGenerator$IbottaAztecWriter;-><init>()V

    move-object v2, v1

    goto :goto_0

    .line 74
    :cond_2
    sget-object v1, Lcom/google/zxing/BarcodeFormat;->PDF_417:Lcom/google/zxing/BarcodeFormat;

    if-ne p1, v1, :cond_3

    .line 75
    new-instance v1, Lcom/google/zxing/pdf417/PDF417Writer;

    invoke-direct {v1}, Lcom/google/zxing/pdf417/PDF417Writer;-><init>()V

    move-object v2, v1

    goto :goto_0

    .line 77
    :cond_3
    new-instance v1, Lcom/google/zxing/MultiFormatWriter;

    invoke-direct {v1}, Lcom/google/zxing/MultiFormatWriter;-><init>()V

    move-object v2, v1

    :goto_0
    const/4 v1, 0x0

    move-object v3, p0

    move-object v4, p1

    move v5, p2

    move v6, p3

    .line 82
    :try_start_0
    invoke-interface/range {v2 .. v7}, Lcom/google/zxing/Writer;->encode(Ljava/lang/String;Lcom/google/zxing/BarcodeFormat;IILjava/util/Map;)Lcom/google/zxing/common/BitMatrix;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    invoke-virtual {p0}, Lcom/google/zxing/common/BitMatrix;->getWidth()I

    move-result v8

    .line 89
    invoke-virtual {p0}, Lcom/google/zxing/common/BitMatrix;->getHeight()I

    move-result v9

    mul-int p1, v8, v9

    .line 90
    new-array v3, p1, [I

    const/4 p1, 0x0

    :goto_1
    if-ge p1, v9, :cond_6

    mul-int p2, p1, v8

    const/4 p3, 0x0

    :goto_2
    if-ge p3, v8, :cond_5

    add-int v0, p2, p3

    .line 94
    invoke-virtual {p0, p3, p1}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    move-result v2

    if-eqz v2, :cond_4

    const/high16 v2, -0x1000000

    goto :goto_3

    :cond_4
    const/4 v2, -0x1

    :goto_3
    aput v2, v3, v0

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_5
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 98
    :cond_6
    invoke-static {v8, v9, p4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move v5, v8

    .line 99
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object p0

    :catch_0
    move-exception p0

    const-string p1, "Failed to generate barcode."

    .line 84
    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static generate(Ljava/lang/String;Lcom/ibotta/android/barcode/Format;II)Landroid/graphics/Bitmap;
    .locals 1

    .line 29
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {p0, p1, p2, p3, v0}, Lcom/ibotta/android/barcode/BarcodeGenerator;->generate(Ljava/lang/String;Lcom/ibotta/android/barcode/Format;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static generate(Ljava/lang/String;Lcom/ibotta/android/barcode/Format;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 1

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_1

    .line 40
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/ibotta/android/barcode/Format;->getZxingFormat()Lcom/google/zxing/BarcodeFormat;

    move-result-object p1

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/barcode/BarcodeGenerator;->encodeAsBitmap(Ljava/lang/String;Lcom/google/zxing/BarcodeFormat;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "Failed to generate barcode."

    const/4 p2, 0x0

    .line 42
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :cond_1
    :goto_1
    return-object v0
.end method

.method private static guessAppropriateEncoding(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    .line 106
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 107
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0xff

    if-le v1, v2, :cond_0

    const-string p0, "UTF-8"

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
