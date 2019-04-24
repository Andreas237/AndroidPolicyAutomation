.class public Lcom/huawei/health/sns/model/group/Group;
.super Lo/bfh;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation
.end field

.field public static final DEFAULT_VALUE:I = -0x1

.field public static final STATE_DELETED:I = 0x1

.field public static final STATE_NORMAL:I = 0x0

.field public static final TYPE_ALL:I = 0x3

.field public static final TYPE_CONTACT:I = 0x2

.field public static final TYPE_FAMILY:I = 0x1

.field public static final TYPE_NORMAL:I = 0x0

.field public static final VALUE_OFF:I = 0x0

.field public static final VALUE_ON:I = 0x1


# instance fields
.field private createTime:Ljava/lang/String;

.field private disturbMode:I

.field private groupId:J

.field private groupImageDownloadUrl:Ljava/lang/String;

.field private groupImageUrl:Ljava/lang/String;

.field private groupMemberVersion:Ljava/lang/String;

.field private groupName:Ljava/lang/String;

.field private groupType:I

.field private grpNameFlag:I

.field private healthGroupAddress:Ljava/lang/String;

.field private healthGroupDesc:Ljava/lang/String;

.field private healthGroupType:Ljava/lang/String;

.field private managerId:J

.field private memCount:I

.field private oldGroupImageUrl:Ljava/lang/String;

.field private qrCode:Ljava/lang/String;

.field private qrExpireTime:Ljava/lang/String;

.field private saveToContractMode:I

.field private searchFullPinyin:Ljava/lang/String;

.field private searchPinyinFenci:Ljava/lang/String;

.field private searchShortPinyin:Ljava/lang/String;

.field private showNicknameMode:I

.field private siteID:I

.field private sortPinYin:Ljava/lang/String;

.field private state:I

.field private stickTime:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 253
    new-instance v0, Lcom/huawei/health/sns/model/group/Group$5;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/group/Group$5;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/group/Group;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 202
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 71
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupId:J

    .line 81
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupType:I

    .line 101
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/Group;->managerId:J

    .line 106
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->disturbMode:I

    .line 111
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->saveToContractMode:I

    .line 116
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->showNicknameMode:I

    .line 131
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->siteID:I

    .line 141
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->state:I

    .line 156
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->grpNameFlag:I

    .line 161
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->memCount:I

    .line 203
    const/16 v0, 0x1f

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/group/Group;->setCardType(I)V

    .line 204
    sget-object v0, Lo/bfp$c;->o:Lo/bfp$c;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/group/Group;->setEventType(Lo/bfp$c;)V

    .line 205
    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 209
    invoke-direct {p0}, Lcom/huawei/health/sns/model/group/Group;-><init>()V

    .line 210
    iput-wide p1, p0, Lcom/huawei/health/sns/model/group/Group;->groupId:J

    .line 211
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 270
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 71
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupId:J

    .line 81
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupType:I

    .line 101
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/Group;->managerId:J

    .line 106
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->disturbMode:I

    .line 111
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->saveToContractMode:I

    .line 116
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->showNicknameMode:I

    .line 131
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->siteID:I

    .line 141
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->state:I

    .line 156
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->grpNameFlag:I

    .line 161
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->memCount:I

    .line 271
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupId:J

    .line 272
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupName:Ljava/lang/String;

    .line 273
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupType:I

    .line 274
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupImageUrl:Ljava/lang/String;

    .line 275
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->oldGroupImageUrl:Ljava/lang/String;

    .line 276
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupImageDownloadUrl:Ljava/lang/String;

    .line 277
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/Group;->managerId:J

    .line 278
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->createTime:Ljava/lang/String;

    .line 279
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->siteID:I

    .line 280
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupMemberVersion:Ljava/lang/String;

    .line 281
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->qrCode:Ljava/lang/String;

    .line 282
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->qrExpireTime:Ljava/lang/String;

    .line 283
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->grpNameFlag:I

    .line 284
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/group/Group;->memCount:I

    .line 285
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->sortPinYin:Ljava/lang/String;

    .line 286
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->searchFullPinyin:Ljava/lang/String;

    .line 287
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->searchShortPinyin:Ljava/lang/String;

    .line 288
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->searchPinyinFenci:Ljava/lang/String;

    .line 289
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupDesc:Ljava/lang/String;

    .line 290
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupAddress:Ljava/lang/String;

    .line 291
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupType:Ljava/lang/String;

    .line 292
    return-void
.end method


# virtual methods
.method public buildSearchPinyin()V
    .locals 4

    .line 567
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->groupName:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/bqv;->a([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 568
    const/4 v0, 0x0

    aget-object v0, v3, v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/group/Group;->setSearchFullPinyin(Ljava/lang/String;)V

    .line 569
    const/4 v0, 0x1

    aget-object v0, v3, v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/group/Group;->setSearchShortPinyin(Ljava/lang/String;)V

    .line 570
    const/4 v0, 0x2

    aget-object v0, v3, v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/group/Group;->setSearchPinyinFenci(Ljava/lang/String;)V

    .line 571
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 216
    const/4 v0, 0x0

    return v0
.end method

.method public getCreateTime()Ljava/lang/String;
    .locals 1

    .line 432
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->createTime:Ljava/lang/String;

    .line 433
    return-object v0
.end method

.method public getDisturbMode()I
    .locals 1

    .line 382
    iget v0, p0, Lcom/huawei/health/sns/model/group/Group;->disturbMode:I

    .line 383
    return v0
.end method

.method public getGroupId()J
    .locals 2

    .line 296
    iget-wide v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupId:J

    .line 297
    return-wide v0
.end method

.method public getGroupImageDownloadUrl()Ljava/lang/String;
    .locals 1

    .line 360
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupImageDownloadUrl:Ljava/lang/String;

    .line 361
    return-object v0
.end method

.method public getGroupImageUrl()Ljava/lang/String;
    .locals 1

    .line 338
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupImageUrl:Ljava/lang/String;

    .line 339
    return-object v0
.end method

.method public getGroupMemberVersion()Ljava/lang/String;
    .locals 1

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupMemberVersion:Ljava/lang/String;

    .line 455
    return-object v0
.end method

.method public getGroupName()Ljava/lang/String;
    .locals 1

    .line 307
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupName:Ljava/lang/String;

    .line 308
    return-object v0
.end method

.method public getGroupType()I
    .locals 1

    .line 327
    iget v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupType:I

    .line 328
    return v0
.end method

.method public getGrpNameFlag()I
    .locals 1

    .line 498
    iget v0, p0, Lcom/huawei/health/sns/model/group/Group;->grpNameFlag:I

    .line 499
    return v0
.end method

.method public getHealthGroupAddress()Ljava/lang/String;
    .locals 1

    .line 582
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getHealthGroupDesc()Ljava/lang/String;
    .locals 1

    .line 574
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getHealthGroupType()Ljava/lang/String;
    .locals 1

    .line 590
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupType:Ljava/lang/String;

    return-object v0
.end method

.method public getManagerId()J
    .locals 2

    .line 371
    iget-wide v0, p0, Lcom/huawei/health/sns/model/group/Group;->managerId:J

    .line 372
    return-wide v0
.end method

.method public getMemCount()I
    .locals 1

    .line 509
    iget v0, p0, Lcom/huawei/health/sns/model/group/Group;->memCount:I

    .line 510
    return v0
.end method

.method public getOldGroupImageUrl()Ljava/lang/String;
    .locals 1

    .line 349
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->oldGroupImageUrl:Ljava/lang/String;

    .line 350
    return-object v0
.end method

.method public getQrCode()Ljava/lang/String;
    .locals 1

    .line 476
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->qrCode:Ljava/lang/String;

    .line 477
    return-object v0
.end method

.method public getQrExpireTime()Ljava/lang/String;
    .locals 1

    .line 487
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->qrExpireTime:Ljava/lang/String;

    .line 488
    return-object v0
.end method

.method public getSaveToContractMode()I
    .locals 1

    .line 393
    iget v0, p0, Lcom/huawei/health/sns/model/group/Group;->saveToContractMode:I

    .line 394
    return v0
.end method

.method public getSearchFullPinyin()Ljava/lang/String;
    .locals 1

    .line 531
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->searchFullPinyin:Ljava/lang/String;

    .line 532
    return-object v0
.end method

.method public getSearchPinyinFenci()Ljava/lang/String;
    .locals 1

    .line 553
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->searchPinyinFenci:Ljava/lang/String;

    .line 554
    return-object v0
.end method

.method public getSearchShortPinyin()Ljava/lang/String;
    .locals 1

    .line 542
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->searchShortPinyin:Ljava/lang/String;

    .line 543
    return-object v0
.end method

.method public getShowNicknameMode()I
    .locals 1

    .line 410
    iget v0, p0, Lcom/huawei/health/sns/model/group/Group;->showNicknameMode:I

    .line 411
    return v0
.end method

.method public getSiteID()I
    .locals 1

    .line 443
    iget v0, p0, Lcom/huawei/health/sns/model/group/Group;->siteID:I

    .line 444
    return v0
.end method

.method public getSortPinYin()Ljava/lang/String;
    .locals 1

    .line 520
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->sortPinYin:Ljava/lang/String;

    .line 521
    return-object v0
.end method

.method public getState()I
    .locals 1

    .line 465
    iget v0, p0, Lcom/huawei/health/sns/model/group/Group;->state:I

    .line 466
    return v0
.end method

.method public getStickTime()Ljava/lang/String;
    .locals 1

    .line 421
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->stickTime:Ljava/lang/String;

    .line 422
    return-object v0
.end method

.method public resetSortPinYin()V
    .locals 2

    .line 224
    invoke-static {}, Lo/bpm;->b()Lo/bpp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->groupName:Ljava/lang/String;

    invoke-interface {v0, v1}, Lo/bpp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->sortPinYin:Ljava/lang/String;

    .line 225
    return-void
.end method

.method public setCreateTime(Ljava/lang/String;)V
    .locals 0

    .line 438
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->createTime:Ljava/lang/String;

    .line 439
    return-void
.end method

.method public setDisturbMode(I)V
    .locals 0

    .line 388
    iput p1, p0, Lcom/huawei/health/sns/model/group/Group;->disturbMode:I

    .line 389
    return-void
.end method

.method public setGroupData(IJLjava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 313
    iput p1, p0, Lcom/huawei/health/sns/model/group/Group;->groupType:I

    .line 314
    iput-wide p2, p0, Lcom/huawei/health/sns/model/group/Group;->managerId:J

    .line 315
    iput-object p4, p0, Lcom/huawei/health/sns/model/group/Group;->groupName:Ljava/lang/String;

    .line 316
    iput p5, p0, Lcom/huawei/health/sns/model/group/Group;->grpNameFlag:I

    .line 317
    iput-object p6, p0, Lcom/huawei/health/sns/model/group/Group;->createTime:Ljava/lang/String;

    .line 318
    return-void
.end method

.method public setGroupId(J)V
    .locals 0

    .line 302
    iput-wide p1, p0, Lcom/huawei/health/sns/model/group/Group;->groupId:J

    .line 303
    return-void
.end method

.method public setGroupImageDownloadUrl(Ljava/lang/String;)V
    .locals 0

    .line 366
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->groupImageDownloadUrl:Ljava/lang/String;

    .line 367
    return-void
.end method

.method public setGroupImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 344
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->groupImageUrl:Ljava/lang/String;

    .line 345
    return-void
.end method

.method public setGroupMemberVersion(Ljava/lang/String;)V
    .locals 0

    .line 460
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->groupMemberVersion:Ljava/lang/String;

    .line 461
    return-void
.end method

.method public setGroupName(Ljava/lang/String;)V
    .locals 0

    .line 322
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->groupName:Ljava/lang/String;

    .line 323
    return-void
.end method

.method public setGroupSiteAndMode(II)V
    .locals 0

    .line 399
    iput p1, p0, Lcom/huawei/health/sns/model/group/Group;->siteID:I

    .line 400
    iput p2, p0, Lcom/huawei/health/sns/model/group/Group;->saveToContractMode:I

    .line 401
    return-void
.end method

.method public setGroupType(I)V
    .locals 0

    .line 333
    iput p1, p0, Lcom/huawei/health/sns/model/group/Group;->groupType:I

    .line 334
    return-void
.end method

.method public setGrpNameFlag(I)V
    .locals 0

    .line 504
    iput p1, p0, Lcom/huawei/health/sns/model/group/Group;->grpNameFlag:I

    .line 505
    return-void
.end method

.method public setHealthGroupAddress(Ljava/lang/String;)V
    .locals 0

    .line 586
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupAddress:Ljava/lang/String;

    .line 587
    return-void
.end method

.method public setHealthGroupDesc(Ljava/lang/String;)V
    .locals 0

    .line 578
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupDesc:Ljava/lang/String;

    .line 579
    return-void
.end method

.method public setHealthGroupType(Ljava/lang/String;)V
    .locals 0

    .line 594
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupType:Ljava/lang/String;

    .line 595
    return-void
.end method

.method public setManagerId(J)V
    .locals 0

    .line 377
    iput-wide p1, p0, Lcom/huawei/health/sns/model/group/Group;->managerId:J

    .line 378
    return-void
.end method

.method public setMemCount(I)V
    .locals 0

    .line 515
    iput p1, p0, Lcom/huawei/health/sns/model/group/Group;->memCount:I

    .line 516
    return-void
.end method

.method public setOldGroupImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 355
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->oldGroupImageUrl:Ljava/lang/String;

    .line 356
    return-void
.end method

.method public setQrCode(Ljava/lang/String;)V
    .locals 0

    .line 482
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->qrCode:Ljava/lang/String;

    .line 483
    return-void
.end method

.method public setQrExpireTime(Ljava/lang/String;)V
    .locals 0

    .line 493
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->qrExpireTime:Ljava/lang/String;

    .line 494
    return-void
.end method

.method public setSaveToContractMode(I)V
    .locals 0

    .line 405
    iput p1, p0, Lcom/huawei/health/sns/model/group/Group;->saveToContractMode:I

    .line 406
    return-void
.end method

.method public setSearchFullPinyin(Ljava/lang/String;)V
    .locals 0

    .line 537
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->searchFullPinyin:Ljava/lang/String;

    .line 538
    return-void
.end method

.method public setSearchPinyinFenci(Ljava/lang/String;)V
    .locals 0

    .line 559
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->searchPinyinFenci:Ljava/lang/String;

    .line 560
    return-void
.end method

.method public setSearchShortPinyin(Ljava/lang/String;)V
    .locals 0

    .line 548
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->searchShortPinyin:Ljava/lang/String;

    .line 549
    return-void
.end method

.method public setShowNicknameMode(I)V
    .locals 0

    .line 416
    iput p1, p0, Lcom/huawei/health/sns/model/group/Group;->showNicknameMode:I

    .line 417
    return-void
.end method

.method public setSiteID(I)V
    .locals 0

    .line 449
    iput p1, p0, Lcom/huawei/health/sns/model/group/Group;->siteID:I

    .line 450
    return-void
.end method

.method public setSortPinYin(Ljava/lang/String;)V
    .locals 0

    .line 526
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->sortPinYin:Ljava/lang/String;

    .line 527
    return-void
.end method

.method public setState(I)V
    .locals 0

    .line 471
    iput p1, p0, Lcom/huawei/health/sns/model/group/Group;->state:I

    .line 472
    return-void
.end method

.method public setStickTime(Ljava/lang/String;)V
    .locals 0

    .line 427
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/Group;->stickTime:Ljava/lang/String;

    .line 428
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 599
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Group{groupId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/group/Group;->groupId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->groupName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/group/Group;->groupType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupImageUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->groupImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", oldGroupImageUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->oldGroupImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupImageDownloadUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->groupImageDownloadUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", managerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/group/Group;->managerId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", disturbMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/group/Group;->disturbMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", saveToContractMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/group/Group;->saveToContractMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", showNicknameMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/group/Group;->showNicknameMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stickTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->stickTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", createTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->createTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", siteID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/group/Group;->siteID:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupMemberVersion=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->groupMemberVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/group/Group;->state:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", qrCode=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->qrCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", qrExpireTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->qrExpireTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", grpNameFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/group/Group;->grpNameFlag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", memCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/group/Group;->memCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sortPinYin=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->sortPinYin:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", searchFullPinyin=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->searchFullPinyin:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", searchShortPinyin=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->searchShortPinyin:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", searchPinyinFenci=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->searchPinyinFenci:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", healthGroupDesc=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupDesc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", healthGroupAddress=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupAddress:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", healthGroupType=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 230
    iget-wide v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 231
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 232
    iget v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 233
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->oldGroupImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 235
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupImageDownloadUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 236
    iget-wide v0, p0, Lcom/huawei/health/sns/model/group/Group;->managerId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 237
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->createTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 238
    iget v0, p0, Lcom/huawei/health/sns/model/group/Group;->siteID:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 239
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->groupMemberVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 240
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->qrCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 241
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->qrExpireTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 242
    iget v0, p0, Lcom/huawei/health/sns/model/group/Group;->grpNameFlag:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 243
    iget v0, p0, Lcom/huawei/health/sns/model/group/Group;->memCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 244
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->sortPinYin:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 245
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->searchFullPinyin:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 246
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->searchShortPinyin:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->searchPinyinFenci:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupDesc:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 249
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupAddress:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 250
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/Group;->healthGroupType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 251
    return-void
.end method
