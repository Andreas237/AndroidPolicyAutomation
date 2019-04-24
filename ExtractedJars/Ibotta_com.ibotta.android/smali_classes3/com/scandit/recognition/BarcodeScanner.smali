.class public final Lcom/scandit/recognition/BarcodeScanner;
.super Lcom/scandit/recognition/NativeHandle;
.source "BarcodeScanner.java"


# static fields
.field public static final CODE_DIRECTION_BOTTOM_TO_TOP:I

.field public static final CODE_DIRECTION_HORIZONTAL:I

.field public static final CODE_DIRECTION_LEFT_TO_RIGHT:I

.field public static final CODE_DIRECTION_NONE:I

.field public static final CODE_DIRECTION_RIGHT_TO_LEFT:I

.field public static final CODE_DIRECTION_TOP_TO_BOTTOM:I

.field public static final CODE_DIRECTION_VERTICAL:I


# instance fields
.field private mContext:Lcom/scandit/recognition/RecognitionContext;

.field private mSession:Lcom/scandit/recognition/BarcodeScannerSession;

.field private mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CODE_DIRECTION_NONE_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_NONE:I

    .line 36
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CODE_DIRECTION_LEFT_TO_RIGHT_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_LEFT_TO_RIGHT:I

    .line 40
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CODE_DIRECTION_RIGHT_TO_LEFT_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_RIGHT_TO_LEFT:I

    .line 44
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CODE_DIRECTION_TOP_TO_BOTTOM_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_TOP_TO_BOTTOM:I

    .line 48
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CODE_DIRECTION_BOTTOM_TO_TOP_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_BOTTOM_TO_TOP:I

    .line 53
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CODE_DIRECTION_VERTICAL_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_VERTICAL:I

    .line 58
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CODE_DIRECTION_HORIZONTAL_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_HORIZONTAL:I

    return-void
.end method

.method constructor <init>(Lcom/scandit/recognition/RecognitionContext;Lcom/scandit/recognition/BarcodeScannerSettings;)V
    .locals 4

    .line 68
    invoke-virtual {p1}, Lcom/scandit/recognition/RecognitionContext;->getHandle()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/scandit/recognition/BarcodeScannerSettings;->getHandle()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_new_with_settings(JJ)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Lcom/scandit/recognition/BarcodeScanner;->mContext:Lcom/scandit/recognition/RecognitionContext;

    .line 64
    iput-object v0, p0, Lcom/scandit/recognition/BarcodeScanner;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    .line 65
    iput-object v0, p0, Lcom/scandit/recognition/BarcodeScanner;->mSession:Lcom/scandit/recognition/BarcodeScannerSession;

    .line 70
    iput-object p1, p0, Lcom/scandit/recognition/BarcodeScanner;->mContext:Lcom/scandit/recognition/RecognitionContext;

    .line 71
    iput-object p2, p0, Lcom/scandit/recognition/BarcodeScanner;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    .line 72
    new-instance p1, Lcom/scandit/recognition/BarcodeScannerSession;

    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScanner;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_get_session(J)J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Lcom/scandit/recognition/BarcodeScannerSession;-><init>(J)V

    iput-object p1, p0, Lcom/scandit/recognition/BarcodeScanner;->mSession:Lcom/scandit/recognition/BarcodeScannerSession;

    return-void
.end method

.method public static create(Lcom/scandit/recognition/RecognitionContext;Lcom/scandit/recognition/BarcodeScannerSettings;)Lcom/scandit/recognition/BarcodeScanner;
    .locals 1

    .line 87
    new-instance v0, Lcom/scandit/recognition/BarcodeScanner;

    invoke-direct {v0, p0, p1}, Lcom/scandit/recognition/BarcodeScanner;-><init>(Lcom/scandit/recognition/RecognitionContext;Lcom/scandit/recognition/BarcodeScannerSettings;)V

    return-object v0
.end method


# virtual methods
.method public applySettings(Lcom/scandit/recognition/BarcodeScannerSettings;)V
    .locals 4

    .line 110
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScanner;->mNative:J

    invoke-virtual {p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->getHandle()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_apply_settings(JJ)V

    return-void
.end method

.method public getContext()Lcom/scandit/recognition/RecognitionContext;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/scandit/recognition/BarcodeScanner;->mContext:Lcom/scandit/recognition/RecognitionContext;

    return-object v0
.end method

.method public getSession()Lcom/scandit/recognition/BarcodeScannerSession;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/scandit/recognition/BarcodeScanner;->mSession:Lcom/scandit/recognition/BarcodeScannerSession;

    return-object v0
.end method

.method public getSettings()Lcom/scandit/recognition/BarcodeScannerSettings;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/scandit/recognition/BarcodeScanner;->mSettings:Lcom/scandit/recognition/BarcodeScannerSettings;

    return-object v0
.end method

.method public isSetupComplete()Z
    .locals 2

    .line 140
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScanner;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_is_setup_complete(J)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected release(J)V
    .locals 0

    .line 155
    invoke-static {p1, p2}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_release(J)V

    return-void
.end method

.method public waitForSetupCompleted()Z
    .locals 2

    .line 130
    iget-wide v0, p0, Lcom/scandit/recognition/BarcodeScanner;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_barcode_scanner_wait_for_setup_completed(J)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
