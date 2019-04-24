.class final Lcom/huawei/hwCloudJs/service/hms/b$b$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/service/hms/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/hms/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "intent.extra.RESULT"


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/hms/api/HuaweiApiClient;>;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;"
        }
    .end annotation
.end field

.field private d:Lcom/huawei/hwCloudJs/core/JsCallback;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Lcom/huawei/hwCloudJs/core/JsCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/ref/WeakReference<Lcom/huawei/hms/api/HuaweiApiClient;>;Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;Lcom/huawei/hwCloudJs/core/JsCallback;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/b$b$a;->b:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/service/hms/b$b$a;->c:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/huawei/hwCloudJs/service/hms/b$b$a;->d:Lcom/huawei/hwCloudJs/core/JsCallback;

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwCloudJs/service/hms/a$b;)V
    .locals 5

    const/4 v3, -0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/hms/a$b;->b()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/service/hms/a$b;->a()Landroid/content/Intent;

    move-result-object v4

    if-eqz v4, :cond_0

    const-string v0, "intent.extra.RESULT"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    :cond_0
    const-string v0, "HmsCoreApiHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JS ConnFailResult result "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v3, :cond_3

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$b$a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hms/api/HuaweiApiClient;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v4}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "HmsCoreApiHelper"

    const-string v1, "JS ConnFailResult connect "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$b$a;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$b$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v4, v0}, Lcom/huawei/hms/api/HuaweiApiClient;->connect(Landroid/app/Activity;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hms/api/HuaweiApiClient;->connect(Landroid/app/Activity;)V

    :cond_2
    :goto_0
    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v0, "HmsCoreApiHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JS ConnFailResult onConnectionFailed  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$b$a;->d:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-virtual {v0, v4}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(Ljava/lang/String;)V

    :goto_1
    return-void
.end method
