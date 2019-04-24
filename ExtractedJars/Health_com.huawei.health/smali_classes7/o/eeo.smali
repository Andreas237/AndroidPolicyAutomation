.class final Lo/eeo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const-string v0, "SNSOpenAPIHelper"

    sput-object v0, Lo/eeo;->c:Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/edw;)I
    .locals 1

    .line 208
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lo/edw;->checkArgs()Z

    move-result v0

    if-nez v0, :cond_1

    .line 210
    :cond_0
    const/16 v0, 0x9

    return v0

    .line 212
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Z)I
    .locals 1

    .line 223
    invoke-static {}, Lo/eel;->b()Lo/eel;

    move-result-object v0

    invoke-virtual {v0}, Lo/eel;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 225
    const/16 v0, 0xb

    return v0

    .line 228
    :cond_0
    if-nez p0, :cond_1

    .line 230
    const/4 v0, 0x4

    return v0

    .line 233
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    .locals 2

    .line 319
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 320
    invoke-virtual {v1, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 321
    if-eqz p2, :cond_0

    .line 323
    invoke-virtual {v1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 325
    :cond_0
    return-object v1
.end method

.method public static b(Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;Landroid/content/Intent;Landroid/os/Bundle;Z)V
    .locals 4

    .line 163
    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->param:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 166
    const-string v0, "com.huawei.sns.sdk.COMMON_GROUP_VIEW"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 171
    :cond_0
    if-nez p3, :cond_1

    .line 173
    const/high16 v0, 0x8000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 175
    :cond_1
    const-string v0, "com.huawei.sns.sdk.COMMON_GROUP_DETAIL_VIEW"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 176
    const-string v0, "sns_sdk_key_group_id"

    iget-wide v1, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->param:J

    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 178
    :goto_0
    return-void
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    .line 261
    if-nez p0, :cond_0

    .line 263
    sget-object v0, Lo/eeo;->c:Ljava/lang/String;

    const-string v1, "SNSOpenAPI, ctx is null."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 264
    const/4 v0, 0x0

    return v0

    .line 266
    :cond_0
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 268
    const/4 v0, 0x1

    return v0

    .line 270
    :cond_1
    sget-object v0, Lo/eeo;->c:Ljava/lang/String;

    const-string v1, "SNSOpenAPI, ctx is not a activity."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 271
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 4

    .line 186
    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->param:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 189
    const-string v0, "com.huawei.sns.sdk.FAMILY_GROUP_VIEW"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 194
    :cond_0
    const-string v0, "com.huawei.sns.sdk.FAMILY_GROUP_DETAIL_VIEW"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 195
    const-string v0, "sns_sdk_key_group_id"

    iget-wide v1, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->param:J

    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 197
    :goto_0
    return-void
.end method

.method public static e(Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;Landroid/content/Intent;Landroid/os/Bundle;Z)I
    .locals 7

    .line 89
    if-nez p3, :cond_0

    .line 91
    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 93
    :cond_0
    const/4 v4, 0x0

    .line 94
    iget v5, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->ui:I

    .line 95
    const/4 v6, 0x1

    .line 96
    packed-switch v5, :pswitch_data_0

    goto :goto_0

    .line 100
    :pswitch_0
    const-string v0, "com.huawei.sns.sdk.MSG_VIEW"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 101
    goto :goto_1

    .line 104
    :pswitch_1
    const-string v0, "com.huawei.sns.sdk.FRIEND_VIEW"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 105
    goto :goto_1

    .line 107
    :pswitch_2
    invoke-static {p0, p1, p2}, Lo/eeo;->d(Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 108
    goto :goto_1

    .line 110
    :pswitch_3
    invoke-static {p0, p1, p2, p3}, Lo/eeo;->b(Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;Landroid/content/Intent;Landroid/os/Bundle;Z)V

    .line 111
    goto :goto_1

    .line 114
    :goto_0
    const/4 v6, 0x0

    .line 117
    :goto_1
    if-eqz v6, :cond_1

    .line 120
    const/4 v0, 0x0

    return v0

    .line 123
    :cond_1
    iget-wide v0, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->param:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    .line 125
    const/16 v0, 0x9

    return v0

    .line 127
    :cond_2
    const/4 v4, 0x0

    .line 128
    packed-switch v5, :pswitch_data_1

    goto :goto_2

    .line 132
    :pswitch_4
    const-string v0, "com.huawei.sns.sdk.CHAT_FRIEND_DETAIL_VIEW"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 133
    const-string v0, "sns_sdk_key_friend_id"

    iget-wide v1, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->param:J

    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 134
    goto :goto_3

    .line 137
    :pswitch_5
    const-string v0, "com.huawei.sns.sdk.FRIEND_DETAIL_VIEW"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 138
    const-string v0, "sns_sdk_key_friend_id"

    iget-wide v1, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->param:J

    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 139
    goto :goto_3

    .line 142
    :pswitch_6
    const-string v0, "com.huawei.sns.sdk.CHAT_GROUP_DETAIL_VIEW"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 143
    const-string v0, "sns_sdk_key_group_id"

    iget-wide v1, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->param:J

    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 144
    goto :goto_3

    .line 147
    :pswitch_7
    const-string v0, "com.huawei.sns.sdk.ASSISTANT_CHAT_VIEW"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 148
    const-string v0, "sns_sdk_key_friend_id"

    iget-wide v1, p0, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->param:J

    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 149
    goto :goto_3

    .line 151
    :goto_2
    const/16 v4, 0x9

    .line 154
    :goto_3
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public static e(Lo/edw;Z)I
    .locals 2

    .line 57
    invoke-static {p0}, Lo/eeo;->a(Lo/edw;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    const/16 v0, 0x9

    return v0

    .line 62
    :cond_0
    invoke-static {p1}, Lo/eeo;->a(Z)I

    move-result v1

    .line 63
    if-eqz v1, :cond_1

    .line 65
    return v1

    .line 67
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Lo/edv;Ljava/lang/String;I)V
    .locals 1

    .line 245
    if-eqz p0, :cond_0

    .line 247
    iput-object p1, p0, Lo/edv;->transaction:Ljava/lang/String;

    .line 248
    iput p2, p0, Lo/edv;->errorCode:I

    .line 249
    invoke-static {p2}, Lo/ees;->e(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/edv;->errorReason:Ljava/lang/String;

    .line 251
    :cond_0
    return-void
.end method
