.class public Lo/bjk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(JLjava/lang/String;Lcom/huawei/health/sns/model/chat/ShareMessageParams;)Z
    .locals 4

    .line 53
    if-nez p3, :cond_0

    .line 55
    const/4 v0, 0x0

    return v0

    .line 57
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-virtual {p3}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getShareText()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/bjk;->e([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 58
    invoke-static {p0, p1, v3}, Lo/bjk;->d(JLjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static a(JLjava/lang/String;Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)Z
    .locals 4

    .line 71
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkTitle()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkBrief()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/bjk;->e([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 72
    invoke-static {p0, p1, v3}, Lo/bjk;->d(JLjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static d(JLjava/lang/String;)Z
    .locals 3

    .line 84
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 86
    invoke-static {}, Lo/bap;->b()Lo/bap;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lo/bap;->c(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 87
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 90
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v2

    .line 91
    invoke-static {v2, v1}, Lo/brh;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 92
    const/4 v0, 0x1

    return v0

    .line 95
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static varargs e([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 27
    if-nez p0, :cond_0

    .line 29
    const/4 v0, 0x0

    return-object v0

    .line 31
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    if-ge v3, v0, :cond_2

    .line 35
    aget-object v2, p0, v3

    .line 36
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
