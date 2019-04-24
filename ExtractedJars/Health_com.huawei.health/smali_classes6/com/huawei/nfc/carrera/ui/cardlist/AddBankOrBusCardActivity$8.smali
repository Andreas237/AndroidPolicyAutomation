.class Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showDialog(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V
    .locals 0

    .line 544
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 547
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    const-string v1, "com.unionpay.tsmbleuniteservice"

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/PackageUtil;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    const-string v1, "com.unionpay.tsmbleuniteservice"

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/PackageUtil;->d(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    .line 549
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$800(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V

    goto :goto_0

    .line 551
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    const/16 v1, 0x379

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$900(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;I)V

    .line 553
    :goto_0
    return-void
.end method
