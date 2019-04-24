.class public Lcom/huawei/hihealthservice/HiHealthService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private c:Lo/cnq;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/HiHealthService;->c:Lo/cnq;

    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 5

    .line 116
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 117
    const-string v0, "demo_hihealth_config"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 118
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "demo_last_open_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->a(J)I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 120
    :cond_0
    return-void
.end method

.method private c(Landroid/content/Context;)Z
    .locals 7

    .line 93
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v4

    .line 94
    const v5, 0x1335045

    .line 95
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 96
    const-string v0, "demo_hihealth_config"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    .line 97
    const-string v0, "demo_last_open_time"

    const v1, 0x1335045

    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 100
    :cond_0
    const-string v0, "yyyyMMdd"

    :try_start_0
    invoke-static {v5, v4, v0}, Lo/cnk;->d(IILjava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-lt v1, v0, :cond_1

    const-string v0, "yyyyMMdd"

    .line 101
    invoke-static {v4, v5, v0}, Lo/cnk;->d(IILjava/lang/String;)I
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/4 v1, 0x1

    if-ge v1, v0, :cond_2

    .line 102
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 106
    :cond_2
    goto :goto_0

    .line 104
    :catch_0
    move-exception v6

    .line 105
    const-string v0, "HiH_HiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "needDelDBFile parse date fail, e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    :goto_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4

    .line 53
    const-string v0, "HiH_HiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBind intent = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    iget-object v0, p0, Lcom/huawei/hihealthservice/HiHealthService;->c:Lo/cnq;

    return-object v0
.end method

.method public onCreate()V
    .locals 6

    .line 33
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 34
    const-string v0, "HiH_HiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/HiHealthService;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    .line 36
    new-instance v0, Lo/cnq;

    invoke-direct {v0, v4}, Lo/cnq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/HiHealthService;->c:Lo/cnq;

    .line 38
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 39
    invoke-direct {p0, v4}, Lcom/huawei/hihealthservice/HiHealthService;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    const-string v0, "HiH_HiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "need delete DB file"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    const-string v0, "hihealth_003.db"

    invoke-virtual {v4, v0}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 42
    const-string v0, "hihealth_003.db"

    invoke-virtual {v4, v0}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    move-result v5

    .line 43
    const-string v0, "HiH_HiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "try delete again return "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    :cond_0
    invoke-direct {p0, v4}, Lcom/huawei/hihealthservice/HiHealthService;->a(Landroid/content/Context;)V

    .line 48
    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 79
    const-string v0, "HiH_HiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iget-object v0, p0, Lcom/huawei/hihealthservice/HiHealthService;->c:Lo/cnq;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 81
    iget-object v0, p0, Lcom/huawei/hihealthservice/HiHealthService;->c:Lo/cnq;

    invoke-virtual {v0}, Lo/cnq;->a()V

    .line 83
    :cond_0
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 85
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 67
    const-string v0, "HiH_HiHealthService"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand() intent = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",flags = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",startId = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 69
    const-string v0, "HiH_HiHealthService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand() intent =  null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    const/4 v0, 0x0

    return v0

    .line 73
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 4

    .line 59
    const-string v0, "HiH_HiHealthService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUnbind intent = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method
