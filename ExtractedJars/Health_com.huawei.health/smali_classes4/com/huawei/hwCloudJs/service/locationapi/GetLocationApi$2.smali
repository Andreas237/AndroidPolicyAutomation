.class Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/api/ILocDialog$DialogResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->b(Landroid/content/Context;Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;Lcom/huawei/hwCloudJs/core/JsCallback;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/huawei/hwCloudJs/core/JsCallback;

.field final synthetic d:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;


# direct methods
.method constructor <init>(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;Landroid/content/Context;Lcom/huawei/hwCloudJs/core/JsCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->d:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->a:Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;

    iput-object p3, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->b:Landroid/content/Context;

    iput-object p4, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->c:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onNeg()V
    .locals 3

    const-string v0, "GetLocationApi"

    const-string v1, "NOTAllowUseLocatioListener onClick"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->d:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->d(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;)Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->d:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->d(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->d:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->a(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;Landroid/app/Dialog;)Landroid/app/Dialog;

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->c:Lcom/huawei/hwCloudJs/core/JsCallback;

    const-string v1, "NOTAllowUseLocation!"

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(ILjava/lang/String;)V

    return-void
.end method

.method public onPos()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->d:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->a:Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;

    invoke-virtual {v1}, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;->getAppId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->a(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->d:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->a:Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;

    iget-object v3, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$2;->c:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->a(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;Landroid/content/Context;Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;Lcom/huawei/hwCloudJs/core/JsCallback;)V

    return-void
.end method
