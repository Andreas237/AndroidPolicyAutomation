.class Lo/dnt$5;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dnt;

.field final synthetic e:Lo/doi;


# direct methods
.method constructor <init>(Lo/dnt;Lo/doi;)V
    .locals 0

    .line 506
    iput-object p1, p0, Lo/dnt$5;->b:Lo/dnt;

    iput-object p2, p0, Lo/dnt$5;->e:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 7

    .line 510
    const-string v0, "newPath"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 511
    iget-object v0, p0, Lo/dnt$5;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->k(Lo/dnt;)Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 512
    :try_start_0
    iget-object v0, p0, Lo/dnt$5;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    .line 513
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processCheckHeadPic write memory(refresh):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnt$5;->b:Lo/dnt;

    invoke-static {v2}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 514
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 515
    :goto_0
    move-object v5, v4

    .line 516
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "default"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 517
    const-string v5, ""

    .line 519
    :cond_0
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 520
    iget-object v0, p0, Lo/dnt$5;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->d(Lo/dnt;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v5}, Lo/dou;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 522
    :cond_1
    iget-object v0, p0, Lo/dnt$5;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->d(Lo/dnt;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v5}, Lo/dou;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 524
    :goto_1
    iget-object v0, p0, Lo/dnt$5;->e:Lo/doi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/doi;->e(Ljava/util/Map;)V

    .line 525
    return-void
.end method
