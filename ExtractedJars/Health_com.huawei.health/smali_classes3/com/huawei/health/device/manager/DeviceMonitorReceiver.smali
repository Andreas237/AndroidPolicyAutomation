.class public Lcom/huawei/health/device/manager/DeviceMonitorReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;
    }
.end annotation


# static fields
.field private static c:Z


# instance fields
.field private a:Z

.field private b:Lo/afi;

.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 48
    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->c:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 41
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 43
    new-instance v0, Lo/afi;

    const-string v1, "bloodPressure"

    invoke-direct {v0, v1}, Lo/afi;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->b:Lo/afi;

    .line 47
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->a:Z

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Lo/acl$a;)I
    .locals 1

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->b(Lo/acl$a;)I

    move-result v0

    return v0
.end method

.method private a(Landroid/content/Intent;)V
    .locals 23

    .line 204
    const-string v0, "kind"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 205
    const-string v0, "address"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 208
    const/4 v7, 0x0

    .line 210
    const-string v0, "bloodPressureDataList"

    move-object/from16 v1, p1

    :try_start_0
    invoke-virtual {v1, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 213
    goto :goto_0

    .line 211
    :catch_0
    move-exception v8

    .line 212
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMonitorReceiver ArrayIndexOutOfBoundsException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/ArrayIndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    :goto_0
    if-nez v7, :cond_0

    .line 216
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver  arrayList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    return-void

    .line 219
    :cond_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    .line 221
    const-string v9, "com.huawei.ui.main.stories.health.activity.healthdata.BloodpresureActivity"

    .line 230
    const/16 v17, 0x0

    .line 231
    new-instance v18, Lo/age;

    invoke-direct/range {v18 .. v18}, Lo/age;-><init>()V

    .line 232
    invoke-static {v5}, Lo/acl$a;->valueOf(Ljava/lang/String;)Lo/acl$a;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->b(Lo/acl$a;)I

    move-result v19

    .line 233
    new-instance v0, Lo/afh;

    move-object v2, v6

    move/from16 v3, v19

    const/4 v1, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/afh;-><init>(ILjava/lang/String;I)V

    move-object/from16 v20, v0

    .line 236
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->b:Lo/afi;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Lo/afi;->e(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v15

    .line 237
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "newest timeStamp is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, v15

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    const/16 v21, 0x0

    :goto_1
    move/from16 v0, v21

    if-ge v0, v8, :cond_2

    .line 240
    move/from16 v0, v21

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Landroid/os/Bundle;

    .line 241
    const-string v0, "systolic"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getShort(Ljava/lang/String;)S

    move-result v10

    .line 242
    const-string v0, "diastolic"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getShort(Ljava/lang/String;)S

    move-result v11

    .line 243
    const-string v0, "heartRate"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getShort(Ljava/lang/String;)S

    move-result v12

    .line 244
    const-string v0, "time"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v13

    .line 245
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "current time is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    cmp-long v0, v13, v15

    if-lez v0, :cond_1

    .line 249
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->b:Lo/afi;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v6, v13, v14}, Lo/afi;->b(Landroid/content/Context;Ljava/lang/String;J)V

    .line 250
    add-int/lit8 v17, v17, 0x1

    .line 252
    move-object/from16 v0, v18

    invoke-virtual {v0, v13, v14}, Lo/age;->e(J)V

    .line 253
    move-object/from16 v0, v18

    invoke-virtual {v0, v13, v14}, Lo/age;->d(J)V

    .line 254
    move-object/from16 v0, v18

    invoke-virtual {v0, v10}, Lo/age;->c(S)V

    .line 255
    move-object/from16 v0, v18

    invoke-virtual {v0, v11}, Lo/age;->a(S)V

    .line 256
    move-object/from16 v0, v18

    invoke-virtual {v0, v12}, Lo/age;->d(S)V

    .line 258
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v0, v0, Lo/afj$a;->c:Ljava/lang/String;

    sget-object v1, Lo/dae;->fU:Lo/dae;

    move-object/from16 v2, p0

    move-object/from16 v3, v18

    invoke-direct {v2, v0, v6, v1, v3}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(Ljava/lang/String;Ljava/lang/String;Lo/dae;Lo/afz;)V

    .line 261
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v0, v0, Lo/afj$a;->c:Ljava/lang/String;

    move-object/from16 v1, p0

    const/16 v2, 0x640

    move-object/from16 v3, v18

    invoke-direct {v1, v0, v2, v3}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->d(Ljava/lang/String;ILo/afz;)V

    .line 263
    move-object/from16 v0, p0

    move-object/from16 v1, v20

    move-object/from16 v2, v18

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->a(Lo/afh;Lo/afz;)V

    .line 239
    :cond_1
    add-int/lit8 v21, v21, 0x1

    goto/16 :goto_1

    .line 267
    :cond_2
    if-lez v17, :cond_3

    .line 268
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMonitorReceiver the number of data is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-direct {v0, v1, v9}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(ILjava/lang/String;)V

    goto :goto_2

    .line 271
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver no valid data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    :goto_2
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;ILo/afz;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->d(Ljava/lang/String;ILo/afz;)V

    return-void
.end method

.method private a(Lo/afh;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/afh;Ljava/util/List<Lo/afz;>;)V"
        }
    .end annotation

    .line 488
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 489
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afz;

    invoke-direct {p0, p1, v0}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->a(Lo/afh;Lo/afz;)V

    .line 488
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 491
    :cond_0
    return-void
.end method

.method private a(Lo/afh;Lo/afz;)V
    .locals 1

    .line 494
    invoke-virtual {p1, p2}, Lo/afh;->e(Lo/afz;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    .line 495
    invoke-virtual {p1, v0}, Lo/afh;->c(Lcom/huawei/hihealth/HiHealthData;)V

    .line 496
    return-void
.end method

.method private b(Lo/acl$a;)I
    .locals 2

    .line 300
    sget-object v0, Lo/acl$a;->a:Lo/acl$a;

    if-ne p1, v0, :cond_0

    .line 301
    const/16 v1, 0x2712

    goto :goto_0

    .line 303
    :cond_0
    sget-object v0, Lo/acl$a;->d:Lo/acl$a;

    if-ne p1, v0, :cond_1

    .line 304
    const/16 v1, 0x2711

    goto :goto_0

    .line 306
    :cond_1
    sget-object v0, Lo/acl$a;->c:Lo/acl$a;

    if-ne p1, v0, :cond_2

    .line 307
    const/16 v1, 0x2716

    goto :goto_0

    .line 309
    :cond_2
    sget-object v0, Lo/acl$a;->g:Lo/acl$a;

    if-ne p1, v0, :cond_3

    .line 310
    const v1, 0xc351

    goto :goto_0

    .line 313
    :cond_3
    const/4 v0, -0x1

    return v0

    .line 315
    :goto_0
    return v1
.end method

.method static synthetic b(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;ILjava/lang/String;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;Ljava/lang/String;Lo/dae;Lo/afz;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(Ljava/lang/String;Ljava/lang/String;Lo/dae;Lo/afz;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Lo/afh;Ljava/util/List;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->a(Lo/afh;Ljava/util/List;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Lo/afh;Lo/afz;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->a(Lo/afh;Lo/afz;)V

    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Lo/dae;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Lo/dae;Ljava/util/List<Lo/afz;>;)V"
        }
    .end annotation

    .line 467
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 468
    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afz;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(Ljava/lang/String;Ljava/lang/String;Lo/dae;Lo/afz;)V

    .line 467
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 470
    :cond_0
    return-void
.end method

.method private d(Landroid/os/Bundle;)Lo/age;
    .locals 12

    .line 180
    new-instance v4, Lo/age;

    invoke-direct {v4}, Lo/age;-><init>()V

    .line 181
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/age;->e(J)V

    .line 182
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/age;->d(J)V

    .line 183
    const/4 v5, 0x0

    .line 184
    const/4 v6, 0x0

    .line 185
    const/4 v7, 0x0

    .line 186
    const-string v0, "low"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 187
    const-string v0, "high"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 188
    const-string v0, "heart"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 190
    :try_start_0
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move v5, v0

    .line 191
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move v6, v0

    .line 192
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v7, v0

    .line 195
    goto :goto_0

    .line 193
    :catch_0
    move-exception v11

    .line 194
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMonitorReceiver e1="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    :goto_0
    int-to-short v0, v6

    invoke-virtual {v4, v0}, Lo/age;->c(S)V

    .line 197
    int-to-short v0, v5

    invoke-virtual {v4, v0}, Lo/age;->a(S)V

    .line 198
    int-to-short v0, v7

    invoke-virtual {v4, v0}, Lo/age;->d(S)V

    .line 199
    return-object v4
.end method

.method static synthetic d(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;Ljava/lang/String;Lo/dae;Ljava/util/List;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->c(Ljava/lang/String;Ljava/lang/String;Lo/dae;Ljava/util/List;)V

    return-void
.end method

.method private d(Ljava/lang/String;ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILjava/util/List<Lo/afz;>;)V"
        }
    .end annotation

    .line 430
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/afz;

    .line 431
    invoke-direct {p0, p1, p2, v2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->d(Ljava/lang/String;ILo/afz;)V

    .line 432
    goto :goto_0

    .line 433
    :cond_0
    return-void
.end method

.method private d(Ljava/lang/String;ILo/afz;)V
    .locals 7

    .line 436
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 437
    const-string v0, "device_name"

    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    const-string v0, "device_type"

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 440
    invoke-virtual {p3}, Lo/afz;->k()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 441
    const-string v0, "measure_time"

    invoke-interface {v3, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    .line 443
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v6, v3}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 444
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;)Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e:Ljava/lang/String;

    return-object v0
.end method

.method private e(ILjava/lang/String;)V
    .locals 9

    .line 277
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 278
    const-string v5, "com.huawei.health"

    .line 279
    invoke-virtual {v4, v5, p2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 280
    const/high16 v0, 0x4000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 281
    const-string v0, "refreshCard"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 282
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    const/high16 v2, 0x8000000

    invoke-static {v0, v1, v4, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v6

    .line 284
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dbc;->e()Landroid/app/Notification$Builder;

    move-result-object v7

    .line 285
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v7}, Lo/ene;->c(Landroid/content/Context;Landroid/app/Notification$Builder;)V

    .line 286
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_recive:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 287
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 288
    invoke-virtual {v7, v6}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 291
    invoke-virtual {v7}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v8

    .line 292
    iget v0, v8, Landroid/app/Notification;->flags:I

    or-int/lit8 v0, v0, 0x10

    iput v0, v8, Landroid/app/Notification;->flags:I

    .line 294
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    const v1, 0x133f07a

    invoke-virtual {v0, v1, v8}, Lo/dbc;->b(ILandroid/app/Notification;)V

    .line 295
    return-void
.end method

.method private e(Landroid/content/Intent;Lo/abx;Ljava/lang/String;)V
    .locals 14

    .line 123
    const-string v0, "productId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 124
    const-string v0, "825c82bd-84fe-44a0-9884-6a764bd73183"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    const-string v5, "com.huawei.ui.main.stories.health.activity.healthdata.BloodpresureActivity"

    .line 126
    const-string v0, "healthdata"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    .line 127
    const-string v0, "product_mac"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 128
    invoke-static/range {p3 .. p3}, Lo/acl$a;->valueOf(Ljava/lang/String;)Lo/acl$a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->b(Lo/acl$a;)I

    move-result v8

    .line 129
    new-instance v9, Lo/afh;

    const/4 v0, 0x0

    invoke-direct {v9, v0, v7, v8}, Lo/afh;-><init>(ILjava/lang/String;I)V

    .line 130
    invoke-direct {p0, v6}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->d(Landroid/os/Bundle;)Lo/age;

    move-result-object v10

    .line 131
    invoke-direct {p0, v9, v10}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->a(Lo/afh;Lo/afz;)V

    .line 132
    const/4 v0, 0x1

    invoke-direct {p0, v0, v5}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(ILjava/lang/String;)V

    .line 133
    goto/16 :goto_2

    .line 134
    :cond_0
    const-string v0, "healthdata"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    .line 135
    const-string v0, "product_bluetoothname"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 136
    const-string v0, "product_mac"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 137
    new-instance v8, Lo/ack;

    invoke-direct {v8, v6, v7, v7}, Lo/ack;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    invoke-static/range {p3 .. p3}, Lo/acl$a;->valueOf(Ljava/lang/String;)Lo/acl$a;

    move-result-object v9

    .line 140
    sget-object v0, Lo/acl$a;->d:Lo/acl$a;

    if-ne v9, v0, :cond_1

    .line 141
    new-instance v10, Lo/afy;

    invoke-direct {v10}, Lo/afy;-><init>()V

    .line 142
    const-string v0, "bloodsugar"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 143
    const/4 v12, 0x0

    .line 145
    :try_start_0
    invoke-static {v11}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v12, v0

    .line 148
    goto :goto_0

    .line 146
    :catch_0
    move-exception v13

    .line 147
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMonitorReceiver e1="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    :goto_0
    invoke-virtual {v10, v12}, Lo/afy;->b(F)V

    .line 150
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lo/afy;->e(J)V

    .line 151
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lo/afy;->d(J)V

    .line 152
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lo/afy;->c(I)V

    .line 153
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 154
    invoke-interface {v13, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    move-object/from16 v0, p2

    invoke-interface {v0, v8, v13}, Lo/abx;->onDataChanged(Lo/acl;Ljava/util/List;)V

    .line 157
    goto/16 :goto_2

    :cond_1
    sget-object v0, Lo/acl$a;->a:Lo/acl$a;

    if-ne v9, v0, :cond_2

    .line 158
    invoke-direct {p0, v5}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->d(Landroid/os/Bundle;)Lo/age;

    move-result-object v10

    .line 159
    move-object/from16 v0, p2

    invoke-interface {v0, v8, v10}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 160
    goto/16 :goto_2

    :cond_2
    sget-object v0, Lo/acl$a;->c:Lo/acl$a;

    if-ne v9, v0, :cond_3

    .line 161
    new-instance v10, Lo/agg;

    invoke-direct {v10}, Lo/agg;-><init>()V

    .line 162
    const-string v0, "weight"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 163
    const/4 v12, 0x0

    .line 165
    :try_start_1
    invoke-static {v11}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    move v12, v0

    .line 168
    goto :goto_1

    .line 166
    :catch_1
    move-exception v13

    .line 167
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMonitorReceiver e1="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    :goto_1
    invoke-virtual {v10, v12}, Lo/agg;->e(F)V

    .line 170
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-virtual {v10, v0}, Lo/agg;->b(F)V

    .line 171
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lo/agg;->e(J)V

    .line 172
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lo/agg;->d(J)V

    .line 173
    move-object/from16 v0, p2

    invoke-interface {v0, v8, v10}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 176
    :cond_3
    :goto_2
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;ILjava/util/List;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->d(Ljava/lang/String;ILjava/util/List;)V

    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Lo/dae;Lo/afz;)V
    .locals 7

    .line 473
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 474
    const-string v0, "macAddress"

    invoke-static {p2}, Lo/ahb;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    const-string v0, "device_name"

    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    const-string v0, "device_type"

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 479
    invoke-virtual {p4}, Lo/afz;->k()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 480
    const-string v0, "measure_time"

    invoke-interface {v3, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    invoke-virtual {p3}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 483
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 484
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxf;->d(Landroid/content/Context;)V

    .line 485
    return-void
.end method

.method public static e(Z)V
    .locals 0

    .line 55
    sput-boolean p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->c:Z

    .line 56
    return-void
.end method

.method public static e()Z
    .locals 1

    .line 59
    sget-boolean v0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->c:Z

    return v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 65
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 66
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMonitorReceiver Received action "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", this = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    if-eqz v4, :cond_1

    .line 68
    const-string v0, "com.huawei.health.action.DEVICE_OCCUPIED"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver Received action 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(Z)V

    .line 71
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->a:Z

    .line 72
    return-void

    .line 73
    :cond_0
    const-string v0, "com.huawei.health.action.DEVICE_AVAILABLE"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver Received action 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(Z)V

    .line 76
    iget-boolean v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->a:Z

    if-nez v0, :cond_1

    .line 77
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->a:Z

    .line 78
    return-void

    .line 83
    :cond_1
    invoke-static {}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 84
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver backgroundMeasureChannel blocked"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    return-void

    .line 88
    :cond_2
    const-string v0, "productId"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 90
    if-nez v5, :cond_3

    .line 91
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver productId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void

    .line 95
    :cond_3
    invoke-static {p1}, Lo/ahj;->b(Landroid/content/Context;)V

    .line 97
    iput-object v5, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e:Ljava/lang/String;

    .line 99
    const-string v0, "825c82bd-84fe-44a0-9884-6a764bd73183"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 101
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver product is Omron bloodPressure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    const-string v0, "autotest"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 103
    const-string v0, "kind"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 104
    new-instance v0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;

    invoke-direct {v0, p0, v5, v6}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;-><init>(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p2, v0, v6}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(Landroid/content/Intent;Lo/abx;Ljava/lang/String;)V

    .line 105
    goto :goto_0

    .line 106
    :cond_4
    invoke-direct {p0, p2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->a(Landroid/content/Intent;)V

    goto :goto_0

    .line 108
    :cond_5
    const-string v0, "com.huawei.health.action.DEVICE_DISCONNECTED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 109
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver action is Disconnect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->h(Ljava/lang/String;)V

    goto :goto_0

    .line 112
    :cond_6
    const-string v0, "autotest"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 113
    const-string v0, "kind"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 114
    new-instance v0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;

    invoke-direct {v0, p0, v5, v6}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;-><init>(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p2, v0, v6}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(Landroid/content/Intent;Lo/abx;Ljava/lang/String;)V

    .line 115
    goto :goto_0

    .line 116
    :cond_7
    const-string v0, "kind"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 117
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;

    invoke-direct {v1, p0, v5, v6}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;-><init>(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5, v1}, Lo/afd;->a(Ljava/lang/String;Lo/abx;)Z

    .line 120
    :goto_0
    return-void
.end method
