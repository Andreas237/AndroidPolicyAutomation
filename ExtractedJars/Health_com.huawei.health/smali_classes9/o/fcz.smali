.class public Lo/fcz;
.super Lo/fcu;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/widget/ImageView;

.field private C:Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

.field private D:Lo/fem;

.field private E:J

.field private F:J

.field private G:I

.field private H:Z

.field private I:I

.field private J:Lo/fdu;

.field private K:Landroid/widget/ImageView;

.field private L:Landroid/widget/LinearLayout;

.field private M:Landroid/widget/ImageView;

.field private N:Landroid/widget/LinearLayout;

.field private P:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private S:Landroid/os/Handler;

.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fda;>;"
        }
    .end annotation
.end field

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fda;>;"
        }
    .end annotation
.end field

.field c:Z

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fda;>;"
        }
    .end annotation
.end field

.field private f:I

.field g:Lo/fct;

.field private h:Lo/fdj;

.field private i:Landroid/widget/LinearLayout;

.field private j:Landroid/widget/LinearLayout;

.field public k:Z

.field private l:Landroid/view/View;

.field private m:Lo/acn;

.field private n:Landroid/view/View;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field private p:Landroid/widget/LinearLayout;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field private r:Lo/acu;

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;"
        }
    .end annotation
.end field

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field private u:Landroid/widget/LinearLayout;

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field private w:Landroid/widget/ImageView;

.field private x:I

.field private y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private z:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;)V
    .locals 3

    .line 148
    invoke-direct {p0, p1, p2}, Lo/fcu;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    .line 91
    const/4 v0, 0x0

    iput v0, p0, Lo/fcz;->f:I

    .line 98
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcz;->t:Ljava/util/List;

    .line 102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcz;->q:Ljava/util/List;

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcz;->y:Ljava/util/ArrayList;

    .line 110
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcz;->v:Ljava/util/List;

    .line 111
    const/4 v0, 0x0

    iput v0, p0, Lo/fcz;->x:I

    .line 117
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcz;->d:Ljava/util/List;

    .line 118
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcz;->a:Ljava/util/List;

    .line 119
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcz;->b:Ljava/util/List;

    .line 124
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fcz;->k:Z

    .line 191
    new-instance v0, Lo/fcz$5;

    invoke-direct {v0, p0}, Lo/fcz$5;-><init>(Lo/fcz;)V

    iput-object v0, p0, Lo/fcz;->S:Landroid/os/Handler;

    .line 391
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcz;->P:Ljava/util/ArrayList;

    .line 149
    invoke-static {}, Lo/fdj;->e()Lo/fdj;

    move-result-object v0

    iput-object v0, p0, Lo/fcz;->h:Lo/fdj;

    .line 150
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 151
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "type"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/fcz;->f:I

    .line 153
    :cond_0
    return-void
.end method

.method private A()V
    .locals 5

    .line 876
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 877
    iget-object v0, p0, Lo/fcz;->m:Lo/acn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 878
    const-string v0, "weightBean_key"

    iget-object v1, p0, Lo/fcz;->m:Lo/acn;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 879
    const-string v0, "start_time"

    iget-wide v1, p0, Lo/fcz;->E:J

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 880
    const-string v0, "start_type"

    iget v1, p0, Lo/fcz;->I:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 881
    const-string v0, "is_show_change"

    iget-boolean v1, p0, Lo/fcz;->H:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 882
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 884
    :cond_0
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoBodyTypeDetail  lastBean is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 885
    return-void

    .line 887
    :goto_0
    return-void
.end method

.method private B()Z
    .locals 10

    .line 895
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fcz;->H:Z

    .line 896
    const/4 v0, 0x0

    iput v0, p0, Lo/fcz;->I:I

    .line 897
    const/4 v0, 0x0

    iput v0, p0, Lo/fcz;->G:I

    .line 899
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 900
    iget-object v0, p0, Lo/fcz;->v:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    iget-object v0, p0, Lo/fcz;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 901
    const/4 v9, 0x0

    :goto_0
    iget-object v0, p0, Lo/fcz;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_1

    .line 902
    iget-object v0, p0, Lo/fcz;->v:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-static {v0}, Lo/fej;->c(Lo/acn;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 903
    iget-object v0, p0, Lo/fcz;->v:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 901
    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 907
    :cond_1
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShowBadyTypeCard  bodyTypeList  size == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 908
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_2

    .line 909
    iget-boolean v0, p0, Lo/fcz;->H:Z

    return v0

    .line 911
    :cond_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acn;

    .line 912
    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v0

    iget-object v2, p0, Lo/fcz;->m:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/fee;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 913
    iget-boolean v0, p0, Lo/fcz;->H:Z

    return v0

    .line 916
    :cond_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v9, v0, -0x1

    :goto_1
    if-ltz v9, :cond_5

    .line 917
    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v0

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/fee;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_4

    .line 918
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    iget-object v2, p0, Lo/fcz;->m:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    invoke-virtual {v7}, Lo/acn;->q()I

    move-result v0

    if-lez v0, :cond_5

    .line 919
    invoke-virtual {v7}, Lo/acn;->t()B

    move-result v0

    invoke-virtual {v7}, Lo/acn;->b()D

    move-result-wide v1

    invoke-virtual {v7}, Lo/acn;->g()D

    move-result-wide v3

    invoke-virtual {v7}, Lo/acn;->u()I

    move-result v5

    invoke-virtual {v7}, Lo/acn;->q()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lo/acm;->d(BDDII)I

    move-result v0

    iput v0, p0, Lo/fcz;->I:I

    .line 920
    iget-object v0, p0, Lo/fcz;->m:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->t()B

    move-result v0

    iget-object v1, p0, Lo/fcz;->m:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->b()D

    move-result-wide v1

    iget-object v3, p0, Lo/fcz;->m:Lo/acn;

    invoke-virtual {v3}, Lo/acn;->g()D

    move-result-wide v3

    iget-object v5, p0, Lo/fcz;->m:Lo/acn;

    invoke-virtual {v5}, Lo/acn;->u()I

    move-result v5

    iget-object v6, p0, Lo/fcz;->m:Lo/acn;

    invoke-virtual {v6}, Lo/acn;->q()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lo/acm;->d(BDDII)I

    move-result v0

    iput v0, p0, Lo/fcz;->G:I

    .line 921
    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v0

    iput-wide v0, p0, Lo/fcz;->E:J

    .line 922
    iget-object v0, p0, Lo/fcz;->m:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    iput-wide v0, p0, Lo/fcz;->F:J

    goto :goto_2

    .line 916
    :cond_4
    add-int/lit8 v9, v9, -0x1

    goto/16 :goto_1

    .line 928
    :cond_5
    :goto_2
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShowBadyTypeCard, mStartType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fcz;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mEndType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fcz;->G:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mStartTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/fcz;->E:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mEndTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/fcz;->F:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 929
    iget v0, p0, Lo/fcz;->I:I

    iget v1, p0, Lo/fcz;->G:I

    if-ne v0, v1, :cond_6

    .line 930
    iget-boolean v0, p0, Lo/fcz;->H:Z

    return v0

    .line 932
    :cond_6
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fcz;->H:Z

    const/4 v0, 0x1

    return v0

    .line 936
    :cond_7
    iget-boolean v0, p0, Lo/fcz;->H:Z

    return v0
.end method

.method static synthetic a(Lo/fcz;)Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;
    .locals 1

    .line 89
    iget-object v0, p0, Lo/fcz;->C:Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    return-object v0
.end method

.method private a(J)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 370
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy/M/d"

    invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 371
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 372
    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/util/Date;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 416
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy/M/d HH:mm:ss"

    invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 417
    const/4 v2, 0x0

    .line 418
    invoke-virtual {v1, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    .line 419
    return-object v2
.end method

.method private a(II)V
    .locals 2

    .line 457
    if-lez p1, :cond_0

    .line 458
    iget-object v0, p0, Lo/fcz;->L:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 459
    iget-object v0, p0, Lo/fcz;->M:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 461
    :cond_0
    iget-object v0, p0, Lo/fcz;->M:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 462
    iget-object v0, p0, Lo/fcz;->L:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 465
    :goto_0
    if-lt p1, p2, :cond_1

    .line 466
    iget-object v0, p0, Lo/fcz;->K:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 467
    iget-object v0, p0, Lo/fcz;->N:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 469
    :cond_1
    iget-object v0, p0, Lo/fcz;->K:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 470
    iget-object v0, p0, Lo/fcz;->N:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 472
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/fcz;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lo/fcz;->s()V

    return-void
.end method

.method static synthetic c(Lo/fcz;)Ljava/util/List;
    .locals 1

    .line 89
    iget-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    return-object v0
.end method

.method private c(Landroid/content/Context;)V
    .locals 1

    .line 671
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 672
    new-instance v0, Lo/fcz$3;

    invoke-direct {v0, p0}, Lo/fcz$3;-><init>(Lo/fcz;)V

    invoke-static {p1, v0}, Lo/fhv;->e(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 682
    :cond_0
    return-void
.end method

.method private c(Lcom/huawei/ui/openservice/db/model/ChildService;)V
    .locals 3

    .line 709
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 710
    const-string v0, "url"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 711
    const-string v0, "title"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 712
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 713
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 714
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "OpenService"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 715
    const-string v0, "type"

    const-string v1, "OPEN_SERVICE_TYPE"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 716
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 717
    sget-object v0, Lo/dae;->cP:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fcz;->e(Ljava/lang/String;)V

    .line 718
    return-void
.end method

.method static synthetic d(Lo/fcz;)Landroid/os/Handler;
    .locals 1

    .line 89
    iget-object v0, p0, Lo/fcz;->S:Landroid/os/Handler;

    return-object v0
.end method

.method private d(Landroid/content/Intent;)V
    .locals 6

    .line 643
    const-string v0, "com.huawei.health"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 644
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 645
    const-string v0, "kind"

    const-string v1, "HDK_WEIGHT"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 646
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClickMenu  2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 647
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    const-string v1, "HDK_WEIGHT"

    invoke-static {v0, v1}, Lo/feb;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    .line 648
    if-lez v4, :cond_1

    .line 650
    const/4 v0, 0x1

    if-ne v0, v4, :cond_0

    invoke-static {}, Lo/ahu;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-static {v0}, Lo/cfu;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 651
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-static {v0}, Lo/ajw;->e(Landroid/content/Context;)V

    .line 652
    return-void

    .line 654
    :cond_0
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClickMenu measure bi"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 655
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 656
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fcz;->e:Landroid/app/Activity;

    sget-object v2, Lo/dae;->cG:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 659
    const-string v0, "view"

    const-string v1, "MeasureDevice"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 660
    const-string v0, "type"

    iget v1, p0, Lo/fcz;->f:I

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 661
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 662
    goto :goto_0

    .line 664
    :cond_1
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClickMenu  no bind device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 665
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-static {v0, p1}, Lo/fdr;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 667
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .line 722
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 723
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 724
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fcz;->e:Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 725
    return-void
.end method

.method static synthetic e(Lo/fcz;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lo/fcz;->m()V

    return-void
.end method

.method public static i()Z
    .locals 6

    .line 731
    const/4 v3, 0x1

    .line 732
    const/4 v4, 0x0

    .line 741
    invoke-static {}, Lo/ahd;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 742
    const/4 v4, 0x1

    .line 745
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_wifi_only_weightandBMI"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 747
    const-string v0, "all"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 748
    const/4 v3, 0x0

    .line 750
    :cond_1
    if-eqz v3, :cond_2

    if-eqz v4, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private l()V
    .locals 3

    .line 361
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lo/fcz;->e:Landroid/app/Activity;

    new-instance v2, Lo/fcz$4;

    invoke-direct {v2, p0}, Lo/fcz$4;-><init>(Lo/fcz;)V

    invoke-virtual {v0, v1, v2}, Lo/dgu;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 367
    return-void
.end method

.method private m()V
    .locals 6

    .line 328
    iget-object v0, p0, Lo/fcz;->r:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v4

    .line 329
    sget-object v0, Lo/acs;->c:Lo/acs;

    const/4 v1, 0x1

    invoke-virtual {v0, v4, v1}, Lo/acs;->e(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fcz;->t:Ljava/util/List;

    .line 331
    :try_start_0
    invoke-direct {p0}, Lo/fcz;->r()V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 334
    goto :goto_0

    .line 332
    :catch_0
    move-exception v5

    .line 333
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCurrentDaytimetime()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    :goto_0
    iget-object v0, p0, Lo/fcz;->q:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fcz;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 336
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateHistoryData  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fcz;->q:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    invoke-direct {p0}, Lo/fcz;->o()V

    goto :goto_1

    .line 341
    :cond_0
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loading fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    iget-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 343
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fcz;->m:Lo/acn;

    .line 344
    invoke-virtual {p0}, Lo/fcz;->d()V

    .line 345
    iget-object v0, p0, Lo/fcz;->J:Lo/fdu;

    const/4 v1, -0x3

    invoke-interface {v0, v1}, Lo/fdu;->b(I)V

    .line 347
    :goto_1
    return-void
.end method

.method private n()V
    .locals 6

    .line 228
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/ui/main/R$layout;->base_health_before_one_weight:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fcz;->n:Landroid/view/View;

    .line 230
    iget-object v0, p0, Lo/fcz;->n:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_body_index_layout_all:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fcz;->i:Landroid/widget/LinearLayout;

    .line 231
    iget-object v0, p0, Lo/fcz;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 232
    iget-object v0, p0, Lo/fcz;->n:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_body_score_layout:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fcz;->p:Landroid/widget/LinearLayout;

    .line 237
    iget-object v0, p0, Lo/fcz;->n:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_before_bodyindex_recycle:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lo/fcz;->z:Landroid/support/v7/widget/RecyclerView;

    .line 239
    iget-object v0, p0, Lo/fcz;->n:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_before_expand_layout:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fcz;->j:Landroid/widget/LinearLayout;

    .line 240
    iget-object v0, p0, Lo/fcz;->n:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_before_expand_tv:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fcz;->A:Landroid/widget/TextView;

    .line 241
    iget-object v0, p0, Lo/fcz;->n:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_before_expand_img:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fcz;->B:Landroid/widget/ImageView;

    .line 243
    iget-object v0, p0, Lo/fcz;->n:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_body_type_card_layout:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fem;

    iput-object v0, p0, Lo/fcz;->D:Lo/fem;

    .line 244
    iget-object v0, p0, Lo/fcz;->D:Lo/fem;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/fem;->setVisibility(I)V

    .line 249
    iget-object v0, p0, Lo/fcz;->n:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_tips:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fcz;->l:Landroid/view/View;

    .line 252
    iget-object v0, p0, Lo/fcz;->l:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 254
    iget-object v0, p0, Lo/fcz;->h:Lo/fdj;

    invoke-virtual {v0}, Lo/fdj;->c()V

    .line 256
    iget-object v0, p0, Lo/fcz;->n:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_server_layout:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fcz;->u:Landroid/widget/LinearLayout;

    .line 257
    iget-object v0, p0, Lo/fcz;->n:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_server_imageview:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fcz;->w:Landroid/widget/ImageView;

    .line 258
    iget-object v0, p0, Lo/fcz;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 259
    invoke-direct {p0}, Lo/fcz;->y()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fcz;->s:Ljava/util/List;

    .line 260
    iget-object v0, p0, Lo/fcz;->s:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fcz;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 261
    :cond_0
    iget-object v0, p0, Lo/fcz;->u:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 266
    :cond_1
    iget-object v0, p0, Lo/fcz;->s:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/openservice/db/model/ChildService;

    .line 267
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/ChildService;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 268
    if-eqz v5, :cond_2

    .line 269
    iget-object v0, p0, Lo/fcz;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 272
    :cond_2
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "icon is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    :goto_0
    return-void
.end method

.method private o()V
    .locals 5

    .line 349
    iget-object v0, p0, Lo/fcz;->r:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v4

    .line 351
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 352
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadUserGoalWeight equal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    invoke-direct {p0}, Lo/fcz;->l()V

    goto :goto_0

    .line 355
    :cond_0
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadUserGoalWeight no equal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    invoke-direct {p0}, Lo/fcz;->s()V

    .line 358
    :goto_0
    return-void
.end method

.method private q()V
    .locals 11

    .line 424
    iget-object v0, p0, Lo/fcz;->P:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lo/fcz;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_4

    .line 425
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "newTimeList "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fcz;->P:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    iget v0, p0, Lo/fcz;->x:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/fcz;->x:I

    iget-object v1, p0, Lo/fcz;->P:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_1

    .line 427
    :cond_0
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mChangeDataCount param exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    return-void

    .line 430
    :cond_1
    iget-object v0, p0, Lo/fcz;->P:Ljava/util/ArrayList;

    iget v1, p0, Lo/fcz;->x:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 431
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " 00:00:00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 432
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcz;->v:Ljava/util/List;

    .line 434
    :try_start_0
    invoke-direct {p0, v6}, Lo/fcz;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    .line 435
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/fee;->e(Ljava/lang/Long;)I

    move-result v9

    .line 436
    const/4 v10, 0x0

    :goto_0
    iget-object v0, p0, Lo/fcz;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_3

    .line 437
    add-int/lit8 v0, v9, -0x1

    int-to-long v0, v0

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v0, v7, v0

    iget-object v2, p0, Lo/fcz;->q:Ljava/util/List;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    iget-object v0, p0, Lo/fcz;->q:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    add-long/2addr v2, v7

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 438
    iget-object v0, p0, Lo/fcz;->v:Ljava/util/List;

    iget-object v1, p0, Lo/fcz;->q:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 436
    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 442
    :cond_3
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCurrentDaytime "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-direct {p0, v6}, Lo/fcz;->a(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 446
    goto :goto_1

    .line 444
    :catch_0
    move-exception v7

    .line 445
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCurrentDaytime "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    :cond_4
    :goto_1
    return-void
.end method

.method private r()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 377
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 378
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcz;->q:Ljava/util/List;

    .line 379
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 380
    iget-object v0, p0, Lo/fcz;->t:Ljava/util/List;

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 381
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 382
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 383
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 384
    iget-object v0, p0, Lo/fcz;->q:Ljava/util/List;

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 381
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 389
    :cond_1
    invoke-direct {p0}, Lo/fcz;->t()V

    .line 390
    return-void
.end method

.method private s()V
    .locals 8

    .line 475
    invoke-direct {p0}, Lo/fcz;->q()V

    .line 476
    iget v0, p0, Lo/fcz;->x:I

    iget-object v1, p0, Lo/fcz;->P:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p0, v0, v1}, Lo/fcz;->a(II)V

    .line 477
    invoke-direct {p0}, Lo/fcz;->v()V

    .line 478
    invoke-virtual {p0}, Lo/fcz;->e()V

    .line 480
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshBottomListView  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fcz;->o:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshBottomListView  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fcz;->o:Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/acn;

    invoke-virtual {v3}, Lo/acn;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    invoke-static {}, Lo/ene;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 483
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-direct {p0, v0}, Lo/fcz;->c(Landroid/content/Context;)V

    .line 487
    :cond_0
    iget-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acn;

    .line 488
    iget-object v0, p0, Lo/fcz;->i:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/fcz;->p:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fcz;->n:Landroid/view/View;

    invoke-static {v0, v1, v2, v7}, Lo/fdr;->d(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lo/acn;)Lo/acn;

    move-result-object v0

    iput-object v0, p0, Lo/fcz;->m:Lo/acn;

    .line 490
    invoke-direct {p0}, Lo/fcz;->x()V

    .line 491
    new-instance v0, Lo/fct;

    iget-object v1, p0, Lo/fcz;->e:Landroid/app/Activity;

    iget-object v2, p0, Lo/fcz;->a:Ljava/util/List;

    iget-object v3, p0, Lo/fcz;->m:Lo/acn;

    invoke-direct {v0, v1, v2, v3}, Lo/fct;-><init>(Landroid/content/Context;Ljava/util/List;Lo/acn;)V

    iput-object v0, p0, Lo/fcz;->g:Lo/fct;

    .line 492
    iget-object v0, p0, Lo/fcz;->z:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/GridLayoutManager;

    iget-object v2, p0, Lo/fcz;->e:Landroid/app/Activity;

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 493
    iget-object v0, p0, Lo/fcz;->z:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setFocusableInTouchMode(Z)V

    .line 494
    iget-object v0, p0, Lo/fcz;->z:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->requestFocus()Z

    .line 495
    iget-object v0, p0, Lo/fcz;->z:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lo/fcz;->g:Lo/fct;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 496
    invoke-static {}, Lo/fcz;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lo/fcz;->c:Z

    if-eqz v0, :cond_1

    .line 497
    iget-object v0, p0, Lo/fcz;->g:Lo/fct;

    iget-object v1, p0, Lo/fcz;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/fct;->e(Ljava/util/List;)V

    .line 498
    iget-object v0, p0, Lo/fcz;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 500
    :cond_1
    iget-object v0, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_2

    .line 501
    iget-object v0, p0, Lo/fcz;->j:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 503
    :cond_2
    iget-object v0, p0, Lo/fcz;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 505
    :goto_0
    invoke-virtual {p0}, Lo/fcz;->g()V

    .line 508
    :goto_1
    iget-object v0, p0, Lo/fcz;->J:Lo/fdu;

    const/4 v1, -0x3

    invoke-interface {v0, v1}, Lo/fdu;->b(I)V

    .line 509
    invoke-direct {p0}, Lo/fcz;->u()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 510
    invoke-direct {p0}, Lo/fcz;->z()V

    .line 513
    :cond_3
    invoke-direct {p0}, Lo/fcz;->B()Z

    .line 514
    iget-boolean v0, p0, Lo/fcz;->H:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/fcz;->m:Lo/acn;

    invoke-static {v0}, Lo/fej;->c(Lo/acn;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_4

    .line 515
    iget-object v0, p0, Lo/fcz;->D:Lo/fem;

    iget v1, p0, Lo/fcz;->I:I

    iget v2, p0, Lo/fcz;->G:I

    iget-wide v3, p0, Lo/fcz;->E:J

    iget-wide v5, p0, Lo/fcz;->F:J

    invoke-virtual/range {v0 .. v6}, Lo/fem;->setBodyTypeDatas(IIJJ)V

    .line 516
    iget-object v0, p0, Lo/fcz;->D:Lo/fem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fem;->setVisibility(I)V

    goto :goto_2

    .line 518
    :cond_4
    iget-object v0, p0, Lo/fcz;->D:Lo/fem;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/fem;->setVisibility(I)V

    .line 520
    :goto_2
    return-void
.end method

.method private t()V
    .locals 7

    .line 394
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcz;->y:Ljava/util/ArrayList;

    .line 395
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/fcz;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 396
    iget-object v0, p0, Lo/fcz;->q:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/acn;

    .line 398
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 399
    :try_start_0
    iget-object v0, p0, Lo/fcz;->y:Ljava/util/ArrayList;

    invoke-virtual {v4}, Lo/acn;->p()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Lo/fcz;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 403
    :cond_0
    goto :goto_1

    .line 401
    :catch_0
    move-exception v6

    .line 402
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "LongToDate(healthData.getWeighTime() == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 406
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcz;->P:Ljava/util/ArrayList;

    .line 407
    iget-object v0, p0, Lo/fcz;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 408
    iget-object v0, p0, Lo/fcz;->P:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 409
    iget-object v0, p0, Lo/fcz;->P:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 411
    :cond_2
    goto :goto_2

    .line 412
    :cond_3
    invoke-direct {p0}, Lo/fcz;->q()V

    .line 413
    return-void
.end method

.method private u()Z
    .locals 4

    .line 523
    const/4 v1, 0x0

    .line 524
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v2

    .line 525
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v3

    .line 526
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 527
    const/4 v1, 0x1

    .line 529
    :cond_0
    return v1
.end method

.method private v()V
    .locals 7

    .line 688
    iget-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 689
    iget-object v0, p0, Lo/fcz;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    .line 690
    const/4 v5, 0x0

    .line 691
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshBottomListViewlen  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 692
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_0

    .line 693
    iget-object v0, p0, Lo/fcz;->v:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/acn;

    .line 694
    iget-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 692
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 699
    :cond_0
    return-void
.end method

.method private w()V
    .locals 4

    .line 830
    iget-boolean v0, p0, Lo/fcz;->k:Z

    if-eqz v0, :cond_1

    .line 831
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initRecycleItemSize  collapseList  size ==  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fcz;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 832
    iget-object v0, p0, Lo/fcz;->g:Lo/fct;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 833
    iget-object v0, p0, Lo/fcz;->g:Lo/fct;

    iget-object v1, p0, Lo/fcz;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/fct;->e(Ljava/util/List;)V

    .line 835
    :cond_0
    iget-object v0, p0, Lo/fcz;->A:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_health_expand:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 836
    iget-object v0, p0, Lo/fcz;->B:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_expend_more:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 837
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fcz;->k:Z

    .line 838
    sget-object v0, Lo/dae;->cL:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-static {v0, v1}, Lo/fej;->b(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_0

    .line 840
    :cond_1
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initRecycleItemSize  expandList  size ==  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 841
    iget-object v0, p0, Lo/fcz;->g:Lo/fct;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 842
    iget-object v0, p0, Lo/fcz;->g:Lo/fct;

    iget-object v1, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/fct;->e(Ljava/util/List;)V

    .line 844
    :cond_2
    iget-object v0, p0, Lo/fcz;->A:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_health_retract:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 845
    iget-object v0, p0, Lo/fcz;->B:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_retract:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 846
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fcz;->k:Z

    .line 847
    sget-object v0, Lo/dae;->cI:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-static {v0, v1}, Lo/fej;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 849
    :goto_0
    return-void
.end method

.method private x()V
    .locals 6

    .line 789
    iget-object v0, p0, Lo/fcz;->m:Lo/acn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget-object v0, p0, Lo/fcz;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 790
    iget-object v0, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 791
    iget-object v0, p0, Lo/fcz;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 792
    iget-object v0, p0, Lo/fcz;->d:Ljava/util/List;

    iget-object v1, p0, Lo/fcz;->m:Lo/acn;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lo/fdv;->a(Lo/acn;Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 794
    iget-object v0, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 795
    const/4 v4, -0x1

    .line 796
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 797
    iget-object v0, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    .line 798
    move v4, v5

    .line 800
    :cond_0
    iget-object v0, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    const/16 v1, 0xb

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lo/fcz;->d:Ljava/util/List;

    .line 801
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_2

    .line 802
    :cond_1
    iget-object v0, p0, Lo/fcz;->b:Ljava/util/List;

    iget-object v1, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 796
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 806
    :cond_3
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    if-eq v4, v0, :cond_4

    .line 807
    iget-object v0, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 810
    :cond_4
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initRecycleItemSize  size ==  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 811
    iget-object v0, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_5

    .line 812
    iget-object v0, p0, Lo/fcz;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 813
    iget-object v0, p0, Lo/fcz;->a:Ljava/util/List;

    iget-object v1, p0, Lo/fcz;->d:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 814
    iget-object v0, p0, Lo/fcz;->a:Ljava/util/List;

    iget-object v1, p0, Lo/fcz;->d:Ljava/util/List;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 815
    iget-object v0, p0, Lo/fcz;->a:Ljava/util/List;

    iget-object v1, p0, Lo/fcz;->d:Ljava/util/List;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 817
    :cond_5
    iget-object v0, p0, Lo/fcz;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 818
    iget-object v0, p0, Lo/fcz;->a:Ljava/util/List;

    iget-object v1, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 821
    :cond_6
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initRecycleItemSize  latestBean is null.. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 824
    :goto_1
    return-void
.end method

.method private y()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;"
        }
    .end annotation

    .line 704
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v1

    .line 705
    const-string v0, "WEIGHT"

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceByLocation(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private z()V
    .locals 4

    .line 542
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-static {v0}, Lo/dlf;->d(Landroid/content/Context;)Lo/dlf;

    move-result-object v0

    iget-object v1, p0, Lo/fcz;->o:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/acn;

    invoke-virtual {v1}, Lo/acn;->d()D

    move-result-wide v1

    new-instance v3, Lo/fcz$2;

    invoke-direct {v3, p0}, Lo/fcz$2;-><init>(Lo/fcz;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/dlf;->a(DLo/egg;)V

    .line 551
    return-void
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    .line 222
    invoke-direct {p0}, Lo/fcz;->n()V

    .line 223
    iget-object v0, p0, Lo/fcz;->n:Landroid/view/View;

    return-object v0
.end method

.method public a(I)V
    .locals 2

    .line 184
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 185
    iget v0, p0, Lo/fcz;->x:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fcz;->x:I

    goto :goto_0

    .line 187
    :cond_0
    iget v0, p0, Lo/fcz;->x:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fcz;->x:I

    .line 189
    :goto_0
    invoke-direct {p0}, Lo/fcz;->s()V

    .line 190
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 5

    .line 619
    move-object v4, p1

    :try_start_0
    check-cast v4, Lo/acn;

    .line 620
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    iget-object v1, p0, Lo/fcz;->r:Lo/acu;

    invoke-static {v0, v4, v1}, Lo/fej;->d(Landroid/content/Context;Lo/acn;Lo/acu;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 623
    goto :goto_0

    .line 621
    :catch_0
    move-exception v4

    .line 622
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onItemClick"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    :goto_0
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Object;>;"
        }
    .end annotation

    .line 556
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 557
    iget-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_1

    .line 558
    const/4 v5, 0x1

    :goto_0
    iget-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 559
    iget-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    iget-object v2, p0, Lo/fcz;->o:Ljava/util/List;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 560
    iget-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 558
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 564
    :cond_1
    return-object v4
.end method

.method public c()V
    .locals 1

    .line 278
    iget-object v0, p0, Lo/fcz;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 279
    iget-object v0, p0, Lo/fcz;->D:Lo/fem;

    invoke-virtual {v0, p0}, Lo/fem;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 281
    return-void
.end method

.method public c(I)V
    .locals 9

    .line 575
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 576
    const-wide v4, 0x4050400000000000L    # 65.0

    const-wide/high16 v6, 0x4034000000000000L    # 20.0

    .line 577
    iget-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 578
    iget-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/acn;

    .line 579
    invoke-virtual {v8}, Lo/acn;->d()D

    move-result-wide v4

    .line 580
    invoke-virtual {v8}, Lo/acn;->b()D

    move-result-wide v6

    .line 582
    :cond_0
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-static {v0, v4, v5, v6, v7}, Lo/fej;->b(Landroid/content/Context;DD)V

    .line 584
    goto/16 :goto_1

    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 585
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 586
    invoke-static {}, Lo/ene;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 587
    invoke-direct {p0, v4}, Lo/fcz;->d(Landroid/content/Intent;)V

    .line 589
    :cond_2
    goto/16 :goto_1

    :cond_3
    const/4 v0, 0x3

    if-ne p1, v0, :cond_5

    .line 590
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v4

    .line 591
    invoke-virtual {v4}, Lo/acu;->h()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_4

    const/high16 v5, 0x42700000    # 60.0f

    goto :goto_0

    :cond_4
    invoke-virtual {v4}, Lo/acu;->h()F

    move-result v5

    .line 592
    :goto_0
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-static {v0, v5}, Lo/fej;->b(Landroid/app/Activity;F)V

    .line 593
    goto/16 :goto_1

    :cond_5
    const/4 v0, 0x4

    if-ne p1, v0, :cond_6

    .line 594
    iget-object v0, p0, Lo/fcz;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 595
    iget-object v0, p0, Lo/fcz;->m:Lo/acn;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lo/fcz;->r:Lo/acu;

    if-eqz v0, :cond_8

    .line 596
    new-instance v0, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;-><init>()V

    iput-object v0, p0, Lo/fcz;->C:Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    .line 597
    iget-object v0, p0, Lo/fcz;->C:Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    iget-object v1, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a(Landroid/app/Activity;)V

    .line 598
    iget-object v0, p0, Lo/fcz;->C:Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    iget-object v1, p0, Lo/fcz;->m:Lo/acn;

    iget-object v2, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->a(Lo/acn;Landroid/content/Context;)V

    .line 600
    iget-object v0, p0, Lo/fcz;->S:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 601
    const/16 v0, 0x3e8

    iput v0, v4, Landroid/os/Message;->what:I

    .line 602
    iget-object v0, p0, Lo/fcz;->S:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 603
    sget-object v0, Lo/dae;->cK:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-static {v0, v1}, Lo/fej;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 604
    goto :goto_1

    .line 606
    :cond_6
    const/4 v0, 0x5

    if-ne p1, v0, :cond_8

    .line 607
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v4

    .line 608
    const/4 v0, 0x0

    if-eq v0, v4, :cond_7

    .line 609
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-virtual {v4}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/feh;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 611
    :cond_7
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 614
    :cond_8
    :goto_1
    return-void
.end method

.method public c(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 0

    .line 451
    iput-object p1, p0, Lo/fcz;->N:Landroid/widget/LinearLayout;

    .line 452
    iput-object p2, p0, Lo/fcz;->L:Landroid/widget/LinearLayout;

    .line 453
    iput-object p3, p0, Lo/fcz;->K:Landroid/widget/ImageView;

    .line 454
    iput-object p4, p0, Lo/fcz;->M:Landroid/widget/ImageView;

    .line 455
    return-void
.end method

.method public c(Ljava/util/Date;)V
    .locals 6

    .line 157
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/fcz;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 159
    :try_start_0
    iget-object v0, p0, Lo/fcz;->P:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Lo/fcz;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    iput v4, p0, Lo/fcz;->x:I
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    goto :goto_2

    .line 165
    :cond_0
    goto :goto_1

    .line 163
    :catch_0
    move-exception v5

    .line 164
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ParseException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 168
    :cond_1
    :goto_2
    iget-object v0, p0, Lo/fcz;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 169
    invoke-direct {p0}, Lo/fcz;->s()V

    .line 172
    :cond_2
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 181
    iput p1, p0, Lo/fcz;->x:I

    .line 182
    return-void
.end method

.method public e(Ljava/util/Date;)V
    .locals 8

    .line 296
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    iput-object v0, p0, Lo/fcz;->r:Lo/acu;

    .line 297
    const/4 v0, 0x0

    iput v0, p0, Lo/fcz;->x:I

    .line 298
    iget-object v0, p0, Lo/fcz;->S:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 299
    const/4 v0, 0x1

    iput v0, v2, Landroid/os/Message;->what:I

    .line 300
    iget-object v0, p0, Lo/fcz;->S:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 302
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fcz;->c:Z

    .line 303
    iget-object v0, p0, Lo/fcz;->r:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 304
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "0"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 305
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 306
    const/4 v0, 0x4

    const/4 v1, 0x6

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 307
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v3, v1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 308
    new-instance v7, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-direct {v7}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;-><init>()V

    .line 310
    add-int/lit8 v0, v4, 0x12

    invoke-virtual {v7, v0, v5, v6}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(III)Z

    move-result v0

    if-nez v0, :cond_0

    add-int/lit8 v0, v4, 0x42

    invoke-virtual {v7, v0, v5, v6}, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d(III)Z

    move-result v0

    if-nez v0, :cond_1

    .line 311
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fcz;->c:Z

    .line 324
    :cond_1
    return-void
.end method

.method public e(Lo/fdu;)V
    .locals 1

    .line 175
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 176
    iput-object p1, p0, Lo/fcz;->J:Lo/fdu;

    .line 178
    :cond_0
    return-void
.end method

.method public f()Z
    .locals 4

    .line 533
    iget-object v0, p0, Lo/fcz;->m:Lo/acn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/fcz;->m:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fcz;->m:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fcz;->m:Lo/acn;

    invoke-static {v0}, Lo/fej;->c(Lo/acn;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 534
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 536
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public g()V
    .locals 4

    .line 758
    invoke-static {}, Lo/fcz;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/fcz;->c:Z

    if-eqz v0, :cond_0

    .line 759
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " age is older than 65 or less than 18 .."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 761
    :cond_0
    iget-object v0, p0, Lo/fcz;->j:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 762
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 763
    iget-object v0, p0, Lo/fcz;->j:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 764
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fcz;->k:Z

    .line 766
    :cond_1
    iget-boolean v0, p0, Lo/fcz;->k:Z

    if-eqz v0, :cond_3

    .line 767
    iget-object v0, p0, Lo/fcz;->g:Lo/fct;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 768
    iget-object v0, p0, Lo/fcz;->g:Lo/fct;

    iget-object v1, p0, Lo/fcz;->d:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/fct;->e(Ljava/util/List;)V

    .line 770
    :cond_2
    iget-object v0, p0, Lo/fcz;->A:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_health_retract:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 771
    iget-object v0, p0, Lo/fcz;->B:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_retract:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 773
    :cond_3
    iget-object v0, p0, Lo/fcz;->g:Lo/fct;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 774
    iget-object v0, p0, Lo/fcz;->g:Lo/fct;

    iget-object v1, p0, Lo/fcz;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/fct;->e(Ljava/util/List;)V

    .line 776
    :cond_4
    iget-object v0, p0, Lo/fcz;->A:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_health_expand:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 777
    iget-object v0, p0, Lo/fcz;->B:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_expend_more:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 784
    :cond_5
    :goto_0
    return-void
.end method

.method public h()Lo/fcv;
    .locals 2

    .line 569
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    iget-object v1, p0, Lo/fcz;->o:Ljava/util/List;

    invoke-static {v0, v1}, Lo/fej;->a(Landroid/content/Context;Ljava/util/List;)Lo/fcv;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/acn;>;"
        }
    .end annotation

    .line 628
    iget-object v0, p0, Lo/fcz;->t:Ljava/util/List;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 285
    iget-object v0, p0, Lo/fcz;->w:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_0

    .line 286
    iget-object v0, p0, Lo/fcz;->s:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/db/model/ChildService;

    invoke-direct {p0, v0}, Lo/fcz;->c(Lcom/huawei/ui/openservice/db/model/ChildService;)V

    goto :goto_0

    .line 287
    :cond_0
    iget-object v0, p0, Lo/fcz;->j:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_1

    .line 288
    invoke-direct {p0}, Lo/fcz;->w()V

    goto :goto_0

    .line 289
    :cond_1
    iget-object v0, p0, Lo/fcz;->D:Lo/fem;

    if-ne p1, v0, :cond_2

    .line 290
    invoke-direct {p0}, Lo/fcz;->A()V

    .line 292
    :cond_2
    :goto_0
    return-void
.end method

.method public p()V
    .locals 5

    .line 852
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHeadWeightLayout  --- onClick... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 853
    iget-object v0, p0, Lo/fcz;->m:Lo/acn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 854
    iget-object v0, p0, Lo/fcz;->m:Lo/acn;

    iget-object v1, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-static {v0, v1}, Lo/fej;->a(Lo/acn;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 855
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weight fat is exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 856
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    iget-object v1, p0, Lo/fcz;->m:Lo/acn;

    iget-object v2, p0, Lo/fcz;->r:Lo/acu;

    invoke-static {v0, v1, v2}, Lo/fej;->d(Landroid/content/Context;Lo/acn;Lo/acu;)V

    goto :goto_1

    .line 858
    :cond_0
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailsActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 859
    const-string v0, "weight_details_type_key"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 860
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/fcz;->m:Lo/acn;

    invoke-static {v0}, Lo/fej;->c(Lo/acn;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 861
    const-string v0, "weight_details_weight_bean_key"

    iget-object v1, p0, Lo/fcz;->m:Lo/acn;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 862
    const-string v0, "weight_details_time"

    iget-object v1, p0, Lo/fcz;->m:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 863
    iget-object v0, p0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 865
    :cond_1
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null or checkWeightDataValidation return false  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 866
    return-void

    .line 868
    :goto_0
    goto :goto_1

    .line 870
    :cond_2
    const-string v0, "WeightBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoWeightDetails  lastBean is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 873
    :goto_1
    return-void
.end method
