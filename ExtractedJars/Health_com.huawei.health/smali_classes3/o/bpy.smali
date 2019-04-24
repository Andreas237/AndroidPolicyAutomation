.class public final Lo/bpy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;Lo/bqh;Ljava/lang/String;)Lo/bqg;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 190
    invoke-static {p0, p2}, Lo/bpu;->get(Ljava/lang/String;Ljava/lang/String;)Lo/bpu;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2}, Lo/bpy;->b(Lo/bqb;Lo/bqh;Lo/bqe;Lo/bqe;)Lo/bqg;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lo/bqb;Ljava/lang/String;)Lo/bqg;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 81
    const-string v0, "application/json"

    invoke-static {v0, p1}, Lo/bqh;->a(Ljava/lang/String;Ljava/lang/String;)Lo/bqh;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lo/bpy;->b(Lo/bqb;Lo/bqh;Lo/bqe;Lo/bqe;)Lo/bqg;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lo/bqb;Lo/bqe;)Lo/bqg;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 120
    invoke-interface {p0}, Lo/bqb;->getFilePath()Ljava/lang/String;

    move-result-object v3

    .line 121
    invoke-interface {p0}, Lo/bqb;->getFileKey()Ljava/lang/String;

    move-result-object v4

    .line 122
    invoke-interface {p0}, Lo/bqb;->getContentType()Ljava/lang/String;

    move-result-object v5

    .line 123
    invoke-interface {p0}, Lo/bqb;->getFormParams()Ljava/util/Map;

    move-result-object v6

    .line 124
    const-string v0, "HttpUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "postFile "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    new-instance v0, Lo/bqc$a;

    invoke-direct {v0}, Lo/bqc$a;-><init>()V

    const-string v1, "multipart/form-data"

    invoke-virtual {v0, v1}, Lo/bqc$a;->d(Ljava/lang/String;)Lo/bqc$a;

    move-result-object v0

    .line 127
    invoke-virtual {v0, v6}, Lo/bqc$a;->e(Ljava/util/Map;)Lo/bqc$a;

    move-result-object v7

    .line 130
    invoke-static {v3, v4, v5}, Lo/bpy;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/bqc$c;

    move-result-object v8

    .line 131
    if-eqz v8, :cond_0

    .line 133
    invoke-virtual {v7, v8}, Lo/bqc$a;->e(Lo/bqc$c;)Lo/bqc$a;

    .line 137
    :cond_0
    invoke-virtual {v7}, Lo/bqc$a;->e()Lo/bqc;

    move-result-object v9

    .line 139
    const/4 v0, 0x0

    invoke-static {p0, v9, v0, p1}, Lo/bpy;->b(Lo/bqb;Lo/bqh;Lo/bqe;Lo/bqe;)Lo/bqg;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/bqg;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 107
    const-string v0, "application/json"

    invoke-static {v0, p1}, Lo/bqh;->a(Ljava/lang/String;Ljava/lang/String;)Lo/bqh;

    move-result-object v0

    invoke-static {p0, v0, p2}, Lo/bpy;->a(Ljava/lang/String;Lo/bqh;Ljava/lang/String;)Lo/bqg;

    move-result-object v0

    return-object v0
.end method

.method private static b(Lo/bqb;Lo/bqh;Lo/bqe;Lo/bqe;)Lo/bqg;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 206
    invoke-interface {p0}, Lo/bqb;->getRequestUrl()Ljava/lang/String;

    move-result-object v1

    .line 208
    invoke-interface {p0}, Lo/bqb;->getReadTimeout()I

    move-result v2

    .line 209
    invoke-interface {p0}, Lo/bqb;->getConnTimeout()I

    move-result v3

    .line 210
    invoke-interface {p0}, Lo/bqb;->isRetryRequest()Z

    move-result v4

    .line 216
    new-instance v0, Lo/bpz$a;

    invoke-direct {v0}, Lo/bpz$a;-><init>()V

    .line 217
    invoke-virtual {v0, v3}, Lo/bpz$a;->e(I)Lo/bpz$a;

    move-result-object v0

    .line 218
    invoke-virtual {v0, v2}, Lo/bpz$a;->a(I)Lo/bpz$a;

    move-result-object v0

    .line 219
    invoke-virtual {v0, v4}, Lo/bpz$a;->c(Z)Lo/bpz$a;

    move-result-object v0

    .line 220
    invoke-virtual {v0, p2}, Lo/bpz$a;->e(Lo/bqe;)Lo/bpz$a;

    move-result-object v0

    .line 221
    invoke-virtual {v0, p3}, Lo/bpz$a;->b(Lo/bqe;)Lo/bpz$a;

    move-result-object v0

    .line 222
    invoke-virtual {v0}, Lo/bpz$a;->c()Lo/bpz;

    move-result-object v5

    .line 224
    new-instance v6, Lo/bqk$d;

    invoke-direct {v6}, Lo/bqk$d;-><init>()V

    .line 225
    invoke-virtual {v6, p1}, Lo/bqk$d;->d(Lo/bqh;)Lo/bqk$d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/bqk$d;->d(Ljava/lang/String;)Lo/bqk$d;

    .line 227
    invoke-interface {p0}, Lo/bqb;->getCookie()Ljava/lang/String;

    move-result-object v7

    .line 228
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 230
    const-string v0, "Cookie"

    invoke-virtual {v6, v0, v7}, Lo/bqk$d;->d(Ljava/lang/String;Ljava/lang/String;)Lo/bqk$d;

    .line 233
    :cond_0
    invoke-virtual {v6}, Lo/bqk$d;->c()Lo/bqk;

    move-result-object v8

    .line 235
    invoke-virtual {v5, v8}, Lo/bpz;->e(Lo/bqk;)Lo/bqg;

    move-result-object v9

    .line 242
    invoke-static {v1, v9}, Lo/bpy;->e(Ljava/lang/String;Lo/bqg;)V

    .line 244
    return-object v9
.end method

.method public static c(Ljava/lang/String;)Lo/bqg;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 43
    new-instance v0, Lo/bqk$d;

    invoke-direct {v0}, Lo/bqk$d;-><init>()V

    invoke-virtual {v0}, Lo/bqk$d;->e()Lo/bqk$d;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bqk$d;->d(Ljava/lang/String;)Lo/bqk$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bqk$d;->c()Lo/bqk;

    move-result-object v1

    .line 45
    new-instance v0, Lo/bpz$a;

    invoke-direct {v0}, Lo/bpz$a;-><init>()V

    invoke-virtual {v0}, Lo/bpz$a;->c()Lo/bpz;

    move-result-object v2

    .line 46
    invoke-virtual {v2, v1}, Lo/bpz;->e(Lo/bqk;)Lo/bqg;

    move-result-object v3

    .line 54
    invoke-static {p0, v3}, Lo/bpy;->e(Ljava/lang/String;Lo/bqg;)V

    .line 55
    return-object v3
.end method

.method private static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/bqc$c;
    .locals 3

    .line 152
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 154
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 157
    :cond_1
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 158
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 161
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v2}, Lo/bqh;->c(Ljava/lang/String;Ljava/io/File;)Lo/bqh;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lo/bqc$c;->b(Ljava/lang/String;Ljava/lang/String;Lo/bqh;)Lo/bqc$c;

    move-result-object v0

    return-object v0

    .line 164
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static d(Ljava/lang/String;Ljava/util/Map;)Lo/bqg;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/bqg;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 68
    new-instance v0, Lo/bpt$b;

    invoke-direct {v0}, Lo/bpt$b;-><init>()V

    invoke-virtual {v0, p1}, Lo/bpt$b;->d(Ljava/util/Map;)Lo/bpt$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpt$b;->e()Lo/bpt;

    move-result-object v0

    invoke-static {p0, v0}, Lo/bpy;->d(Ljava/lang/String;Lo/bqh;)Lo/bqg;

    move-result-object v0

    return-object v0
.end method

.method private static d(Ljava/lang/String;Lo/bqh;)Lo/bqg;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 177
    invoke-static {p0}, Lo/bpu;->get(Ljava/lang/String;)Lo/bpu;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2}, Lo/bpy;->b(Lo/bqb;Lo/bqh;Lo/bqe;Lo/bqe;)Lo/bqg;

    move-result-object v0

    return-object v0
.end method

.method private static e(Ljava/lang/String;Lo/bqg;)V
    .locals 4

    .line 252
    invoke-virtual {p1}, Lo/bqg;->e()I

    move-result v3

    .line 254
    const/16 v0, 0xc8

    if-eq v3, v0, :cond_0

    .line 256
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "request ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "] failed, code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 257
    invoke-virtual {p1}, Lo/bqg;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 256
    invoke-static {v0}, Lo/bpj;->a(Ljava/lang/String;)V

    .line 258
    const-string v0, "HttpUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "request failed. statusCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", msg="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lo/bqg;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    :cond_0
    return-void
.end method
