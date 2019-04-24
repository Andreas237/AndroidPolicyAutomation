.class public Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;
.super Ljava/lang/Object;
.source "SKOCRProcessor.java"


# static fields
.field private static final defaultInput:Ljava/lang/String; = "jpeg"


# instance fields
.field private Tag_AmountOfElements:I

.field private Tag_BrightnessThresholdFactor:F

.field private Tag_ContrastThresholdFactor:F

.field private Tag_InputImageFormat:Ljava/lang/String;

.field private Tag_LogMode:I

.field private Tag_MBrightnessSRC:F

.field private Tag_MBrightnessThreshold:F

.field private Tag_MContrast:F

.field private Tag_MContrastThreshold:F

.field private Tag_MaxThreadNumber:I

.field private Tag_SideCropPercent:I

.field private Tag_SpotAmountThreshold:I

.field private Tag_StdImgSize:I

.field private Tag_TopologicScore:F

.field private Tag_TopologicScoreThreshold:F

.field private isOCRSkippingResize:Z

.field private skocrHandle:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "OCR"

    .line 11
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "jpeg"

    .line 17
    iput-object v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_InputImageFormat:Ljava/lang/String;

    const/16 v0, 0x32

    .line 18
    iput v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_SpotAmountThreshold:I

    const/4 v1, 0x1

    .line 19
    iput v1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MaxThreadNumber:I

    const/4 v2, 0x0

    .line 20
    iput v2, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_LogMode:I

    const/16 v3, 0x3e8

    .line 21
    iput v3, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_StdImgSize:I

    const/high16 v3, 0x41c80000    # 25.0f

    .line 22
    iput v3, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MBrightnessThreshold:F

    const/high16 v4, 0x420c0000    # 35.0f

    .line 23
    iput v4, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MContrastThreshold:F

    const/high16 v5, 0x41600000    # 14.0f

    .line 24
    iput v5, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_TopologicScoreThreshold:F

    const/high16 v6, 0x3f000000    # 0.5f

    .line 25
    iput v6, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_BrightnessThresholdFactor:F

    const v7, 0x3f2b851f    # 0.67f

    .line 26
    iput v7, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_ContrastThresholdFactor:F

    const/16 v8, 0x14

    .line 27
    iput v8, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_SideCropPercent:I

    const/4 v9, 0x0

    .line 29
    iput v9, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MBrightnessSRC:F

    .line 30
    iput v9, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MContrast:F

    .line 31
    iput v2, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_AmountOfElements:I

    .line 32
    iput v9, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_TopologicScore:F

    .line 34
    iput-boolean v1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->isOCRSkippingResize:Z

    const-string v10, "jpeg"

    .line 45
    iput-object v10, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_InputImageFormat:Ljava/lang/String;

    .line 46
    iput v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_SpotAmountThreshold:I

    .line 47
    iput v1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MaxThreadNumber:I

    .line 48
    iput v2, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_LogMode:I

    const/16 v0, 0x320

    .line 49
    iput v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_StdImgSize:I

    .line 50
    iput v8, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_SideCropPercent:I

    .line 51
    iput v3, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MBrightnessThreshold:F

    .line 52
    iput v4, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MContrastThreshold:F

    .line 53
    iput v5, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_TopologicScoreThreshold:F

    .line 54
    iput v6, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_BrightnessThresholdFactor:F

    .line 55
    iput v7, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_ContrastThresholdFactor:F

    .line 57
    iput v9, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MBrightnessSRC:F

    .line 58
    iput v9, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MContrast:F

    .line 59
    iput v2, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_AmountOfElements:I

    .line 60
    iput v9, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_TopologicScore:F

    .line 61
    invoke-direct {p0}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->initOCR()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->skocrHandle:J

    return-void
.end method

.method private native executeOCR(J[B)I
.end method

.method private getResizedBitmap(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 4

    .line 90
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 91
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float p2, p2

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr p2, v2

    int-to-float v0, v0

    div-float v2, p2, v0

    int-to-float v1, v1

    div-float/2addr p2, v1

    .line 94
    invoke-static {v2, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    mul-float/2addr v1, p2

    .line 95
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    mul-float/2addr p2, v0

    .line 96
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    const-string v0, "OCR"

    .line 97
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OCR target width = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "OCR"

    .line 98
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OCR target height = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 99
    invoke-static {p1, p2, v1, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method private native initOCR()J
.end method

.method private isValidLogMode(I)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    return v0

    :cond_1
    const/16 v1, 0x8

    if-ne p1, v1, :cond_2

    return v0

    :cond_2
    const/16 v1, 0xc

    if-ne p1, v1, :cond_3

    return v0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method private native printConfig(J)V
.end method

.method private native printResult(J)V
.end method

.method private native releaseOCR(J)V
.end method

.method private native resetOCR(JI)V
.end method

.method private setInputImgType(I)I
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "jpeg"

    .line 156
    iput-object p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_InputImageFormat:Ljava/lang/String;

    return v0

    :cond_0
    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    const-string p1, "bmp"

    .line 159
    iput-object p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_InputImageFormat:Ljava/lang/String;

    return v0

    :cond_1
    const-string p1, "jpeg"

    .line 163
    iput-object p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_InputImageFormat:Ljava/lang/String;

    const/4 p1, -0x1

    return p1
.end method

.method private native setupConfig(J)V
.end method


# virtual methods
.method public debugPrintConfig()V
    .locals 2

    .line 107
    iget-wide v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->skocrHandle:J

    invoke-direct {p0, v0, v1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->printConfig(J)V

    return-void
.end method

.method public debugPrintResult()V
    .locals 2

    .line 111
    iget-wide v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->skocrHandle:J

    invoke-direct {p0, v0, v1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->printResult(J)V

    return-void
.end method

.method public executeOCR(Landroid/graphics/Bitmap;I)I
    .locals 3

    const/4 v0, -0x1

    if-ltz p2, :cond_3

    const/16 v1, 0x64

    if-le p2, v1, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    iget-object v1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_InputImageFormat:Ljava/lang/String;

    const-string v2, "jpeg"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 74
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 75
    iget v2, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_StdImgSize:I

    invoke-direct {p0, p1, v2}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->getResizedBitmap(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 76
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {p1, v2, p2, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    const-string p1, "OCR"

    .line 77
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JPEG Size = "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    .line 79
    iget-boolean p2, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->isOCRSkippingResize:Z

    if-eqz p2, :cond_1

    .line 80
    invoke-virtual {p0, v0}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->setStdImgSize(I)V

    .line 82
    :cond_1
    iget-wide v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->skocrHandle:J

    invoke-direct {p0, v0, v1, p1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->executeOCR(J[B)I

    move-result p1

    return p1

    :cond_2
    const-string p1, "OCR"

    const-string p2, "Right now, only JPEG is supported"

    .line 84
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_3
    :goto_0
    const-string p1, "OCR"

    const-string p2, "JPEG compressionRate should be between 0 - 100"

    .line 70
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0
.end method

.method public getBrightnessThreshold()F
    .locals 1

    .line 237
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MBrightnessThreshold:F

    return v0
.end method

.method public getBrightnessThresholdFactor()F
    .locals 1

    .line 249
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_BrightnessThresholdFactor:F

    return v0
.end method

.method public getContrastThreshold()F
    .locals 1

    .line 241
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MContrastThreshold:F

    return v0
.end method

.method public getContrastThresholdFactor()F
    .locals 1

    .line 253
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_ContrastThresholdFactor:F

    return v0
.end method

.method public getInputImgType()Ljava/lang/String;
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_InputImageFormat:Ljava/lang/String;

    return-object v0
.end method

.method public getLogMode()I
    .locals 1

    .line 229
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_LogMode:I

    return v0
.end method

.method public getMaxThreadNumber()I
    .locals 1

    .line 225
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MaxThreadNumber:I

    return v0
.end method

.method public getResultBrightness()F
    .locals 1

    .line 201
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MBrightnessSRC:F

    return v0
.end method

.method public getResultContrast()F
    .locals 1

    .line 205
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MContrast:F

    return v0
.end method

.method public getResultElementAmount()I
    .locals 1

    .line 209
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_AmountOfElements:I

    return v0
.end method

.method public getResultTopologicScore()F
    .locals 1

    .line 213
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_TopologicScore:F

    return v0
.end method

.method public getSideCropPercent()I
    .locals 1

    .line 257
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_SideCropPercent:I

    return v0
.end method

.method public getSpotAmountThreshold()I
    .locals 1

    .line 221
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_SpotAmountThreshold:I

    return v0
.end method

.method public getStdImgSize()I
    .locals 1

    .line 233
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_StdImgSize:I

    return v0
.end method

.method public getTopologicScoreThreshold()F
    .locals 1

    .line 245
    iget v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_TopologicScoreThreshold:F

    return v0
.end method

.method public isOCRSkippingResize()Z
    .locals 1

    .line 193
    iget-boolean v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->isOCRSkippingResize:Z

    return v0
.end method

.method public releaseOCRProcessor()V
    .locals 2

    .line 65
    iget-wide v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->skocrHandle:J

    invoke-direct {p0, v0, v1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->releaseOCR(J)V

    return-void
.end method

.method public resetOCRProcessor(I)V
    .locals 2

    .line 103
    iget-wide v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->skocrHandle:J

    invoke-direct {p0, v0, v1, p1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->resetOCR(JI)V

    return-void
.end method

.method public setBrightnessThreshold(F)V
    .locals 0

    .line 131
    iput p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MBrightnessThreshold:F

    return-void
.end method

.method public setBrightnessThresholdFactor(F)V
    .locals 0

    .line 143
    iput p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_BrightnessThresholdFactor:F

    return-void
.end method

.method public setContrastThreshold(F)V
    .locals 0

    .line 135
    iput p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MContrastThreshold:F

    return-void
.end method

.method public setContrastThresholdFactor(F)V
    .locals 0

    .line 147
    iput p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_ContrastThresholdFactor:F

    return-void
.end method

.method public setLogMode(I)I
    .locals 2

    .line 169
    invoke-direct {p0, p1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->isValidLogMode(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 170
    iput p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_LogMode:I

    return v1

    .line 173
    :cond_0
    iput v1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_LogMode:I

    const/4 p1, -0x1

    return p1
.end method

.method public setMaxThreadNumber(I)V
    .locals 0

    .line 123
    iput p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_MaxThreadNumber:I

    return-void
.end method

.method public setOCRSkippingResize(Z)V
    .locals 0

    .line 197
    iput-boolean p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->isOCRSkippingResize:Z

    return-void
.end method

.method public setSideCropPercent(I)V
    .locals 0

    .line 151
    iput p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_SideCropPercent:I

    return-void
.end method

.method public setSpotAmountThreshold(I)V
    .locals 0

    .line 119
    iput p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_SpotAmountThreshold:I

    return-void
.end method

.method public setStdImgSize(I)V
    .locals 0

    .line 127
    iput p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_StdImgSize:I

    return-void
.end method

.method public setTopologicScoreThreshold(F)V
    .locals 0

    .line 139
    iput p1, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->Tag_TopologicScoreThreshold:F

    return-void
.end method

.method public updateConfig()V
    .locals 2

    .line 115
    iget-wide v0, p0, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->skocrHandle:J

    invoke-direct {p0, v0, v1}, Lcom/shopkick/skocr/sk_ocr/SKOCRProcessor;->setupConfig(J)V

    return-void
.end method
