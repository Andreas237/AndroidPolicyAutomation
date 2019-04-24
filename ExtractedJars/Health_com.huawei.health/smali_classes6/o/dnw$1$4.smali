.class Lo/dnw$1$4;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnw$1;->c(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/doi;

.field final synthetic d:Lo/dnw$1;


# direct methods
.method constructor <init>(Lo/dnw$1;Lo/doi;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lo/dnw$1$4;->d:Lo/dnw$1;

    iput-object p2, p0, Lo/dnw$1$4;->c:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 7

    .line 220
    if-nez p1, :cond_0

    .line 221
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processCloudSync write memory error arg null (AccountDataExtMgr)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    iget-object v0, p0, Lo/dnw$1$4;->c:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 223
    return-void

    .line 226
    :cond_0
    const-string v0, "userInfo"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/up/model/UserInfomation;

    .line 227
    if-nez v4, :cond_1

    .line 228
    iget-object v0, p0, Lo/dnw$1$4;->c:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 229
    return-void

    .line 232
    :cond_1
    iget-object v0, p0, Lo/dnw$1$4;->d:Lo/dnw$1;

    iget-object v0, v0, Lo/dnw$1;->a:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->b(Lo/dnw;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    monitor-enter v5

    .line 233
    :try_start_0
    iget-object v0, p0, Lo/dnw$1$4;->d:Lo/dnw$1;

    iget-object v0, v0, Lo/dnw$1;->a:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->b(Lo/dnw;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/up/model/UserInfomation;->loadAccountExtData(Lcom/huawei/up/model/UserInfomation;)V

    .line 234
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processCloudSync write memory success(refresh)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 236
    :goto_0
    iget-object v0, p0, Lo/dnw$1$4;->c:Lo/doi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/doi;->e(Ljava/util/Map;)V

    .line 237
    return-void
.end method
