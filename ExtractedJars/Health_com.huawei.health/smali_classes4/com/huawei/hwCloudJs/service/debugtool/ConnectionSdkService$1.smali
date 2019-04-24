.class Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService$1;
.super Lcom/huawei/hwCloudJs/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService;


# direct methods
.method constructor <init>(Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService$1;->b:Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService;

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/a/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)I
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    const-string v0, "appId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "url"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "pkg"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, -0x1

    return v0

    :cond_2
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService$1;->b:Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService;

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    if-nez v4, :cond_3

    const/4 v0, -0x1

    return v0

    :cond_3
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    array-length v0, v5

    if-nez v0, :cond_5

    :cond_4
    const/4 v0, -0x1

    return v0

    :cond_5
    const-string v6, ""

    move-object v7, v5

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_7

    aget-object v10, v7, v9

    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    move-object v6, v10

    goto :goto_1

    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService$1;->b:Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService;

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/service/debugtool/ConnectionSdkService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v6}, Lcom/huawei/hwCloudJs/d/f;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, Lcom/huawei/hwCloudJs/service/a/b;->a()Lcom/huawei/hwCloudJs/service/a/b;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwCloudJs/service/a/b;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;->a()Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;->b()Lcom/huawei/hwCloudJs/service/debugtool/SetUrl$GetUrlCallBack;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {}, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;->a()Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;->b()Lcom/huawei/hwCloudJs/service/debugtool/SetUrl$GetUrlCallBack;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl$GetUrlCallBack;->OnResult(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_8
    const/4 v0, -0x2

    return v0

    :cond_9
    const/4 v0, -0x2

    return v0

    :cond_a
    const/4 v0, -0x2

    return v0
.end method
