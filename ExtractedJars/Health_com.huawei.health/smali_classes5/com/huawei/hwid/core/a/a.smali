.class public final Lcom/huawei/hwid/core/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/huawei/hwid/core/a/a;

.field private static final c:Ljava/lang/String;


# instance fields
.field private b:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lcom/huawei/hwid/core/a/b;>;"
        }
    .end annotation
.end field

.field private f:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lcom/huawei/hwid/core/a/b;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    invoke-static {}, Lcom/huawei/hwid/core/d/k;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/a/a;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/a/a;->e:Ljava/util/Queue;

    .line 58
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/a/a;->f:Ljava/util/Queue;

    .line 90
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/a/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/a/a;->b:Ljava/lang/String;

    .line 93
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/a/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/a/a;->d:Ljava/lang/String;

    .line 97
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/hwid/core/a/a;
    .locals 3

    .line 75
    sget-object v0, Lcom/huawei/hwid/core/a/a;->a:Lcom/huawei/hwid/core/a/a;

    if-nez v0, :cond_1

    .line 76
    const-class v1, Lcom/huawei/hwid/core/a/a;

    monitor-enter v1

    .line 77
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/core/a/a;->a:Lcom/huawei/hwid/core/a/a;

    if-nez v0, :cond_0

    .line 78
    new-instance v0, Lcom/huawei/hwid/core/a/a;

    invoke-direct {v0, p0}, Lcom/huawei/hwid/core/a/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwid/core/a/a;->a:Lcom/huawei/hwid/core/a/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 81
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/hwid/core/a/a;->a:Lcom/huawei/hwid/core/a/a;

    return-object v0
.end method

.method private b(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 237
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 238
    const-string v3, ""

    .line 239
    const-string v0, "com.huawei.hwid"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 241
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v0

    .line 244
    goto :goto_0

    .line 242
    :catch_0
    move-exception v4

    .line 243
    const-string v0, "OpLogInfo"

    const-string v1, "NameNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    :goto_0
    const-string v4, "HwID "

    .line 246
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 247
    goto :goto_1

    .line 248
    :cond_0
    const-string v4, "SDK "

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "2.6.1.301"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 251
    :goto_1
    return-object v3
.end method

.method private c(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 263
    const-string v1, ""

    .line 264
    invoke-static {}, Lcom/huawei/hwid/core/d/d;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    const-string v1, "8000000"

    goto :goto_0

    .line 267
    :cond_0
    invoke-static {}, Lcom/huawei/hwid/core/d/d;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 269
    :goto_0
    return-object v1
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    monitor-enter p0

    .line 136
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->e:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized a(Lcom/huawei/hwid/core/a/b;)V
    .locals 2

    monitor-enter p0

    .line 110
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->e:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->e:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 112
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->e:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/hwid/core/a/a;->d:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public declared-synchronized b()Ljava/util/Queue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Queue<Lcom/huawei/hwid/core/a/b;>;"
        }
    .end annotation

    monitor-enter p0

    .line 155
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->e:Ljava/util/Queue;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized b(Lcom/huawei/hwid/core/a/b;)V
    .locals 2

    monitor-enter p0

    .line 123
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->f:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 125
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c()Ljava/util/Queue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Queue<Lcom/huawei/hwid/core/a/b;>;"
        }
    .end annotation

    monitor-enter p0

    .line 165
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->f:Ljava/util/Queue;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized d()V
    .locals 3

    monitor-enter p0

    .line 174
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwid/core/a/b;

    .line 175
    invoke-virtual {p0, v2}, Lcom/huawei/hwid/core/a/a;->a(Lcom/huawei/hwid/core/a/b;)V

    .line 176
    goto :goto_0

    .line 177
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    .line 182
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 184
    :try_start_0
    invoke-static {v4}, Lcom/huawei/hwid/core/d/m;->a(Ljava/io/OutputStream;)Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v5

    .line 185
    const-string v0, "UTF-8"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 186
    const-string v0, "OpLogReq"

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 187
    const-string v0, "clientVer"

    iget-object v1, p0, Lcom/huawei/hwid/core/a/a;->b:Ljava/lang/String;

    invoke-static {v5, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    const-string v0, "osVersion"

    sget-object v1, Lcom/huawei/hwid/core/a/a;->c:Ljava/lang/String;

    invoke-static {v5, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    const-string v0, "channel"

    iget-object v1, p0, Lcom/huawei/hwid/core/a/a;->d:Ljava/lang/String;

    invoke-static {v5, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->e:Ljava/util/Queue;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 192
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->e:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v6

    .line 193
    const-string v0, "logList"

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v0

    const-string v1, "size"

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 194
    iget-object v0, p0, Lcom/huawei/hwid/core/a/a;->e:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwid/core/a/b;

    .line 195
    const-string v0, "Log"

    invoke-virtual {v8}, Lcom/huawei/hwid/core/a/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    goto :goto_0

    .line 197
    :cond_0
    const-string v0, "logList"

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 199
    :cond_1
    const-string v0, "OpLogReq"

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 200
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 202
    const-string v0, "UTF-8"

    invoke-virtual {v4, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 203
    const-string v0, "OpLogInfo"

    const-string v1, "packedString"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 204
    move-object v7, v6

    .line 219
    :try_start_1
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 222
    goto :goto_1

    .line 220
    :catch_0
    move-exception v8

    .line 221
    const-string v0, "OpLogInfo"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    :goto_1
    return-object v7

    .line 205
    :catch_1
    move-exception v5

    .line 206
    const-string v0, "OpLogInfo"

    const-string v1, "IllegalArgumentException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 207
    const-string v6, ""

    .line 219
    :try_start_3
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 222
    goto :goto_2

    .line 220
    :catch_2
    move-exception v7

    .line 221
    const-string v0, "OpLogInfo"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    :goto_2
    return-object v6

    .line 208
    :catch_3
    move-exception v5

    .line 209
    const-string v0, "OpLogInfo"

    const-string v1, "IllegalStateException"

    :try_start_4
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 210
    const-string v6, ""

    .line 219
    :try_start_5
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 222
    goto :goto_3

    .line 220
    :catch_4
    move-exception v7

    .line 221
    const-string v0, "OpLogInfo"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    :goto_3
    return-object v6

    .line 211
    :catch_5
    move-exception v5

    .line 212
    const-string v0, "OpLogInfo"

    const-string v1, "IOException"

    :try_start_6
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 213
    const-string v6, ""

    .line 219
    :try_start_7
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 222
    goto :goto_4

    .line 220
    :catch_6
    move-exception v7

    .line 221
    const-string v0, "OpLogInfo"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    :goto_4
    return-object v6

    .line 214
    :catch_7
    move-exception v5

    .line 215
    const-string v0, "OpLogInfo"

    const-string v1, "Exception"

    :try_start_8
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 216
    const-string v6, ""

    .line 219
    :try_start_9
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 222
    goto :goto_5

    .line 220
    :catch_8
    move-exception v7

    .line 221
    const-string v0, "OpLogInfo"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    :goto_5
    return-object v6

    .line 218
    :catchall_0
    move-exception v9

    .line 219
    :try_start_a
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 222
    goto :goto_6

    .line 220
    :catch_9
    move-exception v10

    .line 221
    const-string v0, "OpLogInfo"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    :goto_6
    throw v9
.end method
