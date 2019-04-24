.class public final Lokhttp3/CacheControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/CacheControl$Builder;
    }
.end annotation


# static fields
.field public static final FORCE_CACHE:Lokhttp3/CacheControl;

.field public static final FORCE_NETWORK:Lokhttp3/CacheControl;


# instance fields
.field headerValue:Ljava/lang/String;

.field private final isPrivate:Z

.field private final isPublic:Z

.field private final maxAgeSeconds:I

.field private final maxStaleSeconds:I

.field private final minFreshSeconds:I

.field private final mustRevalidate:Z

.field private final noCache:Z

.field private final noStore:Z

.field private final noTransform:Z

.field private final onlyIfCached:Z

.field private final sMaxAgeSeconds:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 18
    new-instance v0, Lokhttp3/CacheControl$Builder;

    invoke-direct {v0}, Lokhttp3/CacheControl$Builder;-><init>()V

    invoke-virtual {v0}, Lokhttp3/CacheControl$Builder;->noCache()Lokhttp3/CacheControl$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/CacheControl$Builder;->build()Lokhttp3/CacheControl;

    move-result-object v0

    sput-object v0, Lokhttp3/CacheControl;->FORCE_NETWORK:Lokhttp3/CacheControl;

    .line 25
    new-instance v0, Lokhttp3/CacheControl$Builder;

    invoke-direct {v0}, Lokhttp3/CacheControl$Builder;-><init>()V

    .line 26
    invoke-virtual {v0}, Lokhttp3/CacheControl$Builder;->onlyIfCached()Lokhttp3/CacheControl$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 27
    const v2, 0x7fffffff

    invoke-virtual {v0, v2, v1}, Lokhttp3/CacheControl$Builder;->maxStale(ILjava/util/concurrent/TimeUnit;)Lokhttp3/CacheControl$Builder;

    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lokhttp3/CacheControl$Builder;->build()Lokhttp3/CacheControl;

    move-result-object v0

    sput-object v0, Lokhttp3/CacheControl;->FORCE_CACHE:Lokhttp3/CacheControl;

    .line 25
    return-void
.end method

.method private constructor <init>(Lokhttp3/CacheControl$Builder;)V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iget-boolean v0, p1, Lokhttp3/CacheControl$Builder;->noCache:Z

    iput-boolean v0, p0, Lokhttp3/CacheControl;->noCache:Z

    .line 63
    iget-boolean v0, p1, Lokhttp3/CacheControl$Builder;->noStore:Z

    iput-boolean v0, p0, Lokhttp3/CacheControl;->noStore:Z

    .line 64
    iget v0, p1, Lokhttp3/CacheControl$Builder;->maxAgeSeconds:I

    iput v0, p0, Lokhttp3/CacheControl;->maxAgeSeconds:I

    .line 65
    const/4 v0, -0x1

    iput v0, p0, Lokhttp3/CacheControl;->sMaxAgeSeconds:I

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lokhttp3/CacheControl;->isPrivate:Z

    .line 67
    const/4 v0, 0x0

    iput-boolean v0, p0, Lokhttp3/CacheControl;->isPublic:Z

    .line 68
    const/4 v0, 0x0

    iput-boolean v0, p0, Lokhttp3/CacheControl;->mustRevalidate:Z

    .line 69
    iget v0, p1, Lokhttp3/CacheControl$Builder;->maxStaleSeconds:I

    iput v0, p0, Lokhttp3/CacheControl;->maxStaleSeconds:I

    .line 70
    iget v0, p1, Lokhttp3/CacheControl$Builder;->minFreshSeconds:I

    iput v0, p0, Lokhttp3/CacheControl;->minFreshSeconds:I

    .line 71
    iget-boolean v0, p1, Lokhttp3/CacheControl$Builder;->onlyIfCached:Z

    iput-boolean v0, p0, Lokhttp3/CacheControl;->onlyIfCached:Z

    .line 72
    iget-boolean v0, p1, Lokhttp3/CacheControl$Builder;->noTransform:Z

    iput-boolean v0, p0, Lokhttp3/CacheControl;->noTransform:Z

    .line 73
    return-void
.end method

.method synthetic constructor <init>(Lokhttp3/CacheControl$Builder;Lokhttp3/CacheControl$1;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lokhttp3/CacheControl;-><init>(Lokhttp3/CacheControl$Builder;)V

    return-void
.end method

.method private constructor <init>(ZZIIZZZIIZZLjava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-boolean p1, p0, Lokhttp3/CacheControl;->noCache:Z

    .line 48
    iput-boolean p2, p0, Lokhttp3/CacheControl;->noStore:Z

    .line 49
    iput p3, p0, Lokhttp3/CacheControl;->maxAgeSeconds:I

    .line 50
    iput p4, p0, Lokhttp3/CacheControl;->sMaxAgeSeconds:I

    .line 51
    iput-boolean p5, p0, Lokhttp3/CacheControl;->isPrivate:Z

    .line 52
    iput-boolean p6, p0, Lokhttp3/CacheControl;->isPublic:Z

    .line 53
    iput-boolean p7, p0, Lokhttp3/CacheControl;->mustRevalidate:Z

    .line 54
    iput p8, p0, Lokhttp3/CacheControl;->maxStaleSeconds:I

    .line 55
    iput p9, p0, Lokhttp3/CacheControl;->minFreshSeconds:I

    .line 56
    iput-boolean p10, p0, Lokhttp3/CacheControl;->onlyIfCached:Z

    .line 57
    iput-boolean p11, p0, Lokhttp3/CacheControl;->noTransform:Z

    .line 58
    iput-object p12, p0, Lokhttp3/CacheControl;->headerValue:Ljava/lang/String;

    .line 59
    return-void
.end method

.method private headerValue()Ljava/lang/String;
    .locals 3

    .line 247
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 248
    iget-boolean v0, p0, Lokhttp3/CacheControl;->noCache:Z

    if-eqz v0, :cond_0

    const-string v0, "no-cache, "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    :cond_0
    iget-boolean v0, p0, Lokhttp3/CacheControl;->noStore:Z

    if-eqz v0, :cond_1

    const-string v0, "no-store, "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    :cond_1
    iget v0, p0, Lokhttp3/CacheControl;->maxAgeSeconds:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    const-string v0, "max-age="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lokhttp3/CacheControl;->maxAgeSeconds:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    :cond_2
    iget v0, p0, Lokhttp3/CacheControl;->sMaxAgeSeconds:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    const-string v0, "s-maxage="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lokhttp3/CacheControl;->sMaxAgeSeconds:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    :cond_3
    iget-boolean v0, p0, Lokhttp3/CacheControl;->isPrivate:Z

    if-eqz v0, :cond_4

    const-string v0, "private, "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    :cond_4
    iget-boolean v0, p0, Lokhttp3/CacheControl;->isPublic:Z

    if-eqz v0, :cond_5

    const-string v0, "public, "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    :cond_5
    iget-boolean v0, p0, Lokhttp3/CacheControl;->mustRevalidate:Z

    if-eqz v0, :cond_6

    const-string v0, "must-revalidate, "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    :cond_6
    iget v0, p0, Lokhttp3/CacheControl;->maxStaleSeconds:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_7

    const-string v0, "max-stale="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lokhttp3/CacheControl;->maxStaleSeconds:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    :cond_7
    iget v0, p0, Lokhttp3/CacheControl;->minFreshSeconds:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    const-string v0, "min-fresh="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lokhttp3/CacheControl;->minFreshSeconds:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    :cond_8
    iget-boolean v0, p0, Lokhttp3/CacheControl;->onlyIfCached:Z

    if-eqz v0, :cond_9

    const-string v0, "only-if-cached, "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    :cond_9
    iget-boolean v0, p0, Lokhttp3/CacheControl;->noTransform:Z

    if-eqz v0, :cond_a

    const-string v0, "no-transform, "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    :cond_a
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_b

    const-string v0, ""

    return-object v0

    .line 260
    :cond_b
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 261
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static parse(Lokhttp3/Headers;)Lokhttp3/CacheControl;
    .locals 35

    .line 145
    const/4 v13, 0x0

    .line 146
    const/4 v14, 0x0

    .line 147
    const/4 v15, -0x1

    .line 148
    const/16 v16, -0x1

    .line 149
    const/16 v17, 0x0

    .line 150
    const/16 v18, 0x0

    .line 151
    const/16 v19, 0x0

    .line 152
    const/16 v20, -0x1

    .line 153
    const/16 v21, -0x1

    .line 154
    const/16 v22, 0x0

    .line 155
    const/16 v23, 0x0

    .line 157
    const/16 v24, 0x1

    .line 158
    const/16 v25, 0x0

    .line 160
    const/16 v26, 0x0

    invoke-virtual/range {p0 .. p0}, Lokhttp3/Headers;->size()I

    move-result v27

    :goto_0
    move/from16 v0, v26

    move/from16 v1, v27

    if-ge v0, v1, :cond_11

    .line 161
    move-object/from16 v0, p0

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v28

    .line 162
    move-object/from16 v0, p0

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v29

    .line 164
    const-string v0, "Cache-Control"

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 165
    if-eqz v25, :cond_0

    .line 167
    const/16 v24, 0x0

    goto :goto_1

    .line 169
    :cond_0
    move-object/from16 v25, v29

    goto :goto_1

    .line 171
    :cond_1
    const-string v0, "Pragma"

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 173
    const/16 v24, 0x0

    .line 178
    :goto_1
    const/16 v30, 0x0

    .line 179
    :goto_2
    invoke-virtual/range {v29 .. v29}, Ljava/lang/String;->length()I

    move-result v0

    move/from16 v1, v30

    if-ge v1, v0, :cond_10

    .line 180
    move/from16 v31, v30

    .line 181
    const-string v0, "=,;"

    move-object/from16 v1, v29

    move/from16 v2, v30

    invoke-static {v1, v2, v0}, Lokhttp3/internal/http/HeaderParser;->skipUntil(Ljava/lang/String;ILjava/lang/String;)I

    move-result v30

    .line 182
    move-object/from16 v0, v29

    move/from16 v1, v31

    move/from16 v2, v30

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v32

    .line 185
    invoke-virtual/range {v29 .. v29}, Ljava/lang/String;->length()I

    move-result v0

    move/from16 v1, v30

    if-eq v1, v0, :cond_2

    move-object/from16 v0, v29

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2c

    if-eq v0, v1, :cond_2

    move-object/from16 v0, v29

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x3b

    if-ne v0, v1, :cond_3

    .line 186
    :cond_2
    add-int/lit8 v30, v30, 0x1

    .line 187
    const/16 v33, 0x0

    goto :goto_3

    .line 189
    :cond_3
    add-int/lit8 v30, v30, 0x1

    .line 190
    move-object/from16 v0, v29

    move/from16 v1, v30

    invoke-static {v0, v1}, Lokhttp3/internal/http/HeaderParser;->skipWhitespace(Ljava/lang/String;I)I

    move-result v30

    .line 193
    invoke-virtual/range {v29 .. v29}, Ljava/lang/String;->length()I

    move-result v0

    move/from16 v1, v30

    if-ge v1, v0, :cond_4

    move-object/from16 v0, v29

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_4

    .line 194
    add-int/lit8 v30, v30, 0x1

    .line 195
    move/from16 v34, v30

    .line 196
    const-string v0, "\""

    move-object/from16 v1, v29

    move/from16 v2, v30

    invoke-static {v1, v2, v0}, Lokhttp3/internal/http/HeaderParser;->skipUntil(Ljava/lang/String;ILjava/lang/String;)I

    move-result v30

    .line 197
    move-object/from16 v0, v29

    move/from16 v1, v34

    move/from16 v2, v30

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v33

    .line 198
    add-int/lit8 v30, v30, 0x1

    .line 201
    goto :goto_3

    .line 202
    :cond_4
    move/from16 v34, v30

    .line 203
    const-string v0, ",;"

    move-object/from16 v1, v29

    move/from16 v2, v30

    invoke-static {v1, v2, v0}, Lokhttp3/internal/http/HeaderParser;->skipUntil(Ljava/lang/String;ILjava/lang/String;)I

    move-result v30

    .line 204
    move-object/from16 v0, v29

    move/from16 v1, v34

    move/from16 v2, v30

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v33

    .line 208
    :goto_3
    const-string v0, "no-cache"

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 209
    const/4 v13, 0x1

    goto/16 :goto_4

    .line 210
    :cond_5
    const-string v0, "no-store"

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 211
    const/4 v14, 0x1

    goto/16 :goto_4

    .line 212
    :cond_6
    const-string v0, "max-age"

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 213
    move-object/from16 v0, v33

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lokhttp3/internal/http/HeaderParser;->parseSeconds(Ljava/lang/String;I)I

    move-result v15

    goto/16 :goto_4

    .line 214
    :cond_7
    const-string v0, "s-maxage"

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 215
    move-object/from16 v0, v33

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lokhttp3/internal/http/HeaderParser;->parseSeconds(Ljava/lang/String;I)I

    move-result v16

    goto :goto_4

    .line 216
    :cond_8
    const-string v0, "private"

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 217
    const/16 v17, 0x1

    goto :goto_4

    .line 218
    :cond_9
    const-string v0, "public"

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 219
    const/16 v18, 0x1

    goto :goto_4

    .line 220
    :cond_a
    const-string v0, "must-revalidate"

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 221
    const/16 v19, 0x1

    goto :goto_4

    .line 222
    :cond_b
    const-string v0, "max-stale"

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 223
    move-object/from16 v0, v33

    const v1, 0x7fffffff

    invoke-static {v0, v1}, Lokhttp3/internal/http/HeaderParser;->parseSeconds(Ljava/lang/String;I)I

    move-result v20

    goto :goto_4

    .line 224
    :cond_c
    const-string v0, "min-fresh"

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 225
    move-object/from16 v0, v33

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lokhttp3/internal/http/HeaderParser;->parseSeconds(Ljava/lang/String;I)I

    move-result v21

    goto :goto_4

    .line 226
    :cond_d
    const-string v0, "only-if-cached"

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 227
    const/16 v22, 0x1

    goto :goto_4

    .line 228
    :cond_e
    const-string v0, "no-transform"

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 229
    const/16 v23, 0x1

    .line 231
    :cond_f
    :goto_4
    goto/16 :goto_2

    .line 160
    :cond_10
    add-int/lit8 v26, v26, 0x1

    goto/16 :goto_0

    .line 234
    :cond_11
    if-nez v24, :cond_12

    .line 235
    const/16 v25, 0x0

    .line 237
    :cond_12
    new-instance v0, Lokhttp3/CacheControl;

    move v1, v13

    move v2, v14

    move v3, v15

    move/from16 v4, v16

    move/from16 v5, v17

    move/from16 v6, v18

    move/from16 v7, v19

    move/from16 v8, v20

    move/from16 v9, v21

    move/from16 v10, v22

    move/from16 v11, v23

    move-object/from16 v12, v25

    invoke-direct/range {v0 .. v12}, Lokhttp3/CacheControl;-><init>(ZZIIZZZIIZZLjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public isPrivate()Z
    .locals 1

    .line 107
    iget-boolean v0, p0, Lokhttp3/CacheControl;->isPrivate:Z

    return v0
.end method

.method public isPublic()Z
    .locals 1

    .line 111
    iget-boolean v0, p0, Lokhttp3/CacheControl;->isPublic:Z

    return v0
.end method

.method public maxAgeSeconds()I
    .locals 1

    .line 95
    iget v0, p0, Lokhttp3/CacheControl;->maxAgeSeconds:I

    return v0
.end method

.method public maxStaleSeconds()I
    .locals 1

    .line 119
    iget v0, p0, Lokhttp3/CacheControl;->maxStaleSeconds:I

    return v0
.end method

.method public minFreshSeconds()I
    .locals 1

    .line 123
    iget v0, p0, Lokhttp3/CacheControl;->minFreshSeconds:I

    return v0
.end method

.method public mustRevalidate()Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Lokhttp3/CacheControl;->mustRevalidate:Z

    return v0
.end method

.method public noCache()Z
    .locals 1

    .line 83
    iget-boolean v0, p0, Lokhttp3/CacheControl;->noCache:Z

    return v0
.end method

.method public noStore()Z
    .locals 1

    .line 88
    iget-boolean v0, p0, Lokhttp3/CacheControl;->noStore:Z

    return v0
.end method

.method public noTransform()Z
    .locals 1

    .line 137
    iget-boolean v0, p0, Lokhttp3/CacheControl;->noTransform:Z

    return v0
.end method

.method public onlyIfCached()Z
    .locals 1

    .line 133
    iget-boolean v0, p0, Lokhttp3/CacheControl;->onlyIfCached:Z

    return v0
.end method

.method public sMaxAgeSeconds()I
    .locals 1

    .line 103
    iget v0, p0, Lokhttp3/CacheControl;->sMaxAgeSeconds:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 242
    iget-object v1, p0, Lokhttp3/CacheControl;->headerValue:Ljava/lang/String;

    .line 243
    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lokhttp3/CacheControl;->headerValue()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/CacheControl;->headerValue:Ljava/lang/String;

    :goto_0
    return-object v0
.end method
