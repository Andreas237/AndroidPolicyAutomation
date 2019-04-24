.class public Lcom/huawei/health/suggestion/data/DataSyncService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/data/DataSyncService$a;,
        Lcom/huawei/health/suggestion/data/DataSyncService$e;
    }
.end annotation


# instance fields
.field private d:J

.field private final e:Landroid/os/IBinder;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 26
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 30
    new-instance v0, Lcom/huawei/health/suggestion/data/DataSyncService$e;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/data/DataSyncService$e;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService;->e:Landroid/os/IBinder;

    .line 32
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService;->d:J

    return-void
.end method

.method private a()V
    .locals 4

    .line 66
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/data/DataSyncService;->d:J

    invoke-interface {v0, v1, v2}, Lo/bsp;->c(J)Lcom/huawei/health/suggestion/model/DataSync;

    move-result-object v3

    .line 68
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    invoke-static {p0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/DataSync;->getRecordId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService;->d:J

    .line 70
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/DataSync;->getType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 72
    :pswitch_0
    invoke-direct {p0, v3}, Lcom/huawei/health/suggestion/data/DataSyncService;->c(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 73
    goto :goto_1

    .line 75
    :pswitch_1
    invoke-direct {p0, v3}, Lcom/huawei/health/suggestion/data/DataSyncService;->b(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 76
    goto :goto_1

    .line 78
    :pswitch_2
    invoke-direct {p0, v3}, Lcom/huawei/health/suggestion/data/DataSyncService;->a(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 79
    goto :goto_1

    .line 81
    :pswitch_3
    invoke-direct {p0, v3}, Lcom/huawei/health/suggestion/data/DataSyncService;->k(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 82
    goto :goto_1

    .line 84
    :pswitch_4
    invoke-direct {p0, v3}, Lcom/huawei/health/suggestion/data/DataSyncService;->h(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 85
    goto :goto_1

    .line 87
    :pswitch_5
    invoke-direct {p0, v3}, Lcom/huawei/health/suggestion/data/DataSyncService;->g(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 88
    goto :goto_1

    .line 90
    :pswitch_6
    invoke-direct {p0, v3}, Lcom/huawei/health/suggestion/data/DataSyncService;->f(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 91
    goto :goto_1

    .line 93
    :pswitch_7
    invoke-direct {p0, v3}, Lcom/huawei/health/suggestion/data/DataSyncService;->i(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 94
    goto :goto_1

    .line 96
    :pswitch_8
    invoke-direct {p0, v3}, Lcom/huawei/health/suggestion/data/DataSyncService;->d(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 97
    goto :goto_1

    .line 100
    :goto_0
    invoke-direct {p0, v3}, Lcom/huawei/health/suggestion/data/DataSyncService;->e(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 101
    goto :goto_1

    .line 105
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/data/DataSyncService;->d()V

    .line 107
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method private a(Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 6

    .line 222
    const-string v0, "DataSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6570\u636e\u540c\u6b65 \u7528\u6237\u4e0b\u8f7d/\u4f7f\u7528\u953b\u70bc\u89c6\u9891\u4fe1\u606f\u4e0a\u62a5:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/DataSync;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->c(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 224
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    array-length v0, v5

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 225
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, v5, v1

    const/4 v2, 0x1

    aget-object v2, v5, v2

    const/4 v3, 0x2

    aget-object v3, v5, v3

    invoke-static {v3}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v3

    new-instance v4, Lcom/huawei/health/suggestion/data/DataSyncService$2;

    invoke-direct {v4, p0, p1}, Lcom/huawei/health/suggestion/data/DataSyncService$2;-><init>(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V

    invoke-interface {v0, v1, v2, v3, v4}, Lo/bsp;->a(Ljava/lang/String;Ljava/lang/String;ILo/bui;)V

    goto :goto_0

    .line 251
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/data/DataSyncService;->e(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 253
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/data/DataSyncService;->e(Lcom/huawei/health/suggestion/model/DataSync;)V

    return-void
.end method

.method private b(Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 4

    .line 186
    const-string v0, "DataSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6570\u636e\u540c\u6b65 \u66f4\u65b0\u8ba1\u5212\u8fdb\u5ea6:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/DataSync;->getValue()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/data/DataSyncService$3;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/suggestion/data/DataSyncService$3;-><init>(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->a(Ljava/lang/String;Lo/bui;)V

    .line 214
    return-void
.end method

.method private c(Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 5

    .line 145
    const-string v0, "DataSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6570\u636e\u540c\u6b65 \u66f4\u65b0\u8ba1\u5212\u540d\u79f0:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/DataSync;->getValue()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/DataSync;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->c(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 147
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    array-length v0, v4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 148
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, v4, v1

    const/4 v2, 0x1

    aget-object v2, v4, v2

    invoke-static {v2}, Lo/caj;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/suggestion/data/DataSyncService$5;

    invoke-direct {v3, p0, p1}, Lcom/huawei/health/suggestion/data/DataSyncService$5;-><init>(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->b(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    goto :goto_0

    .line 176
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/data/DataSyncService;->e(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 178
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 4

    .line 110
    const-string v0, "DataSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postDeleteRecordDelete enter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/DataSync;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    new-instance v2, Lcom/huawei/health/suggestion/data/DataSyncService$1;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/suggestion/data/DataSyncService$1;-><init>(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v2}, Lo/brz;->a(IILo/bsr;)V

    .line 124
    return-void
.end method

.method private e(Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 1

    .line 134
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/bsp;->e(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 136
    invoke-direct {p0}, Lcom/huawei/health/suggestion/data/DataSyncService;->a()V

    .line 137
    return-void
.end method

.method private f(Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 4

    .line 365
    const-string v0, "DataSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6570\u636e\u540c\u6b65 \u4e0a\u4f20\u6536\u85cf\u8bb0\u5f55:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/DataSync;->getValue()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/data/DataSyncService$8;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/suggestion/data/DataSyncService$8;-><init>(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->b(Ljava/lang/String;Lo/bui;)V

    .line 394
    return-void
.end method

.method private g(Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 4

    .line 334
    const-string v0, "DataSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6570\u636e\u540c\u6b65 \u4e0a\u4f20\u5355\u52a8\u4f5c\u6700\u4f73\u8bb0\u5f55:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/DataSync;->getValue()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/data/DataSyncService$9;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/suggestion/data/DataSyncService$9;-><init>(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->k(Ljava/lang/String;Lo/bui;)V

    .line 362
    return-void
.end method

.method private h(Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 4

    .line 302
    const-string v0, "DataSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6570\u636e\u540c\u6b65 \u4e0a\u4f20\u6700\u4f73\u8bb0\u5f55:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/DataSync;->getValue()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/data/DataSyncService$10;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/suggestion/data/DataSyncService$10;-><init>(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->h(Ljava/lang/String;Lo/bui;)V

    .line 330
    return-void
.end method

.method private i(Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 4

    .line 397
    const-string v0, "DataSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6570\u636e\u540c\u6b65 \u4e0a\u4f20\u5220\u9664\u6536\u85cf\u8bb0\u5f55:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/DataSync;->getValue()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/data/DataSyncService$7;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/suggestion/data/DataSyncService$7;-><init>(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->f(Ljava/lang/String;Lo/bui;)V

    .line 425
    return-void
.end method

.method private k(Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 5

    .line 261
    const-string v0, "DataSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6570\u636e\u540c\u6b65 \u4e0a\u4f20\u8ba1\u5212\u63d0\u9192:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/DataSync;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->c(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 263
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    array-length v0, v4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 264
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, v4, v1

    const/4 v2, 0x1

    aget-object v2, v4, v2

    invoke-static {v2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v2

    new-instance v3, Lcom/huawei/health/suggestion/data/DataSyncService$4;

    invoke-direct {v3, p0, p1}, Lcom/huawei/health/suggestion/data/DataSyncService$4;-><init>(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->b(Ljava/lang/String;ILo/bui;)V

    goto :goto_0

    .line 292
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/data/DataSyncService;->e(Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 294
    :goto_0
    return-void
.end method


# virtual methods
.method public d()V
    .locals 5

    .line 447
    const-string v0, "DataSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7ed3\u675f\u540c\u6b65\u670d\u52a1-----------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService;->e:Landroid/os/IBinder;

    check-cast v0, Lcom/huawei/health/suggestion/data/DataSyncService$e;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DataSyncService$e;->d()Lcom/huawei/health/suggestion/data/DataSyncService$a;

    move-result-object v4

    .line 449
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 450
    invoke-interface {v4}, Lcom/huawei/health/suggestion/data/DataSyncService$a;->c()V

    .line 452
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/data/DataSyncService;->stopSelf()V

    .line 453
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 2

    .line 434
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService;->e:Landroid/os/IBinder;

    check-cast v0, Lcom/huawei/health/suggestion/data/DataSyncService$e;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DataSyncService$e;->d()Lcom/huawei/health/suggestion/data/DataSyncService$a;

    move-result-object v1

    .line 435
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 436
    invoke-interface {v1, p1, p2}, Lcom/huawei/health/suggestion/data/DataSyncService$a;->b(ILjava/lang/String;)V

    .line 437
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/data/DataSyncService;->stopSelf()V

    goto :goto_0

    .line 439
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/data/DataSyncService;->a()V

    .line 441
    :goto_0
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService;->e:Landroid/os/IBinder;

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 52
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 53
    const-string v0, "DataSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u542f\u52a8\u540c\u6b65\u670d\u52a1-----------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService;->d:J

    .line 55
    invoke-direct {p0}, Lcom/huawei/health/suggestion/data/DataSyncService;->a()V

    .line 56
    const-string v0, "DataSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u542f\u52a8\u540c\u6b65\u670d\u52a1-----------end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 472
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 473
    const-string v0, "DataSyncService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destory\u540c\u6b65\u670d\u52a1-----------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 474
    return-void
.end method
