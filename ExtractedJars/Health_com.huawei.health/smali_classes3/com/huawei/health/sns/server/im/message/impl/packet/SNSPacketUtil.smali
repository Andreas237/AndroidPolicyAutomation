.class public final Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static appendEndNode(Ljava/lang/StringBuffer;Ljava/lang/String;)V
    .locals 2

    .line 47
    const-string v0, "</"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 48
    return-void
.end method

.method public static appendMustNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 59
    if-eqz p2, :cond_0

    .line 61
    invoke-static {p0, p1, p2}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 65
    :cond_0
    const-string v0, ""

    invoke-static {p0, p1, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    :goto_0
    return-void
.end method

.method public static appendNode(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 20
    if-eqz p2, :cond_0

    .line 22
    invoke-static {p0, p1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendStartNode(Ljava/lang/StringBuffer;Ljava/lang/String;)V

    .line 23
    invoke-static {p2}, Lorg/jivesoftware/smack/util/StringUtils;->escapeForXML(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuffer;

    .line 24
    invoke-static {p0, p1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSPacketUtil;->appendEndNode(Ljava/lang/StringBuffer;Ljava/lang/String;)V

    .line 26
    :cond_0
    return-void
.end method

.method private static appendStartNode(Ljava/lang/StringBuffer;Ljava/lang/String;)V
    .locals 2

    .line 36
    const-string v0, "<"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 37
    return-void
.end method

.method public static checkNull(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 77
    if-nez p0, :cond_0

    .line 79
    const-string v0, ""

    return-object v0

    .line 81
    :cond_0
    return-object p0
.end method
