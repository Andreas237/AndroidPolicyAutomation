.class Lo/ewd$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ewd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ewd;


# direct methods
.method constructor <init>(Lo/ewd;)V
    .locals 0

    .line 1131
    iput-object p1, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 13

    .line 1134
    const/4 v0, 0x0

    if-ne v0, p1, :cond_6

    if-eqz p2, :cond_6

    .line 1135
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6267\u884c\u6210\u529f "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1136
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    move-object v1, p2

    check-cast v1, Lcom/huawei/datatype/PeriodRRIEntity;

    invoke-static {v0, v1}, Lo/ewd;->c(Lo/ewd;Lcom/huawei/datatype/PeriodRRIEntity;)Lcom/huawei/datatype/PeriodRRIEntity;

    .line 1137
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->h(Lo/ewd;)Lcom/huawei/datatype/PeriodRRIEntity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchVersion()I

    move-result v7

    .line 1138
    const/4 v8, 0x0

    .line 1139
    const/4 v0, 0x1

    if-ne v0, v7, :cond_0

    .line 1140
    const/16 v8, 0x3c

    goto :goto_0

    .line 1141
    :cond_0
    const/4 v0, 0x2

    if-ne v0, v7, :cond_1

    .line 1142
    const/16 v8, 0x78

    goto :goto_0

    .line 1145
    :cond_1
    const/4 v0, 0x3

    if-ne v0, v7, :cond_2

    .line 1146
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    iget-object v1, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v1}, Lo/ewd;->h(Lo/ewd;)Lcom/huawei/datatype/PeriodRRIEntity;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ewd;->a(Lo/ewd;Lcom/huawei/datatype/PeriodRRIEntity;)V

    .line 1147
    return-void

    .line 1149
    :cond_2
    return-void

    .line 1151
    :goto_0
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    iget-object v1, p0, Lo/ewd$3;->a:Lo/ewd;

    iget-object v2, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v2}, Lo/ewd;->h(Lo/ewd;)Lcom/huawei/datatype/PeriodRRIEntity;

    move-result-object v2

    invoke-static {v1, v2}, Lo/ewd;->d(Lo/ewd;Lcom/huawei/datatype/PeriodRRIEntity;)Lcom/huawei/datatype/PeriodRRIEntity;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ewd;->c(Lo/ewd;Lcom/huawei/datatype/PeriodRRIEntity;)Lcom/huawei/datatype/PeriodRRIEntity;

    .line 1152
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->h(Lo/ewd;)Lcom/huawei/datatype/PeriodRRIEntity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchRriDataList()Ljava/util/List;

    move-result-object v9

    .line 1153
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;

    .line 1154
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-virtual {v11}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->fetchStartTime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lo/ewd;->b(Lo/ewd;J)J

    .line 1155
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->l(Lo/ewd;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v1}, Lo/ewd;->i(Lo/ewd;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1156
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCycleStartMeasureTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v3}, Lo/ewd;->i(Lo/ewd;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1157
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-virtual {v11}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->fetchRriList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v11}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->fetchSqiList()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/ewd;->d(Lo/ewd;Ljava/util/List;Ljava/util/List;)V

    .line 1158
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    iget-object v1, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v1}, Lo/ewd;->i(Lo/ewd;)J

    move-result-wide v1

    mul-int/lit16 v3, v8, 0x3e8

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lo/ewd;->c(Lo/ewd;J)J

    .line 1159
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    iget-object v1, p0, Lo/ewd$3;->a:Lo/ewd;

    iget-object v2, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v2}, Lo/ewd;->i(Lo/ewd;)J

    move-result-wide v3

    iget-object v2, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v2}, Lo/ewd;->m(Lo/ewd;)J

    move-result-wide v5

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lo/ewd;->c(Lo/ewd;IJJ)[F

    move-result-object v1

    invoke-static {v0, v1}, Lo/ewd;->d(Lo/ewd;[F)[F

    .line 1160
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mMeassureCycleSOBack=openSOMeasure"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1162
    invoke-static {}, Lo/ewm;->c()Lo/ewm;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewm;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1163
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->h(Lo/ewd;)Lcom/huawei/datatype/PeriodRRIEntity;

    move-result-object v0

    iget-object v1, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v1}, Lo/ewd;->i(Lo/ewd;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/datatype/PeriodRRIEntity;->configFailTime(J)V

    .line 1164
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fail configFailTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v3}, Lo/ewd;->i(Lo/ewd;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1165
    goto :goto_2

    .line 1167
    :cond_3
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->o(Lo/ewd;)[F

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->o(Lo/ewd;)[F

    move-result-object v0

    const/16 v1, 0x12

    aget v0, v0, v1

    const/4 v1, 0x0

    cmpl-float v0, v1, v0

    if-eqz v0, :cond_4

    .line 1168
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    iget-object v1, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v1}, Lo/ewd;->o(Lo/ewd;)[F

    move-result-object v1

    iget-object v2, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v2}, Lo/ewd;->i(Lo/ewd;)J

    move-result-wide v2

    iget-object v4, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v4}, Lo/ewd;->m(Lo/ewd;)J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Lo/ewd;->b(Lo/ewd;[FJJ)Lcom/huawei/hihealth/data/model/HiStressMetaData;

    move-result-object v12

    .line 1169
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->p(Lo/ewd;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1170
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cycleDataList add"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1173
    :cond_4
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    iget-object v1, p0, Lo/ewd$3;->a:Lo/ewd;

    iget-object v1, v1, Lo/ewd;->d:Ljava/util/List;

    invoke-static {v0, v1}, Lo/ewd;->c(Lo/ewd;Ljava/util/List;)V

    .line 1174
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    iget-object v1, p0, Lo/ewd$3;->a:Lo/ewd;

    iget-object v1, v1, Lo/ewd;->g:Ljava/util/List;

    invoke-static {v0, v1}, Lo/ewd;->c(Lo/ewd;Ljava/util/List;)V

    .line 1175
    goto/16 :goto_1

    .line 1177
    :cond_5
    :goto_2
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v0}, Lo/ewd;->p(Lo/ewd;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 1178
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cycleDataList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v3}, Lo/ewd;->p(Lo/ewd;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1179
    iget-object v0, p0, Lo/ewd$3;->a:Lo/ewd;

    iget-object v1, p0, Lo/ewd$3;->a:Lo/ewd;

    invoke-static {v1}, Lo/ewd;->p(Lo/ewd;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ewd;->b(Lo/ewd;Ljava/util/List;)V

    .line 1182
    :cond_6
    return-void
.end method
