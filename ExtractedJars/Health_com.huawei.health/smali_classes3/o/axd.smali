.class public Lo/axd;
.super Lo/awy;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 119
    invoke-direct {p0, p1}, Lo/awy;-><init>(Landroid/os/Handler;)V

    .line 120
    return-void
.end method

.method private a(Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 250
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 252
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    .line 253
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getSender()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 255
    invoke-static {}, Lo/bap;->b()Lo/bap;

    move-result-object v0

    .line 256
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getNote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bap;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 257
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 259
    return-object v4

    .line 250
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 263
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private static a(Ljava/lang/String;JLjava/lang/String;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;JLjava/lang/String;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 350
    new-instance v0, Lo/axd$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/axd$2;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    return-object v0
.end method

.method static synthetic a(Lo/axd;ILcom/huawei/health/sns/server/user/DeleteFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2, p3, p4}, Lo/axd;->d(ILcom/huawei/health/sns/server/user/DeleteFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method private b(ILcom/huawei/health/sns/model/user/User;Ljava/lang/String;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 5

    .line 456
    if-eqz p4, :cond_2

    .line 458
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_1

    .line 461
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    .line 463
    iget-object v0, p0, Lo/axd;->d:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 465
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 466
    const-string v0, "keyBundleUserID"

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 467
    const-string v0, "keyBundleremarkName"

    invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 468
    iget-object v0, p0, Lo/axd;->d:Landroid/os/Handler;

    invoke-virtual {v0, p1, p4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    .line 469
    invoke-virtual {v4, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 470
    iget-object v0, p0, Lo/axd;->d:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 471
    goto :goto_0

    .line 475
    :cond_0
    const-string v0, "UserDetailTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "modifyUserRemarkName exception resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 476
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x23

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Lo/axd;->b(III)V

    goto :goto_0

    .line 481
    :cond_1
    const-string v0, "UserDetailTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "modifyUserRemarkName exception responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    iget v0, p4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0xaaa

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lo/axd;->b(III)V

    .line 485
    :cond_2
    :goto_0
    return-void
.end method

.method private c(Landroid/os/Message;J)Landroid/os/Message;
    .locals 3

    .line 227
    if-nez p1, :cond_0

    .line 229
    new-instance p1, Landroid/os/Message;

    invoke-direct {p1}, Landroid/os/Message;-><init>()V

    .line 231
    :cond_0
    invoke-static {}, Lo/aru;->d()Lo/aru;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/aru;->a(J)Ljava/util/ArrayList;

    move-result-object v1

    .line 232
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 233
    if-nez v2, :cond_1

    .line 235
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 237
    :cond_1
    const-string v0, "userCircleListBundleKey"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 238
    invoke-virtual {p1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 239
    return-object p1
.end method

.method static synthetic c(Lo/axd;Ljava/util/List;)Ljava/lang/String;
    .locals 1

    .line 52
    invoke-direct {p0, p1}, Lo/axd;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;>;"
        }
    .end annotation

    .line 313
    new-instance v0, Lo/axd$5;

    invoke-direct {v0, p0, p1}, Lo/axd$5;-><init>(J)V

    return-object v0
.end method

.method private c(ILcom/huawei/health/sns/server/user/DeleteFriendRequest;Lcom/huawei/health/sns/model/user/User;)V
    .locals 3

    .line 617
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p2, Lcom/huawei/health/sns/server/user/DeleteFriendRequest;->frdUID_:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->d(J)Z

    .line 618
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    iget-wide v1, p2, Lcom/huawei/health/sns/server/user/DeleteFriendRequest;->frdUID_:J

    invoke-virtual {v0, v1, v2}, Lo/ast;->b(J)Z

    .line 619
    invoke-static {}, Lo/aru;->d()Lo/aru;

    move-result-object v0

    iget-wide v1, p2, Lcom/huawei/health/sns/server/user/DeleteFriendRequest;->frdUID_:J

    invoke-virtual {v0, v1, v2}, Lo/aru;->d(J)V

    .line 620
    iget-wide v0, p2, Lcom/huawei/health/sns/server/user/DeleteFriendRequest;->frdUID_:J

    invoke-direct {p0, v0, v1}, Lo/axd;->e(J)V

    .line 622
    if-eqz p3, :cond_0

    .line 624
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 627
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v0

    .line 628
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v1

    .line 627
    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/bbk;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 630
    const-string v0, "UserDetailTask"

    const-string v1, "Delete Friend."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 633
    :cond_0
    iget-object v0, p0, Lo/axd;->d:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 635
    iget-object v0, p0, Lo/axd;->d:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 637
    :cond_1
    return-void
.end method

.method static synthetic c(Lo/axd;ILcom/huawei/health/sns/model/user/User;Ljava/lang/String;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2, p3, p4}, Lo/axd;->b(ILcom/huawei/health/sns/model/user/User;Ljava/lang/String;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method

.method static synthetic d(Lo/axd;Landroid/os/Message;J)Landroid/os/Message;
    .locals 1

    .line 52
    invoke-direct {p0, p1, p2, p3}, Lo/axd;->c(Landroid/os/Message;J)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method private static d(J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 649
    new-instance v0, Lo/axd$9;

    invoke-direct {v0, p0, p1}, Lo/axd$9;-><init>(J)V

    return-object v0
.end method

.method private static d(Lcom/huawei/health/sns/model/user/User;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/user/User;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 372
    new-instance v0, Lo/axd$3;

    invoke-direct {v0, p0}, Lo/axd$3;-><init>(Lcom/huawei/health/sns/model/user/User;)V

    return-object v0
.end method

.method private d(ILcom/huawei/health/sns/server/user/DeleteFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/user/User;)V
    .locals 3

    .line 582
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_2

    .line 585
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_0

    .line 587
    invoke-direct {p0, p1, p2, p4}, Lo/axd;->c(ILcom/huawei/health/sns/server/user/DeleteFriendRequest;Lcom/huawei/health/sns/model/user/User;)V

    goto :goto_0

    .line 591
    :cond_0
    const-string v0, "UserDetailTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteFriend exception resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 592
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x3ef

    if-ne v0, v1, :cond_1

    .line 594
    invoke-direct {p0, p1, p2, p4}, Lo/axd;->c(ILcom/huawei/health/sns/server/user/DeleteFriendRequest;Lcom/huawei/health/sns/model/user/User;)V

    .line 595
    return-void

    .line 597
    :cond_1
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v1, 0x23

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Lo/axd;->b(III)V

    goto :goto_0

    .line 602
    :cond_2
    const-string v0, "UserDetailTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteFriend exception responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 603
    iget v0, p3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/16 v1, 0xaaa

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lo/axd;->b(III)V

    .line 605
    :goto_0
    return-void
.end method

.method private e(J)V
    .locals 2

    .line 644
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2}, Lo/axd;->d(J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 645
    return-void
.end method


# virtual methods
.method public b(ILandroid/app/Activity;Lcom/huawei/health/sns/server/user/DeleteFriendRequest;Lcom/huawei/health/sns/model/user/User;)V
    .locals 6

    .line 535
    new-instance v0, Lo/axd$6;

    move-object v1, p0

    move-object v2, p3

    move v3, p1

    move-object v4, p4

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lo/axd$6;-><init>(Lo/axd;Lcom/huawei/health/sns/server/user/DeleteFriendRequest;ILcom/huawei/health/sns/model/user/User;Landroid/app/Activity;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 569
    return-void
.end method

.method public b(J)V
    .locals 3

    .line 519
    const-string v0, "UserDetailTask"

    const-string v1, "sendUserInfoChangeBroadcast. remark name change."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    new-instance v2, Landroid/content/Intent;

    const-string v0, "user_detail_info_change"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 521
    const-string v0, "bundleKeyUserId"

    invoke-virtual {v2, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 522
    invoke-static {v2}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 523
    return-void
.end method

.method public b(JLjava/lang/String;)V
    .locals 2

    .line 495
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/axd$7;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/axd$7;-><init>(Lo/axd;JLjava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 508
    return-void
.end method

.method public c(ILandroid/app/Activity;Lcom/huawei/health/sns/model/user/User;Ljava/lang/String;)V
    .locals 6

    .line 395
    new-instance v0, Lo/axd$8;

    move-object v1, p0

    move-object v2, p3

    move-object v3, p4

    move v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lo/axd$8;-><init>(Lo/axd;Lcom/huawei/health/sns/model/user/User;Ljava/lang/String;ILandroid/app/Activity;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 443
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/user/User;)V
    .locals 2

    .line 367
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1}, Lo/axd;->d(Lcom/huawei/health/sns/model/user/User;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 368
    return-void
.end method

.method public c(Ljava/lang/String;JLjava/lang/String;)V
    .locals 2

    .line 345
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2, p3, p4}, Lo/axd;->a(Ljava/lang/String;JLjava/lang/String;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 346
    return-void
.end method

.method public d(IJ)V
    .locals 3

    .line 274
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p2, p3}, Lo/axd;->c(J)Lo/brd;

    move-result-object v1

    new-instance v2, Lo/axd$1;

    invoke-direct {v2, p0, p1}, Lo/axd$1;-><init>(Lo/axd;I)V

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 309
    return-void
.end method

.method public d(IJJZ)V
    .locals 9

    .line 132
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/axd$4;

    move-object v2, p0

    move-wide v3, p4

    move-wide v5, p2

    move v7, p1

    move v8, p6

    invoke-direct/range {v1 .. v8}, Lo/axd$4;-><init>(Lo/axd;JJIZ)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 216
    return-void
.end method
