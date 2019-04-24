.class Lo/dnt$11;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/doi;

.field final synthetic e:Lo/dnt;


# direct methods
.method constructor <init>(Lo/dnt;Lo/doi;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lo/dnt$11;->e:Lo/dnt;

    iput-object p2, p0, Lo/dnt$11;->d:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 7

    .line 370
    if-nez p1, :cond_0

    .line 371
    iget-object v0, p0, Lo/dnt$11;->d:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 372
    return-void

    .line 374
    :cond_0
    iget-object v0, p0, Lo/dnt$11;->e:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->k(Lo/dnt;)Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 375
    const-string v0, "userInfo"

    :try_start_0
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/up/model/UserInfomation;

    .line 377
    iget-object v0, p0, Lo/dnt$11;->e:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/up/model/UserInfomation;->loadAccountData(Lcom/huawei/up/model/UserInfomation;)V

    .line 379
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processSync write memory success(refresh):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnt$11;->e:Lo/dnt;

    invoke-static {v2}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 380
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 381
    :goto_0
    iget-object v0, p0, Lo/dnt$11;->d:Lo/doi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/doi;->e(Ljava/util/Map;)V

    .line 382
    return-void
.end method
