.class Lcom/huawei/hwid/api/common/e$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/CloudRequestHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/api/common/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/e;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/e;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/huawei/hwid/api/common/e$1;->a:Lcom/huawei/hwid/api/common/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$1;->a:Lcom/huawei/hwid/api/common/e;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/e;->c(Lcom/huawei/hwid/api/common/e;)Lcom/huawei/cloudservice/CloudRequestHandler;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 105
    return-void
.end method

.method public onFinish(Landroid/os/Bundle;)V
    .locals 1

    .line 93
    new-instance v0, Lcom/huawei/hwid/api/common/e$1$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwid/api/common/e$1$1;-><init>(Lcom/huawei/hwid/api/common/e$1;)V

    .line 99
    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/e$1$1;->start()V

    .line 100
    return-void
.end method
