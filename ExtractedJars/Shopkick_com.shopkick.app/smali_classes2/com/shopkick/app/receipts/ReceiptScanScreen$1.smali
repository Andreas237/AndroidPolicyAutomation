.class final Lcom/shopkick/app/receipts/ReceiptScanScreen$1;
.super Ljava/util/ArrayList;
.source "ReceiptScanScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/ReceiptScanScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    .line 114
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x4

    .line 115
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen$1;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x3

    .line 116
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen$1;->add(Ljava/lang/Object;)Z

    return-void
.end method
