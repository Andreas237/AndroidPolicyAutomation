.class public final Lcom/squareup/okhttp/CacheControl;
.super Ljava/lang/Object;
.source "CacheControl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/CacheControl$Builder;
    }
.end annotation


# static fields
.field public static final FORCE_CACHE:Lcom/squareup/okhttp/CacheControl;

.field public static final FORCE_NETWORK:Lcom/squareup/okhttp/CacheControl;


# instance fields
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

    .line 20
    new-instance v0, Lcom/squareup/okhttp/CacheControl$Builder;

    invoke-direct {v0}, Lcom/squareup/okhttp/CacheControl$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/squareup/okhttp/CacheControl$Builder;->noCache()Lcom/squareup/okhttp/CacheControl$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/CacheControl$Builder;->build()Lcom/squareup/okhttp/CacheControl;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/CacheControl;->FORCE_NETWORK:Lcom/squareup/okhttp/CacheControl;

    .line 28
    new-instance v0, Lcom/squareup/okhttp/CacheControl$Builder;

    invoke-direct {v0}, Lcom/squareup/okhttp/CacheControl$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/squareup/okhttp/CacheControl$Builder;->onlyIfCached()Lcom/squareup/okhttp/CacheControl$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const v2, 0x7fffffff

    invoke-virtual {v0, v2, v1}, Lcom/squareup/okhttp/CacheControl$Builder;->maxStale(ILjava/util/concurrent/TimeUnit;)Lcom/squareup/okhttp/CacheControl$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/CacheControl$Builder;->build()Lcom/squareup/okhttp/CacheControl;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/CacheControl;->FORCE_CACHE:Lcom/squareup/okhttp/CacheControl;

    return-void
.end method

.method private constructor <init>(Lcom/squareup/okhttp/CacheControl$Builder;)V
    .locals 1

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iget-boolean v0, p1, Lcom/squareup/okhttp/CacheControl$Builder;->noCache:Z

    iput-boolean v0, p0, Lcom/squareup/okhttp/CacheControl;->noCache:Z

    .line 61
    iget-boolean v0, p1, Lcom/squareup/okhttp/CacheControl$Builder;->noStore:Z

    iput-boolean v0, p0, Lcom/squareup/okhttp/CacheControl;->noStore:Z

    .line 62
    iget v0, p1, Lcom/squareup/okhttp/CacheControl$Builder;->maxAgeSeconds:I

    iput v0, p0, Lcom/squareup/okhttp/CacheControl;->maxAgeSeconds:I

    const/4 v0, -0x1

    .line 63
    iput v0, p0, Lcom/squareup/okhttp/CacheControl;->sMaxAgeSeconds:I

    const/4 v0, 0x0

    .line 64
    iput-boolean v0, p0, Lcom/squareup/okhttp/CacheControl;->isPublic:Z

    .line 65
    iput-boolean v0, p0, Lcom/squareup/okhttp/CacheControl;->mustRevalidate:Z

    .line 66
    iget v0, p1, Lcom/squareup/okhttp/CacheControl$Builder;->maxStaleSeconds:I

    iput v0, p0, Lcom/squareup/okhttp/CacheControl;->maxStaleSeconds:I

    .line 67
    iget v0, p1, Lcom/squareup/okhttp/CacheControl$Builder;->minFreshSeconds:I

    iput v0, p0, Lcom/squareup/okhttp/CacheControl;->minFreshSeconds:I

    .line 68
    iget-boolean v0, p1, Lcom/squareup/okhttp/CacheControl$Builder;->onlyIfCached:Z

    iput-boolean v0, p0, Lcom/squareup/okhttp/CacheControl;->onlyIfCached:Z

    .line 69
    iget-boolean p1, p1, Lcom/squareup/okhttp/CacheControl$Builder;->noTransform:Z

    iput-boolean p1, p0, Lcom/squareup/okhttp/CacheControl;->noTransform:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/squareup/okhttp/CacheControl$Builder;Lcom/squareup/okhttp/CacheControl$1;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/CacheControl;-><init>(Lcom/squareup/okhttp/CacheControl$Builder;)V

    return-void
.end method

.method private constructor <init>(ZZIIZZIIZZ)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-boolean p1, p0, Lcom/squareup/okhttp/CacheControl;->noCache:Z

    .line 48
    iput-boolean p2, p0, Lcom/squareup/okhttp/CacheControl;->noStore:Z

    .line 49
    iput p3, p0, Lcom/squareup/okhttp/CacheControl;->maxAgeSeconds:I

    .line 50
    iput p4, p0, Lcom/squareup/okhttp/CacheControl;->sMaxAgeSeconds:I

    .line 51
    iput-boolean p5, p0, Lcom/squareup/okhttp/CacheControl;->isPublic:Z

    .line 52
    iput-boolean p6, p0, Lcom/squareup/okhttp/CacheControl;->mustRevalidate:Z

    .line 53
    iput p7, p0, Lcom/squareup/okhttp/CacheControl;->maxStaleSeconds:I

    .line 54
    iput p8, p0, Lcom/squareup/okhttp/CacheControl;->minFreshSeconds:I

    .line 55
    iput-boolean p9, p0, Lcom/squareup/okhttp/CacheControl;->onlyIfCached:Z

    .line 56
    iput-boolean p10, p0, Lcom/squareup/okhttp/CacheControl;->noTransform:Z

    return-void
.end method

.method public static parse(Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/CacheControl;
    .locals 17

    move-object/from16 v0, p0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, -0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 153
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/squareup/okhttp/Headers;->size()I

    move-result v4

    if-ge v3, v4, :cond_f

    .line 154
    invoke-virtual {v0, v3}, Lcom/squareup/okhttp/Headers;->name(I)Ljava/lang/String;

    move-result-object v4

    const-string v15, "Cache-Control"

    invoke-virtual {v4, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v0, v3}, Lcom/squareup/okhttp/Headers;->name(I)Ljava/lang/String;

    move-result-object v4

    const-string v15, "Pragma"

    invoke-virtual {v4, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    const/4 v2, -0x1

    goto/16 :goto_5

    .line 159
    :cond_0
    invoke-virtual {v0, v3}, Lcom/squareup/okhttp/Headers;->value(I)Ljava/lang/String;

    move-result-object v4

    move v15, v14

    move v14, v13

    move v13, v12

    move v12, v11

    move v11, v10

    move v10, v9

    move v9, v8

    move v8, v7

    move v7, v6

    move v6, v5

    const/4 v5, 0x0

    .line 161
    :goto_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v5, v2, :cond_e

    const-string v2, "=,;"

    .line 163
    invoke-static {v4, v5, v2}, Lcom/squareup/okhttp/internal/http/HeaderParser;->skipUntil(Ljava/lang/String;ILjava/lang/String;)I

    move-result v2

    .line 164
    invoke-virtual {v4, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 167
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v16, 0x1

    if-eq v2, v1, :cond_3

    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v0, 0x2c

    if-eq v1, v0, :cond_3

    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x3b

    if-ne v0, v1, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 172
    invoke-static {v4, v2}, Lcom/squareup/okhttp/internal/http/HeaderParser;->skipWhitespace(Ljava/lang/String;I)I

    move-result v0

    .line 175
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x22

    if-ne v1, v2, :cond_2

    add-int/lit8 v0, v0, 0x1

    const-string v1, "\""

    .line 178
    invoke-static {v4, v0, v1}, Lcom/squareup/okhttp/internal/http/HeaderParser;->skipUntil(Ljava/lang/String;ILjava/lang/String;)I

    move-result v1

    .line 179
    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_2
    const-string v1, ",;"

    .line 185
    invoke-static {v4, v0, v1}, Lcom/squareup/okhttp/internal/http/HeaderParser;->skipUntil(Ljava/lang/String;ILjava/lang/String;)I

    move-result v1

    .line 186
    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    const/4 v0, 0x0

    move v1, v2

    :goto_3
    const-string v2, "no-cache"

    .line 190
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    move/from16 v6, v16

    const/4 v2, -0x1

    goto/16 :goto_4

    :cond_4
    const-string v2, "no-store"

    .line 192
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    move/from16 v7, v16

    const/4 v2, -0x1

    goto/16 :goto_4

    :cond_5
    const-string v2, "max-age"

    .line 194
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    .line 195
    invoke-static {v0, v2}, Lcom/squareup/okhttp/internal/http/HeaderParser;->parseSeconds(Ljava/lang/String;I)I

    move-result v0

    move v8, v0

    goto :goto_4

    :cond_6
    const-string v2, "s-maxage"

    .line 196
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, -0x1

    .line 197
    invoke-static {v0, v2}, Lcom/squareup/okhttp/internal/http/HeaderParser;->parseSeconds(Ljava/lang/String;I)I

    move-result v0

    move v9, v0

    goto :goto_4

    :cond_7
    const-string v2, "public"

    .line 198
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    move/from16 v10, v16

    const/4 v2, -0x1

    goto :goto_4

    :cond_8
    const-string v2, "must-revalidate"

    .line 200
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    move/from16 v11, v16

    const/4 v2, -0x1

    goto :goto_4

    :cond_9
    const-string v2, "max-stale"

    .line 202
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    const v2, 0x7fffffff

    .line 203
    invoke-static {v0, v2}, Lcom/squareup/okhttp/internal/http/HeaderParser;->parseSeconds(Ljava/lang/String;I)I

    move-result v0

    move v12, v0

    const/4 v2, -0x1

    goto :goto_4

    :cond_a
    const-string v2, "min-fresh"

    .line 204
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v2, -0x1

    .line 205
    invoke-static {v0, v2}, Lcom/squareup/okhttp/internal/http/HeaderParser;->parseSeconds(Ljava/lang/String;I)I

    move-result v0

    move v13, v0

    goto :goto_4

    :cond_b
    const/4 v2, -0x1

    const-string v0, "only-if-cached"

    .line 206
    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    move/from16 v14, v16

    goto :goto_4

    :cond_c
    const-string v0, "no-transform"

    .line 208
    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    move/from16 v15, v16

    :cond_d
    :goto_4
    move v5, v1

    move-object/from16 v0, p0

    goto/16 :goto_1

    :cond_e
    const/4 v2, -0x1

    move v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v10

    move v10, v11

    move v11, v12

    move v12, v13

    move v13, v14

    move v14, v15

    :goto_5
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p0

    goto/16 :goto_0

    .line 214
    :cond_f
    new-instance v0, Lcom/squareup/okhttp/CacheControl;

    move-object v4, v0

    invoke-direct/range {v4 .. v14}, Lcom/squareup/okhttp/CacheControl;-><init>(ZZIIZZIIZZ)V

    return-object v0
.end method


# virtual methods
.method public isPublic()Z
    .locals 1

    .line 107
    iget-boolean v0, p0, Lcom/squareup/okhttp/CacheControl;->isPublic:Z

    return v0
.end method

.method public maxAgeSeconds()I
    .locals 1

    .line 94
    iget v0, p0, Lcom/squareup/okhttp/CacheControl;->maxAgeSeconds:I

    return v0
.end method

.method public maxStaleSeconds()I
    .locals 1

    .line 115
    iget v0, p0, Lcom/squareup/okhttp/CacheControl;->maxStaleSeconds:I

    return v0
.end method

.method public minFreshSeconds()I
    .locals 1

    .line 119
    iget v0, p0, Lcom/squareup/okhttp/CacheControl;->minFreshSeconds:I

    return v0
.end method

.method public mustRevalidate()Z
    .locals 1

    .line 111
    iget-boolean v0, p0, Lcom/squareup/okhttp/CacheControl;->mustRevalidate:Z

    return v0
.end method

.method public noCache()Z
    .locals 1

    .line 81
    iget-boolean v0, p0, Lcom/squareup/okhttp/CacheControl;->noCache:Z

    return v0
.end method

.method public noStore()Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Lcom/squareup/okhttp/CacheControl;->noStore:Z

    return v0
.end method

.method public noTransform()Z
    .locals 1

    .line 134
    iget-boolean v0, p0, Lcom/squareup/okhttp/CacheControl;->noTransform:Z

    return v0
.end method

.method public onlyIfCached()Z
    .locals 1

    .line 130
    iget-boolean v0, p0, Lcom/squareup/okhttp/CacheControl;->onlyIfCached:Z

    return v0
.end method

.method public sMaxAgeSeconds()I
    .locals 1

    .line 103
    iget v0, p0, Lcom/squareup/okhttp/CacheControl;->sMaxAgeSeconds:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 219
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    iget-boolean v1, p0, Lcom/squareup/okhttp/CacheControl;->noCache:Z

    if-eqz v1, :cond_0

    const-string v1, "no-cache, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    :cond_0
    iget-boolean v1, p0, Lcom/squareup/okhttp/CacheControl;->noStore:Z

    if-eqz v1, :cond_1

    const-string v1, "no-store, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    :cond_1
    iget v1, p0, Lcom/squareup/okhttp/CacheControl;->maxAgeSeconds:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    const-string v1, "max-age="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/squareup/okhttp/CacheControl;->maxAgeSeconds:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    :cond_2
    iget v1, p0, Lcom/squareup/okhttp/CacheControl;->sMaxAgeSeconds:I

    if-eq v1, v2, :cond_3

    const-string v1, "s-maxage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/squareup/okhttp/CacheControl;->sMaxAgeSeconds:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    :cond_3
    iget-boolean v1, p0, Lcom/squareup/okhttp/CacheControl;->isPublic:Z

    if-eqz v1, :cond_4

    const-string v1, "public, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    :cond_4
    iget-boolean v1, p0, Lcom/squareup/okhttp/CacheControl;->mustRevalidate:Z

    if-eqz v1, :cond_5

    const-string v1, "must-revalidate, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    :cond_5
    iget v1, p0, Lcom/squareup/okhttp/CacheControl;->maxStaleSeconds:I

    if-eq v1, v2, :cond_6

    const-string v1, "max-stale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/squareup/okhttp/CacheControl;->maxStaleSeconds:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    :cond_6
    iget v1, p0, Lcom/squareup/okhttp/CacheControl;->minFreshSeconds:I

    if-eq v1, v2, :cond_7

    const-string v1, "min-fresh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/squareup/okhttp/CacheControl;->minFreshSeconds:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    :cond_7
    iget-boolean v1, p0, Lcom/squareup/okhttp/CacheControl;->onlyIfCached:Z

    if-eqz v1, :cond_8

    const-string v1, "only-if-cached, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    :cond_8
    iget-boolean v1, p0, Lcom/squareup/okhttp/CacheControl;->noTransform:Z

    if-eqz v1, :cond_9

    const-string v1, "no-transform, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-nez v1, :cond_a

    const-string v0, ""

    return-object v0

    .line 231
    :cond_a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 232
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
