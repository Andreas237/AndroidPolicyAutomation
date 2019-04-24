.class public Lcom/tencent/open/a/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lcom/tencent/open/a/f;

.field protected static final c:Lcom/tencent/open/a/b;


# instance fields
.field protected b:Lcom/tencent/open/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 34
    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/open/a/f;->a:Lcom/tencent/open/a/f;

    .line 40
    sget v12, Lcom/tencent/open/a/c;->r:I

    .line 41
    sget-wide v13, Lcom/tencent/open/a/c;->s:J

    .line 43
    invoke-static {}, Lcom/tencent/open/a/f;->c()Ljava/io/File;

    move-result-object v15

    .line 45
    new-instance v0, Lcom/tencent/open/a/b;

    sget v3, Lcom/tencent/open/a/c;->l:I

    sget v4, Lcom/tencent/open/a/c;->m:I

    sget-object v5, Lcom/tencent/open/a/c;->g:Ljava/lang/String;

    sget v1, Lcom/tencent/open/a/c;->n:I

    int-to-long v6, v1

    sget-object v9, Lcom/tencent/open/a/c;->j:Ljava/lang/String;

    move-object v1, v15

    move v2, v12

    const/16 v8, 0xa

    move-wide v10, v13

    invoke-direct/range {v0 .. v11}, Lcom/tencent/open/a/b;-><init>(Ljava/io/File;IIILjava/lang/String;JILjava/lang/String;J)V

    sput-object v0, Lcom/tencent/open/a/f;->c:Lcom/tencent/open/a/b;

    .line 48
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    new-instance v0, Lcom/tencent/open/a/a;

    sget-object v1, Lcom/tencent/open/a/f;->c:Lcom/tencent/open/a/b;

    invoke-direct {v0, v1}, Lcom/tencent/open/a/a;-><init>(Lcom/tencent/open/a/b;)V

    iput-object v0, p0, Lcom/tencent/open/a/f;->b:Lcom/tencent/open/a/a;

    .line 70
    return-void
.end method

.method public static a()Lcom/tencent/open/a/f;
    .locals 3

    .line 52
    sget-object v0, Lcom/tencent/open/a/f;->a:Lcom/tencent/open/a/f;

    if-nez v0, :cond_1

    .line 54
    const-class v1, Lcom/tencent/open/a/f;

    monitor-enter v1

    .line 56
    :try_start_0
    sget-object v0, Lcom/tencent/open/a/f;->a:Lcom/tencent/open/a/f;

    if-nez v0, :cond_0

    .line 58
    new-instance v0, Lcom/tencent/open/a/f;

    invoke-direct {v0}, Lcom/tencent/open/a/f;-><init>()V

    sput-object v0, Lcom/tencent/open/a/f;->a:Lcom/tencent/open/a/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 63
    :cond_1
    :goto_0
    sget-object v0, Lcom/tencent/open/a/f;->a:Lcom/tencent/open/a/f;

    return-object v0
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 93
    invoke-static {}, Lcom/tencent/open/a/f;->a()Lcom/tencent/open/a/f;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Lcom/tencent/open/a/f;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 117
    invoke-static {}, Lcom/tencent/open/a/f;->a()Lcom/tencent/open/a/f;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p0, p1, p2}, Lcom/tencent/open/a/f;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    return-void
.end method

.method public static b()V
    .locals 4

    .line 194
    const-class v2, Lcom/tencent/open/a/f;

    monitor-enter v2

    .line 195
    :try_start_0
    invoke-static {}, Lcom/tencent/open/a/f;->a()Lcom/tencent/open/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/open/a/f;->d()V

    .line 196
    sget-object v0, Lcom/tencent/open/a/f;->a:Lcom/tencent/open/a/f;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 197
    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/open/a/f;->a:Lcom/tencent/open/a/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 200
    :goto_0
    return-void
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 109
    invoke-static {}, Lcom/tencent/open/a/f;->a()Lcom/tencent/open/a/f;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Lcom/tencent/open/a/f;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    return-void
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 165
    invoke-static {}, Lcom/tencent/open/a/f;->a()Lcom/tencent/open/a/f;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1, p0, p1, p2}, Lcom/tencent/open/a/f;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    return-void
.end method

.method protected static c()Ljava/io/File;
    .locals 8

    .line 208
    const/4 v4, 0x0

    .line 210
    invoke-static {}, Lcom/tencent/open/utils/Global;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 211
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    const-string v5, "default"

    .line 214
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/tencent/open/a/c;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 216
    invoke-static {}, Lcom/tencent/open/a/d$c;->b()Lcom/tencent/open/a/d$d;

    move-result-object v7

    .line 218
    if-eqz v7, :cond_1

    .line 219
    invoke-virtual {v7}, Lcom/tencent/open/a/d$d;->c()J

    move-result-wide v0

    sget-wide v2, Lcom/tencent/open/a/c;->k:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 220
    const/4 v4, 0x1

    .line 224
    :cond_1
    if-eqz v4, :cond_2

    .line 225
    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0

    .line 227
    :cond_2
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 125
    invoke-static {}, Lcom/tencent/open/a/f;->a()Lcom/tencent/open/a/f;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Lcom/tencent/open/a/f;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    return-void
.end method

.method public static final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 141
    invoke-static {}, Lcom/tencent/open/a/f;->a()Lcom/tencent/open/a/f;

    move-result-object v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Lcom/tencent/open/a/f;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 142
    return-void
.end method

.method public static final e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 157
    invoke-static {}, Lcom/tencent/open/a/f;->a()Lcom/tencent/open/a/f;

    move-result-object v0

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, p1, v2}, Lcom/tencent/open/a/f;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    return-void
.end method


# virtual methods
.method protected a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 8

    .line 74
    sget-object v0, Lcom/tencent/open/a/e;->a:Lcom/tencent/open/a/e;

    move v1, p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-virtual/range {v0 .. v7}, Lcom/tencent/open/a/e;->b(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    sget v0, Lcom/tencent/open/a/c;->b:I

    invoke-static {v0, p1}, Lcom/tencent/open/a/d$a;->a(II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 78
    iget-object v0, p0, Lcom/tencent/open/a/f;->b:Lcom/tencent/open/a/a;

    if-nez v0, :cond_0

    .line 79
    return-void

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/a/f;->b:Lcom/tencent/open/a/a;

    move v1, p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-virtual/range {v0 .. v7}, Lcom/tencent/open/a/a;->b(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    :cond_1
    return-void
.end method

.method protected d()V
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/tencent/open/a/f;->b:Lcom/tencent/open/a/a;

    if-eqz v0, :cond_0

    .line 233
    iget-object v0, p0, Lcom/tencent/open/a/f;->b:Lcom/tencent/open/a/a;

    invoke-virtual {v0}, Lcom/tencent/open/a/a;->a()V

    .line 234
    iget-object v0, p0, Lcom/tencent/open/a/f;->b:Lcom/tencent/open/a/a;

    invoke-virtual {v0}, Lcom/tencent/open/a/a;->b()V

    .line 235
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/a/f;->b:Lcom/tencent/open/a/a;

    .line 237
    :cond_0
    return-void
.end method
