.class Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->i()V
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
.field final synthetic c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V
    .locals 0

    .line 351
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$9;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 9

    .line 354
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startAliSportActivity getThirdAuthorization isSuccess = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$9;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->a()V

    .line 356
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$9;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/thirdpartservice/activity/alisport/AliSportActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 357
    const-string v0, "AUTH_STATUS"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 358
    if-eqz p3, :cond_2

    .line 359
    const-class v0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;

    invoke-static {p2, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;

    .line 360
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;->getThirdAuthTokenList()Ljava/util/List;

    move-result-object v6

    .line 361
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 363
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;

    .line 364
    invoke-virtual {v8}, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;->getThirdAccountType()I

    move-result v0

    const/16 v1, 0x18

    if-ne v1, v0, :cond_0

    .line 365
    const-string v0, "AUTH_STATUS"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 367
    :cond_0
    goto :goto_0

    .line 371
    :cond_1
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 372
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    const-string v0, "click_ali_entrance"

    const-string v1, "1"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    sget-object v0, Lo/dae;->iS:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    .line 375
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$9;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v8, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 376
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BI save notification click event finish, value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$9;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->startActivity(Landroid/content/Intent;)V

    .line 379
    goto :goto_1

    .line 380
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$9;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 381
    const/16 v0, 0x3e9

    iput v0, v5, Landroid/os/Message;->what:I

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$9;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 384
    :goto_1
    return-void
.end method
