.class public Lcom/j256/ormlite/stmt/QueryBuilder;
.super Lcom/j256/ormlite/stmt/StatementBuilder;
.source "QueryBuilder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/j256/ormlite/stmt/StatementBuilder<",
        "TT;TID;>;"
    }
.end annotation


# instance fields
.field private distinct:Z

.field private groupByList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private groupByRaw:Ljava/lang/String;

.field private having:Ljava/lang/String;

.field private final idField:Lcom/j256/ormlite/field/FieldType;

.field private isCountOfQuery:Z

.field private isInnerQuery:Z

.field private joinList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/j256/ormlite/stmt/QueryBuilder<",
            "TT;TID;>.JoinInfo;>;"
        }
    .end annotation
.end field

.field private limit:Ljava/lang/Long;

.field private offset:Ljava/lang/Long;

.field private orderByArgs:[Lcom/j256/ormlite/stmt/ArgumentHolder;

.field private orderByList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/j256/ormlite/stmt/query/OrderBy;",
            ">;"
        }
    .end annotation
.end field

.field private orderByRaw:Ljava/lang/String;

.field private resultFieldTypes:[Lcom/j256/ormlite/field/FieldType;

.field private selectColumnList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private selectIdColumn:Z

.field private selectRawList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/db/DatabaseType;",
            "Lcom/j256/ormlite/table/TableInfo<",
            "TT;TID;>;",
            "Lcom/j256/ormlite/dao/Dao<",
            "TT;TID;>;)V"
        }
    .end annotation

    .line 56
    sget-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/j256/ormlite/stmt/StatementBuilder;-><init>(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/dao/Dao;Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;)V

    const/4 p1, 0x1

    .line 38
    iput-boolean p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectIdColumn:Z

    .line 57
    invoke-virtual {p2}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;

    move-result-object p1

    iput-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->idField:Lcom/j256/ormlite/field/FieldType;

    return-void
.end method

.method private appendColumnName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 2

    .line 780
    iget-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->addTableName:Z

    if-eqz v0, :cond_0

    .line 781
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableName:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 v0, 0x2e

    .line 782
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 784
    :cond_0
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    invoke-interface {v0, p1, p2}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-void
.end method

.method private appendColumns(Ljava/lang/StringBuilder;)V
    .locals 8

    .line 598
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;

    if-nez v0, :cond_1

    .line 599
    iget-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->addTableName:Z

    if-eqz v0, :cond_0

    .line 600
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableName:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 v0, 0x2e

    .line 601
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    const-string v0, "* "

    .line 603
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 604
    iget-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;

    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;

    move-result-object p1

    iput-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->resultFieldTypes:[Lcom/j256/ormlite/field/FieldType;

    return-void

    .line 610
    :cond_1
    iget-boolean v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->isInnerQuery:Z

    .line 615
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x1

    add-int/2addr v0, v3

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 616
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x1

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/16 v6, 0x2c

    if-eqz v5, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 617
    iget-object v7, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableInfo:Lcom/j256/ormlite/table/TableInfo;

    invoke-virtual {v7, v5}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypeByColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;

    move-result-object v5

    .line 622
    invoke-virtual {v5}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 623
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    if-eqz v4, :cond_4

    const/4 v4, 0x0

    goto :goto_1

    .line 629
    :cond_4
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 631
    :goto_1
    invoke-direct {p0, p1, v5, v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendFieldColumnName(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;)V

    .line 632
    iget-object v6, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->idField:Lcom/j256/ormlite/field/FieldType;

    if-ne v5, v6, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_5
    if-nez v1, :cond_7

    .line 638
    iget-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectIdColumn:Z

    if-eqz v0, :cond_7

    if-nez v4, :cond_6

    .line 640
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 642
    :cond_6
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-direct {p0, p1, v0, v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendFieldColumnName(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;)V

    :cond_7
    const/16 v0, 0x20

    .line 644
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 646
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lcom/j256/ormlite/field/FieldType;

    invoke-interface {v2, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/j256/ormlite/field/FieldType;

    iput-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->resultFieldTypes:[Lcom/j256/ormlite/field/FieldType;

    return-void
.end method

.method private appendFieldColumnName(Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Lcom/j256/ormlite/field/FieldType;",
            "Ljava/util/List<",
            "Lcom/j256/ormlite/field/FieldType;",
            ">;)V"
        }
    .end annotation

    .line 650
    invoke-virtual {p2}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendColumnName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    .line 652
    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private appendGroupBys(Ljava/lang/StringBuilder;)V
    .locals 4

    .line 677
    invoke-direct {p0}, Lcom/j256/ormlite/stmt/QueryBuilder;->hasGroupStuff()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 678
    invoke-direct {p0, p1, v1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendGroupBys(Ljava/lang/StringBuilder;Z)V

    const/4 v1, 0x0

    .line 685
    :cond_0
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinList:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 686
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;

    .line 687
    iget-object v3, v2, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;

    if-eqz v3, :cond_1

    iget-object v3, v2, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;

    invoke-direct {v3}, Lcom/j256/ormlite/stmt/QueryBuilder;->hasGroupStuff()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 688
    iget-object v2, v2, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;

    invoke-direct {v2, p1, v1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendGroupBys(Ljava/lang/StringBuilder;Z)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private appendGroupBys(Ljava/lang/StringBuilder;Z)V
    .locals 3

    if-eqz p2, :cond_0

    const-string v0, "GROUP BY "

    .line 700
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 702
    :cond_0
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByRaw:Ljava/lang/String;

    const/16 v1, 0x2c

    if-eqz v0, :cond_2

    if-nez p2, :cond_1

    .line 704
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 706
    :cond_1
    iget-object p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByRaw:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 708
    :cond_2
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz p2, :cond_3

    const/4 p2, 0x0

    goto :goto_1

    .line 712
    :cond_3
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 714
    :goto_1
    invoke-direct {p0, p1, v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendColumnName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    :goto_2
    const/16 p2, 0x20

    .line 717
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method private appendHaving(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 788
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->having:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "HAVING "

    .line 789
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->having:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method private appendJoinSql(Ljava/lang/StringBuilder;)V
    .locals 5

    .line 564
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;

    .line 565
    iget-object v2, v1, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->type:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " JOIN "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    iget-object v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    iget-object v3, v1, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;

    iget-object v3, v3, Lcom/j256/ormlite/stmt/QueryBuilder;->tableName:Ljava/lang/String;

    invoke-interface {v2, p1, v3}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const-string v2, " ON "

    .line 567
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 568
    iget-object v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    iget-object v3, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableName:Ljava/lang/String;

    invoke-interface {v2, p1, v3}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 v2, 0x2e

    .line 569
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 570
    iget-object v3, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    iget-object v4, v1, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->localField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v4}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, p1, v4}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const-string v3, " = "

    .line 571
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    iget-object v3, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    iget-object v4, v1, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;

    iget-object v4, v4, Lcom/j256/ormlite/stmt/QueryBuilder;->tableName:Ljava/lang/String;

    invoke-interface {v3, p1, v4}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 573
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 574
    iget-object v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    iget-object v3, v1, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->remoteField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v3}, Lcom/j256/ormlite/field/FieldType;->getColumnName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, p1, v3}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 v2, 0x20

    .line 575
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 577
    iget-object v2, v1, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;

    iget-object v2, v2, Lcom/j256/ormlite/stmt/QueryBuilder;->joinList:Ljava/util/List;

    if-eqz v2, :cond_0

    .line 578
    iget-object v1, v1, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;

    invoke-direct {v1, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendJoinSql(Ljava/lang/StringBuilder;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private appendLimit(Ljava/lang/StringBuilder;)V
    .locals 4

    .line 657
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->limit:Ljava/lang/Long;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    invoke-interface {v0}, Lcom/j256/ormlite/db/DatabaseType;->isLimitSqlSupported()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 658
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->limit:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v3, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->offset:Ljava/lang/Long;

    invoke-interface {v0, p1, v1, v2, v3}, Lcom/j256/ormlite/db/DatabaseType;->appendLimitValue(Ljava/lang/StringBuilder;JLjava/lang/Long;)V

    :cond_0
    return-void
.end method

.method private appendOffset(Ljava/lang/StringBuilder;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 663
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->offset:Ljava/lang/Long;

    if-nez v0, :cond_0

    return-void

    .line 666
    :cond_0
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    invoke-interface {v0}, Lcom/j256/ormlite/db/DatabaseType;->isOffsetLimitArgument()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 667
    iget-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->limit:Ljava/lang/Long;

    if-eqz p1, :cond_1

    goto :goto_0

    .line 668
    :cond_1
    new-instance p1, Ljava/sql/SQLException;

    const-string v0, "If the offset is specified, limit must also be specified with this database"

    invoke-direct {p1, v0}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 671
    :cond_2
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->offset:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, Lcom/j256/ormlite/db/DatabaseType;->appendOffsetValue(Ljava/lang/StringBuilder;J)V

    :goto_0
    return-void
.end method

.method private appendOrderBys(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lcom/j256/ormlite/stmt/ArgumentHolder;",
            ">;)V"
        }
    .end annotation

    .line 722
    invoke-direct {p0}, Lcom/j256/ormlite/stmt/QueryBuilder;->hasOrderStuff()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 723
    invoke-direct {p0, p1, v1, p2}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendOrderBys(Ljava/lang/StringBuilder;ZLjava/util/List;)V

    const/4 v1, 0x0

    .line 730
    :cond_0
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinList:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 731
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;

    .line 732
    iget-object v3, v2, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;

    if-eqz v3, :cond_1

    iget-object v3, v2, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;

    invoke-direct {v3}, Lcom/j256/ormlite/stmt/QueryBuilder;->hasOrderStuff()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 733
    iget-object v2, v2, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;

    invoke-direct {v2, p1, v1, p2}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendOrderBys(Ljava/lang/StringBuilder;ZLjava/util/List;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private appendOrderBys(Ljava/lang/StringBuilder;ZLjava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Z",
            "Ljava/util/List<",
            "Lcom/j256/ormlite/stmt/ArgumentHolder;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    const-string v0, "ORDER BY "

    .line 745
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 747
    :cond_0
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByRaw:Ljava/lang/String;

    const/16 v1, 0x2c

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    if-nez p2, :cond_1

    .line 749
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 751
    :cond_1
    iget-object p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByRaw:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 752
    iget-object p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByArgs:[Lcom/j256/ormlite/stmt/ArgumentHolder;

    if-eqz p2, :cond_2

    .line 753
    array-length v0, p2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, p2, v3

    .line 754
    invoke-interface {p3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    .line 760
    :cond_3
    iget-object p3, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByList:Ljava/util/List;

    if-eqz p3, :cond_6

    .line 761
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/j256/ormlite/stmt/query/OrderBy;

    if-eqz p2, :cond_4

    const/4 p2, 0x0

    goto :goto_2

    .line 765
    :cond_4
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 767
    :goto_2
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/query/OrderBy;->getColumnName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendColumnName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 768
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/query/OrderBy;->isAscending()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    const-string v0, " DESC"

    .line 772
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_6
    const/16 p2, 0x20

    .line 776
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method private appendSelectRaw(Ljava/lang/StringBuilder;)V
    .locals 4

    .line 585
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRawList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    const-string v3, ", "

    .line 589
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    :goto_1
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const/16 v0, 0x20

    .line 593
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method private hasGroupStuff()Z
    .locals 1

    .line 695
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByList:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByRaw:Ljava/lang/String;

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private hasOrderStuff()Z
    .locals 1

    .line 740
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByList:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByRaw:Ljava/lang/String;

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private setAddTableName(Z)V
    .locals 2

    .line 511
    iput-boolean p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->addTableName:Z

    .line 512
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinList:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 513
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;

    .line 514
    iget-object v1, v1, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;

    invoke-direct {v1, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->setAddTableName(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method protected appendStatementEnd(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    .line 494
    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendGroupBys(Ljava/lang/StringBuilder;)V

    .line 495
    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendHaving(Ljava/lang/StringBuilder;)V

    .line 496
    invoke-direct {p0, p1, p2}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendOrderBys(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 497
    iget-object p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    invoke-interface {p2}, Lcom/j256/ormlite/db/DatabaseType;->isLimitAfterSelect()Z

    move-result p2

    if-nez p2, :cond_0

    .line 498
    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendLimit(Ljava/lang/StringBuilder;)V

    .line 500
    :cond_0
    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendOffset(Ljava/lang/StringBuilder;)V

    const/4 p1, 0x0

    .line 502
    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->setAddTableName(Z)V

    return-void
.end method

.method protected appendStatementStart(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lcom/j256/ormlite/stmt/ArgumentHolder;",
            ">;)V"
        }
    .end annotation

    .line 436
    iget-object p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinList:Ljava/util/List;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 437
    invoke-direct {p0, p2}, Lcom/j256/ormlite/stmt/QueryBuilder;->setAddTableName(Z)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    .line 439
    invoke-direct {p0, p2}, Lcom/j256/ormlite/stmt/QueryBuilder;->setAddTableName(Z)V

    :goto_0
    const-string p2, "SELECT "

    .line 441
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    iget-object p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    invoke-interface {p2}, Lcom/j256/ormlite/db/DatabaseType;->isLimitAfterSelect()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 443
    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendLimit(Ljava/lang/StringBuilder;)V

    .line 445
    :cond_1
    iget-boolean p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->distinct:Z

    if-eqz p2, :cond_2

    const-string p2, "DISTINCT "

    .line 446
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    :cond_2
    iget-boolean p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->isCountOfQuery:Z

    if-eqz p2, :cond_3

    .line 449
    sget-object p2, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_LONG:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    iput-object p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    const-string p2, "COUNT(*) "

    .line 450
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 451
    :cond_3
    iget-object p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRawList:Ljava/util/List;

    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_4

    .line 452
    sget-object p2, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT_RAW:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    iput-object p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    .line 453
    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendSelectRaw(Ljava/lang/StringBuilder;)V

    goto :goto_1

    .line 455
    :cond_4
    sget-object p2, Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;->SELECT:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    iput-object p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->type:Lcom/j256/ormlite/stmt/StatementBuilder$StatementType;

    .line 456
    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendColumns(Ljava/lang/StringBuilder;)V

    :goto_1
    const-string p2, "FROM "

    .line 458
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    iget-object p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->tableName:Ljava/lang/String;

    invoke-interface {p2, p1, v0}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 p2, 0x20

    .line 460
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 461
    iget-object p2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinList:Ljava/util/List;

    if-eqz p2, :cond_5

    .line 462
    invoke-direct {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendJoinSql(Ljava/lang/StringBuilder;)V

    :cond_5
    return-void
.end method

.method protected appendWhereStatement(Ljava/lang/StringBuilder;Ljava/util/List;Lcom/j256/ormlite/stmt/StatementBuilder$WhereOperation;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lcom/j256/ormlite/stmt/ArgumentHolder;",
            ">;",
            "Lcom/j256/ormlite/stmt/StatementBuilder$WhereOperation;",
            ")Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 474
    sget-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$WhereOperation;->FIRST:Lcom/j256/ormlite/stmt/StatementBuilder$WhereOperation;

    if-ne p3, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 475
    :goto_0
    iget-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->where:Lcom/j256/ormlite/stmt/Where;

    if-eqz v1, :cond_1

    .line 476
    invoke-super {p0, p1, p2, p3}, Lcom/j256/ormlite/stmt/StatementBuilder;->appendWhereStatement(Ljava/lang/StringBuilder;Ljava/util/List;Lcom/j256/ormlite/stmt/StatementBuilder$WhereOperation;)Z

    move-result v0

    .line 478
    :cond_1
    iget-object p3, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinList:Ljava/util/List;

    if-eqz p3, :cond_3

    .line 479
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;

    if-eqz v0, :cond_2

    .line 481
    sget-object v0, Lcom/j256/ormlite/stmt/StatementBuilder$WhereOperation;->FIRST:Lcom/j256/ormlite/stmt/StatementBuilder$WhereOperation;

    goto :goto_2

    .line 483
    :cond_2
    iget-object v0, v1, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->operation:Lcom/j256/ormlite/stmt/StatementBuilder$WhereOperation;

    .line 485
    :goto_2
    iget-object v1, v1, Lcom/j256/ormlite/stmt/QueryBuilder$JoinInfo;->queryBuilder:Lcom/j256/ormlite/stmt/QueryBuilder;

    invoke-virtual {v1, p1, p2, v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->appendWhereStatement(Ljava/lang/StringBuilder;Ljava/util/List;Lcom/j256/ormlite/stmt/StatementBuilder$WhereOperation;)Z

    move-result v0

    goto :goto_1

    :cond_3
    return v0
.end method

.method protected getResultFieldTypes()[Lcom/j256/ormlite/field/FieldType;
    .locals 1

    .line 468
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->resultFieldTypes:[Lcom/j256/ormlite/field/FieldType;

    return-object v0
.end method

.method public limit(Ljava/lang/Long;)Lcom/j256/ormlite/stmt/QueryBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")",
            "Lcom/j256/ormlite/stmt/QueryBuilder<",
            "TT;TID;>;"
        }
    .end annotation

    .line 255
    iput-object p1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->limit:Ljava/lang/Long;

    return-object p0
.end method

.method public orderBy(Ljava/lang/String;Z)Lcom/j256/ormlite/stmt/QueryBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/j256/ormlite/stmt/QueryBuilder<",
            "TT;TID;>;"
        }
    .end annotation

    .line 193
    invoke-virtual {p0, p1}, Lcom/j256/ormlite/stmt/QueryBuilder;->verifyColumnName(Ljava/lang/String;)Lcom/j256/ormlite/field/FieldType;

    move-result-object v0

    .line 194
    invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z

    move-result v0

    if-nez v0, :cond_1

    .line 197
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByList:Ljava/util/List;

    if-nez v0, :cond_0

    .line 198
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByList:Ljava/util/List;

    .line 200
    :cond_0
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByList:Ljava/util/List;

    new-instance v1, Lcom/j256/ormlite/stmt/query/OrderBy;

    invoke-direct {v1, p1, p2}, Lcom/j256/ormlite/stmt/query/OrderBy;-><init>(Ljava/lang/String;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 195
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can\'t orderBy foreign colletion field: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public prepare()Lcom/j256/ormlite/stmt/PreparedQuery;
    .locals 1
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

    .line 106
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->limit:Ljava/lang/Long;

    invoke-super {p0, v0}, Lcom/j256/ormlite/stmt/StatementBuilder;->prepareStatement(Ljava/lang/Long;)Lcom/j256/ormlite/stmt/mapped/MappedPreparedStmt;

    move-result-object v0

    return-object v0
.end method

.method public query()Ljava/util/List;
    .locals 2
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

    .line 361
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->dao:Lcom/j256/ormlite/dao/Dao;

    invoke-virtual {p0}, Lcom/j256/ormlite/stmt/QueryBuilder;->prepare()Lcom/j256/ormlite/stmt/PreparedQuery;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/Dao;->query(Lcom/j256/ormlite/stmt/PreparedQuery;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public queryForFirst()Ljava/lang/Object;
    .locals 2
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

    .line 375
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->dao:Lcom/j256/ormlite/dao/Dao;

    invoke-virtual {p0}, Lcom/j256/ormlite/stmt/QueryBuilder;->prepare()Lcom/j256/ormlite/stmt/PreparedQuery;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/j256/ormlite/dao/Dao;->queryForFirst(Lcom/j256/ormlite/stmt/PreparedQuery;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public reset()V
    .locals 3

    .line 412
    invoke-super {p0}, Lcom/j256/ormlite/stmt/StatementBuilder;->reset()V

    const/4 v0, 0x0

    .line 413
    iput-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->distinct:Z

    const/4 v1, 0x1

    .line 414
    iput-boolean v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectIdColumn:Z

    const/4 v1, 0x0

    .line 415
    iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectColumnList:Ljava/util/List;

    .line 416
    iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRawList:Ljava/util/List;

    .line 417
    iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByList:Ljava/util/List;

    .line 418
    iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->orderByRaw:Ljava/lang/String;

    .line 419
    iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByList:Ljava/util/List;

    .line 420
    iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->groupByRaw:Ljava/lang/String;

    .line 421
    iput-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->isInnerQuery:Z

    .line 422
    iput-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->isCountOfQuery:Z

    .line 423
    iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->having:Ljava/lang/String;

    .line 424
    iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->limit:Ljava/lang/Long;

    .line 425
    iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->offset:Ljava/lang/Long;

    .line 426
    iget-object v2, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinList:Ljava/util/List;

    if-eqz v2, :cond_0

    .line 428
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 429
    iput-object v1, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->joinList:Ljava/util/List;

    .line 431
    :cond_0
    iput-boolean v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->addTableName:Z

    return-void
.end method

.method public varargs selectRaw([Ljava/lang/String;)Lcom/j256/ormlite/stmt/QueryBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lcom/j256/ormlite/stmt/QueryBuilder<",
            "TT;TID;>;"
        }
    .end annotation

    .line 149
    iget-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRawList:Ljava/util/List;

    if-nez v0, :cond_0

    .line 150
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRawList:Ljava/util/List;

    .line 152
    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 153
    iget-object v3, p0, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRawList:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object p0
.end method
