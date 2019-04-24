.class Lo/cwf$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwf;->d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/cwf;

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lo/cwf;Ljava/util/List;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lo/cwf$3;->d:Lo/cwf;

    iput-object p2, p0, Lo/cwf$3;->b:Ljava/util/List;

    iput-boolean p3, p0, Lo/cwf$3;->e:Z

    iput-object p4, p0, Lo/cwf$3;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 33

    .line 207
    move-object/from16 v5, p2

    check-cast v5, Ljava/util/List;

    .line 208
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 209
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf$3;->d:Lo/cwf;

    invoke-static {v0, v5}, Lo/cwf;->e(Lo/cwf;Ljava/util/List;)V

    .line 212
    :cond_0
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 213
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 214
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 215
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf$3;->d:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->d(Lo/cwf;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 216
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setEventAlarm mCurrentDeviceId  =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/cwf$3;->d:Lo/cwf;

    invoke-static {v4}, Lo/cwf;->d(Lo/cwf;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    const/4 v7, 0x0

    .line 218
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 219
    const/4 v9, 0x0

    :goto_0
    invoke-static {}, Lo/cwf;->b()I

    move-result v0

    if-ge v9, v0, :cond_3

    .line 221
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf$3;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v9, v0, :cond_1

    .line 222
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v10

    .line 224
    const/16 v0, -0x7e

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 226
    const/4 v0, 0x3

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 229
    const/4 v0, 0x3

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 231
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 233
    add-int/lit8 v0, v9, 0x1

    int-to-byte v0, v0

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto/16 :goto_1

    .line 236
    :cond_1
    add-int/lit8 v0, v9, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v11

    .line 238
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v12

    .line 240
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v13

    .line 242
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf$3;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/datatype/EventAlarmInfo;

    .line 244
    invoke-virtual {v14}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmRepeat()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    invoke-virtual {v14}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmEnable()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 246
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf$3;->d:Lo/cwf;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cwf$3;->d:Lo/cwf;

    invoke-static {v1}, Lo/cwf;->e(Lo/cwf;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v14, v1}, Lo/cwf;->b(Lo/cwf;Lcom/huawei/datatype/EventAlarmInfo;Landroid/content/Context;)I

    move-result v15

    .line 247
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5355\u6b21\u95f9\u949f enable  = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    const/4 v0, 0x0

    if-ne v0, v15, :cond_2

    .line 250
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf$3;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-virtual {v0, v15}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmEnable(I)V

    .line 253
    :cond_2
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u95f9\u949f\u72b6\u6001 enable  = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cwf$3;->b:Ljava/util/List;

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-virtual {v3}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmEnable()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf$3;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmEnable()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v15

    .line 257
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v16

    .line 259
    const/4 v0, 0x4

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v17

    .line 262
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf$3;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_hour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cwf$3;->b:Ljava/util/List;

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-virtual {v1}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_mins()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v0}, Lo/czx;->b(I)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v18

    .line 264
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v19

    .line 266
    const/4 v0, 0x5

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v20

    .line 269
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf$3;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmRepeat()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v21

    .line 271
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v22

    .line 273
    const/4 v0, 0x6

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v23

    .line 276
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf$3;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    .line 278
    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v25

    .line 280
    const/4 v0, 0x7

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v26

    .line 284
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v27

    .line 290
    invoke-virtual/range {v27 .. v27}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v28

    .line 292
    const/16 v0, 0x82

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v29

    .line 294
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    .line 296
    invoke-static/range {v30 .. v30}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v31

    .line 298
    move-object/from16 v0, v31

    array-length v0, v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v10

    .line 301
    move-object/from16 v0, v31

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 303
    :goto_1
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    add-int/2addr v7, v0

    .line 304
    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 308
    :cond_3
    invoke-static {v7}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v9

    .line 310
    array-length v0, v9

    add-int/2addr v0, v7

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v10

    .line 313
    const/16 v0, -0x7f

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 315
    invoke-virtual {v10, v9}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 317
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/nio/ByteBuffer;

    .line 318
    invoke-virtual {v12}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 319
    goto :goto_2

    .line 321
    :cond_4
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 322
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 323
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf$3;->d:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->b(Lo/cwf;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 325
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "needRespond = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-boolean v3, v3, Lo/cwf$3;->e:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/cwf$3;->e:Z

    if-eqz v0, :cond_5

    .line 327
    invoke-static {}, Lo/cwf;->e()Ljava/lang/Object;

    move-result-object v11

    monitor-enter v11

    .line 328
    :try_start_0
    invoke-static {}, Lo/cwf;->a()Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cwf$3;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 329
    monitor-exit v11

    goto :goto_3

    :catchall_0
    move-exception v32

    monitor-exit v11

    throw v32

    .line 330
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf$3;->d:Lo/cwf;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cwf$3;->b:Ljava/util/List;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/cwf;->d(Lo/cwf;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_4

    .line 333
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwf$3;->d:Lo/cwf;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cwf$3;->b:Ljava/util/List;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/cwf$3;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, v2}, Lo/cwf;->d(Lo/cwf;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 335
    :goto_4
    return-void
.end method
