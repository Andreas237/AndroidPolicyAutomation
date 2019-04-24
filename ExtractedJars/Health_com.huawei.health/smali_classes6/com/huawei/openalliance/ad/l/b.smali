.class public Lcom/huawei/openalliance/ad/l/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/l/b$a;
    }
.end annotation


# static fields
.field private static final c:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lcom/huawei/openalliance/ad/l/a;

.field private b:Ljava/lang/String;

.field private d:Lcom/huawei/openalliance/ad/l/c;

.field private e:Lcom/huawei/openalliance/ad/d/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/LinkedHashMap;

    const/4 v1, 0x0

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    sput-object v0, Lcom/huawei/openalliance/ad/l/b;->c:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/l/c;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ab;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "hiad"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/l/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/l/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/l/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->b:Ljava/lang/String;

    :cond_0
    new-instance v2, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->b:Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    move-result v3

    if-nez v3, :cond_1

    const-string v0, "SourceFetcher"

    const-string v1, "SourceFetcher mkdirs failed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/net/http/d$a;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/net/http/d$a;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/net/http/d$a;->a()Lcom/huawei/openalliance/ad/net/http/d;

    move-result-object v3

    const-class v0, Lcom/huawei/openalliance/ad/l/a;

    invoke-virtual {v3, v0}, Lcom/huawei/openalliance/ad/net/http/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/l/a;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->a:Lcom/huawei/openalliance/ad/l/a;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/l/b;->d:Lcom/huawei/openalliance/ad/l/c;

    new-instance v0, Lcom/huawei/openalliance/ad/d/b;

    invoke-direct {v0, p1}, Lcom/huawei/openalliance/ad/d/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->e:Lcom/huawei/openalliance/ad/d/a/a;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/l/c;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->d:Lcom/huawei/openalliance/ad/l/c;

    return-object v0
.end method

.method private a(Ljava/lang/Object;)Lcom/huawei/openalliance/ad/l/d;
    .locals 12

    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/huawei/openalliance/ad/l/c;

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "SourceFetcher"

    const-string v1, "downloadFile - data is null or not SourceParam"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    move-object v5, p1

    check-cast v5, Lcom/huawei/openalliance/ad/l/c;

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/l/c;->e()Ljava/lang/String;

    move-result-object v6

    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    const-string v0, "SourceFetcher"

    const-string v1, "downloadFile - file url is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_2
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "SourceFetcher"

    const-string v1, "download file: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/ak;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    invoke-static {v6}, Lcom/huawei/openalliance/ad/l/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/l/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v8}, Lcom/huawei/openalliance/ad/utils/i;->d(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "SourceFetcher"

    const-string v1, "download file from local"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v8}, Lcom/huawei/openalliance/ad/utils/i;->c(Ljava/io/File;)V

    new-instance v9, Lcom/huawei/openalliance/ad/l/d;

    invoke-direct {v9}, Lcom/huawei/openalliance/ad/l/d;-><init>()V

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/openalliance/ad/l/d;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lcom/huawei/openalliance/ad/l/d;->a(Z)V

    return-object v9

    :cond_4
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v6, v0, v9, v10}, Lcom/huawei/openalliance/ad/l/b;->a(Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "SourceFetcher"

    const-string v1, "download file from network"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->e:Lcom/huawei/openalliance/ad/d/a/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/l/b;->d:Lcom/huawei/openalliance/ad/l/c;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/l/c;->e()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/l/b;->d:Lcom/huawei/openalliance/ad/l/c;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/l/c;->g()Ljava/lang/Long;

    move-result-object v2

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/openalliance/ad/l/b;->d:Lcom/huawei/openalliance/ad/l/c;

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/l/c;->h()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/huawei/openalliance/ad/d/a/a;->a(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    new-instance v11, Lcom/huawei/openalliance/ad/l/d;

    invoke-direct {v11}, Lcom/huawei/openalliance/ad/l/d;-><init>()V

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/openalliance/ad/l/d;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lcom/huawei/openalliance/ad/l/d;->a(Z)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-object v11

    :cond_5
    goto :goto_0

    :catch_0
    move-exception v9

    invoke-static {v8}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/io/File;)Z

    const-string v0, "SourceFetcher"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downloadFile RuntimeException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v9

    invoke-static {v8}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/io/File;)Z

    const-string v0, "SourceFetcher"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downloadFile Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/l;->a([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method private a(J)V
    .locals 5

    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->b:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v4}, Ljava/io/File;->getFreeSpace()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "SourceFetcher"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "free disk space is: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/io/File;->getFreeSpace()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->b:Ljava/lang/String;

    const v1, 0x3e99999a    # 0.3f

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/lang/String;F)V

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/l/b;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/l/b;->a(J)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/l/b;Ljava/lang/String;Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/l/b;->a(Ljava/lang/String;Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;Ljava/io/File;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;Ljava/io/File;)V
    .locals 1

    invoke-static {p3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {p2}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {p4}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/io/File;)Z

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 12

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/l/b;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "SourceFetcher"

    const-string v1, "downloadUrlToStream, checkSourceDataAndFileState failed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/l/b;->c(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->a:Lcom/huawei/openalliance/ad/l/a;

    new-instance v1, Lcom/huawei/openalliance/ad/l/b$a;

    move-object v2, p0

    move-object v3, p2

    move-object v4, p1

    move-wide v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/huawei/openalliance/ad/l/b$a;-><init>(Lcom/huawei/openalliance/ad/l/b;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-interface {v0, p1, v1}, Lcom/huawei/openalliance/ad/l/a;->a(Ljava/lang/String;Lcom/huawei/openalliance/ad/net/http/b/b/d;)Lcom/huawei/openalliance/ad/net/http/Response;

    move-result-object v7

    invoke-virtual {v7}, Lcom/huawei/openalliance/ad/net/http/Response;->a()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->e:Lcom/huawei/openalliance/ad/d/a/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/l/b;->d:Lcom/huawei/openalliance/ad/l/c;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/l/c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/openalliance/ad/net/http/Response;->a()I

    move-result v2

    invoke-virtual {v7}, Lcom/huawei/openalliance/ad/net/http/Response;->d()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/openalliance/ad/l/b;->d:Lcom/huawei/openalliance/ad/l/c;

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/l/c;->g()Ljava/lang/Long;

    move-result-object v4

    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iget-object v6, p0, Lcom/huawei/openalliance/ad/l/b;->d:Lcom/huawei/openalliance/ad/l/c;

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/l/c;->h()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v6

    invoke-interface/range {v0 .. v6}, Lcom/huawei/openalliance/ad/d/a/a;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    :cond_1
    invoke-virtual {v7}, Lcom/huawei/openalliance/ad/net/http/Response;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Boolean;

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    goto :goto_0

    :cond_2
    const/4 v9, 0x0

    :goto_0
    const-string v0, "SourceFetcher"

    const-string v1, "file download result: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v10, v9

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/l/b;->d(Ljava/lang/String;)V

    return v10

    :catch_0
    move-exception v7

    const-string v0, "SourceFetcher"

    const-string v1, "Error in download file - IllegalArgumentException"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0, v7}, Lcom/huawei/openalliance/ad/g/c;->a(ILjava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/l/b;->d(Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v7

    const-string v0, "SourceFetcher"

    const-string v1, "Error in download file"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0, v7}, Lcom/huawei/openalliance/ad/g/c;->a(ILjava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/l/b;->d(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v11

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/l/b;->d(Ljava/lang/String;)V

    throw v11

    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/l/b;)Lcom/huawei/openalliance/ad/d/a/a;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->e:Lcom/huawei/openalliance/ad/d/a/a;

    return-object v0
.end method

.method private declared-synchronized b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/l/b;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized c(Ljava/lang/String;)V
    .locals 3

    monitor-enter p0

    const-string v0, "SourceFetcher"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "addLoadingImages, key:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ak;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/huawei/openalliance/ad/l/b;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, p1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized d(Ljava/lang/String;)V
    .locals 3

    monitor-enter p0

    const-string v0, "SourceFetcher"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "removeLoadingImages, key:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ak;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/huawei/openalliance/ad/l/b;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private e(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->d:Lcom/huawei/openalliance/ad/l/c;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v0, "SourceFetcher"

    const-string v1, "checkSourceDataAndFileState, source error"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/l/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v0, "SourceFetcher"

    const-string v1, "file is in progress"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a()Lcom/huawei/openalliance/ad/l/d;
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/b;->d:Lcom/huawei/openalliance/ad/l/c;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/l/b;->a(Ljava/lang/Object;)Lcom/huawei/openalliance/ad/l/d;

    move-result-object v1

    return-object v1
.end method
