.class public Lo/epa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Lo/epa;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/epa;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v7/widget/RecyclerView;Lo/epe;Lo/eqv;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Ljava/util/ArrayList<Lo/eqv;>;Ljava/util/ArrayList<Lo/eqv;>;Landroid/support/v7/widget/RecyclerView;Lo/epe;Lo/eqv;)V"
        }
    .end annotation

    .line 110
    const-string v0, "TimeEat_HomeFragmentUIManager-initData enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 113
    invoke-static {p0}, Lo/epa;->c(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v4

    .line 115
    if-eqz p2, :cond_0

    .line 116
    sget-object v0, Lo/eqq$c;->e:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2, v0}, Lo/eqv;->d(I)V

    .line 117
    move-object/from16 v0, p12

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    :cond_0
    if-eqz p15, :cond_1

    .line 121
    sget-object v0, Lo/eqq$c;->d:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, p15

    invoke-virtual {v1, v0}, Lo/eqv;->d(I)V

    .line 122
    move-object/from16 v0, p12

    move-object/from16 v1, p15

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    :cond_1
    if-eqz p3, :cond_2

    .line 126
    sget-object v0, Lo/eqq$c;->b:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, v0}, Lo/eqv;->d(I)V

    .line 127
    move-object/from16 v0, p12

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    :cond_2
    if-eqz p4, :cond_3

    .line 131
    sget-object v0, Lo/eqq$c;->f:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p4, v0}, Lo/eqv;->d(I)V

    .line 132
    move-object/from16 v0, p12

    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    :cond_3
    if-eqz p5, :cond_4

    .line 136
    sget-object v0, Lo/eqq$c;->k:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p5, v0}, Lo/eqv;->d(I)V

    .line 137
    move-object/from16 v0, p12

    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    :cond_4
    if-eqz p6, :cond_5

    .line 141
    sget-object v0, Lo/eqq$c;->h:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p6, v0}, Lo/eqv;->d(I)V

    .line 142
    move-object/from16 v0, p12

    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    :cond_5
    if-eqz p7, :cond_6

    .line 146
    sget-object v0, Lo/eqq$c;->n:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p7, v0}, Lo/eqv;->d(I)V

    .line 147
    move-object/from16 v0, p12

    invoke-virtual {v0, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    :cond_6
    if-eqz p8, :cond_7

    .line 151
    sget-object v0, Lo/eqq$c;->o:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p8, v0}, Lo/eqv;->d(I)V

    .line 152
    move-object/from16 v0, p12

    invoke-virtual {v0, p8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    :cond_7
    if-eqz p9, :cond_8

    .line 156
    sget-object v0, Lo/eqq$c;->m:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p9, v0}, Lo/eqv;->d(I)V

    .line 157
    move-object/from16 v0, p12

    invoke-virtual {v0, p9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    :cond_8
    if-eqz p10, :cond_9

    .line 161
    sget-object v0, Lo/eqq$c;->l:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p10, v0}, Lo/eqv;->d(I)V

    .line 162
    move-object/from16 v0, p12

    invoke-virtual {v0, p10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    :cond_9
    if-eqz p1, :cond_a

    .line 166
    sget-object v0, Lo/eqq$c;->c:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/eqv;->d(I)V

    .line 167
    move-object/from16 v0, p12

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    :cond_a
    sget-object v0, Lo/epa;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData cardAllDatas="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p11

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mCardDatas="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p12

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    if-eqz p14, :cond_b

    if-eqz p13, :cond_b

    .line 174
    invoke-static/range {p12 .. p12}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 175
    move-object/from16 v0, p11

    move-object/from16 v1, p12

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 176
    move-object/from16 v0, p14

    move-object/from16 v1, p12

    invoke-virtual {v0, v1}, Lo/epe;->e(Ljava/util/ArrayList;)V

    .line 177
    invoke-virtual/range {p13 .. p13}, Landroid/support/v7/widget/RecyclerView;->getRecycledViewPool()Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$RecycledViewPool;->clear()V

    .line 178
    move-object/from16 v0, p13

    move-object/from16 v1, p14

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 181
    :cond_b
    const-string v0, "TimeEat_HomeFragmentUIManager-Leave initData"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 182
    return-void
.end method

.method public static c(Landroid/content/Context;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 48
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 49
    sget-object v0, Lo/eqq$c;->e:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->e:Lo/eqq$a;

    .line 50
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 49
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v0, Lo/eqq$c;->d:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->b:Lo/eqq$a;

    .line 52
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 51
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    sget-object v0, Lo/eqq$c;->c:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->c:Lo/eqq$a;

    .line 54
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 53
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    sget-object v0, Lo/eqq$c;->b:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->a:Lo/eqq$a;

    .line 56
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 55
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    sget-object v0, Lo/eqq$c;->f:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->p:Lo/eqq$a;

    .line 58
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 57
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    sget-object v0, Lo/eqq$c;->k:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->k:Lo/eqq$a;

    .line 60
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 59
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    sget-object v0, Lo/eqq$c;->h:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->h:Lo/eqq$a;

    .line 62
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 61
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    sget-object v0, Lo/eqq$c;->n:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->m:Lo/eqq$a;

    .line 64
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 63
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object v0, Lo/eqq$c;->o:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->n:Lo/eqq$a;

    .line 66
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 65
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    sget-object v0, Lo/eqq$c;->m:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->o:Lo/eqq$a;

    .line 68
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 67
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    sget-object v0, Lo/eqq$c;->l:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->g:Lo/eqq$a;

    .line 70
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 69
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Lo/eqq$c;->g:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->f:Lo/eqq$a;

    .line 72
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 71
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object v0, Lo/eqq$c;->q:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->q:Lo/eqq$a;

    .line 74
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 73
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    sget-object v0, Lo/eqq$c;->u:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->v:Lo/eqq$a;

    .line 76
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 75
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v0, Lo/eqq$c;->t:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->s:Lo/eqq$a;

    .line 78
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 77
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v0, Lo/eqq$c;->v:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->u:Lo/eqq$a;

    .line 80
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 79
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    sget-object v0, Lo/eqq$c;->w:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->y:Lo/eqq$a;

    .line 82
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 81
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 84
    sget-object v0, Lo/eqq$c;->i:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->i:Lo/eqq$a;

    .line 85
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 84
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    sget-object v0, Lo/eqq$c;->r:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->t:Lo/eqq$a;

    .line 87
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 86
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    sget-object v0, Lo/eqq$c;->s:Lo/eqq$c;

    invoke-virtual {v0}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/eqq$a;->r:Lo/eqq$a;

    .line 89
    invoke-virtual {v1}, Lo/eqq$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 88
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    :cond_0
    invoke-static {p0, v2}, Lo/eqq;->e(Landroid/content/Context;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/support/v7/widget/RecyclerView;Landroid/content/Context;Lo/epe;)V
    .locals 2

    .line 41
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 42
    invoke-virtual {p0, p2}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 43
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 44
    new-instance v0, Landroid/support/v7/widget/DefaultItemAnimator;

    invoke-direct {v0}, Landroid/support/v7/widget/DefaultItemAnimator;-><init>()V

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/RecyclerView;->setItemAnimator(Landroid/support/v7/widget/RecyclerView$ItemAnimator;)V

    .line 45
    return-void
.end method
