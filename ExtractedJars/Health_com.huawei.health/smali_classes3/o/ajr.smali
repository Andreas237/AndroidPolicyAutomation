.class public Lo/ajr;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/ajr;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 50
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 52
    invoke-direct {p0}, Lo/ajr;->b()V

    .line 54
    invoke-direct {p0}, Lo/ajr;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check DB is Null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 57
    :cond_0
    return-void
.end method

.method private b(Lo/aja;)Landroid/content/ContentValues;
    .locals 5

    .line 318
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getContentValues deviceid "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p1, Lo/aja;->c:Lo/aja$a;

    iget-object v2, v2, Lo/aja$a;->e:Ljava/lang/String;

    invoke-static {v2}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 319
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 320
    const-string v0, "productId"

    iget-object v1, p1, Lo/aja;->e:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    const-string v0, "deviceId"

    iget-object v1, p1, Lo/aja;->c:Lo/aja$a;

    iget-object v1, v1, Lo/aja$a;->e:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    const-string v0, "deviceCode"

    iget-object v1, p1, Lo/aja;->c:Lo/aja$a;

    iget-wide v1, v1, Lo/aja$a;->c:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    const-string v0, "sn"

    iget-object v1, p1, Lo/aja;->c:Lo/aja$a;

    iget-object v1, v1, Lo/aja$a;->b:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    const-string v0, "model"

    iget-object v1, p1, Lo/aja;->c:Lo/aja$a;

    iget-object v1, v1, Lo/aja$a;->d:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    const-string v0, "deviceType"

    iget-object v1, p1, Lo/aja;->c:Lo/aja$a;

    iget-object v1, v1, Lo/aja$a;->a:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    const-string v0, "manu"

    iget-object v1, p1, Lo/aja;->c:Lo/aja$a;

    iget-object v1, v1, Lo/aja$a;->f:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    const-string v0, "prodId"

    iget-object v1, p1, Lo/aja;->c:Lo/aja$a;

    iget-object v1, v1, Lo/aja$a;->h:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    const-string v0, "hiv"

    iget-object v1, p1, Lo/aja;->c:Lo/aja$a;

    iget-object v1, v1, Lo/aja$a;->g:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    const-string v0, "fwv"

    iget-object v1, p1, Lo/aja;->c:Lo/aja$a;

    iget-object v1, v1, Lo/aja$a;->i:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    const-string v0, "hwv"

    iget-object v1, p1, Lo/aja;->c:Lo/aja$a;

    iget-object v1, v1, Lo/aja$a;->m:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    const-string v0, "swv"

    iget-object v1, p1, Lo/aja;->c:Lo/aja$a;

    iget-object v1, v1, Lo/aja$a;->p:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    const-string v0, "mac"

    iget-object v1, p1, Lo/aja;->c:Lo/aja$a;

    iget-object v1, v1, Lo/aja$a;->k:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    const-string v0, "protType"

    iget-object v1, p1, Lo/aja;->c:Lo/aja$a;

    iget v1, v1, Lo/aja$a;->l:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 334
    iget-object v0, p1, Lo/aja;->a:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p1, Lo/aja;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 335
    const-string v0, "serviceInfo"

    iget-object v1, p1, Lo/aja;->a:Ljava/util/List;

    invoke-direct {p0, v1}, Lo/ajr;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    :cond_0
    return-object v4
.end method

.method private b(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 127
    const-string v0, "WiFiBindDevice"

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lo/ajr;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 128
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 129
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getArrayListData cursor is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 130
    const/4 v0, 0x0

    return-object v0

    .line 132
    :cond_0
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-nez v0, :cond_1

    .line 133
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getArrayListData cursor size is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 134
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 135
    const/4 v0, 0x0

    return-object v0

    .line 137
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 138
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 139
    invoke-interface {v4, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 140
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    goto :goto_0

    .line 142
    :cond_2
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 143
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 144
    return-object v5
.end method

.method private b()V
    .locals 5

    .line 64
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createTable | create new table: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "WiFiBindDevice"

    invoke-virtual {p0, v3}, Lo/ajr;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 66
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    const-string v0, "_id integer primary key autoincrement,"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "productId text not null,"

    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "deviceId text not null,"

    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "deviceCode text not null,"

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "sn text not null,"

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "model text not null,"

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "deviceType text not null,"

    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "manu text not null,"

    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "prodId text not null,"

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "hiv text not null,"

    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "fwv text,"

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "hwv text,"

    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "swv text,"

    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "mac text,"

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "protType integer,"

    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "serviceInfo text"

    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createTable | create new table sql = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const-string v0, "WiFiBindDevice"

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lo/ajr;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 85
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createTable | create table end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 86
    return-void
.end method

.method private c(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/aja$c;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 350
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 351
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Lo/ajr$3;

    invoke-direct {v1, p0}, Lo/ajr$3;-><init>(Lo/ajr;)V

    invoke-virtual {v1}, Lo/ajr$3;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v2

    .line 352
    return-object v2

    .line 354
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lo/ajr;
    .locals 4

    .line 94
    sget-object v0, Lo/ajr;->a:Lo/ajr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 95
    const-class v2, Lo/ajr;

    monitor-enter v2

    .line 96
    :try_start_0
    sget-object v0, Lo/ajr;->a:Lo/ajr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 97
    new-instance v0, Lo/ajr;

    invoke-direct {v0, p0}, Lo/ajr;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/ajr;->a:Lo/ajr;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 102
    :cond_1
    :goto_0
    sget-object v0, Lo/ajr;->a:Lo/ajr;

    return-object v0
.end method

.method private d()Z
    .locals 6

    .line 116
    const/4 v4, 0x1

    .line 117
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDBisNull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 118
    const-string v0, "WiFiBindDevice"

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lo/ajr;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    .line 119
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 120
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 121
    const/4 v4, 0x0

    .line 123
    :cond_0
    return v4
.end method

.method private e(Landroid/database/Cursor;)Lo/aja;
    .locals 5

    .line 267
    new-instance v4, Lo/aja;

    invoke-direct {v4}, Lo/aja;-><init>()V

    .line 268
    const-string v0, "productId"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lo/aja;->e:Ljava/lang/String;

    .line 269
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    const-string v1, "deviceId"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/aja$a;->e:Ljava/lang/String;

    .line 270
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    const-string v1, "deviceCode"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, v0, Lo/aja$a;->c:J

    .line 271
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    const-string v1, "sn"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/aja$a;->b:Ljava/lang/String;

    .line 272
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    const-string v1, "model"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/aja$a;->d:Ljava/lang/String;

    .line 273
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    const-string v1, "deviceType"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/aja$a;->a:Ljava/lang/String;

    .line 274
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    const-string v1, "manu"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/aja$a;->f:Ljava/lang/String;

    .line 275
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    const-string v1, "prodId"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/aja$a;->h:Ljava/lang/String;

    .line 276
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    const-string v1, "hiv"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/aja$a;->g:Ljava/lang/String;

    .line 277
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    const-string v1, "fwv"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/aja$a;->i:Ljava/lang/String;

    .line 278
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    const-string v1, "hwv"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/aja$a;->m:Ljava/lang/String;

    .line 279
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    const-string v1, "swv"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/aja$a;->p:Ljava/lang/String;

    .line 280
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    const-string v1, "mac"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/aja$a;->k:Ljava/lang/String;

    .line 281
    iget-object v0, v4, Lo/aja;->c:Lo/aja$a;

    const-string v1, "protType"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    iput v1, v0, Lo/aja$a;->l:I

    .line 282
    const-string v0, "serviceInfo"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/ajr;->f(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/aja;->c(Ljava/util/List;)V

    .line 283
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWiFiDevice device "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lo/aja;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 284
    return-object v4
.end method

.method private f(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lo/aja$c;>;"
        }
    .end annotation

    .line 341
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 342
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Lo/ajr$5;

    invoke-direct {v1, p0}, Lo/ajr$5;-><init>(Lo/ajr;)V

    invoke-virtual {v1}, Lo/ajr$5;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    .line 343
    return-object v2

    .line 345
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 7

    .line 366
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 367
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteByProductID() productID = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 368
    const/4 v0, -0x1

    return v0

    .line 370
    :cond_0
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteByProductID() enter productID "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 371
    const-string v4, "productId = ?"

    .line 372
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v5, v0

    .line 373
    const-string v0, "WiFiBindDevice"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, v4, v5}, Lo/ajr;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)I

    move-result v6

    .line 374
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteByProductID() count = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 375
    return v6
.end method

.method public a()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/aja;>;"
        }
    .end annotation

    .line 191
    const-string v0, "WiFiBindDevice"

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lo/ajr;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 192
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 193
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllDevice cursor is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 194
    const/4 v0, 0x0

    return-object v0

    .line 196
    :cond_0
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-nez v0, :cond_1

    .line 197
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllDevice cursor size is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 198
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 199
    const/4 v0, 0x0

    return-object v0

    .line 201
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 202
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 203
    invoke-direct {p0, v4}, Lo/ajr;->e(Landroid/database/Cursor;)Lo/aja;

    move-result-object v6

    .line 204
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    goto :goto_0

    .line 206
    :cond_2
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 207
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllDevice:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 208
    return-object v5
.end method

.method public c(Lo/aja;)J
    .locals 7

    .line 293
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lo/aja;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0

    .line 296
    :cond_1
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert device "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/aja;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 297
    const-wide/16 v4, 0x0

    .line 298
    invoke-direct {p0, p1}, Lo/ajr;->b(Lo/aja;)Landroid/content/ContentValues;

    move-result-object v6

    .line 299
    const-string v0, "WiFiBindDevice"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, v6}, Lo/ajr;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v4

    .line 300
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert count "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 301
    return-wide v4
.end method

.method public c()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 185
    const-string v0, "deviceId"

    invoke-direct {p0, v0}, Lo/ajr;->b(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 186
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllDeviceForDeviceID:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    if-nez v4, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 187
    return-object v4
.end method

.method public c(Ljava/lang/String;)Lo/aja;
    .locals 8

    .line 212
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceByProduct productID is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 214
    const/4 v0, 0x0

    return-object v0

    .line 216
    :cond_0
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceByProduct productID "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 217
    const/4 v4, 0x0

    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "WiFiBindDevice"

    invoke-virtual {p0, v1}, Lo/ajr;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 219
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v6, v0

    .line 220
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v5, v6}, Lo/ajr;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 221
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 222
    invoke-direct {p0, v7}, Lo/ajr;->e(Landroid/database/Cursor;)Lo/aja;

    move-result-object v4

    .line 223
    iput-object p1, v4, Lo/aja;->e:Ljava/lang/String;

    .line 224
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lo/aja;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 226
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 227
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 229
    :cond_2
    return-object v4
.end method

.method public d(Lo/aja;)J
    .locals 10

    .line 305
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lo/aja;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 306
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0

    .line 308
    :cond_1
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update device "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/aja;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 309
    const-wide/16 v6, 0x0

    .line 310
    invoke-direct {p0, p1}, Lo/ajr;->b(Lo/aja;)Landroid/content/ContentValues;

    move-result-object v8

    .line 311
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    iget-object v0, p1, Lo/aja;->e:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 312
    move-object v0, p0

    const-string v1, "WiFiBindDevice"

    move-object v3, v8

    const-string v4, "productId=?"

    move-object v5, v9

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/ajr;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v6, v0

    .line 313
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update count "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 314
    return-wide v6
.end method

.method public d(Ljava/lang/String;)Lo/aja;
    .locals 8

    .line 240
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 241
    const/4 v0, 0x0

    return-object v0

    .line 243
    :cond_0
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceByDeviceID deviceID "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 244
    const/4 v4, 0x0

    .line 245
    const/4 v5, 0x0

    .line 246
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "WiFiBindDevice"

    invoke-virtual {p0, v1}, Lo/ajr;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "deviceId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 247
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v7, v0

    .line 248
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v6, v7}, Lo/ajr;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 249
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 250
    invoke-direct {p0, v4}, Lo/ajr;->e(Landroid/database/Cursor;)Lo/aja;

    move-result-object v5

    .line 251
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lo/aja;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 253
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 254
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 256
    :cond_2
    return-object v5
.end method

.method public e()I
    .locals 5

    .line 359
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete() enter --------- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 360
    const-string v0, "WiFiBindDevice"

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/ajr;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)I

    move-result v4

    .line 361
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete() count = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 362
    return v4
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 155
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceProductID deiviceID is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 157
    const/4 v0, 0x0

    return-object v0

    .line 159
    :cond_0
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceProductID deiviceID "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "WiFiBindDevice"

    invoke-virtual {p0, v1}, Lo/ajr;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "deviceId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 161
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v5, v0

    .line 162
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v4, v5}, Lo/ajr;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 163
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 164
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceProductID cursor is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 165
    const/4 v0, 0x0

    return-object v0

    .line 167
    :cond_1
    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-nez v0, :cond_2

    .line 168
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceProductID cursor size is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 169
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 170
    const/4 v0, 0x0

    return-object v0

    .line 172
    :cond_2
    const/4 v7, 0x0

    .line 173
    :cond_3
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 174
    const-string v0, "productId"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 175
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 176
    .line 179
    :cond_4
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 180
    const-string v0, "WiFiDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceProductID product ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 181
    return-object v7
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 107
    const/16 v0, 0x2731

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
