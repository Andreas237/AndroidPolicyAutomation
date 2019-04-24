.class Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->onCardItemClick(Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;ILjava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)V
    .locals 0

    .line 339
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 342
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$1600(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 343
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$1602(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Lo/egv;)Lo/egv;

    .line 344
    return-void
.end method
