.class Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->showBindFailDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

.field final synthetic val$notice:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;)V
    .locals 0

    .line 758
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$11;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$11;->val$notice:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 762
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$11;->val$notice:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->dismiss()V

    .line 763
    return-void
.end method
