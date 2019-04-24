.class public Lcom/huawei/health/provider/HealthOpenProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# static fields
.field private static final b:Landroid/content/UriMatcher;


# instance fields
.field private c:Lo/alt;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 32
    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    sput-object v0, Lcom/huawei/health/provider/HealthOpenProvider;->b:Landroid/content/UriMatcher;

    .line 34
    sget-object v0, Lcom/huawei/health/provider/HealthOpenProvider;->b:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.healthcloud.health.provider"

    const-string v2, "authority"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    sget-object v0, Lcom/huawei/health/provider/HealthOpenProvider;->b:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.healthcloud.health.provider"

    const-string v2, "sport_statistics"

    const/16 v3, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 42
    sget-object v0, Lcom/huawei/health/provider/HealthOpenProvider;->b:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.healthcloud.health.provider"

    const-string v2, "sleep_statistics"

    const/16 v3, 0x7d1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 45
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/provider/HealthOpenProvider;->c:Lo/alt;

    return-void
.end method

.method private c(J[Landroid/content/ContentValues;)I
    .locals 1

    .line 185
    const/4 v0, 0x0

    return v0
.end method

.method private d(J[Landroid/content/ContentValues;)I
    .locals 1

    .line 197
    const/4 v0, 0x0

    return v0
.end method

.method private d()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 225
    const/4 v4, 0x0

    .line 226
    invoke-virtual {p0}, Lcom/huawei/health/provider/HealthOpenProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/alt;->c(Landroid/content/Context;)Lo/alt;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/provider/HealthOpenProvider;->c:Lo/alt;

    .line 227
    iget-object v0, p0, Lcom/huawei/health/provider/HealthOpenProvider;->c:Lo/alt;

    if-eqz v0, :cond_1

    .line 228
    iget-object v0, p0, Lcom/huawei/health/provider/HealthOpenProvider;->c:Lo/alt;

    invoke-virtual {v0}, Lo/alt;->b()Landroid/os/Bundle;

    move-result-object v5

    .line 229
    if-nez v5, :cond_0

    .line 230
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportDataDetail  bundle== null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    const/4 v0, 0x0

    return-object v0

    .line 234
    :cond_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 235
    const-string v0, "time"

    invoke-virtual {p0}, Lcom/huawei/health/provider/HealthOpenProvider;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    const-string v0, "step"

    const-string v1, "step"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    const-string v0, "distance"

    const-string v1, "distance"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    const-string v0, "carior"

    const-string v1, "carior"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    const-string v0, "floor"

    const-string v1, "floor"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    const-string v0, "duration"

    const-string v1, "duration"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    :cond_1
    return-object v4
.end method

.method private e()J
    .locals 2

    .line 173
    const-wide/16 v0, 0x0

    return-wide v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 5

    .line 215
    new-instance v2, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 216
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v3, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 217
    invoke-virtual {v3, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 218
    return-object v4
.end method

.method public bulkInsert(Landroid/net/Uri;[Landroid/content/ContentValues;)I
    .locals 9

    .line 131
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bulkInsert() uri = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert uri ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "/"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    const/4 v4, 0x0

    .line 135
    sget-object v0, Lcom/huawei/health/provider/HealthOpenProvider;->b:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v5

    .line 137
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 138
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "values == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return v4

    .line 142
    :cond_0
    const/4 v0, 0x0

    aget-object v0, p2, v0

    const-string v1, "app_id"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    .line 144
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_2

    .line 145
    :cond_1
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u65e0\u6548 appId "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    return v4

    .line 148
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/provider/HealthOpenProvider;->e()J

    move-result-wide v7

    .line 150
    if-ltz v5, :cond_3

    .line 151
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    .line 153
    :sswitch_0
    invoke-direct {p0, v7, v8, p2}, Lcom/huawei/health/provider/HealthOpenProvider;->c(J[Landroid/content/ContentValues;)I

    move-result v4

    .line 154
    goto :goto_0

    .line 157
    :sswitch_1
    invoke-direct {p0, v7, v8, p2}, Lcom/huawei/health/provider/HealthOpenProvider;->d(J[Landroid/content/ContentValues;)I

    move-result v4

    .line 158
    .line 166
    :cond_3
    :goto_0
    return v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 126
    const/4 v0, 0x0

    return v0
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .line 106
    const/4 v0, 0x0

    return-object v0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 6

    .line 111
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u66f4\u65b0 authority"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    const-string v0, "app_id"

    invoke-virtual {p2, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    .line 115
    const-string v0, "app_package_name"

    invoke-virtual {p2, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 117
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 118
    :cond_0
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null ==appId or appPackage\u53c2\u6570\u9519\u8bef"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    const/4 v0, 0x0

    return-object v0

    .line 121
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()Z
    .locals 1

    .line 50
    const/4 v0, 0x0

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 7

    .line 55
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "query"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    const/4 v4, 0x0

    .line 59
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 60
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u53c2\u6570\u9519\u8bef null == selection"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    return-object v4

    .line 63
    :cond_0
    sget-object v0, Lcom/huawei/health/provider/HealthOpenProvider;->b:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v5

    .line 66
    invoke-virtual {p0}, Lcom/huawei/health/provider/HealthOpenProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/provider/HealthOpenProvider;->getCallingPackage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/anj;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 67
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no AppAuthority  pathType ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    return-object v4

    .line 70
    :cond_1
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AppAuthority  is ok!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    if-ltz v5, :cond_3

    .line 72
    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_0

    .line 74
    :sswitch_0
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "query  GET_AUTHORITY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    new-instance v4, Lo/ang;

    invoke-direct {v4}, Lo/ang;-><init>()V

    .line 76
    goto :goto_0

    .line 79
    :sswitch_1
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "query  GET_SPORT_STATISTICS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    invoke-direct {p0}, Lcom/huawei/health/provider/HealthOpenProvider;->d()Ljava/util/Map;

    move-result-object v6

    .line 81
    new-instance v4, Lo/anm;

    invoke-direct {v4, v6}, Lo/anm;-><init>(Ljava/util/Map;)V

    .line 82
    goto :goto_0

    .line 85
    :sswitch_2
    const-string v0, "Step_HealthOpenProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "query  GET_SLEEP_STATISTICS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 88
    invoke-virtual {p0}, Lcom/huawei/health/provider/HealthOpenProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/alt;->c(Landroid/content/Context;)Lo/alt;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/provider/HealthOpenProvider;->c:Lo/alt;

    .line 89
    iget-object v0, p0, Lcom/huawei/health/provider/HealthOpenProvider;->c:Lo/alt;

    if-eqz v0, :cond_2

    .line 90
    iget-object v0, p0, Lcom/huawei/health/provider/HealthOpenProvider;->c:Lo/alt;

    invoke-virtual {v0, v6}, Lo/alt;->c(Ljava/util/Map;)V

    .line 92
    :cond_2
    new-instance v4, Lo/ann;

    invoke-direct {v4, v6}, Lo/ann;-><init>(Ljava/util/Map;)V

    .line 93
    .line 101
    :cond_3
    :goto_0
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x7d0 -> :sswitch_1
        0x7d1 -> :sswitch_2
    .end sparse-switch
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 206
    const/4 v0, 0x0

    return v0
.end method
