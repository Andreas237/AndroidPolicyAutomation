.class public Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# static fields
.field public static final RESULT_CODE_FAIL:Ljava/lang/String; = "1"

.field public static final RESULT_CODE_SUCCESS:Ljava/lang/String; = "0"


# instance fields
.field private cardIssuerid:Ljava/lang/String;

.field private cardType:I

.field private errorDesc:Ljava/lang/String;

.field private requestNum:Ljava/lang/String;

.field private result:Ljava/lang/String;

.field private terminal:Ljava/lang/String;

.field private time:Ljava/lang/String;

.field private uid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    return-void
.end method


# virtual methods
.method public getCardIssuerid()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->cardIssuerid:Ljava/lang/String;

    return-object v0
.end method

.method public getCardType()I
    .locals 1

    .line 107
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->cardType:I

    return v0
.end method

.method public getErrorDesc()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->errorDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getRequestNum()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->requestNum:Ljava/lang/String;

    return-object v0
.end method

.method public getResult()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->result:Ljava/lang/String;

    return-object v0
.end method

.method public getTerminal()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->terminal:Ljava/lang/String;

    return-object v0
.end method

.method public getTime()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->time:Ljava/lang/String;

    return-object v0
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->uid:Ljava/lang/String;

    return-object v0
.end method

.method public setCardIssuerid(Ljava/lang/String;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->cardIssuerid:Ljava/lang/String;

    .line 83
    return-void
.end method

.method public setCardType(I)V
    .locals 0

    .line 112
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->cardType:I

    .line 113
    return-void
.end method

.method public setErrorDesc(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->errorDesc:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public setRequestNum(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->requestNum:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public setResult(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->result:Ljava/lang/String;

    .line 133
    return-void
.end method

.method public setTerminal(Ljava/lang/String;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->terminal:Ljava/lang/String;

    .line 123
    return-void
.end method

.method public setTime(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->time:Ljava/lang/String;

    .line 93
    return-void
.end method

.method public setUid(Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->uid:Ljava/lang/String;

    .line 103
    return-void
.end method
