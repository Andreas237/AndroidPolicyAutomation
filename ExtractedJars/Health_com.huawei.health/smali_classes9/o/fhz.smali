.class public Lo/fhz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fhz$e;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/app/Activity;

.field private c:Landroid/widget/CheckBox;

.field private d:Lo/egw;

.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lo/fhz;->b:Landroid/app/Activity;

    .line 63
    return-void
.end method

.method private c(Landroid/content/Context;Landroid/view/View;)V
    .locals 2

    .line 171
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_ele:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fhz;->a:Landroid/widget/TextView;

    .line 172
    iget-object v0, p0, Lo/fhz;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 173
    return-void
.end method

.method static synthetic c(Lo/fhz;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2}, Lo/fhz;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 3

    .line 145
    new-instance v2, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    iget-object v0, p0, Lo/fhz;->b:Landroid/app/Activity;

    invoke-direct {v2, v0}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;-><init>(Landroid/app/Activity;)V

    .line 146
    new-instance v0, Lo/fhz$e;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1, p0}, Lo/fhz$e;-><init>(Lo/fhz;Landroid/os/Looper;Lo/fhz;)V

    iput-object v0, p0, Lo/fhz;->e:Landroid/os/Handler;

    .line 147
    iget-object v0, p0, Lo/fhz;->e:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->initHandler(Landroid/os/Handler;)V

    .line 148
    new-instance v0, Lo/fhz$5;

    invoke-direct {v0, p0, v2, p1}, Lo/fhz$5;-><init>(Lo/fhz;Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;Landroid/content/Context;)V

    new-instance v1, Lo/fhz$4;

    invoke-direct {v1, p0}, Lo/fhz$4;-><init>(Lo/fhz;)V

    invoke-virtual {v2, p1, v0, v1}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->hmsConnect(Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;)V

    .line 168
    return-void
.end method

.method static synthetic d(Lo/fhz;Landroid/content/Context;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lo/fhz;->e(Landroid/content/Context;)V

    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 2

    .line 176
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 177
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 178
    invoke-static {p1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 179
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 182
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 183
    const/16 v0, 0x76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    const/16 v0, 0x2719

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->getCountryCode(Lo/dcx;)Ljava/lang/String;

    move-result-object v9

    .line 186
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v10

    .line 187
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v11

    .line 188
    new-instance v12, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;

    invoke-direct {v12}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;-><init>()V

    .line 189
    move-object v0, v12

    move-object v1, p1

    move-object v2, p2

    move-object v4, v8

    move-object v5, v9

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, "_"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lo/fhz$6;

    invoke-direct {v7, p0}, Lo/fhz$6;-><init>(Lo/fhz;)V

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->signHttpReq(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lo/czi;)Ljava/lang/String;

    .line 200
    return-void
.end method

.method static synthetic e(Lo/fhz;Landroid/content/Context;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lo/fhz;->d(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 6

    .line 66
    if-nez p1, :cond_0

    .line 67
    return-void

    .line 69
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$layout;->services_custom_view_dialog:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 70
    invoke-static {p1, v3}, Lo/fjg;->d(Landroid/content/Context;Landroid/view/View;)V

    .line 72
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_agree_dialog_user_plan_box:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lo/fhz;->c:Landroid/widget/CheckBox;

    .line 73
    iget-object v0, p0, Lo/fhz;->c:Landroid/widget/CheckBox;

    invoke-static {}, Lo/dgk;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 75
    iget-object v0, p0, Lo/fhz;->c:Landroid/widget/CheckBox;

    new-instance v1, Lo/fhz$2;

    invoke-direct {v1, p0, p1}, Lo/fhz$2;-><init>(Lo/fhz;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 87
    invoke-direct {p0, p1, v3}, Lo/fhz;->c(Landroid/content/Context;Landroid/view/View;)V

    .line 88
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_privacy_revoke_auth:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    .line 89
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_privacy_change_notice:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 104
    new-instance v0, Lo/egw$c;

    invoke-direct {v0, p1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 105
    invoke-virtual {v0, v5}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 106
    const/16 v1, 0x18

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v1, v2}, Lo/egw$c;->b(Landroid/view/View;II)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    .line 107
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fhz$3;

    invoke-direct {v2, p0}, Lo/fhz$3;-><init>(Lo/fhz;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    new-instance v1, Lo/fhz$1;

    invoke-direct {v1, p0, p1}, Lo/fhz$1;-><init>(Lo/fhz;Landroid/content/Context;)V

    .line 114
    invoke-virtual {v0, v4, v1}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 138
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lo/fhz;->d:Lo/egw;

    .line 140
    iget-object v0, p0, Lo/fhz;->d:Lo/egw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCancelable(Z)V

    .line 141
    iget-object v0, p0, Lo/fhz;->d:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 142
    return-void
.end method
