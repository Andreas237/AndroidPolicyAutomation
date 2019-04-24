.class public Lo/dlw;
.super Lo/dlv;
.source "SourceFile"

# interfaces
.implements Lo/dml;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dlw$a;,
        Lo/dlw$e;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private a:Ljava/util/concurrent/ExecutorService;

.field private d:Lo/dlo;

.field private final e:Lo/dmk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 66
    const/4 v0, 0x0

    sput-object v0, Lo/dlw;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 72
    invoke-direct {p0, p1}, Lo/dlv;-><init>(Landroid/content/Context;)V

    .line 73
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dlw;->a:Ljava/util/concurrent/ExecutorService;

    .line 74
    invoke-static {}, Lo/dmk;->b()Lo/dmk;

    move-result-object v0

    iput-object v0, p0, Lo/dlw;->e:Lo/dmk;

    .line 75
    new-instance v0, Lo/dlo;

    iget-object v1, p0, Lo/dlw;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dlo;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dlw;->d:Lo/dlo;

    .line 76
    return-void
.end method

.method static synthetic a(Lo/dlw;)Lo/dlo;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/dlw;->d:Lo/dlo;

    return-object v0
.end method

.method static synthetic a(Lo/dlw;ILjava/lang/Object;)Z
    .locals 1

    .line 45
    invoke-direct {p0, p1, p2}, Lo/dlw;->c(ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private b(Ljava/lang/String;Lo/dmd;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/dmd<Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;>;>;)V"
        }
    .end annotation

    .line 207
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestActivities, joinStatus="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 209
    const-string v0, "joinStatus"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    const-string v0, "finishFlag"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    const-string v0, "activityType"

    const-string v1, "11"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    const-string v0, "pageNo"

    const-string v1, "0"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    const-string v0, "pageSize"

    const-string v1, "50"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    const-string v0, "phoneType"

    invoke-static {}, Lcom/huawei/operation/utils/OperationUtils;->getPhoneType()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    iget-object v0, p0, Lo/dlw;->e:Lo/dmk;

    new-instance v1, Lo/dmg;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/dmg;-><init>(I)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/dmk;->c(ILo/dmj;)V

    .line 217
    iget-object v0, p0, Lo/dlw;->e:Lo/dmk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v4, p2}, Lo/dmk;->c(ILjava/util/Map;Lo/dmd;)V

    .line 218
    return-void
.end method

.method private c(ILjava/lang/Object;)Z
    .locals 5

    .line 338
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/16 v0, 0x8

    if-eq v0, p1, :cond_0

    const/16 v0, -0x3e9

    if-ne v0, p1, :cond_1

    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    :cond_1
    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 340
    :goto_0
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "errcode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "@@ ret is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    if-nez v4, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method static synthetic f()Ljava/lang/String;
    .locals 1

    .line 45
    sget-object v0, Lo/dlw;->c:Ljava/lang/String;

    return-object v0
.end method

.method private g()V
    .locals 2

    .line 108
    iget-object v0, p0, Lo/dlw;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlw$5;

    invoke-direct {v1, p0}, Lo/dlw$5;-><init>(Lo/dlw;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 116
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 185
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recommendFitnessVedio"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    const-string v0, "recommend_office"

    const-string v1, "ai-walk-003"

    const/16 v2, 0x7530

    invoke-virtual {p0, v0, v2, v1}, Lo/dlw;->c(Ljava/lang/String;ILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 188
    iget-object v0, p0, Lo/dlw;->b:Landroid/content/Context;

    const/16 v1, 0x2712

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 189
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not recommend, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    return-void

    .line 192
    :cond_0
    invoke-static {}, Lo/dlj;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 193
    iget-object v0, p0, Lo/dlw;->b:Landroid/content/Context;

    const/16 v1, 0x2712

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 194
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no sportStepLittle label, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    return-void

    .line 197
    :cond_1
    invoke-virtual {p0}, Lo/dlw;->h()V

    .line 198
    return-void
.end method

.method public b()V
    .locals 5

    .line 166
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remindReachStepsGoal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const-string v0, "standard_activity_steps_target"

    const-string v1, "ai-walk-002"

    const/16 v2, 0x7530

    invoke-virtual {p0, v0, v2, v1}, Lo/dlw;->c(Ljava/lang/String;ILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 169
    iget-object v0, p0, Lo/dlw;->b:Landroid/content/Context;

    const/16 v1, 0x2711

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 170
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not recommend, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    return-void

    .line 173
    :cond_0
    new-instance v4, Lo/dlw$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lo/dlw$a;-><init>(Lo/dlw;Lo/dlw$5;)V

    .line 174
    const-string v0, "1"

    invoke-direct {p0, v0, v4}, Lo/dlw;->b(Ljava/lang/String;Lo/dmd;)V

    .line 175
    return-void
.end method

.method public c()V
    .locals 4

    .line 143
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recommendReachGoalActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    const-string v0, "recommend_standard_activity"

    const-string v1, "ai-walk-001"

    const/16 v2, 0x7530

    invoke-virtual {p0, v0, v2, v1}, Lo/dlw;->c(Ljava/lang/String;ILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    iget-object v0, p0, Lo/dlw;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 147
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not recommend, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    return-void

    .line 150
    :cond_0
    invoke-static {}, Lo/dlj;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 151
    iget-object v0, p0, Lo/dlw;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 152
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no sportStepLittle label, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    return-void

    .line 155
    :cond_1
    const-string v0, "0"

    new-instance v1, Lo/dlw$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/dlw$e;-><init>(Lo/dlw;Lo/dlw$5;)V

    invoke-direct {p0, v0, v1}, Lo/dlw;->b(Ljava/lang/String;Lo/dmd;)V

    .line 156
    return-void
.end method

.method public c(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/String;>;>;)V"
        }
    .end annotation

    .line 120
    iget-object v0, p0, Lo/dlw;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlw$2;

    invoke-direct {v1, p0, p1}, Lo/dlw$2;-><init>(Lo/dlw;Ljava/util/Map;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 133
    return-void
.end method

.method public d()V
    .locals 4

    .line 96
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startRuleByUser"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    iget-object v0, p0, Lo/dlw;->b:Landroid/content/Context;

    const-string v1, "last_checktime_healthcare_by_user"

    const-wide/32 v2, 0x493e0

    invoke-static {v0, v1, v2, v3}, Lo/dmn;->a(Landroid/content/Context;Ljava/lang/String;J)Z

    move-result v0

    if-nez v0, :cond_0

    .line 99
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startRuleByUser, checkInterval fail, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    return-void

    .line 102
    :cond_0
    iget-object v0, p0, Lo/dlw;->b:Landroid/content/Context;

    const-string v1, "last_checktime_healthcare_by_user"

    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 102
    invoke-static {v0, v1, v2, v3}, Lo/dmn;->c(Landroid/content/Context;Ljava/lang/String;J)V

    .line 104
    invoke-direct {p0}, Lo/dlw;->g()V

    .line 105
    return-void
.end method

.method public e()V
    .locals 4

    .line 80
    invoke-super {p0}, Lo/dlv;->e()V

    .line 81
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTimerCheck"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lo/dlw;->b:Landroid/content/Context;

    const-string v1, "last_checktime_healthcare_by_timer"

    const-wide/32 v2, 0x5265c00

    invoke-static {v0, v1, v2, v3}, Lo/dmn;->a(Landroid/content/Context;Ljava/lang/String;J)Z

    move-result v0

    if-nez v0, :cond_0

    .line 84
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTimerCheck, checkInterval fail, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    return-void

    .line 87
    :cond_0
    iget-object v0, p0, Lo/dlw;->b:Landroid/content/Context;

    const-string v1, "last_checktime_healthcare_by_timer"

    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 87
    invoke-static {v0, v1, v2, v3}, Lo/dmn;->c(Landroid/content/Context;Ljava/lang/String;J)V

    .line 89
    invoke-direct {p0}, Lo/dlw;->g()V

    .line 90
    return-void
.end method

.method public h()V
    .locals 5

    .line 292
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAgeInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v4

    .line 294
    if-eqz v4, :cond_0

    .line 295
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "1000"

    new-instance v2, Lo/dlw$4;

    invoke-direct {v2, p0}, Lo/dlw$4;-><init>(Lo/dlw;)V

    invoke-virtual {v4, v0, v1, v2}, Lcom/huawei/cloudservice/CloudAccount;->getUserInfo(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 335
    :cond_0
    return-void
.end method
