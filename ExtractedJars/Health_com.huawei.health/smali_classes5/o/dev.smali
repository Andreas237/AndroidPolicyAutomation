.class public Lo/dev;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Lo/dez;)Ljava/lang/String;
    .locals 3

    .line 84
    const-string v2, ""

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "( Device_ID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "User_ID"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 86
    invoke-static {}, Lo/dez;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' )"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 88
    return-object v2
.end method

.method private d()Ljava/lang/String;
    .locals 2

    .line 40
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 41
    const-string v0, "_id integer primary key autoincrement,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 42
    const-string v0, "User_ID NVARCHAR(300) not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 43
    const-string v0, "Device_ID NVARCHAR(300) not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 44
    const-string v0, "LastTotalSteps integer not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 45
    const-string v0, "LastTotalCalories integer not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 46
    const-string v0, "LastTotalDistance integer not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 47
    const-string v0, "Time_Stamp integer not null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 48
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Lo/dez;)Ljava/lang/String;
    .locals 1

    .line 53
    const-string v0, "LastTotalValueDB"

    return-object v0
.end method

.method private d(Landroid/database/Cursor;)Lo/dfa;
    .locals 3

    .line 75
    new-instance v2, Lo/dfa;

    invoke-direct {v2}, Lo/dfa;-><init>()V

    .line 76
    const-string v0, "LastTotalSteps"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/dfa;->e(I)V

    .line 77
    const-string v0, "LastTotalCalories"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/dfa;->b(I)V

    .line 78
    const-string v0, "LastTotalDistance"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/dfa;->c(I)V

    .line 79
    const-string v0, "Time_Stamp"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v2, v0, v1}, Lo/dfa;->a(J)V

    .line 80
    return-object v2
.end method


# virtual methods
.method public a(Lo/dfa;Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;
    .locals 4

    .line 62
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 64
    const-string v0, "User_ID"

    invoke-virtual {v3, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string v0, "Device_ID"

    invoke-virtual {v3, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v0, "LastTotalSteps"

    invoke-virtual {p1}, Lo/dfa;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 67
    const-string v0, "LastTotalCalories"

    invoke-virtual {p1}, Lo/dfa;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 68
    const-string v0, "LastTotalDistance"

    invoke-virtual {p1}, Lo/dfa;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 69
    const-string v0, "Time_Stamp"

    invoke-virtual {p1}, Lo/dfa;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 71
    return-object v3
.end method

.method public a(Lo/dez;)V
    .locals 3

    .line 57
    invoke-direct {p0, p1}, Lo/dev;->d(Lo/dez;)Ljava/lang/String;

    move-result-object v2

    .line 58
    invoke-direct {p0}, Lo/dev;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v2, v1, v0}, Lo/dez;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 59
    return-void
.end method

.method public b(Lo/dez;)Lo/dfa;
    .locals 8

    .line 92
    new-instance v5, Lo/dfa;

    invoke-direct {v5}, Lo/dfa;-><init>()V

    .line 94
    invoke-direct {p0, p1}, Lo/dev;->d(Lo/dez;)Ljava/lang/String;

    move-result-object v7

    .line 96
    invoke-direct {p0, p1}, Lo/dev;->c(Lo/dez;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v7, v1, v0}, Lo/dez;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 97
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 98
    const-string v0, "LastTotalValueDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastTotalCalories query error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-object v5

    .line 101
    :cond_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    invoke-direct {p0, v6}, Lo/dev;->d(Landroid/database/Cursor;)Lo/dfa;

    move-result-object v5

    .line 104
    :cond_1
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 106
    const-string v0, "05"

    const-string v1, "LastTotalValueDB"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getTotalValue :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 107
    return-object v5
.end method

.method public c(Lo/dez;Lo/dfa;)V
    .locals 8

    .line 275
    invoke-static {}, Lo/dez;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p2, v0, v1}, Lo/dev;->a(Lo/dfa;Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v5

    .line 277
    invoke-direct {p0, p1}, Lo/dev;->d(Lo/dez;)Ljava/lang/String;

    move-result-object v7

    .line 279
    const-string v0, "05"

    const-string v1, "LastTotalValueDB"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "setLastTotalValue total="

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 281
    invoke-direct {p0, p1}, Lo/dev;->c(Lo/dez;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v7, v1, v0}, Lo/dez;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 282
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 283
    const-string v0, "LastTotalValueDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setLastTimeStamp query error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    return-void

    .line 287
    :cond_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 288
    invoke-direct {p0, p1}, Lo/dev;->c(Lo/dez;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v7, v1, v5, v0}, Lo/dez;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    goto :goto_0

    .line 290
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p1, v7, v0, v5}, Lo/dez;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    .line 292
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 293
    return-void
.end method

.method public e(Lo/dez;)J
    .locals 8

    .line 235
    const-wide/16 v5, 0x0

    .line 238
    invoke-virtual {p0, p1}, Lo/dev;->b(Lo/dez;)Lo/dfa;

    move-result-object v7

    .line 239
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 240
    invoke-virtual {v7}, Lo/dfa;->a()J

    move-result-wide v5

    .line 243
    :cond_0
    const-string v0, "05"

    const-string v1, "LastTotalValueDB"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getLastTimeStamp timeStamp="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 244
    return-wide v5
.end method
