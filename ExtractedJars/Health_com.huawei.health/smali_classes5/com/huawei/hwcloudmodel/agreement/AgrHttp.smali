.class public Lcom/huawei/hwcloudmodel/agreement/AgrHttp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final QUERY_NSP_SVC:Ljava/lang/String; = "as.user.query"

.field private static final SIGN_NSP_SVC:Ljava/lang/String; = "as.user.sign"

.field private static final TAG:Ljava/lang/String; = "SignAgrHttp"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private composeQueryAgrReqBean(Ljava/lang/String;)Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqBean;
    .locals 7

    .line 247
    new-instance v1, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqBean;

    invoke-direct {v1}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqBean;-><init>()V

    .line 248
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 250
    new-instance v3, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;

    invoke-direct {v3}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;-><init>()V

    .line 251
    const/16 v0, 0x86

    invoke-virtual {v3, v0}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;->setAgrType(I)V

    .line 252
    invoke-virtual {v3, p1}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;->setCountry(Ljava/lang/String;)V

    .line 253
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 255
    new-instance v4, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;-><init>()V

    .line 256
    const/16 v0, 0x2727

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;->setAgrType(I)V

    .line 257
    invoke-virtual {v4, p1}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;->setCountry(Ljava/lang/String;)V

    .line 258
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 260
    new-instance v5, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;-><init>()V

    .line 261
    const/16 v0, 0x76

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;->setAgrType(I)V

    .line 262
    invoke-virtual {v5, p1}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;->setCountry(Ljava/lang/String;)V

    .line 263
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 270
    new-instance v6, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;

    invoke-direct {v6}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;-><init>()V

    .line 271
    const/16 v0, 0x2719

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;->setAgrType(I)V

    .line 272
    invoke-virtual {v6, p1}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqInfo;->setCountry(Ljava/lang/String;)V

    .line 273
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 274
    invoke-virtual {v1, v2}, Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqBean;->setAgrInfo(Ljava/util/List;)V

    .line 275
    return-object v1
.end method

.method private composeSignAgrReqBean(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/huawei/hwcloudmodel/agreement/SignAgrReqBean;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List<Ljava/lang/Integer;>;)Lcom/huawei/hwcloudmodel/agreement/SignAgrReqBean;"
        }
    .end annotation

    .line 222
    new-instance v1, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqBean;

    invoke-direct {v1}, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqBean;-><init>()V

    .line 223
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 225
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 226
    new-instance v4, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;

    invoke-direct {v4, p1, p2, p3}, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 227
    invoke-interface {p4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqInfo;->setAgrType(I)V

    .line 228
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 225
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 242
    :cond_0
    invoke-virtual {v1, v2}, Lcom/huawei/hwcloudmodel/agreement/SignAgrReqBean;->setSignInfo(Ljava/util/List;)V

    .line 243
    return-object v1
.end method

.method private getReqParams(Ljava/lang/Object;Ljava/util/HashMap;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 281
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    .line 283
    move-object v5, v4

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_2

    aget-object v8, v5, v7

    .line 285
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    .line 287
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->isAccessible()Z

    move-result v11

    .line 288
    if-nez v11, :cond_0

    .line 289
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 290
    :cond_0
    invoke-virtual {v8, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .line 291
    if-eqz v10, :cond_1

    .line 293
    invoke-virtual {p2, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    :cond_1
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SignAgrHttp_getReqParms params "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 297
    :cond_2
    return-void
.end method

.method private obtainBody(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 203
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    const-string v0, ""

    return-object v0

    .line 207
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "nsp_svc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 210
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&access_token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {p2, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 211
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&request="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {p3, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 216
    goto :goto_0

    .line 213
    :catch_0
    move-exception v5

    .line 215
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UnsupportedEncodingException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    :goto_0
    return-object v4
.end method

.method private obtainHeader(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 305
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 306
    const-string v0, "Content-Type"

    const-string v1, "text/plain; charset=UTF-8"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    const-string v0, "Content-Encoding"

    const-string v1, "gzip"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    const-string v0, "User-Agent"

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->getUserAgent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    const-string v0, "Host"

    invoke-virtual {v2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    return-object v2
.end method

.method public static postReq(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lo/czi;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Lo/czi;)I"
        }
    .end annotation

    .line 107
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "entry Https.postReq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Url:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  Param:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Header:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-static {p0}, Lo/czj;->d(Ljava/lang/String;)Ljavax/net/ssl/HttpsURLConnection;

    move-result-object v4

    .line 112
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 113
    if-eqz p3, :cond_0

    .line 114
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lo/czi;->b(ILjava/lang/String;)V

    .line 116
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 118
    :cond_1
    invoke-static {v4}, Lo/czj;->e(Ljavax/net/ssl/HttpsURLConnection;)V

    .line 119
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    .line 120
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    .line 121
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setUseCaches(Z)V

    .line 124
    const-string v0, "POST"

    :try_start_0
    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    goto :goto_0

    .line 125
    :catch_0
    move-exception v5

    .line 126
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/net/ProtocolException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    const/4 v0, -0x1

    return v0

    .line 130
    :goto_0
    invoke-static {v4, p2}, Lo/czj;->c(Ljava/net/HttpURLConnection;Ljava/util/HashMap;)V

    .line 132
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "postReq-->strBody:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    new-instance v5, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;

    invoke-direct {v5, p1, v4, p3}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp$1;-><init>(Ljava/lang/String;Ljavax/net/ssl/HttpsURLConnection;Lo/czi;)V

    .line 194
    invoke-static {}, Lo/dbw;->d()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 196
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit AchieveHttps.postReq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method protected getUserAgent()Ljava/lang/String;
    .locals 1

    .line 301
    const-string v0, "Android/1.0"

    return-object v0
.end method

.method public queryHttpReq(Ljava/lang/String;Ljava/lang/String;Lo/czi;)Ljava/lang/String;
    .locals 8

    .line 71
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 74
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->getCountryCode(Lo/dcx;)Ljava/lang/String;

    move-result-object v5

    .line 75
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Show_queryAgrReqBean CountryCode "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-direct {p0, v5}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->composeQueryAgrReqBean(Ljava/lang/String;)Lcom/huawei/hwcloudmodel/agreement/QueryAgrReqBean;

    move-result-object v0

    invoke-direct {p0, v0, v4}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->getReqParams(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    goto :goto_0

    .line 78
    :catch_0
    move-exception v5

    .line 80
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QueryHttpReq data exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    :goto_0
    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    .line 83
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Show_queryAgrReqBean "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const-string v0, "as.user.query"

    invoke-virtual {v5, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, p1, v1}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->obtainBody(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 86
    :try_start_1
    new-instance v7, Ljava/net/URL;

    invoke-direct {v7, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v7}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->obtainHeader(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p2, v6, v0, p3}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->postReq(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lo/czi;)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 90
    goto :goto_1

    .line 88
    :catch_1
    move-exception v7

    .line 89
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "agr_query_sign_response data exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    :goto_1
    const-string v0, ""

    return-object v0
.end method

.method public signHttpReq(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lo/czi;)Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List<Ljava/lang/Integer;>;Ljava/lang/String;Ljava/lang/String;Lo/czi;)Ljava/lang/String;"
        }
    .end annotation

    .line 43
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 46
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Show_signAgrReqBean CountryCode "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    invoke-direct {p0, p5, p6, p3, p4}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->composeSignAgrReqBean(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lcom/huawei/hwcloudmodel/agreement/SignAgrReqBean;

    move-result-object v0

    invoke-direct {p0, v0, v4}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->getReqParams(Ljava/lang/Object;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_0

    .line 49
    :catch_0
    move-exception v5

    .line 51
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getReqParams exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    :goto_0
    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    .line 55
    invoke-virtual {v5, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 56
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Show_signAgrReqBean "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    const-string v0, "as.user.sign"

    invoke-direct {p0, v0, p1, v6}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->obtainBody(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 59
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Show_signAgrReqBean reqBody "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    :try_start_1
    new-instance v8, Ljava/net/URL;

    invoke-direct {v8, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v8}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->obtainHeader(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    move-object/from16 v1, p7

    invoke-static {p2, v7, v0, v1}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->postReq(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lo/czi;)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 66
    goto :goto_1

    .line 64
    :catch_1
    move-exception v8

    .line 65
    const-string v0, "SignAgrHttp"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "agr_sign_response data exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    :goto_1
    return-object v6
.end method
