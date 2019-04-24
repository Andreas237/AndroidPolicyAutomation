.class public final enum Lcom/ibotta/android/barcode/ScanType;
.super Ljava/lang/Enum;
.source "ScanType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/barcode/ScanType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/barcode/ScanType;

.field public static final enum CODE128:Lcom/ibotta/android/barcode/ScanType;

.field public static final enum CODE39:Lcom/ibotta/android/barcode/ScanType;

.field public static final enum CODE93:Lcom/ibotta/android/barcode/ScanType;

.field public static final enum EAN13:Lcom/ibotta/android/barcode/ScanType;

.field public static final enum EAN8:Lcom/ibotta/android/barcode/ScanType;

.field public static final enum ITF:Lcom/ibotta/android/barcode/ScanType;

.field public static final enum PDF417:Lcom/ibotta/android/barcode/ScanType;

.field public static final enum QR:Lcom/ibotta/android/barcode/ScanType;

.field public static final enum UPCA:Lcom/ibotta/android/barcode/ScanType;

.field public static final enum UPCE:Lcom/ibotta/android/barcode/ScanType;


# instance fields
.field private final barcodeType:Lcom/ibotta/api/model/common/BarcodeType;

.field private final scanditSymbol:I

.field private final zBarSymbol:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 14
    new-instance v6, Lcom/ibotta/android/barcode/ScanType;

    const-string v1, "UPCA"

    sget-object v3, Lcom/ibotta/api/model/common/BarcodeType;->UPCA:Lcom/ibotta/api/model/common/BarcodeType;

    sget v5, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UPCA:I

    const/4 v2, 0x0

    const/16 v4, 0xc

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/barcode/ScanType;-><init>(Ljava/lang/String;ILcom/ibotta/api/model/common/BarcodeType;II)V

    sput-object v6, Lcom/ibotta/android/barcode/ScanType;->UPCA:Lcom/ibotta/android/barcode/ScanType;

    .line 15
    new-instance v0, Lcom/ibotta/android/barcode/ScanType;

    const-string v8, "UPCE"

    sget-object v10, Lcom/ibotta/api/model/common/BarcodeType;->UPCE:Lcom/ibotta/api/model/common/BarcodeType;

    sget v12, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_UPCE:I

    const/4 v9, 0x1

    const/16 v11, 0x9

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/barcode/ScanType;-><init>(Ljava/lang/String;ILcom/ibotta/api/model/common/BarcodeType;II)V

    sput-object v0, Lcom/ibotta/android/barcode/ScanType;->UPCE:Lcom/ibotta/android/barcode/ScanType;

    .line 16
    new-instance v0, Lcom/ibotta/android/barcode/ScanType;

    const-string v2, "EAN8"

    sget-object v4, Lcom/ibotta/api/model/common/BarcodeType;->EAN13:Lcom/ibotta/api/model/common/BarcodeType;

    sget v6, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_EAN8:I

    const/4 v3, 0x2

    const/16 v5, 0x8

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/barcode/ScanType;-><init>(Ljava/lang/String;ILcom/ibotta/api/model/common/BarcodeType;II)V

    sput-object v0, Lcom/ibotta/android/barcode/ScanType;->EAN8:Lcom/ibotta/android/barcode/ScanType;

    .line 17
    new-instance v0, Lcom/ibotta/android/barcode/ScanType;

    const-string v8, "EAN13"

    sget-object v10, Lcom/ibotta/api/model/common/BarcodeType;->EAN13:Lcom/ibotta/api/model/common/BarcodeType;

    sget v12, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_EAN13:I

    const/4 v9, 0x3

    const/16 v11, 0xd

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/barcode/ScanType;-><init>(Ljava/lang/String;ILcom/ibotta/api/model/common/BarcodeType;II)V

    sput-object v0, Lcom/ibotta/android/barcode/ScanType;->EAN13:Lcom/ibotta/android/barcode/ScanType;

    .line 18
    new-instance v0, Lcom/ibotta/android/barcode/ScanType;

    const-string v2, "PDF417"

    sget-object v4, Lcom/ibotta/api/model/common/BarcodeType;->PDF417:Lcom/ibotta/api/model/common/BarcodeType;

    sget v6, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_PDF417:I

    const/4 v3, 0x4

    const/16 v5, 0x39

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/barcode/ScanType;-><init>(Ljava/lang/String;ILcom/ibotta/api/model/common/BarcodeType;II)V

    sput-object v0, Lcom/ibotta/android/barcode/ScanType;->PDF417:Lcom/ibotta/android/barcode/ScanType;

    .line 19
    new-instance v0, Lcom/ibotta/android/barcode/ScanType;

    const-string v8, "QR"

    sget-object v10, Lcom/ibotta/api/model/common/BarcodeType;->QR:Lcom/ibotta/api/model/common/BarcodeType;

    sget v12, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_QR:I

    const/4 v9, 0x5

    const/16 v11, 0x40

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/barcode/ScanType;-><init>(Ljava/lang/String;ILcom/ibotta/api/model/common/BarcodeType;II)V

    sput-object v0, Lcom/ibotta/android/barcode/ScanType;->QR:Lcom/ibotta/android/barcode/ScanType;

    .line 20
    new-instance v0, Lcom/ibotta/android/barcode/ScanType;

    const-string v2, "CODE39"

    sget-object v4, Lcom/ibotta/api/model/common/BarcodeType;->CODE39:Lcom/ibotta/api/model/common/BarcodeType;

    sget v6, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE39:I

    const/4 v3, 0x6

    const/16 v5, 0x27

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/barcode/ScanType;-><init>(Ljava/lang/String;ILcom/ibotta/api/model/common/BarcodeType;II)V

    sput-object v0, Lcom/ibotta/android/barcode/ScanType;->CODE39:Lcom/ibotta/android/barcode/ScanType;

    .line 21
    new-instance v0, Lcom/ibotta/android/barcode/ScanType;

    const-string v8, "CODE128"

    sget-object v10, Lcom/ibotta/api/model/common/BarcodeType;->CODE128:Lcom/ibotta/api/model/common/BarcodeType;

    sget v12, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE128:I

    const/4 v9, 0x7

    const/16 v11, 0x80

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/barcode/ScanType;-><init>(Ljava/lang/String;ILcom/ibotta/api/model/common/BarcodeType;II)V

    sput-object v0, Lcom/ibotta/android/barcode/ScanType;->CODE128:Lcom/ibotta/android/barcode/ScanType;

    .line 22
    new-instance v0, Lcom/ibotta/android/barcode/ScanType;

    const-string v2, "CODE93"

    sget-object v4, Lcom/ibotta/api/model/common/BarcodeType;->CODE93:Lcom/ibotta/api/model/common/BarcodeType;

    sget v6, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_CODE93:I

    const/16 v3, 0x8

    const/16 v5, 0x5d

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/barcode/ScanType;-><init>(Ljava/lang/String;ILcom/ibotta/api/model/common/BarcodeType;II)V

    sput-object v0, Lcom/ibotta/android/barcode/ScanType;->CODE93:Lcom/ibotta/android/barcode/ScanType;

    .line 23
    new-instance v0, Lcom/ibotta/android/barcode/ScanType;

    const-string v8, "ITF"

    sget-object v10, Lcom/ibotta/api/model/common/BarcodeType;->ITF:Lcom/ibotta/api/model/common/BarcodeType;

    sget v12, Lcom/scandit/recognition/Barcode;->SYMBOLOGY_INTERLEAVED_2_OF_5:I

    const/16 v9, 0x9

    const/16 v11, 0x19

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ibotta/android/barcode/ScanType;-><init>(Ljava/lang/String;ILcom/ibotta/api/model/common/BarcodeType;II)V

    sput-object v0, Lcom/ibotta/android/barcode/ScanType;->ITF:Lcom/ibotta/android/barcode/ScanType;

    const/16 v0, 0xa

    .line 13
    new-array v0, v0, [Lcom/ibotta/android/barcode/ScanType;

    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->UPCA:Lcom/ibotta/android/barcode/ScanType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->UPCE:Lcom/ibotta/android/barcode/ScanType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->EAN8:Lcom/ibotta/android/barcode/ScanType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->EAN13:Lcom/ibotta/android/barcode/ScanType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->PDF417:Lcom/ibotta/android/barcode/ScanType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->QR:Lcom/ibotta/android/barcode/ScanType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->CODE39:Lcom/ibotta/android/barcode/ScanType;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->CODE128:Lcom/ibotta/android/barcode/ScanType;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->CODE93:Lcom/ibotta/android/barcode/ScanType;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->ITF:Lcom/ibotta/android/barcode/ScanType;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/barcode/ScanType;->$VALUES:[Lcom/ibotta/android/barcode/ScanType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/ibotta/api/model/common/BarcodeType;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/common/BarcodeType;",
            "II)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/barcode/ScanType;->barcodeType:Lcom/ibotta/api/model/common/BarcodeType;

    .line 31
    iput p4, p0, Lcom/ibotta/android/barcode/ScanType;->zBarSymbol:I

    .line 32
    iput p5, p0, Lcom/ibotta/android/barcode/ScanType;->scanditSymbol:I

    return-void
.end method

.method public static fromBarcodeType(Lcom/ibotta/api/model/common/BarcodeType;)Lcom/ibotta/android/barcode/ScanType;
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 54
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/api/model/common/BarcodeType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/android/barcode/ScanType;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/barcode/ScanType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Unexpected ScanType: %1$s"

    const/4 v3, 0x1

    .line 56
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p0, v3, v4

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method public static fromScanditSymbol(I)Lcom/ibotta/android/barcode/ScanType;
    .locals 5

    .line 81
    invoke-static {}, Lcom/ibotta/android/barcode/ScanType;->values()[Lcom/ibotta/android/barcode/ScanType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 82
    invoke-virtual {v3}, Lcom/ibotta/android/barcode/ScanType;->getScanditSymbol()I

    move-result v4

    if-ne v4, p0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    return-object v3
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/barcode/ScanType;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 70
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/barcode/ScanType;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/barcode/ScanType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/barcode/ScanType;
    .locals 1

    .line 13
    const-class v0, Lcom/ibotta/android/barcode/ScanType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/barcode/ScanType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/barcode/ScanType;
    .locals 1

    .line 13
    sget-object v0, Lcom/ibotta/android/barcode/ScanType;->$VALUES:[Lcom/ibotta/android/barcode/ScanType;

    invoke-virtual {v0}, [Lcom/ibotta/android/barcode/ScanType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/barcode/ScanType;

    return-object v0
.end method


# virtual methods
.method public getBarcodeType()Lcom/ibotta/api/model/common/BarcodeType;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/barcode/ScanType;->barcodeType:Lcom/ibotta/api/model/common/BarcodeType;

    return-object v0
.end method

.method public getScanditSymbol()I
    .locals 1

    .line 44
    iget v0, p0, Lcom/ibotta/android/barcode/ScanType;->scanditSymbol:I

    return v0
.end method

.method public getzBarSymbol()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/ibotta/android/barcode/ScanType;->zBarSymbol:I

    return v0
.end method
