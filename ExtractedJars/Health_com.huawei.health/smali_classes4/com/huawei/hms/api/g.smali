.class Lcom/huawei/hms/api/g;
.super Lcom/huawei/hms/core/aidl/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/support/api/client/ResultCallback;

.field final synthetic b:Lcom/huawei/hms/api/HuaweiApiClientImpl;


# direct methods
.method constructor <init>(Lcom/huawei/hms/api/HuaweiApiClientImpl;Lcom/huawei/hms/support/api/client/ResultCallback;)V
    .locals 0

    .line 1166
    iput-object p1, p0, Lcom/huawei/hms/api/g;->b:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    iput-object p2, p0, Lcom/huawei/hms/api/g;->a:Lcom/huawei/hms/support/api/client/ResultCallback;

    invoke-direct {p0}, Lcom/huawei/hms/core/aidl/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public call(Lcom/huawei/hms/core/aidl/b;)V
    .locals 7

    .line 1169
    if-eqz p1, :cond_0

    .line 1170
    invoke-virtual {p1}, Lcom/huawei/hms/core/aidl/b;->c()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/hms/core/aidl/a;->a(I)Lcom/huawei/hms/core/aidl/f;

    move-result-object v4

    .line 1171
    new-instance v5, Lcom/huawei/hms/core/aidl/ResponseHeader;

    invoke-direct {v5}, Lcom/huawei/hms/core/aidl/ResponseHeader;-><init>()V

    .line 1172
    iget-object v0, p1, Lcom/huawei/hms/core/aidl/b;->b:Landroid/os/Bundle;

    invoke-virtual {v4, v0, v5}, Lcom/huawei/hms/core/aidl/f;->a(Landroid/os/Bundle;Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/core/aidl/IMessageEntity;

    .line 1173
    new-instance v6, Lcom/huawei/hms/support/api/client/BundleResult;

    invoke-virtual {v5}, Lcom/huawei/hms/core/aidl/ResponseHeader;->getStatusCode()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hms/core/aidl/b;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Lcom/huawei/hms/support/api/client/BundleResult;-><init>(ILandroid/os/Bundle;)V

    .line 1174
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "Exit asyncRequest onResult"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1175
    iget-object v0, p0, Lcom/huawei/hms/api/g;->a:Lcom/huawei/hms/support/api/client/ResultCallback;

    invoke-interface {v0, v6}, Lcom/huawei/hms/support/api/client/ResultCallback;->onResult(Ljava/lang/Object;)V

    .line 1176
    goto :goto_0

    .line 1177
    :cond_0
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "Exit asyncRequest onResult -1"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1178
    iget-object v0, p0, Lcom/huawei/hms/api/g;->a:Lcom/huawei/hms/support/api/client/ResultCallback;

    new-instance v1, Lcom/huawei/hms/support/api/client/BundleResult;

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/huawei/hms/support/api/client/BundleResult;-><init>(ILandroid/os/Bundle;)V

    invoke-interface {v0, v1}, Lcom/huawei/hms/support/api/client/ResultCallback;->onResult(Ljava/lang/Object;)V

    .line 1180
    :goto_0
    return-void
.end method
