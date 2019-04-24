.class public final enum Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;
.super Ljava/lang/Enum;
.source "VerifyBarcodeMode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

.field public static final enum CHECK_PRODUCT:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

.field public static final enum VERIFY:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 7
    new-instance v0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    const-string v1, "CHECK_PRODUCT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->CHECK_PRODUCT:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    .line 8
    new-instance v0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    const-string v1, "VERIFY"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->VERIFY:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    const/4 v0, 0x2

    .line 6
    new-array v0, v0, [Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    sget-object v1, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->CHECK_PRODUCT:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->VERIFY:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->$VALUES:[Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;
    .locals 1

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 17
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->$VALUES:[Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    invoke-virtual {v0}, [Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    return-object v0
.end method
