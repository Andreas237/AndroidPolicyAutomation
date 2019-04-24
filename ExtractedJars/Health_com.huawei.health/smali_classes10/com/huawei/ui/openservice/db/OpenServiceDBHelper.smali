.class public Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/openservice/db/OpenServiceDBHelper$Instance;
    }
.end annotation


# static fields
.field private static final DATABASE_NAME:Ljava/lang/String; = "open_service4.db"

.field private static final LOG_TAG:Ljava/lang/String; = "Opera_OpenServiceDBHelper"

.field private static final VERSION:I = 0x5

.field private static mContext:Landroid/content/Context; = null


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 51
    const-string v0, "open_service4.db"

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 52
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lcom/huawei/ui/openservice/db/OpenServiceDBHelper$1;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000()Landroid/content/Context;
    .locals 1

    .line 27
    sget-object v0, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;
    .locals 1

    .line 46
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;->mContext:Landroid/content/Context;

    .line 47
    sget-object v0, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper$Instance;->db:Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;

    return-object v0
.end method

.method private initOldServiceForUp3(Landroid/database/Cursor;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Landroid/content/ContentValues;>;"
        }
    .end annotation

    .line 131
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 132
    if-nez p1, :cond_0

    return-object v2

    .line 135
    :cond_0
    :goto_0
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 137
    const-string v0, "service_id"

    const-string v1, "service_id"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    const-string v0, "location"

    const-string v1, "location"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v0, "position"

    const-string v1, "position"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 140
    const-string v0, "description"

    const-string v1, "description"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    const-string v0, "image_Url"

    const-string v1, "image_Url"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const-string v0, "url"

    const-string v1, "url"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    const-string v0, "start_date"

    const-string v1, "start_date"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 144
    const-string v0, "end_date"

    const-string v1, "end_date"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 145
    const-string v0, "hms_auth"

    const-string v1, "hms_auth"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 146
    const-string v0, "auth_type"

    const-string v1, "auth_type"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    const-string v0, "modify_time"

    const-string v1, "modify_time"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 148
    const-string v0, "service_name"

    const-string v1, "service_name"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 152
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 153
    goto :goto_1

    .line 152
    :catchall_0
    move-exception v4

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 153
    throw v4

    .line 154
    :goto_1
    return-object v2
.end method

.method private upgrade1(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 87
    const-string v0, "Opera_OpenServiceDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgrade1 start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    const-string v0, " alter table service add label integer "

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 89
    const-string v0, " alter table service add is_service_card integer default 1"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 90
    const-string v0, " alter table service add need_recommend integer default 0"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 91
    const-string v0, " alter table service add is_plugin integer default 0"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 92
    const-string v0, " alter table service add plugin_url text "

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 93
    const-string v0, " alter table service add service_source text default THIRD_H5"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 94
    const-string v0, " alter table service add service_detail text "

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 95
    const-string v0, "Opera_OpenServiceDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgrade1 end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    return-void
.end method

.method private upgrade2(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 99
    const-string v0, "Opera_OpenServiceDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgrade2 start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    const-string v0, "DROP TABLE  IF EXISTS child_service"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 101
    invoke-static {}, Lcom/huawei/ui/openservice/db/model/ChildServiceTable;->getCreateTableSQL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 102
    const-string v0, "Opera_OpenServiceDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgrade2 end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    return-void
.end method

.method private upgrade3(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 12

    .line 106
    const-string v0, "Opera_OpenServiceDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgrade3 start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    const/16 v0, 0xd

    new-array v8, v0, [Ljava/lang/String;

    const-string v0, "id"

    const/4 v1, 0x0

    aput-object v0, v8, v1

    const-string v0, "service_id"

    const/4 v1, 0x1

    aput-object v0, v8, v1

    const-string v0, "position"

    const/4 v1, 0x2

    aput-object v0, v8, v1

    const-string v0, "location"

    const/4 v1, 0x3

    aput-object v0, v8, v1

    const-string v0, "description"

    const/4 v1, 0x4

    aput-object v0, v8, v1

    const-string v0, "image_Url"

    const/4 v1, 0x5

    aput-object v0, v8, v1

    const-string v0, "url"

    const/4 v1, 0x6

    aput-object v0, v8, v1

    const-string v0, "start_date"

    const/4 v1, 0x7

    aput-object v0, v8, v1

    const-string v0, "end_date"

    const/16 v1, 0x8

    aput-object v0, v8, v1

    const-string v0, "hms_auth"

    const/16 v1, 0x9

    aput-object v0, v8, v1

    const-string v0, "auth_type"

    const/16 v1, 0xa

    aput-object v0, v8, v1

    const-string v0, "modify_time"

    const/16 v1, 0xb

    aput-object v0, v8, v1

    const-string v0, "service_name"

    const/16 v1, 0xc

    aput-object v0, v8, v1

    .line 110
    move-object v0, p1

    const-string v1, "child_service"

    move-object v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;->initOldServiceForUp3(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v9

    .line 111
    const-string v0, "DROP TABLE  IF EXISTS child_service"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 112
    invoke-static {}, Lcom/huawei/ui/openservice/db/model/ChildServiceTable;->getCreateTableSQL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 113
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/content/ContentValues;

    .line 114
    const-string v0, "child_service"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v11}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 115
    goto :goto_0

    .line 116
    :cond_0
    const-string v0, "Opera_OpenServiceDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgrade3 end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    return-void
.end method

.method private upgrade4(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 120
    const-string v0, "Opera_OpenServiceDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgrade4 start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    const-string v0, " alter table service add service_mid_icon text "

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 122
    const-string v0, " alter table service add service_keep_1 text "

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 123
    const-string v0, " alter table service add service_keep_2 text "

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 124
    const-string v0, " alter table service add service_keep_3 text "

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 125
    const-string v0, " alter table service add service_keep_4 text "

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 126
    const-string v0, " alter table service add service_keep_5 text "

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 127
    const-string v0, "Opera_OpenServiceDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgrade4 end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 56
    const-string v0, "Opera_OpenServiceDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    invoke-static {}, Lcom/huawei/ui/openservice/db/model/ServiceTable;->getCreateTableSQL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 58
    invoke-static {}, Lcom/huawei/ui/openservice/db/model/ServiceTypeTable;->getCreateTableSQL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 59
    invoke-static {}, Lcom/huawei/ui/openservice/db/model/ServiceVersionTable;->getCreateTableSQL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 60
    invoke-static {}, Lcom/huawei/ui/openservice/db/model/SecurityURLTable;->getCreateTableSQL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 61
    invoke-static {}, Lcom/huawei/ui/openservice/db/model/UserHomePageServiceTable;->getCreateTableSQL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 62
    invoke-static {}, Lcom/huawei/ui/openservice/db/model/UserServiceAuthTable;->getCreateTableSQL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 63
    invoke-static {}, Lcom/huawei/ui/openservice/db/model/ChildServiceTable;->getCreateTableSQL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 64
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 2

    .line 68
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;->upgrade1(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 70
    add-int/lit8 p2, p2, 0x1

    .line 72
    :cond_0
    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;->upgrade2(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 74
    add-int/lit8 p2, p2, 0x1

    .line 76
    :cond_1
    const/4 v0, 0x3

    if-ne p2, v0, :cond_2

    .line 77
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;->upgrade3(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 78
    add-int/lit8 p2, p2, 0x1

    .line 80
    :cond_2
    const/4 v0, 0x4

    if-ne p2, v0, :cond_3

    .line 81
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;->upgrade4(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 83
    :cond_3
    sget-object v0, Lcom/huawei/ui/openservice/db/OpenServiceDBHelper;->mContext:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/db/SpUtil;->setUpgrade(Landroid/content/Context;Z)V

    .line 84
    return-void
.end method
