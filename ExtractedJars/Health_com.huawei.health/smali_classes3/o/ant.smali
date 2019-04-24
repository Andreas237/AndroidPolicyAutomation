.class public Lo/ant;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/ant;

.field private static d:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 108
    const/4 v0, 0x0

    sput-object v0, Lo/ant;->a:Lo/ant;

    return-void
.end method

.method private constructor <init>(J)V
    .locals 2

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    invoke-static {p1, p2}, Lo/ant;->a(J)V

    .line 124
    invoke-static {}, Lo/bch;->a()Lo/bch;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bch;->b(Landroid/content/Context;)V

    .line 125
    return-void
.end method

.method public static declared-synchronized a()Lo/ant;
    .locals 5

    const-class v4, Lo/ant;

    monitor-enter v4

    .line 112
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dbf;->k(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    .line 114
    sget-wide v0, Lo/ant;->d:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 115
    new-instance v0, Lo/ant;

    invoke-direct {v0, v2, v3}, Lo/ant;-><init>(J)V

    sput-object v0, Lo/ant;->a:Lo/ant;

    goto :goto_0

    .line 116
    :cond_0
    sget-object v0, Lo/ant;->a:Lo/ant;

    if-nez v0, :cond_1

    .line 117
    new-instance v0, Lo/ant;

    invoke-direct {v0, v2, v3}, Lo/ant;-><init>(J)V

    sput-object v0, Lo/ant;->a:Lo/ant;

    .line 119
    :cond_1
    :goto_0
    sget-object v0, Lo/ant;->a:Lo/ant;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v4

    throw v2
.end method

.method public static a(J)V
    .locals 0

    .line 90
    sput-wide p0, Lo/ant;->d:J

    .line 91
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/group/Group;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 328
    new-instance v0, Lo/asv;

    new-instance v1, Lo/ant$5;

    invoke-direct {v1, p0, p3}, Lo/ant$5;-><init>(Lo/ant;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-direct {v0, v1}, Lo/asv;-><init>(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 334
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/asv;->b(Landroid/content/Context;Lcom/huawei/health/sns/model/group/Group;Z)V

    .line 335
    return-void
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;)V
    .locals 2

    .line 300
    new-instance v1, Lo/atm;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lo/atm;-><init>(Landroid/os/Handler;)V

    .line 301
    invoke-virtual {v1, p1}, Lo/atm;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 302
    const/4 v0, 0x0

    invoke-virtual {v1, v0, p2}, Lo/atm;->e(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 303
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 4

    .line 257
    new-instance v3, Lo/ant$4;

    invoke-direct {v3, p0, p1}, Lo/ant$4;-><init>(Lo/ant;Lcom/huawei/health/sns/model/user/UserNotify;)V

    .line 284
    const-string v0, "from android"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, p1, v3, v2, v0}, Lo/awx;->d(Landroid/content/Context;Lo/bfh;Lo/awx$c;Lo/awx$a;Ljava/lang/String;)V

    .line 285
    return-void
.end method
