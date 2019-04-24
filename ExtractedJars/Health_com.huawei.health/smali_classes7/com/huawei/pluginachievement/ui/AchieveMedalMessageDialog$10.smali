.class Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)V
    .locals 0

    .line 371
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 373
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v3

    .line 374
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 375
    const-string v0, "medalID"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->g(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    const/16 v0, 0x9

    invoke-virtual {v3, v0, v4}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v5

    .line 377
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 378
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    const-string v1, " enter data is null"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    return-void

    .line 381
    :cond_0
    instance-of v0, v5, Lo/dvu;

    if-eqz v0, :cond_2

    .line 382
    move-object v6, v5

    check-cast v6, Lo/dvu;

    .line 383
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-virtual {v6}, Lo/dvu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->d(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;

    .line 384
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-virtual {v6}, Lo/dvu;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;

    .line 385
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-virtual {v6}, Lo/dvu;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;

    .line 386
    invoke-static {}, Lo/dth;->l()Z

    move-result v0

    if-nez v0, :cond_1

    .line 387
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-virtual {v6}, Lo/dvu;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->b(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;

    .line 388
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-virtual {v6}, Lo/dvu;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->i(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;

    .line 390
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-virtual {v6}, Lo/dvu;->A()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->d(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;I)I

    .line 392
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-virtual {v6}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->f(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;

    .line 393
    invoke-virtual {v6}, Lo/dvu;->C()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    .line 394
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->n(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lo/dty;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->k(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;

    .line 396
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "promotion_name:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->l(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " promotion_url:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->o(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " enter medalText ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->p(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " toShareMedalName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " toShareMedalLightDesc ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->d(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$10;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->s(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 400
    return-void
.end method
