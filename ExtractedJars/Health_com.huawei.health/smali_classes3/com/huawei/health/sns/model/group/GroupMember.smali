.class public Lcom/huawei/health/sns/model/group/GroupMember;
.super Lo/bfh;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field public static final DISPLAY_NAME_MATCH_TYPE_CONTACT:I = 0x4

.field public static final DISPLAY_NAME_MATCH_TYPE_GROUP_NICK:I = 0x2

.field public static final DISPLAY_NAME_MATCH_TYPE_NICK:I = 0x3

.field public static final DISPLAY_NAME_MATCH_TYPE_REMARK:I = 0x1

.field public static final DISPLAY_NAME_MATCH_TYPE_UNKNOW:I = 0x0

.field public static final STATE_DELETED:I = 0x1

.field public static final STATE_INVITED:I = 0x2

.field public static final STATE_NORMAL:I = 0x0


# instance fields
.field private aliasName:Ljava/lang/String;

.field private contactName:Ljava/lang/String;

.field private groupId:J

.field private grpNicknameSortPinYin:Ljava/lang/String;

.field private isManager:Z

.field private joinTime:Ljava/lang/String;

.field private oldUserImageUrl:Ljava/lang/String;

.field private searchFullPinyin:Ljava/lang/String;

.field private searchPinyinFenci:Ljava/lang/String;

.field private searchShortPinyin:Ljava/lang/String;

.field private siteId:I

.field private state:I

.field private userGroupNickname:Ljava/lang/String;

.field private userId:J

.field private userImageDownloadUrl:Ljava/lang/String;

.field private userImageUrl:Ljava/lang/String;

.field private userNickname:Ljava/lang/String;

.field private userRemarkName:Ljava/lang/String;

.field private userSearchFullPinyin:Ljava/lang/String;

.field private userSearchPinyinFenci:Ljava/lang/String;

.field private userSearchShortPinyin:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 568
    new-instance v0, Lcom/huawei/health/sns/model/group/GroupMember$2;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/group/GroupMember$2;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/group/GroupMember;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 164
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 58
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->groupId:J

    .line 63
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userId:J

    .line 103
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->state:I

    .line 165
    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setCardType(I)V

    .line 166
    sget-object v0, Lo/bfp$c;->l:Lo/bfp$c;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setEventType(Lo/bfp$c;)V

    .line 167
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 549
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 58
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->groupId:J

    .line 63
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userId:J

    .line 103
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->state:I

    .line 550
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->groupId:J

    .line 551
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userId:J

    .line 552
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userImageUrl:Ljava/lang/String;

    .line 553
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->oldUserImageUrl:Ljava/lang/String;

    .line 554
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userImageDownloadUrl:Ljava/lang/String;

    .line 555
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userNickname:Ljava/lang/String;

    .line 556
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userGroupNickname:Ljava/lang/String;

    .line 557
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userRemarkName:Ljava/lang/String;

    .line 558
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->joinTime:Ljava/lang/String;

    .line 559
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->state:I

    .line 560
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->grpNicknameSortPinYin:Ljava/lang/String;

    .line 561
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->aliasName:Ljava/lang/String;

    .line 562
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->contactName:Ljava/lang/String;

    .line 563
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->searchFullPinyin:Ljava/lang/String;

    .line 564
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->searchShortPinyin:Ljava/lang/String;

    .line 565
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->searchPinyinFenci:Ljava/lang/String;

    .line 566
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/health/sns/model/group/GroupMember$2;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private getDisplayNameImpl(Z)Ljava/lang/String;
    .locals 2

    .line 410
    const-string v1, ""

    .line 411
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userRemarkName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 413
    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userRemarkName:Ljava/lang/String;

    goto :goto_0

    .line 415
    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userGroupNickname:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 417
    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userGroupNickname:Ljava/lang/String;

    goto :goto_0

    .line 419
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userNickname:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 421
    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userNickname:Ljava/lang/String;

    goto :goto_0

    .line 423
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->contactName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 425
    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->contactName:Ljava/lang/String;

    .line 428
    :cond_3
    :goto_0
    return-object v1
.end method


# virtual methods
.method public buildSearchPinyin()V
    .locals 4

    .line 590
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userGroupNickname:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/bqv;->a([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 591
    const/4 v0, 0x0

    aget-object v0, v3, v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSearchFullPinyin(Ljava/lang/String;)V

    .line 592
    const/4 v0, 0x1

    aget-object v0, v3, v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSearchShortPinyin(Ljava/lang/String;)V

    .line 593
    const/4 v0, 0x2

    aget-object v0, v3, v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSearchPinyinFenci(Ljava/lang/String;)V

    .line 594
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 524
    const/4 v0, 0x0

    return v0
.end method

.method public getContactName()Ljava/lang/String;
    .locals 1

    .line 491
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->contactName:Ljava/lang/String;

    return-object v0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 1

    .line 324
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayNameImpl(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getGroupDisplayName(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 513
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayNameImpl(Z)Ljava/lang/String;

    move-result-object v1

    .line 514
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 516
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 518
    :cond_0
    return-object v1
.end method

.method public getGroupId()J
    .locals 2

    .line 171
    iget-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->groupId:J

    .line 172
    return-wide v0
.end method

.method public getGrpNicknameSortPinYin()Ljava/lang/String;
    .locals 1

    .line 303
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->grpNicknameSortPinYin:Ljava/lang/String;

    .line 304
    return-object v0
.end method

.method public getJoinTime()Ljava/lang/String;
    .locals 1

    .line 259
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->joinTime:Ljava/lang/String;

    .line 260
    return-object v0
.end method

.method public getOldUserImageUrl()Ljava/lang/String;
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->oldUserImageUrl:Ljava/lang/String;

    .line 205
    return-object v0
.end method

.method public getSearchFullPinyin()Ljava/lang/String;
    .locals 1

    .line 337
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->searchFullPinyin:Ljava/lang/String;

    .line 338
    return-object v0
.end method

.method public getSearchPinyinFenci()Ljava/lang/String;
    .locals 1

    .line 359
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->searchPinyinFenci:Ljava/lang/String;

    .line 360
    return-object v0
.end method

.method public getSearchShortPinyin()Ljava/lang/String;
    .locals 1

    .line 348
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->searchShortPinyin:Ljava/lang/String;

    .line 349
    return-object v0
.end method

.method public getSiteId()I
    .locals 1

    .line 281
    iget v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->siteId:I

    .line 282
    return v0
.end method

.method public getState()I
    .locals 1

    .line 270
    iget v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->state:I

    .line 271
    return v0
.end method

.method public getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 439
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayNameImpl(Z)Ljava/lang/String;

    move-result-object v3

    .line 440
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    .line 442
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->contactName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 444
    iget-object v3, p0, Lcom/huawei/health/sns/model/group/GroupMember;->contactName:Ljava/lang/String;

    goto :goto_0

    .line 449
    :cond_0
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userId:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    .line 450
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 452
    new-instance v5, Lo/anq;

    invoke-direct {v5}, Lo/anq;-><init>()V

    .line 453
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getAccount()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/anq;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 454
    const-string v0, "GroupMember"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uiDisplayName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 459
    :cond_1
    :goto_0
    return-object v3
.end method

.method public getUIDisplayNameMatchType()I
    .locals 2

    .line 469
    const/4 v1, 0x0

    .line 470
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userRemarkName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 472
    const/4 v1, 0x1

    goto :goto_0

    .line 474
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userGroupNickname:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 476
    const/4 v1, 0x2

    goto :goto_0

    .line 478
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userNickname:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 480
    const/4 v1, 0x3

    goto :goto_0

    .line 482
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->contactName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 484
    const/4 v1, 0x4

    .line 486
    :cond_3
    :goto_0
    return v1
.end method

.method public getUserGroupNickname()Ljava/lang/String;
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userGroupNickname:Ljava/lang/String;

    .line 238
    return-object v0
.end method

.method public getUserId()J
    .locals 2

    .line 182
    iget-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userId:J

    .line 183
    return-wide v0
.end method

.method public getUserImageDownloadUrl()Ljava/lang/String;
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userImageDownloadUrl:Ljava/lang/String;

    .line 216
    return-object v0
.end method

.method public getUserImageUrl()Ljava/lang/String;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userImageUrl:Ljava/lang/String;

    .line 194
    return-object v0
.end method

.method public getUserNickname()Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userNickname:Ljava/lang/String;

    .line 227
    return-object v0
.end method

.method public getUserRemarkName()Ljava/lang/String;
    .locals 1

    .line 248
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userRemarkName:Ljava/lang/String;

    .line 249
    return-object v0
.end method

.method public getUserSearchFullPinyin()Ljava/lang/String;
    .locals 1

    .line 370
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userSearchFullPinyin:Ljava/lang/String;

    .line 371
    return-object v0
.end method

.method public getUserSearchPinyinFenci()Ljava/lang/String;
    .locals 1

    .line 392
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userSearchPinyinFenci:Ljava/lang/String;

    .line 393
    return-object v0
.end method

.method public getUserSearchShortPinyin()Ljava/lang/String;
    .locals 1

    .line 381
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userSearchShortPinyin:Ljava/lang/String;

    .line 382
    return-object v0
.end method

.method public isManager()Z
    .locals 1

    .line 292
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->isManager:Z

    .line 293
    return v0
.end method

.method public resetSortPinYin()V
    .locals 2

    .line 332
    invoke-static {}, Lo/bpm;->b()Lo/bpp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userGroupNickname:Ljava/lang/String;

    invoke-interface {v0, v1}, Lo/bpp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->grpNicknameSortPinYin:Ljava/lang/String;

    .line 333
    return-void
.end method

.method public setAliasName(Ljava/lang/String;)V
    .locals 0

    .line 314
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->aliasName:Ljava/lang/String;

    .line 315
    return-void
.end method

.method public setContactName(Ljava/lang/String;)V
    .locals 0

    .line 496
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->contactName:Ljava/lang/String;

    .line 497
    return-void
.end method

.method public setGroupId(J)V
    .locals 0

    .line 177
    iput-wide p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->groupId:J

    .line 178
    return-void
.end method

.method public setGrpNicknameSortPinYin(Ljava/lang/String;)V
    .locals 0

    .line 309
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->grpNicknameSortPinYin:Ljava/lang/String;

    .line 310
    return-void
.end method

.method public setJoinTime(Ljava/lang/String;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->joinTime:Ljava/lang/String;

    .line 266
    return-void
.end method

.method public setManager(Z)V
    .locals 0

    .line 298
    iput-boolean p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->isManager:Z

    .line 299
    return-void
.end method

.method public setOldUserImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->oldUserImageUrl:Ljava/lang/String;

    .line 211
    return-void
.end method

.method public setSearchFullPinyin(Ljava/lang/String;)V
    .locals 0

    .line 343
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->searchFullPinyin:Ljava/lang/String;

    .line 344
    return-void
.end method

.method public setSearchPinyinFenci(Ljava/lang/String;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->searchPinyinFenci:Ljava/lang/String;

    .line 366
    return-void
.end method

.method public setSearchShortPinyin(Ljava/lang/String;)V
    .locals 0

    .line 354
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->searchShortPinyin:Ljava/lang/String;

    .line 355
    return-void
.end method

.method public setSiteId(I)V
    .locals 0

    .line 287
    iput p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->siteId:I

    .line 288
    return-void
.end method

.method public setState(I)V
    .locals 0

    .line 276
    iput p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->state:I

    .line 277
    return-void
.end method

.method public setUserGroupNickname(Ljava/lang/String;)V
    .locals 0

    .line 243
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userGroupNickname:Ljava/lang/String;

    .line 244
    return-void
.end method

.method public setUserId(J)V
    .locals 0

    .line 188
    iput-wide p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userId:J

    .line 189
    return-void
.end method

.method public setUserImageDownloadUrl(Ljava/lang/String;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userImageDownloadUrl:Ljava/lang/String;

    .line 222
    return-void
.end method

.method public setUserImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userImageUrl:Ljava/lang/String;

    .line 200
    return-void
.end method

.method public setUserNickname(Ljava/lang/String;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userNickname:Ljava/lang/String;

    .line 233
    return-void
.end method

.method public setUserRemarkName(Ljava/lang/String;)V
    .locals 0

    .line 254
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userRemarkName:Ljava/lang/String;

    .line 255
    return-void
.end method

.method public setUserSearchFullPinyin(Ljava/lang/String;)V
    .locals 0

    .line 376
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userSearchFullPinyin:Ljava/lang/String;

    .line 377
    return-void
.end method

.method public setUserSearchPinyinFenci(Ljava/lang/String;)V
    .locals 0

    .line 398
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userSearchPinyinFenci:Ljava/lang/String;

    .line 399
    return-void
.end method

.method public setUserSearchShortPinyin(Ljava/lang/String;)V
    .locals 0

    .line 387
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userSearchShortPinyin:Ljava/lang/String;

    .line 388
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 597
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GroupMember{groupId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->groupId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", joinTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->joinTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->state:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isManager="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->isManager:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public updateToUser(Lcom/huawei/health/sns/model/user/User;)V
    .locals 9

    .line 501
    move-object v0, p1

    iget-wide v1, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userId:J

    iget-object v3, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userNickname:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userImageUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/huawei/health/sns/model/group/GroupMember;->oldUserImageUrl:Ljava/lang/String;

    iget-object v7, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userImageDownloadUrl:Ljava/lang/String;

    iget v8, p0, Lcom/huawei/health/sns/model/group/GroupMember;->siteId:I

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/health/sns/model/user/User;->copyUserFromGroupMember(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 503
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 530
    iget-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->groupId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 531
    iget-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 532
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 533
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->oldUserImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 534
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userImageDownloadUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 535
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userNickname:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 536
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userGroupNickname:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 537
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->userRemarkName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 538
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->joinTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 539
    iget v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->state:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 540
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->grpNicknameSortPinYin:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 541
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->aliasName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 542
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->contactName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 543
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->searchFullPinyin:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 544
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->searchShortPinyin:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 545
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupMember;->searchPinyinFenci:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 546
    return-void
.end method
