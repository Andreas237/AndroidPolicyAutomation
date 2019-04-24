.class Lo/dnu$2;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnu;->c(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/doi;

.field final synthetic e:Lo/dnu;


# direct methods
.method constructor <init>(Lo/dnu;Lo/doi;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lo/dnu$2;->e:Lo/dnu;

    iput-object p2, p0, Lo/dnu$2;->c:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 7

    .line 109
    if-nez p1, :cond_0

    .line 110
    const-string v0, "AccountDataMgrByNAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit write memory error arg null (AccountDataMgrByNAllowLoginArea)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    iget-object v0, p0, Lo/dnu$2;->c:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 112
    return-void

    .line 115
    :cond_0
    const-string v0, "userInfo"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/up/model/UserInfomation;

    .line 116
    if-nez v4, :cond_1

    .line 117
    iget-object v0, p0, Lo/dnu$2;->c:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 118
    return-void

    .line 121
    :cond_1
    iget-object v0, p0, Lo/dnu$2;->e:Lo/dnu;

    invoke-static {v0}, Lo/dnu;->d(Lo/dnu;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    monitor-enter v5

    .line 122
    :try_start_0
    iget-object v0, p0, Lo/dnu$2;->e:Lo/dnu;

    invoke-static {v0}, Lo/dnu;->d(Lo/dnu;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/up/model/UserInfomation;->loadAccountData(Lcom/huawei/up/model/UserInfomation;)V

    .line 123
    const-string v0, "AccountDataMgrByNAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit write memory(refresh):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnu$2;->e:Lo/dnu;

    invoke-static {v2}, Lo/dnu;->d(Lo/dnu;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 126
    :goto_0
    iget-object v0, p0, Lo/dnu$2;->c:Lo/doi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/doi;->e(Ljava/util/Map;)V

    .line 127
    return-void
.end method
