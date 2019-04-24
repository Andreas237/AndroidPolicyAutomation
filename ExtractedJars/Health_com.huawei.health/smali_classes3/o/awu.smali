.class public Lo/awu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 51
    const-class v0, Lo/awu;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/awu;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    const/4 v0, 0x0

    iput v0, p0, Lo/awu;->e:I

    .line 108
    iput-object p1, p0, Lo/awu;->a:Ljava/lang/String;

    .line 109
    return-void
.end method

.method private static a(IIILandroid/os/Handler;Ljava/lang/String;)Lo/brd;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIILandroid/os/Handler;Ljava/lang/String;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 325
    new-instance v0, Lo/awu$2;

    move-object v1, p4

    move v2, p1

    move v3, p2

    move v4, p0

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/awu$2;-><init>(Ljava/lang/String;IIILandroid/os/Handler;)V

    return-object v0
.end method

.method static synthetic a(Landroid/os/Handler;Ljava/lang/String;I)Lo/brd;
    .locals 1

    .line 49
    invoke-static {p0, p1, p2}, Lo/awu;->c(Landroid/os/Handler;Ljava/lang/String;I)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;Landroid/os/Handler;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Landroid/os/Handler;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 363
    new-instance v0, Lo/awu$3;

    invoke-direct {v0, p0, p1}, Lo/awu$3;-><init>(Ljava/lang/String;Landroid/os/Handler;)V

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Landroid/os/Handler;)V
    .locals 0

    .line 49
    invoke-static {p0, p1}, Lo/awu;->c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Landroid/os/Handler;)V

    return-void
.end method

.method private static a(Ljava/lang/String;ILcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Landroid/os/Handler;)V
    .locals 11

    .line 455
    if-nez p2, :cond_0

    .line 457
    return-void

    .line 459
    :cond_0
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_4

    .line 463
    instance-of v0, p2, Lcom/huawei/health/sns/server/user/FindAssistantResponse;

    if-eqz v0, :cond_5

    .line 465
    move-object v3, p2

    check-cast v3, Lcom/huawei/health/sns/server/user/FindAssistantResponse;

    .line 466
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->getErrcode_()I

    move-result v4

    .line 467
    if-nez v4, :cond_3

    .line 469
    invoke-virtual {p3, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 470
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->getTotal_num_()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v3}, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->getAccount_list_()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 471
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->getAccount_list_()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 473
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 475
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->getAccount_list_()Ljava/util/ArrayList;

    move-result-object v7

    .line 477
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;

    .line 479
    new-instance v10, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;

    invoke-direct {v10}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;-><init>()V

    .line 480
    invoke-static {v9, v10}, Lo/awu;->e(Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;)V

    .line 481
    invoke-virtual {v10, p0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setSearchKey(Ljava/lang/String;)V

    .line 482
    const/16 v0, 0x34

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setCardType(I)V

    .line 483
    sget-object v0, Lo/bfp$c;->E:Lo/bfp$c;

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setEventType(Lo/bfp$c;)V

    .line 484
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 485
    goto :goto_0

    .line 487
    :cond_1
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 488
    const-string v0, "keyFindAssistantList"

    invoke-virtual {v8, v0, v6}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 489
    const-string v0, "keyAssistantTotalNum"

    invoke-virtual {v3}, Lcom/huawei/health/sns/server/user/FindAssistantResponse;->getTotal_num_()I

    move-result v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 490
    invoke-virtual {v5, v8}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 492
    :cond_2
    invoke-virtual {p3, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 493
    goto :goto_1

    .line 496
    :cond_3
    const/16 v0, 0x304

    const/4 v1, 0x0

    invoke-static {p3, v0, v1, v4}, Lo/awu;->b(Landroid/os/Handler;III)V

    .line 498
    :goto_1
    goto :goto_2

    .line 502
    :cond_4
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0x303

    const/4 v2, 0x0

    invoke-static {p3, v1, v0, v2}, Lo/awu;->b(Landroid/os/Handler;III)V

    .line 503
    sget-object v0, Lo/awu;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Find User error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    :cond_5
    :goto_2
    return-void
.end method

.method private a(Lo/bio;)V
    .locals 1

    .line 170
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lo/bio;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 173
    invoke-virtual {p1}, Lo/bio;->a()V

    .line 175
    :cond_0
    return-void
.end method

.method private static b(IIILandroid/os/Handler;Ljava/lang/String;)Lo/aud;
    .locals 6

    .line 295
    new-instance v0, Lo/awu$4;

    move v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lo/awu$4;-><init>(IIILandroid/os/Handler;Ljava/lang/String;)V

    return-object v0
.end method

.method private static b(Landroid/app/Activity;Landroid/os/Handler;Ljava/lang/String;I)Lo/aud;
    .locals 1

    .line 210
    new-instance v0, Lo/awu$5;

    invoke-direct {v0, p1, p2, p3}, Lo/awu$5;-><init>(Landroid/os/Handler;Ljava/lang/String;I)V

    return-object v0
.end method

.method private static b(Landroid/os/Handler;III)V
    .locals 2

    .line 532
    invoke-virtual {p0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 533
    iput p1, v1, Landroid/os/Message;->what:I

    .line 534
    iput p2, v1, Landroid/os/Message;->arg1:I

    .line 535
    iput p3, v1, Landroid/os/Message;->arg2:I

    .line 536
    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 537
    return-void
.end method

.method private static b(Lo/bio;)V
    .locals 0

    .line 180
    if-eqz p0, :cond_0

    .line 182
    invoke-virtual {p0}, Lo/bio;->c()V

    .line 184
    :cond_0
    return-void
.end method

.method private static c(Landroid/os/Handler;Ljava/lang/String;I)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;Ljava/lang/String;I)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 237
    new-instance v0, Lo/awu$1;

    invoke-direct {v0, p1, p2, p0}, Lo/awu$1;-><init>(Ljava/lang/String;ILandroid/os/Handler;)V

    return-object v0
.end method

.method private static c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Landroid/os/Handler;)V
    .locals 9

    .line 392
    if-nez p0, :cond_0

    .line 394
    return-void

    .line 397
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_4

    .line 400
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_2

    .line 402
    instance-of v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse;

    if-eqz v0, :cond_5

    .line 404
    move-object v4, p0

    check-cast v4, Lcom/huawei/health/sns/server/user/FindUserResponse;

    .line 405
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/user/FindUserResponse;->getFindUserRsp_()Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;

    move-result-object v5

    .line 407
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;->getFindUserInfo_()Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 408
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;->getFindUserInfo_()Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->getUserID_()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;->getFindUserInfo_()Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->getUserType_()I

    move-result v0

    if-nez v0, :cond_1

    .line 410
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;->getFindUserInfo_()Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->covertToUser()Lcom/huawei/health/sns/model/user/User;

    move-result-object v6

    .line 411
    invoke-virtual {p1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 412
    const/16 v0, 0x301

    iput v0, v7, Landroid/os/Message;->what:I

    .line 413
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 414
    const-string v0, "keyFindUser"

    invoke-virtual {v8, v0, v6}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 415
    invoke-virtual {v7, v8}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 416
    invoke-virtual {p1, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 417
    goto :goto_0

    .line 420
    :cond_1
    const/16 v0, 0x302

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lo/awu;->b(Landroid/os/Handler;III)V

    .line 422
    :goto_0
    goto :goto_2

    .line 427
    :cond_2
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x401

    if-ne v0, v1, :cond_3

    .line 429
    const/16 v0, 0x306

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lo/awu;->b(Landroid/os/Handler;III)V

    goto :goto_1

    .line 433
    :cond_3
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x304

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, Lo/awu;->b(Landroid/os/Handler;III)V

    .line 435
    :goto_1
    sget-object v0, Lo/awu;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Find User error! resultCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 440
    :cond_4
    iget v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0x303

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lo/awu;->b(Landroid/os/Handler;III)V

    .line 441
    sget-object v0, Lo/awu;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Find User error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 443
    :cond_5
    :goto_2
    return-void
.end method

.method static synthetic d(IIILandroid/os/Handler;Ljava/lang/String;)Lo/brd;
    .locals 1

    .line 49
    invoke-static {p0, p1, p2, p3, p4}, Lo/awu;->a(IIILandroid/os/Handler;Ljava/lang/String;)Lo/brd;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/app/Activity;Lo/bio;I)V
    .locals 3

    .line 153
    invoke-static {p1}, Lo/awu;->b(Lo/bio;)V

    .line 154
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x3f8

    if-eq p2, v0, :cond_1

    .line 156
    if-nez p2, :cond_0

    .line 158
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_user_not_exist:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 159
    const/4 v0, 0x0

    invoke-static {p0, v2, v0}, Lo/boj;->e(Landroid/app/Activity;Ljava/lang/String;Lo/boj$d;)Landroid/app/AlertDialog;

    .line 160
    goto :goto_0

    .line 163
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 166
    :cond_1
    :goto_0
    return-void
.end method

.method public static d(Ljava/lang/String;Landroid/os/Handler;)V
    .locals 2

    .line 351
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p0, p1}, Lo/awu;->a(Ljava/lang/String;Landroid/os/Handler;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 352
    return-void
.end method

.method public static e(Landroid/app/Activity;Lo/awu;Lcom/huawei/health/sns/model/user/User;Lo/bio;)V
    .locals 7

    .line 124
    invoke-static {p3}, Lo/awu;->b(Lo/bio;)V

    .line 125
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 126
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 127
    sget-object v5, Lcom/huawei/health/sns/model/user/User$a;->f:Lcom/huawei/health/sns/model/user/User$a;

    .line 128
    if-eqz p1, :cond_0

    .line 130
    invoke-virtual {p1}, Lo/awu;->b()I

    move-result v6

    .line 131
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 133
    sget-object v5, Lcom/huawei/health/sns/model/user/User$a;->b:Lcom/huawei/health/sns/model/user/User$a;

    .line 137
    :cond_0
    const-string v0, "bundleKeyFriendAddType"

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 138
    const-string v0, "bundleKeyUserId"

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 139
    const-string v0, "bundleKeysrcType"

    const/4 v1, 0x4

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 141
    const-string v0, "sns_frd_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 142
    const-string v0, "sns_my_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 144
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 145
    invoke-virtual {p0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 146
    return-void
.end method

.method static synthetic e(Landroid/os/Handler;III)V
    .locals 0

    .line 49
    invoke-static {p0, p1, p2, p3}, Lo/awu;->b(Landroid/os/Handler;III)V

    return-void
.end method

.method private static e(Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;)V
    .locals 2

    .line 516
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->getId_()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setUID(J)V

    .line 517
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->getName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setName(Ljava/lang/String;)V

    .line 518
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->getHead_pic_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setHead_pic(Ljava/lang/String;)V

    .line 519
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->getIntroduction_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setIntroduction(Ljava/lang/String;)V

    .line 520
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->getFollow_()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->setFollow(I)V

    .line 521
    return-void
.end method

.method static synthetic e(Ljava/lang/String;ILcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Landroid/os/Handler;)V
    .locals 0

    .line 49
    invoke-static {p0, p1, p2, p3}, Lo/awu;->a(Ljava/lang/String;ILcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 113
    iget v0, p0, Lo/awu;->e:I

    return v0
.end method

.method public b(IIILandroid/os/Handler;)V
    .locals 1

    .line 278
    iget-object v0, p0, Lo/awu;->a:Ljava/lang/String;

    invoke-static {p1, p2, p3, p4, v0}, Lo/awu;->b(IIILandroid/os/Handler;Ljava/lang/String;)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->e(Lo/aud;)V

    .line 280
    return-void
.end method

.method public e(Landroid/app/Activity;Landroid/os/Handler;Lo/bio;)V
    .locals 2

    .line 195
    invoke-direct {p0, p3}, Lo/awu;->a(Lo/bio;)V

    .line 196
    iget-object v0, p0, Lo/awu;->a:Ljava/lang/String;

    iget v1, p0, Lo/awu;->e:I

    invoke-static {p1, p2, v0, v1}, Lo/awu;->b(Landroid/app/Activity;Landroid/os/Handler;Ljava/lang/String;I)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 197
    return-void
.end method
