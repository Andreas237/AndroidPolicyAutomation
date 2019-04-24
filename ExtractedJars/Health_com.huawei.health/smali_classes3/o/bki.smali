.class public Lo/bki;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Lcom/huawei/health/sns/model/user/User;

.field private d:Lcom/huawei/health/sns/model/user/User;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lo/bki;->c:Lcom/huawei/health/sns/model/user/User;

    .line 30
    iput-object p2, p0, Lo/bki;->d:Lcom/huawei/health/sns/model/user/User;

    .line 31
    return-void
.end method

.method private b(JLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 61
    invoke-static {p3, p4}, Lo/bqz;->e(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    new-instance v0, Lo/axd;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/axd;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, p1, p2}, Lo/axd;->b(J)V

    .line 65
    :cond_0
    return-void
.end method


# virtual methods
.method public d()Lcom/huawei/health/sns/model/user/User;
    .locals 4

    .line 40
    iget-object v0, p0, Lo/bki;->c:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lo/bki;->c:Lcom/huawei/health/sns/model/user/User;

    iget-object v1, p0, Lo/bki;->d:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/User;->copyUserData(Lcom/huawei/health/sns/model/user/User;)V

    .line 43
    iget-object v0, p0, Lo/bki;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    iget-object v2, p0, Lo/bki;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/bki;->d:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v0, v1, v2, v3}, Lo/bki;->b(JLjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 47
    :cond_0
    iget-object v0, p0, Lo/bki;->d:Lcom/huawei/health/sns/model/user/User;

    iput-object v0, p0, Lo/bki;->c:Lcom/huawei/health/sns/model/user/User;

    .line 49
    :goto_0
    iget-object v0, p0, Lo/bki;->c:Lcom/huawei/health/sns/model/user/User;

    return-object v0
.end method
