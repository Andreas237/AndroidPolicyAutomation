.class public Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$b;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/content/Context;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Landroid/content/Context;

.field private f:Lo/emr;

.field private g:I

.field private h:Lhuawei/widget/HwProgressBar;

.field private i:Landroid/widget/ImageView;

.field private k:I

.field private l:Landroid/widget/LinearLayout;

.field private m:Lo/egd;

.field private n:Lo/egd;

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/os/Handler;

.field private final q:Landroid/content/BroadcastReceiver;

.field private r:Lo/egy;

.field private s:Lo/egv;

.field private t:Lo/egv;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 68
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->c:I

    .line 69
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->d:Ljava/lang/String;

    .line 70
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->a:Ljava/lang/String;

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->g:I

    .line 79
    new-instance v0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$b;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$b;-><init>(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->p:Landroid/os/Handler;

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->r:Lo/egy;

    .line 358
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->s:Lo/egv;

    .line 578
    new-instance v0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$4;-><init>(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->q:Landroid/content/BroadcastReceiver;

    .line 621
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->t:Lo/egv;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/widget/LinearLayout;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->o:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private a()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 7

    .line 252
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    invoke-virtual {v0}, Lo/env;->c()Ljava/util/List;

    move-result-object v4

    .line 253
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 254
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "findTargetDevice mDeviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    const/4 v0, 0x0

    return-object v0

    .line 257
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 258
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 259
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "findTargetDevice find"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    return-object v6

    .line 262
    :cond_1
    goto :goto_0

    .line 263
    :cond_2
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "findTargetDevice NOT find"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lhuawei/widget/HwProgressBar;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->h:Lhuawei/widget/HwProgressBar;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 151
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->device_manager_wear_reconnect:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->setContentView(I)V

    .line 152
    sget v0, Lcom/huawei/ui/homehealth/R$id;->no_connect_detail_title_bar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->f:Lo/emr;

    .line 153
    sget v0, Lcom/huawei/ui/homehealth/R$id;->no_connect_device_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->i:Landroid/widget/ImageView;

    .line 154
    sget v0, Lcom/huawei/ui/homehealth/R$id;->no_connect_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->o:Landroid/widget/LinearLayout;

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 156
    sget v0, Lcom/huawei/ui/homehealth/R$id;->no_connect_loading_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->l:Landroid/widget/LinearLayout;

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 158
    sget v0, Lcom/huawei/ui/homehealth/R$id;->no_connect_loading_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->h:Lhuawei/widget/HwProgressBar;

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->h:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 161
    sget v0, Lcom/huawei/ui/homehealth/R$id;->no_connect_button_connect:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->n:Lo/egd;

    .line 162
    sget v0, Lcom/huawei/ui/homehealth/R$id;->no_connect_button_delete:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->m:Lo/egd;

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->n:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->m:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->f:Lo/emr;

    new-instance v1, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$3;-><init>(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 171
    return-void
.end method

.method private b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 7

    .line 268
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 269
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode null == goingConnectDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    return-void

    .line 272
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    invoke-virtual {v0}, Lo/env;->c()Ljava/util/List;

    move-result-object v4

    .line 273
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 274
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mDeviceInfoList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    return-void

    .line 277
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 278
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode goingConnected == DeviceWorkMode.RUN_WORK_MODE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 280
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 281
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode set device enable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode set device enable identify "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 285
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 286
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 287
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 288
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode target device disable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode set device enable identify "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 292
    :cond_3
    goto/16 :goto_0

    :cond_4
    goto/16 :goto_2

    .line 294
    :cond_5
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode goingConnected == DeviceWorkMode.BAND_MODE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 296
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 297
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode set device enable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode set device enable identify "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 301
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 302
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    .line 303
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    .line 304
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode target device disable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode set device enable identify "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 308
    :cond_7
    goto/16 :goto_1

    .line 309
    :cond_8
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->q()V

    .line 312
    :goto_2
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/etq;->c(Ljava/util/List;)V

    .line 313
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5

    .line 506
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter openWearHome "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 510
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e:Landroid/content/Context;

    const-string v1, "com.huawei.ui.homewear21.home.WearHomeActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 511
    const-string v0, "device_id"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 512
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 513
    return-void
.end method

.method private c()V
    .locals 5

    .line 224
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dde;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 227
    goto :goto_0

    .line 225
    :catch_0
    move-exception v4

    .line 226
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->c()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;Ljava/lang/String;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b(Ljava/lang/String;)V

    return-void
.end method

.method private d()V
    .locals 9

    .line 107
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 108
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 109
    const-string v0, "device_name"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->a:Ljava/lang/String;

    .line 110
    const-string v0, "device_identify"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->d:Ljava/lang/String;

    .line 111
    const-string v0, "device_picID"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->g:I

    .line 112
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() mDeviceName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "mIdentify:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "mDevicePic:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->f:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 114
    const-string v0, "device_type"

    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->k:I

    .line 116
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "current device Type :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    iget v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->k:I

    invoke-static {v0}, Lo/dda;->i(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 118
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is plugin download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    iget v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->k:I

    invoke-static {v0}, Lo/dda;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 121
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download uuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/eaw;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v7

    .line 123
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download pluginAvaiable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 125
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v8

    .line 126
    if-eqz v8, :cond_0

    .line 127
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download img:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lo/eav;->d()Lo/ean;

    move-result-object v3

    invoke-virtual {v3}, Lo/ean;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->i:Landroid/widget/ImageView;

    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v1

    invoke-virtual {v8}, Lo/eav;->d()Lo/ean;

    move-result-object v2

    invoke-virtual {v2}, Lo/ean;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v8, v2}, Lo/eaw;->d(Lo/eav;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 130
    :cond_0
    iget v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->k:I

    invoke-static {v0}, Lo/dda;->f(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$mipmap;->device_icon_band_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 134
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$mipmap;->device_icon_watch_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 137
    :goto_0
    goto :goto_1

    .line 138
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$mipmap;->pic_grus:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 140
    :goto_1
    goto :goto_2

    .line 141
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->a:Ljava/lang/String;

    const-string v1, "HUAWEI AM-R1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$mipmap;->img_device_r1_pic1:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_2

    .line 144
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->i:Landroid/widget/ImageView;

    iget v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->g:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 148
    :cond_5
    :goto_2
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->p()V

    .line 149
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lo/egy;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->r:Lo/egy;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;Lo/egy;)Lo/egy;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->r:Lo/egy;

    return-object p1
.end method

.method private e()V
    .locals 4

    .line 239
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/ahg;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 241
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->k()V

    goto :goto_0

    .line 244
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->a()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->p:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->p:Landroid/os/Handler;

    const/16 v1, 0x65

    const-wide/16 v2, 0x4e20

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 249
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .line 360
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_can_not_connect:I

    .line 361
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 362
    invoke-virtual {v0, p1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 363
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->c(Ljava/lang/Boolean;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$1;-><init>(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V

    .line 364
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 373
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->s:Lo/egv;

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->s:Lo/egv;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->s:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 376
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lo/egd;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->n:Lo/egd;

    return-object v0
.end method

.method private f()V
    .locals 11

    .line 414
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_press_restart4:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 417
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 418
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 420
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 421
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 422
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e(Ljava/lang/String;)V

    .line 424
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Lo/egd;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->m:Lo/egd;

    return-object v0
.end method

.method private g()V
    .locals 11

    .line 390
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_press_restart1:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 393
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 394
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 396
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 397
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 398
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e(Ljava/lang/String;)V

    .line 400
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/os/Handler;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->p:Landroid/os/Handler;

    return-object v0
.end method

.method private h()V
    .locals 9

    .line 379
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 381
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 383
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 384
    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 385
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e(Ljava/lang/String;)V

    .line 386
    return-void
.end method

.method private i()V
    .locals 11

    .line 402
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 404
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_press_restart3:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 405
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 406
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 407
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 408
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 409
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 410
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e(Ljava/lang/String;)V

    .line 412
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->r()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)Landroid/widget/LinearLayout;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->l:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private k()V
    .locals 6

    .line 316
    iget v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->c:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 317
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->i()Ljava/util/List;

    move-result-object v4

    .line 318
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/etq;->c(Ljava/util/List;)V

    .line 319
    iget v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->c:I

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->p:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->p:Landroid/os/Handler;

    const/16 v1, 0x65

    const-wide/16 v2, 0x4e20

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 323
    goto/16 :goto_2

    .line 325
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 326
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 327
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v5

    .line 328
    packed-switch v5, :pswitch_data_0

    goto :goto_0

    .line 331
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->g()V

    .line 332
    goto :goto_1

    .line 335
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->n()V

    .line 336
    goto :goto_1

    .line 338
    :pswitch_2
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->o()V

    .line 339
    goto :goto_1

    .line 341
    :pswitch_3
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->i()V

    .line 342
    goto :goto_1

    .line 345
    :pswitch_4
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->f()V

    .line 346
    goto :goto_1

    .line 348
    :goto_0
    :pswitch_5
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->h()V

    .line 352
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->c:I

    .line 355
    :cond_1
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_4
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private l()V
    .locals 5

    .line 455
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter sendDeviceListChangeBroadcast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.DEVICE_LIST_DELETE"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 458
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 459
    return-void
.end method

.method private m()V
    .locals 10

    .line 477
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unbindDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->i()Ljava/util/List;

    move-result-object v5

    .line 479
    const-string v6, ""

    .line 480
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 481
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delete mac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    const/4 v7, -0x1

    .line 483
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 484
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "list mac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 486
    invoke-interface {v5, v9}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    .line 487
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v6

    .line 489
    :cond_0
    goto :goto_0

    .line 490
    :cond_1
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteUseDeviceList() id = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    const/4 v0, -0x1

    if-eq v0, v7, :cond_2

    .line 492
    invoke-interface {v5, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 494
    :cond_2
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/etq;->c(Ljava/util/List;)V

    .line 496
    :cond_3
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 497
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    const-string v0, "device_name"

    invoke-interface {v7, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    sget-object v0, Lo/dae;->fM:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    .line 500
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v8, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 501
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxf;->b(Ljava/lang/String;)V

    .line 502
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->l()V

    .line 503
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->finish()V

    .line 504
    return-void
.end method

.method private n()V
    .locals 11

    .line 426
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 428
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_press_restart2:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 429
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 430
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 431
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 432
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 433
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 434
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e(Ljava/lang/String;)V

    .line 435
    return-void
.end method

.method private o()V
    .locals 11

    .line 438
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 440
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_press_restart5:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 441
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 442
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 443
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 444
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 445
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 446
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e(Ljava/lang/String;)V

    .line 447
    return-void
.end method

.method private p()V
    .locals 5

    .line 604
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerWearBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 607
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 608
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->q:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 609
    return-void
.end method

.method private q()V
    .locals 5

    .line 660
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    .line 661
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_main_device_ota_error_message:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_user_permission_know:I

    new-instance v2, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$10;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$10;-><init>(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V

    .line 662
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 668
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 669
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egy;->setCancelable(Z)V

    .line 670
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 671
    return-void
.end method

.method private r()V
    .locals 7

    .line 626
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBandUnavailableDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e:Landroid/content/Context;

    const-string v1, "com.huawei.ui.homehealth.deviceManagerCard.DeviceManagerWearNoConnect"

    invoke-static {v0, v1}, Lo/dbf;->h(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 628
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isForeground : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 629
    if-nez v4, :cond_0

    .line 630
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isForeground : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    return-void

    .line 634
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->t:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 635
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->t:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 636
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBandUnavailableDialog Already show!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 637
    return-void

    .line 641
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_band_is_unavailable_tip_string_newphone:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 642
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_service_area_notice_title:I

    .line 643
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 644
    invoke-virtual {v0, v5}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$8;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$8;-><init>(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V

    .line 645
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v6

    .line 650
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->t:Lo/egv;

    .line 651
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->t:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 652
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->t:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 653
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->t:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 655
    :cond_2
    return-void
.end method

.method private t()V
    .locals 5

    .line 612
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterWearBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->q:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 618
    goto :goto_0

    .line 614
    :catch_0
    move-exception v4

    .line 615
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 618
    goto :goto_0

    .line 616
    :catch_1
    move-exception v4

    .line 617
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    :goto_0
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 176
    sget v0, Lcom/huawei/ui/homehealth/R$id;->no_connect_button_connect:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 177
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dpb;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose connect, other wear device is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->q()V

    goto/16 :goto_1

    .line 180
    :cond_0
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dpa;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 181
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose connect, other AW70 device is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->q()V

    goto/16 :goto_1

    .line 186
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    .line 187
    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->p()Z

    move-result v0

    if-nez v0, :cond_2

    .line 188
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    .line 189
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_device_bluetooth_open_request:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_bt_left_btn_info:I

    new-instance v2, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$5;-><init>(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V

    .line 190
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_bt_right_btn_info:I

    new-instance v2, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect$2;-><init>(Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;)V

    .line 199
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v4

    .line 207
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->r:Lo/egy;

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->r:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->r:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 210
    goto :goto_0

    .line 212
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    :goto_0
    goto :goto_1

    .line 214
    :catch_0
    move-exception v4

    .line 215
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    goto :goto_1

    .line 218
    :cond_3
    sget v0, Lcom/huawei/ui/homehealth/R$id;->no_connect_button_delete:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 219
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->m()V

    .line 221
    :cond_4
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 88
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 89
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b:Landroid/content/Context;

    .line 90
    iput-object p0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->e:Landroid/content/Context;

    .line 91
    const-string v0, "DeviceManagerWearNoConnect"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->b()V

    .line 93
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->d()V

    .line 94
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 98
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 99
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->t()V

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/deviceManagerCard/DeviceManagerWearNoConnect;->p:Landroid/os/Handler;

    .line 104
    :cond_0
    return-void
.end method
