.class public Lo/dxd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dxd$a;
    }
.end annotation


# static fields
.field private static b:Ljava/lang/String;

.field private static volatile d:Lo/dwr;

.field private static volatile e:Lo/dxd;


# instance fields
.field private a:Landroid/content/Context;

.field private c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const-string v0, "PLGACHIEVE_InsightRankManager"

    sput-object v0, Lo/dxd;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dxd;->a:Landroid/content/Context;

    .line 55
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dxd;->c:Ljava/util/concurrent/ExecutorService;

    .line 56
    iget-object v0, p0, Lo/dxd;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dxd$1;

    invoke-direct {v1, p0}, Lo/dxd$1;-><init>(Lo/dxd;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 62
    return-void
.end method

.method public static b(Lorg/json/JSONObject;)D
    .locals 6

    .line 131
    const-wide/16 v2, 0x0

    .line 133
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 134
    const-wide/16 v0, 0x0

    return-wide v0

    .line 136
    :cond_0
    const-string v0, "distribution"

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 137
    const-string v0, ","

    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const-string v1, ")"

    invoke-virtual {v4, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 138
    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v2, v0

    .line 141
    goto :goto_0

    .line 139
    :catch_0
    move-exception v4

    .line 140
    sget-object v0, Lo/dxd;->b:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    :goto_0
    return-wide v2
.end method

.method public static c(Lorg/json/JSONObject;)D
    .locals 7

    .line 112
    const-wide/16 v2, 0x0

    .line 114
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 115
    const-wide/16 v0, 0x0

    return-wide v0

    .line 117
    :cond_0
    const-string v0, "distribution"

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 118
    const-string v0, ","

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 119
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    array-length v0, v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_2

    .line 120
    :cond_1
    const-wide/16 v0, 0x0

    return-wide v0

    .line 122
    :cond_2
    const/4 v0, 0x0

    :try_start_1
    aget-object v0, v5, v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 123
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-wide v0

    move-wide v2, v0

    .line 126
    goto :goto_0

    .line 124
    :catch_0
    move-exception v4

    .line 125
    sget-object v0, Lo/dxd;->b:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    :goto_0
    return-wide v2
.end method

.method public static d(Landroid/content/Context;)Lo/dxd;
    .locals 4

    .line 40
    sget-object v0, Lo/dxd;->e:Lo/dxd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 41
    const-class v2, Lo/dxd;

    monitor-enter v2

    .line 42
    :try_start_0
    sget-object v0, Lo/dxd;->e:Lo/dxd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 43
    new-instance v0, Lo/dxd;

    invoke-direct {v0, p0}, Lo/dxd;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dxd;->e:Lo/dxd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 47
    :cond_1
    :goto_0
    sget-object v0, Lo/dxd;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 48
    invoke-static {p0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    sput-object v0, Lo/dxd;->d:Lo/dwr;

    .line 50
    :cond_2
    sget-object v0, Lo/dxd;->e:Lo/dxd;

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;
    .locals 9

    .line 72
    new-instance v2, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct {v2}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 73
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 74
    const-string v0, "ageSegment"

    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    const-string v0, "gender"

    invoke-interface {v3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    const-string v0, "rankType"

    invoke-interface {v3, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v0, Lo/dxd;->d:Lo/dwr;

    const/16 v1, 0x15

    invoke-virtual {v0, v1, v3}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v4

    .line 78
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    instance-of v0, v4, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    if-nez v0, :cond_1

    .line 79
    :cond_0
    sget-object v0, Lo/dxd;->b:Ljava/lang/String;

    const-string v1, "insightRankRecord is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    return-object v2

    .line 82
    :cond_1
    move-object v2, v4

    check-cast v2, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    .line 83
    invoke-virtual {v2}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->b()Lorg/json/JSONArray;

    move-result-object v5

    .line 84
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 85
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 87
    const/4 v7, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 88
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 92
    :cond_2
    goto :goto_1

    .line 90
    :catch_0
    move-exception v7

    .line 91
    sget-object v0, Lo/dxd;->b:Ljava/lang/String;

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :goto_1
    new-instance v0, Lo/dxd$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/dxd$a;-><init>(Lo/dxd$1;)V

    invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 94
    new-instance v7, Lorg/json/JSONArray;

    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 95
    const/4 v8, 0x0

    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_3

    .line 96
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 95
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 98
    :cond_3
    invoke-virtual {v2, v7}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 100
    :cond_4
    return-object v2
.end method

.method public d()V
    .locals 210

    .line 146
    sget-object v0, Lo/dxd;->b:Ljava/lang/String;

    const-string v1, "init"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    :try_start_0
    new-instance v2, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct {v2}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 149
    const-string v0, "weeklySteps"

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 150
    const-string v0, "0"

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 151
    const-string v0, "(0,17]"

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 152
    new-instance v3, Lorg/json/JSONArray;

    const-string v0, "[{distribution:\'(0,10000)\',percentage:0.16543},{distribution:\'[10000,20000)\',percentage:0.18294},{distribution:\'[100000,110000)\',percentage:0.0085},{distribution:\'[110000,120000)\',percentage:0.005},{distribution:\'[120000,130000)\',percentage:0.00293},{distribution:\'[130000,140000)\',percentage:0.00203},{distribution:\'[140000,+)\',percentage:0.00349},{distribution:\'[20000,30000)\',percentage:0.17281},{distribution:\'[30000,40000)\',percentage:0.14547},{distribution:\'[40000,50000)\',percentage:0.11222},{distribution:\'[50000,60000)\',percentage:0.07844},{distribution:\'[60000,70000)\',percentage:0.05209},{distribution:\'[70000,80000)\',percentage:0.033},{distribution:\'[80000,90000)\',percentage:0.02191},{distribution:\'[90000,100000)\',percentage:0.01375}]"

    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 153
    invoke-virtual {v2, v3}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 154
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/dwn;->c(Lo/dvf;)Z

    .line 156
    new-instance v4, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct {v4}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 157
    const-string v0, "weeklySteps"

    invoke-virtual {v4, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 158
    const-string v0, "0"

    invoke-virtual {v4, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 159
    const-string v0, "[18,24]"

    invoke-virtual {v4, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 160
    new-instance v5, Lorg/json/JSONArray;

    const-string v0, "[{distribution:\'(0,10000)\',percentage:0.08097},{distribution:\'[10000,20000)\',percentage:0.12624},{distribution:\'[100000,110000)\',percentage:0.01311},{distribution:\'[110000,120000)\',percentage:0.00778},{distribution:\'[120000,130000)\',percentage:0.00486},{distribution:\'[130000,140000)\',percentage:0.00298},{distribution:\'[140000,+)\',percentage:0.00486},{distribution:\'[20000,30000)\',percentage:0.15388},{distribution:\'[30000,40000)\',percentage:0.16072},{distribution:\'[40000,50000)\',percentage:0.1422},{distribution:\'[50000,60000)\',percentage:0.11299},{distribution:\'[60000,70000)\',percentage:0.07997},{distribution:\'[70000,80000)\',percentage:0.05354},{distribution:\'[80000,90000)\',percentage:0.03453},{distribution:\'[90000,100000)\',percentage:0.02136}]"

    invoke-direct {v5, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 161
    invoke-virtual {v4, v5}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dwn;->c(Lo/dvf;)Z

    .line 164
    new-instance v6, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct {v6}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 165
    const-string v0, "weeklySteps"

    invoke-virtual {v6, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 166
    const-string v0, "0"

    invoke-virtual {v6, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 167
    const-string v0, "[25,29]"

    invoke-virtual {v6, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 168
    new-instance v7, Lorg/json/JSONArray;

    const-string v0, "[{distribution:\'(0,10000)\',percentage:0.07831},{distribution:\'[10000,20000)\',percentage:0.11913},{distribution:\'[100000,110000)\',percentage:0.01394},{distribution:\'[110000,120000)\',percentage:0.00852},{distribution:\'[120000,130000)\',percentage:0.00528},{distribution:\'[130000,140000)\',percentage:0.00324},{distribution:\'[140000,+)\',percentage:0.006},{distribution:\'[20000,30000)\',percentage:0.15055},{distribution:\'[30000,40000)\',percentage:0.16055},{distribution:\'[40000,50000)\',percentage:0.14442},{distribution:\'[50000,60000)\',percentage:0.11499},{distribution:\'[60000,70000)\',percentage:0.0814},{distribution:\'[70000,80000)\',percentage:0.0554},{distribution:\'[80000,90000)\',percentage:0.03569},{distribution:\'[90000,100000)\',percentage:0.02257}]"

    invoke-direct {v7, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 169
    invoke-virtual {v6, v7}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 170
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/dwn;->c(Lo/dvf;)Z

    .line 172
    new-instance v8, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct {v8}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 173
    const-string v0, "weeklySteps"

    invoke-virtual {v8, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 174
    const-string v0, "0"

    invoke-virtual {v8, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 175
    const-string v0, "[30,34]"

    invoke-virtual {v8, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 176
    new-instance v9, Lorg/json/JSONArray;

    const-string v0, "[{distribution:\'(0,10000)\',percentage:0.05997},{distribution:\'[10000,20000)\',percentage:0.10653},{distribution:\'[100000,110000)\',percentage:0.01299},{distribution:\'[110000,120000)\',percentage:0.00744},{distribution:\'[120000,130000)\',percentage:0.00463},{distribution:\'[130000,140000)\',percentage:0.00281},{distribution:\'[140000,+)\',percentage:0.00566},{distribution:\'[20000,30000)\',percentage:0.15495},{distribution:\'[30000,40000)\',percentage:0.17106},{distribution:\'[40000,50000)\',percentage:0.15714},{distribution:\'[50000,60000)\',percentage:0.12174},{distribution:\'[60000,70000)\',percentage:0.08443},{distribution:\'[70000,80000)\',percentage:0.05545},{distribution:\'[80000,90000)\',percentage:0.0348},{distribution:\'[90000,100000)\',percentage:0.02041}]"

    invoke-direct {v9, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 177
    invoke-virtual {v8, v9}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 178
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/dwn;->c(Lo/dvf;)Z

    .line 180
    new-instance v10, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct {v10}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 181
    const-string v0, "weeklySteps"

    invoke-virtual {v10, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 182
    const-string v0, "0"

    invoke-virtual {v10, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 183
    const-string v0, "[35,39]"

    invoke-virtual {v10, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 184
    new-instance v11, Lorg/json/JSONArray;

    const-string v0, "[{distribution:\'(0,10000)\',percentage:0.04942},{distribution:\'[10000,20000)\',percentage:0.09093},{distribution:\'[100000,110000)\',percentage:0.01713},{distribution:\'[110000,120000)\',percentage:0.0103},{distribution:\'[120000,130000)\',percentage:0.00646},{distribution:\'[130000,140000)\',percentage:0.00386},{distribution:\'[140000,+)\',percentage:0.00736},{distribution:\'[20000,30000)\',percentage:0.1381},{distribution:\'[30000,40000)\',percentage:0.16229},{distribution:\'[40000,50000)\',percentage:0.15586},{distribution:\'[50000,60000)\',percentage:0.12846},{distribution:\'[60000,70000)\',percentage:0.09467},{distribution:\'[70000,80000)\',percentage:0.06498},{distribution:\'[80000,90000)\',percentage:0.04405},{distribution:\'[90000,100000)\',percentage:0.02614}]"

    invoke-direct {v11, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 185
    invoke-virtual {v10, v11}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 186
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/dwn;->c(Lo/dvf;)Z

    .line 188
    new-instance v12, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct {v12}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 189
    const-string v0, "weeklySteps"

    invoke-virtual {v12, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 190
    const-string v0, "0"

    invoke-virtual {v12, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 191
    const-string v0, "[40,44]"

    invoke-virtual {v12, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 192
    new-instance v13, Lorg/json/JSONArray;

    const-string v0, "[{distribution:\'(0,10000)\',percentage:0.04143},{distribution:\'[10000,20000)\',percentage:0.07969},{distribution:\'[100000,110000)\',percentage:0.02342},{distribution:\'[110000,120000)\',percentage:0.01529},{distribution:\'[120000,130000)\',percentage:0.00943},{distribution:\'[130000,140000)\',percentage:0.00607},{distribution:\'[140000,+)\',percentage:0.01087},{distribution:\'[20000,30000)\',percentage:0.12365},{distribution:\'[30000,40000)\',percentage:0.14695},{distribution:\'[40000,50000)\',percentage:0.14933},{distribution:\'[50000,60000)\',percentage:0.12654},{distribution:\'[60000,70000)\',percentage:0.10069},{distribution:\'[70000,80000)\',percentage:0.07549},{distribution:\'[80000,90000)\',percentage:0.05467},{distribution:\'[90000,100000)\',percentage:0.03647}]"

    invoke-direct {v13, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 193
    invoke-virtual {v12, v13}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 194
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v12}, Lo/dwn;->c(Lo/dvf;)Z

    .line 196
    new-instance v14, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct {v14}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 197
    const-string v0, "weeklySteps"

    invoke-virtual {v14, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 198
    const-string v0, "0"

    invoke-virtual {v14, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 199
    const-string v0, "[45,49]"

    invoke-virtual {v14, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 200
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.04804},{distribution:\'[10000,20000)\',percentage:0.07961},{distribution:\'[100000,110000)\',percentage:0.02714},{distribution:\'[110000,120000)\',percentage:0.01797},{distribution:\'[120000,130000)\',percentage:0.01204},{distribution:\'[130000,140000)\',percentage:0.0078},{distribution:\'[140000,+)\',percentage:0.01412},{distribution:\'[20000,30000)\',percentage:0.11564},{distribution:\'[30000,40000)\',percentage:0.13671},{distribution:\'[40000,50000)\',percentage:0.13721},{distribution:\'[50000,60000)\',percentage:0.1227},{distribution:\'[60000,70000)\',percentage:0.10226},{distribution:\'[70000,80000)\',percentage:0.07911},{distribution:\'[80000,90000)\',percentage:0.05928},{distribution:\'[90000,100000)\',percentage:0.04036}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object v15, v0

    .line 201
    invoke-virtual {v14, v15}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 202
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v14}, Lo/dwn;->c(Lo/dvf;)Z

    .line 204
    new-instance v16, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 205
    const-string v0, "weeklySteps"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 206
    const-string v0, "0"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 207
    const-string v0, "[50,54]"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 208
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.06126},{distribution:\'[10000,20000)\',percentage:0.08719},{distribution:\'[100000,110000)\',percentage:0.02694},{distribution:\'[110000,120000)\',percentage:0.0177},{distribution:\'[120000,130000)\',percentage:0.01121},{distribution:\'[130000,140000)\',percentage:0.00836},{distribution:\'[140000,+)\',percentage:0.01465},{distribution:\'[20000,30000)\',percentage:0.11716},{distribution:\'[30000,40000)\',percentage:0.13455},{distribution:\'[40000,50000)\',percentage:0.13106},{distribution:\'[50000,60000)\',percentage:0.11703},{distribution:\'[60000,70000)\',percentage:0.0969},{distribution:\'[70000,80000)\',percentage:0.0767},{distribution:\'[80000,90000)\',percentage:0.05896},{distribution:\'[90000,100000)\',percentage:0.04033}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v0

    .line 209
    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 210
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 212
    new-instance v18, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v18 .. v18}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 213
    const-string v0, "weeklySteps"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 214
    const-string v0, "0"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 215
    const-string v0, "[55,59]"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 216
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.0743},{distribution:\'[10000,20000)\',percentage:0.09893},{distribution:\'[100000,110000)\',percentage:0.02678},{distribution:\'[110000,120000)\',percentage:0.01708},{distribution:\'[120000,130000)\',percentage:0.01134},{distribution:\'[130000,140000)\',percentage:0.00809},{distribution:\'[140000,+)\',percentage:0.01449},{distribution:\'[20000,30000)\',percentage:0.12163},{distribution:\'[30000,40000)\',percentage:0.13079},{distribution:\'[40000,50000)\',percentage:0.12773},{distribution:\'[50000,60000)\',percentage:0.1094},{distribution:\'[60000,70000)\',percentage:0.09263},{distribution:\'[70000,80000)\',percentage:0.0759},{distribution:\'[80000,90000)\',percentage:0.05502},{distribution:\'[90000,100000)\',percentage:0.03588}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v19, v0

    .line 217
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 218
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 220
    new-instance v20, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v20 .. v20}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 221
    const-string v0, "weeklySteps"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 222
    const-string v0, "0"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 223
    const-string v0, "[60,64]"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 224
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.09278},{distribution:\'[10000,20000)\',percentage:0.10717},{distribution:\'[100000,110000)\',percentage:0.02575},{distribution:\'[110000,120000)\',percentage:0.0165},{distribution:\'[120000,130000)\',percentage:0.01136},{distribution:\'[130000,140000)\',percentage:0.00753},{distribution:\'[140000,+)\',percentage:0.01454},{distribution:\'[20000,30000)\',percentage:0.12527},{distribution:\'[30000,40000)\',percentage:0.13101},{distribution:\'[40000,50000)\',percentage:0.12056},{distribution:\'[50000,60000)\',percentage:0.10418},{distribution:\'[60000,70000)\',percentage:0.08489},{distribution:\'[70000,80000)\',percentage:0.06857},{distribution:\'[80000,90000)\',percentage:0.05232},{distribution:\'[90000,100000)\',percentage:0.03757}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v21, v0

    .line 225
    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 226
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 228
    new-instance v22, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v22 .. v22}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 229
    const-string v0, "weeklySteps"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 230
    const-string v0, "0"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 231
    const-string v0, "[65,69]"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 232
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.11167},{distribution:\'[10000,20000)\',percentage:0.11609},{distribution:\'[100000,110000)\',percentage:0.02256},{distribution:\'[110000,120000)\',percentage:0.01421},{distribution:\'[120000,130000)\',percentage:0.00931},{distribution:\'[130000,140000)\',percentage:0.00704},{distribution:\'[140000,+)\',percentage:0.01241},{distribution:\'[20000,30000)\',percentage:0.13418},{distribution:\'[30000,40000)\',percentage:0.12851},{distribution:\'[40000,50000)\',percentage:0.11794},{distribution:\'[50000,60000)\',percentage:0.10386},{distribution:\'[60000,70000)\',percentage:0.0801},{distribution:\'[70000,80000)\',percentage:0.06345},{distribution:\'[80000,90000)\',percentage:0.04787},{distribution:\'[90000,100000)\',percentage:0.0308}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v23, v0

    .line 233
    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 234
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 236
    new-instance v24, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v24 .. v24}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 237
    const-string v0, "weeklySteps"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 238
    const-string v0, "0"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 239
    const-string v0, "[70,74]"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 240
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.14665},{distribution:\'[10000,20000)\',percentage:0.13381},{distribution:\'[100000,110000)\',percentage:0.01684},{distribution:\'[110000,120000)\',percentage:0.01152},{distribution:\'[120000,130000)\',percentage:0.00753},{distribution:\'[130000,140000)\',percentage:0.00384},{distribution:\'[140000,+)\',percentage:0.00665},{distribution:\'[20000,30000)\',percentage:0.14075},{distribution:\'[30000,40000)\',percentage:0.13425},{distribution:\'[40000,50000)\',percentage:0.118},{distribution:\'[50000,60000)\',percentage:0.08669},{distribution:\'[60000,70000)\',percentage:0.06749},{distribution:\'[70000,80000)\',percentage:0.0514},{distribution:\'[80000,90000)\',percentage:0.0418},{distribution:\'[90000,100000)\',percentage:0.03279}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v25, v0

    .line 241
    move-object/from16 v0, v24

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 242
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 244
    new-instance v26, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v26 .. v26}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 245
    const-string v0, "weeklySteps"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 246
    const-string v0, "0"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 247
    const-string v0, "[75,+)"

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 248
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.18581},{distribution:\'[10000,20000)\',percentage:0.15212},{distribution:\'[100000,110000)\',percentage:0.01222},{distribution:\'[110000,120000)\',percentage:0.00815},{distribution:\'[120000,130000)\',percentage:0.00439},{distribution:\'[130000,140000)\',percentage:0.00345},{distribution:\'[140000,+)\',percentage:0.00392},{distribution:\'[20000,30000)\',percentage:0.14648},{distribution:\'[30000,40000)\',percentage:0.13395},{distribution:\'[40000,50000)\',percentage:0.10841},{distribution:\'[50000,60000)\',percentage:0.07959},{distribution:\'[60000,70000)\',percentage:0.0647},{distribution:\'[70000,80000)\',percentage:0.047},{distribution:\'[80000,90000)\',percentage:0.03024},{distribution:\'[90000,100000)\',percentage:0.01958}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v27, v0

    .line 249
    move-object/from16 v0, v26

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 250
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 252
    new-instance v28, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v28 .. v28}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 253
    const-string v0, "weeklySteps"

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 254
    const-string v0, "1"

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 255
    const-string v0, "(0,17]"

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 256
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.13412},{distribution:\'[10000,20000)\',percentage:0.14501},{distribution:\'[100000,110000)\',percentage:0.01732},{distribution:\'[110000,120000)\',percentage:0.01178},{distribution:\'[120000,130000)\',percentage:0.00866},{distribution:\'[130000,140000)\',percentage:0.00571},{distribution:\'[140000,+)\',percentage:0.01314},{distribution:\'[20000,30000)\',percentage:0.14771},{distribution:\'[30000,40000)\',percentage:0.13571},{distribution:\'[40000,50000)\',percentage:0.11325},{distribution:\'[50000,60000)\',percentage:0.0897},{distribution:\'[60000,70000)\',percentage:0.06773},{distribution:\'[70000,80000)\',percentage:0.04894},{distribution:\'[80000,90000)\',percentage:0.03588},{distribution:\'[90000,100000)\',percentage:0.02534}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v29, v0

    .line 257
    move-object/from16 v0, v28

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 258
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 260
    new-instance v30, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v30 .. v30}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 261
    const-string v0, "weeklySteps"

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 262
    const-string v0, "1"

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 263
    const-string v0, "[18,24]"

    move-object/from16 v1, v30

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 264
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.05333},{distribution:\'[10000,20000)\',percentage:0.07437},{distribution:\'[100000,110000)\',percentage:0.03329},{distribution:\'[110000,120000)\',percentage:0.02356},{distribution:\'[120000,130000)\',percentage:0.01678},{distribution:\'[130000,140000)\',percentage:0.01151},{distribution:\'[140000,+)\',percentage:0.02538},{distribution:\'[20000,30000)\',percentage:0.10066},{distribution:\'[30000,40000)\',percentage:0.12054},{distribution:\'[40000,50000)\',percentage:0.12729},{distribution:\'[50000,60000)\',percentage:0.11931},{distribution:\'[60000,70000)\',percentage:0.10251},{distribution:\'[70000,80000)\',percentage:0.08213},{distribution:\'[80000,90000)\',percentage:0.06285},{distribution:\'[90000,100000)\',percentage:0.0465}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v31, v0

    .line 265
    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 266
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 268
    new-instance v32, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v32 .. v32}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 269
    const-string v0, "weeklySteps"

    move-object/from16 v1, v32

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 270
    const-string v0, "1"

    move-object/from16 v1, v32

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 271
    const-string v0, "[25,29]"

    move-object/from16 v1, v32

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 272
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.04523},{distribution:\'[10000,20000)\',percentage:0.05932},{distribution:\'[100000,110000)\',percentage:0.0331},{distribution:\'[110000,120000)\',percentage:0.02272},{distribution:\'[120000,130000)\',percentage:0.01506},{distribution:\'[130000,140000)\',percentage:0.00993},{distribution:\'[140000,+)\',percentage:0.02059},{distribution:\'[20000,30000)\',percentage:0.08644},{distribution:\'[30000,40000)\',percentage:0.11698},{distribution:\'[40000,50000)\',percentage:0.13526},{distribution:\'[50000,60000)\',percentage:0.13308},{distribution:\'[60000,70000)\',percentage:0.11505},{distribution:\'[70000,80000)\',percentage:0.09109},{distribution:\'[80000,90000)\',percentage:0.06772},{distribution:\'[90000,100000)\',percentage:0.04843}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v33, v0

    .line 273
    move-object/from16 v0, v32

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 274
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 276
    new-instance v34, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v34 .. v34}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 277
    const-string v0, "weeklySteps"

    move-object/from16 v1, v34

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 278
    const-string v0, "1"

    move-object/from16 v1, v34

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 279
    const-string v0, "[30,34]"

    move-object/from16 v1, v34

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 280
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.02937},{distribution:\'[10000,20000)\',percentage:0.04045},{distribution:\'[100000,110000)\',percentage:0.03358},{distribution:\'[110000,120000)\',percentage:0.02223},{distribution:\'[120000,130000)\',percentage:0.01445},{distribution:\'[130000,140000)\',percentage:0.00956},{distribution:\'[140000,+)\',percentage:0.0183},{distribution:\'[20000,30000)\',percentage:0.07119},{distribution:\'[30000,40000)\',percentage:0.11401},{distribution:\'[40000,50000)\',percentage:0.14444},{distribution:\'[50000,60000)\',percentage:0.14875},{distribution:\'[60000,70000)\',percentage:0.1296},{distribution:\'[70000,80000)\',percentage:0.10087},{distribution:\'[80000,90000)\',percentage:0.0731},{distribution:\'[90000,100000)\',percentage:0.0501}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v35, v0

    .line 281
    move-object/from16 v0, v34

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 282
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 284
    new-instance v36, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v36 .. v36}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 285
    const-string v0, "weeklySteps"

    move-object/from16 v1, v36

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 286
    const-string v0, "1"

    move-object/from16 v1, v36

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 287
    const-string v0, "[35,39]"

    move-object/from16 v1, v36

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 288
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.02806},{distribution:\'[10000,20000)\',percentage:0.04004},{distribution:\'[100000,110000)\',percentage:0.03397},{distribution:\'[110000,120000)\',percentage:0.0227},{distribution:\'[120000,130000)\',percentage:0.01457},{distribution:\'[130000,140000)\',percentage:0.00947},{distribution:\'[140000,+)\',percentage:0.0175},{distribution:\'[20000,30000)\',percentage:0.07127},{distribution:\'[30000,40000)\',percentage:0.11334},{distribution:\'[40000,50000)\',percentage:0.14455},{distribution:\'[50000,60000)\',percentage:0.14856},{distribution:\'[60000,70000)\',percentage:0.12985},{distribution:\'[70000,80000)\',percentage:0.10143},{distribution:\'[80000,90000)\',percentage:0.0736},{distribution:\'[90000,100000)\',percentage:0.0511}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v37, v0

    .line 289
    move-object/from16 v0, v36

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 290
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 292
    new-instance v38, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v38 .. v38}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 293
    const-string v0, "weeklySteps"

    move-object/from16 v1, v38

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 294
    const-string v0, "1"

    move-object/from16 v1, v38

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 295
    const-string v0, "[40,44]"

    move-object/from16 v1, v38

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 296
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.02674},{distribution:\'[10000,20000)\',percentage:0.04018},{distribution:\'[100000,110000)\',percentage:0.03804},{distribution:\'[110000,120000)\',percentage:0.02554},{distribution:\'[120000,130000)\',percentage:0.01709},{distribution:\'[130000,140000)\',percentage:0.01106},{distribution:\'[140000,+)\',percentage:0.02158},{distribution:\'[20000,30000)\',percentage:0.0713},{distribution:\'[30000,40000)\',percentage:0.11135},{distribution:\'[40000,50000)\',percentage:0.1374},{distribution:\'[50000,60000)\',percentage:0.14112},{distribution:\'[60000,70000)\',percentage:0.12579},{distribution:\'[70000,80000)\',percentage:0.10146},{distribution:\'[80000,90000)\',percentage:0.07618},{distribution:\'[90000,100000)\',percentage:0.05519}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v39, v0

    .line 297
    move-object/from16 v0, v38

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 298
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v38

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 300
    new-instance v40, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v40 .. v40}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 301
    const-string v0, "weeklySteps"

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 302
    const-string v0, "1"

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 303
    const-string v0, "[45,49]"

    move-object/from16 v1, v40

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 304
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.02824},{distribution:\'[10000,20000)\',percentage:0.04255},{distribution:\'[100000,110000)\',percentage:0.04166},{distribution:\'[110000,120000)\',percentage:0.02885},{distribution:\'[120000,130000)\',percentage:0.02002},{distribution:\'[130000,140000)\',percentage:0.01354},{distribution:\'[140000,+)\',percentage:0.02693},{distribution:\'[20000,30000)\',percentage:0.0738},{distribution:\'[30000,40000)\',percentage:0.10974},{distribution:\'[40000,50000)\',percentage:0.12922},{distribution:\'[50000,60000)\',percentage:0.13109},{distribution:\'[60000,70000)\',percentage:0.11807},{distribution:\'[70000,80000)\',percentage:0.09892},{distribution:\'[80000,90000)\',percentage:0.07871},{distribution:\'[90000,100000)\',percentage:0.05867}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v41, v0

    .line 305
    move-object/from16 v0, v40

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 306
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 308
    new-instance v42, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v42 .. v42}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 309
    const-string v0, "weeklySteps"

    move-object/from16 v1, v42

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 310
    const-string v0, "1"

    move-object/from16 v1, v42

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 311
    const-string v0, "[50,54]"

    move-object/from16 v1, v42

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 312
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.0317},{distribution:\'[10000,20000)\',percentage:0.04692},{distribution:\'[100000,110000)\',percentage:0.0432},{distribution:\'[110000,120000)\',percentage:0.03187},{distribution:\'[120000,130000)\',percentage:0.02176},{distribution:\'[130000,140000)\',percentage:0.01532},{distribution:\'[140000,+)\',percentage:0.03205},{distribution:\'[20000,30000)\',percentage:0.07626},{distribution:\'[30000,40000)\',percentage:0.10615},{distribution:\'[40000,50000)\',percentage:0.1242},{distribution:\'[50000,60000)\',percentage:0.12255},{distribution:\'[60000,70000)\',percentage:0.11292},{distribution:\'[70000,80000)\',percentage:0.0967},{distribution:\'[80000,90000)\',percentage:0.07871},{distribution:\'[90000,100000)\',percentage:0.0597}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v43, v0

    .line 313
    move-object/from16 v0, v42

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 314
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v42

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 316
    new-instance v44, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v44 .. v44}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 317
    const-string v0, "weeklySteps"

    move-object/from16 v1, v44

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 318
    const-string v0, "1"

    move-object/from16 v1, v44

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 319
    const-string v0, "[55,59]"

    move-object/from16 v1, v44

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 320
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.03726},{distribution:\'[10000,20000)\',percentage:0.05345},{distribution:\'[100000,110000)\',percentage:0.04343},{distribution:\'[110000,120000)\',percentage:0.03132},{distribution:\'[120000,130000)\',percentage:0.02186},{distribution:\'[130000,140000)\',percentage:0.01579},{distribution:\'[140000,+)\',percentage:0.03526},{distribution:\'[20000,30000)\',percentage:0.08128},{distribution:\'[30000,40000)\',percentage:0.10524},{distribution:\'[40000,50000)\',percentage:0.11717},{distribution:\'[50000,60000)\',percentage:0.11681},{distribution:\'[60000,70000)\',percentage:0.10739},{distribution:\'[70000,80000)\',percentage:0.09422},{distribution:\'[80000,90000)\',percentage:0.07841},{distribution:\'[90000,100000)\',percentage:0.0611}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v45, v0

    .line 321
    move-object/from16 v0, v44

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 322
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v44

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 324
    new-instance v46, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v46 .. v46}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 325
    const-string v0, "weeklySteps"

    move-object/from16 v1, v46

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 326
    const-string v0, "1"

    move-object/from16 v1, v46

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 327
    const-string v0, "[60,64]"

    move-object/from16 v1, v46

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 328
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.05004},{distribution:\'[10000,20000)\',percentage:0.06486},{distribution:\'[100000,110000)\',percentage:0.04399},{distribution:\'[110000,120000)\',percentage:0.03226},{distribution:\'[120000,130000)\',percentage:0.0235},{distribution:\'[130000,140000)\',percentage:0.01748},{distribution:\'[140000,+)\',percentage:0.0393},{distribution:\'[20000,30000)\',percentage:0.08708},{distribution:\'[30000,40000)\',percentage:0.10151},{distribution:\'[40000,50000)\',percentage:0.10922},{distribution:\'[50000,60000)\',percentage:0.10502},{distribution:\'[60000,70000)\',percentage:0.09805},{distribution:\'[70000,80000)\',percentage:0.09069},{distribution:\'[80000,90000)\',percentage:0.07696},{distribution:\'[90000,100000)\',percentage:0.06006}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v47, v0

    .line 329
    move-object/from16 v0, v46

    move-object/from16 v1, v47

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 330
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 332
    new-instance v48, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v48 .. v48}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 333
    const-string v0, "weeklySteps"

    move-object/from16 v1, v48

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 334
    const-string v0, "1"

    move-object/from16 v1, v48

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 335
    const-string v0, "[65,69]"

    move-object/from16 v1, v48

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 336
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.06818},{distribution:\'[10000,20000)\',percentage:0.08118},{distribution:\'[100000,110000)\',percentage:0.04125},{distribution:\'[110000,120000)\',percentage:0.02924},{distribution:\'[120000,130000)\',percentage:0.02045},{distribution:\'[130000,140000)\',percentage:0.01417},{distribution:\'[140000,+)\',percentage:0.03224},{distribution:\'[20000,30000)\',percentage:0.09555},{distribution:\'[30000,40000)\',percentage:0.10685},{distribution:\'[40000,50000)\',percentage:0.10546},{distribution:\'[50000,60000)\',percentage:0.10053},{distribution:\'[60000,70000)\',percentage:0.09284},{distribution:\'[70000,80000)\',percentage:0.08257},{distribution:\'[80000,90000)\',percentage:0.0729},{distribution:\'[90000,100000)\',percentage:0.05659}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v49, v0

    .line 337
    move-object/from16 v0, v48

    move-object/from16 v1, v49

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 338
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v48

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 340
    new-instance v50, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v50 .. v50}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 341
    const-string v0, "weeklySteps"

    move-object/from16 v1, v50

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 342
    const-string v0, "1"

    move-object/from16 v1, v50

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 343
    const-string v0, "[70,74]"

    move-object/from16 v1, v50

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 344
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.09878},{distribution:\'[10000,20000)\',percentage:0.09566},{distribution:\'[100000,110000)\',percentage:0.0351},{distribution:\'[110000,120000)\',percentage:0.02256},{distribution:\'[120000,130000)\',percentage:0.01725},{distribution:\'[130000,140000)\',percentage:0.01084},{distribution:\'[140000,+)\',percentage:0.02344},{distribution:\'[20000,30000)\',percentage:0.11149},{distribution:\'[30000,40000)\',percentage:0.10897},{distribution:\'[40000,50000)\',percentage:0.10552},{distribution:\'[50000,60000)\',percentage:0.09878},{distribution:\'[60000,70000)\',percentage:0.08373},{distribution:\'[70000,80000)\',percentage:0.07535},{distribution:\'[80000,90000)\',percentage:0.06429},{distribution:\'[90000,100000)\',percentage:0.04824}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v51, v0

    .line 345
    move-object/from16 v0, v50

    move-object/from16 v1, v51

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 346
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v50

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 348
    new-instance v52, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v52 .. v52}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 349
    const-string v0, "weeklySteps"

    move-object/from16 v1, v52

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 350
    const-string v0, "1"

    move-object/from16 v1, v52

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 351
    const-string v0, "[75,+)"

    move-object/from16 v1, v52

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 352
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,10000)\',percentage:0.13503},{distribution:\'[10000,20000)\',percentage:0.10848},{distribution:\'[100000,110000)\',percentage:0.02473},{distribution:\'[110000,120000)\',percentage:0.01723},{distribution:\'[120000,130000)\',percentage:0.01202},{distribution:\'[130000,140000)\',percentage:0.00828},{distribution:\'[140000,+)\',percentage:0.0151},{distribution:\'[20000,30000)\',percentage:0.11499},{distribution:\'[30000,40000)\',percentage:0.11962},{distribution:\'[40000,50000)\',percentage:0.11519},{distribution:\'[50000,60000)\',percentage:0.09672},{distribution:\'[60000,70000)\',percentage:0.0798},{distribution:\'[70000,80000)\',percentage:0.06387},{distribution:\'[80000,90000)\',percentage:0.05388},{distribution:\'[90000,100000)\',percentage:0.03508}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v53, v0

    .line 353
    move-object/from16 v0, v52

    move-object/from16 v1, v53

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 354
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v52

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 356
    new-instance v54, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v54 .. v54}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 357
    const-string v0, "monthlySteps"

    move-object/from16 v1, v54

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 358
    const-string v0, "0"

    move-object/from16 v1, v54

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 359
    const-string v0, "(0,17]"

    move-object/from16 v1, v54

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 360
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.15361},{distribution:\'[120000,160000)\',percentage:0.15639},{distribution:\'[160000,200000)\',percentage:0.12146},{distribution:\'[200000,240000)\',percentage:0.08422},{distribution:\'[240000,280000)\',percentage:0.05368},{distribution:\'[280000,320000)\',percentage:0.03239},{distribution:\'[320000,360000)\',percentage:0.01881},{distribution:\'[360000,400000)\',percentage:0.01107},{distribution:\'[40000,80000)\',percentage:0.17154},{distribution:\'[400000,440000)\',percentage:0.00722},{distribution:\'[440000,480000)\',percentage:0.00427},{distribution:\'[480000,520000)\',percentage:0.00235},{distribution:\'[520000,560000)\',percentage:0.00173},{distribution:\'[560000,600000)\',percentage:9.5E-4},{distribution:\'[600000,+)\',percentage:0.00192},{distribution:\'[80000,120000)\',percentage:0.17837}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v55, v0

    .line 361
    move-object/from16 v0, v54

    move-object/from16 v1, v55

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 362
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v54

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 364
    new-instance v56, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v56 .. v56}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 365
    const-string v0, "monthlySteps"

    move-object/from16 v1, v56

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 366
    const-string v0, "0"

    move-object/from16 v1, v56

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 367
    const-string v0, "[18,24]"

    move-object/from16 v1, v56

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 368
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.06865},{distribution:\'[120000,160000)\',percentage:0.1571},{distribution:\'[160000,200000)\',percentage:0.15897},{distribution:\'[200000,240000)\',percentage:0.13603},{distribution:\'[240000,280000)\',percentage:0.09939},{distribution:\'[280000,320000)\',percentage:0.06488},{distribution:\'[320000,360000)\',percentage:0.03894},{distribution:\'[360000,400000)\',percentage:0.02221},{distribution:\'[40000,80000)\',percentage:0.09263},{distribution:\'[400000,440000)\',percentage:0.0124},{distribution:\'[440000,480000)\',percentage:0.00711},{distribution:\'[480000,520000)\',percentage:0.0041},{distribution:\'[520000,560000)\',percentage:0.00244},{distribution:\'[560000,600000)\',percentage:0.00147},{distribution:\'[600000,+)\',percentage:0.00256},{distribution:\'[80000,120000)\',percentage:0.13112}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v57, v0

    .line 369
    move-object/from16 v0, v56

    move-object/from16 v1, v57

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 370
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v56

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 372
    new-instance v58, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v58 .. v58}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 373
    const-string v0, "monthlySteps"

    move-object/from16 v1, v58

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 374
    const-string v0, "0"

    move-object/from16 v1, v58

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 375
    const-string v0, "[25,29]"

    move-object/from16 v1, v58

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 376
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.08807},{distribution:\'[120000,160000)\',percentage:0.14912},{distribution:\'[160000,200000)\',percentage:0.14612},{distribution:\'[200000,240000)\',percentage:0.1235},{distribution:\'[240000,280000)\',percentage:0.09263},{distribution:\'[280000,320000)\',percentage:0.06183},{distribution:\'[320000,360000)\',percentage:0.03949},{distribution:\'[360000,400000)\',percentage:0.02435},{distribution:\'[40000,80000)\',percentage:0.10342},{distribution:\'[400000,440000)\',percentage:0.01443},{distribution:\'[440000,480000)\',percentage:0.0088},{distribution:\'[480000,520000)\',percentage:0.00534},{distribution:\'[520000,560000)\',percentage:0.00319},{distribution:\'[560000,600000)\',percentage:0.00205},{distribution:\'[600000,+)\',percentage:0.00414},{distribution:\'[80000,120000)\',percentage:0.13351}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v59, v0

    .line 377
    move-object/from16 v0, v58

    move-object/from16 v1, v59

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 378
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v58

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 380
    new-instance v60, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v60 .. v60}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 381
    const-string v0, "monthlySteps"

    move-object/from16 v1, v60

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 382
    const-string v0, "0"

    move-object/from16 v1, v60

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 383
    const-string v0, "[30,34]"

    move-object/from16 v1, v60

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 384
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.08081},{distribution:\'[120000,160000)\',percentage:0.15393},{distribution:\'[160000,200000)\',percentage:0.15787},{distribution:\'[200000,240000)\',percentage:0.13321},{distribution:\'[240000,280000)\',percentage:0.09737},{distribution:\'[280000,320000)\',percentage:0.06352},{distribution:\'[320000,360000)\',percentage:0.03883},{distribution:\'[360000,400000)\',percentage:0.0229},{distribution:\'[40000,80000)\',percentage:0.09024},{distribution:\'[400000,440000)\',percentage:0.01374},{distribution:\'[440000,480000)\',percentage:0.00806},{distribution:\'[480000,520000)\',percentage:0.00502},{distribution:\'[520000,560000)\',percentage:0.00297},{distribution:\'[560000,600000)\',percentage:0.0019},{distribution:\'[600000,+)\',percentage:0.00387},{distribution:\'[80000,120000)\',percentage:0.12576}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v61, v0

    .line 385
    move-object/from16 v0, v60

    move-object/from16 v1, v61

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 386
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v60

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 388
    new-instance v62, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v62 .. v62}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 389
    const-string v0, "monthlySteps"

    move-object/from16 v1, v62

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 390
    const-string v0, "0"

    move-object/from16 v1, v62

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 391
    const-string v0, "[35,39]"

    move-object/from16 v1, v62

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 392
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.07144},{distribution:\'[120000,160000)\',percentage:0.14085},{distribution:\'[160000,200000)\',percentage:0.1526},{distribution:\'[200000,240000)\',percentage:0.13961},{distribution:\'[240000,280000)\',percentage:0.10752},{distribution:\'[280000,320000)\',percentage:0.0749},{distribution:\'[320000,360000)\',percentage:0.04908},{distribution:\'[360000,400000)\',percentage:0.03024},{distribution:\'[40000,80000)\',percentage:0.07637},{distribution:\'[400000,440000)\',percentage:0.01813},{distribution:\'[440000,480000)\',percentage:0.01078},{distribution:\'[480000,520000)\',percentage:0.00693},{distribution:\'[520000,560000)\',percentage:0.00416},{distribution:\'[560000,600000)\',percentage:0.00268},{distribution:\'[600000,+)\',percentage:0.00497},{distribution:\'[80000,120000)\',percentage:0.10974}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v63, v0

    .line 393
    move-object/from16 v0, v62

    move-object/from16 v1, v63

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 394
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v62

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 396
    new-instance v64, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v64 .. v64}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 397
    const-string v0, "monthlySteps"

    move-object/from16 v1, v64

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 398
    const-string v0, "0"

    move-object/from16 v1, v64

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 399
    const-string v0, "[40,44]"

    move-object/from16 v1, v64

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 400
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.06415},{distribution:\'[120000,160000)\',percentage:0.126},{distribution:\'[160000,200000)\',percentage:0.14067},{distribution:\'[200000,240000)\',percentage:0.13494},{distribution:\'[240000,280000)\',percentage:0.11242},{distribution:\'[280000,320000)\',percentage:0.08273},{distribution:\'[320000,360000)\',percentage:0.05971},{distribution:\'[360000,400000)\',percentage:0.04055},{distribution:\'[40000,80000)\',percentage:0.06869},{distribution:\'[400000,440000)\',percentage:0.02659},{distribution:\'[440000,480000)\',percentage:0.01674},{distribution:\'[480000,520000)\',percentage:0.01036},{distribution:\'[520000,560000)\',percentage:0.00645},{distribution:\'[560000,600000)\',percentage:0.00423},{distribution:\'[600000,+)\',percentage:0.00846},{distribution:\'[80000,120000)\',percentage:0.09732}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v65, v0

    .line 401
    move-object/from16 v0, v64

    move-object/from16 v1, v65

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 402
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v64

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 404
    new-instance v66, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v66 .. v66}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 405
    const-string v0, "monthlySteps"

    move-object/from16 v1, v66

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 406
    const-string v0, "0"

    move-object/from16 v1, v66

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 407
    const-string v0, "[45,49]"

    move-object/from16 v1, v66

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 408
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.06824},{distribution:\'[120000,160000)\',percentage:0.11931},{distribution:\'[160000,200000)\',percentage:0.1308},{distribution:\'[200000,240000)\',percentage:0.12378},{distribution:\'[240000,280000)\',percentage:0.10739},{distribution:\'[280000,320000)\',percentage:0.08497},{distribution:\'[320000,360000)\',percentage:0.06507},{distribution:\'[360000,400000)\',percentage:0.04538},{distribution:\'[40000,80000)\',percentage:0.06986},{distribution:\'[400000,440000)\',percentage:0.03091},{distribution:\'[440000,480000)\',percentage:0.02026},{distribution:\'[480000,520000)\',percentage:0.01335},{distribution:\'[520000,560000)\',percentage:0.00899},{distribution:\'[560000,600000)\',percentage:0.00614},{distribution:\'[600000,+)\',percentage:0.01155},{distribution:\'[80000,120000)\',percentage:0.09399}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v67, v0

    .line 409
    move-object/from16 v0, v66

    move-object/from16 v1, v67

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 410
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v66

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 412
    new-instance v68, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v68 .. v68}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 413
    const-string v0, "monthlySteps"

    move-object/from16 v1, v68

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 414
    const-string v0, "0"

    move-object/from16 v1, v68

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 415
    const-string v0, "[50,54]"

    move-object/from16 v1, v68

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 416
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.08036},{distribution:\'[120000,160000)\',percentage:0.11623},{distribution:\'[160000,200000)\',percentage:0.12614},{distribution:\'[200000,240000)\',percentage:0.11672},{distribution:\'[240000,280000)\',percentage:0.10403},{distribution:\'[280000,320000)\',percentage:0.08041},{distribution:\'[320000,360000)\',percentage:0.06222},{distribution:\'[360000,400000)\',percentage:0.04387},{distribution:\'[40000,80000)\',percentage:0.07871},{distribution:\'[400000,440000)\',percentage:0.03237},{distribution:\'[440000,480000)\',percentage:0.02061},{distribution:\'[480000,520000)\',percentage:0.0138},{distribution:\'[520000,560000)\',percentage:0.00865},{distribution:\'[560000,600000)\',percentage:0.00607},{distribution:\'[600000,+)\',percentage:0.01218},{distribution:\'[80000,120000)\',percentage:0.09765}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v69, v0

    .line 417
    move-object/from16 v0, v68

    move-object/from16 v1, v69

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 418
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v68

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 420
    new-instance v70, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v70 .. v70}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 421
    const-string v0, "monthlySteps"

    move-object/from16 v1, v70

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 422
    const-string v0, "0"

    move-object/from16 v1, v70

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 423
    const-string v0, "[55,59]"

    move-object/from16 v1, v70

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 424
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.0939},{distribution:\'[120000,160000)\',percentage:0.12001},{distribution:\'[160000,200000)\',percentage:0.12298},{distribution:\'[200000,240000)\',percentage:0.11187},{distribution:\'[240000,280000)\',percentage:0.09498},{distribution:\'[280000,320000)\',percentage:0.07533},{distribution:\'[320000,360000)\',percentage:0.05658},{distribution:\'[360000,400000)\',percentage:0.04261},{distribution:\'[40000,80000)\',percentage:0.08703},{distribution:\'[400000,440000)\',percentage:0.02908},{distribution:\'[440000,480000)\',percentage:0.01949},{distribution:\'[480000,520000)\',percentage:0.0136},{distribution:\'[520000,560000)\',percentage:0.00955},{distribution:\'[560000,600000)\',percentage:0.00646},{distribution:\'[600000,+)\',percentage:0.01258},{distribution:\'[80000,120000)\',percentage:0.10394}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v71, v0

    .line 425
    move-object/from16 v0, v70

    move-object/from16 v1, v71

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 426
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v70

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 428
    new-instance v72, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v72 .. v72}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 429
    const-string v0, "monthlySteps"

    move-object/from16 v1, v72

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 430
    const-string v0, "0"

    move-object/from16 v1, v72

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 431
    const-string v0, "[60,64]"

    move-object/from16 v1, v72

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 432
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.11207},{distribution:\'[120000,160000)\',percentage:0.12063},{distribution:\'[160000,200000)\',percentage:0.11857},{distribution:\'[200000,240000)\',percentage:0.10436},{distribution:\'[240000,280000)\',percentage:0.08483},{distribution:\'[280000,320000)\',percentage:0.06935},{distribution:\'[320000,360000)\',percentage:0.05222},{distribution:\'[360000,400000)\',percentage:0.04049},{distribution:\'[40000,80000)\',percentage:0.09406},{distribution:\'[400000,440000)\',percentage:0.0271},{distribution:\'[440000,480000)\',percentage:0.01961},{distribution:\'[480000,520000)\',percentage:0.01427},{distribution:\'[520000,560000)\',percentage:0.00826},{distribution:\'[560000,600000)\',percentage:0.00661},{distribution:\'[600000,+)\',percentage:0.01314},{distribution:\'[80000,120000)\',percentage:0.11444}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v73, v0

    .line 433
    move-object/from16 v0, v72

    move-object/from16 v1, v73

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 434
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v72

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 436
    new-instance v74, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v74 .. v74}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 437
    const-string v0, "monthlySteps"

    move-object/from16 v1, v74

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 438
    const-string v0, "0"

    move-object/from16 v1, v74

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 439
    const-string v0, "[65,69]"

    move-object/from16 v1, v74

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 440
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.12793},{distribution:\'[120000,160000)\',percentage:0.12326},{distribution:\'[160000,200000)\',percentage:0.1155},{distribution:\'[200000,240000)\',percentage:0.10187},{distribution:\'[240000,280000)\',percentage:0.08373},{distribution:\'[280000,320000)\',percentage:0.06185},{distribution:\'[320000,360000)\',percentage:0.05186},{distribution:\'[360000,400000)\',percentage:0.03454},{distribution:\'[40000,80000)\',percentage:0.10893},{distribution:\'[400000,440000)\',percentage:0.02492},{distribution:\'[440000,480000)\',percentage:0.01461},{distribution:\'[480000,520000)\',percentage:0.01184},{distribution:\'[520000,560000)\',percentage:0.00668},{distribution:\'[560000,600000)\',percentage:0.00543},{distribution:\'[600000,+)\',percentage:0.01075},{distribution:\'[80000,120000)\',percentage:0.11631}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v75, v0

    .line 441
    move-object/from16 v0, v74

    move-object/from16 v1, v75

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 442
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v74

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 444
    new-instance v76, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v76 .. v76}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 445
    const-string v0, "monthlySteps"

    move-object/from16 v1, v76

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 446
    const-string v0, "0"

    move-object/from16 v1, v76

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 447
    const-string v0, "[70,74]"

    move-object/from16 v1, v76

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 448
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.15804},{distribution:\'[120000,160000)\',percentage:0.1292},{distribution:\'[160000,200000)\',percentage:0.11319},{distribution:\'[200000,240000)\',percentage:0.09423},{distribution:\'[240000,280000)\',percentage:0.06861},{distribution:\'[280000,320000)\',percentage:0.05206},{distribution:\'[320000,360000)\',percentage:0.04058},{distribution:\'[360000,400000)\',percentage:0.02963},{distribution:\'[40000,80000)\',percentage:0.12694},{distribution:\'[400000,440000)\',percentage:0.01975},{distribution:\'[440000,480000)\',percentage:0.01442},{distribution:\'[480000,520000)\',percentage:0.00854},{distribution:\'[520000,560000)\',percentage:0.00494},{distribution:\'[560000,600000)\',percentage:0.00374},{distribution:\'[600000,+)\',percentage:0.00654},{distribution:\'[80000,120000)\',percentage:0.1296}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v77, v0

    .line 449
    move-object/from16 v0, v76

    move-object/from16 v1, v77

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 450
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v76

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 452
    new-instance v78, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v78 .. v78}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 453
    const-string v0, "monthlySteps"

    move-object/from16 v1, v78

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 454
    const-string v0, "0"

    move-object/from16 v1, v78

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 455
    const-string v0, "[75,+)"

    move-object/from16 v1, v78

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 456
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.20689},{distribution:\'[120000,160000)\',percentage:0.1257},{distribution:\'[160000,200000)\',percentage:0.11203},{distribution:\'[200000,240000)\',percentage:0.07617},{distribution:\'[240000,280000)\',percentage:0.06585},{distribution:\'[280000,320000)\',percentage:0.04464},{distribution:\'[320000,360000)\',percentage:0.03432},{distribution:\'[360000,400000)\',percentage:0.01925},{distribution:\'[40000,80000)\',percentage:0.14216},{distribution:\'[400000,440000)\',percentage:0.01325},{distribution:\'[440000,480000)\',percentage:0.00725},{distribution:\'[480000,520000)\',percentage:0.00586},{distribution:\'[520000,560000)\',percentage:0.00419},{distribution:\'[560000,600000)\',percentage:0.00181},{distribution:\'[600000,+)\',percentage:0.00349},{distribution:\'[80000,120000)\',percentage:0.13714}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v79, v0

    .line 457
    move-object/from16 v0, v78

    move-object/from16 v1, v79

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 458
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v78

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 460
    new-instance v80, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v80 .. v80}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 461
    const-string v0, "monthlySteps"

    move-object/from16 v1, v80

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 462
    const-string v0, "1"

    move-object/from16 v1, v80

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 463
    const-string v0, "(0,17]"

    move-object/from16 v1, v80

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 464
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.13221},{distribution:\'[120000,160000)\',percentage:0.13728},{distribution:\'[160000,200000)\',percentage:0.11928},{distribution:\'[200000,240000)\',percentage:0.09545},{distribution:\'[240000,280000)\',percentage:0.0727},{distribution:\'[280000,320000)\',percentage:0.05118},{distribution:\'[320000,360000)\',percentage:0.03407},{distribution:\'[360000,400000)\',percentage:0.02394},{distribution:\'[40000,80000)\',percentage:0.13797},{distribution:\'[400000,440000)\',percentage:0.0161},{distribution:\'[440000,480000)\',percentage:0.01127},{distribution:\'[480000,520000)\',percentage:0.00726},{distribution:\'[520000,560000)\',percentage:0.00483},{distribution:\'[560000,600000)\',percentage:0.00362},{distribution:\'[600000,+)\',percentage:0.00812},{distribution:\'[80000,120000)\',percentage:0.14473}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v81, v0

    .line 465
    move-object/from16 v0, v80

    move-object/from16 v1, v81

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 466
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v80

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 468
    new-instance v82, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v82 .. v82}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 469
    const-string v0, "monthlySteps"

    move-object/from16 v1, v82

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 470
    const-string v0, "1"

    move-object/from16 v1, v82

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 471
    const-string v0, "[18,24]"

    move-object/from16 v1, v82

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 472
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.06052},{distribution:\'[120000,160000)\',percentage:0.1046},{distribution:\'[160000,200000)\',percentage:0.12191},{distribution:\'[200000,240000)\',percentage:0.12466},{distribution:\'[240000,280000)\',percentage:0.11351},{distribution:\'[280000,320000)\',percentage:0.09387},{distribution:\'[320000,360000)\',percentage:0.07176},{distribution:\'[360000,400000)\',percentage:0.05164},{distribution:\'[40000,80000)\',percentage:0.06144},{distribution:\'[400000,440000)\',percentage:0.03661},{distribution:\'[440000,480000)\',percentage:0.02478},{distribution:\'[480000,520000)\',percentage:0.01706},{distribution:\'[520000,560000)\',percentage:0.01165},{distribution:\'[560000,600000)\',percentage:0.00783},{distribution:\'[600000,+)\',percentage:0.01692},{distribution:\'[80000,120000)\',percentage:0.08125}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v83, v0

    .line 473
    move-object/from16 v0, v82

    move-object/from16 v1, v83

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 474
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v82

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 476
    new-instance v84, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v84 .. v84}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 477
    const-string v0, "monthlySteps"

    move-object/from16 v1, v84

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 478
    const-string v0, "1"

    move-object/from16 v1, v84

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 479
    const-string v0, "[25,29]"

    move-object/from16 v1, v84

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 480
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.06537},{distribution:\'[120000,160000)\',percentage:0.09651},{distribution:\'[160000,200000)\',percentage:0.11743},{distribution:\'[200000,240000)\',percentage:0.12717},{distribution:\'[240000,280000)\',percentage:0.11893},{distribution:\'[280000,320000)\',percentage:0.09838},{distribution:\'[320000,360000)\',percentage:0.07509},{distribution:\'[360000,400000)\',percentage:0.05362},{distribution:\'[40000,80000)\',percentage:0.06057},{distribution:\'[400000,440000)\',percentage:0.03707},{distribution:\'[440000,480000)\',percentage:0.02502},{distribution:\'[480000,520000)\',percentage:0.01658},{distribution:\'[520000,560000)\',percentage:0.01098},{distribution:\'[560000,600000)\',percentage:0.00726},{distribution:\'[600000,+)\',percentage:0.0152},{distribution:\'[80000,120000)\',percentage:0.07483}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v85, v0

    .line 481
    move-object/from16 v0, v84

    move-object/from16 v1, v85

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 482
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v84

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 484
    new-instance v86, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v86 .. v86}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 485
    const-string v0, "monthlySteps"

    move-object/from16 v1, v86

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 486
    const-string v0, "1"

    move-object/from16 v1, v86

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 487
    const-string v0, "[30,34]"

    move-object/from16 v1, v86

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 488
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.0549},{distribution:\'[120000,160000)\',percentage:0.08605},{distribution:\'[160000,200000)\',percentage:0.1183},{distribution:\'[200000,240000)\',percentage:0.13872},{distribution:\'[240000,280000)\',percentage:0.13566},{distribution:\'[280000,320000)\',percentage:0.11201},{distribution:\'[320000,360000)\',percentage:0.08322},{distribution:\'[360000,400000)\',percentage:0.05746},{distribution:\'[40000,80000)\',percentage:0.04392},{distribution:\'[400000,440000)\',percentage:0.03855},{distribution:\'[440000,480000)\',percentage:0.02535},{distribution:\'[480000,520000)\',percentage:0.01629},{distribution:\'[520000,560000)\',percentage:0.01068},{distribution:\'[560000,600000)\',percentage:0.00691},{distribution:\'[600000,+)\',percentage:0.01391},{distribution:\'[80000,120000)\',percentage:0.05806}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v87, v0

    .line 489
    move-object/from16 v0, v86

    move-object/from16 v1, v87

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 490
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v86

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 492
    new-instance v88, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v88 .. v88}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 493
    const-string v0, "monthlySteps"

    move-object/from16 v1, v88

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 494
    const-string v0, "1"

    move-object/from16 v1, v88

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 495
    const-string v0, "[35,39]"

    move-object/from16 v1, v88

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 496
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.05524},{distribution:\'[120000,160000)\',percentage:0.08519},{distribution:\'[160000,200000)\',percentage:0.1175},{distribution:\'[200000,240000)\',percentage:0.13805},{distribution:\'[240000,280000)\',percentage:0.13428},{distribution:\'[280000,320000)\',percentage:0.1129},{distribution:\'[320000,360000)\',percentage:0.08369},{distribution:\'[360000,400000)\',percentage:0.05899},{distribution:\'[40000,80000)\',percentage:0.04398},{distribution:\'[400000,440000)\',percentage:0.03939},{distribution:\'[440000,480000)\',percentage:0.02558},{distribution:\'[480000,520000)\',percentage:0.01637},{distribution:\'[520000,560000)\',percentage:0.01074},{distribution:\'[560000,600000)\',percentage:0.00683},{distribution:\'[600000,+)\',percentage:0.01325},{distribution:\'[80000,120000)\',percentage:0.05801}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v89, v0

    .line 497
    move-object/from16 v0, v88

    move-object/from16 v1, v89

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 498
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v88

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 500
    new-instance v90, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v90 .. v90}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 501
    const-string v0, "monthlySteps"

    move-object/from16 v1, v90

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 502
    const-string v0, "1"

    move-object/from16 v1, v90

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 503
    const-string v0, "[40,44]"

    move-object/from16 v1, v90

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 504
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.05381},{distribution:\'[120000,160000)\',percentage:0.08418},{distribution:\'[160000,200000)\',percentage:0.11387},{distribution:\'[200000,240000)\',percentage:0.13104},{distribution:\'[240000,280000)\',percentage:0.12856},{distribution:\'[280000,320000)\',percentage:0.10967},{distribution:\'[320000,360000)\',percentage:0.08491},{distribution:\'[360000,400000)\',percentage:0.06284},{distribution:\'[40000,80000)\',percentage:0.04356},{distribution:\'[400000,440000)\',percentage:0.04337},{distribution:\'[440000,480000)\',percentage:0.02899},{distribution:\'[480000,520000)\',percentage:0.01953},{distribution:\'[520000,560000)\',percentage:0.01269},{distribution:\'[560000,600000)\',percentage:0.00847},{distribution:\'[600000,+)\',percentage:0.01677},{distribution:\'[80000,120000)\',percentage:0.05773}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v91, v0

    .line 505
    move-object/from16 v0, v90

    move-object/from16 v1, v91

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 506
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v90

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 508
    new-instance v92, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v92 .. v92}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 509
    const-string v0, "monthlySteps"

    move-object/from16 v1, v92

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 510
    const-string v0, "1"

    move-object/from16 v1, v92

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 511
    const-string v0, "[45,49]"

    move-object/from16 v1, v92

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 512
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.05466},{distribution:\'[120000,160000)\',percentage:0.0854},{distribution:\'[160000,200000)\',percentage:0.1101},{distribution:\'[200000,240000)\',percentage:0.12229},{distribution:\'[240000,280000)\',percentage:0.11744},{distribution:\'[280000,320000)\',percentage:0.1035},{distribution:\'[320000,360000)\',percentage:0.08402},{distribution:\'[360000,400000)\',percentage:0.06441},{distribution:\'[40000,80000)\',percentage:0.0452},{distribution:\'[400000,440000)\',percentage:0.04771},{distribution:\'[440000,480000)\',percentage:0.0332},{distribution:\'[480000,520000)\',percentage:0.02275},{distribution:\'[520000,560000)\',percentage:0.01582},{distribution:\'[560000,600000)\',percentage:0.01072},{distribution:\'[600000,+)\',percentage:0.02264},{distribution:\'[80000,120000)\',percentage:0.06014}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v93, v0

    .line 513
    move-object/from16 v0, v92

    move-object/from16 v1, v93

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 514
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v92

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 516
    new-instance v94, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v94 .. v94}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 517
    const-string v0, "monthlySteps"

    move-object/from16 v1, v94

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 518
    const-string v0, "1"

    move-object/from16 v1, v94

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 519
    const-string v0, "[50,54]"

    move-object/from16 v1, v94

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 520
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.05741},{distribution:\'[120000,160000)\',percentage:0.08568},{distribution:\'[160000,200000)\',percentage:0.1062},{distribution:\'[200000,240000)\',percentage:0.11459},{distribution:\'[240000,280000)\',percentage:0.11103},{distribution:\'[280000,320000)\',percentage:0.09757},{distribution:\'[320000,360000)\',percentage:0.082},{distribution:\'[360000,400000)\',percentage:0.06595},{distribution:\'[40000,80000)\',percentage:0.04757},{distribution:\'[400000,440000)\',percentage:0.04846},{distribution:\'[440000,480000)\',percentage:0.03562},{distribution:\'[480000,520000)\',percentage:0.02547},{distribution:\'[520000,560000)\',percentage:0.01841},{distribution:\'[560000,600000)\',percentage:0.01259},{distribution:\'[600000,+)\',percentage:0.02876},{distribution:\'[80000,120000)\',percentage:0.0627}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v95, v0

    .line 521
    move-object/from16 v0, v94

    move-object/from16 v1, v95

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 522
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v94

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 524
    new-instance v96, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v96 .. v96}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 525
    const-string v0, "monthlySteps"

    move-object/from16 v1, v96

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 526
    const-string v0, "1"

    move-object/from16 v1, v96

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 527
    const-string v0, "[55,59]"

    move-object/from16 v1, v96

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 528
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.0631},{distribution:\'[120000,160000)\',percentage:0.08899},{distribution:\'[160000,200000)\',percentage:0.10358},{distribution:\'[200000,240000)\',percentage:0.10783},{distribution:\'[240000,280000)\',percentage:0.10427},{distribution:\'[280000,320000)\',percentage:0.09232},{distribution:\'[320000,360000)\',percentage:0.0803},{distribution:\'[360000,400000)\',percentage:0.06478},{distribution:\'[40000,80000)\',percentage:0.05188},{distribution:\'[400000,440000)\',percentage:0.04942},{distribution:\'[440000,480000)\',percentage:0.03602},{distribution:\'[480000,520000)\',percentage:0.02625},{distribution:\'[520000,560000)\',percentage:0.01824},{distribution:\'[560000,600000)\',percentage:0.01285},{distribution:\'[600000,+)\',percentage:0.03303},{distribution:\'[80000,120000)\',percentage:0.06716}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v97, v0

    .line 529
    move-object/from16 v0, v96

    move-object/from16 v1, v97

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 530
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v96

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 532
    new-instance v98, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v98 .. v98}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 533
    const-string v0, "monthlySteps"

    move-object/from16 v1, v98

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 534
    const-string v0, "1"

    move-object/from16 v1, v98

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 535
    const-string v0, "[60,64]"

    move-object/from16 v1, v98

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 536
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.07128},{distribution:\'[120000,160000)\',percentage:0.08912},{distribution:\'[160000,200000)\',percentage:0.09994},{distribution:\'[200000,240000)\',percentage:0.10085},{distribution:\'[240000,280000)\',percentage:0.0947},{distribution:\'[280000,320000)\',percentage:0.08491},{distribution:\'[320000,360000)\',percentage:0.07645},{distribution:\'[360000,400000)\',percentage:0.06277},{distribution:\'[40000,80000)\',percentage:0.06021},{distribution:\'[400000,440000)\',percentage:0.04847},{distribution:\'[440000,480000)\',percentage:0.03714},{distribution:\'[480000,520000)\',percentage:0.02693},{distribution:\'[520000,560000)\',percentage:0.02056},{distribution:\'[560000,600000)\',percentage:0.01454},{distribution:\'[600000,+)\',percentage:0.03687},{distribution:\'[80000,120000)\',percentage:0.07525}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v99, v0

    .line 537
    move-object/from16 v0, v98

    move-object/from16 v1, v99

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 538
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v98

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 540
    new-instance v100, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v100 .. v100}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 541
    const-string v0, "monthlySteps"

    move-object/from16 v1, v100

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 542
    const-string v0, "1"

    move-object/from16 v1, v100

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 543
    const-string v0, "[65,69]"

    move-object/from16 v1, v100

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 544
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.08738},{distribution:\'[120000,160000)\',percentage:0.09546},{distribution:\'[160000,200000)\',percentage:0.10292},{distribution:\'[200000,240000)\',percentage:0.09685},{distribution:\'[240000,280000)\',percentage:0.08779},{distribution:\'[280000,320000)\',percentage:0.08019},{distribution:\'[320000,360000)\',percentage:0.06868},{distribution:\'[360000,400000)\',percentage:0.05977},{distribution:\'[40000,80000)\',percentage:0.07211},{distribution:\'[400000,440000)\',percentage:0.0447},{distribution:\'[440000,480000)\',percentage:0.0353},{distribution:\'[480000,520000)\',percentage:0.02453},{distribution:\'[520000,560000)\',percentage:0.01858},{distribution:\'[560000,600000)\',percentage:0.01203},{distribution:\'[600000,+)\',percentage:0.02975},{distribution:\'[80000,120000)\',percentage:0.08394}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v101, v0

    .line 545
    move-object/from16 v0, v100

    move-object/from16 v1, v101

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 546
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v100

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 548
    new-instance v102, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v102 .. v102}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 549
    const-string v0, "monthlySteps"

    move-object/from16 v1, v102

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 550
    const-string v0, "1"

    move-object/from16 v1, v102

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 551
    const-string v0, "[70,74]"

    move-object/from16 v1, v102

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 552
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.11235},{distribution:\'[120000,160000)\',percentage:0.10344},{distribution:\'[160000,200000)\',percentage:0.10445},{distribution:\'[200000,240000)\',percentage:0.08929},{distribution:\'[240000,280000)\',percentage:0.08093},{distribution:\'[280000,320000)\',percentage:0.07358},{distribution:\'[320000,360000)\',percentage:0.0635},{distribution:\'[360000,400000)\',percentage:0.05137},{distribution:\'[40000,80000)\',percentage:0.09019},{distribution:\'[400000,440000)\',percentage:0.03807},{distribution:\'[440000,480000)\',percentage:0.02674},{distribution:\'[480000,520000)\',percentage:0.01899},{distribution:\'[520000,560000)\',percentage:0.01405},{distribution:\'[560000,600000)\',percentage:0.00982},{distribution:\'[600000,+)\',percentage:0.02145},{distribution:\'[80000,120000)\',percentage:0.10178}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v103, v0

    .line 553
    move-object/from16 v0, v102

    move-object/from16 v1, v103

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 554
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v102

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 556
    new-instance v104, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v104 .. v104}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 557
    const-string v0, "monthlySteps"

    move-object/from16 v1, v104

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 558
    const-string v0, "1"

    move-object/from16 v1, v104

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 559
    const-string v0, "[75,+)"

    move-object/from16 v1, v104

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 560
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,40000)\',percentage:0.15564},{distribution:\'[120000,160000)\',percentage:0.10843},{distribution:\'[160000,200000)\',percentage:0.10335},{distribution:\'[200000,240000)\',percentage:0.09809},{distribution:\'[240000,280000)\',percentage:0.0782},{distribution:\'[280000,320000)\',percentage:0.06451},{distribution:\'[320000,360000)\',percentage:0.0528},{distribution:\'[360000,400000)\',percentage:0.03766},{distribution:\'[40000,80000)\',percentage:0.10773},{distribution:\'[400000,440000)\',percentage:0.02624},{distribution:\'[440000,480000)\',percentage:0.01918},{distribution:\'[480000,520000)\',percentage:0.01331},{distribution:\'[520000,560000)\',percentage:0.00837},{distribution:\'[560000,600000)\',percentage:0.00696},{distribution:\'[600000,+)\',percentage:0.0126},{distribution:\'[80000,120000)\',percentage:0.10693}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v105, v0

    .line 561
    move-object/from16 v0, v104

    move-object/from16 v1, v105

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 562
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v104

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 564
    new-instance v106, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v106 .. v106}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 565
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v106

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 566
    const-string v0, "0"

    move-object/from16 v1, v106

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 567
    const-string v0, "(0,17]"

    move-object/from16 v1, v106

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 568
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.42121},{distribution:\'[10,15)\',percentage:0.0581},{distribution:\'[15,20)\',percentage:0.02832},{distribution:\'[2,4)\',percentage:0.21714},{distribution:\'[20,25)\',percentage:0.02469},{distribution:\'[25,30)\',percentage:0.01089},{distribution:\'[30,35)\',percentage:0.00654},{distribution:\'[35,40)\',percentage:0.0029},{distribution:\'[4,6)\',percentage:0.11692},{distribution:\'[40,60)\',percentage:0.00508},{distribution:\'[6,8)\',percentage:0.06536},{distribution:\'[60,80)\',percentage:0.0029},{distribution:\'[8,10)\',percentage:0.03922},{distribution:\'[80,100)\',percentage:7.3E-4}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v107, v0

    .line 569
    move-object/from16 v0, v106

    move-object/from16 v1, v107

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 570
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v106

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 572
    new-instance v108, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v108 .. v108}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 573
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v108

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 574
    const-string v0, "0"

    move-object/from16 v1, v108

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 575
    const-string v0, "[18,24]"

    move-object/from16 v1, v108

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 576
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.33679},{distribution:\'[10,15)\',percentage:0.08201},{distribution:\'[100,+)\',percentage:5.3E-4},{distribution:\'[15,20)\',percentage:0.04173},{distribution:\'[2,4)\',percentage:0.21077},{distribution:\'[20,25)\',percentage:0.02467},{distribution:\'[25,30)\',percentage:0.01546},{distribution:\'[30,35)\',percentage:0.00876},{distribution:\'[35,40)\',percentage:0.00533},{distribution:\'[4,6)\',percentage:0.13356},{distribution:\'[40,60)\',percentage:0.00602},{distribution:\'[6,8)\',percentage:0.07957},{distribution:\'[60,80)\',percentage:0.00129},{distribution:\'[8,10)\',percentage:0.0533},{distribution:\'[80,100)\',percentage:2.3E-4}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v109, v0

    .line 577
    move-object/from16 v0, v108

    move-object/from16 v1, v109

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 578
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v108

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 580
    new-instance v110, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v110 .. v110}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 581
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v110

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 582
    const-string v0, "0"

    move-object/from16 v1, v110

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 583
    const-string v0, "[25,29]"

    move-object/from16 v1, v110

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 584
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.38425},{distribution:\'[10,15)\',percentage:0.07789},{distribution:\'[100,+)\',percentage:0.00132},{distribution:\'[15,20)\',percentage:0.04391},{distribution:\'[2,4)\',percentage:0.17219},{distribution:\'[20,25)\',percentage:0.02625},{distribution:\'[25,30)\',percentage:0.01891},{distribution:\'[30,35)\',percentage:0.01217},{distribution:\'[35,40)\',percentage:0.0084},{distribution:\'[4,6)\',percentage:0.12002},{distribution:\'[40,60)\',percentage:0.01263},{distribution:\'[6,8)\',percentage:0.0687},{distribution:\'[60,80)\',percentage:0.00403},{distribution:\'[8,10)\',percentage:0.04754},{distribution:\'[80,100)\',percentage:0.00179}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v111, v0

    .line 585
    move-object/from16 v0, v110

    move-object/from16 v1, v111

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 586
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v110

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 588
    new-instance v112, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v112 .. v112}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 589
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v112

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 590
    const-string v0, "0"

    move-object/from16 v1, v112

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 591
    const-string v0, "[30,34]"

    move-object/from16 v1, v112

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 592
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.40704},{distribution:\'[10,15)\',percentage:0.08451},{distribution:\'[100,+)\',percentage:0.00154},{distribution:\'[15,20)\',percentage:0.04408},{distribution:\'[2,4)\',percentage:0.14797},{distribution:\'[20,25)\',percentage:0.02789},{distribution:\'[25,30)\',percentage:0.01997},{distribution:\'[30,35)\',percentage:0.01194},{distribution:\'[35,40)\',percentage:0.00745},{distribution:\'[4,6)\',percentage:0.11736},{distribution:\'[40,60)\',percentage:0.01359},{distribution:\'[6,8)\',percentage:0.06359},{distribution:\'[60,80)\',percentage:0.00449},{distribution:\'[8,10)\',percentage:0.04775},{distribution:\'[80,100)\',percentage:8.3E-4}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v113, v0

    .line 593
    move-object/from16 v0, v112

    move-object/from16 v1, v113

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 594
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v112

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 596
    new-instance v114, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v114 .. v114}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 597
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v114

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 598
    const-string v0, "0"

    move-object/from16 v1, v114

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 599
    const-string v0, "[35,39]"

    move-object/from16 v1, v114

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 600
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.37155},{distribution:\'[10,15)\',percentage:0.09016},{distribution:\'[100,+)\',percentage:0.001},{distribution:\'[15,20)\',percentage:0.05663},{distribution:\'[2,4)\',percentage:0.14679},{distribution:\'[20,25)\',percentage:0.0339},{distribution:\'[25,30)\',percentage:0.02411},{distribution:\'[30,35)\',percentage:0.01909},{distribution:\'[35,40)\',percentage:0.0113},{distribution:\'[4,6)\',percentage:0.10472},{distribution:\'[40,60)\',percentage:0.01846},{distribution:\'[6,8)\',percentage:0.06969},{distribution:\'[60,80)\',percentage:0.00377},{distribution:\'[8,10)\',percentage:0.04709},{distribution:\'[80,100)\',percentage:0.00176}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v115, v0

    .line 601
    move-object/from16 v0, v114

    move-object/from16 v1, v115

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 602
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v114

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 604
    new-instance v116, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v116 .. v116}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 605
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v116

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 606
    const-string v0, "0"

    move-object/from16 v1, v116

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 607
    const-string v0, "[40,44]"

    move-object/from16 v1, v116

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 608
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.32179},{distribution:\'[10,15)\',percentage:0.09016},{distribution:\'[100,+)\',percentage:0.00234},{distribution:\'[15,20)\',percentage:0.06848},{distribution:\'[2,4)\',percentage:0.14038},{distribution:\'[20,25)\',percentage:0.04212},{distribution:\'[25,30)\',percentage:0.03088},{distribution:\'[30,35)\',percentage:0.02293},{distribution:\'[35,40)\',percentage:0.0156},{distribution:\'[4,6)\',percentage:0.11184},{distribution:\'[40,60)\',percentage:0.02667},{distribution:\'[6,8)\',percentage:0.06863},{distribution:\'[60,80)\',percentage:0.00718},{distribution:\'[8,10)\',percentage:0.04898},{distribution:\'[80,100)\',percentage:0.00203}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v117, v0

    .line 609
    move-object/from16 v0, v116

    move-object/from16 v1, v117

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 610
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v116

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 612
    new-instance v118, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v118 .. v118}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 613
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v118

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 614
    const-string v0, "0"

    move-object/from16 v1, v118

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 615
    const-string v0, "[45,49]"

    move-object/from16 v1, v118

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 616
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.3442},{distribution:\'[10,15)\',percentage:0.09363},{distribution:\'[100,+)\',percentage:0.0017},{distribution:\'[15,20)\',percentage:0.05746},{distribution:\'[2,4)\',percentage:0.13772},{distribution:\'[20,25)\',percentage:0.03994},{distribution:\'[25,30)\',percentage:0.03184},{distribution:\'[30,35)\',percentage:0.02223},{distribution:\'[35,40)\',percentage:0.0194},{distribution:\'[4,6)\',percentage:0.09834},{distribution:\'[40,60)\',percentage:0.03071},{distribution:\'[6,8)\',percentage:0.06688},{distribution:\'[60,80)\',percentage:0.01093},{distribution:\'[8,10)\',percentage:0.04277},{distribution:\'[80,100)\',percentage:0.00226}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v119, v0

    .line 617
    move-object/from16 v0, v118

    move-object/from16 v1, v119

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 618
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v118

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 620
    new-instance v120, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v120 .. v120}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 621
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v120

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 622
    const-string v0, "0"

    move-object/from16 v1, v120

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 623
    const-string v0, "[50,54]"

    move-object/from16 v1, v120

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 624
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.4515},{distribution:\'[10,15)\',percentage:0.06164},{distribution:\'[100,+)\',percentage:0.00313},{distribution:\'[15,20)\',percentage:0.0438},{distribution:\'[2,4)\',percentage:0.15019},{distribution:\'[20,25)\',percentage:0.02785},{distribution:\'[25,30)\',percentage:0.02065},{distribution:\'[30,35)\',percentage:0.02503},{distribution:\'[35,40)\',percentage:0.01439},{distribution:\'[4,6)\',percentage:0.08761},{distribution:\'[40,60)\',percentage:0.0194},{distribution:\'[6,8)\',percentage:0.05069},{distribution:\'[60,80)\',percentage:0.00688},{distribution:\'[8,10)\',percentage:0.03536},{distribution:\'[80,100)\',percentage:0.00188}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v121, v0

    .line 625
    move-object/from16 v0, v120

    move-object/from16 v1, v121

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 626
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v120

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 628
    new-instance v122, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v122 .. v122}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 629
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v122

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 630
    const-string v0, "0"

    move-object/from16 v1, v122

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 631
    const-string v0, "[55,59]"

    move-object/from16 v1, v122

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 632
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.50892},{distribution:\'[10,15)\',percentage:0.04981},{distribution:\'[100,+)\',percentage:0.00415},{distribution:\'[15,20)\',percentage:0.0274},{distribution:\'[2,4)\',percentage:0.15276},{distribution:\'[20,25)\',percentage:0.02283},{distribution:\'[25,30)\',percentage:0.01287},{distribution:\'[30,35)\',percentage:0.0137},{distribution:\'[35,40)\',percentage:0.01079},{distribution:\'[4,6)\',percentage:0.08261},{distribution:\'[40,60)\',percentage:0.02325},{distribution:\'[6,8)\',percentage:0.04815},{distribution:\'[60,80)\',percentage:0.00789},{distribution:\'[8,10)\',percentage:0.03155},{distribution:\'[80,100)\',percentage:0.00332}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v123, v0

    .line 633
    move-object/from16 v0, v122

    move-object/from16 v1, v123

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 634
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v122

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 636
    new-instance v124, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v124 .. v124}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 637
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v124

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 638
    const-string v0, "0"

    move-object/from16 v1, v124

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 639
    const-string v0, "[60,64]"

    move-object/from16 v1, v124

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 640
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.52955},{distribution:\'[10,15)\',percentage:0.04268},{distribution:\'[100,+)\',percentage:0.00235},{distribution:\'[15,20)\',percentage:0.0258},{distribution:\'[2,4)\',percentage:0.17167},{distribution:\'[20,25)\',percentage:0.01501},{distribution:\'[25,30)\',percentage:0.01079},{distribution:\'[30,35)\',percentage:0.00704},{distribution:\'[35,40)\',percentage:0.0075},{distribution:\'[4,6)\',percentage:0.08255},{distribution:\'[40,60)\',percentage:0.01642},{distribution:\'[6,8)\',percentage:0.04737},{distribution:\'[60,80)\',percentage:0.00704},{distribution:\'[8,10)\',percentage:0.03049},{distribution:\'[80,100)\',percentage:0.00375}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v125, v0

    .line 641
    move-object/from16 v0, v124

    move-object/from16 v1, v125

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 642
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v124

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 644
    new-instance v126, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v126 .. v126}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 645
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v126

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 646
    const-string v0, "0"

    move-object/from16 v1, v126

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 647
    const-string v0, "[65,69]"

    move-object/from16 v1, v126

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 648
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.55667},{distribution:\'[10,15)\',percentage:0.03473},{distribution:\'[100,+)\',percentage:0.00274},{distribution:\'[15,20)\',percentage:0.02468},{distribution:\'[2,4)\',percentage:0.15814},{distribution:\'[20,25)\',percentage:0.01463},{distribution:\'[25,30)\',percentage:0.00823},{distribution:\'[30,35)\',percentage:0.00548},{distribution:\'[35,40)\',percentage:0.00823},{distribution:\'[4,6)\',percentage:0.07678},{distribution:\'[40,60)\',percentage:0.0128},{distribution:\'[6,8)\',percentage:0.04296},{distribution:\'[60,80)\',percentage:0.00914},{distribution:\'[8,10)\',percentage:0.03931},{distribution:\'[80,100)\',percentage:0.00548}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v127, v0

    .line 649
    move-object/from16 v0, v126

    move-object/from16 v1, v127

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 650
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v126

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 652
    new-instance v128, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v128 .. v128}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 653
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v128

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 654
    const-string v0, "0"

    move-object/from16 v1, v128

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 655
    const-string v0, "[70,74]"

    move-object/from16 v1, v128

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 656
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.55502},{distribution:\'[10,15)\',percentage:0.04545},{distribution:\'[15,20)\',percentage:0.02153},{distribution:\'[2,4)\',percentage:0.17703},{distribution:\'[20,25)\',percentage:0.01675},{distribution:\'[25,30)\',percentage:0.00957},{distribution:\'[30,35)\',percentage:0.00478},{distribution:\'[35,40)\',percentage:0.00478},{distribution:\'[4,6)\',percentage:0.07177},{distribution:\'[40,60)\',percentage:0.01675},{distribution:\'[6,8)\',percentage:0.04067},{distribution:\'[60,80)\',percentage:0.00718},{distribution:\'[8,10)\',percentage:0.02632},{distribution:\'[80,100)\',percentage:0.00239}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v129, v0

    .line 657
    move-object/from16 v0, v128

    move-object/from16 v1, v129

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 658
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v128

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 660
    new-instance v130, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v130 .. v130}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 661
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v130

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 662
    const-string v0, "0"

    move-object/from16 v1, v130

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 663
    const-string v0, "[75,+)"

    move-object/from16 v1, v130

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 664
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.55728},{distribution:\'[10,15)\',percentage:0.03406},{distribution:\'[100,+)\',percentage:0.00929},{distribution:\'[15,20)\',percentage:0.01548},{distribution:\'[2,4)\',percentage:0.18266},{distribution:\'[20,25)\',percentage:0.02167},{distribution:\'[25,30)\',percentage:0.01548},{distribution:\'[30,35)\',percentage:0.0031},{distribution:\'[4,6)\',percentage:0.07121},{distribution:\'[40,60)\',percentage:0.00619},{distribution:\'[6,8)\',percentage:0.04334},{distribution:\'[8,10)\',percentage:0.03715},{distribution:\'[80,100)\',percentage:0.0031}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v131, v0

    .line 665
    move-object/from16 v0, v130

    move-object/from16 v1, v131

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 666
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v130

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 668
    new-instance v132, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v132 .. v132}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 669
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v132

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 670
    const-string v0, "1"

    move-object/from16 v1, v132

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 671
    const-string v0, "(0,17]"

    move-object/from16 v1, v132

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 672
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.41316},{distribution:\'[10,15)\',percentage:0.07169},{distribution:\'[100,+)\',percentage:0.00185},{distribution:\'[15,20)\',percentage:0.03646},{distribution:\'[2,4)\',percentage:0.17274},{distribution:\'[20,25)\',percentage:0.01823},{distribution:\'[25,30)\',percentage:0.01391},{distribution:\'[30,35)\',percentage:0.00587},{distribution:\'[35,40)\',percentage:0.00587},{distribution:\'[4,6)\',percentage:0.13103},{distribution:\'[40,60)\',percentage:0.00711},{distribution:\'[6,8)\',percentage:0.07262},{distribution:\'[60,80)\',percentage:0.0034},{distribution:\'[8,10)\',percentage:0.0445},{distribution:\'[80,100)\',percentage:0.00155}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v133, v0

    .line 673
    move-object/from16 v0, v132

    move-object/from16 v1, v133

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 674
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v132

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 676
    new-instance v134, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v134 .. v134}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 677
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v134

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 678
    const-string v0, "1"

    move-object/from16 v1, v134

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 679
    const-string v0, "[18,24]"

    move-object/from16 v1, v134

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 680
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.31766},{distribution:\'[10,15)\',percentage:0.09093},{distribution:\'[100,+)\',percentage:7.9E-4},{distribution:\'[15,20)\',percentage:0.04854},{distribution:\'[2,4)\',percentage:0.19659},{distribution:\'[20,25)\',percentage:0.02802},{distribution:\'[25,30)\',percentage:0.01552},{distribution:\'[30,35)\',percentage:0.00946},{distribution:\'[35,40)\',percentage:0.005},{distribution:\'[4,6)\',percentage:0.13738},{distribution:\'[40,60)\',percentage:0.00803},{distribution:\'[6,8)\',percentage:0.08071},{distribution:\'[60,80)\',percentage:0.00206},{distribution:\'[8,10)\',percentage:0.05897},{distribution:\'[80,100)\',percentage:3.3E-4}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v135, v0

    .line 681
    move-object/from16 v0, v134

    move-object/from16 v1, v135

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 682
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v134

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 684
    new-instance v136, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v136 .. v136}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 685
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v136

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 686
    const-string v0, "1"

    move-object/from16 v1, v136

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 687
    const-string v0, "[25,29]"

    move-object/from16 v1, v136

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 688
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.31546},{distribution:\'[10,15)\',percentage:0.09499},{distribution:\'[100,+)\',percentage:0.00198},{distribution:\'[15,20)\',percentage:0.05485},{distribution:\'[2,4)\',percentage:0.1687},{distribution:\'[20,25)\',percentage:0.0338},{distribution:\'[25,30)\',percentage:0.02202},{distribution:\'[30,35)\',percentage:0.01374},{distribution:\'[35,40)\',percentage:0.00968},{distribution:\'[4,6)\',percentage:0.13117},{distribution:\'[40,60)\',percentage:0.01701},{distribution:\'[6,8)\',percentage:0.07562},{distribution:\'[60,80)\',percentage:0.00509},{distribution:\'[8,10)\',percentage:0.05413},{distribution:\'[80,100)\',percentage:0.00175}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v137, v0

    .line 689
    move-object/from16 v0, v136

    move-object/from16 v1, v137

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 690
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v136

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 692
    new-instance v138, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v138 .. v138}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 693
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v138

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 694
    const-string v0, "1"

    move-object/from16 v1, v138

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 695
    const-string v0, "[30,34]"

    move-object/from16 v1, v138

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 696
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.29939},{distribution:\'[10,15)\',percentage:0.10813},{distribution:\'[100,+)\',percentage:0.00101},{distribution:\'[15,20)\',percentage:0.05946},{distribution:\'[2,4)\',percentage:0.15734},{distribution:\'[20,25)\',percentage:0.03707},{distribution:\'[25,30)\',percentage:0.02327},{distribution:\'[30,35)\',percentage:0.01535},{distribution:\'[35,40)\',percentage:0.01021},{distribution:\'[4,6)\',percentage:0.13072},{distribution:\'[40,60)\',percentage:0.01448},{distribution:\'[6,8)\',percentage:0.08039},{distribution:\'[60,80)\',percentage:0.00382},{distribution:\'[8,10)\',percentage:0.05834},{distribution:\'[80,100)\',percentage:0.00101}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v139, v0

    .line 697
    move-object/from16 v0, v138

    move-object/from16 v1, v139

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 698
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v138

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 700
    new-instance v140, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v140 .. v140}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 701
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v140

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 702
    const-string v0, "1"

    move-object/from16 v1, v140

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 703
    const-string v0, "[35,39]"

    move-object/from16 v1, v140

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 704
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.26547},{distribution:\'[10,15)\',percentage:0.11226},{distribution:\'[100,+)\',percentage:0.00202},{distribution:\'[15,20)\',percentage:0.06905},{distribution:\'[2,4)\',percentage:0.14418},{distribution:\'[20,25)\',percentage:0.04714},{distribution:\'[25,30)\',percentage:0.02991},{distribution:\'[30,35)\',percentage:0.02499},{distribution:\'[35,40)\',percentage:0.0138},{distribution:\'[4,6)\',percentage:0.12284},{distribution:\'[40,60)\',percentage:0.02307},{distribution:\'[6,8)\',percentage:0.0803},{distribution:\'[60,80)\',percentage:0.0057},{distribution:\'[8,10)\',percentage:0.05758},{distribution:\'[80,100)\',percentage:0.0017}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v141, v0

    .line 705
    move-object/from16 v0, v140

    move-object/from16 v1, v141

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 706
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v140

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 708
    new-instance v142, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v142 .. v142}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 709
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v142

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 710
    const-string v0, "1"

    move-object/from16 v1, v142

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 711
    const-string v0, "[40,44]"

    move-object/from16 v1, v142

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 712
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.23397},{distribution:\'[10,15)\',percentage:0.11342},{distribution:\'[100,+)\',percentage:0.00316},{distribution:\'[15,20)\',percentage:0.0759},{distribution:\'[2,4)\',percentage:0.1306},{distribution:\'[20,25)\',percentage:0.057},{distribution:\'[25,30)\',percentage:0.03942},{distribution:\'[30,35)\',percentage:0.02864},{distribution:\'[35,40)\',percentage:0.01948},{distribution:\'[4,6)\',percentage:0.11694},{distribution:\'[40,60)\',percentage:0.03684},{distribution:\'[6,8)\',percentage:0.07626},{distribution:\'[60,80)\',percentage:0.01042},{distribution:\'[8,10)\',percentage:0.05547},{distribution:\'[80,100)\',percentage:0.00248}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v143, v0

    .line 713
    move-object/from16 v0, v142

    move-object/from16 v1, v143

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 714
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v142

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 716
    new-instance v144, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v144 .. v144}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 717
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v144

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 718
    const-string v0, "1"

    move-object/from16 v1, v144

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 719
    const-string v0, "[45,49]"

    move-object/from16 v1, v144

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 720
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.22759},{distribution:\'[10,15)\',percentage:0.11046},{distribution:\'[100,+)\',percentage:0.00426},{distribution:\'[15,20)\',percentage:0.07779},{distribution:\'[2,4)\',percentage:0.11908},{distribution:\'[20,25)\',percentage:0.0608},{distribution:\'[25,30)\',percentage:0.04539},{distribution:\'[30,35)\',percentage:0.03519},{distribution:\'[35,40)\',percentage:0.02651},{distribution:\'[4,6)\',percentage:0.09867},{distribution:\'[40,60)\',percentage:0.05181},{distribution:\'[6,8)\',percentage:0.06932},{distribution:\'[60,80)\',percentage:0.01588},{distribution:\'[8,10)\',percentage:0.05155},{distribution:\'[80,100)\',percentage:0.00568}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v145, v0

    .line 721
    move-object/from16 v0, v144

    move-object/from16 v1, v145

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 722
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v144

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 724
    new-instance v146, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v146 .. v146}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 725
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v146

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 726
    const-string v0, "1"

    move-object/from16 v1, v146

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 727
    const-string v0, "[50,54]"

    move-object/from16 v1, v146

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 728
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.25007},{distribution:\'[10,15)\',percentage:0.09856},{distribution:\'[100,+)\',percentage:0.00679},{distribution:\'[15,20)\',percentage:0.07096},{distribution:\'[2,4)\',percentage:0.11563},{distribution:\'[20,25)\',percentage:0.05781},{distribution:\'[25,30)\',percentage:0.04449},{distribution:\'[30,35)\',percentage:0.03805},{distribution:\'[35,40)\',percentage:0.02725},{distribution:\'[4,6)\',percentage:0.08864},{distribution:\'[40,60)\',percentage:0.05895},{distribution:\'[6,8)\',percentage:0.06382},{distribution:\'[60,80)\',percentage:0.01872},{distribution:\'[8,10)\',percentage:0.05137},{distribution:\'[80,100)\',percentage:0.00888}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v147, v0

    .line 729
    move-object/from16 v0, v146

    move-object/from16 v1, v147

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 730
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v146

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 732
    new-instance v148, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v148 .. v148}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 733
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v148

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 734
    const-string v0, "1"

    move-object/from16 v1, v148

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 735
    const-string v0, "[55,59]"

    move-object/from16 v1, v148

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 736
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.29621},{distribution:\'[10,15)\',percentage:0.07865},{distribution:\'[100,+)\',percentage:0.00991},{distribution:\'[15,20)\',percentage:0.06056},{distribution:\'[2,4)\',percentage:0.11452},{distribution:\'[20,25)\',percentage:0.04515},{distribution:\'[25,30)\',percentage:0.04011},{distribution:\'[30,35)\',percentage:0.0365},{distribution:\'[35,40)\',percentage:0.0269},{distribution:\'[4,6)\',percentage:0.08463},{distribution:\'[40,60)\',percentage:0.0689},{distribution:\'[6,8)\',percentage:0.056},{distribution:\'[60,80)\',percentage:0.02816},{distribution:\'[8,10)\',percentage:0.04499},{distribution:\'[80,100)\',percentage:0.00881}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v149, v0

    .line 737
    move-object/from16 v0, v148

    move-object/from16 v1, v149

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 738
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v148

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 740
    new-instance v150, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v150 .. v150}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 741
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v150

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 742
    const-string v0, "1"

    move-object/from16 v1, v150

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 743
    const-string v0, "[60,64]"

    move-object/from16 v1, v150

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 744
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.33223},{distribution:\'[10,15)\',percentage:0.0698},{distribution:\'[100,+)\',percentage:0.01077},{distribution:\'[15,20)\',percentage:0.05157},{distribution:\'[2,4)\',percentage:0.128},{distribution:\'[20,25)\',percentage:0.04246},{distribution:\'[25,30)\',percentage:0.0319},{distribution:\'[30,35)\',percentage:0.03003},{distribution:\'[35,40)\',percentage:0.03231},{distribution:\'[4,6)\',percentage:0.07622},{distribution:\'[40,60)\',percentage:0.06462},{distribution:\'[6,8)\',percentage:0.04681},{distribution:\'[60,80)\',percentage:0.02817},{distribution:\'[8,10)\',percentage:0.03708},{distribution:\'[80,100)\',percentage:0.01802}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v151, v0

    .line 745
    move-object/from16 v0, v150

    move-object/from16 v1, v151

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 746
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v150

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 748
    new-instance v152, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v152 .. v152}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 749
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v152

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 750
    const-string v0, "1"

    move-object/from16 v1, v152

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 751
    const-string v0, "[65,69]"

    move-object/from16 v1, v152

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 752
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.37025},{distribution:\'[10,15)\',percentage:0.06268},{distribution:\'[100,+)\',percentage:0.01045},{distribution:\'[15,20)\',percentage:0.04806},{distribution:\'[2,4)\',percentage:0.11241},{distribution:\'[20,25)\',percentage:0.04555},{distribution:\'[25,30)\',percentage:0.03636},{distribution:\'[30,35)\',percentage:0.02758},{distribution:\'[35,40)\',percentage:0.02298},{distribution:\'[4,6)\',percentage:0.06226},{distribution:\'[40,60)\',percentage:0.05892},{distribution:\'[6,8)\',percentage:0.05641},{distribution:\'[60,80)\',percentage:0.03218},{distribution:\'[8,10)\',percentage:0.0443},{distribution:\'[80,100)\',percentage:0.00961}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v153, v0

    .line 753
    move-object/from16 v0, v152

    move-object/from16 v1, v153

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 754
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v152

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 756
    new-instance v154, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v154 .. v154}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 757
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v154

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 758
    const-string v0, "1"

    move-object/from16 v1, v154

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 759
    const-string v0, "[70,74]"

    move-object/from16 v1, v154

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 760
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.40479},{distribution:\'[10,15)\',percentage:0.04787},{distribution:\'[100,+)\',percentage:0.01249},{distribution:\'[15,20)\',percentage:0.04787},{distribution:\'[2,4)\',percentage:0.12799},{distribution:\'[20,25)\',percentage:0.04579},{distribution:\'[25,30)\',percentage:0.03226},{distribution:\'[30,35)\',percentage:0.02393},{distribution:\'[35,40)\',percentage:0.02706},{distribution:\'[4,6)\',percentage:0.0666},{distribution:\'[40,60)\',percentage:0.05099},{distribution:\'[6,8)\',percentage:0.0437},{distribution:\'[60,80)\',percentage:0.02393},{distribution:\'[8,10)\',percentage:0.0333},{distribution:\'[80,100)\',percentage:0.01145}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v155, v0

    .line 761
    move-object/from16 v0, v154

    move-object/from16 v1, v155

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 762
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v154

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 764
    new-instance v156, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v156 .. v156}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 765
    const-string v0, "weeklyRunDistance"

    move-object/from16 v1, v156

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 766
    const-string v0, "1"

    move-object/from16 v1, v156

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 767
    const-string v0, "[75,+)"

    move-object/from16 v1, v156

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 768
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.40146},{distribution:\'[10,15)\',percentage:0.06569},{distribution:\'[100,+)\',percentage:0.00852},{distribution:\'[15,20)\',percentage:0.04988},{distribution:\'[2,4)\',percentage:0.14112},{distribution:\'[20,25)\',percentage:0.04015},{distribution:\'[25,30)\',percentage:0.02555},{distribution:\'[30,35)\',percentage:0.02798},{distribution:\'[35,40)\',percentage:0.0146},{distribution:\'[4,6)\',percentage:0.09246},{distribution:\'[40,60)\',percentage:0.03406},{distribution:\'[6,8)\',percentage:0.05718},{distribution:\'[60,80)\',percentage:0.01095},{distribution:\'[8,10)\',percentage:0.02555},{distribution:\'[80,100)\',percentage:0.00487}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v157, v0

    .line 769
    move-object/from16 v0, v156

    move-object/from16 v1, v157

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 770
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v156

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 772
    new-instance v158, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v158 .. v158}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 773
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v158

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 774
    const-string v0, "0"

    move-object/from16 v1, v158

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 775
    const-string v0, "(0,17]"

    move-object/from16 v1, v158

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 776
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.42605},{distribution:\'[10,15)\',percentage:0.06576},{distribution:\'[100,+)\',percentage:0.00372},{distribution:\'[15,20)\',percentage:0.03201},{distribution:\'[2,4)\',percentage:0.19801},{distribution:\'[20,25)\',percentage:0.02481},{distribution:\'[25,30)\',percentage:0.01315},{distribution:\'[30,35)\',percentage:0.01067},{distribution:\'[35,40)\',percentage:0.0072},{distribution:\'[4,6)\',percentage:0.09404},{distribution:\'[40,60)\',percentage:0.01315},{distribution:\'[6,8)\',percentage:0.06476},{distribution:\'[60,80)\',percentage:0.00496},{distribution:\'[8,10)\',percentage:0.03772},{distribution:\'[80,100)\',percentage:0.00397}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v159, v0

    .line 777
    move-object/from16 v0, v158

    move-object/from16 v1, v159

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 778
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v158

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 780
    new-instance v160, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v160 .. v160}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 781
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v160

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 782
    const-string v0, "0"

    move-object/from16 v1, v160

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 783
    const-string v0, "[18,24]"

    move-object/from16 v1, v160

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 784
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.34216},{distribution:\'[10,15)\',percentage:0.077},{distribution:\'[100,+)\',percentage:0.00602},{distribution:\'[15,20)\',percentage:0.0429},{distribution:\'[2,4)\',percentage:0.18487},{distribution:\'[20,25)\',percentage:0.02912},{distribution:\'[25,30)\',percentage:0.01935},{distribution:\'[30,35)\',percentage:0.01483},{distribution:\'[35,40)\',percentage:0.01045},{distribution:\'[4,6)\',percentage:0.11715},{distribution:\'[40,60)\',percentage:0.02316},{distribution:\'[6,8)\',percentage:0.06932},{distribution:\'[60,80)\',percentage:0.01013},{distribution:\'[8,10)\',percentage:0.04886},{distribution:\'[80,100)\',percentage:0.00468}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v161, v0

    .line 785
    move-object/from16 v0, v160

    move-object/from16 v1, v161

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 786
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v160

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 788
    new-instance v162, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v162 .. v162}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 789
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v162

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 790
    const-string v0, "0"

    move-object/from16 v1, v162

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 791
    const-string v0, "[25,29]"

    move-object/from16 v1, v162

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 792
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.38755},{distribution:\'[10,15)\',percentage:0.06641},{distribution:\'[100,+)\',percentage:0.01573},{distribution:\'[15,20)\',percentage:0.04033},{distribution:\'[2,4)\',percentage:0.16762},{distribution:\'[20,25)\',percentage:0.02717},{distribution:\'[25,30)\',percentage:0.01913},{distribution:\'[30,35)\',percentage:0.0134},{distribution:\'[35,40)\',percentage:0.01103},{distribution:\'[4,6)\',percentage:0.09952},{distribution:\'[40,60)\',percentage:0.02849},{distribution:\'[6,8)\',percentage:0.05958},{distribution:\'[60,80)\',percentage:0.01389},{distribution:\'[8,10)\',percentage:0.04214},{distribution:\'[80,100)\',percentage:0.008}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v163, v0

    .line 793
    move-object/from16 v0, v162

    move-object/from16 v1, v163

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 794
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v162

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 796
    new-instance v164, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v164 .. v164}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 797
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v164

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 798
    const-string v0, "0"

    move-object/from16 v1, v164

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 799
    const-string v0, "[30,34]"

    move-object/from16 v1, v164

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 800
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.40423},{distribution:\'[10,15)\',percentage:0.06529},{distribution:\'[100,+)\',percentage:0.01585},{distribution:\'[15,20)\',percentage:0.03893},{distribution:\'[2,4)\',percentage:0.15251},{distribution:\'[20,25)\',percentage:0.02788},{distribution:\'[25,30)\',percentage:0.02225},{distribution:\'[30,35)\',percentage:0.01557},{distribution:\'[35,40)\',percentage:0.01193},{distribution:\'[4,6)\',percentage:0.09169},{distribution:\'[40,60)\',percentage:0.03207},{distribution:\'[6,8)\',percentage:0.05833},{distribution:\'[60,80)\',percentage:0.01603},{distribution:\'[8,10)\',percentage:0.03903},{distribution:\'[80,100)\',percentage:0.00839}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v165, v0

    .line 801
    move-object/from16 v0, v164

    move-object/from16 v1, v165

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 802
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v164

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 804
    new-instance v166, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v166 .. v166}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 805
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v166

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 806
    const-string v0, "0"

    move-object/from16 v1, v166

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 807
    const-string v0, "[35,39]"

    move-object/from16 v1, v166

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 808
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.36991},{distribution:\'[10,15)\',percentage:0.07047},{distribution:\'[100,+)\',percentage:0.02402},{distribution:\'[15,20)\',percentage:0.04233},{distribution:\'[2,4)\',percentage:0.14518},{distribution:\'[20,25)\',percentage:0.03121},{distribution:\'[25,30)\',percentage:0.0233},{distribution:\'[30,35)\',percentage:0.01668},{distribution:\'[35,40)\',percentage:0.01535},{distribution:\'[4,6)\',percentage:0.09057},{distribution:\'[40,60)\',percentage:0.0383},{distribution:\'[6,8)\',percentage:0.05869},{distribution:\'[60,80)\',percentage:0.02075},{distribution:\'[8,10)\',percentage:0.04141},{distribution:\'[80,100)\',percentage:0.01183}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v167, v0

    .line 809
    move-object/from16 v0, v166

    move-object/from16 v1, v167

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 810
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v166

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 812
    new-instance v168, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v168 .. v168}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 813
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v168

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 814
    const-string v0, "0"

    move-object/from16 v1, v168

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 815
    const-string v0, "[40,44]"

    move-object/from16 v1, v168

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 816
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.32689},{distribution:\'[10,15)\',percentage:0.07029},{distribution:\'[100,+)\',percentage:0.03707},{distribution:\'[15,20)\',percentage:0.04629},{distribution:\'[2,4)\',percentage:0.14127},{distribution:\'[20,25)\',percentage:0.03219},{distribution:\'[25,30)\',percentage:0.02565},{distribution:\'[30,35)\',percentage:0.02228},{distribution:\'[35,40)\',percentage:0.01754},{distribution:\'[4,6)\',percentage:0.08955},{distribution:\'[40,60)\',percentage:0.04697},{distribution:\'[6,8)\',percentage:0.05784},{distribution:\'[60,80)\',percentage:0.02751},{distribution:\'[8,10)\',percentage:0.03996},{distribution:\'[80,100)\',percentage:0.01871}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v169, v0

    .line 817
    move-object/from16 v0, v168

    move-object/from16 v1, v169

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 818
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v168

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 820
    new-instance v170, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v170 .. v170}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 821
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v170

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 822
    const-string v0, "0"

    move-object/from16 v1, v170

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 823
    const-string v0, "[45,49]"

    move-object/from16 v1, v170

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 824
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.32655},{distribution:\'[10,15)\',percentage:0.06738},{distribution:\'[100,+)\',percentage:0.04823},{distribution:\'[15,20)\',percentage:0.04215},{distribution:\'[2,4)\',percentage:0.1369},{distribution:\'[20,25)\',percentage:0.02967},{distribution:\'[25,30)\',percentage:0.02445},{distribution:\'[30,35)\',percentage:0.02018},{distribution:\'[35,40)\',percentage:0.01616},{distribution:\'[4,6)\',percentage:0.09414},{distribution:\'[40,60)\',percentage:0.0425},{distribution:\'[6,8)\',percentage:0.06028},{distribution:\'[60,80)\',percentage:0.03018},{distribution:\'[8,10)\',percentage:0.04284},{distribution:\'[80,100)\',percentage:0.01838}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v171, v0

    .line 825
    move-object/from16 v0, v170

    move-object/from16 v1, v171

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 826
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v170

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 828
    new-instance v172, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v172 .. v172}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 829
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v172

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 830
    const-string v0, "0"

    move-object/from16 v1, v172

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 831
    const-string v0, "[50,54]"

    move-object/from16 v1, v172

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 832
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.36958},{distribution:\'[10,15)\',percentage:0.07032},{distribution:\'[100,+)\',percentage:0.03298},{distribution:\'[15,20)\',percentage:0.03857},{distribution:\'[2,4)\',percentage:0.1619},{distribution:\'[20,25)\',percentage:0.0233},{distribution:\'[25,30)\',percentage:0.01581},{distribution:\'[30,35)\',percentage:0.01376},{distribution:\'[35,40)\',percentage:0.01186},{distribution:\'[4,6)\',percentage:0.09785},{distribution:\'[40,60)\',percentage:0.03216},{distribution:\'[6,8)\',percentage:0.06528},{distribution:\'[60,80)\',percentage:0.01676},{distribution:\'[8,10)\',percentage:0.04075},{distribution:\'[80,100)\',percentage:0.00913}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v173, v0

    .line 833
    move-object/from16 v0, v172

    move-object/from16 v1, v173

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 834
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v172

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 836
    new-instance v174, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v174 .. v174}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 837
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v174

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 838
    const-string v0, "0"

    move-object/from16 v1, v174

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 839
    const-string v0, "[55,59]"

    move-object/from16 v1, v174

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 840
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.38524},{distribution:\'[10,15)\',percentage:0.06486},{distribution:\'[100,+)\',percentage:0.02918},{distribution:\'[15,20)\',percentage:0.03327},{distribution:\'[2,4)\',percentage:0.17004},{distribution:\'[20,25)\',percentage:0.0236},{distribution:\'[25,30)\',percentage:0.01431},{distribution:\'[30,35)\',percentage:0.01059},{distribution:\'[35,40)\',percentage:0.00873},{distribution:\'[4,6)\',percentage:0.10221},{distribution:\'[40,60)\',percentage:0.02527},{distribution:\'[6,8)\',percentage:0.06393},{distribution:\'[60,80)\',percentage:0.01561},{distribution:\'[8,10)\',percentage:0.04349},{distribution:\'[80,100)\',percentage:0.00966}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v175, v0

    .line 841
    move-object/from16 v0, v174

    move-object/from16 v1, v175

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 842
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v174

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 844
    new-instance v176, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v176 .. v176}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 845
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v176

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 846
    const-string v0, "0"

    move-object/from16 v1, v176

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 847
    const-string v0, "[60,64]"

    move-object/from16 v1, v176

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 848
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.39962},{distribution:\'[10,15)\',percentage:0.06356},{distribution:\'[100,+)\',percentage:0.02182},{distribution:\'[15,20)\',percentage:0.03126},{distribution:\'[2,4)\',percentage:0.18229},{distribution:\'[20,25)\',percentage:0.02056},{distribution:\'[25,30)\',percentage:0.01573},{distribution:\'[30,35)\',percentage:0.00902},{distribution:\'[35,40)\',percentage:0.00818},{distribution:\'[4,6)\',percentage:0.10363},{distribution:\'[40,60)\',percentage:0.01385},{distribution:\'[6,8)\',percentage:0.06629},{distribution:\'[60,80)\',percentage:0.01112},{distribution:\'[8,10)\',percentage:0.04678},{distribution:\'[80,100)\',percentage:0.00629}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v177, v0

    .line 849
    move-object/from16 v0, v176

    move-object/from16 v1, v177

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 850
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v176

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 852
    new-instance v178, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v178 .. v178}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 853
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v178

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 854
    const-string v0, "0"

    move-object/from16 v1, v178

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 855
    const-string v0, "[65,69]"

    move-object/from16 v1, v178

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 856
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.42833},{distribution:\'[10,15)\',percentage:0.06125},{distribution:\'[100,+)\',percentage:0.01958},{distribution:\'[15,20)\',percentage:0.03583},{distribution:\'[2,4)\',percentage:0.17083},{distribution:\'[20,25)\',percentage:0.01875},{distribution:\'[25,30)\',percentage:0.01125},{distribution:\'[30,35)\',percentage:0.01125},{distribution:\'[35,40)\',percentage:0.00542},{distribution:\'[4,6)\',percentage:0.09667},{distribution:\'[40,60)\',percentage:0.01792},{distribution:\'[6,8)\',percentage:0.055},{distribution:\'[60,80)\',percentage:0.01083},{distribution:\'[8,10)\',percentage:0.04958},{distribution:\'[80,100)\',percentage:0.0075}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v179, v0

    .line 857
    move-object/from16 v0, v178

    move-object/from16 v1, v179

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 858
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v178

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 860
    new-instance v180, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v180 .. v180}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 861
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v180

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 862
    const-string v0, "0"

    move-object/from16 v1, v180

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 863
    const-string v0, "[70,74]"

    move-object/from16 v1, v180

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 864
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.46468},{distribution:\'[10,15)\',percentage:0.05771},{distribution:\'[100,+)\',percentage:0.0199},{distribution:\'[15,20)\',percentage:0.02886},{distribution:\'[2,4)\',percentage:0.18209},{distribution:\'[20,25)\',percentage:0.01791},{distribution:\'[25,30)\',percentage:0.01194},{distribution:\'[30,35)\',percentage:0.00597},{distribution:\'[35,40)\',percentage:0.00299},{distribution:\'[4,6)\',percentage:0.09055},{distribution:\'[40,60)\',percentage:0.01692},{distribution:\'[6,8)\',percentage:0.04975},{distribution:\'[60,80)\',percentage:0.00796},{distribution:\'[8,10)\',percentage:0.03881},{distribution:\'[80,100)\',percentage:0.00398}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v181, v0

    .line 865
    move-object/from16 v0, v180

    move-object/from16 v1, v181

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 866
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v180

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 868
    new-instance v182, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v182 .. v182}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 869
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v182

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 870
    const-string v0, "0"

    move-object/from16 v1, v182

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 871
    const-string v0, "[75,+)"

    move-object/from16 v1, v182

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 872
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.45885},{distribution:\'[10,15)\',percentage:0.06484},{distribution:\'[100,+)\',percentage:0.0187},{distribution:\'[15,20)\',percentage:0.02244},{distribution:\'[2,4)\',percentage:0.19077},{distribution:\'[20,25)\',percentage:0.0187},{distribution:\'[25,30)\',percentage:0.00873},{distribution:\'[30,35)\',percentage:0.00873},{distribution:\'[35,40)\',percentage:0.00374},{distribution:\'[4,6)\',percentage:0.0985},{distribution:\'[40,60)\',percentage:0.01496},{distribution:\'[6,8)\',percentage:0.03865},{distribution:\'[60,80)\',percentage:0.00249},{distribution:\'[8,10)\',percentage:0.04489},{distribution:\'[80,100)\',percentage:0.00499}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v183, v0

    .line 873
    move-object/from16 v0, v182

    move-object/from16 v1, v183

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 874
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v182

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 876
    new-instance v184, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v184 .. v184}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 877
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v184

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 878
    const-string v0, "1"

    move-object/from16 v1, v184

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 879
    const-string v0, "(0,17]"

    move-object/from16 v1, v184

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 880
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.4195},{distribution:\'[10,15)\',percentage:0.06147},{distribution:\'[100,+)\',percentage:0.00784},{distribution:\'[15,20)\',percentage:0.03786},{distribution:\'[2,4)\',percentage:0.17922},{distribution:\'[20,25)\',percentage:0.0232},{distribution:\'[25,30)\',percentage:0.0171},{distribution:\'[30,35)\',percentage:0.01181},{distribution:\'[35,40)\',percentage:0.00814},{distribution:\'[4,6)\',percentage:0.1035},{distribution:\'[40,60)\',percentage:0.01913},{distribution:\'[6,8)\',percentage:0.06137},{distribution:\'[60,80)\',percentage:0.00672},{distribution:\'[8,10)\',percentage:0.03898},{distribution:\'[80,100)\',percentage:0.00417}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v185, v0

    .line 881
    move-object/from16 v0, v184

    move-object/from16 v1, v185

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 882
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v184

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 884
    new-instance v186, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v186 .. v186}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 885
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v186

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 886
    const-string v0, "1"

    move-object/from16 v1, v186

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 887
    const-string v0, "[18,24]"

    move-object/from16 v1, v186

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 888
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.32115},{distribution:\'[10,15)\',percentage:0.08364},{distribution:\'[100,+)\',percentage:0.00827},{distribution:\'[15,20)\',percentage:0.04989},{distribution:\'[2,4)\',percentage:0.17113},{distribution:\'[20,25)\',percentage:0.03383},{distribution:\'[25,30)\',percentage:0.02263},{distribution:\'[30,35)\',percentage:0.01707},{distribution:\'[35,40)\',percentage:0.01287},{distribution:\'[4,6)\',percentage:0.1127},{distribution:\'[40,60)\',percentage:0.02872},{distribution:\'[6,8)\',percentage:0.06918},{distribution:\'[60,80)\',percentage:0.01238},{distribution:\'[8,10)\',percentage:0.0507},{distribution:\'[80,100)\',percentage:0.00586}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v187, v0

    .line 889
    move-object/from16 v0, v186

    move-object/from16 v1, v187

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 890
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v186

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 892
    new-instance v188, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v188 .. v188}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 893
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v188

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 894
    const-string v0, "1"

    move-object/from16 v1, v188

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 895
    const-string v0, "[25,29]"

    move-object/from16 v1, v188

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 896
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.32911},{distribution:\'[10,15)\',percentage:0.07912},{distribution:\'[100,+)\',percentage:0.02146},{distribution:\'[15,20)\',percentage:0.04916},{distribution:\'[2,4)\',percentage:0.15236},{distribution:\'[20,25)\',percentage:0.03362},{distribution:\'[25,30)\',percentage:0.02567},{distribution:\'[30,35)\',percentage:0.01863},{distribution:\'[35,40)\',percentage:0.01475},{distribution:\'[4,6)\',percentage:0.10139},{distribution:\'[40,60)\',percentage:0.03594},{distribution:\'[6,8)\',percentage:0.06418},{distribution:\'[60,80)\',percentage:0.01888},{distribution:\'[8,10)\',percentage:0.04518},{distribution:\'[80,100)\',percentage:0.01056}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v189, v0

    .line 897
    move-object/from16 v0, v188

    move-object/from16 v1, v189

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 898
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v188

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 900
    new-instance v190, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v190 .. v190}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 901
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v190

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 902
    const-string v0, "1"

    move-object/from16 v1, v190

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 903
    const-string v0, "[30,34]"

    move-object/from16 v1, v190

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 904
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.31839},{distribution:\'[10,15)\',percentage:0.08041},{distribution:\'[100,+)\',percentage:0.02239},{distribution:\'[15,20)\',percentage:0.05236},{distribution:\'[2,4)\',percentage:0.14151},{distribution:\'[20,25)\',percentage:0.03743},{distribution:\'[25,30)\',percentage:0.0273},{distribution:\'[30,35)\',percentage:0.02135},{distribution:\'[35,40)\',percentage:0.01716},{distribution:\'[4,6)\',percentage:0.09521},{distribution:\'[40,60)\',percentage:0.04418},{distribution:\'[6,8)\',percentage:0.06115},{distribution:\'[60,80)\',percentage:0.02324},{distribution:\'[8,10)\',percentage:0.04513},{distribution:\'[80,100)\',percentage:0.0128}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v191, v0

    .line 905
    move-object/from16 v0, v190

    move-object/from16 v1, v191

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 906
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v190

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 908
    new-instance v192, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v192 .. v192}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 909
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v192

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 910
    const-string v0, "1"

    move-object/from16 v1, v192

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 911
    const-string v0, "[35,39]"

    move-object/from16 v1, v192

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 912
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.29235},{distribution:\'[10,15)\',percentage:0.07734},{distribution:\'[100,+)\',percentage:0.03759},{distribution:\'[15,20)\',percentage:0.05204},{distribution:\'[2,4)\',percentage:0.13489},{distribution:\'[20,25)\',percentage:0.03671},{distribution:\'[25,30)\',percentage:0.02902},{distribution:\'[30,35)\',percentage:0.02353},{distribution:\'[35,40)\',percentage:0.01967},{distribution:\'[4,6)\',percentage:0.0913},{distribution:\'[40,60)\',percentage:0.05278},{distribution:\'[6,8)\',percentage:0.05911},{distribution:\'[60,80)\',percentage:0.03028},{distribution:\'[8,10)\',percentage:0.04447},{distribution:\'[80,100)\',percentage:0.01892}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v193, v0

    .line 913
    move-object/from16 v0, v192

    move-object/from16 v1, v193

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 914
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v192

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 916
    new-instance v194, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v194 .. v194}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 917
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v194

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 918
    const-string v0, "1"

    move-object/from16 v1, v194

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 919
    const-string v0, "[40,44]"

    move-object/from16 v1, v194

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 920
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.26485},{distribution:\'[10,15)\',percentage:0.07659},{distribution:\'[100,+)\',percentage:0.05902},{distribution:\'[15,20)\',percentage:0.05013},{distribution:\'[2,4)\',percentage:0.1239},{distribution:\'[20,25)\',percentage:0.03807},{distribution:\'[25,30)\',percentage:0.02933},{distribution:\'[30,35)\',percentage:0.02433},{distribution:\'[35,40)\',percentage:0.02174},{distribution:\'[4,6)\',percentage:0.0884},{distribution:\'[40,60)\',percentage:0.06032},{distribution:\'[6,8)\',percentage:0.05843},{distribution:\'[60,80)\',percentage:0.03818},{distribution:\'[8,10)\',percentage:0.04063},{distribution:\'[80,100)\',percentage:0.02608}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v195, v0

    .line 921
    move-object/from16 v0, v194

    move-object/from16 v1, v195

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 922
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v194

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 924
    new-instance v196, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v196 .. v196}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 925
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v196

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 926
    const-string v0, "1"

    move-object/from16 v1, v196

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 927
    const-string v0, "[45,49]"

    move-object/from16 v1, v196

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 928
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.25582},{distribution:\'[10,15)\',percentage:0.07165},{distribution:\'[100,+)\',percentage:0.08321},{distribution:\'[15,20)\',percentage:0.04752},{distribution:\'[2,4)\',percentage:0.11937},{distribution:\'[20,25)\',percentage:0.03634},{distribution:\'[25,30)\',percentage:0.02926},{distribution:\'[30,35)\',percentage:0.02346},{distribution:\'[35,40)\',percentage:0.0201},{distribution:\'[4,6)\',percentage:0.08332},{distribution:\'[40,60)\',percentage:0.06147},{distribution:\'[6,8)\',percentage:0.05601},{distribution:\'[60,80)\',percentage:0.0418},{distribution:\'[8,10)\',percentage:0.04034},{distribution:\'[80,100)\',percentage:0.03034}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v197, v0

    .line 929
    move-object/from16 v0, v196

    move-object/from16 v1, v197

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 930
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v196

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 932
    new-instance v198, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v198 .. v198}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 933
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v198

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 934
    const-string v0, "1"

    move-object/from16 v1, v198

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 935
    const-string v0, "[50,54]"

    move-object/from16 v1, v198

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 936
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.27346},{distribution:\'[10,15)\',percentage:0.06624},{distribution:\'[100,+)\',percentage:0.08964},{distribution:\'[15,20)\',percentage:0.04484},{distribution:\'[2,4)\',percentage:0.1245},{distribution:\'[20,25)\',percentage:0.03285},{distribution:\'[25,30)\',percentage:0.02713},{distribution:\'[30,35)\',percentage:0.02262},{distribution:\'[35,40)\',percentage:0.01739},{distribution:\'[4,6)\',percentage:0.08588},{distribution:\'[40,60)\',percentage:0.05421},{distribution:\'[6,8)\',percentage:0.05454},{distribution:\'[60,80)\',percentage:0.03748},{distribution:\'[8,10)\',percentage:0.04026},{distribution:\'[80,100)\',percentage:0.02897}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v199, v0

    .line 937
    move-object/from16 v0, v198

    move-object/from16 v1, v199

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 938
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v198

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 940
    new-instance v200, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v200 .. v200}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 941
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v200

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 942
    const-string v0, "1"

    move-object/from16 v1, v200

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 943
    const-string v0, "[55,59]"

    move-object/from16 v1, v200

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 944
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.30017},{distribution:\'[10,15)\',percentage:0.06802},{distribution:\'[100,+)\',percentage:0.09272},{distribution:\'[15,20)\',percentage:0.03881},{distribution:\'[2,4)\',percentage:0.12828},{distribution:\'[20,25)\',percentage:0.03034},{distribution:\'[25,30)\',percentage:0.02053},{distribution:\'[30,35)\',percentage:0.0182},{distribution:\'[35,40)\',percentage:0.0151},{distribution:\'[4,6)\',percentage:0.09032},{distribution:\'[40,60)\',percentage:0.04721},{distribution:\'[6,8)\',percentage:0.05715},{distribution:\'[60,80)\',percentage:0.02872},{distribution:\'[8,10)\',percentage:0.03937},{distribution:\'[80,100)\',percentage:0.02505}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v201, v0

    .line 945
    move-object/from16 v0, v200

    move-object/from16 v1, v201

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 946
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v200

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 948
    new-instance v202, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v202 .. v202}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 949
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v202

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 950
    const-string v0, "1"

    move-object/from16 v1, v202

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 951
    const-string v0, "[60,64]"

    move-object/from16 v1, v202

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 952
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.32131},{distribution:\'[10,15)\',percentage:0.06075},{distribution:\'[100,+)\',percentage:0.09126},{distribution:\'[15,20)\',percentage:0.03726},{distribution:\'[2,4)\',percentage:0.13749},{distribution:\'[20,25)\',percentage:0.02802},{distribution:\'[25,30)\',percentage:0.02247},{distribution:\'[30,35)\',percentage:0.01692},{distribution:\'[35,40)\',percentage:0.01359},{distribution:\'[4,6)\',percentage:0.0884},{distribution:\'[40,60)\',percentage:0.03763},{distribution:\'[6,8)\',percentage:0.05622},{distribution:\'[60,80)\',percentage:0.02663},{distribution:\'[8,10)\',percentage:0.04124},{distribution:\'[80,100)\',percentage:0.0208}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v203, v0

    .line 953
    move-object/from16 v0, v202

    move-object/from16 v1, v203

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 954
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v202

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 956
    new-instance v204, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v204 .. v204}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 957
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v204

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 958
    const-string v0, "1"

    move-object/from16 v1, v204

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 959
    const-string v0, "[65,69]"

    move-object/from16 v1, v204

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 960
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.34728},{distribution:\'[10,15)\',percentage:0.06039},{distribution:\'[100,+)\',percentage:0.08223},{distribution:\'[15,20)\',percentage:0.03671},{distribution:\'[2,4)\',percentage:0.14629},{distribution:\'[20,25)\',percentage:0.02331},{distribution:\'[25,30)\',percentage:0.01744},{distribution:\'[30,35)\',percentage:0.01634},{distribution:\'[35,40)\',percentage:0.01358},{distribution:\'[4,6)\',percentage:0.08352},{distribution:\'[40,60)\',percentage:0.03469},{distribution:\'[6,8)\',percentage:0.06002},{distribution:\'[60,80)\',percentage:0.02643},{distribution:\'[8,10)\',percentage:0.03341},{distribution:\'[80,100)\',percentage:0.01836}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v205, v0

    .line 961
    move-object/from16 v0, v204

    move-object/from16 v1, v205

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 962
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v204

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 964
    new-instance v206, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v206 .. v206}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 965
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v206

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 966
    const-string v0, "1"

    move-object/from16 v1, v206

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 967
    const-string v0, "[70,74]"

    move-object/from16 v1, v206

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 968
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.37851},{distribution:\'[10,15)\',percentage:0.05796},{distribution:\'[100,+)\',percentage:0.07089},{distribution:\'[15,20)\',percentage:0.02586},{distribution:\'[2,4)\',percentage:0.1498},{distribution:\'[20,25)\',percentage:0.02185},{distribution:\'[25,30)\',percentage:0.01872},{distribution:\'[30,35)\',percentage:0.0058},{distribution:\'[35,40)\',percentage:0.01337},{distribution:\'[4,6)\',percentage:0.08159},{distribution:\'[40,60)\',percentage:0.03121},{distribution:\'[6,8)\',percentage:0.06019},{distribution:\'[60,80)\',percentage:0.02764},{distribution:\'[8,10)\',percentage:0.03745},{distribution:\'[80,100)\',percentage:0.01917}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v207, v0

    .line 969
    move-object/from16 v0, v206

    move-object/from16 v1, v207

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 970
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v206

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    .line 972
    new-instance v208, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct/range {v208 .. v208}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 973
    const-string v0, "monthlyRunDistance"

    move-object/from16 v1, v208

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 974
    const-string v0, "1"

    move-object/from16 v1, v208

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 975
    const-string v0, "[75,+)"

    move-object/from16 v1, v208

    invoke-virtual {v1, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 976
    new-instance v0, Lorg/json/JSONArray;

    const-string v1, "[{distribution:\'(0,2)\',percentage:0.37876},{distribution:\'[10,15)\',percentage:0.06513},{distribution:\'[100,+)\',percentage:0.04058},{distribution:\'[15,20)\',percentage:0.02756},{distribution:\'[2,4)\',percentage:0.15431},{distribution:\'[20,25)\',percentage:0.02355},{distribution:\'[25,30)\',percentage:0.02204},{distribution:\'[30,35)\',percentage:0.01804},{distribution:\'[35,40)\',percentage:0.01253},{distribution:\'[4,6)\',percentage:0.09118},{distribution:\'[40,60)\',percentage:0.03858},{distribution:\'[6,8)\',percentage:0.05461},{distribution:\'[60,80)\',percentage:0.02204},{distribution:\'[8,10)\',percentage:0.03407},{distribution:\'[80,100)\',percentage:0.01703}]"

    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move-object/from16 v209, v0

    .line 977
    move-object/from16 v0, v208

    move-object/from16 v1, v209

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 978
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxd;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    move-object/from16 v1, v208

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 981
    goto :goto_0

    .line 979
    :catch_0
    move-exception v2

    .line 980
    sget-object v0, Lo/dxd;->b:Ljava/lang/String;

    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 982
    :goto_0
    return-void
.end method
