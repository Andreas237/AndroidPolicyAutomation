.class Lo/cnq$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;->e(Lcom/huawei/hihealth/HiAccountInfo;Lo/cla;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Lo/cla;

.field final synthetic c:Lcom/huawei/hihealth/HiAccountInfo;

.field final synthetic d:Z

.field final synthetic e:Lo/crd;

.field final synthetic k:Lo/cnq;


# direct methods
.method constructor <init>(Lo/cnq;Lcom/huawei/hihealth/HiAccountInfo;Lo/crd;Ljava/util/ArrayList;Lo/cla;Z)V
    .locals 0

    .line 1309
    iput-object p1, p0, Lo/cnq$4;->k:Lo/cnq;

    iput-object p2, p0, Lo/cnq$4;->c:Lcom/huawei/hihealth/HiAccountInfo;

    iput-object p3, p0, Lo/cnq$4;->e:Lo/crd;

    iput-object p4, p0, Lo/cnq$4;->a:Ljava/util/ArrayList;

    iput-object p5, p0, Lo/cnq$4;->b:Lo/cla;

    iput-boolean p6, p0, Lo/cnq$4;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1312
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin() accountInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$4;->c:Lcom/huawei/hihealth/HiAccountInfo;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "app = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$4;->e:Lo/crd;

    invoke-static {v2}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1314
    iget-object v0, p0, Lo/cnq$4;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnw;->k()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1316
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is not allow login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1317
    iget-object v0, p0, Lo/cnq$4;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1318
    iget-object v0, p0, Lo/cnq$4;->b:Lo/cla;

    iget-object v1, p0, Lo/cnq$4;->a:Ljava/util/ArrayList;

    const/16 v2, 0xc

    invoke-static {v0, v2, v1}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1319
    return-void

    .line 1321
    :cond_0
    iget-object v0, p0, Lo/cnq$4;->c:Lcom/huawei/hihealth/HiAccountInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/cnq$4;->c:Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/cnq$4;->c:Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com."

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "0"

    iget-object v1, p0, Lo/cnq$4;->c:Lcom/huawei/hihealth/HiAccountInfo;

    .line 1322
    invoke-virtual {v1}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1323
    :cond_1
    iget-object v0, p0, Lo/cnq$4;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1324
    iget-object v0, p0, Lo/cnq$4;->b:Lo/cla;

    iget-object v1, p0, Lo/cnq$4;->a:Ljava/util/ArrayList;

    const/4 v2, 0x7

    invoke-static {v0, v2, v1}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1325
    return-void

    .line 1327
    :cond_2
    iget-object v0, p0, Lo/cnq$4;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cnv;->c(Landroid/content/Context;)Lo/cnv;

    move-result-object v4

    .line 1328
    const/4 v5, 0x0

    .line 1330
    :try_start_0
    iget-object v0, p0, Lo/cnq$4;->c:Lcom/huawei/hihealth/HiAccountInfo;

    iget-object v1, p0, Lo/cnq$4;->e:Lo/crd;

    invoke-virtual {v4, v0, v1}, Lo/cnv;->d(Lcom/huawei/hihealth/HiAccountInfo;Lo/crd;)Z

    move-result v0

    move v5, v0

    .line 1331
    iget-object v0, p0, Lo/cnq$4;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cuy;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1332
    iget-object v0, p0, Lo/cnq$4;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cuy;->e(Landroid/content/Context;)V

    .line 1333
    iget-object v0, p0, Lo/cnq$4;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnw;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1337
    :cond_3
    goto :goto_0

    .line 1335
    :catch_0
    move-exception v6

    .line 1336
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin Exception = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1338
    :goto_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin() ans = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1339
    if-eqz v5, :cond_5

    .line 1340
    iget-boolean v0, p0, Lo/cnq$4;->d:Z

    if-eqz v0, :cond_4

    .line 1341
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin() boolean is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$4;->k:Lo/cnq;

    invoke-static {v2}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v2

    invoke-virtual {v2}, Lo/cnw;->l()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " app = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$4;->e:Lo/crd;

    .line 1342
    invoke-static {v2}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 1341
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1343
    iget-object v0, p0, Lo/cnq$4;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnw;->b()Ljava/lang/String;

    move-result-object v6

    .line 1344
    iget-object v0, p0, Lo/cnq$4;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/cnw;->c(Ljava/lang/String;)V

    .line 1345
    iget-object v0, p0, Lo/cnq$4;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$4;->c:Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cnw;->a(Ljava/lang/String;)V

    .line 1346
    iget-object v0, p0, Lo/cnq$4;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnw;->n()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1347
    iget-object v0, p0, Lo/cnq$4;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->d(Lo/cnq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cuq;->d(Landroid/content/Context;)Lo/cuq;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$4;->c:Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cuq;->b(Ljava/lang/String;)V

    .line 1351
    :cond_4
    iget-object v0, p0, Lo/cnq$4;->a:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1352
    iget-object v0, p0, Lo/cnq$4;->b:Lo/cla;

    iget-object v1, p0, Lo/cnq$4;->a:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lo/cnn;->a(Lo/cla;ILjava/util/List;)V

    goto :goto_1

    .line 1354
    :cond_5
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1355
    iget-object v0, p0, Lo/cnq$4;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1356
    iget-object v0, p0, Lo/cnq$4;->b:Lo/cla;

    iget-object v1, p0, Lo/cnq$4;->a:Ljava/util/ArrayList;

    const/16 v2, 0xc

    invoke-static {v0, v2, v1}, Lo/cnn;->c(Lo/cla;ILjava/util/List;)V

    .line 1358
    :goto_1
    return-void
.end method
