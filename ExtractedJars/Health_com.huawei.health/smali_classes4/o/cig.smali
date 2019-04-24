.class public Lo/cig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cig$b;
    }
.end annotation


# static fields
.field private static a:[I


# instance fields
.field private b:Landroid/content/Context;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/view/View;

.field e:Lo/cig$b;

.field private f:I

.field private g:Lo/dcy;

.field private h:Landroid/animation/AnimatorSet;

.field private i:Landroid/widget/ImageView;

.field private k:Landroid/widget/TextView;

.field private n:Ljava/lang/String;

.field private o:Lo/cee;

.field private p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 31
    const/4 v0, 0x3

    new-array v0, v0, [I

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_countdown_num1:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_countdown_num2:I

    const/4 v2, 0x1

    aput v1, v0, v2

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_countdown_num3:I

    const/4 v2, 0x2

    aput v1, v0, v2

    sput-object v0, Lo/cig;->a:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 4

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x2

    iput v0, p0, Lo/cig;->f:I

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cig;->e:Lo/cig$b;

    .line 60
    iput-object p1, p0, Lo/cig;->b:Landroid/content/Context;

    .line 61
    iput-object p2, p0, Lo/cig;->d:Landroid/view/View;

    .line 62
    new-instance v0, Lo/dcy;

    invoke-direct {v0}, Lo/dcy;-><init>()V

    iput-object v0, p0, Lo/cig;->g:Lo/dcy;

    .line 63
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cig;->n:Ljava/lang/String;

    .line 64
    new-instance v0, Lo/cee;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/cig;->g:Lo/dcy;

    iget-object v3, p0, Lo/cig;->n:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lo/cee;-><init>(Landroid/content/Context;Lo/dcy;Ljava/lang/String;)V

    iput-object v0, p0, Lo/cig;->o:Lo/cee;

    .line 65
    iget-object v0, p0, Lo/cig;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->S(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/cig;->p:Z

    .line 66
    invoke-direct {p0}, Lo/cig;->d()V

    .line 67
    return-void
.end method

.method static synthetic b(Lo/cig;)I
    .locals 2

    .line 30
    iget v0, p0, Lo/cig;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/cig;->f:I

    return v0
.end method

.method static synthetic c(Lo/cig;)Landroid/widget/ImageView;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/cig;->i:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic c(Lo/cig;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lo/cig;->e(I)V

    return-void
.end method

.method static synthetic d(Lo/cig;)I
    .locals 1

    .line 30
    iget v0, p0, Lo/cig;->f:I

    return v0
.end method

.method private d()V
    .locals 5

    .line 71
    iget-object v0, p0, Lo/cig;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_conut_down_num:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/cig;->c:Landroid/widget/ImageView;

    .line 72
    iget-object v0, p0, Lo/cig;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_conut_down_num_round:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/cig;->i:Landroid/widget/ImageView;

    .line 73
    iget-object v0, p0, Lo/cig;->d:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_conut_down_num_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cig;->k:Landroid/widget/TextView;

    .line 74
    iget-object v0, p0, Lo/cig;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$animator;->track_map_conut_down_num:I

    invoke-static {v0, v1}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object v3

    .line 75
    iget-object v0, p0, Lo/cig;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$animator;->track_map_conut_down_round:I

    invoke-static {v0, v1}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object v4

    .line 76
    iget-boolean v0, p0, Lo/cig;->p:Z

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lo/cig;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 78
    iget-object v0, p0, Lo/cig;->k:Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    goto :goto_0

    .line 80
    :cond_0
    iget-object v0, p0, Lo/cig;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 81
    iget-object v0, p0, Lo/cig;->c:Landroid/widget/ImageView;

    invoke-virtual {v3, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 83
    :goto_0
    iget-object v0, p0, Lo/cig;->i:Landroid/widget/ImageView;

    invoke-virtual {v4, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 84
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lo/cig;->h:Landroid/animation/AnimatorSet;

    .line 85
    iget-object v0, p0, Lo/cig;->h:Landroid/animation/AnimatorSet;

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/animation/Animator;

    const/4 v2, 0x0

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 86
    iget-object v0, p0, Lo/cig;->h:Landroid/animation/AnimatorSet;

    new-instance v1, Lo/cig$5;

    invoke-direct {v1, p0}, Lo/cig$5;-><init>(Lo/cig;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 107
    return-void
.end method

.method private d(I)V
    .locals 8

    .line 137
    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    if-ge p1, v0, :cond_1

    .line 138
    :cond_0
    return-void

    .line 141
    :cond_1
    iget-object v0, p0, Lo/cig;->o:Lo/cee;

    invoke-virtual {v0}, Lo/cee;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lo/cig;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 142
    new-instance v0, Lo/cek;

    move v5, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/cek;-><init>(FFJI)V

    move-object v6, v0

    .line 143
    new-instance v7, Landroid/content/Intent;

    const-string v0, "action_play_voice"

    invoke-direct {v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 144
    const-string v0, "SPEAK_TYPE"

    const/16 v1, 0x14

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 145
    const-string v0, "SPEAK_PARAMETER"

    invoke-virtual {v7, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 146
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v7}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 148
    :cond_2
    return-void
.end method

.method private e(I)V
    .locals 5

    .line 120
    if-gez p1, :cond_1

    .line 121
    iget-object v0, p0, Lo/cig;->e:Lo/cig$b;

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Lo/cig;->e:Lo/cig$b;

    invoke-interface {v0}, Lo/cig$b;->a()V

    .line 124
    :cond_0
    return-void

    .line 126
    :cond_1
    add-int/lit8 v0, p1, 0x1

    invoke-direct {p0, v0}, Lo/cig;->d(I)V

    .line 127
    iget-boolean v0, p0, Lo/cig;->p:Z

    if-eqz v0, :cond_2

    .line 128
    iget-object v0, p0, Lo/cig;->k:Landroid/widget/TextView;

    add-int/lit8 v1, p1, 0x1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 130
    :cond_2
    iget-object v0, p0, Lo/cig;->c:Landroid/widget/ImageView;

    sget-object v1, Lo/cig;->a:[I

    aget v1, v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 132
    :goto_0
    iget-object v0, p0, Lo/cig;->h:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 133
    return-void
.end method


# virtual methods
.method public b(Lo/cig$b;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lo/cig;->e:Lo/cig$b;

    .line 56
    return-void
.end method

.method public e()V
    .locals 4

    .line 110
    iget-object v0, p0, Lo/cig;->d:Landroid/view/View;

    new-instance v1, Lo/cig$2;

    invoke-direct {v1, p0}, Lo/cig$2;-><init>(Lo/cig;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 117
    return-void
.end method
