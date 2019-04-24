.class public Lcom/huawei/health/sns/model/search/SNSSearchBean;
.super Lcom/huawei/health/sns/model/user/User;
.source "SourceFile"


# static fields
.field public static final BEANTYPE_CONTACT:I = 0x1

.field public static final BEANTYPE_CONVERSATION:I = 0x4

.field public static final BEANTYPE_GROUP:I = 0x2

.field public static final BEANTYPE_GROUP_MEMBER:I = 0x3

.field public static final BEANTYPE_MEMBER:I = 0x5

.field public static final BEANTYPE_USER:I = 0x0

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation
.end field

.field public static final MATCH_TYPE_ACCOUNT:I = 0x5

.field public static final MATCH_TYPE_CITY:I = 0x7

.field public static final MATCH_TYPE_CONTACT_NAME:I = 0x3

.field public static final MATCH_TYPE_FULL_PINYIN:I = 0xa

.field public static final MATCH_TYPE_GROUP_FULL_PINYIN:I = 0xd

.field public static final MATCH_TYPE_GROUP_NAME:I = 0xb

.field public static final MATCH_TYPE_GROUP_NICK_NAME:I = 0x8

.field public static final MATCH_TYPE_GROUP_SHORT_PINYIN:I = 0xc

.field public static final MATCH_TYPE_MEMBER_FULL_PINYIN:I = 0xf

.field public static final MATCH_TYPE_MEMBER_SHORT_PINYIN:I = 0xe

.field public static final MATCH_TYPE_NICK_NAME:I = 0x2

.field public static final MATCH_TYPE_PHONE_NUMBER:I = 0x4

.field public static final MATCH_TYPE_PROVINCE:I = 0x6

.field public static final MATCH_TYPE_REMARK_NAME:I = 0x1

.field public static final MATCH_TYPE_SHORT_PINYIN:I = 0x9

.field public static final MATCH_TYPE_UNKWON:I = 0x0

.field public static final SEARCH_TYPE_FULLPINYIN:I = 0x2

.field public static final SEARCH_TYPE_NORMAL:I = 0x0

.field public static final SEARCH_TYPE_SHORTPINYIN:I = 0x1


# instance fields
.field private beanType:I

.field private group:Lcom/huawei/health/sns/model/group/Group;

.field private isHighLightTitle:Z

.field private isLastItem:Z

.field private matchCount:I

.field private matchIndex:I

.field private matchType:I

.field private memberBeanList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/MemberSearchBean;>;"
        }
    .end annotation
.end field

.field private msgCounts:I

.field private searchType:I

.field private subTips:Ljava/lang/String;

.field private subTitle:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private uiDisplayNameMatchType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 176
    new-instance v0, Lcom/huawei/health/sns/model/search/SNSSearchBean$5;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean$5;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 153
    invoke-direct {p0}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 70
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->isHighLightTitle:Z

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->memberBeanList:Ljava/util/ArrayList;

    .line 120
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchType:I

    .line 125
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->searchType:I

    .line 145
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->beanType:I

    .line 150
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->uiDisplayNameMatchType:I

    .line 155
    return-void
.end method

.method public constructor <init>(JLjava/lang/String;)V
    .locals 1

    .line 210
    invoke-direct {p0}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 70
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->isHighLightTitle:Z

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->memberBeanList:Ljava/util/ArrayList;

    .line 120
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchType:I

    .line 125
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->searchType:I

    .line 145
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->beanType:I

    .line 150
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->uiDisplayNameMatchType:I

    .line 211
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->initUserIdAndTitle(JLjava/lang/String;)V

    .line 212
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 193
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/model/user/User;-><init>(Landroid/os/Parcel;)V

    .line 70
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->isHighLightTitle:Z

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->memberBeanList:Ljava/util/ArrayList;

    .line 120
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchType:I

    .line 125
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->searchType:I

    .line 145
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->beanType:I

    .line 150
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->uiDisplayNameMatchType:I

    .line 194
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->isHighLightTitle:Z

    .line 195
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->msgCounts:I

    .line 196
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->title:Ljava/lang/String;

    .line 197
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->subTitle:Ljava/lang/String;

    .line 198
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->subTips:Ljava/lang/String;

    .line 199
    const-class v0, Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->group:Lcom/huawei/health/sns/model/group/Group;

    .line 200
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->isLastItem:Z

    .line 201
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchIndex:I

    .line 202
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchCount:I

    .line 203
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchType:I

    .line 204
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->searchType:I

    .line 205
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->beanType:I

    .line 206
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->memberBeanList:Ljava/util/ArrayList;

    const-class v1, Lcom/huawei/health/sns/model/search/MemberSearchBean;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 207
    return-void
.end method

.method private initUserIdAndTitle(JLjava/lang/String;)V
    .locals 0

    .line 215
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setUserId(J)V

    .line 216
    invoke-virtual {p0, p3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setTitle(Ljava/lang/String;)V

    .line 217
    return-void
.end method


# virtual methods
.method public addMemberBean(Lcom/huawei/health/sns/model/search/MemberSearchBean;)V
    .locals 1

    .line 402
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->memberBeanList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 404
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->memberBeanList:Ljava/util/ArrayList;

    .line 406
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->memberBeanList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 340
    invoke-super {p0, p1}, Lcom/huawei/health/sns/model/user/User;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getBeanType()I
    .locals 1

    .line 247
    iget v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->beanType:I

    .line 248
    return v0
.end method

.method public getGroup()Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 319
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->group:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method public getMatchCount()I
    .locals 1

    .line 369
    iget v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchCount:I

    .line 370
    return v0
.end method

.method public getMatchIndex()I
    .locals 1

    .line 358
    iget v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchIndex:I

    .line 359
    return v0
.end method

.method public getMatchType()I
    .locals 1

    .line 380
    iget v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchType:I

    .line 381
    return v0
.end method

.method public getMemberBean()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/MemberSearchBean;>;"
        }
    .end annotation

    .line 411
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->memberBeanList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getMsgCounts()I
    .locals 1

    .line 269
    iget v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->msgCounts:I

    .line 270
    return v0
.end method

.method public getSearchType()I
    .locals 1

    .line 391
    iget v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->searchType:I

    .line 392
    return v0
.end method

.method public getSubTips()Ljava/lang/String;
    .locals 1

    .line 308
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->subTips:Ljava/lang/String;

    .line 309
    return-object v0
.end method

.method public getSubTitle()Ljava/lang/String;
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->subTitle:Ljava/lang/String;

    .line 298
    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->title:Ljava/lang/String;

    .line 281
    return-object v0
.end method

.method public getUIDisplayNameMatchType()I
    .locals 1

    .line 416
    iget v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->uiDisplayNameMatchType:I

    .line 417
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 346
    invoke-super {p0}, Lcom/huawei/health/sns/model/user/User;->hashCode()I

    move-result v0

    return v0
.end method

.method public isHighLightTitle()Z
    .locals 1

    .line 258
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->isHighLightTitle:Z

    .line 259
    return v0
.end method

.method public isLastItem()Z
    .locals 1

    .line 329
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->isLastItem:Z

    return v0
.end method

.method public setBeanType(I)V
    .locals 0

    .line 253
    iput p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->beanType:I

    .line 254
    return-void
.end method

.method public setGroup(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 324
    iput-object p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->group:Lcom/huawei/health/sns/model/group/Group;

    .line 325
    return-void
.end method

.method public setHighLightTitle(Z)V
    .locals 0

    .line 264
    iput-boolean p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->isHighLightTitle:Z

    .line 265
    return-void
.end method

.method public setImageUrls(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 221
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageUrl(Ljava/lang/String;)V

    .line 222
    invoke-virtual {p0, p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setOldImageUrl(Ljava/lang/String;)V

    .line 223
    invoke-virtual {p0, p3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageURLDownload(Ljava/lang/String;)V

    .line 224
    return-void
.end method

.method public setLastItem(Z)V
    .locals 0

    .line 334
    iput-boolean p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->isLastItem:Z

    .line 335
    return-void
.end method

.method public setMatchCount(I)V
    .locals 0

    .line 375
    iput p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchCount:I

    .line 376
    return-void
.end method

.method public setMatchData(III)V
    .locals 0

    .line 351
    iput p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchIndex:I

    .line 352
    iput p2, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchCount:I

    .line 353
    iput p3, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchType:I

    .line 354
    return-void
.end method

.method public setMatchIndex(I)V
    .locals 0

    .line 364
    iput p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchIndex:I

    .line 365
    return-void
.end method

.method public setMatchType(I)V
    .locals 0

    .line 386
    iput p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchType:I

    .line 387
    return-void
.end method

.method public setMsgCounts(I)V
    .locals 0

    .line 275
    iput p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->msgCounts:I

    .line 276
    return-void
.end method

.method public setSearchEvent(Ljava/lang/String;IIILo/bfp$c;)V
    .locals 0

    .line 238
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setKeyColorText(Ljava/lang/String;)V

    .line 239
    invoke-virtual {p0, p3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setBeanType(I)V

    .line 240
    invoke-virtual {p0, p4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setCardType(I)V

    .line 241
    invoke-virtual {p0, p5}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setEventType(Lo/bfp$c;)V

    .line 242
    invoke-virtual {p0, p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSearchType(I)V

    .line 243
    return-void
.end method

.method public setSearchType(I)V
    .locals 0

    .line 397
    iput p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->searchType:I

    .line 398
    return-void
.end method

.method public setSubTips(Ljava/lang/String;)V
    .locals 0

    .line 314
    iput-object p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->subTips:Ljava/lang/String;

    .line 315
    return-void
.end method

.method public setSubTitle(Ljava/lang/String;)V
    .locals 0

    .line 303
    iput-object p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->subTitle:Ljava/lang/String;

    .line 304
    return-void
.end method

.method public setSubTitleTips(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 291
    iput-object p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->subTitle:Ljava/lang/String;

    .line 292
    iput-object p2, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->subTips:Ljava/lang/String;

    .line 293
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 286
    iput-object p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->title:Ljava/lang/String;

    .line 287
    return-void
.end method

.method public setUIData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->subTitle:Ljava/lang/String;

    .line 229
    iput-object p2, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->subTips:Ljava/lang/String;

    .line 230
    invoke-virtual {p0, p3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageUrl(Ljava/lang/String;)V

    .line 231
    invoke-virtual {p0, p4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setOldImageUrl(Ljava/lang/String;)V

    .line 232
    invoke-virtual {p0, p5}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageURLDownload(Ljava/lang/String;)V

    .line 233
    return-void
.end method

.method public setUIDisplayNameMatchType(I)V
    .locals 0

    .line 422
    iput p1, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->uiDisplayNameMatchType:I

    .line 423
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 160
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/model/user/User;->writeToParcel(Landroid/os/Parcel;I)V

    .line 161
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->isHighLightTitle:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 162
    iget v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->msgCounts:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 163
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->subTitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->subTips:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->group:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 167
    iget-boolean v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->isLastItem:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 168
    iget v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchIndex:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 169
    iget v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 170
    iget v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->matchType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 171
    iget v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->searchType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 172
    iget v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->beanType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 173
    iget-object v0, p0, Lcom/huawei/health/sns/model/search/SNSSearchBean;->memberBeanList:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 174
    return-void
.end method
