.class public Lcom/j256/ormlite/stmt/ColumnArg;
.super Ljava/lang/Object;
.source "ColumnArg.java"


# instance fields
.field private final columnName:Ljava/lang/String;

.field private final tableName:Ljava/lang/String;


# virtual methods
.method public getColumnName()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/j256/ormlite/stmt/ColumnArg;->columnName:Ljava/lang/String;

    return-object v0
.end method

.method public getTableName()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/j256/ormlite/stmt/ColumnArg;->tableName:Ljava/lang/String;

    return-object v0
.end method
