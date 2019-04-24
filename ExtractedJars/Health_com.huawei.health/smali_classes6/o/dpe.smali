.class public Lo/dpe;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/dpe;->e:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lo/dpq;Ljava/lang/Boolean;ZZ)V
    .locals 7

    .line 30
    new-instance v0, Lo/dpu;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lo/dpu;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/Boolean;ZZ)V

    move-object v6, v0

    .line 31
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpu;->a(Z)V

    .line 32
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, v6}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 33
    return-void
.end method

.method public a(Landroid/content/pm/PackageInfo;Landroid/content/Context;Lo/dps;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 125
    const-string v0, "HwSelfUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startCheckScaleNewVersionForBone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    new-instance v0, Lo/dqg;

    move-object v1, p2

    iget-object v2, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lo/dqg;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v0

    .line 127
    invoke-virtual {v6, p1}, Lo/dqg;->c(Landroid/content/pm/PackageInfo;)V

    .line 128
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dqc;->b(Z)V

    .line 129
    sget-object v0, Lo/dpe;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v6}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 131
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 4

    .line 138
    const-string v0, "HwSelfUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelDownloadApp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Lo/dpm;->e(J)V

    .line 141
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dqf;->b(Z)V

    .line 142
    return-void
.end method

.method public d(Landroid/content/Context;Lo/dpp;Ljava/lang/Boolean;ZZ)V
    .locals 13

    .line 44
    const-string v0, "HwSelfUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDownloadApp isApp:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isAW70:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isScale "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    invoke-static {}, Lo/dpm;->e()J

    move-result-wide v6

    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 49
    const-string v0, "HwSelfUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadStartTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; currentTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    const-string v0, "HwSelfUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dqf;->b(Z)V

    .line 62
    invoke-static {v8, v9}, Lo/dpm;->e(J)V

    .line 63
    new-instance v0, Lo/dqb;

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lo/dqb;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/Boolean;ZZ)V

    move-object v10, v0

    .line 64
    sget-object v0, Lo/dpe;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v10}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 66
    new-instance v11, Lo/doz;

    invoke-direct {v11}, Lo/doz;-><init>()V

    .line 67
    const/4 v0, 0x1

    iput v0, v11, Lo/doz;->e:I

    .line 68
    invoke-static {p1}, Lo/dpm;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v11, Lo/doz;->b:Ljava/lang/String;

    .line 69
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/dpm;->m()Lo/doy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 70
    invoke-static {}, Lo/dpm;->m()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->c:Ljava/lang/String;

    iput-object v0, v11, Lo/doz;->a:Ljava/lang/String;

    goto :goto_0

    .line 71
    :cond_0
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    .line 72
    if-eqz p4, :cond_1

    .line 73
    invoke-static {}, Lo/dpm;->p()Lo/doy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 74
    invoke-static {}, Lo/dpm;->p()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->c:Ljava/lang/String;

    iput-object v0, v11, Lo/doz;->a:Ljava/lang/String;

    goto :goto_0

    .line 76
    :cond_1
    if-eqz p5, :cond_2

    .line 77
    invoke-static {}, Lo/dpm;->n()Lo/doy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 78
    invoke-static {}, Lo/dpm;->n()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->c:Ljava/lang/String;

    iput-object v0, v11, Lo/doz;->a:Ljava/lang/String;

    goto :goto_0

    .line 82
    :cond_2
    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 83
    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->c:Ljava/lang/String;

    iput-object v0, v11, Lo/doz;->a:Ljava/lang/String;

    .line 90
    :cond_3
    :goto_0
    if-eqz p4, :cond_4

    .line 91
    invoke-static {}, Lo/dpm;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/dpm;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v11, Lo/doz;->c:Ljava/lang/String;

    goto :goto_1

    .line 93
    :cond_4
    if-eqz p5, :cond_5

    .line 94
    invoke-static {}, Lo/dpm;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/dpm;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v11, Lo/doz;->c:Ljava/lang/String;

    goto :goto_1

    .line 97
    :cond_5
    invoke-static {}, Lo/dpm;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/dpm;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v11, Lo/doz;->c:Ljava/lang/String;

    .line 101
    :goto_1
    const-string v0, ""

    iput-object v0, v11, Lo/doz;->d:Ljava/lang/String;

    .line 102
    new-instance v12, Lo/dpw;

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-direct {v12, p1, v11, v0}, Lo/dpw;-><init>(Landroid/content/Context;Lo/doz;Z)V

    .line 103
    sget-object v0, Lo/dpe;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v12}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 110
    return-void
.end method

.method public d(Landroid/content/pm/PackageInfo;Ljava/lang/String;Landroid/content/Context;Lo/dps;Ljava/lang/Boolean;)V
    .locals 5

    .line 114
    const-string v0, "HwSelfUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startCheckNewVersionForBone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    new-instance v4, Lo/dqc;

    iget-object v0, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-direct {v4, p3, v0, p4, p5}, Lo/dqc;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/Boolean;)V

    .line 116
    invoke-virtual {v4, p1}, Lo/dqc;->e(Landroid/content/pm/PackageInfo;)V

    .line 117
    invoke-virtual {v4, p2}, Lo/dqc;->d(Ljava/lang/String;)V

    .line 118
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dqc;->b(Z)V

    .line 119
    sget-object v0, Lo/dpe;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v4}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 121
    return-void
.end method

.method public e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 36
    invoke-static {p1, p2, p3}, Lo/dpm;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    return-void
.end method
