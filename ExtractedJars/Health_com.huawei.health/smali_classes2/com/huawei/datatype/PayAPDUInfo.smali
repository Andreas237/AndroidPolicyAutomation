.class public Lcom/huawei/datatype/PayAPDUInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private apdu:Ljava/lang/String;

.field private channelID:I

.field private reqid:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getApdu()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/datatype/PayAPDUInfo;->apdu:Ljava/lang/String;

    return-object v0
.end method

.method public getChannelID()I
    .locals 1

    .line 29
    iget v0, p0, Lcom/huawei/datatype/PayAPDUInfo;->channelID:I

    return v0
.end method

.method public getReqid()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/huawei/datatype/PayAPDUInfo;->reqid:I

    return v0
.end method

.method public setApdu(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/huawei/datatype/PayAPDUInfo;->apdu:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public setChannelID(I)V
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/datatype/PayAPDUInfo;->channelID:I

    .line 34
    return-void
.end method

.method public setReqid(I)V
    .locals 0

    .line 17
    iput p1, p0, Lcom/huawei/datatype/PayAPDUInfo;->reqid:I

    .line 18
    return-void
.end method
