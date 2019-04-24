.class public Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;
.super Lcom/huawei/health/sns/logic/chat/media/MtsRequest;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/transfer"


# instance fields
.field private fromGroupID_:Ljava/lang/String;

.field private mcode_:Ljava/lang/String;

.field private toGroupID_:Ljava/lang/String;

.field private toUID_:Ljava/lang/String;

.field private url_:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 89
    invoke-direct {p0}, Lcom/huawei/health/sns/logic/chat/media/MtsRequest;-><init>()V

    .line 90
    const-string v0, "/transfer"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->method:Ljava/lang/String;

    .line 91
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->mcode_:Ljava/lang/String;

    .line 92
    iput-object p2, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->url_:Ljava/lang/String;

    .line 93
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 105
    new-instance v0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/chat/media/TransferMediaResponse;-><init>()V

    return-object v0
.end method

.method public getFromGroupID_()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->fromGroupID_:Ljava/lang/String;

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 3

    .line 111
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    const-string v0, "TransferMediaRequest "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/logic/chat/media/MtsRequest;->getLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMcode_()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->mcode_:Ljava/lang/String;

    return-object v0
.end method

.method public getToGroupID_()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->toGroupID_:Ljava/lang/String;

    return-object v0
.end method

.method public getToUID_()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->toUID_:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl_()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->url_:Ljava/lang/String;

    return-object v0
.end method

.method public setData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->fromGroupID_:Ljava/lang/String;

    .line 98
    iput-object p2, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->toUID_:Ljava/lang/String;

    .line 99
    iput-object p3, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->toGroupID_:Ljava/lang/String;

    .line 100
    return-void
.end method

.method public setFromGroupID_(Ljava/lang/String;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->fromGroupID_:Ljava/lang/String;

    .line 67
    return-void
.end method

.method public setMcode_(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->mcode_:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public setToGroupID_(Ljava/lang/String;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->toGroupID_:Ljava/lang/String;

    .line 83
    return-void
.end method

.method public setToUID_(Ljava/lang/String;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->toUID_:Ljava/lang/String;

    .line 75
    return-void
.end method

.method public setUrl_(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/TransferMediaRequest;->url_:Ljava/lang/String;

    .line 59
    return-void
.end method
