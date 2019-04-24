.class Lo/dnq$1;
.super Lo/doi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnq;->e(Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/up/model/UserInfomation;

.field final synthetic b:Lo/dnq;

.field final synthetic d:Lo/cyx;


# direct methods
.method constructor <init>(Lo/dnq;Landroid/os/Handler;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V
    .locals 0

    .line 326
    iput-object p1, p0, Lo/dnq$1;->b:Lo/dnq;

    iput-object p3, p0, Lo/dnq$1;->a:Lcom/huawei/up/model/UserInfomation;

    iput-object p4, p0, Lo/dnq$1;->d:Lo/cyx;

    invoke-direct {p0, p2}, Lo/doi;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 4

    .line 330
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setUserInfoDP fail, user="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dnq$1;->a:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v3}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    iget-object v0, p0, Lo/dnq$1;->d:Lo/cyx;

    if-eqz v0, :cond_0

    .line 332
    iget-object v0, p0, Lo/dnq$1;->d:Lo/cyx;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 334
    :cond_0
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 4

    .line 338
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setUserInfoDP success, user="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dnq$1;->a:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v3}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    iget-object v0, p0, Lo/dnq$1;->d:Lo/cyx;

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Lo/dnq$1;->d:Lo/cyx;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 342
    :cond_0
    return-void
.end method
