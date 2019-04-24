.class Lcom/huawei/hwid/api/common/e$1$1;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/e$1;->onFinish(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/e$1;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/e$1;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/hwid/api/common/e$1$1;->a:Lcom/huawei/hwid/api/common/e$1;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 95
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$1$1;->a:Lcom/huawei/hwid/api/common/e$1;

    iget-object v0, v0, Lcom/huawei/hwid/api/common/e$1;->a:Lcom/huawei/hwid/api/common/e;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/e$1$1;->a:Lcom/huawei/hwid/api/common/e$1;

    iget-object v1, v1, Lcom/huawei/hwid/api/common/e$1;->a:Lcom/huawei/hwid/api/common/e;

    invoke-static {v1}, Lcom/huawei/hwid/api/common/e;->a(Lcom/huawei/hwid/api/common/e;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwid/api/common/e$1$1;->a:Lcom/huawei/hwid/api/common/e$1;

    iget-object v2, v2, Lcom/huawei/hwid/api/common/e$1;->a:Lcom/huawei/hwid/api/common/e;

    invoke-static {v2}, Lcom/huawei/hwid/api/common/e;->b(Lcom/huawei/hwid/api/common/e;)Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwid/api/common/e$1$1;->a:Lcom/huawei/hwid/api/common/e$1;

    iget-object v3, v3, Lcom/huawei/hwid/api/common/e$1;->a:Lcom/huawei/hwid/api/common/e;

    invoke-static {v3}, Lcom/huawei/hwid/api/common/e;->c(Lcom/huawei/hwid/api/common/e;)Lcom/huawei/cloudservice/CloudRequestHandler;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwid/api/common/e;->a(Lcom/huawei/hwid/api/common/e;Ljava/lang/String;Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 96
    return-void
.end method
