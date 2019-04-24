.class public Lo/duk;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/duk;

.field private static b:Landroid/content/Context;

.field private static e:Ljava/lang/String;


# instance fields
.field private c:I

.field private d:I

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const-string v0, "PLGACHIEVE_AchieveDBManager"

    sput-object v0, Lo/duk;->e:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 31
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lo/duk;->c:I

    .line 27
    const/16 v0, 0x64

    iput v0, p0, Lo/duk;->d:I

    .line 28
    const/16 v0, 0x69

    iput v0, p0, Lo/duk;->f:I

    .line 32
    const-string v0, "AchieveDBManager"

    const-string v1, "AchieveDBManager instructor"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Lo/duk;->a()V

    .line 34
    return-void
.end method

.method private a()V
    .locals 4

    .line 291
    const/16 v3, 0x6d

    .line 292
    invoke-direct {p0}, Lo/duk;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 293
    sget-object v0, Lo/duk;->e:Ljava/lang/String;

    const-string v1, "AchieveDB data is null!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    :cond_0
    sget-object v0, Lo/duk;->b:Landroid/content/Context;

    invoke-virtual {p0}, Lo/duk;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dcl;->e(Landroid/content/Context;Ljava/lang/String;)Lo/dcl;

    invoke-virtual {p0}, Lo/duk;->getModuleId()Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dcl;->c(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/duk;->c:I

    .line 297
    sget-object v0, Lo/duk;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "newDBVersion ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", oldDBVersion="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/duk;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    iget v0, p0, Lo/duk;->c:I

    iget v1, p0, Lo/duk;->d:I

    if-lt v0, v1, :cond_1

    iget v0, p0, Lo/duk;->c:I

    iget v1, p0, Lo/duk;->f:I

    if-gt v0, v1, :cond_1

    iget v0, p0, Lo/duk;->c:I

    if-le v3, v0, :cond_1

    .line 300
    invoke-direct {p0}, Lo/duk;->d()V

    .line 301
    invoke-virtual {p0}, Lo/duk;->b()V

    goto :goto_0

    .line 303
    :cond_1
    invoke-direct {p0}, Lo/duk;->d()V

    .line 305
    :goto_0
    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/duk;
    .locals 4

    .line 37
    if-eqz p0, :cond_0

    .line 38
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/duk;->b:Landroid/content/Context;

    goto :goto_0

    .line 40
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/duk;->b:Landroid/content/Context;

    .line 42
    :goto_0
    sget-object v0, Lo/duk;->a:Lo/duk;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 43
    const-class v2, Lo/duk;

    monitor-enter v2

    .line 44
    :try_start_0
    sget-object v0, Lo/duk;->a:Lo/duk;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 45
    new-instance v0, Lo/duk;

    sget-object v1, Lo/duk;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/duk;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/duk;->a:Lo/duk;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    :cond_1
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 49
    :cond_2
    :goto_1
    sget-object v0, Lo/duk;->a:Lo/duk;

    return-object v0
.end method

.method private d()V
    .locals 20

    .line 61
    const-string v0, "AchieveDBManager"

    const-string v1, "AchieveDBManager createTable"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const-string v4, "id integer primary key autoincrement, huid text not null,startDate text not null,endDate text not null,dataType integer not null,value text not null,stepsRanking text"

    .line 71
    const-string v0, "total_record"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, v4}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 74
    const-string v5, "id integer primary key autoincrement, huid text not null,dataType integer not null,value text not null,date text not null"

    .line 79
    const-string v0, "single_day_record"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, v5}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 82
    const-string v6, "id integer primary key autoincrement, huid text not null,recentType integer not null,firstDate text not null,endDate text not null,dataType integer not null,value text not null,reportNo integer not null,kakaNum integer not null,price integer not null,medal_id text,comments1_id text not null,commentS2_id text not null,stepsRanking text,distanceRanking text,minReportNo integer"

    .line 98
    const-string v0, "recent"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, v6}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 101
    const-string v7, "id integer primary key autoincrement, huid text not null,reach_days integer not null,points integer not null,medal_id text,userReachStandardDays text,syncTimestamp text not null"

    .line 108
    const-string v0, "achieve_info"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, v7}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 111
    const-string v8, "id integer primary key autoincrement, huid text not null,date timestamp not null,description integer not null,kaka_num integer not null,occurDate timestamp unique"

    .line 117
    const-string v0, "kaka_line"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, v8}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 119
    const-string v9, "id integer primary key autoincrement, huid text not null,medalID text not null,medalName text not null,timeStamp Long not null,veinUrl text not null"

    .line 125
    const-string v0, "medal_basic_record"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, v9}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 128
    const-string v10, "id integer primary key autoincrement, huid text not null,medalName text not null,medalID text not null,firstTabPriority integer not null,firstTabDesc text not null,secondTabPriority integer not null,secondTabDesc text not null,medalWeight integer not null,medalGainedTime text not null,gainedCount integer not null,timestamp Long not null"

    .line 140
    const-string v0, "medal_location_record"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, v10}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 143
    const-string v11, "id integer primary key autoincrement, huid text not null,medalName text not null,medalID text not null,medalType text not null,activityId integer not null,message text not null,grayDescription text not null,lightDescription text not null,grayDetailStyle text not null,lightDetailStyle text not null,grayPromotionName text not null,lightPromotionName text not null,grayPromotionUrl text not null,lightPromotionUrl text not null,grayListStyle text not null,lightListStyle text not null,shareImageUrl text not null,location text not null,actionType integer not null,goal integer not null,startTime text not null,endTime text not null,takeEffectTime text not null,isNewConfig integer not null,repeatable integer not null,medalLevel integer not null,medalLabel integer not null,medalUnit integer not null,timestamp Long not null,reachStatus integer not null,eventStatus integer not null"

    .line 175
    const-string v0, "medal_config_info_record"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, v11}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 179
    const-string v12, "id integer primary key autoincrement, huid text not null,medalID text not null,medalName text not null,eventType integer not null,value text not null,timeZone text not null,key text not null,keyType text not null,startTime text not null,endTime text not null,eventStatus text not null,timestamp Long not null"

    .line 192
    const-string v0, "medal_event_record"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, v12}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 195
    const-string v13, "id integer primary key autoincrement, huid text not null,taskId text not null,taskStatus text not null,taskName text not null,taskDes text not null,taskSpecification text not null,taskDetailUrl text not null,taskFrequency integer not null,taskRewardKaKa integer not null,taskRewardExperience integer not null,taskTypes integer not null,taskConditions text,eventTimeStamp Long not null,taskSyncTimeStamp Long not null,lastTimeStamp Long not null,taskStartTime Long not null,taskEndTime Long not null,taskPriority integer not null,taskIcon text not null,taskIsShow integer not null,taskSyncStatus integer not null,reservedField text"

    .line 221
    const-string v0, "kaka_task_record"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, v13}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 225
    const-string v14, "id integer primary key autoincrement, huid text not null,taskId text not null,rewardExperience integer not null,taskCount integer not null,lastModifyTime Long not null,taskSumCount integer not null,SyncTime Long not null,reservedField text"

    .line 234
    const-string v0, "level_event_record"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, v14}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 237
    const-string v15, "id integer primary key autoincrement, huid text not null,level integer not null,levelUserNumber integer not null,timeStamp Long not null,reservedField text"

    .line 243
    const-string v0, "level_number_record"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2, v15}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 246
    const-string v16, "id integer primary key autoincrement, huid text not null,userLevel integer not null,userExperience integer not null,userReachDays text not null,syncTimestamp Long not null,reservedField text"

    .line 253
    const-string v0, "level_info_record"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    move-object/from16 v3, v16

    invoke-virtual {v1, v0, v2, v3}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 256
    const-string v17, "id integer primary key autoincrement, huid text not null,value text not null,britishValue text,recentType integer not null,startTimestamp Long not null,endTimeStamp Long not null,dataSource integer not null,maxReportNo integer not null,minReportNo integer not null,reportNo integer not null,reservedField text"

    .line 268
    const-string v0, "week_and_month_record"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    move-object/from16 v3, v17

    invoke-virtual {v1, v0, v2, v3}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 271
    const-string v18, "id integer primary key autoincrement, rankType text not null,rankVersion Long,gender text not null,ageSegment text not null,insightRankItemList text"

    .line 277
    const-string v0, "insight_rank"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    move-object/from16 v3, v18

    invoke-virtual {v1, v0, v2, v3}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 280
    const-string v19, "id integer primary key autoincrement, huid text not null,type text not null,value text not null,key integer not null,year integer not null,reservedField text"

    .line 287
    const-string v0, "annual_info"

    move-object/from16 v1, p0

    const/4 v2, 0x1

    move-object/from16 v3, v19

    invoke-virtual {v1, v0, v2, v3}, Lo/duk;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 288
    return-void
.end method

.method private e()Z
    .locals 5

    .line 308
    const/4 v3, 0x1

    .line 309
    const-string v0, "medal_basic_record"

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lo/duk;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 310
    if-eqz v4, :cond_0

    .line 311
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 312
    const/4 v3, 0x0

    .line 314
    :cond_0
    return v3
.end method


# virtual methods
.method public b()V
    .locals 5

    .line 321
    sget-object v0, Lo/duk;->e:Ljava/lang/String;

    const-string v1, "Enter upgradeAchievementDB"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    const-string v0, "medal_basic_record"

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lo/duk;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 325
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 326
    sget-object v0, Lo/duk;->b:Landroid/content/Context;

    invoke-virtual {p0}, Lo/duk;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "medal_basic_record"

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/dck;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I

    .line 327
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 330
    :cond_0
    invoke-direct {p0}, Lo/duk;->d()V

    .line 332
    sget-object v0, Lo/duk;->e:Ljava/lang/String;

    const-string v1, "Leave upgradeAchievementDB"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 54
    const/16 v0, 0x4e23

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
