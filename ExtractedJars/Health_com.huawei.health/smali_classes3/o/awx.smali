.class public Lo/awx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/awx$a;,
        Lo/awx$c;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    const-class v0, Lo/awx;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/awx;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lo/bio;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;)V
    .locals 0

    .line 28
    invoke-static {p0, p1, p2, p3, p4}, Lo/awx;->d(Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lo/bio;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;)V

    return-void
.end method

.method private static c(Landroid/content/Context;)Lo/bio;
    .locals 5

    .line 49
    if-eqz p0, :cond_0

    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 51
    move-object v4, p0

    check-cast v4, Landroid/app/Activity;

    .line 52
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 54
    new-instance v0, Lo/bio;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_sending:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p0, v2, v1, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    .line 57
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static c(Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 5

    .line 190
    const/4 v3, 0x0

    .line 191
    instance-of v0, p4, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse;

    if-eqz v0, :cond_0

    .line 193
    move-object v0, p4

    check-cast v0, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse;

    iget-object v3, v0, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse;->ReplyAddFrdRsp_:Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;

    .line 196
    :cond_0
    if-nez v3, :cond_1

    .line 198
    return-void

    .line 200
    :cond_1
    iget v4, v3, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;->result_:I

    .line 201
    if-eqz p2, :cond_2

    const/16 v0, 0x402

    if-eq v4, v0, :cond_2

    .line 203
    invoke-interface {p2}, Lo/awx$a;->e()V

    .line 206
    :cond_2
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_0

    .line 210
    :pswitch_0
    iget-object v0, v3, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;->sendTime_:Ljava/lang/String;

    invoke-interface {p1, p3, v0}, Lo/awx$c;->a(Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Ljava/lang/String;)V

    .line 211
    sget-object v0, Lo/awx;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ReplyAddFriendResponse.SUCC sendTime_:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v3, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;->sendTime_:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    goto :goto_0

    .line 217
    :pswitch_1
    invoke-interface {p1}, Lo/awx$c;->b()V

    .line 218
    goto :goto_0

    .line 223
    :pswitch_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_add_friend_more_req:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 224
    goto :goto_0

    .line 229
    :pswitch_3
    sget v0, Lcom/huawei/android/sns/R$string;->sns_self_friend_over:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 230
    goto :goto_0

    .line 235
    :pswitch_4
    sget v0, Lcom/huawei/android/sns/R$string;->sns_other_friend_over:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 236
    goto :goto_0

    .line 241
    :pswitch_5
    iget-object v0, v3, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;->sendTime_:Ljava/lang/String;

    invoke-interface {p1, p3, v0}, Lo/awx$c;->a(Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Ljava/lang/String;)V

    .line 242
    .line 247
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private static d(Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 3

    .line 147
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_2

    .line 149
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_1

    .line 151
    instance-of v0, p4, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse;

    if-eqz v0, :cond_0

    .line 153
    sget-object v0, Lo/awx;->c:Ljava/lang/String;

    const-string v1, "Agree Friend."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    invoke-static {p0, p1, p2, p3, p4}, Lo/awx;->c(Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    goto :goto_0

    .line 160
    :cond_0
    sget-object v0, Lo/awx;->c:Ljava/lang/String;

    const-string v1, "wrong response."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 165
    :cond_1
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->getFrdUID_()J

    move-result-wide v0

    iget v2, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-static {v0, v1, v2}, Lo/awm;->a(JI)V

    .line 166
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 167
    sget-object v0, Lo/awx;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 172
    :cond_2
    sget-object v0, Lo/awx;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 175
    :goto_0
    return-void
.end method

.method private static d(Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lo/bio;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;)V
    .locals 6

    .line 121
    new-instance v0, Lo/awx$3;

    move-object v1, p3

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/awx$3;-><init>(Lo/bio;Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;)V

    invoke-static {p4, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->c(Lcom/huawei/health/sns/server/SNSRequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;

    .line 133
    return-void
.end method

.method public static d(Landroid/content/Context;Lo/bfh;Lo/awx$c;Lo/awx$a;Ljava/lang/String;)V
    .locals 8

    .line 76
    if-nez p2, :cond_0

    .line 78
    return-void

    .line 81
    :cond_0
    invoke-static {p0}, Lo/awx;->c(Landroid/content/Context;)Lo/bio;

    move-result-object v6

    .line 82
    if-eqz v6, :cond_1

    .line 84
    invoke-virtual {v6}, Lo/bio;->a()V

    .line 86
    :cond_1
    invoke-interface {p2, p1, p4}, Lo/awx$c;->b(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;

    move-result-object v7

    .line 87
    new-instance v0, Lo/awx$1;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, v6

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lo/awx$1;-><init>(Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lo/bio;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 106
    return-void
.end method

.method static synthetic e(Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 28
    invoke-static {p0, p1, p2, p3, p4}, Lo/awx;->d(Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method

.method public static e(Landroid/content/Context;Lo/bfh;Lo/awx$c;Ljava/lang/String;)V
    .locals 1

    .line 66
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0, p3}, Lo/awx;->d(Landroid/content/Context;Lo/bfh;Lo/awx$c;Lo/awx$a;Ljava/lang/String;)V

    .line 67
    return-void
.end method
