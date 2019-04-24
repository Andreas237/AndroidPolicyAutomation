.class public Lo/bjz;
.super Lo/bka;
.source "SourceFile"


# instance fields
.field private d:Ljava/lang/String;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lo/bka;-><init>(Landroid/app/Activity;)V

    .line 53
    return-void
.end method

.method private b()V
    .locals 2

    .line 109
    iget-object v0, p0, Lo/bjz;->a:Lo/bjy;

    iget-object v1, p0, Lo/bjz;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bjy;->c(Ljava/lang/String;)V

    .line 110
    return-void
.end method

.method private f()V
    .locals 2

    .line 147
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    new-instance v1, Lo/bjz$1;

    invoke-direct {v1, p0}, Lo/bjz$1;-><init>(Lo/bjz;)V

    invoke-virtual {v0, v1}, Lo/awj;->e(Lo/awj$a;)V

    .line 168
    return-void
.end method

.method private g()V
    .locals 2

    .line 136
    iget-object v0, p0, Lo/bjz;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 138
    iget-object v0, p0, Lo/bjz;->a:Lo/bjy;

    iget-object v1, p0, Lo/bjz;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bjy;->a(Ljava/lang/String;)V

    .line 140
    :cond_0
    return-void
.end method


# virtual methods
.method a()V
    .locals 0

    .line 95
    invoke-direct {p0}, Lo/bjz;->f()V

    .line 96
    return-void
.end method

.method a(Landroid/os/Bundle;)V
    .locals 1

    .line 58
    if-nez p1, :cond_0

    .line 60
    return-void

    .line 62
    :cond_0
    const-string v0, "bundleKeyUserHeadPath"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 64
    const-string v0, "bundleKeyUserHeadPath"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bjz;->d:Ljava/lang/String;

    .line 66
    :cond_1
    const-string v0, "bundleKeyUserNickName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 68
    const-string v0, "bundleKeyUserNickName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bjz;->f:Ljava/lang/String;

    .line 70
    :cond_2
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 123
    iget-object v0, p0, Lo/bjz;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p0, Lo/bjz;->a:Lo/bjy;

    invoke-virtual {v0, p1}, Lo/bjy;->a(Ljava/lang/String;)V

    .line 128
    :cond_0
    iget-object v0, p0, Lo/bjz;->a:Lo/bjy;

    invoke-virtual {v0, p2}, Lo/bjy;->d(Ljava/lang/String;)V

    .line 129
    return-void
.end method

.method c()V
    .locals 4

    .line 75
    invoke-direct {p0}, Lo/bjz;->b()V

    .line 77
    invoke-direct {p0}, Lo/bjz;->g()V

    .line 79
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->e()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v3

    .line 81
    if-nez v3, :cond_0

    .line 83
    const-string v0, "SelfTwoDimCodeView"

    const-string v1, "SelfTwoDimCodeView snsInfo is null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 87
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bjz;->e:Z

    .line 88
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getQrCode_()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lo/bjz;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :goto_0
    return-void
.end method

.method d()V
    .locals 2

    .line 101
    const-string v0, "SelfTwoDimCodeView"

    const-string v1, "SelfTwoDimCodeView refreshData"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    return-void
.end method
