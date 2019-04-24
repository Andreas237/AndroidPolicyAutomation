.class public Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# instance fields
.field public dicName:Ljava/lang/String;

.field public itemName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    return-void
.end method


# virtual methods
.method public getDicName()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;->dicName:Ljava/lang/String;

    return-object v0
.end method

.method public getItemName()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;->itemName:Ljava/lang/String;

    return-object v0
.end method

.method public setDicName(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;->dicName:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public setItemName(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;->itemName:Ljava/lang/String;

    .line 34
    return-void
.end method
