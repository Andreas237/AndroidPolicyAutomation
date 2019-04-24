.class Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;)V
    .locals 0

    .line 839
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 842
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 843
    sget v0, Lcom/huawei/wallet/R$id;->nfc_tip_titile_text:I

    if-ne v0, v2, :cond_0

    .line 844
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    iget-boolean v0, v0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetConnected:Z

    if-nez v0, :cond_2

    .line 845
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->access$100(Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;)V

    goto :goto_0

    .line 847
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->nfc_tip_goto_setting_text:I

    if-ne v0, v2, :cond_2

    .line 848
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mDevicesConnecteStatus:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 849
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->jumpToAndroidWear()V

    goto :goto_0

    .line 850
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    iget-boolean v0, v0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetConnected:Z

    if-nez v0, :cond_2

    .line 851
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->jumpToNetWorkSetting()V

    .line 854
    :cond_2
    :goto_0
    return-void
.end method
