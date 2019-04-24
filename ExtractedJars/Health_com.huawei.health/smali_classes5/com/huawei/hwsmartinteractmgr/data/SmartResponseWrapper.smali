.class public Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private contentType:I

.field private response:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private responseCode:I

.field private responseDesc:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->responseCode:I

    .line 18
    iput-object p2, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->responseDesc:Ljava/lang/String;

    .line 19
    iput p3, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->contentType:I

    .line 20
    return-void
.end method


# virtual methods
.method public getContentType()I
    .locals 1

    .line 43
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->contentType:I

    return v0
.end method

.method public getResponse()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->response:Ljava/lang/Object;

    return-object v0
.end method

.method public getResponseCode()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->responseCode:I

    return v0
.end method

.method public getResponseDesc()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->responseDesc:Ljava/lang/String;

    return-object v0
.end method

.method public setContentType(I)V
    .locals 0

    .line 39
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->contentType:I

    .line 40
    return-void
.end method

.method public setResponse(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 27
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->response:Ljava/lang/Object;

    .line 28
    return-void
.end method

.method public setResponseCode(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->responseCode:I

    .line 36
    return-void
.end method

.method public setResponseDesc(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->responseDesc:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public uadpDC1()V
    .locals 0

    .line 57
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 61
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 65
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 69
    return-void
.end method
