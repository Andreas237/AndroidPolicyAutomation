.class public abstract Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "BaseScanActivity.java"

# interfaces
.implements Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;
.implements Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;
.implements Lcom/scandit/barcodepicker/OnScanListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P::",
        "Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;",
        "C::",
        "Lcom/ibotta/android/mvp/base/MvpComponent;",
        ">",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "TP;TC;>;",
        "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanView;",
        "Lcom/scandit/barcodepicker/OnScanListener;"
    }
.end annotation


# static fields
.field private static final TAG_FLY_UP_BARCODE_HELP:Ljava/lang/String; = "fly_up_barcode_help"


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private beepSoundId:I

.field protected flBottomHalf:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901ea
    .end annotation
.end field

.field protected flScanditContainer:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901f7
    .end annotation
.end field

.field protected flTopHalf:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901fb
    .end annotation
.end field

.field protected handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private lastManualBarcode:Ljava/lang/String;

.field private lightOn:Z

.field private onBarcodeScannedRunnable:Ljava/lang/Runnable;

.field private picker:Lcom/scandit/barcodepicker/BarcodePicker;

.field private soundPool:Landroid/media/SoundPool;

.field protected spvScanPortal:Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090422
    .end annotation
.end field

.field protected tracker:Lcom/ibotta/android/tracking/Tracker;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private deinitSoundPool()V
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->soundPool:Landroid/media/SoundPool;

    invoke-virtual {v0}, Landroid/media/SoundPool;->release()V

    return-void
.end method

.method private initInstructions()V
    .locals 2

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->spvScanPortal:Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;->getInstructions()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;->setScanTip(Ljava/lang/String;)V

    return-void
.end method

.method private initPicker(Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 1

    .line 192
    new-instance v0, Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-direct {v0, p0, p2}, Lcom/scandit/barcodepicker/BarcodePicker;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/ScanSettings;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->picker:Lcom/scandit/barcodepicker/BarcodePicker;

    .line 193
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->picker:Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-virtual {p2, p0}, Lcom/scandit/barcodepicker/BarcodePicker;->setOnScanListener(Lcom/scandit/barcodepicker/OnScanListener;)V

    .line 195
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->picker:Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-virtual {p2}, Lcom/scandit/barcodepicker/BarcodePicker;->getOverlayView()Lcom/scandit/barcodepicker/ScanOverlay;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->applyTo(Lcom/scandit/barcodepicker/ScanOverlay;)V

    .line 197
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->flScanditContainer:Landroid/widget/FrameLayout;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->picker:Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initScandit()V
    .locals 2

    .line 162
    new-instance v0, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;

    sget-object v1, Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;->SCANDIT_KEY:Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;

    invoke-direct {v0, v1}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;-><init>(Lcom/ibotta/android/security/crypto/key/AppKeyProvider$KeyType;)V

    invoke-virtual {v0}, Lcom/ibotta/android/security/crypto/key/AppKeyProvider;->getKeyString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/scandit/barcodepicker/ScanditLicense;->setAppKey(Ljava/lang/String;)V

    return-void
.end method

.method private initScanditSettings(Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;)Lcom/scandit/barcodepicker/ScanSettings;
    .locals 5

    .line 166
    invoke-static {}, Lcom/scandit/barcodepicker/ScanSettings;->create()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v0

    .line 168
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->isBackCamera()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 169
    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/ScanSettings;->setCameraFacingPreference(I)V

    goto :goto_0

    .line 171
    :cond_0
    invoke-virtual {v0, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setCameraFacingPreference(I)V

    .line 174
    :goto_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->getCodeCachingDuration()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/ScanSettings;->setCodeCachingDuration(I)V

    .line 175
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->getCodeDuplicateFilter()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/ScanSettings;->setCodeDuplicateFilter(I)V

    .line 176
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->getMaxNumberOfCodesPerFrame()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/ScanSettings;->setMaxNumberOfCodesPerFrame(I)V

    .line 178
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->getScanTypes()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/barcode/ScanType;

    .line 179
    invoke-virtual {v3}, Lcom/ibotta/android/barcode/ScanType;->getScanditSymbol()I

    move-result v4

    invoke-virtual {v0, v4, v2}, Lcom/scandit/barcodepicker/ScanSettings;->setSymbologyEnabled(IZ)V

    .line 181
    invoke-virtual {p1, v3}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->getActiveSymbolCounts(Lcom/ibotta/android/barcode/ScanType;)[S

    move-result-object v4

    if-eqz v4, :cond_1

    .line 184
    invoke-virtual {v3}, Lcom/ibotta/android/barcode/ScanType;->getScanditSymbol()I

    move-result v3

    .line 183
    invoke-virtual {v0, v3}, Lcom/scandit/barcodepicker/ScanSettings;->getSymbologySettings(I)Lcom/scandit/recognition/SymbologySettings;

    move-result-object v3

    .line 184
    invoke-virtual {v3, v4}, Lcom/scandit/recognition/SymbologySettings;->setActiveSymbolCounts([S)V

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method private initSoundPool()V
    .locals 4

    .line 205
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    const/16 v3, 0x15

    if-lt v0, v3, :cond_0

    .line 206
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 207
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setLegacyStreamType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    .line 208
    new-instance v1, Landroid/media/SoundPool$Builder;

    invoke-direct {v1}, Landroid/media/SoundPool$Builder;-><init>()V

    invoke-virtual {v1, v2}, Landroid/media/SoundPool$Builder;->setMaxStreams(I)Landroid/media/SoundPool$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/media/SoundPool$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/SoundPool$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/SoundPool$Builder;->build()Landroid/media/SoundPool;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->soundPool:Landroid/media/SoundPool;

    goto :goto_0

    .line 210
    :cond_0
    new-instance v0, Landroid/media/SoundPool;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Landroid/media/SoundPool;-><init>(III)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->soundPool:Landroid/media/SoundPool;

    .line 213
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->soundPool:Landroid/media/SoundPool;

    const v1, 0x7f100002

    invoke-virtual {v0, p0, v1, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->beepSoundId:I

    return-void
.end method

.method private killPendingScans()V
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onBarcodeScannedRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 111
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onBarcodeScannedRunnable:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method

.method public static synthetic lambda$didScan$0(Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;Ljava/util/List;)V
    .locals 2

    const/4 v0, 0x0

    .line 240
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;

    invoke-interface {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;->onBarcodesScanned(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 242
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onBarcodeScannedRunnable:Ljava/lang/Runnable;

    return-void

    :catchall_0
    move-exception p1

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onBarcodeScannedRunnable:Ljava/lang/Runnable;

    throw p1
.end method


# virtual methods
.method public didScan(Lcom/scandit/barcodepicker/ScanSession;)V
    .locals 4

    .line 222
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onBarcodeScannedRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 226
    :cond_0
    invoke-interface {p1}, Lcom/scandit/barcodepicker/ScanSession;->getAllRecognizedCodes()Ljava/util/List;

    move-result-object p1

    .line 227
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 229
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scandit/recognition/Barcode;

    .line 230
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;-><init>()V

    .line 231
    invoke-virtual {v1}, Lcom/scandit/recognition/Barcode;->getSymbology()I

    move-result v3

    invoke-static {v3}, Lcom/ibotta/android/barcode/ScanType;->fromScanditSymbol(I)Lcom/ibotta/android/barcode/ScanType;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;->setScanType(Lcom/ibotta/android/barcode/ScanType;)V

    .line 232
    invoke-virtual {v1}, Lcom/scandit/recognition/Barcode;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScannedBarcode;->setBarcode(Ljava/lang/String;)V

    .line 234
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 238
    :cond_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/scan/-$$Lambda$BaseScanActivity$AI7P5iyWymD4IN4AeZwz9qU15Ww;

    invoke-direct {p1, p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/-$$Lambda$BaseScanActivity$AI7P5iyWymD4IN4AeZwz9qU15Ww;-><init>(Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;Ljava/util/List;)V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onBarcodeScannedRunnable:Ljava/lang/Runnable;

    .line 246
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->handler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onBarcodeScannedRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method public finish()V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->killPendingScans()V

    .line 105
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->finish()V

    return-void
.end method

.method public getFlyUpPageCreator(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;
    .locals 3

    const-string v0, "fly_up_barcode_help"

    .line 300
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 301
    new-instance p1, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->tracker:Lcom/ibotta/android/tracking/Tracker;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->lastManualBarcode:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2, v2}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public hideHelp()V
    .locals 2

    .line 282
    sget-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v1, "fly_up_barcode_help"

    invoke-virtual {v0, p0, v1}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hide(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    return-void
.end method

.method protected loadState(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 73
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0c001f

    .line 74
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->setContentView(I)V

    .line 75
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 77
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->loadState(Landroid/os/Bundle;)V

    .line 79
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;->getScanConfig()Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;

    move-result-object p1

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->initScandit()V

    .line 82
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->initScanditSettings(Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;)Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v0

    .line 83
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->initPicker(Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;Lcom/scandit/barcodepicker/ScanSettings;)V

    .line 84
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->initInstructions()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 120
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    .line 122
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->lightOn:Z

    if-eqz v1, :cond_0

    const v1, 0x7f0d0003

    .line 123
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    goto :goto_0

    :cond_0
    const v1, 0x7f0d0002

    .line 125
    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 128
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;->isBarcodeHelpNeeded()Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x7f09001c

    .line 129
    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 132
    :cond_1
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onFlyUpCancel(Ljava/lang/String;I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onFlyUpPageEvent(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V
    .locals 1

    const-string v0, "fly_up_barcode_help"

    .line 309
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 310
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;->getEventId()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 311
    check-cast p2, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpEvent;

    invoke-virtual {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->onManualBarcodeEntered(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpEvent;)V

    :cond_0
    return-void
.end method

.method protected onManualBarcodeEntered(Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpEvent;)V
    .locals 1

    .line 321
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;

    invoke-virtual {p1}, Lcom/ibotta/android/activity/barcode/BarcodeHelpFlyUpCreator$BarcodeHelpEvent;->getBarcode()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;->onManualBarcodeEntered(Ljava/lang/String;)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 139
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    const/4 v1, 0x0

    goto :goto_0

    .line 141
    :pswitch_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;->onTurnLightOn()V

    goto :goto_0

    .line 145
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;->onTurnLightOff()V

    goto :goto_0

    .line 149
    :pswitch_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanPresenter;->onHelpClicked()V

    :goto_0
    if-nez v1, :cond_0

    .line 155
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v1

    :cond_0
    return v1

    :pswitch_data_0
    .packed-switch 0x7f09001c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onRootClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0901f6
        }
    .end annotation

    .line 326
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->picker:Lcom/scandit/barcodepicker/BarcodePicker;

    if-eqz v0, :cond_0

    .line 327
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/BarcodePicker;->requestFocus()Z

    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 0

    .line 89
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onStart()V

    .line 90
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->initSoundPool()V

    return-void
.end method

.method protected onStop()V
    .locals 0

    .line 95
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onStop()V

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->killPendingScans()V

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->deinitSoundPool()V

    return-void
.end method

.method public playBeepVibrate()V
    .locals 8

    .line 287
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->isAlertVibrate()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "vibrator"

    .line 288
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    const-wide/16 v1, 0xfa

    .line 289
    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V

    .line 291
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->isAlertSound()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 292
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->soundPool:Landroid/media/SoundPool;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->beepSoundId:I

    const/high16 v3, 0x3f000000    # 0.5f

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual/range {v1 .. v7}, Landroid/media/SoundPool;->play(IFFIIF)I

    :cond_1
    return-void
.end method

.method public setLightOn(Z)V
    .locals 1

    .line 264
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->lightOn:Z

    .line 265
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->picker:Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/BarcodePicker;->switchTorchOn(Z)V

    .line 266
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->supportInvalidateOptionsMenu()V

    return-void
.end method

.method public showHelp(Ljava/lang/String;)V
    .locals 2

    .line 271
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->lastManualBarcode:Ljava/lang/String;

    .line 273
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v0, "barcode_manual"

    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/Tracker;->view(Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    .line 275
    invoke-static {p1, v0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance(IZZ)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object p1

    .line 276
    invoke-virtual {p1, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 277
    sget-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v1, "fly_up_barcode_help"

    invoke-virtual {v0, p0, p1, v1}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public startCamera()V
    .locals 2

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->picker:Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/BarcodePicker;->startScanning()V

    .line 252
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->picker:Lcom/scandit/barcodepicker/BarcodePicker;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/BarcodePicker;->setKeepScreenOn(Z)V

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->picker:Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/BarcodePicker;->requestFocus()Z

    return-void
.end method

.method public stopCamera()V
    .locals 2

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->picker:Lcom/scandit/barcodepicker/BarcodePicker;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/BarcodePicker;->setKeepScreenOn(Z)V

    .line 259
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->picker:Lcom/scandit/barcodepicker/BarcodePicker;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/BarcodePicker;->stopScanning()V

    return-void
.end method
