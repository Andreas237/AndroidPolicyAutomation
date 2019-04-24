.class Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V
    .locals 0

    .line 520
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$6;->e:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 9

    .line 523
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkAliAuth getThirdAuthorization isSuccess = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    if-eqz p3, :cond_2

    .line 525
    const-class v0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;

    invoke-static {p2, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;

    .line 526
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;->getThirdAuthTokenList()Ljava/util/List;

    move-result-object v5

    .line 527
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 529
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;

    .line 530
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->getThirdAccountType()I

    move-result v0

    const/16 v1, 0x18

    if-ne v1, v0, :cond_0

    .line 531
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAliAuth bound"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 532
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$6;->e:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    move-result-object v0

    const/16 v1, 0xce

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v8

    .line 533
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$6;->e:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 534
    return-void

    .line 536
    :cond_0
    goto :goto_0

    .line 537
    :cond_1
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAliAuth unbound"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 538
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$6;->e:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    move-result-object v0

    const/16 v1, 0xcf

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 539
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$6;->e:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 543
    :cond_2
    return-void
.end method
