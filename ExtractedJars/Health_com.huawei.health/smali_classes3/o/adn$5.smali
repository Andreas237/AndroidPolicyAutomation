.class Lo/adn$5;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/adn;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/adn;


# direct methods
.method constructor <init>(Lo/adn;)V
    .locals 0

    .line 1012
    iput-object p1, p0, Lo/adn$5;->a:Lo/adn;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1015
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController startMeasureTimeTask 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1016
    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    invoke-static {v0}, Lo/adn;->M(Lo/adn;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1017
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController startMeasureTimeTask 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1018
    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    invoke-static {v0}, Lo/adn;->l(Lo/adn;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1019
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController startMeasureTimeTask 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1020
    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    invoke-static {v0}, Lo/adn;->r(Lo/adn;)V

    goto/16 :goto_0

    .line 1021
    :cond_0
    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    invoke-static {v0}, Lo/adn;->n(Lo/adn;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    invoke-static {v0}, Lo/adn;->p(Lo/adn;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1022
    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    invoke-static {v0}, Lo/adn;->K(Lo/adn;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1023
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send clear user data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1024
    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/adn;->a(Lo/adn;Z)Z

    .line 1025
    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/adn;->d(Lo/adn;Z)Z

    .line 1026
    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    invoke-static {}, Lo/adl;->d()[B

    move-result-object v1

    sget-object v2, Lo/adn$b;->o:Lo/adn$b;

    invoke-static {v0, v1, v2}, Lo/adn;->b(Lo/adn;[BLo/adn$b;)V

    goto :goto_0

    .line 1029
    :cond_1
    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    invoke-static {v0}, Lo/adn;->r(Lo/adn;)V

    goto :goto_0

    .line 1032
    :cond_2
    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    invoke-static {v0}, Lo/adn;->L(Lo/adn;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1033
    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    invoke-static {v0}, Lo/adn;->l(Lo/adn;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    invoke-static {v0}, Lo/adn;->n(Lo/adn;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    invoke-static {v0}, Lo/adn;->p(Lo/adn;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1034
    :cond_3
    iget-object v0, p0, Lo/adn$5;->a:Lo/adn;

    invoke-static {v0}, Lo/adn;->r(Lo/adn;)V

    .line 1040
    :cond_4
    :goto_0
    return-void
.end method
