.class synthetic Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice$1;
.super Ljava/lang/Object;
.source "ScannedBarcodeAdvice.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$apiandroid$barcode$VerifyBarcodeMode:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 104
    invoke-static {}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->values()[Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice$1;->$SwitchMap$com$ibotta$android$apiandroid$barcode$VerifyBarcodeMode:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice$1;->$SwitchMap$com$ibotta$android$apiandroid$barcode$VerifyBarcodeMode:[I

    sget-object v1, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->CHECK_PRODUCT:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdvice$1;->$SwitchMap$com$ibotta$android$apiandroid$barcode$VerifyBarcodeMode:[I

    sget-object v1, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->VERIFY:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
