.class Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "LocalHandler"
.end annotation


# instance fields
.field private mWeakActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)V
    .locals 1

    .line 163
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 164
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->mWeakActivity:Ljava/lang/ref/WeakReference;

    .line 165
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 169
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->mWeakActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    .line 171
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 172
    const-string v0, "activity is null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 173
    return-void

    .line 175
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "activity is issueId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 176
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 178
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$100(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$200(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    iget-object v2, v2, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->issueTrafficCard(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;)V

    .line 180
    goto :goto_1

    .line 183
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$300(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->preIssueTrafficCard(Ljava/lang/String;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$400(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Ljava/lang/String;

    move-result-object v3

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$500(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)J

    move-result-wide v4

    const/16 v2, 0xb

    invoke-static/range {v0 .. v5}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$600(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Ljava/lang/String;ILjava/lang/String;J)V

    .line 186
    goto :goto_1

    .line 189
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$700(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Lo/egn;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    sget v3, Lcom/huawei/wallet/R$string;->nfc_loading:I

    invoke-virtual {v2, v3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$800(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 190
    goto :goto_1

    .line 193
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$900(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Lo/egn;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->access$1000(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Lo/egn;)V

    .line 194
    goto :goto_1

    .line 197
    :goto_0
    const-string v0, "BindBusCardAddActivity:handler:default"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 201
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
