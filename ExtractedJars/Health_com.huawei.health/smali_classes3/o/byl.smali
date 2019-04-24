.class public Lo/byl;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private c:Lo/efy;

.field private d:Landroid/widget/ImageView;

.field private e:Lo/byk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const-class v0, Lo/byl;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/byl;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 79
    iget-object v0, p0, Lo/byl;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 80
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 83
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    return-void

    .line 86
    :cond_0
    iget-object v0, p0, Lo/byl;->c:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 87
    return-void
.end method

.method public d(F)Lo/byl;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/byl;->e:Lo/byk;

    invoke-virtual {v0, p1}, Lo/byk;->d(F)Lo/byk;

    .line 75
    return-object p0
.end method

.method public getProgressMax()F
    .locals 1

    .line 65
    iget-object v0, p0, Lo/byl;->e:Lo/byk;

    invoke-virtual {v0}, Lo/byk;->getMax()F

    move-result v0

    return v0
.end method

.method protected onFinishInflate()V
    .locals 2

    .line 45
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishInflate()V

    .line 46
    invoke-virtual {p0}, Lo/byl;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 47
    const/16 v0, 0x11

    invoke-virtual {p0, v0}, Lo/byl;->setGravity(I)V

    .line 48
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_coach_brightorvolumeplus:I

    invoke-virtual {v1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 49
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_round_tp:I

    invoke-virtual {p0, v0}, Lo/byl;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byk;

    iput-object v0, p0, Lo/byl;->e:Lo/byk;

    .line 50
    sget v0, Lcom/huawei/health/suggestion/R$id;->iv_center:I

    invoke-virtual {p0, v0}, Lo/byl;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/byl;->d:Landroid/widget/ImageView;

    .line 51
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_setting:I

    invoke-virtual {p0, v0}, Lo/byl;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/byl;->c:Lo/efy;

    .line 53
    return-void
.end method

.method public setProgressMax(F)V
    .locals 1

    .line 56
    iget-object v0, p0, Lo/byl;->e:Lo/byk;

    invoke-virtual {v0, p1}, Lo/byk;->e(F)Lo/byk;

    .line 57
    return-void
.end method
