.class Lo/dnw$5;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnw;->c(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/doi;

.field final synthetic b:Lo/dnw;


# direct methods
.method constructor <init>(Lo/dnw;Lo/doi;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lo/dnw$5;->b:Lo/dnw;

    iput-object p2, p0, Lo/dnw$5;->a:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 7

    .line 120
    if-nez p1, :cond_0

    .line 121
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit write memory error arg null (AccountDataExtMgr)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-object v0, p0, Lo/dnw$5;->a:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 123
    return-void

    .line 126
    :cond_0
    const-string v0, "userInfo"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/up/model/UserInfomation;

    .line 127
    if-nez v4, :cond_1

    .line 128
    iget-object v0, p0, Lo/dnw$5;->a:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 129
    return-void

    .line 132
    :cond_1
    iget-object v0, p0, Lo/dnw$5;->b:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->b(Lo/dnw;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    monitor-enter v5

    .line 133
    :try_start_0
    iget-object v0, p0, Lo/dnw$5;->b:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->b(Lo/dnw;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/up/model/UserInfomation;->loadAccountExtData(Lcom/huawei/up/model/UserInfomation;)V

    .line 134
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit write memory success(refresh):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnw$5;->b:Lo/dnw;

    invoke-static {v2}, Lo/dnw;->b(Lo/dnw;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 137
    :goto_0
    iget-object v0, p0, Lo/dnw$5;->a:Lo/doi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/doi;->e(Ljava/util/Map;)V

    .line 138
    return-void
.end method
