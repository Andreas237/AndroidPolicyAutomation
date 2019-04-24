.class public Lcom/scandit/recognition/BarcodeScannerSession;
.super Lcom/scandit/recognition/NativeHandle;
.source "BarcodeScannerSession.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/recognition/BarcodeScannerSession$WeakBarcodeReference;
    }
.end annotation


# instance fields
.field private mGcQueue:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Lcom/scandit/recognition/Barcode;",
            ">;"
        }
    .end annotation
.end field

.field private mJavaBarcodesMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/scandit/recognition/Barcode;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(J)V
    .locals 1

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    .line 49
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/BarcodeScannerSession;->mJavaBarcodesMap:Ljava/util/HashMap;

    .line 50
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v0, p0, Lcom/scandit/recognition/BarcodeScannerSession;->mGcQueue:Ljava/lang/ref/ReferenceQueue;

    .line 55
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_session_retain(J)V

    return-void
.end method

.method private removeStaleBarcodeReferences()V
    .locals 4

    .line 120
    :goto_0
    iget-object v0, p0, Lcom/scandit/recognition/BarcodeScannerSession;->mGcQueue:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v0

    check-cast v0, Lcom/scandit/recognition/BarcodeScannerSession$WeakBarcodeReference;

    if-eqz v0, :cond_0

    .line 121
    iget-object v1, p0, Lcom/scandit/recognition/BarcodeScannerSession;->mJavaBarcodesMap:Ljava/util/HashMap;

    invoke-static {v0}, Lcom/scandit/recognition/BarcodeScannerSession$WeakBarcodeReference;->access$000(Lcom/scandit/recognition/BarcodeScannerSession$WeakBarcodeReference;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 71
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSession;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_session_clear(J)V

    return-void
.end method

.method public convertNativeToJavaBarcodeList(J)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lcom/scandit/recognition/Barcode;",
            ">;"
        }
    .end annotation

    .line 126
    invoke-direct {p0}, Lcom/scandit/recognition/BarcodeScannerSession;->removeStaleBarcodeReferences()V

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 129
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sc_barcode_array_get_size(J)J

    move-result-wide v1

    long-to-int v1, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    int-to-long v3, v2

    .line 131
    invoke-static {p1, p2, v3, v4}, Lcom/scandit/recognition/Native;->sc_barcode_array_get_item_at(JJ)J

    move-result-wide v3

    .line 132
    iget-object v5, p0, Lcom/scandit/recognition/BarcodeScannerSession;->mJavaBarcodesMap:Ljava/util/HashMap;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/ref/WeakReference;

    if-eqz v5, :cond_0

    .line 134
    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/scandit/recognition/Barcode;

    if-eqz v5, :cond_0

    .line 136
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 140
    :cond_0
    new-instance v5, Lcom/scandit/recognition/Barcode;

    invoke-direct {v5, v3, v4}, Lcom/scandit/recognition/Barcode;-><init>(J)V

    .line 141
    iget-object v6, p0, Lcom/scandit/recognition/BarcodeScannerSession;->mJavaBarcodesMap:Ljava/util/HashMap;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    new-instance v4, Lcom/scandit/recognition/BarcodeScannerSession$WeakBarcodeReference;

    iget-object v7, p0, Lcom/scandit/recognition/BarcodeScannerSession;->mGcQueue:Ljava/lang/ref/ReferenceQueue;

    const/4 v8, 0x0

    invoke-direct {v4, v5, v7, v8}, Lcom/scandit/recognition/BarcodeScannerSession$WeakBarcodeReference;-><init>(Lcom/scandit/recognition/Barcode;Ljava/lang/ref/ReferenceQueue;Lcom/scandit/recognition/BarcodeScannerSession$1;)V

    invoke-virtual {v6, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getAllRecognizedCodes()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/scandit/recognition/Barcode;",
            ">;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    .line 111
    :try_start_0
    iget-wide v2, p0, Lcom/scandit/recognition/BarcodeScannerSession;->mNative:J

    invoke-static {v2, v3}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_session_get_all_recognized_codes(J)J

    move-result-wide v0

    .line 112
    invoke-virtual {p0, v0, v1}, Lcom/scandit/recognition/BarcodeScannerSession;->convertNativeToJavaBarcodeList(J)Ljava/util/List;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_array_release(J)V

    return-object v2

    :catchall_0
    move-exception v2

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_array_release(J)V

    throw v2
.end method

.method public getLastProcessedFrameId()J
    .locals 2

    .line 82
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScannerSession;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_session_get_last_processed_frame_id(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getNewlyLocalizedCodes()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/scandit/recognition/Barcode;",
            ">;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    .line 94
    :try_start_0
    iget-wide v2, p0, Lcom/scandit/recognition/BarcodeScannerSession;->mNative:J

    invoke-static {v2, v3}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_session_get_newly_localized_codes(J)J

    move-result-wide v0

    .line 95
    invoke-virtual {p0, v0, v1}, Lcom/scandit/recognition/BarcodeScannerSession;->convertNativeToJavaBarcodeList(J)Ljava/util/List;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_array_release(J)V

    return-object v2

    :catchall_0
    move-exception v2

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_array_release(J)V

    throw v2
.end method

.method public getNewlyRecognizedCodes()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/scandit/recognition/Barcode;",
            ">;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    .line 157
    :try_start_0
    iget-wide v2, p0, Lcom/scandit/recognition/BarcodeScannerSession;->mNative:J

    invoke-static {v2, v3}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_session_get_newly_recognized_codes(J)J

    move-result-wide v0

    .line 158
    invoke-virtual {p0, v0, v1}, Lcom/scandit/recognition/BarcodeScannerSession;->convertNativeToJavaBarcodeList(J)Ljava/util/List;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_array_release(J)V

    return-object v2

    :catchall_0
    move-exception v2

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_array_release(J)V

    throw v2
.end method

.method protected release(J)V
    .locals 0

    .line 60
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_session_release(J)V

    return-void
.end method
