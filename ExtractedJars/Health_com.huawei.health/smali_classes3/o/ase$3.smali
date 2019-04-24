.class Lo/ase$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ase;->b()Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/ase;


# direct methods
.method constructor <init>(Lo/ase;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lo/ase$3;->b:Lo/ase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 111
    invoke-virtual {p0, p1}, Lo/ase$3;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 117
    :try_start_0
    iget-object v0, p0, Lo/ase$3;->b:Lo/ase;

    invoke-static {v0}, Lo/ase;->c(Lo/ase;)Ljava/util/concurrent/LinkedBlockingQueue;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bbf;

    .line 119
    :goto_0
    if-eqz v4, :cond_1

    .line 121
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    const-string v0, "HeadImgDwnldManager"

    const-string v1, "getJob() cancelled."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    goto :goto_1

    .line 126
    :cond_0
    invoke-static {v4}, Lo/bbk;->a(Lo/bbf;)V

    .line 128
    invoke-static {}, Lo/asj;->a()Lo/asj;

    move-result-object v0

    invoke-virtual {v4}, Lo/bbf;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/asj;->d(J)V

    .line 129
    iget-object v0, p0, Lo/ase$3;->b:Lo/ase;

    invoke-static {v0}, Lo/ase;->c(Lo/ase;)Ljava/util/concurrent/LinkedBlockingQueue;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bbf;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 139
    :cond_1
    :goto_1
    goto :goto_2

    .line 132
    :catch_0
    move-exception v4

    .line 134
    const-string v0, "HeadImgDwnldManager"

    const-string v1, "getJob() InterruptedException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    goto :goto_2

    .line 136
    :catch_1
    move-exception v4

    .line 138
    const-string v0, "HeadImgDwnldManager"

    const-string v1, "getJob() IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    :goto_2
    iget-object v0, p0, Lo/ase$3;->b:Lo/ase;

    invoke-static {v0}, Lo/ase;->a(Lo/ase;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 141
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
