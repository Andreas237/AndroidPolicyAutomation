.class Lcom/scandit/recognition/BarcodeScannerSession$WeakBarcodeReference;
.super Ljava/lang/ref/WeakReference;
.source "BarcodeScannerSession.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/recognition/BarcodeScannerSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "WeakBarcodeReference"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/WeakReference<",
        "Lcom/scandit/recognition/Barcode;",
        ">;"
    }
.end annotation


# instance fields
.field private mHandle:J


# direct methods
.method private constructor <init>(Lcom/scandit/recognition/Barcode;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/scandit/recognition/Barcode;",
            "Ljava/lang/ref/ReferenceQueue<",
            "Lcom/scandit/recognition/Barcode;",
            ">;)V"
        }
    .end annotation

    .line 168
    invoke-direct {p0, p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 169
    invoke-virtual {p1}, Lcom/scandit/recognition/Barcode;->getHandle()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/scandit/recognition/BarcodeScannerSession$WeakBarcodeReference;->mHandle:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/scandit/recognition/Barcode;Ljava/lang/ref/ReferenceQueue;Lcom/scandit/recognition/BarcodeScannerSession$1;)V
    .locals 0

    .line 164
    invoke-direct {p0, p1, p2}, Lcom/scandit/recognition/BarcodeScannerSession$WeakBarcodeReference;-><init>(Lcom/scandit/recognition/Barcode;Ljava/lang/ref/ReferenceQueue;)V

    return-void
.end method

.method static synthetic access$000(Lcom/scandit/recognition/BarcodeScannerSession$WeakBarcodeReference;)J
    .locals 2

    .line 164
    invoke-direct {p0}, Lcom/scandit/recognition/BarcodeScannerSession$WeakBarcodeReference;->getHandle()J

    move-result-wide v0

    return-wide v0
.end method

.method private getHandle()J
    .locals 2

    .line 173
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSession$WeakBarcodeReference;->mHandle:J

    return-wide v0
.end method
