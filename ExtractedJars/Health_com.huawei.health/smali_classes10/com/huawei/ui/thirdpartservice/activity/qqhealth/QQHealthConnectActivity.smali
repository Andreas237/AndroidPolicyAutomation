.class public Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;
    }
.end annotation


# instance fields
.field private a:Lo/egd;

.field private b:Lo/egn;

.field private c:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

.field d:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

.field private e:Landroid/content/Context;

.field private g:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

.field private h:Lo/fjk;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b:Lo/egn;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    .line 111
    new-instance v0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$5;-><init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->h:Lo/fjk;

    return-void
.end method

.method private a()V
    .locals 4

    .line 146
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showWaitingDialog: mLoadDataDialog = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b:Lo/egn;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 149
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showWaitingDialog: mLoadDataDialog = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b:Lo/egn;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    return-void

    .line 153
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 154
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showWaitingDialog: isFinishing..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    return-void

    .line 166
    :cond_1
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/thirdpartservice/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b:Lo/egn;

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b:Lo/egn;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_login_server:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 172
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Landroid/content/Context;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->g:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 175
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "closeLoadDataDialog: mLoadDataDialog = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b:Lo/egn;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    invoke-virtual {p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeLoadDataDialog: isFinishing..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    return-void

    .line 182
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 184
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b:Lo/egn;

    .line 186
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->a()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->login()V

    .line 203
    :cond_0
    return-void
.end method

.method public c(Lo/cyx;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 206
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserName"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    new-instance v0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$4;

    invoke-direct {v0, p0, p1}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$4;-><init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;Lo/cyx;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    .line 216
    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$4;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 217
    return-void
.end method

.method public e(Landroid/app/Activity;Lo/fjk;)V
    .locals 4

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 190
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 191
    const/16 v0, 0x14

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    const/16 v0, 0x3fc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 193
    const/16 v0, 0x7e4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 194
    const-string v0, "qqID"

    const/4 v1, 0x1

    invoke-static {v0, v1, v2}, Lo/fjs;->a(Ljava/lang/String;ILjava/util/List;)Ljava/lang/String;

    move-result-object v3

    .line 195
    new-instance v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    invoke-direct {v0, p1, p2, v3}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;-><init>(Landroid/app/Activity;Lo/fjk;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;

    .line 197
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 69
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 70
    iput-object p0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->e:Landroid/content/Context;

    .line 71
    sget v0, Lcom/huawei/ui/thirdpartservice/R$layout;->activity_qq_health_connect:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->setContentView(I)V

    .line 72
    invoke-static {}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->getInstance()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    .line 73
    new-instance v0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;-><init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->g:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->h:Lo/fjk;

    invoke-virtual {p0, p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->e(Landroid/app/Activity;Lo/fjk;)V

    .line 76
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->qqhealthConnectButton:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->a:Lo/egd;

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->a:Lo/egd;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$1;-><init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 139
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 140
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QQHealthActivity onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->g:Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 142
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d()V

    .line 143
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 133
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QQHealthActivity onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 135
    return-void
.end method
