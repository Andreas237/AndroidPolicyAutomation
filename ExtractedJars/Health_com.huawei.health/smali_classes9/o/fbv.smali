.class public Lo/fbv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation
.end field

.field private static d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afa;>;"
        }
    .end annotation
.end field

.field private static final k:[Ljava/lang/String;


# instance fields
.field private a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

.field private b:Landroid/widget/ListView;

.field private e:Landroid/content/Context;

.field private f:Z

.field private g:Lo/ewj;

.field private h:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/fbv;->c:Ljava/util/ArrayList;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/fbv;->d:Ljava/util/ArrayList;

    .line 55
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "a8ba095d-4123-43c4-a30a-0240011c58de"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/fbv;->k:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fbv;->f:Z

    .line 63
    iput-object p1, p0, Lo/fbv;->e:Landroid/content/Context;

    .line 64
    iput-boolean p2, p0, Lo/fbv;->f:Z

    .line 65
    invoke-direct {p0}, Lo/fbv;->e()V

    .line 66
    return-void
.end method

.method static synthetic a(Lo/fbv;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lo/fbv;->f:Z

    return v0
.end method

.method static synthetic b(Lo/fbv;)Lo/ewj;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/fbv;->g:Lo/ewj;

    return-object v0
.end method

.method static synthetic b(Lo/fbv;Ljava/lang/String;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lo/fbv;->d(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lo/fbv;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/fbv;->h:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    return-object v0
.end method

.method static synthetic d(Lo/fbv;)Landroid/content/Context;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/fbv;->e:Landroid/content/Context;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 5

    .line 194
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/fbv;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 195
    const-string v0, "health_wifi_device_userId"

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 196
    const-string v0, "health_wifi_device_productId"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 197
    const-string v0, "PressureAdjustMultiDevicesDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "glxx  health_wifi_device_productId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", userid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/act;->a:Lo/act;

    invoke-virtual {v3}, Lo/act;->d()Lo/acu;

    move-result-object v3

    invoke-virtual {v3}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 198
    iget-object v0, p0, Lo/fbv;->e:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 199
    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/afa;>;)V"
        }
    .end annotation

    .line 91
    const-string v0, "PressureAdjustMultiDevicesDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMultiUsersListDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 92
    iget-object v0, p0, Lo/fbv;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->pressure_multi_devices_list_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 93
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_multi_devices_list:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lo/fbv;->b:Landroid/widget/ListView;

    .line 94
    new-instance v0, Lo/ewj;

    iget-object v1, p0, Lo/fbv;->e:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lo/ewj;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lo/fbv;->g:Lo/ewj;

    .line 95
    iget-object v0, p0, Lo/fbv;->b:Landroid/widget/ListView;

    iget-object v1, p0, Lo/fbv;->g:Lo/ewj;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 96
    new-instance v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    iget-object v1, p0, Lo/fbv;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/fbv;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 97
    iget-object v0, p0, Lo/fbv;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_pressure_calibrate_multi_devices_title:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(I)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v0

    .line 98
    invoke-virtual {v0, v4}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(Landroid/view/View;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lo/fbv$1;

    invoke-direct {v2, p0}, Lo/fbv$1;-><init>(Lo/fbv;)V

    .line 99
    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->d(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v0

    .line 105
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b(Z)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 106
    iget-object v0, p0, Lo/fbv;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->e()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    iput-object v0, p0, Lo/fbv;->h:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 107
    iget-object v0, p0, Lo/fbv;->b:Landroid/widget/ListView;

    new-instance v1, Lo/fbv$4;

    invoke-direct {v1, p0}, Lo/fbv$4;-><init>(Lo/fbv;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 134
    return-void
.end method

.method private d(Lo/acl$a;)V
    .locals 7

    .line 73
    const-string v0, "PressureAdjustMultiDevicesDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initDevicesList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    sget-object v0, Lo/fbv;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 75
    sget-object v0, Lo/fbv;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 77
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->e(Lo/acl$a;)Ljava/util/ArrayList;

    move-result-object v4

    .line 78
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 79
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v6

    .line 80
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fbv;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v6}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    sget-object v0, Lo/fbv;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 84
    :cond_1
    sget-object v0, Lo/fbv;->c:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/aex;->d(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 85
    sget-object v0, Lo/fbv;->d:Ljava/util/ArrayList;

    sget-object v1, Lo/fbv;->c:Ljava/util/ArrayList;

    invoke-static {v1}, Lo/aex;->d(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 87
    :cond_2
    const-string v0, "PressureAdjustMultiDevicesDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PressureAdjustMultiDevicesDialog productInfos size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/fbv;->d:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    return-void
.end method

.method private e()V
    .locals 1

    .line 69
    sget-object v0, Lo/fbv;->d:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lo/fbv;->d(Ljava/util/List;)V

    .line 70
    return-void
.end method

.method private e(Ljava/lang/String;)Z
    .locals 8

    .line 216
    sget-object v4, Lo/fbv;->k:[Ljava/lang/String;

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    .line 217
    invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 218
    const-string v0, "PressureAdjustMultiDevicesDialog"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportPressureDevcie()=true "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "productType = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    const/4 v0, 0x1

    return v0

    .line 216
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 222
    :cond_1
    const-string v0, "PressureAdjustMultiDevicesDialog"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportPressureDevcie()=false "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "productType = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    const/4 v0, 0x0

    return v0
.end method

.method private g()I
    .locals 8

    .line 204
    const/4 v2, 0x0

    .line 205
    const/4 v3, 0x0

    .line 206
    iget-object v0, p0, Lo/fbv;->b:Landroid/widget/ListView;

    invoke-static {v0}, Lo/ahf;->a(Landroid/widget/ListView;)I

    move-result v4

    .line 207
    iget-object v0, p0, Lo/fbv;->e:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 208
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    .line 209
    invoke-virtual {v6}, Landroid/view/Display;->getHeight()I

    move-result v0

    div-int/lit8 v7, v0, 0x2

    .line 210
    if-ge v4, v7, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v7

    .line 211
    :goto_0
    sget-object v0, Lo/fbv;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    add-int v3, v2, v0

    .line 212
    return v3
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 181
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/fbv;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 182
    const-string v0, "health_wifi_device_userId"

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 183
    sget-object v0, Lo/fbv;->c:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/afj;

    .line 184
    if-eqz v5, :cond_0

    .line 185
    const-string v0, "PressureAdjustMultiDevicesDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "glxx  health_wifi_device_productId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 186
    const-string v0, "health_wifi_device_productId"

    invoke-virtual {v5}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 187
    iget-object v0, p0, Lo/fbv;->e:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 189
    :cond_0
    const-string v0, "PressureAdjustMultiDevicesDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "glxx startToPressureAdjustByWifiDevicedeviceInfo is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 191
    :goto_0
    return-void
.end method

.method public b()Z
    .locals 7

    .line 151
    sget-object v0, Lo/acl$a;->b:Lo/acl$a;

    invoke-direct {p0, v0}, Lo/fbv;->d(Lo/acl$a;)V

    .line 153
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 154
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 155
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPressAutoMonitor()Z

    move-result v5

    .line 156
    if-eqz v5, :cond_0

    .line 157
    new-instance v6, Lo/afa;

    invoke-direct {v6}, Lo/afa;-><init>()V

    .line 158
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/afa;->e(I)V

    .line 159
    invoke-virtual {v6, v4}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 160
    sget-object v0, Lo/fbv;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    goto :goto_0

    .line 162
    :cond_0
    const-string v0, "PressureAdjustMultiDevicesDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Wear device not support pressure adjust"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :goto_0
    goto :goto_1

    .line 165
    :cond_1
    const-string v0, "PressureAdjustMultiDevicesDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No exist wear device or device is not connected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    :goto_1
    const-string v0, "PressureAdjustMultiDevicesDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShowMultiDevicesList productInfos size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/fbv;->d:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    sget-object v0, Lo/fbv;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    .line 170
    iget-object v0, p0, Lo/fbv;->g:Lo/ewj;

    sget-object v1, Lo/fbv;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/ewj;->b(Ljava/util/List;)V

    .line 171
    const/4 v0, 0x1

    return v0

    .line 173
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 1

    .line 177
    invoke-static {}, Lo/ahu;->d()Z

    move-result v0

    return v0
.end method

.method public d()V
    .locals 2

    .line 140
    sget-object v0, Lo/fbv;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lo/fbv;->h:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fbv;->h:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 141
    iget-object v0, p0, Lo/fbv;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    invoke-direct {p0}, Lo/fbv;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->b(I)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 142
    iget-object v0, p0, Lo/fbv;->h:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->show()V

    .line 144
    :cond_0
    return-void
.end method
