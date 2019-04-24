.class public Lo/bxn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/huawei/health/suggestion/model/Plan;)Ljava/util/Map;
    .locals 7
    .param p0    # Lcom/huawei/health/suggestion/model/Plan;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/model/Plan;)Ljava/util/Map<Ljava/lang/Integer;Lo/bxv;>;"
        }
    .end annotation

    .line 206
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 207
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v2

    .line 209
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 211
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bxz;->e(Ljava/lang/String;)I

    move-result v5

    .line 212
    const/4 v0, -0x1

    if-eq v5, v0, :cond_1

    .line 214
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/bxv;

    .line 215
    if-nez v6, :cond_0

    .line 216
    new-instance v6, Lo/bxv;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-direct {v6, v5, v0}, Lo/bxv;-><init>(ILcom/huawei/health/suggestion/model/DayInfo;)V

    .line 217
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    :cond_0
    invoke-virtual {v6}, Lo/bxv;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    :cond_1
    goto :goto_0

    .line 222
    :cond_2
    return-object v1
.end method

.method public static a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 86
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 87
    :cond_0
    const-string v0, "Suggestion_ShowPlanHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutRecords == null || workoutRecords.size() == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    return-void

    .line 90
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-interface {p0, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-static {v0}, Lo/bxj;->c([Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 91
    return-void
.end method

.method private static b(Ljava/lang/Integer;I)I
    .locals 2

    .line 157
    if-eqz p0, :cond_2

    .line 158
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-lt v0, p1, :cond_1

    .line 159
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 161
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 163
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public static b(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 1

    .line 95
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_0

    .line 96
    invoke-static {p0}, Lo/bxj;->a(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 98
    :cond_0
    return-void
.end method

.method public static b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/RunWorkout;>;)V"
        }
    .end annotation

    .line 77
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 78
    :cond_0
    const-string v0, "Suggestion_ShowPlanHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runWorkouts == null || runWorkouts.size() == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    return-void

    .line 81
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-interface {p0, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-static {v0}, Lo/bxj;->c([Lcom/huawei/health/suggestion/model/RunWorkout;)V

    .line 82
    return-void
.end method

.method private static c(ILjava/util/ArrayList;Ljava/util/Map;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/ArrayList<Lo/byc;>;Ljava/util/Map<Ljava/lang/Integer;Lo/bxv;>;)Ljava/util/ArrayList<Lo/byc;>;"
        }
    .end annotation

    .line 241
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 242
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/byc;

    .line 243
    const/4 v4, 0x0

    :goto_1
    const/4 v0, 0x7

    if-ge v4, v0, :cond_0

    .line 244
    mul-int/lit8 v0, v2, 0x7

    add-int v5, v0, v4

    .line 245
    invoke-virtual {v3}, Lo/byc;->e()Ljava/util/List;

    move-result-object v0

    add-int v1, p0, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v4, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 243
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 241
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 248
    :cond_1
    return-object p1
.end method

.method private static c(ILjava/util/List;Ljava/util/Map;)Ljava/util/ArrayList;
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;Ljava/util/Map<Ljava/lang/Integer;Lo/bxv;>;)Ljava/util/ArrayList<Lo/byc;>;"
        }
    .end annotation

    .line 226
    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    .line 227
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 230
    :cond_0
    new-instance v3, Ljava/util/TreeMap;

    invoke-direct {v3}, Ljava/util/TreeMap;-><init>()V

    .line 231
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 232
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->acquireOrder()I

    move-result v6

    .line 233
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 234
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lo/byc;

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v2

    invoke-direct {v1, v2}, Lo/byc;-><init>(Lcom/huawei/health/suggestion/model/WeekInfo;)V

    invoke-virtual {v3, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    :cond_1
    goto :goto_0

    .line 237
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p0, v0, p2}, Lo/bxn;->c(ILjava/util/ArrayList;Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method private static c(Lcom/huawei/health/suggestion/model/Plan;Ljava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/model/Plan;Ljava/util/List<Lo/byc;>;)Ljava/util/List<Lo/bxt;>;"
        }
    .end annotation

    .line 111
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 112
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/byc;

    .line 113
    new-instance v0, Lo/bxt;

    invoke-virtual {v6}, Lo/byc;->d()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v2, p0, v1, v3}, Lo/bxt;-><init>(ILcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/WeekInfo;Lo/bxv;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    const/4 v7, 0x1

    .line 115
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 116
    const/4 v9, 0x0

    :goto_1
    const/4 v0, 0x7

    if-ge v9, v0, :cond_3

    .line 117
    invoke-virtual {v6}, Lo/byc;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/bxv;

    .line 118
    if-eqz v10, :cond_1

    invoke-virtual {v10}, Lo/bxv;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 119
    invoke-virtual {v10, v7}, Lo/bxv;->d(Z)V

    .line 121
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    .line 122
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 123
    new-instance v0, Lo/bxt;

    invoke-virtual {v6}, Lo/byc;->d()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v11, v2, p0, v1}, Lo/bxt;-><init>(Ljava/util/List;ILcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/WeekInfo;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 126
    :cond_0
    new-instance v0, Lo/bxt;

    invoke-virtual {v6}, Lo/byc;->d()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v2, p0, v1, v10}, Lo/bxt;-><init>(ILcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/WeekInfo;Lo/bxv;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    const/4 v7, 0x0

    goto :goto_2

    .line 128
    :cond_1
    if-eqz v10, :cond_2

    invoke-virtual {v10}, Lo/bxv;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 129
    invoke-virtual {v10, v7}, Lo/bxv;->d(Z)V

    .line 130
    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    const/4 v7, 0x0

    .line 116
    :cond_2
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_1

    .line 136
    :cond_3
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 137
    new-instance v0, Lo/bxt;

    invoke-virtual {v6}, Lo/byc;->d()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v8, v2, p0, v1}, Lo/bxt;-><init>(Ljava/util/List;ILcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/WeekInfo;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    :cond_4
    goto/16 :goto_0

    .line 140
    :cond_5
    return-object v4
.end method

.method private static c(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/byc;>;)Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;"
        }
    .end annotation

    .line 144
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 145
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/byc;

    .line 146
    const/4 v4, 0x0

    :goto_1
    const/4 v0, 0x7

    if-ge v4, v0, :cond_1

    .line 147
    invoke-virtual {v3}, Lo/byc;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/bxv;

    .line 148
    if-eqz v5, :cond_0

    .line 149
    invoke-virtual {v5}, Lo/bxv;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 146
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 152
    :cond_1
    goto :goto_0

    .line 153
    :cond_2
    return-object v1
.end method

.method public static c(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 5
    .param p0    # Lcom/huawei/health/suggestion/model/Plan;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 102
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v4

    .line 103
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 104
    :cond_0
    const-string v0, "Suggestion_ShowPlanHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workouts == null || workouts.size() == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    return-void

    .line 107
    :cond_1
    invoke-static {p0}, Lo/bxn;->d(Lcom/huawei/health/suggestion/model/Plan;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/bxn;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/model/Plan;->saveWorkouts(Ljava/util/List;)V

    .line 108
    return-void
.end method

.method private static d(Lcom/huawei/health/suggestion/model/Plan;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/model/Plan;)Ljava/util/List<Lo/byc;>;"
        }
    .end annotation

    .line 191
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v2

    .line 192
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 193
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 196
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bxz;->e(Ljava/lang/String;)I

    move-result v0

    invoke-static {p0}, Lo/bxn;->a(Lcom/huawei/health/suggestion/model/Plan;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lo/bxn;->c(ILjava/util/List;Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object v3

    .line 197
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 198
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bxz;->e(Ljava/lang/String;)I

    move-result v0

    invoke-static {v3, v0}, Lo/bxl;->e(Ljava/util/List;I)V

    goto :goto_0

    .line 200
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bxz;->e(Ljava/lang/String;)I

    move-result v0

    invoke-static {v3, v0}, Lo/bxl;->a(Ljava/util/List;I)V

    .line 202
    :goto_0
    return-object v3
.end method

.method public static d(Lcom/huawei/health/suggestion/model/RunWorkout;)V
    .locals 0

    .line 72
    invoke-static {p0}, Lo/bxj;->d(Lcom/huawei/health/suggestion/model/RunWorkout;)V

    .line 73
    return-void
.end method

.method public static d(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bxt;>;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 40
    if-nez p2, :cond_0

    .line 41
    return-void

    .line 43
    :cond_0
    invoke-static {p1}, Lo/bxn;->e(Ljava/util/List;)Ljava/util/Map;

    move-result-object v4

    .line 44
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/bxt;

    .line 45
    invoke-virtual {v6}, Lo/bxt;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 46
    invoke-virtual {v6}, Lo/bxt;->c()Lo/bxv;

    move-result-object v7

    .line 47
    invoke-virtual {v7}, Lo/bxv;->e()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v8

    .line 48
    invoke-virtual {v7}, Lo/bxv;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v9

    .line 49
    const-string v0, "yyyy-MM-dd"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v8, v0, v1}, Lo/btw;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {v6, v0}, Lo/bxt;->e(Ljava/util/List;)V

    .line 50
    const-string v0, "Suggestion_ShowPlanHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateShowPlanItems date = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    invoke-interface {p2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0, v9}, Lo/bxn;->b(Ljava/lang/Integer;I)I

    move-result v10

    .line 52
    const-string v0, "Suggestion_ShowPlanHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateShowPlanItems tmpOrder = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    invoke-virtual {v7, v10}, Lo/bxv;->c(I)V

    .line 55
    :cond_1
    goto/16 :goto_0

    .line 56
    :cond_2
    return-void
.end method

.method public static e(Lcom/huawei/health/suggestion/model/Plan;)Ljava/util/List;
    .locals 1
    .param p0    # Lcom/huawei/health/suggestion/model/Plan;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/model/Plan;)Ljava/util/List<Lo/bxt;>;"
        }
    .end annotation

    .line 34
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object p0, v0

    check-cast p0, Lcom/huawei/health/suggestion/model/Plan;

    .line 35
    invoke-static {p0}, Lo/bxn;->b(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 36
    invoke-static {p0}, Lo/bxn;->d(Lcom/huawei/health/suggestion/model/Plan;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0, v0}, Lo/bxn;->c(Lcom/huawei/health/suggestion/model/Plan;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static e(Ljava/util/List;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;>;"
        }
    .end annotation

    .line 167
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 168
    invoke-static {p0}, Lo/bxl;->e(Ljava/util/List;)V

    .line 170
    if-nez p0, :cond_0

    .line 171
    const-string v0, "Suggestion_ShowPlanHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutRecords == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    return-object v4

    .line 174
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 175
    const-string v0, "Suggestion_ShowPlanHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutRecords.size() == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    return-object v4

    .line 179
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 180
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/List;

    .line 181
    if-nez v7, :cond_2

    .line 182
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 183
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    :cond_2
    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 186
    goto :goto_0

    .line 187
    :cond_3
    return-object v4
.end method
