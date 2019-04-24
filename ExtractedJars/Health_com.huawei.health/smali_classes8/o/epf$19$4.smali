.class Lo/epf$19$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/epf$19;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/epf$19;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/epf$19;Ljava/lang/String;)V
    .locals 0

    .line 1273
    iput-object p1, p0, Lo/epf$19$4;->d:Lo/epf$19;

    iput-object p2, p0, Lo/epf$19$4;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 1275
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "2 WLAN_AUTO_UPDATE err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ; objData = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x0

    if-ne v2, p2, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    move-object v2, p2

    :goto_0
    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1276
    const/4 v6, 0x0

    .line 1277
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 1278
    move-object v7, p2

    check-cast v7, Ljava/lang/String;

    .line 1279
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    const-string v0, "2"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1280
    const/4 v6, 0x0

    goto :goto_1

    .line 1282
    :cond_1
    const/4 v6, 0x1

    .line 1285
    :cond_2
    :goto_1
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get auto ota checkbox status,isAutoupdate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1287
    if-nez v6, :cond_3

    .line 1288
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "band support silence OTA but is not open ,isAutoSuccess "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/epf$19$4;->d:Lo/epf$19;

    iget-object v2, v2, Lo/epf$19;->b:Lo/epf;

    invoke-static {v2}, Lo/epf;->m(Lo/epf;)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1289
    iget-object v0, p0, Lo/epf$19$4;->d:Lo/epf$19;

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    invoke-static {v0}, Lo/epf;->m(Lo/epf;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1290
    iget-object v0, p0, Lo/epf$19$4;->d:Lo/epf$19;

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    iget-object v1, p0, Lo/epf$19$4;->d:Lo/epf$19;

    iget-object v1, v1, Lo/epf$19;->b:Lo/epf;

    invoke-static {v1}, Lo/epf;->g(Lo/epf;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/epf$19$4;->d:Lo/epf$19;

    iget-object v2, v2, Lo/epf$19;->b:Lo/epf;

    invoke-static {v2}, Lo/epf;->o(Lo/epf;)I

    move-result v2

    iget-object v3, p0, Lo/epf$19$4;->d:Lo/epf$19;

    iget-object v3, v3, Lo/epf$19;->b:Lo/epf;

    invoke-static {v3}, Lo/epf;->l(Lo/epf;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/epf$19$4;->e:Ljava/lang/String;

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/epf;->c(Lo/epf;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    goto :goto_2

    .line 1294
    :cond_3
    iget-object v0, p0, Lo/epf$19$4;->d:Lo/epf$19;

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1296
    iget-object v0, p0, Lo/epf$19$4;->d:Lo/epf$19;

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->a()V

    goto :goto_2

    .line 1299
    :cond_4
    iget-object v0, p0, Lo/epf$19$4;->d:Lo/epf$19;

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->v()V

    .line 1302
    :cond_5
    :goto_2
    return-void
.end method
