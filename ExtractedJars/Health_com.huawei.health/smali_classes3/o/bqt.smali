.class public Lo/bqt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/bqb;

.field private b:Lo/bqu;

.field private c:I

.field private d:Lo/bra;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bqt;->b:Lo/bqu;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bqt;->a:Lo/bqb;

    .line 65
    const/4 v0, 0x0

    iput v0, p0, Lo/bqt;->c:I

    return-void
.end method

.method private a(I)V
    .locals 1

    .line 197
    iget-object v0, p0, Lo/bqt;->b:Lo/bqu;

    if-eqz v0, :cond_0

    .line 199
    iget-object v0, p0, Lo/bqt;->b:Lo/bqu;

    invoke-interface {v0, p1}, Lo/bqu;->c(I)V

    .line 201
    :cond_0
    return-void
.end method

.method private a(Lo/bqb;)[B
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 292
    const/4 v0, 0x0

    new-array v2, v0, [B

    .line 293
    if-nez p1, :cond_0

    .line 295
    const-string v0, "ComplainEntity"

    const-string v1, "httpParam is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    return-object v2

    .line 300
    :cond_0
    invoke-direct {p0}, Lo/bqt;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 302
    new-instance v0, Lo/bpx;

    invoke-direct {v0}, Lo/bpx;-><init>()V

    throw v0

    .line 306
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    .line 308
    const/4 v4, 0x0

    .line 312
    :try_start_0
    new-instance v0, Lo/bqt$3;

    invoke-direct {v0, p0, v3}, Lo/bqt$3;-><init>(Lo/bqt;Ljava/lang/Thread;)V

    invoke-static {p1, v0}, Lo/bpy;->a(Lo/bqb;Lo/bqe;)Lo/bqg;

    move-result-object v0

    move-object v4, v0

    .line 344
    invoke-virtual {v4}, Lo/bqg;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 346
    invoke-virtual {v4}, Lo/bqg;->a()Lo/bqi;

    move-result-object v0

    invoke-virtual {v0}, Lo/bqi;->d()[B

    move-result-object v2

    goto :goto_0

    .line 350
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "complain http failed, message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 351
    invoke-virtual {v4}, Lo/bqg;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 350
    const v1, 0x14ffe

    invoke-static {v1, v0}, Lo/bpj;->h(ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 357
    :goto_0
    invoke-static {v4}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 358
    goto :goto_1

    .line 357
    :catchall_0
    move-exception v5

    invoke-static {v4}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 358
    throw v5

    .line 360
    :goto_1
    return-object v2
.end method

.method static synthetic b(Lo/bqt;)Lo/bqu;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/bqt;->b:Lo/bqu;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 182
    iget-object v0, p0, Lo/bqt;->b:Lo/bqu;

    if-eqz v0, :cond_0

    .line 184
    iget-object v0, p0, Lo/bqt;->b:Lo/bqu;

    const/16 v1, 0x64

    invoke-interface {v0, v1}, Lo/bqu;->d(I)V

    .line 185
    iget-object v0, p0, Lo/bqt;->b:Lo/bqu;

    invoke-interface {v0}, Lo/bqu;->b()V

    .line 187
    :cond_0
    return-void
.end method

.method private c(ILjava/lang/String;)V
    .locals 2

    .line 268
    invoke-direct {p0}, Lo/bqt;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 270
    const-string v0, "ComplainEntity"

    const-string v1, "upload canceled."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    iget-object v0, p0, Lo/bqt;->b:Lo/bqu;

    if-eqz v0, :cond_0

    .line 273
    iget-object v0, p0, Lo/bqt;->b:Lo/bqu;

    invoke-interface {v0}, Lo/bqu;->a()V

    .line 275
    :cond_0
    return-void

    .line 277
    :cond_1
    iget-object v0, p0, Lo/bqt;->b:Lo/bqu;

    if-eqz v0, :cond_2

    .line 279
    iget-object v0, p0, Lo/bqt;->b:Lo/bqu;

    invoke-interface {v0, p1}, Lo/bqu;->c(I)V

    .line 281
    :cond_2
    return-void
.end method

.method static synthetic c(Lo/bqt;)Z
    .locals 1

    .line 35
    invoke-direct {p0}, Lo/bqt;->d()Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/bqt;)I
    .locals 1

    .line 35
    iget v0, p0, Lo/bqt;->c:I

    return v0
.end method

.method private d(I)V
    .locals 3

    .line 156
    if-nez p1, :cond_0

    .line 158
    invoke-direct {p0}, Lo/bqt;->b()V

    goto :goto_0

    .line 160
    :cond_0
    const/16 v0, 0x3ea

    if-ne p1, v0, :cond_1

    .line 163
    invoke-static {}, Lo/ayv;->c()Lo/ayv;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ayv;->a(Z)V

    .line 164
    const-string v0, "TAG"

    const-string v1, "upload complain err. not login or session timeout."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    invoke-direct {p0, p1}, Lo/bqt;->a(I)V

    goto :goto_0

    .line 169
    :cond_1
    const-string v0, "TAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "upload complain err. errCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    invoke-direct {p0, p1}, Lo/bqt;->a(I)V

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "report complain failed, url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bqt;->a:Lo/bqb;

    invoke-interface {v1}, Lo/bqb;->getRequestUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/bpj;->h(ILjava/lang/String;)V

    .line 174
    :goto_0
    return-void
.end method

.method private d()Z
    .locals 1

    .line 252
    iget-object v0, p0, Lo/bqt;->d:Lo/bra;

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lo/bqt;->d:Lo/bra;

    invoke-interface {v0}, Lo/bra;->a()Z

    move-result v0

    return v0

    .line 256
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a([B)I
    .locals 6

    .line 212
    const/4 v2, -0x1

    .line 214
    if-eqz p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    .line 216
    :cond_0
    const-string v0, "ComplainEntity"

    const-string v1, "parseUploadResponse data is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    return v2

    .line 219
    :cond_1
    new-instance v3, Ljava/lang/String;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v3, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 221
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 223
    const/4 v4, 0x0

    .line 226
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 227
    const-string v0, "errcode"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    move v2, v0

    .line 236
    goto :goto_0

    .line 229
    :catch_0
    move-exception v5

    .line 231
    const-string v0, "ComplainEntity"

    const-string v1, "parseUploadResponse errcode error."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    goto :goto_0

    .line 233
    :catch_1
    move-exception v5

    .line 235
    const-string v0, "ComplainEntity"

    const-string v1, "parseUploadResponse. JSONException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    :goto_0
    goto :goto_1

    .line 240
    :cond_2
    const-string v0, "ComplainEntity"

    const-string v1, "parseUploadResponse str is null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    :goto_1
    return v2
.end method

.method public a(Lo/bra;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lo/bqt;->d:Lo/bra;

    .line 90
    return-void
.end method

.method public b(Lo/bqu;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lo/bqt;->b:Lo/bqu;

    .line 100
    return-void
.end method

.method public c()V
    .locals 5

    .line 119
    :try_start_0
    iget-object v0, p0, Lo/bqt;->a:Lo/bqb;

    if-nez v0, :cond_0

    .line 121
    const-string v0, "ComplainEntity"

    const-string v1, "httpParam is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lo/bqt;->a(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    return-void

    .line 128
    :cond_0
    :try_start_1
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v2

    .line 129
    if-nez v2, :cond_1

    .line 132
    const-string v0, "isConnectNet false."

    const/4 v1, 0x5

    invoke-direct {p0, v1, v0}, Lo/bqt;->c(ILjava/lang/String;)V

    goto :goto_0

    .line 136
    :cond_1
    iget-object v0, p0, Lo/bqt;->a:Lo/bqb;

    invoke-direct {p0, v0}, Lo/bqt;->a(Lo/bqb;)[B

    move-result-object v3

    .line 138
    invoke-virtual {p0, v3}, Lo/bqt;->a([B)I

    move-result v4

    .line 140
    invoke-direct {p0, v4}, Lo/bqt;->d(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 146
    :goto_0
    goto :goto_1

    .line 143
    :catch_0
    move-exception v2

    .line 145
    const-string v0, "IOException"

    const/4 v1, 0x6

    invoke-direct {p0, v1, v0}, Lo/bqt;->c(ILjava/lang/String;)V

    .line 147
    :goto_1
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 79
    iput p1, p0, Lo/bqt;->c:I

    .line 80
    return-void
.end method

.method public c(Lo/bqb;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lo/bqt;->a:Lo/bqb;

    .line 110
    return-void
.end method
