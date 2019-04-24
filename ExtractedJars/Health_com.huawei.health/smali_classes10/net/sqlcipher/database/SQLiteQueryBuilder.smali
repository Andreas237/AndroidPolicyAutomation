.class public Lnet/sqlcipher/database/SQLiteQueryBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "SQLiteQueryBuilder"

.field private static final sLimitPattern:Ljava/util/regex/Pattern;


# instance fields
.field private mDistinct:Z

.field private mFactory:Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;

.field private mProjectionMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private mStrictProjectionMap:Z

.field private mTables:Ljava/lang/String;

.field private mWhereClause:Ljava/lang/StringBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    const-string v0, "\\s*\\d+\\s*(,\\s*\\d+\\s*)?"

    .line 39
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->sLimitPattern:Ljava/util/regex/Pattern;

    .line 38
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mProjectionMap:Ljava/util/Map;

    .line 42
    const-string v0, ""

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mTables:Ljava/lang/String;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mDistinct:Z

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mFactory:Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;

    .line 51
    return-void
.end method

.method private static appendClause(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 214
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 215
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    :cond_0
    return-void
.end method

.method private static appendClauseEscapeClause(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 221
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 222
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    invoke-static {p0, p2}, Lnet/sqlcipher/DatabaseUtils;->appendEscapedSQLString(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 225
    :cond_0
    return-void
.end method

.method public static appendColumns(Ljava/lang/StringBuilder;[Ljava/lang/String;)V
    .locals 4

    .line 232
    array-length v1, p1

    .line 234
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 235
    aget-object v3, p1, v2

    .line 237
    if-eqz v3, :cond_1

    .line 238
    if-lez v2, :cond_0

    .line 239
    const-string v0, ", "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    :cond_0
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 244
    :cond_2
    const/16 v0, 0x20

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 245
    return-void
.end method

.method public static buildQueryString(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 183
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 184
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "HAVING clauses are only permitted when using a groupBy clause"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 187
    :cond_0
    invoke-static {p7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->sLimitPattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_1

    .line 188
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid LIMIT clauses:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 191
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v0, 0x78

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 193
    const-string v0, "SELECT "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    if-eqz p0, :cond_2

    .line 195
    const-string v0, "DISTINCT "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    :cond_2
    if-eqz p2, :cond_3

    array-length v0, p2

    if-eqz v0, :cond_3

    .line 198
    invoke-static {v3, p2}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->appendColumns(Ljava/lang/StringBuilder;[Ljava/lang/String;)V

    goto :goto_0

    .line 200
    :cond_3
    const-string v0, "* "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    :goto_0
    const-string v0, "FROM "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    const-string v0, " WHERE "

    invoke-static {v3, v0, p3}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->appendClause(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    const-string v0, " GROUP BY "

    invoke-static {v3, v0, p4}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->appendClause(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    const-string v0, " HAVING "

    invoke-static {v3, v0, p5}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->appendClause(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    const-string v0, " ORDER BY "

    invoke-static {v3, v0, p6}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->appendClause(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    const-string v0, " LIMIT "

    invoke-static {v3, v0, p7}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->appendClause(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private computeProjection([Ljava/lang/String;)[Ljava/lang/String;
    .locals 8

    .line 502
    if-eqz p1, :cond_5

    array-length v0, p1

    if-lez v0, :cond_5

    .line 503
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mProjectionMap:Ljava/util/Map;

    if-eqz v0, :cond_4

    .line 504
    array-length v0, p1

    new-array v3, v0, [Ljava/lang/String;

    .line 505
    array-length v4, p1

    .line 507
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    .line 508
    aget-object v6, p1, v5

    .line 509
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mProjectionMap:Ljava/util/Map;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 511
    if-eqz v7, :cond_0

    .line 512
    aput-object v7, v3, v5

    .line 513
    goto :goto_1

    .line 516
    :cond_0
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mStrictProjectionMap:Z

    if-nez v0, :cond_2

    const-string v0, " AS "

    .line 517
    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, " as "

    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 519
    :cond_1
    aput-object v6, v3, v5

    .line 520
    goto :goto_1

    .line 523
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p1, v5

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 507
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 526
    :cond_3
    return-object v3

    .line 528
    :cond_4
    return-object p1

    .line 530
    :cond_5
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mProjectionMap:Ljava/util/Map;

    if-eqz v0, :cond_8

    .line 532
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mProjectionMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    .line 533
    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v0

    new-array v4, v0, [Ljava/lang/String;

    .line 534
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 535
    const/4 v6, 0x0

    .line 537
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 538
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 541
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "_count"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 542
    goto :goto_2

    .line 544
    :cond_6
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    aput-object v1, v4, v0

    .line 545
    goto :goto_2

    .line 546
    :cond_7
    return-object v4

    .line 548
    :cond_8
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public appendWhere(Ljava/lang/CharSequence;)V
    .locals 3

    .line 93
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    if-nez v0, :cond_0

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x10

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    .line 96
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 97
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    :cond_1
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 100
    return-void
.end method

.method public appendWhereEscapeString(Ljava/lang/String;)V
    .locals 3

    .line 113
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    if-nez v0, :cond_0

    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x10

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    .line 116
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 117
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    :cond_1
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    invoke-static {v0, p1}, Lnet/sqlcipher/DatabaseUtils;->appendEscapedSQLString(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 120
    return-void
.end method

.method public buildQuery([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 370
    invoke-direct {p0, p1}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->computeProjection([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 372
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 373
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    .line 375
    :goto_0
    if-eqz v10, :cond_1

    .line 376
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mWhereClause:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    const/16 v0, 0x29

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 381
    :cond_1
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 382
    if-eqz v10, :cond_2

    .line 383
    const-string v0, " AND "

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    :cond_2
    const/16 v0, 0x28

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 387
    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    const/16 v0, 0x29

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 391
    :cond_3
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mDistinct:Z

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mTables:Ljava/lang/String;

    move-object v2, v8

    .line 392
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    .line 391
    invoke-static/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->buildQueryString(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public buildUnionQuery([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 486
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x80

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 487
    array-length v2, p1

    .line 488
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mDistinct:Z

    if-eqz v0, :cond_0

    const-string v3, " UNION "

    goto :goto_0

    :cond_0
    const-string v3, " UNION ALL "

    .line 490
    :goto_0
    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_2

    .line 491
    if-lez v4, :cond_1

    .line 492
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    :cond_1
    aget-object v0, p1, v4

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 496
    :cond_2
    const-string v0, " ORDER BY "

    invoke-static {v1, v0, p2}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->appendClause(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    const-string v0, " LIMIT "

    invoke-static {v1, v0, p3}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->appendClause(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 498
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public buildUnionSubQuery(Ljava/lang/String;[Ljava/lang/String;Ljava/util/Set;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;[Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"
        }
    .end annotation

    .line 449
    array-length v8, p2

    .line 450
    new-array v9, v8, [Ljava/lang/String;

    .line 452
    const/4 v10, 0x0

    :goto_0
    if-ge v10, v8, :cond_3

    .line 453
    aget-object v11, p2, v10

    .line 455
    invoke-virtual {v11, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 456
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p5

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' AS "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    goto :goto_1

    .line 458
    :cond_0
    move/from16 v0, p4

    if-le v10, v0, :cond_1

    .line 459
    invoke-interface {p3, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 460
    :cond_1
    aput-object v11, v9, v10

    goto :goto_1

    .line 462
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NULL AS "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    .line 452
    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 465
    :cond_3
    move-object v0, p0

    move-object v1, v9

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->buildQuery([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTables()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mTables:Ljava/lang/String;

    return-object v0
.end method

.method public query(Lnet/sqlcipher/database/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    .locals 9

    .line 280
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->query(Lnet/sqlcipher/database/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public query(Lnet/sqlcipher/database/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    .locals 9

    .line 319
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mTables:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 320
    const/4 v0, 0x0

    return-object v0

    .line 323
    :cond_0
    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteQueryBuilder;->buildQuery([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 327
    const-string v0, "SQLiteQueryBuilder"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 328
    const-string v0, "SQLiteQueryBuilder"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Performing query: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 330
    :cond_1
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mFactory:Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mTables:Ljava/lang/String;

    .line 332
    invoke-static {v1}, Lnet/sqlcipher/database/SQLiteDatabase;->findEditTable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 330
    invoke-virtual {p1, v0, v8, p4, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQueryWithFactory(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public setCursorFactory(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mFactory:Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;

    .line 145
    return-void
.end method

.method public setDistinct(Z)V
    .locals 0

    .line 59
    iput-boolean p1, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mDistinct:Z

    .line 60
    return-void
.end method

.method public setProjectionMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 134
    iput-object p1, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mProjectionMap:Ljava/util/Map;

    .line 135
    return-void
.end method

.method public setStrictProjectionMap(Z)V
    .locals 0

    .line 151
    iput-boolean p1, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mStrictProjectionMap:Z

    .line 152
    return-void
.end method

.method public setTables(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lnet/sqlcipher/database/SQLiteQueryBuilder;->mTables:Ljava/lang/String;

    .line 81
    return-void
.end method
