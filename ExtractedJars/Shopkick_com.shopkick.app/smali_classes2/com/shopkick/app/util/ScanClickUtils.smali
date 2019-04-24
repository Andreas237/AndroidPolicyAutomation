.class public Lcom/shopkick/app/util/ScanClickUtils;
.super Ljava/lang/Object;
.source "ScanClickUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;,
        Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;,
        Lcom/shopkick/app/util/ScanClickUtils$OfferDetailsScreenOnClickListener;,
        Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;,
        Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;,
        Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;
    }
.end annotation


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "ScanClickUtils"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static showScanErrorToast(Landroid/content/Context;ILcom/shopkick/app/overlays/interfaces/IOverlayListener;)V
    .locals 4

    const/4 v0, 0x4

    const v1, 0x7f080298

    const/4 v2, 0x0

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    const v2, 0x7f11062a

    const p1, 0x7f110629

    goto :goto_0

    :pswitch_0
    const v1, 0x7f08029b

    const v2, 0x7f110618

    const p1, 0x7f110617

    goto :goto_0

    :pswitch_1
    const v2, 0x7f110620

    const p1, 0x7f11061f

    goto :goto_0

    :pswitch_2
    const v1, 0x7f08029a

    const v2, 0x7f110622

    const p1, 0x7f110621

    goto :goto_0

    :pswitch_3
    const v2, 0x7f110613

    const p1, 0x7f110612

    goto :goto_0

    :pswitch_4
    move p1, v2

    move v1, p1

    goto :goto_0

    :cond_0
    const v1, 0x7f080299

    const v2, 0x7f110616

    const p1, 0x7f110615

    :goto_0
    if-lez p1, :cond_1

    .line 462
    new-instance v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;

    invoke-direct {v0}, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;-><init>()V

    const/16 v3, 0x113

    .line 463
    iput v3, v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->height:I

    const/16 v3, 0xd2

    .line 464
    iput v3, v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->width:I

    .line 465
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->toastTitle:Ljava/lang/String;

    .line 466
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->toastIconResource:Ljava/lang/String;

    .line 467
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->toastMessage:Ljava/lang/String;

    .line 468
    sget-object p0, Lcom/shopkick/app/products/ScanScreen;->SCAN_ERROR_AUTO_DISMISS_DURATION_MS:Ljava/lang/Long;

    iput-object p0, v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->autoDismissDuration:Ljava/lang/Long;

    const/4 p0, 0x1

    .line 469
    iput-boolean p0, v0, Lcom/shopkick/app/overlays/common/ToastOverlaySpec;->isCancelableOnTouchOutside:Z

    .line 470
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object p0

    invoke-virtual {p0, v0, p2}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xb
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
