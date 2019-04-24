.class public Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final Column_CountryCode:Ljava/lang/String; = "countryCode"

.field public static final Column_DeviceID:Ljava/lang/String; = "deviceID"

.field public static final Column_DeviceType:Ljava/lang/String; = "deviceType"

.field public static final Column_ID:Ljava/lang/String; = "_id"

.field public static final Column_LastSurveyTime:Ljava/lang/String; = "lastSurveyTime"

.field public static final Column_Times:Ljava/lang/String; = "times"

.field public static final Column_externData1:Ljava/lang/String; = "Data1"

.field public static final Column_externData2:Ljava/lang/String; = "Data2"

.field public static final Column_externData3:Ljava/lang/String; = "Data3"

.field public static final Column_externData4:Ljava/lang/String; = "Data4"

.field public static final Column_externData5:Ljava/lang/String; = "Data5"

.field public static final Column_surveyID:Ljava/lang/String; = "surveyID"

.field public static final DATABASE_TABLE:Ljava/lang/String; = "questionSurvey"

.field private static final TAG:Ljava/lang/String; = "QuestionSurveyDB"

.field public static final columns:[Ljava/lang/String;

.field public static final createTableSQL:Ljava/lang/String;

.field public static final getColumn_questionID:Ljava/lang/String; = "questionid"


# instance fields
.field private upgreadFlag:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 34
    const/16 v0, 0xd

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "deviceID"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "lastSurveyTime"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "deviceType"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "times"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "questionid"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "surveyID"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "countryCode"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "Data1"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "Data2"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "Data3"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "Data4"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "Data5"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->columns:[Ljava/lang/String;

    .line 42
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    const-string v0, "_id integer primary key autoincrement,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    const-string v0, "deviceID NVARCHAR(128) not null,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    const-string v0, "lastSurveyTime Long not null,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    const-string v0, "deviceType NVARCHAR(64),"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    const-string v0, "surveyID NVARCHAR(32),"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    const-string v0, "questionid integer not null,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    const-string v0, "countryCode NVARCHAR(32),"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    const-string v0, "Data1 NVARCHAR(64),"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    const-string v0, "Data2 NVARCHAR(64),"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    const-string v0, "Data3 NVARCHAR(64),"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    const-string v0, "Data4 NVARCHAR(64),"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    const-string v0, "Data5 NVARCHAR(64),"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    const-string v0, "times integer not null"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->createTableSQL:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->upgreadFlag:Z

    .line 71
    return-void
.end method


# virtual methods
.method public createDBTable(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V
    .locals 3

    .line 75
    const-string v0, "questionSurvey"

    sget-object v1, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->createTableSQL:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2, v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 76
    return-void
.end method

.method public getDBUpgreadFlag()Z
    .locals 1

    .line 99
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->upgreadFlag:Z

    return v0
.end method

.method public getOldSurveyDBData(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;>;)V"
        }
    .end annotation

    .line 103
    const/4 v4, 0x0

    .line 105
    const-string v0, "questionSurvey"

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p1, v0, v1, v2}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v4, v0

    .line 107
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 109
    :cond_0
    new-instance v5, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    invoke-direct {v5}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;-><init>()V

    .line 110
    const-string v0, "deviceID"

    .line 111
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 110
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceID:Ljava/lang/String;

    .line 112
    const-string v0, "lastSurveyTime"

    .line 113
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 112
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, v5, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->lastSurveyTime:J

    .line 114
    const-string v0, "deviceType"

    .line 115
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 114
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceType:Ljava/lang/String;

    .line 116
    const-string v0, "times"

    .line 117
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 116
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v5, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->times:Ljava/lang/Integer;

    .line 118
    const-string v0, "questionid"

    .line 119
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 118
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, v5, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->id:I

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v5, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->surveyID:Ljava/lang/String;

    .line 121
    invoke-interface {p2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 125
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 126
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    :cond_2
    goto :goto_0

    .line 129
    :catch_0
    move-exception v5

    .line 130
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 131
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 133
    :cond_3
    const-string v0, "QuestionSurveyDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOldSurveyDBData Exception e!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    :goto_0
    return-void
.end method

.method public insertDBTable(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;)J
    .locals 7

    .line 144
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 145
    const-wide/16 v0, -0x1

    return-wide v0

    .line 148
    :cond_0
    const-wide/16 v4, -0x1

    .line 150
    :try_start_0
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 151
    const-string v0, "deviceID"

    iget-object v1, p2, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceID:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const-string v0, "lastSurveyTime"

    iget-wide v1, p2, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->lastSurveyTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 153
    const-string v0, "deviceType"

    iget-object v1, p2, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceType:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    const-string v0, "times"

    iget-object v1, p2, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->times:Ljava/lang/Integer;

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 155
    const-string v0, "surveyID"

    iget-object v1, p2, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->surveyID:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const-string v0, "questionid"

    iget v1, p2, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->id:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 158
    const-string v0, "questionSurvey"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1, v6}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 162
    goto :goto_0

    .line 160
    :catch_0
    move-exception v6

    .line 161
    const-string v0, "QuestionSurveyDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertDBTable Exception e!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    :goto_0
    return-wide v4
.end method

.method public isDeviceIDInDBTable(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Ljava/lang/String;)Z
    .locals 7

    .line 173
    const/4 v4, 0x0

    .line 174
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 175
    :cond_0
    return v4

    .line 178
    :cond_1
    const/4 v5, 0x0

    .line 181
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deviceID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 182
    const-string v0, "questionSurvey"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1, v6}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v5, v0

    .line 183
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 184
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    move v4, v0

    .line 185
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    :cond_2
    goto :goto_0

    .line 187
    :catch_0
    move-exception v6

    .line 188
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 189
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 191
    :cond_3
    const-string v0, "QuestionSurveyDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeviceIDInDBTable Exception e!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    :goto_0
    return v4
.end method

.method public selectSurveyTableByDeviceId(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;
    .locals 7

    .line 203
    if-nez p2, :cond_0

    .line 204
    const/4 v0, 0x0

    return-object v0

    .line 208
    :cond_0
    const/4 v4, 0x0

    .line 209
    const/4 v5, 0x0

    .line 212
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deviceID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 213
    const-string v0, "questionSurvey"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1, v6}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v5, v0

    .line 215
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    new-instance v0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;-><init>()V

    move-object v4, v0

    .line 217
    const-string v0, "deviceID"

    .line 218
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 217
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceID:Ljava/lang/String;

    .line 219
    const-string v0, "lastSurveyTime"

    .line 220
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 219
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->lastSurveyTime:J

    .line 221
    const-string v0, "deviceType"

    .line 222
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 221
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceType:Ljava/lang/String;

    .line 223
    const-string v0, "times"

    .line 224
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 223
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->times:Ljava/lang/Integer;

    .line 225
    const-string v0, "questionid"

    .line 226
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 225
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->id:I

    .line 227
    const-string v0, "surveyID"

    .line 228
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 227
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->surveyID:Ljava/lang/String;

    .line 231
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 232
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 239
    :cond_2
    goto :goto_0

    .line 234
    :catch_0
    move-exception v6

    .line 235
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 236
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 238
    :cond_3
    const-string v0, "QuestionSurveyDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "selectSurveyTableByDeviceId Exception e!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    :goto_0
    return-object v4
.end method

.method public upDateSurveyTableByDeviceId(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;)I
    .locals 7

    .line 247
    const/4 v4, 0x0

    .line 248
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 250
    return v4

    .line 254
    :cond_0
    :try_start_0
    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 255
    const-string v0, "lastSurveyTime"

    iget-wide v1, p2, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->lastSurveyTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 256
    const-string v0, "times"

    iget-object v1, p2, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->times:Ljava/lang/Integer;

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 257
    const-string v0, "surveyID"

    iget-object v1, p2, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->surveyID:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    const-string v0, "questionid"

    iget v1, p2, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->id:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deviceID =\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p2, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 261
    const-string v0, "questionSurvey"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1, v5, v6}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 266
    goto :goto_0

    .line 264
    :catch_0
    move-exception v5

    .line 265
    const-string v0, "QuestionSurveyDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upDateSurveyTableByDeviceId Exception e!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    :goto_0
    return v4
.end method

.method public upgradeQstnSurveyDB(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Ljava/lang/Integer;Landroid/content/Context;)V
    .locals 6

    .line 79
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 80
    :cond_0
    return-void

    .line 83
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 85
    invoke-virtual {p0, p1, v3}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->getOldSurveyDBData(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Ljava/util/List;)V

    .line 87
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    .line 88
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "questionSurvey"

    const/4 v2, 0x1

    invoke-static {p3, v0, v1, v2}, Lo/dck;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I

    .line 89
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->createDBTable(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V

    .line 91
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    .line 92
    invoke-virtual {p0, p1, v5}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->insertDBTable(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;)J

    .line 93
    goto :goto_0

    .line 95
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->upgreadFlag:Z

    .line 96
    return-void
.end method
