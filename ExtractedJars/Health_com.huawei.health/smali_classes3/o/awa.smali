.class public Lo/awa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/ContentResolver;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Landroid/content/Context;

.field private e:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lo/awa;->b:Ljava/lang/String;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lo/awa;->c:Ljava/lang/String;

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lo/awa;->e:Ljava/lang/String;

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lo/awa;->k:Ljava/lang/String;

    .line 91
    iput-object p1, p0, Lo/awa;->d:Landroid/content/Context;

    .line 92
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/awa;->a:Landroid/content/ContentResolver;

    .line 94
    sget v0, Lcom/huawei/android/sns/R$string;->sns_search_sub_tips_text_contain:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/awa;->b:Ljava/lang/String;

    .line 95
    sget v0, Lcom/huawei/android/sns/R$string;->sns_search_sub_tips_text_user_nickname:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/awa;->e:Ljava/lang/String;

    .line 96
    sget v0, Lcom/huawei/android/sns/R$string;->sns_search_sub_tips_text_contact:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/awa;->k:Ljava/lang/String;

    .line 97
    sget v0, Lcom/huawei/android/sns/R$string;->sns_search_sub_tips_text_group_nickname:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/awa;->c:Ljava/lang/String;

    .line 98
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 1

    .line 530
    const-string v0, "t_group.group_id=?"

    .line 531
    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 445
    invoke-direct {p0, p1}, Lo/awa;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 447
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 448
    const-string v0, " and ("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "t_user.remark_name like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    const-string v0, " or "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "t_user.nick_name like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    const-string v0, " or "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "t_user.display_name like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    const-string v0, " or "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "t_group_member.user_group_nickname like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    const-string v0, " )"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/health/sns/model/search/SNSSearchBean;Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 203
    move-object v0, p1

    move-object v1, p3

    iget-object v2, p0, Lo/awa;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v3

    .line 204
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v5

    .line 203
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setUIData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    move-object v0, p1

    move-object v1, p4

    move v2, p5

    sget-object v5, Lo/bfp$c;->f:Lo/bfp$c;

    const/4 v3, 0x3

    const/16 v4, 0x18

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSearchEvent(Ljava/lang/String;IIILo/bfp$c;)V

    .line 210
    invoke-virtual {p1, p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setGroup(Lcom/huawei/health/sns/model/group/Group;)V

    .line 212
    return-void
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 473
    invoke-direct {p0, p1}, Lo/awa;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 475
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 476
    const-string v0, " and ("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "t_user.search_short_pinyin like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    const-string v0, " or "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "t_group_member.search_short_pinyin like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(I)Ljava/lang/String;
    .locals 5

    .line 334
    const-string v2, "t_group.sort_pinyin asc, t_group.create_time desc, "

    .line 337
    const-string v3, "t_group_member.join_time ASC, t_user.sort_pinyin ASC "

    .line 340
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 341
    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 344
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "t_group.grp_name_flag asc, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 346
    :cond_0
    return-object v4
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 410
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p1}, Lo/awa;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lo/awa;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 411
    return-object v2
.end method

.method private c(Lcom/huawei/health/sns/model/search/SNSSearchBean;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 4

    .line 542
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMatchType()I

    move-result v2

    .line 543
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/GroupMember;->getUIDisplayNameMatchType()I

    move-result v3

    .line 544
    invoke-virtual {p1, v3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setUIDisplayNameMatchType(I)V

    .line 545
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    .line 549
    :sswitch_0
    const/4 v0, 0x2

    if-eq v3, v0, :cond_0

    .line 551
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/awa;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSubTitleTips(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 556
    :sswitch_1
    const/4 v0, 0x3

    if-eq v3, v0, :cond_0

    .line 558
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/awa;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSubTitleTips(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 563
    :sswitch_2
    const/4 v0, 0x4

    if-eq v3, v0, :cond_0

    .line 565
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/GroupMember;->getContactName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/awa;->k:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSubTitleTips(Ljava/lang/String;Ljava/lang/String;)V

    .line 571
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x8 -> :sswitch_0
    .end sparse-switch
.end method

.method private d()Ljava/lang/String;
    .locals 1

    .line 433
    const-string v0, " and alias_match_type=0"

    .line 434
    return-object v0
.end method

.method private d(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 360
    const/4 v1, 0x0

    .line 361
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 364
    :pswitch_0
    invoke-direct {p0, p2}, Lo/awa;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 365
    goto :goto_0

    .line 367
    :pswitch_1
    invoke-direct {p0, p2}, Lo/awa;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 368
    goto :goto_0

    .line 370
    :pswitch_2
    invoke-direct {p0, p2}, Lo/awa;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 371
    .line 375
    :goto_0
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 398
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p1}, Lo/awa;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lo/awa;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 399
    return-object v2
.end method

.method private e()Ljava/lang/String;
    .locals 1

    .line 421
    const-string v0, "t_group.group_type =? and t_group.group_name <> ?"

    .line 423
    return-object v0
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 386
    invoke-direct {p0, p1}, Lo/awa;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 387
    return-object v0
.end method

.method private e(Lcom/huawei/health/sns/model/search/SNSSearchBean;Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/model/search/MemberSearchBean;Ljava/lang/String;I)V
    .locals 6

    .line 305
    move-object v0, p1

    move-object v1, p4

    move v2, p5

    sget-object v5, Lo/bfp$c;->d:Lo/bfp$c;

    const/4 v3, 0x5

    const/16 v4, 0x18

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSearchEvent(Ljava/lang/String;IIILo/bfp$c;)V

    .line 308
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v1

    .line 309
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v2

    .line 308
    invoke-virtual {p1, v0, v1, v2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageUrls(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    const/4 v0, 0x2

    if-ne p5, v0, :cond_0

    .line 313
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getMatchedPinyin()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSearchFullPinyin(Ljava/lang/String;)V

    goto :goto_0

    .line 315
    :cond_0
    const/4 v0, 0x1

    if-ne p5, v0, :cond_1

    .line 317
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getMatchedPinyin()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSearchShortPinyin(Ljava/lang/String;)V

    .line 320
    :cond_1
    :goto_0
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getMatchIndex()I

    move-result v0

    invoke-virtual {p3}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getMatchCount()I

    move-result v1

    .line 321
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getMatchType()I

    move-result v2

    .line 320
    invoke-virtual {p1, v0, v1, v2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMatchData(III)V

    .line 322
    return-void
.end method

.method private h(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 516
    invoke-static {p1}, Lo/bqz;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 517
    return-object v0
.end method

.method private i(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 494
    invoke-direct {p0, p1}, Lo/awa;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 496
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 497
    const-string v0, " and ("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "t_user.search_full_pinyin like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    const-string v0, " or "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "t_group_member.search_full_pinyin like \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "escape \'/\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(ILjava/lang/String;ILandroid/support/v4/util/LongSparseArray;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;ILandroid/support/v4/util/LongSparseArray<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 110
    const/4 v6, 0x0

    .line 111
    new-instance v7, Lo/aua;

    invoke-direct {v7}, Lo/aua;-><init>()V

    .line 115
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct/range {p0 .. p0}, Lo/awa;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct {v1, v2, v3}, Lo/awa;->d(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 116
    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    .line 117
    invoke-static/range {p3 .. p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    const-string v0, "\'\'"

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 118
    invoke-virtual {v7}, Lo/aua;->e()[Ljava/lang/String;

    move-result-object v10

    .line 119
    new-instance v0, Lo/awd;

    invoke-direct {v0}, Lo/awd;-><init>()V

    move/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2, v10}, Lo/awd;->b(ILjava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    .line 121
    move-object/from16 v0, p0

    move/from16 v1, p3

    invoke-direct {v0, v1}, Lo/awa;->c(I)Ljava/lang/String;

    move-result-object v12

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/awa;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$g;->b:Landroid/net/Uri;

    move-object v2, v11

    move-object v3, v8

    move-object v4, v9

    move-object v5, v12

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v6, v0

    .line 126
    const/4 v13, 0x0

    .line 128
    if-eqz v6, :cond_3

    .line 130
    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 132
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 134
    const/4 v14, 0x0

    .line 135
    const/4 v15, 0x0

    .line 137
    const/16 v17, 0x0

    .line 138
    new-instance v18, Lo/awf;

    invoke-direct/range {v18 .. v18}, Lo/awf;-><init>()V

    .line 141
    :cond_0
    invoke-virtual {v7, v6}, Lo/aua;->c(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v15

    .line 143
    new-instance v16, Lcom/huawei/health/sns/model/search/MemberSearchBean;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/health/sns/model/search/MemberSearchBean;-><init>()V

    .line 144
    move-object/from16 v0, v16

    move-object/from16 v1, p2

    move/from16 v2, p1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->setSearchKeyType(Ljava/lang/String;I)V

    .line 146
    move-object/from16 v0, v18

    move/from16 v1, p1

    move-object/from16 v2, v16

    invoke-virtual {v0, v1, v6, v15, v2}, Lo/awf;->d(ILandroid/database/Cursor;Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/model/search/MemberSearchBean;)Z

    move-result v17

    .line 148
    if-nez v17, :cond_1

    .line 150
    goto/16 :goto_0

    .line 153
    :cond_1
    invoke-virtual {v7, v6}, Lo/aua;->a(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v14

    .line 154
    invoke-virtual {v14}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v19

    .line 155
    move-object/from16 v0, p4

    move-wide/from16 v1, v19

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    .line 161
    if-eqz v21, :cond_2

    .line 163
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v23

    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSubTitle(Ljava/lang/String;)V

    .line 165
    move-object/from16 v0, v21

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->addMemberBean(Lcom/huawei/health/sns/model/search/MemberSearchBean;)V

    .line 166
    goto :goto_0

    .line 169
    :cond_2
    new-instance v13, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual {v14}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {v14}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v13, v0, v1, v2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;-><init>(JLjava/lang/String;)V

    .line 170
    move-object/from16 v0, p0

    move-object v1, v13

    move-object v2, v14

    move-object/from16 v3, v22

    move-object/from16 v4, p2

    move/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lo/awa;->a(Lcom/huawei/health/sns/model/search/SNSSearchBean;Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;Ljava/lang/String;I)V

    .line 171
    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->addMemberBean(Lcom/huawei/health/sns/model/search/MemberSearchBean;)V

    .line 172
    move-object/from16 v0, p4

    move-wide/from16 v1, v19

    invoke-virtual {v0, v1, v2, v13}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 175
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 185
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    .line 187
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 179
    :catch_0
    move-exception v8

    .line 181
    const-string v0, ""

    const-string v1, "getGroupList SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 185
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    .line 187
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 185
    :catchall_0
    move-exception v24

    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 187
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 189
    :cond_4
    throw v24

    .line 190
    :cond_5
    :goto_1
    return-void
.end method

.method public e(ILjava/lang/String;J)Ljava/util/ArrayList;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;J)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 224
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 225
    const/4 v7, 0x0

    .line 226
    new-instance v8, Lo/atz;

    invoke-direct {v8}, Lo/atz;-><init>()V

    .line 229
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct/range {p0 .. p0}, Lo/awa;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct {v1, v2, v3}, Lo/awa;->d(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 231
    const/4 v0, 0x1

    new-array v10, v0, [Ljava/lang/String;

    .line 232
    invoke-static/range {p3 .. p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 234
    invoke-virtual {v8}, Lo/atz;->e()[Ljava/lang/String;

    move-result-object v11

    .line 235
    new-instance v0, Lo/awd;

    invoke-direct {v0}, Lo/awd;-><init>()V

    move/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2, v11}, Lo/awd;->b(ILjava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    .line 238
    const-string v13, "t_group_member.join_time ASC, t_user.sort_pinyin ASC"

    .line 241
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/awa;->a:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$g;->b:Landroid/net/Uri;

    move-object v2, v12

    move-object v3, v9

    move-object v4, v10

    move-object v5, v13

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 243
    const/4 v14, 0x0

    .line 244
    const/4 v15, 0x0

    .line 245
    const/16 v16, 0x0

    .line 246
    if-eqz v7, :cond_2

    .line 248
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 250
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 251
    const/16 v17, 0x0

    .line 252
    new-instance v18, Lo/awf;

    invoke-direct/range {v18 .. v18}, Lo/awf;-><init>()V

    .line 255
    :cond_0
    invoke-virtual {v8, v7}, Lo/atz;->e(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v17

    .line 256
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/awa;->d:Landroid/content/Context;

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v19

    .line 258
    new-instance v14, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    move-object/from16 v2, v19

    invoke-direct {v14, v0, v1, v2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;-><init>(JLjava/lang/String;)V

    .line 259
    new-instance v15, Lcom/huawei/health/sns/model/search/MemberSearchBean;

    invoke-direct {v15}, Lcom/huawei/health/sns/model/search/MemberSearchBean;-><init>()V

    .line 260
    move-object/from16 v0, p2

    invoke-virtual {v15, v0}, Lcom/huawei/health/sns/model/search/MemberSearchBean;->setSearchKey(Ljava/lang/String;)V

    .line 261
    move-object/from16 v0, v18

    move/from16 v1, p1

    move-object/from16 v2, v17

    invoke-virtual {v0, v1, v7, v2, v15}, Lo/awf;->d(ILandroid/database/Cursor;Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/model/search/MemberSearchBean;)Z

    move-result v16

    .line 263
    if-nez v16, :cond_1

    .line 265
    goto :goto_0

    .line 269
    :cond_1
    move-object/from16 v0, p0

    move-object v1, v14

    move-object/from16 v2, v17

    move-object v3, v15

    move-object/from16 v4, p2

    move/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lo/awa;->e(Lcom/huawei/health/sns/model/search/SNSSearchBean;Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/model/search/MemberSearchBean;Ljava/lang/String;I)V

    .line 272
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v14, v1}, Lo/awa;->c(Lcom/huawei/health/sns/model/search/SNSSearchBean;Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 274
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    :goto_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 286
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 288
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 280
    :catch_0
    move-exception v9

    .line 282
    const-string v0, ""

    const-string v1, "getGroupList SQLException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 286
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 288
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 286
    :catchall_0
    move-exception v20

    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 288
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 290
    :cond_3
    throw v20

    .line 291
    :cond_4
    :goto_1
    return-object v6
.end method
