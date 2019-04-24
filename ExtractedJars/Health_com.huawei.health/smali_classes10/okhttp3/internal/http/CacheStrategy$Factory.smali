.class public Lokhttp3/internal/http/CacheStrategy$Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http/CacheStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation


# instance fields
.field private ageSeconds:I

.field final cacheResponse:Lokhttp3/Response;

.field private etag:Ljava/lang/String;

.field private expires:Ljava/util/Date;

.field private lastModified:Ljava/util/Date;

.field private lastModifiedString:Ljava/lang/String;

.field final nowMillis:J

.field private receivedResponseMillis:J

.field final request:Lokhttp3/Request;

.field private sentRequestMillis:J

.field private servedDate:Ljava/util/Date;

.field private servedDateString:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLokhttp3/Request;Lokhttp3/Response;)V
    .locals 7

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    const/4 v0, -0x1

    iput v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->ageSeconds:I

    .line 136
    iput-wide p1, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->nowMillis:J

    .line 137
    iput-object p3, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->request:Lokhttp3/Request;

    .line 138
    iput-object p4, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->cacheResponse:Lokhttp3/Response;

    .line 140
    if-eqz p4, :cond_7

    .line 141
    invoke-virtual {p4}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v2

    .line 142
    const/4 v3, 0x0

    invoke-virtual {v2}, Lokhttp3/Headers;->size()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_7

    .line 143
    invoke-virtual {v2, v3}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v5

    .line 144
    invoke-virtual {v2, v3}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v6

    .line 145
    const-string v0, "Date"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    invoke-static {v6}, Lokhttp3/internal/http/HttpDate;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->servedDate:Ljava/util/Date;

    .line 147
    iput-object v6, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->servedDateString:Ljava/lang/String;

    goto/16 :goto_1

    .line 148
    :cond_0
    const-string v0, "Expires"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 149
    invoke-static {v6}, Lokhttp3/internal/http/HttpDate;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->expires:Ljava/util/Date;

    goto :goto_1

    .line 150
    :cond_1
    const-string v0, "Last-Modified"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 151
    invoke-static {v6}, Lokhttp3/internal/http/HttpDate;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->lastModified:Ljava/util/Date;

    .line 152
    iput-object v6, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->lastModifiedString:Ljava/lang/String;

    goto :goto_1

    .line 153
    :cond_2
    const-string v0, "ETag"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 154
    iput-object v6, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->etag:Ljava/lang/String;

    goto :goto_1

    .line 155
    :cond_3
    const-string v0, "Age"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 156
    const/4 v0, -0x1

    invoke-static {v6, v0}, Lokhttp3/internal/http/HeaderParser;->parseSeconds(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->ageSeconds:I

    goto :goto_1

    .line 157
    :cond_4
    sget-object v0, Lokhttp3/internal/http/OkHeaders;->SENT_MILLIS:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 158
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->sentRequestMillis:J

    goto :goto_1

    .line 159
    :cond_5
    sget-object v0, Lokhttp3/internal/http/OkHeaders;->RECEIVED_MILLIS:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 160
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->receivedResponseMillis:J

    .line 142
    :cond_6
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 164
    :cond_7
    return-void
.end method

.method private cacheResponseAge()J
    .locals 12

    .line 284
    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->servedDate:Ljava/util/Date;

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->receivedResponseMillis:J

    iget-object v2, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->servedDate:Ljava/util/Date;

    .line 285
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    goto :goto_0

    :cond_0
    const-wide/16 v4, 0x0

    .line 287
    :goto_0
    iget v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->ageSeconds:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget v1, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->ageSeconds:I

    int-to-long v1, v1

    .line 288
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    goto :goto_1

    :cond_1
    move-wide v6, v4

    .line 290
    :goto_1
    iget-wide v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->receivedResponseMillis:J

    iget-wide v2, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->sentRequestMillis:J

    sub-long v8, v0, v2

    .line 291
    iget-wide v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->nowMillis:J

    iget-wide v2, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->receivedResponseMillis:J

    sub-long v10, v0, v2

    .line 292
    add-long v0, v6, v8

    add-long/2addr v0, v10

    return-wide v0
.end method

.method private computeFreshnessLifetime()J
    .locals 8

    .line 255
    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->cacheResponse:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->cacheControl()Lokhttp3/CacheControl;

    move-result-object v3

    .line 256
    invoke-virtual {v3}, Lokhttp3/CacheControl;->maxAgeSeconds()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 257
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3}, Lokhttp3/CacheControl;->maxAgeSeconds()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0

    .line 258
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->expires:Ljava/util/Date;

    if-eqz v0, :cond_3

    .line 259
    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->servedDate:Ljava/util/Date;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->servedDate:Ljava/util/Date;

    .line 260
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    goto :goto_0

    :cond_1
    iget-wide v4, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->receivedResponseMillis:J

    .line 262
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->expires:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    sub-long v6, v0, v4

    .line 263
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_2

    move-wide v0, v6

    goto :goto_1

    :cond_2
    const-wide/16 v0, 0x0

    :goto_1
    return-wide v0

    .line 264
    :cond_3
    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->lastModified:Ljava/util/Date;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->cacheResponse:Lokhttp3/Response;

    .line 265
    invoke-virtual {v0}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->query()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    .line 270
    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->servedDate:Ljava/util/Date;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->servedDate:Ljava/util/Date;

    .line 271
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    goto :goto_2

    :cond_4
    iget-wide v4, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->sentRequestMillis:J

    .line 273
    :goto_2
    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->lastModified:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    sub-long v6, v4, v0

    .line 274
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_5

    const-wide/16 v0, 0xa

    div-long v0, v6, v0

    goto :goto_3

    :cond_5
    const-wide/16 v0, 0x0

    :goto_3
    return-wide v0

    .line 276
    :cond_6
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private getCandidate()Lokhttp3/internal/http/CacheStrategy;
    .locals 17

    .line 183
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy$Factory;->cacheResponse:Lokhttp3/Response;

    if-nez v0, :cond_0

    .line 184
    new-instance v0, Lokhttp3/internal/http/CacheStrategy;

    move-object/from16 v1, p0

    iget-object v1, v1, Lokhttp3/internal/http/CacheStrategy$Factory;->request:Lokhttp3/Request;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lokhttp3/internal/http/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;Lokhttp3/internal/http/CacheStrategy$1;)V

    return-object v0

    .line 188
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy$Factory;->request:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->isHttps()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy$Factory;->cacheResponse:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->handshake()Lokhttp3/Handshake;

    move-result-object v0

    if-nez v0, :cond_1

    .line 189
    new-instance v0, Lokhttp3/internal/http/CacheStrategy;

    move-object/from16 v1, p0

    iget-object v1, v1, Lokhttp3/internal/http/CacheStrategy$Factory;->request:Lokhttp3/Request;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lokhttp3/internal/http/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;Lokhttp3/internal/http/CacheStrategy$1;)V

    return-object v0

    .line 195
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy$Factory;->cacheResponse:Lokhttp3/Response;

    move-object/from16 v1, p0

    iget-object v1, v1, Lokhttp3/internal/http/CacheStrategy$Factory;->request:Lokhttp3/Request;

    invoke-static {v0, v1}, Lokhttp3/internal/http/CacheStrategy;->isCacheable(Lokhttp3/Response;Lokhttp3/Request;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 196
    new-instance v0, Lokhttp3/internal/http/CacheStrategy;

    move-object/from16 v1, p0

    iget-object v1, v1, Lokhttp3/internal/http/CacheStrategy$Factory;->request:Lokhttp3/Request;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lokhttp3/internal/http/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;Lokhttp3/internal/http/CacheStrategy$1;)V

    return-object v0

    .line 199
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy$Factory;->request:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->cacheControl()Lokhttp3/CacheControl;

    move-result-object v4

    .line 200
    invoke-virtual {v4}, Lokhttp3/CacheControl;->noCache()Z

    move-result v0

    if-nez v0, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy$Factory;->request:Lokhttp3/Request;

    invoke-static {v0}, Lokhttp3/internal/http/CacheStrategy$Factory;->hasConditions(Lokhttp3/Request;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 201
    :cond_3
    new-instance v0, Lokhttp3/internal/http/CacheStrategy;

    move-object/from16 v1, p0

    iget-object v1, v1, Lokhttp3/internal/http/CacheStrategy$Factory;->request:Lokhttp3/Request;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lokhttp3/internal/http/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;Lokhttp3/internal/http/CacheStrategy$1;)V

    return-object v0

    .line 204
    :cond_4
    invoke-direct/range {p0 .. p0}, Lokhttp3/internal/http/CacheStrategy$Factory;->cacheResponseAge()J

    move-result-wide v5

    .line 205
    invoke-direct/range {p0 .. p0}, Lokhttp3/internal/http/CacheStrategy$Factory;->computeFreshnessLifetime()J

    move-result-wide v7

    .line 207
    invoke-virtual {v4}, Lokhttp3/CacheControl;->maxAgeSeconds()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    .line 208
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4}, Lokhttp3/CacheControl;->maxAgeSeconds()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    .line 211
    :cond_5
    const-wide/16 v9, 0x0

    .line 212
    invoke-virtual {v4}, Lokhttp3/CacheControl;->minFreshSeconds()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    .line 213
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4}, Lokhttp3/CacheControl;->minFreshSeconds()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v9

    .line 216
    :cond_6
    const-wide/16 v11, 0x0

    .line 217
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy$Factory;->cacheResponse:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->cacheControl()Lokhttp3/CacheControl;

    move-result-object v13

    .line 218
    invoke-virtual {v13}, Lokhttp3/CacheControl;->mustRevalidate()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {v4}, Lokhttp3/CacheControl;->maxStaleSeconds()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_7

    .line 219
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4}, Lokhttp3/CacheControl;->maxStaleSeconds()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v11

    .line 222
    :cond_7
    invoke-virtual {v13}, Lokhttp3/CacheControl;->noCache()Z

    move-result v0

    if-nez v0, :cond_a

    add-long v0, v5, v9

    add-long v2, v7, v11

    cmp-long v0, v0, v2

    if-gez v0, :cond_a

    .line 223
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy$Factory;->cacheResponse:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object v14

    .line 224
    add-long v0, v5, v9

    cmp-long v0, v0, v7

    if-ltz v0, :cond_8

    .line 225
    const-string v0, "Warning"

    const-string v1, "110 HttpURLConnection \"Response is stale\""

    invoke-virtual {v14, v0, v1}, Lokhttp3/Response$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;

    .line 227
    :cond_8
    const-wide/32 v15, 0x5265c00

    .line 228
    cmp-long v0, v5, v15

    if-lez v0, :cond_9

    invoke-direct/range {p0 .. p0}, Lokhttp3/internal/http/CacheStrategy$Factory;->isFreshnessLifetimeHeuristic()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 229
    const-string v0, "Warning"

    const-string v1, "113 HttpURLConnection \"Heuristic expiration\""

    invoke-virtual {v14, v0, v1}, Lokhttp3/Response$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;

    .line 231
    :cond_9
    new-instance v0, Lokhttp3/internal/http/CacheStrategy;

    invoke-virtual {v14}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lokhttp3/internal/http/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;Lokhttp3/internal/http/CacheStrategy$1;)V

    return-object v0

    .line 234
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy$Factory;->request:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v14

    .line 236
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy$Factory;->etag:Ljava/lang/String;

    if-eqz v0, :cond_b

    .line 237
    const-string v0, "If-None-Match"

    move-object/from16 v1, p0

    iget-object v1, v1, Lokhttp3/internal/http/CacheStrategy$Factory;->etag:Ljava/lang/String;

    invoke-virtual {v14, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    goto :goto_0

    .line 238
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy$Factory;->lastModified:Ljava/util/Date;

    if-eqz v0, :cond_c

    .line 239
    const-string v0, "If-Modified-Since"

    move-object/from16 v1, p0

    iget-object v1, v1, Lokhttp3/internal/http/CacheStrategy$Factory;->lastModifiedString:Ljava/lang/String;

    invoke-virtual {v14, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    goto :goto_0

    .line 240
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lokhttp3/internal/http/CacheStrategy$Factory;->servedDate:Ljava/util/Date;

    if-eqz v0, :cond_d

    .line 241
    const-string v0, "If-Modified-Since"

    move-object/from16 v1, p0

    iget-object v1, v1, Lokhttp3/internal/http/CacheStrategy$Factory;->servedDateString:Ljava/lang/String;

    invoke-virtual {v14, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 244
    :cond_d
    :goto_0
    invoke-virtual {v14}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v15

    .line 245
    invoke-static {v15}, Lokhttp3/internal/http/CacheStrategy$Factory;->hasConditions(Lokhttp3/Request;)Z

    move-result v0

    if-eqz v0, :cond_e

    new-instance v0, Lokhttp3/internal/http/CacheStrategy;

    move-object/from16 v1, p0

    iget-object v1, v1, Lokhttp3/internal/http/CacheStrategy$Factory;->cacheResponse:Lokhttp3/Response;

    const/4 v2, 0x0

    invoke-direct {v0, v15, v1, v2}, Lokhttp3/internal/http/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;Lokhttp3/internal/http/CacheStrategy$1;)V

    goto :goto_1

    :cond_e
    new-instance v0, Lokhttp3/internal/http/CacheStrategy;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v15, v1, v2}, Lokhttp3/internal/http/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;Lokhttp3/internal/http/CacheStrategy$1;)V

    :goto_1
    return-object v0
.end method

.method private static hasConditions(Lokhttp3/Request;)Z
    .locals 1

    .line 309
    const-string v0, "If-Modified-Since"

    invoke-virtual {p0, v0}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "If-None-Match"

    invoke-virtual {p0, v0}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isFreshnessLifetimeHeuristic()Z
    .locals 2

    .line 300
    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->cacheResponse:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->cacheControl()Lokhttp3/CacheControl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/CacheControl;->maxAgeSeconds()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->expires:Ljava/util/Date;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public get()Lokhttp3/internal/http/CacheStrategy;
    .locals 5

    .line 170
    invoke-direct {p0}, Lokhttp3/internal/http/CacheStrategy$Factory;->getCandidate()Lokhttp3/internal/http/CacheStrategy;

    move-result-object v4

    .line 172
    iget-object v0, v4, Lokhttp3/internal/http/CacheStrategy;->networkRequest:Lokhttp3/Request;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/http/CacheStrategy$Factory;->request:Lokhttp3/Request;

    invoke-virtual {v0}, Lokhttp3/Request;->cacheControl()Lokhttp3/CacheControl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/CacheControl;->onlyIfCached()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 174
    new-instance v0, Lokhttp3/internal/http/CacheStrategy;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lokhttp3/internal/http/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;Lokhttp3/internal/http/CacheStrategy$1;)V

    return-object v0

    .line 177
    :cond_0
    return-object v4
.end method
