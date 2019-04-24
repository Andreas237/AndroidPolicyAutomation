.class Lcom/huawei/health/MainActivity$24;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 1197
    iput-object p1, p0, Lcom/huawei/health/MainActivity$24;->e:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1200
    iget-object v0, p0, Lcom/huawei/health/MainActivity$24;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->k(Lcom/huawei/health/MainActivity;)V

    .line 1202
    iget-object v0, p0, Lcom/huawei/health/MainActivity$24;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->f(Lcom/huawei/health/MainActivity;)Landroid/os/Handler;

    move-result-object v5

    .line 1203
    iget-object v0, p0, Lcom/huawei/health/MainActivity$24;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v6

    .line 1204
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 1205
    :cond_0
    return-void

    .line 1208
    :cond_1
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1209
    iget-object v0, p0, Lcom/huawei/health/MainActivity$24;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1210
    if-eqz v7, :cond_2

    const-string v0, "1"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1211
    :cond_2
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isthirdlogin == 1 and return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1212
    iget-object v0, p0, Lcom/huawei/health/MainActivity$24;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->l(Lcom/huawei/health/MainActivity;)V

    .line 1215
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/MainActivity$24;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->m(Lcom/huawei/health/MainActivity;)I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    .line 1217
    :try_start_0
    invoke-virtual {v6}, Lo/ale;->w()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1220
    goto :goto_0

    .line 1218
    :catch_0
    move-exception v7

    .line 1219
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addPermissions "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1224
    :cond_4
    :goto_0
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/ale;->d(Lcom/huawei/cloudservice/CloudAccount;)V

    .line 1225
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_7

    .line 1226
    iget-object v0, p0, Lcom/huawei/health/MainActivity$24;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->n(Lcom/huawei/health/MainActivity;)Lo/alh;

    move-result-object v0

    if-nez v0, :cond_5

    .line 1227
    iget-object v0, p0, Lcom/huawei/health/MainActivity$24;->e:Lcom/huawei/health/MainActivity;

    new-instance v1, Lo/alh;

    iget-object v2, p0, Lcom/huawei/health/MainActivity$24;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v2}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lo/alh;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/huawei/health/MainActivity;->d(Lcom/huawei/health/MainActivity;Lo/alh;)Lo/alh;

    .line 1229
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/MainActivity$24;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->n(Lcom/huawei/health/MainActivity;)Lo/alh;

    move-result-object v0

    invoke-virtual {v0}, Lo/alh;->a()Z

    move-result v7

    .line 1230
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initLoginedData  queryIsShowBindDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1231
    if-eqz v7, :cond_6

    .line 1233
    const/16 v0, 0xcc

    invoke-virtual {v5, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1236
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/MainActivity$24;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2719

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_is_first_in"

    const-string v3, "health_is_first_in"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1240
    :cond_7
    invoke-static {}, Lo/czu;->h()Z

    move-result v0

    if-nez v0, :cond_8

    .line 1241
    invoke-static {}, Lo/eof;->a()Lo/eof;

    move-result-object v0

    invoke-virtual {v0}, Lo/eof;->b()V

    .line 1245
    :cond_8
    const/16 v0, 0xb

    invoke-virtual {v5, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1246
    return-void
.end method
