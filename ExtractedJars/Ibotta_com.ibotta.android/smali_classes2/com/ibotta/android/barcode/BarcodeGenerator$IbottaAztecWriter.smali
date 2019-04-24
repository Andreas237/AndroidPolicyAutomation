.class Lcom/ibotta/android/barcode/BarcodeGenerator$IbottaAztecWriter;
.super Lcom/ibotta/android/barcode/BarcodeGenerator$BaseSquareWriter;
.source "BarcodeGenerator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/barcode/BarcodeGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "IbottaAztecWriter"
.end annotation


# static fields
.field private static final DEFAULT_CHARSET:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "ISO-8859-1"

    .line 115
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/barcode/BarcodeGenerator$IbottaAztecWriter;->DEFAULT_CHARSET:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 117
    invoke-direct {p0, v0}, Lcom/ibotta/android/barcode/BarcodeGenerator$BaseSquareWriter;-><init>(Lcom/ibotta/android/barcode/BarcodeGenerator$1;)V

    return-void
.end method

.method private static encode(Ljava/lang/String;Lcom/google/zxing/BarcodeFormat;Ljava/nio/charset/Charset;I)Lcom/google/zxing/common/BitMatrix;
    .locals 0

    .line 136
    sget-object p2, Lcom/google/zxing/BarcodeFormat;->AZTEC:Lcom/google/zxing/BarcodeFormat;

    if-ne p1, p2, :cond_0

    .line 139
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p3, p1}, Lcom/google/zxing/aztec/encoder/Encoder;->encode([BII)Lcom/google/zxing/aztec/encoder/AztecCode;

    move-result-object p0

    .line 140
    invoke-virtual {p0}, Lcom/google/zxing/aztec/encoder/AztecCode;->getMatrix()Lcom/google/zxing/common/BitMatrix;

    move-result-object p0

    return-object p0

    .line 137
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Can only encode AZTEC, but got "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public encode(Ljava/lang/String;Lcom/google/zxing/BarcodeFormat;II)Lcom/google/zxing/common/BitMatrix;
    .locals 2

    .line 122
    sget-object v0, Lcom/ibotta/android/barcode/BarcodeGenerator$IbottaAztecWriter;->DEFAULT_CHARSET:Ljava/nio/charset/Charset;

    const/16 v1, 0x21

    invoke-static {p1, p2, v0, v1}, Lcom/ibotta/android/barcode/BarcodeGenerator$IbottaAztecWriter;->encode(Ljava/lang/String;Lcom/google/zxing/BarcodeFormat;Ljava/nio/charset/Charset;I)Lcom/google/zxing/common/BitMatrix;

    move-result-object p1

    invoke-static {p1, p3, p4}, Lcom/ibotta/android/barcode/BarcodeGenerator$IbottaAztecWriter;->renderResult(Lcom/google/zxing/common/BitMatrix;II)Lcom/google/zxing/common/BitMatrix;

    move-result-object p1

    return-object p1
.end method

.method public encode(Ljava/lang/String;Lcom/google/zxing/BarcodeFormat;IILjava/util/Map;)Lcom/google/zxing/common/BitMatrix;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/zxing/BarcodeFormat;",
            "II",
            "Ljava/util/Map<",
            "Lcom/google/zxing/EncodeHintType;",
            "*>;)",
            "Lcom/google/zxing/common/BitMatrix;"
        }
    .end annotation

    .line 128
    sget-object v0, Lcom/google/zxing/EncodeHintType;->CHARACTER_SET:Lcom/google/zxing/EncodeHintType;

    invoke-interface {p5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 129
    sget-object v1, Lcom/google/zxing/EncodeHintType;->ERROR_CORRECTION:Lcom/google/zxing/EncodeHintType;

    invoke-interface {p5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/Number;

    if-nez v0, :cond_0

    .line 130
    sget-object v0, Lcom/ibotta/android/barcode/BarcodeGenerator$IbottaAztecWriter;->DEFAULT_CHARSET:Ljava/nio/charset/Charset;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    :goto_0
    if-nez p5, :cond_1

    const/16 p5, 0x21

    goto :goto_1

    .line 131
    :cond_1
    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result p5

    .line 130
    :goto_1
    invoke-static {p1, p2, v0, p5}, Lcom/ibotta/android/barcode/BarcodeGenerator$IbottaAztecWriter;->encode(Ljava/lang/String;Lcom/google/zxing/BarcodeFormat;Ljava/nio/charset/Charset;I)Lcom/google/zxing/common/BitMatrix;

    move-result-object p1

    .line 132
    invoke-static {p1, p3, p4}, Lcom/ibotta/android/barcode/BarcodeGenerator$IbottaAztecWriter;->renderResult(Lcom/google/zxing/common/BitMatrix;II)Lcom/google/zxing/common/BitMatrix;

    move-result-object p1

    return-object p1
.end method
