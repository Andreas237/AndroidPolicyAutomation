.class Lo/dnw$7;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnw;->e(Landroid/os/Message;Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/up/model/UserInfomation;

.field final synthetic b:Lo/doi;

.field final synthetic c:Lo/dnw;


# direct methods
.method constructor <init>(Lo/dnw;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V
    .locals 0

    .line 342
    iput-object p1, p0, Lo/dnw$7;->c:Lo/dnw;

    iput-object p2, p0, Lo/dnw$7;->a:Lcom/huawei/up/model/UserInfomation;

    iput-object p3, p0, Lo/dnw$7;->b:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 7

    .line 347
    iget-object v4, p0, Lo/dnw$7;->a:Lcom/huawei/up/model/UserInfomation;

    .line 349
    iget-object v0, p0, Lo/dnw$7;->c:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->b(Lo/dnw;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    monitor-enter v5

    .line 350
    :try_start_0
    iget-object v0, p0, Lo/dnw$7;->c:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->b(Lo/dnw;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/up/model/UserInfomation;->loadAccountExtData(Lcom/huawei/up/model/UserInfomation;)V

    .line 351
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo write memory success(refresh):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnw$7;->c:Lo/dnw;

    invoke-static {v2}, Lo/dnw;->b(Lo/dnw;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 352
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 353
    :goto_0
    iget-object v0, p0, Lo/dnw$7;->b:Lo/doi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/doi;->e(Ljava/util/Map;)V

    .line 354
    return-void
.end method
