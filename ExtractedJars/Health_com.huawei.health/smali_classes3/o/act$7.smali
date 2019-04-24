.class Lo/act$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/act;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/act;


# direct methods
.method constructor <init>(Lo/act;)V
    .locals 0

    .line 471
    iput-object p1, p0, Lo/act$7;->c:Lo/act;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 501
    invoke-static {}, Lo/act;->k()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "falied to retrieve user info"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 6

    .line 474
    invoke-static {}, Lo/act;->k()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refetchMainUserInfo HiCommonListener onSuccess pid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",tid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    if-eqz p2, :cond_2

    .line 478
    move-object v4, p2

    :try_start_0
    check-cast v4, Ljava/util/List;

    .line 479
    const/4 v5, 0x0

    .line 480
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 481
    const/4 v5, 0x1

    .line 483
    :cond_0
    iget-object v0, p0, Lo/act$7;->c:Lo/act;

    invoke-static {v0}, Lo/act;->c(Lo/act;)Lo/acu;

    move-result-object v0

    if-nez v0, :cond_1

    .line 484
    iget-object v0, p0, Lo/act$7;->c:Lo/act;

    new-instance v1, Lo/acu;

    invoke-direct {v1}, Lo/acu;-><init>()V

    invoke-static {v0, v1}, Lo/act;->a(Lo/act;Lo/acu;)Lo/acu;

    .line 485
    iget-object v0, p0, Lo/act$7;->c:Lo/act;

    invoke-static {v0}, Lo/act;->c(Lo/act;)Lo/acu;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/acu;->a(I)V

    .line 486
    iget-object v0, p0, Lo/act$7;->c:Lo/act;

    invoke-static {v0}, Lo/act;->c(Lo/act;)Lo/acu;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/acu;->b(Ljava/lang/String;)V

    .line 488
    :cond_1
    iget-object v0, p0, Lo/act$7;->c:Lo/act;

    invoke-static {v0}, Lo/act;->c(Lo/act;)Lo/acu;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/acu;->e(B)V

    .line 489
    iget-object v0, p0, Lo/act$7;->c:Lo/act;

    invoke-static {v0}, Lo/act;->c(Lo/act;)Lo/acu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v1

    invoke-virtual {v0, v1}, Lo/acu;->e(F)V

    .line 490
    iget-object v0, p0, Lo/act$7;->c:Lo/act;

    invoke-static {v0}, Lo/act;->c(Lo/act;)Lo/acu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/acu;->c(I)V

    .line 491
    iget-object v0, p0, Lo/act$7;->c:Lo/act;

    invoke-static {v0}, Lo/act;->c(Lo/act;)Lo/acu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getAge()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/acu;->b(I)V

    .line 492
    iget-object v0, p0, Lo/act$7;->c:Lo/act;

    invoke-static {v0}, Lo/act;->c(Lo/act;)Lo/acu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/acu;->d(I)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 495
    goto :goto_0

    .line 493
    :catch_0
    move-exception v4

    .line 494
    invoke-static {}, Lo/act;->k()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    :cond_2
    :goto_0
    return-void
.end method
