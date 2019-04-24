.class public Lcom/huawei/health/sns/model/group/GroupNotify;
.super Lo/bfh;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bfh;Landroid/os/Parcelable;Ljava/lang/Comparable<Lcom/huawei/health/sns/model/group/GroupNotify;>;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/group/GroupNotify;>;"
        }
    .end annotation
.end field

.field public static final DEFAULT_VALUE:I = -0x1

.field public static final TYPE_AGREE:I = 0x2

.field public static final TYPE_DISMISS:I = 0x3

.field public static final TYPE_GROUPLIST_CHANGE:I = 0x11

.field public static final TYPE_GROUP_TRANSFER:I = 0x9

.field public static final TYPE_INVITE:I = 0x1

.field public static final TYPE_INVITE_NORMAL:I = 0x4

.field public static final TYPE_JOIN_NORMAL:I = 0x5

.field public static final TYPE_MANAGER_QUIT_NORMAL:I = 0x6

.field public static final TYPE_MEMBER_DELETE:I = 0x8

.field public static final TYPE_MEMBER_QUIT:I = 0x7


# instance fields
.field private groupId_:J

.field private groupImageDownloadUrl:Ljava/lang/String;

.field private groupImageUrl:Ljava/lang/String;

.field private groupName:Ljava/lang/String;

.field private inviteCount:I

.field private oldGroupImageUrl:Ljava/lang/String;

.field private oldUserImageUrl:Ljava/lang/String;

.field private remarkName:Ljava/lang/String;

.field private sendTime:Ljava/lang/String;

.field private type:I

.field private userAccount:Ljava/lang/String;

.field private userId:J

.field private userImageDownloadUrl:Ljava/lang/String;

.field private userImageUrl:Ljava/lang/String;

.field private userNickname:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 219
    new-instance v0, Lcom/huawei/health/sns/model/group/GroupNotify$1;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/group/GroupNotify$1;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/group/GroupNotify;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 159
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 88
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userId:J

    .line 123
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupId_:J

    .line 160
    const/16 v0, 0x20

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setCardType(I)V

    .line 161
    sget-object v0, Lo/bfp$c;->m:Lo/bfp$c;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->setEventType(Lo/bfp$c;)V

    .line 162
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 236
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 88
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userId:J

    .line 123
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupId_:J

    .line 237
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->type:I

    .line 238
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userId:J

    .line 239
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userAccount:Ljava/lang/String;

    .line 240
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userNickname:Ljava/lang/String;

    .line 241
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->remarkName:Ljava/lang/String;

    .line 242
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userImageUrl:Ljava/lang/String;

    .line 243
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->oldUserImageUrl:Ljava/lang/String;

    .line 244
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userImageDownloadUrl:Ljava/lang/String;

    .line 245
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupId_:J

    .line 246
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupName:Ljava/lang/String;

    .line 247
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupImageUrl:Ljava/lang/String;

    .line 248
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->oldGroupImageUrl:Ljava/lang/String;

    .line 249
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupImageDownloadUrl:Ljava/lang/String;

    .line 250
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->sendTime:Ljava/lang/String;

    .line 251
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->inviteCount:I

    .line 252
    return-void
.end method

.method private buildDisplayName()Ljava/lang/String;
    .locals 4

    .line 179
    iget-object v2, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userNickname:Ljava/lang/String;

    .line 180
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->remarkName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 182
    iget-object v2, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->remarkName:Ljava/lang/String;

    .line 184
    :cond_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 186
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v3

    .line 188
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 190
    :cond_1
    return-object v2
.end method


# virtual methods
.method public compareTo(Lcom/huawei/health/sns/model/group/GroupNotify;)I
    .locals 2

    .line 257
    if-eqz p1, :cond_0

    .line 259
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->sendTime:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/huawei/health/sns/model/group/GroupNotify;->sendTime:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->sendTime:Ljava/lang/String;

    iget-object v1, p1, Lcom/huawei/health/sns/model/group/GroupNotify;->sendTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 264
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 22
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->compareTo(Lcom/huawei/health/sns/model/group/GroupNotify;)I

    move-result v0

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 196
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 276
    if-nez p1, :cond_0

    .line 278
    const/4 v0, 0x0

    return v0

    .line 281
    :cond_0
    if-ne p0, p1, :cond_1

    .line 283
    const/4 v0, 0x1

    return v0

    .line 286
    :cond_1
    instance-of v0, p1, Lcom/huawei/health/sns/model/group/GroupNotify;

    if-nez v0, :cond_2

    .line 288
    const/4 v0, 0x0

    return v0

    .line 291
    :cond_2
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/model/group/GroupNotify;

    .line 292
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->sendTime:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/health/sns/model/group/GroupNotify;->sendTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    .line 293
    return v3
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 1

    .line 171
    invoke-direct {p0}, Lcom/huawei/health/sns/model/group/GroupNotify;->buildDisplayName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getGroupId()J
    .locals 2

    .line 386
    iget-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupId_:J

    .line 387
    return-wide v0
.end method

.method public getGroupImageDownloadUrl()Ljava/lang/String;
    .locals 1

    .line 430
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupImageDownloadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getGroupImageUrl()Ljava/lang/String;
    .locals 1

    .line 408
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupImageUrl:Ljava/lang/String;

    .line 409
    return-object v0
.end method

.method public getGroupName()Ljava/lang/String;
    .locals 1

    .line 397
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupName:Ljava/lang/String;

    .line 398
    return-object v0
.end method

.method public getInviteCount()I
    .locals 1

    .line 451
    iget v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->inviteCount:I

    .line 452
    return v0
.end method

.method public getOldGroupImageUrl()Ljava/lang/String;
    .locals 1

    .line 419
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->oldGroupImageUrl:Ljava/lang/String;

    .line 420
    return-object v0
.end method

.method public getOldUserImageUrl()Ljava/lang/String;
    .locals 1

    .line 364
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->oldUserImageUrl:Ljava/lang/String;

    .line 365
    return-object v0
.end method

.method public getRemarkName()Ljava/lang/String;
    .locals 1

    .line 342
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->remarkName:Ljava/lang/String;

    .line 343
    return-object v0
.end method

.method public getSendTime()Ljava/lang/String;
    .locals 1

    .line 440
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->sendTime:Ljava/lang/String;

    .line 441
    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 298
    iget v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->type:I

    .line 299
    return v0
.end method

.method public getUserAccount()Ljava/lang/String;
    .locals 1

    .line 320
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userAccount:Ljava/lang/String;

    .line 321
    return-object v0
.end method

.method public getUserId()J
    .locals 2

    .line 309
    iget-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userId:J

    .line 310
    return-wide v0
.end method

.method public getUserImageDownloadUrl()Ljava/lang/String;
    .locals 1

    .line 375
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userImageDownloadUrl:Ljava/lang/String;

    .line 376
    return-object v0
.end method

.method public getUserImageUrl()Ljava/lang/String;
    .locals 1

    .line 353
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userImageUrl:Ljava/lang/String;

    .line 354
    return-object v0
.end method

.method public getUserNickname()Ljava/lang/String;
    .locals 1

    .line 331
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userNickname:Ljava/lang/String;

    .line 332
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 270
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public setGroupId(J)V
    .locals 0

    .line 392
    iput-wide p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupId_:J

    .line 393
    return-void
.end method

.method public setGroupImageDownloadUrl(Ljava/lang/String;)V
    .locals 0

    .line 435
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupImageDownloadUrl:Ljava/lang/String;

    .line 436
    return-void
.end method

.method public setGroupImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 414
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupImageUrl:Ljava/lang/String;

    .line 415
    return-void
.end method

.method public setGroupName(Ljava/lang/String;)V
    .locals 0

    .line 403
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupName:Ljava/lang/String;

    .line 404
    return-void
.end method

.method public setInviteCount(I)V
    .locals 0

    .line 457
    iput p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->inviteCount:I

    .line 458
    return-void
.end method

.method public setOldGroupImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 425
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->oldGroupImageUrl:Ljava/lang/String;

    .line 426
    return-void
.end method

.method public setOldUserImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 370
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->oldUserImageUrl:Ljava/lang/String;

    .line 371
    return-void
.end method

.method public setRemarkName(Ljava/lang/String;)V
    .locals 0

    .line 348
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->remarkName:Ljava/lang/String;

    .line 349
    return-void
.end method

.method public setSendTime(Ljava/lang/String;)V
    .locals 0

    .line 446
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->sendTime:Ljava/lang/String;

    .line 447
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 304
    iput p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->type:I

    .line 305
    return-void
.end method

.method public setUserAccount(Ljava/lang/String;)V
    .locals 0

    .line 326
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userAccount:Ljava/lang/String;

    .line 327
    return-void
.end method

.method public setUserId(J)V
    .locals 0

    .line 315
    iput-wide p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userId:J

    .line 316
    return-void
.end method

.method public setUserImageDownloadUrl(Ljava/lang/String;)V
    .locals 0

    .line 381
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userImageDownloadUrl:Ljava/lang/String;

    .line 382
    return-void
.end method

.method public setUserImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 359
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userImageUrl:Ljava/lang/String;

    .line 360
    return-void
.end method

.method public setUserNickname(Ljava/lang/String;)V
    .locals 0

    .line 337
    iput-object p1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userNickname:Ljava/lang/String;

    .line 338
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 461
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GroupNotify{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userAccount=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userAccount:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userNickname=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userNickname:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", remarkName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->remarkName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userImageUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", oldUserImageUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->oldUserImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userImageDownloadUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userImageDownloadUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupId_="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupId_:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupImageUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", oldGroupImageUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->oldGroupImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", groupImageDownloadUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupImageDownloadUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sendTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->sendTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", inviteCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->inviteCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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

    .line 202
    iget v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 203
    iget-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 204
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userAccount:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 205
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userNickname:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 206
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->remarkName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->oldUserImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 209
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->userImageDownloadUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 210
    iget-wide v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupId_:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 211
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->oldGroupImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 214
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->groupImageDownloadUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->sendTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 216
    iget v0, p0, Lcom/huawei/health/sns/model/group/GroupNotify;->inviteCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 217
    return-void
.end method
