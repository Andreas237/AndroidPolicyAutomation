.class public Lo/czy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/czy$a;,
        Lo/czy$b;,
        Lo/czy$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;Lo/czy$a;)V
    .locals 4

    .line 98
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 99
    const-string v0, "TrackSimilarityIdentifier"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " TrackRecord :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 100
    invoke-virtual {p1}, Lo/czy$a;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/czy;->b(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " - "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 102
    invoke-virtual {p1}, Lo/czy$a;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/czy;->b(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " duration:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 103
    invoke-virtual {p1}, Lo/czy$a;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " distance:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 104
    invoke-virtual {p1}, Lo/czy$a;->e()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " isWatchData:"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    .line 105
    invoke-virtual {p1}, Lo/czy$a;->a()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 99
    invoke-static {v0, v1}, Lo/czy;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 107
    :cond_0
    const-string v0, "TrackSimilarityIdentifier"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " TrackRecord :TrackRecord = null "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/czy;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    :goto_0
    return-void
.end method

.method private static b(J)Ljava/lang/String;
    .locals 3

    .line 123
    const-string v2, "yyyy-MM-dd HH:mm:ss"

    .line 124
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Ljava/lang/String;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lo/czy$a;>;)V"
        }
    .end annotation

    .line 77
    const-string v0, "TrackSimilarityIdentifier"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " duplicatesEliminate records, records size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 78
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " records print start"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 77
    invoke-static {v0, v1}, Lo/czy;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 82
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/czy$a;

    .line 83
    const-string v0, "TrackSimilarityIdentifier"

    const/16 v1, 0xc

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " duplicatesEliminate["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "]:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 84
    invoke-virtual {v5}, Lo/czy$a;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/czy;->b(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " - "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 86
    invoke-virtual {v5}, Lo/czy$a;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/czy;->b(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " duration:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 87
    invoke-virtual {v5}, Lo/czy$a;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " distance:"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    .line 88
    invoke-virtual {v5}, Lo/czy$a;->e()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, " isWatchData:"

    const/16 v3, 0xa

    aput-object v2, v1, v3

    .line 89
    invoke-virtual {v5}, Lo/czy$a;->a()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    .line 83
    invoke-static {v0, v1}, Lo/czy;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 92
    :cond_0
    const-string v0, "TrackSimilarityIdentifier"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " duplicatesEliminate records, records size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 93
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " records print end"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 92
    invoke-static {v0, v1}, Lo/czy;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-void
.end method

.method static synthetic e(Ljava/lang/String;Lo/czy$a;)V
    .locals 0

    .line 21
    invoke-static {p0, p1}, Lo/czy;->a(Ljava/lang/String;Lo/czy$a;)V

    return-void
.end method

.method public static varargs e(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 8

    .line 496
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 497
    move-object v4, p1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v4, v6

    .line 498
    invoke-virtual {v3, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 497
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 500
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 501
    return-void
.end method


# virtual methods
.method public b(Ljava/util/List;Lo/czy$d;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/czy$a;>;Lo/czy$d;)Ljava/util/List<Lo/czy$a;>;"
        }
    .end annotation

    .line 174
    sget-object v0, Lo/czy$d;->d:Lo/czy$d;

    if-ne p2, v0, :cond_0

    .line 175
    invoke-virtual {p0, p1}, Lo/czy;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 178
    :cond_0
    sget-object v0, Lo/czy$d;->e:Lo/czy$d;

    if-ne p2, v0, :cond_1

    .line 179
    invoke-virtual {p0, p1}, Lo/czy;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 180
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 181
    invoke-interface {v2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 182
    invoke-interface {v2, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 183
    return-object v2

    .line 185
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(Ljava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/czy$a;>;)Ljava/util/List<Lo/czy$a;>;"
        }
    .end annotation

    .line 132
    const-string v0, "Arg:"

    invoke-static {v0, p1}, Lo/czy;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 134
    new-instance v2, Lo/czy$b;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/czy$b;-><init>(Lo/czy$4;)V

    .line 135
    invoke-virtual {v2, p1}, Lo/czy$b;->a(Ljava/util/List;)V

    .line 136
    invoke-virtual {v2}, Lo/czy$b;->d()Lo/czy$b$b;

    move-result-object v3

    .line 137
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 139
    const/4 v5, 0x0

    .line 141
    :goto_0
    invoke-virtual {v3}, Lo/czy$b$b;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 142
    invoke-virtual {v3}, Lo/czy$b$b;->a()Lo/czy$a;

    move-result-object v6

    .line 143
    const/4 v7, 0x0

    .line 144
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/czy$a;

    .line 145
    invoke-static {v2, v6, v9}, Lo/czy$b;->c(Lo/czy$b;Lo/czy$a;Lo/czy$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    const/4 v7, 0x1

    .line 147
    goto :goto_2

    .line 149
    :cond_0
    goto :goto_1

    .line 150
    :cond_1
    :goto_2
    if-nez v7, :cond_2

    .line 151
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ranking(conflictWithResult:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "):"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lo/czy;->a(Ljava/lang/String;Lo/czy$a;)V

    .line 155
    add-int/lit8 v5, v5, 0x1

    .line 156
    goto :goto_0

    .line 158
    :cond_3
    new-instance v0, Lo/czy$1;

    invoke-direct {v0, p0}, Lo/czy$1;-><init>(Lo/czy;)V

    invoke-static {v4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 167
    const-string v0, "result:"

    invoke-static {v0, v4}, Lo/czy;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 169
    return-object v4
.end method
