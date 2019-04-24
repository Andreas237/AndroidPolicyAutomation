.class public Lcom/huawei/health/sns/model/user/UserNotify;
.super Lo/bfh;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/model/user/UserNotify$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation
.end field

.field public static final NOTIFIED_SIDE_APPLY:I = 0x0

.field public static final NOTIFIED_SIDE_BE_APPLYED:I = 0x1

.field public static final USER_NOTIFY_READED:I = 0x1

.field public static final USER_NOTIFY_UNREAD:I = 0x0


# instance fields
.field private account:Ljava/lang/String;

.field private addNotes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;"
        }
    .end annotation
.end field

.field private appPkg:Ljava/lang/String;

.field private city:Ljava/lang/String;

.field private contactName:Ljava/lang/String;

.field private frdOrigin:Lcom/huawei/health/sns/server/user/Origin;

.field private gender:I

.field private imageUrl:Ljava/lang/String;

.field private isFriend:I

.field private myOrigin:Lcom/huawei/health/sns/server/user/Origin;

.field private newlyRecievedNotify:I

.field private nickName:Ljava/lang/String;

.field private note:Ljava/lang/String;

.field private notifiedSide:I

.field private oldImageUrl:Ljava/lang/String;

.field private phoneDigest:Ljava/lang/String;

.field private phoneNumber:Ljava/lang/String;

.field private province:Ljava/lang/String;

.field private remarkName:Ljava/lang/String;

.field private sendTime:Ljava/lang/String;

.field private signature:Ljava/lang/String;

.field private state:I

.field private type:Lcom/huawei/health/sns/model/user/UserNotify$b;

.field private urlDownload:Ljava/lang/String;

.field private userId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 591
    new-instance v0, Lcom/huawei/health/sns/model/user/UserNotify$4;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/user/UserNotify$4;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/user/UserNotify;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 96
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 182
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->isFriend:I

    .line 97
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 608
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 182
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->isFriend:I

    .line 609
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->userId:J

    .line 610
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->imageUrl:Ljava/lang/String;

    .line 611
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->oldImageUrl:Ljava/lang/String;

    .line 612
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->urlDownload:Ljava/lang/String;

    .line 613
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->nickName:Ljava/lang/String;

    .line 614
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->remarkName:Ljava/lang/String;

    .line 615
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->contactName:Ljava/lang/String;

    .line 616
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->phoneNumber:Ljava/lang/String;

    .line 617
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->account:Ljava/lang/String;

    .line 618
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->gender:I

    .line 619
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->province:Ljava/lang/String;

    .line 620
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->city:Ljava/lang/String;

    .line 621
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->signature:Ljava/lang/String;

    .line 622
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->phoneDigest:Ljava/lang/String;

    .line 623
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->newlyRecievedNotify:I

    .line 624
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->e(I)Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->type:Lcom/huawei/health/sns/model/user/UserNotify$b;

    .line 625
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->note:Ljava/lang/String;

    .line 626
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->state:I

    .line 627
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->notifiedSide:I

    .line 628
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->sendTime:Ljava/lang/String;

    .line 629
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->appPkg:Ljava/lang/String;

    .line 630
    const-class v0, Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/user/Origin;

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->frdOrigin:Lcom/huawei/health/sns/server/user/Origin;

    .line 631
    const-class v0, Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/user/Origin;

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->myOrigin:Lcom/huawei/health/sns/server/user/Origin;

    .line 632
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 560
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 637
    if-nez p1, :cond_0

    .line 639
    const/4 v0, 0x0

    return v0

    .line 642
    :cond_0
    if-ne p0, p1, :cond_1

    .line 644
    const/4 v0, 0x1

    return v0

    .line 647
    :cond_1
    instance-of v0, p1, Lcom/huawei/health/sns/model/user/UserNotify;

    if-nez v0, :cond_2

    .line 649
    const/4 v0, 0x0

    return v0

    .line 652
    :cond_2
    move-object v4, p1

    check-cast v4, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 654
    iget-wide v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->userId:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    .line 656
    const/4 v0, 0x0

    return v0

    .line 658
    :cond_3
    iget-wide v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->userId:J

    iget-wide v2, v4, Lcom/huawei/health/sns/model/user/UserNotify;->userId:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getAccount()Ljava/lang/String;
    .locals 1

    .line 345
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->account:Ljava/lang/String;

    .line 346
    return-object v0
.end method

.method public getAddNotes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;"
        }
    .end annotation

    .line 497
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->addNotes:Ljava/util/List;

    return-object v0
.end method

.method public getAppPkg()Ljava/lang/String;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->appPkg:Ljava/lang/String;

    .line 247
    return-object v0
.end method

.method public getCity()Ljava/lang/String;
    .locals 1

    .line 378
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->city:Ljava/lang/String;

    .line 379
    return-object v0
.end method

.method public getContactName()Ljava/lang/String;
    .locals 1

    .line 323
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->contactName:Ljava/lang/String;

    .line 324
    return-object v0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 2

    .line 512
    const-string v1, ""

    .line 513
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->remarkName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 515
    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->remarkName:Ljava/lang/String;

    goto :goto_0

    .line 517
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->nickName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 519
    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->nickName:Ljava/lang/String;

    .line 521
    :cond_1
    :goto_0
    return-object v1
.end method

.method public getFrdOrigin()Lcom/huawei/health/sns/server/user/Origin;
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->frdOrigin:Lcom/huawei/health/sns/server/user/Origin;

    return-object v0
.end method

.method public getGender()I
    .locals 1

    .line 356
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->gender:I

    .line 357
    return v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->imageUrl:Ljava/lang/String;

    .line 269
    return-object v0
.end method

.method public getIsFriend()I
    .locals 1

    .line 442
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->isFriend:I

    .line 443
    return v0
.end method

.method public getMyOrigin()Lcom/huawei/health/sns/server/user/Origin;
    .locals 1

    .line 236
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->myOrigin:Lcom/huawei/health/sns/server/user/Origin;

    return-object v0
.end method

.method public getNickName()Ljava/lang/String;
    .locals 1

    .line 301
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->nickName:Ljava/lang/String;

    .line 302
    return-object v0
.end method

.method public getNote()Ljava/lang/String;
    .locals 1

    .line 464
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->note:Ljava/lang/String;

    .line 465
    return-object v0
.end method

.method public getNotifiedSide()I
    .locals 1

    .line 486
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->notifiedSide:I

    .line 487
    return v0
.end method

.method public getOldImageUrl()Ljava/lang/String;
    .locals 1

    .line 279
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->oldImageUrl:Ljava/lang/String;

    .line 280
    return-object v0
.end method

.method public getPhoneDigest()Ljava/lang/String;
    .locals 1

    .line 400
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->phoneDigest:Ljava/lang/String;

    .line 401
    return-object v0
.end method

.method public getPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 334
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->phoneNumber:Ljava/lang/String;

    .line 335
    return-object v0
.end method

.method public getProvince()Ljava/lang/String;
    .locals 1

    .line 367
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->province:Ljava/lang/String;

    .line 368
    return-object v0
.end method

.method public getRemarkName()Ljava/lang/String;
    .locals 1

    .line 312
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->remarkName:Ljava/lang/String;

    .line 313
    return-object v0
.end method

.method public getSendTime()Ljava/lang/String;
    .locals 1

    .line 453
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->sendTime:Ljava/lang/String;

    .line 454
    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    .line 389
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->signature:Ljava/lang/String;

    .line 390
    return-object v0
.end method

.method public getState()I
    .locals 1

    .line 475
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->state:I

    .line 476
    return v0
.end method

.method public getType()Lcom/huawei/health/sns/model/user/UserNotify$b;
    .locals 1

    .line 431
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->type:Lcom/huawei/health/sns/model/user/UserNotify$b;

    .line 432
    return-object v0
.end method

.method public getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 542
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    .line 543
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 545
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->contactName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 547
    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->contactName:Ljava/lang/String;

    goto :goto_0

    .line 551
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 554
    :cond_1
    :goto_0
    return-object v1
.end method

.method public getUrlDownload()Ljava/lang/String;
    .locals 1

    .line 290
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->urlDownload:Ljava/lang/String;

    .line 291
    return-object v0
.end method

.method public getUserId()J
    .locals 2

    .line 257
    iget-wide v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->userId:J

    .line 258
    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    .line 664
    iget-wide v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->userId:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 666
    const/4 v0, 0x0

    return v0

    .line 668
    :cond_0
    iget-wide v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->userId:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isReaded()Z
    .locals 2

    .line 416
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->newlyRecievedNotify:I

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

    .line 351
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->account:Ljava/lang/String;

    .line 352
    return-void
.end method

.method public setAddNotes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;)V"
        }
    .end annotation

    .line 502
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->addNotes:Ljava/util/List;

    .line 503
    return-void
.end method

.method public setAppPkg(Ljava/lang/String;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->appPkg:Ljava/lang/String;

    .line 253
    return-void
.end method

.method public setCity(Ljava/lang/String;)V
    .locals 0

    .line 384
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->city:Ljava/lang/String;

    .line 385
    return-void
.end method

.method public setContactName(Ljava/lang/String;)V
    .locals 0

    .line 329
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->contactName:Ljava/lang/String;

    .line 330
    return-void
.end method

.method public setFrdOrigin(Lcom/huawei/health/sns/server/user/Origin;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->frdOrigin:Lcom/huawei/health/sns/server/user/Origin;

    .line 232
    return-void
.end method

.method public setGender(I)V
    .locals 0

    .line 362
    iput p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->gender:I

    .line 363
    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 274
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->imageUrl:Ljava/lang/String;

    .line 275
    return-void
.end method

.method public setIsFriend(I)V
    .locals 0

    .line 448
    iput p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->isFriend:I

    .line 449
    return-void
.end method

.method public setIsReaded(Z)V
    .locals 1

    .line 426
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->newlyRecievedNotify:I

    .line 427
    return-void
.end method

.method public setMyOrigin(Lcom/huawei/health/sns/server/user/Origin;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->myOrigin:Lcom/huawei/health/sns/server/user/Origin;

    .line 242
    return-void
.end method

.method public setNickName(Ljava/lang/String;)V
    .locals 0

    .line 307
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->nickName:Ljava/lang/String;

    .line 308
    return-void
.end method

.method public setNote(Ljava/lang/String;)V
    .locals 0

    .line 470
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->note:Ljava/lang/String;

    .line 471
    return-void
.end method

.method public setNotifiedSide(I)V
    .locals 0

    .line 492
    iput p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->notifiedSide:I

    .line 493
    return-void
.end method

.method public setOldImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 285
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->oldImageUrl:Ljava/lang/String;

    .line 286
    return-void
.end method

.method public setPhoneDigest(Ljava/lang/String;)V
    .locals 0

    .line 406
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->phoneDigest:Ljava/lang/String;

    .line 407
    return-void
.end method

.method public setPhoneNumber(Ljava/lang/String;)V
    .locals 0

    .line 340
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->phoneNumber:Ljava/lang/String;

    .line 341
    return-void
.end method

.method public setProvince(Ljava/lang/String;)V
    .locals 0

    .line 373
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->province:Ljava/lang/String;

    .line 374
    return-void
.end method

.method public setRemarkName(Ljava/lang/String;)V
    .locals 0

    .line 318
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->remarkName:Ljava/lang/String;

    .line 319
    return-void
.end method

.method public setSendTime(Ljava/lang/String;)V
    .locals 0

    .line 459
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->sendTime:Ljava/lang/String;

    .line 460
    return-void
.end method

.method public setSignature(Ljava/lang/String;)V
    .locals 0

    .line 395
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->signature:Ljava/lang/String;

    .line 396
    return-void
.end method

.method public setState(I)V
    .locals 0

    .line 481
    iput p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->state:I

    .line 482
    return-void
.end method

.method public setType(Lcom/huawei/health/sns/model/user/UserNotify$b;)V
    .locals 0

    .line 437
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->type:Lcom/huawei/health/sns/model/user/UserNotify$b;

    .line 438
    return-void
.end method

.method public setUrlDownload(Ljava/lang/String;)V
    .locals 0

    .line 296
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->urlDownload:Ljava/lang/String;

    .line 297
    return-void
.end method

.method public setUserId(J)V
    .locals 0

    .line 263
    iput-wide p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->userId:J

    .line 264
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 672
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserNotify{, userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->userId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", oldImageUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->oldImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", urlDownload=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->urlDownload:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nickName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->nickName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", remarkName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->remarkName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", contactName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->contactName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", phoneNumber=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", account=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->account:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gender="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->gender:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", province=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->province:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", city=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->city:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", signature=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->signature:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", phoneDigest=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->phoneDigest:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", newlyRecievedNotify="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->newlyRecievedNotify:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->type:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isFriend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->isFriend:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sendTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->sendTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", note=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->note:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->state:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", notifiedSide="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->notifiedSide:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", addNotes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->addNotes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", appPkg=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->appPkg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", frdOrigin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->frdOrigin:Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", myOrigin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->myOrigin:Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public updateOldImageUrl(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/health/sns/model/user/User;)V
    .locals 1

    .line 526
    iput-object p1, p0, Lcom/huawei/health/sns/model/user/UserNotify;->oldImageUrl:Ljava/lang/String;

    .line 527
    iput-object p2, p0, Lcom/huawei/health/sns/model/user/UserNotify;->imageUrl:Ljava/lang/String;

    .line 528
    if-eqz p3, :cond_0

    .line 530
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->urlDownload:Ljava/lang/String;

    .line 532
    :cond_0
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 566
    iget-wide v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->userId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 567
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->imageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 568
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->oldImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 569
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->urlDownload:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 570
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->nickName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 571
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->remarkName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 572
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->contactName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 573
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->phoneNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 574
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->account:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 575
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->gender:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 576
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->province:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 577
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->city:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 578
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->signature:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 579
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->phoneDigest:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 580
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->newlyRecievedNotify:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 581
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->type:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->type:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->c()I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 582
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->note:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 583
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->state:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 584
    iget v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->notifiedSide:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 585
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->sendTime:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 586
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->appPkg:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 587
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->frdOrigin:Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 588
    iget-object v0, p0, Lcom/huawei/health/sns/model/user/UserNotify;->myOrigin:Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 589
    return-void
.end method
