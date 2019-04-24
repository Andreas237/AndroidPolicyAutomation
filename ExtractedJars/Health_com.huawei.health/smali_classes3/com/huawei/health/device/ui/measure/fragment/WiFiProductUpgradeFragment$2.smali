.class Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 150
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    const-class v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Ljava/lang/Class;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    .line 151
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 152
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    const-class v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->popupFragment(Ljava/lang/Class;)V

    goto/16 :goto_0

    .line 154
    :cond_0
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    invoke-virtual {v0}, Lo/aey;->d()Ljava/util/ArrayList;

    move-result-object v5

    .line 155
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    sget-object v1, Lo/acl$a;->c:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v5, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Ljava/util/ArrayList;Ljava/lang/String;)Lo/afk;

    move-result-object v6

    .line 156
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 157
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "item = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 158
    new-instance v7, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-direct {v7}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;-><init>()V

    .line 159
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 160
    const-string v0, "back_to_finish"

    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 161
    const-string v0, "kind"

    iget-object v1, v6, Lo/afk;->b:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    const-string v0, "deviceType"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, v6, Lo/afk;->c:Ljava/lang/String;

    invoke-static {v2}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    invoke-virtual {v7, v8}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->setArguments(Landroid/os/Bundle;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1, v7}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 165
    goto :goto_0

    .line 166
    :cond_1
    const-string v0, "WiFiProductUpgradeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WEIGHT ProductGroup is error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 169
    :goto_0
    return-void
.end method
