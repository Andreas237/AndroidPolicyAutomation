.class public final enum Lcom/ibotta/android/barcode/Format;
.super Ljava/lang/Enum;
.source "Format.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/barcode/Format;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/barcode/Format;

.field public static final enum AZTEC:Lcom/ibotta/android/barcode/Format;

.field public static final enum CODE128:Lcom/ibotta/android/barcode/Format;

.field public static final enum CODE39:Lcom/ibotta/android/barcode/Format;

.field public static final enum EAN13:Lcom/ibotta/android/barcode/Format;

.field public static final enum PDF417:Lcom/ibotta/android/barcode/Format;

.field public static final enum QR:Lcom/ibotta/android/barcode/Format;

.field public static final enum UPCA:Lcom/ibotta/android/barcode/Format;


# instance fields
.field private heightDim:F

.field private widthDim:F

.field private zxingFormat:Lcom/google/zxing/BarcodeFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 16
    new-instance v6, Lcom/ibotta/android/barcode/Format;

    const-string v1, "UPCA"

    sget-object v3, Lcom/google/zxing/BarcodeFormat;->UPC_A:Lcom/google/zxing/BarcodeFormat;

    const/4 v2, 0x0

    const/high16 v4, -0x40800000    # -1.0f

    const v5, 0x3f828f5c    # 1.02f

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/barcode/Format;-><init>(Ljava/lang/String;ILcom/google/zxing/BarcodeFormat;FF)V

    sput-object v6, Lcom/ibotta/android/barcode/Format;->UPCA:Lcom/ibotta/android/barcode/Format;

    .line 17
    new-instance v0, Lcom/ibotta/android/barcode/Format;

    const-string v8, "EAN13"

    sget-object v10, Lcom/google/zxing/BarcodeFormat;->EAN_13:Lcom/google/zxing/BarcodeFormat;

    const/4 v9, 0x1

    const/high16 v11, -0x40800000    # -1.0f

    const v12, 0x3f828f5c    # 1.02f

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/barcode/Format;-><init>(Ljava/lang/String;ILcom/google/zxing/BarcodeFormat;FF)V

    sput-object v0, Lcom/ibotta/android/barcode/Format;->EAN13:Lcom/ibotta/android/barcode/Format;

    .line 18
    new-instance v0, Lcom/ibotta/android/barcode/Format;

    const-string v2, "PDF417"

    sget-object v4, Lcom/google/zxing/BarcodeFormat;->PDF_417:Lcom/google/zxing/BarcodeFormat;

    const/4 v3, 0x2

    const/high16 v5, -0x40000000    # -2.0f

    const/high16 v6, -0x40000000    # -2.0f

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/barcode/Format;-><init>(Ljava/lang/String;ILcom/google/zxing/BarcodeFormat;FF)V

    sput-object v0, Lcom/ibotta/android/barcode/Format;->PDF417:Lcom/ibotta/android/barcode/Format;

    .line 19
    new-instance v0, Lcom/ibotta/android/barcode/Format;

    const-string v8, "QR"

    sget-object v10, Lcom/google/zxing/BarcodeFormat;->QR_CODE:Lcom/google/zxing/BarcodeFormat;

    const/4 v9, 0x3

    const/high16 v11, 0x3f800000    # 1.0f

    const/high16 v12, 0x3f800000    # 1.0f

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/barcode/Format;-><init>(Ljava/lang/String;ILcom/google/zxing/BarcodeFormat;FF)V

    sput-object v0, Lcom/ibotta/android/barcode/Format;->QR:Lcom/ibotta/android/barcode/Format;

    .line 20
    new-instance v0, Lcom/ibotta/android/barcode/Format;

    const-string v2, "CODE39"

    sget-object v4, Lcom/google/zxing/BarcodeFormat;->CODE_39:Lcom/google/zxing/BarcodeFormat;

    const/4 v3, 0x4

    const/high16 v5, -0x40800000    # -1.0f

    const v6, 0x3f828f5c    # 1.02f

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/barcode/Format;-><init>(Ljava/lang/String;ILcom/google/zxing/BarcodeFormat;FF)V

    sput-object v0, Lcom/ibotta/android/barcode/Format;->CODE39:Lcom/ibotta/android/barcode/Format;

    .line 21
    new-instance v0, Lcom/ibotta/android/barcode/Format;

    const-string v8, "AZTEC"

    sget-object v10, Lcom/google/zxing/BarcodeFormat;->AZTEC:Lcom/google/zxing/BarcodeFormat;

    const/4 v9, 0x5

    const v11, 0x3f828f5c    # 1.02f

    const v12, 0x3f828f5c    # 1.02f

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/barcode/Format;-><init>(Ljava/lang/String;ILcom/google/zxing/BarcodeFormat;FF)V

    sput-object v0, Lcom/ibotta/android/barcode/Format;->AZTEC:Lcom/ibotta/android/barcode/Format;

    .line 22
    new-instance v0, Lcom/ibotta/android/barcode/Format;

    const-string v2, "CODE128"

    sget-object v4, Lcom/google/zxing/BarcodeFormat;->CODE_128:Lcom/google/zxing/BarcodeFormat;

    const/4 v3, 0x6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/barcode/Format;-><init>(Ljava/lang/String;ILcom/google/zxing/BarcodeFormat;FF)V

    sput-object v0, Lcom/ibotta/android/barcode/Format;->CODE128:Lcom/ibotta/android/barcode/Format;

    const/4 v0, 0x7

    .line 14
    new-array v0, v0, [Lcom/ibotta/android/barcode/Format;

    sget-object v1, Lcom/ibotta/android/barcode/Format;->UPCA:Lcom/ibotta/android/barcode/Format;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/Format;->EAN13:Lcom/ibotta/android/barcode/Format;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/Format;->PDF417:Lcom/ibotta/android/barcode/Format;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/Format;->QR:Lcom/ibotta/android/barcode/Format;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/Format;->CODE39:Lcom/ibotta/android/barcode/Format;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/Format;->AZTEC:Lcom/ibotta/android/barcode/Format;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/Format;->CODE128:Lcom/ibotta/android/barcode/Format;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/barcode/Format;->$VALUES:[Lcom/ibotta/android/barcode/Format;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/google/zxing/BarcodeFormat;FF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/zxing/BarcodeFormat;",
            "FF)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/barcode/Format;->zxingFormat:Lcom/google/zxing/BarcodeFormat;

    .line 31
    iput p4, p0, Lcom/ibotta/android/barcode/Format;->widthDim:F

    .line 32
    iput p5, p0, Lcom/ibotta/android/barcode/Format;->heightDim:F

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/android/barcode/Format;
    .locals 5

    .line 56
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 62
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/barcode/Format;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/barcode/Format;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Unexpected BarcodeGenerator Format: %1$s"

    const/4 v3, 0x1

    .line 64
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p0, v3, v4

    invoke-static {v0, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-object v1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/barcode/Format;
    .locals 1

    .line 14
    const-class v0, Lcom/ibotta/android/barcode/Format;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/barcode/Format;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/barcode/Format;
    .locals 1

    .line 14
    sget-object v0, Lcom/ibotta/android/barcode/Format;->$VALUES:[Lcom/ibotta/android/barcode/Format;

    invoke-virtual {v0}, [Lcom/ibotta/android/barcode/Format;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/barcode/Format;

    return-object v0
.end method


# virtual methods
.method public getHeight()I
    .locals 2

    .line 48
    iget v0, p0, Lcom/ibotta/android/barcode/Format;->heightDim:F

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-gez v1, :cond_0

    float-to-int v0, v0

    return v0

    .line 52
    :cond_0
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v0, v0

    iget v1, p0, Lcom/ibotta/android/barcode/Format;->heightDim:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public getWidth()I
    .locals 2

    .line 40
    iget v0, p0, Lcom/ibotta/android/barcode/Format;->widthDim:F

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-gez v1, :cond_0

    float-to-int v0, v0

    return v0

    .line 44
    :cond_0
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v0, v0

    iget v1, p0, Lcom/ibotta/android/barcode/Format;->widthDim:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public getZxingFormat()Lcom/google/zxing/BarcodeFormat;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/barcode/Format;->zxingFormat:Lcom/google/zxing/BarcodeFormat;

    return-object v0
.end method

.method public toApiName()Ljava/lang/String;
    .locals 1

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/barcode/Format;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
