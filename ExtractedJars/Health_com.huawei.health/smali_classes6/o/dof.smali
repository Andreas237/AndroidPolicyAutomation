.class public Lo/dof;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod$b;


# instance fields
.field private b:Z

.field private c:Landroid/content/Context;

.field private e:Lo/czn;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dof;->c:Landroid/content/Context;

    .line 21
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dof;->b:Z

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dof;->e:Lo/czn;

    .line 27
    iput-object p1, p0, Lo/dof;->c:Landroid/content/Context;

    .line 29
    invoke-static {p1}, Lo/czn;->e(Landroid/content/Context;)Lo/czn;

    move-result-object v0

    iput-object v0, p0, Lo/dof;->e:Lo/czn;

    .line 30
    return-void
.end method


# virtual methods
.method public e()V
    .locals 3

    .line 105
    move-object v1, p0

    monitor-enter v1

    .line 106
    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lo/dof;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 108
    :goto_0
    return-void
.end method

.method public e(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    .locals 7

    .line 33
    move-object v4, p0

    monitor-enter v4

    .line 34
    :try_start_0
    iget-boolean v0, p0, Lo/dof;->b:Z

    if-eqz v0, :cond_0

    .line 35
    const-string v0, "UpWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "block!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    monitor-exit v4

    return-void

    .line 39
    :cond_0
    if-nez p1, :cond_1

    .line 41
    const-string v0, "UpWriter"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userInfo null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    const/4 v0, -0x1

    invoke-static {p2, v0}, Lo/doe;->a(Lo/dod$b$d;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    monitor-exit v4

    return-void

    .line 46
    :cond_1
    :try_start_2
    new-instance v5, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v5}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 48
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setName(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setGender(Ljava/lang/Integer;)V

    .line 51
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setPortraitUrl(Ljava/lang/String;)V

    .line 53
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 56
    const-string v0, "19900801"

    invoke-virtual {p1, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    .line 59
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthdayStatus()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UNSETED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 60
    const-string v0, ""

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    goto :goto_0

    .line 62
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    .line 63
    const-string v0, "UpWriter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userInToWrite.setBirthday:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getLanguageCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setLanguageCode(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setHeight(Ljava/lang/Integer;)V

    .line 68
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setWeight(Ljava/lang/Float;)V

    .line 69
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getClientSet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setClientSet(Ljava/lang/Integer;)V

    .line 71
    iget-object v0, p0, Lo/dof;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 72
    const-string v0, "UpWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "K Scence logined by wear,dircet return success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    invoke-static {p2}, Lo/doe;->e(Lo/dod$b$d;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    monitor-exit v4

    return-void

    .line 78
    :cond_4
    :try_start_3
    iget-object v0, p0, Lo/dof;->e:Lo/czn;

    iget-object v1, p0, Lo/dof;->c:Landroid/content/Context;

    new-instance v2, Lo/dof$1;

    invoke-direct {v2, p0, p2}, Lo/dof$1;-><init>(Lo/dof;Lo/dod$b$d;)V

    invoke-virtual {v0, v1, v5, v2}, Lo/czn;->d(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 93
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 94
    :goto_1
    return-void
.end method
