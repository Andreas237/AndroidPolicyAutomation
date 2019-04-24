.class public Lo/bwr;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Z

.field private d:I

.field private e:I

.field private g:Lo/bwg;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 31
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lo/bwr;->e:I

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 35
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lo/bwr;->e:I

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 39
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lo/bwr;->e:I

    .line 40
    return-void
.end method

.method static synthetic b(Lo/bwr;)I
    .locals 1

    .line 20
    iget v0, p0, Lo/bwr;->d:I

    return v0
.end method

.method private b(Landroid/view/View;F)V
    .locals 3

    .line 172
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 173
    return-void
.end method

.method static synthetic c(Lo/bwr;)Lo/bwg;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/bwr;->g:Lo/bwg;

    return-object v0
.end method

.method private c(Landroid/view/View;F)V
    .locals 3

    .line 145
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lo/bwr$3;

    invoke-direct {v1, p0}, Lo/bwr$3;-><init>(Lo/bwr;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 168
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 169
    return-void
.end method

.method private c(Landroid/view/View;IIF)V
    .locals 8

    .line 98
    instance-of v0, p1, Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 99
    iget-object v0, p0, Lo/bwr;->g:Lo/bwg;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 100
    move-object v4, p1

    check-cast v4, Landroid/widget/LinearLayout;

    .line 101
    invoke-virtual {v4}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v5

    .line 102
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    .line 103
    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 104
    const-string v0, "ToolsLayout"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    instance-of v0, v7, Lo/bwg;

    if-eqz v0, :cond_0

    .line 106
    move-object v0, v7

    check-cast v0, Lo/bwg;

    iput-object v0, p0, Lo/bwr;->g:Lo/bwg;

    .line 107
    iget-object v0, p0, Lo/bwr;->g:Lo/bwg;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwg;->setVisibility(I)V

    .line 110
    :cond_0
    instance-of v0, v7, Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 111
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p0, Lo/bwr;->e:I

    .line 102
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 116
    :cond_2
    iget v0, p0, Lo/bwr;->e:I

    add-int/2addr p2, v0

    .line 117
    const-string v0, "ToolsLayout"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "childAt:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    if-eqz p3, :cond_3

    .line 120
    iget v0, p0, Lo/bwr;->b:I

    sub-int/2addr v0, p2

    int-to-float p4, v0

    .line 122
    :cond_3
    invoke-direct {p0, p1, p4}, Lo/bwr;->c(Landroid/view/View;F)V

    .line 123
    return-void
.end method

.method static synthetic e(Lo/bwr;)Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Lo/bwr;->c:Z

    return v0
.end method


# virtual methods
.method public getVisibility()I
    .locals 1

    .line 127
    iget v0, p0, Lo/bwr;->d:I

    return v0
.end method

.method protected onFinishInflate()V
    .locals 0

    .line 51
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishInflate()V

    .line 52
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 44
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;->onSizeChanged(IIII)V

    .line 45
    iput p1, p0, Lo/bwr;->a:I

    .line 46
    iput p2, p0, Lo/bwr;->b:I

    .line 47
    return-void
.end method

.method public setIsShowBottomProgress(Z)V
    .locals 4

    .line 131
    iget-boolean v0, p0, Lo/bwr;->c:Z

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lo/bwr;->g:Lo/bwg;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 132
    :cond_0
    return-void

    .line 134
    :cond_1
    const-string v0, "ToolsLayout"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShowBottomProgress:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    iput-boolean p1, p0, Lo/bwr;->c:Z

    .line 136
    if-eqz p1, :cond_2

    iget v0, p0, Lo/bwr;->d:I

    if-eqz v0, :cond_2

    .line 137
    iget-object v0, p0, Lo/bwr;->g:Lo/bwg;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwg;->setVisibility(I)V

    goto :goto_0

    .line 139
    :cond_2
    iget-object v0, p0, Lo/bwr;->g:Lo/bwg;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwg;->setVisibility(I)V

    .line 142
    :goto_0
    return-void
.end method

.method public setVisibility(I)V
    .locals 11

    .line 57
    iput p1, p0, Lo/bwr;->d:I

    .line 58
    invoke-virtual {p0}, Lo/bwr;->getChildCount()I

    move-result v3

    .line 59
    if-lez v3, :cond_8

    .line 60
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p0}, Lo/bwr;->getChildCount()I

    move-result v0

    if-ge v4, v0, :cond_8

    .line 61
    invoke-virtual {p0, v4}, Lo/bwr;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 62
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v6

    .line 63
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v7

    .line 64
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v8

    .line 65
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v9

    .line 66
    const/4 v10, 0x0

    .line 67
    if-nez p1, :cond_0

    .line 68
    const/4 v10, 0x0

    .line 70
    :cond_0
    instance-of v0, v5, Lo/bwt;

    if-nez v0, :cond_7

    .line 72
    invoke-virtual {p0}, Lo/bwr;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x43080000    # 136.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 73
    if-eqz p1, :cond_1

    .line 74
    neg-int v0, v7

    int-to-float v10, v0

    .line 76
    :cond_1
    invoke-direct {p0, v5, v10}, Lo/bwr;->c(Landroid/view/View;F)V

    goto :goto_1

    .line 77
    :cond_2
    iget v0, p0, Lo/bwr;->b:I

    sub-int/2addr v0, v6

    invoke-virtual {p0}, Lo/bwr;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x43080000    # 136.0f

    invoke-static {v1, v2}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 79
    invoke-direct {p0, v5, v6, p1, v10}, Lo/bwr;->c(Landroid/view/View;IIF)V

    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {p0}, Lo/bwr;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x43080000    # 136.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    if-ge v9, v0, :cond_5

    .line 82
    if-eqz p1, :cond_4

    .line 83
    neg-int v0, v9

    int-to-float v10, v0

    .line 85
    :cond_4
    invoke-direct {p0, v5, v10}, Lo/bwr;->b(Landroid/view/View;F)V

    goto :goto_1

    .line 87
    :cond_5
    if-eqz p1, :cond_6

    .line 88
    iget v0, p0, Lo/bwr;->a:I

    sub-int/2addr v0, v8

    int-to-float v10, v0

    .line 90
    :cond_6
    invoke-direct {p0, v5, v10}, Lo/bwr;->b(Landroid/view/View;F)V

    .line 60
    :cond_7
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 95
    :cond_8
    return-void
.end method
