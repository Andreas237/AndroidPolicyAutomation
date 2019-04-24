.class Lo/cnq$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;->a(Ljava/util/List;Lo/clm;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cnq;

.field final synthetic d:Lo/clm;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/cnq;Ljava/util/List;Lo/clm;)V
    .locals 0

    .line 419
    iput-object p1, p0, Lo/cnq$7;->a:Lo/cnq;

    iput-object p2, p0, Lo/cnq$7;->e:Ljava/util/List;

    iput-object p3, p0, Lo/cnq$7;->d:Lo/clm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 422
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unSubscribeHiHealthData unSubscribeList = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$7;->e:Ljava/util/List;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    iget-object v0, p0, Lo/cnq$7;->e:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/cnq$7;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 424
    :cond_0
    iget-object v0, p0, Lo/cnq$7;->d:Lo/clm;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cnn;->d(Lo/clm;Z)V

    .line 425
    return-void

    .line 427
    :cond_1
    iget-object v0, p0, Lo/cnq$7;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 428
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    instance-of v0, v5, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 429
    iget-object v0, p0, Lo/cnq$7;->a:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->b(Lo/cnq;)Lo/cun;

    move-result-object v0

    move-object v1, v5

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lo/cun;->c(Ljava/lang/Integer;)V

    .line 431
    :cond_2
    goto :goto_0

    .line 432
    :cond_3
    iget-object v0, p0, Lo/cnq$7;->d:Lo/clm;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cnn;->d(Lo/clm;Z)V

    .line 433
    return-void
.end method
