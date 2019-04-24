.class public Lo/awm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/awm$c;,
        Lo/awm$d;
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 49
    const-class v0, Lo/awm;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/awm;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Landroid/content/Context;Lo/awm$d;Lo/bio;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;
    .locals 1

    .line 47
    invoke-static {p0, p1, p2}, Lo/awm;->b(Landroid/content/Context;Lo/awm$d;Lo/bio;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 47
    sget-object v0, Lo/awm;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 318
    const-string v1, ""

    .line 319
    if-eqz p0, :cond_0

    .line 321
    sget v0, Lcom/huawei/android/sns/R$string;->sns_apply_add_friend:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 323
    :cond_0
    return-object v1
.end method

.method public static a(JI)V
    .locals 2

    .line 270
    const/16 v0, 0x3ed

    if-ne p2, v0, :cond_0

    .line 272
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p0, p1}, Lo/awm;->d(J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 274
    :cond_0
    return-void
.end method

.method static synthetic a(Landroid/content/Context;Lo/awm$c;Lcom/huawei/health/sns/server/user/AddFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 47
    invoke-static {p0, p1, p2, p3}, Lo/awm;->c(Landroid/content/Context;Lo/awm$c;Lcom/huawei/health/sns/server/user/AddFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method

.method public static b(Landroid/content/Context;Lo/awm$c;)Landroid/app/AlertDialog;
    .locals 7

    .line 106
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_button_reply:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const-string v3, ""

    sget v4, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v5, Lcom/huawei/android/sns/R$string;->sns_button_send:I

    .line 107
    invoke-static {p0, p1}, Lo/awm;->e(Landroid/content/Context;Lo/awm$c;)Lo/boj$e;

    move-result-object v6

    .line 106
    invoke-static/range {v0 .. v6}, Lo/boj;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILo/boj$e;)Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;Lo/awm$d;Lo/aws;Lo/bfh;Ljava/lang/String;Ljava/lang/String;)Landroid/app/AlertDialog;
    .locals 14

    .line 370
    sget-object v0, Lo/awm;->b:Ljava/lang/String;

    const-string v1, "Enter showAddFriendDialog"

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend:I

    .line 372
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_add_friend_dialog_content:I

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p5

    sget v4, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v5, Lcom/huawei/android/sns/R$string;->sns_button_send:I

    new-instance v6, Lo/awm$5;

    move-object v7, p1

    move-object/from16 v8, p5

    move-object v9, p0

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v12, p2

    invoke-direct/range {v6 .. v12}, Lo/awm$5;-><init>(Lo/awm$d;Ljava/lang/String;Landroid/content/Context;Lo/bfh;Ljava/lang/String;Lo/aws;)V

    .line 371
    invoke-static/range {v0 .. v6}, Lo/boj;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILo/boj$e;)Landroid/app/AlertDialog;

    move-result-object v13

    .line 398
    return-object v13
.end method

.method private static b(Landroid/content/Context;Lo/awm$d;Lo/bio;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;
    .locals 1

    .line 533
    new-instance v0, Lo/awm$8;

    invoke-direct {v0, p0, p1, p2}, Lo/awm$8;-><init>(Landroid/content/Context;Lo/awm$d;Lo/bio;)V

    return-object v0
.end method

.method private static b(Landroid/content/Context;Lo/awm$d;Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 7

    .line 559
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_4

    .line 561
    const-wide/16 v3, -0x1

    .line 562
    instance-of v0, p2, Lcom/huawei/health/sns/server/user/AddFriendRequest;

    if-eqz v0, :cond_0

    .line 564
    move-object v0, p2

    check-cast v0, Lcom/huawei/health/sns/server/user/AddFriendRequest;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->getFrdUID_()J

    move-result-wide v3

    .line 566
    :cond_0
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_3

    .line 568
    instance-of v0, p3, Lcom/huawei/health/sns/server/user/AddFriendResponse;

    if-eqz v0, :cond_2

    .line 570
    move-object v5, p3

    check-cast v5, Lcom/huawei/health/sns/server/user/AddFriendResponse;

    .line 572
    iget-object v0, v5, Lcom/huawei/health/sns/server/user/AddFriendResponse;->AddFriendRsp_:Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    cmp-long v0, v3, v0

    if-eqz v0, :cond_1

    .line 574
    iget-object v0, v5, Lcom/huawei/health/sns/server/user/AddFriendResponse;->AddFriendRsp_:Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;

    iget v6, v0, Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;->result_:I

    .line 576
    invoke-interface {p1, v3, v4, v6}, Lo/awm$d;->a(JI)V

    .line 578
    sget-object v0, Lo/awm;->b:Ljava/lang/String;

    const-string v1, "Add Friend."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 579
    goto :goto_0

    .line 582
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$string;->sns_add_friend_error:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 583
    sget-object v0, Lo/awm;->b:Ljava/lang/String;

    const-string v1, "AddFriendRsp is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 585
    :goto_0
    goto :goto_1

    .line 588
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_add_friend_error:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 589
    sget-object v0, Lo/awm;->b:Ljava/lang/String;

    const-string v1, "wrong response."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 594
    :cond_3
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-static {v3, v4, v0}, Lo/awm;->a(JI)V

    .line 595
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    const-string v1, "addFriendVerifyNote"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/awj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 596
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iget v1, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 597
    sget-object v0, Lo/awm;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 599
    :goto_1
    goto :goto_2

    .line 602
    :cond_4
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iget v1, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 603
    sget-object v0, Lo/awm;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 605
    :goto_2
    return-void
.end method

.method private static c(Landroid/app/Activity;Lo/bfh;Lo/awm$d;Ljava/lang/String;)Lo/aud;
    .locals 7

    .line 438
    invoke-static {p0}, Lo/awm;->e(Landroid/content/Context;)Lo/bio;

    move-result-object v6

    .line 439
    if-eqz v6, :cond_0

    .line 441
    invoke-virtual {v6}, Lo/bio;->a()V

    .line 444
    :cond_0
    new-instance v0, Lo/awm$3;

    move-object v1, v6

    move-object v2, p2

    move-object v3, p1

    move-object v4, p3

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/awm$3;-><init>(Lo/bio;Lo/awm$d;Lo/bfh;Ljava/lang/String;Landroid/app/Activity;)V

    return-object v0
.end method

.method private static c(Landroid/content/Context;Lo/awm$c;Lcom/huawei/health/sns/server/user/AddFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 4

    .line 224
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_3

    .line 226
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_2

    .line 228
    instance-of v0, p3, Lcom/huawei/health/sns/server/user/AddFriendResponse;

    if-eqz v0, :cond_1

    .line 230
    move-object v3, p3

    check-cast v3, Lcom/huawei/health/sns/server/user/AddFriendResponse;

    .line 231
    iget-object v0, v3, Lcom/huawei/health/sns/server/user/AddFriendResponse;->AddFriendRsp_:Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;

    if-eqz v0, :cond_0

    .line 233
    iget-object v0, v3, Lcom/huawei/health/sns/server/user/AddFriendResponse;->AddFriendRsp_:Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;

    iget v0, v0, Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;->result_:I

    iget-object v1, v3, Lcom/huawei/health/sns/server/user/AddFriendResponse;->AddFriendRsp_:Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;

    iget-object v1, v1, Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;->sendTime_:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lo/awm$c;->e(Lcom/huawei/health/sns/server/user/AddFriendRequest;ILjava/lang/String;)V

    goto :goto_0

    .line 238
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_reply_friend_error:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 239
    sget-object v0, Lo/awm;->b:Ljava/lang/String;

    const-string v1, "AddFriendRsp is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    :goto_0
    goto :goto_1

    .line 244
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$string;->sns_reply_friend_error:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 245
    sget-object v0, Lo/awm;->b:Ljava/lang/String;

    const-string v1, "wrong response"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 250
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->getFrdUID_()J

    move-result-wide v0

    iget v2, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-static {v0, v1, v2}, Lo/awm;->a(JI)V

    .line 251
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iget v1, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 252
    sget-object v0, Lo/awm;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 257
    :cond_3
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iget v1, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 258
    sget-object v0, Lo/awm;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    :goto_1
    return-void
.end method

.method static synthetic c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 47
    invoke-static {p0, p1}, Lo/awm;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 335
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    const-string v1, "addFriendVerifyNote"

    invoke-virtual {v0, v1}, Lo/awj;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 336
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 338
    return-object v4

    .line 340
    :cond_0
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->d()Ljava/lang/String;

    move-result-object v5

    .line 341
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 343
    sget v0, Lcom/huawei/android/sns/R$string;->sns_add_friend_input_text:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v5}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 345
    :cond_1
    return-object v4
.end method

.method private static d(J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 285
    new-instance v0, Lo/awm$1;

    invoke-direct {v0, p0, p1}, Lo/awm$1;-><init>(J)V

    return-object v0
.end method

.method static synthetic d(Landroid/content/Context;Lo/bfh;Lo/awm$c;Ljava/lang/String;)V
    .locals 0

    .line 47
    invoke-static {p0, p1, p2, p3}, Lo/awm;->e(Landroid/content/Context;Lo/bfh;Lo/awm$c;Ljava/lang/String;)V

    return-void
.end method

.method public static d(Landroid/content/Context;Lo/bfh;Lo/awm$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 413
    if-nez p2, :cond_0

    .line 415
    return-void

    .line 418
    :cond_0
    instance-of v0, p0, Landroid/app/Activity;

    if-nez v0, :cond_1

    .line 420
    sget-object v0, Lo/awm;->b:Ljava/lang/String;

    const-string v1, "addFriend context not instanceof Activity"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    return-void

    .line 423
    :cond_1
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0, p1, p2, p3}, Lo/awm;->c(Landroid/app/Activity;Lo/bfh;Lo/awm$d;Ljava/lang/String;)Lo/aud;

    move-result-object v0

    invoke-static {p4, v0}, Lo/aty;->a(Ljava/lang/String;Lo/aud;)V

    .line 424
    return-void
.end method

.method private static e(Landroid/content/Context;)Lo/bio;
    .locals 5

    .line 152
    const/4 v3, 0x0

    .line 153
    if-eqz p0, :cond_0

    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 155
    move-object v4, p0

    check-cast v4, Landroid/app/Activity;

    .line 156
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    new-instance v3, Lo/bio;

    sget v0, Lcom/huawei/android/sns/R$string;->sns_sending:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v3, p0, v1, v0, v2}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 161
    :cond_0
    return-object v3
.end method

.method private static e(Landroid/content/Context;Lo/awm$c;)Lo/boj$e;
    .locals 1

    .line 120
    new-instance v0, Lo/awm$2;

    invoke-direct {v0, p1, p0}, Lo/awm$2;-><init>(Lo/awm$c;Landroid/content/Context;)V

    return-object v0
.end method

.method static synthetic e(Landroid/content/Context;Lo/awm$d;Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 47
    invoke-static {p0, p1, p2, p3}, Lo/awm;->b(Landroid/content/Context;Lo/awm$d;Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method

.method private static e(Landroid/content/Context;Lo/bfh;Lo/awm$c;Ljava/lang/String;)V
    .locals 7

    .line 170
    if-nez p2, :cond_0

    .line 172
    return-void

    .line 174
    :cond_0
    invoke-static {p0}, Lo/awm;->e(Landroid/content/Context;)Lo/bio;

    move-result-object v6

    .line 175
    if-eqz v6, :cond_1

    .line 177
    invoke-virtual {v6}, Lo/bio;->a()V

    .line 179
    :cond_1
    new-instance v0, Lo/awm$4;

    move-object v1, p2

    move-object v2, p1

    move-object v3, p3

    move-object v4, v6

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/awm$4;-><init>(Lo/awm$c;Lo/bfh;Ljava/lang/String;Lo/bio;Landroid/content/Context;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 210
    return-void
.end method

.method private static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 356
    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 359
    return-void

    .line 361
    :cond_0
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    const-string v1, "addFriendVerifyNote"

    invoke-virtual {v0, v1, p1}, Lo/awj;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    return-void
.end method
