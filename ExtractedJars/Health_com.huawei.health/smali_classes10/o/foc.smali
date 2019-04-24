.class public Lo/foc;
.super Lo/fnl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/foc$c;
    }
.end annotation


# static fields
.field private static final e:Lo/fty;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    const-class v0, Lo/foc;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/foc;->e:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/fmw;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lo/fnl;-><init>()V

    .line 61
    return-void
.end method

.method static synthetic b(Lo/foc;Lo/fmb;Lo/fly;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Lo/foc;->c(Lo/fmb;Lo/fly;)V

    return-void
.end method

.method private c(Lo/fmb;Lo/fly;)V
    .locals 1

    .line 178
    new-instance v0, Lo/foc$c;

    invoke-direct {v0, p0, p1, p2}, Lo/foc$c;-><init>(Lo/foc;Lo/fmb;Lo/fly;)V

    invoke-virtual {p2, v0}, Lo/fly;->c(Lo/fls;)V

    .line 179
    return-void
.end method

.method static synthetic c(Lo/foc;Lo/fmb;Lo/fly;)V
    .locals 0

    .line 50
    invoke-super {p0, p1, p2}, Lo/fnl;->a(Lo/fmb;Lo/fly;)V

    return-void
.end method

.method private static d(Lo/fly;)Z
    .locals 5

    .line 140
    invoke-virtual {p0}, Lo/fly;->b()Lo/flj$e;

    move-result-object v1

    .line 141
    invoke-virtual {p0}, Lo/fly;->t()Z

    move-result v2

    .line 142
    invoke-virtual {p0}, Lo/fly;->v()Z

    move-result v3

    .line 143
    sget-object v0, Lo/flj$e;->c:Lo/flj$e;

    if-ne v1, v0, :cond_0

    if-nez v2, :cond_0

    if-nez v3, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 144
    :goto_0
    return v4
.end method

.method static synthetic e()Lo/fty;
    .locals 1

    .line 50
    sget-object v0, Lo/foc;->e:Lo/fty;

    return-object v0
.end method

.method static synthetic e(Lo/foc;Lo/fmb;Lo/fly;)V
    .locals 0

    .line 50
    invoke-super {p0, p1, p2}, Lo/fnl;->a(Lo/fmb;Lo/fly;)V

    return-void
.end method


# virtual methods
.method public a(Lo/fmb;Lo/fly;)V
    .locals 7

    .line 66
    invoke-virtual {p1}, Lo/fmb;->t()Lo/foo;

    move-result-object v3

    .line 67
    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lo/foo;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 69
    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->t()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->e:Lo/flj$e;

    if-ne v0, v1, :cond_3

    .line 71
    :cond_0
    invoke-virtual {p2}, Lo/fly;->F()Lo/flj$b;

    move-result-object v0

    invoke-static {v0}, Lo/flj$b;->a(Lo/flj$b;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 72
    sget-object v0, Lo/foc;->e:Lo/fty;

    const-string v1, "response has error code {} and must be sent as CON"

    invoke-virtual {p2}, Lo/fly;->F()Lo/flj$b;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 73
    sget-object v0, Lo/flj$e;->c:Lo/flj$e;

    invoke-virtual {p2, v0}, Lo/fly;->d(Lo/flj$e;)Lo/flq;

    .line 74
    invoke-virtual {v3}, Lo/foo;->c()V

    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {v3}, Lo/foo;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 78
    sget-object v0, Lo/foc;->e:Lo/fty;

    const-string v1, "observe relation check requires the notification to be sent as CON"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 79
    sget-object v0, Lo/flj$e;->c:Lo/flj$e;

    invoke-virtual {p2, v0}, Lo/fly;->d(Lo/flj$e;)Lo/flq;

    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    if-nez v0, :cond_3

    .line 84
    sget-object v0, Lo/flj$e;->e:Lo/flj$e;

    invoke-virtual {p2, v0}, Lo/fly;->d(Lo/flj$e;)Lo/flq;

    .line 91
    :cond_3
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/fly;->k(Z)V

    .line 102
    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    if-ne v0, v1, :cond_4

    .line 103
    invoke-direct {p0, p1, p2}, Lo/foc;->c(Lo/fmb;Lo/fly;)V

    .line 109
    :cond_4
    move-object v4, p1

    monitor-enter v4

    .line 110
    :try_start_0
    invoke-virtual {v3}, Lo/foo;->f()Lo/fly;

    move-result-object v5

    .line 111
    if-eqz v5, :cond_5

    invoke-static {v5}, Lo/foc;->d(Lo/fly;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 112
    sget-object v0, Lo/foc;->e:Lo/fty;

    const-string v1, "a former notification is still in transit. Postponing {}"

    invoke-interface {v0, v1, p2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 113
    invoke-virtual {v3, p2}, Lo/foo;->b(Lo/fly;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    monitor-exit v4

    return-void

    .line 117
    :cond_5
    :try_start_1
    invoke-virtual {v3, p2}, Lo/foo;->d(Lo/fly;)V

    .line 118
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/foo;->b(Lo/fly;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 126
    :goto_1
    invoke-virtual {p2}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->e:Lo/flj$e;

    if-ne v0, v1, :cond_6

    .line 127
    invoke-virtual {v3, p2}, Lo/foo;->c(Lo/fly;)V

    .line 131
    :cond_6
    invoke-virtual {p0}, Lo/foc;->b()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->a(Lo/fmb;Lo/fly;)V

    .line 132
    return-void
.end method

.method public d(Lo/fmb;Lo/flo;)V
    .locals 3

    .line 166
    invoke-virtual {p2}, Lo/flo;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->b:Lo/flj$e;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lo/fmb;->a()Lo/fmb$b;

    move-result-object v0

    sget-object v1, Lo/fmb$b;->b:Lo/fmb$b;

    if-ne v0, v1, :cond_0

    .line 168
    invoke-virtual {p1}, Lo/fmb;->t()Lo/foo;

    move-result-object v2

    .line 169
    if-eqz v2, :cond_0

    .line 170
    invoke-virtual {v2}, Lo/foo;->c()V

    .line 174
    :cond_0
    invoke-virtual {p0}, Lo/foc;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->d(Lo/fmb;Lo/flo;)V

    .line 175
    return-void
.end method

.method public d(Lo/fmb;Lo/fly;)V
    .locals 3

    .line 150
    invoke-virtual {p2}, Lo/fly;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/fmb;->c()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    sget-object v0, Lo/foc;->e:Lo/fty;

    const-string v1, "rejecting notification for canceled Exchange"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 153
    invoke-static {p2}, Lo/flo;->d(Lo/flq;)Lo/flo;

    move-result-object v2

    .line 154
    invoke-virtual {p0, p1, v2}, Lo/foc;->c(Lo/fmb;Lo/flo;)V

    .line 156
    goto :goto_0

    .line 158
    :cond_0
    invoke-virtual {p0}, Lo/foc;->c()Lo/fod;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/fod;->d(Lo/fmb;Lo/fly;)V

    .line 160
    :goto_0
    return-void
.end method
