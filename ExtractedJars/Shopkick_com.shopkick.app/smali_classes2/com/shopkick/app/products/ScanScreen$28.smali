.class synthetic Lcom/shopkick/app/products/ScanScreen$28;
.super Ljava/lang/Object;
.source "ScanScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/ScanScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$app$products$ScanScreen$ScanMode:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 419
    invoke-static {}, Lcom/shopkick/app/products/ScanScreen$ScanMode;->values()[Lcom/shopkick/app/products/ScanScreen$ScanMode;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/products/ScanScreen$28;->$SwitchMap$com$shopkick$app$products$ScanScreen$ScanMode:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/app/products/ScanScreen$28;->$SwitchMap$com$shopkick$app$products$ScanScreen$ScanMode:[I

    sget-object v1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->BARCODE:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    invoke-virtual {v1}, Lcom/shopkick/app/products/ScanScreen$ScanMode;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/app/products/ScanScreen$28;->$SwitchMap$com$shopkick$app$products$ScanScreen$ScanMode:[I

    sget-object v1, Lcom/shopkick/app/products/ScanScreen$ScanMode;->IR:Lcom/shopkick/app/products/ScanScreen$ScanMode;

    invoke-virtual {v1}, Lcom/shopkick/app/products/ScanScreen$ScanMode;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
