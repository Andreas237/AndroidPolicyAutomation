.class public Lo/aos;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aos$b;,
        Lo/aos$e;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    return-void
.end method

.method static synthetic a(Lo/aos;Ljava/lang/String;)Z
    .locals 1

    .line 24
    invoke-direct {p0, p1}, Lo/aos;->d(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private d(Ljava/lang/String;)Z
    .locals 2

    .line 225
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 227
    const-string v0, "AccountCheckManager"

    const-string v1, "ThirdAccountManager nickName is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    const/4 v0, 0x0

    return v0

    .line 231
    :cond_0
    const-string v0, "huafans"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 233
    const-string v0, "AccountCheckManager"

    const-string v1, "ThirdAccountManager invalidate, nickName is started with huafans"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    const/4 v0, 0x0

    return v0

    .line 237
    :cond_1
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public c()Z
    .locals 2

    .line 247
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->a()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v1

    .line 248
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/aos;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(Landroid/app/Activity;Lo/aos$b;)V
    .locals 0

    .line 170
    return-void
.end method

.method public d(Lo/aos$e;)V
    .locals 2

    .line 117
    if-eqz p1, :cond_0

    .line 119
    invoke-interface {p1}, Lo/aos$e;->e()V

    .line 121
    :cond_0
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    new-instance v1, Lo/aos$2;

    invoke-direct {v1, p0, p1}, Lo/aos$2;-><init>(Lo/aos;Lo/aos$e;)V

    invoke-virtual {v0, v1}, Lo/awj;->e(Lo/awj$a;)V

    .line 155
    return-void
.end method

.method public e()Z
    .locals 2

    .line 108
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->g()Lo/axr;

    move-result-object v1

    .line 109
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lo/axr;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
