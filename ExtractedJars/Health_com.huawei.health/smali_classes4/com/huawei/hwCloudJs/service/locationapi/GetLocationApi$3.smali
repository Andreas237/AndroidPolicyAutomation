.class Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/support/b/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->d(Landroid/content/Context;Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;Lcom/huawei/hwCloudJs/core/JsCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/huawei/hwCloudJs/support/b/b<Lcom/huawei/hwCloudJs/service/locationapi/a$a;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;

.field final synthetic c:Lcom/huawei/hwCloudJs/core/JsCallback;

.field final synthetic d:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;


# direct methods
.method constructor <init>(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;Landroid/content/Context;Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;Lcom/huawei/hwCloudJs/core/JsCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$3;->d:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$3;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$3;->b:Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;

    iput-object p4, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$3;->c:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwCloudJs/service/locationapi/a$a;)Z
    .locals 4

    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/locationapi/a$a;->a()I

    move-result v0

    const/16 v1, 0x232e

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$3;->d:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/locationapi/a$a;->b()[I

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->a(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;[I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$3;->d:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$3;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$3;->b:Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;

    iget-object v3, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$3;->c:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->b(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;Landroid/content/Context;Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;Lcom/huawei/hwCloudJs/core/JsCallback;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$3;->c:Lcom/huawei/hwCloudJs/core/JsCallback;

    const-string v1, "locationPermissionCheck false!"

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(ILjava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method

.method public synthetic onReceive(Lcom/huawei/hwCloudJs/support/b/d;)Z
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/hwCloudJs/service/locationapi/a$a;

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$3;->a(Lcom/huawei/hwCloudJs/service/locationapi/a$a;)Z

    move-result v0

    return v0
.end method
