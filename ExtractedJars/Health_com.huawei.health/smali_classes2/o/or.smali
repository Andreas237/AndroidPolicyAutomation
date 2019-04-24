.class public final Lo/or;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lo/od;

.field private final b:[B

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/oq;Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/lang/String;

.field private e:[Lo/ou;

.field private final i:J


# direct methods
.method public constructor <init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V
    .locals 7

    .line 40
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;J)V

    .line 41
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[B[Lo/ou;Lo/od;J)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lo/or;->d:Ljava/lang/String;

    .line 49
    iput-object p2, p0, Lo/or;->b:[B

    .line 50
    iput-object p3, p0, Lo/or;->e:[Lo/ou;

    .line 51
    iput-object p4, p0, Lo/or;->a:Lo/od;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/or;->c:Ljava/util/Map;

    .line 53
    iput-wide p5, p0, Lo/or;->i:J

    .line 54
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Lo/oq;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 92
    iget-object v0, p0, Lo/or;->c:Ljava/util/Map;

    return-object v0
.end method

.method public a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Lo/oq;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 103
    if-eqz p1, :cond_1

    .line 104
    iget-object v0, p0, Lo/or;->c:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 105
    iput-object p1, p0, Lo/or;->c:Ljava/util/Map;

    goto :goto_0

    .line 107
    :cond_0
    iget-object v0, p0, Lo/or;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 110
    :cond_1
    :goto_0
    return-void
.end method

.method public b()[B
    .locals 1

    .line 67
    iget-object v0, p0, Lo/or;->b:[B

    return-object v0
.end method

.method public c([Lo/ou;)V
    .locals 5

    .line 113
    iget-object v3, p0, Lo/or;->e:[Lo/ou;

    .line 114
    if-nez v3, :cond_0

    .line 115
    iput-object p1, p0, Lo/or;->e:[Lo/ou;

    goto :goto_0

    .line 116
    :cond_0
    if-eqz p1, :cond_1

    array-length v0, p1

    if-lez v0, :cond_1

    .line 117
    array-length v0, v3

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v4, v0, [Lo/ou;

    .line 118
    array-length v0, v3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v3, v1, v4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 119
    array-length v0, v3

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v4, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 120
    iput-object v4, p0, Lo/or;->e:[Lo/ou;

    .line 122
    :cond_1
    :goto_0
    return-void
.end method

.method public c()[Lo/ou;
    .locals 1

    .line 76
    iget-object v0, p0, Lo/or;->e:[Lo/ou;

    return-object v0
.end method

.method public d()Lo/od;
    .locals 1

    .line 83
    iget-object v0, p0, Lo/or;->a:Lo/od;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/or;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e(Lo/oq;Ljava/lang/Object;)V
    .locals 2

    .line 96
    iget-object v0, p0, Lo/or;->c:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 97
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lo/oq;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Lo/or;->c:Ljava/util/Map;

    .line 99
    :cond_0
    iget-object v0, p0, Lo/or;->c:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lo/or;->d:Ljava/lang/String;

    return-object v0
.end method
