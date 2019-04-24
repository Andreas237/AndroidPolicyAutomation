.class public Lo/bxu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bxu$d;
    }
.end annotation


# static fields
.field private static b:I

.field private static c:Z

.field private static d:I


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:Z

.field private J:I

.field private K:I

.field private L:I

.field private M:I

.field private N:I

.field private O:Ljava/lang/String;

.field private P:Ljava/lang/String;

.field private Q:I

.field private R:I

.field private S:I

.field private T:Ljava/util/Calendar;

.field private U:Lcom/huawei/health/suggestion/model/PlanWorkout;

.field private V:Lo/bxt;

.field private W:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field

.field private X:[Ljava/lang/String;

.field private a:Landroid/content/Context;

.field private aa:Lo/bxv;

.field e:Landroid/support/v7/widget/RecyclerView$Adapter;

.field private f:Lo/efy;

.field private g:Lo/efy;

.field private h:Lo/efy;

.field private i:Lo/efy;

.field private j:Z

.field private k:Lo/efy;

.field private l:Landroid/view/View;

.field private m:Lo/byr;

.field private n:Landroid/widget/Button;

.field private o:Landroid/widget/ImageView;

.field private p:Landroid/view/View;

.field private q:Landroid/view/View;

.field private r:Landroid/widget/LinearLayout;

.field private s:Lo/efy;

.field private t:Lo/efy;

.field private u:Landroid/widget/LinearLayout;

.field private v:Landroid/widget/LinearLayout;

.field private w:Lo/byp;

.field private x:Lo/byt;

.field private y:Landroid/widget/LinearLayout;

.field private z:Landroid/widget/ListView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 67
    const/4 v0, -0x1

    sput v0, Lo/bxu;->d:I

    .line 68
    const/4 v0, -0x1

    sput v0, Lo/bxu;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/widget/ListView;)V
    .locals 1

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 915
    new-instance v0, Lo/bxu$5;

    invoke-direct {v0, p0}, Lo/bxu$5;-><init>(Lo/bxu;)V

    iput-object v0, p0, Lo/bxu;->e:Landroid/support/v7/widget/RecyclerView$Adapter;

    .line 143
    iput-object p1, p0, Lo/bxu;->a:Landroid/content/Context;

    .line 144
    invoke-direct {p0, p1, p2}, Lo/bxu;->b(Landroid/content/Context;Landroid/widget/ListView;)V

    .line 145
    invoke-direct {p0, p1}, Lo/bxu;->d(Landroid/content/Context;)V

    .line 146
    invoke-direct {p0}, Lo/bxu;->p()V

    .line 147
    invoke-direct {p0}, Lo/bxu;->o()V

    .line 148
    return-void
.end method

.method private A()Ljava/lang/String;
    .locals 4

    .line 836
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 837
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    iget-object v1, p0, Lo/bxu;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_timeformart_mmmd:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 838
    iget-object v0, p0, Lo/bxu;->T:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private B()I
    .locals 1

    .line 881
    iget v0, p0, Lo/bxu;->Q:I

    if-nez v0, :cond_1

    .line 882
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 883
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_mile:I

    return v0

    .line 885
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_km:I

    return v0

    .line 887
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    return v0
.end method

.method private C()Ljava/lang/String;
    .locals 6

    .line 847
    iget-boolean v0, p0, Lo/bxu;->j:Z

    if-eqz v0, :cond_0

    .line 849
    const-string v0, ""

    return-object v0

    .line 853
    :cond_0
    iget-object v0, p0, Lo/bxu;->W:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bxu;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 855
    :cond_1
    iget-object v0, p0, Lo/bxu;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_show_plan_no_record:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 858
    :cond_2
    iget-object v0, p0, Lo/bxu;->W:Ljava/util/List;

    invoke-static {v0}, Lo/bya;->b(Ljava/util/List;)Lo/bxx;

    move-result-object v5

    .line 859
    iget v0, p0, Lo/bxu;->Q:I

    if-nez v0, :cond_3

    .line 860
    invoke-virtual {v5}, Lo/bxx;->e()F

    move-result v0

    float-to-double v0, v0

    invoke-direct {p0, v0, v1}, Lo/bxu;->a(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bzr;->a(D)Ljava/lang/String;

    move-result-object v4

    .line 861
    invoke-direct {p0}, Lo/bxu;->B()I

    move-result v0

    invoke-virtual {v5}, Lo/bxx;->e()F

    move-result v1

    float-to-int v1, v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 863
    :cond_3
    invoke-virtual {v5}, Lo/bxx;->b()F

    move-result v0

    invoke-static {v0}, Lo/bzr;->a(F)Ljava/lang/String;

    move-result-object v4

    .line 864
    iget-object v0, p0, Lo/bxu;->a:Landroid/content/Context;

    invoke-direct {p0}, Lo/bxu;->B()I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(D)D
    .locals 2

    .line 869
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 870
    const/4 v0, 0x3

    invoke-static {p1, p2, v0}, Lo/cxh;->a(DI)D

    move-result-wide v0

    return-wide v0

    .line 872
    :cond_0
    return-wide p1
.end method

.method static synthetic a(Lo/bxu;)I
    .locals 1

    .line 62
    iget v0, p0, Lo/bxu;->N:I

    return v0
.end method

.method private a(Ljava/util/List;I)Lcom/huawei/health/suggestion/model/PlanWorkout;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;I)Lcom/huawei/health/suggestion/model/PlanWorkout;"
        }
    .end annotation

    .line 903
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 904
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->getSinglesCount()I

    move-result v0

    if-ne v0, p2, :cond_0

    .line 905
    return-object v5

    .line 907
    :cond_0
    goto :goto_0

    .line 908
    :cond_1
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can not find planWorkout with workoutOrder: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", workoutDate: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bxu;->aa:Lo/bxv;

    invoke-virtual {v2}, Lo/bxv;->e()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 909
    const/4 v0, 0x0

    return-object v0
.end method

.method private a(Lcom/huawei/health/suggestion/model/ExerciseProfile;II)Ljava/lang/String;
    .locals 7

    .line 810
    if-nez p1, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v5

    .line 811
    :goto_0
    if-eqz v5, :cond_2

    .line 812
    const/16 v0, 0x3c

    if-ge v5, v0, :cond_1

    .line 813
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    int-to-double v1, v5

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p2, v5, v0}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 815
    :cond_1
    div-int/lit8 v6, v5, 0x3c

    .line 816
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    int-to-double v1, v6

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p3, v6, v0}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 819
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a()V
    .locals 1

    .line 128
    const/4 v0, 0x0

    sput-boolean v0, Lo/bxu;->c:Z

    .line 129
    const/4 v0, -0x1

    sput v0, Lo/bxu;->d:I

    .line 130
    const/4 v0, -0x1

    sput v0, Lo/bxu;->b:I

    .line 132
    return-void
.end method

.method private a(I)V
    .locals 4

    .line 256
    iget-object v0, p0, Lo/bxu;->i:Lo/efy;

    invoke-virtual {v0}, Lo/efy;->getTop()I

    move-result v0

    iget-object v1, p0, Lo/bxu;->h:Lo/efy;

    invoke-virtual {v1}, Lo/efy;->getTop()I

    move-result v1

    sub-int v3, v0, v1

    .line 257
    iget-object v0, p0, Lo/bxu;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 258
    iget-object v0, p0, Lo/bxu;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-float v1, v3

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 259
    iget-object v0, p0, Lo/bxu;->r:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-float v1, v3

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 260
    iget-object v0, p0, Lo/bxu;->q:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-float v1, v3

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 261
    iget-object v0, p0, Lo/bxu;->f:Lo/efy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 262
    iget-object v0, p0, Lo/bxu;->f:Lo/efy;

    iget-object v1, p0, Lo/bxu;->f:Lo/efy;

    invoke-virtual {v1}, Lo/efy;->getLineCount()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/efy;->setLines(I)V

    .line 263
    iget-object v0, p0, Lo/bxu;->f:Lo/efy;

    invoke-virtual {v0}, Lo/efy;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 264
    iget-object v0, p0, Lo/bxu;->x:Lo/byt;

    invoke-virtual {v0}, Lo/byt;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 265
    iget-object v0, p0, Lo/bxu;->n:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 266
    iget-object v0, p0, Lo/bxu;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 267
    iget-object v0, p0, Lo/bxu;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 269
    :cond_0
    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lo/byr;->d(J)V

    .line 271
    iget v0, p0, Lo/bxu;->S:I

    sput v0, Lo/bxu;->b:I

    .line 272
    return-void
.end method

.method private a(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 3

    .line 347
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    .line 348
    if-eqz v0, :cond_0

    .line 349
    invoke-interface {v0}, Lo/brr;->e()Lo/brv;

    move-result-object v1

    .line 350
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireTrajectoryId()Ljava/lang/String;

    move-result-object v2

    .line 351
    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    .line 352
    invoke-interface {v1, v2}, Lo/brv;->a(Ljava/lang/String;)V

    .line 355
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/bxu;)Lo/byr;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    return-object v0
.end method

.method private b(Landroid/content/Context;Landroid/widget/ListView;)V
    .locals 2

    .line 371
    iput-object p2, p0, Lo/bxu;->z:Landroid/widget/ListView;

    .line 372
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lo/bxu;->T:Ljava/util/Calendar;

    .line 373
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$array;->sug_week_abb:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bxu;->X:[Ljava/lang/String;

    .line 374
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->black:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/bxu;->J:I

    .line 375
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->common_black_50alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/bxu;->L:I

    .line 376
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->common_black_20alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lo/bxu;->K:I

    .line 377
    const/high16 v0, 0x42600000    # 56.0f

    invoke-static {p1, v0}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/bxu;->R:I

    .line 378
    return-void
.end method

.method private b(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 3

    .line 363
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/bxu;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 364
    const-string v0, "workout_record"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 365
    const-string v0, "workoutdate"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 366
    const-string v0, "dayworkoutname"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 367
    iget-object v0, p0, Lo/bxu;->a:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 368
    return-void
.end method

.method private b(Ljava/util/List;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bxv;>;I)V"
        }
    .end annotation

    .line 653
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bxv;

    invoke-virtual {v0}, Lo/bxv;->a()I

    move-result v3

    .line 654
    add-int/lit8 v0, p2, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bxv;

    invoke-virtual {v0}, Lo/bxv;->a()I

    move-result v4

    .line 656
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 657
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 658
    move v7, v3

    :goto_0
    if-gt v7, v4, :cond_0

    .line 659
    iget-object v0, p0, Lo/bxu;->T:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->clear()V

    .line 660
    iget-object v0, p0, Lo/bxu;->T:Ljava/util/Calendar;

    const/4 v1, 0x7

    invoke-virtual {v0, v1, v7}, Ljava/util/Calendar;->add(II)V

    .line 661
    iget-object v0, p0, Lo/bxu;->X:[Ljava/lang/String;

    iget-object v1, p0, Lo/bxu;->T:Ljava/util/Calendar;

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 662
    invoke-direct {p0}, Lo/bxu;->A()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 658
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 665
    :cond_0
    iget-object v0, p0, Lo/bxu;->q:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 666
    iget-object v0, p0, Lo/bxu;->r:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 667
    iget-object v0, p0, Lo/bxu;->s:Lo/efy;

    add-int/lit8 v1, p2, -0x1

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 668
    iget-object v0, p0, Lo/bxu;->t:Lo/efy;

    add-int/lit8 v1, p2, -0x1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 669
    return-void
.end method

.method private b(I)Z
    .locals 6

    .line 460
    iget v0, p0, Lo/bxu;->S:I

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 462
    :goto_0
    const/4 v2, 0x0

    .line 463
    iget-object v0, p0, Lo/bxu;->V:Lo/bxt;

    invoke-virtual {v0}, Lo/bxt;->e()Ljava/util/List;

    move-result-object v3

    .line 464
    if-eqz v3, :cond_2

    .line 465
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/bxv;

    .line 466
    invoke-virtual {v5}, Lo/bxv;->a()I

    move-result v0

    if-ne v0, p1, :cond_1

    .line 467
    const/4 v2, 0x1

    .line 469
    :cond_1
    goto :goto_1

    .line 472
    :cond_2
    if-nez v1, :cond_3

    if-eqz v2, :cond_4

    :cond_3
    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    return v0
.end method

.method static synthetic c(Lo/bxu;Ljava/util/List;I)Lcom/huawei/health/suggestion/model/PlanWorkout;
    .locals 1

    .line 62
    invoke-direct {p0, p1, p2}, Lo/bxu;->a(Ljava/util/List;I)Lcom/huawei/health/suggestion/model/PlanWorkout;

    move-result-object v0

    return-object v0
.end method

.method private c(I)Lcom/huawei/health/suggestion/model/WorkoutRecord;
    .locals 3

    .line 892
    iget-object v0, p0, Lo/bxu;->W:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 893
    iget-object v0, p0, Lo/bxu;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 894
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutOrder()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 895
    return-object v2

    .line 897
    :cond_0
    goto :goto_0

    .line 899
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic c(Lo/bxu;)Lo/bxv;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/bxu;->aa:Lo/bxv;

    return-object v0
.end method

.method private c()V
    .locals 0

    .line 180
    invoke-direct {p0}, Lo/bxu;->f()V

    .line 181
    invoke-direct {p0}, Lo/bxu;->i()V

    .line 182
    return-void
.end method

.method private c(Lo/bxt;I)V
    .locals 3

    .line 434
    iput-object p1, p0, Lo/bxu;->V:Lo/bxt;

    .line 436
    iget-object v0, p0, Lo/bxu;->V:Lo/bxt;

    invoke-virtual {v0}, Lo/bxt;->c()Lo/bxv;

    move-result-object v0

    iput-object v0, p0, Lo/bxu;->aa:Lo/bxv;

    .line 437
    iget-object v0, p0, Lo/bxu;->aa:Lo/bxv;

    invoke-virtual {v0}, Lo/bxv;->a()I

    move-result v0

    iput v0, p0, Lo/bxu;->S:I

    .line 438
    iget-object v0, p0, Lo/bxu;->V:Lo/bxt;

    invoke-virtual {v0}, Lo/bxt;->c()Lo/bxv;

    move-result-object v0

    invoke-virtual {v0}, Lo/bxv;->d()I

    move-result v0

    iput v0, p0, Lo/bxu;->F:I

    .line 440
    iget-object v0, p0, Lo/bxu;->T:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->clear()V

    .line 441
    iget-object v0, p0, Lo/bxu;->T:Ljava/util/Calendar;

    iget v1, p0, Lo/bxu;->S:I

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->add(II)V

    .line 443
    invoke-direct {p0, p2}, Lo/bxu;->e(I)Z

    move-result v0

    iput-boolean v0, p0, Lo/bxu;->C:Z

    .line 444
    invoke-direct {p0, p2}, Lo/bxu;->b(I)Z

    move-result v0

    iput-boolean v0, p0, Lo/bxu;->A:Z

    .line 445
    iget-object v0, p0, Lo/bxu;->aa:Lo/bxv;

    invoke-virtual {v0}, Lo/bxv;->b()Z

    move-result v0

    iput-boolean v0, p0, Lo/bxu;->j:Z

    .line 446
    iget-object v0, p0, Lo/bxu;->aa:Lo/bxv;

    invoke-virtual {v0}, Lo/bxv;->c()Z

    move-result v0

    iput-boolean v0, p0, Lo/bxu;->B:Z

    .line 447
    iget-boolean v0, p0, Lo/bxu;->j:Z

    invoke-direct {p0, v0}, Lo/bxu;->e(Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/bxu;->I:Z

    .line 449
    iget-object v0, p0, Lo/bxu;->V:Lo/bxt;

    invoke-virtual {v0}, Lo/bxt;->b()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bxu;->P:Ljava/lang/String;

    .line 450
    iget-object v0, p0, Lo/bxu;->V:Lo/bxt;

    invoke-virtual {v0}, Lo/bxt;->b()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    iput v0, p0, Lo/bxu;->Q:I

    .line 451
    iget-object v0, p0, Lo/bxu;->aa:Lo/bxv;

    invoke-virtual {v0}, Lo/bxv;->k()Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lo/bxu;->F:I

    invoke-direct {p0, v0, v1}, Lo/bxu;->a(Ljava/util/List;I)Lcom/huawei/health/suggestion/model/PlanWorkout;

    move-result-object v0

    iput-object v0, p0, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 452
    iget-object v0, p0, Lo/bxu;->V:Lo/bxt;

    invoke-virtual {v0}, Lo/bxt;->i()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/bxu;->W:Ljava/util/List;

    .line 453
    iget-object v0, p0, Lo/bxu;->X:[Ljava/lang/String;

    iget-object v1, p0, Lo/bxu;->T:Ljava/util/Calendar;

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    iput-object v0, p0, Lo/bxu;->O:Ljava/lang/String;

    .line 454
    iget-object v0, p0, Lo/bxu;->aa:Lo/bxv;

    invoke-virtual {v0}, Lo/bxv;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/bxu;->H:I

    .line 455
    iget v0, p0, Lo/bxu;->H:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/bxu;->D:Z

    .line 456
    invoke-direct {p0}, Lo/bxu;->w()V

    .line 457
    return-void
.end method

.method public static c(Z)V
    .locals 0

    .line 139
    sput-boolean p0, Lo/bxu;->c:Z

    .line 140
    return-void
.end method

.method private d(Ljava/lang/StringBuilder;ILjava/lang/String;)I
    .locals 3

    .line 801
    if-eqz p3, :cond_0

    .line 802
    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 803
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, p2

    invoke-static {v1, v2}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 804
    add-int/lit8 p2, p2, 0x1

    .line 806
    :cond_0
    return p2
.end method

.method static synthetic d(Lo/bxu;I)Lcom/huawei/health/suggestion/model/WorkoutRecord;
    .locals 1

    .line 62
    invoke-direct {p0, p1}, Lo/bxu;->c(I)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v0

    return-object v0
.end method

.method private d(I)V
    .locals 4

    .line 275
    iget v0, p0, Lo/bxu;->R:I

    iget-object v1, p0, Lo/bxu;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getPaddingTop()I

    move-result v1

    sub-int v3, v0, v1

    .line 276
    iget-object v0, p0, Lo/bxu;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 277
    iget-object v0, p0, Lo/bxu;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 278
    iget-object v0, p0, Lo/bxu;->r:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 279
    iget-object v0, p0, Lo/bxu;->q:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 280
    iget-object v0, p0, Lo/bxu;->f:Lo/efy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 281
    iget-object v0, p0, Lo/bxu;->f:Lo/efy;

    invoke-virtual {v0}, Lo/efy;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-float v1, v3

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 282
    iget-object v0, p0, Lo/bxu;->x:Lo/byt;

    invoke-virtual {v0}, Lo/byt;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-float v1, v3

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 283
    iget-object v0, p0, Lo/bxu;->n:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-float v1, v3

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 284
    iget-object v0, p0, Lo/bxu;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 285
    iget-object v0, p0, Lo/bxu;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-float v1, v3

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 287
    :cond_0
    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lo/byr;->e(J)V

    .line 288
    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 4

    .line 381
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_run_inflate_show_workout_normal:I

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    .line 383
    new-instance v0, Lo/byr;

    invoke-direct {v0, p1}, Lo/byr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bxu;->m:Lo/byr;

    .line 384
    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    iget v1, p0, Lo/bxu;->R:I

    invoke-virtual {v0, v1}, Lo/byr;->setFiexdHeight(I)V

    .line 385
    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    iget-object v1, p0, Lo/bxu;->p:Landroid/view/View;

    invoke-virtual {v0, v1}, Lo/byr;->setView(Landroid/view/View;)V

    .line 386
    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    invoke-virtual {v0, p0}, Lo/byr;->setTag(Ljava/lang/Object;)V

    .line 387
    return-void
.end method

.method public static d()Z
    .locals 1

    .line 135
    sget-boolean v0, Lo/bxu;->c:Z

    return v0
.end method

.method static synthetic e(Lo/bxu;)I
    .locals 1

    .line 62
    iget v0, p0, Lo/bxu;->H:I

    return v0
.end method

.method static synthetic e(Lo/bxu;I)V
    .locals 0

    .line 62
    invoke-direct {p0, p1}, Lo/bxu;->a(I)V

    return-void
.end method

.method private e(I)Z
    .locals 3

    .line 476
    iget-object v0, p0, Lo/bxu;->V:Lo/bxt;

    invoke-virtual {v0}, Lo/bxt;->e()Ljava/util/List;

    move-result-object v2

    .line 477
    if-nez v2, :cond_1

    .line 478
    iget v0, p0, Lo/bxu;->S:I

    if-ge v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 481
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bxv;

    invoke-virtual {v0}, Lo/bxv;->a()I

    move-result v0

    if-ge v0, p1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private e(Z)Z
    .locals 3

    .line 738
    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    invoke-virtual {v0}, Lo/byr;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v2, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 739
    if-eqz p1, :cond_0

    const-string v0, "CN"

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "en"

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 740
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 742
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private f()V
    .locals 2

    .line 247
    const/16 v1, 0x12c

    .line 248
    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    invoke-virtual {v0}, Lo/byr;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 249
    invoke-direct {p0, v1}, Lo/bxu;->a(I)V

    goto :goto_0

    .line 251
    :cond_0
    invoke-direct {p0, v1}, Lo/bxu;->d(I)V

    .line 253
    :goto_0
    return-void
.end method

.method private g()V
    .locals 1

    .line 188
    const/4 v0, 0x1

    sput-boolean v0, Lo/bxu;->c:Z

    .line 191
    iget v0, p0, Lo/bxu;->Q:I

    if-eqz v0, :cond_0

    .line 192
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->i()V

    .line 193
    invoke-direct {p0}, Lo/bxu;->n()V

    goto :goto_0

    .line 195
    :cond_0
    iget-object v0, p0, Lo/bxu;->V:Lo/bxt;

    invoke-virtual {v0}, Lo/bxt;->b()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    invoke-static {v0}, Lo/bsv;->a(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 196
    invoke-direct {p0}, Lo/bxu;->l()V

    .line 198
    :goto_0
    return-void
.end method

.method private h()V
    .locals 3

    .line 204
    iget-object v0, p0, Lo/bxu;->W:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bxu;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 205
    iget v0, p0, Lo/bxu;->Q:I

    if-nez v0, :cond_0

    .line 207
    iget-object v0, p0, Lo/bxu;->W:Ljava/util/List;

    iget-object v1, p0, Lo/bxu;->W:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {p0, v0}, Lo/bxu;->a(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    goto :goto_0

    .line 210
    :cond_0
    iget-object v0, p0, Lo/bxu;->W:Ljava/util/List;

    iget-object v1, p0, Lo/bxu;->W:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {p0, v0}, Lo/bxu;->b(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 213
    :cond_1
    :goto_0
    return-void
.end method

.method private i()V
    .locals 5

    .line 216
    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    invoke-virtual {v0}, Lo/byr;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    iget v0, p0, Lo/bxu;->S:I

    sput v0, Lo/bxu;->d:I

    goto :goto_0

    .line 219
    :cond_0
    sget v0, Lo/bxu;->d:I

    iget v1, p0, Lo/bxu;->S:I

    if-ne v0, v1, :cond_1

    .line 220
    const/4 v0, -0x1

    sput v0, Lo/bxu;->d:I

    .line 224
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    invoke-virtual {v0}, Lo/byr;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 225
    invoke-direct {p0}, Lo/bxu;->k()Ljava/util/List;

    move-result-object v2

    .line 226
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bxu;

    .line 227
    iget-object v0, v4, Lo/bxu;->m:Lo/byr;

    invoke-virtual {v0}, Lo/byr;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {v4}, Lo/bxu;->q()Z

    move-result v0

    if-nez v0, :cond_2

    .line 228
    const/16 v0, 0x12c

    invoke-direct {v4, v0}, Lo/bxu;->d(I)V

    .line 230
    :cond_2
    goto :goto_1

    .line 232
    :cond_3
    return-void
.end method

.method private j()I
    .locals 6

    .line 823
    const/4 v4, 0x0

    .line 825
    :try_start_0
    iget-object v0, p0, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popExtendParams()Ljava/lang/String;

    move-result-object v5

    .line 826
    if-eqz v5, :cond_0

    .line 827
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "repeats"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 831
    :cond_0
    goto :goto_0

    .line 829
    :catch_0
    move-exception v5

    .line 830
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 832
    :goto_0
    return v4
.end method

.method private k()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/bxu;>;"
        }
    .end annotation

    .line 235
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 236
    iget-object v0, p0, Lo/bxu;->z:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getChildCount()I

    move-result v2

    .line 237
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 238
    iget-object v0, p0, Lo/bxu;->z:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v4

    .line 239
    instance-of v0, v4, Lo/bxu;

    if-eqz v0, :cond_0

    .line 240
    move-object v0, v4

    check-cast v0, Lo/bxu;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 237
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 243
    :cond_1
    return-object v1
.end method

.method private l()V
    .locals 5

    .line 294
    iget v0, p0, Lo/bxu;->F:I

    invoke-direct {p0, v0}, Lo/bxu;->c(I)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v3

    .line 295
    iget-object v0, p0, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-static {v0}, Lo/bsu;->c(Lcom/huawei/health/suggestion/model/PlanWorkout;)Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v4

    .line 296
    invoke-static {}, Lo/bxb;->b()Lo/bxb;

    move-result-object v0

    iget-object v1, p0, Lo/bxu;->P:Ljava/lang/String;

    iget-object v2, p0, Lo/bxu;->a:Landroid/content/Context;

    invoke-virtual {v0, v4, v1, v3, v2}, Lo/bxb;->b(Lcom/huawei/health/suggestion/model/RunWorkout;Ljava/lang/String;Lcom/huawei/health/suggestion/model/WorkoutRecord;Landroid/content/Context;)V

    .line 297
    return-void
.end method

.method private m()V
    .locals 1

    .line 486
    iget-object v0, p0, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    if-eqz v0, :cond_0

    .line 487
    invoke-direct {p0}, Lo/bxu;->u()V

    .line 488
    invoke-direct {p0}, Lo/bxu;->t()V

    .line 489
    invoke-direct {p0}, Lo/bxu;->x()V

    .line 490
    invoke-direct {p0}, Lo/bxu;->s()V

    .line 491
    invoke-direct {p0}, Lo/bxu;->v()V

    .line 493
    :cond_0
    return-void
.end method

.method private n()V
    .locals 8

    .line 303
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startFitTraining mWorkoutOrder = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/bxu;->F:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startFitTraining mWorkoutCount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/bxu;->H:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startFitTraining mDayWorkout = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bxu;->aa:Lo/bxv;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    iget v4, p0, Lo/bxu;->F:I

    .line 308
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 309
    :goto_0
    add-int/lit8 v0, v4, -0x1

    iget v1, p0, Lo/bxu;->H:I

    if-ge v0, v1, :cond_2

    .line 310
    iget-object v0, p0, Lo/bxu;->aa:Lo/bxv;

    invoke-virtual {v0}, Lo/bxv;->k()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, v4}, Lo/bxu;->a(Ljava/util/List;I)Lcom/huawei/health/suggestion/model/PlanWorkout;

    move-result-object v6

    .line 312
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startFitTraining workout = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    if-eqz v6, :cond_1

    .line 315
    invoke-direct {p0, v4}, Lo/bxu;->c(I)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v7

    .line 316
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startFitTraining record = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    if-nez v7, :cond_0

    .line 318
    new-instance v7, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 319
    iget-object v0, p0, Lo/bxu;->P:Ljava/lang/String;

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->savePlanId(Ljava/lang/String;)V

    .line 320
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWorkoutId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 321
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 322
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->getSinglesCount()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutOrder(I)V

    .line 323
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutDate(Ljava/lang/String;)V

    .line 324
    iget-object v0, p0, Lo/bxu;->T:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 325
    iget-object v0, p0, Lo/bxu;->V:Lo/bxt;

    invoke-virtual {v0}, Lo/bxt;->d()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->acquireOrder()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWeekNum(I)V

    .line 327
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 328
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 331
    goto/16 :goto_0

    .line 333
    :cond_2
    new-instance v6, Landroid/content/Intent;

    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    invoke-virtual {v0}, Lo/byr;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 334
    const-string v0, "workoutrecord"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 335
    const-string v0, "ISPLANFIT"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 336
    iget-object v0, p0, Lo/bxu;->a:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 337
    iget-object v0, p0, Lo/bxu;->V:Lo/bxt;

    invoke-virtual {v0}, Lo/bxt;->b()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bzm;->c(Ljava/lang/String;)V

    .line 338
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startFitTraining workoutRecords = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    return-void
.end method

.method private o()V
    .locals 2

    .line 413
    iget-object v0, p0, Lo/bxu;->n:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 414
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 415
    iget-object v0, p0, Lo/bxu;->g:Lo/efy;

    invoke-virtual {v0, p0}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 416
    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    new-instance v1, Lo/bxu$4;

    invoke-direct {v1, p0}, Lo/bxu$4;-><init>(Lo/bxu;)V

    invoke-virtual {v0, v1}, Lo/byr;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 431
    return-void
.end method

.method private p()V
    .locals 3

    .line 390
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_txt_progress:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxu;->g:Lo/efy;

    .line 391
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_txt_day:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxu;->k:Lo/efy;

    .line 392
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_txt_week:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxu;->h:Lo/efy;

    .line 393
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_txt_workout_phrase:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxu;->i:Lo/efy;

    .line 394
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_txt_workout_desc:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxu;->f:Lo/efy;

    .line 395
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_iv_arrow:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bxu;->o:Landroid/widget/ImageView;

    .line 396
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_btn_go:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/bxu;->n:Landroid/widget/Button;

    .line 397
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_divider:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bxu;->l:Landroid/view/View;

    .line 398
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_ll_date:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bxu;->u:Landroid/widget/LinearLayout;

    .line 399
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_ll_date1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bxu;->r:Landroid/widget/LinearLayout;

    .line 400
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_restday_interval:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bxu;->q:Landroid/view/View;

    .line 401
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_txt_week1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxu;->s:Lo/efy;

    .line 402
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_txt_day1:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxu;->t:Lo/efy;

    .line 403
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_lv_workourts:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byt;

    iput-object v0, p0, Lo/bxu;->x:Lo/byt;

    .line 404
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->graphicchartview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byp;

    iput-object v0, p0, Lo/bxu;->w:Lo/byp;

    .line 405
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->ll_part:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bxu;->v:Landroid/widget/LinearLayout;

    .line 407
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_run_chart:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bxu;->y:Landroid/widget/LinearLayout;

    .line 409
    iget-object v0, p0, Lo/bxu;->x:Lo/byt;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lo/bxu;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lo/byt;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 410
    return-void
.end method

.method private q()Z
    .locals 2

    .line 598
    iget-boolean v0, p0, Lo/bxu;->I:Z

    if-eqz v0, :cond_1

    sget v0, Lo/bxu;->d:I

    iget v1, p0, Lo/bxu;->S:I

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Lo/bxu;->A:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private r()V
    .locals 24

    .line 496
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 497
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-static {v0}, Lo/bsu;->c(Lcom/huawei/health/suggestion/model/PlanWorkout;)Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v8

    .line 498
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Name:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--descroption:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 499
    const/4 v9, 0x0

    .line 500
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWarmup()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v10

    .line 501
    const/4 v11, 0x0

    .line 502
    const/4 v0, 0x0

    if-eq v0, v10, :cond_0

    .line 503
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    div-float v12, v0, v1

    .line 504
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v13

    .line 505
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v14

    .line 506
    new-instance v11, Lcom/huawei/health/suggestion/model/RunDataResult;

    int-to-float v0, v14

    invoke-direct {v11, v12, v13, v0}, Lcom/huawei/health/suggestion/model/RunDataResult;-><init>(FIF)V

    .line 507
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 508
    add-float/2addr v9, v12

    .line 509
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "warmupDuration:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-warmupMix:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-warmupMax:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 513
    :cond_0
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getRest()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v12

    .line 514
    const/4 v13, 0x0

    .line 515
    const/4 v14, 0x0

    .line 516
    const/4 v0, 0x0

    if-eq v0, v12, :cond_1

    .line 517
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    div-float v14, v0, v1

    .line 518
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v15

    .line 519
    invoke-virtual {v12}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v16

    .line 520
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "restDuration:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-restMix:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-restMax:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    new-instance v13, Lcom/huawei/health/suggestion/model/RunDataResult;

    move/from16 v0, v16

    int-to-float v0, v0

    invoke-direct {v13, v14, v15, v0}, Lcom/huawei/health/suggestion/model/RunDataResult;-><init>(FIF)V

    .line 525
    :cond_1
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWork()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v15

    .line 526
    const/16 v16, 0x0

    .line 527
    const/16 v17, 0x0

    .line 528
    const/4 v0, 0x0

    if-eq v0, v15, :cond_2

    .line 529
    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    div-float v17, v0, v1

    .line 530
    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v18

    .line 531
    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v19

    .line 532
    new-instance v0, Lcom/huawei/health/suggestion/model/RunDataResult;

    move/from16 v1, v17

    move/from16 v2, v18

    move/from16 v3, v19

    int-to-float v3, v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/suggestion/model/RunDataResult;-><init>(FIF)V

    move-object/from16 v16, v0

    .line 533
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "workDuration:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-workMix:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v18

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-workMax:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v19

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    :cond_2
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getRepeats()I

    move-result v18

    .line 538
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "repeats:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v18

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    if-nez v18, :cond_3

    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_3

    .line 540
    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 541
    add-float v9, v9, v17

    .line 543
    :cond_3
    const/16 v19, 0x0

    :goto_0
    move/from16 v0, v19

    move/from16 v1, v18

    if-ge v0, v1, :cond_8

    .line 544
    const/4 v0, 0x0

    if-eq v0, v13, :cond_6

    .line 545
    if-nez v19, :cond_4

    const/4 v0, 0x0

    if-eq v0, v11, :cond_4

    .line 546
    new-instance v0, Lcom/huawei/health/suggestion/model/RunDataResult;

    invoke-virtual {v13}, Lcom/huawei/health/suggestion/model/RunDataResult;->acquartDuration()F

    move-result v1

    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/RunDataResult;->acquartHeatrRateMin()I

    move-result v2

    int-to-float v3, v2

    const/16 v2, 0x3c

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/suggestion/model/RunDataResult;-><init>(FIF)V

    move-object/from16 v20, v0

    .line 547
    move-object/from16 v0, v20

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 548
    goto :goto_1

    :cond_4
    if-lez v19, :cond_5

    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_5

    .line 549
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/RunDataResult;->acquartHeatrRateMin()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v13, v0}, Lcom/huawei/health/suggestion/model/RunDataResult;->saveHeartRateMax(F)V

    .line 550
    const/16 v0, 0x3c

    invoke-virtual {v13, v0}, Lcom/huawei/health/suggestion/model/RunDataResult;->savetHeartRateMin(I)V

    .line 551
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 553
    :cond_5
    :goto_1
    add-float/2addr v9, v14

    .line 555
    :cond_6
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_7

    .line 556
    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 557
    add-float v9, v9, v17

    .line 543
    :cond_7
    add-int/lit8 v19, v19, 0x1

    goto :goto_0

    .line 563
    :cond_8
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/RunWorkout;->getCooldown()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v19

    .line 565
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_a

    .line 566
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    div-float v20, v0, v1

    .line 567
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v20, v0

    if-lez v0, :cond_9

    if-eqz v16, :cond_9

    .line 568
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v20, v20, v0

    .line 569
    new-instance v0, Lcom/huawei/health/suggestion/model/RunDataResult;

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/health/suggestion/model/RunDataResult;->acquartHeatrRateMin()I

    move-result v1

    int-to-float v3, v1

    const/high16 v1, 0x3f800000    # 1.0f

    const/16 v2, 0x3c

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/suggestion/model/RunDataResult;-><init>(FIF)V

    move-object/from16 v21, v0

    .line 570
    move-object/from16 v0, v21

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 571
    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr v9, v0

    .line 573
    :cond_9
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v21

    .line 574
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v22

    .line 575
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cooldownDuration:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-cooldownMix:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v21

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-cooldownMax:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v22

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    new-instance v0, Lcom/huawei/health/suggestion/model/RunDataResult;

    move/from16 v1, v20

    move/from16 v2, v21

    move/from16 v3, v22

    int-to-float v3, v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/suggestion/model/RunDataResult;-><init>(FIF)V

    move-object/from16 v23, v0

    .line 578
    move-object/from16 v0, v23

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 579
    add-float v9, v9, v20

    .line 582
    :cond_a
    const/high16 v0, 0x40a00000    # 5.0f

    rem-float v20, v9, v0

    .line 583
    sub-float v0, v9, v20

    const/4 v1, 0x0

    cmpl-float v1, v20, v1

    if-lez v1, :cond_b

    const/4 v1, 0x5

    goto :goto_2

    :cond_b
    const/4 v1, 0x0

    :goto_2
    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40a00000    # 5.0f

    div-float/2addr v0, v1

    float-to-int v1, v0

    move/from16 v21, v1

    .line 584
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "allDuration:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-average:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v21

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    new-instance v22, Ljava/util/ArrayList;

    invoke-direct/range {v22 .. v22}, Ljava/util/ArrayList;-><init>()V

    .line 586
    const-string v0, "0"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 587
    mul-int/lit8 v0, v21, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 588
    mul-int/lit8 v0, v21, 0x2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 589
    mul-int/lit8 v0, v21, 0x3

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 590
    mul-int/lit8 v0, v21, 0x4

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 591
    mul-int/lit8 v0, v21, 0x5

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 592
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bxu;->w:Lo/byp;

    move-object v1, v7

    move-object/from16 v2, v22

    mul-int/lit8 v5, v21, 0x5

    const/16 v3, 0xb4

    const/16 v4, 0x28

    const/4 v6, 0x5

    invoke-virtual/range {v0 .. v6}, Lo/byp;->setHorizontalRectF(Ljava/util/ArrayList;Ljava/util/ArrayList;IIII)V

    .line 595
    return-void
.end method

.method private s()V
    .locals 2

    .line 672
    iget-object v0, p0, Lo/bxu;->x:Lo/byt;

    iget-object v1, p0, Lo/bxu;->e:Landroid/support/v7/widget/RecyclerView$Adapter;

    invoke-virtual {v0, v1}, Lo/byt;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 673
    return-void
.end method

.method private t()V
    .locals 6

    .line 611
    iget-object v0, p0, Lo/bxu;->k:Lo/efy;

    invoke-direct {p0}, Lo/bxu;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 612
    iget-object v0, p0, Lo/bxu;->h:Lo/efy;

    iget-object v1, p0, Lo/bxu;->O:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 615
    iget-boolean v0, p0, Lo/bxu;->j:Z

    if-eqz v0, :cond_1

    .line 616
    iget-object v0, p0, Lo/bxu;->V:Lo/bxt;

    invoke-virtual {v0}, Lo/bxt;->e()Ljava/util/List;

    move-result-object v4

    .line 617
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 618
    const/4 v0, 0x1

    if-le v5, v0, :cond_0

    .line 619
    invoke-direct {p0, v4, v5}, Lo/bxu;->b(Ljava/util/List;I)V

    goto :goto_0

    .line 621
    :cond_0
    iget-object v0, p0, Lo/bxu;->r:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 622
    iget-object v0, p0, Lo/bxu;->q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 625
    :goto_0
    iget-object v0, p0, Lo/bxu;->y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 626
    goto :goto_1

    .line 627
    :cond_1
    iget-object v0, p0, Lo/bxu;->r:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 628
    iget-object v0, p0, Lo/bxu;->q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 630
    iget v0, p0, Lo/bxu;->Q:I

    if-nez v0, :cond_2

    .line 631
    iget-object v0, p0, Lo/bxu;->y:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 632
    invoke-direct {p0}, Lo/bxu;->r()V

    goto :goto_1

    .line 634
    :cond_2
    iget-object v0, p0, Lo/bxu;->y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 639
    :goto_1
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshTextValue mTxtWorkoutDesc"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 640
    iget v0, p0, Lo/bxu;->Q:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 641
    iget-object v0, p0, Lo/bxu;->i:Lo/efy;

    iget-object v1, p0, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDayTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 642
    iget-object v0, p0, Lo/bxu;->f:Lo/efy;

    iget-object v1, p0, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDayDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 644
    :cond_3
    iget-object v0, p0, Lo/bxu;->i:Lo/efy;

    iget-object v1, p0, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 645
    iget-object v0, p0, Lo/bxu;->f:Lo/efy;

    invoke-direct {p0}, Lo/bxu;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 647
    :goto_2
    iget-object v0, p0, Lo/bxu;->g:Lo/efy;

    invoke-direct {p0}, Lo/bxu;->C()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 648
    iget-object v0, p0, Lo/bxu;->f:Lo/efy;

    iget-object v1, p0, Lo/bxu;->f:Lo/efy;

    invoke-virtual {v1}, Lo/efy;->getLineCount()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/efy;->setLines(I)V

    .line 649
    iget-object v0, p0, Lo/bxu;->f:Lo/efy;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 650
    return-void
.end method

.method private u()V
    .locals 2

    .line 602
    iget-object v0, p0, Lo/bxu;->h:Lo/efy;

    iget v1, p0, Lo/bxu;->G:I

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 603
    iget-object v0, p0, Lo/bxu;->k:Lo/efy;

    iget v1, p0, Lo/bxu;->M:I

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 604
    iget-object v0, p0, Lo/bxu;->s:Lo/efy;

    iget v1, p0, Lo/bxu;->G:I

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 605
    iget-object v0, p0, Lo/bxu;->t:Lo/efy;

    iget v1, p0, Lo/bxu;->M:I

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 606
    iget-object v0, p0, Lo/bxu;->q:Landroid/view/View;

    iget v1, p0, Lo/bxu;->M:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 607
    iget-object v0, p0, Lo/bxu;->i:Lo/efy;

    iget v1, p0, Lo/bxu;->E:I

    invoke-virtual {v0, v1}, Lo/efy;->setTextColor(I)V

    .line 608
    return-void
.end method

.method private v()V
    .locals 4

    .line 722
    invoke-direct {p0}, Lo/bxu;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 723
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNeedOpen"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 724
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/bxu;->a(I)V

    goto :goto_0

    .line 726
    :cond_0
    const-string v0, "Suggestion_ShowPlanItemWorkoutHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 727
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/bxu;->d(I)V

    .line 729
    :goto_0
    return-void
.end method

.method private w()V
    .locals 1

    .line 747
    iget-boolean v0, p0, Lo/bxu;->C:Z

    if-eqz v0, :cond_0

    .line 748
    iget v0, p0, Lo/bxu;->K:I

    iput v0, p0, Lo/bxu;->G:I

    .line 749
    iget v0, p0, Lo/bxu;->K:I

    iput v0, p0, Lo/bxu;->E:I

    .line 750
    iget v0, p0, Lo/bxu;->K:I

    iput v0, p0, Lo/bxu;->M:I

    .line 751
    iget v0, p0, Lo/bxu;->K:I

    iput v0, p0, Lo/bxu;->N:I

    goto :goto_0

    .line 752
    :cond_0
    iget-boolean v0, p0, Lo/bxu;->j:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lo/bxu;->A:Z

    if-nez v0, :cond_1

    .line 753
    iget v0, p0, Lo/bxu;->L:I

    iput v0, p0, Lo/bxu;->G:I

    .line 754
    iget v0, p0, Lo/bxu;->L:I

    iput v0, p0, Lo/bxu;->E:I

    .line 755
    iget v0, p0, Lo/bxu;->L:I

    iput v0, p0, Lo/bxu;->M:I

    .line 756
    iget v0, p0, Lo/bxu;->L:I

    iput v0, p0, Lo/bxu;->N:I

    goto :goto_0

    .line 759
    :cond_1
    iget v0, p0, Lo/bxu;->J:I

    iput v0, p0, Lo/bxu;->G:I

    .line 760
    iget v0, p0, Lo/bxu;->J:I

    iput v0, p0, Lo/bxu;->E:I

    .line 761
    iget v0, p0, Lo/bxu;->J:I

    iput v0, p0, Lo/bxu;->M:I

    .line 762
    iget v0, p0, Lo/bxu;->J:I

    iput v0, p0, Lo/bxu;->N:I

    .line 764
    :goto_0
    return-void
.end method

.method private x()V
    .locals 4

    .line 677
    iget-object v0, p0, Lo/bxu;->W:Ljava/util/List;

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 679
    :goto_0
    iget-boolean v0, p0, Lo/bxu;->C:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lo/bxu;->A:Z

    if-eqz v0, :cond_2

    :cond_1
    iget-boolean v0, p0, Lo/bxu;->j:Z

    if-nez v0, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 681
    :goto_1
    iget-boolean v0, p0, Lo/bxu;->I:Z

    if-eqz v0, :cond_4

    .line 682
    if-eqz v2, :cond_3

    .line 683
    iget-object v0, p0, Lo/bxu;->o:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 684
    iget-object v0, p0, Lo/bxu;->g:Lo/efy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    goto :goto_2

    .line 686
    :cond_3
    iget-object v0, p0, Lo/bxu;->o:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 687
    iget-object v0, p0, Lo/bxu;->g:Lo/efy;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    goto :goto_2

    .line 690
    :cond_4
    iget-object v0, p0, Lo/bxu;->o:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 691
    iget-object v0, p0, Lo/bxu;->g:Lo/efy;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 694
    :goto_2
    if-eqz v3, :cond_5

    .line 695
    iget-object v0, p0, Lo/bxu;->n:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_3

    .line 697
    :cond_5
    iget-object v0, p0, Lo/bxu;->n:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 700
    :goto_3
    iget-boolean v0, p0, Lo/bxu;->B:Z

    if-eqz v0, :cond_6

    .line 701
    iget-object v0, p0, Lo/bxu;->l:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    .line 703
    :cond_6
    iget-object v0, p0, Lo/bxu;->l:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 706
    :goto_4
    iget v0, p0, Lo/bxu;->Q:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_8

    .line 707
    iget v0, p0, Lo/bxu;->H:I

    if-lez v0, :cond_7

    iget-boolean v0, p0, Lo/bxu;->j:Z

    if-nez v0, :cond_7

    .line 708
    iget-object v0, p0, Lo/bxu;->x:Lo/byt;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byt;->setVisibility(I)V

    goto :goto_5

    .line 710
    :cond_7
    iget-object v0, p0, Lo/bxu;->x:Lo/byt;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/byt;->setVisibility(I)V

    goto :goto_5

    .line 713
    :cond_8
    iget-boolean v0, p0, Lo/bxu;->D:Z

    if-eqz v0, :cond_9

    .line 714
    iget-object v0, p0, Lo/bxu;->x:Lo/byt;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byt;->setVisibility(I)V

    goto :goto_5

    .line 716
    :cond_9
    iget-object v0, p0, Lo/bxu;->x:Lo/byt;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/byt;->setVisibility(I)V

    .line 719
    :goto_5
    return-void
.end method

.method private y()Ljava/lang/String;
    .locals 11

    .line 783
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 784
    invoke-direct {p0}, Lo/bxu;->j()I

    move-result v8

    .line 785
    const/4 v0, 0x1

    if-le v8, v0, :cond_0

    .line 786
    iget-object v0, p0, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-static {v0}, Lo/bsu;->c(Lcom/huawei/health/suggestion/model/PlanWorkout;)Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v9

    .line 787
    const/4 v10, 0x1

    .line 788
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWarmup()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_run_warmup_message:I

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->sug_run_warmup_message_min:I

    invoke-direct {p0, v0, v1, v2}, Lo/bxu;->a(Lcom/huawei/health/suggestion/model/ExerciseProfile;II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v7, v10, v0}, Lo/bxu;->d(Ljava/lang/StringBuilder;ILjava/lang/String;)I

    move-result v10

    .line 790
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_workout_stage_repeats:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    int-to-double v2, v8

    .line 791
    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v8, v1}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 790
    invoke-direct {p0, v7, v10, v0}, Lo/bxu;->d(Ljava/lang/StringBuilder;ILjava/lang/String;)I

    move-result v10

    .line 792
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/RunWorkout;->getCooldown()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_run_cooldown_message:I

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->sug_run_cooldown_message_min:I

    invoke-direct {p0, v0, v1, v2}, Lo/bxu;->a(Lcom/huawei/health/suggestion/model/ExerciseProfile;II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v7, v10, v0}, Lo/bxu;->d(Ljava/lang/StringBuilder;ILjava/lang/String;)I

    move-result v10

    .line 794
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_workout_stage_count:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    add-int/lit8 v3, v10, -0x1

    int-to-double v3, v3

    .line 795
    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v10, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 794
    const/4 v1, 0x0

    invoke-virtual {v7, v1, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 797
    :cond_0
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private z()Ljava/lang/String;
    .locals 5

    .line 767
    iget-boolean v0, p0, Lo/bxu;->I:Z

    if-nez v0, :cond_0

    .line 768
    const-string v0, ""

    return-object v0

    .line 769
    :cond_0
    iget-boolean v0, p0, Lo/bxu;->D:Z

    if-eqz v0, :cond_1

    .line 771
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_muti_workouts_desc:I

    iget v1, p0, Lo/bxu;->H:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lo/bxu;->H:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 773
    :cond_1
    iget v0, p0, Lo/bxu;->Q:I

    if-eqz v0, :cond_2

    .line 775
    iget-object v0, p0, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDescription()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 777
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lo/bxu;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b(Lo/bxt;I)V
    .locals 0

    .line 154
    invoke-direct {p0, p1, p2}, Lo/bxu;->c(Lo/bxt;I)V

    .line 155
    invoke-direct {p0}, Lo/bxu;->m()V

    .line 156
    return-void
.end method

.method public b()Z
    .locals 2

    .line 176
    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    invoke-virtual {v0}, Lo/byr;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lo/bxu;->S:I

    sget v1, Lo/bxu;->b:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()Lo/byr;
    .locals 1

    .line 172
    iget-object v0, p0, Lo/bxu;->m:Lo/byr;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 160
    iget-object v0, p0, Lo/bxu;->U:Lcom/huawei/health/suggestion/model/PlanWorkout;

    if-eqz v0, :cond_2

    .line 161
    iget-object v0, p0, Lo/bxu;->p:Landroid/view/View;

    if-ne p1, v0, :cond_0

    iget-boolean v0, p0, Lo/bxu;->I:Z

    if-eqz v0, :cond_0

    .line 162
    invoke-direct {p0}, Lo/bxu;->c()V

    goto :goto_0

    .line 163
    :cond_0
    iget-object v0, p0, Lo/bxu;->n:Landroid/widget/Button;

    if-ne p1, v0, :cond_1

    .line 164
    invoke-direct {p0}, Lo/bxu;->g()V

    goto :goto_0

    .line 165
    :cond_1
    iget-object v0, p0, Lo/bxu;->g:Lo/efy;

    if-ne p1, v0, :cond_2

    .line 166
    invoke-direct {p0}, Lo/bxu;->h()V

    .line 169
    :cond_2
    :goto_0
    return-void
.end method
