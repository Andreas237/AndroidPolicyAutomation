.class public Lo/ahx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ahx$c;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/aht;>;"
        }
    .end annotation
.end field

.field private c:Lo/ahx$c;

.field private d:Lo/abz;

.field private e:Lo/acu;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lo/acu;Ljava/lang/String;Lo/abz;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/aht;>;Lo/acu;Ljava/lang/String;Lo/abz;)V"
        }
    .end annotation

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 212
    iput-object p1, p0, Lo/ahx;->b:Ljava/util/ArrayList;

    .line 213
    iput-object p2, p0, Lo/ahx;->e:Lo/acu;

    .line 214
    new-instance v0, Lo/ahx$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/ahx$c;-><init>(Lo/ahx;Lo/ahx$1;)V

    iput-object v0, p0, Lo/ahx;->c:Lo/ahx$c;

    .line 215
    iput-object p3, p0, Lo/ahx;->a:Ljava/lang/String;

    .line 216
    iput-object p4, p0, Lo/ahx;->d:Lo/abz;

    .line 217
    return-void
.end method

.method private a(I)V
    .locals 4

    .line 251
    iget-object v0, p0, Lo/ahx;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/aht;

    iget-object v2, v0, Lo/aht;->a:Lcom/huawei/hihealth/HiHealthData;

    .line 252
    new-instance v3, Lo/ahy;

    iget-object v0, p0, Lo/ahx;->e:Lo/acu;

    new-instance v1, Lo/ahx$3;

    invoke-direct {v1, p0, v2, p1}, Lo/ahx$3;-><init>(Lo/ahx;Lcom/huawei/hihealth/HiHealthData;I)V

    invoke-direct {v3, v0, v1}, Lo/ahy;-><init>(Lo/acu;Lo/abz;)V

    .line 274
    invoke-virtual {v3, v2}, Lo/ahy;->e(Lcom/huawei/hihealth/HiHealthData;)V

    .line 275
    return-void
.end method

.method static synthetic a(Lo/ahx;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lo/ahx;->d()V

    return-void
.end method

.method public static a()[I
    .locals 1

    .line 79
    const/16 v0, 0x17

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    return-object v0

    :array_0
    .array-data 4
        0x7d4
        0x7d1
        0x7ef
        0x7f0
        0x7e6
        0x7e7
        0x7e8
        0x7e9
        0x7f1
        0x7ea
        0x7eb
        0x7ec
        0x7ed
        0x7ee
        0x803
        0x804
        0x805
        0x806
        0x807
        0x808
        0x809
        0x80a
        0x80b
    .end array-data
.end method

.method static synthetic b(Lo/ahx;)Lo/abz;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/ahx;->d:Lo/abz;

    return-object v0
.end method

.method private b()V
    .locals 1

    .line 247
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/ahx;->a(I)V

    .line 248
    return-void
.end method

.method private c(Lo/acu;)Ljava/lang/String;
    .locals 3

    .line 119
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, "-1"

    invoke-virtual {p1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "0"

    invoke-virtual {p1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    :cond_0
    const-string v0, "0"

    return-object v0

    .line 122
    :cond_1
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v2

    .line 123
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-virtual {p1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 124
    const-string v0, "0"

    return-object v0

    .line 126
    :cond_2
    invoke-virtual {p1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/aht;>;)Ljava/util/ArrayList<Lcom/huawei/hihealth/HiTimeInterval;>;"
        }
    .end annotation

    .line 225
    const-string v0, "SaveClaimWeightDataTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeleteData in Data size:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 226
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 227
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/aht;

    .line 228
    new-instance v7, Lcom/huawei/hihealth/HiTimeInterval;

    invoke-direct {v7}, Lcom/huawei/hihealth/HiTimeInterval;-><init>()V

    .line 229
    iget-object v0, v6, Lo/aht;->a:Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/hihealth/HiTimeInterval;->setStartTime(J)V

    .line 230
    iget-object v0, v6, Lo/aht;->a:Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/hihealth/HiTimeInterval;->setEndTime(J)V

    .line 231
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    goto :goto_0

    .line 233
    :cond_0
    return-object v4
.end method

.method static synthetic c(Lo/ahx;)Ljava/util/ArrayList;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/ahx;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic c(Lo/ahx;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lo/ahx;->a(I)V

    return-void
.end method

.method private d()V
    .locals 6

    .line 200
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->d()Ljava/util/ArrayList;

    move-result-object v4

    .line 201
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 202
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 203
    const-string v0, "SaveClaimWeightDataTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveCloudData  device:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 204
    invoke-direct {p0}, Lo/ahx;->e()Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/ahx;->e(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 202
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    goto :goto_1

    .line 207
    :cond_1
    iget-object v0, p0, Lo/ahx;->c:Lo/ahx$c;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/ahx$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 209
    :goto_1
    return-void
.end method

.method public static d(Ljava/util/List;Lo/cma;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;Lo/cma;)V"
        }
    .end annotation

    .line 239
    new-instance v1, Lcom/huawei/hihealth/HiDataDeleteOption;

    invoke-direct {v1}, Lcom/huawei/hihealth/HiDataDeleteOption;-><init>()V

    .line 240
    invoke-virtual {v1, p0}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTimes(Ljava/util/List;)V

    .line 241
    invoke-static {}, Lo/ahx;->a()[I

    move-result-object v2

    .line 242
    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTypes([I)V

    .line 243
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v1, p1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataDeleteOption;Lo/cma;)V

    .line 244
    return-void
.end method

.method static synthetic d(Lo/ahx;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lo/ahx;->b()V

    return-void
.end method

.method private e()Lcom/huawei/hihealth/HiHealthData;
    .locals 7

    .line 107
    iget-object v0, p0, Lo/ahx;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/aht;

    iget-object v4, v0, Lo/aht;->a:Lcom/huawei/hihealth/HiHealthData;

    .line 108
    iget-object v0, p0, Lo/ahx;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/aht;

    .line 109
    iget-object v0, v6, Lo/aht;->a:Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 110
    iget-object v4, v6, Lo/aht;->a:Lcom/huawei/hihealth/HiHealthData;

    .line 112
    :cond_0
    goto :goto_0

    .line 113
    :cond_1
    const-string v0, "weight"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    .line 114
    const-string v0, "SaveClaimWeightDataTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWeightData  data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 115
    return-object v4
.end method

.method static synthetic e(Lo/ahx;)Lo/ahx$c;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/ahx;->c:Lo/ahx$c;

    return-object v0
.end method

.method private e(Lcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V
    .locals 15

    .line 130
    const-string v0, "SaveClaimWeightDataTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSingleCloudData  in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 131
    iget-object v0, p0, Lo/ahx;->e:Lo/acu;

    if-eqz v0, :cond_0

    if-nez p1, :cond_3

    .line 132
    :cond_0
    const-string v0, "SaveClaimWeightDataTask"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSingleCloudData  params error mCurrentUser:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ahx;->e:Lo/acu;

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " data:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    if-nez p1, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 133
    return-void

    .line 135
    :cond_3
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 136
    iget-object v0, p0, Lo/ahx;->e:Lo/acu;

    invoke-direct {p0, v0}, Lo/ahx;->c(Lo/acu;)Ljava/lang/String;

    move-result-object v7

    .line 137
    const-string v0, "weight"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 138
    const-string v0, "weight_impedance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v10

    .line 139
    const-string v0, "id"

    iget-object v1, p0, Lo/ahx;->a:Ljava/lang/String;

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    const-string v0, "uid"

    invoke-interface {v6, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    const-string v0, "gender"

    iget-object v1, p0, Lo/ahx;->e:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->c()B

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    const-string v0, "age"

    iget-object v1, p0, Lo/ahx;->e:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    const-string v0, "SaveClaimWeightDataTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " age ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ahx;->e:Lo/acu;

    invoke-virtual {v3}, Lo/acu;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 144
    const-string v0, "height"

    iget-object v1, p0, Lo/ahx;->e:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    const-string v0, "currentWeight"

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    mul-double/2addr v1, v8

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    const-string v0, "isDelete"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    const-wide/16 v0, 0x0

    cmpl-double v0, v10, v0

    if-lez v0, :cond_4

    .line 148
    new-instance v12, Lo/kn;

    invoke-direct {v12}, Lo/kn;-><init>()V

    .line 149
    move-object v0, v12

    iget-object v1, p0, Lo/ahx;->e:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->d()I

    move-result v1

    int-to-float v1, v1

    double-to-float v2, v8

    iget-object v3, p0, Lo/ahx;->e:Lo/acu;

    .line 150
    invoke-virtual {v3}, Lo/acu;->c()B

    move-result v3

    iget-object v4, p0, Lo/ahx;->e:Lo/acu;

    invoke-virtual {v4}, Lo/acu;->b()I

    move-result v4

    double-to-float v5, v10

    .line 149
    invoke-virtual/range {v0 .. v5}, Lo/kn;->e(FFBIF)V

    .line 151
    const-string v0, "currentFat"

    invoke-virtual {v12}, Lo/kn;->d()F

    move-result v1

    const/high16 v2, 0x41200000    # 10.0f

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    const-string v0, "bodyRes"

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    :cond_4
    new-instance v12, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;

    invoke-direct {v12}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;-><init>()V

    .line 156
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 157
    new-instance v14, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;

    invoke-direct {v14}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;-><init>()V

    .line 159
    invoke-virtual {v14, v6}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->setData(Ljava/util/Map;)V

    .line 160
    const-string v0, "0"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 161
    const-string v0, "userInfo1"

    invoke-virtual {v14, v0}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->setSid(Ljava/lang/String;)V

    goto :goto_2

    .line 163
    :cond_5
    iget-object v0, p0, Lo/ahx;->e:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->setSid(Ljava/lang/String;)V

    .line 166
    :goto_2
    const-string v0, "SaveClaimWeightDataTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Sid"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->getSid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const-string v0, "SaveClaimWeightDataTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---userInfoMap---"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 169
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    invoke-virtual {v12, v13}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->setDeviceServiceInfo(Ljava/util/List;)V

    .line 171
    move-object/from16 v0, p2

    invoke-virtual {v12, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->setDevId(Ljava/lang/String;)V

    .line 172
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lo/ahx$1;

    move-object/from16 v2, p2

    invoke-direct {v1, p0, v2}, Lo/ahx$1;-><init>(Lo/ahx;Ljava/lang/String;)V

    invoke-virtual {v0, v12, v1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;Lo/cyx;)V

    .line 197
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 221
    iget-object v0, p0, Lo/ahx;->c:Lo/ahx$c;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/ahx$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 222
    return-void
.end method
