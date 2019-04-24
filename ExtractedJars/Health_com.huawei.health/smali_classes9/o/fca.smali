.class public Lo/fca;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fca$b;
    }
.end annotation


# static fields
.field private static O:I

.field private static P:I

.field private static Q:I

.field private static R:I

.field private static S:I

.field private static T:I

.field private static U:I

.field private static V:I


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:I

.field private H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fix;>;"
        }
    .end annotation
.end field

.field private I:I

.field private J:I

.field private K:I

.field private L:I

.field private M:I

.field private N:Landroid/content/Context;

.field private W:I

.field a:I

.field private aa:I

.field private ab:I

.field private ac:I

.field private ad:I

.field private ag:I

.field private ah:I

.field b:I

.field c:I

.field d:I

.field e:I

.field f:F

.field g:F

.field h:F

.field i:F

.field private j:I

.field k:I

.field private l:Landroid/graphics/Paint;

.field m:I

.field n:Ljava/lang/String;

.field o:I

.field p:I

.field private q:Landroid/graphics/Paint;

.field private r:Landroid/graphics/Paint;

.field private s:Landroid/graphics/Paint;

.field private t:Landroid/graphics/Paint;

.field private u:Landroid/graphics/Paint;

.field private v:I

.field private w:Landroid/graphics/Paint;

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 84
    const/4 v0, 0x1

    sput v0, Lo/fca;->Q:I

    .line 85
    const/16 v0, 0x1d

    sput v0, Lo/fca;->R:I

    .line 86
    const/16 v0, 0x1e

    sput v0, Lo/fca;->O:I

    .line 87
    const/16 v0, 0x3b

    sput v0, Lo/fca;->S:I

    .line 88
    const/16 v0, 0x3c

    sput v0, Lo/fca;->P:I

    .line 89
    const/16 v0, 0x4f

    sput v0, Lo/fca;->V:I

    .line 90
    const/16 v0, 0x50

    sput v0, Lo/fca;->T:I

    .line 91
    const/16 v0, 0x63

    sput v0, Lo/fca;->U:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 121
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 38
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->l:Landroid/graphics/Paint;

    .line 39
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->u:Landroid/graphics/Paint;

    .line 40
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->q:Landroid/graphics/Paint;

    .line 41
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->s:Landroid/graphics/Paint;

    .line 42
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->t:Landroid/graphics/Paint;

    .line 43
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->r:Landroid/graphics/Paint;

    .line 44
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->w:Landroid/graphics/Paint;

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->v:I

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->e:I

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->a:I

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->d:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->c:I

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->b:I

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fca;->H:Ljava/util/List;

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->h:F

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->f:F

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->g:F

    .line 75
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->i:F

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->k:I

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->o:I

    .line 78
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->p:I

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->m:I

    .line 82
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->M:I

    .line 83
    const-string v0, ""

    iput-object v0, p0, Lo/fca;->n:Ljava/lang/String;

    .line 112
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->W:I

    .line 113
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->aa:I

    .line 114
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ac:I

    .line 115
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ab:I

    .line 116
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ad:I

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ah:I

    .line 118
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ag:I

    .line 122
    iput-object p1, p0, Lo/fca;->N:Landroid/content/Context;

    .line 123
    iget-object v0, p0, Lo/fca;->N:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/fca;->b(Landroid/content/Context;)V

    .line 124
    invoke-direct {p0}, Lo/fca;->e()V

    .line 125
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 128
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->l:Landroid/graphics/Paint;

    .line 39
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->u:Landroid/graphics/Paint;

    .line 40
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->q:Landroid/graphics/Paint;

    .line 41
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->s:Landroid/graphics/Paint;

    .line 42
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->t:Landroid/graphics/Paint;

    .line 43
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->r:Landroid/graphics/Paint;

    .line 44
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->w:Landroid/graphics/Paint;

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->v:I

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->e:I

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->a:I

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->d:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->c:I

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->b:I

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fca;->H:Ljava/util/List;

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->h:F

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->f:F

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->g:F

    .line 75
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->i:F

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->k:I

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->o:I

    .line 78
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->p:I

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->m:I

    .line 82
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->M:I

    .line 83
    const-string v0, ""

    iput-object v0, p0, Lo/fca;->n:Ljava/lang/String;

    .line 112
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->W:I

    .line 113
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->aa:I

    .line 114
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ac:I

    .line 115
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ab:I

    .line 116
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ad:I

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ah:I

    .line 118
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ag:I

    .line 129
    iput-object p1, p0, Lo/fca;->N:Landroid/content/Context;

    .line 130
    iget-object v0, p0, Lo/fca;->N:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/fca;->b(Landroid/content/Context;)V

    .line 131
    invoke-direct {p0}, Lo/fca;->e()V

    .line 132
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 135
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->l:Landroid/graphics/Paint;

    .line 39
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->u:Landroid/graphics/Paint;

    .line 40
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->q:Landroid/graphics/Paint;

    .line 41
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->s:Landroid/graphics/Paint;

    .line 42
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->t:Landroid/graphics/Paint;

    .line 43
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->r:Landroid/graphics/Paint;

    .line 44
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/fca;->w:Landroid/graphics/Paint;

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->v:I

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->e:I

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->a:I

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->d:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->c:I

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->b:I

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fca;->H:Ljava/util/List;

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->h:F

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->f:F

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->g:F

    .line 75
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->i:F

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->k:I

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->o:I

    .line 78
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->p:I

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->m:I

    .line 82
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->M:I

    .line 83
    const-string v0, ""

    iput-object v0, p0, Lo/fca;->n:Ljava/lang/String;

    .line 112
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->W:I

    .line 113
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->aa:I

    .line 114
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ac:I

    .line 115
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ab:I

    .line 116
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ad:I

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ah:I

    .line 118
    const/4 v0, 0x0

    iput v0, p0, Lo/fca;->ag:I

    .line 136
    iput-object p1, p0, Lo/fca;->N:Landroid/content/Context;

    .line 137
    iget-object v0, p0, Lo/fca;->N:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/fca;->b(Landroid/content/Context;)V

    .line 138
    invoke-direct {p0}, Lo/fca;->e()V

    .line 139
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 49

    .line 491
    sget v0, Lo/fca;->Q:I

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 492
    sget v0, Lo/fca;->R:I

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 493
    sget v0, Lo/fca;->O:I

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 494
    sget v0, Lo/fca;->S:I

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 495
    sget v0, Lo/fca;->P:I

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 496
    sget v0, Lo/fca;->V:I

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 497
    sget v0, Lo/fca;->T:I

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v11

    .line 498
    sget v0, Lo/fca;->U:I

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v12

    .line 499
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_grade_range:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    const/4 v3, 0x1

    aput-object v6, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 500
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_grade_range:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    const/4 v3, 0x1

    aput-object v8, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 501
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_grade_range:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v9, v2, v3

    const/4 v3, 0x1

    aput-object v10, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 502
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_grade_range:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v11, v2, v3

    const/4 v3, 0x1

    aput-object v12, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    .line 503
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_relaxed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v17

    .line 504
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_normal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v18

    .line 505
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_grade_item_3:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v19

    .line 506
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_highly:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v20

    .line 507
    new-instance v21, Ljava/lang/StringBuilder;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V

    .line 508
    move-object/from16 v0, v21

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    new-instance v22, Ljava/lang/StringBuilder;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuilder;-><init>()V

    .line 510
    move-object/from16 v0, v22

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    new-instance v23, Ljava/lang/StringBuilder;

    invoke-direct/range {v23 .. v23}, Ljava/lang/StringBuilder;-><init>()V

    .line 512
    move-object/from16 v0, v23

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 513
    new-instance v24, Ljava/lang/StringBuilder;

    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    .line 514
    move-object/from16 v0, v24

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->h:F

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->W:I

    .line 517
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->f:F

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->aa:I

    .line 518
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->g:F

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->ac:I

    .line 519
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->i:F

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->ab:I

    .line 520
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->W:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->aa:I

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->ac:I

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->ab:I

    add-int v25, v0, v1

    .line 521
    const-string v0, "PressureMeasurePieChartView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v25

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " relaxed = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fca;->W:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " normal = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fca;->aa:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " middle = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fca;->ac:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " high = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fca;->ab:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    move/from16 v0, v25

    const/16 v1, 0x64

    if-eq v0, v1, :cond_3

    .line 524
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->h:F

    const v1, 0x461c4000    # 10000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    rem-int/lit8 v26, v0, 0x64

    .line 525
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->f:F

    const v1, 0x461c4000    # 10000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    rem-int/lit8 v27, v0, 0x64

    .line 526
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->g:F

    const v1, 0x461c4000    # 10000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    rem-int/lit8 v28, v0, 0x64

    .line 527
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->i:F

    const v1, 0x461c4000    # 10000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    rem-int/lit8 v29, v0, 0x64

    .line 529
    new-instance v30, Ljava/util/ArrayList;

    invoke-direct/range {v30 .. v30}, Ljava/util/ArrayList;-><init>()V

    .line 530
    new-instance v0, Lo/fca$b;

    move/from16 v1, v26

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fca$b;-><init>(II)V

    move-object/from16 v1, v30

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 531
    new-instance v0, Lo/fca$b;

    move/from16 v1, v27

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/fca$b;-><init>(II)V

    move-object/from16 v1, v30

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 532
    new-instance v0, Lo/fca$b;

    move/from16 v1, v28

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/fca$b;-><init>(II)V

    move-object/from16 v1, v30

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 533
    new-instance v0, Lo/fca$b;

    move/from16 v1, v29

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/fca$b;-><init>(II)V

    move-object/from16 v1, v30

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 534
    invoke-static/range {v30 .. v30}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 535
    rsub-int/lit8 v31, v25, 0x64

    .line 536
    if-lez v31, :cond_1

    .line 537
    const/16 v32, 0x0

    :goto_0
    move/from16 v0, v32

    move/from16 v1, v31

    if-ge v0, v1, :cond_0

    .line 538
    rem-int/lit8 v0, v32, 0x4

    move-object/from16 v1, v30

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fca$b;

    iget v0, v0, Lo/fca$b;->a:I

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fca;->d(I)V

    .line 537
    add-int/lit8 v32, v32, 0x1

    goto :goto_0

    :cond_0
    goto :goto_2

    .line 541
    :cond_1
    const/16 v32, 0x0

    :goto_1
    move/from16 v0, v31

    neg-int v0, v0

    move/from16 v1, v32

    if-ge v1, v0, :cond_2

    .line 542
    rem-int/lit8 v0, v32, 0x4

    rsub-int/lit8 v0, v0, 0x3

    move-object/from16 v1, v30

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fca$b;

    iget v0, v0, Lo/fca$b;->a:I

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/fca;->e(I)V

    .line 541
    add-int/lit8 v32, v32, 0x1

    goto :goto_1

    .line 545
    :cond_2
    :goto_2
    const-string v0, "PressureMeasurePieChartView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " relaxed = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fca;->W:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " normal = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fca;->aa:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " middle = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fca;->ac:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " high = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fca;->ab:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 549
    :cond_3
    const/16 v26, 0x0

    .line 550
    const/16 v27, 0x0

    .line 551
    const/16 v28, 0x0

    .line 553
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->q:Landroid/graphics/Paint;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Lo/fca;->c(Landroid/graphics/Paint;Ljava/lang/String;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v29

    .line 554
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    add-int v30, v0, v29

    .line 555
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->ag:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    div-int/lit8 v1, v30, 0x2

    sub-int v31, v0, v1

    .line 556
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->s:Landroid/graphics/Paint;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p0

    iget v2, v2, Lo/fca;->ab:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Lo/fca;->c(Landroid/graphics/Paint;Ljava/lang/String;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v32

    .line 557
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->ah:I

    add-int/lit8 v33, v0, 0x10

    .line 558
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->ag:I

    add-int/lit8 v34, v0, 0x10

    .line 559
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 560
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    move/from16 v1, v33

    int-to-float v1, v1

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    add-int v26, v31, v0

    .line 561
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    add-int v27, v26, v0

    .line 562
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->J:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fca;->N:Landroid/content/Context;

    move/from16 v2, v34

    int-to-float v2, v2

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v1, v32, 0x2

    sub-int v28, v0, v1

    goto :goto_3

    .line 564
    :cond_4
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->J:I

    div-int/lit8 v26, v0, 0x2

    .line 565
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    add-int v27, v26, v0

    .line 566
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x42d80000    # 108.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    add-int v28, v27, v0

    .line 570
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x41c80000    # 25.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v35

    .line 571
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v36

    .line 572
    move/from16 v37, v26

    .line 574
    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, v27

    int-to-float v1, v1

    move/from16 v2, v35

    int-to-float v2, v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/fca;->q:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 575
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->ab:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, v28

    int-to-float v1, v1

    move/from16 v2, v35

    int-to-float v2, v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/fca;->s:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 578
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->q:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move-object/from16 v2, v20

    invoke-virtual {v1, v0, v2}, Lo/fca;->c(Landroid/graphics/Paint;Ljava/lang/String;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v1, v0

    move/from16 v38, v1

    .line 579
    move/from16 v0, v35

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v38, v1

    sub-float v39, v0, v1

    .line 580
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->t:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->z:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 581
    move/from16 v0, v37

    int-to-float v0, v0

    move/from16 v1, v36

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->t:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    move/from16 v4, v39

    invoke-virtual {v3, v0, v4, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 583
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    add-int v0, v0, v35

    int-to-float v0, v0

    add-float v40, v0, v38

    .line 584
    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, v27

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->q:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    move/from16 v4, v40

    invoke-virtual {v3, v0, v1, v4, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 585
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->ac:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, v28

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->s:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    move/from16 v4, v40

    invoke-virtual {v3, v0, v1, v4, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 587
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->q:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move-object/from16 v2, v19

    invoke-virtual {v1, v0, v2}, Lo/fca;->c(Landroid/graphics/Paint;Ljava/lang/String;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v1, v0

    move/from16 v41, v1

    .line 588
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v41, v0

    sub-float v42, v40, v0

    .line 589
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->t:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->y:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 590
    move/from16 v0, v37

    int-to-float v0, v0

    move/from16 v1, v36

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->t:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    move/from16 v4, v42

    invoke-virtual {v3, v0, v4, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 592
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float v0, v0, v40

    add-float v43, v0, v41

    .line 593
    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, v27

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->q:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    move/from16 v4, v43

    invoke-virtual {v3, v0, v1, v4, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 594
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->aa:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, v28

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->s:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    move/from16 v4, v43

    invoke-virtual {v3, v0, v1, v4, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 597
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->q:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move-object/from16 v2, v18

    invoke-virtual {v1, v0, v2}, Lo/fca;->c(Landroid/graphics/Paint;Ljava/lang/String;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v1, v0

    move/from16 v44, v1

    .line 598
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v44, v0

    sub-float v45, v43, v0

    .line 599
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->t:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->C:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 600
    move/from16 v0, v37

    int-to-float v0, v0

    move/from16 v1, v36

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->t:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    move/from16 v4, v45

    invoke-virtual {v3, v0, v4, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 602
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float v0, v0, v43

    add-float v46, v0, v44

    .line 603
    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, v27

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->q:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    move/from16 v4, v46

    invoke-virtual {v3, v0, v1, v4, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 604
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->W:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move/from16 v1, v28

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->s:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    move/from16 v4, v46

    invoke-virtual {v3, v0, v1, v4, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 606
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->q:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    move-object/from16 v2, v17

    invoke-virtual {v1, v0, v2}, Lo/fca;->c(Landroid/graphics/Paint;Ljava/lang/String;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v1, v0

    move/from16 v47, v1

    .line 607
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v47, v0

    sub-float v48, v46, v0

    .line 608
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->t:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->A:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 609
    move/from16 v0, v37

    int-to-float v0, v0

    move/from16 v1, v36

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->t:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    move/from16 v4, v48

    invoke-virtual {v3, v0, v4, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 611
    return-void
.end method

.method private b()Ljava/lang/Boolean;
    .locals 3

    .line 473
    const/4 v2, 0x0

    .line 474
    iget v0, p0, Lo/fca;->m:I

    if-nez v0, :cond_0

    .line 475
    const/4 v2, 0x1

    .line 477
    :cond_0
    iget v0, p0, Lo/fca;->h:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 478
    const/4 v2, 0x1

    goto :goto_0

    .line 479
    :cond_1
    iget v0, p0, Lo/fca;->f:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 480
    const/4 v2, 0x1

    goto :goto_0

    .line 481
    :cond_2
    iget v0, p0, Lo/fca;->g:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_3

    .line 482
    const/4 v2, 0x1

    goto :goto_0

    .line 483
    :cond_3
    iget v0, p0, Lo/fca;->i:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_4

    .line 484
    const/4 v2, 0x1

    .line 486
    :cond_4
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 2

    .line 141
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffe67e17:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->z:I

    .line 142
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_80e67e17:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->x:I

    .line 143
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ffffdf80:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->y:I

    .line 144
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_80ffdf80:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->D:I

    .line 145
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff67dbe6:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->C:I

    .line 146
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_8067dbe6:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->j:I

    .line 147
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff3db6f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->A:I

    .line 148
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_803db6f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->B:I

    .line 150
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_4d1a1a1a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->I:I

    .line 151
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_1a000000:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->G:I

    .line 153
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_801a1a1a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->F:I

    .line 154
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_ff000000:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->E:I

    .line 156
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_fff2f2f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->K:I

    .line 157
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->color_80f2f2f2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/fca;->L:I

    .line 158
    return-void
.end method

.method private c(Landroid/graphics/Canvas;FILandroid/graphics/Paint;)V
    .locals 15

    .line 264
    iget-object v0, p0, Lo/fca;->r:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v6, v0, v1

    .line 265
    iget v0, p0, Lo/fca;->k:I

    int-to-double v0, v0

    iget v2, p0, Lo/fca;->p:I

    int-to-double v2, v2

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v7, v0

    .line 266
    iget v0, p0, Lo/fca;->o:I

    int-to-double v0, v0

    iget v2, p0, Lo/fca;->p:I

    int-to-double v2, v2

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v8, v0

    .line 267
    iget v0, p0, Lo/fca;->k:I

    int-to-double v0, v0

    iget v2, p0, Lo/fca;->a:I

    int-to-double v2, v2

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v9, v0

    .line 268
    iget v0, p0, Lo/fca;->o:I

    int-to-double v0, v0

    iget v2, p0, Lo/fca;->a:I

    int-to-double v2, v2

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v10, v0

    .line 269
    const/4 v11, 0x0

    .line 270
    const/4 v12, 0x0

    .line 271
    const/4 v13, 0x0

    .line 272
    const/4 v14, 0x0

    .line 273
    float-to-double v0, v7

    float-to-double v2, v6

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v13, v0

    .line 274
    float-to-double v0, v8

    float-to-double v2, v6

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    sub-double/2addr v0, v2

    double-to-float v14, v0

    .line 275
    float-to-double v0, v9

    float-to-double v2, v6

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v11, v0

    .line 276
    float-to-double v0, v10

    float-to-double v2, v6

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    sub-double/2addr v0, v2

    double-to-float v12, v0

    .line 277
    move-object/from16 v0, p4

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 278
    move-object/from16 v0, p1

    move v1, v13

    move v2, v14

    move v3, v11

    move v4, v12

    move-object/from16 v5, p4

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 280
    return-void
.end method

.method private c(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .locals 5

    .line 468
    iget v0, p0, Lo/fca;->k:I

    iget-object v1, p0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/fca;->o:I

    iget-object v2, p0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v3, 0x40400000    # 3.0f

    invoke-static {v2, v3}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {p3, p1, v0, v1, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 469
    iget-object v0, p0, Lo/fca;->n:Ljava/lang/String;

    iget v1, p0, Lo/fca;->k:I

    iget-object v2, p0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v2, v3}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lo/fca;->o:I

    iget-object v3, p0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v4, 0x40400000    # 3.0f

    invoke-static {v3, v4}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {p3, v0, v1, v2, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 470
    return-void
.end method

.method private d(I)V
    .locals 2

    .line 621
    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 622
    iget v0, p0, Lo/fca;->ab:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fca;->ab:I

    goto :goto_0

    .line 623
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 624
    iget v0, p0, Lo/fca;->ac:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fca;->ac:I

    goto :goto_0

    .line 625
    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 626
    iget v0, p0, Lo/fca;->aa:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fca;->aa:I

    goto :goto_0

    .line 627
    :cond_2
    if-nez p1, :cond_3

    .line 628
    iget v0, p0, Lo/fca;->W:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fca;->W:I

    .line 630
    :cond_3
    :goto_0
    return-void
.end method

.method private d(Landroid/graphics/Canvas;FILandroid/graphics/Paint;)V
    .locals 15

    .line 243
    iget-object v0, p0, Lo/fca;->r:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v6, v0, v1

    .line 244
    iget v0, p0, Lo/fca;->k:I

    int-to-double v0, v0

    iget v2, p0, Lo/fca;->p:I

    int-to-double v2, v2

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v7, v0

    .line 245
    iget v0, p0, Lo/fca;->o:I

    int-to-double v0, v0

    iget v2, p0, Lo/fca;->p:I

    int-to-double v2, v2

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v8, v0

    .line 246
    iget v0, p0, Lo/fca;->k:I

    int-to-double v0, v0

    iget v2, p0, Lo/fca;->a:I

    int-to-double v2, v2

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v9, v0

    .line 247
    iget v0, p0, Lo/fca;->o:I

    int-to-double v0, v0

    iget v2, p0, Lo/fca;->a:I

    int-to-double v2, v2

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v10, v0

    .line 248
    const/4 v11, 0x0

    .line 249
    const/4 v12, 0x0

    .line 250
    const/4 v13, 0x0

    .line 251
    const/4 v14, 0x0

    .line 252
    float-to-double v0, v7

    float-to-double v2, v6

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    sub-double/2addr v0, v2

    double-to-float v13, v0

    .line 253
    float-to-double v0, v8

    float-to-double v2, v6

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v14, v0

    .line 254
    float-to-double v0, v9

    float-to-double v2, v6

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    sub-double/2addr v0, v2

    double-to-float v11, v0

    .line 255
    float-to-double v0, v10

    float-to-double v2, v6

    move/from16 v4, p2

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v12, v0

    .line 256
    move-object/from16 v0, p4

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 257
    move-object/from16 v0, p1

    move v1, v13

    move v2, v14

    move v3, v11

    move v4, v12

    move-object/from16 v5, p4

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 258
    return-void
.end method

.method private e()V
    .locals 7

    .line 161
    iget-object v0, p0, Lo/fca;->N:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/WindowManager;

    .line 162
    new-instance v4, Landroid/util/DisplayMetrics;

    invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 163
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 164
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 165
    iget v6, v4, Landroid/util/DisplayMetrics;->density:F

    .line 167
    int-to-float v0, v5

    div-float/2addr v0, v6

    float-to-int v0, v0

    iput v0, p0, Lo/fca;->ad:I

    .line 168
    iget v0, p0, Lo/fca;->ad:I

    add-int/lit8 v0, v0, -0x20

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lo/fca;->ah:I

    .line 169
    iget v0, p0, Lo/fca;->ad:I

    add-int/lit8 v0, v0, -0x20

    div-int/lit8 v0, v0, 0x6

    iput v0, p0, Lo/fca;->ag:I

    .line 172
    iget-object v0, p0, Lo/fca;->l:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 173
    iget-object v0, p0, Lo/fca;->l:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 174
    iget-object v0, p0, Lo/fca;->l:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 176
    iget-object v0, p0, Lo/fca;->u:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 177
    iget-object v0, p0, Lo/fca;->u:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 178
    iget-object v0, p0, Lo/fca;->u:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 180
    iget-object v0, p0, Lo/fca;->w:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 181
    iget-object v0, p0, Lo/fca;->w:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 182
    iget-object v0, p0, Lo/fca;->w:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 184
    iget-object v0, p0, Lo/fca;->q:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 185
    iget-object v0, p0, Lo/fca;->q:Landroid/graphics/Paint;

    iget v1, p0, Lo/fca;->F:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 186
    iget-object v0, p0, Lo/fca;->q:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 187
    iget-object v0, p0, Lo/fca;->q:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 189
    iget-object v0, p0, Lo/fca;->s:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 190
    iget-object v0, p0, Lo/fca;->s:Landroid/graphics/Paint;

    iget v1, p0, Lo/fca;->E:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 191
    iget-object v0, p0, Lo/fca;->s:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 192
    iget-object v0, p0, Lo/fca;->s:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 194
    iget-object v0, p0, Lo/fca;->t:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 195
    iget-object v0, p0, Lo/fca;->t:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 197
    iget-object v0, p0, Lo/fca;->r:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 198
    iget-object v0, p0, Lo/fca;->r:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 199
    iget-object v0, p0, Lo/fca;->r:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 201
    iget-object v0, p0, Lo/fca;->N:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fca;->n:Ljava/lang/String;

    .line 203
    return-void
.end method

.method private e(I)V
    .locals 2

    .line 633
    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 634
    iget v0, p0, Lo/fca;->ab:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fca;->ab:I

    goto :goto_0

    .line 635
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 636
    iget v0, p0, Lo/fca;->ac:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fca;->ac:I

    goto :goto_0

    .line 637
    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 638
    iget v0, p0, Lo/fca;->aa:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fca;->aa:I

    goto :goto_0

    .line 639
    :cond_2
    if-nez p1, :cond_3

    .line 640
    iget v0, p0, Lo/fca;->W:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fca;->W:I

    .line 642
    :cond_3
    :goto_0
    return-void
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 32

    .line 283
    const/4 v6, 0x0

    .line 284
    const/4 v7, 0x0

    .line 285
    const/4 v8, 0x0

    .line 286
    const/4 v9, 0x0

    .line 287
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 288
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->h:F

    .line 289
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->f:F

    .line 290
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->g:F

    .line 291
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->i:F

    .line 292
    const/4 v11, 0x0

    .line 293
    const/4 v12, 0x0

    .line 294
    const/4 v13, 0x0

    .line 295
    const/4 v14, 0x0

    .line 296
    const/4 v15, 0x0

    .line 297
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->m:I

    .line 299
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x42500000    # 52.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->a:I

    .line 300
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 301
    const-string v0, "PressureMeasurePieChartView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "screenWidth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fca;->ad:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->ag:I

    add-int/lit8 v0, v0, -0x34

    add-int/lit8 v16, v0, 0x10

    .line 303
    const-string v0, "PressureMeasurePieChartView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dpValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    move/from16 v1, v16

    int-to-float v1, v1

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->e:I

    .line 305
    goto :goto_0

    .line 306
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->e:I

    .line 308
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->d:I

    .line 309
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->e:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->a:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->c:I

    .line 310
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->d:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->a:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->b:I

    .line 311
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->e:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->a:I

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->k:I

    .line 312
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->d:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->a:I

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->o:I

    .line 316
    new-instance v16, Landroid/graphics/Paint;

    invoke-direct/range {v16 .. v16}, Landroid/graphics/Paint;-><init>()V

    .line 317
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 318
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->I:I

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 319
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 320
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 325
    new-instance v17, Landroid/graphics/Paint;

    invoke-direct/range {v17 .. v17}, Landroid/graphics/Paint;-><init>()V

    .line 326
    move-object/from16 v0, v17

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 327
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->G:I

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 328
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 329
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 330
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x41d80000    # 27.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v18

    .line 331
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    const/high16 v1, 0x41f80000    # 31.0f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->p:I

    .line 332
    const/16 v19, 0x0

    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v19

    if-ge v1, v0, :cond_2

    .line 333
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->H:Ljava/util/List;

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lo/fix;

    .line 334
    invoke-virtual/range {v20 .. v20}, Lo/fix;->d()I

    move-result v21

    .line 335
    if-lez v21, :cond_1

    .line 336
    move-object/from16 v0, v20

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 332
    :cond_1
    add-int/lit8 v19, v19, 0x1

    goto :goto_1

    .line 340
    :cond_2
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_2
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lo/fix;

    .line 341
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->m:I

    invoke-virtual/range {v20 .. v20}, Lo/fix;->d()I

    move-result v1

    add-int/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->m:I

    .line 342
    invoke-virtual/range {v20 .. v20}, Lo/fix;->d()I

    move-result v21

    .line 343
    if-lez v21, :cond_3

    move/from16 v0, v21

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_3

    .line 344
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 345
    :cond_3
    move/from16 v0, v21

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_4

    move/from16 v0, v21

    const/16 v1, 0x3c

    if-ge v0, v1, :cond_4

    .line 346
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 347
    :cond_4
    move/from16 v0, v21

    const/16 v1, 0x3c

    if-lt v0, v1, :cond_5

    move/from16 v0, v21

    const/16 v1, 0x50

    if-ge v0, v1, :cond_5

    .line 348
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 349
    :cond_5
    move/from16 v0, v21

    const/16 v1, 0x50

    if-lt v0, v1, :cond_6

    move/from16 v0, v21

    const/16 v1, 0x64

    if-ge v0, v1, :cond_6

    .line 350
    add-int/lit8 v9, v9, 0x1

    .line 352
    :cond_6
    :goto_3
    goto :goto_2

    .line 353
    :cond_7
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->v:I

    .line 354
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->v:I

    if-lez v0, :cond_8

    .line 355
    int-to-float v0, v6

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->v:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->h:F

    .line 356
    int-to-float v0, v7

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->v:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->f:F

    .line 357
    int-to-float v0, v8

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->v:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->g:F

    .line 358
    int-to-float v0, v9

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->v:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/fca;->i:F

    .line 360
    :cond_8
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->k:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->p:I

    sub-int v19, v0, v1

    .line 361
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->k:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->p:I

    add-int v20, v0, v1

    .line 362
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->o:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->p:I

    sub-int v21, v0, v1

    .line 363
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->o:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->p:I

    add-int v22, v0, v1

    .line 364
    new-instance v0, Landroid/graphics/RectF;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->e:I

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/fca;->d:I

    int-to-float v2, v2

    move-object/from16 v3, p0

    iget v3, v3, Lo/fca;->c:I

    int-to-float v3, v3

    move-object/from16 v4, p0

    iget v4, v4, Lo/fca;->b:I

    int-to-float v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v23, v0

    .line 365
    new-instance v0, Landroid/graphics/RectF;

    move/from16 v1, v19

    int-to-float v1, v1

    move/from16 v2, v21

    int-to-float v2, v2

    move/from16 v3, v20

    int-to-float v3, v3

    move/from16 v4, v22

    int-to-float v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v24, v0

    .line 366
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->h:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_9

    .line 367
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->l:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->B:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 369
    move-object/from16 v0, p1

    move-object/from16 v1, v23

    move-object/from16 v2, p0

    iget v2, v2, Lo/fca;->h:F

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v3, v2

    move-object/from16 v2, p0

    iget-object v5, v2, Lo/fca;->l:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 370
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->u:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->A:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 371
    move-object/from16 v0, p1

    move-object/from16 v1, v23

    move-object/from16 v2, p0

    iget v2, v2, Lo/fca;->h:F

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v3, v2

    move-object/from16 v2, p0

    iget-object v5, v2, Lo/fca;->u:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 372
    move-object/from16 v0, p1

    move-object/from16 v1, v24

    move-object/from16 v2, p0

    iget v2, v2, Lo/fca;->h:F

    const/high16 v3, 0x43b40000    # 360.0f

    mul-float/2addr v3, v2

    move-object/from16 v2, p0

    iget-object v5, v2, Lo/fca;->u:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 373
    invoke-direct/range {p0 .. p0}, Lo/fca;->b()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_9

    .line 374
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fca;->e(Landroid/graphics/Canvas;F)V

    .line 375
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->A:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fca;->w:Landroid/graphics/Paint;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4, v0, v1}, Lo/fca;->d(Landroid/graphics/Canvas;FILandroid/graphics/Paint;)V

    .line 376
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->h:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->A:I

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->w:Landroid/graphics/Paint;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v4, v0, v1, v2}, Lo/fca;->c(Landroid/graphics/Canvas;FILandroid/graphics/Paint;)V

    .line 382
    :cond_9
    const/16 v25, 0x0

    .line 383
    const/16 v26, 0x0

    .line 384
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->l:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->j:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 385
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->h:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    add-float v25, v1, v0

    .line 386
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->f:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_a

    .line 387
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->f:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v26, v0, v1

    .line 388
    move-object/from16 v0, p1

    move-object/from16 v1, v23

    move/from16 v2, v25

    move/from16 v3, v26

    move-object/from16 v4, p0

    iget-object v5, v4, Lo/fca;->l:Landroid/graphics/Paint;

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 389
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->u:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->j:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 390
    move-object/from16 v0, p1

    move-object/from16 v1, v23

    move/from16 v2, v25

    move/from16 v3, v26

    move-object/from16 v4, p0

    iget-object v5, v4, Lo/fca;->u:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 391
    move-object/from16 v0, p1

    move-object/from16 v1, v24

    move/from16 v2, v25

    move/from16 v3, v26

    move-object/from16 v4, p0

    iget-object v5, v4, Lo/fca;->u:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 392
    invoke-direct/range {p0 .. p0}, Lo/fca;->b()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_a

    .line 393
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v25

    invoke-direct {v0, v1, v2}, Lo/fca;->e(Landroid/graphics/Canvas;F)V

    .line 394
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->C:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fca;->u:Landroid/graphics/Paint;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, v25

    invoke-direct {v2, v3, v4, v0, v1}, Lo/fca;->d(Landroid/graphics/Canvas;FILandroid/graphics/Paint;)V

    .line 395
    add-float v0, v25, v26

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->C:I

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->w:Landroid/graphics/Paint;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v4, v0, v1, v2}, Lo/fca;->c(Landroid/graphics/Canvas;FILandroid/graphics/Paint;)V

    .line 401
    :cond_a
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->f:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v0, v1

    add-float v25, v25, v0

    .line 402
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->g:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_b

    .line 403
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->g:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v26, v0, v1

    .line 404
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->l:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->D:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 405
    move-object/from16 v0, p1

    move-object/from16 v1, v23

    move/from16 v2, v25

    move/from16 v3, v26

    move-object/from16 v4, p0

    iget-object v5, v4, Lo/fca;->l:Landroid/graphics/Paint;

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 406
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->u:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->D:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 407
    move-object/from16 v0, p1

    move-object/from16 v1, v23

    move/from16 v2, v25

    move/from16 v3, v26

    move-object/from16 v4, p0

    iget-object v5, v4, Lo/fca;->u:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 408
    move-object/from16 v0, p1

    move-object/from16 v1, v24

    move/from16 v2, v25

    move/from16 v3, v26

    move-object/from16 v4, p0

    iget-object v5, v4, Lo/fca;->u:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 409
    invoke-direct/range {p0 .. p0}, Lo/fca;->b()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_b

    .line 410
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v25

    invoke-direct {v0, v1, v2}, Lo/fca;->e(Landroid/graphics/Canvas;F)V

    .line 411
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->y:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fca;->u:Landroid/graphics/Paint;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, v25

    invoke-direct {v2, v3, v4, v0, v1}, Lo/fca;->d(Landroid/graphics/Canvas;FILandroid/graphics/Paint;)V

    .line 412
    add-float v0, v25, v26

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->y:I

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->w:Landroid/graphics/Paint;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v4, v0, v1, v2}, Lo/fca;->c(Landroid/graphics/Canvas;FILandroid/graphics/Paint;)V

    .line 417
    :cond_b
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->g:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v0, v1

    add-float v25, v25, v0

    .line 418
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->i:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_c

    .line 419
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->i:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v26, v0, v1

    .line 420
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->l:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->x:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 421
    move-object/from16 v0, p1

    move-object/from16 v1, v23

    move/from16 v2, v25

    move/from16 v3, v26

    move-object/from16 v4, p0

    iget-object v5, v4, Lo/fca;->l:Landroid/graphics/Paint;

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 422
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->u:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->x:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 423
    move-object/from16 v0, p1

    move-object/from16 v1, v23

    move/from16 v2, v25

    move/from16 v3, v26

    move-object/from16 v4, p0

    iget-object v5, v4, Lo/fca;->u:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 424
    move-object/from16 v0, p1

    move-object/from16 v1, v24

    move/from16 v2, v25

    move/from16 v3, v26

    move-object/from16 v4, p0

    iget-object v5, v4, Lo/fca;->u:Landroid/graphics/Paint;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 425
    invoke-direct/range {p0 .. p0}, Lo/fca;->b()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_c

    .line 426
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v25

    invoke-direct {v0, v1, v2}, Lo/fca;->e(Landroid/graphics/Canvas;F)V

    .line 427
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->z:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fca;->u:Landroid/graphics/Paint;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, v25

    invoke-direct {v2, v3, v4, v0, v1}, Lo/fca;->d(Landroid/graphics/Canvas;FILandroid/graphics/Paint;)V

    .line 428
    add-float v0, v25, v26

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->z:I

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->w:Landroid/graphics/Paint;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v4, v0, v1, v2}, Lo/fca;->c(Landroid/graphics/Canvas;FILandroid/graphics/Paint;)V

    .line 431
    :cond_c
    invoke-direct/range {p0 .. p0}, Lo/fca;->b()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_d

    .line 432
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/high16 v2, 0x43b40000    # 360.0f

    invoke-direct {v0, v1, v2}, Lo/fca;->e(Landroid/graphics/Canvas;F)V

    .line 435
    :cond_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->l:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->K:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 436
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->u:Landroid/graphics/Paint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->L:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 437
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->m:I

    if-nez v0, :cond_e

    .line 438
    move-object/from16 v0, p1

    move-object/from16 v1, v23

    move-object/from16 v2, p0

    iget-object v5, v2, Lo/fca;->l:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 439
    move-object/from16 v0, p1

    move-object/from16 v1, v23

    move-object/from16 v2, p0

    iget-object v5, v2, Lo/fca;->u:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 440
    move-object/from16 v0, p1

    move-object/from16 v1, v24

    move-object/from16 v2, p0

    iget-object v5, v2, Lo/fca;->u:Landroid/graphics/Paint;

    const/4 v2, 0x0

    const/high16 v3, 0x43b40000    # 360.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 442
    :cond_e
    new-instance v27, Landroid/graphics/Paint;

    invoke-direct/range {v27 .. v27}, Landroid/graphics/Paint;-><init>()V

    .line 443
    move-object/from16 v0, v27

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 444
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 445
    move-object/from16 v0, v27

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 446
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->k:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->o:I

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->N:Landroid/content/Context;

    const/high16 v3, 0x41f00000    # 30.0f

    invoke-static {v2, v3}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    move-object/from16 v3, p1

    move-object/from16 v4, v27

    invoke-virtual {v3, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 448
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 449
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_ratio_in_week:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v28

    .line 450
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_ratio_in_month:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v29

    .line 451
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_ration_in_year:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v30

    .line 452
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->N:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_ratio:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v31

    .line 453
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->k:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/fca;->N:Landroid/content/Context;

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {v1, v2}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->o:I

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->N:Landroid/content/Context;

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v2, v3}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    move-object/from16 v2, p1

    move-object/from16 v3, v31

    move-object/from16 v4, v16

    invoke-virtual {v2, v3, v0, v1, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 454
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->M:I

    const/16 v1, 0x2711

    if-ne v0, v1, :cond_f

    .line 455
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fca;->n:Ljava/lang/String;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->k:I

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/fca;->N:Landroid/content/Context;

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {v2, v3}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/fca;->o:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/fca;->N:Landroid/content/Context;

    const/high16 v4, 0x40400000    # 3.0f

    invoke-static {v3, v4}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    move-object/from16 v3, p1

    move-object/from16 v4, v16

    invoke-virtual {v3, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_4

    .line 456
    :cond_f
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->M:I

    const/16 v1, 0x2712

    if-ne v0, v1, :cond_10

    .line 457
    move-object/from16 v0, p0

    move-object/from16 v1, v28

    move-object/from16 v2, v16

    move-object/from16 v3, p1

    invoke-direct {v0, v1, v2, v3}, Lo/fca;->c(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    goto :goto_4

    .line 458
    :cond_10
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->M:I

    const/16 v1, 0x2713

    if-ne v0, v1, :cond_11

    .line 459
    move-object/from16 v0, p0

    move-object/from16 v1, v29

    move-object/from16 v2, v16

    move-object/from16 v3, p1

    invoke-direct {v0, v1, v2, v3}, Lo/fca;->c(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    goto :goto_4

    .line 460
    :cond_11
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->M:I

    const/16 v1, 0x2714

    if-ne v0, v1, :cond_12

    .line 461
    move-object/from16 v0, p0

    move-object/from16 v1, v30

    move-object/from16 v2, v16

    move-object/from16 v3, p1

    invoke-direct {v0, v1, v2, v3}, Lo/fca;->c(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 464
    :cond_12
    :goto_4
    move-object/from16 v0, p0

    iget v0, v0, Lo/fca;->k:I

    int-to-float v0, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/fca;->o:I

    int-to-float v1, v1

    move/from16 v2, v18

    int-to-float v2, v2

    move-object/from16 v3, p1

    move-object/from16 v4, v17

    invoke-virtual {v3, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 465
    return-void
.end method

.method private e(Landroid/graphics/Canvas;F)V
    .locals 10

    .line 234
    iget v0, p0, Lo/fca;->k:I

    int-to-double v0, v0

    iget v2, p0, Lo/fca;->p:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/fca;->u:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v3

    sub-float/2addr v2, v3

    float-to-double v2, v2

    float-to-double v4, p2

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v6, v0

    .line 235
    iget v0, p0, Lo/fca;->o:I

    int-to-double v0, v0

    iget v2, p0, Lo/fca;->p:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/fca;->u:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v3

    sub-float/2addr v2, v3

    float-to-double v2, v2

    float-to-double v4, p2

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v7, v0

    .line 236
    iget v0, p0, Lo/fca;->k:I

    int-to-double v0, v0

    iget v2, p0, Lo/fca;->a:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/fca;->u:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    float-to-double v2, v2

    float-to-double v4, p2

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v8, v0

    .line 237
    iget v0, p0, Lo/fca;->o:I

    int-to-double v0, v0

    iget v2, p0, Lo/fca;->a:I

    int-to-float v2, v2

    iget-object v3, p0, Lo/fca;->u:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    float-to-double v2, v2

    float-to-double v4, p2

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v9, v0

    .line 238
    move-object v0, p1

    move v1, v6

    move v2, v7

    move v3, v8

    move v4, v9

    iget-object v5, p0, Lo/fca;->r:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 239
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fix;>;I)V"
        }
    .end annotation

    .line 207
    iput-object p1, p0, Lo/fca;->H:Ljava/util/List;

    .line 208
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/fca;->v:I

    .line 209
    iput p2, p0, Lo/fca;->M:I

    .line 210
    invoke-virtual {p0}, Lo/fca;->invalidate()V

    .line 211
    return-void
.end method

.method public c(Landroid/graphics/Paint;Ljava/lang/String;)Landroid/graphics/Rect;
    .locals 3

    .line 614
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 615
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 616
    return-object v2
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 222
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 223
    invoke-direct {p0, p1}, Lo/fca;->e(Landroid/graphics/Canvas;)V

    .line 224
    invoke-direct {p0, p1}, Lo/fca;->a(Landroid/graphics/Canvas;)V

    .line 225
    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .line 229
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 230
    invoke-virtual {p0}, Lo/fca;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lo/fca;->J:I

    .line 231
    return-void
.end method

.method public setPieChartValueList(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fix;>;I)V"
        }
    .end annotation

    .line 215
    iput-object p1, p0, Lo/fca;->H:Ljava/util/List;

    .line 216
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/fca;->v:I

    .line 217
    iput p2, p0, Lo/fca;->M:I

    .line 218
    return-void
.end method
