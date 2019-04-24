.class Lcom/huawei/hwid/core/b/a/a/e$b;
.super Lcom/huawei/hwid/core/helper/handler/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/b/a/a/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Lcom/huawei/cloudservice/CloudRequestHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 0

    .line 261
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/helper/handler/a;-><init>(Landroid/content/Context;)V

    .line 262
    iput-object p2, p0, Lcom/huawei/hwid/core/b/a/a/e$b;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    .line 263
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 1

    .line 267
    invoke-super {p0, p1}, Lcom/huawei/hwid/core/helper/handler/a;->a(Landroid/os/Bundle;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e$b;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, p1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    .line 269
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 5

    .line 273
    invoke-super {p0, p1}, Lcom/huawei/hwid/core/helper/handler/a;->b(Landroid/os/Bundle;)V

    .line 274
    const-string v0, "requestError"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    .line 275
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 276
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e$b;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v4}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 278
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/e$b;->a:Lcom/huawei/cloudservice/CloudRequestHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "ErrorStatus is null"

    const/16 v3, 0x20

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 280
    :goto_0
    return-void
.end method
