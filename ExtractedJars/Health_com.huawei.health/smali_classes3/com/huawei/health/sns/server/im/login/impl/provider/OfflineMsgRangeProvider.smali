.class public Lcom/huawei/health/sns/server/im/login/impl/provider/OfflineMsgRangeProvider;
.super Lorg/jivesoftware/smack/provider/IQProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jivesoftware/smack/provider/IQProvider<Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;>;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "IQProvider"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lorg/jivesoftware/smack/provider/IQProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;,
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 31
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 33
    const/4 v0, 0x0

    return-object v0

    .line 35
    :cond_0
    new-instance v2, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;-><init>()V

    .line 36
    const-string v0, "offlinemsg"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    const-string v0, ""

    const-string v1, "seqstart"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 41
    :try_start_0
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->setStartSeq(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    goto :goto_0

    .line 43
    :catch_0
    move-exception v4

    .line 45
    const-string v0, "IQProvider"

    const-string v1, "parser offlinemsg seqstart"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    :goto_0
    const-string v0, ""

    const-string v1, "seqend"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 50
    :try_start_1
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;->setEndSeq(J)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 55
    goto :goto_1

    .line 52
    :catch_1
    move-exception v5

    .line 54
    const-string v0, "IQProvider"

    const-string v1, "parser offlinemsg seqend"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    :cond_1
    :goto_1
    return-object v2
.end method

.method public bridge synthetic parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/Element;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 23
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/sns/server/im/login/impl/provider/OfflineMsgRangeProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;

    move-result-object v0

    return-object v0
.end method
