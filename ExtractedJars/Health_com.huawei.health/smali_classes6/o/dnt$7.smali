.class Lo/dnt$7;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt;->e(Landroid/os/Message;Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dnt;

.field final synthetic b:Lo/doi;

.field final synthetic e:Lcom/huawei/up/model/UserInfomation;


# direct methods
.method constructor <init>(Lo/dnt;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V
    .locals 0

    .line 622
    iput-object p1, p0, Lo/dnt$7;->a:Lo/dnt;

    iput-object p2, p0, Lo/dnt$7;->e:Lcom/huawei/up/model/UserInfomation;

    iput-object p3, p0, Lo/dnt$7;->b:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 7

    .line 627
    iget-object v0, p0, Lo/dnt$7;->a:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->k(Lo/dnt;)Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 628
    :try_start_0
    iget-object v5, p0, Lo/dnt$7;->e:Lcom/huawei/up/model/UserInfomation;

    .line 630
    iget-object v0, p0, Lo/dnt$7;->a:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/up/model/UserInfomation;->loadAccountData(Lcom/huawei/up/model/UserInfomation;)V

    .line 631
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo write memory success(refresh):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnt$7;->a:Lo/dnt;

    invoke-static {v2}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 632
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 634
    :goto_0
    iget-object v0, p0, Lo/dnt$7;->b:Lo/doi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/doi;->e(Ljava/util/Map;)V

    .line 635
    return-void
.end method
