.class Lo/een;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/een$4;
    }
.end annotation


# instance fields
.field private final a:Lo/eek;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/Object;

.field private final d:Lo/edw;

.field private final e:Lo/edx$b;

.field private final g:J

.field private final i:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lo/eek;Ljava/lang/Object;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 2

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iput-object p1, p0, Lo/een;->a:Lo/eek;

    .line 106
    iput-object p2, p0, Lo/een;->c:Ljava/lang/Object;

    .line 107
    const/4 v0, 0x0

    iput-object v0, p0, Lo/een;->d:Lo/edw;

    .line 108
    iput-object p3, p0, Lo/een;->i:Landroid/os/Bundle;

    .line 109
    const-string v0, "sns_sdk_operate_type"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/edx$b;->d(I)Lo/edx$b;

    move-result-object v0

    iput-object v0, p0, Lo/een;->e:Lo/edx$b;

    .line 110
    iput-object p4, p0, Lo/een;->b:Ljava/lang/String;

    .line 111
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/een;->g:J

    .line 112
    return-void
.end method

.method constructor <init>(Lo/eek;Ljava/lang/Object;Lo/edw;Lo/edx$b;Ljava/lang/String;)V
    .locals 2

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, Lo/een;->a:Lo/eek;

    .line 86
    iput-object p2, p0, Lo/een;->c:Ljava/lang/Object;

    .line 87
    iput-object p3, p0, Lo/een;->d:Lo/edw;

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lo/een;->i:Landroid/os/Bundle;

    .line 89
    iput-object p4, p0, Lo/een;->e:Lo/edx$b;

    .line 90
    iput-object p5, p0, Lo/een;->b:Ljava/lang/String;

    .line 91
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/een;->g:J

    .line 92
    return-void
.end method

.method private a()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 222
    const/4 v3, 0x0

    .line 224
    iget-object v0, p0, Lo/een;->a:Lo/eek;

    invoke-virtual {v0}, Lo/eek;->b()Lo/eef;

    move-result-object v4

    .line 225
    if-nez v4, :cond_0

    .line 227
    const/4 v0, 0x2

    return v0

    .line 230
    :cond_0
    sget-object v0, Lo/een$4;->c:[I

    iget-object v1, p0, Lo/een;->e:Lo/edx$b;

    invoke-virtual {v1}, Lo/edx$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 233
    :pswitch_0
    iget-object v0, p0, Lo/een;->d:Lo/edw;

    check-cast v0, Lcom/huawei/sns/sdk/modelmsg/UserReq;

    iget-object v1, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v1, Lo/eeg;

    iget-object v2, p0, Lo/een;->b:Ljava/lang/String;

    invoke-interface {v4, v0, v1, v2}, Lo/eef;->b(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/eeg;Ljava/lang/String;)I

    move-result v3

    .line 235
    goto/16 :goto_1

    .line 237
    :pswitch_1
    iget-object v0, p0, Lo/een;->d:Lo/edw;

    check-cast v0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    iget-object v1, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v1, Lo/eei;

    iget-object v2, p0, Lo/een;->b:Ljava/lang/String;

    invoke-interface {v4, v0, v1, v2}, Lo/eef;->b(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Lo/eei;Ljava/lang/String;)I

    move-result v3

    .line 239
    goto/16 :goto_1

    .line 241
    :pswitch_2
    iget-object v0, p0, Lo/een;->d:Lo/edw;

    check-cast v0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    iget-object v1, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v1, Lo/eee;

    iget-object v2, p0, Lo/een;->b:Ljava/lang/String;

    invoke-interface {v4, v0, v1, v2}, Lo/eef;->a(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Lo/eee;Ljava/lang/String;)I

    move-result v3

    .line 243
    goto/16 :goto_1

    .line 245
    :pswitch_3
    iget-object v0, p0, Lo/een;->d:Lo/edw;

    check-cast v0, Lcom/huawei/sns/sdk/modelmsg/UserReq;

    iget-object v1, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v1, Lo/edy;

    iget-object v2, p0, Lo/een;->b:Ljava/lang/String;

    invoke-interface {v4, v0, v1, v2}, Lo/eef;->b(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/edy;Ljava/lang/String;)I

    move-result v3

    .line 246
    goto/16 :goto_1

    .line 248
    :pswitch_4
    iget-object v0, p0, Lo/een;->d:Lo/edw;

    check-cast v0, Lcom/huawei/sns/sdk/modelmsg/UserReq;

    iget-object v1, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v1, Lo/edy;

    iget-object v2, p0, Lo/een;->b:Ljava/lang/String;

    invoke-interface {v4, v0, v1, v2}, Lo/eef;->a(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/edy;Ljava/lang/String;)I

    move-result v3

    .line 250
    goto/16 :goto_1

    .line 252
    :pswitch_5
    iget-object v0, p0, Lo/een;->d:Lo/edw;

    check-cast v0, Lcom/huawei/sns/sdk/modelmsg/UserReq;

    iget-object v1, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v1, Lo/edy;

    iget-object v2, p0, Lo/een;->b:Ljava/lang/String;

    invoke-interface {v4, v0, v1, v2}, Lo/eef;->e(Lcom/huawei/sns/sdk/modelmsg/UserReq;Lo/edy;Ljava/lang/String;)I

    move-result v3

    .line 253
    goto/16 :goto_1

    .line 255
    :pswitch_6
    iget-object v0, p0, Lo/een;->d:Lo/edw;

    check-cast v0, Lcom/huawei/sns/sdk/modelmsg/GroupReq;

    iget-object v1, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v1, Lo/eeb;

    iget-object v2, p0, Lo/een;->b:Ljava/lang/String;

    invoke-interface {v4, v0, v1, v2}, Lo/eef;->d(Lcom/huawei/sns/sdk/modelmsg/GroupReq;Lo/eeb;Ljava/lang/String;)I

    move-result v3

    .line 257
    goto :goto_1

    .line 259
    :pswitch_7
    iget-object v0, p0, Lo/een;->d:Lo/edw;

    check-cast v0, Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;

    iget-object v1, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v1, Lo/eec;

    iget-object v2, p0, Lo/een;->b:Ljava/lang/String;

    invoke-interface {v4, v0, v1, v2}, Lo/eef;->b(Lcom/huawei/sns/sdk/modelmsg/GroupMemReq;Lo/eec;Ljava/lang/String;)I

    move-result v3

    .line 261
    goto :goto_1

    .line 263
    :pswitch_8
    iget-object v0, p0, Lo/een;->d:Lo/edw;

    check-cast v0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;

    iget-object v1, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v1, Lo/eea;

    iget-object v2, p0, Lo/een;->b:Ljava/lang/String;

    invoke-interface {v4, v0, v1, v2}, Lo/eef;->d(Lcom/huawei/sns/sdk/modelmsg/DownloadImageReq;Lo/eea;Ljava/lang/String;)I

    move-result v3

    .line 265
    goto :goto_1

    .line 267
    :pswitch_9
    iget-object v0, p0, Lo/een;->i:Landroid/os/Bundle;

    iget-object v1, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v1, Lo/eed;

    iget-object v2, p0, Lo/een;->b:Ljava/lang/String;

    invoke-interface {v4, v0, v1, v2}, Lo/eef;->a(Landroid/os/Bundle;Lo/eed;Ljava/lang/String;)I

    move-result v3

    .line 268
    goto :goto_1

    .line 270
    :goto_0
    const-string v0, "SNS_SDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SDKDataTask executeSDKAIDL. Warning Warning! UnKonw OperateType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/een;->e:Lo/edx$b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 273
    :goto_1
    const-string v0, "SNS_SDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SDKDataTask executeSDKAIDL done. OperateType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/een;->e:Lo/edx$b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v3}, Lo/ees;->e(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 276
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method private e(Lo/edv;)V
    .locals 2

    .line 208
    iget-object v0, p0, Lo/een;->d:Lo/edw;

    iget-object v0, v0, Lo/edw;->transaction:Ljava/lang/String;

    iput-object v0, p1, Lo/edv;->transaction:Ljava/lang/String;

    .line 209
    const/4 v0, 0x2

    iput v0, p1, Lo/edv;->errorCode:I

    .line 210
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/ees;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " TimeOut"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lo/edv;->errorReason:Ljava/lang/String;

    .line 211
    return-void
.end method


# virtual methods
.method d()Z
    .locals 6

    .line 133
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/een;->g:J

    sub-long v4, v0, v2

    .line 134
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-ltz v0, :cond_0

    const-wide/16 v0, 0x1b58

    cmp-long v0, v4, v0

    if-lez v0, :cond_1

    .line 136
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 138
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method e()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 148
    const-string v0, "SNS_SDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SDKDataTask execute timeout operation! OperateType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/een;->e:Lo/edx$b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    sget-object v0, Lo/een$4;->c:[I

    iget-object v1, p0, Lo/een;->e:Lo/edx$b;

    invoke-virtual {v1}, Lo/edx$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 152
    :pswitch_0
    new-instance v4, Lcom/huawei/sns/sdk/modelmsg/UserDetailResp;

    invoke-direct {v4}, Lcom/huawei/sns/sdk/modelmsg/UserDetailResp;-><init>()V

    .line 153
    invoke-direct {p0, v4}, Lo/een;->e(Lo/edv;)V

    .line 154
    iget-object v0, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v0, Lo/eeg;

    invoke-interface {v0, v4}, Lo/eeg;->a(Lcom/huawei/sns/sdk/modelmsg/UserDetailResp;)V

    .line 155
    goto/16 :goto_1

    .line 157
    :pswitch_1
    new-instance v5, Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;

    invoke-direct {v5}, Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;-><init>()V

    .line 158
    invoke-direct {p0, v5}, Lo/een;->e(Lo/edv;)V

    .line 159
    iget-object v0, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v0, Lo/eei;

    invoke-interface {v0, v5}, Lo/eei;->d(Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;)V

    .line 160
    goto/16 :goto_1

    .line 162
    :pswitch_2
    new-instance v6, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;

    invoke-direct {v6}, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;-><init>()V

    .line 163
    invoke-direct {p0, v6}, Lo/een;->e(Lo/edv;)V

    .line 164
    iget-object v0, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v0, Lo/eee;

    invoke-interface {v0, v6}, Lo/eee;->b(Lcom/huawei/sns/sdk/modelmsg/FriendListResp;)V

    .line 165
    goto/16 :goto_1

    .line 170
    :pswitch_3
    new-instance v7, Lcom/huawei/sns/sdk/modelmsg/CommonResp;

    invoke-direct {v7}, Lcom/huawei/sns/sdk/modelmsg/CommonResp;-><init>()V

    .line 171
    invoke-direct {p0, v7}, Lo/een;->e(Lo/edv;)V

    .line 172
    iget-object v0, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v0, Lo/edy;

    invoke-interface {v0, v7}, Lo/edy;->a(Lcom/huawei/sns/sdk/modelmsg/CommonResp;)V

    .line 173
    goto/16 :goto_1

    .line 175
    :pswitch_4
    new-instance v8, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;

    invoke-direct {v8}, Lcom/huawei/sns/sdk/modelmsg/GroupListResp;-><init>()V

    .line 176
    invoke-direct {p0, v8}, Lo/een;->e(Lo/edv;)V

    .line 177
    iget-object v0, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v0, Lo/eeb;

    invoke-interface {v0, v8}, Lo/eeb;->b(Lcom/huawei/sns/sdk/modelmsg/GroupListResp;)V

    .line 178
    goto/16 :goto_1

    .line 180
    :pswitch_5
    new-instance v9, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;

    invoke-direct {v9}, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;-><init>()V

    .line 181
    invoke-direct {p0, v9}, Lo/een;->e(Lo/edv;)V

    .line 182
    iget-object v0, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v0, Lo/eec;

    invoke-interface {v0, v9}, Lo/eec;->d(Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;)V

    .line 183
    goto :goto_1

    .line 185
    :pswitch_6
    new-instance v10, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;

    invoke-direct {v10}, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;-><init>()V

    .line 186
    invoke-direct {p0, v10}, Lo/een;->e(Lo/edv;)V

    .line 187
    iget-object v0, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v0, Lo/eea;

    invoke-interface {v0, v10}, Lo/eea;->e(Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;)V

    .line 188
    goto :goto_1

    .line 190
    :pswitch_7
    iget-object v0, p0, Lo/een;->i:Landroid/os/Bundle;

    const-string v1, "errorCode"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 191
    iget-object v0, p0, Lo/een;->i:Landroid/os/Bundle;

    const-string v1, "errorReason"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x2

    invoke-static {v3}, Lo/ees;->e(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " TimeOut"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    iget-object v0, p0, Lo/een;->c:Ljava/lang/Object;

    check-cast v0, Lo/eed;

    iget-object v1, p0, Lo/een;->i:Landroid/os/Bundle;

    invoke-interface {v0, v1}, Lo/eed;->a(Landroid/os/Bundle;)V

    .line 193
    goto :goto_1

    .line 195
    :goto_0
    const-string v0, "SNS_SDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SDKDataTask executeTimeout. Warning Warning! Unknow OperateType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/een;->e:Lo/edx$b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public run()V
    .locals 4

    .line 284
    :try_start_0
    invoke-direct {p0}, Lo/een;->a()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 289
    goto :goto_0

    .line 286
    :catch_0
    move-exception v3

    .line 288
    const-string v0, "SNS_SDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SDKDataTask execute "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/een;->e:Lo/edx$b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " meet Exception!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 290
    :goto_0
    return-void
.end method
