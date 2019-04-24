.class public Lcom/huawei/health/ServiceAreaAlertActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Lo/emr;

.field private c:Landroid/widget/LinearLayout;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->a:Landroid/widget/TextView;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->c:Landroid/widget/LinearLayout;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->b:Lo/emr;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/ServiceAreaAlertActivity;)Landroid/content/Context;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->e:Landroid/content/Context;

    return-object v0
.end method

.method private a()Ljava/lang/String;
    .locals 9

    .line 158
    const/4 v4, 0x0

    .line 159
    invoke-static {}, Lo/dbf;->y()Ljava/util/List;

    move-result-object v5

    .line 160
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 161
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 163
    invoke-virtual {p0}, Lcom/huawei/health/ServiceAreaAlertActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getDisplayCountry()Ljava/lang/String;

    move-result-object v6

    .line 164
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 165
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    move-object v4, v8

    .line 167
    goto :goto_1

    .line 169
    :cond_0
    goto :goto_0

    .line 170
    :cond_1
    :goto_1
    const-string v0, "Login_ServiceAreaAlertActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initServiceAreaView() , strDisplayCountry="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    :cond_2
    return-object v4
.end method

.method private b()V
    .locals 5

    .line 182
    const-string v0, "Login_ServiceAreaAlertActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "quitApplication()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 184
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 185
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 186
    invoke-virtual {p0}, Lcom/huawei/health/ServiceAreaAlertActivity;->finish()V

    .line 187
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/ServiceAreaAlertActivity;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/huawei/health/ServiceAreaAlertActivity;->b()V

    return-void
.end method

.method private d()V
    .locals 10

    .line 80
    const v0, 0x7f120468

    invoke-virtual {p0, v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->b:Lo/emr;

    .line 81
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->b:Lo/emr;

    new-instance v1, Lcom/huawei/health/ServiceAreaAlertActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/ServiceAreaAlertActivity$4;-><init>(Lcom/huawei/health/ServiceAreaAlertActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    const v0, 0x7f1218f8

    invoke-virtual {p0, v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->a:Landroid/widget/TextView;

    .line 88
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->E(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 89
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    invoke-direct {p0}, Lcom/huawei/health/ServiceAreaAlertActivity;->a()Ljava/lang/String;

    move-result-object v4

    .line 92
    :cond_0
    invoke-static {v4}, Lo/dbf;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 94
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->e:Landroid/content/Context;

    const/16 v1, 0x2734

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "select_country"

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v5, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 96
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    const v0, 0x7f1218f7

    invoke-virtual {p0, v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->c:Landroid/widget/LinearLayout;

    .line 98
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->c:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/health/ServiceAreaAlertActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/ServiceAreaAlertActivity$3;-><init>(Lcom/huawei/health/ServiceAreaAlertActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 107
    const v0, 0x7f1218f9

    invoke-virtual {p0, v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 108
    const v0, 0x7f05014f

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 110
    :cond_1
    const v0, 0x7f1218ff

    invoke-virtual {p0, v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/egd;

    .line 111
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->N(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 112
    const/4 v0, 0x1

    const/high16 v1, 0x41500000    # 13.0f

    invoke-virtual {v6, v0, v1}, Lo/egd;->setTextSize(IF)V

    .line 114
    :cond_2
    const v0, 0x7f020200

    invoke-virtual {p0, v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    .line 115
    invoke-virtual {v6, v7}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 116
    new-instance v0, Lcom/huawei/health/ServiceAreaAlertActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/ServiceAreaAlertActivity$1;-><init>(Lcom/huawei/health/ServiceAreaAlertActivity;)V

    invoke-virtual {v6, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    const v0, 0x7f121900

    invoke-virtual {p0, v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/egd;

    .line 126
    const v0, 0x7f0201fe

    invoke-virtual {p0, v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    .line 127
    invoke-virtual {v8, v9}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 128
    new-instance v0, Lcom/huawei/health/ServiceAreaAlertActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/ServiceAreaAlertActivity$5;-><init>(Lcom/huawei/health/ServiceAreaAlertActivity;)V

    invoke-virtual {v8, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/ServiceAreaAlertActivity;)Landroid/widget/TextView;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->a:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 7

    .line 56
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 57
    const/16 v0, 0x1775

    if-ne v0, p1, :cond_1

    .line 58
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 59
    if-nez p3, :cond_0

    .line 60
    return-void

    .line 62
    :cond_0
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 63
    const-string v5, ""

    .line 64
    const-string v6, ""

    .line 65
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 66
    const-string v0, "service_area_country"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 67
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    invoke-static {v5}, Lo/dbf;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 70
    iget-object v0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->e:Landroid/content/Context;

    const/16 v1, 0x2734

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "select_country"

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v6, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 72
    const-string v0, "Login_ServiceAreaAlertActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult, mCountryText = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  strCountry = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    :cond_1
    return-void
.end method

.method public onBackPressed()V
    .locals 4

    .line 177
    const-string v0, "Login_ServiceAreaAlertActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    invoke-direct {p0}, Lcom/huawei/health/ServiceAreaAlertActivity;->b()V

    .line 179
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 46
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 47
    const-string v0, "Login_ServiceAreaAlertActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    iput-object p0, p0, Lcom/huawei/health/ServiceAreaAlertActivity;->e:Landroid/content/Context;

    .line 50
    const v0, 0x7f0703e1

    invoke-virtual {p0, v0}, Lcom/huawei/health/ServiceAreaAlertActivity;->setContentView(I)V

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/ServiceAreaAlertActivity;->d()V

    .line 52
    return-void
.end method
