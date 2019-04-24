.class public Lo/ebb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static e:Lo/ebb;


# instance fields
.field private b:Ljava/util/concurrent/ExecutorService;

.field private c:Landroid/content/Context;

.field private d:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Lo/eay;Lo/eba;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/ebb;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/ebb;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 63
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/ebb;->b:Ljava/util/concurrent/ExecutorService;

    .line 64
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ebb;->c:Landroid/content/Context;

    .line 65
    return-void
.end method

.method private a(Lo/eay;Lo/eba;)I
    .locals 4

    .line 238
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start to downloadFile: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/eay;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    invoke-virtual {p1}, Lo/eay;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 240
    invoke-virtual {p1}, Lo/eay;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ebb;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download http"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    invoke-direct {p0, p1, p2}, Lo/ebb;->d(Lo/eay;Lo/eba;)I

    move-result v0

    return v0

    .line 246
    :cond_0
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download https"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    invoke-direct {p0, p1, p2}, Lo/ebb;->e(Lo/eay;Lo/eba;)I

    move-result v0

    return v0

    .line 250
    :cond_1
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "http url isEmpty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    const/4 v0, -0x1

    return v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 578
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 579
    const/4 v0, 0x0

    return-object v0

    .line 582
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x5b

    if-ne v0, v1, :cond_1

    .line 583
    invoke-direct {p0, p1, p2}, Lo/ebb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 586
    :cond_1
    invoke-direct {p0, p1}, Lo/ebb;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lo/eay;)Ljava/lang/String;
    .locals 5

    .line 256
    invoke-virtual {p1}, Lo/eay;->h()Ljava/lang/String;

    move-result-object v4

    .line 257
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 258
    return-object v4

    .line 261
    :cond_0
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start to downloadFile: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/eay;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    invoke-virtual {p1}, Lo/eay;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 263
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "http url isEmpty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    const/4 v0, 0x0

    return-object v0

    .line 267
    :cond_1
    invoke-virtual {p1}, Lo/eay;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ebb;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 269
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download http"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    invoke-direct {p0, p1}, Lo/ebb;->h(Lo/eay;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 273
    :cond_2
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download https"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    invoke-direct {p0, p1}, Lo/ebb;->g(Lo/eay;)Ljava/lang/String;

    move-result-object v4

    .line 277
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 278
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .line 280
    :cond_3
    const/4 v4, 0x0

    .line 283
    :goto_1
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileUrlJson is :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    return-object v4
.end method

.method private a(Ljava/io/Closeable;)V
    .locals 5

    .line 590
    if-eqz p1, :cond_0

    .line 592
    :try_start_0
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 595
    goto :goto_0

    .line 593
    :catch_0
    move-exception v4

    .line 594
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close stream IoException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 597
    :cond_0
    :goto_0
    return-void
.end method

.method static synthetic a(Lo/ebb;Lo/eay;Lo/eba;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2}, Lo/ebb;->b(Lo/eay;Lo/eba;)V

    return-void
.end method

.method public static b()Lo/ebb;
    .locals 4

    .line 54
    sget-object v2, Lo/ebb;->a:Ljava/lang/Object;

    monitor-enter v2

    .line 55
    :try_start_0
    sget-object v0, Lo/ebb;->e:Lo/ebb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 56
    new-instance v0, Lo/ebb;

    invoke-direct {v0}, Lo/ebb;-><init>()V

    sput-object v0, Lo/ebb;->e:Lo/ebb;

    .line 58
    :cond_0
    sget-object v0, Lo/ebb;->e:Lo/ebb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 59
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private b(Lo/eay;Lo/eba;)V
    .locals 11

    .line 158
    invoke-direct {p0, p1}, Lo/ebb;->c(Lo/eay;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lo/eba;->a:Ljava/lang/String;

    .line 159
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pathname is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p2, Lo/eba;->a:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    invoke-direct {p0, p1}, Lo/ebb;->a(Lo/eay;)Ljava/lang/String;

    move-result-object v4

    .line 161
    const/4 v0, 0x0

    if-eq v0, v4, :cond_c

    .line 162
    invoke-virtual {p2, v4}, Lo/eba;->c(Ljava/lang/String;)V

    .line 163
    invoke-virtual {p1}, Lo/eay;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lo/ebb;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 164
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileUrlResult is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    const/4 v0, 0x0

    if-eq v0, v5, :cond_b

    .line 166
    invoke-virtual {p1, v5}, Lo/eay;->e(Ljava/lang/String;)V

    .line 167
    invoke-direct {p0, p1, p2}, Lo/ebb;->a(Lo/eay;Lo/eba;)I

    move-result v6

    .line 168
    if-nez v6, :cond_8

    .line 169
    const/4 v0, 0x1

    iput v0, p2, Lo/eba;->c:I

    .line 171
    invoke-virtual {p1}, Lo/eay;->b()Ljava/lang/String;

    move-result-object v7

    .line 172
    if-eqz v7, :cond_2

    .line 173
    invoke-static {}, Lo/ebc;->e()Lo/ebc;

    move-result-object v0

    iget-object v1, p2, Lo/eba;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/ebc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 174
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "digest is ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const-string v2, " hashcode is ="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 177
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hashcode checkout failure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    new-instance v9, Ljava/io/File;

    iget-object v0, p2, Lo/eba;->a:Ljava/lang/String;

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 179
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    .line 181
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFile is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    :cond_0
    const/4 v0, -0x6

    iput v0, p2, Lo/eba;->c:I

    .line 184
    invoke-virtual {p1, p2}, Lo/eay;->e(Lo/eba;)V

    .line 185
    return-void

    .line 187
    :cond_1
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hashcode checkout success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    :cond_2
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resource type : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Lo/eay;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    iget v0, p1, Lo/eay;->c:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 192
    iget-object v8, p2, Lo/eba;->a:Ljava/lang/String;

    .line 193
    iget v0, p1, Lo/eay;->c:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p2, Lo/eba;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".d"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lo/eba;->a:Ljava/lang/String;

    goto :goto_0

    .line 196
    :cond_3
    invoke-direct {p0, p1}, Lo/ebb;->c(Lo/eay;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lo/eba;->a:Ljava/lang/String;

    .line 199
    :goto_0
    invoke-static {}, Lo/ebc;->e()Lo/ebc;

    move-result-object v0

    iget-object v1, p2, Lo/eba;->a:Ljava/lang/String;

    invoke-virtual {v0, v8, v1}, Lo/ebc;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    .line 200
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decryptFile failure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    const/4 v0, -0x6

    iput v0, p2, Lo/eba;->c:I

    .line 205
    :cond_4
    iget v0, p1, Lo/eay;->c:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 206
    invoke-static {}, Lo/ebc;->e()Lo/ebc;

    move-result-object v0

    iget-object v1, p2, Lo/eba;->a:Ljava/lang/String;

    iget-object v2, p1, Lo/eay;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/ebc;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_7

    .line 207
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unzip failure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    const/4 v0, -0x6

    iput v0, p2, Lo/eba;->c:I

    goto :goto_1

    .line 211
    :cond_5
    iget v0, p1, Lo/eay;->c:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    goto :goto_1

    .line 215
    :cond_6
    iget-object v0, p2, Lo/eba;->a:Ljava/lang/String;

    iget-object v1, p1, Lo/eay;->d:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/ebb;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    :cond_7
    :goto_1
    goto :goto_2

    :cond_8
    const/4 v0, -0x3

    if-ne v6, v0, :cond_9

    .line 219
    const/4 v0, -0x3

    iput v0, p2, Lo/eba;->c:I

    goto :goto_2

    .line 220
    :cond_9
    const/16 v0, -0xa

    if-ne v6, v0, :cond_a

    .line 221
    const/16 v0, -0xa

    iput v0, p2, Lo/eba;->c:I

    goto :goto_2

    .line 223
    :cond_a
    const/4 v0, -0x1

    iput v0, p2, Lo/eba;->c:I

    .line 225
    :goto_2
    goto :goto_3

    .line 226
    :cond_b
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileUrlResult is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    const/4 v0, -0x5

    iput v0, p2, Lo/eba;->c:I

    .line 229
    :goto_3
    goto :goto_4

    .line 230
    :cond_c
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileUrlJson is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    const/4 v0, -0x1

    iput v0, p2, Lo/eba;->c:I

    .line 233
    :goto_4
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "result status : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p2, Lo/eba;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    invoke-virtual {p1, p2}, Lo/eay;->e(Lo/eba;)V

    .line 235
    return-void
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 6

    .line 644
    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 645
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 646
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHttpProtocol protocol:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    const-string v0, "http"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 649
    const/4 v0, 0x1

    return v0

    .line 651
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 551
    const/4 v4, 0x0

    .line 552
    :try_start_0
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 553
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 554
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 556
    const-string v0, "fileId"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 557
    const-string v0, "fileId"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 558
    goto :goto_1

    .line 562
    :cond_0
    const/4 v4, 0x0

    .line 553
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 565
    :cond_1
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    const-string v0, "downloadUrl"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 566
    const-string v0, "downloadUrl"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 568
    :cond_2
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonObject url key is null, text="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 569
    const/4 v0, 0x0

    return-object v0

    .line 571
    :catch_0
    move-exception v4

    .line 572
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parse fileUrlJson exception, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    const/4 v0, 0x0

    return-object v0
.end method

.method private c(Lo/eay;)Ljava/lang/String;
    .locals 6

    .line 148
    iget v0, p1, Lo/eay;->c:I

    and-int/lit8 v0, v0, 0x6

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 149
    iget-object v0, p0, Lo/ebb;->c:Landroid/content/Context;

    const-string v1, "cache"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v4

    .line 150
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->pathSeparator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ebb;->c:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p1, Lo/eay;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lo/eay;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/dbm;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 153
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Lo/eay;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".tmp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Lo/eay;Lo/eba;)I
    .locals 14

    .line 405
    const/4 v4, 0x0

    .line 406
    const/4 v5, 0x0

    .line 407
    const/4 v6, 0x0

    .line 409
    :try_start_0
    new-instance v7, Ljava/net/URL;

    invoke-virtual {p1}, Lo/eay;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 411
    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v4, v0

    .line 412
    const/16 v0, 0x1b58

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 413
    const/16 v0, 0x2710

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 414
    const-string v0, "GET"

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 415
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8

    .line 416
    const/16 v0, 0xc8

    if-ne v0, v8, :cond_8

    .line 417
    new-instance v9, Ljava/io/File;

    move-object/from16 v0, p2

    iget-object v0, v0, Lo/eba;->a:Ljava/lang/String;

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 418
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 419
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    .line 420
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFo is ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 422
    :cond_0
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 423
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    .line 424
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeParentFile is ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    :cond_1
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_2

    .line 427
    invoke-virtual {v9}, Ljava/io/File;->createNewFile()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    .line 428
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createNewFile is ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    :cond_2
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 431
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 432
    const/16 v0, 0x400

    new-array v10, v0, [B

    .line 434
    :goto_0
    invoke-virtual {v5, v10}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v11, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 435
    move-object/from16 v0, p2

    iget v0, v0, Lo/eba;->e:I

    add-int/2addr v0, v11

    move-object/from16 v1, p2

    iput v0, v1, Lo/eba;->e:I

    .line 436
    const/4 v0, 0x0

    invoke-virtual {v6, v10, v0, v11}, Ljava/io/FileOutputStream;->write([BII)V

    .line 437
    move-object/from16 v0, p2

    iget v0, v0, Lo/eba;->c:I

    const/16 v1, -0xa

    if-ne v0, v1, :cond_3

    .line 438
    iget-object v0, p0, Lo/ebb;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    goto :goto_1

    .line 441
    :cond_3
    move-object/from16 v0, p2

    invoke-virtual {p1, v0}, Lo/eay;->e(Lo/eba;)V

    goto :goto_0

    .line 444
    :cond_4
    :goto_1
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->flush()V

    .line 445
    move-object/from16 v0, p2

    iget v0, v0, Lo/eba;->c:I

    const/16 v1, -0xa

    if-ne v0, v1, :cond_6

    .line 446
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancle download task"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 447
    const/16 v12, -0xa

    .line 459
    invoke-direct {p0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 460
    invoke-direct {p0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 461
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 462
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 447
    :cond_5
    return v12

    .line 449
    :cond_6
    const/4 v12, 0x0

    .line 459
    invoke-direct {p0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 460
    invoke-direct {p0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 461
    const/4 v0, 0x0

    if-eq v0, v4, :cond_7

    .line 462
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 449
    :cond_7
    return v12

    .line 452
    :cond_8
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "httpDownloadFile ConRspCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 453
    const/4 v9, -0x3

    .line 459
    invoke-direct {p0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 460
    invoke-direct {p0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 461
    const/4 v0, 0x0

    if-eq v0, v4, :cond_9

    .line 462
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 453
    :cond_9
    return v9

    .line 455
    :catch_0
    move-exception v7

    .line 456
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "download IOEexception"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 457
    const/4 v8, -0x1

    .line 459
    invoke-direct {p0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 460
    invoke-direct {p0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 461
    const/4 v0, 0x0

    if-eq v0, v4, :cond_a

    .line 462
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 457
    :cond_a
    return v8

    .line 459
    :catchall_0
    move-exception v13

    invoke-direct {p0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 460
    invoke-direct {p0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 461
    const/4 v0, 0x0

    if-eq v0, v4, :cond_b

    .line 462
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 464
    :cond_b
    throw v13
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 536
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 537
    const-string v0, "downloadUrl"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 538
    const-string v0, "downloadUrl"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 540
    :cond_0
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonObject url key is null, text="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 541
    const/4 v0, 0x0

    return-object v0

    .line 543
    :catch_0
    move-exception v4

    .line 544
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parse fileUrlJson exception, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 545
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic d(Lo/ebb;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/ebb;->d:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    .line 600
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "oldPath is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destPath is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 602
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 603
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 604
    const/4 v6, 0x0

    .line 605
    const/4 v7, 0x0

    .line 607
    :try_start_0
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 608
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    .line 609
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFile is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 611
    :cond_0
    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 612
    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    .line 613
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mkdirFile is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    :cond_1
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_2

    .line 616
    invoke-virtual {v5}, Ljava/io/File;->createNewFile()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    .line 617
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createNewFile is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    :cond_2
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v7, v0

    .line 620
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 621
    const/16 v0, 0x400

    new-array v8, v0, [B

    .line 623
    :goto_0
    invoke-virtual {v7, v8}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v9, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 624
    const/4 v0, 0x0

    invoke-virtual {v6, v8, v0, v9}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_0

    .line 626
    :cond_3
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 630
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 631
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v8

    .line 632
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeleteSuc: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    :cond_4
    invoke-direct {p0, v7}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 635
    invoke-direct {p0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 636
    goto/16 :goto_1

    .line 627
    :catch_0
    move-exception v8

    .line 628
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "remove file IoException,is = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 630
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 631
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v8

    .line 632
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeleteSuc: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    :cond_5
    invoke-direct {p0, v7}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 635
    invoke-direct {p0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 636
    goto :goto_1

    .line 630
    :catchall_0
    move-exception v10

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 631
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v11

    .line 632
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeleteSuc: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    :cond_6
    invoke-direct {p0, v7}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 635
    invoke-direct {p0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 636
    throw v10

    .line 637
    :goto_1
    return-void
.end method

.method private e(Lo/eay;Lo/eba;)I
    .locals 14

    .line 468
    const/4 v4, 0x0

    .line 469
    const/4 v5, 0x0

    .line 470
    const/4 v6, 0x0

    .line 472
    :try_start_0
    new-instance v7, Ljava/net/URL;

    invoke-virtual {p1}, Lo/eay;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 473
    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    move-object v4, v0

    .line 476
    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 477
    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 479
    const/16 v0, 0x1b58

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 480
    const/16 v0, 0x2710

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 481
    const-string v0, "GET"

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 482
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v8

    .line 483
    const/16 v0, 0xc8

    if-ne v0, v8, :cond_8

    .line 484
    new-instance v9, Ljava/io/File;

    move-object/from16 v0, p2

    iget-object v0, v0, Lo/eba;->a:Ljava/lang/String;

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 485
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 486
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    .line 487
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFo is ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 489
    :cond_0
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 490
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    .line 491
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeParentFile is ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 493
    :cond_1
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_2

    .line 494
    invoke-virtual {v9}, Ljava/io/File;->createNewFile()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    .line 495
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createNewFile is ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    :cond_2
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 498
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 499
    const/16 v0, 0x400

    new-array v10, v0, [B

    .line 501
    :goto_0
    invoke-virtual {v5, v10}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v11, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 502
    move-object/from16 v0, p2

    iget v0, v0, Lo/eba;->e:I

    add-int/2addr v0, v11

    move-object/from16 v1, p2

    iput v0, v1, Lo/eba;->e:I

    .line 503
    const/4 v0, 0x0

    invoke-virtual {v6, v10, v0, v11}, Ljava/io/FileOutputStream;->write([BII)V

    .line 504
    move-object/from16 v0, p2

    iget v0, v0, Lo/eba;->c:I

    const/16 v1, -0xa

    if-ne v0, v1, :cond_3

    .line 505
    iget-object v0, p0, Lo/ebb;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    goto :goto_1

    .line 508
    :cond_3
    move-object/from16 v0, p2

    invoke-virtual {p1, v0}, Lo/eay;->e(Lo/eba;)V

    goto :goto_0

    .line 511
    :cond_4
    :goto_1
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->flush()V

    .line 512
    move-object/from16 v0, p2

    iget v0, v0, Lo/eba;->c:I

    const/16 v1, -0xa

    if-ne v0, v1, :cond_6

    .line 513
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancle download task"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 514
    const/16 v12, -0xa

    .line 526
    invoke-direct {p0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 527
    invoke-direct {p0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 528
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 529
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 514
    :cond_5
    return v12

    .line 516
    :cond_6
    const/4 v12, 0x0

    .line 526
    invoke-direct {p0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 527
    invoke-direct {p0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 528
    const/4 v0, 0x0

    if-eq v0, v4, :cond_7

    .line 529
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 516
    :cond_7
    return v12

    .line 519
    :cond_8
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "httpsDownloadFile ConRspCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 520
    const/4 v9, -0x3

    .line 526
    invoke-direct {p0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 527
    invoke-direct {p0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 528
    const/4 v0, 0x0

    if-eq v0, v4, :cond_9

    .line 529
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 520
    :cond_9
    return v9

    .line 522
    :catch_0
    move-exception v7

    .line 523
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "download IOEexception"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 524
    const/4 v8, -0x1

    .line 526
    invoke-direct {p0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 527
    invoke-direct {p0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 528
    const/4 v0, 0x0

    if-eq v0, v4, :cond_a

    .line 529
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 524
    :cond_a
    return v8

    .line 526
    :catchall_0
    move-exception v13

    invoke-direct {p0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 527
    invoke-direct {p0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 528
    const/4 v0, 0x0

    if-eq v0, v4, :cond_b

    .line 529
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 531
    :cond_b
    throw v13
.end method

.method private g(Lo/eay;)Ljava/lang/String;
    .locals 16

    .line 346
    const/4 v4, 0x0

    .line 347
    const/4 v5, 0x0

    .line 348
    const/4 v6, 0x0

    .line 349
    const/4 v7, 0x0

    .line 351
    :try_start_0
    new-instance v8, Ljava/net/URL;

    invoke-virtual/range {p1 .. p1}, Lo/eay;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 352
    invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    move-object v4, v0

    .line 355
    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 356
    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 358
    const/16 v0, 0x1b58

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 359
    const/16 v0, 0x2710

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 360
    const-string v0, "POST"

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 361
    const-string v0, "Content-Type"

    const-string v1, "application/json"

    invoke-virtual {v4, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setUseCaches(Z)V

    .line 363
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    .line 364
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    .line 365
    invoke-virtual/range {p1 .. p1}, Lo/eay;->a()Ljava/lang/String;

    move-result-object v9

    .line 366
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "https postRequest param = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 368
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v7, v0

    .line 369
    const-string v0, "UTF-8"

    invoke-virtual {v9, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/io/OutputStream;->write([B)V

    .line 370
    invoke-virtual {v7}, Ljava/io/OutputStream;->flush()V

    goto :goto_0

    .line 372
    :cond_0
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "https postRequest parm is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    :goto_0
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->connect()V

    .line 375
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v10

    .line 376
    const/16 v0, 0xc8

    if-ne v0, v10, :cond_3

    .line 377
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v6, v0

    .line 378
    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v5, v0

    .line 379
    new-instance v11, Ljava/lang/StringBuffer;

    const/16 v0, 0x400

    invoke-direct {v11, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 381
    const/16 v0, 0x400

    new-array v13, v0, [C

    .line 382
    :goto_1
    const/4 v0, 0x0

    const/16 v1, 0x400

    invoke-virtual {v5, v13, v0, v1}, Ljava/io/InputStreamReader;->read([CII)I

    move-result v0

    move v12, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_1

    .line 383
    const/4 v0, 0x0

    invoke-virtual {v11, v13, v0, v12}, Ljava/lang/StringBuffer;->append([CII)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 385
    :cond_1
    invoke-virtual {v11}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v14

    .line 395
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 396
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 397
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 398
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 399
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 385
    :cond_2
    return-object v14

    .line 387
    :cond_3
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFileURLHttps ConRspCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 388
    const/4 v11, 0x0

    .line 395
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 396
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 397
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 398
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 399
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 388
    :cond_4
    return-object v11

    .line 390
    :catch_0
    move-exception v8

    .line 391
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download IOEexception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    const-string v0, "PluginDevice_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download IOEexception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 393
    const/4 v9, 0x0

    .line 395
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 396
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 397
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 398
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 399
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 393
    :cond_5
    return-object v9

    .line 395
    :catchall_0
    move-exception v15

    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 396
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 397
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 398
    const/4 v0, 0x0

    if-eq v0, v4, :cond_6

    .line 399
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 401
    :cond_6
    throw v15
.end method

.method private h(Lo/eay;)Ljava/lang/String;
    .locals 17

    .line 289
    const/4 v4, 0x0

    .line 290
    const/4 v5, 0x0

    .line 291
    const/4 v6, 0x0

    .line 292
    const/4 v7, 0x0

    .line 293
    const/4 v8, 0x0

    .line 295
    :try_start_0
    new-instance v9, Ljava/net/URL;

    invoke-virtual/range {p1 .. p1}, Lo/eay;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 297
    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v4, v0

    .line 298
    const/16 v0, 0x1b58

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 299
    const/16 v0, 0x2710

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 300
    const-string v0, "POST"

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 301
    const-string v0, "Content-Type"

    const-string v1, "application/json"

    invoke-virtual {v4, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 303
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 304
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 305
    invoke-virtual/range {p1 .. p1}, Lo/eay;->a()Ljava/lang/String;

    move-result-object v10

    .line 306
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "https postRequest param = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    const/4 v0, 0x0

    if-eq v0, v10, :cond_0

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 308
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v8, v0

    .line 309
    const-string v0, "UTF-8"

    invoke-virtual {v10, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/io/OutputStream;->write([B)V

    .line 310
    invoke-virtual {v8}, Ljava/io/OutputStream;->flush()V

    goto :goto_0

    .line 312
    :cond_0
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpUtil postRequest parm is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    :goto_0
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->connect()V

    .line 315
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v11

    .line 316
    const/16 v0, 0xc8

    if-ne v0, v11, :cond_3

    .line 317
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v7, v0

    .line 318
    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "UTF-8"

    invoke-direct {v0, v7, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v6, v0

    .line 319
    new-instance v12, Ljava/lang/StringBuffer;

    const/16 v0, 0x400

    invoke-direct {v12, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 321
    const/16 v0, 0x400

    new-array v14, v0, [C

    .line 322
    :goto_1
    const/4 v0, 0x0

    const/16 v1, 0x400

    invoke-virtual {v6, v14, v0, v1}, Ljava/io/InputStreamReader;->read([CII)I

    move-result v0

    move v13, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_1

    .line 323
    const/4 v0, 0x0

    invoke-virtual {v12, v14, v0, v13}, Ljava/lang/StringBuffer;->append([CII)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 325
    :cond_1
    invoke-virtual {v12}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v15

    .line 335
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 336
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 337
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 338
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 339
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 340
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 325
    :cond_2
    return-object v15

    .line 327
    :cond_3
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFileURLHttp ConRspCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 328
    const/4 v12, 0x0

    .line 335
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 336
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 337
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 338
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 339
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 340
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 328
    :cond_4
    return-object v12

    .line 330
    :catch_0
    move-exception v9

    .line 331
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download IOEexception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    const-string v0, "PluginDevice_FilePuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download IOEexception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 333
    const/4 v10, 0x0

    .line 335
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 336
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 337
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 338
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 339
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 340
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 333
    :cond_5
    return-object v10

    .line 335
    :catchall_0
    move-exception v16

    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 336
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 337
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 338
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lo/ebb;->a(Ljava/io/Closeable;)V

    .line 339
    const/4 v0, 0x0

    if-eq v0, v4, :cond_6

    .line 340
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 342
    :cond_6
    throw v16
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/eay;>;"
        }
    .end annotation

    .line 658
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 659
    iget-object v0, p0, Lo/ebb;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/eay;

    .line 660
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 661
    goto :goto_0

    .line 662
    :cond_0
    return-object v1
.end method

.method public b(Lo/eay;)V
    .locals 2

    .line 100
    iget-object v0, p0, Lo/ebb;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/eba;

    .line 101
    if-eqz v1, :cond_0

    .line 102
    iget v0, v1, Lo/eba;->c:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 104
    :pswitch_0
    const/16 v0, -0xa

    iput v0, v1, Lo/eba;->c:I

    .line 105
    iget-object v0, p0, Lo/ebb;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    goto :goto_0

    .line 110
    :pswitch_1
    const/16 v0, -0xa

    iput v0, v1, Lo/eba;->c:I

    .line 111
    goto :goto_0

    .line 119
    :pswitch_2
    const/16 v0, -0xa

    iput v0, v1, Lo/eba;->c:I

    .line 120
    iget-object v0, p0, Lo/ebb;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 126
    :cond_0
    :goto_0
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch -0x8
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public d(Lo/eay;)V
    .locals 5

    .line 73
    new-instance v4, Lo/eba;

    invoke-direct {v4}, Lo/eba;-><init>()V

    .line 74
    const/4 v0, 0x0

    iput v0, v4, Lo/eba;->e:I

    .line 75
    const/4 v0, -0x8

    iput v0, v4, Lo/eba;->c:I

    .line 76
    const-string v0, "EzPlugin_FilePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6587\u4ef6\u603b\u5927\u5c0f"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/eay;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    invoke-virtual {p1}, Lo/eay;->d()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/eba;->a(I)V

    .line 78
    iget-object v0, p0, Lo/ebb;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    iget-object v0, p0, Lo/ebb;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ebb$5;

    invoke-direct {v1, p0, p1}, Lo/ebb$5;-><init>(Lo/ebb;Lo/eay;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 92
    return-void
.end method

.method public e(Lo/eay;)Lo/eba;
    .locals 3

    .line 135
    iget-object v0, p0, Lo/ebb;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eba;

    .line 136
    if-nez v2, :cond_0

    .line 137
    new-instance v2, Lo/eba;

    invoke-direct {v2}, Lo/eba;-><init>()V

    .line 138
    const/4 v0, 0x0

    iput v0, v2, Lo/eba;->e:I

    .line 139
    const/4 v0, -0x7

    iput v0, v2, Lo/eba;->c:I

    goto :goto_0

    .line 140
    :cond_0
    iget v0, v2, Lo/eba;->c:I

    if-eqz v0, :cond_1

    iget v0, v2, Lo/eba;->c:I

    const/4 v1, -0x8

    if-eq v0, v1, :cond_1

    .line 141
    iget-object v0, p0, Lo/ebb;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    :cond_1
    :goto_0
    return-object v2
.end method
