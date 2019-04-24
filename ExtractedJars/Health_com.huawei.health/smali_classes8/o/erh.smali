.class public Lo/erh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/erh$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;
    .locals 7

    .line 164
    invoke-static {}, Lo/erh;->b()Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v4

    .line 165
    if-nez v4, :cond_0

    .line 166
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastRecommendWorkout sportLevel is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    new-instance v4, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-direct {v4, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    .line 169
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireLevel()I

    move-result v0

    invoke-static {v0}, Lo/erh;->c(I)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;

    move-result-object v5

    .line 171
    if-eqz v5, :cond_2

    .line 172
    invoke-virtual {v5}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->acquireLastRecommend()Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    move-result-object v6

    .line 174
    if-nez v6, :cond_1

    .line 175
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRecommendWorkout is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    const/4 v0, 0x0

    return-object v0

    .line 178
    :cond_1
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastRecommendWorkout "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    return-object v6

    .line 182
    :cond_2
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCoursesBySportLevel is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(I)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;
    .locals 7

    .line 112
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recommendWorkoutBySportLevel "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    invoke-static {p0}, Lo/erh;->c(I)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;

    move-result-object v5

    .line 114
    if-eqz v5, :cond_1

    .line 115
    invoke-virtual {v5}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->getRecommendWorkout()Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    move-result-object v6

    .line 117
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 118
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 119
    invoke-static {p0}, Lo/erh;->e(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    .line 120
    invoke-virtual {v3, v5}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 117
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 122
    if-nez v6, :cond_0

    .line 123
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recommendWorkoutBySportLevel is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    const/4 v0, 0x0

    return-object v0

    .line 126
    :cond_0
    return-object v6

    .line 130
    :cond_1
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recommendWorkoutBySportLevel is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic a(Ljava/util/List;)V
    .locals 0

    .line 54
    invoke-static {p0}, Lo/erh;->l(Ljava/util/List;)V

    return-void
.end method

.method public static b()Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    .locals 7

    .line 820
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 821
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "LAST_SPORT_LEVEL"

    .line 819
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 823
    if-eqz v4, :cond_0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 824
    :cond_0
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    return-object v0

    .line 828
    :cond_1
    :try_start_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    invoke-virtual {v0, v4, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 829
    :catch_0
    move-exception v5

    .line 830
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastSportLevel "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 832
    :try_start_1
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 833
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x0

    invoke-direct {v0, v6, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 834
    :catch_1
    move-exception v6

    .line 835
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastSportLevel e1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 836
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    return-object v0
.end method

.method public static b(IID)V
    .locals 5

    .line 847
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 848
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "LAST_SPORT_LEVEL"

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    new-instance v4, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    invoke-direct {v4, p0, p1, p2, p3}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    .line 850
    invoke-virtual {v3, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 846
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 853
    return-void
.end method

.method static synthetic b(Ljava/util/List;)V
    .locals 0

    .line 54
    invoke-static {p0}, Lo/erh;->h(Ljava/util/List;)V

    return-void
.end method

.method public static c(I)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;
    .locals 7

    .line 142
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCoursesBySportLevel "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    invoke-static {p0}, Lo/erh;->e(I)Ljava/lang/String;

    move-result-object v4

    .line 145
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 146
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 144
    invoke-static {v0, v1, v4}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 149
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 151
    :try_start_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;

    invoke-virtual {v0, v5, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 152
    :catch_0
    move-exception v6

    .line 153
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCoursesBySportLevel "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    const/4 v0, 0x0

    return-object v0

    .line 158
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic c(Ljava/util/List;)V
    .locals 0

    .line 54
    invoke-static {p0}, Lo/erh;->p(Ljava/util/List;)V

    return-void
.end method

.method public static c(Lo/erh$b;)V
    .locals 3

    .line 240
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lo/erh$5;

    invoke-direct {v1, p0}, Lo/erh$5;-><init>(Lo/erh$b;)V

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lo/bsp;->c(ILo/bui;)V

    .line 311
    return-void
.end method

.method static synthetic d(Ljava/util/List;)V
    .locals 0

    .line 54
    invoke-static {p0}, Lo/erh;->k(Ljava/util/List;)V

    return-void
.end method

.method public static d(I)Z
    .locals 5

    .line 224
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 225
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 226
    invoke-static {p0}, Lo/erh;->e(I)Ljava/lang/String;

    move-result-object v2

    .line 223
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 227
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 228
    invoke-static {p0}, Lo/erh;->c(I)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;

    move-result-object v4

    .line 229
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->acquireRecommendWorkouts()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->acquireRecommendWorkouts()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 230
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 232
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 235
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private static e(I)Ljava/lang/String;
    .locals 1

    .line 194
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 196
    :pswitch_0
    const-string v0, "KEY_COURSE_LEVEL_NONE"

    return-object v0

    .line 198
    :pswitch_1
    const-string v0, "KEY_COURSE_LEVEL_VERY_POOR"

    return-object v0

    .line 200
    :pswitch_2
    const-string v0, "KEY_COURSE_LEVEL_POOR"

    return-object v0

    .line 202
    :pswitch_3
    const-string v0, "KEY_COURSE_LEVEL_FAIR"

    return-object v0

    .line 204
    :pswitch_4
    const-string v0, "KEY_COURSE_LEVEL_AVERAGE"

    return-object v0

    .line 206
    :pswitch_5
    const-string v0, "KEY_COURSE_LEVEL_GOOD"

    return-object v0

    .line 208
    :pswitch_6
    const-string v0, "KEY_COURSE_LEVEL_VERY_GOOD"

    return-object v0

    .line 210
    :goto_0
    const-string v0, ""

    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public static e()V
    .locals 7

    .line 800
    const/4 v5, -0x1

    :goto_0
    const/4 v0, 0x5

    if-gt v5, v0, :cond_1

    .line 802
    invoke-static {v5}, Lo/erh;->c(I)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;

    move-result-object v6

    .line 804
    if-eqz v6, :cond_0

    .line 805
    invoke-virtual {v6}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->resetSchedule()V

    .line 808
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 809
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 810
    invoke-static {v5}, Lo/erh;->e(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    .line 811
    invoke-virtual {v3, v6}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 807
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 800
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 816
    :cond_1
    return-void
.end method

.method static synthetic e(Ljava/util/List;)V
    .locals 0

    .line 54
    invoke-static {p0}, Lo/erh;->f(Ljava/util/List;)V

    return-void
.end method

.method private static f(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 371
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 372
    invoke-virtual {v6}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "R012R"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 373
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 374
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v6}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 375
    new-instance v8, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;

    const/4 v0, 0x1

    invoke-direct {v8, v0, v7}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;-><init>(ILjava/util/List;)V

    .line 378
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 379
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_COURSE_LEVEL_VERY_POOR"

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    .line 381
    invoke-virtual {v3, v8}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 377
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 385
    goto :goto_1

    .line 383
    :catch_0
    move-exception v9

    .line 384
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildVeryPoorShedule "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    goto :goto_1

    .line 388
    :cond_0
    goto/16 :goto_0

    .line 391
    :cond_1
    :goto_1
    return-void
.end method

.method static synthetic g(Ljava/util/List;)V
    .locals 0

    .line 54
    invoke-static {p0}, Lo/erh;->o(Ljava/util/List;)V

    return-void
.end method

.method private static h(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 318
    const/4 v5, 0x0

    .line 319
    const/4 v6, 0x0

    .line 320
    const/4 v7, 0x0

    .line 321
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 322
    invoke-virtual {v9}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v10

    const/4 v11, -0x1

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "R008R"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v11, 0x0

    goto :goto_1

    :sswitch_1
    const-string v0, "R009R"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v11, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "R010R"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v11, 0x2

    :cond_0
    :goto_1
    packed-switch v11, :pswitch_data_0

    goto :goto_2

    .line 324
    :pswitch_0
    new-instance v5, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v9}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v5, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 325
    goto :goto_2

    .line 327
    :pswitch_1
    new-instance v6, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v9}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v6, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 328
    goto :goto_2

    .line 330
    :pswitch_2
    new-instance v7, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v9}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v7, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 331
    .line 335
    :goto_2
    goto/16 :goto_0

    .line 336
    :cond_1
    const/4 v8, 0x0

    .line 337
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 338
    if-eqz v5, :cond_2

    .line 339
    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    invoke-virtual {v5}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWeight()I

    move-result v0

    add-int/lit8 v8, v0, 0x0

    .line 343
    :cond_2
    if-eqz v6, :cond_3

    .line 344
    invoke-interface {v9, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 345
    invoke-virtual {v6}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWeight()I

    move-result v0

    add-int/2addr v8, v0

    .line 348
    :cond_3
    if-eqz v7, :cond_4

    .line 349
    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 350
    invoke-virtual {v7}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWeight()I

    move-result v0

    add-int/2addr v8, v0

    .line 353
    :cond_4
    new-instance v10, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;

    invoke-direct {v10, v8, v9}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;-><init>(ILjava/util/List;)V

    .line 356
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 357
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_COURSE_LEVEL_NONE"

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    .line 359
    invoke-virtual {v3, v10}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 355
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 363
    goto :goto_3

    .line 361
    :catch_0
    move-exception v11

    .line 362
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildNoneShedule"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x49a146c -> :sswitch_0
        0x49a148b -> :sswitch_1
        0x49a1735 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic i(Ljava/util/List;)V
    .locals 0

    .line 54
    invoke-static {p0}, Lo/erh;->n(Ljava/util/List;)V

    return-void
.end method

.method private static k(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 399
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 400
    invoke-virtual {v6}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "R013R"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 401
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 402
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v6}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 403
    new-instance v8, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;

    const/4 v0, 0x1

    invoke-direct {v8, v0, v7}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;-><init>(ILjava/util/List;)V

    .line 406
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 407
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_COURSE_LEVEL_POOR"

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    .line 409
    invoke-virtual {v3, v8}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 405
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 413
    goto :goto_1

    .line 411
    :catch_0
    move-exception v9

    .line 412
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildPoorShedule "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    goto :goto_1

    .line 416
    :cond_0
    goto/16 :goto_0

    .line 417
    :cond_1
    :goto_1
    return-void
.end method

.method private static l(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 427
    const/4 v5, 0x0

    .line 428
    const/4 v6, 0x0

    .line 429
    const/4 v7, 0x0

    .line 431
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 432
    invoke-virtual {v9}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v10

    const/4 v11, -0x1

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "R014R"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v11, 0x0

    goto :goto_1

    :sswitch_1
    const-string v0, "R018R"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v11, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "R020R"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v11, 0x2

    :cond_0
    :goto_1
    packed-switch v11, :pswitch_data_0

    goto :goto_2

    .line 434
    :pswitch_0
    new-instance v5, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v9}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v5, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 435
    goto :goto_2

    .line 437
    :pswitch_1
    new-instance v6, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v9}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v6, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 438
    goto :goto_2

    .line 440
    :pswitch_2
    new-instance v7, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v9}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v7, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 441
    .line 445
    :goto_2
    goto/16 :goto_0

    .line 447
    :cond_1
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 448
    if-eqz v5, :cond_2

    .line 449
    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 452
    :cond_2
    if-eqz v6, :cond_3

    .line 453
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 456
    :cond_3
    if-eqz v7, :cond_4

    .line 457
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 460
    :cond_4
    new-instance v9, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v9, v0, v8}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;-><init>(ILjava/util/List;)V

    .line 463
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 464
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_COURSE_LEVEL_FAIR"

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    .line 466
    invoke-virtual {v3, v9}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 462
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 470
    goto :goto_3

    .line 468
    :catch_0
    move-exception v10

    .line 469
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildFairShedule "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x49a17b1 -> :sswitch_0
        0x49a182d -> :sswitch_1
        0x49a1af6 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private static n(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 527
    const/4 v5, 0x0

    .line 528
    const/4 v6, 0x0

    .line 529
    const/4 v7, 0x0

    .line 530
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 531
    invoke-virtual {v9}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v10

    const/4 v11, -0x1

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "R019R"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v11, 0x0

    goto :goto_1

    :sswitch_1
    const-string v0, "R021R"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v11, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "R022R"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v11, 0x2

    :cond_0
    :goto_1
    packed-switch v11, :pswitch_data_0

    goto :goto_2

    .line 533
    :pswitch_0
    new-instance v5, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v9}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {v5, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 534
    goto :goto_2

    .line 536
    :pswitch_1
    new-instance v6, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v9}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {v6, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 537
    goto :goto_2

    .line 539
    :pswitch_2
    new-instance v7, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v9}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {v7, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 540
    .line 544
    :goto_2
    goto/16 :goto_0

    .line 546
    :cond_1
    const/4 v8, 0x0

    .line 547
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 548
    if-eqz v5, :cond_2

    .line 549
    invoke-interface {v9, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 550
    invoke-virtual {v5}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWeight()I

    move-result v0

    add-int/lit8 v8, v0, 0x0

    .line 553
    :cond_2
    if-eqz v6, :cond_3

    .line 554
    invoke-interface {v9, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 555
    invoke-virtual {v6}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWeight()I

    move-result v0

    add-int/2addr v8, v0

    .line 558
    :cond_3
    if-eqz v7, :cond_4

    .line 559
    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 560
    invoke-virtual {v7}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWeight()I

    move-result v0

    add-int/2addr v8, v0

    .line 563
    :cond_4
    new-instance v10, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;

    invoke-direct {v10, v8, v9}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;-><init>(ILjava/util/List;)V

    .line 566
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 567
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_COURSE_LEVEL_GOOD"

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    .line 569
    invoke-virtual {v3, v10}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 565
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 573
    goto :goto_3

    .line 571
    :catch_0
    move-exception v11

    .line 572
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildGoodShedule "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 574
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x49a184c -> :sswitch_0
        0x49a1b15 -> :sswitch_1
        0x49a1b34 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private static o(Ljava/util/List;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 583
    const/4 v5, 0x0

    .line 584
    const/4 v6, 0x0

    .line 585
    const/4 v7, 0x0

    .line 586
    const/4 v8, 0x0

    .line 587
    const/4 v9, 0x0

    .line 588
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 589
    invoke-virtual {v11}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v12

    const/4 v13, -0x1

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "R019R"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x0

    goto :goto_1

    :sswitch_1
    const-string v0, "R021R"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "R022R"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x2

    goto :goto_1

    :sswitch_3
    const-string v0, "R023R"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x3

    goto :goto_1

    :sswitch_4
    const-string v0, "R024R"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x4

    :cond_0
    :goto_1
    packed-switch v13, :pswitch_data_0

    goto :goto_2

    .line 591
    :pswitch_0
    new-instance v5, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v11}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    invoke-direct {v5, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 592
    goto :goto_2

    .line 594
    :pswitch_1
    new-instance v6, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v11}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    invoke-direct {v6, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 595
    goto :goto_2

    .line 597
    :pswitch_2
    new-instance v7, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v11}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {v7, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 598
    goto :goto_2

    .line 600
    :pswitch_3
    new-instance v8, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v11}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {v8, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 601
    goto :goto_2

    .line 603
    :pswitch_4
    new-instance v9, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v11}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {v9, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 604
    .line 608
    :goto_2
    goto/16 :goto_0

    .line 609
    :cond_1
    const/4 v10, 0x0

    .line 610
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 611
    if-eqz v5, :cond_2

    .line 612
    invoke-interface {v11, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 613
    invoke-virtual {v5}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWeight()I

    move-result v0

    add-int/lit8 v10, v0, 0x0

    .line 616
    :cond_2
    if-eqz v6, :cond_3

    .line 617
    invoke-interface {v11, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 618
    invoke-virtual {v6}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWeight()I

    move-result v0

    add-int/2addr v10, v0

    .line 621
    :cond_3
    if-eqz v7, :cond_4

    .line 622
    invoke-interface {v11, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 623
    invoke-virtual {v7}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWeight()I

    move-result v0

    add-int/2addr v10, v0

    .line 626
    :cond_4
    if-eqz v8, :cond_5

    .line 627
    invoke-interface {v11, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 628
    invoke-virtual {v8}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWeight()I

    move-result v0

    add-int/2addr v10, v0

    .line 631
    :cond_5
    if-eqz v9, :cond_6

    .line 632
    invoke-interface {v11, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 633
    invoke-virtual {v9}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireWeight()I

    move-result v0

    add-int/2addr v10, v0

    .line 636
    :cond_6
    new-instance v12, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;

    invoke-direct {v12, v10, v11}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;-><init>(ILjava/util/List;)V

    .line 640
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 641
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_COURSE_LEVEL_VERY_GOOD"

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    .line 643
    invoke-virtual {v3, v12}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 639
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 647
    goto :goto_3

    .line 645
    :catch_0
    move-exception v13

    .line 646
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildVeryGoodShedule "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v13}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x49a184c -> :sswitch_0
        0x49a1b15 -> :sswitch_1
        0x49a1b34 -> :sswitch_2
        0x49a1b53 -> :sswitch_3
        0x49a1b72 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private static p(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 479
    const/4 v5, 0x0

    .line 480
    const/4 v6, 0x0

    .line 482
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 483
    invoke-virtual {v8}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v9

    const/4 v10, -0x1

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "R018R"

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v10, 0x0

    goto :goto_1

    :sswitch_1
    const-string v0, "R020R"

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v10, 0x1

    :cond_0
    :goto_1
    sparse-switch v10, :sswitch_data_1

    goto :goto_2

    .line 485
    :sswitch_2
    new-instance v5, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v8}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v5, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 486
    goto :goto_2

    .line 488
    :sswitch_3
    new-instance v6, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v8}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v6, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;-><init>(Ljava/lang/String;I)V

    .line 489
    .line 493
    :goto_2
    goto/16 :goto_0

    .line 495
    :cond_1
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 496
    if-eqz v5, :cond_2

    .line 497
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 500
    :cond_2
    if-eqz v6, :cond_3

    .line 501
    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 504
    :cond_3
    new-instance v8, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v8, v0, v7}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;-><init>(ILjava/util/List;)V

    .line 508
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 509
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_COURSE_LEVEL_AVERAGE"

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    .line 511
    invoke-virtual {v3, v8}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 507
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 515
    goto :goto_3

    .line 513
    :catch_0
    move-exception v9

    .line 514
    const-string v0, "Track_RecommedRunCourseInterators"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildAverageShedule "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 516
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x49a182d -> :sswitch_0
        0x49a1af6 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x0 -> :sswitch_2
        0x1 -> :sswitch_3
    .end sparse-switch
.end method
