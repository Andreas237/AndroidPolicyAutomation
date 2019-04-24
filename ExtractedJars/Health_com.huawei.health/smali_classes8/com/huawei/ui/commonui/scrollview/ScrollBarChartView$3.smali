.class Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;


# direct methods
.method constructor <init>(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)V
    .locals 0

    .line 850
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 853
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 854
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 855
    const/4 v0, 0x1

    return v0

    .line 857
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 858
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Landroid/widget/OverScroller;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/OverScroller;->forceFinished(Z)V

    .line 859
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 861
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 862
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->g(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;I)I

    .line 864
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 865
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->a:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 867
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 9

    .line 958
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 959
    const/4 v0, 0x0

    return v0

    .line 961
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 962
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 964
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->k(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    move-result-object v0

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    if-eq v0, v1, :cond_3

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x44960000    # 1200.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_5

    .line 965
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 967
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->k(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 968
    const/4 v6, 0x0

    .line 969
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$2;->d:[I

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->n(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_4

    .line 971
    :sswitch_0
    const/4 v6, 0x1

    .line 973
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 974
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)I

    move-result v7

    goto :goto_2

    .line 976
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)I

    move-result v7

    .line 978
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0, v7}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;I)I

    .line 979
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->l(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;D)D

    .line 980
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->q(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;D)D

    .line 981
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Landroid/widget/OverScroller;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v2, v7

    iget-object v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v3}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->o(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F

    move-result v3

    mul-float/2addr v2, v3

    iget-object v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v3}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F

    move-result v3

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x1f4

    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 982
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 983
    goto/16 :goto_4

    .line 985
    :sswitch_1
    const/4 v6, 0x1

    .line 987
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 988
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)I

    move-result v8

    goto :goto_3

    .line 990
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)I

    move-result v8

    .line 992
    :goto_3
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0, v8}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;I)I

    .line 993
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->l(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;D)D

    .line 994
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->q(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;D)D

    .line 995
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->e(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Landroid/widget/OverScroller;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v2, v8

    iget-object v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v3}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->o(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F

    move-result v3

    mul-float/2addr v2, v3

    iget-object v3, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v3}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F

    move-result v3

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x1f4

    invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 996
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 997
    .line 1001
    :goto_4
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->u(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->t(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->p(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I

    move-result v2

    mul-int/lit8 v2, v2, 0x5

    sub-int/2addr v1, v2

    if-le v0, v1, :cond_8

    .line 1002
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Z)Z

    .line 1003
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->u(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$a;->d()V

    .line 1006
    :cond_8
    return v6

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 3

    .line 873
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 874
    const/4 v0, 0x0

    return v0

    .line 876
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 877
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$2;->d:[I

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->k(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 879
    :pswitch_0
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 880
    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-lez v0, :cond_1

    .line 881
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    goto :goto_0

    .line 883
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    goto :goto_0

    .line 886
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 888
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 891
    :pswitch_1
    const/4 v0, 0x1

    return v0

    .line 893
    :goto_1
    const/4 v0, 0x0

    return v0

    .line 896
    :cond_3
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$2;->d:[I

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->k(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_2

    .line 898
    :pswitch_2
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 899
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Z)Z

    .line 900
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Z)Z

    .line 901
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;I)I

    .line 902
    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-lez v0, :cond_4

    .line 903
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    goto/16 :goto_3

    .line 905
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    goto/16 :goto_3

    .line 908
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 910
    goto/16 :goto_3

    .line 912
    :pswitch_3
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-gez v0, :cond_7

    .line 913
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    goto :goto_3

    .line 917
    :pswitch_4
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-lez v0, :cond_7

    .line 918
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    goto :goto_3

    .line 922
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    .line 923
    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-lez v0, :cond_6

    .line 924
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->d:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    goto :goto_3

    .line 926
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    sget-object v1, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->b:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    .line 932
    :cond_7
    :goto_3
    sget-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$2;->d:[I

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->k(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_5

    .line 935
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_8

    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-gtz v0, :cond_9

    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->i(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->p(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget-object v2, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->o(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F

    move-result v2

    mul-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_b

    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-gez v0, :cond_b

    .line 936
    :cond_9
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 937
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F

    move-result v1

    const/high16 v2, 0x40400000    # 3.0f

    div-float v2, p3, v2

    add-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;F)F

    goto :goto_4

    .line 939
    :cond_a
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F

    move-result v1

    const/high16 v2, 0x40400000    # 3.0f

    div-float v2, p3, v2

    sub-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;F)F

    goto :goto_4

    .line 942
    :cond_b
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->m(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 943
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F

    move-result v1

    add-float/2addr v1, p3

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;F)F

    goto :goto_4

    .line 945
    :cond_c
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iget-object v1, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->h(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)F

    move-result v1

    sub-float/2addr v1, p3

    invoke-static {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;F)F

    .line 948
    :goto_4
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 949
    .line 953
    :goto_5
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->f(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;)Z

    move-result v0

    if-nez v0, :cond_d

    const/4 v0, 0x1

    goto :goto_6

    :cond_d
    const/4 v0, 0x0

    :goto_6
    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1011
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$3;->e:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    invoke-static {v0, p1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->a(Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;Landroid/view/MotionEvent;)V

    .line 1012
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapConfirmed(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
