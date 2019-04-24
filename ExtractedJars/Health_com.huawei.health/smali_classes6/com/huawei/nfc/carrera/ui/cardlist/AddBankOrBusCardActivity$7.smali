.class Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$7;
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

    .line 554
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$7;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 557
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$7;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->finish()V

    .line 559
    return-void
.end method
