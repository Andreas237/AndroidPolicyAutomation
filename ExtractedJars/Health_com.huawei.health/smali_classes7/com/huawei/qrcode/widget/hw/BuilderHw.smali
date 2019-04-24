.class public Lcom/huawei/qrcode/widget/hw/BuilderHw;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/widget/WidgetBuilder$IBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/qrcode/widget/hw/BuilderHw;

    invoke-direct {v0}, Lcom/huawei/qrcode/widget/hw/BuilderHw;-><init>()V

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
    .locals 1

    new-instance v0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;

    invoke-direct {v0, p1}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public createProgressDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;
    .locals 1

    new-instance v0, Lcom/huawei/qrcode/widget/hw/dialog/RawProgressDialog;

    invoke-direct {v0, p1}, Lcom/huawei/qrcode/widget/hw/dialog/RawProgressDialog;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
