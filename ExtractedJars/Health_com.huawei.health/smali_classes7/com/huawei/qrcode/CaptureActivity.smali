.class public final Lcom/huawei/qrcode/CaptureActivity;
.super Landroid/app/Activity;

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/CaptureActivity$NotifyListener;,
        Lcom/huawei/qrcode/CaptureActivity$LocalHandler;
    }
.end annotation


# static fields
.field private static final MSG_SURFACE_VIEW_DELAY:I = 0x36

.field private static final PERMISSION_REQ_CODE_CAMERA:I = 0x14

.field private static final REQUEST_CODE_PICLIB:I = 0xc

.field public static final RETURN_RESULT_KEY:I = 0xa

.field private static final SURFACE_VIEW_DELAY_TIME:J = 0xc8L

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private PManager:Landroid/content/pm/PackageManager;

.field private activeFlag:Z

.field private alertTv:Landroid/widget/TextView;

.field private ambientLightManager:Lcom/huawei/qrcode/AmbientLightManager;

.field private beepManager:Lcom/huawei/qrcode/BeepManager;

.field private btn_light_control:Landroid/widget/CheckBox;

.field private cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

.field private characterSet:Ljava/lang/String;

.field private decodeFormats:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<Lo/od;>;"
        }
    .end annotation
.end field

.field private decodeHints:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/og;*>;"
        }
    .end annotation
.end field

.field private handler:Lcom/huawei/qrcode/decode/CaptureActivityHandler;

.field private hasSurface:Z

.field private img_select_relatout:Landroid/widget/RelativeLayout;

.field private inactivityTimer:Lcom/huawei/qrcode/decode/InactivityTimer;

.field private isPermissionGranted:Z

.field private isShowPicSelectBtn:Z

.field private lastResult:Lo/or;

.field private localHandler:Landroid/os/Handler;

.field private mEventCallBackId:Ljava/lang/String;

.field private mScanRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

.field private permissionDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

.field private produceCode:Ljava/lang/String;

.field private queryProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

.field private scanFrameView:Lcom/huawei/qrcode/view/ScanFrameView;

.field private scanFunTip:Ljava/lang/String;

.field private scanResult:Ljava/lang/String;

.field private source:Lcom/huawei/qrcode/IntentSource;

.field private surfaceView:Landroid/view/SurfaceView;

.field private tViewFiveScanTip:Landroid/widget/TextView;

.field private tViewUseDesc:Landroid/widget/TextView;

.field private toolbar_relatout:Landroid/widget/RelativeLayout;

.field private viewfinderView:Lcom/huawei/qrcode/view/ViewfinderView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/qrcode/CaptureActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/CaptureActivity;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->activeFlag:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->isPermissionGranted:Z

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanFunTip:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mEventCallBackId:Ljava/lang/String;

    new-instance v0, Lcom/huawei/qrcode/CaptureActivity$LocalHandler;

    invoke-direct {v0, p0}, Lcom/huawei/qrcode/CaptureActivity$LocalHandler;-><init>(Lcom/huawei/qrcode/CaptureActivity;)V

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->localHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/qrcode/CaptureActivity;Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/CaptureActivity;->dealWithLocalHander(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/qrcode/CaptureActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->jumpToPicture()V

    return-void
.end method

.method static synthetic access$1000(Lcom/huawei/qrcode/CaptureActivity;Lcom/huawei/qrcode/model/QrcodeAppInfo;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/CaptureActivity;->dealAppInfoSuccessCallBack(Lcom/huawei/qrcode/model/QrcodeAppInfo;)V

    return-void
.end method

.method static synthetic access$1100(Lcom/huawei/qrcode/CaptureActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/CaptureActivity;->notifyQrcodeResultToUi(I)V

    return-void
.end method

.method static synthetic access$200()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/qrcode/CaptureActivity;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/qrcode/CaptureActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->notifyCallApp()V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/qrcode/CaptureActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->cancelScaningProgress()V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/qrcode/CaptureActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/CaptureActivity;->parseStrResult(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/qrcode/CaptureActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->produceCode:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/qrcode/CaptureActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/CaptureActivity;->handlFail(I)V

    return-void
.end method

.method static synthetic access$900(Lcom/huawei/qrcode/CaptureActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->cancelQueryProgress()V

    return-void
.end method

.method private cancelQueryProgress()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->queryProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->queryProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->dismiss()V

    :cond_0
    return-void
.end method

.method private cancelScaningProgress()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mScanRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mScanRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mScanRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mScanRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    :cond_0
    return-void
.end method

.method private dealAppInfoSuccessCallBack(Lcom/huawei/qrcode/model/QrcodeAppInfo;)V
    .locals 4

    const-string v0, "CaptureActivity dealAppInfoSuccessCallBack."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const-string v0, ""

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->dealWithQrcodeApp(Landroid/content/Context;Lcom/huawei/qrcode/model/QrcodeAppInfo;ZLjava/lang/String;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->mEventCallBackId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/qrcode/CaptureActivity;->scanResult:Ljava/lang/String;

    const/16 v3, 0xfa5

    invoke-virtual {v0, v1, v3, v2}, Lcom/huawei/qrcode/logic/EventDispatchManager;->notifyEventiListener(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->mEventCallBackId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeEventListener(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "02"

    iget-object v2, p0, Lcom/huawei/qrcode/CaptureActivity;->produceCode:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/qrcode/logic/bi/SqrcodeSdkBiAnalytics;->reportIdentificationCode(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->finish()V

    return-void
.end method

.method private dealWithLocalHander(Landroid/os/Message;)V
    .locals 2

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "CaptureActivity dealWithLocalHander msg is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    return-void

    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x36

    if-ne v1, v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->showSurfaceView()V

    :cond_1
    return-void
.end method

.method private displayFrameworkBugMessageAndExit()V
    .locals 5

    invoke-static {p0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->createDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v4

    const-string v0, "scanqrcode_sdk_cancel_down_tip_title"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setTitle(Ljava/lang/String;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v0, "scanqrcode_sdk_camera_framework_bug"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setMessage(Ljava/lang/String;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v0, "scanqrcode_sdk_dialog_sure"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    new-instance v1, Lcom/huawei/qrcode/decode/FinishListener;

    new-instance v2, Lcom/huawei/qrcode/CaptureActivity$NotifyListener;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/huawei/qrcode/CaptureActivity$NotifyListener;-><init>(Lcom/huawei/qrcode/CaptureActivity;Lcom/huawei/qrcode/CaptureActivity$1;)V

    invoke-direct {v1, p0, v2}, Lcom/huawei/qrcode/decode/FinishListener;-><init>(Landroid/app/Activity;Lcom/huawei/qrcode/logic/INotifyListener;)V

    invoke-interface {v4, v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    new-instance v0, Lcom/huawei/qrcode/decode/FinishListener;

    new-instance v1, Lcom/huawei/qrcode/CaptureActivity$NotifyListener;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/qrcode/CaptureActivity$NotifyListener;-><init>(Lcom/huawei/qrcode/CaptureActivity;Lcom/huawei/qrcode/CaptureActivity$1;)V

    invoke-direct {v0, p0, v1}, Lcom/huawei/qrcode/decode/FinishListener;-><init>(Landroid/app/Activity;Lcom/huawei/qrcode/logic/INotifyListener;)V

    invoke-interface {v4, v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    invoke-interface {v4}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->show()V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->alertTv:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->alertTv:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->tViewFiveScanTip:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->tViewFiveScanTip:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->tViewUseDesc:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->tViewUseDesc:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->toolbar_relatout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->toolbar_relatout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method private static drawLine(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lo/ou;Lo/ou;F)V
    .locals 6

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    move-object v0, p0

    invoke-virtual {p2}, Lo/ou;->b()F

    move-result v1

    mul-float/2addr v1, p4

    invoke-virtual {p2}, Lo/ou;->e()F

    move-result v2

    mul-float/2addr v2, p4

    invoke-virtual {p3}, Lo/ou;->b()F

    move-result v3

    mul-float/2addr v3, p4

    invoke-virtual {p3}, Lo/ou;->e()F

    move-result v4

    mul-float/2addr v4, p4

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method private drawResultPoints(Landroid/graphics/Bitmap;FLo/or;)V
    .locals 9

    invoke-virtual {p3}, Lo/or;->c()[Lo/ou;

    move-result-object v2

    if-eqz v2, :cond_3

    array-length v0, v2

    if-lez v0, :cond_3

    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "scanqrcode_sdk_result_points"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getColorId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    array-length v0, v2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/high16 v0, 0x40800000    # 4.0f

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/4 v0, 0x0

    aget-object v0, v2, v0

    const/4 v1, 0x1

    aget-object v1, v2, v1

    invoke-static {v3, v4, v0, v1, p2}, Lcom/huawei/qrcode/CaptureActivity;->drawLine(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lo/ou;Lo/ou;F)V

    goto :goto_1

    :cond_0
    array-length v0, v2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    invoke-virtual {p3}, Lo/or;->d()Lo/od;

    move-result-object v0

    sget-object v1, Lo/od;->m:Lo/od;

    if-eq v0, v1, :cond_1

    invoke-virtual {p3}, Lo/or;->d()Lo/od;

    move-result-object v0

    sget-object v1, Lo/od;->k:Lo/od;

    if-ne v0, v1, :cond_2

    :cond_1
    const/4 v0, 0x0

    aget-object v0, v2, v0

    const/4 v1, 0x1

    aget-object v1, v2, v1

    invoke-static {v3, v4, v0, v1, p2}, Lcom/huawei/qrcode/CaptureActivity;->drawLine(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lo/ou;Lo/ou;F)V

    const/4 v0, 0x2

    aget-object v0, v2, v0

    const/4 v1, 0x3

    aget-object v1, v2, v1

    invoke-static {v3, v4, v0, v1, p2}, Lcom/huawei/qrcode/CaptureActivity;->drawLine(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lo/ou;Lo/ou;F)V

    goto :goto_1

    :cond_2
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    move-object v5, v2

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    invoke-virtual {v8}, Lo/ou;->b()F

    move-result v0

    mul-float/2addr v0, p2

    invoke-virtual {v8}, Lo/ou;->e()F

    move-result v1

    mul-float/2addr v1, p2

    invoke-virtual {v3, v0, v1, v4}, Landroid/graphics/Canvas;->drawPoint(FFLandroid/graphics/Paint;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method private handlFail(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CaptureActivity handlFail type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/16 v0, 0xfa3

    if-eq v0, p1, :cond_0

    const/16 v0, 0xfa1

    if-eq v0, p1, :cond_0

    const/16 v0, 0xfa7

    if-ne v0, p1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->finish()V

    goto :goto_0

    :cond_1
    const/16 v0, 0xfa2

    if-ne v0, p1, :cond_2

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->handlerNotSupportCode()V

    :cond_2
    :goto_0
    return-void
.end method

.method private handleDecodeInternally(Lo/or;Lcom/huawei/qrcode/result/ResultHandler;Landroid/graphics/Bitmap;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CaptureActivity handleDecodeInternally scan result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/or;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/CaptureActivity;->handleScanQrcodeResult(Lo/or;)V

    return-void
.end method

.method private handleScanQrcodeResult(Lo/or;)V
    .locals 1

    invoke-virtual {p1}, Lo/or;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->parseStrResult(Ljava/lang/String;)V

    return-void
.end method

.method private handlerNotSupportCode()V
    .locals 5

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanResult:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->getStrGroup(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    array-length v0, v3

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    aget-object v0, v3, v0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->produceCode:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CaptureActivity local parse and req produceCode ---> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->produceCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->getInstance()Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/qrcode/CaptureActivity;->scanResult:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->getQrcodeAppInfoBySpJson(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/qrcode/model/QrcodeAppInfo;

    move-result-object v4

    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const-string v0, "CaptureActivity handlerNotSupportCode parse sp json success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-direct {p0, v4}, Lcom/huawei/qrcode/CaptureActivity;->dealAppInfoSuccessCallBack(Lcom/huawei/qrcode/model/QrcodeAppInfo;)V

    return-void

    :cond_0
    const-string v0, "CaptureActivity handlerNotSupportCode startQuery."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->startQuery()V

    goto :goto_0

    :cond_1
    const/16 v0, 0xfa2

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->notifyQrcodeResultToUi(I)V

    :goto_0
    return-void
.end method

.method private initCamera(Landroid/view/SurfaceHolder;)V
    .locals 7

    sget-object v0, Lcom/huawei/qrcode/CaptureActivity;->TAG:Ljava/lang/String;

    const-string v1, "initCamera()"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No SurfaceHolder provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraManager;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/qrcode/CaptureActivity;->TAG:Ljava/lang/String;

    const-string v1, "initCamera() while already open -- late SurfaceView callback?"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraManager;->isSupportFlash()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->setFlashView(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->handler:Lcom/huawei/qrcode/decode/CaptureActivityHandler;

    if-nez v0, :cond_1

    new-instance v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;

    iget-object v2, p0, Lcom/huawei/qrcode/CaptureActivity;->decodeFormats:Ljava/util/Collection;

    iget-object v3, p0, Lcom/huawei/qrcode/CaptureActivity;->decodeHints:Ljava/util/Map;

    iget-object v4, p0, Lcom/huawei/qrcode/CaptureActivity;->characterSet:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/qrcode/decode/CaptureActivityHandler;-><init>(Lcom/huawei/qrcode/CaptureActivity;Ljava/util/Collection;Ljava/util/Map;Ljava/lang/String;Lcom/huawei/qrcode/camera/CameraManager;)V

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->handler:Lcom/huawei/qrcode/decode/CaptureActivityHandler;

    :cond_1
    return-void

    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {v0, p1}, Lcom/huawei/qrcode/camera/CameraManager;->openDriver(Landroid/view/SurfaceHolder;)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraManager;->isSupportFlash()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->setFlashView(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->handler:Lcom/huawei/qrcode/decode/CaptureActivityHandler;

    if-nez v0, :cond_3

    new-instance v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler;

    iget-object v2, p0, Lcom/huawei/qrcode/CaptureActivity;->decodeFormats:Ljava/util/Collection;

    iget-object v3, p0, Lcom/huawei/qrcode/CaptureActivity;->decodeHints:Ljava/util/Map;

    iget-object v4, p0, Lcom/huawei/qrcode/CaptureActivity;->characterSet:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/qrcode/decode/CaptureActivityHandler;-><init>(Lcom/huawei/qrcode/CaptureActivity;Ljava/util/Collection;Ljava/util/Map;Ljava/lang/String;Lcom/huawei/qrcode/camera/CameraManager;)V

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->handler:Lcom/huawei/qrcode/decode/CaptureActivityHandler;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_3
    goto :goto_0

    :catch_0
    move-exception v6

    sget-object v0, Lcom/huawei/qrcode/CaptureActivity;->TAG:Ljava/lang/String;

    invoke-static {v0, v6}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->displayFrameworkBugMessageAndExit()V

    goto :goto_0

    :catch_1
    move-exception v6

    sget-object v0, Lcom/huawei/qrcode/CaptureActivity;->TAG:Ljava/lang/String;

    const-string v1, "Unexpected error initializing camera"

    invoke-static {v0, v1, v6}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->displayFrameworkBugMessageAndExit()V

    :goto_0
    return-void
.end method

.method private initData()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->isPermissionGranted:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->hasSurface:Z

    new-instance v0, Lcom/huawei/qrcode/decode/InactivityTimer;

    invoke-direct {v0, p0}, Lcom/huawei/qrcode/decode/InactivityTimer;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->inactivityTimer:Lcom/huawei/qrcode/decode/InactivityTimer;

    new-instance v0, Lcom/huawei/qrcode/BeepManager;

    invoke-direct {v0, p0}, Lcom/huawei/qrcode/BeepManager;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->beepManager:Lcom/huawei/qrcode/BeepManager;

    new-instance v0, Lcom/huawei/qrcode/AmbientLightManager;

    invoke-direct {v0, p0}, Lcom/huawei/qrcode/AmbientLightManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->ambientLightManager:Lcom/huawei/qrcode/AmbientLightManager;

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->PManager:Landroid/content/pm/PackageManager;

    return-void
.end method

.method private initView()V
    .locals 6

    invoke-static {}, Lcom/huawei/qrcode/util/Util;->hasNotchInScreen()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "CaptureActivity  hasNotchInScreen."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const-string v0, "scanqrcode_sdk_title_layout"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout;

    invoke-virtual {v4}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/Util;->dp2px(Landroid/content/Context;F)I

    move-result v0

    const/high16 v1, 0x42100000    # 36.0f

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/Util;->dp2px(Landroid/content/Context;F)I

    move-result v1

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {p0, v2}, Lcom/huawei/qrcode/util/Util;->dp2px(Landroid/content/Context;F)I

    move-result v2

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {p0, v3}, Lcom/huawei/qrcode/util/Util;->dp2px(Landroid/content/Context;F)I

    move-result v3

    invoke-virtual {v5, v0, v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    invoke-virtual {v4, v5}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    const-string v0, "scanqrcode_sdk_viewfinder_view"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/qrcode/view/ViewfinderView;

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->viewfinderView:Lcom/huawei/qrcode/view/ViewfinderView;

    const-string v0, "scanqrcode_sdk_preview_view"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceView;

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->surfaceView:Landroid/view/SurfaceView;

    const-string v0, "scanqrcode_sdk_scanframe_view"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/qrcode/view/ScanFrameView;

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanFrameView:Lcom/huawei/qrcode/view/ScanFrameView;

    const-string v0, "scanqrcode_sdk_alert"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->alertTv:Landroid/widget/TextView;

    const-string v0, "scanqrcode_sdk_support_tip_five"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->tViewFiveScanTip:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanFunTip:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->tViewFiveScanTip:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->scanFunTip:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const-string v0, "scanqrcode_sdk_use_suggest"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->tViewUseDesc:Landroid/widget/TextView;

    const-string v0, "scanqrcode_sdk_btn_light_control"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->btn_light_control:Landroid/widget/CheckBox;

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->PManager:Landroid/content/pm/PackageManager;

    const-string v1, "android.hardware.camera.flash"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->setFlashView(Z)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->btn_light_control:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->alertTv:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    const-string v0, "scanqrcode_sdk_toolbar_relativelayout"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->toolbar_relatout:Landroid/widget/RelativeLayout;

    const-string v0, "scanqrcode_sdk_img_select"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->img_select_relatout:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->img_select_relatout:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/qrcode/CaptureActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/qrcode/CaptureActivity$1;-><init>(Lcom/huawei/qrcode/CaptureActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->isShowPicSelectBtn:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->toolbar_relatout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->toolbar_relatout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private isFlashOn()Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v0, "CaptureActivity cameraManager is null.isFlashOn false."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraManager;->isFlashOn()Z

    move-result v0

    return v0
.end method

.method private jumpToPicture()V
    .locals 4

    const-string v0, "CaptureActivity jumpToPicture."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.PICK"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "image/*"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "crop"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v0, "return-data"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/16 v0, 0xc

    :try_start_0
    invoke-virtual {p0, v2, v0}, Lcom/huawei/qrcode/CaptureActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "CaptureActivity ActivityNotFoundException."

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "CaptureActivity SecurityException."

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_0
    return-void
.end method

.method private notifyCallApp()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mEventCallBackId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "CaptureActivity notifyCallApp mEventCallBackId is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->mEventCallBackId:Ljava/lang/String;

    const-string v2, ""

    const/16 v3, 0xfa6

    invoke-virtual {v0, v1, v3, v2}, Lcom/huawei/qrcode/logic/EventDispatchManager;->notifyEventiListener(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->mEventCallBackId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeEventListener(Ljava/lang/String;)V

    return-void
.end method

.method private notifyQrcodeResultToUi(I)V
    .locals 4

    iget-object v3, p0, Lcom/huawei/qrcode/CaptureActivity;->scanResult:Ljava/lang/String;

    const/16 v0, 0xfa2

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanResult:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->getQrcodeUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "03"

    iget-object v2, p0, Lcom/huawei/qrcode/CaptureActivity;->produceCode:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/qrcode/logic/bi/SqrcodeSdkBiAnalytics;->reportIdentificationCode(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/16 v0, -0x12f

    if-ne v0, p1, :cond_1

    const-string v0, "scanqrcode_sdk_no_network"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_1
    const/16 v0, -0x130

    if-ne v0, p1, :cond_2

    const-string v0, "CaptureActivity notifyQrcodeResultToUi SCAN_SDK_ERROR_REQUEST_FAIL."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    :cond_2
    :goto_0
    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->mEventCallBackId:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, v3}, Lcom/huawei/qrcode/logic/EventDispatchManager;->notifyEventiListener(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->mEventCallBackId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeEventListener(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->finish()V

    return-void
.end method

.method private onCreateContinue()V
    .locals 3

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    const/16 v0, 0x400

    const/16 v1, 0x400

    invoke-virtual {v2, v0, v1}, Landroid/view/Window;->setFlags(II)V

    const/16 v0, 0x80

    invoke-virtual {v2, v0}, Landroid/view/Window;->addFlags(I)V

    const/high16 v0, 0x8000000

    invoke-virtual {v2, v0}, Landroid/view/Window;->addFlags(I)V

    const-string v0, "scanqrcode_sdk_capture_layout_bkg"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getColorId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    const-string v0, "scan_qrcode_sdk_capture"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getLayoutId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->setContentView(I)V

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->initData()V

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->initView()V

    return-void
.end method

.method private onResumeContinue()V
    .locals 3

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/camera/CameraManager;->getInstance(Landroid/content/Context;)Lcom/huawei/qrcode/camera/CameraManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->viewfinderView:Lcom/huawei/qrcode/view/ViewfinderView;

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/view/ViewfinderView;->setCameraManager(Lcom/huawei/qrcode/camera/CameraManager;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->handler:Lcom/huawei/qrcode/decode/CaptureActivityHandler;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->lastResult:Lo/or;

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->resetStatusView()V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->surfaceView:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v2

    iget-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->hasSurface:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, v2}, Lcom/huawei/qrcode/CaptureActivity;->initCamera(Landroid/view/SurfaceHolder;)V

    goto :goto_0

    :cond_0
    invoke-interface {v2, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    const/4 v0, 0x3

    invoke-interface {v2, v0}, Landroid/view/SurfaceHolder;->setType(I)V

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->beepManager:Lcom/huawei/qrcode/BeepManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/BeepManager;->updatePrefs()V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->ambientLightManager:Lcom/huawei/qrcode/AmbientLightManager;

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/AmbientLightManager;->start(Lcom/huawei/qrcode/camera/CameraManager;)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->inactivityTimer:Lcom/huawei/qrcode/decode/InactivityTimer;

    invoke-virtual {v0}, Lcom/huawei/qrcode/decode/InactivityTimer;->onResume()V

    sget-object v0, Lcom/huawei/qrcode/IntentSource;->NONE:Lcom/huawei/qrcode/IntentSource;

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->source:Lcom/huawei/qrcode/IntentSource;

    return-void
.end method

.method private over()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->inactivityTimer:Lcom/huawei/qrcode/decode/InactivityTimer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->inactivityTimer:Lcom/huawei/qrcode/decode/InactivityTimer;

    invoke-virtual {v0}, Lcom/huawei/qrcode/decode/InactivityTimer;->shutdown()V

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->permissionDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->permissionDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->dismiss()V

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->beepManager:Lcom/huawei/qrcode/BeepManager;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->beepManager:Lcom/huawei/qrcode/BeepManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/BeepManager;->release()V

    :cond_2
    iget-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->activeFlag:Z

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->release()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->activeFlag:Z

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Destroy the qrcode scan capture activity successfully , activeFlag is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/qrcode/CaptureActivity;->activeFlag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;)V

    return-void
.end method

.method private parseStrResult(Ljava/lang/String;)V
    .locals 3

    iput-object p1, p0, Lcom/huawei/qrcode/CaptureActivity;->scanResult:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mEventCallBackId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->scanResult:Ljava/lang/String;

    new-instance v2, Lcom/huawei/qrcode/CaptureActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/qrcode/CaptureActivity$5;-><init>(Lcom/huawei/qrcode/CaptureActivity;)V

    invoke-static {p0, v0, v1, v2}, Lcom/huawei/qrcode/logic/QrcodeUrlHelper;->processSqrcodeResult(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/logic/IHandlerResultListener;)V

    return-void
.end method

.method private release()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->handler:Lcom/huawei/qrcode/decode/CaptureActivityHandler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->handler:Lcom/huawei/qrcode/decode/CaptureActivityHandler;

    invoke-virtual {v0}, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->quitSynchronously()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->handler:Lcom/huawei/qrcode/decode/CaptureActivityHandler;

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->inactivityTimer:Lcom/huawei/qrcode/decode/InactivityTimer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->inactivityTimer:Lcom/huawei/qrcode/decode/InactivityTimer;

    invoke-virtual {v0}, Lcom/huawei/qrcode/decode/InactivityTimer;->onPause()V

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->ambientLightManager:Lcom/huawei/qrcode/AmbientLightManager;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->ambientLightManager:Lcom/huawei/qrcode/AmbientLightManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/AmbientLightManager;->stop()V

    :cond_2
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraManager;->closeDriver()V

    :cond_3
    iget-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->hasSurface:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->surfaceView:Landroid/view/SurfaceView;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->surfaceView:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v2

    invoke-interface {v2, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    :cond_4
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanFrameView:Lcom/huawei/qrcode/view/ScanFrameView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanFrameView:Lcom/huawei/qrcode/view/ScanFrameView;

    invoke-virtual {v0}, Lcom/huawei/qrcode/view/ScanFrameView;->stopQrcodeAnimation()V

    :cond_5
    return-void
.end method

.method private resetStatusView()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->viewfinderView:Lcom/huawei/qrcode/view/ViewfinderView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/view/ViewfinderView;->setVisibility(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->lastResult:Lo/or;

    return-void
.end method

.method private setFlashView(Z)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CaptureActivity setFlashView isSupport "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v2, 0x0

    if-nez p1, :cond_0

    const/16 v2, 0x8

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->btn_light_control:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->btn_light_control:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method private setViewLocation(Landroid/graphics/Rect;)V
    .locals 6

    const-string v0, "CaptureActivity setViewLocation."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "CaptureActivity rectFrame is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanFrameView:Lcom/huawei/qrcode/view/ScanFrameView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget v3, p1, Landroid/graphics/Rect;->top:I

    new-instance v4, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanFrameView:Lcom/huawei/qrcode/view/ScanFrameView;

    invoke-virtual {v0}, Lcom/huawei/qrcode/view/ScanFrameView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v3, v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v5, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanFrameView:Lcom/huawei/qrcode/view/ScanFrameView;

    invoke-virtual {v0, v5}, Lcom/huawei/qrcode/view/ScanFrameView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_1
    const-string v0, "CaptureActivity scanFrameView is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method

.method private showCoustomPermissionDialog(Z)V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->isPermissionGranted:Z

    invoke-static {p0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->createDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->permissionDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->permissionDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v1, "scanqrcode_sdk_permission_content"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setMessage(I)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->permissionDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v1, "scanqrcode_sdk_cancel_down_tip_title"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setTitle(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->permissionDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v1, "scanqrcode_sdk_dialog_ok"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Lcom/huawei/qrcode/CaptureActivity$2;

    invoke-direct {v2, p0, p1}, Lcom/huawei/qrcode/CaptureActivity$2;-><init>(Lcom/huawei/qrcode/CaptureActivity;Z)V

    invoke-interface {v0, v1, v2}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->permissionDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v1, "scanqrcode_sdk_dialog_cancel"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Lcom/huawei/qrcode/CaptureActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/qrcode/CaptureActivity$3;-><init>(Lcom/huawei/qrcode/CaptureActivity;)V

    invoke-interface {v0, v1, v2}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->permissionDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setCanceledOnTouchOutside(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->permissionDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setCancelable(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->permissionDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->show()V

    return-void
.end method

.method private showQueryProgress()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->queryProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->queryProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "promptQueryProgress queryProDialog is show."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-static {p0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->createProgressDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->queryProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->queryProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->setProgressStyle(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->queryProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const-string v1, "scanqrcode_sdk_query_app_tip"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/huawei/qrcode/CaptureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->setMessage(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->queryProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->setCanceledOnTouchOutside(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->queryProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->setCancelable(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->queryProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->show()V

    return-void
.end method

.method private showScaningProgress()V
    .locals 2

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "CaptureActivity showScaningProgress activity is finishing."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mScanRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mScanRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "CaptureActivity showScaningProgress mInstallRemindProDialog is showing."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    return-void

    :cond_1
    invoke-static {p0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->createProgressDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mScanRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mScanRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const-string v1, "scanqrcode_sdk_scanning"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/huawei/qrcode/CaptureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->setMessage(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mScanRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->setCanceledOnTouchOutside(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mScanRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->setCancelable(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mScanRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->show()V

    return-void
.end method

.method private showSurfaceView()V
    .locals 2

    const-string v0, "scanqrcode_sdk_surface_parent"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private startQuery()V
    .locals 3

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->over()V

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->showQueryProgress()V

    invoke-static {}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->getInstance()Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->scanResult:Ljava/lang/String;

    new-instance v2, Lcom/huawei/qrcode/CaptureActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/qrcode/CaptureActivity$6;-><init>(Lcom/huawei/qrcode/CaptureActivity;)V

    invoke-virtual {v0, p0, v1, v2}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;->startQueryApp(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/qrcode/logic/IAppInfoCallBack;)V

    return-void
.end method


# virtual methods
.method public drawViewfinder()V
    .locals 5

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->viewfinderView:Lcom/huawei/qrcode/view/ViewfinderView;

    invoke-virtual {v0}, Lcom/huawei/qrcode/view/ViewfinderView;->drawViewfinder()V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraManager;->getFramingRect()Landroid/graphics/Rect;

    move-result-object v4

    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-direct {p0, v4}, Lcom/huawei/qrcode/CaptureActivity;->setViewLocation(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanFrameView:Lcom/huawei/qrcode/view/ScanFrameView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanFrameView:Lcom/huawei/qrcode/view/ScanFrameView;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/view/ScanFrameView;->updateSize(II)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanFrameView:Lcom/huawei/qrcode/view/ScanFrameView;

    invoke-virtual {v0}, Lcom/huawei/qrcode/view/ScanFrameView;->startQrcodeAnimation()V

    goto :goto_0

    :cond_0
    const-string v0, "CaptureActivity drawViewfinder scanFrameView is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_1
    const-string v0, "CaptureActivity drawViewfinder frame is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->localHandler:Landroid/os/Handler;

    const/16 v1, 0x36

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public getCameraManager()Lcom/huawei/qrcode/camera/CameraManager;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    return-object v0
.end method

.method public getHandler()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->handler:Lcom/huawei/qrcode/decode/CaptureActivityHandler;

    return-object v0
.end method

.method public getViewfinderView()Lcom/huawei/qrcode/view/ViewfinderView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->viewfinderView:Lcom/huawei/qrcode/view/ViewfinderView;

    return-object v0
.end method

.method public handleDecode(Lo/or;Landroid/graphics/Bitmap;F)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->inactivityTimer:Lcom/huawei/qrcode/decode/InactivityTimer;

    invoke-virtual {v0}, Lcom/huawei/qrcode/decode/InactivityTimer;->onActivity()V

    iput-object p1, p0, Lcom/huawei/qrcode/CaptureActivity;->lastResult:Lo/or;

    :try_start_0
    invoke-static {p0, p1}, Lcom/huawei/qrcode/result/ResultHandlerFactory;->makeResultHandler(Lcom/huawei/qrcode/CaptureActivity;Lo/or;)Lcom/huawei/qrcode/result/ResultHandler;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    const-string v0, "CaptureActivity"

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    const-string v3, ""

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lo/or;->e()Ljava/lang/String;

    move-result-object v3

    :cond_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "CaptureActivity handleDecode resText not null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_1
    const-string v0, "CaptureActivity handleDecode resText is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->beepManager:Lcom/huawei/qrcode/BeepManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->beepManager:Lcom/huawei/qrcode/BeepManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/BeepManager;->playBeepSoundAndVibrate()V

    :cond_2
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->source:Lcom/huawei/qrcode/IntentSource;

    sget-object v1, Lcom/huawei/qrcode/IntentSource;->NONE:Lcom/huawei/qrcode/IntentSource;

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/huawei/qrcode/CaptureActivity;->handleDecodeInternally(Lo/or;Lcom/huawei/qrcode/result/ResultHandler;Landroid/graphics/Bitmap;)V

    return-void

    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_5

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->beepManager:Lcom/huawei/qrcode/BeepManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/BeepManager;->playBeepSoundAndVibrate()V

    invoke-direct {p0, p2, p3, p1}, Lcom/huawei/qrcode/CaptureActivity;->drawResultPoints(Landroid/graphics/Bitmap;FLo/or;)V

    :cond_5
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->source:Lcom/huawei/qrcode/IntentSource;

    sget-object v1, Lcom/huawei/qrcode/IntentSource;->NONE:Lcom/huawei/qrcode/IntentSource;

    if-ne v0, v1, :cond_6

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/huawei/qrcode/CaptureActivity;->handleDecodeInternally(Lo/or;Lcom/huawei/qrcode/result/ResultHandler;Landroid/graphics/Bitmap;)V

    :cond_6
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CaptureActivity onActivityResult requestCode=="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "resultCode==="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/16 v0, 0xc

    if-ne v0, p1, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->showScaningProgress()V

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    new-instance v3, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;

    invoke-direct {v3, p0}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/huawei/qrcode/CaptureActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/qrcode/CaptureActivity$4;-><init>(Lcom/huawei/qrcode/CaptureActivity;)V

    invoke-virtual {v3, v2, v0}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->recognitionQrcodePicture(Landroid/net/Uri;Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;)V

    :cond_0
    return-void
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/camera/CameraManager;->setTorch(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/camera/CameraManager;->setTorch(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const-string v1, "scanqrcode_sdk_back"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->notifyCallApp()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->finish()V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->setOriention()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    const-string v0, "intent_event_callback_id"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->mEventCallBackId:Ljava/lang/String;

    const-string v0, "intent_scan_function_tip"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->scanFunTip:Ljava/lang/String;

    const-string v0, "picture_select_btn_flag"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->isShowPicSelectBtn:Z

    goto :goto_0

    :cond_0
    const-string v0, "CaptureActivity clientData is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_3

    const-string v0, "android.permission.CAMERA"

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_3

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;

    move-result-object v0

    const-string v1, "qrcode_camear_permission"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v0, "android.permission.CAMERA"

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;

    move-result-object v0

    const-string v1, "qrcode_camear_permission"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/storage/sp/SqrcodePreferences;->putBoolean(Ljava/lang/String;Z)Z

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.CAMERA"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x14

    invoke-virtual {p0, v0, v1}, Lcom/huawei/qrcode/CaptureActivity;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->showCoustomPermissionDialog(Z)V

    :goto_1
    return-void

    :cond_3
    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->onCreateContinue()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->activeFlag:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Create the qrcode scan capture activity succesfully , activeFlag is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/qrcode/CaptureActivity;->activeFlag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    sget-object v0, Lcom/huawei/qrcode/CaptureActivity;->TAG:Ljava/lang/String;

    const-string v1, " onDestroy"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->over()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->source:Lcom/huawei/qrcode/IntentSource;

    sget-object v1, Lcom/huawei/qrcode/IntentSource;->NATIVE_APP_INTENT:Lcom/huawei/qrcode/IntentSource;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->setResult(I)V

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->finish()V

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->source:Lcom/huawei/qrcode/IntentSource;

    sget-object v1, Lcom/huawei/qrcode/IntentSource;->NONE:Lcom/huawei/qrcode/IntentSource;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->source:Lcom/huawei/qrcode/IntentSource;

    sget-object v1, Lcom/huawei/qrcode/IntentSource;->ZXING_LINK:Lcom/huawei/qrcode/IntentSource;

    if-ne v0, v1, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->lastResult:Lo/or;

    if-eqz v0, :cond_2

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/qrcode/CaptureActivity;->restartPreviewAfterDelay(J)V

    const/4 v0, 0x1

    return v0

    :sswitch_1
    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->notifyCallApp()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->finish()V

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
        0x4 -> :sswitch_1
        0x1b -> :sswitch_2
        0x50 -> :sswitch_2
    .end sparse-switch
.end method

.method public onMultiWindowModeChanged(Z)V
    .locals 4

    invoke-super {p0, p1}, Landroid/app/Activity;->onMultiWindowModeChanged(Z)V

    if-eqz p1, :cond_0

    const-string v0, "CaptureActivity isInMultiWindowMode true."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->mEventCallBackId:Ljava/lang/String;

    const-string v2, ""

    const/16 v3, 0xfa8

    invoke-virtual {v0, v1, v3, v2}, Lcom/huawei/qrcode/logic/EventDispatchManager;->notifyEventiListener(Ljava/lang/String;ILjava/lang/String;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity;->mEventCallBackId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeEventListener(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->finish()V

    :cond_0
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    invoke-static {p0}, Lcom/huawei/qrcode/camera/CameraManager;->getInstance(Landroid/content/Context;)Lcom/huawei/qrcode/camera/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraManager;->refreshCameraParameters()V

    return-void
.end method

.method protected onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    sget-object v0, Lcom/huawei/qrcode/CaptureActivity;->TAG:Ljava/lang/String;

    const-string v1, " onpause"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->isPermissionGranted:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->activeFlag:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->release()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->activeFlag:Z

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Pause the qrcode scan capture activity successfully , activeFlag is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/qrcode/CaptureActivity;->activeFlag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    array-length v0, p3

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/16 v0, 0x14

    if-ne p1, v0, :cond_3

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->onCreateContinue()V

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->onResumeContinue()V

    goto :goto_0

    :cond_2
    const-string v0, "android.permission.CAMERA"

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v1

    invoke-direct {p0, v1}, Lcom/huawei/qrcode/CaptureActivity;->showCoustomPermissionDialog(Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method protected onResume()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    iget-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->isPermissionGranted:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->onResumeContinue()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->activeFlag:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Resume the qrcode scan capture activity successfully , activeFlag is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/qrcode/CaptureActivity;->activeFlag:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;)V

    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 3

    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    const-string v0, "CaptureActivity onWindowFocusChanged."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->btn_light_control:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->isFlashOn()Z

    move-result v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CaptureActivity onWindowFocusChanged isFlashOn---->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->btn_light_control:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    :cond_0
    const-string v0, "CaptureActivity onWindowFocusChanged btn_light_control is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method

.method public restartPreviewAfterDelay(J)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->handler:Lcom/huawei/qrcode/decode/CaptureActivityHandler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->handler:Lcom/huawei/qrcode/decode/CaptureActivityHandler;

    const v1, 0x7f080004

    invoke-virtual {v0, v1, p1, p2}, Lcom/huawei/qrcode/decode/CaptureActivityHandler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    invoke-direct {p0}, Lcom/huawei/qrcode/CaptureActivity;->resetStatusView()V

    return-void
.end method

.method protected setOriention()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/CaptureActivity;->setRequestedOrientation(I)V

    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 7

    if-nez p1, :cond_0

    sget-object v0, Lcom/huawei/qrcode/CaptureActivity;->TAG:Ljava/lang/String;

    const-string v1, "*** WARNING *** surfaceCreated() gave us a null surface!"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    sget-object v0, Lcom/huawei/qrcode/CaptureActivity;->TAG:Ljava/lang/String;

    const-string v1, "surfaceCreated()"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->hasSurface:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->hasSurface:Z

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/CaptureActivity;->initCamera(Landroid/view/SurfaceHolder;)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraManager;->getFramingRect()Landroid/graphics/Rect;

    move-result-object v3

    if-eqz v3, :cond_1

    iget v0, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/huawei/qrcode/CaptureActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "scanqrcode_sdk_qrcode_alert_top"

    invoke-static {p0, v2}, Lcom/huawei/qrcode/util/ResourceUtil;->getDimensId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    add-float v4, v0, v1

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->alertTv:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    instance-of v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    move-object v6, v5

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    float-to-int v0, v4

    iput v0, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity;->alertTv:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity;->hasSurface:Z

    return-void
.end method
