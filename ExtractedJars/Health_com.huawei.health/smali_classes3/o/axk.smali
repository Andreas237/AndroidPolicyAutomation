.class public Lo/axk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/axm;

.field private e:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/axk;->e:Landroid/content/ContentResolver;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/axk;->a:Lo/axm;

    .line 55
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/axk;->e:Landroid/content/ContentResolver;

    .line 56
    new-instance v0, Lo/axm;

    iget-object v1, p0, Lo/axk;->e:Landroid/content/ContentResolver;

    invoke-direct {v0, v1}, Lo/axm;-><init>(Landroid/content/ContentResolver;)V

    iput-object v0, p0, Lo/axk;->a:Lo/axm;

    .line 57
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 718
    move-object v1, p1

    .line 719
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 721
    move-object v1, p2

    .line 724
    :cond_0
    invoke-static {}, Lo/bpm;->b()Lo/bpp;

    move-result-object v0

    invoke-interface {v0, v1}, Lo/bpp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;>;)V"
        }
    .end annotation

    .line 530
    invoke-direct {p0, p1}, Lo/axk;->c(Ljava/util/List;)Landroid/support/v4/util/LongSparseArray;

    move-result-object v2

    .line 532
    const/4 v3, 0x0

    .line 533
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;

    .line 535
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getFrdUID_()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/user/User;

    .line 536
    if-eqz v3, :cond_0

    .line 538
    invoke-interface {p3, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 542
    :cond_0
    new-instance v3, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 543
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getFrdUID_()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 544
    invoke-interface {p2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 546
    :goto_1
    invoke-direct {p0, v3, v5}, Lo/axk;->b(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;)V

    .line 548
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getStickTime_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "0"

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getStickTime_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 550
    :cond_1
    const-string v0, "0"

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->setStickTime_(Ljava/lang/String;)V

    goto :goto_2

    .line 554
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getStickTime_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bog;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->setStickTime_(Ljava/lang/String;)V

    .line 556
    :goto_2
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getStickTime_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/User;->setStickTime(Ljava/lang/String;)V

    .line 557
    goto/16 :goto_0

    .line 558
    :cond_3
    return-void
.end method

.method private b(Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;)Lcom/huawei/health/sns/model/user/User;
    .locals 3

    .line 322
    const/4 v2, 0x0

    .line 323
    if-eqz p1, :cond_1

    .line 325
    new-instance v2, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 326
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getPhoneDigest_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getPhoneDigest_()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 327
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 326
    :goto_0
    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneDigest(Ljava/lang/String;)V

    .line 328
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getUserID_()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 329
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 330
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 331
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 332
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getNeedVerify_()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setNeedVerify(I)V

    .line 333
    sget-object v0, Lcom/huawei/health/sns/model/user/User$a;->e:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setChannel(I)V

    .line 334
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 335
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneNumber(Ljava/lang/String;)V

    .line 336
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getContactSortPinYin()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setContactSortPinYin(Ljava/lang/String;)V

    .line 337
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 338
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setLastUpdateTime(Ljava/lang/String;)V

    .line 339
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getRawContactId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setRawContactId(Ljava/lang/String;)V

    .line 340
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 342
    :cond_1
    return-object v2
.end method

.method private b(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 456
    const/4 v1, 0x0

    .line 458
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 460
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 461
    const/4 v2, 0x0

    .line 462
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 464
    invoke-direct {p0, v4}, Lo/axk;->d(Lcom/huawei/health/sns/model/user/UserNotify;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    .line 465
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 466
    goto :goto_0

    .line 468
    :cond_0
    return-object v1
.end method

.method private b(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;)V
    .locals 3

    .line 568
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getState_()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 570
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 571
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getRelation_()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setRelation(I)V

    .line 572
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getSetFlags_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setSetFlags(Ljava/lang/String;)V

    .line 573
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getState_()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setState(I)V

    .line 574
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getSiteID_()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setSiteId(I)V

    goto/16 :goto_1

    .line 578
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 580
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 583
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getRemarkName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getNickName_()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/axk;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setSortPinYin(Ljava/lang/String;)V

    .line 585
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getRemarkName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setRemarkName(Ljava/lang/String;)V

    .line 586
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getImageURL_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 587
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 589
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 591
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 592
    invoke-static {}, Lo/bpm;->b()Lo/bpp;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bpp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setContactSortPinYin(Ljava/lang/String;)V

    .line 595
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 596
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bqz;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 597
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 598
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bqz;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 600
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneNumber(Ljava/lang/String;)V

    .line 602
    :cond_4
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getPhoneDigest_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, ""

    goto :goto_0

    .line 603
    :cond_5
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getPhoneDigest_()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 602
    :goto_0
    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneDigest(Ljava/lang/String;)V

    .line 605
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getState_()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setState(I)V

    .line 606
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getRelation_()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setRelation(I)V

    .line 607
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getState_()I

    move-result v0

    if-nez v0, :cond_6

    .line 609
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 612
    :cond_6
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getSiteID_()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setSiteId(I)V

    .line 613
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getUserType_()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setUserType(I)V

    .line 614
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setLastUpdateTime(Ljava/lang/String;)V

    .line 615
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getSetFlags_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setSetFlags(Ljava/lang/String;)V

    .line 617
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;->getFrdOrigin_()Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v2

    .line 618
    if-eqz v2, :cond_7

    .line 620
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/user/Origin;->getType_()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setOriginType(I)V

    .line 621
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/user/Origin;->getDesc_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->setOriginDesc(Ljava/lang/String;)V

    .line 626
    :cond_7
    :goto_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 627
    return-void
.end method

.method private b(Ljava/util/List;Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;)Z"
        }
    .end annotation

    .line 667
    const/4 v3, 0x0

    .line 669
    invoke-direct {p0, p1, p2}, Lo/axk;->d(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 671
    const/4 v3, 0x1

    .line 672
    const-string v0, "UserBatchDBHelper"

    const-string v1, "batchInsertOrUpdateUser size =0, batchInsertOrUpdateUser is fail."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 677
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 679
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 681
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/user/User;

    .line 683
    iget-object v0, p0, Lo/axk;->a:Lo/axm;

    invoke-virtual {v0, v6}, Lo/axm;->d(Lcom/huawei/health/sns/model/user/User;)Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 684
    goto :goto_0

    .line 686
    :cond_1
    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 688
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/user/User;

    .line 690
    iget-object v0, p0, Lo/axk;->a:Lo/axm;

    invoke-virtual {v0, v6}, Lo/axm;->b(Lcom/huawei/health/sns/model/user/User;)Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 691
    goto :goto_1

    .line 693
    :cond_2
    iget-object v0, p0, Lo/axk;->a:Lo/axm;

    invoke-virtual {v0, v4}, Lo/axm;->e(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    move-result-object v5

    .line 694
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    array-length v0, v5

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 696
    const-string v0, "UserBatchDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "batchInsertOrUpdateUser success. result length is"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, v5

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 697
    const/4 v3, 0x1

    goto :goto_2

    .line 701
    :cond_3
    const-string v0, "UserBatchDBHelper"

    const-string v1, "batchInsertOrUpdateUser is null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 705
    :goto_2
    return v3
.end method

.method private c(Ljava/util/List;)Landroid/support/v4/util/LongSparseArray;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;)Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 508
    new-instance v2, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v2}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    .line 509
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 511
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/user/User;

    .line 513
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1, v4}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 514
    goto :goto_0

    .line 516
    :cond_0
    return-object v2
.end method

.method private c(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 419
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0}, Lo/axa;->c()Landroid/support/v4/util/LongSparseArray;

    move-result-object v2

    .line 420
    if-eqz p3, :cond_2

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 422
    invoke-virtual {v2}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 424
    invoke-direct {p0, p3}, Lo/axk;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    .line 428
    :cond_0
    const/4 v3, 0x0

    .line 429
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 431
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/user/User;

    .line 432
    if-eqz v3, :cond_1

    .line 435
    iget-object v0, p0, Lo/axk;->a:Lo/axm;

    invoke-virtual {v0, v3, v5}, Lo/axm;->c(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/user/UserNotify;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 436
    invoke-interface {p2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 440
    :cond_1
    invoke-direct {p0, v5}, Lo/axk;->d(Lcom/huawei/health/sns/model/user/UserNotify;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 441
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 443
    :goto_1
    goto :goto_0

    .line 446
    :cond_2
    :goto_2
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;)Lcom/huawei/health/sns/model/user/User;
    .locals 2

    .line 272
    const/4 v1, 0x0

    .line 273
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 275
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->cloneUser()Lcom/huawei/health/sns/model/user/User;

    move-result-object v1

    .line 276
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 278
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getNickName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 280
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getNeedVerify_()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setNeedVerify(I)V

    .line 281
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getPhoneDigest_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneDigest(Ljava/lang/String;)V

    .line 282
    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 285
    :cond_1
    return-object v1
.end method

.method private d(Lcom/huawei/health/sns/model/user/UserNotify;)Lcom/huawei/health/sns/model/user/User;
    .locals 3

    .line 242
    new-instance v2, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 243
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 244
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 245
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUrlDownload()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 246
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 248
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 250
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 251
    invoke-static {}, Lo/bpm;->b()Lo/bpp;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bpp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setContactSortPinYin(Ljava/lang/String;)V

    .line 254
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneNumber(Ljava/lang/String;)V

    .line 255
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneDigest(Ljava/lang/String;)V

    .line 256
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_2

    .line 258
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 260
    :cond_2
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 261
    return-object v2
.end method

.method private d(Ljava/util/List;Landroid/support/v4/util/LongSparseArray;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/User;>;)Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 152
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 153
    invoke-virtual {p2}, Landroid/support/v4/util/LongSparseArray;->clone()Landroid/support/v4/util/LongSparseArray;

    move-result-object v3

    .line 154
    new-instance v4, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v4}, Landroid/support/v4/util/LongSparseArray;-><init>()V

    .line 155
    const/4 v5, 0x0

    .line 156
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/user/User;

    .line 158
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/User;

    .line 159
    if-nez v5, :cond_0

    .line 161
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1, v7}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 162
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1, v7}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    goto :goto_1

    .line 167
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bqz;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 170
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bqz;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 172
    goto :goto_0

    .line 177
    :cond_1
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1, v7}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 178
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1, v7}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    goto :goto_1

    .line 184
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1, v7}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 185
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1, v7}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 188
    :goto_1
    goto/16 :goto_0

    .line 189
    :cond_3
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {v4}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 191
    invoke-virtual {v4, v6}, Landroid/support/v4/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 189
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 193
    :cond_4
    return-object v2
.end method

.method private d(Ljava/util/List;Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;)Z"
        }
    .end annotation

    .line 647
    const/4 v2, 0x1

    .line 648
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 650
    :cond_1
    const/4 v2, 0x0

    .line 651
    const-string v0, "UserBatchDBHelper"

    const-string v1, "isValidate size =0, batchInsertOrUpdateUser is fail."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 654
    :cond_2
    return v2
.end method

.method private e(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;>;)Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 296
    const/4 v1, 0x0

    .line 298
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 300
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 301
    const/4 v2, 0x0

    .line 302
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;

    .line 304
    invoke-direct {p0, v4}, Lo/axk;->b(Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    .line 305
    if-eqz v2, :cond_0

    .line 307
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    :cond_0
    goto :goto_0

    .line 311
    :cond_1
    return-object v1
.end method

.method private e(Ljava/util/List;Ljava/util/HashMap;Ljava/util/HashMap;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 205
    const/4 v3, 0x0

    .line 206
    const/4 v4, 0x0

    .line 207
    const/4 v5, 0x0

    .line 209
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/user/User;

    .line 211
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 213
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    .line 214
    invoke-virtual {p2, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    invoke-virtual {p2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 217
    invoke-virtual {p3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 218
    invoke-virtual {v7, v4}, Lcom/huawei/health/sns/model/user/User;->setRawContactId(Ljava/lang/String;)V

    .line 219
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 222
    invoke-static {v3}, Lo/bqz;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 224
    const-string v0, " "

    const-string v1, ""

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "-"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 226
    :cond_0
    invoke-virtual {v7, v3}, Lcom/huawei/health/sns/model/user/User;->setPhoneNumber(Ljava/lang/String;)V

    .line 230
    :cond_1
    goto :goto_0

    .line 231
    :cond_2
    return-object p1
.end method

.method private e(Landroid/support/v4/util/LongSparseArray;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;)V"
        }
    .end annotation

    .line 356
    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 358
    const-string v0, "UserBatchDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "splitContactInfoList contactInfoList.size() is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    invoke-virtual {p1}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 361
    invoke-direct {p0, p2}, Lo/axk;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    .line 365
    :cond_0
    const/4 v3, 0x0

    .line 366
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;

    .line 369
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getPhoneDigest_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 371
    const-string v0, "UserBatchDBHelper"

    const-string v1, "splitContactInfoList, phoneDigest null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    goto :goto_0

    .line 374
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;->getUserID_()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/user/User;

    .line 375
    if-eqz v3, :cond_2

    .line 378
    invoke-direct {p0, v3, v5}, Lo/axk;->d(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 379
    invoke-interface {p4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 383
    :cond_2
    invoke-direct {p0, v5}, Lo/axk;->b(Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 384
    if-eqz v3, :cond_3

    .line 386
    invoke-interface {p3, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 389
    :cond_3
    :goto_1
    goto :goto_0

    .line 392
    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)Z"
        }
    .end annotation

    .line 403
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 405
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 406
    invoke-direct {p0, v1, v2, p1}, Lo/axk;->c(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 407
    invoke-direct {p0, v1, v2}, Lo/axk;->b(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public b(Landroid/support/v4/util/LongSparseArray;Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;)Z"
        }
    .end annotation

    .line 68
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 69
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/user/User;

    .line 73
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/user/User;

    .line 74
    if-eqz v4, :cond_0

    .line 77
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    if-nez v0, :cond_1

    .line 80
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 82
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/axk;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/User;->setSortPinYin(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 84
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 85
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getState()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/User;->setState(I)V

    .line 86
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 91
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/axk;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/user/User;->setSortPinYin(Ljava/lang/String;)V

    .line 92
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    :cond_1
    :goto_1
    goto/16 :goto_0

    .line 95
    :cond_2
    invoke-direct {p0, v2, v3}, Lo/axk;->b(Ljava/util/List;Ljava/util/List;)Z

    move-result v5

    .line 96
    return v5
.end method

.method public b(Ljava/util/List;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;>;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/HashMap<Ljava/lang/String;Lo/asd;>;)Z"
        }
    .end annotation

    .line 114
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 116
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 118
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0}, Lo/axa;->c()Landroid/support/v4/util/LongSparseArray;

    move-result-object v3

    .line 121
    invoke-direct {p0, v3, p1, v1, v2}, Lo/axk;->e(Landroid/support/v4/util/LongSparseArray;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 123
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 126
    invoke-direct {p0, v1, p2, p3}, Lo/axk;->e(Ljava/util/List;Ljava/util/HashMap;Ljava/util/HashMap;)Ljava/util/List;

    move-result-object v1

    .line 127
    invoke-direct {p0, v1, v3}, Lo/axk;->d(Ljava/util/List;Landroid/support/v4/util/LongSparseArray;)Ljava/util/List;

    move-result-object v1

    .line 130
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 133
    invoke-direct {p0, v2, p2, p3}, Lo/axk;->e(Ljava/util/List;Ljava/util/HashMap;Ljava/util/HashMap;)Ljava/util/List;

    move-result-object v2

    .line 134
    invoke-direct {p0, v2, v3}, Lo/axk;->d(Ljava/util/List;Landroid/support/v4/util/LongSparseArray;)Ljava/util/List;

    move-result-object v2

    .line 138
    :cond_1
    new-instance v0, Lo/axh;

    invoke-direct {v0}, Lo/axh;-><init>()V

    invoke-virtual {v0, v1, v2, p4}, Lo/axh;->a(Ljava/util/List;Ljava/util/List;Ljava/util/HashMap;)V

    .line 140
    invoke-direct {p0, v1, v2}, Lo/axk;->b(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public c(Ljava/util/List;Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/util/List<Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;>;)Z"
        }
    .end annotation

    .line 479
    const/4 v2, 0x0

    .line 480
    const/4 v3, 0x0

    .line 481
    if-eqz p2, :cond_0

    .line 483
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 484
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 486
    invoke-direct {p0, p1, v4, v5, p2}, Lo/axk;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 488
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    add-int v3, v0, v1

    .line 489
    invoke-direct {p0, v4, v5}, Lo/axk;->b(Ljava/util/List;Ljava/util/List;)Z

    move-result v2

    .line 492
    :cond_0
    if-eqz v2, :cond_1

    .line 497
    :cond_1
    return v2
.end method

.method public d(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;)Z"
        }
    .end annotation

    .line 637
    const/4 v1, 0x0

    .line 638
    if-eqz p1, :cond_0

    .line 640
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lo/axk;->b(Ljava/util/List;Ljava/util/List;)Z

    move-result v1

    .line 642
    :cond_0
    return v1
.end method
