.class Lcom/huawei/hwid/api/common/p$1$1;
.super Lcom/huawei/hwid/core/helper/handler/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/p$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/p$1;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/p$1;Landroid/content/Context;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/huawei/hwid/api/common/p$1$1;->a:Lcom/huawei/hwid/api/common/p$1;

    invoke-direct {p0, p2}, Lcom/huawei/hwid/core/helper/handler/a;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    .line 139
    const-string v0, "TmpCloudRequestHandler"

    const-string v1, "onSuccess"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2

    .line 144
    const-string v0, "TmpCloudRequestHandler"

    const-string v1, "onFail"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    return-void
.end method
