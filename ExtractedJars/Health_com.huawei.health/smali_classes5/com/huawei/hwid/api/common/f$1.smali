.class final Lcom/huawei/hwid/api/common/f$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/CloudRequestHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/f;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudAccount;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Lcom/huawei/cloudservice/CloudRequestHandler;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/huawei/hwid/api/common/f$1;->a:Landroid/os/Bundle;

    iput-object p2, p0, Lcom/huawei/hwid/api/common/f$1;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    iput-object p3, p0, Lcom/huawei/hwid/api/common/f$1;->c:Landroid/content/Context;

    iput-object p4, p0, Lcom/huawei/hwid/api/common/f$1;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/huawei/hwid/api/common/f$1;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, p1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 137
    return-void
.end method

.method public onFinish(Landroid/os/Bundle;)V
    .locals 10

    .line 98
    const-string v0, "CloudAccountImpl2"

    const-string v1, "getVerifiedPhone getUserInfo"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const-string v0, "userAccountInfo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 100
    const-string v5, ""

    .line 101
    const-string v6, ""

    .line 102
    iget-object v0, p0, Lcom/huawei/hwid/api/common/f$1;->a:Landroid/os/Bundle;

    const-string v1, "onlyQuery"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    .line 103
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 104
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 105
    invoke-static {v4}, Lcom/huawei/hwid/api/common/f;->a(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v5

    .line 106
    invoke-static {v4}, Lcom/huawei/hwid/api/common/f;->b(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v6

    .line 108
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    const-string v0, "secrityPhoneOrsecrityEmail"

    invoke-virtual {v8, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    :cond_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 112
    const-string v0, "accountName"

    invoke-virtual {v8, v0, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    :cond_1
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 116
    :cond_2
    const-string v0, "result"

    const-string v1, "1"

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/hwid/api/common/f$1;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v8}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    goto :goto_0

    .line 118
    :cond_3
    if-eqz v7, :cond_4

    .line 119
    const-string v0, "CloudAccountImpl2"

    const-string v1, "phone is not exist"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    new-instance v9, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "phone number is not exist"

    const/16 v1, 0x2e

    invoke-direct {v9, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/hwid/api/common/f$1;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v9}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 122
    goto :goto_0

    .line 123
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwid/api/common/f$1;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/f$1;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hwid/api/common/f$1;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    iget-object v3, p0, Lcom/huawei/hwid/api/common/f$1;->a:Landroid/os/Bundle;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwid/api/common/f;->b(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V

    .line 125
    :goto_0
    goto :goto_1

    :cond_5
    if-eqz v7, :cond_6

    .line 126
    const-string v0, "CloudAccountImpl2"

    const-string v1, "phone or email is not exist"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    new-instance v8, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "phone number is not exist"

    const/16 v1, 0x2e

    invoke-direct {v8, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/hwid/api/common/f$1;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v8}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 129
    goto :goto_1

    .line 130
    :cond_6
    iget-object v0, p0, Lcom/huawei/hwid/api/common/f$1;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/f$1;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hwid/api/common/f$1;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    iget-object v3, p0, Lcom/huawei/hwid/api/common/f$1;->a:Landroid/os/Bundle;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwid/api/common/f;->b(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V

    .line 132
    :goto_1
    return-void
.end method
