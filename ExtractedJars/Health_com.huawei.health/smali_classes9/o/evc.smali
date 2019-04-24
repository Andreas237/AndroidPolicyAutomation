.class public Lo/evc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 56
    const-string v0, "CloudImplHelper"

    sput-object v0, Lo/evc;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 146
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    const/4 v7, 0x0

    .line 150
    :try_start_0
    new-instance v8, Ljava/net/URL;

    invoke-direct {v8, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 151
    invoke-virtual {v8}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    .line 152
    invoke-static {v7}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    move-result-object v4

    .line 153
    const/4 v9, 0x0

    :goto_0
    array-length v0, v4

    if-ge v9, v0, :cond_0

    .line 154
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

    .line 153
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 158
    :cond_0
    goto :goto_1

    .line 156
    :catch_0
    move-exception v8

    .line 157
    sget-object v0, Lo/evc;->d:Ljava/lang/String;

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

    .line 159
    :goto_1
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 160
    const-string v6, "net not Connect"

    goto :goto_2

    .line 162
    :cond_1
    const-string v6, "net Connect"

    .line 164
    :goto_2
    sget-object v0, Lo/evc;->d:Ljava/lang/String;

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

    .line 165
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

    .line 164
    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    return-void
.end method

.method static synthetic a(Ljava/lang/String;Ljava/lang/Exception;Lo/evd;)V
    .locals 0

    .line 51
    invoke-static {p0, p1, p2}, Lo/evc;->c(Ljava/lang/String;Ljava/lang/Exception;Lo/evd;)V

    return-void
.end method

.method static synthetic a(Ljava/lang/String;Lorg/json/JSONObject;Lo/evd;)V
    .locals 0

    .line 51
    invoke-static {p0, p1, p2}, Lo/evc;->b(Ljava/lang/String;Lorg/json/JSONObject;Lo/evd;)V

    return-void
.end method

.method private static b(Ljava/lang/String;Lorg/json/JSONObject;Lo/evd;)V
    .locals 6

    .line 97
    const/16 v4, 0x270f

    .line 98
    const/16 v0, 0x270f

    invoke-static {v0}, Lo/evo;->c(I)Ljava/lang/String;

    move-result-object v5

    .line 99
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 100
    const/4 v0, 0x0

    if-eq v0, p2, :cond_4

    .line 101
    invoke-virtual {p2, v4, v5}, Lo/evd;->d(ILjava/lang/String;)V

    goto :goto_0

    .line 104
    :cond_0
    sget-object v0, Lo/evc;->d:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    const-string v0, "resultCode"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    .line 106
    sget-object v0, Lo/evc;->d:Ljava/lang/String;

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

    .line 107
    const-string v0, "resultDesc"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 108
    if-eqz v4, :cond_1

    const/16 v0, 0x4e24

    if-ne v4, v0, :cond_3

    .line 109
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    .line 110
    invoke-virtual {p2, p1}, Lo/evd;->e(Lorg/json/JSONObject;)V

    .line 112
    :cond_2
    sget-object v0, Lo/evc;->d:Ljava/lang/String;

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

    .line 114
    :cond_3
    const/4 v0, 0x0

    if-eq v0, p2, :cond_4

    .line 115
    invoke-virtual {p2, v4, v5}, Lo/evd;->d(ILjava/lang/String;)V

    .line 119
    :cond_4
    :goto_0
    sget-object v0, Lo/evc;->d:Ljava/lang/String;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v4}, Lo/evo;->c(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-void
.end method

.method private static c(Ljava/lang/String;Ljava/lang/Exception;Lo/evd;)V
    .locals 5

    .line 123
    const/16 v4, 0x270f

    .line 124
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

    .line 125
    :cond_0
    const/16 v4, 0x3eb

    goto :goto_0

    .line 126
    :cond_1
    instance-of v0, p1, Ljava/net/ConnectException;

    if-nez v0, :cond_2

    instance-of v0, p1, Ljava/net/UnknownHostException;

    if-eqz v0, :cond_3

    .line 127
    :cond_2
    const/4 v4, -0x8

    goto :goto_0

    .line 128
    :cond_3
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Canceled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 129
    const/4 v4, -0x2

    goto :goto_0

    .line 130
    :cond_4
    const/16 v0, 0x1f4

    invoke-static {v0}, Lo/evo;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 131
    const/16 v4, 0x1f4

    goto :goto_0

    .line 132
    :cond_5
    const/16 v0, 0x1f7

    invoke-static {v0}, Lo/evo;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 133
    const/16 v4, 0x1f7

    .line 135
    :cond_6
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_7

    .line 136
    invoke-static {v4}, Lo/evo;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v4, v0}, Lo/evd;->d(ILjava/lang/String;)V

    .line 138
    :cond_7
    sget-object v0, Lo/evc;->d:Ljava/lang/String;

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

    .line 139
    sget-object v0, Lo/evc;->d:Ljava/lang/String;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v4}, Lo/evo;->c(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    invoke-static {v4}, Lo/evo;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v4, v0, v1}, Lo/evc;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 142
    return-void
.end method

.method private static c(Ljava/lang/String;Ljava/lang/String;Lo/evd;)V
    .locals 2

    .line 77
    invoke-static {}, Lo/evi;->e()Lo/evi;

    move-result-object v0

    new-instance v1, Lo/evc$5;

    invoke-direct {v1, p0, p2}, Lo/evc$5;-><init>(Ljava/lang/String;Lo/evd;)V

    invoke-virtual {v0, p0, p1, v1}, Lo/evi;->d(Ljava/lang/String;Ljava/lang/String;Lo/evl;)V

    .line 93
    return-void
.end method

.method public static e(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lo/evd;)V
    .locals 3

    .line 67
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    const-class v0, Lo/evi;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "url is empty"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, p3}, Lo/evc;->c(Ljava/lang/String;Ljava/lang/Exception;Lo/evd;)V

    goto :goto_0

    .line 69
    :cond_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    invoke-static {p0, p2, p3}, Lo/evc;->c(Ljava/lang/String;Ljava/lang/String;Lo/evd;)V

    goto :goto_0

    .line 72
    :cond_1
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_suggestion_have_no_network:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, -0x194

    invoke-virtual {p3, v1, v0}, Lo/evd;->d(ILjava/lang/String;)V

    .line 74
    :goto_0
    return-void
.end method
