.class Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler$1;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->getUnionpayAPKInfo()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 155
    new-instance v4, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;-><init>()V

    .line 156
    const-string v0, "Huawei_Watch_LEO"

    iput-object v0, v4, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;->dicName:Ljava/lang/String;

    .line 157
    const-string v0, "com.unionpay.tsmbleuniteservice"

    iput-object v0, v4, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;->itemName:Ljava/lang/String;

    .line 158
    new-instance v0, Lcom/huawei/wallet/bankcard/server/BankCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->access$000(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/wallet/bankcard/server/BankCardServer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4}, Lcom/huawei/wallet/bankcard/server/BankCardServer;->queryDics(Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;)Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;

    move-result-object v5

    .line 159
    if-eqz v5, :cond_1

    iget v0, v5, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->returnCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 161
    iget-object v0, v5, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->dicItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 163
    iget-object v0, v5, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->dicItems:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/server/card/response/DicItem;

    .line 164
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/server/card/response/DicItem;->getValue()Ljava/lang/String;

    move-result-object v7

    .line 165
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;

    invoke-static {v0, v7}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->access$100(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;Ljava/lang/String;)V

    .line 166
    goto :goto_1

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;

    const-string v1, "The size of result\'s dictory is zero"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->access$200(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;Ljava/lang/String;)V

    goto :goto_1

    .line 174
    :cond_1
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 175
    const-string v0, "fail_reason"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getUnionpayAPKInfo failed. query server failed. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v5, :cond_2

    const-string v2, "response is null"

    goto :goto_0

    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "retCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->returnCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    const v0, 0x3611a447

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v6, v1, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 178
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler$1;->this$0:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;

    const-string v1, "Response is null object"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->access$200(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;Ljava/lang/String;)V

    .line 180
    :goto_1
    return-void
.end method
