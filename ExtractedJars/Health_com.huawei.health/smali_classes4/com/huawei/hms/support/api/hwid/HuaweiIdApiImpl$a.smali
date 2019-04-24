.class Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/support/api/client/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/huawei/hms/support/api/client/ResultCallback<Lcom/huawei/hms/support/api/ResolveResult<Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;


# direct methods
.method private constructor <init>(Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl$a;->a:Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;Lcom/huawei/hms/support/api/hwid/b;)V
    .locals 0

    .line 277
    invoke-direct {p0, p1}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl$a;-><init>(Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/support/api/ResolveResult;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/ResolveResult<Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;>;)V"
        }
    .end annotation

    .line 280
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/ResolveResult;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/client/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 282
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/ResolveResult;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;

    .line 283
    invoke-virtual {v2}, Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;->getNoticeIntent()Landroid/content/Intent;

    move-result-object v3

    .line 284
    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;->getStatusCode()I

    move-result v0

    if-nez v0, :cond_1

    .line 286
    const-string v0, "HuaweiIdApiImpl"

    const-string v1, "get notice has intent."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl$a;->a:Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;

    invoke-static {v0}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->b(Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl$a;->a:Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;

    invoke-static {v1}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->a(Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;)Lcom/huawei/hms/api/HuaweiApiClient;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/api/HuaweiApiClient;->getTopActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/c/j;->a(Landroid/app/Activity;Landroid/app/Activity;)Landroid/app/Activity;

    move-result-object v4

    .line 289
    if-nez v4, :cond_0

    .line 291
    const-string v0, "HuaweiIdApiImpl"

    const-string v1, "showNotice no valid activity!"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    return-void

    .line 295
    :cond_0
    invoke-virtual {v4, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 298
    :cond_1
    return-void
.end method

.method public synthetic onResult(Ljava/lang/Object;)V
    .locals 1

    .line 277
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/ResolveResult;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl$a;->a(Lcom/huawei/hms/support/api/ResolveResult;)V

    return-void
.end method
