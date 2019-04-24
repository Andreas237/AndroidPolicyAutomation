.class Lo/adn$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ahi$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/adn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/adn;


# direct methods
.method constructor <init>(Lo/adn;)V
    .locals 0

    .line 321
    iput-object p1, p0, Lo/adn$4;->c:Lo/adn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEvent(Lo/ahi$a;)V
    .locals 7

    .line 324
    const-string v0, "weight_device_clear_user_data"

    invoke-virtual {p1}, Lo/ahi$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 325
    iget-object v0, p0, Lo/adn$4;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->b(Lo/adn;Z)Z

    .line 326
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "send clear user data  ===="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adn$4;->c:Lo/adn;

    invoke-static {v3}, Lo/adn;->l(Lo/adn;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lo/adn$4;->c:Lo/adn;

    invoke-static {v3}, Lo/adn;->n(Lo/adn;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lo/adn$4;->c:Lo/adn;

    invoke-static {v3}, Lo/adn;->p(Lo/adn;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    iget-object v0, p0, Lo/adn$4;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->l(Lo/adn;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/adn$4;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->n(Lo/adn;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/adn$4;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->p(Lo/adn;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 328
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send clear user data === 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    iget-object v0, p0, Lo/adn$4;->c:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->a(Lo/adn;Z)Z

    .line 330
    iget-object v0, p0, Lo/adn$4;->c:Lo/adn;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adn;->d(Lo/adn;Z)Z

    .line 331
    iget-object v0, p0, Lo/adn$4;->c:Lo/adn;

    invoke-static {}, Lo/adl;->d()[B

    move-result-object v1

    sget-object v2, Lo/adn$b;->o:Lo/adn$b;

    invoke-static {v0, v1, v2}, Lo/adn;->b(Lo/adn;[BLo/adn$b;)V

    goto/16 :goto_1

    .line 334
    :cond_1
    const-string v0, "weight_device_ota_update"

    invoke-virtual {p1}, Lo/ahi$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 335
    invoke-virtual {p1}, Lo/ahi$a;->e()Landroid/content/Intent;

    move-result-object v4

    .line 336
    const-string v0, "scalePath"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 337
    const-string v0, "blePath"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 338
    invoke-static {}, Lo/adp;->a()Lo/adp;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Lo/adp;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 339
    goto :goto_1

    :cond_2
    const-string v0, "get_scale_version_code"

    invoke-virtual {p1}, Lo/ahi$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 340
    iget-object v0, p0, Lo/adn$4;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->o(Lo/adn;)Lo/adq;

    move-result-object v0

    if-nez v0, :cond_3

    .line 341
    iget-object v0, p0, Lo/adn$4;->c:Lo/adn;

    invoke-static {}, Lo/adl;->c()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    goto :goto_1

    .line 343
    :cond_3
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 344
    const-string v0, "bleVersion"

    iget-object v1, p0, Lo/adn$4;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->o(Lo/adn;)Lo/adq;

    move-result-object v1

    invoke-virtual {v1}, Lo/adq;->a()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 345
    const-string v0, "scaleVersion"

    iget-object v1, p0, Lo/adn$4;->c:Lo/adn;

    invoke-static {v1}, Lo/adn;->o(Lo/adn;)Lo/adq;

    move-result-object v1

    invoke-virtual {v1}, Lo/adq;->d()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 346
    new-instance v0, Lo/ahi$a;

    const-string v1, "set_scale_version_code"

    invoke-direct {v0, v1, v4}, Lo/ahi$a;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    .line 349
    :cond_4
    :goto_1
    return-void
.end method
