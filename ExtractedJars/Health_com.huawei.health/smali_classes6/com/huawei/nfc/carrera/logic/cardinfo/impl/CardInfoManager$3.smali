.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->setDefaultCardIfNecessary(IILjava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

.field final synthetic val$item:Lcom/huawei/wallet/model/unicard/UniCardInfo;

.field final synthetic val$originalCardOrders:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;Ljava/util/List;Lcom/huawei/wallet/model/unicard/UniCardInfo;)V
    .locals 0

    .line 583
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$3;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$3;->val$originalCardOrders:Ljava/util/List;

    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$3;->val$item:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public setResultCallback(I)V
    .locals 3

    .line 587
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$3;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$3;->val$originalCardOrders:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$3;->val$item:Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-static {v0, v1, v2, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->access$300(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;Ljava/util/List;Lcom/huawei/wallet/model/unicard/UniCardInfo;I)V

    .line 588
    return-void
.end method
