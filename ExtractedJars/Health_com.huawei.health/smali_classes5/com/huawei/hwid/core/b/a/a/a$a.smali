.class Lcom/huawei/hwid/core/b/a/a/a$a;
.super Lcom/huawei/hwid/core/helper/handler/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/b/a/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/huawei/cloudservice/CloudRequestHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 0

    .line 365
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/helper/handler/a;-><init>(Landroid/content/Context;)V

    .line 366
    iput-object p2, p0, Lcom/huawei/hwid/core/b/a/a/a$a;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    .line 368
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 7

    .line 372
    invoke-super {p0, p1}, Lcom/huawei/hwid/core/helper/handler/a;->a(Landroid/os/Bundle;)V

    .line 375
    const-string v0, "getUserInfo"

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->f(Ljava/lang/String;)V

    .line 377
    const-string v0, "userInfo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/hwid/core/datatype/UserInfo;

    .line 378
    const-string v0, "userLoginInfo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwid/core/datatype/UserLoginInfo;

    .line 379
    const-string v0, "devicesInfo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 380
    const-string v0, "accountsInfo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 381
    const-string v0, "memberRights"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 382
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 383
    const-string v0, "userAccountInfo"

    invoke-virtual {v6, v0, v4}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 384
    const-string v0, "deviceInfo"

    invoke-virtual {v6, v0, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 385
    const-string v0, "userInfo"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 386
    const-string v0, "userLoginInfo"

    invoke-virtual {v6, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 387
    const-string v0, "memberRights"

    invoke-virtual {v6, v0, v5}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 388
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a$a;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v6}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    .line 389
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 5

    .line 393
    invoke-super {p0, p1}, Lcom/huawei/hwid/core/helper/handler/a;->b(Landroid/os/Bundle;)V

    .line 396
    const-string v0, "getUserInfo"

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->f(Ljava/lang/String;)V

    .line 398
    const-string v0, "requestError"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    .line 399
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 400
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a$a;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v4}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 402
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/a$a;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "ErrorStatus is null"

    const/16 v3, 0x20

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 404
    :goto_0
    return-void
.end method
