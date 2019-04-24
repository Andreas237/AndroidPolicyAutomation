.class Lo/awj$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awj;->a(Lo/awj$a;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/awj;

.field final synthetic e:Lo/awj$a;


# direct methods
.method constructor <init>(Lo/awj;Lo/awj$a;)V
    .locals 0

    .line 637
    iput-object p1, p0, Lo/awj$9;->a:Lo/awj;

    iput-object p2, p0, Lo/awj$9;->e:Lo/awj$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 637
    invoke-virtual {p0, p1}, Lo/awj$9;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 7

    .line 643
    new-instance v3, Lcom/huawei/health/sns/server/setting/GetUserSettingRequest;

    invoke-direct {v3}, Lcom/huawei/health/sns/server/setting/GetUserSettingRequest;-><init>()V

    .line 644
    invoke-static {v3}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v4

    .line 646
    const/4 v5, 0x0

    .line 647
    iget v0, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_3

    .line 650
    iget v0, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_1

    .line 652
    instance-of v0, v4, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;

    if-eqz v0, :cond_4

    .line 654
    move-object v6, v4

    check-cast v6, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;

    .line 655
    iget-object v0, p0, Lo/awj$9;->a:Lo/awj;

    invoke-static {v0, v6}, Lo/awj;->c(Lo/awj;Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v5

    .line 656
    iget-object v0, p0, Lo/awj$9;->a:Lo/awj;

    invoke-static {v0, v5}, Lo/awj;->c(Lo/awj;Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V

    .line 657
    iget-object v0, p0, Lo/awj$9;->e:Lo/awj$a;

    if-eqz v0, :cond_0

    .line 659
    iget-object v0, p0, Lo/awj$9;->e:Lo/awj$a;

    invoke-interface {v0, v5}, Lo/awj$a;->d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V

    .line 661
    :cond_0
    goto :goto_0

    .line 665
    :cond_1
    iget-object v0, p0, Lo/awj$9;->e:Lo/awj$a;

    if-eqz v0, :cond_2

    .line 667
    iget-object v0, p0, Lo/awj$9;->e:Lo/awj$a;

    iget v1, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-interface {v0, v1}, Lo/awj$a;->c(I)V

    .line 669
    :cond_2
    const-string v0, "SettingManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestUserSNSInfo() error! resultCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 674
    :cond_3
    const-string v0, "SettingManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestUserSNSInfo() error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 675
    iget-object v0, p0, Lo/awj$9;->e:Lo/awj$a;

    if-eqz v0, :cond_4

    .line 677
    iget-object v0, p0, Lo/awj$9;->e:Lo/awj$a;

    iget v1, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-interface {v0, v1}, Lo/awj$a;->c(I)V

    .line 680
    :cond_4
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
