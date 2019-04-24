.class Lo/aos$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/awj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aos;->d(Lo/aos$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/aos;

.field final synthetic e:Lo/aos$e;


# direct methods
.method constructor <init>(Lo/aos;Lo/aos$e;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lo/aos$2;->c:Lo/aos;

    iput-object p2, p0, Lo/aos$2;->e:Lo/aos$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 3

    .line 148
    const-string v0, "AccountCheckManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestUserSNSInfo errorCallback errno is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    iget-object v0, p0, Lo/aos$2;->e:Lo/aos$e;

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lo/aos$2;->e:Lo/aos$e;

    invoke-interface {v0}, Lo/aos$e;->a()V

    .line 153
    :cond_0
    return-void
.end method

.method public d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 2

    .line 126
    iget-object v0, p0, Lo/aos$2;->e:Lo/aos$e;

    if-eqz v0, :cond_2

    .line 128
    if-nez p1, :cond_0

    .line 130
    const-string v0, "AccountCheckManager"

    const-string v1, "requestUserSNSInfo infoCallback info is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lo/aos$2;->e:Lo/aos$e;

    invoke-interface {v0}, Lo/aos$e;->a()V

    .line 132
    return-void

    .line 134
    :cond_0
    iget-object v0, p0, Lo/aos$2;->c:Lo/aos;

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getNickName_()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aos;->a(Lo/aos;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    iget-object v0, p0, Lo/aos$2;->e:Lo/aos$e;

    invoke-interface {v0}, Lo/aos$e;->b()V

    goto :goto_0

    .line 140
    :cond_1
    iget-object v0, p0, Lo/aos$2;->e:Lo/aos$e;

    invoke-interface {v0}, Lo/aos$e;->c()V

    .line 143
    :cond_2
    :goto_0
    return-void
.end method
