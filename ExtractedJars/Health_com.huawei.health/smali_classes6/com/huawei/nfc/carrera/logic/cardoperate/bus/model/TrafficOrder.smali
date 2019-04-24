.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;
.super Lcom/huawei/nfc/carrera/logic/model/HianalyticsBaseRespInfo;
.source "SourceFile"


# instance fields
.field private applyOrders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;>;"
        }
    .end annotation
.end field

.field private hasUnusedIssueOrder:Z

.field private isDuplicateApply:Z

.field private isNewPayVersion:Z

.field private nfcosBusinessOrder:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

.field private nfcosMainOrder:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

.field private payInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

.field private payType:I

.field private phoneNum:Ljava/lang/String;

.field private queryOrders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;>;"
        }
    .end annotation
.end field

.field private spId:Ljava/lang/String;

.field private wxPayInfo:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/model/HianalyticsBaseRespInfo;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->isNewPayVersion:Z

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->payInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    return-void
.end method


# virtual methods
.method public getApplyOrders()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;>;"
        }
    .end annotation

    .line 150
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->applyOrders:Ljava/util/List;

    return-object v0
.end method

.method public getHasUnusedIssueOrder()Z
    .locals 1

    .line 126
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->hasUnusedIssueOrder:Z

    return v0
.end method

.method public getNfcosBusinessOrder()Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->nfcosBusinessOrder:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    return-object v0
.end method

.method public getNfcosMainOrder()Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->nfcosMainOrder:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    return-object v0
.end method

.method public getNfcosOrder(I)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;
    .locals 4

    .line 177
    const/4 v1, 0x0

    .line 179
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->nfcosMainOrder:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->nfcosMainOrder:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    iget-object v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->businessOrders:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 181
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->nfcosMainOrder:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    iget-object v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;->businessOrders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    .line 183
    iget v0, v3, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->businessOrderType:I

    if-ne v0, p1, :cond_0

    .line 185
    move-object v1, v3

    .line 186
    goto :goto_1

    .line 188
    :cond_0
    goto :goto_0

    :cond_1
    :goto_1
    goto :goto_2

    .line 191
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->nfcosBusinessOrder:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    if-eqz v0, :cond_3

    .line 193
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->nfcosBusinessOrder:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    iget v0, v0, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->businessOrderType:I

    if-ne v0, p1, :cond_3

    .line 195
    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->nfcosBusinessOrder:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    .line 199
    :cond_3
    :goto_2
    return-object v1
.end method

.method public getPayInfo()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->payInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    return-object v0
.end method

.method public getPayType()I
    .locals 1

    .line 101
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->payType:I

    return v0
.end method

.method public getPhoneNum()Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->phoneNum:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryOrders()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;>;"
        }
    .end annotation

    .line 158
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->queryOrders:Ljava/util/List;

    return-object v0
.end method

.method public getSpId()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->spId:Ljava/lang/String;

    return-object v0
.end method

.method public getWxPayInfo()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->wxPayInfo:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;

    return-object v0
.end method

.method public isDuplicateApply()Z
    .locals 1

    .line 142
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->isDuplicateApply:Z

    return v0
.end method

.method public isNewPayVersion()Z
    .locals 1

    .line 165
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->isNewPayVersion:Z

    return v0
.end method

.method public setApplyOrders(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;>;)V"
        }
    .end annotation

    .line 154
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->applyOrders:Ljava/util/List;

    .line 155
    return-void
.end method

.method public setDuplicateApply(Z)V
    .locals 0

    .line 146
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->isDuplicateApply:Z

    .line 147
    return-void
.end method

.method public setHasUnusedIssueOrder(Z)V
    .locals 0

    .line 130
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->hasUnusedIssueOrder:Z

    .line 131
    return-void
.end method

.method public setNewPayVersion(Z)V
    .locals 0

    .line 169
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->isNewPayVersion:Z

    .line 170
    return-void
.end method

.method public setNfcosBusinessOrder(Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->nfcosBusinessOrder:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    .line 90
    return-void
.end method

.method public setNfcosMainOrder(Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->nfcosMainOrder:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;

    .line 82
    return-void
.end method

.method public setPayInfo(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->payInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    .line 98
    return-void
.end method

.method public setPayType(I)V
    .locals 0

    .line 105
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->payType:I

    .line 106
    return-void
.end method

.method public setPhoneNum(Ljava/lang/String;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->phoneNum:Ljava/lang/String;

    .line 123
    return-void
.end method

.method public setQueryOrders(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;>;)V"
        }
    .end annotation

    .line 162
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->queryOrders:Ljava/util/List;

    .line 163
    return-void
.end method

.method public setSpId(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->spId:Ljava/lang/String;

    .line 139
    return-void
.end method

.method public setWXPayInfo(Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->wxPayInfo:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;

    .line 115
    return-void
.end method
