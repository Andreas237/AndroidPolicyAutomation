.class public Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Lo/egd;

.field private c:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/content/Context;

.field private f:Z

.field private g:I

.field private i:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 54
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->g:I

    .line 70
    new-instance v0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity$2;-><init>(Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->i:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 5

    .line 140
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===Enter pressClickButton"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->g:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 142
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===STATUS_NOT_CONNECTED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitConnectActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 144
    invoke-virtual {p0, v4}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->startActivity(Landroid/content/Intent;)V

    .line 145
    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->g:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 146
    invoke-static {}, Lo/fjr;->a()Lo/fjr;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fjr;->d(Z)V

    .line 147
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->c()V

    .line 148
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===mGoogleApiClient.isConnected()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v3}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->clearDefaultAccountAndReconnect()Lcom/google/android/gms/common/api/PendingResult;

    .line 153
    :cond_1
    :goto_0
    return-void
.end method

.method private c()V
    .locals 4

    .line 127
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initGoogleFitView() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    invoke-static {}, Lo/fjr;->a()Lo/fjr;

    move-result-object v0

    invoke-virtual {v0}, Lo/fjr;->c()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->f:Z

    .line 129
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initGoogleFitView() isConnect = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->f:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-boolean v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->f:Z

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->b:Lo/egd;

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_qq_health_disconnect_button:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 132
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->g:I

    goto :goto_0

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->b:Lo/egd;

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_btsdk_confirm_connect:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 135
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->g:I

    .line 137
    :goto_0
    return-void
.end method

.method private d()V
    .locals 6

    .line 85
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->google_fit_open_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->b:Lo/egd;

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->b:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->google_fit_guide_describe:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->a:Landroid/widget/TextView;

    .line 88
    invoke-virtual {p0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_google_fit_welcome_guide_text_hw:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->google_fit_guide_note:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->d:Landroid/widget/TextView;

    .line 91
    invoke-virtual {p0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_google_fit_welcome_guide_note:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 92
    invoke-virtual {p0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_service_listview_item_googlefit_content:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 91
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 93
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->b:Lo/egd;

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_btsdk_confirm_connect:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->b:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 96
    return-void
.end method

.method private d(Landroid/content/Context;)Z
    .locals 5

    .line 156
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v4

    .line 157
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 158
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/google/android/gms/common/GoogleApiAvailability;->isUserResolvableError(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Lcom/google/android/gms/common/GoogleApiAvailability;->getErrorDialog(Landroid/app/Activity;II)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 161
    :cond_0
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/common/GoogleApiAvailability;->getErrorString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    const/4 v0, 0x0

    return v0

    .line 164
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private e()V
    .locals 4

    .line 168
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===connectGoogleFit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===mGoogleApiClient=null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    invoke-direct {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/google/android/gms/fitness/Fitness;->HISTORY_API:Lcom/google/android/gms/common/api/Api;

    .line 171
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    const-string v2, "https://www.googleapis.com/auth/fitness.activity.write"

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    .line 172
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    const-string v2, "https://www.googleapis.com/auth/fitness.body.write"

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    .line 173
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    const-string v2, "https://www.googleapis.com/auth/fitness.location.write"

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    .line 174
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    const-string v2, "https://www.googleapis.com/auth/datastoremobile"

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    .line 175
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 176
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 177
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 178
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 180
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->c()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 108
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 110
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->google_fit_open_button:I

    if-ne v4, v0, :cond_2

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v5

    .line 112
    if-nez v5, :cond_0

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_connect_network:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 114
    return-void

    .line 116
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->e:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 117
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no google service"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    return-void

    .line 120
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->a()V

    .line 123
    :cond_2
    return-void
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 202
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===Connected!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    invoke-static {}, Lo/fjr;->a()Lo/fjr;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fjr;->d(Z)V

    .line 204
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->g:I

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->i:Landroid/os/Handler;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 206
    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 4
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 218
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===onConnectionFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    invoke-static {}, Lo/fjr;->a()Lo/fjr;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fjr;->d(Z)V

    .line 220
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->g:I

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->i:Landroid/os/Handler;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 222
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 4

    .line 210
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===onConnectionSuspended"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    invoke-static {}, Lo/fjr;->a()Lo/fjr;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fjr;->d(Z)V

    .line 212
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->g:I

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->i:Landroid/os/Handler;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 214
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 63
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 64
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    sget v0, Lcom/huawei/ui/thirdpartservice/R$layout;->activity_google_access:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->setContentView(I)V

    .line 66
    iput-object p0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->e:Landroid/content/Context;

    .line 67
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->d()V

    .line 68
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 197
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 198
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 100
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 101
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123==onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->e()V

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->c()V

    .line 104
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 184
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 185
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===onStart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    return-void
.end method

.method public onStop()V
    .locals 4

    .line 190
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 191
    const-string v0, "GoogleFitOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===123===onStop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;->c:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 193
    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 0

    .line 226
    if-nez p1, :cond_0

    .line 227
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 229
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 230
    return-void
.end method
