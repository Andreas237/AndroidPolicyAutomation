.class public Lcom/huawei/datatype/PayOpenChannelInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private apdu:Ljava/lang/String;

.field private channelID:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/datatype/PayOpenChannelInfo;->apdu:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getApdu()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/huawei/datatype/PayOpenChannelInfo;->apdu:Ljava/lang/String;

    return-object v0
.end method

.method public getChannelID()I
    .locals 1

    .line 21
    iget v0, p0, Lcom/huawei/datatype/PayOpenChannelInfo;->channelID:I

    return v0
.end method

.method public setApdu(Ljava/lang/String;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/huawei/datatype/PayOpenChannelInfo;->apdu:Ljava/lang/String;

    .line 18
    return-void
.end method

.method public setChannelID(I)V
    .locals 0

    .line 25
    iput p1, p0, Lcom/huawei/datatype/PayOpenChannelInfo;->channelID:I

    .line 26
    return-void
.end method
