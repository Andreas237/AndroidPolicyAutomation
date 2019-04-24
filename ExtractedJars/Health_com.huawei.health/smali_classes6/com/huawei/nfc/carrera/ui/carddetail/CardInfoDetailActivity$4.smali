.class Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)V
    .locals 0

    .line 804
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public dispatchMessage(Landroid/os/Message;)V
    .locals 2

    .line 807
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 808
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->access$400(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)V

    goto :goto_0

    .line 809
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 810
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_loading:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->access$500(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;I)V

    goto :goto_0

    .line 811
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 812
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->access$600(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)V

    goto :goto_0

    .line 813
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_3

    .line 814
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_nullify_card_nullifying:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->access$700(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;I)V

    goto :goto_0

    .line 815
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x5

    if-ne v1, v0, :cond_4

    .line 816
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->access$800(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)V

    .line 818
    :cond_4
    :goto_0
    return-void
.end method
