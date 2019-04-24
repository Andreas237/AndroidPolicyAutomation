.class final Lcom/huawei/hwid/api/common/e$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/UseCase$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/LoginHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/cloudservice/LoginHandler;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/cloudservice/LoginHandler;Ljava/lang/String;)V
    .locals 0

    .line 871
    iput-object p1, p0, Lcom/huawei/hwid/api/common/e$2;->a:Lcom/huawei/cloudservice/LoginHandler;

    iput-object p2, p0, Lcom/huawei/hwid/api/common/e$2;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 8

    .line 874
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 875
    const-string v0, "account"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 876
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 877
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwid/core/datatype/HwAccount;

    .line 878
    invoke-static {v5}, Lcom/huawei/hwid/core/d/b;->b(Lcom/huawei/hwid/core/datatype/HwAccount;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 879
    const-string v0, "CloudAccountImpl"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 880
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$2;->a:Lcom/huawei/cloudservice/LoginHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "hwid is not login"

    const/16 v3, 0x1f

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 881
    return-void

    .line 883
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/e$2;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 884
    const/4 v0, 0x1

    new-array v6, v0, [Lcom/huawei/cloudservice/CloudAccount;

    .line 885
    new-instance v7, Lcom/huawei/hwid/api/common/e;

    invoke-direct {v7}, Lcom/huawei/hwid/api/common/e;-><init>()V

    .line 886
    invoke-static {v7, v5}, Lcom/huawei/hwid/api/common/e;->a(Lcom/huawei/hwid/api/common/e;Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 887
    new-instance v0, Lcom/huawei/cloudservice/CloudAccount;

    invoke-direct {v0, v7}, Lcom/huawei/cloudservice/CloudAccount;-><init>(Lcom/huawei/hwid/api/common/e;)V

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 888
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$2;->a:Lcom/huawei/cloudservice/LoginHandler;

    invoke-interface {v0, v6}, Lcom/huawei/cloudservice/LoginHandler;->onFinish([Lcom/huawei/cloudservice/CloudAccount;)V

    .line 889
    goto :goto_0

    .line 890
    :cond_1
    const-string v0, "CloudAccountImpl"

    const-string v1, "this userid has no accounts "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 891
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$2;->a:Lcom/huawei/cloudservice/LoginHandler;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/LoginHandler;->onFinish([Lcom/huawei/cloudservice/CloudAccount;)V

    .line 893
    :goto_0
    goto :goto_1

    .line 894
    :cond_2
    const-string v0, "CloudAccountImpl"

    const-string v1, "has no accounts"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 895
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$2;->a:Lcom/huawei/cloudservice/LoginHandler;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/LoginHandler;->onFinish([Lcom/huawei/cloudservice/CloudAccount;)V

    .line 897
    :goto_1
    goto :goto_2

    .line 898
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$2;->a:Lcom/huawei/cloudservice/LoginHandler;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/LoginHandler;->onFinish([Lcom/huawei/cloudservice/CloudAccount;)V

    .line 900
    :goto_2
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 0

    .line 904
    return-void
.end method
