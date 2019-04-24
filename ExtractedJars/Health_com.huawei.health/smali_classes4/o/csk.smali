.class public Lo/csk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/csk$c;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/Object;

.field private static b:Z

.field private static d:Z

.field private static e:Z

.field private static f:Z

.field private static g:I

.field private static h:Z

.field private static i:Z

.field private static k:Landroid/content/Context;


# instance fields
.field c:Landroid/content/SharedPreferences;

.field private l:Ljava/util/Timer;

.field private m:Ljava/util/Timer;

.field private final n:Ljava/lang/Object;

.field private final p:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 98
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->d:Z

    .line 100
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->b:Z

    .line 102
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/csk;->a:Ljava/lang/Object;

    .line 110
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->e:Z

    .line 111
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->h:Z

    .line 112
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->i:Z

    .line 113
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->f:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 511
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/csk;->p:Ljava/lang/Object;

    .line 1030
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/csk;->n:Ljava/lang/Object;

    .line 134
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const-string v1, "synSp"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    .line 135
    invoke-static {}, Lo/csk;->t()V

    .line 136
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/csk;->m:Ljava/util/Timer;

    .line 137
    invoke-direct {p0}, Lo/csk;->G()V

    .line 138
    return-void
.end method

.method synthetic constructor <init>(Lo/csk$4;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lo/csk;-><init>()V

    return-void
.end method

.method private A()V
    .locals 5

    .line 720
    invoke-direct {p0}, Lo/csk;->y()I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 721
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "total sport stat sync times is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 722
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "totalSportStatSyncTimes"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 723
    return-void
.end method

.method private B()J
    .locals 4

    .line 362
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    const-string v1, "syncservicestarttimes"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private static C()V
    .locals 5

    .line 499
    invoke-static {}, Lo/csk;->m()I

    move-result v4

    .line 500
    const-string v0, "HiH_"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initPrivacy cloudversion is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 501
    invoke-static {v4}, Lo/csk;->m(I)V

    .line 502
    invoke-static {v4}, Lo/csk;->c(I)V

    .line 503
    invoke-static {v4}, Lo/csk;->d(I)V

    .line 504
    invoke-static {v4}, Lo/csk;->n(I)V

    .line 505
    return-void
.end method

.method private D()Z
    .locals 1

    .line 379
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method private E()Z
    .locals 7

    .line 792
    invoke-direct {p0}, Lo/csk;->q()I

    move-result v4

    .line 793
    invoke-direct {p0}, Lo/csk;->v()I

    move-result v5

    .line 794
    invoke-direct {p0}, Lo/csk;->y()I

    move-result v6

    .line 795
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "appSynTimes is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", statsyncTimes is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", totalSportStatSyncTimes is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 796
    const/16 v0, 0x190

    if-le v4, v0, :cond_0

    .line 797
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "basicSyncCondition! the app has sync more times,appSynTimes is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 798
    const/4 v0, 0x0

    return v0

    .line 800
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private F()Z
    .locals 5

    .line 895
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "auto_synchronous_flag"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 896
    if-nez v4, :cond_2

    .line 897
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "needAutoSync autoSyncSwitch is null ,let it autoSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 898
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_flag"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 900
    if-eqz v4, :cond_0

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "1"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 902
    :cond_0
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "auto_synchronous_flag"

    const-string v2, "1"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 903
    const/4 v0, 0x1

    return v0

    .line 905
    :cond_1
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "auto_synchronous_flag"

    const-string v2, "0"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 906
    const/4 v0, 0x0

    return v0

    .line 909
    :cond_2
    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "1"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 910
    :cond_3
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "needAutoSync autoSyncSwitch is open"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 911
    const/4 v0, 0x1

    return v0

    .line 913
    :cond_4
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "needAutoSync autoSyncSwitch is closed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 914
    const/4 v0, 0x0

    return v0
.end method

.method private G()V
    .locals 6

    .line 1020
    iget-object v0, p0, Lo/csk;->m:Ljava/util/Timer;

    new-instance v1, Lo/csk$4;

    invoke-direct {v1, p0}, Lo/csk$4;-><init>(Lo/csk;)V

    const-wide/32 v2, 0x36ee80

    const-wide/32 v4, 0x36ee80

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 1028
    return-void
.end method

.method private H()Z
    .locals 2

    .line 853
    invoke-direct {p0}, Lo/csk;->q()I

    move-result v0

    const/16 v1, 0x190

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private I()V
    .locals 9

    .line 1059
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    sget-object v1, Lo/csk;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v4

    .line 1060
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/cqf;->d(Landroid/content/Context;I)I

    move-result v5

    .line 1061
    invoke-static {}, Lo/cui;->a()I

    move-result v6

    .line 1062
    const/4 v0, 0x0

    if-le v0, v6, :cond_0

    .line 1063
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/cui;->b(Landroid/content/Context;I)I

    move-result v6

    .line 1065
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 1066
    return-void

    .line 1068
    :cond_1
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/cui;->c(Landroid/content/Context;I)J

    move-result-wide v7

    .line 1069
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v7

    const-wide/32 v2, 0x2932e00

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 1070
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const v1, 0x493e0

    invoke-static {v0, v5, v1}, Lo/csk;->e(Landroid/content/Context;II)V

    .line 1073
    :cond_2
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/csk;
    .locals 1

    .line 129
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/csk;->k:Landroid/content/Context;

    .line 130
    sget-object v0, Lo/csk$c;->e:Lo/csk;

    return-object v0
.end method

.method public static a()V
    .locals 7

    .line 162
    sget-object v4, Lo/csk;->a:Ljava/lang/Object;

    monitor-enter v4

    .line 163
    :try_start_0
    sget-boolean v0, Lo/csk;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 165
    :try_start_1
    sget-object v0, Lo/csk;->a:Ljava/lang/Object;

    const-wide/32 v1, 0x2bf20

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 168
    goto :goto_0

    .line 166
    :catch_0
    move-exception v5

    .line 167
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InterruptedException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    :cond_0
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 171
    :goto_1
    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiSyncOption;I)V
    .locals 11

    .line 634
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/cqf;->d(Landroid/content/Context;I)I

    move-result v4

    .line 635
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSync hiSyncOption = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",app = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " who = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 636
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v5

    .line 637
    invoke-static {p1, p2, v4}, Lo/csk;->c(Lcom/huawei/hihealth/HiSyncOption;II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 638
    if-nez v5, :cond_0

    .line 639
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->i(Landroid/content/Context;)V

    .line 641
    :cond_0
    return-void

    .line 644
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/csk;->u(I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 645
    sget-boolean v0, Lo/csk;->d:Z

    if-eqz v0, :cond_3

    .line 646
    invoke-direct {p0}, Lo/csk;->B()J

    move-result-wide v6

    .line 647
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 648
    sub-long v0, v8, v6

    const-wide/32 v2, 0x36ee80

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 650
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lastSyncStartTime="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",currTime="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " destroy last sync service"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    new-instance v10, Landroid/content/Intent;

    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const-class v1, Lcom/huawei/hihealthservice/sync/HiSyncService;

    invoke-direct {v10, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 652
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-virtual {v0, v10}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 653
    const/4 v0, 0x0

    invoke-static {v0}, Lo/csk;->c(Z)V

    .line 654
    const/4 v0, 0x0

    invoke-static {v0}, Lo/cui;->e(Z)V

    .line 655
    goto :goto_0

    .line 656
    :cond_2
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSync it is syncing right now !  hiSyncOption is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 657
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v0

    invoke-static {v0}, Lo/cuh;->d(I)V

    .line 658
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->c(Landroid/content/Context;)V

    .line 659
    return-void

    .line 664
    :cond_3
    :goto_0
    invoke-direct {p0, v5, v4}, Lo/csk;->h(II)V

    .line 666
    if-eqz v5, :cond_4

    .line 667
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v0

    invoke-direct {p0, v0, v4}, Lo/csk;->c(II)Z

    move-result v0

    if-nez v0, :cond_4

    .line 668
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ifCanAutoSync false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    return-void

    .line 681
    :cond_4
    invoke-static {}, Lo/csk;->C()V

    .line 683
    invoke-direct {p0, p2}, Lo/csk;->o(I)Z

    move-result v0

    if-nez v0, :cond_5

    .line 684
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->i(Landroid/content/Context;)V

    .line 685
    return-void

    .line 690
    :cond_5
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->k(Landroid/content/Context;)V

    .line 695
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v0

    const/16 v1, 0x4e20

    if-ne v1, v0, :cond_6

    .line 697
    invoke-direct {p0}, Lo/csk;->j()V

    .line 700
    :cond_6
    new-instance v6, Landroid/content/Intent;

    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const-class v1, Lcom/huawei/hihealthservice/sync/HiSyncService;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 701
    const-string v0, "sync_option"

    invoke-virtual {v6, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 702
    const-string v0, "sync_appId"

    invoke-virtual {v6, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 703
    const-string v0, "sync_main_UserID"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 705
    :try_start_0
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 710
    goto :goto_1

    .line 706
    :catch_0
    move-exception v7

    .line 707
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doSync "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 710
    goto :goto_1

    .line 708
    :catch_1
    move-exception v7

    .line 709
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doSync "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 712
    :goto_1
    const/4 v0, 0x4

    if-ne v0, v5, :cond_7

    .line 713
    invoke-direct {p0}, Lo/csk;->A()V

    .line 714
    return-void

    .line 716
    :cond_7
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v0

    invoke-direct {p0, v0, v4}, Lo/csk;->f(II)V

    .line 717
    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 591
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadOneDetailData syncDataType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadOneDetailData   downedType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 593
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 595
    :pswitch_0
    invoke-direct {p0, p1, p2, p3}, Lo/csk;->e(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctr;

    move-result-object v4

    .line 596
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDay()J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    add-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Lo/ctr;->a(J)V

    .line 597
    goto :goto_0

    .line 599
    :pswitch_1
    invoke-direct {p0, p1, p2, p3}, Lo/csk;->b(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;

    move-result-object v5

    .line 600
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDay()J

    move-result-wide v0

    const-wide/32 v2, 0xa4cb800

    add-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Lo/cto;->e(J)V

    .line 601
    goto :goto_0

    .line 603
    :pswitch_2
    invoke-direct {p0, p1, p2, p3}, Lo/csk;->b(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;

    move-result-object v6

    .line 604
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDay()J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    add-long/2addr v0, v2

    const/4 v2, 0x7

    invoke-virtual {v6, v2, v0, v1}, Lo/cto;->e(IJ)V

    .line 605
    goto :goto_0

    .line 607
    :pswitch_3
    invoke-direct {p0, p1, p2, p3}, Lo/csk;->b(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;

    move-result-object v7

    .line 608
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDay()J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    add-long/2addr v0, v2

    const/16 v2, 0xb

    invoke-virtual {v7, v2, v0, v1}, Lo/cto;->e(IJ)V

    .line 609
    goto :goto_0

    .line 611
    :pswitch_4
    invoke-direct {p0, p1, p2, p3}, Lo/csk;->b(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;

    move-result-object v8

    .line 612
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDay()J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    add-long/2addr v0, v2

    const/16 v2, 0xc

    invoke-virtual {v8, v2, v0, v1}, Lo/cto;->e(IJ)V

    .line 613
    .line 617
    :goto_0
    :pswitch_5
    return-void

    :pswitch_data_0
    .packed-switch 0x271b
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method private b(Landroid/content/Context;I)I
    .locals 10

    .line 1177
    invoke-direct {p0, p2}, Lo/csk;->q(I)I

    move-result v4

    .line 1178
    invoke-direct {p0, p2}, Lo/csk;->t(I)I

    move-result v5

    .line 1179
    const/4 v6, 0x0

    .line 1180
    invoke-static {}, Lo/csk;->m()I

    move-result v0

    invoke-static {v0}, Lo/csk;->c(I)V

    .line 1181
    invoke-static {}, Lo/csk;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1183
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkSportDataNum sport privacy is close return 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1184
    return v6

    .line 1186
    :cond_0
    invoke-static {p1, p2}, Lo/cui;->a(Landroid/content/Context;I)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v7

    .line 1187
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 1188
    const-string v0, "step"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 1189
    const-string v0, "calorie"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 1190
    if-ge v8, v4, :cond_1

    if-lt v9, v5, :cond_2

    .line 1191
    :cond_1
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkInsertStatus stepSum or calorieSum is enough"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1192
    add-int/lit8 v6, v6, 0x1

    .line 1197
    :cond_2
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->a(J)I

    move-result v1

    const v2, 0x9c42

    invoke-static {v0, p2, v1, v2}, Lo/cui;->a(Landroid/content/Context;III)I

    move-result v0

    invoke-direct {p0, p2}, Lo/csk;->p(I)I

    move-result v1

    sub-int v8, v0, v1

    .line 1198
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->a(J)I

    move-result v1

    const v2, 0x9c43

    invoke-static {v0, p2, v1, v2}, Lo/cui;->a(Landroid/content/Context;III)I

    move-result v0

    invoke-direct {p0, p2}, Lo/csk;->f(I)I

    move-result v1

    sub-int v9, v0, v1

    .line 1199
    if-ge v8, v4, :cond_3

    if-lt v9, v5, :cond_4

    .line 1200
    :cond_3
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkInsertStatus stepStatSum or calorieStatSum is enough"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1201
    add-int/lit8 v6, v6, 0x2

    .line 1204
    :cond_4
    return v6
.end method

.method private b(Lcom/huawei/hihealth/HiSyncOption;II)Lo/cto;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 627
    new-instance v2, Lcom/huawei/hihealth/HiSyncOption;

    const/16 v0, 0x2711

    invoke-direct {v2, p1, v0}, Lcom/huawei/hihealth/HiSyncOption;-><init>(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 628
    new-instance v0, Lo/cto;

    sget-object v1, Lo/csk;->k:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2, p3}, Lo/cto;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    return-object v0
.end method

.method private b(II)V
    .locals 3

    .line 286
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "syncThresholdUserDeviceNum_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 287
    return-void
.end method

.method public static b()Z
    .locals 1

    .line 194
    sget-boolean v0, Lo/csk;->f:Z

    return v0
.end method

.method public static c(I)V
    .locals 5

    .line 403
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "cloud_user_privacy3"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 404
    const/4 v0, 0x1

    if-ne v0, p0, :cond_1

    .line 405
    const-string v0, "false"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 406
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->h:Z

    .line 407
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSportDataPrivacy the sportDataPrivacy switch is closed, stop push health data!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 409
    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lo/csk;->h:Z

    .line 410
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSportDataPrivacy the sportDataPrivacy switch is open, start push health data!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    :cond_1
    :goto_0
    const/4 v0, 0x2

    if-ne v0, p0, :cond_3

    .line 414
    const-string v0, "true"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 415
    const/4 v0, 0x1

    sput-boolean v0, Lo/csk;->h:Z

    .line 416
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSportDataPrivacy the sportDataPrivacy switch is open, start push health data!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 418
    :cond_2
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->h:Z

    .line 419
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSportDataPrivacy the sportDataPrivacy switch is closed, stop push health data!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 422
    :cond_3
    :goto_1
    const-string v0, "HiH_"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSportDataPrivacy the sportDataPrivacy is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-boolean v2, Lo/csk;->h:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    return-void
.end method

.method public static c(IZ)V
    .locals 4

    .line 1258
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const-string v1, "downloadsevendaysleepflag"

    sget-object v2, Lo/csk;->k:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 1259
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downloadsevendaysleepflag_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1260
    return-void
.end method

.method private c(J)V
    .locals 2

    .line 298
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lastSyncStatDataBeinTime"

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 299
    return-void
.end method

.method private c(Lcom/huawei/hihealth/HiSyncOption;IIJJI)V
    .locals 6

    .line 570
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDaySync    hiSyncOption ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, "    mainUserID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "   appID = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v4

    .line 572
    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 579
    :pswitch_0
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lo/csk;->a(Lcom/huawei/hihealth/HiSyncOption;II)V
    :try_end_0
    .catch Lo/csq; {:try_start_0 .. :try_end_0} :catch_0

    .line 582
    goto :goto_1

    .line 580
    :catch_0
    move-exception v5

    .line 581
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startSync syncDataType is not right"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/csq;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 583
    goto :goto_1

    .line 585
    :goto_0
    :pswitch_1
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSync syncDataType is not right, syncDataType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x271b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic c(Lo/csk;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lo/csk;->I()V

    return-void
.end method

.method public static c(Z)V
    .locals 3

    .line 153
    sput-boolean p0, Lo/csk;->d:Z

    .line 154
    sget-object v1, Lo/csk;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 155
    if-nez p0, :cond_0

    .line 156
    :try_start_0
    sget-object v0, Lo/csk;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 159
    :goto_0
    return-void
.end method

.method public static c()Z
    .locals 1

    .line 174
    sget-boolean v0, Lo/csk;->b:Z

    return v0
.end method

.method private c(II)Z
    .locals 4

    .line 828
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 830
    :sswitch_0
    invoke-direct {p0, p2}, Lo/csk;->l(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 831
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ifCanAutoSync basicSyncCondition is false , auto sync action is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 832
    const/4 v0, 0x0

    return v0

    .line 836
    :sswitch_1
    invoke-direct {p0}, Lo/csk;->H()Z

    move-result v0

    if-nez v0, :cond_0

    .line 837
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ifCanAutoSync isInSyncTimes is false,auto sync action is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 838
    const/4 v0, 0x0

    return v0

    .line 845
    :cond_0
    :goto_0
    invoke-direct {p0}, Lo/csk;->F()Z

    move-result v0

    if-nez v0, :cond_1

    .line 846
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ifCanAutoSync autoSyncSwitch is closed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 847
    const/4 v0, 0x0

    return v0

    .line 849
    :cond_1
    const/4 v0, 0x1

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x5 -> :sswitch_1
    .end sparse-switch
.end method

.method public static c(Lcom/huawei/hihealth/HiSyncOption;II)Z
    .locals 4

    .line 1079
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 1080
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "paraCheck hiSyncOption is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1081
    const/4 v0, 0x0

    return v0

    .line 1083
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 1084
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "paraCheck syncMethod is not by_user"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1085
    const/4 v0, 0x0

    return v0

    .line 1087
    :cond_1
    if-gtz p1, :cond_2

    .line 1088
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "paraCheck app <= 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1089
    const/4 v0, 0x0

    return v0

    .line 1091
    :cond_2
    if-gtz p2, :cond_3

    .line 1092
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "paraCheck who <= 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1093
    const/4 v0, 0x0

    return v0

    .line 1095
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v0

    invoke-static {v0}, Lo/cmn;->c(I)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1096
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "paraCheck error syncType type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1097
    const/4 v0, 0x0

    return v0

    .line 1099
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private d(II)I
    .locals 12

    .line 744
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0}, Lo/csk;->x()J

    move-result-wide v2

    sub-long v4, v0, v2

    .line 745
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0}, Lo/csk;->z()J

    move-result-wide v2

    sub-long v6, v0, v2

    .line 748
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v4

    if-lez v0, :cond_0

    .line 749
    const-wide/16 v0, 0x0

    sub-long v4, v0, v4

    .line 751
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v6

    if-lez v0, :cond_1

    .line 752
    const-wide/16 v0, 0x0

    sub-long v6, v0, v6

    .line 754
    :cond_1
    invoke-direct {p0, p1}, Lo/csk;->h(I)I

    move-result v0

    const/4 v1, 0x1

    if-ge v1, v0, :cond_2

    .line 755
    const-wide/32 v8, 0x927c0

    goto :goto_0

    .line 757
    :cond_2
    invoke-static {}, Lo/cui;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 758
    const-wide/32 v8, 0x112a880

    goto :goto_0

    .line 760
    :cond_3
    const-wide/32 v8, 0x6ddd00

    .line 763
    :goto_0
    const-wide/32 v10, 0xea60

    .line 764
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkSyncIntervalTime autoSyncTime="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",detailinterval="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",statinterval="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 765
    packed-switch p2, :pswitch_data_0

    goto :goto_1

    .line 767
    :pswitch_0
    cmp-long v0, v4, v8

    if-lez v0, :cond_5

    .line 768
    const/16 v0, 0x2718

    return v0

    .line 772
    :pswitch_1
    cmp-long v0, v6, v10

    if-lez v0, :cond_5

    .line 773
    const/16 v0, 0x2714

    return v0

    .line 777
    :pswitch_2
    cmp-long v0, v4, v8

    if-lez v0, :cond_4

    .line 778
    const/16 v0, 0x2718

    return v0

    .line 780
    :cond_4
    cmp-long v0, v6, v10

    if-lez v0, :cond_5

    .line 781
    const/16 v0, 0x2714

    return v0

    .line 788
    :cond_5
    :goto_1
    const/4 v0, -0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static d(I)V
    .locals 5

    .line 426
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "cloud_user_privacy2"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 427
    const/4 v0, 0x1

    if-ne v0, p0, :cond_1

    .line 428
    const-string v0, "false"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 429
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->e:Z

    .line 430
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUserPrivacy the userPrivacy switch is closed, stop push user data!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 432
    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lo/csk;->e:Z

    .line 433
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUserPrivacy the userPrivacy switch is open, start push user data!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    :cond_1
    :goto_0
    const/4 v0, 0x2

    if-ne v0, p0, :cond_3

    .line 437
    const-string v0, "true"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 438
    const/4 v0, 0x1

    sput-boolean v0, Lo/csk;->e:Z

    .line 439
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUserPrivacy the userPrivacy switch is open, start push user data!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 441
    :cond_2
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->e:Z

    .line 442
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUserPrivacy the userPrivacy switch is closed, stop push user data!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    :cond_3
    :goto_1
    const-string v0, "HiH_"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUserPrivacy the userPrivacy is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-boolean v2, Lo/csk;->e:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 446
    return-void
.end method

.method private static declared-synchronized d(Landroid/content/Context;II)V
    .locals 3

    const-class v2, Lo/csk;

    monitor-enter v2

    .line 186
    :try_start_0
    invoke-static {}, Lo/csk;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 187
    const/4 v0, 0x1

    invoke-static {v0}, Lo/csk;->e(Z)V

    .line 188
    new-instance v1, Ljava/lang/Thread;

    new-instance v0, Lo/cth;

    invoke-direct {v0, p0, p1, p2}, Lo/cth;-><init>(Landroid/content/Context;II)V

    invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 189
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    :cond_0
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static d()Z
    .locals 1

    .line 198
    sget-boolean v0, Lo/csk;->h:Z

    return v0
.end method

.method private e(Lcom/huawei/hihealth/HiSyncOption;II)Lo/ctr;
    .locals 3

    .line 621
    new-instance v2, Lcom/huawei/hihealth/HiSyncOption;

    const/4 v0, 0x1

    invoke-direct {v2, p1, v0}, Lcom/huawei/hihealth/HiSyncOption;-><init>(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 622
    new-instance v0, Lo/ctr;

    sget-object v1, Lo/csk;->k:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p2, p3}, Lo/ctr;-><init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V

    return-object v0
.end method

.method public static e(Landroid/content/Context;II)V
    .locals 0

    .line 182
    invoke-static {p0, p1, p2}, Lo/csk;->d(Landroid/content/Context;II)V

    .line 183
    return-void
.end method

.method private e(Lcom/huawei/hihealth/HiSyncOption;I)V
    .locals 10

    .line 560
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/cqf;->d(Landroid/content/Context;I)I

    move-result v9

    .line 561
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doOneDaySync hiSyncOption = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",app = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " who = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    invoke-static {p1, p2, v9}, Lo/csk;->c(Lcom/huawei/hihealth/HiSyncOption;II)Z

    move-result v0

    if-nez v0, :cond_0

    .line 563
    return-void

    .line 565
    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, v9

    move v3, p2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDay()J

    move-result-wide v4

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDay()J

    move-result-wide v6

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncType()I

    move-result v8

    invoke-direct/range {v0 .. v8}, Lo/csk;->c(Lcom/huawei/hihealth/HiSyncOption;IIJJI)V

    .line 566
    return-void
.end method

.method public static e(Z)V
    .locals 0

    .line 178
    sput-boolean p0, Lo/csk;->b:Z

    .line 179
    return-void
.end method

.method public static e()Z
    .locals 1

    .line 202
    sget-boolean v0, Lo/csk;->i:Z

    return v0
.end method

.method private f(I)I
    .locals 7

    .line 302
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const-string v1, "sync_module"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "totalCalorie_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 303
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastTotalCalorie completed !!! id = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    const/4 v5, 0x0

    .line 305
    invoke-static {v4}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 307
    const/16 v0, 0xa

    :try_start_0
    invoke-static {v4, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 310
    goto :goto_0

    .line 308
    :catch_0
    move-exception v6

    .line 309
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parse int error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    goto :goto_0

    .line 312
    :cond_0
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "totalCalorie_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 314
    :goto_0
    return v5
.end method

.method private f(II)V
    .locals 4

    .line 927
    const/4 v0, 0x3

    if-ne v0, p1, :cond_0

    .line 928
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/csk;->c(J)V

    .line 929
    invoke-direct {p0}, Lo/csk;->v()I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    .line 930
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "statsynctotalnum"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 931
    goto :goto_0

    .line 938
    :cond_0
    invoke-direct {p0}, Lo/csk;->w()V

    .line 940
    :goto_0
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    const-string v1, "appAutoSyncTimes"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 941
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "appAutoSyncTimes"

    add-int/lit8 v2, v3, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 942
    return-void
.end method

.method public static f()Z
    .locals 1

    .line 206
    sget-boolean v0, Lo/csk;->e:Z

    return v0
.end method

.method public static g()Z
    .locals 1

    .line 214
    sget-boolean v0, Lo/csk;->h:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lo/csk;->i:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static g(I)Z
    .locals 5

    .line 1252
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const-string v1, "downloadsevendaysleepflag"

    sget-object v2, Lo/csk;->k:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 1253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "downloadsevendaysleepflag_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 1254
    return v4
.end method

.method private h(I)I
    .locals 3

    .line 290
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "syncThresholdUserDeviceNum_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private h(II)V
    .locals 4

    .line 981
    invoke-direct {p0, p2}, Lo/csk;->r(I)V

    .line 982
    const/4 v0, 0x4

    if-ne v0, p1, :cond_1

    .line 983
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v2

    .line 984
    invoke-virtual {p0}, Lo/csk;->k()I

    move-result v3

    .line 985
    if-eq v2, v3, :cond_1

    .line 986
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cuq;->d(Landroid/content/Context;)Lo/cuq;

    move-result-object v0

    invoke-virtual {v0}, Lo/cuq;->d()V

    .line 987
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 988
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cuq;->d(Landroid/content/Context;)Lo/cuq;

    move-result-object v0

    invoke-direct {p0, p2}, Lo/csk;->h(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cuq;->e(I)V

    .line 990
    :cond_0
    invoke-virtual {p0, v2}, Lo/csk;->b(I)V

    .line 993
    :cond_1
    return-void
.end method

.method public static h()Z
    .locals 1

    .line 218
    sget-boolean v0, Lo/csk;->h:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Lo/csk;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private i(I)V
    .locals 2

    .line 250
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "currentDay"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 251
    return-void
.end method

.method public static i()Z
    .locals 1

    .line 210
    sget-boolean v0, Lo/csk;->e:Z

    if-nez v0, :cond_0

    invoke-static {}, Lo/csk;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private j()V
    .locals 4

    .line 366
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "syncservicestarttimes"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 367
    return-void
.end method

.method private l(I)Z
    .locals 10

    .line 860
    invoke-direct {p0, p1}, Lo/csk;->r(I)V

    .line 861
    const-wide/32 v4, 0x927c0

    .line 862
    invoke-static {}, Lo/csk;->m()I

    move-result v6

    .line 863
    const/4 v0, 0x1

    if-ne v0, v6, :cond_1

    .line 864
    invoke-direct {p0, p1}, Lo/csk;->h(I)I

    move-result v0

    const/4 v1, 0x1

    if-ge v1, v0, :cond_0

    .line 865
    const-wide/32 v4, 0x927c0

    goto :goto_0

    .line 868
    :cond_0
    const-wide/32 v4, 0x6ddd00

    .line 871
    :cond_1
    :goto_0
    const/4 v0, 0x2

    if-ne v0, v6, :cond_2

    .line 872
    const-wide/32 v4, 0x112a880

    .line 874
    :cond_2
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkSyncIntervalTime autoSyncTime="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 876
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0}, Lo/csk;->x()J

    move-result-wide v2

    sub-long v7, v0, v2

    .line 877
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v7

    if-lez v0, :cond_3

    .line 878
    const-wide/16 v0, 0x0

    sub-long v7, v0, v7

    .line 880
    :cond_3
    cmp-long v0, v7, v4

    if-gtz v0, :cond_4

    .line 881
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "basicSyncCondition NOT! the app has sync too quick,intervalTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 882
    const/4 v0, 0x0

    return v0

    .line 885
    :cond_4
    invoke-direct {p0}, Lo/csk;->q()I

    move-result v9

    .line 886
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stepSyncOrNot appSynTimes is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 887
    const/16 v0, 0x190

    if-le v9, v0, :cond_5

    .line 888
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "basicSyncCondition NOT! the app has sync too many times,appSynTimes is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 889
    const/4 v0, 0x0

    return v0

    .line 891
    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method public static m()I
    .locals 3

    .line 391
    invoke-static {}, Lo/czu;->e()Z

    move-result v1

    .line 392
    invoke-static {}, Lo/czu;->i()Z

    move-result v2

    .line 393
    if-nez v1, :cond_0

    .line 394
    const/4 v0, 0x1

    return v0

    .line 396
    :cond_0
    if-eqz v2, :cond_1

    .line 397
    const/4 v0, 0x2

    return v0

    .line 399
    :cond_1
    const/4 v0, 0x3

    return v0
.end method

.method private static m(I)V
    .locals 5

    .line 476
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_wether_to_auth"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 477
    const/4 v0, 0x1

    if-ne v0, p0, :cond_1

    .line 478
    const-string v0, "false"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 479
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->f:Z

    .line 480
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUserConferPrivacy the userConferPrivacy switch is closed, can\'t do sync!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 482
    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lo/csk;->f:Z

    .line 483
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUserConferPrivacy the userConferPrivacy switch is open, can do sync!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    :cond_1
    :goto_0
    const/4 v0, 0x2

    if-ne v0, p0, :cond_3

    .line 487
    const-string v0, "true"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 488
    const/4 v0, 0x1

    sput-boolean v0, Lo/csk;->f:Z

    .line 489
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUserConferPrivacy the userConferPrivacy switch is open, can do sync!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 491
    :cond_2
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->f:Z

    .line 492
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUserConferPrivacy the userConferPrivacy switch is closed, can\'t do sync!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    :cond_3
    :goto_1
    const-string v0, "HiH_"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUserConferPrivacy the userConferPrivacy is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-boolean v2, Lo/csk;->f:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    return-void
.end method

.method private static n(I)V
    .locals 5

    .line 449
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "cloud_user_privacy7"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 450
    const/4 v0, 0x1

    if-ne v0, p0, :cond_2

    .line 451
    const-string v0, "false"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 452
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->i:Z

    .line 453
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHealthDataPrivacy the healthDataPrivacy switch is closed, stop push health data!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 454
    :cond_0
    invoke-static {v4}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 455
    invoke-static {}, Lo/csk;->d()Z

    move-result v0

    sput-boolean v0, Lo/csk;->i:Z

    goto :goto_0

    .line 457
    :cond_1
    const/4 v0, 0x1

    sput-boolean v0, Lo/csk;->i:Z

    .line 458
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHealthDataPrivacy the healthDataPrivacy switch is open, start push health data!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    :cond_2
    :goto_0
    const/4 v0, 0x2

    if-ne v0, p0, :cond_5

    .line 462
    const-string v0, "true"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 463
    const/4 v0, 0x1

    sput-boolean v0, Lo/csk;->i:Z

    .line 464
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHealthDataPrivacy the healthDataPrivacy switch is open, start push health data!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 465
    :cond_3
    invoke-static {v4}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 466
    invoke-static {}, Lo/csk;->d()Z

    move-result v0

    sput-boolean v0, Lo/csk;->i:Z

    goto :goto_1

    .line 468
    :cond_4
    const/4 v0, 0x0

    sput-boolean v0, Lo/csk;->i:Z

    .line 469
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHealthDataPrivacy the healthDataPrivacy switch is closed, stop push health data!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    :cond_5
    :goto_1
    const-string v0, "HiH_"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHealthDataPrivacy the healthDataPrivacy is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-boolean v2, Lo/csk;->i:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    return-void
.end method

.method public static o()I
    .locals 4

    .line 383
    sget v0, Lo/csk;->g:I

    if-gtz v0, :cond_0

    .line 384
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error syncModel is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget v2, Lo/csk;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    const/4 v0, 0x2

    return v0

    .line 387
    :cond_0
    sget v0, Lo/csk;->g:I

    return v0
.end method

.method private o(I)Z
    .locals 4

    .line 807
    invoke-static {}, Lo/csk;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 808
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ifCanSync not! user didn\'t auth user confer! can not do sync!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 809
    const/4 v0, 0x0

    return v0

    .line 811
    :cond_0
    invoke-static {}, Lo/csk;->m()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_1

    .line 812
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ifCanSync not! no cloud version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 813
    const/4 v0, 0x0

    return v0

    .line 815
    :cond_1
    invoke-direct {p0}, Lo/csk;->D()Z

    move-result v0

    if-nez v0, :cond_2

    .line 816
    invoke-virtual {p0}, Lo/csk;->s()V

    .line 817
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ifCanSync not! no networkConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 818
    const/4 v0, 0x0

    return v0

    .line 820
    :cond_2
    invoke-direct {p0, p1}, Lo/csk;->s(I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 821
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ifCanSync not! not login in database"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 822
    const/4 v0, 0x0

    return v0

    .line 824
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private p(I)I
    .locals 7

    .line 318
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const-string v1, "sync_module"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "totalStep_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 319
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastTotalStep completed !!! id = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    const/4 v5, 0x0

    .line 321
    invoke-static {v4}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 323
    const/16 v0, 0xa

    :try_start_0
    invoke-static {v4, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 326
    goto :goto_0

    .line 324
    :catch_0
    move-exception v6

    .line 325
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parse int error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    goto :goto_0

    .line 328
    :cond_0
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "totalStep_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 330
    :goto_0
    return v5
.end method

.method private q()I
    .locals 3

    .line 266
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    const-string v1, "appAutoSyncTimes"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private q(I)I
    .locals 4

    .line 1209
    const/16 v1, 0x1f4

    .line 1210
    invoke-static {}, Lo/csk;->m()I

    move-result v2

    .line 1211
    invoke-direct {p0, p1}, Lo/csk;->h(I)I

    move-result v3

    .line 1212
    const/4 v0, 0x2

    if-ne v0, v2, :cond_0

    .line 1213
    const/4 v0, 0x2

    if-le v0, v3, :cond_0

    .line 1214
    const/16 v1, 0x5dc

    .line 1225
    :cond_0
    return v1
.end method

.method private r(I)V
    .locals 7

    .line 961
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v4

    .line 962
    invoke-virtual {p0}, Lo/csk;->n()I

    move-result v5

    .line 963
    if-eq v4, v5, :cond_0

    .line 964
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkCurrentDay a new day comes , reset basicSyncCondition, currentDay is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " oldDay is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 965
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-direct {p0}, Lo/csk;->q()I

    move-result v1

    invoke-direct {p0}, Lo/csk;->y()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/cuy;->l(Landroid/content/Context;I)V

    .line 966
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cuq;->d(Landroid/content/Context;)Lo/cuq;

    move-result-object v0

    invoke-virtual {v0}, Lo/cuq;->a()V

    .line 967
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cuq;->d(Landroid/content/Context;)Lo/cuq;

    move-result-object v0

    invoke-virtual {v0}, Lo/cuq;->c()V

    .line 968
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/cuy;->n(Landroid/content/Context;I)V

    .line 969
    invoke-direct {p0, v4}, Lo/csk;->i(I)V

    .line 970
    invoke-virtual {p0}, Lo/csk;->p()V

    .line 971
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/csk;->c(J)V

    .line 972
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/csk;->e(II)V

    .line 973
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/csk;->a(II)V

    .line 974
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cqs;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 975
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v6, v1}, Lo/cuy;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 976
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "step_sum_dvalue"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 978
    :cond_0
    return-void
.end method

.method private s(I)Z
    .locals 5

    .line 918
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v4

    .line 919
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const-string v0, "com."

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 920
    :cond_0
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isLogin such app can not sync , app is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 921
    const/4 v0, 0x0

    return v0

    .line 923
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private t(I)I
    .locals 4

    .line 1229
    const v1, 0x186a0

    .line 1230
    invoke-static {}, Lo/csk;->m()I

    move-result v2

    .line 1231
    invoke-direct {p0, p1}, Lo/csk;->h(I)I

    move-result v3

    .line 1232
    const/4 v0, 0x2

    if-ne v0, v2, :cond_0

    .line 1233
    const/4 v0, 0x2

    if-le v0, v3, :cond_0

    .line 1234
    const v1, 0x493e0

    .line 1237
    :cond_0
    return v1
.end method

.method private static t()V
    .locals 4

    .line 142
    const/4 v0, 0x2

    sput v0, Lo/csk;->g:I

    .line 144
    sget v0, Lo/csk;->g:I

    invoke-static {v0}, Lo/czu;->c(I)V

    .line 145
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSyncModel current SyncModel is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    return-void
.end method

.method static synthetic u()Landroid/content/Context;
    .locals 1

    .line 50
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    return-object v0
.end method

.method private u(I)Z
    .locals 1

    .line 1242
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 1245
    :sswitch_0
    const/4 v0, 0x1

    return v0

    .line 1247
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x2715 -> :sswitch_0
        0x2716 -> :sswitch_0
    .end sparse-switch
.end method

.method private v()I
    .locals 3

    .line 270
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    const-string v1, "statsynctotalnum"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private w()V
    .locals 4

    .line 282
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lastSyncBeginTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 283
    return-void
.end method

.method private x()J
    .locals 4

    .line 278
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    const-string v1, "lastSyncBeginTime"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private y()I
    .locals 3

    .line 274
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    const-string v1, "totalSportStatSyncTimes"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private z()J
    .locals 4

    .line 294
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    const-string v1, "lastSyncStatDataBeinTime"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public a(I)V
    .locals 5

    .line 945
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->a(J)I

    move-result v1

    const v2, 0x9c42

    invoke-static {v0, p1, v1, v2}, Lo/cui;->a(Landroid/content/Context;III)I

    move-result v3

    .line 946
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->a(J)I

    move-result v1

    const v2, 0x9c43

    invoke-static {v0, p1, v1, v2}, Lo/cui;->a(Landroid/content/Context;III)I

    move-result v4

    .line 947
    invoke-virtual {p0, p1, v4}, Lo/csk;->e(II)V

    .line 948
    invoke-virtual {p0, p1, v3}, Lo/csk;->a(II)V

    .line 949
    return-void
.end method

.method public a(II)V
    .locals 6

    .line 344
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const-string v1, "sync_module"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "totalStep_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 345
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 344
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 346
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setLastTotalStep completed, step:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "totalStep_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 349
    :cond_0
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "totalStep_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 351
    :goto_0
    return-void
.end method

.method public a(ILjava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 1107
    invoke-static {p2}, Lo/cva;->e(Ljava/util/List;)Z

    move-result v4

    .line 1108
    if-nez v4, :cond_0

    .line 1109
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startInsertSportSync insert no sport data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1110
    return-void

    .line 1114
    :cond_0
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cqf;->d(Landroid/content/Context;I)I

    move-result v5

    .line 1115
    if-gtz v5, :cond_1

    .line 1116
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startInsertSportSync who <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1117
    return-void

    .line 1120
    :cond_1
    invoke-direct {p0, v5}, Lo/csk;->r(I)V

    .line 1122
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-direct {p0, v0, v5}, Lo/csk;->b(Landroid/content/Context;I)I

    move-result v6

    .line 1123
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 1124
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkSportDataNum setp and calories is too less"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1125
    return-void

    .line 1129
    :cond_2
    invoke-direct {p0, v5, v6}, Lo/csk;->d(II)I

    move-result v7

    .line 1130
    const/4 v0, -0x1

    if-ne v0, v7, :cond_3

    .line 1131
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startInsertSportSync checkSyncIntervalTime is false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1132
    return-void

    .line 1134
    :cond_3
    invoke-direct {p0}, Lo/csk;->E()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1135
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startInsertSportSync checkSyncTimes is false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1136
    return-void

    .line 1139
    :cond_4
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startInsertSportSync start auto sync,app is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1140
    new-instance v8, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v8}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 1141
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 1142
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cqf;->d(Landroid/content/Context;I)I

    move-result v9

    .line 1143
    const/16 v0, 0x2718

    if-ne v0, v7, :cond_6

    .line 1145
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    invoke-static {v0, v9, v1, v2, v3}, Lo/cui;->a(Landroid/content/Context;IIJ)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1146
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startInsertSportSync first 500 steps sync,do all sync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1147
    const/16 v0, 0x4e20

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    goto :goto_0

    .line 1150
    :cond_5
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startInsertSportSync not first 500 steps sync,do push_sport_data sync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1151
    const/16 v0, 0x2718

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 1153
    :goto_0
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 1154
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->r(Landroid/content/Context;)I

    move-result v0

    add-int/lit8 v10, v0, 0x1

    .line 1155
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0, v10}, Lo/cuy;->u(Landroid/content/Context;I)V

    .line 1157
    :cond_6
    const/16 v0, 0x2714

    if-ne v0, v7, :cond_8

    .line 1159
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    invoke-static {v0, v9, v1, v2, v3}, Lo/cui;->a(Landroid/content/Context;IIJ)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1160
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startInsertSportSync first stat 500 steps sync,do all sync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1161
    const/16 v0, 0x4e20

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    goto :goto_1

    .line 1164
    :cond_7
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startInsertSportSync sync stat data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1165
    invoke-virtual {v8, v7}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 1167
    :goto_1
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 1168
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->q(Landroid/content/Context;)I

    move-result v0

    add-int/lit8 v10, v0, 0x1

    .line 1169
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0, v10}, Lo/cuy;->s(Landroid/content/Context;I)V

    .line 1171
    :cond_8
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 1172
    invoke-virtual {p0, v8, p1}, Lo/csk;->d(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 1173
    return-void
.end method

.method public b(I)V
    .locals 2

    .line 222
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "biCurrentDay"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 223
    return-void
.end method

.method public b(IZ)V
    .locals 3

    .line 354
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updatedevicestate_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 355
    return-void
.end method

.method public b(Lcom/huawei/hihealth/HiSyncOption;I)V
    .locals 6

    .line 514
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " ----------------------------  startOneDaySync  ----------------------------------- hiSyncOption = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    iget-object v4, p0, Lo/csk;->p:Ljava/lang/Object;

    monitor-enter v4

    .line 516
    :try_start_0
    invoke-static {}, Lo/dbf;->b()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 517
    monitor-exit v4

    return-void

    .line 519
    :cond_0
    :try_start_1
    invoke-direct {p0, p1, p2}, Lo/csk;->e(Lcom/huawei/hihealth/HiSyncOption;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 520
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 521
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;Z)V
    .locals 3

    .line 245
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "userConfigFirstSync"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 246
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v2, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 247
    return-void
.end method

.method public c(Ljava/lang/String;II)V
    .locals 6

    .line 729
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastSync begin dataType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 730
    if-nez p1, :cond_0

    return-void

    .line 731
    :cond_0
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v4

    .line 732
    new-instance v5, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 733
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 734
    invoke-virtual {v5, p3}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 735
    invoke-virtual {v5, p2}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 736
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 737
    invoke-virtual {p0, v5, v4}, Lo/csk;->d(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 738
    return-void
.end method

.method public d(Lcom/huawei/hihealth/HiSyncOption;I)V
    .locals 3

    .line 525
    iget-object v1, p0, Lo/csk;->p:Ljava/lang/Object;

    monitor-enter v1

    .line 526
    :try_start_0
    invoke-static {}, Lo/dbf;->b()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 527
    monitor-exit v1

    return-void

    .line 529
    :cond_0
    :try_start_1
    invoke-direct {p0, p1, p2}, Lo/csk;->a(Lcom/huawei/hihealth/HiSyncOption;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 530
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 531
    :goto_0
    return-void
.end method

.method public d(Lcom/huawei/hihealth/HiSyncOption;IIII)V
    .locals 9

    .line 534
    iget-object v4, p0, Lo/csk;->p:Ljava/lang/Object;

    monitor-enter v4

    .line 535
    :try_start_0
    invoke-static {}, Lo/dbf;->b()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 536
    monitor-exit v4

    return-void

    .line 538
    :cond_0
    :try_start_1
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/cqf;->d(Landroid/content/Context;I)I

    move-result v5

    .line 539
    const-string v0, "HiH_HiSyncControl"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSync hiSyncOption = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",app = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " who = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",startTime = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, ", endTime = "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 540
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDataType()I

    move-result v6

    .line 541
    invoke-static {}, Lo/csk;->C()V

    .line 542
    invoke-direct {p0, p2}, Lo/csk;->o(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 543
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const/4 v1, -0x1

    invoke-static {v0, v6, p5, v1}, Lo/cnt;->c(Landroid/content/Context;III)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 544
    monitor-exit v4

    return-void

    .line 546
    :cond_1
    :try_start_2
    new-instance v7, Landroid/content/Intent;

    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const-class v1, Lcom/huawei/hihealthservice/sync/HiSyncService;

    invoke-direct {v7, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 547
    const-string v0, "sync_option"

    invoke-virtual {v7, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 548
    const-string v0, "sync_appId"

    invoke-virtual {v7, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 549
    const-string v0, "sync_main_UserID"

    invoke-virtual {v7, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 550
    const-string v0, "sync_starttime"

    invoke-virtual {v7, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 551
    const-string v0, "sync_endtime"

    invoke-virtual {v7, v0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 552
    const-string v0, "sync_datatype"

    invoke-virtual {v7, v0, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 553
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 554
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    .line 555
    :goto_0
    return-void
.end method

.method public d(Ljava/lang/String;Z)V
    .locals 3

    .line 235
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initialSync"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 236
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v2, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 237
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 3

    .line 230
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initialSync"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 231
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    const/4 v1, 0x1

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public e(I)V
    .locals 2

    .line 258
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "newcurrentDay"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 259
    return-void
.end method

.method public e(II)V
    .locals 6

    .line 334
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    const-string v1, "sync_module"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "totalCalorie_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 335
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 334
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 336
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setLastTotalCalorie completed, calorie:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "totalCalorie_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 339
    :cond_0
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "totalCalorie_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 341
    :goto_0
    return-void
.end method

.method public e(Ljava/lang/String;)Z
    .locals 3

    .line 240
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "userConfigFirstSync"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 241
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    const/4 v1, 0x1

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public k()I
    .locals 3

    .line 226
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    const-string v1, "biCurrentDay"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public k(I)V
    .locals 7

    .line 996
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v4

    .line 997
    invoke-virtual {p0}, Lo/csk;->l()I

    move-result v5

    .line 998
    if-eq v4, v5, :cond_1

    .line 1000
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkCurrentDayBindDevice a new day comes, currentday is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " oldDay is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1002
    sget-object v0, Lo/csk;->k:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cui;->e(Landroid/content/Context;I)I

    move-result v6

    .line 1003
    const/4 v0, 0x0

    if-le v0, v6, :cond_0

    .line 1005
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkCurrentDayBindDevice fail !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1006
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lo/csk;->b(IZ)V

    .line 1007
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lo/csk;->b(II)V

    goto :goto_0

    .line 1009
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lo/csk;->b(IZ)V

    .line 1010
    invoke-direct {p0, p1, v6}, Lo/csk;->b(II)V

    .line 1012
    :goto_0
    invoke-virtual {p0, v4}, Lo/csk;->e(I)V

    .line 1014
    :cond_1
    return-void
.end method

.method public l()I
    .locals 3

    .line 262
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    const-string v1, "newcurrentDay"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public n()I
    .locals 3

    .line 254
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    const-string v1, "currentDay"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public p()V
    .locals 4

    .line 952
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "appAutoSyncTimes"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 953
    invoke-direct {p0}, Lo/csk;->x()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    .line 954
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "lastSyncBeginTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->d(J)J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 956
    :cond_0
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "statsynctotalnum"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 957
    iget-object v0, p0, Lo/csk;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "totalSportStatSyncTimes"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 958
    return-void
.end method

.method public r()V
    .locals 6

    .line 1048
    iget-object v4, p0, Lo/csk;->n:Ljava/lang/Object;

    monitor-enter v4

    .line 1049
    :try_start_0
    iget-object v0, p0, Lo/csk;->l:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 1050
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelNetErrorTimer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1051
    iget-object v0, p0, Lo/csk;->l:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 1052
    const/4 v0, 0x0

    iput-object v0, p0, Lo/csk;->l:Ljava/util/Timer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1054
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 1055
    :goto_0
    return-void
.end method

.method public s()V
    .locals 8

    .line 1032
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1033
    :cond_0
    iget-object v6, p0, Lo/csk;->n:Ljava/lang/Object;

    monitor-enter v6

    .line 1034
    :try_start_0
    iget-object v0, p0, Lo/csk;->l:Ljava/util/Timer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit v6

    return-void

    .line 1035
    :cond_1
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startNetErrorTimer"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1036
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lo/csk;->l:Ljava/util/Timer;

    .line 1037
    iget-object v0, p0, Lo/csk;->l:Ljava/util/Timer;

    new-instance v1, Lo/csk$2;

    invoke-direct {v1, p0}, Lo/csk$2;-><init>(Lo/csk;)V

    const-wide/32 v2, 0x927c0

    const-wide/32 v4, 0x927c0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1044
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 1045
    :goto_0
    return-void
.end method
