.class public Lo/bxk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static i:Z


# instance fields
.field private a:Z

.field private b:Z

.field private c:Lcom/huawei/health/suggestion/model/Plan;

.field private d:Lcom/huawei/health/suggestion/receiver/NetworkStateReceiver;

.field private e:Z

.field private f:Lcom/huawei/health/suggestion/model/Plan;

.field private h:Landroid/content/Context;

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const/4 v0, 0x0

    sput-boolean v0, Lo/bxk;->i:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/bxk;->h:Landroid/content/Context;

    .line 47
    return-void
.end method

.method private static a(Z)V
    .locals 0

    .line 259
    sput-boolean p0, Lo/bxk;->i:Z

    .line 260
    return-void
.end method

.method private static a()Z
    .locals 1

    .line 255
    sget-boolean v0, Lo/bxk;->i:Z

    return v0
.end method

.method private b()V
    .locals 5

    .line 111
    const-string v0, "Suggestion_PlanSwitchProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newPlan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 113
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 114
    iget-object v0, p0, Lo/bxk;->h:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 115
    return-void
.end method

.method private c()V
    .locals 5

    .line 219
    iget-boolean v0, p0, Lo/bxk;->a:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lo/bxk;->b:Z

    if-eqz v0, :cond_3

    .line 220
    iget-boolean v0, p0, Lo/bxk;->e:Z

    if-eqz v0, :cond_0

    .line 222
    const-string v0, "Suggestion_PlanSwitchProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start From run card"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/bxk;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 224
    const-string v0, "RunCard"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 225
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 226
    iget-object v0, p0, Lo/bxk;->h:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 227
    goto :goto_0

    .line 229
    :cond_0
    iget-object v0, p0, Lo/bxk;->c:Lcom/huawei/health/suggestion/model/Plan;

    if-eqz v0, :cond_2

    .line 230
    const-string v0, "Suggestion_PlanSwitchProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCurrentPlan != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    iget v0, p0, Lo/bxk;->k:I

    if-nez v0, :cond_1

    .line 233
    iget-object v0, p0, Lo/bxk;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {p0, v0}, Lo/bxk;->b(Lcom/huawei/health/suggestion/model/Plan;)V

    goto :goto_0

    .line 234
    :cond_1
    iget v0, p0, Lo/bxk;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 236
    iget-object v0, p0, Lo/bxk;->f:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {p0, v0}, Lo/bxk;->b(Lcom/huawei/health/suggestion/model/Plan;)V

    goto :goto_0

    .line 239
    :cond_2
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/bxk;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 240
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 241
    iget-object v0, p0, Lo/bxk;->h:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 245
    :cond_3
    :goto_0
    return-void
.end method

.method private c(Z)V
    .locals 0

    .line 263
    invoke-static {p1}, Lo/bxk;->a(Z)V

    .line 264
    return-void
.end method

.method static synthetic c(Lo/bxk;Z)Z
    .locals 0

    .line 27
    iput-boolean p1, p0, Lo/bxk;->b:Z

    return p1
.end method

.method static synthetic d(Lo/bxk;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 0

    .line 27
    iput-object p1, p0, Lo/bxk;->c:Lcom/huawei/health/suggestion/model/Plan;

    return-object p1
.end method

.method static synthetic d(Lo/bxk;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lo/bxk;->c()V

    return-void
.end method

.method static synthetic d(Lo/bxk;Z)Z
    .locals 0

    .line 27
    iput-boolean p1, p0, Lo/bxk;->a:Z

    return p1
.end method

.method static synthetic e(Lo/bxk;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 0

    .line 27
    iput-object p1, p0, Lo/bxk;->f:Lcom/huawei/health/suggestion/model/Plan;

    return-object p1
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Lo/bxk;->b()V

    .line 72
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 3

    .line 248
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/bxk;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 249
    const-string v0, "plan"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 250
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 251
    iget-object v0, p0, Lo/bxk;->h:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 252
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 6

    .line 95
    const-string v0, "Suggestion_PlanSwitchProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchToRunPlanReport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/bsp;->a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v4

    .line 97
    if-nez v4, :cond_0

    .line 98
    const-string v0, "Suggestion_PlanSwitchProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PlanRecord is null when planId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-void

    .line 102
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWorkoutTimes()I

    move-result v0

    if-eqz v0, :cond_1

    .line 103
    new-instance v5, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/TrainReportActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 104
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 105
    const-string v0, "finish_plan"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 106
    iget-object v0, p0, Lo/bxk;->h:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 108
    :cond_1
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 8

    .line 75
    const-string v0, "Suggestion_PlanSwitchProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchToFitnessPlanReport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/btj;->d(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v4

    .line 77
    if-nez v4, :cond_0

    .line 78
    const-string v0, "Suggestion_PlanSwitchProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "planRecord is null and planId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    return-void

    .line 82
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWorkoutTimes()I

    move-result v0

    if-lez v0, :cond_1

    .line 83
    const-string v0, "Suggestion_PlanSwitchProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "go to TrainReportActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    new-instance v5, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/TrainReportActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 85
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 86
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/btj;->e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v6

    .line 87
    invoke-static {v6}, Lo/btm;->c(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v7

    .line 88
    const-string v0, "plan"

    invoke-virtual {v5, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 89
    const-string v0, "finish_plan"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 90
    iget-object v0, p0, Lo/bxk;->h:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 92
    :cond_1
    return-void
.end method

.method public d()V
    .locals 2

    .line 60
    invoke-static {}, Lo/bxk;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lo/bxk;->h:Landroid/content/Context;

    iget-object v1, p0, Lo/bxk;->d:Lcom/huawei/health/suggestion/receiver/NetworkStateReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 63
    :cond_0
    return-void
.end method

.method public varargs d(Z[I)V
    .locals 4

    .line 169
    const-string v0, "Suggestion_PlanSwitchProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAndStartMoudle start whichCard = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const/4 v0, 0x0

    aget v0, p2, v0

    iput v0, p0, Lo/bxk;->k:I

    .line 171
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bxk;->b:Z

    .line 172
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bxk;->a:Z

    .line 173
    iput-boolean p1, p0, Lo/bxk;->e:Z

    .line 176
    new-instance v0, Lo/bxk$1;

    invoke-direct {v0, p0}, Lo/bxk$1;-><init>(Lo/bxk;)V

    invoke-static {v0}, Lo/buc;->b(Lo/bui;)V

    .line 193
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lo/bxk$3;

    invoke-direct {v1, p0}, Lo/bxk$3;-><init>(Lo/bxk;)V

    invoke-interface {v0, v1}, Lo/bsp;->e(Lo/bui;)Lcom/huawei/health/suggestion/model/Plan;

    .line 213
    return-void
.end method

.method public e()V
    .locals 3

    .line 50
    invoke-static {}, Lo/bxk;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/bxk;->c(Z)V

    .line 52
    new-instance v0, Lcom/huawei/health/suggestion/receiver/NetworkStateReceiver;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/receiver/NetworkStateReceiver;-><init>()V

    iput-object v0, p0, Lo/bxk;->d:Lcom/huawei/health/suggestion/receiver/NetworkStateReceiver;

    .line 53
    new-instance v2, Landroid/content/IntentFilter;

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 54
    const v0, 0x7fffffff

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->setPriority(I)V

    .line 55
    iget-object v0, p0, Lo/bxk;->h:Landroid/content/Context;

    iget-object v1, p0, Lo/bxk;->d:Lcom/huawei/health/suggestion/receiver/NetworkStateReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 57
    :cond_0
    return-void
.end method
