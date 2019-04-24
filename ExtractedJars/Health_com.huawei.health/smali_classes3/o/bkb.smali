.class public Lo/bkb;
.super Lo/bka;
.source "SourceFile"


# instance fields
.field private d:J

.field private i:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lo/bka;-><init>(Landroid/app/Activity;)V

    .line 42
    return-void
.end method

.method static synthetic a(Lo/bkb;)J
    .locals 2

    .line 23
    iget-wide v0, p0, Lo/bkb;->d:J

    return-wide v0
.end method

.method private b(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 85
    iput-object p1, p0, Lo/bkb;->i:Lcom/huawei/health/sns/model/group/Group;

    .line 86
    iget-object v0, p0, Lo/bkb;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lo/bkb;->b:Landroid/os/Handler;

    const/16 v1, 0x123

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 90
    :cond_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 1

    .line 112
    iget-object v0, p0, Lo/bkb;->a:Lo/bjy;

    invoke-virtual {v0, p1}, Lo/bjy;->a(Lcom/huawei/health/sns/model/group/Group;)V

    .line 113
    return-void
.end method

.method static synthetic d(Lo/bkb;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lo/bkb;->b(Lcom/huawei/health/sns/model/group/Group;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 0

    .line 75
    invoke-virtual {p0}, Lo/bkb;->b()V

    .line 76
    return-void
.end method

.method a(Landroid/os/Bundle;)V
    .locals 2

    .line 47
    if-nez p1, :cond_0

    .line 49
    return-void

    .line 51
    :cond_0
    const-string v0, "bundleKeyGroupId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    const-string v0, "bundleKeyGroupId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/bkb;->d:J

    .line 55
    :cond_1
    return-void
.end method

.method public b()V
    .locals 5

    .line 142
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lo/bkb;->b:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lo/bkb;->d:J

    const/16 v3, 0x109

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 143
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 125
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 127
    iget-object v0, p0, Lo/bkb;->a:Lo/bjy;

    invoke-virtual {v0, p1}, Lo/bjy;->a(Ljava/lang/String;)V

    .line 131
    :cond_0
    iget-object v0, p0, Lo/bkb;->a:Lo/bjy;

    invoke-virtual {v0, p2}, Lo/bjy;->d(Ljava/lang/String;)V

    .line 134
    iget-object v0, p0, Lo/bkb;->a:Lo/bjy;

    invoke-virtual {v0, p3}, Lo/bjy;->e(Ljava/lang/String;)V

    .line 135
    return-void
.end method

.method c()V
    .locals 2

    .line 60
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/bkb$1;

    invoke-direct {v1, p0}, Lo/bkb$1;-><init>(Lo/bkb;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 70
    return-void
.end method

.method d()V
    .locals 3

    .line 95
    iget-object v0, p0, Lo/bkb;->i:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 97
    const-string v0, "GroupTwoDimCodeView"

    const-string v1, "GroupTwoDimCodeView group is null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    return-void

    .line 100
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bkb;->e:Z

    .line 101
    iget-object v0, p0, Lo/bkb;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0, v0}, Lo/bkb;->c(Lcom/huawei/health/sns/model/group/Group;)V

    .line 102
    iget-object v0, p0, Lo/bkb;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bkb;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getQrCode()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bkb;->i:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getQrExpireTime()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lo/bkb;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    return-void
.end method
