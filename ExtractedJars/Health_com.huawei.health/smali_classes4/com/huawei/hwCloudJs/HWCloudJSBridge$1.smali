.class Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/service/a/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lorg/json/JSONObject;

.field final synthetic e:Lcom/huawei/hwCloudJs/HWCloudJSBridge;


# direct methods
.method constructor <init>(Lcom/huawei/hwCloudJs/HWCloudJSBridge;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->e:Lcom/huawei/hwCloudJs/HWCloudJSBridge;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->c:Ljava/util/List;

    iput-object p5, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->d:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 5

    if-nez p1, :cond_0

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS configAuthSUC"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->e:Lcom/huawei/hwCloudJs/HWCloudJSBridge;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->c:Ljava/util/List;

    iget-object v4, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->d:Lorg/json/JSONObject;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Lcom/huawei/hwCloudJs/HWCloudJSBridge;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->e:Lcom/huawei/hwCloudJs/HWCloudJSBridge;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Lcom/huawei/hwCloudJs/HWCloudJSBridge;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;)V

    goto/16 :goto_0

    :cond_0
    const/4 v0, -0x2

    if-ne p1, v0, :cond_1

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS AUTH_FAIL_NO_NET"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->e:Lcom/huawei/hwCloudJs/HWCloudJSBridge;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Lcom/huawei/hwCloudJs/HWCloudJSBridge;)Landroid/webkit/WebView;

    move-result-object v0

    const/16 v1, 0xc

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;I)V

    goto/16 :goto_0

    :cond_1
    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS AUTH_FAIL"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->e:Lcom/huawei/hwCloudJs/HWCloudJSBridge;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Lcom/huawei/hwCloudJs/HWCloudJSBridge;)Landroid/webkit/WebView;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;I)V

    goto :goto_0

    :cond_2
    const/4 v0, -0x3

    if-ne p1, v0, :cond_3

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS AUTH_FAIL_NET_ERROR"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->e:Lcom/huawei/hwCloudJs/HWCloudJSBridge;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Lcom/huawei/hwCloudJs/HWCloudJSBridge;)Landroid/webkit/WebView;

    move-result-object v0

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;I)V

    goto :goto_0

    :cond_3
    const/4 v0, -0x4

    if-ne p1, v0, :cond_4

    const-string v0, "HWCloudJSBridge"

    const-string v1, "JS AUTH_FAIL_OTHER"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->e:Lcom/huawei/hwCloudJs/HWCloudJSBridge;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Lcom/huawei/hwCloudJs/HWCloudJSBridge;)Landroid/webkit/WebView;

    move-result-object v0

    const/16 v1, 0x270f

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;I)V

    goto :goto_0

    :cond_4
    const-string v0, "HWCloudJSBridge"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JS JS_CONFIG_RET_CODE_GW_ERROR"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/HWCloudJSBridge$1;->e:Lcom/huawei/hwCloudJs/HWCloudJSBridge;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/HWCloudJSBridge;->a(Lcom/huawei/hwCloudJs/HWCloudJSBridge;)Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xe

    invoke-static {v0, v2, v1}, Lcom/huawei/hwCloudJs/c;->a(Landroid/webkit/WebView;ILjava/lang/String;)V

    :goto_0
    return-void
.end method
