.class public final Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;
.super Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
.source "SourceFile"


# static fields
.field public static final APP_LINK:I = 0x1

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;>;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "SNSLinkMessage"

.field public static final WEB_LINK:I = 0x0


# instance fields
.field private blobItemList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;>;"
        }
    .end annotation
.end field

.field private linkAppID:Ljava/lang/String;

.field private linkAppName:Ljava/lang/String;

.field private linkAppPackage:Ljava/lang/String;

.field private linkBrief:Ljava/lang/String;

.field private linkReqVerCode:Ljava/lang/String;

.field private linkTitle:Ljava/lang/String;

.field private linkUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 364
    new-instance v0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage$5;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage$5;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 84
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;-><init>()V

    .line 77
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->blobItemList:Ljava/util/ArrayList;

    .line 85
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->f:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setMsgType(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;)V

    .line 86
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 332
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;-><init>(Landroid/os/Parcel;)V

    .line 77
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->blobItemList:Ljava/util/ArrayList;

    .line 333
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkTitle:Ljava/lang/String;

    .line 334
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkBrief:Ljava/lang/String;

    .line 335
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    .line 337
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppName:Ljava/lang/String;

    .line 339
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppID:Ljava/lang/String;

    .line 340
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppPackage:Ljava/lang/String;

    .line 341
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkReqVerCode:Ljava/lang/String;

    .line 343
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->blobItemList:Ljava/util/ArrayList;

    const-class v1, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 344
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;-><init>()V

    .line 91
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkTitle:Ljava/lang/String;

    .line 92
    iput-object p2, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkBrief:Ljava/lang/String;

    .line 93
    iput-object p3, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public static fromJson(Ljava/lang/String;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;
    .locals 9

    .line 442
    new-instance v2, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;-><init>()V

    .line 445
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 446
    const-string v0, "linkTitle"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkTitle(Ljava/lang/String;)V

    .line 447
    const-string v0, "linkBrief"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkBrief(Ljava/lang/String;)V

    .line 448
    const-string v0, "linkUrl"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkUrl(Ljava/lang/String;)V

    .line 450
    const-string v0, "linkAppName"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkAppName(Ljava/lang/String;)V

    .line 452
    const-string v0, "linkAppID"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkAppID(Ljava/lang/String;)V

    .line 453
    const-string v0, "linkAppPackage"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkAppPackage(Ljava/lang/String;)V

    .line 454
    const-string v0, "linkReqVerCode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkReqVerCode(Ljava/lang/String;)V

    .line 456
    const-string v0, "items"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 457
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 459
    if-eqz v4, :cond_0

    .line 461
    const/4 v6, 0x0

    .line 463
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 465
    new-instance v7, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    invoke-direct {v7}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;-><init>()V

    .line 466
    invoke-virtual {v4, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 467
    const-string v0, "length"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "width"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobSize(II)V

    .line 468
    const-string v0, "position"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobTypeInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    const-string v0, "localPath"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setLocalBlobDataPath(Ljava/lang/String;)V

    .line 470
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 474
    :cond_0
    invoke-virtual {v2, v5}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setBlobItemList(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 479
    goto :goto_1

    .line 476
    :catch_0
    move-exception v3

    .line 478
    const-string v0, "SNSLinkMessage"

    const-string v1, "SNSLinkMessage parse json Exception!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    :goto_1
    return-object v2
.end method


# virtual methods
.method public addBlobItem(Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;)V
    .locals 1

    .line 219
    if-eqz p1, :cond_1

    .line 221
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->blobItemList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->blobItemList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->blobItemList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    :cond_1
    return-void
.end method

.method public getBlobItemList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;>;"
        }
    .end annotation

    .line 198
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->blobItemList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getLinkAppID()Ljava/lang/String;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppID:Ljava/lang/String;

    .line 166
    return-object v0
.end method

.method public getLinkAppName()Ljava/lang/String;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppName:Ljava/lang/String;

    .line 155
    return-object v0
.end method

.method public getLinkAppPackage()Ljava/lang/String;
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppPackage:Ljava/lang/String;

    .line 177
    return-object v0
.end method

.method public getLinkBrief()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkBrief:Ljava/lang/String;

    .line 133
    return-object v0
.end method

.method public getLinkMessageTip()Ljava/lang/String;
    .locals 2

    .line 103
    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkTitle:Ljava/lang/String;

    .line 105
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkBrief:Ljava/lang/String;

    .line 109
    :cond_0
    return-object v1
.end method

.method public getLinkReqVerCode()Ljava/lang/String;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkReqVerCode:Ljava/lang/String;

    .line 188
    return-object v0
.end method

.method public getLinkTitle()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkTitle:Ljava/lang/String;

    .line 115
    return-object v0
.end method

.method public getLinkType()I
    .locals 2

    .line 316
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 317
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 320
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 322
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public getLinkUrl()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    .line 144
    return-object v0
.end method

.method public getLinkUrlAppId()Ljava/lang/String;
    .locals 3

    .line 278
    const-string v1, ""

    .line 279
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 281
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 282
    invoke-virtual {v2}, Landroid/net/Uri;->isHierarchical()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 284
    const-string v0, "sns_appid"

    invoke-virtual {v2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 287
    :cond_0
    return-object v1
.end method

.method public getLinkUrlAppVersion()Ljava/lang/String;
    .locals 3

    .line 297
    const-string v1, ""

    .line 298
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 301
    invoke-virtual {v2}, Landroid/net/Uri;->isHierarchical()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    const-string v0, "sns_ver"

    invoke-virtual {v2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 306
    :cond_0
    return-object v1
.end method

.method public getLinkUrlPackageName()Ljava/lang/String;
    .locals 3

    .line 259
    const-string v1, ""

    .line 260
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 262
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 263
    invoke-virtual {v2}, Landroid/net/Uri;->isHierarchical()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    const-string v0, "sns_pkg"

    invoke-virtual {v2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 268
    :cond_0
    return-object v1
.end method

.method public isLinkUrlHasAppInfo()Z
    .locals 6

    .line 236
    const/4 v1, 0x0

    .line 238
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 240
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 241
    invoke-virtual {v2}, Landroid/net/Uri;->isHierarchical()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 243
    const-string v0, "sns_pkg"

    invoke-virtual {v2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 244
    const-string v0, "sns_appid"

    invoke-virtual {v2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 245
    const-string v0, "sns_ver"

    invoke-virtual {v2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 246
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 249
    :cond_1
    :goto_0
    return v1
.end method

.method public setBlobItemList(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;>;)V"
        }
    .end annotation

    .line 203
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 205
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    .line 207
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->addBlobItem(Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;)V

    .line 208
    goto :goto_0

    .line 210
    :cond_0
    return-void
.end method

.method public setLinkAppID(Ljava/lang/String;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppID:Ljava/lang/String;

    .line 172
    return-void
.end method

.method public setLinkAppName(Ljava/lang/String;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppName:Ljava/lang/String;

    .line 161
    return-void
.end method

.method public setLinkAppPackage(Ljava/lang/String;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppPackage:Ljava/lang/String;

    .line 183
    return-void
.end method

.method public setLinkBrief(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkBrief:Ljava/lang/String;

    .line 139
    return-void
.end method

.method public setLinkData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppID:Ljava/lang/String;

    .line 121
    iput-object p2, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppPackage:Ljava/lang/String;

    .line 122
    iput-object p3, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkReqVerCode:Ljava/lang/String;

    .line 123
    return-void
.end method

.method public setLinkReqVerCode(Ljava/lang/String;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkReqVerCode:Ljava/lang/String;

    .line 194
    return-void
.end method

.method public setLinkTitle(Ljava/lang/String;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkTitle:Ljava/lang/String;

    .line 128
    return-void
.end method

.method public setLinkUrl(Ljava/lang/String;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    .line 150
    return-void
.end method

.method public toJson()Ljava/lang/String;
    .locals 7

    .line 392
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 396
    const-string v0, "linkTitle"

    :try_start_0
    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkTitle:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 397
    const-string v0, "linkBrief"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkBrief:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 398
    const-string v0, "linkUrl"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 400
    const-string v0, "linkAppName"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppName:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 402
    const-string v0, "linkAppID"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppID:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 403
    const-string v0, "linkAppPackage"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppPackage:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 404
    const-string v0, "linkReqVerCode"

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkReqVerCode:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 406
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->blobItemList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->blobItemList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 408
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 409
    const/4 v4, 0x0

    .line 410
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->blobItemList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    .line 412
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 413
    const-string v0, "type"

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 414
    const-string v0, "length"

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobLength()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 415
    const-string v0, "width"

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobWitdh()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 416
    const-string v0, "position"

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobPosition()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 418
    const-string v0, "localPath"

    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getLocalBlobDataPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 420
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 421
    goto :goto_0

    .line 423
    :cond_0
    const-string v0, "items"

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 429
    :cond_1
    goto :goto_1

    .line 426
    :catch_0
    move-exception v3

    .line 428
    const-string v0, "SNSLinkMessage"

    const-string v1, "SNSLinkMessage create json Exception!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    :goto_1
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 349
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->writeToParcel(Landroid/os/Parcel;I)V

    .line 350
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkTitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 351
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkBrief:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 352
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 356
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 357
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkAppPackage:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 358
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->linkReqVerCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 360
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->blobItemList:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 362
    return-void
.end method
