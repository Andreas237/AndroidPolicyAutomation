.class public Lcom/huawei/health/sns/model/chat/ShareMessageParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/chat/ShareMessageParams;>;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "SystemShareMessage"


# instance fields
.field private chatType:I

.field private httpUrl:Ljava/lang/String;

.field private sharePicList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/net/Uri;>;"
        }
    .end annotation
.end field

.field private shareText:Ljava/lang/String;

.field private shareTitle:Ljava/lang/String;

.field private shareType:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

.field private userId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 380
    new-instance v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$2;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/chat/ShareMessageParams$2;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 355
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    sget-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->e:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareType:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    .line 356
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->userId:J

    .line 357
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->chatType:I

    .line 359
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 360
    sget-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->e:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 362
    sget-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->e:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareType:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    goto :goto_0

    .line 364
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->c:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 366
    sget-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->c:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareType:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    .line 369
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareText:Ljava/lang/String;

    .line 370
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->sharePicList:Ljava/util/ArrayList;

    .line 371
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->sharePicList:Ljava/util/ArrayList;

    const-class v1, Landroid/net/Uri;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 373
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareTitle:Ljava/lang/String;

    .line 374
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->httpUrl:Ljava/lang/String;

    .line 375
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/health/sns/model/chat/ShareMessageParams$2;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;)V
    .locals 1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    sget-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->e:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareType:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    .line 85
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareType:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    .line 86
    return-void
.end method

.method private static createBaseLinkMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;
    .locals 1

    .line 275
    new-instance v0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;-><init>()V

    .line 276
    invoke-virtual {v0, p0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkTitle(Ljava/lang/String;)V

    .line 277
    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkBrief(Ljava/lang/String;)V

    .line 278
    invoke-virtual {v0, p2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkUrl(Ljava/lang/String;)V

    .line 279
    return-object v0
.end method

.method private createLinkMsgWithImage(Ljava/lang/String;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;
    .locals 5

    .line 253
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    const/4 v0, 0x0

    return-object v0

    .line 257
    :cond_0
    const/4 v3, 0x0

    .line 259
    invoke-static {p1}, Lo/boe;->b(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 260
    if-eqz v4, :cond_1

    .line 262
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareText:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->httpUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->createBaseLinkMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    move-result-object v3

    .line 263
    invoke-static {v4}, Lo/bae;->e(Landroid/graphics/Bitmap;)Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->addBlobItem(Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;)V

    .line 265
    :cond_1
    return-object v3
.end method

.method private getUrlFromContent()Ljava/lang/String;
    .locals 6

    .line 314
    const/4 v3, 0x0

    .line 315
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareText:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 317
    return-object v3

    .line 319
    :cond_0
    sget-object v0, Lo/bob;->e:Ljava/util/regex/Pattern;

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 320
    const-string v5, ""

    .line 321
    :cond_1
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 323
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareText:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->start()I

    move-result v1

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->end()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 324
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 326
    move-object v3, v5

    .line 327
    .line 330
    :cond_2
    return-object v3
.end method

.method private initMultiShareImage(Landroid/os/Bundle;)V
    .locals 2

    .line 149
    const-string v0, "android.intent.extra.STREAM"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 150
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 152
    iput-object v1, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->sharePicList:Ljava/util/ArrayList;

    .line 154
    :cond_0
    return-void
.end method

.method private initSingleShareImage(Landroid/os/Bundle;)V
    .locals 2

    .line 163
    const-string v0, "android.intent.extra.STREAM"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/Uri;

    .line 164
    if-eqz v1, :cond_0

    .line 166
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->sharePicList:Ljava/util/ArrayList;

    .line 167
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->sharePicList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    :cond_0
    return-void
.end method


# virtual methods
.method public createLinkMessage()Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;
    .locals 7

    .line 218
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->isHasUrl()Z

    move-result v0

    if-nez v0, :cond_0

    .line 220
    const/4 v0, 0x0

    return-object v0

    .line 224
    :cond_0
    const/4 v3, 0x0

    .line 225
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->sharePicList:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->sharePicList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 228
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->sharePicList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/net/Uri;

    .line 230
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->userId:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lo/aqr;->d(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 231
    invoke-direct {p0, v6}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->createLinkMsgWithImage(Ljava/lang/String;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    move-result-object v3

    .line 232
    if-eqz v3, :cond_1

    .line 234
    goto :goto_1

    .line 236
    :cond_1
    goto :goto_0

    :cond_2
    :goto_1
    goto :goto_2

    .line 240
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareText:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->httpUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->createBaseLinkMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    move-result-object v3

    .line 242
    :goto_2
    return-object v3
.end method

.method public describeContents()I
    .locals 1

    .line 336
    const/4 v0, 0x0

    return v0
.end method

.method public getChatType()I
    .locals 1

    .line 202
    iget v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->chatType:I

    .line 203
    return v0
.end method

.method public getSharePicList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Landroid/net/Uri;>;"
        }
    .end annotation

    .line 190
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->sharePicList:Ljava/util/ArrayList;

    .line 191
    return-object v0
.end method

.method public getShareText()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareText:Ljava/lang/String;

    .line 180
    return-object v0
.end method

.method public getShareTitle()Ljava/lang/String;
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getShareType()Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareType:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    .line 91
    return-object v0
.end method

.method public getUserId()J
    .locals 2

    .line 196
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->userId:J

    .line 197
    return-wide v0
.end method

.method public initShareData(Landroid/content/Intent;Z)V
    .locals 4

    .line 102
    if-nez p1, :cond_0

    .line 104
    const-string v0, "SystemShareMessage"

    const-string v1, "init Data intent is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    return-void

    .line 107
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 108
    if-nez v3, :cond_1

    .line 110
    const-string v0, "SystemShareMessage"

    const-string v1, "init Data Bundle is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    return-void

    .line 114
    :cond_1
    const-string v0, "android.intent.extra.SUBJECT"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareTitle:Ljava/lang/String;

    .line 115
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareTitle:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 118
    const-string v0, "title"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareTitle:Ljava/lang/String;

    .line 120
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareTitle:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x64

    if-le v0, v1, :cond_3

    .line 122
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareTitle:Ljava/lang/String;

    const/4 v1, 0x0

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareTitle:Ljava/lang/String;

    .line 126
    :cond_3
    const-string v0, "android.intent.extra.TEXT"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareText:Ljava/lang/String;

    .line 128
    const-string v0, "url"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->httpUrl:Ljava/lang/String;

    .line 130
    if-eqz p2, :cond_4

    .line 133
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->initMultiShareImage(Landroid/os/Bundle;)V

    goto :goto_0

    .line 138
    :cond_4
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->initSingleShareImage(Landroid/os/Bundle;)V

    .line 140
    :goto_0
    return-void
.end method

.method public isHasUrl()Z
    .locals 3

    .line 289
    const/4 v1, 0x0

    .line 290
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->httpUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 293
    const/4 v0, 0x1

    return v0

    .line 297
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getUrlFromContent()Ljava/lang/String;

    move-result-object v2

    .line 298
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 301
    iput-object v2, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->httpUrl:Ljava/lang/String;

    .line 302
    const/4 v1, 0x1

    .line 304
    :cond_1
    return v1
.end method

.method public setShareInfo(JI)V
    .locals 0

    .line 173
    iput-wide p1, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->userId:J

    .line 174
    iput p3, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->chatType:I

    .line 175
    return-void
.end method

.method public setShareText(Ljava/lang/String;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareText:Ljava/lang/String;

    .line 186
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 342
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->userId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 343
    iget v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->chatType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 345
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareType:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 347
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 348
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->sharePicList:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 350
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->shareTitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 351
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->httpUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 352
    return-void
.end method
