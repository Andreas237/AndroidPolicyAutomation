.class public Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$a;
    }
.end annotation


# static fields
.field private static l:[Ljava/lang/String;

.field private static s:[Ljava/lang/String;


# instance fields
.field private a:Landroid/widget/Switch;

.field private b:Landroid/widget/RadioGroup;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Lo/enz;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/os/Handler;

.field private g:Landroid/content/Context;

.field private h:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field private i:Z

.field private k:Landroid/content/Context;

.field private m:Lo/dqi;

.field private n:Ljava/lang/String;

.field private o:Landroid/widget/RadioButton;

.field private p:Landroid/widget/RadioButton;

.field private t:Landroid/widget/CompoundButton$OnCheckedChangeListener;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 181
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->l:[Ljava/lang/String;

    .line 186
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_PHONE_STATE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_CONTACTS"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "android.permission.CALL_PHONE"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->s:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 74
    new-instance v0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$a;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$a;-><init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->f:Landroid/os/Handler;

    .line 76
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->n:Ljava/lang/String;

    .line 350
    new-instance v0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;-><init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->t:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RadioButton;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->p:Landroid/widget/RadioButton;

    return-object v0
.end method

.method private a()V
    .locals 3

    .line 110
    invoke-static {p0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->d:Lo/enz;

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->m:Lo/dqi;

    const-string v1, "weather_switch_status"

    new-instance v2, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$4;-><init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 135
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Lo/enz;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->d:Lo/enz;

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 141
    const-string v0, "location"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/location/LocationManager;

    .line 142
    if-nez v4, :cond_0

    .line 143
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkLocationServiceStatus() if (locationManager == null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    return-void

    .line 146
    :cond_0
    const/4 v5, 0x0

    .line 147
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 148
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isWeather_push()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 149
    const/4 v5, 0x1

    .line 150
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isWeather_push capability is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    :cond_1
    const-string v0, "gps"

    invoke-virtual {v4, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "network"

    .line 154
    invoke-virtual {v4, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz v5, :cond_2

    .line 156
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkLocationServiceStatus() if (!locationManager.isProviderEnabled(android.location.LocationManager.GPS_PROVIDER) && !locationManager.isProviderEnabled(android.location.LocationManager.NETWORK_PROVIDER)&& isDeviceSupportWeatherPush"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    new-instance v0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$5;-><init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 165
    :cond_2
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;Z)Z
    .locals 0

    .line 57
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->i:Z

    return p1
.end method

.method private c()V
    .locals 2

    .line 403
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->i:Z

    if-eqz v0, :cond_0

    .line 405
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_weather_push_opened_tip_health:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 408
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_weather_push_closed_tip_health:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 410
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Z
    .locals 1

    .line 57
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->i:Z

    return v0
.end method

.method private d()V
    .locals 4

    .line 266
    sget v0, Lcom/huawei/ui/device/R$id;->weather_report_content:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->e:Landroid/widget/TextView;

    .line 267
    sget v0, Lcom/huawei/ui/device/R$id;->weather_report_switch_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->a:Landroid/widget/Switch;

    .line 268
    sget v0, Lcom/huawei/ui/device/R$id;->rl_unit:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c:Landroid/widget/RelativeLayout;

    .line 269
    sget v0, Lcom/huawei/ui/device/R$id;->rg_unit:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->b:Landroid/widget/RadioGroup;

    .line 270
    sget v0, Lcom/huawei/ui/device/R$id;->rb_celsius:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->p:Landroid/widget/RadioButton;

    .line 271
    sget v0, Lcom/huawei/ui/device/R$id;->rb_fahrenheit:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->o:Landroid/widget/RadioButton;

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportUnitWeather()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 274
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->i:Z

    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->p:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setClickable(Z)V

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->o:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setClickable(Z)V

    goto :goto_0

    .line 280
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c:Landroid/widget/RelativeLayout;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->p:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setClickable(Z)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->o:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setClickable(Z)V

    goto :goto_0

    .line 286
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 288
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->m:Lo/dqi;

    const-string v1, "weather_switch_unit_status"

    new-instance v2, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$7;-><init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->b:Landroid/widget/RadioGroup;

    new-instance v1, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$8;-><init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 337
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->e:Landroid/widget/TextView;

    if-nez v0, :cond_2

    .line 338
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ERROR widget get!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    return-void

    .line 342
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->a:Landroid/widget/Switch;

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->i:Z

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->a:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->t:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 344
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c()V

    .line 345
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->d()V

    return-void
.end method

.method private d([Ljava/lang/String;)V
    .locals 5

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->k:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v4

    .line 205
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestPermissions() hasPermissionNeeded ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    if-nez v4, :cond_0

    .line 207
    new-instance v0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$1;-><init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V

    invoke-static {p0, p1, v0}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    goto :goto_0

    .line 219
    :cond_0
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestPermissions() permission if (!hasPermissionNeeded) ELSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RadioButton;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->o:Landroid/widget/RadioButton;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->k:Landroid/content/Context;

    sget-object v1, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->l:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 196
    sget-object v0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->s:[Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->d([Ljava/lang/String;)V

    .line 198
    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/Switch;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->a:Landroid/widget/Switch;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->b()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->c()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/content/Context;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->g:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/os/Handler;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->f:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a(II)V
    .locals 5

    .line 225
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_replace_dialog_title_notification:I

    .line 226
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 227
    invoke-virtual {v0, p1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$3;

    invoke-direct {v2, p0, p2}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$3;-><init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;I)V

    .line 228
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$2;-><init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V

    .line 249
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 254
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 255
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egv;->setCancelable(Z)V

    .line 256
    invoke-virtual {v4}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 257
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 259
    :cond_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 168
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter onActivityResult requestcode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";resultcode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 170
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 172
    :sswitch_0
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter checkGpsPermission 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->e()V

    .line 175
    goto :goto_1

    .line 177
    :goto_0
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onActivityResult default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x66 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 82
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 83
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_settings_weatherreport:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->setContentView(I)V

    .line 84
    iput-object p0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->g:Landroid/content/Context;

    .line 85
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->k:Landroid/content/Context;

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->m:Lo/dqi;

    .line 87
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 88
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 89
    const-string v0, "device_id"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->n:Ljava/lang/String;

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->n:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 92
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->a()V

    .line 94
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 98
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 99
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->setResult(ILandroid/content/Intent;)V

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 103
    return-void
.end method
