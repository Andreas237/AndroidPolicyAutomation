.class public Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;
.source "SourceFile"


# instance fields
.field private latitude:Ljava/lang/String;

.field private longitude:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;-><init>()V

    .line 14
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->setCplc(Ljava/lang/String;)V

    .line 15
    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->longitude:Ljava/lang/String;

    .line 16
    iput-object p3, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->latitude:Ljava/lang/String;

    .line 17
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->setSn(Ljava/lang/String;)V

    .line 20
    return-void
.end method


# virtual methods
.method public getLatitude()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->latitude:Ljava/lang/String;

    return-object v0
.end method

.method public getLongitude()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->longitude:Ljava/lang/String;

    return-object v0
.end method

.method public setLatitude(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->latitude:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public setLongitude(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;->longitude:Ljava/lang/String;

    .line 28
    return-void
.end method
