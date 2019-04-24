.class Lo/adn$2$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/adn$2;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/adn$2;


# direct methods
.method constructor <init>(Lo/adn$2;)V
    .locals 0

    .line 557
    iput-object p1, p0, Lo/adn$2$3;->a:Lo/adn$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 560
    iget-object v0, p0, Lo/adn$2$3;->a:Lo/adn$2;

    iget-object v0, v0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->g(Lo/adn;)I

    move-result v0

    const/4 v1, -0x5

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lo/adn$2$3;->a:Lo/adn$2;

    iget-object v0, v0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->q(Lo/adn;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/adn$2$3;->a:Lo/adn$2;

    iget-object v0, v0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->g(Lo/adn;)I

    move-result v0

    const/4 v1, -0x6

    if-ne v0, v1, :cond_1

    .line 561
    :cond_0
    iget-object v0, p0, Lo/adn$2$3;->a:Lo/adn$2;

    iget-object v0, v0, Lo/adn$2;->c:Lo/adn;

    invoke-virtual {v0}, Lo/adn;->e()V

    .line 562
    return-void

    .line 564
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController onDescriptorWrite 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 565
    iget-object v0, p0, Lo/adn$2$3;->a:Lo/adn$2;

    iget-object v0, v0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->l(Lo/adn;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/adn$2$3;->a:Lo/adn$2;

    iget-object v0, v0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->g(Lo/adn;)I

    move-result v0

    const/4 v1, -0x6

    if-eq v0, v1, :cond_2

    .line 566
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWChMeasureController onDescriptorWrite 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    iget-object v0, p0, Lo/adn$2$3;->a:Lo/adn$2;

    iget-object v0, v0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->r(Lo/adn;)V

    .line 568
    iget-object v0, p0, Lo/adn$2$3;->a:Lo/adn$2;

    iget-object v0, v0, Lo/adn$2;->c:Lo/adn;

    invoke-static {v0}, Lo/adn;->x(Lo/adn;)V

    .line 570
    :cond_2
    return-void
.end method
