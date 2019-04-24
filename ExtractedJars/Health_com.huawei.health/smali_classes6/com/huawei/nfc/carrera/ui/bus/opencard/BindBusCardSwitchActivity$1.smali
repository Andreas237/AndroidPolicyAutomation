.class Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->initCardList(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

.field final synthetic val$list:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->val$list:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 255
    invoke-static {}, Lcom/huawei/nfc/carrera/ui/bus/util/TimeUtil;->isFastDoubleClick()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 256
    const-string v0, "PluginPay BindBusCardSwitchActivity onClick, isFastDoubleClick"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 257
    return-void

    .line 260
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;

    .line 261
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getBundle()Landroid/os/Bundle;

    move-result-object v5

    .line 262
    const-string v0, "status"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 263
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    const-string v1, "issueId"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$002(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 264
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    const-string v1, "cardName"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$402(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 265
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    const-string v1, "aid"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$1102(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 266
    const-string v0, "PluginPay BindBusCardSwitchActivity "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "buscard status : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; issuerId : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; mCardAid : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$1100(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$1200(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 269
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$1300(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 271
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_device_version_does_not_support_the_city_bus_card:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$1400(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Ljava/lang/String;)V

    .line 272
    return-void

    .line 275
    :cond_1
    const-string v0, "PluginPay BindBusCardSwitchActivity "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "supportList is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$1300(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 279
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_device_version_does_not_support_the_city_bus_card:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$1400(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Ljava/lang/String;)V

    .line 280
    return-void

    .line 283
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;->val$list:Ljava/util/ArrayList;

    invoke-static {v0, v4, v6, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$1500(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;ILjava/util/ArrayList;)V

    .line 284
    return-void
.end method
