.class public Lcom/huawei/common/applog/SdCardPermissionActvity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "AppLogApi/SdCardPermissionActvity"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private a(Z)V
    .locals 4

    .line 61
    invoke-static {}, Lcom/huawei/common/applog/bean/d;->a()Lcom/huawei/common/applog/bean/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/d;->d()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 62
    invoke-static {}, Lcom/huawei/common/applog/bean/d;->a()Lcom/huawei/common/applog/bean/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/d;->d()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 63
    :try_start_0
    invoke-static {}, Lcom/huawei/common/applog/bean/d;->a()Lcom/huawei/common/applog/bean/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/common/applog/bean/d;->a(Z)V

    .line 64
    invoke-static {}, Lcom/huawei/common/applog/bean/d;->a()Lcom/huawei/common/applog/bean/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/common/applog/bean/d;->b(Z)V

    .line 65
    invoke-static {}, Lcom/huawei/common/applog/bean/d;->a()Lcom/huawei/common/applog/bean/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/d;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 68
    :cond_0
    :goto_0
    return-void
.end method

.method private a([I)Z
    .locals 2

    .line 72
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    aget v0, p1, v0

    if-nez v0, :cond_0

    .line 74
    const/4 v0, 0x1

    return v0

    .line 76
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 31
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/common/applog/SdCardPermissionActvity;->requestWindowFeature(I)Z

    .line 32
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 34
    invoke-virtual {p0}, Lcom/huawei/common/applog/SdCardPermissionActvity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 35
    invoke-virtual {p0}, Lcom/huawei/common/applog/SdCardPermissionActvity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 37
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/16 v1, 0x1002

    invoke-static {p0, v0, v1}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    return-void

    .line 42
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/common/applog/SdCardPermissionActvity;->a(Z)V

    .line 43
    invoke-virtual {p0}, Lcom/huawei/common/applog/SdCardPermissionActvity;->finish()V

    .line 45
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    .line 21
    const/16 v0, 0x1002

    if-ne p1, v0, :cond_0

    .line 22
    const-string v0, "AppLogApi/SdCardPermissionActvity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "agree sdcard permission ?="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0, p3}, Lcom/huawei/common/applog/SdCardPermissionActvity;->a([I)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    invoke-direct {p0, p3}, Lcom/huawei/common/applog/SdCardPermissionActvity;->a([I)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/common/applog/SdCardPermissionActvity;->a(Z)V

    .line 24
    invoke-virtual {p0}, Lcom/huawei/common/applog/SdCardPermissionActvity;->finish()V

    .line 26
    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 50
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 51
    const-string v0, "AppLogApi/SdCardPermissionActvity"

    const-string v1, "in onstop() not allowed sdcard permission"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/common/applog/SdCardPermissionActvity;->a(Z)V

    .line 53
    invoke-virtual {p0}, Lcom/huawei/common/applog/SdCardPermissionActvity;->finish()V

    .line 55
    return-void
.end method
