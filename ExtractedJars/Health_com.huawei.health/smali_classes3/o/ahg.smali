.class public Lo/ahg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ahg$b;
    }
.end annotation


# static fields
.field private static a:Lo/ahg;

.field private static b:[B


# instance fields
.field private c:Lo/ahg$b;

.field private d:I

.field private e:I

.field private final f:Landroid/content/BroadcastReceiver;

.field private final k:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 63
    const/4 v0, 0x1

    new-array v0, v0, [B

    sput-object v0, Lo/ahg;->b:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const/4 v0, -0x1

    iput v0, p0, Lo/ahg;->d:I

    .line 66
    const/4 v0, -0x1

    iput v0, p0, Lo/ahg;->e:I

    .line 303
    new-instance v0, Lo/ahg$2;

    invoke-direct {v0, p0}, Lo/ahg$2;-><init>(Lo/ahg;)V

    iput-object v0, p0, Lo/ahg;->k:Landroid/content/BroadcastReceiver;

    .line 329
    new-instance v0, Lo/ahg$4;

    invoke-direct {v0, p0}, Lo/ahg$4;-><init>(Lo/ahg;)V

    iput-object v0, p0, Lo/ahg;->f:Landroid/content/BroadcastReceiver;

    .line 85
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    const-string v0, "PluginDevice_DeviceInfoUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceInfoUtils init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    invoke-direct {p0}, Lo/ahg;->i()V

    .line 88
    invoke-direct {p0}, Lo/ahg;->g()V

    .line 90
    :cond_0
    return-void
.end method

.method public static a()Lo/ahg;
    .locals 3

    .line 68
    sget-object v1, Lo/ahg;->b:[B

    monitor-enter v1

    .line 69
    :try_start_0
    sget-object v0, Lo/ahg;->a:Lo/ahg;

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Lo/ahg;

    invoke-direct {v0}, Lo/ahg;-><init>()V

    sput-object v0, Lo/ahg;->a:Lo/ahg;

    .line 72
    :cond_0
    sget-object v0, Lo/ahg;->a:Lo/ahg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 73
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic c(Lo/ahg;I)I
    .locals 0

    .line 28
    iput p1, p0, Lo/ahg;->e:I

    return p1
.end method

.method static synthetic e(Lo/ahg;I)I
    .locals 0

    .line 28
    iput p1, p0, Lo/ahg;->d:I

    return p1
.end method

.method private g()V
    .locals 5

    .line 322
    const-string v0, "PluginDevice_DeviceInfoUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter registHealthDataBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.FITNESS_DATA_TODAY_SYNC"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 324
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/ahg;->f:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 325
    return-void
.end method

.method private i()V
    .locals 5

    .line 298
    const-string v0, "PluginDevice_DeviceInfoUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter registerBattery"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.BATTERY_LEVEL"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 300
    const-string v0, "com.huawei.bone.action.BATTERY_LEVEL"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 301
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/ahg;->k:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 302
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 79
    iput p1, p0, Lo/ahg;->d:I

    .line 80
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .line 125
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-interface {v0, p1}, Lo/ahg$b;->e(Ljava/util/List;)V

    .line 128
    :cond_0
    return-void
.end method

.method public b(I)I
    .locals 1

    .line 231
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_0

    .line 232
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-interface {v0, p1}, Lo/ahg$b;->d(I)I

    move-result v0

    return v0

    .line 234
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 2

    .line 130
    new-instance v1, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;-><init>()V

    .line 131
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-interface {v0}, Lo/ahg$b;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    .line 134
    :cond_0
    return-object v1
.end method

.method public b(Lo/ahg$b;)V
    .locals 4

    .line 93
    const-string v0, "PluginDevice_DeviceInfoUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerWearInfoCallback() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    iput-object p1, p0, Lo/ahg;->c:Lo/ahg$b;

    .line 95
    return-void
.end method

.method public c(I)Ljava/lang/String;
    .locals 1

    .line 282
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_0

    .line 283
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-interface {v0, p1}, Lo/ahg$b;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 285
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public c()Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/ahh;>;"
        }
    .end annotation

    .line 154
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 155
    invoke-virtual {p0}, Lo/ahg;->d()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_8

    .line 156
    invoke-virtual {p0}, Lo/ahg;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 157
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/ahg;->e(I)I

    move-result v8

    .line 158
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/ahg;->b(I)I

    move-result v9

    .line 159
    new-instance v10, Lo/ahh;

    invoke-direct {v10}, Lo/ahh;-><init>()V

    .line 160
    invoke-virtual {v10, v7, v8, v9}, Lo/ahh;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;II)V

    .line 161
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {v10, v0}, Lo/ahh;->e(I)V

    .line 163
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 165
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 166
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 167
    :cond_1
    const-string v0, "PORSCHE DESIGN"

    invoke-virtual {v10, v0}, Lo/ahh;->d(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 169
    :cond_2
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lo/ahg;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 170
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-virtual {p0}, Lo/ahg;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    invoke-interface {v0, v1}, Lo/ahg$b;->i(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/ahh;->d(Ljava/lang/String;)V

    .line 171
    const-string v0, "PluginDevice_DeviceInfoUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device name is null ,device name :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-virtual {p0}, Lo/ahg;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v4

    invoke-interface {v3, v4}, Lo/ahg$b;->i(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 175
    :cond_3
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 176
    :cond_4
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 177
    :cond_5
    const-string v0, "PORSCHE DESIGN"

    invoke-virtual {v10, v0}, Lo/ahh;->d(Ljava/lang/String;)V

    goto :goto_1

    .line 179
    :cond_6
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/ahh;->d(Ljava/lang/String;)V

    .line 183
    :cond_7
    :goto_1
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    goto/16 :goto_0

    .line 186
    :cond_8
    return-object v5
.end method

.method public c(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Ljava/util/ArrayList<Lo/ahh;>;"
        }
    .end annotation

    .line 190
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 191
    invoke-virtual {p0}, Lo/ahg;->d()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_a

    .line 192
    invoke-virtual {p0}, Lo/ahg;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 193
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v8

    .line 194
    invoke-static {v8}, Lo/dat;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 195
    goto :goto_0

    .line 197
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 198
    goto :goto_0

    .line 200
    :cond_1
    invoke-virtual {p0, v8}, Lo/ahg;->e(I)I

    move-result v9

    .line 201
    invoke-virtual {p0, v8}, Lo/ahg;->b(I)I

    move-result v10

    .line 202
    new-instance v11, Lo/ahh;

    invoke-direct {v11}, Lo/ahh;-><init>()V

    .line 203
    invoke-virtual {v11, v7, v9, v10}, Lo/ahh;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;II)V

    .line 204
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {v11, v0}, Lo/ahh;->e(I)V

    .line 205
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 207
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 208
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 209
    :cond_3
    const-string v0, "PORSCHE DESIGN"

    invoke-virtual {v11, v0}, Lo/ahh;->d(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 211
    :cond_4
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_9

    .line 212
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-virtual {p0}, Lo/ahg;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    invoke-interface {v0, v1}, Lo/ahg$b;->i(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/ahh;->d(Ljava/lang/String;)V

    .line 213
    const-string v0, "PluginDevice_DeviceInfoUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device name is null ,device name :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-virtual {p0}, Lo/ahg;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v4

    invoke-interface {v3, v4}, Lo/ahg$b;->i(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 217
    :cond_5
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 218
    :cond_6
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 219
    :cond_7
    const-string v0, "PORSCHE DESIGN"

    invoke-virtual {v11, v0}, Lo/ahh;->d(Ljava/lang/String;)V

    goto :goto_1

    .line 221
    :cond_8
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/ahh;->d(Ljava/lang/String;)V

    .line 224
    :cond_9
    :goto_1
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    goto/16 :goto_0

    .line 227
    :cond_a
    return-object v5
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-interface {v0}, Lo/ahg$b;->c()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 122
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(I)Z
    .locals 1

    .line 276
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_0

    .line 277
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-interface {v0, p1}, Lo/ahg$b;->c(I)Z

    move-result v0

    return v0

    .line 279
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d(Ljava/lang/String;)Z
    .locals 5

    .line 251
    const/4 v1, 0x0

    .line 252
    invoke-virtual {p0}, Lo/ahg;->e()Ljava/util/List;

    move-result-object v2

    .line 253
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 254
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    const/4 v0, 0x1

    return v0

    .line 257
    :cond_0
    goto :goto_0

    .line 259
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public e(I)I
    .locals 1

    .line 237
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-interface {v0, p1}, Lo/ahg$b;->b(I)I

    move-result v0

    return v0

    .line 240
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .line 138
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 139
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_1

    .line 140
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-interface {v0}, Lo/ahg$b;->c()Ljava/util/List;

    move-result-object v3

    .line 141
    if-eqz v3, :cond_1

    .line 142
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 143
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 144
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    :cond_0
    goto :goto_0

    .line 150
    :cond_1
    return-object v2
.end method

.method public k()V
    .locals 1

    .line 263
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_0

    .line 264
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-interface {v0}, Lo/ahg$b;->b()V

    .line 266
    :cond_0
    return-void
.end method

.method public k(I)Z
    .locals 1

    .line 289
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    if-eqz v0, :cond_0

    .line 290
    iget-object v0, p0, Lo/ahg;->c:Lo/ahg$b;

    invoke-interface {v0, p1}, Lo/ahg$b;->e(I)Z

    move-result v0

    return v0

    .line 292
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
