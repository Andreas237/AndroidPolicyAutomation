.class public Lcom/huawei/logupload/a/c;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "upload.db"

.field private static final b:I = 0x2


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 34
    const-string v0, "upload.db"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 35
    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 24
    const-string v0, "upload.db"

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 39
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DataBase onCreate, the database path is: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 41
    const-string v1, ""

    .line 40
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    :cond_0
    invoke-static {p1}, Lcom/huawei/logupload/a/a;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 44
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 3

    .line 53
    if-eqz p1, :cond_0

    .line 54
    const-string v0, "alter table t_logupload add zipTime varchar(256)"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 55
    const-string v0, "alter table t_logupload add logDetailInfo varchar(1024)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 56
    const-string v0, "alter table t_logupload add productName varchar(256)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 57
    const-string v0, "alter table t_logupload add romVersion varchar(256)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 58
    const-string v0, "alter table t_logupload add isPause varchar(4)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    goto :goto_0

    :catch_0
    move-exception v2

    .line 61
    invoke-virtual {v2}, Landroid/database/SQLException;->printStackTrace()V

    .line 62
    const-string v0, "upload.db"

    const-string v1, "onUpgrade table t_logupload Error"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    :cond_0
    :goto_0
    return-void
.end method
