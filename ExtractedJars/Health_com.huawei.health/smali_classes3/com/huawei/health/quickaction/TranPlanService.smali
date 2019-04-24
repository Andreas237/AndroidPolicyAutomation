.class public Lcom/huawei/health/quickaction/TranPlanService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/os/Handler;

.field private e:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const-class v0, Lcom/huawei/health/quickaction/TranPlanService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/quickaction/TranPlanService;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 43
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService;->e:Ljava/lang/Boolean;

    .line 116
    new-instance v0, Lcom/huawei/health/quickaction/TranPlanService$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/quickaction/TranPlanService$4;-><init>(Lcom/huawei/health/quickaction/TranPlanService;)V

    iput-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService;->b:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/quickaction/TranPlanService;)Landroid/os/Handler;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService;->b:Landroid/os/Handler;

    return-object v0
.end method

.method private declared-synchronized a()V
    .locals 5

    monitor-enter p0

    .line 94
    :try_start_0
    sget-object v0, Lcom/huawei/health/quickaction/TranPlanService;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPlanData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/quickaction/TranPlanService$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/quickaction/TranPlanService$2;-><init>(Lcom/huawei/health/quickaction/TranPlanService;)V

    invoke-virtual {v0, v1}, Lo/brt;->e(Lo/bui;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 34
    sget-object v0, Lcom/huawei/health/quickaction/TranPlanService;->c:Ljava/lang/String;

    return-object v0
.end method

.method private declared-synchronized c()V
    .locals 5

    monitor-enter p0

    .line 183
    :try_start_0
    sget-object v0, Lcom/huawei/health/quickaction/TranPlanService;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initPluginSuggestion "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/quickaction/TranPlanService;->a:Landroid/content/Context;

    invoke-static {v1}, Lo/cwi;->a(Landroid/content/Context;)Lo/cwi;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brt;->setAdapter(Lo/eab;)V

    .line 185
    sget-object v0, Lcom/huawei/health/quickaction/TranPlanService;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initPluginSuggestion end "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method static synthetic d(Lcom/huawei/health/quickaction/TranPlanService;)Landroid/content/Context;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService;->a:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public d(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 10

    .line 142
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 143
    :cond_0
    sget-object v0, Lcom/huawei/health/quickaction/TranPlanService;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TYPE_PLAN_ENTRY_RUN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v4

    .line 145
    invoke-virtual {v4}, Lo/brt;->getAdapter()Lo/eab;

    move-result-object v0

    instance-of v0, v0, Lo/brr;

    if-nez v0, :cond_1

    .line 146
    sget-object v0, Lcom/huawei/health/quickaction/TranPlanService;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u521d\u59cb\u5316\u9519\u8bef\uff0c\u8bf7\u5148\u8c03\u7528setAdapter\u65b9\u6cd5,\u5e76\u4f20\u5165PluginSuggestionAdapter\u7c7b\u578b\u7684adapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/brt;->c(I)V

    .line 150
    return-void

    .line 153
    :cond_2
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 155
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 157
    const/4 v6, 0x0

    .line 158
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v7

    .line 159
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v8

    .line 160
    const/4 v9, 0x0

    :goto_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_5

    .line 161
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 162
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService;->e:Ljava/lang/Boolean;

    goto :goto_2

    .line 164
    :cond_3
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWorkoutId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    .line 165
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService;->e:Ljava/lang/Boolean;

    goto :goto_1

    .line 167
    :cond_4
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService;->e:Ljava/lang/Boolean;

    .line 169
    :goto_1
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 170
    goto :goto_3

    .line 160
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 173
    :cond_5
    :goto_3
    move-object v9, v6

    .line 174
    iget-object v0, p0, Lcom/huawei/health/quickaction/TranPlanService;->e:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_6

    if-nez v9, :cond_7

    .line 176
    :cond_6
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Lo/brt;->e([I)V

    goto :goto_4

    .line 178
    :cond_7
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/quickaction/TranPlanService;->a:Landroid/content/Context;

    invoke-virtual {v0, v9, v7, v1}, Lo/brt;->e(Lcom/huawei/health/suggestion/model/PlanWorkout;Ljava/lang/String;Landroid/content/Context;)V

    .line 180
    :goto_4
    return-void
.end method

.method public e()V
    .locals 4

    .line 190
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/quickaction/TranPlanService;->a:Landroid/content/Context;

    invoke-static {v1}, Lo/cwc;->c(Landroid/content/Context;)Lo/cwc;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->setAdapter(Lo/eab;)V

    .line 191
    sget-object v0, Lcom/huawei/health/quickaction/TranPlanService;->c:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initPluginTrack() hashCode : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/quickaction/TranPlanService;->a:Landroid/content/Context;

    invoke-static {v2}, Lo/cwc;->c(Landroid/content/Context;)Lo/cwc;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 90
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 49
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 50
    sget-object v0, Lcom/huawei/health/quickaction/TranPlanService;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    iput-object p0, p0, Lcom/huawei/health/quickaction/TranPlanService;->a:Landroid/content/Context;

    .line 53
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 57
    if-nez p1, :cond_0

    .line 58
    sget-object v0, Lcom/huawei/health/quickaction/TranPlanService;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate() intent == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    const/4 v0, 0x0

    return v0

    .line 61
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/quickaction/TranPlanService;->e()V

    .line 62
    invoke-direct {p0}, Lcom/huawei/health/quickaction/TranPlanService;->c()V

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/quickaction/TranPlanService;->a()V

    .line 64
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method
