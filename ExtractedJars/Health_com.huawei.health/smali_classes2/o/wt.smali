.class public Lo/wt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 34
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "huid"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "head_url"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "bg_rul"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "name"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "data1"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "data2"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "data3"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "data4"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lo/wt;->d:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 2

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    const-string v0, "huid BIGINT UNIQUE  not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    const-string v0, "head_url NVARCHAR(1024) ,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    const-string v0, "bg_rul NVARCHAR(1024) ,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    const-string v0, "name  NVARCHAR(300) ,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    const-string v0, "data1  NVARCHAR(300) ,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    const-string v0, "data2  NVARCHAR(300) ,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    const-string v0, "data3  NVARCHAR(300) ,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    const-string v0, "data4  NVARCHAR(300) ,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    const-string v0, "primary key(huid)"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lo/wr;)V
    .locals 3

    .line 56
    const-string v0, "AssistentDB"

    invoke-direct {p0}, Lo/wt;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2, v1}, Lo/wr;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 57
    return-void
.end method

.method public c(Lo/wr;)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/wr;)Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/AssistentTable;>;"
        }
    .end annotation

    .line 151
    const/4 v4, 0x0

    .line 152
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 155
    const-string v0, "AssistentDB"

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p1, v0, v1, v2}, Lo/wr;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 156
    if-nez v4, :cond_1

    .line 157
    const/4 v6, 0x0

    .line 171
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 172
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 157
    :cond_0
    return-object v6

    .line 159
    :cond_1
    :goto_0
    :try_start_1
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 160
    new-instance v6, Lcom/huawei/bone/social/manager/db/AssistentTable;

    invoke-direct {v6}, Lcom/huawei/bone/social/manager/db/AssistentTable;-><init>()V

    .line 161
    const-string v0, "huid"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/bone/social/manager/db/AssistentTable;->saveHuId(J)V

    .line 162
    const-string v0, "name"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/bone/social/manager/db/AssistentTable;->saveName(Ljava/lang/String;)V

    .line 163
    const-string v0, "head_url"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/bone/social/manager/db/AssistentTable;->saveImgUrl(Ljava/lang/String;)V

    .line 164
    const-string v0, "bg_rul"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/bone/social/manager/db/AssistentTable;->saveBgImgUrl(Ljava/lang/String;)V

    .line 166
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    goto :goto_0

    .line 171
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 172
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 168
    :catch_0
    move-exception v6

    .line 169
    const-string v0, "AssistentDB"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllAssisitent Exception e !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 171
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 172
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 171
    :catchall_0
    move-exception v7

    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 172
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 174
    :cond_3
    throw v7

    .line 175
    :cond_4
    :goto_1
    return-object v5
.end method
