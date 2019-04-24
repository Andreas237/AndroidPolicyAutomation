.class public Lo/azx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/azx;


# instance fields
.field private a:J

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const/4 v0, 0x0

    sput-object v0, Lo/azx;->c:Lo/azx;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lo/azx;->d:I

    return-void
.end method

.method private static b()Lo/aoo;
    .locals 1

    .line 121
    new-instance v0, Lo/azx$4;

    invoke-direct {v0}, Lo/azx$4;-><init>()V

    return-object v0
.end method

.method private c()Z
    .locals 8

    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 99
    iget-wide v0, p0, Lo/azx;->a:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x3e8

    div-long v6, v0, v2

    .line 102
    const-wide/16 v0, 0x12c

    cmp-long v0, v6, v0

    if-lez v0, :cond_0

    .line 104
    const/4 v0, 0x0

    iput v0, p0, Lo/azx;->d:I

    .line 105
    iput-wide v4, p0, Lo/azx;->a:J

    .line 106
    const/4 v0, 0x1

    return v0

    .line 110
    :cond_0
    iget v0, p0, Lo/azx;->d:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 112
    const/4 v0, 0x0

    return v0

    .line 114
    :cond_1
    iget v0, p0, Lo/azx;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/azx;->d:I

    .line 116
    const/4 v0, 0x1

    return v0
.end method

.method public static declared-synchronized e()Lo/azx;
    .locals 3

    const-class v1, Lo/azx;

    monitor-enter v1

    .line 60
    :try_start_0
    sget-object v0, Lo/azx;->c:Lo/azx;

    if-nez v0, :cond_0

    .line 62
    new-instance v0, Lo/azx;

    invoke-direct {v0}, Lo/azx;-><init>()V

    sput-object v0, Lo/azx;->c:Lo/azx;

    .line 64
    :cond_0
    sget-object v0, Lo/azx;->c:Lo/azx;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public d()V
    .locals 4

    .line 72
    invoke-static {}, Lo/aza;->b()Lo/aza;

    move-result-object v0

    invoke-virtual {v0}, Lo/aza;->c()Landroid/app/Activity;

    move-result-object v3

    .line 73
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 75
    const-string v0, "LoginHelper"

    const-string v1, "callLoginHwAccount() no ForegroundActivity when login hwAccount!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    return-void

    .line 79
    :cond_0
    invoke-direct {p0}, Lo/azx;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 81
    const-string v0, "LoginHelper"

    const-string v1, "callLoginHwAccount() call HwAccount loginView"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    invoke-static {}, Lo/aor;->d()Lo/aor;

    move-result-object v0

    invoke-static {}, Lo/azx;->b()Lo/aoo;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v1, v2}, Lo/aor;->d(Landroid/app/Activity;Lo/aoo;Z)V

    goto :goto_0

    .line 87
    :cond_1
    const-string v0, "LoginHelper"

    const-string v1, "do not allow to call HwAccount(5 minutes allow 3 retry times)"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    :goto_0
    return-void
.end method
