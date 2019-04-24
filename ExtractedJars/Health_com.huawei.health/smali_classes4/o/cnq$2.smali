.class Lo/cnq$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;->e(Lo/cla;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cla;

.field final synthetic b:Lo/crd;

.field final synthetic c:Ljava/util/ArrayList;

.field final synthetic e:Lo/cnq;


# direct methods
.method constructor <init>(Lo/cnq;Lo/crd;Ljava/util/ArrayList;Lo/cla;)V
    .locals 0

    .line 1373
    iput-object p1, p0, Lo/cnq$2;->e:Lo/cnq;

    iput-object p2, p0, Lo/cnq$2;->b:Lo/crd;

    iput-object p3, p0, Lo/cnq$2;->c:Ljava/util/ArrayList;

    iput-object p4, p0, Lo/cnq$2;->a:Lo/cla;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1376
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogout()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1377
    iget-object v0, p0, Lo/cnq$2;->e:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnw;->b()Ljava/lang/String;

    move-result-object v4

    .line 1378
    iget-object v0, p0, Lo/cnq$2;->e:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cnv;->c(Landroid/content/Context;)Lo/cnv;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$2;->b:Lo/crd;

    invoke-virtual {v0, v1}, Lo/cnv;->b(Lo/crd;)I

    move-result v5

    .line 1379
    if-lez v5, :cond_0

    .line 1380
    iget-object v0, p0, Lo/cnq$2;->e:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/cnw;->c(Ljava/lang/String;)V

    .line 1381
    iget-object v0, p0, Lo/cnq$2;->e:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/cuy;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1382
    iget-object v0, p0, Lo/cnq$2;->c:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1383
    iget-object v0, p0, Lo/cnq$2;->a:Lo/cla;

    iget-object v1, p0, Lo/cnq$2;->c:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lo/cnn;->a(Lo/cla;ILjava/util/List;)V

    .line 1384
    iget-object v0, p0, Lo/cnq$2;->e:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cqp;->b(Landroid/content/Context;)Lo/cqp;

    move-result-object v0

    invoke-virtual {v0}, Lo/cqp;->a()V

    .line 1385
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogout() and dropUserPreference"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1387
    :cond_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogout() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1388
    iget-object v0, p0, Lo/cnq$2;->c:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1389
    iget-object v0, p0, Lo/cnq$2;->a:Lo/cla;

    iget-object v1, p0, Lo/cnq$2;->c:Ljava/util/ArrayList;

    const/16 v2, 0xd

    invoke-static {v0, v2, v1}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1391
    :goto_0
    return-void
.end method
