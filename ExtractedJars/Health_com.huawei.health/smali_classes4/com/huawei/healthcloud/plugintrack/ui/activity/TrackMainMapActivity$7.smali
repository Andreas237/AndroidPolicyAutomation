.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cid$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->C()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;I)V
    .locals 0

    .line 1090
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    iput p2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/app/Dialog;II)V
    .locals 11

    .line 1094
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrationDistance()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1096
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->b:I

    if-eq v0, p3, :cond_2

    .line 1097
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrationDistance() position= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " changeDistance is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->k(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1098
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 1099
    sget-object v0, Lo/dae;->hD:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    .line 1100
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1101
    const-string v0, "distances"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v1

    invoke-virtual {v1}, Lo/cbu;->g()F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1102
    const-string v0, "calibrationDistance"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->k(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    mul-double/2addr v1, v3

    double-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1103
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->g(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v8, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1105
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->m()J

    move-result-wide v0

    long-to-int v9, v0

    .line 1106
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->ap()I

    move-result v10

    .line 1107
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->k(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cdu;->a(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbu;->e(Ljava/lang/String;)V

    .line 1108
    if-nez v9, :cond_0

    .line 1109
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calibrationDistance() duration is 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1110
    const/4 v9, 0x1

    .line 1113
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0, v9, v10}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1114
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->h(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V

    .line 1115
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cee;

    move-result-object v0

    const-string v1, "calibrate_distance_indoor_running_data_duration"

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    .line 1117
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cee;

    move-result-object v2

    const-string v3, "calibrate_distance_indoor_running_data_duration"

    invoke-virtual {v2, v3}, Lo/cee;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1116
    invoke-static {v2, v9}, Lo/cdu;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 1115
    invoke-virtual {v0, v1, v2}, Lo/cee;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1120
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cee;

    move-result-object v0

    const-string v1, "calibrate_distance_indoor_running_data_step"

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    .line 1122
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cee;

    move-result-object v2

    const-string v3, "calibrate_distance_indoor_running_data_step"

    invoke-virtual {v2, v3}, Lo/cee;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1121
    invoke-static {v2, v10}, Lo/cdu;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 1120
    invoke-virtual {v0, v1, v2}, Lo/cee;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1125
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cee;

    move-result-object v0

    const-string v1, "calibrate_distance_indoor_running_data_actual_distance"

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    .line 1127
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cee;

    move-result-object v2

    const-string v3, "calibrate_distance_indoor_running_data_actual_distance"

    invoke-virtual {v2, v3}, Lo/cee;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    .line 1128
    invoke-static {v3}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->k(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    const-wide v5, 0x408f400000000000L    # 1000.0

    mul-double/2addr v3, v5

    double-to-float v3, v3

    float-to-double v3, v3

    .line 1126
    invoke-static {v2, v3, v4}, Lo/cdu;->b(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object v2

    .line 1125
    invoke-virtual {v0, v1, v2}, Lo/cee;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1130
    :cond_1
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calibrationDistance(), saveData duration :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v3}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v3

    invoke-virtual {v3}, Lo/cbu;->m()J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " , step :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    .line 1131
    invoke-static {v3}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v3

    invoke-virtual {v3}, Lo/cbu;->ap()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,distance :"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->k(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    mul-double/2addr v2, v4

    double-to-float v2, v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 1130
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1133
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$7;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->i(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V

    .line 1134
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 1136
    return-void
.end method
