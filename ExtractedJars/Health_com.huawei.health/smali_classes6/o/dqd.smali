.class public Lo/dqd;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 48
    const-string v0, "ro.build.display.id"

    .line 49
    return-object v0
.end method

.method public static b()Ljava/lang/String;
    .locals 2

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Android "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    .line 64
    const-string v0, "ro.product.CustCVersion"

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 92
    const-string v0, "checkNewVersionThreadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResponse url ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dpm;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    invoke-static {}, Lo/dpm;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lo/dqd;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 94
    return-object v4
.end method

.method public static c(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 73
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 74
    const/4 v5, 0x0

    .line 76
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v4, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 79
    goto :goto_0

    .line 77
    :catch_0
    move-exception v6

    .line 78
    const-string v0, "checkNewVersionThreadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "does not found"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    :goto_0
    if-eqz v5, :cond_0

    .line 81
    iget-object v0, v5, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 83
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Lo/dov;
    .locals 2

    .line 113
    new-instance v1, Lo/dov;

    invoke-direct {v1}, Lo/dov;-><init>()V

    .line 114
    invoke-static {}, Lo/dqd;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lo/dov;->d:Ljava/lang/String;

    .line 115
    invoke-static {}, Lo/dqd;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lo/dov;->c:Ljava/lang/String;

    .line 116
    invoke-static {}, Lo/dqd;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lo/dov;->a:Ljava/lang/String;

    .line 117
    const-string v0, ""

    iput-object v0, v1, Lo/dov;->b:Ljava/lang/String;

    .line 118
    invoke-static {p0}, Lo/dpm;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lo/dov;->e:Ljava/lang/String;

    .line 119
    invoke-static {p0}, Lo/dqd;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lo/dov;->k:Ljava/lang/String;

    .line 120
    invoke-static {}, Lo/dqd;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lo/dov;->i:Ljava/lang/String;

    .line 121
    invoke-static {}, Lo/dqd;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lo/dov;->f:Ljava/lang/String;

    .line 122
    invoke-static {}, Lo/dqd;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lo/dov;->g:Ljava/lang/String;

    .line 123
    invoke-static {p0, p1, v1}, Lo/dqd;->e(Landroid/content/Context;Ljava/lang/String;Lo/dov;)Lo/dov;

    move-result-object v1

    .line 124
    invoke-static {p0}, Lo/dpm;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    const-string v0, "1.1.3"

    iput-object v0, v1, Lo/dov;->l:Ljava/lang/String;

    .line 127
    :cond_0
    return-object v1
.end method

.method public static c(Lo/doy;)Lo/dow;
    .locals 3

    .line 156
    new-instance v2, Lo/dow;

    invoke-direct {v2}, Lo/dow;-><init>()V

    .line 157
    iget-object v0, p0, Lo/doy;->a:Ljava/lang/String;

    iput-object v0, v2, Lo/dow;->c:Ljava/lang/String;

    .line 158
    iget-object v0, p0, Lo/doy;->s:Ljava/lang/String;

    iput-object v0, v2, Lo/dow;->l:Ljava/lang/String;

    .line 159
    iget-wide v0, p0, Lo/doy;->m:J

    iput-wide v0, v2, Lo/dow;->h:J

    .line 160
    iget-object v0, p0, Lo/doy;->g:Ljava/lang/String;

    iput-object v0, v2, Lo/dow;->d:Ljava/lang/String;

    .line 161
    iget-object v0, p0, Lo/doy;->e:Ljava/lang/String;

    iput-object v0, v2, Lo/dow;->a:Ljava/lang/String;

    .line 162
    iget-object v0, p0, Lo/doy;->o:Ljava/lang/String;

    iput-object v0, v2, Lo/dow;->m:Ljava/lang/String;

    .line 163
    iget-object v0, p0, Lo/doy;->k:Ljava/lang/String;

    iput-object v0, v2, Lo/dow;->r:Ljava/lang/String;

    .line 164
    iget-object v0, p0, Lo/doy;->u:Ljava/lang/String;

    iput-object v0, v2, Lo/dow;->o:Ljava/lang/String;

    .line 165
    iget-object v0, p0, Lo/doy;->b:Ljava/lang/String;

    iput-object v0, v2, Lo/dow;->e:Ljava/lang/String;

    .line 166
    iget-object v0, p0, Lo/doy;->d:Ljava/lang/String;

    iput-object v0, v2, Lo/dow;->b:Ljava/lang/String;

    .line 167
    iget-object v0, p0, Lo/doy;->c:Ljava/lang/String;

    iput-object v0, v2, Lo/dow;->n:Ljava/lang/String;

    .line 168
    iget v0, p0, Lo/doy;->p:I

    iput v0, v2, Lo/dow;->y:I

    .line 169
    iget v0, p0, Lo/doy;->v:I

    iput v0, v2, Lo/dow;->v:I

    .line 170
    iget v0, p0, Lo/doy;->x:I

    iput v0, v2, Lo/dow;->z:I

    .line 171
    iget-object v0, p0, Lo/doy;->z:Ljava/lang/String;

    iput-object v0, v2, Lo/dow;->j:Ljava/lang/String;

    .line 172
    iget-object v0, p0, Lo/doy;->y:Ljava/lang/String;

    iput-object v0, v2, Lo/dow;->w:Ljava/lang/String;

    .line 173
    return-object v2
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    .line 40
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 53
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    .line 54
    iget-object v0, v2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    .line 55
    iget-object v0, v2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 86
    const-string v0, "checkNewVersionThreadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResponse url ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dpm;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    invoke-static {}, Lo/dpm;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lo/dqd;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 88
    return-object v4
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/io/OutputStream;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/RuntimeException;
        }
    .end annotation

    .line 180
    new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 181
    new-instance v3, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v3, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 182
    const/4 v4, -0x1

    .line 183
    invoke-static {v3, v2, p0}, Lo/dpm;->e(Lorg/apache/http/HttpRequest;Lorg/apache/http/client/HttpClient;Landroid/content/Context;)V

    .line 184
    const/4 v5, 0x0

    .line 185
    invoke-virtual {v3}, Lorg/apache/http/client/methods/HttpGet;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v6

    .line 186
    const-string v0, "http.socket.timeout"

    const/16 v1, 0x4e20

    invoke-interface {v6, v0, v1}, Lorg/apache/http/params/HttpParams;->setIntParameter(Ljava/lang/String;I)Lorg/apache/http/params/HttpParams;

    .line 187
    const-string v0, "http.connection.timeout"

    const/16 v1, 0x4e20

    invoke-interface {v6, v0, v1}, Lorg/apache/http/params/HttpParams;->setIntParameter(Ljava/lang/String;I)Lorg/apache/http/params/HttpParams;

    .line 188
    invoke-static {}, Lo/dpm;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 189
    invoke-interface {v2, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v5

    .line 190
    invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v4

    .line 191
    if-eqz p2, :cond_0

    .line 192
    invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-interface {v0, p2}, Lorg/apache/http/HttpEntity;->writeTo(Ljava/io/OutputStream;)V

    .line 194
    :cond_0
    invoke-virtual {v3}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 195
    return v4
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    .line 44
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method private static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 100
    const-string v0, "checkNewVersionThreadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "strUrl:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 103
    invoke-static {p0}, Lo/dpk;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    invoke-static {p0, p1}, Lo/dpj;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 106
    :cond_0
    invoke-static {p0, p1}, Lo/dph;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 109
    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method private static e(Landroid/content/Context;Ljava/lang/String;Lo/dov;)Lo/dov;
    .locals 9

    .line 132
    const-string v0, "checkNewVersionThreadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getComponent packageName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",versionFilter ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    move-object v4, p2

    .line 135
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 136
    const/16 v0, 0x40

    invoke-virtual {v5, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v6

    .line 137
    iget-object v7, v6, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 138
    const/4 v0, 0x0

    aget-object v0, v7, v0

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dpn;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 139
    iput-object p1, v4, Lo/dov;->h:Ljava/lang/String;

    .line 140
    invoke-static {p1, p0}, Lo/dpm;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lo/dov;->p:Ljava/lang/String;

    .line 142
    invoke-static {p1, p0}, Lo/dqd;->c(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lo/dov;->o:Ljava/lang/String;

    .line 144
    iput-object v8, v4, Lo/dov;->m:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 151
    goto :goto_0

    .line 145
    :catch_0
    move-exception v5

    .line 147
    const-string v0, "checkNewVersionThreadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "packageName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",exception = NameNotFoundException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    goto :goto_0

    .line 148
    :catch_1
    move-exception v5

    .line 150
    const-string v0, "checkNewVersionThreadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "packageName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    :goto_0
    return-object v4
.end method

.method public static i()Ljava/lang/String;
    .locals 1

    .line 68
    const-string v0, "ro.product.CustDVersion"

    return-object v0
.end method
