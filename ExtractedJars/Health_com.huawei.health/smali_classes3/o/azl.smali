.class public final Lo/azl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/azl$d;,
        Lo/azl$a;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()V
    .locals 0

    .line 99
    invoke-static {}, Lo/azl;->d()V

    .line 100
    invoke-static {}, Lo/azl;->c()V

    .line 101
    return-void
.end method

.method private static c()V
    .locals 3

    .line 125
    const-string v0, "data"

    const-string v1, "socialim-mutimedia"

    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/provider/SNSMultimediaExtensionProvider;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/impl/provider/SNSMultimediaExtensionProvider;-><init>()V

    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addExtensionProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 127
    const-string v0, "data"

    const-string v1, "vcard-temp"

    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/provider/VCardPacketExtensionProvider;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/impl/provider/VCardPacketExtensionProvider;-><init>()V

    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addExtensionProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 129
    const-string v0, "data"

    const-string v1, "socialim-bonus"

    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/provider/BonusPacketExtensionProvider;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/impl/provider/BonusPacketExtensionProvider;-><init>()V

    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addExtensionProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 131
    const-string v0, "data"

    const-string v1, "notify-groupmember"

    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/provider/GroupMemChangeExtensionProvider;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/impl/provider/GroupMemChangeExtensionProvider;-><init>()V

    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addExtensionProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 133
    const-string v0, "data"

    const-string v1, "notify-groupinfo"

    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/provider/GroupInfoChangeExtensionProvider;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/impl/provider/GroupInfoChangeExtensionProvider;-><init>()V

    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addExtensionProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 135
    const-string v0, "data"

    const-string v1, "notify-assistant"

    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/provider/AssistantPacketExtensionProvider;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/impl/provider/AssistantPacketExtensionProvider;-><init>()V

    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addExtensionProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 136
    return-void
.end method

.method public static d(ZZ)Lo/azm;
    .locals 6

    .line 60
    new-instance v4, Lo/azm;

    invoke-direct {v4}, Lo/azm;-><init>()V

    .line 61
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->g()Lo/axr;

    move-result-object v5

    .line 62
    if-eqz v5, :cond_0

    .line 64
    invoke-virtual {v5}, Lo/axr;->b()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/azm;->b(J)V

    .line 65
    invoke-virtual {v5}, Lo/axr;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/azm;->d(Ljava/lang/String;)V

    .line 66
    const-string v0, "im%s.hicloud.com"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lo/axr;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/azm;->c(Ljava/lang/String;)V

    .line 68
    const-string v0, "android"

    invoke-virtual {v4, v0}, Lo/azm;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 72
    :cond_0
    const-string v0, "SNSIMCenterHelper"

    const-string v1, "getValidLoginParam() Warning Warning!!! can not get Account Info!!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const/4 v0, 0x0

    return-object v0

    .line 77
    :goto_0
    invoke-virtual {v5}, Lo/axr;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/azm;->i(Ljava/lang/String;)V

    .line 80
    invoke-virtual {v4}, Lo/azm;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v4}, Lo/azm;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 81
    invoke-virtual {v4}, Lo/azm;->i()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-virtual {v4}, Lo/azm;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 83
    :cond_1
    const-string v0, "SNSIMCenterHelper"

    const-string v1, "getValidLoginParam() Warning Warning!!! Param invalid."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    const/4 v0, 0x0

    return-object v0

    .line 86
    :cond_2
    invoke-virtual {v4, p0}, Lo/azm;->a(Z)V

    .line 87
    invoke-virtual {v4, p1}, Lo/azm;->e(Z)V

    .line 88
    invoke-static {}, Lo/ave;->b()Lo/ave;

    move-result-object v0

    invoke-virtual {v0}, Lo/ave;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/azm;->a(Ljava/lang/String;)V

    .line 89
    invoke-static {}, Lo/brg;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/azm;->e(Ljava/lang/String;)V

    .line 91
    return-object v4
.end method

.method private static d()V
    .locals 3

    .line 110
    const-string v0, "mcode"

    const-string v1, "jabber:client"

    new-instance v2, Lcom/huawei/health/sns/server/im/login/impl/provider/MCodeProvider;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/login/impl/provider/MCodeProvider;-><init>()V

    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addIQProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    const-string v0, "offlinemsg"

    const-string v1, "jabber:client"

    new-instance v2, Lcom/huawei/health/sns/server/im/login/impl/provider/OfflineMsgRangeProvider;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/login/impl/provider/OfflineMsgRangeProvider;-><init>()V

    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addIQProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 114
    const-string v0, "config"

    const-string v1, "jabber:client"

    new-instance v2, Lcom/huawei/health/sns/server/im/login/impl/provider/SNSConfigProvider;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/login/impl/provider/SNSConfigProvider;-><init>()V

    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addIQProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    const-string v0, "messages"

    const-string v1, "jabber:client"

    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/provider/SyncSeqProvider;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/impl/provider/SyncSeqProvider;-><init>()V

    invoke-static {v0, v1, v2}, Lorg/jivesoftware/smack/provider/ProviderManager;->addIQProvider(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 117
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Set<Lo/azh;>;)V"
        }
    .end annotation

    .line 146
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/azl$a;

    invoke-direct {v1, p0, p1}, Lo/azl$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    invoke-virtual {v0, v1}, Lo/brb;->d(Ljava/lang/Runnable;)V

    .line 147
    return-void
.end method

.method public static e(Lo/azd$c;Lo/azd$a;Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/azd$c;Lo/azd$a;Ljava/util/Set<Lo/azd;>;)V"
        }
    .end annotation

    .line 158
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 159
    invoke-interface {v2, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 160
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/azl$d;

    invoke-direct {v1, p0, p1, v2}, Lo/azl$d;-><init>(Lo/azd$c;Lo/azd$a;Ljava/util/Set;)V

    invoke-virtual {v0, v1}, Lo/brb;->d(Ljava/lang/Runnable;)V

    .line 161
    return-void
.end method
