.class public abstract Lo/flw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fmo;


# static fields
.field private static final h:Lo/fty;


# instance fields
.field protected final a:Lo/fmx;

.field protected b:Z

.field protected final c:Lo/fml;

.field protected final d:Lo/fmw;

.field protected final e:Lo/fom;

.field private final f:Lo/foj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 77
    const-class v0, Lo/flw;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/flw;->h:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/fmw;Lo/foj;Lo/fmx;Lo/fom;Lo/fml;)V
    .locals 2

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/flw;->b:Z

    .line 102
    if-nez p1, :cond_0

    .line 103
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Config must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 104
    :cond_0
    if-nez p2, :cond_1

    .line 105
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "NotificationListener must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 106
    :cond_1
    if-nez p3, :cond_2

    .line 107
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "TokenGenerator must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 108
    :cond_2
    if-nez p5, :cond_3

    .line 109
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "MessageExchangeStore must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_3
    if-nez p4, :cond_4

    .line 111
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "ObservationStore must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 113
    :cond_4
    iput-object p1, p0, Lo/flw;->d:Lo/fmw;

    .line 114
    iput-object p2, p0, Lo/flw;->f:Lo/foj;

    .line 115
    iput-object p5, p0, Lo/flw;->c:Lo/fml;

    .line 116
    iput-object p4, p0, Lo/flw;->e:Lo/fom;

    .line 117
    iput-object p3, p0, Lo/flw;->a:Lo/fmx;

    .line 119
    return-void
.end method

.method static synthetic b()Lo/fty;
    .locals 1

    .line 75
    sget-object v0, Lo/flw;->h:Lo/fty;

    return-object v0
.end method

.method static synthetic c(Lo/flw;)Lo/foj;
    .locals 1

    .line 75
    iget-object v0, p0, Lo/flw;->f:Lo/foj;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 146
    return-void
.end method

.method protected final c(Lo/fly;)Lo/fmb;
    .locals 6

    .line 198
    const/4 v2, 0x0

    .line 199
    invoke-virtual {p1}, Lo/fly;->F()Lo/flj$b;

    move-result-object v0

    invoke-static {v0}, Lo/flj$b;->a(Lo/flj$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/fly;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 200
    :cond_0
    invoke-virtual {p1}, Lo/fly;->k()Lo/flz;

    move-result-object v3

    .line 202
    iget-object v0, p0, Lo/flw;->e:Lo/fom;

    invoke-interface {v0, v3}, Lo/fom;->e(Lo/flz;)Lo/fok;

    move-result-object v4

    .line 203
    if-eqz v4, :cond_1

    .line 208
    invoke-virtual {v4}, Lo/fok;->d()Lo/fma;

    move-result-object v5

    .line 209
    new-instance v2, Lo/fmb;

    sget-object v0, Lo/fmb$b;->e:Lo/fmb$b;

    invoke-virtual {v4}, Lo/fok;->b()Lo/fow;

    move-result-object v1

    invoke-direct {v2, v5, v0, v1}, Lo/fmb;-><init>(Lo/fma;Lo/fmb$b;Lo/fow;)V

    .line 210
    invoke-virtual {v2, v5}, Lo/fmb;->d(Lo/fma;)V

    .line 211
    sget-object v0, Lo/flw;->h:Lo/fty;

    const-string v1, "re-created exchange from original observe request: {}"

    invoke-interface {v0, v1, v5}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 212
    new-instance v0, Lo/flw$3;

    invoke-direct {v0, p0, v5, v3}, Lo/flw$3;-><init>(Lo/flw;Lo/fma;Lo/flz;)V

    invoke-virtual {v5, v0}, Lo/fma;->c(Lo/fls;)V

    .line 255
    :cond_1
    return-object v2
.end method

.method public declared-synchronized c()V
    .locals 2

    monitor-enter p0

    .line 131
    :try_start_0
    iget-boolean v0, p0, Lo/flw;->b:Z

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lo/flw;->c:Lo/fml;

    invoke-interface {v0}, Lo/fml;->d()V

    .line 133
    invoke-virtual {p0}, Lo/flw;->a()V

    .line 134
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/flw;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized d()V
    .locals 2

    monitor-enter p0

    .line 123
    :try_start_0
    iget-boolean v0, p0, Lo/flw;->b:Z

    if-nez v0, :cond_0

    .line 124
    iget-object v0, p0, Lo/flw;->c:Lo/fml;

    invoke-interface {v0}, Lo/fml;->b()V

    .line 125
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/flw;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method protected final d(Lo/fma;)V
    .locals 4

    .line 159
    invoke-virtual {p1}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->I()Lo/fll;

    move-result-object v0

    invoke-virtual {v0}, Lo/fll;->b()I

    move-result v0

    if-nez v0, :cond_3

    .line 162
    :cond_0
    sget-object v0, Lo/flw;->h:Lo/fty;

    const-string v1, "registering observe request {}"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 163
    invoke-virtual {p1}, Lo/fma;->k()Lo/flz;

    move-result-object v3

    .line 164
    if-nez v3, :cond_2

    .line 166
    :cond_1
    iget-object v0, p0, Lo/flw;->a:Lo/fmx;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/fmx;->c(Z)Lo/flz;

    move-result-object v3

    .line 167
    invoke-virtual {p1, v3}, Lo/fma;->e(Lo/flz;)Lo/flq;

    .line 168
    iget-object v0, p0, Lo/flw;->e:Lo/fom;

    new-instance v1, Lo/fok;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lo/fok;-><init>(Lo/fma;Lo/fow;)V

    invoke-interface {v0, v3, v1}, Lo/fom;->a(Lo/flz;Lo/fok;)Lo/fok;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 170
    :cond_2
    iget-object v0, p0, Lo/flw;->e:Lo/fom;

    new-instance v1, Lo/fok;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lo/fok;-><init>(Lo/fma;Lo/fow;)V

    invoke-interface {v0, v3, v1}, Lo/fom;->e(Lo/flz;Lo/fok;)Lo/fok;

    .line 173
    :goto_0
    new-instance v0, Lo/flw$4;

    invoke-direct {v0, p0, p1}, Lo/flw$4;-><init>(Lo/flw;Lo/fma;)V

    invoke-virtual {p1, v0}, Lo/fma;->c(Lo/fls;)V

    .line 186
    :cond_3
    return-void
.end method
