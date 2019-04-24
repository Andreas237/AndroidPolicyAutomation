.class public Lo/alp;
.super Lo/amg;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/alp$d;
    }
.end annotation


# static fields
.field private static b:Lo/alp;


# instance fields
.field private e:Lo/abo;

.field private f:Lo/alp$d;

.field private g:Lo/ana;

.field private h:Lo/alq;

.field private i:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const/4 v0, 0x0

    sput-object v0, Lo/alp;->b:Lo/alp;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lo/alq;Lo/abo;)V
    .locals 4

    .line 44
    invoke-direct {p0, p1}, Lo/amg;-><init>(Landroid/content/Context;)V

    .line 28
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/alp;->i:Ljava/lang/Object;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alp;->g:Lo/ana;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alp;->h:Lo/alq;

    .line 45
    iput-object p2, p0, Lo/alp;->h:Lo/alq;

    .line 46
    iput-object p3, p0, Lo/alp;->e:Lo/abo;

    .line 47
    iget-object v0, p0, Lo/alp;->e:Lo/abo;

    if-nez v0, :cond_0

    .line 48
    const-string v0, "Step_CaloriesManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mExtendStepDataManager null,make mIsSupportExtandStep false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alp;->c:Z

    .line 51
    :cond_0
    const-string v0, "Step_CaloriesManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init DistanceManager context="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    invoke-direct {p0}, Lo/alp;->e()Lo/alp$d;

    move-result-object v0

    iput-object v0, p0, Lo/alp;->f:Lo/alp$d;

    .line 54
    invoke-static {}, Lo/ana;->c()Lo/ana;

    move-result-object v0

    iput-object v0, p0, Lo/alp;->g:Lo/ana;

    .line 55
    const-string v0, "Step_CaloriesManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init mIsSupportExtandStep="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/alp;->c:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    return-void
.end method

.method private b(JD)V
    .locals 4

    .line 141
    iget-object v0, p0, Lo/alp;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 142
    iget-object v0, p0, Lo/alp;->a:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3, p4}, Lo/amy;->e(Landroid/content/Context;JD)V

    .line 143
    const-string v0, "Step_CaloriesManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveCaloriesToFile total db caloriesdiff "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "mIsSupportExtandStep"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/alp;->c:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    :cond_0
    return-void
.end method

.method public static c(Landroid/content/Context;Lo/alq;Lo/abo;)Lo/alp;
    .locals 3

    .line 31
    const-class v1, Lo/alp;

    monitor-enter v1

    .line 32
    :try_start_0
    sget-object v0, Lo/alp;->b:Lo/alp;

    if-nez v0, :cond_0

    .line 33
    new-instance v0, Lo/alp;

    invoke-direct {v0, p0, p1, p2}, Lo/alp;-><init>(Landroid/content/Context;Lo/alq;Lo/abo;)V

    sput-object v0, Lo/alp;->b:Lo/alp;

    .line 35
    :cond_0
    sget-object v0, Lo/alp;->b:Lo/alp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 36
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private c()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lo/alp;->f:Lo/alp$d;

    invoke-virtual {v0}, Lo/alp$d;->e()J

    move-result-wide v0

    iget-object v2, p0, Lo/alp;->d:Lo/amg$c;

    invoke-virtual {v2}, Lo/amg$c;->e()J

    move-result-wide v2

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/alp;->b(JJ)V

    .line 61
    return-void
.end method

.method private e()Lo/alp$d;
    .locals 8

    .line 89
    new-instance v4, Lo/alp$d;

    invoke-direct {v4}, Lo/alp$d;-><init>()V

    .line 90
    const-string v0, "Step_CaloriesManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDiffCaloriesfromFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget-object v0, p0, Lo/alp;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 92
    const-string v0, "Step_CaloriesManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDiffCaloriesfromFile mContext null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    return-object v4

    .line 95
    :cond_0
    iget-object v0, p0, Lo/alp;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->i(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v5

    .line 97
    if-nez v5, :cond_1

    .line 98
    const-string v0, "Step_CaloriesManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDiffCaloriesfromFile diffCalArray null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    return-object v4

    .line 102
    :cond_1
    const/4 v0, 0x0

    :try_start_1
    aget-object v0, v5, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1, v6, v7}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 106
    iput-wide v6, v4, Lo/alp$d;->c:J

    .line 107
    const/4 v0, 0x1

    aget-object v0, v5, v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, v4, Lo/alp$d;->d:D

    .line 108
    const-string v0, "Step_CaloriesManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDiffCaloriesfromFile timeStamp="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " caloriesDiff="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, v4, Lo/alp$d;->d:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 113
    :cond_2
    goto :goto_0

    .line 110
    :catch_0
    move-exception v6

    .line 111
    const-string v0, "Step_CaloriesManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDiffCaloriesfromFile "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    invoke-virtual {v4}, Lo/alp$d;->b()V

    .line 114
    :goto_0
    return-object v4
.end method


# virtual methods
.method public a(JI)I
    .locals 1

    .line 151
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lo/alp;->c(JIZ)I

    move-result v0

    return v0
.end method

.method public a()V
    .locals 4

    .line 65
    iget-object v2, p0, Lo/alp;->i:Ljava/lang/Object;

    monitor-enter v2

    .line 66
    :try_start_0
    invoke-super {p0}, Lo/amg;->a()V

    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/alp;->e(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 70
    :goto_0
    return-void
.end method

.method public c(JIZ)I
    .locals 14

    .line 157
    iget-object v5, p0, Lo/alp;->i:Ljava/lang/Object;

    monitor-enter v5

    .line 158
    :try_start_0
    iget-object v0, p0, Lo/alp;->d:Lo/amg$c;

    move-wide v1, p1

    invoke-virtual {v0, v1, v2}, Lo/amg$c;->e(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    :try_start_1
    invoke-direct {p0}, Lo/alp;->c()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 166
    goto :goto_0

    .line 161
    :catch_0
    move-exception v6

    .line 162
    :try_start_2
    iget-object v0, p0, Lo/alp;->f:Lo/alp$d;

    invoke-virtual {v0}, Lo/alp$d;->b()V

    .line 163
    iget-object v0, p0, Lo/alp;->f:Lo/alp$d;

    move-wide v1, p1

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/alp$d;->d(JD)V

    .line 164
    const-string v0, "Step_CaloriesManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireDistance checkDataConsistency error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " caloriesDiff reset eventTimeStamp="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 165
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 164
    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    :goto_0
    iget-object v0, p0, Lo/alp;->h:Lo/alq;

    move-wide v1, p1

    move/from16 v3, p3

    invoke-virtual {v0, v1, v2, v3}, Lo/alq;->c(JI)I

    move-result v0

    int-to-double v7, v0

    .line 169
    iget-object v0, p0, Lo/alp;->g:Lo/ana;

    invoke-virtual {v0}, Lo/ana;->b()F

    move-result v0

    invoke-static {v7, v8, v0}, Lo/dgp;->b(DF)D

    move-result-wide v9

    .line 170
    iget-boolean v0, p0, Lo/alp;->c:Z

    if-eqz v0, :cond_2

    .line 171
    iget-object v0, p0, Lo/alp;->e:Lo/abo;

    invoke-virtual {v0}, Lo/abo;->c()D

    move-result-wide v0

    iget-object v2, p0, Lo/alp;->f:Lo/alp$d;

    iget-wide v2, v2, Lo/alp$d;->d:D

    add-double v11, v0, v2

    .line 172
    if-eqz p4, :cond_0

    .line 173
    double-to-int v6, v11

    goto :goto_2

    .line 176
    :cond_0
    cmpl-double v0, v9, v11

    if-lez v0, :cond_1

    move-wide v0, v9

    goto :goto_1

    :cond_1
    move-wide v0, v11

    :goto_1
    double-to-int v6, v0

    .line 178
    :goto_2
    goto :goto_3

    .line 179
    :cond_2
    iget-object v0, p0, Lo/alp;->f:Lo/alp$d;

    iget-wide v0, v0, Lo/alp$d;->d:D

    add-double/2addr v0, v9

    double-to-int v6, v0

    .line 181
    :goto_3
    const-string v0, "Step_CaloriesManager"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireDistance stepsSum="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " caloriesDiff="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/alp;->f:Lo/alp$d;

    iget-wide v2, v2, Lo/alp$d;->d:D

    .line 182
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " mIsSupportExtandStep="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/alp;->c:Z

    .line 183
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " caloriesNow="

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 184
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 181
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 185
    monitor-exit v5

    return v6

    .line 186
    :catchall_0
    move-exception v13

    monitor-exit v5

    throw v13
.end method

.method public c(JII)V
    .locals 7

    .line 118
    iget-object v4, p0, Lo/alp;->i:Ljava/lang/Object;

    monitor-enter v4

    .line 119
    const-string v0, "Step_CaloriesManager"

    const/4 v1, 0x6

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncCalories eventTimeStamp="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " steps="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " caloriesFromDB="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    iget-object v0, p0, Lo/alp;->d:Lo/amg$c;

    invoke-virtual {v0, p1, p2}, Lo/amg$c;->e(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    :try_start_1
    invoke-direct {p0}, Lo/alp;->c()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    goto :goto_0

    .line 123
    :catch_0
    move-exception v5

    .line 124
    :try_start_2
    iget-object v0, p0, Lo/alp;->f:Lo/alp$d;

    invoke-virtual {v0}, Lo/alp$d;->b()V

    .line 125
    iget-object v0, p0, Lo/alp;->f:Lo/alp$d;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, p2, v1, v2}, Lo/alp$d;->d(JD)V

    .line 126
    const-string v0, "Step_CaloriesManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncCalories checkDataConsistency error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " caloriesDiff reset eventTimeStamp="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 127
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 126
    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lo/alp;->c(JIZ)I

    move-result v5

    .line 131
    if-le p4, v5, :cond_0

    .line 133
    iget-object v0, p0, Lo/alp;->f:Lo/alp$d;

    sub-int v1, p4, v5

    int-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lo/alp$d;->c(D)V

    .line 135
    iget-object v0, p0, Lo/alp;->f:Lo/alp$d;

    iget-wide v0, v0, Lo/alp$d;->d:D

    invoke-direct {p0, p1, p2, v0, v1}, Lo/alp;->b(JD)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 137
    :cond_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 138
    :goto_1
    return-void
.end method

.method public e(J)V
    .locals 7

    .line 73
    iget-object v4, p0, Lo/alp;->i:Ljava/lang/Object;

    monitor-enter v4

    .line 74
    :try_start_0
    iget-object v0, p0, Lo/alp;->d:Lo/amg$c;

    invoke-virtual {v0, p1, p2}, Lo/amg$c;->e(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    :try_start_1
    invoke-direct {p0}, Lo/alp;->c()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    goto :goto_0

    .line 77
    :catch_0
    move-exception v5

    .line 78
    :try_start_2
    iget-object v0, p0, Lo/alp;->f:Lo/alp$d;

    invoke-virtual {v0}, Lo/alp$d;->b()V

    .line 80
    iget-object v0, p0, Lo/alp;->f:Lo/alp$d;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, p2, v1, v2}, Lo/alp$d;->d(JD)V

    .line 81
    const-string v0, "Step_CaloriesManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearDiff checkDataConsistency error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " caloriesDiff reset zero"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    :goto_0
    iget-object v0, p0, Lo/alp;->f:Lo/alp$d;

    invoke-virtual {v0}, Lo/alp$d;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 86
    :goto_1
    return-void
.end method
