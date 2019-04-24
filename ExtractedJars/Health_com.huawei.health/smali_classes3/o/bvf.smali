.class public Lo/bvf;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bvf$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bvf$c;>;"
    }
.end annotation


# instance fields
.field private a:[[I

.field private b:[[I

.field private c:Lo/bvj;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lo/bvj;>;"
        }
    .end annotation
.end field

.field private i:[I

.field private k:[I


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/bvf;->e:Ljava/util/Map;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bvf;->c:Lo/bvj;

    .line 43
    const/4 v0, 0x6

    const/4 v1, 0x7

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    iput-object v0, p0, Lo/bvf;->a:[[I

    .line 44
    const/4 v0, 0x6

    const/4 v1, 0x7

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    iput-object v0, p0, Lo/bvf;->b:[[I

    .line 46
    const/4 v0, 0x7

    new-array v0, v0, [I

    iput-object v0, p0, Lo/bvf;->k:[I

    .line 47
    const/4 v0, 0x7

    new-array v0, v0, [I

    iput-object v0, p0, Lo/bvf;->i:[I

    .line 51
    iput-object p1, p0, Lo/bvf;->d:Ljava/util/List;

    .line 52
    return-void
.end method

.method private c(JJ)V
    .locals 13

    .line 254
    iget-object v0, p0, Lo/bvf;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 255
    return-void

    .line 258
    :cond_0
    new-instance v4, Lo/bvj;

    invoke-direct {v4}, Lo/bvj;-><init>()V

    .line 259
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 261
    const/4 v6, 0x0

    .line 262
    const/4 v7, 0x0

    .line 263
    const/4 v8, 0x0

    .line 265
    const/4 v9, 0x0

    :goto_0
    iget-object v0, p0, Lo/bvf;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_2

    .line 266
    iget-object v0, p0, Lo/bvf;->d:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 267
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v11

    .line 268
    cmp-long v0, p1, v11

    if-gtz v0, :cond_1

    cmp-long v0, p3, v11

    if-ltz v0, :cond_1

    .line 269
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    invoke-static {v0}, Lo/bzr;->d(F)F

    move-result v0

    invoke-static {v0}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v7, v0

    .line 271
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v0

    add-int/2addr v6, v0

    .line 272
    add-int/lit8 v8, v8, 0x1

    .line 265
    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 276
    :cond_2
    invoke-virtual {v4, v6}, Lo/bvj;->a(I)V

    .line 277
    invoke-virtual {v4, v7}, Lo/bvj;->b(F)V

    .line 278
    invoke-virtual {v4, v8}, Lo/bvj;->d(I)V

    .line 279
    invoke-virtual {v4, v5}, Lo/bvj;->a(Ljava/util/List;)V

    .line 280
    iget-object v0, p0, Lo/bvf;->e:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-wide/from16 v2, p3

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    iput-object v4, p0, Lo/bvf;->c:Lo/bvj;

    .line 282
    return-void
.end method

.method private c([I)[I
    .locals 11

    .line 286
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 287
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0

    .line 290
    :cond_0
    array-length v0, p1

    new-array v2, v0, [I

    .line 291
    iget-object v0, p0, Lo/bvf;->c:Lo/bvj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 292
    iget-object v0, p0, Lo/bvf;->c:Lo/bvj;

    invoke-virtual {v0}, Lo/bvj;->b()Ljava/util/List;

    move-result-object v3

    .line 293
    const/4 v0, 0x0

    if-eq v0, v3, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 294
    const/4 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 295
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 296
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v6

    .line 297
    invoke-static {v6, v7}, Lo/bzt;->e(J)I

    move-result v8

    .line 298
    const/4 v9, 0x0

    :goto_1
    array-length v0, p1

    if-ge v9, v0, :cond_2

    .line 299
    aget v10, p1, v9

    .line 300
    if-ne v8, v10, :cond_1

    .line 301
    aput v10, v2, v9

    .line 302
    goto :goto_2

    .line 298
    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 294
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 308
    :cond_3
    return-object v2
.end method

.method private d([[I)[[I
    .locals 18

    .line 141
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 142
    const/4 v0, 0x0

    const/4 v1, 0x0

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    return-object v0

    .line 145
    :cond_0
    const/4 v0, 0x6

    const/4 v1, 0x7

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[I

    .line 148
    const/4 v5, -0x1

    .line 149
    const/4 v6, -0x1

    .line 150
    const/4 v7, 0x0

    :goto_0
    move-object/from16 v0, p1

    array-length v0, v0

    if-ge v7, v0, :cond_4

    .line 151
    const/4 v8, 0x0

    :goto_1
    aget-object v0, p1, v7

    array-length v0, v0

    if-ge v8, v0, :cond_2

    .line 152
    aget-object v0, p1, v7

    aget v0, v0, v8

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 153
    move v5, v7

    .line 154
    move v6, v8

    .line 155
    goto :goto_2

    .line 151
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 158
    :cond_2
    :goto_2
    const/4 v0, -0x1

    if-eq v5, v0, :cond_3

    const/4 v0, -0x1

    if-eq v6, v0, :cond_3

    .line 159
    goto :goto_3

    .line 150
    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 163
    :cond_4
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bvf;->c:Lo/bvj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 164
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bvf;->c:Lo/bvj;

    invoke-virtual {v0}, Lo/bvj;->b()Ljava/util/List;

    move-result-object v7

    .line 165
    const/4 v0, 0x0

    if-eq v0, v7, :cond_9

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_9

    .line 166
    const/4 v8, 0x0

    :goto_4
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_9

    .line 167
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 168
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v10

    .line 169
    invoke-static {v10, v11}, Lo/bzt;->e(J)I

    move-result v12

    .line 171
    const/4 v13, 0x0

    .line 172
    move v14, v6

    .line 173
    move v15, v5

    :goto_5
    move-object/from16 v0, p1

    array-length v0, v0

    if-ge v15, v0, :cond_8

    .line 174
    move/from16 v16, v14

    :goto_6
    aget-object v0, p1, v15

    array-length v0, v0

    move/from16 v1, v16

    if-ge v1, v0, :cond_6

    .line 175
    aget-object v0, p1, v15

    aget v17, v0, v16

    .line 176
    move/from16 v0, v17

    if-ne v12, v0, :cond_5

    .line 177
    aget-object v0, v4, v15

    aput v17, v0, v16

    .line 178
    const/4 v13, 0x1

    .line 179
    goto :goto_7

    .line 174
    :cond_5
    add-int/lit8 v16, v16, 0x1

    goto :goto_6

    .line 182
    :cond_6
    :goto_7
    if-eqz v13, :cond_7

    .line 183
    goto :goto_8

    .line 185
    :cond_7
    const/4 v14, 0x0

    .line 173
    add-int/lit8 v15, v15, 0x1

    goto :goto_5

    .line 166
    :cond_8
    :goto_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 191
    :cond_9
    return-object v4
.end method


# virtual methods
.method public a(III)V
    .locals 9

    .line 123
    const/4 v0, 0x1

    invoke-static {p1, p2, v0, p3}, Lo/bzt;->b(IIII)Ljava/util/Date;

    move-result-object v3

    .line 124
    invoke-static {v3}, Lo/bzt;->a(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    .line 125
    invoke-static {v3}, Lo/bzt;->e(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    .line 127
    iget-object v0, p0, Lo/bvf;->e:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/bvj;

    .line 128
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 129
    invoke-direct {p0, v4, v5, v6, v7}, Lo/bvf;->c(JJ)V

    goto :goto_0

    .line 131
    :cond_0
    iput-object v8, p0, Lo/bvf;->c:Lo/bvj;

    .line 134
    :goto_0
    invoke-static {p1, p2, p3}, Lo/bzt;->c(III)[[I

    move-result-object v0

    iput-object v0, p0, Lo/bvf;->a:[[I

    .line 135
    iget-object v0, p0, Lo/bvf;->a:[[I

    invoke-direct {p0, v0}, Lo/bvf;->d([[I)[[I

    move-result-object v0

    iput-object v0, p0, Lo/bvf;->b:[[I

    .line 136
    invoke-virtual {p0}, Lo/bvf;->notifyDataSetChanged()V

    .line 137
    return-void
.end method

.method public a(Lo/bvf$c;I)V
    .locals 5

    .line 63
    invoke-virtual {p0}, Lo/bvf;->e()Lo/bvj;

    move-result-object v2

    .line 64
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 65
    invoke-virtual {v2}, Lo/bvj;->b()Ljava/util/List;

    move-result-object v3

    .line 66
    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 67
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v1, p2, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v4, v0}, Lo/bvf$c;->d(Lcom/huawei/health/suggestion/model/WorkoutRecord;Z)V

    .line 70
    :cond_1
    return-void
.end method

.method public a()[[I
    .locals 7

    .line 195
    iget-object v0, p0, Lo/bvf;->a:[[I

    array-length v3, v0

    .line 196
    iget-object v0, p0, Lo/bvf;->a:[[I

    const/4 v1, 0x0

    aget-object v0, v0, v1

    array-length v0, v0

    filled-new-array {v3, v0}, [I

    move-result-object v1

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v2, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[I

    .line 197
    const/4 v5, 0x0

    :goto_0
    array-length v0, v4

    if-ge v5, v0, :cond_1

    iget-object v0, p0, Lo/bvf;->a:[[I

    array-length v0, v0

    if-ge v5, v0, :cond_1

    .line 198
    const/4 v6, 0x0

    :goto_1
    aget-object v0, v4, v5

    array-length v0, v0

    if-ge v6, v0, :cond_0

    iget-object v0, p0, Lo/bvf;->a:[[I

    aget-object v0, v0, v5

    array-length v0, v0

    if-ge v6, v0, :cond_0

    .line 199
    aget-object v0, v4, v5

    iget-object v1, p0, Lo/bvf;->a:[[I

    aget-object v1, v1, v5

    aget v1, v1, v6

    aput v1, v0, v6

    .line 198
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 197
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 202
    :cond_1
    return-object v4
.end method

.method public b(Landroid/view/ViewGroup;I)Lo/bvf$c;
    .locals 4

    .line 57
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fit_history_child_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 58
    new-instance v0, Lo/bvf$c;

    invoke-direct {v0, v3}, Lo/bvf$c;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public b()V
    .locals 11

    .line 82
    iget-object v0, p0, Lo/bvf;->e:Ljava/util/Map;

    const-string v1, "all"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bvj;

    .line 83
    const/4 v0, 0x0

    if-ne v0, v2, :cond_2

    .line 84
    iget-object v0, p0, Lo/bvf;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 85
    return-void

    .line 88
    :cond_0
    new-instance v3, Lo/bvj;

    invoke-direct {v3}, Lo/bvj;-><init>()V

    .line 89
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v7, 0x0

    .line 95
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lo/bvf;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 96
    iget-object v0, p0, Lo/bvf;->d:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 97
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    invoke-static {v0}, Lo/bzr;->d(F)F

    move-result v0

    invoke-static {v0}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v10

    .line 99
    const-string v0, "[^\\d]"

    const-string v1, ""

    invoke-virtual {v10, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 100
    invoke-static {v10}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v6, v0

    .line 101
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v0

    add-int/2addr v5, v0

    .line 102
    add-int/lit8 v7, v7, 0x1

    .line 95
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 104
    :cond_1
    invoke-virtual {v3, v5}, Lo/bvj;->a(I)V

    .line 105
    invoke-virtual {v3, v6}, Lo/bvj;->b(F)V

    .line 106
    invoke-virtual {v3, v7}, Lo/bvj;->d(I)V

    .line 107
    invoke-virtual {v3, v4}, Lo/bvj;->a(Ljava/util/List;)V

    .line 108
    iget-object v0, p0, Lo/bvf;->e:Ljava/util/Map;

    const-string v1, "all"

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    iput-object v3, p0, Lo/bvf;->c:Lo/bvj;

    .line 110
    goto :goto_1

    .line 111
    :cond_2
    iput-object v2, p0, Lo/bvf;->c:Lo/bvj;

    .line 114
    :goto_1
    invoke-virtual {p0}, Lo/bvf;->notifyDataSetChanged()V

    .line 115
    return-void
.end method

.method public b(IIII)V
    .locals 9

    .line 218
    invoke-static {p1, p2, p3, p4}, Lo/bzt;->e(IIII)Ljava/util/Date;

    move-result-object v3

    .line 219
    invoke-static {v3}, Lo/bzt;->b(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    .line 220
    invoke-static {v3}, Lo/bzt;->c(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    .line 222
    iget-object v0, p0, Lo/bvf;->e:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/bvj;

    .line 224
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 225
    invoke-direct {p0, v4, v5, v6, v7}, Lo/bvf;->c(JJ)V

    goto :goto_0

    .line 227
    :cond_0
    iput-object v8, p0, Lo/bvf;->c:Lo/bvj;

    .line 230
    :goto_0
    invoke-static {p1, p2, p3, p4}, Lo/bzt;->d(IIII)[I

    move-result-object v0

    iput-object v0, p0, Lo/bvf;->k:[I

    .line 231
    iget-object v0, p0, Lo/bvf;->k:[I

    invoke-direct {p0, v0}, Lo/bvf;->c([I)[I

    move-result-object v0

    iput-object v0, p0, Lo/bvf;->i:[I

    .line 232
    invoke-virtual {p0}, Lo/bvf;->notifyDataSetChanged()V

    .line 233
    return-void
.end method

.method public c()[[I
    .locals 7

    .line 206
    iget-object v0, p0, Lo/bvf;->b:[[I

    array-length v3, v0

    .line 207
    iget-object v0, p0, Lo/bvf;->b:[[I

    const/4 v1, 0x0

    aget-object v0, v0, v1

    array-length v0, v0

    filled-new-array {v3, v0}, [I

    move-result-object v1

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v2, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[I

    .line 208
    const/4 v5, 0x0

    :goto_0
    array-length v0, v4

    if-ge v5, v0, :cond_1

    iget-object v0, p0, Lo/bvf;->b:[[I

    array-length v0, v0

    if-ge v5, v0, :cond_1

    .line 209
    const/4 v6, 0x0

    :goto_1
    aget-object v0, v4, v5

    array-length v0, v0

    if-ge v6, v0, :cond_0

    iget-object v0, p0, Lo/bvf;->b:[[I

    aget-object v0, v0, v5

    array-length v0, v0

    if-ge v6, v0, :cond_0

    .line 210
    aget-object v0, v4, v5

    iget-object v1, p0, Lo/bvf;->b:[[I

    aget-object v1, v1, v5

    aget v1, v1, v6

    aput v1, v0, v6

    .line 209
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 208
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 213
    :cond_1
    return-object v4
.end method

.method public d()[I
    .locals 3

    .line 236
    iget-object v0, p0, Lo/bvf;->k:[I

    array-length v0, v0

    new-array v1, v0, [I

    .line 237
    const/4 v2, 0x0

    :goto_0
    array-length v0, v1

    if-ge v2, v0, :cond_0

    iget-object v0, p0, Lo/bvf;->k:[I

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 238
    iget-object v0, p0, Lo/bvf;->k:[I

    aget v0, v0, v2

    aput v0, v1, v2

    .line 237
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 240
    :cond_0
    return-object v1
.end method

.method public e()Lo/bvj;
    .locals 1

    .line 119
    iget-object v0, p0, Lo/bvf;->c:Lo/bvj;

    return-object v0
.end method

.method public f()[I
    .locals 3

    .line 244
    iget-object v0, p0, Lo/bvf;->i:[I

    array-length v0, v0

    new-array v1, v0, [I

    .line 245
    const/4 v2, 0x0

    :goto_0
    array-length v0, v1

    if-ge v2, v0, :cond_0

    iget-object v0, p0, Lo/bvf;->i:[I

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 246
    iget-object v0, p0, Lo/bvf;->i:[I

    aget v0, v0, v2

    aput v0, v1, v2

    .line 245
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 248
    :cond_0
    return-object v1
.end method

.method public getItemCount()I
    .locals 3

    .line 74
    iget-object v0, p0, Lo/bvf;->c:Lo/bvj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 75
    const/4 v0, 0x0

    return v0

    .line 77
    :cond_0
    iget-object v0, p0, Lo/bvf;->c:Lo/bvj;

    invoke-virtual {v0}, Lo/bvj;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 78
    return v2
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 35
    move-object v0, p1

    check-cast v0, Lo/bvf$c;

    invoke-virtual {p0, v0, p2}, Lo/bvf;->a(Lo/bvf$c;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 35
    invoke-virtual {p0, p1, p2}, Lo/bvf;->b(Landroid/view/ViewGroup;I)Lo/bvf$c;

    move-result-object v0

    return-object v0
.end method
