.class Lo/ale$36;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->h(Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ale;

.field final synthetic c:[Z

.field final synthetic d:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Lo/ale;Ljava/util/concurrent/CountDownLatch;[Z)V
    .locals 0

    .line 3049
    iput-object p1, p0, Lo/ale$36;->b:Lo/ale;

    iput-object p2, p0, Lo/ale$36;->d:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, Lo/ale$36;->c:[Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 5

    .line 3093
    iget-object v0, p0, Lo/ale$36;->b:Lo/ale;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ale;->e(Lo/ale;Lcom/huawei/hihealth/HiAccountInfo;)Lcom/huawei/hihealth/HiAccountInfo;

    .line 3095
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo data == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3096
    iget-object v0, p0, Lo/ale$36;->c:[Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-boolean v1, v0, v2

    .line 3097
    iget-object v0, p0, Lo/ale$36;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 3101
    goto :goto_0

    .line 3098
    :catch_0
    move-exception v4

    .line 3099
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: 2.0isLogin e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3100
    iget-object v0, p0, Lo/ale$36;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 3102
    :goto_0
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 5

    .line 3052
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3053
    iget-object v0, p0, Lo/ale$36;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->H(Lo/ale;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 3054
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo success accountType=1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3055
    iget-object v0, p0, Lo/ale$36;->d:Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3056
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo success accountType=1 null != latch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3058
    :try_start_0
    iget-object v0, p0, Lo/ale$36;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 3061
    goto :goto_0

    .line 3059
    :catch_0
    move-exception v4

    .line 3060
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo success222"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3063
    :cond_0
    :goto_0
    return-void

    .line 3065
    :cond_1
    iget-object v0, p0, Lo/ale$36;->b:Lo/ale;

    move-object v1, p2

    check-cast v1, Lcom/huawei/hihealth/HiAccountInfo;

    invoke-static {v0, v1}, Lo/ale;->e(Lo/ale;Lcom/huawei/hihealth/HiAccountInfo;)Lcom/huawei/hihealth/HiAccountInfo;

    .line 3066
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login hiAccountInfo huid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale$36;->b:Lo/ale;

    invoke-static {v2}, Lo/ale;->w(Lo/ale;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " st = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale$36;->b:Lo/ale;

    invoke-static {v2}, Lo/ale;->w(Lo/ale;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAccountInfo;->getServiceToken()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " sitid = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale$36;->b:Lo/ale;

    invoke-static {v2}, Lo/ale;->w(Lo/ale;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAccountInfo;->getSiteId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3067
    iget-object v0, p0, Lo/ale$36;->b:Lo/ale;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/ale;->f(Lo/ale;I)I

    .line 3069
    :try_start_1
    iget-object v0, p0, Lo/ale$36;->c:[Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    aput-boolean v1, v0, v2

    .line 3070
    iget-object v0, p0, Lo/ale$36;->b:Lo/ale;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ale;->g(Lo/ale;I)I

    .line 3071
    iget-object v0, p0, Lo/ale$36;->b:Lo/ale;

    iget-object v1, p0, Lo/ale$36;->b:Lo/ale;

    invoke-static {v1}, Lo/ale;->w(Lo/ale;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ale;->c(Lo/ale;Ljava/lang/String;)Ljava/lang/String;

    .line 3072
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo hiAccountInfo huid is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale$36;->b:Lo/ale;

    invoke-static {v2}, Lo/ale;->w(Lo/ale;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " oldHuid = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale$36;->b:Lo/ale;

    invoke-static {v2}, Lo/ale;->z(Lo/ale;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3073
    const-string v0, "com.huawei.health"

    iget-object v1, p0, Lo/ale$36;->b:Lo/ale;

    invoke-static {v1}, Lo/ale;->z(Lo/ale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "health_cloud.db"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3074
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo 11111"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3075
    iget-object v0, p0, Lo/ale$36;->c:[Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-boolean v1, v0, v2

    .line 3076
    iget-object v0, p0, Lo/ale$36;->b:Lo/ale;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ale;->e(Lo/ale;Lcom/huawei/hihealth/HiAccountInfo;)Lcom/huawei/hihealth/HiAccountInfo;

    .line 3077
    iget-object v0, p0, Lo/ale$36;->b:Lo/ale;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ale;->g(Lo/ale;I)I

    .line 3078
    iget-object v0, p0, Lo/ale$36;->b:Lo/ale;

    const-string v1, ""

    invoke-static {v0, v1}, Lo/ale;->c(Lo/ale;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    .line 3079
    :cond_2
    const-string v0, "com.huawei.health"

    iget-object v1, p0, Lo/ale$36;->b:Lo/ale;

    invoke-static {v1}, Lo/ale;->z(Lo/ale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3080
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login checkAccountChange fetchAccountInfo 22222"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3081
    iget-object v0, p0, Lo/ale$36;->b:Lo/ale;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ale;->b(Lo/ale;Z)Z

    .line 3083
    :cond_3
    :goto_1
    iget-object v0, p0, Lo/ale$36;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 3084
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "fetchAccountInfo success"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 3088
    goto :goto_2

    .line 3085
    :catch_1
    move-exception v4

    .line 3086
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: 2.0isLogin e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3087
    iget-object v0, p0, Lo/ale$36;->d:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 3089
    :goto_2
    return-void
.end method
