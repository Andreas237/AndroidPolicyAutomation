.class Lo/eyk$d$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/faa$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eyk$d;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eyk$d;


# direct methods
.method constructor <init>(Lo/eyk$d;)V
    .locals 0

    .line 386
    iput-object p1, p0, Lo/eyk$d$3;->b:Lo/eyk$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 11

    .line 395
    iget-object v0, p0, Lo/eyk$d$3;->b:Lo/eyk$d;

    iget-object v0, v0, Lo/eyk$d;->d:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->c(Lo/eyk;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eyk$e;

    invoke-interface {v0}, Lo/eyk$e;->getStepDataType()Lo/eic;

    move-result-object v5

    .line 396
    iget-object v0, p0, Lo/eyk$d$3;->b:Lo/eyk$d;

    iget-object v6, v0, Lo/eyk$d;->d:Lo/eyk;

    monitor-enter v6

    .line 397
    :try_start_0
    iget-object v0, p0, Lo/eyk$d$3;->b:Lo/eyk$d;

    invoke-static {v0, v5}, Lo/eyk$d;->a(Lo/eyk$d;Lo/eic;)Lo/eic;

    .line 399
    iget-object v0, p0, Lo/eyk$d$3;->b:Lo/eyk$d;

    invoke-static {v0}, Lo/eyk$d;->a(Lo/eyk$d;)Lo/eic;

    move-result-object v0

    if-ne v5, v0, :cond_2

    .line 400
    iget-object v0, p0, Lo/eyk$d$3;->b:Lo/eyk$d;

    invoke-static {v0}, Lo/eyk$d;->b(Lo/eyk$d;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/eyk$h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 401
    if-nez v7, :cond_0

    .line 402
    monitor-exit v6

    return-void

    .line 404
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/eyk$d$3;->b:Lo/eyk$d;

    iget-object v8, v0, Lo/eyk$d;->d:Lo/eyk;

    monitor-enter v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 405
    :try_start_2
    iget-object v0, p0, Lo/eyk$d$3;->b:Lo/eyk$d;

    iget-object v0, v0, Lo/eyk$d;->d:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->h(Lo/eyk;)Lo/ezv;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 406
    iget-object v0, p0, Lo/eyk$d$3;->b:Lo/eyk$d;

    iget-object v0, v0, Lo/eyk$d;->d:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->h(Lo/eyk;)Lo/ezv;

    move-result-object v0

    iget-object v1, v7, Lo/eyk$h;->c:Lo/eic;

    iget v2, v7, Lo/eyk$h;->d:I

    iget v3, v7, Lo/eyk$h;->b:I

    iget-object v4, v7, Lo/eyk$h;->a:Lo/eie;

    invoke-interface {v0, v1, v2, v3, v4}, Lo/ezv;->d(Lo/eic;IILo/eie;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 408
    :cond_1
    monitor-exit v8

    goto :goto_0

    :catchall_0
    move-exception v9

    monitor-exit v8

    :try_start_3
    throw v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 410
    :cond_2
    :goto_0
    monitor-exit v6

    goto :goto_1

    :catchall_1
    move-exception v10

    monitor-exit v6

    throw v10

    .line 411
    :goto_1
    return-void
.end method
