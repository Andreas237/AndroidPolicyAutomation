.class public Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private columns:[Ljava/lang/String;

.field private tableName:Ljava/lang/String;

.field private writableDatabase:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p2, p0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->tableName:Ljava/lang/String;

    .line 25
    invoke-virtual {p3}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->columns:[Ljava/lang/String;

    .line 26
    invoke-static {p1}, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 27
    return-void
.end method


# virtual methods
.method public delete(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->tableName:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public doSai1()V
    .locals 0

    .line 45
    return-void
.end method

.method public doSai2()V
    .locals 0

    .line 46
    return-void
.end method

.method public doSai3()V
    .locals 0

    .line 47
    return-void
.end method

.method public insert(Landroid/content/ContentValues;)J
    .locals 3

    .line 30
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->tableName:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 8

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->tableName:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->columns:[Ljava/lang/String;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public update(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->tableName:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method
