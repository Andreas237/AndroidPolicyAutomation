.class Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$10;
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

    .line 747
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$10;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$10;->val$notice:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 751
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$10;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/util/PaySecurityManagerSettingUtils;->gotoSetting(Landroid/content/Context;)V

    .line 752
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$10;->val$notice:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->dismiss()V

    .line 753
    return-void
.end method
