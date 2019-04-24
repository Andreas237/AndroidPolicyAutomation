.class public Lo/btr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/util/Map;Ljava/util/List;)I
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;)I"
        }
    .end annotation

    .line 180
    const/4 v4, 0x0

    .line 181
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getAction()Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v5

    .line 182
    if-eqz v5, :cond_4

    .line 183
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/Action;->getVideos()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 184
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/Action;->getVideos()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginFitnessAdvice/Video;

    .line 185
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->n(Ljava/lang/String;)J

    move-result-wide v8

    .line 186
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-nez v0, :cond_0

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->k(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bsm;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 188
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lo/bsm;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 189
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->n(Ljava/lang/String;)J

    move-result-wide v8

    .line 192
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8, v9}, Lo/bsm;->d(Ljava/lang/String;J)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 194
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getLength()I

    move-result v0

    add-int/2addr v4, v0

    .line 196
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 197
    new-instance v10, Lcom/huawei/health/suggestion/model/Media;

    invoke-direct {v10}, Lcom/huawei/health/suggestion/model/Media;-><init>()V

    .line 198
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setUrl(Ljava/lang/String;)V

    .line 199
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/Media;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setPath(Ljava/lang/String;)V

    .line 200
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getLength()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/suggestion/model/Media;->setLength(J)V

    .line 201
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setType(I)V

    .line 202
    invoke-interface {p2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    :cond_1
    goto/16 :goto_0

    :cond_2
    goto :goto_1

    .line 208
    :cond_3
    const-string v0, "ParserHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "action.getVideos() == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 212
    :cond_4
    const-string v0, "ParserHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutAction.getAction() == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    :goto_1
    return v4
.end method

.method public static c(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/util/Map;Ljava/util/List;)I
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;)I"
        }
    .end annotation

    .line 114
    const/4 v4, 0x0

    .line 115
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getAction()Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v5

    .line 116
    if-eqz v5, :cond_8

    .line 117
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/Action;->getVideos()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 118
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/Action;->getVideos()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginFitnessAdvice/Video;

    .line 119
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->n(Ljava/lang/String;)J

    move-result-wide v8

    .line 120
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-nez v0, :cond_0

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->k(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bsm;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 122
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lo/bsm;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 123
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->n(Ljava/lang/String;)J

    move-result-wide v8

    .line 126
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8, v9}, Lo/bsm;->d(Ljava/lang/String;J)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 128
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getLength()I

    move-result v0

    add-int/2addr v4, v0

    .line 131
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 132
    new-instance v10, Lcom/huawei/health/suggestion/model/Media;

    invoke-direct {v10}, Lcom/huawei/health/suggestion/model/Media;-><init>()V

    .line 133
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setUrl(Ljava/lang/String;)V

    .line 134
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/Media;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setPath(Ljava/lang/String;)V

    .line 135
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Video;->getLength()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/suggestion/model/Media;->setLength(J)V

    .line 136
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setType(I)V

    .line 137
    invoke-interface {p2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    :cond_1
    goto/16 :goto_0

    :cond_2
    goto :goto_1

    .line 143
    :cond_3
    const-string v0, "ParserHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "action.getVideos() == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    :goto_1
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/Action;->getAudios()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 146
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/Action;->getAudios()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginFitnessAdvice/Audio;

    .line 147
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Audio;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->n(Ljava/lang/String;)J

    move-result-wide v8

    .line 148
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-nez v0, :cond_4

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Audio;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 149
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Audio;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bsm;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 150
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Audio;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lo/bsm;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 151
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Audio;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->n(Ljava/lang/String;)J

    move-result-wide v8

    .line 154
    :cond_4
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Audio;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8, v9}, Lo/bsm;->c(Ljava/lang/String;J)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Audio;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 156
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Audio;->getUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Audio;->getLength()I

    move-result v0

    add-int/2addr v4, v0

    .line 158
    const/4 v0, 0x0

    if-eq v0, p2, :cond_5

    .line 159
    new-instance v10, Lcom/huawei/health/suggestion/model/Media;

    invoke-direct {v10}, Lcom/huawei/health/suggestion/model/Media;-><init>()V

    .line 160
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Audio;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setUrl(Ljava/lang/String;)V

    .line 161
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/Media;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setPath(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Audio;->getLength()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/suggestion/model/Media;->setLength(J)V

    .line 163
    const/4 v0, 0x2

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setType(I)V

    .line 164
    invoke-interface {p2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    :cond_5
    goto/16 :goto_2

    :cond_6
    goto :goto_3

    .line 169
    :cond_7
    const-string v0, "ParserHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "action.getAudios() == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 173
    :cond_8
    const-string v0, "ParserHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutAction.getAction() == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    :goto_3
    return v4
.end method

.method public static c(Ljava/lang/String;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/health/suggestion/model/Data;>;"
        }
    .end annotation

    .line 37
    const-string v0, "ParserHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xml \u5f00\u59cb\u89e3\u6790"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 39
    new-instance v5, Lcom/huawei/health/suggestion/model/BasicPackage;

    invoke-direct {v5}, Lcom/huawei/health/suggestion/model/BasicPackage;-><init>()V

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 44
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v6, v0

    .line 45
    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "utf-8"

    invoke-direct {v0, v6, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v7, v0

    .line 46
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move-object v8, v0

    .line 47
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    :goto_0
    invoke-virtual {v8}, Ljava/io/BufferedReader;->read()I

    move-result v0

    move v10, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 50
    int-to-char v0, v10

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 53
    :cond_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v11

    .line 54
    new-instance v0, Ljava/io/StringReader;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 57
    invoke-interface {v11}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v12

    .line 58
    :goto_1
    const/4 v0, 0x1

    if-eq v12, v0, :cond_3

    .line 59
    sparse-switch v12, :sswitch_data_0

    goto/16 :goto_2

    .line 61
    :sswitch_0
    invoke-interface {v11}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "basic_package"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 63
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/BasicPackage;->saveLanguage(Ljava/lang/String;)V

    .line 64
    const/4 v0, 0x1

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/BasicPackage;->saveType(Ljava/lang/String;)V

    .line 65
    const/4 v0, 0x2

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/BasicPackage;->savePostFix(Ljava/lang/String;)V

    .line 66
    const/4 v0, 0x3

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeType(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/BasicPackage;->saveProvider(Ljava/lang/String;)V

    .line 67
    const/4 v0, 0x4

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/BasicPackage;->saveVersion(Ljava/lang/String;)V

    .line 68
    const/4 v0, 0x5

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/BasicPackage;->saveSize(I)V

    .line 69
    const/4 v0, 0x6

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/BasicPackage;->saveGender(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 71
    :cond_1
    invoke-interface {v11}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "data"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 73
    new-instance v13, Lcom/huawei/health/suggestion/model/Data;

    invoke-direct {v13}, Lcom/huawei/health/suggestion/model/Data;-><init>()V

    .line 74
    const-string v0, "content"

    const/4 v1, 0x0

    invoke-interface {v11, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/suggestion/model/Data;->savaContent(Ljava/lang/String;)V

    .line 75
    const-string v0, "id"

    const/4 v1, 0x0

    invoke-interface {v11, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/suggestion/model/Data;->saveId(Ljava/lang/String;)V

    .line 76
    const-string v0, "url"

    const/4 v1, 0x0

    invoke-interface {v11, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/suggestion/model/Data;->saveUrl(Ljava/lang/String;)V

    .line 77
    const-string v0, "size"

    const/4 v1, 0x0

    invoke-interface {v11, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v13, v0, v1}, Lcom/huawei/health/suggestion/model/Data;->savaSize(J)V

    .line 78
    const-string v0, "md5"

    const/4 v1, 0x0

    invoke-interface {v11, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/suggestion/model/Data;->saveMd5(Ljava/lang/String;)V

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/Data;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/BasicPackage;->acquirePostFix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/suggestion/model/Data;->savaFileName(Ljava/lang/String;)V

    .line 81
    invoke-interface {v4, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 87
    :cond_2
    :goto_2
    invoke-interface {v11}, Lorg/xmlpull/v1/XmlPullParser;->next()I
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v12

    goto/16 :goto_1

    .line 95
    :cond_3
    if-eqz v6, :cond_4

    .line 96
    :try_start_1
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 98
    :cond_4
    if-eqz v7, :cond_5

    .line 99
    invoke-virtual {v7}, Ljava/io/InputStreamReader;->close()V

    .line 101
    :cond_5
    if-eqz v8, :cond_6

    .line 102
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 106
    :cond_6
    goto/16 :goto_4

    .line 104
    :catch_0
    move-exception v9

    .line 105
    const-string v0, "ParserHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseXml IOException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    goto/16 :goto_4

    .line 89
    :catch_1
    move-exception v9

    .line 90
    const-string v0, "ParserHelper"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseXml XmlPullParserException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/xmlpull/v1/XmlPullParserException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    if-eqz v6, :cond_7

    .line 96
    :try_start_3
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 98
    :cond_7
    if-eqz v7, :cond_8

    .line 99
    invoke-virtual {v7}, Ljava/io/InputStreamReader;->close()V

    .line 101
    :cond_8
    if-eqz v8, :cond_9

    .line 102
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 106
    :cond_9
    goto/16 :goto_4

    .line 104
    :catch_2
    move-exception v9

    .line 105
    const-string v0, "ParserHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseXml IOException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    goto/16 :goto_4

    .line 91
    :catch_3
    move-exception v9

    .line 92
    const-string v0, "ParserHelper"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseXml Exception : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 95
    if-eqz v6, :cond_a

    .line 96
    :try_start_5
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 98
    :cond_a
    if-eqz v7, :cond_b

    .line 99
    invoke-virtual {v7}, Ljava/io/InputStreamReader;->close()V

    .line 101
    :cond_b
    if-eqz v8, :cond_c

    .line 102
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 106
    :cond_c
    goto :goto_4

    .line 104
    :catch_4
    move-exception v9

    .line 105
    const-string v0, "ParserHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseXml IOException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    goto :goto_4

    .line 94
    :catchall_0
    move-exception v14

    .line 95
    if-eqz v6, :cond_d

    .line 96
    :try_start_6
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 98
    :cond_d
    if-eqz v7, :cond_e

    .line 99
    invoke-virtual {v7}, Ljava/io/InputStreamReader;->close()V

    .line 101
    :cond_e
    if-eqz v8, :cond_f

    .line 102
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 106
    :cond_f
    goto :goto_3

    .line 104
    :catch_5
    move-exception v15

    .line 105
    const-string v0, "ParserHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseXml IOException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v15}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :goto_3
    throw v14

    .line 109
    :goto_4
    const-string v0, "ParserHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xml \u7ed3\u675f\u89e3\u6790"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method
