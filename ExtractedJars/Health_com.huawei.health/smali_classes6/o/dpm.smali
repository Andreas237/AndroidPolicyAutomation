.class public Lo/dpm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dpm$a;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static d:Lo/doy;

.field private static e:Ljava/lang/String;

.field private static f:Lo/doy;

.field private static g:Ljava/lang/String;

.field private static h:Lo/doy;

.field private static i:Ljava/lang/String;

.field private static k:Lo/doy;

.field private static l:Ljava/lang/String;

.field private static m:J

.field private static n:I

.field private static o:I

.field private static p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 42
    const/4 v0, 0x0

    sput-object v0, Lo/dpm;->e:Ljava/lang/String;

    .line 43
    const/4 v0, 0x0

    sput-object v0, Lo/dpm;->b:Ljava/lang/String;

    .line 44
    const/4 v0, 0x0

    sput-object v0, Lo/dpm;->a:Ljava/lang/String;

    .line 45
    const/4 v0, 0x0

    sput-object v0, Lo/dpm;->c:Ljava/lang/String;

    .line 53
    new-instance v0, Lo/doy;

    invoke-direct {v0}, Lo/doy;-><init>()V

    sput-object v0, Lo/dpm;->d:Lo/doy;

    .line 54
    new-instance v0, Lo/doy;

    invoke-direct {v0}, Lo/doy;-><init>()V

    sput-object v0, Lo/dpm;->k:Lo/doy;

    .line 55
    new-instance v0, Lo/doy;

    invoke-direct {v0}, Lo/doy;-><init>()V

    sput-object v0, Lo/dpm;->f:Lo/doy;

    .line 56
    new-instance v0, Lo/doy;

    invoke-direct {v0}, Lo/doy;-><init>()V

    sput-object v0, Lo/dpm;->h:Lo/doy;

    .line 64
    const-string v0, "https://query.hicloud.com/Ring/v2/CheckEx.action?ruleAttr=true"

    sput-object v0, Lo/dpm;->i:Ljava/lang/String;

    .line 66
    const-string v0, "https://query.hicloud.com/Ring/v2/UpdateReport.action"

    sput-object v0, Lo/dpm;->g:Ljava/lang/String;

    .line 68
    const-string v0, "https://query.hicloud.com/accessory/v2/checkEx.action"

    sput-object v0, Lo/dpm;->l:Ljava/lang/String;

    .line 107
    const/4 v0, -0x1

    sput v0, Lo/dpm;->n:I

    .line 108
    const/4 v0, 0x0

    sput v0, Lo/dpm;->o:I

    .line 109
    const-wide/16 v0, -0x1

    sput-wide v0, Lo/dpm;->m:J

    .line 119
    const/4 v0, 0x0

    sput-boolean v0, Lo/dpm;->p:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 73
    sget-object v0, Lo/dpm;->i:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 380
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 381
    const/4 v5, 0x0

    .line 383
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v4, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 386
    goto :goto_0

    .line 384
    :catch_0
    move-exception v6

    .line 385
    const-string v0, "HwSelfUpdateUtility"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get PackageVersionCode exception."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    :goto_0
    if-eqz v5, :cond_0

    .line 388
    iget v0, v5, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 390
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(I)V
    .locals 0

    .line 142
    sput p0, Lo/dpm;->o:I

    .line 143
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    .line 77
    sput-object p0, Lo/dpm;->i:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public static a(Lo/doy;)V
    .locals 0

    .line 322
    sput-object p0, Lo/dpm;->d:Lo/doy;

    .line 323
    return-void
.end method

.method public static a(Z)V
    .locals 0

    .line 126
    sput-boolean p0, Lo/dpm;->p:Z

    .line 127
    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 5

    .line 269
    const-string v0, "connectivity"

    .line 270
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 271
    if-nez v2, :cond_0

    goto :goto_1

    .line 274
    :cond_0
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getAllNetworkInfo()[Landroid/net/NetworkInfo;

    move-result-object v3

    .line 275
    if-eqz v3, :cond_2

    .line 276
    const/4 v4, 0x0

    :goto_0
    array-length v0, v3

    if-ge v4, v0, :cond_2

    .line 277
    aget-object v0, v3, v4

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v0

    sget-object v1, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v0, v1, :cond_1

    .line 279
    const/4 v0, 0x1

    return v0

    .line 276
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 285
    :cond_2
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private static b(Landroid/content/Context;)Landroid/net/NetworkInfo;
    .locals 3

    .line 311
    const/4 v1, 0x0

    .line 312
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 313
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 314
    :goto_0
    return-object v1
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 90
    sget-object v0, Lo/dpm;->g:Ljava/lang/String;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 0

    .line 236
    sput-object p0, Lo/dpm;->e:Ljava/lang/String;

    .line 237
    return-void
.end method

.method public static b(Lo/doy;)V
    .locals 0

    .line 346
    sput-object p0, Lo/dpm;->h:Lo/doy;

    .line 347
    return-void
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    .line 85
    sget-object v0, Lo/dpm;->l:Ljava/lang/String;

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 350
    invoke-static {p0}, Lo/dbf;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/String;)V
    .locals 0

    .line 252
    sput-object p0, Lo/dpm;->a:Ljava/lang/String;

    .line 253
    return-void
.end method

.method public static c(Lo/doy;)V
    .locals 0

    .line 338
    sput-object p0, Lo/dpm;->f:Lo/doy;

    .line 339
    return-void
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    .line 98
    sget-object v0, Lo/dpm;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 354
    const-string v4, ""

    .line 356
    const-string v0, "phone"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/telephony/TelephonyManager;

    .line 358
    invoke-virtual {v5}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 375
    goto :goto_0

    .line 372
    :catch_0
    move-exception v5

    .line 373
    const-string v0, "HwSelfUpdateUtility"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIMEI() Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    const-string v0, ""

    return-object v0

    .line 376
    :goto_0
    return-object v4
.end method

.method public static d(I)V
    .locals 0

    .line 134
    sput p0, Lo/dpm;->n:I

    .line 135
    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "chmod -R 777 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "chmod -R 777 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 155
    invoke-static {v2}, Lo/dpm;->i(Ljava/lang/String;)V

    .line 156
    invoke-static {v3}, Lo/dpm;->i(Ljava/lang/String;)V

    .line 157
    new-instance v4, Lo/dpt;

    invoke-direct {v4, p0, p1, p2}, Lo/dpt;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 159
    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 0

    .line 81
    sput-object p0, Lo/dpm;->l:Ljava/lang/String;

    .line 82
    return-void
.end method

.method public static d(Lo/doy;)V
    .locals 0

    .line 330
    sput-object p0, Lo/dpm;->k:Lo/doy;

    .line 331
    return-void
.end method

.method public static e()J
    .locals 2

    .line 112
    sget-wide v0, Lo/dpm;->m:J

    return-wide v0
.end method

.method public static e(J)V
    .locals 0

    .line 116
    sput-wide p0, Lo/dpm;->m:J

    .line 117
    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 0

    .line 244
    sput-object p0, Lo/dpm;->b:Ljava/lang/String;

    .line 245
    return-void
.end method

.method public static e(Lorg/apache/http/HttpRequest;Lorg/apache/http/client/HttpClient;Landroid/content/Context;)V
    .locals 6

    .line 293
    invoke-static {p2}, Landroid/net/Proxy;->getHost(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 294
    invoke-static {p2}, Landroid/net/Proxy;->getPort(Landroid/content/Context;)I

    move-result v3

    .line 295
    invoke-static {p2}, Lo/dpm;->b(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v4

    .line 296
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 298
    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, -0x1

    if-eq v3, v0, :cond_1

    .line 300
    invoke-interface {p1}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v5

    .line 301
    new-instance v0, Lorg/apache/http/HttpHost;

    invoke-direct {v0, v2, v3}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    invoke-static {v5, v0}, Lorg/apache/http/conn/params/ConnRouteParams;->setDefaultProxy(Lorg/apache/http/params/HttpParams;Lorg/apache/http/HttpHost;)V

    .line 302
    invoke-interface {p0, v5}, Lorg/apache/http/HttpRequest;->setParams(Lorg/apache/http/params/HttpParams;)V

    .line 305
    :cond_1
    :goto_0
    return-void
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 3

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/files/libbspatchforselfupdate.so"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 222
    invoke-static {v2}, Lo/dpm;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 224
    const/4 v0, 0x1

    return v0

    .line 227
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static f()I
    .locals 1

    .line 130
    sget v0, Lo/dpm;->n:I

    return v0
.end method

.method public static g()I
    .locals 1

    .line 138
    sget v0, Lo/dpm;->o:I

    return v0
.end method

.method private static g(Ljava/lang/String;)Z
    .locals 2

    .line 216
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 217
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method

.method public static h()Ljava/lang/String;
    .locals 1

    .line 232
    sget-object v0, Lo/dpm;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static i()Ljava/lang/String;
    .locals 1

    .line 240
    sget-object v0, Lo/dpm;->b:Ljava/lang/String;

    return-object v0
.end method

.method private static i(Ljava/lang/String;)V
    .locals 9

    .line 163
    const-string v0, "HwSelfUpdateUtility"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get Permission begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v4

    .line 165
    invoke-virtual {v4, p0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v5

    .line 166
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 168
    new-instance v6, Lo/dpm$a;

    invoke-virtual {v5}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-direct {v6, v0, v1}, Lo/dpm$a;-><init>(Ljava/io/InputStream;Ljava/io/PrintStream;)V

    .line 172
    new-instance v7, Lo/dpm$a;

    invoke-virtual {v5}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-direct {v7, v0, v1}, Lo/dpm$a;-><init>(Ljava/io/InputStream;Ljava/io/PrintStream;)V

    .line 175
    invoke-virtual {v6}, Lo/dpm$a;->start()V

    .line 176
    invoke-virtual {v7}, Lo/dpm$a;->start()V

    .line 178
    invoke-virtual {v5}, Ljava/lang/Process;->waitFor()I

    move-result v8

    .line 179
    const-string v0, "HwSelfUpdateUtility"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "waitFor values is : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    invoke-virtual {v6}, Lo/dpm$a;->join()V

    .line 182
    invoke-virtual {v7}, Lo/dpm$a;->join()V

    .line 183
    const-string v0, "HwSelfUpdateUtility"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "process is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    :cond_0
    const-string v0, "HwSelfUpdateUtility"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "filePermission end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 190
    goto :goto_0

    .line 186
    :catch_0
    move-exception v4

    .line 187
    const-string v0, "HwSelfUpdateUtility"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modify permission fail: IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    goto :goto_0

    .line 188
    :catch_1
    move-exception v4

    .line 189
    const-string v0, "HwSelfUpdateUtility"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "modify permission fail: InterruptedException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    :goto_0
    return-void
.end method

.method public static k()Z
    .locals 1

    .line 122
    sget-boolean v0, Lo/dpm;->p:Z

    return v0
.end method

.method public static k(Ljava/lang/String;)Z
    .locals 3

    .line 256
    const/4 v1, 0x0

    .line 257
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 258
    return v1

    .line 261
    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 262
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 263
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 265
    :cond_2
    :goto_0
    return v1
.end method

.method public static l()Lo/doy;
    .locals 1

    .line 326
    sget-object v0, Lo/dpm;->k:Lo/doy;

    return-object v0
.end method

.method public static m()Lo/doy;
    .locals 1

    .line 318
    sget-object v0, Lo/dpm;->d:Lo/doy;

    return-object v0
.end method

.method public static n()Lo/doy;
    .locals 1

    .line 342
    sget-object v0, Lo/dpm;->h:Lo/doy;

    return-object v0
.end method

.method public static o()Ljava/lang/String;
    .locals 1

    .line 248
    sget-object v0, Lo/dpm;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static p()Lo/doy;
    .locals 1

    .line 334
    sget-object v0, Lo/dpm;->f:Lo/doy;

    return-object v0
.end method
