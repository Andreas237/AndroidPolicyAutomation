.class public Lnet/toddm/cache/CacheEntry;
.super Ljava/lang/Object;
.source "CacheEntry.java"


# instance fields
.field private final _etag:Ljava/lang/String;

.field private final _key:Ljava/lang/String;

.field private final _maxStale:Ljava/lang/Long;

.field private final _priority:Lnet/toddm/cache/CachePriority;

.field private final _sourceUri:Ljava/net/URI;

.field private final _timestampCreated:Ljava/lang/Long;

.field private final _timestampModified:Ljava/lang/Long;

.field private _timestampUsed:Ljava/lang/Long;

.field private final _ttl:Ljava/lang/Long;

.field private final _valueBytes:[B

.field private final _valueString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    .line 56
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    if-eqz p9, :cond_0

    .line 59
    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_key:Ljava/lang/String;

    .line 60
    iput-object p2, p0, Lnet/toddm/cache/CacheEntry;->_valueString:Ljava/lang/String;

    const/4 p1, 0x0

    .line 61
    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_valueBytes:[B

    .line 62
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_ttl:Ljava/lang/Long;

    .line 63
    iput-object p7, p0, Lnet/toddm/cache/CacheEntry;->_etag:Ljava/lang/String;

    .line 64
    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_maxStale:Ljava/lang/Long;

    .line 65
    iput-object p8, p0, Lnet/toddm/cache/CacheEntry;->_sourceUri:Ljava/net/URI;

    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_timestampCreated:Ljava/lang/Long;

    .line 67
    iget-object p1, p0, Lnet/toddm/cache/CacheEntry;->_timestampCreated:Ljava/lang/Long;

    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_timestampModified:Ljava/lang/Long;

    .line 68
    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_timestampUsed:Ljava/lang/Long;

    .line 69
    iput-object p9, p0, Lnet/toddm/cache/CacheEntry;->_priority:Lnet/toddm/cache/CachePriority;

    return-void

    .line 57
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'priority\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'key\' can not be NULL or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;JJJLnet/toddm/cache/CachePriority;)V
    .locals 8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object/from16 v3, p16

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz v1, :cond_7

    .line 134
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_7

    const/4 v4, 0x0

    if-eqz p2, :cond_0

    .line 136
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    if-gtz v5, :cond_0

    move-object v5, v4

    goto :goto_0

    :cond_0
    move-object v5, p2

    :goto_0
    if-eqz v2, :cond_1

    .line 137
    array-length v6, v2

    if-gtz v6, :cond_1

    move-object v2, v4

    :cond_1
    if-eqz v5, :cond_3

    if-nez v2, :cond_2

    goto :goto_1

    .line 138
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "A CacheEntry should only have either a string value OR a bytes value"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 140
    :cond_3
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    cmp-long v4, p10, v6

    if-gtz v4, :cond_6

    .line 141
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    cmp-long v4, p12, v6

    if-gtz v4, :cond_5

    if-eqz v3, :cond_4

    .line 144
    iput-object v1, v0, Lnet/toddm/cache/CacheEntry;->_key:Ljava/lang/String;

    .line 145
    iput-object v5, v0, Lnet/toddm/cache/CacheEntry;->_valueString:Ljava/lang/String;

    .line 146
    iput-object v2, v0, Lnet/toddm/cache/CacheEntry;->_valueBytes:[B

    .line 147
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lnet/toddm/cache/CacheEntry;->_ttl:Ljava/lang/Long;

    move-object/from16 v1, p8

    .line 148
    iput-object v1, v0, Lnet/toddm/cache/CacheEntry;->_etag:Ljava/lang/String;

    .line 149
    invoke-static {p6, p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lnet/toddm/cache/CacheEntry;->_maxStale:Ljava/lang/Long;

    move-object/from16 v1, p9

    .line 150
    iput-object v1, v0, Lnet/toddm/cache/CacheEntry;->_sourceUri:Ljava/net/URI;

    .line 151
    invoke-static/range {p10 .. p11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lnet/toddm/cache/CacheEntry;->_timestampCreated:Ljava/lang/Long;

    .line 152
    invoke-static/range {p12 .. p13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lnet/toddm/cache/CacheEntry;->_timestampModified:Ljava/lang/Long;

    .line 153
    invoke-static/range {p14 .. p15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lnet/toddm/cache/CacheEntry;->_timestampUsed:Ljava/lang/Long;

    .line 154
    iput-object v3, v0, Lnet/toddm/cache/CacheEntry;->_priority:Lnet/toddm/cache/CachePriority;

    return-void

    .line 142
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'priority\' can not be NULL"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 141
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'timestampModified\' should not be in the future"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 140
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'timestampCreated\' should not be in the future"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 134
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'key\' can not be NULL or empty"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public constructor <init>(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)V
    .locals 1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    .line 87
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    if-eqz p9, :cond_0

    .line 90
    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_key:Ljava/lang/String;

    const/4 p1, 0x0

    .line 91
    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_valueString:Ljava/lang/String;

    .line 92
    iput-object p2, p0, Lnet/toddm/cache/CacheEntry;->_valueBytes:[B

    .line 93
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_ttl:Ljava/lang/Long;

    .line 94
    iput-object p7, p0, Lnet/toddm/cache/CacheEntry;->_etag:Ljava/lang/String;

    .line 95
    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_maxStale:Ljava/lang/Long;

    .line 96
    iput-object p8, p0, Lnet/toddm/cache/CacheEntry;->_sourceUri:Ljava/net/URI;

    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_timestampCreated:Ljava/lang/Long;

    .line 98
    iget-object p1, p0, Lnet/toddm/cache/CacheEntry;->_timestampCreated:Ljava/lang/Long;

    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_timestampModified:Ljava/lang/Long;

    .line 99
    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_timestampUsed:Ljava/lang/Long;

    .line 100
    iput-object p9, p0, Lnet/toddm/cache/CacheEntry;->_priority:Lnet/toddm/cache/CachePriority;

    return-void

    .line 88
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'priority\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 87
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'key\' can not be NULL or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getBytesValue()[B
    .locals 1

    .line 164
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_valueBytes:[B

    return-object v0
.end method

.method public getEtag()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_etag:Ljava/lang/String;

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_key:Ljava/lang/String;

    return-object v0
.end method

.method public getMaxStale()Ljava/lang/Long;
    .locals 1

    .line 173
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_maxStale:Ljava/lang/Long;

    return-object v0
.end method

.method public getPriority()Lnet/toddm/cache/CachePriority;
    .locals 1

    .line 200
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_priority:Lnet/toddm/cache/CachePriority;

    return-object v0
.end method

.method public getStringValue()Ljava/lang/String;
    .locals 1

    .line 161
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_valueString:Ljava/lang/String;

    return-object v0
.end method

.method public getTimestampCreated()Ljava/lang/Long;
    .locals 1

    .line 179
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_timestampCreated:Ljava/lang/Long;

    return-object v0
.end method

.method public getTimestampModified()Ljava/lang/Long;
    .locals 1

    .line 182
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_timestampModified:Ljava/lang/Long;

    return-object v0
.end method

.method public getTimestampUsed()Ljava/lang/Long;
    .locals 1

    .line 185
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_timestampUsed:Ljava/lang/Long;

    return-object v0
.end method

.method public getTtl()Ljava/lang/Long;
    .locals 1

    .line 167
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_ttl:Ljava/lang/Long;

    return-object v0
.end method

.method public getUri()Ljava/net/URI;
    .locals 1

    .line 176
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_sourceUri:Ljava/net/URI;

    return-object v0
.end method

.method public hasExceededStaleUse()Z
    .locals 7

    .line 231
    invoke-virtual {p0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 234
    :cond_0
    invoke-virtual {p0}, Lnet/toddm/cache/CacheEntry;->getMaxStale()Ljava/lang/Long;

    move-result-object v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    return v2

    .line 237
    :cond_1
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_timestampModified:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {p0}, Lnet/toddm/cache/CacheEntry;->getTtl()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    add-long/2addr v3, v5

    invoke-virtual {p0}, Lnet/toddm/cache/CacheEntry;->getMaxStale()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    add-long/2addr v3, v5

    .line 238
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_timestampModified:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-gez v0, :cond_2

    const-wide v3, 0x7fffffffffffffffL

    .line 242
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-gez v0, :cond_3

    return v2

    :cond_3
    return v1
.end method

.method public hasExpired()Z
    .locals 6

    .line 209
    invoke-virtual {p0}, Lnet/toddm/cache/CacheEntry;->getTtl()Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 212
    :cond_0
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_timestampModified:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0}, Lnet/toddm/cache/CacheEntry;->getTtl()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    add-long/2addr v2, v4

    .line 213
    iget-object v0, p0, Lnet/toddm/cache/CacheEntry;->_timestampModified:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    const-wide v2, 0x7fffffffffffffffL

    .line 217
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method setTimestampUsed(J)V
    .locals 0

    .line 192
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lnet/toddm/cache/CacheEntry;->_timestampUsed:Ljava/lang/Long;

    return-void
.end method
