.class Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/accounts/AccountManagerCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/accounts/AccountManagerCallback<Landroid/os/Bundle;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;)V
    .locals 0

    .line 465
    iput-object p1, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$b;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$1;)V
    .locals 0

    .line 465
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$b;-><init>(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;)V

    return-void
.end method


# virtual methods
.method public run(Landroid/accounts/AccountManagerFuture;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/accounts/AccountManagerFuture<Landroid/os/Bundle;>;)V"
        }
    .end annotation

    .line 471
    if-eqz p1, :cond_0

    .line 472
    :try_start_0
    invoke-interface {p1}, Landroid/accounts/AccountManagerFuture;->getResult()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Bundle;

    .line 480
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$b;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-static {v0, v2}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 481
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$b;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$b;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-static {v1}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->c(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;)Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->b(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Landroid/os/Bundle;)V

    .line 482
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$b;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V
    :try_end_0
    .catch Landroid/accounts/OperationCanceledException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/accounts/AuthenticatorException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 495
    :cond_0
    goto :goto_0

    .line 484
    :catch_0
    move-exception v2

    .line 485
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$b;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 486
    const-string v0, "DummyActivity"

    const-string v1, "OperationCanceledException / "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 495
    goto :goto_0

    .line 487
    :catch_1
    move-exception v2

    .line 488
    :try_start_2
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$b;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 489
    const-string v0, "DummyActivity"

    const-string v1, "AuthenticatorException / "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 495
    goto :goto_0

    .line 490
    :catch_2
    move-exception v2

    .line 491
    :try_start_3
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$b;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 492
    const-string v0, "DummyActivity"

    const-string v1, "IOException / "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 495
    goto :goto_0

    .line 493
    :catchall_0
    move-exception v3

    throw v3

    .line 496
    :goto_0
    return-void
.end method
