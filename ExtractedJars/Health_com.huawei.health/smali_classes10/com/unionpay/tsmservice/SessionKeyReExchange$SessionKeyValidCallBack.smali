.class Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;
.super Lcom/unionpay/tsmservice/ITsmCallback$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/SessionKeyReExchange;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SessionKeyValidCallBack"
.end annotation


# static fields
.field public static final CALLBACK_EXCHANGE_KEY:I = 0x1

.field public static final CALLBACK_GET_PUBKEY:I = 0x0


# instance fields
.field private mId:I

.field final synthetic this$0:Lcom/unionpay/tsmservice/SessionKeyReExchange;


# direct methods
.method public constructor <init>(Lcom/unionpay/tsmservice/SessionKeyReExchange;I)V
    .locals 1

    .line 96
    iput-object p1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;->this$0:Lcom/unionpay/tsmservice/SessionKeyReExchange;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;-><init>()V

    .line 94
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;->mId:I

    .line 97
    iput p2, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;->mId:I

    .line 98
    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 125
    const-string v0, "SessionKeyReExchange"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "execute reExchangeKey onError : errorCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " errorDesc="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;->this$0:Lcom/unionpay/tsmservice/SessionKeyReExchange;

    invoke-static {v0}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->access$200(Lcom/unionpay/tsmservice/SessionKeyReExchange;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;->this$0:Lcom/unionpay/tsmservice/SessionKeyReExchange;

    invoke-static {v0}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->access$300(Lcom/unionpay/tsmservice/SessionKeyReExchange;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 130
    :pswitch_0
    const-string p1, "10039"

    .line 131
    goto/16 :goto_0

    .line 134
    :pswitch_1
    const-string p1, "10032"

    .line 135
    goto/16 :goto_0

    .line 138
    :pswitch_2
    const-string p1, "10006"

    .line 139
    goto/16 :goto_0

    .line 142
    :pswitch_3
    const-string p1, "10012"

    .line 143
    goto/16 :goto_0

    .line 146
    :pswitch_4
    const-string p1, "10014"

    .line 147
    goto/16 :goto_0

    .line 150
    :pswitch_5
    const-string p1, "10019"

    .line 151
    goto/16 :goto_0

    .line 154
    :pswitch_6
    const-string p1, "10010"

    .line 155
    goto/16 :goto_0

    .line 158
    :pswitch_7
    const-string p1, "10011"

    .line 159
    goto/16 :goto_0

    .line 162
    :pswitch_8
    const-string p1, "10013"

    .line 163
    goto/16 :goto_0

    .line 166
    :pswitch_9
    const-string p1, "10015"

    .line 167
    goto/16 :goto_0

    .line 170
    :pswitch_a
    const-string p1, "10015"

    .line 171
    goto/16 :goto_0

    .line 174
    :pswitch_b
    const-string p1, "10021"

    .line 175
    goto/16 :goto_0

    .line 178
    :pswitch_c
    const-string p1, "10022"

    .line 179
    goto/16 :goto_0

    .line 182
    :pswitch_d
    const-string p1, "10023"

    .line 183
    goto/16 :goto_0

    .line 186
    :pswitch_e
    const-string p1, "10024"

    .line 187
    goto/16 :goto_0

    .line 190
    :pswitch_f
    const-string p1, "10025"

    .line 191
    goto/16 :goto_0

    .line 194
    :pswitch_10
    const-string p1, "10027"

    .line 195
    goto/16 :goto_0

    .line 198
    :pswitch_11
    const-string p1, "10028"

    .line 199
    goto/16 :goto_0

    .line 202
    :pswitch_12
    const-string p1, "10029"

    .line 203
    goto :goto_0

    .line 206
    :pswitch_13
    const-string p1, "10018"

    .line 207
    goto :goto_0

    .line 210
    :pswitch_14
    const-string p1, "10005"

    .line 211
    goto :goto_0

    .line 214
    :pswitch_15
    const-string p1, "10026"

    .line 215
    goto :goto_0

    .line 218
    :pswitch_16
    const-string p1, "10007"

    .line 219
    goto :goto_0

    .line 222
    :pswitch_17
    const-string p1, "10008"

    .line 223
    goto :goto_0

    .line 226
    :pswitch_18
    const-string p1, "10035"

    .line 227
    goto :goto_0

    .line 230
    :pswitch_19
    const-string p1, "10009"

    .line 231
    goto :goto_0

    .line 234
    :pswitch_1a
    const-string p1, "10016"

    .line 235
    goto :goto_0

    .line 238
    :pswitch_1b
    const-string p1, "10017"

    .line 239
    goto :goto_0

    .line 242
    :pswitch_1c
    const-string p1, "10004"

    .line 243
    goto :goto_0

    .line 246
    :pswitch_1d
    const-string p1, "10030"

    .line 247
    goto :goto_0

    .line 251
    :pswitch_1e
    const-string p1, "10031"

    .line 254
    :pswitch_1f
    const-string p1, "10001"

    .line 255
    goto :goto_0

    .line 258
    :pswitch_20
    const-string p1, "10033"

    .line 259
    goto :goto_0

    .line 262
    :pswitch_21
    const-string p1, "10034"

    .line 263
    goto :goto_0

    .line 266
    :pswitch_22
    const-string p1, "10036"

    .line 267
    goto :goto_0

    .line 270
    :pswitch_23
    const-string p1, "10037"

    .line 271
    goto :goto_0

    .line 274
    :pswitch_24
    const-string p1, "10038"

    .line 275
    goto :goto_0

    .line 278
    :pswitch_25
    const-string p1, "10040"

    .line 279
    goto :goto_0

    .line 282
    :pswitch_26
    const-string p1, "10041"

    .line 283
    goto :goto_0

    .line 286
    :pswitch_27
    const-string p1, "10042"

    .line 287
    .line 292
    :goto_0
    :pswitch_28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "00000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 294
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;->this$0:Lcom/unionpay/tsmservice/SessionKeyReExchange;

    invoke-static {v0}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->access$200(Lcom/unionpay/tsmservice/SessionKeyReExchange;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/unionpay/tsmservice/ITsmCallback;->onError(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
        :pswitch_1c
        :pswitch_1f
        :pswitch_1d
        :pswitch_1e
        :pswitch_28
        :pswitch_28
        :pswitch_1
        :pswitch_20
        :pswitch_21
        :pswitch_18
        :pswitch_22
        :pswitch_23
        :pswitch_24
        :pswitch_0
        :pswitch_25
        :pswitch_26
        :pswitch_27
    .end packed-switch
.end method

.method public onResult(Landroid/os/Bundle;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 102
    iget v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;->mId:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 104
    :sswitch_0
    const-class v0, Lcom/unionpay/tsmservice/result/GetPubKeyResult;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 105
    const-string v0, "result"

    .line 106
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/result/GetPubKeyResult;

    .line 107
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;->this$0:Lcom/unionpay/tsmservice/SessionKeyReExchange;

    invoke-virtual {v2}, Lcom/unionpay/tsmservice/result/GetPubKeyResult;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->access$000(Lcom/unionpay/tsmservice/SessionKeyReExchange;Ljava/lang/String;)V

    .line 108
    goto :goto_0

    .line 111
    :sswitch_1
    const-class v0, Lcom/unionpay/tsmservice/result/ExchangeKeyResult;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 112
    const-string v0, "result"

    .line 113
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/unionpay/tsmservice/result/ExchangeKeyResult;

    .line 114
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;->this$0:Lcom/unionpay/tsmservice/SessionKeyReExchange;

    invoke-virtual {v3}, Lcom/unionpay/tsmservice/result/ExchangeKeyResult;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->access$100(Lcom/unionpay/tsmservice/SessionKeyReExchange;Ljava/lang/String;)V

    .line 115
    .line 120
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
