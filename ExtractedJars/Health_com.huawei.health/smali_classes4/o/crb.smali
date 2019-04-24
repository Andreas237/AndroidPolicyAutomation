.class public Lo/crb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crb$b;
    }
.end annotation


# static fields
.field private static a:Landroid/content/Context;


# instance fields
.field private b:Lo/cqa;

.field private c:Lo/cpr;

.field private d:Lo/cqs;

.field private e:Lo/cpw;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    iput-object v0, p0, Lo/crb;->b:Lo/cqa;

    .line 58
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    iput-object v0, p0, Lo/crb;->d:Lo/cqs;

    .line 59
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    iput-object v0, p0, Lo/crb;->c:Lo/cpr;

    .line 60
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    iput-object v0, p0, Lo/crb;->e:Lo/cpw;

    .line 61
    return-void
.end method

.method synthetic constructor <init>(Lo/crb$1;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lo/crb;-><init>()V

    return-void
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 222
    invoke-static {p1}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-le v0, v1, :cond_0

    .line 224
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 225
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    .line 224
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 227
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method private d()V
    .locals 8

    .line 205
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 206
    iget-object v0, p0, Lo/crb;->b:Lo/cqa;

    invoke-virtual {v0, v4}, Lo/cqa;->e(Ljava/lang/String;)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v5

    .line 207
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 208
    const-string v0, "HiH_HiDataClientStore"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateModelColumnOnLocalPhone device "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v4}, Lo/crb;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "is not exist!"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    return-void

    .line 211
    :cond_0
    const-string v0, "HiH_HiDataClientStore"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateModelColumnOnLocalPhone deviceInfo:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceID()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "--"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 212
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "--"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "--"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lo/crb;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 211
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 214
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 215
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpo;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 216
    const-string v0, "model"

    invoke-virtual {v6, v0, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    iget-object v0, p0, Lo/crb;->b:Lo/cqa;

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceID()I

    move-result v1

    invoke-virtual {v0, v1, v6}, Lo/cqa;->a(ILandroid/content/ContentValues;)I

    .line 219
    :cond_1
    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/crb;
    .locals 1

    .line 72
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/crb;->a:Landroid/content/Context;

    .line 73
    sget-object v0, Lo/crb$b;->e:Lo/crb;

    return-object v0
.end method


# virtual methods
.method public a(ILcom/huawei/hihealth/HiTimeInterval;I)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/hihealth/HiTimeInterval;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthClient;>;"
        }
    .end annotation

    .line 152
    const/4 v6, 0x0

    .line 153
    const/16 v0, 0x3e8

    if-gt p1, v0, :cond_1

    .line 154
    const/4 v0, 0x2

    if-ne v0, p1, :cond_0

    .line 155
    const/4 v7, 0x2

    new-array v7, v7, [I

    fill-array-data v7, :array_0

    .line 156
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpy;->d(Landroid/content/Context;)Lo/cpy;

    move-result-object v0

    .line 157
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiTimeInterval;->getStartTime()J

    move-result-wide v1

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiTimeInterval;->getEndTime()J

    move-result-wide v3

    move-object v5, v7

    invoke-virtual/range {v0 .. v5}, Lo/cpy;->c(JJ[I)Ljava/util/List;

    move-result-object v6

    .line 158
    goto/16 :goto_0

    .line 159
    :cond_0
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpy;->d(Landroid/content/Context;)Lo/cpy;

    move-result-object v0

    .line 160
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiTimeInterval;->getStartTime()J

    move-result-wide v1

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiTimeInterval;->getEndTime()J

    move-result-wide v3

    move v5, p1

    invoke-virtual/range {v0 .. v5}, Lo/cpy;->a(JJI)Ljava/util/List;

    move-result-object v6

    goto :goto_0

    .line 162
    :cond_1
    const/16 v0, 0xbb8

    if-gt p1, v0, :cond_2

    .line 163
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    .line 164
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiTimeInterval;->getStartTime()J

    move-result-wide v1

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiTimeInterval;->getEndTime()J

    move-result-wide v3

    move v5, p1

    invoke-virtual/range {v0 .. v5}, Lo/cqg;->d(JJI)Ljava/util/List;

    move-result-object v6

    goto :goto_0

    .line 165
    :cond_2
    const/16 v0, 0x5208

    if-gt p1, v0, :cond_3

    .line 166
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqc;->e(Landroid/content/Context;)Lo/cqc;

    move-result-object v0

    .line 167
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiTimeInterval;->getStartTime()J

    move-result-wide v1

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiTimeInterval;->getEndTime()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cqc;->e(JJ)Ljava/util/List;

    move-result-object v6

    goto :goto_0

    .line 168
    :cond_3
    const/16 v0, 0x5653

    if-gt p1, v0, :cond_4

    .line 169
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqj;->d(Landroid/content/Context;)Lo/cqj;

    move-result-object v0

    .line 170
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiTimeInterval;->getStartTime()J

    move-result-wide v1

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiTimeInterval;->getEndTime()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cqj;->d(JJ)Ljava/util/List;

    move-result-object v6

    goto :goto_0

    .line 171
    :cond_4
    const/16 v0, 0x56b7

    if-gt p1, v0, :cond_5

    .line 172
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpv;->c(Landroid/content/Context;)Lo/cpv;

    move-result-object v0

    .line 173
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiTimeInterval;->getStartTime()J

    move-result-wide v1

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiTimeInterval;->getEndTime()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cpv;->c(JJ)Ljava/util/List;

    move-result-object v6

    .line 175
    :cond_5
    :goto_0
    invoke-static {v6}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 176
    const-string v0, "HiH_HiDataClientStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthClientListByTime dataClientIDs is null timeInterval = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    const/4 v0, 0x0

    return-object v0

    .line 180
    :cond_6
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    move/from16 v1, p3

    invoke-static {v0, v1}, Lo/cqf;->d(Landroid/content/Context;I)I

    move-result v7

    .line 181
    if-gtz v7, :cond_7

    .line 182
    const-string v0, "HiH_HiDataClientStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthClientListByTime who <= 0 app = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    const/4 v0, 0x0

    return-object v0

    .line 185
    :cond_7
    iget-object v0, p0, Lo/crb;->e:Lo/cpw;

    invoke-virtual {v0, v7, v6}, Lo/cpw;->a(ILjava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 187
    invoke-direct {p0}, Lo/crb;->d()V

    .line 188
    iget-object v0, p0, Lo/crb;->b:Lo/cqa;

    invoke-virtual {v0, v8}, Lo/cqa;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    .line 189
    if-eqz v9, :cond_8

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 190
    :cond_8
    const-string v0, "HiH_HiDataClientStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthClientListByTime deviceInfos is null dataClients = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    const/4 v0, 0x0

    return-object v0

    .line 193
    :cond_9
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 194
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiDeviceInfo;

    .line 195
    const-string v0, "HiH_HiDataClientStore"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthClientListByTime deviceInfo:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceID()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "--"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 196
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "--"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v12}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "--"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-virtual {v12}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lo/crb;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 195
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    new-instance v13, Lcom/huawei/hihealth/HiHealthClient;

    invoke-direct {v13}, Lcom/huawei/hihealth/HiHealthClient;-><init>()V

    .line 198
    invoke-virtual {v13, v12}, Lcom/huawei/hihealth/HiHealthClient;->setHiDeviceInfo(Lcom/huawei/hihealth/HiDeviceInfo;)V

    .line 199
    invoke-interface {v10, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    goto :goto_1

    .line 201
    :cond_a
    return-object v10

    :array_0
    .array-data 4
        0x2
        0x385
    .end array-data
.end method

.method public a(Ljava/lang/String;I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthClient;>;"
        }
    .end annotation

    .line 116
    iget-object v0, p0, Lo/crb;->b:Lo/cqa;

    invoke-virtual {v0, p1}, Lo/cqa;->e(Ljava/lang/String;)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v4

    .line 117
    iget-object v0, p0, Lo/crb;->c:Lo/cpr;

    invoke-virtual {v0, p2}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v5

    .line 118
    iget-object v0, p0, Lo/crb;->d:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lo/cqs;->c(Ljava/lang/String;I)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v6

    .line 119
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 120
    new-instance v8, Lcom/huawei/hihealth/HiHealthClient;

    invoke-direct {v8}, Lcom/huawei/hihealth/HiHealthClient;-><init>()V

    .line 121
    invoke-virtual {v8, v4}, Lcom/huawei/hihealth/HiHealthClient;->setHiDeviceInfo(Lcom/huawei/hihealth/HiDeviceInfo;)V

    .line 122
    invoke-virtual {v8, v6}, Lcom/huawei/hihealth/HiHealthClient;->setHiUserInfo(Lcom/huawei/hihealth/HiUserInfo;)V

    .line 123
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    const-string v0, "HiH_HiDataClientStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthClientList() client = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    return-object v7
.end method

.method public b(I)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthClient;>;"
        }
    .end annotation

    .line 130
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cqf;->d(Landroid/content/Context;I)I

    move-result v4

    .line 131
    iget-object v0, p0, Lo/crb;->e:Lo/cpw;

    invoke-virtual {v0, v4}, Lo/cpw;->h(I)Ljava/util/List;

    move-result-object v5

    .line 132
    invoke-static {v5}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    const-string v0, "HiH_HiDataClientStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllHealthClientList() deviceIDs is null who = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    const/4 v0, 0x0

    return-object v0

    .line 136
    :cond_0
    iget-object v0, p0, Lo/crb;->b:Lo/cqa;

    invoke-virtual {v0, v5}, Lo/cqa;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 137
    if-eqz v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 138
    :cond_1
    const-string v0, "HiH_HiDataClientStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllHealthClientList() deviceInfos is null devices = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    const/4 v0, 0x0

    return-object v0

    .line 141
    :cond_2
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 142
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiDeviceInfo;

    .line 143
    new-instance v10, Lcom/huawei/hihealth/HiHealthClient;

    invoke-direct {v10}, Lcom/huawei/hihealth/HiHealthClient;-><init>()V

    .line 144
    invoke-virtual {v10, v9}, Lcom/huawei/hihealth/HiHealthClient;->setHiDeviceInfo(Lcom/huawei/hihealth/HiDeviceInfo;)V

    .line 145
    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    goto :goto_0

    .line 147
    :cond_3
    return-object v7
.end method

.method public c(Lcom/huawei/hihealth/HiDeviceInfo;I)Lcom/huawei/hihealth/HiHealthClient;
    .locals 8

    .line 78
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 79
    const-string v0, "HiH_HiDataClientStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDeviceInfo() null == deviceInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    const/4 v0, 0x0

    return-object v0

    .line 82
    :cond_0
    sget-object v0, Lo/crb;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cqa;->a(Lcom/huawei/hihealth/HiDeviceInfo;)Z

    move-result v4

    .line 83
    const-string v0, "HiH_HiDataClientStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDeviceInfo() change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    iget-object v0, p0, Lo/crb;->c:Lo/cpr;

    invoke-virtual {v0, p2}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v5

    .line 85
    iget-object v0, p0, Lo/crb;->d:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lo/cqs;->c(Ljava/lang/String;I)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v6

    .line 86
    new-instance v7, Lcom/huawei/hihealth/HiHealthClient;

    invoke-direct {v7}, Lcom/huawei/hihealth/HiHealthClient;-><init>()V

    .line 87
    invoke-virtual {v7, p1}, Lcom/huawei/hihealth/HiHealthClient;->setHiDeviceInfo(Lcom/huawei/hihealth/HiDeviceInfo;)V

    .line 88
    invoke-virtual {v7, v6}, Lcom/huawei/hihealth/HiHealthClient;->setHiUserInfo(Lcom/huawei/hihealth/HiUserInfo;)V

    .line 89
    const-string v0, "HiH_HiDataClientStore"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDeviceInfo() client = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const-string v2, ",appid="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",id="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    return-object v7
.end method

.method public d(Lcom/huawei/hihealth/HiDeviceInfo;Lcom/huawei/hihealth/HiUserInfo;I)Lcom/huawei/hihealth/HiHealthClient;
    .locals 7

    .line 95
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    if-gtz p3, :cond_1

    .line 96
    :cond_0
    const-string v0, "HiH_HiDataClientStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDeviceInfoWithUserInfo() null == deviceInfo or null == userInfo or app <= 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const/4 v0, 0x0

    return-object v0

    .line 100
    :cond_1
    iget-object v0, p0, Lo/crb;->b:Lo/cqa;

    invoke-virtual {v0, p1}, Lo/cqa;->a(Lcom/huawei/hihealth/HiDeviceInfo;)Z

    move-result v4

    .line 101
    const-string v0, "HiH_HiDataClientStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDeviceInfoWithUserInfo() change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iget-object v0, p0, Lo/crb;->c:Lo/cpr;

    invoke-virtual {v0, p3}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v5

    .line 105
    invoke-virtual {p2, v5}, Lcom/huawei/hihealth/HiUserInfo;->setHuid(Ljava/lang/String;)V

    .line 106
    iget-object v0, p0, Lo/crb;->d:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v5, v1}, Lo/cqs;->b(Lcom/huawei/hihealth/HiUserInfo;Ljava/lang/String;I)Z

    .line 107
    new-instance v6, Lcom/huawei/hihealth/HiHealthClient;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiHealthClient;-><init>()V

    .line 108
    invoke-virtual {v6, p1}, Lcom/huawei/hihealth/HiHealthClient;->setHiDeviceInfo(Lcom/huawei/hihealth/HiDeviceInfo;)V

    .line 109
    invoke-virtual {v6, p2}, Lcom/huawei/hihealth/HiHealthClient;->setHiUserInfo(Lcom/huawei/hihealth/HiUserInfo;)V

    .line 110
    const-string v0, "HiH_HiDataClientStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDeviceInfoWithUserInfo() client = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    return-object v6
.end method
