.class public Lnet/toddm/cache/tests/MainTest;
.super Ljunit/framework/TestCase;
.source "MainTest.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljunit/framework/TestCase;-><init>()V

    return-void
.end method

.method public static getStackTrace([Ljava/lang/StackTraceElement;)Ljava/lang/String;
    .locals 8

    if-eqz p0, :cond_1

    .line 279
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    .line 280
    :goto_0
    array-length v3, p0

    if-lt v2, v3, :cond_0

    .line 288
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 281
    :cond_0
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "%1$s : %2$s : %3$s [%4$d]\n"

    const/4 v5, 0x4

    .line 282
    new-array v5, v5, [Ljava/lang/Object;

    .line 283
    aget-object v6, p0, v2

    invoke-virtual {v6}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v1

    .line 284
    aget-object v6, p0, v2

    invoke-virtual {v6}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    aput-object v6, v5, v7

    const/4 v6, 0x2

    .line 285
    aget-object v7, p0, v2

    invoke-virtual {v7}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x3

    .line 286
    aget-object v7, p0, v2

    invoke-virtual {v7}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    .line 281
    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 278
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'stacks\' cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getThrowableDump(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 5

    if-eqz p0, :cond_0

    .line 269
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%s | %s | %s"

    const/4 v2, 0x3

    .line 270
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 271
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    .line 272
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    .line 273
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    invoke-static {p0}, Lnet/toddm/cache/tests/MainTest;->getStackTrace([Ljava/lang/StackTraceElement;)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v2, v3

    .line 269
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 268
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'throwable\' cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static validateCacheEntryTimestamps(Lnet/toddm/cache/CacheProvider;)V
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v10, p0

    .line 157
    invoke-interface/range {p0 .. p0}, Lnet/toddm/cache/CacheProvider;->removeAll()Z

    const/4 v11, 0x1

    .line 158
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    .line 160
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    const-string v1, "key1"

    const-string v2, "value1"

    .line 161
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    const-wide/16 v3, 0x3e8

    const-wide/16 v5, 0x3e8

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v0, p0

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    const-string v0, "key1"

    .line 162
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    .line 163
    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertNotNull(Ljava/lang/Object;)V

    .line 165
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getTimestampCreated()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    long-to-float v1, v14

    long-to-float v2, v12

    const/high16 v12, 0x41200000    # 10.0f

    .line 166
    invoke-static {v1, v2, v12}, Lnet/toddm/cache/tests/MainTest;->assertEquals(FFF)V

    .line 167
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getTimestampModified()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v14, v15, v2, v3}, Lnet/toddm/cache/tests/MainTest;->assertEquals(JJ)V

    .line 168
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getTimestampUsed()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-float v2, v2

    invoke-static {v1, v2, v12}, Lnet/toddm/cache/tests/MainTest;->assertEquals(FFF)V

    .line 170
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    .line 171
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExceededStaleUse()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    const-wide/16 v16, 0x3e9

    .line 173
    invoke-static/range {v16 .. v17}, Ljava/lang/Thread;->sleep(J)V

    .line 175
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertTrue(Z)V

    .line 176
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExceededStaleUse()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    .line 178
    invoke-static/range {v16 .. v17}, Ljava/lang/Thread;->sleep(J)V

    .line 180
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertTrue(Z)V

    .line 181
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExceededStaleUse()Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertTrue(Z)V

    .line 183
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const-string v1, "key1"

    const-string v2, "value1"

    .line 184
    sget-object v13, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    const-wide/16 v3, 0x3e8

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v19, v8

    move-object/from16 v8, v18

    move-object v9, v13

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    const-string v0, "key1"

    .line 185
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    .line 186
    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertNotNull(Ljava/lang/Object;)V

    .line 188
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getTimestampModified()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    long-to-float v1, v1

    move-wide/from16 v2, v19

    long-to-float v2, v2

    .line 189
    invoke-static {v1, v2, v12}, Lnet/toddm/cache/tests/MainTest;->assertEquals(FFF)V

    .line 190
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getTimestampCreated()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v14, v15, v2, v3}, Lnet/toddm/cache/tests/MainTest;->assertEquals(JJ)V

    .line 191
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getTimestampUsed()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-float v2, v2

    invoke-static {v1, v2, v12}, Lnet/toddm/cache/tests/MainTest;->assertEquals(FFF)V

    .line 193
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    .line 194
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExceededStaleUse()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    .line 196
    invoke-static/range {v16 .. v17}, Ljava/lang/Thread;->sleep(J)V

    .line 198
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertTrue(Z)V

    .line 199
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExceededStaleUse()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    .line 201
    invoke-static/range {v16 .. v17}, Ljava/lang/Thread;->sleep(J)V

    .line 203
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertTrue(Z)V

    .line 204
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExceededStaleUse()Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertTrue(Z)V

    return-void
.end method

.method public static validateCachingFunctionality(Lnet/toddm/cache/CacheProvider;)V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v10, p0

    .line 45
    invoke-interface/range {p0 .. p0}, Lnet/toddm/cache/CacheProvider;->removeAll()Z

    const/4 v11, 0x1

    .line 46
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->getAll(Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v12, 0x0

    invoke-static {v12, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    .line 47
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    invoke-static {v12, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    const-string v1, "key1"

    const-string v2, "value1: \u2524\u2565,65\u2640635L2\u263b~32\u25102\u25d9\u23201j32\u251053K_"

    .line 49
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    const-wide/16 v3, 0x1

    const-wide/16 v5, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v0, p0

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    const-wide/16 v13, 0x2

    .line 50
    invoke-static {v13, v14}, Ljava/lang/Thread;->sleep(J)V

    const-string v0, "key1"

    .line 51
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    .line 52
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->getAll(Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v11, v1}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    .line 53
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v1

    invoke-static {v11, v1}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    .line 54
    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertNotNull(Ljava/lang/Object;)V

    .line 55
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertTrue(Z)V

    const-string v1, "key1"

    .line 56
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lnet/toddm/cache/tests/MainTest;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getTtl()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v8, 0x1

    invoke-static {v8, v9, v1, v2}, Lnet/toddm/cache/tests/MainTest;->assertEquals(JJ)V

    .line 58
    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V

    .line 59
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExceededStaleUse()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertTrue(Z)V

    .line 60
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getMaxStale()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v8, v9, v1, v2}, Lnet/toddm/cache/tests/MainTest;->assertEquals(JJ)V

    .line 61
    sget-object v1, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getPriority()Lnet/toddm/cache/CachePriority;

    move-result-object v0

    invoke-static {v1, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "key1"

    .line 63
    invoke-interface {v10, v0, v12}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    .line 64
    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertNull(Ljava/lang/Object;)V

    .line 65
    invoke-interface {v10, v12}, Lnet/toddm/cache/CacheProvider;->getAll(Z)Ljava/util/List;

    move-result-object v0

    .line 66
    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertNotNull(Ljava/lang/Object;)V

    .line 67
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v12, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    const-string v1, "key2"

    const-string v2, "value2"

    .line 69
    sget-object v15, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    const-wide/32 v3, 0xf4240

    const-wide/32 v5, 0xf4241

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v8, v16

    move-object v9, v15

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 70
    invoke-static {v13, v14}, Ljava/lang/Thread;->sleep(J)V

    const-string v0, "key2"

    .line 71
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    .line 72
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v1

    const/4 v2, 0x2

    invoke-static {v2, v1}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    .line 73
    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertNotNull(Ljava/lang/Object;)V

    .line 74
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    const-string v1, "key2"

    .line 75
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lnet/toddm/cache/tests/MainTest;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getTtl()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Lnet/toddm/cache/tests/MainTest;->assertEquals(JJ)V

    .line 77
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExceededStaleUse()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    .line 78
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getMaxStale()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/32 v2, 0xf4241

    invoke-static {v2, v3, v0, v1}, Lnet/toddm/cache/tests/MainTest;->assertEquals(JJ)V

    const-string v1, "key3"

    const-string v2, "value3"

    .line 80
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    const-wide/32 v3, 0xf4240

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    move-object/from16 v0, p0

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 81
    invoke-static {v13, v14}, Ljava/lang/Thread;->sleep(J)V

    const-string v0, "key3"

    .line 82
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    .line 83
    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertNotNull(Ljava/lang/Object;)V

    .line 84
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    const/4 v15, 0x3

    invoke-static {v15, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    const-string v1, "key4"

    const-string v2, "value4"

    .line 86
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    move-object/from16 v0, p0

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 87
    invoke-static {v13, v14}, Ljava/lang/Thread;->sleep(J)V

    const-string v0, "key4"

    .line 88
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    .line 89
    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertNotNull(Ljava/lang/Object;)V

    .line 90
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    const-string v0, "key3"

    .line 92
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertTrue(Z)V

    const-string v0, "key3"

    .line 93
    invoke-interface {v10, v0}, Lnet/toddm/cache/CacheProvider;->remove(Ljava/lang/String;)Z

    const-string v0, "key3"

    .line 94
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    .line 95
    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertNull(Ljava/lang/Object;)V

    .line 96
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    invoke-static {v15, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    const-string v0, "key3"

    .line 97
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    .line 99
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->setLruCap(I)V

    .line 100
    invoke-interface/range {p0 .. p0}, Lnet/toddm/cache/CacheProvider;->trimLru()Z

    .line 101
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->getAll(Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v11, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    .line 102
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    invoke-static {v11, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    const-string v0, "key4"

    .line 103
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    .line 104
    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertNotNull(Ljava/lang/Object;)V

    .line 106
    invoke-interface/range {p0 .. p0}, Lnet/toddm/cache/CacheProvider;->removeAll()Z

    const-string v1, "key5"

    const-string v2, "value5"

    .line 107
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    const-wide/16 v3, 0x1

    move-object/from16 v0, p0

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 108
    invoke-static {v13, v14}, Ljava/lang/Thread;->sleep(J)V

    .line 109
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    invoke-static {v11, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    .line 110
    invoke-interface {v10, v12}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    invoke-static {v12, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    const-string v0, "key5"

    .line 111
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertTrue(Z)V

    const-string v0, "key5"

    .line 112
    invoke-interface {v10, v0, v12}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    .line 114
    invoke-interface/range {p0 .. p0}, Lnet/toddm/cache/CacheProvider;->removeAll()Z

    .line 115
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->getAll(Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v12, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    .line 116
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    invoke-static {v12, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    const/16 v0, 0xa

    .line 118
    new-array v13, v0, [B

    fill-array-data v13, :array_0

    const-string v1, "key1"

    .line 119
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    move-object/from16 v0, p0

    move-object v2, v13

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;[BJJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    const-string v0, "key1"

    .line 120
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    .line 121
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->getAll(Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v11, v1}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    .line 122
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v1

    invoke-static {v11, v1}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    .line 123
    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertNotNull(Ljava/lang/Object;)V

    const-string v1, "key1"

    .line 124
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lnet/toddm/cache/tests/MainTest;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getTtl()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    invoke-static {v3, v4, v1, v2}, Lnet/toddm/cache/tests/MainTest;->assertEquals(JJ)V

    .line 126
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getStringValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertNull(Ljava/lang/Object;)V

    .line 127
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getBytesValue()[B

    move-result-object v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertNotNull(Ljava/lang/Object;)V

    .line 128
    array-length v1, v13

    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getBytesValue()[B

    move-result-object v2

    array-length v2, v2

    invoke-static {v1, v2}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    move v1, v12

    .line 129
    :goto_0
    array-length v2, v13

    if-lt v1, v2, :cond_0

    const-string v1, "maxValTestKey1"

    const-string v2, "maxValTestValue1: \u2524\u2565,65\u2640635L2\u263b~32\u25102\u25d9\u23201j32\u251053K_"

    const-wide v3, 0x7fffffffffffffffL

    const-wide v5, 0x7fffffffffffffffL

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 133
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    move-object/from16 v0, p0

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    const-string v0, "maxValTestKey1"

    .line 134
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    .line 135
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    .line 136
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExceededStaleUse()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    .line 137
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getTtl()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Lnet/toddm/cache/tests/MainTest;->assertEquals(JJ)V

    .line 138
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getMaxStale()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v3, v4, v0, v1}, Lnet/toddm/cache/tests/MainTest;->assertEquals(JJ)V

    const-string v1, "maxValTestKey2"

    const-string v2, "maxValTestValue1: \u2524\u2565,65\u2640635L2\u263b~32\u25102\u25d9\u23201j32\u251053K_"

    const-wide v3, 0x7fffffffffffff9bL

    const-wide v5, 0x7fffffffffffff9bL

    .line 140
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    move-object/from16 v0, p0

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    const-string v0, "maxValTestKey2"

    .line 141
    invoke-interface {v10, v0, v11}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    .line 142
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExpired()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    .line 143
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->hasExceededStaleUse()Z

    move-result v1

    invoke-static {v1}, Lnet/toddm/cache/tests/MainTest;->assertFalse(Z)V

    .line 144
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getTtl()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Lnet/toddm/cache/tests/MainTest;->assertEquals(JJ)V

    .line 145
    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getMaxStale()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v3, v4, v0, v1}, Lnet/toddm/cache/tests/MainTest;->assertEquals(JJ)V

    .line 147
    invoke-interface/range {p0 .. p0}, Lnet/toddm/cache/CacheProvider;->removeAll()Z

    .line 148
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->getAll(Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v12, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    .line 149
    invoke-interface {v10, v11}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    invoke-static {v12, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    .line 151
    invoke-static/range {p0 .. p0}, Lnet/toddm/cache/tests/MainTest;->validateLru(Lnet/toddm/cache/CacheProvider;)V

    .line 152
    invoke-static/range {p0 .. p0}, Lnet/toddm/cache/tests/MainTest;->validateEvictionScores(Lnet/toddm/cache/CacheProvider;)V

    .line 153
    invoke-static/range {p0 .. p0}, Lnet/toddm/cache/tests/MainTest;->validateCacheEntryTimestamps(Lnet/toddm/cache/CacheProvider;)V

    return-void

    .line 130
    :cond_0
    aget-byte v2, v13, v1

    invoke-virtual {v0}, Lnet/toddm/cache/CacheEntry;->getBytesValue()[B

    move-result-object v3

    aget-byte v3, v3, v1

    invoke-static {v2, v3}, Lnet/toddm/cache/tests/MainTest;->assertEquals(BB)V

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    nop

    :array_0
    .array-data 1
        -0x34t
        0x71t
        0x6ct
        0x7at
        0x3t
        -0x18t
        0x70t
        0x32t
        0x11t
        0x3ft
    .end array-data
.end method

.method public static validateEvictionScores(Lnet/toddm/cache/CacheProvider;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 234
    invoke-interface {p0}, Lnet/toddm/cache/CacheProvider;->removeAll()Z

    const/4 v10, 0x1

    .line 235
    invoke-interface {p0, v10}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    const/4 v11, 0x0

    invoke-static {v11, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    const-string v1, "esKey1"

    const-string v2, "esValue1"

    .line 237
    sget-object v9, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    const-wide/16 v3, 0x3e8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    const-wide/16 v12, 0x64

    .line 238
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V

    const-string v1, "esKey2"

    const-string v2, "esValue2"

    .line 239
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 240
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V

    const-string v1, "esKey3"

    const-string v2, "esValue3"

    .line 241
    sget-object v9, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 242
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V

    const-string v1, "esKey4"

    const-string v2, "esValue4"

    .line 243
    sget-object v9, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 244
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V

    const-string v1, "esKey5"

    const-string v2, "esValue5"

    .line 245
    sget-object v9, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 246
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V

    const-string v1, "esKey6"

    const-string v2, "esValue6"

    .line 247
    sget-object v9, Lnet/toddm/cache/CachePriority;->HIGH:Lnet/toddm/cache/CachePriority;

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 248
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V

    const-string v1, "esKey7"

    const-string v2, "esValue7"

    .line 249
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 250
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V

    const/4 v0, 0x3

    .line 252
    invoke-interface {p0, v0}, Lnet/toddm/cache/CacheProvider;->setLruCap(I)V

    .line 253
    invoke-interface {p0}, Lnet/toddm/cache/CacheProvider;->trimLru()Z

    .line 254
    invoke-interface {p0, v10}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v1

    invoke-static {v0, v1}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    const-string v0, "esKey6"

    .line 258
    invoke-interface {p0, v0, v10}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertTrue(Z)V

    const-string v0, "esKey1"

    .line 259
    invoke-interface {p0, v0, v10}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertTrue(Z)V

    const-string v0, "esKey7"

    .line 260
    invoke-interface {p0, v0, v10}, Lnet/toddm/cache/CacheProvider;->containsKey(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertTrue(Z)V

    .line 262
    invoke-interface {p0}, Lnet/toddm/cache/CacheProvider;->removeAll()Z

    .line 263
    invoke-interface {p0, v10}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    invoke-static {v11, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    return-void
.end method

.method public static validateLru(Lnet/toddm/cache/CacheProvider;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 209
    invoke-interface {p0}, Lnet/toddm/cache/CacheProvider;->removeAll()Z

    const/4 v10, 0x1

    .line 210
    invoke-interface {p0, v10}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    const/4 v11, 0x0

    invoke-static {v11, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    const-string v1, "key1"

    const-string v2, "value1"

    .line 212
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    const-wide/16 v3, 0x3e8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    const-wide/16 v12, 0xa

    .line 213
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V

    const-string v1, "key2"

    const-string v2, "value2"

    .line 214
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 215
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V

    const-string v1, "key3"

    const-string v2, "value3"

    .line 216
    sget-object v9, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    invoke-interface/range {v0 .. v9}, Lnet/toddm/cache/CacheProvider;->add(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/net/URI;Lnet/toddm/cache/CachePriority;)Z

    .line 217
    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V

    const-string v0, "key2"

    .line 219
    invoke-interface {p0, v0, v10}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    .line 221
    invoke-interface {p0, v10}, Lnet/toddm/cache/CacheProvider;->setLruCap(I)V

    .line 222
    invoke-interface {p0}, Lnet/toddm/cache/CacheProvider;->trimLru()Z

    .line 223
    invoke-interface {p0, v10}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    invoke-static {v10, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    const-string v0, "key2"

    .line 226
    invoke-interface {p0, v0, v10}, Lnet/toddm/cache/CacheProvider;->get(Ljava/lang/String;Z)Lnet/toddm/cache/CacheEntry;

    move-result-object v0

    .line 227
    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->assertNotNull(Ljava/lang/Object;)V

    .line 229
    invoke-interface {p0}, Lnet/toddm/cache/CacheProvider;->removeAll()Z

    .line 230
    invoke-interface {p0, v10}, Lnet/toddm/cache/CacheProvider;->size(Z)I

    move-result v0

    invoke-static {v11, v0}, Lnet/toddm/cache/tests/MainTest;->assertEquals(II)V

    return-void
.end method


# virtual methods
.method public testMemoryCacheProvider()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 31
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "#######################################"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 34
    new-instance v0, Lnet/toddm/cache/MemoryCacheProvider;

    const-string v1, "TestNamespace"

    new-instance v2, Lnet/toddm/cache/DefaultLogger;

    invoke-direct {v2}, Lnet/toddm/cache/DefaultLogger;-><init>()V

    const/16 v3, 0x14

    invoke-direct {v0, v1, v3, v2}, Lnet/toddm/cache/MemoryCacheProvider;-><init>(Ljava/lang/String;ILnet/toddm/cache/LoggingProvider;)V

    .line 35
    invoke-static {v0}, Lnet/toddm/cache/tests/MainTest;->validateCachingFunctionality(Lnet/toddm/cache/CacheProvider;)V

    return-void
.end method
