.class public Lo/ali;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/ali;

.field private static final e:Ljava/lang/Object;


# instance fields
.field private a:Z

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/ali;->e:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ali;->d:Z

    .line 47
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ali;->a:Z

    .line 52
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    iput-boolean v0, p0, Lo/ali;->d:Z

    .line 53
    iget-boolean v0, p0, Lo/ali;->d:Z

    if-eqz v0, :cond_0

    .line 54
    invoke-static {p1}, Lo/ali;->a(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/ali;->a:Z

    .line 55
    invoke-static {p1}, Lo/ali;->d(Landroid/content/Context;)V

    .line 57
    :cond_0
    return-void
.end method

.method private static a(Landroid/content/Context;)Z
    .locals 7

    .line 136
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v4

    .line 137
    const v5, 0x1335045

    .line 138
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 139
    const-string v0, "demo_share_config"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    .line 140
    const-string v0, "demo_last_open_time"

    const v1, 0x1335045

    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 143
    :cond_0
    const-string v0, "yyyyMMdd"

    :try_start_0
    invoke-static {v5, v4, v0}, Lo/cnk;->d(IILjava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-lt v1, v0, :cond_1

    const-string v0, "yyyyMMdd"

    .line 144
    invoke-static {v4, v5, v0}, Lo/cnk;->d(IILjava/lang/String;)I
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/4 v1, 0x1

    if-ge v1, v0, :cond_2

    .line 145
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 149
    :cond_2
    goto :goto_0

    .line 147
    :catch_0
    move-exception v6

    .line 148
    const-string v0, "Login_MainInteractorsForStoreDemo"

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

    .line 150
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 7

    .line 115
    new-instance v2, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 116
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 117
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    const v0, 0xc351

    invoke-direct {v4, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 118
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 119
    invoke-virtual {v4, v5, v6, v5, v6}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 120
    invoke-static {p1}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 121
    const/16 v0, 0x3c

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 122
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 124
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/ali$4;

    invoke-direct {v1, p0, p1}, Lo/ali$4;-><init>(Lo/ali;Landroid/content/Context;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 133
    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/ali;
    .locals 4

    .line 60
    sget-object v2, Lo/ali;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 61
    :try_start_0
    sget-object v0, Lo/ali;->b:Lo/ali;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 62
    new-instance v0, Lo/ali;

    invoke-direct {v0, p0}, Lo/ali;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/ali;->b:Lo/ali;

    .line 64
    :cond_0
    sget-object v0, Lo/ali;->b:Lo/ali;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 65
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private static d(Landroid/content/Context;)V
    .locals 5

    .line 153
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 154
    const-string v0, "Login_MainInteractorsForStoreDemo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update newday config"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    const-string v0, "demo_share_config"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 156
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

    .line 158
    :cond_0
    return-void
.end method


# virtual methods
.method public e(Landroid/content/Context;)V
    .locals 7

    .line 69
    const-string v0, "Login_MainInteractorsForStoreDemo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertDataToHiHealth::enter mIsReLaunchBeyondDays:%b mIsStoreDemoVersion:%b"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-boolean v4, p0, Lo/ali;->a:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget-boolean v4, p0, Lo/ali;->d:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    iget-boolean v0, p0, Lo/ali;->a:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/ali;->d:Z

    if-eqz v0, :cond_0

    .line 71
    const-string v0, "Login_MainInteractorsForStoreDemo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertDataToHiHealth::start insert"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    invoke-static {p1}, Lo/fjh;->c(Landroid/content/Context;)V

    .line 75
    const/4 v0, 0x7

    invoke-static {v0}, Lo/ceb;->b(I)V

    .line 77
    invoke-static {}, Lo/fiv;->a()Lo/fiv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fiv;->i()V

    .line 78
    invoke-static {}, Lo/fiv;->a()Lo/fiv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fiv;->d()V

    .line 79
    invoke-static {}, Lo/fiv;->a()Lo/fiv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fiv;->c()V

    .line 80
    invoke-static {}, Lo/fir;->a()V

    .line 81
    invoke-static {}, Lo/fir;->e()V

    .line 82
    invoke-static {}, Lo/fdm;->e()V

    .line 84
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->u()V

    .line 85
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->t()V

    .line 87
    invoke-direct {p0, p1}, Lo/ali;->b(Landroid/content/Context;)V

    .line 90
    invoke-static {p1}, Lo/fjh;->e(Landroid/content/Context;)V

    .line 92
    const/16 v0, 0x16

    invoke-static {v0}, Lo/ceb;->b(I)V

    .line 94
    invoke-static {}, Lo/fiv;->a()Lo/fiv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fiv;->h()V

    .line 95
    invoke-static {}, Lo/fiv;->a()Lo/fiv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fiv;->e()V

    .line 96
    invoke-static {}, Lo/fiv;->a()Lo/fiv;

    move-result-object v0

    invoke-virtual {v0}, Lo/fiv;->b()V

    .line 97
    invoke-static {}, Lo/fir;->b()V

    .line 98
    invoke-static {}, Lo/fir;->d()V

    .line 99
    invoke-static {}, Lo/fdm;->d()V

    .line 101
    new-instance v6, Lo/fjf;

    invoke-direct {v6, p1}, Lo/fjf;-><init>(Landroid/content/Context;)V

    .line 102
    invoke-virtual {v6}, Lo/fjf;->b()V

    .line 105
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dxe;->b(Landroid/content/Context;)V

    .line 108
    invoke-direct {p0, p1}, Lo/ali;->b(Landroid/content/Context;)V

    .line 110
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ali;->a:Z

    .line 112
    :cond_0
    return-void
.end method
