.class Lo/dnt$10;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt;->c(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/doi;

.field final synthetic d:Lo/dnt;


# direct methods
.method constructor <init>(Lo/dnt;Lo/doi;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lo/dnt$10;->d:Lo/dnt;

    iput-object p2, p0, Lo/dnt$10;->b:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 7

    .line 207
    if-nez p1, :cond_0

    .line 208
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit write memory error arg null (AccountDataMgrByAllowLoginArea)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    iget-object v0, p0, Lo/dnt$10;->b:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 210
    return-void

    .line 213
    :cond_0
    const-string v0, "userInfo"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/up/model/UserInfomation;

    .line 214
    if-nez v4, :cond_1

    .line 215
    iget-object v0, p0, Lo/dnt$10;->b:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 216
    return-void

    .line 219
    :cond_1
    iget-object v0, p0, Lo/dnt$10;->d:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->k(Lo/dnt;)Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 221
    :try_start_0
    iget-object v0, p0, Lo/dnt$10;->d:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/up/model/UserInfomation;->loadAccountData(Lcom/huawei/up/model/UserInfomation;)V

    .line 223
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit write memory success(refresh):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnt$10;->d:Lo/dnt;

    invoke-static {v2}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 224
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 226
    :goto_0
    iget-object v0, p0, Lo/dnt$10;->b:Lo/doi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/doi;->e(Ljava/util/Map;)V

    .line 227
    return-void
.end method
