.class public Lcom/yandex/metrica/impl/ob/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/af;
.implements Lcom/yandex/metrica/impl/ob/er;
.implements Lcom/yandex/metrica/impl/ob/kp;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C:",
        "Lcom/yandex/metrica/impl/ob/aw;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/af<",
        "TC;>;",
        "Lcom/yandex/metrica/impl/ob/er;",
        "Lcom/yandex/metrica/impl/ob/kp;"
    }
.end annotation


# instance fields
.field private a:Z

.field private final b:Landroid/os/HandlerThread;

.field private final c:Landroid/os/Handler;

.field private final d:Landroid/content/Context;

.field private final e:Lcom/yandex/metrica/impl/ob/y;

.field private f:Lcom/yandex/metrica/impl/ob/fh;

.field private g:Lcom/yandex/metrica/impl/ob/fj;

.field private h:Lcom/yandex/metrica/impl/ob/ff;

.field private i:Lcom/yandex/metrica/impl/be;

.field private j:Lcom/yandex/metrica/impl/ob/es;

.field private k:Lcom/yandex/metrica/impl/ob/bf;

.field private final l:Lcom/yandex/metrica/impl/ob/bc;

.field private m:Lcom/yandex/metrica/impl/a;

.field private n:Lcom/yandex/metrica/impl/ob/v;

.field private o:Lcom/yandex/metrica/impl/ob/mn;

.field private p:J

.field private q:J

.field private r:I

.field private s:I

.field private volatile t:Lcom/yandex/metrica/impl/ob/dn;

.field private final u:Lcom/yandex/metrica/impl/ob/lv;

.field private final v:Lcom/yandex/metrica/impl/ob/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/z<",
            "TC;>;"
        }
    .end annotation
.end field

.field private w:Lcom/yandex/metrica/impl/ob/kk;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private x:Lcom/yandex/metrica/impl/ob/kt;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private y:Lcom/yandex/metrica/impl/ob/ak;

.field private z:Lcom/yandex/metrica/impl/ob/da;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/kk;Lcom/yandex/metrica/impl/ob/y;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/v;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/kk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/y;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/v;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 114
    new-instance v6, Lcom/yandex/metrica/impl/ob/mn;

    invoke-direct {v6, p1}, Lcom/yandex/metrica/impl/ob/mn;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/yandex/metrica/impl/ob/ab;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/kk;Lcom/yandex/metrica/impl/ob/y;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/v;Lcom/yandex/metrica/impl/ob/mn;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/kk;Lcom/yandex/metrica/impl/ob/y;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/v;Lcom/yandex/metrica/impl/ob/mn;)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/kk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/y;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/yandex/metrica/impl/ob/v;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ab;->a:Z

    .line 93
    new-instance v1, Lcom/yandex/metrica/impl/ob/lv;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/lv;-><init>()V

    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->u:Lcom/yandex/metrica/impl/ob/lv;

    .line 95
    new-instance v1, Lcom/yandex/metrica/impl/ob/z;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/z;-><init>()V

    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->v:Lcom/yandex/metrica/impl/ob/z;

    .line 132
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->d:Landroid/content/Context;

    .line 133
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/ab;->e:Lcom/yandex/metrica/impl/ob/y;

    .line 134
    iput-object p6, p0, Lcom/yandex/metrica/impl/ob/ab;->o:Lcom/yandex/metrica/impl/ob/mn;

    .line 1233
    iget-object p6, p0, Lcom/yandex/metrica/impl/ob/ab;->d:Landroid/content/Context;

    .line 1234
    invoke-static {p6}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object p6

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->e:Lcom/yandex/metrica/impl/ob/y;

    invoke-virtual {p6, v1}, Lcom/yandex/metrica/impl/ob/eu;->b(Lcom/yandex/metrica/impl/ob/y;)Lcom/yandex/metrica/impl/ob/ev;

    move-result-object p6

    .line 1235
    new-instance v1, Lcom/yandex/metrica/impl/ob/fh;

    invoke-direct {v1, p6}, Lcom/yandex/metrica/impl/ob/fh;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    .line 1236
    new-instance v1, Lcom/yandex/metrica/impl/ob/ff;

    invoke-direct {v1, p6}, Lcom/yandex/metrica/impl/ob/ff;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->h:Lcom/yandex/metrica/impl/ob/ff;

    .line 1228
    iget-object p6, p0, Lcom/yandex/metrica/impl/ob/ab;->d:Landroid/content/Context;

    invoke-static {p6}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object p6

    .line 1229
    new-instance v1, Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {p6}, Lcom/yandex/metrica/impl/ob/eu;->c()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object p6

    invoke-direct {v1, p6}, Lcom/yandex/metrica/impl/ob/fj;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->g:Lcom/yandex/metrica/impl/ob/fj;

    .line 138
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->w:Lcom/yandex/metrica/impl/ob/kk;

    .line 139
    monitor-enter p0

    .line 140
    :try_start_0
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->w:Lcom/yandex/metrica/impl/ob/kk;

    invoke-virtual {p2, p0, p4}, Lcom/yandex/metrica/impl/ob/kk;->d(Lcom/yandex/metrica/impl/ob/ae;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/kt;

    move-result-object p2

    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->x:Lcom/yandex/metrica/impl/ob/kt;

    .line 142
    new-instance p2, Lcom/yandex/metrica/impl/ob/ak;

    new-instance p6, Lcom/yandex/metrica/impl/ob/jv$b;

    invoke-direct {p6, p0}, Lcom/yandex/metrica/impl/ob/jv$b;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->x:Lcom/yandex/metrica/impl/ob/kt;

    .line 144
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/kt;->f()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v1

    invoke-direct {p2, p6, v1, p4}, Lcom/yandex/metrica/impl/ob/ak;-><init>(Lcom/yandex/metrica/impl/ob/jv$b;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/t;)V

    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->y:Lcom/yandex/metrica/impl/ob/ak;

    .line 147
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1542
    invoke-static {}, Lcom/yandex/metrica/YandexMetrica;->getLibraryApiLevel()I

    move-result p2

    .line 1543
    iget-object p4, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    invoke-virtual {p4}, Lcom/yandex/metrica/impl/ob/fh;->d()J

    move-result-wide v1

    int-to-long v3, p2

    cmp-long p2, v1, v3

    if-gez p2, :cond_0

    .line 1544
    new-instance p2, Lcom/yandex/metrica/impl/ob/hx;

    .line 1545
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->C()Lcom/yandex/metrica/impl/ob/hy;

    move-result-object p4

    invoke-direct {p2, p4}, Lcom/yandex/metrica/impl/ob/hx;-><init>(Lcom/yandex/metrica/impl/ob/hy;)V

    .line 1546
    new-instance p4, Lcom/yandex/metrica/impl/ob/aa;

    invoke-direct {p4, p0, p2}, Lcom/yandex/metrica/impl/ob/aa;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/hx;)V

    invoke-virtual {p4}, Lcom/yandex/metrica/impl/ob/aa;->a()V

    .line 1547
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    invoke-virtual {p2, v3, v4}, Lcom/yandex/metrica/impl/ob/fh;->e(J)Lcom/yandex/metrica/impl/ob/fh;

    move-result-object p2

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/fh;->i()V

    .line 151
    :cond_0
    new-instance p2, Lcom/yandex/metrica/impl/ob/es;

    iget-object p4, p0, Lcom/yandex/metrica/impl/ob/ab;->d:Landroid/content/Context;

    .line 152
    invoke-static {p4}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object p4

    iget-object p6, p0, Lcom/yandex/metrica/impl/ob/ab;->e:Lcom/yandex/metrica/impl/ob/y;

    invoke-virtual {p4, p6}, Lcom/yandex/metrica/impl/ob/eu;->a(Lcom/yandex/metrica/impl/ob/y;)Lcom/yandex/metrica/impl/ob/et;

    move-result-object p4

    invoke-direct {p2, p0, p4}, Lcom/yandex/metrica/impl/ob/es;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/et;)V

    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->j:Lcom/yandex/metrica/impl/ob/es;

    .line 154
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    const-wide/16 v1, 0x0

    invoke-virtual {p2, v1, v2}, Lcom/yandex/metrica/impl/ob/fh;->a(J)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/yandex/metrica/impl/ob/ab;->p:J

    .line 155
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    .line 156
    invoke-virtual {p2, v1, v2}, Lcom/yandex/metrica/impl/ob/fh;->b(J)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/yandex/metrica/impl/ob/ab;->q:J

    .line 157
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    const/4 p4, -0x1

    invoke-virtual {p2, p4}, Lcom/yandex/metrica/impl/ob/fh;->a(I)I

    move-result p2

    iput p2, p0, Lcom/yandex/metrica/impl/ob/ab;->r:I

    .line 158
    invoke-virtual {p3}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/yandex/metrica/impl/br;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/yandex/metrica/impl/ob/ab;->s:I

    .line 160
    new-instance p1, Lcom/yandex/metrica/impl/ob/dn;

    new-instance p2, Lcom/yandex/metrica/impl/ob/ab$1;

    invoke-direct {p2, p0}, Lcom/yandex/metrica/impl/ob/ab$1;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    invoke-direct {p1, p0, p2}, Lcom/yandex/metrica/impl/ob/dn;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/dn$a;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->t:Lcom/yandex/metrica/impl/ob/dn;

    .line 166
    iput-object p5, p0, Lcom/yandex/metrica/impl/ob/ab;->n:Lcom/yandex/metrica/impl/ob/v;

    .line 167
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->n:Lcom/yandex/metrica/impl/ob/v;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    invoke-virtual {p1, p0, p2}, Lcom/yandex/metrica/impl/ob/v;->a(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/fh;)Lcom/yandex/metrica/impl/a;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->m:Lcom/yandex/metrica/impl/a;

    .line 168
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->o()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/lv;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 169
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->o()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object p1

    const-string p2, "Read app environment for component %s. Value: %s"

    const/4 p4, 0x2

    new-array p4, p4, [Ljava/lang/Object;

    iget-object p5, p0, Lcom/yandex/metrica/impl/ob/ab;->e:Lcom/yandex/metrica/impl/ob/y;

    invoke-virtual {p5}, Lcom/yandex/metrica/impl/ob/y;->toString()Ljava/lang/String;

    move-result-object p5

    aput-object p5, p4, v0

    const/4 p5, 0x1

    iget-object p6, p0, Lcom/yandex/metrica/impl/ob/ab;->m:Lcom/yandex/metrica/impl/a;

    .line 170
    invoke-virtual {p6}, Lcom/yandex/metrica/impl/a;->b()Lcom/yandex/metrica/impl/a$a;

    move-result-object p6

    iget-object p6, p6, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    aput-object p6, p4, p5

    .line 169
    invoke-virtual {p1, p2, p4}, Lcom/yandex/metrica/impl/ob/lv;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    :cond_1
    new-instance p1, Lcom/yandex/metrica/impl/ob/da;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->d:Landroid/content/Context;

    iget-object p4, p0, Lcom/yandex/metrica/impl/ob/ab;->e:Lcom/yandex/metrica/impl/ob/y;

    iget p5, p0, Lcom/yandex/metrica/impl/ob/ab;->s:I

    invoke-direct {p1, p2, p4, p5}, Lcom/yandex/metrica/impl/ob/da;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/y;I)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->z:Lcom/yandex/metrica/impl/ob/da;

    .line 179
    invoke-virtual {p3}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/lt;->b(Ljava/lang/String;)Landroid/os/HandlerThread;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->b:Landroid/os/HandlerThread;

    .line 180
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->b:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->start()V

    .line 181
    new-instance p1, Landroid/os/Handler;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->b:Landroid/os/HandlerThread;

    invoke-virtual {p2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->c:Landroid/os/Handler;

    .line 183
    new-instance p1, Lcom/yandex/metrica/impl/be;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->w:Lcom/yandex/metrica/impl/ob/kk;

    invoke-direct {p1, p0, p2}, Lcom/yandex/metrica/impl/be;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/kk;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->i:Lcom/yandex/metrica/impl/be;

    .line 184
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->j:Lcom/yandex/metrica/impl/ob/es;

    invoke-virtual {p1, p0}, Lcom/yandex/metrica/impl/ob/es;->a(Lcom/yandex/metrica/impl/ob/er;)V

    .line 186
    new-instance p1, Lcom/yandex/metrica/impl/ob/bc;

    invoke-direct {p1, p0}, Lcom/yandex/metrica/impl/ob/bc;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->l:Lcom/yandex/metrica/impl/ob/bc;

    .line 187
    new-instance p1, Lcom/yandex/metrica/impl/ob/bf;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ab;->l:Lcom/yandex/metrica/impl/ob/bc;

    invoke-direct {p1, p2}, Lcom/yandex/metrica/impl/ob/bf;-><init>(Lcom/yandex/metrica/impl/ob/be;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->k:Lcom/yandex/metrica/impl/ob/bf;

    return-void

    :catchall_0
    move-exception p1

    .line 147
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private I()V
    .locals 4

    .line 4028
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 450
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/ab;->q:J

    .line 451
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/ab;->q:J

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fh;->d(J)Lcom/yandex/metrica/impl/ob/fh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fh;->i()V

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 487
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 488
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jv;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 489
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jv;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public B()Lcom/yandex/metrica/impl/ob/ff;
    .locals 1

    .line 493
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->h:Lcom/yandex/metrica/impl/ob/ff;

    return-object v0
.end method

.method public final C()Lcom/yandex/metrica/impl/ob/hy;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 498
    new-instance v0, Lcom/yandex/metrica/impl/ob/hy;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ab;->e:Lcom/yandex/metrica/impl/ob/y;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/y;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/hy;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method public D()Lcom/yandex/metrica/impl/ob/fh;
    .locals 1

    .line 502
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    return-object v0
.end method

.method public E()Z
    .locals 3

    .line 6519
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->g:Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fj;->a()Lcom/yandex/metrica/CounterConfiguration$a;

    move-result-object v0

    .line 6523
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/fh;->c()Lcom/yandex/metrica/CounterConfiguration$a;

    move-result-object v1

    .line 509
    sget-object v2, Lcom/yandex/metrica/CounterConfiguration$a;->c:Lcom/yandex/metrica/CounterConfiguration$a;

    if-ne v0, v2, :cond_0

    sget-object v0, Lcom/yandex/metrica/CounterConfiguration$a;->c:Lcom/yandex/metrica/CounterConfiguration$a;

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public F()Z
    .locals 4

    .line 527
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->h:Lcom/yandex/metrica/impl/ob/ff;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ff;->b(Z)Z

    move-result v0

    .line 528
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ab;->y:Lcom/yandex/metrica/impl/ob/ak;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ak;->c()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v2

    iget-boolean v2, v2, Lcom/yandex/metrica/impl/ob/ks;->q:Z

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    return v3

    :cond_1
    return v1
.end method

.method public G()Lcom/yandex/metrica/impl/ob/fh;
    .locals 1

    .line 575
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    return-object v0
.end method

.method public H()Lcom/yandex/metrica/impl/ob/da;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 637
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->z:Lcom/yandex/metrica/impl/ob/da;

    return-object v0
.end method

.method public a()Lcom/yandex/metrica/impl/ob/t;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 335
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->y:Lcom/yandex/metrica/impl/ob/ak;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ak;->a()Lcom/yandex/metrica/impl/ob/t;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/yandex/metrica/CounterConfiguration$a;)V
    .locals 2

    .line 367
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/fh;->a(Lcom/yandex/metrica/CounterConfiguration$a;)Lcom/yandex/metrica/impl/ob/fh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fh;->i()V

    .line 2386
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 2387
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->e:Lcom/yandex/metrica/impl/ob/y;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object v1

    .line 2389
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 369
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->g:Lcom/yandex/metrica/impl/ob/fj;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/fj;->a(Lcom/yandex/metrica/CounterConfiguration$a;)Lcom/yandex/metrica/impl/ob/fj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fj;->i()V

    :cond_0
    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/h;)V
    .locals 2

    .line 212
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->o()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lv;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->o()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v0

    const-string v1, "Event received on service"

    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/ob/lv;->a(Lcom/yandex/metrica/impl/h;Ljava/lang/String;)V

    .line 217
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->e:Lcom/yandex/metrica/impl/ob/y;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/y;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 222
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->k:Lcom/yandex/metrica/impl/ob/bf;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/bf;->b(Lcom/yandex/metrica/impl/h;)Z

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/do;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/do;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 254
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/ab;->b(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/do;)V

    return-void
.end method

.method public synthetic a(Lcom/yandex/metrica/impl/ob/ao;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ao;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 61
    check-cast p1, Lcom/yandex/metrica/impl/ob/aw;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/ab;->b(Lcom/yandex/metrica/impl/ob/aw;)V

    return-void
.end method

.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/aw;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/aw;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)V"
        }
    .end annotation

    monitor-enter p0

    .line 289
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->v:Lcom/yandex/metrica/impl/ob/z;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/z;->b(Lcom/yandex/metrica/impl/ob/ao;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 290
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 288
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/km;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/km;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    .line 350
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    .line 344
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->y:Lcom/yandex/metrica/impl/ob/ak;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ak;->a(Lcom/yandex/metrica/impl/ob/ks;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 346
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 343
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/t;)V
    .locals 1

    monitor-enter p0

    .line 270
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->y:Lcom/yandex/metrica/impl/ob/ak;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ak;->a(Lcom/yandex/metrica/impl/ob/t;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 271
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 269
    monitor-exit p0

    throw p1
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 432
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/fh;->b(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fh;->i()V

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 533
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/ab;->a:Z

    return-void
.end method

.method public b()Lcom/yandex/metrica/impl/ob/y;
    .locals 1

    .line 340
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->e:Lcom/yandex/metrica/impl/ob/y;

    return-object v0
.end method

.method public b(Lcom/yandex/metrica/impl/h;)V
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->t:Lcom/yandex/metrica/impl/ob/dn;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/dn;->b()Lcom/yandex/metrica/impl/ob/do;

    move-result-object v0

    .line 241
    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/ab;->b(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/do;)V

    return-void
.end method

.method b(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/do;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/do;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 259
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 260
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/h;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    .line 1628
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fh;->e()Ljava/lang/String;

    move-result-object v0

    .line 262
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/h;->d(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    .line 263
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->m:Lcom/yandex/metrica/impl/a;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/a;->b()Lcom/yandex/metrica/impl/a$a;

    move-result-object v0

    .line 264
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->o:Lcom/yandex/metrica/impl/ob/mn;

    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/ob/mn;->a(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/mm;

    move-result-object v1

    .line 265
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ab;->j:Lcom/yandex/metrica/impl/ob/es;

    invoke-interface {v1, p1}, Lcom/yandex/metrica/impl/ob/mm;->a(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/ml;

    move-result-object p1

    invoke-virtual {v2, p1, p2, v0}, Lcom/yandex/metrica/impl/ob/es;->a(Lcom/yandex/metrica/impl/ob/ml;Lcom/yandex/metrica/impl/ob/do;Lcom/yandex/metrica/impl/a$a;)V

    .line 266
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->i:Lcom/yandex/metrica/impl/be;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/be;->c()V

    return-void
.end method

.method public synthetic b(Lcom/yandex/metrica/impl/ob/ao;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ao;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 61
    check-cast p1, Lcom/yandex/metrica/impl/ob/aw;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/ab;->a(Lcom/yandex/metrica/impl/ob/aw;)V

    return-void
.end method

.method public declared-synchronized b(Lcom/yandex/metrica/impl/ob/aw;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/aw;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)V"
        }
    .end annotation

    monitor-enter p0

    .line 293
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->v:Lcom/yandex/metrica/impl/ob/z;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/z;->a(Lcom/yandex/metrica/impl/ob/ao;)V

    .line 294
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->v:Lcom/yandex/metrica/impl/ob/z;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/z;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 295
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->i()V

    .line 296
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->w:Lcom/yandex/metrica/impl/ob/kk;

    invoke-virtual {p1, p0}, Lcom/yandex/metrica/impl/ob/kk;->a(Lcom/yandex/metrica/impl/ob/ae;)V

    .line 298
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->i:Lcom/yandex/metrica/impl/be;

    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/io/Closeable;)V

    .line 299
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->j:Lcom/yandex/metrica/impl/ob/es;

    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/io/Closeable;)V

    .line 301
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->c:Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 302
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->b:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->quit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 304
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 292
    monitor-exit p0

    throw p1
.end method

.method public b(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 632
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/fh;->e(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fh;->i()V

    return-void
.end method

.method public c()Landroid/content/Context;
    .locals 1

    .line 354
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->d:Landroid/content/Context;

    return-object v0
.end method

.method public c(Lcom/yandex/metrica/impl/h;)V
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->t:Lcom/yandex/metrica/impl/ob/dn;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/dn;->c(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/di;

    return-void
.end method

.method public d(Lcom/yandex/metrica/impl/h;)V
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->t:Lcom/yandex/metrica/impl/ob/dn;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/dn;->d(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/do;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/ab;->b(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/do;)V

    return-void
.end method

.method public declared-synchronized d()Z
    .locals 1

    monitor-enter p0

    .line 363
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->v:Lcom/yandex/metrica/impl/ob/z;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/z;->b()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/kp;
    .locals 0

    return-object p0
.end method

.method public e(Lcom/yandex/metrica/impl/h;)V
    .locals 1

    const/4 v0, 0x1

    .line 393
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/ab;->a(Z)V

    .line 394
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/ab;->d(Lcom/yandex/metrica/impl/h;)V

    .line 395
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->s()V

    return-void
.end method

.method public f()Lcom/yandex/metrica/impl/ob/dn;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->t:Lcom/yandex/metrica/impl/ob/dn;

    return-object v0
.end method

.method public f(Lcom/yandex/metrica/impl/h;)V
    .locals 0

    .line 399
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/ab;->d(Lcom/yandex/metrica/impl/h;)V

    .line 400
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/ab;->I()V

    return-void
.end method

.method protected g()Lcom/yandex/metrica/impl/ob/bc;
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->l:Lcom/yandex/metrica/impl/ob/bc;

    return-object v0
.end method

.method public g(Lcom/yandex/metrica/impl/h;)V
    .locals 0

    .line 404
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/ab;->d(Lcom/yandex/metrica/impl/h;)V

    .line 405
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->v()V

    return-void
.end method

.method public h()V
    .locals 5

    .line 276
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->j:Lcom/yandex/metrica/impl/ob/es;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/es;->a()J

    move-result-wide v0

    .line 277
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ab;->y:Lcom/yandex/metrica/impl/ob/ak;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ak;->e()Lcom/yandex/metrica/impl/ob/jq;

    move-result-object v2

    check-cast v2, Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->R()I

    move-result v2

    int-to-long v2, v2

    cmp-long v4, v0, v2

    const/4 v0, 0x0

    if-ltz v4, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    .line 280
    :goto_0
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/ab;->a:Z

    or-int/2addr v1, v2

    if-eqz v1, :cond_1

    .line 283
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->j()V

    .line 284
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ab;->a:Z

    :cond_1
    return-void
.end method

.method public h(Lcom/yandex/metrica/impl/h;)V
    .locals 5

    .line 417
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->m:Lcom/yandex/metrica/impl/a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->k()Landroid/util/Pair;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/a;->a(Landroid/util/Pair;)V

    .line 418
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ab;->m:Lcom/yandex/metrica/impl/a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/a;->b()Lcom/yandex/metrica/impl/a$a;

    move-result-object p1

    .line 419
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->n:Lcom/yandex/metrica/impl/ob/v;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/ob/v;->a(Lcom/yandex/metrica/impl/a$a;Lcom/yandex/metrica/impl/ob/fh;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 420
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->o()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lv;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 421
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->o()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v0

    const-string v1, "Save new app environment for %s. Value: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object p1, p1, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/lv;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method declared-synchronized i()V
    .locals 0

    monitor-enter p0

    .line 308
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized j()V
    .locals 1

    monitor-enter p0

    .line 317
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->i:Lcom/yandex/metrica/impl/be;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/be;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 318
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 316
    monitor-exit p0

    throw v0
.end method

.method public k()Ljava/lang/String;
    .locals 2

    .line 321
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()Lcom/yandex/metrica/impl/ob/jv;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 326
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->y:Lcom/yandex/metrica/impl/ob/ak;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ak;->e()Lcom/yandex/metrica/impl/ob/jq;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/jv;

    return-object v0
.end method

.method public m()Lcom/yandex/metrica/impl/ob/es;
    .locals 1

    .line 330
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->j:Lcom/yandex/metrica/impl/ob/es;

    return-object v0
.end method

.method public n()Landroid/os/Handler;
    .locals 1

    .line 358
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->c:Landroid/os/Handler;

    return-object v0
.end method

.method public o()Lcom/yandex/metrica/impl/ob/lv;
    .locals 1

    .line 374
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->u:Lcom/yandex/metrica/impl/ob/lv;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lv;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->y:Lcom/yandex/metrica/impl/ob/ak;

    .line 375
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ak;->e()Lcom/yandex/metrica/impl/ob/jq;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/jv;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jv;->Q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 376
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->u:Lcom/yandex/metrica/impl/ob/lv;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lv;->a()V

    .line 378
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->u:Lcom/yandex/metrica/impl/ob/lv;

    return-object v0
.end method

.method public p()V
    .locals 0

    .line 409
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/ab;->I()V

    return-void
.end method

.method public q()V
    .locals 0

    .line 413
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->v()V

    return-void
.end method

.method public r()V
    .locals 3

    .line 427
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->m:Lcom/yandex/metrica/impl/a;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/a;->a()V

    .line 428
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->n:Lcom/yandex/metrica/impl/ob/v;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ab;->m:Lcom/yandex/metrica/impl/a;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/a;->b()Lcom/yandex/metrica/impl/a$a;

    move-result-object v1

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/v;->b(Lcom/yandex/metrica/impl/a$a;Lcom/yandex/metrica/impl/ob/fh;)V

    return-void
.end method

.method public s()V
    .locals 4

    .line 3028
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 436
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/ab;->p:J

    .line 437
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/ab;->p:J

    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/fh;->c(J)Lcom/yandex/metrica/impl/ob/fh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fh;->i()V

    return-void
.end method

.method public t()V
    .locals 2

    .line 441
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->u()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fh;->c(I)Lcom/yandex/metrica/impl/ob/fh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fh;->i()V

    .line 442
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->y:Lcom/yandex/metrica/impl/ob/ak;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ak;->b()V

    return-void
.end method

.method public u()I
    .locals 2

    .line 446
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fh;->d(I)I

    move-result v0

    return v0
.end method

.method v()V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 456
    iget v0, p0, Lcom/yandex/metrica/impl/ob/ab;->s:I

    iput v0, p0, Lcom/yandex/metrica/impl/ob/ab;->r:I

    .line 457
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ab;->f:Lcom/yandex/metrica/impl/ob/fh;

    iget v1, p0, Lcom/yandex/metrica/impl/ob/ab;->r:I

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fh;->b(I)Lcom/yandex/metrica/impl/ob/fh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/fh;->i()V

    return-void
.end method

.method w()Z
    .locals 6
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 5028
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 467
    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/ab;->q:J

    sub-long v4, v0, v2

    .line 468
    sget-wide v0, Lcom/yandex/metrica/impl/ob/dl;->b:J

    cmp-long v2, v4, v0

    if-lez v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method x()Z
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 473
    iget v0, p0, Lcom/yandex/metrica/impl/ob/ab;->r:I

    iget v1, p0, Lcom/yandex/metrica/impl/ob/ab;->s:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public y()Z
    .locals 6

    .line 6028
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 5461
    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/ab;->p:J

    sub-long v4, v0, v2

    .line 5462
    sget-wide v0, Lcom/yandex/metrica/impl/ob/dl;->a:J

    cmp-long v2, v4, v0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-lez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-eqz v2, :cond_1

    .line 477
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jv;->e()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_1
    return v0
.end method

.method public z()Z
    .locals 1

    .line 481
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 482
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jv;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 483
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jv;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
