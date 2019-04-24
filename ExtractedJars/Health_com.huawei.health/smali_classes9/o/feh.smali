.class public Lo/feh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
    .locals 1

    .line 28
    sget-object v0, Lo/feh;->d:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 34
    invoke-static {}, Lo/ahu;->e()Ljava/util/ArrayList;

    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 36
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afj;

    iget-object v0, v0, Lo/afj;->b:Ljava/lang/String;

    invoke-static {p0, p1, v0}, Lo/feh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v1, v0, :cond_1

    .line 39
    invoke-static {p0, p1, v2}, Lo/feh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 41
    :cond_1
    :goto_0
    return-void
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList<Lo/afj;>;)V"
        }
    .end annotation

    .line 54
    const-string v0, "WeightDevicePressureUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPressureCalibrateDeviceDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    invoke-static {p2}, Lo/aex;->d(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v4

    .line 56
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 57
    const-string v0, "WeightDevicePressureUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showPressureCalibrateDeviceDialog productInfoList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    return-void

    .line 60
    :cond_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->pressure_multi_devices_list_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 61
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_multi_devices_list:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ListView;

    .line 62
    new-instance v7, Lo/ewj;

    invoke-direct {v7, p0, v4}, Lo/ewj;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 63
    invoke-virtual {v6, v7}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 64
    new-instance v8, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    invoke-direct {v8, p0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;-><init>(Landroid/content/Context;)V

    .line 65
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_pressure_calibrate_multi_devices_title:I

    invoke-virtual {v8, v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(I)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v0

    .line 66
    invoke-virtual {v0, v5}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(Landroid/view/View;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lo/feh$4;

    invoke-direct {v2}, Lo/feh$4;-><init>()V

    .line 67
    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->d(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v0

    .line 73
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b(Z)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 74
    invoke-virtual {v8}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->e()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    sput-object v0, Lo/feh;->d:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 75
    sget-object v0, Lo/feh;->d:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->show()V

    .line 76
    new-instance v0, Lo/feh$3;

    invoke-direct {v0, v7, p0, p1}, Lo/feh$3;-><init>(Lo/ewj;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 91
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
    .locals 0

    .line 28
    sput-object p0, Lo/feh;->d:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    return-object p0
.end method

.method private static c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 45
    const-string v0, "WeightDevicePressureUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goToPressureCalibrate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 47
    const-string v0, "health_wifi_device_userId"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    const-string v0, "health_wifi_device_productId"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 49
    invoke-virtual {p0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 50
    return-void
.end method

.method static synthetic e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 28
    invoke-static {p0, p1, p2}, Lo/feh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
