.class public Lo/cqa;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqa$d;
    }
.end annotation


# static fields
.field private static d:Landroid/content/Context;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lo/cok;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cqa;->a:Ljava/lang/Object;

    .line 32
    sget-object v0, Lo/cqa;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cok;->b(Landroid/content/Context;)Lo/cok;

    move-result-object v0

    iput-object v0, p0, Lo/cqa;->b:Lo/cok;

    .line 33
    return-void
.end method

.method synthetic constructor <init>(Lo/cqa$5;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lo/cqa;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/cqa;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 44
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqa;->d:Landroid/content/Context;

    .line 45
    sget-object v0, Lo/cqa$d;->b:Lo/cqa;

    return-object v0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 7

    .line 84
    invoke-static {p1}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    const-string v0, "Debug_DeviceInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryDeviceInfoDataExist() deviceUUID = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    const/4 v0, 0x0

    return v0

    .line 88
    :cond_0
    iget-object v0, p0, Lo/cqa;->b:Lo/cok;

    invoke-direct {p0}, Lo/cqa;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lo/cqa;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cok;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 89
    invoke-static {v6}, Lo/cph;->z(Landroid/database/Cursor;)Z

    move-result v0

    return v0
.end method

.method private b(Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    .line 150
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-object v0
.end method

.method private c(Lcom/huawei/hihealth/HiDeviceInfo;)J
    .locals 5

    .line 76
    const-string v2, "device_unique_code =? "

    .line 77
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 78
    const-string v0, "model"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 80
    iget-object v0, p0, Lo/cqa;->b:Lo/cok;

    invoke-virtual {v0, v3, v2, v4}, Lo/cok;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method private c()Ljava/lang/String;
    .locals 1

    .line 146
    const-string v0, "device_unique_code =? "

    return-object v0
.end method

.method private e(Lcom/huawei/hihealth/HiDeviceInfo;)J
    .locals 6

    .line 64
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    :cond_0
    const-string v0, "Debug_DeviceInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateDeviceInfoData() deviceUUID = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    const-wide/16 v0, 0x0

    return-wide v0

    .line 68
    :cond_1
    invoke-static {p1}, Lo/cpi;->b(Lcom/huawei/hihealth/HiDeviceInfo;)Landroid/content/ContentValues;

    move-result-object v4

    .line 69
    const-string v0, "createTime"

    invoke-virtual {v4, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    .line 70
    iget-object v0, p0, Lo/cqa;->b:Lo/cok;

    invoke-direct {p0}, Lo/cqa;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lo/cqa;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4, v1, v2}, Lo/cok;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 71
    const-string v0, "Debug_DeviceInfoManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateDeviceInfoData() update  update = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    int-to-long v0, v5

    return-wide v0
.end method


# virtual methods
.method public a(ILandroid/content/ContentValues;)I
    .locals 5

    .line 154
    const-string v2, "_id =? "

    .line 155
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 156
    iget-object v0, p0, Lo/cqa;->b:Lo/cok;

    invoke-virtual {v0, p2, v2, v3}, Lo/cok;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    .line 157
    return v4
.end method

.method public a(Ljava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiDeviceInfo;>;"
        }
    .end annotation

    .line 137
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    .line 138
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 139
    new-array v8, v6, [Ljava/lang/String;

    .line 140
    const-string v0, "_id"

    move-object v1, p1

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 141
    iget-object v0, p0, Lo/cqa;->b:Lo/cok;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cok;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 142
    invoke-static {v9}, Lo/cph;->m(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/huawei/hihealth/HiDeviceInfo;)Z
    .locals 6

    .line 94
    iget-object v2, p0, Lo/cqa;->a:Ljava/lang/Object;

    monitor-enter v2

    .line 96
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cqa;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    invoke-direct {p0, p1}, Lo/cqa;->e(Lcom/huawei/hihealth/HiDeviceInfo;)J

    move-result-wide v3

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {p0, p1}, Lo/cqa;->b(Lcom/huawei/hihealth/HiDeviceInfo;)J

    move-result-wide v3

    .line 100
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-lez v0, :cond_1

    .line 101
    sget-object v0, Lo/cqa;->d:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cnt;->a(Landroid/content/Context;Lcom/huawei/hihealth/HiDeviceInfo;)V

    .line 104
    :cond_1
    :goto_0
    invoke-static {v3, v4}, Lo/cpn;->c(J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v2

    return v0

    .line 105
    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5
.end method

.method public b(Lcom/huawei/hihealth/HiDeviceInfo;)J
    .locals 5

    .line 49
    const-string v0, "Debug_DeviceInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertDeviceInfoData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    invoke-static {p1}, Lo/cpi;->b(Lcom/huawei/hihealth/HiDeviceInfo;)Landroid/content/ContentValues;

    move-result-object v4

    .line 51
    iget-object v0, p0, Lo/cqa;->b:Lo/cok;

    invoke-virtual {v0, v4}, Lo/cok;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public d(Ljava/lang/String;)I
    .locals 7

    .line 119
    const-string v0, "Debug_DeviceInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    invoke-static {p1}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    const-string v0, "Debug_DeviceInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceId() deviceUUID = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    const/4 v0, 0x0

    return v0

    .line 124
    :cond_0
    iget-object v0, p0, Lo/cqa;->b:Lo/cok;

    invoke-direct {p0}, Lo/cqa;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lo/cqa;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cok;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 125
    const-string v0, "_id"

    invoke-static {v6, v0}, Lo/cph;->g(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(I)Lcom/huawei/hihealth/HiDeviceInfo;
    .locals 9

    .line 130
    const-string v6, "_id =? "

    .line 131
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 132
    iget-object v0, p0, Lo/cqa;->b:Lo/cok;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cok;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 133
    invoke-static {v8}, Lo/cph;->l(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/huawei/hihealth/HiDeviceInfo;)Z
    .locals 5

    .line 109
    iget-object v1, p0, Lo/cqa;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 110
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cqa;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    invoke-direct {p0, p1}, Lo/cqa;->c(Lcom/huawei/hihealth/HiDeviceInfo;)J

    move-result-wide v2

    .line 112
    invoke-static {v2, v3}, Lo/cpn;->c(J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v1

    return v0

    .line 114
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 115
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public e(Ljava/lang/String;)Lcom/huawei/hihealth/HiDeviceInfo;
    .locals 7

    .line 55
    invoke-static {p1}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    const-string v0, "Debug_DeviceInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryDeviceInfoData() deviceUUID = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    const/4 v0, 0x0

    return-object v0

    .line 59
    :cond_0
    iget-object v0, p0, Lo/cqa;->b:Lo/cok;

    invoke-direct {p0}, Lo/cqa;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lo/cqa;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cok;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 60
    invoke-static {v6}, Lo/cph;->l(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v0

    return-object v0
.end method
