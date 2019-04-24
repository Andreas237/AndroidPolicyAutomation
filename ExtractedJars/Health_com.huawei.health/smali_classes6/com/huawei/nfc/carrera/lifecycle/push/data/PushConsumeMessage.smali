.class public Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final CONSUME_PUSH_MSG_KEY_AMOUNT:Ljava/lang/String; = "amount"

.field static final CONSUME_PUSH_MSG_KEY_CPLC:Ljava/lang/String; = "cplc"

.field static final CONSUME_PUSH_MSG_KEY_CURRENCY:Ljava/lang/String; = "currency"

.field static final CONSUME_PUSH_MSG_KEY_MERCHANTNAME:Ljava/lang/String; = "merchantName"

.field static final CONSUME_PUSH_MSG_KEY_PRODUCTNAME:Ljava/lang/String; = "productName"

.field static final CONSUME_PUSH_MSG_KEY_TIME:Ljava/lang/String; = "time"

.field static final CONSUME_PUSH_MSG_TYPE:Ljava/lang/String; = "consume"


# instance fields
.field private consumeAccount:Ljava/lang/String;

.field private consumeTime:Ljava/lang/String;

.field private cplc:Ljava/lang/String;

.field private currency:Ljava/lang/String;

.field private merchantName:Ljava/lang/String;

.field private productName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getConsumeAccount()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->consumeAccount:Ljava/lang/String;

    return-object v0
.end method

.method public getConsumeTime()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->consumeTime:Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrency()Ljava/lang/String;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public getMerchantName()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public getProductName()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->productName:Ljava/lang/String;

    return-object v0
.end method

.method public setConsumeAccount(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->consumeAccount:Ljava/lang/String;

    .line 110
    return-void
.end method

.method public setConsumeTime(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->consumeTime:Ljava/lang/String;

    .line 102
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->cplc:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public setCurrency(Ljava/lang/String;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->currency:Ljava/lang/String;

    .line 118
    return-void
.end method

.method public setMerchantName(Ljava/lang/String;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->merchantName:Ljava/lang/String;

    .line 126
    return-void
.end method

.method public setProductName(Ljava/lang/String;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushConsumeMessage;->productName:Ljava/lang/String;

    .line 134
    return-void
.end method
