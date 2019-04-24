.class public Lcom/tencent/open/yyb/AppbarJsBridge;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final AUTHORIZE_FAIL:I = -0x5

.field public static final BUTTON_CLICK_CALLBACK_FUNCTION_NAME:Ljava/lang/String; = "clickCallback"

.field public static final CALLBACK_LOGIN:Ljava/lang/String; = "loginCallback"

.field public static final CALLBACK_SHARE:Ljava/lang/String; = "shareCallback"

.field public static final Code_Java_Exception:I = -0x3

.field public static final Code_None:I = -0x2

.field public static final JSBRIDGE_VERSION:I = 0x1

.field public static final JS_BRIDGE_SCHEME:Ljava/lang/String; = "jsb://"

.field public static final READY_CALLBACK_FUNCTION_NAME:Ljava/lang/String; = "readyCallback"

.field public static final Result_Fail:I = -0x1

.field public static final Result_OK:I = 0x0

.field public static final SHARE_QQ:I = 0x1

.field public static final SHARE_QZ:I = 0x2

.field public static final SHARE_TIMELINE:I = 0x4

.field public static final SHARE_WX:I = 0x3


# instance fields
.field private a:Landroid/webkit/WebView;

.field private b:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/webkit/WebView;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    .line 62
    iput-object p2, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->a:Landroid/webkit/WebView;

    .line 63
    return-void
.end method

.method private a(Landroid/net/Uri;Ljava/lang/String;ILjava/lang/String;)V
    .locals 5

    .line 307
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->callAMethod : uri = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    invoke-direct {p0, p2}, Lcom/tencent/open/yyb/AppbarJsBridge;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 310
    :try_start_0
    const-class v0, Lcom/tencent/open/yyb/AppbarJsBridge;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Landroid/net/Uri;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {v0, p2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 313
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object p2, v0, v1

    const/4 v1, 0x3

    aput-object p4, v0, v1

    invoke-virtual {v4, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 321
    goto :goto_0

    .line 314
    :catch_0
    move-exception v4

    .line 315
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->callAMethod : Exception = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V

    .line 317
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 318
    const/4 v0, -0x3

    invoke-virtual {p0, p4, p3, p2, v0}, Lcom/tencent/open/yyb/AppbarJsBridge;->responseFail(Ljava/lang/String;ILjava/lang/String;I)V

    .line 321
    :cond_0
    goto :goto_0

    .line 323
    :cond_1
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 324
    const/4 v0, -0x5

    invoke-virtual {p0, p4, p3, p2, v0}, Lcom/tencent/open/yyb/AppbarJsBridge;->responseFail(Ljava/lang/String;ILjava/lang/String;I)V

    .line 328
    :cond_2
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    .line 331
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public callback(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 397
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 398
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "javascript:"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 399
    const-string v0, "if(!!"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 400
    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 401
    const-string v0, "("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 402
    invoke-virtual {v2, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 403
    const-string v0, ")}"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 404
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->a:Landroid/webkit/WebView;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 406
    :cond_0
    return-void
.end method

.method public clickCallback()V
    .locals 4

    .line 195
    const-string v0, "clickCallback"

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/tencent/open/yyb/AppbarJsBridge;->response(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 196
    return-void
.end method

.method public closeWebView(Landroid/net/Uri;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 70
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->closeWebView : url = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 72
    return-void
.end method

.method public getAppInfo(Landroid/net/Uri;ILjava/lang/String;Ljava/lang/String;)V
    .locals 14

    .line 153
    const-string v0, "packagenames"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 154
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->getAppInfo : packageNames = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 156
    :cond_0
    return-void

    .line 159
    :cond_1
    const-string v0, ","

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 160
    if-eqz v5, :cond_2

    array-length v0, v5

    if-nez v0, :cond_3

    .line 161
    :cond_2
    return-void

    .line 163
    :cond_3
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 164
    move-object v7, v5

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_5

    aget-object v10, v7, v9

    .line 165
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    .line 166
    const/4 v12, 0x0

    .line 168
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v11, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v12, v0

    .line 171
    goto :goto_1

    .line 169
    :catch_0
    move-exception v13

    .line 170
    const-string v0, "openSDK_LOG"

    const-string v1, "-->getAppInfo : NameNotFoundException e1"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    :goto_1
    :try_start_1
    new-instance v13, Lorg/json/JSONObject;

    invoke-direct {v13}, Lorg/json/JSONObject;-><init>()V

    .line 176
    if-eqz v12, :cond_4

    .line 177
    const-string v0, "install"

    const/4 v1, 0x1

    invoke-virtual {v13, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 178
    const-string v0, "appName"

    iget-object v1, v12, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->name:Ljava/lang/String;

    invoke-virtual {v13, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 179
    const-string v0, "verCode"

    iget v1, v12, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v13, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 180
    const-string v0, "verName"

    iget-object v1, v12, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v13, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    .line 182
    :cond_4
    const-string v0, "install"

    const/4 v1, 0x0

    invoke-virtual {v13, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 184
    :goto_2
    invoke-virtual {v6, v11, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 187
    goto :goto_3

    .line 185
    :catch_1
    move-exception v13

    .line 186
    move-object/from16 v0, p4

    move/from16 v1, p2

    move-object/from16 v2, p3

    const/4 v3, -0x3

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/tencent/open/yyb/AppbarJsBridge;->responseFail(Ljava/lang/String;ILjava/lang/String;I)V

    .line 164
    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 189
    :cond_5
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->getAppInfo : result = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p4

    move/from16 v2, p2

    move-object/from16 v3, p3

    invoke-virtual {p0, v1, v2, v3, v0}, Lcom/tencent/open/yyb/AppbarJsBridge;->response(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 192
    return-void
.end method

.method public getVersion()I
    .locals 1

    .line 232
    const/4 v0, 0x1

    return v0
.end method

.method public invoke(Ljava/lang/String;)V
    .locals 21

    .line 241
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->invoke : url = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    invoke-static/range {p1 .. p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 244
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v4

    .line 245
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->invoke : hostAsMethodName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 247
    return-void

    .line 249
    :cond_0
    invoke-virtual {v3}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v5

    .line 250
    const/4 v6, 0x0

    .line 251
    const/4 v7, 0x0

    .line 252
    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 253
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->parseIntValue(Ljava/lang/String;)I

    move-result v6

    .line 254
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 255
    const/4 v0, 0x1

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 258
    :cond_1
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->invoke : seqid = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " callbackName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    const-string v0, "callBatch"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 263
    const-string v0, "param"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 264
    new-instance v9, Lorg/json/JSONArray;

    invoke-direct {v9, v8}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 265
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v10

    .line 266
    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_4

    .line 267
    invoke-virtual {v9, v11}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    .line 268
    const-string v0, "method"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 269
    const-string v0, "seqid"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v14

    .line 270
    const-string v0, "callback"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 271
    const-string v0, "args"

    invoke-virtual {v12, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v16

    .line 272
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v0

    .line 273
    const-string v0, "jsb://"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    move-object v1, v15

    goto :goto_1

    :cond_2
    const-string v1, ""

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    if-eqz v16, :cond_3

    .line 282
    invoke-virtual/range {v16 .. v16}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v18

    .line 283
    :goto_2
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 284
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Ljava/lang/String;

    .line 285
    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 287
    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static/range {v20 .. v20}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    goto :goto_2

    .line 291
    :cond_3
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v18

    .line 292
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-direct {v0, v1, v13, v14, v15}, Lcom/tencent/open/yyb/AppbarJsBridge;->a(Landroid/net/Uri;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 266
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 299
    :cond_4
    goto :goto_3

    .line 294
    :catch_0
    move-exception v8

    .line 295
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 296
    move-object/from16 v0, p0

    const/4 v1, -0x5

    invoke-virtual {v0, v7, v6, v4, v1}, Lcom/tencent/open/yyb/AppbarJsBridge;->responseFail(Ljava/lang/String;ILjava/lang/String;I)V

    .line 299
    :cond_5
    goto :goto_3

    .line 301
    :cond_6
    move-object/from16 v0, p0

    invoke-direct {v0, v3, v4, v6, v7}, Lcom/tencent/open/yyb/AppbarJsBridge;->a(Landroid/net/Uri;Ljava/lang/String;ILjava/lang/String;)V

    .line 303
    :goto_3
    return-void
.end method

.method public openLoginActivity(Landroid/net/Uri;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 227
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->openLoginActivity : url = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    check-cast v0, Lcom/tencent/open/yyb/AppbarActivity;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/AppbarActivity;->login()V

    .line 229
    return-void
.end method

.method public openNewWindow(Landroid/net/Uri;ILjava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 199
    const-string v0, "url"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 201
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    const-class v1, Lcom/tencent/open/yyb/AppbarActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 202
    const-string v0, "url"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 203
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 206
    goto :goto_0

    .line 204
    :catch_0
    move-exception v3

    .line 205
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 207
    :goto_0
    return-void
.end method

.method public pageControl(Landroid/net/Uri;ILjava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 82
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->pageControl : url = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const-string v0, "type"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/utils/Util;->parseIntValue(Ljava/lang/String;)I

    move-result v3

    .line 84
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_2

    .line 85
    const/4 v0, 0x1

    if-ne v3, v0, :cond_0

    .line 86
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    goto :goto_0

    .line 87
    :cond_0
    const/4 v0, 0x2

    if-ne v3, v0, :cond_1

    .line 88
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goForward()V

    goto :goto_0

    .line 90
    :cond_1
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    .line 93
    :cond_2
    :goto_0
    const-string v0, ""

    invoke-virtual {p0, p4, p2, p3, v0}, Lcom/tencent/open/yyb/AppbarJsBridge;->response(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 94
    return-void
.end method

.method public ready()V
    .locals 4

    .line 335
    const-string v0, "readyCallback"

    const-string v1, "true"

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/tencent/open/yyb/AppbarJsBridge;->response(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 336
    return-void
.end method

.method public response(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 352
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/open/yyb/AppbarJsBridge;->response(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 353
    return-void
.end method

.method public response(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 357
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 358
    return-void

    .line 360
    :cond_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 362
    const-string v0, "result"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 363
    const-string v0, "data"

    invoke-virtual {v2, v0, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 364
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 365
    const-string v0, "method"

    invoke-virtual {v2, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 367
    :cond_1
    const-string v0, "seqid"

    invoke-virtual {v2, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 368
    if-eqz p5, :cond_2

    .line 369
    invoke-interface {p5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 370
    invoke-interface {p5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 374
    :cond_2
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/tencent/open/yyb/AppbarJsBridge;->callback(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 377
    goto :goto_1

    .line 375
    :catch_0
    move-exception v3

    .line 376
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 378
    :goto_1
    return-void
.end method

.method public responseFail(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 4

    .line 381
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 382
    return-void

    .line 384
    :cond_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 386
    const-string v0, "result"

    const/4 v1, -0x1

    :try_start_0
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 387
    const-string v0, "code"

    invoke-virtual {v2, v0, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 388
    const-string v0, "method"

    invoke-virtual {v2, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 389
    const-string v0, "seqid"

    invoke-virtual {v2, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 390
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/tencent/open/yyb/AppbarJsBridge;->callback(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 393
    goto :goto_0

    .line 391
    :catch_0
    move-exception v3

    .line 392
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 394
    :goto_0
    return-void
.end method

.method public responseShare(I)V
    .locals 7

    .line 339
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 340
    const-string v0, "type"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    move-object v0, p0

    const-string v1, "shareCallback"

    const-string v4, "0"

    move-object v5, v6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/open/yyb/AppbarJsBridge;->response(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 342
    return-void
.end method

.method public responseShareFail(I)V
    .locals 7

    .line 345
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 346
    const-string v0, "type"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    move-object v0, p0

    const-string v1, "shareCallback"

    const-string v4, "1"

    move-object v5, v6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/open/yyb/AppbarJsBridge;->response(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 348
    return-void
.end method

.method public setWebView(Landroid/net/Uri;ILjava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 211
    const-string v0, "title"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 212
    const-string v0, "buttonVisible"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/tencent/open/utils/Util;->parseIntValue(Ljava/lang/String;I)I

    move-result v4

    .line 213
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 214
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    check-cast v0, Lcom/tencent/open/yyb/AppbarActivity;

    invoke-virtual {v0, v3}, Lcom/tencent/open/yyb/AppbarActivity;->setAppbarTitle(Ljava/lang/String;)V

    .line 216
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    check-cast v0, Lcom/tencent/open/yyb/AppbarActivity;

    const/4 v1, 0x1

    if-ne v4, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/tencent/open/yyb/AppbarActivity;->setShareVisibility(Z)V

    .line 217
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->setWebView : url = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " -- buttonVisiable = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    const-string v0, ""

    invoke-virtual {p0, p4, p2, p3, v0}, Lcom/tencent/open/yyb/AppbarJsBridge;->response(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 221
    goto :goto_1

    .line 219
    :catch_0
    move-exception v3

    .line 220
    const/4 v0, -0x3

    invoke-virtual {p0, p4, p2, p3, v0}, Lcom/tencent/open/yyb/AppbarJsBridge;->responseFail(Ljava/lang/String;ILjava/lang/String;I)V

    .line 223
    :goto_1
    return-void
.end method

.method public share(Landroid/net/Uri;ILjava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 98
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->share : url = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const-string v0, "title"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 100
    const-string v0, "summary"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 101
    const-string v0, "iconUrl"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 102
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    const-string v5, "http://qzs.qq.com/open/mobile/jsbridge/demo.htm"

    .line 105
    :cond_0
    const-string v0, "jumpUrl"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 106
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->share : title = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->share : summary = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->share : iconUrl = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const-string v0, "openSDK_LOG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->share : jumpUrl = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    new-instance v7, Lcom/tencent/open/yyb/ShareModel;

    invoke-direct {v7}, Lcom/tencent/open/yyb/ShareModel;-><init>()V

    .line 111
    iput-object v3, v7, Lcom/tencent/open/yyb/ShareModel;->a:Ljava/lang/String;

    .line 112
    iput-object v4, v7, Lcom/tencent/open/yyb/ShareModel;->b:Ljava/lang/String;

    .line 113
    iput-object v5, v7, Lcom/tencent/open/yyb/ShareModel;->c:Ljava/lang/String;

    .line 114
    iput-object v6, v7, Lcom/tencent/open/yyb/ShareModel;->d:Ljava/lang/String;

    .line 115
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    check-cast v0, Lcom/tencent/open/yyb/AppbarActivity;

    invoke-virtual {v0, v7}, Lcom/tencent/open/yyb/AppbarActivity;->setShareModel(Lcom/tencent/open/yyb/ShareModel;)V

    .line 117
    const-string v0, "type"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/tencent/open/utils/Util;->parseIntValue(Ljava/lang/String;I)I

    move-result v8

    .line 118
    packed-switch v8, :pswitch_data_0

    goto :goto_0

    .line 120
    :pswitch_0
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    check-cast v0, Lcom/tencent/open/yyb/AppbarActivity;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/AppbarActivity;->shareToQQ()V

    .line 122
    goto :goto_1

    .line 124
    :pswitch_1
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    check-cast v0, Lcom/tencent/open/yyb/AppbarActivity;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/AppbarActivity;->shareToQzone()V

    .line 125
    goto :goto_1

    .line 127
    :pswitch_2
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    check-cast v0, Lcom/tencent/open/yyb/AppbarActivity;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/AppbarActivity;->shareToWX()V

    .line 128
    goto :goto_1

    .line 130
    :pswitch_3
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    check-cast v0, Lcom/tencent/open/yyb/AppbarActivity;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/AppbarActivity;->shareToTimeline()V

    .line 131
    goto :goto_1

    .line 135
    :goto_0
    :pswitch_4
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarJsBridge;->b:Landroid/app/Activity;

    check-cast v0, Lcom/tencent/open/yyb/AppbarActivity;

    invoke-virtual {v0}, Lcom/tencent/open/yyb/AppbarActivity;->showFloatingDialog()V

    .line 139
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
