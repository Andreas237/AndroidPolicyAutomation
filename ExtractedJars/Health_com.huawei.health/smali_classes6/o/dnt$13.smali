.class Lo/dnt$13;
.super Lo/doi$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dnt;

.field final synthetic d:Lo/doi;


# direct methods
.method constructor <init>(Lo/dnt;Lo/doi;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lo/dnt$13;->a:Lo/dnt;

    iput-object p2, p0, Lo/dnt$13;->d:Lo/doi;

    invoke-direct {p0}, Lo/doi$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/Map;)V
    .locals 10

    .line 299
    if-nez p1, :cond_0

    .line 300
    iget-object v0, p0, Lo/dnt$13;->d:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 301
    return-void

    .line 303
    :cond_0
    const-string v0, "userInfo"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/up/model/UserInfomation;

    .line 305
    const/4 v6, 0x0

    .line 306
    iget-object v0, p0, Lo/dnt$13;->a:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->k(Lo/dnt;)Ljava/lang/Object;

    move-result-object v7

    monitor-enter v7

    .line 307
    :try_start_0
    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 308
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync get portraitUrl null,oldPicUseful to be false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    const/4 v5, 0x0

    goto :goto_0

    .line 310
    :cond_1
    iget-object v0, p0, Lo/dnt$13;->a:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 311
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "old portraitUrl null,oldPicUseful to be false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    const/4 v5, 0x0

    goto :goto_0

    .line 313
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/dnt$13;->a:Lo/dnt;

    invoke-static {v1}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 314
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "portraitUrl no change,oldPicUseful to be true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    const/4 v5, 0x1

    .line 316
    iget-object v0, p0, Lo/dnt$13;->a:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    goto :goto_0

    .line 318
    :cond_3
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "portraitUrl change,oldPicUseful to be false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    const/4 v5, 0x0

    .line 322
    :goto_0
    if-nez v5, :cond_4

    .line 323
    iget-object v0, p0, Lo/dnt$13;->a:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v6

    .line 324
    iget-object v0, p0, Lo/dnt$13;->a:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    const-string v1, "default"

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 326
    :cond_4
    monitor-exit v7

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v7

    throw v8

    .line 329
    :goto_1
    if-nez v5, :cond_5

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "default"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 330
    iget-object v0, p0, Lo/dnt$13;->a:Lo/dnt;

    invoke-static {v0, v6}, Lo/dnt;->e(Lo/dnt;Ljava/lang/String;)V

    .line 333
    :cond_5
    iget-object v0, p0, Lo/dnt$13;->a:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->k(Lo/dnt;)Ljava/lang/Object;

    move-result-object v7

    monitor-enter v7

    .line 335
    :try_start_1
    iget-object v0, p0, Lo/dnt$13;->a:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getBirthdayStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setBirthdayStatus(Ljava/lang/String;)V

    .line 336
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processSync write memory success(refresh) only birthdayStatus:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnt$13;->a:Lo/dnt;

    invoke-static {v2}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getBirthdayStatus()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    iget-object v0, p0, Lo/dnt$13;->a:Lo/dnt;

    iget-object v1, p0, Lo/dnt$13;->a:Lo/dnt;

    invoke-static {v1}, Lo/dnt;->g(Lo/dnt;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v1

    invoke-static {v0, v1, v4}, Lo/dnt;->b(Lo/dnt;Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/model/UserInfomation;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 339
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data no change,return and check pic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    iget-object v0, p0, Lo/dnt$13;->d:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 341
    monitor-exit v7

    return-void

    .line 343
    :cond_6
    monitor-exit v7

    goto :goto_2

    :catchall_1
    move-exception v9

    monitor-exit v7

    throw v9

    .line 345
    :goto_2
    iget-object v0, p0, Lo/dnt$13;->a:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->h(Lo/dnt;)Lo/dod$b;

    move-result-object v0

    new-instance v1, Lo/dnt$13$2;

    invoke-direct {v1, p0, v4}, Lo/dnt$13$2;-><init>(Lo/dnt$13;Lcom/huawei/up/model/UserInfomation;)V

    invoke-interface {v0, v4, v1}, Lo/dod$b;->e(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V

    .line 361
    return-void
.end method
