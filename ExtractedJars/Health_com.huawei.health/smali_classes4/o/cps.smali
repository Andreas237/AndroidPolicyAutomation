.class public Lo/cps;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cps$c;
    }
.end annotation


# static fields
.field private static a:Landroid/content/Context;


# instance fields
.field private d:Lo/coe;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    sget-object v0, Lo/cps;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/coe;->e(Landroid/content/Context;)Lo/coe;

    move-result-object v0

    iput-object v0, p0, Lo/cps;->d:Lo/coe;

    .line 52
    return-void
.end method

.method synthetic constructor <init>(Lo/cps$5;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/cps;-><init>()V

    return-void
.end method

.method private b()Ljava/lang/String;
    .locals 1

    .line 378
    const-string v0, "start_time =? and end_time =? and type_id =? and client_id =? "

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 92
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    const-string v0, " CREATE INDEX  IF NOT EXISTS "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ON "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "start_time,"

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "end_time,"

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "type_id,"

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "client_id)"

    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Lcom/huawei/hihealth/HiHealthData;II)Landroid/content/ContentValues;
    .locals 4

    .line 359
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 360
    const-string v0, "start_time"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 361
    const-string v0, "end_time"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 362
    const-string v0, "type_id"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 363
    const-string v0, "value"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 364
    const-string v0, "metadata"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    const-string v0, "unit_id"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getPointUnit()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 366
    const-string v0, "client_id"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 367
    const-string v0, "merged"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 368
    const-string v0, "sync_status"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 369
    const-string v0, "timeZone"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/cnk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    const-string v0, "modified_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 371
    return-object v3
.end method

.method private c(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 570
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 571
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 573
    :pswitch_0
    move-object v0, v6

    move-object v1, p1

    const-string v2, "type_id"

    const-string v3, "value"

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lo/cpl;->b(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 574
    goto :goto_0

    .line 576
    :pswitch_1
    const-string v0, "type_id"

    invoke-static {v6, p1, v0, p3, p4}, Lo/cpl;->c(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 577
    goto :goto_0

    .line 579
    :pswitch_2
    move-object v0, v6

    move-object v1, p1

    const-string v2, "type_id"

    const-string v3, "value"

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lo/cpl;->d(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 580
    goto :goto_0

    .line 582
    :pswitch_3
    move-object v0, v6

    move-object v1, p1

    const-string v2, "type_id"

    const-string v3, "value"

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lo/cpl;->c(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 583
    goto :goto_0

    .line 585
    :pswitch_4
    move-object v0, v6

    move-object v1, p1

    const-string v2, "type_id"

    const-string v3, "value"

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lo/cpl;->e(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 586
    goto :goto_0

    .line 588
    :pswitch_5
    move-object v0, v6

    move-object v1, p1

    const-string v2, "type_id"

    const-string v3, "value"

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lo/cpl;->a(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 589
    .line 593
    :goto_0
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static c(Landroid/content/Context;)Lo/cps;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 63
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cps;->a:Landroid/content/Context;

    .line 64
    sget-object v0, Lo/cps$c;->e:Lo/cps;

    return-object v0
.end method

.method private c(JJII)[Ljava/lang/String;
    .locals 3

    .line 353
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 354
    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {p6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 353
    return-object v0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " create table  IF NOT EXISTS "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    const-string v0, "_id integer primary key  not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    const-string v0, "start_time integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    const-string v0, "end_time integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    const-string v0, "type_id integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    const-string v0, "value double,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    const-string v0, "metadata text,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    const-string v0, "unit_id integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    const-string v0, "client_id integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    const-string v0, "merged integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    const-string v0, "sync_status integer not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    const-string v0, "timeZone text not null,"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    const-string v0, "modified_time integer not null"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;)Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/lang/Integer;>;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;)Ljava/lang/String;"
        }
    .end annotation

    .line 539
    invoke-virtual {p5}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v6

    .line 540
    invoke-virtual {p5}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v7

    .line 541
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 542
    const-string v0, " select "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 543
    invoke-virtual {v8, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 544
    invoke-virtual {v8, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "end_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 545
    invoke-virtual {v8, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 547
    const/4 v9, 0x0

    :goto_0
    array-length v0, v6

    if-ge v9, v0, :cond_1

    .line 549
    invoke-virtual {p5}, Lcom/huawei/hihealth/HiAggregateOption;->getAggregateType()I

    move-result v0

    aget v1, v6, v9

    aget-object v2, v7, v9

    invoke-direct {p0, p1, v0, v1, v2}, Lo/cps;->c(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 550
    array-length v0, v6

    add-int/lit8 v0, v0, -0x1

    if-ge v9, v0, :cond_0

    .line 552
    const-string v0, ","

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 547
    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 555
    :cond_1
    const-string v0, " from "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 556
    const-string v0, " where "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    .line 557
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 558
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? "

    .line 559
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 561
    const-string v0, " and "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "merged"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 563
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "client_id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    move-object v3, v8

    move-object v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 564
    const-string v0, "start_time"

    invoke-virtual {p5}, Lcom/huawei/hihealth/HiAggregateOption;->getSortOrder()I

    move-result v1

    invoke-static {v8, p1, v0, v1}, Lo/cpl;->c(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;I)V

    .line 565
    invoke-virtual {p5}, Lcom/huawei/hihealth/HiAggregateOption;->getAnchor()I

    move-result v0

    invoke-virtual {p5}, Lcom/huawei/hihealth/HiAggregateOption;->getCount()I

    move-result v1

    invoke-static {v8, v0, v1}, Lo/cpl;->e(Ljava/lang/StringBuffer;II)V

    .line 566
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d()[Ljava/lang/String;
    .locals 3

    .line 68
    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "start_time"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "end_time"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "type_id"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "value"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "metadata"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "unit_id"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "client_id"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "merged"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "sync_status"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "timeZone"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "modified_time"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    return-object v0
.end method

.method private e(Ljava/lang/String;JJII)Z
    .locals 11

    .line 314
    iget-object v0, p0, Lo/cps;->d:Lo/coe;

    move-object v1, p1

    invoke-direct {p0}, Lo/cps;->b()Ljava/lang/String;

    move-result-object v2

    move-object v3, p0

    move-wide v4, p2

    move-wide v6, p4

    move/from16 v8, p6

    move/from16 v9, p7

    invoke-direct/range {v3 .. v9}, Lo/cps;->c(JJII)[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/coe;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 315
    invoke-static {v10}, Lo/cph;->z(Landroid/database/Cursor;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;JJII)I
    .locals 9

    .line 505
    iget-object v0, p0, Lo/cps;->d:Lo/coe;

    invoke-direct {p0}, Lo/cps;->b()Ljava/lang/String;

    move-result-object v1

    move-object v2, p0

    move-wide v3, p2

    move-wide v5, p4

    move v7, p6

    move/from16 v8, p7

    invoke-direct/range {v2 .. v8}, Lo/cps;->c(JJII)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lo/coe;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;JJILjava/util/List;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;JJILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 235
    invoke-interface/range {p7 .. p7}, Ljava/util/List;->size()I

    move-result v7

    .line 236
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 237
    add-int/lit8 v0, v7, 0x3

    new-array v9, v0, [Ljava/lang/String;

    .line 238
    const-string v0, "start_time"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "end_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 239
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 240
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 241
    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 242
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 243
    const-string v0, "client_id"

    move-object/from16 v1, p7

    move v2, v7

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x3

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 244
    iget-object v0, p0, Lo/cps;->d:Lo/coe;

    move-object v1, p1

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v3, v9

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/coe;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 245
    invoke-static {v10}, Lo/cph;->a(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 195
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v7

    .line 196
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 197
    add-int/lit8 v0, v7, 0x4

    new-array v9, v0, [Ljava/lang/String;

    .line 198
    const-string v0, "start_time"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "merged"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 201
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 202
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 203
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 204
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v9, v1

    .line 205
    const-string v0, "client_id"

    move-object/from16 v1, p4

    move v2, v7

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 206
    const-string v0, "start_time"

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getSortOrder()I

    move-result v1

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getAnchor()I

    move-result v2

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getCount()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v10

    .line 207
    iget-object v0, p0, Lo/cps;->d:Lo/coe;

    move-object v1, p1

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v3, v9

    move-object v6, v10

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/coe;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 208
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lo/cph;->e(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 528
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    .line 529
    add-int/lit8 v0, v6, 0x3

    new-array v7, v0, [Ljava/lang/String;

    .line 530
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 531
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 532
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 533
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, v7

    move-object v5, p3

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v5}, Lo/cps;->d(Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;ILcom/huawei/hihealth/HiAggregateOption;)Ljava/lang/String;

    move-result-object v8

    .line 534
    iget-object v0, p0, Lo/cps;->d:Lo/coe;

    invoke-virtual {v0, v8, v7}, Lo/coe;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 535
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiAggregateOption;->getConstantsKey()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lo/cph;->h(Landroid/database/Cursor;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;II)Z
    .locals 10

    .line 334
    const-string v0, "Debug_ConfigDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdatePointData enter!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    move-object v0, p0

    move-object v1, p1

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v4

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v6

    move v7, p3

    invoke-direct/range {v0 .. v7}, Lo/cps;->e(Ljava/lang/String;JJII)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 337
    invoke-virtual {p0, p1, p2, p3, p4}, Lo/cps;->d(Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;II)I

    move-result v0

    int-to-long v8, v0

    goto :goto_0

    .line 339
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lo/cps;->c(Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v8

    .line 341
    :goto_0
    invoke-static {v8, v9}, Lo/cpn;->c(J)Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;JII)I
    .locals 6

    .line 523
    invoke-static {p4, p5}, Lo/cpi;->c(II)Landroid/content/ContentValues;

    move-result-object v5

    .line 524
    iget-object v0, p0, Lo/cps;->d:Lo/coe;

    const-string v1, "_id =? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, p1, v5, v1, v2}, Lo/coe;->e(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;II)J
    .locals 3

    .line 345
    invoke-direct {p0, p2, p3, p4}, Lo/cps;->c(Lcom/huawei/hihealth/HiHealthData;II)Landroid/content/ContentValues;

    move-result-object v2

    .line 346
    iget-object v0, p0, Lo/cps;->d:Lo/coe;

    invoke-virtual {v0, p1, v2}, Lo/coe;->d(Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public c(Ljava/lang/String;JJ[ILjava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;JJ[ILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 489
    move-object/from16 v0, p6

    array-length v7, v0

    .line 490
    invoke-interface/range {p7 .. p7}, Ljava/util/List;->size()I

    move-result v8

    .line 491
    add-int v0, v7, v8

    add-int/lit8 v0, v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    .line 492
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 493
    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 495
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 496
    const-string v0, "start_time"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 497
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 498
    const-string v0, "type_id"

    move-object/from16 v1, p6

    move v2, v7

    move-object v3, v10

    move-object v4, v9

    const/4 v5, 0x2

    invoke-static/range {v0 .. v5}, Lo/cpn;->d(Ljava/lang/String;[IILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 499
    const-string v0, "client_id"

    move-object/from16 v1, p7

    move v2, v8

    move-object v3, v10

    move-object v4, v9

    add-int/lit8 v5, v7, 0x2

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 500
    iget-object v0, p0, Lo/cps;->d:Lo/coe;

    move-object v1, p1

    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v3, v9

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/coe;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 501
    invoke-static {v11}, Lo/cph;->a(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;II)I
    .locals 10

    .line 263
    new-instance v9, Landroid/content/ContentValues;

    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    .line 264
    const-string v0, "value"

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 265
    const-string v0, "metadata"

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    const-string v0, "unit_id"

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getPointUnit()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 267
    const-string v0, "sync_status"

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 268
    const-string v0, "merged"

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 269
    const-string v0, "modified_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 271
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 272
    const-string v0, "sync_status"

    invoke-virtual {v9, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    .line 274
    :cond_0
    iget-object v0, p0, Lo/cps;->d:Lo/coe;

    invoke-direct {p0}, Lo/cps;->b()Ljava/lang/String;

    move-result-object v1

    move-object v2, p0

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v3

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v5

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v7

    move v8, p3

    invoke-direct/range {v2 .. v8}, Lo/cps;->c(JJII)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v9, v1, v2}, Lo/coe;->e(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 140
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v7

    .line 141
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 142
    add-int/lit8 v0, v7, 0x4

    new-array v9, v0, [Ljava/lang/String;

    .line 143
    const-string v0, "start_time"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "merged"

    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " != ?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 147
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 148
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 149
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 150
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v9, v1

    .line 151
    const-string v0, "client_id"

    move-object/from16 v1, p4

    move v2, v7

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 153
    const-string v0, "start_time"

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getSortOrder()I

    move-result v1

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getAnchor()I

    move-result v2

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getCount()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v10

    .line 154
    iget-object v0, p0, Lo/cps;->d:Lo/coe;

    move-object v1, p1

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v3, v9

    move-object v6, v10

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/coe;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 155
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lo/cph;->e(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
