.class Lo/axf$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/awj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axf;->d(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic d:Lo/axf;


# direct methods
.method constructor <init>(Lo/axf;I)V
    .locals 0

    .line 49
    iput-object p1, p0, Lo/axf$1;->d:Lo/axf;

    iput p2, p0, Lo/axf$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 3

    .line 64
    const-string v0, "UserRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestSelfSNSInfo errorCallback errno:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lo/axf$1;->d:Lo/axf;

    const/16 v1, 0xaaa

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lo/axf;->b(III)V

    .line 66
    return-void
.end method

.method public d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 8

    .line 53
    if-eqz p1, :cond_0

    .line 55
    iget-object v0, p0, Lo/axf$1;->d:Lo/axf;

    invoke-static {v0, p1}, Lo/axf;->b(Lo/axf;Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v7

    .line 56
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/axa;->e(Lcom/huawei/health/sns/model/user/User;)Z

    .line 57
    iget-object v0, p0, Lo/axf$1;->d:Lo/axf;

    move-object v1, v7

    iget v2, p0, Lo/axf$1;->a:I

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lo/axf;->b(Lo/axf;Lcom/huawei/health/sns/model/user/User;IIIILjava/lang/String;)V

    .line 59
    :cond_0
    return-void
.end method
