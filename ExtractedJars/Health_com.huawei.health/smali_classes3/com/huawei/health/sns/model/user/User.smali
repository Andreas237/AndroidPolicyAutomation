.class public Lcom/huawei/health/sns/model/user/User;
.super Lo/bfh;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/model/user/User$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation
.end field

.field public static final DISPLAY_NAME_MATCH_TYPE_CONTACT:I = 0x3

.field public static final DISPLAY_NAME_MATCH_TYPE_NICK:I = 0x2

.field public static final DISPLAY_NAME_MATCH_TYPE_REMARK:I = 0x1

.field public static final DISPLAY_NAME_MATCH_TYPE_UNKNOW:I = 0x0

.field public static final FRIEND:I = 0x1

.field public static final NOT_FRIEND:I = 0x0

.field public static final NOT_NEED_VERIFY:I = 0x0

.field public static final RECEIVE_ARTICLE_PUSH_SWITCH_OFF:I = 0x1

.field public static final RECEIVE_ARTICLE_PUSH_SWITCH_ON:I = 0x0

.field public static final RELATION_NO:I = -0x1

.field public static final RELATION_SINGLE_WAY:I = 0x1

.field public static final RELATION_TWO_WAY:I = 0x0

.field public static final SWITCH_MODE_OFF:I = 0x0

.field public static final SWITCH_MODE_ON:I = 0x1

.field public static final TYPE_ALL:I = 0x3

.field public static final TYPE_ASSISTANT:I = 0x1

.field public static final TYPE_GENDER_CLASSIFIED:I = 0x2

.field public static final TYPE_GENDER_FEMALE:I = 0x1

.field public static final TYPE_GENDER_MALE:I = 0x0

.field public static final TYPE_GENDER_UNKNOW:I = -0x1

.field public static final TYPE_USER:I = 0x0

.field public static final USER_STATE_DELETE:I = 0x1

.field public static final USER_STATE_NORMAL:I = 0x0

.field public static final USER_TYPE_IN_BLACK_LIST:I = 0x3


# instance fields
.field private account:Ljava/lang/String;

.field private channel:I

.field private city:Ljava/lang/String;

.field private contactName:Ljava/lang/String;

.field private contactSortPinYin:Ljava/lang/String;

.field private gender:I

.field private imageURLDownload:Ljava/lang/String;

.field private imageUrl:Ljava/lang/String;

.field private isFriend:I

.field private lastUpdateTime:Ljava/lang/String;

.field private nationalCode:Ljava/lang/String;

.field private needVerify:I

.field private nickName:Ljava/lang/String;

.field private oldImageUrl:Ljava/lang/String;

.field private originDesc:Ljava/lang/String;

.field private originType:I

.field private phoneDigest:Ljava/lang/String;

.field private phoneNumber:Ljava/lang/String;

.field private province:Ljava/lang/String;

.field private rawContactId:Ljava/lang/String;

.field private registeredUser:I

.field private relation:I

.field private remarkName:Ljava/lang/String;

.field private searchFullPinyin:Ljava/lang/String;

.field private searchPinyinFenci:Ljava/lang/String;

.field private searchShortPinyin:Ljava/lang/String;

.field private setFlags:Ljava/lang/String;

.field private signature:Ljava/lang/String;

.field private siteId:I

.field private sortPinYin:Ljava/lang/String;

.field private state:I

.field private stickTime:Ljava/lang/String;

.field private userId:J

.field private userType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 517
    new-instance v0, Lcom/huawei/health/sns/model/user/User$5;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/user/User$5;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/user/User;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 141
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 181
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/user/User;->userId:J

    .line 231
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->needVerify:I

    .line 236
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->gender:I

    .line 271
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->state:I

    .line 276
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->isFriend:I

    .line 281
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->relation:I

    .line 286
    sget-object v0, Lcom/huawei/health/sns/model/user/User$a;->d:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->channel:I

    .line 291
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->registeredUser:I

    .line 315
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    .line 335
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->originType:I

    .line 143
    return-void
.end method

.method public constructor <init>(J)V
    .locals 2

    .line 149
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 181
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/user/User;->userId:J

    .line 231
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->needVerify:I

    .line 236
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->gender:I

    .line 271
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->state:I

    .line 276
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->isFriend:I

    .line 281
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->relation:I

    .line 286
    sget-object v0, Lcom/huawei/health/sns/model/user/User$a;->d:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->channel:I

    .line 291
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->registeredUser:I

    .line 315
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    .line 335
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->originType:I

    .line 150
    iput-wide p1, p0, Lcom/huawei/health/sns/model/user/User;->userId:J

    .line 151
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 534
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 181
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/user/User;->userId:J

    .line 231
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->needVerify:I

    .line 236
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->gender:I

    .line 271
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->state:I

    .line 276
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->isFriend:I

    .line 281
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->relation:I

    .line 286
    sget-object v0, Lcom/huawei/health/sns/model/user/User$a;->d:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->channel:I

    .line 291
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->registeredUser:I

    .line 315
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    .line 335
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->originType:I

    .line 535
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/user/User;->userId:J

    .line 536
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->imageUrl:Ljava/lang/String;

    .line 537
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->oldImageUrl:Ljava/lang/String;

    .line 538
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->imageURLDownload:Ljava/lang/String;

    .line 539
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->contactName:Ljava/lang/String;

    .line 540
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->phoneNumber:Ljava/lang/String;

    .line 541
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->phoneDigest:Ljava/lang/String;

    .line 542
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    .line 543
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->remarkName:Ljava/lang/String;

    .line 544
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->account:Ljava/lang/String;

    .line 545
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->needVerify:I

    .line 546
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->gender:I

    .line 547
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->nationalCode:Ljava/lang/String;

    .line 548
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->province:Ljava/lang/String;

    .line 549
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->city:Ljava/lang/String;

    .line 550
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->signature:Ljava/lang/String;

    .line 551
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->sortPinYin:Ljava/lang/String;

    .line 552
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->contactSortPinYin:Ljava/lang/String;

    .line 553
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->state:I

    .line 554
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->isFriend:I

    .line 555
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->relation:I

    .line 556
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->channel:I

    .line 557
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->registeredUser:I

    .line 558
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->lastUpdateTime:Ljava/lang/String;

    .line 559
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->siteId:I

    .line 560
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    .line 561
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    .line 562
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchFullPinyin:Ljava/lang/String;

    .line 563
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchShortPinyin:Ljava/lang/String;

    .line 564
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchPinyinFenci:Ljava/lang/String;

    .line 565
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->originType:I

    .line 566
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->originDesc:Ljava/lang/String;

    .line 567
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->stickTime:Ljava/lang/String;

    .line 568
    return-void
.end method

.method public static isRelationOK(I)Z
    .locals 1

    .line 1033
    if-eqz p0, :cond_0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public buildSearchPinyin()V
    .locals 4

    .line 1048
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->remarkName:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->contactName:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/bqv;->a([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 1049
    const/4 v0, 0x0

    aget-object v0, v3, v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/user/User;->setSearchFullPinyin(Ljava/lang/String;)V

    .line 1050
    const/4 v0, 0x1

    aget-object v0, v3, v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/user/User;->setSearchShortPinyin(Ljava/lang/String;)V

    .line 1051
    const/4 v0, 0x2

    aget-object v0, v3, v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/user/User;->setSearchPinyinFenci(Ljava/lang/String;)V

    .line 1052
    return-void
.end method

.method public buildSortPinYin()V
    .locals 3

    .line 781
    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->remarkName:Ljava/lang/String;

    .line 782
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 784
    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    .line 786
    :cond_0
    invoke-static {}, Lo/bpm;->b()Lo/bpp;

    move-result-object v0

    invoke-interface {v0, v1}, Lo/bpp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 787
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/model/user/User;->setSortPinYin(Ljava/lang/String;)V

    .line 788
    return-void
.end method

.method public cloneUser()Lcom/huawei/health/sns/model/user/User;
    .locals 3

    .line 1056
    new-instance v2, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 1057
    iget-wide v0, p0, Lcom/huawei/health/sns/model/user/User;->userId:J

    iput-wide v0, v2, Lcom/huawei/health/sns/model/user/User;->userId:J

    .line 1058
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->imageUrl:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->imageUrl:Ljava/lang/String;

    .line 1059
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->oldImageUrl:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->oldImageUrl:Ljava/lang/String;

    .line 1060
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->imageURLDownload:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->imageURLDownload:Ljava/lang/String;

    .line 1061
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->contactName:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->contactName:Ljava/lang/String;

    .line 1062
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->phoneNumber:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->phoneNumber:Ljava/lang/String;

    .line 1063
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->phoneDigest:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->phoneDigest:Ljava/lang/String;

    .line 1064
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    .line 1065
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->remarkName:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->remarkName:Ljava/lang/String;

    .line 1066
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->account:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->account:Ljava/lang/String;

    .line 1067
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->needVerify:I

    iput v0, v2, Lcom/huawei/health/sns/model/user/User;->needVerify:I

    .line 1068
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->gender:I

    iput v0, v2, Lcom/huawei/health/sns/model/user/User;->gender:I

    .line 1069
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->nationalCode:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->nationalCode:Ljava/lang/String;

    .line 1070
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->province:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->province:Ljava/lang/String;

    .line 1071
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->city:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->city:Ljava/lang/String;

    .line 1072
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->signature:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->signature:Ljava/lang/String;

    .line 1073
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->sortPinYin:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->sortPinYin:Ljava/lang/String;

    .line 1074
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->contactSortPinYin:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->contactSortPinYin:Ljava/lang/String;

    .line 1075
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->state:I

    iput v0, v2, Lcom/huawei/health/sns/model/user/User;->state:I

    .line 1076
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->isFriend:I

    iput v0, v2, Lcom/huawei/health/sns/model/user/User;->isFriend:I

    .line 1077
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->relation:I

    iput v0, v2, Lcom/huawei/health/sns/model/user/User;->relation:I

    .line 1078
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->channel:I

    iput v0, v2, Lcom/huawei/health/sns/model/user/User;->channel:I

    .line 1079
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->registeredUser:I

    iput v0, v2, Lcom/huawei/health/sns/model/user/User;->registeredUser:I

    .line 1080
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->lastUpdateTime:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->lastUpdateTime:Ljava/lang/String;

    .line 1081
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->siteId:I

    iput v0, v2, Lcom/huawei/health/sns/model/user/User;->siteId:I

    .line 1082
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    iput v0, v2, Lcom/huawei/health/sns/model/user/User;->userType:I

    .line 1083
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    .line 1084
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchFullPinyin:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->searchFullPinyin:Ljava/lang/String;

    .line 1085
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchShortPinyin:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->searchShortPinyin:Ljava/lang/String;

    .line 1086
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchPinyinFenci:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->searchPinyinFenci:Ljava/lang/String;

    .line 1087
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->originType:I

    iput v0, v2, Lcom/huawei/health/sns/model/user/User;->originType:I

    .line 1088
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->originDesc:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/health/sns/model/user/User;->originDesc:Ljava/lang/String;

    .line 1089
    return-object v2
.end method

.method public copyUserData(Lcom/huawei/health/sns/model/user/User;)V
    .locals 1

    .line 972
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getAccount()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->account:Ljava/lang/String;

    .line 973
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->imageUrl:Ljava/lang/String;

    .line 974
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->imageURLDownload:Ljava/lang/String;

    .line 975
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    .line 976
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getGender()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->gender:I

    .line 977
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSignature()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->signature:Ljava/lang/String;

    .line 978
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getProvince()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->province:Ljava/lang/String;

    .line 979
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNeedVerify()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->needVerify:I

    .line 980
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->phoneDigest:Ljava/lang/String;

    .line 981
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getCity()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->city:Ljava/lang/String;

    .line 982
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->phoneDigest:Ljava/lang/String;

    .line 983
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSearchFullPinyin()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchFullPinyin:Ljava/lang/String;

    .line 984
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSearchShortPinyin()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchShortPinyin:Ljava/lang/String;

    .line 985
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSearchPinyinFenci()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchPinyinFenci:Ljava/lang/String;

    .line 986
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOriginType()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->originType:I

    .line 987
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOriginDesc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/User;->originDesc:Ljava/lang/String;

    .line 988
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserType()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    .line 989
    return-void
.end method

.method public copyUserFromGroupMember(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 994
    iput-wide p1, p0, Lcom/huawei/health/sns/model/user/User;->userId:J

    .line 995
    iput-object p3, p0, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    .line 996
    iput-object p4, p0, Lcom/huawei/health/sns/model/user/User;->remarkName:Ljava/lang/String;

    .line 997
    iput-object p5, p0, Lcom/huawei/health/sns/model/user/User;->imageUrl:Ljava/lang/String;

    .line 998
    iput-object p6, p0, Lcom/huawei/health/sns/model/user/User;->oldImageUrl:Ljava/lang/String;

    .line 999
    iput-object p7, p0, Lcom/huawei/health/sns/model/user/User;->imageURLDownload:Ljava/lang/String;

    .line 1000
    iput p8, p0, Lcom/huawei/health/sns/model/user/User;->siteId:I

    .line 1001
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 476
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1012
    if-nez p1, :cond_0

    .line 1014
    const/4 v0, 0x0

    return v0

    .line 1017
    :cond_0
    if-ne p0, p1, :cond_1

    .line 1019
    const/4 v0, 0x1

    return v0

    .line 1022
    :cond_1
    instance-of v0, p1, Lcom/huawei/health/sns/model/user/User;

    if-nez v0, :cond_2

    .line 1024
    const/4 v0, 0x0

    return v0

    .line 1027
    :cond_2
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/model/user/User;

    .line 1028
    iget-wide v0, v4, Lcom/huawei/health/sns/model/user/User;->userId:J

    iget-wide v2, p0, Lcom/huawei/health/sns/model/user/User;->userId:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getAccount()Ljava/lang/String;
    .locals 1

    .line 693
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->account:Ljava/lang/String;

    .line 694
    return-object v0
.end method

.method public getChannel()I
    .locals 1

    .line 851
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->channel:I

    .line 852
    return v0
.end method

.method public getCity()Ljava/lang/String;
    .locals 1

    .line 748
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->city:Ljava/lang/String;

    .line 749
    return-object v0
.end method

.method public getContactName()Ljava/lang/String;
    .locals 1

    .line 649
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->contactName:Ljava/lang/String;

    .line 650
    return-object v0
.end method

.method public getContactSortPinYin()Ljava/lang/String;
    .locals 1

    .line 797
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->contactSortPinYin:Ljava/lang/String;

    .line 798
    return-object v0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 2

    .line 410
    const-string v1, ""

    .line 411
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->remarkName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 413
    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->remarkName:Ljava/lang/String;

    goto :goto_0

    .line 415
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 417
    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    .line 419
    :cond_1
    :goto_0
    return-object v1
.end method

.method public getGender()I
    .locals 1

    .line 715
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->gender:I

    .line 716
    return v0
.end method

.method public getImageURLDownload()Ljava/lang/String;
    .locals 1

    .line 638
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->imageURLDownload:Ljava/lang/String;

    .line 639
    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 616
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->imageUrl:Ljava/lang/String;

    .line 617
    return-object v0
.end method

.method public getIsFriend()I
    .locals 1

    .line 819
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->isFriend:I

    .line 820
    return v0
.end method

.method public getLastUpdateTime()Ljava/lang/String;
    .locals 1

    .line 873
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->lastUpdateTime:Ljava/lang/String;

    .line 874
    return-object v0
.end method

.method public getNationalCode()Ljava/lang/String;
    .locals 1

    .line 726
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->nationalCode:Ljava/lang/String;

    .line 727
    return-object v0
.end method

.method public getNeedVerify()I
    .locals 1

    .line 704
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->needVerify:I

    .line 705
    return v0
.end method

.method public getNickName()Ljava/lang/String;
    .locals 1

    .line 583
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    .line 584
    return-object v0
.end method

.method public getOldImageUrl()Ljava/lang/String;
    .locals 1

    .line 605
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->oldImageUrl:Ljava/lang/String;

    .line 606
    return-object v0
.end method

.method public getOldReceiveMsgStatus()I
    .locals 2

    .line 376
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 378
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 380
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lo/bqz;->d(C)I

    move-result v0

    return v0

    .line 383
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getOriginDesc()Ljava/lang/String;
    .locals 1

    .line 961
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->originDesc:Ljava/lang/String;

    .line 962
    return-object v0
.end method

.method public getOriginType()I
    .locals 1

    .line 950
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->originType:I

    .line 951
    return v0
.end method

.method public getPhoneDigest()Ljava/lang/String;
    .locals 1

    .line 671
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->phoneDigest:Ljava/lang/String;

    .line 672
    return-object v0
.end method

.method public getPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 660
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->phoneNumber:Ljava/lang/String;

    .line 661
    return-object v0
.end method

.method public getProvince()Ljava/lang/String;
    .locals 1

    .line 737
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->province:Ljava/lang/String;

    .line 738
    return-object v0
.end method

.method public getRawContactId()Ljava/lang/String;
    .locals 1

    .line 884
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->rawContactId:Ljava/lang/String;

    .line 885
    return-object v0
.end method

.method public getReceiveArticlePushStatus()I
    .locals 2

    .line 393
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 395
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    .line 397
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lo/bqz;->d(C)I

    move-result v0

    return v0

    .line 400
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getRegisteredUser()I
    .locals 1

    .line 862
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->registeredUser:I

    .line 863
    return v0
.end method

.method public getRelation()I
    .locals 1

    .line 835
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->relation:I

    .line 836
    return v0
.end method

.method public getRemarkName()Ljava/lang/String;
    .locals 1

    .line 682
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->remarkName:Ljava/lang/String;

    .line 683
    return-object v0
.end method

.method public getSearchFullPinyin()Ljava/lang/String;
    .locals 1

    .line 917
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchFullPinyin:Ljava/lang/String;

    .line 918
    return-object v0
.end method

.method public getSearchPinyinFenci()Ljava/lang/String;
    .locals 1

    .line 939
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchPinyinFenci:Ljava/lang/String;

    .line 940
    return-object v0
.end method

.method public getSearchShortPinyin()Ljava/lang/String;
    .locals 1

    .line 928
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchShortPinyin:Ljava/lang/String;

    .line 929
    return-object v0
.end method

.method public getSetFlags()Ljava/lang/String;
    .locals 1

    .line 594
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    .line 595
    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    .line 759
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->signature:Ljava/lang/String;

    .line 760
    return-object v0
.end method

.method public getSiteId()I
    .locals 1

    .line 627
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->siteId:I

    .line 628
    return v0
.end method

.method public getSortPinYin()Ljava/lang/String;
    .locals 1

    .line 770
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->sortPinYin:Ljava/lang/String;

    .line 771
    return-object v0
.end method

.method public getState()I
    .locals 1

    .line 808
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->state:I

    .line 809
    return v0
.end method

.method public getStickTime()Ljava/lang/String;
    .locals 1

    .line 895
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->stickTime:Ljava/lang/String;

    .line 896
    return-object v0
.end method

.method public getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 430
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/User;->getDisplayName()Ljava/lang/String;

    move-result-object v3

    .line 431
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 434
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->contactName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 436
    iget-object v3, p0, Lcom/huawei/health/sns/model/user/User;->contactName:Ljava/lang/String;

    goto :goto_0

    .line 441
    :cond_0
    new-instance v4, Lo/anq;

    invoke-direct {v4}, Lo/anq;-><init>()V

    .line 442
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->account:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/anq;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 443
    const-string v0, "getUIDisplayName"

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

    .line 447
    :cond_1
    :goto_0
    return-object v3
.end method

.method public getUIMatchType()I
    .locals 2

    .line 457
    const/4 v1, 0x0

    .line 458
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->remarkName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 460
    const/4 v1, 0x1

    goto :goto_0

    .line 462
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 464
    const/4 v1, 0x2

    goto :goto_0

    .line 466
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->contactName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 468
    const/4 v1, 0x3

    .line 470
    :cond_2
    :goto_0
    return v1
.end method

.method public getUndisturbStatus()I
    .locals 2

    .line 349
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 351
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    if-nez v0, :cond_0

    .line 353
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 355
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lo/bqz;->d(C)I

    move-result v0

    return v0

    .line 358
    :cond_0
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 360
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 362
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lo/bqz;->d(C)I

    move-result v0

    return v0

    .line 366
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public getUserId()J
    .locals 2

    .line 572
    iget-wide v0, p0, Lcom/huawei/health/sns/model/user/User;->userId:J

    .line 573
    return-wide v0
.end method

.method public getUserType()I
    .locals 1

    .line 906
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    .line 907
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1006
    iget-wide v0, p0, Lcom/huawei/health/sns/model/user/User;->userId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->hashCode()I

    move-result v0

    return v0
.end method

.method public isAlreadyFriend()Z
    .locals 2

    .line 825
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->isFriend:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isAssistant()Z
    .locals 2

    .line 841
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setAccount(Ljava/lang/String;)V
    .locals 0

    .line 699
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->account:Ljava/lang/String;

    .line 700
    return-void
.end method

.method public setCardEvnetType(ILo/bfp$c;)V
    .locals 0

    .line 1039
    invoke-super {p0, p1}, Lo/bfh;->setCardType(I)V

    .line 1040
    invoke-super {p0, p2}, Lo/bfh;->setEventType(Lo/bfp$c;)V

    .line 1041
    return-void
.end method

.method public setChannel(I)V
    .locals 0

    .line 857
    iput p1, p0, Lcom/huawei/health/sns/model/user/User;->channel:I

    .line 858
    return-void
.end method

.method public setCity(Ljava/lang/String;)V
    .locals 0

    .line 754
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->city:Ljava/lang/String;

    .line 755
    return-void
.end method

.method public setContactName(Ljava/lang/String;)V
    .locals 0

    .line 655
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->contactName:Ljava/lang/String;

    .line 656
    return-void
.end method

.method public setContactSortPinYin(Ljava/lang/String;)V
    .locals 0

    .line 803
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->contactSortPinYin:Ljava/lang/String;

    .line 804
    return-void
.end method

.method public setGender(I)V
    .locals 0

    .line 721
    iput p1, p0, Lcom/huawei/health/sns/model/user/User;->gender:I

    .line 722
    return-void
.end method

.method public setImageURLDownload(Ljava/lang/String;)V
    .locals 0

    .line 644
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->imageURLDownload:Ljava/lang/String;

    .line 645
    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 622
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->imageUrl:Ljava/lang/String;

    .line 623
    return-void
.end method

.method public setIsFriend(I)V
    .locals 0

    .line 830
    iput p1, p0, Lcom/huawei/health/sns/model/user/User;->isFriend:I

    .line 831
    return-void
.end method

.method public setLastUpdateTime(Ljava/lang/String;)V
    .locals 0

    .line 879
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->lastUpdateTime:Ljava/lang/String;

    .line 880
    return-void
.end method

.method public setNationalCode(Ljava/lang/String;)V
    .locals 0

    .line 732
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->nationalCode:Ljava/lang/String;

    .line 733
    return-void
.end method

.method public setNeedVerify(I)V
    .locals 0

    .line 710
    iput p1, p0, Lcom/huawei/health/sns/model/user/User;->needVerify:I

    .line 711
    return-void
.end method

.method public setNickName(Ljava/lang/String;)V
    .locals 0

    .line 589
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    .line 590
    return-void
.end method

.method public setOldImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 611
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->oldImageUrl:Ljava/lang/String;

    .line 612
    return-void
.end method

.method public setOriginDesc(Ljava/lang/String;)V
    .locals 0

    .line 967
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->originDesc:Ljava/lang/String;

    .line 968
    return-void
.end method

.method public setOriginType(I)V
    .locals 0

    .line 956
    iput p1, p0, Lcom/huawei/health/sns/model/user/User;->originType:I

    .line 957
    return-void
.end method

.method public setPhoneDigest(Ljava/lang/String;)V
    .locals 0

    .line 677
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->phoneDigest:Ljava/lang/String;

    .line 678
    return-void
.end method

.method public setPhoneNumber(Ljava/lang/String;)V
    .locals 0

    .line 666
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->phoneNumber:Ljava/lang/String;

    .line 667
    return-void
.end method

.method public setProvince(Ljava/lang/String;)V
    .locals 0

    .line 743
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->province:Ljava/lang/String;

    .line 744
    return-void
.end method

.method public setRawContactId(Ljava/lang/String;)V
    .locals 0

    .line 890
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->rawContactId:Ljava/lang/String;

    .line 891
    return-void
.end method

.method public setRegisteredUser(I)V
    .locals 0

    .line 868
    iput p1, p0, Lcom/huawei/health/sns/model/user/User;->registeredUser:I

    .line 869
    return-void
.end method

.method public setRelation(I)V
    .locals 0

    .line 846
    iput p1, p0, Lcom/huawei/health/sns/model/user/User;->relation:I

    .line 847
    return-void
.end method

.method public setRemarkName(Ljava/lang/String;)V
    .locals 0

    .line 688
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->remarkName:Ljava/lang/String;

    .line 689
    return-void
.end method

.method public setSearchFullPinyin(Ljava/lang/String;)V
    .locals 0

    .line 923
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->searchFullPinyin:Ljava/lang/String;

    .line 924
    return-void
.end method

.method public setSearchPinyinFenci(Ljava/lang/String;)V
    .locals 0

    .line 945
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->searchPinyinFenci:Ljava/lang/String;

    .line 946
    return-void
.end method

.method public setSearchShortPinyin(Ljava/lang/String;)V
    .locals 0

    .line 934
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->searchShortPinyin:Ljava/lang/String;

    .line 935
    return-void
.end method

.method public setSetFlags(Ljava/lang/String;)V
    .locals 0

    .line 600
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    .line 601
    return-void
.end method

.method public setSignature(Ljava/lang/String;)V
    .locals 0

    .line 765
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->signature:Ljava/lang/String;

    .line 766
    return-void
.end method

.method public setSiteId(I)V
    .locals 0

    .line 633
    iput p1, p0, Lcom/huawei/health/sns/model/user/User;->siteId:I

    .line 634
    return-void
.end method

.method public setSortPinYin(Ljava/lang/String;)V
    .locals 0

    .line 792
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->sortPinYin:Ljava/lang/String;

    .line 793
    return-void
.end method

.method public setState(I)V
    .locals 0

    .line 814
    iput p1, p0, Lcom/huawei/health/sns/model/user/User;->state:I

    .line 815
    return-void
.end method

.method public setStickTime(Ljava/lang/String;)V
    .locals 0

    .line 901
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/User;->stickTime:Ljava/lang/String;

    .line 902
    return-void
.end method

.method public setUserId(J)V
    .locals 0

    .line 578
    iput-wide p1, p0, Lcom/huawei/health/sns/model/user/User;->userId:J

    .line 579
    return-void
.end method

.method public setUserType(I)V
    .locals 0

    .line 912
    iput p1, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    .line 913
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1093
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "User{, userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/user/User;->userId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", oldImageUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->oldImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageURLDownload=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->imageURLDownload:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", contactName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->contactName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", phoneNumber=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", phoneDigest=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->phoneDigest:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nickName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", remarkName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->remarkName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", account=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->account:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", needVerify="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/User;->needVerify:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gender="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/User;->gender:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nationalCode=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->nationalCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", province=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->province:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", city=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->city:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", signature=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->signature:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sortPinYin=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->sortPinYin:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", contactSortPinYin=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->contactSortPinYin:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/User;->state:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isFriend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/User;->isFriend:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", relation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/User;->relation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/User;->channel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", registeredUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/User;->registeredUser:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastUpdateTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->lastUpdateTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rawContactId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->rawContactId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", siteId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/User;->siteId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", setFlags=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stickTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->stickTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", searchFullPinyin=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->searchFullPinyin:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", searchShortPinyin=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->searchShortPinyin:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", searchPinyinFenci=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->searchPinyinFenci:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", originType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/User;->originType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", originDesc=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/User;->originDesc:Ljava/lang/String;

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

    .line 482
    iget-wide v0, p0, Lcom/huawei/health/sns/model/user/User;->userId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 483
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->imageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 484
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->oldImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 485
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->imageURLDownload:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 486
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->contactName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 487
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->phoneNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 488
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->phoneDigest:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 489
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->nickName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->remarkName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 491
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->account:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 492
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->needVerify:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 493
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->gender:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 494
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->nationalCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 495
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->province:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 496
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->city:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 497
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->signature:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 498
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->sortPinYin:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 499
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->contactSortPinYin:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 500
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->state:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 501
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->isFriend:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 502
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->relation:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 503
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->channel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 504
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->registeredUser:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 505
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->lastUpdateTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 506
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->siteId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 507
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->userType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 508
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->setFlags:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 509
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchFullPinyin:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 510
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchShortPinyin:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 511
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->searchPinyinFenci:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 512
    iget v0, p0, Lcom/huawei/health/sns/model/user/User;->originType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 513
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->originDesc:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 514
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/User;->stickTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 515
    return-void
.end method
