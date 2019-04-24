.class Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "TradeRecordUIConverter"
.end annotation


# instance fields
.field private mMoneyLabel:Ljava/lang/String;

.field private mRecordStatus:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private mRecordTypes:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->mRecordStatus:Landroid/util/SparseArray;

    .line 117
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->mRecordTypes:Landroid/util/SparseArray;

    .line 123
    sget v0, Lcom/huawei/wallet/R$string;->nfc_money_type:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->mMoneyLabel:Ljava/lang/String;

    .line 124
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->mRecordStatus:Landroid/util/SparseArray;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 125
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->mRecordStatus:Landroid/util/SparseArray;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_air_recharge_details_refund:I

    .line 126
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 125
    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->mRecordStatus:Landroid/util/SparseArray;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_state_refunding:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->mRecordStatus:Landroid/util/SparseArray;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_state_handling:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->mRecordTypes:Landroid/util/SparseArray;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_trade_details_recharge:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->mRecordTypes:Landroid/util/SparseArray;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bus_card_trade_details_consume:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 132
    return-void
.end method

.method private changeRecordInfo2General(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;)Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;
    .locals 11

    .line 150
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->mRecordStatus:Landroid/util/SparseArray;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 151
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->mRecordTypes:Landroid/util/SparseArray;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordType()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 152
    const/4 v8, 0x0

    .line 153
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordType()I

    move-result v0

    const/16 v1, 0xb

    if-ne v1, v0, :cond_0

    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->mMoneyLabel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 159
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->mMoneyLabel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 165
    :goto_0
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NumberFormatException "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 166
    new-instance v9, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd hh:mm:ss"

    invoke-direct {v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 167
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v10

    .line 168
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v10, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordAmount()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_1

    .line 169
    const/4 v0, 0x0

    return-object v0

    .line 180
    :cond_1
    goto :goto_1

    .line 172
    :catch_0
    move-exception v9

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NumberFormatException "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 180
    goto :goto_1

    .line 175
    :catch_1
    move-exception v9

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IllegalArgumentException "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 180
    goto :goto_1

    .line 178
    :catch_2
    move-exception v9

    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ParseException "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 183
    :goto_1
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordTime()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->getRecordAmount()Ljava/lang/String;

    move-result-object v3

    move-object v4, v7

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v9, v0

    .line 184
    return-object v9
.end method


# virtual methods
.method changeRecordListToTradeList(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;>;)Ljava/util/List<Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;>;"
        }
    .end annotation

    .line 136
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 137
    const/4 v2, 0x0

    .line 138
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;

    .line 140
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->changeRecordInfo2General(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;)Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;

    move-result-object v2

    .line 141
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 142
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    :cond_0
    goto :goto_0

    .line 145
    :cond_1
    return-object v1
.end method
