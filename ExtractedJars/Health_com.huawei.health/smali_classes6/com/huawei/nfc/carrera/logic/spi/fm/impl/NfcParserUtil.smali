.class public Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "NfcParserUtil"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static getEnumBusinessOrderType(I)Lcn/com/fmsh/tsm/business/enums/EnumBusinessOrderType;
    .locals 2

    .line 245
    const/4 v1, 0x0

    .line 246
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 248
    :sswitch_0
    sget-object v1, Lcn/com/fmsh/tsm/business/enums/EnumBusinessOrderType;->ORDER_TYPE_ISSUE:Lcn/com/fmsh/tsm/business/enums/EnumBusinessOrderType;

    .line 249
    goto :goto_1

    .line 251
    :sswitch_1
    sget-object v1, Lcn/com/fmsh/tsm/business/enums/EnumBusinessOrderType;->ORDER_TYPE_RECHARGE:Lcn/com/fmsh/tsm/business/enums/EnumBusinessOrderType;

    .line 252
    goto :goto_1

    .line 254
    :goto_0
    sget-object v1, Lcn/com/fmsh/tsm/business/enums/EnumBusinessOrderType;->ORDER_TYPE_ISSUE:Lcn/com/fmsh/tsm/business/enums/EnumBusinessOrderType;

    .line 257
    :goto_1
    return-object v1

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method protected static getEnumOrderStatuses([I)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I)Ljava/util/ArrayList<Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;>;"
        }
    .end annotation

    .line 208
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 209
    move-object v2, p0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget v5, v2, v4

    .line 210
    packed-switch v5, :pswitch_data_0

    goto/16 :goto_1

    .line 212
    :pswitch_0
    sget-object v0, Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;->hasPaid:Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    goto :goto_1

    .line 215
    :pswitch_1
    sget-object v0, Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;->failure:Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    goto :goto_1

    .line 218
    :pswitch_2
    sget-object v0, Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;->unsettled:Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    goto :goto_1

    .line 221
    :pswitch_3
    sget-object v0, Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;->dubious:Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    goto :goto_1

    .line 224
    :pswitch_4
    sget-object v0, Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;->apilyForRefund:Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    goto :goto_1

    .line 227
    :pswitch_5
    sget-object v0, Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;->hasRefunded:Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    goto :goto_1

    .line 230
    :pswitch_6
    sget-object v0, Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;->refundFailure:Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    goto :goto_1

    .line 233
    :pswitch_7
    sget-object v0, Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;->recharging:Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    :goto_1
    :pswitch_8
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 237
    :cond_0
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_8
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_3
    .end packed-switch
.end method

.method protected static parseBusinessOrder2NfcosType(Lcn/com/fmsh/tsm/business/bean/BusinessOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;
    .locals 5

    .line 94
    new-instance v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    invoke-direct {v4}, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;-><init>()V

    .line 95
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 96
    return-object v4

    .line 99
    :cond_0
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;->getTac()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->faceNo:Ljava/lang/String;

    .line 100
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;->getTradeTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeTime:Ljava/lang/String;

    .line 101
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;->getTradeState()Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;

    move-result-object v0

    .line 102
    invoke-virtual {v0}, Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;->getId()I

    move-result v0

    iput v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeState:I

    .line 103
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;->getTradeDate()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeDate:Ljava/lang/String;

    .line 104
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;->getAmount()I

    move-result v0

    iput v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->amount:I

    .line 105
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;->getBusinessOrderType()Lcn/com/fmsh/tsm/business/enums/EnumBusinessOrderType;

    move-result-object v0

    .line 106
    invoke-virtual {v0}, Lcn/com/fmsh/tsm/business/enums/EnumBusinessOrderType;->getId()I

    move-result v0

    iput v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->businessOrderType:I

    .line 107
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;->getCardIoType()Lcn/com/fmsh/tsm/business/enums/EnumCardIoType;

    move-result-object v0

    .line 108
    invoke-virtual {v0}, Lcn/com/fmsh/tsm/business/enums/EnumCardIoType;->getId()I

    move-result v0

    iput v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->cardIoType:I

    .line 109
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->deviceModel:Ljava/lang/String;

    .line 110
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;->getInvoiceStatus()I

    move-result v0

    iput v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->invoiceStatus:I

    .line 111
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;->getMainOrder()[B

    move-result-object v0

    iput-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->mainOrder:[B

    .line 112
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;->getOrder()[B

    move-result-object v0

    iput-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->order:[B

    .line 113
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/BusinessOrder;->getSeid()[B

    move-result-object v0

    iput-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->seid:[B

    .line 116
    const-string v0, "NfcParserUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "faceNo : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->faceNo:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; tradeTime : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeTime:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; amount : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->amount:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; businessOrderType :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->businessOrderType:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; cardIoType : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->cardIoType:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    return-object v4
.end method

.method protected static parseBusinessOrders2NfcsType([Lcn/com/fmsh/tsm/business/bean/BusinessOrder;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Lcn/com/fmsh/tsm/business/bean/BusinessOrder;)Ljava/util/List<Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;>;"
        }
    .end annotation

    .line 60
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 62
    return-object v1

    .line 65
    :cond_0
    move-object v2, p0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 66
    invoke-static {v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseBusinessOrder2NfcosType(Lcn/com/fmsh/tsm/business/bean/BusinessOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 69
    :cond_1
    return-object v1
.end method

.method protected static parseCardAppInfo2NfcosType(Lcn/com/fmsh/tsm/business/bean/CardAppInfo;)Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;
    .locals 5

    .line 145
    new-instance v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;

    invoke-direct {v3}, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;-><init>()V

    .line 146
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 147
    return-object v3

    .line 149
    :cond_0
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;->getCardAppNo()[B

    move-result-object v0

    iput-object v0, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->appNo:[B

    .line 150
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;->getTime4Validity()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->time4Validity:Ljava/lang/String;

    .line 151
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;->getFaceId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->cardFaceNo:Ljava/lang/String;

    .line 152
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;->getCardType()I

    move-result v0

    iput v0, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->cardType:I

    .line 153
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;->getMoc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->moc:Ljava/lang/String;

    .line 154
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;->getRecords()[Lcn/com/fmsh/tsm/business/bean/CardAppRecord;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseCardAppRecords2Nfcos([Lcn/com/fmsh/tsm/business/bean/CardAppRecord;)[Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;

    move-result-object v0

    iput-object v0, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->records:[Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;

    .line 155
    const-string v0, "NfcParserUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " parseCardAppInfo2NfcosType info.appNo : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->appNo:[B

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ; info.time4Validity : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->time4Validity:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ; info.cardFaceNo : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->cardFaceNo:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ; info.cardType : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->cardType:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ; info.moc : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->moc:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    :try_start_0
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/CardAppInfo;->getBalance()Ljava/lang/Integer;

    move-result-object v4

    .line 159
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 160
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->balance:I

    goto :goto_0

    .line 162
    :cond_1
    const/4 v0, 0x0

    iput v0, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->balance:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    :goto_0
    goto :goto_1

    .line 165
    :catch_0
    move-exception v4

    .line 166
    const-string v0, "NfcParserUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " parseCardAppInfo2NfcosType error : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const/4 v0, 0x0

    iput v0, v3, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppInfo;->balance:I

    .line 170
    :goto_1
    return-object v3
.end method

.method protected static parseCardAppRecords2Nfcos([Lcn/com/fmsh/tsm/business/bean/CardAppRecord;)[Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;
    .locals 12

    .line 176
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 177
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 178
    const/4 v0, 0x0

    new-array v0, v0, [Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;

    return-object v0

    .line 180
    :cond_0
    array-length v0, p0

    new-array v4, v0, [Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;

    .line 181
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 182
    move-object v6, p0

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_2

    aget-object v9, v6, v8

    .line 184
    invoke-virtual {v9}, Lcn/com/fmsh/tsm/business/bean/CardAppRecord;->getAmount()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 185
    const-string v0, "NfcParserUtil"

    const-string v1, " Amount is 0 ,do not show ! "

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    goto/16 :goto_1

    .line 188
    :cond_1
    new-instance v10, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;

    invoke-direct {v10}, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;-><init>()V

    .line 189
    invoke-virtual {v9}, Lcn/com/fmsh/tsm/business/bean/CardAppRecord;->getAmount()I

    move-result v0

    iput v0, v10, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->amount:I

    .line 190
    invoke-virtual {v9}, Lcn/com/fmsh/tsm/business/bean/CardAppRecord;->getBalance()I

    move-result v0

    iput v0, v10, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->balance:I

    .line 191
    invoke-virtual {v9}, Lcn/com/fmsh/tsm/business/bean/CardAppRecord;->getTradeDate()Ljava/lang/String;

    move-result-object v11

    .line 192
    invoke-virtual {v9}, Lcn/com/fmsh/tsm/business/bean/CardAppRecord;->getTradeDate()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->tradeDate:Ljava/lang/String;

    .line 193
    invoke-virtual {v9}, Lcn/com/fmsh/tsm/business/bean/CardAppRecord;->getTradeTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->tradeTime:Ljava/lang/String;

    .line 194
    invoke-virtual {v9}, Lcn/com/fmsh/tsm/business/bean/CardAppRecord;->getTradeType()Lcn/com/fmsh/tsm/business/enums/EnumTradeType;

    move-result-object v0

    .line 195
    invoke-virtual {v0}, Lcn/com/fmsh/tsm/business/enums/EnumTradeType;->getId()I

    move-result v0

    iput v0, v10, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->tradeType:I

    .line 196
    const-string v0, "NfcParserUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " parseCardAppInfo2NfcosType cardAppRecord.amount : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v10, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->amount:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ; balance : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v10, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->balance:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ; tradeDate : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v10, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->tradeDate:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ; tradeTime : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v10, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->tradeTime:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ; tradeType : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v10, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->tradeType:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 200
    :cond_2
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;

    return-object v0
.end method

.method protected static parseMainOrder2NfcType(Lcn/com/fmsh/tsm/business/bean/MainOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;
    .locals 2

    .line 38
    new-instance v1, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    invoke-direct {v1}, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;-><init>()V

    .line 39
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 40
    return-object v1

    .line 43
    :cond_0
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/MainOrder;->getBusinessOrders()[Lcn/com/fmsh/tsm/business/bean/BusinessOrder;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parseBusinessOrders2NfcsType([Lcn/com/fmsh/tsm/business/bean/BusinessOrder;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->businessOrders:Ljava/util/List;

    .line 44
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/MainOrder;->getPayOrders()[Lcn/com/fmsh/tsm/business/bean/PayOrder;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parsePayOrders2Nfcs([Lcn/com/fmsh/tsm/business/bean/PayOrder;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->payOrders:Ljava/util/List;

    .line 45
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/MainOrder;->getAmount()I

    move-result v0

    iput v0, v1, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->amount:I

    .line 46
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/MainOrder;->getDate()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->date:Ljava/lang/String;

    .line 47
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/MainOrder;->getId()[B

    move-result-object v0

    iput-object v0, v1, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->id:[B

    .line 48
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/MainOrder;->getState()Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;

    move-result-object v0

    .line 49
    invoke-virtual {v0}, Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;->getId()I

    move-result v0

    iput v0, v1, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->state:I

    .line 50
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/MainOrder;->getTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->time:Ljava/lang/String;

    .line 52
    return-object v1
.end method

.method protected static parsePayOrder2NfcosOrder(Lcn/com/fmsh/tsm/business/bean/PayOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;
    .locals 5

    .line 125
    new-instance v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;

    invoke-direct {v4}, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;-><init>()V

    .line 126
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 127
    return-object v4

    .line 130
    :cond_0
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/PayOrder;->getAmount()I

    move-result v0

    iput v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->amount:I

    .line 131
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/PayOrder;->getChannel()I

    move-result v0

    iput v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->channel:I

    .line 132
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/PayOrder;->getDate()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->date:Ljava/lang/String;

    .line 133
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/PayOrder;->getId()[B

    move-result-object v0

    iput-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->id:[B

    .line 134
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/PayOrder;->getMainOrder()[B

    move-result-object v0

    iput-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->mainOrder:[B

    .line 135
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/PayOrder;->getState()Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;

    move-result-object v0

    .line 136
    invoke-virtual {v0}, Lcn/com/fmsh/tsm/business/enums/EnumOrderStatus;->getId()I

    move-result v0

    iput v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->state:I

    .line 137
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/PayOrder;->getThirdPayInfo()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->thirdPayInfo:Ljava/lang/String;

    .line 138
    invoke-virtual {p0}, Lcn/com/fmsh/tsm/business/bean/PayOrder;->getTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->time:Ljava/lang/String;

    .line 139
    const-string v0, "NfcParserUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " order.amount : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->amount:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; order.state : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->state:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ;order.thirdPayInfo "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->thirdPayInfo:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; order.mainOrder :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;->mainOrder:[B

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    return-object v4
.end method

.method protected static parsePayOrders2Nfcs([Lcn/com/fmsh/tsm/business/bean/PayOrder;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Lcn/com/fmsh/tsm/business/bean/PayOrder;)Ljava/util/List<Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;>;"
        }
    .end annotation

    .line 77
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 78
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 79
    return-object v1

    .line 82
    :cond_0
    move-object v2, p0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 83
    invoke-static {v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/NfcParserUtil;->parsePayOrder2NfcosOrder(Lcn/com/fmsh/tsm/business/bean/PayOrder;)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosPayOrder;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 85
    :cond_1
    return-object v1
.end method
