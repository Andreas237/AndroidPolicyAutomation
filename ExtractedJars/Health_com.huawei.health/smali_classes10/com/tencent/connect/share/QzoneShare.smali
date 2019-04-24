.class public Lcom/tencent/connect/share/QzoneShare;
.super Lcom/tencent/connect/common/BaseApi;
.source "SourceFile"


# static fields
.field public static final SHARE_TO_QQ_APP_NAME:Ljava/lang/String; = "appName"

.field public static final SHARE_TO_QQ_AUDIO_URL:Ljava/lang/String; = "audio_url"

.field public static final SHARE_TO_QQ_EXT_INT:Ljava/lang/String; = "cflag"

.field public static final SHARE_TO_QQ_EXT_STR:Ljava/lang/String; = "share_qq_ext_str"

.field public static final SHARE_TO_QQ_IMAGE_LOCAL_URL:Ljava/lang/String; = "imageLocalUrl"

.field public static final SHARE_TO_QQ_IMAGE_URL:Ljava/lang/String; = "imageUrl"

.field public static final SHARE_TO_QQ_SITE:Ljava/lang/String; = "site"

.field public static final SHARE_TO_QQ_SUMMARY:Ljava/lang/String; = "summary"

.field public static final SHARE_TO_QQ_TARGET_URL:Ljava/lang/String; = "targetUrl"

.field public static final SHARE_TO_QQ_TITLE:Ljava/lang/String; = "title"

.field public static final SHARE_TO_QZONE_KEY_TYPE:Ljava/lang/String; = "req_type"

.field public static final SHARE_TO_QZONE_TYPE_APP:I = 0x6

.field public static final SHARE_TO_QZONE_TYPE_IMAGE:I = 0x5

.field public static final SHARE_TO_QZONE_TYPE_IMAGE_TEXT:I = 0x1

.field public static final SHARE_TO_QZONE_TYPE_NO_TYPE:I = 0x0


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Z

.field public mViaShareQzoneType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
    .locals 1

    .line 75
    invoke-direct {p0, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 67
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/connect/share/QzoneShare;->mViaShareQzoneType:Ljava/lang/String;

    .line 69
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/connect/share/QzoneShare;->a:Z

    .line 70
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/connect/share/QzoneShare;->b:Z

    .line 71
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/connect/share/QzoneShare;->c:Z

    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/connect/share/QzoneShare;->d:Z

    .line 76
    return-void
.end method

.method private a(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 26

    .line 329
    const-string v0, "openSDK_LOG"

    const-string v1, "doshareToQzone() --start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    new-instance v11, Ljava/lang/StringBuffer;

    const-string v0, "mqqapi://share/to_qzone?src_type=app&version=1&file_type=news"

    invoke-direct {v11, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 332
    const-string v0, "imageUrl"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v12

    .line 333
    const-string v0, "title"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 334
    const-string v0, "summary"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 335
    const-string v0, "targetUrl"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 336
    const-string v0, "audio_url"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 337
    const-string v0, "req_type"

    move-object/from16 v1, p2

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v17

    .line 338
    const-string v0, "appName"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 341
    const-string v0, "cflag"

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v19

    .line 342
    const-string v0, "share_qq_ext_str"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 344
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v21

    .line 345
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v22

    .line 347
    const-string v0, "doshareToQzone"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "openId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, v22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    if-eqz v12, :cond_3

    .line 350
    new-instance v23, Ljava/lang/StringBuffer;

    invoke-direct/range {v23 .. v23}, Ljava/lang/StringBuffer;-><init>()V

    .line 351
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x9

    if-le v0, v1, :cond_0

    const/16 v24, 0x9

    goto :goto_0

    :cond_0
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v24

    .line 352
    :goto_0
    const/16 v25, 0x0

    :goto_1
    move/from16 v0, v25

    move/from16 v1, v24

    if-ge v0, v1, :cond_2

    .line 353
    move/from16 v0, v25

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 354
    add-int/lit8 v0, v24, -0x1

    move/from16 v1, v25

    if-eq v1, v0, :cond_1

    .line 355
    const-string v0, ";"

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 352
    :cond_1
    add-int/lit8 v25, v25, 0x1

    goto :goto_1

    .line 358
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&image_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 360
    :cond_3
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 362
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v13}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 364
    :cond_4
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 366
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v14}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 368
    :cond_5
    invoke-static/range {v21 .. v21}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 369
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&share_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 371
    :cond_6
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 372
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v15}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 374
    :cond_7
    invoke-static/range {v18 .. v18}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 375
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&app_name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static/range {v18 .. v18}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 378
    :cond_8
    invoke-static/range {v22 .. v22}, Lcom/tencent/open/utils/Util;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 379
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&open_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static/range {v22 .. v22}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 383
    :cond_9
    invoke-static/range {v16 .. v16}, Lcom/tencent/open/utils/Util;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 384
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&audioUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static/range {v16 .. v16}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 387
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&req_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static/range {v17 .. v17}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 390
    invoke-static/range {v20 .. v20}, Lcom/tencent/open/utils/Util;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 391
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&share_qq_ext_str="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static/range {v20 .. v20}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 393
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&cflag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 394
    const-string v0, "doshareToQzone, url: "

    invoke-virtual {v11}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    const-string v2, "requireApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const-string v4, "shareToNativeQQ"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/connect/a/a;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;[Ljava/lang/String;)V

    .line 398
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/connect/share/QzoneShare;->mActivityIntent:Landroid/content/Intent;

    .line 399
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/share/QzoneShare;->mActivityIntent:Landroid/content/Intent;

    invoke-virtual {v11}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 401
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/connect/share/QzoneShare;->mActivityIntent:Landroid/content/Intent;

    const-string v1, "pkg_name"

    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 403
    const-string v0, "4.6.0"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_d

    .line 404
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/share/QzoneShare;->hasActivityForIntent()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 405
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    invoke-virtual {v0, v1, v2}, Lcom/tencent/connect/share/QzoneShare;->startAssitActivity(Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V

    .line 407
    :cond_c
    const-string v0, "openSDK_LOG"

    const-string v1, "doShareToQzone() -- QQ Version is < 4.6.0"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 409
    :cond_d
    const-string v0, "openSDK_LOG"

    const-string v1, "doShareToQzone() -- QQ Version is > 4.6.0"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    const-string v0, "shareToQzone"

    move-object/from16 v1, p3

    invoke-static {v0, v1}, Lcom/tencent/open/utils/TemporaryStorage;->set(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v23

    .line 411
    const/4 v0, 0x0

    move-object/from16 v1, v23

    if-eq v0, v1, :cond_e

    .line 412
    const-string v0, "openSDK_LOG"

    const-string v1, "doShareToQzone() -- do listener onCancel()"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/share/QzoneShare;->hasActivityForIntent()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 417
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/16 v2, 0x2778

    invoke-virtual {v0, v1, v2}, Lcom/tencent/connect/share/QzoneShare;->startAssistActivity(Landroid/app/Activity;I)V

    .line 421
    :cond_f
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/connect/share/QzoneShare;->hasActivityForIntent()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 422
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDQQ.SHARETOQZ.XX"

    const-string v4, "11"

    const-string v5, "3"

    const-string v6, "0"

    move-object/from16 v7, p0

    iget-object v7, v7, Lcom/tencent/connect/share/QzoneShare;->mViaShareQzoneType:Ljava/lang/String;

    const-string v8, "0"

    const-string v9, "1"

    const-string v10, "0"

    invoke-virtual/range {v0 .. v10}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "SHARE_CHECK_SDK"

    const-string v3, "1000"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, ""

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    goto :goto_3

    .line 429
    :cond_10
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDQQ.SHARETOQZ.XX"

    const-string v4, "11"

    const-string v5, "3"

    const-string v6, "1"

    move-object/from16 v7, p0

    iget-object v7, v7, Lcom/tencent/connect/share/QzoneShare;->mViaShareQzoneType:Ljava/lang/String;

    const-string v8, "0"

    const-string v9, "1"

    const-string v10, "0"

    invoke-virtual/range {v0 .. v10}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "SHARE_CHECK_SDK"

    const-string v3, "1000"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, "hasActivityForIntent fail"

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 436
    :goto_3
    const-string v0, "openSDK_LOG"

    const-string v1, "doShareToQzone() --end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    return-void
.end method

.method static synthetic a(Lcom/tencent/connect/share/QzoneShare;Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/connect/share/QzoneShare;->a(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    return-void
.end method


# virtual methods
.method public onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    .line 529
    return-void
.end method

.method public releaseResource()V
    .locals 1

    .line 523
    const-string v0, "shareToQzone"

    invoke-static {v0}, Lcom/tencent/open/utils/TemporaryStorage;->remove(Ljava/lang/String;)V

    .line 524
    return-void
.end method

.method public shareToQzone(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 18

    .line 80
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToQzone() -- start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    if-nez p2, :cond_0

    .line 82
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"

    const/4 v2, -0x6

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 84
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "SHARE_CHECK_SDK"

    const-string v3, "1000"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, "\u4f20\u5165\u53c2\u6570\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 86
    return-void

    .line 89
    :cond_0
    const-string v0, "title"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 90
    const-string v0, "summary"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 91
    const-string v0, "targetUrl"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 92
    const-string v0, "imageUrl"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v13

    .line 94
    invoke-static/range {p1 .. p1}, Lcom/tencent/open/utils/Util;->getApplicationLable(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v14

    .line 95
    if-nez v14, :cond_1

    .line 97
    const-string v0, "appName"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    goto :goto_0

    .line 99
    :cond_1
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_2

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    const/16 v2, 0x14

    invoke-virtual {v14, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 104
    :cond_2
    :goto_0
    const-string v0, "req_type"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 106
    packed-switch v15, :pswitch_data_0

    goto :goto_1

    .line 108
    :pswitch_0
    const-string v0, "4"

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/connect/share/QzoneShare;->mViaShareQzoneType:Ljava/lang/String;

    .line 109
    goto :goto_2

    .line 111
    :pswitch_1
    const-string v0, "1"

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/connect/share/QzoneShare;->mViaShareQzoneType:Ljava/lang/String;

    .line 112
    goto :goto_2

    .line 114
    :pswitch_2
    const-string v0, "2"

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/connect/share/QzoneShare;->mViaShareQzoneType:Ljava/lang/String;

    .line 115
    goto :goto_2

    .line 118
    :goto_1
    :pswitch_3
    const-string v0, "1"

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/connect/share/QzoneShare;->mViaShareQzoneType:Ljava/lang/String;

    .line 122
    :goto_2
    packed-switch v15, :pswitch_data_1

    goto/16 :goto_3

    .line 125
    :pswitch_4
    const-string v0, "5.0.0"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_3

    .line 126
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u624bQ\u7248\u672c\u8fc7\u4f4e\uff0c\u5e94\u7528\u5206\u4eab\u53ea\u652f\u6301\u624bQ5.0\u53ca\u5176\u4ee5\u4e0a\u7248\u672c"

    const/16 v2, -0xf

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 127
    const-string v0, "openSDK_LOG"

    const-string v1, "-->shareToQzone, app share is not support below qq5.0."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "SHARE_CHECK_SDK"

    const-string v3, "1000"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, "shareToQzone, app share is not support below qq5.0."

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 131
    return-void

    .line 133
    :cond_3
    const-string v0, "http://fusion.qq.com/cgi-bin/qzapps/unified_jump?appid=%1$s&from=%2$s&isOpenAppID=1"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "mqq"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 134
    const-string v0, "targetUrl"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0, v12}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    goto/16 :goto_5

    .line 137
    :pswitch_5
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tencent/connect/share/QzoneShare;->a:Z

    .line 138
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tencent/connect/share/QzoneShare;->b:Z

    .line 139
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tencent/connect/share/QzoneShare;->c:Z

    .line 140
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tencent/connect/share/QzoneShare;->d:Z

    .line 141
    goto/16 :goto_5

    .line 143
    :pswitch_6
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u6682\u4e0d\u652f\u6301\u7eaf\u56fe\u7247\u5206\u4eab\u5230\u7a7a\u95f4\uff0c\u5efa\u8bae\u4f7f\u7528\u56fe\u6587\u5206\u4eab"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 145
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToQzone() error--end\u6682\u4e0d\u652f\u6301\u7eaf\u56fe\u7247\u5206\u4eab\u5230\u7a7a\u95f4\uff0c\u5efa\u8bae\u4f7f\u7528\u56fe\u6587\u5206\u4eab"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "SHARE_CHECK_SDK"

    const-string v3, "1000"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, "shareToQzone() \u6682\u4e0d\u652f\u6301\u7eaf\u56fe\u7247\u5206\u4eab\u5230\u7a7a\u95f4\uff0c\u5efa\u8bae\u4f7f\u7528\u56fe\u6587\u5206\u4eab"

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 150
    return-void

    .line 157
    :goto_3
    :pswitch_7
    invoke-static {v10}, Lcom/tencent/open/utils/Util;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v11}, Lcom/tencent/open/utils/Util;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 160
    if-eqz v13, :cond_4

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_4

    .line 161
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tencent/connect/share/QzoneShare;->a:Z

    goto :goto_4

    .line 163
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u6765\u81ea"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u7684\u5206\u4eab"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 164
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tencent/connect/share/QzoneShare;->a:Z

    goto :goto_4

    .line 168
    :cond_5
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tencent/connect/share/QzoneShare;->a:Z

    .line 170
    :goto_4
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tencent/connect/share/QzoneShare;->b:Z

    .line 171
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tencent/connect/share/QzoneShare;->c:Z

    .line 172
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/tencent/connect/share/QzoneShare;->d:Z

    .line 178
    :goto_5
    invoke-static {}, Lcom/tencent/open/utils/Util;->hasSDCard()Z

    move-result v0

    if-nez v0, :cond_6

    .line 179
    const-string v0, "4.5.0"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_6

    .line 180
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u5206\u4eab\u56fe\u7247\u5931\u8d25\uff0c\u68c0\u6d4b\u4e0d\u5230SD\u5361!"

    const/4 v2, -0x6

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 182
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToQzone() sdcard is null--end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "SHARE_CHECK_SDK"

    const-string v3, "1000"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, "\u5206\u4eab\u56fe\u7247\u5931\u8d25\uff0c\u68c0\u6d4b\u4e0d\u5230SD\u5361!"

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 187
    return-void

    .line 191
    :cond_6
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/tencent/connect/share/QzoneShare;->a:Z

    if-eqz v0, :cond_8

    .line 192
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 193
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "targetUrl\u4e3a\u5fc5\u586b\u9879\uff0c\u8bf7\u8865\u5145\u540e\u5206\u4eab"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 195
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToQzone() targetUrl null error--end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "SHARE_CHECK_SDK"

    const-string v3, "1000"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, "targetUrl\u4e3a\u5fc5\u586b\u9879\uff0c\u8bf7\u8865\u5145\u540e\u5206\u4eab"

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 199
    return-void

    .line 201
    :cond_7
    invoke-static {v12}, Lcom/tencent/open/utils/Util;->isValidUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 202
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "targetUrl\u6709\u8bef"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 204
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToQzone() targetUrl error--end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "SHARE_CHECK_SDK"

    const-string v3, "1000"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, "targetUrl\u6709\u8bef"

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 208
    return-void

    .line 212
    :cond_8
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/tencent/connect/share/QzoneShare;->b:Z

    if-eqz v0, :cond_9

    .line 213
    const-string v10, ""

    .line 214
    const-string v11, ""

    .line 215
    const-string v0, "title"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    const-string v0, "summary"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_6

    .line 218
    :cond_9
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/tencent/connect/share/QzoneShare;->c:Z

    if-eqz v0, :cond_a

    invoke-static {v10}, Lcom/tencent/open/utils/Util;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 219
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "title\u4e0d\u80fd\u4e3a\u7a7a!"

    const/4 v2, -0x6

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 221
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToQzone() title is null--end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "SHARE_CHECK_SDK"

    const-string v3, "1000"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, "shareToQzone() title is null"

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 225
    return-void

    .line 228
    :cond_a
    invoke-static {v10}, Lcom/tencent/open/utils/Util;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xc8

    if-le v0, v1, :cond_b

    .line 230
    const/16 v0, 0xc8

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v10, v0, v1, v2}, Lcom/tencent/open/utils/Util;->subString(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 231
    const-string v0, "title"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    :cond_b
    invoke-static {v11}, Lcom/tencent/open/utils/Util;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x258

    if-le v0, v1, :cond_c

    .line 235
    const/16 v0, 0x258

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v11, v0, v1, v2}, Lcom/tencent/open/utils/Util;->subString(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 236
    const-string v0, "summary"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    :cond_c
    :goto_6
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 241
    const-string v0, "appName"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    :cond_d
    if-eqz v13, :cond_e

    if-eqz v13, :cond_f

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_f

    .line 246
    :cond_e
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/tencent/connect/share/QzoneShare;->d:Z

    if-eqz v0, :cond_13

    .line 247
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u7eaf\u56fe\u5206\u4eab\uff0cimageUrl \u4e0d\u80fd\u4e3a\u7a7a"

    const/4 v2, -0x6

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 249
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToQzone() imageUrl is null -- end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "SHARE_CHECK_SDK"

    const-string v3, "1000"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, "shareToQzone() imageUrl is null"

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 253
    return-void

    .line 256
    :cond_f
    const/16 v16, 0x0

    :goto_7
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v0

    move/from16 v1, v16

    if-ge v1, v0, :cond_11

    .line 257
    move/from16 v0, v16

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Ljava/lang/String;

    .line 258
    invoke-static/range {v17 .. v17}, Lcom/tencent/open/utils/Util;->isValidUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_10

    invoke-static/range {v17 .. v17}, Lcom/tencent/open/utils/Util;->isValidPath(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 260
    move/from16 v0, v16

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 256
    :cond_10
    add-int/lit8 v16, v16, 0x1

    goto :goto_7

    .line 263
    :cond_11
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_12

    .line 264
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u975e\u6cd5\u7684\u56fe\u7247\u5730\u5740!"

    const/4 v2, -0x6

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 266
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToQzone() MSG_PARAM_IMAGE_URL_FORMAT_ERROR--end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "SHARE_CHECK_SDK"

    const-string v3, "1000"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, "shareToQzone() \u975e\u6cd5\u7684\u56fe\u7247\u5730\u5740!"

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 271
    return-void

    .line 273
    :cond_12
    const-string v0, "imageUrl"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0, v13}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 276
    :cond_13
    const-string v0, "4.6.0"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_14

    .line 278
    new-instance v0, Lcom/tencent/connect/share/QzoneShare$1;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p1

    move-object/from16 v4, p3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/tencent/connect/share/QzoneShare$1;-><init>(Lcom/tencent/connect/share/QzoneShare;Landroid/os/Bundle;Landroid/app/Activity;Lcom/tencent/tauth/IUiListener;)V

    move-object/from16 v1, p1

    invoke-static {v1, v13, v0}, Lcom/tencent/connect/share/a;->a(Landroid/content/Context;Ljava/util/ArrayList;Lcom/tencent/open/utils/AsynLoadImgBack;)V

    goto/16 :goto_8

    .line 293
    :cond_14
    const-string v0, "4.2.0"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_18

    const-string v0, "4.6.0"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_18

    .line 296
    new-instance v0, Lcom/tencent/connect/share/QQShare;

    move-object/from16 v1, p1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-direct {v0, v1, v2}, Lcom/tencent/connect/share/QQShare;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V

    move-object/from16 v16, v0

    .line 297
    if-eqz v13, :cond_16

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_16

    .line 298
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Ljava/lang/String;

    .line 300
    const/4 v0, 0x5

    if-ne v15, v0, :cond_15

    .line 301
    invoke-static/range {v17 .. v17}, Lcom/tencent/open/utils/Util;->fileExists(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_15

    .line 302
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u624bQ\u7248\u672c\u8fc7\u4f4e\uff0c\u7eaf\u56fe\u5206\u4eab\u4e0d\u652f\u6301\u7f51\u8def\u56fe\u7247"

    const/4 v2, -0x6

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 304
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToQzone()\u624bQ\u7248\u672c\u8fc7\u4f4e\uff0c\u7eaf\u56fe\u5206\u4eab\u4e0d\u652f\u6301\u7f51\u8def\u56fe\u7247"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "SHARE_CHECK_SDK"

    const-string v3, "1000"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, "shareToQzone()\u624bQ\u7248\u672c\u8fc7\u4f4e\uff0c\u7eaf\u56fe\u5206\u4eab\u4e0d\u652f\u6301\u7f51\u8def\u56fe\u7247"

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 309
    return-void

    .line 313
    :cond_15
    const-string v0, "imageLocalUrl"

    move-object/from16 v1, p2

    move-object/from16 v2, v17

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    :cond_16
    const-string v0, "4.5.0"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_17

    .line 317
    const-string v0, "cflag"

    move-object/from16 v1, p2

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 319
    :cond_17
    move-object/from16 v0, v16

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/connect/share/QQShare;->shareToQQ(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 320
    goto :goto_8

    .line 322
    :cond_18
    new-instance v0, Lcom/tencent/open/TDialog;

    const-string v2, ""

    const-string v1, ""

    move-object/from16 v3, p0

    invoke-virtual {v3, v1}, Lcom/tencent/connect/share/QzoneShare;->getCommonDownloadQQUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v1, p0

    iget-object v5, v1, Lcom/tencent/connect/share/QzoneShare;->mToken:Lcom/tencent/connect/auth/QQToken;

    move-object/from16 v1, p1

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/tencent/open/TDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Lcom/tencent/connect/auth/QQToken;)V

    invoke-virtual {v0}, Lcom/tencent/open/TDialog;->show()V

    .line 324
    :goto_8
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToQzone() --end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_4
    .end packed-switch
.end method
