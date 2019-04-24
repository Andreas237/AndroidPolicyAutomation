.class public Lcom/j256/ormlite/stmt/query/ManyClause;
.super Ljava/lang/Object;
.source "ManyClause.java"

# interfaces
.implements Lcom/j256/ormlite/stmt/query/Clause;
.implements Lcom/j256/ormlite/stmt/query/NeedsFutureClause;


# instance fields
.field private final first:Lcom/j256/ormlite/stmt/query/Clause;

.field private final operation:Ljava/lang/String;

.field private final others:[Lcom/j256/ormlite/stmt/query/Clause;

.field private second:Lcom/j256/ormlite/stmt/query/Clause;

.field private final startOthersAt:I


# direct methods
.method public constructor <init>(Lcom/j256/ormlite/stmt/query/Clause;Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->first:Lcom/j256/ormlite/stmt/query/Clause;

    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->second:Lcom/j256/ormlite/stmt/query/Clause;

    .line 29
    iput-object p1, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->others:[Lcom/j256/ormlite/stmt/query/Clause;

    const/4 p1, 0x0

    .line 30
    iput p1, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->startOthersAt:I

    .line 31
    iput-object p2, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->operation:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([Lcom/j256/ormlite/stmt/query/Clause;Ljava/lang/String;)V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 43
    aget-object v0, p1, v0

    iput-object v0, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->first:Lcom/j256/ormlite/stmt/query/Clause;

    .line 44
    array-length v0, p1

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->second:Lcom/j256/ormlite/stmt/query/Clause;

    .line 46
    array-length v0, p1

    iput v0, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->startOthersAt:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 48
    aget-object v0, p1, v0

    iput-object v0, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->second:Lcom/j256/ormlite/stmt/query/Clause;

    .line 49
    iput v1, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->startOthersAt:I

    .line 51
    :goto_0
    iput-object p1, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->others:[Lcom/j256/ormlite/stmt/query/Clause;

    .line 52
    iput-object p2, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->operation:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/db/DatabaseType;",
            "Ljava/lang/String;",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lcom/j256/ormlite/stmt/ArgumentHolder;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const-string v0, "("

    .line 57
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    iget-object v0, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->first:Lcom/j256/ormlite/stmt/query/Clause;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/j256/ormlite/stmt/query/Clause;->appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 59
    iget-object v0, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->second:Lcom/j256/ormlite/stmt/query/Clause;

    const/16 v1, 0x20

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->operation:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    iget-object v0, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->second:Lcom/j256/ormlite/stmt/query/Clause;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/j256/ormlite/stmt/query/Clause;->appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->others:[Lcom/j256/ormlite/stmt/query/Clause;

    if-eqz v0, :cond_1

    .line 65
    iget v0, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->startOthersAt:I

    :goto_0
    iget-object v2, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->others:[Lcom/j256/ormlite/stmt/query/Clause;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 66
    iget-object v2, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->operation:Ljava/lang/String;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 68
    iget-object v2, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->others:[Lcom/j256/ormlite/stmt/query/Clause;

    aget-object v2, v2, v0

    invoke-interface {v2, p1, p2, p3, p4}, Lcom/j256/ormlite/stmt/query/Clause;->appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const-string p1, ") "

    .line 71
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public setMissingClause(Lcom/j256/ormlite/stmt/query/Clause;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/j256/ormlite/stmt/query/ManyClause;->second:Lcom/j256/ormlite/stmt/query/Clause;

    return-void
.end method
