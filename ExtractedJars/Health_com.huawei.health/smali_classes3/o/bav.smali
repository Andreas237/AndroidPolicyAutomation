.class final Lo/bav;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field private a:I

.field private c:J

.field private d:Lo/bat;

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(JLjava/util/Map;Lo/bat;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Lo/bat;)V"
        }
    .end annotation

    .line 60
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 40
    const/4 v0, 0x2

    iput v0, p0, Lo/bav;->a:I

    .line 61
    const-string v0, "TRSRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TRSRequestTask:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    iput-wide p1, p0, Lo/bav;->c:J

    .line 63
    iput-object p4, p0, Lo/bav;->d:Lo/bat;

    .line 64
    iput-object p3, p0, Lo/bav;->e:Ljava/util/Map;

    .line 65
    return-void
.end method

.method private a(I)I
    .locals 1

    .line 261
    const/16 v0, 0x708

    if-gt p1, v0, :cond_0

    const/16 v0, 0xa

    if-lt p1, v0, :cond_0

    .line 263
    return p1

    .line 267
    :cond_0
    const/16 v0, 0x3c

    return v0
.end method

.method private b(I)I
    .locals 1

    .line 243
    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/16 v0, 0xa

    if-gt p1, v0, :cond_0

    .line 245
    return p1

    .line 249
    :cond_0
    const/4 v0, 0x3

    return v0
.end method

.method private b(J)J
    .locals 2

    .line 225
    const-wide/32 v0, 0x15180

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    const-wide/16 v0, 0xe10

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 227
    return-wide p1

    .line 231
    :cond_0
    const-wide/32 v0, 0x15180

    return-wide v0
.end method

.method private b([B)Lo/bat$e;
    .locals 9

    .line 146
    if-eqz p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 148
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 150
    :cond_1
    const/4 v3, 0x0

    .line 153
    :try_start_0
    new-instance v4, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-direct {v4, p1, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 154
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 155
    const-string v0, "result"

    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    .line 157
    new-instance v0, Lo/bat$e;

    invoke-direct {v0}, Lo/bat$e;-><init>()V

    move-object v3, v0

    .line 158
    invoke-virtual {v3, v6}, Lo/bat$e;->c(I)V

    .line 159
    if-nez v6, :cond_4

    .line 162
    const-string v0, "serverIp"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/bat$e;->a(Ljava/lang/String;)V

    .line 164
    invoke-virtual {v3}, Lo/bat$e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bqz;->b(Ljava/lang/String;)Z

    move-result v7

    .line 165
    if-nez v7, :cond_2

    .line 167
    const/4 v0, -0x1

    invoke-virtual {v3, v0}, Lo/bat$e;->c(I)V

    .line 168
    const-string v0, "TRSRequestTask"

    const-string v1, "TRSInfo response warning invalid server ip"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 169
    return-object v3

    .line 171
    :cond_2
    const-string v0, "serverPort"

    :try_start_1
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Lo/bat$e;->e(I)V

    .line 173
    invoke-virtual {v3}, Lo/bat$e;->e()I

    move-result v0

    invoke-direct {p0, v0}, Lo/bav;->e(I)Z

    move-result v8

    .line 174
    if-nez v8, :cond_3

    .line 176
    const/4 v0, -0x1

    invoke-virtual {v3, v0}, Lo/bat$e;->c(I)V

    .line 177
    const-string v0, "TRSRequestTask"

    const-string v1, "TRSInfo response warning invalid server port"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    .line 178
    return-object v3

    .line 180
    :cond_3
    const-string v0, "regionId"

    const/4 v1, -0x1

    :try_start_2
    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v3, v0}, Lo/bat$e;->b(I)V

    .line 181
    const-string v0, "validTime"

    const-wide/32 v1, 0x15180

    invoke-virtual {v5, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/bav;->b(J)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/bat$e;->c(J)V

    .line 182
    const-string v0, "maxIMRetryTimes"

    const/4 v1, 0x3

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-direct {p0, v0}, Lo/bav;->b(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lo/bat$e;->a(I)V

    .line 183
    const-string v0, "maxRandConnectTime"

    const/16 v1, 0x3c

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-direct {p0, v0}, Lo/bav;->a(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lo/bat$e;->d(I)V

    .line 184
    const-string v0, "minIMRandConnectTime"

    const/16 v1, 0x3c

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-direct {p0, v0}, Lo/bav;->c(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lo/bat$e;->i(I)V

    .line 185
    goto :goto_0

    .line 188
    :cond_4
    const-string v0, "desc"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 189
    const-string v0, "TRSRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TRSInfo response error from server:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    invoke-static {v6, v7}, Lo/bpj;->f(ILjava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_1

    .line 192
    return-object v3

    .line 202
    :goto_0
    goto :goto_1

    .line 195
    :catch_0
    move-exception v4

    .line 197
    const-string v0, "TRSRequestTask"

    const-string v1, "parserTRSInfo() JSONException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    goto :goto_1

    .line 199
    :catch_1
    move-exception v4

    .line 201
    const-string v0, "TRSRequestTask"

    const-string v1, "parserTRSInfo() UnsupportedEncodingException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    :goto_1
    return-object v3
.end method

.method private c(I)I
    .locals 1

    .line 279
    const/16 v0, 0x708

    if-gt p1, v0, :cond_0

    const/16 v0, 0xa

    if-lt p1, v0, :cond_0

    .line 281
    return p1

    .line 285
    :cond_0
    const/16 v0, 0x3c

    return v0
.end method

.method private c(Ljava/util/Map;)[B
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)[B"
        }
    .end annotation

    .line 109
    const-string v0, "TRSRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "callTRSServer()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lo/ayw;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const-string v0, "TRSRequestTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "callTRSServer()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const/4 v3, 0x0

    .line 112
    const/4 v4, 0x0

    .line 115
    :try_start_0
    sget-object v0, Lo/ayw;->d:Ljava/lang/String;

    invoke-static {v0, p1}, Lo/bpy;->d(Ljava/lang/String;Ljava/util/Map;)Lo/bqg;

    move-result-object v0

    move-object v4, v0

    .line 116
    invoke-virtual {v4}, Lo/bqg;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    invoke-virtual {v4}, Lo/bqg;->a()Lo/bqi;

    move-result-object v0

    invoke-virtual {v0}, Lo/bqi;->d()[B

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    .line 122
    :cond_0
    const-string v0, "TRSRequestTask"

    const-string v1, "callTRSServer request trs failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "request trs failed, message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 124
    invoke-virtual {v4}, Lo/bqg;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 123
    const v1, 0x14ffe

    invoke-static {v1, v0}, Lo/bpj;->f(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    :goto_0
    invoke-static {v4}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 134
    goto :goto_1

    .line 127
    :catch_0
    move-exception v5

    .line 129
    const-string v0, "TRSRequestTask"

    const-string v1, "callTRSServer meet IOException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    invoke-static {v4}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 134
    goto :goto_1

    .line 133
    :catchall_0
    move-exception v6

    invoke-static {v4}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 134
    throw v6

    .line 135
    :goto_1
    return-object v3
.end method

.method private e(I)Z
    .locals 1

    .line 214
    const v0, 0xffff

    if-gt p1, v0, :cond_0

    const/16 v0, 0x401

    if-lt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 70
    const/4 v3, 0x0

    .line 71
    :goto_0
    iget v0, p0, Lo/bav;->a:I

    if-lez v0, :cond_1

    .line 73
    iget-object v0, p0, Lo/bav;->e:Ljava/util/Map;

    invoke-direct {p0, v0}, Lo/bav;->c(Ljava/util/Map;)[B

    move-result-object v3

    .line 74
    if-eqz v3, :cond_0

    .line 76
    goto :goto_1

    .line 78
    :cond_0
    iget v0, p0, Lo/bav;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/bav;->a:I

    goto :goto_0

    .line 81
    :cond_1
    :goto_1
    if-eqz v3, :cond_3

    .line 84
    invoke-direct {p0, v3}, Lo/bav;->b([B)Lo/bat$e;

    move-result-object v4

    .line 85
    iget-object v0, p0, Lo/bav;->d:Lo/bat;

    if-eqz v0, :cond_2

    .line 88
    iget-object v0, p0, Lo/bav;->d:Lo/bat;

    iget-wide v1, p0, Lo/bav;->c:J

    invoke-interface {v0, v1, v2, v4}, Lo/bat;->d(JLo/bat$e;)V

    .line 90
    :cond_2
    goto :goto_2

    .line 93
    :cond_3
    iget-object v0, p0, Lo/bav;->d:Lo/bat;

    if-eqz v0, :cond_4

    .line 95
    const-string v0, "TRSRequestTask"

    const-string v1, "request trs server failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lo/bav;->d:Lo/bat;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lo/bat;->e(I)V

    .line 99
    :cond_4
    :goto_2
    return-void
.end method
