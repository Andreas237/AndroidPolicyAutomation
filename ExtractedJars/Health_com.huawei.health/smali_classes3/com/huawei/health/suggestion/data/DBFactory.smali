.class public Lcom/huawei/health/suggestion/data/DBFactory;
.super Lo/cwz;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/data/DBFactory$LocaleChangeBroadcastReceiver;,
        Lcom/huawei/health/suggestion/data/DBFactory$n;,
        Lcom/huawei/health/suggestion/data/DBFactory$r;,
        Lcom/huawei/health/suggestion/data/DBFactory$a;,
        Lcom/huawei/health/suggestion/data/DBFactory$b;,
        Lcom/huawei/health/suggestion/data/DBFactory$g;,
        Lcom/huawei/health/suggestion/data/DBFactory$i;,
        Lcom/huawei/health/suggestion/data/DBFactory$k;,
        Lcom/huawei/health/suggestion/data/DBFactory$f;,
        Lcom/huawei/health/suggestion/data/DBFactory$c;,
        Lcom/huawei/health/suggestion/data/DBFactory$h;,
        Lcom/huawei/health/suggestion/data/DBFactory$l;,
        Lcom/huawei/health/suggestion/data/DBFactory$o;,
        Lcom/huawei/health/suggestion/data/DBFactory$e;,
        Lcom/huawei/health/suggestion/data/DBFactory$m;,
        Lcom/huawei/health/suggestion/data/DBFactory$p;,
        Lcom/huawei/health/suggestion/data/DBFactory$d;
    }
.end annotation


# static fields
.field private static volatile e:Lcom/huawei/health/suggestion/data/DBFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory;->e:Lcom/huawei/health/suggestion/data/DBFactory;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/suggestion/data/DBFactory;->w()V

    .line 45
    return-void
.end method

.method public static b()Lcom/huawei/health/suggestion/data/DBFactory;
    .locals 5

    .line 58
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory;->e:Lcom/huawei/health/suggestion/data/DBFactory;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 59
    const-class v2, Lcom/huawei/health/suggestion/data/DBFactory;

    monitor-enter v2

    .line 60
    :try_start_0
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory;->e:Lcom/huawei/health/suggestion/data/DBFactory;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 61
    new-instance v3, Lcom/huawei/health/suggestion/data/DBFactory;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/huawei/health/suggestion/data/DBFactory;-><init>(Landroid/content/Context;)V

    .line 62
    invoke-static {v3}, Lcom/huawei/health/suggestion/data/DBFactory;->b(Lcom/huawei/health/suggestion/data/DBFactory;)V

    .line 63
    sput-object v3, Lcom/huawei/health/suggestion/data/DBFactory;->e:Lcom/huawei/health/suggestion/data/DBFactory;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 67
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory;->e:Lcom/huawei/health/suggestion/data/DBFactory;

    return-object v0
.end method

.method private static b(Lcom/huawei/health/suggestion/data/DBFactory;)V
    .locals 6

    .line 48
    const-string v0, "DATABASE_VERSION_KEY"

    invoke-static {v0}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 49
    invoke-static {v4}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v5

    .line 50
    const-string v0, "DBFactory"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "oldVersion = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "  DATABASE_VERSION = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/16 v2, 0xd

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    const/16 v0, 0xd

    if-ge v5, v0, :cond_0

    .line 52
    const/16 v0, 0xd

    invoke-direct {p0, v5, v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d(II)V

    .line 53
    const-string v0, "DATABASE_VERSION_KEY"

    const-string v1, "13"

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/data/DBFactory;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/huawei/health/suggestion/data/DBFactory;->w()V

    return-void
.end method

.method private d(II)V
    .locals 8

    .line 71
    const-string v0, "DBFactory"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "oldVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    add-int/lit8 p1, p1, 0x1

    .line 73
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 74
    :cond_0
    const-string v0, "DBFactory"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->a()V

    .line 76
    .line 77
    invoke-static {}, Lo/btu;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1=1"

    .line 76
    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    .line 78
    const-string v0, "workout_info"

    const-string v1, "1=1"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    .line 80
    const/4 p1, 0x2

    .line 83
    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 84
    const-string v0, "DBFactory"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->a()V

    .line 86
    const/4 p1, 0x3

    .line 89
    :cond_2
    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    .line 90
    const-string v0, "DBFactory"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->a()V

    .line 92
    const/4 p1, 0x4

    .line 95
    :cond_3
    const/4 v0, 0x4

    if-ne p1, v0, :cond_4

    .line 96
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v4

    .line 97
    const v0, 0x18a92

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "fit_workouts_info"

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "stage"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER DEFAULT 2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 99
    invoke-static {v4, v5, v6}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const-string v0, "DBFactory"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "sql:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/4 p1, 0x5

    .line 104
    :cond_4
    const/4 v0, 0x5

    if-ne p1, v0, :cond_5

    .line 105
    const-string v0, "DBFactory"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    const/4 p1, 0x6

    .line 111
    :cond_5
    const/4 v0, 0x6

    if-ne p1, v0, :cond_6

    .line 112
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v4

    .line 113
    const v0, 0x18a92

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "fit_workouts_info"

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "stage"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER DEFAULT 2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 115
    invoke-static {v4, v5, v6}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    const-string v0, "DBFactory"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "sql:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    const/4 p1, 0x7

    .line 120
    :cond_6
    const/4 v0, 0x7

    if-ne p1, v0, :cond_7

    .line 121
    const-string v0, "DBFactory"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/16 p1, 0x8

    .line 132
    :cond_7
    const/16 v0, 0x8

    if-ne p1, v0, :cond_8

    .line 133
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v4

    .line 134
    const v0, 0x18a92

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workout_record"

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "wearType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER DEFAULT 0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 136
    invoke-static {v4, v5, v6}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workout_record"

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "extend"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " TEXT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 138
    invoke-static {v4, v5, v6}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "operation"

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "emui90ImageUrl"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " Text DEFAULT \'\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 143
    invoke-static {v4, v5, v6}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const-string v0, "DBFactory"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "sql:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const/16 p1, 0x9

    .line 148
    :cond_8
    const/16 v0, 0x9

    if-ne p1, v0, :cond_9

    .line 149
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v4

    .line 150
    const v0, 0x18a92

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workout_record"

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "recordIndex"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER DEFAULT 0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 152
    invoke-static {v4, v5, v6}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    const-string v0, "DBFactory"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "sql:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    const/16 p1, 0xa

    .line 159
    :cond_9
    const/16 v0, 0xa

    if-ne p1, v0, :cond_a

    .line 160
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v4

    .line 161
    const v0, 0x18a92

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 162
    const-string v6, "fit_workouts_info"

    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER DEFAULT 1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 164
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "measurementType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER DEFAULT 1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 166
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "warmUpRunAction"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " TEXT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 169
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "coolDownRunAction"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " TEXT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 171
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "sequenceName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " TEXT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 173
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "sequenceStage"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " TEXT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 175
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "repeatTimes"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER DEFAULT 1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 177
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "runActionNum"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER DEFAULT 1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 179
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    const-string v0, "DBFactory"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "sql:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    const/16 p1, 0xb

    .line 184
    :cond_a
    const/16 v0, 0xb

    if-ne p1, v0, :cond_b

    .line 193
    const-string v0, "DBFactory"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "sql:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    const/16 p1, 0xc

    .line 198
    :cond_b
    const/16 v0, 0xc

    if-ne p1, v0, :cond_c

    .line 209
    const-string v0, "DBFactory"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "sql:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    const/16 p1, 0xd

    .line 215
    :cond_c
    const/16 v0, 0xd

    if-ne p1, v0, :cond_d

    .line 216
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v4

    .line 217
    const v0, 0x18a92

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 218
    const-string v6, "fit_workouts_info"

    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "stage"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER DEFAULT 2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 223
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER DEFAULT 1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 231
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "measurementType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER DEFAULT 1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 233
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "warmUpRunAction"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " TEXT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 236
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "coolDownRunAction"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " TEXT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 238
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "sequenceName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " TEXT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 240
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "sequenceStage"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " TEXT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 242
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "repeatTimes"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER DEFAULT 1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 244
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "runActionNum"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " INTEGER DEFAULT 1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 246
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    const-string v0, "DBFactory"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "sql:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "extendSeaMap"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " TEXT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 252
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ALTER TABLE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ADD "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "relativeCourses"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " TEXT"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 254
    invoke-static {v4, v5, v7}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    const-string v0, "DBFactory"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade(int oldVersion, int newVersion):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "initVersion:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "sql:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    const/16 p1, 0xe

    .line 259
    :cond_d
    return-void
.end method

.method static synthetic u()Lcom/huawei/health/suggestion/data/DBFactory;
    .locals 1

    .line 23
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory;->e:Lcom/huawei/health/suggestion/data/DBFactory;

    return-object v0
.end method

.method private w()V
    .locals 3

    .line 292
    const-string v0, "plan_records"

    const-string v1, "planId TEXT,userId TEXT,planType INTEGER,difficulty INTEGER,workoutDays INTEGER,status INTEGER DEFAULT 0,planName TEXT,calorie REAL,distance REAL,actualCalorie REAL,actualDistance REAL,finishRate REAL,goal INTEGER, INTEGER,weekCount INTEGER,workoutCount INTEGER,workoutTimes INTEGER,startDate TEXT,endDate TEXT,version TEXT,finishDate TEXT,excludedDates TEXT,weekTimes INTEGER,workoutRecords INTEGER,PRIMARY KEY(userId,planId)"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 298
    const-string v0, "workout_record"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,recordIndex INTEGER, userId TEXT,planId TEXT,workoutId TEXT,workoutName TEXT,workoutOrder INTEGER,workoutDate TEXT,exerciseDate INTEGER,exerciseTime INTEGER,weekNum INTEGER,during INTEGER,actualCalorie REAL,actualDistance REAL,calorie REAL,distance REAL,finishRate REAL,upperHeartRate INTEGER,lowerHeartRate INTEGER,bestPace INTEGER,oxygen REAL,trainingLoadPeak INTEGER,trajectoryId TEXT,actionSummary TEXT,recordType INTEGER,version TEXT,wearType INTEGER,extend TEXT"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 304
    const-string v0, "plans"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,planId TEXT,lan TEXT,version TEXT,content TEXT"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 322
    const-string v0, "best_record"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,planId TEXT,userId TEXT,type INTEGER,value TEXT,status INTEGER"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 328
    const-string v0, "data_sync"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,planId TEXT,userId TEXT,type INTEGER,value TEXT,syncTimes INTEGER"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 334
    .line 335
    invoke-static {}, Lo/btg;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,userId TEXT,workoutId TEXT,name TEXT,exerciseTimes INTEGER,isSupportDevice INTEGER,trainingPoints TEXT,difficulty INTEGER,equipments TEXT,classes TEXT,duration INTEGER,calorie REAL,distance REAL,picture TEXT,midPicture TEXT,description TEXT,stage INTEGER,users INTEGER,version TEXT,narrowPicture TEXT,narrowDesc TEXT,workoutActions TEXT,publishDate INTEGER,modified INTEGER,type INTEGER,measurementType INTEGER,runActionNum INTEGER,warmUpRunAction TEXT,coolDownRunAction TEXT,sequenceName TEXT,sequenceStage TEXT,repeatTimes INTEGER,relativeCourses TEXT,extendSeaMap TEXT"

    .line 334
    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 339
    .line 340
    invoke-static {}, Lo/btp;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,userId TEXT,topicId INTEGER,name TEXT,displayorder INTEGER,workoutPreviewNum INTEGER,serialNum TEXT,version TEXT,pageNum INTEGER"

    .line 339
    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 344
    const-string v0, "topic_workouts"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,topicId INTEGER,userId TEXT,workoutId TEXT,type INTEGER,version TEXT,pageNum INTEGER"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 349
    const-string v0, "operation"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,id INTEGER,pageType INTEGER,position INTEGER,type INTEGER,defSelection INTEGER,beginDate INTEGER,endDate INTEGER,endSolution INTEGER,createTime INTEGER,modifyTime INTEGER,status INTEGER,userId TEXT,pictureUrl TEXT,url TEXT,emui90ImageUrlTEXT"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 355
    const-string v0, "fit_workout_all_list"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,userId TEXT,workoutId TEXT,version TEXT"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 360
    const-string v0, "fit_workout_trained_list"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,userId TEXT,workoutId TEXT,version TEXT"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 365
    const-string v0, "fit_workout_collect_list"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,userId TEXT,workoutId TEXT,version TEXT"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 370
    const-string v0, "fit_workout_download_list"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,userId TEXT,workoutId TEXT,version TEXT"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 375
    const-string v0, "fit_workout_use_list"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,userId TEXT,workoutId TEXT,version TEXT"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 381
    const-string v0, "fitness_total_record"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,userId TEXT,recordDate INTEGER,recordTime INTEGER,recordCalorie REAL,recordDuration INTEGER,recordStatus INTEGER,recordTotalCalorie REAL,recordTotalDuration INTEGER,dayLastRecord INTEGER"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 387
    const-string v0, "best_record_fit"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,actionId TEXT,userId TEXT,type INTEGER,value TEXT,completeTime INTEGER,status INTEGER"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 393
    const-string v0, "train_count"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,userId TEXT,id TEXT,count INTEGER"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 399
    const-string v0, "action_info"

    const-string v1, "recordId INTEGER PRIMARY KEY AUTOINCREMENT,actionId TEXT,userId TEXT,name TEXT,motionType TEXT,difficulty INTEGER,covers TEXT,description TEXT,equipments TEXT,trainingpoints TEXT,videos TEXT,version TEXT,modified INTEGER"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 407
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 279
    new-instance v1, Lo/dcy;

    invoke-direct {v1}, Lo/dcy;-><init>()V

    .line 280
    iput p3, v1, Lo/dcy;->c:I

    .line 281
    invoke-super {p0, p1, p2, v1}, Lo/cwz;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v0

    return v0
.end method

.method public a()Lo/bsj;
    .locals 1

    .line 424
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$d;->d()Lo/bsj;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 2

    .line 413
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/data/DBFactory;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dck;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 414
    return-void
.end method

.method public d()Lo/btq;
    .locals 1

    .line 428
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$p;->c()Lo/btq;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 2

    .line 420
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/data/DBFactory;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dck;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 421
    return-void
.end method

.method public f()Lo/btg;
    .locals 1

    .line 460
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$h;->a()Lo/btg;

    move-result-object v0

    return-object v0
.end method

.method public g()Lo/btn;
    .locals 1

    .line 432
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$m;->b()Lo/btn;

    move-result-object v0

    return-object v0
.end method

.method public getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 267
    const v0, 0x18a92

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h()Lo/btp;
    .locals 1

    .line 452
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$o;->a()Lo/btp;

    move-result-object v0

    return-object v0
.end method

.method public i()Lo/bsz;
    .locals 1

    .line 448
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$e;->c()Lo/bsz;

    move-result-object v0

    return-object v0
.end method

.method public k()Lo/bti;
    .locals 1

    .line 456
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$l;->d()Lo/bti;

    move-result-object v0

    return-object v0
.end method

.method public l()Lo/btk;
    .locals 1

    .line 468
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$f;->d()Lo/btk;

    move-result-object v0

    return-object v0
.end method

.method public m()Lo/btf;
    .locals 1

    .line 471
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$k;->a()Lo/btf;

    move-result-object v0

    return-object v0
.end method

.method public n()Lo/btl;
    .locals 1

    .line 477
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$g;->e()Lo/btl;

    move-result-object v0

    return-object v0
.end method

.method public o()Lo/bth;
    .locals 1

    .line 464
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$c;->e()Lo/bth;

    move-result-object v0

    return-object v0
.end method

.method public p()Lo/btd;
    .locals 1

    .line 474
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$i;->b()Lo/btd;

    move-result-object v0

    return-object v0
.end method

.method public q()Lo/btt;
    .locals 1

    .line 489
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$r;->b()Lo/btt;

    move-result-object v0

    return-object v0
.end method

.method public r()Lo/btc;
    .locals 1

    .line 481
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$b;->a()Lo/btc;

    move-result-object v0

    return-object v0
.end method

.method public s()Lo/bto;
    .locals 1

    .line 493
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$n;->c()Lo/bto;

    move-result-object v0

    return-object v0
.end method

.method public t()Lo/bss;
    .locals 1

    .line 485
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory$a;->d()Lo/bss;

    move-result-object v0

    return-object v0
.end method
