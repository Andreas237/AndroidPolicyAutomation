.class public Lcom/huawei/qrcode/widget/custom/BuilderCustom;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/qrcode/widget/custom/BuilderCustom;

    invoke-direct {v0}, Lcom/huawei/qrcode/widget/custom/BuilderCustom;-><init>()V

    invoke-static {v0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->registerBuilder(Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 2

    new-instance v0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

    const-string v1, "ScanQrcodeSdkCustomDialogTheme"

    invoke-static {p1, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStyleId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-direct {v0, p1, v1}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method

.method public createProgressDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;
    .locals 2

    new-instance v0, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;

    const-string v1, "ScanQrcodeSdkCustomDialogTheme"

    invoke-static {p1, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStyleId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-direct {v0, p1, v1}, Lcom/huawei/qrcode/widget/custom/dialog/HwProgressDialogCustom;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method
