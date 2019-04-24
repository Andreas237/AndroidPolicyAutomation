.class public Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.source "SourceFile"


# instance fields
.field private pushMsg:Ljava/lang/String;

.field private pushTime:Ljava/lang/String;

.field private systemCurrentTime:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    .line 25
    return-void
.end method


# virtual methods
.method public getPushMsg()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->pushMsg:Ljava/lang/String;

    return-object v0
.end method

.method public getPushTime()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->pushTime:Ljava/lang/String;

    return-object v0
.end method

.method public getSystemCurrentTime()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->systemCurrentTime:Ljava/lang/String;

    return-object v0
.end method

.method public setPushMsg(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->pushMsg:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setPushTime(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->pushTime:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setSystemCurrentTime(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryUnionPayPushResponse;->systemCurrentTime:Ljava/lang/String;

    .line 49
    return-void
.end method
