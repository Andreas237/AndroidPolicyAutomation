.class public Lcom/j256/ormlite/stmt/Where;
.super Ljava/lang/Object;
.source "Where.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;

.field private clauseStackLevel:I

.field private final databaseType:Lcom/j256/ormlite/db/DatabaseType;

.field private final idColumnName:Ljava/lang/String;

.field private final idFieldType:Lcom/j256/ormlite/field/FieldType;

.field private needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;

.field private final statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/j256/ormlite/stmt/StatementBuilder<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field private final tableInfo:Lcom/j256/ormlite/table/TableInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/j256/ormlite/table/TableInfo<",
            "TT;TID;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/stmt/StatementBuilder;Lcom/j256/ormlite/db/DatabaseType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/table/TableInfo<",
            "TT;TID;>;",
            "Lcom/j256/ormlite/stmt/StatementBuilder<",
            "TT;TID;>;",
            "Lcom/j256/ormlite/db/DatabaseType;",
            ")V"
        }
    .end annotation

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 132
    new-array v0, v0, [Lcom/j256/ormlite/stmt/query/Clause;

    iput-object v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;

    const/4 v0, 0x0

    .line 134
    iput-object v0, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;

    .line 138
    iput-object p1, p0, Lcom/j256/ormlite/stmt/Where;->tableInfo:Lcom/j256/ormlite/table/TableInfo;

    .line 139
    iput-object p2, p0, Lcom/j256/ormlite/stmt/Where;->statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;

    .line 140
    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;

    move-result-object p1

    iput-object p1, p0, Lcom/j256/ormlite/stmt/Where;->idFieldType:Lcom/j256/ormlite/field/FieldType;

    .line 141
    iget-object p1, p0, Lcom/j256/ormlite/stmt/Where;->idFieldType:Lcom/j256/ormlite/field/FieldType;

    if-nez p1, :cond_0

    .line 142
    iput-object v0, p0, Lcom/j256/ormlite/stmt/Where;->idColumnName:Ljava/lang/String;

    goto :goto_0

    .line 144
    :cond_0
    invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/j256/ormlite/stmt/Where;->idColumnName:Ljava/lang/String;

    .line 146
    :goto_0
    iput-object p3, p0, Lcom/j256/ormlite/stmt/Where;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    return-void
.end method

.method private addClause(Lcom/j256/ormlite/stmt/query/Clause;)V
    .locals 1

    .line 671
    iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;

    if-nez v0, :cond_0

    .line 672
    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->push(Lcom/j256/ormlite/stmt/query/Clause;)V

    goto :goto_0

    .line 675
    :cond_0
    invoke-interface {v0, p1}, Lcom/j256/ormlite/stmt/query/NeedsFutureClause;->setMissingClause(Lcom/j256/ormlite/stmt/query/Clause;)V

    const/4 p1, 0x0

    .line 676
    iput-object p1, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;

    :goto_0
    return-void
.end method

.method private addNeedsFuture(Lcom/j256/ormlite/stmt/query/NeedsFutureClause;)V
    .locals 3

    .line 663
    iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;

    if-nez v0, :cond_0

    .line 667
    iput-object p1, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;

    return-void

    .line 664
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already waiting for a future clause, can\'t add: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private checkQueryBuilderMethod(Ljava/lang/String;)Lcom/j256/ormlite/stmt/QueryBuilder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/j256/ormlite/stmt/QueryBuilder<",
            "TT;TID;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 604
    iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;

    instance-of v1, v0, Lcom/j256/ormlite/stmt/QueryBuilder;

    if-eqz v1, :cond_0

    .line 605
    check-cast v0, Lcom/j256/ormlite/stmt/QueryBuilder;

    return-object v0

    .line 607
    :cond_0
    new-instance v0, Ljava/sql/SQLException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot call "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " on a statement of type "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/j256/ormlite/stmt/Where;->statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;

    invoke-virtual {p1}, Lcom/j256/ormlite/stmt/StatementBuilder;->getType()Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;
    .locals 1

    .line 681
    iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->tableInfo:Lcom/j256/ormlite/table/TableInfo;

    invoke-virtual {v0, p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypeByColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;

    move-result-object p1

    return-object p1
.end method

.method private peek()Lcom/j256/ormlite/stmt/query/Clause;
    .locals 2

    .line 712
    iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;

    iget v1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method private pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;
    .locals 3

    .line 701
    iget v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I

    if-eqz v0, :cond_0

    .line 705
    iget-object p1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I

    aget-object v0, p1, v0

    .line 707
    iget v1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I

    const/4 v2, 0x0

    aput-object v2, p1, v1

    return-object v0

    .line 702
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expecting there to be a clause already defined for \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' operation"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private push(Lcom/j256/ormlite/stmt/query/Clause;)V
    .locals 4

    .line 686
    iget v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I

    iget-object v1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;

    array-length v1, v1

    if-ne v0, v1, :cond_1

    mul-int/lit8 v0, v0, 0x2

    .line 688
    new-array v0, v0, [Lcom/j256/ormlite/stmt/query/Clause;

    const/4 v1, 0x0

    .line 690
    :goto_0
    iget v2, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I

    if-ge v1, v2, :cond_0

    .line 691
    iget-object v2, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;

    aget-object v3, v2, v1

    aput-object v3, v0, v1

    const/4 v3, 0x0

    .line 693
    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 695
    :cond_0
    iput-object v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;

    .line 697
    :cond_1
    iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStack:[Lcom/j256/ormlite/stmt/query/Clause;

    iget v1, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I

    aput-object p1, v0, v1

    return-void
.end method


# virtual methods
.method public and()Lcom/j256/ormlite/stmt/Where;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/j256/ormlite/stmt/Where<",
            "TT;TID;>;"
        }
    .end annotation

    .line 153
    new-instance v0, Lcom/j256/ormlite/stmt/query/ManyClause;

    const-string v1, "AND"

    invoke-direct {p0, v1}, Lcom/j256/ormlite/stmt/Where;->pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;

    move-result-object v1

    const-string v2, "AND"

    invoke-direct {v0, v1, v2}, Lcom/j256/ormlite/stmt/query/ManyClause;-><init>(Lcom/j256/ormlite/stmt/query/Clause;Ljava/lang/String;)V

    .line 154
    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->push(Lcom/j256/ormlite/stmt/query/Clause;)V

    .line 155
    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addNeedsFuture(Lcom/j256/ormlite/stmt/query/NeedsFutureClause;)V

    return-object p0
.end method

.method public and(I)Lcom/j256/ormlite/stmt/Where;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/j256/ormlite/stmt/Where<",
            "TT;TID;>;"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 195
    new-array v0, p1, [Lcom/j256/ormlite/stmt/query/Clause;

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_0

    const-string v1, "AND"

    .line 197
    invoke-direct {p0, v1}, Lcom/j256/ormlite/stmt/Where;->pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;

    move-result-object v1

    aput-object v1, v0, p1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    .line 199
    :cond_0
    new-instance p1, Lcom/j256/ormlite/stmt/query/ManyClause;

    const-string v1, "AND"

    invoke-direct {p1, v0, v1}, Lcom/j256/ormlite/stmt/query/ManyClause;-><init>([Lcom/j256/ormlite/stmt/query/Clause;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V

    return-object p0

    .line 193
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Must have at least one clause in and(numClauses)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method appendSql(Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    .line 577
    iget v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 584
    iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->needsFuture:Lcom/j256/ormlite/stmt/query/NeedsFutureClause;

    if-nez v0, :cond_0

    .line 590
    invoke-direct {p0}, Lcom/j256/ormlite/stmt/Where;->peek()Lcom/j256/ormlite/stmt/query/Clause;

    move-result-object v0

    iget-object v1, p0, Lcom/j256/ormlite/stmt/Where;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/j256/ormlite/stmt/query/Clause;->appendSql(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    return-void

    .line 585
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The SQL statement has not been finished since there are previous operations still waiting for clauses."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 581
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Both the \"left-hand\" and \"right-hand\" clauses have been defined.  Did you miss an AND or OR?"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 578
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No where clauses defined.  Did you miss a where operation?"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/j256/ormlite/stmt/Where<",
            "TT;TID;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 215
    new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;

    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;

    move-result-object v1

    const-string v2, "="

    invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V

    return-object p0
.end method

.method public ge(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/j256/ormlite/stmt/Where<",
            "TT;TID;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 224
    new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;

    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;

    move-result-object v1

    const-string v2, ">="

    invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V

    return-object p0
.end method

.method public in(Ljava/lang/String;Ljava/lang/Iterable;)Lcom/j256/ormlite/stmt/Where;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Iterable<",
            "*>;)",
            "Lcom/j256/ormlite/stmt/Where<",
            "TT;TID;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 242
    new-instance v0, Lcom/j256/ormlite/stmt/query/In;

    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/In;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Iterable;Z)V

    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V

    return-object p0
.end method

.method public isNotNull(Ljava/lang/String;)Lcom/j256/ormlite/stmt/Where;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/j256/ormlite/stmt/Where<",
            "TT;TID;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 315
    new-instance v0, Lcom/j256/ormlite/stmt/query/IsNotNull;

    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/j256/ormlite/stmt/query/IsNotNull;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;)V

    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V

    return-object p0
.end method

.method public isNull(Ljava/lang/String;)Lcom/j256/ormlite/stmt/Where;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/j256/ormlite/stmt/Where<",
            "TT;TID;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 307
    new-instance v0, Lcom/j256/ormlite/stmt/query/IsNull;

    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/j256/ormlite/stmt/query/IsNull;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;)V

    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V

    return-object p0
.end method

.method public le(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/j256/ormlite/stmt/Where<",
            "TT;TID;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 323
    new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;

    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;

    move-result-object v1

    const-string v2, "<="

    invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V

    return-object p0
.end method

.method public lt(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/j256/ormlite/stmt/Where<",
            "TT;TID;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 332
    new-instance v0, Lcom/j256/ormlite/stmt/query/SimpleComparison;

    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;

    move-result-object v1

    const-string v2, "<"

    invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/SimpleComparison;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V

    return-object p0
.end method

.method public notIn(Ljava/lang/String;Ljava/lang/Iterable;)Lcom/j256/ormlite/stmt/Where;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Iterable<",
            "*>;)",
            "Lcom/j256/ormlite/stmt/Where<",
            "TT;TID;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 250
    new-instance v0, Lcom/j256/ormlite/stmt/query/In;

    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/Where;->findColumnFieldType(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, p2, v2}, Lcom/j256/ormlite/stmt/query/In;-><init>(Ljava/lang/String;Lcom/j256/ormlite/field/FieldType;Ljava/lang/Iterable;Z)V

    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addClause(Lcom/j256/ormlite/stmt/query/Clause;)V

    return-object p0
.end method

.method public or()Lcom/j256/ormlite/stmt/Where;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/j256/ormlite/stmt/Where<",
            "TT;TID;>;"
        }
    .end annotation

    .line 381
    new-instance v0, Lcom/j256/ormlite/stmt/query/ManyClause;

    const-string v1, "OR"

    invoke-direct {p0, v1}, Lcom/j256/ormlite/stmt/Where;->pop(Ljava/lang/String;)Lcom/j256/ormlite/stmt/query/Clause;

    move-result-object v1

    const-string v2, "OR"

    invoke-direct {v0, v1, v2}, Lcom/j256/ormlite/stmt/query/ManyClause;-><init>(Lcom/j256/ormlite/stmt/query/Clause;Ljava/lang/String;)V

    .line 382
    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->push(Lcom/j256/ormlite/stmt/query/Clause;)V

    .line 383
    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->addNeedsFuture(Lcom/j256/ormlite/stmt/query/NeedsFutureClause;)V

    return-object p0
.end method

.method public prepare()Lcom/j256/ormlite/stmt/PreparedQuery;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/j256/ormlite/stmt/PreparedQuery<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 496
    iget-object v0, p0, Lcom/j256/ormlite/stmt/Where;->statementBuilder:Lcom/j256/ormlite/stmt/StatementBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/stmt/StatementBuilder;->prepareStatement(Ljava/lang/Long;)Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;

    move-result-object v0

    return-object v0
.end method

.method public query()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const-string v0, "query()"

    .line 503
    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->checkQueryBuilderMethod(Ljava/lang/String;)Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->query()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public queryForFirst()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const-string v0, "queryForFirst()"

    .line 517
    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/Where;->checkQueryBuilderMethod(Ljava/lang/String;)Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->queryForFirst()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 595
    iget v0, p0, Lcom/j256/ormlite/stmt/Where;->clauseStackLevel:I

    if-nez v0, :cond_0

    const-string v0, "empty where clause"

    return-object v0

    .line 598
    :cond_0
    invoke-direct {p0}, Lcom/j256/ormlite/stmt/Where;->peek()Lcom/j256/ormlite/stmt/query/Clause;

    move-result-object v0

    .line 599
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "where clause: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
