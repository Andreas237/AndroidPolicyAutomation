.class public Lcom/tencent/open/GameAppOperation;
.super Lcom/tencent/connect/common/BaseApi;
.source "SourceFile"


# static fields
.field public static final GAME_FRIEND_ADD_MESSAGE:Ljava/lang/String; = "add_msg"

.field public static final GAME_FRIEND_LABEL:Ljava/lang/String; = "friend_label"

.field public static final GAME_FRIEND_OPENID:Ljava/lang/String; = "fopen_id"

.field public static final GAME_SIGNATURE:Ljava/lang/String; = "signature"

.field public static final GAME_UNION_ID:Ljava/lang/String; = "unionid"

.field public static final GAME_UNION_NAME:Ljava/lang/String; = "union_name"

.field public static final GAME_ZONE_ID:Ljava/lang/String; = "zoneid"

.field public static final PIC_SYMBOLE:C = '\u0014'

.field public static final QQFAV_DATALINE_APPNAME:Ljava/lang/String; = "app_name"

.field public static final QQFAV_DATALINE_AUDIOURL:Ljava/lang/String; = "audioUrl"

.field public static final QQFAV_DATALINE_DESCRIPTION:Ljava/lang/String; = "description"

.field public static final QQFAV_DATALINE_FILEDATA:Ljava/lang/String; = "file_data"

.field public static final QQFAV_DATALINE_IMAGEURL:Ljava/lang/String; = "image_url"

.field public static final QQFAV_DATALINE_OPENID:Ljava/lang/String; = "open_id"

.field public static final QQFAV_DATALINE_REQTYPE:Ljava/lang/String; = "req_type"

.field public static final QQFAV_DATALINE_SHAREID:Ljava/lang/String; = "share_id"

.field public static final QQFAV_DATALINE_SRCTYPE:Ljava/lang/String; = "src_type"

.field public static final QQFAV_DATALINE_TITLE:Ljava/lang/String; = "title"

.field public static final QQFAV_DATALINE_TYPE_AUDIO:I = 0x2

.field public static final QQFAV_DATALINE_TYPE_DEFAULT:I = 0x1

.field public static final QQFAV_DATALINE_TYPE_IMAGE_TEXT:I = 0x5

.field public static final QQFAV_DATALINE_TYPE_TEXT:I = 0x6

.field public static final QQFAV_DATALINE_URL:Ljava/lang/String; = "url"

.field public static final QQFAV_DATALINE_VERSION:Ljava/lang/String; = "version"

.field public static final SHARE_PRIZE_ACTIVITY_ID:Ljava/lang/String; = "activityid"

.field public static final SHARE_PRIZE_IMAGE_URL:Ljava/lang/String; = "imageUrl"

.field public static final SHARE_PRIZE_SHARE_ID:Ljava/lang/String; = "shareid"

.field public static final SHARE_PRIZE_SHARE_ID_LIST:Ljava/lang/String; = "shareid_list"

.field public static final SHARE_PRIZE_SUMMARY:Ljava/lang/String; = "summary"

.field public static final SHARE_PRIZE_SUMMARY_MAX_LENGTH:I = 0x3c

.field public static final SHARE_PRIZE_TARGET_URL:Ljava/lang/String; = "targetUrl"

.field public static final SHARE_PRIZE_TITLE:Ljava/lang/String; = "title"

.field public static final SHARE_PRIZE_TITLE_MAX_LENGTH:I = 0x2d

.field public static final TROOPBAR_ID:Ljava/lang/String; = "troopbar_id"


# direct methods
.method public constructor <init>(Lcom/tencent/connect/auth/QQToken;)V
    .locals 0

    .line 126
    invoke-direct {p0, p1}, Lcom/tencent/connect/common/BaseApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 127
    return-void
.end method

.method private a()Landroid/os/Bundle;
    .locals 6

    .line 948
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 949
    const/4 v0, 0x0

    return-object v0

    .line 951
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 952
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v3

    .line 953
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v4

    .line 954
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;

    move-result-object v5

    .line 955
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 956
    :cond_1
    const-string v0, "openSDK_LOG.GameAppOper"

    const-string v1, "composeLoginStateParams fail, accesstoken or openid or appid is null"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 957
    const/4 v0, 0x0

    return-object v0

    .line 959
    :cond_2
    const-string v0, "appid"

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 960
    const-string v0, "openid"

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 961
    const-string v0, "accesstoken"

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 962
    return-object v2
.end method

.method static synthetic a(Lcom/tencent/open/GameAppOperation;)Landroid/os/Bundle;
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/tencent/open/GameAppOperation;->a()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/app/Activity;)V
    .locals 1

    .line 1091
    const-string v0, ""

    invoke-direct {p0, p1, v0}, Lcom/tencent/open/GameAppOperation;->a(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1092
    return-void
.end method

.method private a(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 6

    .line 1095
    new-instance v0, Lcom/tencent/open/TDialog;

    const-string v2, ""

    invoke-virtual {p0, p2}, Lcom/tencent/open/GameAppOperation;->getCommonDownloadQQUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    move-object v1, p1

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/tencent/open/TDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Lcom/tencent/connect/auth/QQToken;)V

    invoke-virtual {v0}, Lcom/tencent/open/TDialog;->show()V

    .line 1096
    return-void
.end method

.method private a(Ljava/lang/String;ILjava/lang/String;)V
    .locals 12

    .line 1099
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1100
    :cond_0
    const-string v0, "openSDK_LOG"

    const-string v1, "reportForVia() error: reportType or result is null"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1101
    return-void

    .line 1103
    :cond_1
    const-string v11, ""

    .line 1104
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 1106
    :pswitch_0
    const-string v11, "5"

    .line 1107
    goto :goto_1

    .line 1109
    :pswitch_1
    const-string v11, "1"

    .line 1110
    goto :goto_1

    .line 1112
    :pswitch_2
    const-string v11, "3"

    .line 1113
    goto :goto_1

    .line 1115
    :pswitch_3
    const-string v11, "6"

    .line 1116
    goto :goto_1

    .line 1118
    :goto_0
    :pswitch_4
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GameAppOperation -- reportForVia() error: unknow type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1120
    return-void

    .line 1122
    :goto_1
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "2"

    move-object v4, p1

    const-string v5, "28"

    move-object v6, p3

    move-object v7, v11

    const-string v8, "0"

    const-string v9, ""

    const-string v10, ""

    invoke-virtual/range {v0 .. v10}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1125
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)Z
    .locals 15

    .line 1010
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, p3

    if-ne v0, v1, :cond_1

    .line 1011
    :cond_0
    const-string v0, "openSDK_LOG"

    const-string v1, "activity or params or listener is null!"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1012
    const/4 v0, 0x0

    return v0

    .line 1014
    :cond_1
    const-string v0, "req_type"

    move-object/from16 v1, p2

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 1015
    const-string v0, "app_name"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1016
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1017
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u4e0d\u53ef\u4ee5\u4e3a\u7a7a: app_name"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 1018
    const/4 v0, 0x0

    return v0

    .line 1020
    :cond_2
    const-string v0, "description"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1021
    const-string v0, "url"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1022
    const-string v0, "audioUrl"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1023
    const-string v0, "image_url"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1024
    const-string v0, "file_data"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v10

    .line 1025
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_1

    .line 1027
    :pswitch_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1028
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u4e0d\u53ef\u4ee5\u4e3a\u7a7a: description is null"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 1030
    const/4 v0, 0x0

    return v0

    .line 1034
    :pswitch_1
    const/4 v0, 0x0

    if-eq v0, v10, :cond_3

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 1035
    :cond_3
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u4e0d\u53ef\u4ee5\u4e3a\u7a7a: fill_data is null"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 1037
    const/4 v0, 0x0

    return v0

    .line 1041
    :cond_4
    const-string v11, ""

    .line 1042
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v12

    .line 1043
    const/4 v13, 0x0

    :goto_0
    if-ge v13, v12, :cond_6

    .line 1044
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    .line 1045
    const-string v0, "/"

    invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1046
    new-instance v0, Ljava/io/File;

    move-object v1, v11

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v14, v0

    .line 1047
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1049
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u975e\u6cd5\u7684\u56fe\u7247\u5730\u5740!"

    const/4 v2, -0x6

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 1051
    const/4 v0, 0x0

    return v0

    .line 1043
    :cond_5
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 1056
    :cond_6
    goto :goto_2

    .line 1058
    :pswitch_2
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1059
    :cond_7
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u4e0d\u53ef\u4ee5\u4e3a\u7a7a: image_url or url is null"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 1062
    const/4 v0, 0x0

    return v0

    .line 1066
    :pswitch_3
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1067
    :cond_8
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u4e0d\u53ef\u4ee5\u4e3a\u7a7a: image_url or url or audioUrl is null"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 1069
    const/4 v0, 0x0

    return v0

    .line 1073
    :goto_1
    :pswitch_4
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!: unknow req_type"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 1075
    const/4 v0, 0x0

    return v0

    .line 1078
    :cond_9
    :goto_2
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic b(Lcom/tencent/open/GameAppOperation;)Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method

.method static synthetic c(Lcom/tencent/open/GameAppOperation;)Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method

.method static synthetic d(Lcom/tencent/open/GameAppOperation;)Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method

.method static synthetic e(Lcom/tencent/open/GameAppOperation;)Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method

.method static synthetic f(Lcom/tencent/open/GameAppOperation;)Lcom/tencent/connect/auth/QQToken;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    return-object v0
.end method


# virtual methods
.method public addToQQFavorites(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 21

    .line 320
    const-string v0, "openSDK_LOG"

    const-string v1, "addToQQFavorites() -- start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    const-string v0, "req_type"

    move-object/from16 v1, p2

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 322
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/open/GameAppOperation;->a(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 323
    const-string v0, "21"

    const-string v1, "1"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v6, v1}, Lcom/tencent/open/GameAppOperation;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 324
    return-void

    .line 327
    :cond_0
    new-instance v7, Ljava/lang/StringBuffer;

    const-string v0, "mqqapi://share/to_qqfav?src_type=app&version=1&file_type=news"

    invoke-direct {v7, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 328
    const-string v0, "image_url"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 329
    const-string v0, "title"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 330
    const-string v0, "description"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 331
    const-string v0, "url"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 332
    const-string v0, "audioUrl"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 333
    invoke-static/range {p1 .. p1}, Lcom/tencent/open/utils/Util;->getApplicationLable(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    .line 334
    if-nez v13, :cond_1

    .line 336
    const-string v0, "app_name"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 338
    :cond_1
    const-string v0, "file_data"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v14

    .line 340
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v15

    .line 341
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v16

    .line 343
    const-string v0, "addToQQFavorites"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "openId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 346
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&image_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v8}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 348
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v14, :cond_5

    .line 349
    new-instance v17, Ljava/lang/StringBuffer;

    invoke-direct/range {v17 .. v17}, Ljava/lang/StringBuffer;-><init>()V

    .line 350
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v18

    .line 351
    const/16 v19, 0x0

    :goto_0
    move/from16 v0, v19

    move/from16 v1, v18

    if-ge v0, v1, :cond_4

    .line 353
    move/from16 v0, v19

    :try_start_0
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 359
    goto :goto_1

    .line 354
    :catch_0
    move-exception v20

    .line 356
    invoke-virtual/range {v20 .. v20}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    .line 357
    const-string v0, "openSDK_LOG"

    const-string v1, "UnsupportedEncodingException"

    move-object/from16 v2, v20

    invoke-static {v0, v1, v2}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 358
    move/from16 v0, v19

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 360
    :goto_1
    add-int/lit8 v0, v18, -0x1

    move/from16 v1, v19

    if-eq v1, v0, :cond_3

    .line 361
    const-string v0, ";"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 351
    :cond_3
    add-int/lit8 v19, v19, 0x1

    goto :goto_0

    .line 364
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&file_data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

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

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 366
    :cond_5
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 367
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v9}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 369
    :cond_6
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 370
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 372
    :cond_7
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 373
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&share_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 375
    :cond_8
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 376
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v11}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 378
    :cond_9
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 379
    move-object/from16 v17, v13

    .line 380
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_a

    .line 381
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    const/16 v2, 0x14

    invoke-virtual {v13, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 383
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&app_name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static/range {v17 .. v17}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 386
    :cond_b
    invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 387
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&open_id="

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

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 391
    :cond_c
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 392
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&audioUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v12}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 395
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&req_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

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

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 397
    const-string v0, "addToQQFavorites url: "

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    const-string v2, "requireApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const-string v4, "addToQQFavorites"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/connect/a/a;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;[Ljava/lang/String;)V

    .line 401
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    .line 402
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 404
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    const-string v1, "pkg_name"

    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 406
    const-string v0, "addToQQFavorites"

    move-object/from16 v1, p3

    invoke-static {v0, v1}, Lcom/tencent/open/utils/TemporaryStorage;->set(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    .line 407
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_e

    .line 408
    move-object/from16 v0, v17

    check-cast v0, Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V

    .line 412
    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/open/GameAppOperation;->hasActivityForIntent()Z

    move-result v0

    if-eqz v0, :cond_f

    const-string v0, "5.2.0"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_f

    .line 414
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 415
    const-string v0, "21"

    const-string v1, "0"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v6, v1}, Lcom/tencent/open/GameAppOperation;->a(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 420
    goto :goto_2

    .line 416
    :catch_1
    move-exception v18

    .line 417
    const-string v0, "openSDK_LOG"

    const-string v1, "-->addToQQFavorites, start activity exception."

    move-object/from16 v2, v18

    invoke-static {v0, v1, v2}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 418
    const-string v0, "21"

    const-string v1, "1"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v6, v1}, Lcom/tencent/open/GameAppOperation;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 419
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/tencent/open/GameAppOperation;->a(Landroid/app/Activity;)V

    .line 420
    goto :goto_2

    .line 422
    :cond_f
    const-string v0, "openSDK_LOG"

    const-string v1, "-->addToQQFavorites, there is no activity, show download page."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    const-string v0, "21"

    const-string v1, "1"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v6, v1}, Lcom/tencent/open/GameAppOperation;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 424
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/tencent/open/GameAppOperation;->a(Landroid/app/Activity;)V

    .line 426
    :goto_2
    const-string v0, "openSDK_LOG"

    const-string v1, "addToQQFavorites() --end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    return-void
.end method

.method public bindQQGroup(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 18

    .line 214
    const-string v0, "openSDK_LOG"

    const-string v1, "-->bindQQGroup()  -- start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 216
    const-string v0, "openSDK_LOG"

    const-string v1, "-->bindQQGroup, activity is empty."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.BINDGROUP.XX"

    const-string v4, "18"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    return-void

    .line 221
    :cond_0
    if-nez p2, :cond_1

    .line 222
    const-string v0, "Bundle\u53c2\u6570\u4e3a\u7a7a"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 223
    const-string v0, "openSDK_LOG"

    const-string v1, "-->bindQQGroup, params is empty."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.BINDGROUP.XX"

    const-string v4, "18"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    return-void

    .line 229
    :cond_1
    invoke-static/range {p1 .. p1}, Lcom/tencent/open/utils/Util;->getApplicationLable(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 230
    new-instance v8, Ljava/lang/StringBuffer;

    const-string v0, "mqqapi://gamesdk/bind_group?src_type=app&version=1"

    invoke-direct {v8, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 231
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 232
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&app_name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v7}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 235
    :cond_2
    const-string v0, "unionid"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 236
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 237
    const-string v0, "\u6e38\u620f\u516c\u4f1aID\u4e3a\u7a7a"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 238
    const-string v0, "openSDK_LOG"

    const-string v1, "-->bindQQGroup, game union id is empty."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.BINDGROUP.XX"

    const-string v4, "18"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    return-void

    .line 243
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&unionid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v9}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 245
    const-string v0, "union_name"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 246
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 247
    const-string v0, "\u6e38\u620f\u516c\u4f1a\u540d\u79f0\u4e3a\u7a7a"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 248
    const-string v0, "openSDK_LOG"

    const-string v1, "-->bindQQGroup, game union name is empty."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.BINDGROUP.XX"

    const-string v4, "18"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    return-void

    .line 253
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&union_name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 255
    const-string v0, "zoneid"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 256
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 257
    const-string v0, "\u6e38\u620f\u533a\u57dfID\u4e3a\u7a7a"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 258
    const-string v0, "openSDK_LOG"

    const-string v1, "-->bindQQGroup, game zone id  is empty."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.BINDGROUP.XX"

    const-string v4, "18"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    return-void

    .line 263
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&zoneid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v11}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 265
    const-string v0, "signature"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 266
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 267
    const-string v0, "\u6e38\u620f\u7b7e\u540d\u4e3a\u7a7a"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 268
    const-string v0, "openSDK_LOG"

    const-string v1, "-->bindQQGroup, game signature is empty."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.BINDGROUP.XX"

    const-string v4, "18"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    return-void

    .line 273
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&signature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v12}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 275
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v13

    .line 276
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 277
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&openid="

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

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 279
    :cond_7
    const-string v0, "Openid\u4e3a\u7a7a"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 280
    const-string v0, "openSDK_LOG"

    const-string v1, "-->bindQQGroup, openid is empty."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.BINDGROUP.XX"

    const-string v4, "18"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    return-void

    .line 286
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/open/GameAppOperation;->composeActivityParams()Landroid/os/Bundle;

    move-result-object v14

    .line 287
    invoke-virtual {v14}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/lang/String;

    .line 288
    move-object/from16 v0, v16

    invoke-virtual {v14, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 289
    invoke-static/range {v17 .. v17}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v14, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    goto :goto_1

    .line 291
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v14}, Lcom/tencent/open/utils/Util;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 293
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->bindQQGroup, url: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    .line 295
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 297
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/open/GameAppOperation;->hasActivityForIntent()Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "5.1.0"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_9

    .line 299
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 300
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.BINDGROUP.XX"

    const-string v4, "18"

    const-string v5, "18"

    const-string v6, "0"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 309
    goto :goto_2

    .line 303
    :catch_0
    move-exception v15

    .line 304
    const-string v0, "openSDK_LOG"

    const-string v1, "-->bind group, start activity exception."

    invoke-static {v0, v1, v15}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 305
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.BINDGROUP.XX"

    const-string v4, "18"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/tencent/open/GameAppOperation;->a(Landroid/app/Activity;)V

    .line 309
    goto :goto_2

    .line 311
    :cond_9
    const-string v0, "openSDK_LOG"

    const-string v1, "-->bind group, there is no activity, show download page."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.BINDGROUP.XX"

    const-string v4, "18"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/tencent/open/GameAppOperation;->a(Landroid/app/Activity;)V

    .line 316
    :goto_2
    const-string v0, "openSDK_LOG"

    const-string v1, "-->bindQQGroup()  -- end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    return-void
.end method

.method public exchangePrize(Landroid/content/Context;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 9

    .line 871
    const/4 v2, -0x5

    .line 872
    const-string v3, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!"

    .line 874
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 875
    const-string v0, "openSDK_LOG.GameAppOper"

    const-string v1, "listener is null!"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 876
    return-void

    .line 879
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 880
    const-string v4, "params is null!"

    .line 881
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v4}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 882
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 883
    return-void

    .line 886
    :cond_1
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->isSessionValid()Z

    move-result v0

    if-nez v0, :cond_3

    .line 887
    :cond_2
    const-string v4, "exchangePrize failed, auth token is illegal."

    .line 888
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v4}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 889
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 890
    return-void

    .line 892
    :cond_3
    if-nez p1, :cond_4

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_4

    .line 893
    const-string v4, "exchangePrize failed, context is null."

    .line 894
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v4}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 895
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 896
    return-void

    .line 899
    :cond_4
    const-string v0, "shareid_list"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 900
    const/4 v0, 0x0

    if-ne v0, v4, :cond_5

    .line 901
    const-string v5, "exchangePrize failed, shareid_list is empty."

    .line 902
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v5}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 903
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v2, v3, v5}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 904
    return-void

    .line 906
    :cond_5
    new-instance v5, Ljava/lang/StringBuffer;

    const-string v0, ""

    invoke-direct {v5, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 907
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 908
    const-string v7, ""

    .line 909
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v6, :cond_7

    .line 910
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 911
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 912
    invoke-virtual {v5, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 913
    add-int/lit8 v0, v6, -0x1

    if-ge v8, v0, :cond_6

    .line 914
    const-string v0, ","

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 909
    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 918
    :cond_7
    if-nez p1, :cond_8

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v8

    goto :goto_1

    :cond_8
    move-object v8, p1

    .line 919
    :goto_1
    new-instance v0, Lcom/tencent/open/GameAppOperation$3;

    invoke-direct {v0, p0, p3, v5, v8}, Lcom/tencent/open/GameAppOperation$3;-><init>(Lcom/tencent/open/GameAppOperation;Lcom/tencent/tauth/IUiListener;Ljava/lang/StringBuffer;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/tencent/open/utils/ThreadManager;->executeOnSubThread(Ljava/lang/Runnable;)V

    .line 945
    return-void
.end method

.method public isActivityAvailable(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
    .locals 4

    .line 966
    const/4 v1, -0x5

    .line 967
    const-string v2, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!"

    .line 968
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 969
    const-string v3, "isActivityAvailable failed, activityId is null."

    .line 970
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v3}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 971
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 972
    return-void

    .line 974
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->isSessionValid()Z

    move-result v0

    if-nez v0, :cond_2

    .line 975
    :cond_1
    const-string v3, "exchangePrize failed, auth token is illegal."

    .line 976
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v3}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 977
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 978
    return-void

    .line 980
    :cond_2
    new-instance v0, Lcom/tencent/open/GameAppOperation$4;

    invoke-direct {v0, p0, p3, p2, p1}, Lcom/tencent/open/GameAppOperation$4;-><init>(Lcom/tencent/open/GameAppOperation;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;Landroid/app/Activity;)V

    invoke-static {v0}, Lcom/tencent/open/utils/ThreadManager;->executeOnSubThread(Ljava/lang/Runnable;)V

    .line 1007
    return-void
.end method

.method public makeFriend(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 15

    .line 130
    const-string v0, "openSDK_LOG"

    const-string v1, "-->makeFriend()  -- start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    if-nez p2, :cond_0

    .line 132
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDQQ.MAKEAFRIEND.XX"

    const-string v4, "14"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    return-void

    .line 137
    :cond_0
    const-string v0, "fopen_id"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 138
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 139
    const-string v0, "openSDK_LOG"

    const-string v1, "-->make friend, fOpenid is empty."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDQQ.MAKEAFRIEND.XX"

    const-string v4, "14"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    return-void

    .line 146
    :cond_1
    const-string v0, "friend_label"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 147
    const-string v0, "add_msg"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 148
    invoke-static/range {p1 .. p1}, Lcom/tencent/open/utils/Util;->getApplicationLable(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    .line 150
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v11

    .line 151
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v12

    .line 153
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->make friend, fOpenid: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " | label: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " | message: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " | openid: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " | appid:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    new-instance v13, Ljava/lang/StringBuffer;

    const-string v0, "mqqapi://gamesdk/add_friend?src_type=app&version=1"

    invoke-direct {v13, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&fopen_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v7}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 158
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 159
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&open_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v11}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 161
    :cond_2
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&app_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 164
    :cond_3
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&friend_label="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v8}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 167
    :cond_4
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&add_msg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v9}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 170
    :cond_5
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&app_name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 175
    :cond_6
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->make friend, url: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v13}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    .line 177
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    invoke-virtual {v13}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 180
    invoke-virtual {p0}, Lcom/tencent/open/GameAppOperation;->hasActivityForIntent()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "5.1.0"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_7

    .line 182
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 183
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDQQ.MAKEAFRIEND.XX"

    const-string v4, "14"

    const-string v5, "18"

    const-string v6, "0"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    goto :goto_0

    .line 187
    :catch_0
    move-exception v14

    .line 188
    const-string v0, "openSDK_LOG"

    const-string v1, "-->make friend, start activity exception."

    invoke-static {v0, v1, v14}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 189
    move-object/from16 v0, p1

    invoke-direct {p0, v0}, Lcom/tencent/open/GameAppOperation;->a(Landroid/app/Activity;)V

    .line 190
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDQQ.MAKEAFRIEND.XX"

    const-string v4, "14"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    goto :goto_0

    .line 195
    :cond_7
    const-string v0, "openSDK_LOG"

    const-string v1, "-->make friend, there is no activity."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    move-object/from16 v0, p1

    invoke-direct {p0, v0}, Lcom/tencent/open/GameAppOperation;->a(Landroid/app/Activity;)V

    .line 197
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDQQ.MAKEAFRIEND.XX"

    const-string v4, "14"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    :goto_0
    const-string v0, "openSDK_LOG"

    const-string v1, "-->makeFriend()  -- end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    return-void
.end method

.method public queryUnexchangePrize(Landroid/content/Context;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 6

    .line 807
    const/4 v2, -0x5

    .line 808
    const-string v3, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!"

    .line 809
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 810
    const-string v0, "openSDK_LOG.GameAppOper"

    const-string v1, "listener is null!"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 811
    return-void

    .line 814
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 815
    const-string v4, "params is null!"

    .line 816
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v4}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 817
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 818
    return-void

    .line 821
    :cond_1
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->isSessionValid()Z

    move-result v0

    if-nez v0, :cond_3

    .line 822
    :cond_2
    const-string v4, "queryUnexchangePrize failed, auth token is illegal."

    .line 823
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v4}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 824
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 825
    return-void

    .line 827
    :cond_3
    if-nez p1, :cond_4

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_4

    .line 828
    const-string v4, "queryUnexchangePrize failed, context is null."

    .line 829
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v4}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 830
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 831
    return-void

    .line 834
    :cond_4
    const-string v0, "activityid"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 835
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 836
    const-string v5, "queryUnexchangePrize failed, activityId is empty."

    .line 837
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v5}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 838
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v2, v3, v5}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 839
    return-void

    .line 841
    :cond_5
    if-nez p1, :cond_6

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v5

    goto :goto_0

    :cond_6
    move-object v5, p1

    .line 842
    :goto_0
    new-instance v0, Lcom/tencent/open/GameAppOperation$2;

    invoke-direct {v0, p0, p3, p2, v5}, Lcom/tencent/open/GameAppOperation$2;-><init>(Lcom/tencent/open/GameAppOperation;Lcom/tencent/tauth/IUiListener;Landroid/os/Bundle;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/tencent/open/utils/ThreadManager;->executeOnSubThread(Ljava/lang/Runnable;)V

    .line 868
    return-void
.end method

.method public releaseResource()V
    .locals 2

    .line 1083
    const-string v0, "openSDK_LOG"

    const-string v1, "releaseResource() -- start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1084
    const-string v0, "sendToMyComputer"

    invoke-static {v0}, Lcom/tencent/open/utils/TemporaryStorage;->remove(Ljava/lang/String;)V

    .line 1085
    const-string v0, "addToQQFavorites"

    invoke-static {v0}, Lcom/tencent/open/utils/TemporaryStorage;->remove(Ljava/lang/String;)V

    .line 1086
    const-string v0, "shareToTroopBar"

    invoke-static {v0}, Lcom/tencent/open/utils/TemporaryStorage;->remove(Ljava/lang/String;)V

    .line 1087
    const-string v0, "openSDK_LOG"

    const-string v1, "releaseResource() -- end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1088
    return-void
.end method

.method public sendToMyComputer(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 21

    .line 431
    const-string v0, "openSDK_LOG"

    const-string v1, "sendToMyComputer() --start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    const-string v0, "req_type"

    move-object/from16 v1, p2

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 433
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/open/GameAppOperation;->a(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 434
    const-string v0, "22"

    const-string v1, "1"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v6, v1}, Lcom/tencent/open/GameAppOperation;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 435
    return-void

    .line 438
    :cond_0
    new-instance v7, Ljava/lang/StringBuffer;

    const-string v0, "mqqapi://share/to_qqdataline?src_type=app&version=1&file_type=news"

    invoke-direct {v7, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 439
    const-string v0, "image_url"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 440
    const-string v0, "title"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 441
    const-string v0, "description"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 442
    const-string v0, "url"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 443
    const-string v0, "audioUrl"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 444
    invoke-static/range {p1 .. p1}, Lcom/tencent/open/utils/Util;->getApplicationLable(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    .line 445
    if-nez v13, :cond_1

    .line 447
    const-string v0, "app_name"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 449
    :cond_1
    const-string v0, "file_data"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v14

    .line 451
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v15

    .line 452
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v16

    .line 454
    const-string v0, "sendToMyComputer"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "openId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 456
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 457
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&image_url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v8}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 459
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v14, :cond_5

    .line 460
    new-instance v17, Ljava/lang/StringBuffer;

    invoke-direct/range {v17 .. v17}, Ljava/lang/StringBuffer;-><init>()V

    .line 461
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v18

    .line 462
    const/16 v19, 0x0

    :goto_0
    move/from16 v0, v19

    move/from16 v1, v18

    if-ge v0, v1, :cond_4

    .line 464
    move/from16 v0, v19

    :try_start_0
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 470
    goto :goto_1

    .line 465
    :catch_0
    move-exception v20

    .line 467
    invoke-virtual/range {v20 .. v20}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    .line 468
    const-string v0, "openSDK_LOG"

    const-string v1, "UnsupportedEncodingException"

    move-object/from16 v2, v20

    invoke-static {v0, v1, v2}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 469
    move/from16 v0, v19

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 471
    :goto_1
    add-int/lit8 v0, v18, -0x1

    move/from16 v1, v19

    if-eq v1, v0, :cond_3

    .line 472
    const-string v0, ";"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 462
    :cond_3
    add-int/lit8 v19, v19, 0x1

    goto :goto_0

    .line 475
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&file_data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

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

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 477
    :cond_5
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 478
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v9}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 480
    :cond_6
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 481
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 483
    :cond_7
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 484
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&share_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 486
    :cond_8
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 487
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v11}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 489
    :cond_9
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 490
    move-object/from16 v17, v13

    .line 491
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_a

    .line 492
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    const/16 v2, 0x14

    invoke-virtual {v13, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 494
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&app_name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static/range {v17 .. v17}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 497
    :cond_b
    invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 498
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&open_id="

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

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 502
    :cond_c
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 503
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&audioUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v12}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 506
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&req_type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

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

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 508
    const-string v0, "sendToMyComputer url: "

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    const-string v2, "requireApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const-string v4, "sendToMyComputer"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/connect/a/a;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;[Ljava/lang/String;)V

    .line 512
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    .line 513
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 515
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    const-string v1, "pkg_name"

    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 517
    const-string v0, "sendToMyComputer"

    move-object/from16 v1, p3

    invoke-static {v0, v1}, Lcom/tencent/open/utils/TemporaryStorage;->set(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    .line 518
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_e

    .line 519
    move-object/from16 v0, v17

    check-cast v0, Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V

    .line 523
    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/open/GameAppOperation;->hasActivityForIntent()Z

    move-result v0

    if-eqz v0, :cond_f

    const-string v0, "5.2.0"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_f

    .line 525
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/16 v2, 0x277a

    :try_start_1
    invoke-virtual {v0, v1, v2}, Lcom/tencent/open/GameAppOperation;->startAssistActivity(Landroid/app/Activity;I)V

    .line 526
    const-string v0, "22"

    const-string v1, "0"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v6, v1}, Lcom/tencent/open/GameAppOperation;->a(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 531
    goto :goto_2

    .line 527
    :catch_1
    move-exception v18

    .line 528
    const-string v0, "openSDK_LOG"

    const-string v1, "-->addToQQFavorites, start activity exception."

    move-object/from16 v2, v18

    invoke-static {v0, v1, v2}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 529
    const-string v0, "22"

    const-string v1, "1"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v6, v1}, Lcom/tencent/open/GameAppOperation;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 530
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/tencent/open/GameAppOperation;->a(Landroid/app/Activity;)V

    .line 531
    goto :goto_2

    .line 533
    :cond_f
    const-string v0, "openSDK_LOG"

    const-string v1, "-->addToQQFavorites, there is no activity, show download page."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    const-string v0, "22"

    const-string v1, "1"

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v6, v1}, Lcom/tencent/open/GameAppOperation;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 535
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/tencent/open/GameAppOperation;->a(Landroid/app/Activity;)V

    .line 538
    :goto_2
    const-string v0, "openSDK_LOG"

    const-string v1, "sendToMyComputer() --end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 539
    return-void
.end method

.method public sharePrizeToQQ(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 13

    .line 710
    const-string v0, "openSDK_LOG"

    const-string v1, "sharePrizeToQQ() -- start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 711
    const/4 v6, -0x5

    .line 712
    const-string v7, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!"

    .line 713
    const/4 v0, 0x0

    move-object/from16 v1, p3

    if-ne v0, v1, :cond_0

    .line 714
    const-string v0, "openSDK_LOG.GameAppOper"

    const-string v1, "listener is null!"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 715
    return-void

    .line 718
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 719
    :cond_1
    const-string v8, "activity or params is null!"

    .line 720
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v8}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 721
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v6, v7, v8}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 722
    return-void

    .line 725
    :cond_2
    const-string v0, "title"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 726
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 727
    const-string v9, "sharePrizeToQQ failed, title is empty."

    .line 728
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v9}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 729
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v6, v7, v9}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 730
    return-void

    .line 732
    :cond_3
    const-string v0, "summary"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 733
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 734
    const-string v10, "sharePrizeToQQ failed, sumary is empty."

    .line 735
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v10}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 736
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v6, v7, v10}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 737
    return-void

    .line 739
    :cond_4
    const-string v0, "imageUrl"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 740
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "http://"

    invoke-virtual {v10, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "https://"

    invoke-virtual {v10, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 741
    :cond_5
    const-string v11, "sharePrizeToQQ failed, imageUrl is empty or illegal."

    .line 742
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v11}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 743
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v6, v7, v11}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 744
    return-void

    .line 747
    :cond_6
    const-string v0, "activityid"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 748
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 749
    const-string v12, "sharePrizeToQQ failed, activityId is empty."

    .line 750
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v12}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 751
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v6, v7, v12}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 752
    return-void

    .line 756
    :cond_7
    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 757
    const-string v0, "title"

    invoke-virtual {v12, v0, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 758
    const-string v0, "summary"

    invoke-virtual {v12, v0, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 759
    const-string v0, "imageUrl"

    invoke-virtual {v12, v0, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 760
    const-string v0, "req_type"

    const/4 v1, 0x1

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 762
    new-instance v0, Lcom/tencent/open/GameAppOperation$1;

    move-object v1, p0

    move-object/from16 v2, p3

    move-object v3, v11

    move-object v4, p1

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/tencent/open/GameAppOperation$1;-><init>(Lcom/tencent/open/GameAppOperation;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;Landroid/app/Activity;Landroid/os/Bundle;)V

    invoke-static {v0}, Lcom/tencent/open/utils/ThreadManager;->executeOnSubThread(Ljava/lang/Runnable;)V

    .line 803
    const-string v0, "openSDK_LOG"

    const-string v1, "sharePrizeToQQ() -- end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 804
    return-void
.end method

.method public shareToTroopBar(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 21

    .line 542
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToTroopBar() -- start"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 543
    const/4 v7, -0x5

    .line 544
    const-string v8, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!"

    .line 545
    const/4 v0, 0x0

    move-object/from16 v1, p3

    if-ne v0, v1, :cond_0

    .line 546
    const-string v0, "openSDK_LOG.GameAppOper"

    const-string v1, "listener is null!"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    return-void

    .line 550
    :cond_0
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_1

    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-ne v0, v1, :cond_2

    .line 551
    :cond_1
    const-string v9, "activity or params is null!"

    .line 552
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v9}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 553
    new-instance v0, Lcom/tencent/tauth/UiError;

    invoke-direct {v0, v7, v8, v9}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 554
    return-void

    .line 557
    :cond_2
    const-string v0, "title"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 558
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 559
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u4e0d\u53ef\u4ee5\u4e3a\u7a7a: title is null"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 561
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToTroopBar() -- title is null"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 562
    return-void

    .line 564
    :cond_3
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_4

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x19

    if-le v0, v1, :cond_5

    .line 565
    :cond_4
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!: title size: 4 ~ 25"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 567
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToTroopBar() -- title size: 4 ~ 25"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 568
    return-void

    .line 571
    :cond_5
    const-string v0, "description"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 572
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 573
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u4e0d\u53ef\u4ee5\u4e3a\u7a7a: description is null"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 575
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToTroopBar() -- description is null"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 576
    return-void

    .line 578
    :cond_6
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_7

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x2bc

    if-le v0, v1, :cond_8

    .line 579
    :cond_7
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!: description size: 10 ~ 700"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 581
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToTroopBar() -- description size: 10 ~ 700"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 582
    return-void

    .line 585
    :cond_8
    const-string v0, "file_data"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v11

    .line 586
    new-instance v12, Ljava/lang/StringBuffer;

    invoke-direct {v12}, Ljava/lang/StringBuffer;-><init>()V

    .line 587
    const/4 v0, 0x0

    if-eq v0, v11, :cond_e

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_e

    .line 588
    const-string v13, ""

    .line 589
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v14

    .line 590
    const/16 v0, 0x9

    if-le v14, v0, :cond_9

    .line 591
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!: file_data size: 1 ~ 9"

    const/4 v2, -0x5

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 593
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToTroopBar() -- file_data size: 1 ~ 9"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 594
    return-void

    .line 596
    :cond_9
    const/4 v15, 0x0

    :goto_0
    if-ge v15, v14, :cond_c

    .line 597
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    .line 598
    const-string v0, "/"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 600
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!"

    const-string v2, "file_data\u5e94\u8be5\u4e3a\u672c\u5730\u56fe\u7247"

    const/4 v3, -0x6

    invoke-direct {v0, v3, v1, v2}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 601
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToTroopBar(): file_data\u5e94\u8be5\u4e3a\u672c\u5730\u56fe\u7247"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 602
    return-void

    .line 604
    :cond_a
    const-string v0, "/"

    invoke-virtual {v13, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 605
    new-instance v0, Ljava/io/File;

    move-object v1, v13

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v0

    .line 606
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_b

    .line 608
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!"

    const-string v2, "\u56fe\u7247\u6587\u4ef6\u4e0d\u5b58\u5728"

    const/4 v3, -0x6

    invoke-direct {v0, v3, v1, v2}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 609
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToTroopBar(): \u56fe\u7247\u6587\u4ef6\u4e0d\u5b58\u5728"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 610
    return-void

    .line 596
    :cond_b
    add-int/lit8 v15, v15, 0x1

    goto :goto_0

    .line 615
    :cond_c
    const/4 v15, 0x0

    :goto_1
    if-ge v15, v14, :cond_e

    .line 617
    :try_start_0
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 623
    goto :goto_2

    .line 618
    :catch_0
    move-exception v16

    .line 620
    invoke-virtual/range {v16 .. v16}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    .line 621
    const-string v0, "openSDK_LOG"

    const-string v1, "UnsupportedEncodingException: "

    move-object/from16 v2, v16

    invoke-static {v0, v1, v2}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 622
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 624
    :goto_2
    add-int/lit8 v0, v14, -0x1

    if-eq v15, v0, :cond_d

    .line 625
    const-string v0, ";"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 615
    :cond_d
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 629
    :cond_e
    const-string v0, "troopbar_id"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 630
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    invoke-static {v13}, Lcom/tencent/open/utils/Util;->isNumeric(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 631
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u4f20\u5165\u53c2\u6570\u6709\u8bef! troopbar_id \u5fc5\u987b\u4e3a\u6570\u5b57"

    const/4 v2, -0x6

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 633
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToTroopBar(): troopbar_id \u5fc5\u987b\u4e3a\u6570\u5b57"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 634
    return-void

    .line 637
    :cond_f
    new-instance v14, Ljava/lang/StringBuffer;

    const-string v0, "mqqapi://share/to_troopbar?src_type=app&version=1&file_type=news"

    invoke-direct {v14, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 638
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v15

    .line 639
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v16

    .line 640
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "shareToTroopBar() -- openId: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 641
    invoke-static/range {p1 .. p1}, Lcom/tencent/open/utils/Util;->getApplicationLable(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v17

    .line 642
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 643
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&share_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 645
    :cond_10
    invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_11

    .line 646
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&open_id="

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

    invoke-virtual {v14, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 648
    :cond_11
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_13

    .line 649
    move-object/from16 v18, v17

    .line 650
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_12

    .line 651
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v17

    const/4 v2, 0x0

    const/16 v3, 0x14

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 653
    :cond_12
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

    invoke-virtual {v14, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 655
    :cond_13
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_14

    .line 656
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v9}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 658
    :cond_14
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_15

    .line 659
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 661
    :cond_15
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_16

    .line 662
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&troopbar_id="

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

    invoke-virtual {v14, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 664
    :cond_16
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_17

    .line 665
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&file_data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

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

    invoke-virtual {v14, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 668
    :cond_17
    const-string v0, "shareToTroopBar, url: "

    invoke-virtual {v14}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 669
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    const-string v2, "requireApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const-string v4, "shareToTroopBar"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/connect/a/a;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;[Ljava/lang/String;)V

    .line 671
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    .line 672
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    invoke-virtual {v14}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 674
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v18

    .line 675
    invoke-static/range {v18 .. v18}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_18

    .line 676
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/GameAppOperation;->mActivityIntent:Landroid/content/Intent;

    const-string v1, "pkg_name"

    move-object/from16 v2, v18

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 679
    :cond_18
    const-string v0, "shareToTroopBar"

    move-object/from16 v1, p3

    invoke-static {v0, v1}, Lcom/tencent/open/utils/TemporaryStorage;->set(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v19

    .line 680
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_19

    .line 681
    move-object/from16 v0, v19

    check-cast v0, Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V

    .line 685
    :cond_19
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/open/GameAppOperation;->hasActivityForIntent()Z

    move-result v0

    if-eqz v0, :cond_1a

    const-string v0, "5.3.0"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/tencent/open/utils/SystemUtils;->compareQQVersion(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1a

    .line 687
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/16 v2, 0x277b

    :try_start_1
    invoke-virtual {v0, v1, v2}, Lcom/tencent/open/GameAppOperation;->startAssistActivity(Landroid/app/Activity;I)V

    .line 688
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.SHARETOTROOPBAR.XX"

    const-string v4, "23"

    const-string v5, "18"

    const-string v6, "0"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 697
    goto :goto_3

    .line 691
    :catch_1
    move-exception v20

    .line 692
    const-string v0, "openSDK_LOG"

    const-string v1, "-->shareToTroopBar, start activity exception."

    move-object/from16 v2, v20

    invoke-static {v0, v1, v2}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 693
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.SHARETOTROOPBAR.XX"

    const-string v4, "23"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 696
    const-string v0, "5.3.0"

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v2, v0}, Lcom/tencent/open/GameAppOperation;->a(Landroid/app/Activity;Ljava/lang/String;)V

    .line 697
    goto :goto_3

    .line 699
    :cond_1a
    const-string v0, "openSDK_LOG"

    const-string v1, "-->shareToTroopBar, there is no activity, show download page."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    const-string v0, "5.3.0"

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v2, v0}, Lcom/tencent/open/GameAppOperation;->a(Landroid/app/Activity;Ljava/lang/String;)V

    .line 701
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/GameAppOperation;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.SHARETOTROOPBAR.XX"

    const-string v4, "23"

    const-string v5, "18"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 706
    :goto_3
    const-string v0, "openSDK_LOG"

    const-string v1, "shareToTroopBar() -- end"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 707
    return-void
.end method
