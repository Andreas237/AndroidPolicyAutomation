.class public Lo/ajb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field public static final b:Ljava/lang/StringBuilder;

.field private static c:Lo/ajg;

.field private static final d:Ljava/lang/Object;

.field private static e:Lo/flh;

.field private static g:Lo/flx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 54
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/ajb;->d:Ljava/lang/Object;

    .line 79
    const-string v0, ""

    sput-object v0, Lo/ajb;->a:Ljava/lang/String;

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "coap://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroid/util/Patterns;->IP_ADDRESS:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "[0-9]{1,4}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sput-object v0, Lo/ajb;->b:Ljava/lang/StringBuilder;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static declared-synchronized a(Lo/ail;Ljava/lang/Integer;Lo/ain;Lo/aiq$d;)V
    .locals 7

    const-class v6, Lo/ajb;

    monitor-enter v6

    .line 406
    const/4 v4, 0x0

    .line 407
    :try_start_0
    invoke-static {p0, p1, p2}, Lo/ajb;->e(Lo/ail;Ljava/lang/Integer;Lo/ain;)V

    .line 408
    sget-object v0, Lo/ajb;->e:Lo/flh;

    invoke-virtual {p0}, Lo/ail;->d()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x32

    invoke-virtual {v0, v1, v2}, Lo/flh;->d(Ljava/lang/String;I)Lo/flk;

    move-result-object v5

    .line 409
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 410
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v5}, Lo/fli;->b(Lo/flk;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 413
    invoke-virtual {v5}, Lo/flk;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ail;->e(Ljava/lang/String;)Lo/air;

    move-result-object v4

    goto :goto_0

    .line 415
    :cond_0
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "post: response is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 416
    const/4 v4, 0x0

    .line 418
    :goto_0
    invoke-interface {p3, v4}, Lo/aiq$d;->c(Lo/air;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 419
    monitor-exit v6

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v6

    throw p0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 4

    .line 363
    sget-object v0, Lo/ajb;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 364
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 365
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    .line 366
    return v1
.end method

.method static synthetic b()Lo/ajg;
    .locals 1

    .line 48
    sget-object v0, Lo/ajb;->c:Lo/ajg;

    return-object v0
.end method

.method static synthetic b(Lo/ail;)V
    .locals 0

    .line 48
    invoke-static {p0}, Lo/ajb;->c(Lo/ail;)V

    return-void
.end method

.method private static c(Lo/ail;)V
    .locals 7

    .line 120
    sget-object v4, Lo/ajb;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 121
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "coap://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/ajb;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x1633

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ail;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 123
    const-string v0, "CoapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createClient: uri is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 124
    sget-object v0, Lo/ajb;->c:Lo/ajg;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 125
    new-instance v0, Lo/ajg;

    invoke-direct {v0}, Lo/ajg;-><init>()V

    sput-object v0, Lo/ajb;->c:Lo/ajg;

    .line 127
    :cond_0
    sget-object v0, Lo/ajb;->c:Lo/ajg;

    invoke-virtual {v0, v5}, Lo/ajg;->d(Ljava/lang/String;)Lo/flh;

    .line 128
    sget-object v0, Lo/ajb;->c:Lo/ajg;

    iget-wide v1, p0, Lo/ail;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ajg;->d(Ljava/lang/Long;)Lo/flh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 130
    :goto_0
    return-void
.end method

.method public static c(Lo/ail;Lo/aiq$d;)V
    .locals 6

    .line 287
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 288
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 289
    return-void

    .line 291
    :cond_0
    sget-object v4, Lo/ajb;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 292
    :try_start_0
    new-instance v0, Lo/ajb$3;

    invoke-direct {v0, p0, p1}, Lo/ajb$3;-><init>(Lo/ail;Lo/aiq$d;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 321
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 322
    :goto_0
    return-void
.end method

.method public static d(Lo/ail;Ljava/lang/Integer;Lo/ain;Lo/aiq$d;)V
    .locals 4

    .line 392
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 393
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 394
    return-void

    .line 397
    :cond_0
    new-instance v0, Lo/ajb$1;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/ajb$1;-><init>(Lo/ail;Ljava/lang/Integer;Lo/ain;Lo/aiq$d;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 403
    return-void
.end method

.method public static d(Lo/ail;Lo/aiq$d;)V
    .locals 6

    .line 195
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 196
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 197
    return-void

    .line 199
    :cond_0
    sget-object v4, Lo/ajb;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 200
    :try_start_0
    new-instance v0, Lo/ajb$5;

    invoke-direct {v0, p0, p1}, Lo/ajb$5;-><init>(Lo/ail;Lo/aiq$d;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 244
    :goto_0
    return-void
.end method

.method private static e(Lo/ain;)Lo/flx;
    .locals 8

    .line 161
    if-nez p0, :cond_0

    .line 162
    const/4 v0, 0x0

    return-object v0

    .line 165
    :cond_0
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/security/cert/Certificate;

    .line 166
    const/4 v5, 0x0

    .line 168
    :try_start_0
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "root.pem"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v5

    .line 169
    const-string v0, "X.509"

    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v6

    .line 170
    invoke-virtual {v6, v5}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v7

    .line 171
    const/4 v0, 0x0

    aput-object v7, v4, v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 176
    goto :goto_0

    .line 172
    :catch_0
    move-exception v6

    .line 173
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 176
    goto :goto_0

    .line 174
    :catch_1
    move-exception v6

    .line 175
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/security/cert/CertificateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 178
    :goto_0
    new-instance v6, Lo/fpz$e;

    invoke-direct {v6}, Lo/fpz$e;-><init>()V

    .line 179
    new-instance v0, Ljava/net/InetSocketAddress;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/net/InetSocketAddress;-><init>(I)V

    invoke-virtual {v6, v0}, Lo/fpz$e;->d(Ljava/net/InetSocketAddress;)Lo/fpz$e;

    .line 180
    invoke-virtual {v6}, Lo/fpz$e;->a()Lo/fpz$e;

    .line 181
    new-instance v0, Lo/fsk;

    iget-object v1, p0, Lo/ain;->a:[B

    invoke-static {v1}, Lo/fss;->a([B)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ain;->b:[B

    invoke-direct {v0, v1, v2}, Lo/fsk;-><init>(Ljava/lang/String;[B)V

    invoke-virtual {v6, v0}, Lo/fpz$e;->b(Lo/fso;)Lo/fpz$e;

    .line 182
    invoke-virtual {v6, v4}, Lo/fpz$e;->a([Ljava/security/cert/Certificate;)Lo/fpz$e;

    .line 183
    const/4 v0, 0x1

    new-array v0, v0, [Lo/fsf;

    sget-object v1, Lo/fsf;->c:Lo/fsf;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v6, v0}, Lo/fpz$e;->c([Lo/fsf;)Lo/fpz$e;

    .line 185
    new-instance v7, Lo/fps;

    invoke-virtual {v6}, Lo/fpz$e;->d()Lo/fpz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v7, v0, v1}, Lo/fps;-><init>(Lo/fpz;Lo/fsd;)V

    .line 186
    new-instance v0, Lo/flx;

    invoke-static {}, Lo/fmw;->a()Lo/fmw;

    move-result-object v1

    invoke-direct {v0, v7, v1}, Lo/flx;-><init>(Lo/fov;Lo/fmw;)V

    return-object v0
.end method

.method public static e(Ljava/lang/String;)V
    .locals 2

    .line 106
    sget-object v0, Lo/ajb;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 108
    :try_start_0
    sput-object p0, Lo/ajb;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 110
    :goto_0
    return-void
.end method

.method private static e(Lo/ail;Ljava/lang/Integer;Lo/ain;)V
    .locals 7

    .line 138
    sget-object v4, Lo/ajb;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 140
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "coap://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/ajb;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ail;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 143
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "coap://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/ajb;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x1634

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ail;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 145
    :goto_0
    const-string v0, "CoapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createClient: uri is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 146
    sget-object v0, Lo/ajb;->e:Lo/flh;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 147
    new-instance v0, Lo/flh;

    invoke-direct {v0}, Lo/flh;-><init>()V

    sput-object v0, Lo/ajb;->e:Lo/flh;

    .line 149
    :cond_1
    sget-object v0, Lo/ajb;->e:Lo/flh;

    invoke-virtual {v0, v5}, Lo/flh;->d(Ljava/lang/String;)Lo/flh;

    .line 150
    sget-object v0, Lo/ajb;->e:Lo/flh;

    iget-wide v1, p0, Lo/ail;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/flh;->d(Ljava/lang/Long;)Lo/flh;

    .line 151
    invoke-static {p2}, Lo/ajb;->e(Lo/ain;)Lo/flx;

    move-result-object v0

    sput-object v0, Lo/ajb;->g:Lo/flx;

    .line 152
    sget-object v0, Lo/ajb;->e:Lo/flh;

    sget-object v1, Lo/ajb;->g:Lo/flx;

    invoke-virtual {v0, v1}, Lo/flh;->d(Lo/fmf;)Lo/flh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 154
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/ail;Ljava/lang/Integer;Lo/ain;Lo/aiq$d;)V
    .locals 0

    .line 48
    invoke-static {p0, p1, p2, p3}, Lo/ajb;->a(Lo/ail;Ljava/lang/Integer;Lo/ain;Lo/aiq$d;)V

    return-void
.end method

.method public static e(Lo/ail;Lo/aiq$d;)V
    .locals 6

    .line 254
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 255
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 256
    return-void

    .line 258
    :cond_0
    sget-object v4, Lo/ajb;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 259
    :try_start_0
    new-instance v0, Lo/ajb$2;

    invoke-direct {v0, p0, p1}, Lo/ajb$2;-><init>(Lo/ail;Lo/aiq$d;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 283
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 284
    :goto_0
    return-void
.end method
