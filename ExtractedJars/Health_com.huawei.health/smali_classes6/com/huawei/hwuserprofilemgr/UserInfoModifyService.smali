.class public Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;->c:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic d(Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;Lcom/huawei/hihealth/HiUserInfo;Ljava/lang/String;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;->e(Lcom/huawei/hihealth/HiUserInfo;Ljava/lang/String;)V

    return-void
.end method

.method private e(Lcom/huawei/hihealth/HiUserInfo;Ljava/lang/String;)V
    .locals 1

    .line 65
    new-instance v0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$4;

    invoke-direct {v0, p0, p2}, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$4;-><init>(Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;Ljava/lang/String;)V

    invoke-static {p0, p1, v0}, Lo/dnq;->e(Landroid/content/Context;Lcom/huawei/hihealth/HiUserInfo;Lo/cyx;)V

    .line 89
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 93
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 1

    .line 29
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 30
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;->c:Ljava/util/concurrent/ExecutorService;

    .line 31
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 99
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 100
    iget-object v0, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;->c:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;->c:Ljava/util/concurrent/ExecutorService;

    .line 104
    :cond_0
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 6

    .line 36
    if-nez p1, :cond_0

    .line 37
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 39
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 40
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0

    .line 42
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "modifyUserData"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 43
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_2

    .line 44
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0

    .line 46
    :cond_2
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "userInfo"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiUserInfo;

    .line 47
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 48
    const-string v0, "UserInfoModifyService"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modifyUserInfo height:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " weight:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " unit:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiUserInfo;->getUnitType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    :cond_3
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "uuid"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 51
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_5

    .line 52
    :cond_4
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0

    .line 54
    :cond_5
    iget-object v0, p0, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$5;

    invoke-direct {v1, p0, v4, v5}, Lcom/huawei/hwuserprofilemgr/UserInfoModifyService$5;-><init>(Lcom/huawei/hwuserprofilemgr/UserInfoModifyService;Lcom/huawei/hihealth/HiUserInfo;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 61
    :cond_6
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method
