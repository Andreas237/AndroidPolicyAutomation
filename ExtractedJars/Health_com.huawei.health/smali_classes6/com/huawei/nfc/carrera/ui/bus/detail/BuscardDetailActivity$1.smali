.class Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;->cardEventTopUp()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

.field final synthetic val$item:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 0

    .line 408
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$1;->val$item:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 411
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity$1;->val$item:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardEvent(Ljava/lang/String;I)V

    .line 412
    return-void
.end method
