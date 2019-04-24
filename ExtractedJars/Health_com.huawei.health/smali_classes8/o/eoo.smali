.class public Lo/eoo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:Ljava/lang/String;

.field private h:I

.field private i:I

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, -0x1

    iput v0, p0, Lo/eoo;->b:I

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/eoo;->c:I

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lo/eoo;->e:I

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eoo;->d:Ljava/lang/String;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eoo;->a:Ljava/lang/String;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eoo;->g:Ljava/lang/String;

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/eoo;->f:I

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lo/eoo;->i:I

    .line 42
    const/4 v0, 0x1

    iput v0, p0, Lo/eoo;->k:I

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/eoo;->h:I

    return-void
.end method

.method private b(Lcom/huawei/datatype/EventAlarmInfo;Landroid/content/Context;)I
    .locals 11

    .line 181
    invoke-virtual {p1}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmEnable()I

    move-result v4

    .line 184
    const/16 v0, 0x2726

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ONCE_EVENT_ALARM_INFO"

    invoke-static {p2, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 185
    const-string v0, "AlarmListItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== onceEventAlarmIsOver json = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 187
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Lo/eoo$5;

    invoke-direct {v1, p0}, Lo/eoo$5;-><init>(Lo/eoo;)V

    .line 188
    invoke-virtual {v1}, Lo/eoo$5;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 187
    invoke-virtual {v0, v5, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 189
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 190
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 191
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/datatype/EventAlarmInfo;

    .line 192
    invoke-virtual {v8}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmIndex()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmIndex()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 195
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v9, v0, v2

    .line 196
    const-string v0, "AlarmListItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== CurTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    invoke-virtual {v8}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmTime()J

    move-result-wide v0

    cmp-long v0, v9, v0

    if-ltz v0, :cond_0

    .line 199
    const/4 v4, 0x0

    .line 190
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 204
    :cond_1
    goto :goto_1

    .line 205
    :cond_2
    const-string v0, "AlarmListItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==once== onceEventAlarmIsOver json is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    :goto_1
    const-string v0, "AlarmListItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== onceEventAlarmIsOver iRet = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    return v4
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/eoo;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 1

    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/eoo;->c:I

    .line 51
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 66
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/eoo;->d:Ljava/lang/String;

    .line 67
    return-void
.end method

.method public b()I
    .locals 1

    .line 54
    iget v0, p0, Lo/eoo;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public b(Lo/eoo;Lcom/huawei/datatype/EventAlarmInfo;Lo/enx;Landroid/content/Context;)Lo/eoo;
    .locals 6

    .line 122
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    const/4 v0, 0x0

    if-ne v0, p4, :cond_1

    .line 123
    :cond_0
    return-object p1

    .line 125
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_hour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_mins()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p4, v0}, Lo/enx;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    .line 126
    const-string v0, "AlarmListItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "strTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmEnable()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/eoo;->a(I)V

    .line 128
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_hour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_mins()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lo/eoo;->e(I)V

    .line 129
    invoke-virtual {p1, v4}, Lo/eoo;->a(Ljava/lang/String;)V

    .line 130
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/eoo;->b(Ljava/lang/String;)V

    .line 131
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmRepeat()I

    move-result v0

    invoke-virtual {p3, v0}, Lo/enx;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 132
    invoke-virtual {p1, v5}, Lo/eoo;->e(Ljava/lang/String;)V

    .line 133
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/eoo;->d(I)V

    .line 134
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/eoo;->c(I)V

    .line 135
    const-string v0, "AlarmListItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "weekRepeat"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmRepeat()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/eoo;->b(I)V

    .line 137
    return-object p1
.end method

.method public b(I)V
    .locals 1

    .line 90
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/eoo;->f:I

    .line 91
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 74
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/eoo;->a:Ljava/lang/String;

    .line 75
    return-void
.end method

.method public c()I
    .locals 1

    .line 46
    iget v0, p0, Lo/eoo;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public c(I)V
    .locals 1

    .line 106
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/eoo;->k:I

    .line 107
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/eoo;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 1

    .line 98
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/eoo;->i:I

    .line 99
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Lo/eoo;->g:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public e(Lo/eoo;Lcom/huawei/datatype/EventAlarmInfo;Lo/enx;Landroid/content/Context;Ljava/util/List;I)Lo/eoo;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eoo;Lcom/huawei/datatype/EventAlarmInfo;Lo/enx;Landroid/content/Context;Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;I)Lo/eoo;"
        }
    .end annotation

    .line 142
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    const/4 v0, 0x0

    if-eq v0, p4, :cond_0

    const/4 v0, 0x0

    if-ne v0, p5, :cond_1

    .line 143
    :cond_0
    return-object p1

    .line 146
    :cond_1
    const-string v0, "AlarmListItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EventAlarmStartTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_hour()I

    move-result v3

    mul-int/lit8 v3, v3, 0x64

    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_mins()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const-string v0, "AlarmListItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EventAlarmName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    const-string v0, "AlarmListItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EventAlarmIndex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmIndex()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const-string v0, "AlarmListItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EventAlarmRepeat = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmRepeat()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    const-string v0, "AlarmListItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EventAlarmEnable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmEnable()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_hour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_mins()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p4, v0}, Lo/enx;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v5

    .line 153
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmRepeat()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmEnable()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 155
    invoke-direct {p0, p2, p4}, Lo/eoo;->b(Lcom/huawei/datatype/EventAlarmInfo;Landroid/content/Context;)I

    move-result v6

    .line 156
    invoke-virtual {p1, v6}, Lo/eoo;->a(I)V

    .line 158
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 159
    const/4 v0, 0x1

    iput v0, p0, Lo/eoo;->h:I

    .line 160
    invoke-interface {p5, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-virtual {v0, v6}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmEnable(I)V

    .line 162
    :cond_2
    goto :goto_0

    .line 163
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmEnable()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/eoo;->a(I)V

    .line 165
    :goto_0
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_hour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmStartTime_mins()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lo/eoo;->e(I)V

    .line 166
    invoke-virtual {p1, v5}, Lo/eoo;->a(Ljava/lang/String;)V

    .line 167
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/eoo;->b(Ljava/lang/String;)V

    .line 168
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmRepeat()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/eoo;->b(I)V

    .line 169
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmRepeat()I

    move-result v0

    invoke-virtual {p3, v0}, Lo/enx;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/eoo;->e(Ljava/lang/String;)V

    .line 170
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/eoo;->c(I)V

    .line 171
    invoke-virtual {p2}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/eoo;->d(I)V

    .line 172
    const-string v0, "AlarmListItem"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "alarm---------------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/eoo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    return-object p1
.end method

.method public e(I)V
    .locals 1

    .line 58
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/eoo;->e:I

    .line 59
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 82
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/eoo;->g:Ljava/lang/String;

    .line 83
    return-void
.end method

.method public f()I
    .locals 1

    .line 177
    iget v0, p0, Lo/eoo;->h:I

    return v0
.end method

.method public g()I
    .locals 1

    .line 86
    iget v0, p0, Lo/eoo;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    .line 102
    iget v0, p0, Lo/eoo;->k:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public k()I
    .locals 1

    .line 94
    iget v0, p0, Lo/eoo;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AlarmListItem [ID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/eoo;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mAlarmTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eoo;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mAlarmContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eoo;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mAlarmRepeat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eoo;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mRepeat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/eoo;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mEventIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/eoo;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/eoo;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
