.class public Lo/bvs;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/lang/String;I)Lcom/huawei/pluginFitnessAdvice/Video;
    .locals 2

    .line 160
    const-string v0, "hotbody"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveGroup(I)V

    .line 162
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getVideos()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Video;

    return-object v0

    .line 164
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getVideos()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Video;

    return-object v0
.end method

.method public static a(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 76
    const-string v0, "hotbody"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    const-string p2, "beating"

    .line 80
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getDuration()I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getFrequency()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 81
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getFrequency()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->saveDuration(I)V

    .line 83
    :cond_1
    return-object p2
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 68
    const-string v0, "hotbody"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 69
    const-string p0, "timer"

    .line 71
    :cond_0
    return-object p0
.end method

.method public static a(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V
    .locals 1

    .line 173
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getCovers()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/bvs;->d(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 174
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getCovers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Cover;

    invoke-virtual {p1, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveCovers(Lcom/huawei/pluginFitnessAdvice/Cover;)V

    .line 176
    :cond_0
    return-void
.end method

.method public static a(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;ILjava/lang/String;Ljava/util/ArrayList;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;ILjava/lang/String;Ljava/util/ArrayList<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;)Z"
        }
    .end annotation

    .line 189
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getType()I

    move-result v0

    invoke-static {v0}, Lo/buk;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 190
    const/4 v8, 0x0

    .line 191
    const-string v9, ""

    .line 193
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getVideos()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/bvs;->d(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 194
    invoke-static {p0, p1, v7, p2}, Lo/bvs;->a(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/lang/String;I)Lcom/huawei/pluginFitnessAdvice/Video;

    move-result-object v8

    goto :goto_0

    .line 196
    :cond_0
    const-string v0, "TrainDetailHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "video\u4e3a\u7a7a\u6216\u8005\u6570\u636e\u4e0d\u5bf9"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    const/4 v0, 0x0

    return v0

    .line 200
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getAudios()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/bvs;->d(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 201
    invoke-static {p0, v7}, Lo/bvs;->c(Lcom/huawei/pluginFitnessAdvice/Action;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    .line 203
    :cond_1
    const-string v0, "TrainDetailHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u52a8\u4f5c\u540d\u5b57audios\u4e3a\u7a7a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    const/4 v0, 0x0

    return v0

    .line 207
    :goto_1
    const/4 v0, 0x2

    new-array v10, v0, [I

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v10, v1

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getFrequency()I

    move-result v0

    const/4 v1, 0x1

    aput v0, v10, v1

    .line 209
    invoke-static {p0, p1, v7, v10}, Lo/bvs;->e(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/lang/String;[I)Ljava/lang/String;

    move-result-object v7

    .line 211
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getName()Ljava/lang/String;

    move-result-object v2

    .line 212
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getGroup()I

    move-result v3

    const/4 v4, 0x1

    aget v4, v10, v4

    const/4 v5, 0x0

    aget v5, v10, v5

    move-object v6, v7

    invoke-direct/range {v0 .. v6}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;-><init>(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V

    move-object v11, v0

    .line 214
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getCommentaryTraining()Ljava/util/List;

    move-result-object v12

    .line 215
    invoke-static {v7, v11, v12}, Lo/bvs;->d(Ljava/lang/String;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;Ljava/util/List;)V

    .line 217
    invoke-static {v8, v9, v11}, Lo/bvs;->d(Lcom/huawei/pluginFitnessAdvice/Video;Ljava/lang/String;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    return v0

    .line 218
    :cond_2
    move-object/from16 v0, p3

    invoke-virtual {v11, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveWorkoutId(Ljava/lang/String;)V

    .line 219
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getEquipments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setEquipments(Ljava/util/List;)V

    .line 220
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getTrainingpoints()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setTrainingpoints(Ljava/util/List;)V

    .line 221
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getCalorie()F

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveCalorie(F)V

    .line 222
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getDifficulty()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveDifficulty(I)V

    .line 223
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setDescription(Ljava/lang/String;)V

    .line 224
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getGoals()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setGoals(Ljava/util/List;)V

    .line 226
    invoke-static {p0, v11, p2}, Lo/bvs;->a(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 227
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getGap()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setGap(I)V

    .line 228
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getDuration()I

    move-result v0

    invoke-static {v0}, Lo/bzr;->e(I)I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setDuration(I)V

    .line 229
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireCommentaryGap()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setCommentaryGap(Ljava/util/List;)V

    .line 231
    move-object/from16 v0, p4

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    const/4 v0, 0x1

    return v0
.end method

.method public static a(Ljava/util/List;ILjava/lang/String;Ljava/util/ArrayList;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;ILjava/lang/String;Ljava/util/ArrayList<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;)Z"
        }
    .end annotation

    .line 134
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 135
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getAction()Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v3

    .line 136
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 137
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v3, v0, v1

    const/4 v1, 0x1

    aput-object v4, v0, v1

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    invoke-static {v3, v4, p1, p2, p3}, Lo/bvs;->a(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;ILjava/lang/String;Ljava/util/ArrayList;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 134
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 141
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static b(Lcom/huawei/health/suggestion/model/Userinfo;)F
    .locals 4

    .line 119
    if-eqz p0, :cond_0

    .line 120
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Userinfo;->acquireWeight()F

    move-result v0

    return v0

    .line 122
    :cond_0
    const-string v0, "TrainDetailHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDatamanage.getUserinfo() == null,\u4f53\u91cd\u9ed8\u8ba4\u4e3a1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public static b(Ljava/lang/String;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Comment;>;)V"
        }
    .end annotation

    .line 95
    const-string v0, "hotbody"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 97
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Comment;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveTrainpointpath(Ljava/lang/String;)V

    .line 98
    const/4 v0, 0x1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Comment;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setTrainaudiopath(Ljava/lang/String;)V

    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {p1, p2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setCommentaryTraining(Ljava/util/List;)V

    .line 102
    :goto_0
    return-void
.end method

.method public static c(Lcom/huawei/pluginFitnessAdvice/Action;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 44
    const-string v0, "hotbody"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getAudios()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Audio;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Audio;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 47
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getAudios()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Audio;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Audio;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Z
    .locals 1

    .line 169
    if-eqz p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static d(Ljava/lang/String;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Comment;>;)V"
        }
    .end annotation

    .line 87
    invoke-static {p2}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    invoke-static {p0, p1, p2}, Lo/bvs;->b(Ljava/lang/String;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;Ljava/util/List;)V

    .line 92
    :cond_0
    return-void
.end method

.method public static d(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;ILjava/lang/String;Ljava/util/ArrayList;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;ILjava/lang/String;Ljava/util/ArrayList<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;)Z"
        }
    .end annotation

    .line 245
    new-instance v4, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getName()Ljava/lang/String;

    move-result-object v1

    .line 246
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getGroup()I

    move-result v2

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getFrequency()I

    move-result v3

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 247
    invoke-virtual {v4, p3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveWorkoutId(Ljava/lang/String;)V

    .line 248
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getEquipments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setEquipments(Ljava/util/List;)V

    .line 249
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getTrainingpoints()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setTrainingpoints(Ljava/util/List;)V

    .line 250
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getDifficulty()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveDifficulty(I)V

    .line 251
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setDescription(Ljava/lang/String;)V

    .line 252
    invoke-static {p0, v4, p2}, Lo/bvs;->a(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 253
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getGap()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setGap(I)V

    .line 254
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementType()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveMeasurementType(I)V

    .line 255
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementType()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v0

    invoke-static {v0}, Lo/bzr;->e(I)I

    move-result v5

    .line 256
    :goto_0
    invoke-virtual {v4, v5}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveMeasurementValue(I)V

    .line 257
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireTabloidPicUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->savePicUrl(Ljava/lang/String;)V

    .line 258
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getLogoImgUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setOrignLog(Ljava/lang/String;)V

    .line 259
    invoke-virtual {p4, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    const/4 v0, 0x1

    return v0
.end method

.method public static d(Lcom/huawei/pluginFitnessAdvice/Video;Ljava/lang/String;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Z
    .locals 4

    .line 105
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Video;->getThumbnail()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object p1, v0, v1

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    invoke-static {p1}, Lo/bsm;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveNamePath(Ljava/lang/String;)V

    goto :goto_0

    .line 108
    :cond_0
    const-string v0, "TrainDetailHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u52a8\u4f5c\u540d\u5b57\u5f02\u5e38"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    const/4 v0, 0x0

    return v0

    .line 111
    :goto_0
    const-string v0, "TrainDetailHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveMotionPath(Ljava/lang/String;)V

    .line 113
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Video;->getThumbnail()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->savePicUrl(Ljava/lang/String;)V

    .line 114
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Video;->getLogoImgUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->setOrignLog(Ljava/lang/String;)V

    .line 115
    const/4 v0, 0x1

    return v0
.end method

.method public static d(Ljava/util/List;)Z
    .locals 2

    .line 156
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/lang/String;[I)Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 53
    const-string v0, "timer"

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getType()I

    move-result v1

    invoke-static {v1}, Lo/buk;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    const/16 v0, 0x3e8

    const/4 v1, 0x0

    aput v0, p3, v1

    .line 56
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getDuration()I

    move-result v0

    const/4 v1, 0x1

    aput v0, p3, v1

    .line 57
    invoke-static {p2}, Lo/bvs;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 59
    :cond_0
    invoke-static {p0, p1, p2}, Lo/bvs;->a(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 60
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getDuration()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getFrequency()I

    move-result v1

    div-int/2addr v0, v1

    const/4 v1, 0x0

    aput v0, p3, v1

    .line 61
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/Action;->getFrequency()I

    move-result v0

    const/4 v1, 0x1

    aput v0, p3, v1

    .line 63
    :goto_0
    return-object p2
.end method

.method public static e(Ljava/util/List;ILjava/lang/String;Ljava/util/ArrayList;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;ILjava/lang/String;Ljava/util/ArrayList<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;)Z"
        }
    .end annotation

    .line 145
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 146
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getAction()Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v3

    .line 147
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 148
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v3, v0, v1

    const/4 v1, 0x1

    aput-object v4, v0, v1

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    invoke-static {v3, v4, p1, p2, p3}, Lo/bvs;->d(Lcom/huawei/pluginFitnessAdvice/Action;Lcom/huawei/pluginFitnessAdvice/WorkoutAction;ILjava/lang/String;Ljava/util/ArrayList;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 145
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 152
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
