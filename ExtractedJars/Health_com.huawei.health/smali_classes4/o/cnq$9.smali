.class Lo/cnq$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;->d(Ljava/util/List;Lo/clo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Lo/clo;

.field final synthetic c:Lo/cnq;

.field final synthetic d:Ljava/util/ArrayList;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/cnq;Ljava/util/List;Lo/clo;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 375
    iput-object p1, p0, Lo/cnq$9;->c:Lo/cnq;

    iput-object p2, p0, Lo/cnq$9;->e:Ljava/util/List;

    iput-object p3, p0, Lo/cnq$9;->b:Lo/clo;

    iput-object p4, p0, Lo/cnq$9;->d:Ljava/util/ArrayList;

    iput-object p5, p0, Lo/cnq$9;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 378
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeHiHealthData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    iget-object v0, p0, Lo/cnq$9;->e:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/cnq$9;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/cnq$9;->b:Lo/clo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 380
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeHiHealthData typeList is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    iget-object v0, p0, Lo/cnq$9;->b:Lo/clo;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/cnn;->c(Lo/clo;Ljava/util/List;Ljava/util/List;)V

    .line 382
    return-void

    .line 384
    :cond_1
    iget-object v0, p0, Lo/cnq$9;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 385
    if-eqz v5, :cond_3

    instance-of v0, v5, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 386
    move-object v6, v5

    check-cast v6, Ljava/lang/Integer;

    .line 387
    iget-object v0, p0, Lo/cnq$9;->c:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->b(Lo/cnq;)Lo/cun;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$9;->b:Lo/clo;

    invoke-virtual {v0, v6, v1}, Lo/cun;->b(Ljava/lang/Integer;Lo/clo;)Ljava/lang/Integer;

    move-result-object v7

    .line 388
    const/4 v0, 0x0

    if-ne v0, v7, :cond_2

    .line 389
    iget-object v0, p0, Lo/cnq$9;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 391
    :cond_2
    iget-object v0, p0, Lo/cnq$9;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    :cond_3
    :goto_1
    goto :goto_0

    .line 395
    :cond_4
    iget-object v0, p0, Lo/cnq$9;->b:Lo/clo;

    iget-object v1, p0, Lo/cnq$9;->a:Ljava/util/ArrayList;

    iget-object v2, p0, Lo/cnq$9;->d:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Lo/cnn;->c(Lo/clo;Ljava/util/List;Ljava/util/List;)V

    .line 396
    return-void
.end method
