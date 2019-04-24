.class public Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/CardIssuerIdentifyTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final mCardNum:Ljava/lang/String;

.field private final mContext:Landroid/content/Context;

.field private final mOperatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

.field private final mResultHandleTask:Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/CardIssuerIdentifyTask;->mContext:Landroid/content/Context;

    .line 52
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/CardIssuerIdentifyTask;->mCardNum:Ljava/lang/String;

    .line 53
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/CardIssuerIdentifyTask;->mOperatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    .line 54
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/CardIssuerIdentifyTask;->mResultHandleTask:Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;

    .line 55
    return-void
.end method

.method private getIfCardAdded(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;)I
    .locals 6

    .line 142
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/CardIssuerIdentifyTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v2

    .line 143
    if-eqz v2, :cond_1

    .line 145
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 147
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 149
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->getBankCardType()I

    move-result v0

    iget v1, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    if-ne v0, v1, :cond_0

    .line 152
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    iget v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 166
    :sswitch_0
    const/16 v0, -0x9

    return v0

    .line 168
    :goto_1
    const-string v0, "card status is valid, can be added"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 173
    :cond_0
    goto/16 :goto_0

    .line 176
    :cond_1
    const/4 v0, 0x1

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
        0x5c -> :sswitch_0
        0x5d -> :sswitch_0
        0x5e -> :sswitch_0
        0x5f -> :sswitch_0
        0x60 -> :sswitch_0
        0x61 -> :sswitch_0
        0x62 -> :sswitch_0
        0x63 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 71
    const/16 v4, -0x63

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/CardIssuerIdentifyTask;->mOperatorManager:Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/impl/BankSPIOperatorManager;->getCUPOperator()Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/CardIssuerIdentifyTask;->mCardNum:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;->indentifyCUPCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;

    move-result-object v5

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===identifyResult.false resultCode= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->getResultCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 74
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->getResultCode()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 77
    :pswitch_0
    const/4 v4, 0x1

    .line 78
    goto :goto_1

    .line 80
    :pswitch_1
    const/4 v4, -0x3

    .line 81
    goto :goto_1

    .line 83
    :pswitch_2
    const/4 v4, -0x4

    .line 84
    goto :goto_1

    .line 86
    :pswitch_3
    const/4 v4, -0x5

    .line 87
    goto :goto_1

    .line 89
    :pswitch_4
    const/4 v4, -0x2

    .line 90
    goto :goto_1

    .line 92
    :pswitch_5
    const/4 v4, -0x6

    .line 93
    goto :goto_1

    .line 95
    :goto_0
    const/16 v4, -0x63

    .line 99
    :goto_1
    const/4 v0, 0x1

    if-ne v0, v4, :cond_0

    .line 101
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/CardIssuerIdentifyTask;->mCardNum:Ljava/lang/String;

    invoke-direct {p0, v0, v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/CardIssuerIdentifyTask;->getIfCardAdded(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;)I

    move-result v4

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/CardIssuerIdentifyTask;->mResultHandleTask:Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->getBankCardType()I

    move-result v2

    const/16 v3, 0xd

    invoke-virtual {v0, v4, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->notifyIdentifyResult(ILjava/lang/String;II)V

    .line 105
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
