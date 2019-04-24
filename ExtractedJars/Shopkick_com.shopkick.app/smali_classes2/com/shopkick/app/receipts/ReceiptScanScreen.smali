.class public Lcom/shopkick/app/receipts/ReceiptScanScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ReceiptScanScreen.java"

# interfaces
.implements Lcom/shopkick/app/receipts/IReceiptUploadNotificationCallback;
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final ERROR:I = -0x1

.field public static final EVENT_RECEIPT_SCAN_AWARDED:Ljava/lang/String; = "EventReceiptScanAwarded"

.field public static final EVENT_RECEIPT_SCAN_UPLOADED:Ljava/lang/String; = "EventReceiptScanUploaded"

.field protected static final MAX_LENGTH_BEFORE_SHRINK:I = 0xf

.field public static final OCR_BAD_RECEIPT:I = 0x5

.field public static final OCR_GOOD_RECEIPT:I = 0x4

.field public static final OCR_PROCESSING:I = 0x3

.field public static final PARAM_CHAIN_ID:Ljava/lang/String; = "paramChainId"

.field public static final PREVIEW_AND_ASK_USER:I = 0x1

.field public static final READY_TO_TAKE:I = 0x0

.field private static final RepeatableLogActions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field protected static final SMALLER_TEXT_SIZE:F = 8.0f

.field public static final TAKE_ANOTHER:I = 0x2


# instance fields
.field protected addSectionText:Lcom/shopkick/app/widget/SKTextView;

.field protected alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

.field protected alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field protected alignHereHeight:I

.field protected alignHereMessage:Landroid/view/View;

.field protected alignHerePreviewImage:Landroid/widget/ImageView;

.field protected bottomMessage:Landroid/widget/TextView;

.field protected btnAddSection:Lcom/shopkick/app/logging/UserEventImageView;

.field protected btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

.field protected btnCapture:Lcom/shopkick/app/logging/UserEventImageView;

.field protected btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

.field protected btnRetake:Lcom/shopkick/app/widget/SKButton;

.field protected btnSubmit:Lcom/shopkick/app/widget/SKButton;

.field protected cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

.field protected clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field protected dashedLine:Landroid/view/View;

.field protected dialogThreshold:Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;

.field protected mainView:Landroid/widget/RelativeLayout;

.field protected notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field protected permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field protected previewImage:Landroid/widget/ImageView;

.field protected processingImageBackground:Landroid/view/View;

.field protected processingImageLabel:Lcom/shopkick/app/widget/SKTextView;

.field protected processingImageProgressBar:Landroid/widget/ProgressBar;

.field protected scanAnotherMessage:Landroid/view/View;

.field protected scanCountUI:Landroid/widget/TextView;

.field protected screenState:I

.field protected shouldShowPermissionDialog:Z

.field protected tempAlignHereBitmap:Landroid/graphics/Bitmap;

.field protected topBorder:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 114
    new-instance v0, Lcom/shopkick/app/receipts/ReceiptScanScreen$1;

    invoke-direct {v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen$1;-><init>()V

    sput-object v0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->RepeatableLogActions:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 81
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 82
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 83
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    .line 89
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCapture:Lcom/shopkick/app/logging/UserEventImageView;

    .line 90
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnAddSection:Lcom/shopkick/app/logging/UserEventImageView;

    .line 91
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    .line 92
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    .line 93
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnRetake:Lcom/shopkick/app/widget/SKButton;

    .line 94
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnSubmit:Lcom/shopkick/app/widget/SKButton;

    .line 97
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->addSectionText:Lcom/shopkick/app/widget/SKTextView;

    .line 98
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->scanAnotherMessage:Landroid/view/View;

    .line 99
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHereMessage:Landroid/view/View;

    .line 100
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->dashedLine:Landroid/view/View;

    .line 101
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->topBorder:Landroid/widget/TextView;

    .line 102
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->bottomMessage:Landroid/widget/TextView;

    .line 103
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->scanCountUI:Landroid/widget/TextView;

    .line 104
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->previewImage:Landroid/widget/ImageView;

    .line 105
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHerePreviewImage:Landroid/widget/ImageView;

    .line 106
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->tempAlignHereBitmap:Landroid/graphics/Bitmap;

    const/4 v0, 0x0

    .line 107
    iput v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHereHeight:I

    .line 124
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->shouldShowPermissionDialog:Z

    return-void
.end method

.method public static synthetic lambda$showDialogProcessingReceiptError$206(Lcom/shopkick/app/receipts/ReceiptScanScreen;Ljava/lang/ref/WeakReference;)V
    .locals 2

    .line 647
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 648
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 649
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AbstractCameraController;->retake()V

    .line 650
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-virtual {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hide()V

    return-void
.end method

.method public static synthetic lambda$showDialogScanCountThreshold$205(Lcom/shopkick/app/receipts/ReceiptScanScreen;Landroid/view/View;)V
    .locals 1

    .line 630
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getUploader()Lcom/shopkick/app/receipts/IReceiptUploadController;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 633
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getUploader()Lcom/shopkick/app/receipts/IReceiptUploadController;

    move-result-object p1

    invoke-interface {p1}, Lcom/shopkick/app/receipts/IReceiptUploadController;->upload()Z

    return-void

    .line 631
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No uploader is available for this receipt"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public cleanUpAndExit()V
    .locals 1

    const/4 v0, 0x0

    .line 668
    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->tempAlignHereBitmap:Landroid/graphics/Bitmap;

    .line 670
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->finish()V

    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 143
    iget-object p3, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p3}, Lcom/shopkick/app/util/FeatureFlagHelper;->useFotoapparat(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p3

    if-eqz p3, :cond_0

    const p3, 0x7f0c0177

    goto :goto_0

    :cond_0
    const p3, 0x7f0c0176

    :goto_0
    const/4 v0, 0x0

    .line 144
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    .line 145
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->instantiateViews()V

    .line 148
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->addSectionText:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->resizeAddSectionTextIfNecessary(Lcom/shopkick/app/widget/SKTextView;)V

    .line 151
    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->getInstance()Lcom/shopkick/app/receipts/ReceiptScanImageCache;

    move-result-object p1

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/receipts/ReceiptScanImageCache;->clearCache(Landroid/content/Context;)V

    .line 154
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setupPermissionsController()V

    .line 157
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setupAlignHereOnLayoutListener()V

    .line 159
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public getAlignHereHeight()I
    .locals 1

    .line 683
    iget v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHereHeight:I

    return v0
.end method

.method public getPreviewHeight()I
    .locals 1

    .line 722
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->previewImage:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    return v0
.end method

.method public getPreviewWidth()I
    .locals 1

    .line 731
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->previewImage:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    return v0
.end method

.method public getUploader()Lcom/shopkick/app/receipts/IReceiptUploadController;
    .locals 1

    .line 776
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/receipts/IReceiptUploadController;

    if-eqz v0, :cond_0

    .line 777
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/receipts/IReceiptUploadController;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 135
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 136
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    .line 137
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 138
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method protected instantiateViews()V
    .locals 2

    .line 163
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0905fc

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->scanAnotherMessage:Landroid/view/View;

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f09003a

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHereMessage:Landroid/view/View;

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0901c6

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->dashedLine:Landroid/view/View;

    .line 166
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090795

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->topBorder:Landroid/widget/TextView;

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090095

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->bottomMessage:Landroid/widget/TextView;

    .line 168
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090614

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventImageView;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCapture:Lcom/shopkick/app/logging/UserEventImageView;

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090612

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventImageView;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnAddSection:Lcom/shopkick/app/logging/UserEventImageView;

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090032

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->addSectionText:Lcom/shopkick/app/widget/SKTextView;

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090613

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventImageView;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090616

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnRetake:Lcom/shopkick/app/widget/SKButton;

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090617

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnSubmit:Lcom/shopkick/app/widget/SKButton;

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090615

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventImageView;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    .line 177
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090304

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->previewImage:Landroid/widget/ImageView;

    .line 178
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090303

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHerePreviewImage:Landroid/widget/ImageView;

    .line 179
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0905fd

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->scanCountUI:Landroid/widget/TextView;

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090594

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageBackground:Landroid/view/View;

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090595

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageLabel:Lcom/shopkick/app/widget/SKTextView;

    .line 184
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090596

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageProgressBar:Landroid/widget/ProgressBar;

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 657
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 658
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->DONT_GO_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    .line 660
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AbstractCameraController;->cancelFromBack()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 663
    :cond_1
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->DONT_GO_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    .line 661
    :cond_2
    :goto_0
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_ACTIVITY_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 536
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 550
    :pswitch_0
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->onClickSubmit()V

    goto :goto_0

    .line 546
    :pswitch_1
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->onClickRetake()V

    goto :goto_0

    .line 554
    :pswitch_2
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->onClickHelp()V

    goto :goto_0

    .line 538
    :pswitch_3
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->onClickCapture()V

    goto :goto_0

    .line 558
    :pswitch_4
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->onClickCancel()V

    goto :goto_0

    .line 542
    :pswitch_5
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->onClickAddSection()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x7f090612
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onClickAddSection()V
    .locals 2

    .line 579
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHerePreviewImage:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->tempAlignHereBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 580
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHerePreviewImage:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->invalidate()V

    .line 582
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AbstractCameraController;->addSection()V

    return-void
.end method

.method protected onClickCancel()V
    .locals 1

    .line 617
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    if-eqz v0, :cond_0

    .line 618
    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AbstractCameraController;->cancel()V

    goto :goto_0

    .line 620
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cleanUpAndExit()V

    :goto_0
    return-void
.end method

.method protected onClickCapture()V
    .locals 2

    .line 565
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AbstractCameraController;->getScanCount()I

    move-result v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    iget v1, v1, Lcom/shopkick/app/receipts/AbstractCameraController;->maxScanCount:I

    if-lt v0, v1, :cond_0

    .line 566
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->showDialogScanCountThreshold()V

    return-void

    .line 571
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->resetStateUIElements()V

    const/4 v0, 0x0

    .line 572
    invoke-virtual {p0, v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setProcessingImageIndicatorVisibility(I)V

    .line 575
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AbstractCameraController;->takePhoto()V

    return-void
.end method

.method protected onClickHelp()V
    .locals 3

    .line 598
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "chain_id"

    .line 599
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {v2}, Lcom/shopkick/app/receipts/AbstractCameraController;->getChainId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_id"

    .line 600
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {v2}, Lcom/shopkick/app/receipts/AbstractCameraController;->getLocationId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "INSTRUCTIONS_TYPE"

    const-string v2, ""

    .line 601
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "origin_screen"

    .line 602
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v2, v2, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "origin_element"

    const/16 v2, 0xfa

    .line 604
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 603
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->getReceiptInstructionScreenType(Lcom/shopkick/app/application/ClientFlagsManager;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const-string v1, "INSTRUCTIONS_TYPE"

    .line 608
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 607
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const-string v1, "INSTRUCTIONS_TYPE"

    const/4 v2, 0x2

    .line 611
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 610
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    :goto_0
    const-class v1, Lcom/shopkick/app/activities/ReceiptScanActivity;

    const-class v2, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;

    invoke-virtual {p0, v1, v2, v0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method protected onClickRetake()V
    .locals 1

    .line 586
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AbstractCameraController;->retake()V

    .line 587
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIScanCount()V

    return-void
.end method

.method protected onClickSubmit()V
    .locals 2

    .line 591
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getUploader()Lcom/shopkick/app/receipts/IReceiptUploadController;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 594
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getUploader()Lcom/shopkick/app/receipts/IReceiptUploadController;

    move-result-object v0

    invoke-interface {v0}, Lcom/shopkick/app/receipts/IReceiptUploadController;->upload()Z

    return-void

    .line 592
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No receipt uploader available."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0
    .param p2    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 785
    invoke-super {p0, p1, p2, p3}, Lcom/shopkick/app/screens/AppScreen;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const/16 p2, 0x1b

    if-eq p1, p2, :cond_0

    return-void

    .line 788
    :cond_0
    array-length p1, p3

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    aget p1, p3, p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    goto :goto_0

    .line 800
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->onScreenWillShow()V

    goto :goto_1

    :cond_2
    :goto_0
    const-string p1, "android.permission.CAMERA"

    .line 789
    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 791
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->popScreen()V

    goto :goto_1

    .line 795
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    :goto_1
    return-void
.end method

.method protected onScreenDidHide()V
    .locals 1

    .line 676
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    if-eqz v0, :cond_0

    .line 677
    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AbstractCameraController;->freeResourcesForPause()V

    .line 679
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidHide()V

    return-void
.end method

.method protected onScreenWillShow()V
    .locals 4

    .line 736
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->shouldShowPermissionDialog:Z

    const/16 v1, 0x8

    const v2, 0x7f09051d

    if-eqz v0, :cond_0

    .line 740
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 741
    sget-object v0, Lcom/shopkick/app/permissions/PermissionUtils;->CAMERA_PERMISSIONS:[Ljava/lang/String;

    const/16 v3, 0x1b

    invoke-virtual {p0, v0, v3}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->requestPermissions([Ljava/lang/String;I)V

    const/4 v0, 0x0

    .line 742
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->shouldShowPermissionDialog:Z

    goto :goto_0

    .line 744
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    .line 747
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    if-nez v0, :cond_1

    const-string v0, "android.permission.CAMERA"

    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 748
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 749
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setupCameraController()V

    .line 752
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    if-eqz v0, :cond_3

    .line 753
    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AbstractCameraController;->performResumeActions()V

    .line 754
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getUploader()Lcom/shopkick/app/receipts/IReceiptUploadController;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 755
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getUploader()Lcom/shopkick/app/receipts/IReceiptUploadController;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/AbstractCameraController;->getChainId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/shopkick/app/receipts/IReceiptUploadController;->setChainId(Ljava/lang/String;)V

    .line 756
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getUploader()Lcom/shopkick/app/receipts/IReceiptUploadController;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/AbstractCameraController;->getLocationId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/shopkick/app/receipts/IReceiptUploadController;->setLocationId(Ljava/lang/String;)V

    goto :goto_1

    .line 758
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No valid uploader found"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    return-void
.end method

.method protected resetStateUIElements()V
    .locals 3

    .line 392
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCapture:Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 393
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnRetake:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 394
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnSubmit:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 395
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnAddSection:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 396
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 397
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 399
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCapture:Lcom/shopkick/app/logging/UserEventImageView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 400
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnRetake:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 401
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnSubmit:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 402
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnAddSection:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 403
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 404
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 406
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->previewImage:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 407
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHerePreviewImage:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 408
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->addSectionText:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 409
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->scanAnotherMessage:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 410
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHereMessage:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 411
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->dashedLine:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 412
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->bottomMessage:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 413
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->topBorder:Landroid/widget/TextView;

    const v1, 0x7f11054e

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method protected resizeAddSectionTextIfNecessary(Lcom/shopkick/app/widget/SKTextView;)V
    .locals 2

    .line 188
    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0xf

    if-le v0, v1, :cond_0

    const/high16 v0, 0x41000000    # 8.0f

    .line 189
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setTextSize(F)V

    :cond_0
    return-void
.end method

.method public setPreviewImage(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 707
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->previewImage:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 708
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->previewImage:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 709
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->previewImage:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method

.method protected setProcessingImageIndicatorVisibility(I)V
    .locals 5

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-nez p1, :cond_0

    .line 433
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageBackground:Landroid/view/View;

    const/high16 v2, -0x1000000

    invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 434
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageBackground:Landroid/view/View;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 435
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageBackground:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 437
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f11053c

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 438
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 439
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 441
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageProgressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setAlpha(F)V

    .line 442
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageProgressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 444
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->bottomMessage:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 446
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 447
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageBackground:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 448
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageProgressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 450
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->bottomMessage:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setTempAlignHerePreviewBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 703
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->tempAlignHereBitmap:Landroid/graphics/Bitmap;

    return-void
.end method

.method protected setupAlignHereOnLayoutListener()V
    .locals 2

    .line 204
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHerePreviewImage:Landroid/widget/ImageView;

    new-instance v1, Lcom/shopkick/app/receipts/ReceiptScanScreen$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen$2;-><init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method protected setupCameraController()V
    .locals 10

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->useFotoapparat(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV3;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getParams()Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/shopkick/app/receipts/CameraControllerV3;-><init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;Landroid/view/View;)V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    goto :goto_0

    .line 224
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->shouldUseCameraControllerV2()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 225
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV2;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getParams()Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/shopkick/app/receipts/CameraControllerV2;-><init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;Landroid/widget/RelativeLayout;)V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    goto :goto_0

    .line 227
    :cond_1
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV1;

    iget-object v6, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getParams()Ljava/util/Map;

    move-result-object v7

    iget-object v8, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    iget-object v9, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v4, v0

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Lcom/shopkick/app/receipts/CameraControllerV1;-><init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;Landroid/widget/RelativeLayout;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    .line 229
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setupUI()V

    return-void
.end method

.method protected setupLogging(Lcom/shopkick/app/logging/IUserEventView;IZ)V
    .locals 2

    .line 688
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 689
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    if-eqz p2, :cond_0

    .line 690
    invoke-virtual {p2}, Lcom/shopkick/app/receipts/AbstractCameraController;->getChainId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    goto :goto_0

    .line 691
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getParams()Ljava/util/Map;

    move-result-object p2

    const-string v1, "chain_id"

    invoke-interface {p2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 692
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getParams()Ljava/util/Map;

    move-result-object p2

    const-string v1, "chain_id"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 695
    :cond_1
    :goto_0
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 696
    iput-boolean p3, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 698
    sget-object p3, Lcom/shopkick/app/receipts/ReceiptScanScreen;->RepeatableLogActions:Ljava/util/ArrayList;

    invoke-interface {p1, p3}, Lcom/shopkick/app/logging/IUserEventView;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    .line 699
    iget-object p3, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, v0, p3, p2}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method protected setupPermissionsController()V
    .locals 4

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0900c4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 195
    new-instance v0, Lcom/shopkick/app/permissions/PermissionsRequestController;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 196
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string v1, "android.permission.CAMERA"

    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    const v3, 0x7f09051d

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    const-string v0, "android.permission.CAMERA"

    .line 199
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->mainView:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->shouldShowPermissionDialog:Z

    return-void
.end method

.method protected setupUI()V
    .locals 3

    .line 234
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/AvenirLTStd-Medium.otf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 235
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    const/4 v1, 0x1

    const/16 v2, 0x81

    invoke-virtual {p0, v0, v2, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setupLogging(Lcom/shopkick/app/logging/IUserEventView;IZ)V

    .line 238
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCapture:Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v2, 0xa4

    invoke-virtual {p0, v0, v2, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setupLogging(Lcom/shopkick/app/logging/IUserEventView;IZ)V

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnAddSection:Lcom/shopkick/app/logging/UserEventImageView;

    const/4 v1, 0x0

    const/16 v2, 0xa5

    invoke-virtual {p0, v0, v2, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setupLogging(Lcom/shopkick/app/logging/IUserEventView;IZ)V

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnRetake:Lcom/shopkick/app/widget/SKButton;

    const/16 v2, 0xa6

    invoke-virtual {p0, v0, v2, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setupLogging(Lcom/shopkick/app/logging/IUserEventView;IZ)V

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnSubmit:Lcom/shopkick/app/widget/SKButton;

    const/16 v2, 0x10

    invoke-virtual {p0, v0, v2, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setupLogging(Lcom/shopkick/app/logging/IUserEventView;IZ)V

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->shouldShowReceiptScanScreenInstructions(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 245
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 247
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 248
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 250
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 251
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCapture:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 252
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnAddSection:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnRetake:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnSubmit:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 256
    invoke-virtual {p0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIFromState(I)V

    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected shouldUseCameraControllerV2()Z
    .locals 7

    .line 266
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v0

    const-string v1, "FEATURE_FLAG_USE_CAMERA2_API"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/flags/SKFlags;->isFlagEnabled(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 268
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "camera"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/CameraManager;

    .line 270
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v2

    aget-object v2, v2, v1

    .line 271
    invoke-virtual {v0, v2}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    .line 272
    const-class v2, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Camera supported hardware level is: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 274
    invoke-virtual {v0, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " Valid choices are Legacy("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "), Limited, ("

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ") or full ("

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ")."

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 272
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 279
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v4, :cond_0

    .line 281
    invoke-static {}, Lcom/shopkick/app/util/CameraUtil;->isDeviceCameraSupported()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    return v5

    :catch_0
    :cond_0
    return v1
.end method

.method protected showDialogProcessingReceiptError()V
    .locals 7

    .line 642
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 643
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f11053f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 644
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f11053e

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 645
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f11053d

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptScanScreen$HP8ePoQ5JBZDAFPuETF9M6gRXhw;

    invoke-direct {v5, p0}, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptScanScreen$HP8ePoQ5JBZDAFPuETF9M6gRXhw;-><init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;)V

    const/4 v1, 0x0

    const/4 v6, 0x0

    .line 642
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method

.method protected showDialogScanCountThreshold()V
    .locals 4

    .line 626
    new-instance v0, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;

    .line 627
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    iget v2, v2, Lcom/shopkick/app/receipts/AbstractCameraController;->maxScanCount:I

    new-instance v3, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptScanScreen$LTpgSI99DggEj4iLi3dkMPZ08Fo;

    invoke-direct {v3, p0}, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptScanScreen$LTpgSI99DggEj4iLi3dkMPZ08Fo;-><init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;-><init>(Landroid/content/Context;ILandroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->dialogThreshold:Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;

    .line 636
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->dialogThreshold:Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 637
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->dialogThreshold:Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanThresholdHitDialog;->show()V

    :cond_0
    return-void
.end method

.method public showPreviewImage()V
    .locals 2

    .line 713
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->previewImage:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method protected startGoodReceiptAnimation()V
    .locals 11

    .line 455
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageProgressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 456
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageBackground:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 457
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 459
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 460
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageLabel:Lcom/shopkick/app/widget/SKTextView;

    const-string v3, "alpha"

    const/4 v4, 0x2

    new-array v5, v4, [F

    fill-array-data v5, :array_0

    invoke-static {v2, v3, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    const-wide/16 v5, 0x64

    .line 461
    invoke-virtual {v2, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 462
    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageProgressBar:Landroid/widget/ProgressBar;

    const-string v7, "alpha"

    new-array v8, v4, [F

    fill-array-data v8, :array_1

    invoke-static {v3, v7, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 463
    invoke-virtual {v3, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 464
    new-array v5, v4, [Landroid/animation/Animator;

    aput-object v3, v5, v1

    const/4 v3, 0x1

    aput-object v2, v5, v3

    invoke-virtual {v0, v5}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 466
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 467
    iget-object v5, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageLabel:Lcom/shopkick/app/widget/SKTextView;

    const-string v6, "alpha"

    new-array v7, v4, [F

    fill-array-data v7, :array_2

    invoke-static {v5, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 468
    iget-object v6, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageBackground:Landroid/view/View;

    const-string v7, "backgroundColor"

    new-instance v8, Landroid/animation/ArgbEvaluator;

    invoke-direct {v8}, Landroid/animation/ArgbEvaluator;-><init>()V

    new-array v9, v4, [Ljava/lang/Object;

    const/high16 v10, -0x1000000

    .line 471
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v1

    const v10, 0x7f0600ce

    .line 472
    invoke-virtual {p0, v10}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getResourceColor(I)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v3

    .line 468
    invoke-static {v6, v7, v8, v9}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v6

    const-wide/16 v7, 0xc8

    .line 473
    invoke-virtual {v5, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 474
    invoke-virtual {v6, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 475
    new-array v9, v4, [Landroid/animation/Animator;

    aput-object v5, v9, v1

    aput-object v6, v9, v3

    invoke-virtual {v2, v9}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 477
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageBackground:Landroid/view/View;

    const-string v3, "alpha"

    new-array v6, v4, [F

    fill-array-data v6, :array_3

    invoke-static {v1, v3, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 478
    iget-object v3, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->processingImageLabel:Lcom/shopkick/app/widget/SKTextView;

    const-string v6, "alpha"

    new-array v4, v4, [F

    fill-array-data v4, :array_4

    invoke-static {v3, v6, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 479
    invoke-virtual {v1, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 480
    invoke-virtual {v3, v7, v8}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    const-wide/16 v6, 0x3e8

    .line 481
    invoke-virtual {v1, v6, v7}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    .line 482
    invoke-virtual {v3, v6, v7}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    .line 483
    invoke-virtual {v2, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 484
    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 486
    new-instance v1, Lcom/shopkick/app/receipts/ReceiptScanScreen$3;

    invoke-direct {v1, p0, v2}, Lcom/shopkick/app/receipts/ReceiptScanScreen$3;-><init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;Landroid/animation/AnimatorSet;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 509
    new-instance v1, Lcom/shopkick/app/receipts/ReceiptScanScreen$4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen$4;-><init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;)V

    invoke-virtual {v2, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 531
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_4
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public updateUIFromState(I)V
    .locals 7

    .line 293
    iput p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->screenState:I

    .line 296
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->resetStateUIElements()V

    .line 298
    iget p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->screenState:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    const/16 p1, 0x8

    .line 383
    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setProcessingImageIndicatorVisibility(I)V

    .line 384
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->showDialogProcessingReceiptError()V

    goto/16 :goto_0

    .line 380
    :pswitch_1
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->startGoodReceiptAnimation()V

    goto/16 :goto_0

    .line 377
    :pswitch_2
    invoke-virtual {p0, v1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->setProcessingImageIndicatorVisibility(I)V

    goto/16 :goto_0

    .line 356
    :pswitch_3
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCapture:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 357
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 358
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 360
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCapture:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 362
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 364
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/AbstractCameraController;->getScanCount()I

    move-result p1

    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    iget v2, v2, Lcom/shopkick/app/receipts/AbstractCameraController;->maxScanCount:I

    if-lt p1, v2, :cond_0

    .line 365
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnSubmit:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 366
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnSubmit:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 369
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->scanAnotherMessage:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 371
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHerePreviewImage:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 372
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHereMessage:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 374
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->dashedLine:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    .line 334
    :pswitch_4
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/AbstractCameraController;->isDoneProcessingAndAnalyzingCapture()Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    .line 337
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->previewImage:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 338
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->addSectionText:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 340
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnRetake:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 341
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnAddSection:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 342
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnSubmit:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 343
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 344
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 346
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnRetake:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 347
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnAddSection:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 348
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnSubmit:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 349
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 350
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 352
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->bottomMessage:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 353
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->bottomMessage:Landroid/widget/TextView;

    const v0, 0x7f110526

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 313
    :pswitch_5
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/AbstractCameraController;->isDoneProcessingAndAnalyzingCapture()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    .line 317
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCapture:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 318
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 319
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 321
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCapture:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 322
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 323
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnHelp:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setClickable(Z)V

    .line 325
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {p1}, Lcom/shopkick/app/receipts/AbstractCameraController;->getScanCount()I

    move-result p1

    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    iget v2, v2, Lcom/shopkick/app/receipts/AbstractCameraController;->maxScanCount:I

    if-lt p1, v2, :cond_3

    .line 326
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnSubmit:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 327
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnSubmit:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 330
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->bottomMessage:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 331
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->bottomMessage:Landroid/widget/TextView;

    const v0, 0x7f11052a

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 302
    :pswitch_6
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 303
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v1, 0x0

    const p1, 0x7f110155

    .line 304
    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const p1, 0x7f110142

    .line 305
    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const p1, 0x7f11014f

    .line 306
    invoke-virtual {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->getString(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/shopkick/app/receipts/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/receipts/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    new-instance v6, Lcom/shopkick/app/receipts/-$$Lambda$cFmQLc74hzO7JpzCf-pYt15ybic;

    invoke-direct {v6, p0}, Lcom/shopkick/app/receipts/-$$Lambda$cFmQLc74hzO7JpzCf-pYt15ybic;-><init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;)V

    .line 303
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    .line 388
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanScreen;->updateUIScanCount()V

    return-void

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected updateUIScanCount()V
    .locals 2

    .line 417
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/AbstractCameraController;->getScanCount()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    .line 418
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->scanCountUI:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 420
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->scanCountUI:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->cameraController:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/AbstractCameraController;->getScanCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public uploadFinished(Z)V
    .locals 1

    if-nez p1, :cond_0

    .line 766
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public uploadStarted()V
    .locals 2

    .line 772
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen;->btnCancel:Lcom/shopkick/app/logging/UserEventImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setEnabled(Z)V

    return-void
.end method
