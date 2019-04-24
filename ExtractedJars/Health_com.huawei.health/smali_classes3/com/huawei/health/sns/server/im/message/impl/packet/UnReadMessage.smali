.class public Lcom/huawei/health/sns/server/im/message/impl/packet/UnReadMessage;
.super Lorg/jivesoftware/smack/packet/IQ;
.source "SourceFile"


# instance fields
.field private unReadMsgList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/jivesoftware/smack/packet/Message;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    const-string v0, "query"

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;-><init>(Ljava/lang/String;)V

    .line 28
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->result:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-super {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 29
    return-void
.end method


# virtual methods
.method public getIQChildElementBuilder(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;
    .locals 0

    .line 54
    return-object p1
.end method

.method public getUnReadMsgList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lorg/jivesoftware/smack/packet/Message;>;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/UnReadMessage;->unReadMsgList:Ljava/util/List;

    return-object v0
.end method

.method public setUnReadMsgList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lorg/jivesoftware/smack/packet/Message;>;)V"
        }
    .end annotation

    .line 48
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/UnReadMessage;->unReadMsgList:Ljava/util/List;

    .line 49
    return-void
.end method
