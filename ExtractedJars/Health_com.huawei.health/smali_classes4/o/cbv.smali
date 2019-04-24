.class public Lo/cbv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cbv$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/concurrent/ScheduledExecutorService;

.field b:Lo/ccs;

.field private c:Landroid/os/HandlerThread;

.field private d:F

.field private e:Landroid/os/Handler;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cfg;>;"
        }
    .end annotation
.end field

.field private g:F

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cfg;>;"
        }
    .end annotation
.end field

.field private i:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lo/cbv;->d:F

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/cbv;->g:F

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbv;->i:Landroid/content/Context;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbv;->b:Lo/ccs;

    return-void
.end method

.method static synthetic a(Lo/cbv;)Landroid/content/Context;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/cbv;->i:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lo/cbv;)Ljava/util/List;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/cbv;->h:Ljava/util/List;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 153
    iget-object v0, p0, Lo/cbv;->e:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 154
    const-string v0, "Track_TrackPointDataUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWokerHandler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    return-void

    .line 158
    :cond_0
    iget-object v0, p0, Lo/cbv;->e:Landroid/os/Handler;

    new-instance v1, Lo/cbv$2;

    invoke-direct {v1, p0}, Lo/cbv$2;-><init>(Lo/cbv;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 167
    return-void
.end method

.method private h()V
    .locals 7

    .line 177
    const-string v0, "Track_TrackPointDataUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerMinuteChangedReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/cbv;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 179
    iget-object v0, p0, Lo/cbv;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lo/cbv$b;

    invoke-direct {v1, p0}, Lo/cbv$b;-><init>(Lo/cbv;)V

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 184
    return-void
.end method

.method private k()V
    .locals 4

    .line 187
    const-string v0, "Track_TrackPointDataUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterMinuteChangedReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lo/cbv;->a:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lo/cbv;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 191
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbv;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 193
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 56
    iget-object v0, p0, Lo/cbv;->i:Landroid/content/Context;

    const-string v1, "track_point_data.txt"

    invoke-static {v0, v1}, Lo/cea;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/cbv;->f:Ljava/util/List;

    .line 57
    iget-object v0, p0, Lo/cbv;->f:Ljava/util/List;

    if-nez v0, :cond_0

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cbv;->f:Ljava/util/List;

    goto :goto_1

    .line 60
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cbv;->d:F

    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lo/cbv;->g:F

    .line 62
    iget-object v0, p0, Lo/cbv;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cfg;

    .line 63
    iget v0, p0, Lo/cbv;->d:F

    invoke-virtual {v5}, Lo/cfg;->b()F

    move-result v1

    add-float/2addr v0, v1

    iput v0, p0, Lo/cbv;->d:F

    .line 64
    iget v0, p0, Lo/cbv;->g:F

    invoke-virtual {v5}, Lo/cfg;->c()F

    move-result v1

    add-float/2addr v0, v1

    iput v0, p0, Lo/cbv;->g:F

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iget v0, p0, Lo/cbv;->d:F

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/cbv;->d:F

    .line 69
    :goto_1
    const-string v0, "Track_TrackPointDataUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recoveryPointData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cbv;->f:Ljava/util/List;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    return-void
.end method

.method public a(FFJ)V
    .locals 7

    .line 130
    iget v0, p0, Lo/cbv;->d:F

    sub-float v4, p2, v0

    .line 131
    iget v0, p0, Lo/cbv;->g:F

    sub-float v5, p1, v0

    .line 132
    iput p2, p0, Lo/cbv;->d:F

    .line 133
    iput p1, p0, Lo/cbv;->g:F

    .line 135
    const-wide/32 v0, 0xea60

    div-long v0, p3, v0

    const-wide/32 v2, 0xea60

    mul-long p3, v0, v2

    .line 137
    new-instance v6, Lo/cfg;

    invoke-direct {v6}, Lo/cfg;-><init>()V

    .line 138
    const-wide/32 v0, 0xea60

    sub-long v0, p3, v0

    invoke-virtual {v6, v0, v1}, Lo/cfg;->e(J)V

    .line 139
    invoke-virtual {v6, p3, p4}, Lo/cfg;->a(J)V

    .line 140
    invoke-virtual {v6, v5}, Lo/cfg;->a(F)V

    .line 141
    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v4

    invoke-virtual {v6, v0}, Lo/cfg;->e(F)V

    .line 143
    iget-object v0, p0, Lo/cbv;->f:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    iget-object v0, p0, Lo/cbv;->h:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    const-string v0, "Track_TrackPointDataUtils"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "time : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " cal = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " dis = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " pointData = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object v6, v1, v2

    const-string v2, " "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const/16 v2, 0x9

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    invoke-direct {p0}, Lo/cbv;->c()V

    .line 150
    return-void
.end method

.method public b()V
    .locals 4

    .line 119
    const-string v0, "Track_TrackPointDataUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroyTrackPointDataUtils"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    iget-object v0, p0, Lo/cbv;->c:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Lo/cbv;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 122
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbv;->c:Landroid/os/HandlerThread;

    .line 125
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbv;->e:Landroid/os/Handler;

    .line 126
    iget-object v0, p0, Lo/cbv;->i:Landroid/content/Context;

    const-string v1, "track_point_data.txt"

    invoke-static {v0, v1}, Lo/cdy;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 127
    return-void
.end method

.method public b(Lo/ccs;)V
    .locals 0

    .line 170
    if-eqz p1, :cond_0

    .line 171
    iput-object p1, p0, Lo/cbv;->b:Lo/ccs;

    .line 173
    :cond_0
    return-void
.end method

.method public c(F)V
    .locals 6

    .line 230
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    .line 231
    const-string v0, "Track_TrackPointDataUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changePointDataByRatio the ratio is illegal! ratio = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    return-void

    .line 234
    :cond_0
    iget-object v0, p0, Lo/cbv;->f:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/cbv;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 235
    iget-object v0, p0, Lo/cbv;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cfg;

    .line 236
    invoke-virtual {v5}, Lo/cfg;->c()F

    move-result v0

    mul-float/2addr v0, p1

    invoke-virtual {v5, v0}, Lo/cfg;->a(F)V

    .line 237
    invoke-virtual {v5}, Lo/cfg;->b()F

    move-result v0

    mul-float/2addr v0, p1

    invoke-virtual {v5, v0}, Lo/cfg;->e(F)V

    .line 238
    goto :goto_0

    .line 240
    :cond_1
    return-void
.end method

.method public d()V
    .locals 6

    .line 106
    iget-object v0, p0, Lo/cbv;->b:Lo/ccs;

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lo/cbv;->b:Lo/ccs;

    invoke-interface {v0}, Lo/ccs;->ao()F

    move-result v4

    .line 108
    iget-object v0, p0, Lo/cbv;->b:Lo/ccs;

    invoke-interface {v0}, Lo/ccs;->ar()F

    move-result v5

    .line 109
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    add-long/2addr v0, v2

    invoke-virtual {p0, v4, v5, v0, v1}, Lo/cbv;->a(FFJ)V

    .line 110
    goto :goto_0

    .line 111
    :cond_0
    const-string v0, "Track_TrackPointDataUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopTrackPointDataUtils mUpdater is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    :goto_0
    invoke-direct {p0}, Lo/cbv;->k()V

    .line 115
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbv;->b:Lo/ccs;

    .line 116
    return-void
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/cfg;>;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lo/cbv;->f:Ljava/util/List;

    return-object v0
.end method

.method public e(Landroid/content/Context;Z)V
    .locals 4

    .line 79
    const-string v0, "Track_TrackPointDataUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initTrackPointDataUtils "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    iget-object v0, p0, Lo/cbv;->e:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 82
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "TrackPointDataThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cbv;->c:Landroid/os/HandlerThread;

    .line 83
    iget-object v0, p0, Lo/cbv;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 84
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lo/cbv;->c:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cbv;->e:Landroid/os/Handler;

    .line 87
    :cond_0
    if-eqz p1, :cond_1

    .line 88
    iput-object p1, p0, Lo/cbv;->i:Landroid/content/Context;

    goto :goto_0

    .line 90
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cbv;->i:Landroid/content/Context;

    .line 93
    :goto_0
    if-eqz p2, :cond_2

    .line 94
    invoke-virtual {p0}, Lo/cbv;->a()V

    goto :goto_1

    .line 96
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cbv;->f:Ljava/util/List;

    .line 99
    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cbv;->h:Ljava/util/List;

    .line 101
    invoke-direct {p0}, Lo/cbv;->h()V

    .line 103
    return-void
.end method
