.class public final Lo/bch;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/bch;


# instance fields
.field private a:Z

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 74
    invoke-static {}, Lo/aoa;->e()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpf;->c(Landroid/content/Context;)V

    .line 75
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bch;->c:Z

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bch;->a:Z

    .line 55
    return-void
.end method

.method public static declared-synchronized a()Lo/bch;
    .locals 3

    const-class v1, Lo/bch;

    monitor-enter v1

    .line 64
    :try_start_0
    sget-object v0, Lo/bch;->e:Lo/bch;

    if-nez v0, :cond_0

    .line 66
    new-instance v0, Lo/bch;

    invoke-direct {v0}, Lo/bch;-><init>()V

    sput-object v0, Lo/bch;->e:Lo/bch;

    .line 68
    :cond_0
    sget-object v0, Lo/bch;->e:Lo/bch;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private a(Landroid/content/Context;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 92
    new-instance v0, Lo/bch$5;

    invoke-direct {v0, p0, p1}, Lo/bch$5;-><init>(Lo/bch;Landroid/content/Context;)V

    return-object v0
.end method

.method private c(Landroid/content/Context;)V
    .locals 4

    .line 122
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 124
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->b()Lo/axr;

    move-result-object v2

    .line 125
    if-nez v2, :cond_0

    .line 127
    const-string v0, "SNSContext"

    const-string v1, "accountInfo is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    return-void

    .line 131
    :cond_0
    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {v0}, Lo/awn;->d()V

    .line 133
    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {v2}, Lo/axr;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/awn;->d(I)Z

    move-result v3

    .line 135
    if-nez v3, :cond_1

    .line 137
    const-string v0, "SNSContext"

    const-string v1, "sns not available."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    return-void

    .line 141
    :cond_1
    iget-boolean v0, p0, Lo/bch;->c:Z

    if-eqz v0, :cond_2

    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {v0}, Lo/ave;->d()Z

    move-result v0

    if-nez v0, :cond_3

    .line 143
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bch;->c:Z

    .line 145
    invoke-static {}, Lo/avf;->a()V

    .line 148
    :cond_3
    iget-boolean v0, p0, Lo/bch;->a:Z

    if-nez v0, :cond_4

    .line 150
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bch;->a:Z

    .line 153
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0}, Lo/apm;->e()Z

    .line 155
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->h()V

    .line 157
    invoke-static {}, Lo/bcf;->c()Lo/bcf;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcf;->d()V

    .line 159
    invoke-static {}, Lo/bcf;->c()Lo/bcf;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcf;->b()V

    .line 161
    invoke-static {}, Lo/asj;->a()Lo/asj;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/asj;->c(Landroid/content/Context;)Z

    .line 163
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->h()V

    .line 165
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->l()V

    .line 167
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcb;->d()V

    .line 169
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->b()V

    .line 171
    new-instance v0, Lo/awi;

    invoke-direct {v0}, Lo/awi;-><init>()V

    invoke-virtual {v0}, Lo/awi;->e()Z

    .line 172
    const-string v0, "SNSContext"

    const-string v1, "asyncInit"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    :cond_4
    return-void
.end method

.method static synthetic d(Lo/bch;Landroid/content/Context;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lo/bch;->c(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 110
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bch;->a:Z

    .line 111
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bch;->c:Z

    .line 112
    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 2

    .line 84
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1}, Lo/bch;->a(Landroid/content/Context;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 85
    return-void
.end method
