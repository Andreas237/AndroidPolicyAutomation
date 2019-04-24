.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->setCardDefault(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

.field final synthetic val$callback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;

.field final synthetic val$refId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;)V
    .locals 0

    .line 287
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;->val$refId:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;->val$callback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 291
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->access$200(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;->val$refId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->setDefaultCard(Ljava/lang/String;)V

    .line 292
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;->val$callback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->setCardDefaultCallback(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;Z)V

    .line 293
    const-string v0, "setCardDefaultCallback  true"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 300
    goto :goto_0

    .line 294
    :catch_0
    move-exception v3

    .line 295
    const-string v0, "setCardDefaultCallback  WalletTaCardNotExistException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 296
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;->val$callback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->setCardDefaultCallback(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;Z)V

    .line 300
    goto :goto_0

    .line 297
    :catch_1
    move-exception v3

    .line 298
    const-string v0, "setCardDefaultCallback  WalletTaSystemErrorException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 299
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager$2;->val$callback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->setCardDefaultCallback(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;Z)V

    .line 301
    :goto_0
    return-void
.end method
