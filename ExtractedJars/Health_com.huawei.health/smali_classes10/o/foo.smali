.class public Lo/foo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Lo/fty;


# instance fields
.field private final a:J

.field private final b:I

.field private final c:Lo/fos;

.field private final e:Lo/fot;

.field private f:Lo/fly;

.field private g:Lo/fly;

.field private h:Z

.field private i:Ljava/lang/String;

.field private final k:Lo/fmb;

.field private m:J

.field private n:I

.field private p:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<Lo/fly;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    const-class v0, Lo/foo;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/foo;->d:Lo/fty;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 116
    iput-boolean p1, p0, Lo/foo;->h:Z

    .line 117
    return-void
.end method

.method public a()Z
    .locals 1

    .line 107
    iget-boolean v0, p0, Lo/foo;->h:Z

    return v0
.end method

.method public b()V
    .locals 1

    .line 138
    iget-object v0, p0, Lo/foo;->c:Lo/fos;

    invoke-virtual {v0}, Lo/fos;->b()V

    .line 139
    return-void
.end method

.method public b(Lo/fly;)V
    .locals 0

    .line 200
    iput-object p1, p0, Lo/foo;->f:Lo/fly;

    .line 201
    return-void
.end method

.method public c()V
    .locals 5

    .line 124
    sget-object v0, Lo/foo;->d:Lo/fty;

    const-string v1, "Canceling observe relation {} with {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/foo;->i()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/foo;->e:Lo/fot;

    invoke-interface {v3}, Lo/fot;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    iget-object v0, p0, Lo/foo;->k:Lo/fmb;

    invoke-virtual {v0}, Lo/fmb;->i()Lo/fly;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/foo;->k:Lo/fmb;

    invoke-virtual {v0}, Lo/fmb;->i()Lo/fly;

    move-result-object v0

    invoke-virtual {v0}, Lo/fly;->A()V

    .line 127
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/foo;->a(Z)V

    .line 128
    iget-object v0, p0, Lo/foo;->e:Lo/fot;

    invoke-interface {v0, p0}, Lo/fot;->b(Lo/foo;)V

    .line 129
    iget-object v0, p0, Lo/foo;->c:Lo/fos;

    invoke-virtual {v0, p0}, Lo/fos;->d(Lo/foo;)V

    .line 130
    iget-object v0, p0, Lo/foo;->k:Lo/fmb;

    invoke-virtual {v0}, Lo/fmb;->l()V

    .line 131
    return-void
.end method

.method public c(Lo/fly;)V
    .locals 1

    .line 204
    iget-object v0, p0, Lo/foo;->p:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 205
    return-void
.end method

.method public d()Lo/fmb;
    .locals 1

    .line 164
    iget-object v0, p0, Lo/foo;->k:Lo/fmb;

    return-object v0
.end method

.method public d(Lo/fly;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lo/foo;->g:Lo/fly;

    .line 193
    return-void
.end method

.method public e()Ljava/net/InetSocketAddress;
    .locals 1

    .line 173
    iget-object v0, p0, Lo/foo;->c:Lo/fos;

    invoke-virtual {v0}, Lo/fos;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    return-object v0
.end method

.method public f()Lo/fly;
    .locals 1

    .line 188
    iget-object v0, p0, Lo/foo;->g:Lo/fly;

    return-object v0
.end method

.method public g()Lo/fly;
    .locals 1

    .line 196
    iget-object v0, p0, Lo/foo;->f:Lo/fly;

    return-object v0
.end method

.method public h()Z
    .locals 5

    .line 177
    const/4 v4, 0x0

    .line 178
    iget-wide v0, p0, Lo/foo;->m:J

    iget-wide v2, p0, Lo/foo;->a:J

    add-long/2addr v0, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    or-int/lit8 v4, v0, 0x0

    .line 179
    iget v0, p0, Lo/foo;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/foo;->n:I

    iget v1, p0, Lo/foo;->b:I

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    or-int/2addr v4, v0

    .line 180
    if-eqz v4, :cond_2

    .line 181
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/foo;->m:J

    .line 182
    const/4 v0, 0x0

    iput v0, p0, Lo/foo;->n:I

    .line 184
    :cond_2
    return v4
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 212
    iget-object v0, p0, Lo/foo;->i:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<Lo/fly;>;"
        }
    .end annotation

    .line 208
    iget-object v0, p0, Lo/foo;->p:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
