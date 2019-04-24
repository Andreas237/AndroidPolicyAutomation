.class public Lo/bsa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 62
    const-string v0, "CloudImplHelper"

    sput-object v0, Lo/bsa;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Ljava/lang/String;Ljava/lang/Exception;Lo/bsr;)V
    .locals 0

    .line 57
    invoke-static {p0, p1, p2}, Lo/bsa;->d(Ljava/lang/String;Ljava/lang/Exception;Lo/bsr;)V

    return-void
.end method

.method static a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    .locals 7

    .line 217
    invoke-static {p0, p2}, Lo/bsa;->e(Ljava/lang/String;Lo/bsr;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 218
    return-void

    .line 220
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 221
    const/4 v5, 0x0

    .line 222
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 223
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->isLogin()Z

    move-result v5

    .line 225
    :cond_1
    const/4 v6, 0x0

    .line 226
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 227
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->isLogin()Z

    move-result v5

    .line 228
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v0, "12345"

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 229
    const/4 v6, 0x1

    .line 232
    :cond_2
    if-nez v5, :cond_3

    .line 233
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_user_no_login:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x4e21

    invoke-virtual {p2, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    goto :goto_0

    .line 234
    :cond_3
    if-nez v6, :cond_4

    .line 235
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_authentication_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3ed

    invoke-virtual {p2, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    goto :goto_0

    .line 236
    :cond_4
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 237
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/bsa;->b(Lorg/json/JSONObject;Ljava/util/Map;)V

    .line 239
    sget-object v0, Lo/bsa;->a:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CloudImplHelperPost post url "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    const-string v2, "\nobj "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    invoke-static {}, Lo/bsc;->b()Lo/bsc;

    move-result-object v0

    new-instance v1, Lo/bsa$1;

    invoke-direct {v1, p0, p2}, Lo/bsa$1;-><init>(Ljava/lang/String;Lo/bsr;)V

    invoke-virtual {v0, p0, p1, v1}, Lo/bsc;->b(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsf;)V

    goto :goto_0

    .line 279
    :cond_5
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_haveno_network:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, -0x194

    invoke-virtual {p2, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 281
    :goto_0
    return-void
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V
    .locals 2

    .line 192
    invoke-static {}, Lo/bsc;->b()Lo/bsc;

    move-result-object v0

    new-instance v1, Lo/bsa$2;

    invoke-direct {v1, p0, p2}, Lo/bsa$2;-><init>(Ljava/lang/String;Lo/bsr;)V

    invoke-virtual {v0, p0, p1, v1}, Lo/bsc;->e(Ljava/lang/String;Ljava/lang/String;Lo/bsf;)V

    .line 208
    return-void
.end method

.method public static b(Lorg/json/JSONObject;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONObject;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 78
    :try_start_0
    invoke-static {p0}, Lo/bsa;->e(Lorg/json/JSONObject;)V

    .line 79
    invoke-static {p0}, Lo/bsa;->c(Lorg/json/JSONObject;)V

    .line 80
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 81
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    .line 82
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 83
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    goto :goto_0

    .line 88
    :cond_0
    goto :goto_1

    .line 86
    :catch_0
    move-exception v4

    .line 87
    const-class v0, Lo/bsa;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    :goto_1
    return-void
.end method

.method private static c(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 447
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 449
    const/4 v7, 0x0

    .line 451
    :try_start_0
    new-instance v8, Ljava/net/URL;

    invoke-direct {v8, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 452
    invoke-virtual {v8}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    .line 453
    invoke-static {v7}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    move-result-object v4

    .line 454
    const/4 v9, 0x0

    :goto_0
    array-length v0, v4

    if-ge v9, v0, :cond_0

    .line 455
    aget-object v0, v4, v9

    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 454
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 459
    :cond_0
    goto :goto_1

    .line 457
    :catch_0
    move-exception v8

    .line 458
    sget-object v0, Lo/bsa;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requesttFailureLog exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    :goto_1
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 461
    const-string v6, "net not Connect"

    goto :goto_2

    .line 463
    :cond_1
    const-string v6, "net Connect"

    .line 465
    :goto_2
    sget-object v0, Lo/bsa;->a:Ljava/lang/String;

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const-string v2, "_ip:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    const-string v2, "_netConnected:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v6, v1, v2

    const-string v2, "_errorCode:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 466
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "_errorInfo:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "_exceptionString:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 465
    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 467
    return-void
.end method

.method static synthetic c(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    .locals 0

    .line 57
    invoke-static {p0, p1, p2}, Lo/bsa;->e(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    return-void
.end method

.method private static c(Lorg/json/JSONObject;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 106
    invoke-static {}, Lo/brx;->e()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    const-string v0, "appType"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_0

    .line 108
    :cond_0
    invoke-static {}, Lo/brx;->e()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 109
    const-string v0, "appType"

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 111
    :cond_1
    :goto_0
    const-string v0, "ts"

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cap;->a(J)J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 112
    const-string v0, "timeZone"

    invoke-static {}, Lo/bzv;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    const-string v0, "iVersion"

    const-string v1, "3"

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 121
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 122
    const-string v0, "language"

    const-string v1, "zh_CN"

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 124
    :cond_2
    const-string v0, "language"

    const-string v1, "en_US"

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 134
    :goto_1
    const-string v0, "environment"

    invoke-static {}, Lo/cad;->b()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 135
    return-void
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 57
    sget-object v0, Lo/bsa;->a:Ljava/lang/String;

    return-object v0
.end method

.method private static d(Ljava/lang/String;Ljava/lang/Exception;Lo/bsr;)V
    .locals 5

    .line 424
    const/16 v4, 0x270f

    .line 425
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljavax/net/ssl/SSLException;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Connection timed out"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 426
    :cond_0
    const/16 v4, 0x3eb

    goto :goto_0

    .line 427
    :cond_1
    instance-of v0, p1, Ljava/net/ConnectException;

    if-nez v0, :cond_2

    instance-of v0, p1, Ljava/net/UnknownHostException;

    if-eqz v0, :cond_3

    .line 428
    :cond_2
    const/4 v4, -0x8

    goto :goto_0

    .line 429
    :cond_3
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Canceled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 430
    const/4 v4, -0x2

    goto :goto_0

    .line 431
    :cond_4
    const/16 v0, 0x1f4

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 432
    const/16 v4, 0x1f4

    goto :goto_0

    .line 433
    :cond_5
    const/16 v0, 0x1f7

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 434
    const/16 v4, 0x1f7

    .line 436
    :cond_6
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_7

    .line 437
    invoke-static {v4}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v4, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 439
    :cond_7
    sget-object v0, Lo/bsa;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resultCode="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    sget-object v0, Lo/bsa;->a:Ljava/lang/String;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v4}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    invoke-static {v4}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v4, v0, v1}, Lo/bsa;->c(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 443
    return-void
.end method

.method static d(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lo/bsr;)V
    .locals 8

    .line 284
    invoke-static {p0, p3}, Lo/bsa;->e(Ljava/lang/String;Lo/bsr;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 285
    return-void

    .line 287
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v4

    .line 288
    const/4 v5, 0x0

    .line 289
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 290
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->isLogin()Z

    move-result v5

    .line 292
    :cond_1
    const/4 v6, 0x0

    .line 293
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 294
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->isLogin()Z

    move-result v5

    .line 295
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v0, "12345"

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 296
    const/4 v6, 0x1

    .line 299
    :cond_2
    if-nez v5, :cond_3

    .line 300
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_user_no_login:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x4e21

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    goto :goto_1

    .line 301
    :cond_3
    if-nez v6, :cond_4

    .line 302
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_authentication_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3ed

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    goto :goto_1

    .line 303
    :cond_4
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 304
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/bsa;->b(Lorg/json/JSONObject;Ljava/util/Map;)V

    .line 305
    if-eqz p2, :cond_5

    .line 307
    const-string v0, "language"

    :try_start_0
    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 310
    goto :goto_0

    .line 308
    :catch_0
    move-exception v7

    .line 309
    sget-object v0, Lo/bsa;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    :cond_5
    :goto_0
    invoke-static {}, Lo/bsc;->b()Lo/bsc;

    move-result-object v0

    new-instance v1, Lo/bsa$4;

    invoke-direct {v1, p0, p3}, Lo/bsa$4;-><init>(Ljava/lang/String;Lo/bsr;)V

    invoke-virtual {v0, p0, p1, v1}, Lo/bsc;->b(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsf;)V

    goto :goto_1

    .line 324
    :cond_6
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_haveno_network:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, -0x194

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 326
    :goto_1
    return-void
.end method

.method static d(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lo/bsr;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Lo/bsr;)V"
        }
    .end annotation

    .line 330
    invoke-static {p0, p3}, Lo/bsa;->e(Ljava/lang/String;Lo/bsr;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 331
    return-void

    .line 333
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v2

    .line 334
    const/4 v3, 0x0

    .line 335
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 336
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/AccountInfo;->isLogin()Z

    move-result v3

    .line 338
    :cond_1
    const/4 v4, 0x0

    .line 339
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 340
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/AccountInfo;->isLogin()Z

    move-result v3

    .line 341
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v0, "12345"

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 342
    const/4 v4, 0x1

    .line 345
    :cond_2
    if-nez v3, :cond_3

    .line 346
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_user_no_login:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x4e21

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    goto :goto_0

    .line 347
    :cond_3
    if-nez v4, :cond_4

    .line 348
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_authentication_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3ed

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    goto :goto_0

    .line 349
    :cond_4
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 350
    invoke-static {p1, p2}, Lo/bsa;->b(Lorg/json/JSONObject;Ljava/util/Map;)V

    .line 351
    invoke-static {}, Lo/bsc;->b()Lo/bsc;

    move-result-object v0

    new-instance v1, Lo/bsa$3;

    invoke-direct {v1, p0, p3}, Lo/bsa$3;-><init>(Ljava/lang/String;Lo/bsr;)V

    invoke-virtual {v0, p0, p1, v1}, Lo/bsc;->b(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsf;)V

    goto :goto_0

    .line 363
    :cond_5
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_haveno_network:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, -0x194

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 365
    :goto_0
    return-void
.end method

.method static e(Ljava/lang/String;)V
    .locals 5

    .line 390
    invoke-static {}, Lo/bsc;->b()Lo/bsc;

    move-result-object v0

    iget-object v0, v0, Lo/bsc;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lokhttp3/Call;

    .line 391
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Lokhttp3/Call;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 392
    invoke-interface {v4}, Lokhttp3/Call;->cancel()V

    .line 393
    sget-object v0, Lo/bsa;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string v2, "cancel request"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    :cond_0
    return-void
.end method

.method static e(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lo/bsr;)V
    .locals 3

    .line 181
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    const-class v0, Lo/bsc;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "url is empty"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, p3}, Lo/bsa;->d(Ljava/lang/String;Ljava/lang/Exception;Lo/bsr;)V

    goto :goto_0

    .line 183
    :cond_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 184
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/bsa;->b(Lorg/json/JSONObject;Ljava/util/Map;)V

    .line 185
    invoke-static {p0, p2, p3}, Lo/bsa;->b(Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V

    goto :goto_0

    .line 187
    :cond_1
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_suggestion_have_no_network:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, -0x194

    invoke-virtual {p3, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 189
    :goto_0
    return-void
.end method

.method private static e(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V
    .locals 6

    .line 398
    const/16 v4, 0x270f

    .line 399
    const/16 v0, 0x270f

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v5

    .line 400
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 401
    const/4 v0, 0x0

    if-eq v0, p2, :cond_4

    .line 402
    invoke-virtual {p2, v4, v5}, Lo/bsr;->d(ILjava/lang/String;)V

    goto :goto_0

    .line 405
    :cond_0
    sget-object v0, Lo/bsa;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    const-string v0, "resultCode"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    .line 407
    sget-object v0, Lo/bsa;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resultCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    const-string v0, "resultDesc"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 409
    if-eqz v4, :cond_1

    const/16 v0, 0x4e24

    if-ne v4, v0, :cond_3

    .line 410
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    .line 411
    invoke-virtual {p2, p1}, Lo/bsr;->b(Lorg/json/JSONObject;)V

    .line 413
    :cond_2
    sget-object v0, Lo/bsa;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 415
    :cond_3
    const/4 v0, 0x0

    if-eq v0, p2, :cond_4

    .line 416
    invoke-virtual {p2, v4, v5}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 420
    :cond_4
    :goto_0
    sget-object v0, Lo/bsa;->a:Ljava/lang/String;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v4}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    return-void
.end method

.method private static e(Lorg/json/JSONObject;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 138
    const-string v0, "tokenType"

    const-string v1, "1"

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v3

    .line 142
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 143
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireServiceToken()Ljava/lang/String;

    move-result-object v4

    .line 144
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireSiteId()I

    move-result v5

    .line 145
    const-string v0, "token"

    invoke-virtual {p0, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 146
    const-string v0, "siteId"

    invoke-virtual {p0, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 148
    :cond_0
    const-string v0, "oaId"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 150
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_product_recommend"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 151
    if-eqz v6, :cond_1

    .line 152
    const-string v0, "isTrackingEnabled"

    invoke-virtual {p0, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 154
    :cond_1
    const-string v0, "isTrackingEnabled"

    const-string v1, "0"

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 157
    :goto_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 158
    const-string v0, "appId"

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 160
    :cond_2
    const-string v0, "appId"

    invoke-static {}, Lo/bzp;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 162
    :goto_1
    const-string v0, "deviceType"

    invoke-static {}, Lo/bzp;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 163
    const-string v0, "upDeviceType"

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getDeviceType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 164
    const-string v0, "deviceId"

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 165
    const-string v0, "sysVersion"

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 166
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->getAdapter()Lo/eab;

    move-result-object v7

    .line 167
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    move-object v0, v7

    check-cast v0, Lo/brr;

    invoke-interface {v0}, Lo/brr;->e()Lo/brv;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 168
    const-string v0, "bindDeviceType"

    move-object v1, v7

    check-cast v1, Lo/brr;

    invoke-interface {v1}, Lo/brr;->e()Lo/brv;

    move-result-object v1

    invoke-interface {v1}, Lo/brv;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 170
    :cond_3
    return-void
.end method

.method public static e(Ljava/lang/String;Lo/bsr;)Z
    .locals 4

    .line 368
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 369
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_args_valid:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {p1, v1, v0}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 370
    sget-object v0, Lo/bsa;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    const-string v0, "sportSuggestUrl"

    new-instance v1, Lo/bsa$5;

    invoke-direct {v1}, Lo/bsa$5;-><init>()V

    invoke-static {v0, v1}, Lo/bzu$c;->e(Ljava/lang/String;Lo/cza;)V

    .line 383
    const/4 v0, 0x0

    return v0

    .line 385
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
