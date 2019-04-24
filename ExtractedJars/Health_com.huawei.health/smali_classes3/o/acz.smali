.class public Lo/acz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/acz$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d([B)Lo/afz;
    .locals 16

    .line 22
    if-nez p1, :cond_0

    .line 23
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureDataParser data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    const/4 v0, 0x0

    return-object v0

    .line 27
    :cond_0
    new-instance v4, Lo/acz$d;

    move-object/from16 v0, p1

    invoke-direct {v4, v0}, Lo/acz$d;-><init>([B)V

    .line 29
    const/4 v5, 0x0

    .line 30
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0x11

    const/4 v0, 0x0

    invoke-virtual {v4, v1, v0}, Lo/acz$d;->b(II)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 31
    and-int/lit8 v0, v6, 0x2

    if-lez v0, :cond_1

    const/4 v7, 0x1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    .line 32
    :goto_0
    and-int/lit8 v0, v6, 0x4

    if-lez v0, :cond_2

    const/4 v8, 0x1

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    .line 34
    :goto_1
    const/16 v0, 0x32

    invoke-virtual {v4, v0, v5}, Lo/acz$d;->c(II)Ljava/lang/Float;

    move-result-object v9

    .line 35
    const/16 v0, 0x32

    const/4 v1, 0x3

    invoke-virtual {v4, v0, v1}, Lo/acz$d;->c(II)Ljava/lang/Float;

    move-result-object v10

    .line 37
    if-eqz v9, :cond_3

    if-nez v10, :cond_4

    .line 38
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureDataParser invalid bloodPressure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    const/4 v0, 0x0

    return-object v0

    .line 42
    :cond_4
    add-int/lit8 v5, v5, 0x6

    .line 44
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v11

    .line 45
    if-eqz v7, :cond_5

    .line 46
    const/16 v0, 0x12

    invoke-virtual {v4, v0, v5}, Lo/acz$d;->b(II)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v11, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 47
    const/16 v0, 0x11

    const/16 v1, 0x9

    invoke-virtual {v4, v0, v1}, Lo/acz$d;->b(II)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x2

    invoke-virtual {v11, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 48
    const/16 v0, 0x11

    const/16 v1, 0xa

    invoke-virtual {v4, v0, v1}, Lo/acz$d;->b(II)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v11, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 49
    const/16 v0, 0x11

    const/16 v1, 0xb

    invoke-virtual {v4, v0, v1}, Lo/acz$d;->b(II)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xb

    invoke-virtual {v11, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 50
    const/16 v0, 0x11

    const/16 v1, 0xc

    invoke-virtual {v4, v0, v1}, Lo/acz$d;->b(II)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xc

    invoke-virtual {v11, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 51
    const/16 v0, 0x11

    const/16 v1, 0xd

    invoke-virtual {v4, v0, v1}, Lo/acz$d;->b(II)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xd

    invoke-virtual {v11, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 52
    add-int/lit8 v5, v5, 0x7

    .line 55
    :cond_5
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    .line 56
    if-eqz v8, :cond_6

    .line 57
    const/16 v0, 0x32

    invoke-virtual {v4, v0, v5}, Lo/acz$d;->c(II)Ljava/lang/Float;

    move-result-object v12

    .line 60
    :cond_6
    new-instance v0, Lo/age;

    invoke-direct {v0}, Lo/age;-><init>()V

    move-object v13, v0

    .line 61
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-int v0, v0

    int-to-short v0, v0

    invoke-virtual {v13, v0}, Lo/age;->c(S)V

    .line 62
    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-int v0, v0

    int-to-short v0, v0

    invoke-virtual {v13, v0}, Lo/age;->a(S)V

    .line 63
    if-eqz v12, :cond_7

    .line 64
    invoke-virtual {v12}, Ljava/lang/Float;->shortValue()S

    move-result v0

    invoke-virtual {v13, v0}, Lo/age;->d(S)V

    .line 66
    :cond_7
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object v14, v0

    .line 67
    invoke-virtual {v11}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v15

    .line 68
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "date is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14, v15}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v13, v0, v1}, Lo/age;->e(J)V

    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v13, v0, v1}, Lo/age;->d(J)V

    .line 73
    return-object v13
.end method
