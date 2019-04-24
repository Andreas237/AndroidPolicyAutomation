.class final Lo/azr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()V
    .locals 13

    .line 163
    const/4 v4, 0x1

    .line 164
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->e()[Ljava/lang/String;

    move-result-object v5

    .line 165
    const/4 v0, 0x1

    aget-object v6, v5, v0

    .line 167
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    const-string v0, "SNSIMConnection"

    const-string v1, "showNotify\uff08\uff09 phoneType is null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    return-void

    .line 172
    :cond_0
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v7

    .line 174
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v8

    .line 175
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-lez v0, :cond_3

    .line 181
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v6, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    .line 182
    const-string v0, "LON-AL00-PD"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 184
    const-string v6, "LON-AL00"

    goto :goto_0

    .line 186
    :cond_1
    const-string v0, "LON-L29-PD"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 188
    const-string v6, "LON-L29"

    .line 190
    :cond_2
    :goto_0
    new-instance v10, Lo/aye;

    invoke-direct {v10}, Lo/aye;-><init>()V

    .line 191
    new-instance v11, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {v11, v7, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 192
    const-string v0, "messageTab"

    const/4 v1, 0x1

    invoke-virtual {v11, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 193
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lo/aye;->c(Z)V

    .line 194
    sget v0, Lcom/huawei/android/sns/R$string;->sns_offline_notify_title:I

    invoke-virtual {v7, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/aye;->c(Ljava/lang/String;)V

    .line 195
    sget v0, Lcom/huawei/android/sns/R$string;->sns_offline_notify_message:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/aye;->a(Ljava/lang/String;)V

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "IMOfflineNotify"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-virtual {v10, v0}, Lo/aye;->b(I)V

    .line 197
    invoke-virtual {v10, v11}, Lo/aye;->e(Landroid/content/Intent;)V

    .line 199
    invoke-static {v7, v10}, Lo/auw;->d(Landroid/content/Context;Lo/aye;)Lo/auw;

    move-result-object v12

    .line 200
    invoke-virtual {v12}, Lo/auw;->e()V

    .line 202
    :cond_3
    return-void
.end method

.method static b(Lorg/jivesoftware/smack/XMPPException$StreamErrorException;)I
    .locals 7

    .line 79
    const/4 v3, 0x0

    .line 80
    if-nez p0, :cond_0

    .line 82
    return v3

    .line 85
    :cond_0
    invoke-virtual {p0}, Lorg/jivesoftware/smack/XMPPException$StreamErrorException;->getStreamError()Lorg/jivesoftware/smack/packet/StreamError;

    move-result-object v4

    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v6, 0x0

    .line 88
    if-eqz v4, :cond_1

    .line 90
    invoke-virtual {v4}, Lorg/jivesoftware/smack/packet/StreamError;->getCondition()Lorg/jivesoftware/smack/packet/StreamError$Condition;

    move-result-object v5

    .line 91
    invoke-virtual {v4}, Lorg/jivesoftware/smack/packet/StreamError;->getConditionText()Ljava/lang/String;

    move-result-object v6

    .line 95
    :cond_1
    sget-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->conflict:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    if-ne v5, v0, :cond_3

    .line 97
    const-string v0, "SNSIMConnection"

    const-string v1, "StreamError, conflict! another device online."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    invoke-static {v6}, Lo/azr;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 103
    invoke-static {}, Lo/azr;->a()V

    .line 107
    :cond_2
    const/4 v3, 0x1

    goto :goto_0

    .line 109
    :cond_3
    sget-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->unsupported_version:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    if-ne v5, v0, :cond_4

    .line 111
    const-string v0, "SNSIMConnection"

    const-string v1, "unsupported_version, checkUpdate."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->k()V

    .line 116
    const/4 v3, 0x1

    goto :goto_0

    .line 119
    :cond_4
    sget-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->invalid_id:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    if-ne v5, v0, :cond_5

    .line 122
    const-string v0, "SNSIMConnection"

    const-string v1, "invalid_id, IM logout."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isAccountInvalid"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 125
    const/4 v3, 0x1

    goto :goto_0

    .line 127
    :cond_5
    sget-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->see_other_host:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    if-ne v5, v0, :cond_6

    .line 129
    const-string v0, "SNSIMConnection"

    const-string v1, "see_other_host"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    const/4 v3, 0x2

    .line 134
    :cond_6
    :goto_0
    return v3
.end method

.method public static d(J)Z
    .locals 9

    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p0

    const-wide/16 v2, 0x3e8

    div-long v4, v0, v2

    .line 148
    invoke-static {}, Lo/baa;->e()Lo/baa;

    move-result-object v0

    invoke-virtual {v0}, Lo/baa;->d()I

    move-result v0

    int-to-long v6, v0

    .line 150
    cmp-long v0, v4, v6

    if-gez v0, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    .line 151
    :goto_0
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-nez v0, :cond_1

    if-nez v8, :cond_2

    .line 153
    :cond_1
    const-string v0, "SNSIMConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "valid the diff timestamp of last Packet received:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",Ping interval:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    :cond_2
    return v8
.end method

.method private static e(Ljava/lang/String;)Z
    .locals 7

    .line 49
    new-instance v4, Lo/bca;

    invoke-direct {v4}, Lo/bca;-><init>()V

    .line 51
    invoke-virtual {v4}, Lo/bca;->d()Z

    move-result v5

    .line 52
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 57
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 58
    const-string v0, "phonetype"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 59
    const-string v0, "ts"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 61
    invoke-virtual {v4, v3, v2}, Lo/bca;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    goto :goto_0

    .line 63
    :catch_0
    move-exception v6

    .line 65
    const-string v0, "SNSIMConnection"

    const-string v1, "handlerConflictInfo JSONException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    :cond_0
    :goto_0
    return v5
.end method
