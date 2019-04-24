.class public Lo/cir;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cco;
.implements Landroid/view/View$OnClickListener;
.implements Lo/chx$b;
.implements Lo/ccm;
.implements Lo/cck;
.implements Lcom/google/android/gms/maps/OnMapReadyCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cir$e;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/RelativeLayout;

.field private B:Z

.field private C:Lo/cew;

.field private D:Landroid/widget/ImageView;

.field private E:Landroid/widget/ImageView;

.field private F:Landroid/graphics/drawable/GradientDrawable;

.field private G:Landroid/widget/LinearLayout;

.field private H:I

.field private I:I

.field private J:I

.field private K:I

.field private L:I

.field private M:I

.field private N:I

.field private O:I

.field private P:I

.field private Q:Landroid/widget/TextView;

.field private R:F

.field private S:I

.field private T:Z

.field private U:Landroid/widget/ImageView;

.field private V:Z

.field private W:Z

.field private X:Landroid/widget/ImageButton;

.field private Y:I

.field private Z:Z

.field private a:Z

.field private aa:Landroid/animation/Animator;

.field private ab:Lo/cfi;

.field private ac:Landroid/animation/Animator$AnimatorListener;

.field private ae:I

.field private af:Lo/cig;

.field private b:Z

.field public c:Lo/egv;

.field private d:Z

.field private e:Lo/ciq;

.field private f:Lo/cha;

.field private g:Lcom/amap/api/maps/MapView;

.field private h:Landroid/view/View;

.field private i:Landroid/content/Context;

.field private j:I

.field private k:Lo/chc;

.field private l:I

.field private m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

.field private n:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Lo/cik;>;"
        }
    .end annotation
.end field

.field private o:Landroid/os/Bundle;

.field private p:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Lo/cik;>;"
        }
    .end annotation
.end field

.field private q:Landroid/content/res/Resources;

.field private r:Z

.field private s:Lo/cbu;

.field private t:Lo/cir$e;

.field private u:Landroid/widget/RelativeLayout;

.field private v:Z

.field private w:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private x:Landroid/view/View;

.field private y:Z

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/content/Context;Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;Landroid/os/Bundle;)V
    .locals 4

    .line 223
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->e:Lo/ciq;

    .line 96
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cir;->a:Z

    .line 98
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cir;->b:Z

    .line 100
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cir;->d:Z

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->h:Landroid/view/View;

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->g:Lcom/amap/api/maps/MapView;

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->k:Lo/chc;

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->f:Lo/cha;

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    .line 114
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    .line 116
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lo/cir;->n:Landroid/util/SparseArray;

    .line 118
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->o:Landroid/os/Bundle;

    .line 120
    const/4 v0, -0x1

    iput v0, p0, Lo/cir;->l:I

    .line 122
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->q:Landroid/content/res/Resources;

    .line 124
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->t:Lo/cir$e;

    .line 126
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cir;->r:Z

    .line 128
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->s:Lo/cbu;

    .line 133
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cir;->y:Z

    .line 135
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cir;->v:Z

    .line 139
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cir;->w:Ljava/util/Map;

    .line 141
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->z:Ljava/lang/String;

    .line 145
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cir;->B:Z

    .line 146
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->C:Lo/cew;

    .line 147
    const/4 v0, 0x0

    iput v0, p0, Lo/cir;->j:I

    .line 154
    sget v0, Lo/cdw;->m:I

    iput v0, p0, Lo/cir;->H:I

    .line 155
    sget v0, Lo/cdw;->g:I

    iput v0, p0, Lo/cir;->I:I

    .line 164
    const/high16 v0, 0x41880000    # 17.0f

    iput v0, p0, Lo/cir;->R:F

    .line 167
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->X:Landroid/widget/ImageButton;

    .line 169
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->U:Landroid/widget/ImageView;

    .line 170
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cir;->W:Z

    .line 172
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cir;->T:Z

    .line 176
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cir;->V:Z

    .line 178
    const/4 v0, 0x1

    iput v0, p0, Lo/cir;->Y:I

    .line 182
    new-instance v0, Lo/cir$1;

    invoke-direct {v0, p0}, Lo/cir$1;-><init>(Lo/cir;)V

    iput-object v0, p0, Lo/cir;->ab:Lo/cfi;

    .line 198
    new-instance v0, Lo/cir$11;

    invoke-direct {v0, p0}, Lo/cir$11;-><init>(Lo/cir;)V

    iput-object v0, p0, Lo/cir;->ac:Landroid/animation/Animator$AnimatorListener;

    .line 220
    const/4 v0, 0x0

    iput v0, p0, Lo/cir;->ae:I

    .line 986
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->af:Lo/cig;

    .line 224
    iput-object p1, p0, Lo/cir;->h:Landroid/view/View;

    .line 225
    iput-object p2, p0, Lo/cir;->i:Landroid/content/Context;

    .line 226
    iput-object p4, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    .line 227
    iput-object p5, p0, Lo/cir;->o:Landroid/os/Bundle;

    .line 228
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lo/cir;->q:Landroid/content/res/Resources;

    .line 229
    new-instance v0, Lo/cir$e;

    invoke-direct {v0, p0}, Lo/cir$e;-><init>(Lo/cir;)V

    iput-object v0, p0, Lo/cir;->t:Lo/cir$e;

    .line 230
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->h()Z

    move-result v0

    iput-boolean v0, p0, Lo/cir;->r:Z

    .line 231
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    iput-object v0, p0, Lo/cir;->s:Lo/cbu;

    .line 232
    iget-object v0, p0, Lo/cir;->s:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->v()V

    .line 234
    iget-object v0, p0, Lo/cir;->s:Lo/cbu;

    iget-object v1, p0, Lo/cir;->ab:Lo/cfi;

    invoke-virtual {v0, v1}, Lo/cbu;->a(Lo/cfi;)V

    .line 236
    invoke-direct {p0}, Lo/cir;->H()Z

    move-result v0

    iput-boolean v0, p0, Lo/cir;->T:Z

    .line 238
    invoke-direct {p0}, Lo/cir;->A()V

    .line 239
    invoke-direct {p0}, Lo/cir;->l()V

    .line 240
    invoke-direct {p0}, Lo/cir;->o()V

    .line 241
    invoke-direct {p0}, Lo/cir;->n()V

    .line 242
    invoke-direct {p0}, Lo/cir;->w()V

    .line 243
    invoke-direct {p0}, Lo/cir;->i()V

    .line 246
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    if-eqz v0, :cond_0

    .line 247
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->text_targetUnit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 248
    invoke-direct {p0, v3}, Lo/cir;->d(Landroid/widget/TextView;)V

    .line 250
    :cond_0
    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_1

    iget v0, p0, Lo/cir;->l:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    .line 251
    invoke-virtual {v0}, Lo/ciq;->E()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 252
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->E()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_size_75_dp:I

    .line 253
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 252
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 256
    :cond_1
    invoke-static {p0}, Lo/cbu;->e(Lo/cck;)V

    .line 258
    return-void
.end method

.method static synthetic A(Lo/cir;)Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->z:Ljava/lang/String;

    return-object v0
.end method

.method private A()V
    .locals 4

    .line 1863
    iget v2, p0, Lo/cir;->H:I

    .line 1864
    shr-int/lit8 v0, v2, 0x18

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lo/cir;->L:I

    .line 1865
    shr-int/lit8 v0, v2, 0x10

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lo/cir;->M:I

    .line 1866
    shr-int/lit8 v0, v2, 0x8

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lo/cir;->N:I

    .line 1867
    and-int/lit16 v0, v2, 0xff

    iput v0, p0, Lo/cir;->J:I

    .line 1868
    iget v3, p0, Lo/cir;->I:I

    .line 1869
    shr-int/lit8 v0, v3, 0x18

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lo/cir;->K:I

    .line 1870
    shr-int/lit8 v0, v3, 0x10

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lo/cir;->S:I

    .line 1871
    shr-int/lit8 v0, v3, 0x8

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lo/cir;->O:I

    .line 1872
    and-int/lit16 v0, v3, 0xff

    iput v0, p0, Lo/cir;->P:I

    .line 1873
    return-void
.end method

.method private B()V
    .locals 2

    .line 1888
    iget-object v0, p0, Lo/cir;->t:Lo/cir$e;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lo/cir$e;->removeMessages(I)V

    .line 1889
    iget-object v0, p0, Lo/cir;->aa:Landroid/animation/Animator;

    if-eqz v0, :cond_1

    .line 1890
    iget-object v0, p0, Lo/cir;->aa:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1891
    iget-object v0, p0, Lo/cir;->aa:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 1893
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->aa:Landroid/animation/Animator;

    .line 1895
    :cond_1
    return-void
.end method

.method static synthetic B(Lo/cir;)Z
    .locals 1

    .line 88
    invoke-direct {p0}, Lo/cir;->x()Z

    move-result v0

    return v0
.end method

.method static synthetic C(Lo/cir;)Landroid/animation/Animator$AnimatorListener;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->ac:Landroid/animation/Animator$AnimatorListener;

    return-object v0
.end method

.method private C()V
    .locals 2

    .line 1898
    invoke-direct {p0}, Lo/cir;->B()V

    .line 1899
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->e()Landroid/widget/TextView;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    .line 1900
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->e()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1901
    return-void
.end method

.method static synthetic D(Lo/cir;)Landroid/widget/ImageView;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->U:Landroid/widget/ImageView;

    return-object v0
.end method

.method private D()V
    .locals 2

    .line 1802
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$27;

    invoke-direct {v1, p0}, Lo/cir$27;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1830
    return-void
.end method

.method private H()Z
    .locals 4

    .line 1913
    iget-object v0, p0, Lo/cir;->o:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cir;->o:Landroid/os/Bundle;

    const-string v1, "map_tracking_sport_type_sportting"

    .line 1914
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x108

    if-ne v0, v1, :cond_0

    .line 1915
    const/4 v0, 0x0

    return v0

    .line 1917
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 1918
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "dev_3ddis_track"

    .line 1917
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1919
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    const-string v0, "true"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1920
    const/4 v0, 0x1

    return v0

    .line 1922
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private a(Landroid/os/Bundle;Landroid/util/SparseArray;)Landroid/util/SparseArray;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Bundle;Landroid/util/SparseArray<Lo/cik;>;)Landroid/util/SparseArray<Lo/cin;>;"
        }
    .end annotation

    .line 1481
    new-instance v5, Landroid/util/SparseArray;

    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    .line 1484
    const-string v0, "distance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 1485
    const-string v0, "calorie"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v0, v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 1487
    const-string v0, "heartRate"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1488
    const-string v0, "duration"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1489
    const-string v0, "speed"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 1490
    const-string v0, "pace"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cds;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 1491
    const-string v0, "stepRate"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 1492
    const-string v0, "countdownValue"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 1493
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/cir;->a:Z

    if-eqz v0, :cond_2

    if-eqz v8, :cond_2

    .line 1494
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1496
    const-string v0, "0"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1497
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 1499
    :cond_1
    invoke-static {v8}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 1503
    :cond_2
    :goto_0
    move-object/from16 v0, p0

    iget v0, v0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_4

    .line 1504
    if-eqz v8, :cond_3

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1505
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 1509
    :cond_4
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-ne v0, v1, :cond_5

    .line 1510
    return-object v5

    .line 1512
    :cond_5
    invoke-virtual/range {p2 .. p2}, Landroid/util/SparseArray;->size()I

    move-result v14

    .line 1513
    const/4 v15, 0x0

    .line 1514
    const/16 v16, 0x0

    :goto_1
    move/from16 v0, v16

    if-ge v0, v14, :cond_14

    .line 1515
    move-object/from16 v0, p2

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/cik;

    .line 1516
    sget-object v0, Lo/cik;->b:Lo/cik;

    move-object/from16 v1, v17

    if-ne v1, v0, :cond_7

    .line 1518
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1519
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_sport_distance:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v6

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cir;->q:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    goto/16 :goto_2

    .line 1522
    :cond_6
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_sport_distance:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v6

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cir;->q:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    goto/16 :goto_2

    .line 1524
    :cond_7
    sget-object v0, Lo/cik;->d:Lo/cik;

    move-object/from16 v1, v17

    if-ne v1, v0, :cond_8

    .line 1525
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_tip_icon_text_time:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v9

    const-string v3, ""

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    goto/16 :goto_2

    .line 1526
    :cond_8
    sget-object v0, Lo/cik;->c:Lo/cik;

    move-object/from16 v1, v17

    if-ne v1, v0, :cond_a

    .line 1527
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1528
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_tip_icon_text_pace:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v10

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cir;->q:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    goto/16 :goto_2

    .line 1531
    :cond_9
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_tip_icon_text_pace:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v10

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cir;->q:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    goto/16 :goto_2

    .line 1533
    :cond_a
    sget-object v0, Lo/cik;->a:Lo/cik;

    move-object/from16 v1, v17

    if-ne v1, v0, :cond_b

    .line 1534
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_calories:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cir;->q:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    goto/16 :goto_2

    .line 1535
    :cond_b
    sget-object v0, Lo/cik;->e:Lo/cik;

    move-object/from16 v1, v17

    if-ne v1, v0, :cond_c

    .line 1536
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_watch_heart_rate_string:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cir;->q:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    goto/16 :goto_2

    .line 1537
    :cond_c
    sget-object v0, Lo/cik;->k:Lo/cik;

    move-object/from16 v1, v17

    if-ne v1, v0, :cond_e

    .line 1538
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1539
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_bupin:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v12

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cir;->q:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    goto/16 :goto_2

    .line 1542
    :cond_d
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_bupin:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v12

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cir;->q:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    goto/16 :goto_2

    .line 1544
    :cond_e
    sget-object v0, Lo/cik;->g:Lo/cik;

    move-object/from16 v1, v17

    if-ne v1, v0, :cond_10

    .line 1545
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1546
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_remain_distance:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v13

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cir;->q:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    goto/16 :goto_2

    .line 1549
    :cond_f
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_remain_distance:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v13

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cir;->q:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    goto :goto_2

    .line 1551
    :cond_10
    sget-object v0, Lo/cik;->i:Lo/cik;

    move-object/from16 v1, v17

    if-ne v1, v0, :cond_11

    .line 1552
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_remain_time:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v13

    const-string v3, ""

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    goto :goto_2

    .line 1553
    :cond_11
    sget-object v0, Lo/cik;->h:Lo/cik;

    move-object/from16 v1, v17

    if-ne v1, v0, :cond_12

    .line 1554
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_remain_calorie:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v13

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/cir;->q:Landroid/content/res/Resources;

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    goto :goto_2

    .line 1555
    :cond_12
    sget-object v0, Lo/cik;->f:Lo/cik;

    move-object/from16 v1, v17

    if-ne v1, v0, :cond_13

    .line 1556
    new-instance v0, Lo/cin;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_sport_peisu_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v2, v11

    const-string v3, ""

    invoke-direct {v0, v1, v2, v3}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v0

    .line 1558
    :cond_13
    :goto_2
    move/from16 v0, v16

    invoke-virtual {v5, v0, v15}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1514
    add-int/lit8 v16, v16, 0x1

    goto/16 :goto_1

    .line 1560
    :cond_14
    return-object v5
.end method

.method static synthetic a(Lo/cir;)Lo/cig;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->af:Lo/cig;

    return-object v0
.end method

.method private a(Lo/cio;Lo/cin;)V
    .locals 4

    .line 1709
    move-object v2, p1

    .line 1710
    move-object v3, p2

    .line 1711
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$21;

    invoke-direct {v1, p0, v2, v3}, Lo/cir$21;-><init>(Lo/cir;Lo/cio;Lo/cin;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1717
    return-void
.end method

.method static synthetic a(Lo/cir;Z)Z
    .locals 0

    .line 88
    iput-boolean p1, p0, Lo/cir;->Z:Z

    return p1
.end method

.method static synthetic b(Lo/cir;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    return-object v0
.end method

.method private b(II)V
    .locals 7

    .line 1668
    iget-boolean v0, p0, Lo/cir;->a:Z

    if-eqz v0, :cond_0

    .line 1669
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    invoke-static {}, Lo/cik;->values()[Lo/cik;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-virtual {v0, p2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    .line 1671
    :cond_0
    iget-object v0, p0, Lo/cir;->n:Landroid/util/SparseArray;

    add-int/lit8 v1, p2, -0x4

    invoke-static {}, Lo/cik;->values()[Lo/cik;

    move-result-object v2

    aget-object v2, v2, p1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1674
    :goto_0
    const/4 v4, 0x0

    .line 1675
    iget-boolean v0, p0, Lo/cir;->a:Z

    if-eqz v0, :cond_1

    .line 1676
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->b()Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cio;

    goto :goto_1

    .line 1678
    :cond_1
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->y()Landroid/util/SparseArray;

    move-result-object v0

    add-int/lit8 v1, p2, -0x4

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cio;

    .line 1680
    :goto_1
    const/4 v5, 0x0

    .line 1681
    invoke-static {}, Lo/cik;->values()[Lo/cik;

    move-result-object v0

    aget-object v6, v0, p1

    .line 1682
    sget-object v0, Lo/cik;->b:Lo/cik;

    if-ne v6, v0, :cond_2

    .line 1683
    new-instance v5, Lo/cin;

    iget-object v0, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_sport_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    iget-object v2, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v0, v1, v2}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 1684
    :cond_2
    sget-object v0, Lo/cik;->d:Lo/cik;

    if-ne v6, v0, :cond_3

    .line 1685
    new-instance v5, Lo/cin;

    iget-object v0, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_tip_icon_text_time:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const-string v2, ""

    invoke-direct {v5, v0, v1, v2}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 1686
    :cond_3
    sget-object v0, Lo/cik;->c:Lo/cik;

    if-ne v6, v0, :cond_4

    .line 1687
    new-instance v5, Lo/cin;

    iget-object v0, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_tip_icon_text_pace:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    iget-object v2, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_pace_unit:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v0, v1, v2}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 1688
    :cond_4
    sget-object v0, Lo/cik;->a:Lo/cik;

    if-ne v6, v0, :cond_5

    .line 1689
    new-instance v5, Lo/cin;

    iget-object v0, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_calories:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    iget-object v2, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v0, v1, v2}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 1690
    :cond_5
    sget-object v0, Lo/cik;->e:Lo/cik;

    if-ne v6, v0, :cond_6

    .line 1691
    new-instance v5, Lo/cin;

    iget-object v0, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_watch_heart_rate_string:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    iget-object v2, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v0, v1, v2}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 1692
    :cond_6
    sget-object v0, Lo/cik;->k:Lo/cik;

    if-ne v6, v0, :cond_7

    .line 1693
    new-instance v5, Lo/cin;

    iget-object v0, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_bupin:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    iget-object v2, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v0, v1, v2}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 1694
    :cond_7
    sget-object v0, Lo/cik;->f:Lo/cik;

    if-ne v6, v0, :cond_8

    .line 1695
    new-instance v5, Lo/cin;

    iget-object v0, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_sport_peisu_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const-string v2, ""

    invoke-direct {v5, v0, v1, v2}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 1696
    :cond_8
    sget-object v0, Lo/cik;->g:Lo/cik;

    if-ne v6, v0, :cond_9

    .line 1697
    new-instance v5, Lo/cin;

    iget-object v0, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_remain_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    iget-object v2, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v0, v1, v2}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 1698
    :cond_9
    sget-object v0, Lo/cik;->i:Lo/cik;

    if-ne v6, v0, :cond_a

    .line 1699
    new-instance v5, Lo/cin;

    iget-object v0, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_remain_time:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const-string v2, ""

    invoke-direct {v5, v0, v1, v2}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 1700
    :cond_a
    sget-object v0, Lo/cik;->h:Lo/cik;

    if-ne v6, v0, :cond_b

    .line 1701
    new-instance v5, Lo/cin;

    iget-object v0, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_remain_calorie:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    iget-object v2, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v0, v1, v2}, Lo/cin;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1703
    :cond_b
    :goto_2
    if-nez v5, :cond_c

    .line 1704
    return-void

    .line 1706
    :cond_c
    invoke-direct {p0, v4, v5}, Lo/cir;->a(Lo/cio;Lo/cin;)V

    .line 1707
    return-void
.end method

.method static synthetic b(Lo/cir;II)V
    .locals 0

    .line 88
    invoke-direct {p0, p1, p2}, Lo/cir;->b(II)V

    return-void
.end method

.method static synthetic b(Lo/cir;Z)V
    .locals 0

    .line 88
    invoke-direct {p0, p1}, Lo/cir;->d(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 3

    .line 1211
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v2

    .line 1212
    if-eqz p1, :cond_3

    .line 1214
    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_1

    .line 1215
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->c()Landroid/widget/ImageButton;

    move-result-object v0

    if-eqz v2, :cond_0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_sporting_voice_enable_normal_rtl_white:I

    goto :goto_0

    :cond_0
    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_sporting_voice_enable_normal_white:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    goto :goto_4

    .line 1217
    :cond_1
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->c()Landroid/widget/ImageButton;

    move-result-object v0

    if-eqz v2, :cond_2

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_sporting_voice_enable_normal_rtl:I

    goto :goto_1

    :cond_2
    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_sporting_voice_enable_normal:I

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    goto :goto_4

    .line 1220
    :cond_3
    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_5

    .line 1221
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->c()Landroid/widget/ImageButton;

    move-result-object v0

    if-eqz v2, :cond_4

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_sporting_voice_disable_normal_rtl_white:I

    goto :goto_2

    :cond_4
    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_sporting_voice_disable_normal_white:I

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    goto :goto_4

    .line 1223
    :cond_5
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->c()Landroid/widget/ImageButton;

    move-result-object v0

    if-eqz v2, :cond_6

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_sporting_voice_disable_normal_rtl:I

    goto :goto_3

    :cond_6
    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_sporting_voice_disable_normal:I

    :goto_3
    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 1226
    :goto_4
    return-void
.end method

.method private c(F)I
    .locals 4

    .line 1877
    iget v0, p0, Lo/cir;->L:I

    iget v1, p0, Lo/cir;->K:I

    iget v2, p0, Lo/cir;->L:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    add-int/2addr v0, v1

    shl-int/lit8 v0, v0, 0x18

    iget v1, p0, Lo/cir;->M:I

    iget v2, p0, Lo/cir;->S:I

    iget v3, p0, Lo/cir;->M:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    mul-float/2addr v2, p1

    float-to-int v2, v2

    add-int/2addr v1, v2

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    iget v1, p0, Lo/cir;->N:I

    iget v2, p0, Lo/cir;->O:I

    iget v3, p0, Lo/cir;->N:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    mul-float/2addr v2, p1

    float-to-int v2, v2

    add-int/2addr v1, v2

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    iget v1, p0, Lo/cir;->J:I

    iget v2, p0, Lo/cir;->P:I

    iget v3, p0, Lo/cir;->J:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    mul-float/2addr v2, p1

    float-to-int v2, v2

    add-int/2addr v1, v2

    or-int/2addr v0, v1

    return v0
.end method

.method static synthetic c(Lo/cir;F)I
    .locals 1

    .line 88
    invoke-direct {p0, p1}, Lo/cir;->c(F)I

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/cir;I)I
    .locals 0

    .line 88
    iput p1, p0, Lo/cir;->ae:I

    return p1
.end method

.method static synthetic c(Lo/cir;)Landroid/content/Context;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    return-object v0
.end method

.method private c(Landroid/animation/Animator$AnimatorListener;)V
    .locals 11

    .line 1048
    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 1049
    iget-object v0, p0, Lo/cir;->E:Landroid/widget/ImageView;

    const-string v1, "scaleX"

    const/4 v2, 0x2

    new-array v2, v2, [F

    iget v3, p0, Lo/cir;->R:F

    const/4 v4, 0x0

    aput v3, v2, v4

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x1

    aput v3, v2, v4

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v6

    .line 1050
    const-wide/16 v0, 0x1f4

    invoke-virtual {v6, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 1051
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    invoke-virtual {v6, v0}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1052
    iget-object v0, p0, Lo/cir;->E:Landroid/widget/ImageView;

    const-string v1, "scaleY"

    const/4 v2, 0x2

    new-array v2, v2, [F

    iget v3, p0, Lo/cir;->R:F

    const/4 v4, 0x0

    aput v3, v2, v4

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x1

    aput v3, v2, v4

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 1053
    const-wide/16 v0, 0x1f4

    invoke-virtual {v7, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 1054
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    invoke-virtual {v7, v0}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1055
    iget-object v0, p0, Lo/cir;->E:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iput-object v0, p0, Lo/cir;->F:Landroid/graphics/drawable/GradientDrawable;

    .line 1056
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v8

    .line 1057
    new-instance v0, Lo/cir$10;

    invoke-direct {v0, p0}, Lo/cir$10;-><init>(Lo/cir;)V

    invoke-virtual {v8, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 1064
    const-wide/16 v0, 0x1f4

    invoke-virtual {v8, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 1065
    const/4 v0, 0x3

    new-array v0, v0, [Landroid/animation/Animator;

    const/4 v1, 0x0

    aput-object v6, v0, v1

    const/4 v1, 0x1

    aput-object v7, v0, v1

    const/4 v1, 0x2

    aput-object v8, v0, v1

    invoke-virtual {v5, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 1066
    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-eq v0, v1, :cond_0

    .line 1067
    iget-object v0, p0, Lo/cir;->D:Landroid/widget/ImageView;

    const-string v1, "alpha"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_1

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v9

    .line 1068
    const-wide/16 v0, 0x64

    invoke-virtual {v9, v0, v1}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    .line 1069
    const-wide/16 v0, 0x190

    invoke-virtual {v9, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 1070
    iget-object v0, p0, Lo/cir;->G:Landroid/widget/LinearLayout;

    const-string v1, "translationY"

    const/4 v2, 0x2

    new-array v2, v2, [F

    iget-object v3, p0, Lo/cir;->G:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v3

    int-to-float v3, v3

    const/4 v4, 0x0

    aput v3, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x1

    aput v3, v2, v4

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v10

    .line 1071
    const-wide/16 v0, 0x64

    invoke-virtual {v10, v0, v1}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    .line 1072
    const-wide/16 v0, 0x190

    invoke-virtual {v10, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 1073
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/animation/Animator;

    const/4 v1, 0x0

    aput-object v9, v0, v1

    const/4 v1, 0x1

    aput-object v10, v0, v1

    invoke-virtual {v5, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 1075
    :cond_0
    invoke-virtual {v5, p1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1076
    iget-object v0, p0, Lo/cir;->A:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1077
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    .line 1078
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method static synthetic c(Lo/cir;Landroid/animation/Animator$AnimatorListener;)V
    .locals 0

    .line 88
    invoke-direct {p0, p1}, Lo/cir;->c(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method static synthetic d(Lo/cir;)Lo/ciq;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    return-object v0
.end method

.method private d(Landroid/widget/TextView;)V
    .locals 2

    .line 1849
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$30;

    invoke-direct {v1, p0, p1}, Lo/cir$30;-><init>(Lo/cir;Landroid/widget/TextView;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1855
    return-void
.end method

.method private d(Z)V
    .locals 2

    .line 1197
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$14;

    invoke-direct {v1, p0, p1}, Lo/cir$14;-><init>(Lo/cir;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1208
    return-void
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 5

    .line 1082
    move-object v4, p0

    check-cast v4, Landroid/app/Activity;

    .line 1084
    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1085
    :cond_0
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Activity is invalid. isDestoryed-->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isFinishing-->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1086
    const/4 v0, 0x0

    return v0

    .line 1088
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic e(Lo/cir;F)F
    .locals 0

    .line 88
    iput p1, p0, Lo/cir;->R:F

    return p1
.end method

.method static synthetic e(Lo/cir;)I
    .locals 1

    .line 88
    iget v0, p0, Lo/cir;->Y:I

    return v0
.end method

.method static synthetic e(Lo/cir;Landroid/animation/Animator;)Landroid/animation/Animator;
    .locals 0

    .line 88
    iput-object p1, p0, Lo/cir;->aa:Landroid/animation/Animator;

    return-object p1
.end method

.method private e(I)V
    .locals 8

    .line 1564
    iget-object v0, p0, Lo/cir;->t:Lo/cir$e;

    if-nez v0, :cond_0

    .line 1565
    return-void

    .line 1567
    :cond_0
    new-instance v2, Lo/cgz$c;

    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    iget-object v1, p0, Lo/cir;->t:Lo/cir$e;

    invoke-direct {v2, v0, v1, p1}, Lo/cgz$c;-><init>(Landroid/content/Context;Landroid/os/Handler;I)V

    .line 1568
    const/4 v3, 0x0

    .line 1569
    iget-boolean v0, p0, Lo/cir;->a:Z

    if-nez v0, :cond_1

    .line 1570
    iget-object v0, p0, Lo/cir;->n:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Lo/cgz$c;->a(Landroid/util/SparseArray;)Lo/cgz;

    move-result-object v3

    goto :goto_0

    .line 1572
    :cond_1
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Lo/cgz$c;->a(Landroid/util/SparseArray;)Lo/cgz;

    move-result-object v3

    .line 1574
    :goto_0
    invoke-virtual {v3}, Lo/cgz;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 1575
    const/16 v0, 0x50

    invoke-virtual {v4, v0}, Landroid/view/Window;->setGravity(I)V

    .line 1576
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 1577
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/WindowManager;

    .line 1578
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v7

    .line 1579
    const/16 v0, 0xa

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 1580
    invoke-virtual {v7}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 1581
    invoke-virtual {v4, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 1582
    invoke-virtual {v4, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 1583
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$style;->track_dialog_anim:I

    invoke-virtual {v4, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 1584
    invoke-virtual {v3}, Lo/cgz;->show()V

    .line 1585
    return-void
.end method

.method private e(IIF)V
    .locals 7

    .line 392
    const-string v5, ""

    .line 393
    const/4 v0, -0x1

    if-eq p2, v0, :cond_3

    .line 394
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_1

    .line 397
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v1, p3, v1

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 398
    goto/16 :goto_1

    .line 402
    :pswitch_1
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 403
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v1, p3

    const/4 v3, 0x3

    invoke-static {v1, v2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    .line 404
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_1

    .line 407
    :cond_0
    const/4 v6, 0x2

    .line 408
    float-to-double v0, p3

    const-wide v2, 0x403518f5c28f5c29L    # 21.0975

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 409
    const/4 v6, 0x4

    goto :goto_0

    .line 411
    :cond_1
    float-to-double v0, p3

    const-wide v2, 0x404518f5c28f5c29L    # 42.195

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    .line 412
    const/4 v6, 0x3

    .line 414
    :cond_2
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v1, p3

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 416
    goto :goto_1

    .line 419
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/high16 v1, 0x42700000    # 60.0f

    div-float v1, p3, v1

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 420
    .line 425
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lo/cir;->p()Ljava/util/Map;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 427
    iput-object v5, p0, Lo/cir;->z:Ljava/lang/String;

    .line 429
    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static e(Landroid/view/View;II)V
    .locals 5

    .line 1756
    new-instance v3, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1757
    iget v0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    add-int/2addr v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, p1, v1, v0, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 1758
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v4, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 1759
    invoke-virtual {p0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1760
    return-void
.end method

.method static synthetic f(Lo/cir;)Lo/cir$e;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->t:Lo/cir$e;

    return-object v0
.end method

.method static synthetic g(Lo/cir;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Lo/cir;->C()V

    return-void
.end method

.method static synthetic h(Lo/cir;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Lo/cir;->y()V

    return-void
.end method

.method static synthetic i(Lo/cir;)Landroid/widget/ImageView;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->E:Landroid/widget/ImageView;

    return-object v0
.end method

.method private i()V
    .locals 5

    .line 262
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====enter showGPSSettingDialog()====="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/dhm;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_3

    .line 264
    :cond_0
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/dhm;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-eq v0, v1, :cond_1

    .line 265
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/dhm;->e(Landroid/content/Context;)V

    .line 267
    :cond_1
    iget-object v0, p0, Lo/cir;->af:Lo/cig;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cir;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 268
    iget-object v0, p0, Lo/cir;->af:Lo/cig;

    invoke-virtual {v0}, Lo/cig;->e()V

    .line 270
    :cond_2
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->d(Z)V

    .line 271
    return-void

    .line 273
    :cond_3
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_device_replace_dialog_title_notification:I

    .line 274
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hw_show_sport_dialog_open_gps_content:I

    .line 275
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lo/cir$29;

    invoke-direct {v2, p0}, Lo/cir$29;-><init>(Lo/cir;)V

    .line 277
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lo/cir$24;

    invoke-direct {v2, p0}, Lo/cir$24;-><init>(Lo/cir;)V

    .line 295
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v4

    .line 305
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lo/cir;->c:Lo/egv;

    .line 306
    iget-object v0, p0, Lo/cir;->c:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 307
    iget-object v0, p0, Lo/cir;->c:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 308
    return-void
.end method

.method static synthetic j(Lo/cir;)Landroid/animation/Animator;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->aa:Landroid/animation/Animator;

    return-object v0
.end method

.method private j()V
    .locals 2

    .line 1764
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$22;

    invoke-direct {v1, p0}, Lo/cir$22;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1799
    return-void
.end method

.method static synthetic k(Lo/cir;)F
    .locals 1

    .line 88
    iget v0, p0, Lo/cir;->R:F

    return v0
.end method

.method private l()V
    .locals 4

    .line 378
    iget-object v0, p0, Lo/cir;->o:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 379
    return-void

    .line 381
    :cond_0
    iget-object v0, p0, Lo/cir;->o:Landroid/os/Bundle;

    const-string v1, "map_tracking_sport_type_sportting"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/cir;->j:I

    .line 382
    iget-object v0, p0, Lo/cir;->o:Landroid/os/Bundle;

    const-string v1, "sport_target_value_sportting"

    const/high16 v2, -0x40800000    # -1.0f

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v3

    .line 383
    iget-object v0, p0, Lo/cir;->o:Landroid/os/Bundle;

    const-string v1, "sport_target_type_sportting"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/cir;->l:I

    .line 384
    iget v0, p0, Lo/cir;->l:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 385
    iget v0, p0, Lo/cir;->j:I

    iget v1, p0, Lo/cir;->l:I

    invoke-direct {p0, v0, v1, v3}, Lo/cir;->e(IIF)V

    .line 387
    :cond_1
    iget-object v0, p0, Lo/cir;->o:Landroid/os/Bundle;

    const-string v1, "indoor_Running_Info"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/cir;->W:Z

    .line 388
    return-void
.end method

.method static synthetic l(Lo/cir;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Lo/cir;->z()V

    return-void
.end method

.method private m()V
    .locals 5

    .line 629
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "huaweisport"

    const-string v2, "q3@!DF5*&$9MrhCS"

    const-string v3, "tingshu"

    new-instance v4, Lo/cir$34;

    invoke-direct {v4, p0}, Lo/cir$34;-><init>(Lo/cir;)V

    invoke-static {v0, v1, v2, v3, v4}, Lo/fkl;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/fkk;)V

    .line 677
    return-void
.end method

.method static synthetic m(Lo/cir;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Lo/cir;->B()V

    return-void
.end method

.method static synthetic n(Lo/cir;)Landroid/view/View;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    return-object v0
.end method

.method private n()V
    .locals 10

    .line 486
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    if-nez v0, :cond_0

    .line 487
    return-void

    .line 489
    :cond_0
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_perm_bg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/cir;->u:Landroid/widget/RelativeLayout;

    .line 491
    iget-object v0, p0, Lo/cir;->u:Landroid/widget/RelativeLayout;

    new-instance v1, Lo/cir$26;

    invoke-direct {v1, p0}, Lo/cir$26;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 497
    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-eq v0, v1, :cond_4

    .line 498
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 499
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    iget-object v1, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$color;->common_color_white:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 500
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->sport_track_map:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/amap/api/maps/MapView;

    iput-object v0, p0, Lo/cir;->g:Lcom/amap/api/maps/MapView;

    .line 501
    iget-object v0, p0, Lo/cir;->g:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/MapView;->getMap()Lcom/amap/api/maps/AMap;

    move-result-object v0

    if-nez v0, :cond_1

    .line 502
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception: AMap of MapView is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 503
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->finish()V

    .line 504
    return-void

    .line 506
    :cond_1
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_map_fade_in:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/cir;->x:Landroid/view/View;

    .line 507
    new-instance v0, Lo/cgy;

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/cir;->g:Lcom/amap/api/maps/MapView;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/cgy;-><init>(Landroid/content/Context;Lcom/amap/api/maps/MapView;Z)V

    iput-object v0, p0, Lo/cir;->k:Lo/chc;

    .line 508
    iget-object v0, p0, Lo/cir;->k:Lo/chc;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Lo/chc;->c(Landroid/os/Bundle;ZZ)V

    .line 509
    iget-object v0, p0, Lo/cir;->k:Lo/chc;

    invoke-interface {v0}, Lo/chc;->d()V

    goto :goto_0

    .line 511
    :cond_2
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    .line 512
    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->sport_track_map:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/android/gms/maps/SupportMapFragment;

    .line 513
    if-eqz v5, :cond_3

    .line 514
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView() mapFragment is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    invoke-virtual {v5, p0}, Lcom/google/android/gms/maps/SupportMapFragment;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    .line 518
    :cond_3
    :goto_0
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_sport_map_anim:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/cir;->D:Landroid/widget/ImageView;

    .line 519
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->fragment_sportdata:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/cir;->G:Landroid/widget/LinearLayout;

    .line 521
    :cond_4
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_map_anim_button_relative:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/cir;->A:Landroid/widget/RelativeLayout;

    .line 522
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_map_anim_button_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/cir;->E:Landroid/widget/ImageView;

    .line 523
    new-instance v0, Lo/ciq;

    iget-object v1, p0, Lo/cir;->h:Landroid/view/View;

    iget v2, p0, Lo/cir;->j:I

    iget-boolean v3, p0, Lo/cir;->W:Z

    iget-boolean v4, p0, Lo/cir;->T:Z

    invoke-direct {v0, v1, v2, v3, v4}, Lo/ciq;-><init>(Landroid/view/View;IZZ)V

    iput-object v0, p0, Lo/cir;->e:Lo/ciq;

    .line 525
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->h()Lo/cio;

    move-result-object v0

    invoke-virtual {v0}, Lo/cio;->b()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 526
    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_5

    .line 527
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->k()Lo/chx;

    move-result-object v0

    invoke-virtual {v0}, Lo/chx;->b()V

    .line 528
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->indoor_run_tips:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cir;->Q:Landroid/widget/TextView;

    .line 529
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cdl;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 530
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_free_indoor_running:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/cir;->U:Landroid/widget/ImageView;

    .line 531
    iget-object v0, p0, Lo/cir;->U:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 532
    iget-object v0, p0, Lo/cir;->Q:Landroid/widget/TextView;

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_indoor_tip_1_free_indoor_running:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 535
    :cond_5
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 536
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->m()Lo/cio;

    move-result-object v0

    invoke-virtual {v0}, Lo/cio;->d()Landroid/widget/TextView;

    move-result-object v5

    .line 537
    iget-object v0, p0, Lo/cir;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_9:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v5, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 539
    :cond_6
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 540
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->q()Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_main_page_btn_play_selector_rtl:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 542
    :cond_7
    iget-boolean v0, p0, Lo/cir;->r:Z

    if-nez v0, :cond_8

    invoke-direct {p0}, Lo/cir;->x()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 543
    :cond_8
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->g()Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 545
    :cond_9
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 546
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->c()Landroid/widget/ImageButton;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 549
    :cond_a
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->d()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setClickable(Z)V

    .line 550
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 551
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->i()Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 553
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lo/cir$35;

    invoke-direct {v1, p0}, Lo/cir$35;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 580
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$33;

    invoke-direct {v1, p0}, Lo/cir$33;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 591
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_sport_music:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lo/cir;->X:Landroid/widget/ImageButton;

    .line 592
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    .line 593
    new-instance v6, Lo/dcy;

    invoke-direct {v6}, Lo/dcy;-><init>()V

    .line 594
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    .line 595
    new-instance v8, Lo/cee;

    invoke-direct {v8, v5, v6, v7}, Lo/cee;-><init>(Landroid/content/Context;Lo/dcy;Ljava/lang/String;)V

    .line 597
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cds;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_c

    .line 598
    :cond_b
    iget-object v0, p0, Lo/cir;->X:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_2

    .line 600
    :cond_c
    iget-object v0, p0, Lo/cir;->X:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 601
    invoke-static {v5}, Lo/cee;->e(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_d

    .line 603
    const/4 v0, 0x0

    iput v0, p0, Lo/cir;->ae:I

    .line 604
    iget-object v0, p0, Lo/cir;->X:Landroid/widget/ImageButton;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_main_page_sport_music:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    goto :goto_1

    .line 607
    :cond_d
    invoke-direct {p0}, Lo/cir;->m()V

    .line 609
    :goto_1
    iget-object v0, p0, Lo/cir;->X:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 612
    :goto_2
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 613
    const-string v0, "duration"

    iget-object v1, p0, Lo/cir;->s:Lo/cbu;

    invoke-virtual {v1}, Lo/cbu;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 614
    const-string v0, "distance"

    const-string v1, "0.00"

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 615
    const-string v0, "speed"

    const-string v1, "--"

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    const-string v0, "pace"

    const-string v1, "--"

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    const-string v0, "calorie"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 618
    invoke-virtual {p0, v9}, Lo/cir;->e(Landroid/os/Bundle;)V

    .line 619
    return-void
.end method

.method static synthetic o(Lo/cir;)Landroid/widget/ImageButton;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->X:Landroid/widget/ImageButton;

    return-object v0
.end method

.method private o()V
    .locals 3

    .line 330
    iget v0, p0, Lo/cir;->l:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 332
    :pswitch_0
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->b:Lo/cik;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 333
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->d:Lo/cik;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 334
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->f:Lo/cik;

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 335
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->a:Lo/cik;

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 336
    goto/16 :goto_0

    .line 338
    :pswitch_1
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->d:Lo/cik;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 339
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->b:Lo/cik;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 340
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->f:Lo/cik;

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 341
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->a:Lo/cik;

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 342
    goto :goto_0

    .line 344
    :pswitch_2
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->b:Lo/cik;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 345
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->d:Lo/cik;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 346
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->f:Lo/cik;

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 347
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->a:Lo/cik;

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 348
    goto :goto_0

    .line 350
    :pswitch_3
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->a:Lo/cik;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 351
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->d:Lo/cik;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 352
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->b:Lo/cik;

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 353
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->f:Lo/cik;

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 354
    .line 358
    :goto_0
    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_0

    .line 359
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->e:Lo/cik;

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_1

    .line 360
    :cond_0
    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x103

    if-ne v0, v1, :cond_2

    .line 361
    iget v0, p0, Lo/cir;->l:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 362
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->c:Lo/cik;

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_1

    .line 364
    :cond_1
    iget-object v0, p0, Lo/cir;->p:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->c:Lo/cik;

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 368
    :cond_2
    :goto_1
    iget-object v0, p0, Lo/cir;->n:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->d:Lo/cik;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 369
    iget-object v0, p0, Lo/cir;->n:Landroid/util/SparseArray;

    sget-object v1, Lo/cik;->b:Lo/cik;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 372
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->m()Z

    move-result v0

    iput-boolean v0, p0, Lo/cir;->v:Z

    .line 374
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic p(Lo/cir;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->u:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private p()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation

    .line 432
    iget-object v0, p0, Lo/cir;->w:Ljava/util/Map;

    const/16 v1, 0x103

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_start_track_sport_type_cycle:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    iget-object v0, p0, Lo/cir;->w:Ljava/util/Map;

    const/16 v1, 0x102

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_run_tip:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    iget-object v0, p0, Lo/cir;->w:Ljava/util/Map;

    const/16 v1, 0x108

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_run_tip:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    iget-object v0, p0, Lo/cir;->w:Ljava/util/Map;

    const/16 v1, 0x101

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_walk_tip:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    iget-object v0, p0, Lo/cir;->w:Ljava/util/Map;

    const/16 v1, 0x106

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_swim_tip:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    iget-object v0, p0, Lo/cir;->w:Ljava/util/Map;

    const/16 v1, 0x107

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_golf_tip:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    iget-object v0, p0, Lo/cir;->w:Ljava/util/Map;

    const/16 v1, 0x104

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_climb_hill_tip:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    iget-object v0, p0, Lo/cir;->w:Ljava/util/Map;

    const/16 v1, 0x105

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_climb_stairs_tip:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    iget-object v0, p0, Lo/cir;->w:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_run_tip:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    iget-object v0, p0, Lo/cir;->w:Ljava/util/Map;

    return-object v0
.end method

.method private q()Landroid/view/animation/TranslateAnimation;
    .locals 10

    .line 969
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    const/high16 v2, -0x40800000    # -1.0f

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    move-object v9, v0

    .line 971
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 972
    const-wide/16 v0, 0xfa

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 973
    return-object v9
.end method

.method static synthetic q(Lo/cir;)Z
    .locals 1

    .line 88
    iget-boolean v0, p0, Lo/cir;->y:Z

    return v0
.end method

.method static synthetic r(Lo/cir;)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->F:Landroid/graphics/drawable/GradientDrawable;

    return-object v0
.end method

.method private r()V
    .locals 6

    .line 942
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 944
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->i()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 945
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->f()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v0

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 946
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->i()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 948
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->i()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-direct {p0}, Lo/cir;->q()Landroid/view/animation/TranslateAnimation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAnimation(Landroid/view/animation/Animation;)V

    .line 949
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->i()Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 950
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->f()Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 951
    invoke-direct {p0}, Lo/cir;->B()V

    .line 952
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->e()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 953
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 954
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    sget-object v2, Lo/dae;->hP:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 955
    return-void
.end method

.method static synthetic s(Lo/cir;)I
    .locals 1

    .line 88
    iget v0, p0, Lo/cir;->j:I

    return v0
.end method

.method private s()V
    .locals 2

    .line 860
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$2;

    invoke-direct {v1, p0}, Lo/cir$2;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 877
    return-void
.end method

.method private t()Landroid/view/animation/TranslateAnimation;
    .locals 10

    .line 977
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    move-object v9, v0

    .line 979
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 980
    const-wide/16 v0, 0xfa

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 981
    return-object v9
.end method

.method static synthetic t(Lo/cir;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->A:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic u(Lo/cir;)Landroid/widget/ImageView;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->D:Landroid/widget/ImageView;

    return-object v0
.end method

.method private u()V
    .locals 8

    .line 839
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 840
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->t()Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getLeft()I

    move-result v0

    iget-object v1, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v1}, Lo/ciq;->o()Landroid/widget/ImageButton;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getRight()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v1}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    sub-int v6, v0, v1

    goto :goto_0

    .line 842
    :cond_0
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->o()Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getLeft()I

    move-result v0

    iget-object v1, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v1}, Lo/ciq;->t()Landroid/widget/ImageButton;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getRight()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v1}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    sub-int v6, v0, v1

    .line 845
    :goto_0
    div-int/lit8 v0, v6, 0x6

    iget-object v1, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v1}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int v7, v0, v1

    .line 847
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 848
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->q()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 849
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->r()Lo/chh;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chh;->setVisibility(I)V

    .line 850
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 851
    move-object v0, p0

    rsub-int/lit8 v2, v7, 0x0

    iget-object v1, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v1}, Lo/ciq;->q()Landroid/widget/ImageView;

    move-result-object v4

    const/4 v1, 0x0

    const/16 v3, 0xc8

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cir;->c(IIILandroid/view/View;Z)V

    .line 852
    move-object v0, p0

    move v2, v7

    iget-object v1, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v1}, Lo/ciq;->r()Lo/chh;

    move-result-object v4

    const/4 v1, 0x0

    const/16 v3, 0xc8

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cir;->c(IIILandroid/view/View;Z)V

    goto :goto_1

    .line 854
    :cond_1
    move-object v0, p0

    move v2, v7

    iget-object v1, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v1}, Lo/ciq;->q()Landroid/widget/ImageView;

    move-result-object v4

    const/4 v1, 0x0

    const/16 v3, 0xc8

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cir;->c(IIILandroid/view/View;Z)V

    .line 855
    move-object v0, p0

    rsub-int/lit8 v2, v7, 0x0

    iget-object v1, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v1}, Lo/ciq;->r()Lo/chh;

    move-result-object v4

    const/4 v1, 0x0

    const/16 v3, 0xc8

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cir;->c(IIILandroid/view/View;Z)V

    .line 857
    :goto_1
    return-void
.end method

.method static synthetic v(Lo/cir;)Landroid/widget/TextView;
    .locals 1

    .line 88
    iget-object v0, p0, Lo/cir;->Q:Landroid/widget/TextView;

    return-object v0
.end method

.method private v()V
    .locals 4

    .line 1329
    iget-boolean v0, p0, Lo/cir;->V:Z

    if-nez v0, :cond_0

    .line 1330
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the sport have not started,pls wait..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1331
    return-void

    .line 1333
    :cond_0
    invoke-direct {p0}, Lo/cir;->u()V

    .line 1334
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f()V

    .line 1335
    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 1336
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$18;

    invoke-direct {v1, p0}, Lo/cir$18;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1347
    :cond_1
    return-void
.end method

.method private w()V
    .locals 3

    .line 988
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cir;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/cir;->u:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_2

    .line 990
    iget-object v0, p0, Lo/cir;->s:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/dhm;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 991
    iget-object v0, p0, Lo/cir;->u:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 992
    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-eq v0, v1, :cond_0

    .line 993
    iget-object v0, p0, Lo/cir;->D:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 995
    :cond_0
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    new-instance v1, Lo/cir$4;

    invoke-direct {v1, p0}, Lo/cir$4;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1002
    return-void

    .line 1004
    :cond_1
    new-instance v0, Lo/cig;

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    iget-object v2, p0, Lo/cir;->h:Landroid/view/View;

    invoke-direct {v0, v1, v2}, Lo/cig;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lo/cir;->af:Lo/cig;

    .line 1005
    iget-object v0, p0, Lo/cir;->af:Lo/cig;

    new-instance v1, Lo/cir$9;

    invoke-direct {v1, p0}, Lo/cir$9;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Lo/cig;->b(Lo/cig$b;)V

    .line 1045
    :cond_2
    return-void
.end method

.method static synthetic w(Lo/cir;)Z
    .locals 1

    .line 88
    iget-boolean v0, p0, Lo/cir;->v:Z

    return v0
.end method

.method private x()Z
    .locals 2

    .line 1474
    iget-object v0, p0, Lo/cir;->z:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cir;->z:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic x(Lo/cir;)Z
    .locals 1

    .line 88
    iget-boolean v0, p0, Lo/cir;->T:Z

    return v0
.end method

.method private y()V
    .locals 1

    .line 1353
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->n()V

    .line 1354
    return-void
.end method

.method static synthetic y(Lo/cir;)Z
    .locals 1

    .line 88
    iget-boolean v0, p0, Lo/cir;->W:Z

    return v0
.end method

.method private z()V
    .locals 1

    .line 1321
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->d()V

    .line 1322
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cir;->V:Z

    .line 1323
    return-void
.end method

.method static synthetic z(Lo/cir;)Z
    .locals 1

    .line 88
    iget-boolean v0, p0, Lo/cir;->r:Z

    return v0
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 798
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 800
    iget-boolean v0, p0, Lo/cir;->a:Z

    if-eqz v0, :cond_1

    .line 801
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->u()Landroid/widget/ImageButton;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_sporting_slideup_pressed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 802
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->d()Landroid/widget/FrameLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 804
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 805
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->text_hidden_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 806
    invoke-direct {p0, v5}, Lo/cir;->d(Landroid/widget/TextView;)V

    .line 809
    :cond_0
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 810
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/cir;->k:Lo/chc;

    if-eqz v0, :cond_2

    .line 811
    iget-object v0, p0, Lo/cir;->k:Lo/chc;

    check-cast v0, Lo/cgy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cgy;->b(Z)V

    goto :goto_0

    .line 815
    :cond_1
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->u()Landroid/widget/ImageButton;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_sporting_slidedown_pressed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 816
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->d()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 817
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 818
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/cir;->k:Lo/chc;

    if-eqz v0, :cond_2

    .line 819
    iget-object v0, p0, Lo/cir;->k:Lo/chc;

    check-cast v0, Lo/cgy;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cgy;->b(Z)V

    .line 823
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lo/cir;->a:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lo/cir;->a:Z

    .line 824
    iget-boolean v0, p0, Lo/cir;->a:Z

    if-eqz v0, :cond_4

    .line 825
    const-string v0, "click"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 827
    :cond_4
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 829
    :goto_2
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    sget-object v2, Lo/dae;->hN:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 831
    return-void
.end method

.method public a(I)V
    .locals 4

    .line 1111
    iput p1, p0, Lo/cir;->Y:I

    .line 1113
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1116
    :pswitch_0
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$6;

    invoke-direct {v1, p0}, Lo/cir$6;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1127
    goto :goto_1

    .line 1129
    :pswitch_1
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$7;

    invoke-direct {v1, p0}, Lo/cir$7;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1145
    goto :goto_1

    .line 1147
    :pswitch_2
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$8;

    invoke-direct {v1, p0}, Lo/cir$8;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1163
    goto :goto_1

    .line 1165
    :pswitch_3
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$12;

    invoke-direct {v1, p0}, Lo/cir$12;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1176
    goto :goto_1

    .line 1178
    :pswitch_4
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$15;

    invoke-direct {v1, p0}, Lo/cir$15;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1188
    goto :goto_1

    .line 1190
    :goto_0
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Wrong GPS signal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1193
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 1279
    return-void
.end method

.method public b()V
    .locals 5

    .line 959
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 960
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->i()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-direct {p0}, Lo/cir;->t()Landroid/view/animation/TranslateAnimation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAnimation(Landroid/view/animation/Animation;)V

    .line 961
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->i()Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 962
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->f()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-direct {p0}, Lo/cir;->q()Landroid/view/animation/TranslateAnimation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAnimation(Landroid/view/animation/Animation;)V

    .line 963
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->f()Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 964
    const-string v0, "click"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 965
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    sget-object v2, Lo/dae;->hP:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 966
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .line 1256
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$16;

    invoke-direct {v1, p0, p1}, Lo/cir$16;-><init>(Lo/cir;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1262
    return-void
.end method

.method public b(Lo/cew;)V
    .locals 3

    .line 1611
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1612
    iget-object v0, p0, Lo/cir;->k:Lo/chc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1613
    iget-object v0, p0, Lo/cir;->k:Lo/chc;

    iget-object v1, p0, Lo/cir;->t:Lo/cir$e;

    const/4 v2, 0x0

    invoke-interface {v0, v1, p1, v2}, Lo/chc;->c(Landroid/os/Handler;Lo/cew;Z)V

    goto :goto_0

    .line 1616
    :cond_0
    iget-object v0, p0, Lo/cir;->f:Lo/cha;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1617
    iget-object v0, p0, Lo/cir;->f:Lo/cha;

    iget-object v1, p0, Lo/cir;->t:Lo/cir$e;

    const/4 v2, 0x0

    invoke-interface {v0, v1, p1, v2}, Lo/cha;->b(Landroid/os/Handler;Lo/cew;Z)V

    goto :goto_0

    .line 1620
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cir;->B:Z

    .line 1621
    iput-object p1, p0, Lo/cir;->C:Lo/cew;

    .line 1624
    :cond_2
    :goto_0
    return-void
.end method

.method public c()Lo/ciw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/ciw<Lo/cir;>;"
        }
    .end annotation

    .line 478
    new-instance v0, Lo/ciw;

    invoke-direct {v0, p0}, Lo/ciw;-><init>(Ljava/lang/Object;)V

    .line 479
    return-object v0
.end method

.method public c(I)V
    .locals 2

    .line 313
    const/16 v0, 0x3e8

    if-ne p1, v0, :cond_2

    .line 314
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/dhm;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 315
    iget-object v0, p0, Lo/cir;->af:Lo/cig;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cir;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Lo/cir;->af:Lo/cig;

    invoke-virtual {v0}, Lo/cig;->e()V

    .line 318
    :cond_0
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->d(Z)V

    goto :goto_0

    .line 320
    :cond_1
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->d(Z)V

    .line 321
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->n()V

    .line 325
    :cond_2
    :goto_0
    return-void
.end method

.method public c(IIILandroid/view/View;Z)V
    .locals 7

    .line 886
    new-instance v6, Landroid/view/animation/TranslateAnimation;

    int-to-float v0, p1

    int-to-float v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v6, v0, v1, v2, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 887
    new-instance v0, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v0}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    invoke-virtual {v6, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 888
    int-to-long v0, p3

    invoke-virtual {v6, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 889
    const-wide/16 v0, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/view/animation/TranslateAnimation;->setStartOffset(J)V

    .line 890
    new-instance v0, Landroid/view/animation/OvershootInterpolator;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    invoke-virtual {v6, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 891
    new-instance v0, Lo/cir$5;

    move-object v1, p0

    move v2, p5

    move-object v3, p4

    move v4, p2

    move v5, p1

    invoke-direct/range {v0 .. v5}, Lo/cir$5;-><init>(Lo/cir;ZLandroid/view/View;II)V

    invoke-virtual {v6, v0}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 937
    invoke-virtual {p4, v6}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 938
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 1266
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$20;

    invoke-direct {v1, p0, p1}, Lo/cir$20;-><init>(Lo/cir;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1274
    return-void
.end method

.method public c(Z)V
    .locals 5

    .line 1588
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setScreenOnOrForegrand() : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1589
    iget-object v0, p0, Lo/cir;->k:Lo/chc;

    if-eqz v0, :cond_1

    .line 1590
    iget-object v0, p0, Lo/cir;->k:Lo/chc;

    invoke-interface {v0, p1}, Lo/chc;->d(Z)V

    .line 1591
    if-eqz p1, :cond_0

    .line 1592
    iget-object v0, p0, Lo/cir;->x:Landroid/view/View;

    const-string v1, "alpha"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 1593
    const-wide/16 v0, 0x1f4

    invoke-virtual {v4, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 1594
    invoke-virtual {v4}, Landroid/animation/ObjectAnimator;->start()V

    .line 1595
    iget-object v0, p0, Lo/cir;->g:Lcom/amap/api/maps/MapView;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/MapView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1596
    iget-object v0, p0, Lo/cir;->g:Lcom/amap/api/maps/MapView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/MapView;->setVisibility(I)V

    .line 1597
    iget-object v0, p0, Lo/cir;->g:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/MapView;->invalidate()V

    .line 1598
    goto :goto_0

    .line 1599
    :cond_0
    iget-object v0, p0, Lo/cir;->g:Lcom/amap/api/maps/MapView;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/MapView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1600
    iget-object v0, p0, Lo/cir;->g:Lcom/amap/api/maps/MapView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/MapView;->setVisibility(I)V

    .line 1601
    iget-object v0, p0, Lo/cir;->g:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/MapView;->invalidate()V

    .line 1602
    iget-object v0, p0, Lo/cir;->x:Landroid/view/View;

    const v1, 0x3ecccccd    # 0.4f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    .line 1604
    :cond_1
    iget-object v0, p0, Lo/cir;->f:Lo/cha;

    if-eqz v0, :cond_2

    .line 1605
    iget-object v0, p0, Lo/cir;->f:Lo/cha;

    invoke-interface {v0, p1}, Lo/cha;->a(Z)V

    .line 1607
    :cond_2
    :goto_0
    return-void

    :array_0
    .array-data 4
        0x3ecccccd    # 0.4f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public d()V
    .locals 2

    .line 446
    iget-object v0, p0, Lo/cir;->h:Landroid/view/View;

    if-nez v0, :cond_0

    .line 447
    return-void

    .line 449
    :cond_0
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    iget-boolean v1, p0, Lo/cir;->b:Z

    invoke-virtual {v0, p0, v1}, Lo/ciq;->e(Landroid/view/View$OnClickListener;Z)V

    .line 450
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->r()Lo/chh;

    move-result-object v0

    new-instance v1, Lo/cir$28;

    invoke-direct {v1, p0}, Lo/cir$28;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Lo/chh;->a(Lo/chh$e;)V

    .line 469
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->S()Z

    move-result v0

    iput-boolean v0, p0, Lo/cir;->d:Z

    .line 470
    iget-boolean v0, p0, Lo/cir;->d:Z

    invoke-direct {p0, v0}, Lo/cir;->b(Z)V

    .line 472
    iget-object v0, p0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0, p0}, Lo/ciq;->d(Lo/chx$b;)V

    .line 473
    return-void
.end method

.method public d(I)V
    .locals 4

    .line 1728
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1731
    :pswitch_0
    invoke-direct {p0}, Lo/cir;->j()V

    .line 1732
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->f()V

    .line 1733
    goto :goto_1

    .line 1736
    :pswitch_1
    invoke-direct {p0}, Lo/cir;->D()V

    .line 1737
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c()V

    .line 1738
    goto :goto_1

    .line 1740
    :pswitch_2
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->n()V

    .line 1741
    goto :goto_1

    .line 1743
    :goto_0
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Wrong command"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1746
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 1243
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$19;

    invoke-direct {v1, p0, p1}, Lo/cir$19;-><init>(Lo/cir;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1251
    return-void
.end method

.method public e()Lo/chc;
    .locals 1

    .line 1094
    iget-object v0, p0, Lo/cir;->k:Lo/chc;

    return-object v0
.end method

.method public e(F)V
    .locals 5

    .line 1288
    float-to-int v0, p1

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 1289
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$17;

    invoke-direct {v1, p0, v4}, Lo/cir$17;-><init>(Lo/cir;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1295
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 16

    .line 1391
    if-nez p1, :cond_0

    .line 1392
    return-void

    .line 1398
    :cond_0
    const-string v0, "heartRate"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1399
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/cir;->a:Z

    if-eqz v0, :cond_1

    if-eqz v8, :cond_1

    .line 1400
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1401
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cir;->p:Landroid/util/SparseArray;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lo/cik;->e:Lo/cik;

    if-eq v0, v1, :cond_1

    move-object/from16 v0, p0

    iget v0, v0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-eq v0, v1, :cond_1

    .line 1402
    move-object/from16 v0, p0

    const/4 v1, 0x4

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/cir;->b(II)V

    .line 1407
    :cond_1
    const-string v0, "extroInfo"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1408
    if-eqz v9, :cond_2

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    move-object v10, v9

    goto :goto_0

    :cond_2
    const-string v10, ""

    .line 1410
    :goto_0
    const-string v0, "planProgress"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 1412
    const/4 v12, 0x0

    .line 1413
    const/4 v13, 0x0

    .line 1415
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cir;->p:Landroid/util/SparseArray;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v2, v0}, Lo/cir;->a(Landroid/os/Bundle;Landroid/util/SparseArray;)Landroid/util/SparseArray;

    move-result-object v12

    .line 1416
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cir;->e:Lo/ciq;

    invoke-virtual {v0}, Lo/ciq;->b()Landroid/util/SparseArray;

    move-result-object v13

    .line 1417
    move-object v14, v12

    .line 1418
    move-object v15, v13

    .line 1419
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$23;

    move-object/from16 v2, p0

    move-object v3, v14

    move-object v4, v15

    move-object/from16 v5, p1

    move-object v6, v10

    move-object v7, v11

    invoke-direct/range {v1 .. v7}, Lo/cir$23;-><init>(Lo/cir;Landroid/util/SparseArray;Landroid/util/SparseArray;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1471
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 1231
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$13;

    invoke-direct {v1, p0, p1}, Lo/cir$13;-><init>(Lo/cir;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1238
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 1858
    iput-boolean p1, p0, Lo/cir;->y:Z

    .line 1859
    return-void
.end method

.method public f()Lo/cha;
    .locals 1

    .line 1098
    iget-object v0, p0, Lo/cir;->f:Lo/cha;

    return-object v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 1300
    return-void
.end method

.method public g()Z
    .locals 1

    .line 1884
    iget-boolean v0, p0, Lo/cir;->a:Z

    return v0
.end method

.method public h()V
    .locals 2

    .line 1360
    invoke-direct {p0}, Lo/cir;->s()V

    .line 1361
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->c()V

    .line 1362
    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 1363
    iget-object v0, p0, Lo/cir;->m:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Lo/cir$25;

    invoke-direct {v1, p0}, Lo/cir$25;-><init>(Lo/cir;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1373
    :cond_0
    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 1305
    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    .line 1310
    return-void
.end method

.method public k()V
    .locals 4

    .line 1904
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroyViewHolder"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1905
    iget-object v0, p0, Lo/cir;->s:Lo/cbu;

    if-eqz v0, :cond_0

    .line 1906
    iget-object v0, p0, Lo/cir;->s:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->av()V

    .line 1908
    :cond_0
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 1284
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 686
    iget-boolean v0, p0, Lo/cir;->Z:Z

    if-eqz v0, :cond_0

    .line 687
    return-void

    .line 689
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 694
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_leftdata:I

    if-ne v4, v0, :cond_1

    .line 696
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/cir;->e(I)V

    .line 698
    :cond_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_rightdata:I

    if-ne v4, v0, :cond_2

    .line 700
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/cir;->e(I)V

    .line 702
    :cond_2
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_middata:I

    if-ne v4, v0, :cond_3

    .line 704
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/cir;->e(I)V

    .line 708
    :cond_3
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_time_hidden_left:I

    if-ne v4, v0, :cond_4

    .line 710
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lo/cir;->e(I)V

    .line 712
    :cond_4
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_time_hidden_right:I

    if-ne v4, v0, :cond_5

    .line 714
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lo/cir;->e(I)V

    .line 718
    :cond_5
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_btn_updown:I

    if-eq v4, v0, :cond_6

    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_updown:I

    if-ne v4, v0, :cond_7

    .line 719
    :cond_6
    invoke-virtual {p0}, Lo/cir;->a()V

    goto/16 :goto_5

    .line 720
    :cond_7
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_btn_pause:I

    if-ne v4, v0, :cond_8

    .line 721
    invoke-direct {p0}, Lo/cir;->v()V

    goto/16 :goto_5

    .line 722
    :cond_8
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_btn_play:I

    if-ne v4, v0, :cond_9

    .line 723
    invoke-virtual {p0}, Lo/cir;->h()V

    goto/16 :goto_5

    .line 724
    :cond_9
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_btn_lock:I

    if-ne v4, v0, :cond_a

    .line 725
    invoke-direct {p0}, Lo/cir;->r()V

    goto/16 :goto_5

    .line 727
    :cond_a
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_btn_setting:I

    if-ne v4, v0, :cond_c

    .line 728
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 729
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->S()Z

    move-result v0

    iput-boolean v0, p0, Lo/cir;->d:Z

    .line 730
    iget-boolean v0, p0, Lo/cir;->d:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lo/cir;->d:Z

    .line 731
    iget-boolean v0, p0, Lo/cir;->d:Z

    invoke-direct {p0, v0}, Lo/cir;->b(Z)V

    .line 732
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    iget-boolean v1, p0, Lo/cir;->d:Z

    invoke-virtual {v0, v1}, Lo/cbu;->b(Z)V

    .line 733
    iget-boolean v0, p0, Lo/cir;->d:Z

    if-eqz v0, :cond_b

    .line 734
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 736
    :cond_b
    const-string v0, "click"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 738
    :goto_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    sget-object v2, Lo/dae;->hM:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 739
    goto/16 :goto_5

    .line 740
    :cond_c
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_sport_music:I

    if-ne v4, v0, :cond_10

    .line 741
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click music or listen book button"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 742
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 744
    iget v0, p0, Lo/cir;->ae:I

    if-nez v0, :cond_e

    .line 745
    iget v0, p0, Lo/cir;->j:I

    const/16 v1, 0x103

    if-ne v0, v1, :cond_d

    .line 746
    new-instance v6, Landroid/content/Intent;

    const-string v0, "android.intent.action.MUSIC_PLAYER"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 747
    const/high16 v0, 0x10000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 748
    const-string v0, "com.android.mediacenter"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    .line 751
    :cond_d
    const-string v7, "hwmediacenter://com.android.mediacenter/showrunplaylist?pver=80002300&portal=qq&from=com.huawei.health&needback=1"

    .line 752
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    .line 753
    new-instance v6, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v6, v0, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 754
    const/high16 v0, 0x14000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 755
    const-string v0, "tag"

    const-string v1, "com.huawei.health"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 760
    :goto_1
    :try_start_0
    iget-object v0, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 767
    goto :goto_2

    .line 761
    :catch_0
    move-exception v7

    .line 762
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "music running list activity  not found, check "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 767
    goto :goto_2

    .line 763
    :catch_1
    move-exception v7

    .line 764
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SE "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 767
    goto :goto_2

    .line 765
    :catch_2
    move-exception v7

    .line 766
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 768
    :goto_2
    const-string v0, "sportMusicType"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 773
    :cond_e
    new-instance v0, Lo/cir$3;

    invoke-direct {v0, p0}, Lo/cir$3;-><init>(Lo/cir;)V

    invoke-static {v0}, Lo/fkl;->d(Lo/fkk;)V

    .line 785
    const-string v0, "sportMusicType"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    :goto_3
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 788
    const-string v0, "pageType"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 789
    const-string v0, "musicType"

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-static {v1}, Lo/cds;->e(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_f

    const/4 v1, 0x1

    goto :goto_4

    :cond_f
    const/4 v1, 0x0

    :goto_4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 790
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    sget-object v2, Lo/dae;->hz:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 792
    :cond_10
    :goto_5
    return-void
.end method

.method public onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 4

    .line 1834
    const-string v0, "Track_TrackMainViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onMapReady() isGaodeMap = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cds;->a()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1835
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1836
    new-instance v0, Lo/chb;

    iget-object v1, p0, Lo/cir;->i:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lo/chb;-><init>(Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMap;)V

    iput-object v0, p0, Lo/cir;->f:Lo/cha;

    .line 1837
    iget-object v0, p0, Lo/cir;->f:Lo/cha;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Lo/cha;->e(Landroid/os/Bundle;ZZ)V

    .line 1838
    const/4 v0, 0x0

    invoke-static {v0}, Lo/chb;->c(Z)V

    .line 1839
    iget-object v0, p0, Lo/cir;->s:Lo/cbu;

    iget-object v1, p0, Lo/cir;->f:Lo/cha;

    invoke-virtual {v0, v1}, Lo/cbu;->e(Lo/cha;)V

    .line 1840
    iget-boolean v0, p0, Lo/cir;->B:Z

    if-eqz v0, :cond_0

    .line 1841
    iget-object v0, p0, Lo/cir;->f:Lo/cha;

    iget-object v1, p0, Lo/cir;->t:Lo/cir$e;

    iget-object v2, p0, Lo/cir;->C:Lo/cew;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/cha;->b(Landroid/os/Handler;Lo/cew;Z)V

    .line 1842
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cir;->B:Z

    .line 1843
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir;->C:Lo/cew;

    .line 1846
    :cond_0
    return-void
.end method
